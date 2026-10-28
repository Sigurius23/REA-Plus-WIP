package y82;

import b82.InterfaceC2804a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3061u;
import c93.InterfaceC4351m;
import d82.InterfaceC11777a;
import f82.EnumC14251b;
import f82.InterfaceC14252c;
import in2.InterfaceC18732d;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: y82.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0012J\u0015\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, m65681d2 = {"Ly82/g;", "Lbc3/c0;", "Lf82/c;", "strapAlarmSdk", "Ld82/a;", "imuSdk", "Lin2/d;", "dispatcherFactory", "Lb82/a;", "hapticsFeedbackSdk", "<init>", "(Lf82/c;Ld82/a;Lin2/d;Lb82/a;)V", "", "timeStampMillis", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(J)V", "f", "()V", "d", "", AttachmentExtensionsKt.EXTRA_DURATION, "e", "(I)V", "g", "", "enable", "i", "(Z)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lf82/c;", "x", "Ld82/a;", "y", "Lin2/d;", "z", "Lb82/a;", "Lbc3/u;", "E", "Lbc3/u;", "job", "Lq83/j;", "getCoroutineContext", "()Lq83/j;", "coroutineContext", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39344g implements InterfaceC2994c0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC3061u job;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC14252c strapAlarmSdk;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC11777a imuSdk;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC18732d dispatcherFactory;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC2804a hapticsFeedbackSdk;

    /* JADX INFO: renamed from: y82.g$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.actions.WhoopStrapInteractionFromWhoopActionClass$disableAlarmWhoopAction$1", m100430f = "WhoopStrapInteractionFromWhoopActionClass.kt", m100431l = {43}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f169328w;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C39344g.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f169328w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC14252c interfaceC14252c = C39344g.this.strapAlarmSdk;
                this.f169328w = 1;
                if (interfaceC14252c.mo40722a(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: y82.g$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.actions.WhoopStrapInteractionFromWhoopActionClass$enterHighFreqSyncMode$1", m100430f = "WhoopStrapInteractionFromWhoopActionClass.kt", m100431l = {49}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f169330w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f169332y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i13, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f169332y = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C39344g.this.new b(this.f169332y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f169330w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC14252c interfaceC14252c = C39344g.this.strapAlarmSdk;
                int i14 = this.f169332y;
                this.f169330w = 1;
                if (interfaceC14252c.mo40723b(i14, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: y82.g$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.actions.WhoopStrapInteractionFromWhoopActionClass$runAlarmWhoopAction$1", m100430f = "WhoopStrapInteractionFromWhoopActionClass.kt", m100431l = {37}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f169333w;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C39344g.this.new c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f169333w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC14252c interfaceC14252c = C39344g.this.strapAlarmSdk;
                EnumC14251b enumC14251b = EnumC14251b.SMART_ALARM_PUSH;
                this.f169333w = 1;
                if (interfaceC14252c.mo40725d(enumC14251b, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: y82.g$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.actions.WhoopStrapInteractionFromWhoopActionClass$runHapticsPattern$1", m100430f = "WhoopStrapInteractionFromWhoopActionClass.kt", m100431l = {55}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f169335w;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C39344g.this.new d(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f169335w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC2804a interfaceC2804a = C39344g.this.hapticsFeedbackSdk;
                this.f169335w = 1;
                if (interfaceC2804a.mo7990a(2, 0, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: y82.g$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.actions.WhoopStrapInteractionFromWhoopActionClass$setAlarmWhoopAction$1", m100430f = "WhoopStrapInteractionFromWhoopActionClass.kt", m100431l = {31}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f169337w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ long f169339y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j7, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f169339y = j7;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C39344g.this.new e(this.f169339y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f169337w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC14252c interfaceC14252c = C39344g.this.strapAlarmSdk;
                long j7 = this.f169339y;
                this.f169337w = 1;
                if (interfaceC14252c.mo40726e(j7, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: y82.g$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.actions.WhoopStrapInteractionFromWhoopActionClass$toggleImuStream$1", m100430f = "WhoopStrapInteractionFromWhoopActionClass.kt", m100431l = {61}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f169340w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f169342y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z4, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f169342y = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C39344g.this.new f(this.f169342y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f169340w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC11777a interfaceC11777a = C39344g.this.imuSdk;
                boolean z4 = this.f169342y;
                this.f169340w = 1;
                if (interfaceC11777a.mo31571a(z4, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    public C39344g(InterfaceC14252c strapAlarmSdk, InterfaceC11777a imuSdk, InterfaceC18732d dispatcherFactory, InterfaceC2804a hapticsFeedbackSdk) {
        AbstractC22676k.m65750j(strapAlarmSdk, "strapAlarmSdk");
        AbstractC22676k.m65750j(imuSdk, "imuSdk");
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        AbstractC22676k.m65750j(hapticsFeedbackSdk, "hapticsFeedbackSdk");
        this.strapAlarmSdk = strapAlarmSdk;
        this.imuSdk = imuSdk;
        this.dispatcherFactory = dispatcherFactory;
        this.hapticsFeedbackSdk = hapticsFeedbackSdk;
        this.job = AbstractC3006f0.m8710d();
    }

    /* JADX INFO: renamed from: d */
    public final void m125463d() {
        AbstractC3006f0.m8732z(this, null, null, new a(null), 3);
    }

    /* JADX INFO: renamed from: e */
    public final void m125464e(int duration) {
        AbstractC3006f0.m8732z(this, null, null, new b(duration, null), 3);
    }

    /* JADX INFO: renamed from: f */
    public final void m125465f() {
        AbstractC3006f0.m8732z(this, null, null, new c(null), 3);
    }

    /* JADX INFO: renamed from: g */
    public final void m125466g() {
        AbstractC3006f0.m8732z(this, null, null, new d(null), 3);
    }

    @Override // bc3.InterfaceC2994c0
    public InterfaceC30063j getCoroutineContext() {
        return this.dispatcherFactory.mo54465b().plus(this.job);
    }

    /* JADX INFO: renamed from: h */
    public final void m125467h(long timeStampMillis) {
        AbstractC3006f0.m8732z(this, null, null, new e(timeStampMillis, null), 3);
    }

    /* JADX INFO: renamed from: i */
    public final void m125468i(boolean enable) {
        AbstractC3006f0.m8732z(this, null, null, new f(enable, null), 3);
    }
}
