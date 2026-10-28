package io.getstream.chat.android.client.internal.state.errorhandler;

import bc3.InterfaceC2994c0;
import io.getstream.chat.android.client.errorhandler.ErrorHandler;
import io.getstream.chat.android.client.errorhandler.factory.ErrorHandlerFactory;
import io.getstream.chat.android.client.internal.state.errorhandler.internal.CreateChannelErrorHandlerImpl;
import io.getstream.chat.android.client.internal.state.errorhandler.internal.DeleteReactionErrorHandlerImpl;
import io.getstream.chat.android.client.internal.state.errorhandler.internal.QueryMembersErrorHandlerImpl;
import io.getstream.chat.android.client.internal.state.errorhandler.internal.SendReactionErrorHandlerImpl;
import io.getstream.chat.android.client.internal.state.plugin.logic.internal.LogicRegistry;
import io.getstream.chat.android.client.persistance.repository.RepositoryFacade;
import io.getstream.chat.android.client.setup.state.ClientState;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/errorhandler/StateErrorHandlerFactory;", "Lio/getstream/chat/android/client/errorhandler/factory/ErrorHandlerFactory;", "Lbc3/c0;", "scope", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "logicRegistry", "Lio/getstream/chat/android/client/setup/state/ClientState;", "clientState", "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;", "repositoryFacade", "<init>", "(Lbc3/c0;Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;)V", "Lio/getstream/chat/android/client/errorhandler/ErrorHandler;", "create", "()Lio/getstream/chat/android/client/errorhandler/ErrorHandler;", "Lbc3/c0;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "Lio/getstream/chat/android/client/setup/state/ClientState;", "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class StateErrorHandlerFactory implements ErrorHandlerFactory {
    private final ClientState clientState;
    private final LogicRegistry logicRegistry;
    private final RepositoryFacade repositoryFacade;
    private final InterfaceC2994c0 scope;

    public StateErrorHandlerFactory(InterfaceC2994c0 scope, LogicRegistry logicRegistry, ClientState clientState, RepositoryFacade repositoryFacade) {
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(logicRegistry, "logicRegistry");
        AbstractC22676k.m65750j(clientState, "clientState");
        AbstractC22676k.m65750j(repositoryFacade, "repositoryFacade");
        this.scope = scope;
        this.logicRegistry = logicRegistry;
        this.clientState = clientState;
        this.repositoryFacade = repositoryFacade;
    }

    @Override // io.getstream.chat.android.client.errorhandler.factory.ErrorHandlerFactory
    public final ErrorHandler create() {
        return new StateErrorHandler(new DeleteReactionErrorHandlerImpl(this.scope, this.logicRegistry, this.clientState), new CreateChannelErrorHandlerImpl(this.scope, this.repositoryFacade, this.clientState), new QueryMembersErrorHandlerImpl(this.scope, this.clientState, this.repositoryFacade), new SendReactionErrorHandlerImpl(this.scope, this.clientState));
    }
}
