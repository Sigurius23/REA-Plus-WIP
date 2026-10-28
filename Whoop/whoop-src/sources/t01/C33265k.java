package t01;

import gz0.EnumC16313m0;
import jh3.AbstractC21702c;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: t01.k */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\"\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b\u001e\u0010\u000f¨\u0006#"}, m65681d2 = {"Lt01/k;", "", "", "displayText", "Lgz0/m0;", "icon", "Lt01/j;", "style", "", "isClickable", "isTextActionChip", "timeSecondsSuffix", "<init>", "(Ljava/lang/String;Lgz0/m0;Lt01/j;ZZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lgz0/m0;", "()Lgz0/m0;", "c", "Lt01/j;", "()Lt01/j;", "d", "Z", "e", "()Z", "f", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33265k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String displayText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC33264j style;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isClickable;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isTextActionChip;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String timeSecondsSuffix;

    public C33265k(String displayText, EnumC16313m0 enumC16313m0, EnumC33264j style, boolean z4, boolean z13, String str) {
        AbstractC22676k.m65750j(displayText, "displayText");
        AbstractC22676k.m65750j(style, "style");
        this.displayText = displayText;
        this.icon = enumC16313m0;
        this.style = style;
        this.isClickable = z4;
        this.isTextActionChip = z13;
        this.timeSecondsSuffix = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDisplayText() {
        return this.displayText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC33264j getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTimeSecondsSuffix() {
        return this.timeSecondsSuffix;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsClickable() {
        return this.isClickable;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33265k)) {
            return false;
        }
        C33265k c33265k = (C33265k) other;
        return AbstractC22676k.m65745e(this.displayText, c33265k.displayText) && this.icon == c33265k.icon && this.style == c33265k.style && this.isClickable == c33265k.isClickable && this.isTextActionChip == c33265k.isTextActionChip && AbstractC22676k.m65745e(this.timeSecondsSuffix, c33265k.timeSecondsSuffix);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsTextActionChip() {
        return this.isTextActionChip;
    }

    public int hashCode() {
        int iHashCode = this.displayText.hashCode() * 31;
        EnumC16313m0 enumC16313m0 = this.icon;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.style.hashCode() + ((iHashCode + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31)) * 31, 31, this.isClickable), 31, this.isTextActionChip);
        String str = this.timeSecondsSuffix;
        return iM8289b + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.displayText;
        EnumC16313m0 enumC16313m0 = this.icon;
        EnumC33264j enumC33264j = this.style;
        boolean z4 = this.isClickable;
        boolean z13 = this.isTextActionChip;
        String str2 = this.timeSecondsSuffix;
        StringBuilder sbM61141l = AbstractC21702c.m61141l("EndItemChipViewState(displayText=", str, ", icon=", enumC16313m0, ", style=");
        sbM61141l.append(enumC33264j);
        sbM61141l.append(", isClickable=");
        sbM61141l.append(z4);
        sbM61141l.append(", isTextActionChip=");
        return AbstractC21702c.m61139j(sbM61141l, z13, ", timeSecondsSuffix=", str2, ")");
    }

    public /* synthetic */ C33265k(String str, EnumC16313m0 enumC16313m0, EnumC33264j enumC33264j, boolean z4, boolean z13, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, enumC16313m0, enumC33264j, z4, (i13 & 16) != 0 ? false : z13, (i13 & 32) != 0 ? null : str2);
    }
}
