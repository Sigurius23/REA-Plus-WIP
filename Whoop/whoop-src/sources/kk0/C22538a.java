package kk0;

import com.whoop.data.repositories.C6656c;
import dc3.EnumC11916a;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kg2.C22459e;
import l83.C23454a0;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import xg3.C38280g;
import ze1.C40588d;

/* JADX INFO: renamed from: kk0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 #2\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R*\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00048\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u00000\u00000\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00000 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b#\u0010\u0018R\u0011\u0010'\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010)\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b(\u0010&¨\u0006*"}, m65681d2 = {"Lkk0/a;", "", "<init>", "()V", "", "level", "Ll83/a0;", "m", "(B)V", "c", "(Lkk0/a;)V", "Lec3/l;", "e", "()Lec3/l;", "Lxg3/g;", "j", "()Lxg3/g;", "", "toString", "()Ljava/lang/String;", "value", "a", "B", "f", "()B", "getUserDisplayPercent$annotations", "userDisplayPercent", "Lze1/d;", "kotlin.jvm.PlatformType", "b", "Lze1/d;", "updateSubject", "Lec3/o1;", "Lec3/o1;", "batteryLevelFlow", "d", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "isLowForFirmwareUpdate", "g", "isLow", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22538a {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private byte userDisplayPercent = 50;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C40588d<C22538a> updateSubject;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC13072o1 batteryLevelFlow;

    /* JADX INFO: renamed from: kk0.a$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, m65681d2 = {"Lkk0/a$a;", "", "<init>", "()V", "", "level", "", "b", "(B)Z", "", "tenths", "Lkk0/a;", "a", "(J)Lkk0/a;", "", "LOW_BATTERY_LEVEL", "I", "MIN_BATTERY_FW_UPDATE", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C22538a m65142a(long tenths) {
            C22538a c22538a = new C22538a();
            c22538a.m65141m((byte) (tenths / ((long) 10)));
            return c22538a;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m65143b(byte level) {
            return level < 20;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: kk0.a$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f88583w;

        /* JADX INFO: renamed from: kk0.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f88584w;

            /* JADX INFO: renamed from: kk0.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.ble.strap.battery.BatteryLevel$getUerDisplayPercentFlow$$inlined$map$1$2", m100430f = "BatteryLevel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41912a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f88585E;

                /* JADX INFO: renamed from: F */
                Object f88586F;

                /* JADX INFO: renamed from: G */
                Object f88587G;

                /* JADX INFO: renamed from: H */
                int f88588H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f88589w;

                /* JADX INFO: renamed from: x */
                int f88590x;

                /* JADX INFO: renamed from: y */
                Object f88591y;

                public C41912a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f88589w = obj;
                    this.f88590x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f88584w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41912a c41912a;
                if (interfaceC30057d instanceof C41912a) {
                    c41912a = (C41912a) interfaceC30057d;
                    int i13 = c41912a.f88590x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41912a.f88590x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41912a = new C41912a(interfaceC30057d);
                    }
                } else {
                    c41912a = new C41912a(interfaceC30057d);
                }
                Object obj2 = c41912a.f88589w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41912a.f88590x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f88584w;
                    Byte bValueOf = Byte.valueOf(((C22538a) obj).getUserDisplayPercent());
                    c41912a.f88591y = null;
                    c41912a.f88585E = null;
                    c41912a.f88586F = null;
                    c41912a.f88587G = null;
                    c41912a.f88588H = 0;
                    c41912a.f88590x = 1;
                    if (interfaceC13062m.emit(bValueOf, c41912a) == enumC31071a) {
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
            this.f88583w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f88583w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C22538a() {
        C40588d<C22538a> c40588dM131622Y = C40588d.m131622Y();
        AbstractC22676k.m65749i(c40588dM131622Y, "createSingle(...)");
        this.updateSubject = c40588dM131622Y;
        this.batteryLevelFlow = AbstractC13091v.m36592b(1, 0, EnumC11916a.f38983x, 2);
        m65141m((byte) 50);
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m65131i(byte b6) {
        return INSTANCE.m65143b(b6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final Byte m65132k(C22538a obj) {
        AbstractC22676k.m65750j(obj, "obj");
        return Byte.valueOf(obj.getUserDisplayPercent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final Byte m65133l(Function1 function1, Object obj) {
        return (Byte) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c */
    public final void m65134c(C22538a level) {
        AbstractC22676k.m65750j(level, "level");
        m65141m(level.getUserDisplayPercent());
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final byte getUserDisplayPercent() {
        return this.userDisplayPercent;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC13058l m65136e() {
        return new b(AbstractC13091v.m36597g(this.batteryLevelFlow));
    }

    /* JADX INFO: renamed from: f */
    public final byte m65137f() {
        return this.userDisplayPercent;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m65138g() {
        return INSTANCE.m65143b(this.userDisplayPercent);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m65139h() {
        return this.userDisplayPercent < 20;
    }

    /* JADX INFO: renamed from: j */
    public final C38280g<Byte> m65140j() {
        C38280g c38280gM122682x = this.updateSubject.m122682x(new C6656c(new C22459e(4), 16));
        AbstractC22676k.m65749i(c38280gM122682x, "map(...)");
        return c38280gM122682x;
    }

    /* JADX INFO: renamed from: m */
    public final void m65141m(byte level) {
        this.userDisplayPercent = level;
        this.updateSubject.onNext(this);
        this.batteryLevelFlow.mo36564a(this);
    }

    public String toString() {
        return AbstractC2875y.m8295h(this.userDisplayPercent, "BatteryLevel=");
    }
}
