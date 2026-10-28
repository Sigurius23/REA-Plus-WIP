package p390p1;

import p715kotlin.KotlinNothingValueException;

/* JADX INFO: renamed from: p1.u1 */
/* JADX INFO: loaded from: classes.dex */
public final class C28673u1 {

    /* JADX INFO: renamed from: a */
    public final AbstractC28669t1 f115966a;

    /* JADX INFO: renamed from: b */
    public final boolean f115967b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC28650o2 f115968c;

    /* JADX INFO: renamed from: d */
    public final boolean f115969d;

    /* JADX INFO: renamed from: e */
    public final Object f115970e;

    /* JADX INFO: renamed from: f */
    public boolean f115971f = true;

    public C28673u1(AbstractC28669t1 abstractC28669t1, Object obj, boolean z4, InterfaceC28650o2 interfaceC28650o2, boolean z13) {
        this.f115966a = abstractC28669t1;
        this.f115967b = z4;
        this.f115968c = interfaceC28650o2;
        this.f115969d = z13;
        this.f115970e = obj;
    }

    /* JADX INFO: renamed from: a */
    public final Object m87198a() {
        if (this.f115967b) {
            return null;
        }
        Object obj = this.f115970e;
        if (obj != null) {
            return obj;
        }
        AbstractC28659r.m87193d("Unexpected form of a provided value");
        throw new KotlinNothingValueException();
    }
}
