package com.whoop.archv2.model.template;

import cb1.C4387a;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.ScreenAnalyticEventModel;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.FooterModel;
import com.whoop.design.models.items.FooterModel$$serializer;
import com.whoop.design.models.items.NavigationBarModel;
import com.whoop.design.models.items.NavigationBarModel$$serializer;
import com.whoop.design.models.modal.LifecycleInteractions;
import com.whoop.design.models.modal.LifecycleInteractions$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 \\2\u00020\u0001:\u0002]^B\u0085\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B\u0085\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0017\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b0\u00101J\u008e\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b4\u0010)J\u0010\u00105\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b5\u00106J\u001a\u0010:\u001a\u0002092\b\u00108\u001a\u0004\u0018\u000107HÖ\u0003¢\u0006\u0004\b:\u0010;J'\u0010D\u001a\u00020A2\u0006\u0010<\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0001¢\u0006\u0004\bB\u0010CR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010E\u001a\u0004\bF\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010G\u001a\u0004\bH\u0010!R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010I\u001a\u0004\bJ\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010K\u001a\u0004\bL\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010M\u001a\u0004\bN\u0010'R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010O\u0012\u0004\bQ\u0010R\u001a\u0004\bP\u0010)R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010S\u0012\u0004\bU\u0010R\u001a\u0004\bT\u0010+R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010V\u001a\u0004\bW\u0010-R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010X\u001a\u0004\bY\u0010/R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010Z\u001a\u0004\b[\u00101¨\u0006_"}, m65681d2 = {"Lcom/whoop/archv2/model/template/ListTemplate;", "Lcom/whoop/archv2/model/template/ScreenTemplate;", "Lcom/whoop/archv2/model/template/MetaData;", "screenMetadata", "Lcom/whoop/design/models/items/NavigationBarModel;", "navigationBar", "", "Lcom/whoop/design/models/DesignSystemModel;", "items", "Lcom/whoop/design/models/items/FooterModel;", "footer", "Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;", "backgroundTheme", "", "backgroundImageUrl", "Lcom/whoop/design/models/modal/LifecycleInteractions;", "lifecycleInteractions", "Lcom/whoop/archv2/model/template/ListPagination;", "pagination", "Lcom/whoop/archv2/model/template/PullToRefreshBehavior;", "pullToRefreshBehavior", "Lcom/whoop/archv2/model/template/TemplatePadding;", "padding", "<init>", "(Lcom/whoop/archv2/model/template/MetaData;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;Ljava/lang/String;Lcom/whoop/design/models/modal/LifecycleInteractions;Lcom/whoop/archv2/model/template/ListPagination;Lcom/whoop/archv2/model/template/PullToRefreshBehavior;Lcom/whoop/archv2/model/template/TemplatePadding;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/archv2/model/template/MetaData;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;Ljava/lang/String;Lcom/whoop/design/models/modal/LifecycleInteractions;Lcom/whoop/archv2/model/template/ListPagination;Lcom/whoop/archv2/model/template/PullToRefreshBehavior;Lcom/whoop/archv2/model/template/TemplatePadding;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/archv2/model/template/MetaData;", "component2", "()Lcom/whoop/design/models/items/NavigationBarModel;", "component3", "()Ljava/util/List;", "component4", "()Lcom/whoop/design/models/items/FooterModel;", "component5", "()Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;", "component6", "()Ljava/lang/String;", "component7", "()Lcom/whoop/design/models/modal/LifecycleInteractions;", "component8", "()Lcom/whoop/archv2/model/template/ListPagination;", "component9", "()Lcom/whoop/archv2/model/template/PullToRefreshBehavior;", "component10", "()Lcom/whoop/archv2/model/template/TemplatePadding;", "copy", "(Lcom/whoop/archv2/model/template/MetaData;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;Ljava/lang/String;Lcom/whoop/design/models/modal/LifecycleInteractions;Lcom/whoop/archv2/model/template/ListPagination;Lcom/whoop/archv2/model/template/PullToRefreshBehavior;Lcom/whoop/archv2/model/template/TemplatePadding;)Lcom/whoop/archv2/model/template/ListTemplate;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$arch_v2_release", "(Lcom/whoop/archv2/model/template/ListTemplate;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/archv2/model/template/MetaData;", "getScreenMetadata", "Lcom/whoop/design/models/items/NavigationBarModel;", "getNavigationBar", "Ljava/util/List;", "getItems", "Lcom/whoop/design/models/items/FooterModel;", "getFooter", "Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;", "getBackgroundTheme", "Ljava/lang/String;", "getBackgroundImageUrl", "getBackgroundImageUrl$annotations", "()V", "Lcom/whoop/design/models/modal/LifecycleInteractions;", "getLifecycleInteractions", "getLifecycleInteractions$annotations", "Lcom/whoop/archv2/model/template/ListPagination;", "getPagination", "Lcom/whoop/archv2/model/template/PullToRefreshBehavior;", "getPullToRefreshBehavior", "Lcom/whoop/archv2/model/template/TemplatePadding;", "getPadding", "Companion", "$serializer", "a", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ListTemplate implements ScreenTemplate {
    private static final InterfaceC23462h[] $childSerializers;
    private final String backgroundImageUrl;
    private final TemplateBackgroundTheme backgroundTheme;
    private final FooterModel footer;
    private final List<DesignSystemModel> items;
    private final LifecycleInteractions lifecycleInteractions;
    private final NavigationBarModel navigationBar;
    private final TemplatePadding padding;
    private final ListPagination pagination;
    private final PullToRefreshBehavior pullToRefreshBehavior;
    private final MetaData screenMetadata;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.archv2.model.template.ListTemplate$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/archv2/model/template/ListTemplate$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/archv2/model/template/ListTemplate;", "serializer", "()Lwc3/c;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ListTemplate$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C4387a(25)), null, AbstractC30060g.m92087G(enumC23463i, new C4387a(26)), null, null, null, null, null};
    }

    public ListTemplate() {
        this((MetaData) null, (NavigationBarModel) null, (List) null, (FooterModel) null, (TemplateBackgroundTheme) null, (String) null, (LifecycleInteractions) null, (ListPagination) null, (PullToRefreshBehavior) null, (TemplatePadding) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return TemplateBackgroundTheme.INSTANCE.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ListTemplate copy$default(ListTemplate listTemplate, MetaData metaData, NavigationBarModel navigationBarModel, List list, FooterModel footerModel, TemplateBackgroundTheme templateBackgroundTheme, String str, LifecycleInteractions lifecycleInteractions, ListPagination listPagination, PullToRefreshBehavior pullToRefreshBehavior, TemplatePadding templatePadding, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            metaData = listTemplate.screenMetadata;
        }
        if ((i13 & 2) != 0) {
            navigationBarModel = listTemplate.navigationBar;
        }
        if ((i13 & 4) != 0) {
            list = listTemplate.items;
        }
        if ((i13 & 8) != 0) {
            footerModel = listTemplate.footer;
        }
        if ((i13 & 16) != 0) {
            templateBackgroundTheme = listTemplate.backgroundTheme;
        }
        if ((i13 & 32) != 0) {
            str = listTemplate.backgroundImageUrl;
        }
        if ((i13 & 64) != 0) {
            lifecycleInteractions = listTemplate.lifecycleInteractions;
        }
        if ((i13 & 128) != 0) {
            listPagination = listTemplate.pagination;
        }
        if ((i13 & 256) != 0) {
            pullToRefreshBehavior = listTemplate.pullToRefreshBehavior;
        }
        if ((i13 & 512) != 0) {
            templatePadding = listTemplate.padding;
        }
        PullToRefreshBehavior pullToRefreshBehavior2 = pullToRefreshBehavior;
        TemplatePadding templatePadding2 = templatePadding;
        LifecycleInteractions lifecycleInteractions2 = lifecycleInteractions;
        ListPagination listPagination2 = listPagination;
        TemplateBackgroundTheme templateBackgroundTheme2 = templateBackgroundTheme;
        String str2 = str;
        return listTemplate.copy(metaData, navigationBarModel, list, footerModel, templateBackgroundTheme2, str2, lifecycleInteractions2, listPagination2, pullToRefreshBehavior2, templatePadding2);
    }

    @InterfaceC37143h("background_image_url")
    public static /* synthetic */ void getBackgroundImageUrl$annotations() {
    }

    @InterfaceC23457c
    public static /* synthetic */ void getLifecycleInteractions$annotations() {
    }

    public static final /* synthetic */ void write$Self$arch_v2_release(ListTemplate self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.screenMetadata != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, MetaData$$serializer.INSTANCE, self.screenMetadata);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.navigationBar != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, NavigationBarModel$$serializer.INSTANCE, self.navigationBar);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.items != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.items);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.footer != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, FooterModel$$serializer.INSTANCE, self.footer);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.backgroundTheme != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.backgroundTheme);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.backgroundImageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.backgroundImageUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.getLifecycleInteractions() != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, LifecycleInteractions$$serializer.INSTANCE, self.getLifecycleInteractions());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.pagination != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, ListPagination$$serializer.INSTANCE, self.pagination);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.pullToRefreshBehavior != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, PullToRefreshBehavior$$serializer.INSTANCE, self.pullToRefreshBehavior);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 9) && self.padding == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 9, TemplatePadding$$serializer.INSTANCE, self.padding);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MetaData getScreenMetadata() {
        return this.screenMetadata;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final TemplatePadding getPadding() {
        return this.padding;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NavigationBarModel getNavigationBar() {
        return this.navigationBar;
    }

    public final List<DesignSystemModel> component3() {
        return this.items;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final FooterModel getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TemplateBackgroundTheme getBackgroundTheme() {
        return this.backgroundTheme;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final LifecycleInteractions getLifecycleInteractions() {
        return this.lifecycleInteractions;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ListPagination getPagination() {
        return this.pagination;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final PullToRefreshBehavior getPullToRefreshBehavior() {
        return this.pullToRefreshBehavior;
    }

    public final ListTemplate copy(MetaData screenMetadata, NavigationBarModel navigationBar, List<? extends DesignSystemModel> items, FooterModel footer, TemplateBackgroundTheme backgroundTheme, String backgroundImageUrl, LifecycleInteractions lifecycleInteractions, ListPagination pagination, PullToRefreshBehavior pullToRefreshBehavior, TemplatePadding padding) {
        return new ListTemplate(screenMetadata, navigationBar, items, footer, backgroundTheme, backgroundImageUrl, lifecycleInteractions, pagination, pullToRefreshBehavior, padding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListTemplate)) {
            return false;
        }
        ListTemplate listTemplate = (ListTemplate) other;
        return AbstractC22676k.m65745e(this.screenMetadata, listTemplate.screenMetadata) && AbstractC22676k.m65745e(this.navigationBar, listTemplate.navigationBar) && AbstractC22676k.m65745e(this.items, listTemplate.items) && AbstractC22676k.m65745e(this.footer, listTemplate.footer) && this.backgroundTheme == listTemplate.backgroundTheme && AbstractC22676k.m65745e(this.backgroundImageUrl, listTemplate.backgroundImageUrl) && AbstractC22676k.m65745e(this.lifecycleInteractions, listTemplate.lifecycleInteractions) && AbstractC22676k.m65745e(this.pagination, listTemplate.pagination) && AbstractC22676k.m65745e(this.pullToRefreshBehavior, listTemplate.pullToRefreshBehavior) && AbstractC22676k.m65745e(this.padding, listTemplate.padding);
    }

    @Override // com.whoop.archv2.model.template.ScreenTemplate
    public /* bridge */ AnalyticEventModel failureAnalyticEvent(ScreenAnalyticEventModel screenAnalyticEventModel) {
        return super.failureAnalyticEvent(screenAnalyticEventModel);
    }

    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public final TemplateBackgroundTheme getBackgroundTheme() {
        return this.backgroundTheme;
    }

    public final FooterModel getFooter() {
        return this.footer;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    @Override // com.whoop.archv2.model.template.ScreenTemplate
    public LifecycleInteractions getLifecycleInteractions() {
        return this.lifecycleInteractions;
    }

    public final NavigationBarModel getNavigationBar() {
        return this.navigationBar;
    }

    public final TemplatePadding getPadding() {
        return this.padding;
    }

    public final ListPagination getPagination() {
        return this.pagination;
    }

    public final PullToRefreshBehavior getPullToRefreshBehavior() {
        return this.pullToRefreshBehavior;
    }

    public final MetaData getScreenMetadata() {
        return this.screenMetadata;
    }

    public int hashCode() {
        MetaData metaData = this.screenMetadata;
        int iHashCode = (metaData == null ? 0 : metaData.hashCode()) * 31;
        NavigationBarModel navigationBarModel = this.navigationBar;
        int iHashCode2 = (iHashCode + (navigationBarModel == null ? 0 : navigationBarModel.hashCode())) * 31;
        List<DesignSystemModel> list = this.items;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        FooterModel footerModel = this.footer;
        int iHashCode4 = (iHashCode3 + (footerModel == null ? 0 : footerModel.hashCode())) * 31;
        TemplateBackgroundTheme templateBackgroundTheme = this.backgroundTheme;
        int iHashCode5 = (iHashCode4 + (templateBackgroundTheme == null ? 0 : templateBackgroundTheme.hashCode())) * 31;
        String str = this.backgroundImageUrl;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        LifecycleInteractions lifecycleInteractions = this.lifecycleInteractions;
        int iHashCode7 = (iHashCode6 + (lifecycleInteractions == null ? 0 : lifecycleInteractions.hashCode())) * 31;
        ListPagination listPagination = this.pagination;
        int iHashCode8 = (iHashCode7 + (listPagination == null ? 0 : listPagination.hashCode())) * 31;
        PullToRefreshBehavior pullToRefreshBehavior = this.pullToRefreshBehavior;
        int iHashCode9 = (iHashCode8 + (pullToRefreshBehavior == null ? 0 : pullToRefreshBehavior.hashCode())) * 31;
        TemplatePadding templatePadding = this.padding;
        return iHashCode9 + (templatePadding != null ? templatePadding.hashCode() : 0);
    }

    public String toString() {
        return "ListTemplate(screenMetadata=" + this.screenMetadata + ", navigationBar=" + this.navigationBar + ", items=" + this.items + ", footer=" + this.footer + ", backgroundTheme=" + this.backgroundTheme + ", backgroundImageUrl=" + this.backgroundImageUrl + ", lifecycleInteractions=" + this.lifecycleInteractions + ", pagination=" + this.pagination + ", pullToRefreshBehavior=" + this.pullToRefreshBehavior + ", padding=" + this.padding + ")";
    }

    public /* synthetic */ ListTemplate(int i13, MetaData metaData, NavigationBarModel navigationBarModel, List list, FooterModel footerModel, TemplateBackgroundTheme templateBackgroundTheme, String str, LifecycleInteractions lifecycleInteractions, ListPagination listPagination, PullToRefreshBehavior pullToRefreshBehavior, TemplatePadding templatePadding, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.screenMetadata = null;
        } else {
            this.screenMetadata = metaData;
        }
        if ((i13 & 2) == 0) {
            this.navigationBar = null;
        } else {
            this.navigationBar = navigationBarModel;
        }
        if ((i13 & 4) == 0) {
            this.items = null;
        } else {
            this.items = list;
        }
        if ((i13 & 8) == 0) {
            this.footer = null;
        } else {
            this.footer = footerModel;
        }
        if ((i13 & 16) == 0) {
            this.backgroundTheme = null;
        } else {
            this.backgroundTheme = templateBackgroundTheme;
        }
        if ((i13 & 32) == 0) {
            this.backgroundImageUrl = null;
        } else {
            this.backgroundImageUrl = str;
        }
        if ((i13 & 64) == 0) {
            this.lifecycleInteractions = null;
        } else {
            this.lifecycleInteractions = lifecycleInteractions;
        }
        if ((i13 & 128) == 0) {
            this.pagination = null;
        } else {
            this.pagination = listPagination;
        }
        if ((i13 & 256) == 0) {
            this.pullToRefreshBehavior = null;
        } else {
            this.pullToRefreshBehavior = pullToRefreshBehavior;
        }
        if ((i13 & 512) == 0) {
            this.padding = null;
        } else {
            this.padding = templatePadding;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ListTemplate(MetaData metaData, NavigationBarModel navigationBarModel, List<? extends DesignSystemModel> list, FooterModel footerModel, TemplateBackgroundTheme templateBackgroundTheme, String str, LifecycleInteractions lifecycleInteractions, ListPagination listPagination, PullToRefreshBehavior pullToRefreshBehavior, TemplatePadding templatePadding) {
        this.screenMetadata = metaData;
        this.navigationBar = navigationBarModel;
        this.items = list;
        this.footer = footerModel;
        this.backgroundTheme = templateBackgroundTheme;
        this.backgroundImageUrl = str;
        this.lifecycleInteractions = lifecycleInteractions;
        this.pagination = listPagination;
        this.pullToRefreshBehavior = pullToRefreshBehavior;
        this.padding = templatePadding;
    }

    public /* synthetic */ ListTemplate(MetaData metaData, NavigationBarModel navigationBarModel, List list, FooterModel footerModel, TemplateBackgroundTheme templateBackgroundTheme, String str, LifecycleInteractions lifecycleInteractions, ListPagination listPagination, PullToRefreshBehavior pullToRefreshBehavior, TemplatePadding templatePadding, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : metaData, (i13 & 2) != 0 ? null : navigationBarModel, (i13 & 4) != 0 ? null : list, (i13 & 8) != 0 ? null : footerModel, (i13 & 16) != 0 ? null : templateBackgroundTheme, (i13 & 32) != 0 ? null : str, (i13 & 64) != 0 ? null : lifecycleInteractions, (i13 & 128) != 0 ? null : listPagination, (i13 & 256) != 0 ? null : pullToRefreshBehavior, (i13 & 512) != 0 ? null : templatePadding);
    }
}
