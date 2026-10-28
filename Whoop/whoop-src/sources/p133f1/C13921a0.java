package p133f1;

import android.content.res.Resources;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.domain.model.UnitSystem;
import com.whoop.education.FeatureEducationDebugFragment;
import d61.InterfaceC11732a;
import f61.AbstractC14148j;
import fa0.AbstractC14296c;
import fg2.AbstractC14465g;
import fg2.AbstractC14466h;
import fg2.AbstractC14468j;
import fz0.AbstractC14888c;
import gh0.AbstractC15850e;
import gr1.C16094a;
import gv1.AbstractC16233g;
import h00.AbstractC16501f0;
import h01.AbstractC16552s;
import h51.AbstractC16932d;
import h90.AbstractC17024b;
import i51.AbstractC18114k;
import ib0.AbstractC18333d;
import iz0.AbstractC21048g;
import jp1.AbstractC21856h;
import jp1.AbstractC21866r;
import jp2.AbstractC21883n;
import jr1.AbstractC21897e;
import l83.C23454a0;
import p163g1.AbstractC15133r7;
import p208i2.C17919x;
import p270k2.InterfaceC22131e;
import p294l3.C23277r0;
import p390p1.C28596b0;
import p390p1.InterfaceC28601c1;
import p635y2.InterfaceC39147y;
import p636y3.C39174f;
import p636y3.C39180l;
import p713jm0.AbstractC21789d;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import tp0.EnumC34058c;
import v41.EnumC35690s;

/* JADX INFO: renamed from: f1.a0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C13921a0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49636w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f49637x;

    public /* synthetic */ C13921a0(int i13, InterfaceC28601c1 interfaceC28601c1) {
        this.f49636w = i13;
        this.f49637x = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f49636w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        InterfaceC28601c1 interfaceC28601c1 = this.f49637x;
        switch (i13) {
            case 0:
                interfaceC28601c1.setValue((C13981u) obj);
                return c23454a0;
            case 1:
                return AbstractC14148j.m40320d(interfaceC28601c1, (InterfaceC11732a) obj);
            case 2:
                return AbstractC14296c.m40853P(interfaceC28601c1, (EnumC34058c) obj);
            case 3:
                return AbstractC14465g.m41240k(interfaceC28601c1, ((Boolean) obj).booleanValue());
            case 4:
                return AbstractC14465g.m41241l(interfaceC28601c1, ((Boolean) obj).booleanValue());
            case 5:
                return AbstractC14466h.m41257o(interfaceC28601c1, (String) obj);
            case 6:
                return AbstractC14468j.m41277n(interfaceC28601c1, (String) obj);
            case 7:
                return AbstractC14468j.m41278o(interfaceC28601c1, ((Boolean) obj).booleanValue());
            case 8:
                return AbstractC14888c.m42961g(interfaceC28601c1, (C39180l) obj);
            case 9:
                InterfaceC22131e interfaceC22131e = (InterfaceC22131e) obj;
                long j7 = ((C17919x) interfaceC28601c1.getValue()).f69639a;
                float fMo743q0 = interfaceC22131e.mo743q0(AbstractC15133r7.f56711a);
                float fMo743q1 = interfaceC22131e.mo743q0(AbstractC15133r7.f56712b);
                float f13 = fMo743q1 / 2;
                float f14 = fMo743q0 - f13;
                interfaceC22131e.mo732d0(j7, (((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC22131e.mo721B0() & 4294967295L)))) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC22131e.mo721B0() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(f14) << 32), (496 & 8) != 0 ? 0.0f : fMo743q1, (496 & 16) != 0 ? 0 : 1, (496 & 32) != 0 ? null : null);
                return c23454a0;
            case 10:
                interfaceC28601c1.setValue(new C39174f(((int) (((C39180l) obj).f168422a & 4294967295L)) / Resources.getSystem().getDisplayMetrics().density));
                return c23454a0;
            case 11:
                return AbstractC15850e.m44708D(interfaceC28601c1, (String) obj);
            case 12:
                return AbstractC16233g.m45949F(interfaceC28601c1, (String) obj);
            case 13:
                Float f15 = (Float) obj;
                f15.getClass();
                ((Function1) interfaceC28601c1.getValue()).invoke(f15);
                return c23454a0;
            case 14:
                Float f16 = (Float) obj;
                f16.getClass();
                return Float.valueOf(((Number) ((Function1) interfaceC28601c1.getValue()).invoke(f16)).floatValue());
            case 15:
                Function3 content = (Function3) obj;
                AbstractC22676k.m65750j(content, "content");
                interfaceC28601c1.setValue(content);
                return c23454a0;
            case 16:
                C28596b0 c28596b0 = AbstractC16501f0.f63424a;
                interfaceC28601c1.setValue((C39180l) obj);
                return c23454a0;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC16552s.m46825n(interfaceC28601c1, (C23277r0) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC16932d.m47651o(interfaceC28601c1, (InterfaceC39147y) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC17024b.m48030n(interfaceC28601c1, (UnitSystem) obj);
            case 20:
                return AbstractC18114k.m51998j(interfaceC28601c1, (EnumC35690s) obj);
            case 21:
                return AbstractC18333d.m52743A(interfaceC28601c1, (InterfaceC39147y) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return FeatureEducationDebugFragment.m21350E(interfaceC28601c1, (String) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC21048g.m58872z0(interfaceC28601c1, (C23277r0) obj);
            case 24:
                return AbstractC21789d.m61636o(interfaceC28601c1, (C39174f) obj);
            case 25:
                return AbstractC21789d.m61637p(interfaceC28601c1, (C39174f) obj);
            case 26:
                return AbstractC21856h.m61904m(interfaceC28601c1, ((Integer) obj).intValue());
            case 27:
                return AbstractC21866r.m61965l(interfaceC28601c1, (String) obj);
            case 28:
                return AbstractC21883n.m62055C(interfaceC28601c1, (String) obj);
            default:
                return AbstractC21897e.m62250v(interfaceC28601c1, (C16094a) obj);
        }
    }
}
