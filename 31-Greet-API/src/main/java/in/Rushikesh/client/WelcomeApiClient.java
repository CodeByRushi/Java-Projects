package in.Rushikesh.client;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.cloud.openfeign.FeignClient(name="WELCOME-API")
public interface WelcomeApiClient {

	@GetMapping("/welcome")
	public String invokeWelcomeApi();
}
