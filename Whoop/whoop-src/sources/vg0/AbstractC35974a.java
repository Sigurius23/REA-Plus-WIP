package vg0;

import android.net.Uri;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: vg0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lvg0/a;", "", "<init>", "()V", "b", "a", "Lvg0/a$a;", "Lvg0/a$b;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35974a {

    /* JADX INFO: renamed from: vg0.a$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lvg0/a$a;", "Lvg0/a;", "", "fileId", "Landroid/net/Uri;", "uri", "<init>", "(Ljava/lang/String;Landroid/net/Uri;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Landroid/net/Uri;", "()Landroid/net/Uri;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC35974a {

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

    /* JADX INFO: renamed from: vg0.a$b */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\rR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001d"}, m65681d2 = {"Lvg0/a$b;", "Lvg0/a;", "", "Landroid/net/Uri;", "uris", "", "displayNames", "fingerprint", "", "fileSizesBytes", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "c", "Ljava/lang/String;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC35974a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<Uri> uris;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<String> displayNames;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final List<Long> fileSizesBytes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends Uri> uris, List<String> displayNames, String fingerprint, List<Long> fileSizesBytes) {
            super(null);
            AbstractC22676k.m65750j(uris, "uris");
            AbstractC22676k.m65750j(displayNames, "displayNames");
            AbstractC22676k.m65750j(fingerprint, "fingerprint");
            AbstractC22676k.m65750j(fileSizesBytes, "fileSizesBytes");
            this.uris = uris;
            this.displayNames = displayNames;
            this.fingerprint = fingerprint;
            this.fileSizesBytes = fileSizesBytes;
        }

        /* JADX INFO: renamed from: a */
        public final List<String> m114212a() {
            return this.displayNames;
        }

        /* JADX INFO: renamed from: b */
        public final List<Long> m114213b() {
            return this.fileSizesBytes;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        /* JADX INFO: renamed from: d */
        public final List<Uri> m114215d() {
            return this.uris;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.uris, bVar.uris) && AbstractC22676k.m65745e(this.displayNames, bVar.displayNames) && AbstractC22676k.m65745e(this.fingerprint, bVar.fingerprint) && AbstractC22676k.m65745e(this.fileSizesBytes, bVar.fileSizesBytes);
        }

        public int hashCode() {
            return this.fileSizesBytes.hashCode() + AbstractC11266d.m30450d(AbstractC11895b.m31983b(this.uris.hashCode() * 31, 31, this.displayNames), 31, this.fingerprint);
        }

        public String toString() {
            List<Uri> list = this.uris;
            List<String> list2 = this.displayNames;
            return AbstractC30007c.m91840j(this.fingerprint, ", fileSizesBytes=", ")", AbstractC38963t7.m124380j("Upload(uris=", ", displayNames=", list, ", fingerprint=", list2), this.fileSizesBytes);
        }
    }

    public /* synthetic */ AbstractC35974a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC35974a() {
    }
}
