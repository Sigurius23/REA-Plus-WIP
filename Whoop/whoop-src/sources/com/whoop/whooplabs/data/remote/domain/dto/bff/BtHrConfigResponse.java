package com.whoop.whooplabs.data.remote.domain.dto.bff;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ2\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b%\u0010&\u001a\u0004\b\u0003\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b)\u0010\u001a¨\u0006,"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;", "", "", "isRequired", "", "requiredRegex", "blockedRegex", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whooplabs_release", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "copy", "(ZLjava/lang/String;Ljava/lang/String;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "isRequired$annotations", "()V", "Ljava/lang/String;", "getRequiredRegex", "getBlockedRegex", "Companion", "$serializer", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BtHrConfigResponse {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String blockedRegex;
    private final boolean isRequired;
    private final String requiredRegex;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;", "serializer", "()Lwc3/c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BtHrConfigResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BtHrConfigResponse(int i13, boolean z4, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, BtHrConfigResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.isRequired = z4;
        this.requiredRegex = str;
        this.blockedRegex = str2;
    }

    public static /* synthetic */ BtHrConfigResponse copy$default(BtHrConfigResponse btHrConfigResponse, boolean z4, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = btHrConfigResponse.isRequired;
        }
        if ((i13 & 2) != 0) {
            str = btHrConfigResponse.requiredRegex;
        }
        if ((i13 & 4) != 0) {
            str2 = btHrConfigResponse.blockedRegex;
        }
        return btHrConfigResponse.copy(z4, str, str2);
    }

    @InterfaceC37143h("required")
    public static /* synthetic */ void isRequired$annotations() {
    }

    public static final /* synthetic */ void write$Self$whooplabs_release(BtHrConfigResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.isRequired);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.requiredRegex);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.blockedRegex);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsRequired() {
        return this.isRequired;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRequiredRegex() {
        return this.requiredRegex;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBlockedRegex() {
        return this.blockedRegex;
    }

    public final BtHrConfigResponse copy(boolean isRequired, String requiredRegex, String blockedRegex) {
        return new BtHrConfigResponse(isRequired, requiredRegex, blockedRegex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BtHrConfigResponse)) {
            return false;
        }
        BtHrConfigResponse btHrConfigResponse = (BtHrConfigResponse) other;
        return this.isRequired == btHrConfigResponse.isRequired && AbstractC22676k.m65745e(this.requiredRegex, btHrConfigResponse.requiredRegex) && AbstractC22676k.m65745e(this.blockedRegex, btHrConfigResponse.blockedRegex);
    }

    public final String getBlockedRegex() {
        return this.blockedRegex;
    }

    public final String getRequiredRegex() {
        return this.requiredRegex;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isRequired) * 31;
        String str = this.requiredRegex;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.blockedRegex;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isRequired() {
        return this.isRequired;
    }

    public String toString() {
        boolean z4 = this.isRequired;
        return AbstractC25012a.m73376i(this.blockedRegex, ")", AbstractC13673n.m38567n("BtHrConfigResponse(isRequired=", ", requiredRegex=", this.requiredRegex, ", blockedRegex=", z4));
    }

    public BtHrConfigResponse(boolean z4, String str, String str2) {
        this.isRequired = z4;
        this.requiredRegex = str;
        this.blockedRegex = str2;
    }
}
