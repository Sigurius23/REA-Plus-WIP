package we0;

import com.whoop.advancedlabs.testupload.domain.models.TestUploadResponse;
import java.util.List;
import ns1.AbstractC27104b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: we0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lwe0/d;", "", "Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;", "response", "", "Lns1/b;", "processedFiles", "<init>", "(Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;", "b", "()Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;", "Ljava/util/List;", "()Ljava/util/List;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37214d implements InterfaceC37212b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TestUploadResponse response;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<AbstractC27104b> processedFiles;

    /* JADX WARN: Multi-variable type inference failed */
    public C37214d(TestUploadResponse response, List<? extends AbstractC27104b> processedFiles) {
        AbstractC22676k.m65750j(response, "response");
        AbstractC22676k.m65750j(processedFiles, "processedFiles");
        this.response = response;
        this.processedFiles = processedFiles;
    }

    /* JADX INFO: renamed from: a */
    public final List<AbstractC27104b> m119251a() {
        return this.processedFiles;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public TestUploadResponse getResponse() {
        return this.response;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37214d)) {
            return false;
        }
        C37214d c37214d = (C37214d) other;
        return AbstractC22676k.m65745e(this.response, c37214d.response) && AbstractC22676k.m65745e(this.processedFiles, c37214d.processedFiles);
    }

    public int hashCode() {
        return this.processedFiles.hashCode() + (this.response.hashCode() * 31);
    }

    public String toString() {
        return "Preview(response=" + this.response + ", processedFiles=" + this.processedFiles + ")";
    }
}
