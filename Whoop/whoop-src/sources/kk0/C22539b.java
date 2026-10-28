package kk0;

import androidx.core.app.NotificationCompat;
import dc3.EnumC11916a;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import hn.C17508p;
import kf0.C22429d;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import xg3.C38280g;
import ze1.C40588d;

/* JADX INFO: renamed from: kk0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 !2\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0004\b\u0010\u0010\u000eJ\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0003J\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0003R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00000\u00000\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00000\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001fR\u0011\u0010#\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Lkk0/b;", "", "<init>", "()V", "", NotificationCompat.CATEGORY_STATUS, "Ll83/a0;", "l", "(B)V", "chargeStatus", "c", "(Lkk0/b;)V", "Lxg3/g;", "f", "()Lxg3/g;", "", "g", "Lec3/l;", "e", "()Lec3/l;", "k", "j", "a", "B", "chargePackStatus", "Lze1/d;", "kotlin.jvm.PlatformType", "b", "Lze1/d;", "changedObservable", "Lec3/o1;", "Lec3/o1;", "strapChargeStatusFlow", "d", "()Z", "isCharging", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22539b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private byte chargePackStatus;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C40588d<C22539b> changedObservable;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC13072o1 strapChargeStatusFlow;

    /* JADX INFO: renamed from: kk0.b$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f88597w;

        /* JADX INFO: renamed from: kk0.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f88598w;

            /* JADX INFO: renamed from: kk0.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.ble.strap.battery.StrapChargeStatus$isChargingFlow$$inlined$map$1$2", m100430f = "StrapChargeStatus.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41913a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f88599E;

                /* JADX INFO: renamed from: F */
                Object f88600F;

                /* JADX INFO: renamed from: G */
                Object f88601G;

                /* JADX INFO: renamed from: H */
                int f88602H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f88603w;

                /* JADX INFO: renamed from: x */
                int f88604x;

                /* JADX INFO: renamed from: y */
                Object f88605y;

                public C41913a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f88603w = obj;
                    this.f88604x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f88598w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41913a c41913a;
                if (interfaceC30057d instanceof C41913a) {
                    c41913a = (C41913a) interfaceC30057d;
                    int i13 = c41913a.f88604x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41913a.f88604x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41913a = new C41913a(interfaceC30057d);
                    }
                } else {
                    c41913a = new C41913a(interfaceC30057d);
                }
                Object obj2 = c41913a.f88603w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41913a.f88604x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f88598w;
                    Boolean boolValueOf = Boolean.valueOf(((C22539b) obj).m65149d());
                    c41913a.f88605y = null;
                    c41913a.f88599E = null;
                    c41913a.f88600F = null;
                    c41913a.f88601G = null;
                    c41913a.f88602H = 0;
                    c41913a.f88604x = 1;
                    if (interfaceC13062m.emit(boolValueOf, c41913a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public b(InterfaceC13058l interfaceC13058l) {
            this.f88597w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f88597w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C22539b() {
        C40588d<C22539b> c40588dM131622Y = C40588d.m131622Y();
        AbstractC22676k.m65749i(c40588dM131622Y, "createSingle(...)");
        this.changedObservable = c40588dM131622Y;
        this.strapChargeStatusFlow = AbstractC13091v.m36592b(1, 0, EnumC11916a.f38983x, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final Boolean m65146h(C22539b obj) {
        AbstractC22676k.m65750j(obj, "obj");
        return Boolean.valueOf(obj.m65149d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final Boolean m65147i(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c */
    public final void m65148c(C22539b chargeStatus) {
        AbstractC22676k.m65750j(chargeStatus, "chargeStatus");
        m65155l(chargeStatus.chargePackStatus);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m65149d() {
        return ((byte) (this.chargePackStatus & 1)) != 0;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC13058l m65150e() {
        return new b(AbstractC13091v.m36597g(this.strapChargeStatusFlow));
    }

    /* JADX INFO: renamed from: f */
    public final C38280g<C22539b> m65151f() {
        return this.changedObservable;
    }

    /* JADX INFO: renamed from: g */
    public final C38280g<Boolean> m65152g() {
        C38280g c38280gM122682x = this.changedObservable.m122682x(new C17508p(new C22429d(5), 23));
        AbstractC22676k.m65749i(c38280gM122682x, "map(...)");
        return c38280gM122682x;
    }

    /* JADX INFO: renamed from: j */
    public final void m65153j() {
        m65155l((byte) 1);
    }

    /* JADX INFO: renamed from: k */
    public final void m65154k() {
        m65155l((byte) 0);
    }

    /* JADX INFO: renamed from: l */
    public final void m65155l(byte status) {
        this.chargePackStatus = status;
        this.changedObservable.onNext(this);
        this.strapChargeStatusFlow.mo36564a(this);
    }
}
