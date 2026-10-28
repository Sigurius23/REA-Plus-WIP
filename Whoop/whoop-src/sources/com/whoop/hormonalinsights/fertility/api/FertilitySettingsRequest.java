package com.whoop.hormonalinsights.fertility.api;

import c13.AbstractC3855a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b\u0003\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0019¨\u0006("}, m65681d2 = {"Lcom/whoop/hormonalinsights/fertility/api/FertilitySettingsRequest;", "", "", "isEnabled", "", "source", "<init>", "(ZLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/fertility/api/FertilitySettingsRequest;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/whoop/hormonalinsights/fertility/api/FertilitySettingsRequest;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Ljava/lang/String;", "getSource", "Companion", "$serializer", "a", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FertilitySettingsRequest {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isEnabled;
    private final String source;

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.fertility.api.FertilitySettingsRequest$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/fertility/api/FertilitySettingsRequest$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/fertility/api/FertilitySettingsRequest;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FertilitySettingsRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ FertilitySettingsRequest(int i13, boolean z4, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, FertilitySettingsRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.isEnabled = z4;
        this.source = str;
    }

    public static /* synthetic */ FertilitySettingsRequest copy$default(FertilitySettingsRequest fertilitySettingsRequest, boolean z4, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = fertilitySettingsRequest.isEnabled;
        }
        if ((i13 & 2) != 0) {
            str = fertilitySettingsRequest.source;
        }
        return fertilitySettingsRequest.copy(z4, str);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(FertilitySettingsRequest self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.isEnabled);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.source);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final FertilitySettingsRequest copy(boolean isEnabled, String source) {
        return new FertilitySettingsRequest(isEnabled, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FertilitySettingsRequest)) {
            return false;
        }
        FertilitySettingsRequest fertilitySettingsRequest = (FertilitySettingsRequest) other;
        return this.isEnabled == fertilitySettingsRequest.isEnabled && AbstractC22676k.m65745e(this.source, fertilitySettingsRequest.source);
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isEnabled) * 31;
        String str = this.source;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        return AbstractC3855a.m11825i("FertilitySettingsRequest(isEnabled=", ", source=", this.source, ")", this.isEnabled);
    }

    public FertilitySettingsRequest(boolean z4, String str) {
        this.isEnabled = z4;
        this.source = str;
    }
}
