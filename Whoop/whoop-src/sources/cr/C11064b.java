package cr;

import android.graphics.Typeface;

/* JADX INFO: renamed from: cr.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C11064b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34932a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C11065c f34933b;

    public /* synthetic */ C11064b(C11065c c11065c, int i13) {
        this.f34932a = i13;
        this.f34933b = c11065c;
    }

    /* JADX INFO: renamed from: a */
    public final void m29840a(Typeface typeface) {
        switch (this.f34932a) {
            case 0:
                C11065c c11065c = this.f34933b;
                if (c11065c.m29853m(typeface)) {
                    c11065c.m29849i(false);
                }
                break;
            default:
                C11065c c11065c2 = this.f34933b;
                if (c11065c2.m29855o(typeface)) {
                    c11065c2.m29849i(false);
                }
                break;
        }
    }
}
