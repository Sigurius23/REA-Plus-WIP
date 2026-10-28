package com.whoop.weightlifting.data.dto;

import com.google.gson.annotations.SerializedName;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kt2.C22831a;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ>\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001bR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010.\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010\u001dR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00101\u0012\u0004\b3\u0010-\u001a\u0004\b2\u0010\u001fR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010*\u0012\u0004\b5\u0010-\u001a\u0004\b4\u0010\u001b¨\u00068"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;", "", "", "backgroundImageUrl", "", "Lcom/whoop/weightlifting/data/dto/TitleMetricTilesItem;", "titleMetricTiles", "Lcom/whoop/design/util/TextResource;", "workoutSubtitleDisplay", "workoutTitleDisplay", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/design/util/TextResource;", "component4", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundImageUrl", "getBackgroundImageUrl$annotations", "()V", "Ljava/util/List;", "getTitleMetricTiles", "getTitleMetricTiles$annotations", "Lcom/whoop/design/util/TextResource;", "getWorkoutSubtitleDisplay", "getWorkoutSubtitleDisplay$annotations", "getWorkoutTitleDisplay", "getWorkoutTitleDisplay$annotations", "Companion", "$serializer", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PrebuiltTemplateDetailsHeader {

    @SerializedName("background_image_url")
    private final String backgroundImageUrl;

    @SerializedName("title_metric_tiles")
    private final List<TitleMetricTilesItem> titleMetricTiles;

    @SerializedName("workout_subtitle_display")
    private final TextResource workoutSubtitleDisplay;

    @SerializedName("workout_title_display")
    private final String workoutTitleDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C22831a(29)), null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PrebuiltTemplateDetailsHeader$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PrebuiltTemplateDetailsHeader(int i13, String str, List list, TextResource textResource, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, PrebuiltTemplateDetailsHeader$$serializer.INSTANCE.getDescriptor());
        }
        this.backgroundImageUrl = str;
        this.titleMetricTiles = list;
        this.workoutSubtitleDisplay = textResource;
        this.workoutTitleDisplay = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(TitleMetricTilesItem$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PrebuiltTemplateDetailsHeader copy$default(PrebuiltTemplateDetailsHeader prebuiltTemplateDetailsHeader, String str, List list, TextResource textResource, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = prebuiltTemplateDetailsHeader.backgroundImageUrl;
        }
        if ((i13 & 2) != 0) {
            list = prebuiltTemplateDetailsHeader.titleMetricTiles;
        }
        if ((i13 & 4) != 0) {
            textResource = prebuiltTemplateDetailsHeader.workoutSubtitleDisplay;
        }
        if ((i13 & 8) != 0) {
            str2 = prebuiltTemplateDetailsHeader.workoutTitleDisplay;
        }
        return prebuiltTemplateDetailsHeader.copy(str, list, textResource, str2);
    }

    @InterfaceC37143h("background_image_url")
    public static /* synthetic */ void getBackgroundImageUrl$annotations() {
    }

    @InterfaceC37143h("title_metric_tiles")
    public static /* synthetic */ void getTitleMetricTiles$annotations() {
    }

    @InterfaceC37143h("workout_subtitle_display")
    public static /* synthetic */ void getWorkoutSubtitleDisplay$annotations() {
    }

    @InterfaceC37143h("workout_title_display")
    public static /* synthetic */ void getWorkoutTitleDisplay$annotations() {
    }

    public static final /* synthetic */ void write$Self$weightlifting_release(PrebuiltTemplateDetailsHeader self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.backgroundImageUrl);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.titleMetricTiles);
        output.encodeSerializableElement(serialDesc, 2, C25452a.f99689a, self.workoutSubtitleDisplay);
        output.encodeStringElement(serialDesc, 3, self.workoutTitleDisplay);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public final List<TitleMetricTilesItem> component2() {
        return this.titleMetricTiles;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getWorkoutSubtitleDisplay() {
        return this.workoutSubtitleDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getWorkoutTitleDisplay() {
        return this.workoutTitleDisplay;
    }

    public final PrebuiltTemplateDetailsHeader copy(String backgroundImageUrl, List<TitleMetricTilesItem> titleMetricTiles, TextResource workoutSubtitleDisplay, String workoutTitleDisplay) {
        AbstractC22676k.m65750j(backgroundImageUrl, "backgroundImageUrl");
        AbstractC22676k.m65750j(titleMetricTiles, "titleMetricTiles");
        AbstractC22676k.m65750j(workoutSubtitleDisplay, "workoutSubtitleDisplay");
        AbstractC22676k.m65750j(workoutTitleDisplay, "workoutTitleDisplay");
        return new PrebuiltTemplateDetailsHeader(backgroundImageUrl, titleMetricTiles, workoutSubtitleDisplay, workoutTitleDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrebuiltTemplateDetailsHeader)) {
            return false;
        }
        PrebuiltTemplateDetailsHeader prebuiltTemplateDetailsHeader = (PrebuiltTemplateDetailsHeader) other;
        return AbstractC22676k.m65745e(this.backgroundImageUrl, prebuiltTemplateDetailsHeader.backgroundImageUrl) && AbstractC22676k.m65745e(this.titleMetricTiles, prebuiltTemplateDetailsHeader.titleMetricTiles) && AbstractC22676k.m65745e(this.workoutSubtitleDisplay, prebuiltTemplateDetailsHeader.workoutSubtitleDisplay) && AbstractC22676k.m65745e(this.workoutTitleDisplay, prebuiltTemplateDetailsHeader.workoutTitleDisplay);
    }

    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public final List<TitleMetricTilesItem> getTitleMetricTiles() {
        return this.titleMetricTiles;
    }

    public final TextResource getWorkoutSubtitleDisplay() {
        return this.workoutSubtitleDisplay;
    }

    public final String getWorkoutTitleDisplay() {
        return this.workoutTitleDisplay;
    }

    public int hashCode() {
        return this.workoutTitleDisplay.hashCode() + AbstractC31061c.m95625a(AbstractC11895b.m31983b(this.backgroundImageUrl.hashCode() * 31, 31, this.titleMetricTiles), this.workoutSubtitleDisplay, 31);
    }

    public String toString() {
        String str = this.backgroundImageUrl;
        List<TitleMetricTilesItem> list = this.titleMetricTiles;
        TextResource textResource = this.workoutSubtitleDisplay;
        String str2 = this.workoutTitleDisplay;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("PrebuiltTemplateDetailsHeader(backgroundImageUrl=", str, ", titleMetricTiles=", ", workoutSubtitleDisplay=", list);
        sbM94766o.append(textResource);
        sbM94766o.append(", workoutTitleDisplay=");
        sbM94766o.append(str2);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    public PrebuiltTemplateDetailsHeader(String backgroundImageUrl, List<TitleMetricTilesItem> titleMetricTiles, TextResource workoutSubtitleDisplay, String workoutTitleDisplay) {
        AbstractC22676k.m65750j(backgroundImageUrl, "backgroundImageUrl");
        AbstractC22676k.m65750j(titleMetricTiles, "titleMetricTiles");
        AbstractC22676k.m65750j(workoutSubtitleDisplay, "workoutSubtitleDisplay");
        AbstractC22676k.m65750j(workoutTitleDisplay, "workoutTitleDisplay");
        this.backgroundImageUrl = backgroundImageUrl;
        this.titleMetricTiles = titleMetricTiles;
        this.workoutSubtitleDisplay = workoutSubtitleDisplay;
        this.workoutTitleDisplay = workoutTitleDisplay;
    }
}
