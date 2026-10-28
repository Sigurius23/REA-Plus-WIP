package ns1;

import android.graphics.Bitmap;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ns1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\f¨\u0006\u0016"}, m65681d2 = {"Lns1/a;", "", "Landroid/graphics/Bitmap;", "preview", "", "pages", "<init>", "(Landroid/graphics/Bitmap;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/Bitmap;", "b", "()Landroid/graphics/Bitmap;", "I", "lab-file-upload_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27103a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Bitmap preview;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int pages;

    public C27103a(Bitmap bitmap, int i13) {
        this.preview = bitmap;
        this.pages = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getPages() {
        return this.pages;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Bitmap getPreview() {
        return this.preview;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27103a)) {
            return false;
        }
        C27103a c27103a = (C27103a) other;
        return AbstractC22676k.m65745e(this.preview, c27103a.preview) && this.pages == c27103a.pages;
    }

    public int hashCode() {
        Bitmap bitmap = this.preview;
        return Integer.hashCode(this.pages) + ((bitmap == null ? 0 : bitmap.hashCode()) * 31);
    }

    public String toString() {
        return "PdfPreviewData(preview=" + this.preview + ", pages=" + this.pages + ")";
    }
}
