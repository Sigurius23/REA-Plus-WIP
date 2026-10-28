package io.getstream.chat.android.client.internal.state.errorhandler.internal;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.errorhandler.SendReactionErrorHandler;
import io.getstream.chat.android.client.extensions.internal.ReactionKt;
import io.getstream.chat.android.client.setup.state.ClientState;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.User;
import l83.C23454a0;
import n23.AbstractC26202e;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import o23.AbstractC27476f;
import o23.C27487q;
import o23.InterfaceC27474d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JC\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl;", "Lio/getstream/chat/android/client/errorhandler/SendReactionErrorHandler;", "Lbc3/c0;", "scope", "Lio/getstream/chat/android/client/setup/state/ClientState;", "clientState", "<init>", "(Lbc3/c0;Lio/getstream/chat/android/client/setup/state/ClientState;)V", "Lo23/d;", "Lio/getstream/chat/android/models/Reaction;", "originalCall", "reaction", "", "enforceUnique", "skipPush", "Lio/getstream/chat/android/models/User;", "currentUser", "Lo23/q;", "onSendReactionError", "(Lo23/d;Lio/getstream/chat/android/models/Reaction;ZZLio/getstream/chat/android/models/User;)Lo23/q;", "Lbc3/c0;", "Lio/getstream/chat/android/client/setup/state/ClientState;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SendReactionErrorHandlerImpl implements SendReactionErrorHandler {
    private final ClientState clientState;
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.errorhandler.internal.SendReactionErrorHandlerImpl$onSendReactionError$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.errorhandler.internal.SendReactionErrorHandlerImpl$onSendReactionError$1", m100430f = "SendReactionErrorHandlerImpl.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln23/e;", "originalError", "Ln23/h;", "Lio/getstream/chat/android/models/Reaction;", "<anonymous>", "(Ln23/e;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C192581 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ User $currentUser;
        final /* synthetic */ boolean $enforceUnique;
        final /* synthetic */ Reaction $reaction;
        final /* synthetic */ boolean $skipPush;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192581(Reaction reaction, User user, boolean z4, boolean z13, InterfaceC30057d<? super C192581> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$reaction = reaction;
            this.$currentUser = user;
            this.$enforceUnique = z4;
            this.$skipPush = z13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C192581 c192581 = SendReactionErrorHandlerImpl.this.new C192581(this.$reaction, this.$currentUser, this.$enforceUnique, this.$skipPush, interfaceC30057d);
            c192581.L$0 = obj;
            return c192581;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC26202e abstractC26202e = (AbstractC26202e) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return SendReactionErrorHandlerImpl.this.clientState.isOnline() ? new C26203f(abstractC26202e) : new C26204g(ReactionKt.enrichWithDataBeforeSending(this.$reaction, this.$currentUser, SendReactionErrorHandlerImpl.this.clientState.isOnline(), this.$enforceUnique, this.$skipPush));
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(AbstractC26202e abstractC26202e, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C192581) create(abstractC26202e, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public SendReactionErrorHandlerImpl(InterfaceC2994c0 scope, ClientState clientState) {
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(clientState, "clientState");
        this.scope = scope;
        this.clientState = clientState;
    }

    @Override // io.getstream.chat.android.client.errorhandler.SendReactionErrorHandler
    public final C27487q onSendReactionError(InterfaceC27474d originalCall, Reaction reaction, boolean enforceUnique, boolean skipPush, User currentUser) {
        AbstractC22676k.m65750j(originalCall, "originalCall");
        AbstractC22676k.m65750j(reaction, "reaction");
        AbstractC22676k.m65750j(currentUser, "currentUser");
        return AbstractC27476f.m82910h(originalCall, this.scope, new C192581(reaction, currentUser, enforceUnique, skipPush, null));
    }
}
