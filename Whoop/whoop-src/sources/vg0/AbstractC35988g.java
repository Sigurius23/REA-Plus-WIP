package vg0;

import android.net.Uri;
import c13.AbstractC3855a;
import java.util.List;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: vg0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lvg0/g;", "", "<init>", "()V", "b", "a", "Lvg0/g$a;", "Lvg0/g$b;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35988g {

    /* JADX INFO: renamed from: vg0.g$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lvg0/g$a;", "Lvg0/g;", "", "fileId", "Landroid/net/Uri;", "uri", "<init>", "(Ljava/lang/String;Landroid/net/Uri;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Landroid/net/Uri;", "()Landroid/net/Uri;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC35988g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fileId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Uri uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Uri uri) {
            super(null);
            AbstractC22676k.m65750j(uri, "uri");
            this.fileId = str;
            this.uri = uri;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFileId() {
            return this.fileId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.fileId, aVar.fileId) && AbstractC22676k.m65745e(this.uri, aVar.uri);
        }

        public int hashCode() {
            String str = this.fileId;
            return this.uri.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            return "Remove(fileId=" + this.fileId + ", uri=" + this.uri + ")";
        }
    }

    /* JADX INFO: renamed from: vg0.g$b */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018¨\u0006\u001b"}, m65681d2 = {"Lvg0/g$b;", "Lvg0/g;", "", "Landroid/net/Uri;", "imageUris", "", "fingerprint", "", "fileSizesBytes", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Ljava/lang/String;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC35988g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<Uri> imageUris;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<Long> fileSizesBytes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends Uri> imageUris, String fingerprint, List<Long> fileSizesBytes) {
            super(null);
            AbstractC22676k.m65750j(imageUris, "imageUris");
            AbstractC22676k.m65750j(fingerprint, "fingerprint");
            AbstractC22676k.m65750j(fileSizesBytes, "fileSizesBytes");
            this.imageUris = imageUris;
            this.fingerprint = fingerprint;
            this.fileSizesBytes = fileSizesBytes;
        }

        /* JADX INFO: renamed from: a */
        public final List<Long> m114284a() {
            return this.fileSizesBytes;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        /* JADX INFO: renamed from: c */
        public final List<Uri> m114286c() {
            return this.imageUris;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.imageUris, bVar.imageUris) && AbstractC22676k.m65745e(this.fingerprint, bVar.fingerprint) && AbstractC22676k.m65745e(this.fileSizesBytes, bVar.fileSizesBytes);
        }

        public int hashCode() {
            return this.fileSizesBytes.hashCode() + AbstractC11266d.m30450d(this.imageUris.hashCode() * 31, 31, this.fingerprint);
        }

        public String toString() {
            List<Uri> list = this.imageUris;
            String str = this.fingerprint;
            return AbstractC3855a.m11829m(AbstractC26725a.m79507k("Upload(imageUris=", ", fingerprint=", str, ", fileSizesBytes=", list), this.fileSizesBytes, ")");
        }
    }

    public /* synthetic */ AbstractC35988g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC35988g() {
    }
}
