package pl.opitz.consulting.caseweek.tasks;

import pl.opitz.consulting.caseweek.model.PrimeNumberTaskRequest;
import pl.opitz.consulting.caseweek.model.PrimeNumberTaskResponse;

public class PrimeNumberTask implements Task<PrimeNumberTaskRequest, PrimeNumberTaskResponse> {

    @Override
    public PrimeNumberTaskResponse resolveTask(PrimeNumberTaskRequest request) {
        PrimeNumberTaskResponse response = new PrimeNumberTaskResponse(request.getTask(), isPrime(request.getNumber()));
        return response;
    }

    static Boolean isPrime(int number) {
        if(number < 2)
            return false;
        else {
            for(int i = 2; i < Math.floor(Math.sqrt(number)) + 1; i++){
                if(number % i == 0)
                    return false;
            }
        }
        return true;
    }
}
