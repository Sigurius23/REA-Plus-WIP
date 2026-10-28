package com.whoop.user.journey.model.yearinreview;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJR\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u001a¨\u00062"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/StatItemModel;", "", "", "title", "numericValue", "textValue", "subtext", "suffix", "subtextState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$user_journey_release", "(Lcom/whoop/user/journey/model/yearinreview/StatItemModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/user/journey/model/yearinreview/StatItemModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getNumericValue", "getTextValue", "getSubtext", "getSuffix", "getSubtextState", "Companion", "$serializer", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StatItemModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String numericValue;
    private final String subtext;
    private final String subtextState;
    private final String suffix;
    private final String textValue;
    private final String title;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/StatItemModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/user/journey/model/yearinreview/StatItemModel;", "serializer", "()Lwc3/c;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StatItemModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StatItemModel(int i13, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, StatItemModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.numericValue = str2;
        this.textValue = str3;
        this.subtext = str4;
        this.suffix = str5;
        this.subtextState = str6;
    }

    public static /* synthetic */ StatItemModel copy$default(StatItemModel statItemModel, String str, String str2, String str3, String str4, String str5, String str6, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = statItemModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = statItemModel.numericValue;
        }
        if ((i13 & 4) != 0) {
            str3 = statItemModel.textValue;
        }
        if ((i13 & 8) != 0) {
            str4 = statItemModel.subtext;
        }
        if ((i13 & 16) != 0) {
            str5 = statItemModel.suffix;
        }
        if ((i13 & 32) != 0) {
            str6 = statItemModel.subtextState;
        }
        String str7 = str5;
        String str8 = str6;
        return statItemModel.copy(str, str2, str3, str4, str7, str8);
    }

    public static final /* synthetic */ void write$Self$user_journey_release(StatItemModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.numericValue);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.textValue);
        output.encodeStringElement(serialDesc, 3, self.subtext);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.suffix);
        output.encodeStringElement(serialDesc, 5, self.subtextState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNumericValue() {
        return this.numericValue;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTextValue() {
        return this.textValue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubtext() {
        return this.subtext;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSuffix() {
        return this.suffix;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSubtextState() {
        return this.subtextState;
    }

    public final StatItemModel copy(String title, String numericValue, String textValue, String subtext, String suffix, String subtextState) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtext, "subtext");
        AbstractC22676k.m65750j(subtextState, "subtextState");
        return new StatItemModel(title, numericValue, textValue, subtext, suffix, subtextState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatItemModel)) {
            return false;
        }
        StatItemModel statItemModel = (StatItemModel) other;
        return AbstractC22676k.m65745e(this.title, statItemModel.title) && AbstractC22676k.m65745e(this.numericValue, statItemModel.numericValue) && AbstractC22676k.m65745e(this.textValue, statItemModel.textValue) && AbstractC22676k.m65745e(this.subtext, statItemModel.subtext) && AbstractC22676k.m65745e(this.suffix, statItemModel.suffix) && AbstractC22676k.m65745e(this.subtextState, statItemModel.subtextState);
    }

    public final String getNumericValue() {
        return this.numericValue;
    }

    public final String getSubtext() {
        return this.subtext;
    }

    public final String getSubtextState() {
        return this.subtextState;
    }

    public final String getSuffix() {
        return this.suffix;
    }

    public final String getTextValue() {
        return this.textValue;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.numericValue;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.textValue;
        int iM30450d = AbstractC11266d.m30450d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.subtext);
        String str3 = this.suffix;
        return this.subtextState.hashCode() + ((iM30450d + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.numericValue;
        String str3 = this.textValue;
        String str4 = this.subtext;
        String str5 = this.suffix;
        String str6 = this.subtextState;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("StatItemModel(title=", str, ", numericValue=", str2, ", textValue=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", subtext=", str4, ", suffix=");
        return AbstractC11266d.m30464r(sbM32001t, str5, ", subtextState=", str6, ")");
    }

    public StatItemModel(String title, String str, String str2, String subtext, String str3, String subtextState) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtext, "subtext");
        AbstractC22676k.m65750j(subtextState, "subtextState");
        this.title = title;
        this.numericValue = str;
        this.textValue = str2;
        this.subtext = subtext;
        this.suffix = str3;
        this.subtextState = subtextState;
    }
}
