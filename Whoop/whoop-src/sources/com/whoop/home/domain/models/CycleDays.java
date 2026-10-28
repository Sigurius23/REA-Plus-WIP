package com.whoop.home.domain.models;

import com.google.gson.annotations.SerializedName;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J@\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b)\u0010\u0018¨\u0006,"}, m65681d2 = {"Lcom/whoop/home/domain/models/CycleDays;", "", "", "lowerEndpoint", "lowerBoundType", "upperEndpoint", "upperBoundType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$home_release", "(Lcom/whoop/home/domain/models/CycleDays;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/home/domain/models/CycleDays;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLowerEndpoint", "getLowerBoundType", "getUpperEndpoint", "getUpperBoundType", "Companion", "$serializer", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CycleDays {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("lower_bound_type")
    private final String lowerBoundType;

    @SerializedName("lower_endpoint")
    private final String lowerEndpoint;

    @SerializedName("upper_bound_type")
    private final String upperBoundType;

    @SerializedName("upper_endpoint")
    private final String upperEndpoint;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/home/domain/models/CycleDays$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/home/domain/models/CycleDays;", "serializer", "()Lwc3/c;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CycleDays$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CycleDays(int i13, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, CycleDays$$serializer.INSTANCE.getDescriptor());
        }
        this.lowerEndpoint = str;
        this.lowerBoundType = str2;
        this.upperEndpoint = str3;
        this.upperBoundType = str4;
    }

    public static /* synthetic */ CycleDays copy$default(CycleDays cycleDays, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = cycleDays.lowerEndpoint;
        }
        if ((i13 & 2) != 0) {
            str2 = cycleDays.lowerBoundType;
        }
        if ((i13 & 4) != 0) {
            str3 = cycleDays.upperEndpoint;
        }
        if ((i13 & 8) != 0) {
            str4 = cycleDays.upperBoundType;
        }
        return cycleDays.copy(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$home_release(CycleDays self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.lowerEndpoint);
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.lowerBoundType);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.upperEndpoint);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.upperBoundType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLowerEndpoint() {
        return this.lowerEndpoint;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLowerBoundType() {
        return this.lowerBoundType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUpperEndpoint() {
        return this.upperEndpoint;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUpperBoundType() {
        return this.upperBoundType;
    }

    public final CycleDays copy(String lowerEndpoint, String lowerBoundType, String upperEndpoint, String upperBoundType) {
        return new CycleDays(lowerEndpoint, lowerBoundType, upperEndpoint, upperBoundType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CycleDays)) {
            return false;
        }
        CycleDays cycleDays = (CycleDays) other;
        return AbstractC22676k.m65745e(this.lowerEndpoint, cycleDays.lowerEndpoint) && AbstractC22676k.m65745e(this.lowerBoundType, cycleDays.lowerBoundType) && AbstractC22676k.m65745e(this.upperEndpoint, cycleDays.upperEndpoint) && AbstractC22676k.m65745e(this.upperBoundType, cycleDays.upperBoundType);
    }

    public final String getLowerBoundType() {
        return this.lowerBoundType;
    }

    public final String getLowerEndpoint() {
        return this.lowerEndpoint;
    }

    public final String getUpperBoundType() {
        return this.upperBoundType;
    }

    public final String getUpperEndpoint() {
        return this.upperEndpoint;
    }

    public int hashCode() {
        String str = this.lowerEndpoint;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lowerBoundType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.upperEndpoint;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.upperBoundType;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.lowerEndpoint;
        String str2 = this.lowerBoundType;
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("CycleDays(lowerEndpoint=", str, ", lowerBoundType=", str2, ", upperEndpoint="), this.upperEndpoint, ", upperBoundType=", this.upperBoundType, ")");
    }

    public CycleDays(String str, String str2, String str3, String str4) {
        this.lowerEndpoint = str;
        this.lowerBoundType = str2;
        this.upperEndpoint = str3;
        this.upperBoundType = str4;
    }
}
