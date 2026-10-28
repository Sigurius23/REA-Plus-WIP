package com.whoop.navigation;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J4\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\u0017¨\u0006+"}, m65681d2 = {"Lcom/whoop/navigation/AdvancedLabsJoinScreenModel;", "Lcom/whoop/navigation/CommonNavigationScreenModel;", "", "source", "testCount", "initiallySelectedSegmentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/AdvancedLabsJoinScreenModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/navigation/AdvancedLabsJoinScreenModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSource", "getTestCount", "getInitiallySelectedSegmentId", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AdvancedLabsJoinScreenModel implements CommonNavigationScreenModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String initiallySelectedSegmentId;
    private final String source;
    private final String testCount;

    /* JADX INFO: renamed from: com.whoop.navigation.AdvancedLabsJoinScreenModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/AdvancedLabsJoinScreenModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/AdvancedLabsJoinScreenModel;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AdvancedLabsJoinScreenModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AdvancedLabsJoinScreenModel(int i13, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, AdvancedLabsJoinScreenModel$$serializer.INSTANCE.getDescriptor());
        }
        this.source = str;
        this.testCount = str2;
        if ((i13 & 4) == 0) {
            this.initiallySelectedSegmentId = null;
        } else {
            this.initiallySelectedSegmentId = str3;
        }
    }

    public static /* synthetic */ AdvancedLabsJoinScreenModel copy$default(AdvancedLabsJoinScreenModel advancedLabsJoinScreenModel, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = advancedLabsJoinScreenModel.source;
        }
        if ((i13 & 2) != 0) {
            str2 = advancedLabsJoinScreenModel.testCount;
        }
        if ((i13 & 4) != 0) {
            str3 = advancedLabsJoinScreenModel.initiallySelectedSegmentId;
        }
        return advancedLabsJoinScreenModel.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$navigation_release(AdvancedLabsJoinScreenModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.source);
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.testCount);
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.initiallySelectedSegmentId == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.initiallySelectedSegmentId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTestCount() {
        return this.testCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getInitiallySelectedSegmentId() {
        return this.initiallySelectedSegmentId;
    }

    public final AdvancedLabsJoinScreenModel copy(String source, String testCount, String initiallySelectedSegmentId) {
        return new AdvancedLabsJoinScreenModel(source, testCount, initiallySelectedSegmentId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvancedLabsJoinScreenModel)) {
            return false;
        }
        AdvancedLabsJoinScreenModel advancedLabsJoinScreenModel = (AdvancedLabsJoinScreenModel) other;
        return AbstractC22676k.m65745e(this.source, advancedLabsJoinScreenModel.source) && AbstractC22676k.m65745e(this.testCount, advancedLabsJoinScreenModel.testCount) && AbstractC22676k.m65745e(this.initiallySelectedSegmentId, advancedLabsJoinScreenModel.initiallySelectedSegmentId);
    }

    public final String getInitiallySelectedSegmentId() {
        return this.initiallySelectedSegmentId;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getTestCount() {
        return this.testCount;
    }

    public int hashCode() {
        String str = this.source;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.testCount;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.initiallySelectedSegmentId;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.initiallySelectedSegmentId, ")", AbstractC11895b.m32001t("AdvancedLabsJoinScreenModel(source=", this.source, ", testCount=", this.testCount, ", initiallySelectedSegmentId="));
    }

    public AdvancedLabsJoinScreenModel(String str, String str2, String str3) {
        this.source = str;
        this.testCount = str2;
        this.initiallySelectedSegmentId = str3;
    }

    public /* synthetic */ AdvancedLabsJoinScreenModel(String str, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? null : str3);
    }
}
