package p395p6;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import l83.C23454a0;
import nr0.C27072e;
import o73.C27648a;
import p33.C28820m;
import p335n6.AbstractC26391h;
import p390p1.AbstractC28683x;
import p390p1.C28596b0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p602x1.AbstractC37817c;
import p636y3.C39176h;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: p6.c */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C28867c implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f116834w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C28894l f116835x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Context f116836y;

    public /* synthetic */ C28867c(Context context, C28894l c28894l) {
        this.f116836y = context;
        this.f116835x = c28894l;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    /* JADX WARN: Code duplicated, block: B:18:0x0060  */
    /* JADX WARN: Code duplicated, block: B:21:0x007f  */
    /* JADX WARN: Code duplicated, block: B:23:0x008b  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:29:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:36:0x010f  */
    /* JADX WARN: Code duplicated, block: B:45:0x013e  */
    /* JADX WARN: Code duplicated, block: B:47:0x015c  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Bundle bundle;
        C28655q c28655q;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC28601c1 interfaceC28601c1;
        Boolean bool;
        C28894l c28894l;
        Context context;
        boolean zM87157i;
        Object objM87133R2;
        C23454a0 c23454a0;
        boolean zM87157i2;
        Object objM87133R3;
        Object objM87133R4;
        InterfaceC4351m interfaceC4351m;
        switch (this.f116834w) {
            case 0:
                Composer composer = (Composer) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    C28655q c28655q2 = (C28655q) composer;
                    if (c28655q2.m87121F()) {
                        c28655q2.m87138X();
                    } else {
                        C28674u2 c28674u2 = AbstractC26391h.f104841b;
                        Context context2 = this.f116836y;
                        C28673u1 c28673u1Mo86977a = c28674u2.mo86977a(context2);
                        C28674u2 c28674u3 = AbstractC26391h.f104843d;
                        C28894l c28894l2 = this.f116835x;
                        C28673u1 c28673u1Mo86977a2 = c28674u3.mo86977a(c28894l2.f116956f);
                        C28596b0 c28596b0 = AbstractC28909q.f117004a;
                        bundle = (Bundle) c28894l2.f116961k.getValue();
                        if (bundle == null) {
                            bundle = Bundle.EMPTY;
                        }
                        AbstractC28683x.m87248b(new C28673u1[]{c28673u1Mo86977a, c28673u1Mo86977a2, c28596b0.mo86977a(bundle), AbstractC26391h.f104842c.mo86977a(c28894l2.f116960j.getValue())}, AbstractC37817c.m121344e(-1811403166, composer, new C28867c(c28894l2, context2)), composer, 56);
                    }
                } else {
                    C28674u2 c28674u4 = AbstractC26391h.f104841b;
                    Context context3 = this.f116836y;
                    C28673u1 c28673u1Mo86977a3 = c28674u4.mo86977a(context3);
                    C28674u2 c28674u5 = AbstractC26391h.f104843d;
                    C28894l c28894l3 = this.f116835x;
                    C28673u1 c28673u1Mo86977a4 = c28674u5.mo86977a(c28894l3.f116956f);
                    C28596b0 c28596b1 = AbstractC28909q.f117004a;
                    bundle = (Bundle) c28894l3.f116961k.getValue();
                    if (bundle == null) {
                        bundle = Bundle.EMPTY;
                    }
                    AbstractC28683x.m87248b(new C28673u1[]{c28673u1Mo86977a3, c28673u1Mo86977a4, c28596b1.mo86977a(bundle), AbstractC26391h.f104842c.mo86977a(c28894l3.f116960j.getValue())}, AbstractC37817c.m121344e(-1811403166, composer, new C28867c(c28894l3, context3)), composer, 56);
                }
                return C23454a0.f92919a;
            default:
                Composer composer2 = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue() & 3;
                C23454a0 c23454a1 = C23454a0.f92919a;
                if (iIntValue == 2) {
                    C28655q c28655q3 = (C28655q) composer2;
                    if (c28655q3.m87121F()) {
                        c28655q3.m87138X();
                    } else {
                        c28655q = (C28655q) composer2;
                        objM87133R = c28655q.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(new C39176h(0L));
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        bool = Boolean.FALSE;
                        c28894l = this.f116835x;
                        boolean zM87157i3 = c28655q.m87157i(c28894l);
                        context = this.f116836y;
                        zM87157i = zM87157i3 | c28655q.m87157i(context);
                        objM87133R2 = c28655q.m87133R();
                        c23454a0 = null;
                        if (zM87157i || objM87133R2 == c28676v0) {
                            C28820m c28820m = new C28820m(c28894l, context, interfaceC28601c1, (InterfaceC30057d) null, 1);
                            c28655q.m87172p0(c28820m);
                            objM87133R2 = c28820m;
                        }
                        if (((Boolean) AbstractC28683x.m87233A(c28655q, (InterfaceC4351m) objM87133R2, bool).getValue()).booleanValue()) {
                            c28655q.m87150e0(-1541018146);
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                c23454a0 = null;
                                objM87133R4 = AbstractC13091v.m36602l(new C28820m(c28894l.f116955e, context, c28894l.f116956f, (InterfaceC30057d) null, 2));
                                c28655q.m87172p0(objM87133R4);
                            }
                            interfaceC4351m = (InterfaceC4351m) AbstractC28683x.m87260n((InterfaceC13058l) objM87133R4, null, null, c28655q, 48, 2).getValue();
                            if (interfaceC4351m == null) {
                                c28655q.m87150e0(-1540889931);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(-1540889930);
                                AbstractC5583n.m16767a(0, ((C39176h) interfaceC28601c1.getValue()).f168415a, c28655q, interfaceC4351m, c28894l.f116958h);
                                c28655q.m87173q(false);
                                c23454a0 = c23454a1;
                            }
                            if (c23454a0 == null) {
                                c28655q.m87150e0(-1296630672);
                                C27648a.m83580c(c28655q, 0);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(-1296636252);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-1540810446);
                            C27648a.m83580c(c28655q, 0);
                            c28655q.m87173q(false);
                        }
                        zM87157i2 = c28655q.m87157i(c28894l);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87157i2 || objM87133R3 == c28676v0) {
                            objM87133R3 = new C27072e(c28894l, 24);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC28683x.m87257k((InterfaceC4339a) objM87133R3, c28655q);
                    }
                } else {
                    c28655q = (C28655q) composer2;
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(new C39176h(0L));
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    bool = Boolean.FALSE;
                    c28894l = this.f116835x;
                    boolean zM87157i4 = c28655q.m87157i(c28894l);
                    context = this.f116836y;
                    zM87157i = zM87157i4 | c28655q.m87157i(context);
                    objM87133R2 = c28655q.m87133R();
                    c23454a0 = null;
                    if (zM87157i) {
                        C28820m c28820m2 = new C28820m(c28894l, context, interfaceC28601c1, (InterfaceC30057d) null, 1);
                        c28655q.m87172p0(c28820m2);
                        objM87133R2 = c28820m2;
                    } else {
                        C28820m c28820m3 = new C28820m(c28894l, context, interfaceC28601c1, (InterfaceC30057d) null, 1);
                        c28655q.m87172p0(c28820m3);
                        objM87133R2 = c28820m3;
                    }
                    if (((Boolean) AbstractC28683x.m87233A(c28655q, (InterfaceC4351m) objM87133R2, bool).getValue()).booleanValue()) {
                        c28655q.m87150e0(-1541018146);
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            c23454a0 = null;
                            objM87133R4 = AbstractC13091v.m36602l(new C28820m(c28894l.f116955e, context, c28894l.f116956f, (InterfaceC30057d) null, 2));
                            c28655q.m87172p0(objM87133R4);
                        }
                        interfaceC4351m = (InterfaceC4351m) AbstractC28683x.m87260n((InterfaceC13058l) objM87133R4, null, null, c28655q, 48, 2).getValue();
                        if (interfaceC4351m == null) {
                            c28655q.m87150e0(-1540889931);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-1540889930);
                            AbstractC5583n.m16767a(0, ((C39176h) interfaceC28601c1.getValue()).f168415a, c28655q, interfaceC4351m, c28894l.f116958h);
                            c28655q.m87173q(false);
                            c23454a0 = c23454a1;
                        }
                        if (c23454a0 == null) {
                            c28655q.m87150e0(-1296630672);
                            C27648a.m83580c(c28655q, 0);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-1296636252);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1540810446);
                        C27648a.m83580c(c28655q, 0);
                        c28655q.m87173q(false);
                    }
                    zM87157i2 = c28655q.m87157i(c28894l);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i2) {
                        objM87133R3 = new C27072e(c28894l, 24);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C27072e(c28894l, 24);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87257k((InterfaceC4339a) objM87133R3, c28655q);
                }
                return c23454a1;
        }
    }

    public /* synthetic */ C28867c(C28894l c28894l, Context context) {
        this.f116835x = c28894l;
        this.f116836y = context;
    }
}
