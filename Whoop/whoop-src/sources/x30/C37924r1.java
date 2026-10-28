package x30;

import bi.AbstractC3269g;
import com.stripe.android.uicore.elements.IdentifierSpec;
import ec3.InterfaceC13037f2;
import g40.InterfaceC15367i1;
import m83.C25271y;
import p479s4.AbstractC32128i;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x30.r1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37924r1 implements InterfaceC15367i1 {

    /* JADX INFO: renamed from: a */
    public final IdentifierSpec f162379a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC41211c f162380b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C37924r1(IdentifierSpec identifier, int i13) {
        this(identifier, AbstractC32128i.m100054h(i13));
        AbstractC22676k.m65750j(identifier, "identifier");
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: a */
    public final IdentifierSpec mo43547a() {
        return this.f162379a;
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
        if (!(obj instanceof C37924r1)) {
            return false;
        }
        C37924r1 c37924r1 = (C37924r1) obj;
        return AbstractC22676k.m65745e(this.f162379a, c37924r1.f162379a) && AbstractC22676k.m65745e(this.f162380b, c37924r1.f162380b);
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: f */
    public final InterfaceC13037f2 mo43552f() {
        return AbstractC3269g.m9493Z(C25271y.f99162w);
    }

    public final int hashCode() {
        return (this.f162380b.hashCode() + (this.f162379a.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "StaticTextElement(identifier=" + this.f162379a + ", text=" + this.f162380b + ", controller=null)";
    }

    public C37924r1(IdentifierSpec identifier, InterfaceC41211c text) {
        AbstractC22676k.m65750j(identifier, "identifier");
        AbstractC22676k.m65750j(text, "text");
        this.f162379a = identifier;
        this.f162380b = text;
    }
}
