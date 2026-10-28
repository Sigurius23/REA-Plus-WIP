package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36958e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0002IHBu\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012B\u007f\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b&\u0010%J~\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0019J\u0010\u0010*\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\u000e2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/J'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b;\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b<\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b=\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b>\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010?\u001a\u0004\b@\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010A\u001a\u0004\bB\u0010!R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010C\u001a\u0004\bD\u0010#R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010E\u001a\u0004\bF\u0010%R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010E\u001a\u0004\bG\u0010%¨\u0006J"}, m65681d2 = {"Lcom/whoop/design/models/items/HeartRateZone;", "Lcom/whoop/design/models/DesignSystemModel;", "", "barGraphTileTitleDisplay", "barGraphTileSubtitleDisplay", "barGraphTilePercentageDisplay", "barGraphTileTimeDisplay", "barGraphTileTimeSuffixDisplay", "Lcom/whoop/design/models/items/BarGraph;", "barGraph", "Lcom/whoop/design/models/items/HeartRateTileStyle;", "tileStyle", "Lcom/whoop/design/models/items/HeartRateTileId;", "id", "", "hideBackground", "showRadioToggle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/BarGraph;Lcom/whoop/design/models/items/HeartRateTileStyle;Lcom/whoop/design/models/items/HeartRateTileId;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/BarGraph;Lcom/whoop/design/models/items/HeartRateTileStyle;Lcom/whoop/design/models/items/HeartRateTileId;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/whoop/design/models/items/BarGraph;", "component7", "()Lcom/whoop/design/models/items/HeartRateTileStyle;", "component8", "()Lcom/whoop/design/models/items/HeartRateTileId;", "component9", "()Ljava/lang/Boolean;", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/BarGraph;Lcom/whoop/design/models/items/HeartRateTileStyle;Lcom/whoop/design/models/items/HeartRateTileId;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/design/models/items/HeartRateZone;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/HeartRateZone;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getBarGraphTileTitleDisplay", "getBarGraphTileSubtitleDisplay", "getBarGraphTilePercentageDisplay", "getBarGraphTileTimeDisplay", "getBarGraphTileTimeSuffixDisplay", "Lcom/whoop/design/models/items/BarGraph;", "getBarGraph", "Lcom/whoop/design/models/items/HeartRateTileStyle;", "getTileStyle", "Lcom/whoop/design/models/items/HeartRateTileId;", "getId", "Ljava/lang/Boolean;", "getHideBackground", "getShowRadioToggle", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HeartRateZone implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final BarGraph barGraph;
    private final String barGraphTilePercentageDisplay;
    private final String barGraphTileSubtitleDisplay;
    private final String barGraphTileTimeDisplay;
    private final String barGraphTileTimeSuffixDisplay;
    private final String barGraphTileTitleDisplay;
    private final Boolean hideBackground;
    private final HeartRateTileId id;
    private final Boolean showRadioToggle;
    private final HeartRateTileStyle tileStyle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/HeartRateZone$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/HeartRateZone;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HeartRateZone$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36958e(18)), AbstractC30060g.m92087G(enumC23463i, new C36958e(19)), null, null};
    }

    public HeartRateZone() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (BarGraph) null, (HeartRateTileStyle) null, (HeartRateTileId) null, (Boolean) null, (Boolean) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.HeartRateTileStyle", HeartRateTileStyle.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.HeartRateTileId", HeartRateTileId.values());
    }

    public static /* synthetic */ HeartRateZone copy$default(HeartRateZone heartRateZone, String str, String str2, String str3, String str4, String str5, BarGraph barGraph, HeartRateTileStyle heartRateTileStyle, HeartRateTileId heartRateTileId, Boolean bool, Boolean bool2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = heartRateZone.barGraphTileTitleDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = heartRateZone.barGraphTileSubtitleDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = heartRateZone.barGraphTilePercentageDisplay;
        }
        if ((i13 & 8) != 0) {
            str4 = heartRateZone.barGraphTileTimeDisplay;
        }
        if ((i13 & 16) != 0) {
            str5 = heartRateZone.barGraphTileTimeSuffixDisplay;
        }
        if ((i13 & 32) != 0) {
            barGraph = heartRateZone.barGraph;
        }
        if ((i13 & 64) != 0) {
            heartRateTileStyle = heartRateZone.tileStyle;
        }
        if ((i13 & 128) != 0) {
            heartRateTileId = heartRateZone.id;
        }
        if ((i13 & 256) != 0) {
            bool = heartRateZone.hideBackground;
        }
        if ((i13 & 512) != 0) {
            bool2 = heartRateZone.showRadioToggle;
        }
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        HeartRateTileStyle heartRateTileStyle2 = heartRateTileStyle;
        HeartRateTileId heartRateTileId2 = heartRateTileId;
        String str6 = str5;
        BarGraph barGraph2 = barGraph;
        return heartRateZone.copy(str, str2, str3, str4, str6, barGraph2, heartRateTileStyle2, heartRateTileId2, bool3, bool4);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0083  */
    public static final /* synthetic */ void write$Self$design_models_release(HeartRateZone self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.barGraphTileTitleDisplay, "")) {
            output.encodeStringElement(serialDesc, 0, self.barGraphTileTitleDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.barGraphTileSubtitleDisplay != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.barGraphTileSubtitleDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.barGraphTilePercentageDisplay, "")) {
            output.encodeStringElement(serialDesc, 2, self.barGraphTilePercentageDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.barGraphTileTimeDisplay, "")) {
            output.encodeStringElement(serialDesc, 3, self.barGraphTileTimeDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.barGraphTileTimeSuffixDisplay != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.barGraphTileTimeSuffixDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5)) {
            output.encodeNullableSerializableElement(serialDesc, 5, BarGraph$$serializer.INSTANCE, self.barGraph);
        } else {
            if (!AbstractC22676k.m65745e(self.barGraph, new BarGraph(0.0f, (List) null, (RangeModal) null, 7, (DefaultConstructorMarker) null))) {
                output.encodeNullableSerializableElement(serialDesc, 5, BarGraph$$serializer.INSTANCE, self.barGraph);
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.tileStyle != HeartRateTileStyle.NONE) {
            output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.tileStyle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.id != HeartRateTileId.NONE) {
            output.encodeSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.hideBackground != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, BooleanSerializer.INSTANCE, self.hideBackground);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 9) && self.showRadioToggle == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 9, BooleanSerializer.INSTANCE, self.showRadioToggle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBarGraphTileTitleDisplay() {
        return this.barGraphTileTitleDisplay;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getShowRadioToggle() {
        return this.showRadioToggle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBarGraphTileSubtitleDisplay() {
        return this.barGraphTileSubtitleDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBarGraphTilePercentageDisplay() {
        return this.barGraphTilePercentageDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBarGraphTileTimeDisplay() {
        return this.barGraphTileTimeDisplay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBarGraphTileTimeSuffixDisplay() {
        return this.barGraphTileTimeSuffixDisplay;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BarGraph getBarGraph() {
        return this.barGraph;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final HeartRateTileStyle getTileStyle() {
        return this.tileStyle;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final HeartRateTileId getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getHideBackground() {
        return this.hideBackground;
    }

    public final HeartRateZone copy(String barGraphTileTitleDisplay, String barGraphTileSubtitleDisplay, String barGraphTilePercentageDisplay, String barGraphTileTimeDisplay, String barGraphTileTimeSuffixDisplay, BarGraph barGraph, HeartRateTileStyle tileStyle, HeartRateTileId id4, Boolean hideBackground, Boolean showRadioToggle) {
        AbstractC22676k.m65750j(barGraphTileTitleDisplay, "barGraphTileTitleDisplay");
        AbstractC22676k.m65750j(barGraphTilePercentageDisplay, "barGraphTilePercentageDisplay");
        AbstractC22676k.m65750j(barGraphTileTimeDisplay, "barGraphTileTimeDisplay");
        AbstractC22676k.m65750j(tileStyle, "tileStyle");
        AbstractC22676k.m65750j(id4, "id");
        return new HeartRateZone(barGraphTileTitleDisplay, barGraphTileSubtitleDisplay, barGraphTilePercentageDisplay, barGraphTileTimeDisplay, barGraphTileTimeSuffixDisplay, barGraph, tileStyle, id4, hideBackground, showRadioToggle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeartRateZone)) {
            return false;
        }
        HeartRateZone heartRateZone = (HeartRateZone) other;
        return AbstractC22676k.m65745e(this.barGraphTileTitleDisplay, heartRateZone.barGraphTileTitleDisplay) && AbstractC22676k.m65745e(this.barGraphTileSubtitleDisplay, heartRateZone.barGraphTileSubtitleDisplay) && AbstractC22676k.m65745e(this.barGraphTilePercentageDisplay, heartRateZone.barGraphTilePercentageDisplay) && AbstractC22676k.m65745e(this.barGraphTileTimeDisplay, heartRateZone.barGraphTileTimeDisplay) && AbstractC22676k.m65745e(this.barGraphTileTimeSuffixDisplay, heartRateZone.barGraphTileTimeSuffixDisplay) && AbstractC22676k.m65745e(this.barGraph, heartRateZone.barGraph) && this.tileStyle == heartRateZone.tileStyle && this.id == heartRateZone.id && AbstractC22676k.m65745e(this.hideBackground, heartRateZone.hideBackground) && AbstractC22676k.m65745e(this.showRadioToggle, heartRateZone.showRadioToggle);
    }

    public final BarGraph getBarGraph() {
        return this.barGraph;
    }

    public final String getBarGraphTilePercentageDisplay() {
        return this.barGraphTilePercentageDisplay;
    }

    public final String getBarGraphTileSubtitleDisplay() {
        return this.barGraphTileSubtitleDisplay;
    }

    public final String getBarGraphTileTimeDisplay() {
        return this.barGraphTileTimeDisplay;
    }

    public final String getBarGraphTileTimeSuffixDisplay() {
        return this.barGraphTileTimeSuffixDisplay;
    }

    public final String getBarGraphTileTitleDisplay() {
        return this.barGraphTileTitleDisplay;
    }

    public final Boolean getHideBackground() {
        return this.hideBackground;
    }

    public final HeartRateTileId getId() {
        return this.id;
    }

    public final Boolean getShowRadioToggle() {
        return this.showRadioToggle;
    }

    public final HeartRateTileStyle getTileStyle() {
        return this.tileStyle;
    }

    public int hashCode() {
        int iHashCode = this.barGraphTileTitleDisplay.hashCode() * 31;
        String str = this.barGraphTileSubtitleDisplay;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.barGraphTilePercentageDisplay), 31, this.barGraphTileTimeDisplay);
        String str2 = this.barGraphTileTimeSuffixDisplay;
        int iHashCode2 = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        BarGraph barGraph = this.barGraph;
        int iHashCode3 = (this.id.hashCode() + ((this.tileStyle.hashCode() + ((iHashCode2 + (barGraph == null ? 0 : barGraph.hashCode())) * 31)) * 31)) * 31;
        Boolean bool = this.hideBackground;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showRadioToggle;
        return iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        String str = this.barGraphTileTitleDisplay;
        String str2 = this.barGraphTileSubtitleDisplay;
        String str3 = this.barGraphTilePercentageDisplay;
        String str4 = this.barGraphTileTimeDisplay;
        String str5 = this.barGraphTileTimeSuffixDisplay;
        BarGraph barGraph = this.barGraph;
        HeartRateTileStyle heartRateTileStyle = this.tileStyle;
        HeartRateTileId heartRateTileId = this.id;
        Boolean bool = this.hideBackground;
        Boolean bool2 = this.showRadioToggle;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HeartRateZone(barGraphTileTitleDisplay=", str, ", barGraphTileSubtitleDisplay=", str2, ", barGraphTilePercentageDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", barGraphTileTimeDisplay=", str4, ", barGraphTileTimeSuffixDisplay=");
        sbM32001t.append(str5);
        sbM32001t.append(", barGraph=");
        sbM32001t.append(barGraph);
        sbM32001t.append(", tileStyle=");
        sbM32001t.append(heartRateTileStyle);
        sbM32001t.append(", id=");
        sbM32001t.append(heartRateTileId);
        sbM32001t.append(", hideBackground=");
        sbM32001t.append(bool);
        sbM32001t.append(", showRadioToggle=");
        sbM32001t.append(bool2);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ HeartRateZone(int i13, String str, String str2, String str3, String str4, String str5, BarGraph barGraph, HeartRateTileStyle heartRateTileStyle, HeartRateTileId heartRateTileId, Boolean bool, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.barGraphTileTitleDisplay = "";
        } else {
            this.barGraphTileTitleDisplay = str;
        }
        if ((i13 & 2) == 0) {
            this.barGraphTileSubtitleDisplay = null;
        } else {
            this.barGraphTileSubtitleDisplay = str2;
        }
        if ((i13 & 4) == 0) {
            this.barGraphTilePercentageDisplay = "";
        } else {
            this.barGraphTilePercentageDisplay = str3;
        }
        if ((i13 & 8) == 0) {
            this.barGraphTileTimeDisplay = "";
        } else {
            this.barGraphTileTimeDisplay = str4;
        }
        if ((i13 & 16) == 0) {
            this.barGraphTileTimeSuffixDisplay = null;
        } else {
            this.barGraphTileTimeSuffixDisplay = str5;
        }
        if ((i13 & 32) == 0) {
            this.barGraph = new BarGraph(0.0f, (List) null, (RangeModal) null, 7, (DefaultConstructorMarker) null);
        } else {
            this.barGraph = barGraph;
        }
        if ((i13 & 64) == 0) {
            this.tileStyle = HeartRateTileStyle.NONE;
        } else {
            this.tileStyle = heartRateTileStyle;
        }
        this.id = (i13 & 128) == 0 ? HeartRateTileId.NONE : heartRateTileId;
        if ((i13 & 256) == 0) {
            this.hideBackground = null;
        } else {
            this.hideBackground = bool;
        }
        if ((i13 & 512) == 0) {
            this.showRadioToggle = null;
        } else {
            this.showRadioToggle = bool2;
        }
    }

    public HeartRateZone(String barGraphTileTitleDisplay, String str, String barGraphTilePercentageDisplay, String barGraphTileTimeDisplay, String str2, BarGraph barGraph, HeartRateTileStyle tileStyle, HeartRateTileId id4, Boolean bool, Boolean bool2) {
        AbstractC22676k.m65750j(barGraphTileTitleDisplay, "barGraphTileTitleDisplay");
        AbstractC22676k.m65750j(barGraphTilePercentageDisplay, "barGraphTilePercentageDisplay");
        AbstractC22676k.m65750j(barGraphTileTimeDisplay, "barGraphTileTimeDisplay");
        AbstractC22676k.m65750j(tileStyle, "tileStyle");
        AbstractC22676k.m65750j(id4, "id");
        this.barGraphTileTitleDisplay = barGraphTileTitleDisplay;
        this.barGraphTileSubtitleDisplay = str;
        this.barGraphTilePercentageDisplay = barGraphTilePercentageDisplay;
        this.barGraphTileTimeDisplay = barGraphTileTimeDisplay;
        this.barGraphTileTimeSuffixDisplay = str2;
        this.barGraph = barGraph;
        this.tileStyle = tileStyle;
        this.id = id4;
        this.hideBackground = bool;
        this.showRadioToggle = bool2;
    }

    public /* synthetic */ HeartRateZone(String str, String str2, String str3, String str4, String str5, BarGraph barGraph, HeartRateTileStyle heartRateTileStyle, HeartRateTileId heartRateTileId, Boolean bool, Boolean bool2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) == 0 ? str4 : "", (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? new BarGraph(0.0f, (List) null, (RangeModal) null, 7, (DefaultConstructorMarker) null) : barGraph, (i13 & 64) != 0 ? HeartRateTileStyle.NONE : heartRateTileStyle, (i13 & 128) != 0 ? HeartRateTileId.NONE : heartRateTileId, (i13 & 256) != 0 ? null : bool, (i13 & 512) != 0 ? null : bool2);
    }
}
