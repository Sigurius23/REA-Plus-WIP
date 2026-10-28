package p736sz0;

import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: sz0.b1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010\u0010R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b\u001b\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b\u001f\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b\u0018\u0010&¨\u0006'"}, m65681d2 = {"Lsz0/b1;", "Lm91/u;", "", "titleDisplay", "", "progressPercentage", "leadingSubtext", "trailingSubtext", "Lgz0/m0;", "icon", "leadingIcon", "", "hideProgressBar", "<init>", "(Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "g", "b", "F", "f", "()F", "c", "e", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lgz0/m0;", "()Lgz0/m0;", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33167b1 implements InterfaceC25312u {

    /* JADX INFO: renamed from: h */
    public static final int f138310h = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String titleDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float progressPercentage;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String leadingSubtext;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String trailingSubtext;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC16313m0 leadingIcon;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean hideProgressBar;

    public C33167b1(String titleDisplay, float f13, String leadingSubtext, String trailingSubtext, EnumC16313m0 enumC16313m0, EnumC16313m0 enumC16313m1, boolean z4) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(leadingSubtext, "leadingSubtext");
        AbstractC22676k.m65750j(trailingSubtext, "trailingSubtext");
        this.titleDisplay = titleDisplay;
        this.progressPercentage = f13;
        this.leadingSubtext = leadingSubtext;
        this.trailingSubtext = trailingSubtext;
        this.icon = enumC16313m0;
        this.leadingIcon = enumC16313m1;
        this.hideProgressBar = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getHideProgressBar() {
        return this.hideProgressBar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC16313m0 getLeadingIcon() {
        return this.leadingIcon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLeadingSubtext() {
        return this.leadingSubtext;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33167b1)) {
            return false;
        }
        C33167b1 c33167b1 = (C33167b1) other;
        return AbstractC22676k.m65745e(this.titleDisplay, c33167b1.titleDisplay) && Float.compare(this.progressPercentage, c33167b1.progressPercentage) == 0 && AbstractC22676k.m65745e(this.leadingSubtext, c33167b1.leadingSubtext) && AbstractC22676k.m65745e(this.trailingSubtext, c33167b1.trailingSubtext) && this.icon == c33167b1.icon && this.leadingIcon == c33167b1.leadingIcon && this.hideProgressBar == c33167b1.hideProgressBar;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getProgressPercentage() {
        return this.progressPercentage;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTrailingSubtext() {
        return this.trailingSubtext;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30447a(this.progressPercentage, this.titleDisplay.hashCode() * 31, 31), 31, this.leadingSubtext), 31, this.trailingSubtext);
        EnumC16313m0 enumC16313m0 = this.icon;
        int iHashCode = (iM30450d + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        EnumC16313m0 enumC16313m1 = this.leadingIcon;
        return Boolean.hashCode(this.hideProgressBar) + ((iHashCode + (enumC16313m1 != null ? enumC16313m1.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.titleDisplay;
        float f13 = this.progressPercentage;
        String str2 = this.leadingSubtext;
        String str3 = this.trailingSubtext;
        EnumC16313m0 enumC16313m0 = this.icon;
        EnumC16313m0 enumC16313m1 = this.leadingIcon;
        boolean z4 = this.hideProgressBar;
        StringBuilder sb4 = new StringBuilder("ShippingProgressBarViewState(titleDisplay=");
        sb4.append(str);
        sb4.append(", progressPercentage=");
        sb4.append(f13);
        sb4.append(", leadingSubtext=");
        AbstractC11266d.m30444B(sb4, str2, ", trailingSubtext=", str3, ", icon=");
        sb4.append(enumC16313m0);
        sb4.append(", leadingIcon=");
        sb4.append(enumC16313m1);
        sb4.append(", hideProgressBar=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    public /* synthetic */ C33167b1(String str, float f13, String str2, String str3, EnumC16313m0 enumC16313m0, EnumC16313m0 enumC16313m1, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f13, str2, str3, enumC16313m0, (i13 & 32) != 0 ? null : enumC16313m1, (i13 & 64) != 0 ? false : z4);
    }
}
