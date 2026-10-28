package p63;

import io.sentry.hints.C20363j;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m83.C25272z;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p63.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C28949a {
    private volatile /* synthetic */ Object current = C25272z.f99163w;

    static {
        AtomicReferenceFieldUpdater.newUpdater(C28949a.class, Object.class, "current");
    }

    /* JADX INFO: renamed from: a */
    public final Object m87910a(C20363j key) {
        AbstractC22676k.m65750j(key, "key");
        return ((Map) this.current).get(key);
    }
}
