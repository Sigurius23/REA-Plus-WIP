package p109e6;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;
import p007a6.C0448q;
import p082d6.AbstractC11725c;
import p082d6.C11724b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: e6.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12755j {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashSet f43635a = new LinkedHashSet();

    /* JADX INFO: renamed from: a */
    public static final C11724b m35700a(Context context, Set set, String str) {
        AbstractC22676k.m65750j(context, "context");
        if (set != f43635a) {
            return new C11724b(context, str, set, new C0448q(set, null, 6), new C12754i(3, null));
        }
        return new C11724b(context, str, AbstractC11725c.f37886a, new C0448q(set, null, 6), new C12754i(3, null));
    }
}
