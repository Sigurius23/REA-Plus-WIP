package com.whoop.home.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019JJ\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u001dJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b-\u0010\u0019¨\u00060"}, m65681d2 = {"Lcom/whoop/home/domain/models/ChallengeHomeTileProgressModel;", "", "", "currentValue", "totalValue", "label", "", "percentValue", "progressBarStyle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$home_release", "(Lcom/whoop/home/domain/models/ChallengeHomeTileProgressModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()I", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lcom/whoop/home/domain/models/ChallengeHomeTileProgressModel;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCurrentValue", "getTotalValue", "getLabel", "I", "getPercentValue", "getProgressBarStyle", "Companion", "$serializer", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ChallengeHomeTileProgressModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String currentValue;
    private final String label;
    private final int percentValue;
    private final String progressBarStyle;
    private final String totalValue;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/home/domain/models/ChallengeHomeTileProgressModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/home/domain/models/ChallengeHomeTileProgressModel;", "serializer", "()Lwc3/c;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ChallengeHomeTileProgressModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ChallengeHomeTileProgressModel() {
        this((String) null, (String) null, (String) null, 0, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ChallengeHomeTileProgressModel copy$default(ChallengeHomeTileProgressModel challengeHomeTileProgressModel, String str, String str2, String str3, int i13, String str4, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = challengeHomeTileProgressModel.currentValue;
        }
        if ((i14 & 2) != 0) {
            str2 = challengeHomeTileProgressModel.totalValue;
        }
        if ((i14 & 4) != 0) {
            str3 = challengeHomeTileProgressModel.label;
        }
        if ((i14 & 8) != 0) {
            i13 = challengeHomeTileProgressModel.percentValue;
        }
        if ((i14 & 16) != 0) {
            str4 = challengeHomeTileProgressModel.progressBarStyle;
        }
        String str5 = str4;
        String str6 = str3;
        return challengeHomeTileProgressModel.copy(str, str2, str6, i13, str5);
    }

    public static final /* synthetic */ void write$Self$home_release(ChallengeHomeTileProgressModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.currentValue != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.currentValue);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.totalValue != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.totalValue);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.label != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.label);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.percentValue != 0) {
            output.encodeIntElement(serialDesc, 3, self.percentValue);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.progressBarStyle == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.progressBarStyle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrentValue() {
        return this.currentValue;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTotalValue() {
        return this.totalValue;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPercentValue() {
        return this.percentValue;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getProgressBarStyle() {
        return this.progressBarStyle;
    }

    public final ChallengeHomeTileProgressModel copy(String currentValue, String totalValue, String label, int percentValue, String progressBarStyle) {
        return new ChallengeHomeTileProgressModel(currentValue, totalValue, label, percentValue, progressBarStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallengeHomeTileProgressModel)) {
            return false;
        }
        ChallengeHomeTileProgressModel challengeHomeTileProgressModel = (ChallengeHomeTileProgressModel) other;
        return AbstractC22676k.m65745e(this.currentValue, challengeHomeTileProgressModel.currentValue) && AbstractC22676k.m65745e(this.totalValue, challengeHomeTileProgressModel.totalValue) && AbstractC22676k.m65745e(this.label, challengeHomeTileProgressModel.label) && this.percentValue == challengeHomeTileProgressModel.percentValue && AbstractC22676k.m65745e(this.progressBarStyle, challengeHomeTileProgressModel.progressBarStyle);
    }

    public final String getCurrentValue() {
        return this.currentValue;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getPercentValue() {
        return this.percentValue;
    }

    public final String getProgressBarStyle() {
        return this.progressBarStyle;
    }

    public final String getTotalValue() {
        return this.totalValue;
    }

    public int hashCode() {
        String str = this.currentValue;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.totalValue;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.label;
        int iM30448b = AbstractC11266d.m30448b(this.percentValue, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.progressBarStyle;
        return iM30448b + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.currentValue;
        String str2 = this.totalValue;
        String str3 = this.label;
        int i13 = this.percentValue;
        String str4 = this.progressBarStyle;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ChallengeHomeTileProgressModel(currentValue=", str, ", totalValue=", str2, ", label=");
        AbstractC11266d.m30470x(i13, str3, ", percentValue=", ", progressBarStyle=", sbM32001t);
        return AbstractC25012a.m73376i(str4, ")", sbM32001t);
    }

    public /* synthetic */ ChallengeHomeTileProgressModel(int i13, String str, String str2, String str3, int i14, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.currentValue = null;
        } else {
            this.currentValue = str;
        }
        if ((i13 & 2) == 0) {
            this.totalValue = null;
        } else {
            this.totalValue = str2;
        }
        if ((i13 & 4) == 0) {
            this.label = null;
        } else {
            this.label = str3;
        }
        if ((i13 & 8) == 0) {
            this.percentValue = 0;
        } else {
            this.percentValue = i14;
        }
        if ((i13 & 16) == 0) {
            this.progressBarStyle = null;
        } else {
            this.progressBarStyle = str4;
        }
    }

    public ChallengeHomeTileProgressModel(String str, String str2, String str3, int i13, String str4) {
        this.currentValue = str;
        this.totalValue = str2;
        this.label = str3;
        this.percentValue = i13;
        this.progressBarStyle = str4;
    }

    public /* synthetic */ ChallengeHomeTileProgressModel(String str, String str2, String str3, int i13, String str4, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? 0 : i13, (i14 & 16) != 0 ? null : str4);
    }
}
