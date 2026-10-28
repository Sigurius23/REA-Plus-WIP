package com.whoop.trends.data.model;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hy0.EnumC17727b2;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import wl2.C37358a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u0019R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b.\u0010*\u001a\u0004\b-\u0010\u0019R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010/\u0012\u0004\b1\u0010*\u001a\u0004\b0\u0010\u001d¨\u00064"}, m65681d2 = {"Lcom/whoop/trends/data/model/SegmentalAnalysisTrendStatModel;", "", "", "statPrimaryDisplay", "statPrimaryChangeDisplay", "statSecondaryDisplay", "Lhy0/b2;", "statTrend", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhy0/b2;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhy0/b2;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$trends_release", "(Lcom/whoop/trends/data/model/SegmentalAnalysisTrendStatModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lhy0/b2;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhy0/b2;)Lcom/whoop/trends/data/model/SegmentalAnalysisTrendStatModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStatPrimaryDisplay", "getStatPrimaryDisplay$annotations", "()V", "getStatPrimaryChangeDisplay", "getStatPrimaryChangeDisplay$annotations", "getStatSecondaryDisplay", "getStatSecondaryDisplay$annotations", "Lhy0/b2;", "getStatTrend", "getStatTrend$annotations", "Companion", "$serializer", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SegmentalAnalysisTrendStatModel {
    public static final int $stable = 0;

    @SerializedName("stat_primary_change_display")
    private final String statPrimaryChangeDisplay;

    @SerializedName("stat_primary_display")
    private final String statPrimaryDisplay;

    @SerializedName("stat_secondary_display")
    private final String statSecondaryDisplay;

    @SerializedName("stat_trend")
    private final EnumC17727b2 statTrend;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C37358a(7))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/trends/data/model/SegmentalAnalysisTrendStatModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/trends/data/model/SegmentalAnalysisTrendStatModel;", "serializer", "()Lwc3/c;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SegmentalAnalysisTrendStatModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SegmentalAnalysisTrendStatModel(int i13, String str, String str2, String str3, EnumC17727b2 enumC17727b2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, SegmentalAnalysisTrendStatModel$$serializer.INSTANCE.getDescriptor());
        }
        this.statPrimaryDisplay = str;
        this.statPrimaryChangeDisplay = str2;
        this.statSecondaryDisplay = str3;
        this.statTrend = enumC17727b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.TrendTypeState", EnumC17727b2.values());
    }

    public static /* synthetic */ SegmentalAnalysisTrendStatModel copy$default(SegmentalAnalysisTrendStatModel segmentalAnalysisTrendStatModel, String str, String str2, String str3, EnumC17727b2 enumC17727b2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = segmentalAnalysisTrendStatModel.statPrimaryDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = segmentalAnalysisTrendStatModel.statPrimaryChangeDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = segmentalAnalysisTrendStatModel.statSecondaryDisplay;
        }
        if ((i13 & 8) != 0) {
            enumC17727b2 = segmentalAnalysisTrendStatModel.statTrend;
        }
        return segmentalAnalysisTrendStatModel.copy(str, str2, str3, enumC17727b2);
    }

    @InterfaceC37143h("stat_primary_change_display")
    public static /* synthetic */ void getStatPrimaryChangeDisplay$annotations() {
    }

    @InterfaceC37143h("stat_primary_display")
    public static /* synthetic */ void getStatPrimaryDisplay$annotations() {
    }

    @InterfaceC37143h("stat_secondary_display")
    public static /* synthetic */ void getStatSecondaryDisplay$annotations() {
    }

    @InterfaceC37143h("stat_trend")
    public static /* synthetic */ void getStatTrend$annotations() {
    }

    public static final /* synthetic */ void write$Self$trends_release(SegmentalAnalysisTrendStatModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.statPrimaryDisplay);
        output.encodeStringElement(serialDesc, 1, self.statPrimaryChangeDisplay);
        output.encodeStringElement(serialDesc, 2, self.statSecondaryDisplay);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.statTrend);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatPrimaryDisplay() {
        return this.statPrimaryDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatPrimaryChangeDisplay() {
        return this.statPrimaryChangeDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatSecondaryDisplay() {
        return this.statSecondaryDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final EnumC17727b2 getStatTrend() {
        return this.statTrend;
    }

    public final SegmentalAnalysisTrendStatModel copy(String statPrimaryDisplay, String statPrimaryChangeDisplay, String statSecondaryDisplay, EnumC17727b2 statTrend) {
        AbstractC22676k.m65750j(statPrimaryDisplay, "statPrimaryDisplay");
        AbstractC22676k.m65750j(statPrimaryChangeDisplay, "statPrimaryChangeDisplay");
        AbstractC22676k.m65750j(statSecondaryDisplay, "statSecondaryDisplay");
        AbstractC22676k.m65750j(statTrend, "statTrend");
        return new SegmentalAnalysisTrendStatModel(statPrimaryDisplay, statPrimaryChangeDisplay, statSecondaryDisplay, statTrend);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SegmentalAnalysisTrendStatModel)) {
            return false;
        }
        SegmentalAnalysisTrendStatModel segmentalAnalysisTrendStatModel = (SegmentalAnalysisTrendStatModel) other;
        return AbstractC22676k.m65745e(this.statPrimaryDisplay, segmentalAnalysisTrendStatModel.statPrimaryDisplay) && AbstractC22676k.m65745e(this.statPrimaryChangeDisplay, segmentalAnalysisTrendStatModel.statPrimaryChangeDisplay) && AbstractC22676k.m65745e(this.statSecondaryDisplay, segmentalAnalysisTrendStatModel.statSecondaryDisplay) && this.statTrend == segmentalAnalysisTrendStatModel.statTrend;
    }

    public final String getStatPrimaryChangeDisplay() {
        return this.statPrimaryChangeDisplay;
    }

    public final String getStatPrimaryDisplay() {
        return this.statPrimaryDisplay;
    }

    public final String getStatSecondaryDisplay() {
        return this.statSecondaryDisplay;
    }

    public final EnumC17727b2 getStatTrend() {
        return this.statTrend;
    }

    public int hashCode() {
        return this.statTrend.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.statPrimaryDisplay.hashCode() * 31, 31, this.statPrimaryChangeDisplay), 31, this.statSecondaryDisplay);
    }

    public String toString() {
        String str = this.statPrimaryDisplay;
        String str2 = this.statPrimaryChangeDisplay;
        String str3 = this.statSecondaryDisplay;
        EnumC17727b2 enumC17727b2 = this.statTrend;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SegmentalAnalysisTrendStatModel(statPrimaryDisplay=", str, ", statPrimaryChangeDisplay=", str2, ", statSecondaryDisplay=");
        sbM32001t.append(str3);
        sbM32001t.append(", statTrend=");
        sbM32001t.append(enumC17727b2);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public SegmentalAnalysisTrendStatModel(String statPrimaryDisplay, String statPrimaryChangeDisplay, String statSecondaryDisplay, EnumC17727b2 statTrend) {
        AbstractC22676k.m65750j(statPrimaryDisplay, "statPrimaryDisplay");
        AbstractC22676k.m65750j(statPrimaryChangeDisplay, "statPrimaryChangeDisplay");
        AbstractC22676k.m65750j(statSecondaryDisplay, "statSecondaryDisplay");
        AbstractC22676k.m65750j(statTrend, "statTrend");
        this.statPrimaryDisplay = statPrimaryDisplay;
        this.statPrimaryChangeDisplay = statPrimaryChangeDisplay;
        this.statSecondaryDisplay = statSecondaryDisplay;
        this.statTrend = statTrend;
    }
}
