package com.whoop.design.models.items;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBa\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJd\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b0\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b1\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b2\u0010\u001b¨\u00065"}, m65681d2 = {"Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;", "", "", "titleDisplay", "subtitleDisplay", "currentStatusDisplay", "currentStatusStyle", "descriptionDisplay", "rightAlignedDescription", "supertitleDisplay", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitleDisplay", "getSubtitleDisplay", "getCurrentStatusDisplay", "getCurrentStatusStyle", "getDescriptionDisplay", "getRightAlignedDescription", "getSupertitleDisplay", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DailyTickMarkHeaderModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String currentStatusDisplay;
    private final String currentStatusStyle;
    private final String descriptionDisplay;
    private final String rightAlignedDescription;
    private final String subtitleDisplay;
    private final String supertitleDisplay;
    private final String titleDisplay;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/DailyTickMarkHeaderModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DailyTickMarkHeaderModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DailyTickMarkHeaderModel(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, DailyTickMarkHeaderModel$$serializer.INSTANCE.getDescriptor());
        }
        this.titleDisplay = str;
        this.subtitleDisplay = str2;
        this.currentStatusDisplay = str3;
        this.currentStatusStyle = str4;
        this.descriptionDisplay = str5;
        this.rightAlignedDescription = str6;
        this.supertitleDisplay = str7;
    }

    public static /* synthetic */ DailyTickMarkHeaderModel copy$default(DailyTickMarkHeaderModel dailyTickMarkHeaderModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = dailyTickMarkHeaderModel.titleDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = dailyTickMarkHeaderModel.subtitleDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = dailyTickMarkHeaderModel.currentStatusDisplay;
        }
        if ((i13 & 8) != 0) {
            str4 = dailyTickMarkHeaderModel.currentStatusStyle;
        }
        if ((i13 & 16) != 0) {
            str5 = dailyTickMarkHeaderModel.descriptionDisplay;
        }
        if ((i13 & 32) != 0) {
            str6 = dailyTickMarkHeaderModel.rightAlignedDescription;
        }
        if ((i13 & 64) != 0) {
            str7 = dailyTickMarkHeaderModel.supertitleDisplay;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return dailyTickMarkHeaderModel.copy(str, str2, str11, str4, str10, str8, str9);
    }

    public static final /* synthetic */ void write$Self$design_models_release(DailyTickMarkHeaderModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.titleDisplay);
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.subtitleDisplay);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.currentStatusDisplay);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.currentStatusStyle);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.descriptionDisplay);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.rightAlignedDescription);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.supertitleDisplay);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitleDisplay() {
        return this.subtitleDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrentStatusDisplay() {
        return this.currentStatusDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrentStatusStyle() {
        return this.currentStatusStyle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRightAlignedDescription() {
        return this.rightAlignedDescription;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSupertitleDisplay() {
        return this.supertitleDisplay;
    }

    public final DailyTickMarkHeaderModel copy(String titleDisplay, String subtitleDisplay, String currentStatusDisplay, String currentStatusStyle, String descriptionDisplay, String rightAlignedDescription, String supertitleDisplay) {
        return new DailyTickMarkHeaderModel(titleDisplay, subtitleDisplay, currentStatusDisplay, currentStatusStyle, descriptionDisplay, rightAlignedDescription, supertitleDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyTickMarkHeaderModel)) {
            return false;
        }
        DailyTickMarkHeaderModel dailyTickMarkHeaderModel = (DailyTickMarkHeaderModel) other;
        return AbstractC22676k.m65745e(this.titleDisplay, dailyTickMarkHeaderModel.titleDisplay) && AbstractC22676k.m65745e(this.subtitleDisplay, dailyTickMarkHeaderModel.subtitleDisplay) && AbstractC22676k.m65745e(this.currentStatusDisplay, dailyTickMarkHeaderModel.currentStatusDisplay) && AbstractC22676k.m65745e(this.currentStatusStyle, dailyTickMarkHeaderModel.currentStatusStyle) && AbstractC22676k.m65745e(this.descriptionDisplay, dailyTickMarkHeaderModel.descriptionDisplay) && AbstractC22676k.m65745e(this.rightAlignedDescription, dailyTickMarkHeaderModel.rightAlignedDescription) && AbstractC22676k.m65745e(this.supertitleDisplay, dailyTickMarkHeaderModel.supertitleDisplay);
    }

    public final String getCurrentStatusDisplay() {
        return this.currentStatusDisplay;
    }

    public final String getCurrentStatusStyle() {
        return this.currentStatusStyle;
    }

    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    public final String getRightAlignedDescription() {
        return this.rightAlignedDescription;
    }

    public final String getSubtitleDisplay() {
        return this.subtitleDisplay;
    }

    public final String getSupertitleDisplay() {
        return this.supertitleDisplay;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        String str = this.titleDisplay;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitleDisplay;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currentStatusDisplay;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currentStatusStyle;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.descriptionDisplay;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.rightAlignedDescription;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.supertitleDisplay;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        String str = this.titleDisplay;
        String str2 = this.subtitleDisplay;
        String str3 = this.currentStatusDisplay;
        String str4 = this.currentStatusStyle;
        String str5 = this.descriptionDisplay;
        String str6 = this.rightAlignedDescription;
        String str7 = this.supertitleDisplay;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DailyTickMarkHeaderModel(titleDisplay=", str, ", subtitleDisplay=", str2, ", currentStatusDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", currentStatusStyle=", str4, ", descriptionDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", rightAlignedDescription=", str6, ", supertitleDisplay=");
        return AbstractC25012a.m73376i(str7, ")", sbM32001t);
    }

    public DailyTickMarkHeaderModel(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.titleDisplay = str;
        this.subtitleDisplay = str2;
        this.currentStatusDisplay = str3;
        this.currentStatusStyle = str4;
        this.descriptionDisplay = str5;
        this.rightAlignedDescription = str6;
        this.supertitleDisplay = str7;
    }
}
