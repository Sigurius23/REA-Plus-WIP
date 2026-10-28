package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import un1.C35100f;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:BQ\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB]\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%JZ\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b(\u0010!J\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010!R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b6\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b7\u0010!R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010%¨\u0006<"}, m65681d2 = {"Lcom/whoop/design/models/items/ItemsCardHeaderModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/navigation/e;", "ctaDestination", "Lcom/whoop/navigation/models/GenericInteraction;", "ctaInteraction", "", "ctaIcon", "title", "titleIcon", "", "androidCtaFeatureFlags", "<init>", "(Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ItemsCardHeaderModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/navigation/e;", "component2", "()Lcom/whoop/navigation/models/GenericInteraction;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "()Ljava/util/List;", "copy", "(Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/design/models/items/ItemsCardHeaderModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/navigation/e;", "getCtaDestination", "Lcom/whoop/navigation/models/GenericInteraction;", "getCtaInteraction", "Ljava/lang/String;", "getCtaIcon", "getTitle", "getTitleIcon", "Ljava/util/List;", "getAndroidCtaFeatureFlags", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ItemsCardHeaderModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<String> androidCtaFeatureFlags;
    private final C9598e ctaDestination;
    private final String ctaIcon;
    private final GenericInteraction ctaInteraction;
    private final String title;
    private final String titleIcon;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ItemsCardHeaderModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ItemsCardHeaderModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ItemsCardHeaderModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C35100f(16)), null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C35100f(17))};
    }

    public ItemsCardHeaderModel() {
        this((C9598e) null, (GenericInteraction) null, (String) null, (String) null, (String) null, (List) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ItemsCardHeaderModel copy$default(ItemsCardHeaderModel itemsCardHeaderModel, C9598e c9598e, GenericInteraction genericInteraction, String str, String str2, String str3, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c9598e = itemsCardHeaderModel.ctaDestination;
        }
        if ((i13 & 2) != 0) {
            genericInteraction = itemsCardHeaderModel.ctaInteraction;
        }
        if ((i13 & 4) != 0) {
            str = itemsCardHeaderModel.ctaIcon;
        }
        if ((i13 & 8) != 0) {
            str2 = itemsCardHeaderModel.title;
        }
        if ((i13 & 16) != 0) {
            str3 = itemsCardHeaderModel.titleIcon;
        }
        if ((i13 & 32) != 0) {
            list = itemsCardHeaderModel.androidCtaFeatureFlags;
        }
        String str4 = str3;
        List list2 = list;
        return itemsCardHeaderModel.copy(c9598e, genericInteraction, str, str2, str4, list2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ItemsCardHeaderModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.ctaDestination != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.ctaDestination);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.ctaInteraction != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, GenericInteraction$$serializer.INSTANCE, self.ctaInteraction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.ctaIcon, "TINY_EXPAND")) {
            output.encodeStringElement(serialDesc, 2, self.ctaIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.title, "")) {
            output.encodeStringElement(serialDesc, 3, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !AbstractC22676k.m65745e(self.titleIcon, "HEART_RATE")) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.titleIcon);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && AbstractC22676k.m65745e(self.androidCtaFeatureFlags, C25271y.f99162w)) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.androidCtaFeatureFlags);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final C9598e getCtaDestination() {
        return this.ctaDestination;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final GenericInteraction getCtaInteraction() {
        return this.ctaInteraction;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCtaIcon() {
        return this.ctaIcon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitleIcon() {
        return this.titleIcon;
    }

    public final List<String> component6() {
        return this.androidCtaFeatureFlags;
    }

    public final ItemsCardHeaderModel copy(C9598e ctaDestination, GenericInteraction ctaInteraction, String ctaIcon, String title, String titleIcon, List<String> androidCtaFeatureFlags) {
        AbstractC22676k.m65750j(ctaIcon, "ctaIcon");
        AbstractC22676k.m65750j(title, "title");
        return new ItemsCardHeaderModel(ctaDestination, ctaInteraction, ctaIcon, title, titleIcon, androidCtaFeatureFlags);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemsCardHeaderModel)) {
            return false;
        }
        ItemsCardHeaderModel itemsCardHeaderModel = (ItemsCardHeaderModel) other;
        return AbstractC22676k.m65745e(this.ctaDestination, itemsCardHeaderModel.ctaDestination) && AbstractC22676k.m65745e(this.ctaInteraction, itemsCardHeaderModel.ctaInteraction) && AbstractC22676k.m65745e(this.ctaIcon, itemsCardHeaderModel.ctaIcon) && AbstractC22676k.m65745e(this.title, itemsCardHeaderModel.title) && AbstractC22676k.m65745e(this.titleIcon, itemsCardHeaderModel.titleIcon) && AbstractC22676k.m65745e(this.androidCtaFeatureFlags, itemsCardHeaderModel.androidCtaFeatureFlags);
    }

    public final List<String> getAndroidCtaFeatureFlags() {
        return this.androidCtaFeatureFlags;
    }

    public final C9598e getCtaDestination() {
        return this.ctaDestination;
    }

    public final String getCtaIcon() {
        return this.ctaIcon;
    }

    public final GenericInteraction getCtaInteraction() {
        return this.ctaInteraction;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleIcon() {
        return this.titleIcon;
    }

    public int hashCode() {
        C9598e c9598e = this.ctaDestination;
        int iHashCode = (c9598e == null ? 0 : c9598e.hashCode()) * 31;
        GenericInteraction genericInteraction = this.ctaInteraction;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31, 31, this.ctaIcon), 31, this.title);
        String str = this.titleIcon;
        int iHashCode2 = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.androidCtaFeatureFlags;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        C9598e c9598e = this.ctaDestination;
        GenericInteraction genericInteraction = this.ctaInteraction;
        String str = this.ctaIcon;
        String str2 = this.title;
        String str3 = this.titleIcon;
        List<String> list = this.androidCtaFeatureFlags;
        StringBuilder sb4 = new StringBuilder("ItemsCardHeaderModel(ctaDestination=");
        sb4.append(c9598e);
        sb4.append(", ctaInteraction=");
        sb4.append(genericInteraction);
        sb4.append(", ctaIcon=");
        AbstractC11266d.m30444B(sb4, str, ", title=", str2, ", titleIcon=");
        return AbstractC30007c.m91840j(str3, ", androidCtaFeatureFlags=", ")", sb4, list);
    }

    public /* synthetic */ ItemsCardHeaderModel(int i13, C9598e c9598e, GenericInteraction genericInteraction, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.ctaDestination = null;
        } else {
            this.ctaDestination = c9598e;
        }
        if ((i13 & 2) == 0) {
            this.ctaInteraction = null;
        } else {
            this.ctaInteraction = genericInteraction;
        }
        if ((i13 & 4) == 0) {
            this.ctaIcon = "TINY_EXPAND";
        } else {
            this.ctaIcon = str;
        }
        if ((i13 & 8) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i13 & 16) == 0) {
            this.titleIcon = "HEART_RATE";
        } else {
            this.titleIcon = str3;
        }
        if ((i13 & 32) == 0) {
            this.androidCtaFeatureFlags = C25271y.f99162w;
        } else {
            this.androidCtaFeatureFlags = list;
        }
    }

    public ItemsCardHeaderModel(C9598e c9598e, GenericInteraction genericInteraction, String ctaIcon, String title, String str, List<String> list) {
        AbstractC22676k.m65750j(ctaIcon, "ctaIcon");
        AbstractC22676k.m65750j(title, "title");
        this.ctaDestination = c9598e;
        this.ctaInteraction = genericInteraction;
        this.ctaIcon = ctaIcon;
        this.title = title;
        this.titleIcon = str;
        this.androidCtaFeatureFlags = list;
    }

    public /* synthetic */ ItemsCardHeaderModel(C9598e c9598e, GenericInteraction genericInteraction, String str, String str2, String str3, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : c9598e, (i13 & 2) != 0 ? null : genericInteraction, (i13 & 4) != 0 ? "TINY_EXPAND" : str, (i13 & 8) != 0 ? "" : str2, (i13 & 16) != 0 ? "HEART_RATE" : str3, (i13 & 32) != 0 ? C25271y.f99162w : list);
    }
}
