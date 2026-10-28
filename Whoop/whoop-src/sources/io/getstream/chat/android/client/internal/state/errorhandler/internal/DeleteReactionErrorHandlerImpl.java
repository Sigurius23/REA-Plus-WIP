package io.getstream.chat.android.client.internal.state.errorhandler.internal;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.errorhandler.DeleteReactionErrorHandler;
import io.getstream.chat.android.client.extensions.StringExtensionsKt;
import io.getstream.chat.android.client.internal.state.plugin.logic.internal.LogicRegistry;
import io.getstream.chat.android.client.setup.state.ClientState;
import io.getstream.chat.android.models.Message;
import l83.C23454a0;
import l83.C23465k;
import n23.AbstractC26202e;
import n23.AbstractC26205h;
import n23.C26198a;
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
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ5\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl;", "Lio/getstream/chat/android/client/errorhandler/DeleteReactionErrorHandler;", "Lbc3/c0;", "scope", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "logic", "Lio/getstream/chat/android/client/setup/state/ClientState;", "clientState", "<init>", "(Lbc3/c0;Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/setup/state/ClientState;)V", "Lo23/d;", "Lio/getstream/chat/android/models/Message;", "originalCall", "", "cid", "messageId", "Lo23/q;", "onDeleteReactionError", "(Lo23/d;Ljava/lang/String;Ljava/lang/String;)Lo23/q;", "Lbc3/c0;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "Lio/getstream/chat/android/client/setup/state/ClientState;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DeleteReactionErrorHandlerImpl implements DeleteReactionErrorHandler {
    private final ClientState clientState;
    private final LogicRegistry logic;
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.errorhandler.internal.DeleteReactionErrorHandlerImpl$onDeleteReactionError$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.errorhandler.internal.DeleteReactionErrorHandlerImpl$onDeleteReactionError$1", m100430f = "DeleteReactionErrorHandlerImpl.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln23/e;", "originalError", "Ln23/h;", "Lio/getstream/chat/android/models/Message;", "<anonymous>", "(Ln23/e;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C192561 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $cid;
        final /* synthetic */ String $messageId;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DeleteReactionErrorHandlerImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192561(String str, DeleteReactionErrorHandlerImpl deleteReactionErrorHandlerImpl, String str2, InterfaceC30057d<? super C192561> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$cid = str;
            this.this$0 = deleteReactionErrorHandlerImpl;
            this.$messageId = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C192561 c192561 = new C192561(this.$cid, this.this$0, this.$messageId, interfaceC30057d);
            c192561.L$0 = obj;
            return c192561;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC26202e abstractC26202e = (AbstractC26202e) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.$cid == null || this.this$0.clientState.isOnline()) {
                return new C26203f(abstractC26202e);
            }
            C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(this.$cid);
            Message message = this.this$0.logic.channel((String) c23465kCidToTypeAndId.f92937w, (String) c23465kCidToTypeAndId.f92938x).getMessage(this.$messageId);
            return message != null ? new C26204g(message) : new C26203f(new C26198a("Local message was not found."));
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(AbstractC26202e abstractC26202e, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C192561) create(abstractC26202e, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public DeleteReactionErrorHandlerImpl(InterfaceC2994c0 scope, LogicRegistry logic, ClientState clientState) {
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(logic, "logic");
        AbstractC22676k.m65750j(clientState, "clientState");
        this.scope = scope;
        this.logic = logic;
        this.clientState = clientState;
    }

    @Override // io.getstream.chat.android.client.errorhandler.DeleteReactionErrorHandler
    public final C27487q onDeleteReactionError(InterfaceC27474d originalCall, String cid, String messageId) {
        AbstractC22676k.m65750j(originalCall, "originalCall");
        AbstractC22676k.m65750j(messageId, "messageId");
        return AbstractC27476f.m82910h(originalCall, this.scope, new C192561(cid, this, messageId, null));
    }
}
