package p141f9;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: f9.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C14261c {

    /* JADX INFO: renamed from: a */
    public final long f52062a;

    /* JADX INFO: renamed from: b */
    public final long f52063b;

    /* JADX INFO: renamed from: c */
    public final long f52064c;

    /* JADX INFO: renamed from: d */
    public final boolean f52065d;

    /* JADX INFO: renamed from: e */
    public final long f52066e;

    /* JADX INFO: renamed from: f */
    public final long f52067f;

    /* JADX INFO: renamed from: g */
    public final long f52068g;

    /* JADX INFO: renamed from: h */
    public final long f52069h;

    /* JADX INFO: renamed from: i */
    public final C14279u f52070i;

    /* JADX INFO: renamed from: j */
    public final C14278t f52071j;

    /* JADX INFO: renamed from: k */
    public final Uri f52072k;

    /* JADX INFO: renamed from: l */
    public final C14267i f52073l;

    /* JADX INFO: renamed from: m */
    public final List f52074m;

    public C14261c(long j7, long j13, long j14, boolean z4, long j15, long j16, long j17, long j18, C14267i c14267i, C14279u c14279u, C14278t c14278t, Uri uri, ArrayList arrayList) {
        this.f52062a = j7;
        this.f52063b = j13;
        this.f52064c = j14;
        this.f52065d = z4;
        this.f52066e = j15;
        this.f52067f = j16;
        this.f52068g = j17;
        this.f52069h = j18;
        this.f52073l = c14267i;
        this.f52070i = c14279u;
        this.f52072k = uri;
        this.f52071j = c14278t;
        this.f52074m = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final C14266h m40728a(int i13) {
        return (C14266h) this.f52074m.get(i13);
    }

    /* JADX INFO: renamed from: b */
    public final long m40729b(int i13) {
        long j7;
        long j13;
        List list = this.f52074m;
        if (i13 == list.size() - 1) {
            j7 = this.f52063b;
            if (j7 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j13 = ((C14266h) list.get(i13)).f52095b;
        } else {
            j7 = ((C14266h) list.get(i13 + 1)).f52095b;
            j13 = ((C14266h) list.get(i13)).f52095b;
        }
        return j7 - j13;
    }

    /* JADX INFO: renamed from: c */
    public final long m40730c(int i13) {
        return AbstractC38065t.m121896J(m40729b(i13));
    }
}
