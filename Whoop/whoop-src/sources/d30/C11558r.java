package d30;

import ad3.C0783z;
import android.content.Context;
import androidx.health.platform.client.proto.C1533u;
import androidx.room.C1778e;
import b30.C2539i0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bo0.C3505c;
import c93.InterfaceC4339a;
import com.stripe.android.shoppay.ShopPayActivity;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.whoop.activation.iajf.domain.SignUpSource;
import com.whoop.universalcheckout.features.cart.domain.CartAddIntent;
import cp1.C11018e;
import cp1.C11020g;
import cp1.C11021h;
import cp1.C11031r;
import d80.AbstractC11769e;
import da0.InterfaceC11831d;
import e30.AbstractC12605c;
import e32.C12618e;
import e90.AbstractC12884g;
import e90.C12881d;
import ec2.C13012c;
import ec3.C13045h2;
import eg2.AbstractC13176i;
import ep1.AbstractC13409d;
import ep1.AbstractC13413h;
import ep1.AbstractC13414i;
import ep1.AbstractC13428w;
import ep2.C13431c;
import ev2.AbstractC13712u;
import fa0.AbstractC14296c;
import fc2.AbstractC14368b;
import fg2.AbstractC14464f;
import ft1.InterfaceC14770c;
import fy2.AbstractC14879a;
import fy2.C14882d;
import fy2.InterfaceC14880b;
import g32.AbstractC15311k;
import g32.C15313m;
import g32.C15315o;
import g80.C15562c;
import gg0.C15824c;
import gp2.AbstractC16070e;
import h02.AbstractC16575h0;
import h02.AbstractC16578j;
import h02.AbstractC16586n;
import h02.C16577i0;
import h02.C16582l;
import h02.C16583l0;
import h20.C16651f;
import h20.C16670i0;
import h20.C16687l;
import h20.C16727r3;
import h20.C16744u2;
import h20.C16760x0;
import h20.C16761x1;
import h20.C16776z4;
import h40.C16845k;
import i20.AbstractC17960l1;
import i20.C17928b;
import i20.C17954j1;
import i20.C17957k1;
import i20.C17979u;
import id2.AbstractC18435t;
import ig0.AbstractC18466f;
import ig0.AbstractC18467g;
import j20.C21239a;
import j20.C21241c;
import java.util.Map;
import java.util.NoSuchElementException;
import l40.C23328a;
import l83.C23454a0;
import l83.InterfaceC23462h;
import ny0.C27256h;
import p164g2.InterfaceC15237i;
import p180h0.C16379d4;
import p180h0.C16465v;
import p180h0.C16470w;
import p180h0.InterfaceC16450s;
import p181h2.C16618c;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p446r1.C30849c;
import p668z1.C39967p;
import p704dk2.AbstractC12123j;
import p706eo0.AbstractC13376g;
import p707gt1.AbstractC16188b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p730qt2.C30599e;
import q83.InterfaceC30057d;
import r20.C30865c;
import r20.C30866d;
import r20.C30873k;
import t81.C33612r;
import tr2.InterfaceC34116n;
import v00.C35459c0;

/* JADX INFO: renamed from: d30.r */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C11558r implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37279w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f37280x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f37281y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f37282z;

    public /* synthetic */ C11558r(Object obj, Object obj2, Object obj3, int i13) {
        this.f37279w = i13;
        this.f37280x = obj;
        this.f37281y = obj2;
        this.f37282z = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x018d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0195  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:15:0x0069  */
    /* JADX WARN: Code duplicated, block: B:21:0x0082  */
    /* JADX WARN: Code duplicated, block: B:26:0x0099  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:56:0x0123  */
    /* JADX WARN: Code duplicated, block: B:61:0x0134  */
    /* JADX WARN: Code duplicated, block: B:63:0x0137  */
    /* JADX WARN: Code duplicated, block: B:64:0x013a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0143  */
    /* JADX WARN: Code duplicated, block: B:68:0x0146  */
    /* JADX WARN: Code duplicated, block: B:71:0x014b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0152  */
    /* JADX WARN: Code duplicated, block: B:80:0x015d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0165  */
    /* JADX WARN: Code duplicated, block: B:87:0x016c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0174  */
    /* JADX WARN: Code duplicated, block: B:94:0x017b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0183  */
    /* JADX WARN: Code duplicated, block: B:98:0x0185  */
    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean z4;
        String str8;
        C13045h2 c13045h2;
        C17979u c17979u;
        Function1 function1;
        C17928b c17928b;
        String str9;
        boolean z13;
        C17928b c17928b2;
        C16760x0 c16760x0;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        C16760x0 c16760x1;
        int i13 = this.f37279w;
        InterfaceC30057d interfaceC30057d = null;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj = this.f37282z;
        Object obj2 = this.f37281y;
        Object obj3 = this.f37280x;
        switch (i13) {
            case 0:
                AbstractC12605c abstractC12605c = (AbstractC12605c) obj3;
                C35459c0 paymentMethodMetadata = (C35459c0) obj2;
                C16651f customerStateHolder = (C16651f) obj;
                C16776z4 savedPaymentMethodMutator = abstractC12605c.f43023a0;
                AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
                AbstractC22676k.m65750j(customerStateHolder, "customerStateHolder");
                AbstractC22676k.m65750j(savedPaymentMethodMutator, "savedPaymentMethodMutator");
                C30873k c30873k = new C30873k(new C11535h(customerStateHolder.f64022c, paymentMethodMetadata, abstractC12605c.f43012P, savedPaymentMethodMutator.f64498q, savedPaymentMethodMutator.f64496o, new C2539i0(0, savedPaymentMethodMutator, C16776z4.class, "toggleEditing", "toggleEditing()V", 0, 5), new C11529f(abstractC12605c, 0), new C11532g(savedPaymentMethodMutator, 0), new C11529f(abstractC12605c, 1), savedPaymentMethodMutator.f64494m));
                C30866d c30866d = abstractC12605c.f43009M;
                c30866d.getClass();
                C30599e c30599e = new C30599e(7, c30866d, c30873k);
                if (!c30866d.f127268e.getAndSet(true)) {
                    AbstractC3006f0.m8732z(c30866d.f127264a, null, null, new C30865c(c30599e, c30866d, null), 3);
                }
                return c23454a0;
            case 1:
                C11535h c11535h = (C11535h) obj2;
                C16687l c16687l = (C16687l) obj;
                if (((C11570x) ((InterfaceC28601c1) obj3).getValue()).f37345c) {
                    c11535h.m30991a(new C11515a0(c16687l));
                } else {
                    c11535h.m30991a(new C11572y(c16687l));
                }
                return c23454a0;
            case 2:
                return AbstractC11769e.m31528t((C15562c) obj3, (Function1) obj2, (SignUpSource) obj);
            case 3:
                return AbstractC12123j.m33529C((C33612r) obj3, (Function1) obj2, (InterfaceC28601c1) obj);
            case 4:
                return AbstractC12884g.m36209o((C12881d) obj3, (InterfaceC28601c1) obj2, (InterfaceC28601c1) obj);
            case 5:
                return AbstractC13176i.m36958P((Function1) obj3, (InterfaceC4339a) obj2, (InterfaceC28601c1) obj);
            case 6:
                return AbstractC13376g.m37689K((C3505c) obj3, (Function1) obj2, (Function1) obj);
            case 7:
                return AbstractC13409d.m37920q((C11018e) obj3, (Function1) obj2, (Function1) obj);
            case 8:
                return AbstractC13413h.m37954w((Function1) obj3, (C11020g) obj2, (C39967p) obj);
            case 9:
                return AbstractC13414i.m37975r((Function1) obj3, (C11021h) obj2, (C39967p) obj);
            case 10:
                return AbstractC13428w.m38130t((Function1) obj3, (C11031r) obj2, (InterfaceC28601c1) obj);
            case 11:
                return AbstractC13712u.m38776b1((Function1) obj3, (InterfaceC15237i) obj2, (InterfaceC4339a) obj);
            case 12:
                return AbstractC14296c.m40840C((Function1) obj3, (Function1) obj2, (InterfaceC11831d.a) obj);
            case 13:
                return AbstractC14368b.m41024l((InterfaceC34116n) obj3, (C13012c) obj2, (InterfaceC28601c1) obj);
            case 14:
                return AbstractC14464f.m41227f((InterfaceC4339a) obj3, (Context) obj2, (String) obj);
            case 15:
                return AbstractC14879a.m42933o((Function1) obj3, (InterfaceC14880b.b) obj2, (C14882d) obj);
            case 16:
                return AbstractC15311k.m43464J((C12618e) obj3, (C15313m) obj2, (InterfaceC4339a) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C15315o.m43515h((C16727r3) obj3, (C16744u2) obj2, (C16761x1) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC16070e.m45391k((C13431c.d) obj3, (Function1) obj2, (String) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC16188b.m45749l((Function1) obj3, (InterfaceC14770c.g) obj2, (Function1) obj);
            case 20:
                C16470w c16470w = (C16470w) obj3;
                C16379d4 c16379d4 = (C16379d4) obj2;
                InterfaceC16450s interfaceC16450s = (InterfaceC16450s) obj;
                C0783z c0783z = c16470w.f63281S;
                while (true) {
                    C30849c c30849c = (C30849c) c0783z.f2818x;
                    int i14 = c30849c.f127229y;
                    if (i14 != 0) {
                        if (i14 == 0) {
                            throw new NoSuchElementException("MutableVector is empty.");
                        }
                        C16618c c16618c = (C16618c) ((C16465v) c30849c.f127227w[i14 - 1]).f63260a.invoke();
                        if (c16618c == null ? true : c16470w.m46640Z0(c16618c, c16470w.f63285W)) {
                            C30849c c30849c2 = (C30849c) c0783z.f2818x;
                            ((C16465v) c30849c2.m94894l(c30849c2.f127229y - 1)).f63261b.resumeWith(c23454a0);
                        }
                    }
                }
                if (c16470w.f63283U) {
                    C16618c c16618cM46639Y0 = c16470w.m46639Y0();
                    if (c16618cM46639Y0 != null && c16470w.m46640Z0(c16618cM46639Y0, c16470w.f63285W)) {
                        c16470w.f63283U = false;
                    }
                }
                c16379d4.f62979e = C16470w.m46638X0(c16470w, interfaceC16450s);
                return c23454a0;
            case 21:
                AbstractC3006f0.m8732z((InterfaceC2994c0) obj3, null, null, new C11552o((Function1) obj2, (Function1) obj, interfaceC30057d, 28), 3);
                return c23454a0;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC16578j.m47010i((Function1) obj3, (C27256h) obj2, (CartAddIntent) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC16586n.m47063i((Function1) obj3, (C16582l) obj2, (InterfaceC28601c1) obj);
            case 24:
                return AbstractC16575h0.m46988x((Function1) obj3, (C16583l0) obj2, (C16577i0) obj);
            case 25:
                int i15 = ShopPayActivity.f22413E;
                AbstractC3006f0.m8732z((InterfaceC2994c0) obj3, null, null, new C16670i0((C16845k) obj2, obj, interfaceC30057d, 6), 3);
                return c23454a0;
            case 26:
                C17954j1 c17954j1 = (C17954j1) obj3;
                Map map = (Map) ((InterfaceC28601c1) obj2).getValue();
                Boolean bool = (Boolean) ((InterfaceC28670t2) obj).getValue();
                bool.getClass();
                C13045h2 c13045h3 = c17954j1.f69752M;
                Boolean bool2 = Boolean.FALSE;
                c13045h3.getClass();
                c13045h3.m36571k(null, bool2);
                if (map != null) {
                    IdentifierSpec.Companion.getClass();
                    C23328a c23328a = (C23328a) map.get(IdentifierSpec.Name);
                    if (c23328a != null) {
                        str = c23328a.f92491a;
                    } else {
                        str = null;
                    }
                } else {
                    str = null;
                }
                if (map != null) {
                    IdentifierSpec.Companion.getClass();
                    C23328a c23328a2 = (C23328a) map.get(IdentifierSpec.City);
                    if (c23328a2 != null) {
                        str2 = c23328a2.f92491a;
                    } else {
                        str2 = null;
                    }
                } else {
                    str2 = null;
                }
                if (map != null) {
                    IdentifierSpec.Companion.getClass();
                    C23328a c23328a3 = (C23328a) map.get(IdentifierSpec.Country);
                    if (c23328a3 != null) {
                        str3 = c23328a3.f92491a;
                    } else {
                        str3 = null;
                    }
                } else {
                    str3 = null;
                }
                if (map != null) {
                    IdentifierSpec.Companion.getClass();
                    C23328a c23328a4 = (C23328a) map.get(IdentifierSpec.Line1);
                    if (c23328a4 != null) {
                        str4 = c23328a4.f92491a;
                    } else {
                        str4 = null;
                    }
                } else {
                    str4 = null;
                }
                if (map != null) {
                    IdentifierSpec.Companion.getClass();
                    C23328a c23328a5 = (C23328a) map.get(IdentifierSpec.Line2);
                    if (c23328a5 != null) {
                        str5 = c23328a5.f92491a;
                    } else {
                        str5 = null;
                    }
                } else {
                    str5 = null;
                }
                if (map != null) {
                    IdentifierSpec.Companion.getClass();
                    C23328a c23328a6 = (C23328a) map.get(IdentifierSpec.PostalCode);
                    if (c23328a6 != null) {
                        str6 = c23328a6.f92491a;
                    } else {
                        str6 = null;
                    }
                } else {
                    str6 = null;
                }
                if (map != null) {
                    IdentifierSpec.Companion.getClass();
                    C23328a c23328a7 = (C23328a) map.get(IdentifierSpec.State);
                    if (c23328a7 != null) {
                        str7 = c23328a7.f92491a;
                    } else {
                        str7 = null;
                    }
                } else {
                    str7 = null;
                }
                C16760x0 c16760x2 = new C16760x0(str2, str3, str4, str5, str6, str7);
                String str18 = str7;
                if (map != null) {
                    IdentifierSpec.Companion.getClass();
                    z4 = true;
                    C23328a c23328a8 = (C23328a) map.get(IdentifierSpec.Phone);
                    if (c23328a8 != null) {
                        str8 = c23328a8.f92491a;
                    }
                    C17928b c17928b3 = new C17928b(str, c16760x2, str8, bool);
                    c13045h2 = c17954j1.f69749J;
                    if (str3 != null) {
                        C21241c c21241c = c17954j1.f69758y;
                        c17928b = (C17928b) c13045h2.getValue();
                        if (c17928b != null || (c16760x1 = c17928b.f69684x) == null) {
                            str9 = null;
                        } else {
                            str9 = c16760x1.f64400y;
                        }
                        if (str9 != null) {
                            z13 = z4;
                        } else {
                            z13 = false;
                        }
                        c17928b2 = (C17928b) c13045h2.getValue();
                        if (c17928b2 != null) {
                            c16760x0 = c17928b2.f69684x;
                        } else {
                            c16760x0 = null;
                        }
                        str10 = "";
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (c16760x0 != null || (str11 = c16760x0.f64398w) == null) {
                            str11 = "";
                        }
                        int iM51585l = AbstractC17960l1.m51585l(str2, str11);
                        if (c16760x0 != null || (str12 = c16760x0.f64399x) == null) {
                            str12 = "";
                        }
                        int iM51585l2 = AbstractC17960l1.m51585l(str3, str12) + iM51585l;
                        if (str4 == null) {
                            str4 = "";
                        }
                        if (c16760x0 != null || (str13 = c16760x0.f64400y) == null) {
                            str13 = "";
                        }
                        int iM51585l3 = AbstractC17960l1.m51585l(str4, str13) + iM51585l2;
                        if (str5 == null) {
                            str5 = "";
                        }
                        if (c16760x0 != null || (str14 = c16760x0.f64401z) == null) {
                            str14 = "";
                        }
                        int iM51585l4 = AbstractC17960l1.m51585l(str5, str14) + iM51585l3;
                        if (str6 == null) {
                            str15 = "";
                        } else {
                            str15 = str6;
                        }
                        if (c16760x0 != null || (str16 = c16760x0.f64396E) == null) {
                            str16 = "";
                        }
                        int iM51585l5 = AbstractC17960l1.m51585l(str15, str16) + iM51585l4;
                        if (str18 == null) {
                            str18 = "";
                        }
                        if (c16760x0 != null && (str17 = c16760x0.f64397F) != null) {
                            str10 = str17;
                        }
                        Integer numValueOf = Integer.valueOf(AbstractC17960l1.m51585l(str18, str10) + iM51585l5);
                        c21241c.getClass();
                        AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(c21241c.f81100c), null, null, new C1778e(c21241c, new C21239a(str3, z13, numValueOf), interfaceC30057d, 16), 3);
                    }
                    C17957k1 c17957k1 = c17954j1.f69757x;
                    c17979u = new C17979u(c17928b3);
                    function1 = c17957k1.f69767b;
                    if (function1 != null) {
                        function1.invoke(c17979u);
                    }
                    return c23454a0;
                }
                z4 = true;
                str8 = null;
                C17928b c17928b4 = new C17928b(str, c16760x2, str8, bool);
                c13045h2 = c17954j1.f69749J;
                if (str3 != null) {
                    C21241c c21241c2 = c17954j1.f69758y;
                    c17928b = (C17928b) c13045h2.getValue();
                    if (c17928b != null) {
                        str9 = null;
                    } else {
                        str9 = null;
                    }
                    if (str9 != null) {
                        z13 = z4;
                    } else {
                        z13 = false;
                    }
                    c17928b2 = (C17928b) c13045h2.getValue();
                    if (c17928b2 != null) {
                        c16760x0 = c17928b2.f69684x;
                    } else {
                        c16760x0 = null;
                    }
                    str10 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (c16760x0 != null) {
                        str11 = "";
                    } else {
                        str11 = "";
                    }
                    int iM51585l6 = AbstractC17960l1.m51585l(str2, str11);
                    if (c16760x0 != null) {
                        str12 = "";
                    } else {
                        str12 = "";
                    }
                    int iM51585l7 = AbstractC17960l1.m51585l(str3, str12) + iM51585l6;
                    if (str4 == null) {
                        str4 = "";
                    }
                    if (c16760x0 != null) {
                        str13 = "";
                    } else {
                        str13 = "";
                    }
                    int iM51585l8 = AbstractC17960l1.m51585l(str4, str13) + iM51585l7;
                    if (str5 == null) {
                        str5 = "";
                    }
                    if (c16760x0 != null) {
                        str14 = "";
                    } else {
                        str14 = "";
                    }
                    int iM51585l9 = AbstractC17960l1.m51585l(str5, str14) + iM51585l8;
                    if (str6 == null) {
                        str15 = "";
                    } else {
                        str15 = str6;
                    }
                    if (c16760x0 != null) {
                        str16 = "";
                    } else {
                        str16 = "";
                    }
                    int iM51585l10 = AbstractC17960l1.m51585l(str15, str16) + iM51585l9;
                    if (str18 == null) {
                        str18 = "";
                    }
                    if (c16760x0 != null) {
                        str10 = str17;
                    }
                    Integer numValueOf2 = Integer.valueOf(AbstractC17960l1.m51585l(str18, str10) + iM51585l10);
                    c21241c2.getClass();
                    AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(c21241c2.f81100c), null, null, new C1778e(c21241c2, new C21239a(str3, z13, numValueOf2), interfaceC30057d, 16), 3);
                }
                C17957k1 c17957k2 = c17954j1.f69757x;
                c17979u = new C17979u(c17928b4);
                function1 = c17957k2.f69767b;
                if (function1 != null) {
                    function1.invoke(c17979u);
                }
                return c23454a0;
            case 27:
                return AbstractC18435t.m53098W((String) obj3, (String) obj2, (InterfaceC23462h) obj);
            case 28:
                return AbstractC18466f.m53230i((C15824c) obj3, (Function1) obj2, (C27256h) obj);
            default:
                return AbstractC18467g.m53245l((Function1) obj3, (C27256h) obj2, (C15824c.c) obj);
        }
    }
}
