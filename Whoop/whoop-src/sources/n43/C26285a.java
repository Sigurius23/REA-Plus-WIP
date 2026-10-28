package n43;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.compose.p018ui.node.NodeCoordinator;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.EnumC1635w;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.room.AbstractC1772c1;
import b23.C2343i;
import b23.EnumC2341g;
import b23.InterfaceC2344j;
import bc3.AbstractC3006f0;
import bc3.C3022j0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3018i0;
import c93.InterfaceC4351m;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity;
import com.stripe.android.link.LinkActivity;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity;
import com.stripe.android.view.CardMultilineWidget;
import com.stripe.android.view.CardNumberEditText;
import dc3.InterfaceC11936u;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fi.C14503i;
import gm.C15990r;
import h40.C16845k;
import hc3.C17171d;
import j43.C21318b;
import l83.C23454a0;
import m40.C25046w;
import n23.AbstractC26202e;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import n53.C26318e;
import ne3.InterfaceC26618i;
import o23.C27478h;
import o23.C27481k;
import o23.C27487q;
import o23.InterfaceC27471a;
import p005a3.C0271z0;
import p028b4.C2698i;
import p077d0.InterfaceC11337c0;
import p096dq.C12268l;
import p236j.AbstractC21065d;
import p293l2.C23226c;
import p294l3.C23250e;
import p335n6.InterfaceC26395l;
import p389p0.C28550t;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28661r1;
import p395p6.AbstractC28880g0;
import p445r0.C30838f;
import p459rf.C31353x;
import p461rh.C31431t;
import p505ts.AbstractC34132o;
import p512u2.InterfaceC34476v;
import p537ux.C35357s0;
import p599wz.C37770y;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import q30.AbstractC29907h;
import q30.C29932t0;
import q30.C29936v0;
import q83.InterfaceC30057d;
import r30.C30897b;
import r83.EnumC31071a;
import s40.C32132a;
import s83.AbstractC32275i;
import sz.C33161z;
import t23.C33366b4;
import t23.C33376d2;
import t23.C33413k3;
import t23.C33450s0;
import t30.C33505g;
import v20.InterfaceC35571k;
import w20.InterfaceC36725o;
import y00.C38809d5;

/* JADX INFO: renamed from: n43.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C26285a extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f104490E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f104491w;

    /* JADX INFO: renamed from: x */
    public int f104492x;

    /* JADX INFO: renamed from: y */
    public Object f104493y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f104494z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26285a(InterfaceC1585g0 interfaceC1585g0, InterfaceC13058l interfaceC13058l, InterfaceC30057d interfaceC30057d, CardMultilineWidget cardMultilineWidget) {
        super(2, interfaceC30057d);
        this.f104491w = 18;
        EnumC1635w enumC1635w = EnumC1635w.f6325w;
        this.f104494z = interfaceC13058l;
        this.f104490E = cardMultilineWidget;
        this.f104493y = interfaceC1585g0;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006a A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #1 {all -> 0x005d, blocks: (B:32:0x0062, B:34:0x006a, B:23:0x0041, B:25:0x004b), top: B:69:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0080  */
    /* JADX WARN: Code duplicated, block: B:41:0x0090  */
    /* JADX WARN: Code duplicated, block: B:44:0x0097 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:8:0x0016, B:42:0x0091, B:44:0x0097, B:46:0x00b1, B:49:0x00d0, B:51:0x00d4, B:53:0x00d8, B:55:0x00ec, B:56:0x00f6, B:57:0x00fb, B:47:0x00cc, B:58:0x00fc, B:59:0x0101), top: B:68:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b1 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:8:0x0016, B:42:0x0091, B:44:0x0097, B:46:0x00b1, B:49:0x00d0, B:51:0x00d4, B:53:0x00d8, B:55:0x00ec, B:56:0x00f6, B:57:0x00fb, B:47:0x00cc, B:58:0x00fc, B:59:0x0101), top: B:68:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00cc A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:8:0x0016, B:42:0x0091, B:44:0x0097, B:46:0x00b1, B:49:0x00d0, B:51:0x00d4, B:53:0x00d8, B:55:0x00ec, B:56:0x00f6, B:57:0x00fb, B:47:0x00cc, B:58:0x00fc, B:59:0x0101), top: B:68:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d4 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:8:0x0016, B:42:0x0091, B:44:0x0097, B:46:0x00b1, B:49:0x00d0, B:51:0x00d4, B:53:0x00d8, B:55:0x00ec, B:56:0x00f6, B:57:0x00fb, B:47:0x00cc, B:58:0x00fc, B:59:0x0101), top: B:68:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d8 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:8:0x0016, B:42:0x0091, B:44:0x0097, B:46:0x00b1, B:49:0x00d0, B:51:0x00d4, B:53:0x00d8, B:55:0x00ec, B:56:0x00f6, B:57:0x00fb, B:47:0x00cc, B:58:0x00fc, B:59:0x0101), top: B:68:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ec A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:8:0x0016, B:42:0x0091, B:44:0x0097, B:46:0x00b1, B:49:0x00d0, B:51:0x00d4, B:53:0x00d8, B:55:0x00ec, B:56:0x00f6, B:57:0x00fb, B:47:0x00cc, B:58:0x00fc, B:59:0x0101), top: B:68:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f6 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:8:0x0016, B:42:0x0091, B:44:0x0097, B:46:0x00b1, B:49:0x00d0, B:51:0x00d4, B:53:0x00d8, B:55:0x00ec, B:56:0x00f6, B:57:0x00fb, B:47:0x00cc, B:58:0x00fc, B:59:0x0101), top: B:68:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00fc A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:8:0x0016, B:42:0x0091, B:44:0x0097, B:46:0x00b1, B:49:0x00d0, B:51:0x00d4, B:53:0x00d8, B:55:0x00ec, B:56:0x00f6, B:57:0x00fb, B:47:0x00cc, B:58:0x00fc, B:59:0x0101), top: B:68:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0112  */
    /* JADX WARN: Code duplicated, block: B:64:0x011a  */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x00b1, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [bc3.c0] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX INFO: renamed from: f */
    private final Object m77996f(Object obj) {
        ?? r10;
        EnumC2341g enumC2341g;
        String strM5370G;
        String message;
        InterfaceC2994c0 interfaceC2994c0;
        InterfaceC2994c0 interfaceC2994c1;
        C3022j0 c3022j0M8711e;
        ?? r14;
        AbstractC26205h abstractC26205h;
        AbstractC26202e abstractC26202e;
        EnumC2341g enumC2341g2;
        String strM5370G2;
        EnumC2341g enumC2341g3;
        String strM5370G3;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        ?? r15 = this.f104492x;
        try {
            if (r15 != 0) {
                if (r15 == 1) {
                    interfaceC2994c1 = (InterfaceC2994c0) this.f104493y;
                    AbstractC34132o.m107864I(obj);
                } else {
                    if (r15 == 2) {
                        InterfaceC2994c0 interfaceC2994c2 = (InterfaceC2994c0) this.f104493y;
                        AbstractC34132o.m107864I(obj);
                        r15 = interfaceC2994c2;
                        this.f104493y = r15;
                        this.f104492x = 3;
                        obj = ((InterfaceC3018i0) obj).await(this);
                        if (obj != enumC31071a) {
                            r14 = r15;
                        }
                        return enumC31071a;
                    }
                    if (r15 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r10 = (InterfaceC2994c0) this.f104493y;
                    try {
                        AbstractC34132o.m107864I(obj);
                        r14 = r10;
                    } catch (Throwable th3) {
                        th = th3;
                        enumC2341g = EnumC2341g.DEBUG;
                        strM5370G = AbstractC1772c1.m5370G(r10);
                        C2343i c2343i = C2343i.f9269a;
                        if (C2343i.f9272d.isLoggable(enumC2341g, strM5370G)) {
                            InterfaceC2344j interfaceC2344j = C2343i.f9271c;
                            message = th.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            interfaceC2344j.log(enumC2341g, strM5370G, message, null);
                        }
                    }
                }
                abstractC26205h = (AbstractC26205h) obj;
                if (abstractC26205h instanceof C26204g) {
                    ((Number) ((C26204g) abstractC26205h).f103919a).longValue();
                    enumC2341g3 = EnumC2341g.DEBUG;
                    strM5370G3 = AbstractC1772c1.m5370G(r14);
                    C2343i c2343i2 = C2343i.f9269a;
                    if (C2343i.f9272d.isLoggable(enumC2341g3, strM5370G3)) {
                        C2343i.f9271c.log(enumC2341g3, strM5370G3, "Connection succeeded! (duration: " + abstractC26205h.m77816b() + ")", null);
                    }
                } else if (!(abstractC26205h instanceof C26203f)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!(abstractC26205h instanceof C26204g)) {
                    if (!(abstractC26205h instanceof C26203f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    abstractC26202e = ((C26203f) abstractC26205h).f103918a;
                    enumC2341g2 = EnumC2341g.DEBUG;
                    strM5370G2 = AbstractC1772c1.m5370G(r14);
                    C2343i c2343i3 = C2343i.f9269a;
                    if (C2343i.f9272d.isLoggable(enumC2341g2, strM5370G2)) {
                        C2343i.f9271c.log(enumC2341g2, strM5370G2, abstractC26202e.mo77807a(), null);
                    }
                }
                return C23454a0.f92919a;
            }
            AbstractC34132o.m107864I(obj);
            interfaceC2994c0 = (InterfaceC2994c0) this.f104493y;
            try {
                if (!((C33413k3) this.f104494z).f139503f.f43506d) {
                    if (((C33413k3) this.f104494z).f139513p) {
                        C33366b4 c33366b4 = (C33366b4) this.f104490E;
                        this.f104493y = interfaceC2994c0;
                        this.f104492x = 2;
                        c3022j0M8711e = AbstractC3006f0.m8711e(c33366b4.f139260x, null, new C2698i(c33366b4, null), 3);
                        if (c3022j0M8711e != enumC31071a) {
                            r15 = interfaceC2994c0;
                            obj = c3022j0M8711e;
                            this.f104493y = r15;
                            this.f104492x = 3;
                            obj = ((InterfaceC3018i0) obj).await(this);
                            if (obj != enumC31071a) {
                                r14 = r15;
                                abstractC26205h = (AbstractC26205h) obj;
                                if (abstractC26205h instanceof C26204g) {
                                    ((Number) ((C26204g) abstractC26205h).f103919a).longValue();
                                    enumC2341g3 = EnumC2341g.DEBUG;
                                    strM5370G3 = AbstractC1772c1.m5370G(r14);
                                    C2343i c2343i4 = C2343i.f9269a;
                                    if (C2343i.f9272d.isLoggable(enumC2341g3, strM5370G3)) {
                                        C2343i.f9271c.log(enumC2341g3, strM5370G3, "Connection succeeded! (duration: " + abstractC26205h.m77816b() + ")", null);
                                    }
                                } else if (!(abstractC26205h instanceof C26203f)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (!(abstractC26205h instanceof C26204g)) {
                                    if (!(abstractC26205h instanceof C26203f)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    abstractC26202e = ((C26203f) abstractC26205h).f103918a;
                                    enumC2341g2 = EnumC2341g.DEBUG;
                                    strM5370G2 = AbstractC1772c1.m5370G(r14);
                                    C2343i c2343i5 = C2343i.f9269a;
                                    if (C2343i.f9272d.isLoggable(enumC2341g2, strM5370G2)) {
                                        C2343i.f9271c.log(enumC2341g2, strM5370G2, abstractC26202e.mo77807a(), null);
                                    }
                                }
                            }
                        }
                    }
                    return C23454a0.f92919a;
                }
                C33366b4 c33366b5 = (C33366b4) this.f104490E;
                this.f104493y = interfaceC2994c0;
                this.f104492x = 1;
                if (c33366b5.m105804v(this) != enumC31071a) {
                    interfaceC2994c1 = interfaceC2994c0;
                }
                return enumC31071a;
            } catch (Throwable th4) {
                r10 = interfaceC2994c0;
                th = th4;
                enumC2341g = EnumC2341g.DEBUG;
                strM5370G = AbstractC1772c1.m5370G(r10);
                C2343i c2343i6 = C2343i.f9269a;
                if (C2343i.f9272d.isLoggable(enumC2341g, strM5370G)) {
                    InterfaceC2344j interfaceC2344j2 = C2343i.f9271c;
                    message = th.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    interfaceC2344j2.log(enumC2341g, strM5370G, message, null);
                }
            }
            interfaceC2994c0 = interfaceC2994c1;
            if (((C33413k3) this.f104494z).f139513p) {
                C33366b4 c33366b6 = (C33366b4) this.f104490E;
                this.f104493y = interfaceC2994c0;
                this.f104492x = 2;
                c3022j0M8711e = AbstractC3006f0.m8711e(c33366b6.f139260x, null, new C2698i(c33366b6, null), 3);
                if (c3022j0M8711e != enumC31071a) {
                    r15 = interfaceC2994c0;
                    obj = c3022j0M8711e;
                    this.f104493y = r15;
                    this.f104492x = 3;
                    obj = ((InterfaceC3018i0) obj).await(this);
                    if (obj != enumC31071a) {
                        r14 = r15;
                        abstractC26205h = (AbstractC26205h) obj;
                        if (abstractC26205h instanceof C26204g) {
                            ((Number) ((C26204g) abstractC26205h).f103919a).longValue();
                            enumC2341g3 = EnumC2341g.DEBUG;
                            strM5370G3 = AbstractC1772c1.m5370G(r14);
                            C2343i c2343i7 = C2343i.f9269a;
                            if (C2343i.f9272d.isLoggable(enumC2341g3, strM5370G3)) {
                                C2343i.f9271c.log(enumC2341g3, strM5370G3, "Connection succeeded! (duration: " + abstractC26205h.m77816b() + ")", null);
                            }
                        } else if (!(abstractC26205h instanceof C26203f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (!(abstractC26205h instanceof C26204g)) {
                            if (!(abstractC26205h instanceof C26203f)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            abstractC26202e = ((C26203f) abstractC26205h).f103918a;
                            enumC2341g2 = EnumC2341g.DEBUG;
                            strM5370G2 = AbstractC1772c1.m5370G(r14);
                            C2343i c2343i8 = C2343i.f9269a;
                            if (C2343i.f9272d.isLoggable(enumC2341g2, strM5370G2)) {
                                C2343i.f9271c.log(enumC2341g2, strM5370G2, abstractC26202e.mo77807a(), null);
                            }
                        }
                    }
                }
                return enumC31071a;
            }
        } catch (Throwable th5) {
            th = th5;
            r10 = r15;
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [c93.m, s83.i] */
    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        int i13 = this.f104491w;
        Object obj2 = this.f104490E;
        Object obj3 = this.f104494z;
        switch (i13) {
            case 0:
                return new C26285a((C15990r) this.f104493y, (C21318b) obj3, (C0271z0) obj2, interfaceC30057d, 0);
            case 1:
                C26285a c26285a = new C26285a((C26318e) obj3, (InterfaceC13062m) obj2, interfaceC30057d, 1);
                c26285a.f104493y = obj;
                return c26285a;
            case 2:
                C26285a c26285a2 = new C26285a((C27478h) obj3, (InterfaceC27471a) obj2, interfaceC30057d, 2);
                c26285a2.f104493y = obj;
                return c26285a2;
            case 3:
                return new C26285a((C27481k) this.f104493y, (AbstractC26205h) obj3, (InterfaceC27471a) obj2, interfaceC30057d, 3);
            case 4:
                return new C26285a((C27487q) this.f104493y, (AbstractC26205h) obj3, (InterfaceC27471a) obj2, interfaceC30057d, 4);
            case 5:
                return new C26285a((C27481k) this.f104493y, (AbstractC26205h) obj3, (InterfaceC27471a) obj2, interfaceC30057d, 5);
            case 6:
                return new C26285a((C28550t) this.f104493y, (InterfaceC11337c0) obj3, (C23226c) obj2, interfaceC30057d, 6);
            case 7:
                C26285a c26285a3 = new C26285a((InterfaceC28601c1) obj3, (Function1) obj2, interfaceC30057d, 7);
                c26285a3.f104493y = obj;
                return c26285a3;
            case 8:
                return new C26285a((C23250e) obj3, (C25046w) obj2, interfaceC30057d, 8);
            case 9:
                return new C26285a((AbstractC28880g0) this.f104493y, (Context) obj3, (InterfaceC26395l) obj2, interfaceC30057d, 9);
            case 10:
                return new C26285a((C17171d) this.f104493y, (BroadcastReceiver.PendingResult) obj3, (InterfaceC4351m) obj2, interfaceC30057d);
            case 11:
                C26285a c26285a4 = new C26285a((C29932t0) obj3, (C30897b) obj2, interfaceC30057d, 11);
                c26285a4.f104493y = obj;
                return c26285a4;
            case 12:
                C26285a c26285a5 = new C26285a((C29936v0) obj3, (String) obj2, interfaceC30057d, 12);
                c26285a5.f104493y = obj;
                return c26285a5;
            case 13:
                C26285a c26285a6 = new C26285a((InterfaceC13037f2) obj3, (AssertionError) obj2, interfaceC30057d, 13);
                c26285a6.f104493y = obj;
                return c26285a6;
            case 14:
                return new C26285a((String) this.f104493y, (InterfaceC28601c1) obj3, (InterfaceC28601c1) obj2, interfaceC30057d, 14);
            case 15:
                return new C26285a((C30838f) this.f104493y, (NodeCoordinator) obj3, (C0271z0) obj2, interfaceC30057d, 15);
            case 16:
                return new C26285a((InterfaceC26618i) obj3, (C31353x) obj2, interfaceC30057d, 16);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C26285a c26285a7 = new C26285a((C14503i) obj3, (C31431t) obj2, interfaceC30057d, 17);
                c26285a7.f104493y = obj;
                return c26285a7;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                InterfaceC1585g0 interfaceC1585g0 = (InterfaceC1585g0) this.f104493y;
                EnumC1635w enumC1635w = EnumC1635w.f6325w;
                return new C26285a(interfaceC1585g0, (InterfaceC13058l) obj3, interfaceC30057d, (CardMultilineWidget) obj2);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                InterfaceC1585g0 interfaceC1585g1 = (InterfaceC1585g0) this.f104493y;
                EnumC1635w enumC1635w2 = EnumC1635w.f6325w;
                return new C26285a(interfaceC1585g1, (InterfaceC13058l) obj3, interfaceC30057d, (CardNumberEditText) obj2);
            case 20:
                return new C26285a((C33161z) this.f104493y, (C38809d5) obj3, (C32132a) obj2, interfaceC30057d, 20);
            case 21:
                C26285a c26285a8 = new C26285a((GooglePayPaymentMethodLauncherActivity) obj3, (AbstractC21065d) obj2, interfaceC30057d, 21);
                c26285a8.f104493y = obj;
                return c26285a8;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C26285a((GooglePayPaymentMethodLauncherActivity) obj3, (C12268l) obj2, interfaceC30057d, 22);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new C26285a((C33450s0) this.f104493y, (InterfaceC11936u) obj3, (C33376d2) obj2, interfaceC30057d, 23);
            case 24:
                C26285a c26285a9 = new C26285a((C33413k3) obj3, (C33366b4) obj2, interfaceC30057d, 24);
                c26285a9.f104493y = obj;
                return c26285a9;
            case 25:
                return new C26285a((C33505g) obj3, (AbstractC29907h) obj2, interfaceC30057d, 25);
            case 26:
                return new C26285a((C35357s0) this.f104493y, (C32132a) obj3, (Throwable) obj2, this.f104492x, interfaceC30057d);
            case 27:
                C26285a c26285a10 = new C26285a((BacsMandateConfirmationActivity) obj3, (C16845k) obj2, interfaceC30057d, 27);
                c26285a10.f104493y = obj;
                return c26285a10;
            case 28:
                C26285a c26285a11 = new C26285a((CvcRecollectionActivity) obj3, (C16845k) obj2, interfaceC30057d, 28);
                c26285a11.f104493y = obj;
                return c26285a11;
            default:
                return new C26285a((C37770y) this.f104493y, (C16845k) obj3, (LinkActivity) obj2, interfaceC30057d, 29);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f104491w) {
            case 0:
                ((C26285a) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 1:
                ((C26285a) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 2:
                return ((C26285a) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 3:
                return ((C26285a) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 4:
                return ((C26285a) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 5:
                return ((C26285a) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 6:
                return ((C26285a) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 7:
                return ((C26285a) create((InterfaceC34476v) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 8:
                return ((C26285a) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 9:
                return ((C26285a) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 10:
                return ((C26285a) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 11:
                return ((C26285a) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 12:
                return ((C26285a) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 13:
                return ((C26285a) create((InterfaceC28661r1) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 14:
                return ((C26285a) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 15:
                return ((C26285a) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 16:
                return ((C26285a) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ((C26285a) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ((C26285a) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ((C26285a) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 20:
                return ((C26285a) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 21:
                return ((C26285a) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ((C26285a) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ((C26285a) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 24:
                return ((C26285a) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 25:
                return ((C26285a) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 26:
                C26285a c26285a = (C26285a) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c26285a.invokeSuspend(c23454a0);
                return c23454a0;
            case 27:
                return ((C26285a) create((InterfaceC35571k) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 28:
                return ((C26285a) create((InterfaceC36725o) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                ((C26285a) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
        }
    }

    /* JADX WARN: Code duplicated, block: B:209:0x0466  */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x04da, code lost:
    
        if (r13.collect(r2, r30) == r0) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x099e, code lost:
    
        if (((ec3.InterfaceC13037f2) r1).collect((ec3.InterfaceC13062m) r11, r30) == r0) goto L508;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11, types: [c93.m, s83.i] */
    /* JADX WARN: Type inference failed for: r1v148 */
    /* JADX WARN: Type inference failed for: r1v149 */
    /* JADX WARN: Type inference failed for: r1v25, types: [c93.m, s83.i] */
    /* JADX WARN: Type inference failed for: r1v84, types: [int] */
    /* JADX WARN: Type inference failed for: r1v85 */
    /* JADX WARN: Type inference failed for: r1v89, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v52, types: [java.lang.Object, q83.j, q83.k] */
    /* JADX WARN: Type inference failed for: r2v58, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [c93.m, s83.i] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Boolean, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // s83.AbstractC32267a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n43.C26285a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26285a(InterfaceC1585g0 interfaceC1585g0, InterfaceC13058l interfaceC13058l, InterfaceC30057d interfaceC30057d, CardNumberEditText cardNumberEditText) {
        super(2, interfaceC30057d);
        this.f104491w = 19;
        EnumC1635w enumC1635w = EnumC1635w.f6325w;
        this.f104494z = interfaceC13058l;
        this.f104490E = cardNumberEditText;
        this.f104493y = interfaceC1585g0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C26285a(C17171d c17171d, BroadcastReceiver.PendingResult pendingResult, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f104491w = 10;
        this.f104493y = c17171d;
        this.f104494z = pendingResult;
        this.f104490E = (AbstractC32275i) interfaceC4351m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26285a(Object obj, Object obj2, Object obj3, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f104491w = i13;
        this.f104493y = obj;
        this.f104494z = obj2;
        this.f104490E = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26285a(Object obj, Object obj2, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f104491w = i13;
        this.f104494z = obj;
        this.f104490E = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26285a(C35357s0 c35357s0, C32132a c32132a, Throwable th3, int i13, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f104491w = 26;
        this.f104493y = c35357s0;
        this.f104494z = c32132a;
        this.f104490E = th3;
        this.f104492x = i13;
    }
}
