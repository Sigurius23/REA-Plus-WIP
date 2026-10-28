package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36954a;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ>\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b\b\u0010\u001f¨\u00063"}, m65681d2 = {"Lcom/whoop/design/models/items/CardIconButtonModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "icon", "Lcom/whoop/navigation/e;", "destination", "", "isEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/CardIconButtonModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/navigation/e;", "component4", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/Boolean;)Lcom/whoop/design/models/items/CardIconButtonModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getIcon", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "()V", "Ljava/lang/Boolean;", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CardIconButtonModel implements DesignSystemModel {
    private final C9598e destination;
    private final String icon;
    private final String id;
    private final Boolean isEnabled;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36954a(22)), null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/CardIconButtonModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/CardIconButtonModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CardIconButtonModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CardIconButtonModel(int i13, String str, String str2, C9598e c9598e, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i13 & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2, CardIconButtonModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        this.icon = str2;
        if ((i13 & 4) == 0) {
            this.destination = null;
        } else {
            this.destination = c9598e;
        }
        if ((i13 & 8) == 0) {
            this.isEnabled = null;
        } else {
            this.isEnabled = bool;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ CardIconButtonModel copy$default(CardIconButtonModel cardIconButtonModel, String str, String str2, C9598e c9598e, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = cardIconButtonModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = cardIconButtonModel.icon;
        }
        if ((i13 & 4) != 0) {
            c9598e = cardIconButtonModel.destination;
        }
        if ((i13 & 8) != 0) {
            bool = cardIconButtonModel.isEnabled;
        }
        return cardIconButtonModel.copy(str, str2, c9598e, bool);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(CardIconButtonModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.id != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.id);
        }
        output.encodeStringElement(serialDesc, 1, self.icon);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.destination != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.destination);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.isEnabled == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, BooleanSerializer.INSTANCE, self.isEnabled);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final CardIconButtonModel copy(String id4, String icon, C9598e destination, Boolean isEnabled) {
        AbstractC22676k.m65750j(icon, "icon");
        return new CardIconButtonModel(id4, icon, destination, isEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardIconButtonModel)) {
            return false;
        }
        CardIconButtonModel cardIconButtonModel = (CardIconButtonModel) other;
        return AbstractC22676k.m65745e(this.id, cardIconButtonModel.id) && AbstractC22676k.m65745e(this.icon, cardIconButtonModel.icon) && AbstractC22676k.m65745e(this.destination, cardIconButtonModel.destination) && AbstractC22676k.m65745e(this.isEnabled, cardIconButtonModel.isEnabled);
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        String str = this.id;
        int iM30450d = AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.icon);
        C9598e c9598e = this.destination;
        int iHashCode = (iM30450d + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        Boolean bool = this.isEnabled;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.icon;
        C9598e c9598e = this.destination;
        Boolean bool = this.isEnabled;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CardIconButtonModel(id=", str, ", icon=", str2, ", destination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(", isEnabled=");
        sbM32001t.append(bool);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public CardIconButtonModel(String str, String icon, C9598e c9598e, Boolean bool) {
        AbstractC22676k.m65750j(icon, "icon");
        this.id = str;
        this.icon = icon;
        this.destination = c9598e;
        this.isEnabled = bool;
    }

    public /* synthetic */ CardIconButtonModel(String str, String str2, C9598e c9598e, Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, str2, (i13 & 4) != 0 ? null : c9598e, (i13 & 8) != 0 ? null : bool);
    }
}
