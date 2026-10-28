package b72;

import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: b72.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011Jp\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000f\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\"\u0010*\u001a\u0004\b(\u0010+R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b&\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b/\u0010\u0015R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b \u0010,\u001a\u0004\b0\u0010.¨\u00061"}, m65681d2 = {"Lb72/e;", "Lm91/u;", "", "gaugeDateDisplay", "gaugeSubtextDisplay", "Lb72/f;", "gaugeLastUpdatedDisplayStyle", "Lb72/d;", "gaugeLeftSubtext", "gaugeRightSubtext", "", "gaugeFillPercentage", "", "isLoading", "errorDisplay", "isContinuousDial", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lb72/f;Lb72/d;Lb72/d;Ljava/lang/Float;ZLjava/lang/String;Z)V", "a", "(Ljava/lang/String;Ljava/lang/String;Lb72/f;Lb72/d;Lb72/d;Ljava/lang/Float;ZLjava/lang/String;Z)Lb72/e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "i", "Lb72/f;", "f", "()Lb72/f;", "d", "Lb72/d;", "g", "()Lb72/d;", "e", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/lang/Float;", "()Ljava/lang/Float;", "Z", "k", "()Z", "getErrorDisplay", "j", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C2787e implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String gaugeDateDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String gaugeSubtextDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC2788f gaugeLastUpdatedDisplayStyle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C2786d gaugeLeftSubtext;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C2786d gaugeRightSubtext;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Float gaugeFillPercentage;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String errorDisplay;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean isContinuousDial;

    public C2787e(String str, String gaugeSubtextDisplay, EnumC2788f gaugeLastUpdatedDisplayStyle, C2786d gaugeLeftSubtext, C2786d gaugeRightSubtext, Float f13, boolean z4, String str2, boolean z13) {
        AbstractC22676k.m65750j(gaugeSubtextDisplay, "gaugeSubtextDisplay");
        AbstractC22676k.m65750j(gaugeLastUpdatedDisplayStyle, "gaugeLastUpdatedDisplayStyle");
        AbstractC22676k.m65750j(gaugeLeftSubtext, "gaugeLeftSubtext");
        AbstractC22676k.m65750j(gaugeRightSubtext, "gaugeRightSubtext");
        this.gaugeDateDisplay = str;
        this.gaugeSubtextDisplay = gaugeSubtextDisplay;
        this.gaugeLastUpdatedDisplayStyle = gaugeLastUpdatedDisplayStyle;
        this.gaugeLeftSubtext = gaugeLeftSubtext;
        this.gaugeRightSubtext = gaugeRightSubtext;
        this.gaugeFillPercentage = f13;
        this.isLoading = z4;
        this.errorDisplay = str2;
        this.isContinuousDial = z13;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C2787e m7922b(C2787e c2787e, String str, String str2, EnumC2788f enumC2788f, C2786d c2786d, C2786d c2786d2, Float f13, boolean z4, String str3, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c2787e.gaugeDateDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = c2787e.gaugeSubtextDisplay;
        }
        if ((i13 & 4) != 0) {
            enumC2788f = c2787e.gaugeLastUpdatedDisplayStyle;
        }
        if ((i13 & 8) != 0) {
            c2786d = c2787e.gaugeLeftSubtext;
        }
        if ((i13 & 16) != 0) {
            c2786d2 = c2787e.gaugeRightSubtext;
        }
        if ((i13 & 32) != 0) {
            f13 = c2787e.gaugeFillPercentage;
        }
        if ((i13 & 64) != 0) {
            z4 = c2787e.isLoading;
        }
        if ((i13 & 128) != 0) {
            str3 = c2787e.errorDisplay;
        }
        if ((i13 & 256) != 0) {
            z13 = c2787e.isContinuousDial;
        }
        String str4 = str3;
        boolean z14 = z13;
        Float f14 = f13;
        boolean z15 = z4;
        C2786d c2786d3 = c2786d2;
        EnumC2788f enumC2788f2 = enumC2788f;
        return c2787e.m7923a(str, str2, enumC2788f2, c2786d, c2786d3, f14, z15, str4, z14);
    }

    /* JADX INFO: renamed from: a */
    public final C2787e m7923a(String gaugeDateDisplay, String gaugeSubtextDisplay, EnumC2788f gaugeLastUpdatedDisplayStyle, C2786d gaugeLeftSubtext, C2786d gaugeRightSubtext, Float gaugeFillPercentage, boolean isLoading, String errorDisplay, boolean isContinuousDial) {
        AbstractC22676k.m65750j(gaugeSubtextDisplay, "gaugeSubtextDisplay");
        AbstractC22676k.m65750j(gaugeLastUpdatedDisplayStyle, "gaugeLastUpdatedDisplayStyle");
        AbstractC22676k.m65750j(gaugeLeftSubtext, "gaugeLeftSubtext");
        AbstractC22676k.m65750j(gaugeRightSubtext, "gaugeRightSubtext");
        return new C2787e(gaugeDateDisplay, gaugeSubtextDisplay, gaugeLastUpdatedDisplayStyle, gaugeLeftSubtext, gaugeRightSubtext, gaugeFillPercentage, isLoading, errorDisplay, isContinuousDial);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getGaugeDateDisplay() {
        return this.gaugeDateDisplay;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Float getGaugeFillPercentage() {
        return this.gaugeFillPercentage;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2787e)) {
            return false;
        }
        C2787e c2787e = (C2787e) other;
        return AbstractC22676k.m65745e(this.gaugeDateDisplay, c2787e.gaugeDateDisplay) && AbstractC22676k.m65745e(this.gaugeSubtextDisplay, c2787e.gaugeSubtextDisplay) && this.gaugeLastUpdatedDisplayStyle == c2787e.gaugeLastUpdatedDisplayStyle && AbstractC22676k.m65745e(this.gaugeLeftSubtext, c2787e.gaugeLeftSubtext) && AbstractC22676k.m65745e(this.gaugeRightSubtext, c2787e.gaugeRightSubtext) && AbstractC22676k.m65745e(this.gaugeFillPercentage, c2787e.gaugeFillPercentage) && this.isLoading == c2787e.isLoading && AbstractC22676k.m65745e(this.errorDisplay, c2787e.errorDisplay) && this.isContinuousDial == c2787e.isContinuousDial;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC2788f getGaugeLastUpdatedDisplayStyle() {
        return this.gaugeLastUpdatedDisplayStyle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C2786d getGaugeLeftSubtext() {
        return this.gaugeLeftSubtext;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C2786d getGaugeRightSubtext() {
        return this.gaugeRightSubtext;
    }

    public int hashCode() {
        String str = this.gaugeDateDisplay;
        int iHashCode = (this.gaugeRightSubtext.hashCode() + ((this.gaugeLeftSubtext.hashCode() + ((this.gaugeLastUpdatedDisplayStyle.hashCode() + AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.gaugeSubtextDisplay)) * 31)) * 31)) * 31;
        Float f13 = this.gaugeFillPercentage;
        int iM8289b = AbstractC2875y.m8289b((iHashCode + (f13 == null ? 0 : f13.hashCode())) * 31, 31, this.isLoading);
        String str2 = this.errorDisplay;
        return Boolean.hashCode(this.isContinuousDial) + ((iM8289b + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getGaugeSubtextDisplay() {
        return this.gaugeSubtextDisplay;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsContinuousDial() {
        return this.isContinuousDial;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public String toString() {
        String str = this.gaugeDateDisplay;
        String str2 = this.gaugeSubtextDisplay;
        EnumC2788f enumC2788f = this.gaugeLastUpdatedDisplayStyle;
        C2786d c2786d = this.gaugeLeftSubtext;
        C2786d c2786d2 = this.gaugeRightSubtext;
        Float f13 = this.gaugeFillPercentage;
        boolean z4 = this.isLoading;
        String str3 = this.errorDisplay;
        boolean z13 = this.isContinuousDial;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SageGaugeViewState(gaugeDateDisplay=", str, ", gaugeSubtextDisplay=", str2, ", gaugeLastUpdatedDisplayStyle=");
        sbM32001t.append(enumC2788f);
        sbM32001t.append(", gaugeLeftSubtext=");
        sbM32001t.append(c2786d);
        sbM32001t.append(", gaugeRightSubtext=");
        sbM32001t.append(c2786d2);
        sbM32001t.append(", gaugeFillPercentage=");
        sbM32001t.append(f13);
        sbM32001t.append(", isLoading=");
        AbstractC38963t7.m124391u(sbM32001t, z4, ", errorDisplay=", str3, ", isContinuousDial=");
        return AbstractC18489d0.m53372m(sbM32001t, z13, ")");
    }

    public /* synthetic */ C2787e(String str, String str2, EnumC2788f enumC2788f, C2786d c2786d, C2786d c2786d2, Float f13, boolean z4, String str3, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, enumC2788f, c2786d, c2786d2, f13, (i13 & 64) != 0 ? false : z4, (i13 & 128) != 0 ? null : str3, (i13 & 256) != 0 ? false : z13);
    }
}
