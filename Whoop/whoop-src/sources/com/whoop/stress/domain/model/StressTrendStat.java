package com.whoop.stress.domain.model;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih1.C18518b;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000278B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJH\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001aR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010)\u0012\u0004\b.\u0010,\u001a\u0004\b-\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b0\u0010,\u001a\u0004\b/\u0010\u001aR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00101\u0012\u0004\b3\u0010,\u001a\u0004\b2\u0010\u001eR\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010)\u0012\u0004\b5\u0010,\u001a\u0004\b4\u0010\u001a¨\u00069"}, m65681d2 = {"Lcom/whoop/stress/domain/model/StressTrendStat;", "", "", "statDisplay", "statChangeDisplay", "statTrend", "Lcom/whoop/stress/domain/model/StressTrendType;", "style", "statLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/stress/domain/model/StressTrendType;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/stress/domain/model/StressTrendType;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$stress_release", "(Lcom/whoop/stress/domain/model/StressTrendStat;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/stress/domain/model/StressTrendType;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/stress/domain/model/StressTrendType;Ljava/lang/String;)Lcom/whoop/stress/domain/model/StressTrendStat;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStatDisplay", "getStatDisplay$annotations", "()V", "getStatChangeDisplay", "getStatChangeDisplay$annotations", "getStatTrend", "getStatTrend$annotations", "Lcom/whoop/stress/domain/model/StressTrendType;", "getStyle", "getStyle$annotations", "getStatLabel", "getStatLabel$annotations", "Companion", "$serializer", "a", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StressTrendStat {
    public static final int $stable = 0;

    @SerializedName("stat_change_display")
    private final String statChangeDisplay;

    @SerializedName("stat_display")
    private final String statDisplay;

    @SerializedName("stat_label_display")
    private final String statLabel;

    @SerializedName("stat_trend")
    private final String statTrend;

    @SerializedName("style")
    private final StressTrendType style;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C18518b(19)), null};

    /* JADX INFO: renamed from: com.whoop.stress.domain.model.StressTrendStat$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/stress/domain/model/StressTrendStat$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/stress/domain/model/StressTrendStat;", "serializer", "()Lwc3/c;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StressTrendStat$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StressTrendStat(int i13, String str, String str2, String str3, StressTrendType stressTrendType, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, StressTrendStat$$serializer.INSTANCE.getDescriptor());
        }
        this.statDisplay = str;
        this.statChangeDisplay = str2;
        this.statTrend = str3;
        this.style = stressTrendType;
        this.statLabel = str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return StressTrendType.INSTANCE.serializer();
    }

    public static /* synthetic */ StressTrendStat copy$default(StressTrendStat stressTrendStat, String str, String str2, String str3, StressTrendType stressTrendType, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = stressTrendStat.statDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = stressTrendStat.statChangeDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = stressTrendStat.statTrend;
        }
        if ((i13 & 8) != 0) {
            stressTrendType = stressTrendStat.style;
        }
        if ((i13 & 16) != 0) {
            str4 = stressTrendStat.statLabel;
        }
        String str5 = str4;
        String str6 = str3;
        return stressTrendStat.copy(str, str2, str6, stressTrendType, str5);
    }

    @InterfaceC37143h("stat_change_display")
    public static /* synthetic */ void getStatChangeDisplay$annotations() {
    }

    @InterfaceC37143h("stat_display")
    public static /* synthetic */ void getStatDisplay$annotations() {
    }

    @InterfaceC37143h("stat_label_display")
    public static /* synthetic */ void getStatLabel$annotations() {
    }

    @InterfaceC37143h("stat_trend")
    public static /* synthetic */ void getStatTrend$annotations() {
    }

    @InterfaceC37143h("style")
    public static /* synthetic */ void getStyle$annotations() {
    }

    public static final /* synthetic */ void write$Self$stress_release(StressTrendStat self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.statDisplay);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.statChangeDisplay);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.statTrend);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.style);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.statLabel);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatDisplay() {
        return this.statDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatChangeDisplay() {
        return this.statChangeDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatTrend() {
        return this.statTrend;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final StressTrendType getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStatLabel() {
        return this.statLabel;
    }

    public final StressTrendStat copy(String statDisplay, String statChangeDisplay, String statTrend, StressTrendType style, String statLabel) {
        AbstractC22676k.m65750j(statDisplay, "statDisplay");
        AbstractC22676k.m65750j(style, "style");
        return new StressTrendStat(statDisplay, statChangeDisplay, statTrend, style, statLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StressTrendStat)) {
            return false;
        }
        StressTrendStat stressTrendStat = (StressTrendStat) other;
        return AbstractC22676k.m65745e(this.statDisplay, stressTrendStat.statDisplay) && AbstractC22676k.m65745e(this.statChangeDisplay, stressTrendStat.statChangeDisplay) && AbstractC22676k.m65745e(this.statTrend, stressTrendStat.statTrend) && this.style == stressTrendStat.style && AbstractC22676k.m65745e(this.statLabel, stressTrendStat.statLabel);
    }

    public final String getStatChangeDisplay() {
        return this.statChangeDisplay;
    }

    public final String getStatDisplay() {
        return this.statDisplay;
    }

    public final String getStatLabel() {
        return this.statLabel;
    }

    public final String getStatTrend() {
        return this.statTrend;
    }

    public final StressTrendType getStyle() {
        return this.style;
    }

    public int hashCode() {
        int iHashCode = this.statDisplay.hashCode() * 31;
        String str = this.statChangeDisplay;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.statTrend;
        int iHashCode3 = (this.style.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.statLabel;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.statDisplay;
        String str2 = this.statChangeDisplay;
        String str3 = this.statTrend;
        StressTrendType stressTrendType = this.style;
        String str4 = this.statLabel;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("StressTrendStat(statDisplay=", str, ", statChangeDisplay=", str2, ", statTrend=");
        sbM32001t.append(str3);
        sbM32001t.append(", style=");
        sbM32001t.append(stressTrendType);
        sbM32001t.append(", statLabel=");
        return AbstractC25012a.m73376i(str4, ")", sbM32001t);
    }

    public StressTrendStat(String statDisplay, String str, String str2, StressTrendType style, String str3) {
        AbstractC22676k.m65750j(statDisplay, "statDisplay");
        AbstractC22676k.m65750j(style, "style");
        this.statDisplay = statDisplay;
        this.statChangeDisplay = str;
        this.statTrend = str2;
        this.style = style;
        this.statLabel = str3;
    }
}
