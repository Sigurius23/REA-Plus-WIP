package c81;

import gz0.EnumC16313m0;
import hy0.C17731c2;
import i93.C18282h;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import nh3.AbstractC26725a;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: c81.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0086\u0001\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b+\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b.\u0010\u0018R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b%\u0010/\u001a\u0004\b&\u00100R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b-\u00101\u001a\u0004\b,\u00102R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b+\u00101\u001a\u0004\b3\u00102R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b!\u00104\u001a\u0004\b5\u00106¨\u00067"}, m65681d2 = {"Lc81/g;", "Lm91/u;", "", "Lc81/e;", "ticks", "", "leftLabelDisplay", "Lgz0/m0;", "leftIcon", "rightLabelDisplay", "rightIcon", "titleDisplay", "Li93/h;", "gradientProgression", "", "ignoreAnimation", "ignoreCurrent", "Lhy0/c2;", "trend", "<init>", "(Ljava/util/List;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Li93/h;ZZLhy0/c2;)V", "a", "(Ljava/util/List;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Li93/h;ZZLhy0/c2;)Lc81/g;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "j", "()Ljava/util/List;", "b", "Ljava/lang/String;", "g", "c", "Lgz0/m0;", "f", "()Lgz0/m0;", "d", "i", "e", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "k", "Li93/h;", "()Li93/h;", "Z", "()Z", "getIgnoreCurrent", "Lhy0/c2;", "l", "()Lhy0/c2;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4307g implements InterfaceC25312u {

    /* JADX INFO: renamed from: k */
    public static final int f17477k = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C4305e> ticks;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String leftLabelDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC16313m0 leftIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String rightLabelDisplay;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC16313m0 rightIcon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String titleDisplay;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C18282h gradientProgression;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean ignoreAnimation;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean ignoreCurrent;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C17731c2 trend;

    public C4307g(List<C4305e> ticks, String str, EnumC16313m0 enumC16313m0, String str2, EnumC16313m0 enumC16313m1, String str3, C18282h gradientProgression, boolean z4, boolean z13, C17731c2 c17731c2) {
        AbstractC22676k.m65750j(ticks, "ticks");
        AbstractC22676k.m65750j(gradientProgression, "gradientProgression");
        this.ticks = ticks;
        this.leftLabelDisplay = str;
        this.leftIcon = enumC16313m0;
        this.rightLabelDisplay = str2;
        this.rightIcon = enumC16313m1;
        this.titleDisplay = str3;
        this.gradientProgression = gradientProgression;
        this.ignoreAnimation = z4;
        this.ignoreCurrent = z13;
        this.trend = c17731c2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C4307g m13579b(C4307g c4307g, List list, String str, EnumC16313m0 enumC16313m0, String str2, EnumC16313m0 enumC16313m1, String str3, C18282h c18282h, boolean z4, boolean z13, C17731c2 c17731c2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = c4307g.ticks;
        }
        if ((i13 & 2) != 0) {
            str = c4307g.leftLabelDisplay;
        }
        if ((i13 & 4) != 0) {
            enumC16313m0 = c4307g.leftIcon;
        }
        if ((i13 & 8) != 0) {
            str2 = c4307g.rightLabelDisplay;
        }
        if ((i13 & 16) != 0) {
            enumC16313m1 = c4307g.rightIcon;
        }
        if ((i13 & 32) != 0) {
            str3 = c4307g.titleDisplay;
        }
        if ((i13 & 64) != 0) {
            c18282h = c4307g.gradientProgression;
        }
        if ((i13 & 128) != 0) {
            z4 = c4307g.ignoreAnimation;
        }
        if ((i13 & 256) != 0) {
            z13 = c4307g.ignoreCurrent;
        }
        if ((i13 & 512) != 0) {
            c17731c2 = c4307g.trend;
        }
        boolean z14 = z13;
        C17731c2 c17731c3 = c17731c2;
        C18282h c18282h2 = c18282h;
        boolean z15 = z4;
        EnumC16313m0 enumC16313m2 = enumC16313m1;
        String str4 = str3;
        return c4307g.m13580a(list, str, enumC16313m0, str2, enumC16313m2, str4, c18282h2, z15, z14, c17731c3);
    }

    /* JADX INFO: renamed from: a */
    public final C4307g m13580a(List<C4305e> ticks, String leftLabelDisplay, EnumC16313m0 leftIcon, String rightLabelDisplay, EnumC16313m0 rightIcon, String titleDisplay, C18282h gradientProgression, boolean ignoreAnimation, boolean ignoreCurrent, C17731c2 trend) {
        AbstractC22676k.m65750j(ticks, "ticks");
        AbstractC22676k.m65750j(gradientProgression, "gradientProgression");
        return new C4307g(ticks, leftLabelDisplay, leftIcon, rightLabelDisplay, rightIcon, titleDisplay, gradientProgression, ignoreAnimation, ignoreCurrent, trend);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C18282h getGradientProgression() {
        return this.gradientProgression;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIgnoreAnimation() {
        return this.ignoreAnimation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4307g)) {
            return false;
        }
        C4307g c4307g = (C4307g) other;
        return AbstractC22676k.m65745e(this.ticks, c4307g.ticks) && AbstractC22676k.m65745e(this.leftLabelDisplay, c4307g.leftLabelDisplay) && this.leftIcon == c4307g.leftIcon && AbstractC22676k.m65745e(this.rightLabelDisplay, c4307g.rightLabelDisplay) && this.rightIcon == c4307g.rightIcon && AbstractC22676k.m65745e(this.titleDisplay, c4307g.titleDisplay) && AbstractC22676k.m65745e(this.gradientProgression, c4307g.gradientProgression) && this.ignoreAnimation == c4307g.ignoreAnimation && this.ignoreCurrent == c4307g.ignoreCurrent && AbstractC22676k.m65745e(this.trend, c4307g.trend);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC16313m0 getLeftIcon() {
        return this.leftIcon;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getLeftLabelDisplay() {
        return this.leftLabelDisplay;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC16313m0 getRightIcon() {
        return this.rightIcon;
    }

    public int hashCode() {
        int iHashCode = this.ticks.hashCode() * 31;
        String str = this.leftLabelDisplay;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.leftIcon;
        int iHashCode3 = (iHashCode2 + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        String str2 = this.rightLabelDisplay;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        EnumC16313m0 enumC16313m1 = this.rightIcon;
        int iHashCode5 = (iHashCode4 + (enumC16313m1 == null ? 0 : enumC16313m1.hashCode())) * 31;
        String str3 = this.titleDisplay;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.gradientProgression.hashCode() + ((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 31, this.ignoreAnimation), 31, this.ignoreCurrent);
        C17731c2 c17731c2 = this.trend;
        return iM8289b + (c17731c2 != null ? c17731c2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getRightLabelDisplay() {
        return this.rightLabelDisplay;
    }

    /* JADX INFO: renamed from: j */
    public final List<C4305e> m13587j() {
        return this.ticks;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final C17731c2 getTrend() {
        return this.trend;
    }

    public String toString() {
        List<C4305e> list = this.ticks;
        String str = this.leftLabelDisplay;
        EnumC16313m0 enumC16313m0 = this.leftIcon;
        String str2 = this.rightLabelDisplay;
        EnumC16313m0 enumC16313m1 = this.rightIcon;
        String str3 = this.titleDisplay;
        C18282h c18282h = this.gradientProgression;
        boolean z4 = this.ignoreAnimation;
        boolean z13 = this.ignoreCurrent;
        C17731c2 c17731c2 = this.trend;
        StringBuilder sbM79507k = AbstractC26725a.m79507k("PaceOfAgingMeterViewState(ticks=", ", leftLabelDisplay=", str, ", leftIcon=", list);
        sbM79507k.append(enumC16313m0);
        sbM79507k.append(", rightLabelDisplay=");
        sbM79507k.append(str2);
        sbM79507k.append(", rightIcon=");
        sbM79507k.append(enumC16313m1);
        sbM79507k.append(", titleDisplay=");
        sbM79507k.append(str3);
        sbM79507k.append(", gradientProgression=");
        sbM79507k.append(c18282h);
        sbM79507k.append(", ignoreAnimation=");
        sbM79507k.append(z4);
        sbM79507k.append(", ignoreCurrent=");
        sbM79507k.append(z13);
        sbM79507k.append(", trend=");
        sbM79507k.append(c17731c2);
        sbM79507k.append(")");
        return sbM79507k.toString();
    }

    public /* synthetic */ C4307g(List list, String str, EnumC16313m0 enumC16313m0, String str2, EnumC16313m0 enumC16313m1, String str3, C18282h c18282h, boolean z4, boolean z13, C17731c2 c17731c2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, enumC16313m0, str2, enumC16313m1, str3, c18282h, (i13 & 128) != 0 ? true : z4, (i13 & 256) != 0 ? false : z13, (i13 & 512) != 0 ? null : c17731c2);
    }
}
