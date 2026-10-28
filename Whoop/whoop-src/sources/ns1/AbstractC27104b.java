package ns1;

import android.graphics.Bitmap;
import ih0.AbstractC18489d0;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ns1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0005\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, m65681d2 = {"Lns1/b;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "filePath", "b", "Lns1/b$a;", "Lns1/b$b;", "lab-file-upload_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27104b {

    /* JADX INFO: renamed from: ns1.b$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lns1/b$a;", "Lns1/b;", "", "filePath", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "lab-file-upload_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC27104b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String filePath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String filePath) {
            super(null);
            AbstractC22676k.m65750j(filePath, "filePath");
            this.filePath = filePath;
        }

        @Override // ns1.AbstractC27104b
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getFilePath() {
            return this.filePath;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.filePath, ((a) other).filePath);
        }

        public int hashCode() {
            return this.filePath.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("Image(filePath=", this.filePath, ")");
        }
    }

    /* JADX INFO: renamed from: ns1.b$b */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\r¨\u0006\u001a"}, m65681d2 = {"Lns1/b$b;", "Lns1/b;", "", "filePath", "Landroid/graphics/Bitmap;", "previewBitmap", "", "totalPages", "<init>", "(Ljava/lang/String;Landroid/graphics/Bitmap;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "c", "I", "lab-file-upload_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC27104b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String filePath;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Bitmap previewBitmap;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int totalPages;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String filePath, Bitmap bitmap, int i13) {
            super(null);
            AbstractC22676k.m65750j(filePath, "filePath");
            this.filePath = filePath;
            this.previewBitmap = bitmap;
            this.totalPages = i13;
        }

        @Override // ns1.AbstractC27104b
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getFilePath() {
            return this.filePath;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Bitmap getPreviewBitmap() {
            return this.previewBitmap;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getTotalPages() {
            return this.totalPages;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.filePath, bVar.filePath) && AbstractC22676k.m65745e(this.previewBitmap, bVar.previewBitmap) && this.totalPages == bVar.totalPages;
        }

        public int hashCode() {
            int iHashCode = this.filePath.hashCode() * 31;
            Bitmap bitmap = this.previewBitmap;
            return Integer.hashCode(this.totalPages) + ((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31);
        }

        public String toString() {
            String str = this.filePath;
            Bitmap bitmap = this.previewBitmap;
            int i13 = this.totalPages;
            StringBuilder sb4 = new StringBuilder("Pdf(filePath=");
            sb4.append(str);
            sb4.append(", previewBitmap=");
            sb4.append(bitmap);
            sb4.append(", totalPages=");
            return AbstractC18489d0.m53371l(sb4, i13, ")");
        }
    }

    public /* synthetic */ AbstractC27104b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract String getFilePath();

    private AbstractC27104b() {
    }
}
