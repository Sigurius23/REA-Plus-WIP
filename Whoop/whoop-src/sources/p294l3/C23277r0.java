package p294l3;

import android.graphics.RectF;
import android.text.Layout;
import com.google.android.material.textfield.C5057p;
import d62.C11740f;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p181h2.C16618c;
import p208i2.AbstractC17897m;
import p208i2.C17891j;
import p318m3.AbstractC24984n;
import p318m3.C24982l;
import p318m3.C24983m;
import p448r3.AbstractC30895a;
import p571w3.EnumC36774j;
import p636y3.C39180l;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.AbstractC34924m;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: l3.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23277r0 {

    /* JADX INFO: renamed from: a */
    public final C23275q0 f92227a;

    /* JADX INFO: renamed from: b */
    public final C23286w f92228b;

    /* JADX INFO: renamed from: c */
    public final long f92229c;

    /* JADX INFO: renamed from: d */
    public final float f92230d;

    /* JADX INFO: renamed from: e */
    public final float f92231e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f92232f;

    public C23277r0(C23275q0 c23275q0, C23286w c23286w, long j7) {
        this.f92227a = c23275q0;
        this.f92228b = c23286w;
        this.f92229c = j7;
        ArrayList arrayList = c23286w.f92265h;
        float fM73310d = 0.0f;
        this.f92230d = arrayList.isEmpty() ? 0.0f : ((C23290y) arrayList.get(0)).f92270a.f92101d.m73310d(0);
        if (!arrayList.isEmpty()) {
            C23290y c23290y = (C23290y) AbstractC25265s.m74112P0(arrayList);
            C24983m c24983m = c23290y.f92270a.f92101d;
            fM73310d = c24983m.m73310d(c24983m.f97769g - 1) + c23290y.f92275f;
        }
        this.f92231e = fM73310d;
        this.f92232f = c23286w.f92264g;
    }

    /* JADX INFO: renamed from: a */
    public final EnumC36774j m67332a(int i13) {
        C23286w c23286w = this.f92228b;
        ArrayList arrayList = c23286w.f92265h;
        c23286w.m67380l(i13);
        C23290y c23290y = (C23290y) arrayList.get(i13 == ((C23254g) c23286w.f92258a.f2195b).f92135x.length() ? AbstractC37056f.m118951C(arrayList) : AbstractC23278s.m67346c(i13, arrayList));
        return c23290y.f92270a.f92101d.f97768f.isRtlCharAt(c23290y.m67387d(i13)) ? EnumC36774j.f157348x : EnumC36774j.f157347w;
    }

    /* JADX INFO: renamed from: b */
    public final C16618c m67333b(int i13) {
        float fM73315i;
        float fM73315i2;
        float fM73314h;
        float fM73314h2;
        C23286w c23286w = this.f92228b;
        c23286w.m67379k(i13);
        ArrayList arrayList = c23286w.f92265h;
        C23290y c23290y = (C23290y) arrayList.get(AbstractC23278s.m67346c(i13, arrayList));
        C23242a c23242a = c23290y.f92270a;
        int iM67387d = c23290y.m67387d(i13);
        CharSequence charSequence = c23242a.f92102e;
        if (iM67387d < 0 || iM67387d >= charSequence.length()) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(iM67387d, "offset(", ") is out of bounds [0,");
            sbM30466t.append(charSequence.length());
            sbM30466t.append(')');
            AbstractC30895a.m95015a(sbM30466t.toString());
        }
        C24983m c24983m = c23242a.f92101d;
        Layout layout = c24983m.f97768f;
        int lineForOffset = layout.getLineForOffset(iM67387d);
        float fM73313g = c24983m.m73313g(lineForOffset);
        float fM73311e = c24983m.m73311e(lineForOffset);
        boolean z4 = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iM67387d);
        if (!z4 || zIsRtlCharAt) {
            if (z4 && zIsRtlCharAt) {
                fM73314h = c24983m.m73315i(iM67387d, false);
                fM73314h2 = c24983m.m73315i(iM67387d + 1, true);
            } else if (zIsRtlCharAt) {
                fM73314h = c24983m.m73314h(iM67387d, false);
                fM73314h2 = c24983m.m73314h(iM67387d + 1, true);
            } else {
                fM73315i = c24983m.m73315i(iM67387d, false);
                fM73315i2 = c24983m.m73315i(iM67387d + 1, true);
            }
            float f13 = fM73314h;
            fM73315i = fM73314h2;
            fM73315i2 = f13;
        } else {
            fM73315i = c24983m.m73314h(iM67387d, false);
            fM73315i2 = c24983m.m73314h(iM67387d + 1, true);
        }
        RectF rectF = new RectF(fM73315i, fM73313g, fM73315i2, fM73311e);
        return c23290y.m67384a(new C16618c(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    /* JADX INFO: renamed from: c */
    public final C16618c m67334c(int i13) {
        C23286w c23286w = this.f92228b;
        ArrayList arrayList = c23286w.f92265h;
        c23286w.m67380l(i13);
        C23290y c23290y = (C23290y) arrayList.get(i13 == ((C23254g) c23286w.f92258a.f2195b).f92135x.length() ? AbstractC37056f.m118951C(arrayList) : AbstractC23278s.m67346c(i13, arrayList));
        C23242a c23242a = c23290y.f92270a;
        int iM67387d = c23290y.m67387d(i13);
        CharSequence charSequence = c23242a.f92102e;
        C24983m c24983m = c23242a.f92101d;
        if (iM67387d < 0 || iM67387d > charSequence.length()) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(iM67387d, "offset(", ") is out of bounds [0,");
            sbM30466t.append(charSequence.length());
            sbM30466t.append(']');
            AbstractC30895a.m95015a(sbM30466t.toString());
        }
        float fM73314h = c24983m.m73314h(iM67387d, false);
        int lineForOffset = c24983m.f97768f.getLineForOffset(iM67387d);
        return c23290y.m67384a(new C16618c(fM73314h, c24983m.m73313g(lineForOffset), fM73314h, c24983m.m73311e(lineForOffset)));
    }

    /* JADX INFO: renamed from: d */
    public final boolean m67335d() {
        C23286w c23286w = this.f92228b;
        return c23286w.f92260c || ((float) ((int) (this.f92229c & 4294967295L))) < c23286w.f92262e;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m67336e() {
        return ((float) ((int) (this.f92229c >> 32))) < this.f92228b.f92261d || m67335d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23277r0)) {
            return false;
        }
        C23277r0 c23277r0 = (C23277r0) obj;
        return AbstractC22676k.m65745e(this.f92227a, c23277r0.f92227a) && this.f92228b.equals(c23277r0.f92228b) && C39180l.m124799a(this.f92229c, c23277r0.f92229c) && this.f92230d == c23277r0.f92230d && this.f92231e == c23277r0.f92231e && AbstractC22676k.m65745e(this.f92232f, c23277r0.f92232f);
    }

    /* JADX INFO: renamed from: f */
    public final float m67337f(int i13) {
        C23286w c23286w = this.f92228b;
        c23286w.m67381m(i13);
        ArrayList arrayList = c23286w.f92265h;
        C23290y c23290y = (C23290y) arrayList.get(AbstractC23278s.m67347d(i13, arrayList));
        C23242a c23242a = c23290y.f92270a;
        int i14 = i13 - c23290y.f92273d;
        C24983m c24983m = c23242a.f92101d;
        return c24983m.f97768f.getLineLeft(i14) + (i14 == c24983m.f97769g + (-1) ? c24983m.f97772j : 0.0f);
    }

    /* JADX INFO: renamed from: g */
    public final float m67338g(int i13) {
        C23286w c23286w = this.f92228b;
        c23286w.m67381m(i13);
        ArrayList arrayList = c23286w.f92265h;
        C23290y c23290y = (C23290y) arrayList.get(AbstractC23278s.m67347d(i13, arrayList));
        C23242a c23242a = c23290y.f92270a;
        int i14 = i13 - c23290y.f92273d;
        C24983m c24983m = c23242a.f92101d;
        return c24983m.f97768f.getLineRight(i14) + (i14 == c24983m.f97769g + (-1) ? c24983m.f97773k : 0.0f);
    }

    /* JADX INFO: renamed from: h */
    public final int m67339h(int i13) {
        C23286w c23286w = this.f92228b;
        c23286w.m67381m(i13);
        ArrayList arrayList = c23286w.f92265h;
        C23290y c23290y = (C23290y) arrayList.get(AbstractC23278s.m67347d(i13, arrayList));
        C23242a c23242a = c23290y.f92270a;
        return c23242a.f92101d.f97768f.getLineStart(i13 - c23290y.f92273d) + c23290y.f92271b;
    }

    public final int hashCode() {
        return this.f92232f.hashCode() + AbstractC11266d.m30447a(this.f92231e, AbstractC11266d.m30447a(this.f92230d, AbstractC11266d.m30451e((this.f92228b.hashCode() + (this.f92227a.hashCode() * 31)) * 31, this.f92229c, 31), 31), 31);
    }

    /* JADX INFO: renamed from: i */
    public final EnumC36774j m67340i(int i13) {
        C23286w c23286w = this.f92228b;
        ArrayList arrayList = c23286w.f92265h;
        c23286w.m67380l(i13);
        C23290y c23290y = (C23290y) arrayList.get(i13 == ((C23254g) c23286w.f92258a.f2195b).f92135x.length() ? AbstractC37056f.m118951C(arrayList) : AbstractC23278s.m67346c(i13, arrayList));
        C23242a c23242a = c23290y.f92270a;
        int iM67387d = c23290y.m67387d(i13);
        C24983m c24983m = c23242a.f92101d;
        return c24983m.f97768f.getParagraphDirection(c24983m.f97768f.getLineForOffset(iM67387d)) == 1 ? EnumC36774j.f157347w : EnumC36774j.f157348x;
    }

    /* JADX INFO: renamed from: j */
    public final C17891j m67341j(int i13, int i14) {
        C23286w c23286w = this.f92228b;
        C23254g c23254g = (C23254g) c23286w.f92258a.f2195b;
        if (i13 < 0 || i13 > i14 || i14 > c23254g.f92135x.length()) {
            StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "Start(", ") or End(", ") is out of range [0..");
            sbM30465s.append(c23254g.f92135x.length());
            sbM30465s.append("), or start > end!");
            AbstractC30895a.m95015a(sbM30465s.toString());
        }
        if (i13 == i14) {
            return AbstractC17897m.m51478a();
        }
        C17891j c17891jM51478a = AbstractC17897m.m51478a();
        AbstractC23278s.m67349f(c23286w.f92265h, AbstractC21478l0.m60431f(i13, i14), new C11740f(c17891jM51478a, i13, i14, 2));
        return c17891jM51478a;
    }

    /* JADX INFO: renamed from: k */
    public final long m67342k(int i13) {
        C23286w c23286w = this.f92228b;
        ArrayList arrayList = c23286w.f92265h;
        c23286w.m67380l(i13);
        C23290y c23290y = (C23290y) arrayList.get(i13 == ((C23254g) c23286w.f92258a.f2195b).f92135x.length() ? AbstractC37056f.m118951C(arrayList) : AbstractC23278s.m67346c(i13, arrayList));
        C23242a c23242a = c23290y.f92270a;
        int iM67387d = c23290y.m67387d(i13);
        C5057p c5057pM73316j = c23242a.f92101d.m73316j();
        return c23290y.m67385b(AbstractC21478l0.m60431f(AbstractC34924m.m110124F(c5057pM73316j, iM67387d), AbstractC34924m.m110123E(c5057pM73316j, iM67387d)), false);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m67343l(int i13) {
        C23286w c23286w = this.f92228b;
        c23286w.m67381m(i13);
        ArrayList arrayList = c23286w.f92265h;
        Layout layout = ((C23290y) arrayList.get(AbstractC23278s.m67347d(i13, arrayList))).f92270a.f92101d.f97768f;
        C24982l c24982l = AbstractC24984n.f97780a;
        return layout.getEllipsisCount(i13) > 0;
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f92227a + ", multiParagraph=" + this.f92228b + ", size=" + ((Object) C39180l.m124800b(this.f92229c)) + ", firstBaseline=" + this.f92230d + ", lastBaseline=" + this.f92231e + ", placeholderRects=" + this.f92232f + ')';
    }
}
