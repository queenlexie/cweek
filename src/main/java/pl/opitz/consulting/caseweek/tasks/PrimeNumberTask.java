package pl.opitz.consulting.caseweek.tasks;

import pl.opitz.consulting.caseweek.model.PrimeNumberTaskRequest;
import pl.opitz.consulting.caseweek.model.PrimeNumberTaskResponse;

public class PrimeNumberTask implements Task<PrimeNumberTaskRequest, PrimeNumberTaskResponse> {

    @Override
    public PrimeNumberTaskResponse resolveTask(PrimeNumberTaskRequest request) {
        PrimeNumberTaskResponse response = new PrimeNumberTaskResponse(request.getTask(), isPrimeNumber(request.getNumber()));
        return response;
    }

    private Boolean isPrimeNumber(int num){
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
