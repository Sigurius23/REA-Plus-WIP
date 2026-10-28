package g40;

import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.AbstractC1640x1;
import bc3.AbstractC3006f0;
import c93.InterfaceC4339a;
import cz.AbstractC11191b0;
import cz.C11197e0;
import cz.C11215n0;
import e30.AbstractC12605c;
import ec3.C13045h2;
import h00.EnumC16519o0;
import h20.AbstractC16632b4;
import h20.C16657g;
import h20.C16670i0;
import h20.C16694m0;
import h20.C16754w0;
import h20.C16765y;
import h20.InterfaceC16638c4;
import i20.C17982v0;
import ib3.C18345d;
import io.getstream.photoview.dialog.common.pager.MultiTouchViewPager;
import j00.C21108k;
import ja3.C21519o;
import java.util.List;
import java.util.Map;
import jb3.C21548h;
import l83.C23454a0;
import m00.C24869a;
import m00.C24872d;
import o20.C27457b;
import p193hf.C17226c;
import p193hf.C17231h;
import p452r7.C31008e;
import p452r7.C31017i0;
import p452r7.C31019j0;
import p452r7.C31020k;
import p452r7.C31022l;
import p452r7.C31036s;
import p478s3.AbstractC32098d;
import p479s4.AbstractC32128i;
import p499t9.C33623c0;
import p599wz.AbstractC37747q;
import p599wz.C37708d;
import p599wz.C37735m;
import p599wz.C37738n;
import p599wz.C37741o;
import p599wz.C37744p;
import p599wz.InterfaceC37711e;
import p631xz.C38721f0;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import q20.AbstractC29840y;
import q20.C29828m;
import q83.InterfaceC30057d;
import se.AbstractC32410a;
import va3.C35850h;
import x30.AbstractC37926s0;
import y00.C38809d5;
import y00.EnumC38828f4;
import z30.C40039b;

/* JADX INFO: renamed from: g40.f4 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C15352f4 extends C22672i implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f57726w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15352f4(int i13, Object obj, Class cls, String str, String str2, int i14, int i15) {
        super(i13, i14, cls, obj, str, str2);
        this.f57726w = i15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        int i13 = this.f57726w;
        char c3 = 1;
        int i14 = 10;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case 0:
                C15396n3 p13 = (C15396n3) obj;
                AbstractC22676k.m65750j(p13, "p0");
                ((InterfaceC15391m3) this.receiver).mo43568n(p13);
                return c23454a0;
            case 1:
                AbstractC11191b0 p14 = (AbstractC11191b0) obj;
                AbstractC22676k.m65750j(p14, "p0");
                ((C11215n0) this.receiver).m30338n(p14);
                return c23454a0;
            case 2:
                String str = (String) obj;
                C11215n0 c11215n0 = (C11215n0) this.receiver;
                if (str != null) {
                    ((C11197e0) c11215n0.f35961J.getValue()).getClass();
                } else {
                    c11215n0.getClass();
                }
                return AbstractC32128i.m100061p(null);
            case 3:
                ((C16765y) this.receiver).f64439a.m36570j((C21108k) obj);
                return c23454a0;
            case 4:
                AbstractC37747q p15 = (AbstractC37747q) obj;
                AbstractC22676k.m65750j(p15, "p0");
                C16754w0 c16754w0 = (C16754w0) this.receiver;
                C38721f0 c38721f0 = c16754w0.f64345d0;
                InterfaceC37711e interfaceC37711eMo121151b = p15.mo121151b();
                if (interfaceC37711eMo121151b != null) {
                    AbstractC32098d.m99854u(interfaceC37711eMo121151b, c38721f0);
                }
                if (!(p15 instanceof C37735m)) {
                    if (p15 instanceof C37741o) {
                        c16754w0.mo35337v(AbstractC37926s0.m121456H(((C37741o) p15).f161701w));
                    } else if (p15 instanceof C37738n) {
                        C37738n c37738n = (C37738n) p15;
                        c16754w0.f64348g0.mo36564a(new C16694m0(new C29828m(objArr == true ? 1 : 0, c37738n.f161696x, c37738n.f161697y, c3 == true ? 1 : 0), (C37708d) c38721f0.f166664b.f45200w.getValue(), (List) ((InterfaceC4339a) c16754w0.f43022Z.f64022c.f104635y).invoke()));
                    } else {
                        if (!(p15 instanceof C37744p)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c16754w0.mo35337v(AbstractC37926s0.m121456H(new IllegalStateException("PaymentMethodObtained is not expected from authentication only Link flows")));
                    }
                }
                return c23454a0;
            case 5:
                AbstractC16632b4 p16 = (AbstractC16632b4) obj;
                AbstractC22676k.m65750j(p16, "p0");
                ((InterfaceC16638c4) this.receiver).mo43511a(p16);
                return c23454a0;
            case 6:
                ((AbstractC12605c) this.receiver).m35340z((AbstractC29840y) obj);
                return c23454a0;
            case 7:
                int iIntValue = ((Number) obj).intValue();
                MultiTouchViewPager multiTouchViewPager = (MultiTouchViewPager) this.receiver;
                int i15 = MultiTouchViewPager.f74902O0;
                multiTouchViewPager.getClass();
                multiTouchViewPager.f74903L0 = iIntValue == 0;
                return c23454a0;
            case 8:
                Map.Entry p17 = (Map.Entry) obj;
                AbstractC22676k.m65750j(p17, "p0");
                C17231h c17231h = (C17231h) this.receiver;
                return new C17226c(p17, c17231h.f66218x, c17231h.f66215F, c17231h.f66216G);
            case 9:
                Map.Entry p18 = (Map.Entry) obj;
                AbstractC22676k.m65750j(p18, "p0");
                C17231h c17231h2 = (C17231h) this.receiver;
                return new C17226c(p18, c17231h2.f66219y, c17231h2.f66216G, c17231h2.f66215F);
            case 10:
                C40039b p19 = (C40039b) obj;
                AbstractC22676k.m65750j(p19, "p0");
                C17982v0 c17982v0 = (C17982v0) this.receiver;
                c17982v0.getClass();
                AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(c17982v0), null, null, new C16670i0((Object) c17982v0, (Object) p19, (InterfaceC30057d) (objArr2 == true ? 1 : 0), i14), 3);
                return c23454a0;
            case 11:
                C40039b p24 = (C40039b) obj;
                AbstractC22676k.m65750j(p24, "p0");
                C17982v0 c17982v1 = (C17982v0) this.receiver;
                c17982v1.getClass();
                AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(c17982v1), null, null, new C16670i0((Object) c17982v1, (Object) p24, (InterfaceC30057d) (objArr3 == true ? 1 : 0), i14), 3);
                return c23454a0;
            case 12:
                String p25 = (String) obj;
                AbstractC22676k.m65750j(p25, "p0");
                ((C18345d) this.receiver).getClass();
                return C18345d.m52853a(p25);
            case 13:
                C35850h p26 = (C35850h) obj;
                AbstractC22676k.m65750j(p26, "p0");
                return ((C21519o) this.receiver).m60511E(p26);
            case 14:
                C35850h p27 = (C35850h) obj;
                AbstractC22676k.m65750j(p27, "p0");
                return ((C21519o) this.receiver).m60512F(p27);
            case 15:
                C35850h p28 = (C35850h) obj;
                AbstractC22676k.m65750j(p28, "p0");
                return ((C21548h) this.receiver).m60580Y(p28);
            case 16:
                C27457b c27457b = (C27457b) obj;
                C24872d c24872d = (C24872d) this.receiver;
                C16657g c16657g = c24872d.f97437F;
                C33623c0 c33623c0 = EnumC38828f4.f167088G;
                c16657g.getClass();
                C38809d5 c38809d5M101035i0 = c27457b != null ? AbstractC32410a.m101035i0(c27457b, "card", c16657g.f64044d) : null;
                c16657g.m47229d(c27457b, "card");
                C13045h2 c13045h2 = c24872d.f97441J;
                do {
                    value = c13045h2.getValue();
                } while (!c13045h2.m36569i(value, C24869a.m72901a((C24869a) value, c38809d5M101035i0 != null ? EnumC16519o0.Enabled : EnumC16519o0.Disabled, false, c38809d5M101035i0, null, 91)));
                return c23454a0;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                double dDoubleValue = ((Number) obj).doubleValue();
                ((C31008e) this.receiver).getClass();
                return C31008e.m95546a(dDoubleValue);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                double dDoubleValue2 = ((Number) obj).doubleValue();
                ((C31008e) this.receiver).getClass();
                return C31008e.m95546a(dDoubleValue2);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                double dDoubleValue3 = ((Number) obj).doubleValue();
                ((C31017i0) this.receiver).getClass();
                return new C31019j0(dDoubleValue3);
            case 20:
                double dDoubleValue4 = ((Number) obj).doubleValue();
                ((C31017i0) this.receiver).getClass();
                return new C31019j0(dDoubleValue4);
            case 21:
                double dDoubleValue5 = ((Number) obj).doubleValue();
                ((C31017i0) this.receiver).getClass();
                return new C31019j0(dDoubleValue5);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                double dDoubleValue6 = ((Number) obj).doubleValue();
                ((C31017i0) this.receiver).getClass();
                return new C31019j0(dDoubleValue6);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                double dDoubleValue7 = ((Number) obj).doubleValue();
                ((C31017i0) this.receiver).getClass();
                return new C31019j0(dDoubleValue7);
            case 24:
                double dDoubleValue8 = ((Number) obj).doubleValue();
                ((C31017i0) this.receiver).getClass();
                return new C31019j0(dDoubleValue8);
            case 25:
                double dDoubleValue9 = ((Number) obj).doubleValue();
                ((C31022l) this.receiver).getClass();
                return C31022l.m95556a(dDoubleValue9);
            case 26:
                double dDoubleValue10 = ((Number) obj).doubleValue();
                ((C31022l) this.receiver).getClass();
                return C31022l.m95556a(dDoubleValue10);
            case 27:
                double dDoubleValue11 = ((Number) obj).doubleValue();
                ((C31022l) this.receiver).getClass();
                return C31022l.m95556a(dDoubleValue11);
            case 28:
                double dDoubleValue12 = ((Number) obj).doubleValue();
                ((C31022l) this.receiver).getClass();
                return C31022l.m95556a(dDoubleValue12);
            default:
                double dDoubleValue13 = ((Number) obj).doubleValue();
                ((C31022l) this.receiver).getClass();
                return C31022l.m95556a(dDoubleValue13);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15352f4(int i13) {
        super(1, 0, C31008e.class, C31020k.f128009y, "kilocalories", "kilocalories(D)Landroidx/health/connect/client/units/Energy;");
        this.f57726w = i13;
        switch (i13) {
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                super(1, 0, C31008e.class, C31020k.f128009y, "kilocalories", "kilocalories(D)Landroidx/health/connect/client/units/Energy;");
                break;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                super(1, 0, C31017i0.class, C31019j0.f128007x, "millimetersOfMercury", "millimetersOfMercury(D)Landroidx/health/connect/client/units/Pressure;");
                break;
            case 20:
                super(1, 0, C31017i0.class, C31019j0.f128007x, "millimetersOfMercury", "millimetersOfMercury(D)Landroidx/health/connect/client/units/Pressure;");
                break;
            case 21:
                super(1, 0, C31017i0.class, C31019j0.f128007x, "millimetersOfMercury", "millimetersOfMercury(D)Landroidx/health/connect/client/units/Pressure;");
                break;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                super(1, 0, C31017i0.class, C31019j0.f128007x, "millimetersOfMercury", "millimetersOfMercury(D)Landroidx/health/connect/client/units/Pressure;");
                break;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                super(1, 0, C31017i0.class, C31019j0.f128007x, "millimetersOfMercury", "millimetersOfMercury(D)Landroidx/health/connect/client/units/Pressure;");
                break;
            case 24:
                super(1, 0, C31017i0.class, C31019j0.f128007x, "millimetersOfMercury", "millimetersOfMercury(D)Landroidx/health/connect/client/units/Pressure;");
                break;
            case 25:
                super(1, 0, C31022l.class, C31036s.f128022y, "meters", "meters(D)Landroidx/health/connect/client/units/Length;");
                break;
            case 26:
                super(1, 0, C31022l.class, C31036s.f128022y, "meters", "meters(D)Landroidx/health/connect/client/units/Length;");
                break;
            case 27:
                super(1, 0, C31022l.class, C31036s.f128022y, "meters", "meters(D)Landroidx/health/connect/client/units/Length;");
                break;
            case 28:
                super(1, 0, C31022l.class, C31036s.f128022y, "meters", "meters(D)Landroidx/health/connect/client/units/Length;");
                break;
            case 29:
                super(1, 0, C31022l.class, C31036s.f128022y, "meters", "meters(D)Landroidx/health/connect/client/units/Length;");
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15352f4(C17231h c17231h, int i13) {
        super(1, 0, C17231h.class, c17231h, "fwdEntryView", "fwdEntryView(Ljava/util/Map$Entry;)Laws/smithy/kotlin/runtime/collections/views/MutableEntryView;");
        this.f57726w = i13;
        switch (i13) {
            case 9:
                super(1, 0, C17231h.class, c17231h, "revEntryView", "revEntryView(Ljava/util/Map$Entry;)Laws/smithy/kotlin/runtime/collections/views/MutableEntryView;");
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15352f4(C21519o c21519o, int i13) {
        super(1, 0, C21519o.class, c21519o, "searchMethodsByNameWithoutBuiltinMagic", "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;");
        this.f57726w = i13;
        switch (i13) {
            case 14:
                super(1, 0, C21519o.class, c21519o, "searchMethodsInSupertypesWithoutBuiltinMagic", "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;");
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15352f4(Object obj) {
        super(1, 0, C21548h.class, obj, "getValueClassPropertyType", "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;");
        this.f57726w = 15;
    }
}
