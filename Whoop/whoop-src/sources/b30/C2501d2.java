package b30;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import d40.AbstractC11673r;
import d40.C11662g;
import d40.C11669n;
import d40.C11671p;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import l83.C23454a0;
import m40.C25046w;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.C22971k;
import p291l0.C22976l1;
import p291l0.InterfaceC23004v;
import p329n0.C26053f;
import p329n0.C26068u;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p602x1.C37816b;
import p636y3.C39174f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.C29810c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: b30.d2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2501d2 implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f9741E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f9742F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C29810c f9743G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ C25046w f9744H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Function1 f9745I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ List f9746w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ List f9747x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f9748y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C26068u f9749z;

    public C2501d2(List list, List list2, Function1 function1, C26068u c26068u, boolean z4, int i13, C29810c c29810c, C25046w c25046w, Function1 function2) {
        this.f9746w = list;
        this.f9747x = list2;
        this.f9748y = function1;
        this.f9749z = c26068u;
        this.f9741E = z4;
        this.f9742F = i13;
        this.f9743G = c29810c;
        this.f9744H = c25046w;
        this.f9745I = function2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x006b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0086  */
    /* JADX WARN: Code duplicated, block: B:21:0x008a  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:26:0x00da  */
    /* JADX WARN: Code duplicated, block: B:34:0x014b  */
    /* JADX WARN: Code duplicated, block: B:38:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:42:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:45:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d4 A[SYNTHETIC] */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fM3403d;
        int size;
        C28655q c28655q;
        boolean zM87147d;
        Object objM87133R;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        Iterator it;
        float f18;
        C39174f c39174f;
        float f19;
        C39174f c39174f2;
        final float f24;
        float f25;
        boolean zM87157i;
        Object objM87133R2;
        boolean zM87157i2;
        Object objM87133R3;
        InterfaceC23004v BoxWithConstraints = (InterfaceC23004v) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18) {
            C28655q c28655q2 = (C28655q) composer;
            if (c28655q2.m87121F()) {
                c28655q2.m87138X();
            } else {
                fM3403d = ((C1101c) BoxWithConstraints).m3403d();
                List list = this.f9746w;
                size = list.size();
                c28655q = (C28655q) composer;
                c28655q.m87150e0(-709663121);
                c28655q.m87150e0(1221369827);
                zM87147d = c28655q.m87147d(fM3403d) | c28655q.m87149e(size);
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (zM87147d || objM87133R == c28676v0) {
                    C11662g c11662g = C11671p.f37685f;
                    f13 = fM3403d - (c11662g.f37646c + c11662g.f37644a);
                    f14 = 90;
                    f15 = size;
                    f16 = AbstractC2581n2.f10041a;
                    f17 = (size - 1) * f16;
                    if (Float.compare((f14 * f15) + f17, f13) <= 0) {
                        f19 = (f13 - f17) / f15;
                    } else {
                        it = AbstractC37056f.m118959K(Float.valueOf(0.3f), Float.valueOf(0.4f), Float.valueOf(0.5f)).iterator();
                        if (!it.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        float fFloatValue = ((Number) it.next()).floatValue();
                        f18 = f13 - f14;
                        int i13 = (int) ((f18 - (f14 * fFloatValue)) / (f14 + f16));
                        c39174f = new C39174f((f13 - (f16 * i13)) / ((i13 + 1) + fFloatValue));
                        while (it.hasNext()) {
                            float fFloatValue2 = ((Number) it.next()).floatValue();
                            float f26 = AbstractC2581n2.f10041a;
                            int i14 = (int) ((f18 - (f14 * fFloatValue2)) / (f14 + f26));
                            c39174f2 = new C39174f((f13 - (f26 * i14)) / ((i14 + 1) + fFloatValue2));
                            if (c39174f.compareTo(c39174f2) > 0) {
                                c39174f = c39174f2;
                            }
                        }
                        f19 = c39174f.f168413w;
                    }
                    objM87133R = new C39174f(f19);
                    c28655q.m87172p0(objM87133R);
                }
                f24 = ((C39174f) objM87133R).f168413w;
                c28655q.m87173q(false);
                c28655q.m87173q(false);
                f25 = ((Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenWidthDp;
                float f27 = AbstractC2581n2.f10041a;
                c28655q.m87150e0(844408973);
                boolean zM87153g = c28655q.m87153g(this.f9748y);
                List list2 = this.f9747x;
                zM87157i = zM87153g | c28655q.m87157i(list2) | c28655q.m87147d(f24) | c28655q.m87147d(f25);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    objM87133R2 = new C2667z1(this.f9748y, this.f9747x, f24, f25, null);
                    c28655q.m87172p0(objM87133R2);
                }
                c28655q.m87173q(false);
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, list2);
                C11669n c11669n = C11671p.f37680a;
                C22976l1 c22976l1M31081j = AbstractC11673r.m31081j();
                C22971k c22971kM66746i = AbstractC22977m.m66746i(f27);
                Modifier modifierM3599a = AbstractC1136a.m3599a(C2314t.f9131w, "PaymentMethodsUITestTag");
                c28655q.m87150e0(844429843);
                zM87157i2 = c28655q.m87157i(list) | c28655q.m87149e(this.f9742F) | c28655q.m87157i(this.f9743G) | c28655q.m87147d(f24) | c28655q.m87157i(this.f9744H) | c28655q.m87155h(this.f9741E) | c28655q.m87153g(this.f9745I);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i2 || objM87133R3 == c28676v0) {
                    final List list3 = this.f9746w;
                    final int i15 = this.f9742F;
                    final C29810c c29810c = this.f9743G;
                    final C25046w c25046w = this.f9744H;
                    final boolean z4 = this.f9741E;
                    final Function1 function1 = this.f9745I;
                    Function1 function2 = new Function1() { // from class: b30.y1
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            InterfaceC26064q LazyRow = (InterfaceC26064q) obj4;
                            AbstractC22676k.m65750j(LazyRow, "$this$LazyRow");
                            List list4 = list3;
                            ((C26053f) LazyRow).m77529r(list4.size(), null, new C2485b2(list4, 0), new C37816b(new C2493c2(list4, i15, c29810c, f24, c25046w, z4, function1, list4), true, -1091073711));
                            return C23454a0.f92919a;
                        }
                    };
                    c28655q.m87172p0(function2);
                    objM87133R3 = function2;
                }
                c28655q.m87173q(false);
                AbstractC22674j.m65719e(modifierM3599a, this.f9749z, c22976l1M31081j, c22971kM66746i, null, null, this.f9741E, (Function1) objM87133R3, c28655q, 24582, 104);
            }
        } else {
            fM3403d = ((C1101c) BoxWithConstraints).m3403d();
            List list4 = this.f9746w;
            size = list4.size();
            c28655q = (C28655q) composer;
            c28655q.m87150e0(-709663121);
            c28655q.m87150e0(1221369827);
            zM87147d = c28655q.m87147d(fM3403d) | c28655q.m87149e(size);
            objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (zM87147d) {
                C11662g c11662g2 = C11671p.f37685f;
                f13 = fM3403d - (c11662g2.f37646c + c11662g2.f37644a);
                f14 = 90;
                f15 = size;
                f16 = AbstractC2581n2.f10041a;
                f17 = (size - 1) * f16;
                if (Float.compare((f14 * f15) + f17, f13) <= 0) {
                    f19 = (f13 - f17) / f15;
                } else {
                    it = AbstractC37056f.m118959K(Float.valueOf(0.3f), Float.valueOf(0.4f), Float.valueOf(0.5f)).iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    float fFloatValue3 = ((Number) it.next()).floatValue();
                    f18 = f13 - f14;
                    int i16 = (int) ((f18 - (f14 * fFloatValue3)) / (f14 + f16));
                    c39174f = new C39174f((f13 - (f16 * i16)) / ((i16 + 1) + fFloatValue3));
                    while (it.hasNext()) {
                        float fFloatValue4 = ((Number) it.next()).floatValue();
                        float f28 = AbstractC2581n2.f10041a;
                        int i17 = (int) ((f18 - (f14 * fFloatValue4)) / (f14 + f28));
                        c39174f2 = new C39174f((f13 - (f28 * i17)) / ((i17 + 1) + fFloatValue4));
                        if (c39174f.compareTo(c39174f2) > 0) {
                            c39174f = c39174f2;
                        }
                    }
                    f19 = c39174f.f168413w;
                }
                objM87133R = new C39174f(f19);
                c28655q.m87172p0(objM87133R);
            } else {
                C11662g c11662g3 = C11671p.f37685f;
                f13 = fM3403d - (c11662g3.f37646c + c11662g3.f37644a);
                f14 = 90;
                f15 = size;
                f16 = AbstractC2581n2.f10041a;
                f17 = (size - 1) * f16;
                if (Float.compare((f14 * f15) + f17, f13) <= 0) {
                    f19 = (f13 - f17) / f15;
                } else {
                    it = AbstractC37056f.m118959K(Float.valueOf(0.3f), Float.valueOf(0.4f), Float.valueOf(0.5f)).iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    float fFloatValue5 = ((Number) it.next()).floatValue();
                    f18 = f13 - f14;
                    int i18 = (int) ((f18 - (f14 * fFloatValue5)) / (f14 + f16));
                    c39174f = new C39174f((f13 - (f16 * i18)) / ((i18 + 1) + fFloatValue5));
                    while (it.hasNext()) {
                        float fFloatValue6 = ((Number) it.next()).floatValue();
                        float f29 = AbstractC2581n2.f10041a;
                        int i19 = (int) ((f18 - (f14 * fFloatValue6)) / (f14 + f29));
                        c39174f2 = new C39174f((f13 - (f29 * i19)) / ((i19 + 1) + fFloatValue6));
                        if (c39174f.compareTo(c39174f2) > 0) {
                            c39174f = c39174f2;
                        }
                    }
                    f19 = c39174f.f168413w;
                }
                objM87133R = new C39174f(f19);
                c28655q.m87172p0(objM87133R);
            }
            f24 = ((C39174f) objM87133R).f168413w;
            c28655q.m87173q(false);
            c28655q.m87173q(false);
            f25 = ((Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenWidthDp;
            float f210 = AbstractC2581n2.f10041a;
            c28655q.m87150e0(844408973);
            boolean zM87153g2 = c28655q.m87153g(this.f9748y);
            List list5 = this.f9747x;
            zM87157i = zM87153g2 | c28655q.m87157i(list5) | c28655q.m87147d(f24) | c28655q.m87147d(f25);
            objM87133R2 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R2 = new C2667z1(this.f9748y, this.f9747x, f24, f25, null);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C2667z1(this.f9748y, this.f9747x, f24, f25, null);
                c28655q.m87172p0(objM87133R2);
            }
            c28655q.m87173q(false);
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, list5);
            C11669n c11669n2 = C11671p.f37680a;
            C22976l1 c22976l1M31081j2 = AbstractC11673r.m31081j();
            C22971k c22971kM66746i2 = AbstractC22977m.m66746i(f210);
            Modifier modifierM3599a2 = AbstractC1136a.m3599a(C2314t.f9131w, "PaymentMethodsUITestTag");
            c28655q.m87150e0(844429843);
            zM87157i2 = c28655q.m87157i(list4) | c28655q.m87149e(this.f9742F) | c28655q.m87157i(this.f9743G) | c28655q.m87147d(f24) | c28655q.m87157i(this.f9744H) | c28655q.m87155h(this.f9741E) | c28655q.m87153g(this.f9745I);
            objM87133R3 = c28655q.m87133R();
            if (zM87157i2) {
                final List list6 = this.f9746w;
                final int i110 = this.f9742F;
                final C29810c c29810c2 = this.f9743G;
                final C25046w c25046w2 = this.f9744H;
                final boolean z13 = this.f9741E;
                final Function1 function3 = this.f9745I;
                Function1 function4 = new Function1() { // from class: b30.y1
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        InterfaceC26064q LazyRow = (InterfaceC26064q) obj4;
                        AbstractC22676k.m65750j(LazyRow, "$this$LazyRow");
                        List list7 = list6;
                        ((C26053f) LazyRow).m77529r(list7.size(), null, new C2485b2(list7, 0), new C37816b(new C2493c2(list7, i110, c29810c2, f24, c25046w2, z13, function3, list7), true, -1091073711));
                        return C23454a0.f92919a;
                    }
                };
                c28655q.m87172p0(function4);
                objM87133R3 = function4;
            } else {
                final List list7 = this.f9746w;
                final int i111 = this.f9742F;
                final C29810c c29810c3 = this.f9743G;
                final C25046w c25046w3 = this.f9744H;
                final boolean z14 = this.f9741E;
                final Function1 function5 = this.f9745I;
                Function1 function6 = new Function1() { // from class: b30.y1
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        InterfaceC26064q LazyRow = (InterfaceC26064q) obj4;
                        AbstractC22676k.m65750j(LazyRow, "$this$LazyRow");
                        List list8 = list7;
                        ((C26053f) LazyRow).m77529r(list8.size(), null, new C2485b2(list8, 0), new C37816b(new C2493c2(list8, i111, c29810c3, f24, c25046w3, z14, function5, list8), true, -1091073711));
                        return C23454a0.f92919a;
                    }
                };
                c28655q.m87172p0(function6);
                objM87133R3 = function6;
            }
            c28655q.m87173q(false);
            AbstractC22674j.m65719e(modifierM3599a2, this.f9749z, c22976l1M31081j2, c22971kM66746i2, null, null, this.f9741E, (Function1) objM87133R3, c28655q, 24582, 104);
        }
        return C23454a0.f92919a;
    }
}
