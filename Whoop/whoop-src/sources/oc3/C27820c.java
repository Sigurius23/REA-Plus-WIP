package oc3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: oc3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C27820c {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f112072a = AtomicReferenceFieldUpdater.newUpdater(C27820c.class, Object.class, "reader$volatile");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f112073b = AtomicIntegerFieldUpdater.newUpdater(C27820c.class, "readers$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f112074c = AtomicReferenceFieldUpdater.newUpdater(C27820c.class, Object.class, "writer$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f112075d = AtomicReferenceFieldUpdater.newUpdater(C27820c.class, Object.class, "exceptionWhenReading$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f112076e = AtomicReferenceFieldUpdater.newUpdater(C27820c.class, Object.class, "_value$volatile");
    private volatile /* synthetic */ Object _value$volatile = null;
    private volatile /* synthetic */ Object exceptionWhenReading$volatile;
    private volatile /* synthetic */ Object reader$volatile;
    private volatile /* synthetic */ int readers$volatile;
    private volatile /* synthetic */ Object writer$volatile;
}
