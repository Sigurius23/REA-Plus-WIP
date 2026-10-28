package p032bc;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.SwitchCompat;
import fr.AbstractC14702m;
import fr.C14697h;
import fr.C14703n;
import fr.C14705p;
import fr.C14707r;
import fr.C14709t;
import java.util.ArrayList;
import java.util.Iterator;
import p027b3.AbstractC2351b;
import p031b9.AbstractC2875y;
import p186h8.C16999a;
import p463rj.AbstractC31479j;

/* JADX INFO: renamed from: bc.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C2939b extends Property {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11826a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2939b(Class cls, String str, int i13) {
        super(cls, str);
        this.f11826a = i13;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f11826a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(AbstractC2950g0.f11854a.mo8633S((View) obj));
            case 6:
                return ((View) obj).getClipBounds();
            case 7:
                return Float.valueOf(((C14697h) obj).f54336i);
            case 8:
                return Float.valueOf(((C14697h) obj).f54337j);
            case 9:
                return Float.valueOf(((AbstractC14702m) obj).m42144b());
            case 10:
                return Float.valueOf(((C14707r) obj).f54380i);
            case 11:
                return Float.valueOf(((C14709t) obj).f54392j);
            default:
                return Float.valueOf(((SwitchCompat) obj).f4374c0);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f11826a) {
            case 0:
                C2945e c2945e = (C2945e) obj;
                PointF pointF = (PointF) obj2;
                c2945e.getClass();
                c2945e.f11836a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                c2945e.f11837b = iRound;
                int i13 = c2945e.f11841f + 1;
                c2945e.f11841f = i13;
                if (i13 == c2945e.f11842g) {
                    AbstractC2950g0.m8609a(c2945e.f11840e, c2945e.f11836a, iRound, c2945e.f11838c, c2945e.f11839d);
                    c2945e.f11841f = 0;
                    c2945e.f11842g = 0;
                }
                break;
            case 1:
                C2945e c2945e2 = (C2945e) obj;
                PointF pointF2 = (PointF) obj2;
                c2945e2.getClass();
                c2945e2.f11838c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                c2945e2.f11839d = iRound2;
                int i14 = c2945e2.f11842g + 1;
                c2945e2.f11842g = i14;
                if (c2945e2.f11841f == i14) {
                    AbstractC2950g0.m8609a(c2945e2.f11840e, c2945e2.f11836a, c2945e2.f11837b, c2945e2.f11838c, iRound2);
                    c2945e2.f11841f = 0;
                    c2945e2.f11842g = 0;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                AbstractC2950g0.m8609a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                AbstractC2950g0.m8609a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                AbstractC2950g0.m8609a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                AbstractC2950g0.f11854a.mo8634e0((View) obj, ((Float) obj2).floatValue());
                break;
            case 6:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
            case 7:
                C14697h c14697h = (C14697h) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                c14697h.f54336i = fFloatValue;
                int i15 = (int) (fFloatValue * 5400.0f);
                C16999a c16999a = c14697h.f54333f;
                ArrayList arrayList = (ArrayList) c14697h.f9292c;
                C14703n c14703n = (C14703n) arrayList.get(0);
                float f13 = c14697h.f54336i * 1520.0f;
                c14703n.f54361a = (-20.0f) + f13;
                c14703n.f54362b = f13;
                for (int i16 = 0; i16 < 4; i16++) {
                    c14703n.f54362b = (c16999a.getInterpolation(AbstractC2351b.m7240o(i15, C14697h.f54326l[i16], 667)) * 250.0f) + c14703n.f54362b;
                    c14703n.f54361a = (c16999a.getInterpolation(AbstractC2351b.m7240o(i15, C14697h.f54327m[i16], 667)) * 250.0f) + c14703n.f54361a;
                }
                float f14 = c14703n.f54361a;
                float f15 = c14703n.f54362b;
                c14703n.f54361a = (((f15 - f14) * c14697h.f54337j) + f14) / 360.0f;
                c14703n.f54362b = f15 / 360.0f;
                for (int i17 = 0; i17 < 4; i17++) {
                    float fM7240o = AbstractC2351b.m7240o(i15, C14697h.f54328n[i17], 333);
                    if (fM7240o >= 0.0f && fM7240o <= 1.0f) {
                        int i18 = i17 + c14697h.f54335h;
                        int[] iArr = c14697h.f54334g.f54314c;
                        int length = i18 % iArr.length;
                        int length2 = (length + 1) % iArr.length;
                        int i19 = iArr[length];
                        int i24 = iArr[length2];
                        float interpolation = c16999a.getInterpolation(fM7240o);
                        C14703n c14703n2 = (C14703n) arrayList.get(0);
                        Integer numValueOf = Integer.valueOf(i19);
                        Integer numValueOf2 = Integer.valueOf(i24);
                        int iIntValue = numValueOf.intValue();
                        float f16 = ((iIntValue >> 24) & 255) / 255.0f;
                        int iIntValue2 = numValueOf2.intValue();
                        float f17 = ((iIntValue2 >> 24) & 255) / 255.0f;
                        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
                        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
                        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
                        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
                        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
                        float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
                        float fM8288a = AbstractC2875y.m8288a(f17, f16, interpolation, f16);
                        float fM8288a2 = AbstractC2875y.m8288a(fPow4, fPow, interpolation, fPow);
                        float fM8288a3 = AbstractC2875y.m8288a(fPow5, fPow2, interpolation, fPow2);
                        float fM8288a4 = AbstractC2875y.m8288a(fPow6, fPow3, interpolation, fPow3);
                        float fPow7 = ((float) Math.pow(fM8288a2, 0.45454545454545453d)) * 255.0f;
                        float fPow8 = ((float) Math.pow(fM8288a3, 0.45454545454545453d)) * 255.0f;
                        c14703n2.f54363c = Integer.valueOf(Math.round(((float) Math.pow(fM8288a4, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fM8288a * 255.0f) << 24) | (Math.round(fPow8) << 8)).intValue();
                        ((C14705p) c14697h.f9291b).invalidateSelf();
                    }
                    break;
                }
                ((C14705p) c14697h.f9291b).invalidateSelf();
                break;
            case 8:
                ((C14697h) obj).f54337j = ((Float) obj2).floatValue();
                break;
            case 9:
                AbstractC14702m abstractC14702m = (AbstractC14702m) obj;
                float fFloatValue2 = ((Float) obj2).floatValue();
                if (abstractC14702m.f54354H != fFloatValue2) {
                    abstractC14702m.f54354H = fFloatValue2;
                    abstractC14702m.invalidateSelf();
                }
                break;
            case 10:
                C14707r c14707r = (C14707r) obj;
                float fFloatValue3 = ((Float) obj2).floatValue();
                c14707r.f54380i = fFloatValue3;
                ArrayList arrayList2 = (ArrayList) c14707r.f9292c;
                ((C14703n) arrayList2.get(0)).f54361a = 0.0f;
                float fM7240o2 = AbstractC2351b.m7240o((int) (fFloatValue3 * 333.0f), 0, 667);
                C14703n c14703n3 = (C14703n) arrayList2.get(0);
                C14703n c14703n4 = (C14703n) arrayList2.get(1);
                C16999a c16999a2 = c14707r.f54376e;
                float interpolation2 = c16999a2.getInterpolation(fM7240o2);
                c14703n4.f54361a = interpolation2;
                c14703n3.f54362b = interpolation2;
                C14703n c14703n5 = (C14703n) arrayList2.get(1);
                C14703n c14703n6 = (C14703n) arrayList2.get(2);
                float interpolation3 = c16999a2.getInterpolation(fM7240o2 + 0.49925038f);
                c14703n6.f54361a = interpolation3;
                c14703n5.f54362b = interpolation3;
                ((C14703n) arrayList2.get(2)).f54362b = 1.0f;
                if (c14707r.f54379h && ((C14703n) arrayList2.get(1)).f54362b < 1.0f) {
                    ((C14703n) arrayList2.get(2)).f54363c = ((C14703n) arrayList2.get(1)).f54363c;
                    ((C14703n) arrayList2.get(1)).f54363c = ((C14703n) arrayList2.get(0)).f54363c;
                    ((C14703n) arrayList2.get(0)).f54363c = c14707r.f54377f.f54314c[c14707r.f54378g];
                    c14707r.f54379h = false;
                }
                ((C14705p) c14707r.f9291b).invalidateSelf();
                break;
            case 11:
                C14709t c14709t = (C14709t) obj;
                float fFloatValue4 = ((Float) obj2).floatValue();
                c14709t.f54392j = fFloatValue4;
                int i25 = (int) (fFloatValue4 * 1800.0f);
                Interpolator[] interpolatorArr = c14709t.f54388f;
                ArrayList arrayList3 = (ArrayList) c14709t.f9292c;
                for (int i26 = 0; i26 < arrayList3.size(); i26++) {
                    C14703n c14703n7 = (C14703n) arrayList3.get(i26);
                    int[] iArr2 = C14709t.f54384m;
                    int i27 = i26 * 2;
                    int i28 = iArr2[i27];
                    int[] iArr3 = C14709t.f54383l;
                    c14703n7.f54361a = AbstractC31479j.m96938q(interpolatorArr[i27].getInterpolation(AbstractC2351b.m7240o(i25, i28, iArr3[i27])), 0.0f, 1.0f);
                    int i29 = i27 + 1;
                    c14703n7.f54362b = AbstractC31479j.m96938q(interpolatorArr[i29].getInterpolation(AbstractC2351b.m7240o(i25, iArr2[i29], iArr3[i29])), 0.0f, 1.0f);
                }
                if (c14709t.f54391i) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        ((C14703n) it.next()).f54363c = c14709t.f54389g.f54314c[c14709t.f54390h];
                    }
                    c14709t.f54391i = false;
                }
                ((C14705p) c14709t.f9291b).invalidateSelf();
                break;
            default:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
        }
    }
}
