package in.Rushikesh.rest;

import java.time.Duration;
import java.util.Date;
import java.util.stream.Stream;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.Rushikesh.bindings.CustomerEvent;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

@RestController
public class CustomerRestController {

	@GetMapping(value = "/event", produces ="application/json")
	public ResponseEntity<Mono<CustomerEvent>> getEvent(){
		CustomerEvent evt = new CustomerEvent("Rushikesh", new Date());
		Mono<CustomerEvent> mono = Mono.just(evt);
		return new ResponseEntity<Mono<CustomerEvent>>(mono, HttpStatus.OK);
	}
	@GetMapping(value = "/events", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public ResponseEntity<Flux<CustomerEvent>> getEvents() {

		// creating binding object with data
		CustomerEvent event = new CustomerEvent("Rushikesh", new Date());

		// creating stream for binding object
		Stream<CustomerEvent> customerStream = Stream.generate(() -> event);

		// create flux object using stream
		Flux<CustomerEvent> cflux = Flux.fromStream(customerStream);

		// setting response interval
		Flux<Long> intervalFlux = Flux.interval(Duration.ofSeconds(5));
		
		// combine interval flux and customer event flux
		Flux<Tuple2<Long, CustomerEvent>> zip = Flux.zip(intervalFlux, cflux);
		
		// Getting Tuple value as T2
		Flux<CustomerEvent> fluxMap = zip.map(Tuple2::getT2);
		
		//sending response
		return new ResponseEntity<>(fluxMap, HttpStatus.OK);
	}
}
