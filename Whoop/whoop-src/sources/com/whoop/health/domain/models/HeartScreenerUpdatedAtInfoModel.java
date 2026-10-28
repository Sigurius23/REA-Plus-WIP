package com.whoop.health.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J@\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b,\u0010(\u001a\u0004\b+\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b.\u0010(\u001a\u0004\b-\u0010\u0018¨\u00061"}, m65681d2 = {"Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;", "", "", "shepherdHighWaterMark", "labradorHighWaterMark", "shepherdState", "labradorState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$health_release", "(Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getShepherdHighWaterMark", "getShepherdHighWaterMark$annotations", "()V", "getLabradorHighWaterMark", "getLabradorHighWaterMark$annotations", "getShepherdState", "getShepherdState$annotations", "getLabradorState", "getLabradorState$annotations", "Companion", "$serializer", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HeartScreenerUpdatedAtInfoModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("ecg_high_water_mark")
    private final String labradorHighWaterMark;

    @SerializedName("ecg_state")
    private final String labradorState;

    @SerializedName("anf_high_water_mark")
    private final String shepherdHighWaterMark;

    @SerializedName("anf_state")
    private final String shepherdState;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;", "serializer", "()Lwc3/c;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HeartScreenerUpdatedAtInfoModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public HeartScreenerUpdatedAtInfoModel() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ HeartScreenerUpdatedAtInfoModel copy$default(HeartScreenerUpdatedAtInfoModel heartScreenerUpdatedAtInfoModel, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = heartScreenerUpdatedAtInfoModel.shepherdHighWaterMark;
        }
        if ((i13 & 2) != 0) {
            str2 = heartScreenerUpdatedAtInfoModel.labradorHighWaterMark;
        }
        if ((i13 & 4) != 0) {
            str3 = heartScreenerUpdatedAtInfoModel.shepherdState;
        }
        if ((i13 & 8) != 0) {
            str4 = heartScreenerUpdatedAtInfoModel.labradorState;
        }
        return heartScreenerUpdatedAtInfoModel.copy(str, str2, str3, str4);
    }

    @InterfaceC37143h("ecg_high_water_mark")
    public static /* synthetic */ void getLabradorHighWaterMark$annotations() {
    }

    @InterfaceC37143h("ecg_state")
    public static /* synthetic */ void getLabradorState$annotations() {
    }

    @InterfaceC37143h("anf_high_water_mark")
    public static /* synthetic */ void getShepherdHighWaterMark$annotations() {
    }

    @InterfaceC37143h("anf_state")
    public static /* synthetic */ void getShepherdState$annotations() {
    }

    public static final /* synthetic */ void write$Self$health_release(HeartScreenerUpdatedAtInfoModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.shepherdHighWaterMark != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.shepherdHighWaterMark);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.labradorHighWaterMark != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.labradorHighWaterMark);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.shepherdState != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.shepherdState);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.labradorState == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.labradorState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getShepherdHighWaterMark() {
        return this.shepherdHighWaterMark;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabradorHighWaterMark() {
        return this.labradorHighWaterMark;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getShepherdState() {
        return this.shepherdState;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLabradorState() {
        return this.labradorState;
    }

    public final HeartScreenerUpdatedAtInfoModel copy(String shepherdHighWaterMark, String labradorHighWaterMark, String shepherdState, String labradorState) {
        return new HeartScreenerUpdatedAtInfoModel(shepherdHighWaterMark, labradorHighWaterMark, shepherdState, labradorState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeartScreenerUpdatedAtInfoModel)) {
            return false;
        }
        HeartScreenerUpdatedAtInfoModel heartScreenerUpdatedAtInfoModel = (HeartScreenerUpdatedAtInfoModel) other;
        return AbstractC22676k.m65745e(this.shepherdHighWaterMark, heartScreenerUpdatedAtInfoModel.shepherdHighWaterMark) && AbstractC22676k.m65745e(this.labradorHighWaterMark, heartScreenerUpdatedAtInfoModel.labradorHighWaterMark) && AbstractC22676k.m65745e(this.shepherdState, heartScreenerUpdatedAtInfoModel.shepherdState) && AbstractC22676k.m65745e(this.labradorState, heartScreenerUpdatedAtInfoModel.labradorState);
    }

    public final String getLabradorHighWaterMark() {
        return this.labradorHighWaterMark;
    }

    public final String getLabradorState() {
        return this.labradorState;
    }

    public final String getShepherdHighWaterMark() {
        return this.shepherdHighWaterMark;
    }

    public final String getShepherdState() {
        return this.shepherdState;
    }

    public int hashCode() {
        String str = this.shepherdHighWaterMark;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.labradorHighWaterMark;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shepherdState;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.labradorState;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.shepherdHighWaterMark;
        String str2 = this.labradorHighWaterMark;
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("HeartScreenerUpdatedAtInfoModel(shepherdHighWaterMark=", str, ", labradorHighWaterMark=", str2, ", shepherdState="), this.shepherdState, ", labradorState=", this.labradorState, ")");
    }

    public /* synthetic */ HeartScreenerUpdatedAtInfoModel(int i13, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.shepherdHighWaterMark = null;
        } else {
            this.shepherdHighWaterMark = str;
        }
        if ((i13 & 2) == 0) {
            this.labradorHighWaterMark = null;
        } else {
            this.labradorHighWaterMark = str2;
        }
        if ((i13 & 4) == 0) {
            this.shepherdState = null;
        } else {
            this.shepherdState = str3;
        }
        if ((i13 & 8) == 0) {
            this.labradorState = null;
        } else {
            this.labradorState = str4;
        }
    }

    public HeartScreenerUpdatedAtInfoModel(String str, String str2, String str3, String str4) {
        this.shepherdHighWaterMark = str;
        this.labradorHighWaterMark = str2;
        this.shepherdState = str3;
        this.labradorState = str4;
    }

    public /* synthetic */ HeartScreenerUpdatedAtInfoModel(String str, String str2, String str3, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4);
    }
}
