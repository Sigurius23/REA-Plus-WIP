package io.sentry.android.replay;

import android.view.View;
import io.sentry.C20535s;
import java.util.concurrent.CopyOnWriteArrayList;
import p249jc.AbstractC21598x;

/* JADX INFO: renamed from: io.sentry.android.replay.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C20220s extends CopyOnWriteArrayList {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C20231t f75942w;

    public C20220s(C20231t c20231t) {
        this.f75942w = c20231t;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        InterfaceC20206g interfaceC20206g = (InterfaceC20206g) obj;
        C20231t c20231t = this.f75942w;
        C20535s c20535sM56711a = c20231t.f76007x.m56711a();
        try {
            for (View view : c20231t.f76009z) {
                if (interfaceC20206g != null) {
                    interfaceC20206g.mo56124b(view, true);
                }
            }
            AbstractC21598x.m60698r(c20535sM56711a, null);
            return super.add(interfaceC20206g);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC21598x.m60698r(c20535sM56711a, th3);
                throw th4;
            }
        }
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof InterfaceC20206g) {
            return super.contains((InterfaceC20206g) obj);
        }
        return false;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof InterfaceC20206g) {
            return super.indexOf((InterfaceC20206g) obj);
        }
        return -1;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof InterfaceC20206g) {
            return super.lastIndexOf((InterfaceC20206g) obj);
        }
        return -1;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof InterfaceC20206g) {
            return super.remove((InterfaceC20206g) obj);
        }
        return false;
    }
}
