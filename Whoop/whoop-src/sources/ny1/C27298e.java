package ny1;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25267u;
import nm1.C26842g;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;
import x83.C38091h;
import x83.EnumC38092i;
import xb3.AbstractC38176k;
import xb3.C38170e;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: ny1.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0015B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lny1/e;", "", "", "Lny1/c;", "dbSizes", "Lny1/a;", "cacheSizes", "", "bffCacheSizeBytes", "<init>", "(Ljava/util/List;Ljava/util/List;J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "e", "()Ljava/util/List;", "b", "d", "c", "J", "()J", "metrics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27298e {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    private static final List<String> f109311e = AbstractC37056f.m118959K("whoop_db", "persistent_whoop_db", "persistent_packet_db", "metrics_db", "cached_packet_db", "data_sync_work_db", "whoop_labrador_db", "ecg_packets_db", "bff_cache_db");

    /* JADX INFO: renamed from: f */
    private static final List<C27295b> f109312f = AbstractC37056f.m118959K(new C27295b("glide", "image_manager_disk_cache"), new C27295b("coil", "image_cache"));

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C27296c> dbSizes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C27294a> cacheSizes;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long bffCacheSizeBytes;

    /* JADX INFO: renamed from: ny1.e$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, m65681d2 = {"Lny1/e$a;", "", "<init>", "()V", "Ljava/io/File;", "", "e", "(Ljava/io/File;)J", "c", "Landroid/content/Context;", "context", "bffCacheSizeBytes", "Lny1/e;", "b", "(Landroid/content/Context;J)Lny1/e;", "", "", "DB_NAMES", "Ljava/util/List;", "Lny1/b;", "CACHE_SOURCES", "metrics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c */
        private final long m82363c(File file) {
            long length = 0;
            if (file.exists() && file.isDirectory()) {
                C38170e c38170e = new C38170e(AbstractC38176k.m122282r(new C38091h(file, EnumC38092i.f163140w), new C26842g(5)));
                while (c38170e.hasNext()) {
                    length += ((File) c38170e.next()).length();
                }
            }
            return length;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public static final boolean m82364d(File it) {
            AbstractC22676k.m65750j(it, "it");
            return it.isFile();
        }

        /* JADX INFO: renamed from: e */
        private final long m82365e(File file) {
            if (file.exists()) {
                return file.length();
            }
            return 0L;
        }

        /* JADX INFO: renamed from: b */
        public final C27298e m82366b(Context context, long bffCacheSizeBytes) {
            AbstractC22676k.m65750j(context, "context");
            List<String> list = C27298e.f109311e;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (String str : list) {
                File databasePath = context.getDatabasePath(str);
                File databasePath2 = context.getDatabasePath(str + "-wal");
                Companion companion = C27298e.INSTANCE;
                AbstractC22676k.m65747g(databasePath);
                long jM82365e = companion.m82365e(databasePath);
                AbstractC22676k.m65747g(databasePath2);
                arrayList.add(new C27296c(str, jM82365e, companion.m82365e(databasePath2)));
            }
            List<C27295b> list2 = C27298e.f109312f;
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            for (C27295b c27295b : list2) {
                arrayList2.add(new C27294a(c27295b.getSource(), C27298e.INSTANCE.m82363c(new File(context.getCacheDir(), c27295b.getDirName()))));
            }
            return new C27298e(arrayList, arrayList2, bffCacheSizeBytes);
        }

        private Companion() {
        }
    }

    public C27298e(List<C27296c> dbSizes, List<C27294a> cacheSizes, long j7) {
        AbstractC22676k.m65750j(dbSizes, "dbSizes");
        AbstractC22676k.m65750j(cacheSizes, "cacheSizes");
        this.dbSizes = dbSizes;
        this.cacheSizes = cacheSizes;
        this.bffCacheSizeBytes = j7;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getBffCacheSizeBytes() {
        return this.bffCacheSizeBytes;
    }

    /* JADX INFO: renamed from: d */
    public final List<C27294a> m82360d() {
        return this.cacheSizes;
    }

    /* JADX INFO: renamed from: e */
    public final List<C27296c> m82361e() {
        return this.dbSizes;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27298e)) {
            return false;
        }
        C27298e c27298e = (C27298e) other;
        return AbstractC22676k.m65745e(this.dbSizes, c27298e.dbSizes) && AbstractC22676k.m65745e(this.cacheSizes, c27298e.cacheSizes) && this.bffCacheSizeBytes == c27298e.bffCacheSizeBytes;
    }

    public int hashCode() {
        return Long.hashCode(this.bffCacheSizeBytes) + AbstractC11895b.m31983b(this.dbSizes.hashCode() * 31, 31, this.cacheSizes);
    }

    public String toString() {
        return AbstractC11266d.m30457k(this.bffCacheSizeBytes, ")", AbstractC38963t7.m124380j("StorageSnapshot(dbSizes=", ", cacheSizes=", this.dbSizes, ", bffCacheSizeBytes=", this.cacheSizes));
    }
}
