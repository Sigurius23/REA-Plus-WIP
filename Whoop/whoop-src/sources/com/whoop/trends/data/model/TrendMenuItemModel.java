package com.whoop.trends.data.model;

import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.MenuItemModel;
import com.whoop.design.models.items.MenuItemModel$$serializer;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import md1.C25452a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ2\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00101\u0012\u0004\b3\u0010-\u001a\u0004\b2\u0010\u001d¨\u00066"}, m65681d2 = {"Lcom/whoop/trends/data/model/TrendMenuItemModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/items/MenuItemModel;", "trendMenuItem", "Lcom/whoop/design/util/TextResource;", "trendMenuDetailText", "Lcom/whoop/trends/data/model/TrendMenuSheet;", "trendMenuSheet", "<init>", "(Lcom/whoop/design/models/items/MenuItemModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/trends/data/model/TrendMenuSheet;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/MenuItemModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/trends/data/model/TrendMenuSheet;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$trends_release", "(Lcom/whoop/trends/data/model/TrendMenuItemModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/MenuItemModel;", "component2", "()Lcom/whoop/design/util/TextResource;", "component3", "()Lcom/whoop/trends/data/model/TrendMenuSheet;", "copy", "(Lcom/whoop/design/models/items/MenuItemModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/trends/data/model/TrendMenuSheet;)Lcom/whoop/trends/data/model/TrendMenuItemModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/MenuItemModel;", "getTrendMenuItem", "getTrendMenuItem$annotations", "()V", "Lcom/whoop/design/util/TextResource;", "getTrendMenuDetailText", "getTrendMenuDetailText$annotations", "Lcom/whoop/trends/data/model/TrendMenuSheet;", "getTrendMenuSheet", "getTrendMenuSheet$annotations", "Companion", "$serializer", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TrendMenuItemModel implements DesignSystemModel {

    @SerializedName("trend_menu_detail_text")
    private final TextResource trendMenuDetailText;

    @SerializedName("trend_menu_item")
    private final MenuItemModel trendMenuItem;

    @SerializedName("trend_menu_sheet")
    private final TrendMenuSheet trendMenuSheet;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/trends/data/model/TrendMenuItemModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/trends/data/model/TrendMenuItemModel;", "serializer", "()Lwc3/c;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TrendMenuItemModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TrendMenuItemModel(int i13, MenuItemModel menuItemModel, TextResource textResource, TrendMenuSheet trendMenuSheet, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, TrendMenuItemModel$$serializer.INSTANCE.getDescriptor());
        }
        this.trendMenuItem = menuItemModel;
        this.trendMenuDetailText = textResource;
        this.trendMenuSheet = trendMenuSheet;
    }

    public static /* synthetic */ TrendMenuItemModel copy$default(TrendMenuItemModel trendMenuItemModel, MenuItemModel menuItemModel, TextResource textResource, TrendMenuSheet trendMenuSheet, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            menuItemModel = trendMenuItemModel.trendMenuItem;
        }
        if ((i13 & 2) != 0) {
            textResource = trendMenuItemModel.trendMenuDetailText;
        }
        if ((i13 & 4) != 0) {
            trendMenuSheet = trendMenuItemModel.trendMenuSheet;
        }
        return trendMenuItemModel.copy(menuItemModel, textResource, trendMenuSheet);
    }

    @InterfaceC37143h("trend_menu_detail_text")
    public static /* synthetic */ void getTrendMenuDetailText$annotations() {
    }

    @InterfaceC37143h("trend_menu_item")
    public static /* synthetic */ void getTrendMenuItem$annotations() {
    }

    @InterfaceC37143h("trend_menu_sheet")
    public static /* synthetic */ void getTrendMenuSheet$annotations() {
    }

    public static final /* synthetic */ void write$Self$trends_release(TrendMenuItemModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, MenuItemModel$$serializer.INSTANCE, self.trendMenuItem);
        output.encodeNullableSerializableElement(serialDesc, 1, C25452a.f99689a, self.trendMenuDetailText);
        output.encodeNullableSerializableElement(serialDesc, 2, TrendMenuSheet$$serializer.INSTANCE, self.trendMenuSheet);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MenuItemModel getTrendMenuItem() {
        return this.trendMenuItem;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getTrendMenuDetailText() {
        return this.trendMenuDetailText;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TrendMenuSheet getTrendMenuSheet() {
        return this.trendMenuSheet;
    }

    public final TrendMenuItemModel copy(MenuItemModel trendMenuItem, TextResource trendMenuDetailText, TrendMenuSheet trendMenuSheet) {
        AbstractC22676k.m65750j(trendMenuItem, "trendMenuItem");
        return new TrendMenuItemModel(trendMenuItem, trendMenuDetailText, trendMenuSheet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrendMenuItemModel)) {
            return false;
        }
        TrendMenuItemModel trendMenuItemModel = (TrendMenuItemModel) other;
        return AbstractC22676k.m65745e(this.trendMenuItem, trendMenuItemModel.trendMenuItem) && AbstractC22676k.m65745e(this.trendMenuDetailText, trendMenuItemModel.trendMenuDetailText) && AbstractC22676k.m65745e(this.trendMenuSheet, trendMenuItemModel.trendMenuSheet);
    }

    public final TextResource getTrendMenuDetailText() {
        return this.trendMenuDetailText;
    }

    public final MenuItemModel getTrendMenuItem() {
        return this.trendMenuItem;
    }

    public final TrendMenuSheet getTrendMenuSheet() {
        return this.trendMenuSheet;
    }

    public int hashCode() {
        int iHashCode = this.trendMenuItem.hashCode() * 31;
        TextResource textResource = this.trendMenuDetailText;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TrendMenuSheet trendMenuSheet = this.trendMenuSheet;
        return iHashCode2 + (trendMenuSheet != null ? trendMenuSheet.hashCode() : 0);
    }

    public String toString() {
        return "TrendMenuItemModel(trendMenuItem=" + this.trendMenuItem + ", trendMenuDetailText=" + this.trendMenuDetailText + ", trendMenuSheet=" + this.trendMenuSheet + ")";
    }

    public TrendMenuItemModel(MenuItemModel trendMenuItem, TextResource textResource, TrendMenuSheet trendMenuSheet) {
        AbstractC22676k.m65750j(trendMenuItem, "trendMenuItem");
        this.trendMenuItem = trendMenuItem;
        this.trendMenuDetailText = textResource;
        this.trendMenuSheet = trendMenuSheet;
    }
}
