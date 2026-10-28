package com.whoop.health.monitor.medical.domain.model;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import wi0.C37312d;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0081\b\u0018\u0000 C2\u00020\u0001:\u0002DCBo\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B\u007f\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0012\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b!\u0010\"Jx\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010\u0019J\u0010\u0010&\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,J'\u00105\u001a\u0002022\u0006\u0010-\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0001¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b:\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b;\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b<\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b=\u0010\u0019R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b>\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b?\u0010\u0019R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b@\u0010\u0019R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bB\u0010\"¨\u0006E"}, m65681d2 = {"Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "title", "", "subtitle", "suffixTitle", "suffixSubtitle", "suffixType", "leftIcon", "rightIcon", "menuItemState", "style", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "()Lcom/whoop/navigation/e;", "copy", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$kennel_release", "(Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/design/util/TextResource;", "getTitle", "Ljava/lang/String;", "getSubtitle", "getSuffixTitle", "getSuffixSubtitle", "getSuffixType", "getLeftIcon", "getRightIcon", "getMenuItemState", "getStyle", "Lcom/whoop/navigation/e;", "getDestination", "Companion", "$serializer", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ShepherdMenuItemModel implements DesignSystemModel {
    private final C9598e destination;
    private final String leftIcon;
    private final String menuItemState;
    private final String rightIcon;
    private final String style;
    private final String subtitle;
    private final String suffixSubtitle;
    private final String suffixTitle;
    private final String suffixType;
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d | TextResource.$stable;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C37312d(11))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;", "serializer", "()Lwc3/c;", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ShepherdMenuItemModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ShepherdMenuItemModel() {
        this((TextResource) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (C9598e) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ ShepherdMenuItemModel copy$default(ShepherdMenuItemModel shepherdMenuItemModel, TextResource textResource, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = shepherdMenuItemModel.title;
        }
        if ((i13 & 2) != 0) {
            str = shepherdMenuItemModel.subtitle;
        }
        if ((i13 & 4) != 0) {
            str2 = shepherdMenuItemModel.suffixTitle;
        }
        if ((i13 & 8) != 0) {
            str3 = shepherdMenuItemModel.suffixSubtitle;
        }
        if ((i13 & 16) != 0) {
            str4 = shepherdMenuItemModel.suffixType;
        }
        if ((i13 & 32) != 0) {
            str5 = shepherdMenuItemModel.leftIcon;
        }
        if ((i13 & 64) != 0) {
            str6 = shepherdMenuItemModel.rightIcon;
        }
        if ((i13 & 128) != 0) {
            str7 = shepherdMenuItemModel.menuItemState;
        }
        if ((i13 & 256) != 0) {
            str8 = shepherdMenuItemModel.style;
        }
        if ((i13 & 512) != 0) {
            c9598e = shepherdMenuItemModel.destination;
        }
        String str9 = str8;
        C9598e c9598e2 = c9598e;
        String str10 = str6;
        String str11 = str7;
        String str12 = str4;
        String str13 = str5;
        return shepherdMenuItemModel.copy(textResource, str, str2, str3, str12, str13, str10, str11, str9, c9598e2);
    }

    public static final /* synthetic */ void write$Self$kennel_release(ShepherdMenuItemModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.title, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 0, C25452a.f99689a, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.subtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.suffixTitle, "")) {
            output.encodeStringElement(serialDesc, 2, self.suffixTitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.suffixSubtitle, "")) {
            output.encodeStringElement(serialDesc, 3, self.suffixSubtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !AbstractC22676k.m65745e(self.suffixType, "")) {
            output.encodeStringElement(serialDesc, 4, self.suffixType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !AbstractC22676k.m65745e(self.leftIcon, "")) {
            output.encodeStringElement(serialDesc, 5, self.leftIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || !AbstractC22676k.m65745e(self.rightIcon, "")) {
            output.encodeStringElement(serialDesc, 6, self.rightIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || !AbstractC22676k.m65745e(self.menuItemState, "")) {
            output.encodeStringElement(serialDesc, 7, self.menuItemState);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || !AbstractC22676k.m65745e(self.style, "")) {
            output.encodeStringElement(serialDesc, 8, self.style);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 9) && self.destination == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
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
    public final String getSuffixType() {
        return this.suffixType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLeftIcon() {
        return this.leftIcon;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRightIcon() {
        return this.rightIcon;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMenuItemState() {
        return this.menuItemState;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    public final ShepherdMenuItemModel copy(TextResource title, String subtitle, String suffixTitle, String suffixSubtitle, String suffixType, String leftIcon, String rightIcon, String menuItemState, String style, C9598e destination) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(suffixTitle, "suffixTitle");
        AbstractC22676k.m65750j(suffixSubtitle, "suffixSubtitle");
        AbstractC22676k.m65750j(suffixType, "suffixType");
        AbstractC22676k.m65750j(leftIcon, "leftIcon");
        AbstractC22676k.m65750j(rightIcon, "rightIcon");
        AbstractC22676k.m65750j(menuItemState, "menuItemState");
        AbstractC22676k.m65750j(style, "style");
        return new ShepherdMenuItemModel(title, subtitle, suffixTitle, suffixSubtitle, suffixType, leftIcon, rightIcon, menuItemState, style, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShepherdMenuItemModel)) {
            return false;
        }
        ShepherdMenuItemModel shepherdMenuItemModel = (ShepherdMenuItemModel) other;
        return AbstractC22676k.m65745e(this.title, shepherdMenuItemModel.title) && AbstractC22676k.m65745e(this.subtitle, shepherdMenuItemModel.subtitle) && AbstractC22676k.m65745e(this.suffixTitle, shepherdMenuItemModel.suffixTitle) && AbstractC22676k.m65745e(this.suffixSubtitle, shepherdMenuItemModel.suffixSubtitle) && AbstractC22676k.m65745e(this.suffixType, shepherdMenuItemModel.suffixType) && AbstractC22676k.m65745e(this.leftIcon, shepherdMenuItemModel.leftIcon) && AbstractC22676k.m65745e(this.rightIcon, shepherdMenuItemModel.rightIcon) && AbstractC22676k.m65745e(this.menuItemState, shepherdMenuItemModel.menuItemState) && AbstractC22676k.m65745e(this.style, shepherdMenuItemModel.style) && AbstractC22676k.m65745e(this.destination, shepherdMenuItemModel.destination);
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getLeftIcon() {
        return this.leftIcon;
    }

    public final String getMenuItemState() {
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

    public final String getSuffixType() {
        return this.suffixType;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.suffixTitle), 31, this.suffixSubtitle), 31, this.suffixType), 31, this.leftIcon), 31, this.rightIcon), 31, this.menuItemState), 31, this.style);
        C9598e c9598e = this.destination;
        return iM30450d + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.title;
        String str = this.subtitle;
        String str2 = this.suffixTitle;
        String str3 = this.suffixSubtitle;
        String str4 = this.suffixType;
        String str5 = this.leftIcon;
        String str6 = this.rightIcon;
        String str7 = this.menuItemState;
        String str8 = this.style;
        C9598e c9598e = this.destination;
        StringBuilder sbM91845o = AbstractC30007c.m91845o("ShepherdMenuItemModel(title=", textResource, ", subtitle=", str, ", suffixTitle=");
        AbstractC11266d.m30444B(sbM91845o, str2, ", suffixSubtitle=", str3, ", suffixType=");
        AbstractC11266d.m30444B(sbM91845o, str4, ", leftIcon=", str5, ", rightIcon=");
        AbstractC11266d.m30444B(sbM91845o, str6, ", menuItemState=", str7, ", style=");
        return AbstractC13673n.m38563j(sbM91845o, str8, ", destination=", c9598e, ")");
    }

    public /* synthetic */ ShepherdMenuItemModel(int i13, TextResource textResource, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        this.title = (i13 & 1) == 0 ? AbstractC8693b.m21267a() : textResource;
        if ((i13 & 2) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str;
        }
        if ((i13 & 4) == 0) {
            this.suffixTitle = "";
        } else {
            this.suffixTitle = str2;
        }
        if ((i13 & 8) == 0) {
            this.suffixSubtitle = "";
        } else {
            this.suffixSubtitle = str3;
        }
        if ((i13 & 16) == 0) {
            this.suffixType = "";
        } else {
            this.suffixType = str4;
        }
        if ((i13 & 32) == 0) {
            this.leftIcon = "";
        } else {
            this.leftIcon = str5;
        }
        if ((i13 & 64) == 0) {
            this.rightIcon = "";
        } else {
            this.rightIcon = str6;
        }
        if ((i13 & 128) == 0) {
            this.menuItemState = "";
        } else {
            this.menuItemState = str7;
        }
        if ((i13 & 256) == 0) {
            this.style = "";
        } else {
            this.style = str8;
        }
        if ((i13 & 512) == 0) {
            this.destination = null;
        } else {
            this.destination = c9598e;
        }
    }

    public ShepherdMenuItemModel(TextResource title, String str, String suffixTitle, String suffixSubtitle, String suffixType, String leftIcon, String rightIcon, String menuItemState, String style, C9598e c9598e) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(suffixTitle, "suffixTitle");
        AbstractC22676k.m65750j(suffixSubtitle, "suffixSubtitle");
        AbstractC22676k.m65750j(suffixType, "suffixType");
        AbstractC22676k.m65750j(leftIcon, "leftIcon");
        AbstractC22676k.m65750j(rightIcon, "rightIcon");
        AbstractC22676k.m65750j(menuItemState, "menuItemState");
        AbstractC22676k.m65750j(style, "style");
        this.title = title;
        this.subtitle = str;
        this.suffixTitle = suffixTitle;
        this.suffixSubtitle = suffixSubtitle;
        this.suffixType = suffixType;
        this.leftIcon = leftIcon;
        this.rightIcon = rightIcon;
        this.menuItemState = menuItemState;
        this.style = style;
        this.destination = c9598e;
    }

    public /* synthetic */ ShepherdMenuItemModel(TextResource textResource, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? "" : str2, (i13 & 8) != 0 ? "" : str3, (i13 & 16) != 0 ? "" : str4, (i13 & 32) != 0 ? "" : str5, (i13 & 64) != 0 ? "" : str6, (i13 & 128) != 0 ? "" : str7, (i13 & 256) != 0 ? "" : str8, (i13 & 512) != 0 ? null : c9598e);
    }
}
