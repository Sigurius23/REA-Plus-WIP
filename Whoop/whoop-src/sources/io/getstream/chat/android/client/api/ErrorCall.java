package io.getstream.chat.android.client.api;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import io.getstream.chat.android.core.internal.coroutines.DispatcherProvider;
import l83.C23454a0;
import live.hms.video.factories.C24148c;
import n23.AbstractC26202e;
import n23.AbstractC26205h;
import n23.C26203f;
import o23.InterfaceC27471a;
import o23.InterfaceC27474d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/chat/android/client/api/ErrorCall;", "", "T", "Lo23/d;", "Lbc3/c0;", "scope", "Ln23/e;", "e", "<init>", "(Lbc3/c0;Ln23/e;)V", "Ll83/a0;", "cancel", "()V", "Ln23/h;", "execute", "()Ln23/h;", "Lo23/a;", "callback", "enqueue", "(Lo23/a;)V", "await", "(Lq83/d;)Ljava/lang/Object;", "Lbc3/c0;", "Ln23/e;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ErrorCall<T> implements InterfaceC27474d {
    private final AbstractC26202e e;
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api.ErrorCall$await$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.api.ErrorCall$await$2", m100430f = "ErrorCall.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ln23/f;", "<anonymous>", "(Lbc3/c0;)Ln23/f;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190052 extends AbstractC32275i implements InterfaceC4351m {
        int label;
        final /* synthetic */ ErrorCall<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190052(ErrorCall<T> errorCall, InterfaceC30057d<? super C190052> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.this$0 = errorCall;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C190052(this.this$0, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C26203f> interfaceC30057d) {
            return ((C190052) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return new C26203f(((ErrorCall) this.this$0).e);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api.ErrorCall$enqueue$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.api.ErrorCall$enqueue$1", m100430f = "ErrorCall.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190061 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ InterfaceC27471a $callback;
        int label;
        final /* synthetic */ ErrorCall<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190061(InterfaceC27471a interfaceC27471a, ErrorCall<T> errorCall, InterfaceC30057d<? super C190061> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$callback = interfaceC27471a;
            this.this$0 = errorCall;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C190061(this.$callback, this.this$0, interfaceC30057d);
        }

        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C190061 c190061 = (C190061) create(interfaceC2994c0, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c190061.invokeSuspend(c23454a0);
            return c23454a0;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.$callback.onResult(new C26203f(((ErrorCall) this.this$0).e));
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2994c0) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }
    }

    public ErrorCall(InterfaceC2994c0 scope, AbstractC26202e e5) {
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(e5, "e");
        this.scope = scope;
        this.e = e5;
    }

    @Override // o23.InterfaceC27474d
    public final Object await(InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.scope.getCoroutineContext(), new C190052(this, null), interfaceC30057d);
    }

    @Override // o23.InterfaceC27474d
    public final void cancel() {
    }

    @Override // o23.InterfaceC27474d
    public final void enqueue(InterfaceC27471a callback) {
        AbstractC22676k.m65750j(callback, "callback");
        AbstractC3006f0.m8732z(this.scope, DispatcherProvider.INSTANCE.getMain(), null, new C190061(callback, this, null), 2);
    }

    @Override // o23.InterfaceC27474d
    public final AbstractC26205h execute() {
        return new C26203f(this.e);
    }

    @Override // o23.InterfaceC27474d
    public final void enqueue() {
        enqueue(new C24148c(20));
    }
}
