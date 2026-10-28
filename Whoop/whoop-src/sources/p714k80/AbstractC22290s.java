package p714k80;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.sentry.config.AbstractC20301a;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import jx2.C22038b;
import k71.C22241a0;
import l83.C23454a0;
import p027b3.C2463x1;
import p027b3.InterfaceC2464x2;
import p291l0.C22937b;
import p291l0.C22944c2;
import p291l0.C22949e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28670t2;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: k80.s */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"", "i", "(Ljava/lang/String;)Ljava/lang/String;", "Lp1/t2;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/runtime/Composer;I)Lp1/t2;", "g", "(Landroidx/compose/runtime/Composer;I)Z", "keyboardVisible", "Lb3/x2;", "keyboardController", "Ll83/a0;", "f", "(ZLb3/x2;)V", "c", "(Landroidx/compose/runtime/Composer;I)V", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22290s {
    /* JADX INFO: renamed from: c */
    public static final void m64039c(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1579943996);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C22038b(13);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q, 48, 1);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22241a0(i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m64040d() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m64041e(int i13, Composer composer, int i14) {
        m64039c(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    public static final void m64042f(boolean z4, InterfaceC2464x2 interfaceC2464x2) {
        if (!z4 || interfaceC2464x2 == null) {
            return;
        }
        ((C2463x1) interfaceC2464x2).m7442a();
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m64043g(Composer composer, int i13) {
        WeakHashMap weakHashMap = C22944c2.f90553v;
        return ((Boolean) C22949e.m66712e(composer).f90556c.f90544d.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: h */
    public static final InterfaceC28670t2 m64044h(Composer composer, int i13) {
        WeakHashMap weakHashMap = C22944c2.f90553v;
        C22937b c22937b = C22949e.m66712e(composer).f90556c;
        C28655q c28655q = (C28655q) composer;
        return AbstractC28683x.m87238F(Boolean.valueOf(c22937b.m66705e().f151452d > 0), c28655q);
    }

    /* JADX INFO: renamed from: i */
    public static final String m64045i(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        Pattern patternCompile = Pattern.compile("\\s");
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(str).replaceAll("");
        AbstractC22676k.m65749i(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }
}
