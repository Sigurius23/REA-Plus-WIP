package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.celebration.CelebrationMediaModel;
import com.whoop.design.models.celebration.CelebrationMediaModel$$serializer;
import com.whoop.design.models.colortheme.ColorThemeModel;
import com.whoop.design.models.colortheme.ColorThemeModel$$serializer;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w70.C36870a;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 N2\u00020\u0001:\u0002ONBo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u0087\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJ\u0012\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0088\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u001bJ\u0010\u0010.\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u00020\r2\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103J'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001¢\u0006\u0004\b:\u0010;R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010=\u001a\u0004\b?\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b@\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010=\u001a\u0004\bA\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010B\u001a\u0004\bC\u0010 R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010=\u001a\u0004\bD\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\bE\u0010\u001bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010F\u001a\u0004\bG\u0010$R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010H\u001a\u0004\bI\u0010&R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010J\u001a\u0004\bK\u0010(R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010L\u001a\u0004\bM\u0010*¨\u0006P"}, m65681d2 = {"Lcom/whoop/design/models/items/AchievementProgressCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "numerator", "denominator", "description", "style", "Lcom/whoop/design/models/colortheme/ColorThemeModel;", "colors", "backgroundStyle", "iconUrl", "", "progressPercent", "", "showArrowIcon", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/design/models/celebration/CelebrationMediaModel;", "media", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;ZLcom/whoop/navigation/e;Lcom/whoop/design/models/celebration/CelebrationMediaModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;ZLcom/whoop/navigation/e;Lcom/whoop/design/models/celebration/CelebrationMediaModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/whoop/design/models/colortheme/ColorThemeModel;", "component6", "component7", "component8", "()Ljava/lang/Double;", "component9", "()Z", "component10", "()Lcom/whoop/navigation/e;", "component11", "()Lcom/whoop/design/models/celebration/CelebrationMediaModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;ZLcom/whoop/navigation/e;Lcom/whoop/design/models/celebration/CelebrationMediaModel;)Lcom/whoop/design/models/items/AchievementProgressCardModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/AchievementProgressCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getNumerator", "getDenominator", "getDescription", "getStyle", "Lcom/whoop/design/models/colortheme/ColorThemeModel;", "getColors", "getBackgroundStyle", "getIconUrl", "Ljava/lang/Double;", "getProgressPercent", "Z", "getShowArrowIcon", "Lcom/whoop/navigation/e;", "getDestination", "Lcom/whoop/design/models/celebration/CelebrationMediaModel;", "getMedia", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AchievementProgressCardModel implements DesignSystemModel {
    private final String backgroundStyle;
    private final ColorThemeModel colors;
    private final String denominator;
    private final String description;
    private final C9598e destination;
    private final String iconUrl;
    private final CelebrationMediaModel media;
    private final String numerator;
    private final Double progressPercent;
    private final boolean showArrowIcon;
    private final String style;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36870a(5)), null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/AchievementProgressCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/AchievementProgressCardModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AchievementProgressCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AchievementProgressCardModel(int i13, String str, String str2, String str3, String str4, ColorThemeModel colorThemeModel, String str5, String str6, Double d3, boolean z4, C9598e c9598e, CelebrationMediaModel celebrationMediaModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (495 != (i13 & 495)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 495, AchievementProgressCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.numerator = str;
        this.denominator = str2;
        this.description = str3;
        this.style = str4;
        if ((i13 & 16) == 0) {
            this.colors = null;
        } else {
            this.colors = colorThemeModel;
        }
        this.backgroundStyle = str5;
        this.iconUrl = str6;
        this.progressPercent = d3;
        this.showArrowIcon = z4;
        if ((i13 & 512) == 0) {
            this.destination = null;
        } else {
            this.destination = c9598e;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.media = null;
        } else {
            this.media = celebrationMediaModel;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ AchievementProgressCardModel copy$default(AchievementProgressCardModel achievementProgressCardModel, String str, String str2, String str3, String str4, ColorThemeModel colorThemeModel, String str5, String str6, Double d3, boolean z4, C9598e c9598e, CelebrationMediaModel celebrationMediaModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = achievementProgressCardModel.numerator;
        }
        if ((i13 & 2) != 0) {
            str2 = achievementProgressCardModel.denominator;
        }
        if ((i13 & 4) != 0) {
            str3 = achievementProgressCardModel.description;
        }
        if ((i13 & 8) != 0) {
            str4 = achievementProgressCardModel.style;
        }
        if ((i13 & 16) != 0) {
            colorThemeModel = achievementProgressCardModel.colors;
        }
        if ((i13 & 32) != 0) {
            str5 = achievementProgressCardModel.backgroundStyle;
        }
        if ((i13 & 64) != 0) {
            str6 = achievementProgressCardModel.iconUrl;
        }
        if ((i13 & 128) != 0) {
            d3 = achievementProgressCardModel.progressPercent;
        }
        if ((i13 & 256) != 0) {
            z4 = achievementProgressCardModel.showArrowIcon;
        }
        if ((i13 & 512) != 0) {
            c9598e = achievementProgressCardModel.destination;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            celebrationMediaModel = achievementProgressCardModel.media;
        }
        C9598e c9598e2 = c9598e;
        CelebrationMediaModel celebrationMediaModel2 = celebrationMediaModel;
        Double d14 = d3;
        boolean z13 = z4;
        String str7 = str5;
        String str8 = str6;
        ColorThemeModel colorThemeModel2 = colorThemeModel;
        String str9 = str3;
        return achievementProgressCardModel.copy(str, str2, str9, str4, colorThemeModel2, str7, str8, d14, z13, c9598e2, celebrationMediaModel2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(AchievementProgressCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.numerator);
        output.encodeStringElement(serialDesc, 1, self.denominator);
        output.encodeStringElement(serialDesc, 2, self.description);
        output.encodeStringElement(serialDesc, 3, self.style);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.colors != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, ColorThemeModel$$serializer.INSTANCE, self.colors);
        }
        output.encodeStringElement(serialDesc, 5, self.backgroundStyle);
        output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.iconUrl);
        output.encodeNullableSerializableElement(serialDesc, 7, DoubleSerializer.INSTANCE, self.progressPercent);
        output.encodeBooleanElement(serialDesc, 8, self.showArrowIcon);
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.destination != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.destination);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 10) && self.media == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 10, CelebrationMediaModel$$serializer.INSTANCE, self.media);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNumerator() {
        return this.numerator;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final CelebrationMediaModel getMedia() {
        return this.media;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDenominator() {
        return this.denominator;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ColorThemeModel getColors() {
        return this.colors;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBackgroundStyle() {
        return this.backgroundStyle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Double getProgressPercent() {
        return this.progressPercent;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getShowArrowIcon() {
        return this.showArrowIcon;
    }

    public final AchievementProgressCardModel copy(String numerator, String denominator, String description, String style, ColorThemeModel colors, String backgroundStyle, String iconUrl, Double progressPercent, boolean showArrowIcon, C9598e destination, CelebrationMediaModel media) {
        AbstractC22676k.m65750j(numerator, "numerator");
        AbstractC22676k.m65750j(denominator, "denominator");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(backgroundStyle, "backgroundStyle");
        return new AchievementProgressCardModel(numerator, denominator, description, style, colors, backgroundStyle, iconUrl, progressPercent, showArrowIcon, destination, media);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AchievementProgressCardModel)) {
            return false;
        }
        AchievementProgressCardModel achievementProgressCardModel = (AchievementProgressCardModel) other;
        return AbstractC22676k.m65745e(this.numerator, achievementProgressCardModel.numerator) && AbstractC22676k.m65745e(this.denominator, achievementProgressCardModel.denominator) && AbstractC22676k.m65745e(this.description, achievementProgressCardModel.description) && AbstractC22676k.m65745e(this.style, achievementProgressCardModel.style) && AbstractC22676k.m65745e(this.colors, achievementProgressCardModel.colors) && AbstractC22676k.m65745e(this.backgroundStyle, achievementProgressCardModel.backgroundStyle) && AbstractC22676k.m65745e(this.iconUrl, achievementProgressCardModel.iconUrl) && AbstractC22676k.m65745e(this.progressPercent, achievementProgressCardModel.progressPercent) && this.showArrowIcon == achievementProgressCardModel.showArrowIcon && AbstractC22676k.m65745e(this.destination, achievementProgressCardModel.destination) && AbstractC22676k.m65745e(this.media, achievementProgressCardModel.media);
    }

    public final String getBackgroundStyle() {
        return this.backgroundStyle;
    }

    public final ColorThemeModel getColors() {
        return this.colors;
    }

    public final String getDenominator() {
        return this.denominator;
    }

    public final String getDescription() {
        return this.description;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final CelebrationMediaModel getMedia() {
        return this.media;
    }

    public final String getNumerator() {
        return this.numerator;
    }

    public final Double getProgressPercent() {
        return this.progressPercent;
    }

    public final boolean getShowArrowIcon() {
        return this.showArrowIcon;
    }

    public final String getStyle() {
        return this.style;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.numerator.hashCode() * 31, 31, this.denominator), 31, this.description), 31, this.style);
        ColorThemeModel colorThemeModel = this.colors;
        int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (colorThemeModel == null ? 0 : colorThemeModel.hashCode())) * 31, 31, this.backgroundStyle);
        String str = this.iconUrl;
        int iHashCode = (iM30450d2 + (str == null ? 0 : str.hashCode())) * 31;
        Double d3 = this.progressPercent;
        int iM8289b = AbstractC2875y.m8289b((iHashCode + (d3 == null ? 0 : d3.hashCode())) * 31, 31, this.showArrowIcon);
        C9598e c9598e = this.destination;
        int iHashCode2 = (iM8289b + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        CelebrationMediaModel celebrationMediaModel = this.media;
        return iHashCode2 + (celebrationMediaModel != null ? celebrationMediaModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.numerator;
        String str2 = this.denominator;
        String str3 = this.description;
        String str4 = this.style;
        ColorThemeModel colorThemeModel = this.colors;
        String str5 = this.backgroundStyle;
        String str6 = this.iconUrl;
        Double d3 = this.progressPercent;
        boolean z4 = this.showArrowIcon;
        C9598e c9598e = this.destination;
        CelebrationMediaModel celebrationMediaModel = this.media;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AchievementProgressCardModel(numerator=", str, ", denominator=", str2, ", description=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", style=", str4, ", colors=");
        sbM32001t.append(colorThemeModel);
        sbM32001t.append(", backgroundStyle=");
        sbM32001t.append(str5);
        sbM32001t.append(", iconUrl=");
        sbM32001t.append(str6);
        sbM32001t.append(", progressPercent=");
        sbM32001t.append(d3);
        sbM32001t.append(", showArrowIcon=");
        sbM32001t.append(z4);
        sbM32001t.append(", destination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(", media=");
        sbM32001t.append(celebrationMediaModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public AchievementProgressCardModel(String numerator, String denominator, String description, String style, ColorThemeModel colorThemeModel, String backgroundStyle, String str, Double d3, boolean z4, C9598e c9598e, CelebrationMediaModel celebrationMediaModel) {
        AbstractC22676k.m65750j(numerator, "numerator");
        AbstractC22676k.m65750j(denominator, "denominator");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(backgroundStyle, "backgroundStyle");
        this.numerator = numerator;
        this.denominator = denominator;
        this.description = description;
        this.style = style;
        this.colors = colorThemeModel;
        this.backgroundStyle = backgroundStyle;
        this.iconUrl = str;
        this.progressPercent = d3;
        this.showArrowIcon = z4;
        this.destination = c9598e;
        this.media = celebrationMediaModel;
    }

    public /* synthetic */ AchievementProgressCardModel(String str, String str2, String str3, String str4, ColorThemeModel colorThemeModel, String str5, String str6, Double d3, boolean z4, C9598e c9598e, CelebrationMediaModel celebrationMediaModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i13 & 16) != 0 ? null : colorThemeModel, str5, str6, d3, z4, (i13 & 512) != 0 ? null : c9598e, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : celebrationMediaModel);
    }
}
