package p292l1;

import androidx.lifecycle.C1621r0;
import androidx.lifecycle.InterfaceC1618q0;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.amplitude.android.engagement.C4861a;
import com.amplitude.android.engagement.types.Action;
import com.amplitude.android.engagement.types.ButtonBlock;
import com.amplitude.android.engagement.types.ButtonMeta;
import com.amplitude.android.engagement.types.ButtonType;
import com.amplitude.android.engagement.types.ContentBlock;
import com.amplitude.android.engagement.types.Nudge;
import com.amplitude.android.engagement.types.StepForwardAction;
import com.amplitude.android.engagement.types.SurveyListBlock;
import com.amplitude.android.engagement.types.SurveyRatingBlock;
import i93.C18284j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import p012ab.C0684i0;
import p197hj.C17337t;
import p305lj.AbstractC24425e0;
import p316m1.C24920r;
import p319m4.AbstractC25012a;
import p329n0.C26068u;
import p33.C28820m;
import p389p0.C28539n0;
import p390p1.C28596b0;
import p390p1.InterfaceC28601c1;
import p442qy.C30765d;
import p505ts.AbstractC34132o;
import p664yy.C39874n0;
import p664yy.InterfaceC39860g0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q30.C29938w0;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r30.C30899d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import t30.C33505g;
import tj.AbstractC33863b;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;
import yo1.C39689b;

/* JADX INFO: renamed from: l1.v0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23187v0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f91719E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f91720F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f91721w = 2;

    /* JADX INFO: renamed from: x */
    public int f91722x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f91723y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f91724z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23187v0(C4861a c4861a, Nudge nudge, InterfaceC28601c1 interfaceC28601c1, int i13, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f91724z = c4861a;
        this.f91719E = nudge;
        this.f91720F = interfaceC28601c1;
        this.f91723y = i13;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f91721w) {
            case 0:
                return new C23187v0((C26068u) this.f91724z, this.f91723y, (C18284j) this.f91719E, (C24920r) this.f91720F, interfaceC30057d);
            case 1:
                C23187v0 c23187v0 = new C23187v0((C33505g) this.f91719E, (C30899d) this.f91720F, this.f91723y, interfaceC30057d);
                c23187v0.f91724z = obj;
                return c23187v0;
            case 2:
                return new C23187v0((C4861a) this.f91724z, (Nudge) this.f91719E, (InterfaceC28601c1) this.f91720F, this.f91723y, interfaceC30057d);
            default:
                return new C23187v0((C39689b) this.f91724z, (Iterable) this.f91719E, this.f91723y, (C0684i0) this.f91720F, interfaceC30057d);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f91721w) {
            case 0:
                return ((C23187v0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 1:
                return ((C23187v0) create((InterfaceC1618q0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 2:
                return ((C23187v0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C23187v0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0174  */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC1618q0 interfaceC1618q0;
        String str;
        Object objM8705K;
        Object next;
        String jSONString;
        boolean z4;
        Object objM8705K2;
        int i13 = this.f91721w;
        boolean z13 = false;
        InterfaceC30057d interfaceC30057d = null;
        C23454a0 c23454a0 = C23454a0.f92919a;
        int i14 = this.f91723y;
        Object obj2 = this.f91720F;
        Object obj3 = this.f91719E;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i15 = this.f91722x;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                C26068u c26068u = (C26068u) this.f91724z;
                int i16 = (((i14 - ((C18284j) obj3).f71133w) * 12) + ((C24920r) obj2).f97600b) - 1;
                this.f91722x = 1;
                C28539n0 c28539n0 = C26068u.f103217x;
                return c26068u.m77567j(i16, 0, this) == enumC31071a ? enumC31071a : c23454a0;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i17 = this.f91722x;
                if (i17 == 0) {
                    AbstractC34132o.m107864I(obj);
                    interfaceC1618q0 = (InterfaceC1618q0) this.f91724z;
                    C29938w0 c29938w0 = ((C33505g) obj3).f139880z;
                    C30899d c30899d = (C30899d) obj2;
                    if (c30899d != null) {
                        String str2 = c30899d.f127400x;
                        String str3 = c30899d.f127401y;
                        String str4 = c30899d.f127399w;
                        str = i14 <= 160 ? str4 : i14 >= 320 ? str3 : str2;
                        if (str == null || AbstractC39414r.m125890i0(str)) {
                            str = null;
                        }
                        if (str == null) {
                            Iterator it = AbstractC37056f.m118959K(str3, str2, str4).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = it.next();
                                    String str5 = (String) next;
                                    if (str5 == null || AbstractC39414r.m125890i0(str5)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            str = (String) next;
                        }
                    } else {
                        str = null;
                    }
                    this.f91724z = interfaceC1618q0;
                    this.f91722x = 1;
                    objM8705K = AbstractC3006f0.m8705K((InterfaceC30063j) c29938w0.f122262z, new C28820m(str, c29938w0, interfaceC30057d, 7), this);
                    if (objM8705K != enumC31071a2) {
                    }
                    return enumC31071a2;
                }
                if (i17 != 1) {
                    if (i17 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                interfaceC1618q0 = (InterfaceC1618q0) this.f91724z;
                AbstractC34132o.m107864I(obj);
                objM8705K = obj;
                this.f91724z = null;
                this.f91722x = 2;
                if (((C1621r0) interfaceC1618q0).m5031a(objM8705K, this) != enumC31071a2) {
                    return c23454a0;
                }
                return enumC31071a2;
            case 2:
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) obj2;
                C4861a c4861a = (C4861a) this.f91724z;
                Nudge nudge = (Nudge) obj3;
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i18 = this.f91722x;
                if (i18 == 0) {
                    AbstractC34132o.m107864I(obj);
                    int variantId = nudge.getVariantId();
                    AbstractC24425e0 abstractC24425e0 = (AbstractC24425e0) interfaceC28601c1.getValue();
                    c4861a.getClass();
                    C4861a.f20259o.m16030H(new C17337t(variantId, abstractC24425e0));
                    if (abstractC24425e0 == null || (jSONString = abstractC24425e0.toJSONString()) == null) {
                        jSONString = "undefined";
                    }
                    c4861a.f20263d.m53801a("globalThis.nudgeActions.updateSurveyResponse(" + variantId + ", " + jSONString + ')', null);
                    if (interfaceC28601c1.getValue() == null) {
                        return c23454a0;
                    }
                    C28596b0 c28596b0 = AbstractC33863b.f141865a;
                    List<ContentBlock> content = nudge.getSteps().get(i14).getContent();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : content) {
                        ContentBlock contentBlock = (ContentBlock) obj4;
                        if ((contentBlock instanceof SurveyListBlock) || (contentBlock instanceof SurveyRatingBlock)) {
                            arrayList.add(obj4);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj5 : content) {
                        if (obj5 instanceof ButtonBlock) {
                            arrayList2.add(obj5);
                        }
                    }
                    boolean zIsEmpty = arrayList2.isEmpty();
                    if (arrayList.size() == 1) {
                        ContentBlock contentBlock2 = (ContentBlock) AbstractC25265s.m74096F0(arrayList);
                        if (contentBlock2 instanceof SurveyListBlock ? AbstractC22676k.m65745e(((SurveyListBlock) contentBlock2).getMeta().getListType(), "single") : contentBlock2 instanceof SurveyRatingBlock) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    } else {
                        z4 = false;
                    }
                    if (z4 && zIsEmpty) {
                        z13 = true;
                    }
                    if (!z13) {
                        return c23454a0;
                    }
                    this.f91722x = 1;
                    if (AbstractC3034m0.m8782b(200L, this) == enumC31071a3) {
                        return enumC31071a3;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                c4861a.m15517c(nudge.getVariantId(), new StepForwardAction((String) null, 1, (DefaultConstructorMarker) null), new ButtonMeta((String) null, (Action) null, (ButtonType) null, (List) null, (Action) null, 31, (DefaultConstructorMarker) null));
                return c23454a0;
            default:
                Iterable iterable = (Iterable) obj3;
                C39689b c39689b = (C39689b) this.f91724z;
                C0684i0 c0684i0 = (C0684i0) obj2;
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                int i19 = this.f91722x;
                if (i19 != 0) {
                    if (i19 == 1) {
                        AbstractC34132o.m107864I(obj);
                    } else {
                        if (i19 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                        objM8705K2 = obj;
                    }
                    return (C39874n0) objM8705K2;
                }
                AbstractC34132o.m107864I(obj);
                C39874n0 c39874n0 = (C39874n0) c39689b.invoke();
                int i24 = c39874n0.f172186a;
                if (!AbstractC25265s.m74155w0(iterable, new Integer(i24)) || i14 <= 0) {
                    return c39874n0;
                }
                ((C30765d) c0684i0.f2443F).m94513c(AbstractC25012a.m73372e(i24, i14, "Request failed with code ", ". Retrying up to ", " more time(s)."));
                long jMo127936a = ((InterfaceC39860g0) c0684i0.f2442E).mo127936a(i14);
                this.f91722x = 1;
                if (AbstractC3034m0.m8783c(jMo127936a, this) == enumC31071a4) {
                    return enumC31071a4;
                }
                this.f91722x = 2;
                objM8705K2 = AbstractC3006f0.m8705K((InterfaceC30063j) c0684i0.f2446y, new C23187v0(c39689b, iterable, i14 - 1, c0684i0, (InterfaceC30057d) null), this);
                if (objM8705K2 == enumC31071a4) {
                    return enumC31071a4;
                }
                return (C39874n0) objM8705K2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23187v0(C26068u c26068u, int i13, C18284j c18284j, C24920r c24920r, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f91724z = c26068u;
        this.f91723y = i13;
        this.f91719E = c18284j;
        this.f91720F = c24920r;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23187v0(C33505g c33505g, C30899d c30899d, int i13, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f91719E = c33505g;
        this.f91720F = c30899d;
        this.f91723y = i13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23187v0(C39689b c39689b, Iterable iterable, int i13, C0684i0 c0684i0, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f91724z = c39689b;
        this.f91719E = iterable;
        this.f91723y = i13;
        this.f91720F = c0684i0;
    }
}
