package com.whoop.hormonalinsights.menstrualcycleinsights.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import qo1.C30527b;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J8\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010 ¨\u00064"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/TileWithTitleModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "titleDisplay", "tile", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/InfoButton;", "infoButton", "", "showTileBackground", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/InfoButton;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/InfoButton;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/TileWithTitleModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/DesignSystemModel;", "component3", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/InfoButton;", "component4", "()Z", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/InfoButton;Z)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/TileWithTitleModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitleDisplay", "Lcom/whoop/design/models/DesignSystemModel;", "getTile", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/InfoButton;", "getInfoButton", "Z", "getShowTileBackground", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TileWithTitleModel implements DesignSystemModel {
    private final InfoButton infoButton;
    private final boolean showTileBackground;
    private final DesignSystemModel tile;
    private final String titleDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C30527b(11)), null, null};

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/TileWithTitleModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/TileWithTitleModel;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TileWithTitleModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TileWithTitleModel(int i13, String str, DesignSystemModel designSystemModel, InfoButton infoButton, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, TileWithTitleModel$$serializer.INSTANCE.getDescriptor());
        }
        this.titleDisplay = str;
        this.tile = designSystemModel;
        this.infoButton = infoButton;
        this.showTileBackground = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]);
    }

    public static /* synthetic */ TileWithTitleModel copy$default(TileWithTitleModel tileWithTitleModel, String str, DesignSystemModel designSystemModel, InfoButton infoButton, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = tileWithTitleModel.titleDisplay;
        }
        if ((i13 & 2) != 0) {
            designSystemModel = tileWithTitleModel.tile;
        }
        if ((i13 & 4) != 0) {
            infoButton = tileWithTitleModel.infoButton;
        }
        if ((i13 & 8) != 0) {
            z4 = tileWithTitleModel.showTileBackground;
        }
        return tileWithTitleModel.copy(str, designSystemModel, infoButton, z4);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(TileWithTitleModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.titleDisplay);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.tile);
        output.encodeSerializableElement(serialDesc, 2, InfoButton$$serializer.INSTANCE, self.infoButton);
        output.encodeBooleanElement(serialDesc, 3, self.showTileBackground);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DesignSystemModel getTile() {
        return this.tile;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final InfoButton getInfoButton() {
        return this.infoButton;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getShowTileBackground() {
        return this.showTileBackground;
    }

    public final TileWithTitleModel copy(String titleDisplay, DesignSystemModel tile, InfoButton infoButton, boolean showTileBackground) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(tile, "tile");
        AbstractC22676k.m65750j(infoButton, "infoButton");
        return new TileWithTitleModel(titleDisplay, tile, infoButton, showTileBackground);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TileWithTitleModel)) {
            return false;
        }
        TileWithTitleModel tileWithTitleModel = (TileWithTitleModel) other;
        return AbstractC22676k.m65745e(this.titleDisplay, tileWithTitleModel.titleDisplay) && AbstractC22676k.m65745e(this.tile, tileWithTitleModel.tile) && AbstractC22676k.m65745e(this.infoButton, tileWithTitleModel.infoButton) && this.showTileBackground == tileWithTitleModel.showTileBackground;
    }

    public final InfoButton getInfoButton() {
        return this.infoButton;
    }

    public final boolean getShowTileBackground() {
        return this.showTileBackground;
    }

    public final DesignSystemModel getTile() {
        return this.tile;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showTileBackground) + ((this.infoButton.hashCode() + ((this.tile.hashCode() + (this.titleDisplay.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "TileWithTitleModel(titleDisplay=" + this.titleDisplay + ", tile=" + this.tile + ", infoButton=" + this.infoButton + ", showTileBackground=" + this.showTileBackground + ")";
    }

    public TileWithTitleModel(String titleDisplay, DesignSystemModel tile, InfoButton infoButton, boolean z4) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(tile, "tile");
        AbstractC22676k.m65750j(infoButton, "infoButton");
        this.titleDisplay = titleDisplay;
        this.tile = tile;
        this.infoButton = infoButton;
        this.showTileBackground = z4;
    }
}
