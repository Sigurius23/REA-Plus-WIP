package com.whoop.hormonalinsights.settings.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B9\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJF\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u001f¨\u00061"}, m65681d2 = {"Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheetOption;", "", "", "icon", "titleDisplay", "descriptionDisplay", "value", "", "selected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheetOption;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheetOption;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "getTitleDisplay", "getDescriptionDisplay", "getValue", "Z", "getSelected", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HormonalInsightsBottomSheetOption {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String descriptionDisplay;
    private final String icon;
    private final boolean selected;
    private final String titleDisplay;
    private final String value;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheetOption$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheetOption;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HormonalInsightsBottomSheetOption$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HormonalInsightsBottomSheetOption(int i13, String str, String str2, String str3, String str4, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (10 != (i13 & 10)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 10, HormonalInsightsBottomSheetOption$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.icon = null;
        } else {
            this.icon = str;
        }
        this.titleDisplay = str2;
        if ((i13 & 4) == 0) {
            this.descriptionDisplay = null;
        } else {
            this.descriptionDisplay = str3;
        }
        this.value = str4;
        if ((i13 & 16) == 0) {
            this.selected = false;
        } else {
            this.selected = z4;
        }
    }

    public static /* synthetic */ HormonalInsightsBottomSheetOption copy$default(HormonalInsightsBottomSheetOption hormonalInsightsBottomSheetOption, String str, String str2, String str3, String str4, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = hormonalInsightsBottomSheetOption.icon;
        }
        if ((i13 & 2) != 0) {
            str2 = hormonalInsightsBottomSheetOption.titleDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = hormonalInsightsBottomSheetOption.descriptionDisplay;
        }
        if ((i13 & 8) != 0) {
            str4 = hormonalInsightsBottomSheetOption.value;
        }
        if ((i13 & 16) != 0) {
            z4 = hormonalInsightsBottomSheetOption.selected;
        }
        boolean z13 = z4;
        String str5 = str3;
        return hormonalInsightsBottomSheetOption.copy(str, str2, str5, str4, z13);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(HormonalInsightsBottomSheetOption self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.icon != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.icon);
        }
        output.encodeStringElement(serialDesc, 1, self.titleDisplay);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.descriptionDisplay != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.descriptionDisplay);
        }
        output.encodeStringElement(serialDesc, 3, self.value);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.selected) {
            output.encodeBooleanElement(serialDesc, 4, self.selected);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    public final HormonalInsightsBottomSheetOption copy(String icon, String titleDisplay, String descriptionDisplay, String value, boolean selected) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(value, "value");
        return new HormonalInsightsBottomSheetOption(icon, titleDisplay, descriptionDisplay, value, selected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HormonalInsightsBottomSheetOption)) {
            return false;
        }
        HormonalInsightsBottomSheetOption hormonalInsightsBottomSheetOption = (HormonalInsightsBottomSheetOption) other;
        return AbstractC22676k.m65745e(this.icon, hormonalInsightsBottomSheetOption.icon) && AbstractC22676k.m65745e(this.titleDisplay, hormonalInsightsBottomSheetOption.titleDisplay) && AbstractC22676k.m65745e(this.descriptionDisplay, hormonalInsightsBottomSheetOption.descriptionDisplay) && AbstractC22676k.m65745e(this.value, hormonalInsightsBottomSheetOption.value) && this.selected == hormonalInsightsBottomSheetOption.selected;
    }

    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.icon;
        int iM30450d = AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.titleDisplay);
        String str2 = this.descriptionDisplay;
        return Boolean.hashCode(this.selected) + AbstractC11266d.m30450d((iM30450d + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.value);
    }

    public String toString() {
        String str = this.icon;
        String str2 = this.titleDisplay;
        String str3 = this.descriptionDisplay;
        String str4 = this.value;
        boolean z4 = this.selected;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HormonalInsightsBottomSheetOption(icon=", str, ", titleDisplay=", str2, ", descriptionDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", value=", str4, ", selected=");
        return AbstractC18489d0.m53372m(sbM32001t, z4, ")");
    }

    public HormonalInsightsBottomSheetOption(String str, String titleDisplay, String str2, String value, boolean z4) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(value, "value");
        this.icon = str;
        this.titleDisplay = titleDisplay;
        this.descriptionDisplay = str2;
        this.value = value;
        this.selected = z4;
    }

    public /* synthetic */ HormonalInsightsBottomSheetOption(String str, String str2, String str3, String str4, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, str2, (i13 & 4) != 0 ? null : str3, str4, (i13 & 16) != 0 ? false : z4);
    }
}
