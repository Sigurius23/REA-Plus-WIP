package x30;

import a40.AbstractC0357b;
import a40.AbstractC0359d;
import a40.AbstractC0361f;
import a40.InterfaceC0356a;
import a40.InterfaceC0358c;
import a40.InterfaceC0360e;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b30.C2555k0;
import b30.C2562l;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bi.AbstractC3269g;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ch.C4594o;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.whoop.android.R;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13045h2;
import ec3.C13052j1;
import ec3.C13060l1;
import ec3.C13081r1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import g40.AbstractC15416r3;
import g40.C15355g1;
import g40.C15396n3;
import g40.C15401o3;
import g40.C15406p3;
import g40.C15411q3;
import g40.C15426t3;
import g40.C15431u3;
import g40.C15436v3;
import g40.C15446x3;
import g40.InterfaceC15391m3;
import g40.InterfaceC15421s3;
import g40.InterfaceC15450y2;
import h02.C16587n0;
import hc3.C17171d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import n53.C26318e;
import p042c2.EnumC3869n;
import p127ev.AbstractC13673n;
import p33.C28820m;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p479s4.AbstractC32128i;
import p499t9.C33623c0;
import p537ux.InterfaceC35320a;
import p537ux.InterfaceC35322b;
import p545v6.C35728q;
import p599wz.C37722h1;
import p634y1.AbstractC39038k;
import p636y3.EnumC39181m;
import p695zx.C41185g;
import p695zx.C41192n;
import p695zx.C41197s;
import p695zx.C41198t;
import p695zx.InterfaceC41183e;
import p696zy.C41210b;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;
import se.AbstractC32416g;
import sz.C33151q;
import uo1.C35141b;
import vx0.C36553a;
import wb3.AbstractC37056f;
import wr1.C37572f;
import y00.C38783b;
import y00.EnumC38853i;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: x30.p0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37917p0 implements InterfaceC15391m3 {

    /* JADX INFO: renamed from: A */
    public final C26318e f162342A;

    /* JADX INFO: renamed from: B */
    public final C26318e f162343B;

    /* JADX INFO: renamed from: C */
    public final C26318e f162344C;

    /* JADX INFO: renamed from: D */
    public final C26318e f162345D;

    /* JADX INFO: renamed from: a */
    public final EnumC3869n f162346a;

    /* JADX INFO: renamed from: b */
    public final C37938y f162347b;

    /* JADX INFO: renamed from: c */
    public final String f162348c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC35320a f162349d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2994c0 f162350e;

    /* JADX INFO: renamed from: f */
    public final C41197s f162351f;

    /* JADX INFO: renamed from: g */
    public final int f162352g;

    /* JADX INFO: renamed from: h */
    public final C13081r1 f162353h;

    /* JADX INFO: renamed from: i */
    public final C13045h2 f162354i;

    /* JADX INFO: renamed from: j */
    public final C13081r1 f162355j;

    /* JADX INFO: renamed from: k */
    public final C13045h2 f162356k;

    /* JADX INFO: renamed from: l */
    public final C26318e f162357l;

    /* JADX INFO: renamed from: m */
    public final EnumC39181m f162358m;

    /* JADX INFO: renamed from: n */
    public final C26318e f162359n;

    /* JADX INFO: renamed from: o */
    public final boolean f162360o;

    /* JADX INFO: renamed from: p */
    public final C13045h2 f162361p;

    /* JADX INFO: renamed from: q */
    public final List f162362q;

    /* JADX INFO: renamed from: r */
    public final C13045h2 f162363r;

    /* JADX INFO: renamed from: s */
    public final C26318e f162364s;

    /* JADX INFO: renamed from: t */
    public final C13081r1 f162365t;

    /* JADX INFO: renamed from: u */
    public final InterfaceC13037f2 f162366u;

    /* JADX INFO: renamed from: v */
    public final C13081r1 f162367v;

    /* JADX INFO: renamed from: w */
    public final C13081r1 f162368w;

    /* JADX INFO: renamed from: x */
    public final C13045h2 f162369x;

    /* JADX INFO: renamed from: y */
    public final C13045h2 f162370y;

    /* JADX INFO: renamed from: z */
    public final C26318e f162371z;

    public C37917p0(C37938y c37938y, C41192n cardAccountRangeRepository, InterfaceC30063j interfaceC30063j, InterfaceC30063j interfaceC30063j2, String str, InterfaceC37922r interfaceC37922r, InterfaceC35320a interfaceC35320a, InterfaceC35322b interfaceC35322b) {
        List list;
        EnumC38853i enumC38853i;
        EnumC38853i enumC38853i2;
        boolean z4;
        Object c15446x3;
        C41198t c41198t = new C41198t();
        C17171d c17171dM8708b = AbstractC3006f0.m8708b(interfaceC30063j);
        C41197s c41197s = new C41197s(cardAccountRangeRepository, interfaceC30063j, interfaceC30063j2, c41198t, interfaceC35320a, interfaceC35322b, null, c17171dM8708b, 64);
        AbstractC22676k.m65750j(cardAccountRangeRepository, "cardAccountRangeRepository");
        this.f162346a = EnumC3869n.f15808H;
        this.f162347b = c37938y;
        this.f162348c = str;
        this.f162349d = interfaceC35320a;
        this.f162350e = c17171dM8708b;
        this.f162351f = c41197s;
        this.f162352g = c37938y.f162414e;
        this.f162353h = AbstractC3269g.m9493Z(c37938y.f162413d);
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c("");
        this.f162354i = c13045h2M36593c;
        C13081r1 c13081r1M36598h = AbstractC13091v.m36598h(c13045h2M36593c);
        this.f162355j = c13081r1M36598h;
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(null);
        this.f162356k = c13045h2M36593c2;
        final int i13 = 0;
        this.f162357l = AbstractC3269g.m9509p(c13081r1M36598h, c13045h2M36593c2, new InterfaceC4351m(this) { // from class: x30.g0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C37917p0 f162242x;

            {
                this.f162242x = this;
            }

            /* JADX WARN: Code duplicated, block: B:31:0x0084  */
            /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v9 java.lang.Object, still in use, count: 2, list:
                  (r0v9 java.lang.Object) from 0x007f: PHI (r0 I:??) = (r0v7 java.lang.Object), (r0v9 java.lang.Object) binds: [B:28:0x007e, B:53:0x007f] A[DONT_GENERATE, DONT_INLINE]
                  (r0v9 java.lang.Object) from 0x0075: CHECK_CAST (y00.i) (r0v9 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
                */
            @Override // c93.InterfaceC4351m
            public final java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9) {
                /*
                    Method dump skipped, instruction units count: 208
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: x30.C37890g0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        });
        this.f162358m = EnumC39181m.f168423w;
        C26318e c26318eM9484M = AbstractC3269g.m9484M(c13045h2M36593c, new C35141b(this, 29));
        this.f162359n = AbstractC3269g.m9484M(c13045h2M36593c, new C37722h1(14));
        boolean z13 = interfaceC37922r instanceof C37916p;
        this.f162360o = z13;
        C25271y c25271y = C25271y.f99162w;
        C13045h2 c13045h2M36593c3 = AbstractC13091v.m36593c(c25271y);
        this.f162361p = c13045h2M36593c3;
        if (z13) {
            list = ((C37916p) interfaceC37922r).f162340a;
        } else {
            if (!(interfaceC37922r instanceof C37919q)) {
                throw new NoWhenBranchMatchedException();
            }
            list = c25271y;
        }
        this.f162362q = list;
        if (z13) {
            enumC38853i = ((C37916p) interfaceC37922r).f162341b;
        } else {
            if (!(interfaceC37922r instanceof C37919q)) {
                throw new NoWhenBranchMatchedException();
            }
            enumC38853i = null;
        }
        C13045h2 c13045h2M36593c4 = AbstractC13091v.m36593c(enumC38853i);
        this.f162363r = c13045h2M36593c4;
        final int i14 = 1;
        C26318e c26318eM9509p = AbstractC3269g.m9509p(c13045h2M36593c4, c13045h2M36593c3, new InterfaceC4351m(this) { // from class: x30.g0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C37917p0 f162242x;

            {
                this.f162242x = this;
            }

            /* JADX WARN: Code duplicated, block: B:31:0x0084  */
            /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v9 java.lang.Object, still in use, count: 2, list:
                  (r0v9 java.lang.Object) from 0x007f: PHI (r0 I:??) = (r0v7 java.lang.Object), (r0v9 java.lang.Object) binds: [B:28:0x007e, B:53:0x007f] A[DONT_GENERATE, DONT_INLINE]
                  (r0v9 java.lang.Object) from 0x0075: CHECK_CAST (y00.i) (r0v9 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                */
            @Override // c93.InterfaceC4351m
            public final java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9) {
                /*
                    Method dump skipped, instruction units count: 208
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: x30.C37890g0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        });
        this.f162364s = c26318eM9509p;
        C13045h2 c13045h2 = c41197s.f177742m;
        C13060l1 c13060l1 = new C13060l1(c13045h2M36593c, new C4594o(c13045h2, 10), new C2555k0(this, null, 2), 1);
        C38783b c38783b = (C38783b) AbstractC25265s.m74100H0(((InterfaceC41183e) c13045h2.getValue()).mo133829a());
        String str2 = (String) c13081r1M36598h.f45200w.getValue();
        if (c38783b == null || (enumC38853i2 = c38783b.f166934y.f166885x) == null) {
            EnumC38853i.f167238M.getClass();
            enumC38853i2 = (EnumC38853i) AbstractC25265s.m74100H0(C33623c0.m106240p(str2));
            if (enumC38853i2 == null) {
                enumC38853i2 = EnumC38853i.Unknown;
            }
        }
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13081r1 c13081r1M36587M = AbstractC13091v.m36587M(c13060l1, c17171dM8708b, c13021b2, enumC38853i2);
        this.f162365t = c13081r1M36587M;
        this.f162366u = z13 ? AbstractC3269g.m9509p(c13045h2M36593c3, c26318eM9509p, new C35728q(26, (byte) 0)) : c13081r1M36587M;
        this.f162367v = AbstractC13091v.m36587M(AbstractC13091v.m36605o(c13045h2M36593c, c13045h2M36593c3, c26318eM9509p, c13045h2, new C37914o0(this, null)), c17171dM8708b, c13021b2, m121448u((String) c13045h2M36593c.getValue(), (List) c13045h2M36593c3.getValue(), (EnumC38853i) ((InterfaceC4339a) c26318eM9509p.f104635y).invoke(), (C38783b) AbstractC25265s.m74100H0(((InterfaceC41183e) c13045h2.getValue()).mo133829a())));
        C13052j1 c13052j1M36606p = AbstractC13091v.m36606p(c13081r1M36587M, c13045h2M36593c, new C4594o(c13045h2, 9), new C2562l(this, null, 3));
        EnumC38853i brand = (EnumC38853i) c13081r1M36587M.f45200w.getValue();
        String number = (String) c13045h2M36593c.getValue();
        C38783b c38783bM133833a = c41197s.m133833a();
        int iM124354c = c38783bM133833a != null ? c38783bM133833a.f166933x : brand.m124354c(number);
        AbstractC22676k.m65750j(brand, "brand");
        AbstractC22676k.m65750j(number, "number");
        if (AbstractC39414r.m125890i0(number)) {
            c15446x3 = C15426t3.f57978b;
        } else {
            int i15 = 0;
            C15436v3 c15436v3 = (c37938y.f162411b.mo112179o(brand) || (c37938y.f162410a && number.length() <= c37938y.f162415f)) ? null : new C15436v3(R.string.stripe_disallowed_card_brand, AbstractC37056f.m118958J(brand.f167261x), false);
            if (c15436v3 != null) {
                c15446x3 = c15436v3;
            } else if (brand == EnumC38853i.Unknown) {
                c15446x3 = new C15436v3(R.string.stripe_invalid_card_number, 2, (List) null);
            } else {
                boolean z14 = brand.m124354c(number) != -1;
                InterfaceC35322b interfaceC35322b2 = c37938y.f162412c;
                ArrayList arrayList = new ArrayList();
                for (Object obj : c25271y) {
                    if (!((C38783b) obj).f166932w.f167079y) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    z4 = false;
                    break;
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (interfaceC35322b2.mo112183F(((C38783b) it.next()).f166935z)) {
                            z4 = true;
                            break;
                        }
                    } else {
                        z4 = false;
                        break;
                    }
                }
                boolean z15 = (number.length() < c37938y.f162416g || arrayList.isEmpty() || z4) ? false : true;
                Integer numMo112182A = interfaceC35322b2.mo112182A();
                numMo112182A = (numMo112182A == null || !z15) ? null : numMo112182A;
                if (!z14 || number.length() >= iM124354c) {
                    int length = number.length() - 1;
                    boolean z16 = true;
                    while (true) {
                        if (-1 < length) {
                            char cCharAt = number.charAt(length);
                            if (Character.isDigit(cCharAt)) {
                                int numericValue = Character.getNumericValue(cCharAt);
                                boolean z17 = !z16;
                                numericValue = z16 ? numericValue : numericValue * 2;
                                if (numericValue > 9) {
                                    numericValue -= 9;
                                }
                                i15 += numericValue;
                                length--;
                                z16 = z17;
                            }
                        } else if (i15 % 10 == 0) {
                            c15446x3 = (z14 && number.length() == iM124354c) ? numMo112182A != null ? new C15446x3(new C15355g1(numMo112182A.intValue())) : new C15446x3(null) : new C15436v3(R.string.stripe_invalid_card_number, 6, (List) null);
                        }
                        c15446x3 = new C15436v3(R.string.stripe_invalid_card_number, 2, (List) null);
                    }
                } else {
                    c15446x3 = numMo112182A != null ? new C15436v3(new C15355g1(numMo112182A.intValue()), false) : new C15431u3(R.string.stripe_invalid_card_number);
                }
            }
        }
        C13081r1 c13081r1M36587M2 = AbstractC13091v.m36587M(c13052j1M36606p, c17171dM8708b, c13021b2, c15446x3);
        this.f162368w = c13081r1M36587M2;
        Boolean bool = Boolean.FALSE;
        C13045h2 c13045h2M36593c5 = AbstractC13091v.m36593c(bool);
        this.f162369x = c13045h2M36593c5;
        C13045h2 c13045h2M36593c6 = AbstractC13091v.m36593c(bool);
        this.f162370y = c13045h2M36593c6;
        this.f162371z = c41197s.f177739j;
        C26318e c26318eM9513t = AbstractC3269g.m9513t(c13081r1M36587M2, c13045h2M36593c6, c13045h2M36593c5, new C36553a(19));
        this.f162342A = c26318eM9513t;
        this.f162343B = AbstractC3269g.m9509p(c26318eM9513t, c13081r1M36587M2, new C35728q(27, (byte) 0));
        C26318e c26318eM9484M2 = AbstractC3269g.m9484M(c13081r1M36587M2, new C37722h1(15));
        this.f162344C = c26318eM9484M2;
        this.f162345D = AbstractC3269g.m9509p(c26318eM9484M2, c26318eM9484M, new C35728q(25, (byte) 0));
        mo43573s(str == null ? "" : str);
        AbstractC3006f0.m8732z(c17171dM8708b, interfaceC30063j, null, new C33151q(this, null, 16), 2);
    }

    @Override // g40.InterfaceC15391m3
    /* JADX INFO: renamed from: a */
    public final InterfaceC13037f2 mo43557a() {
        return this.f162367v;
    }

    @Override // g40.InterfaceC15455z2
    /* JADX INFO: renamed from: b */
    public final void mo43558b(boolean z4) {
        AbstractC13673n.m38550B(z4, this.f162369x, null);
    }

    @Override // g40.InterfaceC15379k1
    /* JADX INFO: renamed from: c */
    public final InterfaceC13037f2 mo43559c() {
        return this.f162344C;
    }

    @Override // g40.InterfaceC15391m3
    /* JADX INFO: renamed from: d */
    public final InterfaceC13037f2 mo43560d() {
        return this.f162357l;
    }

    @Override // g40.InterfaceC15391m3
    /* JADX INFO: renamed from: e */
    public final InterfaceC13037f2 mo43561e() {
        return AbstractC3269g.m9493Z(null);
    }

    @Override // g40.InterfaceC15455z2
    /* JADX INFO: renamed from: f */
    public final InterfaceC13037f2 mo43544f() {
        return this.f162343B;
    }

    @Override // g40.InterfaceC15391m3
    /* JADX INFO: renamed from: g */
    public final void mo43562g(boolean z4) {
        AbstractC13673n.m38550B(z4, this.f162370y, null);
    }

    @Override // g40.InterfaceC15391m3
    public final C26318e getContentDescription() {
        return this.f162359n;
    }

    @Override // g40.InterfaceC15391m3
    public final InterfaceC13037f2 getLabel() {
        return this.f162353h;
    }

    @Override // g40.InterfaceC15391m3
    public final EnumC39181m getLayoutDirection() {
        return this.f162358m;
    }

    @Override // g40.InterfaceC15391m3
    public final InterfaceC13037f2 getLoading() {
        return this.f162371z;
    }

    @Override // g40.InterfaceC15391m3
    /* JADX INFO: renamed from: h */
    public final int mo43563h() {
        return 0;
    }

    @Override // g40.InterfaceC15445x2
    /* JADX INFO: renamed from: i */
    public final void mo43545i(boolean z4, InterfaceC15450y2 interfaceC15450y2, Modifier modifier, Set set, IdentifierSpec identifierSpec, Composer composer, int i13) {
        Object c28820m;
        boolean z13;
        AbstractC22676k.m65750j(modifier, "modifier");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1792651236);
        InterfaceC0360e interfaceC0360e = (InterfaceC0360e) c28655q.m87161k(AbstractC0361f.f1242a);
        InterfaceC0358c interfaceC0358c = (InterfaceC0358c) c28655q.m87161k(AbstractC0359d.f1241a);
        InterfaceC0356a interfaceC0356a = (InterfaceC0356a) c28655q.m87161k(AbstractC0357b.f1240a);
        Object[] objArr = new Object[0];
        c28655q.m87150e0(-1824726589);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = new C37572f(16);
            c28655q.m87172p0(objM87133R);
        }
        c28655q.m87173q(false);
        InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124459e(objArr, null, (InterfaceC4339a) objM87133R, c28655q, 3072, 6);
        Object[] objArr2 = new Object[0];
        c28655q.m87150e0(-1824722568);
        Object objM87133R2 = c28655q.m87133R();
        if (objM87133R2 == c28676v0) {
            objM87133R2 = new C37572f(17);
            c28655q.m87172p0(objM87133R2);
        }
        c28655q.m87173q(false);
        InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) AbstractC39038k.m124459e(objArr2, null, (InterfaceC4339a) objM87133R2, c28655q, 3072, 6);
        c28655q.m87150e0(-1824719703);
        boolean zM87157i = c28655q.m87157i(this) | c28655q.m87157i(interfaceC0360e) | c28655q.m87153g(interfaceC28601c1) | c28655q.m87157i(interfaceC0358c);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i || objM87133R3 == c28676v0) {
            z13 = false;
            c28820m = new C28820m(this, interfaceC0360e, interfaceC0358c, interfaceC28601c1, null, 10);
            c28655q.m87172p0(c28820m);
        } else {
            z13 = false;
            c28820m = objM87133R3;
        }
        c28655q.m87173q(z13);
        C23454a0 c23454a0 = C23454a0.f92919a;
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) c28820m, c23454a0);
        c28655q.m87150e0(-1824683889);
        boolean zM87157i2 = c28655q.m87157i(this) | c28655q.m87153g(interfaceC28601c2) | c28655q.m87157i(interfaceC0356a);
        Object objM87133R4 = c28655q.m87133R();
        if (zM87157i2 || objM87133R4 == c28676v0) {
            C37902k0 c37902k0 = new C37902k0(this, interfaceC28601c2, interfaceC0356a, null, 0);
            c28655q.m87172p0(c37902k0);
            objM87133R4 = c37902k0;
        }
        c28655q.m87173q(z13);
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, c23454a0);
        AbstractC32416g.m101145b(this, z4, interfaceC15450y2, modifier, set, identifierSpec, c28655q, (i13 & 8190) | (IdentifierSpec.$stable << 12) | (57344 & i13) | (458752 & i13));
        c28655q.m87173q(z13);
    }

    @Override // g40.InterfaceC15379k1
    /* JADX INFO: renamed from: j */
    public final InterfaceC13037f2 mo43564j() {
        return this.f162345D;
    }

    @Override // g40.InterfaceC15391m3
    /* JADX INFO: renamed from: k */
    public final EnumC3869n mo43565k() {
        return this.f162346a;
    }

    @Override // g40.InterfaceC15391m3
    /* JADX INFO: renamed from: l */
    public final String mo43566l() {
        return this.f162348c;
    }

    @Override // g40.InterfaceC15391m3
    /* JADX INFO: renamed from: m */
    public final boolean mo43567m() {
        return false;
    }

    @Override // g40.InterfaceC15391m3
    /* JADX INFO: renamed from: n */
    public final void mo43568n(C15396n3 item) {
        AbstractC22676k.m65750j(item, "item");
        C33623c0 c33623c0 = EnumC38853i.f167238M;
        String str = item.f57847a;
        c33623c0.getClass();
        this.f162363r.m36570j(C33623c0.m106236i(str));
    }

    @Override // g40.InterfaceC15391m3
    /* JADX INFO: renamed from: o */
    public final int mo43569o() {
        return this.f162352g;
    }

    @Override // g40.InterfaceC15391m3
    /* JADX INFO: renamed from: p */
    public final InterfaceC13037f2 mo43570p() {
        return this.f162355j;
    }

    @Override // g40.InterfaceC15391m3
    /* JADX INFO: renamed from: q */
    public final InterfaceC15421s3 mo43571q(String displayFormatted) {
        AbstractC22676k.m65750j(displayFormatted, "displayFormatted");
        this.f162347b.getClass();
        StringBuilder sb4 = new StringBuilder();
        int length = displayFormatted.length();
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = displayFormatted.charAt(i13);
            if (Character.isDigit(cCharAt)) {
                sb4.append(cCharAt);
            }
        }
        this.f162354i.m36570j(sb4.toString());
        this.f162351f.m133834b(new C41185g(displayFormatted), this.f162360o);
        return null;
    }

    @Override // g40.InterfaceC15391m3
    /* JADX INFO: renamed from: r */
    public final InterfaceC13037f2 mo43572r() {
        return this.f162368w;
    }

    @Override // g40.InterfaceC15379k1
    /* JADX INFO: renamed from: s */
    public final void mo43573s(String rawValue) {
        AbstractC22676k.m65750j(rawValue, "rawValue");
        this.f162347b.getClass();
        mo43571q(rawValue);
    }

    @Override // g40.InterfaceC15391m3
    /* JADX INFO: renamed from: t */
    public final InterfaceC13037f2 mo43574t() {
        return this.f162342A;
    }

    /* JADX INFO: renamed from: u */
    public final AbstractC15416r3 m121448u(String str, List list, EnumC38853i enumC38853i, C38783b c38783b) {
        boolean z4 = this.f162360o;
        C15396n3 c15396n3 = null;
        InterfaceC35320a interfaceC35320a = this.f162349d;
        if (!z4 || str.length() <= 0) {
            if (c38783b != null) {
                return new C15411q3(c38783b.f166934y.f166885x.f167262y, false, (C16587n0) null, 10);
            }
            EnumC38853i.f167238M.getClass();
            List listM106240p = C33623c0.m106240p(str);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM106240p) {
                if (interfaceC35320a.mo112179o((EnumC38853i) obj)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new C15411q3(((EnumC38853i) it.next()).f167262y, false, (C16587n0) null, 10));
            }
            List listM74156w1 = AbstractC25265s.m74156w1(arrayList2, 3);
            ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList3.add(new C15411q3(((EnumC38853i) it3.next()).f167262y, false, (C16587n0) null, 10));
            }
            return new C15406p3(listM74156w1, AbstractC25265s.m74161z0(arrayList3, 3));
        }
        EnumC38853i enumC38853i2 = EnumC38853i.Unknown;
        C15396n3 c15396n4 = new C15396n3(enumC38853i2.f167260w, AbstractC32128i.m100054h(R.string.stripe_card_brand_choice_no_selection), enumC38853i2.f167262y, true);
        if (list.size() == 1) {
            EnumC38853i enumC38853i3 = (EnumC38853i) list.get(0);
            c15396n3 = new C15396n3(enumC38853i3.f167260w, AbstractC32128i.m100055i(enumC38853i3.f167261x), enumC38853i3.f167262y, true);
        } else if (AbstractC37905l0.f162294a[enumC38853i.ordinal()] != 1) {
            c15396n3 = new C15396n3(enumC38853i.f167260w, AbstractC32128i.m100055i(enumC38853i.f167261x), enumC38853i.f167262y, true);
        }
        List<EnumC38853i> list2 = list;
        ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (EnumC38853i enumC38853i4 : list2) {
            boolean zMo112179o = interfaceC35320a.mo112179o(enumC38853i4);
            String str2 = enumC38853i4.f167260w;
            String str3 = enumC38853i4.f167261x;
            arrayList4.add(new C15396n3(str2, zMo112179o ? AbstractC32128i.m100055i(str3) : AbstractC32128i.m100064s(R.string.stripe_card_brand_not_accepted_with_brand, new Object[]{str3}, C25271y.f99162w), enumC38853i4.f167262y, zMo112179o));
        }
        C41210b c41210bM100054h = AbstractC32128i.m100054h(R.string.stripe_card_brand_choice_selection_header);
        if (c15396n3 != null) {
            c15396n4 = c15396n3;
        }
        return new C15401o3(c41210bM100054h, list.size() < 2, c15396n4, arrayList4);
    }
}
