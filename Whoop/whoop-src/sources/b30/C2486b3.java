package b30;

import android.graphics.Typeface;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import java.util.Locale;
import l83.C23454a0;
import p163g1.AbstractC15011f9;
import p390p1.C28655q;
import p392p3.C28783u;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29934u0;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: b30.b3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2486b3 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9681w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f9682x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f9683y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Typeface f9684z;

    public C2486b3(int i13, long j7, long j13, Typeface typeface) {
        this.f9681w = i13;
        this.f9682x = j7;
        this.f9683y = j13;
        this.f9684z = typeface;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            C28655q c28655q = (C28655q) composer;
            if (c28655q.m87121F()) {
                c28655q.m87138X();
            } else {
                String upperCase = AbstractC30060g.m92103Y(composer, this.f9681w).toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                Typeface typeface = this.f9684z;
                AbstractC22676k.m65747g(typeface);
                AbstractC15011f9.m43114b(upperCase, null, this.f9682x, this.f9683y, null, null, new C28783u(new C29934u0(typeface, 20)), 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 130994);
            }
        } else {
            String upperCase2 = AbstractC30060g.m92103Y(composer, this.f9681w).toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
            Typeface typeface2 = this.f9684z;
            AbstractC22676k.m65747g(typeface2);
            AbstractC15011f9.m43114b(upperCase2, null, this.f9682x, this.f9683y, null, null, new C28783u(new C29934u0(typeface2, 20)), 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 130994);
        }
        return C23454a0.f92919a;
    }
}
