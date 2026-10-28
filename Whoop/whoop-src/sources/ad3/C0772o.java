package ad3;

import c93.InterfaceC4339a;
import java.util.List;
import l83.C23470p;
import m83.C25271y;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import yc3.AbstractC39447k;
import yc3.InterfaceC39443g;

/* JADX INFO: renamed from: ad3.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C0772o implements InterfaceC39443g {

    /* JADX INFO: renamed from: a */
    public final C23470p f2808a;

    public C0772o(InterfaceC4339a interfaceC4339a) {
        this.f2808a = AbstractC30060g.m92088H(interfaceC4339a);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC39443g m1851a() {
        return (InterfaceC39443g) this.f2808a.getValue();
    }

    @Override // yc3.InterfaceC39443g
    public final List getAnnotations() {
        return C25271y.f99162w;
    }

    @Override // yc3.InterfaceC39443g
    public final List getElementAnnotations(int i13) {
        return m1851a().getElementAnnotations(i13);
    }

    @Override // yc3.InterfaceC39443g
    public final InterfaceC39443g getElementDescriptor(int i13) {
        return m1851a().getElementDescriptor(i13);
    }

    @Override // yc3.InterfaceC39443g
    public final int getElementIndex(String name) {
        AbstractC22676k.m65750j(name, "name");
        return m1851a().getElementIndex(name);
    }

    @Override // yc3.InterfaceC39443g
    public final String getElementName(int i13) {
        return m1851a().getElementName(i13);
    }

    @Override // yc3.InterfaceC39443g
    public final int getElementsCount() {
        return m1851a().getElementsCount();
    }

    @Override // yc3.InterfaceC39443g
    public final AbstractC39447k getKind() {
        return m1851a().getKind();
    }

    @Override // yc3.InterfaceC39443g
    public final String getSerialName() {
        return m1851a().getSerialName();
    }

    @Override // yc3.InterfaceC39443g
    public final boolean isElementOptional(int i13) {
        return m1851a().isElementOptional(i13);
    }

    @Override // yc3.InterfaceC39443g
    /* JADX INFO: renamed from: isInline */
    public final boolean getIsInline() {
        return false;
    }

    @Override // yc3.InterfaceC39443g
    public final boolean isNullable() {
        return false;
    }
}
