package com.whoop.connectivityDataPacketsModels.firmware.rawdata.rev2.dto;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bBS\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u001fJL\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b0\u0010\u001f¨\u00064"}, m65681d2 = {"Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;", "", "", "strapId", "hardwareVersion", "firmwareVersion", "sigProcVersion", "", "binaryVersion", "binaryFlags", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$connectivity_data_packets_model_release", "(Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()I", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStrapId", "getHardwareVersion", "getFirmwareVersion", "getSigProcVersion", "I", "getBinaryVersion", "getBinaryFlags", "Companion", "$serializer", "a", "connectivity-data-packets-model_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class Rev2DataSettingsMetadata {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int binaryFlags;
    private final int binaryVersion;
    private final String firmwareVersion;
    private final String hardwareVersion;
    private final String sigProcVersion;
    private final String strapId;

    /* JADX INFO: renamed from: com.whoop.connectivityDataPacketsModels.firmware.rawdata.rev2.dto.Rev2DataSettingsMetadata$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;", "serializer", "()Lwc3/c;", "connectivity-data-packets-model_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return Rev2DataSettingsMetadata$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Rev2DataSettingsMetadata(int i13, String str, String str2, String str3, String str4, int i14, int i15, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, Rev2DataSettingsMetadata$$serializer.INSTANCE.getDescriptor());
        }
        this.strapId = str;
        this.hardwareVersion = str2;
        this.firmwareVersion = str3;
        this.sigProcVersion = str4;
        this.binaryVersion = i14;
        this.binaryFlags = i15;
    }

    public static /* synthetic */ Rev2DataSettingsMetadata copy$default(Rev2DataSettingsMetadata rev2DataSettingsMetadata, String str, String str2, String str3, String str4, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = rev2DataSettingsMetadata.strapId;
        }
        if ((i15 & 2) != 0) {
            str2 = rev2DataSettingsMetadata.hardwareVersion;
        }
        if ((i15 & 4) != 0) {
            str3 = rev2DataSettingsMetadata.firmwareVersion;
        }
        if ((i15 & 8) != 0) {
            str4 = rev2DataSettingsMetadata.sigProcVersion;
        }
        if ((i15 & 16) != 0) {
            i13 = rev2DataSettingsMetadata.binaryVersion;
        }
        if ((i15 & 32) != 0) {
            i14 = rev2DataSettingsMetadata.binaryFlags;
        }
        int i16 = i13;
        int i17 = i14;
        return rev2DataSettingsMetadata.copy(str, str2, str3, str4, i16, i17);
    }

    public static final /* synthetic */ void write$Self$connectivity_data_packets_model_release(Rev2DataSettingsMetadata self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.strapId);
        output.encodeStringElement(serialDesc, 1, self.hardwareVersion);
        output.encodeStringElement(serialDesc, 2, self.firmwareVersion);
        output.encodeStringElement(serialDesc, 3, self.sigProcVersion);
        output.encodeIntElement(serialDesc, 4, self.binaryVersion);
        output.encodeIntElement(serialDesc, 5, self.binaryFlags);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStrapId() {
        return this.strapId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHardwareVersion() {
        return this.hardwareVersion;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSigProcVersion() {
        return this.sigProcVersion;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getBinaryVersion() {
        return this.binaryVersion;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getBinaryFlags() {
        return this.binaryFlags;
    }

    public final Rev2DataSettingsMetadata copy(String strapId, String hardwareVersion, String firmwareVersion, String sigProcVersion, int binaryVersion, int binaryFlags) {
        AbstractC22676k.m65750j(strapId, "strapId");
        AbstractC22676k.m65750j(hardwareVersion, "hardwareVersion");
        AbstractC22676k.m65750j(firmwareVersion, "firmwareVersion");
        AbstractC22676k.m65750j(sigProcVersion, "sigProcVersion");
        return new Rev2DataSettingsMetadata(strapId, hardwareVersion, firmwareVersion, sigProcVersion, binaryVersion, binaryFlags);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Rev2DataSettingsMetadata)) {
            return false;
        }
        Rev2DataSettingsMetadata rev2DataSettingsMetadata = (Rev2DataSettingsMetadata) other;
        return AbstractC22676k.m65745e(this.strapId, rev2DataSettingsMetadata.strapId) && AbstractC22676k.m65745e(this.hardwareVersion, rev2DataSettingsMetadata.hardwareVersion) && AbstractC22676k.m65745e(this.firmwareVersion, rev2DataSettingsMetadata.firmwareVersion) && AbstractC22676k.m65745e(this.sigProcVersion, rev2DataSettingsMetadata.sigProcVersion) && this.binaryVersion == rev2DataSettingsMetadata.binaryVersion && this.binaryFlags == rev2DataSettingsMetadata.binaryFlags;
    }

    public final int getBinaryFlags() {
        return this.binaryFlags;
    }

    public final int getBinaryVersion() {
        return this.binaryVersion;
    }

    public final String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public final String getHardwareVersion() {
        return this.hardwareVersion;
    }

    public final String getSigProcVersion() {
        return this.sigProcVersion;
    }

    public final String getStrapId() {
        return this.strapId;
    }

    public int hashCode() {
        return Integer.hashCode(this.binaryFlags) + AbstractC11266d.m30448b(this.binaryVersion, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.strapId.hashCode() * 31, 31, this.hardwareVersion), 31, this.firmwareVersion), 31, this.sigProcVersion), 31);
    }

    public String toString() {
        String str = this.strapId;
        String str2 = this.hardwareVersion;
        String str3 = this.firmwareVersion;
        String str4 = this.sigProcVersion;
        int i13 = this.binaryVersion;
        int i14 = this.binaryFlags;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Rev2DataSettingsMetadata(strapId=", str, ", hardwareVersion=", str2, ", firmwareVersion=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", sigProcVersion=", str4, ", binaryVersion=");
        return AbstractC26725a.m79505i(sbM32001t, i13, ", binaryFlags=", i14, ")");
    }

    public Rev2DataSettingsMetadata(String strapId, String hardwareVersion, String firmwareVersion, String sigProcVersion, int i13, int i14) {
        AbstractC22676k.m65750j(strapId, "strapId");
        AbstractC22676k.m65750j(hardwareVersion, "hardwareVersion");
        AbstractC22676k.m65750j(firmwareVersion, "firmwareVersion");
        AbstractC22676k.m65750j(sigProcVersion, "sigProcVersion");
        this.strapId = strapId;
        this.hardwareVersion = hardwareVersion;
        this.firmwareVersion = firmwareVersion;
        this.sigProcVersion = sigProcVersion;
        this.binaryVersion = i13;
        this.binaryFlags = i14;
    }
}
