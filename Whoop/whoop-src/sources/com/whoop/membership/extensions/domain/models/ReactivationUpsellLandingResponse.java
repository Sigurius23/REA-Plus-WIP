package com.whoop.membership.extensions.domain.models;

import c13.AbstractC3855a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gw1.C16268a;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fBQ\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b \u0010!JJ\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u0010!¨\u00064"}, m65681d2 = {"Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;", "", "", "navigationBarText", "trackingLabel", "trackingValue", "", "initiallySelectedSegmentIndex", "", "Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellSegment;", "segments", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$membership_release", "(Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()I", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNavigationBarText", "getTrackingLabel", "getTrackingValue", "I", "getInitiallySelectedSegmentIndex", "Ljava/util/List;", "getSegments", "Companion", "$serializer", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ReactivationUpsellLandingResponse {
    private final int initiallySelectedSegmentIndex;
    private final String navigationBarText;
    private final List<ReactivationUpsellSegment> segments;
    private final String trackingLabel;
    private final String trackingValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C16268a(10))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;", "serializer", "()Lwc3/c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ReactivationUpsellLandingResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ReactivationUpsellLandingResponse(int i13, String str, String str2, String str3, int i14, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, ReactivationUpsellLandingResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.navigationBarText = str;
        this.trackingLabel = str2;
        this.trackingValue = str3;
        this.initiallySelectedSegmentIndex = i14;
        this.segments = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ReactivationUpsellSegment$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReactivationUpsellLandingResponse copy$default(ReactivationUpsellLandingResponse reactivationUpsellLandingResponse, String str, String str2, String str3, int i13, List list, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = reactivationUpsellLandingResponse.navigationBarText;
        }
        if ((i14 & 2) != 0) {
            str2 = reactivationUpsellLandingResponse.trackingLabel;
        }
        if ((i14 & 4) != 0) {
            str3 = reactivationUpsellLandingResponse.trackingValue;
        }
        if ((i14 & 8) != 0) {
            i13 = reactivationUpsellLandingResponse.initiallySelectedSegmentIndex;
        }
        if ((i14 & 16) != 0) {
            list = reactivationUpsellLandingResponse.segments;
        }
        List list2 = list;
        String str4 = str3;
        return reactivationUpsellLandingResponse.copy(str, str2, str4, i13, list2);
    }

    public static final /* synthetic */ void write$Self$membership_release(ReactivationUpsellLandingResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.navigationBarText);
        output.encodeStringElement(serialDesc, 1, self.trackingLabel);
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.trackingValue);
        output.encodeIntElement(serialDesc, 3, self.initiallySelectedSegmentIndex);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.segments);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNavigationBarText() {
        return this.navigationBarText;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTrackingLabel() {
        return this.trackingLabel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTrackingValue() {
        return this.trackingValue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getInitiallySelectedSegmentIndex() {
        return this.initiallySelectedSegmentIndex;
    }

    public final List<ReactivationUpsellSegment> component5() {
        return this.segments;
    }

    public final ReactivationUpsellLandingResponse copy(String navigationBarText, String trackingLabel, String trackingValue, int initiallySelectedSegmentIndex, List<ReactivationUpsellSegment> segments) {
        AbstractC22676k.m65750j(navigationBarText, "navigationBarText");
        AbstractC22676k.m65750j(trackingLabel, "trackingLabel");
        AbstractC22676k.m65750j(segments, "segments");
        return new ReactivationUpsellLandingResponse(navigationBarText, trackingLabel, trackingValue, initiallySelectedSegmentIndex, segments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReactivationUpsellLandingResponse)) {
            return false;
        }
        ReactivationUpsellLandingResponse reactivationUpsellLandingResponse = (ReactivationUpsellLandingResponse) other;
        return AbstractC22676k.m65745e(this.navigationBarText, reactivationUpsellLandingResponse.navigationBarText) && AbstractC22676k.m65745e(this.trackingLabel, reactivationUpsellLandingResponse.trackingLabel) && AbstractC22676k.m65745e(this.trackingValue, reactivationUpsellLandingResponse.trackingValue) && this.initiallySelectedSegmentIndex == reactivationUpsellLandingResponse.initiallySelectedSegmentIndex && AbstractC22676k.m65745e(this.segments, reactivationUpsellLandingResponse.segments);
    }

    public final int getInitiallySelectedSegmentIndex() {
        return this.initiallySelectedSegmentIndex;
    }

    public final String getNavigationBarText() {
        return this.navigationBarText;
    }

    public final List<ReactivationUpsellSegment> getSegments() {
        return this.segments;
    }

    public final String getTrackingLabel() {
        return this.trackingLabel;
    }

    public final String getTrackingValue() {
        return this.trackingValue;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.navigationBarText.hashCode() * 31, 31, this.trackingLabel);
        String str = this.trackingValue;
        return this.segments.hashCode() + AbstractC11266d.m30448b(this.initiallySelectedSegmentIndex, (iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public String toString() {
        String str = this.navigationBarText;
        String str2 = this.trackingLabel;
        String str3 = this.trackingValue;
        int i13 = this.initiallySelectedSegmentIndex;
        List<ReactivationUpsellSegment> list = this.segments;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ReactivationUpsellLandingResponse(navigationBarText=", str, ", trackingLabel=", str2, ", trackingValue=");
        AbstractC11266d.m30470x(i13, str3, ", initiallySelectedSegmentIndex=", ", segments=", sbM32001t);
        return AbstractC3855a.m11829m(sbM32001t, list, ")");
    }

    public ReactivationUpsellLandingResponse(String navigationBarText, String trackingLabel, String str, int i13, List<ReactivationUpsellSegment> segments) {
        AbstractC22676k.m65750j(navigationBarText, "navigationBarText");
        AbstractC22676k.m65750j(trackingLabel, "trackingLabel");
        AbstractC22676k.m65750j(segments, "segments");
        this.navigationBarText = navigationBarText;
        this.trackingLabel = trackingLabel;
        this.trackingValue = str;
        this.initiallySelectedSegmentIndex = i13;
        this.segments = segments;
    }
}
