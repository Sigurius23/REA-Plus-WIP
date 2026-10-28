package com.whoop.firmwareUpdateService.data.helper;

import androidx.annotation.Keep;
import com.mapbox.maps.MapboxMap;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0018J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0018¨\u0006("}, m65681d2 = {"Lcom/whoop/firmwareUpdateService/data/helper/FirmwarePointer;", "", "", "version", "", MapboxMap.QFE_OFFSET, "<init>", "(Ljava/lang/String;I)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$firmware_update_service_release", "(Lcom/whoop/firmwareUpdateService/data/helper/FirmwarePointer;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/whoop/firmwareUpdateService/data/helper/FirmwarePointer;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVersion", "I", "getOffset", "Companion", "$serializer", "a", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FirmwarePointer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int offset;
    private final String version;

    /* JADX INFO: renamed from: com.whoop.firmwareUpdateService.data.helper.FirmwarePointer$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/firmwareUpdateService/data/helper/FirmwarePointer$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/firmwareUpdateService/data/helper/FirmwarePointer;", "serializer", "()Lwc3/c;", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FirmwarePointer$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ FirmwarePointer(int i13, String str, int i14, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, FirmwarePointer$$serializer.INSTANCE.getDescriptor());
        }
        this.version = str;
        this.offset = i14;
    }

    public static /* synthetic */ FirmwarePointer copy$default(FirmwarePointer firmwarePointer, String str, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = firmwarePointer.version;
        }
        if ((i14 & 2) != 0) {
            i13 = firmwarePointer.offset;
        }
        return firmwarePointer.copy(str, i13);
    }

    public static final /* synthetic */ void write$Self$firmware_update_service_release(FirmwarePointer self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.version);
        output.encodeIntElement(serialDesc, 1, self.offset);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getOffset() {
        return this.offset;
    }

    public final FirmwarePointer copy(String version, int offset) {
        AbstractC22676k.m65750j(version, "version");
        return new FirmwarePointer(version, offset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FirmwarePointer)) {
            return false;
        }
        FirmwarePointer firmwarePointer = (FirmwarePointer) other;
        return AbstractC22676k.m65745e(this.version, firmwarePointer.version) && this.offset == firmwarePointer.offset;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Integer.hashCode(this.offset) + (this.version.hashCode() * 31);
    }

    public String toString() {
        return AbstractC11895b.m31993l(this.offset, "FirmwarePointer(version=", this.version, ", offset=", ")");
    }

    public FirmwarePointer(String version, int i13) {
        AbstractC22676k.m65750j(version, "version");
        this.version = version;
        this.offset = i13;
    }
}
