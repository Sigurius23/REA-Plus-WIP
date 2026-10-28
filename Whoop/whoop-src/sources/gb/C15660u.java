package gb;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import ge3.AbstractC15751g;
import j93.InterfaceC21461d;
import java.util.Collection;
import l83.C23454a0;
import m83.AbstractC25265s;
import p026b2.C2312r;
import p114eb.C12991u0;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22673i0;
import qf3.C30330b;
import rf3.C31365d;
import tf3.C33768a;
import vf3.C35953c;
import wf3.C37247a;

/* JADX INFO: renamed from: gb.u */
/* JADX INFO: loaded from: classes.dex */
public final class C15660u extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f58765w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Context f58766x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15660u(Context context, int i13) {
        super(1);
        this.f58765w = i13;
        this.f58766x = context;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f58765w) {
            case 0:
                C12991u0 c12991u0M44451d = AbstractC15751g.m44451d(this.f58766x);
                c12991u0M44451d.m36380H((Bundle) obj);
                return c12991u0M44451d;
            default:
                C33768a module = (C33768a) obj;
                AbstractC22676k.m65750j(module, "$this$module");
                C2312r c2312r = new C2312r(this.f58766x, 6);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Context.class);
                C35953c c35953c = C37247a.f159360e;
                C31365d c31365dM73383p = AbstractC25012a.m73383p(new C30330b(c35953c, orCreateKotlinClass, null, c2312r, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), false);
                InterfaceC21461d clazz = c22673i0.getOrCreateKotlinClass(Application.class);
                AbstractC22676k.m65750j(clazz, "clazz");
                C30330b c30330b = c31365dM73383p.f129023a;
                c30330b.f124475f = AbstractC25265s.m74128f1(clazz, (Collection) c30330b.f124475f);
                module.m106774b(AbstractC21598x.m60669Y(clazz, c30330b.f124472c, c30330b.f124470a), c31365dM73383p, true);
                return C23454a0.f92919a;
        }
    }
}
