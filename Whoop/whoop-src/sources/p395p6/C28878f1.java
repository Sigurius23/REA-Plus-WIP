package p395p6;

import android.content.Context;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import hc3.C17171d;
import io.sentry.hints.C20363j;
import java.io.File;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import m83.C25271y;
import p007a6.C0410c;
import p007a6.C0429i0;
import p007a6.C0441m0;
import p451r6.C30972z;
import p639y6.InterfaceC39255g;
import v63.AbstractC35750h;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: p6.f1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C28878f1 implements InterfaceC39255g {

    /* JADX INFO: renamed from: a */
    public static final C28878f1 f116874a = new C28878f1();

    @Override // p639y6.InterfaceC39255g
    /* JADX INFO: renamed from: a */
    public final File mo87794a(Context context, String str) {
        return AbstractC35750h.m113273b(context, str);
    }

    @Override // p639y6.InterfaceC39255g
    /* JADX INFO: renamed from: b */
    public final Object mo87795b(Context context, String str) {
        C30972z c30972z = C30972z.f127724a;
        int i13 = 0;
        C28875e1 c28875e1 = new C28875e1(context, str, i13);
        C22365e c22365e = AbstractC3050q0.f12077a;
        C17171d c17171dM8708b = AbstractC3006f0.m8708b(ExecutorC22364d.f87316w.plus(AbstractC3006f0.m8710d()));
        return new C0429i0(new C0441m0(c30972z, c28875e1), AbstractC37056f.m118958J(new C0410c(C25271y.f99162w, null, i13)), new C20363j(10), c17171dM8708b);
    }
}
