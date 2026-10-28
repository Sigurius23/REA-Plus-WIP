package h20;

import a00.C0072g;
import android.content.SharedPreferences;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import java.util.List;
import l83.C23454a0;
import l83.C23470p;
import m83.AbstractC25265s;
import p088dc.AbstractC11895b;
import p164g2.C15247s;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.C29817f0;
import q20.C29819g0;
import q20.C29821h0;
import q20.C29823i0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: h20.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C16669i extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f64106w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f64107x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f64108y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f64109z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16669i(C0072g c0072g, boolean z4, boolean z13, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f64109z = c0072g;
        this.f64107x = z4;
        this.f64108y = z13;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f64106w) {
            case 0:
                return new C16669i((C0072g) this.f64109z, this.f64107x, this.f64108y, interfaceC30057d);
            default:
                return new C16669i(this.f64107x, this.f64108y, (C15247s) this.f64109z, interfaceC30057d);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f64106w) {
            case 0:
                return ((C16669i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            default:
                C16669i c16669i = (C16669i) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c16669i.invokeSuspend(c23454a0);
                return c23454a0;
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        String strM31996o;
        int i13 = this.f64106w;
        Object obj2 = this.f64109z;
        boolean z4 = this.f64108y;
        boolean z13 = this.f64107x;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C0072g c0072g = (C0072g) obj2;
                Object value = ((C23470p) c0072g.f221E).getValue();
                AbstractC22676k.m65749i(value, "getValue(...)");
                SharedPreferences sharedPreferences = (SharedPreferences) value;
                String str = (String) c0072g.f224y;
                if (str == null || (strM31996o = AbstractC11895b.m31996o("customer[", str, "]")) == null) {
                    strM31996o = "guest";
                }
                Object c29823i0 = null;
                String string = sharedPreferences.getString(strM31996o, null);
                if (string == null) {
                    string = "";
                }
                List listM125906y0 = AbstractC39414r.m125906y0(string, new String[]{":"}, 6);
                String str2 = (String) AbstractC25265s.m74100H0(listM125906y0);
                if (str2 != null) {
                    int iHashCode = str2.hashCode();
                    if (iHashCode != -1534821982) {
                        if (iHashCode != -1029412550) {
                            if (iHashCode == 3321850 && str2.equals("link") && z4) {
                                c29823i0 = C29819g0.f121891w;
                            }
                        } else if (str2.equals("payment_method")) {
                            String str3 = (String) AbstractC25265s.m74102I0(1, listM125906y0);
                            if (str3 != null) {
                                String str4 = (String) AbstractC25265s.m74102I0(2, listM125906y0);
                                c29823i0 = new C29823i0(str3, str4 != null && Boolean.parseBoolean(str4));
                            }
                        }
                    } else if (str2.equals("google_pay") && z13) {
                        c29823i0 = C29817f0.f121885w;
                    }
                }
                return c29823i0 == null ? C29821h0.f121897w : c29823i0;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                if (z13 && !z4) {
                    ((C15247s) obj2).m43352b();
                }
                return C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16669i(boolean z4, boolean z13, C15247s c15247s, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f64107x = z4;
        this.f64108y = z13;
        this.f64109z = c15247s;
    }
}
