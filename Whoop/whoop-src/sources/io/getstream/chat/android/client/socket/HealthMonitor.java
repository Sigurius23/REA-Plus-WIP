package io.getstream.chat.android.client.socket;

import androidx.recyclerview.widget.AbstractC1707m0;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.scope.UserScope;
import io.getstream.chat.android.client.utils.TimeProvider;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import l83.InterfaceC23462h;
import live.hms.video.error.ErrorCodes;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u000267B_\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b\u0012\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J?\u0010\u001e\u001a\u00020\u001d*\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00192\"\u0010\u001c\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\n¢\u0006\u0004\b \u0010\u0010J\r\u0010!\u001a\u00020\n¢\u0006\u0004\b!\u0010\u0010J\r\u0010\"\u001a\u00020\n¢\u0006\u0004\b\"\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R*\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R*\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010-R\u001b\u00105\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00068"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/HealthMonitor;", "", "Lio/getstream/chat/android/client/utils/TimeProvider;", "timeProvider", "Lio/getstream/chat/android/client/socket/HealthMonitor$RetryInterval;", "retryInterval", "Lio/getstream/chat/android/client/scope/UserScope;", "userScope", "Lkotlin/Function1;", "Lq83/d;", "Ll83/a0;", "checkCallback", "reconnectCallback", "<init>", "(Lio/getstream/chat/android/client/utils/TimeProvider;Lio/getstream/chat/android/client/socket/HealthMonitor$RetryInterval;Lio/getstream/chat/android/client/scope/UserScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "resetHealthMonitor", "()V", "postponeHealthMonitor", "postponeHealthCheck", "postponeReconnect", "stopAllJobs", "", "needToReconnect", "()Z", "Lbc3/c0;", "", "delayMilliseconds", "Lkotlin/Function2;", "block", "Lbc3/k1;", "launchDelayed", "(Lbc3/c0;JLc93/m;)Lbc3/k1;", "stop", "ack", "onDisconnected", "Lio/getstream/chat/android/client/utils/TimeProvider;", "Lio/getstream/chat/android/client/socket/HealthMonitor$RetryInterval;", "Lio/getstream/chat/android/client/scope/UserScope;", "Lkotlin/jvm/functions/Function1;", "", "consecutiveFailures", "I", "lastAck", "J", "healthMonitorJob", "Lbc3/k1;", "healthCheckJob", "reconnectJob", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "RetryInterval", "ExponencialRetryInterval", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class HealthMonitor {
    private final Function1 checkCallback;
    private int consecutiveFailures;
    private InterfaceC3027k1 healthCheckJob;
    private InterfaceC3027k1 healthMonitorJob;
    private long lastAck;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final Function1 reconnectCallback;
    private InterfaceC3027k1 reconnectJob;
    private final RetryInterval retryInterval;
    private final TimeProvider timeProvider;
    private final UserScope userScope;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/HealthMonitor$ExponencialRetryInterval;", "Lio/getstream/chat/android/client/socket/HealthMonitor$RetryInterval;", "<init>", "()V", "nextInterval", "", "consecutiveFailures", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class ExponencialRetryInterval implements RetryInterval {
        public static final ExponencialRetryInterval INSTANCE = new ExponencialRetryInterval();

        private ExponencialRetryInterval() {
        }

        @Override // io.getstream.chat.android.client.socket.HealthMonitor.RetryInterval
        public final long nextInterval(int consecutiveFailures) {
            int iMin = Math.min((consecutiveFailures * ErrorCodes.InitAPIErrors.cServerErrors) + 500, 25000);
            int iMin2 = Math.min(Math.max(AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION, (consecutiveFailures - 1) * ErrorCodes.InitAPIErrors.cServerErrors), 25000);
            return (long) Math.floor((Math.random() * ((double) (iMin - iMin2))) + ((double) iMin2));
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/HealthMonitor$RetryInterval;", "", "nextInterval", "", "consecutiveFailures", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface RetryInterval {
        long nextInterval(int consecutiveFailures);
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.socket.HealthMonitor$launchDelayed$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.socket.HealthMonitor$launchDelayed$1", m100430f = "HealthMonitor.kt", m100431l = {146, 147}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C194361 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ InterfaceC4351m $block;
        final /* synthetic */ long $delayMilliseconds;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194361(long j7, InterfaceC4351m interfaceC4351m, InterfaceC30057d<? super C194361> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$delayMilliseconds = j7;
            this.$block = interfaceC4351m;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C194361 c194361 = new C194361(this.$delayMilliseconds, this.$block, interfaceC30057d);
            c194361.L$0 = obj;
            return c194361;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C194361) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
        
            if (r8.invoke(r0, r7) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.L$0
                bc3.c0 r0 = (bc3.InterfaceC2994c0) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r7.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r8)
                goto L3e
            L14:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1c:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L30
            L20:
                p505ts.AbstractC34132o.m107864I(r8)
                long r5 = r7.$delayMilliseconds
                r7.L$0 = r0
                r7.label = r4
                java.lang.Object r8 = bc3.AbstractC3034m0.m8782b(r5, r7)
                if (r8 != r1) goto L30
                goto L3d
            L30:
                c93.m r8 = r7.$block
                r2 = 0
                r7.L$0 = r2
                r7.label = r3
                java.lang.Object r8 = r8.invoke(r0, r7)
                if (r8 != r1) goto L3e
            L3d:
                return r1
            L3e:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.socket.HealthMonitor.C194361.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.socket.HealthMonitor$postponeHealthCheck$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.socket.HealthMonitor$postponeHealthCheck$1", m100430f = "HealthMonitor.kt", m100431l = {106}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C194371 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C194371(InterfaceC30057d<? super C194371> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HealthMonitor.this.new C194371(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C194371) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Function1 function1 = HealthMonitor.this.checkCallback;
                this.label = 1;
                if (function1.invoke(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            HealthMonitor.this.postponeHealthMonitor();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.socket.HealthMonitor$postponeHealthMonitor$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.socket.HealthMonitor$postponeHealthMonitor$1", m100430f = "HealthMonitor.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C194381 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C194381(InterfaceC30057d<? super C194381> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HealthMonitor.this.new C194381(interfaceC30057d);
        }

        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C194381 c194381 = (C194381) create(interfaceC2994c0, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c194381.invokeSuspend(c23454a0);
            return c23454a0;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (HealthMonitor.this.needToReconnect()) {
                HealthMonitor.this.postponeReconnect();
            } else {
                HealthMonitor.this.postponeHealthCheck();
            }
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2994c0) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.socket.HealthMonitor$postponeReconnect$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.socket.HealthMonitor$postponeReconnect$2", m100430f = "HealthMonitor.kt", m100431l = {120}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C194392 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C194392(InterfaceC30057d<? super C194392> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HealthMonitor.this.new C194392(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C194392) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Function1 function1 = HealthMonitor.this.reconnectCallback;
                this.label = 1;
                if (function1.invoke(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            HealthMonitor.this.postponeHealthMonitor();
            return C23454a0.f92919a;
        }
    }

    public HealthMonitor(TimeProvider timeProvider, RetryInterval retryInterval, UserScope userScope, Function1 checkCallback, Function1 reconnectCallback) {
        AbstractC22676k.m65750j(timeProvider, "timeProvider");
        AbstractC22676k.m65750j(retryInterval, "retryInterval");
        AbstractC22676k.m65750j(userScope, "userScope");
        AbstractC22676k.m65750j(checkCallback, "checkCallback");
        AbstractC22676k.m65750j(reconnectCallback, "reconnectCallback");
        this.timeProvider = timeProvider;
        this.retryInterval = retryInterval;
        this.userScope = userScope;
        this.checkCallback = checkCallback;
        this.reconnectCallback = reconnectCallback;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:SocketMonitor");
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final InterfaceC3027k1 launchDelayed(InterfaceC2994c0 interfaceC2994c0, long j7, InterfaceC4351m interfaceC4351m) {
        return AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C194361(j7, interfaceC4351m, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean needToReconnect() {
        this.timeProvider.getClass();
        return System.currentTimeMillis() - this.lastAck >= 30000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void postponeHealthCheck() {
        InterfaceC3027k1 interfaceC3027k1 = this.healthCheckJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        this.healthCheckJob = launchDelayed(this.userScope, 1000L, new C194371(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void postponeHealthMonitor() {
        InterfaceC3027k1 interfaceC3027k1 = this.healthMonitorJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        this.healthMonitorJob = launchDelayed(this.userScope, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, new C194381(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void postponeReconnect() {
        InterfaceC3027k1 interfaceC3027k1 = this.reconnectJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        RetryInterval retryInterval = this.retryInterval;
        int i13 = this.consecutiveFailures;
        this.consecutiveFailures = i13 + 1;
        long jNextInterval = retryInterval.nextInterval(i13);
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), AbstractC31061c.m95636l(jNextInterval, "Next connection attempt in ", " ms"), null);
        }
        this.reconnectJob = launchDelayed(this.userScope, jNextInterval, new C194392(null));
    }

    private final void resetHealthMonitor() {
        stopAllJobs();
        this.timeProvider.getClass();
        this.lastAck = System.currentTimeMillis();
        this.consecutiveFailures = 0;
        postponeHealthMonitor();
    }

    private final void stopAllJobs() {
        InterfaceC3027k1 interfaceC3027k1 = this.reconnectJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        InterfaceC3027k1 interfaceC3027k2 = this.healthCheckJob;
        if (interfaceC3027k2 != null) {
            interfaceC3027k2.cancel((CancellationException) null);
        }
        InterfaceC3027k1 interfaceC3027k3 = this.healthMonitorJob;
        if (interfaceC3027k3 != null) {
            interfaceC3027k3.cancel((CancellationException) null);
        }
    }

    public final void ack() {
        resetHealthMonitor();
    }

    public final void onDisconnected() {
        stopAllJobs();
        this.lastAck = 0L;
        postponeReconnect();
    }

    public final void stop() {
        stopAllJobs();
    }

    public /* synthetic */ HealthMonitor(TimeProvider timeProvider, RetryInterval retryInterval, UserScope userScope, Function1 function1, Function1 function2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? TimeProvider.INSTANCE : timeProvider, (i13 & 2) != 0 ? ExponencialRetryInterval.INSTANCE : retryInterval, userScope, function1, function2);
    }
}
