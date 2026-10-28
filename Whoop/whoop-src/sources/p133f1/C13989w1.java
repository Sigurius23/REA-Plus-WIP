package p133f1;

import a20.C0162b;
import androidx.fragment.app.AbstractC1329o1;
import androidx.health.platform.client.proto.C1533u;
import bc3.AbstractC3006f0;
import bc3.EnumC2998d0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import cj1.C4762r;
import com.whoop.bot.models.feedback.AiFeedbackType;
import com.whoop.nativestore.pdp.domain.model.SizeChart;
import dt1.C12363a;
import e93.AbstractC12889b;
import ec3.C13081r1;
import eg.C13161j;
import f22.AbstractC14031c;
import fj1.AbstractC14531b;
import fj1.AbstractC14534e;
import fj1.AbstractC14541l;
import fj1.C14532c;
import fj1.C14542m;
import fy2.AbstractC14879a;
import fy2.InterfaceC14880b;
import g01.AbstractC14940c;
import g01.C14941d;
import g11.AbstractC15219c;
import g40.InterfaceC15357g3;
import g41.AbstractC15460d;
import g41.C15461e;
import gh0.AbstractC15847b;
import gt2.AbstractC16205c;
import gv1.AbstractC16236j;
import gv1.EnumC16238l;
import h02.AbstractC16562b;
import h02.AbstractC16575h0;
import h02.C16564c;
import h11.AbstractC16609d;
import h11.C16613h;
import h20.C16644d4;
import h20.C16686k4;
import h20.C16754w0;
import h20.EnumC16656f4;
import h20.EnumC16762x2;
import h31.AbstractC16812e;
import h31.C16814g;
import h41.C16847a;
import h41.C16849c;
import h51.C16929a;
import h51.C16934f;
import ht2.AbstractC17633e;
import ht2.C17637i;
import hv2.AbstractC17687i;
import hv2.C17689k;
import hy0.AbstractC17803y;
import hy0.C17738e1;
import hy0.C17750h1;
import hy0.C17791u;
import k20.C22136a;
import l20.C23236a;
import l83.C23454a0;
import m83.AbstractC25265s;
import p031b9.AbstractC2875y;
import p147ff.InterfaceC14422a;
import p163g1.C15072l6;
import p163g1.C15178w2;
import p181h2.C16617b;
import p294l3.C23254g;
import p294l3.C23277r0;
import p294l3.C23283u0;
import p294l3.C23286w;
import p390p1.C28677v1;
import p390p1.C28679w;
import p390p1.InterfaceC28601c1;
import p510u0.C34346p1;
import p510u0.C34354s0;
import p510u0.EnumC34315f0;
import p636y3.C39180l;
import p707gt1.AbstractC16189c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;
import q20.C29838w;
import r20.C30871i;
import s83.AbstractC32275i;
import v00.C35459c0;
import y00.C38915o4;

/* JADX INFO: renamed from: f1.w1 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C13989w1 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49924w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f49925x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f49926y;

    public /* synthetic */ C13989w1(int i13, Object obj, Object obj2) {
        this.f49924w = i13;
        this.f49925x = obj;
        this.f49926y = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b7  */
    /* JADX WARN: Type inference failed for: r8v1, types: [kotlin.jvm.functions.Function1, s83.i] */
    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        char c3;
        long j7;
        C34346p1 c34346p1M108662d;
        C34354s0 c34354s0;
        C23254g c23254g;
        C28679w c28679w;
        int i13 = this.f49924w;
        int i14 = 2;
        boolean z4 = false;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj = this.f49926y;
        Object obj2 = this.f49925x;
        switch (i13) {
            case 0:
                AbstractC3006f0.m8732z((InterfaceC2994c0) obj2, null, EnumC2998d0.f12007z, new C0162b((AbstractC32275i) obj, null), 1);
                return c23454a0;
            case 1:
                C13977s1 c13977s1 = (C13977s1) obj2;
                long j13 = ((C39180l) ((InterfaceC28601c1) obj).getValue()).f168422a;
                C16617b c16617bM39779i = c13977s1.m39779i();
                long jFloatToRawIntBits = 9205357640488583168L;
                if (c16617bM39779i != null) {
                    long j14 = c16617bM39779i.f63937a;
                    C23254g c23254gM39782l = c13977s1.m39782l();
                    if (c23254gM39782l != null && c23254gM39782l.f92135x.length() != 0) {
                        EnumC34315f0 enumC34315f0 = (EnumC34315f0) c13977s1.f49862r.getValue();
                        int i15 = enumC34315f0 == null ? -1 : AbstractC13983u1.f49884a[enumC34315f0.ordinal()];
                        if (i15 != -1) {
                            if (i15 == 1 || i15 == 2) {
                                c3 = ' ';
                                long j15 = c13977s1.m39783m().f122126b;
                                int i16 = C23283u0.f92252c;
                                j7 = j15 >> 32;
                            } else {
                                if (i15 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                c3 = ' ';
                                long j16 = c13977s1.m39783m().f122126b;
                                int i17 = C23283u0.f92252c;
                                j7 = j16 & 4294967295L;
                            }
                            int i18 = (int) j7;
                            C34354s0 c34354s1 = c13977s1.f49848d;
                            if (c34354s1 != null && (c34346p1M108662d = c34354s1.m108662d()) != null && (c34354s0 = c13977s1.f49848d) != null && (c23254g = c34354s0.f144307a.f144060a) != null) {
                                int iM36284n = AbstractC12889b.m36284n(c13977s1.f49846b.mo15749x(i18), 0, c23254g.f92135x.length());
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (c34346p1M108662d.m108651d(j14) >> c3));
                                C23277r0 c23277r0 = c34346p1M108662d.f144282a;
                                C23286w c23286w = c23277r0.f92228b;
                                int iM67374d = c23286w.m67374d(iM36284n);
                                float fM67337f = c23277r0.m67337f(iM67374d);
                                float fM67338g = c23277r0.m67338g(iM67374d);
                                float fM36283m = AbstractC12889b.m36283m(fIntBitsToFloat, Math.min(fM67337f, fM67338g), Math.max(fM67337f, fM67338g));
                                if (C39180l.m124799a(j13, 0L) || Math.abs(fIntBitsToFloat - fM36283m) <= ((int) (j13 >> c3)) / 2) {
                                    float fM67376f = c23286w.m67376f(iM67374d);
                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fM36283m)) << c3) | (((long) Float.floatToRawIntBits(((c23286w.m67372b(iM67374d) - fM67376f) / 2) + fM67376f)) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new C16617b(jFloatToRawIntBits);
            case 2:
                return AbstractC14031c.m39946t((AbstractC1329o1) obj2, (Function1) obj);
            case 3:
                return "resolved region (" + ((String) obj2) + ") from " + ((InterfaceC14422a) obj) + ' ';
            case 4:
                StringBuilder sb4 = new StringBuilder("unable to load region from ");
                sb4.append((InterfaceC14422a) obj2);
                sb4.append(": ");
                return AbstractC2875y.m8298k((Exception) obj, sb4);
            case 5:
                return AbstractC14531b.m41474g((C14532c) obj2, (Function1) obj);
            case 6:
                return AbstractC14534e.m41496h((Function1) obj2, (C4762r) obj);
            case 7:
                return AbstractC14541l.m41522h((C14542m) obj2, (Function1) obj);
            case 8:
                return AbstractC14879a.m42929k((Function1) obj2, (InterfaceC14880b) obj);
            case 9:
                return AbstractC14940c.m43040f((C14941d) obj2, (Function1) obj);
            case 10:
                C15072l6 c15072l6 = (C15072l6) obj2;
                C15178w2 c15178w2 = (C15178w2) obj;
                if (!AbstractC22676k.m65745e(c15072l6, c15178w2.f56967a)) {
                    AbstractC25265s.m74132j1(c15178w2.f56968b, new C13161j(c15072l6, 16));
                    C28677v1 c28677v1 = c15178w2.f56969c;
                    if (c28677v1 != null && (c28679w = c28677v1.f115979a) != null) {
                        c28679w.m87224r(c28677v1, null);
                    }
                }
                return c23454a0;
            case 11:
                return AbstractC15219c.m43268r((Long) obj2, (Function1) obj);
            case 12:
                ((Function1) obj2).invoke((InterfaceC15357g3) obj);
                return c23454a0;
            case 13:
                return AbstractC15460d.m43643x((C15461e) obj2, (Function1) obj);
            case 14:
                return AbstractC15847b.m44699p((Function1) obj2, (AiFeedbackType) obj);
            case 15:
                return AbstractC16189c.m45760h((Function1) obj2, (C12363a) obj);
            case 16:
                return AbstractC16236j.m45996f((Function1) obj2, (EnumC16238l) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC16562b.m46891d((Function1) obj2, (C16564c) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC16575h0.m46961A((Function1) obj2, (SizeChart) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC16609d.m47138g((C16613h) obj2, (Function1) obj);
            case 20:
                C16754w0 c16754w0 = (C16754w0) obj2;
                C22136a c22136a = (C22136a) obj;
                AbstractC29840y abstractC29840y = (AbstractC29840y) c16754w0.f43012P.f45200w.getValue();
                if (abstractC29840y != null) {
                    c22136a.m63397q(abstractC29840y);
                }
                c16754w0.m47264A();
                return c23454a0;
            case 21:
                C16686k4 c16686k4 = (C16686k4) obj2;
                C23236a c23236a = c16686k4.f64163g0;
                C22136a c22136a2 = (C22136a) obj;
                C13081r1 c13081r1 = c16686k4.f43012P;
                AbstractC29840y abstractC29840y2 = (AbstractC29840y) c13081r1.f45200w.getValue();
                if (abstractC29840y2 != null) {
                    c22136a2.m63397q(abstractC29840y2);
                }
                AbstractC29840y abstractC29840y3 = (AbstractC29840y) c13081r1.f45200w.getValue();
                if (abstractC29840y3 instanceof C29838w) {
                    C38915o4 c38915o4 = ((C29838w) abstractC29840y3).f121955x;
                    C35459c0 c35459c0 = (C35459c0) c16686k4.f43008L.getValue();
                    if (c35459c0 == null || !c23236a.m67270c(c35459c0.f150996w, c38915o4)) {
                        c16686k4.m47237C(abstractC29840y3, EnumC16656f4.f64039x);
                    } else {
                        if (c16686k4.m35331o() != EnumC16762x2.f64427w && !(((InterfaceC4339a) c16686k4.f43009M.f127270g.f104635y).invoke() instanceof C30871i)) {
                            z4 = true;
                        }
                        if (z4) {
                            c23236a.m67269b(c38915o4, new C16644d4(c16686k4, i14));
                        } else {
                            c16686k4.m47237C(abstractC29840y3, EnumC16656f4.f64039x);
                        }
                    }
                } else {
                    c16686k4.m47237C(abstractC29840y3, EnumC16656f4.f64039x);
                }
                return c23454a0;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC16812e.m47354e((C16814g) obj2, (Function1) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C16847a.m47446d((Function1) obj2, (C16849c) obj);
            case 24:
                return C16929a.m47631h((Function1) obj2, (C16934f) obj);
            case 25:
                return AbstractC17633e.m50245z((Function1) obj2, (AbstractC16205c.a) obj);
            case 26:
                return AbstractC17633e.m50215W((C17637i) obj2, (Function1) obj);
            case 27:
                return AbstractC17687i.m50454D0((Function1) obj2, (C17689k.c) obj);
            case 28:
                return AbstractC17803y.m51166k((Function1) obj2, (C17791u) obj);
            default:
                return C17738e1.m50832d((Function1) obj2, (C17750h1) obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C13989w1(Function1 function1, InterfaceC2994c0 interfaceC2994c0) {
        this.f49924w = 0;
        this.f49925x = interfaceC2994c0;
        this.f49926y = (AbstractC32275i) function1;
    }
}
