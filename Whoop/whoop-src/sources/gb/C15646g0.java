package gb;

import android.os.Bundle;
import hg3.AbstractC17269i;
import l83.C23454a0;
import m83.C25271y;
import p040c0.AbstractC3730c1;
import p040c0.AbstractC3736e1;
import p040c0.C3789x;
import p040c0.InterfaceC3770q;
import p114eb.AbstractC12939a0;
import p114eb.C12977n0;
import p114eb.C12982q;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22659b0;

/* JADX INFO: renamed from: gb.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C15646g0 extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f58721E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f58722w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f58723x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f58724y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f58725z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15646g0(Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        super(1);
        this.f58722w = i13;
        this.f58723x = obj;
        this.f58724y = obj2;
        this.f58725z = obj3;
        this.f58721E = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0081  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:55:0x0119  */
    /* JADX WARN: Code duplicated, block: B:68:0x0150  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function1 function1;
        Function1 function2;
        Function1 function3;
        Function1 function4;
        int i13 = this.f58722w;
        Object obj2 = null;
        Object obj3 = this.f58721E;
        Object obj4 = this.f58725z;
        Object obj5 = this.f58724y;
        Object obj6 = this.f58723x;
        switch (i13) {
            case 0:
                C3789x c3789x = (C3789x) ((InterfaceC3770q) obj);
                C12977n0 c12977n0 = ((C12982q) c3789x.mo11595b()).f44844x;
                AbstractC22676k.m65748h(c12977n0, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                C15647h c15647h = (C15647h) c12977n0;
                if (((Boolean) ((C15648i) obj6).f58731c.getValue()).booleanValue() || AbstractC17269i.m48890f((InterfaceC28601c1) obj3)) {
                    int i14 = C12977n0.f44815K;
                    for (C12977n0 c12977n1 : AbstractC34132o.m107896y(c15647h)) {
                        AbstractC3730c1 abstractC3730c1 = (!(c12977n1 instanceof C15647h) || (function1 = ((C15647h) c12977n1).f58729O) == null) ? null : (AbstractC3730c1) function1.invoke(c3789x);
                        if (abstractC3730c1 != null) {
                            obj2 = abstractC3730c1;
                            if (obj2 == null) {
                                return (AbstractC3730c1) ((Function1) obj5).invoke(c3789x);
                            }
                            return obj2;
                        }
                    }
                    if (obj2 == null) {
                        return (AbstractC3730c1) ((Function1) obj5).invoke(c3789x);
                    }
                    return obj2;
                }
                int i15 = C12977n0.f44815K;
                for (C12977n0 c12977n2 : AbstractC34132o.m107896y(c15647h)) {
                    AbstractC3730c1 abstractC3730c2 = (!(c12977n2 instanceof C15647h) || (function2 = ((C15647h) c12977n2).f58727M) == null) ? null : (AbstractC3730c1) function2.invoke(c3789x);
                    if (abstractC3730c2 != null) {
                        obj2 = abstractC3730c2;
                        if (obj2 == null) {
                            return (AbstractC3730c1) ((Function1) obj4).invoke(c3789x);
                        }
                        return obj2;
                    }
                }
                if (obj2 == null) {
                    return (AbstractC3730c1) ((Function1) obj4).invoke(c3789x);
                }
                return obj2;
            case 1:
                C3789x c3789x2 = (C3789x) ((InterfaceC3770q) obj);
                C12977n0 c12977n3 = ((C12982q) c3789x2.mo11596c()).f44844x;
                AbstractC22676k.m65748h(c12977n3, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                C15647h c15647h2 = (C15647h) c12977n3;
                if (((Boolean) ((C15648i) obj6).f58731c.getValue()).booleanValue() || AbstractC17269i.m48890f((InterfaceC28601c1) obj3)) {
                    int i16 = C12977n0.f44815K;
                    for (C12977n0 c12977n4 : AbstractC34132o.m107896y(c15647h2)) {
                        AbstractC3736e1 abstractC3736e1 = (!(c12977n4 instanceof C15647h) || (function3 = ((C15647h) c12977n4).f58730P) == null) ? null : (AbstractC3736e1) function3.invoke(c3789x2);
                        if (abstractC3736e1 != null) {
                            obj2 = abstractC3736e1;
                            if (obj2 == null) {
                                return (AbstractC3736e1) ((Function1) obj5).invoke(c3789x2);
                            }
                            return obj2;
                        }
                    }
                    if (obj2 == null) {
                        return (AbstractC3736e1) ((Function1) obj5).invoke(c3789x2);
                    }
                    return obj2;
                }
                int i17 = C12977n0.f44815K;
                for (C12977n0 c12977n5 : AbstractC34132o.m107896y(c15647h2)) {
                    AbstractC3736e1 abstractC3736e2 = (!(c12977n5 instanceof C15647h) || (function4 = ((C15647h) c12977n5).f58728N) == null) ? null : (AbstractC3736e1) function4.invoke(c3789x2);
                    if (abstractC3736e2 != null) {
                        obj2 = abstractC3736e2;
                        if (obj2 == null) {
                            return (AbstractC3736e1) ((Function1) obj4).invoke(c3789x2);
                        }
                        return obj2;
                    }
                }
                if (obj2 == null) {
                    return (AbstractC3736e1) ((Function1) obj4).invoke(c3789x2);
                }
                return obj2;
            default:
                C12982q it = (C12982q) obj;
                AbstractC22676k.m65750j(it, "it");
                ((C22659b0) obj6).f89329w = true;
                ((AbstractC12939a0) obj5).m36387a((C12977n0) obj4, (Bundle) obj3, it, C25271y.f99162w);
                return C23454a0.f92919a;
        }
    }
}
