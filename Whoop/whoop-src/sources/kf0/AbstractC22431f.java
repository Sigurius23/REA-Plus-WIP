package kf0;

import a80.C0546j;
import a80.C0547k;
import am2.C1040r;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import bf0.C3195g;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.models.modal.DialogModel;
import com.whoop.design.models.modal.Modal;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.whoopaction.domain.models.Action;
import d11.C11474i;
import dp0.AbstractC12248d;
import dp0.AbstractC12250f;
import ep0.C13404j;
import gb1.AbstractC15673b0;
import gb1.AbstractC15674c;
import gb1.AbstractC15676d;
import gb1.AbstractC15689q;
import gz0.EnumC16313m0;
import h02.C16576i;
import h51.C16934f;
import hg3.AbstractC17269i;
import ih0.AbstractC18489d0;
import iz0.AbstractC21048g;
import iz0.C21053l;
import iz0.C21054m;
import j11.AbstractC21211n;
import j11.C21214q;
import j11.EnumC21213p;
import j93.AbstractC21478l0;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import jp1.C21860l;
import jp2.C21875f;
import jt1.C21937b;
import jx2.C22038b;
import kd0.C22383c;
import kd0.InterfaceC22381a;
import kotlin.C2014l;
import l83.C23454a0;
import md0.AbstractC25448c;
import md0.AbstractC25450e;
import md0.AbstractC25451f;
import n81.C26453f;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27249e;
import ny0.C27256h;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.AbstractC2294a;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p132f0.C13821r1;
import p163g1.C15079m3;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p239j1.AbstractC21189g;
import p239j1.C21194l;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C22957g;
import p291l0.C23010x;
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
import p710im1.C18656a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: kf0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\u001aG\u0010\f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u0012\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001aE\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a-\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\"²\u0006\u000e\u0010\u001e\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001f\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010 \u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010!\u001a\u0004\u0018\u00010\u000e8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"", "source", "Lkd0/c$g;", "viewState", "Lkotlin/Function1;", "Lkd0/a;", "Ll83/a0;", "onEvent", "Lf0/r1;", "scrollState", "", "showBackButton", "v", "(Ljava/lang/String;Lkd0/c$g;Lkotlin/jvm/functions/Function1;Lf0/r1;ZLandroidx/compose/runtime/Composer;II)V", "Lkd0/c$b;", "dialogState", "Lkotlin/Function0;", "onDismiss", "Z", "(Lkd0/c$b;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "onDismissEvent", "U", "(Lkd0/c$b;Landroidx/compose/ui/Modifier;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lm91/u;", "item", "", "P", "(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "hasOpenALHEventAlreadySent", "hasScrolledToBottomEventSent", "showAttendedAppointmentDialog", "dialogFromButton", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22431f {

    /* JADX INFO: renamed from: kf0.f$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.view.AdvancedLabsScreenContentKt$AdvancedLabsScreenContent$3$1", m100430f = "AdvancedLabsScreenContent.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f87758E;

        /* JADX INFO: renamed from: w */
        int f87759w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f87760x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f87761y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C22383c.g f87762z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, String str, C22383c.g gVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f87760x = function1;
            this.f87761y = str;
            this.f87762z = gVar;
            this.f87758E = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f87760x, this.f87761y, this.f87762z, this.f87758E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f87759w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!AbstractC22431f.m64679x(this.f87758E)) {
                AbstractC22431f.m64636K(this.f87758E, true);
                this.f87760x.invoke(new InterfaceC22381a.b0(this.f87761y, this.f87762z.getAnalyticsData()));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m64626A(Function1 function1) {
        function1.invoke(InterfaceC22381a.k0.f87421a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m64627B(InterfaceC28601c1 interfaceC28601c1) {
        m64681z(interfaceC28601c1, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m64628C(InterfaceC28601c1 interfaceC28601c1) {
        m64640O(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m64629D(C13821r1 c13821r1, Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        if (c13821r1.f49321d.m87024x() > 0 && c13821r1.f49318a.m87024x() > 0 && !m64637L(interfaceC28601c1)) {
            m64638M(interfaceC28601c1, true);
            function1.invoke(InterfaceC22381a.n0.f87432a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m64630E(Function1 function1) {
        function1.invoke(InterfaceC22381a.t.f87445a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m64631F(C22383c.g gVar, Function1 function1) {
        C9598e c9598eM64373a;
        C22383c.f fVarM64371a = gVar.getNavigationBar().getNavigationRightButton();
        if (fVarM64371a != null && (c9598eM64373a = fVarM64371a.getDestination()) != null) {
            function1.invoke(new InterfaceC22381a.j(c9598eM64373a));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:32:0x0083  */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m64632G(C22383c.g gVar, Function1 function1, InterfaceC25312u interfaceC25312u, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, Object it) {
        DialogModel dialogModel;
        C22383c.b bVarM74805c;
        C22383c.b bVarM74805c2;
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof C27256h) {
            C27256h c27256h = (C27256h) it;
            if (AbstractC22676k.m65745e(c27256h.getId(), "advanced_labs_home_info_callout_attended_appointment_callout_visited_button")) {
                AbstractC25451f abstractC25451fM74804b = AbstractC25450e.m74804b(c27256h, gVar.getAttendedAppointmentDialog());
                if (abstractC25451fM74804b instanceof AbstractC25451f.b) {
                    Modal modal = ((AbstractC25451f.b) abstractC25451fM74804b).getModal().getModal();
                    dialogModel = modal instanceof DialogModel ? (DialogModel) modal : null;
                    if (dialogModel != null && (bVarM74805c2 = AbstractC25450e.m74805c(dialogModel)) != null) {
                        m64681z(interfaceC28601c1, bVarM74805c2);
                    }
                } else if (AbstractC22676k.m65745e(abstractC25451fM74804b, AbstractC25451f.c.f99688a)) {
                    m64640O(interfaceC28601c2, true);
                } else {
                    if (!AbstractC22676k.m65745e(abstractC25451fM74804b, AbstractC25451f.a.f99685a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    function1.invoke(new InterfaceC22381a.x(it, interfaceC25312u));
                }
            } else if (it instanceof AnyModal) {
                Modal modal2 = ((AnyModal) it).getModal();
                dialogModel = modal2 instanceof DialogModel ? (DialogModel) modal2 : null;
                if (dialogModel != null && (bVarM74805c = AbstractC25450e.m74805c(dialogModel)) != null) {
                    m64681z(interfaceC28601c1, bVarM74805c);
                }
            } else {
                function1.invoke(new InterfaceC22381a.x(it, interfaceC25312u));
            }
        } else if (it instanceof AnyModal) {
            Modal modal3 = ((AnyModal) it).getModal();
            if (modal3 instanceof DialogModel) {
            }
            if (dialogModel != null) {
                m64681z(interfaceC28601c1, bVarM74805c);
            }
        } else {
            function1.invoke(new InterfaceC22381a.x(it, interfaceC25312u));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m64633H(C22383c.g gVar, Function1 function1, InterfaceC25312u interfaceC25312u) {
        String strM64381g = gVar.getSelectedSegmentId();
        if (strM64381g != null) {
            function1.invoke(new InterfaceC22381a.s0(strM64381g));
        }
        function1.invoke(new InterfaceC22381a.x(interfaceC25312u, interfaceC25312u));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m64634I(Function1 function1, InterfaceC25312u interfaceC25312u, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC22381a.x(it, interfaceC25312u));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m64635J(String str, C22383c.g gVar, Function1 function1, C13821r1 c13821r1, boolean z4, int i13, int i14, Composer composer, int i15) {
        m64677v(str, gVar, function1, c13821r1, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final void m64636K(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: L */
    private static final boolean m64637L(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: M */
    private static final void m64638M(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: N */
    private static final boolean m64639N(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: O */
    private static final void m64640O(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX INFO: renamed from: P */
    public static final void m64641P(InterfaceC25312u item, Function1 function1, Composer composer, int i13, int i14) {
        Function1 function2;
        Function1 function3;
        boolean z4;
        boolean z13;
        List<InterfaceC25312u> listM64734e;
        List<InterfaceC25312u> listM64734e2;
        Object next;
        AbstractC22676k.m65750j(item, "item");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(462295853);
        int i15 = (i13 & 6) == 0 ? i13 | (c28655q.m87157i(item) ? 4 : 2) : i13;
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
                    objM87133R = new C21875f(29);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            boolean z14 = item instanceof C22436k;
            Object obj = null;
            C22436k c22436k = z14 ? (C22436k) item : null;
            if (c22436k != null && (listM64734e2 = c22436k.m64734e()) != null) {
                Iterator<T> it = listM64734e2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((InterfaceC25312u) next) instanceof C16934f));
                if (next != null) {
                    z4 = true;
                } else if (item instanceof C16934f) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else if (item instanceof C16934f) {
                z4 = true;
            } else {
                z4 = false;
            }
            C22436k c22436k2 = z14 ? (C22436k) item : null;
            if (c22436k2 != null && (listM64734e = c22436k2.m64734e()) != null) {
                for (Object obj2 : listM64734e) {
                    if (((InterfaceC25312u) obj2) instanceof C26453f) {
                        obj = obj2;
                        break;
                    }
                }
                if (obj != null) {
                    z13 = true;
                } else if (item instanceof C26453f) {
                    z13 = true;
                } else {
                    z13 = false;
                }
            } else if (item instanceof C26453f) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z15 = (z4 || z13) ? false : true;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C22429d(0);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM44099b = AbstractC15676d.m44099b(C2314t.f9131w, z15, (Function1) objM87133R2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44099b);
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
            int i17 = i15;
            C25307p c25307pM74678B0 = AbstractC25448c.m74678B0();
            boolean zM87157i = c28655q.m87157i(item) | ((i17 & 112) == 32);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i || objM87133R3 == c28676v0) {
                objM87133R3 = new C0546j(item, function3, 16);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC25303l.m74291r(item, c25307pM74678B0, null, (Function1) objM87133R3, c28655q, (C25307p.f99300b << 3) | (i17 & 14), 4);
            c28655q.m87173q(true);
            function2 = function3;
        } else {
            c28655q.m87138X();
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0547k(item, function2, i13, i14, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m64642Q(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final Modifier m64643R(Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC1099a.m3396r(applyIf, 2 * 8, 0.0f, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m64644S(InterfaceC25312u interfaceC25312u, Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        boolean z4 = interfaceC25312u instanceof C11474i;
        Object obj = interfaceC25312u;
        if (!z4) {
            obj = event;
        }
        function1.invoke(obj);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m64645T(InterfaceC25312u interfaceC25312u, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m64641P(interfaceC25312u, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018d  */
    /* JADX WARN: Code duplicated, block: B:103:0x019a  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00db  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:80:0x010b  */
    /* JADX WARN: Code duplicated, block: B:87:0x011a  */
    /* JADX WARN: Code duplicated, block: B:89:0x011e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0120  */
    /* JADX WARN: Code duplicated, block: B:93:0x0126  */
    /* JADX WARN: Code duplicated, block: B:94:0x0128  */
    /* JADX WARN: Code duplicated, block: B:97:0x0130 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x0132  */
    /* JADX INFO: renamed from: U */
    public static final void m64646U(final C22383c.b dialogState, Modifier modifier, InterfaceC4339a interfaceC4339a, final Function1 onEvent, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        final InterfaceC4339a interfaceC4339a2;
        int i17;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        C28676v0 c28676v0;
        int i18;
        boolean z13;
        int i19;
        boolean z14;
        int i24;
        boolean z15;
        boolean z16;
        Object objM87133R;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z24;
        Object objM87133R2;
        Object objM87133R3;
        int i25;
        AbstractC22676k.m65750j(dialogState, "dialogState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-827088401);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q2.m87153g(dialogState) : c28655q2.m87157i(dialogState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i26 = i14 & 2;
        if (i26 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q2.m87157i(interfaceC4339a2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i13 & 3072) == 0) {
                    if (c28655q2.m87157i(onEvent)) {
                        i25 = 2048;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i25;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    if (i26 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C22038b(22);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                    }
                    TextResource textResourceM64365d = dialogState.getTitle();
                    TextResource textResourceM64362a = dialogState.getDescription();
                    TextResource title = dialogState.getPrimaryButton().getTitle();
                    TextResource title2 = dialogState.getSecondaryButton().getTitle();
                    EnumC39333f enumC39333f = EnumC39333f.BRAND_WHITE;
                    EnumC21213p enumC21213p = EnumC21213p.DEFAULT;
                    i18 = i15 & 14;
                    if (i18 != 4 || ((i15 & 8) != 0 && c28655q2.m87157i(dialogState))) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    i19 = i15 & 7168;
                    if (i19 == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z25 = z13 | z14;
                    i24 = i15 & 896;
                    if (i24 == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z25 | z15;
                    objM87133R = c28655q2.m87133R();
                    if (z16 || objM87133R == c28676v0) {
                        final int i27 = 0;
                        objM87133R = new InterfaceC4339a() { // from class: kf0.e
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i27) {
                                    case 0:
                                        return AbstractC22431f.m64648W(dialogState, onEvent, interfaceC4339a2);
                                    default:
                                        return AbstractC22431f.m64649X(dialogState, onEvent, interfaceC4339a2);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                    if (i18 != 4 || ((i15 & 8) != 0 && c28655q2.m87157i(dialogState))) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (i19 == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean z26 = z17 | z18;
                    if (i24 == 256) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z24 = z26 | z19;
                    objM87133R2 = c28655q2.m87133R();
                    if (z24 || objM87133R2 == c28676v0) {
                        final int i28 = 1;
                        objM87133R2 = new InterfaceC4339a() { // from class: kf0.e
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i28) {
                                    case 0:
                                        return AbstractC22431f.m64648W(dialogState, onEvent, interfaceC4339a2);
                                    default:
                                        return AbstractC22431f.m64649X(dialogState, onEvent, interfaceC4339a2);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R2);
                    }
                    int i29 = TextResource.$stable;
                    InterfaceC4339a interfaceC4339a5 = interfaceC4339a2;
                    c28655q = c28655q2;
                    AbstractC21211n.m59497o(modifier4, textResourceM64365d, textResourceM64362a, title, true, enumC39333f, null, null, null, title2, null, false, false, enumC21213p, null, false, 0, null, null, null, false, null, interfaceC4339a5, interfaceC4339a4, (InterfaceC4339a) objM87133R2, null, null, null, c28655q, ((i15 >> 3) & 14) | 221184 | (i29 << 3) | (i29 << 6) | (i29 << 9) | (i29 << 27), 3456, i24, 239062464);
                    modifier3 = modifier4;
                    interfaceC4339a3 = interfaceC4339a5;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C15079m3(dialogState, modifier3, interfaceC4339a3, onEvent, i13, i14, 24);
                }
            }
            i15 |= 384;
            interfaceC4339a2 = interfaceC4339a;
            if ((i13 & 3072) == 0) {
                if (c28655q2.m87157i(onEvent)) {
                    i25 = 2048;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i25;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i26 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C22038b(22);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                }
                TextResource textResourceM64365d2 = dialogState.getTitle();
                TextResource textResourceM64362a2 = dialogState.getDescription();
                TextResource title3 = dialogState.getPrimaryButton().getTitle();
                TextResource title4 = dialogState.getSecondaryButton().getTitle();
                EnumC39333f enumC39333f2 = EnumC39333f.BRAND_WHITE;
                EnumC21213p enumC21213p2 = EnumC21213p.DEFAULT;
                i18 = i15 & 14;
                if (i18 != 4) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                i19 = i15 & 7168;
                if (i19 == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z27 = z13 | z14;
                i24 = i15 & 896;
                if (i24 == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z27 | z15;
                objM87133R = c28655q2.m87133R();
                if (z16) {
                    final int i210 = 0;
                    objM87133R = new InterfaceC4339a() { // from class: kf0.e
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i210) {
                                case 0:
                                    return AbstractC22431f.m64648W(dialogState, onEvent, interfaceC4339a2);
                                default:
                                    return AbstractC22431f.m64649X(dialogState, onEvent, interfaceC4339a2);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R);
                } else {
                    final int i211 = 0;
                    objM87133R = new InterfaceC4339a() { // from class: kf0.e
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i211) {
                                case 0:
                                    return AbstractC22431f.m64648W(dialogState, onEvent, interfaceC4339a2);
                                default:
                                    return AbstractC22431f.m64649X(dialogState, onEvent, interfaceC4339a2);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                if (i18 != 4) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (i19 == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z28 = z17 | z18;
                if (i24 == 256) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z24 = z28 | z19;
                objM87133R2 = c28655q2.m87133R();
                if (z24) {
                    final int i212 = 1;
                    objM87133R2 = new InterfaceC4339a() { // from class: kf0.e
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i212) {
                                case 0:
                                    return AbstractC22431f.m64648W(dialogState, onEvent, interfaceC4339a2);
                                default:
                                    return AbstractC22431f.m64649X(dialogState, onEvent, interfaceC4339a2);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    final int i213 = 1;
                    objM87133R2 = new InterfaceC4339a() { // from class: kf0.e
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i213) {
                                case 0:
                                    return AbstractC22431f.m64648W(dialogState, onEvent, interfaceC4339a2);
                                default:
                                    return AbstractC22431f.m64649X(dialogState, onEvent, interfaceC4339a2);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R2);
                }
                int i214 = TextResource.$stable;
                InterfaceC4339a interfaceC4339a7 = interfaceC4339a2;
                c28655q = c28655q2;
                AbstractC21211n.m59497o(modifier4, textResourceM64365d2, textResourceM64362a2, title3, true, enumC39333f2, null, null, null, title4, null, false, false, enumC21213p2, null, false, 0, null, null, null, false, null, interfaceC4339a7, interfaceC4339a6, (InterfaceC4339a) objM87133R2, null, null, null, c28655q, ((i15 >> 3) & 14) | 221184 | (i214 << 3) | (i214 << 6) | (i214 << 9) | (i214 << 27), 3456, i24, 239062464);
                modifier3 = modifier4;
                interfaceC4339a3 = interfaceC4339a7;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15079m3(dialogState, modifier3, interfaceC4339a3, onEvent, i13, i14, 24);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q2.m87157i(interfaceC4339a2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q2.m87157i(onEvent)) {
                    i25 = 2048;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i25;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i26 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C22038b(22);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                }
                TextResource textResourceM64365d3 = dialogState.getTitle();
                TextResource textResourceM64362a3 = dialogState.getDescription();
                TextResource title5 = dialogState.getPrimaryButton().getTitle();
                TextResource title6 = dialogState.getSecondaryButton().getTitle();
                EnumC39333f enumC39333f3 = EnumC39333f.BRAND_WHITE;
                EnumC21213p enumC21213p3 = EnumC21213p.DEFAULT;
                i18 = i15 & 14;
                if (i18 != 4) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                i19 = i15 & 7168;
                if (i19 == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z29 = z13 | z14;
                i24 = i15 & 896;
                if (i24 == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z29 | z15;
                objM87133R = c28655q2.m87133R();
                if (z16) {
                    final int i215 = 0;
                    objM87133R = new InterfaceC4339a() { // from class: kf0.e
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i215) {
                                case 0:
                                    return AbstractC22431f.m64648W(dialogState, onEvent, interfaceC4339a2);
                                default:
                                    return AbstractC22431f.m64649X(dialogState, onEvent, interfaceC4339a2);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R);
                } else {
                    final int i216 = 0;
                    objM87133R = new InterfaceC4339a() { // from class: kf0.e
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i216) {
                                case 0:
                                    return AbstractC22431f.m64648W(dialogState, onEvent, interfaceC4339a2);
                                default:
                                    return AbstractC22431f.m64649X(dialogState, onEvent, interfaceC4339a2);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                if (i18 != 4) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (i19 == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z210 = z17 | z18;
                if (i24 == 256) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z24 = z210 | z19;
                objM87133R2 = c28655q2.m87133R();
                if (z24) {
                    final int i217 = 1;
                    objM87133R2 = new InterfaceC4339a() { // from class: kf0.e
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i217) {
                                case 0:
                                    return AbstractC22431f.m64648W(dialogState, onEvent, interfaceC4339a2);
                                default:
                                    return AbstractC22431f.m64649X(dialogState, onEvent, interfaceC4339a2);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    final int i218 = 1;
                    objM87133R2 = new InterfaceC4339a() { // from class: kf0.e
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i218) {
                                case 0:
                                    return AbstractC22431f.m64648W(dialogState, onEvent, interfaceC4339a2);
                                default:
                                    return AbstractC22431f.m64649X(dialogState, onEvent, interfaceC4339a2);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R2);
                }
                int i219 = TextResource.$stable;
                InterfaceC4339a interfaceC4339a9 = interfaceC4339a2;
                c28655q = c28655q2;
                AbstractC21211n.m59497o(modifier4, textResourceM64365d3, textResourceM64362a3, title5, true, enumC39333f3, null, null, null, title6, null, false, false, enumC21213p3, null, false, 0, null, null, null, false, null, interfaceC4339a9, interfaceC4339a8, (InterfaceC4339a) objM87133R2, null, null, null, c28655q, ((i15 >> 3) & 14) | 221184 | (i219 << 3) | (i219 << 6) | (i219 << 9) | (i219 << 27), 3456, i24, 239062464);
                modifier3 = modifier4;
                interfaceC4339a3 = interfaceC4339a9;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15079m3(dialogState, modifier3, interfaceC4339a3, onEvent, i13, i14, 24);
            }
        }
        i15 |= 384;
        interfaceC4339a2 = interfaceC4339a;
        if ((i13 & 3072) == 0) {
            if (c28655q2.m87157i(onEvent)) {
                i25 = 2048;
            } else {
                i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i25;
        }
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            if (i26 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C22038b(22);
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
            }
            TextResource textResourceM64365d4 = dialogState.getTitle();
            TextResource textResourceM64362a4 = dialogState.getDescription();
            TextResource title7 = dialogState.getPrimaryButton().getTitle();
            TextResource title8 = dialogState.getSecondaryButton().getTitle();
            EnumC39333f enumC39333f4 = EnumC39333f.BRAND_WHITE;
            EnumC21213p enumC21213p4 = EnumC21213p.DEFAULT;
            i18 = i15 & 14;
            if (i18 != 4) {
                z13 = true;
            } else {
                z13 = true;
            }
            i19 = i15 & 7168;
            if (i19 == 2048) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z211 = z13 | z14;
            i24 = i15 & 896;
            if (i24 == 256) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = z211 | z15;
            objM87133R = c28655q2.m87133R();
            if (z16) {
                final int i2110 = 0;
                objM87133R = new InterfaceC4339a() { // from class: kf0.e
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i2110) {
                            case 0:
                                return AbstractC22431f.m64648W(dialogState, onEvent, interfaceC4339a2);
                            default:
                                return AbstractC22431f.m64649X(dialogState, onEvent, interfaceC4339a2);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R);
            } else {
                final int i2111 = 0;
                objM87133R = new InterfaceC4339a() { // from class: kf0.e
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i2111) {
                            case 0:
                                return AbstractC22431f.m64648W(dialogState, onEvent, interfaceC4339a2);
                            default:
                                return AbstractC22431f.m64649X(dialogState, onEvent, interfaceC4339a2);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a10 = (InterfaceC4339a) objM87133R;
            if (i18 != 4) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (i19 == 2048) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean z212 = z17 | z18;
            if (i24 == 256) {
                z19 = true;
            } else {
                z19 = false;
            }
            z24 = z212 | z19;
            objM87133R2 = c28655q2.m87133R();
            if (z24) {
                final int i2112 = 1;
                objM87133R2 = new InterfaceC4339a() { // from class: kf0.e
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i2112) {
                            case 0:
                                return AbstractC22431f.m64648W(dialogState, onEvent, interfaceC4339a2);
                            default:
                                return AbstractC22431f.m64649X(dialogState, onEvent, interfaceC4339a2);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R2);
            } else {
                final int i2113 = 1;
                objM87133R2 = new InterfaceC4339a() { // from class: kf0.e
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i2113) {
                            case 0:
                                return AbstractC22431f.m64648W(dialogState, onEvent, interfaceC4339a2);
                            default:
                                return AbstractC22431f.m64649X(dialogState, onEvent, interfaceC4339a2);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R2);
            }
            int i2114 = TextResource.$stable;
            InterfaceC4339a interfaceC4339a11 = interfaceC4339a2;
            c28655q = c28655q2;
            AbstractC21211n.m59497o(modifier4, textResourceM64365d4, textResourceM64362a4, title7, true, enumC39333f4, null, null, null, title8, null, false, false, enumC21213p4, null, false, 0, null, null, null, false, null, interfaceC4339a11, interfaceC4339a10, (InterfaceC4339a) objM87133R2, null, null, null, c28655q, ((i15 >> 3) & 14) | 221184 | (i2114 << 3) | (i2114 << 6) | (i2114 << 9) | (i2114 << 27), 3456, i24, 239062464);
            modifier3 = modifier4;
            interfaceC4339a3 = interfaceC4339a11;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15079m3(dialogState, modifier3, interfaceC4339a3, onEvent, i13, i14, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m64647V() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m64648W(C22383c.b bVar, Function1 function1, InterfaceC4339a interfaceC4339a) {
        Action action = bVar.getSecondaryButton().getAction();
        C9598e destination = bVar.getSecondaryButton().getDestination();
        if (action != null) {
            function1.invoke(new InterfaceC22381a.x(action, bVar.getSecondaryButton()));
        } else if (!AbstractC22676k.m65745e(destination.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w)) {
            function1.invoke(new InterfaceC22381a.x(destination, bVar.getSecondaryButton()));
        }
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m64649X(C22383c.b bVar, Function1 function1, InterfaceC4339a interfaceC4339a) {
        Action action = bVar.getPrimaryButton().getAction();
        C9598e destination = bVar.getPrimaryButton().getDestination();
        if (action != null) {
            function1.invoke(new InterfaceC22381a.x(action, bVar.getPrimaryButton()));
        } else if (!AbstractC22676k.m65745e(destination.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w)) {
            function1.invoke(new InterfaceC22381a.x(destination, bVar.getPrimaryButton()));
        }
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m64650Y(C22383c.b bVar, Modifier modifier, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m64646U(bVar, modifier, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Z */
    public static final void m64651Z(C22383c.b bVar, InterfaceC4339a onDismiss, Function1 onEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(onDismiss, "onDismiss");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2075356908);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(bVar) : c28655q.m87157i(bVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onDismiss) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 256 : 128;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            c28655q.m87138X();
        } else if (bVar == null) {
            c28655q.m87150e0(903634364);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(903634365);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM7154a = AbstractC2294a.m7154a(Float.MAX_VALUE, AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, c2314t), C17919x.m51541c(0.85f, C17919x.f69625b), AbstractC17918w0.f69621a));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM7154a);
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
            Modifier modifierMo3400a = C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E);
            boolean z4 = ((i14 & 112) == 32) | ((i14 & 896) == 256);
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C2014l(onDismiss, onEvent, 4);
                c28655q.m87172p0(objM87133R);
            }
            int i15 = TextResource.$stable;
            int i16 = C27256h.f109055z;
            m64646U(bVar, modifierMo3400a, onDismiss, (Function1) objM87133R, c28655q, i15 | i16 | i16 | ((i14 << 3) & 896), 0);
            c28655q.m87173q(true);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16576i(bVar, onDismiss, onEvent, i13, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m64653a0(InterfaceC4339a interfaceC4339a, Function1 function1, InterfaceC22381a event) {
        AbstractC22676k.m65750j(event, "event");
        interfaceC4339a.invoke();
        function1.invoke(event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m64655b0(C22383c.b bVar, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, Composer composer, int i14) {
        m64651Z(bVar, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:104:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:107:0x0201  */
    /* JADX WARN: Code duplicated, block: B:108:0x0203  */
    /* JADX WARN: Code duplicated, block: B:111:0x0210 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x0212  */
    /* JADX WARN: Code duplicated, block: B:117:0x0239  */
    /* JADX WARN: Code duplicated, block: B:119:0x023f  */
    /* JADX WARN: Code duplicated, block: B:125:0x024b  */
    /* JADX WARN: Code duplicated, block: B:126:0x024d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0257 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:130:0x0259  */
    /* JADX WARN: Code duplicated, block: B:133:0x029e  */
    /* JADX WARN: Code duplicated, block: B:134:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:137:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:139:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:142:0x0333  */
    /* JADX WARN: Code duplicated, block: B:143:0x0337  */
    /* JADX WARN: Code duplicated, block: B:146:0x0344  */
    /* JADX WARN: Code duplicated, block: B:148:0x0352  */
    /* JADX WARN: Code duplicated, block: B:151:0x0366  */
    /* JADX WARN: Code duplicated, block: B:152:0x0376  */
    /* JADX WARN: Code duplicated, block: B:155:0x0384  */
    /* JADX WARN: Code duplicated, block: B:158:0x0396  */
    /* JADX WARN: Code duplicated, block: B:161:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:162:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:165:0x03d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:168:0x03df  */
    /* JADX WARN: Code duplicated, block: B:171:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:172:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:175:0x0404 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:176:0x0406  */
    /* JADX WARN: Code duplicated, block: B:180:0x0444  */
    /* JADX WARN: Code duplicated, block: B:183:0x0485  */
    /* JADX WARN: Code duplicated, block: B:184:0x0489  */
    /* JADX WARN: Code duplicated, block: B:187:0x0496  */
    /* JADX WARN: Code duplicated, block: B:189:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:193:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:196:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:198:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:199:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:202:0x0507  */
    /* JADX WARN: Code duplicated, block: B:204:0x050b  */
    /* JADX WARN: Code duplicated, block: B:205:0x050e  */
    /* JADX WARN: Code duplicated, block: B:206:0x0517 A[PHI: r41
      0x0517: PHI (r41v8 p1.v0) = (r41v7 p1.v0), (r41v10 p1.v0) binds: [B:201:0x0505, B:204:0x050b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:211:0x0567  */
    /* JADX WARN: Code duplicated, block: B:212:0x0579  */
    /* JADX WARN: Code duplicated, block: B:214:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:215:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:218:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:220:0x0609  */
    /* JADX WARN: Code duplicated, block: B:223:0x0617  */
    /* JADX WARN: Code duplicated, block: B:224:0x0631  */
    /* JADX WARN: Code duplicated, block: B:228:0x06df  */
    /* JADX WARN: Code duplicated, block: B:230:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:232:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:233:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:236:0x070e  */
    /* JADX WARN: Code duplicated, block: B:239:0x0713  */
    /* JADX WARN: Code duplicated, block: B:242:0x073b  */
    /* JADX WARN: Code duplicated, block: B:244:0x074c  */
    /* JADX WARN: Code duplicated, block: B:245:0x074e  */
    /* JADX WARN: Code duplicated, block: B:248:0x075a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:249:0x075c  */
    /* JADX WARN: Code duplicated, block: B:254:0x07af  */
    /* JADX WARN: Code duplicated, block: B:257:0x07bb  */
    /* JADX WARN: Code duplicated, block: B:266:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:49:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b4 A[PHI: r0 r4
      0x00b4: PHI (r0v61 int) = (r0v13 int), (r0v11 int), (r0v63 int) binds: [B:64:0x00c6, B:58:0x00b0, B:59:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x00b4: PHI (r4v73 f0.r1) = (r4v6 f0.r1), (r4v4 f0.r1), (r4v4 f0.r1) binds: [B:64:0x00c6, B:58:0x00b0, B:59:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:74:0x0107  */
    /* JADX WARN: Code duplicated, block: B:77:0x0119  */
    /* JADX WARN: Code duplicated, block: B:80:0x012a  */
    /* JADX WARN: Code duplicated, block: B:81:0x012d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0135 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x0137  */
    /* JADX WARN: Code duplicated, block: B:88:0x0167  */
    /* JADX WARN: Code duplicated, block: B:91:0x0185  */
    /* JADX WARN: Code duplicated, block: B:92:0x0196  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:99:0x01dd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40, types: [com.whoop.design.util.TextResource, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r4v70 */
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
    public static final void m64677v(String source, C22383c.g viewState, Function1 onEvent, C13821r1 c13821r1, boolean z4, Composer composer, int i13, int i14) {
        C13821r1 c13821r1M92099U;
        boolean z13;
        boolean z14;
        Function1 function1;
        C28655q c28655q;
        boolean z15;
        C28677v1 c28677v1M87180u;
        int i15;
        C13821r1 c13821r2;
        boolean z16;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R3;
        Object objM87133R4;
        InterfaceC28601c1 interfaceC28601c3;
        int i16;
        boolean z17;
        Object objM87133R5;
        InterfaceC28601c1 interfaceC28601c4;
        int i17;
        C21194l c21194lM60416V;
        Object objM87133R6;
        int i18;
        C22383c.b bVarM64376b;
        int i19;
        C28655q c28655q2;
        boolean z18;
        C21194l c21194l;
        Object objM87133R7;
        InterfaceC28601c1 interfaceC28601c5;
        boolean z19;
        boolean z24;
        boolean zM87157i;
        Object objM87133R8;
        C13821r1 c13821r3;
        Function1 function2;
        C22383c.g gVar;
        boolean z25;
        boolean z26;
        Object objM87133R9;
        int i24;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C21194l c21194l2;
        C28655q c28655q3;
        int iHashCode2;
        ?? r10;
        int i25;
        C39274g c39274g;
        C22383c.f fVarM64371a;
        C39274g c39274g2;
        float f13;
        float f14;
        boolean z27;
        Object objM87133R10;
        Function1 function3;
        boolean z28;
        boolean z29;
        Object objM87133R11;
        C28676v0 c28676v1;
        C2314t c2314t;
        int i26;
        C13821r1 c13821r4;
        C28655q c28655q4;
        int iHashCode3;
        C22383c.g gVar2;
        C28655q c28655q5;
        int i27;
        C28676v0 c28676v2;
        Function1 function4;
        C22383c.h hVarM64382h;
        float f15;
        int iHashCode4;
        C0213j c0213j2;
        C0209i c0209i2;
        String strM64384b;
        int i28;
        C21194l c21194l3;
        int i29;
        int i34;
        int i35;
        boolean z34;
        C28655q c28655q6;
        boolean z35;
        Function1 function5;
        C2314t c2314t2;
        int i36;
        boolean z36;
        boolean zM87157i2;
        Object objM87133R12;
        C28676v0 c28676v3;
        boolean z37;
        boolean zM87157i3;
        Object objM87133R13;
        C28676v0 c28676v4;
        int i37;
        boolean z38;
        boolean zM87157i4;
        Object objM87133R14;
        Object c1040r;
        InterfaceC28601c1 interfaceC28601c6;
        C28655q c28655q7;
        C28676v0 c28676v5;
        C28676v0 c28676v6;
        EnumC16313m0 enumC16313m0M64374b;
        int i38;
        C2305k c2305k = C2299e.f9111N;
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q8 = (C28655q) composer;
        c28655q8.m87154g0(-1291074372);
        int i39 = (i13 & 6) == 0 ? (c28655q8.m87153g(source) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i39 |= c28655q8.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i39 |= c28655q8.m87157i(onEvent) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                c13821r1M92099U = c13821r1;
                if (c28655q8.m87153g(c13821r1M92099U)) {
                    i38 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i39 |= i38;
            } else {
                c13821r1M92099U = c13821r1;
            }
            i38 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i39 |= i38;
        } else {
            c13821r1M92099U = c13821r1;
        }
        int i44 = i14 & 16;
        if (i44 == 0) {
            if ((i13 & 24576) == 0) {
                z13 = z4;
                i39 |= c28655q8.m87155h(z13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((i39 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q8.m87135U(i39 & 1, z14)) {
                c28655q8.m87140Z();
                if ((i13 & 1) != 0 || c28655q8.m87118C()) {
                    if ((i14 & 8) != 0) {
                        c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q8, 1);
                        i39 &= -7169;
                    }
                    if (i44 != 0) {
                        C13821r1 c13821r5 = c13821r1M92099U;
                        i15 = i39;
                        c13821r2 = c13821r5;
                        z16 = true;
                    }
                    c28655q8.m87175r();
                    Object[] objArr = new Object[0];
                    objM87133R = c28655q8.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = new C22038b(21);
                        c28655q8.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr, (InterfaceC4339a) objM87133R, c28655q8, 48);
                    objM87133R2 = c28655q8.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q8.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q8.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q8.m87172p0(objM87133R3);
                    }
                    InterfaceC28601c1 interfaceC28601c7 = (InterfaceC28601c1) objM87133R3;
                    objM87133R4 = c28655q8.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(null);
                        c28655q8.m87172p0(objM87133R4);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
                    boolean zM64377c = viewState.getDisplayRefreshingSpinner();
                    i16 = i15 & 896;
                    if (i16 == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R5 = c28655q8.m87133R();
                    if (z17 || objM87133R5 == c28676v0) {
                        objM87133R5 = new C21860l(onEvent, 19);
                        c28655q8.m87172p0(objM87133R5);
                    }
                    interfaceC28601c4 = interfaceC28601c7;
                    i17 = i15;
                    c21194lM60416V = AbstractC21478l0.m60416V(zM64377c, (InterfaceC4339a) objM87133R5, 0.0f, c28655q8, 0, 12);
                    C22383c.b bVarM64680y = m64680y(interfaceC28601c3);
                    objM87133R6 = c28655q8.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C21937b(5, interfaceC28601c3);
                        c28655q8.m87172p0(objM87133R6);
                    }
                    int i45 = TextResource.$stable;
                    int i46 = C27256h.f109055z;
                    i18 = i45 | i46 | i46;
                    m64651Z(bVarM64680y, (InterfaceC4339a) objM87133R6, onEvent, c28655q8, i18 | 48 | i16);
                    bVarM64376b = viewState.getAttendedAppointmentDialog();
                    i19 = 6;
                    if (bVarM64376b == null) {
                        c28655q8.m87150e0(-963514394);
                        c28655q8.m87173q(false);
                        c28655q2 = c28655q8;
                        interfaceC28601c3 = interfaceC28601c3;
                        c21194l = c21194lM60416V;
                    } else {
                        c28655q8.m87150e0(-963514393);
                        if (m64639N(interfaceC28601c4)) {
                            c28655q8.m87150e0(-1016911879);
                            objM87133R7 = c28655q8.m87133R();
                            if (objM87133R7 == c28676v0) {
                                interfaceC28601c5 = interfaceC28601c4;
                                objM87133R7 = new C21937b(i19, interfaceC28601c5);
                                c28655q8.m87172p0(objM87133R7);
                            } else {
                                interfaceC28601c5 = interfaceC28601c4;
                            }
                            interfaceC28601c4 = interfaceC28601c5;
                            c28655q2 = c28655q8;
                            c21194l = c21194lM60416V;
                            m64646U(bVarM64376b, null, (InterfaceC4339a) objM87133R7, onEvent, c28655q2, i18 | 384 | ((i17 << 3) & 7168), 2);
                            z18 = false;
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2 = c28655q8;
                            z18 = false;
                            c21194l = c21194lM60416V;
                            c28655q2.m87150e0(-1016703342);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z18);
                    }
                    boolean zM87153g = c28655q2.m87153g(interfaceC28601c1);
                    if (i16 == 256) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z39 = zM87153g | z19;
                    if ((i17 & 14) == 4) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    zM87157i = z39 | z24 | c28655q2.m87157i(viewState);
                    objM87133R8 = c28655q2.m87133R();
                    if (!zM87157i || objM87133R8 == c28676v0) {
                        c13821r3 = c13821r2;
                        a aVar = new a(onEvent, source, viewState, interfaceC28601c1, null);
                        function2 = onEvent;
                        gVar = viewState;
                        c28655q2.m87172p0(aVar);
                        objM87133R8 = aVar;
                    } else {
                        function2 = onEvent;
                        c13821r3 = c13821r2;
                        gVar = viewState;
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, gVar);
                    boolean z44 = (((i17 & 7168) ^ 3072) <= 2048 && c28655q2.m87153g(c13821r3)) || (i17 & 3072) == 2048;
                    if (i16 == 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = z44 | z25;
                    objM87133R9 = c28655q2.m87133R();
                    i24 = 15;
                    if (z26 || objM87133R9 == c28676v0) {
                        objM87133R9 = new C18656a0(c13821r3, function2, interfaceC28601c2, i24);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    AbstractC15689q.m44138f(c13821r3, (InterfaceC4339a) objM87133R9, c28655q2, (i17 >> 9) & 14);
                    C2314t c2314t3 = C2314t.f9131w;
                    Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(AbstractC17269i.m48893g0(AbstractC1102d.m3407d(1.0f, c2314t3), c21194l));
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM44028b0);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i3 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC39127r0M66763d);
                    C0209i c0209i4 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    C0209i c0209i5 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N);
                    AbstractC22989q.m66760a(AbstractC15673b0.m44038g0(AbstractC1102d.m3411h(530, AbstractC1102d.m3409f(1.0f, c2314t3))), c28655q2, 0);
                    Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t3);
                    C13404j c13404jM64379e = gVar.getScreenContextMetadata();
                    int i47 = C13404j.f46947x << 3;
                    c21194l2 = c21194l;
                    C13821r1 c13821r6 = c13821r3;
                    c28655q3 = c28655q2;
                    Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC12250f.m34129b(modifierM3407d, c13404jM64379e, false, c28655q3, i47 | 6, 2));
                    C22957g c22957g = AbstractC22977m.f90652c;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, C2299e.f9110M, c28655q3, 0);
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierM66724m);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i3, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q3, c0209i4, interfaceC28653p1M87165m2);
                    if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i5, modifierM118962N2);
                    TextResource textResourceM21278l = AbstractC8693b.m21278l(viewState.getNavigationBar().getNavigationTitle());
                    if (z16) {
                        r10 = 0;
                        i25 = 2;
                        c39274g = new C39274g(EnumC16313m0.CARET_BACKWARD.toWhoopIcon(), 0 == true ? 1 : 0, i25, 0 == true ? 1 : 0);
                    } else {
                        r10 = 0;
                        i25 = 2;
                        c39274g = null;
                    }
                    fVarM64371a = viewState.getNavigationBar().getNavigationRightButton();
                    if (fVarM64371a != null || (enumC16313m0M64374b = fVarM64371a.getIcon()) == null) {
                        c39274g2 = null;
                    } else {
                        c39274g2 = new C39274g(enumC16313m0M64374b.toWhoopIcon(), r10, i25, r10);
                    }
                    AbstractC6721d.a aVar2 = new AbstractC6721d.a(textResourceM21278l, null, c39274g, c39274g2, null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                    f13 = 8;
                    f14 = 2 * f13;
                    Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t3, 0.0f, f14, 0.0f, 0.0f, 13);
                    if (i16 == 256) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    objM87133R10 = c28655q3.m87133R();
                    if (!z27 || objM87133R10 == c28676v0) {
                        function3 = onEvent;
                        objM87133R10 = new C21860l(function3, 20);
                        c28655q3.m87172p0(objM87133R10);
                    } else {
                        function3 = onEvent;
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R10;
                    boolean zM87157i5 = c28655q3.m87157i(viewState);
                    if (i16 == 256) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = zM87157i5 | z28;
                    objM87133R11 = c28655q3.m87133R();
                    if (z29 || objM87133R11 == c28676v0) {
                        objM87133R11 = new C21214q(viewState, function3, 17);
                        c28655q3.m87172p0(objM87133R11);
                    }
                    c28676v1 = c28676v0;
                    c2314t = c2314t3;
                    i26 = i16;
                    AbstractC6719b.m20143d(modifierM3398t, aVar2, null, interfaceC4339a, (InterfaceC4339a) objM87133R11, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 36);
                    Modifier modifierM44089m = AbstractC15674c.m44089m(c2314t, 0.0f, 1, null);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    c13821r4 = c13821r6;
                    Modifier modifierM34108a = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(modifierM44089m.mo3471e(new LayoutWeightElement(1.0f, true)), c13821r4, 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q3, i47, 6);
                    c28655q4 = c28655q3;
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q4, 48);
                    iHashCode3 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q4.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q4, modifierM34108a);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i3, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q4, c0209i4, interfaceC28653p1M87165m3);
                    if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i5, modifierM118962N3);
                    AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3411h(f14, c2314t));
                    c28655q4.m87150e0(-767561530);
                    for (C22383c.c cVar : viewState.m64380f()) {
                        c28655q4.m87150e0(-767559595);
                        for (InterfaceC25312u interfaceC25312u : cVar.m64366a()) {
                            boolean zM87157i6 = c28655q4.m87157i(viewState);
                            i37 = i26;
                            if (i37 == 256) {
                                z38 = true;
                            } else {
                                z38 = false;
                            }
                            zM87157i4 = zM87157i6 | z38 | c28655q4.m87157i(interfaceC25312u);
                            objM87133R14 = c28655q4.m87133R();
                            if (zM87157i4) {
                                interfaceC28601c6 = interfaceC28601c3;
                                c28655q7 = c28655q4;
                                c28676v5 = c28676v1;
                                c1040r = new C1040r((Object) viewState, (Object) onEvent, (Object) interfaceC25312u, interfaceC28601c6, interfaceC28601c4, 19);
                                c28655q7.m87172p0(c1040r);
                            } else {
                                c28676v6 = c28676v1;
                                if (objM87133R14 == c28676v6) {
                                    c28676v1 = c28676v6;
                                    interfaceC28601c6 = interfaceC28601c3;
                                    c28655q7 = c28655q4;
                                    c28676v5 = c28676v1;
                                    c1040r = new C1040r((Object) viewState, (Object) onEvent, (Object) interfaceC25312u, interfaceC28601c6, interfaceC28601c4, 19);
                                    c28655q7.m87172p0(c1040r);
                                } else {
                                    c28676v5 = c28676v6;
                                    c28655q7 = c28655q4;
                                    c1040r = objM87133R14;
                                    interfaceC28601c6 = interfaceC28601c3;
                                }
                            }
                            m64641P(interfaceC25312u, (Function1) c1040r, c28655q7, 0, 0);
                            float f16 = 4;
                            AbstractC11266d.m30469w(f16, f16, c2314t, c28655q7);
                            interfaceC28601c3 = interfaceC28601c6;
                            i26 = i37;
                            c28655q4 = c28655q7;
                            c28676v1 = c28676v5;
                        }
                        C28655q c28655q9 = c28655q4;
                        c28655q9.m87173q(false);
                        c28655q4 = c28655q9;
                    }
                    gVar2 = viewState;
                    c28655q5 = c28655q4;
                    i27 = i26;
                    c28676v2 = c28676v1;
                    function4 = onEvent;
                    AbstractC18489d0.m53356B(c28655q5, false, c2314t, f14, c28655q5);
                    c28655q5.m87173q(true);
                    hVarM64382h = gVar2.getStickyFooter();
                    if (hVarM64382h == null) {
                        c28655q5.m87150e0(-1675466477);
                        c28655q5.m87173q(false);
                        function1 = function4;
                        c13821r4 = c13821r4;
                        c28655q6 = c28655q5;
                        c21194l3 = c21194l2;
                        z35 = true;
                    } else {
                        c28655q5.m87150e0(-1675466476);
                        f15 = 1.0f;
                        Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 2.5d) * f13, 0.0f, 2);
                        WeakHashMap weakHashMap = C22944c2.f90553v;
                        Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1099a.m3398t(modifierM3396r, 0.0f, 0.0f, 0.0f, AbstractC22953f.m66717e(C22949e.m66712e(c28655q5).f90558e, c28655q5).mo43109a(), 7), 0.0f, 1 * f13, 0.0f, 3 * f13, 5);
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), c2305k, c28655q5, 54);
                        iHashCode4 = Long.hashCode(c28655q5.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q5.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q5, modifierM3398t2);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q5.m87158i0();
                        if (c28655q5.f115903S) {
                            c28655q5.m87163l(c0213j2);
                        } else {
                            c28655q5.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q5, C0217k.f729g, c23010xM66775a3);
                        AbstractC28683x.m87239G(c28655q5, C0217k.f728f, interfaceC28653p1M87165m4);
                        c0209i2 = C0217k.f732j;
                        if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode4))) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q5, iHashCode4, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q5, C0217k.f726d, modifierM118962N4);
                        strM64384b = hVarM64382h.getText();
                        if (strM64384b == null) {
                            c28655q5.m87150e0(1458174394);
                            c28655q5.m87173q(false);
                            z34 = false;
                            i35 = i27;
                            c28655q6 = c28655q5;
                            c21194l3 = c21194l2;
                            i29 = 16;
                            i34 = 256;
                            i28 = 15;
                        } else {
                            c28655q5.m87150e0(1458174395);
                            String strM21275i = AbstractC8693b.m21275i(strM64384b, c28655q5, 0);
                            C21053l c21053l = C21053l.f79834a;
                            C38072d c38072d = C38072d.f163053a;
                            int i48 = C38072d.f163054b;
                            i28 = 15;
                            c21194l3 = c21194l2;
                            i29 = 16;
                            i34 = 256;
                            i35 = i27;
                            z34 = false;
                            AbstractC21048g.m58807M(strM21275i, null, false, c21053l.m58880a(AbstractC18489d0.m53377r(c38072d, c28655q5, i48), c38072d.m121949b(c28655q5, i48).getWhite70(), 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q5, 0, C21053l.f79835b << 15, 32764), null, 0, 0, 0, false, c28655q5, C21054m.f79836p << 9, 502);
                            c28655q6 = c28655q5;
                            c28655q6.m87173q(false);
                        }
                        c28655q6.m87150e0(-645685272);
                        for (InterfaceC25312u interfaceC25312u2 : hVarM64382h.m64383a()) {
                            if (interfaceC25312u2 instanceof C27256h) {
                                c28655q6.m87150e0(-203300447);
                                Modifier modifierM3409f = AbstractC1102d.m3409f(f15, c2314t);
                                C27256h c27256h = (C27256h) interfaceC25312u2;
                                boolean zM87157i7 = c28655q6.m87157i(gVar2);
                                if (i35 == i34) {
                                    z37 = true;
                                } else {
                                    z37 = z34;
                                }
                                zM87157i3 = c28655q6.m87157i(interfaceC25312u2) | zM87157i7 | z37;
                                objM87133R13 = c28655q6.m87133R();
                                if (zM87157i3) {
                                    c28676v4 = c28676v2;
                                } else {
                                    c28676v4 = c28676v2;
                                    if (objM87133R13 == c28676v4) {
                                    }
                                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R13;
                                    c2314t2 = c2314t;
                                    function5 = function4;
                                    i36 = i34;
                                    AbstractC27249e.m82121d(modifierM3409f, c27256h, null, interfaceC4339a2, c28655q6, 6, 4);
                                    c28655q6.m87173q(z34);
                                    c28676v3 = c28676v4;
                                }
                                objM87133R13 = new C18656a0(gVar2, function4, c27256h, i29);
                                c28655q6.m87172p0(objM87133R13);
                                InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R13;
                                c2314t2 = c2314t;
                                function5 = function4;
                                i36 = i34;
                                AbstractC27249e.m82121d(modifierM3409f, c27256h, null, interfaceC4339a3, c28655q6, 6, 4);
                                c28655q6.m87173q(z34);
                                c28676v3 = c28676v4;
                            } else {
                                function5 = function4;
                                c2314t2 = c2314t;
                                i36 = i34;
                                C28676v0 c28676v7 = c28676v2;
                                c28655q6.m87150e0(-202720344);
                                if (i35 == i36) {
                                    z36 = true;
                                } else {
                                    z36 = z34;
                                }
                                zM87157i2 = z36 | c28655q6.m87157i(interfaceC25312u2);
                                objM87133R12 = c28655q6.m87133R();
                                if (zM87157i2 || objM87133R12 == c28676v7) {
                                    objM87133R12 = new C0546j(function5, interfaceC25312u2, i28);
                                    c28655q6.m87172p0(objM87133R12);
                                }
                                c28676v3 = c28676v7;
                                AbstractC25303l.m74291r(interfaceC25312u2, null, null, (Function1) objM87133R12, c28655q6, 0, 6);
                                c28655q6.m87173q(z34);
                            }
                            gVar2 = viewState;
                            function4 = function5;
                            i34 = i36;
                            c2314t = c2314t2;
                            i29 = i29;
                            f15 = f15;
                            c28676v2 = c28676v3;
                        }
                        function1 = function4;
                        c2314t = c2314t;
                        z35 = true;
                        AbstractC25012a.m73392y(c28655q6, z34, true, z34);
                    }
                    c28655q6.m87173q(z35);
                    C28655q c28655q10 = c28655q6;
                    AbstractC21189g.m59424b(viewState.getDisplayRefreshingSpinner(), c21194l3, C1100b.f4583a.mo3400a(c2314t, C2299e.f9115x), 0L, 0L, c28655q10, 64);
                    c28655q10.m87173q(z35);
                    c28655q = c28655q10;
                    z15 = z16;
                    c13821r1M92099U = c13821r4;
                } else {
                    c28655q8.m87138X();
                    if ((i14 & 8) != 0) {
                        i39 &= -7169;
                    }
                }
                C13821r1 c13821r7 = c13821r1M92099U;
                i15 = i39;
                c13821r2 = c13821r7;
                z16 = z13;
                c28655q8.m87175r();
                Object[] objArr2 = new Object[0];
                objM87133R = c28655q8.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = new C22038b(21);
                    c28655q8.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr2, (InterfaceC4339a) objM87133R, c28655q8, 48);
                objM87133R2 = c28655q8.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q8.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q8.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q8.m87172p0(objM87133R3);
                }
                InterfaceC28601c1 interfaceC28601c8 = (InterfaceC28601c1) objM87133R3;
                objM87133R4 = c28655q8.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(null);
                    c28655q8.m87172p0(objM87133R4);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
                boolean zM64377c2 = viewState.getDisplayRefreshingSpinner();
                i16 = i15 & 896;
                if (i16 == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R5 = c28655q8.m87133R();
                if (z17) {
                    objM87133R5 = new C21860l(onEvent, 19);
                    c28655q8.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C21860l(onEvent, 19);
                    c28655q8.m87172p0(objM87133R5);
                }
                interfaceC28601c4 = interfaceC28601c8;
                i17 = i15;
                c21194lM60416V = AbstractC21478l0.m60416V(zM64377c2, (InterfaceC4339a) objM87133R5, 0.0f, c28655q8, 0, 12);
                C22383c.b bVarM64680y2 = m64680y(interfaceC28601c3);
                objM87133R6 = c28655q8.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C21937b(5, interfaceC28601c3);
                    c28655q8.m87172p0(objM87133R6);
                }
                int i49 = TextResource.$stable;
                int i410 = C27256h.f109055z;
                i18 = i49 | i410 | i410;
                m64651Z(bVarM64680y2, (InterfaceC4339a) objM87133R6, onEvent, c28655q8, i18 | 48 | i16);
                bVarM64376b = viewState.getAttendedAppointmentDialog();
                i19 = 6;
                if (bVarM64376b == null) {
                    c28655q8.m87150e0(-963514394);
                    c28655q8.m87173q(false);
                    c28655q2 = c28655q8;
                    interfaceC28601c3 = interfaceC28601c3;
                    c21194l = c21194lM60416V;
                } else {
                    c28655q8.m87150e0(-963514393);
                    if (m64639N(interfaceC28601c4)) {
                        c28655q8.m87150e0(-1016911879);
                        objM87133R7 = c28655q8.m87133R();
                        if (objM87133R7 == c28676v0) {
                            interfaceC28601c5 = interfaceC28601c4;
                            objM87133R7 = new C21937b(i19, interfaceC28601c5);
                            c28655q8.m87172p0(objM87133R7);
                        } else {
                            interfaceC28601c5 = interfaceC28601c4;
                        }
                        interfaceC28601c4 = interfaceC28601c5;
                        c28655q2 = c28655q8;
                        c21194l = c21194lM60416V;
                        m64646U(bVarM64376b, null, (InterfaceC4339a) objM87133R7, onEvent, c28655q2, i18 | 384 | ((i17 << 3) & 7168), 2);
                        z18 = false;
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2 = c28655q8;
                        z18 = false;
                        c21194l = c21194lM60416V;
                        c28655q2.m87150e0(-1016703342);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z18);
                }
                boolean zM87153g2 = c28655q2.m87153g(interfaceC28601c1);
                if (i16 == 256) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z310 = zM87153g2 | z19;
                if ((i17 & 14) == 4) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                zM87157i = z310 | z24 | c28655q2.m87157i(viewState);
                objM87133R8 = c28655q2.m87133R();
                if (zM87157i) {
                    c13821r3 = c13821r2;
                    a aVar3 = new a(onEvent, source, viewState, interfaceC28601c1, null);
                    function2 = onEvent;
                    gVar = viewState;
                    c28655q2.m87172p0(aVar3);
                    objM87133R8 = aVar3;
                } else {
                    c13821r3 = c13821r2;
                    a aVar4 = new a(onEvent, source, viewState, interfaceC28601c1, null);
                    function2 = onEvent;
                    gVar = viewState;
                    c28655q2.m87172p0(aVar4);
                    objM87133R8 = aVar4;
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, gVar);
                if (((i17 & 7168) ^ 3072) <= 2048) {
                }
                if (i16 == 256) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                z26 = z44 | z25;
                objM87133R9 = c28655q2.m87133R();
                i24 = 15;
                if (z26) {
                    objM87133R9 = new C18656a0(c13821r3, function2, interfaceC28601c2, i24);
                    c28655q2.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new C18656a0(c13821r3, function2, interfaceC28601c2, i24);
                    c28655q2.m87172p0(objM87133R9);
                }
                AbstractC15689q.m44138f(c13821r3, (InterfaceC4339a) objM87133R9, c28655q2, (i17 >> 9) & 14);
                C2314t c2314t4 = C2314t.f9131w;
                Modifier modifierM44028b1 = AbstractC15673b0.m44028b0(AbstractC17269i.m48893g0(AbstractC1102d.m3407d(1.0f, c2314t4), c21194l));
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM44028b1);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i6 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC39127r0M66763d2);
                C0209i c0209i7 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m5);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i8 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N5);
                AbstractC22989q.m66760a(AbstractC15673b0.m44038g0(AbstractC1102d.m3411h(530, AbstractC1102d.m3409f(1.0f, c2314t4))), c28655q2, 0);
                Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t4);
                C13404j c13404jM64379e2 = gVar.getScreenContextMetadata();
                int i411 = C13404j.f46947x << 3;
                c21194l2 = c21194l;
                C13821r1 c13821r8 = c13821r3;
                c28655q3 = c28655q2;
                Modifier modifierM66724m2 = AbstractC22953f.m66724m(AbstractC12250f.m34129b(modifierM3407d2, c13404jM64379e2, false, c28655q3, i411 | 6, 2));
                C22957g c22957g2 = AbstractC22977m.f90652c;
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, C2299e.f9110M, c28655q3, 0);
                iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q3.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q3, modifierM66724m2);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i6, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q3, c0209i7, interfaceC28653p1M87165m6);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i8, modifierM118962N6);
                TextResource textResourceM21278l2 = AbstractC8693b.m21278l(viewState.getNavigationBar().getNavigationTitle());
                if (z16) {
                    r10 = 0;
                    i25 = 2;
                    c39274g = new C39274g(EnumC16313m0.CARET_BACKWARD.toWhoopIcon(), 0 == true ? 1 : 0, i25, 0 == true ? 1 : 0);
                } else {
                    r10 = 0;
                    i25 = 2;
                    c39274g = null;
                }
                fVarM64371a = viewState.getNavigationBar().getNavigationRightButton();
                if (fVarM64371a != null) {
                    c39274g2 = null;
                } else {
                    c39274g2 = null;
                }
                AbstractC6721d.a aVar5 = new AbstractC6721d.a(textResourceM21278l2, null, c39274g, c39274g2, null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                f13 = 8;
                f14 = 2 * f13;
                Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t4, 0.0f, f14, 0.0f, 0.0f, 13);
                if (i16 == 256) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                objM87133R10 = c28655q3.m87133R();
                if (z27) {
                    function3 = onEvent;
                    objM87133R10 = new C21860l(function3, 20);
                    c28655q3.m87172p0(objM87133R10);
                } else {
                    function3 = onEvent;
                    objM87133R10 = new C21860l(function3, 20);
                    c28655q3.m87172p0(objM87133R10);
                }
                InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R10;
                boolean zM87157i8 = c28655q3.m87157i(viewState);
                if (i16 == 256) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = zM87157i8 | z28;
                objM87133R11 = c28655q3.m87133R();
                if (z29) {
                    objM87133R11 = new C21214q(viewState, function3, 17);
                    c28655q3.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new C21214q(viewState, function3, 17);
                    c28655q3.m87172p0(objM87133R11);
                }
                c28676v1 = c28676v0;
                c2314t = c2314t4;
                i26 = i16;
                AbstractC6719b.m20143d(modifierM3398t3, aVar5, null, interfaceC4339a4, (InterfaceC4339a) objM87133R11, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 36);
                Modifier modifierM44089m2 = AbstractC15674c.m44089m(c2314t, 0.0f, 1, null);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                c13821r4 = c13821r8;
                Modifier modifierM34108a2 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(modifierM44089m2.mo3471e(new LayoutWeightElement(1.0f, true)), c13821r4, 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q3, i411, 6);
                c28655q4 = c28655q3;
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g2, c2305k, c28655q4, 48);
                iHashCode3 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q4.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q4, modifierM34108a2);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i6, c23010xM66775a5);
                AbstractC28683x.m87239G(c28655q4, c0209i7, interfaceC28653p1M87165m7);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i8, modifierM118962N7);
                AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3411h(f14, c2314t));
                c28655q4.m87150e0(-767561530);
                while (r11.hasNext()) {
                    c28655q4.m87150e0(-767559595);
                    while (r12.hasNext()) {
                        boolean zM87157i9 = c28655q4.m87157i(viewState);
                        i37 = i26;
                        if (i37 == 256) {
                            z38 = true;
                        } else {
                            z38 = false;
                        }
                        zM87157i4 = zM87157i9 | z38 | c28655q4.m87157i(interfaceC25312u);
                        objM87133R14 = c28655q4.m87133R();
                        if (zM87157i4) {
                            interfaceC28601c6 = interfaceC28601c3;
                            c28655q7 = c28655q4;
                            c28676v5 = c28676v1;
                            c1040r = new C1040r((Object) viewState, (Object) onEvent, (Object) interfaceC25312u, interfaceC28601c6, interfaceC28601c4, 19);
                            c28655q7.m87172p0(c1040r);
                        } else {
                            c28676v6 = c28676v1;
                            if (objM87133R14 == c28676v6) {
                                c28676v1 = c28676v6;
                                interfaceC28601c6 = interfaceC28601c3;
                                c28655q7 = c28655q4;
                                c28676v5 = c28676v1;
                                c1040r = new C1040r((Object) viewState, (Object) onEvent, (Object) interfaceC25312u, interfaceC28601c6, interfaceC28601c4, 19);
                                c28655q7.m87172p0(c1040r);
                            } else {
                                c28676v5 = c28676v6;
                                c28655q7 = c28655q4;
                                c1040r = objM87133R14;
                                interfaceC28601c6 = interfaceC28601c3;
                            }
                        }
                        m64641P(interfaceC25312u, (Function1) c1040r, c28655q7, 0, 0);
                        float f17 = 4;
                        AbstractC11266d.m30469w(f17, f17, c2314t, c28655q7);
                        interfaceC28601c3 = interfaceC28601c6;
                        i26 = i37;
                        c28655q4 = c28655q7;
                        c28676v1 = c28676v5;
                    }
                    C28655q c28655q11 = c28655q4;
                    c28655q11.m87173q(false);
                    c28655q4 = c28655q11;
                }
                gVar2 = viewState;
                c28655q5 = c28655q4;
                i27 = i26;
                c28676v2 = c28676v1;
                function4 = onEvent;
                AbstractC18489d0.m53356B(c28655q5, false, c2314t, f14, c28655q5);
                c28655q5.m87173q(true);
                hVarM64382h = gVar2.getStickyFooter();
                if (hVarM64382h == null) {
                    c28655q5.m87150e0(-1675466477);
                    c28655q5.m87173q(false);
                    function1 = function4;
                    c13821r4 = c13821r4;
                    c28655q6 = c28655q5;
                    c21194l3 = c21194l2;
                    z35 = true;
                } else {
                    c28655q5.m87150e0(-1675466476);
                    f15 = 1.0f;
                    Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 2.5d) * f13, 0.0f, 2);
                    WeakHashMap weakHashMap2 = C22944c2.f90553v;
                    Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1099a.m3398t(modifierM3396r2, 0.0f, 0.0f, 0.0f, AbstractC22953f.m66717e(C22949e.m66712e(c28655q5).f90558e, c28655q5).mo43109a(), 7), 0.0f, 1 * f13, 0.0f, 3 * f13, 5);
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), c2305k, c28655q5, 54);
                    iHashCode4 = Long.hashCode(c28655q5.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q5.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q5, modifierM3398t4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q5.m87158i0();
                    if (c28655q5.f115903S) {
                        c28655q5.m87163l(c0213j2);
                    } else {
                        c28655q5.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q5, C0217k.f729g, c23010xM66775a6);
                    AbstractC28683x.m87239G(c28655q5, C0217k.f728f, interfaceC28653p1M87165m8);
                    c0209i2 = C0217k.f732j;
                    if (c28655q5.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q5, iHashCode4, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q5, iHashCode4, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q5, C0217k.f726d, modifierM118962N8);
                    strM64384b = hVarM64382h.getText();
                    if (strM64384b == null) {
                        c28655q5.m87150e0(1458174394);
                        c28655q5.m87173q(false);
                        z34 = false;
                        i35 = i27;
                        c28655q6 = c28655q5;
                        c21194l3 = c21194l2;
                        i29 = 16;
                        i34 = 256;
                        i28 = 15;
                    } else {
                        c28655q5.m87150e0(1458174395);
                        String strM21275i2 = AbstractC8693b.m21275i(strM64384b, c28655q5, 0);
                        C21053l c21053l2 = C21053l.f79834a;
                        C38072d c38072d2 = C38072d.f163053a;
                        int i412 = C38072d.f163054b;
                        i28 = 15;
                        c21194l3 = c21194l2;
                        i29 = 16;
                        i34 = 256;
                        i35 = i27;
                        z34 = false;
                        AbstractC21048g.m58807M(strM21275i2, null, false, c21053l2.m58880a(AbstractC18489d0.m53377r(c38072d2, c28655q5, i412), c38072d2.m121949b(c28655q5, i412).getWhite70(), 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q5, 0, C21053l.f79835b << 15, 32764), null, 0, 0, 0, false, c28655q5, C21054m.f79836p << 9, 502);
                        c28655q6 = c28655q5;
                        c28655q6.m87173q(false);
                    }
                    c28655q6.m87150e0(-645685272);
                    while (r0.hasNext()) {
                        if (interfaceC25312u2 instanceof C27256h) {
                            c28655q6.m87150e0(-203300447);
                            Modifier modifierM3409f2 = AbstractC1102d.m3409f(f15, c2314t);
                            C27256h c27256h2 = (C27256h) interfaceC25312u2;
                            boolean zM87157i10 = c28655q6.m87157i(gVar2);
                            if (i35 == i34) {
                                z37 = true;
                            } else {
                                z37 = z34;
                            }
                            zM87157i3 = c28655q6.m87157i(interfaceC25312u2) | zM87157i10 | z37;
                            objM87133R13 = c28655q6.m87133R();
                            if (zM87157i3) {
                                c28676v4 = c28676v2;
                                if (objM87133R13 == c28676v4) {
                                }
                                InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R13;
                                c2314t2 = c2314t;
                                function5 = function4;
                                i36 = i34;
                                AbstractC27249e.m82121d(modifierM3409f2, c27256h2, null, interfaceC4339a5, c28655q6, 6, 4);
                                c28655q6.m87173q(z34);
                                c28676v3 = c28676v4;
                            } else {
                                c28676v4 = c28676v2;
                            }
                            objM87133R13 = new C18656a0(gVar2, function4, c27256h2, i29);
                            c28655q6.m87172p0(objM87133R13);
                            InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R13;
                            c2314t2 = c2314t;
                            function5 = function4;
                            i36 = i34;
                            AbstractC27249e.m82121d(modifierM3409f2, c27256h2, null, interfaceC4339a6, c28655q6, 6, 4);
                            c28655q6.m87173q(z34);
                            c28676v3 = c28676v4;
                        } else {
                            function5 = function4;
                            c2314t2 = c2314t;
                            i36 = i34;
                            C28676v0 c28676v8 = c28676v2;
                            c28655q6.m87150e0(-202720344);
                            if (i35 == i36) {
                                z36 = true;
                            } else {
                                z36 = z34;
                            }
                            zM87157i2 = z36 | c28655q6.m87157i(interfaceC25312u2);
                            objM87133R12 = c28655q6.m87133R();
                            if (zM87157i2) {
                                objM87133R12 = new C0546j(function5, interfaceC25312u2, i28);
                                c28655q6.m87172p0(objM87133R12);
                            } else {
                                objM87133R12 = new C0546j(function5, interfaceC25312u2, i28);
                                c28655q6.m87172p0(objM87133R12);
                            }
                            c28676v3 = c28676v8;
                            AbstractC25303l.m74291r(interfaceC25312u2, null, null, (Function1) objM87133R12, c28655q6, 0, 6);
                            c28655q6.m87173q(z34);
                        }
                        gVar2 = viewState;
                        function4 = function5;
                        i34 = i36;
                        c2314t = c2314t2;
                        i29 = i29;
                        f15 = f15;
                        c28676v2 = c28676v3;
                    }
                    function1 = function4;
                    c2314t = c2314t;
                    z35 = true;
                    AbstractC25012a.m73392y(c28655q6, z34, true, z34);
                }
                c28655q6.m87173q(z35);
                C28655q c28655q12 = c28655q6;
                AbstractC21189g.m59424b(viewState.getDisplayRefreshingSpinner(), c21194l3, C1100b.f4583a.mo3400a(c2314t, C2299e.f9115x), 0L, 0L, c28655q12, 64);
                c28655q12.m87173q(z35);
                c28655q = c28655q12;
                z15 = z16;
                c13821r1M92099U = c13821r4;
            } else {
                function1 = onEvent;
                c28655q8.m87138X();
                c28655q = c28655q8;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3195g(source, viewState, function1, c13821r1M92099U, z15, i13, i14, 21);
            }
        }
        i39 |= 24576;
        z13 = z4;
        if ((i39 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q8.m87135U(i39 & 1, z14)) {
            c28655q8.m87140Z();
            if ((i13 & 1) != 0) {
                if ((i14 & 8) != 0) {
                    c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q8, 1);
                    i39 &= -7169;
                }
                if (i44 != 0) {
                    C13821r1 c13821r9 = c13821r1M92099U;
                    i15 = i39;
                    c13821r2 = c13821r9;
                    z16 = true;
                } else {
                    C13821r1 c13821r10 = c13821r1M92099U;
                    i15 = i39;
                    c13821r2 = c13821r10;
                    z16 = z13;
                }
            } else {
                if ((i14 & 8) != 0) {
                    c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q8, 1);
                    i39 &= -7169;
                }
                if (i44 != 0) {
                    C13821r1 c13821r11 = c13821r1M92099U;
                    i15 = i39;
                    c13821r2 = c13821r11;
                    z16 = true;
                } else {
                    C13821r1 c13821r12 = c13821r1M92099U;
                    i15 = i39;
                    c13821r2 = c13821r12;
                    z16 = z13;
                }
            }
            c28655q8.m87175r();
            Object[] objArr3 = new Object[0];
            objM87133R = c28655q8.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C22038b(21);
                c28655q8.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr3, (InterfaceC4339a) objM87133R, c28655q8, 48);
            objM87133R2 = c28655q8.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q8.m87172p0(objM87133R2);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            objM87133R3 = c28655q8.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q8.m87172p0(objM87133R3);
            }
            InterfaceC28601c1 interfaceC28601c9 = (InterfaceC28601c1) objM87133R3;
            objM87133R4 = c28655q8.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(null);
                c28655q8.m87172p0(objM87133R4);
            }
            interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
            boolean zM64377c3 = viewState.getDisplayRefreshingSpinner();
            i16 = i15 & 896;
            if (i16 == 256) {
                z17 = true;
            } else {
                z17 = false;
            }
            objM87133R5 = c28655q8.m87133R();
            if (z17) {
                objM87133R5 = new C21860l(onEvent, 19);
                c28655q8.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new C21860l(onEvent, 19);
                c28655q8.m87172p0(objM87133R5);
            }
            interfaceC28601c4 = interfaceC28601c9;
            i17 = i15;
            c21194lM60416V = AbstractC21478l0.m60416V(zM64377c3, (InterfaceC4339a) objM87133R5, 0.0f, c28655q8, 0, 12);
            C22383c.b bVarM64680y3 = m64680y(interfaceC28601c3);
            objM87133R6 = c28655q8.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = new C21937b(5, interfaceC28601c3);
                c28655q8.m87172p0(objM87133R6);
            }
            int i413 = TextResource.$stable;
            int i414 = C27256h.f109055z;
            i18 = i413 | i414 | i414;
            m64651Z(bVarM64680y3, (InterfaceC4339a) objM87133R6, onEvent, c28655q8, i18 | 48 | i16);
            bVarM64376b = viewState.getAttendedAppointmentDialog();
            i19 = 6;
            if (bVarM64376b == null) {
                c28655q8.m87150e0(-963514394);
                c28655q8.m87173q(false);
                c28655q2 = c28655q8;
                interfaceC28601c3 = interfaceC28601c3;
                c21194l = c21194lM60416V;
            } else {
                c28655q8.m87150e0(-963514393);
                if (m64639N(interfaceC28601c4)) {
                    c28655q8.m87150e0(-1016911879);
                    objM87133R7 = c28655q8.m87133R();
                    if (objM87133R7 == c28676v0) {
                        interfaceC28601c5 = interfaceC28601c4;
                        objM87133R7 = new C21937b(i19, interfaceC28601c5);
                        c28655q8.m87172p0(objM87133R7);
                    } else {
                        interfaceC28601c5 = interfaceC28601c4;
                    }
                    interfaceC28601c4 = interfaceC28601c5;
                    c28655q2 = c28655q8;
                    c21194l = c21194lM60416V;
                    m64646U(bVarM64376b, null, (InterfaceC4339a) objM87133R7, onEvent, c28655q2, i18 | 384 | ((i17 << 3) & 7168), 2);
                    z18 = false;
                    c28655q2.m87173q(false);
                } else {
                    c28655q2 = c28655q8;
                    z18 = false;
                    c21194l = c21194lM60416V;
                    c28655q2.m87150e0(-1016703342);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(z18);
            }
            boolean zM87153g3 = c28655q2.m87153g(interfaceC28601c1);
            if (i16 == 256) {
                z19 = true;
            } else {
                z19 = false;
            }
            boolean z311 = zM87153g3 | z19;
            if ((i17 & 14) == 4) {
                z24 = true;
            } else {
                z24 = false;
            }
            zM87157i = z311 | z24 | c28655q2.m87157i(viewState);
            objM87133R8 = c28655q2.m87133R();
            if (zM87157i) {
                c13821r3 = c13821r2;
                a aVar6 = new a(onEvent, source, viewState, interfaceC28601c1, null);
                function2 = onEvent;
                gVar = viewState;
                c28655q2.m87172p0(aVar6);
                objM87133R8 = aVar6;
            } else {
                c13821r3 = c13821r2;
                a aVar7 = new a(onEvent, source, viewState, interfaceC28601c1, null);
                function2 = onEvent;
                gVar = viewState;
                c28655q2.m87172p0(aVar7);
                objM87133R8 = aVar7;
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, gVar);
            if (((i17 & 7168) ^ 3072) <= 2048) {
            }
            if (i16 == 256) {
                z25 = true;
            } else {
                z25 = false;
            }
            z26 = z44 | z25;
            objM87133R9 = c28655q2.m87133R();
            i24 = 15;
            if (z26) {
                objM87133R9 = new C18656a0(c13821r3, function2, interfaceC28601c2, i24);
                c28655q2.m87172p0(objM87133R9);
            } else {
                objM87133R9 = new C18656a0(c13821r3, function2, interfaceC28601c2, i24);
                c28655q2.m87172p0(objM87133R9);
            }
            AbstractC15689q.m44138f(c13821r3, (InterfaceC4339a) objM87133R9, c28655q2, (i17 >> 9) & 14);
            C2314t c2314t5 = C2314t.f9131w;
            Modifier modifierM44028b2 = AbstractC15673b0.m44028b0(AbstractC17269i.m48893g0(AbstractC1102d.m3407d(1.0f, c2314t5), c21194l));
            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifierM44028b2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i9 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC39127r0M66763d3);
            C0209i c0209i10 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i10, interfaceC28653p1M87165m9);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            C0209i c0209i11 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i11, modifierM118962N9);
            AbstractC22989q.m66760a(AbstractC15673b0.m44038g0(AbstractC1102d.m3411h(530, AbstractC1102d.m3409f(1.0f, c2314t5))), c28655q2, 0);
            Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, c2314t5);
            C13404j c13404jM64379e3 = gVar.getScreenContextMetadata();
            int i415 = C13404j.f46947x << 3;
            c21194l2 = c21194l;
            C13821r1 c13821r13 = c13821r3;
            c28655q3 = c28655q2;
            Modifier modifierM66724m3 = AbstractC22953f.m66724m(AbstractC12250f.m34129b(modifierM3407d3, c13404jM64379e3, false, c28655q3, i415 | 6, 2));
            C22957g c22957g3 = AbstractC22977m.f90652c;
            C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g3, C2299e.f9110M, c28655q3, 0);
            iHashCode2 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q3.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q3, modifierM66724m3);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i9, c23010xM66775a7);
            AbstractC28683x.m87239G(c28655q3, c0209i10, interfaceC28653p1M87165m10);
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i11, modifierM118962N10);
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(viewState.getNavigationBar().getNavigationTitle());
            if (z16) {
                r10 = 0;
                i25 = 2;
                c39274g = new C39274g(EnumC16313m0.CARET_BACKWARD.toWhoopIcon(), 0 == true ? 1 : 0, i25, 0 == true ? 1 : 0);
            } else {
                r10 = 0;
                i25 = 2;
                c39274g = null;
            }
            fVarM64371a = viewState.getNavigationBar().getNavigationRightButton();
            if (fVarM64371a != null) {
                c39274g2 = null;
            } else {
                c39274g2 = null;
            }
            AbstractC6721d.a aVar8 = new AbstractC6721d.a(textResourceM21278l3, null, c39274g, c39274g2, null, null, false, null, null, null, null, null, null, null, null, 32754, null);
            f13 = 8;
            f14 = 2 * f13;
            Modifier modifierM3398t5 = AbstractC1099a.m3398t(c2314t5, 0.0f, f14, 0.0f, 0.0f, 13);
            if (i16 == 256) {
                z27 = true;
            } else {
                z27 = false;
            }
            objM87133R10 = c28655q3.m87133R();
            if (z27) {
                function3 = onEvent;
                objM87133R10 = new C21860l(function3, 20);
                c28655q3.m87172p0(objM87133R10);
            } else {
                function3 = onEvent;
                objM87133R10 = new C21860l(function3, 20);
                c28655q3.m87172p0(objM87133R10);
            }
            InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R10;
            boolean zM87157i11 = c28655q3.m87157i(viewState);
            if (i16 == 256) {
                z28 = true;
            } else {
                z28 = false;
            }
            z29 = zM87157i11 | z28;
            objM87133R11 = c28655q3.m87133R();
            if (z29) {
                objM87133R11 = new C21214q(viewState, function3, 17);
                c28655q3.m87172p0(objM87133R11);
            } else {
                objM87133R11 = new C21214q(viewState, function3, 17);
                c28655q3.m87172p0(objM87133R11);
            }
            c28676v1 = c28676v0;
            c2314t = c2314t5;
            i26 = i16;
            AbstractC6719b.m20143d(modifierM3398t5, aVar8, null, interfaceC4339a7, (InterfaceC4339a) objM87133R11, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 36);
            Modifier modifierM44089m3 = AbstractC15674c.m44089m(c2314t, 0.0f, 1, null);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            c13821r4 = c13821r13;
            Modifier modifierM34108a3 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(modifierM44089m3.mo3471e(new LayoutWeightElement(1.0f, true)), c13821r4, 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q3, i415, 6);
            c28655q4 = c28655q3;
            C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g3, c2305k, c28655q4, 48);
            iHashCode3 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q4.m87165m();
            Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q4, modifierM34108a3);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i9, c23010xM66775a8);
            AbstractC28683x.m87239G(c28655q4, c0209i10, interfaceC28653p1M87165m11);
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i11, modifierM118962N11);
            AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3411h(f14, c2314t));
            c28655q4.m87150e0(-767561530);
            while (r11.hasNext()) {
                c28655q4.m87150e0(-767559595);
                while (r12.hasNext()) {
                    boolean zM87157i12 = c28655q4.m87157i(viewState);
                    i37 = i26;
                    if (i37 == 256) {
                        z38 = true;
                    } else {
                        z38 = false;
                    }
                    zM87157i4 = zM87157i12 | z38 | c28655q4.m87157i(interfaceC25312u);
                    objM87133R14 = c28655q4.m87133R();
                    if (zM87157i4) {
                        interfaceC28601c6 = interfaceC28601c3;
                        c28655q7 = c28655q4;
                        c28676v5 = c28676v1;
                        c1040r = new C1040r((Object) viewState, (Object) onEvent, (Object) interfaceC25312u, interfaceC28601c6, interfaceC28601c4, 19);
                        c28655q7.m87172p0(c1040r);
                    } else {
                        c28676v6 = c28676v1;
                        if (objM87133R14 == c28676v6) {
                            c28676v1 = c28676v6;
                            interfaceC28601c6 = interfaceC28601c3;
                            c28655q7 = c28655q4;
                            c28676v5 = c28676v1;
                            c1040r = new C1040r((Object) viewState, (Object) onEvent, (Object) interfaceC25312u, interfaceC28601c6, interfaceC28601c4, 19);
                            c28655q7.m87172p0(c1040r);
                        } else {
                            c28676v5 = c28676v6;
                            c28655q7 = c28655q4;
                            c1040r = objM87133R14;
                            interfaceC28601c6 = interfaceC28601c3;
                        }
                    }
                    m64641P(interfaceC25312u, (Function1) c1040r, c28655q7, 0, 0);
                    float f18 = 4;
                    AbstractC11266d.m30469w(f18, f18, c2314t, c28655q7);
                    interfaceC28601c3 = interfaceC28601c6;
                    i26 = i37;
                    c28655q4 = c28655q7;
                    c28676v1 = c28676v5;
                }
                C28655q c28655q13 = c28655q4;
                c28655q13.m87173q(false);
                c28655q4 = c28655q13;
            }
            gVar2 = viewState;
            c28655q5 = c28655q4;
            i27 = i26;
            c28676v2 = c28676v1;
            function4 = onEvent;
            AbstractC18489d0.m53356B(c28655q5, false, c2314t, f14, c28655q5);
            c28655q5.m87173q(true);
            hVarM64382h = gVar2.getStickyFooter();
            if (hVarM64382h == null) {
                c28655q5.m87150e0(-1675466477);
                c28655q5.m87173q(false);
                function1 = function4;
                c13821r4 = c13821r4;
                c28655q6 = c28655q5;
                c21194l3 = c21194l2;
                z35 = true;
            } else {
                c28655q5.m87150e0(-1675466476);
                f15 = 1.0f;
                Modifier modifierM3396r3 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 2.5d) * f13, 0.0f, 2);
                WeakHashMap weakHashMap3 = C22944c2.f90553v;
                Modifier modifierM3398t6 = AbstractC1099a.m3398t(AbstractC1099a.m3398t(modifierM3396r3, 0.0f, 0.0f, 0.0f, AbstractC22953f.m66717e(C22949e.m66712e(c28655q5).f90558e, c28655q5).mo43109a(), 7), 0.0f, 1 * f13, 0.0f, 3 * f13, 5);
                C23010x c23010xM66775a9 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), c2305k, c28655q5, 54);
                iHashCode4 = Long.hashCode(c28655q5.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q5.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q5, modifierM3398t6);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q5.m87158i0();
                if (c28655q5.f115903S) {
                    c28655q5.m87163l(c0213j2);
                } else {
                    c28655q5.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q5, C0217k.f729g, c23010xM66775a9);
                AbstractC28683x.m87239G(c28655q5, C0217k.f728f, interfaceC28653p1M87165m12);
                c0209i2 = C0217k.f732j;
                if (c28655q5.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q5, iHashCode4, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q5, iHashCode4, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q5, C0217k.f726d, modifierM118962N12);
                strM64384b = hVarM64382h.getText();
                if (strM64384b == null) {
                    c28655q5.m87150e0(1458174394);
                    c28655q5.m87173q(false);
                    z34 = false;
                    i35 = i27;
                    c28655q6 = c28655q5;
                    c21194l3 = c21194l2;
                    i29 = 16;
                    i34 = 256;
                    i28 = 15;
                } else {
                    c28655q5.m87150e0(1458174395);
                    String strM21275i3 = AbstractC8693b.m21275i(strM64384b, c28655q5, 0);
                    C21053l c21053l3 = C21053l.f79834a;
                    C38072d c38072d3 = C38072d.f163053a;
                    int i416 = C38072d.f163054b;
                    i28 = 15;
                    c21194l3 = c21194l2;
                    i29 = 16;
                    i34 = 256;
                    i35 = i27;
                    z34 = false;
                    AbstractC21048g.m58807M(strM21275i3, null, false, c21053l3.m58880a(AbstractC18489d0.m53377r(c38072d3, c28655q5, i416), c38072d3.m121949b(c28655q5, i416).getWhite70(), 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q5, 0, C21053l.f79835b << 15, 32764), null, 0, 0, 0, false, c28655q5, C21054m.f79836p << 9, 502);
                    c28655q6 = c28655q5;
                    c28655q6.m87173q(false);
                }
                c28655q6.m87150e0(-645685272);
                while (r0.hasNext()) {
                    if (interfaceC25312u2 instanceof C27256h) {
                        c28655q6.m87150e0(-203300447);
                        Modifier modifierM3409f3 = AbstractC1102d.m3409f(f15, c2314t);
                        C27256h c27256h3 = (C27256h) interfaceC25312u2;
                        boolean zM87157i13 = c28655q6.m87157i(gVar2);
                        if (i35 == i34) {
                            z37 = true;
                        } else {
                            z37 = z34;
                        }
                        zM87157i3 = c28655q6.m87157i(interfaceC25312u2) | zM87157i13 | z37;
                        objM87133R13 = c28655q6.m87133R();
                        if (zM87157i3) {
                            c28676v4 = c28676v2;
                            if (objM87133R13 == c28676v4) {
                            }
                            InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R13;
                            c2314t2 = c2314t;
                            function5 = function4;
                            i36 = i34;
                            AbstractC27249e.m82121d(modifierM3409f3, c27256h3, null, interfaceC4339a8, c28655q6, 6, 4);
                            c28655q6.m87173q(z34);
                            c28676v3 = c28676v4;
                        } else {
                            c28676v4 = c28676v2;
                        }
                        objM87133R13 = new C18656a0(gVar2, function4, c27256h3, i29);
                        c28655q6.m87172p0(objM87133R13);
                        InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R13;
                        c2314t2 = c2314t;
                        function5 = function4;
                        i36 = i34;
                        AbstractC27249e.m82121d(modifierM3409f3, c27256h3, null, interfaceC4339a9, c28655q6, 6, 4);
                        c28655q6.m87173q(z34);
                        c28676v3 = c28676v4;
                    } else {
                        function5 = function4;
                        c2314t2 = c2314t;
                        i36 = i34;
                        C28676v0 c28676v9 = c28676v2;
                        c28655q6.m87150e0(-202720344);
                        if (i35 == i36) {
                            z36 = true;
                        } else {
                            z36 = z34;
                        }
                        zM87157i2 = z36 | c28655q6.m87157i(interfaceC25312u2);
                        objM87133R12 = c28655q6.m87133R();
                        if (zM87157i2) {
                            objM87133R12 = new C0546j(function5, interfaceC25312u2, i28);
                            c28655q6.m87172p0(objM87133R12);
                        } else {
                            objM87133R12 = new C0546j(function5, interfaceC25312u2, i28);
                            c28655q6.m87172p0(objM87133R12);
                        }
                        c28676v3 = c28676v9;
                        AbstractC25303l.m74291r(interfaceC25312u2, null, null, (Function1) objM87133R12, c28655q6, 0, 6);
                        c28655q6.m87173q(z34);
                    }
                    gVar2 = viewState;
                    function4 = function5;
                    i34 = i36;
                    c2314t = c2314t2;
                    i29 = i29;
                    f15 = f15;
                    c28676v2 = c28676v3;
                }
                function1 = function4;
                c2314t = c2314t;
                z35 = true;
                AbstractC25012a.m73392y(c28655q6, z34, true, z34);
            }
            c28655q6.m87173q(z35);
            C28655q c28655q14 = c28655q6;
            AbstractC21189g.m59424b(viewState.getDisplayRefreshingSpinner(), c21194l3, C1100b.f4583a.mo3400a(c2314t, C2299e.f9115x), 0L, 0L, c28655q14, 64);
            c28655q14.m87173q(z35);
            c28655q = c28655q14;
            z15 = z16;
            c13821r1M92099U = c13821r4;
        } else {
            function1 = onEvent;
            c28655q8.m87138X();
            c28655q = c28655q8;
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3195g(source, viewState, function1, c13821r1M92099U, z15, i13, i14, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final InterfaceC28601c1 m64678w() {
        return AbstractC28683x.m87272z(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final boolean m64679x(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: y */
    private static final C22383c.b m64680y(InterfaceC28601c1 interfaceC28601c1) {
        return (C22383c.b) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: z */
    private static final void m64681z(InterfaceC28601c1 interfaceC28601c1, C22383c.b bVar) {
        interfaceC28601c1.setValue(bVar);
    }
}
