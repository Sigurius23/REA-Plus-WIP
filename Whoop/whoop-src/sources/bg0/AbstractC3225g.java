package bg0;

import a80.C0545i;
import a80.C0546j;
import a80.C0547k;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import aw0.C2108h;
import b72.C2783a;
import bc3.InterfaceC2994c0;
import bf0.C3189a;
import bf2.C3201a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import gb1.AbstractC15674c;
import ih0.AbstractC18489d0;
import iz0.AbstractC21048g;
import iz0.C21053l;
import iz0.C21054m;
import java.util.WeakHashMap;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27249e;
import ny0.C27256h;
import p000.AbstractC11266d;
import p000.C21061j;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p040c0.AbstractC3788w0;
import p132f0.C13821r1;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C22957g;
import p291l0.C23010x;
import p294l3.C23285v0;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p634y1.AbstractC39038k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.InterfaceC25312u;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb0.AbstractC39383f;
import zf0.C40611c;
import zf0.InterfaceC40609a;

/* JADX INFO: renamed from: bg0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a?\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a3\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a-\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u0006H\u0001¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016²\u0006\u000e\u0010\u0015\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lzf0/c$d;", "viewState", "Lf0/r1;", "scrollState", "", "isPresented", "Lkotlin/Function1;", "Lzf0/a;", "Ll83/a0;", "onEvent", "k", "(Lzf0/c$d;Lf0/r1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lzf0/c$e;", "sticky", "v", "(Lzf0/c$e;Lkotlin/jvm/functions/Function1;Lzf0/c$d;Landroidx/compose/runtime/Composer;I)V", "Lm91/u;", "item", "", "r", "(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "hasViewEventSent", "advanced-labs-join_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3225g {

    /* JADX INFO: renamed from: bg0.g$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.purchaseaddons.view.PurchaseAddOnsScreenContentKt$PurchaseAddOnsScreenContent$1$1", m100430f = "PurchaseAddOnsScreenContent.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f12600w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f12601x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C40611c.d f12602y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f12603z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, C40611c.d dVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f12601x = function1;
            this.f12602y = dVar;
            this.f12603z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f12601x, this.f12602y, this.f12603z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f12600w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!AbstractC3225g.m9301m(this.f12603z)) {
                AbstractC3225g.m9302n(this.f12603z, true);
                this.f12601x.invoke(new InterfaceC40609a.g(this.f12602y.getSource(), this.f12602y.getSelectedSegmentId()));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0219 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x021f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0291  */
    /* JADX WARN: Code duplicated, block: B:112:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:114:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:117:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:119:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:123:0x030a  */
    /* JADX WARN: Code duplicated, block: B:126:0x0326  */
    /* JADX WARN: Code duplicated, block: B:128:0x0332  */
    /* JADX WARN: Code duplicated, block: B:129:0x0334  */
    /* JADX WARN: Code duplicated, block: B:132:0x0340  */
    /* JADX WARN: Code duplicated, block: B:135:0x0345  */
    /* JADX WARN: Code duplicated, block: B:141:0x0389  */
    /* JADX WARN: Code duplicated, block: B:143:0x0396  */
    /* JADX WARN: Code duplicated, block: B:145:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:148:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:153:0x0350 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b A[PHI: r0 r6
      0x009b: PHI (r0v15 int) = (r0v11 int), (r0v9 int), (r0v17 int) binds: [B:57:0x00ad, B:51:0x0097, B:52:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r6v43 f0.r1) = (r6v4 f0.r1), (r6v2 f0.r1), (r6v2 f0.r1) binds: [B:57:0x00ad, B:51:0x0097, B:52:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00af  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00de  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:72:0x0137  */
    /* JADX WARN: Code duplicated, block: B:73:0x013b  */
    /* JADX WARN: Code duplicated, block: B:76:0x014e  */
    /* JADX WARN: Code duplicated, block: B:78:0x015c  */
    /* JADX WARN: Code duplicated, block: B:81:0x018a  */
    /* JADX WARN: Code duplicated, block: B:82:0x018e  */
    /* JADX WARN: Code duplicated, block: B:85:0x019b  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:98:0x020e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0211  */
    /* JADX INFO: renamed from: k */
    public static final void m9299k(C40611c.d viewState, C13821r1 c13821r1, boolean z4, Function1 onEvent, Composer composer, int i13, int i14) {
        C13821r1 c13821r1M92099U;
        boolean z13;
        boolean z14;
        C13821r1 c13821r2;
        boolean z15;
        C28677v1 c28677v1M87180u;
        int i15;
        C13821r1 c13821r3;
        boolean z16;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC28601c1 interfaceC28601c1;
        int i16;
        boolean z17;
        boolean zM87157i;
        Object objM87133R2;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        int i17;
        TextResource textResourceM131721f;
        int iM53357C;
        boolean z18;
        Object objM87133R3;
        C28676v0 c28676v1;
        int i18;
        int iHashCode3;
        C40611c.e eVarM131720e;
        int i19;
        boolean z19;
        boolean zM87157i2;
        Object objM87133R4;
        C28676v0 c28676v2;
        int i24;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1100492347);
        int i25 = (i13 & 6) == 0 ? (c28655q.m87157i(viewState) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            if ((i14 & 2) == 0) {
                c13821r1M92099U = c13821r1;
                int i26 = c28655q.m87153g(c13821r1M92099U) ? 32 : 16;
                i25 |= i26;
            } else {
                c13821r1M92099U = c13821r1;
            }
            i25 |= i26;
        } else {
            c13821r1M92099U = c13821r1;
        }
        int i27 = i14 & 4;
        if (i27 == 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                i25 |= c28655q.m87155h(z13) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(onEvent)) {
                    i24 = 2048;
                } else {
                    i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i25 |= i24;
            }
            if ((i25 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i25 & 1, z14)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0 || c28655q.m87118C()) {
                    if ((i14 & 2) != 0) {
                        c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                        i25 &= -113;
                    }
                    if (i27 != 0) {
                        C13821r1 c13821r4 = c13821r1M92099U;
                        i15 = i25;
                        c13821r3 = c13821r4;
                        z16 = false;
                    }
                    c28655q.m87175r();
                    Object[] objArr = new Object[0];
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = new C3201a(2);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr, (InterfaceC4339a) objM87133R, c28655q, 48);
                    boolean zM87153g = c28655q.m87153g(interfaceC28601c1);
                    i16 = i15 & 7168;
                    if (i16 == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87157i = zM87153g | z17 | c28655q.m87157i(viewState);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i || objM87133R2 == c28676v0) {
                        objM87133R2 = new a(onEvent, viewState, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, viewState);
                    c2314t = C2314t.f9131w;
                    Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
                    C22957g c22957g = AbstractC22977m.f90652c;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66724m);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i2 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                    C0209i c0209i3 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                    c28655q.m87158i0();
                    i17 = i15;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    if (viewState.getDisplayRefreshingAnimation()) {
                        textResourceM131721f = AbstractC8693b.m21278l("");
                    } else {
                        textResourceM131721f = viewState.getToolbarTitle();
                    }
                    TextResource textResource = textResourceM131721f;
                    if (z16) {
                        iM53357C = AbstractC39383f.m125595a(C38072d.f163053a);
                    } else {
                        iM53357C = AbstractC18489d0.m53357C(C38072d.f163053a);
                    }
                    AbstractC6721d.a aVar = new AbstractC6721d.a(textResource, null, Integer.valueOf(iM53357C), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                    float f13 = 8;
                    Modifier modifierM3394p = AbstractC1099a.m3394p(1 * f13, c2314t);
                    if (i16 == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z18 || objM87133R3 == c28676v0) {
                        objM87133R3 = new C3189a(onEvent, 3);
                        c28655q.m87172p0(objM87133R3);
                    }
                    c28676v1 = c28676v0;
                    i18 = i16;
                    AbstractC6719b.m20143d(modifierM3394p, aVar, null, (InterfaceC4339a) objM87133R3, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                    AbstractC1090b.m3351f(viewState.getDisplayRefreshingAnimation(), null, AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3), "Loading Animation", C3220b.f12592a.m9264c(), c28655q, 224640, 2);
                    c28655q.m87173q(true);
                    Modifier modifierM44089m = AbstractC15674c.m44089m(c2314t, 0.0f, 1, null);
                    float f14 = 2 * f13;
                    Modifier modifierM3396r = AbstractC1099a.m3396r(modifierM44089m, f14, 0.0f, 2);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM92116f0 = AbstractC30060g.m92116f0(modifierM3396r.mo3471e(new LayoutWeightElement(1.0f, true)), c13821r3, 14);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, C2299e.f9111N, c28655q, 48);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
                    c28655q.m87150e0(-234578908);
                    for (C40611c.a aVar2 : viewState.m131717b()) {
                        c28655q.m87150e0(-234577171);
                        for (InterfaceC25312u interfaceC25312u : aVar2.m131700a()) {
                            i19 = i18;
                            if (i19 == 2048) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            zM87157i2 = c28655q.m87157i(interfaceC25312u) | z19;
                            objM87133R4 = c28655q.m87133R();
                            if (zM87157i2) {
                                c28676v2 = c28676v1;
                            } else {
                                c28676v2 = c28676v1;
                                if (objM87133R4 == c28676v2) {
                                }
                                m9306r(interfaceC25312u, (Function1) objM87133R4, c28655q, 0, 0);
                                float f15 = 4;
                                AbstractC11266d.m30469w(f15, f15, c2314t, c28655q);
                                c28676v1 = c28676v2;
                                i18 = i19;
                            }
                            objM87133R4 = new C0546j(onEvent, interfaceC25312u, 2);
                            c28655q.m87172p0(objM87133R4);
                            m9306r(interfaceC25312u, (Function1) objM87133R4, c28655q, 0, 0);
                            float f16 = 4;
                            AbstractC11266d.m30469w(f16, f16, c2314t, c28655q);
                            c28676v1 = c28676v2;
                            i18 = i19;
                        }
                        c28655q.m87173q(false);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(aVar2.getSectionType().getSpacing(), c2314t));
                    }
                    AbstractC18489d0.m53356B(c28655q, false, c2314t, f14, c28655q);
                    c28655q.m87173q(true);
                    eVarM131720e = viewState.getSticky();
                    if (eVarM131720e == null) {
                        c28655q.m87150e0(1351354456);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1351354457);
                        m9310v(eVarM131720e, onEvent, viewState, c28655q, ((i17 >> 6) & 112) | ((i17 << 6) & 896));
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c13821r2 = c13821r3;
                    z15 = z16;
                } else {
                    c28655q.m87138X();
                    if ((i14 & 2) != 0) {
                        i25 &= -113;
                    }
                }
                C13821r1 c13821r5 = c13821r1M92099U;
                i15 = i25;
                c13821r3 = c13821r5;
                z16 = z13;
                c28655q.m87175r();
                Object[] objArr2 = new Object[0];
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = new C3201a(2);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr2, (InterfaceC4339a) objM87133R, c28655q, 48);
                boolean zM87153g2 = c28655q.m87153g(interfaceC28601c1);
                i16 = i15 & 7168;
                if (i16 == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87157i = zM87153g2 | z17 | c28655q.m87157i(viewState);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R2 = new a(onEvent, viewState, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(onEvent, viewState, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, viewState);
                c2314t = C2314t.f9131w;
                Modifier modifierM66724m2 = AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
                C22957g c22957g2 = AbstractC22977m.f90652c;
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g2, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM66724m2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i5 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a3);
                C0209i c0209i6 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                c28655q.m87158i0();
                i17 = i15;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N5);
                if (viewState.getDisplayRefreshingAnimation()) {
                    textResourceM131721f = AbstractC8693b.m21278l("");
                } else {
                    textResourceM131721f = viewState.getToolbarTitle();
                }
                TextResource textResource2 = textResourceM131721f;
                if (z16) {
                    iM53357C = AbstractC39383f.m125595a(C38072d.f163053a);
                } else {
                    iM53357C = AbstractC18489d0.m53357C(C38072d.f163053a);
                }
                AbstractC6721d.a aVar3 = new AbstractC6721d.a(textResource2, null, Integer.valueOf(iM53357C), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                float f17 = 8;
                Modifier modifierM3394p2 = AbstractC1099a.m3394p(1 * f17, c2314t);
                if (i16 == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z18) {
                    objM87133R3 = new C3189a(onEvent, 3);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C3189a(onEvent, 3);
                    c28655q.m87172p0(objM87133R3);
                }
                c28676v1 = c28676v0;
                i18 = i16;
                AbstractC6719b.m20143d(modifierM3394p2, aVar3, null, (InterfaceC4339a) objM87133R3, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                AbstractC1090b.m3351f(viewState.getDisplayRefreshingAnimation(), null, AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3), "Loading Animation", C3220b.f12592a.m9264c(), c28655q, 224640, 2);
                c28655q.m87173q(true);
                Modifier modifierM44089m2 = AbstractC15674c.m44089m(c2314t, 0.0f, 1, null);
                float f18 = 2 * f17;
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(modifierM44089m2, f18, 0.0f, 2);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM92116f1 = AbstractC30060g.m92116f0(modifierM3396r2.mo3471e(new LayoutWeightElement(1.0f, true)), c13821r3, 14);
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, C2299e.f9111N, c28655q, 48);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM92116f1);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N6);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f18, c2314t));
                c28655q.m87150e0(-234578908);
                while (r1.hasNext()) {
                    c28655q.m87150e0(-234577171);
                    while (r3.hasNext()) {
                        i19 = i18;
                        if (i19 == 2048) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zM87157i2 = c28655q.m87157i(interfaceC25312u) | z19;
                        objM87133R4 = c28655q.m87133R();
                        if (zM87157i2) {
                            c28676v2 = c28676v1;
                            if (objM87133R4 == c28676v2) {
                            }
                            m9306r(interfaceC25312u, (Function1) objM87133R4, c28655q, 0, 0);
                            float f19 = 4;
                            AbstractC11266d.m30469w(f19, f19, c2314t, c28655q);
                            c28676v1 = c28676v2;
                            i18 = i19;
                        } else {
                            c28676v2 = c28676v1;
                        }
                        objM87133R4 = new C0546j(onEvent, interfaceC25312u, 2);
                        c28655q.m87172p0(objM87133R4);
                        m9306r(interfaceC25312u, (Function1) objM87133R4, c28655q, 0, 0);
                        float f110 = 4;
                        AbstractC11266d.m30469w(f110, f110, c2314t, c28655q);
                        c28676v1 = c28676v2;
                        i18 = i19;
                    }
                    c28655q.m87173q(false);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(aVar2.getSectionType().getSpacing(), c2314t));
                }
                AbstractC18489d0.m53356B(c28655q, false, c2314t, f18, c28655q);
                c28655q.m87173q(true);
                eVarM131720e = viewState.getSticky();
                if (eVarM131720e == null) {
                    c28655q.m87150e0(1351354456);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1351354457);
                    m9310v(eVarM131720e, onEvent, viewState, c28655q, ((i17 >> 6) & 112) | ((i17 << 6) & 896));
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c13821r2 = c13821r3;
                z15 = z16;
            } else {
                c28655q.m87138X();
                c13821r2 = c13821r1M92099U;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2108h(viewState, c13821r2, z15, onEvent, i13, i14, 1);
            }
        }
        i25 |= 384;
        z13 = z4;
        if ((i13 & 3072) == 0) {
            if (c28655q.m87157i(onEvent)) {
                i24 = 2048;
            } else {
                i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i25 |= i24;
        }
        if ((i25 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i25 & 1, z14)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                if ((i14 & 2) != 0) {
                    c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                    i25 &= -113;
                }
                if (i27 != 0) {
                    C13821r1 c13821r6 = c13821r1M92099U;
                    i15 = i25;
                    c13821r3 = c13821r6;
                    z16 = false;
                } else {
                    C13821r1 c13821r7 = c13821r1M92099U;
                    i15 = i25;
                    c13821r3 = c13821r7;
                    z16 = z13;
                }
            } else {
                if ((i14 & 2) != 0) {
                    c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                    i25 &= -113;
                }
                if (i27 != 0) {
                    C13821r1 c13821r8 = c13821r1M92099U;
                    i15 = i25;
                    c13821r3 = c13821r8;
                    z16 = false;
                } else {
                    C13821r1 c13821r9 = c13821r1M92099U;
                    i15 = i25;
                    c13821r3 = c13821r9;
                    z16 = z13;
                }
            }
            c28655q.m87175r();
            Object[] objArr3 = new Object[0];
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C3201a(2);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr3, (InterfaceC4339a) objM87133R, c28655q, 48);
            boolean zM87153g3 = c28655q.m87153g(interfaceC28601c1);
            i16 = i15 & 7168;
            if (i16 == 2048) {
                z17 = true;
            } else {
                z17 = false;
            }
            zM87157i = zM87153g3 | z17 | c28655q.m87157i(viewState);
            objM87133R2 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R2 = new a(onEvent, viewState, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new a(onEvent, viewState, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, viewState);
            c2314t = C2314t.f9131w;
            Modifier modifierM66724m3 = AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
            C22957g c22957g3 = AbstractC22977m.f90652c;
            C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g3, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM66724m3);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i8 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a5);
            C0209i c0209i9 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m7);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i10 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N7);
            Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
            c28655q.m87158i0();
            i17 = i15;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC39127r0M66763d3);
            AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m8);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N8);
            if (viewState.getDisplayRefreshingAnimation()) {
                textResourceM131721f = AbstractC8693b.m21278l("");
            } else {
                textResourceM131721f = viewState.getToolbarTitle();
            }
            TextResource textResource3 = textResourceM131721f;
            if (z16) {
                iM53357C = AbstractC39383f.m125595a(C38072d.f163053a);
            } else {
                iM53357C = AbstractC18489d0.m53357C(C38072d.f163053a);
            }
            AbstractC6721d.a aVar4 = new AbstractC6721d.a(textResource3, null, Integer.valueOf(iM53357C), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
            float f111 = 8;
            Modifier modifierM3394p3 = AbstractC1099a.m3394p(1 * f111, c2314t);
            if (i16 == 2048) {
                z18 = true;
            } else {
                z18 = false;
            }
            objM87133R3 = c28655q.m87133R();
            if (z18) {
                objM87133R3 = new C3189a(onEvent, 3);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C3189a(onEvent, 3);
                c28655q.m87172p0(objM87133R3);
            }
            c28676v1 = c28676v0;
            i18 = i16;
            AbstractC6719b.m20143d(modifierM3394p3, aVar4, null, (InterfaceC4339a) objM87133R3, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            AbstractC1090b.m3351f(viewState.getDisplayRefreshingAnimation(), null, AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3), "Loading Animation", C3220b.f12592a.m9264c(), c28655q, 224640, 2);
            c28655q.m87173q(true);
            Modifier modifierM44089m3 = AbstractC15674c.m44089m(c2314t, 0.0f, 1, null);
            float f112 = 2 * f111;
            Modifier modifierM3396r3 = AbstractC1099a.m3396r(modifierM44089m3, f112, 0.0f, 2);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM92116f2 = AbstractC30060g.m92116f0(modifierM3396r3.mo3471e(new LayoutWeightElement(1.0f, true)), c13821r3, 14);
            C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g3, C2299e.f9111N, c28655q, 48);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM92116f2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a6);
            AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m9);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N9);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f112, c2314t));
            c28655q.m87150e0(-234578908);
            while (r1.hasNext()) {
                c28655q.m87150e0(-234577171);
                while (r3.hasNext()) {
                    i19 = i18;
                    if (i19 == 2048) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zM87157i2 = c28655q.m87157i(interfaceC25312u) | z19;
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i2) {
                        c28676v2 = c28676v1;
                        if (objM87133R4 == c28676v2) {
                        }
                        m9306r(interfaceC25312u, (Function1) objM87133R4, c28655q, 0, 0);
                        float f113 = 4;
                        AbstractC11266d.m30469w(f113, f113, c2314t, c28655q);
                        c28676v1 = c28676v2;
                        i18 = i19;
                    } else {
                        c28676v2 = c28676v1;
                    }
                    objM87133R4 = new C0546j(onEvent, interfaceC25312u, 2);
                    c28655q.m87172p0(objM87133R4);
                    m9306r(interfaceC25312u, (Function1) objM87133R4, c28655q, 0, 0);
                    float f114 = 4;
                    AbstractC11266d.m30469w(f114, f114, c2314t, c28655q);
                    c28676v1 = c28676v2;
                    i18 = i19;
                }
                c28655q.m87173q(false);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(aVar2.getSectionType().getSpacing(), c2314t));
            }
            AbstractC18489d0.m53356B(c28655q, false, c2314t, f112, c28655q);
            c28655q.m87173q(true);
            eVarM131720e = viewState.getSticky();
            if (eVarM131720e == null) {
                c28655q.m87150e0(1351354456);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1351354457);
                m9310v(eVarM131720e, onEvent, viewState, c28655q, ((i17 >> 6) & 112) | ((i17 << 6) & 896));
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c13821r2 = c13821r3;
            z15 = z16;
        } else {
            c28655q.m87138X();
            c13821r2 = c13821r1M92099U;
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2108h(viewState, c13821r2, z15, onEvent, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final InterfaceC28601c1 m9300l() {
        return AbstractC28683x.m87272z(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final boolean m9301m(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final void m9302n(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m9303o(Function1 function1) {
        function1.invoke(InterfaceC40609a.d.f174975a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m9304p(Function1 function1, InterfaceC25312u interfaceC25312u, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC40609a.e(it, interfaceC25312u));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m9305q(C40611c.d dVar, C13821r1 c13821r1, boolean z4, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m9299k(dVar, c13821r1, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    public static final void m9306r(InterfaceC25312u item, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        Function1 function3;
        AbstractC22676k.m65750j(item, "item");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-480553335);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(item) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C2783a(13);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C2783a(14);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC25303l.m74291r(item, p720m91.Function1.m74306g((Function1) objM87133R2), null, function3, c28655q, (i15 & 14) | (C25307p.f99300b << 3) | ((i15 << 6) & 7168), 4);
            function2 = function3;
        } else {
            c28655q.m87138X();
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0547k(item, function2, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m9307s(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m9308t(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m9309u(InterfaceC25312u interfaceC25312u, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m9306r(interfaceC25312u, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: v */
    private static final void m9310v(C40611c.e eVar, Function1 function1, C40611c.d dVar, Composer composer, int i13) {
        C40611c.e eVar2;
        int i14;
        boolean z4;
        C2314t c2314t;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-861626862);
        if ((i13 & 6) == 0) {
            eVar2 = eVar;
            i14 = i13 | (c28655q.m87157i(eVar2) ? 4 : 2);
        } else {
            eVar2 = eVar;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t2 = C2314t.f9131w;
            float f13 = 8;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), ((float) 2.5d) * f13, 0.0f, 2);
            WeakHashMap weakHashMap = C22944c2.f90553v;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3398t(modifierM3396r, 0.0f, 0.0f, 0.0f, AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a(), 7), 0.0f, 1 * f13, 0.0f, 3 * f13, 5);
            C23010x c23010xM73381n = AbstractC25012a.m73381n(2, f13, C2299e.f9111N, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM73381n);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            String strM131723b = eVar2.getText();
            if (strM131723b == null) {
                c28655q.m87150e0(1140094102);
                c28655q.m87173q(false);
                c2314t = c2314t2;
                z4 = false;
            } else {
                c28655q.m87150e0(1140094103);
                String strM21275i = AbstractC8693b.m21275i(strM131723b, c28655q, 0);
                C21053l c21053l = C21053l.f79834a;
                C38072d c38072d = C38072d.f163053a;
                int i16 = C38072d.f163054b;
                z4 = false;
                c2314t = c2314t2;
                AbstractC21048g.m58807M(strM21275i, null, true, c21053l.m58880a(C23285v0.m67364b(AbstractC18489d0.m53377r(c38072d, c28655q, i16), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), c38072d.m121949b(c28655q, i16).getWhite70(), 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q, 0, C21053l.f79835b << 15, 32764), null, 0, 0, 0, false, c28655q, (C21054m.f79836p << 9) | 384, 498);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87150e0(2114999569);
            for (InterfaceC25312u interfaceC25312u : eVar.m131722a()) {
                boolean z13 = interfaceC25312u instanceof C27256h;
                C28676v0 c28676v0 = C28635l.f115821a;
                if (z13) {
                    c28655q.m87150e0(2075676798);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    C27256h c27256h = (C27256h) interfaceC25312u;
                    boolean zM87157i = c28655q.m87157i(interfaceC25312u) | ((i15 & 112) == 32 ? true : z4);
                    Object objM87133R = c28655q.m87133R();
                    if (zM87157i || objM87133R == c28676v0) {
                        objM87133R = new C0545i(function1, c27256h, 1);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC27249e.m82121d(modifierM3409f, c27256h, null, (InterfaceC4339a) objM87133R, c28655q, 6, 4);
                    c28655q.m87173q(z4);
                } else {
                    c28655q.m87150e0(2076010637);
                    boolean zM87157i2 = c28655q.m87157i(interfaceC25312u) | ((i15 & 112) == 32 ? true : z4);
                    Object objM87133R2 = c28655q.m87133R();
                    if (zM87157i2 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C0546j(function1, interfaceC25312u, 3);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC25303l.m74291r(interfaceC25312u, null, null, (Function1) objM87133R2, c28655q, 0, 6);
                    c28655q.m87173q(z4);
                }
            }
            c28655q.m87173q(z4);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21061j(eVar, function1, dVar, i13, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m9311w(Function1 function1, InterfaceC25312u interfaceC25312u) {
        function1.invoke(new InterfaceC40609a.e(interfaceC25312u, interfaceC25312u));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m9312x(Function1 function1, InterfaceC25312u interfaceC25312u, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC40609a.e(it, interfaceC25312u));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m9313y(C40611c.e eVar, Function1 function1, C40611c.d dVar, int i13, Composer composer, int i14) {
        m9310v(eVar, function1, dVar, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
