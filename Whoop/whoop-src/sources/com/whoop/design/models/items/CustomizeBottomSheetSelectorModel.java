package com.whoop.design.models.items;

import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36955b;
import w91.C36956c;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 K2\u00020\u0001:\u0002LKBw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0011\u0010\u0012B\u0091\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0012\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0090\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0019J\u0010\u0010)\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/J'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u0019R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b=\u0010\u0019R(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010;\u0012\u0004\b?\u0010@\u001a\u0004\b>\u0010\u001bR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\bA\u0010\u0019R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\bB\u0010\u0019R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\bC\u0010\u001bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010D\u001a\u0004\bE\u0010\"R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010F\u0012\u0004\bH\u0010@\u001a\u0004\bG\u0010$R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010F\u0012\u0004\bJ\u0010@\u001a\u0004\bI\u0010$¨\u0006M"}, m65681d2 = {"Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "", "categories", "currentCategory", "Lcom/whoop/design/models/items/GroupedTogglesModel;", "groupedTogglesModels", "searchTitle", "buttonTitle", "Lcom/whoop/design/models/items/TogglesModel;", "toggles", "Lcom/whoop/design/models/items/ConfirmationModalModel;", "confirmationModal", "customBehaviorsEmptyState", "customBehaviorsWidget", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/ConfirmationModalModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/ConfirmationModalModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "component6", "component7", "component8", "()Lcom/whoop/design/models/items/ConfirmationModalModel;", "component9", "()Lcom/whoop/design/models/DesignSystemModel;", "component10", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/ConfirmationModalModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getCategories", "getCurrentCategory", "getGroupedTogglesModels", "getGroupedTogglesModels$annotations", "()V", "getSearchTitle", "getButtonTitle", "getToggles", "Lcom/whoop/design/models/items/ConfirmationModalModel;", "getConfirmationModal", "Lcom/whoop/design/models/DesignSystemModel;", "getCustomBehaviorsEmptyState", "getCustomBehaviorsEmptyState$annotations", "getCustomBehaviorsWidget", "getCustomBehaviorsWidget$annotations", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CustomizeBottomSheetSelectorModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;

    @SerializedName("button_title")
    private final String buttonTitle;

    @SerializedName("categories")
    private final List<String> categories;

    @SerializedName("confirmation_modal")
    private final ConfirmationModalModel confirmationModal;

    @SerializedName("current_category")
    private final String currentCategory;

    @SerializedName("custom_behaviors_empty_state")
    private final DesignSystemModel customBehaviorsEmptyState;

    @SerializedName("custom_behaviors_widget")
    private final DesignSystemModel customBehaviorsWidget;

    @SerializedName("grouped_toggles")
    private final List<GroupedTogglesModel> groupedTogglesModels;

    @SerializedName("search_title")
    private final String searchTitle;

    @SerializedName("title")
    private final String title;

    @SerializedName("toggles")
    private final List<TogglesModel> toggles;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CustomizeBottomSheetSelectorModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C36955b(27)), null, AbstractC30060g.m92087G(enumC23463i, new C36955b(28)), null, null, AbstractC30060g.m92087G(enumC23463i, new C36955b(29)), null, AbstractC30060g.m92087G(enumC23463i, new C36956c(0)), AbstractC30060g.m92087G(enumC23463i, new C36956c(1))};
    }

    public /* synthetic */ CustomizeBottomSheetSelectorModel(int i13, String str, List list, String str2, List list2, String str3, String str4, List list3, ConfirmationModalModel confirmationModalModel, DesignSystemModel designSystemModel, DesignSystemModel designSystemModel2, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, CustomizeBottomSheetSelectorModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.categories = list;
        this.currentCategory = str2;
        this.groupedTogglesModels = list2;
        this.searchTitle = str3;
        this.buttonTitle = str4;
        this.toggles = list3;
        this.confirmationModal = confirmationModalModel;
        if ((i13 & 256) == 0) {
            this.customBehaviorsEmptyState = null;
        } else {
            this.customBehaviorsEmptyState = designSystemModel;
        }
        if ((i13 & 512) == 0) {
            this.customBehaviorsWidget = null;
        } else {
            this.customBehaviorsWidget = designSystemModel2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(GroupedTogglesModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(TogglesModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$2() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$3() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomizeBottomSheetSelectorModel copy$default(CustomizeBottomSheetSelectorModel customizeBottomSheetSelectorModel, String str, List list, String str2, List list2, String str3, String str4, List list3, ConfirmationModalModel confirmationModalModel, DesignSystemModel designSystemModel, DesignSystemModel designSystemModel2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = customizeBottomSheetSelectorModel.title;
        }
        if ((i13 & 2) != 0) {
            list = customizeBottomSheetSelectorModel.categories;
        }
        if ((i13 & 4) != 0) {
            str2 = customizeBottomSheetSelectorModel.currentCategory;
        }
        if ((i13 & 8) != 0) {
            list2 = customizeBottomSheetSelectorModel.groupedTogglesModels;
        }
        if ((i13 & 16) != 0) {
            str3 = customizeBottomSheetSelectorModel.searchTitle;
        }
        if ((i13 & 32) != 0) {
            str4 = customizeBottomSheetSelectorModel.buttonTitle;
        }
        if ((i13 & 64) != 0) {
            list3 = customizeBottomSheetSelectorModel.toggles;
        }
        if ((i13 & 128) != 0) {
            confirmationModalModel = customizeBottomSheetSelectorModel.confirmationModal;
        }
        if ((i13 & 256) != 0) {
            designSystemModel = customizeBottomSheetSelectorModel.customBehaviorsEmptyState;
        }
        if ((i13 & 512) != 0) {
            designSystemModel2 = customizeBottomSheetSelectorModel.customBehaviorsWidget;
        }
        DesignSystemModel designSystemModel3 = designSystemModel;
        DesignSystemModel designSystemModel4 = designSystemModel2;
        List list4 = list3;
        ConfirmationModalModel confirmationModalModel2 = confirmationModalModel;
        String str5 = str3;
        String str6 = str4;
        return customizeBottomSheetSelectorModel.copy(str, list, str2, list2, str5, str6, list4, confirmationModalModel2, designSystemModel3, designSystemModel4);
    }

    public static /* synthetic */ void getCustomBehaviorsEmptyState$annotations() {
    }

    public static /* synthetic */ void getCustomBehaviorsWidget$annotations() {
    }

    @InterfaceC37143h("grouped_toggles")
    public static /* synthetic */ void getGroupedTogglesModels$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(CustomizeBottomSheetSelectorModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.categories);
        output.encodeStringElement(serialDesc, 2, self.currentCategory);
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.groupedTogglesModels);
        output.encodeStringElement(serialDesc, 4, self.searchTitle);
        output.encodeStringElement(serialDesc, 5, self.buttonTitle);
        output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.toggles);
        output.encodeNullableSerializableElement(serialDesc, 7, ConfirmationModalModel$$serializer.INSTANCE, self.confirmationModal);
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.customBehaviorsEmptyState != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.customBehaviorsEmptyState);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 9) && self.customBehaviorsWidget == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.customBehaviorsWidget);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final DesignSystemModel getCustomBehaviorsWidget() {
        return this.customBehaviorsWidget;
    }

    public final List<String> component2() {
        return this.categories;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrentCategory() {
        return this.currentCategory;
    }

    public final List<GroupedTogglesModel> component4() {
        return this.groupedTogglesModels;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSearchTitle() {
        return this.searchTitle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    public final List<TogglesModel> component7() {
        return this.toggles;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ConfirmationModalModel getConfirmationModal() {
        return this.confirmationModal;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final DesignSystemModel getCustomBehaviorsEmptyState() {
        return this.customBehaviorsEmptyState;
    }

    public final CustomizeBottomSheetSelectorModel copy(String title, List<String> categories, String currentCategory, List<GroupedTogglesModel> groupedTogglesModels, String searchTitle, String buttonTitle, List<TogglesModel> toggles, ConfirmationModalModel confirmationModal, DesignSystemModel customBehaviorsEmptyState, DesignSystemModel customBehaviorsWidget) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(categories, "categories");
        AbstractC22676k.m65750j(currentCategory, "currentCategory");
        AbstractC22676k.m65750j(searchTitle, "searchTitle");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        return new CustomizeBottomSheetSelectorModel(title, categories, currentCategory, groupedTogglesModels, searchTitle, buttonTitle, toggles, confirmationModal, customBehaviorsEmptyState, customBehaviorsWidget);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomizeBottomSheetSelectorModel)) {
            return false;
        }
        CustomizeBottomSheetSelectorModel customizeBottomSheetSelectorModel = (CustomizeBottomSheetSelectorModel) other;
        return AbstractC22676k.m65745e(this.title, customizeBottomSheetSelectorModel.title) && AbstractC22676k.m65745e(this.categories, customizeBottomSheetSelectorModel.categories) && AbstractC22676k.m65745e(this.currentCategory, customizeBottomSheetSelectorModel.currentCategory) && AbstractC22676k.m65745e(this.groupedTogglesModels, customizeBottomSheetSelectorModel.groupedTogglesModels) && AbstractC22676k.m65745e(this.searchTitle, customizeBottomSheetSelectorModel.searchTitle) && AbstractC22676k.m65745e(this.buttonTitle, customizeBottomSheetSelectorModel.buttonTitle) && AbstractC22676k.m65745e(this.toggles, customizeBottomSheetSelectorModel.toggles) && AbstractC22676k.m65745e(this.confirmationModal, customizeBottomSheetSelectorModel.confirmationModal) && AbstractC22676k.m65745e(this.customBehaviorsEmptyState, customizeBottomSheetSelectorModel.customBehaviorsEmptyState) && AbstractC22676k.m65745e(this.customBehaviorsWidget, customizeBottomSheetSelectorModel.customBehaviorsWidget);
    }

    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    public final List<String> getCategories() {
        return this.categories;
    }

    public final ConfirmationModalModel getConfirmationModal() {
        return this.confirmationModal;
    }

    public final String getCurrentCategory() {
        return this.currentCategory;
    }

    public final DesignSystemModel getCustomBehaviorsEmptyState() {
        return this.customBehaviorsEmptyState;
    }

    public final DesignSystemModel getCustomBehaviorsWidget() {
        return this.customBehaviorsWidget;
    }

    public final List<GroupedTogglesModel> getGroupedTogglesModels() {
        return this.groupedTogglesModels;
    }

    public final String getSearchTitle() {
        return this.searchTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<TogglesModel> getToggles() {
        return this.toggles;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11895b.m31983b(this.title.hashCode() * 31, 31, this.categories), 31, this.currentCategory);
        List<GroupedTogglesModel> list = this.groupedTogglesModels;
        int iM30450d2 = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM30450d + (list == null ? 0 : list.hashCode())) * 31, 31, this.searchTitle), 31, this.buttonTitle);
        List<TogglesModel> list2 = this.toggles;
        int iHashCode = (iM30450d2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ConfirmationModalModel confirmationModalModel = this.confirmationModal;
        int iHashCode2 = (iHashCode + (confirmationModalModel == null ? 0 : confirmationModalModel.hashCode())) * 31;
        DesignSystemModel designSystemModel = this.customBehaviorsEmptyState;
        int iHashCode3 = (iHashCode2 + (designSystemModel == null ? 0 : designSystemModel.hashCode())) * 31;
        DesignSystemModel designSystemModel2 = this.customBehaviorsWidget;
        return iHashCode3 + (designSystemModel2 != null ? designSystemModel2.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        List<String> list = this.categories;
        String str2 = this.currentCategory;
        List<GroupedTogglesModel> list2 = this.groupedTogglesModels;
        String str3 = this.searchTitle;
        String str4 = this.buttonTitle;
        List<TogglesModel> list3 = this.toggles;
        ConfirmationModalModel confirmationModalModel = this.confirmationModal;
        DesignSystemModel designSystemModel = this.customBehaviorsEmptyState;
        DesignSystemModel designSystemModel2 = this.customBehaviorsWidget;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("CustomizeBottomSheetSelectorModel(title=", str, ", categories=", ", currentCategory=", list);
        AbstractC36095b.m114694v(str2, ", groupedTogglesModels=", ", searchTitle=", sbM94766o, list2);
        AbstractC11266d.m30444B(sbM94766o, str3, ", buttonTitle=", str4, ", toggles=");
        sbM94766o.append(list3);
        sbM94766o.append(", confirmationModal=");
        sbM94766o.append(confirmationModalModel);
        sbM94766o.append(", customBehaviorsEmptyState=");
        sbM94766o.append(designSystemModel);
        sbM94766o.append(", customBehaviorsWidget=");
        sbM94766o.append(designSystemModel2);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    public CustomizeBottomSheetSelectorModel(String title, List<String> categories, String currentCategory, List<GroupedTogglesModel> list, String searchTitle, String buttonTitle, List<TogglesModel> list2, ConfirmationModalModel confirmationModalModel, DesignSystemModel designSystemModel, DesignSystemModel designSystemModel2) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(categories, "categories");
        AbstractC22676k.m65750j(currentCategory, "currentCategory");
        AbstractC22676k.m65750j(searchTitle, "searchTitle");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        this.title = title;
        this.categories = categories;
        this.currentCategory = currentCategory;
        this.groupedTogglesModels = list;
        this.searchTitle = searchTitle;
        this.buttonTitle = buttonTitle;
        this.toggles = list2;
        this.confirmationModal = confirmationModalModel;
        this.customBehaviorsEmptyState = designSystemModel;
        this.customBehaviorsWidget = designSystemModel2;
    }

    public /* synthetic */ CustomizeBottomSheetSelectorModel(String str, List list, String str2, List list2, String str3, String str4, List list3, ConfirmationModalModel confirmationModalModel, DesignSystemModel designSystemModel, DesignSystemModel designSystemModel2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, str2, list2, str3, str4, list3, confirmationModalModel, (i13 & 256) != 0 ? null : designSystemModel, (i13 & 512) != 0 ? null : designSystemModel2);
    }
}
