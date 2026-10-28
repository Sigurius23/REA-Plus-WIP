package p141f9;

import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;
import p112e9.InterfaceC12870i;
import p516u8.C34610p;
import p607x8.AbstractC38065t;
import p690zr.AbstractC41023g0;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: f9.m */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14271m {

    /* JADX INFO: renamed from: E */
    public final C14268j f52110E;

    /* JADX INFO: renamed from: w */
    public final C34610p f52111w;

    /* JADX INFO: renamed from: x */
    public final AbstractC41023g0 f52112x;

    /* JADX INFO: renamed from: y */
    public final long f52113y;

    /* JADX INFO: renamed from: z */
    public final List f52114z;

    public AbstractC14271m(C34610p c34610p, List list, AbstractC14277s abstractC14277s, List list2) {
        AbstractC35849g.m113802d(!list.isEmpty());
        this.f52111w = c34610p;
        this.f52112x = AbstractC41023g0.m133252m(list);
        this.f52114z = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.f52110E = abstractC14277s.mo40763a(this);
        long j7 = abstractC14277s.f52131c;
        long j13 = abstractC14277s.f52130b;
        int i13 = AbstractC38065t.f163031a;
        this.f52113y = AbstractC38065t.m121903Q(j7, 1000000L, j13, RoundingMode.DOWN);
    }

    /* JADX INFO: renamed from: b */
    public abstract String mo40752b();

    /* JADX INFO: renamed from: c */
    public abstract InterfaceC12870i mo40753c();

    /* JADX INFO: renamed from: d */
    public abstract C14268j mo40754d();
}
