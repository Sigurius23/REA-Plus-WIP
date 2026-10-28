package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rB_\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b%\u0010$J^\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020\u00052\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b4\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b5\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010$R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b8\u0010$¨\u0006;"}, m65681d2 = {"Lcom/whoop/design/models/items/CollapsableHeaderModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "subtitle", "", "subtitleStickOnScroll", "subtitleTypography", "backgroundUrl", "Lcom/whoop/design/models/items/HeaderIconConfig;", "endNavigationButton", "startNavigationButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/HeaderIconConfig;Lcom/whoop/design/models/items/HeaderIconConfig;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/HeaderIconConfig;Lcom/whoop/design/models/items/HeaderIconConfig;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/CollapsableHeaderModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "component6", "()Lcom/whoop/design/models/items/HeaderIconConfig;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/HeaderIconConfig;Lcom/whoop/design/models/items/HeaderIconConfig;)Lcom/whoop/design/models/items/CollapsableHeaderModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "Z", "getSubtitleStickOnScroll", "getSubtitleTypography", "getBackgroundUrl", "Lcom/whoop/design/models/items/HeaderIconConfig;", "getEndNavigationButton", "getStartNavigationButton", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CollapsableHeaderModel implements DesignSystemModel {
    private final String backgroundUrl;
    private final HeaderIconConfig endNavigationButton;
    private final HeaderIconConfig startNavigationButton;
    private final String subtitle;
    private final boolean subtitleStickOnScroll;
    private final String subtitleTypography;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericInteraction.$stable;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/CollapsableHeaderModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/CollapsableHeaderModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CollapsableHeaderModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public CollapsableHeaderModel() {
        this((String) null, (String) null, false, (String) null, (String) null, (HeaderIconConfig) null, (HeaderIconConfig) null, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CollapsableHeaderModel copy$default(CollapsableHeaderModel collapsableHeaderModel, String str, String str2, boolean z4, String str3, String str4, HeaderIconConfig headerIconConfig, HeaderIconConfig headerIconConfig2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = collapsableHeaderModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = collapsableHeaderModel.subtitle;
        }
        if ((i13 & 4) != 0) {
            z4 = collapsableHeaderModel.subtitleStickOnScroll;
        }
        if ((i13 & 8) != 0) {
            str3 = collapsableHeaderModel.subtitleTypography;
        }
        if ((i13 & 16) != 0) {
            str4 = collapsableHeaderModel.backgroundUrl;
        }
        if ((i13 & 32) != 0) {
            headerIconConfig = collapsableHeaderModel.endNavigationButton;
        }
        if ((i13 & 64) != 0) {
            headerIconConfig2 = collapsableHeaderModel.startNavigationButton;
        }
        HeaderIconConfig headerIconConfig3 = headerIconConfig;
        HeaderIconConfig headerIconConfig4 = headerIconConfig2;
        String str5 = str4;
        boolean z13 = z4;
        return collapsableHeaderModel.copy(str, str2, z13, str3, str5, headerIconConfig3, headerIconConfig4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void write$Self$design_models_release(CollapsableHeaderModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.title, "")) {
            output.encodeStringElement(serialDesc, 0, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.subtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.subtitleStickOnScroll) {
            output.encodeBooleanElement(serialDesc, 2, self.subtitleStickOnScroll);
        }
        int i13 = 3;
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.subtitleTypography != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.subtitleTypography);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.backgroundUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.backgroundUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.endNavigationButton != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, HeaderIconConfig$$serializer.INSTANCE, self.endNavigationButton);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && AbstractC22676k.m65745e(self.startNavigationButton, new HeaderIconConfig((String) null, (GenericInteraction) (0 == true ? 1 : 0), i13, (DefaultConstructorMarker) (0 == true ? 1 : 0)))) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 6, HeaderIconConfig$$serializer.INSTANCE, self.startNavigationButton);
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
    public final boolean getSubtitleStickOnScroll() {
        return this.subtitleStickOnScroll;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubtitleTypography() {
        return this.subtitleTypography;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final HeaderIconConfig getEndNavigationButton() {
        return this.endNavigationButton;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final HeaderIconConfig getStartNavigationButton() {
        return this.startNavigationButton;
    }

    public final CollapsableHeaderModel copy(String title, String subtitle, boolean subtitleStickOnScroll, String subtitleTypography, String backgroundUrl, HeaderIconConfig endNavigationButton, HeaderIconConfig startNavigationButton) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(startNavigationButton, "startNavigationButton");
        return new CollapsableHeaderModel(title, subtitle, subtitleStickOnScroll, subtitleTypography, backgroundUrl, endNavigationButton, startNavigationButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollapsableHeaderModel)) {
            return false;
        }
        CollapsableHeaderModel collapsableHeaderModel = (CollapsableHeaderModel) other;
        return AbstractC22676k.m65745e(this.title, collapsableHeaderModel.title) && AbstractC22676k.m65745e(this.subtitle, collapsableHeaderModel.subtitle) && this.subtitleStickOnScroll == collapsableHeaderModel.subtitleStickOnScroll && AbstractC22676k.m65745e(this.subtitleTypography, collapsableHeaderModel.subtitleTypography) && AbstractC22676k.m65745e(this.backgroundUrl, collapsableHeaderModel.backgroundUrl) && AbstractC22676k.m65745e(this.endNavigationButton, collapsableHeaderModel.endNavigationButton) && AbstractC22676k.m65745e(this.startNavigationButton, collapsableHeaderModel.startNavigationButton);
    }

    public final String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    public final HeaderIconConfig getEndNavigationButton() {
        return this.endNavigationButton;
    }

    public final HeaderIconConfig getStartNavigationButton() {
        return this.startNavigationButton;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final boolean getSubtitleStickOnScroll() {
        return this.subtitleStickOnScroll;
    }

    public final String getSubtitleTypography() {
        return this.subtitleTypography;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iM8289b = AbstractC2875y.m8289b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.subtitleStickOnScroll);
        String str2 = this.subtitleTypography;
        int iHashCode2 = (iM8289b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.backgroundUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        HeaderIconConfig headerIconConfig = this.endNavigationButton;
        return this.startNavigationButton.hashCode() + ((iHashCode3 + (headerIconConfig != null ? headerIconConfig.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        boolean z4 = this.subtitleStickOnScroll;
        String str3 = this.subtitleTypography;
        String str4 = this.backgroundUrl;
        HeaderIconConfig headerIconConfig = this.endNavigationButton;
        HeaderIconConfig headerIconConfig2 = this.startNavigationButton;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CollapsableHeaderModel(title=", str, ", subtitle=", str2, ", subtitleStickOnScroll=");
        AbstractC38963t7.m124391u(sbM32001t, z4, ", subtitleTypography=", str3, ", backgroundUrl=");
        sbM32001t.append(str4);
        sbM32001t.append(", endNavigationButton=");
        sbM32001t.append(headerIconConfig);
        sbM32001t.append(", startNavigationButton=");
        sbM32001t.append(headerIconConfig2);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ CollapsableHeaderModel(int i13, String str, String str2, boolean z4, String str3, String str4, HeaderIconConfig headerIconConfig, HeaderIconConfig headerIconConfig2, SerializationConstructorMarker serializationConstructorMarker) {
        this.title = (i13 & 1) == 0 ? "" : str;
        String str5 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if ((i13 & 2) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str2;
        }
        if ((i13 & 4) == 0) {
            this.subtitleStickOnScroll = false;
        } else {
            this.subtitleStickOnScroll = z4;
        }
        if ((i13 & 8) == 0) {
            this.subtitleTypography = null;
        } else {
            this.subtitleTypography = str3;
        }
        if ((i13 & 16) == 0) {
            this.backgroundUrl = null;
        } else {
            this.backgroundUrl = str4;
        }
        if ((i13 & 32) == 0) {
            this.endNavigationButton = null;
        } else {
            this.endNavigationButton = headerIconConfig;
        }
        if ((i13 & 64) == 0) {
            this.startNavigationButton = new HeaderIconConfig(str5, (GenericInteraction) (objArr2 == true ? 1 : 0), 3, (DefaultConstructorMarker) (objArr == true ? 1 : 0));
        } else {
            this.startNavigationButton = headerIconConfig2;
        }
    }

    public CollapsableHeaderModel(String title, String str, boolean z4, String str2, String str3, HeaderIconConfig headerIconConfig, HeaderIconConfig startNavigationButton) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(startNavigationButton, "startNavigationButton");
        this.title = title;
        this.subtitle = str;
        this.subtitleStickOnScroll = z4;
        this.subtitleTypography = str2;
        this.backgroundUrl = str3;
        this.endNavigationButton = headerIconConfig;
        this.startNavigationButton = startNavigationButton;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ CollapsableHeaderModel(String str, String str2, boolean z4, String str3, String str4, HeaderIconConfig headerIconConfig, HeaderIconConfig headerIconConfig2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : str4, (i13 & 32) != 0 ? null : headerIconConfig, (i13 & 64) != 0 ? new HeaderIconConfig((String) null, (GenericInteraction) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0)) : headerIconConfig2);
    }
}
