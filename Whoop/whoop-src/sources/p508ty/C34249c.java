package p508ty;

import aa3.C0656u0;
import al.C0960g;
import android.media.AudioAttributes;
import android.os.Parcel;
import android.util.SparseArray;
import androidx.health.platform.client.proto.C1533u;
import cf3.AbstractC4545a;
import cg.C4560o;
import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;
import com.google.android.gms.common.C4969a;
import com.google.android.gms.common.api.InterfaceC4979j;
import com.squareup.wire.AbstractC5581l;
import com.squareup.wire.AbstractC5586q;
import com.stripe.android.p056ui.core.elements.AddressSpec;
import com.stripe.android.p056ui.core.elements.AffirmTextSpec;
import com.stripe.android.p056ui.core.elements.AfterpayClearpayTextSpec;
import com.stripe.android.p056ui.core.elements.AuBankAccountNumberSpec;
import com.stripe.android.p056ui.core.elements.AuBecsDebitMandateTextSpec;
import com.stripe.android.p056ui.core.elements.BacsDebitBankAccountSpec;
import com.stripe.android.p056ui.core.elements.BacsDebitConfirmSpec;
import com.stripe.android.p056ui.core.elements.BsbSpec;
import com.stripe.android.p056ui.core.elements.CashAppPayMandateTextSpec;
import com.stripe.android.p056ui.core.elements.CountrySpec;
import com.stripe.android.p056ui.core.elements.DropdownSpec;
import com.stripe.android.p056ui.core.elements.EmailSpec;
import com.stripe.android.p056ui.core.elements.EmptyFormSpec;
import com.stripe.android.p056ui.core.elements.FormItemSpec;
import com.stripe.android.p056ui.core.elements.IbanSpec;
import com.stripe.android.p056ui.core.elements.KlarnaHeaderStaticTextSpec;
import com.stripe.android.p056ui.core.elements.KlarnaMandateTextSpec;
import com.stripe.android.p056ui.core.elements.MandateTextSpec;
import com.stripe.android.p056ui.core.elements.NameSpec;
import com.stripe.android.p056ui.core.elements.OTPSpec;
import com.stripe.android.p056ui.core.elements.PhoneSpec;
import com.stripe.android.p056ui.core.elements.PlaceholderSpec;
import com.stripe.android.p056ui.core.elements.SepaMandateTextSpec;
import com.stripe.android.p056ui.core.elements.SimpleTextSpec;
import com.stripe.android.p056ui.core.elements.StaticTextSpec;
import e93.AbstractC12889b;
import ed3.C13117a;
import g40.InterfaceC15367i1;
import gl.C15956u;
import h20.C16689l1;
import h20.EnumC16673i3;
import h20.EnumC16677j1;
import h20.EnumC16683k1;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Stack;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import jp.AbstractC21843a;
import m83.AbstractC25265s;
import m83.C25271y;
import m83.InterfaceC25237b0;
import ne3.AbstractC26604b;
import nf.InterfaceC26651e;
import o20.AbstractC27461f;
import o20.AbstractC27462g;
import org.json.JSONObject;
import p006a4.AbstractC0354a;
import p073cq.C11040i;
import p116ef.C13140a;
import p309lo.C24547e;
import p319m4.AbstractC25012a;
import p465rm.AbstractC31532g;
import p474s.AbstractC32004s;
import p516u8.AbstractC34584c;
import p516u8.C34586d;
import p522uf.AbstractC34870c0;
import p522uf.C34865a;
import p522uf.C34894u;
import p522uf.C34896w;
import p522uf.InterfaceC34869c;
import p522uf.InterfaceC34875f;
import p529uo.AbstractC35107c;
import p529uo.AbstractC35117h;
import p529uo.C35123k;
import p529uo.C35125m;
import p529uo.InterfaceC35105b;
import p590wo.C37433a;
import p590wo.C37435c;
import p598wy.InterfaceC37689b;
import p607x8.AbstractC38065t;
import p616xi.C38314b;
import p618xk.InterfaceC38416g;
import p647yf.C39489b;
import p647yf.InterfaceC39500m;
import p647yf.InterfaceC39502o;
import p647yf.InterfaceC39508u;
import p705ea2.C12915l;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p719m22.C24947b;
import pg3.InterfaceC29201n;
import q83.InterfaceC30057d;
import s30.AbstractC32100b;
import sn.C32770z;
import t53.InterfaceC33546a;
import tb0.C33691b;
import to.InterfaceC33987n;
import ud3.AbstractC34799a1;
import v00.C35459c0;
import v00.C35479m0;
import vn.C36173d;
import wa3.AbstractC36990e;
import wa3.C37023z;
import wb3.AbstractC37056f;
import x30.C37923r0;
import xe3.C38253p;
import y00.InterfaceC38802c8;
import yb3.C39410n;
import yb3.InterfaceC39407k;

/* JADX INFO: renamed from: ty.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C34249c implements InterfaceC37689b, InterfaceC33546a, InterfaceC34869c, InterfaceC35105b, InterfaceC29201n, InterfaceC34875f, InterfaceC33987n, InterfaceC38416g, InterfaceC25237b0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f143659w;

    /* JADX INFO: renamed from: x */
    public final Object f143660x;

    public /* synthetic */ C34249c(Object obj, int i13) {
        this.f143659w = i13;
        this.f143660x = obj;
    }

    /* JADX INFO: renamed from: h */
    public static AbstractC36990e m108292h(C34249c c34249c, AbstractC36990e abstractC36990e, AbstractC36990e abstractC36990e2) {
        c34249c.m108295k(abstractC36990e);
        c34249c.m108295k(abstractC36990e2);
        Stack stack = (Stack) c34249c.f143660x;
        AbstractC36990e c37023z = (AbstractC36990e) stack.pop();
        while (!stack.isEmpty()) {
            c37023z = new C37023z((AbstractC36990e) stack.pop(), c37023z);
        }
        return c37023z;
    }

    @Override // p618xk.InterfaceC38416g
    /* JADX INFO: renamed from: a */
    public void mo40832a() {
        ((C15956u) this.f143660x).m45022h();
    }

    @Override // to.InterfaceC33987n
    public void accept(Object obj, Object obj2) {
        C11040i c11040i = (C11040i) obj2;
        C37433a c37433a = (C37433a) ((C37435c) obj).m111061j();
        C35125m c35125m = (C35125m) this.f143660x;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(c37433a.f78074h);
        int i13 = AbstractC21843a.f84371a;
        if (c35125m == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            c35125m.writeToParcel(parcelObtain, 0);
        }
        try {
            c37433a.f78073g.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            c11040i.m29687b(null);
        } catch (Throwable th3) {
            parcelObtain.recycle();
            throw th3;
        }
    }

    @Override // p529uo.InterfaceC35105b
    /* JADX INFO: renamed from: b */
    public void mo13941b(C4969a c4969a) {
        AbstractC35107c abstractC35107c = (AbstractC35107c) this.f143660x;
        if (c4969a.m15588b()) {
            abstractC35107c.m111060i(null, ((AbstractC35117h) abstractC35107c).f149028y);
            return;
        }
        C35123k c35123k = abstractC35107c.f148976o;
        if (c35123k != null) {
            ((InterfaceC4979j) c35123k.f149049a).mo15607c0(c4969a);
        }
    }

    @Override // p522uf.InterfaceC34875f
    /* JADX INFO: renamed from: c */
    public Object mo8834c(C34896w c34896w, InterfaceC30057d interfaceC30057d) {
        return new C13140a((C4560o) this.f143660x);
    }

    @Override // pg3.InterfaceC29201n
    public Object convert(Object obj) {
        AbstractC34799a1 abstractC34799a1 = (AbstractC34799a1) obj;
        try {
            return (AbstractC5581l) ((AbstractC5586q) this.f143660x).decode(abstractC34799a1.mo1940d1());
        } finally {
            abstractC34799a1.close();
        }
    }

    @Override // m83.InterfaceC25237b0
    /* JADX INFO: renamed from: d */
    public Object mo73982d(Object obj) {
        return (Class) obj;
    }

    @Override // p618xk.InterfaceC38416g
    /* JADX INFO: renamed from: e */
    public Object mo40834e() {
        C15956u c15956u = (C15956u) this.f143660x;
        c15956u.reset();
        return c15956u;
    }

    @Override // p522uf.InterfaceC34869c
    /* JADX INFO: renamed from: f */
    public Object mo1862f(C34894u c34894u, C34865a c34865a) {
        InterfaceC26651e[] interfaceC26651eArr = (InterfaceC26651e[]) this.f143660x;
        ArrayList arrayList = new ArrayList(interfaceC26651eArr.length);
        for (InterfaceC26651e interfaceC26651e : interfaceC26651eArr) {
            arrayList.add(AbstractC12889b.m36261a(interfaceC26651e.mo79292c()));
        }
        return arrayList;
    }

    @Override // m83.InterfaceC25237b0
    /* JADX INFO: renamed from: g */
    public Iterator mo73983g() {
        return ((Iterable) this.f143660x).iterator();
    }

    /* JADX INFO: renamed from: i */
    public void m108293i(C32770z c32770z) {
    }

    /* JADX INFO: renamed from: j */
    public void m108294j(int i13, boolean z4) {
        C24547e c24547e = (C24547e) this.f143660x;
        if (z4) {
            c24547e.m71592a(i13);
        } else {
            c24547e.getClass();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m108295k(AbstractC36990e abstractC36990e) {
        if (!abstractC36990e.mo118747g()) {
            if (!(abstractC36990e instanceof C37023z)) {
                String strValueOf = String.valueOf(abstractC36990e.getClass());
                throw new IllegalArgumentException(AbstractC25012a.m73376i("Has a new type of ByteString been created? Found ", strValueOf, new StringBuilder(strValueOf.length() + 49)));
            }
            C37023z c37023z = (C37023z) abstractC36990e;
            m108295k(c37023z.f158397y);
            m108295k(c37023z.f158398z);
            return;
        }
        int size = abstractC36990e.size();
        int[] iArr = C37023z.f158392H;
        int iBinarySearch = Arrays.binarySearch(iArr, size);
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int i13 = iArr[iBinarySearch + 1];
        Stack stack = (Stack) this.f143660x;
        if (stack.isEmpty() || ((AbstractC36990e) stack.peek()).size() >= i13) {
            stack.push(abstractC36990e);
            return;
        }
        int i14 = iArr[iBinarySearch];
        AbstractC36990e c37023z2 = (AbstractC36990e) stack.pop();
        while (!stack.isEmpty() && ((AbstractC36990e) stack.peek()).size() < i14) {
            c37023z2 = new C37023z((AbstractC36990e) stack.pop(), c37023z2);
        }
        C37023z c37023z3 = new C37023z(c37023z2, abstractC36990e);
        while (!stack.isEmpty()) {
            int[] iArr2 = C37023z.f158392H;
            int iBinarySearch2 = Arrays.binarySearch(iArr2, c37023z3.f158396x);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((AbstractC36990e) stack.peek()).size() >= iArr2[iBinarySearch2 + 1]) {
                break;
            } else {
                c37023z3 = new C37023z((AbstractC36990e) stack.pop(), c37023z3);
            }
        }
        stack.push(c37023z3);
    }

    /* JADX INFO: renamed from: l */
    public C38314b m108296l() {
        return (C38314b) this.f143660x;
    }

    /* JADX INFO: renamed from: n */
    public DrmSession$DrmSessionException m108297n() {
        return (DrmSession$DrmSessionException) this.f143660x;
    }

    /* JADX INFO: renamed from: o */
    public InterfaceC39407k m108298o() {
        return (C39410n) this.f143660x;
    }

    /* JADX INFO: renamed from: p */
    public C0656u0 m108299p() {
        AbstractC4545a abstractC4545a = (AbstractC4545a) this.f143660x;
        if (!(abstractC4545a instanceof C38253p)) {
            return new C0656u0(2);
        }
        ArrayList arrayList = ((C38253p) abstractC4545a).f164020b.f164003b;
        C0656u0 c0656u0 = new C0656u0(2);
        c0656u0.f2286a.addAll(arrayList);
        return c0656u0;
    }

    /* JADX INFO: renamed from: q */
    public UUID m108300q() {
        return AbstractC31532g.f130146a;
    }

    /* JADX INFO: renamed from: r */
    public int m108301r() {
        return 1;
    }

    /* JADX INFO: renamed from: s */
    public boolean m108302s() {
        switch (this.f143659w) {
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ((InterfaceC39502o) this.f143660x).mo106286h();
            default:
                return ((InterfaceC39500m) this.f143660x).mo126150o();
        }
    }

    @Override // p598wy.InterfaceC37689b
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public C34248b mo8011m(JSONObject jSONObject) {
        String strM99551t;
        String strM99551t2;
        String strM99551t3 = AbstractC32004s.m99551t("guid", jSONObject);
        if (strM99551t3 == null || (strM99551t = AbstractC32004s.m99551t("muid", jSONObject)) == null || (strM99551t2 = AbstractC32004s.m99551t("sid", jSONObject)) == null) {
            return null;
        }
        return new C34248b(strM99551t3, strM99551t, strM99551t2, ((Number) ((C33691b) this.f143660x).invoke()).longValue());
    }

    /* JADX INFO: renamed from: u */
    public void m108304u(C32770z c32770z) {
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:58:0x0100  */
    /* JADX INFO: renamed from: v */
    public ArrayList m108305v(C35459c0 c35459c0, ArrayList specs, List placeholderOverrideList, EnumC16673i3 enumC16673i3) {
        List<InterfaceC15367i1> listM118958J;
        FormItemSpec formItemSpecM82870a;
        AbstractC22676k.m65750j(specs, "specs");
        AbstractC22676k.m65750j(placeholderOverrideList, "placeholderOverrideList");
        C35479m0 c35479m0 = (C35479m0) this.f143660x;
        String str = c35479m0.f151038g;
        LinkedHashMap linkedHashMap = c35479m0.f151034c;
        C16689l1 configuration = c35479m0.f151040i;
        boolean z4 = c35479m0.f151041j;
        AbstractC22676k.m65750j(configuration, "configuration");
        ArrayList arrayListM118964P = AbstractC37056f.m118964P(PlaceholderSpec.PlaceholderField.Name, PlaceholderSpec.PlaceholderField.Email, PlaceholderSpec.PlaceholderField.Phone, PlaceholderSpec.PlaceholderField.BillingAddress);
        ArrayList arrayList = new ArrayList();
        Iterator it = specs.iterator();
        while (it.hasNext()) {
            FormItemSpec spec = (FormItemSpec) it.next();
            AbstractC22676k.m65750j(spec, "spec");
            boolean z13 = spec instanceof NameSpec;
            if (z13) {
                arrayListM118964P.remove(PlaceholderSpec.PlaceholderField.Name);
            } else if (spec instanceof EmailSpec) {
                arrayListM118964P.remove(PlaceholderSpec.PlaceholderField.Email);
            } else if (spec instanceof PhoneSpec) {
                arrayListM118964P.remove(PlaceholderSpec.PlaceholderField.Phone);
            } else if (spec instanceof AddressSpec) {
                arrayListM118964P.remove(PlaceholderSpec.PlaceholderField.BillingAddress);
            } else if (spec instanceof SepaMandateTextSpec) {
                arrayListM118964P.remove(PlaceholderSpec.PlaceholderField.SepaMandate);
            } else if (spec instanceof PlaceholderSpec) {
                PlaceholderSpec placeholderSpec = (PlaceholderSpec) spec;
                if (AbstractC27461f.f110668a[placeholderSpec.getField().ordinal()] == 1) {
                    arrayListM118964P.remove(PlaceholderSpec.PlaceholderField.BillingAddress);
                } else {
                    arrayListM118964P.remove(placeholderSpec.getField());
                }
            }
            if (z13) {
                if (configuration.f64189w == EnumC16683k1.f64150x) {
                    formItemSpecM82870a = null;
                } else {
                    formItemSpecM82870a = spec;
                }
            } else if (spec instanceof EmailSpec) {
                if (configuration.f64191y == EnumC16683k1.f64150x) {
                    formItemSpecM82870a = null;
                } else {
                    formItemSpecM82870a = spec;
                }
            } else if (spec instanceof PhoneSpec) {
                if (configuration.f64190x == EnumC16683k1.f64150x) {
                    formItemSpecM82870a = null;
                } else {
                    formItemSpecM82870a = spec;
                }
            } else if (spec instanceof AddressSpec) {
                if (configuration.f64192z == EnumC16677j1.f64132x) {
                    formItemSpecM82870a = null;
                } else {
                    formItemSpecM82870a = spec;
                }
            } else if (spec instanceof PlaceholderSpec) {
                formItemSpecM82870a = AbstractC27462g.m82870a(((PlaceholderSpec) spec).getField(), placeholderOverrideList, z4, configuration, enumC16673i3);
            } else if (spec instanceof SepaMandateTextSpec) {
                if (enumC16673i3 == EnumC16673i3.f64122x) {
                    formItemSpecM82870a = null;
                } else {
                    formItemSpecM82870a = spec;
                }
            } else {
                if (spec instanceof AuBecsDebitMandateTextSpec) {
                    if (enumC16673i3 == EnumC16673i3.f64122x) {
                        formItemSpecM82870a = null;
                    }
                }
                formItemSpecM82870a = spec;
            }
            if (formItemSpecM82870a != null) {
                arrayList.add(formItemSpecM82870a);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayListM118964P.iterator();
        while (it3.hasNext()) {
            FormItemSpec formItemSpecM82870a2 = AbstractC27462g.m82870a((PlaceholderSpec.PlaceholderField) it3.next(), placeholderOverrideList, z4, configuration, enumC16673i3);
            if (formItemSpecM82870a2 != null) {
                arrayList2.add(formItemSpecM82870a2);
            }
        }
        List<FormItemSpec> listM74152u1 = AbstractC25265s.m74152u1(AbstractC25265s.m74129g1(arrayList, arrayList2), new C12915l(new C24947b(21), 11));
        ArrayList arrayList3 = new ArrayList();
        for (FormItemSpec formItemSpec : listM74152u1) {
            if (formItemSpec instanceof StaticTextSpec) {
                listM118958J = AbstractC37056f.m118958J(((StaticTextSpec) formItemSpec).transform());
            } else if (formItemSpec instanceof AfterpayClearpayTextSpec) {
                AfterpayClearpayTextSpec afterpayClearpayTextSpec = (AfterpayClearpayTextSpec) formItemSpec;
                InterfaceC38802c8 interfaceC38802c8 = c35459c0.f150996w;
                listM118958J = AbstractC37056f.m118958J(afterpayClearpayTextSpec.transform(interfaceC38802c8 != null ? AbstractC34870c0.m109981P(interfaceC38802c8) : null));
            } else if (formItemSpec instanceof AffirmTextSpec) {
                listM118958J = AbstractC37056f.m118958J(((AffirmTextSpec) formItemSpec).transform());
            } else if (formItemSpec instanceof EmptyFormSpec) {
                listM118958J = AbstractC37056f.m118958J(new C37923r0());
            } else if (formItemSpec instanceof MandateTextSpec) {
                listM118958J = AbstractC37056f.m118958J(((MandateTextSpec) formItemSpec).transform(str));
            } else if (formItemSpec instanceof AuBecsDebitMandateTextSpec) {
                listM118958J = AbstractC37056f.m118958J(((AuBecsDebitMandateTextSpec) formItemSpec).transform(str));
            } else if (formItemSpec instanceof BacsDebitBankAccountSpec) {
                listM118958J = AbstractC37056f.m118958J(((BacsDebitBankAccountSpec) formItemSpec).transform(linkedHashMap));
            } else if (formItemSpec instanceof BacsDebitConfirmSpec) {
                listM118958J = AbstractC37056f.m118958J(((BacsDebitConfirmSpec) formItemSpec).transform(str, linkedHashMap));
            } else if (formItemSpec instanceof BsbSpec) {
                listM118958J = AbstractC37056f.m118958J(((BsbSpec) formItemSpec).transform(linkedHashMap));
            } else if (formItemSpec instanceof OTPSpec) {
                listM118958J = AbstractC37056f.m118958J(((OTPSpec) formItemSpec).transform());
            } else if (formItemSpec instanceof NameSpec) {
                listM118958J = AbstractC37056f.m118958J(((NameSpec) formItemSpec).transform(linkedHashMap));
            } else if (formItemSpec instanceof EmailSpec) {
                listM118958J = AbstractC37056f.m118958J(((EmailSpec) formItemSpec).transform(linkedHashMap));
            } else if (formItemSpec instanceof PhoneSpec) {
                listM118958J = AbstractC37056f.m118958J(((PhoneSpec) formItemSpec).transform(linkedHashMap));
            } else if (formItemSpec instanceof SimpleTextSpec) {
                listM118958J = AbstractC37056f.m118958J(((SimpleTextSpec) formItemSpec).transform(linkedHashMap));
            } else if (formItemSpec instanceof AuBankAccountNumberSpec) {
                listM118958J = AbstractC37056f.m118958J(((AuBankAccountNumberSpec) formItemSpec).transform(linkedHashMap));
            } else if (formItemSpec instanceof IbanSpec) {
                listM118958J = AbstractC37056f.m118958J(((IbanSpec) formItemSpec).transform(linkedHashMap));
            } else if (formItemSpec instanceof KlarnaHeaderStaticTextSpec) {
                listM118958J = AbstractC37056f.m118958J(((KlarnaHeaderStaticTextSpec) formItemSpec).transform());
            } else if (formItemSpec instanceof DropdownSpec) {
                listM118958J = AbstractC37056f.m118958J(((DropdownSpec) formItemSpec).transform(linkedHashMap));
            } else if (formItemSpec instanceof CountrySpec) {
                listM118958J = AbstractC37056f.m118958J(((CountrySpec) formItemSpec).transform(linkedHashMap));
            } else if (formItemSpec instanceof AddressSpec) {
                listM118958J = ((AddressSpec) formItemSpec).transform(linkedHashMap, c35479m0.f151036e, c35479m0.f151046o);
            } else if (formItemSpec instanceof SepaMandateTextSpec) {
                listM118958J = AbstractC37056f.m118958J(((SepaMandateTextSpec) formItemSpec).transform(str));
            } else if (formItemSpec instanceof PlaceholderSpec) {
                listM118958J = C25271y.f99162w;
            } else if (formItemSpec instanceof CashAppPayMandateTextSpec) {
                listM118958J = AbstractC37056f.m118958J(((CashAppPayMandateTextSpec) formItemSpec).transform(str));
            } else {
                if (!(formItemSpec instanceof KlarnaMandateTextSpec)) {
                    throw new NoWhenBranchMatchedException();
                }
                listM118958J = AbstractC37056f.m118958J(((KlarnaMandateTextSpec) formItemSpec).transform(str));
            }
            AbstractC25265s.m74141p0(arrayList3, listM118958J);
        }
        return arrayList3;
    }

    public C34249c(AbstractC35107c abstractC35107c) {
        this.f143659w = 8;
        Objects.requireNonNull(abstractC35107c);
        this.f143660x = abstractC35107c;
    }

    public C34249c(InputStream inputStream, C0960g c0960g) {
        this.f143659w = 24;
        C15956u c15956u = new C15956u(inputStream, c0960g);
        this.f143660x = c15956u;
        c15956u.mark(5242880);
    }

    public C34249c(C34586d c34586d) {
        this.f143659w = 5;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c34586d.f145643a).setFlags(0).setUsage(1);
        int i13 = AbstractC38065t.f163031a;
        if (i13 >= 29) {
            AbstractC0354a.m954A(usage);
        }
        if (i13 >= 32) {
            AbstractC34584c.m109364a(usage);
        }
        this.f143660x = usage.build();
    }

    public C34249c(InterfaceC39508u interfaceC39508u) {
        this.f143659w = 19;
        AbstractC22676k.m65750j(interfaceC39508u, "<this>");
        this.f143660x = interfaceC39508u instanceof InterfaceC39500m ? (InterfaceC39500m) interfaceC39508u : new C39489b(AbstractC26604b.m79158c(AbstractC32100b.m99874x(interfaceC39508u)));
    }

    public C34249c(int i13) {
        this.f143659w = i13;
        int i14 = 0;
        switch (i13) {
            case 14:
                this.f143660x = new C36173d(5, 1.0f, false);
                break;
            case 15:
                this.f143660x = new SparseArray();
                break;
            case 16:
                this.f143660x = new Stack();
                break;
            case 20:
                this.f143660x = new C13117a(10);
                break;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                this.f143660x = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
                byte[] bArr = new byte[128];
                for (int i15 = 0; i15 < 128; i15++) {
                    bArr[i15] = -1;
                }
                while (true) {
                    byte[] bArr2 = (byte[]) this.f143660x;
                    if (i14 >= bArr2.length) {
                        bArr[65] = bArr[97];
                        bArr[66] = bArr[98];
                        bArr[67] = bArr[99];
                        bArr[68] = bArr[100];
                        bArr[69] = bArr[101];
                        bArr[70] = bArr[102];
                    } else {
                        bArr[bArr2[i14]] = (byte) i14;
                        i14++;
                    }
                    break;
                }
                break;
            case 28:
                this.f143660x = new ConcurrentHashMap();
                break;
            default:
                this.f143660x = new C24547e(1);
                break;
        }
    }
}
