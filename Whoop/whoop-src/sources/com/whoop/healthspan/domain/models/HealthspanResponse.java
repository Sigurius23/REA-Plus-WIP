package com.whoop.healthspan.domain.models;

import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ga1.C15620a;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBW\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'JT\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u001eR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00104\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b9\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b;\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010'¨\u0006@"}, m65681d2 = {"Lcom/whoop/healthspan/domain/models/HealthspanResponse;", "", "", "navigationTitle", "navigationSubtitle", "Lcom/whoop/navigation/e;", "navigationDestination", "Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;", "unlockedContent", "Lcom/whoop/healthspan/domain/models/LockedContent;", "lockedContent", "Lcom/whoop/healthspan/domain/models/MetaData;", "metadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;Lcom/whoop/healthspan/domain/models/LockedContent;Lcom/whoop/healthspan/domain/models/MetaData;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;Lcom/whoop/healthspan/domain/models/LockedContent;Lcom/whoop/healthspan/domain/models/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$healthspan_release", "(Lcom/whoop/healthspan/domain/models/HealthspanResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/navigation/e;", "component4", "()Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;", "component5", "()Lcom/whoop/healthspan/domain/models/LockedContent;", "component6", "()Lcom/whoop/healthspan/domain/models/MetaData;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;Lcom/whoop/healthspan/domain/models/LockedContent;Lcom/whoop/healthspan/domain/models/MetaData;)Lcom/whoop/healthspan/domain/models/HealthspanResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNavigationTitle", "getNavigationSubtitle", "Lcom/whoop/navigation/e;", "getNavigationDestination", "getNavigationDestination$annotations", "()V", "Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;", "getUnlockedContent", "Lcom/whoop/healthspan/domain/models/LockedContent;", "getLockedContent", "Lcom/whoop/healthspan/domain/models/MetaData;", "getMetadata", "Companion", "$serializer", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HealthspanResponse {
    private final LockedContent lockedContent;
    private final MetaData metadata;
    private final C9598e navigationDestination;
    private final String navigationSubtitle;
    private final String navigationTitle;
    private final UnlockedContentResponse unlockedContent;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C15620a(16)), null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/healthspan/domain/models/HealthspanResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/healthspan/domain/models/HealthspanResponse;", "serializer", "()Lwc3/c;", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HealthspanResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HealthspanResponse(int i13, String str, String str2, C9598e c9598e, UnlockedContentResponse unlockedContentResponse, LockedContent lockedContent, MetaData metaData, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, HealthspanResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.navigationTitle = str;
        this.navigationSubtitle = str2;
        this.navigationDestination = c9598e;
        this.unlockedContent = unlockedContentResponse;
        this.lockedContent = lockedContent;
        this.metadata = metaData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ HealthspanResponse copy$default(HealthspanResponse healthspanResponse, String str, String str2, C9598e c9598e, UnlockedContentResponse unlockedContentResponse, LockedContent lockedContent, MetaData metaData, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = healthspanResponse.navigationTitle;
        }
        if ((i13 & 2) != 0) {
            str2 = healthspanResponse.navigationSubtitle;
        }
        if ((i13 & 4) != 0) {
            c9598e = healthspanResponse.navigationDestination;
        }
        if ((i13 & 8) != 0) {
            unlockedContentResponse = healthspanResponse.unlockedContent;
        }
        if ((i13 & 16) != 0) {
            lockedContent = healthspanResponse.lockedContent;
        }
        if ((i13 & 32) != 0) {
            metaData = healthspanResponse.metadata;
        }
        LockedContent lockedContent2 = lockedContent;
        MetaData metaData2 = metaData;
        return healthspanResponse.copy(str, str2, c9598e, unlockedContentResponse, lockedContent2, metaData2);
    }

    public static /* synthetic */ void getNavigationDestination$annotations() {
    }

    public static final /* synthetic */ void write$Self$healthspan_release(HealthspanResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.navigationTitle);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.navigationSubtitle);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.navigationDestination);
        output.encodeNullableSerializableElement(serialDesc, 3, UnlockedContentResponse$$serializer.INSTANCE, self.unlockedContent);
        output.encodeNullableSerializableElement(serialDesc, 4, LockedContent$$serializer.INSTANCE, self.lockedContent);
        output.encodeNullableSerializableElement(serialDesc, 5, MetaData$$serializer.INSTANCE, self.metadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNavigationSubtitle() {
        return this.navigationSubtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final C9598e getNavigationDestination() {
        return this.navigationDestination;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final UnlockedContentResponse getUnlockedContent() {
        return this.unlockedContent;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final LockedContent getLockedContent() {
        return this.lockedContent;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final HealthspanResponse copy(String navigationTitle, String navigationSubtitle, C9598e navigationDestination, UnlockedContentResponse unlockedContent, LockedContent lockedContent, MetaData metadata) {
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(navigationDestination, "navigationDestination");
        return new HealthspanResponse(navigationTitle, navigationSubtitle, navigationDestination, unlockedContent, lockedContent, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthspanResponse)) {
            return false;
        }
        HealthspanResponse healthspanResponse = (HealthspanResponse) other;
        return AbstractC22676k.m65745e(this.navigationTitle, healthspanResponse.navigationTitle) && AbstractC22676k.m65745e(this.navigationSubtitle, healthspanResponse.navigationSubtitle) && AbstractC22676k.m65745e(this.navigationDestination, healthspanResponse.navigationDestination) && AbstractC22676k.m65745e(this.unlockedContent, healthspanResponse.unlockedContent) && AbstractC22676k.m65745e(this.lockedContent, healthspanResponse.lockedContent) && AbstractC22676k.m65745e(this.metadata, healthspanResponse.metadata);
    }

    public final LockedContent getLockedContent() {
        return this.lockedContent;
    }

    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final C9598e getNavigationDestination() {
        return this.navigationDestination;
    }

    public final String getNavigationSubtitle() {
        return this.navigationSubtitle;
    }

    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    public final UnlockedContentResponse getUnlockedContent() {
        return this.unlockedContent;
    }

    public int hashCode() {
        int iHashCode = this.navigationTitle.hashCode() * 31;
        String str = this.navigationSubtitle;
        int iM114673a = AbstractC36095b.m114673a(this.navigationDestination, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        UnlockedContentResponse unlockedContentResponse = this.unlockedContent;
        int iHashCode2 = (iM114673a + (unlockedContentResponse == null ? 0 : unlockedContentResponse.hashCode())) * 31;
        LockedContent lockedContent = this.lockedContent;
        int iHashCode3 = (iHashCode2 + (lockedContent == null ? 0 : lockedContent.hashCode())) * 31;
        MetaData metaData = this.metadata;
        return iHashCode3 + (metaData != null ? metaData.hashCode() : 0);
    }

    public String toString() {
        String str = this.navigationTitle;
        String str2 = this.navigationSubtitle;
        C9598e c9598e = this.navigationDestination;
        UnlockedContentResponse unlockedContentResponse = this.unlockedContent;
        LockedContent lockedContent = this.lockedContent;
        MetaData metaData = this.metadata;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HealthspanResponse(navigationTitle=", str, ", navigationSubtitle=", str2, ", navigationDestination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(", unlockedContent=");
        sbM32001t.append(unlockedContentResponse);
        sbM32001t.append(", lockedContent=");
        sbM32001t.append(lockedContent);
        sbM32001t.append(", metadata=");
        sbM32001t.append(metaData);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public HealthspanResponse(String navigationTitle, String str, C9598e navigationDestination, UnlockedContentResponse unlockedContentResponse, LockedContent lockedContent, MetaData metaData) {
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(navigationDestination, "navigationDestination");
        this.navigationTitle = navigationTitle;
        this.navigationSubtitle = str;
        this.navigationDestination = navigationDestination;
        this.unlockedContent = unlockedContentResponse;
        this.lockedContent = lockedContent;
        this.metadata = metaData;
    }
}
