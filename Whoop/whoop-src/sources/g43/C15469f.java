package g43;

import android.content.Context;
import c93.InterfaceC4351m;
import p479s4.AbstractC32122c;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: g43.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C15469f extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public static final C15469f f58094w = new C15469f(2);

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Context context = (Context) obj;
        String permission = (String) obj2;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(permission, "permission");
        return Integer.valueOf(AbstractC32122c.checkSelfPermission(context, permission));
    }
}
