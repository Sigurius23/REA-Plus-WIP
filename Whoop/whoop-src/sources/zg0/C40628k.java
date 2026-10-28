package zg0;

import android.net.Uri;
import com.whoop.p057ai.chat.models.AttachmentType;
import kd1.AbstractC22403o;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: zg0.k */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b\u0018\u0010\u0011R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b!\u0010%\u001a\u0004\b\u001c\u0010\u0011R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\b \u0010'¨\u0006("}, m65681d2 = {"Lzg0/k;", "", "Lcom/whoop/ai/chat/models/AttachmentType;", "type", "", "isUploading", "isError", "Landroid/net/Uri;", "uri", "", "displayName", "fileId", "Lkd1/o;", "imageSource", "<init>", "(Lcom/whoop/ai/chat/models/AttachmentType;ZZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lkd1/o;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/ai/chat/models/AttachmentType;", "d", "()Lcom/whoop/ai/chat/models/AttachmentType;", "b", "Z", "g", "()Z", "c", "f", "Landroid/net/Uri;", "e", "()Landroid/net/Uri;", "Ljava/lang/String;", "Lkd1/o;", "()Lkd1/o;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40628k {

    /* JADX INFO: renamed from: h */
    public static final int f175207h = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AttachmentType type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isUploading;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Uri uri;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String displayName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String fileId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final AbstractC22403o imageSource;

    public C40628k(AttachmentType type, boolean z4, boolean z13, Uri uri, String displayName, String str, AbstractC22403o abstractC22403o) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(displayName, "displayName");
        this.type = type;
        this.isUploading = z4;
        this.isError = z13;
        this.uri = uri;
        this.displayName = displayName;
        this.fileId = str;
        this.imageSource = abstractC22403o;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFileId() {
        return this.fileId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC22403o getImageSource() {
        return this.imageSource;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AttachmentType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40628k)) {
            return false;
        }
        C40628k c40628k = (C40628k) other;
        return this.type == c40628k.type && this.isUploading == c40628k.isUploading && this.isError == c40628k.isError && AbstractC22676k.m65745e(this.uri, c40628k.uri) && AbstractC22676k.m65745e(this.displayName, c40628k.displayName) && AbstractC22676k.m65745e(this.fileId, c40628k.fileId) && AbstractC22676k.m65745e(this.imageSource, c40628k.imageSource);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsUploading() {
        return this.isUploading;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.type.hashCode() * 31, 31, this.isUploading), 31, this.isError);
        Uri uri = this.uri;
        int iM30450d = AbstractC11266d.m30450d((iM8289b + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.displayName);
        String str = this.fileId;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        AbstractC22403o abstractC22403o = this.imageSource;
        return iHashCode + (abstractC22403o != null ? abstractC22403o.hashCode() : 0);
    }

    public String toString() {
        AttachmentType attachmentType = this.type;
        boolean z4 = this.isUploading;
        boolean z13 = this.isError;
        Uri uri = this.uri;
        String str = this.displayName;
        String str2 = this.fileId;
        AbstractC22403o abstractC22403o = this.imageSource;
        StringBuilder sb4 = new StringBuilder("AttachmentUploadState(type=");
        sb4.append(attachmentType);
        sb4.append(", isUploading=");
        sb4.append(z4);
        sb4.append(", isError=");
        sb4.append(z13);
        sb4.append(", uri=");
        sb4.append(uri);
        sb4.append(", displayName=");
        AbstractC11266d.m30444B(sb4, str, ", fileId=", str2, ", imageSource=");
        sb4.append(abstractC22403o);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C40628k(AttachmentType attachmentType, boolean z4, boolean z13, Uri uri, String str, String str2, AbstractC22403o abstractC22403o, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(attachmentType, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? null : uri, (i13 & 16) != 0 ? "" : str, (i13 & 32) != 0 ? null : str2, (i13 & 64) != 0 ? null : abstractC22403o);
    }
}
