package x30;

import bi.AbstractC3269g;
import com.stripe.android.uicore.elements.IdentifierSpec;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import g40.InterfaceC15367i1;
import ih0.AbstractC18489d0;
import m83.C25271y;
import n53.C26318e;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x30.n1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37912n1 implements InterfaceC15367i1 {

    /* JADX INFO: renamed from: a */
    public final boolean f162311a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC13037f2 f162312b;

    /* JADX INFO: renamed from: c */
    public final boolean f162313c;

    /* JADX INFO: renamed from: d */
    public final C26318e f162314d;

    /* JADX INFO: renamed from: e */
    public final IdentifierSpec f162315e;

    /* JADX INFO: renamed from: f */
    public final C37906l1 f162316f;

    /* JADX INFO: renamed from: g */
    public final boolean f162317g;

    public C37912n1(boolean z4, C13045h2 saveForFutureUseCheckedFlow, boolean z13) {
        AbstractC22676k.m65750j(saveForFutureUseCheckedFlow, "saveForFutureUseCheckedFlow");
        this.f162311a = z4;
        this.f162312b = saveForFutureUseCheckedFlow;
        this.f162313c = z13;
        this.f162314d = AbstractC3269g.m9484M(saveForFutureUseCheckedFlow, new C37909m1(this, 0));
        IdentifierSpec.Companion.getClass();
        this.f162315e = IdentifierSpec.SetAsDefaultPaymentMethod;
        this.f162316f = new C37906l1(z4, saveForFutureUseCheckedFlow, z13);
        this.f162317g = true;
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: a */
    public final IdentifierSpec mo43547a() {
        return this.f162315e;
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: b */
    public final void mo43548b(boolean z4) {
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: c */
    public final InterfaceC41211c mo43549c() {
        return null;
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: d */
    public final boolean mo43550d() {
        return this.f162317g;
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: e */
    public final InterfaceC13037f2 mo43551e() {
        return AbstractC3269g.m9484M(this.f162316f.f162300f, new C37909m1(this, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37912n1)) {
            return false;
        }
        C37912n1 c37912n1 = (C37912n1) obj;
        return this.f162311a == c37912n1.f162311a && AbstractC22676k.m65745e(this.f162312b, c37912n1.f162312b) && this.f162313c == c37912n1.f162313c;
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: f */
    public final InterfaceC13037f2 mo43552f() {
        return AbstractC3269g.m9493Z(C25271y.f99162w);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f162313c) + ((this.f162312b.hashCode() + (Boolean.hashCode(this.f162311a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("SetAsDefaultPaymentMethodElement(initialValue=");
        sb4.append(this.f162311a);
        sb4.append(", saveForFutureUseCheckedFlow=");
        sb4.append(this.f162312b);
        sb4.append(", setAsDefaultMatchesSaveForFutureUse=");
        return AbstractC18489d0.m53372m(sb4, this.f162313c, ")");
    }
}
