package com.whoop.connectivityDataPacketsModels.console.dto;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBU\b\u0010\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 JL\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010 J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010 ¨\u00064"}, m65681d2 = {"Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;", "", "", "strapId", "strapGenCodeName", "hardwareVersion", "maximVersion", "dspVersion", "", "binaryVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$connectivity_data_packets_model_release", "(Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStrapId", "getStrapGenCodeName", "getHardwareVersion", "getMaximVersion", "getDspVersion", "I", "getBinaryVersion", "Companion", "$serializer", "a", "connectivity-data-packets-model_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ConsolePacketsMetadata {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int binaryVersion;
    private final String dspVersion;
    private final String hardwareVersion;
    private final String maximVersion;
    private final String strapGenCodeName;
    private final String strapId;

    /* JADX INFO: renamed from: com.whoop.connectivityDataPacketsModels.console.dto.ConsolePacketsMetadata$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;", "serializer", "()Lwc3/c;", "connectivity-data-packets-model_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ConsolePacketsMetadata$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ConsolePacketsMetadata(int i13, String str, String str2, String str3, String str4, String str5, int i14, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, ConsolePacketsMetadata$$serializer.INSTANCE.getDescriptor());
        }
        this.strapId = str;
        this.strapGenCodeName = str2;
        this.hardwareVersion = str3;
        this.maximVersion = str4;
        this.dspVersion = str5;
        this.binaryVersion = i14;
    }

    public static /* synthetic */ ConsolePacketsMetadata copy$default(ConsolePacketsMetadata consolePacketsMetadata, String str, String str2, String str3, String str4, String str5, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = consolePacketsMetadata.strapId;
        }
        if ((i14 & 2) != 0) {
            str2 = consolePacketsMetadata.strapGenCodeName;
        }
        if ((i14 & 4) != 0) {
            str3 = consolePacketsMetadata.hardwareVersion;
        }
        if ((i14 & 8) != 0) {
            str4 = consolePacketsMetadata.maximVersion;
        }
        if ((i14 & 16) != 0) {
            str5 = consolePacketsMetadata.dspVersion;
        }
        if ((i14 & 32) != 0) {
            i13 = consolePacketsMetadata.binaryVersion;
        }
        String str6 = str5;
        int i15 = i13;
        return consolePacketsMetadata.copy(str, str2, str3, str4, str6, i15);
    }

    public static final /* synthetic */ void write$Self$connectivity_data_packets_model_release(ConsolePacketsMetadata self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.strapId);
        output.encodeStringElement(serialDesc, 1, self.strapGenCodeName);
        output.encodeStringElement(serialDesc, 2, self.hardwareVersion);
        output.encodeStringElement(serialDesc, 3, self.maximVersion);
        output.encodeStringElement(serialDesc, 4, self.dspVersion);
        output.encodeIntElement(serialDesc, 5, self.binaryVersion);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStrapId() {
        return this.strapId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStrapGenCodeName() {
        return this.strapGenCodeName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHardwareVersion() {
        return this.hardwareVersion;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMaximVersion() {
        return this.maximVersion;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDspVersion() {
        return this.dspVersion;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getBinaryVersion() {
        return this.binaryVersion;
    }

    public final ConsolePacketsMetadata copy(String strapId, String strapGenCodeName, String hardwareVersion, String maximVersion, String dspVersion, int binaryVersion) {
        AbstractC22676k.m65750j(strapId, "strapId");
        AbstractC22676k.m65750j(strapGenCodeName, "strapGenCodeName");
        AbstractC22676k.m65750j(hardwareVersion, "hardwareVersion");
        AbstractC22676k.m65750j(maximVersion, "maximVersion");
        AbstractC22676k.m65750j(dspVersion, "dspVersion");
        return new ConsolePacketsMetadata(strapId, strapGenCodeName, hardwareVersion, maximVersion, dspVersion, binaryVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConsolePacketsMetadata)) {
            return false;
        }
        ConsolePacketsMetadata consolePacketsMetadata = (ConsolePacketsMetadata) other;
        return AbstractC22676k.m65745e(this.strapId, consolePacketsMetadata.strapId) && AbstractC22676k.m65745e(this.strapGenCodeName, consolePacketsMetadata.strapGenCodeName) && AbstractC22676k.m65745e(this.hardwareVersion, consolePacketsMetadata.hardwareVersion) && AbstractC22676k.m65745e(this.maximVersion, consolePacketsMetadata.maximVersion) && AbstractC22676k.m65745e(this.dspVersion, consolePacketsMetadata.dspVersion) && this.binaryVersion == consolePacketsMetadata.binaryVersion;
    }

    public final int getBinaryVersion() {
        return this.binaryVersion;
    }

    public final String getDspVersion() {
        return this.dspVersion;
    }

    public final String getHardwareVersion() {
        return this.hardwareVersion;
    }

    public final String getMaximVersion() {
        return this.maximVersion;
    }

    public final String getStrapGenCodeName() {
        return this.strapGenCodeName;
    }

    public final String getStrapId() {
        return this.strapId;
    }

    public int hashCode() {
        return Integer.hashCode(this.binaryVersion) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.strapId.hashCode() * 31, 31, this.strapGenCodeName), 31, this.hardwareVersion), 31, this.maximVersion), 31, this.dspVersion);
    }

    public String toString() {
        String str = this.strapId;
        String str2 = this.strapGenCodeName;
        String str3 = this.hardwareVersion;
        String str4 = this.maximVersion;
        String str5 = this.dspVersion;
        int i13 = this.binaryVersion;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ConsolePacketsMetadata(strapId=", str, ", strapGenCodeName=", str2, ", hardwareVersion=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", maximVersion=", str4, ", dspVersion=");
        sbM32001t.append(str5);
        sbM32001t.append(", binaryVersion=");
        sbM32001t.append(i13);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public ConsolePacketsMetadata(String strapId, String strapGenCodeName, String hardwareVersion, String maximVersion, String dspVersion, int i13) {
        AbstractC22676k.m65750j(strapId, "strapId");
        AbstractC22676k.m65750j(strapGenCodeName, "strapGenCodeName");
        AbstractC22676k.m65750j(hardwareVersion, "hardwareVersion");
        AbstractC22676k.m65750j(maximVersion, "maximVersion");
        AbstractC22676k.m65750j(dspVersion, "dspVersion");
        this.strapId = strapId;
        this.strapGenCodeName = strapGenCodeName;
        this.hardwareVersion = hardwareVersion;
        this.maximVersion = maximVersion;
        this.dspVersion = dspVersion;
        this.binaryVersion = i13;
    }
}
