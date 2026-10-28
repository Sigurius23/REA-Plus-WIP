package a00;

import ad3.AbstractC0757c;
import ad3.C0755b;
import android.content.Context;
import androidx.compose.material3.internal.AbstractC1124a;
import androidx.glance.session.SessionWorker;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3028k2;
import c43.EnumC4206v;
import c93.InterfaceC4352n;
import com.squareup.wire.AbstractC5583n;
import d00.C11433l;
import d33.C11602h1;
import g20.C15270p;
import gf.InterfaceC15761b;
import io.getstream.android.video.generated.apis.ProductvideoApi;
import io.getstream.android.video.generated.models.QueryCallsRequest;
import io.getstream.video.android.core.model.IceCandidate;
import l83.C23454a0;
import n23.AbstractC26205h;
import p003a1.C0109h;
import p007a6.C0416e;
import p048ce.C4470k;
import p132f0.EnumC13840z0;
import p163g1.C14947a0;
import p163g1.C15145t;
import p218ic.AbstractC18386u;
import p279kd.C22379f;
import p292l1.C23203x4;
import p316m1.C24894c;
import p316m1.C24902g;
import p390p1.InterfaceC28601c1;
import p395p6.C28894l;
import p401pj.C29257a;
import p401pj.C29259b;
import p401pj.InterfaceC29260b0;
import p479s4.AbstractC32126g;
import p505ts.AbstractC34132o;
import p522uf.AbstractC34870c0;
import p550vd.AbstractC35903f;
import p579wc.C37105m0;
import p599wz.AbstractC37748q0;
import p599wz.AbstractC37760u0;
import p599wz.C37754s0;
import p599wz.C37757t0;
import p605x6.C38015t;
import p605x6.InterfaceC38016u;
import p611xd.AbstractC38196a;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import stream.video.sfu.models.ICETrickle;
import stream.video.sfu.models.PeerType;
import t23.C33366b4;
import vg.InterfaceC35967n;
import wr1.C37572f;
import x43.AbstractC37978j;
import y00.AbstractC38794c0;

/* JADX INFO: renamed from: a00.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C0071f extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f214E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f215w;

    /* JADX INFO: renamed from: x */
    public int f216x;

    /* JADX INFO: renamed from: y */
    public Object f217y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f218z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0071f(Object obj, Object obj2, Object obj3, InterfaceC30057d interfaceC30057d, int i13) {
        super(1, interfaceC30057d);
        this.f215w = i13;
        this.f217y = obj;
        this.f218z = obj2;
        this.f214E = obj3;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        switch (this.f215w) {
            case 0:
                return new C0071f((AbstractC37760u0) this.f217y, (C0072g) this.f218z, (C11433l) this.f214E, interfaceC30057d, 0);
            case 1:
                return new C0071f((C11602h1) this.f217y, (EnumC4206v) this.f218z, (IceCandidate) this.f214E, interfaceC30057d, 1);
            case 2:
                return new C0071f((C14947a0) this.f217y, this.f218z, (InterfaceC4352n) this.f214E, interfaceC30057d, 2);
            case 3:
                return new C0071f((C23203x4) this.f217y, (C0416e) this.f218z, (EnumC13840z0) this.f214E, interfaceC30057d, 3);
            case 4:
                return new C0071f((C24902g) this.f217y, this.f218z, (InterfaceC4352n) this.f214E, interfaceC30057d, 4);
            case 5:
                return new C0071f((InterfaceC29260b0) this.f217y, (String) this.f218z, (InterfaceC28601c1) this.f214E, interfaceC30057d, 5);
            case 6:
                return new C0071f((C33366b4) this.f218z, (QueryCallsRequest) this.f214E, interfaceC30057d);
            case 7:
                return new C0071f((C37105m0) this.f217y, (C4470k) this.f218z, (InterfaceC15761b) this.f214E, interfaceC30057d, 7);
            default:
                return new C0071f((InterfaceC38016u) this.f217y, (SessionWorker) this.f218z, (C28894l) this.f214E, interfaceC30057d, 8);
        }
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj;
        switch (this.f215w) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return ((C0071f) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object objM193j;
        Object objM193j2;
        Object objM31019e;
        ProductvideoApi productvideoApiM124884a;
        Object objM105794l;
        Object objM113992J;
        switch (this.f215w) {
            case 0:
                C0072g c0072g = (C0072g) ((C0072g) this.f218z).f223x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f216x;
                if (i13 != 0) {
                    if (i13 == 1) {
                        AbstractC34132o.m107864I(obj);
                        objM193j2 = obj;
                        return (InterfaceC0080o) objM193j2;
                    }
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    objM193j = obj;
                    return (InterfaceC0080o) objM193j;
                }
                AbstractC34132o.m107864I(obj);
                AbstractC37760u0 abstractC37760u0 = (AbstractC37760u0) this.f217y;
                if (abstractC37760u0 instanceof C37754s0) {
                    C37754s0 c37754s0 = (C37754s0) abstractC37760u0;
                    AbstractC38794c0 abstractC38794c0 = c37754s0.f161721x;
                    C11433l c11433l = (C11433l) this.f214E;
                    String str = c37754s0.f161722y;
                    String str2 = c37754s0.f161723z;
                    this.f216x = 1;
                    objM193j2 = c0072g.m193j(new C0073h(c0072g, abstractC38794c0, c11433l, str, str2, 1), this);
                    if (objM193j2 == enumC31071a) {
                        return enumC31071a;
                    }
                    return (InterfaceC0080o) objM193j2;
                }
                if (!(abstractC37760u0 instanceof C37757t0)) {
                    throw new NoWhenBranchMatchedException();
                }
                C37757t0 c37757t0 = (C37757t0) abstractC37760u0;
                AbstractC37748q0 abstractC37748q0 = c37757t0.f161730x;
                C11433l c11433l2 = (C11433l) this.f214E;
                String str3 = c37757t0.f161731y;
                String str4 = c37757t0.f161732z;
                this.f216x = 2;
                objM193j = c0072g.m193j(new C0073h(c0072g, abstractC37748q0, c11433l2, str3, str4, 0), this);
                if (objM193j == enumC31071a) {
                    return enumC31071a;
                }
                return (InterfaceC0080o) objM193j;
            case 1:
                IceCandidate iceCandidate = (IceCandidate) this.f214E;
                EnumC4206v enumC4206v = (EnumC4206v) this.f218z;
                C11602h1 c11602h1 = (C11602h1) this.f217y;
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f216x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C2345k c2345kM31043s = c11602h1.m31043s();
                    InterfaceC2339e interfaceC2339e = c2345kM31043s.f9275c;
                    String str5 = c2345kM31043s.f9273a;
                    EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                    if (interfaceC2339e.isLoggable(enumC2341g, str5)) {
                        c2345kM31043s.f9274b.log(enumC2341g, str5, "[sendIceCandidate] #sfu; #" + AbstractC37978j.m121636U(enumC4206v) + "; candidate: " + iceCandidate, null);
                    }
                    PeerType peerTypeM110010n0 = AbstractC34870c0.m110010n0(enumC4206v);
                    C0755b c0755b = AbstractC0757c.f2762d;
                    c0755b.getClass();
                    ICETrickle iCETrickle = new ICETrickle(peerTypeM110010n0, c0755b.m1833d(IceCandidate.Companion.serializer(), iceCandidate), c11602h1.f37441c, null, 8, null);
                    C2345k c2345kM31043s2 = c11602h1.m31043s();
                    InterfaceC2339e interfaceC2339e2 = c2345kM31043s2.f9275c;
                    String str6 = c2345kM31043s2.f9273a;
                    EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
                    if (interfaceC2339e2.isLoggable(enumC2341g2, str6)) {
                        c2345kM31043s2.f9274b.log(enumC2341g2, str6, "[sendIceCandidate] #sfu; #" + AbstractC37978j.m121636U(enumC4206v) + "; iceTrickle: " + iCETrickle, null);
                    }
                    this.f216x = 1;
                    objM31019e = C11602h1.m31019e(c11602h1, iCETrickle, this);
                    if (objM31019e == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    objM31019e = obj;
                }
                AbstractC26205h abstractC26205h = (AbstractC26205h) objM31019e;
                C2345k c2345kM31043s3 = c11602h1.m31043s();
                InterfaceC2339e interfaceC2339e3 = c2345kM31043s3.f9275c;
                String str7 = c2345kM31043s3.f9273a;
                EnumC2341g enumC2341g3 = EnumC2341g.VERBOSE;
                if (interfaceC2339e3.isLoggable(enumC2341g3, str7)) {
                    c2345kM31043s3.f9274b.log(enumC2341g3, str7, "[sendIceCandidate] #sfu; #" + AbstractC37978j.m121636U(enumC4206v) + "; completed: " + abstractC26205h, null);
                }
                return C23454a0.f92919a;
            case 2:
                C14947a0 c14947a0 = (C14947a0) this.f217y;
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i15 = this.f216x;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    c14947a0.f55776m.setValue(this.f218z);
                    C15145t c15145t = new C15145t(c14947a0, 4);
                    C0109h c0109h = new C0109h((InterfaceC4352n) this.f214E, c14947a0, (InterfaceC30057d) null, 27);
                    this.f216x = 1;
                    if (AbstractC5583n.m16784j(c15145t, c0109h, this) == enumC31071a3) {
                        return enumC31071a3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            case 3:
                EnumC13840z0 enumC13840z0 = (EnumC13840z0) this.f214E;
                C0416e c0416e = (C0416e) this.f218z;
                C23203x4 c23203x4 = (C23203x4) this.f217y;
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                int i16 = this.f216x;
                try {
                    if (i16 == 0) {
                        AbstractC34132o.m107864I(obj);
                        C22379f c22379f = new C22379f(c0416e, (InterfaceC30057d) null, 5);
                        this.f216x = 2;
                        if (AbstractC3028k2.m8748b(1500L, c22379f, this) == enumC31071a4) {
                            return enumC31071a4;
                        }
                    } else {
                        if (i16 != 1 && i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                    if (enumC13840z0 != EnumC13840z0.f49376y) {
                        c23203x4.m67159a();
                    }
                    return C23454a0.f92919a;
                } catch (Throwable th3) {
                    if (enumC13840z0 != EnumC13840z0.f49376y) {
                        c23203x4.m67159a();
                    }
                    throw th3;
                }
            case 4:
                C24902g c24902g = (C24902g) this.f217y;
                EnumC31071a enumC31071a5 = EnumC31071a.f128113w;
                int i17 = this.f216x;
                if (i17 == 0) {
                    AbstractC34132o.m107864I(obj);
                    c24902g.m73012h(this.f218z);
                    C24894c c24894c = new C24894c(c24902g, 4);
                    C15270p c15270p = new C15270p((InterfaceC4352n) this.f214E, c24902g, (InterfaceC30057d) null, 25);
                    this.f216x = 1;
                    if (AbstractC1124a.m3467a(c24894c, c15270p, this) == enumC31071a5) {
                        return enumC31071a5;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            case 5:
                EnumC31071a enumC31071a6 = EnumC31071a.f128113w;
                int i18 = this.f216x;
                if (i18 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC29260b0 interfaceC29260b0 = (InterfaceC29260b0) this.f217y;
                    String str8 = (String) this.f218z;
                    C29257a c29257a = new C29257a(0, (InterfaceC28601c1) this.f214E);
                    C29259b c29259b = new C29259b(1, null);
                    this.f216x = 1;
                    if (interfaceC29260b0.mo88900a(str8, c29257a, c29259b, this) == enumC31071a6) {
                        return enumC31071a6;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            case 6:
                C33366b4 c33366b4 = (C33366b4) this.f218z;
                EnumC31071a enumC31071a7 = EnumC31071a.f128113w;
                int i19 = this.f216x;
                if (i19 == 0) {
                    AbstractC34132o.m107864I(obj);
                    productvideoApiM124884a = c33366b4.f139232E.m124884a();
                    this.f217y = productvideoApiM124884a;
                    this.f216x = 1;
                    objM105794l = C33366b4.m105794l(c33366b4, this);
                    if (objM105794l != enumC31071a7) {
                    }
                    return enumC31071a7;
                }
                if (i19 != 1) {
                    if (i19 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                ProductvideoApi productvideoApi = (ProductvideoApi) this.f217y;
                AbstractC34132o.m107864I(obj);
                productvideoApiM124884a = productvideoApi;
                objM105794l = obj;
                QueryCallsRequest queryCallsRequest = (QueryCallsRequest) this.f214E;
                this.f217y = null;
                this.f216x = 2;
                Object objQueryCalls = productvideoApiM124884a.queryCalls((String) objM105794l, queryCallsRequest, this);
                if (objQueryCalls != enumC31071a7) {
                    return objQueryCalls;
                }
                return enumC31071a7;
            case 7:
                C37105m0 c37105m0 = (C37105m0) this.f217y;
                EnumC31071a enumC31071a8 = EnumC31071a.f128113w;
                int i24 = this.f216x;
                if (i24 == 0) {
                    AbstractC34132o.m107864I(obj);
                    String strM13963a = c37105m0.f158731w;
                    if (strM13963a == null) {
                        C4470k c4470k = (C4470k) this.f218z;
                        strM13963a = c4470k != null ? c4470k.m13963a("region", null) : null;
                        if (strM13963a == null && (strM13963a = (String) ((InterfaceC15761b) this.f214E).mo33082b(AbstractC38196a.f163562a)) == null) {
                            InterfaceC35967n interfaceC35967n = c37105m0.f158732x;
                            this.f216x = 1;
                            objM113992J = AbstractC35903f.m113992J(interfaceC35967n, null, this, 2);
                            if (objM113992J == enumC31071a8) {
                                return enumC31071a8;
                            }
                        }
                    }
                    return strM13963a;
                }
                if (i24 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objM113992J = obj;
                return (String) objM113992J;
            default:
                SessionWorker sessionWorker = (SessionWorker) this.f218z;
                EnumC31071a enumC31071a9 = EnumC31071a.f128113w;
                int i25 = this.f216x;
                if (i25 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC38016u interfaceC38016u = (InterfaceC38016u) this.f217y;
                    Context applicationContext = sessionWorker.getApplicationContext();
                    C28894l c28894l = (C28894l) this.f214E;
                    C38015t c38015t = sessionWorker.f6002y;
                    C37572f c37572f = new C37572f(sessionWorker);
                    this.f216x = 1;
                    if (AbstractC32126g.m100038c(interfaceC38016u, applicationContext, c28894l, c38015t, c37572f, this) == enumC31071a9) {
                        return enumC31071a9;
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return AbstractC18386u.m52885b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0071f(C33366b4 c33366b4, QueryCallsRequest queryCallsRequest, InterfaceC30057d interfaceC30057d) {
        super(1, interfaceC30057d);
        this.f215w = 6;
        this.f218z = c33366b4;
        this.f214E = queryCallsRequest;
    }
}
