package com.whoop.educationModels;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import ve.C35916a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u0018R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b-\u0010(\u001a\u0004\b,\u0010\u001b¨\u00060"}, m65681d2 = {"Lcom/whoop/educationModels/PodcastPlayer;", "", "", "serviceName", "deepLink", "Lcom/whoop/educationModels/OperatingSystem;", "operatingSystem", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/educationModels/OperatingSystem;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/educationModels/OperatingSystem;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$education_models_release", "(Lcom/whoop/educationModels/PodcastPlayer;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/educationModels/OperatingSystem;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/educationModels/OperatingSystem;)Lcom/whoop/educationModels/PodcastPlayer;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getServiceName", "getServiceName$annotations", "()V", "getDeepLink", "getDeepLink$annotations", "Lcom/whoop/educationModels/OperatingSystem;", "getOperatingSystem", "getOperatingSystem$annotations", "Companion", "$serializer", "education-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PodcastPlayer {
    public static final int $stable = 0;

    @SerializedName("deep_link")
    private final String deepLink;

    @SerializedName("os")
    private final OperatingSystem operatingSystem;

    @SerializedName("service_name")
    private final String serviceName;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C35916a(13))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/educationModels/PodcastPlayer$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/educationModels/PodcastPlayer;", "serializer", "()Lwc3/c;", "education-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PodcastPlayer$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PodcastPlayer(int i13, String str, String str2, OperatingSystem operatingSystem, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, PodcastPlayer$$serializer.INSTANCE.getDescriptor());
        }
        this.serviceName = str;
        this.deepLink = str2;
        this.operatingSystem = operatingSystem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return OperatingSystem.INSTANCE.serializer();
    }

    public static /* synthetic */ PodcastPlayer copy$default(PodcastPlayer podcastPlayer, String str, String str2, OperatingSystem operatingSystem, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = podcastPlayer.serviceName;
        }
        if ((i13 & 2) != 0) {
            str2 = podcastPlayer.deepLink;
        }
        if ((i13 & 4) != 0) {
            operatingSystem = podcastPlayer.operatingSystem;
        }
        return podcastPlayer.copy(str, str2, operatingSystem);
    }

    @InterfaceC37143h("deep_link")
    public static /* synthetic */ void getDeepLink$annotations() {
    }

    @InterfaceC37143h("os")
    public static /* synthetic */ void getOperatingSystem$annotations() {
    }

    @InterfaceC37143h("service_name")
    public static /* synthetic */ void getServiceName$annotations() {
    }

    public static final /* synthetic */ void write$Self$education_models_release(PodcastPlayer self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.serviceName);
        output.encodeStringElement(serialDesc, 1, self.deepLink);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.operatingSystem);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getServiceName() {
        return this.serviceName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeepLink() {
        return this.deepLink;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OperatingSystem getOperatingSystem() {
        return this.operatingSystem;
    }

    public final PodcastPlayer copy(String serviceName, String deepLink, OperatingSystem operatingSystem) {
        AbstractC22676k.m65750j(serviceName, "serviceName");
        AbstractC22676k.m65750j(deepLink, "deepLink");
        AbstractC22676k.m65750j(operatingSystem, "operatingSystem");
        return new PodcastPlayer(serviceName, deepLink, operatingSystem);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PodcastPlayer)) {
            return false;
        }
        PodcastPlayer podcastPlayer = (PodcastPlayer) other;
        return AbstractC22676k.m65745e(this.serviceName, podcastPlayer.serviceName) && AbstractC22676k.m65745e(this.deepLink, podcastPlayer.deepLink) && this.operatingSystem == podcastPlayer.operatingSystem;
    }

    public final String getDeepLink() {
        return this.deepLink;
    }

    public final OperatingSystem getOperatingSystem() {
        return this.operatingSystem;
    }

    public final String getServiceName() {
        return this.serviceName;
    }

    public int hashCode() {
        return this.operatingSystem.hashCode() + AbstractC11266d.m30450d(this.serviceName.hashCode() * 31, 31, this.deepLink);
    }

    public String toString() {
        String str = this.serviceName;
        String str2 = this.deepLink;
        OperatingSystem operatingSystem = this.operatingSystem;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PodcastPlayer(serviceName=", str, ", deepLink=", str2, ", operatingSystem=");
        sbM32001t.append(operatingSystem);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public PodcastPlayer(String serviceName, String deepLink, OperatingSystem operatingSystem) {
        AbstractC22676k.m65750j(serviceName, "serviceName");
        AbstractC22676k.m65750j(deepLink, "deepLink");
        AbstractC22676k.m65750j(operatingSystem, "operatingSystem");
        this.serviceName = serviceName;
        this.deepLink = deepLink;
        this.operatingSystem = operatingSystem;
    }
}
