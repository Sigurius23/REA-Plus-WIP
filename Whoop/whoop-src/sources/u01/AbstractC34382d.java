package u01;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.material.C1119d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.GenericInteraction;
import cw2.C11161b;
import d01.C11439d;
import d41.C11678d;
import eh0.C13193b;
import gb1.AbstractC15679g;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2307m;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15210z4;
import p208i2.AbstractC17918w0;
import p208i2.C17903p;
import p208i2.C17916v0;
import p208i2.C17919x;
import p209i3.C18027i;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22960g2;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p291l0.C23010x;
import p291l0.InterfaceC22996s0;
import p319m4.AbstractC25012a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p510u0.C34350r;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import t01.C33259e;
import tu1.C34190c;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: u01.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a1\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u0014\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a+\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0003¢\u0006\u0004\b\u001f\u0010\u001e\"\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\"\u0014\u0010%\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"\"\u0014\u0010'\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\"\"\u0014\u0010)\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\"\"\u0014\u0010+\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\"¨\u0006,"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lu01/e;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "o", "(Landroidx/compose/ui/Modifier;Lu01/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "bodyTapEvent", "z", "(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "Lkd1/o;", "avatar", "Ly81/f;", "avatarRingColor", "streakImage", "Lcom/whoop/design/util/TextResource;", "streak", "m", "(Lkd1/o;Ly81/f;Lkd1/o;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V", "x", "(Landroidx/compose/ui/Modifier;Lkd1/o;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;II)V", "icon", "k", "(Lkd1/o;Landroidx/compose/runtime/Composer;I)V", "Lu01/f;", "metric", "t", "(Lu01/f;Landroidx/compose/runtime/Composer;I)V", "v", "Ly3/f;", "a", "F", "AvatarImageSize", "b", "AvatarWrapperSize", "c", "AvatarRingWidth", "d", "AvatarStreakTopOffset", "e", "ActivityIconSize", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34382d {

    /* JADX INFO: renamed from: a */
    private static final float f144480a;

    /* JADX INFO: renamed from: b */
    private static final float f144481b;

    /* JADX INFO: renamed from: c */
    private static final float f144482c;

    /* JADX INFO: renamed from: d */
    private static final float f144483d = 39;

    /* JADX INFO: renamed from: e */
    private static final float f144484e;

    /* JADX INFO: renamed from: u01.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f144485a;

        static {
            int[] iArr = new int[EnumC34379a.values().length];
            try {
                iArr[EnumC34379a.HIGHLIGHTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC34379a.HIDDEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC34379a.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f144485a = iArr;
        }
    }

    static {
        float f13 = 4;
        f144480a = 12 * f13;
        f144481b = 14 * f13;
        f144482c = ((float) 0.5d) * f13;
        f144484e = 5 * f13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m108683A(Function1 function1, Object obj) {
        function1.invoke(obj);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    private static final void m108694k(AbstractC22403o abstractC22403o, Composer composer, int i13) {
        int i14;
        AbstractC22403o abstractC22403o2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2005986866);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(abstractC22403o) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, i14 & 14, 3);
            abstractC22403o2 = abstractC22403o;
            AbstractC29125c.m88522c(abstractC26165aM64500i, null, AbstractC1102d.m3419p(f144484e, C2314t.f9131w), null, C39102j.f168200b, 0.0f, new C17903p(C38072d.f163053a.m121949b(c28655q, 6).getWhite70(), 5), c28655q, 25008, 40);
            c28655q = c28655q;
        } else {
            abstractC22403o2 = abstractC22403o;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11678d(abstractC22403o2, i13, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m108695l(AbstractC22403o abstractC22403o, int i13, Composer composer, int i14) {
        m108694k(abstractC22403o, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    private static final void m108696m(AbstractC22403o abstractC22403o, EnumC39333f enumC39333f, AbstractC22403o abstractC22403o2, TextResource textResource, Composer composer, int i13) {
        int i14;
        C17919x c17919xM31989h;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-99616207);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(abstractC22403o) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87149e(enumC39333f == null ? -1 : enumC39333f.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(abstractC22403o2) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87153g(textResource) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            if (enumC39333f == null) {
                c28655q.m87150e0(156167869);
                c28655q.m87173q(false);
                c17919xM31989h = null;
            } else {
                c28655q.m87150e0(-1241888316);
                c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, enumC39333f.mo134584toComposableColorWaAFU9c(c28655q, (i14 >> 3) & 14));
            }
            long j7 = c17919xM31989h != null ? c17919xM31989h.f69639a : C17919x.f69636m;
            float f13 = f144481b;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3419p = AbstractC1102d.m3419p(f13, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3419p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            Modifier modifierM3419p2 = AbstractC1102d.m3419p(f13, c2314t);
            C2307m c2307m = C2299e.f9102E;
            C1100b c1100b = C1100b.f4583a;
            Modifier modifierMo3400a = c1100b.mo3400a(modifierM3419p2, c2307m);
            float f14 = f144482c;
            C33252i c33252i = AbstractC33253j.f138651a;
            AbstractC22989q.m66760a(AbstractC15751g.m44455h(modifierMo3400a, f14, j7, c33252i), c28655q, 0);
            c28655q = c28655q;
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403o == null ? AbstractC22403o.b.f87641b : abstractC22403o, null, null, c28655q, 0, 3), null, AbstractC37056f.m118994r(c1100b.mo3400a(AbstractC1102d.m3419p(f144480a, c2314t), c2307m), c33252i), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
            if (textResource != null) {
                c28655q.m87150e0(1003364637);
                m108707x(AbstractC1099a.m3392n(c1100b.mo3400a(c2314t, C2299e.f9115x), 0.0f, f144483d, 1), abstractC22403o2, textResource, c28655q, (i14 >> 3) & MessageListItemViewType.GIPHY, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1003635639);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34190c(abstractC22403o, enumC39333f, abstractC22403o2, textResource, i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m108697n(AbstractC22403o abstractC22403o, EnumC39333f enumC39333f, AbstractC22403o abstractC22403o2, TextResource textResource, int i13, Composer composer, int i14) {
        m108696m(abstractC22403o, enumC39333f, abstractC22403o2, textResource, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02de  */
    /* JADX WARN: Code duplicated, block: B:103:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:106:0x0316  */
    /* JADX WARN: Code duplicated, block: B:107:0x031a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0327  */
    /* JADX WARN: Code duplicated, block: B:112:0x0335  */
    /* JADX WARN: Code duplicated, block: B:115:0x0344  */
    /* JADX WARN: Code duplicated, block: B:117:0x0350  */
    /* JADX WARN: Code duplicated, block: B:120:0x036e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0372  */
    /* JADX WARN: Code duplicated, block: B:125:0x037f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x0385  */
    /* JADX WARN: Code duplicated, block: B:130:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:133:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:134:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:137:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:139:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:142:0x0469  */
    /* JADX WARN: Code duplicated, block: B:144:0x0488  */
    /* JADX WARN: Code duplicated, block: B:145:0x048c  */
    /* JADX WARN: Code duplicated, block: B:148:0x0499  */
    /* JADX WARN: Code duplicated, block: B:150:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:154:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:156:0x04c8 A[LOOP:0: B:152:0x04ba->B:156:0x04c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:160:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:163:0x0505  */
    /* JADX WARN: Code duplicated, block: B:164:0x054a  */
    /* JADX WARN: Code duplicated, block: B:166:0x0553  */
    /* JADX WARN: Code duplicated, block: B:169:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:171:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:174:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:177:0x04dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:63:0x010e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0117  */
    /* JADX WARN: Code duplicated, block: B:66:0x0168  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:76:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:80:0x023b  */
    /* JADX WARN: Code duplicated, block: B:81:0x023f  */
    /* JADX WARN: Code duplicated, block: B:84:0x024c  */
    /* JADX WARN: Code duplicated, block: B:86:0x025a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0272  */
    /* JADX WARN: Code duplicated, block: B:90:0x0274  */
    /* JADX WARN: Code duplicated, block: B:94:0x0280  */
    /* JADX WARN: Code duplicated, block: B:97:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:98:0x02d1  */
    /* JADX INFO: renamed from: o */
    public static final void m108698o(Modifier modifier, C34383e viewState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C28676v0 c28676v0;
        Function1 function4;
        TextResource textResourceM108721i;
        String str;
        String strM21274h;
        List<C34384f> listM108719g;
        Object objM108718f;
        Object obj;
        GenericInteraction genericInteractionM108725p;
        List<AbstractC22403o> listM108714a;
        int i16;
        C17916v0 c17916v0;
        int i17;
        Modifier modifierM3394p;
        float f13;
        float f14;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        String str2;
        C0209i c0209i4;
        int i18;
        int i19;
        int iHashCode2;
        AbstractC22403o abstractC22403oM108723n;
        AbstractC22403o abstractC22403o;
        TextResource textResourceM108722m;
        Function1 function5;
        int iHashCode3;
        C22949e c22949e;
        int iHashCode4;
        C2314t c2314t2;
        Function1 function6;
        Modifier modifierM3360e;
        int iHashCode5;
        Function1 function7;
        boolean z13;
        boolean z14;
        Function1 function8;
        int iHashCode6;
        int i24;
        int i25;
        Object objM87133R;
        boolean z15;
        GenericInteraction genericInteraction;
        boolean zM87157i;
        Object objM87133R2;
        Object objM87133R3;
        C2306l c2306l = C2299e.f9108K;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1384125984);
        int i26 = i14 & 1;
        if (i26 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        int i27 = i14 & 4;
        if (i27 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i26 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i27 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C34350r(11);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                String strM21274h2 = AbstractC8693b.m21274h(viewState.getTitle(), c28655q, 0);
                textResourceM108721i = viewState.getNoDataLabel();
                if (textResourceM108721i == null) {
                    c28655q.m87150e0(1484070281);
                    c28655q.m87173q(false);
                    str = null;
                } else {
                    c28655q.m87150e0(1484070282);
                    String strM21274h3 = AbstractC8693b.m21274h(textResourceM108721i, c28655q, 0);
                    c28655q.m87173q(false);
                    str = strM21274h3;
                }
                strM21274h = AbstractC8693b.m21274h(viewState.getStreak(), c28655q, 0);
                listM108719g = viewState.m108719g();
                objM108718f = viewState.getInteraction();
                if (objM108718f == null) {
                    objM108718f = viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String();
                }
                obj = objM108718f;
                genericInteractionM108725p = viewState.getTitleInteraction();
                listM108714a = viewState.m108714a();
                i16 = a.f144485a[viewState.getBackgroundStyle().ordinal()];
                c17916v0 = AbstractC17918w0.f69621a;
                if (i16 != 1) {
                    if (i16 != 2) {
                        c28655q.m87150e0(1294835700);
                        float f15 = 3;
                        float f16 = 4 * f15;
                        C38072d c38072d = C38072d.f163053a;
                        modifierM3394p = AbstractC1099a.m3394p(1 * 8, AbstractC1092a.m3358c(AbstractC15679g.m44107d(AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(f16)), (float) 1.5d, c38072d.m121949b(c28655q, 6).getWhite30(), AbstractC33253j.m105489e(f16), f15, f15), c38072d.m121949b(c28655q, 6).getWhite5(), c17916v0));
                        c28655q.m87173q(false);
                    } else {
                        if (i16 == 3) {
                            throw AbstractC11895b.m32003v(1294813330, c28655q, false);
                        }
                        c28655q.m87150e0(1294838465);
                        c28655q.m87173q(false);
                        modifierM3394p = AbstractC1099a.m3396r(c2314t, 1 * 8, 0.0f, 2);
                    }
                    i17 = 8;
                } else {
                    genericInteractionM108725p = genericInteractionM108725p;
                    c28655q.m87150e0(1294820212);
                    i17 = 8;
                    modifierM3394p = AbstractC1099a.m3394p(1 * 8, AbstractC1092a.m3358c(AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(3 * 4)), C38072d.f163053a.m121949b(c28655q, 6).getWhite5(), c17916v0));
                    c28655q.m87173q(false);
                }
                Modifier modifierMo3471e = AbstractC1102d.m3409f(1.0f, modifier4).mo3471e(modifierM3394p);
                f13 = i17;
                f14 = 2 * f13;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), c2306l, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                Modifier modifier5 = modifier4;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    str2 = strM21274h;
                } else {
                    str2 = strM21274h;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    float f17 = f144480a;
                    i18 = i15 & 896;
                    i19 = i18 | 6;
                    Modifier modifierM108709z = m108709z(AbstractC1102d.m3404a(c2314t, f17, f17), obj, function4, c28655q, i19);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM108709z);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    AbstractC22403o abstractC22403oM108715b = viewState.getAvatar();
                    EnumC39333f enumC39333fM108716c = viewState.getAvatarRingColor();
                    abstractC22403oM108723n = viewState.getStreakImage();
                    if (AbstractC39414r.m125890i0(str2)) {
                        abstractC22403o = null;
                    } else {
                        abstractC22403o = abstractC22403oM108723n;
                    }
                    textResourceM108722m = viewState.getStreak();
                    if (AbstractC39414r.m125890i0(str2)) {
                        textResourceM108722m = null;
                    }
                    function5 = function4;
                    m108696m(abstractC22403oM108715b, enumC39333fM108716c, abstractC22403o, textResourceM108722m, c28655q, 0);
                    c28655q.m87173q(true);
                    C23000t1 c23000t1 = C23000t1.f90727a;
                    Modifier modifierM3427x = AbstractC1102d.m3427x(c23000t1.mo66772c(c2314t, true, 1.0f), null, 3);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * f13), C2299e.f9110M, c28655q, 6);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3427x);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    c22949e = AbstractC22977m.f90650a;
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                    Modifier modifierMo66772c = c23000t1.mo66772c(c2314t, false, 1.0f);
                    if (genericInteractionM108725p != null) {
                        c28655q.m87150e0(1901804547);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC11266d.m30453g(c28655q);
                        }
                        InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
                        C1119d c1119dM43228a = AbstractC15210z4.m43228a(0L, 7, false, 0.0f);
                        C18027i c18027i = new C18027i(0);
                        if (i18 == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        genericInteraction = genericInteractionM108725p;
                        zM87157i = z15 | c28655q.m87157i(genericInteraction);
                        objM87133R2 = c28655q.m87133R();
                        if (!zM87157i || objM87133R2 == c28676v0) {
                            function6 = function5;
                            objM87133R2 = new C11161b(function6, genericInteraction, 6);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            function6 = function5;
                        }
                        modifierM3360e = AbstractC1092a.m3360e(c2314t, interfaceC21083i, c1119dM43228a, false, c18027i, (InterfaceC4339a) objM87133R2, 12);
                        c2314t2 = c2314t;
                        c28655q.m87173q(false);
                    } else {
                        c2314t2 = c2314t;
                        function6 = function5;
                        c28655q.m87150e0(1902120220);
                        c28655q.m87173q(false);
                        modifierM3360e = c2314t2;
                    }
                    Modifier modifierMo3471e2 = modifierMo66772c.mo3471e(modifierM3360e);
                    C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q((float) 1.25d, f13, c2306l, c28655q, 54);
                    iHashCode5 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M53376q);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m5);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode5))) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N5);
                    C38072d c38072d2 = C38072d.f163053a;
                    function7 = function6;
                    AbstractC30795n.m94707h(strM21274h2, c23000t1.mo66772c(c2314t2, false, 1.0f), c38072d2.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c38072d2.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 3120, 186360);
                    c28655q = c28655q;
                    if (listM108714a.isEmpty()) {
                        z13 = true;
                        c28655q.m87150e0(-991087776);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-991461605);
                        C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
                        iHashCode6 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, c2314t2);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a3);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m6);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode6))) {
                            AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N6);
                        c28655q.m87150e0(1751401372);
                        i24 = 0;
                        for (Object obj2 : listM108714a) {
                            i25 = i24 + 1;
                            if (i24 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            c28655q.m87144b0(-2122759921, Integer.valueOf(i24));
                            m108694k((AbstractC22403o) obj2, c28655q, 0);
                            c28655q.m87173q(false);
                            i24 = i25;
                        }
                        z13 = true;
                        AbstractC25012a.m73392y(c28655q, false, true, false);
                    }
                    c28655q.m87173q(z13);
                    c28655q.m87173q(z13);
                    if (listM108719g.isEmpty()) {
                        z14 = z13;
                        function8 = function7;
                        if (str == null && (AbstractC39414r.m125890i0(str) ^ z14) == z14) {
                            c28655q.m87150e0(-1492915073);
                            C38072d c38072d3 = C38072d.f163053a;
                            AbstractC30795n.m94707h(str, m108709z(AbstractC1102d.m3409f(1.0f, c2314t2), obj, function8, c28655q, i19), c38072d3.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c38072d3.m121952e(c28655q, 6).getB2(), null, c28655q, 0, 3120, 186360);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-1492444152);
                            c28655q.m87173q(false);
                        }
                    } else {
                        c28655q.m87150e0(-1493635327);
                        z14 = z13;
                        function8 = function7;
                        AbstractC22960g2.m66729a(m108709z(AbstractC1102d.m3409f(1.0f, c2314t2), obj, function7, c28655q, i19), AbstractC22977m.m66746i(f14), AbstractC22977m.m66746i(((float) 0.5d) * f13), c2306l, 0, 0, AbstractC37817c.m121344e(1673593175, c28655q, new C13193b(listM108719g, 3)), c28655q, 1576368, 48);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z14);
                    c28655q.m87173q(z14);
                    function3 = function8;
                    modifier3 = modifier5;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                float f18 = f144480a;
                i18 = i15 & 896;
                i19 = i18 | 6;
                Modifier modifierM108709z2 = m108709z(AbstractC1102d.m3404a(c2314t, f18, f18), obj, function4, c28655q, i19);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM108709z2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m7);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N7);
                AbstractC22403o abstractC22403oM108715b2 = viewState.getAvatar();
                EnumC39333f enumC39333fM108716c2 = viewState.getAvatarRingColor();
                abstractC22403oM108723n = viewState.getStreakImage();
                if (AbstractC39414r.m125890i0(str2)) {
                    abstractC22403o = abstractC22403oM108723n;
                } else {
                    abstractC22403o = null;
                }
                textResourceM108722m = viewState.getStreak();
                if (AbstractC39414r.m125890i0(str2)) {
                    textResourceM108722m = null;
                }
                function5 = function4;
                m108696m(abstractC22403oM108715b2, enumC39333fM108716c2, abstractC22403o, textResourceM108722m, c28655q, 0);
                c28655q.m87173q(true);
                C23000t1 c23000t2 = C23000t1.f90727a;
                Modifier modifierM3427x2 = AbstractC1102d.m3427x(c23000t2.mo66772c(c2314t, true, 1.0f), null, 3);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * f13), C2299e.f9110M, c28655q, 6);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3427x2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m8);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N8);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                c22949e = AbstractC22977m.f90650a;
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a4);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m9);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N9);
                Modifier modifierMo66772c2 = c23000t2.mo66772c(c2314t, false, 1.0f);
                if (genericInteractionM108725p != null) {
                    c28655q.m87150e0(1901804547);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q);
                    }
                    InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R;
                    C1119d c1119dM43228a2 = AbstractC15210z4.m43228a(0L, 7, false, 0.0f);
                    C18027i c18027i2 = new C18027i(0);
                    if (i18 == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    genericInteraction = genericInteractionM108725p;
                    zM87157i = z15 | c28655q.m87157i(genericInteraction);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        function6 = function5;
                        objM87133R2 = new C11161b(function6, genericInteraction, 6);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        function6 = function5;
                        objM87133R2 = new C11161b(function6, genericInteraction, 6);
                        c28655q.m87172p0(objM87133R2);
                    }
                    modifierM3360e = AbstractC1092a.m3360e(c2314t, interfaceC21083i2, c1119dM43228a2, false, c18027i2, (InterfaceC4339a) objM87133R2, 12);
                    c2314t2 = c2314t;
                    c28655q.m87173q(false);
                } else {
                    c2314t2 = c2314t;
                    function6 = function5;
                    c28655q.m87150e0(1902120220);
                    c28655q.m87173q(false);
                    modifierM3360e = c2314t2;
                }
                Modifier modifierMo3471e3 = modifierMo66772c2.mo3471e(modifierM3360e);
                C22994r1 c22994r1M53376q2 = AbstractC18489d0.m53376q((float) 1.25d, f13, c2306l, c28655q, 54);
                iHashCode5 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierMo3471e3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M53376q2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m10);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N10);
                C38072d c38072d4 = C38072d.f163053a;
                function7 = function6;
                AbstractC30795n.m94707h(strM21274h2, c23000t2.mo66772c(c2314t2, false, 1.0f), c38072d4.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c38072d4.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 3120, 186360);
                c28655q = c28655q;
                if (listM108714a.isEmpty()) {
                    c28655q.m87150e0(-991461605);
                    C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
                    iHashCode6 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, c2314t2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a5);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11);
                    c28655q.m87150e0(1751401372);
                    i24 = 0;
                    while (r0.hasNext()) {
                        i25 = i24 + 1;
                        if (i24 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        c28655q.m87144b0(-2122759921, Integer.valueOf(i24));
                        m108694k((AbstractC22403o) obj2, c28655q, 0);
                        c28655q.m87173q(false);
                        i24 = i25;
                    }
                    z13 = true;
                    AbstractC25012a.m73392y(c28655q, false, true, false);
                } else {
                    z13 = true;
                    c28655q.m87150e0(-991087776);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z13);
                c28655q.m87173q(z13);
                if (listM108719g.isEmpty()) {
                    c28655q.m87150e0(-1493635327);
                    z14 = z13;
                    function8 = function7;
                    AbstractC22960g2.m66729a(m108709z(AbstractC1102d.m3409f(1.0f, c2314t2), obj, function7, c28655q, i19), AbstractC22977m.m66746i(f14), AbstractC22977m.m66746i(((float) 0.5d) * f13), c2306l, 0, 0, AbstractC37817c.m121344e(1673593175, c28655q, new C13193b(listM108719g, 3)), c28655q, 1576368, 48);
                    c28655q.m87173q(false);
                } else {
                    z14 = z13;
                    function8 = function7;
                    if (str == null) {
                        c28655q.m87150e0(-1492444152);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1492444152);
                        c28655q.m87173q(false);
                    }
                }
                c28655q.m87173q(z14);
                c28655q.m87173q(z14);
                function3 = function8;
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33259e(modifier3, viewState, function3, i13, i14, 9);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i26 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i27 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C34350r(11);
                    c28655q.m87172p0(objM87133R3);
                }
                function4 = (Function1) objM87133R3;
            } else {
                function4 = function2;
            }
            String strM21274h4 = AbstractC8693b.m21274h(viewState.getTitle(), c28655q, 0);
            textResourceM108721i = viewState.getNoDataLabel();
            if (textResourceM108721i == null) {
                c28655q.m87150e0(1484070281);
                c28655q.m87173q(false);
                str = null;
            } else {
                c28655q.m87150e0(1484070282);
                String strM21274h5 = AbstractC8693b.m21274h(textResourceM108721i, c28655q, 0);
                c28655q.m87173q(false);
                str = strM21274h5;
            }
            strM21274h = AbstractC8693b.m21274h(viewState.getStreak(), c28655q, 0);
            listM108719g = viewState.m108719g();
            objM108718f = viewState.getInteraction();
            if (objM108718f == null) {
                objM108718f = viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String();
            }
            obj = objM108718f;
            genericInteractionM108725p = viewState.getTitleInteraction();
            listM108714a = viewState.m108714a();
            i16 = a.f144485a[viewState.getBackgroundStyle().ordinal()];
            c17916v0 = AbstractC17918w0.f69621a;
            if (i16 != 1) {
                if (i16 != 2) {
                    c28655q.m87150e0(1294835700);
                    float f19 = 3;
                    float f110 = 4 * f19;
                    C38072d c38072d5 = C38072d.f163053a;
                    modifierM3394p = AbstractC1099a.m3394p(1 * 8, AbstractC1092a.m3358c(AbstractC15679g.m44107d(AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(f110)), (float) 1.5d, c38072d5.m121949b(c28655q, 6).getWhite30(), AbstractC33253j.m105489e(f110), f19, f19), c38072d5.m121949b(c28655q, 6).getWhite5(), c17916v0));
                    c28655q.m87173q(false);
                } else {
                    if (i16 == 3) {
                        throw AbstractC11895b.m32003v(1294813330, c28655q, false);
                    }
                    c28655q.m87150e0(1294838465);
                    c28655q.m87173q(false);
                    modifierM3394p = AbstractC1099a.m3396r(c2314t, 1 * 8, 0.0f, 2);
                }
                i17 = 8;
            } else {
                genericInteractionM108725p = genericInteractionM108725p;
                c28655q.m87150e0(1294820212);
                i17 = 8;
                modifierM3394p = AbstractC1099a.m3394p(1 * 8, AbstractC1092a.m3358c(AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(3 * 4)), C38072d.f163053a.m121949b(c28655q, 6).getWhite5(), c17916v0));
                c28655q.m87173q(false);
            }
            Modifier modifierMo3471e4 = AbstractC1102d.m3409f(1.0f, modifier4).mo3471e(modifierM3394p);
            f13 = i17;
            f14 = 2 * f13;
            C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), c2306l, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
            Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierMo3471e4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            Modifier modifier6 = modifier4;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a6);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m12);
            c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                str2 = strM21274h;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N12);
                float f111 = f144480a;
                i18 = i15 & 896;
                i19 = i18 | 6;
                Modifier modifierM108709z3 = m108709z(AbstractC1102d.m3404a(c2314t, f111, f111), obj, function4, c28655q, i19);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM108709z3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m13);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N13);
                AbstractC22403o abstractC22403oM108715b3 = viewState.getAvatar();
                EnumC39333f enumC39333fM108716c3 = viewState.getAvatarRingColor();
                abstractC22403oM108723n = viewState.getStreakImage();
                if (AbstractC39414r.m125890i0(str2)) {
                    abstractC22403o = abstractC22403oM108723n;
                } else {
                    abstractC22403o = null;
                }
                textResourceM108722m = viewState.getStreak();
                if (AbstractC39414r.m125890i0(str2)) {
                    textResourceM108722m = null;
                }
                function5 = function4;
                m108696m(abstractC22403oM108715b3, enumC39333fM108716c3, abstractC22403o, textResourceM108722m, c28655q, 0);
                c28655q.m87173q(true);
                C23000t1 c23000t3 = C23000t1.f90727a;
                Modifier modifierM3427x3 = AbstractC1102d.m3427x(c23000t3.mo66772c(c2314t, true, 1.0f), null, 3);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * f13), C2299e.f9110M, c28655q, 6);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierM3427x3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m14);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N14);
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                c22949e = AbstractC22977m.f90650a;
                C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a7);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m15);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N15);
                Modifier modifierMo66772c3 = c23000t3.mo66772c(c2314t, false, 1.0f);
                if (genericInteractionM108725p != null) {
                    c28655q.m87150e0(1901804547);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q);
                    }
                    InterfaceC21083i interfaceC21083i3 = (InterfaceC21083i) objM87133R;
                    C1119d c1119dM43228a3 = AbstractC15210z4.m43228a(0L, 7, false, 0.0f);
                    C18027i c18027i3 = new C18027i(0);
                    if (i18 == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    genericInteraction = genericInteractionM108725p;
                    zM87157i = z15 | c28655q.m87157i(genericInteraction);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        function6 = function5;
                        objM87133R2 = new C11161b(function6, genericInteraction, 6);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        function6 = function5;
                        objM87133R2 = new C11161b(function6, genericInteraction, 6);
                        c28655q.m87172p0(objM87133R2);
                    }
                    modifierM3360e = AbstractC1092a.m3360e(c2314t, interfaceC21083i3, c1119dM43228a3, false, c18027i3, (InterfaceC4339a) objM87133R2, 12);
                    c2314t2 = c2314t;
                    c28655q.m87173q(false);
                } else {
                    c2314t2 = c2314t;
                    function6 = function5;
                    c28655q.m87150e0(1902120220);
                    c28655q.m87173q(false);
                    modifierM3360e = c2314t2;
                }
                Modifier modifierMo3471e5 = modifierMo66772c3.mo3471e(modifierM3360e);
                C22994r1 c22994r1M53376q3 = AbstractC18489d0.m53376q((float) 1.25d, f13, c2306l, c28655q, 54);
                iHashCode5 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierMo3471e5);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M53376q3);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m16);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N16);
                C38072d c38072d6 = C38072d.f163053a;
                function7 = function6;
                AbstractC30795n.m94707h(strM21274h4, c23000t3.mo66772c(c2314t2, false, 1.0f), c38072d6.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c38072d6.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 3120, 186360);
                c28655q = c28655q;
                if (listM108714a.isEmpty()) {
                    c28655q.m87150e0(-991461605);
                    C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
                    iHashCode6 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q.m87165m();
                    Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q, c2314t2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a8);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m17);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N17);
                    c28655q.m87150e0(1751401372);
                    i24 = 0;
                    while (r0.hasNext()) {
                        i25 = i24 + 1;
                        if (i24 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        c28655q.m87144b0(-2122759921, Integer.valueOf(i24));
                        m108694k((AbstractC22403o) obj2, c28655q, 0);
                        c28655q.m87173q(false);
                        i24 = i25;
                    }
                    z13 = true;
                    AbstractC25012a.m73392y(c28655q, false, true, false);
                } else {
                    z13 = true;
                    c28655q.m87150e0(-991087776);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z13);
                c28655q.m87173q(z13);
                if (listM108719g.isEmpty()) {
                    c28655q.m87150e0(-1493635327);
                    z14 = z13;
                    function8 = function7;
                    AbstractC22960g2.m66729a(m108709z(AbstractC1102d.m3409f(1.0f, c2314t2), obj, function7, c28655q, i19), AbstractC22977m.m66746i(f14), AbstractC22977m.m66746i(((float) 0.5d) * f13), c2306l, 0, 0, AbstractC37817c.m121344e(1673593175, c28655q, new C13193b(listM108719g, 3)), c28655q, 1576368, 48);
                    c28655q.m87173q(false);
                } else {
                    z14 = z13;
                    function8 = function7;
                    if (str == null) {
                        c28655q.m87150e0(-1492444152);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1492444152);
                        c28655q.m87173q(false);
                    }
                }
                c28655q.m87173q(z14);
                c28655q.m87173q(z14);
                function3 = function8;
                modifier3 = modifier6;
            } else {
                str2 = strM21274h;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N12);
            float f112 = f144480a;
            i18 = i15 & 896;
            i19 = i18 | 6;
            Modifier modifierM108709z4 = m108709z(AbstractC1102d.m3404a(c2314t, f112, f112), obj, function4, c28655q, i19);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q.m87165m();
            Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q, modifierM108709z4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m18);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N18);
            AbstractC22403o abstractC22403oM108715b4 = viewState.getAvatar();
            EnumC39333f enumC39333fM108716c4 = viewState.getAvatarRingColor();
            abstractC22403oM108723n = viewState.getStreakImage();
            if (AbstractC39414r.m125890i0(str2)) {
                abstractC22403o = abstractC22403oM108723n;
            } else {
                abstractC22403o = null;
            }
            textResourceM108722m = viewState.getStreak();
            if (AbstractC39414r.m125890i0(str2)) {
                textResourceM108722m = null;
            }
            function5 = function4;
            m108696m(abstractC22403oM108715b4, enumC39333fM108716c4, abstractC22403o, textResourceM108722m, c28655q, 0);
            c28655q.m87173q(true);
            C23000t1 c23000t4 = C23000t1.f90727a;
            Modifier modifierM3427x4 = AbstractC1102d.m3427x(c23000t4.mo66772c(c2314t, true, 1.0f), null, 3);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * f13), C2299e.f9110M, c28655q, 6);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q.m87165m();
            Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q, modifierM3427x4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m19);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N19);
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
            c22949e = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
            iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q.m87165m();
            Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a9);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m110);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N110);
            Modifier modifierMo66772c4 = c23000t4.mo66772c(c2314t, false, 1.0f);
            if (genericInteractionM108725p != null) {
                c28655q.m87150e0(1901804547);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q);
                }
                InterfaceC21083i interfaceC21083i4 = (InterfaceC21083i) objM87133R;
                C1119d c1119dM43228a4 = AbstractC15210z4.m43228a(0L, 7, false, 0.0f);
                C18027i c18027i4 = new C18027i(0);
                if (i18 == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                genericInteraction = genericInteractionM108725p;
                zM87157i = z15 | c28655q.m87157i(genericInteraction);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    function6 = function5;
                    objM87133R2 = new C11161b(function6, genericInteraction, 6);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    function6 = function5;
                    objM87133R2 = new C11161b(function6, genericInteraction, 6);
                    c28655q.m87172p0(objM87133R2);
                }
                modifierM3360e = AbstractC1092a.m3360e(c2314t, interfaceC21083i4, c1119dM43228a4, false, c18027i4, (InterfaceC4339a) objM87133R2, 12);
                c2314t2 = c2314t;
                c28655q.m87173q(false);
            } else {
                c2314t2 = c2314t;
                function6 = function5;
                c28655q.m87150e0(1902120220);
                c28655q.m87173q(false);
                modifierM3360e = c2314t2;
            }
            Modifier modifierMo3471e6 = modifierMo66772c4.mo3471e(modifierM3360e);
            C22994r1 c22994r1M53376q4 = AbstractC18489d0.m53376q((float) 1.25d, f13, c2306l, c28655q, 54);
            iHashCode5 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q.m87165m();
            Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q, modifierMo3471e6);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M53376q4);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m111);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N111);
            C38072d c38072d7 = C38072d.f163053a;
            function7 = function6;
            AbstractC30795n.m94707h(strM21274h4, c23000t4.mo66772c(c2314t2, false, 1.0f), c38072d7.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c38072d7.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 3120, 186360);
            c28655q = c28655q;
            if (listM108714a.isEmpty()) {
                c28655q.m87150e0(-991461605);
                C22994r1 c22994r1M66759a10 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
                iHashCode6 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q.m87165m();
                Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q, c2314t2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a10);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m112);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N112);
                c28655q.m87150e0(1751401372);
                i24 = 0;
                while (r0.hasNext()) {
                    i25 = i24 + 1;
                    if (i24 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    c28655q.m87144b0(-2122759921, Integer.valueOf(i24));
                    m108694k((AbstractC22403o) obj2, c28655q, 0);
                    c28655q.m87173q(false);
                    i24 = i25;
                }
                z13 = true;
                AbstractC25012a.m73392y(c28655q, false, true, false);
            } else {
                z13 = true;
                c28655q.m87150e0(-991087776);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z13);
            c28655q.m87173q(z13);
            if (listM108719g.isEmpty()) {
                c28655q.m87150e0(-1493635327);
                z14 = z13;
                function8 = function7;
                AbstractC22960g2.m66729a(m108709z(AbstractC1102d.m3409f(1.0f, c2314t2), obj, function7, c28655q, i19), AbstractC22977m.m66746i(f14), AbstractC22977m.m66746i(((float) 0.5d) * f13), c2306l, 0, 0, AbstractC37817c.m121344e(1673593175, c28655q, new C13193b(listM108719g, 3)), c28655q, 1576368, 48);
                c28655q.m87173q(false);
            } else {
                z14 = z13;
                function8 = function7;
                if (str == null) {
                    c28655q.m87150e0(-1492444152);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1492444152);
                    c28655q.m87173q(false);
                }
            }
            c28655q.m87173q(z14);
            c28655q.m87173q(z14);
            function3 = function8;
            modifier3 = modifier6;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33259e(modifier3, viewState, function3, i13, i14, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m108699p(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m108700q(Function1 function1, GenericInteraction genericInteraction) {
        function1.invoke(genericInteraction);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m108701r(List list, InterfaceC22996s0 FlowRow, Composer composer, int i13) {
        AbstractC22676k.m65750j(FlowRow, "$this$FlowRow");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m108703t((C34384f) it.next(), c28655q, 0);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m108702s(Modifier modifier, C34383e c34383e, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m108698o(modifier, c34383e, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    private static final void m108703t(C34384f c34384f, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(63117326);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(c34384f) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3427x = AbstractC1102d.m3427x(C2314t.f9131w, null, 3);
            C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q((float) 0.5d, 8, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3427x);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M53376q);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            m108705v(c34384f, c28655q, i14 & 14);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34381c(c34384f, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m108704u(C34384f c34384f, int i13, Composer composer, int i14) {
        m108703t(c34384f, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    private static final void m108705v(C34384f c34384f, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1824834904);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87153g(c34384f) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            String strM21274h = AbstractC8693b.m21274h(c34384f.getValue(), c28655q2, 0);
            C38072d c38072d = C38072d.f163053a;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(strM21274h, null, c34384f.getValueColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN8(), null, c28655q, 0, 0, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c34384f.getLabel(), c28655q, 0), null, c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c38072d.m121952e(c28655q, 6).getB2(), null, c28655q, 0, 3120, 186362);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34381c(c34384f, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m108706w(C34384f c34384f, int i13, Composer composer, int i14) {
        m108705v(c34384f, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    private static final void m108707x(Modifier modifier, AbstractC22403o abstractC22403o, TextResource textResource, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        int i16;
        boolean z4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1040859059);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(abstractC22403o) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(textResource) ? 256 : 128;
        }
        int i18 = i15;
        if (c28655q.m87135U(i18 & 1, (i18 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            modifier2 = i17 != 0 ? c2314t : modifier2;
            float f13 = 4;
            Modifier modifierM53364e = AbstractC18489d0.m53364e(AbstractC1102d.m3425v(modifier2, 0.0f, 16 * f13, 1), (float) 1.5d, f13);
            C38072d c38072d = C38072d.f163053a;
            float f14 = 2;
            Modifier modifierM3393o = AbstractC1099a.m3393o(new C22976l1(3, f14, 5, f14), AbstractC1092a.m3358c(modifierM53364e, c38072d.m121949b(c28655q, 6).getBlack70(), AbstractC17918w0.f69621a));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(1), C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3393o);
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
            if (abstractC22403o == null) {
                c28655q.m87150e0(-1114736896);
                c28655q.m87173q(false);
                z4 = true;
                i16 = 6;
            } else {
                c28655q.m87150e0(-1114736895);
                i16 = 6;
                c28655q = c28655q;
                z4 = true;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, 0, 3), null, AbstractC1102d.m3419p(f13 * f13, c2314t), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
                c28655q.m87173q(false);
            }
            C28655q c28655q2 = c28655q;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q, (i18 >> 6) & 14), null, c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c38072d.m121952e(c28655q, i16).getN9(), null, c28655q2, 0, 3120, 186362);
            c28655q = c28655q2;
            c28655q.m87173q(z4);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier3 = modifier2;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33259e(modifier3, abstractC22403o, textResource, i13, i14, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m108708y(Modifier modifier, AbstractC22403o abstractC22403o, TextResource textResource, int i13, int i14, Composer composer, int i15) {
        m108707x(modifier, abstractC22403o, textResource, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    private static final Modifier m108709z(Modifier modifier, Object obj, Function1 function1, Composer composer, int i13) {
        if (obj == null) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-1277826850);
            c28655q.m87173q(false);
            return modifier;
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(-1278021003);
        Object objM87133R = c28655q2.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = AbstractC11266d.m30453g(c28655q2);
        }
        InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
        C1119d c1119dM43228a = AbstractC15210z4.m43228a(0L, 7, false, 0.0f);
        C18027i c18027i = new C18027i(0);
        boolean zM87157i = ((((i13 & 896) ^ 384) > 256 && c28655q2.m87153g(function1)) || (i13 & 384) == 256) | c28655q2.m87157i(obj);
        Object objM87133R2 = c28655q2.m87133R();
        if (zM87157i || objM87133R2 == c28676v0) {
            objM87133R2 = new C11439d(function1, obj, 11);
            c28655q2.m87172p0(objM87133R2);
        }
        Modifier modifierM3360e = AbstractC1092a.m3360e(modifier, interfaceC21083i, c1119dM43228a, false, c18027i, (InterfaceC4339a) objM87133R2, 12);
        c28655q2.m87173q(false);
        return modifierM3360e;
    }
}
