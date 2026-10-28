package p41;

import com.whoop.navigation.models.GenericInteraction;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;

/* JADX INFO: renamed from: p41.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001a\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b#\u0010'¨\u0006("}, m65681d2 = {"Lp41/j;", "Lm91/u;", "", "label", "", "isChecked", "isReadOnly", "Lp41/f;", "toggleInteraction", "Lp41/k;", "style", "Ly81/e;", "toggledOnColor", "<init>", "(Ljava/lang/String;ZZLp41/f;Lp41/k;Ly81/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "f", "()Z", "c", "g", "d", "Lp41/f;", "()Lp41/f;", "e", "Lp41/k;", "()Lp41/k;", "Ly81/e;", "()Ly81/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28839j implements InterfaceC25312u {

    /* JADX INFO: renamed from: g */
    public static final int f116731g = GenericInteraction.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isChecked;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isReadOnly;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C28835f toggleInteraction;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC28840k style;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC39332e toggledOnColor;

    public C28839j(String label, boolean z4, boolean z13, C28835f c28835f, EnumC28840k style, InterfaceC39332e toggledOnColor) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(toggledOnColor, "toggledOnColor");
        this.label = label;
        this.isChecked = z4;
        this.isReadOnly = z13;
        this.toggleInteraction = c28835f;
        this.style = style;
        this.toggledOnColor = toggledOnColor;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC28840k getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C28835f getToggleInteraction() {
        return this.toggleInteraction;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC39332e getToggledOnColor() {
        return this.toggledOnColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28839j)) {
            return false;
        }
        C28839j c28839j = (C28839j) other;
        return AbstractC22676k.m65745e(this.label, c28839j.label) && this.isChecked == c28839j.isChecked && this.isReadOnly == c28839j.isReadOnly && AbstractC22676k.m65745e(this.toggleInteraction, c28839j.toggleInteraction) && this.style == c28839j.style && AbstractC22676k.m65745e(this.toggledOnColor, c28839j.toggledOnColor);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsReadOnly() {
        return this.isReadOnly;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.label.hashCode() * 31, 31, this.isChecked), 31, this.isReadOnly);
        C28835f c28835f = this.toggleInteraction;
        return this.toggledOnColor.hashCode() + ((this.style.hashCode() + ((iM8289b + (c28835f == null ? 0 : c28835f.hashCode())) * 31)) * 31);
    }

    public String toString() {
        String str = this.label;
        boolean z4 = this.isChecked;
        boolean z13 = this.isReadOnly;
        C28835f c28835f = this.toggleInteraction;
        EnumC28840k enumC28840k = this.style;
        InterfaceC39332e interfaceC39332e = this.toggledOnColor;
        StringBuilder sbM73379l = AbstractC25012a.m73379l("ToggleState(label=", str, ", isChecked=", ", isReadOnly=", z4);
        sbM73379l.append(z13);
        sbM73379l.append(", toggleInteraction=");
        sbM73379l.append(c28835f);
        sbM73379l.append(", style=");
        sbM73379l.append(enumC28840k);
        sbM73379l.append(", toggledOnColor=");
        sbM73379l.append(interfaceC39332e);
        sbM73379l.append(")");
        return sbM73379l.toString();
    }

    public /* synthetic */ C28839j(String str, boolean z4, boolean z13, C28835f c28835f, EnumC28840k enumC28840k, InterfaceC39332e interfaceC39332e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z4, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? null : c28835f, (i13 & 16) != 0 ? EnumC28840k.TILE : enumC28840k, (i13 & 32) != 0 ? EnumC39333f.RECOVERY : interfaceC39332e);
    }
}
