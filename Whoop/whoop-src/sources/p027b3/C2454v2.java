package p027b3;

import java.util.ArrayList;
import java.util.List;
import p005a3.InterfaceC0184b2;
import p209i3.C18028j;

/* JADX INFO: renamed from: b3.v2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2454v2 implements InterfaceC0184b2 {

    /* JADX INFO: renamed from: w */
    public final int f9587w;

    /* JADX INFO: renamed from: x */
    public final List f9588x;

    /* JADX INFO: renamed from: y */
    public Float f9589y = null;

    /* JADX INFO: renamed from: z */
    public Float f9590z = null;

    /* JADX INFO: renamed from: E */
    public C18028j f9585E = null;

    /* JADX INFO: renamed from: F */
    public C18028j f9586F = null;

    public C2454v2(ArrayList arrayList, int i13) {
        this.f9587w = i13;
        this.f9588x = arrayList;
    }

    @Override // p005a3.InterfaceC0184b2
    /* JADX INFO: renamed from: U */
    public final boolean mo432U() {
        return this.f9588x.contains(this);
    }

    /* JADX INFO: renamed from: a */
    public final int m7437a() {
        return this.f9587w;
    }

    /* JADX INFO: renamed from: b */
    public final void m7438b(C18028j c18028j) {
        this.f9585E = c18028j;
    }

    /* JADX INFO: renamed from: c */
    public final void m7439c(C18028j c18028j) {
        this.f9586F = c18028j;
    }
}
