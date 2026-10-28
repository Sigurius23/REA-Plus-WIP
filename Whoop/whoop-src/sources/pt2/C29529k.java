package pt2;

import androidx.compose.animation.AbstractC1089a;
import androidx.health.platform.client.proto.C1533u;
import h02.C16602z;
import hu2.InterfaceC17654a;
import j02.EnumC21172v;
import java.util.List;
import jb1.C21536b;
import mt2.AbstractC25946g;
import nt2.AbstractC27131a;
import p026b2.C2299e;
import p026b2.C2306l;
import p040c0.AbstractC3788w0;
import p040c0.C3789x;
import p040c0.InterfaceC3770q;
import p208i2.InterfaceC17886g0;
import p270k2.InterfaceC22131e;
import p358o6.C27598f;
import p409q0.C29674b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.C25308q;
import pu2.C29554b;
import px0.AbstractC29593c;
import pz1.C29647e;
import q00.C29720i0;
import q11.AbstractC29794d;
import q11.AbstractC29798h;
import q21.AbstractC29848g;
import q22.AbstractC29854d;
import q22.EnumC29858h;
import q41.AbstractC29973f;
import q71.AbstractC30013d;
import q72.AbstractC30018a;
import q72.AbstractC30021d;
import r00.AbstractC30839a;
import y00.AbstractC38794c0;
import y00.C38774a0;
import y00.EnumC38853i;

/* JADX INFO: renamed from: pt2.k */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C29529k implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f120206w;

    public /* synthetic */ C29529k(int i13) {
        this.f120206w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        EnumC38853i enumC38853i;
        switch (this.f120206w) {
            case 0:
                return AbstractC29530l.m90345y((AbstractC27131a) obj);
            case 1:
                return AbstractC29530l.m90346z((AbstractC25946g) obj);
            case 2:
                return AbstractC29530l.m90298C((AbstractC27131a) obj);
            case 3:
                return AbstractC29530l.m90299D((AbstractC25946g) obj);
            case 4:
                return AbstractC29540v.m90390P(obj);
            case 5:
                return AbstractC29540v.m90383L0((AbstractC27131a) obj);
            case 6:
                return AbstractC29540v.m90385M0((AbstractC25946g) obj);
            case 7:
                return AbstractC29540v.m90401U0((InterfaceC22131e) obj);
            case 8:
                return AbstractC29540v.m90406Z((AbstractC27131a) obj);
            case 9:
                return AbstractC29540v.m90408a0((AbstractC25946g) obj);
            case 10:
                return AbstractC29517a0.m90204j((AbstractC27131a) obj);
            case 11:
                return AbstractC29519b0.m90223h((AbstractC27131a) obj);
            case 12:
                return C29554b.m90534r((InterfaceC17654a.c0) obj);
            case 13:
                return AbstractC29593c.m90757r((EnumC21172v) obj);
            case 14:
                return C29647e.m91064b((C21536b) obj);
            case 15:
                List list = (List) obj;
                Object obj2 = list.get(0);
                AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                AbstractC22676k.m65748h(obj3, "null cannot be cast to non-null type kotlin.Float");
                return new C29674b(((Float) obj3).floatValue(), iIntValue, new C16602z(list, 2));
            case 16:
                InterfaceC3770q AnimatedContent = (InterfaceC3770q) obj;
                C2306l c2306l = C2299e.f9107J;
                AbstractC22676k.m65750j(AnimatedContent, "$this$AnimatedContent");
                return ((Boolean) ((C3789x) AnimatedContent).mo11595b()).booleanValue() ? AbstractC1089a.m3345c(AbstractC3788w0.m11577e(null, 3).m11562a(AbstractC3788w0.m11576d(null, null, 13)), AbstractC3788w0.m11578f(null, 3)) : AbstractC1089a.m3345c(AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3).m11563a(AbstractC3788w0.m11584l(null, c2306l, null, 13)));
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractC22676k.m65750j((InterfaceC3770q) obj, "$this$AnimatedContent");
                return AbstractC30839a.f127147a;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C29720i0 it = (C29720i0) obj;
                AbstractC22676k.m65750j(it, "it");
                AbstractC38794c0 abstractC38794c0M91175d = it.m91175d();
                C38774a0 c38774a0 = abstractC38794c0M91175d instanceof C38774a0 ? (C38774a0) abstractC38794c0M91175d : null;
                return (c38774a0 == null || (enumC38853i = c38774a0.f166892K) == null) ? EnumC38853i.Unknown : enumC38853i;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC29794d.m91253g(obj);
            case 20:
                return AbstractC29798h.m91275j(obj);
            case 21:
                return AbstractC29848g.m91391f(obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC29854d.m91469t((EnumC29858h) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC29973f.m91683n((InterfaceC17886g0) obj);
            case 24:
                return AbstractC29973f.m91684o((InterfaceC17886g0) obj);
            case 25:
                return (C27598f) obj;
            case 26:
                return AbstractC30013d.m91879j(obj);
            case 27:
                return AbstractC30013d.m91883n(obj);
            case 28:
                return AbstractC30018a.m91894c((C25308q) obj);
            default:
                return AbstractC30021d.m91911i(obj);
        }
    }
}
