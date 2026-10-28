package com.whoop.labfileupload.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no2.C26995a;
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
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001b¨\u0006-"}, m65681d2 = {"Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;", "", "", "testName", "testDateTime", "Lcom/whoop/labfileupload/domain/models/ExternalDataUploadSource;", "testSource", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/labfileupload/domain/models/ExternalDataUploadSource;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/labfileupload/domain/models/ExternalDataUploadSource;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$lab_file_upload_release", "(Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/labfileupload/domain/models/ExternalDataUploadSource;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/labfileupload/domain/models/ExternalDataUploadSource;)Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTestName", "getTestDateTime", "Lcom/whoop/labfileupload/domain/models/ExternalDataUploadSource;", "getTestSource", "Companion", "$serializer", "a", "lab-file-upload_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ExternalDataUploadMetadata {
    public static final int $stable = 0;
    private final String testDateTime;
    private final String testName;
    private final ExternalDataUploadSource testSource;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C26995a(12))};

    /* JADX INFO: renamed from: com.whoop.labfileupload.domain.models.ExternalDataUploadMetadata$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;", "serializer", "()Lwc3/c;", "lab-file-upload_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ExternalDataUploadMetadata$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ExternalDataUploadMetadata(int i13, String str, String str2, ExternalDataUploadSource externalDataUploadSource, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, ExternalDataUploadMetadata$$serializer.INSTANCE.getDescriptor());
        }
        this.testName = str;
        this.testDateTime = str2;
        this.testSource = externalDataUploadSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return ExternalDataUploadSource.INSTANCE.serializer();
    }

    public static /* synthetic */ ExternalDataUploadMetadata copy$default(ExternalDataUploadMetadata externalDataUploadMetadata, String str, String str2, ExternalDataUploadSource externalDataUploadSource, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = externalDataUploadMetadata.testName;
        }
        if ((i13 & 2) != 0) {
            str2 = externalDataUploadMetadata.testDateTime;
        }
        if ((i13 & 4) != 0) {
            externalDataUploadSource = externalDataUploadMetadata.testSource;
        }
        return externalDataUploadMetadata.copy(str, str2, externalDataUploadSource);
    }

    public static final /* synthetic */ void write$Self$lab_file_upload_release(ExternalDataUploadMetadata self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.testName);
        output.encodeStringElement(serialDesc, 1, self.testDateTime);
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.testSource);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTestName() {
        return this.testName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTestDateTime() {
        return this.testDateTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ExternalDataUploadSource getTestSource() {
        return this.testSource;
    }

    public final ExternalDataUploadMetadata copy(String testName, String testDateTime, ExternalDataUploadSource testSource) {
        AbstractC22676k.m65750j(testName, "testName");
        AbstractC22676k.m65750j(testDateTime, "testDateTime");
        return new ExternalDataUploadMetadata(testName, testDateTime, testSource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalDataUploadMetadata)) {
            return false;
        }
        ExternalDataUploadMetadata externalDataUploadMetadata = (ExternalDataUploadMetadata) other;
        return AbstractC22676k.m65745e(this.testName, externalDataUploadMetadata.testName) && AbstractC22676k.m65745e(this.testDateTime, externalDataUploadMetadata.testDateTime) && this.testSource == externalDataUploadMetadata.testSource;
    }

    public final String getTestDateTime() {
        return this.testDateTime;
    }

    public final String getTestName() {
        return this.testName;
    }

    public final ExternalDataUploadSource getTestSource() {
        return this.testSource;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.testName.hashCode() * 31, 31, this.testDateTime);
        ExternalDataUploadSource externalDataUploadSource = this.testSource;
        return iM30450d + (externalDataUploadSource == null ? 0 : externalDataUploadSource.hashCode());
    }

    public String toString() {
        String str = this.testName;
        String str2 = this.testDateTime;
        ExternalDataUploadSource externalDataUploadSource = this.testSource;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ExternalDataUploadMetadata(testName=", str, ", testDateTime=", str2, ", testSource=");
        sbM32001t.append(externalDataUploadSource);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public ExternalDataUploadMetadata(String testName, String testDateTime, ExternalDataUploadSource externalDataUploadSource) {
        AbstractC22676k.m65750j(testName, "testName");
        AbstractC22676k.m65750j(testDateTime, "testDateTime");
        this.testName = testName;
        this.testDateTime = testDateTime;
        this.testSource = externalDataUploadSource;
    }
}
