package com.whoop.hormonalinsights.pregnancyinsights.domain.models;

import com.whoop.design.models.items.DateSelectorModel;
import com.whoop.design.models.items.DateSelectorModel$$serializer;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%JZ\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b3\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u0010\"R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b6\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010%¨\u0006;"}, m65681d2 = {"Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;", "", "", "title", "currentWeek", "trimesterDisplay", "weeksRemainingDisplay", "Lcom/whoop/design/models/items/DateSelectorModel;", "datePicker", "pregnancyIcon", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsHeaderButton;", "haveYouDelivered", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DateSelectorModel;Ljava/lang/String;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsHeaderButton;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DateSelectorModel;Ljava/lang/String;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsHeaderButton;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/whoop/design/models/items/DateSelectorModel;", "component6", "component7", "()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsHeaderButton;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DateSelectorModel;Ljava/lang/String;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsHeaderButton;)Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getCurrentWeek", "getTrimesterDisplay", "getWeeksRemainingDisplay", "Lcom/whoop/design/models/items/DateSelectorModel;", "getDatePicker", "getPregnancyIcon", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsHeaderButton;", "getHaveYouDelivered", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PregnancyHeader {
    private final String currentWeek;
    private final DateSelectorModel datePicker;
    private final PregnancyInsightsHeaderButton haveYouDelivered;
    private final String pregnancyIcon;
    private final String title;
    private final String trimesterDisplay;
    private final String weeksRemainingDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d | DateSelectorModel.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PregnancyHeader$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PregnancyHeader(int i13, String str, String str2, String str3, String str4, DateSelectorModel dateSelectorModel, String str5, PregnancyInsightsHeaderButton pregnancyInsightsHeaderButton, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, PregnancyHeader$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.currentWeek = str2;
        this.trimesterDisplay = str3;
        this.weeksRemainingDisplay = str4;
        this.datePicker = dateSelectorModel;
        this.pregnancyIcon = str5;
        this.haveYouDelivered = pregnancyInsightsHeaderButton;
    }

    public static /* synthetic */ PregnancyHeader copy$default(PregnancyHeader pregnancyHeader, String str, String str2, String str3, String str4, DateSelectorModel dateSelectorModel, String str5, PregnancyInsightsHeaderButton pregnancyInsightsHeaderButton, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = pregnancyHeader.title;
        }
        if ((i13 & 2) != 0) {
            str2 = pregnancyHeader.currentWeek;
        }
        if ((i13 & 4) != 0) {
            str3 = pregnancyHeader.trimesterDisplay;
        }
        if ((i13 & 8) != 0) {
            str4 = pregnancyHeader.weeksRemainingDisplay;
        }
        if ((i13 & 16) != 0) {
            dateSelectorModel = pregnancyHeader.datePicker;
        }
        if ((i13 & 32) != 0) {
            str5 = pregnancyHeader.pregnancyIcon;
        }
        if ((i13 & 64) != 0) {
            pregnancyInsightsHeaderButton = pregnancyHeader.haveYouDelivered;
        }
        String str6 = str5;
        PregnancyInsightsHeaderButton pregnancyInsightsHeaderButton2 = pregnancyInsightsHeaderButton;
        DateSelectorModel dateSelectorModel2 = dateSelectorModel;
        String str7 = str3;
        return pregnancyHeader.copy(str, str2, str7, str4, dateSelectorModel2, str6, pregnancyInsightsHeaderButton2);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(PregnancyHeader self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.currentWeek);
        output.encodeStringElement(serialDesc, 2, self.trimesterDisplay);
        output.encodeStringElement(serialDesc, 3, self.weeksRemainingDisplay);
        output.encodeNullableSerializableElement(serialDesc, 4, DateSelectorModel$$serializer.INSTANCE, self.datePicker);
        output.encodeStringElement(serialDesc, 5, self.pregnancyIcon);
        output.encodeNullableSerializableElement(serialDesc, 6, PregnancyInsightsHeaderButton$$serializer.INSTANCE, self.haveYouDelivered);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrentWeek() {
        return this.currentWeek;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTrimesterDisplay() {
        return this.trimesterDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getWeeksRemainingDisplay() {
        return this.weeksRemainingDisplay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DateSelectorModel getDatePicker() {
        return this.datePicker;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPregnancyIcon() {
        return this.pregnancyIcon;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final PregnancyInsightsHeaderButton getHaveYouDelivered() {
        return this.haveYouDelivered;
    }

    public final PregnancyHeader copy(String title, String currentWeek, String trimesterDisplay, String weeksRemainingDisplay, DateSelectorModel datePicker, String pregnancyIcon, PregnancyInsightsHeaderButton haveYouDelivered) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(currentWeek, "currentWeek");
        AbstractC22676k.m65750j(trimesterDisplay, "trimesterDisplay");
        AbstractC22676k.m65750j(weeksRemainingDisplay, "weeksRemainingDisplay");
        AbstractC22676k.m65750j(pregnancyIcon, "pregnancyIcon");
        return new PregnancyHeader(title, currentWeek, trimesterDisplay, weeksRemainingDisplay, datePicker, pregnancyIcon, haveYouDelivered);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PregnancyHeader)) {
            return false;
        }
        PregnancyHeader pregnancyHeader = (PregnancyHeader) other;
        return AbstractC22676k.m65745e(this.title, pregnancyHeader.title) && AbstractC22676k.m65745e(this.currentWeek, pregnancyHeader.currentWeek) && AbstractC22676k.m65745e(this.trimesterDisplay, pregnancyHeader.trimesterDisplay) && AbstractC22676k.m65745e(this.weeksRemainingDisplay, pregnancyHeader.weeksRemainingDisplay) && AbstractC22676k.m65745e(this.datePicker, pregnancyHeader.datePicker) && AbstractC22676k.m65745e(this.pregnancyIcon, pregnancyHeader.pregnancyIcon) && AbstractC22676k.m65745e(this.haveYouDelivered, pregnancyHeader.haveYouDelivered);
    }

    public final String getCurrentWeek() {
        return this.currentWeek;
    }

    public final DateSelectorModel getDatePicker() {
        return this.datePicker;
    }

    public final PregnancyInsightsHeaderButton getHaveYouDelivered() {
        return this.haveYouDelivered;
    }

    public final String getPregnancyIcon() {
        return this.pregnancyIcon;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTrimesterDisplay() {
        return this.trimesterDisplay;
    }

    public final String getWeeksRemainingDisplay() {
        return this.weeksRemainingDisplay;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.currentWeek), 31, this.trimesterDisplay), 31, this.weeksRemainingDisplay);
        DateSelectorModel dateSelectorModel = this.datePicker;
        int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (dateSelectorModel == null ? 0 : dateSelectorModel.hashCode())) * 31, 31, this.pregnancyIcon);
        PregnancyInsightsHeaderButton pregnancyInsightsHeaderButton = this.haveYouDelivered;
        return iM30450d2 + (pregnancyInsightsHeaderButton != null ? pregnancyInsightsHeaderButton.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.currentWeek;
        String str3 = this.trimesterDisplay;
        String str4 = this.weeksRemainingDisplay;
        DateSelectorModel dateSelectorModel = this.datePicker;
        String str5 = this.pregnancyIcon;
        PregnancyInsightsHeaderButton pregnancyInsightsHeaderButton = this.haveYouDelivered;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PregnancyHeader(title=", str, ", currentWeek=", str2, ", trimesterDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", weeksRemainingDisplay=", str4, ", datePicker=");
        sbM32001t.append(dateSelectorModel);
        sbM32001t.append(", pregnancyIcon=");
        sbM32001t.append(str5);
        sbM32001t.append(", haveYouDelivered=");
        sbM32001t.append(pregnancyInsightsHeaderButton);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public PregnancyHeader(String title, String currentWeek, String trimesterDisplay, String weeksRemainingDisplay, DateSelectorModel dateSelectorModel, String pregnancyIcon, PregnancyInsightsHeaderButton pregnancyInsightsHeaderButton) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(currentWeek, "currentWeek");
        AbstractC22676k.m65750j(trimesterDisplay, "trimesterDisplay");
        AbstractC22676k.m65750j(weeksRemainingDisplay, "weeksRemainingDisplay");
        AbstractC22676k.m65750j(pregnancyIcon, "pregnancyIcon");
        this.title = title;
        this.currentWeek = currentWeek;
        this.trimesterDisplay = trimesterDisplay;
        this.weeksRemainingDisplay = weeksRemainingDisplay;
        this.datePicker = dateSelectorModel;
        this.pregnancyIcon = pregnancyIcon;
        this.haveYouDelivered = pregnancyInsightsHeaderButton;
    }
}
