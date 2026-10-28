package h90;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.util.TextResource;
import com.whoop.domain.model.UnitSystem;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: h90.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001B¿\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\f\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\f\u0012\u0006\u0010\u001b\u001a\u00020\f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJö\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\u001cHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010+\u001a\u0004\b6\u0010-R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010+\u001a\u0004\b8\u0010-R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010+\u001a\u0004\b:\u0010-R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010+\u001a\u0004\b<\u0010-R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010%R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b?\u0010>\u001a\u0004\b=\u0010%R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b@\u0010>\u001a\u0004\b9\u0010%R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b:\u0010>\u001a\u0004\b7\u0010%R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b;\u0010#R\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u0010/\u001a\u0004\b@\u0010#R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u0010/\u001a\u0004\b1\u0010#R\u0017\u0010\u0014\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bA\u0010>\u001a\u0004\bB\u0010%R\u0017\u0010\u0015\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bC\u0010>\u001a\u0004\bD\u0010%R\u0017\u0010\u0016\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b0\u0010>\u001a\u0004\bE\u0010%R\u0017\u0010\u0017\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b,\u0010>\u001a\u0004\bF\u0010%R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bG\u0010/\u001a\u0004\bH\u0010#R\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bI\u0010/\u001a\u0004\bI\u0010#R\u0017\u0010\u001a\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bF\u0010>\u001a\u0004\bA\u0010%R\u0017\u0010\u001b\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bE\u0010>\u001a\u0004\bC\u0010%R\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bH\u0010J\u001a\u0004\bG\u0010K¨\u0006L"}, m65681d2 = {"Lh90/c;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "", "subtitle", "Lkd1/o;", "image", "imperialTitle", "metricTitle", "heightTitle", "weightTitle", "", "heightFeetMin", "heightFeetMax", "heightCentimetersMin", "heightCentimetersMax", "heightFeetLabel", "heightInchesLabel", "heightCentimetersLabel", "weightPoundsMin", "weightPoundsMax", "weightKilogramsMin", "weightKilogramsMax", "weightPoundsLabel", "weightKilogramsLabel", "preselectedCentimeters", "preselectedPounds", "Lcom/whoop/domain/model/UnitSystem;", "unitSystem", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;Ljava/lang/String;IILcom/whoop/domain/model/UnitSystem;)V", "a", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;Ljava/lang/String;IILcom/whoop/domain/model/UnitSystem;)Lh90/c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "r", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/lang/String;", "q", "c", "Lkd1/o;", "l", "()Lkd1/o;", "d", "m", "e", "n", "f", "k", "g", "z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "I", "i", "j", "o", "y", "p", "x", "v", "u", "s", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "t", "Lcom/whoop/domain/model/UnitSystem;", "()Lcom/whoop/domain/model/UnitSystem;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17025c implements InterfaceC25312u {

    /* JADX INFO: renamed from: x */
    public static final int f65453x;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource imperialTitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource metricTitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource heightTitle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource weightTitle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int heightFeetMin;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int heightFeetMax;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int heightCentimetersMin;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int heightCentimetersMax;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final String heightFeetLabel;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final String heightInchesLabel;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final String heightCentimetersLabel;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final int weightPoundsMin;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final int weightPoundsMax;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final int weightKilogramsMin;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final int weightKilogramsMax;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final String weightPoundsLabel;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final String weightKilogramsLabel;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final int preselectedCentimeters;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final int preselectedPounds;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final UnitSystem unitSystem;

    static {
        int i13 = TextResource.$stable;
        f65453x = i13 | AbstractC22403o.f87638a | i13;
    }

    public C17025c(TextResource title, String subtitle, AbstractC22403o image, TextResource imperialTitle, TextResource metricTitle, TextResource heightTitle, TextResource weightTitle, int i13, int i14, int i15, int i16, String heightFeetLabel, String heightInchesLabel, String heightCentimetersLabel, int i17, int i18, int i19, int i24, String weightPoundsLabel, String weightKilogramsLabel, int i25, int i26, UnitSystem unitSystem) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(imperialTitle, "imperialTitle");
        AbstractC22676k.m65750j(metricTitle, "metricTitle");
        AbstractC22676k.m65750j(heightTitle, "heightTitle");
        AbstractC22676k.m65750j(weightTitle, "weightTitle");
        AbstractC22676k.m65750j(heightFeetLabel, "heightFeetLabel");
        AbstractC22676k.m65750j(heightInchesLabel, "heightInchesLabel");
        AbstractC22676k.m65750j(heightCentimetersLabel, "heightCentimetersLabel");
        AbstractC22676k.m65750j(weightPoundsLabel, "weightPoundsLabel");
        AbstractC22676k.m65750j(weightKilogramsLabel, "weightKilogramsLabel");
        AbstractC22676k.m65750j(unitSystem, "unitSystem");
        this.title = title;
        this.subtitle = subtitle;
        this.image = image;
        this.imperialTitle = imperialTitle;
        this.metricTitle = metricTitle;
        this.heightTitle = heightTitle;
        this.weightTitle = weightTitle;
        this.heightFeetMin = i13;
        this.heightFeetMax = i14;
        this.heightCentimetersMin = i15;
        this.heightCentimetersMax = i16;
        this.heightFeetLabel = heightFeetLabel;
        this.heightInchesLabel = heightInchesLabel;
        this.heightCentimetersLabel = heightCentimetersLabel;
        this.weightPoundsMin = i17;
        this.weightPoundsMax = i18;
        this.weightKilogramsMin = i19;
        this.weightKilogramsMax = i24;
        this.weightPoundsLabel = weightPoundsLabel;
        this.weightKilogramsLabel = weightKilogramsLabel;
        this.preselectedCentimeters = i25;
        this.preselectedPounds = i26;
        this.unitSystem = unitSystem;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C17025c m48043b(C17025c c17025c, TextResource textResource, String str, AbstractC22403o abstractC22403o, TextResource textResource2, TextResource textResource3, TextResource textResource4, TextResource textResource5, int i13, int i14, int i15, int i16, String str2, String str3, String str4, int i17, int i18, int i19, int i24, String str5, String str6, int i25, int i26, UnitSystem unitSystem, int i27, Object obj) {
        UnitSystem unitSystem2;
        int i28;
        TextResource textResource6 = (i27 & 1) != 0 ? c17025c.title : textResource;
        String str7 = (i27 & 2) != 0 ? c17025c.subtitle : str;
        AbstractC22403o abstractC22403o2 = (i27 & 4) != 0 ? c17025c.image : abstractC22403o;
        TextResource textResource7 = (i27 & 8) != 0 ? c17025c.imperialTitle : textResource2;
        TextResource textResource8 = (i27 & 16) != 0 ? c17025c.metricTitle : textResource3;
        TextResource textResource9 = (i27 & 32) != 0 ? c17025c.heightTitle : textResource4;
        TextResource textResource10 = (i27 & 64) != 0 ? c17025c.weightTitle : textResource5;
        int i29 = (i27 & 128) != 0 ? c17025c.heightFeetMin : i13;
        int i34 = (i27 & 256) != 0 ? c17025c.heightFeetMax : i14;
        int i35 = (i27 & 512) != 0 ? c17025c.heightCentimetersMin : i15;
        int i36 = (i27 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c17025c.heightCentimetersMax : i16;
        String str8 = (i27 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c17025c.heightFeetLabel : str2;
        String str9 = (i27 & 4096) != 0 ? c17025c.heightInchesLabel : str3;
        String str10 = (i27 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c17025c.heightCentimetersLabel : str4;
        TextResource textResource11 = textResource6;
        int i37 = (i27 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c17025c.weightPoundsMin : i17;
        int i38 = (i27 & 32768) != 0 ? c17025c.weightPoundsMax : i18;
        int i39 = (i27 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? c17025c.weightKilogramsMin : i19;
        int i44 = (i27 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? c17025c.weightKilogramsMax : i24;
        String str11 = (i27 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? c17025c.weightPoundsLabel : str5;
        String str12 = (i27 & 524288) != 0 ? c17025c.weightKilogramsLabel : str6;
        int i45 = (i27 & 1048576) != 0 ? c17025c.preselectedCentimeters : i25;
        int i46 = (i27 & 2097152) != 0 ? c17025c.preselectedPounds : i26;
        if ((i27 & 4194304) != 0) {
            i28 = i46;
            unitSystem2 = c17025c.unitSystem;
        } else {
            unitSystem2 = unitSystem;
            i28 = i46;
        }
        return c17025c.m48044a(textResource11, str7, abstractC22403o2, textResource7, textResource8, textResource9, textResource10, i29, i34, i35, i36, str8, str9, str10, i37, i38, i39, i44, str11, str12, i45, i28, unitSystem2);
    }

    /* JADX INFO: renamed from: a */
    public final C17025c m48044a(TextResource title, String subtitle, AbstractC22403o image, TextResource imperialTitle, TextResource metricTitle, TextResource heightTitle, TextResource weightTitle, int heightFeetMin, int heightFeetMax, int heightCentimetersMin, int heightCentimetersMax, String heightFeetLabel, String heightInchesLabel, String heightCentimetersLabel, int weightPoundsMin, int weightPoundsMax, int weightKilogramsMin, int weightKilogramsMax, String weightPoundsLabel, String weightKilogramsLabel, int preselectedCentimeters, int preselectedPounds, UnitSystem unitSystem) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(imperialTitle, "imperialTitle");
        AbstractC22676k.m65750j(metricTitle, "metricTitle");
        AbstractC22676k.m65750j(heightTitle, "heightTitle");
        AbstractC22676k.m65750j(weightTitle, "weightTitle");
        AbstractC22676k.m65750j(heightFeetLabel, "heightFeetLabel");
        AbstractC22676k.m65750j(heightInchesLabel, "heightInchesLabel");
        AbstractC22676k.m65750j(heightCentimetersLabel, "heightCentimetersLabel");
        AbstractC22676k.m65750j(weightPoundsLabel, "weightPoundsLabel");
        AbstractC22676k.m65750j(weightKilogramsLabel, "weightKilogramsLabel");
        AbstractC22676k.m65750j(unitSystem, "unitSystem");
        return new C17025c(title, subtitle, image, imperialTitle, metricTitle, heightTitle, weightTitle, heightFeetMin, heightFeetMax, heightCentimetersMin, heightCentimetersMax, heightFeetLabel, heightInchesLabel, heightCentimetersLabel, weightPoundsMin, weightPoundsMax, weightKilogramsMin, weightKilogramsMax, weightPoundsLabel, weightKilogramsLabel, preselectedCentimeters, preselectedPounds, unitSystem);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getHeightCentimetersLabel() {
        return this.heightCentimetersLabel;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getHeightCentimetersMax() {
        return this.heightCentimetersMax;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17025c)) {
            return false;
        }
        C17025c c17025c = (C17025c) other;
        return AbstractC22676k.m65745e(this.title, c17025c.title) && AbstractC22676k.m65745e(this.subtitle, c17025c.subtitle) && AbstractC22676k.m65745e(this.image, c17025c.image) && AbstractC22676k.m65745e(this.imperialTitle, c17025c.imperialTitle) && AbstractC22676k.m65745e(this.metricTitle, c17025c.metricTitle) && AbstractC22676k.m65745e(this.heightTitle, c17025c.heightTitle) && AbstractC22676k.m65745e(this.weightTitle, c17025c.weightTitle) && this.heightFeetMin == c17025c.heightFeetMin && this.heightFeetMax == c17025c.heightFeetMax && this.heightCentimetersMin == c17025c.heightCentimetersMin && this.heightCentimetersMax == c17025c.heightCentimetersMax && AbstractC22676k.m65745e(this.heightFeetLabel, c17025c.heightFeetLabel) && AbstractC22676k.m65745e(this.heightInchesLabel, c17025c.heightInchesLabel) && AbstractC22676k.m65745e(this.heightCentimetersLabel, c17025c.heightCentimetersLabel) && this.weightPoundsMin == c17025c.weightPoundsMin && this.weightPoundsMax == c17025c.weightPoundsMax && this.weightKilogramsMin == c17025c.weightKilogramsMin && this.weightKilogramsMax == c17025c.weightKilogramsMax && AbstractC22676k.m65745e(this.weightPoundsLabel, c17025c.weightPoundsLabel) && AbstractC22676k.m65745e(this.weightKilogramsLabel, c17025c.weightKilogramsLabel) && this.preselectedCentimeters == c17025c.preselectedCentimeters && this.preselectedPounds == c17025c.preselectedPounds && this.unitSystem == c17025c.unitSystem;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getHeightCentimetersMin() {
        return this.heightCentimetersMin;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getHeightFeetLabel() {
        return this.heightFeetLabel;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getHeightFeetMax() {
        return this.heightFeetMax;
    }

    public int hashCode() {
        return this.unitSystem.hashCode() + AbstractC11266d.m30448b(this.preselectedPounds, AbstractC11266d.m30448b(this.preselectedCentimeters, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.weightKilogramsMax, AbstractC11266d.m30448b(this.weightKilogramsMin, AbstractC11266d.m30448b(this.weightPoundsMax, AbstractC11266d.m30448b(this.weightPoundsMin, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.heightCentimetersMax, AbstractC11266d.m30448b(this.heightCentimetersMin, AbstractC11266d.m30448b(this.heightFeetMax, AbstractC11266d.m30448b(this.heightFeetMin, AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC30007c.m91833c(this.image, AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.subtitle), 31), this.imperialTitle, 31), this.metricTitle, 31), this.heightTitle, 31), this.weightTitle, 31), 31), 31), 31), 31), 31, this.heightFeetLabel), 31, this.heightInchesLabel), 31, this.heightCentimetersLabel), 31), 31), 31), 31), 31, this.weightPoundsLabel), 31, this.weightKilogramsLabel), 31), 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getHeightFeetMin() {
        return this.heightFeetMin;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getHeightInchesLabel() {
        return this.heightInchesLabel;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final TextResource getHeightTitle() {
        return this.heightTitle;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final TextResource getImperialTitle() {
        return this.imperialTitle;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final TextResource getMetricTitle() {
        return this.metricTitle;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getPreselectedCentimeters() {
        return this.preselectedCentimeters;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final int getPreselectedPounds() {
        return this.preselectedPounds;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final UnitSystem getUnitSystem() {
        return this.unitSystem;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getWeightKilogramsLabel() {
        return this.weightKilogramsLabel;
    }

    public String toString() {
        TextResource textResource = this.title;
        String str = this.subtitle;
        AbstractC22403o abstractC22403o = this.image;
        TextResource textResource2 = this.imperialTitle;
        TextResource textResource3 = this.metricTitle;
        TextResource textResource4 = this.heightTitle;
        TextResource textResource5 = this.weightTitle;
        int i13 = this.heightFeetMin;
        int i14 = this.heightFeetMax;
        int i15 = this.heightCentimetersMin;
        int i16 = this.heightCentimetersMax;
        String str2 = this.heightFeetLabel;
        String str3 = this.heightInchesLabel;
        String str4 = this.heightCentimetersLabel;
        int i17 = this.weightPoundsMin;
        int i18 = this.weightPoundsMax;
        int i19 = this.weightKilogramsMin;
        int i24 = this.weightKilogramsMax;
        String str5 = this.weightPoundsLabel;
        String str6 = this.weightKilogramsLabel;
        int i25 = this.preselectedCentimeters;
        int i26 = this.preselectedPounds;
        UnitSystem unitSystem = this.unitSystem;
        StringBuilder sbM91845o = AbstractC30007c.m91845o("HeightAndWeightScreenViewState(title=", textResource, ", subtitle=", str, ", image=");
        AbstractC13673n.m38549A(sbM91845o, abstractC22403o, ", imperialTitle=", textResource2, ", metricTitle=");
        AbstractC30007c.m91855y(sbM91845o, textResource3, ", heightTitle=", textResource4, ", weightTitle=");
        sbM91845o.append(textResource5);
        sbM91845o.append(", heightFeetMin=");
        sbM91845o.append(i13);
        sbM91845o.append(", heightFeetMax=");
        AbstractC30802r.m94773v(sbM91845o, i14, ", heightCentimetersMin=", i15, ", heightCentimetersMax=");
        AbstractC11895b.m31979B(i16, ", heightFeetLabel=", str2, ", heightInchesLabel=", sbM91845o);
        AbstractC11266d.m30444B(sbM91845o, str3, ", heightCentimetersLabel=", str4, ", weightPoundsMin=");
        AbstractC30802r.m94773v(sbM91845o, i17, ", weightPoundsMax=", i18, ", weightKilogramsMin=");
        AbstractC30802r.m94773v(sbM91845o, i19, ", weightKilogramsMax=", i24, ", weightPoundsLabel=");
        AbstractC11266d.m30444B(sbM91845o, str5, ", weightKilogramsLabel=", str6, ", preselectedCentimeters=");
        AbstractC30802r.m94773v(sbM91845o, i25, ", preselectedPounds=", i26, ", unitSystem=");
        sbM91845o.append(unitSystem);
        sbM91845o.append(")");
        return sbM91845o.toString();
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final int getWeightKilogramsMax() {
        return this.weightKilogramsMax;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final int getWeightKilogramsMin() {
        return this.weightKilogramsMin;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getWeightPoundsLabel() {
        return this.weightPoundsLabel;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final int getWeightPoundsMax() {
        return this.weightPoundsMax;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final int getWeightPoundsMin() {
        return this.weightPoundsMin;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final TextResource getWeightTitle() {
        return this.weightTitle;
    }
}
