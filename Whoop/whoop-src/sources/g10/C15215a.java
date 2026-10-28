package g10;

import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationContract;
import com.stripe.android.shoppay.ShopPayActivityContract;
import com.whoop.android.R;
import com.whoop.profile.view.edit.C9790n;
import e10.C12535b;
import e10.C12537c;
import e10.C12541e;
import e10.C12543f;
import e10.C12545g;
import e10.C12547h;
import e10.C12548h0;
import e10.C12553k;
import e10.C12567r;
import e10.C12571t;
import e10.C12572t0;
import e10.C12574u0;
import e10.EnumC12557m;
import e10.InterfaceC12549i;
import e10.InterfaceC12551j;
import e10.InterfaceC12555l;
import e10.InterfaceC12576v0;
import f10.C13999a;
import h20.C16661g3;
import h20.C16665h1;
import h30.C16800e;
import h30.C16801f;
import h30.C16802g;
import h30.C16803h;
import h30.InterfaceC16804i;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import m83.C25271y;
import n10.EnumC26121c0;
import o10.C27389b;
import o10.C27390c;
import o10.C27391d;
import o10.C27392e;
import o10.C27393f;
import o10.C27394g;
import org.json.JSONObject;
import p097ds.AbstractC12313p;
import p236j.AbstractC21065d;
import p236j.InterfaceC21064c;
import p479s4.AbstractC32128i;
import p499t9.C33623c0;
import p505ts.AbstractC34132o;
import p631xz.C38747x;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q10.C29790a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import v00.C35459c0;
import v20.C35566f;
import v20.C35568h;
import v20.C35569i;
import v20.C35570j;
import v20.C35580t;
import v20.C35581u;
import v20.C35582v;
import v20.InterfaceC35571k;
import y00.AbstractC38970u5;
import y00.C38809d5;
import y00.C38850h6;
import y00.C38915o4;
import y00.C38933q4;
import y00.C38977v3;
import y00.EnumC38828f4;
import y00.EnumC38941r3;
import z00.C39932a;

/* JADX INFO: renamed from: g10.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C15215a implements InterfaceC12551j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57137a = 2;

    /* JADX INFO: renamed from: b */
    public final Object f57138b;

    public C15215a(ShopPayActivityContract shopPayActivityContract) {
        AbstractC22676k.m65750j(shopPayActivityContract, "shopPayActivityContract");
        this.f57138b = shopPayActivityContract;
    }

    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: a */
    public final void mo35206a(Object obj, Object obj2, InterfaceC12555l interfaceC12555l, C12553k confirmationArgs) {
        switch (this.f57137a) {
            case 0:
                C35580t c35580t = (C35580t) obj2;
                C15216b confirmationOption = (C15216b) interfaceC12555l;
                AbstractC22676k.m65750j(confirmationOption, "confirmationOption");
                AbstractC22676k.m65750j(confirmationArgs, "confirmationArgs");
                C16665h1 appearance = confirmationArgs.f42878x.f150989f0;
                AbstractC22676k.m65750j(appearance, "appearance");
                ((C35581u) obj).f151329a.mo4052a(new C35566f(c35580t.f151326b, c35580t.f151325a, c35580t.f151328d, c35580t.f151327c, appearance), null);
                break;
            case 1:
                C27394g confirmationOption2 = (C27394g) interfaceC12555l;
                AbstractC22676k.m65750j(confirmationOption2, "confirmationOption");
                AbstractC22676k.m65750j(confirmationArgs, "confirmationArgs");
                ((C27389b) obj).f110099a.invoke(new C27391d(((C27390c) obj2).f110100a));
                break;
            default:
                AbstractC21065d abstractC21065d = (AbstractC21065d) obj;
                C29790a confirmationOption3 = (C29790a) interfaceC12555l;
                AbstractC22676k.m65750j(confirmationOption3, "confirmationOption");
                AbstractC22676k.m65750j(confirmationArgs, "confirmationArgs");
                C35459c0 c35459c0 = confirmationArgs.f42878x;
                C16661g3 c16661g3 = confirmationOption3.f121804w;
                String str = confirmationOption3.f121805x;
                String str2 = c35459c0.f150967J;
                if (str2 == null) {
                    str2 = confirmationOption3.f121806y;
                }
                abstractC21065d.mo4052a(new C16800e(c35459c0, c16661g3, str, str2), null);
                break;
        }
    }

    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: b */
    public final InterfaceC12555l mo35207b(InterfaceC12555l confirmationOption) {
        switch (this.f57137a) {
            case 0:
                AbstractC22676k.m65750j(confirmationOption, "confirmationOption");
                if (confirmationOption instanceof C15216b) {
                    return (C15216b) confirmationOption;
                }
                return null;
            case 1:
                AbstractC22676k.m65750j(confirmationOption, "confirmationOption");
                if (confirmationOption instanceof C27394g) {
                    return (C27394g) confirmationOption;
                }
                return null;
            default:
                AbstractC22676k.m65750j(confirmationOption, "confirmationOption");
                if (confirmationOption instanceof C29790a) {
                    return (C29790a) confirmationOption;
                }
                return null;
        }
    }

    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: c */
    public final boolean mo35208c(InterfaceC12555l interfaceC12555l, C12553k c12553k) {
        switch (this.f57137a) {
            case 0:
                AbstractC12313p.m34303u((C15216b) interfaceC12555l, c12553k);
                break;
            case 1:
                AbstractC12313p.m34303u((C27394g) interfaceC12555l, c12553k);
                break;
            default:
                AbstractC12313p.m34303u((C29790a) interfaceC12555l, c12553k);
                break;
        }
        return true;
    }

    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: d */
    public final void mo35209d(C35459c0 c35459c0) {
        switch (this.f57137a) {
            case 0:
                AbstractC12313p.m34302t(c35459c0);
                break;
            case 1:
                AbstractC12313p.m34302t(c35459c0);
                break;
            default:
                AbstractC12313p.m34302t(c35459c0);
                break;
        }
    }

    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: e */
    public final Object mo35210e(InterfaceC12555l interfaceC12555l, C12553k c12553k, C12548h0 c12548h0) {
        String str;
        String str2;
        switch (this.f57137a) {
            case 0:
                C38809d5 params = ((C15216b) interfaceC12555l).f57139w;
                AbstractC22676k.m65750j(params, "params");
                Map map = params.f167025V;
                C38977v3 c38977v3 = params.f167019P;
                C33623c0 c33623c0 = EnumC38828f4.f167088G;
                Object obj = ((LinkedHashMap) params.mo124325c0()).get("bacs_debit");
                Map map2 = obj instanceof Map ? (Map) obj : null;
                Object obj2 = map2 != null ? map2.get("account_number") : null;
                String str3 = obj2 instanceof String ? (String) obj2 : null;
                Object obj3 = map2 != null ? map2.get("sort_code") : null;
                String str4 = obj3 instanceof String ? (String) obj3 : null;
                C38933q4 c38933q4 = (str3 == null || str4 == null) ? null : new C38933q4(str3, str4);
                if (c38977v3 == null || (str = c38977v3.f167775y) == null) {
                    Object obj4 = map != null ? map.get("billing_details") : null;
                    Map map3 = obj4 instanceof Map ? (Map) obj4 : null;
                    Object obj5 = map3 != null ? map3.get("name") : null;
                    str = obj5 instanceof String ? (String) obj5 : null;
                }
                if (c38977v3 == null || (str2 = c38977v3.f167774x) == null) {
                    Object obj6 = map != null ? map.get("billing_details") : null;
                    Map map4 = obj6 instanceof Map ? (Map) obj6 : null;
                    Object obj7 = map4 != null ? map4.get(NotificationCompat.CATEGORY_EMAIL) : null;
                    str2 = obj7 instanceof String ? (String) obj7 : null;
                }
                C35580t c35580t = (c38933q4 == null || str == null || str2 == null) ? null : new C35580t(str, str2, c38933q4.f167601w, c38933q4.f167602x);
                return c35580t != null ? new C12537c(c35580t, true, null) : new C12535b(new IllegalArgumentException("Given confirmation option does not have expected Bacs data!"), AbstractC32128i.m100054h(R.string.stripe_something_went_wrong), C12567r.f42912a);
            case 1:
                return m43229i((C27394g) interfaceC12555l, c12548h0);
            default:
                return new C12537c(C23454a0.f92919a, false, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: f */
    public final InterfaceC12549i mo35211f(InterfaceC12555l interfaceC12555l, C12553k confirmationArgs, EnumC26121c0 enumC26121c0, Parcelable parcelable) {
        switch (this.f57137a) {
            case 0:
                C15216b confirmationOption = (C15216b) interfaceC12555l;
                InterfaceC35571k result = (InterfaceC35571k) parcelable;
                AbstractC22676k.m65750j(confirmationOption, "confirmationOption");
                AbstractC22676k.m65750j(confirmationArgs, "confirmationArgs");
                AbstractC22676k.m65750j(result, "result");
                if (result instanceof C35569i) {
                    return new C12545g(new C12572t0(confirmationOption.f57139w, null, 0 == true ? 1 : 0, false), confirmationArgs);
                }
                if (result instanceof C35570j) {
                    return new C12541e(EnumC12557m.f42885x);
                }
                if (result instanceof C35568h) {
                    return new C12541e(EnumC12557m.f42886y);
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                C27391d result2 = (C27391d) parcelable;
                AbstractC22676k.m65750j((C27394g) interfaceC12555l, "confirmationOption");
                AbstractC22676k.m65750j(confirmationArgs, "confirmationArgs");
                AbstractC22676k.m65750j(result2, "result");
                return new C12545g(result2.f110101w, confirmationArgs);
            default:
                InterfaceC16804i result3 = (InterfaceC16804i) parcelable;
                AbstractC22676k.m65750j((C29790a) interfaceC12555l, "confirmationOption");
                AbstractC22676k.m65750j(confirmationArgs, "confirmationArgs");
                AbstractC22676k.m65750j(result3, "result");
                if (result3.equals(C16801f.f64564w)) {
                    return new C12541e(EnumC12557m.f42886y);
                }
                if (result3 instanceof C16802g) {
                    return new C12547h(confirmationArgs.f42879y, enumC26121c0, false);
                }
                if (!(result3 instanceof C16803h)) {
                    throw new NoWhenBranchMatchedException();
                }
                Throwable th3 = ((C16803h) result3).f64566w;
                String message = th3.getMessage();
                if (message == null) {
                    message = "";
                }
                return new C12543f(th3, AbstractC32128i.m100055i(message), C12571t.f42932a);
        }
    }

    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: g */
    public final Object mo35212g(InterfaceC21064c activityResultCaller, C9790n c9790n) {
        switch (this.f57137a) {
            case 0:
                AbstractC22676k.m65750j(activityResultCaller, "activityResultCaller");
                C35582v c35582v = (C35582v) this.f57138b;
                AbstractC21065d activityResultLauncher = activityResultCaller.registerForActivityResult(new BacsMandateConfirmationContract(), new C13999a(c9790n, 1));
                c35582v.getClass();
                AbstractC22676k.m65750j(activityResultLauncher, "activityResultLauncher");
                return new C35581u(activityResultLauncher);
            case 1:
                AbstractC22676k.m65750j(activityResultCaller, "activityResultCaller");
                return new C27389b(c9790n);
            default:
                AbstractC22676k.m65750j(activityResultCaller, "activityResultCaller");
                return activityResultCaller.registerForActivityResult((ShopPayActivityContract) this.f57138b, new C13999a(c9790n, 8));
        }
    }

    @Override // e10.InterfaceC12551j
    public final String getKey() {
        switch (this.f57137a) {
            case 0:
                return "Bacs";
            case 1:
                return "LinkPassthrough";
            default:
                return "ShopPay";
        }
    }

    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo35213h(Object obj) {
        switch (this.f57137a) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public Object m43229i(C27394g c27394g, AbstractC32269c abstractC32269c) {
        C27392e c27392e;
        Object objM43230j;
        if (abstractC32269c instanceof C27392e) {
            c27392e = (C27392e) abstractC32269c;
            int i13 = c27392e.f110104y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c27392e.f110104y = i13 - Integer.MIN_VALUE;
            } else {
                c27392e = new C27392e(this, abstractC32269c);
            }
        } else {
            c27392e = new C27392e(this, abstractC32269c);
        }
        Object obj = c27392e.f110102w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c27392e.f110104y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c27392e.f110104y = 1;
            objM43230j = m43230j(c27394g, c27392e);
            if (objM43230j == obj2) {
                return obj2;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            objM43230j = ((C23468n) obj).f92940w;
        }
        Throwable thM68037a = C23468n.m68037a(objM43230j);
        return thM68037a == null ? new C12537c(new C27390c((InterfaceC12576v0) objM43230j), true, null) : new C12535b(thM68037a, AbstractC32128i.m100064s(R.string.stripe_something_went_wrong, new Object[0], C25271y.f99162w), C12567r.f42912a);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: j */
    public Object m43230j(C27394g c27394g, AbstractC32269c abstractC32269c) {
        C27393f c27393f;
        Object objM124167s;
        Object objM107888l;
        if (abstractC32269c instanceof C27393f) {
            c27393f = (C27393f) abstractC32269c;
            int i13 = c27393f.f110107y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c27393f.f110107y = i13 - Integer.MIN_VALUE;
            } else {
                c27393f = new C27393f(this, abstractC32269c);
            }
        } else {
            c27393f = new C27393f(this, abstractC32269c);
        }
        C27393f c27393f2 = c27393f;
        Object obj = c27393f2.f110105w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c27393f2.f110107y;
        AbstractC38970u5 abstractC38970u5 = null;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C38747x c38747x = (C38747x) this.f57138b;
            String str = c27394g.f110109w;
            String str2 = c27394g.f110110x;
            String str3 = c27394g.f110112z;
            String str4 = c27394g.f110111y;
            EnumC38941r3 enumC38941r3 = c27394g.f110108E;
            String str5 = enumC38941r3 != null ? enumC38941r3.f167636w : null;
            c27393f2.f110107y = 1;
            objM124167s = c38747x.m124167s(str, str2, str3, str4, str5, c27393f2);
            if (objM124167s == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            objM124167s = ((C23468n) obj).f92940w;
        }
        if (!(objM124167s instanceof C23467m)) {
            try {
                try {
                    objM107888l = new C39932a(29).m128096d(new JSONObject(((C38850h6) objM124167s).f167228x));
                } catch (Throwable th3) {
                    objM107888l = AbstractC34132o.m107888l(th3);
                }
                if (objM107888l instanceof C23467m) {
                    objM107888l = null;
                }
                objM124167s = (C38915o4) objM107888l;
                if (objM124167s == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
            } catch (Throwable th4) {
                objM124167s = AbstractC34132o.m107888l(th4);
            }
        }
        return !(objM124167s instanceof C23467m) ? new C12574u0((C38915o4) objM124167s, abstractC38970u5, 24) : objM124167s;
    }

    public C15215a(C35582v bacsMandateConfirmationLauncherFactory) {
        AbstractC22676k.m65750j(bacsMandateConfirmationLauncherFactory, "bacsMandateConfirmationLauncherFactory");
        this.f57138b = bacsMandateConfirmationLauncherFactory;
    }

    public C15215a(C38747x linkAccountManager) {
        AbstractC22676k.m65750j(linkAccountManager, "linkAccountManager");
        this.f57138b = linkAccountManager;
    }
}
