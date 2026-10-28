package com.whoop.advancedlabs.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import tb0.C33691b;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBS\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&JN\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b)\u0010&J\u0010\u0010*\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b9\u0010&¨\u0006<"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/TestResultsResponse;", "", "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "navigationBar", "", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel;", "sections", "Lcom/whoop/advancedlabs/domain/models/TestResultBottomSheet;", "testResultBottomSheet", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "analytics", "", "testType", "<init>", "(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/TestResultBottomSheet;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/TestResultBottomSheet;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/TestResultsResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/advancedlabs/domain/models/TestResultBottomSheet;", "component4", "()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "component5", "()Ljava/lang/String;", "copy", "(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/TestResultBottomSheet;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;Ljava/lang/String;)Lcom/whoop/advancedlabs/domain/models/TestResultsResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "getNavigationBar", "Ljava/util/List;", "getSections", "Lcom/whoop/advancedlabs/domain/models/TestResultBottomSheet;", "getTestResultBottomSheet", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "getAnalytics", "Ljava/lang/String;", "getTestType", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TestResultsResponse {
    private final AdvancedLabsAnalyticsDomainModel analytics;
    private final NavigationBarModel navigationBar;
    private final List<AdvancedLabsSectionModel> sections;
    private final TestResultBottomSheet testResultBottomSheet;
    private final String testType;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C33691b(7)), null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/TestResultsResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/TestResultsResponse;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TestResultsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TestResultsResponse(int i13, NavigationBarModel navigationBarModel, List list, TestResultBottomSheet testResultBottomSheet, AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (27 != (i13 & 27)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 27, TestResultsResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.navigationBar = navigationBarModel;
        this.sections = list;
        if ((i13 & 4) == 0) {
            this.testResultBottomSheet = null;
        } else {
            this.testResultBottomSheet = testResultBottomSheet;
        }
        this.analytics = advancedLabsAnalyticsDomainModel;
        this.testType = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(AdvancedLabsSectionModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TestResultsResponse copy$default(TestResultsResponse testResultsResponse, NavigationBarModel navigationBarModel, List list, TestResultBottomSheet testResultBottomSheet, AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            navigationBarModel = testResultsResponse.navigationBar;
        }
        if ((i13 & 2) != 0) {
            list = testResultsResponse.sections;
        }
        if ((i13 & 4) != 0) {
            testResultBottomSheet = testResultsResponse.testResultBottomSheet;
        }
        if ((i13 & 8) != 0) {
            advancedLabsAnalyticsDomainModel = testResultsResponse.analytics;
        }
        if ((i13 & 16) != 0) {
            str = testResultsResponse.testType;
        }
        String str2 = str;
        TestResultBottomSheet testResultBottomSheet2 = testResultBottomSheet;
        return testResultsResponse.copy(navigationBarModel, list, testResultBottomSheet2, advancedLabsAnalyticsDomainModel, str2);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(TestResultsResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, NavigationBarModel$$serializer.INSTANCE, self.navigationBar);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.sections);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.testResultBottomSheet != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, TestResultBottomSheet$$serializer.INSTANCE, self.testResultBottomSheet);
        }
        output.encodeNullableSerializableElement(serialDesc, 3, AdvancedLabsAnalyticsDomainModel$$serializer.INSTANCE, self.analytics);
        output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.testType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NavigationBarModel getNavigationBar() {
        return this.navigationBar;
    }

    public final List<AdvancedLabsSectionModel> component2() {
        return this.sections;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TestResultBottomSheet getTestResultBottomSheet() {
        return this.testResultBottomSheet;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AdvancedLabsAnalyticsDomainModel getAnalytics() {
        return this.analytics;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTestType() {
        return this.testType;
    }

    public final TestResultsResponse copy(NavigationBarModel navigationBar, List<AdvancedLabsSectionModel> sections, TestResultBottomSheet testResultBottomSheet, AdvancedLabsAnalyticsDomainModel analytics, String testType) {
        AbstractC22676k.m65750j(navigationBar, "navigationBar");
        AbstractC22676k.m65750j(sections, "sections");
        return new TestResultsResponse(navigationBar, sections, testResultBottomSheet, analytics, testType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TestResultsResponse)) {
            return false;
        }
        TestResultsResponse testResultsResponse = (TestResultsResponse) other;
        return AbstractC22676k.m65745e(this.navigationBar, testResultsResponse.navigationBar) && AbstractC22676k.m65745e(this.sections, testResultsResponse.sections) && AbstractC22676k.m65745e(this.testResultBottomSheet, testResultsResponse.testResultBottomSheet) && AbstractC22676k.m65745e(this.analytics, testResultsResponse.analytics) && AbstractC22676k.m65745e(this.testType, testResultsResponse.testType);
    }

    public final AdvancedLabsAnalyticsDomainModel getAnalytics() {
        return this.analytics;
    }

    public final NavigationBarModel getNavigationBar() {
        return this.navigationBar;
    }

    public final List<AdvancedLabsSectionModel> getSections() {
        return this.sections;
    }

    public final TestResultBottomSheet getTestResultBottomSheet() {
        return this.testResultBottomSheet;
    }

    public final String getTestType() {
        return this.testType;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.navigationBar.hashCode() * 31, 31, this.sections);
        TestResultBottomSheet testResultBottomSheet = this.testResultBottomSheet;
        int iHashCode = (iM31983b + (testResultBottomSheet == null ? 0 : testResultBottomSheet.hashCode())) * 31;
        AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel = this.analytics;
        int iHashCode2 = (iHashCode + (advancedLabsAnalyticsDomainModel == null ? 0 : advancedLabsAnalyticsDomainModel.hashCode())) * 31;
        String str = this.testType;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        NavigationBarModel navigationBarModel = this.navigationBar;
        List<AdvancedLabsSectionModel> list = this.sections;
        TestResultBottomSheet testResultBottomSheet = this.testResultBottomSheet;
        AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel = this.analytics;
        String str = this.testType;
        StringBuilder sb4 = new StringBuilder("TestResultsResponse(navigationBar=");
        sb4.append(navigationBarModel);
        sb4.append(", sections=");
        sb4.append(list);
        sb4.append(", testResultBottomSheet=");
        sb4.append(testResultBottomSheet);
        sb4.append(", analytics=");
        sb4.append(advancedLabsAnalyticsDomainModel);
        sb4.append(", testType=");
        return AbstractC25012a.m73376i(str, ")", sb4);
    }

    public TestResultsResponse(NavigationBarModel navigationBar, List<AdvancedLabsSectionModel> sections, TestResultBottomSheet testResultBottomSheet, AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel, String str) {
        AbstractC22676k.m65750j(navigationBar, "navigationBar");
        AbstractC22676k.m65750j(sections, "sections");
        this.navigationBar = navigationBar;
        this.sections = sections;
        this.testResultBottomSheet = testResultBottomSheet;
        this.analytics = advancedLabsAnalyticsDomainModel;
        this.testType = str;
    }

    public /* synthetic */ TestResultsResponse(NavigationBarModel navigationBarModel, List list, TestResultBottomSheet testResultBottomSheet, AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(navigationBarModel, list, (i13 & 4) != 0 ? null : testResultBottomSheet, advancedLabsAnalyticsDomainModel, str);
    }
}
