package com.whoop.core.details.network.model;

import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gz0.EnumC16313m0;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ<\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001f¨\u00062"}, m65681d2 = {"Lcom/whoop/core/details/network/model/MenuOptionsItem;", "", "", "displayLabel", "action", "Lcom/whoop/navigation/e;", "destination", "Lgz0/m0;", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lgz0/m0;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lgz0/m0;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_details_release", "(Lcom/whoop/core/details/network/model/MenuOptionsItem;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/navigation/e;", "component4", "()Lgz0/m0;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lgz0/m0;)Lcom/whoop/core/details/network/model/MenuOptionsItem;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDisplayLabel", "getAction", "Lcom/whoop/navigation/e;", "getDestination", "Lgz0/m0;", "getIcon", "Companion", "$serializer", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MenuOptionsItem {
    private static final InterfaceC23462h[] $childSerializers;
    private final String action;
    private final C9598e destination;
    private final String displayLabel;
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/core/details/network/model/MenuOptionsItem$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/core/details/network/model/MenuOptionsItem;", "serializer", "()Lwc3/c;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MenuOptionsItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C6451a(15)), AbstractC30060g.m92087G(enumC23463i, new C6451a(16))};
    }

    public /* synthetic */ MenuOptionsItem(int i13, String str, String str2, C9598e c9598e, EnumC16313m0 enumC16313m0, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, MenuOptionsItem$$serializer.INSTANCE.getDescriptor());
        }
        this.displayLabel = str;
        this.action = str2;
        if ((i13 & 4) == 0) {
            this.destination = null;
        } else {
            this.destination = c9598e;
        }
        if ((i13 & 8) == 0) {
            this.icon = null;
        } else {
            this.icon = enumC16313m0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.icon.WhoopIconMapper", EnumC16313m0.values());
    }

    public static /* synthetic */ MenuOptionsItem copy$default(MenuOptionsItem menuOptionsItem, String str, String str2, C9598e c9598e, EnumC16313m0 enumC16313m0, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = menuOptionsItem.displayLabel;
        }
        if ((i13 & 2) != 0) {
            str2 = menuOptionsItem.action;
        }
        if ((i13 & 4) != 0) {
            c9598e = menuOptionsItem.destination;
        }
        if ((i13 & 8) != 0) {
            enumC16313m0 = menuOptionsItem.icon;
        }
        return menuOptionsItem.copy(str, str2, c9598e, enumC16313m0);
    }

    public static final /* synthetic */ void write$Self$core_details_release(MenuOptionsItem self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.displayLabel);
        output.encodeStringElement(serialDesc, 1, self.action);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.destination != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.destination);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.icon == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.icon);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDisplayLabel() {
        return this.displayLabel;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    public final MenuOptionsItem copy(String displayLabel, String action, C9598e destination, EnumC16313m0 icon) {
        AbstractC22676k.m65750j(displayLabel, "displayLabel");
        AbstractC22676k.m65750j(action, "action");
        return new MenuOptionsItem(displayLabel, action, destination, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenuOptionsItem)) {
            return false;
        }
        MenuOptionsItem menuOptionsItem = (MenuOptionsItem) other;
        return AbstractC22676k.m65745e(this.displayLabel, menuOptionsItem.displayLabel) && AbstractC22676k.m65745e(this.action, menuOptionsItem.action) && AbstractC22676k.m65745e(this.destination, menuOptionsItem.destination) && this.icon == menuOptionsItem.icon;
    }

    public final String getAction() {
        return this.action;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getDisplayLabel() {
        return this.displayLabel;
    }

    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.displayLabel.hashCode() * 31, 31, this.action);
        C9598e c9598e = this.destination;
        int iHashCode = (iM30450d + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.icon;
        return iHashCode + (enumC16313m0 != null ? enumC16313m0.hashCode() : 0);
    }

    public String toString() {
        String str = this.displayLabel;
        String str2 = this.action;
        C9598e c9598e = this.destination;
        EnumC16313m0 enumC16313m0 = this.icon;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MenuOptionsItem(displayLabel=", str, ", action=", str2, ", destination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(", icon=");
        sbM32001t.append(enumC16313m0);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public MenuOptionsItem(String displayLabel, String action, C9598e c9598e, EnumC16313m0 enumC16313m0) {
        AbstractC22676k.m65750j(displayLabel, "displayLabel");
        AbstractC22676k.m65750j(action, "action");
        this.displayLabel = displayLabel;
        this.action = action;
        this.destination = c9598e;
        this.icon = enumC16313m0;
    }

    public /* synthetic */ MenuOptionsItem(String str, String str2, C9598e c9598e, EnumC16313m0 enumC16313m0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? null : c9598e, (i13 & 8) != 0 ? null : enumC16313m0);
    }
}
