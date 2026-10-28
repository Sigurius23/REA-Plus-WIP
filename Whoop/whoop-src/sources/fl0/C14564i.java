package fl0;

import android.net.Uri;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: fl0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u0013\u0010\f¨\u0006\u001c"}, m65681d2 = {"Lfl0/i;", "", "", "isUploading", "isError", "Landroid/net/Uri;", "uri", "", "fileId", "<init>", "(ZZLandroid/net/Uri;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "d", "()Z", "b", "c", "Landroid/net/Uri;", "()Landroid/net/Uri;", "Ljava/lang/String;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14564i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isUploading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Uri uri;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String fileId;

    public C14564i(boolean z4, boolean z13, Uri uri, String str) {
        this.isUploading = z4;
        this.isError = z13;
        this.uri = uri;
        this.fileId = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFileId() {
        return this.fileId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsUploading() {
        return this.isUploading;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14564i)) {
            return false;
        }
        C14564i c14564i = (C14564i) other;
        return this.isUploading == c14564i.isUploading && this.isError == c14564i.isError && AbstractC22676k.m65745e(this.uri, c14564i.uri) && AbstractC22676k.m65745e(this.fileId, c14564i.fileId);
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(Boolean.hashCode(this.isUploading) * 31, 31, this.isError);
        Uri uri = this.uri;
        int iHashCode = (iM8289b + (uri == null ? 0 : uri.hashCode())) * 31;
        String str = this.fileId;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        boolean z4 = this.isUploading;
        boolean z13 = this.isError;
        Uri uri = this.uri;
        String str = this.fileId;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("ImageUploadModel(isUploading=", ", isError=", ", uri=", z4, z13);
        sbM32002u.append(uri);
        sbM32002u.append(", fileId=");
        sbM32002u.append(str);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    public /* synthetic */ C14564i(boolean z4, boolean z13, Uri uri, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? null : uri, (i13 & 8) != 0 ? null : str);
    }
}
