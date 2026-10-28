package com.whoop.design.models.items;

import androidx.core.app.FrameMetricsAggregator;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gz0.EnumC16313m0;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36961h;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0002JIBy\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013B{\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001aJ\u0082\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001aJ\u0010\u0010+\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100J'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b7\u00108R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b<\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010=\u001a\u0004\b>\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010?\u001a\u0004\b@\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010?\u001a\u0004\bA\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010B\u001a\u0004\bC\u0010\"R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010D\u001a\u0004\bE\u0010$R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010F\u001a\u0004\bG\u0010&R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\bH\u0010\u001a¨\u0006K"}, m65681d2 = {"Lcom/whoop/design/models/items/NavigationBarModel;", "", "", "title", "subtitle", "Lgz0/m0;", "icon", "Lcom/whoop/design/models/items/NavigationButtonModel;", "leftButton", "rightButton", "Lcom/whoop/design/models/items/NavigationBarStyle;", "style", "", "Lcom/whoop/design/models/DesignSystemModel;", "fixedHeader", "Lcom/whoop/design/models/items/NavigationBarFixedHeader;", "header", "tag", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/design/models/items/NavigationButtonModel;Lcom/whoop/design/models/items/NavigationButtonModel;Lcom/whoop/design/models/items/NavigationBarStyle;Ljava/util/List;Lcom/whoop/design/models/items/NavigationBarFixedHeader;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/design/models/items/NavigationButtonModel;Lcom/whoop/design/models/items/NavigationButtonModel;Lcom/whoop/design/models/items/NavigationBarStyle;Ljava/util/List;Lcom/whoop/design/models/items/NavigationBarFixedHeader;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lgz0/m0;", "component4", "()Lcom/whoop/design/models/items/NavigationButtonModel;", "component5", "component6", "()Lcom/whoop/design/models/items/NavigationBarStyle;", "component7", "()Ljava/util/List;", "component8", "()Lcom/whoop/design/models/items/NavigationBarFixedHeader;", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/design/models/items/NavigationButtonModel;Lcom/whoop/design/models/items/NavigationButtonModel;Lcom/whoop/design/models/items/NavigationBarStyle;Ljava/util/List;Lcom/whoop/design/models/items/NavigationBarFixedHeader;Ljava/lang/String;)Lcom/whoop/design/models/items/NavigationBarModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/NavigationBarModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lgz0/m0;", "getIcon", "Lcom/whoop/design/models/items/NavigationButtonModel;", "getLeftButton", "getRightButton", "Lcom/whoop/design/models/items/NavigationBarStyle;", "getStyle", "Ljava/util/List;", "getFixedHeader", "Lcom/whoop/design/models/items/NavigationBarFixedHeader;", "getHeader", "getTag", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class NavigationBarModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<DesignSystemModel> fixedHeader;
    private final NavigationBarFixedHeader header;
    private final EnumC16313m0 icon;
    private final NavigationButtonModel leftButton;
    private final NavigationButtonModel rightButton;
    private final NavigationBarStyle style;
    private final String subtitle;
    private final String tag;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/NavigationBarModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/NavigationBarModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return NavigationBarModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C36961h(0)), null, null, AbstractC30060g.m92087G(enumC23463i, new C36961h(1)), AbstractC30060g.m92087G(enumC23463i, new C36961h(2)), null, null};
    }

    public NavigationBarModel() {
        this((String) null, (String) null, (EnumC16313m0) null, (NavigationButtonModel) null, (NavigationButtonModel) null, (NavigationBarStyle) null, (List) null, (NavigationBarFixedHeader) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.icon.WhoopIconMapper", EnumC16313m0.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return NavigationBarStyle.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NavigationBarModel copy$default(NavigationBarModel navigationBarModel, String str, String str2, EnumC16313m0 enumC16313m0, NavigationButtonModel navigationButtonModel, NavigationButtonModel navigationButtonModel2, NavigationBarStyle navigationBarStyle, List list, NavigationBarFixedHeader navigationBarFixedHeader, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = navigationBarModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = navigationBarModel.subtitle;
        }
        if ((i13 & 4) != 0) {
            enumC16313m0 = navigationBarModel.icon;
        }
        if ((i13 & 8) != 0) {
            navigationButtonModel = navigationBarModel.leftButton;
        }
        if ((i13 & 16) != 0) {
            navigationButtonModel2 = navigationBarModel.rightButton;
        }
        if ((i13 & 32) != 0) {
            navigationBarStyle = navigationBarModel.style;
        }
        if ((i13 & 64) != 0) {
            list = navigationBarModel.fixedHeader;
        }
        if ((i13 & 128) != 0) {
            navigationBarFixedHeader = navigationBarModel.header;
        }
        if ((i13 & 256) != 0) {
            str3 = navigationBarModel.tag;
        }
        NavigationBarFixedHeader navigationBarFixedHeader2 = navigationBarFixedHeader;
        String str4 = str3;
        NavigationBarStyle navigationBarStyle2 = navigationBarStyle;
        List list2 = list;
        NavigationButtonModel navigationButtonModel3 = navigationButtonModel2;
        EnumC16313m0 enumC16313m1 = enumC16313m0;
        return navigationBarModel.copy(str, str2, enumC16313m1, navigationButtonModel, navigationButtonModel3, navigationBarStyle2, list2, navigationBarFixedHeader2, str4);
    }

    public static final /* synthetic */ void write$Self$design_models_release(NavigationBarModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.subtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.icon != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.icon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.leftButton != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, NavigationButtonModel$$serializer.INSTANCE, self.leftButton);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.rightButton != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, NavigationButtonModel$$serializer.INSTANCE, self.rightButton);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.style != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.style);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.fixedHeader != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.fixedHeader);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.header != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, NavigationBarFixedHeader$$serializer.INSTANCE, self.header);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 8) && self.tag == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.tag);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final NavigationButtonModel getLeftButton() {
        return this.leftButton;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final NavigationButtonModel getRightButton() {
        return this.rightButton;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final NavigationBarStyle getStyle() {
        return this.style;
    }

    public final List<DesignSystemModel> component7() {
        return this.fixedHeader;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final NavigationBarFixedHeader getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    public final NavigationBarModel copy(String title, String subtitle, EnumC16313m0 icon, NavigationButtonModel leftButton, NavigationButtonModel rightButton, NavigationBarStyle style, List<? extends DesignSystemModel> fixedHeader, NavigationBarFixedHeader header, String tag) {
        return new NavigationBarModel(title, subtitle, icon, leftButton, rightButton, style, fixedHeader, header, tag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationBarModel)) {
            return false;
        }
        NavigationBarModel navigationBarModel = (NavigationBarModel) other;
        return AbstractC22676k.m65745e(this.title, navigationBarModel.title) && AbstractC22676k.m65745e(this.subtitle, navigationBarModel.subtitle) && this.icon == navigationBarModel.icon && AbstractC22676k.m65745e(this.leftButton, navigationBarModel.leftButton) && AbstractC22676k.m65745e(this.rightButton, navigationBarModel.rightButton) && this.style == navigationBarModel.style && AbstractC22676k.m65745e(this.fixedHeader, navigationBarModel.fixedHeader) && AbstractC22676k.m65745e(this.header, navigationBarModel.header) && AbstractC22676k.m65745e(this.tag, navigationBarModel.tag);
    }

    public final List<DesignSystemModel> getFixedHeader() {
        return this.fixedHeader;
    }

    public final NavigationBarFixedHeader getHeader() {
        return this.header;
    }

    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    public final NavigationButtonModel getLeftButton() {
        return this.leftButton;
    }

    public final NavigationButtonModel getRightButton() {
        return this.rightButton;
    }

    public final NavigationBarStyle getStyle() {
        return this.style;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.icon;
        int iHashCode3 = (iHashCode2 + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        NavigationButtonModel navigationButtonModel = this.leftButton;
        int iHashCode4 = (iHashCode3 + (navigationButtonModel == null ? 0 : navigationButtonModel.hashCode())) * 31;
        NavigationButtonModel navigationButtonModel2 = this.rightButton;
        int iHashCode5 = (iHashCode4 + (navigationButtonModel2 == null ? 0 : navigationButtonModel2.hashCode())) * 31;
        NavigationBarStyle navigationBarStyle = this.style;
        int iHashCode6 = (iHashCode5 + (navigationBarStyle == null ? 0 : navigationBarStyle.hashCode())) * 31;
        List<DesignSystemModel> list = this.fixedHeader;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        NavigationBarFixedHeader navigationBarFixedHeader = this.header;
        int iHashCode8 = (iHashCode7 + (navigationBarFixedHeader == null ? 0 : navigationBarFixedHeader.hashCode())) * 31;
        String str3 = this.tag;
        return iHashCode8 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        EnumC16313m0 enumC16313m0 = this.icon;
        NavigationButtonModel navigationButtonModel = this.leftButton;
        NavigationButtonModel navigationButtonModel2 = this.rightButton;
        NavigationBarStyle navigationBarStyle = this.style;
        List<DesignSystemModel> list = this.fixedHeader;
        NavigationBarFixedHeader navigationBarFixedHeader = this.header;
        String str3 = this.tag;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("NavigationBarModel(title=", str, ", subtitle=", str2, ", icon=");
        sbM32001t.append(enumC16313m0);
        sbM32001t.append(", leftButton=");
        sbM32001t.append(navigationButtonModel);
        sbM32001t.append(", rightButton=");
        sbM32001t.append(navigationButtonModel2);
        sbM32001t.append(", style=");
        sbM32001t.append(navigationBarStyle);
        sbM32001t.append(", fixedHeader=");
        sbM32001t.append(list);
        sbM32001t.append(", header=");
        sbM32001t.append(navigationBarFixedHeader);
        sbM32001t.append(", tag=");
        return AbstractC25012a.m73376i(str3, ")", sbM32001t);
    }

    public /* synthetic */ NavigationBarModel(int i13, String str, String str2, EnumC16313m0 enumC16313m0, NavigationButtonModel navigationButtonModel, NavigationButtonModel navigationButtonModel2, NavigationBarStyle navigationBarStyle, List list, NavigationBarFixedHeader navigationBarFixedHeader, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i13 & 2) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str2;
        }
        if ((i13 & 4) == 0) {
            this.icon = null;
        } else {
            this.icon = enumC16313m0;
        }
        if ((i13 & 8) == 0) {
            this.leftButton = null;
        } else {
            this.leftButton = navigationButtonModel;
        }
        if ((i13 & 16) == 0) {
            this.rightButton = null;
        } else {
            this.rightButton = navigationButtonModel2;
        }
        if ((i13 & 32) == 0) {
            this.style = null;
        } else {
            this.style = navigationBarStyle;
        }
        if ((i13 & 64) == 0) {
            this.fixedHeader = null;
        } else {
            this.fixedHeader = list;
        }
        if ((i13 & 128) == 0) {
            this.header = null;
        } else {
            this.header = navigationBarFixedHeader;
        }
        if ((i13 & 256) == 0) {
            this.tag = null;
        } else {
            this.tag = str3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NavigationBarModel(String str, String str2, EnumC16313m0 enumC16313m0, NavigationButtonModel navigationButtonModel, NavigationButtonModel navigationButtonModel2, NavigationBarStyle navigationBarStyle, List<? extends DesignSystemModel> list, NavigationBarFixedHeader navigationBarFixedHeader, String str3) {
        this.title = str;
        this.subtitle = str2;
        this.icon = enumC16313m0;
        this.leftButton = navigationButtonModel;
        this.rightButton = navigationButtonModel2;
        this.style = navigationBarStyle;
        this.fixedHeader = list;
        this.header = navigationBarFixedHeader;
        this.tag = str3;
    }

    public /* synthetic */ NavigationBarModel(String str, String str2, EnumC16313m0 enumC16313m0, NavigationButtonModel navigationButtonModel, NavigationButtonModel navigationButtonModel2, NavigationBarStyle navigationBarStyle, List list, NavigationBarFixedHeader navigationBarFixedHeader, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : enumC16313m0, (i13 & 8) != 0 ? null : navigationButtonModel, (i13 & 16) != 0 ? null : navigationButtonModel2, (i13 & 32) != 0 ? null : navigationBarStyle, (i13 & 64) != 0 ? null : list, (i13 & 128) != 0 ? null : navigationBarFixedHeader, (i13 & 256) != 0 ? null : str3);
    }
}
