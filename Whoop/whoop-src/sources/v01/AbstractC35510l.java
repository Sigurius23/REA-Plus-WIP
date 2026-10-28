package v01;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.InterfaceC1583f2;
import b03.C2205b;
import bc3.InterfaceC2994c0;
import c41.C4048j0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.whoopaction.domain.models.Action;
import cp0.C10965i;
import e31.AbstractC12610b;
import e31.C12611c;
import e31.C12612d;
import ec3.InterfaceC13037f2;
import ge3.AbstractC15751g;
import gy0.AbstractC16276e;
import gy0.AbstractC16277f;
import l83.C23454a0;
import ld1.AbstractC23864c;
import ld1.AbstractC23865d;
import ld1.C23863b;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27249e;
import ny0.C27256h;
import ny0.EnumC27254g;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p127ev.AbstractC13673n;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p323m8.AbstractC25218a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25306o;
import p720m91.InterfaceC25312u;
import p734sl0.C32632k2;
import p736sz0.AbstractC33220t0;
import q81.C30048f;
import q83.InterfaceC30057d;
import qx0.C30745a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import s90.C32290f;
import sc0.C32355c;
import t01.C33259e;
import u01.C34383e;
import uf0.C34904e;
import uf3.C34911a;
import uk2.C35051a;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: v01.l */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\u001a5\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aA\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001aA\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a5\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00122\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a'\u0010\u001f\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a\u000f\u0010!\u001a\u00020\u0006H\u0003¢\u0006\u0004\b!\u0010\"¨\u0006#²\u0006\f\u0010\u0016\u001a\u00020\u00128\nX\u008a\u0084\u0002"}, m65681d2 = {"Lny0/h;", "state", "Lcom/whoop/analytics/AnalyticEventModel;", "primaryAnalyticEvent", "Lkotlin/Function1;", "", "Ll83/a0;", "onEvent", "L", "(Lny0/h;Lcom/whoop/analytics/AnalyticEventModel;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "J", "(Lny0/h;Lcom/whoop/analytics/AnalyticEventModel;Lkotlin/jvm/functions/Function1;)Lc93/a;", "Landroidx/compose/ui/Modifier;", "modifier", "Lv01/m;", "itemState", "onViewEvent", "Lv01/g;", "defaultViewState", "z", "(Landroidx/compose/ui/Modifier;Lv01/m;Lkotlin/jvm/functions/Function1;Lv01/g;Landroidx/compose/runtime/Composer;II)V", "viewState", "", "path", "p", "(Landroidx/compose/ui/Modifier;Lv01/g;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "u", "(Landroidx/compose/ui/Modifier;Lv01/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "error", "onDismiss", "F", "(Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "H", "(Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35510l {

    /* JADX INFO: renamed from: v01.l$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.communityfollowercontainer.CommunityFollowerContainerWrapperKt$CommunityFollowerContainerWrapper$2$1", m100430f = "CommunityFollowerContainerWrapper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f151121w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC23864c<C35505g, AbstractC35503e> f151122x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C35511m f151123y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC23864c<C35505g, AbstractC35503e> abstractC23864c, C35511m c35511m, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f151122x = abstractC23864c;
            this.f151123y = c35511m;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f151122x, this.f151123y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f151121w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f151122x.mo1216g(new AbstractC35503e.d(this.f151123y.getPath()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: v01.l$b */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.communityfollowercontainer.CommunityFollowerContainerWrapperKt$ErrorToastEffect$1$1", m100430f = "CommunityFollowerContainerWrapper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f151124w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Context f151125x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f151126y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f151125x = context;
            this.f151126y = interfaceC4339a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f151125x, this.f151126y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f151124w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Context context = this.f151125x;
            Toast.makeText(context, context.getString(AbstractC16277f.f62281T), 1).show();
            this.f151126y.invoke();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m112625A(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C34911a m112626B(C35511m c35511m) {
        return AbstractC15751g.m44431K(c35511m.getRefreshScope());
    }

    /* JADX INFO: renamed from: C */
    private static final C35505g m112627C(InterfaceC28670t2 interfaceC28670t2) {
        return (C35505g) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m112628D(AbstractC23864c abstractC23864c, Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC35503e) {
            abstractC23864c.mo1216g(event);
        } else {
            function1.invoke(event);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m112629E(Modifier modifier, C35511m c35511m, Function1 function1, C35505g c35505g, int i13, int i14, Composer composer, int i15) {
        m112662z(modifier, c35511m, function1, c35505g, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: F */
    private static final void m112630F(String str, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1190288553);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            if (str != null) {
                c28655q.m87150e0(636417407);
                boolean zM87157i = c28655q.m87157i(context) | ((i14 & 112) == 32);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new b(context, interfaceC4339a, null);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, str);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(636657657);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C10965i(str, interfaceC4339a, i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m112631G(String str, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m112630F(str, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: H */
    private static final void m112632H(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-113983058);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, EnumC27254g.COMPACT.getVerticalPadding(), 1);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            float f13 = 4;
            AbstractC35684p.m113047h(AbstractC1102d.m3419p(f13 * f13, c2314t), InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d)), false, 0.0f, 0, null, null, null, null, c28655q, 6, 508);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30048f(i13, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m112633I(int i13, Composer composer, int i14) {
        m112632H(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: J */
    public static final InterfaceC4339a m112634J(C27256h state, AnalyticEventModel analyticEventModel, Function1 onEvent) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        return new C35508j(state, analyticEventModel, onEvent, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m112635K(C27256h c27256h, AnalyticEventModel analyticEventModel, Function1 function1) {
        m112636L(c27256h, analyticEventModel, function1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: L */
    public static final void m112636L(C27256h state, AnalyticEventModel analyticEventModel, Function1 onEvent) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        Action action = state.getAction();
        if (action != null) {
            if (analyticEventModel != null) {
                AbstractC13673n.m38578y(null, analyticEventModel, onEvent);
            }
            onEvent.invoke(new AbstractC35503e.e(action));
        } else if (analyticEventModel != null) {
            onEvent.invoke(new DesignItemInteraction(state, analyticEventModel));
        } else {
            onEvent.invoke(state);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018b  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:75:0x010e  */
    /* JADX WARN: Code duplicated, block: B:77:0x011c  */
    /* JADX WARN: Code duplicated, block: B:80:0x012a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0145  */
    /* JADX WARN: Code duplicated, block: B:85:0x014b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0159  */
    /* JADX WARN: Code duplicated, block: B:88:0x015b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0162  */
    /* JADX WARN: Code duplicated, block: B:92:0x0164  */
    /* JADX WARN: Code duplicated, block: B:95:0x016c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:96:0x016e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0185  */
    /* JADX INFO: renamed from: p */
    public static final void m112652p(Modifier modifier, C35505g viewState, String str, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        String str2;
        int i16;
        Function1 function2;
        int i17;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        String str3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        C28676v0 c28676v0;
        Function1 function4;
        int i18;
        boolean z13;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Function1 function5;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1157577953);
        int i19 = i14 & 1;
        if (i19 != 0) {
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
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                str2 = str;
                i15 |= c28655q.m87153g(str2) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i17 = 2048;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i19 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i24 != 0) {
                        str2 = "";
                    } else {
                        str2 = str2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C35509k(0);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function4 = (Function1) objM87133R3;
                    } else {
                        function4 = function2;
                    }
                    String strM112615d = viewState.getLoadMoreError();
                    i18 = i15 & 7168;
                    if (i18 == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13 || objM87133R == c28676v0) {
                        objM87133R = new C34904e(function4, 7);
                        c28655q.m87172p0(objM87133R);
                    }
                    m112630F(strM112615d, (InterfaceC4339a) objM87133R, c28655q, 0);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    if (viewState.getIsLoading()) {
                        c28655q.m87150e0(-1480322415);
                        AbstractC12610b.m35349f(C12612d.f43056a.m35366a(), null, null, c28655q, 6, 6);
                        c28655q.m87173q(false);
                    } else if (viewState.getIsError()) {
                        c28655q.m87150e0(-1480317797);
                        C12611c c12611cM35368c = C12612d.f43056a.m35368c();
                        if (i18 == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i15 & 896) == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z15 | z14;
                        objM87133R2 = c28655q.m87133R();
                        if (z16 || objM87133R2 == c28676v0) {
                            objM87133R2 = new C4048j0(function4, str2, 13);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC12610b.m35349f(c12611cM35368c, null, (InterfaceC4339a) objM87133R2, c28655q, 6, 2);
                        c28655q.m87173q(false);
                    } else {
                        if (viewState.getHeader() == null || !viewState.m112614c().isEmpty()) {
                            c28655q.m87150e0(-1480308736);
                            function5 = function4;
                            m112657u(null, viewState, function5, c28655q, (i15 & 112) | ((i15 >> 3) & 896), 1);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1355195643);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        function3 = function5;
                        modifier3 = modifier4;
                    }
                    function5 = function4;
                    c28655q.m87173q(true);
                    function3 = function5;
                    modifier3 = modifier4;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    function3 = function2;
                }
                str3 = str2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32632k2(modifier3, viewState, str3, function3, i13, i14, 12);
                }
            }
            i15 |= 3072;
            function2 = function1;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i19 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i24 != 0) {
                    str2 = "";
                } else {
                    str2 = str2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C35509k(0);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                String strM112615d2 = viewState.getLoadMoreError();
                i18 = i15 & 7168;
                if (i18 == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C34904e(function4, 7);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C34904e(function4, 7);
                    c28655q.m87172p0(objM87133R);
                }
                m112630F(strM112615d2, (InterfaceC4339a) objM87133R, c28655q, 0);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier4);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                if (viewState.getIsLoading()) {
                    c28655q.m87150e0(-1480322415);
                    AbstractC12610b.m35349f(C12612d.f43056a.m35366a(), null, null, c28655q, 6, 6);
                    c28655q.m87173q(false);
                } else if (viewState.getIsError()) {
                    c28655q.m87150e0(-1480317797);
                    C12611c c12611cM35368c2 = C12612d.f43056a.m35368c();
                    if (i18 == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i15 & 896) == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z15 | z14;
                    objM87133R2 = c28655q.m87133R();
                    if (z16) {
                        objM87133R2 = new C4048j0(function4, str2, 13);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C4048j0(function4, str2, 13);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC12610b.m35349f(c12611cM35368c2, null, (InterfaceC4339a) objM87133R2, c28655q, 6, 2);
                    c28655q.m87173q(false);
                } else {
                    if (viewState.getHeader() == null) {
                    }
                    c28655q.m87150e0(-1480308736);
                    function5 = function4;
                    m112657u(null, viewState, function5, c28655q, (i15 & 112) | ((i15 >> 3) & 896), 1);
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    function3 = function5;
                    modifier3 = modifier4;
                }
                function5 = function4;
                c28655q.m87173q(true);
                function3 = function5;
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            str3 = str2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(modifier3, viewState, str3, function3, i13, i14, 12);
            }
        }
        i15 |= 384;
        str2 = str;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
                    i17 = 2048;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i19 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i24 != 0) {
                    str2 = "";
                } else {
                    str2 = str2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C35509k(0);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                String strM112615d3 = viewState.getLoadMoreError();
                i18 = i15 & 7168;
                if (i18 == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C34904e(function4, 7);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C34904e(function4, 7);
                    c28655q.m87172p0(objM87133R);
                }
                m112630F(strM112615d3, (InterfaceC4339a) objM87133R, c28655q, 0);
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, modifier4);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                if (viewState.getIsLoading()) {
                    c28655q.m87150e0(-1480322415);
                    AbstractC12610b.m35349f(C12612d.f43056a.m35366a(), null, null, c28655q, 6, 6);
                    c28655q.m87173q(false);
                } else if (viewState.getIsError()) {
                    c28655q.m87150e0(-1480317797);
                    C12611c c12611cM35368c3 = C12612d.f43056a.m35368c();
                    if (i18 == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i15 & 896) == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z15 | z14;
                    objM87133R2 = c28655q.m87133R();
                    if (z16) {
                        objM87133R2 = new C4048j0(function4, str2, 13);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C4048j0(function4, str2, 13);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC12610b.m35349f(c12611cM35368c3, null, (InterfaceC4339a) objM87133R2, c28655q, 6, 2);
                    c28655q.m87173q(false);
                } else {
                    if (viewState.getHeader() == null) {
                    }
                    c28655q.m87150e0(-1480308736);
                    function5 = function4;
                    m112657u(null, viewState, function5, c28655q, (i15 & 112) | ((i15 >> 3) & 896), 1);
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    function3 = function5;
                    modifier3 = modifier4;
                }
                function5 = function4;
                c28655q.m87173q(true);
                function3 = function5;
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            str3 = str2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(modifier3, viewState, str3, function3, i13, i14, 12);
            }
        }
        i15 |= 3072;
        function2 = function1;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i19 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            if (i24 != 0) {
                str2 = "";
            } else {
                str2 = str2;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C35509k(0);
                    c28655q.m87172p0(objM87133R3);
                }
                function4 = (Function1) objM87133R3;
            } else {
                function4 = function2;
            }
            String strM112615d4 = viewState.getLoadMoreError();
            i18 = i15 & 7168;
            if (i18 == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                objM87133R = new C34904e(function4, 7);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C34904e(function4, 7);
                c28655q.m87172p0(objM87133R);
            }
            m112630F(strM112615d4, (InterfaceC4339a) objM87133R, c28655q, 0);
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, modifier4);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            if (viewState.getIsLoading()) {
                c28655q.m87150e0(-1480322415);
                AbstractC12610b.m35349f(C12612d.f43056a.m35366a(), null, null, c28655q, 6, 6);
                c28655q.m87173q(false);
            } else if (viewState.getIsError()) {
                c28655q.m87150e0(-1480317797);
                C12611c c12611cM35368c4 = C12612d.f43056a.m35368c();
                if (i18 == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i15 & 896) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z15 | z14;
                objM87133R2 = c28655q.m87133R();
                if (z16) {
                    objM87133R2 = new C4048j0(function4, str2, 13);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C4048j0(function4, str2, 13);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC12610b.m35349f(c12611cM35368c4, null, (InterfaceC4339a) objM87133R2, c28655q, 6, 2);
                c28655q.m87173q(false);
            } else {
                if (viewState.getHeader() == null) {
                }
                c28655q.m87150e0(-1480308736);
                function5 = function4;
                m112657u(null, viewState, function5, c28655q, (i15 & 112) | ((i15 >> 3) & 896), 1);
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                function3 = function5;
                modifier3 = modifier4;
            }
            function5 = function4;
            c28655q.m87173q(true);
            function3 = function5;
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        str3 = str2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32632k2(modifier3, viewState, str3, function3, i13, i14, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m112653q(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m112654r(Function1 function1) {
        function1.invoke(AbstractC35503e.b.f151101a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m112655s(Function1 function1, String str) {
        function1.invoke(new AbstractC35503e.d(str));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m112656t(Modifier modifier, C35505g c35505g, String str, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m112652p(modifier, c35505g, str, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    private static final void m112657u(Modifier modifier, C35505g c35505g, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        Function1 function2 = function1;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1663812657);
        int i16 = i14 & 1;
        if (i16 != 0) {
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
            i15 |= c28655q.m87157i(c35505g) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function2) ? 256 : 128;
        }
        int i17 = i15;
        if (c28655q.m87135U(i17 & 1, (i17 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            modifier3 = i16 != 0 ? c2314t : modifier2;
            int i18 = (i17 >> 3) & 112;
            AbstractC33220t0.m105391c(c35505g.getSectionViewAnalyticEvent(), function2, c28655q, i18);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier3);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * 8), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            C25306o c25306oM112613b = c35505g.getHeader();
            if (c25306oM112613b == null) {
                c28655q.m87150e0(-63449989);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-63449988);
                C30745a c30745a = new C30745a(24);
                boolean zM87157i = c28655q.m87157i(c35505g) | c28655q.m87157i(c25306oM112613b) | ((i17 & 896) == 256);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C32290f((Object) c35505g, (Object) c25306oM112613b, function2, 20);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC25303l.m74290q(c25306oM112613b, null, c30745a, (Function1) objM87133R, c28655q, 0, 2);
                c28655q.m87173q(false);
            }
            c28655q.m87150e0(-140574497);
            int i19 = 0;
            for (Object obj : c35505g.m112614c()) {
                int i24 = i19 + 1;
                if (i19 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C25306o c25306o = (C25306o) obj;
                Object objM74316c = c25306o.m74316c();
                if (objM74316c == null) {
                    objM74316c = Integer.valueOf(i19);
                }
                c28655q.m87144b0(972203624, objM74316c);
                InterfaceC25312u interfaceC25312uM74318e = c25306o.getState();
                if (interfaceC25312uM74318e instanceof C27256h) {
                    c28655q.m87150e0(972206977);
                    if (c35505g.getIsLoadingMore()) {
                        c28655q.m87150e0(972208474);
                        m112632H(c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(972210365);
                        C27256h c27256h = (C27256h) interfaceC25312uM74318e;
                        AbstractC27249e.m82121d(AbstractC1102d.m3409f(1.0f, c2314t), c27256h, null, m112634J(c27256h, c25306o.getPrimaryAnalyticEvent(), function2), c28655q, 6, 4);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                } else if (interfaceC25312uM74318e instanceof C34383e) {
                    c28655q.m87150e0(74070661);
                    C28655q c28655q2 = c28655q;
                    AbstractC25303l.m74290q(c25306o, null, new C30745a(23), function1, c28655q2, (i17 << 3) & 7168, 2);
                    function2 = function1;
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(972229291);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
                i19 = i24;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            if (!c35505g.getIsFilterSheetVisible() || c35505g.getFilterBottomSheet() == null) {
                c28655q.m87150e0(1576814387);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1576683691);
                AbstractC35501c.m112595q(c35505g.getFilterBottomSheet(), function2, c28655q, i18, 0);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33259e(modifier3, c35505g, function2, i13, i14, 27);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final Modifier m112658v(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1085491877);
        c28655q.m87173q(false);
        return C2314t.f9131w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m112659w(C35505g c35505g, C25306o c25306o, Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (c35505g.getFilterBottomSheet() != null) {
            AnalyticEventModel analyticEventModelM74317d = c25306o.getPrimaryAnalyticEvent();
            if (analyticEventModelM74317d != null) {
                AbstractC13673n.m38578y(null, analyticEventModelM74317d, function1);
            }
            function1.invoke(AbstractC35503e.f.f151105a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final Modifier m112660x(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-2101315287);
        c28655q.m87173q(false);
        return C2314t.f9131w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m112661y(Modifier modifier, C35505g c35505g, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m112657u(modifier, c35505g, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:114:0x0200  */
    /* JADX WARN: Code duplicated, block: B:115:0x0205  */
    /* JADX WARN: Code duplicated, block: B:118:0x0211  */
    /* JADX WARN: Code duplicated, block: B:120:0x0217  */
    /* JADX WARN: Code duplicated, block: B:126:0x022a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:129:0x0230  */
    /* JADX WARN: Code duplicated, block: B:133:0x024e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0252  */
    /* JADX WARN: Code duplicated, block: B:136:0x0255  */
    /* JADX WARN: Code duplicated, block: B:137:0x025a  */
    /* JADX WARN: Code duplicated, block: B:139:0x025d  */
    /* JADX WARN: Code duplicated, block: B:140:0x0269  */
    /* JADX WARN: Code duplicated, block: B:142:0x0279  */
    /* JADX WARN: Code duplicated, block: B:144:0x0298  */
    /* JADX WARN: Code duplicated, block: B:147:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:148:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:151:0x02b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:155:0x02da  */
    /* JADX WARN: Code duplicated, block: B:158:0x02e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:159:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:161:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:164:0x0309  */
    /* JADX WARN: Code duplicated, block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a6 A[PHI: r0 r3 r4
      0x00a6: PHI (r0v8 androidx.compose.ui.Modifier) = (r0v5 androidx.compose.ui.Modifier), (r0v10 androidx.compose.ui.Modifier) binds: [B:68:0x00c6, B:56:0x00a4] A[DONT_GENERATE, DONT_INLINE]
      0x00a6: PHI (r3v13 kotlin.jvm.functions.Function1) = (r3v7 kotlin.jvm.functions.Function1), (r3v14 kotlin.jvm.functions.Function1) binds: [B:68:0x00c6, B:56:0x00a4] A[DONT_GENERATE, DONT_INLINE]
      0x00a6: PHI (r4v16 int) = (r4v10 int), (r4v17 int) binds: [B:68:0x00c6, B:56:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:80:0x0123  */
    /* JADX WARN: Code duplicated, block: B:82:0x012f  */
    /* JADX WARN: Code duplicated, block: B:83:0x013a  */
    /* JADX WARN: Code duplicated, block: B:85:0x015f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0165  */
    /* JADX WARN: Code duplicated, block: B:93:0x0178 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x017a  */
    /* JADX WARN: Code duplicated, block: B:97:0x019a  */
    /* JADX WARN: Code duplicated, block: B:99:0x01aa  */
    /* JADX INFO: renamed from: z */
    public static final void m112662z(Modifier modifier, C35511m itemState, Function1 function1, C35505g c35505g, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        C35505g c35505g2;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C35505g c35505g3;
        C28677v1 c28677v1M87180u;
        int i16;
        C28676v0 c28676v0;
        Modifier modifier4;
        C35505g c35505g4;
        Object objM87133R;
        int i17;
        boolean z13;
        Object objM87133R2;
        InterfaceC4339a interfaceC4339a;
        int i18;
        InterfaceC1583f2 interfaceC1583f2M30452f;
        Context applicationContext;
        Application application;
        boolean zM87153g;
        Object objM87133R3;
        C35505g c35505g5;
        AbstractC23864c abstractC23864c;
        AbstractC35504f abstractC35504f;
        InterfaceC13037f2 viewState;
        InterfaceC28601c1 interfaceC28601c1M87261o;
        int i19;
        C28676v0 c28676v1;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R4;
        boolean z17;
        Object objM87133R5;
        InterfaceC1583f2 interfaceC1583f2M73844a;
        Application application2;
        boolean zM87153g2;
        Object objM87133R6;
        boolean z18;
        boolean zM87153g3;
        Object objM87133R7;
        int i24;
        AbstractC22676k.m65750j(itemState, "itemState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-664039470);
        int i25 = i14 & 1;
        if (i25 != 0) {
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
            i15 |= c28655q.m87153g(itemState) ? 32 : 16;
        }
        int i26 = i14 & 4;
        if (i26 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if ((i14 & 8) == 0) {
                    c35505g2 = c35505g;
                    if (c28655q.m87157i(c35505g2)) {
                        i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i15 |= i24;
                } else {
                    c35505g2 = c35505g;
                }
                i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                i15 |= i24;
            } else {
                c35505g2 = c35505g;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                i16 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i16 != 0 || c28655q.m87118C()) {
                    if (i25 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i26 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C35051a(29);
                            c28655q.m87172p0(objM87133R);
                        }
                        function3 = (Function1) objM87133R;
                    } else {
                        function3 = function2;
                    }
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                        c35505g4 = new C35505g(true, false, false, null, null, null, null, null, null, false, 1022, null);
                    }
                    c28655q.m87175r();
                    i17 = i15 & 112;
                    if (i17 == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z13 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C32355c(itemState, 24);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a = (InterfaceC4339a) objM87133R2;
                    i18 = i15 >> 9;
                    c28655q.m87150e0(1371609227);
                    if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                        interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                        applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                        } else {
                            application = null;
                        }
                        zM87153g = ((((i18 & 14) ^ 6) <= 4 && c28655q.m87153g(c35505g4)) || (i18 & 6) == 4) | c28655q.m87153g(null) | c28655q.m87153g(interfaceC4339a);
                        objM87133R3 = c28655q.m87133R();
                        if (!zM87153g || objM87133R3 == c28676v0) {
                            c35505g5 = c35505g4;
                            objM87133R3 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c35505g5, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC35504f.class), interfaceC4339a, null);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            c35505g5 = c35505g4;
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R3;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-707976188);
                        interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                        if (interfaceC1583f2M73844a == null) {
                            c28655q.m87150e0(-707931115);
                            c28655q.m87173q(false);
                            abstractC23864c = null;
                        } else {
                            c28655q.m87150e0(-707931114);
                            Context applicationContext2 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                            AbstractC22676k.m65748h(applicationContext2, "null cannot be cast to non-null type android.app.Application");
                            application2 = (Application) applicationContext2;
                            zM87153g2 = c28655q.m87153g(null) | ((((i18 & 14) ^ 6) <= 4 && c28655q.m87153g(c35505g4)) || (i18 & 6) == 4) | c28655q.m87153g(interfaceC4339a);
                            objM87133R6 = c28655q.m87133R();
                            if (zM87153g2 || objM87133R6 == c28676v0) {
                                objM87133R6 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC35504f.class), interfaceC4339a, new C23863b(c35505g4), null);
                                c28655q.m87172p0(objM87133R6);
                            }
                            abstractC23864c = (AbstractC23864c) objM87133R6;
                            c28655q.m87173q(false);
                        }
                        if (abstractC23864c == null) {
                            c28655q.m87150e0(-707430526);
                            zM87153g3 = ((((i18 & 14) ^ 6) <= 4 && c28655q.m87153g(c35505g4)) || (i18 & 6) == 4) | c28655q.m87153g(null) | c28655q.m87153g(interfaceC4339a);
                            objM87133R7 = c28655q.m87133R();
                            if (zM87153g3 || objM87133R7 == c28676v0) {
                                objM87133R7 = new C23863b(c35505g4);
                                c28655q.m87172p0(objM87133R7);
                            }
                            abstractC23864c = (C23863b) objM87133R7;
                            z18 = false;
                            c28655q.m87173q(false);
                        } else {
                            z18 = false;
                            c28655q.m87150e0(-438479417);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z18);
                        c28655q.m87173q(z18);
                        c35505g5 = c35505g4;
                    }
                    if (abstractC23864c instanceof AbstractC35504f) {
                        abstractC35504f = (AbstractC35504f) abstractC23864c;
                    } else {
                        abstractC35504f = null;
                    }
                    if (abstractC35504f != null) {
                        viewState = abstractC35504f.getViewState();
                    } else {
                        viewState = null;
                    }
                    if (viewState == null) {
                        c28655q.m87150e0(220190655);
                        c28655q.m87173q(false);
                        interfaceC28601c1M87261o = null;
                    } else {
                        c28655q.m87150e0(1808218242);
                        interfaceC28601c1M87261o = AbstractC28683x.m87261o(viewState, c28655q, 0);
                        c28655q.m87173q(false);
                    }
                    if (interfaceC28601c1M87261o == null) {
                        c28655q.m87150e0(1808219794);
                        i19 = i17;
                        c28676v1 = c28676v0;
                        interfaceC28601c1M87261o = AbstractC28683x.m87260n(abstractC23864c.getViewState(), c35505g5, null, c28655q, (i15 >> 6) & 112, 2);
                        z14 = false;
                    } else {
                        i19 = i17;
                        c28676v1 = c28676v0;
                        z14 = false;
                        c28655q.m87150e0(1808216322);
                    }
                    c28655q.m87173q(z14);
                    String strM112663a = itemState.getPath();
                    boolean zM87157i = c28655q.m87157i(abstractC23864c);
                    if (i19 == 32) {
                        z15 = true;
                    } else {
                        z15 = z14;
                    }
                    z16 = zM87157i | z15;
                    objM87133R4 = c28655q.m87133R();
                    if (z16 || objM87133R4 == c28676v1) {
                        objM87133R4 = new a(abstractC23864c, itemState, null);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, strM112663a);
                    C35505g c35505gM112627C = m112627C(interfaceC28601c1M87261o);
                    String strM112663a2 = itemState.getPath();
                    boolean zM87157i2 = c28655q.m87157i(abstractC23864c);
                    if ((i15 & 896) == 256) {
                        z14 = true;
                    }
                    z17 = zM87157i2 | z14;
                    objM87133R5 = c28655q.m87133R();
                    if (z17 || objM87133R5 == c28676v1) {
                        objM87133R5 = new C2205b(abstractC23864c, function3, 7);
                        c28655q.m87172p0(objM87133R5);
                    }
                    Modifier modifier5 = modifier4;
                    m112652p(modifier5, c35505gM112627C, strM112663a2, (Function1) objM87133R5, c28655q, i15 & 14, 0);
                    c28655q = c28655q;
                    modifier3 = modifier5;
                    c35505g3 = c35505g5;
                } else {
                    c28655q.m87138X();
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                    }
                    modifier4 = modifier2;
                    function3 = function2;
                }
                c35505g4 = c35505g2;
                c28655q.m87175r();
                i17 = i15 & 112;
                if (i17 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z13) {
                    objM87133R2 = new C32355c(itemState, 24);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C32355c(itemState, 24);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a = (InterfaceC4339a) objM87133R2;
                i18 = i15 >> 9;
                c28655q.m87150e0(1371609227);
                if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                    c28655q.m87150e0(-707976188);
                    interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                    if (interfaceC1583f2M73844a == null) {
                        c28655q.m87150e0(-707931115);
                        c28655q.m87173q(false);
                        abstractC23864c = null;
                    } else {
                        c28655q.m87150e0(-707931114);
                        Context applicationContext3 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        AbstractC22676k.m65748h(applicationContext3, "null cannot be cast to non-null type android.app.Application");
                        application2 = (Application) applicationContext3;
                        zM87153g2 = c28655q.m87153g(null) | ((((i18 & 14) ^ 6) <= 4 && c28655q.m87153g(c35505g4)) || (i18 & 6) == 4) | c28655q.m87153g(interfaceC4339a);
                        objM87133R6 = c28655q.m87133R();
                        if (zM87153g2) {
                            objM87133R6 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC35504f.class), interfaceC4339a, new C23863b(c35505g4), null);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC35504f.class), interfaceC4339a, new C23863b(c35505g4), null);
                            c28655q.m87172p0(objM87133R6);
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R6;
                        c28655q.m87173q(false);
                    }
                    if (abstractC23864c == null) {
                        c28655q.m87150e0(-707430526);
                        zM87153g3 = ((((i18 & 14) ^ 6) <= 4 && c28655q.m87153g(c35505g4)) || (i18 & 6) == 4) | c28655q.m87153g(null) | c28655q.m87153g(interfaceC4339a);
                        objM87133R7 = c28655q.m87133R();
                        if (zM87153g3) {
                            objM87133R7 = new C23863b(c35505g4);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            objM87133R7 = new C23863b(c35505g4);
                            c28655q.m87172p0(objM87133R7);
                        }
                        abstractC23864c = (C23863b) objM87133R7;
                        z18 = false;
                        c28655q.m87173q(false);
                    } else {
                        z18 = false;
                        c28655q.m87150e0(-438479417);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z18);
                    c28655q.m87173q(z18);
                    c35505g5 = c35505g4;
                } else {
                    interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                    applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        application = null;
                    }
                    zM87153g = ((((i18 & 14) ^ 6) <= 4 && c28655q.m87153g(c35505g4)) || (i18 & 6) == 4) | c28655q.m87153g(null) | c28655q.m87153g(interfaceC4339a);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g) {
                        c35505g5 = c35505g4;
                        objM87133R3 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c35505g5, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC35504f.class), interfaceC4339a, null);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        c35505g5 = c35505g4;
                        objM87133R3 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c35505g5, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC35504f.class), interfaceC4339a, null);
                        c28655q.m87172p0(objM87133R3);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R3;
                    c28655q.m87173q(false);
                }
                if (abstractC23864c instanceof AbstractC35504f) {
                    abstractC35504f = (AbstractC35504f) abstractC23864c;
                } else {
                    abstractC35504f = null;
                }
                if (abstractC35504f != null) {
                    viewState = abstractC35504f.getViewState();
                } else {
                    viewState = null;
                }
                if (viewState == null) {
                    c28655q.m87150e0(220190655);
                    c28655q.m87173q(false);
                    interfaceC28601c1M87261o = null;
                } else {
                    c28655q.m87150e0(1808218242);
                    interfaceC28601c1M87261o = AbstractC28683x.m87261o(viewState, c28655q, 0);
                    c28655q.m87173q(false);
                }
                if (interfaceC28601c1M87261o == null) {
                    c28655q.m87150e0(1808219794);
                    i19 = i17;
                    c28676v1 = c28676v0;
                    interfaceC28601c1M87261o = AbstractC28683x.m87260n(abstractC23864c.getViewState(), c35505g5, null, c28655q, (i15 >> 6) & 112, 2);
                    z14 = false;
                } else {
                    i19 = i17;
                    c28676v1 = c28676v0;
                    z14 = false;
                    c28655q.m87150e0(1808216322);
                }
                c28655q.m87173q(z14);
                String strM112663a3 = itemState.getPath();
                boolean zM87157i3 = c28655q.m87157i(abstractC23864c);
                if (i19 == 32) {
                    z15 = true;
                } else {
                    z15 = z14;
                }
                z16 = zM87157i3 | z15;
                objM87133R4 = c28655q.m87133R();
                if (z16) {
                    objM87133R4 = new a(abstractC23864c, itemState, null);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new a(abstractC23864c, itemState, null);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, strM112663a3);
                C35505g c35505gM112627C2 = m112627C(interfaceC28601c1M87261o);
                String strM112663a4 = itemState.getPath();
                boolean zM87157i4 = c28655q.m87157i(abstractC23864c);
                if ((i15 & 896) == 256) {
                    z14 = true;
                }
                z17 = zM87157i4 | z14;
                objM87133R5 = c28655q.m87133R();
                if (z17) {
                    objM87133R5 = new C2205b(abstractC23864c, function3, 7);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C2205b(abstractC23864c, function3, 7);
                    c28655q.m87172p0(objM87133R5);
                }
                Modifier modifier6 = modifier4;
                m112652p(modifier6, c35505gM112627C2, strM112663a4, (Function1) objM87133R5, c28655q, i15 & 14, 0);
                c28655q = c28655q;
                modifier3 = modifier6;
                c35505g3 = c35505g5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
                c35505g3 = c35505g2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(modifier3, itemState, function3, c35505g3, i13, i14, 11);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                c35505g2 = c35505g;
                if (c28655q.m87157i(c35505g2)) {
                    i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i15 |= i24;
            } else {
                c35505g2 = c35505g;
            }
            i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i15 |= i24;
        } else {
            c35505g2 = c35505g;
        }
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28655q.m87140Z();
            i16 = i13 & 1;
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                if (i25 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i26 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C35051a(29);
                        c28655q.m87172p0(objM87133R);
                    }
                    function3 = (Function1) objM87133R;
                } else {
                    function3 = function2;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                    c35505g4 = new C35505g(true, false, false, null, null, null, null, null, null, false, 1022, null);
                } else {
                    c35505g4 = c35505g2;
                }
            } else {
                if (i25 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i26 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C35051a(29);
                        c28655q.m87172p0(objM87133R);
                    }
                    function3 = (Function1) objM87133R;
                } else {
                    function3 = function2;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                    c35505g4 = new C35505g(true, false, false, null, null, null, null, null, null, false, 1022, null);
                } else {
                    c35505g4 = c35505g2;
                }
            }
            c28655q.m87175r();
            i17 = i15 & 112;
            if (i17 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R2 = c28655q.m87133R();
            if (z13) {
                objM87133R2 = new C32355c(itemState, 24);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C32355c(itemState, 24);
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC4339a = (InterfaceC4339a) objM87133R2;
            i18 = i15 >> 9;
            c28655q.m87150e0(1371609227);
            if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                c28655q.m87150e0(-707976188);
                interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                if (interfaceC1583f2M73844a == null) {
                    c28655q.m87150e0(-707931115);
                    c28655q.m87173q(false);
                    abstractC23864c = null;
                } else {
                    c28655q.m87150e0(-707931114);
                    Context applicationContext4 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    AbstractC22676k.m65748h(applicationContext4, "null cannot be cast to non-null type android.app.Application");
                    application2 = (Application) applicationContext4;
                    zM87153g2 = c28655q.m87153g(null) | ((((i18 & 14) ^ 6) <= 4 && c28655q.m87153g(c35505g4)) || (i18 & 6) == 4) | c28655q.m87153g(interfaceC4339a);
                    objM87133R6 = c28655q.m87133R();
                    if (zM87153g2) {
                        objM87133R6 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC35504f.class), interfaceC4339a, new C23863b(c35505g4), null);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC35504f.class), interfaceC4339a, new C23863b(c35505g4), null);
                        c28655q.m87172p0(objM87133R6);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R6;
                    c28655q.m87173q(false);
                }
                if (abstractC23864c == null) {
                    c28655q.m87150e0(-707430526);
                    zM87153g3 = ((((i18 & 14) ^ 6) <= 4 && c28655q.m87153g(c35505g4)) || (i18 & 6) == 4) | c28655q.m87153g(null) | c28655q.m87153g(interfaceC4339a);
                    objM87133R7 = c28655q.m87133R();
                    if (zM87153g3) {
                        objM87133R7 = new C23863b(c35505g4);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C23863b(c35505g4);
                        c28655q.m87172p0(objM87133R7);
                    }
                    abstractC23864c = (C23863b) objM87133R7;
                    z18 = false;
                    c28655q.m87173q(false);
                } else {
                    z18 = false;
                    c28655q.m87150e0(-438479417);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z18);
                c28655q.m87173q(z18);
                c35505g5 = c35505g4;
            } else {
                interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                } else {
                    application = null;
                }
                zM87153g = ((((i18 & 14) ^ 6) <= 4 && c28655q.m87153g(c35505g4)) || (i18 & 6) == 4) | c28655q.m87153g(null) | c28655q.m87153g(interfaceC4339a);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g) {
                    c35505g5 = c35505g4;
                    objM87133R3 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c35505g5, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC35504f.class), interfaceC4339a, null);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    c35505g5 = c35505g4;
                    objM87133R3 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c35505g5, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC35504f.class), interfaceC4339a, null);
                    c28655q.m87172p0(objM87133R3);
                }
                abstractC23864c = (AbstractC23864c) objM87133R3;
                c28655q.m87173q(false);
            }
            if (abstractC23864c instanceof AbstractC35504f) {
                abstractC35504f = (AbstractC35504f) abstractC23864c;
            } else {
                abstractC35504f = null;
            }
            if (abstractC35504f != null) {
                viewState = abstractC35504f.getViewState();
            } else {
                viewState = null;
            }
            if (viewState == null) {
                c28655q.m87150e0(220190655);
                c28655q.m87173q(false);
                interfaceC28601c1M87261o = null;
            } else {
                c28655q.m87150e0(1808218242);
                interfaceC28601c1M87261o = AbstractC28683x.m87261o(viewState, c28655q, 0);
                c28655q.m87173q(false);
            }
            if (interfaceC28601c1M87261o == null) {
                c28655q.m87150e0(1808219794);
                i19 = i17;
                c28676v1 = c28676v0;
                interfaceC28601c1M87261o = AbstractC28683x.m87260n(abstractC23864c.getViewState(), c35505g5, null, c28655q, (i15 >> 6) & 112, 2);
                z14 = false;
            } else {
                i19 = i17;
                c28676v1 = c28676v0;
                z14 = false;
                c28655q.m87150e0(1808216322);
            }
            c28655q.m87173q(z14);
            String strM112663a5 = itemState.getPath();
            boolean zM87157i5 = c28655q.m87157i(abstractC23864c);
            if (i19 == 32) {
                z15 = true;
            } else {
                z15 = z14;
            }
            z16 = zM87157i5 | z15;
            objM87133R4 = c28655q.m87133R();
            if (z16) {
                objM87133R4 = new a(abstractC23864c, itemState, null);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new a(abstractC23864c, itemState, null);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, strM112663a5);
            C35505g c35505gM112627C3 = m112627C(interfaceC28601c1M87261o);
            String strM112663a6 = itemState.getPath();
            boolean zM87157i6 = c28655q.m87157i(abstractC23864c);
            if ((i15 & 896) == 256) {
                z14 = true;
            }
            z17 = zM87157i6 | z14;
            objM87133R5 = c28655q.m87133R();
            if (z17) {
                objM87133R5 = new C2205b(abstractC23864c, function3, 7);
                c28655q.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new C2205b(abstractC23864c, function3, 7);
                c28655q.m87172p0(objM87133R5);
            }
            Modifier modifier7 = modifier4;
            m112652p(modifier7, c35505gM112627C3, strM112663a6, (Function1) objM87133R5, c28655q, i15 & 14, 0);
            c28655q = c28655q;
            modifier3 = modifier7;
            c35505g3 = c35505g5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
            c35505g3 = c35505g2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32632k2(modifier3, itemState, function3, c35505g3, i13, i14, 11);
        }
    }
}
