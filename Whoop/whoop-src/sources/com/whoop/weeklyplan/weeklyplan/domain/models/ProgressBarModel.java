package com.whoop.weeklyplan.weeklyplan.domain.models;

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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u0006/"}, m65681d2 = {"Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;", "", "", "percentString", "percentSubtitle", "percentSymbol", "", "percentValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;F)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;FLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()F", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;F)Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPercentString", "getPercentSubtitle", "getPercentSymbol", "F", "getPercentValue", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ProgressBarModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String percentString;
    private final String percentSubtitle;
    private final String percentSymbol;
    private final float percentValue;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ProgressBarModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ProgressBarModel(int i13, String str, String str2, String str3, float f13, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, ProgressBarModel$$serializer.INSTANCE.getDescriptor());
        }
        this.percentString = str;
        this.percentSubtitle = str2;
        this.percentSymbol = str3;
        this.percentValue = f13;
    }

    public static /* synthetic */ ProgressBarModel copy$default(ProgressBarModel progressBarModel, String str, String str2, String str3, float f13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = progressBarModel.percentString;
        }
        if ((i13 & 2) != 0) {
            str2 = progressBarModel.percentSubtitle;
        }
        if ((i13 & 4) != 0) {
            str3 = progressBarModel.percentSymbol;
        }
        if ((i13 & 8) != 0) {
            f13 = progressBarModel.percentValue;
        }
        return progressBarModel.copy(str, str2, str3, f13);
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(ProgressBarModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.percentString);
        output.encodeStringElement(serialDesc, 1, self.percentSubtitle);
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.percentSymbol);
        output.encodeFloatElement(serialDesc, 3, self.percentValue);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPercentString() {
        return this.percentString;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPercentSubtitle() {
        return this.percentSubtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPercentSymbol() {
        return this.percentSymbol;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getPercentValue() {
        return this.percentValue;
    }

    public final ProgressBarModel copy(String percentString, String percentSubtitle, String percentSymbol, float percentValue) {
        AbstractC22676k.m65750j(percentString, "percentString");
        AbstractC22676k.m65750j(percentSubtitle, "percentSubtitle");
        return new ProgressBarModel(percentString, percentSubtitle, percentSymbol, percentValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressBarModel)) {
            return false;
        }
        ProgressBarModel progressBarModel = (ProgressBarModel) other;
        return AbstractC22676k.m65745e(this.percentString, progressBarModel.percentString) && AbstractC22676k.m65745e(this.percentSubtitle, progressBarModel.percentSubtitle) && AbstractC22676k.m65745e(this.percentSymbol, progressBarModel.percentSymbol) && Float.compare(this.percentValue, progressBarModel.percentValue) == 0;
    }

    public final String getPercentString() {
        return this.percentString;
    }

    public final String getPercentSubtitle() {
        return this.percentSubtitle;
    }

    public final String getPercentSymbol() {
        return this.percentSymbol;
    }

    public final float getPercentValue() {
        return this.percentValue;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.percentString.hashCode() * 31, 31, this.percentSubtitle);
        String str = this.percentSymbol;
        return Float.hashCode(this.percentValue) + ((iM30450d + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.percentString;
        String str2 = this.percentSubtitle;
        String str3 = this.percentSymbol;
        float f13 = this.percentValue;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ProgressBarModel(percentString=", str, ", percentSubtitle=", str2, ", percentSymbol=");
        sbM32001t.append(str3);
        sbM32001t.append(", percentValue=");
        sbM32001t.append(f13);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public ProgressBarModel(String percentString, String percentSubtitle, String str, float f13) {
        AbstractC22676k.m65750j(percentString, "percentString");
        AbstractC22676k.m65750j(percentSubtitle, "percentSubtitle");
        this.percentString = percentString;
        this.percentSubtitle = percentSubtitle;
        this.percentSymbol = str;
        this.percentValue = f13;
    }
}
