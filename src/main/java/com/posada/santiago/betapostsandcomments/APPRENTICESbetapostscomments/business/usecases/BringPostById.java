package com.posada.santiago.betapostsandcomments.APPRENTICESbetapostscomments.business.usecases;




import com.posada.santiago.betapostsandcomments.APPRENTICESbetapostscomments.application.adapters.repository.MongoViewRepository;
import com.posada.santiago.betapostsandcomments.APPRENTICESbetapostscomments.business.gateways.model.PostViewModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.function.Function;

@Service
@RequiredArgsConstructor
public class BringPostById implements Function<String, Mono<PostViewModel>> {

    public final MongoViewRepository repository;
    @Override
    public Mono<PostViewModel> apply(String s) {
        return this.repository.findByAggregateId(s);
    }
    // finish the implementation of this class using the functional interfaces
}
