package com.whoop.advancedlabs.testupload.domain.models;

import com.whoop.advancedlabs.domain.models.TestInputScreenResponse;
import com.whoop.advancedlabs.domain.models.TestInputScreenResponse$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000267B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!J:\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010!¨\u00068"}, m65681d2 = {"Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;", "", "Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;", "testInputScreen", "Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadScreen;", "testUploadScreen", "Lcom/whoop/advancedlabs/testupload/domain/models/TestPreviewScreen;", "testPreviewScreen", "Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadBottomSheet;", "uploadBottomSheet", "<init>", "(Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadScreen;Lcom/whoop/advancedlabs/testupload/domain/models/TestPreviewScreen;Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadBottomSheet;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadScreen;Lcom/whoop/advancedlabs/testupload/domain/models/TestPreviewScreen;Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadBottomSheet;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;", "component2", "()Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadScreen;", "component3", "()Lcom/whoop/advancedlabs/testupload/domain/models/TestPreviewScreen;", "component4", "()Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadBottomSheet;", "copy", "(Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadScreen;Lcom/whoop/advancedlabs/testupload/domain/models/TestPreviewScreen;Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadBottomSheet;)Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;", "getTestInputScreen", "Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadScreen;", "getTestUploadScreen", "Lcom/whoop/advancedlabs/testupload/domain/models/TestPreviewScreen;", "getTestPreviewScreen", "Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadBottomSheet;", "getUploadBottomSheet", "Companion", "$serializer", "a", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TestUploadResponse {
    private final TestInputScreenResponse testInputScreen;
    private final TestPreviewScreen testPreviewScreen;
    private final TestUploadScreen testUploadScreen;
    private final TestUploadBottomSheet uploadBottomSheet;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.advancedlabs.testupload.domain.models.TestUploadResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TestUploadResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TestUploadResponse(int i13, TestInputScreenResponse testInputScreenResponse, TestUploadScreen testUploadScreen, TestPreviewScreen testPreviewScreen, TestUploadBottomSheet testUploadBottomSheet, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, TestUploadResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.testInputScreen = testInputScreenResponse;
        this.testUploadScreen = testUploadScreen;
        this.testPreviewScreen = testPreviewScreen;
        this.uploadBottomSheet = testUploadBottomSheet;
    }

    public static /* synthetic */ TestUploadResponse copy$default(TestUploadResponse testUploadResponse, TestInputScreenResponse testInputScreenResponse, TestUploadScreen testUploadScreen, TestPreviewScreen testPreviewScreen, TestUploadBottomSheet testUploadBottomSheet, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            testInputScreenResponse = testUploadResponse.testInputScreen;
        }
        if ((i13 & 2) != 0) {
            testUploadScreen = testUploadResponse.testUploadScreen;
        }
        if ((i13 & 4) != 0) {
            testPreviewScreen = testUploadResponse.testPreviewScreen;
        }
        if ((i13 & 8) != 0) {
            testUploadBottomSheet = testUploadResponse.uploadBottomSheet;
        }
        return testUploadResponse.copy(testInputScreenResponse, testUploadScreen, testPreviewScreen, testUploadBottomSheet);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(TestUploadResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, TestInputScreenResponse$$serializer.INSTANCE, self.testInputScreen);
        output.encodeSerializableElement(serialDesc, 1, TestUploadScreen$$serializer.INSTANCE, self.testUploadScreen);
        output.encodeSerializableElement(serialDesc, 2, TestPreviewScreen$$serializer.INSTANCE, self.testPreviewScreen);
        output.encodeNullableSerializableElement(serialDesc, 3, TestUploadBottomSheet$$serializer.INSTANCE, self.uploadBottomSheet);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TestInputScreenResponse getTestInputScreen() {
        return this.testInputScreen;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TestUploadScreen getTestUploadScreen() {
        return this.testUploadScreen;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TestPreviewScreen getTestPreviewScreen() {
        return this.testPreviewScreen;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TestUploadBottomSheet getUploadBottomSheet() {
        return this.uploadBottomSheet;
    }

    public final TestUploadResponse copy(TestInputScreenResponse testInputScreen, TestUploadScreen testUploadScreen, TestPreviewScreen testPreviewScreen, TestUploadBottomSheet uploadBottomSheet) {
        AbstractC22676k.m65750j(testInputScreen, "testInputScreen");
        AbstractC22676k.m65750j(testUploadScreen, "testUploadScreen");
        AbstractC22676k.m65750j(testPreviewScreen, "testPreviewScreen");
        return new TestUploadResponse(testInputScreen, testUploadScreen, testPreviewScreen, uploadBottomSheet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TestUploadResponse)) {
            return false;
        }
        TestUploadResponse testUploadResponse = (TestUploadResponse) other;
        return AbstractC22676k.m65745e(this.testInputScreen, testUploadResponse.testInputScreen) && AbstractC22676k.m65745e(this.testUploadScreen, testUploadResponse.testUploadScreen) && AbstractC22676k.m65745e(this.testPreviewScreen, testUploadResponse.testPreviewScreen) && AbstractC22676k.m65745e(this.uploadBottomSheet, testUploadResponse.uploadBottomSheet);
    }

    public final TestInputScreenResponse getTestInputScreen() {
        return this.testInputScreen;
    }

    public final TestPreviewScreen getTestPreviewScreen() {
        return this.testPreviewScreen;
    }

    public final TestUploadScreen getTestUploadScreen() {
        return this.testUploadScreen;
    }

    public final TestUploadBottomSheet getUploadBottomSheet() {
        return this.uploadBottomSheet;
    }

    public int hashCode() {
        int iHashCode = (this.testPreviewScreen.hashCode() + ((this.testUploadScreen.hashCode() + (this.testInputScreen.hashCode() * 31)) * 31)) * 31;
        TestUploadBottomSheet testUploadBottomSheet = this.uploadBottomSheet;
        return iHashCode + (testUploadBottomSheet == null ? 0 : testUploadBottomSheet.hashCode());
    }

    public String toString() {
        return "TestUploadResponse(testInputScreen=" + this.testInputScreen + ", testUploadScreen=" + this.testUploadScreen + ", testPreviewScreen=" + this.testPreviewScreen + ", uploadBottomSheet=" + this.uploadBottomSheet + ")";
    }

    public TestUploadResponse(TestInputScreenResponse testInputScreen, TestUploadScreen testUploadScreen, TestPreviewScreen testPreviewScreen, TestUploadBottomSheet testUploadBottomSheet) {
        AbstractC22676k.m65750j(testInputScreen, "testInputScreen");
        AbstractC22676k.m65750j(testUploadScreen, "testUploadScreen");
        AbstractC22676k.m65750j(testPreviewScreen, "testPreviewScreen");
        this.testInputScreen = testInputScreen;
        this.testUploadScreen = testUploadScreen;
        this.testPreviewScreen = testPreviewScreen;
        this.uploadBottomSheet = testUploadBottomSheet;
    }
}
