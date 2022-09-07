package com.posada.santiago.betapostsandcomments.APPRENTICESbetapostscomments.business.gateways;

import co.com.sofka.domain.generic.DomainEvent;
import com.posada.santiago.betapostsandcomments.APPRENTICESbetapostscomments.business.gateways.model.CommentViewModel;
import com.posada.santiago.betapostsandcomments.APPRENTICESbetapostscomments.business.gateways.model.PostViewModel;

public interface EventBus {
    void publishPost(PostViewModel postViewModel);
    void publishComment(CommentViewModel commentViewModel);

    void publishError(Throwable errorEvent);
}
