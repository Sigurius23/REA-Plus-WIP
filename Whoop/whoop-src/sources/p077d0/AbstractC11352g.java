package p077d0;

import a11.C0134l;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import dc3.InterfaceC11927l;
import p007a6.C0419f;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p636y3.C39174f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: d0.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11352g {

    /* JADX INFO: renamed from: a */
    public static final C11362i1 f36398a = AbstractC11348f.m30573u(0.0f, 0.0f, 7, null);

    /* JADX INFO: renamed from: b */
    public static final C11362i1 f36399b;

    /* JADX INFO: renamed from: c */
    public static final C11362i1 f36400c;

    static {
        Object obj = AbstractC11391p2.f36529a;
        f36399b = AbstractC11348f.m30573u(0.0f, 0.0f, 3, new C39174f(0.1f));
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        f36400c = AbstractC11348f.m30573u(0.0f, 0.0f, 3, 1);
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC28670t2 m30587a(float f13, InterfaceC11372l interfaceC11372l, String str, Composer composer, int i13, int i14) {
        if ((i14 & 2) != 0) {
            interfaceC11372l = f36399b;
        }
        InterfaceC11372l interfaceC11372l2 = interfaceC11372l;
        if ((i14 & 4) != 0) {
            str = "DpAnimation";
        }
        return m30590d(new C39174f(f13), AbstractC11348f.f36369k, interfaceC11372l2, null, str, null, composer, ((i13 << 3) & 896) | ((i13 << 6) & 57344), 8);
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC28670t2 m30588b(float f13, InterfaceC11372l interfaceC11372l, String str, Function1 function1, Composer composer, int i13, int i14) {
        InterfaceC11372l interfaceC11372l2;
        int i15 = i14 & 2;
        C11362i1 c11362i1 = f36398a;
        if (i15 != 0) {
            interfaceC11372l = c11362i1;
        }
        if ((i14 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        Function1 function2 = (i14 & 16) != 0 ? null : function1;
        if (interfaceC11372l == c11362i1) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(1144108831);
            boolean z4 = (((i13 & 896) ^ 384) > 256 && c28655q.m87147d(0.01f)) || (i13 & 384) == 256;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = AbstractC11348f.m30573u(0.0f, 0.0f, 3, Float.valueOf(0.01f));
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            interfaceC11372l2 = (C11362i1) objM87133R;
        } else {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(1144218757);
            c28655q2.m87173q(false);
            interfaceC11372l2 = interfaceC11372l;
        }
        int i16 = i13 << 3;
        return m30590d(Float.valueOf(f13), AbstractC11348f.f36367i, interfaceC11372l2, Float.valueOf(0.01f), str2, function2, composer, (i13 & 14) | (i16 & 7168) | (57344 & i16) | (i16 & 458752), 0);
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC28670t2 m30589c(int i13, C28655q c28655q) {
        return m30590d(Integer.valueOf(i13), AbstractC11348f.f36368j, f36400c, null, "", null, c28655q, 24576, 8);
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC28670t2 m30590d(Object obj, C11351f2 c11351f2, InterfaceC11372l interfaceC11372l, Float f13, String str, Function1 function1, Composer composer, int i13, int i14) {
        if ((i14 & 8) != 0) {
            f13 = null;
        }
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = AbstractC28683x.m87272z(null);
            c28655q.m87172p0(objM87133R);
        }
        InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
        Object objM87133R2 = c28655q.m87133R();
        if (objM87133R2 == c28676v0) {
            objM87133R2 = new C11344e(obj, c11351f2, f13);
            c28655q.m87172p0(objM87133R2);
        }
        C11344e c11344e = (C11344e) objM87133R2;
        InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(function1, c28655q);
        if (f13 != null && (interfaceC11372l instanceof C11362i1)) {
            C11362i1 c11362i1 = (C11362i1) interfaceC11372l;
            if (!AbstractC22676k.m65745e(c11362i1.f36422c, f13)) {
                interfaceC11372l = new C11362i1(c11362i1.f36420a, c11362i1.f36421b, f13);
            }
        }
        InterfaceC28601c1 interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(interfaceC11372l, c28655q);
        Object objM87133R3 = c28655q.m87133R();
        if (objM87133R3 == c28676v0) {
            objM87133R3 = AbstractC30060g.m92111d(-1, 6, null);
            c28655q.m87172p0(objM87133R3);
        }
        InterfaceC11927l interfaceC11927l = (InterfaceC11927l) objM87133R3;
        boolean zM87157i = c28655q.m87157i(interfaceC11927l) | ((((i13 & 14) ^ 6) > 4 && c28655q.m87157i(obj)) || (i13 & 6) == 4);
        Object objM87133R4 = c28655q.m87133R();
        if (zM87157i || objM87133R4 == c28676v0) {
            objM87133R4 = new C0134l(14, interfaceC11927l, obj);
            c28655q.m87172p0(objM87133R4);
        }
        AbstractC28683x.m87257k((InterfaceC4339a) objM87133R4, c28655q);
        boolean zM87157i2 = c28655q.m87157i(interfaceC11927l) | c28655q.m87157i(c11344e) | c28655q.m87153g(interfaceC28601c1M87238F2) | c28655q.m87153g(interfaceC28601c1M87238F);
        Object objM87133R5 = c28655q.m87133R();
        if (zM87157i2 || objM87133R5 == c28676v0) {
            C0419f c0419f = new C0419f(interfaceC11927l, c11344e, interfaceC28601c1M87238F2, interfaceC28601c1M87238F, null);
            c28655q.m87172p0(c0419f);
            objM87133R5 = c0419f;
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, interfaceC11927l);
        InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) interfaceC28601c1.getValue();
        return interfaceC28670t2 == null ? c11344e.f36343c : interfaceC28670t2;
    }
}
