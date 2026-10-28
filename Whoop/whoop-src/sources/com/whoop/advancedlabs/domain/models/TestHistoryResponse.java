package com.whoop.advancedlabs.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ8\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b-\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001f¨\u00062"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;", "", "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "navigationBar", "", "title", "subtitle", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;", "paginatedRecords", "<init>", "(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;", "copy", "(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;)Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "getNavigationBar", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;", "getPaginatedRecords", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TestHistoryResponse {
    private final NavigationBarModel navigationBar;
    private final AdvancedLabsPaginatedTestHistory paginatedRecords;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TestHistoryResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TestHistoryResponse(int i13, NavigationBarModel navigationBarModel, String str, String str2, AdvancedLabsPaginatedTestHistory advancedLabsPaginatedTestHistory, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, TestHistoryResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.navigationBar = navigationBarModel;
        this.title = str;
        this.subtitle = str2;
        this.paginatedRecords = advancedLabsPaginatedTestHistory;
    }

    public static /* synthetic */ TestHistoryResponse copy$default(TestHistoryResponse testHistoryResponse, NavigationBarModel navigationBarModel, String str, String str2, AdvancedLabsPaginatedTestHistory advancedLabsPaginatedTestHistory, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            navigationBarModel = testHistoryResponse.navigationBar;
        }
        if ((i13 & 2) != 0) {
            str = testHistoryResponse.title;
        }
        if ((i13 & 4) != 0) {
            str2 = testHistoryResponse.subtitle;
        }
        if ((i13 & 8) != 0) {
            advancedLabsPaginatedTestHistory = testHistoryResponse.paginatedRecords;
        }
        return testHistoryResponse.copy(navigationBarModel, str, str2, advancedLabsPaginatedTestHistory);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(TestHistoryResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, NavigationBarModel$$serializer.INSTANCE, self.navigationBar);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.subtitle);
        output.encodeSerializableElement(serialDesc, 3, AdvancedLabsPaginatedTestHistory$$serializer.INSTANCE, self.paginatedRecords);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NavigationBarModel getNavigationBar() {
        return this.navigationBar;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AdvancedLabsPaginatedTestHistory getPaginatedRecords() {
        return this.paginatedRecords;
    }

    public final TestHistoryResponse copy(NavigationBarModel navigationBar, String title, String subtitle, AdvancedLabsPaginatedTestHistory paginatedRecords) {
        AbstractC22676k.m65750j(navigationBar, "navigationBar");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(paginatedRecords, "paginatedRecords");
        return new TestHistoryResponse(navigationBar, title, subtitle, paginatedRecords);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TestHistoryResponse)) {
            return false;
        }
        TestHistoryResponse testHistoryResponse = (TestHistoryResponse) other;
        return AbstractC22676k.m65745e(this.navigationBar, testHistoryResponse.navigationBar) && AbstractC22676k.m65745e(this.title, testHistoryResponse.title) && AbstractC22676k.m65745e(this.subtitle, testHistoryResponse.subtitle) && AbstractC22676k.m65745e(this.paginatedRecords, testHistoryResponse.paginatedRecords);
    }

    public final NavigationBarModel getNavigationBar() {
        return this.navigationBar;
    }

    public final AdvancedLabsPaginatedTestHistory getPaginatedRecords() {
        return this.paginatedRecords;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.paginatedRecords.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.navigationBar.hashCode() * 31, 31, this.title), 31, this.subtitle);
    }

    public String toString() {
        return "TestHistoryResponse(navigationBar=" + this.navigationBar + ", title=" + this.title + ", subtitle=" + this.subtitle + ", paginatedRecords=" + this.paginatedRecords + ")";
    }

    public TestHistoryResponse(NavigationBarModel navigationBar, String title, String subtitle, AdvancedLabsPaginatedTestHistory paginatedRecords) {
        AbstractC22676k.m65750j(navigationBar, "navigationBar");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(paginatedRecords, "paginatedRecords");
        this.navigationBar = navigationBar;
        this.title = title;
        this.subtitle = subtitle;
        this.paginatedRecords = paginatedRecords;
    }
}
