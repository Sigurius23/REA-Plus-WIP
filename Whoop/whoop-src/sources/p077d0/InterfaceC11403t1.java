package p077d0;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d0.t1 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC11403t1 {
    /* JADX INFO: renamed from: b */
    Object mo11595b();

    /* JADX INFO: renamed from: c */
    Object mo11596c();

    /* JADX INFO: renamed from: d */
    default boolean m30637d(Object obj, Object obj2) {
        return AbstractC22676k.m65745e(obj, mo11596c()) && obj2.equals(mo11595b());
    }
}
