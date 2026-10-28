package wi0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import c31.C3922f;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.edit.C9792p;
import cp0.C10999t0;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.ArrayList;
import java.util.List;
import l41.C23329a;
import l83.C23454a0;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27242b1;
import ny0.AbstractC27271o0;
import ny0.AbstractC27274q;
import ny0.AbstractC27292z;
import ny0.C27270o;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p40.C28827b;
import p545v6.C35728q;
import p579wc.C37082e1;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import q12.C29802c;
import q63.AbstractC30007c;
import qz0.AbstractC30792k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import sy0.AbstractC33087j;
import sy0.AbstractC33088k;
import t20.C33334o;
import v71.C35766g;
import wb3.AbstractC37056f;
import wd3.C37168b;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: wi0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0085\u0001\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a]\u0010\u0015\u001a\u00020\u00072\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\t2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a3\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0003¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001e²\u0006\u000e\u0010\u001c\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00000\u00048\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"", "initialEndpoint", "", "isCacheEnabled", "", "recentEndpoints", "Lkotlin/Function2;", "Ll83/a0;", "onNavigateToGeneric", "Lkotlin/Function1;", "onDeleteRecentEndpoint", "Lkotlin/Function0;", "onClearRecentEndpoints", "onNavigateBack", "p", "(Ljava/lang/String;ZLjava/util/List;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "onEndpointClicked", "onDeleteClicked", "onClearClicked", "Landroidx/compose/ui/Modifier;", "modifier", "K", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "endpoint", "onClick", "onDeleteClick", "I", "(Ljava/lang/String;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "endpointPath", "recentPaths", "arch-v2_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37313e {

    /* JADX INFO: renamed from: wi0.e$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f159533w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f159534x;

        public a(Function1 function1, String str) {
            this.f159533w = function1;
            this.f159534x = str;
        }

        /* JADX INFO: renamed from: a */
        public final void m119531a() {
            this.f159533w.invoke(this.f159534x);
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m119531a();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: wi0.e$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f159535w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f159536x;

        public b(Function1 function1, String str) {
            this.f159535w = function1;
            this.f159536x = str;
        }

        /* JADX INFO: renamed from: a */
        public final void m119532a() {
            this.f159535w.invoke(this.f159536x);
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m119532a();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: wi0.e$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f159537w = new c();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(String str) {
            return null;
        }
    }

    /* JADX INFO: renamed from: wi0.e$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f159538w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f159539x;

        public d(Function1 function1, List list) {
            this.f159538w = function1;
            this.f159539x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m119534a(int i13) {
            return this.f159538w.invoke(this.f159539x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m119534a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: wi0.e$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f159540w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f159541x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f159542y;

        public e(List list, Function1 function1, Function1 function2) {
            this.f159540w = list;
            this.f159541x = function1;
            this.f159542y = function2;
        }

        /* JADX INFO: renamed from: a */
        public final void m119535a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            String str = (String) this.f159540w.get(i13);
            c28655q.m87150e0(1640441968);
            boolean zM87153g = c28655q.m87153g(this.f159541x) | c28655q.m87153g(str);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new a(this.f159541x, str);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87153g2 = c28655q.m87153g(this.f159542y) | c28655q.m87153g(str);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                objM87133R2 = new b(this.f159542y, str);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC37313e.m119499I(str, interfaceC4339a, (InterfaceC4339a) objM87133R2, c28655q, 0);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m119535a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m119491A(InterfaceC4351m interfaceC4351m, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        interfaceC4351m.invoke(m119495E(interfaceC28601c1), Boolean.valueOf(m119497G(interfaceC28601c2)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m119492B(String str, boolean z4, List list, InterfaceC4351m interfaceC4351m, Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, int i14, Composer composer, int i15) {
        m119520p(str, z4, list, interfaceC4351m, function1, interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m119493C() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m119494D() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: E */
    private static final String m119495E(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: F */
    private static final void m119496F(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: G */
    private static final boolean m119497G(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: H */
    private static final void m119498H(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final void m119499I(String str, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Composer composer, int i13) {
        int i14;
        String str2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-872025718);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a2) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1092a.m3362g(AbstractC1092a.m3358c(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), C17919x.f69636m, AbstractC17918w0.f69621a), false, null, null, interfaceC4339a, 15), 0.0f, 1 * 8, 1);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC30795n.m94707h(str, layoutWeightElement, c38072d.m121949b(c28655q, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB2(), null, c28655q, i14 & 14, C2886a.f11498d << 18, 196600);
            str2 = str;
            c28655q = c28655q;
            AbstractC27242b1.m82092d(new C27270o(AbstractC27274q.c.f109140f, EnumC16313m0.DELETE.toWhoopIcon(), EnumC39333f.WHITE_50, null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null), AbstractC11895b.m31996o("Remove ", str2, " from recents"), null, null, interfaceC4339a2, c28655q, C27270o.f109105k | (57344 & (i14 << 6)), 12);
            c28655q.m87173q(true);
        } else {
            str2 = str;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33334o(str2, interfaceC4339a, interfaceC4339a2, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m119500J(String str, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, Composer composer, int i14) {
        m119499I(str, interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:64:0x010a  */
    /* JADX WARN: Code duplicated, block: B:65:0x010e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0129  */
    /* JADX WARN: Code duplicated, block: B:74:0x0199  */
    /* JADX WARN: Code duplicated, block: B:77:0x0209  */
    /* JADX WARN: Code duplicated, block: B:78:0x020b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0213  */
    /* JADX WARN: Code duplicated, block: B:82:0x0215  */
    /* JADX WARN: Code duplicated, block: B:89:0x0226  */
    /* JADX WARN: Code duplicated, block: B:91:0x024c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0258  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: K */
    private static final void m119501K(List<String> list, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        C28655q c28655q;
        Function1 function3;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(401408275);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(list) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(function2) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87157i(interfaceC4339a) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i16 = i14 & 16;
        if (i16 == 0) {
            if ((i13 & 24576) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                Modifier modifier5 = modifier4;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q2, 48);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3409f2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                C2886a c2886aM8415M = c38072d.m121952e(c28655q2, i17).getSh5();
                long jM125382b1 = c38072d.m121949b(c28655q2, i17).getWhite50();
                int i18 = C2886a.f11498d;
                AbstractC30795n.m94707h("Recents", null, jM125382b1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8415M, null, c28655q2, 6, i18 << 18, 196602);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC22953f.m66715b(c28655q2, new LayoutWeightElement(1.0f, true));
                TextResource textResourceM21278l = AbstractC8693b.m21278l("Clear");
                C2886a c2886aM8415M2 = c38072d.m121952e(c28655q2, i17).getSh5();
                float f13 = 8;
                float f14 = 0 * f13;
                AbstractC27271o0.m82253b(null, !list.isEmpty(), textResourceM21278l, c2886aM8415M2, null, null, null, null, false, new C22976l1(f14, f14, f14, f14), interfaceC4339a, c28655q2, (TextResource.$stable << 6) | 906166272 | (i18 << 9), (i15 >> 9) & 14, 209);
                c28655q2.m87173q(true);
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                C22971k c22971kM66746i = AbstractC22977m.m66746i(1 * f13);
                boolean zM87157i = c28655q2.m87157i(list);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z16 = zM87157i | z13;
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z16 | z14;
                objM87133R = c28655q2.m87133R();
                if (!z15 || objM87133R == C28635l.f115821a) {
                    function3 = function1;
                    objM87133R = new C37082e1(list, function3, function2, 1);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    function3 = function1;
                }
                AbstractC22674j.m65717c(modifierM3409f3, null, null, c22971kM66746i, null, null, false, null, (Function1) objM87133R, c28655q2, 24582, 494);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                modifier3 = modifier5;
            } else {
                c28655q = c28655q2;
                function3 = function1;
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35766g(list, function3, function2, interfaceC4339a, modifier3, i13, i14);
            }
        }
        i15 |= 24576;
        modifier2 = modifier;
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, modifier4);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            Modifier modifier6 = modifier4;
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3409f4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N3);
            Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q2, 48);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3409f5);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N4);
            C38072d c38072d2 = C38072d.f163053a;
            int i19 = C38072d.f163054b;
            C2886a c2886aM8415M3 = c38072d2.m121952e(c28655q2, i19).getSh5();
            long jM125382b2 = c38072d2.m121949b(c28655q2, i19).getWhite50();
            int i110 = C2886a.f11498d;
            AbstractC30795n.m94707h("Recents", null, jM125382b2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8415M3, null, c28655q2, 6, i110 << 18, 196602);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC22953f.m66715b(c28655q2, new LayoutWeightElement(1.0f, true));
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l("Clear");
            C2886a c2886aM8415M4 = c38072d2.m121952e(c28655q2, i19).getSh5();
            float f15 = 8;
            float f16 = 0 * f15;
            AbstractC27271o0.m82253b(null, !list.isEmpty(), textResourceM21278l2, c2886aM8415M4, null, null, null, null, false, new C22976l1(f16, f16, f16, f16), interfaceC4339a, c28655q2, (TextResource.$stable << 6) | 906166272 | (i110 << 9), (i15 >> 9) & 14, 209);
            c28655q2.m87173q(true);
            Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22971k c22971kM66746i2 = AbstractC22977m.m66746i(1 * f15);
            boolean zM87157i2 = c28655q2.m87157i(list);
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z17 = zM87157i2 | z13;
            if ((i15 & 896) == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z17 | z14;
            objM87133R = c28655q2.m87133R();
            if (z15) {
                function3 = function1;
                objM87133R = new C37082e1(list, function3, function2, 1);
                c28655q2.m87172p0(objM87133R);
            } else {
                function3 = function1;
                objM87133R = new C37082e1(list, function3, function2, 1);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC22674j.m65717c(modifierM3409f6, null, null, c22971kM66746i2, null, null, false, null, (Function1) objM87133R, c28655q2, 24582, 494);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            modifier3 = modifier6;
        } else {
            c28655q = c28655q2;
            function3 = function1;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35766g(list, function3, function2, interfaceC4339a, modifier3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m119502L(List list, Function1 function1, Function1 function2, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        C26053f c26053f = (C26053f) LazyColumn;
        c26053f.m77529r(list.size(), null, new d(c.f159537w, list), new C37816b(new e(list, function1, function2), true, 802480018));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m119503M(List list, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m119501K(list, function1, function2, interfaceC4339a, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0119  */
    /* JADX WARN: Code duplicated, block: B:102:0x0126  */
    /* JADX WARN: Code duplicated, block: B:104:0x0129  */
    /* JADX WARN: Code duplicated, block: B:106:0x012f  */
    /* JADX WARN: Code duplicated, block: B:108:0x013b  */
    /* JADX WARN: Code duplicated, block: B:110:0x013f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0145  */
    /* JADX WARN: Code duplicated, block: B:116:0x015b  */
    /* JADX WARN: Code duplicated, block: B:119:0x016a  */
    /* JADX WARN: Code duplicated, block: B:122:0x0176  */
    /* JADX WARN: Code duplicated, block: B:125:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:126:0x01da  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:132:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:136:0x0262  */
    /* JADX WARN: Code duplicated, block: B:139:0x0275  */
    /* JADX WARN: Code duplicated, block: B:140:0x0282  */
    /* JADX WARN: Code duplicated, block: B:144:0x0305  */
    /* JADX WARN: Code duplicated, block: B:147:0x031a  */
    /* JADX WARN: Code duplicated, block: B:148:0x031c  */
    /* JADX WARN: Code duplicated, block: B:151:0x0323 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x0325  */
    /* JADX WARN: Code duplicated, block: B:155:0x0338  */
    /* JADX WARN: Code duplicated, block: B:156:0x033a  */
    /* JADX WARN: Code duplicated, block: B:159:0x0341 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:162:0x034b  */
    /* JADX WARN: Code duplicated, block: B:165:0x0364  */
    /* JADX WARN: Code duplicated, block: B:166:0x0366  */
    /* JADX WARN: Code duplicated, block: B:169:0x036d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:170:0x036f  */
    /* JADX WARN: Code duplicated, block: B:173:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:175:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:178:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:180:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:185:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:188:0x044d  */
    /* JADX WARN: Code duplicated, block: B:189:0x0450  */
    /* JADX WARN: Code duplicated, block: B:192:0x0458 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:193:0x045a  */
    /* JADX WARN: Code duplicated, block: B:195:0x049a  */
    /* JADX WARN: Code duplicated, block: B:198:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00df  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:94:0x0101  */
    /* JADX WARN: Code duplicated, block: B:96:0x010f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0113  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static final void m119520p(String str, boolean z4, List<String> list, InterfaceC4351m interfaceC4351m, Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Composer composer, int i13, int i14) {
        String str2;
        int i15;
        boolean z13;
        int i16;
        List<String> list2;
        int i17;
        int i18;
        int i19;
        int i24;
        Function1 function2;
        int i25;
        int i26;
        int i27;
        int i28;
        InterfaceC4339a interfaceC4339a3;
        int i29;
        boolean z14;
        InterfaceC4351m interfaceC4351m2;
        InterfaceC4339a interfaceC4339a4;
        String str3;
        boolean z15;
        List<String> list3;
        InterfaceC4339a interfaceC4339a5;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        InterfaceC4339a interfaceC4339a6;
        InterfaceC4339a interfaceC4339a7;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c3;
        Function1 function5;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        Object objM87133R4;
        Object objM87133R5;
        InterfaceC28601c1 interfaceC28601c4;
        InterfaceC28601c1 interfaceC28601c5;
        int i34;
        boolean z16;
        Object objM87133R6;
        boolean z17;
        Object objM87133R7;
        InterfaceC28601c1 interfaceC28601c6;
        Function1 function6;
        boolean z18;
        Object objM87133R8;
        int iHashCode2;
        Object objM87133R9;
        boolean z19;
        Object objM87133R10;
        Object objM87133R11;
        Object objM87133R12;
        Object objM87133R13;
        Object objM87133R14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-605497726);
        int i35 = i14 & 1;
        if (i35 != 0) {
            i15 = i13 | 6;
            str2 = str;
        } else if ((i13 & 6) == 0) {
            str2 = str;
            i15 = (c28655q.m87153g(str2) ? 4 : 2) | i13;
        } else {
            str2 = str;
            i15 = i13;
        }
        int i36 = i14 & 2;
        if (i36 == 0) {
            if ((i13 & 48) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    list2 = list;
                    if (c28655q.m87157i(list2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        if (c28655q.m87157i(interfaceC4351m)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 16;
                    if (i24 != 0) {
                        if ((i13 & 24576) == 0) {
                            function2 = function1;
                            if (c28655q.m87157i(function2)) {
                                i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                            } else {
                                i25 = DfuBaseService.ERROR_REMOTE_MASK;
                            }
                            i15 |= i25;
                        }
                        i26 = i14 & 32;
                        if (i26 != 0) {
                            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            if (c28655q.m87157i(interfaceC4339a)) {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i15 |= i27;
                        }
                        i28 = i14 & 64;
                        if (i28 != 0) {
                            i15 |= 1572864;
                            interfaceC4339a3 = interfaceC4339a2;
                        } else {
                            interfaceC4339a3 = interfaceC4339a2;
                            if ((i13 & 1572864) == 0) {
                                if (c28655q.m87157i(interfaceC4339a3)) {
                                    i29 = 1048576;
                                } else {
                                    i29 = 524288;
                                }
                                i15 |= i29;
                            }
                        }
                        if ((i15 & 599187) != 599186) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c28655q.m87135U(i15 & 1, z14)) {
                            if (i35 != 0) {
                                str2 = "";
                            }
                            if (i36 != 0) {
                                z13 = true;
                            }
                            if (i16 != 0) {
                                list2 = C25271y.f99162w;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i18 != 0) {
                                objM87133R14 = c28655q.m87133R();
                                if (objM87133R14 == c28676v0) {
                                    objM87133R14 = new C35728q(16, (byte) 0);
                                    c28655q.m87172p0(objM87133R14);
                                }
                                interfaceC4351m2 = (InterfaceC4351m) objM87133R14;
                            } else {
                                interfaceC4351m2 = interfaceC4351m;
                            }
                            if (i24 != 0) {
                                objM87133R13 = c28655q.m87133R();
                                if (objM87133R13 == c28676v0) {
                                    objM87133R13 = new C37168b(13);
                                    c28655q.m87172p0(objM87133R13);
                                }
                                function4 = (Function1) objM87133R13;
                            } else {
                                function4 = function2;
                            }
                            if (i26 != 0) {
                                objM87133R12 = c28655q.m87133R();
                                if (objM87133R12 == c28676v0) {
                                    objM87133R12 = new C37312d(0);
                                    c28655q.m87172p0(objM87133R12);
                                }
                                interfaceC4339a6 = (InterfaceC4339a) objM87133R12;
                            } else {
                                interfaceC4339a6 = interfaceC4339a;
                            }
                            if (i28 != 0) {
                                objM87133R11 = c28655q.m87133R();
                                if (objM87133R11 == c28676v0) {
                                    objM87133R11 = new C37312d(1);
                                    c28655q.m87172p0(objM87133R11);
                                }
                                interfaceC4339a3 = (InterfaceC4339a) objM87133R11;
                            }
                            interfaceC4339a7 = interfaceC4339a6;
                            InterfaceC4339a interfaceC4339a8 = interfaceC4339a3;
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC28683x.m87272z(str2);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC31061c.m95647w(z13, c28655q);
                            }
                            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = AbstractC28683x.m87272z(list2);
                                c28655q.m87172p0(objM87133R3);
                            }
                            interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                            C2314t c2314t = C2314t.f9131w;
                            String str4 = str2;
                            float f13 = 2 * 8;
                            Modifier modifierM3394p = AbstractC1099a.m3394p(f13, AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, c2314t), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                            boolean z24 = z13;
                            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                            function5 = function4;
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            List<String> list4 = list2;
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            C0209i c0209i4 = C0217k.f729g;
                            AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a);
                            c0209i = C0217k.f728f;
                            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m);
                            c0209i2 = C0217k.f732j;
                            if (c28655q.f115903S) {
                                c0209i3 = c0209i;
                            } else {
                                c0209i3 = c0209i;
                                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                                }
                                C0209i c0209i5 = C0217k.f726d;
                                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                                C0209i c0209i6 = c0209i3;
                                AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Arch V2 Playground")), null, interfaceC4339a8, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 >> 9) & 7168), 53);
                                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                                TextResource textResourceM21278l = AbstractC8693b.m21278l(m119495E(interfaceC28601c1));
                                TextResource textResourceM21278l2 = AbstractC8693b.m21278l("");
                                TextResource textResourceM21278l3 = AbstractC8693b.m21278l("");
                                objM87133R4 = c28655q.m87133R();
                                if (objM87133R4 == c28676v0) {
                                    objM87133R4 = new C37312d(2);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R4;
                                objM87133R5 = c28655q.m87133R();
                                if (objM87133R5 == c28676v0) {
                                    interfaceC28601c4 = interfaceC28601c1;
                                    objM87133R5 = new C29802c(25, interfaceC28601c4);
                                    c28655q.m87172p0(objM87133R5);
                                } else {
                                    interfaceC28601c4 = interfaceC28601c1;
                                }
                                int i37 = TextResource.$stable;
                                interfaceC28601c5 = interfaceC28601c4;
                                AbstractC30792k.m94679m(modifierM3409f, textResourceM21278l, null, null, textResourceM21278l2, null, null, 0L, textResourceM21278l3, false, false, null, false, 1, 0, 0, false, null, false, false, null, null, null, null, null, interfaceC4339a9, (Function1) objM87133R5, c28655q, (i37 << 3) | 6 | (i37 << 12) | (i37 << 24), 3072, 1769472, 33545964);
                                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                                List<String> listM119523s = m119523s(interfaceC28601c3);
                                i34 = i15 & 7168;
                                if (i34 == 2048) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                objM87133R6 = c28655q.m87133R();
                                if (z16 || objM87133R6 == c28676v0) {
                                    objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                                    c28655q.m87172p0(objM87133R6);
                                }
                                Function1 function7 = (Function1) objM87133R6;
                                if ((57344 & i15) == 16384) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                objM87133R7 = c28655q.m87133R();
                                if (!z17 || objM87133R7 == c28676v0) {
                                    interfaceC28601c6 = interfaceC28601c3;
                                    function6 = function5;
                                    objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                                    c28655q.m87172p0(objM87133R7);
                                } else {
                                    interfaceC28601c6 = interfaceC28601c3;
                                    function6 = function5;
                                }
                                Function1 function8 = (Function1) objM87133R7;
                                if ((i15 & 458752) == 131072) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                objM87133R8 = c28655q.m87133R();
                                if (z18 || objM87133R8 == c28676v0) {
                                    objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                                    c28655q.m87172p0(objM87133R8);
                                }
                                m119501K(listM119523s, function7, function8, (InterfaceC4339a) objM87133R8, layoutWeightElement, c28655q, 0, 0);
                                Modifier modifierM91835e = AbstractC30007c.m91835e(c2314t, f13, c28655q, c2314t, 1.0f);
                                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                                iHashCode2 = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM91835e);
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i4, c22994r1M66759a);
                                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m2);
                                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
                                AbstractC33088k.g gVar = new AbstractC33088k.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                                boolean zM119497G = m119497G(interfaceC28601c2);
                                TextResource textResourceM21278l4 = AbstractC8693b.m21278l("Enable Caching");
                                objM87133R9 = c28655q.m87133R();
                                if (objM87133R9 == c28676v0) {
                                    objM87133R9 = new C29802c(24, interfaceC28601c2);
                                    c28655q.m87172p0(objM87133R9);
                                }
                                Function1 function9 = function6;
                                AbstractC33087j.m104824f(textResourceM21278l4, gVar, zM119497G, false, 0, 0L, null, null, false, 0L, (Function1) objM87133R9, c28655q, i37 | (AbstractC33088k.g.f137992d << 3), 6, MessageListItemViewType.UNREAD_SEPARATOR);
                                AbstractC18489d0.m53356B(c28655q, true, c2314t, f13, c28655q);
                                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                                TextResource textResourceM21278l5 = AbstractC8693b.m21278l("Let's Go!");
                                boolean z25 = !AbstractC39414r.m125890i0(m119495E(interfaceC28601c5));
                                if (i34 == 2048) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                objM87133R10 = c28655q.m87133R();
                                if (z19 || objM87133R10 == c28676v0) {
                                    objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                                    c28655q.m87172p0(objM87133R10);
                                }
                                AbstractC27292z.m82343j(modifierM3409f2, z25, false, null, null, null, textResourceM21278l5, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R10, c28655q, (i37 << 18) | 6, 0, 8124);
                                c28655q = c28655q;
                                c28655q.m87173q(true);
                                interfaceC4339a4 = interfaceC4339a7;
                                str3 = str4;
                                z15 = z24;
                                function3 = function9;
                                list3 = list4;
                                interfaceC4339a5 = interfaceC4339a8;
                            }
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                            C0209i c0209i7 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N);
                            C0209i c0209i8 = c0209i3;
                            AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Arch V2 Playground")), null, interfaceC4339a8, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 >> 9) & 7168), 53);
                            Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                            TextResource textResourceM21278l6 = AbstractC8693b.m21278l(m119495E(interfaceC28601c1));
                            TextResource textResourceM21278l7 = AbstractC8693b.m21278l("");
                            TextResource textResourceM21278l8 = AbstractC8693b.m21278l("");
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C37312d(2);
                                c28655q.m87172p0(objM87133R4);
                            }
                            InterfaceC4339a interfaceC4339a10 = (InterfaceC4339a) objM87133R4;
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                interfaceC28601c4 = interfaceC28601c1;
                                objM87133R5 = new C29802c(25, interfaceC28601c4);
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                interfaceC28601c4 = interfaceC28601c1;
                            }
                            int i38 = TextResource.$stable;
                            interfaceC28601c5 = interfaceC28601c4;
                            AbstractC30792k.m94679m(modifierM3409f3, textResourceM21278l6, null, null, textResourceM21278l7, null, null, 0L, textResourceM21278l8, false, false, null, false, 1, 0, 0, false, null, false, false, null, null, null, null, null, interfaceC4339a10, (Function1) objM87133R5, c28655q, (i38 << 3) | 6 | (i38 << 12) | (i38 << 24), 3072, 1769472, 33545964);
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
                            List<String> listM119523s2 = m119523s(interfaceC28601c3);
                            i34 = i15 & 7168;
                            if (i34 == 2048) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objM87133R6 = c28655q.m87133R();
                            if (z16) {
                                objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                                c28655q.m87172p0(objM87133R6);
                            } else {
                                objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                                c28655q.m87172p0(objM87133R6);
                            }
                            Function1 function10 = (Function1) objM87133R6;
                            if ((57344 & i15) == 16384) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objM87133R7 = c28655q.m87133R();
                            if (z17) {
                                interfaceC28601c6 = interfaceC28601c3;
                                function6 = function5;
                                objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                                c28655q.m87172p0(objM87133R7);
                            } else {
                                interfaceC28601c6 = interfaceC28601c3;
                                function6 = function5;
                                objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                                c28655q.m87172p0(objM87133R7);
                            }
                            Function1 function11 = (Function1) objM87133R7;
                            if ((i15 & 458752) == 131072) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            objM87133R8 = c28655q.m87133R();
                            if (z18) {
                                objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                                c28655q.m87172p0(objM87133R8);
                            } else {
                                objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                                c28655q.m87172p0(objM87133R8);
                            }
                            m119501K(listM119523s2, function10, function11, (InterfaceC4339a) objM87133R8, layoutWeightElement2, c28655q, 0, 0);
                            Modifier modifierM91835e2 = AbstractC30007c.m91835e(c2314t, f13, c28655q, c2314t, 1.0f);
                            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM91835e2);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, c22994r1M66759a2);
                            AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m3);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
                            AbstractC33088k.g gVar2 = new AbstractC33088k.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                            boolean zM119497G2 = m119497G(interfaceC28601c2);
                            TextResource textResourceM21278l9 = AbstractC8693b.m21278l("Enable Caching");
                            objM87133R9 = c28655q.m87133R();
                            if (objM87133R9 == c28676v0) {
                                objM87133R9 = new C29802c(24, interfaceC28601c2);
                                c28655q.m87172p0(objM87133R9);
                            }
                            Function1 function12 = function6;
                            AbstractC33087j.m104824f(textResourceM21278l9, gVar2, zM119497G2, false, 0, 0L, null, null, false, 0L, (Function1) objM87133R9, c28655q, i38 | (AbstractC33088k.g.f137992d << 3), 6, MessageListItemViewType.UNREAD_SEPARATOR);
                            AbstractC18489d0.m53356B(c28655q, true, c2314t, f13, c28655q);
                            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                            TextResource textResourceM21278l10 = AbstractC8693b.m21278l("Let's Go!");
                            boolean z26 = !AbstractC39414r.m125890i0(m119495E(interfaceC28601c5));
                            if (i34 == 2048) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            objM87133R10 = c28655q.m87133R();
                            if (z19) {
                                objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                                c28655q.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                                c28655q.m87172p0(objM87133R10);
                            }
                            AbstractC27292z.m82343j(modifierM3409f4, z26, false, null, null, null, textResourceM21278l10, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R10, c28655q, (i38 << 18) | 6, 0, 8124);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            interfaceC4339a4 = interfaceC4339a7;
                            str3 = str4;
                            z15 = z24;
                            function3 = function12;
                            list3 = list4;
                            interfaceC4339a5 = interfaceC4339a8;
                        } else {
                            c28655q.m87138X();
                            interfaceC4351m2 = interfaceC4351m;
                            interfaceC4339a4 = interfaceC4339a;
                            str3 = str2;
                            z15 = z13;
                            list3 = list2;
                            interfaceC4339a5 = interfaceC4339a3;
                            function3 = function2;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C3922f(str3, z15, list3, interfaceC4351m2, function3, interfaceC4339a4, interfaceC4339a5, i13, i14);
                        }
                    }
                    i15 |= 24576;
                    function2 = function1;
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q.m87157i(interfaceC4339a)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                    i28 = i14 & 64;
                    if (i28 != 0) {
                        i15 |= 1572864;
                        interfaceC4339a3 = interfaceC4339a2;
                    } else {
                        interfaceC4339a3 = interfaceC4339a2;
                        if ((i13 & 1572864) == 0) {
                            if (c28655q.m87157i(interfaceC4339a3)) {
                                i29 = 1048576;
                            } else {
                                i29 = 524288;
                            }
                            i15 |= i29;
                        }
                    }
                    if ((i15 & 599187) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z14)) {
                        if (i35 != 0) {
                            str2 = "";
                        }
                        if (i36 != 0) {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            list2 = C25271y.f99162w;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i18 != 0) {
                            objM87133R14 = c28655q.m87133R();
                            if (objM87133R14 == c28676v0) {
                                objM87133R14 = new C35728q(16, (byte) 0);
                                c28655q.m87172p0(objM87133R14);
                            }
                            interfaceC4351m2 = (InterfaceC4351m) objM87133R14;
                        } else {
                            interfaceC4351m2 = interfaceC4351m;
                        }
                        if (i24 != 0) {
                            objM87133R13 = c28655q.m87133R();
                            if (objM87133R13 == c28676v0) {
                                objM87133R13 = new C37168b(13);
                                c28655q.m87172p0(objM87133R13);
                            }
                            function4 = (Function1) objM87133R13;
                        } else {
                            function4 = function2;
                        }
                        if (i26 != 0) {
                            objM87133R12 = c28655q.m87133R();
                            if (objM87133R12 == c28676v0) {
                                objM87133R12 = new C37312d(0);
                                c28655q.m87172p0(objM87133R12);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R12;
                        } else {
                            interfaceC4339a6 = interfaceC4339a;
                        }
                        if (i28 != 0) {
                            objM87133R11 = c28655q.m87133R();
                            if (objM87133R11 == c28676v0) {
                                objM87133R11 = new C37312d(1);
                                c28655q.m87172p0(objM87133R11);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R11;
                        }
                        interfaceC4339a7 = interfaceC4339a6;
                        InterfaceC4339a interfaceC4339a11 = interfaceC4339a3;
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(str2);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC31061c.m95647w(z13, c28655q);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87272z(list2);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                        C2314t c2314t2 = C2314t.f9131w;
                        String str5 = str2;
                        float f14 = 2 * 8;
                        Modifier modifierM3394p2 = AbstractC1099a.m3394p(f14, AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, c2314t2), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                        boolean z27 = z13;
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        function5 = function4;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        List<String> list5 = list2;
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        C0209i c0209i9 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i9, c23010xM66775a2);
                        c0209i = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m4);
                        c0209i2 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            c0209i3 = c0209i;
                            if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i10 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N4);
                            C0209i c0209i11 = c0209i3;
                            AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Arch V2 Playground")), null, interfaceC4339a11, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 >> 9) & 7168), 53);
                            Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t2);
                            TextResource textResourceM21278l11 = AbstractC8693b.m21278l(m119495E(interfaceC28601c1));
                            TextResource textResourceM21278l12 = AbstractC8693b.m21278l("");
                            TextResource textResourceM21278l13 = AbstractC8693b.m21278l("");
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C37312d(2);
                                c28655q.m87172p0(objM87133R4);
                            }
                            InterfaceC4339a interfaceC4339a12 = (InterfaceC4339a) objM87133R4;
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                interfaceC28601c4 = interfaceC28601c1;
                                objM87133R5 = new C29802c(25, interfaceC28601c4);
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                interfaceC28601c4 = interfaceC28601c1;
                            }
                            int i39 = TextResource.$stable;
                            interfaceC28601c5 = interfaceC28601c4;
                            AbstractC30792k.m94679m(modifierM3409f5, textResourceM21278l11, null, null, textResourceM21278l12, null, null, 0L, textResourceM21278l13, false, false, null, false, 1, 0, 0, false, null, false, false, null, null, null, null, null, interfaceC4339a12, (Function1) objM87133R5, c28655q, (i39 << 3) | 6 | (i39 << 12) | (i39 << 24), 3072, 1769472, 33545964);
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t2));
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(1.0f, true);
                            List<String> listM119523s3 = m119523s(interfaceC28601c3);
                            i34 = i15 & 7168;
                            if (i34 == 2048) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objM87133R6 = c28655q.m87133R();
                            if (z16) {
                                objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                                c28655q.m87172p0(objM87133R6);
                            } else {
                                objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                                c28655q.m87172p0(objM87133R6);
                            }
                            Function1 function13 = (Function1) objM87133R6;
                            if ((57344 & i15) == 16384) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objM87133R7 = c28655q.m87133R();
                            if (z17) {
                                interfaceC28601c6 = interfaceC28601c3;
                                function6 = function5;
                                objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                                c28655q.m87172p0(objM87133R7);
                            } else {
                                interfaceC28601c6 = interfaceC28601c3;
                                function6 = function5;
                                objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                                c28655q.m87172p0(objM87133R7);
                            }
                            Function1 function14 = (Function1) objM87133R7;
                            if ((i15 & 458752) == 131072) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            objM87133R8 = c28655q.m87133R();
                            if (z18) {
                                objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                                c28655q.m87172p0(objM87133R8);
                            } else {
                                objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                                c28655q.m87172p0(objM87133R8);
                            }
                            m119501K(listM119523s3, function13, function14, (InterfaceC4339a) objM87133R8, layoutWeightElement3, c28655q, 0, 0);
                            Modifier modifierM91835e3 = AbstractC30007c.m91835e(c2314t2, f14, c28655q, c2314t2, 1.0f);
                            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM91835e3);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i9, c22994r1M66759a3);
                            AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m5);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N5);
                            AbstractC33088k.g gVar3 = new AbstractC33088k.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                            boolean zM119497G3 = m119497G(interfaceC28601c2);
                            TextResource textResourceM21278l14 = AbstractC8693b.m21278l("Enable Caching");
                            objM87133R9 = c28655q.m87133R();
                            if (objM87133R9 == c28676v0) {
                                objM87133R9 = new C29802c(24, interfaceC28601c2);
                                c28655q.m87172p0(objM87133R9);
                            }
                            Function1 function15 = function6;
                            AbstractC33087j.m104824f(textResourceM21278l14, gVar3, zM119497G3, false, 0, 0L, null, null, false, 0L, (Function1) objM87133R9, c28655q, i39 | (AbstractC33088k.g.f137992d << 3), 6, MessageListItemViewType.UNREAD_SEPARATOR);
                            AbstractC18489d0.m53356B(c28655q, true, c2314t2, f14, c28655q);
                            Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t2);
                            TextResource textResourceM21278l15 = AbstractC8693b.m21278l("Let's Go!");
                            boolean z28 = !AbstractC39414r.m125890i0(m119495E(interfaceC28601c5));
                            if (i34 == 2048) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            objM87133R10 = c28655q.m87133R();
                            if (z19) {
                                objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                                c28655q.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                                c28655q.m87172p0(objM87133R10);
                            }
                            AbstractC27292z.m82343j(modifierM3409f6, z28, false, null, null, null, textResourceM21278l15, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R10, c28655q, (i39 << 18) | 6, 0, 8124);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            interfaceC4339a4 = interfaceC4339a7;
                            str3 = str5;
                            z15 = z27;
                            function3 = function15;
                            list3 = list5;
                            interfaceC4339a5 = interfaceC4339a11;
                        } else {
                            c0209i3 = c0209i;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                        C0209i c0209i12 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N4);
                        C0209i c0209i13 = c0209i3;
                        AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Arch V2 Playground")), null, interfaceC4339a11, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 >> 9) & 7168), 53);
                        Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t2);
                        TextResource textResourceM21278l16 = AbstractC8693b.m21278l(m119495E(interfaceC28601c1));
                        TextResource textResourceM21278l17 = AbstractC8693b.m21278l("");
                        TextResource textResourceM21278l18 = AbstractC8693b.m21278l("");
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C37312d(2);
                            c28655q.m87172p0(objM87133R4);
                        }
                        InterfaceC4339a interfaceC4339a13 = (InterfaceC4339a) objM87133R4;
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            interfaceC28601c4 = interfaceC28601c1;
                            objM87133R5 = new C29802c(25, interfaceC28601c4);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            interfaceC28601c4 = interfaceC28601c1;
                        }
                        int i310 = TextResource.$stable;
                        interfaceC28601c5 = interfaceC28601c4;
                        AbstractC30792k.m94679m(modifierM3409f7, textResourceM21278l16, null, null, textResourceM21278l17, null, null, 0L, textResourceM21278l18, false, false, null, false, 1, 0, 0, false, null, false, false, null, null, null, null, null, interfaceC4339a13, (Function1) objM87133R5, c28655q, (i310 << 3) | 6 | (i310 << 12) | (i310 << 24), 3072, 1769472, 33545964);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t2));
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(1.0f, true);
                        List<String> listM119523s4 = m119523s(interfaceC28601c3);
                        i34 = i15 & 7168;
                        if (i34 == 2048) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R6 = c28655q.m87133R();
                        if (z16) {
                            objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                            c28655q.m87172p0(objM87133R6);
                        }
                        Function1 function16 = (Function1) objM87133R6;
                        if ((57344 & i15) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (z17) {
                            interfaceC28601c6 = interfaceC28601c3;
                            function6 = function5;
                            objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            interfaceC28601c6 = interfaceC28601c3;
                            function6 = function5;
                            objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                            c28655q.m87172p0(objM87133R7);
                        }
                        Function1 function17 = (Function1) objM87133R7;
                        if ((i15 & 458752) == 131072) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objM87133R8 = c28655q.m87133R();
                        if (z18) {
                            objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                            c28655q.m87172p0(objM87133R8);
                        } else {
                            objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                            c28655q.m87172p0(objM87133R8);
                        }
                        m119501K(listM119523s4, function16, function17, (InterfaceC4339a) objM87133R8, layoutWeightElement4, c28655q, 0, 0);
                        Modifier modifierM91835e4 = AbstractC30007c.m91835e(c2314t2, f14, c28655q, c2314t2, 1.0f);
                        C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM91835e4);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i9, c22994r1M66759a4);
                        AbstractC28683x.m87239G(c28655q, c0209i13, interfaceC28653p1M87165m6);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N6);
                        AbstractC33088k.g gVar4 = new AbstractC33088k.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                        boolean zM119497G4 = m119497G(interfaceC28601c2);
                        TextResource textResourceM21278l19 = AbstractC8693b.m21278l("Enable Caching");
                        objM87133R9 = c28655q.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C29802c(24, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R9);
                        }
                        Function1 function18 = function6;
                        AbstractC33087j.m104824f(textResourceM21278l19, gVar4, zM119497G4, false, 0, 0L, null, null, false, 0L, (Function1) objM87133R9, c28655q, i310 | (AbstractC33088k.g.f137992d << 3), 6, MessageListItemViewType.UNREAD_SEPARATOR);
                        AbstractC18489d0.m53356B(c28655q, true, c2314t2, f14, c28655q);
                        Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t2);
                        TextResource textResourceM21278l110 = AbstractC8693b.m21278l("Let's Go!");
                        boolean z29 = !AbstractC39414r.m125890i0(m119495E(interfaceC28601c5));
                        if (i34 == 2048) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        objM87133R10 = c28655q.m87133R();
                        if (z19) {
                            objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                            c28655q.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                            c28655q.m87172p0(objM87133R10);
                        }
                        AbstractC27292z.m82343j(modifierM3409f8, z29, false, null, null, null, textResourceM21278l110, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R10, c28655q, (i310 << 18) | 6, 0, 8124);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        interfaceC4339a4 = interfaceC4339a7;
                        str3 = str5;
                        z15 = z27;
                        function3 = function18;
                        list3 = list5;
                        interfaceC4339a5 = interfaceC4339a11;
                    } else {
                        c28655q.m87138X();
                        interfaceC4351m2 = interfaceC4351m;
                        interfaceC4339a4 = interfaceC4339a;
                        str3 = str2;
                        z15 = z13;
                        list3 = list2;
                        interfaceC4339a5 = interfaceC4339a3;
                        function3 = function2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C3922f(str3, z15, list3, interfaceC4351m2, function3, interfaceC4339a4, interfaceC4339a5, i13, i14);
                    }
                }
                i15 |= 3072;
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        function2 = function1;
                        if (c28655q.m87157i(function2)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q.m87157i(interfaceC4339a)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                    i28 = i14 & 64;
                    if (i28 != 0) {
                        i15 |= 1572864;
                        interfaceC4339a3 = interfaceC4339a2;
                    } else {
                        interfaceC4339a3 = interfaceC4339a2;
                        if ((i13 & 1572864) == 0) {
                            if (c28655q.m87157i(interfaceC4339a3)) {
                                i29 = 1048576;
                            } else {
                                i29 = 524288;
                            }
                            i15 |= i29;
                        }
                    }
                    if ((i15 & 599187) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z14)) {
                        if (i35 != 0) {
                            str2 = "";
                        }
                        if (i36 != 0) {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            list2 = C25271y.f99162w;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i18 != 0) {
                            objM87133R14 = c28655q.m87133R();
                            if (objM87133R14 == c28676v0) {
                                objM87133R14 = new C35728q(16, (byte) 0);
                                c28655q.m87172p0(objM87133R14);
                            }
                            interfaceC4351m2 = (InterfaceC4351m) objM87133R14;
                        } else {
                            interfaceC4351m2 = interfaceC4351m;
                        }
                        if (i24 != 0) {
                            objM87133R13 = c28655q.m87133R();
                            if (objM87133R13 == c28676v0) {
                                objM87133R13 = new C37168b(13);
                                c28655q.m87172p0(objM87133R13);
                            }
                            function4 = (Function1) objM87133R13;
                        } else {
                            function4 = function2;
                        }
                        if (i26 != 0) {
                            objM87133R12 = c28655q.m87133R();
                            if (objM87133R12 == c28676v0) {
                                objM87133R12 = new C37312d(0);
                                c28655q.m87172p0(objM87133R12);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R12;
                        } else {
                            interfaceC4339a6 = interfaceC4339a;
                        }
                        if (i28 != 0) {
                            objM87133R11 = c28655q.m87133R();
                            if (objM87133R11 == c28676v0) {
                                objM87133R11 = new C37312d(1);
                                c28655q.m87172p0(objM87133R11);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R11;
                        }
                        interfaceC4339a7 = interfaceC4339a6;
                        InterfaceC4339a interfaceC4339a14 = interfaceC4339a3;
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(str2);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC31061c.m95647w(z13, c28655q);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87272z(list2);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                        C2314t c2314t3 = C2314t.f9131w;
                        String str6 = str2;
                        float f15 = 2 * 8;
                        Modifier modifierM3394p3 = AbstractC1099a.m3394p(f15, AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, c2314t3), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                        boolean z210 = z13;
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        function5 = function4;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                        Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3394p3);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        List<String> list6 = list2;
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        C0209i c0209i14 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i14, c23010xM66775a3);
                        c0209i = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m7);
                        c0209i2 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            c0209i3 = c0209i;
                            if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i15 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q, c0209i15, modifierM118962N7);
                            C0209i c0209i16 = c0209i3;
                            AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Arch V2 Playground")), null, interfaceC4339a14, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 >> 9) & 7168), 53);
                            Modifier modifierM3409f9 = AbstractC1102d.m3409f(1.0f, c2314t3);
                            TextResource textResourceM21278l111 = AbstractC8693b.m21278l(m119495E(interfaceC28601c1));
                            TextResource textResourceM21278l112 = AbstractC8693b.m21278l("");
                            TextResource textResourceM21278l113 = AbstractC8693b.m21278l("");
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C37312d(2);
                                c28655q.m87172p0(objM87133R4);
                            }
                            InterfaceC4339a interfaceC4339a15 = (InterfaceC4339a) objM87133R4;
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                interfaceC28601c4 = interfaceC28601c1;
                                objM87133R5 = new C29802c(25, interfaceC28601c4);
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                interfaceC28601c4 = interfaceC28601c1;
                            }
                            int i311 = TextResource.$stable;
                            interfaceC28601c5 = interfaceC28601c4;
                            AbstractC30792k.m94679m(modifierM3409f9, textResourceM21278l111, null, null, textResourceM21278l112, null, null, 0L, textResourceM21278l113, false, false, null, false, 1, 0, 0, false, null, false, false, null, null, null, null, null, interfaceC4339a15, (Function1) objM87133R5, c28655q, (i311 << 3) | 6 | (i311 << 12) | (i311 << 24), 3072, 1769472, 33545964);
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f15, c2314t3));
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            LayoutWeightElement layoutWeightElement5 = new LayoutWeightElement(1.0f, true);
                            List<String> listM119523s5 = m119523s(interfaceC28601c3);
                            i34 = i15 & 7168;
                            if (i34 == 2048) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objM87133R6 = c28655q.m87133R();
                            if (z16) {
                                objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                                c28655q.m87172p0(objM87133R6);
                            } else {
                                objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                                c28655q.m87172p0(objM87133R6);
                            }
                            Function1 function19 = (Function1) objM87133R6;
                            if ((57344 & i15) == 16384) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objM87133R7 = c28655q.m87133R();
                            if (z17) {
                                interfaceC28601c6 = interfaceC28601c3;
                                function6 = function5;
                                objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                                c28655q.m87172p0(objM87133R7);
                            } else {
                                interfaceC28601c6 = interfaceC28601c3;
                                function6 = function5;
                                objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                                c28655q.m87172p0(objM87133R7);
                            }
                            Function1 function110 = (Function1) objM87133R7;
                            if ((i15 & 458752) == 131072) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            objM87133R8 = c28655q.m87133R();
                            if (z18) {
                                objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                                c28655q.m87172p0(objM87133R8);
                            } else {
                                objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                                c28655q.m87172p0(objM87133R8);
                            }
                            m119501K(listM119523s5, function19, function110, (InterfaceC4339a) objM87133R8, layoutWeightElement5, c28655q, 0, 0);
                            Modifier modifierM91835e5 = AbstractC30007c.m91835e(c2314t3, f15, c28655q, c2314t3, 1.0f);
                            C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM91835e5);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i14, c22994r1M66759a5);
                            AbstractC28683x.m87239G(c28655q, c0209i16, interfaceC28653p1M87165m8);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i15, modifierM118962N8);
                            AbstractC33088k.g gVar5 = new AbstractC33088k.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                            boolean zM119497G5 = m119497G(interfaceC28601c2);
                            TextResource textResourceM21278l114 = AbstractC8693b.m21278l("Enable Caching");
                            objM87133R9 = c28655q.m87133R();
                            if (objM87133R9 == c28676v0) {
                                objM87133R9 = new C29802c(24, interfaceC28601c2);
                                c28655q.m87172p0(objM87133R9);
                            }
                            Function1 function111 = function6;
                            AbstractC33087j.m104824f(textResourceM21278l114, gVar5, zM119497G5, false, 0, 0L, null, null, false, 0L, (Function1) objM87133R9, c28655q, i311 | (AbstractC33088k.g.f137992d << 3), 6, MessageListItemViewType.UNREAD_SEPARATOR);
                            AbstractC18489d0.m53356B(c28655q, true, c2314t3, f15, c28655q);
                            Modifier modifierM3409f10 = AbstractC1102d.m3409f(1.0f, c2314t3);
                            TextResource textResourceM21278l115 = AbstractC8693b.m21278l("Let's Go!");
                            boolean z211 = !AbstractC39414r.m125890i0(m119495E(interfaceC28601c5));
                            if (i34 == 2048) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            objM87133R10 = c28655q.m87133R();
                            if (z19) {
                                objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                                c28655q.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                                c28655q.m87172p0(objM87133R10);
                            }
                            AbstractC27292z.m82343j(modifierM3409f10, z211, false, null, null, null, textResourceM21278l115, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R10, c28655q, (i311 << 18) | 6, 0, 8124);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            interfaceC4339a4 = interfaceC4339a7;
                            str3 = str6;
                            z15 = z210;
                            function3 = function111;
                            list3 = list6;
                            interfaceC4339a5 = interfaceC4339a14;
                        } else {
                            c0209i3 = c0209i;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                        C0209i c0209i17 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N7);
                        C0209i c0209i18 = c0209i3;
                        AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Arch V2 Playground")), null, interfaceC4339a14, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 >> 9) & 7168), 53);
                        Modifier modifierM3409f11 = AbstractC1102d.m3409f(1.0f, c2314t3);
                        TextResource textResourceM21278l116 = AbstractC8693b.m21278l(m119495E(interfaceC28601c1));
                        TextResource textResourceM21278l117 = AbstractC8693b.m21278l("");
                        TextResource textResourceM21278l118 = AbstractC8693b.m21278l("");
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C37312d(2);
                            c28655q.m87172p0(objM87133R4);
                        }
                        InterfaceC4339a interfaceC4339a16 = (InterfaceC4339a) objM87133R4;
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            interfaceC28601c4 = interfaceC28601c1;
                            objM87133R5 = new C29802c(25, interfaceC28601c4);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            interfaceC28601c4 = interfaceC28601c1;
                        }
                        int i312 = TextResource.$stable;
                        interfaceC28601c5 = interfaceC28601c4;
                        AbstractC30792k.m94679m(modifierM3409f11, textResourceM21278l116, null, null, textResourceM21278l117, null, null, 0L, textResourceM21278l118, false, false, null, false, 1, 0, 0, false, null, false, false, null, null, null, null, null, interfaceC4339a16, (Function1) objM87133R5, c28655q, (i312 << 3) | 6 | (i312 << 12) | (i312 << 24), 3072, 1769472, 33545964);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f15, c2314t3));
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement6 = new LayoutWeightElement(1.0f, true);
                        List<String> listM119523s6 = m119523s(interfaceC28601c3);
                        i34 = i15 & 7168;
                        if (i34 == 2048) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R6 = c28655q.m87133R();
                        if (z16) {
                            objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                            c28655q.m87172p0(objM87133R6);
                        }
                        Function1 function112 = (Function1) objM87133R6;
                        if ((57344 & i15) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (z17) {
                            interfaceC28601c6 = interfaceC28601c3;
                            function6 = function5;
                            objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            interfaceC28601c6 = interfaceC28601c3;
                            function6 = function5;
                            objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                            c28655q.m87172p0(objM87133R7);
                        }
                        Function1 function113 = (Function1) objM87133R7;
                        if ((i15 & 458752) == 131072) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objM87133R8 = c28655q.m87133R();
                        if (z18) {
                            objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                            c28655q.m87172p0(objM87133R8);
                        } else {
                            objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                            c28655q.m87172p0(objM87133R8);
                        }
                        m119501K(listM119523s6, function112, function113, (InterfaceC4339a) objM87133R8, layoutWeightElement6, c28655q, 0, 0);
                        Modifier modifierM91835e6 = AbstractC30007c.m91835e(c2314t3, f15, c28655q, c2314t3, 1.0f);
                        C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                        Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM91835e6);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i14, c22994r1M66759a6);
                        AbstractC28683x.m87239G(c28655q, c0209i18, interfaceC28653p1M87165m9);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N9);
                        AbstractC33088k.g gVar6 = new AbstractC33088k.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                        boolean zM119497G6 = m119497G(interfaceC28601c2);
                        TextResource textResourceM21278l119 = AbstractC8693b.m21278l("Enable Caching");
                        objM87133R9 = c28655q.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C29802c(24, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R9);
                        }
                        Function1 function114 = function6;
                        AbstractC33087j.m104824f(textResourceM21278l119, gVar6, zM119497G6, false, 0, 0L, null, null, false, 0L, (Function1) objM87133R9, c28655q, i312 | (AbstractC33088k.g.f137992d << 3), 6, MessageListItemViewType.UNREAD_SEPARATOR);
                        AbstractC18489d0.m53356B(c28655q, true, c2314t3, f15, c28655q);
                        Modifier modifierM3409f12 = AbstractC1102d.m3409f(1.0f, c2314t3);
                        TextResource textResourceM21278l1110 = AbstractC8693b.m21278l("Let's Go!");
                        boolean z212 = !AbstractC39414r.m125890i0(m119495E(interfaceC28601c5));
                        if (i34 == 2048) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        objM87133R10 = c28655q.m87133R();
                        if (z19) {
                            objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                            c28655q.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                            c28655q.m87172p0(objM87133R10);
                        }
                        AbstractC27292z.m82343j(modifierM3409f12, z212, false, null, null, null, textResourceM21278l1110, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R10, c28655q, (i312 << 18) | 6, 0, 8124);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        interfaceC4339a4 = interfaceC4339a7;
                        str3 = str6;
                        z15 = z210;
                        function3 = function114;
                        list3 = list6;
                        interfaceC4339a5 = interfaceC4339a14;
                    } else {
                        c28655q.m87138X();
                        interfaceC4351m2 = interfaceC4351m;
                        interfaceC4339a4 = interfaceC4339a;
                        str3 = str2;
                        z15 = z13;
                        list3 = list2;
                        interfaceC4339a5 = interfaceC4339a3;
                        function3 = function2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C3922f(str3, z15, list3, interfaceC4351m2, function3, interfaceC4339a4, interfaceC4339a5, i13, i14);
                    }
                }
                i15 |= 24576;
                function2 = function1;
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(interfaceC4339a)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                i28 = i14 & 64;
                if (i28 != 0) {
                    i15 |= 1572864;
                    interfaceC4339a3 = interfaceC4339a2;
                } else {
                    interfaceC4339a3 = interfaceC4339a2;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q.m87157i(interfaceC4339a3)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i15 |= i29;
                    }
                }
                if ((i15 & 599187) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    if (i35 != 0) {
                        str2 = "";
                    }
                    if (i36 != 0) {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        list2 = C25271y.f99162w;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R14 = c28655q.m87133R();
                        if (objM87133R14 == c28676v0) {
                            objM87133R14 = new C35728q(16, (byte) 0);
                            c28655q.m87172p0(objM87133R14);
                        }
                        interfaceC4351m2 = (InterfaceC4351m) objM87133R14;
                    } else {
                        interfaceC4351m2 = interfaceC4351m;
                    }
                    if (i24 != 0) {
                        objM87133R13 = c28655q.m87133R();
                        if (objM87133R13 == c28676v0) {
                            objM87133R13 = new C37168b(13);
                            c28655q.m87172p0(objM87133R13);
                        }
                        function4 = (Function1) objM87133R13;
                    } else {
                        function4 = function2;
                    }
                    if (i26 != 0) {
                        objM87133R12 = c28655q.m87133R();
                        if (objM87133R12 == c28676v0) {
                            objM87133R12 = new C37312d(0);
                            c28655q.m87172p0(objM87133R12);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R12;
                    } else {
                        interfaceC4339a6 = interfaceC4339a;
                    }
                    if (i28 != 0) {
                        objM87133R11 = c28655q.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C37312d(1);
                            c28655q.m87172p0(objM87133R11);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R11;
                    }
                    interfaceC4339a7 = interfaceC4339a6;
                    InterfaceC4339a interfaceC4339a17 = interfaceC4339a3;
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(str2);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC31061c.m95647w(z13, c28655q);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(list2);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                    C2314t c2314t4 = C2314t.f9131w;
                    String str7 = str2;
                    float f16 = 2 * 8;
                    Modifier modifierM3394p4 = AbstractC1099a.m3394p(f16, AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, c2314t4), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                    boolean z213 = z13;
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    function5 = function4;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3394p4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    List<String> list7 = list2;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i19 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i19, c23010xM66775a4);
                    c0209i = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m10);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        c0209i3 = c0209i;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i110 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i110, modifierM118962N10);
                        C0209i c0209i111 = c0209i3;
                        AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Arch V2 Playground")), null, interfaceC4339a17, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 >> 9) & 7168), 53);
                        Modifier modifierM3409f13 = AbstractC1102d.m3409f(1.0f, c2314t4);
                        TextResource textResourceM21278l1111 = AbstractC8693b.m21278l(m119495E(interfaceC28601c1));
                        TextResource textResourceM21278l1112 = AbstractC8693b.m21278l("");
                        TextResource textResourceM21278l1113 = AbstractC8693b.m21278l("");
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C37312d(2);
                            c28655q.m87172p0(objM87133R4);
                        }
                        InterfaceC4339a interfaceC4339a18 = (InterfaceC4339a) objM87133R4;
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            interfaceC28601c4 = interfaceC28601c1;
                            objM87133R5 = new C29802c(25, interfaceC28601c4);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            interfaceC28601c4 = interfaceC28601c1;
                        }
                        int i313 = TextResource.$stable;
                        interfaceC28601c5 = interfaceC28601c4;
                        AbstractC30792k.m94679m(modifierM3409f13, textResourceM21278l1111, null, null, textResourceM21278l1112, null, null, 0L, textResourceM21278l1113, false, false, null, false, 1, 0, 0, false, null, false, false, null, null, null, null, null, interfaceC4339a18, (Function1) objM87133R5, c28655q, (i313 << 3) | 6 | (i313 << 12) | (i313 << 24), 3072, 1769472, 33545964);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f16, c2314t4));
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement7 = new LayoutWeightElement(1.0f, true);
                        List<String> listM119523s7 = m119523s(interfaceC28601c3);
                        i34 = i15 & 7168;
                        if (i34 == 2048) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R6 = c28655q.m87133R();
                        if (z16) {
                            objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                            c28655q.m87172p0(objM87133R6);
                        }
                        Function1 function115 = (Function1) objM87133R6;
                        if ((57344 & i15) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (z17) {
                            interfaceC28601c6 = interfaceC28601c3;
                            function6 = function5;
                            objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            interfaceC28601c6 = interfaceC28601c3;
                            function6 = function5;
                            objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                            c28655q.m87172p0(objM87133R7);
                        }
                        Function1 function116 = (Function1) objM87133R7;
                        if ((i15 & 458752) == 131072) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objM87133R8 = c28655q.m87133R();
                        if (z18) {
                            objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                            c28655q.m87172p0(objM87133R8);
                        } else {
                            objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                            c28655q.m87172p0(objM87133R8);
                        }
                        m119501K(listM119523s7, function115, function116, (InterfaceC4339a) objM87133R8, layoutWeightElement7, c28655q, 0, 0);
                        Modifier modifierM91835e7 = AbstractC30007c.m91835e(c2314t4, f16, c28655q, c2314t4, 1.0f);
                        C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                        Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM91835e7);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i19, c22994r1M66759a7);
                        AbstractC28683x.m87239G(c28655q, c0209i111, interfaceC28653p1M87165m11);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i110, modifierM118962N11);
                        AbstractC33088k.g gVar7 = new AbstractC33088k.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                        boolean zM119497G7 = m119497G(interfaceC28601c2);
                        TextResource textResourceM21278l1114 = AbstractC8693b.m21278l("Enable Caching");
                        objM87133R9 = c28655q.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C29802c(24, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R9);
                        }
                        Function1 function117 = function6;
                        AbstractC33087j.m104824f(textResourceM21278l1114, gVar7, zM119497G7, false, 0, 0L, null, null, false, 0L, (Function1) objM87133R9, c28655q, i313 | (AbstractC33088k.g.f137992d << 3), 6, MessageListItemViewType.UNREAD_SEPARATOR);
                        AbstractC18489d0.m53356B(c28655q, true, c2314t4, f16, c28655q);
                        Modifier modifierM3409f14 = AbstractC1102d.m3409f(1.0f, c2314t4);
                        TextResource textResourceM21278l1115 = AbstractC8693b.m21278l("Let's Go!");
                        boolean z214 = !AbstractC39414r.m125890i0(m119495E(interfaceC28601c5));
                        if (i34 == 2048) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        objM87133R10 = c28655q.m87133R();
                        if (z19) {
                            objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                            c28655q.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                            c28655q.m87172p0(objM87133R10);
                        }
                        AbstractC27292z.m82343j(modifierM3409f14, z214, false, null, null, null, textResourceM21278l1115, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R10, c28655q, (i313 << 18) | 6, 0, 8124);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        interfaceC4339a4 = interfaceC4339a7;
                        str3 = str7;
                        z15 = z213;
                        function3 = function117;
                        list3 = list7;
                        interfaceC4339a5 = interfaceC4339a17;
                    } else {
                        c0209i3 = c0209i;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                    C0209i c0209i112 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i112, modifierM118962N10);
                    C0209i c0209i113 = c0209i3;
                    AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Arch V2 Playground")), null, interfaceC4339a17, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 >> 9) & 7168), 53);
                    Modifier modifierM3409f15 = AbstractC1102d.m3409f(1.0f, c2314t4);
                    TextResource textResourceM21278l1116 = AbstractC8693b.m21278l(m119495E(interfaceC28601c1));
                    TextResource textResourceM21278l1117 = AbstractC8693b.m21278l("");
                    TextResource textResourceM21278l1118 = AbstractC8693b.m21278l("");
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C37312d(2);
                        c28655q.m87172p0(objM87133R4);
                    }
                    InterfaceC4339a interfaceC4339a19 = (InterfaceC4339a) objM87133R4;
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        interfaceC28601c4 = interfaceC28601c1;
                        objM87133R5 = new C29802c(25, interfaceC28601c4);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        interfaceC28601c4 = interfaceC28601c1;
                    }
                    int i314 = TextResource.$stable;
                    interfaceC28601c5 = interfaceC28601c4;
                    AbstractC30792k.m94679m(modifierM3409f15, textResourceM21278l1116, null, null, textResourceM21278l1117, null, null, 0L, textResourceM21278l1118, false, false, null, false, 1, 0, 0, false, null, false, false, null, null, null, null, null, interfaceC4339a19, (Function1) objM87133R5, c28655q, (i314 << 3) | 6 | (i314 << 12) | (i314 << 24), 3072, 1769472, 33545964);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f16, c2314t4));
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement8 = new LayoutWeightElement(1.0f, true);
                    List<String> listM119523s8 = m119523s(interfaceC28601c3);
                    i34 = i15 & 7168;
                    if (i34 == 2048) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (z16) {
                        objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                        c28655q.m87172p0(objM87133R6);
                    }
                    Function1 function118 = (Function1) objM87133R6;
                    if ((57344 & i15) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (z17) {
                        interfaceC28601c6 = interfaceC28601c3;
                        function6 = function5;
                        objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        interfaceC28601c6 = interfaceC28601c3;
                        function6 = function5;
                        objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                        c28655q.m87172p0(objM87133R7);
                    }
                    Function1 function119 = (Function1) objM87133R7;
                    if ((i15 & 458752) == 131072) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R8 = c28655q.m87133R();
                    if (z18) {
                        objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                        c28655q.m87172p0(objM87133R8);
                    }
                    m119501K(listM119523s8, function118, function119, (InterfaceC4339a) objM87133R8, layoutWeightElement8, c28655q, 0, 0);
                    Modifier modifierM91835e8 = AbstractC30007c.m91835e(c2314t4, f16, c28655q, c2314t4, 1.0f);
                    C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM91835e8);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i19, c22994r1M66759a8);
                    AbstractC28683x.m87239G(c28655q, c0209i113, interfaceC28653p1M87165m12);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i112, modifierM118962N12);
                    AbstractC33088k.g gVar8 = new AbstractC33088k.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                    boolean zM119497G8 = m119497G(interfaceC28601c2);
                    TextResource textResourceM21278l1119 = AbstractC8693b.m21278l("Enable Caching");
                    objM87133R9 = c28655q.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C29802c(24, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R9);
                    }
                    Function1 function1110 = function6;
                    AbstractC33087j.m104824f(textResourceM21278l1119, gVar8, zM119497G8, false, 0, 0L, null, null, false, 0L, (Function1) objM87133R9, c28655q, i314 | (AbstractC33088k.g.f137992d << 3), 6, MessageListItemViewType.UNREAD_SEPARATOR);
                    AbstractC18489d0.m53356B(c28655q, true, c2314t4, f16, c28655q);
                    Modifier modifierM3409f16 = AbstractC1102d.m3409f(1.0f, c2314t4);
                    TextResource textResourceM21278l11110 = AbstractC8693b.m21278l("Let's Go!");
                    boolean z215 = !AbstractC39414r.m125890i0(m119495E(interfaceC28601c5));
                    if (i34 == 2048) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objM87133R10 = c28655q.m87133R();
                    if (z19) {
                        objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                        c28655q.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                        c28655q.m87172p0(objM87133R10);
                    }
                    AbstractC27292z.m82343j(modifierM3409f16, z215, false, null, null, null, textResourceM21278l11110, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R10, c28655q, (i314 << 18) | 6, 0, 8124);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    interfaceC4339a4 = interfaceC4339a7;
                    str3 = str7;
                    z15 = z213;
                    function3 = function1110;
                    list3 = list7;
                    interfaceC4339a5 = interfaceC4339a17;
                } else {
                    c28655q.m87138X();
                    interfaceC4351m2 = interfaceC4351m;
                    interfaceC4339a4 = interfaceC4339a;
                    str3 = str2;
                    z15 = z13;
                    list3 = list2;
                    interfaceC4339a5 = interfaceC4339a3;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3922f(str3, z15, list3, interfaceC4351m2, function3, interfaceC4339a4, interfaceC4339a5, i13, i14);
                }
            }
            i15 |= 384;
            list2 = list;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    if (c28655q.m87157i(interfaceC4351m)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        function2 = function1;
                        if (c28655q.m87157i(function2)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q.m87157i(interfaceC4339a)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                    i28 = i14 & 64;
                    if (i28 != 0) {
                        i15 |= 1572864;
                        interfaceC4339a3 = interfaceC4339a2;
                    } else {
                        interfaceC4339a3 = interfaceC4339a2;
                        if ((i13 & 1572864) == 0) {
                            if (c28655q.m87157i(interfaceC4339a3)) {
                                i29 = 1048576;
                            } else {
                                i29 = 524288;
                            }
                            i15 |= i29;
                        }
                    }
                    if ((i15 & 599187) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z14)) {
                        if (i35 != 0) {
                            str2 = "";
                        }
                        if (i36 != 0) {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            list2 = C25271y.f99162w;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i18 != 0) {
                            objM87133R14 = c28655q.m87133R();
                            if (objM87133R14 == c28676v0) {
                                objM87133R14 = new C35728q(16, (byte) 0);
                                c28655q.m87172p0(objM87133R14);
                            }
                            interfaceC4351m2 = (InterfaceC4351m) objM87133R14;
                        } else {
                            interfaceC4351m2 = interfaceC4351m;
                        }
                        if (i24 != 0) {
                            objM87133R13 = c28655q.m87133R();
                            if (objM87133R13 == c28676v0) {
                                objM87133R13 = new C37168b(13);
                                c28655q.m87172p0(objM87133R13);
                            }
                            function4 = (Function1) objM87133R13;
                        } else {
                            function4 = function2;
                        }
                        if (i26 != 0) {
                            objM87133R12 = c28655q.m87133R();
                            if (objM87133R12 == c28676v0) {
                                objM87133R12 = new C37312d(0);
                                c28655q.m87172p0(objM87133R12);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R12;
                        } else {
                            interfaceC4339a6 = interfaceC4339a;
                        }
                        if (i28 != 0) {
                            objM87133R11 = c28655q.m87133R();
                            if (objM87133R11 == c28676v0) {
                                objM87133R11 = new C37312d(1);
                                c28655q.m87172p0(objM87133R11);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R11;
                        }
                        interfaceC4339a7 = interfaceC4339a6;
                        InterfaceC4339a interfaceC4339a110 = interfaceC4339a3;
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(str2);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC31061c.m95647w(z13, c28655q);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87272z(list2);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                        C2314t c2314t5 = C2314t.f9131w;
                        String str8 = str2;
                        float f17 = 2 * 8;
                        Modifier modifierM3394p5 = AbstractC1099a.m3394p(f17, AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, c2314t5), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                        boolean z216 = z13;
                        C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        function5 = function4;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                        Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM3394p5);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        List<String> list8 = list2;
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        C0209i c0209i114 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i114, c23010xM66775a5);
                        c0209i = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m13);
                        c0209i2 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            c0209i3 = c0209i;
                            if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i115 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N13);
                            C0209i c0209i116 = c0209i3;
                            AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Arch V2 Playground")), null, interfaceC4339a110, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 >> 9) & 7168), 53);
                            Modifier modifierM3409f17 = AbstractC1102d.m3409f(1.0f, c2314t5);
                            TextResource textResourceM21278l11111 = AbstractC8693b.m21278l(m119495E(interfaceC28601c1));
                            TextResource textResourceM21278l11112 = AbstractC8693b.m21278l("");
                            TextResource textResourceM21278l11113 = AbstractC8693b.m21278l("");
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C37312d(2);
                                c28655q.m87172p0(objM87133R4);
                            }
                            InterfaceC4339a interfaceC4339a111 = (InterfaceC4339a) objM87133R4;
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                interfaceC28601c4 = interfaceC28601c1;
                                objM87133R5 = new C29802c(25, interfaceC28601c4);
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                interfaceC28601c4 = interfaceC28601c1;
                            }
                            int i315 = TextResource.$stable;
                            interfaceC28601c5 = interfaceC28601c4;
                            AbstractC30792k.m94679m(modifierM3409f17, textResourceM21278l11111, null, null, textResourceM21278l11112, null, null, 0L, textResourceM21278l11113, false, false, null, false, 1, 0, 0, false, null, false, false, null, null, null, null, null, interfaceC4339a111, (Function1) objM87133R5, c28655q, (i315 << 3) | 6 | (i315 << 12) | (i315 << 24), 3072, 1769472, 33545964);
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f17, c2314t5));
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            LayoutWeightElement layoutWeightElement9 = new LayoutWeightElement(1.0f, true);
                            List<String> listM119523s9 = m119523s(interfaceC28601c3);
                            i34 = i15 & 7168;
                            if (i34 == 2048) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objM87133R6 = c28655q.m87133R();
                            if (z16) {
                                objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                                c28655q.m87172p0(objM87133R6);
                            } else {
                                objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                                c28655q.m87172p0(objM87133R6);
                            }
                            Function1 function1111 = (Function1) objM87133R6;
                            if ((57344 & i15) == 16384) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objM87133R7 = c28655q.m87133R();
                            if (z17) {
                                interfaceC28601c6 = interfaceC28601c3;
                                function6 = function5;
                                objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                                c28655q.m87172p0(objM87133R7);
                            } else {
                                interfaceC28601c6 = interfaceC28601c3;
                                function6 = function5;
                                objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                                c28655q.m87172p0(objM87133R7);
                            }
                            Function1 function1112 = (Function1) objM87133R7;
                            if ((i15 & 458752) == 131072) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            objM87133R8 = c28655q.m87133R();
                            if (z18) {
                                objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                                c28655q.m87172p0(objM87133R8);
                            } else {
                                objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                                c28655q.m87172p0(objM87133R8);
                            }
                            m119501K(listM119523s9, function1111, function1112, (InterfaceC4339a) objM87133R8, layoutWeightElement9, c28655q, 0, 0);
                            Modifier modifierM91835e9 = AbstractC30007c.m91835e(c2314t5, f17, c28655q, c2314t5, 1.0f);
                            C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                            Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierM91835e9);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i114, c22994r1M66759a9);
                            AbstractC28683x.m87239G(c28655q, c0209i116, interfaceC28653p1M87165m14);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N14);
                            AbstractC33088k.g gVar9 = new AbstractC33088k.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                            boolean zM119497G9 = m119497G(interfaceC28601c2);
                            TextResource textResourceM21278l11114 = AbstractC8693b.m21278l("Enable Caching");
                            objM87133R9 = c28655q.m87133R();
                            if (objM87133R9 == c28676v0) {
                                objM87133R9 = new C29802c(24, interfaceC28601c2);
                                c28655q.m87172p0(objM87133R9);
                            }
                            Function1 function1113 = function6;
                            AbstractC33087j.m104824f(textResourceM21278l11114, gVar9, zM119497G9, false, 0, 0L, null, null, false, 0L, (Function1) objM87133R9, c28655q, i315 | (AbstractC33088k.g.f137992d << 3), 6, MessageListItemViewType.UNREAD_SEPARATOR);
                            AbstractC18489d0.m53356B(c28655q, true, c2314t5, f17, c28655q);
                            Modifier modifierM3409f18 = AbstractC1102d.m3409f(1.0f, c2314t5);
                            TextResource textResourceM21278l11115 = AbstractC8693b.m21278l("Let's Go!");
                            boolean z217 = !AbstractC39414r.m125890i0(m119495E(interfaceC28601c5));
                            if (i34 == 2048) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            objM87133R10 = c28655q.m87133R();
                            if (z19) {
                                objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                                c28655q.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                                c28655q.m87172p0(objM87133R10);
                            }
                            AbstractC27292z.m82343j(modifierM3409f18, z217, false, null, null, null, textResourceM21278l11115, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R10, c28655q, (i315 << 18) | 6, 0, 8124);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            interfaceC4339a4 = interfaceC4339a7;
                            str3 = str8;
                            z15 = z216;
                            function3 = function1113;
                            list3 = list8;
                            interfaceC4339a5 = interfaceC4339a110;
                        } else {
                            c0209i3 = c0209i;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                        C0209i c0209i117 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i117, modifierM118962N13);
                        C0209i c0209i118 = c0209i3;
                        AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Arch V2 Playground")), null, interfaceC4339a110, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 >> 9) & 7168), 53);
                        Modifier modifierM3409f19 = AbstractC1102d.m3409f(1.0f, c2314t5);
                        TextResource textResourceM21278l11116 = AbstractC8693b.m21278l(m119495E(interfaceC28601c1));
                        TextResource textResourceM21278l11117 = AbstractC8693b.m21278l("");
                        TextResource textResourceM21278l11118 = AbstractC8693b.m21278l("");
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C37312d(2);
                            c28655q.m87172p0(objM87133R4);
                        }
                        InterfaceC4339a interfaceC4339a112 = (InterfaceC4339a) objM87133R4;
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            interfaceC28601c4 = interfaceC28601c1;
                            objM87133R5 = new C29802c(25, interfaceC28601c4);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            interfaceC28601c4 = interfaceC28601c1;
                        }
                        int i316 = TextResource.$stable;
                        interfaceC28601c5 = interfaceC28601c4;
                        AbstractC30792k.m94679m(modifierM3409f19, textResourceM21278l11116, null, null, textResourceM21278l11117, null, null, 0L, textResourceM21278l11118, false, false, null, false, 1, 0, 0, false, null, false, false, null, null, null, null, null, interfaceC4339a112, (Function1) objM87133R5, c28655q, (i316 << 3) | 6 | (i316 << 12) | (i316 << 24), 3072, 1769472, 33545964);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f17, c2314t5));
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement10 = new LayoutWeightElement(1.0f, true);
                        List<String> listM119523s10 = m119523s(interfaceC28601c3);
                        i34 = i15 & 7168;
                        if (i34 == 2048) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R6 = c28655q.m87133R();
                        if (z16) {
                            objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                            c28655q.m87172p0(objM87133R6);
                        }
                        Function1 function1114 = (Function1) objM87133R6;
                        if ((57344 & i15) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (z17) {
                            interfaceC28601c6 = interfaceC28601c3;
                            function6 = function5;
                            objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            interfaceC28601c6 = interfaceC28601c3;
                            function6 = function5;
                            objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                            c28655q.m87172p0(objM87133R7);
                        }
                        Function1 function1115 = (Function1) objM87133R7;
                        if ((i15 & 458752) == 131072) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objM87133R8 = c28655q.m87133R();
                        if (z18) {
                            objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                            c28655q.m87172p0(objM87133R8);
                        } else {
                            objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                            c28655q.m87172p0(objM87133R8);
                        }
                        m119501K(listM119523s10, function1114, function1115, (InterfaceC4339a) objM87133R8, layoutWeightElement10, c28655q, 0, 0);
                        Modifier modifierM91835e10 = AbstractC30007c.m91835e(c2314t5, f17, c28655q, c2314t5, 1.0f);
                        C22994r1 c22994r1M66759a10 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                        Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM91835e10);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i114, c22994r1M66759a10);
                        AbstractC28683x.m87239G(c28655q, c0209i118, interfaceC28653p1M87165m15);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i117, modifierM118962N15);
                        AbstractC33088k.g gVar10 = new AbstractC33088k.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                        boolean zM119497G10 = m119497G(interfaceC28601c2);
                        TextResource textResourceM21278l11119 = AbstractC8693b.m21278l("Enable Caching");
                        objM87133R9 = c28655q.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C29802c(24, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R9);
                        }
                        Function1 function1116 = function6;
                        AbstractC33087j.m104824f(textResourceM21278l11119, gVar10, zM119497G10, false, 0, 0L, null, null, false, 0L, (Function1) objM87133R9, c28655q, i316 | (AbstractC33088k.g.f137992d << 3), 6, MessageListItemViewType.UNREAD_SEPARATOR);
                        AbstractC18489d0.m53356B(c28655q, true, c2314t5, f17, c28655q);
                        Modifier modifierM3409f110 = AbstractC1102d.m3409f(1.0f, c2314t5);
                        TextResource textResourceM21278l111110 = AbstractC8693b.m21278l("Let's Go!");
                        boolean z218 = !AbstractC39414r.m125890i0(m119495E(interfaceC28601c5));
                        if (i34 == 2048) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        objM87133R10 = c28655q.m87133R();
                        if (z19) {
                            objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                            c28655q.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                            c28655q.m87172p0(objM87133R10);
                        }
                        AbstractC27292z.m82343j(modifierM3409f110, z218, false, null, null, null, textResourceM21278l111110, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R10, c28655q, (i316 << 18) | 6, 0, 8124);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        interfaceC4339a4 = interfaceC4339a7;
                        str3 = str8;
                        z15 = z216;
                        function3 = function1116;
                        list3 = list8;
                        interfaceC4339a5 = interfaceC4339a110;
                    } else {
                        c28655q.m87138X();
                        interfaceC4351m2 = interfaceC4351m;
                        interfaceC4339a4 = interfaceC4339a;
                        str3 = str2;
                        z15 = z13;
                        list3 = list2;
                        interfaceC4339a5 = interfaceC4339a3;
                        function3 = function2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C3922f(str3, z15, list3, interfaceC4351m2, function3, interfaceC4339a4, interfaceC4339a5, i13, i14);
                    }
                }
                i15 |= 24576;
                function2 = function1;
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(interfaceC4339a)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                i28 = i14 & 64;
                if (i28 != 0) {
                    i15 |= 1572864;
                    interfaceC4339a3 = interfaceC4339a2;
                } else {
                    interfaceC4339a3 = interfaceC4339a2;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q.m87157i(interfaceC4339a3)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i15 |= i29;
                    }
                }
                if ((i15 & 599187) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    if (i35 != 0) {
                        str2 = "";
                    }
                    if (i36 != 0) {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        list2 = C25271y.f99162w;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R14 = c28655q.m87133R();
                        if (objM87133R14 == c28676v0) {
                            objM87133R14 = new C35728q(16, (byte) 0);
                            c28655q.m87172p0(objM87133R14);
                        }
                        interfaceC4351m2 = (InterfaceC4351m) objM87133R14;
                    } else {
                        interfaceC4351m2 = interfaceC4351m;
                    }
                    if (i24 != 0) {
                        objM87133R13 = c28655q.m87133R();
                        if (objM87133R13 == c28676v0) {
                            objM87133R13 = new C37168b(13);
                            c28655q.m87172p0(objM87133R13);
                        }
                        function4 = (Function1) objM87133R13;
                    } else {
                        function4 = function2;
                    }
                    if (i26 != 0) {
                        objM87133R12 = c28655q.m87133R();
                        if (objM87133R12 == c28676v0) {
                            objM87133R12 = new C37312d(0);
                            c28655q.m87172p0(objM87133R12);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R12;
                    } else {
                        interfaceC4339a6 = interfaceC4339a;
                    }
                    if (i28 != 0) {
                        objM87133R11 = c28655q.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C37312d(1);
                            c28655q.m87172p0(objM87133R11);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R11;
                    }
                    interfaceC4339a7 = interfaceC4339a6;
                    InterfaceC4339a interfaceC4339a113 = interfaceC4339a3;
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(str2);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC31061c.m95647w(z13, c28655q);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(list2);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                    C2314t c2314t6 = C2314t.f9131w;
                    String str9 = str2;
                    float f18 = 2 * 8;
                    Modifier modifierM3394p6 = AbstractC1099a.m3394p(f18, AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, c2314t6), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                    boolean z219 = z13;
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    function5 = function4;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                    Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM3394p6);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    List<String> list9 = list2;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i119 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i119, c23010xM66775a6);
                    c0209i = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m16);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        c0209i3 = c0209i;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i1110 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i1110, modifierM118962N16);
                        C0209i c0209i1111 = c0209i3;
                        AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Arch V2 Playground")), null, interfaceC4339a113, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 >> 9) & 7168), 53);
                        Modifier modifierM3409f111 = AbstractC1102d.m3409f(1.0f, c2314t6);
                        TextResource textResourceM21278l111111 = AbstractC8693b.m21278l(m119495E(interfaceC28601c1));
                        TextResource textResourceM21278l111112 = AbstractC8693b.m21278l("");
                        TextResource textResourceM21278l111113 = AbstractC8693b.m21278l("");
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C37312d(2);
                            c28655q.m87172p0(objM87133R4);
                        }
                        InterfaceC4339a interfaceC4339a114 = (InterfaceC4339a) objM87133R4;
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            interfaceC28601c4 = interfaceC28601c1;
                            objM87133R5 = new C29802c(25, interfaceC28601c4);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            interfaceC28601c4 = interfaceC28601c1;
                        }
                        int i317 = TextResource.$stable;
                        interfaceC28601c5 = interfaceC28601c4;
                        AbstractC30792k.m94679m(modifierM3409f111, textResourceM21278l111111, null, null, textResourceM21278l111112, null, null, 0L, textResourceM21278l111113, false, false, null, false, 1, 0, 0, false, null, false, false, null, null, null, null, null, interfaceC4339a114, (Function1) objM87133R5, c28655q, (i317 << 3) | 6 | (i317 << 12) | (i317 << 24), 3072, 1769472, 33545964);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f18, c2314t6));
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement11 = new LayoutWeightElement(1.0f, true);
                        List<String> listM119523s11 = m119523s(interfaceC28601c3);
                        i34 = i15 & 7168;
                        if (i34 == 2048) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R6 = c28655q.m87133R();
                        if (z16) {
                            objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                            c28655q.m87172p0(objM87133R6);
                        }
                        Function1 function1117 = (Function1) objM87133R6;
                        if ((57344 & i15) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (z17) {
                            interfaceC28601c6 = interfaceC28601c3;
                            function6 = function5;
                            objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            interfaceC28601c6 = interfaceC28601c3;
                            function6 = function5;
                            objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                            c28655q.m87172p0(objM87133R7);
                        }
                        Function1 function1118 = (Function1) objM87133R7;
                        if ((i15 & 458752) == 131072) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objM87133R8 = c28655q.m87133R();
                        if (z18) {
                            objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                            c28655q.m87172p0(objM87133R8);
                        } else {
                            objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                            c28655q.m87172p0(objM87133R8);
                        }
                        m119501K(listM119523s11, function1117, function1118, (InterfaceC4339a) objM87133R8, layoutWeightElement11, c28655q, 0, 0);
                        Modifier modifierM91835e11 = AbstractC30007c.m91835e(c2314t6, f18, c28655q, c2314t6, 1.0f);
                        C22994r1 c22994r1M66759a11 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q.m87165m();
                        Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q, modifierM91835e11);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i119, c22994r1M66759a11);
                        AbstractC28683x.m87239G(c28655q, c0209i1111, interfaceC28653p1M87165m17);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i1110, modifierM118962N17);
                        AbstractC33088k.g gVar11 = new AbstractC33088k.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                        boolean zM119497G11 = m119497G(interfaceC28601c2);
                        TextResource textResourceM21278l111114 = AbstractC8693b.m21278l("Enable Caching");
                        objM87133R9 = c28655q.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C29802c(24, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R9);
                        }
                        Function1 function1119 = function6;
                        AbstractC33087j.m104824f(textResourceM21278l111114, gVar11, zM119497G11, false, 0, 0L, null, null, false, 0L, (Function1) objM87133R9, c28655q, i317 | (AbstractC33088k.g.f137992d << 3), 6, MessageListItemViewType.UNREAD_SEPARATOR);
                        AbstractC18489d0.m53356B(c28655q, true, c2314t6, f18, c28655q);
                        Modifier modifierM3409f112 = AbstractC1102d.m3409f(1.0f, c2314t6);
                        TextResource textResourceM21278l111115 = AbstractC8693b.m21278l("Let's Go!");
                        boolean z2110 = !AbstractC39414r.m125890i0(m119495E(interfaceC28601c5));
                        if (i34 == 2048) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        objM87133R10 = c28655q.m87133R();
                        if (z19) {
                            objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                            c28655q.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                            c28655q.m87172p0(objM87133R10);
                        }
                        AbstractC27292z.m82343j(modifierM3409f112, z2110, false, null, null, null, textResourceM21278l111115, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R10, c28655q, (i317 << 18) | 6, 0, 8124);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        interfaceC4339a4 = interfaceC4339a7;
                        str3 = str9;
                        z15 = z219;
                        function3 = function1119;
                        list3 = list9;
                        interfaceC4339a5 = interfaceC4339a113;
                    } else {
                        c0209i3 = c0209i;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                    C0209i c0209i1112 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i1112, modifierM118962N16);
                    C0209i c0209i1113 = c0209i3;
                    AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Arch V2 Playground")), null, interfaceC4339a113, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 >> 9) & 7168), 53);
                    Modifier modifierM3409f113 = AbstractC1102d.m3409f(1.0f, c2314t6);
                    TextResource textResourceM21278l111116 = AbstractC8693b.m21278l(m119495E(interfaceC28601c1));
                    TextResource textResourceM21278l111117 = AbstractC8693b.m21278l("");
                    TextResource textResourceM21278l111118 = AbstractC8693b.m21278l("");
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C37312d(2);
                        c28655q.m87172p0(objM87133R4);
                    }
                    InterfaceC4339a interfaceC4339a115 = (InterfaceC4339a) objM87133R4;
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        interfaceC28601c4 = interfaceC28601c1;
                        objM87133R5 = new C29802c(25, interfaceC28601c4);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        interfaceC28601c4 = interfaceC28601c1;
                    }
                    int i318 = TextResource.$stable;
                    interfaceC28601c5 = interfaceC28601c4;
                    AbstractC30792k.m94679m(modifierM3409f113, textResourceM21278l111116, null, null, textResourceM21278l111117, null, null, 0L, textResourceM21278l111118, false, false, null, false, 1, 0, 0, false, null, false, false, null, null, null, null, null, interfaceC4339a115, (Function1) objM87133R5, c28655q, (i318 << 3) | 6 | (i318 << 12) | (i318 << 24), 3072, 1769472, 33545964);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f18, c2314t6));
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement12 = new LayoutWeightElement(1.0f, true);
                    List<String> listM119523s12 = m119523s(interfaceC28601c3);
                    i34 = i15 & 7168;
                    if (i34 == 2048) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (z16) {
                        objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                        c28655q.m87172p0(objM87133R6);
                    }
                    Function1 function11110 = (Function1) objM87133R6;
                    if ((57344 & i15) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (z17) {
                        interfaceC28601c6 = interfaceC28601c3;
                        function6 = function5;
                        objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        interfaceC28601c6 = interfaceC28601c3;
                        function6 = function5;
                        objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                        c28655q.m87172p0(objM87133R7);
                    }
                    Function1 function11111 = (Function1) objM87133R7;
                    if ((i15 & 458752) == 131072) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R8 = c28655q.m87133R();
                    if (z18) {
                        objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                        c28655q.m87172p0(objM87133R8);
                    }
                    m119501K(listM119523s12, function11110, function11111, (InterfaceC4339a) objM87133R8, layoutWeightElement12, c28655q, 0, 0);
                    Modifier modifierM91835e12 = AbstractC30007c.m91835e(c2314t6, f18, c28655q, c2314t6, 1.0f);
                    C22994r1 c22994r1M66759a12 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q.m87165m();
                    Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q, modifierM91835e12);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i119, c22994r1M66759a12);
                    AbstractC28683x.m87239G(c28655q, c0209i1113, interfaceC28653p1M87165m18);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1112, modifierM118962N18);
                    AbstractC33088k.g gVar12 = new AbstractC33088k.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                    boolean zM119497G12 = m119497G(interfaceC28601c2);
                    TextResource textResourceM21278l111119 = AbstractC8693b.m21278l("Enable Caching");
                    objM87133R9 = c28655q.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C29802c(24, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R9);
                    }
                    Function1 function11112 = function6;
                    AbstractC33087j.m104824f(textResourceM21278l111119, gVar12, zM119497G12, false, 0, 0L, null, null, false, 0L, (Function1) objM87133R9, c28655q, i318 | (AbstractC33088k.g.f137992d << 3), 6, MessageListItemViewType.UNREAD_SEPARATOR);
                    AbstractC18489d0.m53356B(c28655q, true, c2314t6, f18, c28655q);
                    Modifier modifierM3409f114 = AbstractC1102d.m3409f(1.0f, c2314t6);
                    TextResource textResourceM21278l1111110 = AbstractC8693b.m21278l("Let's Go!");
                    boolean z2111 = !AbstractC39414r.m125890i0(m119495E(interfaceC28601c5));
                    if (i34 == 2048) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objM87133R10 = c28655q.m87133R();
                    if (z19) {
                        objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                        c28655q.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                        c28655q.m87172p0(objM87133R10);
                    }
                    AbstractC27292z.m82343j(modifierM3409f114, z2111, false, null, null, null, textResourceM21278l1111110, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R10, c28655q, (i318 << 18) | 6, 0, 8124);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    interfaceC4339a4 = interfaceC4339a7;
                    str3 = str9;
                    z15 = z219;
                    function3 = function11112;
                    list3 = list9;
                    interfaceC4339a5 = interfaceC4339a113;
                } else {
                    c28655q.m87138X();
                    interfaceC4351m2 = interfaceC4351m;
                    interfaceC4339a4 = interfaceC4339a;
                    str3 = str2;
                    z15 = z13;
                    list3 = list2;
                    interfaceC4339a5 = interfaceC4339a3;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3922f(str3, z15, list3, interfaceC4351m2, function3, interfaceC4339a4, interfaceC4339a5, i13, i14);
                }
            }
            i15 |= 3072;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(interfaceC4339a)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                i28 = i14 & 64;
                if (i28 != 0) {
                    i15 |= 1572864;
                    interfaceC4339a3 = interfaceC4339a2;
                } else {
                    interfaceC4339a3 = interfaceC4339a2;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q.m87157i(interfaceC4339a3)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i15 |= i29;
                    }
                }
                if ((i15 & 599187) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    if (i35 != 0) {
                        str2 = "";
                    }
                    if (i36 != 0) {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        list2 = C25271y.f99162w;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R14 = c28655q.m87133R();
                        if (objM87133R14 == c28676v0) {
                            objM87133R14 = new C35728q(16, (byte) 0);
                            c28655q.m87172p0(objM87133R14);
                        }
                        interfaceC4351m2 = (InterfaceC4351m) objM87133R14;
                    } else {
                        interfaceC4351m2 = interfaceC4351m;
                    }
                    if (i24 != 0) {
                        objM87133R13 = c28655q.m87133R();
                        if (objM87133R13 == c28676v0) {
                            objM87133R13 = new C37168b(13);
                            c28655q.m87172p0(objM87133R13);
                        }
                        function4 = (Function1) objM87133R13;
                    } else {
                        function4 = function2;
                    }
                    if (i26 != 0) {
                        objM87133R12 = c28655q.m87133R();
                        if (objM87133R12 == c28676v0) {
                            objM87133R12 = new C37312d(0);
                            c28655q.m87172p0(objM87133R12);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R12;
                    } else {
                        interfaceC4339a6 = interfaceC4339a;
                    }
                    if (i28 != 0) {
                        objM87133R11 = c28655q.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C37312d(1);
                            c28655q.m87172p0(objM87133R11);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R11;
                    }
                    interfaceC4339a7 = interfaceC4339a6;
                    InterfaceC4339a interfaceC4339a116 = interfaceC4339a3;
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(str2);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC31061c.m95647w(z13, c28655q);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(list2);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                    C2314t c2314t7 = C2314t.f9131w;
                    String str10 = str2;
                    float f19 = 2 * 8;
                    Modifier modifierM3394p7 = AbstractC1099a.m3394p(f19, AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, c2314t7), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                    boolean z2112 = z13;
                    C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    function5 = function4;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q.m87165m();
                    Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q, modifierM3394p7);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    List<String> list10 = list2;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i1114 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i1114, c23010xM66775a7);
                    c0209i = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m19);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        c0209i3 = c0209i;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i1115 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i1115, modifierM118962N19);
                        C0209i c0209i1116 = c0209i3;
                        AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Arch V2 Playground")), null, interfaceC4339a116, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 >> 9) & 7168), 53);
                        Modifier modifierM3409f115 = AbstractC1102d.m3409f(1.0f, c2314t7);
                        TextResource textResourceM21278l1111111 = AbstractC8693b.m21278l(m119495E(interfaceC28601c1));
                        TextResource textResourceM21278l1111112 = AbstractC8693b.m21278l("");
                        TextResource textResourceM21278l1111113 = AbstractC8693b.m21278l("");
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C37312d(2);
                            c28655q.m87172p0(objM87133R4);
                        }
                        InterfaceC4339a interfaceC4339a117 = (InterfaceC4339a) objM87133R4;
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            interfaceC28601c4 = interfaceC28601c1;
                            objM87133R5 = new C29802c(25, interfaceC28601c4);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            interfaceC28601c4 = interfaceC28601c1;
                        }
                        int i319 = TextResource.$stable;
                        interfaceC28601c5 = interfaceC28601c4;
                        AbstractC30792k.m94679m(modifierM3409f115, textResourceM21278l1111111, null, null, textResourceM21278l1111112, null, null, 0L, textResourceM21278l1111113, false, false, null, false, 1, 0, 0, false, null, false, false, null, null, null, null, null, interfaceC4339a117, (Function1) objM87133R5, c28655q, (i319 << 3) | 6 | (i319 << 12) | (i319 << 24), 3072, 1769472, 33545964);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f19, c2314t7));
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement13 = new LayoutWeightElement(1.0f, true);
                        List<String> listM119523s13 = m119523s(interfaceC28601c3);
                        i34 = i15 & 7168;
                        if (i34 == 2048) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R6 = c28655q.m87133R();
                        if (z16) {
                            objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                            c28655q.m87172p0(objM87133R6);
                        }
                        Function1 function11113 = (Function1) objM87133R6;
                        if ((57344 & i15) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (z17) {
                            interfaceC28601c6 = interfaceC28601c3;
                            function6 = function5;
                            objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            interfaceC28601c6 = interfaceC28601c3;
                            function6 = function5;
                            objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                            c28655q.m87172p0(objM87133R7);
                        }
                        Function1 function11114 = (Function1) objM87133R7;
                        if ((i15 & 458752) == 131072) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objM87133R8 = c28655q.m87133R();
                        if (z18) {
                            objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                            c28655q.m87172p0(objM87133R8);
                        } else {
                            objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                            c28655q.m87172p0(objM87133R8);
                        }
                        m119501K(listM119523s13, function11113, function11114, (InterfaceC4339a) objM87133R8, layoutWeightElement13, c28655q, 0, 0);
                        Modifier modifierM91835e13 = AbstractC30007c.m91835e(c2314t7, f19, c28655q, c2314t7, 1.0f);
                        C22994r1 c22994r1M66759a13 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q.m87165m();
                        Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q, modifierM91835e13);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i1114, c22994r1M66759a13);
                        AbstractC28683x.m87239G(c28655q, c0209i1116, interfaceC28653p1M87165m110);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i1115, modifierM118962N110);
                        AbstractC33088k.g gVar13 = new AbstractC33088k.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                        boolean zM119497G13 = m119497G(interfaceC28601c2);
                        TextResource textResourceM21278l1111114 = AbstractC8693b.m21278l("Enable Caching");
                        objM87133R9 = c28655q.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C29802c(24, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R9);
                        }
                        Function1 function11115 = function6;
                        AbstractC33087j.m104824f(textResourceM21278l1111114, gVar13, zM119497G13, false, 0, 0L, null, null, false, 0L, (Function1) objM87133R9, c28655q, i319 | (AbstractC33088k.g.f137992d << 3), 6, MessageListItemViewType.UNREAD_SEPARATOR);
                        AbstractC18489d0.m53356B(c28655q, true, c2314t7, f19, c28655q);
                        Modifier modifierM3409f116 = AbstractC1102d.m3409f(1.0f, c2314t7);
                        TextResource textResourceM21278l1111115 = AbstractC8693b.m21278l("Let's Go!");
                        boolean z2113 = !AbstractC39414r.m125890i0(m119495E(interfaceC28601c5));
                        if (i34 == 2048) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        objM87133R10 = c28655q.m87133R();
                        if (z19) {
                            objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                            c28655q.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                            c28655q.m87172p0(objM87133R10);
                        }
                        AbstractC27292z.m82343j(modifierM3409f116, z2113, false, null, null, null, textResourceM21278l1111115, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R10, c28655q, (i319 << 18) | 6, 0, 8124);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        interfaceC4339a4 = interfaceC4339a7;
                        str3 = str10;
                        z15 = z2112;
                        function3 = function11115;
                        list3 = list10;
                        interfaceC4339a5 = interfaceC4339a116;
                    } else {
                        c0209i3 = c0209i;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                    C0209i c0209i1117 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i1117, modifierM118962N19);
                    C0209i c0209i1118 = c0209i3;
                    AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Arch V2 Playground")), null, interfaceC4339a116, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 >> 9) & 7168), 53);
                    Modifier modifierM3409f117 = AbstractC1102d.m3409f(1.0f, c2314t7);
                    TextResource textResourceM21278l1111116 = AbstractC8693b.m21278l(m119495E(interfaceC28601c1));
                    TextResource textResourceM21278l1111117 = AbstractC8693b.m21278l("");
                    TextResource textResourceM21278l1111118 = AbstractC8693b.m21278l("");
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C37312d(2);
                        c28655q.m87172p0(objM87133R4);
                    }
                    InterfaceC4339a interfaceC4339a118 = (InterfaceC4339a) objM87133R4;
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        interfaceC28601c4 = interfaceC28601c1;
                        objM87133R5 = new C29802c(25, interfaceC28601c4);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        interfaceC28601c4 = interfaceC28601c1;
                    }
                    int i3110 = TextResource.$stable;
                    interfaceC28601c5 = interfaceC28601c4;
                    AbstractC30792k.m94679m(modifierM3409f117, textResourceM21278l1111116, null, null, textResourceM21278l1111117, null, null, 0L, textResourceM21278l1111118, false, false, null, false, 1, 0, 0, false, null, false, false, null, null, null, null, null, interfaceC4339a118, (Function1) objM87133R5, c28655q, (i3110 << 3) | 6 | (i3110 << 12) | (i3110 << 24), 3072, 1769472, 33545964);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f19, c2314t7));
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement14 = new LayoutWeightElement(1.0f, true);
                    List<String> listM119523s14 = m119523s(interfaceC28601c3);
                    i34 = i15 & 7168;
                    if (i34 == 2048) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (z16) {
                        objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                        c28655q.m87172p0(objM87133R6);
                    }
                    Function1 function11116 = (Function1) objM87133R6;
                    if ((57344 & i15) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (z17) {
                        interfaceC28601c6 = interfaceC28601c3;
                        function6 = function5;
                        objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        interfaceC28601c6 = interfaceC28601c3;
                        function6 = function5;
                        objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                        c28655q.m87172p0(objM87133R7);
                    }
                    Function1 function11117 = (Function1) objM87133R7;
                    if ((i15 & 458752) == 131072) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R8 = c28655q.m87133R();
                    if (z18) {
                        objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                        c28655q.m87172p0(objM87133R8);
                    }
                    m119501K(listM119523s14, function11116, function11117, (InterfaceC4339a) objM87133R8, layoutWeightElement14, c28655q, 0, 0);
                    Modifier modifierM91835e14 = AbstractC30007c.m91835e(c2314t7, f19, c28655q, c2314t7, 1.0f);
                    C22994r1 c22994r1M66759a14 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q.m87165m();
                    Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q, modifierM91835e14);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1114, c22994r1M66759a14);
                    AbstractC28683x.m87239G(c28655q, c0209i1118, interfaceC28653p1M87165m111);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1117, modifierM118962N111);
                    AbstractC33088k.g gVar14 = new AbstractC33088k.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                    boolean zM119497G14 = m119497G(interfaceC28601c2);
                    TextResource textResourceM21278l1111119 = AbstractC8693b.m21278l("Enable Caching");
                    objM87133R9 = c28655q.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C29802c(24, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R9);
                    }
                    Function1 function11118 = function6;
                    AbstractC33087j.m104824f(textResourceM21278l1111119, gVar14, zM119497G14, false, 0, 0L, null, null, false, 0L, (Function1) objM87133R9, c28655q, i3110 | (AbstractC33088k.g.f137992d << 3), 6, MessageListItemViewType.UNREAD_SEPARATOR);
                    AbstractC18489d0.m53356B(c28655q, true, c2314t7, f19, c28655q);
                    Modifier modifierM3409f118 = AbstractC1102d.m3409f(1.0f, c2314t7);
                    TextResource textResourceM21278l11111110 = AbstractC8693b.m21278l("Let's Go!");
                    boolean z2114 = !AbstractC39414r.m125890i0(m119495E(interfaceC28601c5));
                    if (i34 == 2048) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objM87133R10 = c28655q.m87133R();
                    if (z19) {
                        objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                        c28655q.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                        c28655q.m87172p0(objM87133R10);
                    }
                    AbstractC27292z.m82343j(modifierM3409f118, z2114, false, null, null, null, textResourceM21278l11111110, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R10, c28655q, (i3110 << 18) | 6, 0, 8124);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    interfaceC4339a4 = interfaceC4339a7;
                    str3 = str10;
                    z15 = z2112;
                    function3 = function11118;
                    list3 = list10;
                    interfaceC4339a5 = interfaceC4339a116;
                } else {
                    c28655q.m87138X();
                    interfaceC4351m2 = interfaceC4351m;
                    interfaceC4339a4 = interfaceC4339a;
                    str3 = str2;
                    z15 = z13;
                    list3 = list2;
                    interfaceC4339a5 = interfaceC4339a3;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3922f(str3, z15, list3, interfaceC4351m2, function3, interfaceC4339a4, interfaceC4339a5, i13, i14);
                }
            }
            i15 |= 24576;
            function2 = function1;
            i26 = i14 & 32;
            if (i26 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87157i(interfaceC4339a)) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i27;
            }
            i28 = i14 & 64;
            if (i28 != 0) {
                i15 |= 1572864;
                interfaceC4339a3 = interfaceC4339a2;
            } else {
                interfaceC4339a3 = interfaceC4339a2;
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87157i(interfaceC4339a3)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i15 |= i29;
                }
            }
            if ((i15 & 599187) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i35 != 0) {
                    str2 = "";
                }
                if (i36 != 0) {
                    z13 = true;
                }
                if (i16 != 0) {
                    list2 = C25271y.f99162w;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R14 = c28655q.m87133R();
                    if (objM87133R14 == c28676v0) {
                        objM87133R14 = new C35728q(16, (byte) 0);
                        c28655q.m87172p0(objM87133R14);
                    }
                    interfaceC4351m2 = (InterfaceC4351m) objM87133R14;
                } else {
                    interfaceC4351m2 = interfaceC4351m;
                }
                if (i24 != 0) {
                    objM87133R13 = c28655q.m87133R();
                    if (objM87133R13 == c28676v0) {
                        objM87133R13 = new C37168b(13);
                        c28655q.m87172p0(objM87133R13);
                    }
                    function4 = (Function1) objM87133R13;
                } else {
                    function4 = function2;
                }
                if (i26 != 0) {
                    objM87133R12 = c28655q.m87133R();
                    if (objM87133R12 == c28676v0) {
                        objM87133R12 = new C37312d(0);
                        c28655q.m87172p0(objM87133R12);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R12;
                } else {
                    interfaceC4339a6 = interfaceC4339a;
                }
                if (i28 != 0) {
                    objM87133R11 = c28655q.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C37312d(1);
                        c28655q.m87172p0(objM87133R11);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R11;
                }
                interfaceC4339a7 = interfaceC4339a6;
                InterfaceC4339a interfaceC4339a119 = interfaceC4339a3;
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(str2);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC31061c.m95647w(z13, c28655q);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(list2);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                C2314t c2314t8 = C2314t.f9131w;
                String str11 = str2;
                float f110 = 2 * 8;
                Modifier modifierM3394p8 = AbstractC1099a.m3394p(f110, AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, c2314t8), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                boolean z2115 = z13;
                C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                function5 = function4;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q.m87165m();
                Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q, modifierM3394p8);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                List<String> list11 = list2;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i1119 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i1119, c23010xM66775a8);
                c0209i = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m112);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    c0209i3 = c0209i;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i11110 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i11110, modifierM118962N112);
                    C0209i c0209i11111 = c0209i3;
                    AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Arch V2 Playground")), null, interfaceC4339a119, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 >> 9) & 7168), 53);
                    Modifier modifierM3409f119 = AbstractC1102d.m3409f(1.0f, c2314t8);
                    TextResource textResourceM21278l11111111 = AbstractC8693b.m21278l(m119495E(interfaceC28601c1));
                    TextResource textResourceM21278l11111112 = AbstractC8693b.m21278l("");
                    TextResource textResourceM21278l11111113 = AbstractC8693b.m21278l("");
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C37312d(2);
                        c28655q.m87172p0(objM87133R4);
                    }
                    InterfaceC4339a interfaceC4339a1110 = (InterfaceC4339a) objM87133R4;
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        interfaceC28601c4 = interfaceC28601c1;
                        objM87133R5 = new C29802c(25, interfaceC28601c4);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        interfaceC28601c4 = interfaceC28601c1;
                    }
                    int i3111 = TextResource.$stable;
                    interfaceC28601c5 = interfaceC28601c4;
                    AbstractC30792k.m94679m(modifierM3409f119, textResourceM21278l11111111, null, null, textResourceM21278l11111112, null, null, 0L, textResourceM21278l11111113, false, false, null, false, 1, 0, 0, false, null, false, false, null, null, null, null, null, interfaceC4339a1110, (Function1) objM87133R5, c28655q, (i3111 << 3) | 6 | (i3111 << 12) | (i3111 << 24), 3072, 1769472, 33545964);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f110, c2314t8));
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement15 = new LayoutWeightElement(1.0f, true);
                    List<String> listM119523s15 = m119523s(interfaceC28601c3);
                    i34 = i15 & 7168;
                    if (i34 == 2048) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (z16) {
                        objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                        c28655q.m87172p0(objM87133R6);
                    }
                    Function1 function11119 = (Function1) objM87133R6;
                    if ((57344 & i15) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (z17) {
                        interfaceC28601c6 = interfaceC28601c3;
                        function6 = function5;
                        objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        interfaceC28601c6 = interfaceC28601c3;
                        function6 = function5;
                        objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                        c28655q.m87172p0(objM87133R7);
                    }
                    Function1 function111110 = (Function1) objM87133R7;
                    if ((i15 & 458752) == 131072) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R8 = c28655q.m87133R();
                    if (z18) {
                        objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                        c28655q.m87172p0(objM87133R8);
                    }
                    m119501K(listM119523s15, function11119, function111110, (InterfaceC4339a) objM87133R8, layoutWeightElement15, c28655q, 0, 0);
                    Modifier modifierM91835e15 = AbstractC30007c.m91835e(c2314t8, f110, c28655q, c2314t8, 1.0f);
                    C22994r1 c22994r1M66759a15 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q.m87165m();
                    Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q, modifierM91835e15);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1119, c22994r1M66759a15);
                    AbstractC28683x.m87239G(c28655q, c0209i11111, interfaceC28653p1M87165m113);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11110, modifierM118962N113);
                    AbstractC33088k.g gVar15 = new AbstractC33088k.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                    boolean zM119497G15 = m119497G(interfaceC28601c2);
                    TextResource textResourceM21278l11111114 = AbstractC8693b.m21278l("Enable Caching");
                    objM87133R9 = c28655q.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C29802c(24, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R9);
                    }
                    Function1 function111111 = function6;
                    AbstractC33087j.m104824f(textResourceM21278l11111114, gVar15, zM119497G15, false, 0, 0L, null, null, false, 0L, (Function1) objM87133R9, c28655q, i3111 | (AbstractC33088k.g.f137992d << 3), 6, MessageListItemViewType.UNREAD_SEPARATOR);
                    AbstractC18489d0.m53356B(c28655q, true, c2314t8, f110, c28655q);
                    Modifier modifierM3409f1110 = AbstractC1102d.m3409f(1.0f, c2314t8);
                    TextResource textResourceM21278l11111115 = AbstractC8693b.m21278l("Let's Go!");
                    boolean z2116 = !AbstractC39414r.m125890i0(m119495E(interfaceC28601c5));
                    if (i34 == 2048) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objM87133R10 = c28655q.m87133R();
                    if (z19) {
                        objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                        c28655q.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                        c28655q.m87172p0(objM87133R10);
                    }
                    AbstractC27292z.m82343j(modifierM3409f1110, z2116, false, null, null, null, textResourceM21278l11111115, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R10, c28655q, (i3111 << 18) | 6, 0, 8124);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    interfaceC4339a4 = interfaceC4339a7;
                    str3 = str11;
                    z15 = z2115;
                    function3 = function111111;
                    list3 = list11;
                    interfaceC4339a5 = interfaceC4339a119;
                } else {
                    c0209i3 = c0209i;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                C0209i c0209i11112 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i11112, modifierM118962N112);
                C0209i c0209i11113 = c0209i3;
                AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Arch V2 Playground")), null, interfaceC4339a119, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 >> 9) & 7168), 53);
                Modifier modifierM3409f1111 = AbstractC1102d.m3409f(1.0f, c2314t8);
                TextResource textResourceM21278l11111116 = AbstractC8693b.m21278l(m119495E(interfaceC28601c1));
                TextResource textResourceM21278l11111117 = AbstractC8693b.m21278l("");
                TextResource textResourceM21278l11111118 = AbstractC8693b.m21278l("");
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C37312d(2);
                    c28655q.m87172p0(objM87133R4);
                }
                InterfaceC4339a interfaceC4339a1111 = (InterfaceC4339a) objM87133R4;
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    interfaceC28601c4 = interfaceC28601c1;
                    objM87133R5 = new C29802c(25, interfaceC28601c4);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    interfaceC28601c4 = interfaceC28601c1;
                }
                int i3112 = TextResource.$stable;
                interfaceC28601c5 = interfaceC28601c4;
                AbstractC30792k.m94679m(modifierM3409f1111, textResourceM21278l11111116, null, null, textResourceM21278l11111117, null, null, 0L, textResourceM21278l11111118, false, false, null, false, 1, 0, 0, false, null, false, false, null, null, null, null, null, interfaceC4339a1111, (Function1) objM87133R5, c28655q, (i3112 << 3) | 6 | (i3112 << 12) | (i3112 << 24), 3072, 1769472, 33545964);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f110, c2314t8));
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement16 = new LayoutWeightElement(1.0f, true);
                List<String> listM119523s16 = m119523s(interfaceC28601c3);
                i34 = i15 & 7168;
                if (i34 == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM87133R6 = c28655q.m87133R();
                if (z16) {
                    objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                    c28655q.m87172p0(objM87133R6);
                }
                Function1 function111112 = (Function1) objM87133R6;
                if ((57344 & i15) == 16384) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R7 = c28655q.m87133R();
                if (z17) {
                    interfaceC28601c6 = interfaceC28601c3;
                    function6 = function5;
                    objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    interfaceC28601c6 = interfaceC28601c3;
                    function6 = function5;
                    objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                    c28655q.m87172p0(objM87133R7);
                }
                Function1 function111113 = (Function1) objM87133R7;
                if ((i15 & 458752) == 131072) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R8 = c28655q.m87133R();
                if (z18) {
                    objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                    c28655q.m87172p0(objM87133R8);
                }
                m119501K(listM119523s16, function111112, function111113, (InterfaceC4339a) objM87133R8, layoutWeightElement16, c28655q, 0, 0);
                Modifier modifierM91835e16 = AbstractC30007c.m91835e(c2314t8, f110, c28655q, c2314t8, 1.0f);
                C22994r1 c22994r1M66759a16 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q.m87165m();
                Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q, modifierM91835e16);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i1119, c22994r1M66759a16);
                AbstractC28683x.m87239G(c28655q, c0209i11113, interfaceC28653p1M87165m114);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i11112, modifierM118962N114);
                AbstractC33088k.g gVar16 = new AbstractC33088k.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                boolean zM119497G16 = m119497G(interfaceC28601c2);
                TextResource textResourceM21278l11111119 = AbstractC8693b.m21278l("Enable Caching");
                objM87133R9 = c28655q.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = new C29802c(24, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R9);
                }
                Function1 function111114 = function6;
                AbstractC33087j.m104824f(textResourceM21278l11111119, gVar16, zM119497G16, false, 0, 0L, null, null, false, 0L, (Function1) objM87133R9, c28655q, i3112 | (AbstractC33088k.g.f137992d << 3), 6, MessageListItemViewType.UNREAD_SEPARATOR);
                AbstractC18489d0.m53356B(c28655q, true, c2314t8, f110, c28655q);
                Modifier modifierM3409f1112 = AbstractC1102d.m3409f(1.0f, c2314t8);
                TextResource textResourceM21278l111111110 = AbstractC8693b.m21278l("Let's Go!");
                boolean z2117 = !AbstractC39414r.m125890i0(m119495E(interfaceC28601c5));
                if (i34 == 2048) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objM87133R10 = c28655q.m87133R();
                if (z19) {
                    objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                    c28655q.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                    c28655q.m87172p0(objM87133R10);
                }
                AbstractC27292z.m82343j(modifierM3409f1112, z2117, false, null, null, null, textResourceM21278l111111110, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R10, c28655q, (i3112 << 18) | 6, 0, 8124);
                c28655q = c28655q;
                c28655q.m87173q(true);
                interfaceC4339a4 = interfaceC4339a7;
                str3 = str11;
                z15 = z2115;
                function3 = function111114;
                list3 = list11;
                interfaceC4339a5 = interfaceC4339a119;
            } else {
                c28655q.m87138X();
                interfaceC4351m2 = interfaceC4351m;
                interfaceC4339a4 = interfaceC4339a;
                str3 = str2;
                z15 = z13;
                list3 = list2;
                interfaceC4339a5 = interfaceC4339a3;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3922f(str3, z15, list3, interfaceC4351m2, function3, interfaceC4339a4, interfaceC4339a5, i13, i14);
            }
        }
        i15 |= 48;
        z13 = z4;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                list2 = list;
                if (c28655q.m87157i(list2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    if (c28655q.m87157i(interfaceC4351m)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        function2 = function1;
                        if (c28655q.m87157i(function2)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q.m87157i(interfaceC4339a)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                    i28 = i14 & 64;
                    if (i28 != 0) {
                        i15 |= 1572864;
                        interfaceC4339a3 = interfaceC4339a2;
                    } else {
                        interfaceC4339a3 = interfaceC4339a2;
                        if ((i13 & 1572864) == 0) {
                            if (c28655q.m87157i(interfaceC4339a3)) {
                                i29 = 1048576;
                            } else {
                                i29 = 524288;
                            }
                            i15 |= i29;
                        }
                    }
                    if ((i15 & 599187) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z14)) {
                        if (i35 != 0) {
                            str2 = "";
                        }
                        if (i36 != 0) {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            list2 = C25271y.f99162w;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i18 != 0) {
                            objM87133R14 = c28655q.m87133R();
                            if (objM87133R14 == c28676v0) {
                                objM87133R14 = new C35728q(16, (byte) 0);
                                c28655q.m87172p0(objM87133R14);
                            }
                            interfaceC4351m2 = (InterfaceC4351m) objM87133R14;
                        } else {
                            interfaceC4351m2 = interfaceC4351m;
                        }
                        if (i24 != 0) {
                            objM87133R13 = c28655q.m87133R();
                            if (objM87133R13 == c28676v0) {
                                objM87133R13 = new C37168b(13);
                                c28655q.m87172p0(objM87133R13);
                            }
                            function4 = (Function1) objM87133R13;
                        } else {
                            function4 = function2;
                        }
                        if (i26 != 0) {
                            objM87133R12 = c28655q.m87133R();
                            if (objM87133R12 == c28676v0) {
                                objM87133R12 = new C37312d(0);
                                c28655q.m87172p0(objM87133R12);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R12;
                        } else {
                            interfaceC4339a6 = interfaceC4339a;
                        }
                        if (i28 != 0) {
                            objM87133R11 = c28655q.m87133R();
                            if (objM87133R11 == c28676v0) {
                                objM87133R11 = new C37312d(1);
                                c28655q.m87172p0(objM87133R11);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R11;
                        }
                        interfaceC4339a7 = interfaceC4339a6;
                        InterfaceC4339a interfaceC4339a1112 = interfaceC4339a3;
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(str2);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC31061c.m95647w(z13, c28655q);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87272z(list2);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                        C2314t c2314t9 = C2314t.f9131w;
                        String str12 = str2;
                        float f111 = 2 * 8;
                        Modifier modifierM3394p9 = AbstractC1099a.m3394p(f111, AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, c2314t9), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                        boolean z2118 = z13;
                        C23010x c23010xM66775a9 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        function5 = function4;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q.m87165m();
                        Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q, modifierM3394p9);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        List<String> list12 = list2;
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        C0209i c0209i11114 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i11114, c23010xM66775a9);
                        c0209i = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m115);
                        c0209i2 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            c0209i3 = c0209i;
                            if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i11115 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q, c0209i11115, modifierM118962N115);
                            C0209i c0209i11116 = c0209i3;
                            AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Arch V2 Playground")), null, interfaceC4339a1112, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 >> 9) & 7168), 53);
                            Modifier modifierM3409f1113 = AbstractC1102d.m3409f(1.0f, c2314t9);
                            TextResource textResourceM21278l111111111 = AbstractC8693b.m21278l(m119495E(interfaceC28601c1));
                            TextResource textResourceM21278l111111112 = AbstractC8693b.m21278l("");
                            TextResource textResourceM21278l111111113 = AbstractC8693b.m21278l("");
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C37312d(2);
                                c28655q.m87172p0(objM87133R4);
                            }
                            InterfaceC4339a interfaceC4339a1113 = (InterfaceC4339a) objM87133R4;
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                interfaceC28601c4 = interfaceC28601c1;
                                objM87133R5 = new C29802c(25, interfaceC28601c4);
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                interfaceC28601c4 = interfaceC28601c1;
                            }
                            int i3113 = TextResource.$stable;
                            interfaceC28601c5 = interfaceC28601c4;
                            AbstractC30792k.m94679m(modifierM3409f1113, textResourceM21278l111111111, null, null, textResourceM21278l111111112, null, null, 0L, textResourceM21278l111111113, false, false, null, false, 1, 0, 0, false, null, false, false, null, null, null, null, null, interfaceC4339a1113, (Function1) objM87133R5, c28655q, (i3113 << 3) | 6 | (i3113 << 12) | (i3113 << 24), 3072, 1769472, 33545964);
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f111, c2314t9));
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            LayoutWeightElement layoutWeightElement17 = new LayoutWeightElement(1.0f, true);
                            List<String> listM119523s17 = m119523s(interfaceC28601c3);
                            i34 = i15 & 7168;
                            if (i34 == 2048) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objM87133R6 = c28655q.m87133R();
                            if (z16) {
                                objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                                c28655q.m87172p0(objM87133R6);
                            } else {
                                objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                                c28655q.m87172p0(objM87133R6);
                            }
                            Function1 function111115 = (Function1) objM87133R6;
                            if ((57344 & i15) == 16384) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objM87133R7 = c28655q.m87133R();
                            if (z17) {
                                interfaceC28601c6 = interfaceC28601c3;
                                function6 = function5;
                                objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                                c28655q.m87172p0(objM87133R7);
                            } else {
                                interfaceC28601c6 = interfaceC28601c3;
                                function6 = function5;
                                objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                                c28655q.m87172p0(objM87133R7);
                            }
                            Function1 function111116 = (Function1) objM87133R7;
                            if ((i15 & 458752) == 131072) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            objM87133R8 = c28655q.m87133R();
                            if (z18) {
                                objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                                c28655q.m87172p0(objM87133R8);
                            } else {
                                objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                                c28655q.m87172p0(objM87133R8);
                            }
                            m119501K(listM119523s17, function111115, function111116, (InterfaceC4339a) objM87133R8, layoutWeightElement17, c28655q, 0, 0);
                            Modifier modifierM91835e17 = AbstractC30007c.m91835e(c2314t9, f111, c28655q, c2314t9, 1.0f);
                            C22994r1 c22994r1M66759a17 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q.m87165m();
                            Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q, modifierM91835e17);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i11114, c22994r1M66759a17);
                            AbstractC28683x.m87239G(c28655q, c0209i11116, interfaceC28653p1M87165m116);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i11115, modifierM118962N116);
                            AbstractC33088k.g gVar17 = new AbstractC33088k.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                            boolean zM119497G17 = m119497G(interfaceC28601c2);
                            TextResource textResourceM21278l111111114 = AbstractC8693b.m21278l("Enable Caching");
                            objM87133R9 = c28655q.m87133R();
                            if (objM87133R9 == c28676v0) {
                                objM87133R9 = new C29802c(24, interfaceC28601c2);
                                c28655q.m87172p0(objM87133R9);
                            }
                            Function1 function111117 = function6;
                            AbstractC33087j.m104824f(textResourceM21278l111111114, gVar17, zM119497G17, false, 0, 0L, null, null, false, 0L, (Function1) objM87133R9, c28655q, i3113 | (AbstractC33088k.g.f137992d << 3), 6, MessageListItemViewType.UNREAD_SEPARATOR);
                            AbstractC18489d0.m53356B(c28655q, true, c2314t9, f111, c28655q);
                            Modifier modifierM3409f1114 = AbstractC1102d.m3409f(1.0f, c2314t9);
                            TextResource textResourceM21278l111111115 = AbstractC8693b.m21278l("Let's Go!");
                            boolean z2119 = !AbstractC39414r.m125890i0(m119495E(interfaceC28601c5));
                            if (i34 == 2048) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            objM87133R10 = c28655q.m87133R();
                            if (z19) {
                                objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                                c28655q.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                                c28655q.m87172p0(objM87133R10);
                            }
                            AbstractC27292z.m82343j(modifierM3409f1114, z2119, false, null, null, null, textResourceM21278l111111115, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R10, c28655q, (i3113 << 18) | 6, 0, 8124);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            interfaceC4339a4 = interfaceC4339a7;
                            str3 = str12;
                            z15 = z2118;
                            function3 = function111117;
                            list3 = list12;
                            interfaceC4339a5 = interfaceC4339a1112;
                        } else {
                            c0209i3 = c0209i;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                        C0209i c0209i11117 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i11117, modifierM118962N115);
                        C0209i c0209i11118 = c0209i3;
                        AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Arch V2 Playground")), null, interfaceC4339a1112, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 >> 9) & 7168), 53);
                        Modifier modifierM3409f1115 = AbstractC1102d.m3409f(1.0f, c2314t9);
                        TextResource textResourceM21278l111111116 = AbstractC8693b.m21278l(m119495E(interfaceC28601c1));
                        TextResource textResourceM21278l111111117 = AbstractC8693b.m21278l("");
                        TextResource textResourceM21278l111111118 = AbstractC8693b.m21278l("");
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C37312d(2);
                            c28655q.m87172p0(objM87133R4);
                        }
                        InterfaceC4339a interfaceC4339a1114 = (InterfaceC4339a) objM87133R4;
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            interfaceC28601c4 = interfaceC28601c1;
                            objM87133R5 = new C29802c(25, interfaceC28601c4);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            interfaceC28601c4 = interfaceC28601c1;
                        }
                        int i3114 = TextResource.$stable;
                        interfaceC28601c5 = interfaceC28601c4;
                        AbstractC30792k.m94679m(modifierM3409f1115, textResourceM21278l111111116, null, null, textResourceM21278l111111117, null, null, 0L, textResourceM21278l111111118, false, false, null, false, 1, 0, 0, false, null, false, false, null, null, null, null, null, interfaceC4339a1114, (Function1) objM87133R5, c28655q, (i3114 << 3) | 6 | (i3114 << 12) | (i3114 << 24), 3072, 1769472, 33545964);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f111, c2314t9));
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement18 = new LayoutWeightElement(1.0f, true);
                        List<String> listM119523s18 = m119523s(interfaceC28601c3);
                        i34 = i15 & 7168;
                        if (i34 == 2048) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R6 = c28655q.m87133R();
                        if (z16) {
                            objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                            c28655q.m87172p0(objM87133R6);
                        }
                        Function1 function111118 = (Function1) objM87133R6;
                        if ((57344 & i15) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (z17) {
                            interfaceC28601c6 = interfaceC28601c3;
                            function6 = function5;
                            objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            interfaceC28601c6 = interfaceC28601c3;
                            function6 = function5;
                            objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                            c28655q.m87172p0(objM87133R7);
                        }
                        Function1 function111119 = (Function1) objM87133R7;
                        if ((i15 & 458752) == 131072) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objM87133R8 = c28655q.m87133R();
                        if (z18) {
                            objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                            c28655q.m87172p0(objM87133R8);
                        } else {
                            objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                            c28655q.m87172p0(objM87133R8);
                        }
                        m119501K(listM119523s18, function111118, function111119, (InterfaceC4339a) objM87133R8, layoutWeightElement18, c28655q, 0, 0);
                        Modifier modifierM91835e18 = AbstractC30007c.m91835e(c2314t9, f111, c28655q, c2314t9, 1.0f);
                        C22994r1 c22994r1M66759a18 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q.m87165m();
                        Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q, modifierM91835e18);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i11114, c22994r1M66759a18);
                        AbstractC28683x.m87239G(c28655q, c0209i11118, interfaceC28653p1M87165m117);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i11117, modifierM118962N117);
                        AbstractC33088k.g gVar18 = new AbstractC33088k.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                        boolean zM119497G18 = m119497G(interfaceC28601c2);
                        TextResource textResourceM21278l111111119 = AbstractC8693b.m21278l("Enable Caching");
                        objM87133R9 = c28655q.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C29802c(24, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R9);
                        }
                        Function1 function1111110 = function6;
                        AbstractC33087j.m104824f(textResourceM21278l111111119, gVar18, zM119497G18, false, 0, 0L, null, null, false, 0L, (Function1) objM87133R9, c28655q, i3114 | (AbstractC33088k.g.f137992d << 3), 6, MessageListItemViewType.UNREAD_SEPARATOR);
                        AbstractC18489d0.m53356B(c28655q, true, c2314t9, f111, c28655q);
                        Modifier modifierM3409f1116 = AbstractC1102d.m3409f(1.0f, c2314t9);
                        TextResource textResourceM21278l1111111110 = AbstractC8693b.m21278l("Let's Go!");
                        boolean z21110 = !AbstractC39414r.m125890i0(m119495E(interfaceC28601c5));
                        if (i34 == 2048) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        objM87133R10 = c28655q.m87133R();
                        if (z19) {
                            objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                            c28655q.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                            c28655q.m87172p0(objM87133R10);
                        }
                        AbstractC27292z.m82343j(modifierM3409f1116, z21110, false, null, null, null, textResourceM21278l1111111110, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R10, c28655q, (i3114 << 18) | 6, 0, 8124);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        interfaceC4339a4 = interfaceC4339a7;
                        str3 = str12;
                        z15 = z2118;
                        function3 = function1111110;
                        list3 = list12;
                        interfaceC4339a5 = interfaceC4339a1112;
                    } else {
                        c28655q.m87138X();
                        interfaceC4351m2 = interfaceC4351m;
                        interfaceC4339a4 = interfaceC4339a;
                        str3 = str2;
                        z15 = z13;
                        list3 = list2;
                        interfaceC4339a5 = interfaceC4339a3;
                        function3 = function2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C3922f(str3, z15, list3, interfaceC4351m2, function3, interfaceC4339a4, interfaceC4339a5, i13, i14);
                    }
                }
                i15 |= 24576;
                function2 = function1;
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(interfaceC4339a)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                i28 = i14 & 64;
                if (i28 != 0) {
                    i15 |= 1572864;
                    interfaceC4339a3 = interfaceC4339a2;
                } else {
                    interfaceC4339a3 = interfaceC4339a2;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q.m87157i(interfaceC4339a3)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i15 |= i29;
                    }
                }
                if ((i15 & 599187) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    if (i35 != 0) {
                        str2 = "";
                    }
                    if (i36 != 0) {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        list2 = C25271y.f99162w;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R14 = c28655q.m87133R();
                        if (objM87133R14 == c28676v0) {
                            objM87133R14 = new C35728q(16, (byte) 0);
                            c28655q.m87172p0(objM87133R14);
                        }
                        interfaceC4351m2 = (InterfaceC4351m) objM87133R14;
                    } else {
                        interfaceC4351m2 = interfaceC4351m;
                    }
                    if (i24 != 0) {
                        objM87133R13 = c28655q.m87133R();
                        if (objM87133R13 == c28676v0) {
                            objM87133R13 = new C37168b(13);
                            c28655q.m87172p0(objM87133R13);
                        }
                        function4 = (Function1) objM87133R13;
                    } else {
                        function4 = function2;
                    }
                    if (i26 != 0) {
                        objM87133R12 = c28655q.m87133R();
                        if (objM87133R12 == c28676v0) {
                            objM87133R12 = new C37312d(0);
                            c28655q.m87172p0(objM87133R12);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R12;
                    } else {
                        interfaceC4339a6 = interfaceC4339a;
                    }
                    if (i28 != 0) {
                        objM87133R11 = c28655q.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C37312d(1);
                            c28655q.m87172p0(objM87133R11);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R11;
                    }
                    interfaceC4339a7 = interfaceC4339a6;
                    InterfaceC4339a interfaceC4339a1115 = interfaceC4339a3;
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(str2);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC31061c.m95647w(z13, c28655q);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(list2);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                    C2314t c2314t10 = C2314t.f9131w;
                    String str13 = str2;
                    float f112 = 2 * 8;
                    Modifier modifierM3394p10 = AbstractC1099a.m3394p(f112, AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, c2314t10), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                    boolean z21111 = z13;
                    C23010x c23010xM66775a10 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    function5 = function4;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q.m87165m();
                    Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q, modifierM3394p10);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    List<String> list13 = list2;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i11119 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i11119, c23010xM66775a10);
                    c0209i = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m118);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        c0209i3 = c0209i;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i111110 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i111110, modifierM118962N118);
                        C0209i c0209i111111 = c0209i3;
                        AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Arch V2 Playground")), null, interfaceC4339a1115, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 >> 9) & 7168), 53);
                        Modifier modifierM3409f1117 = AbstractC1102d.m3409f(1.0f, c2314t10);
                        TextResource textResourceM21278l1111111111 = AbstractC8693b.m21278l(m119495E(interfaceC28601c1));
                        TextResource textResourceM21278l1111111112 = AbstractC8693b.m21278l("");
                        TextResource textResourceM21278l1111111113 = AbstractC8693b.m21278l("");
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C37312d(2);
                            c28655q.m87172p0(objM87133R4);
                        }
                        InterfaceC4339a interfaceC4339a1116 = (InterfaceC4339a) objM87133R4;
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            interfaceC28601c4 = interfaceC28601c1;
                            objM87133R5 = new C29802c(25, interfaceC28601c4);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            interfaceC28601c4 = interfaceC28601c1;
                        }
                        int i3115 = TextResource.$stable;
                        interfaceC28601c5 = interfaceC28601c4;
                        AbstractC30792k.m94679m(modifierM3409f1117, textResourceM21278l1111111111, null, null, textResourceM21278l1111111112, null, null, 0L, textResourceM21278l1111111113, false, false, null, false, 1, 0, 0, false, null, false, false, null, null, null, null, null, interfaceC4339a1116, (Function1) objM87133R5, c28655q, (i3115 << 3) | 6 | (i3115 << 12) | (i3115 << 24), 3072, 1769472, 33545964);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f112, c2314t10));
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement19 = new LayoutWeightElement(1.0f, true);
                        List<String> listM119523s19 = m119523s(interfaceC28601c3);
                        i34 = i15 & 7168;
                        if (i34 == 2048) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R6 = c28655q.m87133R();
                        if (z16) {
                            objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                            c28655q.m87172p0(objM87133R6);
                        }
                        Function1 function1111111 = (Function1) objM87133R6;
                        if ((57344 & i15) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (z17) {
                            interfaceC28601c6 = interfaceC28601c3;
                            function6 = function5;
                            objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            interfaceC28601c6 = interfaceC28601c3;
                            function6 = function5;
                            objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                            c28655q.m87172p0(objM87133R7);
                        }
                        Function1 function1111112 = (Function1) objM87133R7;
                        if ((i15 & 458752) == 131072) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objM87133R8 = c28655q.m87133R();
                        if (z18) {
                            objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                            c28655q.m87172p0(objM87133R8);
                        } else {
                            objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                            c28655q.m87172p0(objM87133R8);
                        }
                        m119501K(listM119523s19, function1111111, function1111112, (InterfaceC4339a) objM87133R8, layoutWeightElement19, c28655q, 0, 0);
                        Modifier modifierM91835e19 = AbstractC30007c.m91835e(c2314t10, f112, c28655q, c2314t10, 1.0f);
                        C22994r1 c22994r1M66759a19 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q.m87165m();
                        Modifier modifierM118962N119 = AbstractC37056f.m118962N(c28655q, modifierM91835e19);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i11119, c22994r1M66759a19);
                        AbstractC28683x.m87239G(c28655q, c0209i111111, interfaceC28653p1M87165m119);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i111110, modifierM118962N119);
                        AbstractC33088k.g gVar19 = new AbstractC33088k.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                        boolean zM119497G19 = m119497G(interfaceC28601c2);
                        TextResource textResourceM21278l1111111114 = AbstractC8693b.m21278l("Enable Caching");
                        objM87133R9 = c28655q.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C29802c(24, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R9);
                        }
                        Function1 function1111113 = function6;
                        AbstractC33087j.m104824f(textResourceM21278l1111111114, gVar19, zM119497G19, false, 0, 0L, null, null, false, 0L, (Function1) objM87133R9, c28655q, i3115 | (AbstractC33088k.g.f137992d << 3), 6, MessageListItemViewType.UNREAD_SEPARATOR);
                        AbstractC18489d0.m53356B(c28655q, true, c2314t10, f112, c28655q);
                        Modifier modifierM3409f1118 = AbstractC1102d.m3409f(1.0f, c2314t10);
                        TextResource textResourceM21278l1111111115 = AbstractC8693b.m21278l("Let's Go!");
                        boolean z21112 = !AbstractC39414r.m125890i0(m119495E(interfaceC28601c5));
                        if (i34 == 2048) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        objM87133R10 = c28655q.m87133R();
                        if (z19) {
                            objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                            c28655q.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                            c28655q.m87172p0(objM87133R10);
                        }
                        AbstractC27292z.m82343j(modifierM3409f1118, z21112, false, null, null, null, textResourceM21278l1111111115, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R10, c28655q, (i3115 << 18) | 6, 0, 8124);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        interfaceC4339a4 = interfaceC4339a7;
                        str3 = str13;
                        z15 = z21111;
                        function3 = function1111113;
                        list3 = list13;
                        interfaceC4339a5 = interfaceC4339a1115;
                    } else {
                        c0209i3 = c0209i;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                    C0209i c0209i111112 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i111112, modifierM118962N118);
                    C0209i c0209i111113 = c0209i3;
                    AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Arch V2 Playground")), null, interfaceC4339a1115, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 >> 9) & 7168), 53);
                    Modifier modifierM3409f1119 = AbstractC1102d.m3409f(1.0f, c2314t10);
                    TextResource textResourceM21278l1111111116 = AbstractC8693b.m21278l(m119495E(interfaceC28601c1));
                    TextResource textResourceM21278l1111111117 = AbstractC8693b.m21278l("");
                    TextResource textResourceM21278l1111111118 = AbstractC8693b.m21278l("");
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C37312d(2);
                        c28655q.m87172p0(objM87133R4);
                    }
                    InterfaceC4339a interfaceC4339a1117 = (InterfaceC4339a) objM87133R4;
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        interfaceC28601c4 = interfaceC28601c1;
                        objM87133R5 = new C29802c(25, interfaceC28601c4);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        interfaceC28601c4 = interfaceC28601c1;
                    }
                    int i3116 = TextResource.$stable;
                    interfaceC28601c5 = interfaceC28601c4;
                    AbstractC30792k.m94679m(modifierM3409f1119, textResourceM21278l1111111116, null, null, textResourceM21278l1111111117, null, null, 0L, textResourceM21278l1111111118, false, false, null, false, 1, 0, 0, false, null, false, false, null, null, null, null, null, interfaceC4339a1117, (Function1) objM87133R5, c28655q, (i3116 << 3) | 6 | (i3116 << 12) | (i3116 << 24), 3072, 1769472, 33545964);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f112, c2314t10));
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement110 = new LayoutWeightElement(1.0f, true);
                    List<String> listM119523s110 = m119523s(interfaceC28601c3);
                    i34 = i15 & 7168;
                    if (i34 == 2048) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (z16) {
                        objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                        c28655q.m87172p0(objM87133R6);
                    }
                    Function1 function1111114 = (Function1) objM87133R6;
                    if ((57344 & i15) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (z17) {
                        interfaceC28601c6 = interfaceC28601c3;
                        function6 = function5;
                        objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        interfaceC28601c6 = interfaceC28601c3;
                        function6 = function5;
                        objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                        c28655q.m87172p0(objM87133R7);
                    }
                    Function1 function1111115 = (Function1) objM87133R7;
                    if ((i15 & 458752) == 131072) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R8 = c28655q.m87133R();
                    if (z18) {
                        objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                        c28655q.m87172p0(objM87133R8);
                    }
                    m119501K(listM119523s110, function1111114, function1111115, (InterfaceC4339a) objM87133R8, layoutWeightElement110, c28655q, 0, 0);
                    Modifier modifierM91835e110 = AbstractC30007c.m91835e(c2314t10, f112, c28655q, c2314t10, 1.0f);
                    C22994r1 c22994r1M66759a110 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q.m87165m();
                    Modifier modifierM118962N1110 = AbstractC37056f.m118962N(c28655q, modifierM91835e110);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11119, c22994r1M66759a110);
                    AbstractC28683x.m87239G(c28655q, c0209i111113, interfaceC28653p1M87165m1110);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i111112, modifierM118962N1110);
                    AbstractC33088k.g gVar110 = new AbstractC33088k.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                    boolean zM119497G110 = m119497G(interfaceC28601c2);
                    TextResource textResourceM21278l1111111119 = AbstractC8693b.m21278l("Enable Caching");
                    objM87133R9 = c28655q.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C29802c(24, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R9);
                    }
                    Function1 function1111116 = function6;
                    AbstractC33087j.m104824f(textResourceM21278l1111111119, gVar110, zM119497G110, false, 0, 0L, null, null, false, 0L, (Function1) objM87133R9, c28655q, i3116 | (AbstractC33088k.g.f137992d << 3), 6, MessageListItemViewType.UNREAD_SEPARATOR);
                    AbstractC18489d0.m53356B(c28655q, true, c2314t10, f112, c28655q);
                    Modifier modifierM3409f11110 = AbstractC1102d.m3409f(1.0f, c2314t10);
                    TextResource textResourceM21278l11111111110 = AbstractC8693b.m21278l("Let's Go!");
                    boolean z21113 = !AbstractC39414r.m125890i0(m119495E(interfaceC28601c5));
                    if (i34 == 2048) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objM87133R10 = c28655q.m87133R();
                    if (z19) {
                        objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                        c28655q.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                        c28655q.m87172p0(objM87133R10);
                    }
                    AbstractC27292z.m82343j(modifierM3409f11110, z21113, false, null, null, null, textResourceM21278l11111111110, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R10, c28655q, (i3116 << 18) | 6, 0, 8124);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    interfaceC4339a4 = interfaceC4339a7;
                    str3 = str13;
                    z15 = z21111;
                    function3 = function1111116;
                    list3 = list13;
                    interfaceC4339a5 = interfaceC4339a1115;
                } else {
                    c28655q.m87138X();
                    interfaceC4351m2 = interfaceC4351m;
                    interfaceC4339a4 = interfaceC4339a;
                    str3 = str2;
                    z15 = z13;
                    list3 = list2;
                    interfaceC4339a5 = interfaceC4339a3;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3922f(str3, z15, list3, interfaceC4351m2, function3, interfaceC4339a4, interfaceC4339a5, i13, i14);
                }
            }
            i15 |= 3072;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(interfaceC4339a)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                i28 = i14 & 64;
                if (i28 != 0) {
                    i15 |= 1572864;
                    interfaceC4339a3 = interfaceC4339a2;
                } else {
                    interfaceC4339a3 = interfaceC4339a2;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q.m87157i(interfaceC4339a3)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i15 |= i29;
                    }
                }
                if ((i15 & 599187) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    if (i35 != 0) {
                        str2 = "";
                    }
                    if (i36 != 0) {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        list2 = C25271y.f99162w;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R14 = c28655q.m87133R();
                        if (objM87133R14 == c28676v0) {
                            objM87133R14 = new C35728q(16, (byte) 0);
                            c28655q.m87172p0(objM87133R14);
                        }
                        interfaceC4351m2 = (InterfaceC4351m) objM87133R14;
                    } else {
                        interfaceC4351m2 = interfaceC4351m;
                    }
                    if (i24 != 0) {
                        objM87133R13 = c28655q.m87133R();
                        if (objM87133R13 == c28676v0) {
                            objM87133R13 = new C37168b(13);
                            c28655q.m87172p0(objM87133R13);
                        }
                        function4 = (Function1) objM87133R13;
                    } else {
                        function4 = function2;
                    }
                    if (i26 != 0) {
                        objM87133R12 = c28655q.m87133R();
                        if (objM87133R12 == c28676v0) {
                            objM87133R12 = new C37312d(0);
                            c28655q.m87172p0(objM87133R12);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R12;
                    } else {
                        interfaceC4339a6 = interfaceC4339a;
                    }
                    if (i28 != 0) {
                        objM87133R11 = c28655q.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C37312d(1);
                            c28655q.m87172p0(objM87133R11);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R11;
                    }
                    interfaceC4339a7 = interfaceC4339a6;
                    InterfaceC4339a interfaceC4339a1118 = interfaceC4339a3;
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(str2);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC31061c.m95647w(z13, c28655q);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(list2);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                    C2314t c2314t11 = C2314t.f9131w;
                    String str14 = str2;
                    float f113 = 2 * 8;
                    Modifier modifierM3394p11 = AbstractC1099a.m3394p(f113, AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, c2314t11), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                    boolean z21114 = z13;
                    C23010x c23010xM66775a11 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    function5 = function4;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111 = c28655q.m87165m();
                    Modifier modifierM118962N1111 = AbstractC37056f.m118962N(c28655q, modifierM3394p11);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    List<String> list14 = list2;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i111114 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i111114, c23010xM66775a11);
                    c0209i = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m1111);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        c0209i3 = c0209i;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i111115 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i111115, modifierM118962N1111);
                        C0209i c0209i111116 = c0209i3;
                        AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Arch V2 Playground")), null, interfaceC4339a1118, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 >> 9) & 7168), 53);
                        Modifier modifierM3409f11111 = AbstractC1102d.m3409f(1.0f, c2314t11);
                        TextResource textResourceM21278l11111111111 = AbstractC8693b.m21278l(m119495E(interfaceC28601c1));
                        TextResource textResourceM21278l11111111112 = AbstractC8693b.m21278l("");
                        TextResource textResourceM21278l11111111113 = AbstractC8693b.m21278l("");
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C37312d(2);
                            c28655q.m87172p0(objM87133R4);
                        }
                        InterfaceC4339a interfaceC4339a1119 = (InterfaceC4339a) objM87133R4;
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            interfaceC28601c4 = interfaceC28601c1;
                            objM87133R5 = new C29802c(25, interfaceC28601c4);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            interfaceC28601c4 = interfaceC28601c1;
                        }
                        int i3117 = TextResource.$stable;
                        interfaceC28601c5 = interfaceC28601c4;
                        AbstractC30792k.m94679m(modifierM3409f11111, textResourceM21278l11111111111, null, null, textResourceM21278l11111111112, null, null, 0L, textResourceM21278l11111111113, false, false, null, false, 1, 0, 0, false, null, false, false, null, null, null, null, null, interfaceC4339a1119, (Function1) objM87133R5, c28655q, (i3117 << 3) | 6 | (i3117 << 12) | (i3117 << 24), 3072, 1769472, 33545964);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f113, c2314t11));
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement111 = new LayoutWeightElement(1.0f, true);
                        List<String> listM119523s111 = m119523s(interfaceC28601c3);
                        i34 = i15 & 7168;
                        if (i34 == 2048) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R6 = c28655q.m87133R();
                        if (z16) {
                            objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                            c28655q.m87172p0(objM87133R6);
                        }
                        Function1 function1111117 = (Function1) objM87133R6;
                        if ((57344 & i15) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (z17) {
                            interfaceC28601c6 = interfaceC28601c3;
                            function6 = function5;
                            objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            interfaceC28601c6 = interfaceC28601c3;
                            function6 = function5;
                            objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                            c28655q.m87172p0(objM87133R7);
                        }
                        Function1 function1111118 = (Function1) objM87133R7;
                        if ((i15 & 458752) == 131072) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objM87133R8 = c28655q.m87133R();
                        if (z18) {
                            objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                            c28655q.m87172p0(objM87133R8);
                        } else {
                            objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                            c28655q.m87172p0(objM87133R8);
                        }
                        m119501K(listM119523s111, function1111117, function1111118, (InterfaceC4339a) objM87133R8, layoutWeightElement111, c28655q, 0, 0);
                        Modifier modifierM91835e111 = AbstractC30007c.m91835e(c2314t11, f113, c28655q, c2314t11, 1.0f);
                        C22994r1 c22994r1M66759a111 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1112 = c28655q.m87165m();
                        Modifier modifierM118962N1112 = AbstractC37056f.m118962N(c28655q, modifierM91835e111);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i111114, c22994r1M66759a111);
                        AbstractC28683x.m87239G(c28655q, c0209i111116, interfaceC28653p1M87165m1112);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i111115, modifierM118962N1112);
                        AbstractC33088k.g gVar111 = new AbstractC33088k.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                        boolean zM119497G111 = m119497G(interfaceC28601c2);
                        TextResource textResourceM21278l11111111114 = AbstractC8693b.m21278l("Enable Caching");
                        objM87133R9 = c28655q.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C29802c(24, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R9);
                        }
                        Function1 function1111119 = function6;
                        AbstractC33087j.m104824f(textResourceM21278l11111111114, gVar111, zM119497G111, false, 0, 0L, null, null, false, 0L, (Function1) objM87133R9, c28655q, i3117 | (AbstractC33088k.g.f137992d << 3), 6, MessageListItemViewType.UNREAD_SEPARATOR);
                        AbstractC18489d0.m53356B(c28655q, true, c2314t11, f113, c28655q);
                        Modifier modifierM3409f11112 = AbstractC1102d.m3409f(1.0f, c2314t11);
                        TextResource textResourceM21278l11111111115 = AbstractC8693b.m21278l("Let's Go!");
                        boolean z21115 = !AbstractC39414r.m125890i0(m119495E(interfaceC28601c5));
                        if (i34 == 2048) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        objM87133R10 = c28655q.m87133R();
                        if (z19) {
                            objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                            c28655q.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                            c28655q.m87172p0(objM87133R10);
                        }
                        AbstractC27292z.m82343j(modifierM3409f11112, z21115, false, null, null, null, textResourceM21278l11111111115, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R10, c28655q, (i3117 << 18) | 6, 0, 8124);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        interfaceC4339a4 = interfaceC4339a7;
                        str3 = str14;
                        z15 = z21114;
                        function3 = function1111119;
                        list3 = list14;
                        interfaceC4339a5 = interfaceC4339a1118;
                    } else {
                        c0209i3 = c0209i;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                    C0209i c0209i111117 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i111117, modifierM118962N1111);
                    C0209i c0209i111118 = c0209i3;
                    AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Arch V2 Playground")), null, interfaceC4339a1118, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 >> 9) & 7168), 53);
                    Modifier modifierM3409f11113 = AbstractC1102d.m3409f(1.0f, c2314t11);
                    TextResource textResourceM21278l11111111116 = AbstractC8693b.m21278l(m119495E(interfaceC28601c1));
                    TextResource textResourceM21278l11111111117 = AbstractC8693b.m21278l("");
                    TextResource textResourceM21278l11111111118 = AbstractC8693b.m21278l("");
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C37312d(2);
                        c28655q.m87172p0(objM87133R4);
                    }
                    InterfaceC4339a interfaceC4339a11110 = (InterfaceC4339a) objM87133R4;
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        interfaceC28601c4 = interfaceC28601c1;
                        objM87133R5 = new C29802c(25, interfaceC28601c4);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        interfaceC28601c4 = interfaceC28601c1;
                    }
                    int i3118 = TextResource.$stable;
                    interfaceC28601c5 = interfaceC28601c4;
                    AbstractC30792k.m94679m(modifierM3409f11113, textResourceM21278l11111111116, null, null, textResourceM21278l11111111117, null, null, 0L, textResourceM21278l11111111118, false, false, null, false, 1, 0, 0, false, null, false, false, null, null, null, null, null, interfaceC4339a11110, (Function1) objM87133R5, c28655q, (i3118 << 3) | 6 | (i3118 << 12) | (i3118 << 24), 3072, 1769472, 33545964);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f113, c2314t11));
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement112 = new LayoutWeightElement(1.0f, true);
                    List<String> listM119523s112 = m119523s(interfaceC28601c3);
                    i34 = i15 & 7168;
                    if (i34 == 2048) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (z16) {
                        objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                        c28655q.m87172p0(objM87133R6);
                    }
                    Function1 function11111110 = (Function1) objM87133R6;
                    if ((57344 & i15) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (z17) {
                        interfaceC28601c6 = interfaceC28601c3;
                        function6 = function5;
                        objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        interfaceC28601c6 = interfaceC28601c3;
                        function6 = function5;
                        objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                        c28655q.m87172p0(objM87133R7);
                    }
                    Function1 function11111111 = (Function1) objM87133R7;
                    if ((i15 & 458752) == 131072) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R8 = c28655q.m87133R();
                    if (z18) {
                        objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                        c28655q.m87172p0(objM87133R8);
                    }
                    m119501K(listM119523s112, function11111110, function11111111, (InterfaceC4339a) objM87133R8, layoutWeightElement112, c28655q, 0, 0);
                    Modifier modifierM91835e112 = AbstractC30007c.m91835e(c2314t11, f113, c28655q, c2314t11, 1.0f);
                    C22994r1 c22994r1M66759a112 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1113 = c28655q.m87165m();
                    Modifier modifierM118962N1113 = AbstractC37056f.m118962N(c28655q, modifierM91835e112);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i111114, c22994r1M66759a112);
                    AbstractC28683x.m87239G(c28655q, c0209i111118, interfaceC28653p1M87165m1113);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i111117, modifierM118962N1113);
                    AbstractC33088k.g gVar112 = new AbstractC33088k.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                    boolean zM119497G112 = m119497G(interfaceC28601c2);
                    TextResource textResourceM21278l11111111119 = AbstractC8693b.m21278l("Enable Caching");
                    objM87133R9 = c28655q.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C29802c(24, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R9);
                    }
                    Function1 function11111112 = function6;
                    AbstractC33087j.m104824f(textResourceM21278l11111111119, gVar112, zM119497G112, false, 0, 0L, null, null, false, 0L, (Function1) objM87133R9, c28655q, i3118 | (AbstractC33088k.g.f137992d << 3), 6, MessageListItemViewType.UNREAD_SEPARATOR);
                    AbstractC18489d0.m53356B(c28655q, true, c2314t11, f113, c28655q);
                    Modifier modifierM3409f11114 = AbstractC1102d.m3409f(1.0f, c2314t11);
                    TextResource textResourceM21278l111111111110 = AbstractC8693b.m21278l("Let's Go!");
                    boolean z21116 = !AbstractC39414r.m125890i0(m119495E(interfaceC28601c5));
                    if (i34 == 2048) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objM87133R10 = c28655q.m87133R();
                    if (z19) {
                        objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                        c28655q.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                        c28655q.m87172p0(objM87133R10);
                    }
                    AbstractC27292z.m82343j(modifierM3409f11114, z21116, false, null, null, null, textResourceM21278l111111111110, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R10, c28655q, (i3118 << 18) | 6, 0, 8124);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    interfaceC4339a4 = interfaceC4339a7;
                    str3 = str14;
                    z15 = z21114;
                    function3 = function11111112;
                    list3 = list14;
                    interfaceC4339a5 = interfaceC4339a1118;
                } else {
                    c28655q.m87138X();
                    interfaceC4351m2 = interfaceC4351m;
                    interfaceC4339a4 = interfaceC4339a;
                    str3 = str2;
                    z15 = z13;
                    list3 = list2;
                    interfaceC4339a5 = interfaceC4339a3;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3922f(str3, z15, list3, interfaceC4351m2, function3, interfaceC4339a4, interfaceC4339a5, i13, i14);
                }
            }
            i15 |= 24576;
            function2 = function1;
            i26 = i14 & 32;
            if (i26 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87157i(interfaceC4339a)) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i27;
            }
            i28 = i14 & 64;
            if (i28 != 0) {
                i15 |= 1572864;
                interfaceC4339a3 = interfaceC4339a2;
            } else {
                interfaceC4339a3 = interfaceC4339a2;
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87157i(interfaceC4339a3)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i15 |= i29;
                }
            }
            if ((i15 & 599187) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i35 != 0) {
                    str2 = "";
                }
                if (i36 != 0) {
                    z13 = true;
                }
                if (i16 != 0) {
                    list2 = C25271y.f99162w;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R14 = c28655q.m87133R();
                    if (objM87133R14 == c28676v0) {
                        objM87133R14 = new C35728q(16, (byte) 0);
                        c28655q.m87172p0(objM87133R14);
                    }
                    interfaceC4351m2 = (InterfaceC4351m) objM87133R14;
                } else {
                    interfaceC4351m2 = interfaceC4351m;
                }
                if (i24 != 0) {
                    objM87133R13 = c28655q.m87133R();
                    if (objM87133R13 == c28676v0) {
                        objM87133R13 = new C37168b(13);
                        c28655q.m87172p0(objM87133R13);
                    }
                    function4 = (Function1) objM87133R13;
                } else {
                    function4 = function2;
                }
                if (i26 != 0) {
                    objM87133R12 = c28655q.m87133R();
                    if (objM87133R12 == c28676v0) {
                        objM87133R12 = new C37312d(0);
                        c28655q.m87172p0(objM87133R12);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R12;
                } else {
                    interfaceC4339a6 = interfaceC4339a;
                }
                if (i28 != 0) {
                    objM87133R11 = c28655q.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C37312d(1);
                        c28655q.m87172p0(objM87133R11);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R11;
                }
                interfaceC4339a7 = interfaceC4339a6;
                InterfaceC4339a interfaceC4339a11111 = interfaceC4339a3;
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(str2);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC31061c.m95647w(z13, c28655q);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(list2);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                C2314t c2314t12 = C2314t.f9131w;
                String str15 = str2;
                float f114 = 2 * 8;
                Modifier modifierM3394p12 = AbstractC1099a.m3394p(f114, AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, c2314t12), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                boolean z21117 = z13;
                C23010x c23010xM66775a12 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                function5 = function4;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1114 = c28655q.m87165m();
                Modifier modifierM118962N1114 = AbstractC37056f.m118962N(c28655q, modifierM3394p12);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                List<String> list15 = list2;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i111119 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i111119, c23010xM66775a12);
                c0209i = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m1114);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    c0209i3 = c0209i;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i1111110 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i1111110, modifierM118962N1114);
                    C0209i c0209i1111111 = c0209i3;
                    AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Arch V2 Playground")), null, interfaceC4339a11111, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 >> 9) & 7168), 53);
                    Modifier modifierM3409f11115 = AbstractC1102d.m3409f(1.0f, c2314t12);
                    TextResource textResourceM21278l111111111111 = AbstractC8693b.m21278l(m119495E(interfaceC28601c1));
                    TextResource textResourceM21278l111111111112 = AbstractC8693b.m21278l("");
                    TextResource textResourceM21278l111111111113 = AbstractC8693b.m21278l("");
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C37312d(2);
                        c28655q.m87172p0(objM87133R4);
                    }
                    InterfaceC4339a interfaceC4339a11112 = (InterfaceC4339a) objM87133R4;
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        interfaceC28601c4 = interfaceC28601c1;
                        objM87133R5 = new C29802c(25, interfaceC28601c4);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        interfaceC28601c4 = interfaceC28601c1;
                    }
                    int i3119 = TextResource.$stable;
                    interfaceC28601c5 = interfaceC28601c4;
                    AbstractC30792k.m94679m(modifierM3409f11115, textResourceM21278l111111111111, null, null, textResourceM21278l111111111112, null, null, 0L, textResourceM21278l111111111113, false, false, null, false, 1, 0, 0, false, null, false, false, null, null, null, null, null, interfaceC4339a11112, (Function1) objM87133R5, c28655q, (i3119 << 3) | 6 | (i3119 << 12) | (i3119 << 24), 3072, 1769472, 33545964);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f114, c2314t12));
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement113 = new LayoutWeightElement(1.0f, true);
                    List<String> listM119523s113 = m119523s(interfaceC28601c3);
                    i34 = i15 & 7168;
                    if (i34 == 2048) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (z16) {
                        objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                        c28655q.m87172p0(objM87133R6);
                    }
                    Function1 function11111113 = (Function1) objM87133R6;
                    if ((57344 & i15) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (z17) {
                        interfaceC28601c6 = interfaceC28601c3;
                        function6 = function5;
                        objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        interfaceC28601c6 = interfaceC28601c3;
                        function6 = function5;
                        objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                        c28655q.m87172p0(objM87133R7);
                    }
                    Function1 function11111114 = (Function1) objM87133R7;
                    if ((i15 & 458752) == 131072) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R8 = c28655q.m87133R();
                    if (z18) {
                        objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                        c28655q.m87172p0(objM87133R8);
                    }
                    m119501K(listM119523s113, function11111113, function11111114, (InterfaceC4339a) objM87133R8, layoutWeightElement113, c28655q, 0, 0);
                    Modifier modifierM91835e113 = AbstractC30007c.m91835e(c2314t12, f114, c28655q, c2314t12, 1.0f);
                    C22994r1 c22994r1M66759a113 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1115 = c28655q.m87165m();
                    Modifier modifierM118962N1115 = AbstractC37056f.m118962N(c28655q, modifierM91835e113);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i111119, c22994r1M66759a113);
                    AbstractC28683x.m87239G(c28655q, c0209i1111111, interfaceC28653p1M87165m1115);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1111110, modifierM118962N1115);
                    AbstractC33088k.g gVar113 = new AbstractC33088k.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                    boolean zM119497G113 = m119497G(interfaceC28601c2);
                    TextResource textResourceM21278l111111111114 = AbstractC8693b.m21278l("Enable Caching");
                    objM87133R9 = c28655q.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C29802c(24, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R9);
                    }
                    Function1 function11111115 = function6;
                    AbstractC33087j.m104824f(textResourceM21278l111111111114, gVar113, zM119497G113, false, 0, 0L, null, null, false, 0L, (Function1) objM87133R9, c28655q, i3119 | (AbstractC33088k.g.f137992d << 3), 6, MessageListItemViewType.UNREAD_SEPARATOR);
                    AbstractC18489d0.m53356B(c28655q, true, c2314t12, f114, c28655q);
                    Modifier modifierM3409f11116 = AbstractC1102d.m3409f(1.0f, c2314t12);
                    TextResource textResourceM21278l111111111115 = AbstractC8693b.m21278l("Let's Go!");
                    boolean z21118 = !AbstractC39414r.m125890i0(m119495E(interfaceC28601c5));
                    if (i34 == 2048) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objM87133R10 = c28655q.m87133R();
                    if (z19) {
                        objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                        c28655q.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                        c28655q.m87172p0(objM87133R10);
                    }
                    AbstractC27292z.m82343j(modifierM3409f11116, z21118, false, null, null, null, textResourceM21278l111111111115, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R10, c28655q, (i3119 << 18) | 6, 0, 8124);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    interfaceC4339a4 = interfaceC4339a7;
                    str3 = str15;
                    z15 = z21117;
                    function3 = function11111115;
                    list3 = list15;
                    interfaceC4339a5 = interfaceC4339a11111;
                } else {
                    c0209i3 = c0209i;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                C0209i c0209i1111112 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i1111112, modifierM118962N1114);
                C0209i c0209i1111113 = c0209i3;
                AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Arch V2 Playground")), null, interfaceC4339a11111, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 >> 9) & 7168), 53);
                Modifier modifierM3409f11117 = AbstractC1102d.m3409f(1.0f, c2314t12);
                TextResource textResourceM21278l111111111116 = AbstractC8693b.m21278l(m119495E(interfaceC28601c1));
                TextResource textResourceM21278l111111111117 = AbstractC8693b.m21278l("");
                TextResource textResourceM21278l111111111118 = AbstractC8693b.m21278l("");
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C37312d(2);
                    c28655q.m87172p0(objM87133R4);
                }
                InterfaceC4339a interfaceC4339a11113 = (InterfaceC4339a) objM87133R4;
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    interfaceC28601c4 = interfaceC28601c1;
                    objM87133R5 = new C29802c(25, interfaceC28601c4);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    interfaceC28601c4 = interfaceC28601c1;
                }
                int i31110 = TextResource.$stable;
                interfaceC28601c5 = interfaceC28601c4;
                AbstractC30792k.m94679m(modifierM3409f11117, textResourceM21278l111111111116, null, null, textResourceM21278l111111111117, null, null, 0L, textResourceM21278l111111111118, false, false, null, false, 1, 0, 0, false, null, false, false, null, null, null, null, null, interfaceC4339a11113, (Function1) objM87133R5, c28655q, (i31110 << 3) | 6 | (i31110 << 12) | (i31110 << 24), 3072, 1769472, 33545964);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f114, c2314t12));
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement114 = new LayoutWeightElement(1.0f, true);
                List<String> listM119523s114 = m119523s(interfaceC28601c3);
                i34 = i15 & 7168;
                if (i34 == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM87133R6 = c28655q.m87133R();
                if (z16) {
                    objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                    c28655q.m87172p0(objM87133R6);
                }
                Function1 function11111116 = (Function1) objM87133R6;
                if ((57344 & i15) == 16384) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R7 = c28655q.m87133R();
                if (z17) {
                    interfaceC28601c6 = interfaceC28601c3;
                    function6 = function5;
                    objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    interfaceC28601c6 = interfaceC28601c3;
                    function6 = function5;
                    objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                    c28655q.m87172p0(objM87133R7);
                }
                Function1 function11111117 = (Function1) objM87133R7;
                if ((i15 & 458752) == 131072) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R8 = c28655q.m87133R();
                if (z18) {
                    objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                    c28655q.m87172p0(objM87133R8);
                }
                m119501K(listM119523s114, function11111116, function11111117, (InterfaceC4339a) objM87133R8, layoutWeightElement114, c28655q, 0, 0);
                Modifier modifierM91835e114 = AbstractC30007c.m91835e(c2314t12, f114, c28655q, c2314t12, 1.0f);
                C22994r1 c22994r1M66759a114 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1116 = c28655q.m87165m();
                Modifier modifierM118962N1116 = AbstractC37056f.m118962N(c28655q, modifierM91835e114);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i111119, c22994r1M66759a114);
                AbstractC28683x.m87239G(c28655q, c0209i1111113, interfaceC28653p1M87165m1116);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i1111112, modifierM118962N1116);
                AbstractC33088k.g gVar114 = new AbstractC33088k.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                boolean zM119497G114 = m119497G(interfaceC28601c2);
                TextResource textResourceM21278l111111111119 = AbstractC8693b.m21278l("Enable Caching");
                objM87133R9 = c28655q.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = new C29802c(24, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R9);
                }
                Function1 function11111118 = function6;
                AbstractC33087j.m104824f(textResourceM21278l111111111119, gVar114, zM119497G114, false, 0, 0L, null, null, false, 0L, (Function1) objM87133R9, c28655q, i31110 | (AbstractC33088k.g.f137992d << 3), 6, MessageListItemViewType.UNREAD_SEPARATOR);
                AbstractC18489d0.m53356B(c28655q, true, c2314t12, f114, c28655q);
                Modifier modifierM3409f11118 = AbstractC1102d.m3409f(1.0f, c2314t12);
                TextResource textResourceM21278l1111111111110 = AbstractC8693b.m21278l("Let's Go!");
                boolean z21119 = !AbstractC39414r.m125890i0(m119495E(interfaceC28601c5));
                if (i34 == 2048) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objM87133R10 = c28655q.m87133R();
                if (z19) {
                    objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                    c28655q.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                    c28655q.m87172p0(objM87133R10);
                }
                AbstractC27292z.m82343j(modifierM3409f11118, z21119, false, null, null, null, textResourceM21278l1111111111110, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R10, c28655q, (i31110 << 18) | 6, 0, 8124);
                c28655q = c28655q;
                c28655q.m87173q(true);
                interfaceC4339a4 = interfaceC4339a7;
                str3 = str15;
                z15 = z21117;
                function3 = function11111118;
                list3 = list15;
                interfaceC4339a5 = interfaceC4339a11111;
            } else {
                c28655q.m87138X();
                interfaceC4351m2 = interfaceC4351m;
                interfaceC4339a4 = interfaceC4339a;
                str3 = str2;
                z15 = z13;
                list3 = list2;
                interfaceC4339a5 = interfaceC4339a3;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3922f(str3, z15, list3, interfaceC4351m2, function3, interfaceC4339a4, interfaceC4339a5, i13, i14);
            }
        }
        i15 |= 384;
        list2 = list;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(interfaceC4351m)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(interfaceC4339a)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                i28 = i14 & 64;
                if (i28 != 0) {
                    i15 |= 1572864;
                    interfaceC4339a3 = interfaceC4339a2;
                } else {
                    interfaceC4339a3 = interfaceC4339a2;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q.m87157i(interfaceC4339a3)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i15 |= i29;
                    }
                }
                if ((i15 & 599187) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    if (i35 != 0) {
                        str2 = "";
                    }
                    if (i36 != 0) {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        list2 = C25271y.f99162w;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R14 = c28655q.m87133R();
                        if (objM87133R14 == c28676v0) {
                            objM87133R14 = new C35728q(16, (byte) 0);
                            c28655q.m87172p0(objM87133R14);
                        }
                        interfaceC4351m2 = (InterfaceC4351m) objM87133R14;
                    } else {
                        interfaceC4351m2 = interfaceC4351m;
                    }
                    if (i24 != 0) {
                        objM87133R13 = c28655q.m87133R();
                        if (objM87133R13 == c28676v0) {
                            objM87133R13 = new C37168b(13);
                            c28655q.m87172p0(objM87133R13);
                        }
                        function4 = (Function1) objM87133R13;
                    } else {
                        function4 = function2;
                    }
                    if (i26 != 0) {
                        objM87133R12 = c28655q.m87133R();
                        if (objM87133R12 == c28676v0) {
                            objM87133R12 = new C37312d(0);
                            c28655q.m87172p0(objM87133R12);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R12;
                    } else {
                        interfaceC4339a6 = interfaceC4339a;
                    }
                    if (i28 != 0) {
                        objM87133R11 = c28655q.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C37312d(1);
                            c28655q.m87172p0(objM87133R11);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R11;
                    }
                    interfaceC4339a7 = interfaceC4339a6;
                    InterfaceC4339a interfaceC4339a11114 = interfaceC4339a3;
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(str2);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC31061c.m95647w(z13, c28655q);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(list2);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                    C2314t c2314t13 = C2314t.f9131w;
                    String str16 = str2;
                    float f115 = 2 * 8;
                    Modifier modifierM3394p13 = AbstractC1099a.m3394p(f115, AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, c2314t13), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                    boolean z211110 = z13;
                    C23010x c23010xM66775a13 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    function5 = function4;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1117 = c28655q.m87165m();
                    Modifier modifierM118962N1117 = AbstractC37056f.m118962N(c28655q, modifierM3394p13);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    List<String> list16 = list2;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i1111114 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i1111114, c23010xM66775a13);
                    c0209i = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m1117);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        c0209i3 = c0209i;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i1111115 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i1111115, modifierM118962N1117);
                        C0209i c0209i1111116 = c0209i3;
                        AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Arch V2 Playground")), null, interfaceC4339a11114, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 >> 9) & 7168), 53);
                        Modifier modifierM3409f11119 = AbstractC1102d.m3409f(1.0f, c2314t13);
                        TextResource textResourceM21278l1111111111111 = AbstractC8693b.m21278l(m119495E(interfaceC28601c1));
                        TextResource textResourceM21278l1111111111112 = AbstractC8693b.m21278l("");
                        TextResource textResourceM21278l1111111111113 = AbstractC8693b.m21278l("");
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C37312d(2);
                            c28655q.m87172p0(objM87133R4);
                        }
                        InterfaceC4339a interfaceC4339a11115 = (InterfaceC4339a) objM87133R4;
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            interfaceC28601c4 = interfaceC28601c1;
                            objM87133R5 = new C29802c(25, interfaceC28601c4);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            interfaceC28601c4 = interfaceC28601c1;
                        }
                        int i31111 = TextResource.$stable;
                        interfaceC28601c5 = interfaceC28601c4;
                        AbstractC30792k.m94679m(modifierM3409f11119, textResourceM21278l1111111111111, null, null, textResourceM21278l1111111111112, null, null, 0L, textResourceM21278l1111111111113, false, false, null, false, 1, 0, 0, false, null, false, false, null, null, null, null, null, interfaceC4339a11115, (Function1) objM87133R5, c28655q, (i31111 << 3) | 6 | (i31111 << 12) | (i31111 << 24), 3072, 1769472, 33545964);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f115, c2314t13));
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement115 = new LayoutWeightElement(1.0f, true);
                        List<String> listM119523s115 = m119523s(interfaceC28601c3);
                        i34 = i15 & 7168;
                        if (i34 == 2048) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R6 = c28655q.m87133R();
                        if (z16) {
                            objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                            c28655q.m87172p0(objM87133R6);
                        }
                        Function1 function11111119 = (Function1) objM87133R6;
                        if ((57344 & i15) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (z17) {
                            interfaceC28601c6 = interfaceC28601c3;
                            function6 = function5;
                            objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            interfaceC28601c6 = interfaceC28601c3;
                            function6 = function5;
                            objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                            c28655q.m87172p0(objM87133R7);
                        }
                        Function1 function111111110 = (Function1) objM87133R7;
                        if ((i15 & 458752) == 131072) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objM87133R8 = c28655q.m87133R();
                        if (z18) {
                            objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                            c28655q.m87172p0(objM87133R8);
                        } else {
                            objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                            c28655q.m87172p0(objM87133R8);
                        }
                        m119501K(listM119523s115, function11111119, function111111110, (InterfaceC4339a) objM87133R8, layoutWeightElement115, c28655q, 0, 0);
                        Modifier modifierM91835e115 = AbstractC30007c.m91835e(c2314t13, f115, c28655q, c2314t13, 1.0f);
                        C22994r1 c22994r1M66759a115 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1118 = c28655q.m87165m();
                        Modifier modifierM118962N1118 = AbstractC37056f.m118962N(c28655q, modifierM91835e115);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i1111114, c22994r1M66759a115);
                        AbstractC28683x.m87239G(c28655q, c0209i1111116, interfaceC28653p1M87165m1118);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i1111115, modifierM118962N1118);
                        AbstractC33088k.g gVar115 = new AbstractC33088k.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                        boolean zM119497G115 = m119497G(interfaceC28601c2);
                        TextResource textResourceM21278l1111111111114 = AbstractC8693b.m21278l("Enable Caching");
                        objM87133R9 = c28655q.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C29802c(24, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R9);
                        }
                        Function1 function111111111 = function6;
                        AbstractC33087j.m104824f(textResourceM21278l1111111111114, gVar115, zM119497G115, false, 0, 0L, null, null, false, 0L, (Function1) objM87133R9, c28655q, i31111 | (AbstractC33088k.g.f137992d << 3), 6, MessageListItemViewType.UNREAD_SEPARATOR);
                        AbstractC18489d0.m53356B(c28655q, true, c2314t13, f115, c28655q);
                        Modifier modifierM3409f111110 = AbstractC1102d.m3409f(1.0f, c2314t13);
                        TextResource textResourceM21278l1111111111115 = AbstractC8693b.m21278l("Let's Go!");
                        boolean z211111 = !AbstractC39414r.m125890i0(m119495E(interfaceC28601c5));
                        if (i34 == 2048) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        objM87133R10 = c28655q.m87133R();
                        if (z19) {
                            objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                            c28655q.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                            c28655q.m87172p0(objM87133R10);
                        }
                        AbstractC27292z.m82343j(modifierM3409f111110, z211111, false, null, null, null, textResourceM21278l1111111111115, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R10, c28655q, (i31111 << 18) | 6, 0, 8124);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        interfaceC4339a4 = interfaceC4339a7;
                        str3 = str16;
                        z15 = z211110;
                        function3 = function111111111;
                        list3 = list16;
                        interfaceC4339a5 = interfaceC4339a11114;
                    } else {
                        c0209i3 = c0209i;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                    C0209i c0209i1111117 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i1111117, modifierM118962N1117);
                    C0209i c0209i1111118 = c0209i3;
                    AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Arch V2 Playground")), null, interfaceC4339a11114, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 >> 9) & 7168), 53);
                    Modifier modifierM3409f111111 = AbstractC1102d.m3409f(1.0f, c2314t13);
                    TextResource textResourceM21278l1111111111116 = AbstractC8693b.m21278l(m119495E(interfaceC28601c1));
                    TextResource textResourceM21278l1111111111117 = AbstractC8693b.m21278l("");
                    TextResource textResourceM21278l1111111111118 = AbstractC8693b.m21278l("");
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C37312d(2);
                        c28655q.m87172p0(objM87133R4);
                    }
                    InterfaceC4339a interfaceC4339a11116 = (InterfaceC4339a) objM87133R4;
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        interfaceC28601c4 = interfaceC28601c1;
                        objM87133R5 = new C29802c(25, interfaceC28601c4);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        interfaceC28601c4 = interfaceC28601c1;
                    }
                    int i31112 = TextResource.$stable;
                    interfaceC28601c5 = interfaceC28601c4;
                    AbstractC30792k.m94679m(modifierM3409f111111, textResourceM21278l1111111111116, null, null, textResourceM21278l1111111111117, null, null, 0L, textResourceM21278l1111111111118, false, false, null, false, 1, 0, 0, false, null, false, false, null, null, null, null, null, interfaceC4339a11116, (Function1) objM87133R5, c28655q, (i31112 << 3) | 6 | (i31112 << 12) | (i31112 << 24), 3072, 1769472, 33545964);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f115, c2314t13));
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement116 = new LayoutWeightElement(1.0f, true);
                    List<String> listM119523s116 = m119523s(interfaceC28601c3);
                    i34 = i15 & 7168;
                    if (i34 == 2048) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (z16) {
                        objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                        c28655q.m87172p0(objM87133R6);
                    }
                    Function1 function111111112 = (Function1) objM87133R6;
                    if ((57344 & i15) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (z17) {
                        interfaceC28601c6 = interfaceC28601c3;
                        function6 = function5;
                        objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        interfaceC28601c6 = interfaceC28601c3;
                        function6 = function5;
                        objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                        c28655q.m87172p0(objM87133R7);
                    }
                    Function1 function111111113 = (Function1) objM87133R7;
                    if ((i15 & 458752) == 131072) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R8 = c28655q.m87133R();
                    if (z18) {
                        objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                        c28655q.m87172p0(objM87133R8);
                    }
                    m119501K(listM119523s116, function111111112, function111111113, (InterfaceC4339a) objM87133R8, layoutWeightElement116, c28655q, 0, 0);
                    Modifier modifierM91835e116 = AbstractC30007c.m91835e(c2314t13, f115, c28655q, c2314t13, 1.0f);
                    C22994r1 c22994r1M66759a116 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1119 = c28655q.m87165m();
                    Modifier modifierM118962N1119 = AbstractC37056f.m118962N(c28655q, modifierM91835e116);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1111114, c22994r1M66759a116);
                    AbstractC28683x.m87239G(c28655q, c0209i1111118, interfaceC28653p1M87165m1119);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1111117, modifierM118962N1119);
                    AbstractC33088k.g gVar116 = new AbstractC33088k.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                    boolean zM119497G116 = m119497G(interfaceC28601c2);
                    TextResource textResourceM21278l1111111111119 = AbstractC8693b.m21278l("Enable Caching");
                    objM87133R9 = c28655q.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C29802c(24, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R9);
                    }
                    Function1 function111111114 = function6;
                    AbstractC33087j.m104824f(textResourceM21278l1111111111119, gVar116, zM119497G116, false, 0, 0L, null, null, false, 0L, (Function1) objM87133R9, c28655q, i31112 | (AbstractC33088k.g.f137992d << 3), 6, MessageListItemViewType.UNREAD_SEPARATOR);
                    AbstractC18489d0.m53356B(c28655q, true, c2314t13, f115, c28655q);
                    Modifier modifierM3409f111112 = AbstractC1102d.m3409f(1.0f, c2314t13);
                    TextResource textResourceM21278l11111111111110 = AbstractC8693b.m21278l("Let's Go!");
                    boolean z211112 = !AbstractC39414r.m125890i0(m119495E(interfaceC28601c5));
                    if (i34 == 2048) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objM87133R10 = c28655q.m87133R();
                    if (z19) {
                        objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                        c28655q.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                        c28655q.m87172p0(objM87133R10);
                    }
                    AbstractC27292z.m82343j(modifierM3409f111112, z211112, false, null, null, null, textResourceM21278l11111111111110, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R10, c28655q, (i31112 << 18) | 6, 0, 8124);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    interfaceC4339a4 = interfaceC4339a7;
                    str3 = str16;
                    z15 = z211110;
                    function3 = function111111114;
                    list3 = list16;
                    interfaceC4339a5 = interfaceC4339a11114;
                } else {
                    c28655q.m87138X();
                    interfaceC4351m2 = interfaceC4351m;
                    interfaceC4339a4 = interfaceC4339a;
                    str3 = str2;
                    z15 = z13;
                    list3 = list2;
                    interfaceC4339a5 = interfaceC4339a3;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3922f(str3, z15, list3, interfaceC4351m2, function3, interfaceC4339a4, interfaceC4339a5, i13, i14);
                }
            }
            i15 |= 24576;
            function2 = function1;
            i26 = i14 & 32;
            if (i26 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87157i(interfaceC4339a)) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i27;
            }
            i28 = i14 & 64;
            if (i28 != 0) {
                i15 |= 1572864;
                interfaceC4339a3 = interfaceC4339a2;
            } else {
                interfaceC4339a3 = interfaceC4339a2;
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87157i(interfaceC4339a3)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i15 |= i29;
                }
            }
            if ((i15 & 599187) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i35 != 0) {
                    str2 = "";
                }
                if (i36 != 0) {
                    z13 = true;
                }
                if (i16 != 0) {
                    list2 = C25271y.f99162w;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R14 = c28655q.m87133R();
                    if (objM87133R14 == c28676v0) {
                        objM87133R14 = new C35728q(16, (byte) 0);
                        c28655q.m87172p0(objM87133R14);
                    }
                    interfaceC4351m2 = (InterfaceC4351m) objM87133R14;
                } else {
                    interfaceC4351m2 = interfaceC4351m;
                }
                if (i24 != 0) {
                    objM87133R13 = c28655q.m87133R();
                    if (objM87133R13 == c28676v0) {
                        objM87133R13 = new C37168b(13);
                        c28655q.m87172p0(objM87133R13);
                    }
                    function4 = (Function1) objM87133R13;
                } else {
                    function4 = function2;
                }
                if (i26 != 0) {
                    objM87133R12 = c28655q.m87133R();
                    if (objM87133R12 == c28676v0) {
                        objM87133R12 = new C37312d(0);
                        c28655q.m87172p0(objM87133R12);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R12;
                } else {
                    interfaceC4339a6 = interfaceC4339a;
                }
                if (i28 != 0) {
                    objM87133R11 = c28655q.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C37312d(1);
                        c28655q.m87172p0(objM87133R11);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R11;
                }
                interfaceC4339a7 = interfaceC4339a6;
                InterfaceC4339a interfaceC4339a11117 = interfaceC4339a3;
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(str2);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC31061c.m95647w(z13, c28655q);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(list2);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                C2314t c2314t14 = C2314t.f9131w;
                String str17 = str2;
                float f116 = 2 * 8;
                Modifier modifierM3394p14 = AbstractC1099a.m3394p(f116, AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, c2314t14), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                boolean z211113 = z13;
                C23010x c23010xM66775a14 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                function5 = function4;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11110 = c28655q.m87165m();
                Modifier modifierM118962N11110 = AbstractC37056f.m118962N(c28655q, modifierM3394p14);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                List<String> list17 = list2;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i1111119 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i1111119, c23010xM66775a14);
                c0209i = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m11110);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    c0209i3 = c0209i;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i11111110 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i11111110, modifierM118962N11110);
                    C0209i c0209i11111111 = c0209i3;
                    AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Arch V2 Playground")), null, interfaceC4339a11117, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 >> 9) & 7168), 53);
                    Modifier modifierM3409f111113 = AbstractC1102d.m3409f(1.0f, c2314t14);
                    TextResource textResourceM21278l11111111111111 = AbstractC8693b.m21278l(m119495E(interfaceC28601c1));
                    TextResource textResourceM21278l11111111111112 = AbstractC8693b.m21278l("");
                    TextResource textResourceM21278l11111111111113 = AbstractC8693b.m21278l("");
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C37312d(2);
                        c28655q.m87172p0(objM87133R4);
                    }
                    InterfaceC4339a interfaceC4339a11118 = (InterfaceC4339a) objM87133R4;
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        interfaceC28601c4 = interfaceC28601c1;
                        objM87133R5 = new C29802c(25, interfaceC28601c4);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        interfaceC28601c4 = interfaceC28601c1;
                    }
                    int i31113 = TextResource.$stable;
                    interfaceC28601c5 = interfaceC28601c4;
                    AbstractC30792k.m94679m(modifierM3409f111113, textResourceM21278l11111111111111, null, null, textResourceM21278l11111111111112, null, null, 0L, textResourceM21278l11111111111113, false, false, null, false, 1, 0, 0, false, null, false, false, null, null, null, null, null, interfaceC4339a11118, (Function1) objM87133R5, c28655q, (i31113 << 3) | 6 | (i31113 << 12) | (i31113 << 24), 3072, 1769472, 33545964);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f116, c2314t14));
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement117 = new LayoutWeightElement(1.0f, true);
                    List<String> listM119523s117 = m119523s(interfaceC28601c3);
                    i34 = i15 & 7168;
                    if (i34 == 2048) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (z16) {
                        objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                        c28655q.m87172p0(objM87133R6);
                    }
                    Function1 function111111115 = (Function1) objM87133R6;
                    if ((57344 & i15) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (z17) {
                        interfaceC28601c6 = interfaceC28601c3;
                        function6 = function5;
                        objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        interfaceC28601c6 = interfaceC28601c3;
                        function6 = function5;
                        objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                        c28655q.m87172p0(objM87133R7);
                    }
                    Function1 function111111116 = (Function1) objM87133R7;
                    if ((i15 & 458752) == 131072) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R8 = c28655q.m87133R();
                    if (z18) {
                        objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                        c28655q.m87172p0(objM87133R8);
                    }
                    m119501K(listM119523s117, function111111115, function111111116, (InterfaceC4339a) objM87133R8, layoutWeightElement117, c28655q, 0, 0);
                    Modifier modifierM91835e117 = AbstractC30007c.m91835e(c2314t14, f116, c28655q, c2314t14, 1.0f);
                    C22994r1 c22994r1M66759a117 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111 = c28655q.m87165m();
                    Modifier modifierM118962N11111 = AbstractC37056f.m118962N(c28655q, modifierM91835e117);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1111119, c22994r1M66759a117);
                    AbstractC28683x.m87239G(c28655q, c0209i11111111, interfaceC28653p1M87165m11111);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11111110, modifierM118962N11111);
                    AbstractC33088k.g gVar117 = new AbstractC33088k.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                    boolean zM119497G117 = m119497G(interfaceC28601c2);
                    TextResource textResourceM21278l11111111111114 = AbstractC8693b.m21278l("Enable Caching");
                    objM87133R9 = c28655q.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C29802c(24, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R9);
                    }
                    Function1 function111111117 = function6;
                    AbstractC33087j.m104824f(textResourceM21278l11111111111114, gVar117, zM119497G117, false, 0, 0L, null, null, false, 0L, (Function1) objM87133R9, c28655q, i31113 | (AbstractC33088k.g.f137992d << 3), 6, MessageListItemViewType.UNREAD_SEPARATOR);
                    AbstractC18489d0.m53356B(c28655q, true, c2314t14, f116, c28655q);
                    Modifier modifierM3409f111114 = AbstractC1102d.m3409f(1.0f, c2314t14);
                    TextResource textResourceM21278l11111111111115 = AbstractC8693b.m21278l("Let's Go!");
                    boolean z211114 = !AbstractC39414r.m125890i0(m119495E(interfaceC28601c5));
                    if (i34 == 2048) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objM87133R10 = c28655q.m87133R();
                    if (z19) {
                        objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                        c28655q.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                        c28655q.m87172p0(objM87133R10);
                    }
                    AbstractC27292z.m82343j(modifierM3409f111114, z211114, false, null, null, null, textResourceM21278l11111111111115, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R10, c28655q, (i31113 << 18) | 6, 0, 8124);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    interfaceC4339a4 = interfaceC4339a7;
                    str3 = str17;
                    z15 = z211113;
                    function3 = function111111117;
                    list3 = list17;
                    interfaceC4339a5 = interfaceC4339a11117;
                } else {
                    c0209i3 = c0209i;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                C0209i c0209i11111112 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i11111112, modifierM118962N11110);
                C0209i c0209i11111113 = c0209i3;
                AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Arch V2 Playground")), null, interfaceC4339a11117, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 >> 9) & 7168), 53);
                Modifier modifierM3409f111115 = AbstractC1102d.m3409f(1.0f, c2314t14);
                TextResource textResourceM21278l11111111111116 = AbstractC8693b.m21278l(m119495E(interfaceC28601c1));
                TextResource textResourceM21278l11111111111117 = AbstractC8693b.m21278l("");
                TextResource textResourceM21278l11111111111118 = AbstractC8693b.m21278l("");
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C37312d(2);
                    c28655q.m87172p0(objM87133R4);
                }
                InterfaceC4339a interfaceC4339a11119 = (InterfaceC4339a) objM87133R4;
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    interfaceC28601c4 = interfaceC28601c1;
                    objM87133R5 = new C29802c(25, interfaceC28601c4);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    interfaceC28601c4 = interfaceC28601c1;
                }
                int i31114 = TextResource.$stable;
                interfaceC28601c5 = interfaceC28601c4;
                AbstractC30792k.m94679m(modifierM3409f111115, textResourceM21278l11111111111116, null, null, textResourceM21278l11111111111117, null, null, 0L, textResourceM21278l11111111111118, false, false, null, false, 1, 0, 0, false, null, false, false, null, null, null, null, null, interfaceC4339a11119, (Function1) objM87133R5, c28655q, (i31114 << 3) | 6 | (i31114 << 12) | (i31114 << 24), 3072, 1769472, 33545964);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f116, c2314t14));
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement118 = new LayoutWeightElement(1.0f, true);
                List<String> listM119523s118 = m119523s(interfaceC28601c3);
                i34 = i15 & 7168;
                if (i34 == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM87133R6 = c28655q.m87133R();
                if (z16) {
                    objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                    c28655q.m87172p0(objM87133R6);
                }
                Function1 function111111118 = (Function1) objM87133R6;
                if ((57344 & i15) == 16384) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R7 = c28655q.m87133R();
                if (z17) {
                    interfaceC28601c6 = interfaceC28601c3;
                    function6 = function5;
                    objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    interfaceC28601c6 = interfaceC28601c3;
                    function6 = function5;
                    objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                    c28655q.m87172p0(objM87133R7);
                }
                Function1 function111111119 = (Function1) objM87133R7;
                if ((i15 & 458752) == 131072) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R8 = c28655q.m87133R();
                if (z18) {
                    objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                    c28655q.m87172p0(objM87133R8);
                }
                m119501K(listM119523s118, function111111118, function111111119, (InterfaceC4339a) objM87133R8, layoutWeightElement118, c28655q, 0, 0);
                Modifier modifierM91835e118 = AbstractC30007c.m91835e(c2314t14, f116, c28655q, c2314t14, 1.0f);
                C22994r1 c22994r1M66759a118 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11112 = c28655q.m87165m();
                Modifier modifierM118962N11112 = AbstractC37056f.m118962N(c28655q, modifierM91835e118);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i1111119, c22994r1M66759a118);
                AbstractC28683x.m87239G(c28655q, c0209i11111113, interfaceC28653p1M87165m11112);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i11111112, modifierM118962N11112);
                AbstractC33088k.g gVar118 = new AbstractC33088k.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                boolean zM119497G118 = m119497G(interfaceC28601c2);
                TextResource textResourceM21278l11111111111119 = AbstractC8693b.m21278l("Enable Caching");
                objM87133R9 = c28655q.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = new C29802c(24, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R9);
                }
                Function1 function1111111110 = function6;
                AbstractC33087j.m104824f(textResourceM21278l11111111111119, gVar118, zM119497G118, false, 0, 0L, null, null, false, 0L, (Function1) objM87133R9, c28655q, i31114 | (AbstractC33088k.g.f137992d << 3), 6, MessageListItemViewType.UNREAD_SEPARATOR);
                AbstractC18489d0.m53356B(c28655q, true, c2314t14, f116, c28655q);
                Modifier modifierM3409f111116 = AbstractC1102d.m3409f(1.0f, c2314t14);
                TextResource textResourceM21278l111111111111110 = AbstractC8693b.m21278l("Let's Go!");
                boolean z211115 = !AbstractC39414r.m125890i0(m119495E(interfaceC28601c5));
                if (i34 == 2048) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objM87133R10 = c28655q.m87133R();
                if (z19) {
                    objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                    c28655q.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                    c28655q.m87172p0(objM87133R10);
                }
                AbstractC27292z.m82343j(modifierM3409f111116, z211115, false, null, null, null, textResourceM21278l111111111111110, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R10, c28655q, (i31114 << 18) | 6, 0, 8124);
                c28655q = c28655q;
                c28655q.m87173q(true);
                interfaceC4339a4 = interfaceC4339a7;
                str3 = str17;
                z15 = z211113;
                function3 = function1111111110;
                list3 = list17;
                interfaceC4339a5 = interfaceC4339a11117;
            } else {
                c28655q.m87138X();
                interfaceC4351m2 = interfaceC4351m;
                interfaceC4339a4 = interfaceC4339a;
                str3 = str2;
                z15 = z13;
                list3 = list2;
                interfaceC4339a5 = interfaceC4339a3;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3922f(str3, z15, list3, interfaceC4351m2, function3, interfaceC4339a4, interfaceC4339a5, i13, i14);
            }
        }
        i15 |= 3072;
        i24 = i14 & 16;
        if (i24 != 0) {
            if ((i13 & 24576) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            i26 = i14 & 32;
            if (i26 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87157i(interfaceC4339a)) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i27;
            }
            i28 = i14 & 64;
            if (i28 != 0) {
                i15 |= 1572864;
                interfaceC4339a3 = interfaceC4339a2;
            } else {
                interfaceC4339a3 = interfaceC4339a2;
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87157i(interfaceC4339a3)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i15 |= i29;
                }
            }
            if ((i15 & 599187) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i35 != 0) {
                    str2 = "";
                }
                if (i36 != 0) {
                    z13 = true;
                }
                if (i16 != 0) {
                    list2 = C25271y.f99162w;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R14 = c28655q.m87133R();
                    if (objM87133R14 == c28676v0) {
                        objM87133R14 = new C35728q(16, (byte) 0);
                        c28655q.m87172p0(objM87133R14);
                    }
                    interfaceC4351m2 = (InterfaceC4351m) objM87133R14;
                } else {
                    interfaceC4351m2 = interfaceC4351m;
                }
                if (i24 != 0) {
                    objM87133R13 = c28655q.m87133R();
                    if (objM87133R13 == c28676v0) {
                        objM87133R13 = new C37168b(13);
                        c28655q.m87172p0(objM87133R13);
                    }
                    function4 = (Function1) objM87133R13;
                } else {
                    function4 = function2;
                }
                if (i26 != 0) {
                    objM87133R12 = c28655q.m87133R();
                    if (objM87133R12 == c28676v0) {
                        objM87133R12 = new C37312d(0);
                        c28655q.m87172p0(objM87133R12);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R12;
                } else {
                    interfaceC4339a6 = interfaceC4339a;
                }
                if (i28 != 0) {
                    objM87133R11 = c28655q.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C37312d(1);
                        c28655q.m87172p0(objM87133R11);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R11;
                }
                interfaceC4339a7 = interfaceC4339a6;
                InterfaceC4339a interfaceC4339a111110 = interfaceC4339a3;
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(str2);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC31061c.m95647w(z13, c28655q);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(list2);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                C2314t c2314t15 = C2314t.f9131w;
                String str18 = str2;
                float f117 = 2 * 8;
                Modifier modifierM3394p15 = AbstractC1099a.m3394p(f117, AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, c2314t15), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                boolean z211116 = z13;
                C23010x c23010xM66775a15 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                function5 = function4;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11113 = c28655q.m87165m();
                Modifier modifierM118962N11113 = AbstractC37056f.m118962N(c28655q, modifierM3394p15);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                List<String> list18 = list2;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i11111114 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i11111114, c23010xM66775a15);
                c0209i = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m11113);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    c0209i3 = c0209i;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i11111115 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i11111115, modifierM118962N11113);
                    C0209i c0209i11111116 = c0209i3;
                    AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Arch V2 Playground")), null, interfaceC4339a111110, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 >> 9) & 7168), 53);
                    Modifier modifierM3409f111117 = AbstractC1102d.m3409f(1.0f, c2314t15);
                    TextResource textResourceM21278l111111111111111 = AbstractC8693b.m21278l(m119495E(interfaceC28601c1));
                    TextResource textResourceM21278l111111111111112 = AbstractC8693b.m21278l("");
                    TextResource textResourceM21278l111111111111113 = AbstractC8693b.m21278l("");
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C37312d(2);
                        c28655q.m87172p0(objM87133R4);
                    }
                    InterfaceC4339a interfaceC4339a111111 = (InterfaceC4339a) objM87133R4;
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        interfaceC28601c4 = interfaceC28601c1;
                        objM87133R5 = new C29802c(25, interfaceC28601c4);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        interfaceC28601c4 = interfaceC28601c1;
                    }
                    int i31115 = TextResource.$stable;
                    interfaceC28601c5 = interfaceC28601c4;
                    AbstractC30792k.m94679m(modifierM3409f111117, textResourceM21278l111111111111111, null, null, textResourceM21278l111111111111112, null, null, 0L, textResourceM21278l111111111111113, false, false, null, false, 1, 0, 0, false, null, false, false, null, null, null, null, null, interfaceC4339a111111, (Function1) objM87133R5, c28655q, (i31115 << 3) | 6 | (i31115 << 12) | (i31115 << 24), 3072, 1769472, 33545964);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f117, c2314t15));
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement119 = new LayoutWeightElement(1.0f, true);
                    List<String> listM119523s119 = m119523s(interfaceC28601c3);
                    i34 = i15 & 7168;
                    if (i34 == 2048) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (z16) {
                        objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                        c28655q.m87172p0(objM87133R6);
                    }
                    Function1 function1111111111 = (Function1) objM87133R6;
                    if ((57344 & i15) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (z17) {
                        interfaceC28601c6 = interfaceC28601c3;
                        function6 = function5;
                        objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        interfaceC28601c6 = interfaceC28601c3;
                        function6 = function5;
                        objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                        c28655q.m87172p0(objM87133R7);
                    }
                    Function1 function1111111112 = (Function1) objM87133R7;
                    if ((i15 & 458752) == 131072) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R8 = c28655q.m87133R();
                    if (z18) {
                        objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                        c28655q.m87172p0(objM87133R8);
                    }
                    m119501K(listM119523s119, function1111111111, function1111111112, (InterfaceC4339a) objM87133R8, layoutWeightElement119, c28655q, 0, 0);
                    Modifier modifierM91835e119 = AbstractC30007c.m91835e(c2314t15, f117, c28655q, c2314t15, 1.0f);
                    C22994r1 c22994r1M66759a119 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11114 = c28655q.m87165m();
                    Modifier modifierM118962N11114 = AbstractC37056f.m118962N(c28655q, modifierM91835e119);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11111114, c22994r1M66759a119);
                    AbstractC28683x.m87239G(c28655q, c0209i11111116, interfaceC28653p1M87165m11114);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11111115, modifierM118962N11114);
                    AbstractC33088k.g gVar119 = new AbstractC33088k.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                    boolean zM119497G119 = m119497G(interfaceC28601c2);
                    TextResource textResourceM21278l111111111111114 = AbstractC8693b.m21278l("Enable Caching");
                    objM87133R9 = c28655q.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C29802c(24, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R9);
                    }
                    Function1 function1111111113 = function6;
                    AbstractC33087j.m104824f(textResourceM21278l111111111111114, gVar119, zM119497G119, false, 0, 0L, null, null, false, 0L, (Function1) objM87133R9, c28655q, i31115 | (AbstractC33088k.g.f137992d << 3), 6, MessageListItemViewType.UNREAD_SEPARATOR);
                    AbstractC18489d0.m53356B(c28655q, true, c2314t15, f117, c28655q);
                    Modifier modifierM3409f111118 = AbstractC1102d.m3409f(1.0f, c2314t15);
                    TextResource textResourceM21278l111111111111115 = AbstractC8693b.m21278l("Let's Go!");
                    boolean z211117 = !AbstractC39414r.m125890i0(m119495E(interfaceC28601c5));
                    if (i34 == 2048) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objM87133R10 = c28655q.m87133R();
                    if (z19) {
                        objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                        c28655q.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                        c28655q.m87172p0(objM87133R10);
                    }
                    AbstractC27292z.m82343j(modifierM3409f111118, z211117, false, null, null, null, textResourceM21278l111111111111115, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R10, c28655q, (i31115 << 18) | 6, 0, 8124);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    interfaceC4339a4 = interfaceC4339a7;
                    str3 = str18;
                    z15 = z211116;
                    function3 = function1111111113;
                    list3 = list18;
                    interfaceC4339a5 = interfaceC4339a111110;
                } else {
                    c0209i3 = c0209i;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                C0209i c0209i11111117 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i11111117, modifierM118962N11113);
                C0209i c0209i11111118 = c0209i3;
                AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Arch V2 Playground")), null, interfaceC4339a111110, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 >> 9) & 7168), 53);
                Modifier modifierM3409f111119 = AbstractC1102d.m3409f(1.0f, c2314t15);
                TextResource textResourceM21278l111111111111116 = AbstractC8693b.m21278l(m119495E(interfaceC28601c1));
                TextResource textResourceM21278l111111111111117 = AbstractC8693b.m21278l("");
                TextResource textResourceM21278l111111111111118 = AbstractC8693b.m21278l("");
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C37312d(2);
                    c28655q.m87172p0(objM87133R4);
                }
                InterfaceC4339a interfaceC4339a111112 = (InterfaceC4339a) objM87133R4;
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    interfaceC28601c4 = interfaceC28601c1;
                    objM87133R5 = new C29802c(25, interfaceC28601c4);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    interfaceC28601c4 = interfaceC28601c1;
                }
                int i31116 = TextResource.$stable;
                interfaceC28601c5 = interfaceC28601c4;
                AbstractC30792k.m94679m(modifierM3409f111119, textResourceM21278l111111111111116, null, null, textResourceM21278l111111111111117, null, null, 0L, textResourceM21278l111111111111118, false, false, null, false, 1, 0, 0, false, null, false, false, null, null, null, null, null, interfaceC4339a111112, (Function1) objM87133R5, c28655q, (i31116 << 3) | 6 | (i31116 << 12) | (i31116 << 24), 3072, 1769472, 33545964);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f117, c2314t15));
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement1110 = new LayoutWeightElement(1.0f, true);
                List<String> listM119523s1110 = m119523s(interfaceC28601c3);
                i34 = i15 & 7168;
                if (i34 == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM87133R6 = c28655q.m87133R();
                if (z16) {
                    objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                    c28655q.m87172p0(objM87133R6);
                }
                Function1 function1111111114 = (Function1) objM87133R6;
                if ((57344 & i15) == 16384) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R7 = c28655q.m87133R();
                if (z17) {
                    interfaceC28601c6 = interfaceC28601c3;
                    function6 = function5;
                    objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    interfaceC28601c6 = interfaceC28601c3;
                    function6 = function5;
                    objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                    c28655q.m87172p0(objM87133R7);
                }
                Function1 function1111111115 = (Function1) objM87133R7;
                if ((i15 & 458752) == 131072) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R8 = c28655q.m87133R();
                if (z18) {
                    objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                    c28655q.m87172p0(objM87133R8);
                }
                m119501K(listM119523s1110, function1111111114, function1111111115, (InterfaceC4339a) objM87133R8, layoutWeightElement1110, c28655q, 0, 0);
                Modifier modifierM91835e1110 = AbstractC30007c.m91835e(c2314t15, f117, c28655q, c2314t15, 1.0f);
                C22994r1 c22994r1M66759a1110 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11115 = c28655q.m87165m();
                Modifier modifierM118962N11115 = AbstractC37056f.m118962N(c28655q, modifierM91835e1110);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i11111114, c22994r1M66759a1110);
                AbstractC28683x.m87239G(c28655q, c0209i11111118, interfaceC28653p1M87165m11115);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i11111117, modifierM118962N11115);
                AbstractC33088k.g gVar1110 = new AbstractC33088k.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                boolean zM119497G1110 = m119497G(interfaceC28601c2);
                TextResource textResourceM21278l111111111111119 = AbstractC8693b.m21278l("Enable Caching");
                objM87133R9 = c28655q.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = new C29802c(24, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R9);
                }
                Function1 function1111111116 = function6;
                AbstractC33087j.m104824f(textResourceM21278l111111111111119, gVar1110, zM119497G1110, false, 0, 0L, null, null, false, 0L, (Function1) objM87133R9, c28655q, i31116 | (AbstractC33088k.g.f137992d << 3), 6, MessageListItemViewType.UNREAD_SEPARATOR);
                AbstractC18489d0.m53356B(c28655q, true, c2314t15, f117, c28655q);
                Modifier modifierM3409f1111110 = AbstractC1102d.m3409f(1.0f, c2314t15);
                TextResource textResourceM21278l1111111111111110 = AbstractC8693b.m21278l("Let's Go!");
                boolean z211118 = !AbstractC39414r.m125890i0(m119495E(interfaceC28601c5));
                if (i34 == 2048) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objM87133R10 = c28655q.m87133R();
                if (z19) {
                    objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                    c28655q.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                    c28655q.m87172p0(objM87133R10);
                }
                AbstractC27292z.m82343j(modifierM3409f1111110, z211118, false, null, null, null, textResourceM21278l1111111111111110, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R10, c28655q, (i31116 << 18) | 6, 0, 8124);
                c28655q = c28655q;
                c28655q.m87173q(true);
                interfaceC4339a4 = interfaceC4339a7;
                str3 = str18;
                z15 = z211116;
                function3 = function1111111116;
                list3 = list18;
                interfaceC4339a5 = interfaceC4339a111110;
            } else {
                c28655q.m87138X();
                interfaceC4351m2 = interfaceC4351m;
                interfaceC4339a4 = interfaceC4339a;
                str3 = str2;
                z15 = z13;
                list3 = list2;
                interfaceC4339a5 = interfaceC4339a3;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3922f(str3, z15, list3, interfaceC4351m2, function3, interfaceC4339a4, interfaceC4339a5, i13, i14);
            }
        }
        i15 |= 24576;
        function2 = function1;
        i26 = i14 & 32;
        if (i26 != 0) {
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q.m87157i(interfaceC4339a)) {
                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i27;
        }
        i28 = i14 & 64;
        if (i28 != 0) {
            i15 |= 1572864;
            interfaceC4339a3 = interfaceC4339a2;
        } else {
            interfaceC4339a3 = interfaceC4339a2;
            if ((i13 & 1572864) == 0) {
                if (c28655q.m87157i(interfaceC4339a3)) {
                    i29 = 1048576;
                } else {
                    i29 = 524288;
                }
                i15 |= i29;
            }
        }
        if ((i15 & 599187) != 599186) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            if (i35 != 0) {
                str2 = "";
            }
            if (i36 != 0) {
                z13 = true;
            }
            if (i16 != 0) {
                list2 = C25271y.f99162w;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R14 = c28655q.m87133R();
                if (objM87133R14 == c28676v0) {
                    objM87133R14 = new C35728q(16, (byte) 0);
                    c28655q.m87172p0(objM87133R14);
                }
                interfaceC4351m2 = (InterfaceC4351m) objM87133R14;
            } else {
                interfaceC4351m2 = interfaceC4351m;
            }
            if (i24 != 0) {
                objM87133R13 = c28655q.m87133R();
                if (objM87133R13 == c28676v0) {
                    objM87133R13 = new C37168b(13);
                    c28655q.m87172p0(objM87133R13);
                }
                function4 = (Function1) objM87133R13;
            } else {
                function4 = function2;
            }
            if (i26 != 0) {
                objM87133R12 = c28655q.m87133R();
                if (objM87133R12 == c28676v0) {
                    objM87133R12 = new C37312d(0);
                    c28655q.m87172p0(objM87133R12);
                }
                interfaceC4339a6 = (InterfaceC4339a) objM87133R12;
            } else {
                interfaceC4339a6 = interfaceC4339a;
            }
            if (i28 != 0) {
                objM87133R11 = c28655q.m87133R();
                if (objM87133R11 == c28676v0) {
                    objM87133R11 = new C37312d(1);
                    c28655q.m87172p0(objM87133R11);
                }
                interfaceC4339a3 = (InterfaceC4339a) objM87133R11;
            }
            interfaceC4339a7 = interfaceC4339a6;
            InterfaceC4339a interfaceC4339a111113 = interfaceC4339a3;
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(str2);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC31061c.m95647w(z13, c28655q);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(list2);
                c28655q.m87172p0(objM87133R3);
            }
            interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
            C2314t c2314t16 = C2314t.f9131w;
            String str19 = str2;
            float f118 = 2 * 8;
            Modifier modifierM3394p16 = AbstractC1099a.m3394p(f118, AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, c2314t16), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
            boolean z211119 = z13;
            C23010x c23010xM66775a16 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            function5 = function4;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11116 = c28655q.m87165m();
            Modifier modifierM118962N11116 = AbstractC37056f.m118962N(c28655q, modifierM3394p16);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            List<String> list19 = list2;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i11111119 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i11111119, c23010xM66775a16);
            c0209i = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m11116);
            c0209i2 = C0217k.f732j;
            if (c28655q.f115903S) {
                c0209i3 = c0209i;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i111111110 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i111111110, modifierM118962N11116);
                C0209i c0209i111111111 = c0209i3;
                AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Arch V2 Playground")), null, interfaceC4339a111113, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 >> 9) & 7168), 53);
                Modifier modifierM3409f1111111 = AbstractC1102d.m3409f(1.0f, c2314t16);
                TextResource textResourceM21278l1111111111111111 = AbstractC8693b.m21278l(m119495E(interfaceC28601c1));
                TextResource textResourceM21278l1111111111111112 = AbstractC8693b.m21278l("");
                TextResource textResourceM21278l1111111111111113 = AbstractC8693b.m21278l("");
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C37312d(2);
                    c28655q.m87172p0(objM87133R4);
                }
                InterfaceC4339a interfaceC4339a111114 = (InterfaceC4339a) objM87133R4;
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    interfaceC28601c4 = interfaceC28601c1;
                    objM87133R5 = new C29802c(25, interfaceC28601c4);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    interfaceC28601c4 = interfaceC28601c1;
                }
                int i31117 = TextResource.$stable;
                interfaceC28601c5 = interfaceC28601c4;
                AbstractC30792k.m94679m(modifierM3409f1111111, textResourceM21278l1111111111111111, null, null, textResourceM21278l1111111111111112, null, null, 0L, textResourceM21278l1111111111111113, false, false, null, false, 1, 0, 0, false, null, false, false, null, null, null, null, null, interfaceC4339a111114, (Function1) objM87133R5, c28655q, (i31117 << 3) | 6 | (i31117 << 12) | (i31117 << 24), 3072, 1769472, 33545964);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f118, c2314t16));
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement1111 = new LayoutWeightElement(1.0f, true);
                List<String> listM119523s1111 = m119523s(interfaceC28601c3);
                i34 = i15 & 7168;
                if (i34 == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM87133R6 = c28655q.m87133R();
                if (z16) {
                    objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                    c28655q.m87172p0(objM87133R6);
                }
                Function1 function1111111117 = (Function1) objM87133R6;
                if ((57344 & i15) == 16384) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R7 = c28655q.m87133R();
                if (z17) {
                    interfaceC28601c6 = interfaceC28601c3;
                    function6 = function5;
                    objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    interfaceC28601c6 = interfaceC28601c3;
                    function6 = function5;
                    objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                    c28655q.m87172p0(objM87133R7);
                }
                Function1 function1111111118 = (Function1) objM87133R7;
                if ((i15 & 458752) == 131072) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R8 = c28655q.m87133R();
                if (z18) {
                    objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                    c28655q.m87172p0(objM87133R8);
                }
                m119501K(listM119523s1111, function1111111117, function1111111118, (InterfaceC4339a) objM87133R8, layoutWeightElement1111, c28655q, 0, 0);
                Modifier modifierM91835e1111 = AbstractC30007c.m91835e(c2314t16, f118, c28655q, c2314t16, 1.0f);
                C22994r1 c22994r1M66759a1111 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11117 = c28655q.m87165m();
                Modifier modifierM118962N11117 = AbstractC37056f.m118962N(c28655q, modifierM91835e1111);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i11111119, c22994r1M66759a1111);
                AbstractC28683x.m87239G(c28655q, c0209i111111111, interfaceC28653p1M87165m11117);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i111111110, modifierM118962N11117);
                AbstractC33088k.g gVar1111 = new AbstractC33088k.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                boolean zM119497G1111 = m119497G(interfaceC28601c2);
                TextResource textResourceM21278l1111111111111114 = AbstractC8693b.m21278l("Enable Caching");
                objM87133R9 = c28655q.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = new C29802c(24, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R9);
                }
                Function1 function1111111119 = function6;
                AbstractC33087j.m104824f(textResourceM21278l1111111111111114, gVar1111, zM119497G1111, false, 0, 0L, null, null, false, 0L, (Function1) objM87133R9, c28655q, i31117 | (AbstractC33088k.g.f137992d << 3), 6, MessageListItemViewType.UNREAD_SEPARATOR);
                AbstractC18489d0.m53356B(c28655q, true, c2314t16, f118, c28655q);
                Modifier modifierM3409f1111112 = AbstractC1102d.m3409f(1.0f, c2314t16);
                TextResource textResourceM21278l1111111111111115 = AbstractC8693b.m21278l("Let's Go!");
                boolean z2111110 = !AbstractC39414r.m125890i0(m119495E(interfaceC28601c5));
                if (i34 == 2048) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objM87133R10 = c28655q.m87133R();
                if (z19) {
                    objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                    c28655q.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                    c28655q.m87172p0(objM87133R10);
                }
                AbstractC27292z.m82343j(modifierM3409f1111112, z2111110, false, null, null, null, textResourceM21278l1111111111111115, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R10, c28655q, (i31117 << 18) | 6, 0, 8124);
                c28655q = c28655q;
                c28655q.m87173q(true);
                interfaceC4339a4 = interfaceC4339a7;
                str3 = str19;
                z15 = z211119;
                function3 = function1111111119;
                list3 = list19;
                interfaceC4339a5 = interfaceC4339a111113;
            } else {
                c0209i3 = c0209i;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
            C0209i c0209i111111112 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i111111112, modifierM118962N11116);
            C0209i c0209i111111113 = c0209i3;
            AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Arch V2 Playground")), null, interfaceC4339a111113, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 >> 9) & 7168), 53);
            Modifier modifierM3409f1111113 = AbstractC1102d.m3409f(1.0f, c2314t16);
            TextResource textResourceM21278l1111111111111116 = AbstractC8693b.m21278l(m119495E(interfaceC28601c1));
            TextResource textResourceM21278l1111111111111117 = AbstractC8693b.m21278l("");
            TextResource textResourceM21278l1111111111111118 = AbstractC8693b.m21278l("");
            objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C37312d(2);
                c28655q.m87172p0(objM87133R4);
            }
            InterfaceC4339a interfaceC4339a111115 = (InterfaceC4339a) objM87133R4;
            objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                interfaceC28601c4 = interfaceC28601c1;
                objM87133R5 = new C29802c(25, interfaceC28601c4);
                c28655q.m87172p0(objM87133R5);
            } else {
                interfaceC28601c4 = interfaceC28601c1;
            }
            int i31118 = TextResource.$stable;
            interfaceC28601c5 = interfaceC28601c4;
            AbstractC30792k.m94679m(modifierM3409f1111113, textResourceM21278l1111111111111116, null, null, textResourceM21278l1111111111111117, null, null, 0L, textResourceM21278l1111111111111118, false, false, null, false, 1, 0, 0, false, null, false, false, null, null, null, null, null, interfaceC4339a111115, (Function1) objM87133R5, c28655q, (i31118 << 3) | 6 | (i31118 << 12) | (i31118 << 24), 3072, 1769472, 33545964);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f118, c2314t16));
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement1112 = new LayoutWeightElement(1.0f, true);
            List<String> listM119523s1112 = m119523s(interfaceC28601c3);
            i34 = i15 & 7168;
            if (i34 == 2048) {
                z16 = true;
            } else {
                z16 = false;
            }
            objM87133R6 = c28655q.m87133R();
            if (z16) {
                objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                c28655q.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new C9792p(interfaceC4351m2, interfaceC28601c2, 1);
                c28655q.m87172p0(objM87133R6);
            }
            Function1 function11111111110 = (Function1) objM87133R6;
            if ((57344 & i15) == 16384) {
                z17 = true;
            } else {
                z17 = false;
            }
            objM87133R7 = c28655q.m87133R();
            if (z17) {
                interfaceC28601c6 = interfaceC28601c3;
                function6 = function5;
                objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                c28655q.m87172p0(objM87133R7);
            } else {
                interfaceC28601c6 = interfaceC28601c3;
                function6 = function5;
                objM87133R7 = new C28827b(function6, interfaceC28601c6, 17);
                c28655q.m87172p0(objM87133R7);
            }
            Function1 function11111111111 = (Function1) objM87133R7;
            if ((i15 & 458752) == 131072) {
                z18 = true;
            } else {
                z18 = false;
            }
            objM87133R8 = c28655q.m87133R();
            if (z18) {
                objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                c28655q.m87172p0(objM87133R8);
            } else {
                objM87133R8 = new C10999t0(interfaceC4339a7, interfaceC28601c6, 6);
                c28655q.m87172p0(objM87133R8);
            }
            m119501K(listM119523s1112, function11111111110, function11111111111, (InterfaceC4339a) objM87133R8, layoutWeightElement1112, c28655q, 0, 0);
            Modifier modifierM91835e1112 = AbstractC30007c.m91835e(c2314t16, f118, c28655q, c2314t16, 1.0f);
            C22994r1 c22994r1M66759a1112 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11118 = c28655q.m87165m();
            Modifier modifierM118962N11118 = AbstractC37056f.m118962N(c28655q, modifierM91835e1112);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i11111119, c22994r1M66759a1112);
            AbstractC28683x.m87239G(c28655q, c0209i111111113, interfaceC28653p1M87165m11118);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q, c0209i111111112, modifierM118962N11118);
            AbstractC33088k.g gVar1112 = new AbstractC33088k.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            boolean zM119497G1112 = m119497G(interfaceC28601c2);
            TextResource textResourceM21278l1111111111111119 = AbstractC8693b.m21278l("Enable Caching");
            objM87133R9 = c28655q.m87133R();
            if (objM87133R9 == c28676v0) {
                objM87133R9 = new C29802c(24, interfaceC28601c2);
                c28655q.m87172p0(objM87133R9);
            }
            Function1 function11111111112 = function6;
            AbstractC33087j.m104824f(textResourceM21278l1111111111111119, gVar1112, zM119497G1112, false, 0, 0L, null, null, false, 0L, (Function1) objM87133R9, c28655q, i31118 | (AbstractC33088k.g.f137992d << 3), 6, MessageListItemViewType.UNREAD_SEPARATOR);
            AbstractC18489d0.m53356B(c28655q, true, c2314t16, f118, c28655q);
            Modifier modifierM3409f1111114 = AbstractC1102d.m3409f(1.0f, c2314t16);
            TextResource textResourceM21278l11111111111111110 = AbstractC8693b.m21278l("Let's Go!");
            boolean z2111111 = !AbstractC39414r.m125890i0(m119495E(interfaceC28601c5));
            if (i34 == 2048) {
                z19 = true;
            } else {
                z19 = false;
            }
            objM87133R10 = c28655q.m87133R();
            if (z19) {
                objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                c28655q.m87172p0(objM87133R10);
            } else {
                objM87133R10 = new C23329a(interfaceC4351m2, interfaceC28601c5, interfaceC28601c2, 2);
                c28655q.m87172p0(objM87133R10);
            }
            AbstractC27292z.m82343j(modifierM3409f1111114, z2111111, false, null, null, null, textResourceM21278l11111111111111110, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R10, c28655q, (i31118 << 18) | 6, 0, 8124);
            c28655q = c28655q;
            c28655q.m87173q(true);
            interfaceC4339a4 = interfaceC4339a7;
            str3 = str19;
            z15 = z211119;
            function3 = function11111111112;
            list3 = list19;
            interfaceC4339a5 = interfaceC4339a111113;
        } else {
            c28655q.m87138X();
            interfaceC4351m2 = interfaceC4351m;
            interfaceC4339a4 = interfaceC4339a;
            str3 = str2;
            z15 = z13;
            list3 = list2;
            interfaceC4339a5 = interfaceC4339a3;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3922f(str3, z15, list3, interfaceC4351m2, function3, interfaceC4339a4, interfaceC4339a5, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m119521q(String str, boolean z4) {
        AbstractC22676k.m65750j(str, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m119522r(String it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    private static final List<String> m119523s(InterfaceC28601c1 interfaceC28601c1) {
        return (List) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: t */
    private static final void m119524t(InterfaceC28601c1 interfaceC28601c1, List<String> list) {
        interfaceC28601c1.setValue(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m119525u() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m119526v(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m119496F(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m119527w(InterfaceC4351m interfaceC4351m, InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC4351m.invoke(it, Boolean.valueOf(m119497G(interfaceC28601c1)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m119528x(Function1 function1, InterfaceC28601c1 interfaceC28601c1, String path) {
        AbstractC22676k.m65750j(path, "path");
        List<String> listM119523s = m119523s(interfaceC28601c1);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM119523s) {
            if (!AbstractC22676k.m65745e((String) obj, path)) {
                arrayList.add(obj);
            }
        }
        m119524t(interfaceC28601c1, arrayList);
        function1.invoke(path);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m119529y(InterfaceC4339a interfaceC4339a, InterfaceC28601c1 interfaceC28601c1) {
        m119524t(interfaceC28601c1, C25271y.f99162w);
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m119530z(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        m119498H(interfaceC28601c1, z4);
        return C23454a0.f92919a;
    }
}
