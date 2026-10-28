package com.whoop.shepherd.feature.detail.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.items.CtaTileModel;
import com.whoop.design.models.items.CtaTileModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u0019¨\u0006,"}, m65681d2 = {"Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;", "", "", "upsellDescription", "Lcom/whoop/design/models/items/CtaTileModel;", "labradorNewRecordingCta", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$shepherd_release", "(Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/items/CtaTileModel;", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;)Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUpsellDescription", "getUpsellDescription$annotations", "()V", "Lcom/whoop/design/models/items/CtaTileModel;", "getLabradorNewRecordingCta", "getLabradorNewRecordingCta$annotations", "Companion", "$serializer", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LabradorItemInfo {

    @SerializedName("ecg_new_recording")
    private final CtaTileModel labradorNewRecordingCta;

    @SerializedName("upsell_description")
    private final String upsellDescription;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = CtaTileModel.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;", "serializer", "()Lwc3/c;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LabradorItemInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ LabradorItemInfo(int i13, String str, CtaTileModel ctaTileModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i13 & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2, LabradorItemInfo$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.upsellDescription = null;
        } else {
            this.upsellDescription = str;
        }
        this.labradorNewRecordingCta = ctaTileModel;
    }

    public static /* synthetic */ LabradorItemInfo copy$default(LabradorItemInfo labradorItemInfo, String str, CtaTileModel ctaTileModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = labradorItemInfo.upsellDescription;
        }
        if ((i13 & 2) != 0) {
            ctaTileModel = labradorItemInfo.labradorNewRecordingCta;
        }
        return labradorItemInfo.copy(str, ctaTileModel);
    }

    @InterfaceC37143h("ecg_new_recording")
    public static /* synthetic */ void getLabradorNewRecordingCta$annotations() {
    }

    @InterfaceC37143h("maverick_description")
    public static /* synthetic */ void getUpsellDescription$annotations() {
    }

    public static final /* synthetic */ void write$Self$shepherd_release(LabradorItemInfo self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.upsellDescription != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.upsellDescription);
        }
        output.encodeSerializableElement(serialDesc, 1, CtaTileModel$$serializer.INSTANCE, self.labradorNewRecordingCta);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUpsellDescription() {
        return this.upsellDescription;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CtaTileModel getLabradorNewRecordingCta() {
        return this.labradorNewRecordingCta;
    }

    public final LabradorItemInfo copy(String upsellDescription, CtaTileModel labradorNewRecordingCta) {
        AbstractC22676k.m65750j(labradorNewRecordingCta, "labradorNewRecordingCta");
        return new LabradorItemInfo(upsellDescription, labradorNewRecordingCta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LabradorItemInfo)) {
            return false;
        }
        LabradorItemInfo labradorItemInfo = (LabradorItemInfo) other;
        return AbstractC22676k.m65745e(this.upsellDescription, labradorItemInfo.upsellDescription) && AbstractC22676k.m65745e(this.labradorNewRecordingCta, labradorItemInfo.labradorNewRecordingCta);
    }

    public final CtaTileModel getLabradorNewRecordingCta() {
        return this.labradorNewRecordingCta;
    }

    public final String getUpsellDescription() {
        return this.upsellDescription;
    }

    public int hashCode() {
        String str = this.upsellDescription;
        return this.labradorNewRecordingCta.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return "LabradorItemInfo(upsellDescription=" + this.upsellDescription + ", labradorNewRecordingCta=" + this.labradorNewRecordingCta + ")";
    }

    public LabradorItemInfo(String str, CtaTileModel labradorNewRecordingCta) {
        AbstractC22676k.m65750j(labradorNewRecordingCta, "labradorNewRecordingCta");
        this.upsellDescription = str;
        this.labradorNewRecordingCta = labradorNewRecordingCta;
    }

    public /* synthetic */ LabradorItemInfo(String str, CtaTileModel ctaTileModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, ctaTileModel);
    }
}
