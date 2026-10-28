package p710im1;

import a11.C0140r;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bc3.InterfaceC2994c0;
import c03.C3815c;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import dp0.AbstractC12248d;
import em1.C13348v;
import ep0.C13404j;
import fm1.C14597a;
import fm1.C14599c;
import fm1.C14600d;
import fm1.C14602f;
import fm1.EnumC14603g;
import gb1.AbstractC15689q;
import gt2.AbstractC16204b;
import h01.C16544k;
import h01.C16554u;
import ht2.C17634f;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p077d0.C11328a;
import p132f0.C13821r1;
import p163g1.C15176w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import wm1.AbstractC37389k;
import wm1.C37390l;

/* JADX INFO: renamed from: im1.j0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a«\u0001\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u00112\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u0011H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001aU\u0010 \u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u0011H\u0003¢\u0006\u0004\b \u0010!\u001as\u0010#\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00042\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00112\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u0011H\u0003¢\u0006\u0004\b#\u0010$\u001aE\u0010'\u001a\u00020\r2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u00042\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u0011H\u0003¢\u0006\u0004\b'\u0010(¨\u0006)"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lf0/r1;", "scrollState", "", "isScrolling", "Lem1/v;", "homeViewState", "Lc03/c;", "statusViewState", "Lep0/j;", "screenContext", "Lkotlin/Function0;", "Ll83/a0;", "onErrorRetry", "Lim1/d0;", "itemViewEventHelper", "Lkotlin/Function1;", "", "onWhoopStatusClick", "onBottomOfPillarHit", "", "onDeepDiveClicked", "onWeeklyPlanExpandedStateChanged", "r", "(Landroidx/compose/ui/Modifier;Lf0/r1;ZLem1/v;Lc03/c;Lep0/j;Lc93/a;Lim1/d0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Lm91/u;", "headerState", "Lfm1/f;", "pillarContent", "Lfm1/d;", "homeMetaData", "p", "(Lm91/u;Lfm1/f;Lf0/r1;ZLim1/d0;Lfm1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "isWeeklyPlanTileExpanded", "v", "(Lfm1/f;Lf0/r1;Lep0/j;Lim1/d0;Lfm1/d;Lc03/c;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lfm1/a;", "componentItem", "k", "(Lfm1/a;Lim1/d0;Lfm1/d;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18677j0 {

    /* JADX INFO: renamed from: im1.j0$a */
    @InterfaceC32271e(m100429c = "com.whoop.home.view.HomeOverviewScreenKt$ComponentItem$2$1", m100430f = "HomeOverviewScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f73282w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C18665d0 f73283x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC25312u f73284y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C18665d0 c18665d0, InterfaceC25312u interfaceC25312u, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f73283x = c18665d0;
            this.f73284y = interfaceC25312u;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f73283x, this.f73284y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f73282w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f73283x.m54173t(this.f73284y);
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0071  */
    /* JADX WARN: Code duplicated, block: B:48:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x007d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0083  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    private static final void m54224k(final C14597a c14597a, final C18665d0 c18665d0, final C14600d c14600d, boolean z4, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z13;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        InterfaceC25312u interfaceC25312uM41765b;
        C17634f c17634f;
        InterfaceC25312u interfaceC25312uM41765b2;
        boolean zM87157i;
        Object objM87133R;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1640374736);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(c14597a) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(c18665d0) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(c14600d) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87155h(z4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i16 = i14 & 16;
        if (i16 == 0) {
            if ((i13 & 24576) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((i15 & 9363) != 9362) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C16554u(23);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                interfaceC25312uM41765b = c14597a.getItemViewState();
                if (interfaceC25312uM41765b instanceof C17634f) {
                    c17634f = (C17634f) interfaceC25312uM41765b;
                } else {
                    c17634f = null;
                }
                if (c17634f != null || (interfaceC25312uM41765b2 = C17634f.m50246b(c17634f, null, z4, 1, null)) == null) {
                    interfaceC25312uM41765b2 = c14597a.getItemViewState();
                }
                zM87157i = c28655q.m87157i(c18665d0) | c28655q.m87157i(interfaceC25312uM41765b2);
                objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new a(c18665d0, interfaceC25312uM41765b2, null);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
                final Function1 function5 = function4;
                final InterfaceC25312u interfaceC25312u = interfaceC25312uM41765b2;
                AbstractC28683x.m87247a(AbstractC25303l.m74272C().mo86977a(AbstractC18667e0.m54175b()), AbstractC37817c.m121344e(-1128159984, c28655q, new InterfaceC4351m() { // from class: im1.i0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC18677j0.m54226m(interfaceC25312u, function5, c18665d0, c14597a, c14600d, (Composer) obj, iIntValue);
                    }
                }), c28655q, 56);
                function3 = function5;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C16544k(c14597a, c18665d0, c14600d, function3, z4, i13, i14, 1);
            }
        }
        i15 |= 24576;
        function2 = function1;
        if ((i15 & 9363) != 9362) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C16554u(23);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            interfaceC25312uM41765b = c14597a.getItemViewState();
            if (interfaceC25312uM41765b instanceof C17634f) {
                c17634f = (C17634f) interfaceC25312uM41765b;
            } else {
                c17634f = null;
            }
            if (c17634f != null) {
                interfaceC25312uM41765b2 = c14597a.getItemViewState();
            } else {
                interfaceC25312uM41765b2 = c14597a.getItemViewState();
            }
            zM87157i = c28655q.m87157i(c18665d0) | c28655q.m87157i(interfaceC25312uM41765b2);
            objM87133R = c28655q.m87133R();
            if (zM87157i) {
                objM87133R = new a(c18665d0, interfaceC25312uM41765b2, null);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new a(c18665d0, interfaceC25312uM41765b2, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
            final Function1 function6 = function4;
            final InterfaceC25312u interfaceC25312u2 = interfaceC25312uM41765b2;
            AbstractC28683x.m87247a(AbstractC25303l.m74272C().mo86977a(AbstractC18667e0.m54175b()), AbstractC37817c.m121344e(-1128159984, c28655q, new InterfaceC4351m() { // from class: im1.i0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC18677j0.m54226m(interfaceC25312u2, function6, c18665d0, c14597a, c14600d, (Composer) obj, iIntValue);
                }
            }), c28655q, 56);
            function3 = function6;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16544k(c14597a, c18665d0, c14600d, function3, z4, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m54225l(boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m54226m(InterfaceC25312u interfaceC25312u, Function1 function1, C18665d0 c18665d0, C14597a c14597a, C14600d c14600d, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C25307p c25307pM54175b = AbstractC18667e0.m54175b();
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(c18665d0) | c28655q.m87157i(c14597a) | c28655q.m87157i(c14600d);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C11328a(function1, c18665d0, c14597a, c14600d);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(interfaceC25312u, c25307pM54175b, null, (Function1) objM87133R, c28655q, C25307p.f99300b << 3, 4);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m54227n(Function1 function1, C18665d0 c18665d0, C14597a c14597a, C14600d c14600d, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof AbstractC16204b.a) {
            function1.invoke(Boolean.valueOf(((AbstractC16204b.a) it).getValue()));
        } else {
            c18665d0.m54172j(c14597a.getItemViewState(), c14600d, it);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m54228o(C14597a c14597a, C18665d0 c18665d0, C14600d c14600d, boolean z4, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m54224k(c14597a, c18665d0, c14600d, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX INFO: renamed from: p */
    private static final void m54229p(final InterfaceC25312u interfaceC25312u, final C14602f c14602f, final C13821r1 c13821r1, final boolean z4, final C18665d0 c18665d0, final C14600d c14600d, final Function1 function1, Composer composer, final int i13) {
        C28655q c28655q;
        boolean z13;
        boolean z14;
        int i14;
        C28655q c28655q2;
        ?? r10;
        boolean z15;
        C28655q c28655q3;
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(-1759393812);
        int i15 = (i13 & 6) == 0 ? (c28655q4.m87157i(interfaceC25312u) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i15 |= c28655q4.m87157i(c14602f) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q4.m87153g(c13821r1) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q4.m87155h(z4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q4.m87157i(c18665d0) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q4.m87157i(c14600d) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i15 |= c28655q4.m87157i(function1) ? 1048576 : 524288;
        }
        if (c28655q4.m87135U(i15 & 1, (599187 & i15) != 599186)) {
            boolean z16 = interfaceC25312u instanceof C37390l;
            C37390l c37390l = z16 ? (C37390l) interfaceC25312u : null;
            List<InterfaceC25312u> listM119739b = c37390l != null ? c37390l.m119739b() : null;
            boolean z17 = listM119739b == null || listM119739b.isEmpty();
            List<C14597a> listM41787a = c14602f.m41787a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM41787a) {
                if (((C14597a) obj).getItemViewState() instanceof C0140r) {
                    arrayList.add(obj);
                }
            }
            boolean zIsEmpty = arrayList.isEmpty();
            if (z17) {
                z13 = false;
                c28655q4.m87150e0(1680642518);
                c28655q4.m87173q(false);
            } else {
                c28655q4.m87150e0(1680387853);
                AbstractC22676k.m65748h(interfaceC25312u, "null cannot be cast to non-null type com.whoop.home.view.scoregaugesticky.ScoreGaugeStickyState");
                int i16 = i15 >> 6;
                z13 = false;
                AbstractC18661c.m54134g(((C37390l) interfaceC25312u).m119739b(), c13821r1, c18665d0, c14600d, c28655q4, ((i15 >> 3) & 112) | (i16 & 896) | (i16 & 7168));
                c28655q4.m87173q(false);
            }
            if (zIsEmpty) {
                z14 = z13;
                i14 = 1;
                c28655q4.m87150e0(1680952022);
                c28655q4.m87173q(z14);
            } else {
                c28655q4.m87150e0(1680682942);
                int i17 = i15 >> 6;
                int i18 = ((i15 >> 3) & 14) | (i17 & 112) | (i17 & 896) | (i17 & 7168);
                i14 = 1;
                z15 = z13;
                AbstractC18658b.m54121f(c14602f, z4, c18665d0, c14600d, z17, c28655q4, i18, 0);
                c28655q3.m87173q(z15);
            }
            if (z16) {
                r10 = z14;
                c28655q2 = c28655q4;
                c28655q3 = c28655q4;
                r10 = z15;
                c28655q2 = c28655q3;
                c28655q2.m87150e0(1681006768);
                AbstractC37389k.m119703K(AbstractC30060g.m92116f0(C2314t.f9131w, AbstractC30060g.m92099U(r10, c28655q2, i14), 14), (C37390l) interfaceC25312u, c13821r1, function1, c28655q2, ((i15 << 3) & 112) | (i15 & 896) | ((i15 >> 9) & 7168), 0);
                c28655q2.m87173q(r10);
                c28655q = c28655q2;
            } else {
                r10 = z14;
                c28655q2 = c28655q4;
                c28655q3 = c28655q4;
                r10 = z15;
                c28655q2 = c28655q3;
                c28655q2.m87150e0(1681227798);
                c28655q2.m87173q(r10);
                c28655q = c28655q2;
            }
        } else {
            c28655q4.m87138X();
            c28655q = c28655q4;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: im1.h0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return AbstractC18677j0.m54230q(interfaceC25312u, c14602f, c13821r1, z4, c18665d0, c14600d, function1, i13, (Composer) obj2, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m54230q(InterfaceC25312u interfaceC25312u, C14602f c14602f, C13821r1 c13821r1, boolean z4, C18665d0 c18665d0, C14600d c14600d, Function1 function1, int i13, Composer composer, int i14) {
        m54229p(interfaceC25312u, c14602f, c13821r1, z4, c18665d0, c14600d, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x016b  */
    /* JADX WARN: Code duplicated, block: B:110:0x0174 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0176  */
    /* JADX WARN: Code duplicated, block: B:114:0x017d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0183  */
    /* JADX WARN: Code duplicated, block: B:118:0x0192  */
    /* JADX WARN: Code duplicated, block: B:121:0x019c  */
    /* JADX WARN: Code duplicated, block: B:122:0x019e  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:129:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:130:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:135:0x0209  */
    /* JADX WARN: Code duplicated, block: B:141:0x0246  */
    /* JADX WARN: Code duplicated, block: B:143:0x0249  */
    /* JADX WARN: Code duplicated, block: B:144:0x0258  */
    /* JADX WARN: Code duplicated, block: B:147:0x02da  */
    /* JADX WARN: Code duplicated, block: B:150:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: r */
    public static final void m54231r(Modifier modifier, final C13821r1 scrollState, final boolean z4, final C13348v homeViewState, final C3815c statusViewState, final C13404j c13404j, final InterfaceC4339a onErrorRetry, final C18665d0 itemViewEventHelper, final Function1 onWhoopStatusClick, final Function1 onBottomOfPillarHit, final Function1 onDeepDiveClicked, Function1 function1, Composer composer, final int i13, final int i14, final int i15) {
        Modifier modifier2;
        int i16;
        int i17;
        boolean z13;
        C28655q c28655q;
        final Function1 function2;
        final Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function3;
        boolean z14;
        Object objM87133R;
        int i18;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i19;
        int i24;
        C14599c c14599cM37585l;
        C14602f c14602f;
        Function1 function4;
        boolean z15;
        List<C14602f> listM41769b;
        Object objM87133R2;
        AbstractC22676k.m65750j(scrollState, "scrollState");
        AbstractC22676k.m65750j(homeViewState, "homeViewState");
        AbstractC22676k.m65750j(statusViewState, "statusViewState");
        AbstractC22676k.m65750j(onErrorRetry, "onErrorRetry");
        AbstractC22676k.m65750j(itemViewEventHelper, "itemViewEventHelper");
        AbstractC22676k.m65750j(onWhoopStatusClick, "onWhoopStatusClick");
        AbstractC22676k.m65750j(onBottomOfPillarHit, "onBottomOfPillarHit");
        AbstractC22676k.m65750j(onDeepDiveClicked, "onDeepDiveClicked");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(809620492);
        int i25 = i15 & 1;
        if (i25 != 0) {
            i16 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i16 = i13 | (c28655q2.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= c28655q2.m87153g(scrollState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i16 |= c28655q2.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i16 |= c28655q2.m87157i(homeViewState) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i16 |= (32768 & i13) == 0 ? c28655q2.m87153g(statusViewState) : c28655q2.m87157i(statusViewState) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i16 |= (262144 & i13) == 0 ? c28655q2.m87153g(c13404j) : c28655q2.m87157i(c13404j) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i16 |= c28655q2.m87157i(onErrorRetry) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i16 |= c28655q2.m87157i(itemViewEventHelper) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i16 |= c28655q2.m87157i(onWhoopStatusClick) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((805306368 & i13) == 0) {
            i16 |= c28655q2.m87157i(onBottomOfPillarHit) ? 536870912 : 268435456;
        }
        if ((i14 & 6) == 0) {
            i17 = i14 | (c28655q2.m87157i(onDeepDiveClicked) ? 4 : 2);
        } else {
            i17 = i14;
        }
        int i26 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        if (i26 == 0) {
            if ((i14 & 48) == 0) {
                i17 |= c28655q2.m87157i(function1) ? 32 : 16;
            }
            if ((i16 & 306783379) == 306783378 || (i17 & 19) != 18) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i16 & 1, z13)) {
                if (i25 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C16554u(21);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function3 = (Function1) objM87133R2;
                } else {
                    function3 = function1;
                }
                if ((i16 & 1879048192) == 536870912) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R = c28655q2.m87133R();
                if (z14 || objM87133R == c28676v0) {
                    objM87133R = new C18674i(onBottomOfPillarHit, 1);
                    c28655q2.m87172p0(objM87133R);
                }
                i18 = i16 >> 3;
                AbstractC15689q.m44138f(scrollState, (InterfaceC4339a) objM87133R, c28655q2, i18 & 14);
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, modifier2);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3407d);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                i19 = i16 >> 9;
                i24 = C3815c.f15649d;
                c28655q = c28655q2;
                AbstractC18682m.m54248k(homeViewState, onErrorRetry, onWhoopStatusClick, statusViewState, c28655q, (i19 & 14) | ((i16 >> 15) & 112) | ((i16 >> 18) & 896) | (i24 << 9) | (i18 & 7168));
                c14599cM37585l = homeViewState.getHomeFeed();
                if (c14599cM37585l != null || (listM41769b = c14599cM37585l.m41769b()) == null) {
                    c14602f = null;
                } else {
                    c14602f = (C14602f) AbstractC25265s.m74100H0(listM41769b);
                }
                if (c14602f == null) {
                    c28655q.m87150e0(-427905944);
                    c28655q.m87173q(false);
                    function4 = function3;
                    z15 = true;
                } else {
                    c28655q.m87150e0(-427905943);
                    int i27 = i16 << 3;
                    m54229p(homeViewState.getHeaderState(), c14602f, scrollState, z4, itemViewEventHelper, homeViewState.getHomeFeed().getHomeMetaData(), onDeepDiveClicked, c28655q, ((i17 << 18) & 3670016) | (i27 & 8064) | (57344 & i19));
                    function4 = function3;
                    z15 = true;
                    m54235v(c14602f, scrollState, c13404j, itemViewEventHelper, homeViewState.getHomeFeed().getHomeMetaData(), statusViewState, homeViewState.getIsWeeklyPlanTileExpanded(), onWhoopStatusClick, function4, c28655q, (i16 & 112) | (C13404j.f46947x << 6) | (i19 & 896) | ((i16 >> 12) & 7168) | (i24 << 15) | (i27 & 458752) | (i18 & 29360128) | ((i17 << 21) & 234881024), 0);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z15);
                function2 = function4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function2 = function1;
            }
            modifier3 = modifier2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: im1.g0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC18677j0.m54234u(modifier3, scrollState, z4, homeViewState, statusViewState, c13404j, onErrorRetry, itemViewEventHelper, onWhoopStatusClick, onBottomOfPillarHit, onDeepDiveClicked, function2, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i17 |= 48;
        if ((i16 & 306783379) == 306783378) {
            z13 = true;
        } else {
            z13 = true;
        }
        if (c28655q2.m87135U(i16 & 1, z13)) {
            if (i25 != 0) {
                modifier2 = C2314t.f9131w;
            }
            c28676v0 = C28635l.f115821a;
            if (i26 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C16554u(21);
                    c28655q2.m87172p0(objM87133R2);
                }
                function3 = (Function1) objM87133R2;
            } else {
                function3 = function1;
            }
            if ((i16 & 1879048192) == 536870912) {
                z14 = true;
            } else {
                z14 = false;
            }
            objM87133R = c28655q2.m87133R();
            if (z14) {
                objM87133R = new C18674i(onBottomOfPillarHit, 1);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C18674i(onBottomOfPillarHit, 1);
                c28655q2.m87172p0(objM87133R);
            }
            i18 = i16 >> 3;
            AbstractC15689q.m44138f(scrollState, (InterfaceC4339a) objM87133R, c28655q2, i18 & 14);
            Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, modifier2);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3407d2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
            i19 = i16 >> 9;
            i24 = C3815c.f15649d;
            c28655q = c28655q2;
            AbstractC18682m.m54248k(homeViewState, onErrorRetry, onWhoopStatusClick, statusViewState, c28655q, (i19 & 14) | ((i16 >> 15) & 112) | ((i16 >> 18) & 896) | (i24 << 9) | (i18 & 7168));
            c14599cM37585l = homeViewState.getHomeFeed();
            if (c14599cM37585l != null) {
                c14602f = null;
            } else {
                c14602f = null;
            }
            if (c14602f == null) {
                c28655q.m87150e0(-427905944);
                c28655q.m87173q(false);
                function4 = function3;
                z15 = true;
            } else {
                c28655q.m87150e0(-427905943);
                int i28 = i16 << 3;
                m54229p(homeViewState.getHeaderState(), c14602f, scrollState, z4, itemViewEventHelper, homeViewState.getHomeFeed().getHomeMetaData(), onDeepDiveClicked, c28655q, ((i17 << 18) & 3670016) | (i28 & 8064) | (57344 & i19));
                function4 = function3;
                z15 = true;
                m54235v(c14602f, scrollState, c13404j, itemViewEventHelper, homeViewState.getHomeFeed().getHomeMetaData(), statusViewState, homeViewState.getIsWeeklyPlanTileExpanded(), onWhoopStatusClick, function4, c28655q, (i16 & 112) | (C13404j.f46947x << 6) | (i19 & 896) | ((i16 >> 12) & 7168) | (i24 << 15) | (i28 & 458752) | (i18 & 29360128) | ((i17 << 21) & 234881024), 0);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z15);
            function2 = function4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function2 = function1;
        }
        modifier3 = modifier2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: im1.g0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC18677j0.m54234u(modifier3, scrollState, z4, homeViewState, statusViewState, c13404j, onErrorRetry, itemViewEventHelper, onWhoopStatusClick, onBottomOfPillarHit, onDeepDiveClicked, function2, i13, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m54232s(boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m54233t(Function1 function1) {
        function1.invoke(AbstractC18703w0.m54391e(EnumC14603g.OVERVIEW));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m54234u(Modifier modifier, C13821r1 c13821r1, boolean z4, C13348v c13348v, C3815c c3815c, C13404j c13404j, InterfaceC4339a interfaceC4339a, C18665d0 c18665d0, Function1 function1, Function1 function2, Function1 function3, Function1 function4, int i13, int i14, int i15, Composer composer, int i16) {
        m54231r(modifier, c13821r1, z4, c13348v, c3815c, c13404j, interfaceC4339a, c18665d0, function1, function2, function3, function4, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f5 A[LOOP:1: B:105:0x01ef->B:107:0x01f5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x0242  */
    /* JADX WARN: Code duplicated, block: B:112:0x024d  */
    /* JADX WARN: Code duplicated, block: B:115:0x01e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x01d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:88:0x0104  */
    /* JADX WARN: Code duplicated, block: B:91:0x015f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0163  */
    /* JADX WARN: Code duplicated, block: B:97:0x0184  */
    /* JADX INFO: renamed from: v */
    private static final void m54235v(C14602f c14602f, C13821r1 c13821r1, C13404j c13404j, C18665d0 c18665d0, C14600d c14600d, C3815c c3815c, boolean z4, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Function1 function4;
        float f13;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i16;
        ArrayList<C14597a> arrayList;
        Object objM87133R;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-518133031);
        int i17 = (i13 & 6) == 0 ? (c28655q.m87157i(c14602f) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i17 |= c28655q.m87153g(c13821r1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i17 |= (i13 & 512) == 0 ? c28655q.m87153g(c13404j) : c28655q.m87157i(c13404j) ? 256 : 128;
        }
        C18665d0 c18665d1 = c18665d0;
        if ((i13 & 3072) == 0) {
            i17 |= c28655q.m87157i(c18665d1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        C14600d c14600d2 = c14600d;
        if ((i13 & 24576) == 0) {
            i17 |= c28655q.m87157i(c14600d2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i17 |= (262144 & i13) == 0 ? c28655q.m87153g(c3815c) : c28655q.m87157i(c3815c) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        boolean z14 = z4;
        if ((1572864 & i13) == 0) {
            i17 |= c28655q.m87155h(z14) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i17 |= c28655q.m87157i(function1) ? 8388608 : 4194304;
        }
        int i18 = i14 & 256;
        if (i18 == 0) {
            if ((100663296 & i13) == 0) {
                i17 |= c28655q.m87157i(function2) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
            }
            i15 = i17;
            if ((i15 & 38347923) != 38347922) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                if (i18 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C16554u(22);
                        c28655q.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                f13 = 8;
                c2314t = C2314t.f9131w;
                Modifier modifierM34108a = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC1099a.m3396r(c2314t, 2 * f13, 0.0f, 2), c13821r1, 14), c13404j, 0.0f, false, c28655q, (C13404j.f46947x << 3) | ((i15 >> 3) & 112), 6);
                c28655q = c28655q;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM34108a);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                float f14 = 4;
                AbstractC11266d.m30469w(5, f14, c2314t, c28655q);
                i16 = i15 >> 12;
                AbstractC18682m.m54244g(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 3 * f14, 7), c3815c, function1, c28655q, (C3815c.f15649d << 3) | 6 | (i16 & 112) | ((i15 >> 15) & 896), 0);
                c28655q.m87150e0(546354979);
                List<C14597a> listM41787a = c14602f.m41787a();
                arrayList = new ArrayList();
                for (Object obj : listM41787a) {
                    if (!(((C14597a) obj).getItemViewState() instanceof C0140r)) {
                        arrayList.add(obj);
                    }
                }
                for (C14597a c14597a : arrayList) {
                    m54224k(c14597a, c18665d1, c14600d2, z14, function4, c28655q, ((i15 >> 6) & MessageListItemViewType.GIPHY) | ((i15 >> 9) & 7168) | (i16 & 57344), 0);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(c14597a.getInsetBottom().getSpacing(), c2314t));
                    c18665d1 = c18665d0;
                    c14600d2 = c14600d;
                    z14 = z4;
                    f13 = f13;
                }
                c28655q.m87173q(false);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13 * f14, c2314t));
                c28655q.m87173q(true);
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15176w0(c14602f, c13821r1, c13404j, c18665d0, c14600d, c3815c, z4, function1, function3, i13, i14);
            }
        }
        i17 |= 100663296;
        i15 = i17;
        if ((i15 & 38347923) != 38347922) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            if (i18 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C16554u(22);
                    c28655q.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            f13 = 8;
            c2314t = C2314t.f9131w;
            Modifier modifierM34108a2 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC1099a.m3396r(c2314t, 2 * f13, 0.0f, 2), c13821r1, 14), c13404j, 0.0f, false, c28655q, (C13404j.f46947x << 3) | ((i15 >> 3) & 112), 6);
            c28655q = c28655q;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM34108a2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            float f15 = 4;
            AbstractC11266d.m30469w(5, f15, c2314t, c28655q);
            i16 = i15 >> 12;
            AbstractC18682m.m54244g(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 3 * f15, 7), c3815c, function1, c28655q, (C3815c.f15649d << 3) | 6 | (i16 & 112) | ((i15 >> 15) & 896), 0);
            c28655q.m87150e0(546354979);
            List<C14597a> listM41787a2 = c14602f.m41787a();
            arrayList = new ArrayList();
            while (r1.hasNext()) {
                if (!(((C14597a) obj).getItemViewState() instanceof C0140r)) {
                    arrayList.add(obj);
                }
            }
            while (r1.hasNext()) {
                m54224k(c14597a, c18665d1, c14600d2, z14, function4, c28655q, ((i15 >> 6) & MessageListItemViewType.GIPHY) | ((i15 >> 9) & 7168) | (i16 & 57344), 0);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(c14597a.getInsetBottom().getSpacing(), c2314t));
                c18665d1 = c18665d0;
                c14600d2 = c14600d;
                z14 = z4;
                f13 = f13;
            }
            c28655q.m87173q(false);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13 * f15, c2314t));
            c28655q.m87173q(true);
            function3 = function4;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15176w0(c14602f, c13821r1, c13404j, c18665d0, c14600d, c3815c, z4, function1, function3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m54236w(boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m54237x(C14602f c14602f, C13821r1 c13821r1, C13404j c13404j, C18665d0 c18665d0, C14600d c14600d, C3815c c3815c, boolean z4, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m54235v(c14602f, c13821r1, c13404j, c18665d0, c14600d, c3815c, z4, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
