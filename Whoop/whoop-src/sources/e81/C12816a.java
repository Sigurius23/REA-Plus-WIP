package e81;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: e81.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ@\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001a\u0010\u001f¨\u0006 "}, m65681d2 = {"Le81/a;", "", "", "title", "subtitle", "Lgz0/m0;", "subtitleIcon", "Lcom/whoop/navigation/e;", NotificationCompat.CATEGORY_NAVIGATION, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/e;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/e;)Le81/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "b", "d", "c", "Lgz0/m0;", "e", "()Lgz0/m0;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12816a {

    /* JADX INFO: renamed from: e */
    public static final int f43880e = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC16313m0 subtitleIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C9598e navigation;

    public C12816a(String str, String str2, EnumC16313m0 enumC16313m0, C9598e c9598e) {
        this.title = str;
        this.subtitle = str2;
        this.subtitleIcon = enumC16313m0;
        this.navigation = c9598e;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C12816a m35879b(C12816a c12816a, String str, String str2, EnumC16313m0 enumC16313m0, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c12816a.title;
        }
        if ((i13 & 2) != 0) {
            str2 = c12816a.subtitle;
        }
        if ((i13 & 4) != 0) {
            enumC16313m0 = c12816a.subtitleIcon;
        }
        if ((i13 & 8) != 0) {
            c9598e = c12816a.navigation;
        }
        return c12816a.m35880a(str, str2, enumC16313m0, c9598e);
    }

    /* JADX INFO: renamed from: a */
    public final C12816a m35880a(String title, String subtitle, EnumC16313m0 subtitleIcon, C9598e navigation) {
        return new C12816a(title, subtitle, subtitleIcon, navigation);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C9598e getNavigation() {
        return this.navigation;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC16313m0 getSubtitleIcon() {
        return this.subtitleIcon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12816a)) {
            return false;
        }
        C12816a c12816a = (C12816a) other;
        return AbstractC22676k.m65745e(this.title, c12816a.title) && AbstractC22676k.m65745e(this.subtitle, c12816a.subtitle) && this.subtitleIcon == c12816a.subtitleIcon && AbstractC22676k.m65745e(this.navigation, c12816a.navigation);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.subtitleIcon;
        int iHashCode3 = (iHashCode2 + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        C9598e c9598e = this.navigation;
        return iHashCode3 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        EnumC16313m0 enumC16313m0 = this.subtitleIcon;
        C9598e c9598e = this.navigation;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("BiomarkerPieChartContentViewState(title=", str, ", subtitle=", str2, ", subtitleIcon=");
        sbM32001t.append(enumC16313m0);
        sbM32001t.append(", navigation=");
        sbM32001t.append(c9598e);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
