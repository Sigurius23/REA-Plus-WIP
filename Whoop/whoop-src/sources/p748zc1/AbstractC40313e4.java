package p748zc1;

import a81.C0556g;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22399k;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15011f9;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.InterfaceC22997s1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p579wc.C37082e1;
import p602x1.AbstractC37817c;
import p700bd1.AbstractC3087e;
import p700bd1.AbstractC42782p;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.Function1;
import p720m91.InterfaceC25312u;
import p745y81.AbstractC39330c;
import pz0.AbstractC29641d;
import vl0.C36100c;
import vv2.C36537c;
import w71.AbstractC36877d;
import w71.C36873b;
import wb3.AbstractC37056f;
import x30.C37900j1;
import x81.C38072d;
import yw1.C39818e;

/* JADX INFO: renamed from: zc1.e4 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a5\u0010\t\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00000\u0007H\u0003¢\u0006\u0004\b\t\u0010\n\"\u001a\u0010\u0010\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Ll83/a0;", "j", "(Landroidx/compose/runtime/Composer;I)V", "", "title", "Li2/x;", "color", "Lkotlin/Function1;", "onColorSelected", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;Li2/x;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lm91/p;", "a", "Lm91/p;", "q", "()Lm91/p;", "journalGalleryItems", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40313e4 {

    /* JADX INFO: renamed from: a */
    private static final C25307p f174238a = Function1.m74307h(null, 1, null);

    /* JADX INFO: renamed from: zc1.e4$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC28601c1 f174239w;

        public a(InterfaceC28601c1 interfaceC28601c1) {
            this.f174239w = interfaceC28601c1;
        }

        /* JADX INFO: renamed from: a */
        public final void m129654a(long j7) {
            this.f174239w.setValue(new C17919x(j7));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            m129654a(((C17919x) obj).f69639a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zc1.e4$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC28601c1 f174240w;

        public b(InterfaceC28601c1 interfaceC28601c1) {
            this.f174240w = interfaceC28601c1;
        }

        /* JADX INFO: renamed from: a */
        public final void m129655a(long j7) {
            this.f174240w.setValue(new C17919x(j7));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            m129655a(((C17919x) obj).f69639a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: h */
    private static final void m129644h(String str, C17919x c17919x, p715kotlin.jvm.functions.Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1610913401);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(c17919x) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            List listM118959K = AbstractC37056f.m118959K(new C17919x(c38072d.m121949b(c28655q, i15).getBrandWhite()), new C17919x(c38072d.m121949b(c28655q, i15).getAccentAction()), new C17919x(c38072d.m121949b(c28655q, i15).getAccentAlert()), new C17919x(c38072d.m121949b(c28655q, i15).getSleepRemSleep()));
            AbstractC22399k.m64473c(str, c28655q, i14 & 14);
            AbstractC3087e.m8845b(listM118959K, c17919x, function1, c28655q, i14 & MessageListItemViewType.GIPHY, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36537c(str, c17919x, function1, i13, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m129645i(String str, C17919x c17919x, p715kotlin.jvm.functions.Function1 function1, int i13, Composer composer, int i14) {
        m129644h(str, c17919x, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    public static final void m129646j(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-706137316);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C40324f4();
                c28655q.m87172p0(objM87133R);
            }
            C40324f4 c40324f4 = (C40324f4) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(C40324f4.m129728n(c40324f4, false, 1, null));
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            long jM125400j = c38072d.m121949b(c28655q, i14).getAccentPositiveTrend();
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(new C17919x(jM125400j));
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
            long jM125430y = c38072d.m121949b(c28655q, i14).getBrandWhite();
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(new C17919x(jM125430y));
                c28655q.m87172p0(objM87133R4);
            }
            InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
            Object objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC39330c.m125320b(0L, 0L, ((C17919x) interfaceC28601c2.getValue()).f69639a, ((C17919x) interfaceC28601c3.getValue()).f69639a, AbstractC37817c.m121344e(-1931372203, c28655q, new C0556g(interfaceC28601c1, interfaceC28601c2, interfaceC28601c3, c40324f4, (InterfaceC28601c1) objM87133R5, 25)), c28655q, 24576, 3);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40461s3(i13, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m129647k(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, C40324f4 c40324f4, InterfaceC28601c1 interfaceC28601c4, Composer composer, int i13) {
        C28676v0 c28676v0;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 0.0f, 2 * 8, 1);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(1872022034);
            Iterator<T> it = ((C40335g4) interfaceC28601c1.getValue()).m129802a().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c28676v0 = C28635l.f115821a;
                if (!zHasNext) {
                    break;
                }
                C36873b c36873b = (C36873b) it.next();
                c28655q.m87150e0(1872024345);
                for (InterfaceC25312u interfaceC25312u : c36873b.mo78412a()) {
                    C25307p c25307p = f174238a;
                    boolean zM87157i = c28655q.m87157i(c40324f4);
                    Object objM87133R = c28655q.m87133R();
                    if (zM87157i || objM87133R == c28676v0) {
                        objM87133R = new C37900j1(20, c40324f4, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC25303l.m74291r(interfaceC25312u, c25307p, null, (p715kotlin.jvm.functions.Function1) objM87133R, c28655q, C25307p.f99300b << 3, 4);
                }
                c28655q.m87173q(false);
            }
            c28655q.m87173q(false);
            C17919x c17919x = (C17919x) interfaceC28601c2.getValue();
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new a(interfaceC28601c2);
                c28655q.m87172p0(objM87133R2);
            }
            m129644h("Active Color", c17919x, (p715kotlin.jvm.functions.Function1) objM87133R2, c28655q, 390);
            C17919x c17919x2 = (C17919x) interfaceC28601c3.getValue();
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new b(interfaceC28601c3);
                c28655q.m87172p0(objM87133R3);
            }
            m129644h("Negative Color", c17919x2, (p715kotlin.jvm.functions.Function1) objM87133R3, c28655q, 390);
            AbstractC22399k.m64473c("Disable", c28655q, 6);
            AbstractC42782p.m8885c(AbstractC37817c.m121344e(403284082, c28655q, new C39818e(interfaceC28601c4, c40324f4, interfaceC28601c1, 5)), c28655q, 6);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m129648l(C40324f4 c40324f4, InterfaceC28601c1 interfaceC28601c1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof AbstractC36877d) {
            c40324f4.m129729k((AbstractC36877d) it);
            interfaceC28601c1.setValue(C40324f4.m129728n(c40324f4, false, 1, null));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m129649m(InterfaceC28601c1 interfaceC28601c1, C40324f4 c40324f4, InterfaceC28601c1 interfaceC28601c2, InterfaceC22997s1 GalleryRowCard, Composer composer, int i13) {
        AbstractC22676k.m65750j(GalleryRowCard, "$this$GalleryRowCard");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC39330c.m125320b(0L, c38072d.m121949b(c28655q, i14).getAccentAction(), 0L, 0L, AbstractC37817c.m121344e(-1346912039, c28655q, new C36100c(interfaceC28601c1, c40324f4, interfaceC28601c2, 12)), c28655q, 24576, 13);
            AbstractC15011f9.m43114b(((Boolean) interfaceC28601c1.getValue()).booleanValue() ? "Enabled" : "Disabled", null, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, 0, 0, 131066);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m129650n(InterfaceC28601c1 interfaceC28601c1, C40324f4 c40324f4, InterfaceC28601c1 interfaceC28601c2, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zBooleanValue = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
            boolean zM87157i = c28655q.m87157i(c40324f4);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C37082e1(interfaceC28601c1, interfaceC28601c2, c40324f4, 23);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC29641d.m91043e(null, zBooleanValue, false, 0L, null, null, (p715kotlin.jvm.functions.Function1) objM87133R, c28655q, 0, 61);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m129651o(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, C40324f4 c40324f4, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
        interfaceC28601c2.setValue(c40324f4.m129730m(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m129652p(int i13, Composer composer, int i14) {
        m129646j(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    public static final C25307p m129653q() {
        return f174238a;
    }
}
