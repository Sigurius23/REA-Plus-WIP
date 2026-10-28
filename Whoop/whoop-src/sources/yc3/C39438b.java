package yc3;

import j93.InterfaceC21461d;
import java.util.List;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: yc3.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C39438b implements InterfaceC39443g {

    /* JADX INFO: renamed from: a */
    public final C39444h f169685a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC21461d f169686b;

    /* JADX INFO: renamed from: c */
    public final String f169687c;

    public C39438b(C39444h c39444h, InterfaceC21461d kClass) {
        AbstractC22676k.m65750j(kClass, "kClass");
        this.f169685a = c39444h;
        this.f169686b = kClass;
        this.f169687c = c39444h.f169699a + '<' + kClass.getSimpleName() + '>';
    }

    public final boolean equals(Object obj) {
        C39438b c39438b = obj instanceof C39438b ? (C39438b) obj : null;
        return c39438b != null && this.f169685a.equals(c39438b.f169685a) && AbstractC22676k.m65745e(c39438b.f169686b, this.f169686b);
    }

    @Override // yc3.InterfaceC39443g
    public final List getAnnotations() {
        return this.f169685a.f169702d;
    }

    @Override // yc3.InterfaceC39443g
    public final List getElementAnnotations(int i13) {
        return this.f169685a.f169706h[i13];
    }

    @Override // yc3.InterfaceC39443g
    public final InterfaceC39443g getElementDescriptor(int i13) {
        return this.f169685a.f169705g[i13];
    }

    @Override // yc3.InterfaceC39443g
    public final int getElementIndex(String name) {
        AbstractC22676k.m65750j(name, "name");
        return this.f169685a.getElementIndex(name);
    }

    @Override // yc3.InterfaceC39443g
    public final String getElementName(int i13) {
        return this.f169685a.f169704f[i13];
    }

    @Override // yc3.InterfaceC39443g
    public final int getElementsCount() {
        return this.f169685a.f169701c;
    }

    @Override // yc3.InterfaceC39443g
    public final AbstractC39447k getKind() {
        return this.f169685a.f169700b;
    }

    @Override // yc3.InterfaceC39443g
    public final String getSerialName() {
        return this.f169687c;
    }

    public final int hashCode() {
        return this.f169687c.hashCode() + (this.f169686b.hashCode() * 31);
    }

    @Override // yc3.InterfaceC39443g
    public final boolean isElementOptional(int i13) {
        return this.f169685a.f169707i[i13];
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

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f169686b + ", original: " + this.f169685a + ')';
    }
}
