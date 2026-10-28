package t21;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.C9598e;
import i51.C18122s;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import kd1.AbstractC22403o;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import te0.AbstractC33745d;
import v41.InterfaceC35689r0;

/* JADX INFO: renamed from: t21.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b&\u0010/R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b$\u00102R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b(\u00103\u001a\u0004\b\u001e\u00104R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b0\u0010!R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b \u00105\u001a\u0004\b-\u00106¨\u00067"}, m65681d2 = {"Lt21/d;", "", "", "isLoading", "isError", "", "count", "Ly81/f;", "textColor", "Lv41/r0;", "lottieWrapper", "Lkd1/o;", "image", "Li51/s;", "dynamicLottieViewState", "Ly81/e;", "animationAccentColor", "shouldAnimate", "Lcom/whoop/navigation/e;", NotificationCompat.CATEGORY_NAVIGATION, "<init>", "(ZZLjava/lang/String;Ly81/f;Lv41/r0;Lkd1/o;Li51/s;Ly81/e;ZLcom/whoop/navigation/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "j", "()Z", "b", "i", "c", "Ljava/lang/String;", "d", "Ly81/f;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ly81/f;", "e", "Lv41/r0;", "()Lv41/r0;", "f", "Lkd1/o;", "()Lkd1/o;", "g", "Li51/s;", "()Li51/s;", "Ly81/e;", "()Ly81/e;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33346d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String count;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC39333f textColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC35689r0 lottieWrapper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C18122s dynamicLottieViewState;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC39332e animationAccentColor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean shouldAnimate;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C9598e navigation;

    public C33346d(boolean z4, boolean z13, String str, EnumC39333f textColor, InterfaceC35689r0 interfaceC35689r0, AbstractC22403o abstractC22403o, C18122s c18122s, InterfaceC39332e animationAccentColor, boolean z14, C9598e c9598e) {
        AbstractC22676k.m65750j(textColor, "textColor");
        AbstractC22676k.m65750j(animationAccentColor, "animationAccentColor");
        this.isLoading = z4;
        this.isError = z13;
        this.count = str;
        this.textColor = textColor;
        this.lottieWrapper = interfaceC35689r0;
        this.image = abstractC22403o;
        this.dynamicLottieViewState = c18122s;
        this.animationAccentColor = animationAccentColor;
        this.shouldAnimate = z14;
        this.navigation = c9598e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC39332e getAnimationAccentColor() {
        return this.animationAccentColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C18122s getDynamicLottieViewState() {
        return this.dynamicLottieViewState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC35689r0 getLottieWrapper() {
        return this.lottieWrapper;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33346d)) {
            return false;
        }
        C33346d c33346d = (C33346d) other;
        return this.isLoading == c33346d.isLoading && this.isError == c33346d.isError && AbstractC22676k.m65745e(this.count, c33346d.count) && this.textColor == c33346d.textColor && AbstractC22676k.m65745e(this.lottieWrapper, c33346d.lottieWrapper) && AbstractC22676k.m65745e(this.image, c33346d.image) && AbstractC22676k.m65745e(this.dynamicLottieViewState, c33346d.dynamicLottieViewState) && AbstractC22676k.m65745e(this.animationAccentColor, c33346d.animationAccentColor) && this.shouldAnimate == c33346d.shouldAnimate && AbstractC22676k.m65745e(this.navigation, c33346d.navigation);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C9598e getNavigation() {
        return this.navigation;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getShouldAnimate() {
        return this.shouldAnimate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC39333f getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isError);
        String str = this.count;
        int iM61132c = AbstractC21702c.m61132c(this.textColor, (iM8289b + (str == null ? 0 : str.hashCode())) * 31, 31);
        InterfaceC35689r0 interfaceC35689r0 = this.lottieWrapper;
        int iHashCode = (iM61132c + (interfaceC35689r0 == null ? 0 : interfaceC35689r0.hashCode())) * 31;
        AbstractC22403o abstractC22403o = this.image;
        int iHashCode2 = (iHashCode + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31;
        C18122s c18122s = this.dynamicLottieViewState;
        int iM8289b2 = AbstractC2875y.m8289b(AbstractC33745d.m106648g(this.animationAccentColor, (iHashCode2 + (c18122s == null ? 0 : c18122s.hashCode())) * 31, 31), 31, this.shouldAnimate);
        C9598e c9598e = this.navigation;
        return iM8289b2 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public String toString() {
        boolean z4 = this.isLoading;
        boolean z13 = this.isError;
        String str = this.count;
        EnumC39333f enumC39333f = this.textColor;
        InterfaceC35689r0 interfaceC35689r0 = this.lottieWrapper;
        AbstractC22403o abstractC22403o = this.image;
        C18122s c18122s = this.dynamicLottieViewState;
        InterfaceC39332e interfaceC39332e = this.animationAccentColor;
        boolean z14 = this.shouldAnimate;
        C9598e c9598e = this.navigation;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("MilestonePillViewState(isLoading=", ", isError=", ", count=", z4, z13);
        sbM32002u.append(str);
        sbM32002u.append(", textColor=");
        sbM32002u.append(enumC39333f);
        sbM32002u.append(", lottieWrapper=");
        sbM32002u.append(interfaceC35689r0);
        sbM32002u.append(", image=");
        sbM32002u.append(abstractC22403o);
        sbM32002u.append(", dynamicLottieViewState=");
        sbM32002u.append(c18122s);
        sbM32002u.append(", animationAccentColor=");
        sbM32002u.append(interfaceC39332e);
        sbM32002u.append(", shouldAnimate=");
        sbM32002u.append(z14);
        sbM32002u.append(", navigation=");
        sbM32002u.append(c9598e);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    public /* synthetic */ C33346d(boolean z4, boolean z13, String str, EnumC39333f enumC39333f, InterfaceC35689r0 interfaceC35689r0, AbstractC22403o abstractC22403o, C18122s c18122s, InterfaceC39332e interfaceC39332e, boolean z14, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? EnumC39333f.BRAND_WHITE : enumC39333f, (i13 & 16) != 0 ? null : interfaceC35689r0, (i13 & 32) != 0 ? null : abstractC22403o, (i13 & 64) != 0 ? null : c18122s, (i13 & 128) != 0 ? EnumC39333f.STRAIN : interfaceC39332e, (i13 & 256) != 0 ? false : z14, (i13 & 512) != 0 ? null : c9598e);
    }
}
