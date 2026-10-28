package com.whoop.stress.domain.model;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000278B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJD\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b/\u0010,\u001a\u0004\b.\u0010\u001cR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010-\u0012\u0004\b1\u0010,\u001a\u0004\b0\u0010\u001cR \u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b3\u0010,\u001a\u0004\b2\u0010\u001cR \u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010-\u0012\u0004\b5\u0010,\u001a\u0004\b4\u0010\u001c¨\u00069"}, m65681d2 = {"Lcom/whoop/stress/domain/model/StressMonitorMeterDto;", "", "", "fillPercent", "", "stressScore", "stressText", "meterMin", "meterMax", "<init>", "(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$stress_release", "(Lcom/whoop/stress/domain/model/StressMonitorMeterDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/Float;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "copy", "(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/stress/domain/model/StressMonitorMeterDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Float;", "getFillPercent", "getFillPercent$annotations", "()V", "Ljava/lang/String;", "getStressScore", "getStressScore$annotations", "getStressText", "getStressText$annotations", "getMeterMin", "getMeterMin$annotations", "getMeterMax", "getMeterMax$annotations", "Companion", "$serializer", "a", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StressMonitorMeterDto {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("gauge_fill_percentage")
    private final Float fillPercent;

    @SerializedName("gauge_max_display")
    private final String meterMax;

    @SerializedName("gauge_min_display")
    private final String meterMin;

    @SerializedName("gauge_score_display")
    private final String stressScore;

    @SerializedName("gauge_subtext_display")
    private final String stressText;

    /* JADX INFO: renamed from: com.whoop.stress.domain.model.StressMonitorMeterDto$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/stress/domain/model/StressMonitorMeterDto$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/stress/domain/model/StressMonitorMeterDto;", "serializer", "()Lwc3/c;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StressMonitorMeterDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StressMonitorMeterDto(int i13, Float f13, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, StressMonitorMeterDto$$serializer.INSTANCE.getDescriptor());
        }
        this.fillPercent = f13;
        this.stressScore = str;
        this.stressText = str2;
        this.meterMin = str3;
        this.meterMax = str4;
    }

    public static /* synthetic */ StressMonitorMeterDto copy$default(StressMonitorMeterDto stressMonitorMeterDto, Float f13, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = stressMonitorMeterDto.fillPercent;
        }
        if ((i13 & 2) != 0) {
            str = stressMonitorMeterDto.stressScore;
        }
        if ((i13 & 4) != 0) {
            str2 = stressMonitorMeterDto.stressText;
        }
        if ((i13 & 8) != 0) {
            str3 = stressMonitorMeterDto.meterMin;
        }
        if ((i13 & 16) != 0) {
            str4 = stressMonitorMeterDto.meterMax;
        }
        String str5 = str4;
        String str6 = str2;
        return stressMonitorMeterDto.copy(f13, str, str6, str3, str5);
    }

    @InterfaceC37143h("gauge_fill_percentage")
    public static /* synthetic */ void getFillPercent$annotations() {
    }

    @InterfaceC37143h("gauge_max_display")
    public static /* synthetic */ void getMeterMax$annotations() {
    }

    @InterfaceC37143h("gauge_min_display")
    public static /* synthetic */ void getMeterMin$annotations() {
    }

    @InterfaceC37143h("gauge_score_display")
    public static /* synthetic */ void getStressScore$annotations() {
    }

    @InterfaceC37143h("gauge_subtext_display")
    public static /* synthetic */ void getStressText$annotations() {
    }

    public static final /* synthetic */ void write$Self$stress_release(StressMonitorMeterDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, FloatSerializer.INSTANCE, self.fillPercent);
        output.encodeStringElement(serialDesc, 1, self.stressScore);
        output.encodeStringElement(serialDesc, 2, self.stressText);
        output.encodeStringElement(serialDesc, 3, self.meterMin);
        output.encodeStringElement(serialDesc, 4, self.meterMax);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Float getFillPercent() {
        return this.fillPercent;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStressScore() {
        return this.stressScore;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStressText() {
        return this.stressText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMeterMin() {
        return this.meterMin;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMeterMax() {
        return this.meterMax;
    }

    public final StressMonitorMeterDto copy(Float fillPercent, String stressScore, String stressText, String meterMin, String meterMax) {
        AbstractC22676k.m65750j(stressScore, "stressScore");
        AbstractC22676k.m65750j(stressText, "stressText");
        AbstractC22676k.m65750j(meterMin, "meterMin");
        AbstractC22676k.m65750j(meterMax, "meterMax");
        return new StressMonitorMeterDto(fillPercent, stressScore, stressText, meterMin, meterMax);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StressMonitorMeterDto)) {
            return false;
        }
        StressMonitorMeterDto stressMonitorMeterDto = (StressMonitorMeterDto) other;
        return AbstractC22676k.m65745e(this.fillPercent, stressMonitorMeterDto.fillPercent) && AbstractC22676k.m65745e(this.stressScore, stressMonitorMeterDto.stressScore) && AbstractC22676k.m65745e(this.stressText, stressMonitorMeterDto.stressText) && AbstractC22676k.m65745e(this.meterMin, stressMonitorMeterDto.meterMin) && AbstractC22676k.m65745e(this.meterMax, stressMonitorMeterDto.meterMax);
    }

    public final Float getFillPercent() {
        return this.fillPercent;
    }

    public final String getMeterMax() {
        return this.meterMax;
    }

    public final String getMeterMin() {
        return this.meterMin;
    }

    public final String getStressScore() {
        return this.stressScore;
    }

    public final String getStressText() {
        return this.stressText;
    }

    public int hashCode() {
        Float f13 = this.fillPercent;
        return this.meterMax.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((f13 == null ? 0 : f13.hashCode()) * 31, 31, this.stressScore), 31, this.stressText), 31, this.meterMin);
    }

    public String toString() {
        Float f13 = this.fillPercent;
        String str = this.stressScore;
        String str2 = this.stressText;
        String str3 = this.meterMin;
        String str4 = this.meterMax;
        StringBuilder sb4 = new StringBuilder("StressMonitorMeterDto(fillPercent=");
        sb4.append(f13);
        sb4.append(", stressScore=");
        sb4.append(str);
        sb4.append(", stressText=");
        AbstractC11266d.m30444B(sb4, str2, ", meterMin=", str3, ", meterMax=");
        return AbstractC25012a.m73376i(str4, ")", sb4);
    }

    public StressMonitorMeterDto(Float f13, String stressScore, String stressText, String meterMin, String meterMax) {
        AbstractC22676k.m65750j(stressScore, "stressScore");
        AbstractC22676k.m65750j(stressText, "stressText");
        AbstractC22676k.m65750j(meterMin, "meterMin");
        AbstractC22676k.m65750j(meterMax, "meterMax");
        this.fillPercent = f13;
        this.stressScore = stressScore;
        this.stressText = stressText;
        this.meterMin = meterMin;
        this.meterMax = meterMax;
    }
}
