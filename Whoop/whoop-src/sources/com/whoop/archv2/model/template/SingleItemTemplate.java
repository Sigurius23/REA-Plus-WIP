package com.whoop.archv2.model.template;

import cj0.C4744f;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.ScreenAnalyticEventModel;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.FooterModel;
import com.whoop.design.models.items.FooterModel$$serializer;
import com.whoop.design.models.items.NavigationBarModel;
import com.whoop.design.models.items.NavigationBarModel$$serializer;
import com.whoop.design.models.modal.LifecycleInteractions;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
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
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 Z2\u00020\u0001:\u0002[\\Bw\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B\u007f\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b/\u00100J\u0080\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b3\u0010.J\u0010\u00104\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00109\u001a\u0002082\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b9\u0010:J'\u0010C\u001a\u00020@2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>H\u0001¢\u0006\u0004\bA\u0010BR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010D\u001a\u0004\bE\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010F\u001a\u0004\bG\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010H\u001a\u0004\bI\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010J\u001a\u0004\bK\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010L\u001a\u0004\bM\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010N\u001a\u0004\bO\u0010(R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010P\u001a\u0004\bQ\u0010*R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010R\u001a\u0004\bS\u0010,R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010T\u0012\u0004\bV\u0010W\u001a\u0004\bU\u0010.R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010X\u001a\u0004\bY\u00100¨\u0006]"}, m65681d2 = {"Lcom/whoop/archv2/model/template/SingleItemTemplate;", "Lcom/whoop/archv2/model/template/ScreenTemplate;", "Lcom/whoop/archv2/model/template/MetaData;", "screenMetadata", "Lcom/whoop/design/models/items/NavigationBarModel;", "navigationBar", "Lcom/whoop/design/models/DesignSystemModel;", "item", "Lcom/whoop/design/models/items/FooterModel;", "footer", "Lcom/whoop/archv2/model/template/HorizontalAlignment;", "horizontalAlignment", "Lcom/whoop/archv2/model/template/VerticalAlignment;", "verticalAlignment", "Lcom/whoop/archv2/model/template/FillMode;", "fillMode", "Lcom/whoop/archv2/model/template/TemplatePadding;", "padding", "", "backgroundImageUrl", "Lcom/whoop/archv2/model/template/BackgroundModel;", "background", "<init>", "(Lcom/whoop/archv2/model/template/MetaData;Lcom/whoop/design/models/items/NavigationBarModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/archv2/model/template/HorizontalAlignment;Lcom/whoop/archv2/model/template/VerticalAlignment;Lcom/whoop/archv2/model/template/FillMode;Lcom/whoop/archv2/model/template/TemplatePadding;Ljava/lang/String;Lcom/whoop/archv2/model/template/BackgroundModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/archv2/model/template/MetaData;Lcom/whoop/design/models/items/NavigationBarModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/archv2/model/template/HorizontalAlignment;Lcom/whoop/archv2/model/template/VerticalAlignment;Lcom/whoop/archv2/model/template/FillMode;Lcom/whoop/archv2/model/template/TemplatePadding;Ljava/lang/String;Lcom/whoop/archv2/model/template/BackgroundModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/archv2/model/template/MetaData;", "component2", "()Lcom/whoop/design/models/items/NavigationBarModel;", "component3", "()Lcom/whoop/design/models/DesignSystemModel;", "component4", "()Lcom/whoop/design/models/items/FooterModel;", "component5", "()Lcom/whoop/archv2/model/template/HorizontalAlignment;", "component6", "()Lcom/whoop/archv2/model/template/VerticalAlignment;", "component7", "()Lcom/whoop/archv2/model/template/FillMode;", "component8", "()Lcom/whoop/archv2/model/template/TemplatePadding;", "component9", "()Ljava/lang/String;", "component10", "()Lcom/whoop/archv2/model/template/BackgroundModel;", "copy", "(Lcom/whoop/archv2/model/template/MetaData;Lcom/whoop/design/models/items/NavigationBarModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/archv2/model/template/HorizontalAlignment;Lcom/whoop/archv2/model/template/VerticalAlignment;Lcom/whoop/archv2/model/template/FillMode;Lcom/whoop/archv2/model/template/TemplatePadding;Ljava/lang/String;Lcom/whoop/archv2/model/template/BackgroundModel;)Lcom/whoop/archv2/model/template/SingleItemTemplate;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$arch_v2_release", "(Lcom/whoop/archv2/model/template/SingleItemTemplate;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/archv2/model/template/MetaData;", "getScreenMetadata", "Lcom/whoop/design/models/items/NavigationBarModel;", "getNavigationBar", "Lcom/whoop/design/models/DesignSystemModel;", "getItem", "Lcom/whoop/design/models/items/FooterModel;", "getFooter", "Lcom/whoop/archv2/model/template/HorizontalAlignment;", "getHorizontalAlignment", "Lcom/whoop/archv2/model/template/VerticalAlignment;", "getVerticalAlignment", "Lcom/whoop/archv2/model/template/FillMode;", "getFillMode", "Lcom/whoop/archv2/model/template/TemplatePadding;", "getPadding", "Ljava/lang/String;", "getBackgroundImageUrl", "getBackgroundImageUrl$annotations", "()V", "Lcom/whoop/archv2/model/template/BackgroundModel;", "getBackground", "Companion", "$serializer", "a", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SingleItemTemplate implements ScreenTemplate {
    private static final InterfaceC23462h[] $childSerializers;
    private final BackgroundModel background;
    private final String backgroundImageUrl;
    private final FillMode fillMode;
    private final FooterModel footer;
    private final HorizontalAlignment horizontalAlignment;
    private final DesignSystemModel item;
    private final NavigationBarModel navigationBar;
    private final TemplatePadding padding;
    private final MetaData screenMetadata;
    private final VerticalAlignment verticalAlignment;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.archv2.model.template.SingleItemTemplate$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/archv2/model/template/SingleItemTemplate$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/archv2/model/template/SingleItemTemplate;", "serializer", "()Lwc3/c;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SingleItemTemplate$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C4744f(0)), null, AbstractC30060g.m92087G(enumC23463i, new C4744f(1)), AbstractC30060g.m92087G(enumC23463i, new C4744f(2)), AbstractC30060g.m92087G(enumC23463i, new C4744f(3)), null, null, null};
    }

    public SingleItemTemplate() {
        this((MetaData) null, (NavigationBarModel) null, (DesignSystemModel) null, (FooterModel) null, (HorizontalAlignment) null, (VerticalAlignment) null, (FillMode) null, (TemplatePadding) null, (String) null, (BackgroundModel) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return HorizontalAlignment.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return VerticalAlignment.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$2() {
        return FillMode.INSTANCE.serializer();
    }

    public static /* synthetic */ SingleItemTemplate copy$default(SingleItemTemplate singleItemTemplate, MetaData metaData, NavigationBarModel navigationBarModel, DesignSystemModel designSystemModel, FooterModel footerModel, HorizontalAlignment horizontalAlignment, VerticalAlignment verticalAlignment, FillMode fillMode, TemplatePadding templatePadding, String str, BackgroundModel backgroundModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            metaData = singleItemTemplate.screenMetadata;
        }
        if ((i13 & 2) != 0) {
            navigationBarModel = singleItemTemplate.navigationBar;
        }
        if ((i13 & 4) != 0) {
            designSystemModel = singleItemTemplate.item;
        }
        if ((i13 & 8) != 0) {
            footerModel = singleItemTemplate.footer;
        }
        if ((i13 & 16) != 0) {
            horizontalAlignment = singleItemTemplate.horizontalAlignment;
        }
        if ((i13 & 32) != 0) {
            verticalAlignment = singleItemTemplate.verticalAlignment;
        }
        if ((i13 & 64) != 0) {
            fillMode = singleItemTemplate.fillMode;
        }
        if ((i13 & 128) != 0) {
            templatePadding = singleItemTemplate.padding;
        }
        if ((i13 & 256) != 0) {
            str = singleItemTemplate.backgroundImageUrl;
        }
        if ((i13 & 512) != 0) {
            backgroundModel = singleItemTemplate.background;
        }
        String str2 = str;
        BackgroundModel backgroundModel2 = backgroundModel;
        FillMode fillMode2 = fillMode;
        TemplatePadding templatePadding2 = templatePadding;
        HorizontalAlignment horizontalAlignment2 = horizontalAlignment;
        VerticalAlignment verticalAlignment2 = verticalAlignment;
        return singleItemTemplate.copy(metaData, navigationBarModel, designSystemModel, footerModel, horizontalAlignment2, verticalAlignment2, fillMode2, templatePadding2, str2, backgroundModel2);
    }

    @InterfaceC23457c
    public static /* synthetic */ void getBackgroundImageUrl$annotations() {
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00c5  */
    public static final /* synthetic */ void write$Self$arch_v2_release(SingleItemTemplate self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.screenMetadata != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, MetaData$$serializer.INSTANCE, self.screenMetadata);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.navigationBar != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, NavigationBarModel$$serializer.INSTANCE, self.navigationBar);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.item != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.item);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.footer != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, FooterModel$$serializer.INSTANCE, self.footer);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.horizontalAlignment != HorizontalAlignment.CENTER) {
            output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.horizontalAlignment);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.verticalAlignment != VerticalAlignment.CENTER) {
            output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.verticalAlignment);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.fillMode != FillMode.FIT_CONTENT) {
            output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.fillMode);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7)) {
            output.encodeSerializableElement(serialDesc, 7, TemplatePadding$$serializer.INSTANCE, self.padding);
        } else {
            if (!AbstractC22676k.m65745e(self.padding, new TemplatePadding(0.0d, 0.0d, 0.0d, 0.0d, 15, (DefaultConstructorMarker) null))) {
                output.encodeSerializableElement(serialDesc, 7, TemplatePadding$$serializer.INSTANCE, self.padding);
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.backgroundImageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.backgroundImageUrl);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 9) && self.background == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 9, BackgroundModel$$serializer.INSTANCE, self.background);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MetaData getScreenMetadata() {
        return this.screenMetadata;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BackgroundModel getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NavigationBarModel getNavigationBar() {
        return this.navigationBar;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DesignSystemModel getItem() {
        return this.item;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final FooterModel getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final HorizontalAlignment getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final VerticalAlignment getVerticalAlignment() {
        return this.verticalAlignment;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final FillMode getFillMode() {
        return this.fillMode;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final TemplatePadding getPadding() {
        return this.padding;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public final SingleItemTemplate copy(MetaData screenMetadata, NavigationBarModel navigationBar, DesignSystemModel item, FooterModel footer, HorizontalAlignment horizontalAlignment, VerticalAlignment verticalAlignment, FillMode fillMode, TemplatePadding padding, String backgroundImageUrl, BackgroundModel background) {
        AbstractC22676k.m65750j(horizontalAlignment, "horizontalAlignment");
        AbstractC22676k.m65750j(verticalAlignment, "verticalAlignment");
        AbstractC22676k.m65750j(fillMode, "fillMode");
        AbstractC22676k.m65750j(padding, "padding");
        return new SingleItemTemplate(screenMetadata, navigationBar, item, footer, horizontalAlignment, verticalAlignment, fillMode, padding, backgroundImageUrl, background);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleItemTemplate)) {
            return false;
        }
        SingleItemTemplate singleItemTemplate = (SingleItemTemplate) other;
        return AbstractC22676k.m65745e(this.screenMetadata, singleItemTemplate.screenMetadata) && AbstractC22676k.m65745e(this.navigationBar, singleItemTemplate.navigationBar) && AbstractC22676k.m65745e(this.item, singleItemTemplate.item) && AbstractC22676k.m65745e(this.footer, singleItemTemplate.footer) && this.horizontalAlignment == singleItemTemplate.horizontalAlignment && this.verticalAlignment == singleItemTemplate.verticalAlignment && this.fillMode == singleItemTemplate.fillMode && AbstractC22676k.m65745e(this.padding, singleItemTemplate.padding) && AbstractC22676k.m65745e(this.backgroundImageUrl, singleItemTemplate.backgroundImageUrl) && AbstractC22676k.m65745e(this.background, singleItemTemplate.background);
    }

    @Override // com.whoop.archv2.model.template.ScreenTemplate
    public /* bridge */ AnalyticEventModel failureAnalyticEvent(ScreenAnalyticEventModel screenAnalyticEventModel) {
        return super.failureAnalyticEvent(screenAnalyticEventModel);
    }

    public final BackgroundModel getBackground() {
        return this.background;
    }

    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public final FillMode getFillMode() {
        return this.fillMode;
    }

    public final FooterModel getFooter() {
        return this.footer;
    }

    public final HorizontalAlignment getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    public final DesignSystemModel getItem() {
        return this.item;
    }

    @Override // com.whoop.archv2.model.template.ScreenTemplate
    public /* bridge */ LifecycleInteractions getLifecycleInteractions() {
        return super.getLifecycleInteractions();
    }

    public final NavigationBarModel getNavigationBar() {
        return this.navigationBar;
    }

    public final TemplatePadding getPadding() {
        return this.padding;
    }

    public final MetaData getScreenMetadata() {
        return this.screenMetadata;
    }

    public final VerticalAlignment getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public int hashCode() {
        MetaData metaData = this.screenMetadata;
        int iHashCode = (metaData == null ? 0 : metaData.hashCode()) * 31;
        NavigationBarModel navigationBarModel = this.navigationBar;
        int iHashCode2 = (iHashCode + (navigationBarModel == null ? 0 : navigationBarModel.hashCode())) * 31;
        DesignSystemModel designSystemModel = this.item;
        int iHashCode3 = (iHashCode2 + (designSystemModel == null ? 0 : designSystemModel.hashCode())) * 31;
        FooterModel footerModel = this.footer;
        int iHashCode4 = (this.padding.hashCode() + ((this.fillMode.hashCode() + ((this.verticalAlignment.hashCode() + ((this.horizontalAlignment.hashCode() + ((iHashCode3 + (footerModel == null ? 0 : footerModel.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.backgroundImageUrl;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        BackgroundModel backgroundModel = this.background;
        return iHashCode5 + (backgroundModel != null ? backgroundModel.hashCode() : 0);
    }

    public String toString() {
        return "SingleItemTemplate(screenMetadata=" + this.screenMetadata + ", navigationBar=" + this.navigationBar + ", item=" + this.item + ", footer=" + this.footer + ", horizontalAlignment=" + this.horizontalAlignment + ", verticalAlignment=" + this.verticalAlignment + ", fillMode=" + this.fillMode + ", padding=" + this.padding + ", backgroundImageUrl=" + this.backgroundImageUrl + ", background=" + this.background + ")";
    }

    public /* synthetic */ SingleItemTemplate(int i13, MetaData metaData, NavigationBarModel navigationBarModel, DesignSystemModel designSystemModel, FooterModel footerModel, HorizontalAlignment horizontalAlignment, VerticalAlignment verticalAlignment, FillMode fillMode, TemplatePadding templatePadding, String str, BackgroundModel backgroundModel, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.item = null;
        } else {
            this.item = designSystemModel;
        }
        if ((i13 & 8) == 0) {
            this.footer = null;
        } else {
            this.footer = footerModel;
        }
        this.horizontalAlignment = (i13 & 16) == 0 ? HorizontalAlignment.CENTER : horizontalAlignment;
        this.verticalAlignment = (i13 & 32) == 0 ? VerticalAlignment.CENTER : verticalAlignment;
        this.fillMode = (i13 & 64) == 0 ? FillMode.FIT_CONTENT : fillMode;
        if ((i13 & 128) == 0) {
            this.padding = new TemplatePadding(0.0d, 0.0d, 0.0d, 0.0d, 15, (DefaultConstructorMarker) null);
        } else {
            this.padding = templatePadding;
        }
        if ((i13 & 256) == 0) {
            this.backgroundImageUrl = null;
        } else {
            this.backgroundImageUrl = str;
        }
        if ((i13 & 512) == 0) {
            this.background = null;
        } else {
            this.background = backgroundModel;
        }
    }

    public SingleItemTemplate(MetaData metaData, NavigationBarModel navigationBarModel, DesignSystemModel designSystemModel, FooterModel footerModel, HorizontalAlignment horizontalAlignment, VerticalAlignment verticalAlignment, FillMode fillMode, TemplatePadding padding, String str, BackgroundModel backgroundModel) {
        AbstractC22676k.m65750j(horizontalAlignment, "horizontalAlignment");
        AbstractC22676k.m65750j(verticalAlignment, "verticalAlignment");
        AbstractC22676k.m65750j(fillMode, "fillMode");
        AbstractC22676k.m65750j(padding, "padding");
        this.screenMetadata = metaData;
        this.navigationBar = navigationBarModel;
        this.item = designSystemModel;
        this.footer = footerModel;
        this.horizontalAlignment = horizontalAlignment;
        this.verticalAlignment = verticalAlignment;
        this.fillMode = fillMode;
        this.padding = padding;
        this.backgroundImageUrl = str;
        this.background = backgroundModel;
    }

    public /* synthetic */ SingleItemTemplate(MetaData metaData, NavigationBarModel navigationBarModel, DesignSystemModel designSystemModel, FooterModel footerModel, HorizontalAlignment horizontalAlignment, VerticalAlignment verticalAlignment, FillMode fillMode, TemplatePadding templatePadding, String str, BackgroundModel backgroundModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : metaData, (i13 & 2) != 0 ? null : navigationBarModel, (i13 & 4) != 0 ? null : designSystemModel, (i13 & 8) != 0 ? null : footerModel, (i13 & 16) != 0 ? HorizontalAlignment.CENTER : horizontalAlignment, (i13 & 32) != 0 ? VerticalAlignment.CENTER : verticalAlignment, (i13 & 64) != 0 ? FillMode.FIT_CONTENT : fillMode, (i13 & 128) != 0 ? new TemplatePadding(0.0d, 0.0d, 0.0d, 0.0d, 15, (DefaultConstructorMarker) null) : templatePadding, (i13 & 256) != 0 ? null : str, (i13 & 512) != 0 ? null : backgroundModel);
    }
}
