package ad3;

import java.util.List;
import p715kotlin.jvm.internal.AbstractC22676k;
import xc3.AbstractC38195a;
import yc3.AbstractC39447k;
import yc3.InterfaceC39443g;

/* JADX INFO: renamed from: ad3.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C0761e implements InterfaceC39443g {

    /* JADX INFO: renamed from: b */
    public static final C0761e f2768b = new C0761e();

    /* JADX INFO: renamed from: c */
    public static final String f2769c = "kotlinx.serialization.json.JsonArray";

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC39443g f2770a = AbstractC38195a.m122333a(C0771n.f2806a).getDescriptor();

    @Override // yc3.InterfaceC39443g
    public final List getAnnotations() {
        return this.f2770a.getAnnotations();
    }

    @Override // yc3.InterfaceC39443g
    public final List getElementAnnotations(int i13) {
        return this.f2770a.getElementAnnotations(i13);
    }

    @Override // yc3.InterfaceC39443g
    public final InterfaceC39443g getElementDescriptor(int i13) {
        return this.f2770a.getElementDescriptor(i13);
    }

    @Override // yc3.InterfaceC39443g
    public final int getElementIndex(String name) {
        AbstractC22676k.m65750j(name, "name");
        return this.f2770a.getElementIndex(name);
    }

    @Override // yc3.InterfaceC39443g
    public final String getElementName(int i13) {
        return this.f2770a.getElementName(i13);
    }

    @Override // yc3.InterfaceC39443g
    public final int getElementsCount() {
        return this.f2770a.getElementsCount();
    }

    @Override // yc3.InterfaceC39443g
    public final AbstractC39447k getKind() {
        return this.f2770a.getKind();
    }

    @Override // yc3.InterfaceC39443g
    public final String getSerialName() {
        return f2769c;
    }

    @Override // yc3.InterfaceC39443g
    public final boolean isElementOptional(int i13) {
        return this.f2770a.isElementOptional(i13);
    }

    @Override // yc3.InterfaceC39443g
    /* JADX INFO: renamed from: isInline */
    public final boolean getIsInline() {
        return this.f2770a.getIsInline();
    }

    @Override // yc3.InterfaceC39443g
    public final boolean isNullable() {
        return this.f2770a.isNullable();
    }
}
