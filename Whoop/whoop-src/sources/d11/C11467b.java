package d11;

import com.whoop.design.util.TextResource;
import p712j91.InterfaceC21430b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.InterfaceC39332e;
import te0.AbstractC33745d;
import y71.C39274g;

/* JADX INFO: renamed from: d11.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b\u001f\u0010$¨\u0006%"}, m65681d2 = {"Ld11/b;", "", "Lcom/whoop/design/util/TextResource;", "text", "Ly81/e;", "color", "Ly71/g;", "icon", "Lj91/b;", "brush", "<init>", "(Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Lj91/b;)V", "a", "(Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Lj91/b;)Ld11/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "b", "Ly81/e;", "d", "()Ly81/e;", "c", "Ly71/g;", "e", "()Ly71/g;", "Lj91/b;", "()Lj91/b;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11467b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC39332e color;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C39274g icon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC21430b brush;

    public C11467b(TextResource text, InterfaceC39332e color, C39274g icon, InterfaceC21430b interfaceC21430b) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(color, "color");
        AbstractC22676k.m65750j(icon, "icon");
        this.text = text;
        this.color = color;
        this.icon = icon;
        this.brush = interfaceC21430b;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C11467b m30762b(C11467b c11467b, TextResource textResource, InterfaceC39332e interfaceC39332e, C39274g c39274g, InterfaceC21430b interfaceC21430b, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = c11467b.text;
        }
        if ((i13 & 2) != 0) {
            interfaceC39332e = c11467b.color;
        }
        if ((i13 & 4) != 0) {
            c39274g = c11467b.icon;
        }
        if ((i13 & 8) != 0) {
            interfaceC21430b = c11467b.brush;
        }
        return c11467b.m30763a(textResource, interfaceC39332e, c39274g, interfaceC21430b);
    }

    /* JADX INFO: renamed from: a */
    public final C11467b m30763a(TextResource text, InterfaceC39332e color, C39274g icon, InterfaceC21430b brush) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(color, "color");
        AbstractC22676k.m65750j(icon, "icon");
        return new C11467b(text, color, icon, brush);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC21430b getBrush() {
        return this.brush;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC39332e getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C39274g getIcon() {
        return this.icon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11467b)) {
            return false;
        }
        C11467b c11467b = (C11467b) other;
        return AbstractC22676k.m65745e(this.text, c11467b.text) && AbstractC22676k.m65745e(this.color, c11467b.color) && AbstractC22676k.m65745e(this.icon, c11467b.icon) && AbstractC22676k.m65745e(this.brush, c11467b.brush);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = (this.icon.hashCode() + AbstractC33745d.m106648g(this.color, this.text.hashCode() * 31, 31)) * 31;
        InterfaceC21430b interfaceC21430b = this.brush;
        return iHashCode + (interfaceC21430b == null ? 0 : interfaceC21430b.hashCode());
    }

    public String toString() {
        return "CTAButtonInformation(text=" + this.text + ", color=" + this.color + ", icon=" + this.icon + ", brush=" + this.brush + ")";
    }

    public /* synthetic */ C11467b(TextResource textResource, InterfaceC39332e interfaceC39332e, C39274g c39274g, InterfaceC21430b interfaceC21430b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, interfaceC39332e, c39274g, (i13 & 8) != 0 ? null : interfaceC21430b);
    }
}
