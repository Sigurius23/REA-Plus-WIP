package nr0;

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
import b91.C2886a;
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
import ge3.AbstractC15751g;
import gy0.AbstractC16276e;
import gy0.AbstractC16277f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kw1.C22852c;
import l83.C23454a0;
import l83.InterfaceC23459e;
import ld1.AbstractC23864c;
import ld1.AbstractC23865d;
import ld1.C23863b;
import m31.C25002h;
import mf2.C25514e;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26970r0;
import no1.C26993g;
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
import p329n0.C26057j;
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
import p719m22.C24965t;
import p720m91.AbstractC25303l;
import p720m91.C25306o;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33220t0;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uf3.C34911a;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: nr0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a5\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001aA\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001aA\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a5\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u000f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a'\u0010\u001d\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00142\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001bH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u000f\u0010\u001f\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u001f\u0010 ¨\u0006!²\u0006\f\u0010\u0013\u001a\u00020\u000f8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lny0/h;", "state", "Lcom/whoop/analytics/AnalyticEventModel;", "primaryAnalyticEvent", "Lkotlin/Function1;", "", "Ll83/a0;", "onEvent", "G", "(Lny0/h;Lcom/whoop/analytics/AnalyticEventModel;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/Modifier;", "modifier", "Lnr0/g;", "itemState", "onViewEvent", "Lnr0/c;", "defaultViewState", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Landroidx/compose/ui/Modifier;Lnr0/g;Lkotlin/jvm/functions/Function1;Lnr0/c;Landroidx/compose/runtime/Composer;II)V", "viewState", "", "path", "n", "(Landroidx/compose/ui/Modifier;Lnr0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "s", "(Landroidx/compose/ui/Modifier;Lnr0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "error", "Lkotlin/Function0;", "onDismiss", "C", "(Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "E", "(Landroidx/compose/runtime/Composer;I)V", "community-highlights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27073f {

    /* JADX INFO: renamed from: nr0.f$a */
    @InterfaceC32271e(m100429c = "com.whoop.communityhighlights.view.CommunityHighlightsContainerWrapperKt$CommunityHighlightsContainerWrapper$2$1", m100430f = "CommunityHighlightsContainerWrapper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f108215w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC23864c<C27070c, AbstractC27068a> f108216x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C27074g f108217y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC23864c<C27070c, AbstractC27068a> abstractC23864c, C27074g c27074g, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f108216x = abstractC23864c;
            this.f108217y = c27074g;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f108216x, this.f108217y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f108215w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f108216x.mo1216g(new AbstractC27068a.b(this.f108217y.getPath()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: nr0.f$b */
    @InterfaceC32271e(m100429c = "com.whoop.communityhighlights.view.CommunityHighlightsContainerWrapperKt$ErrorToastEffect$1$1", m100430f = "CommunityHighlightsContainerWrapper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f108218w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Context f108219x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f108220y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f108219x = context;
            this.f108220y = interfaceC4339a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f108219x, this.f108220y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f108218w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Context context = this.f108219x;
            Toast.makeText(context, context.getString(AbstractC16277f.f62281T), 1).show();
            this.f108220y.invoke();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m81376A(AbstractC23864c abstractC23864c, Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC27068a) {
            abstractC23864c.mo1216g(event);
        } else {
            function1.invoke(event);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m81377B(Modifier modifier, C27074g c27074g, Function1 function1, C27070c c27070c, int i13, int i14, Composer composer, int i15) {
        m81405w(modifier, c27074g, function1, c27070c, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    private static final void m81378C(String str, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(786088624);
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
                c28655q.m87150e0(-2090336744);
                boolean zM87157i = c28655q.m87157i(context) | ((i14 & 112) == 32);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new b(context, interfaceC4339a, null);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, str);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-2090096494);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C10965i(str, interfaceC4339a, i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m81379D(String str, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m81378C(str, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: E */
    private static final void m81380E(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(968515403);
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
            c28677v1M87180u.f115982d = new C24965t(i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m81381F(int i13, Composer composer, int i14) {
        m81380E(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G */
    public static final void m81382G(C27256h state, AnalyticEventModel analyticEventModel, Function1 onEvent) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        Action action = state.getAction();
        if (action != null) {
            if (analyticEventModel != null) {
                AbstractC13673n.m38578y(null, analyticEventModel, onEvent);
            }
            onEvent.invoke(new AbstractC27068a.c(action));
        } else if (analyticEventModel != null) {
            onEvent.invoke(new DesignItemInteraction(state, analyticEventModel));
        } else {
            onEvent.invoke(state);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0195  */
    /* JADX WARN: Code duplicated, block: B:101:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:104:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:107:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:60:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:75:0x0110  */
    /* JADX WARN: Code duplicated, block: B:77:0x011e  */
    /* JADX WARN: Code duplicated, block: B:80:0x012c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0148  */
    /* JADX WARN: Code duplicated, block: B:85:0x014e  */
    /* JADX WARN: Code duplicated, block: B:87:0x015c  */
    /* JADX WARN: Code duplicated, block: B:88:0x015e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0165  */
    /* JADX WARN: Code duplicated, block: B:92:0x0167  */
    /* JADX WARN: Code duplicated, block: B:95:0x016f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:96:0x0171  */
    /* JADX WARN: Code duplicated, block: B:98:0x0189  */
    /* JADX INFO: renamed from: n */
    public static final void m81396n(Modifier modifier, C27070c viewState, String str, Function1 function1, Composer composer, int i13, int i14) {
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
        c28655q.m87154g0(1678945398);
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
                            objM87133R3 = new C26993g(11);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function4 = (Function1) objM87133R3;
                    } else {
                        function4 = function2;
                    }
                    String strM81367b = viewState.getLoadMoreError();
                    i18 = i15 & 7168;
                    if (i18 == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13 || objM87133R == c28676v0) {
                        objM87133R = new C25514e(function4, 24);
                        c28655q.m87172p0(objM87133R);
                    }
                    m81378C(strM81367b, (InterfaceC4339a) objM87133R, c28655q, 0);
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
                        c28655q.m87150e0(881978522);
                        AbstractC12610b.m35349f(C12612d.f43056a.m35366a(), null, null, c28655q, C12611c.f43049g, 6);
                        c28655q.m87173q(false);
                    } else {
                        if (viewState.getIsError()) {
                            c28655q.m87150e0(881983142);
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
                                objM87133R2 = new C4048j0(function4, str2, 8);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC12610b.m35349f(c12611cM35368c, null, (InterfaceC4339a) objM87133R2, c28655q, C12611c.f43049g, 2);
                            c28655q.m87173q(false);
                        } else if (viewState.m81366a().isEmpty()) {
                            function5 = function4;
                            c28655q.m87150e0(1572056850);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(881991371);
                            function5 = function4;
                            m81401s(null, viewState, function5, c28655q, (i15 & 112) | ((i15 >> 3) & 896), 1);
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
                    c28677v1M87180u.f115982d = new C22852c((Object) modifier3, (Object) viewState, (Object) str3, (InterfaceC23459e) function3, i13, i14, 25);
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
                        objM87133R3 = new C26993g(11);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                String strM81367b2 = viewState.getLoadMoreError();
                i18 = i15 & 7168;
                if (i18 == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C25514e(function4, 24);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C25514e(function4, 24);
                    c28655q.m87172p0(objM87133R);
                }
                m81378C(strM81367b2, (InterfaceC4339a) objM87133R, c28655q, 0);
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
                    c28655q.m87150e0(881978522);
                    AbstractC12610b.m35349f(C12612d.f43056a.m35366a(), null, null, c28655q, C12611c.f43049g, 6);
                    c28655q.m87173q(false);
                } else {
                    if (viewState.getIsError()) {
                        c28655q.m87150e0(881983142);
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
                            objM87133R2 = new C4048j0(function4, str2, 8);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C4048j0(function4, str2, 8);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC12610b.m35349f(c12611cM35368c2, null, (InterfaceC4339a) objM87133R2, c28655q, C12611c.f43049g, 2);
                        c28655q.m87173q(false);
                    } else if (viewState.m81366a().isEmpty()) {
                        c28655q.m87150e0(881991371);
                        function5 = function4;
                        m81401s(null, viewState, function5, c28655q, (i15 & 112) | ((i15 >> 3) & 896), 1);
                        c28655q.m87173q(false);
                    } else {
                        function5 = function4;
                        c28655q.m87150e0(1572056850);
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
                c28677v1M87180u.f115982d = new C22852c((Object) modifier3, (Object) viewState, (Object) str3, (InterfaceC23459e) function3, i13, i14, 25);
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
                        objM87133R3 = new C26993g(11);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                String strM81367b3 = viewState.getLoadMoreError();
                i18 = i15 & 7168;
                if (i18 == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C25514e(function4, 24);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C25514e(function4, 24);
                    c28655q.m87172p0(objM87133R);
                }
                m81378C(strM81367b3, (InterfaceC4339a) objM87133R, c28655q, 0);
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
                    c28655q.m87150e0(881978522);
                    AbstractC12610b.m35349f(C12612d.f43056a.m35366a(), null, null, c28655q, C12611c.f43049g, 6);
                    c28655q.m87173q(false);
                } else {
                    if (viewState.getIsError()) {
                        c28655q.m87150e0(881983142);
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
                            objM87133R2 = new C4048j0(function4, str2, 8);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C4048j0(function4, str2, 8);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC12610b.m35349f(c12611cM35368c3, null, (InterfaceC4339a) objM87133R2, c28655q, C12611c.f43049g, 2);
                        c28655q.m87173q(false);
                    } else if (viewState.m81366a().isEmpty()) {
                        c28655q.m87150e0(881991371);
                        function5 = function4;
                        m81401s(null, viewState, function5, c28655q, (i15 & 112) | ((i15 >> 3) & 896), 1);
                        c28655q.m87173q(false);
                    } else {
                        function5 = function4;
                        c28655q.m87150e0(1572056850);
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
                c28677v1M87180u.f115982d = new C22852c((Object) modifier3, (Object) viewState, (Object) str3, (InterfaceC23459e) function3, i13, i14, 25);
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
                    objM87133R3 = new C26993g(11);
                    c28655q.m87172p0(objM87133R3);
                }
                function4 = (Function1) objM87133R3;
            } else {
                function4 = function2;
            }
            String strM81367b4 = viewState.getLoadMoreError();
            i18 = i15 & 7168;
            if (i18 == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                objM87133R = new C25514e(function4, 24);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C25514e(function4, 24);
                c28655q.m87172p0(objM87133R);
            }
            m81378C(strM81367b4, (InterfaceC4339a) objM87133R, c28655q, 0);
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
                c28655q.m87150e0(881978522);
                AbstractC12610b.m35349f(C12612d.f43056a.m35366a(), null, null, c28655q, C12611c.f43049g, 6);
                c28655q.m87173q(false);
            } else {
                if (viewState.getIsError()) {
                    c28655q.m87150e0(881983142);
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
                        objM87133R2 = new C4048j0(function4, str2, 8);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C4048j0(function4, str2, 8);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC12610b.m35349f(c12611cM35368c4, null, (InterfaceC4339a) objM87133R2, c28655q, C12611c.f43049g, 2);
                    c28655q.m87173q(false);
                } else if (viewState.m81366a().isEmpty()) {
                    c28655q.m87150e0(881991371);
                    function5 = function4;
                    m81401s(null, viewState, function5, c28655q, (i15 & 112) | ((i15 >> 3) & 896), 1);
                    c28655q.m87173q(false);
                } else {
                    function5 = function4;
                    c28655q.m87150e0(1572056850);
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
            c28677v1M87180u.f115982d = new C22852c((Object) modifier3, (Object) viewState, (Object) str3, (InterfaceC23459e) function3, i13, i14, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m81397o(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m81398p(Function1 function1) {
        function1.invoke(AbstractC27068a.a.f108201a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m81399q(Function1 function1, String str) {
        function1.invoke(new AbstractC27068a.b(str));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m81400r(Modifier modifier, C27070c c27070c, String str, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m81396n(modifier, c27070c, str, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r12v5, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r4v11, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: s */
    private static final void m81401s(Modifier modifier, C27070c c27070c, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C27070c c27070c2;
        Modifier modifier3;
        ?? r14;
        boolean z4;
        ?? r15;
        ?? r16;
        float f13;
        Object obj;
        Function1 function2 = function1;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1422574614);
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
            c27070c2 = c27070c;
            i15 |= c28655q.m87157i(c27070c2) ? 32 : 16;
        } else {
            c27070c2 = c27070c;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function2) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            AbstractC33220t0.m105391c(c27070c2.getSectionViewAnalyticEvent(), function2, c28655q, (i15 >> 3) & 112);
            float f14 = 1.0f;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
            float f15 = 8;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * f15), C2299e.f9110M, c28655q, 6);
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
            String strM81369d = c27070c2.getTitle();
            String str = (strM81369d == null || AbstractC39414r.m125890i0(strM81369d)) ? null : strM81369d;
            if (str == null) {
                c28655q.m87150e0(-582928776);
                c28655q.m87173q(false);
                z4 = false;
                r15 = c28655q;
            } else {
                c28655q.m87150e0(-582928775);
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, modifier4), ((float) 0.5d) * f15, 0.0f, 0.0f, 0.0f, 14);
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                z4 = false;
                AbstractC30795n.m94707h(str, modifierM3398t, c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getT3(), null, c28655q, 0, C2886a.f11498d << 18, 196600);
                C28655q c28655q2 = c28655q;
                c28655q2.m87173q(false);
                r15 = c28655q2;
            }
            r15.m87150e0(-988625259);
            int i18 = z4 ? 1 : 0;
            ?? r10 = z4;
            for (Object obj2 : c27070c2.m81366a()) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C25306o c25306o = (C25306o) obj2;
                Object objM74316c = c25306o.m74316c();
                if (objM74316c == null) {
                    objM74316c = Integer.valueOf(i18);
                }
                r15.m87144b0(424642682, objM74316c);
                InterfaceC25312u interfaceC25312uM74318e = c25306o.getState();
                if (interfaceC25312uM74318e instanceof C27256h) {
                    r15.m87150e0(424646158);
                    if (c27070c2.getIsLoadingMore()) {
                        r15.m87150e0(424647621);
                        m81380E(r15, r10);
                        r15.m87173q(r10);
                    } else {
                        r15.m87150e0(424649546);
                        Modifier modifierM3409f2 = AbstractC1102d.m3409f(f14, c2314t);
                        C27256h c27256h = (C27256h) interfaceC25312uM74318e;
                        ?? r17 = (r15.m87157i(interfaceC25312uM74318e) ? 1 : 0) | (r15.m87157i(c25306o) ? 1 : 0) | ((i15 & 896) == 256 ? 1 : r10);
                        Object objM87133R = r15.m87133R();
                        if (r17 != 0 || objM87133R == C28635l.f115821a) {
                            obj = objM87133R;
                            C26057j c26057j = new C26057j(c27256h, c25306o, function2, 6);
                            r15.m87172p0(c26057j);
                            obj = c26057j;
                        }
                        obj = objM87133R;
                        AbstractC27249e.m82121d(modifierM3409f2, c27256h, null, (InterfaceC4339a) obj, r15, 6, 4);
                        r15.m87173q(r10);
                    }
                    r15.m87173q(r10);
                    r16 = r10;
                    f13 = f14;
                } else {
                    r15.m87150e0(424660072);
                    r16 = r10;
                    f13 = f14;
                    AbstractC25303l.m74290q(c25306o, null, new C26970r0(1), function2, r15, C25306o.f99297c | ((i15 << 3) & 7168), 2);
                    r15.m87173q(r16);
                }
                r15.m87173q(r16);
                c27070c2 = c27070c;
                function2 = function1;
                i15 = i15;
                modifier4 = modifier4;
                f14 = f13;
                c2314t = c2314t;
                r10 = r16;
                i18 = i19;
            }
            r15.m87173q(r10);
            r15.m87173q(true);
            modifier3 = modifier4;
            r14 = r15;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            r14 = c28655q;
        }
        C28677v1 c28677v1M87180u = r14.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25002h(modifier3, c27070c, function1, i13, i14, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m81402t(InterfaceC25312u interfaceC25312u, C25306o c25306o, Function1 function1) {
        m81382G((C27256h) interfaceC25312u, c25306o.getPrimaryAnalyticEvent(), function1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final Modifier m81403u(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(923800560);
        c28655q.m87173q(false);
        return C2314t.f9131w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m81404v(Modifier modifier, C27070c c27070c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m81401s(modifier, c27070c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:107:0x01be A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:115:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:116:0x0201  */
    /* JADX WARN: Code duplicated, block: B:119:0x020d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0213  */
    /* JADX WARN: Code duplicated, block: B:127:0x0226 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:130:0x022c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0265  */
    /* JADX WARN: Code duplicated, block: B:135:0x0267  */
    /* JADX WARN: Code duplicated, block: B:138:0x026f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x0271  */
    /* JADX WARN: Code duplicated, block: B:142:0x0291  */
    /* JADX WARN: Code duplicated, block: B:145:0x0299 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:146:0x029b  */
    /* JADX WARN: Code duplicated, block: B:148:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:151:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:153:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:72:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:80:0x011e  */
    /* JADX WARN: Code duplicated, block: B:82:0x012a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0135  */
    /* JADX WARN: Code duplicated, block: B:85:0x015a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0160  */
    /* JADX WARN: Code duplicated, block: B:93:0x0173 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x0175  */
    /* JADX WARN: Code duplicated, block: B:97:0x0195  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a5  */
    /* JADX INFO: renamed from: w */
    public static final void m81405w(Modifier modifier, C27074g itemState, Function1 function1, C27070c c27070c, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        C27070c c27070c2;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C27070c c27070c3;
        C28677v1 c28677v1M87180u;
        int i16;
        C28676v0 c28676v0;
        Modifier modifier4;
        C27070c c27070c4;
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
        C27070c c27070c5;
        AbstractC23864c abstractC23864c;
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
        boolean zM87153g3;
        Object objM87133R7;
        int i19;
        AbstractC22676k.m65750j(itemState, "itemState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(144646440);
        int i24 = i14 & 1;
        if (i24 != 0) {
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
        int i25 = i14 & 4;
        if (i25 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if ((i14 & 8) == 0) {
                    c27070c2 = c27070c;
                    if (c28655q.m87157i(c27070c2)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i15 |= i19;
                } else {
                    c27070c2 = c27070c;
                }
                i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                i15 |= i19;
            } else {
                c27070c2 = c27070c;
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
                    if (i24 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i25 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C26993g(10);
                            c28655q.m87172p0(objM87133R);
                        }
                        function3 = (Function1) objM87133R;
                    } else {
                        function3 = function2;
                    }
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                        c27070c4 = new C27070c(true, false, false, null, null, null, null, null, 254, null);
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
                        objM87133R2 = new C27072e(itemState, 0);
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
                        zM87153g = ((((i18 & 14) ^ 6) <= 4 && c28655q.m87153g(c27070c4)) || (i18 & 6) == 4) | c28655q.m87153g(null) | c28655q.m87153g(interfaceC4339a);
                        objM87133R3 = c28655q.m87133R();
                        if (!zM87153g || objM87133R3 == c28676v0) {
                            c27070c5 = c27070c4;
                            objM87133R3 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c27070c5, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC27069b.class), interfaceC4339a, null);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            c27070c5 = c27070c4;
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R3;
                        z14 = false;
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
                            zM87153g2 = c28655q.m87153g(null) | ((((i18 & 14) ^ 6) <= 4 && c28655q.m87153g(c27070c4)) || (i18 & 6) == 4) | c28655q.m87153g(interfaceC4339a);
                            objM87133R6 = c28655q.m87133R();
                            if (zM87153g2 || objM87133R6 == c28676v0) {
                                objM87133R6 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC27069b.class), interfaceC4339a, new C23863b(c27070c4), null);
                                c28655q.m87172p0(objM87133R6);
                            }
                            abstractC23864c = (AbstractC23864c) objM87133R6;
                            c28655q.m87173q(false);
                        }
                        if (abstractC23864c == null) {
                            c28655q.m87150e0(-707430526);
                            zM87153g3 = ((((i18 & 14) ^ 6) <= 4 && c28655q.m87153g(c27070c4)) || (i18 & 6) == 4) | c28655q.m87153g(null) | c28655q.m87153g(interfaceC4339a);
                            objM87133R7 = c28655q.m87133R();
                            if (zM87153g3 || objM87133R7 == c28676v0) {
                                objM87133R7 = new C23863b(c27070c4);
                                c28655q.m87172p0(objM87133R7);
                            }
                            abstractC23864c = (C23863b) objM87133R7;
                            z14 = false;
                            c28655q.m87173q(false);
                        } else {
                            z14 = false;
                            c28655q.m87150e0(-438479417);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z14);
                        c28655q.m87173q(z14);
                        c27070c5 = c27070c4;
                    }
                    InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), c27070c5, null, c28655q, (i15 >> 6) & 112, 2);
                    String strM81409a = itemState.getPath();
                    boolean zM87157i = c28655q.m87157i(abstractC23864c);
                    if (i17 == 32) {
                        z15 = true;
                    } else {
                        z15 = z14;
                    }
                    z16 = z15 | zM87157i;
                    objM87133R4 = c28655q.m87133R();
                    if (z16 || objM87133R4 == c28676v0) {
                        objM87133R4 = new a(abstractC23864c, itemState, null);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, strM81409a);
                    C27070c c27070cM81408z = m81408z(interfaceC28601c1M87260n);
                    String strM81409a2 = itemState.getPath();
                    boolean zM87157i2 = c28655q.m87157i(abstractC23864c);
                    if ((i15 & 896) == 256) {
                        z14 = true;
                    }
                    z17 = zM87157i2 | z14;
                    objM87133R5 = c28655q.m87133R();
                    if (z17 || objM87133R5 == c28676v0) {
                        objM87133R5 = new C2205b(abstractC23864c, function3, 5);
                        c28655q.m87172p0(objM87133R5);
                    }
                    Modifier modifier5 = modifier4;
                    m81396n(modifier5, c27070cM81408z, strM81409a2, (Function1) objM87133R5, c28655q, i15 & 14, 0);
                    c28655q = c28655q;
                    modifier3 = modifier5;
                    c27070c3 = c27070c5;
                } else {
                    c28655q.m87138X();
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                    }
                    modifier4 = modifier2;
                    function3 = function2;
                }
                c27070c4 = c27070c2;
                c28655q.m87175r();
                i17 = i15 & 112;
                if (i17 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z13) {
                    objM87133R2 = new C27072e(itemState, 0);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C27072e(itemState, 0);
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
                        zM87153g2 = c28655q.m87153g(null) | ((((i18 & 14) ^ 6) <= 4 && c28655q.m87153g(c27070c4)) || (i18 & 6) == 4) | c28655q.m87153g(interfaceC4339a);
                        objM87133R6 = c28655q.m87133R();
                        if (zM87153g2) {
                            objM87133R6 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC27069b.class), interfaceC4339a, new C23863b(c27070c4), null);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC27069b.class), interfaceC4339a, new C23863b(c27070c4), null);
                            c28655q.m87172p0(objM87133R6);
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R6;
                        c28655q.m87173q(false);
                    }
                    if (abstractC23864c == null) {
                        c28655q.m87150e0(-707430526);
                        zM87153g3 = ((((i18 & 14) ^ 6) <= 4 && c28655q.m87153g(c27070c4)) || (i18 & 6) == 4) | c28655q.m87153g(null) | c28655q.m87153g(interfaceC4339a);
                        objM87133R7 = c28655q.m87133R();
                        if (zM87153g3) {
                            objM87133R7 = new C23863b(c27070c4);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            objM87133R7 = new C23863b(c27070c4);
                            c28655q.m87172p0(objM87133R7);
                        }
                        abstractC23864c = (C23863b) objM87133R7;
                        z14 = false;
                        c28655q.m87173q(false);
                    } else {
                        z14 = false;
                        c28655q.m87150e0(-438479417);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z14);
                    c28655q.m87173q(z14);
                    c27070c5 = c27070c4;
                } else {
                    interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                    applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        application = null;
                    }
                    zM87153g = ((((i18 & 14) ^ 6) <= 4 && c28655q.m87153g(c27070c4)) || (i18 & 6) == 4) | c28655q.m87153g(null) | c28655q.m87153g(interfaceC4339a);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g) {
                        c27070c5 = c27070c4;
                        objM87133R3 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c27070c5, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC27069b.class), interfaceC4339a, null);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        c27070c5 = c27070c4;
                        objM87133R3 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c27070c5, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC27069b.class), interfaceC4339a, null);
                        c28655q.m87172p0(objM87133R3);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R3;
                    z14 = false;
                    c28655q.m87173q(false);
                }
                InterfaceC28601c1 interfaceC28601c1M87260n2 = AbstractC28683x.m87260n(abstractC23864c.getViewState(), c27070c5, null, c28655q, (i15 >> 6) & 112, 2);
                String strM81409a3 = itemState.getPath();
                boolean zM87157i3 = c28655q.m87157i(abstractC23864c);
                if (i17 == 32) {
                    z15 = true;
                } else {
                    z15 = z14;
                }
                z16 = z15 | zM87157i3;
                objM87133R4 = c28655q.m87133R();
                if (z16) {
                    objM87133R4 = new a(abstractC23864c, itemState, null);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new a(abstractC23864c, itemState, null);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, strM81409a3);
                C27070c c27070cM81408z2 = m81408z(interfaceC28601c1M87260n2);
                String strM81409a4 = itemState.getPath();
                boolean zM87157i4 = c28655q.m87157i(abstractC23864c);
                if ((i15 & 896) == 256) {
                    z14 = true;
                }
                z17 = zM87157i4 | z14;
                objM87133R5 = c28655q.m87133R();
                if (z17) {
                    objM87133R5 = new C2205b(abstractC23864c, function3, 5);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C2205b(abstractC23864c, function3, 5);
                    c28655q.m87172p0(objM87133R5);
                }
                Modifier modifier6 = modifier4;
                m81396n(modifier6, c27070cM81408z2, strM81409a4, (Function1) objM87133R5, c28655q, i15 & 14, 0);
                c28655q = c28655q;
                modifier3 = modifier6;
                c27070c3 = c27070c5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
                c27070c3 = c27070c2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22852c(modifier3, itemState, function3, c27070c3, i13, i14, 24);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                c27070c2 = c27070c;
                if (c28655q.m87157i(c27070c2)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i15 |= i19;
            } else {
                c27070c2 = c27070c;
            }
            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i15 |= i19;
        } else {
            c27070c2 = c27070c;
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
                if (i24 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i25 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C26993g(10);
                        c28655q.m87172p0(objM87133R);
                    }
                    function3 = (Function1) objM87133R;
                } else {
                    function3 = function2;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                    c27070c4 = new C27070c(true, false, false, null, null, null, null, null, 254, null);
                } else {
                    c27070c4 = c27070c2;
                }
            } else {
                if (i24 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i25 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C26993g(10);
                        c28655q.m87172p0(objM87133R);
                    }
                    function3 = (Function1) objM87133R;
                } else {
                    function3 = function2;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                    c27070c4 = new C27070c(true, false, false, null, null, null, null, null, 254, null);
                } else {
                    c27070c4 = c27070c2;
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
                objM87133R2 = new C27072e(itemState, 0);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C27072e(itemState, 0);
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
                    zM87153g2 = c28655q.m87153g(null) | ((((i18 & 14) ^ 6) <= 4 && c28655q.m87153g(c27070c4)) || (i18 & 6) == 4) | c28655q.m87153g(interfaceC4339a);
                    objM87133R6 = c28655q.m87133R();
                    if (zM87153g2) {
                        objM87133R6 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC27069b.class), interfaceC4339a, new C23863b(c27070c4), null);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC27069b.class), interfaceC4339a, new C23863b(c27070c4), null);
                        c28655q.m87172p0(objM87133R6);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R6;
                    c28655q.m87173q(false);
                }
                if (abstractC23864c == null) {
                    c28655q.m87150e0(-707430526);
                    zM87153g3 = ((((i18 & 14) ^ 6) <= 4 && c28655q.m87153g(c27070c4)) || (i18 & 6) == 4) | c28655q.m87153g(null) | c28655q.m87153g(interfaceC4339a);
                    objM87133R7 = c28655q.m87133R();
                    if (zM87153g3) {
                        objM87133R7 = new C23863b(c27070c4);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C23863b(c27070c4);
                        c28655q.m87172p0(objM87133R7);
                    }
                    abstractC23864c = (C23863b) objM87133R7;
                    z14 = false;
                    c28655q.m87173q(false);
                } else {
                    z14 = false;
                    c28655q.m87150e0(-438479417);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z14);
                c28655q.m87173q(z14);
                c27070c5 = c27070c4;
            } else {
                interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                } else {
                    application = null;
                }
                zM87153g = ((((i18 & 14) ^ 6) <= 4 && c28655q.m87153g(c27070c4)) || (i18 & 6) == 4) | c28655q.m87153g(null) | c28655q.m87153g(interfaceC4339a);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g) {
                    c27070c5 = c27070c4;
                    objM87133R3 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c27070c5, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC27069b.class), interfaceC4339a, null);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    c27070c5 = c27070c4;
                    objM87133R3 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c27070c5, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC27069b.class), interfaceC4339a, null);
                    c28655q.m87172p0(objM87133R3);
                }
                abstractC23864c = (AbstractC23864c) objM87133R3;
                z14 = false;
                c28655q.m87173q(false);
            }
            InterfaceC28601c1 interfaceC28601c1M87260n3 = AbstractC28683x.m87260n(abstractC23864c.getViewState(), c27070c5, null, c28655q, (i15 >> 6) & 112, 2);
            String strM81409a5 = itemState.getPath();
            boolean zM87157i5 = c28655q.m87157i(abstractC23864c);
            if (i17 == 32) {
                z15 = true;
            } else {
                z15 = z14;
            }
            z16 = z15 | zM87157i5;
            objM87133R4 = c28655q.m87133R();
            if (z16) {
                objM87133R4 = new a(abstractC23864c, itemState, null);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new a(abstractC23864c, itemState, null);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, strM81409a5);
            C27070c c27070cM81408z3 = m81408z(interfaceC28601c1M87260n3);
            String strM81409a6 = itemState.getPath();
            boolean zM87157i6 = c28655q.m87157i(abstractC23864c);
            if ((i15 & 896) == 256) {
                z14 = true;
            }
            z17 = zM87157i6 | z14;
            objM87133R5 = c28655q.m87133R();
            if (z17) {
                objM87133R5 = new C2205b(abstractC23864c, function3, 5);
                c28655q.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new C2205b(abstractC23864c, function3, 5);
                c28655q.m87172p0(objM87133R5);
            }
            Modifier modifier7 = modifier4;
            m81396n(modifier7, c27070cM81408z3, strM81409a6, (Function1) objM87133R5, c28655q, i15 & 14, 0);
            c28655q = c28655q;
            modifier3 = modifier7;
            c27070c3 = c27070c5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
            c27070c3 = c27070c2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22852c(modifier3, itemState, function3, c27070c3, i13, i14, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m81406x(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C34911a m81407y(C27074g c27074g) {
        return AbstractC15751g.m44431K(c27074g.getRefreshScope());
    }

    /* JADX INFO: renamed from: z */
    private static final C27070c m81408z(InterfaceC28670t2 interfaceC28670t2) {
        return (C27070c) interfaceC28670t2.getValue();
    }
}
