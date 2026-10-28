package p171g9;

import io.sentry.android.core.RunnableC20151r0;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import p047c9.C4312c;
import p299l9.C23488c0;
import p299l9.C23494e0;
import p299l9.C23497f0;
import p299l9.C23500g0;
import p299l9.C23503h0;
import p299l9.C23527t;
import p299l9.C23537y;
import p516u8.C34610p;
import p607x8.AbstractC38065t;
import p607x8.InterfaceC38049d;

/* JADX INFO: renamed from: g9.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C15587d {

    /* JADX INFO: renamed from: a */
    public final int f58537a;

    /* JADX INFO: renamed from: b */
    public final C23488c0 f58538b;

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArrayList f58539c;

    public /* synthetic */ C15587d(CopyOnWriteArrayList copyOnWriteArrayList, int i13, C23488c0 c23488c0) {
        this.f58539c = copyOnWriteArrayList;
        this.f58537a = i13;
        this.f58538b = c23488c0;
    }

    /* JADX INFO: renamed from: a */
    public void m43883a(InterfaceC38049d interfaceC38049d) {
        for (C23503h0 c23503h0 : this.f58539c) {
            AbstractC38065t.m121900N(c23503h0.f93034a, new RunnableC20151r0(11, interfaceC38049d, c23503h0.f93035b));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m43884b(int i13, C34610p c34610p, int i14, Object obj, long j7) {
        m43883a(new C4312c(19, this, new C23537y(1, i13, c34610p, i14, obj, AbstractC38065t.m121907U(j7), -9223372036854775807L)));
    }

    /* JADX INFO: renamed from: c */
    public void m43885c(C23527t c23527t, int i13, int i14, C34610p c34610p, int i15, Object obj, long j7, long j13) {
        m43883a(new C23497f0(this, c23527t, new C23537y(i13, i14, c34610p, i15, obj, AbstractC38065t.m121907U(j7), AbstractC38065t.m121907U(j13)), 1));
    }

    /* JADX INFO: renamed from: d */
    public void m43886d(C23527t c23527t, int i13, int i14, C34610p c34610p, int i15, Object obj, long j7, long j13) {
        m43883a(new C23497f0(this, c23527t, new C23537y(i13, i14, c34610p, i15, obj, AbstractC38065t.m121907U(j7), AbstractC38065t.m121907U(j13)), 0));
    }

    /* JADX INFO: renamed from: e */
    public void m43887e(C23527t c23527t, int i13, int i14, C34610p c34610p, int i15, Object obj, long j7, long j13, IOException iOException, boolean z4) {
        m43883a(new C23500g0(this, c23527t, new C23537y(i13, i14, c34610p, i15, obj, AbstractC38065t.m121907U(j7), AbstractC38065t.m121907U(j13)), iOException, z4));
    }

    /* JADX INFO: renamed from: f */
    public void m43888f(C23527t c23527t, int i13, int i14, C34610p c34610p, int i15, Object obj, long j7, long j13, int i16) {
        m43883a(new C23494e0(this, c23527t, new C23537y(i13, i14, c34610p, i15, obj, AbstractC38065t.m121907U(j7), AbstractC38065t.m121907U(j13)), i16));
    }
}
