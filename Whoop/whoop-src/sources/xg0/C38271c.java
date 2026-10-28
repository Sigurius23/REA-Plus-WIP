package xg0;

import android.net.Uri;
import com.whoop.p057ai.chat.models.AttachmentType;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: xg0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010'\u001a\u0004\b\u001d\u0010\u0012R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b!\u0010\u0012R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\"\u0010(\u001a\u0004\b#\u0010)R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010'\u001a\u0004\b\u0019\u0010\u0012¨\u0006*"}, m65681d2 = {"Lxg0/c;", "", "Lcom/whoop/ai/chat/models/AttachmentType;", "type", "", "isUploading", "isError", "Landroid/net/Uri;", "uri", "", "displayName", "fileId", "", "fileSizeBytes", "createdAtFormatted", "<init>", "(Lcom/whoop/ai/chat/models/AttachmentType;ZZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/ai/chat/models/AttachmentType;", "e", "()Lcom/whoop/ai/chat/models/AttachmentType;", "b", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "c", "g", "d", "Landroid/net/Uri;", "f", "()Landroid/net/Uri;", "Ljava/lang/String;", "J", "()J", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38271c {

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
    private final long fileSizeBytes;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String createdAtFormatted;

    public C38271c(AttachmentType type, boolean z4, boolean z13, Uri uri, String displayName, String str, long j7, String str2) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(displayName, "displayName");
        this.type = type;
        this.isUploading = z4;
        this.isError = z13;
        this.uri = uri;
        this.displayName = displayName;
        this.fileId = str;
        this.fileSizeBytes = j7;
        this.createdAtFormatted = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCreatedAtFormatted() {
        return this.createdAtFormatted;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFileId() {
        return this.fileId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getFileSizeBytes() {
        return this.fileSizeBytes;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AttachmentType getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38271c)) {
            return false;
        }
        C38271c c38271c = (C38271c) other;
        return this.type == c38271c.type && this.isUploading == c38271c.isUploading && this.isError == c38271c.isError && AbstractC22676k.m65745e(this.uri, c38271c.uri) && AbstractC22676k.m65745e(this.displayName, c38271c.displayName) && AbstractC22676k.m65745e(this.fileId, c38271c.fileId) && this.fileSizeBytes == c38271c.fileSizeBytes && AbstractC22676k.m65745e(this.createdAtFormatted, c38271c.createdAtFormatted);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsUploading() {
        return this.isUploading;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.type.hashCode() * 31, 31, this.isUploading), 31, this.isError);
        Uri uri = this.uri;
        int iM30450d = AbstractC11266d.m30450d((iM8289b + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.displayName);
        String str = this.fileId;
        int iM30451e = AbstractC11266d.m30451e((iM30450d + (str == null ? 0 : str.hashCode())) * 31, this.fileSizeBytes, 31);
        String str2 = this.createdAtFormatted;
        return iM30451e + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        AttachmentType attachmentType = this.type;
        boolean z4 = this.isUploading;
        boolean z13 = this.isError;
        Uri uri = this.uri;
        String str = this.displayName;
        String str2 = this.fileId;
        long j7 = this.fileSizeBytes;
        String str3 = this.createdAtFormatted;
        StringBuilder sb4 = new StringBuilder("AttachmentUploadModel(type=");
        sb4.append(attachmentType);
        sb4.append(", isUploading=");
        sb4.append(z4);
        sb4.append(", isError=");
        sb4.append(z13);
        sb4.append(", uri=");
        sb4.append(uri);
        sb4.append(", displayName=");
        AbstractC11266d.m30444B(sb4, str, ", fileId=", str2, ", fileSizeBytes=");
        sb4.append(j7);
        sb4.append(", createdAtFormatted=");
        sb4.append(str3);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C38271c(AttachmentType attachmentType, boolean z4, boolean z13, Uri uri, String str, String str2, long j7, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(attachmentType, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? null : uri, (i13 & 16) != 0 ? "" : str, (i13 & 32) != 0 ? null : str2, (i13 & 64) != 0 ? 0L : j7, (i13 & 128) != 0 ? null : str3);
    }
}
