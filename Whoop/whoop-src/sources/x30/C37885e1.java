package x30;

import bi.AbstractC3269g;
import com.stripe.android.uicore.elements.C5705a;
import com.stripe.android.uicore.elements.IdentifierSpec;
import ec3.InterfaceC13037f2;
import g40.InterfaceC15367i1;
import java.util.Arrays;
import java.util.List;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p479s4.AbstractC32128i;
import p636y3.C39174f;
import p696zy.C41210b;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: x30.e1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37885e1 implements InterfaceC15367i1 {

    /* JADX INFO: renamed from: a */
    public final IdentifierSpec f162227a;

    /* JADX INFO: renamed from: b */
    public final int f162228b;

    /* JADX INFO: renamed from: c */
    public final List f162229c;

    /* JADX INFO: renamed from: d */
    public final float f162230d;

    /* JADX INFO: renamed from: e */
    public final C41210b f162231e;

    public C37885e1(IdentifierSpec identifier, int i13, List list, float f13, int i14) {
        if ((i14 & 1) != 0) {
            IdentifierSpec.Companion.getClass();
            identifier = C5705a.m16892a("mandate");
        }
        f13 = (i14 & 8) != 0 ? 8 : f13;
        AbstractC22676k.m65750j(identifier, "identifier");
        this.f162227a = identifier;
        this.f162228b = i13;
        this.f162229c = list;
        this.f162230d = f13;
        String[] strArr = (String[]) list.toArray(new String[0]);
        this.f162231e = AbstractC32128i.m100064s(i13, Arrays.copyOf(strArr, strArr.length), C25271y.f99162w);
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: a */
    public final IdentifierSpec mo43547a() {
        return this.f162227a;
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: b */
    public final void mo43548b(boolean z4) {
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: c */
    public final InterfaceC41211c mo43549c() {
        return this.f162231e;
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: d */
    public final boolean mo43550d() {
        return false;
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: e */
    public final InterfaceC13037f2 mo43551e() {
        return AbstractC3269g.m9493Z(C25271y.f99162w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37885e1)) {
            return false;
        }
        C37885e1 c37885e1 = (C37885e1) obj;
        return AbstractC22676k.m65745e(this.f162227a, c37885e1.f162227a) && this.f162228b == c37885e1.f162228b && AbstractC22676k.m65745e(this.f162229c, c37885e1.f162229c) && C39174f.m124782b(this.f162230d, c37885e1.f162230d);
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: f */
    public final InterfaceC13037f2 mo43552f() {
        return AbstractC3269g.m9493Z(C25271y.f99162w);
    }

    public final int hashCode() {
        return AbstractC11266d.m30447a(this.f162230d, AbstractC11895b.m31983b(AbstractC11266d.m30448b(this.f162228b, this.f162227a.hashCode() * 31, 31), 31, this.f162229c), 31);
    }

    public final String toString() {
        String strM124783c = C39174f.m124783c(this.f162230d);
        StringBuilder sb4 = new StringBuilder("MandateTextElement(identifier=");
        sb4.append(this.f162227a);
        sb4.append(", stringResId=");
        sb4.append(this.f162228b);
        sb4.append(", args=");
        return AbstractC38963t7.m124377g(", topPadding=", strM124783c, ", controller=null)", sb4, this.f162229c);
    }
}
