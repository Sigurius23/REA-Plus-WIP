package com.whoop.design.models.items;

import com.whoop.design.atomic.organism.dynamicinformationalimagecard.DynamicInformationalImageCardLayoutState;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36956c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%Jb\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010\u001fJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b4\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b5\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b6\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b7\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010%¨\u0006<"}, m65681d2 = {"Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;", "layoutState", "", "backgroundImageUrl", "iconImageUrl", "title", "description", "tagTitle", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "<init>", "(Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "()Lcom/whoop/navigation/models/GenericInteraction;", "copy", "(Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;", "getLayoutState", "Ljava/lang/String;", "getBackgroundImageUrl", "getIconImageUrl", "getTitle", "getDescription", "getTagTitle", "Lcom/whoop/navigation/models/GenericInteraction;", "getInteraction", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DynamicInformationalImageCardModel implements DesignSystemModel {
    private final String backgroundImageUrl;
    private final String description;
    private final String iconImageUrl;
    private final GenericInteraction interaction;
    private final DynamicInformationalImageCardLayoutState layoutState;
    private final String tagTitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericInteraction.$stable;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36956c(22)), null, null, null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/DynamicInformationalImageCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DynamicInformationalImageCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DynamicInformationalImageCardModel(int i13, DynamicInformationalImageCardLayoutState dynamicInformationalImageCardLayoutState, String str, String str2, String str3, String str4, String str5, GenericInteraction genericInteraction, SerializationConstructorMarker serializationConstructorMarker) {
        if (126 != (i13 & 126)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 126, DynamicInformationalImageCardModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.layoutState = DynamicInformationalImageCardLayoutState.COLLAPSED;
        } else {
            this.layoutState = dynamicInformationalImageCardLayoutState;
        }
        this.backgroundImageUrl = str;
        this.iconImageUrl = str2;
        this.title = str3;
        this.description = str4;
        this.tagTitle = str5;
        this.interaction = genericInteraction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return DynamicInformationalImageCardLayoutState.INSTANCE.serializer();
    }

    public static /* synthetic */ DynamicInformationalImageCardModel copy$default(DynamicInformationalImageCardModel dynamicInformationalImageCardModel, DynamicInformationalImageCardLayoutState dynamicInformationalImageCardLayoutState, String str, String str2, String str3, String str4, String str5, GenericInteraction genericInteraction, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            dynamicInformationalImageCardLayoutState = dynamicInformationalImageCardModel.layoutState;
        }
        if ((i13 & 2) != 0) {
            str = dynamicInformationalImageCardModel.backgroundImageUrl;
        }
        if ((i13 & 4) != 0) {
            str2 = dynamicInformationalImageCardModel.iconImageUrl;
        }
        if ((i13 & 8) != 0) {
            str3 = dynamicInformationalImageCardModel.title;
        }
        if ((i13 & 16) != 0) {
            str4 = dynamicInformationalImageCardModel.description;
        }
        if ((i13 & 32) != 0) {
            str5 = dynamicInformationalImageCardModel.tagTitle;
        }
        if ((i13 & 64) != 0) {
            genericInteraction = dynamicInformationalImageCardModel.interaction;
        }
        String str6 = str5;
        GenericInteraction genericInteraction2 = genericInteraction;
        String str7 = str4;
        String str8 = str2;
        return dynamicInformationalImageCardModel.copy(dynamicInformationalImageCardLayoutState, str, str8, str3, str7, str6, genericInteraction2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(DynamicInformationalImageCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.layoutState != DynamicInformationalImageCardLayoutState.COLLAPSED) {
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.layoutState);
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.backgroundImageUrl);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.iconImageUrl);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.title);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.description);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.tagTitle);
        output.encodeNullableSerializableElement(serialDesc, 6, GenericInteraction$$serializer.INSTANCE, self.interaction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DynamicInformationalImageCardLayoutState getLayoutState() {
        return this.layoutState;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIconImageUrl() {
        return this.iconImageUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTagTitle() {
        return this.tagTitle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    public final DynamicInformationalImageCardModel copy(DynamicInformationalImageCardLayoutState layoutState, String backgroundImageUrl, String iconImageUrl, String title, String description, String tagTitle, GenericInteraction interaction) {
        AbstractC22676k.m65750j(layoutState, "layoutState");
        return new DynamicInformationalImageCardModel(layoutState, backgroundImageUrl, iconImageUrl, title, description, tagTitle, interaction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicInformationalImageCardModel)) {
            return false;
        }
        DynamicInformationalImageCardModel dynamicInformationalImageCardModel = (DynamicInformationalImageCardModel) other;
        return this.layoutState == dynamicInformationalImageCardModel.layoutState && AbstractC22676k.m65745e(this.backgroundImageUrl, dynamicInformationalImageCardModel.backgroundImageUrl) && AbstractC22676k.m65745e(this.iconImageUrl, dynamicInformationalImageCardModel.iconImageUrl) && AbstractC22676k.m65745e(this.title, dynamicInformationalImageCardModel.title) && AbstractC22676k.m65745e(this.description, dynamicInformationalImageCardModel.description) && AbstractC22676k.m65745e(this.tagTitle, dynamicInformationalImageCardModel.tagTitle) && AbstractC22676k.m65745e(this.interaction, dynamicInformationalImageCardModel.interaction);
    }

    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getIconImageUrl() {
        return this.iconImageUrl;
    }

    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    public final DynamicInformationalImageCardLayoutState getLayoutState() {
        return this.layoutState;
    }

    public final String getTagTitle() {
        return this.tagTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.layoutState.hashCode() * 31;
        String str = this.backgroundImageUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconImageUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.tagTitle;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        GenericInteraction genericInteraction = this.interaction;
        return iHashCode6 + (genericInteraction != null ? genericInteraction.hashCode() : 0);
    }

    public String toString() {
        DynamicInformationalImageCardLayoutState dynamicInformationalImageCardLayoutState = this.layoutState;
        String str = this.backgroundImageUrl;
        String str2 = this.iconImageUrl;
        String str3 = this.title;
        String str4 = this.description;
        String str5 = this.tagTitle;
        GenericInteraction genericInteraction = this.interaction;
        StringBuilder sb4 = new StringBuilder("DynamicInformationalImageCardModel(layoutState=");
        sb4.append(dynamicInformationalImageCardLayoutState);
        sb4.append(", backgroundImageUrl=");
        sb4.append(str);
        sb4.append(", iconImageUrl=");
        AbstractC11266d.m30444B(sb4, str2, ", title=", str3, ", description=");
        AbstractC11266d.m30444B(sb4, str4, ", tagTitle=", str5, ", interaction=");
        return AbstractC26725a.m79506j(sb4, genericInteraction, ")");
    }

    public DynamicInformationalImageCardModel(DynamicInformationalImageCardLayoutState layoutState, String str, String str2, String str3, String str4, String str5, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(layoutState, "layoutState");
        this.layoutState = layoutState;
        this.backgroundImageUrl = str;
        this.iconImageUrl = str2;
        this.title = str3;
        this.description = str4;
        this.tagTitle = str5;
        this.interaction = genericInteraction;
    }

    public /* synthetic */ DynamicInformationalImageCardModel(DynamicInformationalImageCardLayoutState dynamicInformationalImageCardLayoutState, String str, String str2, String str3, String str4, String str5, GenericInteraction genericInteraction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? DynamicInformationalImageCardLayoutState.COLLAPSED : dynamicInformationalImageCardLayoutState, str, str2, str3, str4, str5, genericInteraction);
    }
}
