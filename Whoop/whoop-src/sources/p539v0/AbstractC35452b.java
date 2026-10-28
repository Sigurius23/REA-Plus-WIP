package p539v0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;
import l83.C23454a0;
import p294l3.C23283u0;
import p568w0.C36625a;
import p601x0.C37790a;
import p601x0.C37793d;
import p601x0.InterfaceC37796g;
import p715kotlin.jvm.functions.Function1;
import uk2.C35051a;

/* JADX INFO: renamed from: v0.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC35452b {

    /* JADX INFO: renamed from: a */
    public static final C35051a f150955a = new C35051a(24);

    /* JADX INFO: renamed from: b */
    public static final C35451a f150956b = new C35451a();

    /* JADX INFO: renamed from: a */
    public static final void m112524a(C36625a c36625a, final Context context, final boolean z4, final CharSequence charSequence, final long j7) {
        if (C23283u0.m67357c(j7) || charSequence.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        List list = (List) f150955a.invoke(context);
        if (list.isEmpty()) {
            return;
        }
        c36625a.m117695a();
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i13);
            c36625a.f156939a.m98a(new C37793d(new C37790a(i13), resolveInfo.loadLabel(packageManager).toString(), 0, new Function1() { // from class: v0.c
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    AbstractC35452b.f150956b.invoke(context, resolveInfo, Boolean.valueOf(z4), charSequence, new C23283u0(j7));
                    ((InterfaceC37796g) obj).close();
                    return C23454a0.f92919a;
                }
            }));
        }
        c36625a.m117695a();
    }
}
