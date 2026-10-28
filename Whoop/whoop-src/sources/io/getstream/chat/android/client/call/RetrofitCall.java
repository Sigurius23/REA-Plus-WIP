package io.getstream.chat.android.client.call;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.C3004e2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.errors.ChatErrorCode;
import io.getstream.chat.android.client.errors.ChatErrorKt;
import io.getstream.chat.android.client.errors.ChatRequestError;
import io.getstream.chat.android.client.parser.ChatParser;
import io.getstream.chat.android.core.internal.coroutines.DispatcherProvider;
import l83.C23454a0;
import n23.AbstractC26202e;
import n23.AbstractC26205h;
import n23.C26200c;
import n23.C26203f;
import n23.C26204g;
import o23.AbstractC27476f;
import o23.C27473c;
import o23.InterfaceC27471a;
import o23.InterfaceC27474d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import pg3.InterfaceC29182e;
import q83.C30064k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import ud3.AbstractC34799a1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\u0011\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\f*\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\f*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\f*\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0082@¢\u0006\u0004\b\u0019\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0096@¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0014\u0010'\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, m65681d2 = {"Lio/getstream/chat/android/client/call/RetrofitCall;", "", "T", "Lo23/d;", "Lpg3/e;", NotificationCompat.CATEGORY_CALL, "Lio/getstream/chat/android/client/parser/ChatParser;", "parser", "Lbc3/c0;", "scope", "<init>", "(Lpg3/e;Lio/getstream/chat/android/client/parser/ChatParser;Lbc3/c0;)V", "Ln23/h;", "result", "Lo23/a;", "callback", "Ll83/a0;", "notifyResult", "(Ln23/h;Lo23/a;Lq83/d;)Ljava/lang/Object;", "", "toFailedResult", "(Ljava/lang/Throwable;)Ln23/h;", "Ln23/e;", "toFailedError", "(Ljava/lang/Throwable;)Ln23/e;", "getResult", "(Lpg3/e;Lq83/d;)Ljava/lang/Object;", "Lpg3/v0;", "(Lpg3/v0;Lq83/d;)Ljava/lang/Object;", "cancel", "()V", "execute", "()Ln23/h;", "enqueue", "(Lo23/a;)V", "await", "(Lq83/d;)Ljava/lang/Object;", "Lpg3/e;", "Lio/getstream/chat/android/client/parser/ChatParser;", "callScope", "Lbc3/c0;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class RetrofitCall<T> implements InterfaceC27474d {
    private final InterfaceC29182e call;
    private final InterfaceC2994c0 callScope;
    private final ChatParser parser;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.call.RetrofitCall$await$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.call.RetrofitCall$await$2", m100430f = "RetrofitCall.kt", m100431l = {57}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"", "T", "Ln23/h;", "<anonymous>", "()Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190742 extends AbstractC32275i implements Function1 {
        int label;
        final /* synthetic */ RetrofitCall<T> this$0;

        /* JADX INFO: renamed from: io.getstream.chat.android.client.call.RetrofitCall$await$2$1, reason: invalid class name */
        @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.call.RetrofitCall$await$2$1", m100430f = "RetrofitCall.kt", m100431l = {58}, m100432m = "invokeSuspend")
        @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"", "T", "Lbc3/c0;", "Ln23/h;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
        public static final class AnonymousClass1 extends AbstractC32275i implements InterfaceC4351m {
            int label;
            final /* synthetic */ RetrofitCall<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RetrofitCall<T> retrofitCall, InterfaceC30057d<? super AnonymousClass1> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.this$0 = retrofitCall;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new AnonymousClass1(this.this$0, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
                return ((AnonymousClass1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.label;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                RetrofitCall<T> retrofitCall = this.this$0;
                InterfaceC29182e interfaceC29182e = ((RetrofitCall) retrofitCall).call;
                this.label = 1;
                Object result = retrofitCall.getResult(interfaceC29182e, this);
                return result == enumC31071a ? enumC31071a : result;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190742(RetrofitCall<T> retrofitCall, InterfaceC30057d<? super C190742> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.this$0 = retrofitCall;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new C190742(this.this$0, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC30063j coroutineContext = ((RetrofitCall) this.this$0).callScope.getCoroutineContext();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            Object objM8705K = AbstractC3006f0.m8705K(coroutineContext, anonymousClass1, this);
            return objM8705K == enumC31071a ? enumC31071a : objM8705K;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C190742) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.call.RetrofitCall$enqueue$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.call.RetrofitCall$enqueue$1", m100430f = "RetrofitCall.kt", m100431l = {53, 53}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190751 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ InterfaceC27471a $callback;
        Object L$0;
        int label;
        final /* synthetic */ RetrofitCall<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190751(RetrofitCall<T> retrofitCall, InterfaceC27471a interfaceC27471a, InterfaceC30057d<? super C190751> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.this$0 = retrofitCall;
            this.$callback = interfaceC27471a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C190751(this.this$0, this.$callback, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C190751) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (r1.notifyResult((n23.AbstractC26205h) r6, r3, r5) == r0) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r6)
                goto L44
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                java.lang.Object r1 = r5.L$0
                io.getstream.chat.android.client.call.RetrofitCall r1 = (io.getstream.chat.android.client.call.RetrofitCall) r1
                p505ts.AbstractC34132o.m107864I(r6)
                goto L34
            L20:
                p505ts.AbstractC34132o.m107864I(r6)
                io.getstream.chat.android.client.call.RetrofitCall<T> r1 = r5.this$0
                pg3.e r6 = io.getstream.chat.android.client.call.RetrofitCall.access$getCall$p(r1)
                r5.L$0 = r1
                r5.label = r3
                java.lang.Object r6 = io.getstream.chat.android.client.call.RetrofitCall.access$getResult(r1, r6, r5)
                if (r6 != r0) goto L34
                goto L43
            L34:
                n23.h r6 = (n23.AbstractC26205h) r6
                o23.a r3 = r5.$callback
                r4 = 0
                r5.L$0 = r4
                r5.label = r2
                java.lang.Object r6 = io.getstream.chat.android.client.call.RetrofitCall.access$notifyResult(r1, r6, r3, r5)
                if (r6 != r0) goto L44
            L43:
                return r0
            L44:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.call.RetrofitCall.C190751.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.call.RetrofitCall$execute$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.call.RetrofitCall$execute$1", m100430f = "RetrofitCall.kt", m100431l = {50}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"", "T", "Lbc3/c0;", "Ln23/h;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190761 extends AbstractC32275i implements InterfaceC4351m {
        int label;
        final /* synthetic */ RetrofitCall<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190761(RetrofitCall<T> retrofitCall, InterfaceC30057d<? super C190761> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.this$0 = retrofitCall;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C190761(this.this$0, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C190761) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            RetrofitCall<T> retrofitCall = this.this$0;
            this.label = 1;
            Object objAwait = retrofitCall.await(this);
            return objAwait == enumC31071a ? enumC31071a : objAwait;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.call.RetrofitCall$getResult$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.call.RetrofitCall$getResult$2", m100430f = "RetrofitCall.kt", m100431l = {85, 85}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"", "T", "Lbc3/c0;", "Ln23/h;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190772 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ InterfaceC29182e $this_getResult;
        Object L$0;
        int label;
        final /* synthetic */ RetrofitCall<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190772(RetrofitCall<T> retrofitCall, InterfaceC29182e interfaceC29182e, InterfaceC30057d<? super C190772> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.this$0 = retrofitCall;
            this.$this_getResult = interfaceC29182e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C190772(this.this$0, this.$this_getResult, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C190772) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
        
            if (r5 == r0) goto L21;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p505ts.AbstractC34132o.m107864I(r5)     // Catch: java.lang.Throwable -> L10
                goto L42
            L10:
                r5 = move-exception
                goto L45
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                java.lang.Object r1 = r4.L$0
                io.getstream.chat.android.client.call.RetrofitCall r1 = (io.getstream.chat.android.client.call.RetrofitCall) r1
                p505ts.AbstractC34132o.m107864I(r5)     // Catch: java.lang.Throwable -> L10
                goto L34
            L22:
                p505ts.AbstractC34132o.m107864I(r5)
                io.getstream.chat.android.client.call.RetrofitCall<T> r1 = r4.this$0     // Catch: java.lang.Throwable -> L10
                pg3.e r5 = r4.$this_getResult     // Catch: java.lang.Throwable -> L10
                r4.L$0 = r1     // Catch: java.lang.Throwable -> L10
                r4.label = r3     // Catch: java.lang.Throwable -> L10
                java.lang.Object r5 = pg3.AbstractC29184e1.m88682d(r5, r4)     // Catch: java.lang.Throwable -> L10
                if (r5 != r0) goto L34
                goto L41
            L34:
                pg3.v0 r5 = (pg3.C29218v0) r5     // Catch: java.lang.Throwable -> L10
                r3 = 0
                r4.L$0 = r3     // Catch: java.lang.Throwable -> L10
                r4.label = r2     // Catch: java.lang.Throwable -> L10
                java.lang.Object r5 = io.getstream.chat.android.client.call.RetrofitCall.access$getResult(r1, r5, r4)     // Catch: java.lang.Throwable -> L10
                if (r5 != r0) goto L42
            L41:
                return r0
            L42:
                n23.h r5 = (n23.AbstractC26205h) r5     // Catch: java.lang.Throwable -> L10
                return r5
            L45:
                io.getstream.chat.android.client.call.RetrofitCall<T> r0 = r4.this$0
                n23.h r5 = io.getstream.chat.android.client.call.RetrofitCall.access$toFailedResult(r0, r5)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.call.RetrofitCall.C190772.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.call.RetrofitCall$getResult$4 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.call.RetrofitCall$getResult$4", m100430f = "RetrofitCall.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"", "T", "Lbc3/c0;", "Ln23/h;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190784 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ C29218v0<T> $this_getResult;
        int label;
        final /* synthetic */ RetrofitCall<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190784(C29218v0<T> c29218v0, RetrofitCall<T> retrofitCall, InterfaceC30057d<? super C190784> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$this_getResult = c29218v0;
            this.this$0 = retrofitCall;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C190784(this.$this_getResult, this.this$0, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C190784) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C29218v0<T> c29218v0 = this.$this_getResult;
            if (!c29218v0.f118269a.f146788Q) {
                AbstractC34799a1 abstractC34799a1 = c29218v0.f118271c;
                return abstractC34799a1 != null ? new C26203f(((RetrofitCall) this.this$0).parser.toError(abstractC34799a1)) : new C26203f(((RetrofitCall) this.this$0).parser.toError(this.$this_getResult.f118269a));
            }
            try {
                Object obj2 = c29218v0.f118270b;
                AbstractC22676k.m65747g(obj2);
                return new C26204g(obj2);
            } catch (Throwable th3) {
                return this.this$0.toFailedResult(th3);
            }
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.call.RetrofitCall$notifyResult$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.call.RetrofitCall$notifyResult$2", m100430f = "RetrofitCall.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190792 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ InterfaceC27471a $callback;
        final /* synthetic */ AbstractC26205h $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190792(InterfaceC27471a interfaceC27471a, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C190792> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$callback = interfaceC27471a;
            this.$result = abstractC26205h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C190792(this.$callback, this.$result, interfaceC30057d);
        }

        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C190792 c190792 = (C190792) create(interfaceC2994c0, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c190792.invokeSuspend(c23454a0);
            return c23454a0;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.$callback.onResult(this.$result);
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2994c0) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }
    }

    public RetrofitCall(InterfaceC29182e call, ChatParser parser, InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(parser, "parser");
        AbstractC22676k.m65750j(scope, "scope");
        this.call = call;
        this.parser = parser;
        this.callScope = AbstractC3006f0.m8696B(scope, new C3004e2(AbstractC3006f0.m8725s(scope.getCoroutineContext())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getResult(InterfaceC29182e interfaceC29182e, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.callScope.getCoroutineContext(), new C190772(this, interfaceC29182e, null), interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object notifyResult(AbstractC26205h abstractC26205h, InterfaceC27471a interfaceC27471a, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM8705K = AbstractC3006f0.m8705K(DispatcherProvider.INSTANCE.getMain(), new C190792(interfaceC27471a, abstractC26205h, null), interfaceC30057d);
        return objM8705K == EnumC31071a.f128113w ? objM8705K : C23454a0.f92919a;
    }

    private final AbstractC26202e toFailedError(Throwable th3) {
        if (!(th3 instanceof ChatRequestError)) {
            return ChatErrorKt.fromChatErrorCode$default(C26200c.f103911e, ChatErrorCode.NETWORK_FAILED, 0, th3, 2, null);
        }
        ChatRequestError chatRequestError = (ChatRequestError) th3;
        return new C26200c(String.valueOf(th3.getMessage()), chatRequestError.getStreamCode(), chatRequestError.getStatusCode(), th3.getCause());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC26205h toFailedResult(Throwable th3) {
        return new C26203f(toFailedError(th3));
    }

    @Override // o23.InterfaceC27474d
    public Object await(InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return C27473c.m82901b(new C190742(this, null), interfaceC30057d);
    }

    @Override // o23.InterfaceC27474d
    public void cancel() {
        this.call.cancel();
        AbstractC3006f0.m8718l(this.callScope.getCoroutineContext());
    }

    @Override // o23.InterfaceC27474d
    public void enqueue() {
        AbstractC27476f.m82905c(this);
    }

    @Override // o23.InterfaceC27474d
    public AbstractC26205h execute() {
        return (AbstractC26205h) AbstractC3006f0.m8699E(C30064k.f122676w, new C190761(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getResult(C29218v0<T> c29218v0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.callScope.getCoroutineContext(), new C190784(c29218v0, this, null), interfaceC30057d);
    }

    @Override // o23.InterfaceC27474d
    public void enqueue(InterfaceC27471a callback) {
        AbstractC22676k.m65750j(callback, "callback");
        AbstractC3006f0.m8732z(this.callScope, null, null, new C190751(this, callback, null), 3);
    }
}
