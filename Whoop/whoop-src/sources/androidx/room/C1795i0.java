package androidx.room;

import java.util.Set;
import m83.C25235a0;
import p098dt.AbstractC12350b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.room.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1795i0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC1826s f7087a;

    /* JADX INFO: renamed from: b */
    public final int[] f7088b;

    /* JADX INFO: renamed from: c */
    public final String[] f7089c;

    /* JADX INFO: renamed from: d */
    public final Set f7090d;

    public C1795i0(AbstractC1826s observer, int[] tableIds, String[] tableNames) {
        AbstractC22676k.m65750j(observer, "observer");
        AbstractC22676k.m65750j(tableIds, "tableIds");
        AbstractC22676k.m65750j(tableNames, "tableNames");
        this.f7087a = observer;
        this.f7088b = tableIds;
        this.f7089c = tableNames;
        if (tableIds.length != tableNames.length) {
            throw new IllegalStateException("Check failed.");
        }
        this.f7090d = !(tableNames.length == 0) ? AbstractC12350b.m34570S(tableNames[0]) : C25235a0.f99113w;
    }
}
