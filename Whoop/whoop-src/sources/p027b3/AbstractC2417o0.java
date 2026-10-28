package p027b3;

import android.R;
import android.content.res.Resources;
import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.compose.p018ui.platform.AndroidComposeView;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.EnumC1635w;
import e93.AbstractC12889b;
import i93.InterfaceC18280f;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l83.InterfaceC23459e;
import m83.AbstractC25265s;
import p002a0.C0057v0;
import p005a3.C0226m0;
import p005a3.C0230n0;
import p028b4.AbstractC2701l;
import p209i3.AbstractC18029k;
import p209i3.AbstractC18037s;
import p209i3.AbstractC18039u;
import p209i3.C18017a;
import p209i3.C18026h;
import p209i3.C18027i;
import p209i3.C18030l;
import p209i3.C18034p;
import p209i3.C18043y;
import p211i5.C18091d;
import p211i5.C18093f;
import p271k3.EnumC22167a;
import p294l3.C23254g;
import p294l3.C23277r0;
import p390p1.C28676v0;
import p668z1.InterfaceC39965n;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b3.o0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2417o0 {

    /* JADX INFO: renamed from: a */
    public static final Class[] f9474a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: a */
    public static final boolean m7409a(C18034p c18034p) {
        return !c18034p.m51786k().f69980w.m125c(AbstractC18039u.f70042i);
    }

    /* JADX INFO: renamed from: b */
    public static final C0226m0 m7410b(AbstractC2346a abstractC2346a, AbstractC1638x abstractC1638x) {
        if (abstractC1638x.getCurrentState().compareTo(EnumC1635w.f6325w) > 0) {
            C2390i3 c2390i3 = new C2390i3(abstractC2346a, 0);
            abstractC1638x.mo4986a(c2390i3);
            return new C0226m0(3, abstractC1638x, c2390i3);
        }
        throw new IllegalStateException(("Cannot configure " + abstractC2346a + " to disposeComposition at Lifecycle ON_DESTROY: " + abstractC1638x + "is already destroyed").toString());
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m7411c(C18034p c18034p, Resources resources) {
        Object objM129g = c18034p.f69989d.f69980w.m129g(AbstractC18039u.f70034a);
        if (objM129g == null) {
            objM129g = null;
        }
        List list = (List) objM129g;
        return !AbstractC18037s.m51800e(c18034p) && (c18034p.f69989d.f69982y || (c18034p.m51791p() && ((list != null ? (String) AbstractC25265s.m74100H0(list) : null) != null || m7418j(c18034p) != null || m7417i(c18034p, resources) != null || m7416h(c18034p))));
    }

    /* JADX INFO: renamed from: d */
    public static final void m7412d(C18034p c18034p, C18093f c18093f) {
        C18030l c18030l = c18034p.f69989d;
        C0057v0 c0057v0 = c18030l.f69980w;
        Object objM129g = c18030l.f69980w.m129g(AbstractC18039u.f70057x);
        if (objM129g == null) {
            objM129g = null;
        }
        C18027i c18027i = (C18027i) objM129g;
        if (m7409a(c18034p)) {
            if (c18027i != null && c18027i.f69949a == 8) {
                return;
            }
            Object objM129g2 = c0057v0.m129g(AbstractC18029k.f69977x);
            if (objM129g2 == null) {
                objM129g2 = null;
            }
            C18017a c18017a = (C18017a) objM129g2;
            if (c18017a != null) {
                c18093f.m51948b(new C18091d(R.id.accessibilityActionPageUp, c18017a.f69928a));
            }
            Object objM129g3 = c0057v0.m129g(AbstractC18029k.f69979z);
            if (objM129g3 == null) {
                objM129g3 = null;
            }
            C18017a c18017a2 = (C18017a) objM129g3;
            if (c18017a2 != null) {
                c18093f.m51948b(new C18091d(R.id.accessibilityActionPageDown, c18017a2.f69928a));
            }
            Object objM129g4 = c0057v0.m129g(AbstractC18029k.f69978y);
            if (objM129g4 == null) {
                objM129g4 = null;
            }
            C18017a c18017a3 = (C18017a) objM129g4;
            if (c18017a3 != null) {
                c18093f.m51948b(new C18091d(R.id.accessibilityActionPageLeft, c18017a3.f69928a));
            }
            Object objM129g5 = c0057v0.m129g(AbstractC18029k.f69952A);
            C18017a c18017a4 = (C18017a) (objM129g5 != null ? objM129g5 : null);
            if (c18017a4 != null) {
                c18093f.m51948b(new C18091d(R.id.accessibilityActionPageRight, c18017a4.f69928a));
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m7413e(Object obj) {
        if (obj instanceof InterfaceC39965n) {
            InterfaceC39965n interfaceC39965n = (InterfaceC39965n) obj;
            if (interfaceC39965n.mo87021h() == C28676v0.f115976y || interfaceC39965n.mo87021h() == C28676v0.f115974F || interfaceC39965n.mo87021h() == C28676v0.f115977z) {
                Object value = interfaceC39965n.getValue();
                if (value == null) {
                    return true;
                }
                return m7413e(value);
            }
        } else {
            if ((obj instanceof InterfaceC23459e) && (obj instanceof Serializable)) {
                return false;
            }
            for (int i13 = 0; i13 < 7; i13++) {
                if (f9474a[i13].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static final float m7414f(float[] fArr, int i13, float[] fArr2, int i14) {
        int i15 = i13 * 4;
        return (fArr[i15 + 3] * fArr2[12 + i14]) + (fArr[i15 + 2] * fArr2[8 + i14]) + (fArr[i15 + 1] * fArr2[4 + i14]) + (fArr[i15] * fArr2[i14]);
    }

    /* JADX INFO: renamed from: g */
    public static final C2454v2 m7415g(ArrayList arrayList, int i13) {
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            if (((C2454v2) arrayList.get(i14)).m7437a() == i13) {
                return (C2454v2) arrayList.get(i14);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m7416h(C18034p c18034p) {
        C18030l c18030l = c18034p.f69989d;
        C18043y c18043y = AbstractC18039u.f70034a;
        EnumC22167a enumC22167a = (EnumC22167a) AbstractC18037s.m51799d(c18030l, AbstractC18039u.f70027I);
        C18030l c18030l2 = c18034p.f69989d;
        C18027i c18027i = (C18027i) AbstractC18037s.m51799d(c18030l2, AbstractC18039u.f70057x);
        boolean z4 = enumC22167a != null;
        if (((Boolean) AbstractC18037s.m51799d(c18030l2, AbstractC18039u.f70026H)) == null) {
            return z4;
        }
        if (c18027i != null && c18027i.f69949a == 4) {
            return z4;
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public static final String m7417i(C18034p c18034p, Resources resources) {
        int iM36284n;
        C18030l c18030l = c18034p.f69989d;
        C18030l c18030l2 = c18034p.f69989d;
        Object objM129g = c18030l.f69980w.m129g(AbstractC18039u.f70035b);
        String string = null;
        if (objM129g == null) {
            objM129g = null;
        }
        C0057v0 c0057v0 = c18030l2.f69980w;
        Object objM129g2 = c0057v0.m129g(AbstractC18039u.f70027I);
        if (objM129g2 == null) {
            objM129g2 = null;
        }
        EnumC22167a enumC22167a = (EnumC22167a) objM129g2;
        Object objM129g3 = c0057v0.m129g(AbstractC18039u.f70057x);
        if (objM129g3 == null) {
            objM129g3 = null;
        }
        C18027i c18027i = (C18027i) objM129g3;
        if (enumC22167a != null) {
            int iOrdinal = enumC22167a.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (objM129g == null) {
                        objM129g = resources.getString(com.whoop.android.R.string.indeterminate);
                    }
                } else if (c18027i != null && c18027i.f69949a == 2 && objM129g == null) {
                    objM129g = resources.getString(com.whoop.android.R.string.state_off);
                }
            } else if (c18027i != null && c18027i.f69949a == 2 && objM129g == null) {
                objM129g = resources.getString(com.whoop.android.R.string.state_on);
            }
        }
        Object objM129g4 = c0057v0.m129g(AbstractC18039u.f70026H);
        if (objM129g4 == null) {
            objM129g4 = null;
        }
        Boolean bool = (Boolean) objM129g4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((c18027i == null || c18027i.f69949a != 4) && objM129g == null) {
                objM129g = zBooleanValue ? resources.getString(com.whoop.android.R.string.selected) : resources.getString(com.whoop.android.R.string.not_selected);
            }
        }
        Object objM129g5 = c0057v0.m129g(AbstractC18039u.f70036c);
        if (objM129g5 == null) {
            objM129g5 = null;
        }
        C18026h c18026h = (C18026h) objM129g5;
        if (c18026h != null) {
            if (c18026h != C18026h.f69945d) {
                if (objM129g == null) {
                    InterfaceC18280f interfaceC18280f = c18026h.f69947b;
                    float fFloatValue = ((Number) interfaceC18280f.mo52651d()).floatValue() - ((Number) interfaceC18280f.getStart()).floatValue() == 0.0f ? 0.0f : (c18026h.f69946a - ((Number) interfaceC18280f.getStart()).floatValue()) / (((Number) interfaceC18280f.mo52651d()).floatValue() - ((Number) interfaceC18280f.getStart()).floatValue());
                    if (fFloatValue < 0.0f) {
                        fFloatValue = 0.0f;
                    }
                    if (fFloatValue > 1.0f) {
                        fFloatValue = 1.0f;
                    }
                    if (fFloatValue == 0.0f) {
                        iM36284n = 0;
                    } else {
                        iM36284n = fFloatValue == 1.0f ? 100 : AbstractC12889b.m36284n(Math.round(fFloatValue * 100), 1, 99);
                    }
                    objM129g = resources.getString(com.whoop.android.R.string.template_percent, Integer.valueOf(iM36284n));
                }
            } else if (objM129g == null) {
                objM129g = resources.getString(com.whoop.android.R.string.in_progress);
            }
        }
        C18043y c18043y = AbstractC18039u.f70023E;
        if (c0057v0.m125c(c18043y)) {
            C0057v0 c0057v1 = new C18034p(c18034p.f69986a, true, c18034p.f69988c, c18030l2).m51786k().f69980w;
            Object objM129g6 = c0057v1.m129g(AbstractC18039u.f70034a);
            if (objM129g6 == null) {
                objM129g6 = null;
            }
            Collection collection = (Collection) objM129g6;
            if (collection == null || collection.isEmpty()) {
                Object objM129g7 = c0057v1.m129g(AbstractC18039u.f70019A);
                if (objM129g7 == null) {
                    objM129g7 = null;
                }
                Collection collection2 = (Collection) objM129g7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objM129g8 = c0057v1.m129g(c18043y);
                    if (objM129g8 == null) {
                        objM129g8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objM129g8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(com.whoop.android.R.string.state_empty);
                    }
                }
            }
            objM129g = string;
        }
        return (String) objM129g;
    }

    /* JADX INFO: renamed from: j */
    public static final C23254g m7418j(C18034p c18034p) {
        C18030l c18030l = c18034p.f69989d;
        C18043y c18043y = AbstractC18039u.f70034a;
        C23254g c23254g = (C23254g) AbstractC18037s.m51799d(c18030l, AbstractC18039u.f70023E);
        List list = (List) AbstractC18037s.m51799d(c18034p.f69989d, AbstractC18039u.f70019A);
        return c23254g == null ? list != null ? (C23254g) AbstractC25265s.m74100H0(list) : null : c23254g;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m7419k() {
        try {
            if (AndroidComposeView.f4886h1 == null) {
                AndroidComposeView.f4886h1 = Class.forName("android.os.SystemProperties");
            }
            if (AndroidComposeView.f4887i1 == null) {
                Class cls = AndroidComposeView.f4886h1;
                AndroidComposeView.f4887i1 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = AndroidComposeView.f4887i1;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return AbstractC22676k.m65745e(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l */
    public static final C23277r0 m7420l(C18030l c18030l) {
        Function1 function1;
        ArrayList arrayList = new ArrayList();
        Object objM129g = c18030l.f69980w.m129g(AbstractC18029k.f69954a);
        if (objM129g == null) {
            objM129g = null;
        }
        C18017a c18017a = (C18017a) objM129g;
        if (c18017a == null || (function1 = (Function1) c18017a.f69929b) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (C23277r0) arrayList.get(0);
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m7421m(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = fArr[2];
        float f16 = fArr[3];
        float f17 = fArr[4];
        float f18 = fArr[5];
        float f19 = fArr[6];
        float f24 = fArr[7];
        float f25 = fArr[8];
        float f26 = fArr[9];
        float f27 = fArr[10];
        float f28 = fArr[11];
        float f29 = fArr[12];
        float f34 = fArr[13];
        float f35 = fArr[14];
        float f36 = fArr[15];
        float f37 = (f13 * f18) - (f14 * f17);
        float f38 = (f13 * f19) - (f15 * f17);
        float f39 = (f13 * f24) - (f16 * f17);
        float f43 = (f14 * f19) - (f15 * f18);
        float f44 = (f14 * f24) - (f16 * f18);
        float f45 = (f15 * f24) - (f16 * f19);
        float f46 = (f25 * f34) - (f26 * f29);
        float f47 = (f25 * f35) - (f27 * f29);
        float f48 = (f25 * f36) - (f28 * f29);
        float f49 = (f26 * f35) - (f27 * f34);
        float f54 = (f26 * f36) - (f28 * f34);
        float f55 = (f27 * f36) - (f28 * f35);
        float f56 = (f45 * f46) + (((f43 * f48) + ((f39 * f49) + ((f37 * f55) - (f38 * f54)))) - (f44 * f47));
        if (f56 != 0.0f) {
            float f57 = 1.0f / f56;
            fArr2[0] = ((f24 * f49) + ((f18 * f55) - (f19 * f54))) * f57;
            fArr2[1] = (((f15 * f54) + ((-f14) * f55)) - (f16 * f49)) * f57;
            fArr2[2] = ((f36 * f43) + ((f34 * f45) - (f35 * f44))) * f57;
            fArr2[3] = (((f27 * f44) + ((-f26) * f45)) - (f28 * f43)) * f57;
            float f58 = -f17;
            fArr2[4] = (((f19 * f48) + (f58 * f55)) - (f24 * f47)) * f57;
            fArr2[5] = ((f16 * f47) + ((f55 * f13) - (f15 * f48))) * f57;
            float f59 = -f29;
            fArr2[6] = (((f35 * f39) + (f59 * f45)) - (f36 * f38)) * f57;
            fArr2[7] = ((f28 * f38) + ((f45 * f25) - (f27 * f39))) * f57;
            fArr2[8] = ((f24 * f46) + ((f17 * f54) - (f18 * f48))) * f57;
            fArr2[9] = (((f48 * f14) + ((-f13) * f54)) - (f16 * f46)) * f57;
            fArr2[10] = ((f36 * f37) + ((f29 * f44) - (f34 * f39))) * f57;
            fArr2[11] = (((f39 * f26) + ((-f25) * f44)) - (f28 * f37)) * f57;
            fArr2[12] = (((f18 * f47) + (f58 * f49)) - (f19 * f46)) * f57;
            fArr2[13] = ((f15 * f46) + ((f13 * f49) - (f14 * f47))) * f57;
            fArr2[14] = (((f34 * f38) + (f59 * f43)) - (f35 * f37)) * f57;
            fArr2[15] = ((f27 * f37) + ((f25 * f43) - (f26 * f38))) * f57;
        }
        return !(f56 == 0.0f);
    }

    /* JADX INFO: renamed from: n */
    public static final void m7422n(float[] fArr, float[] fArr2) {
        float fM7414f = m7414f(fArr2, 0, fArr, 0);
        float fM7414f2 = m7414f(fArr2, 0, fArr, 1);
        float fM7414f3 = m7414f(fArr2, 0, fArr, 2);
        float fM7414f4 = m7414f(fArr2, 0, fArr, 3);
        float fM7414f5 = m7414f(fArr2, 1, fArr, 0);
        float fM7414f6 = m7414f(fArr2, 1, fArr, 1);
        float fM7414f7 = m7414f(fArr2, 1, fArr, 2);
        float fM7414f8 = m7414f(fArr2, 1, fArr, 3);
        float fM7414f9 = m7414f(fArr2, 2, fArr, 0);
        float fM7414f10 = m7414f(fArr2, 2, fArr, 1);
        float fM7414f11 = m7414f(fArr2, 2, fArr, 2);
        float fM7414f12 = m7414f(fArr2, 2, fArr, 3);
        float fM7414f13 = m7414f(fArr2, 3, fArr, 0);
        float fM7414f14 = m7414f(fArr2, 3, fArr, 1);
        float fM7414f15 = m7414f(fArr2, 3, fArr, 2);
        float fM7414f16 = m7414f(fArr2, 3, fArr, 3);
        fArr[0] = fM7414f;
        fArr[1] = fM7414f2;
        fArr[2] = fM7414f3;
        fArr[3] = fM7414f4;
        fArr[4] = fM7414f5;
        fArr[5] = fM7414f6;
        fArr[6] = fM7414f7;
        fArr[7] = fM7414f8;
        fArr[8] = fM7414f9;
        fArr[9] = fM7414f10;
        fArr[10] = fM7414f11;
        fArr[11] = fM7414f12;
        fArr[12] = fM7414f13;
        fArr[13] = fM7414f14;
        fArr[14] = fM7414f15;
        fArr[15] = fM7414f16;
    }

    /* JADX INFO: renamed from: o */
    public static final AbstractC2701l m7423o(C2383h1 c2383h1, int i13) {
        Object next;
        Iterator<T> it = c2383h1.getLayoutNodeToHolder().entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C0230n0) ((Map.Entry) next).getKey()).f795x != i13);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (AbstractC2701l) entry.getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static final String m7424p(int i13) {
        if (i13 == 0) {
            return "android.widget.Button";
        }
        if (i13 == 1) {
            return "android.widget.CheckBox";
        }
        if (i13 == 3) {
            return "android.widget.RadioButton";
        }
        if (i13 == 5) {
            return "android.widget.ImageView";
        }
        if (i13 == 6) {
            return "android.widget.Spinner";
        }
        if (i13 == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
