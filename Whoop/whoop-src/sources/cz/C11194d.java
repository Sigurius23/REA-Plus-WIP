package cz;

import a30.C0330v0;
import android.app.Activity;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.C1643y1;
import androidx.lifecycle.EnumC1635w;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import com.stripe.android.customersheet.CustomerSheetActivity;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity;
import com.whoop.profile.view.edit.C9790n;
import e00.C12500w;
import ec3.InterfaceC13058l;
import fi.C14503i;
import gi.C15878i;
import h40.C16845k;
import io.getstream.android.video.generated.models.ClosedCaptionEvent;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import l83.C23454a0;
import n40.AbstractC26266f;
import p027b3.C2462x0;
import p077d0.C11350f1;
import p077d0.C11421z1;
import p078d1.C11449b;
import p078d1.C11457j;
import p078d1.C11458k;
import p114eb.C12991u0;
import p133f1.C13977s1;
import p180h0.C16360a3;
import p180h0.C16379d4;
import p180h0.C16398h2;
import p180h0.C16470w;
import p180h0.InterfaceC16450s;
import p203hy.C17714c;
import p236j.AbstractC21065d;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28661r1;
import p412q3.C29878l;
import p412q3.C29891y;
import p412q3.C29892z;
import p412q3.InterfaceC29884r;
import p445r0.InterfaceC30833a;
import p461rh.C31417f;
import p461rh.C31431t;
import p461rh.InterfaceC31421j;
import p510u0.C34346p1;
import p510u0.C34354s0;
import p512u2.InterfaceC34476v;
import p537ux.C35331f0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s33.C32118c;
import s83.AbstractC32275i;
import y00.C38901n;
import y00.C38966u1;

/* JADX INFO: renamed from: cz.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C11194d extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public Object f35898E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f35899F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f35900G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f35901w;

    /* JADX INFO: renamed from: x */
    public int f35902x;

    /* JADX INFO: renamed from: y */
    public Object f35903y;

    /* JADX INFO: renamed from: z */
    public Object f35904z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11194d(C11350f1 c11350f1, Object obj, C11421z1 c11421z1, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f35901w = 1;
        this.f35898E = c11350f1;
        this.f35899F = obj;
        this.f35900G = c11421z1;
    }

    /* JADX WARN: Type inference failed for: r4v11, types: [kotlin.jvm.functions.Function3, s83.i] */
    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f35901w) {
            case 0:
                return new C11194d((InterfaceC28601c1) this.f35899F, (C16845k) this.f35900G, (CustomerSheetActivity) this.f35904z, interfaceC30057d);
            case 1:
                return new C11194d((C11350f1) this.f35898E, this.f35899F, (C11421z1) this.f35900G, interfaceC30057d);
            case 2:
                C11194d c11194d = new C11194d((C2462x0) this.f35904z, (Function1) this.f35898E, (C11449b) this.f35899F, (C11458k) this.f35900G, interfaceC30057d, 2);
                c11194d.f35903y = obj;
                return c11194d;
            case 3:
                return new C11194d((Stripe3ds2TransactionActivity) this.f35903y, (AbstractC21065d) this.f35904z, (C9790n) this.f35898E, (AbstractC21065d) this.f35899F, (C1643y1) this.f35900G, interfaceC30057d, 3);
            case 4:
                return new C11194d((C12500w) this.f35903y, (String) this.f35904z, (String) this.f35898E, (String) this.f35899F, (C38901n) this.f35900G, interfaceC30057d, 4);
            case 5:
                C11194d c11194d2 = new C11194d((C12500w) this.f35904z, (String) this.f35898E, (String) this.f35899F, (List) this.f35900G, interfaceC30057d, 5);
                c11194d2.f35903y = obj;
                return c11194d2;
            case 6:
                return new C11194d((List) this.f35899F, (InterfaceC28661r1) this.f35900G, interfaceC30057d, 6);
            case 7:
                C11194d c11194d3 = new C11194d((C16379d4) this.f35904z, (C16470w) this.f35898E, (InterfaceC16450s) this.f35899F, (InterfaceC3027k1) this.f35900G, interfaceC30057d, 7);
                c11194d3.f35903y = obj;
                return c11194d3;
            case 8:
                C11194d c11194d4 = new C11194d((InterfaceC34476v) this.f35904z, (AbstractC32275i) this.f35898E, (Function1) this.f35899F, (C16398h2) this.f35900G, interfaceC30057d);
                c11194d4.f35903y = obj;
                return c11194d4;
            case 9:
                C11194d c11194d5 = new C11194d((C17714c) this.f35904z, (C38966u1) this.f35898E, (C0330v0) this.f35899F, (List) this.f35900G, interfaceC30057d, 9);
                c11194d5.f35903y = obj;
                return c11194d5;
            case 10:
                C11194d c11194d6 = new C11194d((AbstractC1638x) this.f35904z, (EnumC1635w) this.f35898E, (InterfaceC30063j) this.f35899F, (InterfaceC13058l) this.f35900G, interfaceC30057d, 10);
                c11194d6.f35903y = obj;
                return c11194d6;
            case 11:
                C11194d c11194d7 = new C11194d((Activity) this.f35904z, (C11457j) this.f35898E, (C12991u0) this.f35899F, (Function1) this.f35900G, interfaceC30057d, 11);
                c11194d7.f35903y = obj;
                return c11194d7;
            case 12:
                return new C11194d((C14503i) this.f35903y, (C31431t) this.f35904z, (C15878i) this.f35898E, (C31417f) this.f35899F, (InterfaceC31421j) this.f35900G, interfaceC30057d, 12);
            case 13:
                return new C11194d((C32118c) this.f35899F, (ClosedCaptionEvent) this.f35900G, interfaceC30057d, 13);
            case 14:
                return new C11194d((C34354s0) this.f35903y, (InterfaceC28601c1) this.f35899F, (C29892z) this.f35904z, (C13977s1) this.f35898E, (C29878l) this.f35900G, interfaceC30057d);
            case 15:
                return new C11194d((InterfaceC30833a) this.f35903y, (C29891y) this.f35904z, (C34354s0) this.f35898E, (C34346p1) this.f35899F, (InterfaceC29884r) this.f35900G, interfaceC30057d, 15);
            default:
                C11194d c11194d8 = new C11194d((InterfaceC4351m) this.f35904z, (C35331f0) this.f35898E, (InterfaceC2994c0) this.f35899F, (AtomicReference) this.f35900G, interfaceC30057d, 16);
                c11194d8.f35903y = obj;
                return c11194d8;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f35901w) {
            case 0:
                return ((C11194d) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 1:
                return ((C11194d) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 2:
                ((C11194d) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 3:
                return ((C11194d) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 4:
                return ((C11194d) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 5:
                return ((C11194d) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 6:
                ((C11194d) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 7:
                return ((C11194d) create((C16360a3) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 8:
                return ((C11194d) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 9:
                return ((C11194d) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 10:
                return ((C11194d) create((InterfaceC28661r1) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 11:
                return ((C11194d) create((AbstractC26266f) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 12:
                return ((C11194d) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 13:
                return ((C11194d) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 14:
                return ((C11194d) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 15:
                return ((C11194d) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C11194d) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:196:0x0419 A[LOOP:0: B:197:0x0427->B:196:0x0419, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:201:0x0444 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:338:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:344:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:346:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:348:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:353:0x0700  */
    /* JADX WARN: Code duplicated, block: B:383:0x0797 A[PHI: r16
      0x0797: PHI (r16v5 float) = (r16v1 float), (r16v6 float) binds: [B:381:0x0794, B:316:0x064a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:386:0x07a4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v1, types: [kotlin.jvm.functions.Function3, s83.i] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:200:0x0442 -> B:202:0x0445). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:189:0x03f7
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 2080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cz.C11194d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11194d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f35901w = i13;
        this.f35903y = obj;
        this.f35904z = obj2;
        this.f35898E = obj3;
        this.f35899F = obj4;
        this.f35900G = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11194d(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f35901w = i13;
        this.f35904z = obj;
        this.f35898E = obj2;
        this.f35899F = obj3;
        this.f35900G = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11194d(Object obj, Object obj2, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f35901w = i13;
        this.f35899F = obj;
        this.f35900G = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11194d(InterfaceC28601c1 interfaceC28601c1, C16845k c16845k, CustomerSheetActivity customerSheetActivity, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f35901w = 0;
        this.f35899F = interfaceC28601c1;
        this.f35900G = c16845k;
        this.f35904z = customerSheetActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11194d(C34354s0 c34354s0, InterfaceC28601c1 interfaceC28601c1, C29892z c29892z, C13977s1 c13977s1, C29878l c29878l, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f35901w = 14;
        this.f35903y = c34354s0;
        this.f35899F = interfaceC28601c1;
        this.f35904z = c29892z;
        this.f35898E = c13977s1;
        this.f35900G = c29878l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C11194d(InterfaceC34476v interfaceC34476v, Function3 function3, Function1 function1, C16398h2 c16398h2, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f35901w = 8;
        this.f35904z = interfaceC34476v;
        this.f35898E = (AbstractC32275i) function3;
        this.f35899F = function1;
        this.f35900G = c16398h2;
    }
}
