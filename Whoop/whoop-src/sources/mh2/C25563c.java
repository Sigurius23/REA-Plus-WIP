package mh2;

import android.util.LongSparseArray;
import java.util.HashMap;
import oh2.C27941d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mh2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lmh2/c;", "", "<init>", "()V", "", "id", "Loh2/d;", "version", "Ll83/a0;", "c", "(JLoh2/d;)V", "a", "(J)Loh2/d;", "b", "(Loh2/d;)Ljava/lang/Long;", "Landroid/util/LongSparseArray;", "Landroid/util/LongSparseArray;", "versionsById", "Ljava/util/HashMap;", "Ljava/util/HashMap;", "idsByVersion", "strap-metadata_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25563c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final LongSparseArray<C27941d> versionsById = new LongSparseArray<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final HashMap<C27941d, Long> idsByVersion = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public final C27941d m75175a(long id4) {
        return this.versionsById.get(id4);
    }

    /* JADX INFO: renamed from: b */
    public final Long m75176b(C27941d version) {
        AbstractC22676k.m65750j(version, "version");
        return this.idsByVersion.getOrDefault(version, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m75177c(long id4, C27941d version) {
        AbstractC22676k.m65750j(version, "version");
        this.versionsById.put(id4, version);
        this.idsByVersion.put(version, Long.valueOf(id4));
    }
}
