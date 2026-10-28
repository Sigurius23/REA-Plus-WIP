package c51;

import b91.EnumC2888c;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: c51.o */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJV\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'¨\u0006("}, m65681d2 = {"Lc51/o;", "", "", "ageValueDisplay", "ageTitleDisplay", "ageSubtitleValueDisplay", "ageSubtitleDisplay", "Ly81/f;", "subtitleColor", "Lb91/c;", "largeValueDisplayStyle", "", "largeTitleDisplay", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly81/f;Lb91/c;Z)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly81/f;Lb91/c;Z)Lc51/o;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "b", "e", "c", "d", "Ly81/f;", "i", "()Ly81/f;", "Lb91/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lb91/c;", "g", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4238o {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String ageValueDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String ageTitleDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String ageSubtitleValueDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String ageSubtitleDisplay;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC39333f subtitleColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC2888c largeValueDisplayStyle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean largeTitleDisplay;

    public C4238o(String ageValueDisplay, String ageTitleDisplay, String ageSubtitleValueDisplay, String ageSubtitleDisplay, EnumC39333f subtitleColor, EnumC2888c largeValueDisplayStyle, boolean z4) {
        AbstractC22676k.m65750j(ageValueDisplay, "ageValueDisplay");
        AbstractC22676k.m65750j(ageTitleDisplay, "ageTitleDisplay");
        AbstractC22676k.m65750j(ageSubtitleValueDisplay, "ageSubtitleValueDisplay");
        AbstractC22676k.m65750j(ageSubtitleDisplay, "ageSubtitleDisplay");
        AbstractC22676k.m65750j(subtitleColor, "subtitleColor");
        AbstractC22676k.m65750j(largeValueDisplayStyle, "largeValueDisplayStyle");
        this.ageValueDisplay = ageValueDisplay;
        this.ageTitleDisplay = ageTitleDisplay;
        this.ageSubtitleValueDisplay = ageSubtitleValueDisplay;
        this.ageSubtitleDisplay = ageSubtitleDisplay;
        this.subtitleColor = subtitleColor;
        this.largeValueDisplayStyle = largeValueDisplayStyle;
        this.largeTitleDisplay = z4;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C4238o m13215b(C4238o c4238o, String str, String str2, String str3, String str4, EnumC39333f enumC39333f, EnumC2888c enumC2888c, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c4238o.ageValueDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = c4238o.ageTitleDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = c4238o.ageSubtitleValueDisplay;
        }
        if ((i13 & 8) != 0) {
            str4 = c4238o.ageSubtitleDisplay;
        }
        if ((i13 & 16) != 0) {
            enumC39333f = c4238o.subtitleColor;
        }
        if ((i13 & 32) != 0) {
            enumC2888c = c4238o.largeValueDisplayStyle;
        }
        if ((i13 & 64) != 0) {
            z4 = c4238o.largeTitleDisplay;
        }
        EnumC2888c enumC2888c2 = enumC2888c;
        boolean z13 = z4;
        EnumC39333f enumC39333f2 = enumC39333f;
        String str5 = str3;
        return c4238o.m13216a(str, str2, str5, str4, enumC39333f2, enumC2888c2, z13);
    }

    /* JADX INFO: renamed from: a */
    public final C4238o m13216a(String ageValueDisplay, String ageTitleDisplay, String ageSubtitleValueDisplay, String ageSubtitleDisplay, EnumC39333f subtitleColor, EnumC2888c largeValueDisplayStyle, boolean largeTitleDisplay) {
        AbstractC22676k.m65750j(ageValueDisplay, "ageValueDisplay");
        AbstractC22676k.m65750j(ageTitleDisplay, "ageTitleDisplay");
        AbstractC22676k.m65750j(ageSubtitleValueDisplay, "ageSubtitleValueDisplay");
        AbstractC22676k.m65750j(ageSubtitleDisplay, "ageSubtitleDisplay");
        AbstractC22676k.m65750j(subtitleColor, "subtitleColor");
        AbstractC22676k.m65750j(largeValueDisplayStyle, "largeValueDisplayStyle");
        return new C4238o(ageValueDisplay, ageTitleDisplay, ageSubtitleValueDisplay, ageSubtitleDisplay, subtitleColor, largeValueDisplayStyle, largeTitleDisplay);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAgeSubtitleDisplay() {
        return this.ageSubtitleDisplay;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getAgeSubtitleValueDisplay() {
        return this.ageSubtitleValueDisplay;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getAgeTitleDisplay() {
        return this.ageTitleDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4238o)) {
            return false;
        }
        C4238o c4238o = (C4238o) other;
        return AbstractC22676k.m65745e(this.ageValueDisplay, c4238o.ageValueDisplay) && AbstractC22676k.m65745e(this.ageTitleDisplay, c4238o.ageTitleDisplay) && AbstractC22676k.m65745e(this.ageSubtitleValueDisplay, c4238o.ageSubtitleValueDisplay) && AbstractC22676k.m65745e(this.ageSubtitleDisplay, c4238o.ageSubtitleDisplay) && this.subtitleColor == c4238o.subtitleColor && this.largeValueDisplayStyle == c4238o.largeValueDisplayStyle && this.largeTitleDisplay == c4238o.largeTitleDisplay;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getAgeValueDisplay() {
        return this.ageValueDisplay;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getLargeTitleDisplay() {
        return this.largeTitleDisplay;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC2888c getLargeValueDisplayStyle() {
        return this.largeValueDisplayStyle;
    }

    public int hashCode() {
        return Boolean.hashCode(this.largeTitleDisplay) + ((this.largeValueDisplayStyle.hashCode() + AbstractC21702c.m61132c(this.subtitleColor, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.ageValueDisplay.hashCode() * 31, 31, this.ageTitleDisplay), 31, this.ageSubtitleValueDisplay), 31, this.ageSubtitleDisplay), 31)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final EnumC39333f getSubtitleColor() {
        return this.subtitleColor;
    }

    public String toString() {
        String str = this.ageValueDisplay;
        String str2 = this.ageTitleDisplay;
        String str3 = this.ageSubtitleValueDisplay;
        String str4 = this.ageSubtitleDisplay;
        EnumC39333f enumC39333f = this.subtitleColor;
        EnumC2888c enumC2888c = this.largeValueDisplayStyle;
        boolean z4 = this.largeTitleDisplay;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AmoebaTextViewState(ageValueDisplay=", str, ", ageTitleDisplay=", str2, ", ageSubtitleValueDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", ageSubtitleDisplay=", str4, ", subtitleColor=");
        sbM32001t.append(enumC39333f);
        sbM32001t.append(", largeValueDisplayStyle=");
        sbM32001t.append(enumC2888c);
        sbM32001t.append(", largeTitleDisplay=");
        return AbstractC18489d0.m53372m(sbM32001t, z4, ")");
    }

    public /* synthetic */ C4238o(String str, String str2, String str3, String str4, EnumC39333f enumC39333f, EnumC2888c enumC2888c, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "" : str4, (i13 & 16) != 0 ? EnumC39333f.HEALTH_NEUTRAL : enumC39333f, (i13 & 32) != 0 ? EnumC2888c.N3 : enumC2888c, (i13 & 64) != 0 ? false : z4);
    }
}
