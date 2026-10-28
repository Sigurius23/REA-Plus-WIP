package com.whoop.advancedlabs.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nh3.AbstractC26725a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import t91.C33662a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ8\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00060"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;", "", "", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsTestHistorySection;", "sections", "", "nextToken", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "analytics", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "copy", "(Ljava/util/List;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;)Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSections", "Ljava/lang/String;", "getNextToken", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "getAnalytics", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AdvancedLabsPaginatedTestHistory {
    private final AdvancedLabsAnalyticsDomainModel analytics;
    private final String nextToken;
    private final List<AdvancedLabsTestHistorySection> sections;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C33662a(10)), null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AdvancedLabsPaginatedTestHistory$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AdvancedLabsPaginatedTestHistory(int i13, List list, String str, AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, AdvancedLabsPaginatedTestHistory$$serializer.INSTANCE.getDescriptor());
        }
        this.sections = list;
        this.nextToken = str;
        this.analytics = advancedLabsAnalyticsDomainModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(AdvancedLabsTestHistorySection$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdvancedLabsPaginatedTestHistory copy$default(AdvancedLabsPaginatedTestHistory advancedLabsPaginatedTestHistory, List list, String str, AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = advancedLabsPaginatedTestHistory.sections;
        }
        if ((i13 & 2) != 0) {
            str = advancedLabsPaginatedTestHistory.nextToken;
        }
        if ((i13 & 4) != 0) {
            advancedLabsAnalyticsDomainModel = advancedLabsPaginatedTestHistory.analytics;
        }
        return advancedLabsPaginatedTestHistory.copy(list, str, advancedLabsAnalyticsDomainModel);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(AdvancedLabsPaginatedTestHistory self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.sections);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.nextToken);
        output.encodeNullableSerializableElement(serialDesc, 2, AdvancedLabsAnalyticsDomainModel$$serializer.INSTANCE, self.analytics);
    }

    public final List<AdvancedLabsTestHistorySection> component1() {
        return this.sections;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNextToken() {
        return this.nextToken;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AdvancedLabsAnalyticsDomainModel getAnalytics() {
        return this.analytics;
    }

    public final AdvancedLabsPaginatedTestHistory copy(List<AdvancedLabsTestHistorySection> sections, String nextToken, AdvancedLabsAnalyticsDomainModel analytics) {
        AbstractC22676k.m65750j(sections, "sections");
        return new AdvancedLabsPaginatedTestHistory(sections, nextToken, analytics);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvancedLabsPaginatedTestHistory)) {
            return false;
        }
        AdvancedLabsPaginatedTestHistory advancedLabsPaginatedTestHistory = (AdvancedLabsPaginatedTestHistory) other;
        return AbstractC22676k.m65745e(this.sections, advancedLabsPaginatedTestHistory.sections) && AbstractC22676k.m65745e(this.nextToken, advancedLabsPaginatedTestHistory.nextToken) && AbstractC22676k.m65745e(this.analytics, advancedLabsPaginatedTestHistory.analytics);
    }

    public final AdvancedLabsAnalyticsDomainModel getAnalytics() {
        return this.analytics;
    }

    public final String getNextToken() {
        return this.nextToken;
    }

    public final List<AdvancedLabsTestHistorySection> getSections() {
        return this.sections;
    }

    public int hashCode() {
        int iHashCode = this.sections.hashCode() * 31;
        String str = this.nextToken;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel = this.analytics;
        return iHashCode2 + (advancedLabsAnalyticsDomainModel != null ? advancedLabsAnalyticsDomainModel.hashCode() : 0);
    }

    public String toString() {
        List<AdvancedLabsTestHistorySection> list = this.sections;
        String str = this.nextToken;
        AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel = this.analytics;
        StringBuilder sbM79507k = AbstractC26725a.m79507k("AdvancedLabsPaginatedTestHistory(sections=", ", nextToken=", str, ", analytics=", list);
        sbM79507k.append(advancedLabsAnalyticsDomainModel);
        sbM79507k.append(")");
        return sbM79507k.toString();
    }

    public AdvancedLabsPaginatedTestHistory(List<AdvancedLabsTestHistorySection> sections, String str, AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel) {
        AbstractC22676k.m65750j(sections, "sections");
        this.sections = sections;
        this.nextToken = str;
        this.analytics = advancedLabsAnalyticsDomainModel;
    }
}
