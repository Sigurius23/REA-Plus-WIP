package androidx.room;

import ae3.C0803k;
import al.AbstractC0954a;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.C1593i0;
import androidx.lifecycle.EnumC1635w;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.android.R;
import gb.C15651l;
import gb.C15652m;
import gb.C15654o;
import gb.C15655p;
import gb.C15656q;
import gf.C15760a;
import gf.C15762c;
import gf.C15768i;
import i63.AbstractC18158a0;
import i63.C18187z;
import i93.C18284j;
import ih0.AbstractC18489d0;
import j93.InterfaceC21461d;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.net.ProtocolException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import l83.C23454a0;
import l83.C23465k;
import l83.C23470p;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import n83.C26459b;
import no.nordicsemi.android.dfu.DfuBaseService;
import o63.InterfaceC27622m;
import o63.InterfaceC27623n;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC11266d;
import p000.C0000a;
import p005a3.C0237p;
import p005a3.C0271z0;
import p007a6.C0438l0;
import p026b2.C2312r;
import p027b3.AbstractC2399k2;
import p040c0.C3743h;
import p043c4.C3974q;
import p098dt.AbstractC12350b;
import p114eb.AbstractC12958g1;
import p114eb.C12943b1;
import p114eb.C12946c1;
import p114eb.C12949d1;
import p114eb.C12952e1;
import p114eb.C12955f1;
import p114eb.C12977n0;
import p114eb.C12982q;
import p161g.C14923z;
import p161g.InterfaceC14897b0;
import p179h.AbstractC16350h;
import p179h.C16353k;
import p179h.C16354l;
import p179h.C16355m;
import p208i2.AbstractC17911t;
import p208i2.C17924z0;
import p208i2.InterfaceC17915v;
import p209i3.C18027i;
import p270k2.AbstractC22132f;
import p294l3.C23286w;
import p294l3.C23290y;
import p319m4.AbstractC25012a;
import p341nh.EnumC26713g;
import p371ok.C27984a;
import p371ok.C27985b;
import p371ok.C27987d;
import p371ok.C27988e;
import p371ok.C27989f;
import p371ok.C27990g;
import p371ok.EnumC27986c;
import p390p1.AbstractC28683x;
import p390p1.C28592a0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p410q1.C29775l0;
import p471rx.AbstractC31885f;
import p471rx.C31882d;
import p471rx.C31883e;
import p521ue.C34855a;
import p571w3.C36776l;
import p581we.AbstractC37185f;
import p602x1.AbstractC37817c;
import p634y1.AbstractC39038k;
import p634y1.C39031d;
import p668z1.C39967p;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22699b;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22711n;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import se.AbstractC32411b;
import ub3.C34752f;
import ud3.C34818h0;
import ud3.EnumC34828m0;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import yb3.C39406j;
import yb3.C39408l;
import yb3.C39409m;
import yb3.C39410n;

/* JADX INFO: renamed from: androidx.room.c1 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1772c1 {
    /* JADX INFO: renamed from: B */
    public static final int m5367B(int i13, int i14) {
        return (i13 >> i14) & 31;
    }

    /* JADX INFO: renamed from: E */
    public static Type[] m5368E(Type type, Class cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        if (!Map.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException();
        }
        Type typeM99131i = AbstractC31885f.m99131i(type, cls, AbstractC31885f.m99126d(type, cls, Map.class), new LinkedHashSet());
        return typeM99131i instanceof ParameterizedType ? ((ParameterizedType) typeM99131i).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    /* JADX INFO: renamed from: F */
    public static C31882d m5369F(Class cls, Type... typeArr) {
        if (typeArr.length != 0) {
            return new C31882d(null, cls, typeArr);
        }
        throw new IllegalArgumentException(AbstractC11266d.m30459m(cls, "Missing type arguments for "));
    }

    /* JADX INFO: renamed from: G */
    public static final String m5370G(Object obj) {
        AbstractC22676k.m65750j(obj, "<this>");
        InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(obj.getClass());
        String qualifiedName = orCreateKotlinClass.getQualifiedName();
        if (qualifiedName == null && (qualifiedName = orCreateKotlinClass.getSimpleName()) == null) {
            return "Unknown";
        }
        String strM125862H0 = AbstractC39414r.m125862H0(qualifiedName, '$');
        String strM125860F0 = AbstractC39414r.m125860F0('.', strM125862H0, strM125862H0);
        return strM125860F0.length() == 0 ? qualifiedName : AbstractC39414r.m125900s0(strM125860F0, "Kt");
    }

    /* JADX INFO: renamed from: H */
    public static C0237p m5371H(String str) {
        String str2;
        Object obj = null;
        try {
            URI uri = new URI(str);
            if (uri.isAbsolute()) {
                try {
                    uri.toURL();
                } catch (Exception unused) {
                    return new C0237p(obj, obj, obj, 12);
                }
            }
            String rawPath = "";
            if (uri.getScheme() == null) {
                str2 = "";
            } else {
                str2 = uri.getScheme() + "://";
            }
            String rawAuthority = uri.getRawAuthority() == null ? "" : uri.getRawAuthority();
            if (uri.getRawPath() != null) {
                rawPath = uri.getRawPath();
            }
            return new C0237p(str2 + m5399q(rawAuthority) + rawPath, uri.getRawQuery(), uri.getRawFragment(), 12);
        } catch (Exception unused2) {
            return new C0237p(obj, obj, obj, 12);
        }
    }

    /* JADX INFO: renamed from: I */
    public static C0803k m5372I(String statusLine) throws ProtocolException {
        EnumC34828m0 enumC34828m0;
        int i13;
        String strSubstring;
        AbstractC22676k.m65750j(statusLine, "statusLine");
        if (AbstractC39421y.m125930O(statusLine, "HTTP/1.", false)) {
            i13 = 9;
            if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            int iCharAt = statusLine.charAt(7) - '0';
            if (iCharAt == 0) {
                enumC34828m0 = EnumC34828m0.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                enumC34828m0 = EnumC34828m0.HTTP_1_1;
            }
        } else if (AbstractC39421y.m125930O(statusLine, "ICY ", false)) {
            enumC34828m0 = EnumC34828m0.HTTP_1_0;
            i13 = 4;
        } else {
            if (!AbstractC39421y.m125930O(statusLine, "SOURCETABLE ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            enumC34828m0 = EnumC34828m0.HTTP_1_1;
            i13 = 12;
        }
        int i14 = i13 + 3;
        if (statusLine.length() < i14) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
        String strSubstring2 = statusLine.substring(i13, i14);
        AbstractC22676k.m65749i(strSubstring2, "substring(...)");
        Integer numM125932Q = AbstractC39421y.m125932Q(strSubstring2);
        if (numM125932Q == null) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
        int iIntValue = numM125932Q.intValue();
        if (statusLine.length() <= i14) {
            strSubstring = "";
        } else {
            if (statusLine.charAt(i14) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            strSubstring = statusLine.substring(i13 + 4);
            AbstractC22676k.m65749i(strSubstring, "substring(...)");
        }
        return new C0803k(enumC34828m0, iIntValue, strSubstring);
    }

    /* JADX INFO: renamed from: J */
    public static C34818h0 m5373J(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        try {
            return m5403u(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: K */
    public static AbstractC12958g1 m5374K(Class cls, boolean z4) {
        if (Parcelable.class.isAssignableFrom(cls)) {
            return z4 ? new C12946c1(cls) : new C12949d1(cls);
        }
        if (Enum.class.isAssignableFrom(cls) && !z4) {
            return new C12943b1(cls);
        }
        if (Serializable.class.isAssignableFrom(cls)) {
            return z4 ? new C12952e1(cls) : new C12955f1(cls);
        }
        return null;
    }

    /* JADX INFO: renamed from: L */
    public static final Modifier m5375L(float f13, Modifier modifier) {
        return f13 == 0.0f ? modifier : AbstractC1127a.m3488c(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f13, null, null, 0, 524031);
    }

    /* JADX INFO: renamed from: M */
    public static final void m5376M(View view, InterfaceC14897b0 interfaceC14897b0) {
        AbstractC22676k.m65750j(view, "<this>");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, interfaceC14897b0);
    }

    /* JADX INFO: renamed from: N */
    public static final void m5377N(C18187z c18187z, String value) {
        List listM74097F1;
        AbstractC22676k.m65750j(c18187z, "<this>");
        AbstractC22676k.m65750j(value, "value");
        if (AbstractC39414r.m125890i0(value)) {
            listM74097F1 = C25271y.f99162w;
        } else {
            listM74097F1 = value.equals("/") ? AbstractC18158a0.f70467a : AbstractC25265s.m74097F1(AbstractC39414r.m125905x0(value, new char[]{'/'}, 0, 6));
        }
        AbstractC22676k.m65750j(listM74097F1, "<set-?>");
        c18187z.f70541h = listM74097F1;
    }

    /* JADX INFO: renamed from: O */
    public static final void m5378O(C29775l0 c29775l0, int i13, Object obj) {
        c29775l0.f121784e[(c29775l0.f121785f - c29775l0.f121780a[c29775l0.f121781b - 1].f121777c) + i13] = obj;
    }

    /* JADX INFO: renamed from: P */
    public static final void m5379P(C29775l0 c29775l0, int i13, Object obj, int i14, Object obj2) {
        int i15 = c29775l0.f121785f - c29775l0.f121780a[c29775l0.f121781b - 1].f121777c;
        Object[] objArr = c29775l0.f121784e;
        objArr[i13 + i15] = obj;
        objArr[i15 + i14] = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [gf.c] */
    /* JADX WARN: Type inference failed for: r5v3, types: [gf.b] */
    /* JADX WARN: Type inference failed for: r5v4, types: [gf.i] */
    /* JADX INFO: renamed from: Q */
    public static C34855a m5380Q(int i13, String str) {
        ?? c15762c;
        Boolean bool = Boolean.FALSE;
        String str2 = (i13 & 2) != 0 ? null : "sts";
        if ((i13 & 4) != 0) {
            str = null;
        }
        if ((i13 & 8) != 0) {
            bool = null;
        }
        if (str2 == null && str == null && bool == null) {
            c15762c = C15768i.f59433w;
        } else {
            c15762c = new C15762c();
            C15760a key = AbstractC37185f.m119157j();
            AbstractC22676k.m65750j(key, "key");
            if (str != null && !AbstractC39414r.m125890i0(str)) {
                c15762c.mo33083c(key, str);
            }
            C15760a key2 = AbstractC37185f.m119159l();
            AbstractC22676k.m65750j(key2, "key");
            if (str2 != null && !AbstractC39414r.m125890i0(str2)) {
                c15762c.mo33083c(key2, str2);
            }
            if (bool != null) {
                c15762c.mo33083c(AbstractC37185f.m119160m(), Boolean.valueOf(!bool.booleanValue()));
            }
        }
        return new C34855a("aws.auth#sigv4", c15762c);
    }

    /* JADX INFO: renamed from: R */
    public static C31883e m5381R(Type type) {
        return new C31883e(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, AbstractC31885f.f132391b);
    }

    /* JADX INFO: renamed from: S */
    public static final C23470p m5382S(Object obj, String str) {
        AbstractC22676k.m65750j(obj, "<this>");
        if (str == null) {
            str = m5370G(obj);
        }
        return AbstractC30060g.m92088H(new C0438l0(str, 3));
    }

    /* JADX INFO: renamed from: T */
    public static final double m5383T(long j7) {
        return ((j7 >>> 11) * ((double) DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS)) + (j7 & 2047);
    }

    /* JADX INFO: renamed from: a */
    public static final void m5384a(C15656q c15656q, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(294589392);
        int i14 = i13 | (c28655q.m87153g(c15656q) ? 4 : 2);
        if ((i14 & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            C39031d c39031dM124461g = AbstractC39038k.m124461g(c28655q);
            InterfaceC28601c1 interfaceC28601c1M87261o = AbstractC28683x.m87261o(c15656q.m36435b().f44870e, c28655q, 0);
            Object obj = (Collection) ((List) interfaceC28601c1M87261o.getValue());
            boolean zBooleanValue = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
            boolean zM87153g = c28655q.m87153g(obj);
            Object objM87133R = c28655q.m87133R();
            Object obj2 = C28635l.f115821a;
            Object obj3 = objM87133R;
            if (zM87153g || objM87133R == obj2) {
                C39967p c39967p = new C39967p();
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : (Iterable) obj) {
                    C12982q c12982q = (C12982q) obj4;
                    if (zBooleanValue || c12982q.f44837H.f6250d.compareTo(EnumC1635w.f6328z) >= 0) {
                        arrayList.add(obj4);
                    }
                }
                c39967p.addAll(arrayList);
                c28655q.m87172p0(c39967p);
                obj3 = c39967p;
            }
            C39967p c39967p2 = (C39967p) obj3;
            m5385b(c39967p2, (List) interfaceC28601c1M87261o.getValue(), c28655q, 0);
            InterfaceC28601c1 interfaceC28601c1M87261o2 = AbstractC28683x.m87261o(c15656q.m36435b().f44871f, c28655q, 0);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == obj2) {
                objM87133R2 = new C39967p();
                c28655q.m87172p0(objM87133R2);
            }
            C39967p c39967p3 = (C39967p) objM87133R2;
            c28655q.m87150e0(1361037007);
            ListIterator listIterator = c39967p2.listIterator();
            while (true) {
                C26459b c26459b = (C26459b) listIterator;
                if (!c26459b.hasNext()) {
                    break;
                }
                C12982q c12982q2 = (C12982q) c26459b.next();
                C12977n0 c12977n0 = c12982q2.f44844x;
                AbstractC22676k.m65748h(c12977n0, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                C15655p c15655p = (C15655p) c12977n0;
                boolean zM87157i = ((i14 & 14) == 4) | c28655q.m87157i(c12982q2);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87157i || objM87133R3 == obj2) {
                    objM87133R3 = new C0271z0(10, c15656q, c12982q2);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC32411b.m101089d((InterfaceC4339a) objM87133R3, c15655p.m43958p(), AbstractC37817c.m121344e(1129586364, c28655q, new C15651l(c12982q2, c15656q, c39031dM124461g, c39967p3, c15655p)), c28655q, 384);
            }
            c28655q.m87173q(false);
            Set set = (Set) interfaceC28601c1M87261o2.getValue();
            boolean zM87153g2 = c28655q.m87153g(interfaceC28601c1M87261o2) | ((i14 & 14) == 4);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87153g2 || objM87133R4 == obj2) {
                objM87133R4 = new C15652m(interfaceC28601c1M87261o2, c15656q, c39967p3, null);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87254h(set, c39967p3, (InterfaceC4351m) objM87133R4, c28655q);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2312r(c15656q, i13, 5);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m5385b(List list, Collection collection, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1537894851);
        if ((((c28655q.m87157i(list) ? 4 : 2) | i13 | (c28655q.m87157i(collection) ? 32 : 16)) & 19) == 18 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            boolean zBooleanValue = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                C12982q c12982q = (C12982q) it.next();
                C1593i0 c1593i0 = c12982q.f44837H;
                boolean zM87155h = c28655q.m87155h(zBooleanValue) | c28655q.m87157i(list) | c28655q.m87157i(c12982q);
                Object objM87133R = c28655q.m87133R();
                if (zM87155h || objM87133R == C28635l.f115821a) {
                    objM87133R = new C15654o(c12982q, list, zBooleanValue);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28683x.m87251e(c1593i0, (Function1) objM87133R, c28655q);
            }
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3974q(list, collection, i13, 2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m5386c(boolean z4, InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-642000585);
        int i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13 | (c28655q.m87157i(interfaceC4351m) ? 32 : 16);
        if ((i14 & 19) == 18 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(interfaceC4351m, c28655q);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                C28592a0 c28592a0 = new C28592a0(AbstractC28683x.m87262p(c28655q));
                c28655q.m87172p0(c28592a0);
                objM87133R = c28592a0;
            }
            InterfaceC2994c0 interfaceC2994c0 = ((C28592a0) objM87133R).f115706w;
            Object objM87133R2 = c28655q.m87133R();
            Object obj = objM87133R2;
            if (objM87133R2 == c28676v0) {
                InterfaceC4351m interfaceC4351m2 = (InterfaceC4351m) interfaceC28601c1M87238F.getValue();
                C16353k c16353k = new C16353k(z4);
                c16353k.f62869d = interfaceC2994c0;
                c16353k.f62870e = interfaceC4351m2;
                c28655q.m87172p0(c16353k);
                obj = c16353k;
            }
            C16353k c16353k2 = (C16353k) obj;
            boolean zM87153g = c28655q.m87153g((InterfaceC4351m) interfaceC28601c1M87238F.getValue()) | c28655q.m87153g(interfaceC2994c0);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87153g || objM87133R3 == c28676v0) {
                c16353k2.f62870e = (InterfaceC4351m) interfaceC28601c1M87238F.getValue();
                c16353k2.f62869d = interfaceC2994c0;
                c28655q.m87172p0(C23454a0.f92919a);
            }
            Boolean boolValueOf = Boolean.valueOf(z4);
            boolean zM87157i = ((i14 & 14) == 4) | c28655q.m87157i(c16353k2);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i || objM87133R4 == c28676v0) {
                objM87133R4 = new C16354l(c16353k2, z4, null);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, boolValueOf);
            InterfaceC14897b0 interfaceC14897b0M46561a = AbstractC16350h.m46561a(c28655q);
            if (interfaceC14897b0M46561a == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            C14923z onBackPressedDispatcher = interfaceC14897b0M46561a.getOnBackPressedDispatcher();
            InterfaceC1585g0 interfaceC1585g0 = (InterfaceC1585g0) c28655q.m87161k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zM87157i2 = c28655q.m87157i(onBackPressedDispatcher) | c28655q.m87157i(interfaceC1585g0) | c28655q.m87157i(c16353k2);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i2 || objM87133R5 == c28676v0) {
                objM87133R5 = new C3743h(onBackPressedDispatcher, interfaceC1585g0, c16353k2, 2);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC28683x.m87250d(interfaceC1585g0, onBackPressedDispatcher, (Function1) objM87133R5, c28655q);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16355m(z4, interfaceC4351m, i13);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final Object[] m5387d(Object[] objArr, int i13, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        AbstractC25260n.m74068i0(0, i13, 6, objArr, objArr2);
        AbstractC25260n.m74062d0(i13 + 2, i13, objArr.length, objArr, objArr2);
        objArr2[i13] = obj;
        objArr2[i13 + 1] = obj2;
        return objArr2;
    }

    /* JADX INFO: renamed from: e */
    public static final Object[] m5388e(int i13, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        AbstractC25260n.m74068i0(0, i13, 6, objArr, objArr2);
        AbstractC25260n.m74062d0(i13, i13 + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* JADX INFO: renamed from: f */
    public static final Object[] m5389f(int i13, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC25260n.m74068i0(0, i13, 6, objArr, objArr2);
        AbstractC25260n.m74062d0(i13, i13 + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* JADX INFO: renamed from: g */
    public static final void m5390g(InterfaceC27623n interfaceC27623n, InterfaceC27623n builder) {
        AbstractC22676k.m65750j(interfaceC27623n, "<this>");
        AbstractC22676k.m65750j(builder, "builder");
        for (Map.Entry entry : builder.mo2319b()) {
            interfaceC27623n.mo2297E((String) entry.getKey(), (List) entry.getValue());
        }
    }

    /* JADX INFO: renamed from: i */
    public static Modifier m5391i(Modifier clickableWithEffect, boolean z4, C18027i c18027i, InterfaceC4339a onClick, int i13) {
        if ((i13 & 1) != 0) {
            z4 = true;
        }
        if ((i13 & 2) != 0) {
            c18027i = null;
        }
        AbstractC22676k.m65750j(clickableWithEffect, "$this$clickableWithEffect");
        AbstractC22676k.m65750j(onClick, "onClick");
        return AbstractC37056f.m118997u(clickableWithEffect, new C0000a(c18027i, z4, onClick));
    }

    /* JADX INFO: renamed from: j */
    public static Type m5392j(Type type) {
        if (!Collection.class.isAssignableFrom(Collection.class)) {
            throw new IllegalArgumentException();
        }
        Type typeM99131i = AbstractC31885f.m99131i(type, Collection.class, AbstractC31885f.m99126d(type, Collection.class, Collection.class), new LinkedHashSet());
        if (typeM99131i instanceof WildcardType) {
            typeM99131i = ((WildcardType) typeM99131i).getUpperBounds()[0];
        }
        return typeM99131i instanceof ParameterizedType ? ((ParameterizedType) typeM99131i).getActualTypeArguments()[0] : Object.class;
    }

    /* JADX INFO: renamed from: k */
    public static final double m5393k(int i13, int i14, int i15, int i16, EnumC26713g enumC26713g) {
        double d3 = ((double) i15) / ((double) i13);
        double d14 = ((double) i16) / ((double) i14);
        int iOrdinal = enumC26713g.ordinal();
        if (iOrdinal == 0) {
            return Math.max(d3, d14);
        }
        if (iOrdinal == 1) {
            return Math.min(d3, d14);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: l */
    public static AbstractC0954a m5394l(int i13, String str) throws JSONException {
        EnumC27986c enumC27986c = EnumC27986c.SUCCESS;
        C18284j c18284j = enumC27986c.f112883w;
        int i14 = c18284j.f71133w;
        if (i13 <= c18284j.f71134x && i14 <= i13) {
            return new C27988e(enumC27986c, 4);
        }
        C18284j c18284j2 = EnumC27986c.BAD_REQUEST.f112883w;
        int i15 = c18284j2.f71133w;
        if (i13 <= c18284j2.f71134x && i15 <= i13) {
            return new C27984a(new JSONObject(str));
        }
        C18284j c18284j3 = EnumC27986c.PAYLOAD_TOO_LARGE.f112883w;
        int i16 = c18284j3.f71133w;
        if (i13 <= c18284j3.f71134x && i16 <= i13) {
            return new C27987d(new JSONObject(str));
        }
        C18284j c18284j4 = EnumC27986c.TOO_MANY_REQUESTS.f112883w;
        int i17 = c18284j4.f71133w;
        if (i13 <= c18284j4.f71134x && i17 <= i13) {
            return new C27990g(new JSONObject(str));
        }
        C18284j c18284j5 = EnumC27986c.TIMEOUT.f112883w;
        int i18 = c18284j5.f71133w;
        if (i13 <= c18284j5.f71134x && i18 <= i13) {
            return new C27989f();
        }
        JSONObject jSONObject = new JSONObject();
        if (str != null && str.length() != 0) {
            try {
                jSONObject = new JSONObject(str);
            } catch (Exception unused) {
                jSONObject.put("error", str);
            }
        }
        return new C27985b(jSONObject);
    }

    /* JADX INFO: renamed from: m */
    public static InterfaceC22712o m5395m(String debugName, Iterable iterable) {
        C22711n c22711n;
        AbstractC22676k.m65750j(debugName, "debugName");
        C34752f c34752f = new C34752f();
        Iterator it = iterable.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c22711n = C22711n.f89378b;
            if (!zHasNext) {
                break;
            }
            InterfaceC22712o interfaceC22712o = (InterfaceC22712o) it.next();
            if (interfaceC22712o != c22711n) {
                if (interfaceC22712o instanceof C22699b) {
                    AbstractC25265s.m74139o0(c34752f, ((C22699b) interfaceC22712o).f89347c);
                } else {
                    c34752f.add(interfaceC22712o);
                }
            }
        }
        int i13 = c34752f.f146406w;
        if (i13 != 0) {
            return i13 != 1 ? new C22699b(debugName, (InterfaceC22712o[]) c34752f.toArray(new InterfaceC22712o[0])) : (InterfaceC22712o) c34752f.get(0);
        }
        return c22711n;
    }

    /* JADX INFO: renamed from: n */
    public static final void m5396n(File file) throws IOException {
        if (file.exists() || file.mkdirs() || file.isDirectory()) {
            return;
        }
        throw new IOException("Could not create directory at " + file);
    }

    /* JADX INFO: renamed from: o */
    public static final void m5397o(C23286w c23286w, InterfaceC17915v interfaceC17915v, AbstractC17911t abstractC17911t, float f13, C17924z0 c17924z0, C36776l c36776l, AbstractC22132f abstractC22132f) {
        ArrayList arrayList = c23286w.f92265h;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            C23290y c23290y = (C23290y) arrayList.get(i13);
            c23290y.f92270a.m67295g(interfaceC17915v, abstractC17911t, f13, c17924z0, c36776l, abstractC22132f);
            interfaceC17915v.mo51416f(0.0f, c23290y.f92270a.m67290b());
        }
    }

    /* JADX INFO: renamed from: p */
    public static boolean m5398p(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type2 instanceof GenericArrayType ? m5398p(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType()) : type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return m5398p(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType instanceof C31882d ? ((C31882d) parameterizedType).f132382y : parameterizedType.getActualTypeArguments(), parameterizedType2 instanceof C31882d ? ((C31882d) parameterizedType2).f132382y : parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return m5398p(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (type2 instanceof GenericArrayType) {
                return m5398p(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* JADX INFO: renamed from: q */
    public static String m5399q(String str) {
        if (!str.contains("@")) {
            return str;
        }
        if (str.startsWith("@")) {
            return "[Filtered]".concat(str);
        }
        StringBuilder sbM53374o = AbstractC18489d0.m53374o(str.substring(0, str.indexOf(64)).contains(":") ? "[Filtered]:[Filtered]" : "[Filtered]");
        sbM53374o.append(str.substring(str.indexOf(64)));
        return sbM53374o.toString();
    }

    /* JADX INFO: renamed from: r */
    public static final ArrayList m5400r(InterfaceC27622m interfaceC27622m) {
        AbstractC22676k.m65750j(interfaceC27622m, "<this>");
        Set<Map.Entry> setMo52165b = interfaceC27622m.mo52165b();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setMo52165b) {
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(new C23465k(entry.getKey(), (String) it.next()));
            }
            AbstractC25265s.m74141p0(arrayList, arrayList2);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s */
    public static AbstractC12958g1 m5401s(String str, String str2) {
        if ("integer".equals(str)) {
            return AbstractC12958g1.f44757b;
        }
        if ("integer[]".equals(str)) {
            return AbstractC12958g1.f44759d;
        }
        if ("List<Int>".equals(str)) {
            return AbstractC12958g1.f44760e;
        }
        if ("long".equals(str)) {
            return AbstractC12958g1.f44761f;
        }
        if ("long[]".equals(str)) {
            return AbstractC12958g1.f44762g;
        }
        if ("List<Long>".equals(str)) {
            return AbstractC12958g1.f44763h;
        }
        if ("boolean".equals(str)) {
            return AbstractC12958g1.f44767l;
        }
        if ("boolean[]".equals(str)) {
            return AbstractC12958g1.f44768m;
        }
        if ("List<Boolean>".equals(str)) {
            return AbstractC12958g1.f44769n;
        }
        if (!"string".equals(str)) {
            if ("string[]".equals(str)) {
                return AbstractC12958g1.f44771p;
            }
            if ("List<String>".equals(str)) {
                return AbstractC12958g1.f44772q;
            }
            if ("float".equals(str)) {
                return AbstractC12958g1.f44764i;
            }
            if ("float[]".equals(str)) {
                return AbstractC12958g1.f44765j;
            }
            if ("List<Float>".equals(str)) {
                return AbstractC12958g1.f44766k;
            }
            if ("reference".equals(str)) {
                return AbstractC12958g1.f44758c;
            }
            if (str != null && str.length() != 0) {
                try {
                    String strConcat = (!AbstractC39421y.m125930O(str, ".", false) || str2 == null) ? str : str2.concat(str);
                    boolean zM125920E = AbstractC39421y.m125920E(str, "[]", false);
                    if (zM125920E) {
                        strConcat = strConcat.substring(0, strConcat.length() - 2);
                        AbstractC22676k.m65749i(strConcat, "substring(...)");
                    }
                    AbstractC12958g1 abstractC12958g1M5374K = m5374K(Class.forName(strConcat), zM125920E);
                    if (abstractC12958g1M5374K != null) {
                        return abstractC12958g1M5374K;
                    }
                    throw new IllegalArgumentException((strConcat + " is not Serializable or Parcelable.").toString());
                } catch (ClassNotFoundException e5) {
                    throw new RuntimeException(e5);
                }
            }
        }
        return AbstractC12958g1.f44770o;
    }

    /* JADX INFO: renamed from: t */
    public static final InterfaceC14897b0 m5402t(View view) {
        AbstractC22676k.m65750j(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
            InterfaceC14897b0 interfaceC14897b0 = tag instanceof InterfaceC14897b0 ? (InterfaceC14897b0) tag : null;
            if (interfaceC14897b0 != null) {
                return interfaceC14897b0;
            }
            Object objM34601v = AbstractC12350b.m34601v(view);
            view = objM34601v instanceof View ? (View) objM34601v : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static C34818h0 m5403u(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        C39410n c39410nM125849c = C34818h0.f146589e.m125849c(0, str);
        if (c39410nM125849c == null) {
            throw new IllegalArgumentException(AbstractC31061c.m95633i('\"', "No subtype found for: \"", str));
        }
        String str2 = (String) ((C39408l) c39410nM125849c.m125843a()).get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        String lowerCase2 = ((String) ((C39408l) c39410nM125849c.m125843a()).get(2)).toLowerCase(locale);
        AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
        ArrayList arrayList = new ArrayList();
        int i13 = c39410nM125849c.m125844b().f71134x;
        while (true) {
            int i14 = i13 + 1;
            if (i14 >= str.length()) {
                return new C34818h0(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            C39410n c39410nM125849c2 = C34818h0.f146590f.m125849c(i14, str);
            if (c39410nM125849c2 == null) {
                StringBuilder sb4 = new StringBuilder("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(i14);
                AbstractC22676k.m65749i(strSubstring, "substring(...)");
                sb4.append(strSubstring);
                sb4.append("\" for: \"");
                throw new IllegalArgumentException(AbstractC25012a.m73377j(sb4, str, '\"').toString());
            }
            C39409m c39409m = c39410nM125849c2.f169585c;
            C39406j c39406jM125842c = c39409m.m125842c(1);
            String str3 = c39406jM125842c != null ? c39406jM125842c.f169579a : null;
            if (str3 == null) {
                i13 = c39410nM125849c2.m125844b().f71134x;
            } else {
                C39406j c39406jM125842c2 = c39409m.m125842c(2);
                String strSubstring2 = c39406jM125842c2 != null ? c39406jM125842c2.f169579a : null;
                if (strSubstring2 == null) {
                    C39406j c39406jM125842c3 = c39409m.m125842c(3);
                    AbstractC22676k.m65747g(c39406jM125842c3);
                    strSubstring2 = c39406jM125842c3.f169579a;
                } else if (AbstractC39414r.m125907z0(strSubstring2, '\'') && AbstractC39414r.m125881Z(strSubstring2, '\'') && strSubstring2.length() > 2) {
                    strSubstring2 = strSubstring2.substring(1, strSubstring2.length() - 1);
                    AbstractC22676k.m65749i(strSubstring2, "substring(...)");
                }
                arrayList.add(str3);
                arrayList.add(strSubstring2);
                i13 = c39410nM125849c2.m125844b().f71134x;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public static final String m5404v(C18187z c18187z) {
        AbstractC22676k.m65750j(c18187z, "<this>");
        StringBuilder sb4 = new StringBuilder();
        StringBuilder sb5 = new StringBuilder();
        String str = c18187z.f70538e;
        String str2 = c18187z.f70539f;
        if (str != null) {
            sb5.append(str);
            if (str2 != null) {
                sb5.append(':');
                sb5.append(str2);
            }
            sb5.append("@");
        }
        String string = sb5.toString();
        AbstractC22676k.m65749i(string, "StringBuilder().apply(builderAction).toString()");
        sb4.append(string);
        sb4.append(c18187z.f70535b);
        int i13 = c18187z.f70536c;
        if (i13 != 0 && i13 != c18187z.f70534a.f70473b) {
            sb4.append(":");
            sb4.append(String.valueOf(c18187z.f70536c));
        }
        String string2 = sb4.toString();
        AbstractC22676k.m65749i(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    /* JADX INFO: renamed from: w */
    public static final String m5405w(C18187z c18187z) {
        List list = c18187z.f70541h;
        if (list.isEmpty()) {
            return "";
        }
        if (list.size() == 1) {
            return ((CharSequence) AbstractC25265s.m74096F0(list)).length() == 0 ? "/" : (String) AbstractC25265s.m74096F0(list);
        }
        return AbstractC25265s.m74110N0(list, "/", null, null, null, 62);
    }

    /* JADX INFO: renamed from: x */
    public static Set m5406x() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    /* JADX INFO: renamed from: z */
    public static Class m5407z(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) m5407z(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m5407z(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* JADX INFO: renamed from: A */
    public abstract int mo5408A();

    /* JADX INFO: renamed from: C */
    public abstract boolean mo5409C();

    /* JADX INFO: renamed from: D */
    public abstract boolean mo5410D();

    /* JADX INFO: renamed from: h */
    public abstract List mo5411h(String str, List list);

    /* JADX INFO: renamed from: y */
    public abstract byte[] mo5412y();
}
