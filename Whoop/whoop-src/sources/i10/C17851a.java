package i10;

import a30.C0294h;
import android.os.Parcelable;
import b20.C2326f;
import b20.EnumC2323c;
import b20.EnumC2324d;
import com.stripe.android.paymentelement.confirmation.cpms.CustomPaymentMethodContract;
import com.stripe.android.paymentsheet.ExternalPaymentMethodContract;
import com.whoop.profile.view.edit.C9790n;
import e10.C12535b;
import e10.C12537c;
import e10.C12541e;
import e10.C12543f;
import e10.C12545g;
import e10.C12547h;
import e10.C12548h0;
import e10.C12553k;
import e10.C12561o;
import e10.C12571t;
import e10.C12572t0;
import e10.C12574u0;
import e10.EnumC12557m;
import e10.InterfaceC12549i;
import e10.InterfaceC12551j;
import e10.InterfaceC12555l;
import e10.InterfaceC12576v0;
import f10.C13999a;
import g20.AbstractC15276v;
import g20.C15273s;
import g20.C15274t;
import g20.C15275u;
import h20.C16693m;
import h20.C16767y1;
import j00.AbstractC21106i0;
import j00.C21102g0;
import k10.C22117a;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import n10.EnumC26121c0;
import o10.C27388a;
import p000.AbstractC11266d;
import p097ds.AbstractC12313p;
import p10.C28692a;
import p10.C28693b;
import p10.C28694c;
import p10.C28695d;
import p10.C28696e;
import p10.C28699h;
import p10.EnumC28698g;
import p236j.AbstractC21065d;
import p236j.InterfaceC21064c;
import p505ts.AbstractC34132o;
import p550vd.AbstractC35903f;
import p599wz.AbstractC37747q;
import p599wz.AbstractC37748q0;
import p599wz.C37702b;
import p599wz.C37708d;
import p599wz.C37718g0;
import p599wz.C37734l1;
import p599wz.C37735m;
import p599wz.C37738n;
import p599wz.C37741o;
import p599wz.C37742o0;
import p599wz.C37744p;
import p599wz.C37745p0;
import p599wz.C37751r0;
import p599wz.EnumC37732l;
import p599wz.InterfaceC37711e;
import p631xz.C38721f0;
import p631xz.C38737n0;
import p665yz.C39898a;
import p665yz.C39900c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import v00.C35459c0;
import v10.C35540p;
import x30.AbstractC37926s0;
import y00.AbstractC38869j5;
import y00.C38809d5;
import y00.C38889l5;
import y00.C38907n5;
import y00.C38915o4;
import y00.EnumC38910o;

/* JADX INFO: renamed from: i10.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C17851a implements InterfaceC12551j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69467a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f69468b;

    /* JADX INFO: renamed from: c */
    public final Object f69469c;

    /* JADX INFO: renamed from: d */
    public final Object f69470d;

    public C17851a(String paymentElementCallbackIdentifier, C0294h c0294h, C2326f errorReporter) {
        AbstractC22676k.m65750j(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        this.f69468b = paymentElementCallbackIdentifier;
        this.f69470d = c0294h;
        this.f69469c = errorReporter;
    }

    /* JADX INFO: renamed from: l */
    public static C12572t0 m51334l(C28699h c28699h) {
        return new C12572t0(c28699h.f116089w, c28699h.f116090x, c28699h.f116091y, c28699h.f116092z == EnumC28698g.f116083x);
    }

    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: a */
    public final void mo35206a(Object obj, Object obj2, InterfaceC12555l interfaceC12555l, C12553k confirmationArgs) {
        switch (this.f69467a) {
            case 0:
                C17852b confirmationOption = (C17852b) interfaceC12555l;
                AbstractC22676k.m65750j(confirmationOption, "confirmationOption");
                AbstractC22676k.m65750j(confirmationArgs, "confirmationArgs");
                C2326f c2326f = (C2326f) this.f69469c;
                EnumC2324d enumC2324d = EnumC2324d.CUSTOM_PAYMENT_METHODS_LAUNCH_SUCCESS;
                C16767y1 c16767y1 = confirmationOption.f69471w;
                AbstractC35903f.m113990H(c2326f, enumC2324d, null, AbstractC31061c.m95645u("custom_payment_method_type", c16767y1.f64443w), 2);
                ((AbstractC21065d) obj).mo4052a(new C17853c((String) this.f69468b, c16767y1, confirmationOption.f69472x), null);
                break;
            case 1:
                C22117a confirmationOption2 = (C22117a) interfaceC12555l;
                AbstractC22676k.m65750j(confirmationOption2, "confirmationOption");
                AbstractC22676k.m65750j(confirmationArgs, "confirmationArgs");
                C2326f c2326f2 = (C2326f) this.f69469c;
                EnumC2324d enumC2324d2 = EnumC2324d.EXTERNAL_PAYMENT_METHODS_LAUNCH_SUCCESS;
                String str = confirmationOption2.f85812w;
                AbstractC35903f.m113990H(c2326f2, enumC2324d2, null, AbstractC31061c.m95645u("external_payment_method_type", str), 2);
                ((AbstractC21065d) obj).mo4052a(new C16693m((String) this.f69468b, str, confirmationOption2.f85813x), null);
                break;
            case 2:
                C27388a confirmationOption3 = (C27388a) interfaceC12555l;
                AbstractC22676k.m65750j(confirmationOption3, "confirmationOption");
                AbstractC22676k.m65750j(confirmationArgs, "confirmationArgs");
                C37718g0 c37718g0 = confirmationOption3.f110096w;
                ((C37751r0) obj).m121159b(confirmationArgs.f42878x, (C37708d) ((C38721f0) this.f69469c).f166664b.f45200w.getValue(), c37718g0, confirmationOption3.f110098y, confirmationOption3.f110097x);
                break;
            default:
                AbstractC22676k.m65750j((C28699h) interfaceC12555l, "confirmationOption");
                AbstractC22676k.m65750j(confirmationArgs, "confirmationArgs");
                ((C28692a) obj).f116061a.invoke(new C28694c(((C28693b) obj2).f116062a));
                break;
        }
    }

    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: b */
    public final InterfaceC12555l mo35207b(InterfaceC12555l confirmationOption) {
        switch (this.f69467a) {
            case 0:
                AbstractC22676k.m65750j(confirmationOption, "confirmationOption");
                if (confirmationOption instanceof C17852b) {
                    return (C17852b) confirmationOption;
                }
                return null;
            case 1:
                AbstractC22676k.m65750j(confirmationOption, "confirmationOption");
                if (confirmationOption instanceof C22117a) {
                    return (C22117a) confirmationOption;
                }
                return null;
            case 2:
                AbstractC22676k.m65750j(confirmationOption, "confirmationOption");
                if (confirmationOption instanceof C27388a) {
                    return (C27388a) confirmationOption;
                }
                return null;
            default:
                AbstractC22676k.m65750j(confirmationOption, "confirmationOption");
                if (confirmationOption instanceof C28699h) {
                    return (C28699h) confirmationOption;
                }
                return null;
        }
    }

    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: c */
    public final boolean mo35208c(InterfaceC12555l interfaceC12555l, C12553k c12553k) {
        switch (this.f69467a) {
            case 0:
                AbstractC12313p.m34303u((C17852b) interfaceC12555l, c12553k);
                break;
            case 1:
                AbstractC12313p.m34303u((C22117a) interfaceC12555l, c12553k);
                break;
            case 2:
                AbstractC12313p.m34303u((C27388a) interfaceC12555l, c12553k);
                break;
            default:
                AbstractC12313p.m34303u((C28699h) interfaceC12555l, c12553k);
                break;
        }
        return true;
    }

    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: d */
    public final void mo35209d(C35459c0 c35459c0) {
        switch (this.f69467a) {
            case 0:
                AbstractC12313p.m34302t(c35459c0);
                break;
            case 1:
                AbstractC12313p.m34302t(c35459c0);
                break;
            case 2:
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
        switch (this.f69467a) {
            case 0:
                String str = ((C17852b) interfaceC12555l).f69471w.f64443w;
                ((C0294h) this.f69470d).get();
                AbstractC35903f.m113990H((C2326f) this.f69469c, EnumC2323c.CUSTOM_PAYMENT_METHOD_CONFIRM_HANDLER_NULL, null, AbstractC31061c.m95645u("custom_payment_method_type", str), 2);
                IllegalStateException illegalStateException = new IllegalStateException(AbstractC11266d.m30461o("confirmCustomPaymentMethodCallback is null. Cannot process payment for payment selection: ", str));
                return new C12535b(illegalStateException, AbstractC37926s0.m121456H(illegalStateException), C12571t.f42932a);
            case 1:
                String str2 = ((C22117a) interfaceC12555l).f85812w;
                ((C0294h) this.f69470d).get();
                AbstractC35903f.m113990H((C2326f) this.f69469c, EnumC2323c.EXTERNAL_PAYMENT_METHOD_CONFIRM_HANDLER_NULL, null, AbstractC31061c.m95645u("external_payment_method_type", str2), 2);
                IllegalStateException illegalStateException2 = new IllegalStateException(AbstractC11266d.m30461o("externalPaymentMethodConfirmHandler is null. Cannot process payment for payment selection: ", str2));
                return new C12535b(illegalStateException2, AbstractC37926s0.m121456H(illegalStateException2), C12561o.f42898a);
            case 2:
                return new C12537c(C23454a0.f92919a, false, null);
            default:
                return m51335i((C28699h) interfaceC12555l, c12548h0);
        }
    }

    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: f */
    public final InterfaceC12549i mo35211f(InterfaceC12555l interfaceC12555l, C12553k confirmationArgs, EnumC26121c0 enumC26121c0, Parcelable parcelable) {
        switch (this.f69467a) {
            case 0:
                C17852b confirmationOption = (C17852b) interfaceC12555l;
                AbstractC17857g result = (AbstractC17857g) parcelable;
                AbstractC22676k.m65750j(confirmationOption, "confirmationOption");
                AbstractC22676k.m65750j(confirmationArgs, "confirmationArgs");
                AbstractC22676k.m65750j(result, "result");
                if (result instanceof C17855e) {
                    return new C12547h(confirmationArgs.f42879y, null, true);
                }
                if (result instanceof C17856f) {
                    Throwable th3 = ((C17856f) result).f69478w;
                    return new C12543f(th3, AbstractC37926s0.m121456H(th3), C12571t.f42932a);
                }
                if (result instanceof C17854d) {
                    return new C12541e(EnumC12557m.f42886y);
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                C22117a confirmationOption2 = (C22117a) interfaceC12555l;
                AbstractC15276v result2 = (AbstractC15276v) parcelable;
                AbstractC22676k.m65750j(confirmationOption2, "confirmationOption");
                AbstractC22676k.m65750j(confirmationArgs, "confirmationArgs");
                AbstractC22676k.m65750j(result2, "result");
                if (result2 instanceof C15274t) {
                    return new C12547h(confirmationArgs.f42879y, null, true);
                }
                if (result2 instanceof C15275u) {
                    Throwable th4 = ((C15275u) result2).f57361w;
                    return new C12543f(th4, AbstractC37926s0.m121456H(th4), C12561o.f42898a);
                }
                if (result2 instanceof C15273s) {
                    return new C12541e(EnumC12557m.f42886y);
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                C27388a confirmationOption3 = (C27388a) interfaceC12555l;
                AbstractC37747q result3 = (AbstractC37747q) parcelable;
                AbstractC22676k.m65750j(confirmationOption3, "confirmationOption");
                AbstractC22676k.m65750j(confirmationArgs, "confirmationArgs");
                AbstractC22676k.m65750j(result3, "result");
                boolean z4 = result3 instanceof C37735m;
                if (!z4 || ((C37735m) result3).f161688w != EnumC37732l.f161680w) {
                    ((C38737n0) this.f69470d).m124148a();
                }
                if (result3 instanceof C37744p) {
                    return new C12545g(new C12574u0(((C37744p) result3).f161707w, null, 24), confirmationArgs);
                }
                if (result3 instanceof C37741o) {
                    C37741o c37741o = (C37741o) result3;
                    m51338m(c37741o.f161702x);
                    Throwable th5 = c37741o.f161701w;
                    return new C12543f(th5, AbstractC37926s0.m121456H(th5), C12571t.f42932a);
                }
                if (z4) {
                    m51338m(((C37735m) result3).f161689x);
                    return new C12541e(EnumC12557m.f42884w);
                }
                if (!(result3 instanceof C37738n)) {
                    throw new NoWhenBranchMatchedException();
                }
                m51338m(((C37738n) result3).f161695w);
                return new C12547h(confirmationArgs.f42879y, enumC26121c0, true);
            default:
                C28699h confirmationOption4 = (C28699h) interfaceC12555l;
                C28694c result4 = (C28694c) parcelable;
                AbstractC22676k.m65750j(confirmationOption4, "confirmationOption");
                AbstractC22676k.m65750j(confirmationArgs, "confirmationArgs");
                AbstractC22676k.m65750j(result4, "result");
                return new C12545g(result4.f116063w, confirmationArgs);
        }
    }

    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: g */
    public final Object mo35212g(InterfaceC21064c activityResultCaller, C9790n c9790n) {
        switch (this.f69467a) {
            case 0:
                AbstractC22676k.m65750j(activityResultCaller, "activityResultCaller");
                return activityResultCaller.registerForActivityResult(new CustomPaymentMethodContract(), new C13999a(c9790n, 3));
            case 1:
                AbstractC22676k.m65750j(activityResultCaller, "activityResultCaller");
                return activityResultCaller.registerForActivityResult(new ExternalPaymentMethodContract((C2326f) this.f69469c), new C13999a(c9790n, 5));
            case 2:
                AbstractC22676k.m65750j(activityResultCaller, "activityResultCaller");
                C37751r0 c37751r0 = (C37751r0) this.f69468b;
                c37751r0.getClass();
                c37751r0.f161719e = activityResultCaller.registerForActivityResult(c37751r0.f161716b, new C35540p(2, c37751r0, c9790n));
                return c37751r0;
            default:
                AbstractC22676k.m65750j(activityResultCaller, "activityResultCaller");
                return new C28692a(c9790n);
        }
    }

    @Override // e10.InterfaceC12551j
    public final String getKey() {
        switch (this.f69467a) {
            case 0:
                return "CustomPaymentMethod";
            case 1:
                return "ExternalPaymentMethod";
            case 2:
                return "Link";
            default:
                return "LinkInlineSignup";
        }
    }

    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: h */
    public final void mo35213h(Object obj) {
        switch (this.f69467a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                C37751r0 launcher = (C37751r0) obj;
                AbstractC22676k.m65750j(launcher, "launcher");
                AbstractC21065d abstractC21065d = launcher.f161719e;
                if (abstractC21065d != null) {
                    abstractC21065d.mo4053b();
                }
                launcher.f161719e = null;
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public Object m51335i(C28699h c28699h, AbstractC32269c abstractC32269c) {
        C28695d c28695d;
        if (abstractC32269c instanceof C28695d) {
            c28695d = (C28695d) abstractC32269c;
            int i13 = c28695d.f116066y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c28695d.f116066y = i13 - Integer.MIN_VALUE;
            } else {
                c28695d = new C28695d(this, abstractC32269c);
            }
        } else {
            c28695d = new C28695d(this, abstractC32269c);
        }
        Object objM51337k = c28695d.f116064w;
        Object obj = EnumC31071a.f128113w;
        int i14 = c28695d.f116066y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM51337k);
            c28695d.f116066y = 1;
            objM51337k = m51337k(c28699h, c28695d);
            if (objM51337k == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM51337k);
        }
        return new C12537c(new C28693b((InterfaceC12576v0) objM51337k), true, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public Object m51336j(C28699h c28699h, AbstractC21106i0 abstractC21106i0, AbstractC32269c abstractC32269c) {
        C28696e c28696e;
        C17851a c17851a;
        EnumC28698g enumC28698g;
        Object obj;
        AbstractC38869j5 abstractC38869j5;
        C28699h c28699h2;
        C37718g0 c37718g0;
        if (abstractC32269c instanceof C28696e) {
            c28696e = (C28696e) abstractC32269c;
            int i13 = c28696e.f116070H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c28696e.f116070H = i13 - Integer.MIN_VALUE;
            } else {
                c28696e = new C28696e(this, abstractC32269c);
            }
        } else {
            c28696e = new C28696e(this, abstractC32269c);
        }
        Object obj2 = c28696e.f116068F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c28696e.f116070H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj2);
            if (abstractC21106i0 instanceof C21102g0) {
                ((C39898a) this.f69470d).f172270a.m128003a(C39900c.f172281I, null);
                return m51334l(c28699h);
            }
            C38809d5 c38809d5 = c28699h.f116089w;
            EnumC28698g enumC28698g2 = c28699h.f116092z;
            AbstractC38869j5 abstractC38869j6 = c28699h.f116091y;
            C37718g0 c37718g1 = c28699h.f116087E;
            C37734l1 c37734l1 = (C37734l1) this.f69468b;
            c28696e.f116071w = this;
            c28696e.f116072x = c28699h;
            c28696e.f116073y = enumC28698g2;
            c28696e.f116074z = abstractC38869j6;
            c28696e.f116067E = c37718g1;
            c28696e.f116070H = 1;
            Object objM121147a = c37734l1.m121147a(c37718g1, c38809d5, c28696e);
            if (objM121147a == enumC31071a) {
                return enumC31071a;
            }
            c17851a = this;
            enumC28698g = enumC28698g2;
            obj = objM121147a;
            abstractC38869j5 = abstractC38869j6;
            c28699h2 = c28699h;
            c37718g0 = c37718g1;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c37718g0 = c28696e.f116067E;
            abstractC38869j5 = c28696e.f116074z;
            enumC28698g = c28696e.f116073y;
            c28699h2 = c28696e.f116072x;
            c17851a = c28696e.f116071w;
            AbstractC34132o.m107864I(obj2);
            obj = ((C23468n) obj2).f92940w;
        }
        if (obj instanceof C23467m) {
            obj = null;
        }
        AbstractC37748q0 abstractC37748q0 = (AbstractC37748q0) obj;
        if (abstractC37748q0 instanceof C37742o0) {
            ((C38737n0) c17851a.f69469c).m124148a();
            return new C12572t0(((C37742o0) abstractC37748q0).f161704x, c37718g0.f161608H ? new C38889l5(3, null, enumC28698g.f116086w) : new C38907n5(enumC28698g.f116086w), abstractC38869j5, enumC28698g == EnumC28698g.f116083x);
        }
        if (!(abstractC37748q0 instanceof C37745p0)) {
            if (abstractC37748q0 != null) {
                throw new NoWhenBranchMatchedException();
            }
            c17851a.getClass();
            return m51334l(c28699h2);
        }
        ((C38737n0) c17851a.f69469c).m124148a();
        C38915o4 c38915o4 = ((C37745p0) abstractC37748q0).f161710y;
        EnumC38910o enumC38910o = EnumC38910o.OffSession;
        if (enumC28698g != EnumC28698g.f116083x) {
            enumC38910o = null;
        }
        if (enumC38910o == null) {
            enumC38910o = EnumC38910o.Blank;
        }
        return new C12574u0(c38915o4, new C38889l5(3, null, enumC38910o), 24);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:86:0x0151  */
    /* JADX WARN: Code duplicated, block: B:91:0x0166  */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0160, code lost:
    
        if (r2 == r4) goto L88;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m51337k(p10.C28699h r22, s83.AbstractC32269c r23) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i10.C17851a.m51337k(p10.h, s83.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: m */
    public void m51338m(InterfaceC37711e interfaceC37711e) {
        if (interfaceC37711e instanceof C37708d) {
            ((C38721f0) this.f69469c).m124147a((C37708d) interfaceC37711e);
        } else if (!AbstractC22676k.m65745e(interfaceC37711e, C37702b.f161559w)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public C17851a(C37751r0 linkPaymentLauncher, C38737n0 linkStore, C38721f0 linkAccountHolder) {
        AbstractC22676k.m65750j(linkPaymentLauncher, "linkPaymentLauncher");
        AbstractC22676k.m65750j(linkStore, "linkStore");
        AbstractC22676k.m65750j(linkAccountHolder, "linkAccountHolder");
        this.f69468b = linkPaymentLauncher;
        this.f69470d = linkStore;
        this.f69469c = linkAccountHolder;
    }

    public C17851a(String paymentElementCallbackIdentifier, C0294h c0294h, C2326f errorReporter, byte b) {
        AbstractC22676k.m65750j(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        this.f69468b = paymentElementCallbackIdentifier;
        this.f69470d = c0294h;
        this.f69469c = errorReporter;
    }

    public C17851a(C37734l1 c37734l1, C39898a linkAnalyticsHelper, C38737n0 c38737n0) {
        AbstractC22676k.m65750j(linkAnalyticsHelper, "linkAnalyticsHelper");
        this.f69468b = c37734l1;
        this.f69470d = linkAnalyticsHelper;
        this.f69469c = c38737n0;
    }
}
