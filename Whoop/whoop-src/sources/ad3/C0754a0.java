package ad3;

import java.util.List;
import kotlinx.serialization.internal.StringSerializer;
import p715kotlin.jvm.internal.AbstractC22676k;
import xc3.AbstractC38195a;
import yc3.AbstractC39447k;
import yc3.InterfaceC39443g;

/* JADX INFO: renamed from: ad3.a0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0754a0 implements InterfaceC39443g {

    /* JADX INFO: renamed from: b */
    public static final C0754a0 f2757b = new C0754a0();

    /* JADX INFO: renamed from: c */
    public static final String f2758c = "kotlinx.serialization.json.JsonObject";

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC39443g f2759a = AbstractC38195a.m122335c(StringSerializer.INSTANCE, C0771n.f2806a).getDescriptor();

    @Override // yc3.InterfaceC39443g
    public final List getAnnotations() {
        return this.f2759a.getAnnotations();
    }

    @Override // yc3.InterfaceC39443g
    public final List getElementAnnotations(int i13) {
        return this.f2759a.getElementAnnotations(i13);
    }

    @Override // yc3.InterfaceC39443g
    public final InterfaceC39443g getElementDescriptor(int i13) {
        return this.f2759a.getElementDescriptor(i13);
    }

    @Override // yc3.InterfaceC39443g
    public final int getElementIndex(String name) {
        AbstractC22676k.m65750j(name, "name");
        return this.f2759a.getElementIndex(name);
    }

    @Override // yc3.InterfaceC39443g
    public final String getElementName(int i13) {
        return this.f2759a.getElementName(i13);
    }

    @Override // yc3.InterfaceC39443g
    public final int getElementsCount() {
        return this.f2759a.getElementsCount();
    }

    @Override // yc3.InterfaceC39443g
    public final AbstractC39447k getKind() {
        return this.f2759a.getKind();
    }

    @Override // yc3.InterfaceC39443g
    public final String getSerialName() {
        return f2758c;
    }

    @Override // yc3.InterfaceC39443g
    public final boolean isElementOptional(int i13) {
        return this.f2759a.isElementOptional(i13);
    }

    @Override // yc3.InterfaceC39443g
    /* JADX INFO: renamed from: isInline */
    public final boolean getIsInline() {
        return this.f2759a.getIsInline();
    }

    @Override // yc3.InterfaceC39443g
    public final boolean isNullable() {
        return this.f2759a.isNullable();
    }
}
