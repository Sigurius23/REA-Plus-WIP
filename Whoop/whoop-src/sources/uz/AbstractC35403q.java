package uz;

import p408q.C29662f;
import v03.InterfaceC35517d;

/* JADX INFO: renamed from: uz.q */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC35403q implements InterfaceC35517d {
    /* JADX INFO: renamed from: a */
    public static C35401o m112323a(C35402p c35402p, C29662f c29662f) {
        C35401o c35401o;
        C35402p c35402p2 = C35402p.f150840a;
        C35401o c35401o2 = C35402p.f150841b;
        if (c35401o2 != null) {
            return c35401o2;
        }
        synchronized (c35402p2) {
            c35401o = C35402p.f150841b;
            if (c35401o == null) {
                c35401o = new C35401o(c35402p, c29662f);
                C35402p.f150841b = c35401o;
            }
        }
        return c35401o;
    }
}
