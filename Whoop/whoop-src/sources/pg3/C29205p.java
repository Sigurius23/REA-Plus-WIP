package pg3;

import al0.C0971f;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Parcel;
import androidx.fragment.app.RunnableC1283d;
import com.bumptech.glide.Registry$MissingComponentException;
import com.google.crypto.tink.internal.AbstractC5086e;
import com.stripe.android.core.model.CountryCode;
import com.whoop.android.R;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import gg.AbstractC15818e;
import gg.C15816c;
import gg.InterfaceC15820g;
import h20.C16671i1;
import h20.C16760x0;
import i20.C17928b;
import io.sentry.C20318e2;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25260n;
import np.AbstractC27007l;
import np.C27000e;
import np.C27004i;
import p031b9.AbstractC2875y;
import p073cq.C11040i;
import p073cq.C11048q;
import p093dl.C12154s;
import p095dp.AbstractC12240d;
import p108e4.AbstractC12682p;
import p167g5.C15483b;
import p229ip.BinderC20793d;
import p368og.EnumC27905b;
import p479s4.AbstractC32128i;
import p499t9.C33623c0;
import p503tp.C34030d;
import p529uo.AbstractC35135w;
import p550vd.AbstractC35903f;
import p586wk.EnumC37323a;
import p586wk.InterfaceC37327e;
import p586wk.InterfaceC37333k;
import p586wk.InterfaceC37334l;
import p599wz.AbstractC37760u0;
import p623xr.C38615k;
import p623xr.InterfaceC38616l;
import p684zk.C40775b0;
import p684zk.C40778d;
import p684zk.C40782g;
import p684zk.C40800y;
import p684zk.InterfaceC40801z;
import p684zk.RunnableC40784i;
import p696zy.C41210b;
import p696zy.InterfaceC41211c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29835t;
import q20.AbstractC29840y;
import q20.AbstractC29841z;
import q20.C29812d;
import q20.C29814e;
import q20.C29816f;
import q20.C29818g;
import q20.C29822i;
import q20.C29824j;
import q20.C29827l;
import q20.C29828m;
import q20.C29829n;
import q20.C29830o;
import q20.C29834s;
import q20.C29838w;
import q20.C29839x;
import q20.EnumC29836u;
import q83.AbstractC30060g;
import q83.InterfaceC30063j;
import re.C31261c1;
import ro.C31624i;
import se.AbstractC32411b;
import sr.C32894b;
import sr.C32900h;
import sr.C32904l;
import t20.C33321b;
import tb0.C33691b;
import tf.C33759d;
import to.InterfaceC33987n;
import ug.AbstractC34924m;
import wb3.AbstractC37056f;
import ws.C37577a;
import ws.C37582d;
import ws.C37583e;
import y00.AbstractC38794c0;
import y00.C38774a0;
import y00.C38784b0;
import y00.C38793c;
import y00.C38864j0;
import y00.C38888l4;
import y00.C38915o4;
import y00.C38931q2;
import y00.C38977v3;
import y00.C38991x;
import y00.C39000y;
import y00.C39013z3;
import y00.EnumC38828f4;
import y00.EnumC38853i;
import y00.InterfaceC38949s2;
import z63.C40132d;

/* JADX INFO: renamed from: pg3.p */
/* JADX INFO: loaded from: classes3.dex */
public class C29205p implements InterfaceC29189h, InterfaceC38616l, InterfaceC15820g, InterfaceC33987n {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f118203w;

    /* JADX INFO: renamed from: x */
    public Object f118204x;

    /* JADX INFO: renamed from: y */
    public Object f118205y;

    public /* synthetic */ C29205p(int i13, Object obj, Object obj2) {
        this.f118203w = i13;
        this.f118205y = obj;
        this.f118204x = obj2;
    }

    @Override // p623xr.InterfaceC38617m
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ Object mo45127a() {
        C38615k c38615k = (C38615k) this.f118205y;
        return new C32894b((C32900h) ((C38615k) this.f118204x).mo45127a(), (C32904l) c38615k.mo45127a());
    }

    @Override // to.InterfaceC33987n
    public void accept(Object obj, Object obj2) {
        C34030d c34030d = (C34030d) this.f118204x;
        PendingIntent pendingIntent = (PendingIntent) this.f118205y;
        C27004i c27004i = (C27004i) obj;
        C11048q c11048q = new C11048q(4, (C11040i) obj2);
        c27004i.m111058c();
        AbstractC35135w.m111095g(pendingIntent, "PendingIntent must be specified.");
        BinderC20793d binderC20793d = new BinderC20793d(c11048q);
        C27000e c27000e = (C27000e) c27004i.m111061j();
        Parcel parcelM80981s = c27000e.m80981s();
        AbstractC27007l.m80996c(parcelM80981s, c34030d);
        AbstractC27007l.m80996c(parcelM80981s, pendingIntent);
        AbstractC27007l.m80997d(parcelM80981s, binderC20793d);
        c27000e.m80980c0(parcelM80981s, 72);
    }

    @Override // gg.InterfaceC15820g
    /* JADX INFO: renamed from: b */
    public AbstractC15818e mo44620b(Object obj) {
        AbstractC15818e abstractC15818eMo44620b = ((InterfaceC15820g) this.f118204x).mo44620b(obj);
        if (!(abstractC15818eMo44620b instanceof C15816c)) {
            return abstractC15818eMo44620b;
        }
        InterfaceC30063j interfaceC30063j = (InterfaceC30063j) this.f118205y;
        C33691b c33691b = new C33691b(11);
        EnumC27905b enumC27905b = EnumC27905b.f112507z;
        String qualifiedName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33759d.class).getQualifiedName();
        if (qualifiedName == null) {
            throw new IllegalArgumentException("log<T> cannot be used on an anonymous object");
        }
        AbstractC35903f.m113983A(interfaceC30063j, enumC27905b, qualifiedName, null, c33691b);
        return abstractC15818eMo44620b;
    }

    /* JADX INFO: renamed from: c */
    public void m88707c(Object obj, String str) {
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        ((ArrayList) this.f118204x).add(AbstractC2875y.m8304q(new StringBuilder(length + 1 + strValueOf.length()), str, "=", strValueOf));
    }

    /* JADX INFO: renamed from: d */
    public C31261c1 m88708d() {
        return new C31261c1(this);
    }

    /* JADX INFO: renamed from: e */
    public C37582d m88709e() throws GeneralSecurityException {
        C37583e c37583e = (C37583e) this.f118204x;
        if (c37583e == null) {
            throw new GeneralSecurityException("Cannot build without a ecdsa public key");
        }
        C31624i c31624i = (C31624i) this.f118205y;
        if (c31624i == null) {
            throw new GeneralSecurityException("Cannot build without a private value");
        }
        BigInteger bigInteger = (BigInteger) c31624i.f130665x;
        ECPoint eCPoint = c37583e.f160721c;
        C37577a c37577a = c37583e.f160720b.f160715b;
        BigInteger order = c37577a.f160697b.getOrder();
        if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
            throw new GeneralSecurityException("Invalid private value");
        }
        if (AbstractC5086e.m15965g(bigInteger, c37577a.f160697b).equals(eCPoint)) {
            return new C37582d((C37583e) this.f118204x, (C31624i) this.f118205y);
        }
        throw new GeneralSecurityException("Invalid private value");
    }

    public boolean equals(Object obj) {
        switch (this.f118203w) {
            case 11:
                if (!(obj instanceof C15483b)) {
                    return false;
                }
                C15483b c15483b = (C15483b) obj;
                Object obj2 = c15483b.f58138a;
                Object obj3 = this.f118204x;
                if (obj2 != obj3 && (obj2 == null || !obj2.equals(obj3))) {
                    return false;
                }
                Object obj4 = c15483b.f58139b;
                Object obj5 = this.f118205y;
                return obj4 == obj5 || (obj4 != null && obj4.equals(obj5));
            default:
                return super.equals(obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x014f A[PHI: r15
      0x014f: PHI (r15v1 q20.d) = 
      (r15v0 q20.d)
      (r15v0 q20.d)
      (r15v0 q20.d)
      (r15v0 q20.d)
      (r15v0 q20.d)
      (r15v5 q20.d)
      (r15v0 q20.d)
      (r15v8 q20.d)
      (r15v9 q20.d)
      (r15v10 q20.d)
      (r15v11 q20.d)
      (r15v12 q20.d)
     binds: [B:97:0x013d, B:98:0x013f, B:100:0x0145, B:102:0x0149, B:104:0x014d, B:181:0x02d5, B:151:0x0222, B:143:0x0202, B:142:0x01f9, B:123:0x01a2, B:118:0x018e, B:108:0x0157] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:130:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:180:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:185:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:186:0x02f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:187:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:188:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:190:0x0302  */
    /* JADX WARN: Code duplicated, block: B:191:0x0305  */
    /* JADX WARN: Code duplicated, block: B:193:0x0309  */
    /* JADX WARN: Code duplicated, block: B:195:0x0310  */
    /* JADX WARN: Code duplicated, block: B:197:0x031c  */
    /* JADX WARN: Code duplicated, block: B:198:0x0321  */
    /* JADX WARN: Code duplicated, block: B:203:0x0330  */
    /* JADX WARN: Code duplicated, block: B:205:0x0334  */
    /* JADX WARN: Code duplicated, block: B:206:0x0339  */
    /* JADX WARN: Code duplicated, block: B:208:0x033d  */
    /* JADX WARN: Code duplicated, block: B:209:0x0342  */
    /* JADX WARN: Code duplicated, block: B:211:0x0346  */
    /* JADX WARN: Code duplicated, block: B:212:0x034b  */
    /* JADX WARN: Code duplicated, block: B:214:0x034f  */
    /* JADX WARN: Code duplicated, block: B:215:0x0354  */
    /* JADX WARN: Code duplicated, block: B:218:0x0369  */
    /* JADX WARN: Code duplicated, block: B:219:0x036c  */
    /* JADX WARN: Code duplicated, block: B:221:0x0374  */
    /* JADX WARN: Code duplicated, block: B:223:0x0378  */
    /* JADX WARN: Code duplicated, block: B:224:0x0382  */
    /* JADX WARN: Code duplicated, block: B:226:0x0386  */
    /* JADX WARN: Code duplicated, block: B:227:0x038e  */
    /* JADX WARN: Code duplicated, block: B:231:0x0396  */
    /* JADX WARN: Code duplicated, block: B:232:0x039c  */
    /* JADX WARN: Code duplicated, block: B:258:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:263:0x0414  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00be  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:86:0x010b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0111  */
    /* JADX INFO: renamed from: f */
    public C29814e m88710f(AbstractC29840y selection) {
        int iM34045K;
        int iM34047M;
        String str;
        String str2;
        C29812d c29812d;
        boolean z4;
        C29812d c29812d2;
        C38977v3 c38977v3;
        AbstractC37760u0 abstractC37760u0;
        C39000y c39000yMo124309b;
        String str3;
        String value;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        CountryCode countryCode;
        C16671i1 c16671i1M110137S;
        C17928b c17928b;
        String strMo133889M;
        AbstractC38794c0 abstractC38794c0Mo121164h;
        List listM118958J;
        InterfaceC41211c interfaceC41211cM100055i;
        C29812d c29812d3;
        EnumC38853i enumC38853iM106236i;
        Context context = (Context) this.f118205y;
        AbstractC22676k.m65750j(selection, "selection");
        boolean z13 = selection instanceof C29822i;
        C29824j c29824j = C29824j.f121906x;
        if (!z13) {
            if (selection instanceof C29818g) {
                iM34047M = 0;
            } else if (selection.equals(c29824j)) {
                iM34047M = R.drawable.stripe_google_pay_mark;
            } else if (selection instanceof C29828m) {
                iM34045K = AbstractC12240d.m34045K(1, null);
            } else if (selection instanceof C29829n) {
                EnumC38853i enumC38853i = ((C29829n) selection).f121923y;
                AbstractC22676k.m65750j(enumC38853i, "<this>");
                iM34045K = AbstractC12240d.m34039E(enumC38853i);
            } else if (selection instanceof C29830o) {
                iM34045K = ((C29830o) selection).f121932y;
            } else if (selection instanceof C29834s) {
                iM34045K = ((C29834s) selection).f121949y;
            } else if (selection instanceof C29838w) {
                C29838w c29838w = (C29838w) selection;
                C38915o4 c38915o4 = c29838w.f121955x;
                if (c38915o4.f167511E == EnumC38828f4.f167090I && (c38915o4.f167524R instanceof C38931q2)) {
                    iM34045K = R.drawable.stripe_ic_paymentsheet_link_arrow;
                } else {
                    iM34047M = AbstractC12240d.m34047M(c38915o4, null, 5);
                    if (iM34047M == R.drawable.stripe_ic_paymentsheet_card_unknown_ref) {
                        EnumC29836u enumC29836u = c29838w.f121956y;
                        int i13 = enumC29836u == null ? -1 : AbstractC29841z.f121960a[enumC29836u.ordinal()];
                        if (i13 == 1) {
                            iM34045K = AbstractC12240d.m34045K(1, null);
                        } else if (i13 == 2) {
                            iM34047M = R.drawable.stripe_google_pay_mark;
                        }
                    }
                }
            } else {
                if (!(selection instanceof C29839x)) {
                    throw new NoWhenBranchMatchedException();
                }
                iM34045K = R.drawable.stripe_shop_pay_logo_white;
            }
            if (z13) {
                str = ((C29822i) selection).f121899F;
            } else if (selection instanceof C29818g) {
                str = ((C29818g) selection).f121886E;
            } else if (!selection.equals(c29824j) || (selection instanceof C29828m) || (selection instanceof C29829n)) {
                str = null;
            } else if (selection instanceof C29830o) {
                str = ((C29830o) selection).f121925E;
            } else {
                if (!(selection instanceof C29834s) && !(selection instanceof C29838w) && !(selection instanceof C29839x)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = null;
            }
            if (z13) {
                str2 = ((C29822i) selection).f121900G;
            } else if (selection instanceof C29818g) {
                str2 = ((C29818g) selection).f121887F;
            } else if (!selection.equals(c29824j) || (selection instanceof C29828m) || (selection instanceof C29829n)) {
                str2 = null;
            } else if (selection instanceof C29830o) {
                str2 = ((C29830o) selection).f121926F;
            } else {
                if (!(selection instanceof C29834s) && !(selection instanceof C29838w) && !(selection instanceof C29839x)) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = null;
            }
            String strMo133889M2 = AbstractC34924m.m110121C(selection).mo133889M(context);
            String strM110122D = AbstractC34924m.m110122D(selection);
            String strMo133889M3 = AbstractC34924m.m110121C(selection).mo133889M(context);
            c29812d = new C29812d(strMo133889M3, null);
            z4 = selection instanceof C29818g;
            if (!z4 || z13 || (selection instanceof C29824j) || (selection instanceof C29839x) || (selection instanceof C29830o)) {
                c29812d2 = c29812d;
            } else {
                if (selection instanceof C29829n) {
                    C29829n c29829n = (C29829n) selection;
                    c29812d = new C29812d(c29829n.f121923y.f167261x, AbstractC34924m.m110121C(c29829n).mo133889M(context));
                } else if (selection instanceof C29834s) {
                    C29834s c29834s = (C29834s) selection;
                    String str9 = c29834s.f121948x;
                    C33321b c33321b = c29834s.f121942E.f139011z;
                    String strMo133889M4 = c33321b != null ? c33321b.f139000x : null;
                    if (strMo133889M4 == null) {
                        strMo133889M4 = AbstractC32128i.m100054h(R.string.stripe_payment_method_bank).mo133889M(context);
                    }
                    c29812d = new C29812d(strMo133889M4, str9);
                } else if (selection instanceof C29838w) {
                    C38915o4 c38915o5 = ((C29838w) selection).f121955x;
                    InterfaceC38949s2 interfaceC38949s2 = c38915o5.f167524R;
                    if (interfaceC38949s2 != null) {
                        c29812d = new C29812d(AbstractC32128i.m100054h(R.string.stripe_link).mo133889M(context), AbstractC32411b.m101067K(AbstractC25260n.m74077r0(new InterfaceC41211c[]{AbstractC32411b.m101061E(interfaceC38949s2), AbstractC32411b.m101065I(interfaceC38949s2)})).mo133889M(context));
                    } else {
                        C39013z3 c39013z3 = c38915o5.f167514H;
                        if (c39013z3 != null) {
                            String str10 = c39013z3.f167917L;
                            if (str10 != null) {
                                EnumC38853i.f167238M.getClass();
                                enumC38853iM106236i = C33623c0.m106236i(str10);
                                if (enumC38853iM106236i == null) {
                                    enumC38853iM106236i = c39013z3.f167918w;
                                }
                            } else {
                                enumC38853iM106236i = c39013z3.f167918w;
                            }
                            if (enumC38853iM106236i == EnumC38853i.Unknown) {
                                enumC38853iM106236i = null;
                            }
                            C41210b c41210bM34086w = AbstractC12240d.m34086w(c39013z3.f167913H);
                            String strMo133889M5 = c41210bM34086w != null ? c41210bM34086w.mo133889M(context) : null;
                            if (strMo133889M5 == null) {
                                strMo133889M5 = "";
                            }
                            c29812d = enumC38853iM106236i != null ? new C29812d(enumC38853iM106236i.f167261x, strMo133889M5) : new C29812d(strMo133889M5, null);
                        } else {
                            C38888l4 c38888l4 = c38915o5.f167523Q;
                            if (c38888l4 != null) {
                                String str11 = c38888l4.f167401y;
                                c29812d3 = str11 != null ? new C29812d(str11, strMo133889M3) : new C29812d(strMo133889M3, null);
                            } else {
                                c29812d3 = null;
                            }
                            if (c29812d3 != null) {
                                c29812d2 = c29812d3;
                            }
                        }
                    }
                } else {
                    if (!(selection instanceof C29828m)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AbstractC37760u0 abstractC37760u1 = ((C29828m) selection).f121916y;
                    if (abstractC37760u1 == null || (abstractC38794c0Mo121164h = abstractC37760u1.mo121164h()) == null) {
                        strMo133889M = null;
                    } else {
                        if (abstractC38794c0Mo121164h instanceof C38774a0) {
                            C38774a0 c38774a0 = (C38774a0) abstractC38794c0Mo121164h;
                            listM118958J = AbstractC37056f.m118959K(AbstractC32411b.m101068L(c38774a0.f166887F, c38774a0.f166895N.f167905w, c38774a0.f166892K), AbstractC32128i.m100055i("•••• " + c38774a0.f166897z));
                        } else if (abstractC38794c0Mo121164h instanceof C38991x) {
                            C38991x c38991x = (C38991x) abstractC38794c0Mo121164h;
                            String str12 = c38991x.f167832F;
                            String str13 = c38991x.f167833G;
                            if (str12 != null) {
                                interfaceC41211cM100055i = AbstractC32128i.m100055i(str12);
                            } else {
                                interfaceC41211cM100055i = str13 != null ? AbstractC32128i.m100055i(str13) : AbstractC32128i.m100054h(R.string.stripe_payment_method_bank);
                            }
                            listM118958J = AbstractC37056f.m118959K(interfaceC41211cM100055i, AbstractC32128i.m100055i("•••• " + c38991x.f167838z));
                        } else {
                            if (!(abstractC38794c0Mo121164h instanceof C38784b0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            listM118958J = AbstractC37056f.m118958J(AbstractC32128i.m100055i("•••• " + ((C38784b0) abstractC38794c0Mo121164h).f166936E));
                        }
                        InterfaceC41211c interfaceC41211cM101067K = AbstractC32411b.m101067K(listM118958J);
                        if (interfaceC41211cM101067K != null) {
                            strMo133889M = interfaceC41211cM101067K.mo133889M(context);
                        } else {
                            strMo133889M = null;
                        }
                    }
                    c29812d = new C29812d(AbstractC32128i.m100054h(R.string.stripe_link).mo133889M(context), strMo133889M);
                }
                c29812d2 = c29812d;
            }
            if (z13) {
                c38977v3 = ((C29822i) selection).f121902y;
            } else if (z4) {
                c38977v3 = ((C29818g) selection).f121889y;
            } else if (!selection.equals(c29824j)) {
                c38977v3 = null;
            } else if (selection instanceof C29828m) {
                abstractC37760u0 = ((C29828m) selection).f121916y;
                if (abstractC37760u0 != null) {
                    c39000yMo124309b = abstractC37760u0.mo121164h().mo124309b();
                    if (c39000yMo124309b != null) {
                        str3 = c39000yMo124309b.f167863E;
                    } else {
                        str3 = null;
                    }
                    if (c39000yMo124309b != null || (countryCode = c39000yMo124309b.f167865G) == null) {
                        value = null;
                    } else {
                        value = countryCode.getValue();
                    }
                    if (c39000yMo124309b != null) {
                        str4 = c39000yMo124309b.f167867x;
                    } else {
                        str4 = null;
                    }
                    if (c39000yMo124309b != null) {
                        str5 = c39000yMo124309b.f167868y;
                    } else {
                        str5 = null;
                    }
                    if (c39000yMo124309b != null) {
                        str6 = c39000yMo124309b.f167864F;
                    } else {
                        str6 = null;
                    }
                    if (c39000yMo124309b != null) {
                        str7 = c39000yMo124309b.f167869z;
                    } else {
                        str7 = null;
                    }
                    C38793c c38793c = new C38793c(str3, value, str4, str5, str6, str7);
                    String strMo124310f = abstractC37760u0.mo121164h().mo124310f();
                    String strMo121162b = abstractC37760u0.mo121162b();
                    if (c39000yMo124309b != null) {
                        str8 = c39000yMo124309b.f167866w;
                    } else {
                        str8 = null;
                    }
                    c38977v3 = new C38977v3(c38793c, strMo124310f, str8, strMo121162b);
                } else {
                    c38977v3 = null;
                }
            } else if (selection instanceof AbstractC29835t) {
                c38977v3 = ((AbstractC29835t) selection).mo91330i().f167019P;
            } else if (selection instanceof C29838w) {
                c38977v3 = ((C29838w) selection).f121955x.f167512F;
            } else {
                if (!(selection instanceof C29839x)) {
                    throw new NoWhenBranchMatchedException();
                }
                c38977v3 = null;
            }
            if (c38977v3 != null) {
                c16671i1M110137S = AbstractC34924m.m110137S(c38977v3);
            } else {
                c16671i1M110137S = null;
            }
            if (!z4 || z13 || (selection instanceof C29824j) || (selection instanceof C29829n) || (selection instanceof C29830o) || (selection instanceof C29834s) || (selection instanceof C29839x) || (selection instanceof C29838w)) {
                c17928b = null;
            } else {
                if (!(selection instanceof C29828m)) {
                    throw new NoWhenBranchMatchedException();
                }
                C38864j0 c38864j0 = ((C29828m) selection).f121917z;
                if (c38864j0 != null) {
                    C39000y c39000y = c38864j0.f167296y;
                    String str14 = c39000y.f167866w;
                    String str15 = c38864j0.f167297z;
                    String str16 = c39000y.f167867x;
                    String str17 = c39000y.f167868y;
                    String str18 = c39000y.f167863E;
                    String str19 = c39000y.f167869z;
                    String str20 = c39000y.f167864F;
                    CountryCode countryCode2 = c39000y.f167865G;
                    c17928b = new C17928b(str14, new C16760x0(str18, countryCode2 != null ? countryCode2.getValue() : null, str16, str17, str20, str19), str15, null);
                } else {
                    c17928b = null;
                }
            }
            return new C29814e(iM34047M, strMo133889M2, strM110122D, c16671i1M110137S, c17928b, c29812d2, new C29816f(this, iM34047M, str, str2, null));
        }
        iM34045K = ((C29822i) selection).f121898E;
        iM34047M = iM34045K;
        if (z13) {
            str = ((C29822i) selection).f121899F;
        } else if (selection instanceof C29818g) {
            str = ((C29818g) selection).f121886E;
        } else if (!selection.equals(c29824j)) {
            str = null;
        } else if (selection instanceof C29830o) {
            str = ((C29830o) selection).f121925E;
        } else {
            if (!(selection instanceof C29834s)) {
                throw new NoWhenBranchMatchedException();
            }
            str = null;
        }
        if (z13) {
            str2 = ((C29822i) selection).f121900G;
        } else if (selection instanceof C29818g) {
            str2 = ((C29818g) selection).f121887F;
        } else if (!selection.equals(c29824j)) {
            str2 = null;
        } else if (selection instanceof C29830o) {
            str2 = ((C29830o) selection).f121926F;
        } else {
            if (!(selection instanceof C29834s)) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = null;
        }
        String strMo133889M6 = AbstractC34924m.m110121C(selection).mo133889M(context);
        String strM110122D2 = AbstractC34924m.m110122D(selection);
        String strMo133889M7 = AbstractC34924m.m110121C(selection).mo133889M(context);
        c29812d = new C29812d(strMo133889M7, null);
        z4 = selection instanceof C29818g;
        if (z4) {
            c29812d2 = c29812d;
        } else {
            c29812d2 = c29812d;
        }
        if (z13) {
            c38977v3 = ((C29822i) selection).f121902y;
        } else if (z4) {
            c38977v3 = ((C29818g) selection).f121889y;
        } else if (!selection.equals(c29824j)) {
            c38977v3 = null;
        } else if (selection instanceof C29828m) {
            abstractC37760u0 = ((C29828m) selection).f121916y;
            if (abstractC37760u0 != null) {
                c39000yMo124309b = abstractC37760u0.mo121164h().mo124309b();
                if (c39000yMo124309b != null) {
                    str3 = c39000yMo124309b.f167863E;
                } else {
                    str3 = null;
                }
                if (c39000yMo124309b != null) {
                    value = null;
                } else {
                    value = null;
                }
                if (c39000yMo124309b != null) {
                    str4 = c39000yMo124309b.f167867x;
                } else {
                    str4 = null;
                }
                if (c39000yMo124309b != null) {
                    str5 = c39000yMo124309b.f167868y;
                } else {
                    str5 = null;
                }
                if (c39000yMo124309b != null) {
                    str6 = c39000yMo124309b.f167864F;
                } else {
                    str6 = null;
                }
                if (c39000yMo124309b != null) {
                    str7 = c39000yMo124309b.f167869z;
                } else {
                    str7 = null;
                }
                C38793c c38793c2 = new C38793c(str3, value, str4, str5, str6, str7);
                String strMo124310f2 = abstractC37760u0.mo121164h().mo124310f();
                String strMo121162b2 = abstractC37760u0.mo121162b();
                if (c39000yMo124309b != null) {
                    str8 = c39000yMo124309b.f167866w;
                } else {
                    str8 = null;
                }
                c38977v3 = new C38977v3(c38793c2, strMo124310f2, str8, strMo121162b2);
            } else {
                c38977v3 = null;
            }
        } else if (selection instanceof AbstractC29835t) {
            c38977v3 = ((AbstractC29835t) selection).mo91330i().f167019P;
        } else if (selection instanceof C29838w) {
            c38977v3 = ((C29838w) selection).f121955x.f167512F;
        } else {
            if (!(selection instanceof C29839x)) {
                throw new NoWhenBranchMatchedException();
            }
            c38977v3 = null;
        }
        if (c38977v3 != null) {
            c16671i1M110137S = AbstractC34924m.m110137S(c38977v3);
        } else {
            c16671i1M110137S = null;
        }
        if (z4) {
            c17928b = null;
        } else {
            c17928b = null;
        }
        return new C29814e(iM34047M, strMo133889M6, strM110122D2, c16671i1M110137S, c17928b, c29812d2, new C29816f(this, iM34047M, str, str2, null));
    }

    @Override // pg3.InterfaceC29189h
    /* JADX INFO: renamed from: g */
    public void mo2323g(InterfaceC29182e interfaceC29182e, C29218v0 c29218v0) {
        ((C29207q) this.f118205y).f118206w.execute(new RunnableC1283d(this, (InterfaceC29189h) this.f118204x, c29218v0, 17));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a8  */
    /* JADX INFO: renamed from: h */
    public InterfaceC40801z m88711h(InterfaceC40801z interfaceC40801z) {
        InterfaceC40801z interfaceC40801zMo41591b;
        InterfaceC37334l interfaceC37334l;
        int iMo44992e;
        boolean z4;
        boolean z13;
        boolean z14;
        boolean z15;
        Object c40778d;
        String str;
        RunnableC40784i runnableC40784i = (RunnableC40784i) this.f118205y;
        EnumC37323a enumC37323a = (EnumC37323a) this.f118204x;
        C40782g c40782g = runnableC40784i.f175882w;
        Class<?> cls = interfaceC40801z.get().getClass();
        InterfaceC37333k interfaceC37333kM56475b = null;
        if (enumC37323a != EnumC37323a.f159584z) {
            InterfaceC37334l interfaceC37334lM132270e = c40782g.m132270e(cls);
            interfaceC37334l = interfaceC37334lM132270e;
            interfaceC40801zMo41591b = interfaceC37334lM132270e.mo41591b(runnableC40784i.f175859H, interfaceC40801z, runnableC40784i.f175863L, runnableC40784i.f175864M);
        } else {
            interfaceC40801zMo41591b = interfaceC40801z;
            interfaceC37334l = null;
        }
        if (!interfaceC40801z.equals(interfaceC40801zMo41591b)) {
            interfaceC40801z.mo44996a();
        }
        if (((C20318e2) c40782g.f175840c.f20303b.f741e).m56475b(interfaceC40801zMo41591b.mo44997c()) != null) {
            interfaceC37333kM56475b = ((C20318e2) c40782g.f175840c.f20303b.f741e).m56475b(interfaceC40801zMo41591b.mo44997c());
            if (interfaceC37333kM56475b == null) {
                final Class clsMo44997c = interfaceC40801zMo41591b.mo44997c();
                throw new Registry$MissingComponentException(clsMo44997c) { // from class: com.bumptech.glide.Registry$NoResultEncoderAvailableException
                    {
                        super("Failed to find result encoder for resource class: " + clsMo44997c + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
                    }
                };
            }
            iMo44992e = interfaceC37333kM56475b.mo44992e(runnableC40784i.f175866O);
        } else {
            iMo44992e = 3;
        }
        InterfaceC37333k interfaceC37333k = interfaceC37333kM56475b;
        InterfaceC37327e interfaceC37327e = runnableC40784i.f175872U;
        ArrayList arrayListM132267b = c40782g.m132267b();
        int size = arrayListM132267b.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                z4 = false;
                break;
            }
            if (((C12154s) arrayListM132267b.get(i13)).f40407a.equals(interfaceC37327e)) {
                z4 = true;
                break;
            }
            i13++;
        }
        switch (runnableC40784i.f175865N.f175895a) {
            case 0:
                if (enumC37323a == EnumC37323a.f159584z || enumC37323a == EnumC37323a.f159579E) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                break;
            case 1:
            case 2:
                z13 = false;
                break;
            default:
                if (((!z4 && enumC37323a == EnumC37323a.f159583y) || enumC37323a == EnumC37323a.f159581w) && iMo44992e == 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                break;
        }
        if (!z13) {
            return interfaceC40801zMo41591b;
        }
        if (interfaceC37333k == null) {
            final Class<?> cls2 = interfaceC40801zMo41591b.get().getClass();
            throw new Registry$MissingComponentException(cls2) { // from class: com.bumptech.glide.Registry$NoResultEncoderAvailableException
                {
                    super("Failed to find result encoder for resource class: " + cls2 + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
                }
            };
        }
        int iM35485e = AbstractC12682p.m35485e(iMo44992e);
        if (iM35485e == 0) {
            z14 = false;
            z15 = true;
            c40778d = new C40778d(runnableC40784i.f175872U, runnableC40784i.f175860I);
        } else {
            if (iM35485e != 1) {
                if (iMo44992e == 1) {
                    str = "SOURCE";
                } else if (iMo44992e != 2) {
                    str = iMo44992e != 3 ? "null" : "NONE";
                } else {
                    str = "TRANSFORMED";
                }
                throw new IllegalArgumentException("Unknown strategy: ".concat(str));
            }
            z15 = true;
            z14 = false;
            c40778d = new C40775b0(c40782g.f175840c.f20302a, runnableC40784i.f175872U, runnableC40784i.f175860I, runnableC40784i.f175863L, runnableC40784i.f175864M, interfaceC37334l, cls, runnableC40784i.f175866O);
        }
        C40800y c40800y = (C40800y) C40800y.f175955E.mo43684b();
        c40800y.f175959z = z14;
        c40800y.f175958y = z15;
        c40800y.f175957x = interfaceC40801zMo41591b;
        C40132d c40132d = runnableC40784i.f175857F;
        c40132d.f173183w = c40778d;
        c40132d.f173184x = interfaceC37333k;
        c40132d.f173185y = c40800y;
        return c40800y;
    }

    public int hashCode() {
        switch (this.f118203w) {
            case 11:
                Object obj = this.f118204x;
                int iHashCode = obj == null ? 0 : obj.hashCode();
                Object obj2 = this.f118205y;
                return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m88712i(String str) {
        this.f118204x = str;
    }

    /* JADX INFO: renamed from: j */
    public void m88713j(C31624i c31624i) {
        this.f118205y = c31624i;
    }

    /* JADX INFO: renamed from: k */
    public void m88714k(C37583e c37583e) {
        this.f118204x = c37583e;
    }

    /* JADX INFO: renamed from: l */
    public void m88715l(List list) {
        this.f118205y = list;
    }

    @Override // pg3.InterfaceC29189h
    /* JADX INFO: renamed from: r */
    public void mo2329r(InterfaceC29182e interfaceC29182e, Throwable th3) {
        ((C29207q) this.f118205y).f118206w.execute(new RunnableC1283d(this, (InterfaceC29189h) this.f118204x, th3, 18));
    }

    public String toString() {
        switch (this.f118203w) {
            case 10:
                StringBuilder sb4 = new StringBuilder(100);
                sb4.append(this.f118205y.getClass().getSimpleName());
                sb4.append('{');
                ArrayList arrayList = (ArrayList) this.f118204x;
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    sb4.append((String) arrayList.get(i13));
                    if (i13 < size - 1) {
                        sb4.append(", ");
                    }
                }
                sb4.append('}');
                return sb4.toString();
            case 11:
                StringBuilder sb5 = new StringBuilder("Pair{");
                sb5.append(this.f118204x);
                sb5.append(" ");
                return AbstractC2875y.m8303p(sb5, "}", this.f118205y);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C29205p(int i13, boolean z4) {
        this.f118203w = i13;
    }

    public /* synthetic */ C29205p(Object obj, Object obj2, boolean z4, int i13) {
        this.f118203w = i13;
        this.f118204x = obj;
        this.f118205y = obj2;
    }

    public /* synthetic */ C29205p(Object obj) {
        this.f118203w = 10;
        AbstractC35135w.m111094f(obj);
        this.f118205y = obj;
        this.f118204x = new ArrayList();
    }

    public C29205p(C29827l iconLoader, Context context) {
        this.f118203w = 1;
        AbstractC22676k.m65750j(iconLoader, "iconLoader");
        AbstractC22676k.m65750j(context, "context");
        this.f118204x = iconLoader;
        this.f118205y = context;
    }

    public C29205p(Context context, InterfaceC30063j workContext) {
        this.f118203w = 8;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(workContext, "workContext");
        this.f118204x = workContext;
        this.f118205y = AbstractC30060g.m92088H(new C0971f(context, 15));
    }

    public C29205p(int i13) {
        this.f118203w = i13;
        switch (i13) {
            case 14:
                C13045h2 c13045h2M36593c = AbstractC13091v.m36593c("");
                this.f118204x = c13045h2M36593c;
                this.f118205y = AbstractC13091v.m36598h(c13045h2M36593c);
                break;
            default:
                this.f118204x = null;
                this.f118205y = null;
                break;
        }
    }

    public C29205p(InterfaceC15820g policy, InterfaceC30063j coroutineContext) {
        this.f118203w = 6;
        AbstractC22676k.m65750j(policy, "policy");
        AbstractC22676k.m65750j(coroutineContext, "coroutineContext");
        this.f118204x = policy;
        this.f118205y = coroutineContext;
    }

    public C29205p(ArrayList arrayList, ArrayList arrayList2) {
        this.f118203w = 9;
        int size = arrayList.size();
        this.f118204x = new int[size];
        this.f118205y = new float[size];
        for (int i13 = 0; i13 < size; i13++) {
            ((int[]) this.f118204x)[i13] = ((Integer) arrayList.get(i13)).intValue();
            ((float[]) this.f118205y)[i13] = ((Float) arrayList2.get(i13)).floatValue();
        }
    }

    public C29205p(int i13, int i14) {
        this.f118203w = 9;
        this.f118204x = new int[]{i13, i14};
        this.f118205y = new float[]{0.0f, 1.0f};
    }

    public C29205p(int i13, int i14, int i15) {
        this.f118203w = 9;
        this.f118204x = new int[]{i13, i14, i15};
        this.f118205y = new float[]{0.0f, 0.5f, 1.0f};
    }
}
