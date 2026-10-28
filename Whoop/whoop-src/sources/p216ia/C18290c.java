package p216ia;

import java.util.ArrayList;
import p516u8.InterfaceC34583b0;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: ia.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C18290c implements InterfaceC34583b0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f71157a;

    public C18290c(ArrayList arrayList) {
        this.f71157a = arrayList;
        boolean z4 = false;
        if (!arrayList.isEmpty()) {
            long j7 = ((C18289b) arrayList.get(0)).f71155b;
            for (int i13 = 1; i13 < arrayList.size(); i13++) {
                if (((C18289b) arrayList.get(i13)).f71154a < j7) {
                    z4 = true;
                    break;
                }
                j7 = ((C18289b) arrayList.get(i13)).f71155b;
            }
        }
        AbstractC35849g.m113802d(!z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18290c.class != obj.getClass()) {
            return false;
        }
        return this.f71157a.equals(((C18290c) obj).f71157a);
    }

    public final int hashCode() {
        return this.f71157a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f71157a;
    }
}
