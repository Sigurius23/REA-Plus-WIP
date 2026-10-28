package d60;

import androidx.core.app.NotificationCompat;
import com.whoop.access.reconfirmlabs.domain.models.ReconfirmLabsScreenResponse;
import f60.InterfaceC14136a;
import java.util.List;
import m83.C25271y;
import ns1.AbstractC27104b;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: d60.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJN\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b \u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, m65681d2 = {"Ld60/c;", "", "Ld60/a;", "currentDialogType", "Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;", "response", "", "Lns1/b;", "processedFiles", "Ld60/e;", "uploadStatus", "Lf60/a;", NotificationCompat.CATEGORY_EVENT, "<init>", "(Ld60/a;Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;Ljava/util/List;Ld60/e;Lf60/a;)V", "a", "(Ld60/a;Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;Ljava/util/List;Ld60/e;Lf60/a;)Ld60/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ld60/a;", "c", "()Ld60/a;", "b", "Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;", "e", "()Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;", "Ljava/util/List;", "d", "()Ljava/util/List;", "Ld60/e;", "f", "()Ld60/e;", "Lf60/a;", "getEvent", "()Lf60/a;", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11729c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC11727a currentDialogType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ReconfirmLabsScreenResponse response;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<AbstractC27104b> processedFiles;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC11731e uploadStatus;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC14136a event;

    /* JADX WARN: Multi-variable type inference failed */
    public C11729c(InterfaceC11727a interfaceC11727a, ReconfirmLabsScreenResponse reconfirmLabsScreenResponse, List<? extends AbstractC27104b> processedFiles, InterfaceC11731e uploadStatus, InterfaceC14136a interfaceC14136a) {
        AbstractC22676k.m65750j(processedFiles, "processedFiles");
        AbstractC22676k.m65750j(uploadStatus, "uploadStatus");
        this.currentDialogType = interfaceC11727a;
        this.response = reconfirmLabsScreenResponse;
        this.processedFiles = processedFiles;
        this.uploadStatus = uploadStatus;
        this.event = interfaceC14136a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C11729c m31334b(C11729c c11729c, InterfaceC11727a interfaceC11727a, ReconfirmLabsScreenResponse reconfirmLabsScreenResponse, List list, InterfaceC11731e interfaceC11731e, InterfaceC14136a interfaceC14136a, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC11727a = c11729c.currentDialogType;
        }
        if ((i13 & 2) != 0) {
            reconfirmLabsScreenResponse = c11729c.response;
        }
        if ((i13 & 4) != 0) {
            list = c11729c.processedFiles;
        }
        if ((i13 & 8) != 0) {
            interfaceC11731e = c11729c.uploadStatus;
        }
        if ((i13 & 16) != 0) {
            interfaceC14136a = c11729c.event;
        }
        InterfaceC14136a interfaceC14136a2 = interfaceC14136a;
        List list2 = list;
        return c11729c.m31335a(interfaceC11727a, reconfirmLabsScreenResponse, list2, interfaceC11731e, interfaceC14136a2);
    }

    /* JADX INFO: renamed from: a */
    public final C11729c m31335a(InterfaceC11727a currentDialogType, ReconfirmLabsScreenResponse response, List<? extends AbstractC27104b> processedFiles, InterfaceC11731e uploadStatus, InterfaceC14136a event) {
        AbstractC22676k.m65750j(processedFiles, "processedFiles");
        AbstractC22676k.m65750j(uploadStatus, "uploadStatus");
        return new C11729c(currentDialogType, response, processedFiles, uploadStatus, event);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC11727a getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: d */
    public final List<AbstractC27104b> m31337d() {
        return this.processedFiles;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final ReconfirmLabsScreenResponse getResponse() {
        return this.response;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11729c)) {
            return false;
        }
        C11729c c11729c = (C11729c) other;
        return AbstractC22676k.m65745e(this.currentDialogType, c11729c.currentDialogType) && AbstractC22676k.m65745e(this.response, c11729c.response) && AbstractC22676k.m65745e(this.processedFiles, c11729c.processedFiles) && AbstractC22676k.m65745e(this.uploadStatus, c11729c.uploadStatus) && AbstractC22676k.m65745e(this.event, c11729c.event);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final InterfaceC11731e getUploadStatus() {
        return this.uploadStatus;
    }

    public int hashCode() {
        InterfaceC11727a interfaceC11727a = this.currentDialogType;
        int iHashCode = (interfaceC11727a == null ? 0 : interfaceC11727a.hashCode()) * 31;
        ReconfirmLabsScreenResponse reconfirmLabsScreenResponse = this.response;
        int iHashCode2 = (this.uploadStatus.hashCode() + AbstractC11895b.m31983b((iHashCode + (reconfirmLabsScreenResponse == null ? 0 : reconfirmLabsScreenResponse.hashCode())) * 31, 31, this.processedFiles)) * 31;
        InterfaceC14136a interfaceC14136a = this.event;
        return iHashCode2 + (interfaceC14136a != null ? interfaceC14136a.hashCode() : 0);
    }

    public String toString() {
        return "ReconfirmLabsDomainState(currentDialogType=" + this.currentDialogType + ", response=" + this.response + ", processedFiles=" + this.processedFiles + ", uploadStatus=" + this.uploadStatus + ", event=" + this.event + ")";
    }

    public /* synthetic */ C11729c(InterfaceC11727a interfaceC11727a, ReconfirmLabsScreenResponse reconfirmLabsScreenResponse, List list, InterfaceC11731e interfaceC11731e, InterfaceC14136a interfaceC14136a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : interfaceC11727a, (i13 & 2) != 0 ? null : reconfirmLabsScreenResponse, (i13 & 4) != 0 ? C25271y.f99162w : list, (i13 & 8) != 0 ? InterfaceC11731e.b.f37972a : interfaceC11731e, (i13 & 16) != 0 ? null : interfaceC14136a);
    }
}
