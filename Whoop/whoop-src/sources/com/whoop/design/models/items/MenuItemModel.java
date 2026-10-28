package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36960g;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 K2\u00020\u0001:\u0002LKBu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0012\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0092\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0019J\u0010\u0010*\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100J'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b7\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b<\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b=\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b>\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b?\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b@\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\bA\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\bB\u0010\u0019R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010C\u0012\u0004\bE\u0010F\u001a\u0004\bD\u0010\"R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010G\u001a\u0004\bH\u0010$R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010I\u001a\u0004\bJ\u0010&¨\u0006M"}, m65681d2 = {"Lcom/whoop/design/models/items/MenuItemModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "subtitle", "suffixTitle", "suffixSubtitle", "leftIcon", "rightIcon", "trackingId", "style", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/design/models/items/ItemVisibilityStateEnum;", "menuItemState", "Lcom/whoop/navigation/models/GenericInteraction;", "genericInteraction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ItemVisibilityStateEnum;Lcom/whoop/navigation/models/GenericInteraction;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ItemVisibilityStateEnum;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Lcom/whoop/navigation/e;", "component10", "()Lcom/whoop/design/models/items/ItemVisibilityStateEnum;", "component11", "()Lcom/whoop/navigation/models/GenericInteraction;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ItemVisibilityStateEnum;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/design/models/items/MenuItemModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/MenuItemModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getSubtitle", "getSuffixTitle", "getSuffixSubtitle", "getLeftIcon", "getRightIcon", "getTrackingId", "getStyle", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "()V", "Lcom/whoop/design/models/items/ItemVisibilityStateEnum;", "getMenuItemState", "Lcom/whoop/navigation/models/GenericInteraction;", "getGenericInteraction", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MenuItemModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final C9598e destination;
    private final GenericInteraction genericInteraction;
    private final String leftIcon;
    private final ItemVisibilityStateEnum menuItemState;
    private final String rightIcon;
    private final String style;
    private final String subtitle;
    private final String suffixSubtitle;
    private final String suffixTitle;
    private final String title;
    private final String trackingId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericInteraction.$stable | C9598e.f28134d;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/MenuItemModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/MenuItemModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MenuItemModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36960g(16)), AbstractC30060g.m92087G(enumC23463i, new C36960g(17)), null};
    }

    public /* synthetic */ MenuItemModel(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C9598e c9598e, ItemVisibilityStateEnum itemVisibilityStateEnum, GenericInteraction genericInteraction, SerializationConstructorMarker serializationConstructorMarker) {
        if (1023 != (i13 & 1023)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1023, MenuItemModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.subtitle = str2;
        this.suffixTitle = str3;
        this.suffixSubtitle = str4;
        this.leftIcon = str5;
        this.rightIcon = str6;
        this.trackingId = str7;
        this.style = str8;
        this.destination = c9598e;
        this.menuItemState = itemVisibilityStateEnum;
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.genericInteraction = null;
        } else {
            this.genericInteraction = genericInteraction;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.ItemVisibilityStateEnum", ItemVisibilityStateEnum.values());
    }

    public static /* synthetic */ MenuItemModel copy$default(MenuItemModel menuItemModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C9598e c9598e, ItemVisibilityStateEnum itemVisibilityStateEnum, GenericInteraction genericInteraction, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = menuItemModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = menuItemModel.subtitle;
        }
        if ((i13 & 4) != 0) {
            str3 = menuItemModel.suffixTitle;
        }
        if ((i13 & 8) != 0) {
            str4 = menuItemModel.suffixSubtitle;
        }
        if ((i13 & 16) != 0) {
            str5 = menuItemModel.leftIcon;
        }
        if ((i13 & 32) != 0) {
            str6 = menuItemModel.rightIcon;
        }
        if ((i13 & 64) != 0) {
            str7 = menuItemModel.trackingId;
        }
        if ((i13 & 128) != 0) {
            str8 = menuItemModel.style;
        }
        if ((i13 & 256) != 0) {
            c9598e = menuItemModel.destination;
        }
        if ((i13 & 512) != 0) {
            itemVisibilityStateEnum = menuItemModel.menuItemState;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            genericInteraction = menuItemModel.genericInteraction;
        }
        ItemVisibilityStateEnum itemVisibilityStateEnum2 = itemVisibilityStateEnum;
        GenericInteraction genericInteraction2 = genericInteraction;
        String str9 = str8;
        C9598e c9598e2 = c9598e;
        String str10 = str6;
        String str11 = str7;
        String str12 = str5;
        String str13 = str3;
        return menuItemModel.copy(str, str2, str13, str4, str12, str10, str11, str9, c9598e2, itemVisibilityStateEnum2, genericInteraction2);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(MenuItemModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.subtitle);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.suffixTitle);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.suffixSubtitle);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.leftIcon);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.rightIcon);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.trackingId);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.style);
        output.encodeNullableSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.destination);
        output.encodeNullableSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.menuItemState);
        if (!output.shouldEncodeElementDefault(serialDesc, 10) && self.genericInteraction == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 10, GenericInteraction$$serializer.INSTANCE, self.genericInteraction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final ItemVisibilityStateEnum getMenuItemState() {
        return this.menuItemState;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final GenericInteraction getGenericInteraction() {
        return this.genericInteraction;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSuffixTitle() {
        return this.suffixTitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSuffixSubtitle() {
        return this.suffixSubtitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLeftIcon() {
        return this.leftIcon;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRightIcon() {
        return this.rightIcon;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTrackingId() {
        return this.trackingId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public final MenuItemModel copy(String title, String subtitle, String suffixTitle, String suffixSubtitle, String leftIcon, String rightIcon, String trackingId, String style, C9598e destination, ItemVisibilityStateEnum menuItemState, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(title, "title");
        return new MenuItemModel(title, subtitle, suffixTitle, suffixSubtitle, leftIcon, rightIcon, trackingId, style, destination, menuItemState, genericInteraction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenuItemModel)) {
            return false;
        }
        MenuItemModel menuItemModel = (MenuItemModel) other;
        return AbstractC22676k.m65745e(this.title, menuItemModel.title) && AbstractC22676k.m65745e(this.subtitle, menuItemModel.subtitle) && AbstractC22676k.m65745e(this.suffixTitle, menuItemModel.suffixTitle) && AbstractC22676k.m65745e(this.suffixSubtitle, menuItemModel.suffixSubtitle) && AbstractC22676k.m65745e(this.leftIcon, menuItemModel.leftIcon) && AbstractC22676k.m65745e(this.rightIcon, menuItemModel.rightIcon) && AbstractC22676k.m65745e(this.trackingId, menuItemModel.trackingId) && AbstractC22676k.m65745e(this.style, menuItemModel.style) && AbstractC22676k.m65745e(this.destination, menuItemModel.destination) && this.menuItemState == menuItemModel.menuItemState && AbstractC22676k.m65745e(this.genericInteraction, menuItemModel.genericInteraction);
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final GenericInteraction getGenericInteraction() {
        return this.genericInteraction;
    }

    public final String getLeftIcon() {
        return this.leftIcon;
    }

    public final ItemVisibilityStateEnum getMenuItemState() {
        return this.menuItemState;
    }

    public final String getRightIcon() {
        return this.rightIcon;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getSuffixSubtitle() {
        return this.suffixSubtitle;
    }

    public final String getSuffixTitle() {
        return this.suffixTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTrackingId() {
        return this.trackingId;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.suffixTitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.suffixSubtitle;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.leftIcon;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.rightIcon;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.trackingId;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.style;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode9 = (iHashCode8 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        ItemVisibilityStateEnum itemVisibilityStateEnum = this.menuItemState;
        int iHashCode10 = (iHashCode9 + (itemVisibilityStateEnum == null ? 0 : itemVisibilityStateEnum.hashCode())) * 31;
        GenericInteraction genericInteraction = this.genericInteraction;
        return iHashCode10 + (genericInteraction != null ? genericInteraction.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.suffixTitle;
        String str4 = this.suffixSubtitle;
        String str5 = this.leftIcon;
        String str6 = this.rightIcon;
        String str7 = this.trackingId;
        String str8 = this.style;
        C9598e c9598e = this.destination;
        ItemVisibilityStateEnum itemVisibilityStateEnum = this.menuItemState;
        GenericInteraction genericInteraction = this.genericInteraction;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MenuItemModel(title=", str, ", subtitle=", str2, ", suffixTitle=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", suffixSubtitle=", str4, ", leftIcon=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", rightIcon=", str6, ", trackingId=");
        AbstractC11266d.m30444B(sbM32001t, str7, ", style=", str8, ", destination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(", menuItemState=");
        sbM32001t.append(itemVisibilityStateEnum);
        sbM32001t.append(", genericInteraction=");
        return AbstractC26725a.m79506j(sbM32001t, genericInteraction, ")");
    }

    public MenuItemModel(String title, String str, String str2, String str3, String str4, String str5, String str6, String str7, C9598e c9598e, ItemVisibilityStateEnum itemVisibilityStateEnum, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(title, "title");
        this.title = title;
        this.subtitle = str;
        this.suffixTitle = str2;
        this.suffixSubtitle = str3;
        this.leftIcon = str4;
        this.rightIcon = str5;
        this.trackingId = str6;
        this.style = str7;
        this.destination = c9598e;
        this.menuItemState = itemVisibilityStateEnum;
        this.genericInteraction = genericInteraction;
    }

    public /* synthetic */ MenuItemModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C9598e c9598e, ItemVisibilityStateEnum itemVisibilityStateEnum, GenericInteraction genericInteraction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, c9598e, itemVisibilityStateEnum, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : genericInteraction);
    }
}
