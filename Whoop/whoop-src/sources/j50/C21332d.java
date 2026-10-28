package j50;

import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: j50.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b \u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\u0017\u0010\"¨\u0006#"}, m65681d2 = {"Lj50/d;", "Lm91/u;", "", "title", "subtitle", "previewText", "Lgz0/m0;", "leftIcon", "rightIcon", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Lcom/whoop/navigation/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "g", "b", "f", "c", "d", "Lgz0/m0;", "()Lgz0/m0;", "e", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21332d implements InterfaceC25312u {

    /* JADX INFO: renamed from: g */
    public static final int f81553g = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String previewText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC16313m0 leftIcon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC16313m0 rightIcon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C9598e destination;

    public C21332d(String title, String str, String str2, EnumC16313m0 leftIcon, EnumC16313m0 enumC16313m0, C9598e c9598e) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(leftIcon, "leftIcon");
        this.title = title;
        this.subtitle = str;
        this.previewText = str2;
        this.leftIcon = leftIcon;
        this.rightIcon = enumC16313m0;
        this.destination = c9598e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC16313m0 getLeftIcon() {
        return this.leftIcon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPreviewText() {
        return this.previewText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC16313m0 getRightIcon() {
        return this.rightIcon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21332d)) {
            return false;
        }
        C21332d c21332d = (C21332d) other;
        return AbstractC22676k.m65745e(this.title, c21332d.title) && AbstractC22676k.m65745e(this.subtitle, c21332d.subtitle) && AbstractC22676k.m65745e(this.previewText, c21332d.previewText) && this.leftIcon == c21332d.leftIcon && this.rightIcon == c21332d.rightIcon && AbstractC22676k.m65745e(this.destination, c21332d.destination);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.previewText;
        int iM48500b = AbstractC17176i.m48500b(this.leftIcon, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        EnumC16313m0 enumC16313m0 = this.rightIcon;
        int iHashCode3 = (iM48500b + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        C9598e c9598e = this.destination;
        return iHashCode3 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.previewText;
        EnumC16313m0 enumC16313m0 = this.leftIcon;
        EnumC16313m0 enumC16313m1 = this.rightIcon;
        C9598e c9598e = this.destination;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CareUpdateEntrypointTileViewState(title=", str, ", subtitle=", str2, ", previewText=");
        sbM32001t.append(str3);
        sbM32001t.append(", leftIcon=");
        sbM32001t.append(enumC16313m0);
        sbM32001t.append(", rightIcon=");
        sbM32001t.append(enumC16313m1);
        sbM32001t.append(", destination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
