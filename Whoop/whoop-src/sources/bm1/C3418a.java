package bm1;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.C9598e;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: bm1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001a\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\r¨\u0006\u001e"}, m65681d2 = {"Lbm1/a;", "", "", "streakValue", "streakState", "lottieUrl", "imageUrl", "Lcom/whoop/navigation/e;", NotificationCompat.CATEGORY_NAVIGATION, "animationAccentColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "e", "c", "d", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3418a {

    /* JADX INFO: renamed from: g */
    public static final int f13320g = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String streakValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String streakState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String lottieUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String imageUrl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C9598e navigation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String animationAccentColor;

    public C3418a(String streakValue, String streakState, String str, String str2, C9598e navigation, String str3) {
        AbstractC22676k.m65750j(streakValue, "streakValue");
        AbstractC22676k.m65750j(streakState, "streakState");
        AbstractC22676k.m65750j(navigation, "navigation");
        this.streakValue = streakValue;
        this.streakState = streakState;
        this.lottieUrl = str;
        this.imageUrl = str2;
        this.navigation = navigation;
        this.animationAccentColor = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAnimationAccentColor() {
        return this.animationAccentColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLottieUrl() {
        return this.lottieUrl;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C9598e getNavigation() {
        return this.navigation;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getStreakState() {
        return this.streakState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3418a)) {
            return false;
        }
        C3418a c3418a = (C3418a) other;
        return AbstractC22676k.m65745e(this.streakValue, c3418a.streakValue) && AbstractC22676k.m65745e(this.streakState, c3418a.streakState) && AbstractC22676k.m65745e(this.lottieUrl, c3418a.lottieUrl) && AbstractC22676k.m65745e(this.imageUrl, c3418a.imageUrl) && AbstractC22676k.m65745e(this.navigation, c3418a.navigation) && AbstractC22676k.m65745e(this.animationAccentColor, c3418a.animationAccentColor);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getStreakValue() {
        return this.streakValue;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.streakValue.hashCode() * 31, 31, this.streakState);
        String str = this.lottieUrl;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageUrl;
        int iM114673a = AbstractC36095b.m114673a(this.navigation, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.animationAccentColor;
        return iM114673a + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.streakValue;
        String str2 = this.streakState;
        String str3 = this.lottieUrl;
        String str4 = this.imageUrl;
        C9598e c9598e = this.navigation;
        String str5 = this.animationAccentColor;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("StreaksDataStoreDto(streakValue=", str, ", streakState=", str2, ", lottieUrl=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", imageUrl=", str4, ", navigation=");
        sbM32001t.append(c9598e);
        sbM32001t.append(", animationAccentColor=");
        sbM32001t.append(str5);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
