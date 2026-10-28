package p163g1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.nestedscroll.AbstractC1129a;
import androidx.compose.p018ui.layout.AbstractC1132b;
import androidx.compose.runtime.Composer;
import b30.C2567l4;
import bc3.InterfaceC2994c0;
import bm2.C3433d0;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import eg.C13161j;
import ep1.C13412g;
import hg3.AbstractC17269i;
import java.util.LinkedHashMap;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p180h0.EnumC16377d2;
import p208i2.InterfaceC17869a1;
import p209i3.AbstractC18032n;
import p291l0.AbstractC22989q;
import p291l0.InterfaceC23004v;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p636y3.C39169a;
import p636y3.C39180l;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32417h;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: g1.k2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15058k2 implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC2994c0 f56374E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC17869a1 f56375F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ long f56376G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ long f56377H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ float f56378I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ C37816b f56379J;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean f56380w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15136s0 f56381x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C37816b f56382y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f56383z;

    public C15058k2(boolean z4, C15136s0 c15136s0, C37816b c37816b, long j7, InterfaceC2994c0 interfaceC2994c0, InterfaceC17869a1 interfaceC17869a1, long j13, long j14, float f13, C37816b c37816b2) {
        this.f56380w = z4;
        this.f56381x = c15136s0;
        this.f56382y = c37816b;
        this.f56383z = j7;
        this.f56374E = interfaceC2994c0;
        this.f56375F = interfaceC17869a1;
        this.f56376G = j13;
        this.f56377H = j14;
        this.f56378I = f13;
        this.f56379J = c37816b2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC23004v interfaceC23004v = (InterfaceC23004v) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((C28655q) composer).m87153g(interfaceC23004v) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(iIntValue & 1, (iIntValue & 19) != 18)) {
            C1101c c1101c = (C1101c) interfaceC23004v;
            final float fM124764h = C39169a.m124764h(c1101c.f4585b);
            long j7 = c1101c.f4585b;
            final boolean z4 = C39169a.m124765i(j7) > C39169a.m124764h(j7);
            InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            float fMo733e0 = interfaceC39171c.mo733e0(C39169a.m124765i(j7));
            float fMo733e1 = interfaceC39171c.mo733e0(C39169a.m124764h(j7));
            Modifier modifierM3495a = C2314t.f9131w;
            Modifier modifierM3423t = AbstractC1102d.m3423t(modifierM3495a, 0.0f, 0.0f, fMo733e0, fMo733e1, 3);
            boolean z13 = this.f56380w;
            final C15136s0 c15136s0 = this.f56381x;
            if (z13) {
                modifierM3495a = AbstractC1129a.m3495a(modifierM3495a, c15136s0.f56748b, null);
            }
            Modifier modifierM16786l = AbstractC5583n.m16786l(modifierM3495a, c15136s0.f56747a, EnumC16377d2.f62971w, this.f56380w, c28655q.m87161k(AbstractC2453v1.f9575n) == EnumC39181m.f168424x, 48);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM16786l);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            this.f56382y.invoke(c28655q, 0);
            boolean zM87155h = c28655q.m87155h(z13) | c28655q.m87157i(c15136s0);
            InterfaceC2994c0 interfaceC2994c0 = this.f56374E;
            boolean zM87157i = zM87155h | c28655q.m87157i(interfaceC2994c0);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C3433d0(z13, c15136s0, interfaceC2994c0, 4);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC15108p2.m43171b(this.f56383z, (InterfaceC4339a) objM87133R, ((EnumC15146t0) c15136s0.f56747a.f55771h.getValue()) != EnumC15146t0.f56806w, c28655q, 0);
            String strM101177H = AbstractC32417h.m101177H(c28655q, 0);
            boolean zM87147d = c28655q.m87147d(fM124764h) | c28655q.m87155h(z4) | c28655q.m87157i(c15136s0);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87147d || objM87133R2 == c28676v0) {
                objM87133R2 = new Function1() { // from class: g1.i2
                    /* JADX WARN: Code duplicated, block: B:27:0x0096 A[PHI: r3
                      0x0096: PHI (r3v11 g1.t0) = (r3v9 g1.t0), (r3v10 g1.t0) binds: [B:26:0x0094, B:29:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        float f13 = (int) (((C39180l) obj4).f168422a & 4294967295L);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        EnumC15146t0 enumC15146t0 = EnumC15146t0.f56806w;
                        float f14 = fM124764h;
                        linkedHashMap.put(enumC15146t0, Float.valueOf(f14));
                        float f15 = 0.5f * f14;
                        if (f13 > f15 || z4) {
                            linkedHashMap.put(EnumC15146t0.f56807x, Float.valueOf(f15));
                        }
                        if (f13 > 0.0f) {
                            linkedHashMap.put(EnumC15146t0.f56808y, Float.valueOf(Math.max(0.0f, f14 - f13)));
                        }
                        C15059k3 c15059k3 = new C15059k3(linkedHashMap);
                        C15136s0 c15136s1 = c15136s0;
                        C14947a0 c14947a0 = c15136s1.f56747a;
                        C14947a0 c14947a1 = c15136s1.f56747a;
                        if (c14947a0.m43070e().f56384a.size() <= 0 && linkedHashMap.containsKey((EnumC15146t0) c14947a1.f55770g.getValue())) {
                            enumC15146t0 = (EnumC15146t0) c14947a1.f55770g.getValue();
                        } else {
                            int iOrdinal = ((EnumC15146t0) c14947a1.f55771h.getValue()).ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal != 1 && iOrdinal != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                EnumC15146t0 enumC15146t1 = EnumC15146t0.f56807x;
                                if (linkedHashMap.containsKey(enumC15146t1)) {
                                    enumC15146t0 = enumC15146t1;
                                } else {
                                    enumC15146t1 = EnumC15146t0.f56808y;
                                    if (linkedHashMap.containsKey(enumC15146t1)) {
                                        enumC15146t0 = enumC15146t1;
                                    }
                                }
                            }
                        }
                        c14947a1.m43076k(c15059k3, enumC15146t0);
                        return C23454a0.f92919a;
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM3502b = AbstractC1132b.m3502b(modifierM3423t, (Function1) objM87133R2);
            boolean zM87157i2 = c28655q.m87157i(c15136s0);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C13161j(c15136s0, 14);
                c28655q.m87172p0(objM87133R3);
            }
            Modifier modifierM3390l = AbstractC1099a.m3390l(modifierM3502b, (Function1) objM87133R3);
            boolean zM87153g = c28655q.m87153g(strM101177H) | c28655q.m87157i(c15136s0) | c28655q.m87157i(interfaceC2994c0);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87153g || objM87133R4 == c28676v0) {
                objM87133R4 = new C13412g(strM101177H, c15136s0, interfaceC2994c0, 12);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC17269i.m48898k(AbstractC18032n.m51775c(modifierM3390l, false, (Function1) objM87133R4), this.f56375F, this.f56376G, this.f56377H, null, this.f56378I, AbstractC37817c.m121344e(1691510868, c28655q, new C2567l4(this.f56379J, 7)), c28655q, 1572864, 16);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
