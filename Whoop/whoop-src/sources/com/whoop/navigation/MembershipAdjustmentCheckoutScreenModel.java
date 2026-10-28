package com.whoop.navigation;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import j02.C21137d0;
import java.util.Map;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B1\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bBG\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ@\u0010\u001c\u001a\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R%\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b*\u0010\u001a¨\u0006."}, m65681d2 = {"Lcom/whoop/navigation/MembershipAdjustmentCheckoutScreenModel;", "Lcom/whoop/navigation/CommonNavigationScreenModel;", "", "", "payload", "trackingTier", "trackingSource", "<init>", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/Map;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/MembershipAdjustmentCheckoutScreenModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/Map;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/navigation/MembershipAdjustmentCheckoutScreenModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getPayload", "Ljava/lang/String;", "getTrackingTier", "getTrackingSource", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MembershipAdjustmentCheckoutScreenModel implements CommonNavigationScreenModel {
    private final Map<String, String> payload;
    private final String trackingSource;
    private final String trackingTier;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C21137d0(8)), null, null};

    /* JADX INFO: renamed from: com.whoop.navigation.MembershipAdjustmentCheckoutScreenModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/MembershipAdjustmentCheckoutScreenModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/MembershipAdjustmentCheckoutScreenModel;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MembershipAdjustmentCheckoutScreenModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MembershipAdjustmentCheckoutScreenModel(int i13, Map map, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, MembershipAdjustmentCheckoutScreenModel$$serializer.INSTANCE.getDescriptor());
        }
        this.payload = map;
        this.trackingTier = str;
        this.trackingSource = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, AbstractC38195a.m122336d(stringSerializer));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MembershipAdjustmentCheckoutScreenModel copy$default(MembershipAdjustmentCheckoutScreenModel membershipAdjustmentCheckoutScreenModel, Map map, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            map = membershipAdjustmentCheckoutScreenModel.payload;
        }
        if ((i13 & 2) != 0) {
            str = membershipAdjustmentCheckoutScreenModel.trackingTier;
        }
        if ((i13 & 4) != 0) {
            str2 = membershipAdjustmentCheckoutScreenModel.trackingSource;
        }
        return membershipAdjustmentCheckoutScreenModel.copy(map, str, str2);
    }

    public static final /* synthetic */ void write$Self$navigation_release(MembershipAdjustmentCheckoutScreenModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.payload);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.trackingTier);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.trackingSource);
    }

    public final Map<String, String> component1() {
        return this.payload;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTrackingTier() {
        return this.trackingTier;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTrackingSource() {
        return this.trackingSource;
    }

    public final MembershipAdjustmentCheckoutScreenModel copy(Map<String, String> payload, String trackingTier, String trackingSource) {
        AbstractC22676k.m65750j(payload, "payload");
        return new MembershipAdjustmentCheckoutScreenModel(payload, trackingTier, trackingSource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MembershipAdjustmentCheckoutScreenModel)) {
            return false;
        }
        MembershipAdjustmentCheckoutScreenModel membershipAdjustmentCheckoutScreenModel = (MembershipAdjustmentCheckoutScreenModel) other;
        return AbstractC22676k.m65745e(this.payload, membershipAdjustmentCheckoutScreenModel.payload) && AbstractC22676k.m65745e(this.trackingTier, membershipAdjustmentCheckoutScreenModel.trackingTier) && AbstractC22676k.m65745e(this.trackingSource, membershipAdjustmentCheckoutScreenModel.trackingSource);
    }

    public final Map<String, String> getPayload() {
        return this.payload;
    }

    public final String getTrackingSource() {
        return this.trackingSource;
    }

    public final String getTrackingTier() {
        return this.trackingTier;
    }

    public int hashCode() {
        int iHashCode = this.payload.hashCode() * 31;
        String str = this.trackingTier;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.trackingSource;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        Map<String, String> map = this.payload;
        String str = this.trackingTier;
        String str2 = this.trackingSource;
        StringBuilder sb4 = new StringBuilder("MembershipAdjustmentCheckoutScreenModel(payload=");
        sb4.append(map);
        sb4.append(", trackingTier=");
        sb4.append(str);
        sb4.append(", trackingSource=");
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }

    public MembershipAdjustmentCheckoutScreenModel(Map<String, String> payload, String str, String str2) {
        AbstractC22676k.m65750j(payload, "payload");
        this.payload = payload;
        this.trackingTier = str;
        this.trackingSource = str2;
    }
}
