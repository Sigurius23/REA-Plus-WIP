package p748zc1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import gb1.AbstractC15673b0;
import hy0.AbstractC17763k2;
import i93.C18279e;
import i93.C18284j;
import java.util.Iterator;
import java.util.Map;
import kd1.AbstractC22399k;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import n71.AbstractC26434o;
import n71.C26435p;
import n71.C26436q;
import n71.EnumC26437r;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28617g1;
import p390p1.C28630j2;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28690z0;
import p505ts.AbstractC34132o;
import p668z1.AbstractC39968q;
import p668z1.C39967p;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: zc1.o4 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Ll83/a0;", "e", "(Landroidx/compose/runtime/Composer;I)V", "", "currentHr", "maxHr", "Ln71/r;", "j", "(II)Ln71/r;", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40422o4 {

    /* JADX INFO: renamed from: zc1.o4$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.showcase.gallery.item.LiveHeartRateMonitorGalleryKt$LiveHeartRateMonitorGallery$1$1", m100430f = "LiveHeartRateMonitorGallery.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f174381w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28690z0 f174382x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C39967p f174383y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28690z0 f174384z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC28690z0 interfaceC28690z0, C39967p c39967p, InterfaceC28690z0 interfaceC28690z1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f174382x = interfaceC28690z0;
            this.f174383y = c39967p;
            this.f174384z = interfaceC28690z1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f174382x, this.f174383y, this.f174384z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f174381w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            int iM36258X = AbstractC12889b.m36258X(((C28617g1) this.f174382x).m87022x());
            if (this.f174383y.size() >= ((C28617g1) this.f174384z).m87022x()) {
                this.f174383y.remove(0);
            }
            this.f174383y.add(new Integer(iM36258X));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m130523e(Composer composer, int i13) {
        C28617g1 c28617g1;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(745979466);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30468v(190.0f, c28655q);
            }
            InterfaceC28690z0 interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC11266d.m30468v(63.0f, c28655q);
            }
            InterfaceC28690z0 interfaceC28690z1 = (InterfaceC28690z0) objM87133R2;
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                C39967p c39967p = new C39967p();
                c39967p.addAll(AbstractC25260n.m74049W0(new Integer[]{100}));
                c28655q.m87172p0(c39967p);
                objM87133R3 = c39967p;
            }
            C39967p c39967p2 = (C39967p) objM87133R3;
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC11266d.m30468v(30.0f, c28655q);
            }
            InterfaceC28690z0 interfaceC28690z2 = (InterfaceC28690z0) objM87133R4;
            C28617g1 c28617g2 = (C28617g1) interfaceC28690z1;
            Float fValueOf = Float.valueOf(c28617g2.m87022x());
            Object objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = new a(c28617g2, c39967p2, interfaceC28690z2, null);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, fValueOf);
            Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w));
            float f13 = 4;
            C23010x c23010xM73381n = AbstractC25012a.m73381n(f13, f13, C2299e.f9111N, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44028b0);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM73381n);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            C28617g1 c28617g3 = (C28617g1) interfaceC28690z2;
            AbstractC22399k.m64473c("Max Visible Hr Points: " + AbstractC12889b.m36258X(c28617g3.m87022x()), c28655q, 0);
            float fM87022x = c28617g3.m87022x();
            C18279e c18279e = new C18279e(0.0f, 30.0f);
            Object objM87133R6 = c28655q.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = new C28630j2(c28617g3, 1);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC17763k2.m50956d(null, false, fM87022x, c18279e, 0, null, (Function1) objM87133R6, c28655q, 1572864, 51);
            C28617g1 c28617g4 = (C28617g1) interfaceC28690z0;
            AbstractC22399k.m64473c("Max Heart Rate: " + AbstractC12889b.m36258X(c28617g4.m87022x()), c28655q, 0);
            float fM87022x2 = c28617g4.m87022x();
            C18279e c18279e2 = new C18279e(150.0f, 250.0f);
            Object objM87133R7 = c28655q.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = new C28630j2(c28617g4, 2);
                c28655q.m87172p0(objM87133R7);
            }
            AbstractC17763k2.m50956d(null, false, fM87022x2, c18279e2, 0, null, (Function1) objM87133R7, c28655q, 1572864, 51);
            AbstractC22399k.m64473c("Current Heart Rate: " + AbstractC12889b.m36258X(c28617g2.m87022x()), c28655q, 0);
            float fM87022x3 = c28617g2.m87022x();
            C18279e c18279e3 = new C18279e(0.0f, 220.0f);
            Object objM87133R8 = c28655q.m87133R();
            if (objM87133R8 == c28676v0) {
                c28617g1 = c28617g2;
                objM87133R8 = new C28630j2(c28617g1, 3);
                c28655q.m87172p0(objM87133R8);
            } else {
                c28617g1 = c28617g2;
            }
            AbstractC17763k2.m50956d(null, false, fM87022x3, c18279e3, 0, null, (Function1) objM87133R8, c28655q, 1572864, 51);
            AbstractC22399k.m64473c("Live HR Monitor Interactive", c28655q, 6);
            C26435p c26435p = C26435p.f104999a;
            C26436q c26436q = (C26436q) AbstractC25265s.m74096F0(c26435p.m78254a());
            c39967p2.getClass();
            AbstractC26434o.m78209H(null, C26436q.m78255b(c26436q, AbstractC39968q.m128190e(c39967p2).f172504c, m130528j(AbstractC12889b.m36258X(c28617g1.m87022x()), AbstractC12889b.m36258X(c28617g4.m87022x())), 0, 4, null), c28655q, C26436q.f105013d << 3, 1);
            AbstractC22399k.m64473c("Live HR Monitor Samples", c28655q, 6);
            c28655q.m87150e0(-43842387);
            Iterator<T> it = c26435p.m78254a().iterator();
            while (it.hasNext()) {
                AbstractC26434o.m78209H(null, (C26436q) it.next(), c28655q, C26436q.f105013d << 3, 1);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40461s3(i13, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m130524f(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m130525g(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m130526h(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m130527i(int i13, Composer composer, int i14) {
        m130523e(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    private static final EnumC26437r m130528j(int i13, int i14) {
        Object next;
        EnumC26437r enumC26437r;
        Map mapM73990Y = AbstractC25247g0.m73990Y(new C23465k(EnumC26437r.ZONE_0, new C18284j(1, 50, 1)), new C23465k(EnumC26437r.ZONE_1, new C18284j(51, 60, 1)), new C23465k(EnumC26437r.ZONE_2, new C18284j(61, 70, 1)), new C23465k(EnumC26437r.ZONE_3, new C18284j(71, 80, 1)), new C23465k(EnumC26437r.ZONE_4, new C18284j(81, 90, 1)), new C23465k(EnumC26437r.ZONE_5, new C18284j(91, 100, 1)));
        int iM36285o = AbstractC12889b.m36285o(AbstractC12889b.m36258X((i13 * 100) / i14), new C18284j(1, 100, 1));
        Iterator it = mapM73990Y.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C18284j c18284j = (C18284j) ((Map.Entry) next).getValue();
            int i15 = c18284j.f71133w;
            if (iM36285o <= c18284j.f71134x && i15 <= iM36285o) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        return (entry == null || (enumC26437r = (EnumC26437r) entry.getKey()) == null) ? EnumC26437r.ZONE_0 : enumC26437r;
    }
}
