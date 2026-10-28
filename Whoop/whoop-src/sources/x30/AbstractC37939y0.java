package x30;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.navigation.AppScreen;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p027b3.AbstractC2453v1;
import p027b3.InterfaceC2355b3;
import p163g1.AbstractC15011f9;
import p294l3.C23246c;
import p294l3.C23254g;
import p294l3.C23271o0;
import p294l3.C23285v0;
import p33.C28820m;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p512u2.C34450b0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q12.C29802c;
import q83.InterfaceC30057d;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: x30.y0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC37939y0 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f162417a;

    static {
        Pattern patternCompile = Pattern.compile("(https?://[a-z0-9.-]+\\.[a-z]{2,3}(?:/\\S*?(?=\\.*(?:\\s|$)))?)", 42);
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        f162417a = patternCompile;
    }

    /* JADX INFO: renamed from: a */
    public static final void m121487a(final String str, final Modifier modifier, final long j7, final C23285v0 c23285v0, Composer composer, final int i13) {
        C28655q c28655q;
        String text = str;
        AbstractC22676k.m65750j(text, "text");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1671475014);
        int i14 = (i13 & 6) == 0 ? (c28655q2.m87153g(text) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87153g(modifier) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87151f(j7) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87153g(c23285v0) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 1171) == 1170 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
        } else {
            c28655q2.m87140Z();
            if ((i13 & 1) != 0 && !c28655q2.m87118C()) {
                c28655q2.m87138X();
            }
            c28655q2.m87175r();
            InterfaceC2355b3 interfaceC2355b3 = (InterfaceC2355b3) c28655q2.m87161k(AbstractC2453v1.f9579r);
            c28655q2.m87150e0(-431032317);
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(null);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            c28655q2.m87173q(false);
            c28655q2.m87150e0(-431029084);
            int i15 = 1;
            boolean z4 = (i14 & 14) == 4;
            Object objM87133R2 = c28655q2.m87133R();
            if (z4 || objM87133R2 == c28676v0) {
                StringBuilder sb4 = new StringBuilder(16);
                new ArrayList();
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                sb4.append(text);
                Matcher matcher = f162417a.matcher(text);
                ArrayList<C37879c1> arrayList2 = new ArrayList();
                while (matcher.find()) {
                    StringBuilder sb5 = sb4;
                    int iStart = matcher.start(i15);
                    int iEnd = matcher.end();
                    String strSubstring = text.substring(iStart, iEnd);
                    AbstractC22676k.m65749i(strSubstring, "substring(...)");
                    if (!AbstractC39421y.m125930O(strSubstring, "http://", false) && !AbstractC39421y.m125930O(strSubstring, "https://", false)) {
                        strSubstring = "https://".concat(strSubstring);
                    }
                    arrayList2.add(new C37879c1(strSubstring, iStart, iEnd));
                    text = str;
                    sb4 = sb5;
                    i15 = 1;
                }
                StringBuilder sb6 = sb4;
                for (C37879c1 c37879c1 : arrayList2) {
                    arrayList.add(new C23246c(c37879c1.f162195b, c37879c1.f162196c, new C23271o0(c37879c1.f162194a), AppScreen.URLScreen.NAME));
                }
                String string = sb6.toString();
                ArrayList arrayList3 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i16 = 0; i16 < size; i16++) {
                    arrayList3.add(((C23246c) arrayList.get(i16)).m67297a(sb6.length()));
                }
                objM87133R2 = new C23254g(string, arrayList3);
                c28655q2.m87172p0(objM87133R2);
            }
            C23254g c23254g = (C23254g) objM87133R2;
            c28655q2.m87173q(false);
            c28655q2.m87150e0(-431014711);
            boolean zM87153g = c28655q2.m87153g(c23254g) | c28655q2.m87157i(interfaceC2355b3);
            Object objM87133R3 = c28655q2.m87133R();
            if (zM87153g || objM87133R3 == c28676v0) {
                C28820m c28820m = new C28820m(interfaceC28601c1, c23254g, interfaceC2355b3, (InterfaceC30057d) null, 11);
                c28655q2.m87172p0(c28820m);
                objM87133R3 = c28820m;
            }
            c28655q2.m87173q(false);
            Modifier modifierMo3471e = modifier.mo3471e(new SuspendPointerInputElement(C23454a0.f92919a, null, null, new C34450b0((InterfaceC4351m) objM87133R3), 6));
            c28655q2.m87150e0(-430997090);
            Object objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C29802c(29, interfaceC28601c1);
                c28655q2.m87172p0(objM87133R4);
            }
            c28655q2.m87173q(false);
            c28655q = c28655q2;
            AbstractC15011f9.m43115c(c23254g, modifierMo3471e, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (Function1) objM87133R4, c23285v0, c28655q, i14 & 896, ((i14 << 12) & 29360128) | 1572864, 65528);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: x30.x0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC37939y0.m121487a(str, modifier, j7, c23285v0, (Composer) obj, AbstractC28683x.m87244L(i13 | 1));
                    return C23454a0.f92919a;
                }
            };
        }
    }
}
