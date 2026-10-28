package nl0;

import kd1.AbstractC22403o;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: nl0.l */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u0013\u0010\f¨\u0006\u001c"}, m65681d2 = {"Lnl0/l;", "", "", "isUploading", "isError", "Lkd1/o;", "imageSource", "", "fileId", "<init>", "(ZZLkd1/o;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "d", "()Z", "b", "c", "Lkd1/o;", "()Lkd1/o;", "Ljava/lang/String;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26810l {

    /* JADX INFO: renamed from: e */
    public static final int f106865e = AbstractC22403o.f87638a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isUploading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22403o imageSource;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String fileId;

    public C26810l(boolean z4, boolean z13, AbstractC22403o abstractC22403o, String str) {
        this.isUploading = z4;
        this.isError = z13;
        this.imageSource = abstractC22403o;
        this.fileId = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFileId() {
        return this.fileId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC22403o getImageSource() {
        return this.imageSource;
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
        if (!(other instanceof C26810l)) {
            return false;
        }
        C26810l c26810l = (C26810l) other;
        return this.isUploading == c26810l.isUploading && this.isError == c26810l.isError && AbstractC22676k.m65745e(this.imageSource, c26810l.imageSource) && AbstractC22676k.m65745e(this.fileId, c26810l.fileId);
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(Boolean.hashCode(this.isUploading) * 31, 31, this.isError);
        AbstractC22403o abstractC22403o = this.imageSource;
        int iHashCode = (iM8289b + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31;
        String str = this.fileId;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        boolean z4 = this.isUploading;
        boolean z13 = this.isError;
        AbstractC22403o abstractC22403o = this.imageSource;
        String str = this.fileId;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("ImageUploadState(isUploading=", ", isError=", ", imageSource=", z4, z13);
        sbM32002u.append(abstractC22403o);
        sbM32002u.append(", fileId=");
        sbM32002u.append(str);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }
}
