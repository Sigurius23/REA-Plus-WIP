package p395p6;

import android.content.Context;
import android.os.Bundle;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p550vd.AbstractC35902e;
import p605x6.C38006k;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: p6.d0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C28871d0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C28864b f116848E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ AbstractC28880g0 f116849F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Bundle f116850G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC4352n f116851H;

    /* JADX INFO: renamed from: w */
    public boolean f116852w;

    /* JADX INFO: renamed from: x */
    public int f116853x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f116854y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Context f116855z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28871d0(Context context, C28864b c28864b, AbstractC28880g0 abstractC28880g0, Bundle bundle, InterfaceC4352n interfaceC4352n, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f116855z = context;
        this.f116848E = c28864b;
        this.f116849F = abstractC28880g0;
        this.f116850G = bundle;
        this.f116851H = interfaceC4352n;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C28871d0 c28871d0 = new C28871d0(this.f116855z, this.f116848E, this.f116849F, this.f116850G, this.f116851H, interfaceC30057d);
        c28871d0.f116854y = obj;
        return c28871d0;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C28871d0) create((C38006k) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0092 A[RETURN] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        C38006k c38006k;
        boolean zBooleanValue;
        C38006k c38006k2;
        boolean z4;
        Object objInvoke;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f116853x;
        Context context = this.f116855z;
        C28864b c28864b = this.f116848E;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            C38006k c38006k3 = (C38006k) this.f116854y;
            String strM113970l = AbstractC35902e.m113970l(c28864b.f116802a);
            this.f116854y = c38006k3;
            this.f116853x = 1;
            Object objM121739a = c38006k3.m121739a(context, strM113970l, this);
            if (objM121739a != enumC31071a) {
                c38006k = c38006k3;
                obj = objM121739a;
            }
            return enumC31071a;
        }
        if (i13 == 1) {
            c38006k = (C38006k) this.f116854y;
            AbstractC34132o.m107864I(obj);
        } else {
            if (i13 != 2) {
                if (i13 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            z4 = this.f116852w;
            c38006k2 = (C38006k) this.f116854y;
            AbstractC34132o.m107864I(obj);
        }
        zBooleanValue = z4;
        c38006k = c38006k2;
        C28894l c28894l = (C28894l) c38006k.f162805a.get(AbstractC35902e.m113970l(c28864b.f116802a));
        AbstractC22676k.m65748h(c28894l, "null cannot be cast to non-null type androidx.glance.appwidget.AppWidgetSession");
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        this.f116854y = null;
        this.f116853x = 3;
        objInvoke = this.f116851H.invoke(c38006k, c28894l, boolValueOf, this);
        if (objInvoke == enumC31071a) {
            return enumC31071a;
        }
        return objInvoke;
        zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
            C28894l c28894l2 = (C28894l) c38006k.f162805a.get(AbstractC35902e.m113970l(c28864b.f116802a));
            AbstractC22676k.m65748h(c28894l2, "null cannot be cast to non-null type androidx.glance.appwidget.AppWidgetSession");
            Boolean boolValueOf2 = Boolean.valueOf(zBooleanValue);
            this.f116854y = null;
            this.f116853x = 3;
            objInvoke = this.f116851H.invoke(c38006k, c28894l2, boolValueOf2, this);
            if (objInvoke == enumC31071a) {
                return objInvoke;
            }
        } else {
            C28894l c28894lM87799a = this.f116849F.m87799a(context, c28864b, this.f116850G);
            this.f116854y = c38006k;
            this.f116852w = zBooleanValue;
            this.f116853x = 2;
            if (c38006k.m121741c(context, c28894lM87799a, this) != enumC31071a) {
                c38006k2 = c38006k;
                z4 = zBooleanValue;
                zBooleanValue = z4;
                c38006k = c38006k2;
                C28894l c28894l3 = (C28894l) c38006k.f162805a.get(AbstractC35902e.m113970l(c28864b.f116802a));
                AbstractC22676k.m65748h(c28894l3, "null cannot be cast to non-null type androidx.glance.appwidget.AppWidgetSession");
                Boolean boolValueOf3 = Boolean.valueOf(zBooleanValue);
                this.f116854y = null;
                this.f116853x = 3;
                objInvoke = this.f116851H.invoke(c38006k, c28894l3, boolValueOf3, this);
                if (objInvoke == enumC31071a) {
                    return objInvoke;
                }
            }
        }
        return enumC31071a;
    }
}
