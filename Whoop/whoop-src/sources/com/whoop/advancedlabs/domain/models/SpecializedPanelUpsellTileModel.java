package com.whoop.advancedlabs.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import tb0.C33691b;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ@\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001f¨\u00063"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/SpecializedPanelUpsellTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "image", "", "items", "rightIcon", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/SpecializedPanelUpsellTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/advancedlabs/domain/models/SpecializedPanelUpsellTileModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "Ljava/util/List;", "getItems", "getRightIcon", "Lcom/whoop/navigation/e;", "getDestination", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SpecializedPanelUpsellTileModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final C9598e destination;
    private final String image;
    private final List<DesignSystemModel> items;
    private final String rightIcon;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/SpecializedPanelUpsellTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/SpecializedPanelUpsellTileModel;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SpecializedPanelUpsellTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C33691b(1)), null, AbstractC30060g.m92087G(enumC23463i, new C33691b(2))};
    }

    public /* synthetic */ SpecializedPanelUpsellTileModel(int i13, String str, List list, String str2, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, SpecializedPanelUpsellTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.image = str;
        this.items = list;
        this.rightIcon = str2;
        this.destination = c9598e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpecializedPanelUpsellTileModel copy$default(SpecializedPanelUpsellTileModel specializedPanelUpsellTileModel, String str, List list, String str2, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = specializedPanelUpsellTileModel.image;
        }
        if ((i13 & 2) != 0) {
            list = specializedPanelUpsellTileModel.items;
        }
        if ((i13 & 4) != 0) {
            str2 = specializedPanelUpsellTileModel.rightIcon;
        }
        if ((i13 & 8) != 0) {
            c9598e = specializedPanelUpsellTileModel.destination;
        }
        return specializedPanelUpsellTileModel.copy(str, list, str2, c9598e);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(SpecializedPanelUpsellTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.image);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.items);
        output.encodeStringElement(serialDesc, 2, self.rightIcon);
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    public final List<DesignSystemModel> component2() {
        return this.items;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRightIcon() {
        return this.rightIcon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public final SpecializedPanelUpsellTileModel copy(String image, List<? extends DesignSystemModel> items, String rightIcon, C9598e destination) {
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(rightIcon, "rightIcon");
        return new SpecializedPanelUpsellTileModel(image, items, rightIcon, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpecializedPanelUpsellTileModel)) {
            return false;
        }
        SpecializedPanelUpsellTileModel specializedPanelUpsellTileModel = (SpecializedPanelUpsellTileModel) other;
        return AbstractC22676k.m65745e(this.image, specializedPanelUpsellTileModel.image) && AbstractC22676k.m65745e(this.items, specializedPanelUpsellTileModel.items) && AbstractC22676k.m65745e(this.rightIcon, specializedPanelUpsellTileModel.rightIcon) && AbstractC22676k.m65745e(this.destination, specializedPanelUpsellTileModel.destination);
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getImage() {
        return this.image;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final String getRightIcon() {
        return this.rightIcon;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11895b.m31983b(this.image.hashCode() * 31, 31, this.items), 31, this.rightIcon);
        C9598e c9598e = this.destination;
        return iM30450d + (c9598e == null ? 0 : c9598e.hashCode());
    }

    public String toString() {
        String str = this.image;
        List<DesignSystemModel> list = this.items;
        return AbstractC13673n.m38563j(AbstractC30802r.m94766o("SpecializedPanelUpsellTileModel(image=", str, ", items=", ", rightIcon=", list), this.rightIcon, ", destination=", this.destination, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SpecializedPanelUpsellTileModel(String image, List<? extends DesignSystemModel> items, String rightIcon, C9598e c9598e) {
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(rightIcon, "rightIcon");
        this.image = image;
        this.items = items;
        this.rightIcon = rightIcon;
        this.destination = c9598e;
    }
}
