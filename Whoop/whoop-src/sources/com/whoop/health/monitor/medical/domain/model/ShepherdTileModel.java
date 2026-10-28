package com.whoop.health.monitor.medical.domain.model;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import yi1.EnumC39580n;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019¨\u0006*"}, m65681d2 = {"Lcom/whoop/health/monitor/medical/domain/model/ShepherdTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;", "menuItem", "", "afibState", "<init>", "(Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$kennel_release", "(Lcom/whoop/health/monitor/medical/domain/model/ShepherdTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;Ljava/lang/String;)Lcom/whoop/health/monitor/medical/domain/model/ShepherdTileModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;", "getMenuItem", "Ljava/lang/String;", "getAfibState", "Companion", "$serializer", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ShepherdTileModel implements DesignSystemModel {
    private final String afibState;
    private final ShepherdMenuItemModel menuItem;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d | TextResource.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/health/monitor/medical/domain/model/ShepherdTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/health/monitor/medical/domain/model/ShepherdTileModel;", "serializer", "()Lwc3/c;", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ShepherdTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ShepherdTileModel(int i13, ShepherdMenuItemModel shepherdMenuItemModel, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, ShepherdTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.menuItem = shepherdMenuItemModel;
        if ((i13 & 2) == 0) {
            this.afibState = EnumC39580n.None.getKey();
        } else {
            this.afibState = str;
        }
    }

    public static /* synthetic */ ShepherdTileModel copy$default(ShepherdTileModel shepherdTileModel, ShepherdMenuItemModel shepherdMenuItemModel, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            shepherdMenuItemModel = shepherdTileModel.menuItem;
        }
        if ((i13 & 2) != 0) {
            str = shepherdTileModel.afibState;
        }
        return shepherdTileModel.copy(shepherdMenuItemModel, str);
    }

    public static final /* synthetic */ void write$Self$kennel_release(ShepherdTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, ShepherdMenuItemModel$$serializer.INSTANCE, self.menuItem);
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && AbstractC22676k.m65745e(self.afibState, EnumC39580n.None.getKey())) {
            return;
        }
        output.encodeStringElement(serialDesc, 1, self.afibState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ShepherdMenuItemModel getMenuItem() {
        return this.menuItem;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAfibState() {
        return this.afibState;
    }

    public final ShepherdTileModel copy(ShepherdMenuItemModel menuItem, String afibState) {
        AbstractC22676k.m65750j(menuItem, "menuItem");
        AbstractC22676k.m65750j(afibState, "afibState");
        return new ShepherdTileModel(menuItem, afibState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShepherdTileModel)) {
            return false;
        }
        ShepherdTileModel shepherdTileModel = (ShepherdTileModel) other;
        return AbstractC22676k.m65745e(this.menuItem, shepherdTileModel.menuItem) && AbstractC22676k.m65745e(this.afibState, shepherdTileModel.afibState);
    }

    public final String getAfibState() {
        return this.afibState;
    }

    public final ShepherdMenuItemModel getMenuItem() {
        return this.menuItem;
    }

    public int hashCode() {
        return this.afibState.hashCode() + (this.menuItem.hashCode() * 31);
    }

    public String toString() {
        return "ShepherdTileModel(menuItem=" + this.menuItem + ", afibState=" + this.afibState + ")";
    }

    public ShepherdTileModel(ShepherdMenuItemModel menuItem, String afibState) {
        AbstractC22676k.m65750j(menuItem, "menuItem");
        AbstractC22676k.m65750j(afibState, "afibState");
        this.menuItem = menuItem;
        this.afibState = afibState;
    }

    public /* synthetic */ ShepherdTileModel(ShepherdMenuItemModel shepherdMenuItemModel, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(shepherdMenuItemModel, (i13 & 2) != 0 ? EnumC39580n.None.getKey() : str);
    }
}
