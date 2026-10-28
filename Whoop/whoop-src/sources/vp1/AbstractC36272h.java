package vp1;

import a81.AbstractC0564o;
import a81.InterfaceC0569t;
import android.app.DatePickerDialog;
import android.content.Context;
import android.widget.DatePicker;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import b30.C2559k4;
import b30.C2626t2;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import bm2.C3472s;
import bo1.C3508b;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.metrics.common.ScreenState;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import d42.C11697m;
import e41.C12701f;
import e93.AbstractC12889b;
import ec3.AbstractC13091v;
import ec3.C13043h0;
import ec3.InterfaceC13062m;
import f41.C14076n;
import fy1.AbstractC14874j;
import fy1.InterfaceC14875k;
import gb1.AbstractC15673b0;
import go1.AbstractC16017b;
import gz0.EnumC16313m0;
import hy0.AbstractC17755i2;
import hy0.C17736e;
import id2.C18434s;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.C19072b;
import j11.AbstractC21211n;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kd1.C22411w;
import kotlin.C2026r;
import l83.C23454a0;
import l83.C23471q;
import l83.InterfaceC23459e;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import mf0.C25504c;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27265l0;
import ny0.AbstractC27282u;
import ny0.AbstractC27292z;
import ny0.EnumC27269n0;
import ny0.EnumC27284v;
import or2.AbstractC28193q0;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p127ev.AbstractC13673n;
import p163g1.AbstractC15005f3;
import p163g1.AbstractC15166v0;
import p163g1.C15077m1;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p208i2.C17919x;
import p21.C28749b;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22997s1;
import p291l0.InterfaceC23013y;
import p315m0.AbstractC24868a;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p40.C28827b;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p733ry2.C31915d;
import p734sl0.C32632k2;
import p734sl0.C32676t1;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p745y81.AbstractC39330c;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import pj2.C29308g;
import pj2.C29316o;
import pz0.AbstractC29641d;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import rq2.C31755w;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import so1.C32816h;
import sp1.AbstractC32871a;
import t80.C33592b;
import tp1.AbstractC34073m;
import tp1.AbstractC34075o;
import tp1.AbstractC34076p;
import tp1.C34061a;
import tp1.C34062b;
import tp1.C34063c;
import tp1.C34064d;
import tp1.C34065e;
import tp1.C34066f;
import tp1.C34067g;
import tp1.C34069i;
import tp1.C34070j;
import tp1.C34071k;
import tp1.C34072l;
import tp1.C34077q;
import tp1.EnumC34068h;
import tp1.EnumC34078r;
import um0.C35076b;
import uv0.AbstractC35283c;
import v31.C35608d;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.C35666g;
import v71.C35766g;
import ve.C35916a;
import vl0.C36100c;
import vo1.C36238m;
import vo1.C36244s;
import wb3.AbstractC37056f;
import x81.C38072d;
import xn1.AbstractC38480c;
import xn1.AbstractC38481d;
import y71.AbstractC39279l;
import y71.AbstractC39281n;
import y71.C39274g;
import y71.C39282o;
import yb0.AbstractC39383f;
import yn1.AbstractC39672a;

/* JADX INFO: renamed from: vp1.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\"\n\u0002\b\u0002\u001aY\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001ai\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\f2\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00022\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aA\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a1\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00182\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a7\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u001c2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a-\u0010$\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0014\b\u0002\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b$\u0010%\u001a;\u0010*\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020&2\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b*\u0010+\u001a/\u0010.\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0003¢\u0006\u0004\b.\u0010/¨\u0006>²\u0006\u000e\u00100\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u0010\u00102\u001a\u0004\u0018\u0001018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00103\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00104\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00105\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00106\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\f\u00107\u001a\u00020\u00128\nX\u008a\u0084\u0002²\u0006\f\u00108\u001a\u00020\u00128\nX\u008a\u0084\u0002²\u0006\u0010\u00109\u001a\u0004\u0018\u00010\"8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010:\u001a\u0004\u0018\u00010\"8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010;\u001a\u0004\u0018\u00010\"8\n@\nX\u008a\u008e\u0002²\u0006\u0014\u0010=\u001a\b\u0012\u0004\u0012\u00020\"0<8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Ltp1/o;", "viewState", "Lkotlin/Function1;", "Ltp1/m;", "Ll83/a0;", "onViewEvent", "Lsp1/a;", "onNavigationEvent", "Lyn1/a;", "onAnalyticEvent", "x0", "(Ltp1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ltp1/j;", "Lkotlin/Function0;", "onFertilityInsightsEnabled", "H0", "(Ltp1/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Ltp1/k;", "", "isEnable", "isToggle", "onToggle", "s0", "(Ltp1/k;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ltp1/g;", "onClick", "o0", "(Ltp1/g;ZLc93/a;Landroidx/compose/runtime/Composer;II)V", "Ltp1/l;", "onCloseClick", "J1", "(Ltp1/l;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Ltp1/i;", "privacyViewState", "", "onLearnMoreClicked", "F1", "(Ltp1/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lso1/h;", "Ltp1/a;", "dueDateDrawer", "onDueDateSubmit", "j0", "(Lso1/h;Ltp1/a;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Ltp1/b;", "isActive", "g0", "(Ltp1/b;ZLc93/a;Landroidx/compose/runtime/Composer;II)V", "fertilityInsightsEnableInProgress", "Lvp1/a;", "activeBottomSheet", "showDisablingDialog", "showModeDialog", "showContraceptionDialog", "showPregnancyInsightsConfirmationDialog", "isShowCycleOverlayOn", "isHormonalInsightsOn", "currentModeValue", "currentContraceptionValue", "currentSurveyValue", "", "currentGoalsValues", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36272h {

    /* JADX INFO: renamed from: vp1.h$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f155336w = new a();

        /* JADX INFO: renamed from: a */
        public final long m115899a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m115899a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: vp1.h$a0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a0 implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f155337w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f155338x;

        public a0(List list, InterfaceC28601c1 interfaceC28601c1) {
            this.f155337w = list;
            this.f155338x = interfaceC28601c1;
        }

        /* JADX INFO: renamed from: a */
        public final void m115900a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
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
            C34062b c34062b = (C34062b) this.f155337w.get(i13);
            c28655q.m87150e0(1165246874);
            boolean zM65745e = AbstractC22676k.m65745e(AbstractC36272h.m115790T0(this.f155338x), c34062b.getValue());
            boolean zM87157i = c28655q.m87157i(c34062b);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new h(c34062b, this.f155338x);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC36272h.m115835g0(c34062b, zM65745e, (InterfaceC4339a) objM87133R, c28655q, TextResource.$stable, 0);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m115900a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vp1.h$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f155339w = new b();

        /* JADX INFO: renamed from: a */
        public final long m115901a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m115901a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: vp1.h$b0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b0 f155340w = new b0();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C34062b c34062b) {
            return null;
        }
    }

    /* JADX INFO: renamed from: vp1.h$c */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.view.HormonalSettingsScreenKt$HormonalSettingsScreen$10$1", m100430f = "HormonalSettingsScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f155341w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f155342x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function1 function1, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f155342x = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f155342x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f155341w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f155342x.invoke(AbstractC39672a.l.f170756a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vp1.h$c0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f155343w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f155344x;

        public c0(Function1 function1, List list) {
            this.f155343w = function1;
            this.f155344x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m115903a(int i13) {
            return this.f155343w.invoke(this.f155344x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m115903a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: vp1.h$d */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.view.HormonalSettingsScreenKt$HormonalSettingsScreen$11$1", m100430f = "HormonalSettingsScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f155345w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC34075o f155346x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f155347y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f155348z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC34075o abstractC34075o, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f155346x = abstractC34075o;
            this.f155347y = function1;
            this.f155348z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f155346x, this.f155347y, this.f155348z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0040  */
        /* JADX WARN: Code duplicated, block: B:13:0x0046  */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f155345w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC36272h.m115742D0(this.f155348z)) {
                AbstractC34075o abstractC34075o = this.f155346x;
                if ((abstractC34075o instanceof AbstractC34075o.f) && ((AbstractC34075o.f) abstractC34075o).getState().getEnableFertilityInsightsDestination() != null) {
                    AbstractC36272h.m115745E0(this.f155348z, false);
                    this.f155347y.invoke(new AbstractC32871a.e(((AbstractC34075o.f) this.f155346x).getState().getEnableFertilityInsightsDestination()));
                } else if (this.f155346x instanceof AbstractC34075o.c) {
                    AbstractC36272h.m115745E0(this.f155348z, false);
                }
            } else if (this.f155346x instanceof AbstractC34075o.c) {
                AbstractC36272h.m115745E0(this.f155348z, false);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vp1.h$d0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d0 implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f155349w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f155350x;

        public d0(List list, InterfaceC28601c1 interfaceC28601c1) {
            this.f155349w = list;
            this.f155350x = interfaceC28601c1;
        }

        /* JADX INFO: renamed from: a */
        public final void m115904a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
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
            C34062b c34062b = (C34062b) this.f155349w.get(i13);
            c28655q.m87150e0(1491593254);
            boolean zM65745e = AbstractC22676k.m65745e(AbstractC36272h.m115796V0(this.f155350x), c34062b.getValue());
            boolean zM87157i = c28655q.m87157i(c34062b);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new i(c34062b, this.f155350x);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC36272h.m115835g0(c34062b, zM65745e, (InterfaceC4339a) objM87133R, c28655q, TextResource.$stable, 0);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m115904a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vp1.h$e */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m65681d2 = {"vp1/h$e", "Lfy1/k;", "Lcom/whoop/metrics/common/ScreenState;", "b", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC14875k {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final ScreenState state;

        public e(AbstractC34075o abstractC34075o) {
            this.state = AbstractC34076p.m107730a(abstractC34075o);
        }

        @Override // fy1.InterfaceC14875k
        public ScreenState getState() {
            return this.state;
        }
    }

    /* JADX INFO: renamed from: vp1.h$e0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e0 f155352w = new e0();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC25312u interfaceC25312u) {
            return null;
        }
    }

    /* JADX INFO: renamed from: vp1.h$f */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.view.HormonalSettingsScreenKt$HormonalSettingsScreen$8$1", m100430f = "HormonalSettingsScreen.kt", m100431l = {180}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f155353w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f155354x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function1 function1, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f155354x = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f155354x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f155353w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f155353w = 1;
                if (AbstractC3034m0.m8782b(500L, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f155354x.invoke(AbstractC34073m.b.f142812a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vp1.h$f0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f155355w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f155356x;

        public f0(Function1 function1, List list) {
            this.f155355w = function1;
            this.f155356x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m115906a(int i13) {
            return this.f155355w.invoke(this.f155356x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m115906a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: vp1.h$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f155357w = new g();

        /* JADX INFO: renamed from: a */
        public final long m115907a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSleepLightSleep();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m115907a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: vp1.h$g0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g0 implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f155358w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f155359x;

        public g0(List list, Function1 function1) {
            this.f155358w = list;
            this.f155359x = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m115908a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = i14 | (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2);
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
            InterfaceC25312u interfaceC25312u = (InterfaceC25312u) this.f155358w.get(i13);
            c28655q.m87150e0(-1593439760);
            if (interfaceC25312u instanceof C34067g) {
                c28655q.m87150e0(-1593398438);
                C34067g c34067g = (C34067g) interfaceC25312u;
                C34067g c34067g2 = new C34067g(c34067g.getTitle(), c34067g.getLeftIcon(), EnumC16313m0.CARET_FORWARD, null, null, 24, null);
                boolean zM87157i = c28655q.m87157i(interfaceC25312u) | c28655q.m87153g(this.f155359x);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new j(interfaceC25312u, this.f155359x);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC36272h.m115864o0(c34067g2, false, (InterfaceC4339a) objM87133R, c28655q, TextResource.$stable | C9598e.f28134d, 2);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1592680571);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m115908a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vp1.h$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C34062b f155360w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f155361x;

        public h(C34062b c34062b, InterfaceC28601c1 interfaceC28601c1) {
            this.f155360w = c34062b;
            this.f155361x = interfaceC28601c1;
        }

        /* JADX INFO: renamed from: a */
        public final void m115909a() {
            AbstractC36272h.m115793U0(this.f155361x, this.f155360w.getValue());
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m115909a();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vp1.h$h0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h0 f155362w = new h0();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C34062b c34062b) {
            return null;
        }
    }

    /* JADX INFO: renamed from: vp1.h$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C34062b f155363w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f155364x;

        public i(C34062b c34062b, InterfaceC28601c1 interfaceC28601c1) {
            this.f155363w = c34062b;
            this.f155364x = interfaceC28601c1;
        }

        /* JADX INFO: renamed from: a */
        public final void m115911a() {
            AbstractC36272h.m115799W0(this.f155364x, this.f155363w.getValue());
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m115911a();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vp1.h$i0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f155365w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f155366x;

        public i0(Function1 function1, List list) {
            this.f155365w = function1;
            this.f155366x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m115912a(int i13) {
            return this.f155365w.invoke(this.f155366x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m115912a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: vp1.h$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC25312u f155367w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f155368x;

        public j(InterfaceC25312u interfaceC25312u, Function1 function1) {
            this.f155367w = interfaceC25312u;
            this.f155368x = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m115913a() {
            C9598e c9598eM107679a = ((C34067g) this.f155367w).getDestination();
            if (c9598eM107679a != null) {
                this.f155368x.invoke(new AbstractC32871a.e(c9598eM107679a));
            }
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m115913a();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vp1.h$j0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j0 implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f155369w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f155370x;

        public j0(List list, InterfaceC28601c1 interfaceC28601c1) {
            this.f155369w = list;
            this.f155370x = interfaceC28601c1;
        }

        /* JADX INFO: renamed from: a */
        public final void m115914a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
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
            C34062b c34062b = (C34062b) this.f155369w.get(i13);
            c28655q.m87150e0(-2119413770);
            boolean zM65745e = AbstractC22676k.m65745e(AbstractC36272h.m115805Y0(this.f155370x), c34062b.getValue());
            boolean zM87157i = c28655q.m87157i(c34062b);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new k(c34062b, this.f155370x);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC36272h.m115835g0(c34062b, zM65745e, (InterfaceC4339a) objM87133R, c28655q, TextResource.$stable, 0);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m115914a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vp1.h$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C34062b f155371w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f155372x;

        public k(C34062b c34062b, InterfaceC28601c1 interfaceC28601c1) {
            this.f155371w = c34062b;
            this.f155372x = interfaceC28601c1;
        }

        /* JADX INFO: renamed from: a */
        public final void m115915a() {
            AbstractC36272h.m115808Z0(this.f155372x, this.f155371w.getValue());
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m115915a();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vp1.h$k0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final k0 f155373w = new k0();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC25312u interfaceC25312u) {
            return null;
        }
    }

    /* JADX INFO: renamed from: vp1.h$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f155374w;

        public l(Function1 function1) {
            this.f155374w = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m115917a() {
            this.f155374w.invoke(AbstractC34073m.a.f142811a);
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m115917a();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vp1.h$l0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f155375w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f155376x;

        public l0(Function1 function1, List list) {
            this.f155375w = function1;
            this.f155376x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m115918a(int i13) {
            return this.f155375w.invoke(this.f155376x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m115918a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: vp1.h$m */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC25312u f155377w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f155378x;

        public m(InterfaceC25312u interfaceC25312u, Function1 function1) {
            this.f155377w = interfaceC25312u;
            this.f155378x = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m115919a() {
            C9598e c9598eM107709a = ((C34072l) this.f155377w).getCtaDestination();
            if (c9598eM107709a != null) {
                this.f155378x.invoke(new AbstractC32871a.e(c9598eM107709a));
            }
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m115919a();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vp1.h$m0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m0 implements InterfaceC4352n {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC4339a f155379E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ Function1 f155380F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28601c1 f155381G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ InterfaceC28601c1 f155382H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ InterfaceC28601c1 f155383I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ InterfaceC28601c1 f155384J;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f155385w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C34070j f155386x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f155387y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f155388z;

        public m0(List list, C34070j c34070j, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a, Function1 function3, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4) {
            this.f155385w = list;
            this.f155386x = c34070j;
            this.f155387y = function1;
            this.f155388z = function2;
            this.f155379E = interfaceC4339a;
            this.f155380F = function3;
            this.f155381G = interfaceC28601c1;
            this.f155382H = interfaceC28601c2;
            this.f155383I = interfaceC28601c3;
            this.f155384J = interfaceC28601c4;
        }

        /* JADX WARN: Code duplicated, block: B:87:0x01ec  */
        /* JADX INFO: renamed from: a */
        public final void m115920a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            boolean z4;
            boolean zM115787S0;
            if ((i14 & 6) == 0) {
                i15 = i14 | (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2);
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            boolean zM115787S1 = true;
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            InterfaceC25312u interfaceC25312u = (InterfaceC25312u) this.f155385w.get(i13);
            c28655q.m87150e0(-1165037697);
            boolean z13 = interfaceC25312u instanceof C34072l;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z13) {
                c28655q.m87150e0(-1165200138);
                if (this.f155386x.getShowUpsell() || !((C34072l) interfaceC25312u).getDismissable()) {
                    c28655q.m87150e0(-1165119507);
                    C34072l c34072l = (C34072l) interfaceC25312u;
                    boolean zM87153g = c28655q.m87153g(this.f155387y);
                    Object objM87133R = c28655q.m87133R();
                    if (zM87153g || objM87133R == c28676v0) {
                        objM87133R = new l(this.f155387y);
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                    boolean zM87157i = c28655q.m87157i(interfaceC25312u) | c28655q.m87153g(this.f155388z);
                    Object objM87133R2 = c28655q.m87133R();
                    if (zM87157i || objM87133R2 == c28676v0) {
                        objM87133R2 = new m(interfaceC25312u, this.f155388z);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC36272h.m115761J1(c34072l, interfaceC4339a, (InterfaceC4339a) objM87133R2, c28655q, 0, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1164480442);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            } else if (interfaceC25312u instanceof C34071k) {
                c28655q.m87150e0(-1164287653);
                C34071k c34071k = (C34071k) interfaceC25312u;
                EnumC34078r enumC34078rM107708c = c34071k.getType();
                int[] iArr = n0.f155395b;
                int i16 = iArr[enumC34078rM107708c.ordinal()];
                if (i16 == 1) {
                    zM115787S0 = AbstractC36272h.m115787S0(this.f155381G);
                } else {
                    if (i16 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zM115787S0 = AbstractC36272h.m115784R0(this.f155382H);
                }
                boolean z14 = zM115787S0;
                int i17 = iArr[c34071k.getType().ordinal()];
                if (i17 != 1) {
                    if (i17 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zM115787S1 = AbstractC36272h.m115787S0(this.f155381G);
                }
                boolean z15 = zM115787S1;
                boolean zM87157i2 = c28655q.m87157i(interfaceC25312u) | c28655q.m87153g(this.f155388z) | c28655q.m87153g(this.f155387y);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87157i2 || objM87133R3 == c28676v0) {
                    objM87133R3 = new n(interfaceC25312u, this.f155388z, this.f155387y, this.f155383I);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC36272h.m115876s0(c34071k, z15, z14, (Function1) objM87133R3, c28655q, 0, 0);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else if (interfaceC25312u instanceof C3508b) {
                c28655q.m87150e0(-1162448423);
                C3508b c3508b = (C3508b) interfaceC25312u;
                boolean zM87153g2 = c28655q.m87153g(this.f155387y) | c28655q.m87153g(this.f155379E);
                Object objM87133R4 = c28655q.m87133R();
                if (zM87153g2 || objM87133R4 == c28676v0) {
                    objM87133R4 = new o(this.f155387y, this.f155379E);
                    c28655q.m87172p0(objM87133R4);
                }
                Function1 function1 = (Function1) objM87133R4;
                boolean zM87153g3 = c28655q.m87153g(this.f155388z) | c28655q.m87157i(interfaceC25312u);
                Object objM87133R5 = c28655q.m87133R();
                if (zM87153g3 || objM87133R5 == c28676v0) {
                    objM87133R5 = new p(this.f155388z, interfaceC25312u);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC16017b.m45332f(c3508b, function1, (Function1) objM87133R5, c28655q, 0, 0);
                c28655q.m87173q(false);
            } else {
                boolean z16 = interfaceC25312u instanceof C34067g;
                C2314t c2314t = C2314t.f9131w;
                if (z16) {
                    c28655q.m87150e0(-1161330873);
                    AbstractC18489d0.m53380u(2, 4, c2314t, c28655q);
                    C34067g c34067g = (C34067g) interfaceC25312u;
                    EnumC34068h enumC34068hM107683f = c34067g.getType();
                    int i18 = enumC34068hM107683f == null ? -1 : n0.f155396c[enumC34068hM107683f.ordinal()];
                    if (i18 != 1) {
                        if (i18 != 2) {
                            zM115787S1 = AbstractC36272h.m115787S0(this.f155381G);
                        } else if (this.f155386x.getGoalsDrawer() == null) {
                            z4 = false;
                        }
                        z4 = zM115787S1;
                    } else {
                        C34077q c34077qM107699l = this.f155386x.getPreviousPregnancies();
                        List<InterfaceC25312u> listM107731a = c34077qM107699l != null ? c34077qM107699l.m107731a() : null;
                        if (listM107731a == null || listM107731a.isEmpty()) {
                            z4 = false;
                        } else {
                            z4 = zM115787S1;
                        }
                    }
                    boolean zM87157i3 = c28655q.m87157i(interfaceC25312u) | c28655q.m87153g(this.f155380F);
                    Object objM87133R6 = c28655q.m87133R();
                    if (zM87157i3 || objM87133R6 == c28676v0) {
                        objM87133R6 = new q(interfaceC25312u, this.f155380F, this.f155384J);
                        c28655q.m87172p0(objM87133R6);
                    }
                    AbstractC36272h.m115864o0(c34067g, z4, (InterfaceC4339a) objM87133R6, c28655q, 0, 0);
                    c28655q.m87173q(false);
                } else if (interfaceC25312u instanceof C34069i) {
                    c28655q.m87150e0(-1158690572);
                    float f13 = 4;
                    AbstractC18489d0.m53380u(8, f13, c2314t, c28655q);
                    C34069i c34069i = (C34069i) interfaceC25312u;
                    boolean zM87153g4 = c28655q.m87153g(this.f155380F) | c28655q.m87153g(this.f155388z);
                    Object objM87133R7 = c28655q.m87133R();
                    if (zM87153g4 || objM87133R7 == c28676v0) {
                        objM87133R7 = new r(this.f155380F, this.f155388z);
                        c28655q.m87172p0(objM87133R7);
                    }
                    AbstractC36272h.m115749F1(c34069i, (Function1) objM87133R7, c28655q, 0, 0);
                    AbstractC31061c.m95650z(f13, f13, c2314t, c28655q, false);
                } else if (interfaceC25312u instanceof C17736e) {
                    c28655q.m87150e0(-1157999985);
                    AbstractC18489d0.m53380u(8, 4, c2314t, c28655q);
                    AbstractC17755i2.m50938j(null, null, null, ((C17736e) interfaceC25312u).getTitle(), null, 0L, 0L, null, c28655q, TextResource.$stable << 9, 247);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else if (interfaceC25312u instanceof C32816h) {
                    c28655q.m87150e0(-1157733509);
                    if (this.f155386x.getPregnancyDueDateDrawer() != null) {
                        c28655q.m87150e0(-1157653839);
                        AbstractC18489d0.m53380u(2, 4, c2314t, c28655q);
                        C32816h c32816h = (C32816h) interfaceC25312u;
                        C34061a c34061aM107698k = this.f155386x.getPregnancyDueDateDrawer();
                        boolean zM115787S2 = AbstractC36272h.m115787S0(this.f155381G);
                        boolean zM87153g5 = c28655q.m87153g(this.f155387y);
                        Object objM87133R8 = c28655q.m87133R();
                        if (zM87153g5 || objM87133R8 == c28676v0) {
                            objM87133R8 = new s(this.f155387y);
                            c28655q.m87172p0(objM87133R8);
                        }
                        AbstractC36272h.m115847j0(c32816h, c34061aM107698k, zM115787S2, (Function1) objM87133R8, c28655q, TextResource.$stable << 3);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1156987866);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1156909529);
                    AbstractC25303l.m74291r(interfaceC25312u, null, null, null, c28655q, 0, 14);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
            }
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m115920a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vp1.h$n */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC25312u f155389w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f155390x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f155391y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f155392z;

        /* JADX INFO: renamed from: vp1.h$n$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f155393a;

            static {
                int[] iArr = new int[EnumC34078r.values().length];
                try {
                    iArr[EnumC34078r.HORMONAL_INSIGHTS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC34078r.MENSTRUAL_CYCLE_TRENDS_OVERLAY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f155393a = iArr;
            }
        }

        public n(InterfaceC25312u interfaceC25312u, Function1 function1, Function1 function2, InterfaceC28601c1 interfaceC28601c1) {
            this.f155389w = interfaceC25312u;
            this.f155390x = function1;
            this.f155391y = function2;
            this.f155392z = interfaceC28601c1;
        }

        /* JADX INFO: renamed from: a */
        public final void m115921a(boolean z4) {
            int i13 = a.f155393a[((C34071k) this.f155389w).getType().ordinal()];
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f155391y.invoke(new AbstractC34073m.g(z4));
            } else if (z4) {
                this.f155390x.invoke(new AbstractC32871a.c(null));
            } else {
                AbstractC36272h.m115746E1(this.f155392z, true);
            }
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m115921a(((Boolean) obj).booleanValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vp1.h$n0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class n0 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f155394a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f155395b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f155396c;

        static {
            int[] iArr = new int[EnumC36265a.values().length];
            try {
                iArr[EnumC36265a.MODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC36265a.CONTRACEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC36265a.PREVIOUS_PREGNANCIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC36265a.FERTILITY_INSIGHTS_DISABLE_SURVEY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC36265a.GOALS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f155394a = iArr;
            int[] iArr2 = new int[EnumC34078r.values().length];
            try {
                iArr2[EnumC34078r.HORMONAL_INSIGHTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC34078r.MENSTRUAL_CYCLE_TRENDS_OVERLAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f155395b = iArr2;
            int[] iArr3 = new int[EnumC34068h.values().length];
            try {
                iArr3[EnumC34068h.PREVIOUS_PREGNANCIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[EnumC34068h.HORMONAL_GOALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            f155396c = iArr3;
        }
    }

    /* JADX INFO: renamed from: vp1.h$o */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f155397w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC4339a f155398x;

        public o(Function1 function1, InterfaceC4339a interfaceC4339a) {
            this.f155397w = function1;
            this.f155398x = interfaceC4339a;
        }

        /* JADX INFO: renamed from: a */
        public final void m115922a(boolean z4) {
            if (!z4) {
                this.f155397w.invoke(new AbstractC34073m.c(false));
            } else {
                this.f155398x.invoke();
                this.f155397w.invoke(new AbstractC34073m.c(true));
            }
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m115922a(((Boolean) obj).booleanValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vp1.h$p */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f155399w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC25312u f155400x;

        public p(Function1 function1, InterfaceC25312u interfaceC25312u) {
            this.f155399w = function1;
            this.f155400x = interfaceC25312u;
        }

        /* JADX INFO: renamed from: a */
        public final void m115923a(Object it) {
            AbstractC22676k.m65750j(it, "it");
            this.f155399w.invoke(new AbstractC32871a.e(((C3508b) this.f155400x).getCtaDestination()));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m115923a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vp1.h$q */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC25312u f155401w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f155402x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f155403y;

        /* JADX INFO: renamed from: vp1.h$q$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f155404a;

            static {
                int[] iArr = new int[EnumC34068h.values().length];
                try {
                    iArr[EnumC34068h.HORMONAL_INSIGHTS_MODE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC34068h.MCI_CONTRACEPTION_TYPE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC34068h.PREVIOUS_PREGNANCIES.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC34068h.FERTILITY_INSIGHTS_DISABLE_SURVEY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC34068h.HORMONAL_GOALS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f155404a = iArr;
            }
        }

        public q(InterfaceC25312u interfaceC25312u, Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
            this.f155401w = interfaceC25312u;
            this.f155402x = function1;
            this.f155403y = interfaceC28601c1;
        }

        /* JADX INFO: renamed from: a */
        public final void m115924a() {
            EnumC34068h enumC34068hM107683f = ((C34067g) this.f155401w).getType();
            int i13 = enumC34068hM107683f == null ? -1 : a.f155404a[enumC34068hM107683f.ordinal()];
            if (i13 != -1) {
                if (i13 == 1) {
                    this.f155402x.invoke(AbstractC39672a.m.f170758a);
                    AbstractC36272h.m115740C1(this.f155403y, EnumC36265a.MODE);
                    return;
                }
                if (i13 == 2) {
                    this.f155402x.invoke(AbstractC39672a.k.f170754a);
                    AbstractC36272h.m115740C1(this.f155403y, EnumC36265a.CONTRACEPTION);
                } else if (i13 == 3) {
                    this.f155402x.invoke(AbstractC39672a.n.f170760a);
                    AbstractC36272h.m115740C1(this.f155403y, EnumC36265a.PREVIOUS_PREGNANCIES);
                } else if (i13 == 4) {
                    AbstractC36272h.m115740C1(this.f155403y, EnumC36265a.FERTILITY_INSIGHTS_DISABLE_SURVEY);
                } else {
                    if (i13 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AbstractC36272h.m115740C1(this.f155403y, EnumC36265a.GOALS);
                }
            }
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m115924a();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vp1.h$r */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f155405w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f155406x;

        public r(Function1 function1, Function1 function2) {
            this.f155405w = function1;
            this.f155406x = function2;
        }

        /* JADX INFO: renamed from: a */
        public final void m115925a(String it) {
            AbstractC22676k.m65750j(it, "it");
            this.f155405w.invoke(AbstractC39672a.o.f170763a);
            this.f155406x.invoke(new AbstractC32871a.d(it));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m115925a((String) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vp1.h$s */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f155407w;

        public s(Function1 function1) {
            this.f155407w = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m115926a(String selectedDueDate) {
            AbstractC22676k.m65750j(selectedDueDate, "selectedDueDate");
            this.f155407w.invoke(new AbstractC34073m.h(selectedDueDate));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m115926a((String) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vp1.h$t */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.view.HormonalSettingsScreenKt$HormonalSettingsSuccessScreen$5$1", m100430f = "HormonalSettingsScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class t extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f155408w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC2994c0 f155409x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C15199y3 f155410y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f155411z;

        /* JADX INFO: renamed from: vp1.h$t$a */
        @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.view.HormonalSettingsScreenKt$HormonalSettingsSuccessScreen$5$1$1", m100430f = "HormonalSettingsScreen.kt", m100431l = {253, 255}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f155412w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C15199y3 f155413x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC28601c1 f155414y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f155413x = c15199y3;
                this.f155414y = interfaceC28601c1;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f155413x, this.f155414y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
            
                if (r5.m43225f(r4) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
            
                if (r5.m43223d(r4) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
            
                return r0;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r4.f155412w
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L19
                    if (r1 == r3) goto L15
                    if (r1 != r2) goto Ld
                    goto L15
                Ld:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L15:
                    p505ts.AbstractC34132o.m107864I(r5)
                    goto L3a
                L19:
                    p505ts.AbstractC34132o.m107864I(r5)
                    p1.c1 r5 = r4.f155414y
                    vp1.a r5 = vp1.AbstractC36272h.m115837g2(r5)
                    if (r5 == 0) goto L2f
                    g1.y3 r5 = r4.f155413x
                    r4.f155412w = r3
                    java.lang.Object r5 = r5.m43225f(r4)
                    if (r5 != r0) goto L3a
                    goto L39
                L2f:
                    g1.y3 r5 = r4.f155413x
                    r4.f155412w = r2
                    java.lang.Object r5 = r5.m43223d(r4)
                    if (r5 != r0) goto L3a
                L39:
                    return r0
                L3a:
                    l83.a0 r5 = l83.C23454a0.f92919a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: vp1.AbstractC36272h.t.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super t> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f155409x = interfaceC2994c0;
            this.f155410y = c15199y3;
            this.f155411z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new t(this.f155409x, this.f155410y, this.f155411z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((t) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f155408w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC3006f0.m8732z(this.f155409x, null, null, new a(this.f155410y, this.f155411z, null), 3);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vp1.h$u */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.view.HormonalSettingsScreenKt$HormonalSettingsSuccessScreen$6$1", m100430f = "HormonalSettingsScreen.kt", m100431l = {263}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class u extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f155415E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f155416F;

        /* JADX INFO: renamed from: w */
        int f155417w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f155418x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C34070j f155419y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f155420z;

        /* JADX INFO: renamed from: vp1.h$u$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C34070j f155421w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC28601c1 f155422x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC28601c1 f155423y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ InterfaceC28601c1 f155424z;

            public a(C34070j c34070j, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3) {
                this.f155421w = c34070j;
                this.f155422x = interfaceC28601c1;
                this.f155423y = interfaceC28601c2;
                this.f155424z = interfaceC28601c3;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(EnumC15209z3 enumC15209z3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                Set setM74103I1;
                List<C34065e> listM107677c;
                if (enumC15209z3 == EnumC15209z3.f57106w && AbstractC36272h.m115737B1(this.f155422x) != null) {
                    if (AbstractC36272h.m115737B1(this.f155422x) == EnumC36265a.FERTILITY_INSIGHTS_DISABLE_SURVEY) {
                        AbstractC36272h.m115808Z0(this.f155423y, null);
                    }
                    if (AbstractC36272h.m115737B1(this.f155422x) == EnumC36265a.GOALS) {
                        InterfaceC28601c1 interfaceC28601c1 = this.f155424z;
                        C34066f c34066fM107691d = this.f155421w.getGoalsDrawer();
                        if (c34066fM107691d == null || (listM107677c = c34066fM107691d.m107677c()) == null) {
                            setM74103I1 = C25235a0.f99113w;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            for (T t14 : listM107677c) {
                                if (((C34065e) t14).getIsSelected()) {
                                    arrayList.add(t14);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
                            Iterator<T> it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((C34065e) it.next()).getValue());
                            }
                            setM74103I1 = AbstractC25265s.m74103I1(arrayList2);
                        }
                        AbstractC36272h.m115816b1(interfaceC28601c1, setM74103I1);
                    }
                    AbstractC36272h.m115740C1(this.f155422x, null);
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(C15199y3 c15199y3, C34070j c34070j, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC30057d<? super u> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f155418x = c15199y3;
            this.f155419y = c34070j;
            this.f155420z = interfaceC28601c1;
            this.f155415E = interfaceC28601c2;
            this.f155416F = interfaceC28601c3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final EnumC15209z3 m115928h(C15199y3 c15199y3) {
            return c15199y3.m43221b();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new u(this.f155418x, this.f155419y, this.f155420z, this.f155415E, this.f155416F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((u) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f155417w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13043h0 c13043h0M36612v = AbstractC13091v.m36612v(AbstractC28683x.m87240H(new C36273i(this.f155418x, 0)), 1);
                a aVar = new a(this.f155419y, this.f155420z, this.f155415E, this.f155416F);
                this.f155417w = 1;
                if (c13043h0M36612v.collect(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vp1.h$v */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.view.HormonalSettingsScreenKt$HormonalSettingsSuccessScreen$7$1", m100430f = "HormonalSettingsScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class v extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f155425w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C34070j f155426x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f155427y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(C34070j c34070j, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super v> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f155426x = c34070j;
            this.f155427y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new v(this.f155426x, this.f155427y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((v) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f155425w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f155426x.getEnablePregnancyInsightsConfirmation() != null) {
                AbstractC36272h.m115778P0(this.f155427y, true);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vp1.h$w */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class w implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final w f155428w = new w();

        /* JADX INFO: renamed from: a */
        public final long m115930a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSleepLightSleep();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m115930a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: vp1.h$x */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class x implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final x f155429w = new x();

        /* JADX INFO: renamed from: a */
        public final long m115931a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSleepLightSleep();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m115931a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: vp1.h$y */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class y implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final y f155430w = new y();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C34062b c34062b) {
            return null;
        }
    }

    /* JADX INFO: renamed from: vp1.h$z */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class z implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f155431w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f155432x;

        public z(Function1 function1, List list) {
            this.f155431w = function1;
            this.f155432x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m115933a(int i13) {
            return this.f155431w.invoke(this.f155432x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m115933a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final C23454a0 m115733A0(InterfaceC28601c1 interfaceC28601c1) {
        m115745E0(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A1 */
    public static final C23454a0 m115734A1(C34070j c34070j, Function1 function1, Function1 function2, Function1 function3, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m115754H0(c34070j, function1, function2, function3, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final C23454a0 m115736B0(AbstractC34075o abstractC34075o, Function1 function1, Function1 function2, Function1 function3, int i13, int i14, Composer composer, int i15) {
        m115891x0(abstractC34075o, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B1 */
    public static final EnumC36265a m115737B1(InterfaceC28601c1 interfaceC28601c1) {
        return (EnumC36265a) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final C23454a0 m115739C0(AbstractC39672a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C1 */
    public static final void m115740C1(InterfaceC28601c1 interfaceC28601c1, EnumC36265a enumC36265a) {
        interfaceC28601c1.setValue(enumC36265a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final boolean m115742D0(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: D1 */
    private static final boolean m115743D1(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final void m115745E0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E1 */
    public static final void m115746E1(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final C23454a0 m115748F0(Function1 function1) {
        function1.invoke(AbstractC34073m.b.f142812a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:48:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:49:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:52:0x01be  */
    /* JADX WARN: Code duplicated, block: B:54:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:57:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:62:0x01da  */
    /* JADX WARN: Code duplicated, block: B:66:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:68:0x0214  */
    /* JADX WARN: Code duplicated, block: B:71:0x021e  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: F1 */
    public static final void m115749F1(C34069i c34069i, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        Function1 function5;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z13;
        int i16;
        boolean z14;
        C34069i c34069i2;
        boolean z15;
        boolean z16;
        Object objM87133R;
        Function1 function6;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-978919097);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c34069i) : c28655q.m87157i(c34069i) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C36244s(13);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C38072d c38072d = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                float f13 = 4;
                float f14 = 8;
                float f15 = ((float) 2.5d) * f14;
                Modifier modifierM3397s = AbstractC1099a.m3397s(AbstractC31061c.m95629e(modifierM3409f, f13, f13, c38072d.m121949b(c28655q, i18).getWhite5()), f15, f15, f15, 2 * f14);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                function5 = function4;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3397s);
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
                TextResource textResourceM107687e = c34069i.getTitleDisplay();
                int i19 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(textResourceM107687e, c28655q, i19);
                long jM125430y = c38072d.m121949b(c28655q, i18).getBrandWhite();
                C2886a c2886aM8420a = c38072d.m121952e(c28655q, i18).getB1();
                int i24 = C2886a.f11498d << 18;
                z13 = false;
                i16 = i15;
                AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q, 0, i24, 196602);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(3 * f13, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c34069i.getDescriptionDisplay(), c28655q, i19), null, c38072d.m121949b(c28655q, i18).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getB2(), null, c28655q, 0, i24, 196602);
                c28655q = c28655q;
                AbstractC18489d0.m53380u(1, f13, c2314t, c28655q);
                Modifier modifierM3392n = AbstractC1099a.m3392n(c2314t, ((float) (-1.5d)) * f14, 0.0f, 2);
                EnumC27269n0 enumC27269n0 = EnumC27269n0.TextSmall;
                TextResource textResourceM107684a = c34069i.getCtaTextDisplay();
                C39274g c39274g = new C39274g(AbstractC18489d0.m53359E(c38072d), null, 2, false ? 1 : 0);
                if ((i16 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i16 & 14) != 4) {
                    if ((i16 & 8) != 0) {
                        c34069i2 = c34069i;
                        if (c28655q.m87157i(c34069i2)) {
                        }
                    } else {
                        c34069i2 = c34069i;
                        z15 = z13;
                    }
                    z15 = z13;
                    z16 = z14 | z15;
                    objM87133R = c28655q.m87133R();
                    if (!z16 || objM87133R == c28676v0) {
                        function6 = function5;
                        objM87133R = new C35076b(11, function6, c34069i2);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        function6 = function5;
                    }
                    AbstractC27265l0.m82217i(modifierM3392n, enumC27269n0, textResourceM107684a, null, c39274g, false, null, null, false, false, null, null, (Function1) objM87133R, c28655q, (i19 << 6) | 3120 | (C39274g.f168929c << 12), 0, 4064);
                    c28655q.m87173q(true);
                    function3 = function6;
                } else {
                    c34069i2 = c34069i;
                }
                z15 = z13;
                z15 = true;
                z15 = z13;
                z16 = z14 | z15;
                objM87133R = c28655q.m87133R();
                if (z16) {
                    function6 = function5;
                    objM87133R = new C35076b(11, function6, c34069i2);
                    c28655q.m87172p0(objM87133R);
                } else {
                    function6 = function5;
                    objM87133R = new C35076b(11, function6, c34069i2);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC27265l0.m82217i(modifierM3392n, enumC27269n0, textResourceM107684a, null, c39274g, false, null, null, false, false, null, null, (Function1) objM87133R, c28655q, (i19 << 6) | 3120 | (C39274g.f168929c << 12), 0, 4064);
                c28655q.m87173q(true);
                function3 = function6;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33592b(c34069i, i13, function3, i14, 18);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C36244s(13);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
            C38072d c38072d2 = C38072d.f163053a;
            int i110 = C38072d.f163054b;
            float f16 = 4;
            float f17 = 8;
            float f18 = ((float) 2.5d) * f17;
            Modifier modifierM3397s2 = AbstractC1099a.m3397s(AbstractC31061c.m95629e(modifierM3409f2, f16, f16, c38072d2.m121949b(c28655q, i110).getWhite5()), f18, f18, f18, 2 * f17);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            function5 = function4;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3397s2);
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
            TextResource textResourceM107687e2 = c34069i.getTitleDisplay();
            int i111 = TextResource.$stable;
            String strM21274h2 = AbstractC8693b.m21274h(textResourceM107687e2, c28655q, i111);
            long jM125430y2 = c38072d2.m121949b(c28655q, i110).getBrandWhite();
            C2886a c2886aM8420a2 = c38072d2.m121952e(c28655q, i110).getB1();
            int i25 = C2886a.f11498d << 18;
            z13 = false;
            i16 = i15;
            AbstractC30795n.m94707h(strM21274h2, null, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a2, null, c28655q, 0, i25, 196602);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(3 * f16, c2314t2));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c34069i.getDescriptionDisplay(), c28655q, i111), null, c38072d2.m121949b(c28655q, i110).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i110).getB2(), null, c28655q, 0, i25, 196602);
            c28655q = c28655q;
            AbstractC18489d0.m53380u(1, f16, c2314t2, c28655q);
            Modifier modifierM3392n2 = AbstractC1099a.m3392n(c2314t2, ((float) (-1.5d)) * f17, 0.0f, 2);
            EnumC27269n0 enumC27269n1 = EnumC27269n0.TextSmall;
            TextResource textResourceM107684a2 = c34069i.getCtaTextDisplay();
            C39274g c39274g2 = new C39274g(AbstractC18489d0.m53359E(c38072d2), null, 2, false ? 1 : 0);
            if ((i16 & 112) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            if ((i16 & 14) != 4) {
                if ((i16 & 8) != 0) {
                    c34069i2 = c34069i;
                    if (c28655q.m87157i(c34069i2)) {
                    }
                } else {
                    c34069i2 = c34069i;
                    z15 = z13;
                }
                z15 = z13;
                z16 = z14 | z15;
                objM87133R = c28655q.m87133R();
                if (z16) {
                    function6 = function5;
                    objM87133R = new C35076b(11, function6, c34069i2);
                    c28655q.m87172p0(objM87133R);
                } else {
                    function6 = function5;
                    objM87133R = new C35076b(11, function6, c34069i2);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC27265l0.m82217i(modifierM3392n2, enumC27269n1, textResourceM107684a2, null, c39274g2, false, null, null, false, false, null, null, (Function1) objM87133R, c28655q, (i111 << 6) | 3120 | (C39274g.f168929c << 12), 0, 4064);
                c28655q.m87173q(true);
                function3 = function6;
            } else {
                c34069i2 = c34069i;
            }
            z15 = z13;
            z15 = true;
            z15 = z13;
            z16 = z14 | z15;
            objM87133R = c28655q.m87133R();
            if (z16) {
                function6 = function5;
                objM87133R = new C35076b(11, function6, c34069i2);
                c28655q.m87172p0(objM87133R);
            } else {
                function6 = function5;
                objM87133R = new C35076b(11, function6, c34069i2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27265l0.m82217i(modifierM3392n2, enumC27269n1, textResourceM107684a2, null, c39274g2, false, null, null, false, false, null, null, (Function1) objM87133R, c28655q, (i111 << 6) | 3120 | (C39274g.f168929c << 12), 0, 4064);
            c28655q.m87173q(true);
            function3 = function6;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33592b(c34069i, i13, function3, i14, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final C23454a0 m115751G0(Function1 function1) {
        function1.invoke(AbstractC34073m.b.f142812a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G1 */
    public static final C23454a0 m115752G1(String it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0156  */
    /* JADX WARN: Code duplicated, block: B:103:0x0167  */
    /* JADX WARN: Code duplicated, block: B:106:0x0178  */
    /* JADX WARN: Code duplicated, block: B:109:0x0189  */
    /* JADX WARN: Code duplicated, block: B:112:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:115:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:118:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:121:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:124:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:126:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:140:0x0257  */
    /* JADX WARN: Code duplicated, block: B:142:0x0265  */
    /* JADX WARN: Code duplicated, block: B:145:0x0282 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x0288  */
    /* JADX WARN: Code duplicated, block: B:151:0x02a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:154:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:157:0x02e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:163:0x0302  */
    /* JADX WARN: Code duplicated, block: B:165:0x030e  */
    /* JADX WARN: Code duplicated, block: B:166:0x0326  */
    /* JADX WARN: Code duplicated, block: B:168:0x0340  */
    /* JADX WARN: Code duplicated, block: B:171:0x0355  */
    /* JADX WARN: Code duplicated, block: B:172:0x0363  */
    /* JADX WARN: Code duplicated, block: B:175:0x0371  */
    /* JADX WARN: Code duplicated, block: B:176:0x0373  */
    /* JADX WARN: Code duplicated, block: B:179:0x037a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:180:0x037c  */
    /* JADX WARN: Code duplicated, block: B:183:0x0412  */
    /* JADX WARN: Code duplicated, block: B:186:0x042d  */
    /* JADX WARN: Code duplicated, block: B:188:0x0439  */
    /* JADX WARN: Code duplicated, block: B:189:0x044d  */
    /* JADX WARN: Code duplicated, block: B:191:0x0468  */
    /* JADX WARN: Code duplicated, block: B:194:0x047d  */
    /* JADX WARN: Code duplicated, block: B:195:0x048b  */
    /* JADX WARN: Code duplicated, block: B:198:0x0499  */
    /* JADX WARN: Code duplicated, block: B:199:0x049b  */
    /* JADX WARN: Code duplicated, block: B:202:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:203:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:206:0x04ae A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:209:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:212:0x0511  */
    /* JADX WARN: Code duplicated, block: B:215:0x0529  */
    /* JADX WARN: Code duplicated, block: B:217:0x0535  */
    /* JADX WARN: Code duplicated, block: B:218:0x0544  */
    /* JADX WARN: Code duplicated, block: B:220:0x055c  */
    /* JADX WARN: Code duplicated, block: B:223:0x0571  */
    /* JADX WARN: Code duplicated, block: B:224:0x057f  */
    /* JADX WARN: Code duplicated, block: B:227:0x058d  */
    /* JADX WARN: Code duplicated, block: B:228:0x058f  */
    /* JADX WARN: Code duplicated, block: B:231:0x0598  */
    /* JADX WARN: Code duplicated, block: B:232:0x059a  */
    /* JADX WARN: Code duplicated, block: B:235:0x05a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:236:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:239:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:242:0x0611  */
    /* JADX WARN: Code duplicated, block: B:243:0x0616  */
    /* JADX WARN: Code duplicated, block: B:246:0x061d  */
    /* JADX WARN: Code duplicated, block: B:249:0x0624 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:250:0x0626  */
    /* JADX WARN: Code duplicated, block: B:253:0x065d  */
    /* JADX WARN: Code duplicated, block: B:254:0x065f  */
    /* JADX WARN: Code duplicated, block: B:257:0x066d  */
    /* JADX WARN: Code duplicated, block: B:259:0x0670 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:260:0x0672 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:261:0x0674  */
    /* JADX WARN: Code duplicated, block: B:263:0x0677 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:264:0x0679  */
    /* JADX WARN: Code duplicated, block: B:266:0x0682  */
    /* JADX WARN: Code duplicated, block: B:268:0x0688  */
    /* JADX WARN: Code duplicated, block: B:269:0x068f  */
    /* JADX WARN: Code duplicated, block: B:270:0x0696  */
    /* JADX WARN: Code duplicated, block: B:271:0x069d  */
    /* JADX WARN: Code duplicated, block: B:274:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:275:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:277:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:279:0x06b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:280:0x06bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:281:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:283:0x06c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:284:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:286:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:288:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:290:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:291:0x0703  */
    /* JADX WARN: Code duplicated, block: B:293:0x0720  */
    /* JADX WARN: Code duplicated, block: B:295:0x0726  */
    /* JADX WARN: Code duplicated, block: B:296:0x074c  */
    /* JADX WARN: Code duplicated, block: B:297:0x0764  */
    /* JADX WARN: Code duplicated, block: B:299:0x076b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:300:0x0791  */
    /* JADX WARN: Code duplicated, block: B:301:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:302:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:305:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:307:0x0882  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:310:0x0891  */
    /* JADX WARN: Code duplicated, block: B:316:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x0098  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:87:0x0106  */
    /* JADX WARN: Code duplicated, block: B:90:0x012b  */
    /* JADX WARN: Code duplicated, block: B:91:0x012e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0135  */
    /* JADX WARN: Code duplicated, block: B:97:0x0145  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H0 */
    public static final void m115754H0(C34070j c34070j, Function1 function1, Function1 function2, Function1 function3, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        Function1 function4;
        int i15;
        Function1 function5;
        int i16;
        int i17;
        Function1 function6;
        int i18;
        int i19;
        InterfaceC4339a interfaceC4339a2;
        int i24;
        boolean z4;
        C28655q c28655q;
        Function1 function7;
        Function1 function8;
        Function1 function9;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function10;
        Function1 function11;
        Function1 function12;
        InterfaceC4339a interfaceC4339a4;
        Object objM87133R;
        InterfaceC2994c0 interfaceC2994c0;
        Function1 function13;
        Function1 function14;
        C15199y3 c15199y3M3460c;
        EnumC36265a enumC36265a;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R4;
        InterfaceC28601c1 interfaceC28601c3;
        Object objM87133R5;
        InterfaceC28601c1 interfaceC28601c4;
        Object objM87133R6;
        InterfaceC28601c1 interfaceC28601c5;
        Object objM87133R7;
        Object objM87133R8;
        Object objM87133R9;
        InterfaceC28601c1 interfaceC28601c6;
        Object objM87133R10;
        InterfaceC28601c1 interfaceC28601c7;
        int i25;
        Object objM87133R11;
        InterfaceC28601c1 interfaceC28601c8;
        Object objM87133R12;
        InterfaceC28601c1 interfaceC28601c9;
        InterfaceC28601c1 interfaceC28601c10;
        boolean zM87157i;
        Object objM87133R13;
        boolean zM87157i2;
        Object objM87133R14;
        InterfaceC28601c1 interfaceC28601c11;
        InterfaceC28601c1 interfaceC28601c12;
        InterfaceC28601c1 interfaceC28601c13;
        boolean zM87157i3;
        Object objM87133R15;
        int i26;
        InterfaceC28601c1 interfaceC28601c14;
        Function1 function15;
        Function1 function16;
        boolean z13;
        C28655q c28655q2;
        C28655q c28655q3;
        InterfaceC28601c1 interfaceC28601c15;
        Function1 function17;
        InterfaceC28601c1 interfaceC28601c16;
        AnyModal anyModalM107690c;
        Object objM87133R16;
        C28676v0 c28676v1;
        InterfaceC28601c1 interfaceC28601c17;
        int i27;
        C28655q c28655q4;
        EnumC36265a enumC36265aM115737B1;
        int i28;
        Modifier modifierM3599a;
        EnumC36265a enumC36265aM115737B2;
        int i29;
        C35666g c35666g;
        Object objM87133R17;
        TextResource textResource;
        C34063c c34063cM107692e;
        C35666g c35666g2;
        C34077q c34077qM107699l;
        C34063c c34063cM107688a;
        C34064d c34064dM107693f;
        Object objM87133R18;
        Object objM87133R19;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R20;
        C34064d c34064dM107696i;
        Object objM87133R21;
        Object objM87133R22;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objM87133R23;
        C34064d c34064dM107694g;
        Object objM87133R24;
        Object objM87133R25;
        InterfaceC28601c1 interfaceC28601c18;
        boolean z24;
        Object objM87133R26;
        C34066f c34066fM107691d;
        Object objM74103I1;
        List<C34065e> listM107677c;
        Object objM87133R27;
        Object objM87133R28;
        Object objM87133R29;
        Object objM87133R30;
        Object[] objArr;
        C34070j viewState = c34070j;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q5 = (C28655q) composer;
        c28655q5.m87154g0(1526267406);
        int i34 = (i13 & 6) == 0 ? (c28655q5.m87157i(viewState) ? 4 : 2) | i13 : i13;
        int i35 = i14 & 2;
        if (i35 == 0) {
            if ((i13 & 48) == 0) {
                function4 = function1;
                i34 |= c28655q5.m87157i(function4) ? 32 : 16;
            }
            i15 = i14 & 4;
            if (i15 != 0) {
                if ((i13 & 384) == 0) {
                    function5 = function2;
                    if (c28655q5.m87157i(function5)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i34 |= i16;
                }
                i17 = i14 & 8;
                if (i17 != 0) {
                    if ((i13 & 3072) == 0) {
                        function6 = function3;
                        if (c28655q5.m87157i(function6)) {
                            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i34 |= i18;
                    }
                    i19 = i14 & 16;
                    if (i19 != 0) {
                        if ((i13 & 24576) == 0) {
                            interfaceC4339a2 = interfaceC4339a;
                            if (c28655q5.m87157i(interfaceC4339a2)) {
                                i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                            } else {
                                i24 = DfuBaseService.ERROR_REMOTE_MASK;
                            }
                            i34 |= i24;
                        }
                        if ((i34 & 9363) != 9362) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q5.m87135U(i34 & 1, z4)) {
                            c28676v0 = C28635l.f115821a;
                            if (i35 != 0) {
                                objM87133R30 = c28655q5.m87133R();
                                if (objM87133R30 == c28676v0) {
                                    objM87133R30 = new C36244s(15);
                                    c28655q5.m87172p0(objM87133R30);
                                }
                                function10 = (Function1) objM87133R30;
                            } else {
                                function10 = function4;
                            }
                            if (i15 != 0) {
                                objM87133R29 = c28655q5.m87133R();
                                if (objM87133R29 == c28676v0) {
                                    objM87133R29 = new C36244s(9);
                                    c28655q5.m87172p0(objM87133R29);
                                }
                                function11 = (Function1) objM87133R29;
                            } else {
                                function11 = function5;
                            }
                            if (i17 != 0) {
                                objM87133R28 = c28655q5.m87133R();
                                if (objM87133R28 == c28676v0) {
                                    objM87133R28 = new C36244s(10);
                                    c28655q5.m87172p0(objM87133R28);
                                }
                                function12 = (Function1) objM87133R28;
                            } else {
                                function12 = function6;
                            }
                            if (i19 != 0) {
                                objM87133R27 = c28655q5.m87133R();
                                if (objM87133R27 == c28676v0) {
                                    objM87133R27 = new C35916a(23);
                                    c28655q5.m87172p0(objM87133R27);
                                }
                                interfaceC4339a4 = (InterfaceC4339a) objM87133R27;
                            } else {
                                interfaceC4339a4 = interfaceC4339a2;
                            }
                            objM87133R = c28655q5.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC28683x.m87262p(c28655q5);
                                c28655q5.m87172p0(objM87133R);
                            }
                            interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                            function13 = function11;
                            function14 = function12;
                            c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q5, 3078, 6);
                            if (viewState.getDisableFertilityInsightsSurveyDrawer() != null) {
                                enumC36265a = EnumC36265a.FERTILITY_INSIGHTS_DISABLE_SURVEY;
                            } else {
                                enumC36265a = null;
                            }
                            objM87133R2 = c28655q5.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC28683x.m87272z(enumC36265a);
                                c28655q5.m87172p0(objM87133R2);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                            objM87133R3 = c28655q5.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                                c28655q5.m87172p0(objM87133R3);
                            }
                            interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                            objM87133R4 = c28655q5.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                                c28655q5.m87172p0(objM87133R4);
                            }
                            interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
                            objM87133R5 = c28655q5.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                                c28655q5.m87172p0(objM87133R5);
                            }
                            interfaceC28601c4 = (InterfaceC28601c1) objM87133R5;
                            objM87133R6 = c28655q5.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                                c28655q5.m87172p0(objM87133R6);
                            }
                            interfaceC28601c5 = (InterfaceC28601c1) objM87133R6;
                            objM87133R7 = c28655q5.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsShowCycleOverlayOn()));
                                c28655q5.m87172p0(objM87133R7);
                            }
                            InterfaceC28601c1 interfaceC28601c19 = (InterfaceC28601c1) objM87133R7;
                            objM87133R8 = c28655q5.m87133R();
                            if (objM87133R8 == c28676v0) {
                                objM87133R8 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsHormonalInsightsOn()));
                                c28655q5.m87172p0(objM87133R8);
                            }
                            InterfaceC28601c1 interfaceC28601c20 = (InterfaceC28601c1) objM87133R8;
                            objM87133R9 = c28655q5.m87133R();
                            if (objM87133R9 == c28676v0) {
                                objM87133R9 = AbstractC28683x.m87272z(viewState.getSelectedMode());
                                c28655q5.m87172p0(objM87133R9);
                            }
                            interfaceC28601c6 = (InterfaceC28601c1) objM87133R9;
                            objM87133R10 = c28655q5.m87133R();
                            if (objM87133R10 == c28676v0) {
                                objM87133R10 = AbstractC28683x.m87272z(viewState.getSelectedContraceptionType());
                                c28655q5.m87172p0(objM87133R10);
                            }
                            interfaceC28601c7 = (InterfaceC28601c1) objM87133R10;
                            i25 = i34;
                            objM87133R11 = c28655q5.m87133R();
                            if (objM87133R11 == c28676v0) {
                                objM87133R11 = AbstractC28683x.m87272z(null);
                                c28655q5.m87172p0(objM87133R11);
                            }
                            interfaceC28601c8 = (InterfaceC28601c1) objM87133R11;
                            objM87133R12 = c28655q5.m87133R();
                            if (objM87133R12 == c28676v0) {
                                c34066fM107691d = viewState.getGoalsDrawer();
                                if (c34066fM107691d != null || (listM107677c = c34066fM107691d.m107677c()) == null) {
                                    interfaceC28601c9 = interfaceC28601c2;
                                    objM74103I1 = C25235a0.f99113w;
                                } else {
                                    List<C34065e> list = listM107677c;
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj : list) {
                                        InterfaceC28601c1 interfaceC28601c21 = interfaceC28601c2;
                                        if (((C34065e) obj).getIsSelected()) {
                                            arrayList.add(obj);
                                        }
                                        interfaceC28601c2 = interfaceC28601c21;
                                    }
                                    interfaceC28601c9 = interfaceC28601c2;
                                    ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(((C34065e) it.next()).getValue());
                                    }
                                    objM74103I1 = AbstractC25265s.m74103I1(arrayList2);
                                }
                                objM87133R12 = AbstractC28683x.m87272z(objM74103I1);
                                c28655q5.m87172p0(objM87133R12);
                            } else {
                                interfaceC28601c9 = interfaceC28601c2;
                                interfaceC28601c3 = interfaceC28601c3;
                            }
                            interfaceC28601c10 = (InterfaceC28601c1) objM87133R12;
                            EnumC36265a enumC36265aM115737B3 = m115737B1(interfaceC28601c1);
                            zM87157i = c28655q5.m87157i(interfaceC2994c0) | c28655q5.m87157i(c15199y3M3460c);
                            objM87133R13 = c28655q5.m87133R();
                            if (zM87157i || objM87133R13 == c28676v0) {
                                objM87133R13 = new t(interfaceC2994c0, c15199y3M3460c, interfaceC28601c1, null);
                                c28655q5.m87172p0(objM87133R13);
                            }
                            AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R13, enumC36265aM115737B3);
                            zM87157i2 = c28655q5.m87157i(c15199y3M3460c) | c28655q5.m87157i(viewState);
                            objM87133R14 = c28655q5.m87133R();
                            if (!zM87157i2 || objM87133R14 == c28676v0) {
                                interfaceC28601c11 = interfaceC28601c4;
                                u uVar = new u(c15199y3M3460c, viewState, interfaceC28601c1, interfaceC28601c8, interfaceC28601c10, null);
                                c15199y3M3460c = c15199y3M3460c;
                                viewState = viewState;
                                interfaceC28601c12 = interfaceC28601c8;
                                interfaceC28601c13 = interfaceC28601c10;
                                c28655q5.m87172p0(uVar);
                                objM87133R14 = uVar;
                            } else {
                                interfaceC28601c12 = interfaceC28601c8;
                                interfaceC28601c11 = interfaceC28601c4;
                                interfaceC28601c13 = interfaceC28601c10;
                            }
                            AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R14, c15199y3M3460c);
                            AnyModal anyModalM107690c2 = viewState.getEnablePregnancyInsightsConfirmation();
                            zM87157i3 = c28655q5.m87157i(viewState);
                            objM87133R15 = c28655q5.m87133R();
                            if (zM87157i3 || objM87133R15 == c28676v0) {
                                objM87133R15 = new v(viewState, interfaceC28601c5, null);
                                c28655q5.m87172p0(objM87133R15);
                            }
                            i26 = AnyModal.$stable;
                            AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R15, anyModalM107690c2);
                            if (m115743D1(interfaceC28601c9)) {
                                c28655q5.m87150e0(-2135741304);
                                c34064dM107694g = viewState.getHormonalInsightsDisablingConfirmDialog();
                                if (c34064dM107694g == null) {
                                    c28655q5.m87150e0(-1783470983);
                                    c28655q5.m87173q(false);
                                    interfaceC28601c1 = interfaceC28601c1;
                                    interfaceC28601c14 = interfaceC28601c5;
                                    function16 = function13;
                                    z13 = false;
                                    c28655q2 = c28655q5;
                                    function15 = function10;
                                } else {
                                    c28655q5.m87150e0(-1783470982);
                                    TextResource textResourceM107671d = c34064dM107694g.getTitleDisplay();
                                    TextResource textResourceM107668a = c34064dM107694g.getDescriptionDisplay();
                                    TextResource textResourceM107669b = c34064dM107694g.getPrimaryButtonTitle();
                                    objM87133R24 = c28655q5.m87133R();
                                    if (objM87133R24 == c28676v0) {
                                        objM87133R24 = w.f155428w;
                                        c28655q5.m87172p0(objM87133R24);
                                    }
                                    InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R24);
                                    TextResource textResourceM107670c = c34064dM107694g.getSecondaryButtonTitle();
                                    objM87133R25 = c28655q5.m87133R();
                                    if (objM87133R25 == c28676v0) {
                                        interfaceC28601c18 = interfaceC28601c9;
                                        objM87133R25 = new C36269e(0, interfaceC28601c18);
                                        c28655q5.m87172p0(objM87133R25);
                                    } else {
                                        interfaceC28601c18 = interfaceC28601c9;
                                    }
                                    InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R25;
                                    if ((i25 & 112) == 32) {
                                        z24 = true;
                                    } else {
                                        z24 = false;
                                    }
                                    objM87133R26 = c28655q5.m87133R();
                                    if (z24 || objM87133R26 == c28676v0) {
                                        objM87133R26 = new C25504c(interfaceC28601c18, interfaceC28601c6, function10);
                                        c28655q5.m87172p0(objM87133R26);
                                    }
                                    InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R26;
                                    int i36 = TextResource.$stable;
                                    int i37 = (i36 << 3) | (i36 << 6) | (i36 << 9) | (i36 << 27);
                                    interfaceC28601c9 = interfaceC28601c18;
                                    interfaceC28601c14 = interfaceC28601c5;
                                    function15 = function10;
                                    function16 = function13;
                                    AbstractC21211n.m59497o(null, textResourceM107671d, textResourceM107668a, textResourceM107669b, false, interfaceC39332eM125323a, null, null, null, textResourceM107670c, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a5, null, interfaceC4339a6, null, null, null, c28655q5, i37, 0, 384, 247463377);
                                    c28655q2 = c28655q5;
                                    z13 = false;
                                    c28655q2.m87173q(false);
                                }
                                c28655q2.m87173q(z13);
                            } else {
                                interfaceC28601c1 = interfaceC28601c1;
                                interfaceC28601c14 = interfaceC28601c5;
                                c28676v0 = c28676v0;
                                function15 = function10;
                                function16 = function13;
                                z13 = false;
                                c28655q2 = c28655q5;
                                c28655q2.m87150e0(-1782794252);
                                c28655q2.m87173q(false);
                            }
                            if (m115763K0(interfaceC28601c3)) {
                                c28655q2.m87150e0(-2135716155);
                                c34064dM107696i = c34070j.getHormonalInsightsModeConfirmDialog();
                                if (c34064dM107696i == null) {
                                    c28655q2.m87150e0(-1782691364);
                                    c28655q2.m87173q(z13);
                                    i26 = i26;
                                    c28655q3 = c28655q2;
                                    interfaceC28601c15 = interfaceC28601c3;
                                    function17 = function14;
                                } else {
                                    c28655q2.m87150e0(-1782691363);
                                    TextResource textResourceM107671d2 = c34064dM107696i.getTitleDisplay();
                                    TextResource textResourceM107668a2 = c34064dM107696i.getDescriptionDisplay();
                                    TextResource textResourceM107669b2 = c34064dM107696i.getPrimaryButtonTitle();
                                    objM87133R21 = c28655q2.m87133R();
                                    if (objM87133R21 == c28676v0) {
                                        objM87133R21 = x.f155429w;
                                        c28655q2.m87172p0(objM87133R21);
                                    }
                                    InterfaceC39332e interfaceC39332eM125323a2 = p745y81.Function1.m125323a((Function1) objM87133R21);
                                    TextResource textResourceM107670c2 = c34064dM107696i.getSecondaryButtonTitle();
                                    objM87133R22 = c28655q2.m87133R();
                                    if (objM87133R22 == c28676v0) {
                                        interfaceC28601c15 = interfaceC28601c3;
                                        objM87133R22 = new C36269e(1, interfaceC28601c15);
                                        c28655q2.m87172p0(objM87133R22);
                                    } else {
                                        interfaceC28601c15 = interfaceC28601c3;
                                    }
                                    InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R22;
                                    if ((i25 & 7168) == 2048) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    if ((i25 & 896) == 256) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    z19 = z18 | z17;
                                    objM87133R23 = c28655q2.m87133R();
                                    if (!z19 || objM87133R23 == c28676v0) {
                                        function17 = function14;
                                        objM87133R23 = new C36238m(function17, function16, interfaceC28601c15, interfaceC28601c6);
                                        c28655q2.m87172p0(objM87133R23);
                                    } else {
                                        function17 = function14;
                                    }
                                    InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R23;
                                    int i38 = TextResource.$stable;
                                    C28655q c28655q6 = c28655q2;
                                    AbstractC21211n.m59497o(null, textResourceM107671d2, textResourceM107668a2, textResourceM107669b2, false, interfaceC39332eM125323a2, null, null, null, textResourceM107670c2, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a7, null, interfaceC4339a8, null, null, null, c28655q6, (i38 << 3) | (i38 << 6) | (i38 << 9) | (i38 << 27), 0, 384, 247463377);
                                    c28655q3 = c28655q6;
                                    z13 = false;
                                    c28655q3.m87173q(false);
                                }
                                c28655q3.m87173q(z13);
                            } else {
                                i26 = i26;
                                c28655q3 = c28655q2;
                                interfaceC28601c15 = interfaceC28601c3;
                                c15199y3M3460c = c15199y3M3460c;
                                function17 = function14;
                                c28655q3.m87150e0(-1781986764);
                                c28655q3.m87173q(z13);
                            }
                            if (m115769M0(interfaceC28601c11)) {
                                c28655q3.m87150e0(-2135689437);
                                c34064dM107693f = c34070j.getHormonalInsightsContraceptionConfirmDialog();
                                if (c34064dM107693f == null) {
                                    c28655q3.m87150e0(-1781863106);
                                    c28655q3.m87173q(z13);
                                    interfaceC28601c15 = interfaceC28601c15;
                                    interfaceC28601c16 = interfaceC28601c11;
                                } else {
                                    c28655q3.m87150e0(-1781863105);
                                    TextResource textResourceM107671d3 = c34064dM107693f.getTitleDisplay();
                                    TextResource textResourceM107668a3 = c34064dM107693f.getDescriptionDisplay();
                                    TextResource textResourceM107669b3 = c34064dM107693f.getPrimaryButtonTitle();
                                    objM87133R18 = c28655q3.m87133R();
                                    if (objM87133R18 == c28676v0) {
                                        objM87133R18 = g.f155357w;
                                        c28655q3.m87172p0(objM87133R18);
                                    }
                                    InterfaceC39332e interfaceC39332eM125323a3 = p745y81.Function1.m125323a((Function1) objM87133R18);
                                    TextResource textResourceM107670c3 = c34064dM107693f.getSecondaryButtonTitle();
                                    objM87133R19 = c28655q3.m87133R();
                                    if (objM87133R19 == c28676v0) {
                                        interfaceC28601c16 = interfaceC28601c11;
                                        objM87133R19 = new C36269e(2, interfaceC28601c16);
                                        c28655q3.m87172p0(objM87133R19);
                                    } else {
                                        interfaceC28601c16 = interfaceC28601c11;
                                    }
                                    InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R19;
                                    if ((i25 & 7168) == 2048) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    boolean z25 = z14;
                                    if ((i25 & 112) == 32) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    z16 = z25 | z15;
                                    objM87133R20 = c28655q3.m87133R();
                                    if (z16 || objM87133R20 == c28676v0) {
                                        objM87133R20 = new C36238m(function17, interfaceC28601c16, interfaceC28601c7, function15);
                                        c28655q3.m87172p0(objM87133R20);
                                    }
                                    int i39 = TextResource.$stable;
                                    AbstractC21211n.m59497o(null, textResourceM107671d3, textResourceM107668a3, textResourceM107669b3, false, interfaceC39332eM125323a3, null, null, null, textResourceM107670c3, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a9, null, (InterfaceC4339a) objM87133R20, null, null, null, c28655q3, (i39 << 3) | (i39 << 6) | (i39 << 9) | (i39 << 27), 0, 384, 247463377);
                                    z13 = false;
                                    c28655q3.m87173q(false);
                                }
                                c28655q3.m87173q(z13);
                            } else {
                                interfaceC28601c15 = interfaceC28601c15;
                                interfaceC28601c16 = interfaceC28601c11;
                                c28655q3.m87150e0(-1781068172);
                                c28655q3.m87173q(z13);
                            }
                            if (m115775O0(interfaceC28601c14)) {
                                anyModalM107690c = c34070j.getEnablePregnancyInsightsConfirmation();
                            } else {
                                anyModalM107690c = null;
                            }
                            if ((i25 & 896) == 256) {
                                z13 = true;
                            }
                            objM87133R16 = c28655q3.m87133R();
                            if (z13 || objM87133R16 == c28676v0) {
                                objM87133R16 = new C28827b(function16, interfaceC28601c14, 13);
                                c28655q3.m87172p0(objM87133R16);
                            }
                            InterfaceC28601c1 interfaceC28601c22 = interfaceC28601c16;
                            Function1 function18 = function17;
                            c28676v1 = c28676v0;
                            Function1 function19 = function16;
                            InterfaceC28601c1 interfaceC28601c23 = interfaceC28601c9;
                            Function1 function20 = function15;
                            interfaceC28601c17 = interfaceC28601c1;
                            i27 = 2;
                            C15199y3 c15199y3 = c15199y3M3460c;
                            AbstractC0564o.m1394P(anyModalM107690c, (Function1) objM87133R16, null, null, null, null, c28655q3, i26, 60);
                            c28655q4 = c28655q3;
                            enumC36265aM115737B1 = m115737B1(interfaceC28601c17);
                            if (enumC36265aM115737B1 == null) {
                                i28 = -1;
                            } else {
                                i28 = n0.f155394a[enumC36265aM115737B1.ordinal()];
                            }
                            modifierM3599a = C2314t.f9131w;
                            if (i28 != -1) {
                                if (i28 != 1) {
                                    modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "ModeBottomSheetTag");
                                } else if (i28 != 2) {
                                    modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "ContraceptionBottomSheetTag");
                                } else if (i28 != 3) {
                                    modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "PreviousPregnanciesBottomSheetTag");
                                } else if (i28 != 4) {
                                    modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "FertilityInsightsDisableSurveyBottomSheetTag");
                                } else {
                                    if (i28 == 5) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "GoalsBottomSheetTag");
                                }
                            }
                            Modifier modifier = modifierM3599a;
                            enumC36265aM115737B2 = m115737B1(interfaceC28601c17);
                            if (enumC36265aM115737B2 == null) {
                                i29 = -1;
                            } else {
                                i29 = n0.f155394a[enumC36265aM115737B2.ordinal()];
                            }
                            if (i29 != -1) {
                                c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                            } else if (i29 != 1) {
                                c35666g = new C35666g(c34070j.getHormonalInsightsModeBottomSheet().getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, i27, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                            } else if (i29 != 2) {
                                textResource = null;
                                objArr = 0;
                                c34063cM107692e = c34070j.getHormonalInsightsContraceptionBottomSheet();
                                if (c34063cM107692e != null) {
                                    c35666g = new C35666g(c34063cM107692e.getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, i27, objArr == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                                } else {
                                    c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                                    c35666g = c35666g2;
                                }
                            } else if (i29 != 3) {
                                c34077qM107699l = c34070j.getPreviousPregnancies();
                                if (c34077qM107699l != null) {
                                    c35666g = new C35666g(c34077qM107699l.getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, i27, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                                } else {
                                    c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                                    c35666g = c35666g2;
                                }
                            } else if (i29 != 4) {
                                c34063cM107688a = c34070j.getDisableFertilityInsightsSurveyDrawer();
                                if (c34063cM107688a != null) {
                                    c35666g = new C35666g(c34063cM107688a.getTitleDisplay(), null, null, null, null, 0.0f, 0.0f, 126, null);
                                } else {
                                    c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                                    c35666g = c35666g2;
                                }
                            } else {
                                if (i29 == 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                            }
                            AbstractC35664f.a aVar = new AbstractC35664f.a(c15199y3);
                            objM87133R17 = c28655q4.m87133R();
                            if (objM87133R17 == c28676v1) {
                                objM87133R17 = new C36269e(4, interfaceC28601c17);
                                c28655q4.m87172p0(objM87133R17);
                            }
                            C37816b c37816bM121344e = AbstractC37817c.m121344e(409951292, c28655q4, new C29316o(c34070j, interfaceC28601c17, interfaceC28601c6, interfaceC28601c15, interfaceC28601c7, interfaceC28601c22, function19, function20, interfaceC28601c12, interfaceC28601c13));
                            InterfaceC4339a interfaceC4339a10 = interfaceC4339a4;
                            c28655q = c28655q4;
                            AbstractC35660d.m112871m(modifier, c35666g, aVar, null, (InterfaceC4339a) objM87133R17, null, null, c37816bM121344e, false, null, null, null, false, null, AbstractC37817c.m121344e(1279555584, c28655q4, new C14076n(c34070j, function19, function20, interfaceC4339a10, function18, interfaceC28601c20, interfaceC28601c19, interfaceC28601c23, interfaceC28601c17)), c28655q, (C35666g.f151591h << 3) | 12607488 | (AbstractC35664f.a.f151587c << 6), 24576, 16232);
                            interfaceC4339a3 = interfaceC4339a10;
                            function8 = function19;
                            function7 = function20;
                            function9 = function18;
                        } else {
                            c28655q = c28655q5;
                            c28655q.m87138X();
                            function7 = function4;
                            function8 = function5;
                            function9 = function6;
                            interfaceC4339a3 = interfaceC4339a2;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C35766g((Object) c34070j, function7, function8, function9, (InterfaceC23459e) interfaceC4339a3, i13, i14, 2);
                        }
                    }
                    i34 |= 24576;
                    interfaceC4339a2 = interfaceC4339a;
                    if ((i34 & 9363) != 9362) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q5.m87135U(i34 & 1, z4)) {
                        c28676v0 = C28635l.f115821a;
                        if (i35 != 0) {
                            objM87133R30 = c28655q5.m87133R();
                            if (objM87133R30 == c28676v0) {
                                objM87133R30 = new C36244s(15);
                                c28655q5.m87172p0(objM87133R30);
                            }
                            function10 = (Function1) objM87133R30;
                        } else {
                            function10 = function4;
                        }
                        if (i15 != 0) {
                            objM87133R29 = c28655q5.m87133R();
                            if (objM87133R29 == c28676v0) {
                                objM87133R29 = new C36244s(9);
                                c28655q5.m87172p0(objM87133R29);
                            }
                            function11 = (Function1) objM87133R29;
                        } else {
                            function11 = function5;
                        }
                        if (i17 != 0) {
                            objM87133R28 = c28655q5.m87133R();
                            if (objM87133R28 == c28676v0) {
                                objM87133R28 = new C36244s(10);
                                c28655q5.m87172p0(objM87133R28);
                            }
                            function12 = (Function1) objM87133R28;
                        } else {
                            function12 = function6;
                        }
                        if (i19 != 0) {
                            objM87133R27 = c28655q5.m87133R();
                            if (objM87133R27 == c28676v0) {
                                objM87133R27 = new C35916a(23);
                                c28655q5.m87172p0(objM87133R27);
                            }
                            interfaceC4339a4 = (InterfaceC4339a) objM87133R27;
                        } else {
                            interfaceC4339a4 = interfaceC4339a2;
                        }
                        objM87133R = c28655q5.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87262p(c28655q5);
                            c28655q5.m87172p0(objM87133R);
                        }
                        interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                        function13 = function11;
                        function14 = function12;
                        c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q5, 3078, 6);
                        if (viewState.getDisableFertilityInsightsSurveyDrawer() != null) {
                            enumC36265a = EnumC36265a.FERTILITY_INSIGHTS_DISABLE_SURVEY;
                        } else {
                            enumC36265a = null;
                        }
                        objM87133R2 = c28655q5.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(enumC36265a);
                            c28655q5.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        objM87133R3 = c28655q5.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q5.m87172p0(objM87133R3);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                        objM87133R4 = c28655q5.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q5.m87172p0(objM87133R4);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
                        objM87133R5 = c28655q5.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q5.m87172p0(objM87133R5);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM87133R5;
                        objM87133R6 = c28655q5.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q5.m87172p0(objM87133R6);
                        }
                        interfaceC28601c5 = (InterfaceC28601c1) objM87133R6;
                        objM87133R7 = c28655q5.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsShowCycleOverlayOn()));
                            c28655q5.m87172p0(objM87133R7);
                        }
                        InterfaceC28601c1 interfaceC28601c110 = (InterfaceC28601c1) objM87133R7;
                        objM87133R8 = c28655q5.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsHormonalInsightsOn()));
                            c28655q5.m87172p0(objM87133R8);
                        }
                        InterfaceC28601c1 interfaceC28601c24 = (InterfaceC28601c1) objM87133R8;
                        objM87133R9 = c28655q5.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = AbstractC28683x.m87272z(viewState.getSelectedMode());
                            c28655q5.m87172p0(objM87133R9);
                        }
                        interfaceC28601c6 = (InterfaceC28601c1) objM87133R9;
                        objM87133R10 = c28655q5.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = AbstractC28683x.m87272z(viewState.getSelectedContraceptionType());
                            c28655q5.m87172p0(objM87133R10);
                        }
                        interfaceC28601c7 = (InterfaceC28601c1) objM87133R10;
                        i25 = i34;
                        objM87133R11 = c28655q5.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = AbstractC28683x.m87272z(null);
                            c28655q5.m87172p0(objM87133R11);
                        }
                        interfaceC28601c8 = (InterfaceC28601c1) objM87133R11;
                        objM87133R12 = c28655q5.m87133R();
                        if (objM87133R12 == c28676v0) {
                            c34066fM107691d = viewState.getGoalsDrawer();
                            if (c34066fM107691d != null) {
                                interfaceC28601c9 = interfaceC28601c2;
                                objM74103I1 = C25235a0.f99113w;
                            } else {
                                interfaceC28601c9 = interfaceC28601c2;
                                objM74103I1 = C25235a0.f99113w;
                            }
                            objM87133R12 = AbstractC28683x.m87272z(objM74103I1);
                            c28655q5.m87172p0(objM87133R12);
                        } else {
                            interfaceC28601c9 = interfaceC28601c2;
                            interfaceC28601c3 = interfaceC28601c3;
                        }
                        interfaceC28601c10 = (InterfaceC28601c1) objM87133R12;
                        EnumC36265a enumC36265aM115737B4 = m115737B1(interfaceC28601c1);
                        zM87157i = c28655q5.m87157i(interfaceC2994c0) | c28655q5.m87157i(c15199y3M3460c);
                        objM87133R13 = c28655q5.m87133R();
                        if (zM87157i) {
                            objM87133R13 = new t(interfaceC2994c0, c15199y3M3460c, interfaceC28601c1, null);
                            c28655q5.m87172p0(objM87133R13);
                        } else {
                            objM87133R13 = new t(interfaceC2994c0, c15199y3M3460c, interfaceC28601c1, null);
                            c28655q5.m87172p0(objM87133R13);
                        }
                        AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R13, enumC36265aM115737B4);
                        zM87157i2 = c28655q5.m87157i(c15199y3M3460c) | c28655q5.m87157i(viewState);
                        objM87133R14 = c28655q5.m87133R();
                        if (zM87157i2) {
                            interfaceC28601c11 = interfaceC28601c4;
                            u uVar2 = new u(c15199y3M3460c, viewState, interfaceC28601c1, interfaceC28601c8, interfaceC28601c10, null);
                            c15199y3M3460c = c15199y3M3460c;
                            viewState = viewState;
                            interfaceC28601c12 = interfaceC28601c8;
                            interfaceC28601c13 = interfaceC28601c10;
                            c28655q5.m87172p0(uVar2);
                            objM87133R14 = uVar2;
                        } else {
                            interfaceC28601c11 = interfaceC28601c4;
                            u uVar3 = new u(c15199y3M3460c, viewState, interfaceC28601c1, interfaceC28601c8, interfaceC28601c10, null);
                            c15199y3M3460c = c15199y3M3460c;
                            viewState = viewState;
                            interfaceC28601c12 = interfaceC28601c8;
                            interfaceC28601c13 = interfaceC28601c10;
                            c28655q5.m87172p0(uVar3);
                            objM87133R14 = uVar3;
                        }
                        AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R14, c15199y3M3460c);
                        AnyModal anyModalM107690c3 = viewState.getEnablePregnancyInsightsConfirmation();
                        zM87157i3 = c28655q5.m87157i(viewState);
                        objM87133R15 = c28655q5.m87133R();
                        if (zM87157i3) {
                            objM87133R15 = new v(viewState, interfaceC28601c5, null);
                            c28655q5.m87172p0(objM87133R15);
                        } else {
                            objM87133R15 = new v(viewState, interfaceC28601c5, null);
                            c28655q5.m87172p0(objM87133R15);
                        }
                        i26 = AnyModal.$stable;
                        AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R15, anyModalM107690c3);
                        if (m115743D1(interfaceC28601c9)) {
                            c28655q5.m87150e0(-2135741304);
                            c34064dM107694g = viewState.getHormonalInsightsDisablingConfirmDialog();
                            if (c34064dM107694g == null) {
                                c28655q5.m87150e0(-1783470983);
                                c28655q5.m87173q(false);
                                interfaceC28601c1 = interfaceC28601c1;
                                interfaceC28601c14 = interfaceC28601c5;
                                function16 = function13;
                                z13 = false;
                                c28655q2 = c28655q5;
                                function15 = function10;
                            } else {
                                c28655q5.m87150e0(-1783470982);
                                TextResource textResourceM107671d4 = c34064dM107694g.getTitleDisplay();
                                TextResource textResourceM107668a4 = c34064dM107694g.getDescriptionDisplay();
                                TextResource textResourceM107669b4 = c34064dM107694g.getPrimaryButtonTitle();
                                objM87133R24 = c28655q5.m87133R();
                                if (objM87133R24 == c28676v0) {
                                    objM87133R24 = w.f155428w;
                                    c28655q5.m87172p0(objM87133R24);
                                }
                                InterfaceC39332e interfaceC39332eM125323a4 = p745y81.Function1.m125323a((Function1) objM87133R24);
                                TextResource textResourceM107670c4 = c34064dM107694g.getSecondaryButtonTitle();
                                objM87133R25 = c28655q5.m87133R();
                                if (objM87133R25 == c28676v0) {
                                    interfaceC28601c18 = interfaceC28601c9;
                                    objM87133R25 = new C36269e(0, interfaceC28601c18);
                                    c28655q5.m87172p0(objM87133R25);
                                } else {
                                    interfaceC28601c18 = interfaceC28601c9;
                                }
                                InterfaceC4339a interfaceC4339a11 = (InterfaceC4339a) objM87133R25;
                                if ((i25 & 112) == 32) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                                objM87133R26 = c28655q5.m87133R();
                                if (z24) {
                                    objM87133R26 = new C25504c(interfaceC28601c18, interfaceC28601c6, function10);
                                    c28655q5.m87172p0(objM87133R26);
                                } else {
                                    objM87133R26 = new C25504c(interfaceC28601c18, interfaceC28601c6, function10);
                                    c28655q5.m87172p0(objM87133R26);
                                }
                                InterfaceC4339a interfaceC4339a12 = (InterfaceC4339a) objM87133R26;
                                int i310 = TextResource.$stable;
                                int i311 = (i310 << 3) | (i310 << 6) | (i310 << 9) | (i310 << 27);
                                interfaceC28601c9 = interfaceC28601c18;
                                interfaceC28601c14 = interfaceC28601c5;
                                function15 = function10;
                                function16 = function13;
                                AbstractC21211n.m59497o(null, textResourceM107671d4, textResourceM107668a4, textResourceM107669b4, false, interfaceC39332eM125323a4, null, null, null, textResourceM107670c4, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a11, null, interfaceC4339a12, null, null, null, c28655q5, i311, 0, 384, 247463377);
                                c28655q2 = c28655q5;
                                z13 = false;
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(z13);
                        } else {
                            interfaceC28601c1 = interfaceC28601c1;
                            interfaceC28601c14 = interfaceC28601c5;
                            c28676v0 = c28676v0;
                            function15 = function10;
                            function16 = function13;
                            z13 = false;
                            c28655q2 = c28655q5;
                            c28655q2.m87150e0(-1782794252);
                            c28655q2.m87173q(false);
                        }
                        if (m115763K0(interfaceC28601c3)) {
                            c28655q2.m87150e0(-2135716155);
                            c34064dM107696i = c34070j.getHormonalInsightsModeConfirmDialog();
                            if (c34064dM107696i == null) {
                                c28655q2.m87150e0(-1782691364);
                                c28655q2.m87173q(z13);
                                i26 = i26;
                                c28655q3 = c28655q2;
                                interfaceC28601c15 = interfaceC28601c3;
                                function17 = function14;
                            } else {
                                c28655q2.m87150e0(-1782691363);
                                TextResource textResourceM107671d5 = c34064dM107696i.getTitleDisplay();
                                TextResource textResourceM107668a5 = c34064dM107696i.getDescriptionDisplay();
                                TextResource textResourceM107669b5 = c34064dM107696i.getPrimaryButtonTitle();
                                objM87133R21 = c28655q2.m87133R();
                                if (objM87133R21 == c28676v0) {
                                    objM87133R21 = x.f155429w;
                                    c28655q2.m87172p0(objM87133R21);
                                }
                                InterfaceC39332e interfaceC39332eM125323a5 = p745y81.Function1.m125323a((Function1) objM87133R21);
                                TextResource textResourceM107670c5 = c34064dM107696i.getSecondaryButtonTitle();
                                objM87133R22 = c28655q2.m87133R();
                                if (objM87133R22 == c28676v0) {
                                    interfaceC28601c15 = interfaceC28601c3;
                                    objM87133R22 = new C36269e(1, interfaceC28601c15);
                                    c28655q2.m87172p0(objM87133R22);
                                } else {
                                    interfaceC28601c15 = interfaceC28601c3;
                                }
                                InterfaceC4339a interfaceC4339a13 = (InterfaceC4339a) objM87133R22;
                                if ((i25 & 7168) == 2048) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                if ((i25 & 896) == 256) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                z19 = z18 | z17;
                                objM87133R23 = c28655q2.m87133R();
                                if (z19) {
                                    function17 = function14;
                                    objM87133R23 = new C36238m(function17, function16, interfaceC28601c15, interfaceC28601c6);
                                    c28655q2.m87172p0(objM87133R23);
                                } else {
                                    function17 = function14;
                                    objM87133R23 = new C36238m(function17, function16, interfaceC28601c15, interfaceC28601c6);
                                    c28655q2.m87172p0(objM87133R23);
                                }
                                InterfaceC4339a interfaceC4339a14 = (InterfaceC4339a) objM87133R23;
                                int i312 = TextResource.$stable;
                                C28655q c28655q7 = c28655q2;
                                AbstractC21211n.m59497o(null, textResourceM107671d5, textResourceM107668a5, textResourceM107669b5, false, interfaceC39332eM125323a5, null, null, null, textResourceM107670c5, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a13, null, interfaceC4339a14, null, null, null, c28655q7, (i312 << 3) | (i312 << 6) | (i312 << 9) | (i312 << 27), 0, 384, 247463377);
                                c28655q3 = c28655q7;
                                z13 = false;
                                c28655q3.m87173q(false);
                            }
                            c28655q3.m87173q(z13);
                        } else {
                            i26 = i26;
                            c28655q3 = c28655q2;
                            interfaceC28601c15 = interfaceC28601c3;
                            c15199y3M3460c = c15199y3M3460c;
                            function17 = function14;
                            c28655q3.m87150e0(-1781986764);
                            c28655q3.m87173q(z13);
                        }
                        if (m115769M0(interfaceC28601c11)) {
                            c28655q3.m87150e0(-2135689437);
                            c34064dM107693f = c34070j.getHormonalInsightsContraceptionConfirmDialog();
                            if (c34064dM107693f == null) {
                                c28655q3.m87150e0(-1781863106);
                                c28655q3.m87173q(z13);
                                interfaceC28601c15 = interfaceC28601c15;
                                interfaceC28601c16 = interfaceC28601c11;
                            } else {
                                c28655q3.m87150e0(-1781863105);
                                TextResource textResourceM107671d6 = c34064dM107693f.getTitleDisplay();
                                TextResource textResourceM107668a6 = c34064dM107693f.getDescriptionDisplay();
                                TextResource textResourceM107669b6 = c34064dM107693f.getPrimaryButtonTitle();
                                objM87133R18 = c28655q3.m87133R();
                                if (objM87133R18 == c28676v0) {
                                    objM87133R18 = g.f155357w;
                                    c28655q3.m87172p0(objM87133R18);
                                }
                                InterfaceC39332e interfaceC39332eM125323a6 = p745y81.Function1.m125323a((Function1) objM87133R18);
                                TextResource textResourceM107670c6 = c34064dM107693f.getSecondaryButtonTitle();
                                objM87133R19 = c28655q3.m87133R();
                                if (objM87133R19 == c28676v0) {
                                    interfaceC28601c16 = interfaceC28601c11;
                                    objM87133R19 = new C36269e(2, interfaceC28601c16);
                                    c28655q3.m87172p0(objM87133R19);
                                } else {
                                    interfaceC28601c16 = interfaceC28601c11;
                                }
                                InterfaceC4339a interfaceC4339a15 = (InterfaceC4339a) objM87133R19;
                                if ((i25 & 7168) == 2048) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                boolean z26 = z14;
                                if ((i25 & 112) == 32) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                z16 = z26 | z15;
                                objM87133R20 = c28655q3.m87133R();
                                if (z16) {
                                    objM87133R20 = new C36238m(function17, interfaceC28601c16, interfaceC28601c7, function15);
                                    c28655q3.m87172p0(objM87133R20);
                                } else {
                                    objM87133R20 = new C36238m(function17, interfaceC28601c16, interfaceC28601c7, function15);
                                    c28655q3.m87172p0(objM87133R20);
                                }
                                int i313 = TextResource.$stable;
                                AbstractC21211n.m59497o(null, textResourceM107671d6, textResourceM107668a6, textResourceM107669b6, false, interfaceC39332eM125323a6, null, null, null, textResourceM107670c6, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a15, null, (InterfaceC4339a) objM87133R20, null, null, null, c28655q3, (i313 << 3) | (i313 << 6) | (i313 << 9) | (i313 << 27), 0, 384, 247463377);
                                z13 = false;
                                c28655q3.m87173q(false);
                            }
                            c28655q3.m87173q(z13);
                        } else {
                            interfaceC28601c15 = interfaceC28601c15;
                            interfaceC28601c16 = interfaceC28601c11;
                            c28655q3.m87150e0(-1781068172);
                            c28655q3.m87173q(z13);
                        }
                        if (m115775O0(interfaceC28601c14)) {
                            anyModalM107690c = c34070j.getEnablePregnancyInsightsConfirmation();
                        } else {
                            anyModalM107690c = null;
                        }
                        if ((i25 & 896) == 256) {
                            z13 = true;
                        }
                        objM87133R16 = c28655q3.m87133R();
                        if (z13) {
                            objM87133R16 = new C28827b(function16, interfaceC28601c14, 13);
                            c28655q3.m87172p0(objM87133R16);
                        } else {
                            objM87133R16 = new C28827b(function16, interfaceC28601c14, 13);
                            c28655q3.m87172p0(objM87133R16);
                        }
                        InterfaceC28601c1 interfaceC28601c25 = interfaceC28601c16;
                        Function1 function110 = function17;
                        c28676v1 = c28676v0;
                        Function1 function111 = function16;
                        InterfaceC28601c1 interfaceC28601c26 = interfaceC28601c9;
                        Function1 function21 = function15;
                        interfaceC28601c17 = interfaceC28601c1;
                        i27 = 2;
                        C15199y3 c15199y4 = c15199y3M3460c;
                        AbstractC0564o.m1394P(anyModalM107690c, (Function1) objM87133R16, null, null, null, null, c28655q3, i26, 60);
                        c28655q4 = c28655q3;
                        enumC36265aM115737B1 = m115737B1(interfaceC28601c17);
                        if (enumC36265aM115737B1 == null) {
                            i28 = -1;
                        } else {
                            i28 = n0.f155394a[enumC36265aM115737B1.ordinal()];
                        }
                        modifierM3599a = C2314t.f9131w;
                        if (i28 != -1) {
                            if (i28 != 1) {
                                modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "ModeBottomSheetTag");
                            } else if (i28 != 2) {
                                modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "ContraceptionBottomSheetTag");
                            } else if (i28 != 3) {
                                modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "PreviousPregnanciesBottomSheetTag");
                            } else if (i28 != 4) {
                                modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "FertilityInsightsDisableSurveyBottomSheetTag");
                            } else {
                                if (i28 == 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "GoalsBottomSheetTag");
                            }
                        }
                        Modifier modifier2 = modifierM3599a;
                        enumC36265aM115737B2 = m115737B1(interfaceC28601c17);
                        if (enumC36265aM115737B2 == null) {
                            i29 = -1;
                        } else {
                            i29 = n0.f155394a[enumC36265aM115737B2.ordinal()];
                        }
                        if (i29 != -1) {
                            c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                        } else if (i29 != 1) {
                            c35666g = new C35666g(c34070j.getHormonalInsightsModeBottomSheet().getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, i27, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                        } else if (i29 != 2) {
                            textResource = null;
                            objArr = 0;
                            c34063cM107692e = c34070j.getHormonalInsightsContraceptionBottomSheet();
                            if (c34063cM107692e != null) {
                                c35666g = new C35666g(c34063cM107692e.getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, i27, objArr == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                            } else {
                                c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                                c35666g = c35666g2;
                            }
                        } else if (i29 != 3) {
                            c34077qM107699l = c34070j.getPreviousPregnancies();
                            if (c34077qM107699l != null) {
                                c35666g = new C35666g(c34077qM107699l.getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, i27, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                            } else {
                                c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                                c35666g = c35666g2;
                            }
                        } else if (i29 != 4) {
                            c34063cM107688a = c34070j.getDisableFertilityInsightsSurveyDrawer();
                            if (c34063cM107688a != null) {
                                c35666g = new C35666g(c34063cM107688a.getTitleDisplay(), null, null, null, null, 0.0f, 0.0f, 126, null);
                            } else {
                                c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                                c35666g = c35666g2;
                            }
                        } else {
                            if (i29 == 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                        }
                        AbstractC35664f.a aVar2 = new AbstractC35664f.a(c15199y4);
                        objM87133R17 = c28655q4.m87133R();
                        if (objM87133R17 == c28676v1) {
                            objM87133R17 = new C36269e(4, interfaceC28601c17);
                            c28655q4.m87172p0(objM87133R17);
                        }
                        C37816b c37816bM121344e2 = AbstractC37817c.m121344e(409951292, c28655q4, new C29316o(c34070j, interfaceC28601c17, interfaceC28601c6, interfaceC28601c15, interfaceC28601c7, interfaceC28601c25, function111, function21, interfaceC28601c12, interfaceC28601c13));
                        InterfaceC4339a interfaceC4339a16 = interfaceC4339a4;
                        c28655q = c28655q4;
                        AbstractC35660d.m112871m(modifier2, c35666g, aVar2, null, (InterfaceC4339a) objM87133R17, null, null, c37816bM121344e2, false, null, null, null, false, null, AbstractC37817c.m121344e(1279555584, c28655q4, new C14076n(c34070j, function111, function21, interfaceC4339a16, function110, interfaceC28601c24, interfaceC28601c110, interfaceC28601c26, interfaceC28601c17)), c28655q, (C35666g.f151591h << 3) | 12607488 | (AbstractC35664f.a.f151587c << 6), 24576, 16232);
                        interfaceC4339a3 = interfaceC4339a16;
                        function8 = function111;
                        function7 = function21;
                        function9 = function110;
                    } else {
                        c28655q = c28655q5;
                        c28655q.m87138X();
                        function7 = function4;
                        function8 = function5;
                        function9 = function6;
                        interfaceC4339a3 = interfaceC4339a2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C35766g((Object) c34070j, function7, function8, function9, (InterfaceC23459e) interfaceC4339a3, i13, i14, 2);
                    }
                }
                i34 |= 3072;
                function6 = function3;
                i19 = i14 & 16;
                if (i19 != 0) {
                    if ((i13 & 24576) == 0) {
                        interfaceC4339a2 = interfaceC4339a;
                        if (c28655q5.m87157i(interfaceC4339a2)) {
                            i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i24 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i34 |= i24;
                    }
                    if ((i34 & 9363) != 9362) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q5.m87135U(i34 & 1, z4)) {
                        c28676v0 = C28635l.f115821a;
                        if (i35 != 0) {
                            objM87133R30 = c28655q5.m87133R();
                            if (objM87133R30 == c28676v0) {
                                objM87133R30 = new C36244s(15);
                                c28655q5.m87172p0(objM87133R30);
                            }
                            function10 = (Function1) objM87133R30;
                        } else {
                            function10 = function4;
                        }
                        if (i15 != 0) {
                            objM87133R29 = c28655q5.m87133R();
                            if (objM87133R29 == c28676v0) {
                                objM87133R29 = new C36244s(9);
                                c28655q5.m87172p0(objM87133R29);
                            }
                            function11 = (Function1) objM87133R29;
                        } else {
                            function11 = function5;
                        }
                        if (i17 != 0) {
                            objM87133R28 = c28655q5.m87133R();
                            if (objM87133R28 == c28676v0) {
                                objM87133R28 = new C36244s(10);
                                c28655q5.m87172p0(objM87133R28);
                            }
                            function12 = (Function1) objM87133R28;
                        } else {
                            function12 = function6;
                        }
                        if (i19 != 0) {
                            objM87133R27 = c28655q5.m87133R();
                            if (objM87133R27 == c28676v0) {
                                objM87133R27 = new C35916a(23);
                                c28655q5.m87172p0(objM87133R27);
                            }
                            interfaceC4339a4 = (InterfaceC4339a) objM87133R27;
                        } else {
                            interfaceC4339a4 = interfaceC4339a2;
                        }
                        objM87133R = c28655q5.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87262p(c28655q5);
                            c28655q5.m87172p0(objM87133R);
                        }
                        interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                        function13 = function11;
                        function14 = function12;
                        c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q5, 3078, 6);
                        if (viewState.getDisableFertilityInsightsSurveyDrawer() != null) {
                            enumC36265a = EnumC36265a.FERTILITY_INSIGHTS_DISABLE_SURVEY;
                        } else {
                            enumC36265a = null;
                        }
                        objM87133R2 = c28655q5.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(enumC36265a);
                            c28655q5.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        objM87133R3 = c28655q5.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q5.m87172p0(objM87133R3);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                        objM87133R4 = c28655q5.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q5.m87172p0(objM87133R4);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
                        objM87133R5 = c28655q5.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q5.m87172p0(objM87133R5);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM87133R5;
                        objM87133R6 = c28655q5.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q5.m87172p0(objM87133R6);
                        }
                        interfaceC28601c5 = (InterfaceC28601c1) objM87133R6;
                        objM87133R7 = c28655q5.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsShowCycleOverlayOn()));
                            c28655q5.m87172p0(objM87133R7);
                        }
                        InterfaceC28601c1 interfaceC28601c111 = (InterfaceC28601c1) objM87133R7;
                        objM87133R8 = c28655q5.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsHormonalInsightsOn()));
                            c28655q5.m87172p0(objM87133R8);
                        }
                        InterfaceC28601c1 interfaceC28601c27 = (InterfaceC28601c1) objM87133R8;
                        objM87133R9 = c28655q5.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = AbstractC28683x.m87272z(viewState.getSelectedMode());
                            c28655q5.m87172p0(objM87133R9);
                        }
                        interfaceC28601c6 = (InterfaceC28601c1) objM87133R9;
                        objM87133R10 = c28655q5.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = AbstractC28683x.m87272z(viewState.getSelectedContraceptionType());
                            c28655q5.m87172p0(objM87133R10);
                        }
                        interfaceC28601c7 = (InterfaceC28601c1) objM87133R10;
                        i25 = i34;
                        objM87133R11 = c28655q5.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = AbstractC28683x.m87272z(null);
                            c28655q5.m87172p0(objM87133R11);
                        }
                        interfaceC28601c8 = (InterfaceC28601c1) objM87133R11;
                        objM87133R12 = c28655q5.m87133R();
                        if (objM87133R12 == c28676v0) {
                            c34066fM107691d = viewState.getGoalsDrawer();
                            if (c34066fM107691d != null) {
                                interfaceC28601c9 = interfaceC28601c2;
                                objM74103I1 = C25235a0.f99113w;
                            } else {
                                interfaceC28601c9 = interfaceC28601c2;
                                objM74103I1 = C25235a0.f99113w;
                            }
                            objM87133R12 = AbstractC28683x.m87272z(objM74103I1);
                            c28655q5.m87172p0(objM87133R12);
                        } else {
                            interfaceC28601c9 = interfaceC28601c2;
                            interfaceC28601c3 = interfaceC28601c3;
                        }
                        interfaceC28601c10 = (InterfaceC28601c1) objM87133R12;
                        EnumC36265a enumC36265aM115737B5 = m115737B1(interfaceC28601c1);
                        zM87157i = c28655q5.m87157i(interfaceC2994c0) | c28655q5.m87157i(c15199y3M3460c);
                        objM87133R13 = c28655q5.m87133R();
                        if (zM87157i) {
                            objM87133R13 = new t(interfaceC2994c0, c15199y3M3460c, interfaceC28601c1, null);
                            c28655q5.m87172p0(objM87133R13);
                        } else {
                            objM87133R13 = new t(interfaceC2994c0, c15199y3M3460c, interfaceC28601c1, null);
                            c28655q5.m87172p0(objM87133R13);
                        }
                        AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R13, enumC36265aM115737B5);
                        zM87157i2 = c28655q5.m87157i(c15199y3M3460c) | c28655q5.m87157i(viewState);
                        objM87133R14 = c28655q5.m87133R();
                        if (zM87157i2) {
                            interfaceC28601c11 = interfaceC28601c4;
                            u uVar4 = new u(c15199y3M3460c, viewState, interfaceC28601c1, interfaceC28601c8, interfaceC28601c10, null);
                            c15199y3M3460c = c15199y3M3460c;
                            viewState = viewState;
                            interfaceC28601c12 = interfaceC28601c8;
                            interfaceC28601c13 = interfaceC28601c10;
                            c28655q5.m87172p0(uVar4);
                            objM87133R14 = uVar4;
                        } else {
                            interfaceC28601c11 = interfaceC28601c4;
                            u uVar5 = new u(c15199y3M3460c, viewState, interfaceC28601c1, interfaceC28601c8, interfaceC28601c10, null);
                            c15199y3M3460c = c15199y3M3460c;
                            viewState = viewState;
                            interfaceC28601c12 = interfaceC28601c8;
                            interfaceC28601c13 = interfaceC28601c10;
                            c28655q5.m87172p0(uVar5);
                            objM87133R14 = uVar5;
                        }
                        AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R14, c15199y3M3460c);
                        AnyModal anyModalM107690c4 = viewState.getEnablePregnancyInsightsConfirmation();
                        zM87157i3 = c28655q5.m87157i(viewState);
                        objM87133R15 = c28655q5.m87133R();
                        if (zM87157i3) {
                            objM87133R15 = new v(viewState, interfaceC28601c5, null);
                            c28655q5.m87172p0(objM87133R15);
                        } else {
                            objM87133R15 = new v(viewState, interfaceC28601c5, null);
                            c28655q5.m87172p0(objM87133R15);
                        }
                        i26 = AnyModal.$stable;
                        AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R15, anyModalM107690c4);
                        if (m115743D1(interfaceC28601c9)) {
                            c28655q5.m87150e0(-2135741304);
                            c34064dM107694g = viewState.getHormonalInsightsDisablingConfirmDialog();
                            if (c34064dM107694g == null) {
                                c28655q5.m87150e0(-1783470983);
                                c28655q5.m87173q(false);
                                interfaceC28601c1 = interfaceC28601c1;
                                interfaceC28601c14 = interfaceC28601c5;
                                function16 = function13;
                                z13 = false;
                                c28655q2 = c28655q5;
                                function15 = function10;
                            } else {
                                c28655q5.m87150e0(-1783470982);
                                TextResource textResourceM107671d7 = c34064dM107694g.getTitleDisplay();
                                TextResource textResourceM107668a7 = c34064dM107694g.getDescriptionDisplay();
                                TextResource textResourceM107669b7 = c34064dM107694g.getPrimaryButtonTitle();
                                objM87133R24 = c28655q5.m87133R();
                                if (objM87133R24 == c28676v0) {
                                    objM87133R24 = w.f155428w;
                                    c28655q5.m87172p0(objM87133R24);
                                }
                                InterfaceC39332e interfaceC39332eM125323a7 = p745y81.Function1.m125323a((Function1) objM87133R24);
                                TextResource textResourceM107670c7 = c34064dM107694g.getSecondaryButtonTitle();
                                objM87133R25 = c28655q5.m87133R();
                                if (objM87133R25 == c28676v0) {
                                    interfaceC28601c18 = interfaceC28601c9;
                                    objM87133R25 = new C36269e(0, interfaceC28601c18);
                                    c28655q5.m87172p0(objM87133R25);
                                } else {
                                    interfaceC28601c18 = interfaceC28601c9;
                                }
                                InterfaceC4339a interfaceC4339a17 = (InterfaceC4339a) objM87133R25;
                                if ((i25 & 112) == 32) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                                objM87133R26 = c28655q5.m87133R();
                                if (z24) {
                                    objM87133R26 = new C25504c(interfaceC28601c18, interfaceC28601c6, function10);
                                    c28655q5.m87172p0(objM87133R26);
                                } else {
                                    objM87133R26 = new C25504c(interfaceC28601c18, interfaceC28601c6, function10);
                                    c28655q5.m87172p0(objM87133R26);
                                }
                                InterfaceC4339a interfaceC4339a18 = (InterfaceC4339a) objM87133R26;
                                int i314 = TextResource.$stable;
                                int i315 = (i314 << 3) | (i314 << 6) | (i314 << 9) | (i314 << 27);
                                interfaceC28601c9 = interfaceC28601c18;
                                interfaceC28601c14 = interfaceC28601c5;
                                function15 = function10;
                                function16 = function13;
                                AbstractC21211n.m59497o(null, textResourceM107671d7, textResourceM107668a7, textResourceM107669b7, false, interfaceC39332eM125323a7, null, null, null, textResourceM107670c7, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a17, null, interfaceC4339a18, null, null, null, c28655q5, i315, 0, 384, 247463377);
                                c28655q2 = c28655q5;
                                z13 = false;
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(z13);
                        } else {
                            interfaceC28601c1 = interfaceC28601c1;
                            interfaceC28601c14 = interfaceC28601c5;
                            c28676v0 = c28676v0;
                            function15 = function10;
                            function16 = function13;
                            z13 = false;
                            c28655q2 = c28655q5;
                            c28655q2.m87150e0(-1782794252);
                            c28655q2.m87173q(false);
                        }
                        if (m115763K0(interfaceC28601c3)) {
                            c28655q2.m87150e0(-2135716155);
                            c34064dM107696i = c34070j.getHormonalInsightsModeConfirmDialog();
                            if (c34064dM107696i == null) {
                                c28655q2.m87150e0(-1782691364);
                                c28655q2.m87173q(z13);
                                i26 = i26;
                                c28655q3 = c28655q2;
                                interfaceC28601c15 = interfaceC28601c3;
                                function17 = function14;
                            } else {
                                c28655q2.m87150e0(-1782691363);
                                TextResource textResourceM107671d8 = c34064dM107696i.getTitleDisplay();
                                TextResource textResourceM107668a8 = c34064dM107696i.getDescriptionDisplay();
                                TextResource textResourceM107669b8 = c34064dM107696i.getPrimaryButtonTitle();
                                objM87133R21 = c28655q2.m87133R();
                                if (objM87133R21 == c28676v0) {
                                    objM87133R21 = x.f155429w;
                                    c28655q2.m87172p0(objM87133R21);
                                }
                                InterfaceC39332e interfaceC39332eM125323a8 = p745y81.Function1.m125323a((Function1) objM87133R21);
                                TextResource textResourceM107670c8 = c34064dM107696i.getSecondaryButtonTitle();
                                objM87133R22 = c28655q2.m87133R();
                                if (objM87133R22 == c28676v0) {
                                    interfaceC28601c15 = interfaceC28601c3;
                                    objM87133R22 = new C36269e(1, interfaceC28601c15);
                                    c28655q2.m87172p0(objM87133R22);
                                } else {
                                    interfaceC28601c15 = interfaceC28601c3;
                                }
                                InterfaceC4339a interfaceC4339a19 = (InterfaceC4339a) objM87133R22;
                                if ((i25 & 7168) == 2048) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                if ((i25 & 896) == 256) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                z19 = z18 | z17;
                                objM87133R23 = c28655q2.m87133R();
                                if (z19) {
                                    function17 = function14;
                                    objM87133R23 = new C36238m(function17, function16, interfaceC28601c15, interfaceC28601c6);
                                    c28655q2.m87172p0(objM87133R23);
                                } else {
                                    function17 = function14;
                                    objM87133R23 = new C36238m(function17, function16, interfaceC28601c15, interfaceC28601c6);
                                    c28655q2.m87172p0(objM87133R23);
                                }
                                InterfaceC4339a interfaceC4339a110 = (InterfaceC4339a) objM87133R23;
                                int i316 = TextResource.$stable;
                                C28655q c28655q8 = c28655q2;
                                AbstractC21211n.m59497o(null, textResourceM107671d8, textResourceM107668a8, textResourceM107669b8, false, interfaceC39332eM125323a8, null, null, null, textResourceM107670c8, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a19, null, interfaceC4339a110, null, null, null, c28655q8, (i316 << 3) | (i316 << 6) | (i316 << 9) | (i316 << 27), 0, 384, 247463377);
                                c28655q3 = c28655q8;
                                z13 = false;
                                c28655q3.m87173q(false);
                            }
                            c28655q3.m87173q(z13);
                        } else {
                            i26 = i26;
                            c28655q3 = c28655q2;
                            interfaceC28601c15 = interfaceC28601c3;
                            c15199y3M3460c = c15199y3M3460c;
                            function17 = function14;
                            c28655q3.m87150e0(-1781986764);
                            c28655q3.m87173q(z13);
                        }
                        if (m115769M0(interfaceC28601c11)) {
                            c28655q3.m87150e0(-2135689437);
                            c34064dM107693f = c34070j.getHormonalInsightsContraceptionConfirmDialog();
                            if (c34064dM107693f == null) {
                                c28655q3.m87150e0(-1781863106);
                                c28655q3.m87173q(z13);
                                interfaceC28601c15 = interfaceC28601c15;
                                interfaceC28601c16 = interfaceC28601c11;
                            } else {
                                c28655q3.m87150e0(-1781863105);
                                TextResource textResourceM107671d9 = c34064dM107693f.getTitleDisplay();
                                TextResource textResourceM107668a9 = c34064dM107693f.getDescriptionDisplay();
                                TextResource textResourceM107669b9 = c34064dM107693f.getPrimaryButtonTitle();
                                objM87133R18 = c28655q3.m87133R();
                                if (objM87133R18 == c28676v0) {
                                    objM87133R18 = g.f155357w;
                                    c28655q3.m87172p0(objM87133R18);
                                }
                                InterfaceC39332e interfaceC39332eM125323a9 = p745y81.Function1.m125323a((Function1) objM87133R18);
                                TextResource textResourceM107670c9 = c34064dM107693f.getSecondaryButtonTitle();
                                objM87133R19 = c28655q3.m87133R();
                                if (objM87133R19 == c28676v0) {
                                    interfaceC28601c16 = interfaceC28601c11;
                                    objM87133R19 = new C36269e(2, interfaceC28601c16);
                                    c28655q3.m87172p0(objM87133R19);
                                } else {
                                    interfaceC28601c16 = interfaceC28601c11;
                                }
                                InterfaceC4339a interfaceC4339a111 = (InterfaceC4339a) objM87133R19;
                                if ((i25 & 7168) == 2048) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                boolean z27 = z14;
                                if ((i25 & 112) == 32) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                z16 = z27 | z15;
                                objM87133R20 = c28655q3.m87133R();
                                if (z16) {
                                    objM87133R20 = new C36238m(function17, interfaceC28601c16, interfaceC28601c7, function15);
                                    c28655q3.m87172p0(objM87133R20);
                                } else {
                                    objM87133R20 = new C36238m(function17, interfaceC28601c16, interfaceC28601c7, function15);
                                    c28655q3.m87172p0(objM87133R20);
                                }
                                int i317 = TextResource.$stable;
                                AbstractC21211n.m59497o(null, textResourceM107671d9, textResourceM107668a9, textResourceM107669b9, false, interfaceC39332eM125323a9, null, null, null, textResourceM107670c9, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a111, null, (InterfaceC4339a) objM87133R20, null, null, null, c28655q3, (i317 << 3) | (i317 << 6) | (i317 << 9) | (i317 << 27), 0, 384, 247463377);
                                z13 = false;
                                c28655q3.m87173q(false);
                            }
                            c28655q3.m87173q(z13);
                        } else {
                            interfaceC28601c15 = interfaceC28601c15;
                            interfaceC28601c16 = interfaceC28601c11;
                            c28655q3.m87150e0(-1781068172);
                            c28655q3.m87173q(z13);
                        }
                        if (m115775O0(interfaceC28601c14)) {
                            anyModalM107690c = c34070j.getEnablePregnancyInsightsConfirmation();
                        } else {
                            anyModalM107690c = null;
                        }
                        if ((i25 & 896) == 256) {
                            z13 = true;
                        }
                        objM87133R16 = c28655q3.m87133R();
                        if (z13) {
                            objM87133R16 = new C28827b(function16, interfaceC28601c14, 13);
                            c28655q3.m87172p0(objM87133R16);
                        } else {
                            objM87133R16 = new C28827b(function16, interfaceC28601c14, 13);
                            c28655q3.m87172p0(objM87133R16);
                        }
                        InterfaceC28601c1 interfaceC28601c28 = interfaceC28601c16;
                        Function1 function112 = function17;
                        c28676v1 = c28676v0;
                        Function1 function113 = function16;
                        InterfaceC28601c1 interfaceC28601c29 = interfaceC28601c9;
                        Function1 function22 = function15;
                        interfaceC28601c17 = interfaceC28601c1;
                        i27 = 2;
                        C15199y3 c15199y5 = c15199y3M3460c;
                        AbstractC0564o.m1394P(anyModalM107690c, (Function1) objM87133R16, null, null, null, null, c28655q3, i26, 60);
                        c28655q4 = c28655q3;
                        enumC36265aM115737B1 = m115737B1(interfaceC28601c17);
                        if (enumC36265aM115737B1 == null) {
                            i28 = -1;
                        } else {
                            i28 = n0.f155394a[enumC36265aM115737B1.ordinal()];
                        }
                        modifierM3599a = C2314t.f9131w;
                        if (i28 != -1) {
                            if (i28 != 1) {
                                modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "ModeBottomSheetTag");
                            } else if (i28 != 2) {
                                modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "ContraceptionBottomSheetTag");
                            } else if (i28 != 3) {
                                modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "PreviousPregnanciesBottomSheetTag");
                            } else if (i28 != 4) {
                                modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "FertilityInsightsDisableSurveyBottomSheetTag");
                            } else {
                                if (i28 == 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "GoalsBottomSheetTag");
                            }
                        }
                        Modifier modifier3 = modifierM3599a;
                        enumC36265aM115737B2 = m115737B1(interfaceC28601c17);
                        if (enumC36265aM115737B2 == null) {
                            i29 = -1;
                        } else {
                            i29 = n0.f155394a[enumC36265aM115737B2.ordinal()];
                        }
                        if (i29 != -1) {
                            c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                        } else if (i29 != 1) {
                            c35666g = new C35666g(c34070j.getHormonalInsightsModeBottomSheet().getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, i27, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                        } else if (i29 != 2) {
                            textResource = null;
                            objArr = 0;
                            c34063cM107692e = c34070j.getHormonalInsightsContraceptionBottomSheet();
                            if (c34063cM107692e != null) {
                                c35666g = new C35666g(c34063cM107692e.getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, i27, objArr == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                            } else {
                                c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                                c35666g = c35666g2;
                            }
                        } else if (i29 != 3) {
                            c34077qM107699l = c34070j.getPreviousPregnancies();
                            if (c34077qM107699l != null) {
                                c35666g = new C35666g(c34077qM107699l.getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, i27, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                            } else {
                                c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                                c35666g = c35666g2;
                            }
                        } else if (i29 != 4) {
                            c34063cM107688a = c34070j.getDisableFertilityInsightsSurveyDrawer();
                            if (c34063cM107688a != null) {
                                c35666g = new C35666g(c34063cM107688a.getTitleDisplay(), null, null, null, null, 0.0f, 0.0f, 126, null);
                            } else {
                                c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                                c35666g = c35666g2;
                            }
                        } else {
                            if (i29 == 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                        }
                        AbstractC35664f.a aVar3 = new AbstractC35664f.a(c15199y5);
                        objM87133R17 = c28655q4.m87133R();
                        if (objM87133R17 == c28676v1) {
                            objM87133R17 = new C36269e(4, interfaceC28601c17);
                            c28655q4.m87172p0(objM87133R17);
                        }
                        C37816b c37816bM121344e3 = AbstractC37817c.m121344e(409951292, c28655q4, new C29316o(c34070j, interfaceC28601c17, interfaceC28601c6, interfaceC28601c15, interfaceC28601c7, interfaceC28601c28, function113, function22, interfaceC28601c12, interfaceC28601c13));
                        InterfaceC4339a interfaceC4339a112 = interfaceC4339a4;
                        c28655q = c28655q4;
                        AbstractC35660d.m112871m(modifier3, c35666g, aVar3, null, (InterfaceC4339a) objM87133R17, null, null, c37816bM121344e3, false, null, null, null, false, null, AbstractC37817c.m121344e(1279555584, c28655q4, new C14076n(c34070j, function113, function22, interfaceC4339a112, function112, interfaceC28601c27, interfaceC28601c111, interfaceC28601c29, interfaceC28601c17)), c28655q, (C35666g.f151591h << 3) | 12607488 | (AbstractC35664f.a.f151587c << 6), 24576, 16232);
                        interfaceC4339a3 = interfaceC4339a112;
                        function8 = function113;
                        function7 = function22;
                        function9 = function112;
                    } else {
                        c28655q = c28655q5;
                        c28655q.m87138X();
                        function7 = function4;
                        function8 = function5;
                        function9 = function6;
                        interfaceC4339a3 = interfaceC4339a2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C35766g((Object) c34070j, function7, function8, function9, (InterfaceC23459e) interfaceC4339a3, i13, i14, 2);
                    }
                }
                i34 |= 24576;
                interfaceC4339a2 = interfaceC4339a;
                if ((i34 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q5.m87135U(i34 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i35 != 0) {
                        objM87133R30 = c28655q5.m87133R();
                        if (objM87133R30 == c28676v0) {
                            objM87133R30 = new C36244s(15);
                            c28655q5.m87172p0(objM87133R30);
                        }
                        function10 = (Function1) objM87133R30;
                    } else {
                        function10 = function4;
                    }
                    if (i15 != 0) {
                        objM87133R29 = c28655q5.m87133R();
                        if (objM87133R29 == c28676v0) {
                            objM87133R29 = new C36244s(9);
                            c28655q5.m87172p0(objM87133R29);
                        }
                        function11 = (Function1) objM87133R29;
                    } else {
                        function11 = function5;
                    }
                    if (i17 != 0) {
                        objM87133R28 = c28655q5.m87133R();
                        if (objM87133R28 == c28676v0) {
                            objM87133R28 = new C36244s(10);
                            c28655q5.m87172p0(objM87133R28);
                        }
                        function12 = (Function1) objM87133R28;
                    } else {
                        function12 = function6;
                    }
                    if (i19 != 0) {
                        objM87133R27 = c28655q5.m87133R();
                        if (objM87133R27 == c28676v0) {
                            objM87133R27 = new C35916a(23);
                            c28655q5.m87172p0(objM87133R27);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R27;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    objM87133R = c28655q5.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q5);
                        c28655q5.m87172p0(objM87133R);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                    function13 = function11;
                    function14 = function12;
                    c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q5, 3078, 6);
                    if (viewState.getDisableFertilityInsightsSurveyDrawer() != null) {
                        enumC36265a = EnumC36265a.FERTILITY_INSIGHTS_DISABLE_SURVEY;
                    } else {
                        enumC36265a = null;
                    }
                    objM87133R2 = c28655q5.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(enumC36265a);
                        c28655q5.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q5.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q5.m87172p0(objM87133R3);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                    objM87133R4 = c28655q5.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q5.m87172p0(objM87133R4);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q5.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q5.m87172p0(objM87133R5);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R5;
                    objM87133R6 = c28655q5.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q5.m87172p0(objM87133R6);
                    }
                    interfaceC28601c5 = (InterfaceC28601c1) objM87133R6;
                    objM87133R7 = c28655q5.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsShowCycleOverlayOn()));
                        c28655q5.m87172p0(objM87133R7);
                    }
                    InterfaceC28601c1 interfaceC28601c112 = (InterfaceC28601c1) objM87133R7;
                    objM87133R8 = c28655q5.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsHormonalInsightsOn()));
                        c28655q5.m87172p0(objM87133R8);
                    }
                    InterfaceC28601c1 interfaceC28601c210 = (InterfaceC28601c1) objM87133R8;
                    objM87133R9 = c28655q5.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = AbstractC28683x.m87272z(viewState.getSelectedMode());
                        c28655q5.m87172p0(objM87133R9);
                    }
                    interfaceC28601c6 = (InterfaceC28601c1) objM87133R9;
                    objM87133R10 = c28655q5.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = AbstractC28683x.m87272z(viewState.getSelectedContraceptionType());
                        c28655q5.m87172p0(objM87133R10);
                    }
                    interfaceC28601c7 = (InterfaceC28601c1) objM87133R10;
                    i25 = i34;
                    objM87133R11 = c28655q5.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = AbstractC28683x.m87272z(null);
                        c28655q5.m87172p0(objM87133R11);
                    }
                    interfaceC28601c8 = (InterfaceC28601c1) objM87133R11;
                    objM87133R12 = c28655q5.m87133R();
                    if (objM87133R12 == c28676v0) {
                        c34066fM107691d = viewState.getGoalsDrawer();
                        if (c34066fM107691d != null) {
                            interfaceC28601c9 = interfaceC28601c2;
                            objM74103I1 = C25235a0.f99113w;
                        } else {
                            interfaceC28601c9 = interfaceC28601c2;
                            objM74103I1 = C25235a0.f99113w;
                        }
                        objM87133R12 = AbstractC28683x.m87272z(objM74103I1);
                        c28655q5.m87172p0(objM87133R12);
                    } else {
                        interfaceC28601c9 = interfaceC28601c2;
                        interfaceC28601c3 = interfaceC28601c3;
                    }
                    interfaceC28601c10 = (InterfaceC28601c1) objM87133R12;
                    EnumC36265a enumC36265aM115737B6 = m115737B1(interfaceC28601c1);
                    zM87157i = c28655q5.m87157i(interfaceC2994c0) | c28655q5.m87157i(c15199y3M3460c);
                    objM87133R13 = c28655q5.m87133R();
                    if (zM87157i) {
                        objM87133R13 = new t(interfaceC2994c0, c15199y3M3460c, interfaceC28601c1, null);
                        c28655q5.m87172p0(objM87133R13);
                    } else {
                        objM87133R13 = new t(interfaceC2994c0, c15199y3M3460c, interfaceC28601c1, null);
                        c28655q5.m87172p0(objM87133R13);
                    }
                    AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R13, enumC36265aM115737B6);
                    zM87157i2 = c28655q5.m87157i(c15199y3M3460c) | c28655q5.m87157i(viewState);
                    objM87133R14 = c28655q5.m87133R();
                    if (zM87157i2) {
                        interfaceC28601c11 = interfaceC28601c4;
                        u uVar6 = new u(c15199y3M3460c, viewState, interfaceC28601c1, interfaceC28601c8, interfaceC28601c10, null);
                        c15199y3M3460c = c15199y3M3460c;
                        viewState = viewState;
                        interfaceC28601c12 = interfaceC28601c8;
                        interfaceC28601c13 = interfaceC28601c10;
                        c28655q5.m87172p0(uVar6);
                        objM87133R14 = uVar6;
                    } else {
                        interfaceC28601c11 = interfaceC28601c4;
                        u uVar7 = new u(c15199y3M3460c, viewState, interfaceC28601c1, interfaceC28601c8, interfaceC28601c10, null);
                        c15199y3M3460c = c15199y3M3460c;
                        viewState = viewState;
                        interfaceC28601c12 = interfaceC28601c8;
                        interfaceC28601c13 = interfaceC28601c10;
                        c28655q5.m87172p0(uVar7);
                        objM87133R14 = uVar7;
                    }
                    AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R14, c15199y3M3460c);
                    AnyModal anyModalM107690c5 = viewState.getEnablePregnancyInsightsConfirmation();
                    zM87157i3 = c28655q5.m87157i(viewState);
                    objM87133R15 = c28655q5.m87133R();
                    if (zM87157i3) {
                        objM87133R15 = new v(viewState, interfaceC28601c5, null);
                        c28655q5.m87172p0(objM87133R15);
                    } else {
                        objM87133R15 = new v(viewState, interfaceC28601c5, null);
                        c28655q5.m87172p0(objM87133R15);
                    }
                    i26 = AnyModal.$stable;
                    AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R15, anyModalM107690c5);
                    if (m115743D1(interfaceC28601c9)) {
                        c28655q5.m87150e0(-2135741304);
                        c34064dM107694g = viewState.getHormonalInsightsDisablingConfirmDialog();
                        if (c34064dM107694g == null) {
                            c28655q5.m87150e0(-1783470983);
                            c28655q5.m87173q(false);
                            interfaceC28601c1 = interfaceC28601c1;
                            interfaceC28601c14 = interfaceC28601c5;
                            function16 = function13;
                            z13 = false;
                            c28655q2 = c28655q5;
                            function15 = function10;
                        } else {
                            c28655q5.m87150e0(-1783470982);
                            TextResource textResourceM107671d10 = c34064dM107694g.getTitleDisplay();
                            TextResource textResourceM107668a10 = c34064dM107694g.getDescriptionDisplay();
                            TextResource textResourceM107669b10 = c34064dM107694g.getPrimaryButtonTitle();
                            objM87133R24 = c28655q5.m87133R();
                            if (objM87133R24 == c28676v0) {
                                objM87133R24 = w.f155428w;
                                c28655q5.m87172p0(objM87133R24);
                            }
                            InterfaceC39332e interfaceC39332eM125323a10 = p745y81.Function1.m125323a((Function1) objM87133R24);
                            TextResource textResourceM107670c10 = c34064dM107694g.getSecondaryButtonTitle();
                            objM87133R25 = c28655q5.m87133R();
                            if (objM87133R25 == c28676v0) {
                                interfaceC28601c18 = interfaceC28601c9;
                                objM87133R25 = new C36269e(0, interfaceC28601c18);
                                c28655q5.m87172p0(objM87133R25);
                            } else {
                                interfaceC28601c18 = interfaceC28601c9;
                            }
                            InterfaceC4339a interfaceC4339a113 = (InterfaceC4339a) objM87133R25;
                            if ((i25 & 112) == 32) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            objM87133R26 = c28655q5.m87133R();
                            if (z24) {
                                objM87133R26 = new C25504c(interfaceC28601c18, interfaceC28601c6, function10);
                                c28655q5.m87172p0(objM87133R26);
                            } else {
                                objM87133R26 = new C25504c(interfaceC28601c18, interfaceC28601c6, function10);
                                c28655q5.m87172p0(objM87133R26);
                            }
                            InterfaceC4339a interfaceC4339a114 = (InterfaceC4339a) objM87133R26;
                            int i318 = TextResource.$stable;
                            int i319 = (i318 << 3) | (i318 << 6) | (i318 << 9) | (i318 << 27);
                            interfaceC28601c9 = interfaceC28601c18;
                            interfaceC28601c14 = interfaceC28601c5;
                            function15 = function10;
                            function16 = function13;
                            AbstractC21211n.m59497o(null, textResourceM107671d10, textResourceM107668a10, textResourceM107669b10, false, interfaceC39332eM125323a10, null, null, null, textResourceM107670c10, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a113, null, interfaceC4339a114, null, null, null, c28655q5, i319, 0, 384, 247463377);
                            c28655q2 = c28655q5;
                            z13 = false;
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z13);
                    } else {
                        interfaceC28601c1 = interfaceC28601c1;
                        interfaceC28601c14 = interfaceC28601c5;
                        c28676v0 = c28676v0;
                        function15 = function10;
                        function16 = function13;
                        z13 = false;
                        c28655q2 = c28655q5;
                        c28655q2.m87150e0(-1782794252);
                        c28655q2.m87173q(false);
                    }
                    if (m115763K0(interfaceC28601c3)) {
                        c28655q2.m87150e0(-2135716155);
                        c34064dM107696i = c34070j.getHormonalInsightsModeConfirmDialog();
                        if (c34064dM107696i == null) {
                            c28655q2.m87150e0(-1782691364);
                            c28655q2.m87173q(z13);
                            i26 = i26;
                            c28655q3 = c28655q2;
                            interfaceC28601c15 = interfaceC28601c3;
                            function17 = function14;
                        } else {
                            c28655q2.m87150e0(-1782691363);
                            TextResource textResourceM107671d11 = c34064dM107696i.getTitleDisplay();
                            TextResource textResourceM107668a11 = c34064dM107696i.getDescriptionDisplay();
                            TextResource textResourceM107669b11 = c34064dM107696i.getPrimaryButtonTitle();
                            objM87133R21 = c28655q2.m87133R();
                            if (objM87133R21 == c28676v0) {
                                objM87133R21 = x.f155429w;
                                c28655q2.m87172p0(objM87133R21);
                            }
                            InterfaceC39332e interfaceC39332eM125323a11 = p745y81.Function1.m125323a((Function1) objM87133R21);
                            TextResource textResourceM107670c11 = c34064dM107696i.getSecondaryButtonTitle();
                            objM87133R22 = c28655q2.m87133R();
                            if (objM87133R22 == c28676v0) {
                                interfaceC28601c15 = interfaceC28601c3;
                                objM87133R22 = new C36269e(1, interfaceC28601c15);
                                c28655q2.m87172p0(objM87133R22);
                            } else {
                                interfaceC28601c15 = interfaceC28601c3;
                            }
                            InterfaceC4339a interfaceC4339a115 = (InterfaceC4339a) objM87133R22;
                            if ((i25 & 7168) == 2048) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if ((i25 & 896) == 256) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            z19 = z18 | z17;
                            objM87133R23 = c28655q2.m87133R();
                            if (z19) {
                                function17 = function14;
                                objM87133R23 = new C36238m(function17, function16, interfaceC28601c15, interfaceC28601c6);
                                c28655q2.m87172p0(objM87133R23);
                            } else {
                                function17 = function14;
                                objM87133R23 = new C36238m(function17, function16, interfaceC28601c15, interfaceC28601c6);
                                c28655q2.m87172p0(objM87133R23);
                            }
                            InterfaceC4339a interfaceC4339a116 = (InterfaceC4339a) objM87133R23;
                            int i3110 = TextResource.$stable;
                            C28655q c28655q9 = c28655q2;
                            AbstractC21211n.m59497o(null, textResourceM107671d11, textResourceM107668a11, textResourceM107669b11, false, interfaceC39332eM125323a11, null, null, null, textResourceM107670c11, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a115, null, interfaceC4339a116, null, null, null, c28655q9, (i3110 << 3) | (i3110 << 6) | (i3110 << 9) | (i3110 << 27), 0, 384, 247463377);
                            c28655q3 = c28655q9;
                            z13 = false;
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(z13);
                    } else {
                        i26 = i26;
                        c28655q3 = c28655q2;
                        interfaceC28601c15 = interfaceC28601c3;
                        c15199y3M3460c = c15199y3M3460c;
                        function17 = function14;
                        c28655q3.m87150e0(-1781986764);
                        c28655q3.m87173q(z13);
                    }
                    if (m115769M0(interfaceC28601c11)) {
                        c28655q3.m87150e0(-2135689437);
                        c34064dM107693f = c34070j.getHormonalInsightsContraceptionConfirmDialog();
                        if (c34064dM107693f == null) {
                            c28655q3.m87150e0(-1781863106);
                            c28655q3.m87173q(z13);
                            interfaceC28601c15 = interfaceC28601c15;
                            interfaceC28601c16 = interfaceC28601c11;
                        } else {
                            c28655q3.m87150e0(-1781863105);
                            TextResource textResourceM107671d12 = c34064dM107693f.getTitleDisplay();
                            TextResource textResourceM107668a12 = c34064dM107693f.getDescriptionDisplay();
                            TextResource textResourceM107669b12 = c34064dM107693f.getPrimaryButtonTitle();
                            objM87133R18 = c28655q3.m87133R();
                            if (objM87133R18 == c28676v0) {
                                objM87133R18 = g.f155357w;
                                c28655q3.m87172p0(objM87133R18);
                            }
                            InterfaceC39332e interfaceC39332eM125323a12 = p745y81.Function1.m125323a((Function1) objM87133R18);
                            TextResource textResourceM107670c12 = c34064dM107693f.getSecondaryButtonTitle();
                            objM87133R19 = c28655q3.m87133R();
                            if (objM87133R19 == c28676v0) {
                                interfaceC28601c16 = interfaceC28601c11;
                                objM87133R19 = new C36269e(2, interfaceC28601c16);
                                c28655q3.m87172p0(objM87133R19);
                            } else {
                                interfaceC28601c16 = interfaceC28601c11;
                            }
                            InterfaceC4339a interfaceC4339a117 = (InterfaceC4339a) objM87133R19;
                            if ((i25 & 7168) == 2048) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            boolean z28 = z14;
                            if ((i25 & 112) == 32) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = z28 | z15;
                            objM87133R20 = c28655q3.m87133R();
                            if (z16) {
                                objM87133R20 = new C36238m(function17, interfaceC28601c16, interfaceC28601c7, function15);
                                c28655q3.m87172p0(objM87133R20);
                            } else {
                                objM87133R20 = new C36238m(function17, interfaceC28601c16, interfaceC28601c7, function15);
                                c28655q3.m87172p0(objM87133R20);
                            }
                            int i3111 = TextResource.$stable;
                            AbstractC21211n.m59497o(null, textResourceM107671d12, textResourceM107668a12, textResourceM107669b12, false, interfaceC39332eM125323a12, null, null, null, textResourceM107670c12, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a117, null, (InterfaceC4339a) objM87133R20, null, null, null, c28655q3, (i3111 << 3) | (i3111 << 6) | (i3111 << 9) | (i3111 << 27), 0, 384, 247463377);
                            z13 = false;
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(z13);
                    } else {
                        interfaceC28601c15 = interfaceC28601c15;
                        interfaceC28601c16 = interfaceC28601c11;
                        c28655q3.m87150e0(-1781068172);
                        c28655q3.m87173q(z13);
                    }
                    if (m115775O0(interfaceC28601c14)) {
                        anyModalM107690c = c34070j.getEnablePregnancyInsightsConfirmation();
                    } else {
                        anyModalM107690c = null;
                    }
                    if ((i25 & 896) == 256) {
                        z13 = true;
                    }
                    objM87133R16 = c28655q3.m87133R();
                    if (z13) {
                        objM87133R16 = new C28827b(function16, interfaceC28601c14, 13);
                        c28655q3.m87172p0(objM87133R16);
                    } else {
                        objM87133R16 = new C28827b(function16, interfaceC28601c14, 13);
                        c28655q3.m87172p0(objM87133R16);
                    }
                    InterfaceC28601c1 interfaceC28601c211 = interfaceC28601c16;
                    Function1 function114 = function17;
                    c28676v1 = c28676v0;
                    Function1 function115 = function16;
                    InterfaceC28601c1 interfaceC28601c212 = interfaceC28601c9;
                    Function1 function23 = function15;
                    interfaceC28601c17 = interfaceC28601c1;
                    i27 = 2;
                    C15199y3 c15199y6 = c15199y3M3460c;
                    AbstractC0564o.m1394P(anyModalM107690c, (Function1) objM87133R16, null, null, null, null, c28655q3, i26, 60);
                    c28655q4 = c28655q3;
                    enumC36265aM115737B1 = m115737B1(interfaceC28601c17);
                    if (enumC36265aM115737B1 == null) {
                        i28 = -1;
                    } else {
                        i28 = n0.f155394a[enumC36265aM115737B1.ordinal()];
                    }
                    modifierM3599a = C2314t.f9131w;
                    if (i28 != -1) {
                        if (i28 != 1) {
                            modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "ModeBottomSheetTag");
                        } else if (i28 != 2) {
                            modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "ContraceptionBottomSheetTag");
                        } else if (i28 != 3) {
                            modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "PreviousPregnanciesBottomSheetTag");
                        } else if (i28 != 4) {
                            modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "FertilityInsightsDisableSurveyBottomSheetTag");
                        } else {
                            if (i28 == 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "GoalsBottomSheetTag");
                        }
                    }
                    Modifier modifier4 = modifierM3599a;
                    enumC36265aM115737B2 = m115737B1(interfaceC28601c17);
                    if (enumC36265aM115737B2 == null) {
                        i29 = -1;
                    } else {
                        i29 = n0.f155394a[enumC36265aM115737B2.ordinal()];
                    }
                    if (i29 != -1) {
                        c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                    } else if (i29 != 1) {
                        c35666g = new C35666g(c34070j.getHormonalInsightsModeBottomSheet().getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, i27, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                    } else if (i29 != 2) {
                        textResource = null;
                        objArr = 0;
                        c34063cM107692e = c34070j.getHormonalInsightsContraceptionBottomSheet();
                        if (c34063cM107692e != null) {
                            c35666g = new C35666g(c34063cM107692e.getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, i27, objArr == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                        } else {
                            c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                            c35666g = c35666g2;
                        }
                    } else if (i29 != 3) {
                        c34077qM107699l = c34070j.getPreviousPregnancies();
                        if (c34077qM107699l != null) {
                            c35666g = new C35666g(c34077qM107699l.getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, i27, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                        } else {
                            c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                            c35666g = c35666g2;
                        }
                    } else if (i29 != 4) {
                        c34063cM107688a = c34070j.getDisableFertilityInsightsSurveyDrawer();
                        if (c34063cM107688a != null) {
                            c35666g = new C35666g(c34063cM107688a.getTitleDisplay(), null, null, null, null, 0.0f, 0.0f, 126, null);
                        } else {
                            c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                            c35666g = c35666g2;
                        }
                    } else {
                        if (i29 == 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                    }
                    AbstractC35664f.a aVar4 = new AbstractC35664f.a(c15199y6);
                    objM87133R17 = c28655q4.m87133R();
                    if (objM87133R17 == c28676v1) {
                        objM87133R17 = new C36269e(4, interfaceC28601c17);
                        c28655q4.m87172p0(objM87133R17);
                    }
                    C37816b c37816bM121344e4 = AbstractC37817c.m121344e(409951292, c28655q4, new C29316o(c34070j, interfaceC28601c17, interfaceC28601c6, interfaceC28601c15, interfaceC28601c7, interfaceC28601c211, function115, function23, interfaceC28601c12, interfaceC28601c13));
                    InterfaceC4339a interfaceC4339a118 = interfaceC4339a4;
                    c28655q = c28655q4;
                    AbstractC35660d.m112871m(modifier4, c35666g, aVar4, null, (InterfaceC4339a) objM87133R17, null, null, c37816bM121344e4, false, null, null, null, false, null, AbstractC37817c.m121344e(1279555584, c28655q4, new C14076n(c34070j, function115, function23, interfaceC4339a118, function114, interfaceC28601c210, interfaceC28601c112, interfaceC28601c212, interfaceC28601c17)), c28655q, (C35666g.f151591h << 3) | 12607488 | (AbstractC35664f.a.f151587c << 6), 24576, 16232);
                    interfaceC4339a3 = interfaceC4339a118;
                    function8 = function115;
                    function7 = function23;
                    function9 = function114;
                } else {
                    c28655q = c28655q5;
                    c28655q.m87138X();
                    function7 = function4;
                    function8 = function5;
                    function9 = function6;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C35766g((Object) c34070j, function7, function8, function9, (InterfaceC23459e) interfaceC4339a3, i13, i14, 2);
                }
            }
            i34 |= 384;
            function5 = function2;
            i17 = i14 & 8;
            if (i17 != 0) {
                if ((i13 & 3072) == 0) {
                    function6 = function3;
                    if (c28655q5.m87157i(function6)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i34 |= i18;
                }
                i19 = i14 & 16;
                if (i19 != 0) {
                    if ((i13 & 24576) == 0) {
                        interfaceC4339a2 = interfaceC4339a;
                        if (c28655q5.m87157i(interfaceC4339a2)) {
                            i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i24 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i34 |= i24;
                    }
                    if ((i34 & 9363) != 9362) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q5.m87135U(i34 & 1, z4)) {
                        c28676v0 = C28635l.f115821a;
                        if (i35 != 0) {
                            objM87133R30 = c28655q5.m87133R();
                            if (objM87133R30 == c28676v0) {
                                objM87133R30 = new C36244s(15);
                                c28655q5.m87172p0(objM87133R30);
                            }
                            function10 = (Function1) objM87133R30;
                        } else {
                            function10 = function4;
                        }
                        if (i15 != 0) {
                            objM87133R29 = c28655q5.m87133R();
                            if (objM87133R29 == c28676v0) {
                                objM87133R29 = new C36244s(9);
                                c28655q5.m87172p0(objM87133R29);
                            }
                            function11 = (Function1) objM87133R29;
                        } else {
                            function11 = function5;
                        }
                        if (i17 != 0) {
                            objM87133R28 = c28655q5.m87133R();
                            if (objM87133R28 == c28676v0) {
                                objM87133R28 = new C36244s(10);
                                c28655q5.m87172p0(objM87133R28);
                            }
                            function12 = (Function1) objM87133R28;
                        } else {
                            function12 = function6;
                        }
                        if (i19 != 0) {
                            objM87133R27 = c28655q5.m87133R();
                            if (objM87133R27 == c28676v0) {
                                objM87133R27 = new C35916a(23);
                                c28655q5.m87172p0(objM87133R27);
                            }
                            interfaceC4339a4 = (InterfaceC4339a) objM87133R27;
                        } else {
                            interfaceC4339a4 = interfaceC4339a2;
                        }
                        objM87133R = c28655q5.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87262p(c28655q5);
                            c28655q5.m87172p0(objM87133R);
                        }
                        interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                        function13 = function11;
                        function14 = function12;
                        c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q5, 3078, 6);
                        if (viewState.getDisableFertilityInsightsSurveyDrawer() != null) {
                            enumC36265a = EnumC36265a.FERTILITY_INSIGHTS_DISABLE_SURVEY;
                        } else {
                            enumC36265a = null;
                        }
                        objM87133R2 = c28655q5.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(enumC36265a);
                            c28655q5.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        objM87133R3 = c28655q5.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q5.m87172p0(objM87133R3);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                        objM87133R4 = c28655q5.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q5.m87172p0(objM87133R4);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
                        objM87133R5 = c28655q5.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q5.m87172p0(objM87133R5);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM87133R5;
                        objM87133R6 = c28655q5.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q5.m87172p0(objM87133R6);
                        }
                        interfaceC28601c5 = (InterfaceC28601c1) objM87133R6;
                        objM87133R7 = c28655q5.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsShowCycleOverlayOn()));
                            c28655q5.m87172p0(objM87133R7);
                        }
                        InterfaceC28601c1 interfaceC28601c113 = (InterfaceC28601c1) objM87133R7;
                        objM87133R8 = c28655q5.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsHormonalInsightsOn()));
                            c28655q5.m87172p0(objM87133R8);
                        }
                        InterfaceC28601c1 interfaceC28601c213 = (InterfaceC28601c1) objM87133R8;
                        objM87133R9 = c28655q5.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = AbstractC28683x.m87272z(viewState.getSelectedMode());
                            c28655q5.m87172p0(objM87133R9);
                        }
                        interfaceC28601c6 = (InterfaceC28601c1) objM87133R9;
                        objM87133R10 = c28655q5.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = AbstractC28683x.m87272z(viewState.getSelectedContraceptionType());
                            c28655q5.m87172p0(objM87133R10);
                        }
                        interfaceC28601c7 = (InterfaceC28601c1) objM87133R10;
                        i25 = i34;
                        objM87133R11 = c28655q5.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = AbstractC28683x.m87272z(null);
                            c28655q5.m87172p0(objM87133R11);
                        }
                        interfaceC28601c8 = (InterfaceC28601c1) objM87133R11;
                        objM87133R12 = c28655q5.m87133R();
                        if (objM87133R12 == c28676v0) {
                            c34066fM107691d = viewState.getGoalsDrawer();
                            if (c34066fM107691d != null) {
                                interfaceC28601c9 = interfaceC28601c2;
                                objM74103I1 = C25235a0.f99113w;
                            } else {
                                interfaceC28601c9 = interfaceC28601c2;
                                objM74103I1 = C25235a0.f99113w;
                            }
                            objM87133R12 = AbstractC28683x.m87272z(objM74103I1);
                            c28655q5.m87172p0(objM87133R12);
                        } else {
                            interfaceC28601c9 = interfaceC28601c2;
                            interfaceC28601c3 = interfaceC28601c3;
                        }
                        interfaceC28601c10 = (InterfaceC28601c1) objM87133R12;
                        EnumC36265a enumC36265aM115737B7 = m115737B1(interfaceC28601c1);
                        zM87157i = c28655q5.m87157i(interfaceC2994c0) | c28655q5.m87157i(c15199y3M3460c);
                        objM87133R13 = c28655q5.m87133R();
                        if (zM87157i) {
                            objM87133R13 = new t(interfaceC2994c0, c15199y3M3460c, interfaceC28601c1, null);
                            c28655q5.m87172p0(objM87133R13);
                        } else {
                            objM87133R13 = new t(interfaceC2994c0, c15199y3M3460c, interfaceC28601c1, null);
                            c28655q5.m87172p0(objM87133R13);
                        }
                        AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R13, enumC36265aM115737B7);
                        zM87157i2 = c28655q5.m87157i(c15199y3M3460c) | c28655q5.m87157i(viewState);
                        objM87133R14 = c28655q5.m87133R();
                        if (zM87157i2) {
                            interfaceC28601c11 = interfaceC28601c4;
                            u uVar8 = new u(c15199y3M3460c, viewState, interfaceC28601c1, interfaceC28601c8, interfaceC28601c10, null);
                            c15199y3M3460c = c15199y3M3460c;
                            viewState = viewState;
                            interfaceC28601c12 = interfaceC28601c8;
                            interfaceC28601c13 = interfaceC28601c10;
                            c28655q5.m87172p0(uVar8);
                            objM87133R14 = uVar8;
                        } else {
                            interfaceC28601c11 = interfaceC28601c4;
                            u uVar9 = new u(c15199y3M3460c, viewState, interfaceC28601c1, interfaceC28601c8, interfaceC28601c10, null);
                            c15199y3M3460c = c15199y3M3460c;
                            viewState = viewState;
                            interfaceC28601c12 = interfaceC28601c8;
                            interfaceC28601c13 = interfaceC28601c10;
                            c28655q5.m87172p0(uVar9);
                            objM87133R14 = uVar9;
                        }
                        AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R14, c15199y3M3460c);
                        AnyModal anyModalM107690c6 = viewState.getEnablePregnancyInsightsConfirmation();
                        zM87157i3 = c28655q5.m87157i(viewState);
                        objM87133R15 = c28655q5.m87133R();
                        if (zM87157i3) {
                            objM87133R15 = new v(viewState, interfaceC28601c5, null);
                            c28655q5.m87172p0(objM87133R15);
                        } else {
                            objM87133R15 = new v(viewState, interfaceC28601c5, null);
                            c28655q5.m87172p0(objM87133R15);
                        }
                        i26 = AnyModal.$stable;
                        AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R15, anyModalM107690c6);
                        if (m115743D1(interfaceC28601c9)) {
                            c28655q5.m87150e0(-2135741304);
                            c34064dM107694g = viewState.getHormonalInsightsDisablingConfirmDialog();
                            if (c34064dM107694g == null) {
                                c28655q5.m87150e0(-1783470983);
                                c28655q5.m87173q(false);
                                interfaceC28601c1 = interfaceC28601c1;
                                interfaceC28601c14 = interfaceC28601c5;
                                function16 = function13;
                                z13 = false;
                                c28655q2 = c28655q5;
                                function15 = function10;
                            } else {
                                c28655q5.m87150e0(-1783470982);
                                TextResource textResourceM107671d13 = c34064dM107694g.getTitleDisplay();
                                TextResource textResourceM107668a13 = c34064dM107694g.getDescriptionDisplay();
                                TextResource textResourceM107669b13 = c34064dM107694g.getPrimaryButtonTitle();
                                objM87133R24 = c28655q5.m87133R();
                                if (objM87133R24 == c28676v0) {
                                    objM87133R24 = w.f155428w;
                                    c28655q5.m87172p0(objM87133R24);
                                }
                                InterfaceC39332e interfaceC39332eM125323a13 = p745y81.Function1.m125323a((Function1) objM87133R24);
                                TextResource textResourceM107670c13 = c34064dM107694g.getSecondaryButtonTitle();
                                objM87133R25 = c28655q5.m87133R();
                                if (objM87133R25 == c28676v0) {
                                    interfaceC28601c18 = interfaceC28601c9;
                                    objM87133R25 = new C36269e(0, interfaceC28601c18);
                                    c28655q5.m87172p0(objM87133R25);
                                } else {
                                    interfaceC28601c18 = interfaceC28601c9;
                                }
                                InterfaceC4339a interfaceC4339a119 = (InterfaceC4339a) objM87133R25;
                                if ((i25 & 112) == 32) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                                objM87133R26 = c28655q5.m87133R();
                                if (z24) {
                                    objM87133R26 = new C25504c(interfaceC28601c18, interfaceC28601c6, function10);
                                    c28655q5.m87172p0(objM87133R26);
                                } else {
                                    objM87133R26 = new C25504c(interfaceC28601c18, interfaceC28601c6, function10);
                                    c28655q5.m87172p0(objM87133R26);
                                }
                                InterfaceC4339a interfaceC4339a1110 = (InterfaceC4339a) objM87133R26;
                                int i3112 = TextResource.$stable;
                                int i3113 = (i3112 << 3) | (i3112 << 6) | (i3112 << 9) | (i3112 << 27);
                                interfaceC28601c9 = interfaceC28601c18;
                                interfaceC28601c14 = interfaceC28601c5;
                                function15 = function10;
                                function16 = function13;
                                AbstractC21211n.m59497o(null, textResourceM107671d13, textResourceM107668a13, textResourceM107669b13, false, interfaceC39332eM125323a13, null, null, null, textResourceM107670c13, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a119, null, interfaceC4339a1110, null, null, null, c28655q5, i3113, 0, 384, 247463377);
                                c28655q2 = c28655q5;
                                z13 = false;
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(z13);
                        } else {
                            interfaceC28601c1 = interfaceC28601c1;
                            interfaceC28601c14 = interfaceC28601c5;
                            c28676v0 = c28676v0;
                            function15 = function10;
                            function16 = function13;
                            z13 = false;
                            c28655q2 = c28655q5;
                            c28655q2.m87150e0(-1782794252);
                            c28655q2.m87173q(false);
                        }
                        if (m115763K0(interfaceC28601c3)) {
                            c28655q2.m87150e0(-2135716155);
                            c34064dM107696i = c34070j.getHormonalInsightsModeConfirmDialog();
                            if (c34064dM107696i == null) {
                                c28655q2.m87150e0(-1782691364);
                                c28655q2.m87173q(z13);
                                i26 = i26;
                                c28655q3 = c28655q2;
                                interfaceC28601c15 = interfaceC28601c3;
                                function17 = function14;
                            } else {
                                c28655q2.m87150e0(-1782691363);
                                TextResource textResourceM107671d14 = c34064dM107696i.getTitleDisplay();
                                TextResource textResourceM107668a14 = c34064dM107696i.getDescriptionDisplay();
                                TextResource textResourceM107669b14 = c34064dM107696i.getPrimaryButtonTitle();
                                objM87133R21 = c28655q2.m87133R();
                                if (objM87133R21 == c28676v0) {
                                    objM87133R21 = x.f155429w;
                                    c28655q2.m87172p0(objM87133R21);
                                }
                                InterfaceC39332e interfaceC39332eM125323a14 = p745y81.Function1.m125323a((Function1) objM87133R21);
                                TextResource textResourceM107670c14 = c34064dM107696i.getSecondaryButtonTitle();
                                objM87133R22 = c28655q2.m87133R();
                                if (objM87133R22 == c28676v0) {
                                    interfaceC28601c15 = interfaceC28601c3;
                                    objM87133R22 = new C36269e(1, interfaceC28601c15);
                                    c28655q2.m87172p0(objM87133R22);
                                } else {
                                    interfaceC28601c15 = interfaceC28601c3;
                                }
                                InterfaceC4339a interfaceC4339a1111 = (InterfaceC4339a) objM87133R22;
                                if ((i25 & 7168) == 2048) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                if ((i25 & 896) == 256) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                z19 = z18 | z17;
                                objM87133R23 = c28655q2.m87133R();
                                if (z19) {
                                    function17 = function14;
                                    objM87133R23 = new C36238m(function17, function16, interfaceC28601c15, interfaceC28601c6);
                                    c28655q2.m87172p0(objM87133R23);
                                } else {
                                    function17 = function14;
                                    objM87133R23 = new C36238m(function17, function16, interfaceC28601c15, interfaceC28601c6);
                                    c28655q2.m87172p0(objM87133R23);
                                }
                                InterfaceC4339a interfaceC4339a1112 = (InterfaceC4339a) objM87133R23;
                                int i3114 = TextResource.$stable;
                                C28655q c28655q10 = c28655q2;
                                AbstractC21211n.m59497o(null, textResourceM107671d14, textResourceM107668a14, textResourceM107669b14, false, interfaceC39332eM125323a14, null, null, null, textResourceM107670c14, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a1111, null, interfaceC4339a1112, null, null, null, c28655q10, (i3114 << 3) | (i3114 << 6) | (i3114 << 9) | (i3114 << 27), 0, 384, 247463377);
                                c28655q3 = c28655q10;
                                z13 = false;
                                c28655q3.m87173q(false);
                            }
                            c28655q3.m87173q(z13);
                        } else {
                            i26 = i26;
                            c28655q3 = c28655q2;
                            interfaceC28601c15 = interfaceC28601c3;
                            c15199y3M3460c = c15199y3M3460c;
                            function17 = function14;
                            c28655q3.m87150e0(-1781986764);
                            c28655q3.m87173q(z13);
                        }
                        if (m115769M0(interfaceC28601c11)) {
                            c28655q3.m87150e0(-2135689437);
                            c34064dM107693f = c34070j.getHormonalInsightsContraceptionConfirmDialog();
                            if (c34064dM107693f == null) {
                                c28655q3.m87150e0(-1781863106);
                                c28655q3.m87173q(z13);
                                interfaceC28601c15 = interfaceC28601c15;
                                interfaceC28601c16 = interfaceC28601c11;
                            } else {
                                c28655q3.m87150e0(-1781863105);
                                TextResource textResourceM107671d15 = c34064dM107693f.getTitleDisplay();
                                TextResource textResourceM107668a15 = c34064dM107693f.getDescriptionDisplay();
                                TextResource textResourceM107669b15 = c34064dM107693f.getPrimaryButtonTitle();
                                objM87133R18 = c28655q3.m87133R();
                                if (objM87133R18 == c28676v0) {
                                    objM87133R18 = g.f155357w;
                                    c28655q3.m87172p0(objM87133R18);
                                }
                                InterfaceC39332e interfaceC39332eM125323a15 = p745y81.Function1.m125323a((Function1) objM87133R18);
                                TextResource textResourceM107670c15 = c34064dM107693f.getSecondaryButtonTitle();
                                objM87133R19 = c28655q3.m87133R();
                                if (objM87133R19 == c28676v0) {
                                    interfaceC28601c16 = interfaceC28601c11;
                                    objM87133R19 = new C36269e(2, interfaceC28601c16);
                                    c28655q3.m87172p0(objM87133R19);
                                } else {
                                    interfaceC28601c16 = interfaceC28601c11;
                                }
                                InterfaceC4339a interfaceC4339a1113 = (InterfaceC4339a) objM87133R19;
                                if ((i25 & 7168) == 2048) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                boolean z29 = z14;
                                if ((i25 & 112) == 32) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                z16 = z29 | z15;
                                objM87133R20 = c28655q3.m87133R();
                                if (z16) {
                                    objM87133R20 = new C36238m(function17, interfaceC28601c16, interfaceC28601c7, function15);
                                    c28655q3.m87172p0(objM87133R20);
                                } else {
                                    objM87133R20 = new C36238m(function17, interfaceC28601c16, interfaceC28601c7, function15);
                                    c28655q3.m87172p0(objM87133R20);
                                }
                                int i3115 = TextResource.$stable;
                                AbstractC21211n.m59497o(null, textResourceM107671d15, textResourceM107668a15, textResourceM107669b15, false, interfaceC39332eM125323a15, null, null, null, textResourceM107670c15, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a1113, null, (InterfaceC4339a) objM87133R20, null, null, null, c28655q3, (i3115 << 3) | (i3115 << 6) | (i3115 << 9) | (i3115 << 27), 0, 384, 247463377);
                                z13 = false;
                                c28655q3.m87173q(false);
                            }
                            c28655q3.m87173q(z13);
                        } else {
                            interfaceC28601c15 = interfaceC28601c15;
                            interfaceC28601c16 = interfaceC28601c11;
                            c28655q3.m87150e0(-1781068172);
                            c28655q3.m87173q(z13);
                        }
                        if (m115775O0(interfaceC28601c14)) {
                            anyModalM107690c = c34070j.getEnablePregnancyInsightsConfirmation();
                        } else {
                            anyModalM107690c = null;
                        }
                        if ((i25 & 896) == 256) {
                            z13 = true;
                        }
                        objM87133R16 = c28655q3.m87133R();
                        if (z13) {
                            objM87133R16 = new C28827b(function16, interfaceC28601c14, 13);
                            c28655q3.m87172p0(objM87133R16);
                        } else {
                            objM87133R16 = new C28827b(function16, interfaceC28601c14, 13);
                            c28655q3.m87172p0(objM87133R16);
                        }
                        InterfaceC28601c1 interfaceC28601c214 = interfaceC28601c16;
                        Function1 function116 = function17;
                        c28676v1 = c28676v0;
                        Function1 function117 = function16;
                        InterfaceC28601c1 interfaceC28601c215 = interfaceC28601c9;
                        Function1 function24 = function15;
                        interfaceC28601c17 = interfaceC28601c1;
                        i27 = 2;
                        C15199y3 c15199y7 = c15199y3M3460c;
                        AbstractC0564o.m1394P(anyModalM107690c, (Function1) objM87133R16, null, null, null, null, c28655q3, i26, 60);
                        c28655q4 = c28655q3;
                        enumC36265aM115737B1 = m115737B1(interfaceC28601c17);
                        if (enumC36265aM115737B1 == null) {
                            i28 = -1;
                        } else {
                            i28 = n0.f155394a[enumC36265aM115737B1.ordinal()];
                        }
                        modifierM3599a = C2314t.f9131w;
                        if (i28 != -1) {
                            if (i28 != 1) {
                                modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "ModeBottomSheetTag");
                            } else if (i28 != 2) {
                                modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "ContraceptionBottomSheetTag");
                            } else if (i28 != 3) {
                                modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "PreviousPregnanciesBottomSheetTag");
                            } else if (i28 != 4) {
                                modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "FertilityInsightsDisableSurveyBottomSheetTag");
                            } else {
                                if (i28 == 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "GoalsBottomSheetTag");
                            }
                        }
                        Modifier modifier5 = modifierM3599a;
                        enumC36265aM115737B2 = m115737B1(interfaceC28601c17);
                        if (enumC36265aM115737B2 == null) {
                            i29 = -1;
                        } else {
                            i29 = n0.f155394a[enumC36265aM115737B2.ordinal()];
                        }
                        if (i29 != -1) {
                            c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                        } else if (i29 != 1) {
                            c35666g = new C35666g(c34070j.getHormonalInsightsModeBottomSheet().getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, i27, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                        } else if (i29 != 2) {
                            textResource = null;
                            objArr = 0;
                            c34063cM107692e = c34070j.getHormonalInsightsContraceptionBottomSheet();
                            if (c34063cM107692e != null) {
                                c35666g = new C35666g(c34063cM107692e.getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, i27, objArr == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                            } else {
                                c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                                c35666g = c35666g2;
                            }
                        } else if (i29 != 3) {
                            c34077qM107699l = c34070j.getPreviousPregnancies();
                            if (c34077qM107699l != null) {
                                c35666g = new C35666g(c34077qM107699l.getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, i27, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                            } else {
                                c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                                c35666g = c35666g2;
                            }
                        } else if (i29 != 4) {
                            c34063cM107688a = c34070j.getDisableFertilityInsightsSurveyDrawer();
                            if (c34063cM107688a != null) {
                                c35666g = new C35666g(c34063cM107688a.getTitleDisplay(), null, null, null, null, 0.0f, 0.0f, 126, null);
                            } else {
                                c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                                c35666g = c35666g2;
                            }
                        } else {
                            if (i29 == 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                        }
                        AbstractC35664f.a aVar5 = new AbstractC35664f.a(c15199y7);
                        objM87133R17 = c28655q4.m87133R();
                        if (objM87133R17 == c28676v1) {
                            objM87133R17 = new C36269e(4, interfaceC28601c17);
                            c28655q4.m87172p0(objM87133R17);
                        }
                        C37816b c37816bM121344e5 = AbstractC37817c.m121344e(409951292, c28655q4, new C29316o(c34070j, interfaceC28601c17, interfaceC28601c6, interfaceC28601c15, interfaceC28601c7, interfaceC28601c214, function117, function24, interfaceC28601c12, interfaceC28601c13));
                        InterfaceC4339a interfaceC4339a1114 = interfaceC4339a4;
                        c28655q = c28655q4;
                        AbstractC35660d.m112871m(modifier5, c35666g, aVar5, null, (InterfaceC4339a) objM87133R17, null, null, c37816bM121344e5, false, null, null, null, false, null, AbstractC37817c.m121344e(1279555584, c28655q4, new C14076n(c34070j, function117, function24, interfaceC4339a1114, function116, interfaceC28601c213, interfaceC28601c113, interfaceC28601c215, interfaceC28601c17)), c28655q, (C35666g.f151591h << 3) | 12607488 | (AbstractC35664f.a.f151587c << 6), 24576, 16232);
                        interfaceC4339a3 = interfaceC4339a1114;
                        function8 = function117;
                        function7 = function24;
                        function9 = function116;
                    } else {
                        c28655q = c28655q5;
                        c28655q.m87138X();
                        function7 = function4;
                        function8 = function5;
                        function9 = function6;
                        interfaceC4339a3 = interfaceC4339a2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C35766g((Object) c34070j, function7, function8, function9, (InterfaceC23459e) interfaceC4339a3, i13, i14, 2);
                    }
                }
                i34 |= 24576;
                interfaceC4339a2 = interfaceC4339a;
                if ((i34 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q5.m87135U(i34 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i35 != 0) {
                        objM87133R30 = c28655q5.m87133R();
                        if (objM87133R30 == c28676v0) {
                            objM87133R30 = new C36244s(15);
                            c28655q5.m87172p0(objM87133R30);
                        }
                        function10 = (Function1) objM87133R30;
                    } else {
                        function10 = function4;
                    }
                    if (i15 != 0) {
                        objM87133R29 = c28655q5.m87133R();
                        if (objM87133R29 == c28676v0) {
                            objM87133R29 = new C36244s(9);
                            c28655q5.m87172p0(objM87133R29);
                        }
                        function11 = (Function1) objM87133R29;
                    } else {
                        function11 = function5;
                    }
                    if (i17 != 0) {
                        objM87133R28 = c28655q5.m87133R();
                        if (objM87133R28 == c28676v0) {
                            objM87133R28 = new C36244s(10);
                            c28655q5.m87172p0(objM87133R28);
                        }
                        function12 = (Function1) objM87133R28;
                    } else {
                        function12 = function6;
                    }
                    if (i19 != 0) {
                        objM87133R27 = c28655q5.m87133R();
                        if (objM87133R27 == c28676v0) {
                            objM87133R27 = new C35916a(23);
                            c28655q5.m87172p0(objM87133R27);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R27;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    objM87133R = c28655q5.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q5);
                        c28655q5.m87172p0(objM87133R);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                    function13 = function11;
                    function14 = function12;
                    c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q5, 3078, 6);
                    if (viewState.getDisableFertilityInsightsSurveyDrawer() != null) {
                        enumC36265a = EnumC36265a.FERTILITY_INSIGHTS_DISABLE_SURVEY;
                    } else {
                        enumC36265a = null;
                    }
                    objM87133R2 = c28655q5.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(enumC36265a);
                        c28655q5.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q5.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q5.m87172p0(objM87133R3);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                    objM87133R4 = c28655q5.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q5.m87172p0(objM87133R4);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q5.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q5.m87172p0(objM87133R5);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R5;
                    objM87133R6 = c28655q5.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q5.m87172p0(objM87133R6);
                    }
                    interfaceC28601c5 = (InterfaceC28601c1) objM87133R6;
                    objM87133R7 = c28655q5.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsShowCycleOverlayOn()));
                        c28655q5.m87172p0(objM87133R7);
                    }
                    InterfaceC28601c1 interfaceC28601c114 = (InterfaceC28601c1) objM87133R7;
                    objM87133R8 = c28655q5.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsHormonalInsightsOn()));
                        c28655q5.m87172p0(objM87133R8);
                    }
                    InterfaceC28601c1 interfaceC28601c216 = (InterfaceC28601c1) objM87133R8;
                    objM87133R9 = c28655q5.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = AbstractC28683x.m87272z(viewState.getSelectedMode());
                        c28655q5.m87172p0(objM87133R9);
                    }
                    interfaceC28601c6 = (InterfaceC28601c1) objM87133R9;
                    objM87133R10 = c28655q5.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = AbstractC28683x.m87272z(viewState.getSelectedContraceptionType());
                        c28655q5.m87172p0(objM87133R10);
                    }
                    interfaceC28601c7 = (InterfaceC28601c1) objM87133R10;
                    i25 = i34;
                    objM87133R11 = c28655q5.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = AbstractC28683x.m87272z(null);
                        c28655q5.m87172p0(objM87133R11);
                    }
                    interfaceC28601c8 = (InterfaceC28601c1) objM87133R11;
                    objM87133R12 = c28655q5.m87133R();
                    if (objM87133R12 == c28676v0) {
                        c34066fM107691d = viewState.getGoalsDrawer();
                        if (c34066fM107691d != null) {
                            interfaceC28601c9 = interfaceC28601c2;
                            objM74103I1 = C25235a0.f99113w;
                        } else {
                            interfaceC28601c9 = interfaceC28601c2;
                            objM74103I1 = C25235a0.f99113w;
                        }
                        objM87133R12 = AbstractC28683x.m87272z(objM74103I1);
                        c28655q5.m87172p0(objM87133R12);
                    } else {
                        interfaceC28601c9 = interfaceC28601c2;
                        interfaceC28601c3 = interfaceC28601c3;
                    }
                    interfaceC28601c10 = (InterfaceC28601c1) objM87133R12;
                    EnumC36265a enumC36265aM115737B8 = m115737B1(interfaceC28601c1);
                    zM87157i = c28655q5.m87157i(interfaceC2994c0) | c28655q5.m87157i(c15199y3M3460c);
                    objM87133R13 = c28655q5.m87133R();
                    if (zM87157i) {
                        objM87133R13 = new t(interfaceC2994c0, c15199y3M3460c, interfaceC28601c1, null);
                        c28655q5.m87172p0(objM87133R13);
                    } else {
                        objM87133R13 = new t(interfaceC2994c0, c15199y3M3460c, interfaceC28601c1, null);
                        c28655q5.m87172p0(objM87133R13);
                    }
                    AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R13, enumC36265aM115737B8);
                    zM87157i2 = c28655q5.m87157i(c15199y3M3460c) | c28655q5.m87157i(viewState);
                    objM87133R14 = c28655q5.m87133R();
                    if (zM87157i2) {
                        interfaceC28601c11 = interfaceC28601c4;
                        u uVar10 = new u(c15199y3M3460c, viewState, interfaceC28601c1, interfaceC28601c8, interfaceC28601c10, null);
                        c15199y3M3460c = c15199y3M3460c;
                        viewState = viewState;
                        interfaceC28601c12 = interfaceC28601c8;
                        interfaceC28601c13 = interfaceC28601c10;
                        c28655q5.m87172p0(uVar10);
                        objM87133R14 = uVar10;
                    } else {
                        interfaceC28601c11 = interfaceC28601c4;
                        u uVar11 = new u(c15199y3M3460c, viewState, interfaceC28601c1, interfaceC28601c8, interfaceC28601c10, null);
                        c15199y3M3460c = c15199y3M3460c;
                        viewState = viewState;
                        interfaceC28601c12 = interfaceC28601c8;
                        interfaceC28601c13 = interfaceC28601c10;
                        c28655q5.m87172p0(uVar11);
                        objM87133R14 = uVar11;
                    }
                    AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R14, c15199y3M3460c);
                    AnyModal anyModalM107690c7 = viewState.getEnablePregnancyInsightsConfirmation();
                    zM87157i3 = c28655q5.m87157i(viewState);
                    objM87133R15 = c28655q5.m87133R();
                    if (zM87157i3) {
                        objM87133R15 = new v(viewState, interfaceC28601c5, null);
                        c28655q5.m87172p0(objM87133R15);
                    } else {
                        objM87133R15 = new v(viewState, interfaceC28601c5, null);
                        c28655q5.m87172p0(objM87133R15);
                    }
                    i26 = AnyModal.$stable;
                    AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R15, anyModalM107690c7);
                    if (m115743D1(interfaceC28601c9)) {
                        c28655q5.m87150e0(-2135741304);
                        c34064dM107694g = viewState.getHormonalInsightsDisablingConfirmDialog();
                        if (c34064dM107694g == null) {
                            c28655q5.m87150e0(-1783470983);
                            c28655q5.m87173q(false);
                            interfaceC28601c1 = interfaceC28601c1;
                            interfaceC28601c14 = interfaceC28601c5;
                            function16 = function13;
                            z13 = false;
                            c28655q2 = c28655q5;
                            function15 = function10;
                        } else {
                            c28655q5.m87150e0(-1783470982);
                            TextResource textResourceM107671d16 = c34064dM107694g.getTitleDisplay();
                            TextResource textResourceM107668a16 = c34064dM107694g.getDescriptionDisplay();
                            TextResource textResourceM107669b16 = c34064dM107694g.getPrimaryButtonTitle();
                            objM87133R24 = c28655q5.m87133R();
                            if (objM87133R24 == c28676v0) {
                                objM87133R24 = w.f155428w;
                                c28655q5.m87172p0(objM87133R24);
                            }
                            InterfaceC39332e interfaceC39332eM125323a16 = p745y81.Function1.m125323a((Function1) objM87133R24);
                            TextResource textResourceM107670c16 = c34064dM107694g.getSecondaryButtonTitle();
                            objM87133R25 = c28655q5.m87133R();
                            if (objM87133R25 == c28676v0) {
                                interfaceC28601c18 = interfaceC28601c9;
                                objM87133R25 = new C36269e(0, interfaceC28601c18);
                                c28655q5.m87172p0(objM87133R25);
                            } else {
                                interfaceC28601c18 = interfaceC28601c9;
                            }
                            InterfaceC4339a interfaceC4339a1115 = (InterfaceC4339a) objM87133R25;
                            if ((i25 & 112) == 32) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            objM87133R26 = c28655q5.m87133R();
                            if (z24) {
                                objM87133R26 = new C25504c(interfaceC28601c18, interfaceC28601c6, function10);
                                c28655q5.m87172p0(objM87133R26);
                            } else {
                                objM87133R26 = new C25504c(interfaceC28601c18, interfaceC28601c6, function10);
                                c28655q5.m87172p0(objM87133R26);
                            }
                            InterfaceC4339a interfaceC4339a1116 = (InterfaceC4339a) objM87133R26;
                            int i3116 = TextResource.$stable;
                            int i3117 = (i3116 << 3) | (i3116 << 6) | (i3116 << 9) | (i3116 << 27);
                            interfaceC28601c9 = interfaceC28601c18;
                            interfaceC28601c14 = interfaceC28601c5;
                            function15 = function10;
                            function16 = function13;
                            AbstractC21211n.m59497o(null, textResourceM107671d16, textResourceM107668a16, textResourceM107669b16, false, interfaceC39332eM125323a16, null, null, null, textResourceM107670c16, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a1115, null, interfaceC4339a1116, null, null, null, c28655q5, i3117, 0, 384, 247463377);
                            c28655q2 = c28655q5;
                            z13 = false;
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z13);
                    } else {
                        interfaceC28601c1 = interfaceC28601c1;
                        interfaceC28601c14 = interfaceC28601c5;
                        c28676v0 = c28676v0;
                        function15 = function10;
                        function16 = function13;
                        z13 = false;
                        c28655q2 = c28655q5;
                        c28655q2.m87150e0(-1782794252);
                        c28655q2.m87173q(false);
                    }
                    if (m115763K0(interfaceC28601c3)) {
                        c28655q2.m87150e0(-2135716155);
                        c34064dM107696i = c34070j.getHormonalInsightsModeConfirmDialog();
                        if (c34064dM107696i == null) {
                            c28655q2.m87150e0(-1782691364);
                            c28655q2.m87173q(z13);
                            i26 = i26;
                            c28655q3 = c28655q2;
                            interfaceC28601c15 = interfaceC28601c3;
                            function17 = function14;
                        } else {
                            c28655q2.m87150e0(-1782691363);
                            TextResource textResourceM107671d17 = c34064dM107696i.getTitleDisplay();
                            TextResource textResourceM107668a17 = c34064dM107696i.getDescriptionDisplay();
                            TextResource textResourceM107669b17 = c34064dM107696i.getPrimaryButtonTitle();
                            objM87133R21 = c28655q2.m87133R();
                            if (objM87133R21 == c28676v0) {
                                objM87133R21 = x.f155429w;
                                c28655q2.m87172p0(objM87133R21);
                            }
                            InterfaceC39332e interfaceC39332eM125323a17 = p745y81.Function1.m125323a((Function1) objM87133R21);
                            TextResource textResourceM107670c17 = c34064dM107696i.getSecondaryButtonTitle();
                            objM87133R22 = c28655q2.m87133R();
                            if (objM87133R22 == c28676v0) {
                                interfaceC28601c15 = interfaceC28601c3;
                                objM87133R22 = new C36269e(1, interfaceC28601c15);
                                c28655q2.m87172p0(objM87133R22);
                            } else {
                                interfaceC28601c15 = interfaceC28601c3;
                            }
                            InterfaceC4339a interfaceC4339a1117 = (InterfaceC4339a) objM87133R22;
                            if ((i25 & 7168) == 2048) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if ((i25 & 896) == 256) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            z19 = z18 | z17;
                            objM87133R23 = c28655q2.m87133R();
                            if (z19) {
                                function17 = function14;
                                objM87133R23 = new C36238m(function17, function16, interfaceC28601c15, interfaceC28601c6);
                                c28655q2.m87172p0(objM87133R23);
                            } else {
                                function17 = function14;
                                objM87133R23 = new C36238m(function17, function16, interfaceC28601c15, interfaceC28601c6);
                                c28655q2.m87172p0(objM87133R23);
                            }
                            InterfaceC4339a interfaceC4339a1118 = (InterfaceC4339a) objM87133R23;
                            int i3118 = TextResource.$stable;
                            C28655q c28655q11 = c28655q2;
                            AbstractC21211n.m59497o(null, textResourceM107671d17, textResourceM107668a17, textResourceM107669b17, false, interfaceC39332eM125323a17, null, null, null, textResourceM107670c17, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a1117, null, interfaceC4339a1118, null, null, null, c28655q11, (i3118 << 3) | (i3118 << 6) | (i3118 << 9) | (i3118 << 27), 0, 384, 247463377);
                            c28655q3 = c28655q11;
                            z13 = false;
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(z13);
                    } else {
                        i26 = i26;
                        c28655q3 = c28655q2;
                        interfaceC28601c15 = interfaceC28601c3;
                        c15199y3M3460c = c15199y3M3460c;
                        function17 = function14;
                        c28655q3.m87150e0(-1781986764);
                        c28655q3.m87173q(z13);
                    }
                    if (m115769M0(interfaceC28601c11)) {
                        c28655q3.m87150e0(-2135689437);
                        c34064dM107693f = c34070j.getHormonalInsightsContraceptionConfirmDialog();
                        if (c34064dM107693f == null) {
                            c28655q3.m87150e0(-1781863106);
                            c28655q3.m87173q(z13);
                            interfaceC28601c15 = interfaceC28601c15;
                            interfaceC28601c16 = interfaceC28601c11;
                        } else {
                            c28655q3.m87150e0(-1781863105);
                            TextResource textResourceM107671d18 = c34064dM107693f.getTitleDisplay();
                            TextResource textResourceM107668a18 = c34064dM107693f.getDescriptionDisplay();
                            TextResource textResourceM107669b18 = c34064dM107693f.getPrimaryButtonTitle();
                            objM87133R18 = c28655q3.m87133R();
                            if (objM87133R18 == c28676v0) {
                                objM87133R18 = g.f155357w;
                                c28655q3.m87172p0(objM87133R18);
                            }
                            InterfaceC39332e interfaceC39332eM125323a18 = p745y81.Function1.m125323a((Function1) objM87133R18);
                            TextResource textResourceM107670c18 = c34064dM107693f.getSecondaryButtonTitle();
                            objM87133R19 = c28655q3.m87133R();
                            if (objM87133R19 == c28676v0) {
                                interfaceC28601c16 = interfaceC28601c11;
                                objM87133R19 = new C36269e(2, interfaceC28601c16);
                                c28655q3.m87172p0(objM87133R19);
                            } else {
                                interfaceC28601c16 = interfaceC28601c11;
                            }
                            InterfaceC4339a interfaceC4339a1119 = (InterfaceC4339a) objM87133R19;
                            if ((i25 & 7168) == 2048) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            boolean z210 = z14;
                            if ((i25 & 112) == 32) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = z210 | z15;
                            objM87133R20 = c28655q3.m87133R();
                            if (z16) {
                                objM87133R20 = new C36238m(function17, interfaceC28601c16, interfaceC28601c7, function15);
                                c28655q3.m87172p0(objM87133R20);
                            } else {
                                objM87133R20 = new C36238m(function17, interfaceC28601c16, interfaceC28601c7, function15);
                                c28655q3.m87172p0(objM87133R20);
                            }
                            int i3119 = TextResource.$stable;
                            AbstractC21211n.m59497o(null, textResourceM107671d18, textResourceM107668a18, textResourceM107669b18, false, interfaceC39332eM125323a18, null, null, null, textResourceM107670c18, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a1119, null, (InterfaceC4339a) objM87133R20, null, null, null, c28655q3, (i3119 << 3) | (i3119 << 6) | (i3119 << 9) | (i3119 << 27), 0, 384, 247463377);
                            z13 = false;
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(z13);
                    } else {
                        interfaceC28601c15 = interfaceC28601c15;
                        interfaceC28601c16 = interfaceC28601c11;
                        c28655q3.m87150e0(-1781068172);
                        c28655q3.m87173q(z13);
                    }
                    if (m115775O0(interfaceC28601c14)) {
                        anyModalM107690c = c34070j.getEnablePregnancyInsightsConfirmation();
                    } else {
                        anyModalM107690c = null;
                    }
                    if ((i25 & 896) == 256) {
                        z13 = true;
                    }
                    objM87133R16 = c28655q3.m87133R();
                    if (z13) {
                        objM87133R16 = new C28827b(function16, interfaceC28601c14, 13);
                        c28655q3.m87172p0(objM87133R16);
                    } else {
                        objM87133R16 = new C28827b(function16, interfaceC28601c14, 13);
                        c28655q3.m87172p0(objM87133R16);
                    }
                    InterfaceC28601c1 interfaceC28601c217 = interfaceC28601c16;
                    Function1 function118 = function17;
                    c28676v1 = c28676v0;
                    Function1 function119 = function16;
                    InterfaceC28601c1 interfaceC28601c218 = interfaceC28601c9;
                    Function1 function25 = function15;
                    interfaceC28601c17 = interfaceC28601c1;
                    i27 = 2;
                    C15199y3 c15199y8 = c15199y3M3460c;
                    AbstractC0564o.m1394P(anyModalM107690c, (Function1) objM87133R16, null, null, null, null, c28655q3, i26, 60);
                    c28655q4 = c28655q3;
                    enumC36265aM115737B1 = m115737B1(interfaceC28601c17);
                    if (enumC36265aM115737B1 == null) {
                        i28 = -1;
                    } else {
                        i28 = n0.f155394a[enumC36265aM115737B1.ordinal()];
                    }
                    modifierM3599a = C2314t.f9131w;
                    if (i28 != -1) {
                        if (i28 != 1) {
                            modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "ModeBottomSheetTag");
                        } else if (i28 != 2) {
                            modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "ContraceptionBottomSheetTag");
                        } else if (i28 != 3) {
                            modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "PreviousPregnanciesBottomSheetTag");
                        } else if (i28 != 4) {
                            modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "FertilityInsightsDisableSurveyBottomSheetTag");
                        } else {
                            if (i28 == 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "GoalsBottomSheetTag");
                        }
                    }
                    Modifier modifier6 = modifierM3599a;
                    enumC36265aM115737B2 = m115737B1(interfaceC28601c17);
                    if (enumC36265aM115737B2 == null) {
                        i29 = -1;
                    } else {
                        i29 = n0.f155394a[enumC36265aM115737B2.ordinal()];
                    }
                    if (i29 != -1) {
                        c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                    } else if (i29 != 1) {
                        c35666g = new C35666g(c34070j.getHormonalInsightsModeBottomSheet().getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, i27, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                    } else if (i29 != 2) {
                        textResource = null;
                        objArr = 0;
                        c34063cM107692e = c34070j.getHormonalInsightsContraceptionBottomSheet();
                        if (c34063cM107692e != null) {
                            c35666g = new C35666g(c34063cM107692e.getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, i27, objArr == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                        } else {
                            c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                            c35666g = c35666g2;
                        }
                    } else if (i29 != 3) {
                        c34077qM107699l = c34070j.getPreviousPregnancies();
                        if (c34077qM107699l != null) {
                            c35666g = new C35666g(c34077qM107699l.getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, i27, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                        } else {
                            c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                            c35666g = c35666g2;
                        }
                    } else if (i29 != 4) {
                        c34063cM107688a = c34070j.getDisableFertilityInsightsSurveyDrawer();
                        if (c34063cM107688a != null) {
                            c35666g = new C35666g(c34063cM107688a.getTitleDisplay(), null, null, null, null, 0.0f, 0.0f, 126, null);
                        } else {
                            c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                            c35666g = c35666g2;
                        }
                    } else {
                        if (i29 == 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                    }
                    AbstractC35664f.a aVar6 = new AbstractC35664f.a(c15199y8);
                    objM87133R17 = c28655q4.m87133R();
                    if (objM87133R17 == c28676v1) {
                        objM87133R17 = new C36269e(4, interfaceC28601c17);
                        c28655q4.m87172p0(objM87133R17);
                    }
                    C37816b c37816bM121344e6 = AbstractC37817c.m121344e(409951292, c28655q4, new C29316o(c34070j, interfaceC28601c17, interfaceC28601c6, interfaceC28601c15, interfaceC28601c7, interfaceC28601c217, function119, function25, interfaceC28601c12, interfaceC28601c13));
                    InterfaceC4339a interfaceC4339a11110 = interfaceC4339a4;
                    c28655q = c28655q4;
                    AbstractC35660d.m112871m(modifier6, c35666g, aVar6, null, (InterfaceC4339a) objM87133R17, null, null, c37816bM121344e6, false, null, null, null, false, null, AbstractC37817c.m121344e(1279555584, c28655q4, new C14076n(c34070j, function119, function25, interfaceC4339a11110, function118, interfaceC28601c216, interfaceC28601c114, interfaceC28601c218, interfaceC28601c17)), c28655q, (C35666g.f151591h << 3) | 12607488 | (AbstractC35664f.a.f151587c << 6), 24576, 16232);
                    interfaceC4339a3 = interfaceC4339a11110;
                    function8 = function119;
                    function7 = function25;
                    function9 = function118;
                } else {
                    c28655q = c28655q5;
                    c28655q.m87138X();
                    function7 = function4;
                    function8 = function5;
                    function9 = function6;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C35766g((Object) c34070j, function7, function8, function9, (InterfaceC23459e) interfaceC4339a3, i13, i14, 2);
                }
            }
            i34 |= 3072;
            function6 = function3;
            i19 = i14 & 16;
            if (i19 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q5.m87157i(interfaceC4339a2)) {
                        i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i24 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i34 |= i24;
                }
                if ((i34 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q5.m87135U(i34 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i35 != 0) {
                        objM87133R30 = c28655q5.m87133R();
                        if (objM87133R30 == c28676v0) {
                            objM87133R30 = new C36244s(15);
                            c28655q5.m87172p0(objM87133R30);
                        }
                        function10 = (Function1) objM87133R30;
                    } else {
                        function10 = function4;
                    }
                    if (i15 != 0) {
                        objM87133R29 = c28655q5.m87133R();
                        if (objM87133R29 == c28676v0) {
                            objM87133R29 = new C36244s(9);
                            c28655q5.m87172p0(objM87133R29);
                        }
                        function11 = (Function1) objM87133R29;
                    } else {
                        function11 = function5;
                    }
                    if (i17 != 0) {
                        objM87133R28 = c28655q5.m87133R();
                        if (objM87133R28 == c28676v0) {
                            objM87133R28 = new C36244s(10);
                            c28655q5.m87172p0(objM87133R28);
                        }
                        function12 = (Function1) objM87133R28;
                    } else {
                        function12 = function6;
                    }
                    if (i19 != 0) {
                        objM87133R27 = c28655q5.m87133R();
                        if (objM87133R27 == c28676v0) {
                            objM87133R27 = new C35916a(23);
                            c28655q5.m87172p0(objM87133R27);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R27;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    objM87133R = c28655q5.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q5);
                        c28655q5.m87172p0(objM87133R);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                    function13 = function11;
                    function14 = function12;
                    c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q5, 3078, 6);
                    if (viewState.getDisableFertilityInsightsSurveyDrawer() != null) {
                        enumC36265a = EnumC36265a.FERTILITY_INSIGHTS_DISABLE_SURVEY;
                    } else {
                        enumC36265a = null;
                    }
                    objM87133R2 = c28655q5.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(enumC36265a);
                        c28655q5.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q5.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q5.m87172p0(objM87133R3);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                    objM87133R4 = c28655q5.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q5.m87172p0(objM87133R4);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q5.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q5.m87172p0(objM87133R5);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R5;
                    objM87133R6 = c28655q5.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q5.m87172p0(objM87133R6);
                    }
                    interfaceC28601c5 = (InterfaceC28601c1) objM87133R6;
                    objM87133R7 = c28655q5.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsShowCycleOverlayOn()));
                        c28655q5.m87172p0(objM87133R7);
                    }
                    InterfaceC28601c1 interfaceC28601c115 = (InterfaceC28601c1) objM87133R7;
                    objM87133R8 = c28655q5.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsHormonalInsightsOn()));
                        c28655q5.m87172p0(objM87133R8);
                    }
                    InterfaceC28601c1 interfaceC28601c219 = (InterfaceC28601c1) objM87133R8;
                    objM87133R9 = c28655q5.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = AbstractC28683x.m87272z(viewState.getSelectedMode());
                        c28655q5.m87172p0(objM87133R9);
                    }
                    interfaceC28601c6 = (InterfaceC28601c1) objM87133R9;
                    objM87133R10 = c28655q5.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = AbstractC28683x.m87272z(viewState.getSelectedContraceptionType());
                        c28655q5.m87172p0(objM87133R10);
                    }
                    interfaceC28601c7 = (InterfaceC28601c1) objM87133R10;
                    i25 = i34;
                    objM87133R11 = c28655q5.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = AbstractC28683x.m87272z(null);
                        c28655q5.m87172p0(objM87133R11);
                    }
                    interfaceC28601c8 = (InterfaceC28601c1) objM87133R11;
                    objM87133R12 = c28655q5.m87133R();
                    if (objM87133R12 == c28676v0) {
                        c34066fM107691d = viewState.getGoalsDrawer();
                        if (c34066fM107691d != null) {
                            interfaceC28601c9 = interfaceC28601c2;
                            objM74103I1 = C25235a0.f99113w;
                        } else {
                            interfaceC28601c9 = interfaceC28601c2;
                            objM74103I1 = C25235a0.f99113w;
                        }
                        objM87133R12 = AbstractC28683x.m87272z(objM74103I1);
                        c28655q5.m87172p0(objM87133R12);
                    } else {
                        interfaceC28601c9 = interfaceC28601c2;
                        interfaceC28601c3 = interfaceC28601c3;
                    }
                    interfaceC28601c10 = (InterfaceC28601c1) objM87133R12;
                    EnumC36265a enumC36265aM115737B9 = m115737B1(interfaceC28601c1);
                    zM87157i = c28655q5.m87157i(interfaceC2994c0) | c28655q5.m87157i(c15199y3M3460c);
                    objM87133R13 = c28655q5.m87133R();
                    if (zM87157i) {
                        objM87133R13 = new t(interfaceC2994c0, c15199y3M3460c, interfaceC28601c1, null);
                        c28655q5.m87172p0(objM87133R13);
                    } else {
                        objM87133R13 = new t(interfaceC2994c0, c15199y3M3460c, interfaceC28601c1, null);
                        c28655q5.m87172p0(objM87133R13);
                    }
                    AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R13, enumC36265aM115737B9);
                    zM87157i2 = c28655q5.m87157i(c15199y3M3460c) | c28655q5.m87157i(viewState);
                    objM87133R14 = c28655q5.m87133R();
                    if (zM87157i2) {
                        interfaceC28601c11 = interfaceC28601c4;
                        u uVar12 = new u(c15199y3M3460c, viewState, interfaceC28601c1, interfaceC28601c8, interfaceC28601c10, null);
                        c15199y3M3460c = c15199y3M3460c;
                        viewState = viewState;
                        interfaceC28601c12 = interfaceC28601c8;
                        interfaceC28601c13 = interfaceC28601c10;
                        c28655q5.m87172p0(uVar12);
                        objM87133R14 = uVar12;
                    } else {
                        interfaceC28601c11 = interfaceC28601c4;
                        u uVar13 = new u(c15199y3M3460c, viewState, interfaceC28601c1, interfaceC28601c8, interfaceC28601c10, null);
                        c15199y3M3460c = c15199y3M3460c;
                        viewState = viewState;
                        interfaceC28601c12 = interfaceC28601c8;
                        interfaceC28601c13 = interfaceC28601c10;
                        c28655q5.m87172p0(uVar13);
                        objM87133R14 = uVar13;
                    }
                    AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R14, c15199y3M3460c);
                    AnyModal anyModalM107690c8 = viewState.getEnablePregnancyInsightsConfirmation();
                    zM87157i3 = c28655q5.m87157i(viewState);
                    objM87133R15 = c28655q5.m87133R();
                    if (zM87157i3) {
                        objM87133R15 = new v(viewState, interfaceC28601c5, null);
                        c28655q5.m87172p0(objM87133R15);
                    } else {
                        objM87133R15 = new v(viewState, interfaceC28601c5, null);
                        c28655q5.m87172p0(objM87133R15);
                    }
                    i26 = AnyModal.$stable;
                    AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R15, anyModalM107690c8);
                    if (m115743D1(interfaceC28601c9)) {
                        c28655q5.m87150e0(-2135741304);
                        c34064dM107694g = viewState.getHormonalInsightsDisablingConfirmDialog();
                        if (c34064dM107694g == null) {
                            c28655q5.m87150e0(-1783470983);
                            c28655q5.m87173q(false);
                            interfaceC28601c1 = interfaceC28601c1;
                            interfaceC28601c14 = interfaceC28601c5;
                            function16 = function13;
                            z13 = false;
                            c28655q2 = c28655q5;
                            function15 = function10;
                        } else {
                            c28655q5.m87150e0(-1783470982);
                            TextResource textResourceM107671d19 = c34064dM107694g.getTitleDisplay();
                            TextResource textResourceM107668a19 = c34064dM107694g.getDescriptionDisplay();
                            TextResource textResourceM107669b19 = c34064dM107694g.getPrimaryButtonTitle();
                            objM87133R24 = c28655q5.m87133R();
                            if (objM87133R24 == c28676v0) {
                                objM87133R24 = w.f155428w;
                                c28655q5.m87172p0(objM87133R24);
                            }
                            InterfaceC39332e interfaceC39332eM125323a19 = p745y81.Function1.m125323a((Function1) objM87133R24);
                            TextResource textResourceM107670c19 = c34064dM107694g.getSecondaryButtonTitle();
                            objM87133R25 = c28655q5.m87133R();
                            if (objM87133R25 == c28676v0) {
                                interfaceC28601c18 = interfaceC28601c9;
                                objM87133R25 = new C36269e(0, interfaceC28601c18);
                                c28655q5.m87172p0(objM87133R25);
                            } else {
                                interfaceC28601c18 = interfaceC28601c9;
                            }
                            InterfaceC4339a interfaceC4339a11111 = (InterfaceC4339a) objM87133R25;
                            if ((i25 & 112) == 32) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            objM87133R26 = c28655q5.m87133R();
                            if (z24) {
                                objM87133R26 = new C25504c(interfaceC28601c18, interfaceC28601c6, function10);
                                c28655q5.m87172p0(objM87133R26);
                            } else {
                                objM87133R26 = new C25504c(interfaceC28601c18, interfaceC28601c6, function10);
                                c28655q5.m87172p0(objM87133R26);
                            }
                            InterfaceC4339a interfaceC4339a11112 = (InterfaceC4339a) objM87133R26;
                            int i31110 = TextResource.$stable;
                            int i31111 = (i31110 << 3) | (i31110 << 6) | (i31110 << 9) | (i31110 << 27);
                            interfaceC28601c9 = interfaceC28601c18;
                            interfaceC28601c14 = interfaceC28601c5;
                            function15 = function10;
                            function16 = function13;
                            AbstractC21211n.m59497o(null, textResourceM107671d19, textResourceM107668a19, textResourceM107669b19, false, interfaceC39332eM125323a19, null, null, null, textResourceM107670c19, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a11111, null, interfaceC4339a11112, null, null, null, c28655q5, i31111, 0, 384, 247463377);
                            c28655q2 = c28655q5;
                            z13 = false;
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z13);
                    } else {
                        interfaceC28601c1 = interfaceC28601c1;
                        interfaceC28601c14 = interfaceC28601c5;
                        c28676v0 = c28676v0;
                        function15 = function10;
                        function16 = function13;
                        z13 = false;
                        c28655q2 = c28655q5;
                        c28655q2.m87150e0(-1782794252);
                        c28655q2.m87173q(false);
                    }
                    if (m115763K0(interfaceC28601c3)) {
                        c28655q2.m87150e0(-2135716155);
                        c34064dM107696i = c34070j.getHormonalInsightsModeConfirmDialog();
                        if (c34064dM107696i == null) {
                            c28655q2.m87150e0(-1782691364);
                            c28655q2.m87173q(z13);
                            i26 = i26;
                            c28655q3 = c28655q2;
                            interfaceC28601c15 = interfaceC28601c3;
                            function17 = function14;
                        } else {
                            c28655q2.m87150e0(-1782691363);
                            TextResource textResourceM107671d110 = c34064dM107696i.getTitleDisplay();
                            TextResource textResourceM107668a110 = c34064dM107696i.getDescriptionDisplay();
                            TextResource textResourceM107669b110 = c34064dM107696i.getPrimaryButtonTitle();
                            objM87133R21 = c28655q2.m87133R();
                            if (objM87133R21 == c28676v0) {
                                objM87133R21 = x.f155429w;
                                c28655q2.m87172p0(objM87133R21);
                            }
                            InterfaceC39332e interfaceC39332eM125323a110 = p745y81.Function1.m125323a((Function1) objM87133R21);
                            TextResource textResourceM107670c110 = c34064dM107696i.getSecondaryButtonTitle();
                            objM87133R22 = c28655q2.m87133R();
                            if (objM87133R22 == c28676v0) {
                                interfaceC28601c15 = interfaceC28601c3;
                                objM87133R22 = new C36269e(1, interfaceC28601c15);
                                c28655q2.m87172p0(objM87133R22);
                            } else {
                                interfaceC28601c15 = interfaceC28601c3;
                            }
                            InterfaceC4339a interfaceC4339a11113 = (InterfaceC4339a) objM87133R22;
                            if ((i25 & 7168) == 2048) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if ((i25 & 896) == 256) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            z19 = z18 | z17;
                            objM87133R23 = c28655q2.m87133R();
                            if (z19) {
                                function17 = function14;
                                objM87133R23 = new C36238m(function17, function16, interfaceC28601c15, interfaceC28601c6);
                                c28655q2.m87172p0(objM87133R23);
                            } else {
                                function17 = function14;
                                objM87133R23 = new C36238m(function17, function16, interfaceC28601c15, interfaceC28601c6);
                                c28655q2.m87172p0(objM87133R23);
                            }
                            InterfaceC4339a interfaceC4339a11114 = (InterfaceC4339a) objM87133R23;
                            int i31112 = TextResource.$stable;
                            C28655q c28655q12 = c28655q2;
                            AbstractC21211n.m59497o(null, textResourceM107671d110, textResourceM107668a110, textResourceM107669b110, false, interfaceC39332eM125323a110, null, null, null, textResourceM107670c110, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a11113, null, interfaceC4339a11114, null, null, null, c28655q12, (i31112 << 3) | (i31112 << 6) | (i31112 << 9) | (i31112 << 27), 0, 384, 247463377);
                            c28655q3 = c28655q12;
                            z13 = false;
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(z13);
                    } else {
                        i26 = i26;
                        c28655q3 = c28655q2;
                        interfaceC28601c15 = interfaceC28601c3;
                        c15199y3M3460c = c15199y3M3460c;
                        function17 = function14;
                        c28655q3.m87150e0(-1781986764);
                        c28655q3.m87173q(z13);
                    }
                    if (m115769M0(interfaceC28601c11)) {
                        c28655q3.m87150e0(-2135689437);
                        c34064dM107693f = c34070j.getHormonalInsightsContraceptionConfirmDialog();
                        if (c34064dM107693f == null) {
                            c28655q3.m87150e0(-1781863106);
                            c28655q3.m87173q(z13);
                            interfaceC28601c15 = interfaceC28601c15;
                            interfaceC28601c16 = interfaceC28601c11;
                        } else {
                            c28655q3.m87150e0(-1781863105);
                            TextResource textResourceM107671d111 = c34064dM107693f.getTitleDisplay();
                            TextResource textResourceM107668a111 = c34064dM107693f.getDescriptionDisplay();
                            TextResource textResourceM107669b111 = c34064dM107693f.getPrimaryButtonTitle();
                            objM87133R18 = c28655q3.m87133R();
                            if (objM87133R18 == c28676v0) {
                                objM87133R18 = g.f155357w;
                                c28655q3.m87172p0(objM87133R18);
                            }
                            InterfaceC39332e interfaceC39332eM125323a111 = p745y81.Function1.m125323a((Function1) objM87133R18);
                            TextResource textResourceM107670c111 = c34064dM107693f.getSecondaryButtonTitle();
                            objM87133R19 = c28655q3.m87133R();
                            if (objM87133R19 == c28676v0) {
                                interfaceC28601c16 = interfaceC28601c11;
                                objM87133R19 = new C36269e(2, interfaceC28601c16);
                                c28655q3.m87172p0(objM87133R19);
                            } else {
                                interfaceC28601c16 = interfaceC28601c11;
                            }
                            InterfaceC4339a interfaceC4339a11115 = (InterfaceC4339a) objM87133R19;
                            if ((i25 & 7168) == 2048) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            boolean z211 = z14;
                            if ((i25 & 112) == 32) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = z211 | z15;
                            objM87133R20 = c28655q3.m87133R();
                            if (z16) {
                                objM87133R20 = new C36238m(function17, interfaceC28601c16, interfaceC28601c7, function15);
                                c28655q3.m87172p0(objM87133R20);
                            } else {
                                objM87133R20 = new C36238m(function17, interfaceC28601c16, interfaceC28601c7, function15);
                                c28655q3.m87172p0(objM87133R20);
                            }
                            int i31113 = TextResource.$stable;
                            AbstractC21211n.m59497o(null, textResourceM107671d111, textResourceM107668a111, textResourceM107669b111, false, interfaceC39332eM125323a111, null, null, null, textResourceM107670c111, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a11115, null, (InterfaceC4339a) objM87133R20, null, null, null, c28655q3, (i31113 << 3) | (i31113 << 6) | (i31113 << 9) | (i31113 << 27), 0, 384, 247463377);
                            z13 = false;
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(z13);
                    } else {
                        interfaceC28601c15 = interfaceC28601c15;
                        interfaceC28601c16 = interfaceC28601c11;
                        c28655q3.m87150e0(-1781068172);
                        c28655q3.m87173q(z13);
                    }
                    if (m115775O0(interfaceC28601c14)) {
                        anyModalM107690c = c34070j.getEnablePregnancyInsightsConfirmation();
                    } else {
                        anyModalM107690c = null;
                    }
                    if ((i25 & 896) == 256) {
                        z13 = true;
                    }
                    objM87133R16 = c28655q3.m87133R();
                    if (z13) {
                        objM87133R16 = new C28827b(function16, interfaceC28601c14, 13);
                        c28655q3.m87172p0(objM87133R16);
                    } else {
                        objM87133R16 = new C28827b(function16, interfaceC28601c14, 13);
                        c28655q3.m87172p0(objM87133R16);
                    }
                    InterfaceC28601c1 interfaceC28601c2110 = interfaceC28601c16;
                    Function1 function1110 = function17;
                    c28676v1 = c28676v0;
                    Function1 function1111 = function16;
                    InterfaceC28601c1 interfaceC28601c2111 = interfaceC28601c9;
                    Function1 function26 = function15;
                    interfaceC28601c17 = interfaceC28601c1;
                    i27 = 2;
                    C15199y3 c15199y9 = c15199y3M3460c;
                    AbstractC0564o.m1394P(anyModalM107690c, (Function1) objM87133R16, null, null, null, null, c28655q3, i26, 60);
                    c28655q4 = c28655q3;
                    enumC36265aM115737B1 = m115737B1(interfaceC28601c17);
                    if (enumC36265aM115737B1 == null) {
                        i28 = -1;
                    } else {
                        i28 = n0.f155394a[enumC36265aM115737B1.ordinal()];
                    }
                    modifierM3599a = C2314t.f9131w;
                    if (i28 != -1) {
                        if (i28 != 1) {
                            modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "ModeBottomSheetTag");
                        } else if (i28 != 2) {
                            modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "ContraceptionBottomSheetTag");
                        } else if (i28 != 3) {
                            modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "PreviousPregnanciesBottomSheetTag");
                        } else if (i28 != 4) {
                            modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "FertilityInsightsDisableSurveyBottomSheetTag");
                        } else {
                            if (i28 == 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "GoalsBottomSheetTag");
                        }
                    }
                    Modifier modifier7 = modifierM3599a;
                    enumC36265aM115737B2 = m115737B1(interfaceC28601c17);
                    if (enumC36265aM115737B2 == null) {
                        i29 = -1;
                    } else {
                        i29 = n0.f155394a[enumC36265aM115737B2.ordinal()];
                    }
                    if (i29 != -1) {
                        c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                    } else if (i29 != 1) {
                        c35666g = new C35666g(c34070j.getHormonalInsightsModeBottomSheet().getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, i27, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                    } else if (i29 != 2) {
                        textResource = null;
                        objArr = 0;
                        c34063cM107692e = c34070j.getHormonalInsightsContraceptionBottomSheet();
                        if (c34063cM107692e != null) {
                            c35666g = new C35666g(c34063cM107692e.getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, i27, objArr == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                        } else {
                            c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                            c35666g = c35666g2;
                        }
                    } else if (i29 != 3) {
                        c34077qM107699l = c34070j.getPreviousPregnancies();
                        if (c34077qM107699l != null) {
                            c35666g = new C35666g(c34077qM107699l.getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, i27, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                        } else {
                            c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                            c35666g = c35666g2;
                        }
                    } else if (i29 != 4) {
                        c34063cM107688a = c34070j.getDisableFertilityInsightsSurveyDrawer();
                        if (c34063cM107688a != null) {
                            c35666g = new C35666g(c34063cM107688a.getTitleDisplay(), null, null, null, null, 0.0f, 0.0f, 126, null);
                        } else {
                            c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                            c35666g = c35666g2;
                        }
                    } else {
                        if (i29 == 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                    }
                    AbstractC35664f.a aVar7 = new AbstractC35664f.a(c15199y9);
                    objM87133R17 = c28655q4.m87133R();
                    if (objM87133R17 == c28676v1) {
                        objM87133R17 = new C36269e(4, interfaceC28601c17);
                        c28655q4.m87172p0(objM87133R17);
                    }
                    C37816b c37816bM121344e7 = AbstractC37817c.m121344e(409951292, c28655q4, new C29316o(c34070j, interfaceC28601c17, interfaceC28601c6, interfaceC28601c15, interfaceC28601c7, interfaceC28601c2110, function1111, function26, interfaceC28601c12, interfaceC28601c13));
                    InterfaceC4339a interfaceC4339a11116 = interfaceC4339a4;
                    c28655q = c28655q4;
                    AbstractC35660d.m112871m(modifier7, c35666g, aVar7, null, (InterfaceC4339a) objM87133R17, null, null, c37816bM121344e7, false, null, null, null, false, null, AbstractC37817c.m121344e(1279555584, c28655q4, new C14076n(c34070j, function1111, function26, interfaceC4339a11116, function1110, interfaceC28601c219, interfaceC28601c115, interfaceC28601c2111, interfaceC28601c17)), c28655q, (C35666g.f151591h << 3) | 12607488 | (AbstractC35664f.a.f151587c << 6), 24576, 16232);
                    interfaceC4339a3 = interfaceC4339a11116;
                    function8 = function1111;
                    function7 = function26;
                    function9 = function1110;
                } else {
                    c28655q = c28655q5;
                    c28655q.m87138X();
                    function7 = function4;
                    function8 = function5;
                    function9 = function6;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C35766g((Object) c34070j, function7, function8, function9, (InterfaceC23459e) interfaceC4339a3, i13, i14, 2);
                }
            }
            i34 |= 24576;
            interfaceC4339a2 = interfaceC4339a;
            if ((i34 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q5.m87135U(i34 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i35 != 0) {
                    objM87133R30 = c28655q5.m87133R();
                    if (objM87133R30 == c28676v0) {
                        objM87133R30 = new C36244s(15);
                        c28655q5.m87172p0(objM87133R30);
                    }
                    function10 = (Function1) objM87133R30;
                } else {
                    function10 = function4;
                }
                if (i15 != 0) {
                    objM87133R29 = c28655q5.m87133R();
                    if (objM87133R29 == c28676v0) {
                        objM87133R29 = new C36244s(9);
                        c28655q5.m87172p0(objM87133R29);
                    }
                    function11 = (Function1) objM87133R29;
                } else {
                    function11 = function5;
                }
                if (i17 != 0) {
                    objM87133R28 = c28655q5.m87133R();
                    if (objM87133R28 == c28676v0) {
                        objM87133R28 = new C36244s(10);
                        c28655q5.m87172p0(objM87133R28);
                    }
                    function12 = (Function1) objM87133R28;
                } else {
                    function12 = function6;
                }
                if (i19 != 0) {
                    objM87133R27 = c28655q5.m87133R();
                    if (objM87133R27 == c28676v0) {
                        objM87133R27 = new C35916a(23);
                        c28655q5.m87172p0(objM87133R27);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R27;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                objM87133R = c28655q5.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q5);
                    c28655q5.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                function13 = function11;
                function14 = function12;
                c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q5, 3078, 6);
                if (viewState.getDisableFertilityInsightsSurveyDrawer() != null) {
                    enumC36265a = EnumC36265a.FERTILITY_INSIGHTS_DISABLE_SURVEY;
                } else {
                    enumC36265a = null;
                }
                objM87133R2 = c28655q5.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(enumC36265a);
                    c28655q5.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q5.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q5.m87172p0(objM87133R3);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                objM87133R4 = c28655q5.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q5.m87172p0(objM87133R4);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
                objM87133R5 = c28655q5.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q5.m87172p0(objM87133R5);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R5;
                objM87133R6 = c28655q5.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q5.m87172p0(objM87133R6);
                }
                interfaceC28601c5 = (InterfaceC28601c1) objM87133R6;
                objM87133R7 = c28655q5.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsShowCycleOverlayOn()));
                    c28655q5.m87172p0(objM87133R7);
                }
                InterfaceC28601c1 interfaceC28601c116 = (InterfaceC28601c1) objM87133R7;
                objM87133R8 = c28655q5.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsHormonalInsightsOn()));
                    c28655q5.m87172p0(objM87133R8);
                }
                InterfaceC28601c1 interfaceC28601c2112 = (InterfaceC28601c1) objM87133R8;
                objM87133R9 = c28655q5.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = AbstractC28683x.m87272z(viewState.getSelectedMode());
                    c28655q5.m87172p0(objM87133R9);
                }
                interfaceC28601c6 = (InterfaceC28601c1) objM87133R9;
                objM87133R10 = c28655q5.m87133R();
                if (objM87133R10 == c28676v0) {
                    objM87133R10 = AbstractC28683x.m87272z(viewState.getSelectedContraceptionType());
                    c28655q5.m87172p0(objM87133R10);
                }
                interfaceC28601c7 = (InterfaceC28601c1) objM87133R10;
                i25 = i34;
                objM87133R11 = c28655q5.m87133R();
                if (objM87133R11 == c28676v0) {
                    objM87133R11 = AbstractC28683x.m87272z(null);
                    c28655q5.m87172p0(objM87133R11);
                }
                interfaceC28601c8 = (InterfaceC28601c1) objM87133R11;
                objM87133R12 = c28655q5.m87133R();
                if (objM87133R12 == c28676v0) {
                    c34066fM107691d = viewState.getGoalsDrawer();
                    if (c34066fM107691d != null) {
                        interfaceC28601c9 = interfaceC28601c2;
                        objM74103I1 = C25235a0.f99113w;
                    } else {
                        interfaceC28601c9 = interfaceC28601c2;
                        objM74103I1 = C25235a0.f99113w;
                    }
                    objM87133R12 = AbstractC28683x.m87272z(objM74103I1);
                    c28655q5.m87172p0(objM87133R12);
                } else {
                    interfaceC28601c9 = interfaceC28601c2;
                    interfaceC28601c3 = interfaceC28601c3;
                }
                interfaceC28601c10 = (InterfaceC28601c1) objM87133R12;
                EnumC36265a enumC36265aM115737B10 = m115737B1(interfaceC28601c1);
                zM87157i = c28655q5.m87157i(interfaceC2994c0) | c28655q5.m87157i(c15199y3M3460c);
                objM87133R13 = c28655q5.m87133R();
                if (zM87157i) {
                    objM87133R13 = new t(interfaceC2994c0, c15199y3M3460c, interfaceC28601c1, null);
                    c28655q5.m87172p0(objM87133R13);
                } else {
                    objM87133R13 = new t(interfaceC2994c0, c15199y3M3460c, interfaceC28601c1, null);
                    c28655q5.m87172p0(objM87133R13);
                }
                AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R13, enumC36265aM115737B10);
                zM87157i2 = c28655q5.m87157i(c15199y3M3460c) | c28655q5.m87157i(viewState);
                objM87133R14 = c28655q5.m87133R();
                if (zM87157i2) {
                    interfaceC28601c11 = interfaceC28601c4;
                    u uVar14 = new u(c15199y3M3460c, viewState, interfaceC28601c1, interfaceC28601c8, interfaceC28601c10, null);
                    c15199y3M3460c = c15199y3M3460c;
                    viewState = viewState;
                    interfaceC28601c12 = interfaceC28601c8;
                    interfaceC28601c13 = interfaceC28601c10;
                    c28655q5.m87172p0(uVar14);
                    objM87133R14 = uVar14;
                } else {
                    interfaceC28601c11 = interfaceC28601c4;
                    u uVar15 = new u(c15199y3M3460c, viewState, interfaceC28601c1, interfaceC28601c8, interfaceC28601c10, null);
                    c15199y3M3460c = c15199y3M3460c;
                    viewState = viewState;
                    interfaceC28601c12 = interfaceC28601c8;
                    interfaceC28601c13 = interfaceC28601c10;
                    c28655q5.m87172p0(uVar15);
                    objM87133R14 = uVar15;
                }
                AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R14, c15199y3M3460c);
                AnyModal anyModalM107690c9 = viewState.getEnablePregnancyInsightsConfirmation();
                zM87157i3 = c28655q5.m87157i(viewState);
                objM87133R15 = c28655q5.m87133R();
                if (zM87157i3) {
                    objM87133R15 = new v(viewState, interfaceC28601c5, null);
                    c28655q5.m87172p0(objM87133R15);
                } else {
                    objM87133R15 = new v(viewState, interfaceC28601c5, null);
                    c28655q5.m87172p0(objM87133R15);
                }
                i26 = AnyModal.$stable;
                AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R15, anyModalM107690c9);
                if (m115743D1(interfaceC28601c9)) {
                    c28655q5.m87150e0(-2135741304);
                    c34064dM107694g = viewState.getHormonalInsightsDisablingConfirmDialog();
                    if (c34064dM107694g == null) {
                        c28655q5.m87150e0(-1783470983);
                        c28655q5.m87173q(false);
                        interfaceC28601c1 = interfaceC28601c1;
                        interfaceC28601c14 = interfaceC28601c5;
                        function16 = function13;
                        z13 = false;
                        c28655q2 = c28655q5;
                        function15 = function10;
                    } else {
                        c28655q5.m87150e0(-1783470982);
                        TextResource textResourceM107671d112 = c34064dM107694g.getTitleDisplay();
                        TextResource textResourceM107668a112 = c34064dM107694g.getDescriptionDisplay();
                        TextResource textResourceM107669b112 = c34064dM107694g.getPrimaryButtonTitle();
                        objM87133R24 = c28655q5.m87133R();
                        if (objM87133R24 == c28676v0) {
                            objM87133R24 = w.f155428w;
                            c28655q5.m87172p0(objM87133R24);
                        }
                        InterfaceC39332e interfaceC39332eM125323a112 = p745y81.Function1.m125323a((Function1) objM87133R24);
                        TextResource textResourceM107670c112 = c34064dM107694g.getSecondaryButtonTitle();
                        objM87133R25 = c28655q5.m87133R();
                        if (objM87133R25 == c28676v0) {
                            interfaceC28601c18 = interfaceC28601c9;
                            objM87133R25 = new C36269e(0, interfaceC28601c18);
                            c28655q5.m87172p0(objM87133R25);
                        } else {
                            interfaceC28601c18 = interfaceC28601c9;
                        }
                        InterfaceC4339a interfaceC4339a11117 = (InterfaceC4339a) objM87133R25;
                        if ((i25 & 112) == 32) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        objM87133R26 = c28655q5.m87133R();
                        if (z24) {
                            objM87133R26 = new C25504c(interfaceC28601c18, interfaceC28601c6, function10);
                            c28655q5.m87172p0(objM87133R26);
                        } else {
                            objM87133R26 = new C25504c(interfaceC28601c18, interfaceC28601c6, function10);
                            c28655q5.m87172p0(objM87133R26);
                        }
                        InterfaceC4339a interfaceC4339a11118 = (InterfaceC4339a) objM87133R26;
                        int i31114 = TextResource.$stable;
                        int i31115 = (i31114 << 3) | (i31114 << 6) | (i31114 << 9) | (i31114 << 27);
                        interfaceC28601c9 = interfaceC28601c18;
                        interfaceC28601c14 = interfaceC28601c5;
                        function15 = function10;
                        function16 = function13;
                        AbstractC21211n.m59497o(null, textResourceM107671d112, textResourceM107668a112, textResourceM107669b112, false, interfaceC39332eM125323a112, null, null, null, textResourceM107670c112, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a11117, null, interfaceC4339a11118, null, null, null, c28655q5, i31115, 0, 384, 247463377);
                        c28655q2 = c28655q5;
                        z13 = false;
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z13);
                } else {
                    interfaceC28601c1 = interfaceC28601c1;
                    interfaceC28601c14 = interfaceC28601c5;
                    c28676v0 = c28676v0;
                    function15 = function10;
                    function16 = function13;
                    z13 = false;
                    c28655q2 = c28655q5;
                    c28655q2.m87150e0(-1782794252);
                    c28655q2.m87173q(false);
                }
                if (m115763K0(interfaceC28601c3)) {
                    c28655q2.m87150e0(-2135716155);
                    c34064dM107696i = c34070j.getHormonalInsightsModeConfirmDialog();
                    if (c34064dM107696i == null) {
                        c28655q2.m87150e0(-1782691364);
                        c28655q2.m87173q(z13);
                        i26 = i26;
                        c28655q3 = c28655q2;
                        interfaceC28601c15 = interfaceC28601c3;
                        function17 = function14;
                    } else {
                        c28655q2.m87150e0(-1782691363);
                        TextResource textResourceM107671d113 = c34064dM107696i.getTitleDisplay();
                        TextResource textResourceM107668a113 = c34064dM107696i.getDescriptionDisplay();
                        TextResource textResourceM107669b113 = c34064dM107696i.getPrimaryButtonTitle();
                        objM87133R21 = c28655q2.m87133R();
                        if (objM87133R21 == c28676v0) {
                            objM87133R21 = x.f155429w;
                            c28655q2.m87172p0(objM87133R21);
                        }
                        InterfaceC39332e interfaceC39332eM125323a113 = p745y81.Function1.m125323a((Function1) objM87133R21);
                        TextResource textResourceM107670c113 = c34064dM107696i.getSecondaryButtonTitle();
                        objM87133R22 = c28655q2.m87133R();
                        if (objM87133R22 == c28676v0) {
                            interfaceC28601c15 = interfaceC28601c3;
                            objM87133R22 = new C36269e(1, interfaceC28601c15);
                            c28655q2.m87172p0(objM87133R22);
                        } else {
                            interfaceC28601c15 = interfaceC28601c3;
                        }
                        InterfaceC4339a interfaceC4339a11119 = (InterfaceC4339a) objM87133R22;
                        if ((i25 & 7168) == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if ((i25 & 896) == 256) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = z18 | z17;
                        objM87133R23 = c28655q2.m87133R();
                        if (z19) {
                            function17 = function14;
                            objM87133R23 = new C36238m(function17, function16, interfaceC28601c15, interfaceC28601c6);
                            c28655q2.m87172p0(objM87133R23);
                        } else {
                            function17 = function14;
                            objM87133R23 = new C36238m(function17, function16, interfaceC28601c15, interfaceC28601c6);
                            c28655q2.m87172p0(objM87133R23);
                        }
                        InterfaceC4339a interfaceC4339a111110 = (InterfaceC4339a) objM87133R23;
                        int i31116 = TextResource.$stable;
                        C28655q c28655q13 = c28655q2;
                        AbstractC21211n.m59497o(null, textResourceM107671d113, textResourceM107668a113, textResourceM107669b113, false, interfaceC39332eM125323a113, null, null, null, textResourceM107670c113, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a11119, null, interfaceC4339a111110, null, null, null, c28655q13, (i31116 << 3) | (i31116 << 6) | (i31116 << 9) | (i31116 << 27), 0, 384, 247463377);
                        c28655q3 = c28655q13;
                        z13 = false;
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(z13);
                } else {
                    i26 = i26;
                    c28655q3 = c28655q2;
                    interfaceC28601c15 = interfaceC28601c3;
                    c15199y3M3460c = c15199y3M3460c;
                    function17 = function14;
                    c28655q3.m87150e0(-1781986764);
                    c28655q3.m87173q(z13);
                }
                if (m115769M0(interfaceC28601c11)) {
                    c28655q3.m87150e0(-2135689437);
                    c34064dM107693f = c34070j.getHormonalInsightsContraceptionConfirmDialog();
                    if (c34064dM107693f == null) {
                        c28655q3.m87150e0(-1781863106);
                        c28655q3.m87173q(z13);
                        interfaceC28601c15 = interfaceC28601c15;
                        interfaceC28601c16 = interfaceC28601c11;
                    } else {
                        c28655q3.m87150e0(-1781863105);
                        TextResource textResourceM107671d114 = c34064dM107693f.getTitleDisplay();
                        TextResource textResourceM107668a114 = c34064dM107693f.getDescriptionDisplay();
                        TextResource textResourceM107669b114 = c34064dM107693f.getPrimaryButtonTitle();
                        objM87133R18 = c28655q3.m87133R();
                        if (objM87133R18 == c28676v0) {
                            objM87133R18 = g.f155357w;
                            c28655q3.m87172p0(objM87133R18);
                        }
                        InterfaceC39332e interfaceC39332eM125323a114 = p745y81.Function1.m125323a((Function1) objM87133R18);
                        TextResource textResourceM107670c114 = c34064dM107693f.getSecondaryButtonTitle();
                        objM87133R19 = c28655q3.m87133R();
                        if (objM87133R19 == c28676v0) {
                            interfaceC28601c16 = interfaceC28601c11;
                            objM87133R19 = new C36269e(2, interfaceC28601c16);
                            c28655q3.m87172p0(objM87133R19);
                        } else {
                            interfaceC28601c16 = interfaceC28601c11;
                        }
                        InterfaceC4339a interfaceC4339a111111 = (InterfaceC4339a) objM87133R19;
                        if ((i25 & 7168) == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean z212 = z14;
                        if ((i25 & 112) == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z212 | z15;
                        objM87133R20 = c28655q3.m87133R();
                        if (z16) {
                            objM87133R20 = new C36238m(function17, interfaceC28601c16, interfaceC28601c7, function15);
                            c28655q3.m87172p0(objM87133R20);
                        } else {
                            objM87133R20 = new C36238m(function17, interfaceC28601c16, interfaceC28601c7, function15);
                            c28655q3.m87172p0(objM87133R20);
                        }
                        int i31117 = TextResource.$stable;
                        AbstractC21211n.m59497o(null, textResourceM107671d114, textResourceM107668a114, textResourceM107669b114, false, interfaceC39332eM125323a114, null, null, null, textResourceM107670c114, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a111111, null, (InterfaceC4339a) objM87133R20, null, null, null, c28655q3, (i31117 << 3) | (i31117 << 6) | (i31117 << 9) | (i31117 << 27), 0, 384, 247463377);
                        z13 = false;
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(z13);
                } else {
                    interfaceC28601c15 = interfaceC28601c15;
                    interfaceC28601c16 = interfaceC28601c11;
                    c28655q3.m87150e0(-1781068172);
                    c28655q3.m87173q(z13);
                }
                if (m115775O0(interfaceC28601c14)) {
                    anyModalM107690c = c34070j.getEnablePregnancyInsightsConfirmation();
                } else {
                    anyModalM107690c = null;
                }
                if ((i25 & 896) == 256) {
                    z13 = true;
                }
                objM87133R16 = c28655q3.m87133R();
                if (z13) {
                    objM87133R16 = new C28827b(function16, interfaceC28601c14, 13);
                    c28655q3.m87172p0(objM87133R16);
                } else {
                    objM87133R16 = new C28827b(function16, interfaceC28601c14, 13);
                    c28655q3.m87172p0(objM87133R16);
                }
                InterfaceC28601c1 interfaceC28601c2113 = interfaceC28601c16;
                Function1 function1112 = function17;
                c28676v1 = c28676v0;
                Function1 function1113 = function16;
                InterfaceC28601c1 interfaceC28601c2114 = interfaceC28601c9;
                Function1 function27 = function15;
                interfaceC28601c17 = interfaceC28601c1;
                i27 = 2;
                C15199y3 c15199y10 = c15199y3M3460c;
                AbstractC0564o.m1394P(anyModalM107690c, (Function1) objM87133R16, null, null, null, null, c28655q3, i26, 60);
                c28655q4 = c28655q3;
                enumC36265aM115737B1 = m115737B1(interfaceC28601c17);
                if (enumC36265aM115737B1 == null) {
                    i28 = -1;
                } else {
                    i28 = n0.f155394a[enumC36265aM115737B1.ordinal()];
                }
                modifierM3599a = C2314t.f9131w;
                if (i28 != -1) {
                    if (i28 != 1) {
                        modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "ModeBottomSheetTag");
                    } else if (i28 != 2) {
                        modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "ContraceptionBottomSheetTag");
                    } else if (i28 != 3) {
                        modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "PreviousPregnanciesBottomSheetTag");
                    } else if (i28 != 4) {
                        modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "FertilityInsightsDisableSurveyBottomSheetTag");
                    } else {
                        if (i28 == 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "GoalsBottomSheetTag");
                    }
                }
                Modifier modifier8 = modifierM3599a;
                enumC36265aM115737B2 = m115737B1(interfaceC28601c17);
                if (enumC36265aM115737B2 == null) {
                    i29 = -1;
                } else {
                    i29 = n0.f155394a[enumC36265aM115737B2.ordinal()];
                }
                if (i29 != -1) {
                    c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                } else if (i29 != 1) {
                    c35666g = new C35666g(c34070j.getHormonalInsightsModeBottomSheet().getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, i27, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                } else if (i29 != 2) {
                    textResource = null;
                    objArr = 0;
                    c34063cM107692e = c34070j.getHormonalInsightsContraceptionBottomSheet();
                    if (c34063cM107692e != null) {
                        c35666g = new C35666g(c34063cM107692e.getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, i27, objArr == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                    } else {
                        c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                        c35666g = c35666g2;
                    }
                } else if (i29 != 3) {
                    c34077qM107699l = c34070j.getPreviousPregnancies();
                    if (c34077qM107699l != null) {
                        c35666g = new C35666g(c34077qM107699l.getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, i27, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                    } else {
                        c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                        c35666g = c35666g2;
                    }
                } else if (i29 != 4) {
                    c34063cM107688a = c34070j.getDisableFertilityInsightsSurveyDrawer();
                    if (c34063cM107688a != null) {
                        c35666g = new C35666g(c34063cM107688a.getTitleDisplay(), null, null, null, null, 0.0f, 0.0f, 126, null);
                    } else {
                        c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                        c35666g = c35666g2;
                    }
                } else {
                    if (i29 == 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                }
                AbstractC35664f.a aVar8 = new AbstractC35664f.a(c15199y10);
                objM87133R17 = c28655q4.m87133R();
                if (objM87133R17 == c28676v1) {
                    objM87133R17 = new C36269e(4, interfaceC28601c17);
                    c28655q4.m87172p0(objM87133R17);
                }
                C37816b c37816bM121344e8 = AbstractC37817c.m121344e(409951292, c28655q4, new C29316o(c34070j, interfaceC28601c17, interfaceC28601c6, interfaceC28601c15, interfaceC28601c7, interfaceC28601c2113, function1113, function27, interfaceC28601c12, interfaceC28601c13));
                InterfaceC4339a interfaceC4339a111112 = interfaceC4339a4;
                c28655q = c28655q4;
                AbstractC35660d.m112871m(modifier8, c35666g, aVar8, null, (InterfaceC4339a) objM87133R17, null, null, c37816bM121344e8, false, null, null, null, false, null, AbstractC37817c.m121344e(1279555584, c28655q4, new C14076n(c34070j, function1113, function27, interfaceC4339a111112, function1112, interfaceC28601c2112, interfaceC28601c116, interfaceC28601c2114, interfaceC28601c17)), c28655q, (C35666g.f151591h << 3) | 12607488 | (AbstractC35664f.a.f151587c << 6), 24576, 16232);
                interfaceC4339a3 = interfaceC4339a111112;
                function8 = function1113;
                function7 = function27;
                function9 = function1112;
            } else {
                c28655q = c28655q5;
                c28655q.m87138X();
                function7 = function4;
                function8 = function5;
                function9 = function6;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35766g((Object) c34070j, function7, function8, function9, (InterfaceC23459e) interfaceC4339a3, i13, i14, 2);
            }
        }
        i34 |= 48;
        function4 = function1;
        i15 = i14 & 4;
        if (i15 != 0) {
            if ((i13 & 384) == 0) {
                function5 = function2;
                if (c28655q5.m87157i(function5)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i34 |= i16;
            }
            i17 = i14 & 8;
            if (i17 != 0) {
                if ((i13 & 3072) == 0) {
                    function6 = function3;
                    if (c28655q5.m87157i(function6)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i34 |= i18;
                }
                i19 = i14 & 16;
                if (i19 != 0) {
                    if ((i13 & 24576) == 0) {
                        interfaceC4339a2 = interfaceC4339a;
                        if (c28655q5.m87157i(interfaceC4339a2)) {
                            i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i24 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i34 |= i24;
                    }
                    if ((i34 & 9363) != 9362) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q5.m87135U(i34 & 1, z4)) {
                        c28676v0 = C28635l.f115821a;
                        if (i35 != 0) {
                            objM87133R30 = c28655q5.m87133R();
                            if (objM87133R30 == c28676v0) {
                                objM87133R30 = new C36244s(15);
                                c28655q5.m87172p0(objM87133R30);
                            }
                            function10 = (Function1) objM87133R30;
                        } else {
                            function10 = function4;
                        }
                        if (i15 != 0) {
                            objM87133R29 = c28655q5.m87133R();
                            if (objM87133R29 == c28676v0) {
                                objM87133R29 = new C36244s(9);
                                c28655q5.m87172p0(objM87133R29);
                            }
                            function11 = (Function1) objM87133R29;
                        } else {
                            function11 = function5;
                        }
                        if (i17 != 0) {
                            objM87133R28 = c28655q5.m87133R();
                            if (objM87133R28 == c28676v0) {
                                objM87133R28 = new C36244s(10);
                                c28655q5.m87172p0(objM87133R28);
                            }
                            function12 = (Function1) objM87133R28;
                        } else {
                            function12 = function6;
                        }
                        if (i19 != 0) {
                            objM87133R27 = c28655q5.m87133R();
                            if (objM87133R27 == c28676v0) {
                                objM87133R27 = new C35916a(23);
                                c28655q5.m87172p0(objM87133R27);
                            }
                            interfaceC4339a4 = (InterfaceC4339a) objM87133R27;
                        } else {
                            interfaceC4339a4 = interfaceC4339a2;
                        }
                        objM87133R = c28655q5.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87262p(c28655q5);
                            c28655q5.m87172p0(objM87133R);
                        }
                        interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                        function13 = function11;
                        function14 = function12;
                        c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q5, 3078, 6);
                        if (viewState.getDisableFertilityInsightsSurveyDrawer() != null) {
                            enumC36265a = EnumC36265a.FERTILITY_INSIGHTS_DISABLE_SURVEY;
                        } else {
                            enumC36265a = null;
                        }
                        objM87133R2 = c28655q5.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(enumC36265a);
                            c28655q5.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        objM87133R3 = c28655q5.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q5.m87172p0(objM87133R3);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                        objM87133R4 = c28655q5.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q5.m87172p0(objM87133R4);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
                        objM87133R5 = c28655q5.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q5.m87172p0(objM87133R5);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM87133R5;
                        objM87133R6 = c28655q5.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q5.m87172p0(objM87133R6);
                        }
                        interfaceC28601c5 = (InterfaceC28601c1) objM87133R6;
                        objM87133R7 = c28655q5.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsShowCycleOverlayOn()));
                            c28655q5.m87172p0(objM87133R7);
                        }
                        InterfaceC28601c1 interfaceC28601c117 = (InterfaceC28601c1) objM87133R7;
                        objM87133R8 = c28655q5.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsHormonalInsightsOn()));
                            c28655q5.m87172p0(objM87133R8);
                        }
                        InterfaceC28601c1 interfaceC28601c2115 = (InterfaceC28601c1) objM87133R8;
                        objM87133R9 = c28655q5.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = AbstractC28683x.m87272z(viewState.getSelectedMode());
                            c28655q5.m87172p0(objM87133R9);
                        }
                        interfaceC28601c6 = (InterfaceC28601c1) objM87133R9;
                        objM87133R10 = c28655q5.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = AbstractC28683x.m87272z(viewState.getSelectedContraceptionType());
                            c28655q5.m87172p0(objM87133R10);
                        }
                        interfaceC28601c7 = (InterfaceC28601c1) objM87133R10;
                        i25 = i34;
                        objM87133R11 = c28655q5.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = AbstractC28683x.m87272z(null);
                            c28655q5.m87172p0(objM87133R11);
                        }
                        interfaceC28601c8 = (InterfaceC28601c1) objM87133R11;
                        objM87133R12 = c28655q5.m87133R();
                        if (objM87133R12 == c28676v0) {
                            c34066fM107691d = viewState.getGoalsDrawer();
                            if (c34066fM107691d != null) {
                                interfaceC28601c9 = interfaceC28601c2;
                                objM74103I1 = C25235a0.f99113w;
                            } else {
                                interfaceC28601c9 = interfaceC28601c2;
                                objM74103I1 = C25235a0.f99113w;
                            }
                            objM87133R12 = AbstractC28683x.m87272z(objM74103I1);
                            c28655q5.m87172p0(objM87133R12);
                        } else {
                            interfaceC28601c9 = interfaceC28601c2;
                            interfaceC28601c3 = interfaceC28601c3;
                        }
                        interfaceC28601c10 = (InterfaceC28601c1) objM87133R12;
                        EnumC36265a enumC36265aM115737B11 = m115737B1(interfaceC28601c1);
                        zM87157i = c28655q5.m87157i(interfaceC2994c0) | c28655q5.m87157i(c15199y3M3460c);
                        objM87133R13 = c28655q5.m87133R();
                        if (zM87157i) {
                            objM87133R13 = new t(interfaceC2994c0, c15199y3M3460c, interfaceC28601c1, null);
                            c28655q5.m87172p0(objM87133R13);
                        } else {
                            objM87133R13 = new t(interfaceC2994c0, c15199y3M3460c, interfaceC28601c1, null);
                            c28655q5.m87172p0(objM87133R13);
                        }
                        AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R13, enumC36265aM115737B11);
                        zM87157i2 = c28655q5.m87157i(c15199y3M3460c) | c28655q5.m87157i(viewState);
                        objM87133R14 = c28655q5.m87133R();
                        if (zM87157i2) {
                            interfaceC28601c11 = interfaceC28601c4;
                            u uVar16 = new u(c15199y3M3460c, viewState, interfaceC28601c1, interfaceC28601c8, interfaceC28601c10, null);
                            c15199y3M3460c = c15199y3M3460c;
                            viewState = viewState;
                            interfaceC28601c12 = interfaceC28601c8;
                            interfaceC28601c13 = interfaceC28601c10;
                            c28655q5.m87172p0(uVar16);
                            objM87133R14 = uVar16;
                        } else {
                            interfaceC28601c11 = interfaceC28601c4;
                            u uVar17 = new u(c15199y3M3460c, viewState, interfaceC28601c1, interfaceC28601c8, interfaceC28601c10, null);
                            c15199y3M3460c = c15199y3M3460c;
                            viewState = viewState;
                            interfaceC28601c12 = interfaceC28601c8;
                            interfaceC28601c13 = interfaceC28601c10;
                            c28655q5.m87172p0(uVar17);
                            objM87133R14 = uVar17;
                        }
                        AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R14, c15199y3M3460c);
                        AnyModal anyModalM107690c10 = viewState.getEnablePregnancyInsightsConfirmation();
                        zM87157i3 = c28655q5.m87157i(viewState);
                        objM87133R15 = c28655q5.m87133R();
                        if (zM87157i3) {
                            objM87133R15 = new v(viewState, interfaceC28601c5, null);
                            c28655q5.m87172p0(objM87133R15);
                        } else {
                            objM87133R15 = new v(viewState, interfaceC28601c5, null);
                            c28655q5.m87172p0(objM87133R15);
                        }
                        i26 = AnyModal.$stable;
                        AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R15, anyModalM107690c10);
                        if (m115743D1(interfaceC28601c9)) {
                            c28655q5.m87150e0(-2135741304);
                            c34064dM107694g = viewState.getHormonalInsightsDisablingConfirmDialog();
                            if (c34064dM107694g == null) {
                                c28655q5.m87150e0(-1783470983);
                                c28655q5.m87173q(false);
                                interfaceC28601c1 = interfaceC28601c1;
                                interfaceC28601c14 = interfaceC28601c5;
                                function16 = function13;
                                z13 = false;
                                c28655q2 = c28655q5;
                                function15 = function10;
                            } else {
                                c28655q5.m87150e0(-1783470982);
                                TextResource textResourceM107671d115 = c34064dM107694g.getTitleDisplay();
                                TextResource textResourceM107668a115 = c34064dM107694g.getDescriptionDisplay();
                                TextResource textResourceM107669b115 = c34064dM107694g.getPrimaryButtonTitle();
                                objM87133R24 = c28655q5.m87133R();
                                if (objM87133R24 == c28676v0) {
                                    objM87133R24 = w.f155428w;
                                    c28655q5.m87172p0(objM87133R24);
                                }
                                InterfaceC39332e interfaceC39332eM125323a115 = p745y81.Function1.m125323a((Function1) objM87133R24);
                                TextResource textResourceM107670c115 = c34064dM107694g.getSecondaryButtonTitle();
                                objM87133R25 = c28655q5.m87133R();
                                if (objM87133R25 == c28676v0) {
                                    interfaceC28601c18 = interfaceC28601c9;
                                    objM87133R25 = new C36269e(0, interfaceC28601c18);
                                    c28655q5.m87172p0(objM87133R25);
                                } else {
                                    interfaceC28601c18 = interfaceC28601c9;
                                }
                                InterfaceC4339a interfaceC4339a111113 = (InterfaceC4339a) objM87133R25;
                                if ((i25 & 112) == 32) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                                objM87133R26 = c28655q5.m87133R();
                                if (z24) {
                                    objM87133R26 = new C25504c(interfaceC28601c18, interfaceC28601c6, function10);
                                    c28655q5.m87172p0(objM87133R26);
                                } else {
                                    objM87133R26 = new C25504c(interfaceC28601c18, interfaceC28601c6, function10);
                                    c28655q5.m87172p0(objM87133R26);
                                }
                                InterfaceC4339a interfaceC4339a111114 = (InterfaceC4339a) objM87133R26;
                                int i31118 = TextResource.$stable;
                                int i31119 = (i31118 << 3) | (i31118 << 6) | (i31118 << 9) | (i31118 << 27);
                                interfaceC28601c9 = interfaceC28601c18;
                                interfaceC28601c14 = interfaceC28601c5;
                                function15 = function10;
                                function16 = function13;
                                AbstractC21211n.m59497o(null, textResourceM107671d115, textResourceM107668a115, textResourceM107669b115, false, interfaceC39332eM125323a115, null, null, null, textResourceM107670c115, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a111113, null, interfaceC4339a111114, null, null, null, c28655q5, i31119, 0, 384, 247463377);
                                c28655q2 = c28655q5;
                                z13 = false;
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(z13);
                        } else {
                            interfaceC28601c1 = interfaceC28601c1;
                            interfaceC28601c14 = interfaceC28601c5;
                            c28676v0 = c28676v0;
                            function15 = function10;
                            function16 = function13;
                            z13 = false;
                            c28655q2 = c28655q5;
                            c28655q2.m87150e0(-1782794252);
                            c28655q2.m87173q(false);
                        }
                        if (m115763K0(interfaceC28601c3)) {
                            c28655q2.m87150e0(-2135716155);
                            c34064dM107696i = c34070j.getHormonalInsightsModeConfirmDialog();
                            if (c34064dM107696i == null) {
                                c28655q2.m87150e0(-1782691364);
                                c28655q2.m87173q(z13);
                                i26 = i26;
                                c28655q3 = c28655q2;
                                interfaceC28601c15 = interfaceC28601c3;
                                function17 = function14;
                            } else {
                                c28655q2.m87150e0(-1782691363);
                                TextResource textResourceM107671d116 = c34064dM107696i.getTitleDisplay();
                                TextResource textResourceM107668a116 = c34064dM107696i.getDescriptionDisplay();
                                TextResource textResourceM107669b116 = c34064dM107696i.getPrimaryButtonTitle();
                                objM87133R21 = c28655q2.m87133R();
                                if (objM87133R21 == c28676v0) {
                                    objM87133R21 = x.f155429w;
                                    c28655q2.m87172p0(objM87133R21);
                                }
                                InterfaceC39332e interfaceC39332eM125323a116 = p745y81.Function1.m125323a((Function1) objM87133R21);
                                TextResource textResourceM107670c116 = c34064dM107696i.getSecondaryButtonTitle();
                                objM87133R22 = c28655q2.m87133R();
                                if (objM87133R22 == c28676v0) {
                                    interfaceC28601c15 = interfaceC28601c3;
                                    objM87133R22 = new C36269e(1, interfaceC28601c15);
                                    c28655q2.m87172p0(objM87133R22);
                                } else {
                                    interfaceC28601c15 = interfaceC28601c3;
                                }
                                InterfaceC4339a interfaceC4339a111115 = (InterfaceC4339a) objM87133R22;
                                if ((i25 & 7168) == 2048) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                if ((i25 & 896) == 256) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                z19 = z18 | z17;
                                objM87133R23 = c28655q2.m87133R();
                                if (z19) {
                                    function17 = function14;
                                    objM87133R23 = new C36238m(function17, function16, interfaceC28601c15, interfaceC28601c6);
                                    c28655q2.m87172p0(objM87133R23);
                                } else {
                                    function17 = function14;
                                    objM87133R23 = new C36238m(function17, function16, interfaceC28601c15, interfaceC28601c6);
                                    c28655q2.m87172p0(objM87133R23);
                                }
                                InterfaceC4339a interfaceC4339a111116 = (InterfaceC4339a) objM87133R23;
                                int i311110 = TextResource.$stable;
                                C28655q c28655q14 = c28655q2;
                                AbstractC21211n.m59497o(null, textResourceM107671d116, textResourceM107668a116, textResourceM107669b116, false, interfaceC39332eM125323a116, null, null, null, textResourceM107670c116, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a111115, null, interfaceC4339a111116, null, null, null, c28655q14, (i311110 << 3) | (i311110 << 6) | (i311110 << 9) | (i311110 << 27), 0, 384, 247463377);
                                c28655q3 = c28655q14;
                                z13 = false;
                                c28655q3.m87173q(false);
                            }
                            c28655q3.m87173q(z13);
                        } else {
                            i26 = i26;
                            c28655q3 = c28655q2;
                            interfaceC28601c15 = interfaceC28601c3;
                            c15199y3M3460c = c15199y3M3460c;
                            function17 = function14;
                            c28655q3.m87150e0(-1781986764);
                            c28655q3.m87173q(z13);
                        }
                        if (m115769M0(interfaceC28601c11)) {
                            c28655q3.m87150e0(-2135689437);
                            c34064dM107693f = c34070j.getHormonalInsightsContraceptionConfirmDialog();
                            if (c34064dM107693f == null) {
                                c28655q3.m87150e0(-1781863106);
                                c28655q3.m87173q(z13);
                                interfaceC28601c15 = interfaceC28601c15;
                                interfaceC28601c16 = interfaceC28601c11;
                            } else {
                                c28655q3.m87150e0(-1781863105);
                                TextResource textResourceM107671d117 = c34064dM107693f.getTitleDisplay();
                                TextResource textResourceM107668a117 = c34064dM107693f.getDescriptionDisplay();
                                TextResource textResourceM107669b117 = c34064dM107693f.getPrimaryButtonTitle();
                                objM87133R18 = c28655q3.m87133R();
                                if (objM87133R18 == c28676v0) {
                                    objM87133R18 = g.f155357w;
                                    c28655q3.m87172p0(objM87133R18);
                                }
                                InterfaceC39332e interfaceC39332eM125323a117 = p745y81.Function1.m125323a((Function1) objM87133R18);
                                TextResource textResourceM107670c117 = c34064dM107693f.getSecondaryButtonTitle();
                                objM87133R19 = c28655q3.m87133R();
                                if (objM87133R19 == c28676v0) {
                                    interfaceC28601c16 = interfaceC28601c11;
                                    objM87133R19 = new C36269e(2, interfaceC28601c16);
                                    c28655q3.m87172p0(objM87133R19);
                                } else {
                                    interfaceC28601c16 = interfaceC28601c11;
                                }
                                InterfaceC4339a interfaceC4339a111117 = (InterfaceC4339a) objM87133R19;
                                if ((i25 & 7168) == 2048) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                boolean z213 = z14;
                                if ((i25 & 112) == 32) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                z16 = z213 | z15;
                                objM87133R20 = c28655q3.m87133R();
                                if (z16) {
                                    objM87133R20 = new C36238m(function17, interfaceC28601c16, interfaceC28601c7, function15);
                                    c28655q3.m87172p0(objM87133R20);
                                } else {
                                    objM87133R20 = new C36238m(function17, interfaceC28601c16, interfaceC28601c7, function15);
                                    c28655q3.m87172p0(objM87133R20);
                                }
                                int i311111 = TextResource.$stable;
                                AbstractC21211n.m59497o(null, textResourceM107671d117, textResourceM107668a117, textResourceM107669b117, false, interfaceC39332eM125323a117, null, null, null, textResourceM107670c117, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a111117, null, (InterfaceC4339a) objM87133R20, null, null, null, c28655q3, (i311111 << 3) | (i311111 << 6) | (i311111 << 9) | (i311111 << 27), 0, 384, 247463377);
                                z13 = false;
                                c28655q3.m87173q(false);
                            }
                            c28655q3.m87173q(z13);
                        } else {
                            interfaceC28601c15 = interfaceC28601c15;
                            interfaceC28601c16 = interfaceC28601c11;
                            c28655q3.m87150e0(-1781068172);
                            c28655q3.m87173q(z13);
                        }
                        if (m115775O0(interfaceC28601c14)) {
                            anyModalM107690c = c34070j.getEnablePregnancyInsightsConfirmation();
                        } else {
                            anyModalM107690c = null;
                        }
                        if ((i25 & 896) == 256) {
                            z13 = true;
                        }
                        objM87133R16 = c28655q3.m87133R();
                        if (z13) {
                            objM87133R16 = new C28827b(function16, interfaceC28601c14, 13);
                            c28655q3.m87172p0(objM87133R16);
                        } else {
                            objM87133R16 = new C28827b(function16, interfaceC28601c14, 13);
                            c28655q3.m87172p0(objM87133R16);
                        }
                        InterfaceC28601c1 interfaceC28601c2116 = interfaceC28601c16;
                        Function1 function1114 = function17;
                        c28676v1 = c28676v0;
                        Function1 function1115 = function16;
                        InterfaceC28601c1 interfaceC28601c2117 = interfaceC28601c9;
                        Function1 function28 = function15;
                        interfaceC28601c17 = interfaceC28601c1;
                        i27 = 2;
                        C15199y3 c15199y11 = c15199y3M3460c;
                        AbstractC0564o.m1394P(anyModalM107690c, (Function1) objM87133R16, null, null, null, null, c28655q3, i26, 60);
                        c28655q4 = c28655q3;
                        enumC36265aM115737B1 = m115737B1(interfaceC28601c17);
                        if (enumC36265aM115737B1 == null) {
                            i28 = -1;
                        } else {
                            i28 = n0.f155394a[enumC36265aM115737B1.ordinal()];
                        }
                        modifierM3599a = C2314t.f9131w;
                        if (i28 != -1) {
                            if (i28 != 1) {
                                modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "ModeBottomSheetTag");
                            } else if (i28 != 2) {
                                modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "ContraceptionBottomSheetTag");
                            } else if (i28 != 3) {
                                modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "PreviousPregnanciesBottomSheetTag");
                            } else if (i28 != 4) {
                                modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "FertilityInsightsDisableSurveyBottomSheetTag");
                            } else {
                                if (i28 == 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "GoalsBottomSheetTag");
                            }
                        }
                        Modifier modifier9 = modifierM3599a;
                        enumC36265aM115737B2 = m115737B1(interfaceC28601c17);
                        if (enumC36265aM115737B2 == null) {
                            i29 = -1;
                        } else {
                            i29 = n0.f155394a[enumC36265aM115737B2.ordinal()];
                        }
                        if (i29 != -1) {
                            c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                        } else if (i29 != 1) {
                            c35666g = new C35666g(c34070j.getHormonalInsightsModeBottomSheet().getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, i27, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                        } else if (i29 != 2) {
                            textResource = null;
                            objArr = 0;
                            c34063cM107692e = c34070j.getHormonalInsightsContraceptionBottomSheet();
                            if (c34063cM107692e != null) {
                                c35666g = new C35666g(c34063cM107692e.getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, i27, objArr == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                            } else {
                                c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                                c35666g = c35666g2;
                            }
                        } else if (i29 != 3) {
                            c34077qM107699l = c34070j.getPreviousPregnancies();
                            if (c34077qM107699l != null) {
                                c35666g = new C35666g(c34077qM107699l.getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, i27, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                            } else {
                                c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                                c35666g = c35666g2;
                            }
                        } else if (i29 != 4) {
                            c34063cM107688a = c34070j.getDisableFertilityInsightsSurveyDrawer();
                            if (c34063cM107688a != null) {
                                c35666g = new C35666g(c34063cM107688a.getTitleDisplay(), null, null, null, null, 0.0f, 0.0f, 126, null);
                            } else {
                                c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                                c35666g = c35666g2;
                            }
                        } else {
                            if (i29 == 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                        }
                        AbstractC35664f.a aVar9 = new AbstractC35664f.a(c15199y11);
                        objM87133R17 = c28655q4.m87133R();
                        if (objM87133R17 == c28676v1) {
                            objM87133R17 = new C36269e(4, interfaceC28601c17);
                            c28655q4.m87172p0(objM87133R17);
                        }
                        C37816b c37816bM121344e9 = AbstractC37817c.m121344e(409951292, c28655q4, new C29316o(c34070j, interfaceC28601c17, interfaceC28601c6, interfaceC28601c15, interfaceC28601c7, interfaceC28601c2116, function1115, function28, interfaceC28601c12, interfaceC28601c13));
                        InterfaceC4339a interfaceC4339a111118 = interfaceC4339a4;
                        c28655q = c28655q4;
                        AbstractC35660d.m112871m(modifier9, c35666g, aVar9, null, (InterfaceC4339a) objM87133R17, null, null, c37816bM121344e9, false, null, null, null, false, null, AbstractC37817c.m121344e(1279555584, c28655q4, new C14076n(c34070j, function1115, function28, interfaceC4339a111118, function1114, interfaceC28601c2115, interfaceC28601c117, interfaceC28601c2117, interfaceC28601c17)), c28655q, (C35666g.f151591h << 3) | 12607488 | (AbstractC35664f.a.f151587c << 6), 24576, 16232);
                        interfaceC4339a3 = interfaceC4339a111118;
                        function8 = function1115;
                        function7 = function28;
                        function9 = function1114;
                    } else {
                        c28655q = c28655q5;
                        c28655q.m87138X();
                        function7 = function4;
                        function8 = function5;
                        function9 = function6;
                        interfaceC4339a3 = interfaceC4339a2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C35766g((Object) c34070j, function7, function8, function9, (InterfaceC23459e) interfaceC4339a3, i13, i14, 2);
                    }
                }
                i34 |= 24576;
                interfaceC4339a2 = interfaceC4339a;
                if ((i34 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q5.m87135U(i34 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i35 != 0) {
                        objM87133R30 = c28655q5.m87133R();
                        if (objM87133R30 == c28676v0) {
                            objM87133R30 = new C36244s(15);
                            c28655q5.m87172p0(objM87133R30);
                        }
                        function10 = (Function1) objM87133R30;
                    } else {
                        function10 = function4;
                    }
                    if (i15 != 0) {
                        objM87133R29 = c28655q5.m87133R();
                        if (objM87133R29 == c28676v0) {
                            objM87133R29 = new C36244s(9);
                            c28655q5.m87172p0(objM87133R29);
                        }
                        function11 = (Function1) objM87133R29;
                    } else {
                        function11 = function5;
                    }
                    if (i17 != 0) {
                        objM87133R28 = c28655q5.m87133R();
                        if (objM87133R28 == c28676v0) {
                            objM87133R28 = new C36244s(10);
                            c28655q5.m87172p0(objM87133R28);
                        }
                        function12 = (Function1) objM87133R28;
                    } else {
                        function12 = function6;
                    }
                    if (i19 != 0) {
                        objM87133R27 = c28655q5.m87133R();
                        if (objM87133R27 == c28676v0) {
                            objM87133R27 = new C35916a(23);
                            c28655q5.m87172p0(objM87133R27);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R27;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    objM87133R = c28655q5.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q5);
                        c28655q5.m87172p0(objM87133R);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                    function13 = function11;
                    function14 = function12;
                    c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q5, 3078, 6);
                    if (viewState.getDisableFertilityInsightsSurveyDrawer() != null) {
                        enumC36265a = EnumC36265a.FERTILITY_INSIGHTS_DISABLE_SURVEY;
                    } else {
                        enumC36265a = null;
                    }
                    objM87133R2 = c28655q5.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(enumC36265a);
                        c28655q5.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q5.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q5.m87172p0(objM87133R3);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                    objM87133R4 = c28655q5.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q5.m87172p0(objM87133R4);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q5.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q5.m87172p0(objM87133R5);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R5;
                    objM87133R6 = c28655q5.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q5.m87172p0(objM87133R6);
                    }
                    interfaceC28601c5 = (InterfaceC28601c1) objM87133R6;
                    objM87133R7 = c28655q5.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsShowCycleOverlayOn()));
                        c28655q5.m87172p0(objM87133R7);
                    }
                    InterfaceC28601c1 interfaceC28601c118 = (InterfaceC28601c1) objM87133R7;
                    objM87133R8 = c28655q5.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsHormonalInsightsOn()));
                        c28655q5.m87172p0(objM87133R8);
                    }
                    InterfaceC28601c1 interfaceC28601c2118 = (InterfaceC28601c1) objM87133R8;
                    objM87133R9 = c28655q5.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = AbstractC28683x.m87272z(viewState.getSelectedMode());
                        c28655q5.m87172p0(objM87133R9);
                    }
                    interfaceC28601c6 = (InterfaceC28601c1) objM87133R9;
                    objM87133R10 = c28655q5.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = AbstractC28683x.m87272z(viewState.getSelectedContraceptionType());
                        c28655q5.m87172p0(objM87133R10);
                    }
                    interfaceC28601c7 = (InterfaceC28601c1) objM87133R10;
                    i25 = i34;
                    objM87133R11 = c28655q5.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = AbstractC28683x.m87272z(null);
                        c28655q5.m87172p0(objM87133R11);
                    }
                    interfaceC28601c8 = (InterfaceC28601c1) objM87133R11;
                    objM87133R12 = c28655q5.m87133R();
                    if (objM87133R12 == c28676v0) {
                        c34066fM107691d = viewState.getGoalsDrawer();
                        if (c34066fM107691d != null) {
                            interfaceC28601c9 = interfaceC28601c2;
                            objM74103I1 = C25235a0.f99113w;
                        } else {
                            interfaceC28601c9 = interfaceC28601c2;
                            objM74103I1 = C25235a0.f99113w;
                        }
                        objM87133R12 = AbstractC28683x.m87272z(objM74103I1);
                        c28655q5.m87172p0(objM87133R12);
                    } else {
                        interfaceC28601c9 = interfaceC28601c2;
                        interfaceC28601c3 = interfaceC28601c3;
                    }
                    interfaceC28601c10 = (InterfaceC28601c1) objM87133R12;
                    EnumC36265a enumC36265aM115737B12 = m115737B1(interfaceC28601c1);
                    zM87157i = c28655q5.m87157i(interfaceC2994c0) | c28655q5.m87157i(c15199y3M3460c);
                    objM87133R13 = c28655q5.m87133R();
                    if (zM87157i) {
                        objM87133R13 = new t(interfaceC2994c0, c15199y3M3460c, interfaceC28601c1, null);
                        c28655q5.m87172p0(objM87133R13);
                    } else {
                        objM87133R13 = new t(interfaceC2994c0, c15199y3M3460c, interfaceC28601c1, null);
                        c28655q5.m87172p0(objM87133R13);
                    }
                    AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R13, enumC36265aM115737B12);
                    zM87157i2 = c28655q5.m87157i(c15199y3M3460c) | c28655q5.m87157i(viewState);
                    objM87133R14 = c28655q5.m87133R();
                    if (zM87157i2) {
                        interfaceC28601c11 = interfaceC28601c4;
                        u uVar18 = new u(c15199y3M3460c, viewState, interfaceC28601c1, interfaceC28601c8, interfaceC28601c10, null);
                        c15199y3M3460c = c15199y3M3460c;
                        viewState = viewState;
                        interfaceC28601c12 = interfaceC28601c8;
                        interfaceC28601c13 = interfaceC28601c10;
                        c28655q5.m87172p0(uVar18);
                        objM87133R14 = uVar18;
                    } else {
                        interfaceC28601c11 = interfaceC28601c4;
                        u uVar19 = new u(c15199y3M3460c, viewState, interfaceC28601c1, interfaceC28601c8, interfaceC28601c10, null);
                        c15199y3M3460c = c15199y3M3460c;
                        viewState = viewState;
                        interfaceC28601c12 = interfaceC28601c8;
                        interfaceC28601c13 = interfaceC28601c10;
                        c28655q5.m87172p0(uVar19);
                        objM87133R14 = uVar19;
                    }
                    AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R14, c15199y3M3460c);
                    AnyModal anyModalM107690c11 = viewState.getEnablePregnancyInsightsConfirmation();
                    zM87157i3 = c28655q5.m87157i(viewState);
                    objM87133R15 = c28655q5.m87133R();
                    if (zM87157i3) {
                        objM87133R15 = new v(viewState, interfaceC28601c5, null);
                        c28655q5.m87172p0(objM87133R15);
                    } else {
                        objM87133R15 = new v(viewState, interfaceC28601c5, null);
                        c28655q5.m87172p0(objM87133R15);
                    }
                    i26 = AnyModal.$stable;
                    AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R15, anyModalM107690c11);
                    if (m115743D1(interfaceC28601c9)) {
                        c28655q5.m87150e0(-2135741304);
                        c34064dM107694g = viewState.getHormonalInsightsDisablingConfirmDialog();
                        if (c34064dM107694g == null) {
                            c28655q5.m87150e0(-1783470983);
                            c28655q5.m87173q(false);
                            interfaceC28601c1 = interfaceC28601c1;
                            interfaceC28601c14 = interfaceC28601c5;
                            function16 = function13;
                            z13 = false;
                            c28655q2 = c28655q5;
                            function15 = function10;
                        } else {
                            c28655q5.m87150e0(-1783470982);
                            TextResource textResourceM107671d118 = c34064dM107694g.getTitleDisplay();
                            TextResource textResourceM107668a118 = c34064dM107694g.getDescriptionDisplay();
                            TextResource textResourceM107669b118 = c34064dM107694g.getPrimaryButtonTitle();
                            objM87133R24 = c28655q5.m87133R();
                            if (objM87133R24 == c28676v0) {
                                objM87133R24 = w.f155428w;
                                c28655q5.m87172p0(objM87133R24);
                            }
                            InterfaceC39332e interfaceC39332eM125323a118 = p745y81.Function1.m125323a((Function1) objM87133R24);
                            TextResource textResourceM107670c118 = c34064dM107694g.getSecondaryButtonTitle();
                            objM87133R25 = c28655q5.m87133R();
                            if (objM87133R25 == c28676v0) {
                                interfaceC28601c18 = interfaceC28601c9;
                                objM87133R25 = new C36269e(0, interfaceC28601c18);
                                c28655q5.m87172p0(objM87133R25);
                            } else {
                                interfaceC28601c18 = interfaceC28601c9;
                            }
                            InterfaceC4339a interfaceC4339a111119 = (InterfaceC4339a) objM87133R25;
                            if ((i25 & 112) == 32) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            objM87133R26 = c28655q5.m87133R();
                            if (z24) {
                                objM87133R26 = new C25504c(interfaceC28601c18, interfaceC28601c6, function10);
                                c28655q5.m87172p0(objM87133R26);
                            } else {
                                objM87133R26 = new C25504c(interfaceC28601c18, interfaceC28601c6, function10);
                                c28655q5.m87172p0(objM87133R26);
                            }
                            InterfaceC4339a interfaceC4339a1111110 = (InterfaceC4339a) objM87133R26;
                            int i311112 = TextResource.$stable;
                            int i311113 = (i311112 << 3) | (i311112 << 6) | (i311112 << 9) | (i311112 << 27);
                            interfaceC28601c9 = interfaceC28601c18;
                            interfaceC28601c14 = interfaceC28601c5;
                            function15 = function10;
                            function16 = function13;
                            AbstractC21211n.m59497o(null, textResourceM107671d118, textResourceM107668a118, textResourceM107669b118, false, interfaceC39332eM125323a118, null, null, null, textResourceM107670c118, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a111119, null, interfaceC4339a1111110, null, null, null, c28655q5, i311113, 0, 384, 247463377);
                            c28655q2 = c28655q5;
                            z13 = false;
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z13);
                    } else {
                        interfaceC28601c1 = interfaceC28601c1;
                        interfaceC28601c14 = interfaceC28601c5;
                        c28676v0 = c28676v0;
                        function15 = function10;
                        function16 = function13;
                        z13 = false;
                        c28655q2 = c28655q5;
                        c28655q2.m87150e0(-1782794252);
                        c28655q2.m87173q(false);
                    }
                    if (m115763K0(interfaceC28601c3)) {
                        c28655q2.m87150e0(-2135716155);
                        c34064dM107696i = c34070j.getHormonalInsightsModeConfirmDialog();
                        if (c34064dM107696i == null) {
                            c28655q2.m87150e0(-1782691364);
                            c28655q2.m87173q(z13);
                            i26 = i26;
                            c28655q3 = c28655q2;
                            interfaceC28601c15 = interfaceC28601c3;
                            function17 = function14;
                        } else {
                            c28655q2.m87150e0(-1782691363);
                            TextResource textResourceM107671d119 = c34064dM107696i.getTitleDisplay();
                            TextResource textResourceM107668a119 = c34064dM107696i.getDescriptionDisplay();
                            TextResource textResourceM107669b119 = c34064dM107696i.getPrimaryButtonTitle();
                            objM87133R21 = c28655q2.m87133R();
                            if (objM87133R21 == c28676v0) {
                                objM87133R21 = x.f155429w;
                                c28655q2.m87172p0(objM87133R21);
                            }
                            InterfaceC39332e interfaceC39332eM125323a119 = p745y81.Function1.m125323a((Function1) objM87133R21);
                            TextResource textResourceM107670c119 = c34064dM107696i.getSecondaryButtonTitle();
                            objM87133R22 = c28655q2.m87133R();
                            if (objM87133R22 == c28676v0) {
                                interfaceC28601c15 = interfaceC28601c3;
                                objM87133R22 = new C36269e(1, interfaceC28601c15);
                                c28655q2.m87172p0(objM87133R22);
                            } else {
                                interfaceC28601c15 = interfaceC28601c3;
                            }
                            InterfaceC4339a interfaceC4339a1111111 = (InterfaceC4339a) objM87133R22;
                            if ((i25 & 7168) == 2048) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if ((i25 & 896) == 256) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            z19 = z18 | z17;
                            objM87133R23 = c28655q2.m87133R();
                            if (z19) {
                                function17 = function14;
                                objM87133R23 = new C36238m(function17, function16, interfaceC28601c15, interfaceC28601c6);
                                c28655q2.m87172p0(objM87133R23);
                            } else {
                                function17 = function14;
                                objM87133R23 = new C36238m(function17, function16, interfaceC28601c15, interfaceC28601c6);
                                c28655q2.m87172p0(objM87133R23);
                            }
                            InterfaceC4339a interfaceC4339a1111112 = (InterfaceC4339a) objM87133R23;
                            int i311114 = TextResource.$stable;
                            C28655q c28655q15 = c28655q2;
                            AbstractC21211n.m59497o(null, textResourceM107671d119, textResourceM107668a119, textResourceM107669b119, false, interfaceC39332eM125323a119, null, null, null, textResourceM107670c119, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a1111111, null, interfaceC4339a1111112, null, null, null, c28655q15, (i311114 << 3) | (i311114 << 6) | (i311114 << 9) | (i311114 << 27), 0, 384, 247463377);
                            c28655q3 = c28655q15;
                            z13 = false;
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(z13);
                    } else {
                        i26 = i26;
                        c28655q3 = c28655q2;
                        interfaceC28601c15 = interfaceC28601c3;
                        c15199y3M3460c = c15199y3M3460c;
                        function17 = function14;
                        c28655q3.m87150e0(-1781986764);
                        c28655q3.m87173q(z13);
                    }
                    if (m115769M0(interfaceC28601c11)) {
                        c28655q3.m87150e0(-2135689437);
                        c34064dM107693f = c34070j.getHormonalInsightsContraceptionConfirmDialog();
                        if (c34064dM107693f == null) {
                            c28655q3.m87150e0(-1781863106);
                            c28655q3.m87173q(z13);
                            interfaceC28601c15 = interfaceC28601c15;
                            interfaceC28601c16 = interfaceC28601c11;
                        } else {
                            c28655q3.m87150e0(-1781863105);
                            TextResource textResourceM107671d1110 = c34064dM107693f.getTitleDisplay();
                            TextResource textResourceM107668a1110 = c34064dM107693f.getDescriptionDisplay();
                            TextResource textResourceM107669b1110 = c34064dM107693f.getPrimaryButtonTitle();
                            objM87133R18 = c28655q3.m87133R();
                            if (objM87133R18 == c28676v0) {
                                objM87133R18 = g.f155357w;
                                c28655q3.m87172p0(objM87133R18);
                            }
                            InterfaceC39332e interfaceC39332eM125323a1110 = p745y81.Function1.m125323a((Function1) objM87133R18);
                            TextResource textResourceM107670c1110 = c34064dM107693f.getSecondaryButtonTitle();
                            objM87133R19 = c28655q3.m87133R();
                            if (objM87133R19 == c28676v0) {
                                interfaceC28601c16 = interfaceC28601c11;
                                objM87133R19 = new C36269e(2, interfaceC28601c16);
                                c28655q3.m87172p0(objM87133R19);
                            } else {
                                interfaceC28601c16 = interfaceC28601c11;
                            }
                            InterfaceC4339a interfaceC4339a1111113 = (InterfaceC4339a) objM87133R19;
                            if ((i25 & 7168) == 2048) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            boolean z214 = z14;
                            if ((i25 & 112) == 32) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = z214 | z15;
                            objM87133R20 = c28655q3.m87133R();
                            if (z16) {
                                objM87133R20 = new C36238m(function17, interfaceC28601c16, interfaceC28601c7, function15);
                                c28655q3.m87172p0(objM87133R20);
                            } else {
                                objM87133R20 = new C36238m(function17, interfaceC28601c16, interfaceC28601c7, function15);
                                c28655q3.m87172p0(objM87133R20);
                            }
                            int i311115 = TextResource.$stable;
                            AbstractC21211n.m59497o(null, textResourceM107671d1110, textResourceM107668a1110, textResourceM107669b1110, false, interfaceC39332eM125323a1110, null, null, null, textResourceM107670c1110, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a1111113, null, (InterfaceC4339a) objM87133R20, null, null, null, c28655q3, (i311115 << 3) | (i311115 << 6) | (i311115 << 9) | (i311115 << 27), 0, 384, 247463377);
                            z13 = false;
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(z13);
                    } else {
                        interfaceC28601c15 = interfaceC28601c15;
                        interfaceC28601c16 = interfaceC28601c11;
                        c28655q3.m87150e0(-1781068172);
                        c28655q3.m87173q(z13);
                    }
                    if (m115775O0(interfaceC28601c14)) {
                        anyModalM107690c = c34070j.getEnablePregnancyInsightsConfirmation();
                    } else {
                        anyModalM107690c = null;
                    }
                    if ((i25 & 896) == 256) {
                        z13 = true;
                    }
                    objM87133R16 = c28655q3.m87133R();
                    if (z13) {
                        objM87133R16 = new C28827b(function16, interfaceC28601c14, 13);
                        c28655q3.m87172p0(objM87133R16);
                    } else {
                        objM87133R16 = new C28827b(function16, interfaceC28601c14, 13);
                        c28655q3.m87172p0(objM87133R16);
                    }
                    InterfaceC28601c1 interfaceC28601c2119 = interfaceC28601c16;
                    Function1 function1116 = function17;
                    c28676v1 = c28676v0;
                    Function1 function1117 = function16;
                    InterfaceC28601c1 interfaceC28601c21110 = interfaceC28601c9;
                    Function1 function29 = function15;
                    interfaceC28601c17 = interfaceC28601c1;
                    i27 = 2;
                    C15199y3 c15199y12 = c15199y3M3460c;
                    AbstractC0564o.m1394P(anyModalM107690c, (Function1) objM87133R16, null, null, null, null, c28655q3, i26, 60);
                    c28655q4 = c28655q3;
                    enumC36265aM115737B1 = m115737B1(interfaceC28601c17);
                    if (enumC36265aM115737B1 == null) {
                        i28 = -1;
                    } else {
                        i28 = n0.f155394a[enumC36265aM115737B1.ordinal()];
                    }
                    modifierM3599a = C2314t.f9131w;
                    if (i28 != -1) {
                        if (i28 != 1) {
                            modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "ModeBottomSheetTag");
                        } else if (i28 != 2) {
                            modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "ContraceptionBottomSheetTag");
                        } else if (i28 != 3) {
                            modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "PreviousPregnanciesBottomSheetTag");
                        } else if (i28 != 4) {
                            modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "FertilityInsightsDisableSurveyBottomSheetTag");
                        } else {
                            if (i28 == 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "GoalsBottomSheetTag");
                        }
                    }
                    Modifier modifier10 = modifierM3599a;
                    enumC36265aM115737B2 = m115737B1(interfaceC28601c17);
                    if (enumC36265aM115737B2 == null) {
                        i29 = -1;
                    } else {
                        i29 = n0.f155394a[enumC36265aM115737B2.ordinal()];
                    }
                    if (i29 != -1) {
                        c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                    } else if (i29 != 1) {
                        c35666g = new C35666g(c34070j.getHormonalInsightsModeBottomSheet().getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, i27, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                    } else if (i29 != 2) {
                        textResource = null;
                        objArr = 0;
                        c34063cM107692e = c34070j.getHormonalInsightsContraceptionBottomSheet();
                        if (c34063cM107692e != null) {
                            c35666g = new C35666g(c34063cM107692e.getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, i27, objArr == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                        } else {
                            c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                            c35666g = c35666g2;
                        }
                    } else if (i29 != 3) {
                        c34077qM107699l = c34070j.getPreviousPregnancies();
                        if (c34077qM107699l != null) {
                            c35666g = new C35666g(c34077qM107699l.getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, i27, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                        } else {
                            c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                            c35666g = c35666g2;
                        }
                    } else if (i29 != 4) {
                        c34063cM107688a = c34070j.getDisableFertilityInsightsSurveyDrawer();
                        if (c34063cM107688a != null) {
                            c35666g = new C35666g(c34063cM107688a.getTitleDisplay(), null, null, null, null, 0.0f, 0.0f, 126, null);
                        } else {
                            c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                            c35666g = c35666g2;
                        }
                    } else {
                        if (i29 == 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                    }
                    AbstractC35664f.a aVar10 = new AbstractC35664f.a(c15199y12);
                    objM87133R17 = c28655q4.m87133R();
                    if (objM87133R17 == c28676v1) {
                        objM87133R17 = new C36269e(4, interfaceC28601c17);
                        c28655q4.m87172p0(objM87133R17);
                    }
                    C37816b c37816bM121344e10 = AbstractC37817c.m121344e(409951292, c28655q4, new C29316o(c34070j, interfaceC28601c17, interfaceC28601c6, interfaceC28601c15, interfaceC28601c7, interfaceC28601c2119, function1117, function29, interfaceC28601c12, interfaceC28601c13));
                    InterfaceC4339a interfaceC4339a1111114 = interfaceC4339a4;
                    c28655q = c28655q4;
                    AbstractC35660d.m112871m(modifier10, c35666g, aVar10, null, (InterfaceC4339a) objM87133R17, null, null, c37816bM121344e10, false, null, null, null, false, null, AbstractC37817c.m121344e(1279555584, c28655q4, new C14076n(c34070j, function1117, function29, interfaceC4339a1111114, function1116, interfaceC28601c2118, interfaceC28601c118, interfaceC28601c21110, interfaceC28601c17)), c28655q, (C35666g.f151591h << 3) | 12607488 | (AbstractC35664f.a.f151587c << 6), 24576, 16232);
                    interfaceC4339a3 = interfaceC4339a1111114;
                    function8 = function1117;
                    function7 = function29;
                    function9 = function1116;
                } else {
                    c28655q = c28655q5;
                    c28655q.m87138X();
                    function7 = function4;
                    function8 = function5;
                    function9 = function6;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C35766g((Object) c34070j, function7, function8, function9, (InterfaceC23459e) interfaceC4339a3, i13, i14, 2);
                }
            }
            i34 |= 3072;
            function6 = function3;
            i19 = i14 & 16;
            if (i19 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q5.m87157i(interfaceC4339a2)) {
                        i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i24 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i34 |= i24;
                }
                if ((i34 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q5.m87135U(i34 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i35 != 0) {
                        objM87133R30 = c28655q5.m87133R();
                        if (objM87133R30 == c28676v0) {
                            objM87133R30 = new C36244s(15);
                            c28655q5.m87172p0(objM87133R30);
                        }
                        function10 = (Function1) objM87133R30;
                    } else {
                        function10 = function4;
                    }
                    if (i15 != 0) {
                        objM87133R29 = c28655q5.m87133R();
                        if (objM87133R29 == c28676v0) {
                            objM87133R29 = new C36244s(9);
                            c28655q5.m87172p0(objM87133R29);
                        }
                        function11 = (Function1) objM87133R29;
                    } else {
                        function11 = function5;
                    }
                    if (i17 != 0) {
                        objM87133R28 = c28655q5.m87133R();
                        if (objM87133R28 == c28676v0) {
                            objM87133R28 = new C36244s(10);
                            c28655q5.m87172p0(objM87133R28);
                        }
                        function12 = (Function1) objM87133R28;
                    } else {
                        function12 = function6;
                    }
                    if (i19 != 0) {
                        objM87133R27 = c28655q5.m87133R();
                        if (objM87133R27 == c28676v0) {
                            objM87133R27 = new C35916a(23);
                            c28655q5.m87172p0(objM87133R27);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R27;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    objM87133R = c28655q5.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q5);
                        c28655q5.m87172p0(objM87133R);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                    function13 = function11;
                    function14 = function12;
                    c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q5, 3078, 6);
                    if (viewState.getDisableFertilityInsightsSurveyDrawer() != null) {
                        enumC36265a = EnumC36265a.FERTILITY_INSIGHTS_DISABLE_SURVEY;
                    } else {
                        enumC36265a = null;
                    }
                    objM87133R2 = c28655q5.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(enumC36265a);
                        c28655q5.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q5.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q5.m87172p0(objM87133R3);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                    objM87133R4 = c28655q5.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q5.m87172p0(objM87133R4);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q5.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q5.m87172p0(objM87133R5);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R5;
                    objM87133R6 = c28655q5.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q5.m87172p0(objM87133R6);
                    }
                    interfaceC28601c5 = (InterfaceC28601c1) objM87133R6;
                    objM87133R7 = c28655q5.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsShowCycleOverlayOn()));
                        c28655q5.m87172p0(objM87133R7);
                    }
                    InterfaceC28601c1 interfaceC28601c119 = (InterfaceC28601c1) objM87133R7;
                    objM87133R8 = c28655q5.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsHormonalInsightsOn()));
                        c28655q5.m87172p0(objM87133R8);
                    }
                    InterfaceC28601c1 interfaceC28601c21111 = (InterfaceC28601c1) objM87133R8;
                    objM87133R9 = c28655q5.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = AbstractC28683x.m87272z(viewState.getSelectedMode());
                        c28655q5.m87172p0(objM87133R9);
                    }
                    interfaceC28601c6 = (InterfaceC28601c1) objM87133R9;
                    objM87133R10 = c28655q5.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = AbstractC28683x.m87272z(viewState.getSelectedContraceptionType());
                        c28655q5.m87172p0(objM87133R10);
                    }
                    interfaceC28601c7 = (InterfaceC28601c1) objM87133R10;
                    i25 = i34;
                    objM87133R11 = c28655q5.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = AbstractC28683x.m87272z(null);
                        c28655q5.m87172p0(objM87133R11);
                    }
                    interfaceC28601c8 = (InterfaceC28601c1) objM87133R11;
                    objM87133R12 = c28655q5.m87133R();
                    if (objM87133R12 == c28676v0) {
                        c34066fM107691d = viewState.getGoalsDrawer();
                        if (c34066fM107691d != null) {
                            interfaceC28601c9 = interfaceC28601c2;
                            objM74103I1 = C25235a0.f99113w;
                        } else {
                            interfaceC28601c9 = interfaceC28601c2;
                            objM74103I1 = C25235a0.f99113w;
                        }
                        objM87133R12 = AbstractC28683x.m87272z(objM74103I1);
                        c28655q5.m87172p0(objM87133R12);
                    } else {
                        interfaceC28601c9 = interfaceC28601c2;
                        interfaceC28601c3 = interfaceC28601c3;
                    }
                    interfaceC28601c10 = (InterfaceC28601c1) objM87133R12;
                    EnumC36265a enumC36265aM115737B13 = m115737B1(interfaceC28601c1);
                    zM87157i = c28655q5.m87157i(interfaceC2994c0) | c28655q5.m87157i(c15199y3M3460c);
                    objM87133R13 = c28655q5.m87133R();
                    if (zM87157i) {
                        objM87133R13 = new t(interfaceC2994c0, c15199y3M3460c, interfaceC28601c1, null);
                        c28655q5.m87172p0(objM87133R13);
                    } else {
                        objM87133R13 = new t(interfaceC2994c0, c15199y3M3460c, interfaceC28601c1, null);
                        c28655q5.m87172p0(objM87133R13);
                    }
                    AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R13, enumC36265aM115737B13);
                    zM87157i2 = c28655q5.m87157i(c15199y3M3460c) | c28655q5.m87157i(viewState);
                    objM87133R14 = c28655q5.m87133R();
                    if (zM87157i2) {
                        interfaceC28601c11 = interfaceC28601c4;
                        u uVar110 = new u(c15199y3M3460c, viewState, interfaceC28601c1, interfaceC28601c8, interfaceC28601c10, null);
                        c15199y3M3460c = c15199y3M3460c;
                        viewState = viewState;
                        interfaceC28601c12 = interfaceC28601c8;
                        interfaceC28601c13 = interfaceC28601c10;
                        c28655q5.m87172p0(uVar110);
                        objM87133R14 = uVar110;
                    } else {
                        interfaceC28601c11 = interfaceC28601c4;
                        u uVar111 = new u(c15199y3M3460c, viewState, interfaceC28601c1, interfaceC28601c8, interfaceC28601c10, null);
                        c15199y3M3460c = c15199y3M3460c;
                        viewState = viewState;
                        interfaceC28601c12 = interfaceC28601c8;
                        interfaceC28601c13 = interfaceC28601c10;
                        c28655q5.m87172p0(uVar111);
                        objM87133R14 = uVar111;
                    }
                    AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R14, c15199y3M3460c);
                    AnyModal anyModalM107690c12 = viewState.getEnablePregnancyInsightsConfirmation();
                    zM87157i3 = c28655q5.m87157i(viewState);
                    objM87133R15 = c28655q5.m87133R();
                    if (zM87157i3) {
                        objM87133R15 = new v(viewState, interfaceC28601c5, null);
                        c28655q5.m87172p0(objM87133R15);
                    } else {
                        objM87133R15 = new v(viewState, interfaceC28601c5, null);
                        c28655q5.m87172p0(objM87133R15);
                    }
                    i26 = AnyModal.$stable;
                    AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R15, anyModalM107690c12);
                    if (m115743D1(interfaceC28601c9)) {
                        c28655q5.m87150e0(-2135741304);
                        c34064dM107694g = viewState.getHormonalInsightsDisablingConfirmDialog();
                        if (c34064dM107694g == null) {
                            c28655q5.m87150e0(-1783470983);
                            c28655q5.m87173q(false);
                            interfaceC28601c1 = interfaceC28601c1;
                            interfaceC28601c14 = interfaceC28601c5;
                            function16 = function13;
                            z13 = false;
                            c28655q2 = c28655q5;
                            function15 = function10;
                        } else {
                            c28655q5.m87150e0(-1783470982);
                            TextResource textResourceM107671d1111 = c34064dM107694g.getTitleDisplay();
                            TextResource textResourceM107668a1111 = c34064dM107694g.getDescriptionDisplay();
                            TextResource textResourceM107669b1111 = c34064dM107694g.getPrimaryButtonTitle();
                            objM87133R24 = c28655q5.m87133R();
                            if (objM87133R24 == c28676v0) {
                                objM87133R24 = w.f155428w;
                                c28655q5.m87172p0(objM87133R24);
                            }
                            InterfaceC39332e interfaceC39332eM125323a1111 = p745y81.Function1.m125323a((Function1) objM87133R24);
                            TextResource textResourceM107670c1111 = c34064dM107694g.getSecondaryButtonTitle();
                            objM87133R25 = c28655q5.m87133R();
                            if (objM87133R25 == c28676v0) {
                                interfaceC28601c18 = interfaceC28601c9;
                                objM87133R25 = new C36269e(0, interfaceC28601c18);
                                c28655q5.m87172p0(objM87133R25);
                            } else {
                                interfaceC28601c18 = interfaceC28601c9;
                            }
                            InterfaceC4339a interfaceC4339a1111115 = (InterfaceC4339a) objM87133R25;
                            if ((i25 & 112) == 32) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            objM87133R26 = c28655q5.m87133R();
                            if (z24) {
                                objM87133R26 = new C25504c(interfaceC28601c18, interfaceC28601c6, function10);
                                c28655q5.m87172p0(objM87133R26);
                            } else {
                                objM87133R26 = new C25504c(interfaceC28601c18, interfaceC28601c6, function10);
                                c28655q5.m87172p0(objM87133R26);
                            }
                            InterfaceC4339a interfaceC4339a1111116 = (InterfaceC4339a) objM87133R26;
                            int i311116 = TextResource.$stable;
                            int i311117 = (i311116 << 3) | (i311116 << 6) | (i311116 << 9) | (i311116 << 27);
                            interfaceC28601c9 = interfaceC28601c18;
                            interfaceC28601c14 = interfaceC28601c5;
                            function15 = function10;
                            function16 = function13;
                            AbstractC21211n.m59497o(null, textResourceM107671d1111, textResourceM107668a1111, textResourceM107669b1111, false, interfaceC39332eM125323a1111, null, null, null, textResourceM107670c1111, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a1111115, null, interfaceC4339a1111116, null, null, null, c28655q5, i311117, 0, 384, 247463377);
                            c28655q2 = c28655q5;
                            z13 = false;
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z13);
                    } else {
                        interfaceC28601c1 = interfaceC28601c1;
                        interfaceC28601c14 = interfaceC28601c5;
                        c28676v0 = c28676v0;
                        function15 = function10;
                        function16 = function13;
                        z13 = false;
                        c28655q2 = c28655q5;
                        c28655q2.m87150e0(-1782794252);
                        c28655q2.m87173q(false);
                    }
                    if (m115763K0(interfaceC28601c3)) {
                        c28655q2.m87150e0(-2135716155);
                        c34064dM107696i = c34070j.getHormonalInsightsModeConfirmDialog();
                        if (c34064dM107696i == null) {
                            c28655q2.m87150e0(-1782691364);
                            c28655q2.m87173q(z13);
                            i26 = i26;
                            c28655q3 = c28655q2;
                            interfaceC28601c15 = interfaceC28601c3;
                            function17 = function14;
                        } else {
                            c28655q2.m87150e0(-1782691363);
                            TextResource textResourceM107671d1112 = c34064dM107696i.getTitleDisplay();
                            TextResource textResourceM107668a1112 = c34064dM107696i.getDescriptionDisplay();
                            TextResource textResourceM107669b1112 = c34064dM107696i.getPrimaryButtonTitle();
                            objM87133R21 = c28655q2.m87133R();
                            if (objM87133R21 == c28676v0) {
                                objM87133R21 = x.f155429w;
                                c28655q2.m87172p0(objM87133R21);
                            }
                            InterfaceC39332e interfaceC39332eM125323a1112 = p745y81.Function1.m125323a((Function1) objM87133R21);
                            TextResource textResourceM107670c1112 = c34064dM107696i.getSecondaryButtonTitle();
                            objM87133R22 = c28655q2.m87133R();
                            if (objM87133R22 == c28676v0) {
                                interfaceC28601c15 = interfaceC28601c3;
                                objM87133R22 = new C36269e(1, interfaceC28601c15);
                                c28655q2.m87172p0(objM87133R22);
                            } else {
                                interfaceC28601c15 = interfaceC28601c3;
                            }
                            InterfaceC4339a interfaceC4339a1111117 = (InterfaceC4339a) objM87133R22;
                            if ((i25 & 7168) == 2048) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if ((i25 & 896) == 256) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            z19 = z18 | z17;
                            objM87133R23 = c28655q2.m87133R();
                            if (z19) {
                                function17 = function14;
                                objM87133R23 = new C36238m(function17, function16, interfaceC28601c15, interfaceC28601c6);
                                c28655q2.m87172p0(objM87133R23);
                            } else {
                                function17 = function14;
                                objM87133R23 = new C36238m(function17, function16, interfaceC28601c15, interfaceC28601c6);
                                c28655q2.m87172p0(objM87133R23);
                            }
                            InterfaceC4339a interfaceC4339a1111118 = (InterfaceC4339a) objM87133R23;
                            int i311118 = TextResource.$stable;
                            C28655q c28655q16 = c28655q2;
                            AbstractC21211n.m59497o(null, textResourceM107671d1112, textResourceM107668a1112, textResourceM107669b1112, false, interfaceC39332eM125323a1112, null, null, null, textResourceM107670c1112, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a1111117, null, interfaceC4339a1111118, null, null, null, c28655q16, (i311118 << 3) | (i311118 << 6) | (i311118 << 9) | (i311118 << 27), 0, 384, 247463377);
                            c28655q3 = c28655q16;
                            z13 = false;
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(z13);
                    } else {
                        i26 = i26;
                        c28655q3 = c28655q2;
                        interfaceC28601c15 = interfaceC28601c3;
                        c15199y3M3460c = c15199y3M3460c;
                        function17 = function14;
                        c28655q3.m87150e0(-1781986764);
                        c28655q3.m87173q(z13);
                    }
                    if (m115769M0(interfaceC28601c11)) {
                        c28655q3.m87150e0(-2135689437);
                        c34064dM107693f = c34070j.getHormonalInsightsContraceptionConfirmDialog();
                        if (c34064dM107693f == null) {
                            c28655q3.m87150e0(-1781863106);
                            c28655q3.m87173q(z13);
                            interfaceC28601c15 = interfaceC28601c15;
                            interfaceC28601c16 = interfaceC28601c11;
                        } else {
                            c28655q3.m87150e0(-1781863105);
                            TextResource textResourceM107671d1113 = c34064dM107693f.getTitleDisplay();
                            TextResource textResourceM107668a1113 = c34064dM107693f.getDescriptionDisplay();
                            TextResource textResourceM107669b1113 = c34064dM107693f.getPrimaryButtonTitle();
                            objM87133R18 = c28655q3.m87133R();
                            if (objM87133R18 == c28676v0) {
                                objM87133R18 = g.f155357w;
                                c28655q3.m87172p0(objM87133R18);
                            }
                            InterfaceC39332e interfaceC39332eM125323a1113 = p745y81.Function1.m125323a((Function1) objM87133R18);
                            TextResource textResourceM107670c1113 = c34064dM107693f.getSecondaryButtonTitle();
                            objM87133R19 = c28655q3.m87133R();
                            if (objM87133R19 == c28676v0) {
                                interfaceC28601c16 = interfaceC28601c11;
                                objM87133R19 = new C36269e(2, interfaceC28601c16);
                                c28655q3.m87172p0(objM87133R19);
                            } else {
                                interfaceC28601c16 = interfaceC28601c11;
                            }
                            InterfaceC4339a interfaceC4339a1111119 = (InterfaceC4339a) objM87133R19;
                            if ((i25 & 7168) == 2048) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            boolean z215 = z14;
                            if ((i25 & 112) == 32) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = z215 | z15;
                            objM87133R20 = c28655q3.m87133R();
                            if (z16) {
                                objM87133R20 = new C36238m(function17, interfaceC28601c16, interfaceC28601c7, function15);
                                c28655q3.m87172p0(objM87133R20);
                            } else {
                                objM87133R20 = new C36238m(function17, interfaceC28601c16, interfaceC28601c7, function15);
                                c28655q3.m87172p0(objM87133R20);
                            }
                            int i311119 = TextResource.$stable;
                            AbstractC21211n.m59497o(null, textResourceM107671d1113, textResourceM107668a1113, textResourceM107669b1113, false, interfaceC39332eM125323a1113, null, null, null, textResourceM107670c1113, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a1111119, null, (InterfaceC4339a) objM87133R20, null, null, null, c28655q3, (i311119 << 3) | (i311119 << 6) | (i311119 << 9) | (i311119 << 27), 0, 384, 247463377);
                            z13 = false;
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(z13);
                    } else {
                        interfaceC28601c15 = interfaceC28601c15;
                        interfaceC28601c16 = interfaceC28601c11;
                        c28655q3.m87150e0(-1781068172);
                        c28655q3.m87173q(z13);
                    }
                    if (m115775O0(interfaceC28601c14)) {
                        anyModalM107690c = c34070j.getEnablePregnancyInsightsConfirmation();
                    } else {
                        anyModalM107690c = null;
                    }
                    if ((i25 & 896) == 256) {
                        z13 = true;
                    }
                    objM87133R16 = c28655q3.m87133R();
                    if (z13) {
                        objM87133R16 = new C28827b(function16, interfaceC28601c14, 13);
                        c28655q3.m87172p0(objM87133R16);
                    } else {
                        objM87133R16 = new C28827b(function16, interfaceC28601c14, 13);
                        c28655q3.m87172p0(objM87133R16);
                    }
                    InterfaceC28601c1 interfaceC28601c21112 = interfaceC28601c16;
                    Function1 function1118 = function17;
                    c28676v1 = c28676v0;
                    Function1 function1119 = function16;
                    InterfaceC28601c1 interfaceC28601c21113 = interfaceC28601c9;
                    Function1 function210 = function15;
                    interfaceC28601c17 = interfaceC28601c1;
                    i27 = 2;
                    C15199y3 c15199y13 = c15199y3M3460c;
                    AbstractC0564o.m1394P(anyModalM107690c, (Function1) objM87133R16, null, null, null, null, c28655q3, i26, 60);
                    c28655q4 = c28655q3;
                    enumC36265aM115737B1 = m115737B1(interfaceC28601c17);
                    if (enumC36265aM115737B1 == null) {
                        i28 = -1;
                    } else {
                        i28 = n0.f155394a[enumC36265aM115737B1.ordinal()];
                    }
                    modifierM3599a = C2314t.f9131w;
                    if (i28 != -1) {
                        if (i28 != 1) {
                            modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "ModeBottomSheetTag");
                        } else if (i28 != 2) {
                            modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "ContraceptionBottomSheetTag");
                        } else if (i28 != 3) {
                            modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "PreviousPregnanciesBottomSheetTag");
                        } else if (i28 != 4) {
                            modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "FertilityInsightsDisableSurveyBottomSheetTag");
                        } else {
                            if (i28 == 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "GoalsBottomSheetTag");
                        }
                    }
                    Modifier modifier11 = modifierM3599a;
                    enumC36265aM115737B2 = m115737B1(interfaceC28601c17);
                    if (enumC36265aM115737B2 == null) {
                        i29 = -1;
                    } else {
                        i29 = n0.f155394a[enumC36265aM115737B2.ordinal()];
                    }
                    if (i29 != -1) {
                        c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                    } else if (i29 != 1) {
                        c35666g = new C35666g(c34070j.getHormonalInsightsModeBottomSheet().getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, i27, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                    } else if (i29 != 2) {
                        textResource = null;
                        objArr = 0;
                        c34063cM107692e = c34070j.getHormonalInsightsContraceptionBottomSheet();
                        if (c34063cM107692e != null) {
                            c35666g = new C35666g(c34063cM107692e.getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, i27, objArr == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                        } else {
                            c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                            c35666g = c35666g2;
                        }
                    } else if (i29 != 3) {
                        c34077qM107699l = c34070j.getPreviousPregnancies();
                        if (c34077qM107699l != null) {
                            c35666g = new C35666g(c34077qM107699l.getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, i27, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                        } else {
                            c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                            c35666g = c35666g2;
                        }
                    } else if (i29 != 4) {
                        c34063cM107688a = c34070j.getDisableFertilityInsightsSurveyDrawer();
                        if (c34063cM107688a != null) {
                            c35666g = new C35666g(c34063cM107688a.getTitleDisplay(), null, null, null, null, 0.0f, 0.0f, 126, null);
                        } else {
                            c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                            c35666g = c35666g2;
                        }
                    } else {
                        if (i29 == 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                    }
                    AbstractC35664f.a aVar11 = new AbstractC35664f.a(c15199y13);
                    objM87133R17 = c28655q4.m87133R();
                    if (objM87133R17 == c28676v1) {
                        objM87133R17 = new C36269e(4, interfaceC28601c17);
                        c28655q4.m87172p0(objM87133R17);
                    }
                    C37816b c37816bM121344e11 = AbstractC37817c.m121344e(409951292, c28655q4, new C29316o(c34070j, interfaceC28601c17, interfaceC28601c6, interfaceC28601c15, interfaceC28601c7, interfaceC28601c21112, function1119, function210, interfaceC28601c12, interfaceC28601c13));
                    InterfaceC4339a interfaceC4339a11111110 = interfaceC4339a4;
                    c28655q = c28655q4;
                    AbstractC35660d.m112871m(modifier11, c35666g, aVar11, null, (InterfaceC4339a) objM87133R17, null, null, c37816bM121344e11, false, null, null, null, false, null, AbstractC37817c.m121344e(1279555584, c28655q4, new C14076n(c34070j, function1119, function210, interfaceC4339a11111110, function1118, interfaceC28601c21111, interfaceC28601c119, interfaceC28601c21113, interfaceC28601c17)), c28655q, (C35666g.f151591h << 3) | 12607488 | (AbstractC35664f.a.f151587c << 6), 24576, 16232);
                    interfaceC4339a3 = interfaceC4339a11111110;
                    function8 = function1119;
                    function7 = function210;
                    function9 = function1118;
                } else {
                    c28655q = c28655q5;
                    c28655q.m87138X();
                    function7 = function4;
                    function8 = function5;
                    function9 = function6;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C35766g((Object) c34070j, function7, function8, function9, (InterfaceC23459e) interfaceC4339a3, i13, i14, 2);
                }
            }
            i34 |= 24576;
            interfaceC4339a2 = interfaceC4339a;
            if ((i34 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q5.m87135U(i34 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i35 != 0) {
                    objM87133R30 = c28655q5.m87133R();
                    if (objM87133R30 == c28676v0) {
                        objM87133R30 = new C36244s(15);
                        c28655q5.m87172p0(objM87133R30);
                    }
                    function10 = (Function1) objM87133R30;
                } else {
                    function10 = function4;
                }
                if (i15 != 0) {
                    objM87133R29 = c28655q5.m87133R();
                    if (objM87133R29 == c28676v0) {
                        objM87133R29 = new C36244s(9);
                        c28655q5.m87172p0(objM87133R29);
                    }
                    function11 = (Function1) objM87133R29;
                } else {
                    function11 = function5;
                }
                if (i17 != 0) {
                    objM87133R28 = c28655q5.m87133R();
                    if (objM87133R28 == c28676v0) {
                        objM87133R28 = new C36244s(10);
                        c28655q5.m87172p0(objM87133R28);
                    }
                    function12 = (Function1) objM87133R28;
                } else {
                    function12 = function6;
                }
                if (i19 != 0) {
                    objM87133R27 = c28655q5.m87133R();
                    if (objM87133R27 == c28676v0) {
                        objM87133R27 = new C35916a(23);
                        c28655q5.m87172p0(objM87133R27);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R27;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                objM87133R = c28655q5.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q5);
                    c28655q5.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                function13 = function11;
                function14 = function12;
                c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q5, 3078, 6);
                if (viewState.getDisableFertilityInsightsSurveyDrawer() != null) {
                    enumC36265a = EnumC36265a.FERTILITY_INSIGHTS_DISABLE_SURVEY;
                } else {
                    enumC36265a = null;
                }
                objM87133R2 = c28655q5.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(enumC36265a);
                    c28655q5.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q5.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q5.m87172p0(objM87133R3);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                objM87133R4 = c28655q5.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q5.m87172p0(objM87133R4);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
                objM87133R5 = c28655q5.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q5.m87172p0(objM87133R5);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R5;
                objM87133R6 = c28655q5.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q5.m87172p0(objM87133R6);
                }
                interfaceC28601c5 = (InterfaceC28601c1) objM87133R6;
                objM87133R7 = c28655q5.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsShowCycleOverlayOn()));
                    c28655q5.m87172p0(objM87133R7);
                }
                InterfaceC28601c1 interfaceC28601c1110 = (InterfaceC28601c1) objM87133R7;
                objM87133R8 = c28655q5.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsHormonalInsightsOn()));
                    c28655q5.m87172p0(objM87133R8);
                }
                InterfaceC28601c1 interfaceC28601c21114 = (InterfaceC28601c1) objM87133R8;
                objM87133R9 = c28655q5.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = AbstractC28683x.m87272z(viewState.getSelectedMode());
                    c28655q5.m87172p0(objM87133R9);
                }
                interfaceC28601c6 = (InterfaceC28601c1) objM87133R9;
                objM87133R10 = c28655q5.m87133R();
                if (objM87133R10 == c28676v0) {
                    objM87133R10 = AbstractC28683x.m87272z(viewState.getSelectedContraceptionType());
                    c28655q5.m87172p0(objM87133R10);
                }
                interfaceC28601c7 = (InterfaceC28601c1) objM87133R10;
                i25 = i34;
                objM87133R11 = c28655q5.m87133R();
                if (objM87133R11 == c28676v0) {
                    objM87133R11 = AbstractC28683x.m87272z(null);
                    c28655q5.m87172p0(objM87133R11);
                }
                interfaceC28601c8 = (InterfaceC28601c1) objM87133R11;
                objM87133R12 = c28655q5.m87133R();
                if (objM87133R12 == c28676v0) {
                    c34066fM107691d = viewState.getGoalsDrawer();
                    if (c34066fM107691d != null) {
                        interfaceC28601c9 = interfaceC28601c2;
                        objM74103I1 = C25235a0.f99113w;
                    } else {
                        interfaceC28601c9 = interfaceC28601c2;
                        objM74103I1 = C25235a0.f99113w;
                    }
                    objM87133R12 = AbstractC28683x.m87272z(objM74103I1);
                    c28655q5.m87172p0(objM87133R12);
                } else {
                    interfaceC28601c9 = interfaceC28601c2;
                    interfaceC28601c3 = interfaceC28601c3;
                }
                interfaceC28601c10 = (InterfaceC28601c1) objM87133R12;
                EnumC36265a enumC36265aM115737B14 = m115737B1(interfaceC28601c1);
                zM87157i = c28655q5.m87157i(interfaceC2994c0) | c28655q5.m87157i(c15199y3M3460c);
                objM87133R13 = c28655q5.m87133R();
                if (zM87157i) {
                    objM87133R13 = new t(interfaceC2994c0, c15199y3M3460c, interfaceC28601c1, null);
                    c28655q5.m87172p0(objM87133R13);
                } else {
                    objM87133R13 = new t(interfaceC2994c0, c15199y3M3460c, interfaceC28601c1, null);
                    c28655q5.m87172p0(objM87133R13);
                }
                AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R13, enumC36265aM115737B14);
                zM87157i2 = c28655q5.m87157i(c15199y3M3460c) | c28655q5.m87157i(viewState);
                objM87133R14 = c28655q5.m87133R();
                if (zM87157i2) {
                    interfaceC28601c11 = interfaceC28601c4;
                    u uVar112 = new u(c15199y3M3460c, viewState, interfaceC28601c1, interfaceC28601c8, interfaceC28601c10, null);
                    c15199y3M3460c = c15199y3M3460c;
                    viewState = viewState;
                    interfaceC28601c12 = interfaceC28601c8;
                    interfaceC28601c13 = interfaceC28601c10;
                    c28655q5.m87172p0(uVar112);
                    objM87133R14 = uVar112;
                } else {
                    interfaceC28601c11 = interfaceC28601c4;
                    u uVar113 = new u(c15199y3M3460c, viewState, interfaceC28601c1, interfaceC28601c8, interfaceC28601c10, null);
                    c15199y3M3460c = c15199y3M3460c;
                    viewState = viewState;
                    interfaceC28601c12 = interfaceC28601c8;
                    interfaceC28601c13 = interfaceC28601c10;
                    c28655q5.m87172p0(uVar113);
                    objM87133R14 = uVar113;
                }
                AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R14, c15199y3M3460c);
                AnyModal anyModalM107690c13 = viewState.getEnablePregnancyInsightsConfirmation();
                zM87157i3 = c28655q5.m87157i(viewState);
                objM87133R15 = c28655q5.m87133R();
                if (zM87157i3) {
                    objM87133R15 = new v(viewState, interfaceC28601c5, null);
                    c28655q5.m87172p0(objM87133R15);
                } else {
                    objM87133R15 = new v(viewState, interfaceC28601c5, null);
                    c28655q5.m87172p0(objM87133R15);
                }
                i26 = AnyModal.$stable;
                AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R15, anyModalM107690c13);
                if (m115743D1(interfaceC28601c9)) {
                    c28655q5.m87150e0(-2135741304);
                    c34064dM107694g = viewState.getHormonalInsightsDisablingConfirmDialog();
                    if (c34064dM107694g == null) {
                        c28655q5.m87150e0(-1783470983);
                        c28655q5.m87173q(false);
                        interfaceC28601c1 = interfaceC28601c1;
                        interfaceC28601c14 = interfaceC28601c5;
                        function16 = function13;
                        z13 = false;
                        c28655q2 = c28655q5;
                        function15 = function10;
                    } else {
                        c28655q5.m87150e0(-1783470982);
                        TextResource textResourceM107671d1114 = c34064dM107694g.getTitleDisplay();
                        TextResource textResourceM107668a1114 = c34064dM107694g.getDescriptionDisplay();
                        TextResource textResourceM107669b1114 = c34064dM107694g.getPrimaryButtonTitle();
                        objM87133R24 = c28655q5.m87133R();
                        if (objM87133R24 == c28676v0) {
                            objM87133R24 = w.f155428w;
                            c28655q5.m87172p0(objM87133R24);
                        }
                        InterfaceC39332e interfaceC39332eM125323a1114 = p745y81.Function1.m125323a((Function1) objM87133R24);
                        TextResource textResourceM107670c1114 = c34064dM107694g.getSecondaryButtonTitle();
                        objM87133R25 = c28655q5.m87133R();
                        if (objM87133R25 == c28676v0) {
                            interfaceC28601c18 = interfaceC28601c9;
                            objM87133R25 = new C36269e(0, interfaceC28601c18);
                            c28655q5.m87172p0(objM87133R25);
                        } else {
                            interfaceC28601c18 = interfaceC28601c9;
                        }
                        InterfaceC4339a interfaceC4339a11111111 = (InterfaceC4339a) objM87133R25;
                        if ((i25 & 112) == 32) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        objM87133R26 = c28655q5.m87133R();
                        if (z24) {
                            objM87133R26 = new C25504c(interfaceC28601c18, interfaceC28601c6, function10);
                            c28655q5.m87172p0(objM87133R26);
                        } else {
                            objM87133R26 = new C25504c(interfaceC28601c18, interfaceC28601c6, function10);
                            c28655q5.m87172p0(objM87133R26);
                        }
                        InterfaceC4339a interfaceC4339a11111112 = (InterfaceC4339a) objM87133R26;
                        int i3111110 = TextResource.$stable;
                        int i3111111 = (i3111110 << 3) | (i3111110 << 6) | (i3111110 << 9) | (i3111110 << 27);
                        interfaceC28601c9 = interfaceC28601c18;
                        interfaceC28601c14 = interfaceC28601c5;
                        function15 = function10;
                        function16 = function13;
                        AbstractC21211n.m59497o(null, textResourceM107671d1114, textResourceM107668a1114, textResourceM107669b1114, false, interfaceC39332eM125323a1114, null, null, null, textResourceM107670c1114, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a11111111, null, interfaceC4339a11111112, null, null, null, c28655q5, i3111111, 0, 384, 247463377);
                        c28655q2 = c28655q5;
                        z13 = false;
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z13);
                } else {
                    interfaceC28601c1 = interfaceC28601c1;
                    interfaceC28601c14 = interfaceC28601c5;
                    c28676v0 = c28676v0;
                    function15 = function10;
                    function16 = function13;
                    z13 = false;
                    c28655q2 = c28655q5;
                    c28655q2.m87150e0(-1782794252);
                    c28655q2.m87173q(false);
                }
                if (m115763K0(interfaceC28601c3)) {
                    c28655q2.m87150e0(-2135716155);
                    c34064dM107696i = c34070j.getHormonalInsightsModeConfirmDialog();
                    if (c34064dM107696i == null) {
                        c28655q2.m87150e0(-1782691364);
                        c28655q2.m87173q(z13);
                        i26 = i26;
                        c28655q3 = c28655q2;
                        interfaceC28601c15 = interfaceC28601c3;
                        function17 = function14;
                    } else {
                        c28655q2.m87150e0(-1782691363);
                        TextResource textResourceM107671d1115 = c34064dM107696i.getTitleDisplay();
                        TextResource textResourceM107668a1115 = c34064dM107696i.getDescriptionDisplay();
                        TextResource textResourceM107669b1115 = c34064dM107696i.getPrimaryButtonTitle();
                        objM87133R21 = c28655q2.m87133R();
                        if (objM87133R21 == c28676v0) {
                            objM87133R21 = x.f155429w;
                            c28655q2.m87172p0(objM87133R21);
                        }
                        InterfaceC39332e interfaceC39332eM125323a1115 = p745y81.Function1.m125323a((Function1) objM87133R21);
                        TextResource textResourceM107670c1115 = c34064dM107696i.getSecondaryButtonTitle();
                        objM87133R22 = c28655q2.m87133R();
                        if (objM87133R22 == c28676v0) {
                            interfaceC28601c15 = interfaceC28601c3;
                            objM87133R22 = new C36269e(1, interfaceC28601c15);
                            c28655q2.m87172p0(objM87133R22);
                        } else {
                            interfaceC28601c15 = interfaceC28601c3;
                        }
                        InterfaceC4339a interfaceC4339a11111113 = (InterfaceC4339a) objM87133R22;
                        if ((i25 & 7168) == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if ((i25 & 896) == 256) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = z18 | z17;
                        objM87133R23 = c28655q2.m87133R();
                        if (z19) {
                            function17 = function14;
                            objM87133R23 = new C36238m(function17, function16, interfaceC28601c15, interfaceC28601c6);
                            c28655q2.m87172p0(objM87133R23);
                        } else {
                            function17 = function14;
                            objM87133R23 = new C36238m(function17, function16, interfaceC28601c15, interfaceC28601c6);
                            c28655q2.m87172p0(objM87133R23);
                        }
                        InterfaceC4339a interfaceC4339a11111114 = (InterfaceC4339a) objM87133R23;
                        int i3111112 = TextResource.$stable;
                        C28655q c28655q17 = c28655q2;
                        AbstractC21211n.m59497o(null, textResourceM107671d1115, textResourceM107668a1115, textResourceM107669b1115, false, interfaceC39332eM125323a1115, null, null, null, textResourceM107670c1115, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a11111113, null, interfaceC4339a11111114, null, null, null, c28655q17, (i3111112 << 3) | (i3111112 << 6) | (i3111112 << 9) | (i3111112 << 27), 0, 384, 247463377);
                        c28655q3 = c28655q17;
                        z13 = false;
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(z13);
                } else {
                    i26 = i26;
                    c28655q3 = c28655q2;
                    interfaceC28601c15 = interfaceC28601c3;
                    c15199y3M3460c = c15199y3M3460c;
                    function17 = function14;
                    c28655q3.m87150e0(-1781986764);
                    c28655q3.m87173q(z13);
                }
                if (m115769M0(interfaceC28601c11)) {
                    c28655q3.m87150e0(-2135689437);
                    c34064dM107693f = c34070j.getHormonalInsightsContraceptionConfirmDialog();
                    if (c34064dM107693f == null) {
                        c28655q3.m87150e0(-1781863106);
                        c28655q3.m87173q(z13);
                        interfaceC28601c15 = interfaceC28601c15;
                        interfaceC28601c16 = interfaceC28601c11;
                    } else {
                        c28655q3.m87150e0(-1781863105);
                        TextResource textResourceM107671d1116 = c34064dM107693f.getTitleDisplay();
                        TextResource textResourceM107668a1116 = c34064dM107693f.getDescriptionDisplay();
                        TextResource textResourceM107669b1116 = c34064dM107693f.getPrimaryButtonTitle();
                        objM87133R18 = c28655q3.m87133R();
                        if (objM87133R18 == c28676v0) {
                            objM87133R18 = g.f155357w;
                            c28655q3.m87172p0(objM87133R18);
                        }
                        InterfaceC39332e interfaceC39332eM125323a1116 = p745y81.Function1.m125323a((Function1) objM87133R18);
                        TextResource textResourceM107670c1116 = c34064dM107693f.getSecondaryButtonTitle();
                        objM87133R19 = c28655q3.m87133R();
                        if (objM87133R19 == c28676v0) {
                            interfaceC28601c16 = interfaceC28601c11;
                            objM87133R19 = new C36269e(2, interfaceC28601c16);
                            c28655q3.m87172p0(objM87133R19);
                        } else {
                            interfaceC28601c16 = interfaceC28601c11;
                        }
                        InterfaceC4339a interfaceC4339a11111115 = (InterfaceC4339a) objM87133R19;
                        if ((i25 & 7168) == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean z216 = z14;
                        if ((i25 & 112) == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z216 | z15;
                        objM87133R20 = c28655q3.m87133R();
                        if (z16) {
                            objM87133R20 = new C36238m(function17, interfaceC28601c16, interfaceC28601c7, function15);
                            c28655q3.m87172p0(objM87133R20);
                        } else {
                            objM87133R20 = new C36238m(function17, interfaceC28601c16, interfaceC28601c7, function15);
                            c28655q3.m87172p0(objM87133R20);
                        }
                        int i3111113 = TextResource.$stable;
                        AbstractC21211n.m59497o(null, textResourceM107671d1116, textResourceM107668a1116, textResourceM107669b1116, false, interfaceC39332eM125323a1116, null, null, null, textResourceM107670c1116, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a11111115, null, (InterfaceC4339a) objM87133R20, null, null, null, c28655q3, (i3111113 << 3) | (i3111113 << 6) | (i3111113 << 9) | (i3111113 << 27), 0, 384, 247463377);
                        z13 = false;
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(z13);
                } else {
                    interfaceC28601c15 = interfaceC28601c15;
                    interfaceC28601c16 = interfaceC28601c11;
                    c28655q3.m87150e0(-1781068172);
                    c28655q3.m87173q(z13);
                }
                if (m115775O0(interfaceC28601c14)) {
                    anyModalM107690c = c34070j.getEnablePregnancyInsightsConfirmation();
                } else {
                    anyModalM107690c = null;
                }
                if ((i25 & 896) == 256) {
                    z13 = true;
                }
                objM87133R16 = c28655q3.m87133R();
                if (z13) {
                    objM87133R16 = new C28827b(function16, interfaceC28601c14, 13);
                    c28655q3.m87172p0(objM87133R16);
                } else {
                    objM87133R16 = new C28827b(function16, interfaceC28601c14, 13);
                    c28655q3.m87172p0(objM87133R16);
                }
                InterfaceC28601c1 interfaceC28601c21115 = interfaceC28601c16;
                Function1 function11110 = function17;
                c28676v1 = c28676v0;
                Function1 function11111 = function16;
                InterfaceC28601c1 interfaceC28601c21116 = interfaceC28601c9;
                Function1 function211 = function15;
                interfaceC28601c17 = interfaceC28601c1;
                i27 = 2;
                C15199y3 c15199y14 = c15199y3M3460c;
                AbstractC0564o.m1394P(anyModalM107690c, (Function1) objM87133R16, null, null, null, null, c28655q3, i26, 60);
                c28655q4 = c28655q3;
                enumC36265aM115737B1 = m115737B1(interfaceC28601c17);
                if (enumC36265aM115737B1 == null) {
                    i28 = -1;
                } else {
                    i28 = n0.f155394a[enumC36265aM115737B1.ordinal()];
                }
                modifierM3599a = C2314t.f9131w;
                if (i28 != -1) {
                    if (i28 != 1) {
                        modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "ModeBottomSheetTag");
                    } else if (i28 != 2) {
                        modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "ContraceptionBottomSheetTag");
                    } else if (i28 != 3) {
                        modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "PreviousPregnanciesBottomSheetTag");
                    } else if (i28 != 4) {
                        modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "FertilityInsightsDisableSurveyBottomSheetTag");
                    } else {
                        if (i28 == 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "GoalsBottomSheetTag");
                    }
                }
                Modifier modifier12 = modifierM3599a;
                enumC36265aM115737B2 = m115737B1(interfaceC28601c17);
                if (enumC36265aM115737B2 == null) {
                    i29 = -1;
                } else {
                    i29 = n0.f155394a[enumC36265aM115737B2.ordinal()];
                }
                if (i29 != -1) {
                    c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                } else if (i29 != 1) {
                    c35666g = new C35666g(c34070j.getHormonalInsightsModeBottomSheet().getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, i27, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                } else if (i29 != 2) {
                    textResource = null;
                    objArr = 0;
                    c34063cM107692e = c34070j.getHormonalInsightsContraceptionBottomSheet();
                    if (c34063cM107692e != null) {
                        c35666g = new C35666g(c34063cM107692e.getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, i27, objArr == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                    } else {
                        c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                        c35666g = c35666g2;
                    }
                } else if (i29 != 3) {
                    c34077qM107699l = c34070j.getPreviousPregnancies();
                    if (c34077qM107699l != null) {
                        c35666g = new C35666g(c34077qM107699l.getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, i27, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                    } else {
                        c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                        c35666g = c35666g2;
                    }
                } else if (i29 != 4) {
                    c34063cM107688a = c34070j.getDisableFertilityInsightsSurveyDrawer();
                    if (c34063cM107688a != null) {
                        c35666g = new C35666g(c34063cM107688a.getTitleDisplay(), null, null, null, null, 0.0f, 0.0f, 126, null);
                    } else {
                        c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                        c35666g = c35666g2;
                    }
                } else {
                    if (i29 == 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                }
                AbstractC35664f.a aVar12 = new AbstractC35664f.a(c15199y14);
                objM87133R17 = c28655q4.m87133R();
                if (objM87133R17 == c28676v1) {
                    objM87133R17 = new C36269e(4, interfaceC28601c17);
                    c28655q4.m87172p0(objM87133R17);
                }
                C37816b c37816bM121344e12 = AbstractC37817c.m121344e(409951292, c28655q4, new C29316o(c34070j, interfaceC28601c17, interfaceC28601c6, interfaceC28601c15, interfaceC28601c7, interfaceC28601c21115, function11111, function211, interfaceC28601c12, interfaceC28601c13));
                InterfaceC4339a interfaceC4339a11111116 = interfaceC4339a4;
                c28655q = c28655q4;
                AbstractC35660d.m112871m(modifier12, c35666g, aVar12, null, (InterfaceC4339a) objM87133R17, null, null, c37816bM121344e12, false, null, null, null, false, null, AbstractC37817c.m121344e(1279555584, c28655q4, new C14076n(c34070j, function11111, function211, interfaceC4339a11111116, function11110, interfaceC28601c21114, interfaceC28601c1110, interfaceC28601c21116, interfaceC28601c17)), c28655q, (C35666g.f151591h << 3) | 12607488 | (AbstractC35664f.a.f151587c << 6), 24576, 16232);
                interfaceC4339a3 = interfaceC4339a11111116;
                function8 = function11111;
                function7 = function211;
                function9 = function11110;
            } else {
                c28655q = c28655q5;
                c28655q.m87138X();
                function7 = function4;
                function8 = function5;
                function9 = function6;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35766g((Object) c34070j, function7, function8, function9, (InterfaceC23459e) interfaceC4339a3, i13, i14, 2);
            }
        }
        i34 |= 384;
        function5 = function2;
        i17 = i14 & 8;
        if (i17 != 0) {
            if ((i13 & 3072) == 0) {
                function6 = function3;
                if (c28655q5.m87157i(function6)) {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i34 |= i18;
            }
            i19 = i14 & 16;
            if (i19 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q5.m87157i(interfaceC4339a2)) {
                        i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i24 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i34 |= i24;
                }
                if ((i34 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q5.m87135U(i34 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i35 != 0) {
                        objM87133R30 = c28655q5.m87133R();
                        if (objM87133R30 == c28676v0) {
                            objM87133R30 = new C36244s(15);
                            c28655q5.m87172p0(objM87133R30);
                        }
                        function10 = (Function1) objM87133R30;
                    } else {
                        function10 = function4;
                    }
                    if (i15 != 0) {
                        objM87133R29 = c28655q5.m87133R();
                        if (objM87133R29 == c28676v0) {
                            objM87133R29 = new C36244s(9);
                            c28655q5.m87172p0(objM87133R29);
                        }
                        function11 = (Function1) objM87133R29;
                    } else {
                        function11 = function5;
                    }
                    if (i17 != 0) {
                        objM87133R28 = c28655q5.m87133R();
                        if (objM87133R28 == c28676v0) {
                            objM87133R28 = new C36244s(10);
                            c28655q5.m87172p0(objM87133R28);
                        }
                        function12 = (Function1) objM87133R28;
                    } else {
                        function12 = function6;
                    }
                    if (i19 != 0) {
                        objM87133R27 = c28655q5.m87133R();
                        if (objM87133R27 == c28676v0) {
                            objM87133R27 = new C35916a(23);
                            c28655q5.m87172p0(objM87133R27);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R27;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    objM87133R = c28655q5.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q5);
                        c28655q5.m87172p0(objM87133R);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                    function13 = function11;
                    function14 = function12;
                    c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q5, 3078, 6);
                    if (viewState.getDisableFertilityInsightsSurveyDrawer() != null) {
                        enumC36265a = EnumC36265a.FERTILITY_INSIGHTS_DISABLE_SURVEY;
                    } else {
                        enumC36265a = null;
                    }
                    objM87133R2 = c28655q5.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(enumC36265a);
                        c28655q5.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q5.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q5.m87172p0(objM87133R3);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                    objM87133R4 = c28655q5.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q5.m87172p0(objM87133R4);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q5.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q5.m87172p0(objM87133R5);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R5;
                    objM87133R6 = c28655q5.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q5.m87172p0(objM87133R6);
                    }
                    interfaceC28601c5 = (InterfaceC28601c1) objM87133R6;
                    objM87133R7 = c28655q5.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsShowCycleOverlayOn()));
                        c28655q5.m87172p0(objM87133R7);
                    }
                    InterfaceC28601c1 interfaceC28601c1111 = (InterfaceC28601c1) objM87133R7;
                    objM87133R8 = c28655q5.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsHormonalInsightsOn()));
                        c28655q5.m87172p0(objM87133R8);
                    }
                    InterfaceC28601c1 interfaceC28601c21117 = (InterfaceC28601c1) objM87133R8;
                    objM87133R9 = c28655q5.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = AbstractC28683x.m87272z(viewState.getSelectedMode());
                        c28655q5.m87172p0(objM87133R9);
                    }
                    interfaceC28601c6 = (InterfaceC28601c1) objM87133R9;
                    objM87133R10 = c28655q5.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = AbstractC28683x.m87272z(viewState.getSelectedContraceptionType());
                        c28655q5.m87172p0(objM87133R10);
                    }
                    interfaceC28601c7 = (InterfaceC28601c1) objM87133R10;
                    i25 = i34;
                    objM87133R11 = c28655q5.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = AbstractC28683x.m87272z(null);
                        c28655q5.m87172p0(objM87133R11);
                    }
                    interfaceC28601c8 = (InterfaceC28601c1) objM87133R11;
                    objM87133R12 = c28655q5.m87133R();
                    if (objM87133R12 == c28676v0) {
                        c34066fM107691d = viewState.getGoalsDrawer();
                        if (c34066fM107691d != null) {
                            interfaceC28601c9 = interfaceC28601c2;
                            objM74103I1 = C25235a0.f99113w;
                        } else {
                            interfaceC28601c9 = interfaceC28601c2;
                            objM74103I1 = C25235a0.f99113w;
                        }
                        objM87133R12 = AbstractC28683x.m87272z(objM74103I1);
                        c28655q5.m87172p0(objM87133R12);
                    } else {
                        interfaceC28601c9 = interfaceC28601c2;
                        interfaceC28601c3 = interfaceC28601c3;
                    }
                    interfaceC28601c10 = (InterfaceC28601c1) objM87133R12;
                    EnumC36265a enumC36265aM115737B15 = m115737B1(interfaceC28601c1);
                    zM87157i = c28655q5.m87157i(interfaceC2994c0) | c28655q5.m87157i(c15199y3M3460c);
                    objM87133R13 = c28655q5.m87133R();
                    if (zM87157i) {
                        objM87133R13 = new t(interfaceC2994c0, c15199y3M3460c, interfaceC28601c1, null);
                        c28655q5.m87172p0(objM87133R13);
                    } else {
                        objM87133R13 = new t(interfaceC2994c0, c15199y3M3460c, interfaceC28601c1, null);
                        c28655q5.m87172p0(objM87133R13);
                    }
                    AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R13, enumC36265aM115737B15);
                    zM87157i2 = c28655q5.m87157i(c15199y3M3460c) | c28655q5.m87157i(viewState);
                    objM87133R14 = c28655q5.m87133R();
                    if (zM87157i2) {
                        interfaceC28601c11 = interfaceC28601c4;
                        u uVar114 = new u(c15199y3M3460c, viewState, interfaceC28601c1, interfaceC28601c8, interfaceC28601c10, null);
                        c15199y3M3460c = c15199y3M3460c;
                        viewState = viewState;
                        interfaceC28601c12 = interfaceC28601c8;
                        interfaceC28601c13 = interfaceC28601c10;
                        c28655q5.m87172p0(uVar114);
                        objM87133R14 = uVar114;
                    } else {
                        interfaceC28601c11 = interfaceC28601c4;
                        u uVar115 = new u(c15199y3M3460c, viewState, interfaceC28601c1, interfaceC28601c8, interfaceC28601c10, null);
                        c15199y3M3460c = c15199y3M3460c;
                        viewState = viewState;
                        interfaceC28601c12 = interfaceC28601c8;
                        interfaceC28601c13 = interfaceC28601c10;
                        c28655q5.m87172p0(uVar115);
                        objM87133R14 = uVar115;
                    }
                    AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R14, c15199y3M3460c);
                    AnyModal anyModalM107690c14 = viewState.getEnablePregnancyInsightsConfirmation();
                    zM87157i3 = c28655q5.m87157i(viewState);
                    objM87133R15 = c28655q5.m87133R();
                    if (zM87157i3) {
                        objM87133R15 = new v(viewState, interfaceC28601c5, null);
                        c28655q5.m87172p0(objM87133R15);
                    } else {
                        objM87133R15 = new v(viewState, interfaceC28601c5, null);
                        c28655q5.m87172p0(objM87133R15);
                    }
                    i26 = AnyModal.$stable;
                    AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R15, anyModalM107690c14);
                    if (m115743D1(interfaceC28601c9)) {
                        c28655q5.m87150e0(-2135741304);
                        c34064dM107694g = viewState.getHormonalInsightsDisablingConfirmDialog();
                        if (c34064dM107694g == null) {
                            c28655q5.m87150e0(-1783470983);
                            c28655q5.m87173q(false);
                            interfaceC28601c1 = interfaceC28601c1;
                            interfaceC28601c14 = interfaceC28601c5;
                            function16 = function13;
                            z13 = false;
                            c28655q2 = c28655q5;
                            function15 = function10;
                        } else {
                            c28655q5.m87150e0(-1783470982);
                            TextResource textResourceM107671d1117 = c34064dM107694g.getTitleDisplay();
                            TextResource textResourceM107668a1117 = c34064dM107694g.getDescriptionDisplay();
                            TextResource textResourceM107669b1117 = c34064dM107694g.getPrimaryButtonTitle();
                            objM87133R24 = c28655q5.m87133R();
                            if (objM87133R24 == c28676v0) {
                                objM87133R24 = w.f155428w;
                                c28655q5.m87172p0(objM87133R24);
                            }
                            InterfaceC39332e interfaceC39332eM125323a1117 = p745y81.Function1.m125323a((Function1) objM87133R24);
                            TextResource textResourceM107670c1117 = c34064dM107694g.getSecondaryButtonTitle();
                            objM87133R25 = c28655q5.m87133R();
                            if (objM87133R25 == c28676v0) {
                                interfaceC28601c18 = interfaceC28601c9;
                                objM87133R25 = new C36269e(0, interfaceC28601c18);
                                c28655q5.m87172p0(objM87133R25);
                            } else {
                                interfaceC28601c18 = interfaceC28601c9;
                            }
                            InterfaceC4339a interfaceC4339a11111117 = (InterfaceC4339a) objM87133R25;
                            if ((i25 & 112) == 32) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            objM87133R26 = c28655q5.m87133R();
                            if (z24) {
                                objM87133R26 = new C25504c(interfaceC28601c18, interfaceC28601c6, function10);
                                c28655q5.m87172p0(objM87133R26);
                            } else {
                                objM87133R26 = new C25504c(interfaceC28601c18, interfaceC28601c6, function10);
                                c28655q5.m87172p0(objM87133R26);
                            }
                            InterfaceC4339a interfaceC4339a11111118 = (InterfaceC4339a) objM87133R26;
                            int i3111114 = TextResource.$stable;
                            int i3111115 = (i3111114 << 3) | (i3111114 << 6) | (i3111114 << 9) | (i3111114 << 27);
                            interfaceC28601c9 = interfaceC28601c18;
                            interfaceC28601c14 = interfaceC28601c5;
                            function15 = function10;
                            function16 = function13;
                            AbstractC21211n.m59497o(null, textResourceM107671d1117, textResourceM107668a1117, textResourceM107669b1117, false, interfaceC39332eM125323a1117, null, null, null, textResourceM107670c1117, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a11111117, null, interfaceC4339a11111118, null, null, null, c28655q5, i3111115, 0, 384, 247463377);
                            c28655q2 = c28655q5;
                            z13 = false;
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z13);
                    } else {
                        interfaceC28601c1 = interfaceC28601c1;
                        interfaceC28601c14 = interfaceC28601c5;
                        c28676v0 = c28676v0;
                        function15 = function10;
                        function16 = function13;
                        z13 = false;
                        c28655q2 = c28655q5;
                        c28655q2.m87150e0(-1782794252);
                        c28655q2.m87173q(false);
                    }
                    if (m115763K0(interfaceC28601c3)) {
                        c28655q2.m87150e0(-2135716155);
                        c34064dM107696i = c34070j.getHormonalInsightsModeConfirmDialog();
                        if (c34064dM107696i == null) {
                            c28655q2.m87150e0(-1782691364);
                            c28655q2.m87173q(z13);
                            i26 = i26;
                            c28655q3 = c28655q2;
                            interfaceC28601c15 = interfaceC28601c3;
                            function17 = function14;
                        } else {
                            c28655q2.m87150e0(-1782691363);
                            TextResource textResourceM107671d1118 = c34064dM107696i.getTitleDisplay();
                            TextResource textResourceM107668a1118 = c34064dM107696i.getDescriptionDisplay();
                            TextResource textResourceM107669b1118 = c34064dM107696i.getPrimaryButtonTitle();
                            objM87133R21 = c28655q2.m87133R();
                            if (objM87133R21 == c28676v0) {
                                objM87133R21 = x.f155429w;
                                c28655q2.m87172p0(objM87133R21);
                            }
                            InterfaceC39332e interfaceC39332eM125323a1118 = p745y81.Function1.m125323a((Function1) objM87133R21);
                            TextResource textResourceM107670c1118 = c34064dM107696i.getSecondaryButtonTitle();
                            objM87133R22 = c28655q2.m87133R();
                            if (objM87133R22 == c28676v0) {
                                interfaceC28601c15 = interfaceC28601c3;
                                objM87133R22 = new C36269e(1, interfaceC28601c15);
                                c28655q2.m87172p0(objM87133R22);
                            } else {
                                interfaceC28601c15 = interfaceC28601c3;
                            }
                            InterfaceC4339a interfaceC4339a11111119 = (InterfaceC4339a) objM87133R22;
                            if ((i25 & 7168) == 2048) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if ((i25 & 896) == 256) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            z19 = z18 | z17;
                            objM87133R23 = c28655q2.m87133R();
                            if (z19) {
                                function17 = function14;
                                objM87133R23 = new C36238m(function17, function16, interfaceC28601c15, interfaceC28601c6);
                                c28655q2.m87172p0(objM87133R23);
                            } else {
                                function17 = function14;
                                objM87133R23 = new C36238m(function17, function16, interfaceC28601c15, interfaceC28601c6);
                                c28655q2.m87172p0(objM87133R23);
                            }
                            InterfaceC4339a interfaceC4339a111111110 = (InterfaceC4339a) objM87133R23;
                            int i3111116 = TextResource.$stable;
                            C28655q c28655q18 = c28655q2;
                            AbstractC21211n.m59497o(null, textResourceM107671d1118, textResourceM107668a1118, textResourceM107669b1118, false, interfaceC39332eM125323a1118, null, null, null, textResourceM107670c1118, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a11111119, null, interfaceC4339a111111110, null, null, null, c28655q18, (i3111116 << 3) | (i3111116 << 6) | (i3111116 << 9) | (i3111116 << 27), 0, 384, 247463377);
                            c28655q3 = c28655q18;
                            z13 = false;
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(z13);
                    } else {
                        i26 = i26;
                        c28655q3 = c28655q2;
                        interfaceC28601c15 = interfaceC28601c3;
                        c15199y3M3460c = c15199y3M3460c;
                        function17 = function14;
                        c28655q3.m87150e0(-1781986764);
                        c28655q3.m87173q(z13);
                    }
                    if (m115769M0(interfaceC28601c11)) {
                        c28655q3.m87150e0(-2135689437);
                        c34064dM107693f = c34070j.getHormonalInsightsContraceptionConfirmDialog();
                        if (c34064dM107693f == null) {
                            c28655q3.m87150e0(-1781863106);
                            c28655q3.m87173q(z13);
                            interfaceC28601c15 = interfaceC28601c15;
                            interfaceC28601c16 = interfaceC28601c11;
                        } else {
                            c28655q3.m87150e0(-1781863105);
                            TextResource textResourceM107671d1119 = c34064dM107693f.getTitleDisplay();
                            TextResource textResourceM107668a1119 = c34064dM107693f.getDescriptionDisplay();
                            TextResource textResourceM107669b1119 = c34064dM107693f.getPrimaryButtonTitle();
                            objM87133R18 = c28655q3.m87133R();
                            if (objM87133R18 == c28676v0) {
                                objM87133R18 = g.f155357w;
                                c28655q3.m87172p0(objM87133R18);
                            }
                            InterfaceC39332e interfaceC39332eM125323a1119 = p745y81.Function1.m125323a((Function1) objM87133R18);
                            TextResource textResourceM107670c1119 = c34064dM107693f.getSecondaryButtonTitle();
                            objM87133R19 = c28655q3.m87133R();
                            if (objM87133R19 == c28676v0) {
                                interfaceC28601c16 = interfaceC28601c11;
                                objM87133R19 = new C36269e(2, interfaceC28601c16);
                                c28655q3.m87172p0(objM87133R19);
                            } else {
                                interfaceC28601c16 = interfaceC28601c11;
                            }
                            InterfaceC4339a interfaceC4339a111111111 = (InterfaceC4339a) objM87133R19;
                            if ((i25 & 7168) == 2048) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            boolean z217 = z14;
                            if ((i25 & 112) == 32) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = z217 | z15;
                            objM87133R20 = c28655q3.m87133R();
                            if (z16) {
                                objM87133R20 = new C36238m(function17, interfaceC28601c16, interfaceC28601c7, function15);
                                c28655q3.m87172p0(objM87133R20);
                            } else {
                                objM87133R20 = new C36238m(function17, interfaceC28601c16, interfaceC28601c7, function15);
                                c28655q3.m87172p0(objM87133R20);
                            }
                            int i3111117 = TextResource.$stable;
                            AbstractC21211n.m59497o(null, textResourceM107671d1119, textResourceM107668a1119, textResourceM107669b1119, false, interfaceC39332eM125323a1119, null, null, null, textResourceM107670c1119, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a111111111, null, (InterfaceC4339a) objM87133R20, null, null, null, c28655q3, (i3111117 << 3) | (i3111117 << 6) | (i3111117 << 9) | (i3111117 << 27), 0, 384, 247463377);
                            z13 = false;
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(z13);
                    } else {
                        interfaceC28601c15 = interfaceC28601c15;
                        interfaceC28601c16 = interfaceC28601c11;
                        c28655q3.m87150e0(-1781068172);
                        c28655q3.m87173q(z13);
                    }
                    if (m115775O0(interfaceC28601c14)) {
                        anyModalM107690c = c34070j.getEnablePregnancyInsightsConfirmation();
                    } else {
                        anyModalM107690c = null;
                    }
                    if ((i25 & 896) == 256) {
                        z13 = true;
                    }
                    objM87133R16 = c28655q3.m87133R();
                    if (z13) {
                        objM87133R16 = new C28827b(function16, interfaceC28601c14, 13);
                        c28655q3.m87172p0(objM87133R16);
                    } else {
                        objM87133R16 = new C28827b(function16, interfaceC28601c14, 13);
                        c28655q3.m87172p0(objM87133R16);
                    }
                    InterfaceC28601c1 interfaceC28601c21118 = interfaceC28601c16;
                    Function1 function11112 = function17;
                    c28676v1 = c28676v0;
                    Function1 function11113 = function16;
                    InterfaceC28601c1 interfaceC28601c21119 = interfaceC28601c9;
                    Function1 function212 = function15;
                    interfaceC28601c17 = interfaceC28601c1;
                    i27 = 2;
                    C15199y3 c15199y15 = c15199y3M3460c;
                    AbstractC0564o.m1394P(anyModalM107690c, (Function1) objM87133R16, null, null, null, null, c28655q3, i26, 60);
                    c28655q4 = c28655q3;
                    enumC36265aM115737B1 = m115737B1(interfaceC28601c17);
                    if (enumC36265aM115737B1 == null) {
                        i28 = -1;
                    } else {
                        i28 = n0.f155394a[enumC36265aM115737B1.ordinal()];
                    }
                    modifierM3599a = C2314t.f9131w;
                    if (i28 != -1) {
                        if (i28 != 1) {
                            modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "ModeBottomSheetTag");
                        } else if (i28 != 2) {
                            modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "ContraceptionBottomSheetTag");
                        } else if (i28 != 3) {
                            modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "PreviousPregnanciesBottomSheetTag");
                        } else if (i28 != 4) {
                            modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "FertilityInsightsDisableSurveyBottomSheetTag");
                        } else {
                            if (i28 == 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "GoalsBottomSheetTag");
                        }
                    }
                    Modifier modifier13 = modifierM3599a;
                    enumC36265aM115737B2 = m115737B1(interfaceC28601c17);
                    if (enumC36265aM115737B2 == null) {
                        i29 = -1;
                    } else {
                        i29 = n0.f155394a[enumC36265aM115737B2.ordinal()];
                    }
                    if (i29 != -1) {
                        c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                    } else if (i29 != 1) {
                        c35666g = new C35666g(c34070j.getHormonalInsightsModeBottomSheet().getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, i27, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                    } else if (i29 != 2) {
                        textResource = null;
                        objArr = 0;
                        c34063cM107692e = c34070j.getHormonalInsightsContraceptionBottomSheet();
                        if (c34063cM107692e != null) {
                            c35666g = new C35666g(c34063cM107692e.getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, i27, objArr == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                        } else {
                            c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                            c35666g = c35666g2;
                        }
                    } else if (i29 != 3) {
                        c34077qM107699l = c34070j.getPreviousPregnancies();
                        if (c34077qM107699l != null) {
                            c35666g = new C35666g(c34077qM107699l.getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, i27, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                        } else {
                            c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                            c35666g = c35666g2;
                        }
                    } else if (i29 != 4) {
                        c34063cM107688a = c34070j.getDisableFertilityInsightsSurveyDrawer();
                        if (c34063cM107688a != null) {
                            c35666g = new C35666g(c34063cM107688a.getTitleDisplay(), null, null, null, null, 0.0f, 0.0f, 126, null);
                        } else {
                            c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                            c35666g = c35666g2;
                        }
                    } else {
                        if (i29 == 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                    }
                    AbstractC35664f.a aVar13 = new AbstractC35664f.a(c15199y15);
                    objM87133R17 = c28655q4.m87133R();
                    if (objM87133R17 == c28676v1) {
                        objM87133R17 = new C36269e(4, interfaceC28601c17);
                        c28655q4.m87172p0(objM87133R17);
                    }
                    C37816b c37816bM121344e13 = AbstractC37817c.m121344e(409951292, c28655q4, new C29316o(c34070j, interfaceC28601c17, interfaceC28601c6, interfaceC28601c15, interfaceC28601c7, interfaceC28601c21118, function11113, function212, interfaceC28601c12, interfaceC28601c13));
                    InterfaceC4339a interfaceC4339a111111112 = interfaceC4339a4;
                    c28655q = c28655q4;
                    AbstractC35660d.m112871m(modifier13, c35666g, aVar13, null, (InterfaceC4339a) objM87133R17, null, null, c37816bM121344e13, false, null, null, null, false, null, AbstractC37817c.m121344e(1279555584, c28655q4, new C14076n(c34070j, function11113, function212, interfaceC4339a111111112, function11112, interfaceC28601c21117, interfaceC28601c1111, interfaceC28601c21119, interfaceC28601c17)), c28655q, (C35666g.f151591h << 3) | 12607488 | (AbstractC35664f.a.f151587c << 6), 24576, 16232);
                    interfaceC4339a3 = interfaceC4339a111111112;
                    function8 = function11113;
                    function7 = function212;
                    function9 = function11112;
                } else {
                    c28655q = c28655q5;
                    c28655q.m87138X();
                    function7 = function4;
                    function8 = function5;
                    function9 = function6;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C35766g((Object) c34070j, function7, function8, function9, (InterfaceC23459e) interfaceC4339a3, i13, i14, 2);
                }
            }
            i34 |= 24576;
            interfaceC4339a2 = interfaceC4339a;
            if ((i34 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q5.m87135U(i34 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i35 != 0) {
                    objM87133R30 = c28655q5.m87133R();
                    if (objM87133R30 == c28676v0) {
                        objM87133R30 = new C36244s(15);
                        c28655q5.m87172p0(objM87133R30);
                    }
                    function10 = (Function1) objM87133R30;
                } else {
                    function10 = function4;
                }
                if (i15 != 0) {
                    objM87133R29 = c28655q5.m87133R();
                    if (objM87133R29 == c28676v0) {
                        objM87133R29 = new C36244s(9);
                        c28655q5.m87172p0(objM87133R29);
                    }
                    function11 = (Function1) objM87133R29;
                } else {
                    function11 = function5;
                }
                if (i17 != 0) {
                    objM87133R28 = c28655q5.m87133R();
                    if (objM87133R28 == c28676v0) {
                        objM87133R28 = new C36244s(10);
                        c28655q5.m87172p0(objM87133R28);
                    }
                    function12 = (Function1) objM87133R28;
                } else {
                    function12 = function6;
                }
                if (i19 != 0) {
                    objM87133R27 = c28655q5.m87133R();
                    if (objM87133R27 == c28676v0) {
                        objM87133R27 = new C35916a(23);
                        c28655q5.m87172p0(objM87133R27);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R27;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                objM87133R = c28655q5.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q5);
                    c28655q5.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                function13 = function11;
                function14 = function12;
                c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q5, 3078, 6);
                if (viewState.getDisableFertilityInsightsSurveyDrawer() != null) {
                    enumC36265a = EnumC36265a.FERTILITY_INSIGHTS_DISABLE_SURVEY;
                } else {
                    enumC36265a = null;
                }
                objM87133R2 = c28655q5.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(enumC36265a);
                    c28655q5.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q5.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q5.m87172p0(objM87133R3);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                objM87133R4 = c28655q5.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q5.m87172p0(objM87133R4);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
                objM87133R5 = c28655q5.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q5.m87172p0(objM87133R5);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R5;
                objM87133R6 = c28655q5.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q5.m87172p0(objM87133R6);
                }
                interfaceC28601c5 = (InterfaceC28601c1) objM87133R6;
                objM87133R7 = c28655q5.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsShowCycleOverlayOn()));
                    c28655q5.m87172p0(objM87133R7);
                }
                InterfaceC28601c1 interfaceC28601c1112 = (InterfaceC28601c1) objM87133R7;
                objM87133R8 = c28655q5.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsHormonalInsightsOn()));
                    c28655q5.m87172p0(objM87133R8);
                }
                InterfaceC28601c1 interfaceC28601c211110 = (InterfaceC28601c1) objM87133R8;
                objM87133R9 = c28655q5.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = AbstractC28683x.m87272z(viewState.getSelectedMode());
                    c28655q5.m87172p0(objM87133R9);
                }
                interfaceC28601c6 = (InterfaceC28601c1) objM87133R9;
                objM87133R10 = c28655q5.m87133R();
                if (objM87133R10 == c28676v0) {
                    objM87133R10 = AbstractC28683x.m87272z(viewState.getSelectedContraceptionType());
                    c28655q5.m87172p0(objM87133R10);
                }
                interfaceC28601c7 = (InterfaceC28601c1) objM87133R10;
                i25 = i34;
                objM87133R11 = c28655q5.m87133R();
                if (objM87133R11 == c28676v0) {
                    objM87133R11 = AbstractC28683x.m87272z(null);
                    c28655q5.m87172p0(objM87133R11);
                }
                interfaceC28601c8 = (InterfaceC28601c1) objM87133R11;
                objM87133R12 = c28655q5.m87133R();
                if (objM87133R12 == c28676v0) {
                    c34066fM107691d = viewState.getGoalsDrawer();
                    if (c34066fM107691d != null) {
                        interfaceC28601c9 = interfaceC28601c2;
                        objM74103I1 = C25235a0.f99113w;
                    } else {
                        interfaceC28601c9 = interfaceC28601c2;
                        objM74103I1 = C25235a0.f99113w;
                    }
                    objM87133R12 = AbstractC28683x.m87272z(objM74103I1);
                    c28655q5.m87172p0(objM87133R12);
                } else {
                    interfaceC28601c9 = interfaceC28601c2;
                    interfaceC28601c3 = interfaceC28601c3;
                }
                interfaceC28601c10 = (InterfaceC28601c1) objM87133R12;
                EnumC36265a enumC36265aM115737B16 = m115737B1(interfaceC28601c1);
                zM87157i = c28655q5.m87157i(interfaceC2994c0) | c28655q5.m87157i(c15199y3M3460c);
                objM87133R13 = c28655q5.m87133R();
                if (zM87157i) {
                    objM87133R13 = new t(interfaceC2994c0, c15199y3M3460c, interfaceC28601c1, null);
                    c28655q5.m87172p0(objM87133R13);
                } else {
                    objM87133R13 = new t(interfaceC2994c0, c15199y3M3460c, interfaceC28601c1, null);
                    c28655q5.m87172p0(objM87133R13);
                }
                AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R13, enumC36265aM115737B16);
                zM87157i2 = c28655q5.m87157i(c15199y3M3460c) | c28655q5.m87157i(viewState);
                objM87133R14 = c28655q5.m87133R();
                if (zM87157i2) {
                    interfaceC28601c11 = interfaceC28601c4;
                    u uVar116 = new u(c15199y3M3460c, viewState, interfaceC28601c1, interfaceC28601c8, interfaceC28601c10, null);
                    c15199y3M3460c = c15199y3M3460c;
                    viewState = viewState;
                    interfaceC28601c12 = interfaceC28601c8;
                    interfaceC28601c13 = interfaceC28601c10;
                    c28655q5.m87172p0(uVar116);
                    objM87133R14 = uVar116;
                } else {
                    interfaceC28601c11 = interfaceC28601c4;
                    u uVar117 = new u(c15199y3M3460c, viewState, interfaceC28601c1, interfaceC28601c8, interfaceC28601c10, null);
                    c15199y3M3460c = c15199y3M3460c;
                    viewState = viewState;
                    interfaceC28601c12 = interfaceC28601c8;
                    interfaceC28601c13 = interfaceC28601c10;
                    c28655q5.m87172p0(uVar117);
                    objM87133R14 = uVar117;
                }
                AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R14, c15199y3M3460c);
                AnyModal anyModalM107690c15 = viewState.getEnablePregnancyInsightsConfirmation();
                zM87157i3 = c28655q5.m87157i(viewState);
                objM87133R15 = c28655q5.m87133R();
                if (zM87157i3) {
                    objM87133R15 = new v(viewState, interfaceC28601c5, null);
                    c28655q5.m87172p0(objM87133R15);
                } else {
                    objM87133R15 = new v(viewState, interfaceC28601c5, null);
                    c28655q5.m87172p0(objM87133R15);
                }
                i26 = AnyModal.$stable;
                AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R15, anyModalM107690c15);
                if (m115743D1(interfaceC28601c9)) {
                    c28655q5.m87150e0(-2135741304);
                    c34064dM107694g = viewState.getHormonalInsightsDisablingConfirmDialog();
                    if (c34064dM107694g == null) {
                        c28655q5.m87150e0(-1783470983);
                        c28655q5.m87173q(false);
                        interfaceC28601c1 = interfaceC28601c1;
                        interfaceC28601c14 = interfaceC28601c5;
                        function16 = function13;
                        z13 = false;
                        c28655q2 = c28655q5;
                        function15 = function10;
                    } else {
                        c28655q5.m87150e0(-1783470982);
                        TextResource textResourceM107671d11110 = c34064dM107694g.getTitleDisplay();
                        TextResource textResourceM107668a11110 = c34064dM107694g.getDescriptionDisplay();
                        TextResource textResourceM107669b11110 = c34064dM107694g.getPrimaryButtonTitle();
                        objM87133R24 = c28655q5.m87133R();
                        if (objM87133R24 == c28676v0) {
                            objM87133R24 = w.f155428w;
                            c28655q5.m87172p0(objM87133R24);
                        }
                        InterfaceC39332e interfaceC39332eM125323a11110 = p745y81.Function1.m125323a((Function1) objM87133R24);
                        TextResource textResourceM107670c11110 = c34064dM107694g.getSecondaryButtonTitle();
                        objM87133R25 = c28655q5.m87133R();
                        if (objM87133R25 == c28676v0) {
                            interfaceC28601c18 = interfaceC28601c9;
                            objM87133R25 = new C36269e(0, interfaceC28601c18);
                            c28655q5.m87172p0(objM87133R25);
                        } else {
                            interfaceC28601c18 = interfaceC28601c9;
                        }
                        InterfaceC4339a interfaceC4339a111111113 = (InterfaceC4339a) objM87133R25;
                        if ((i25 & 112) == 32) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        objM87133R26 = c28655q5.m87133R();
                        if (z24) {
                            objM87133R26 = new C25504c(interfaceC28601c18, interfaceC28601c6, function10);
                            c28655q5.m87172p0(objM87133R26);
                        } else {
                            objM87133R26 = new C25504c(interfaceC28601c18, interfaceC28601c6, function10);
                            c28655q5.m87172p0(objM87133R26);
                        }
                        InterfaceC4339a interfaceC4339a111111114 = (InterfaceC4339a) objM87133R26;
                        int i3111118 = TextResource.$stable;
                        int i3111119 = (i3111118 << 3) | (i3111118 << 6) | (i3111118 << 9) | (i3111118 << 27);
                        interfaceC28601c9 = interfaceC28601c18;
                        interfaceC28601c14 = interfaceC28601c5;
                        function15 = function10;
                        function16 = function13;
                        AbstractC21211n.m59497o(null, textResourceM107671d11110, textResourceM107668a11110, textResourceM107669b11110, false, interfaceC39332eM125323a11110, null, null, null, textResourceM107670c11110, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a111111113, null, interfaceC4339a111111114, null, null, null, c28655q5, i3111119, 0, 384, 247463377);
                        c28655q2 = c28655q5;
                        z13 = false;
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z13);
                } else {
                    interfaceC28601c1 = interfaceC28601c1;
                    interfaceC28601c14 = interfaceC28601c5;
                    c28676v0 = c28676v0;
                    function15 = function10;
                    function16 = function13;
                    z13 = false;
                    c28655q2 = c28655q5;
                    c28655q2.m87150e0(-1782794252);
                    c28655q2.m87173q(false);
                }
                if (m115763K0(interfaceC28601c3)) {
                    c28655q2.m87150e0(-2135716155);
                    c34064dM107696i = c34070j.getHormonalInsightsModeConfirmDialog();
                    if (c34064dM107696i == null) {
                        c28655q2.m87150e0(-1782691364);
                        c28655q2.m87173q(z13);
                        i26 = i26;
                        c28655q3 = c28655q2;
                        interfaceC28601c15 = interfaceC28601c3;
                        function17 = function14;
                    } else {
                        c28655q2.m87150e0(-1782691363);
                        TextResource textResourceM107671d11111 = c34064dM107696i.getTitleDisplay();
                        TextResource textResourceM107668a11111 = c34064dM107696i.getDescriptionDisplay();
                        TextResource textResourceM107669b11111 = c34064dM107696i.getPrimaryButtonTitle();
                        objM87133R21 = c28655q2.m87133R();
                        if (objM87133R21 == c28676v0) {
                            objM87133R21 = x.f155429w;
                            c28655q2.m87172p0(objM87133R21);
                        }
                        InterfaceC39332e interfaceC39332eM125323a11111 = p745y81.Function1.m125323a((Function1) objM87133R21);
                        TextResource textResourceM107670c11111 = c34064dM107696i.getSecondaryButtonTitle();
                        objM87133R22 = c28655q2.m87133R();
                        if (objM87133R22 == c28676v0) {
                            interfaceC28601c15 = interfaceC28601c3;
                            objM87133R22 = new C36269e(1, interfaceC28601c15);
                            c28655q2.m87172p0(objM87133R22);
                        } else {
                            interfaceC28601c15 = interfaceC28601c3;
                        }
                        InterfaceC4339a interfaceC4339a111111115 = (InterfaceC4339a) objM87133R22;
                        if ((i25 & 7168) == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if ((i25 & 896) == 256) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = z18 | z17;
                        objM87133R23 = c28655q2.m87133R();
                        if (z19) {
                            function17 = function14;
                            objM87133R23 = new C36238m(function17, function16, interfaceC28601c15, interfaceC28601c6);
                            c28655q2.m87172p0(objM87133R23);
                        } else {
                            function17 = function14;
                            objM87133R23 = new C36238m(function17, function16, interfaceC28601c15, interfaceC28601c6);
                            c28655q2.m87172p0(objM87133R23);
                        }
                        InterfaceC4339a interfaceC4339a111111116 = (InterfaceC4339a) objM87133R23;
                        int i31111110 = TextResource.$stable;
                        C28655q c28655q19 = c28655q2;
                        AbstractC21211n.m59497o(null, textResourceM107671d11111, textResourceM107668a11111, textResourceM107669b11111, false, interfaceC39332eM125323a11111, null, null, null, textResourceM107670c11111, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a111111115, null, interfaceC4339a111111116, null, null, null, c28655q19, (i31111110 << 3) | (i31111110 << 6) | (i31111110 << 9) | (i31111110 << 27), 0, 384, 247463377);
                        c28655q3 = c28655q19;
                        z13 = false;
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(z13);
                } else {
                    i26 = i26;
                    c28655q3 = c28655q2;
                    interfaceC28601c15 = interfaceC28601c3;
                    c15199y3M3460c = c15199y3M3460c;
                    function17 = function14;
                    c28655q3.m87150e0(-1781986764);
                    c28655q3.m87173q(z13);
                }
                if (m115769M0(interfaceC28601c11)) {
                    c28655q3.m87150e0(-2135689437);
                    c34064dM107693f = c34070j.getHormonalInsightsContraceptionConfirmDialog();
                    if (c34064dM107693f == null) {
                        c28655q3.m87150e0(-1781863106);
                        c28655q3.m87173q(z13);
                        interfaceC28601c15 = interfaceC28601c15;
                        interfaceC28601c16 = interfaceC28601c11;
                    } else {
                        c28655q3.m87150e0(-1781863105);
                        TextResource textResourceM107671d11112 = c34064dM107693f.getTitleDisplay();
                        TextResource textResourceM107668a11112 = c34064dM107693f.getDescriptionDisplay();
                        TextResource textResourceM107669b11112 = c34064dM107693f.getPrimaryButtonTitle();
                        objM87133R18 = c28655q3.m87133R();
                        if (objM87133R18 == c28676v0) {
                            objM87133R18 = g.f155357w;
                            c28655q3.m87172p0(objM87133R18);
                        }
                        InterfaceC39332e interfaceC39332eM125323a11112 = p745y81.Function1.m125323a((Function1) objM87133R18);
                        TextResource textResourceM107670c11112 = c34064dM107693f.getSecondaryButtonTitle();
                        objM87133R19 = c28655q3.m87133R();
                        if (objM87133R19 == c28676v0) {
                            interfaceC28601c16 = interfaceC28601c11;
                            objM87133R19 = new C36269e(2, interfaceC28601c16);
                            c28655q3.m87172p0(objM87133R19);
                        } else {
                            interfaceC28601c16 = interfaceC28601c11;
                        }
                        InterfaceC4339a interfaceC4339a111111117 = (InterfaceC4339a) objM87133R19;
                        if ((i25 & 7168) == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean z218 = z14;
                        if ((i25 & 112) == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z218 | z15;
                        objM87133R20 = c28655q3.m87133R();
                        if (z16) {
                            objM87133R20 = new C36238m(function17, interfaceC28601c16, interfaceC28601c7, function15);
                            c28655q3.m87172p0(objM87133R20);
                        } else {
                            objM87133R20 = new C36238m(function17, interfaceC28601c16, interfaceC28601c7, function15);
                            c28655q3.m87172p0(objM87133R20);
                        }
                        int i31111111 = TextResource.$stable;
                        AbstractC21211n.m59497o(null, textResourceM107671d11112, textResourceM107668a11112, textResourceM107669b11112, false, interfaceC39332eM125323a11112, null, null, null, textResourceM107670c11112, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a111111117, null, (InterfaceC4339a) objM87133R20, null, null, null, c28655q3, (i31111111 << 3) | (i31111111 << 6) | (i31111111 << 9) | (i31111111 << 27), 0, 384, 247463377);
                        z13 = false;
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(z13);
                } else {
                    interfaceC28601c15 = interfaceC28601c15;
                    interfaceC28601c16 = interfaceC28601c11;
                    c28655q3.m87150e0(-1781068172);
                    c28655q3.m87173q(z13);
                }
                if (m115775O0(interfaceC28601c14)) {
                    anyModalM107690c = c34070j.getEnablePregnancyInsightsConfirmation();
                } else {
                    anyModalM107690c = null;
                }
                if ((i25 & 896) == 256) {
                    z13 = true;
                }
                objM87133R16 = c28655q3.m87133R();
                if (z13) {
                    objM87133R16 = new C28827b(function16, interfaceC28601c14, 13);
                    c28655q3.m87172p0(objM87133R16);
                } else {
                    objM87133R16 = new C28827b(function16, interfaceC28601c14, 13);
                    c28655q3.m87172p0(objM87133R16);
                }
                InterfaceC28601c1 interfaceC28601c211111 = interfaceC28601c16;
                Function1 function11114 = function17;
                c28676v1 = c28676v0;
                Function1 function11115 = function16;
                InterfaceC28601c1 interfaceC28601c211112 = interfaceC28601c9;
                Function1 function213 = function15;
                interfaceC28601c17 = interfaceC28601c1;
                i27 = 2;
                C15199y3 c15199y16 = c15199y3M3460c;
                AbstractC0564o.m1394P(anyModalM107690c, (Function1) objM87133R16, null, null, null, null, c28655q3, i26, 60);
                c28655q4 = c28655q3;
                enumC36265aM115737B1 = m115737B1(interfaceC28601c17);
                if (enumC36265aM115737B1 == null) {
                    i28 = -1;
                } else {
                    i28 = n0.f155394a[enumC36265aM115737B1.ordinal()];
                }
                modifierM3599a = C2314t.f9131w;
                if (i28 != -1) {
                    if (i28 != 1) {
                        modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "ModeBottomSheetTag");
                    } else if (i28 != 2) {
                        modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "ContraceptionBottomSheetTag");
                    } else if (i28 != 3) {
                        modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "PreviousPregnanciesBottomSheetTag");
                    } else if (i28 != 4) {
                        modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "FertilityInsightsDisableSurveyBottomSheetTag");
                    } else {
                        if (i28 == 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "GoalsBottomSheetTag");
                    }
                }
                Modifier modifier14 = modifierM3599a;
                enumC36265aM115737B2 = m115737B1(interfaceC28601c17);
                if (enumC36265aM115737B2 == null) {
                    i29 = -1;
                } else {
                    i29 = n0.f155394a[enumC36265aM115737B2.ordinal()];
                }
                if (i29 != -1) {
                    c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                } else if (i29 != 1) {
                    c35666g = new C35666g(c34070j.getHormonalInsightsModeBottomSheet().getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, i27, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                } else if (i29 != 2) {
                    textResource = null;
                    objArr = 0;
                    c34063cM107692e = c34070j.getHormonalInsightsContraceptionBottomSheet();
                    if (c34063cM107692e != null) {
                        c35666g = new C35666g(c34063cM107692e.getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, i27, objArr == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                    } else {
                        c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                        c35666g = c35666g2;
                    }
                } else if (i29 != 3) {
                    c34077qM107699l = c34070j.getPreviousPregnancies();
                    if (c34077qM107699l != null) {
                        c35666g = new C35666g(c34077qM107699l.getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, i27, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                    } else {
                        c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                        c35666g = c35666g2;
                    }
                } else if (i29 != 4) {
                    c34063cM107688a = c34070j.getDisableFertilityInsightsSurveyDrawer();
                    if (c34063cM107688a != null) {
                        c35666g = new C35666g(c34063cM107688a.getTitleDisplay(), null, null, null, null, 0.0f, 0.0f, 126, null);
                    } else {
                        c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                        c35666g = c35666g2;
                    }
                } else {
                    if (i29 == 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                }
                AbstractC35664f.a aVar14 = new AbstractC35664f.a(c15199y16);
                objM87133R17 = c28655q4.m87133R();
                if (objM87133R17 == c28676v1) {
                    objM87133R17 = new C36269e(4, interfaceC28601c17);
                    c28655q4.m87172p0(objM87133R17);
                }
                C37816b c37816bM121344e14 = AbstractC37817c.m121344e(409951292, c28655q4, new C29316o(c34070j, interfaceC28601c17, interfaceC28601c6, interfaceC28601c15, interfaceC28601c7, interfaceC28601c211111, function11115, function213, interfaceC28601c12, interfaceC28601c13));
                InterfaceC4339a interfaceC4339a111111118 = interfaceC4339a4;
                c28655q = c28655q4;
                AbstractC35660d.m112871m(modifier14, c35666g, aVar14, null, (InterfaceC4339a) objM87133R17, null, null, c37816bM121344e14, false, null, null, null, false, null, AbstractC37817c.m121344e(1279555584, c28655q4, new C14076n(c34070j, function11115, function213, interfaceC4339a111111118, function11114, interfaceC28601c211110, interfaceC28601c1112, interfaceC28601c211112, interfaceC28601c17)), c28655q, (C35666g.f151591h << 3) | 12607488 | (AbstractC35664f.a.f151587c << 6), 24576, 16232);
                interfaceC4339a3 = interfaceC4339a111111118;
                function8 = function11115;
                function7 = function213;
                function9 = function11114;
            } else {
                c28655q = c28655q5;
                c28655q.m87138X();
                function7 = function4;
                function8 = function5;
                function9 = function6;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35766g((Object) c34070j, function7, function8, function9, (InterfaceC23459e) interfaceC4339a3, i13, i14, 2);
            }
        }
        i34 |= 3072;
        function6 = function3;
        i19 = i14 & 16;
        if (i19 != 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q5.m87157i(interfaceC4339a2)) {
                    i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i24 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i34 |= i24;
            }
            if ((i34 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q5.m87135U(i34 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i35 != 0) {
                    objM87133R30 = c28655q5.m87133R();
                    if (objM87133R30 == c28676v0) {
                        objM87133R30 = new C36244s(15);
                        c28655q5.m87172p0(objM87133R30);
                    }
                    function10 = (Function1) objM87133R30;
                } else {
                    function10 = function4;
                }
                if (i15 != 0) {
                    objM87133R29 = c28655q5.m87133R();
                    if (objM87133R29 == c28676v0) {
                        objM87133R29 = new C36244s(9);
                        c28655q5.m87172p0(objM87133R29);
                    }
                    function11 = (Function1) objM87133R29;
                } else {
                    function11 = function5;
                }
                if (i17 != 0) {
                    objM87133R28 = c28655q5.m87133R();
                    if (objM87133R28 == c28676v0) {
                        objM87133R28 = new C36244s(10);
                        c28655q5.m87172p0(objM87133R28);
                    }
                    function12 = (Function1) objM87133R28;
                } else {
                    function12 = function6;
                }
                if (i19 != 0) {
                    objM87133R27 = c28655q5.m87133R();
                    if (objM87133R27 == c28676v0) {
                        objM87133R27 = new C35916a(23);
                        c28655q5.m87172p0(objM87133R27);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R27;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                objM87133R = c28655q5.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q5);
                    c28655q5.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                function13 = function11;
                function14 = function12;
                c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q5, 3078, 6);
                if (viewState.getDisableFertilityInsightsSurveyDrawer() != null) {
                    enumC36265a = EnumC36265a.FERTILITY_INSIGHTS_DISABLE_SURVEY;
                } else {
                    enumC36265a = null;
                }
                objM87133R2 = c28655q5.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(enumC36265a);
                    c28655q5.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q5.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q5.m87172p0(objM87133R3);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                objM87133R4 = c28655q5.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q5.m87172p0(objM87133R4);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
                objM87133R5 = c28655q5.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q5.m87172p0(objM87133R5);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R5;
                objM87133R6 = c28655q5.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q5.m87172p0(objM87133R6);
                }
                interfaceC28601c5 = (InterfaceC28601c1) objM87133R6;
                objM87133R7 = c28655q5.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsShowCycleOverlayOn()));
                    c28655q5.m87172p0(objM87133R7);
                }
                InterfaceC28601c1 interfaceC28601c1113 = (InterfaceC28601c1) objM87133R7;
                objM87133R8 = c28655q5.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsHormonalInsightsOn()));
                    c28655q5.m87172p0(objM87133R8);
                }
                InterfaceC28601c1 interfaceC28601c211113 = (InterfaceC28601c1) objM87133R8;
                objM87133R9 = c28655q5.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = AbstractC28683x.m87272z(viewState.getSelectedMode());
                    c28655q5.m87172p0(objM87133R9);
                }
                interfaceC28601c6 = (InterfaceC28601c1) objM87133R9;
                objM87133R10 = c28655q5.m87133R();
                if (objM87133R10 == c28676v0) {
                    objM87133R10 = AbstractC28683x.m87272z(viewState.getSelectedContraceptionType());
                    c28655q5.m87172p0(objM87133R10);
                }
                interfaceC28601c7 = (InterfaceC28601c1) objM87133R10;
                i25 = i34;
                objM87133R11 = c28655q5.m87133R();
                if (objM87133R11 == c28676v0) {
                    objM87133R11 = AbstractC28683x.m87272z(null);
                    c28655q5.m87172p0(objM87133R11);
                }
                interfaceC28601c8 = (InterfaceC28601c1) objM87133R11;
                objM87133R12 = c28655q5.m87133R();
                if (objM87133R12 == c28676v0) {
                    c34066fM107691d = viewState.getGoalsDrawer();
                    if (c34066fM107691d != null) {
                        interfaceC28601c9 = interfaceC28601c2;
                        objM74103I1 = C25235a0.f99113w;
                    } else {
                        interfaceC28601c9 = interfaceC28601c2;
                        objM74103I1 = C25235a0.f99113w;
                    }
                    objM87133R12 = AbstractC28683x.m87272z(objM74103I1);
                    c28655q5.m87172p0(objM87133R12);
                } else {
                    interfaceC28601c9 = interfaceC28601c2;
                    interfaceC28601c3 = interfaceC28601c3;
                }
                interfaceC28601c10 = (InterfaceC28601c1) objM87133R12;
                EnumC36265a enumC36265aM115737B17 = m115737B1(interfaceC28601c1);
                zM87157i = c28655q5.m87157i(interfaceC2994c0) | c28655q5.m87157i(c15199y3M3460c);
                objM87133R13 = c28655q5.m87133R();
                if (zM87157i) {
                    objM87133R13 = new t(interfaceC2994c0, c15199y3M3460c, interfaceC28601c1, null);
                    c28655q5.m87172p0(objM87133R13);
                } else {
                    objM87133R13 = new t(interfaceC2994c0, c15199y3M3460c, interfaceC28601c1, null);
                    c28655q5.m87172p0(objM87133R13);
                }
                AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R13, enumC36265aM115737B17);
                zM87157i2 = c28655q5.m87157i(c15199y3M3460c) | c28655q5.m87157i(viewState);
                objM87133R14 = c28655q5.m87133R();
                if (zM87157i2) {
                    interfaceC28601c11 = interfaceC28601c4;
                    u uVar118 = new u(c15199y3M3460c, viewState, interfaceC28601c1, interfaceC28601c8, interfaceC28601c10, null);
                    c15199y3M3460c = c15199y3M3460c;
                    viewState = viewState;
                    interfaceC28601c12 = interfaceC28601c8;
                    interfaceC28601c13 = interfaceC28601c10;
                    c28655q5.m87172p0(uVar118);
                    objM87133R14 = uVar118;
                } else {
                    interfaceC28601c11 = interfaceC28601c4;
                    u uVar119 = new u(c15199y3M3460c, viewState, interfaceC28601c1, interfaceC28601c8, interfaceC28601c10, null);
                    c15199y3M3460c = c15199y3M3460c;
                    viewState = viewState;
                    interfaceC28601c12 = interfaceC28601c8;
                    interfaceC28601c13 = interfaceC28601c10;
                    c28655q5.m87172p0(uVar119);
                    objM87133R14 = uVar119;
                }
                AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R14, c15199y3M3460c);
                AnyModal anyModalM107690c16 = viewState.getEnablePregnancyInsightsConfirmation();
                zM87157i3 = c28655q5.m87157i(viewState);
                objM87133R15 = c28655q5.m87133R();
                if (zM87157i3) {
                    objM87133R15 = new v(viewState, interfaceC28601c5, null);
                    c28655q5.m87172p0(objM87133R15);
                } else {
                    objM87133R15 = new v(viewState, interfaceC28601c5, null);
                    c28655q5.m87172p0(objM87133R15);
                }
                i26 = AnyModal.$stable;
                AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R15, anyModalM107690c16);
                if (m115743D1(interfaceC28601c9)) {
                    c28655q5.m87150e0(-2135741304);
                    c34064dM107694g = viewState.getHormonalInsightsDisablingConfirmDialog();
                    if (c34064dM107694g == null) {
                        c28655q5.m87150e0(-1783470983);
                        c28655q5.m87173q(false);
                        interfaceC28601c1 = interfaceC28601c1;
                        interfaceC28601c14 = interfaceC28601c5;
                        function16 = function13;
                        z13 = false;
                        c28655q2 = c28655q5;
                        function15 = function10;
                    } else {
                        c28655q5.m87150e0(-1783470982);
                        TextResource textResourceM107671d11113 = c34064dM107694g.getTitleDisplay();
                        TextResource textResourceM107668a11113 = c34064dM107694g.getDescriptionDisplay();
                        TextResource textResourceM107669b11113 = c34064dM107694g.getPrimaryButtonTitle();
                        objM87133R24 = c28655q5.m87133R();
                        if (objM87133R24 == c28676v0) {
                            objM87133R24 = w.f155428w;
                            c28655q5.m87172p0(objM87133R24);
                        }
                        InterfaceC39332e interfaceC39332eM125323a11113 = p745y81.Function1.m125323a((Function1) objM87133R24);
                        TextResource textResourceM107670c11113 = c34064dM107694g.getSecondaryButtonTitle();
                        objM87133R25 = c28655q5.m87133R();
                        if (objM87133R25 == c28676v0) {
                            interfaceC28601c18 = interfaceC28601c9;
                            objM87133R25 = new C36269e(0, interfaceC28601c18);
                            c28655q5.m87172p0(objM87133R25);
                        } else {
                            interfaceC28601c18 = interfaceC28601c9;
                        }
                        InterfaceC4339a interfaceC4339a111111119 = (InterfaceC4339a) objM87133R25;
                        if ((i25 & 112) == 32) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        objM87133R26 = c28655q5.m87133R();
                        if (z24) {
                            objM87133R26 = new C25504c(interfaceC28601c18, interfaceC28601c6, function10);
                            c28655q5.m87172p0(objM87133R26);
                        } else {
                            objM87133R26 = new C25504c(interfaceC28601c18, interfaceC28601c6, function10);
                            c28655q5.m87172p0(objM87133R26);
                        }
                        InterfaceC4339a interfaceC4339a1111111110 = (InterfaceC4339a) objM87133R26;
                        int i31111112 = TextResource.$stable;
                        int i31111113 = (i31111112 << 3) | (i31111112 << 6) | (i31111112 << 9) | (i31111112 << 27);
                        interfaceC28601c9 = interfaceC28601c18;
                        interfaceC28601c14 = interfaceC28601c5;
                        function15 = function10;
                        function16 = function13;
                        AbstractC21211n.m59497o(null, textResourceM107671d11113, textResourceM107668a11113, textResourceM107669b11113, false, interfaceC39332eM125323a11113, null, null, null, textResourceM107670c11113, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a111111119, null, interfaceC4339a1111111110, null, null, null, c28655q5, i31111113, 0, 384, 247463377);
                        c28655q2 = c28655q5;
                        z13 = false;
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z13);
                } else {
                    interfaceC28601c1 = interfaceC28601c1;
                    interfaceC28601c14 = interfaceC28601c5;
                    c28676v0 = c28676v0;
                    function15 = function10;
                    function16 = function13;
                    z13 = false;
                    c28655q2 = c28655q5;
                    c28655q2.m87150e0(-1782794252);
                    c28655q2.m87173q(false);
                }
                if (m115763K0(interfaceC28601c3)) {
                    c28655q2.m87150e0(-2135716155);
                    c34064dM107696i = c34070j.getHormonalInsightsModeConfirmDialog();
                    if (c34064dM107696i == null) {
                        c28655q2.m87150e0(-1782691364);
                        c28655q2.m87173q(z13);
                        i26 = i26;
                        c28655q3 = c28655q2;
                        interfaceC28601c15 = interfaceC28601c3;
                        function17 = function14;
                    } else {
                        c28655q2.m87150e0(-1782691363);
                        TextResource textResourceM107671d11114 = c34064dM107696i.getTitleDisplay();
                        TextResource textResourceM107668a11114 = c34064dM107696i.getDescriptionDisplay();
                        TextResource textResourceM107669b11114 = c34064dM107696i.getPrimaryButtonTitle();
                        objM87133R21 = c28655q2.m87133R();
                        if (objM87133R21 == c28676v0) {
                            objM87133R21 = x.f155429w;
                            c28655q2.m87172p0(objM87133R21);
                        }
                        InterfaceC39332e interfaceC39332eM125323a11114 = p745y81.Function1.m125323a((Function1) objM87133R21);
                        TextResource textResourceM107670c11114 = c34064dM107696i.getSecondaryButtonTitle();
                        objM87133R22 = c28655q2.m87133R();
                        if (objM87133R22 == c28676v0) {
                            interfaceC28601c15 = interfaceC28601c3;
                            objM87133R22 = new C36269e(1, interfaceC28601c15);
                            c28655q2.m87172p0(objM87133R22);
                        } else {
                            interfaceC28601c15 = interfaceC28601c3;
                        }
                        InterfaceC4339a interfaceC4339a1111111111 = (InterfaceC4339a) objM87133R22;
                        if ((i25 & 7168) == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if ((i25 & 896) == 256) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = z18 | z17;
                        objM87133R23 = c28655q2.m87133R();
                        if (z19) {
                            function17 = function14;
                            objM87133R23 = new C36238m(function17, function16, interfaceC28601c15, interfaceC28601c6);
                            c28655q2.m87172p0(objM87133R23);
                        } else {
                            function17 = function14;
                            objM87133R23 = new C36238m(function17, function16, interfaceC28601c15, interfaceC28601c6);
                            c28655q2.m87172p0(objM87133R23);
                        }
                        InterfaceC4339a interfaceC4339a1111111112 = (InterfaceC4339a) objM87133R23;
                        int i31111114 = TextResource.$stable;
                        C28655q c28655q110 = c28655q2;
                        AbstractC21211n.m59497o(null, textResourceM107671d11114, textResourceM107668a11114, textResourceM107669b11114, false, interfaceC39332eM125323a11114, null, null, null, textResourceM107670c11114, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a1111111111, null, interfaceC4339a1111111112, null, null, null, c28655q110, (i31111114 << 3) | (i31111114 << 6) | (i31111114 << 9) | (i31111114 << 27), 0, 384, 247463377);
                        c28655q3 = c28655q110;
                        z13 = false;
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(z13);
                } else {
                    i26 = i26;
                    c28655q3 = c28655q2;
                    interfaceC28601c15 = interfaceC28601c3;
                    c15199y3M3460c = c15199y3M3460c;
                    function17 = function14;
                    c28655q3.m87150e0(-1781986764);
                    c28655q3.m87173q(z13);
                }
                if (m115769M0(interfaceC28601c11)) {
                    c28655q3.m87150e0(-2135689437);
                    c34064dM107693f = c34070j.getHormonalInsightsContraceptionConfirmDialog();
                    if (c34064dM107693f == null) {
                        c28655q3.m87150e0(-1781863106);
                        c28655q3.m87173q(z13);
                        interfaceC28601c15 = interfaceC28601c15;
                        interfaceC28601c16 = interfaceC28601c11;
                    } else {
                        c28655q3.m87150e0(-1781863105);
                        TextResource textResourceM107671d11115 = c34064dM107693f.getTitleDisplay();
                        TextResource textResourceM107668a11115 = c34064dM107693f.getDescriptionDisplay();
                        TextResource textResourceM107669b11115 = c34064dM107693f.getPrimaryButtonTitle();
                        objM87133R18 = c28655q3.m87133R();
                        if (objM87133R18 == c28676v0) {
                            objM87133R18 = g.f155357w;
                            c28655q3.m87172p0(objM87133R18);
                        }
                        InterfaceC39332e interfaceC39332eM125323a11115 = p745y81.Function1.m125323a((Function1) objM87133R18);
                        TextResource textResourceM107670c11115 = c34064dM107693f.getSecondaryButtonTitle();
                        objM87133R19 = c28655q3.m87133R();
                        if (objM87133R19 == c28676v0) {
                            interfaceC28601c16 = interfaceC28601c11;
                            objM87133R19 = new C36269e(2, interfaceC28601c16);
                            c28655q3.m87172p0(objM87133R19);
                        } else {
                            interfaceC28601c16 = interfaceC28601c11;
                        }
                        InterfaceC4339a interfaceC4339a1111111113 = (InterfaceC4339a) objM87133R19;
                        if ((i25 & 7168) == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean z219 = z14;
                        if ((i25 & 112) == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z219 | z15;
                        objM87133R20 = c28655q3.m87133R();
                        if (z16) {
                            objM87133R20 = new C36238m(function17, interfaceC28601c16, interfaceC28601c7, function15);
                            c28655q3.m87172p0(objM87133R20);
                        } else {
                            objM87133R20 = new C36238m(function17, interfaceC28601c16, interfaceC28601c7, function15);
                            c28655q3.m87172p0(objM87133R20);
                        }
                        int i31111115 = TextResource.$stable;
                        AbstractC21211n.m59497o(null, textResourceM107671d11115, textResourceM107668a11115, textResourceM107669b11115, false, interfaceC39332eM125323a11115, null, null, null, textResourceM107670c11115, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a1111111113, null, (InterfaceC4339a) objM87133R20, null, null, null, c28655q3, (i31111115 << 3) | (i31111115 << 6) | (i31111115 << 9) | (i31111115 << 27), 0, 384, 247463377);
                        z13 = false;
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(z13);
                } else {
                    interfaceC28601c15 = interfaceC28601c15;
                    interfaceC28601c16 = interfaceC28601c11;
                    c28655q3.m87150e0(-1781068172);
                    c28655q3.m87173q(z13);
                }
                if (m115775O0(interfaceC28601c14)) {
                    anyModalM107690c = c34070j.getEnablePregnancyInsightsConfirmation();
                } else {
                    anyModalM107690c = null;
                }
                if ((i25 & 896) == 256) {
                    z13 = true;
                }
                objM87133R16 = c28655q3.m87133R();
                if (z13) {
                    objM87133R16 = new C28827b(function16, interfaceC28601c14, 13);
                    c28655q3.m87172p0(objM87133R16);
                } else {
                    objM87133R16 = new C28827b(function16, interfaceC28601c14, 13);
                    c28655q3.m87172p0(objM87133R16);
                }
                InterfaceC28601c1 interfaceC28601c211114 = interfaceC28601c16;
                Function1 function11116 = function17;
                c28676v1 = c28676v0;
                Function1 function11117 = function16;
                InterfaceC28601c1 interfaceC28601c211115 = interfaceC28601c9;
                Function1 function214 = function15;
                interfaceC28601c17 = interfaceC28601c1;
                i27 = 2;
                C15199y3 c15199y17 = c15199y3M3460c;
                AbstractC0564o.m1394P(anyModalM107690c, (Function1) objM87133R16, null, null, null, null, c28655q3, i26, 60);
                c28655q4 = c28655q3;
                enumC36265aM115737B1 = m115737B1(interfaceC28601c17);
                if (enumC36265aM115737B1 == null) {
                    i28 = -1;
                } else {
                    i28 = n0.f155394a[enumC36265aM115737B1.ordinal()];
                }
                modifierM3599a = C2314t.f9131w;
                if (i28 != -1) {
                    if (i28 != 1) {
                        modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "ModeBottomSheetTag");
                    } else if (i28 != 2) {
                        modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "ContraceptionBottomSheetTag");
                    } else if (i28 != 3) {
                        modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "PreviousPregnanciesBottomSheetTag");
                    } else if (i28 != 4) {
                        modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "FertilityInsightsDisableSurveyBottomSheetTag");
                    } else {
                        if (i28 == 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "GoalsBottomSheetTag");
                    }
                }
                Modifier modifier15 = modifierM3599a;
                enumC36265aM115737B2 = m115737B1(interfaceC28601c17);
                if (enumC36265aM115737B2 == null) {
                    i29 = -1;
                } else {
                    i29 = n0.f155394a[enumC36265aM115737B2.ordinal()];
                }
                if (i29 != -1) {
                    c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                } else if (i29 != 1) {
                    c35666g = new C35666g(c34070j.getHormonalInsightsModeBottomSheet().getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, i27, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                } else if (i29 != 2) {
                    textResource = null;
                    objArr = 0;
                    c34063cM107692e = c34070j.getHormonalInsightsContraceptionBottomSheet();
                    if (c34063cM107692e != null) {
                        c35666g = new C35666g(c34063cM107692e.getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, i27, objArr == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                    } else {
                        c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                        c35666g = c35666g2;
                    }
                } else if (i29 != 3) {
                    c34077qM107699l = c34070j.getPreviousPregnancies();
                    if (c34077qM107699l != null) {
                        c35666g = new C35666g(c34077qM107699l.getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, i27, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                    } else {
                        c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                        c35666g = c35666g2;
                    }
                } else if (i29 != 4) {
                    c34063cM107688a = c34070j.getDisableFertilityInsightsSurveyDrawer();
                    if (c34063cM107688a != null) {
                        c35666g = new C35666g(c34063cM107688a.getTitleDisplay(), null, null, null, null, 0.0f, 0.0f, 126, null);
                    } else {
                        c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                        c35666g = c35666g2;
                    }
                } else {
                    if (i29 == 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                }
                AbstractC35664f.a aVar15 = new AbstractC35664f.a(c15199y17);
                objM87133R17 = c28655q4.m87133R();
                if (objM87133R17 == c28676v1) {
                    objM87133R17 = new C36269e(4, interfaceC28601c17);
                    c28655q4.m87172p0(objM87133R17);
                }
                C37816b c37816bM121344e15 = AbstractC37817c.m121344e(409951292, c28655q4, new C29316o(c34070j, interfaceC28601c17, interfaceC28601c6, interfaceC28601c15, interfaceC28601c7, interfaceC28601c211114, function11117, function214, interfaceC28601c12, interfaceC28601c13));
                InterfaceC4339a interfaceC4339a1111111114 = interfaceC4339a4;
                c28655q = c28655q4;
                AbstractC35660d.m112871m(modifier15, c35666g, aVar15, null, (InterfaceC4339a) objM87133R17, null, null, c37816bM121344e15, false, null, null, null, false, null, AbstractC37817c.m121344e(1279555584, c28655q4, new C14076n(c34070j, function11117, function214, interfaceC4339a1111111114, function11116, interfaceC28601c211113, interfaceC28601c1113, interfaceC28601c211115, interfaceC28601c17)), c28655q, (C35666g.f151591h << 3) | 12607488 | (AbstractC35664f.a.f151587c << 6), 24576, 16232);
                interfaceC4339a3 = interfaceC4339a1111111114;
                function8 = function11117;
                function7 = function214;
                function9 = function11116;
            } else {
                c28655q = c28655q5;
                c28655q.m87138X();
                function7 = function4;
                function8 = function5;
                function9 = function6;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35766g((Object) c34070j, function7, function8, function9, (InterfaceC23459e) interfaceC4339a3, i13, i14, 2);
            }
        }
        i34 |= 24576;
        interfaceC4339a2 = interfaceC4339a;
        if ((i34 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q5.m87135U(i34 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i35 != 0) {
                objM87133R30 = c28655q5.m87133R();
                if (objM87133R30 == c28676v0) {
                    objM87133R30 = new C36244s(15);
                    c28655q5.m87172p0(objM87133R30);
                }
                function10 = (Function1) objM87133R30;
            } else {
                function10 = function4;
            }
            if (i15 != 0) {
                objM87133R29 = c28655q5.m87133R();
                if (objM87133R29 == c28676v0) {
                    objM87133R29 = new C36244s(9);
                    c28655q5.m87172p0(objM87133R29);
                }
                function11 = (Function1) objM87133R29;
            } else {
                function11 = function5;
            }
            if (i17 != 0) {
                objM87133R28 = c28655q5.m87133R();
                if (objM87133R28 == c28676v0) {
                    objM87133R28 = new C36244s(10);
                    c28655q5.m87172p0(objM87133R28);
                }
                function12 = (Function1) objM87133R28;
            } else {
                function12 = function6;
            }
            if (i19 != 0) {
                objM87133R27 = c28655q5.m87133R();
                if (objM87133R27 == c28676v0) {
                    objM87133R27 = new C35916a(23);
                    c28655q5.m87172p0(objM87133R27);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R27;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            objM87133R = c28655q5.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q5);
                c28655q5.m87172p0(objM87133R);
            }
            interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            function13 = function11;
            function14 = function12;
            c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q5, 3078, 6);
            if (viewState.getDisableFertilityInsightsSurveyDrawer() != null) {
                enumC36265a = EnumC36265a.FERTILITY_INSIGHTS_DISABLE_SURVEY;
            } else {
                enumC36265a = null;
            }
            objM87133R2 = c28655q5.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(enumC36265a);
                c28655q5.m87172p0(objM87133R2);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            objM87133R3 = c28655q5.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q5.m87172p0(objM87133R3);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
            objM87133R4 = c28655q5.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q5.m87172p0(objM87133R4);
            }
            interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
            objM87133R5 = c28655q5.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q5.m87172p0(objM87133R5);
            }
            interfaceC28601c4 = (InterfaceC28601c1) objM87133R5;
            objM87133R6 = c28655q5.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q5.m87172p0(objM87133R6);
            }
            interfaceC28601c5 = (InterfaceC28601c1) objM87133R6;
            objM87133R7 = c28655q5.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsShowCycleOverlayOn()));
                c28655q5.m87172p0(objM87133R7);
            }
            InterfaceC28601c1 interfaceC28601c1114 = (InterfaceC28601c1) objM87133R7;
            objM87133R8 = c28655q5.m87133R();
            if (objM87133R8 == c28676v0) {
                objM87133R8 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsHormonalInsightsOn()));
                c28655q5.m87172p0(objM87133R8);
            }
            InterfaceC28601c1 interfaceC28601c211116 = (InterfaceC28601c1) objM87133R8;
            objM87133R9 = c28655q5.m87133R();
            if (objM87133R9 == c28676v0) {
                objM87133R9 = AbstractC28683x.m87272z(viewState.getSelectedMode());
                c28655q5.m87172p0(objM87133R9);
            }
            interfaceC28601c6 = (InterfaceC28601c1) objM87133R9;
            objM87133R10 = c28655q5.m87133R();
            if (objM87133R10 == c28676v0) {
                objM87133R10 = AbstractC28683x.m87272z(viewState.getSelectedContraceptionType());
                c28655q5.m87172p0(objM87133R10);
            }
            interfaceC28601c7 = (InterfaceC28601c1) objM87133R10;
            i25 = i34;
            objM87133R11 = c28655q5.m87133R();
            if (objM87133R11 == c28676v0) {
                objM87133R11 = AbstractC28683x.m87272z(null);
                c28655q5.m87172p0(objM87133R11);
            }
            interfaceC28601c8 = (InterfaceC28601c1) objM87133R11;
            objM87133R12 = c28655q5.m87133R();
            if (objM87133R12 == c28676v0) {
                c34066fM107691d = viewState.getGoalsDrawer();
                if (c34066fM107691d != null) {
                    interfaceC28601c9 = interfaceC28601c2;
                    objM74103I1 = C25235a0.f99113w;
                } else {
                    interfaceC28601c9 = interfaceC28601c2;
                    objM74103I1 = C25235a0.f99113w;
                }
                objM87133R12 = AbstractC28683x.m87272z(objM74103I1);
                c28655q5.m87172p0(objM87133R12);
            } else {
                interfaceC28601c9 = interfaceC28601c2;
                interfaceC28601c3 = interfaceC28601c3;
            }
            interfaceC28601c10 = (InterfaceC28601c1) objM87133R12;
            EnumC36265a enumC36265aM115737B18 = m115737B1(interfaceC28601c1);
            zM87157i = c28655q5.m87157i(interfaceC2994c0) | c28655q5.m87157i(c15199y3M3460c);
            objM87133R13 = c28655q5.m87133R();
            if (zM87157i) {
                objM87133R13 = new t(interfaceC2994c0, c15199y3M3460c, interfaceC28601c1, null);
                c28655q5.m87172p0(objM87133R13);
            } else {
                objM87133R13 = new t(interfaceC2994c0, c15199y3M3460c, interfaceC28601c1, null);
                c28655q5.m87172p0(objM87133R13);
            }
            AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R13, enumC36265aM115737B18);
            zM87157i2 = c28655q5.m87157i(c15199y3M3460c) | c28655q5.m87157i(viewState);
            objM87133R14 = c28655q5.m87133R();
            if (zM87157i2) {
                interfaceC28601c11 = interfaceC28601c4;
                u uVar1110 = new u(c15199y3M3460c, viewState, interfaceC28601c1, interfaceC28601c8, interfaceC28601c10, null);
                c15199y3M3460c = c15199y3M3460c;
                viewState = viewState;
                interfaceC28601c12 = interfaceC28601c8;
                interfaceC28601c13 = interfaceC28601c10;
                c28655q5.m87172p0(uVar1110);
                objM87133R14 = uVar1110;
            } else {
                interfaceC28601c11 = interfaceC28601c4;
                u uVar1111 = new u(c15199y3M3460c, viewState, interfaceC28601c1, interfaceC28601c8, interfaceC28601c10, null);
                c15199y3M3460c = c15199y3M3460c;
                viewState = viewState;
                interfaceC28601c12 = interfaceC28601c8;
                interfaceC28601c13 = interfaceC28601c10;
                c28655q5.m87172p0(uVar1111);
                objM87133R14 = uVar1111;
            }
            AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R14, c15199y3M3460c);
            AnyModal anyModalM107690c17 = viewState.getEnablePregnancyInsightsConfirmation();
            zM87157i3 = c28655q5.m87157i(viewState);
            objM87133R15 = c28655q5.m87133R();
            if (zM87157i3) {
                objM87133R15 = new v(viewState, interfaceC28601c5, null);
                c28655q5.m87172p0(objM87133R15);
            } else {
                objM87133R15 = new v(viewState, interfaceC28601c5, null);
                c28655q5.m87172p0(objM87133R15);
            }
            i26 = AnyModal.$stable;
            AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R15, anyModalM107690c17);
            if (m115743D1(interfaceC28601c9)) {
                c28655q5.m87150e0(-2135741304);
                c34064dM107694g = viewState.getHormonalInsightsDisablingConfirmDialog();
                if (c34064dM107694g == null) {
                    c28655q5.m87150e0(-1783470983);
                    c28655q5.m87173q(false);
                    interfaceC28601c1 = interfaceC28601c1;
                    interfaceC28601c14 = interfaceC28601c5;
                    function16 = function13;
                    z13 = false;
                    c28655q2 = c28655q5;
                    function15 = function10;
                } else {
                    c28655q5.m87150e0(-1783470982);
                    TextResource textResourceM107671d11116 = c34064dM107694g.getTitleDisplay();
                    TextResource textResourceM107668a11116 = c34064dM107694g.getDescriptionDisplay();
                    TextResource textResourceM107669b11116 = c34064dM107694g.getPrimaryButtonTitle();
                    objM87133R24 = c28655q5.m87133R();
                    if (objM87133R24 == c28676v0) {
                        objM87133R24 = w.f155428w;
                        c28655q5.m87172p0(objM87133R24);
                    }
                    InterfaceC39332e interfaceC39332eM125323a11116 = p745y81.Function1.m125323a((Function1) objM87133R24);
                    TextResource textResourceM107670c11116 = c34064dM107694g.getSecondaryButtonTitle();
                    objM87133R25 = c28655q5.m87133R();
                    if (objM87133R25 == c28676v0) {
                        interfaceC28601c18 = interfaceC28601c9;
                        objM87133R25 = new C36269e(0, interfaceC28601c18);
                        c28655q5.m87172p0(objM87133R25);
                    } else {
                        interfaceC28601c18 = interfaceC28601c9;
                    }
                    InterfaceC4339a interfaceC4339a1111111115 = (InterfaceC4339a) objM87133R25;
                    if ((i25 & 112) == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objM87133R26 = c28655q5.m87133R();
                    if (z24) {
                        objM87133R26 = new C25504c(interfaceC28601c18, interfaceC28601c6, function10);
                        c28655q5.m87172p0(objM87133R26);
                    } else {
                        objM87133R26 = new C25504c(interfaceC28601c18, interfaceC28601c6, function10);
                        c28655q5.m87172p0(objM87133R26);
                    }
                    InterfaceC4339a interfaceC4339a1111111116 = (InterfaceC4339a) objM87133R26;
                    int i31111116 = TextResource.$stable;
                    int i31111117 = (i31111116 << 3) | (i31111116 << 6) | (i31111116 << 9) | (i31111116 << 27);
                    interfaceC28601c9 = interfaceC28601c18;
                    interfaceC28601c14 = interfaceC28601c5;
                    function15 = function10;
                    function16 = function13;
                    AbstractC21211n.m59497o(null, textResourceM107671d11116, textResourceM107668a11116, textResourceM107669b11116, false, interfaceC39332eM125323a11116, null, null, null, textResourceM107670c11116, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a1111111115, null, interfaceC4339a1111111116, null, null, null, c28655q5, i31111117, 0, 384, 247463377);
                    c28655q2 = c28655q5;
                    z13 = false;
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(z13);
            } else {
                interfaceC28601c1 = interfaceC28601c1;
                interfaceC28601c14 = interfaceC28601c5;
                c28676v0 = c28676v0;
                function15 = function10;
                function16 = function13;
                z13 = false;
                c28655q2 = c28655q5;
                c28655q2.m87150e0(-1782794252);
                c28655q2.m87173q(false);
            }
            if (m115763K0(interfaceC28601c3)) {
                c28655q2.m87150e0(-2135716155);
                c34064dM107696i = c34070j.getHormonalInsightsModeConfirmDialog();
                if (c34064dM107696i == null) {
                    c28655q2.m87150e0(-1782691364);
                    c28655q2.m87173q(z13);
                    i26 = i26;
                    c28655q3 = c28655q2;
                    interfaceC28601c15 = interfaceC28601c3;
                    function17 = function14;
                } else {
                    c28655q2.m87150e0(-1782691363);
                    TextResource textResourceM107671d11117 = c34064dM107696i.getTitleDisplay();
                    TextResource textResourceM107668a11117 = c34064dM107696i.getDescriptionDisplay();
                    TextResource textResourceM107669b11117 = c34064dM107696i.getPrimaryButtonTitle();
                    objM87133R21 = c28655q2.m87133R();
                    if (objM87133R21 == c28676v0) {
                        objM87133R21 = x.f155429w;
                        c28655q2.m87172p0(objM87133R21);
                    }
                    InterfaceC39332e interfaceC39332eM125323a11117 = p745y81.Function1.m125323a((Function1) objM87133R21);
                    TextResource textResourceM107670c11117 = c34064dM107696i.getSecondaryButtonTitle();
                    objM87133R22 = c28655q2.m87133R();
                    if (objM87133R22 == c28676v0) {
                        interfaceC28601c15 = interfaceC28601c3;
                        objM87133R22 = new C36269e(1, interfaceC28601c15);
                        c28655q2.m87172p0(objM87133R22);
                    } else {
                        interfaceC28601c15 = interfaceC28601c3;
                    }
                    InterfaceC4339a interfaceC4339a1111111117 = (InterfaceC4339a) objM87133R22;
                    if ((i25 & 7168) == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if ((i25 & 896) == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | z17;
                    objM87133R23 = c28655q2.m87133R();
                    if (z19) {
                        function17 = function14;
                        objM87133R23 = new C36238m(function17, function16, interfaceC28601c15, interfaceC28601c6);
                        c28655q2.m87172p0(objM87133R23);
                    } else {
                        function17 = function14;
                        objM87133R23 = new C36238m(function17, function16, interfaceC28601c15, interfaceC28601c6);
                        c28655q2.m87172p0(objM87133R23);
                    }
                    InterfaceC4339a interfaceC4339a1111111118 = (InterfaceC4339a) objM87133R23;
                    int i31111118 = TextResource.$stable;
                    C28655q c28655q111 = c28655q2;
                    AbstractC21211n.m59497o(null, textResourceM107671d11117, textResourceM107668a11117, textResourceM107669b11117, false, interfaceC39332eM125323a11117, null, null, null, textResourceM107670c11117, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a1111111117, null, interfaceC4339a1111111118, null, null, null, c28655q111, (i31111118 << 3) | (i31111118 << 6) | (i31111118 << 9) | (i31111118 << 27), 0, 384, 247463377);
                    c28655q3 = c28655q111;
                    z13 = false;
                    c28655q3.m87173q(false);
                }
                c28655q3.m87173q(z13);
            } else {
                i26 = i26;
                c28655q3 = c28655q2;
                interfaceC28601c15 = interfaceC28601c3;
                c15199y3M3460c = c15199y3M3460c;
                function17 = function14;
                c28655q3.m87150e0(-1781986764);
                c28655q3.m87173q(z13);
            }
            if (m115769M0(interfaceC28601c11)) {
                c28655q3.m87150e0(-2135689437);
                c34064dM107693f = c34070j.getHormonalInsightsContraceptionConfirmDialog();
                if (c34064dM107693f == null) {
                    c28655q3.m87150e0(-1781863106);
                    c28655q3.m87173q(z13);
                    interfaceC28601c15 = interfaceC28601c15;
                    interfaceC28601c16 = interfaceC28601c11;
                } else {
                    c28655q3.m87150e0(-1781863105);
                    TextResource textResourceM107671d11118 = c34064dM107693f.getTitleDisplay();
                    TextResource textResourceM107668a11118 = c34064dM107693f.getDescriptionDisplay();
                    TextResource textResourceM107669b11118 = c34064dM107693f.getPrimaryButtonTitle();
                    objM87133R18 = c28655q3.m87133R();
                    if (objM87133R18 == c28676v0) {
                        objM87133R18 = g.f155357w;
                        c28655q3.m87172p0(objM87133R18);
                    }
                    InterfaceC39332e interfaceC39332eM125323a11118 = p745y81.Function1.m125323a((Function1) objM87133R18);
                    TextResource textResourceM107670c11118 = c34064dM107693f.getSecondaryButtonTitle();
                    objM87133R19 = c28655q3.m87133R();
                    if (objM87133R19 == c28676v0) {
                        interfaceC28601c16 = interfaceC28601c11;
                        objM87133R19 = new C36269e(2, interfaceC28601c16);
                        c28655q3.m87172p0(objM87133R19);
                    } else {
                        interfaceC28601c16 = interfaceC28601c11;
                    }
                    InterfaceC4339a interfaceC4339a1111111119 = (InterfaceC4339a) objM87133R19;
                    if ((i25 & 7168) == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z2110 = z14;
                    if ((i25 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z2110 | z15;
                    objM87133R20 = c28655q3.m87133R();
                    if (z16) {
                        objM87133R20 = new C36238m(function17, interfaceC28601c16, interfaceC28601c7, function15);
                        c28655q3.m87172p0(objM87133R20);
                    } else {
                        objM87133R20 = new C36238m(function17, interfaceC28601c16, interfaceC28601c7, function15);
                        c28655q3.m87172p0(objM87133R20);
                    }
                    int i31111119 = TextResource.$stable;
                    AbstractC21211n.m59497o(null, textResourceM107671d11118, textResourceM107668a11118, textResourceM107669b11118, false, interfaceC39332eM125323a11118, null, null, null, textResourceM107670c11118, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a1111111119, null, (InterfaceC4339a) objM87133R20, null, null, null, c28655q3, (i31111119 << 3) | (i31111119 << 6) | (i31111119 << 9) | (i31111119 << 27), 0, 384, 247463377);
                    z13 = false;
                    c28655q3.m87173q(false);
                }
                c28655q3.m87173q(z13);
            } else {
                interfaceC28601c15 = interfaceC28601c15;
                interfaceC28601c16 = interfaceC28601c11;
                c28655q3.m87150e0(-1781068172);
                c28655q3.m87173q(z13);
            }
            if (m115775O0(interfaceC28601c14)) {
                anyModalM107690c = c34070j.getEnablePregnancyInsightsConfirmation();
            } else {
                anyModalM107690c = null;
            }
            if ((i25 & 896) == 256) {
                z13 = true;
            }
            objM87133R16 = c28655q3.m87133R();
            if (z13) {
                objM87133R16 = new C28827b(function16, interfaceC28601c14, 13);
                c28655q3.m87172p0(objM87133R16);
            } else {
                objM87133R16 = new C28827b(function16, interfaceC28601c14, 13);
                c28655q3.m87172p0(objM87133R16);
            }
            InterfaceC28601c1 interfaceC28601c211117 = interfaceC28601c16;
            Function1 function11118 = function17;
            c28676v1 = c28676v0;
            Function1 function11119 = function16;
            InterfaceC28601c1 interfaceC28601c211118 = interfaceC28601c9;
            Function1 function215 = function15;
            interfaceC28601c17 = interfaceC28601c1;
            i27 = 2;
            C15199y3 c15199y18 = c15199y3M3460c;
            AbstractC0564o.m1394P(anyModalM107690c, (Function1) objM87133R16, null, null, null, null, c28655q3, i26, 60);
            c28655q4 = c28655q3;
            enumC36265aM115737B1 = m115737B1(interfaceC28601c17);
            if (enumC36265aM115737B1 == null) {
                i28 = -1;
            } else {
                i28 = n0.f155394a[enumC36265aM115737B1.ordinal()];
            }
            modifierM3599a = C2314t.f9131w;
            if (i28 != -1) {
                if (i28 != 1) {
                    modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "ModeBottomSheetTag");
                } else if (i28 != 2) {
                    modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "ContraceptionBottomSheetTag");
                } else if (i28 != 3) {
                    modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "PreviousPregnanciesBottomSheetTag");
                } else if (i28 != 4) {
                    modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "FertilityInsightsDisableSurveyBottomSheetTag");
                } else {
                    if (i28 == 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, "GoalsBottomSheetTag");
                }
            }
            Modifier modifier16 = modifierM3599a;
            enumC36265aM115737B2 = m115737B1(interfaceC28601c17);
            if (enumC36265aM115737B2 == null) {
                i29 = -1;
            } else {
                i29 = n0.f155394a[enumC36265aM115737B2.ordinal()];
            }
            if (i29 != -1) {
                c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
            } else if (i29 != 1) {
                c35666g = new C35666g(c34070j.getHormonalInsightsModeBottomSheet().getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, i27, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
            } else if (i29 != 2) {
                textResource = null;
                objArr = 0;
                c34063cM107692e = c34070j.getHormonalInsightsContraceptionBottomSheet();
                if (c34063cM107692e != null) {
                    c35666g = new C35666g(c34063cM107692e.getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, i27, objArr == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                } else {
                    c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                    c35666g = c35666g2;
                }
            } else if (i29 != 3) {
                c34077qM107699l = c34070j.getPreviousPregnancies();
                if (c34077qM107699l != null) {
                    c35666g = new C35666g(c34077qM107699l.getTitleDisplay(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, i27, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                } else {
                    c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                    c35666g = c35666g2;
                }
            } else if (i29 != 4) {
                c34063cM107688a = c34070j.getDisableFertilityInsightsSurveyDrawer();
                if (c34063cM107688a != null) {
                    c35666g = new C35666g(c34063cM107688a.getTitleDisplay(), null, null, null, null, 0.0f, 0.0f, 126, null);
                } else {
                    c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                    c35666g = c35666g2;
                }
            } else {
                if (i29 == 5) {
                    throw new NoWhenBranchMatchedException();
                }
                c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
            }
            AbstractC35664f.a aVar16 = new AbstractC35664f.a(c15199y18);
            objM87133R17 = c28655q4.m87133R();
            if (objM87133R17 == c28676v1) {
                objM87133R17 = new C36269e(4, interfaceC28601c17);
                c28655q4.m87172p0(objM87133R17);
            }
            C37816b c37816bM121344e16 = AbstractC37817c.m121344e(409951292, c28655q4, new C29316o(c34070j, interfaceC28601c17, interfaceC28601c6, interfaceC28601c15, interfaceC28601c7, interfaceC28601c211117, function11119, function215, interfaceC28601c12, interfaceC28601c13));
            InterfaceC4339a interfaceC4339a11111111110 = interfaceC4339a4;
            c28655q = c28655q4;
            AbstractC35660d.m112871m(modifier16, c35666g, aVar16, null, (InterfaceC4339a) objM87133R17, null, null, c37816bM121344e16, false, null, null, null, false, null, AbstractC37817c.m121344e(1279555584, c28655q4, new C14076n(c34070j, function11119, function215, interfaceC4339a11111111110, function11118, interfaceC28601c211116, interfaceC28601c1114, interfaceC28601c211118, interfaceC28601c17)), c28655q, (C35666g.f151591h << 3) | 12607488 | (AbstractC35664f.a.f151587c << 6), 24576, 16232);
            interfaceC4339a3 = interfaceC4339a11111111110;
            function8 = function11119;
            function7 = function215;
            function9 = function11118;
        } else {
            c28655q = c28655q5;
            c28655q.m87138X();
            function7 = function4;
            function8 = function5;
            function9 = function6;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35766g((Object) c34070j, function7, function8, function9, (InterfaceC23459e) interfaceC4339a3, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H1 */
    public static final C23454a0 m115755H1(Function1 function1, C34069i c34069i, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(c34069i.getCtaUrl());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final C23454a0 m115757I0(AbstractC34073m it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I1 */
    public static final C23454a0 m115758I1(C34069i c34069i, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m115749F1(c34069i, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final C23454a0 m115760J0(AbstractC32871a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J1 */
    public static final void m115761J1(C34072l c34072l, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(265732188);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(c34072l) : c28655q.m87157i(c34072l) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(interfaceC4339a2) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C35916a(24);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC4339a = (InterfaceC4339a) objM87133R;
            }
            if (i17 != 0) {
                Object objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C35916a(25);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
            }
            C2314t c2314t = C2314t.f9131w;
            AbstractC18489d0.m53380u(3, 4, c2314t, c28655q);
            AbstractC12889b.m36263b(AbstractC1102d.m3409f(1.0f, c2314t), C22411w.f87680a.m64535a().m64090c(), C17919x.m51541c(0.1f, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getRecovery()), null, 0, AbstractC37817c.m121344e(1339342719, c28655q, new C36100c(c34072l, interfaceC4339a, interfaceC4339a2, 1)), c28655q, 1769478, 24);
        } else {
            c28655q.m87138X();
        }
        InterfaceC4339a interfaceC4339a3 = interfaceC4339a;
        InterfaceC4339a interfaceC4339a4 = interfaceC4339a2;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35608d(c34072l, interfaceC4339a3, interfaceC4339a4, i13, i14, 15);
        }
    }

    /* JADX INFO: renamed from: K0 */
    private static final boolean m115763K0(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K1 */
    public static final C23454a0 m115764K1() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: L0 */
    private static final void m115766L0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L1 */
    public static final C23454a0 m115767L1() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: M0 */
    private static final boolean m115769M0(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    /* JADX INFO: renamed from: M1 */
    public static final C23454a0 m115770M1(C34072l c34072l, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Composer composer, int i13) throws XmlPullParserException, IOException {
        C0209i c0209i;
        int i14;
        boolean z4;
        boolean z13;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3427x = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t), null, 3);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            boolean zM107713f = c34072l.getDismissable();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM107713f) {
                c28655q.m87150e0(-96580385);
                C38072d c38072d = C38072d.f163053a;
                C27430e c27430eM107874S = AbstractC34132o.m107874S(c38072d.m121951d().getAction().getCross(), c28655q, 6);
                long jM125382b1 = c38072d.m121949b(c28655q, C38072d.f163054b).getWhite50();
                float f13 = 1 * 8;
                Modifier modifierM3398t = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(AbstractC1102d.m3419p(((float) 5.5d) * 4, c2314t), C2299e.f9116y), 0.0f, f13, f13, 0.0f, 9);
                boolean zM87153g = c28655q.m87153g(interfaceC4339a);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = new C36271g(interfaceC4339a, 1);
                    c28655q.m87172p0(objM87133R);
                }
                c0209i = c0209i3;
                i14 = 8;
                AbstractC15005f3.m43108b(c27430eM107874S, null, AbstractC1092a.m3362g(modifierM3398t, false, null, null, (InterfaceC4339a) objM87133R, 15), jM125382b1, c28655q, 48, 0);
                c28655q.m87173q(false);
            } else {
                c0209i = c0209i3;
                i14 = 8;
                c28655q.m87150e0(-96107139);
                c28655q.m87173q(false);
            }
            float f14 = 2;
            Modifier modifierM3394p = AbstractC1099a.m3394p(i14 * f14, c2314t);
            float f15 = 4;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(3 * f15), C2299e.f9110M, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C2306l c2306l = C2299e.f9108K;
            float f16 = f14 * f15;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f16), c2306l, c28655q, 54);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            C27430e c27430eM107874S2 = AbstractC34132o.m107874S(c34072l.getIcon().toWhoopIcon(), c28655q, 6);
            C38072d c38072d2 = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC15005f3.m43108b(c27430eM107874S2, null, null, c38072d2.m121949b(c28655q, i15).getRecovery(), c28655q, 48, 4);
            TextResource textResourceM107712e = c34072l.getDescriptionDisplay();
            int i16 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM107712e, c28655q, i16);
            C2886a c2886aM8421b = c38072d2.m121952e(c28655q, i15).getB2();
            long jM125371X = c38072d2.m121949b(c28655q, i15).getRecovery();
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jM125371X, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8421b, null, c28655q, 0, i17, 196602);
            C28655q c28655q2 = c28655q;
            c28655q2.m87173q(true);
            if (c34072l.getCtaTextDisplay() == null) {
                c28655q2.m87150e0(-126926625);
                c28655q2.m87173q(false);
                z13 = true;
            } else {
                c28655q2.m87150e0(-126926624);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                boolean zM87153g2 = c28655q2.m87153g(interfaceC4339a2);
                Object objM87133R2 = c28655q2.m87133R();
                if (zM87153g2 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C36271g(interfaceC4339a2, 2);
                    c28655q2.m87172p0(objM87133R2);
                }
                Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3409f2, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f16), c2306l, c28655q2, 54);
                int iHashCode4 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC28653p1M87165m4);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode4))) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N4);
                float f17 = f15 * f15;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f17, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c34072l.getCtaTextDisplay(), c28655q2, i16), null, c38072d2.m121949b(c28655q2, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i15).getBtS(), null, c28655q2, 0, i17, 196602);
                c28655q2 = c28655q2;
                if (c34072l.getCtaIcon() == null) {
                    c28655q2.m87150e0(-240295791);
                    z4 = false;
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-240295790);
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c34072l.getCtaIcon().toWhoopIcon(), c28655q2, 6), null, AbstractC1102d.m3419p(f17, c2314t), c38072d2.m121949b(c28655q2, i15).getBrandWhite(), c28655q2, 432, 0);
                    z4 = false;
                    c28655q2.m87173q(false);
                }
                z13 = true;
                c28655q2.m87173q(true);
                c28655q2.m87173q(z4);
            }
            c28655q2.m87173q(z13);
            c28655q2.m87173q(z13);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: N0 */
    private static final void m115772N0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N1 */
    public static final C23454a0 m115773N1(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: O0 */
    private static final boolean m115775O0(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O1 */
    public static final C23454a0 m115776O1(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final void m115778P0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P1 */
    public static final C23454a0 m115779P1(C34072l c34072l, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, int i14, Composer composer, int i15) {
        m115761J1(c34072l, interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final C23454a0 m115781Q0(AbstractC39672a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public static final boolean m115784R0(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final boolean m115787S0(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final String m115790T0(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final void m115793U0(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final String m115796V0(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public static final void m115799W0(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final C23454a0 m115802X0() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final String m115805Y0(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final void m115808Z0(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: a1 */
    private static final Set<String> m115812a1(InterfaceC28601c1 interfaceC28601c1) {
        return (Set) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final void m115816b1(InterfaceC28601c1 interfaceC28601c1, Set<String> set) {
        interfaceC28601c1.setValue(set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public static final C23454a0 m115820c1(InterfaceC28601c1 interfaceC28601c1) {
        m115746E1(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final C23454a0 m115824d1(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, Function1 function1) {
        m115746E1(interfaceC28601c1, false);
        String strM115790T0 = m115790T0(interfaceC28601c2);
        if (strM115790T0 != null) {
            function1.invoke(new AbstractC34073m.e(strM115790T0));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public static final C23454a0 m115828e1(InterfaceC28601c1 interfaceC28601c1) {
        m115766L0(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public static final C23454a0 m115832f1(Function1 function1, Function1 function2, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        m115766L0(interfaceC28601c1, false);
        function1.invoke(new AbstractC39672a.r(m115790T0(interfaceC28601c2)));
        function2.invoke(new AbstractC32871a.c(m115790T0(interfaceC28601c2)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x008f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: g0 */
    public static final void m115835g0(C34062b c34062b, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        InterfaceC4339a interfaceC4339a2;
        boolean z14;
        boolean z15;
        C28677v1 c28677v1M87180u;
        boolean z16;
        long jM95628d;
        int i16;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1818011342);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(c34062b) : c28655q.m87157i(c34062b) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a2)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i15 |= i16;
            } else {
                interfaceC4339a2 = interfaceC4339a;
            }
            if ((i15 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i17 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                Modifier modifierM3362g = AbstractC1092a.m3362g(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), false, null, null, interfaceC4339a2, 15);
                float f13 = 4;
                C33252i c33252iM105489e = AbstractC33253j.m105489e(3 * f13);
                float f14 = 0 * f13;
                if (z16) {
                    c28655q.m87150e0(-942777571);
                    jM95628d = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getSleepLightSleep();
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-942776331);
                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                }
                AbstractC12889b.m36263b(modifierM3362g, c33252iM105489e, jM95628d, null, f14, AbstractC37817c.m121344e(1303773169, c28655q, new C2626t2(c34062b, z16, 10)), c28655q, 1769472, 24);
                z15 = z16;
            } else {
                c28655q.m87138X();
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32676t1(c34062b, z15, interfaceC4339a, i13, i14, 3);
            }
        }
        i15 |= 48;
        z13 = z4;
        if ((i13 & 384) == 0) {
            interfaceC4339a2 = interfaceC4339a;
            if (c28655q.m87157i(interfaceC4339a2)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i15 |= i16;
        } else {
            interfaceC4339a2 = interfaceC4339a;
        }
        if ((i15 & 147) != 146) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            if (i17 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            Modifier modifierM3362g2 = AbstractC1092a.m3362g(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), false, null, null, interfaceC4339a2, 15);
            float f15 = 4;
            C33252i c33252iM105489e2 = AbstractC33253j.m105489e(3 * f15);
            float f16 = 0 * f15;
            if (z16) {
                c28655q.m87150e0(-942777571);
                jM95628d = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getSleepLightSleep();
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-942776331);
                jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            }
            AbstractC12889b.m36263b(modifierM3362g2, c33252iM105489e2, jM95628d, null, f16, AbstractC37817c.m121344e(1303773169, c28655q, new C2626t2(c34062b, z16, 10)), c28655q, 1769472, 24);
            z15 = z16;
        } else {
            c28655q.m87138X();
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32676t1(c34062b, z15, interfaceC4339a, i13, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public static final C23454a0 m115836g1(InterfaceC28601c1 interfaceC28601c1) {
        m115772N0(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C23454a0 m115839h0(C34062b c34062b, boolean z4, Composer composer, int i13) throws XmlPullParserException, IOException {
        long jM53358D;
        C0209i c0209i;
        int i14;
        long jM95624D;
        long jM95627c;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 2;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(8 * f13, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            if (c34062b.getIcon() == null) {
                c28655q.m87150e0(-2047270804);
                c28655q.m87173q(false);
                c0209i = c0209i4;
                i14 = 4;
            } else {
                c28655q.m87150e0(-2047270803);
                C27430e c27430eM107874S = AbstractC34132o.m107874S(c34062b.getIcon().toWhoopIcon(), c28655q, 6);
                Modifier modifierM3419p = AbstractC1102d.m3419p(6 * 4, c2314t);
                if (z4) {
                    c28655q.m87150e0(1569582032);
                    jM53358D = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBlack50();
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1569583024);
                    jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                }
                c0209i = c0209i4;
                i14 = 4;
                AbstractC15005f3.m43108b(c27430eM107874S, null, modifierM3419p, jM53358D, c28655q, 432, 0);
                c28655q.m87173q(false);
            }
            AbstractC18489d0.m53380u(f13, i14, c2314t, c28655q);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
            TextResource textResourceM107663c = c34062b.getTitleDisplay();
            int i15 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM107663c, c28655q, i15);
            if (z4) {
                c28655q.m87150e0(1330098389);
                jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            } else {
                c28655q.m87150e0(1330099477);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            }
            long j7 = jM95624D;
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            C2886a c2886aM8414L = c38072d.m121952e(c28655q, i16).getSh4();
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8414L, null, c28655q, 0, i17, 196602);
            C28655q c28655q2 = c28655q;
            if (c34062b.getDescriptionDisplay() == null) {
                c28655q2.m87150e0(-1716449858);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-1716449857);
                String strM21274h2 = AbstractC8693b.m21274h(c34062b.getDescriptionDisplay(), c28655q2, i15);
                if (z4) {
                    c28655q2.m87150e0(-523588578);
                    jM95627c = c38072d.m121949b(c28655q2, i16).getBlack50();
                } else {
                    jM95627c = AbstractC31061c.m95627c(c28655q2, -523587586, c38072d, c28655q2, i16);
                }
                c28655q2.m87173q(false);
                AbstractC30795n.m94707h(strM21274h2, null, jM95627c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i16).getB1(), null, c28655q2, 0, i17, 196602);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            c28655q2.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public static final C23454a0 m115840h1(Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, Function1 function2) {
        m115772N0(interfaceC28601c1, false);
        function1.invoke(new AbstractC39672a.q(m115796V0(interfaceC28601c2)));
        String strM115796V0 = m115796V0(interfaceC28601c2);
        if (strM115796V0 != null) {
            function2.invoke(new AbstractC34073m.f(strM115796V0));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23454a0 m115843i0(C34062b c34062b, boolean z4, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m115835g0(c34062b, z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public static final C23454a0 m115844i1(Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC0569t modalEvent) {
        AbstractC22676k.m65750j(modalEvent, "modalEvent");
        if (modalEvent instanceof InterfaceC0569t.a) {
            m115778P0(interfaceC28601c1, false);
        } else if (modalEvent instanceof InterfaceC0569t.c) {
            function1.invoke(new AbstractC32871a.e(((InterfaceC0569t.c) modalEvent).getDestination()));
        } else if (modalEvent instanceof InterfaceC0569t.b) {
            Object objM1469b = ((InterfaceC0569t.b) modalEvent).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
            C9598e c9598e = objM1469b instanceof C9598e ? (C9598e) objM1469b : null;
            m115778P0(interfaceC28601c1, false);
            if (c9598e != null && !AbstractC22676k.m65745e(c9598e.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w)) {
                function1.invoke(new AbstractC32871a.e(c9598e));
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    /* JADX INFO: renamed from: j0 */
    public static final void m115847j0(C32816h c32816h, C34061a c34061a, boolean z4, Function1 function1, Composer composer, int i13) {
        int i14;
        C34061a c34061a2 = c34061a;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-476088987);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c32816h) : c28655q.m87157i(c32816h) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(c34061a2) : c28655q.m87157i(c34061a2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(function1) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i15 = 1;
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Calendar calendar = Calendar.getInstance();
            C23471q c23471qM107657a = c34061a2.getCalendarDialogStartDate();
            int iIntValue = ((Number) c23471qM107657a.f92947w).intValue();
            int iIntValue2 = ((Number) c23471qM107657a.f92948x).intValue();
            int iIntValue3 = ((Number) c23471qM107657a.f92949y).intValue();
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            float f13 = z4 ? 1.0f : 0.2f;
            Context contextM85322a = AbstractC28193q0.m85322a(context);
            int i16 = AbstractC38481d.f164879d;
            boolean zM87157i = ((i14 & 7168) == 2048) | c28655q.m87157i(calendar) | c28655q.m87157i(simpleDateFormat);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C11697m(calendar, simpleDateFormat, function1, i15);
                c28655q.m87172p0(objM87133R);
            }
            DatePickerDialog datePickerDialog = new DatePickerDialog(contextM85322a, i16, (DatePickerDialog.OnDateSetListener) objM87133R, iIntValue, iIntValue2, iIntValue3);
            DatePicker datePicker = datePickerDialog.getDatePicker();
            c34061a2.getMinDate();
            datePicker.setMinDate(simpleDateFormat.parse(c34061a2.getMinDate()).getTime());
            datePicker.setMaxDate(simpleDateFormat.parse(c34061a2.getMaxDate()).getTime());
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            String strM21274h = AbstractC8693b.m21274h(c32816h.getTitleDisplay(), c28655q, TextResource.$stable);
            Modifier modifierM107879c = AbstractC34132o.m107879c(f13, c2314t);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            float f14 = f13;
            AbstractC30795n.m94707h(strM21274h, modifierM107879c, c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB1(), null, c28655q, 0, C2886a.f11498d << 18, 196600);
            C22976l1 c22976l1 = AbstractC15166v0.f56891a;
            C15077m1 c15077m1M43196a = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q, i17).getWhite10(), 0L, 0L, 0L, c28655q, 0, 14);
            Modifier modifierM118994r = AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(3 * 4));
            boolean zM87157i2 = ((i14 & 896) == 256) | c28655q.m87157i(datePickerDialog);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C19072b(z4, datePickerDialog, 6);
                c28655q.m87172p0(objM87133R2);
            }
            c34061a2 = c34061a;
            AbstractC12350b.m34578a((InterfaceC4339a) objM87133R2, modifierM118994r, false, null, null, null, c15077m1M43196a, null, AbstractC37817c.m121344e(-526683463, c28655q, new C28749b(c34061a2, f14, 1)), c28655q, 805330944, 364);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31755w(i13, 8, c32816h, c34061a2, function1, z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public static final C23454a0 m115848j1(InterfaceC28601c1 interfaceC28601c1) {
        m115740C1(interfaceC28601c1, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final void m115851k0(Calendar calendar, SimpleDateFormat simpleDateFormat, Function1 function1, DatePicker datePicker, int i13, int i14, int i15) {
        AbstractC22676k.m65750j(datePicker, "<unused var>");
        calendar.set(i13, i14, i15);
        String str = simpleDateFormat.format(calendar.getTime());
        AbstractC22676k.m65747g(str);
        function1.invoke(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public static final C23454a0 m115852k1(C34070j c34070j, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, InterfaceC28601c1 interfaceC28601c5, Function1 function1, Function1 function2, InterfaceC28601c1 interfaceC28601c6, InterfaceC28601c1 interfaceC28601c7, InterfaceC23013y BottomSheet, Composer composer, int i13) {
        C2305k c2305k = C2299e.f9111N;
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            EnumC36265a enumC36265aM115737B1 = m115737B1(interfaceC28601c1);
            int i14 = enumC36265aM115737B1 == null ? -1 : n0.f155394a[enumC36265aM115737B1.ordinal()];
            if (i14 != -1) {
                C2314t c2314t = C2314t.f9131w;
                C28676v0 c28676v0 = C28635l.f115821a;
                if (i14 == 1) {
                    c28655q.m87150e0(-2027919216);
                    Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * 8, 7);
                    C22971k c22971kM66746i = AbstractC22977m.m66746i(3 * 4);
                    boolean zM87157i = c28655q.m87157i(c34070j);
                    Object objM87133R = c28655q.m87133R();
                    if (zM87157i || objM87133R == c28676v0) {
                        objM87133R = new C31915d(c34070j, interfaceC28601c2, interfaceC28601c3, interfaceC28601c1, 18);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC22674j.m65717c(modifierM3398t, null, null, c22971kM66746i, c2305k, null, false, null, (Function1) objM87133R, c28655q, 221190, 462);
                    c28655q.m87173q(false);
                } else if (i14 == 2) {
                    c28655q.m87150e0(-2026181635);
                    C34063c c34063cM107692e = c34070j.getHormonalInsightsContraceptionBottomSheet();
                    if (c34063cM107692e == null) {
                        c28655q.m87150e0(-2026181636);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-2026181635);
                        Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * 8, 7), "ContraceptionBottomSheetContentTag");
                        C22971k c22971kM66746i2 = AbstractC22977m.m66746i(3 * 4);
                        boolean zM87157i2 = c28655q.m87157i(c34063cM107692e);
                        Object objM87133R2 = c28655q.m87133R();
                        if (zM87157i2 || objM87133R2 == c28676v0) {
                            objM87133R2 = new C31915d(c34063cM107692e, interfaceC28601c4, interfaceC28601c5, interfaceC28601c1, 19);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC22674j.m65717c(modifierM3599a, null, null, c22971kM66746i2, c2305k, null, false, null, (Function1) objM87133R2, c28655q, 221190, 462);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                } else if (i14 == 3) {
                    c28655q.m87150e0(-2024283412);
                    C34077q c34077qM107699l = c34070j.getPreviousPregnancies();
                    if (c34077qM107699l == null) {
                        c28655q.m87150e0(-2024283413);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-2024283412);
                        Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * 8, 7);
                        C22971k c22971kM66746i3 = AbstractC22977m.m66746i(3 * 4);
                        boolean zM87157i3 = c28655q.m87157i(c34077qM107699l) | c28655q.m87153g(function1);
                        Object objM87133R3 = c28655q.m87133R();
                        if (zM87157i3 || objM87133R3 == c28676v0) {
                            objM87133R3 = new C35076b(10, c34077qM107699l, function1);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC22674j.m65717c(modifierM3398t2, null, null, c22971kM66746i3, c2305k, null, false, null, (Function1) objM87133R3, c28655q, 221190, 462);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                } else if (i14 == 4) {
                    c28655q.m87150e0(-2022821762);
                    C34063c c34063cM107688a = c34070j.getDisableFertilityInsightsSurveyDrawer();
                    if (c34063cM107688a == null) {
                        c28655q.m87150e0(-2022821763);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-2022821762);
                        Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * 8, 7);
                        C22971k c22971kM66746i4 = AbstractC22977m.m66746i(3 * 4);
                        boolean zM87157i4 = c28655q.m87157i(c34063cM107688a) | c28655q.m87153g(function2);
                        Object objM87133R4 = c28655q.m87133R();
                        if (zM87157i4 || objM87133R4 == c28676v0) {
                            C31915d c31915d = new C31915d(c34063cM107688a, interfaceC28601c6, function2, interfaceC28601c1, 20);
                            c28655q.m87172p0(c31915d);
                            objM87133R4 = c31915d;
                        }
                        AbstractC22674j.m65717c(modifierM3398t3, null, null, c22971kM66746i4, c2305k, null, false, null, (Function1) objM87133R4, c28655q, 221190, 462);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                } else {
                    if (i14 != 5) {
                        throw AbstractC11895b.m32003v(-1173791357, c28655q, false);
                    }
                    c28655q.m87150e0(-2021146398);
                    C34066f c34066fM107691d = c34070j.getGoalsDrawer();
                    if (c34066fM107691d == null) {
                        c28655q.m87150e0(-2021146399);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-2021146398);
                        Set<String> setM115812a1 = m115812a1(interfaceC28601c7);
                        Object objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C36267c(interfaceC28601c7, 2);
                            c28655q.m87172p0(objM87133R5);
                        }
                        Function1 function3 = (Function1) objM87133R5;
                        boolean zM87153g = c28655q.m87153g(function2);
                        Object objM87133R6 = c28655q.m87133R();
                        if (zM87153g || objM87133R6 == c28676v0) {
                            objM87133R6 = new C25504c(function2, interfaceC28601c7, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R6);
                        }
                        AbstractC36268d.m115728g(c34066fM107691d, setM115812a1, function3, (InterfaceC4339a) objM87133R6, c28655q, 384);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                }
            } else {
                c28655q.m87150e0(-2020300253);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final C23454a0 m115855l0(boolean z4, DatePickerDialog datePickerDialog) {
        if (z4) {
            datePickerDialog.show();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public static final C23454a0 m115856l1(C34070j c34070j, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        List<C34062b> listM107665a = c34070j.getHormonalInsightsModeBottomSheet().m107665a();
        y yVar = y.f155430w;
        ((C26053f) LazyColumn).m77529r(listM107665a.size(), null, new z(yVar, listM107665a), new C37816b(new a0(listM107665a, interfaceC28601c1), true, 802480018));
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C2026r(c34070j, interfaceC28601c1, interfaceC28601c2, interfaceC28601c3, 28), true, 1304981641), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final C23454a0 m115858m0(C34061a c34061a, float f13, InterfaceC22997s1 Button, Composer composer, int i13) {
        AbstractC22676k.m65750j(Button, "$this$Button");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            String strM21275i = AbstractC8693b.m21275i(c34061a.getCurrentDate(), c28655q, 0);
            Modifier modifierM107879c = AbstractC34132o.m107879c(f13, C2314t.f9131w);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21275i, modifierM107879c, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getB2(), null, c28655q, 0, C2886a.f11498d << 18, 196600);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public static final C23454a0 m115859m1(C34070j c34070j, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            float f13 = 4;
            C2314t c2314t = C2314t.f9131w;
            AbstractC18489d0.m53380u(f13, f13, c2314t, c28655q);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3396r(c2314t, 2 * 8, 0.0f, 2));
            EnumC27284v enumC27284v = EnumC27284v.TextLarge;
            String strM21274h = AbstractC8693b.m21274h(c34070j.getHormonalInsightsModeBottomSheet().getPrimaryButtonTitle(), c28655q, TextResource.$stable);
            long jM125430y = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite();
            boolean z4 = (m115790T0(interfaceC28601c1) == null || AbstractC22676k.m65745e(m115790T0(interfaceC28601c1), c34070j.getSelectedMode())) ? false : true;
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C3472s(1, interfaceC28601c2, interfaceC28601c3);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27282u.m82292h(modifierM3409f, enumC27284v, strM21274h, z4, jM125430y, null, false, (InterfaceC4339a) objM87133R, c28655q, 12582966, 96);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final C23454a0 m115861n0(C32816h c32816h, C34061a c34061a, boolean z4, Function1 function1, int i13, Composer composer, int i14) {
        m115847j0(c32816h, c34061a, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public static final C23454a0 m115862n1(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        m115766L0(interfaceC28601c1, true);
        m115740C1(interfaceC28601c2, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00be  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:67:0x0126  */
    /* JADX WARN: Code duplicated, block: B:70:0x012d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x012f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0149  */
    /* JADX WARN: Code duplicated, block: B:76:0x0154  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o0 */
    public static final void m115864o0(C34067g c34067g, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        int i16;
        InterfaceC4339a interfaceC4339a2;
        int i17;
        boolean z14;
        boolean z15;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        boolean z16;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        EnumC16313m0 enumC16313m0M107680b;
        TextResource textResource;
        C39274g c39274g;
        EnumC16313m0 enumC16313m0M107681c;
        C39274g c39274g2;
        Object objM87133R;
        Object objM87133R2;
        boolean z17;
        Object objM87133R3;
        Object objM87133R4;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-129828045);
        int i18 = 2;
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(c34067g) : c28655q.m87157i(c34067g) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    if (i19 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C35916a(26);
                            c28655q.m87172p0(objM87133R4);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(2 * 4, C2314t.f9131w));
                    TextResource textResourceM107682e = c34067g.getTitle();
                    enumC16313m0M107680b = c34067g.getLeftIcon();
                    textResource = null;
                    objArr3 = 0;
                    objArr2 = 0;
                    objArr = 0;
                    if (enumC16313m0M107680b != null) {
                        c39274g = new C39274g(enumC16313m0M107680b.toWhoopIcon(), textResource, i18, objArr == true ? 1 : 0);
                    } else {
                        c39274g = null;
                    }
                    enumC16313m0M107681c = c34067g.getRightIcon();
                    if (enumC16313m0M107681c != null) {
                        c39274g2 = new C39274g(enumC16313m0M107681c.toWhoopIcon(), objArr2 == true ? 1 : 0, i18, objArr3 == true ? 1 : 0);
                    } else {
                        c39274g2 = null;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = a.f155336w;
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = b.f155339w;
                        c28655q.m87172p0(objM87133R2);
                    }
                    C39282o c39282o = new C39282o(null, textResourceM107682e, null, z16, false, new AbstractC39279l.b(null, null, c39274g, interfaceC39332eM125323a, c39274g2, p745y81.Function1.m125323a((Function1) objM87133R2), null, null, null, null, null, false, 4035, null), false, null, null, null, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 32725, null);
                    z17 = (i15 & 896) == 256;
                    objM87133R3 = c28655q.m87133R();
                    if (z17 || objM87133R3 == c28676v0) {
                        objM87133R3 = new C36271g(interfaceC4339a4, 0);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC39281n.m125207c(null, c39282o, (InterfaceC4339a) objM87133R3, c28655q, C39282o.f168987q << 3, 1);
                    interfaceC4339a3 = interfaceC4339a4;
                    z15 = z16;
                } else {
                    c28655q.m87138X();
                    z15 = z13;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32676t1(c34067g, z15, interfaceC4339a3, i13, i14, 2);
                }
            }
            i15 |= 384;
            interfaceC4339a2 = interfaceC4339a;
            if ((i15 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i19 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C35916a(26);
                        c28655q.m87172p0(objM87133R4);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(2 * 4, C2314t.f9131w));
                TextResource textResourceM107682e2 = c34067g.getTitle();
                enumC16313m0M107680b = c34067g.getLeftIcon();
                textResource = null;
                objArr3 = 0;
                objArr2 = 0;
                objArr = 0;
                if (enumC16313m0M107680b != null) {
                    c39274g = new C39274g(enumC16313m0M107680b.toWhoopIcon(), textResource, i18, objArr == true ? 1 : 0);
                } else {
                    c39274g = null;
                }
                enumC16313m0M107681c = c34067g.getRightIcon();
                if (enumC16313m0M107681c != null) {
                    c39274g2 = new C39274g(enumC16313m0M107681c.toWhoopIcon(), objArr2 == true ? 1 : 0, i18, objArr3 == true ? 1 : 0);
                } else {
                    c39274g2 = null;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = a.f155336w;
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC39332e interfaceC39332eM125323a2 = p745y81.Function1.m125323a((Function1) objM87133R);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = b.f155339w;
                    c28655q.m87172p0(objM87133R2);
                }
                C39282o c39282o2 = new C39282o(null, textResourceM107682e2, null, z16, false, new AbstractC39279l.b(null, null, c39274g, interfaceC39332eM125323a2, c39274g2, p745y81.Function1.m125323a((Function1) objM87133R2), null, null, null, null, null, false, 4035, null), false, null, null, null, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 32725, null);
                if ((i15 & 896) == 256) {
                }
                objM87133R3 = c28655q.m87133R();
                if (z17) {
                    objM87133R3 = new C36271g(interfaceC4339a4, 0);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C36271g(interfaceC4339a4, 0);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC39281n.m125207c(null, c39282o2, (InterfaceC4339a) objM87133R3, c28655q, C39282o.f168987q << 3, 1);
                interfaceC4339a3 = interfaceC4339a4;
                z15 = z16;
            } else {
                c28655q.m87138X();
                z15 = z13;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32676t1(c34067g, z15, interfaceC4339a3, i13, i14, 2);
            }
        }
        i15 |= 48;
        z13 = z4;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i19 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C35916a(26);
                        c28655q.m87172p0(objM87133R4);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(2 * 4, C2314t.f9131w));
                TextResource textResourceM107682e3 = c34067g.getTitle();
                enumC16313m0M107680b = c34067g.getLeftIcon();
                textResource = null;
                objArr3 = 0;
                objArr2 = 0;
                objArr = 0;
                if (enumC16313m0M107680b != null) {
                    c39274g = new C39274g(enumC16313m0M107680b.toWhoopIcon(), textResource, i18, objArr == true ? 1 : 0);
                } else {
                    c39274g = null;
                }
                enumC16313m0M107681c = c34067g.getRightIcon();
                if (enumC16313m0M107681c != null) {
                    c39274g2 = new C39274g(enumC16313m0M107681c.toWhoopIcon(), objArr2 == true ? 1 : 0, i18, objArr3 == true ? 1 : 0);
                } else {
                    c39274g2 = null;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = a.f155336w;
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC39332e interfaceC39332eM125323a3 = p745y81.Function1.m125323a((Function1) objM87133R);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = b.f155339w;
                    c28655q.m87172p0(objM87133R2);
                }
                C39282o c39282o3 = new C39282o(null, textResourceM107682e3, null, z16, false, new AbstractC39279l.b(null, null, c39274g, interfaceC39332eM125323a3, c39274g2, p745y81.Function1.m125323a((Function1) objM87133R2), null, null, null, null, null, false, 4035, null), false, null, null, null, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 32725, null);
                if ((i15 & 896) == 256) {
                }
                objM87133R3 = c28655q.m87133R();
                if (z17) {
                    objM87133R3 = new C36271g(interfaceC4339a4, 0);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C36271g(interfaceC4339a4, 0);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC39281n.m125207c(null, c39282o3, (InterfaceC4339a) objM87133R3, c28655q, C39282o.f168987q << 3, 1);
                interfaceC4339a3 = interfaceC4339a4;
                z15 = z16;
            } else {
                c28655q.m87138X();
                z15 = z13;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32676t1(c34067g, z15, interfaceC4339a3, i13, i14, 2);
            }
        }
        i15 |= 384;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 147) != 146) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            if (i19 != 0) {
                z16 = true;
            } else {
                z16 = z13;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C35916a(26);
                    c28655q.m87172p0(objM87133R4);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(2 * 4, C2314t.f9131w));
            TextResource textResourceM107682e4 = c34067g.getTitle();
            enumC16313m0M107680b = c34067g.getLeftIcon();
            textResource = null;
            objArr3 = 0;
            objArr2 = 0;
            objArr = 0;
            if (enumC16313m0M107680b != null) {
                c39274g = new C39274g(enumC16313m0M107680b.toWhoopIcon(), textResource, i18, objArr == true ? 1 : 0);
            } else {
                c39274g = null;
            }
            enumC16313m0M107681c = c34067g.getRightIcon();
            if (enumC16313m0M107681c != null) {
                c39274g2 = new C39274g(enumC16313m0M107681c.toWhoopIcon(), objArr2 == true ? 1 : 0, i18, objArr3 == true ? 1 : 0);
            } else {
                c39274g2 = null;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = a.f155336w;
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC39332e interfaceC39332eM125323a4 = p745y81.Function1.m125323a((Function1) objM87133R);
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = b.f155339w;
                c28655q.m87172p0(objM87133R2);
            }
            C39282o c39282o4 = new C39282o(null, textResourceM107682e4, null, z16, false, new AbstractC39279l.b(null, null, c39274g, interfaceC39332eM125323a4, c39274g2, p745y81.Function1.m125323a((Function1) objM87133R2), null, null, null, null, null, false, 4035, null), false, null, null, null, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 32725, null);
            if ((i15 & 896) == 256) {
            }
            objM87133R3 = c28655q.m87133R();
            if (z17) {
                objM87133R3 = new C36271g(interfaceC4339a4, 0);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C36271g(interfaceC4339a4, 0);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC39281n.m125207c(null, c39282o4, (InterfaceC4339a) objM87133R3, c28655q, C39282o.f168987q << 3, 1);
            interfaceC4339a3 = interfaceC4339a4;
            z15 = z16;
        } else {
            c28655q.m87138X();
            z15 = z13;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32676t1(c34067g, z15, interfaceC4339a3, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public static final C23454a0 m115865o1(C34063c c34063c, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        List<C34062b> listM107665a = c34063c.m107665a();
        b0 b0Var = b0.f155340w;
        ((C26053f) LazyColumn).m77529r(listM107665a.size(), null, new c0(b0Var, listM107665a), new C37816b(new d0(listM107665a, interfaceC28601c1), true, 802480018));
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C2026r(c34063c, interfaceC28601c1, interfaceC28601c2, interfaceC28601c3, 26), true, 1191100733), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final C23454a0 m115867p0() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public static final C23454a0 m115868p1(C34063c c34063c, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            float f13 = 4;
            C2314t c2314t = C2314t.f9131w;
            AbstractC18489d0.m53380u(f13, f13, c2314t, c28655q);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3396r(c2314t, 2 * 8, 0.0f, 2));
            EnumC27284v enumC27284v = EnumC27284v.TextLarge;
            String strM21274h = AbstractC8693b.m21274h(c34063c.getPrimaryButtonTitle(), c28655q, TextResource.$stable);
            long jM125430y = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite();
            boolean z4 = m115796V0(interfaceC28601c1) != null;
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C3472s(2, interfaceC28601c2, interfaceC28601c3);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27282u.m82292h(modifierM3409f, enumC27284v, strM21274h, z4, jM125430y, null, false, (InterfaceC4339a) objM87133R, c28655q, 12582966, 96);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final C23454a0 m115870q0(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public static final C23454a0 m115871q1(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        m115772N0(interfaceC28601c1, true);
        m115740C1(interfaceC28601c2, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C23454a0 m115873r0(C34067g c34067g, boolean z4, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m115864o0(c34067g, z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1 */
    public static final C23454a0 m115874r1(C34077q c34077q, Function1 function1, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        List<InterfaceC25312u> listM107731a = c34077q.m107731a();
        C26053f c26053f = (C26053f) LazyColumn;
        c26053f.m77529r(listM107731a.size(), null, new f0(e0.f155352w, listM107731a), new C37816b(new g0(listM107731a, function1), true, 802480018));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0091  */
    /* JADX WARN: Code duplicated, block: B:57:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x0096  */
    /* JADX WARN: Code duplicated, block: B:61:0x009e  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:75:0x010d  */
    /* JADX WARN: Code duplicated, block: B:78:0x013c  */
    /* JADX WARN: Code duplicated, block: B:79:0x013e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0141  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:86:0x020d  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: s0 */
    public static final void m115876s0(C34071k c34071k, boolean z4, boolean z13, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        boolean z14;
        int i16;
        boolean z15;
        int i17;
        int i18;
        Function1 function2;
        int i19;
        boolean z16;
        C28655q c28655q;
        boolean z17;
        boolean z18;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        boolean z19;
        boolean z24;
        float f13;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z25;
        Object objM87133R;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1489986826);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q2.m87153g(c34071k) : c28655q2.m87157i(c34071k) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                z14 = z4;
                i15 |= c28655q2.m87155h(z14) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    z15 = z13;
                    if (c28655q2.m87155h(z15)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        function2 = function1;
                        if (c28655q2.m87157i(function2)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    if ((i15 & 1171) != 1170) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z16)) {
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z14;
                        }
                        if (i16 != 0) {
                            z24 = false;
                        } else {
                            z24 = z15;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == C28635l.f115821a) {
                                objM87133R = new C36244s(14);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function2 = (Function1) objM87133R;
                        }
                        if (z19) {
                            f13 = 1.0f;
                        } else {
                            f13 = 0.2f;
                        }
                        float f14 = 4;
                        C2314t c2314t = C2314t.f9131w;
                        AbstractC18489d0.m53380u(f14, f14, c2314t, c28655q2);
                        Modifier modifierM107879c = AbstractC34132o.m107879c(f13, AbstractC1102d.m3409f(1.0f, c2314t));
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM107879c);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                        TextResource textResourceM107707b = c34071k.getTitleDisplay();
                        int i25 = TextResource.$stable;
                        String strM21274h = AbstractC8693b.m21274h(textResourceM107707b, c28655q2, i25);
                        C38072d c38072d = C38072d.f163053a;
                        int i26 = C38072d.f163054b;
                        C2886a c2886aM8414L = c38072d.m121952e(c28655q2, i26).getSh4();
                        long jM125430y = c38072d.m121949b(c28655q2, i26).getBrandWhite();
                        boolean z26 = z19;
                        if (1.0f > 0.0d) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        if (!z25) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        float f15 = f13;
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                        int i27 = C2886a.f11498d << 18;
                        Function1 function4 = function2;
                        c28655q = c28655q2;
                        AbstractC30795n.m94707h(strM21274h, layoutWeightElement, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8414L, null, c28655q, 0, i27, 196600);
                        AbstractC39330c.m125320b(0L, c38072d.m121949b(c28655q, i26).getAccentAction(), 0L, 0L, AbstractC37817c.m121344e(536764609, c28655q, new C12701f(z24, function4, 4)), c28655q, 24576, 13);
                        c28655q.m87173q(true);
                        AbstractC18489d0.m53380u(2, f14, c2314t, c28655q);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(c34071k.getDescriptionDisplay(), c28655q, i25), AbstractC34132o.m107879c(f15, c2314t), c38072d.m121949b(c28655q, i26).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i26).getB1(), null, c28655q, 0, i27, 196600);
                        z17 = z26;
                        z18 = z24;
                        function3 = function4;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        z17 = z14;
                        z18 = z15;
                        function3 = function2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2559k4(c34071k, z17, z18, function3, i13, i14, 7);
                    }
                }
                i15 |= 3072;
                function2 = function1;
                if ((i15 & 1171) != 1170) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z16)) {
                    if (i24 != 0) {
                        z19 = true;
                    } else {
                        z19 = z14;
                    }
                    if (i16 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C36244s(14);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function2 = (Function1) objM87133R;
                    }
                    if (z19) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.2f;
                    }
                    float f16 = 4;
                    C2314t c2314t2 = C2314t.f9131w;
                    AbstractC18489d0.m53380u(f16, f16, c2314t2, c28655q2);
                    Modifier modifierM107879c2 = AbstractC34132o.m107879c(f13, AbstractC1102d.m3409f(1.0f, c2314t2));
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM107879c2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a2);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                    TextResource textResourceM107707b2 = c34071k.getTitleDisplay();
                    int i28 = TextResource.$stable;
                    String strM21274h2 = AbstractC8693b.m21274h(textResourceM107707b2, c28655q2, i28);
                    C38072d c38072d2 = C38072d.f163053a;
                    int i29 = C38072d.f163054b;
                    C2886a c2886aM8414L2 = c38072d2.m121952e(c28655q2, i29).getSh4();
                    long jM125430y2 = c38072d2.m121949b(c28655q2, i29).getBrandWhite();
                    boolean z27 = z19;
                    if (1.0f > 0.0d) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    if (!z25) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    float f17 = f13;
                    LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
                    int i210 = C2886a.f11498d << 18;
                    Function1 function5 = function2;
                    c28655q = c28655q2;
                    AbstractC30795n.m94707h(strM21274h2, layoutWeightElement2, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8414L2, null, c28655q, 0, i210, 196600);
                    AbstractC39330c.m125320b(0L, c38072d2.m121949b(c28655q, i29).getAccentAction(), 0L, 0L, AbstractC37817c.m121344e(536764609, c28655q, new C12701f(z24, function5, 4)), c28655q, 24576, 13);
                    c28655q.m87173q(true);
                    AbstractC18489d0.m53380u(2, f16, c2314t2, c28655q);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c34071k.getDescriptionDisplay(), c28655q, i28), AbstractC34132o.m107879c(f17, c2314t2), c38072d2.m121949b(c28655q, i29).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i29).getB1(), null, c28655q, 0, i210, 196600);
                    z17 = z27;
                    z18 = z24;
                    function3 = function5;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    z17 = z14;
                    z18 = z15;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2559k4(c34071k, z17, z18, function3, i13, i14, 7);
                }
            }
            i15 |= 384;
            z15 = z13;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function2 = function1;
                    if (c28655q2.m87157i(function2)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z16)) {
                    if (i24 != 0) {
                        z19 = true;
                    } else {
                        z19 = z14;
                    }
                    if (i16 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C36244s(14);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function2 = (Function1) objM87133R;
                    }
                    if (z19) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.2f;
                    }
                    float f18 = 4;
                    C2314t c2314t3 = C2314t.f9131w;
                    AbstractC18489d0.m53380u(f18, f18, c2314t3, c28655q2);
                    Modifier modifierM107879c3 = AbstractC34132o.m107879c(f13, AbstractC1102d.m3409f(1.0f, c2314t3));
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM107879c3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a3);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
                    TextResource textResourceM107707b3 = c34071k.getTitleDisplay();
                    int i211 = TextResource.$stable;
                    String strM21274h3 = AbstractC8693b.m21274h(textResourceM107707b3, c28655q2, i211);
                    C38072d c38072d3 = C38072d.f163053a;
                    int i212 = C38072d.f163054b;
                    C2886a c2886aM8414L3 = c38072d3.m121952e(c28655q2, i212).getSh4();
                    long jM125430y3 = c38072d3.m121949b(c28655q2, i212).getBrandWhite();
                    boolean z28 = z19;
                    if (1.0f > 0.0d) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    if (!z25) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    float f19 = f13;
                    LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(1.0f, true);
                    int i213 = C2886a.f11498d << 18;
                    Function1 function6 = function2;
                    c28655q = c28655q2;
                    AbstractC30795n.m94707h(strM21274h3, layoutWeightElement3, jM125430y3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8414L3, null, c28655q, 0, i213, 196600);
                    AbstractC39330c.m125320b(0L, c38072d3.m121949b(c28655q, i212).getAccentAction(), 0L, 0L, AbstractC37817c.m121344e(536764609, c28655q, new C12701f(z24, function6, 4)), c28655q, 24576, 13);
                    c28655q.m87173q(true);
                    AbstractC18489d0.m53380u(2, f18, c2314t3, c28655q);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c34071k.getDescriptionDisplay(), c28655q, i211), AbstractC34132o.m107879c(f19, c2314t3), c38072d3.m121949b(c28655q, i212).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i212).getB1(), null, c28655q, 0, i213, 196600);
                    z17 = z28;
                    z18 = z24;
                    function3 = function6;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    z17 = z14;
                    z18 = z15;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2559k4(c34071k, z17, z18, function3, i13, i14, 7);
                }
            }
            i15 |= 3072;
            function2 = function1;
            if ((i15 & 1171) != 1170) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z16)) {
                if (i24 != 0) {
                    z19 = true;
                } else {
                    z19 = z14;
                }
                if (i16 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                if (i18 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C36244s(14);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function2 = (Function1) objM87133R;
                }
                if (z19) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.2f;
                }
                float f110 = 4;
                C2314t c2314t4 = C2314t.f9131w;
                AbstractC18489d0.m53380u(f110, f110, c2314t4, c28655q2);
                Modifier modifierM107879c4 = AbstractC34132o.m107879c(f13, AbstractC1102d.m3409f(1.0f, c2314t4));
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM107879c4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a4);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
                TextResource textResourceM107707b4 = c34071k.getTitleDisplay();
                int i214 = TextResource.$stable;
                String strM21274h4 = AbstractC8693b.m21274h(textResourceM107707b4, c28655q2, i214);
                C38072d c38072d4 = C38072d.f163053a;
                int i215 = C38072d.f163054b;
                C2886a c2886aM8414L4 = c38072d4.m121952e(c28655q2, i215).getSh4();
                long jM125430y4 = c38072d4.m121949b(c28655q2, i215).getBrandWhite();
                boolean z29 = z19;
                if (1.0f > 0.0d) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if (!z25) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                float f111 = f13;
                LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(1.0f, true);
                int i216 = C2886a.f11498d << 18;
                Function1 function7 = function2;
                c28655q = c28655q2;
                AbstractC30795n.m94707h(strM21274h4, layoutWeightElement4, jM125430y4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8414L4, null, c28655q, 0, i216, 196600);
                AbstractC39330c.m125320b(0L, c38072d4.m121949b(c28655q, i215).getAccentAction(), 0L, 0L, AbstractC37817c.m121344e(536764609, c28655q, new C12701f(z24, function7, 4)), c28655q, 24576, 13);
                c28655q.m87173q(true);
                AbstractC18489d0.m53380u(2, f110, c2314t4, c28655q);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c34071k.getDescriptionDisplay(), c28655q, i214), AbstractC34132o.m107879c(f111, c2314t4), c38072d4.m121949b(c28655q, i215).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, i215).getB1(), null, c28655q, 0, i216, 196600);
                z17 = z29;
                z18 = z24;
                function3 = function7;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                z17 = z14;
                z18 = z15;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2559k4(c34071k, z17, z18, function3, i13, i14, 7);
            }
        }
        i15 |= 48;
        z14 = z4;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                z15 = z13;
                if (c28655q2.m87155h(z15)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function2 = function1;
                    if (c28655q2.m87157i(function2)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z16)) {
                    if (i24 != 0) {
                        z19 = true;
                    } else {
                        z19 = z14;
                    }
                    if (i16 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C36244s(14);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function2 = (Function1) objM87133R;
                    }
                    if (z19) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.2f;
                    }
                    float f112 = 4;
                    C2314t c2314t5 = C2314t.f9131w;
                    AbstractC18489d0.m53380u(f112, f112, c2314t5, c28655q2);
                    Modifier modifierM107879c5 = AbstractC34132o.m107879c(f13, AbstractC1102d.m3409f(1.0f, c2314t5));
                    C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM107879c5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a5);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m5);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N5);
                    TextResource textResourceM107707b5 = c34071k.getTitleDisplay();
                    int i217 = TextResource.$stable;
                    String strM21274h5 = AbstractC8693b.m21274h(textResourceM107707b5, c28655q2, i217);
                    C38072d c38072d5 = C38072d.f163053a;
                    int i218 = C38072d.f163054b;
                    C2886a c2886aM8414L5 = c38072d5.m121952e(c28655q2, i218).getSh4();
                    long jM125430y5 = c38072d5.m121949b(c28655q2, i218).getBrandWhite();
                    boolean z210 = z19;
                    if (1.0f > 0.0d) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    if (!z25) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    float f113 = f13;
                    LayoutWeightElement layoutWeightElement5 = new LayoutWeightElement(1.0f, true);
                    int i219 = C2886a.f11498d << 18;
                    Function1 function8 = function2;
                    c28655q = c28655q2;
                    AbstractC30795n.m94707h(strM21274h5, layoutWeightElement5, jM125430y5, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8414L5, null, c28655q, 0, i219, 196600);
                    AbstractC39330c.m125320b(0L, c38072d5.m121949b(c28655q, i218).getAccentAction(), 0L, 0L, AbstractC37817c.m121344e(536764609, c28655q, new C12701f(z24, function8, 4)), c28655q, 24576, 13);
                    c28655q.m87173q(true);
                    AbstractC18489d0.m53380u(2, f112, c2314t5, c28655q);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c34071k.getDescriptionDisplay(), c28655q, i217), AbstractC34132o.m107879c(f113, c2314t5), c38072d5.m121949b(c28655q, i218).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d5.m121952e(c28655q, i218).getB1(), null, c28655q, 0, i219, 196600);
                    z17 = z210;
                    z18 = z24;
                    function3 = function8;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    z17 = z14;
                    z18 = z15;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2559k4(c34071k, z17, z18, function3, i13, i14, 7);
                }
            }
            i15 |= 3072;
            function2 = function1;
            if ((i15 & 1171) != 1170) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z16)) {
                if (i24 != 0) {
                    z19 = true;
                } else {
                    z19 = z14;
                }
                if (i16 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                if (i18 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C36244s(14);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function2 = (Function1) objM87133R;
                }
                if (z19) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.2f;
                }
                float f114 = 4;
                C2314t c2314t6 = C2314t.f9131w;
                AbstractC18489d0.m53380u(f114, f114, c2314t6, c28655q2);
                Modifier modifierM107879c6 = AbstractC34132o.m107879c(f13, AbstractC1102d.m3409f(1.0f, c2314t6));
                C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM107879c6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a6);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m6);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N6);
                TextResource textResourceM107707b6 = c34071k.getTitleDisplay();
                int i2110 = TextResource.$stable;
                String strM21274h6 = AbstractC8693b.m21274h(textResourceM107707b6, c28655q2, i2110);
                C38072d c38072d6 = C38072d.f163053a;
                int i2111 = C38072d.f163054b;
                C2886a c2886aM8414L6 = c38072d6.m121952e(c28655q2, i2111).getSh4();
                long jM125430y6 = c38072d6.m121949b(c28655q2, i2111).getBrandWhite();
                boolean z211 = z19;
                if (1.0f > 0.0d) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if (!z25) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                float f115 = f13;
                LayoutWeightElement layoutWeightElement6 = new LayoutWeightElement(1.0f, true);
                int i2112 = C2886a.f11498d << 18;
                Function1 function9 = function2;
                c28655q = c28655q2;
                AbstractC30795n.m94707h(strM21274h6, layoutWeightElement6, jM125430y6, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8414L6, null, c28655q, 0, i2112, 196600);
                AbstractC39330c.m125320b(0L, c38072d6.m121949b(c28655q, i2111).getAccentAction(), 0L, 0L, AbstractC37817c.m121344e(536764609, c28655q, new C12701f(z24, function9, 4)), c28655q, 24576, 13);
                c28655q.m87173q(true);
                AbstractC18489d0.m53380u(2, f114, c2314t6, c28655q);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c34071k.getDescriptionDisplay(), c28655q, i2110), AbstractC34132o.m107879c(f115, c2314t6), c38072d6.m121949b(c28655q, i2111).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d6.m121952e(c28655q, i2111).getB1(), null, c28655q, 0, i2112, 196600);
                z17 = z211;
                z18 = z24;
                function3 = function9;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                z17 = z14;
                z18 = z15;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2559k4(c34071k, z17, z18, function3, i13, i14, 7);
            }
        }
        i15 |= 384;
        z15 = z13;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                function2 = function1;
                if (c28655q2.m87157i(function2)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            if ((i15 & 1171) != 1170) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z16)) {
                if (i24 != 0) {
                    z19 = true;
                } else {
                    z19 = z14;
                }
                if (i16 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                if (i18 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C36244s(14);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function2 = (Function1) objM87133R;
                }
                if (z19) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.2f;
                }
                float f116 = 4;
                C2314t c2314t7 = C2314t.f9131w;
                AbstractC18489d0.m53380u(f116, f116, c2314t7, c28655q2);
                Modifier modifierM107879c7 = AbstractC34132o.m107879c(f13, AbstractC1102d.m3409f(1.0f, c2314t7));
                C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM107879c7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a7);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N7);
                TextResource textResourceM107707b7 = c34071k.getTitleDisplay();
                int i2113 = TextResource.$stable;
                String strM21274h7 = AbstractC8693b.m21274h(textResourceM107707b7, c28655q2, i2113);
                C38072d c38072d7 = C38072d.f163053a;
                int i2114 = C38072d.f163054b;
                C2886a c2886aM8414L7 = c38072d7.m121952e(c28655q2, i2114).getSh4();
                long jM125430y7 = c38072d7.m121949b(c28655q2, i2114).getBrandWhite();
                boolean z212 = z19;
                if (1.0f > 0.0d) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if (!z25) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                float f117 = f13;
                LayoutWeightElement layoutWeightElement7 = new LayoutWeightElement(1.0f, true);
                int i2115 = C2886a.f11498d << 18;
                Function1 function10 = function2;
                c28655q = c28655q2;
                AbstractC30795n.m94707h(strM21274h7, layoutWeightElement7, jM125430y7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8414L7, null, c28655q, 0, i2115, 196600);
                AbstractC39330c.m125320b(0L, c38072d7.m121949b(c28655q, i2114).getAccentAction(), 0L, 0L, AbstractC37817c.m121344e(536764609, c28655q, new C12701f(z24, function10, 4)), c28655q, 24576, 13);
                c28655q.m87173q(true);
                AbstractC18489d0.m53380u(2, f116, c2314t7, c28655q);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c34071k.getDescriptionDisplay(), c28655q, i2113), AbstractC34132o.m107879c(f117, c2314t7), c38072d7.m121949b(c28655q, i2114).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d7.m121952e(c28655q, i2114).getB1(), null, c28655q, 0, i2115, 196600);
                z17 = z212;
                z18 = z24;
                function3 = function10;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                z17 = z14;
                z18 = z15;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2559k4(c34071k, z17, z18, function3, i13, i14, 7);
            }
        }
        i15 |= 3072;
        function2 = function1;
        if ((i15 & 1171) != 1170) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z16)) {
            if (i24 != 0) {
                z19 = true;
            } else {
                z19 = z14;
            }
            if (i16 != 0) {
                z24 = false;
            } else {
                z24 = z15;
            }
            if (i18 != 0) {
                objM87133R = c28655q2.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C36244s(14);
                    c28655q2.m87172p0(objM87133R);
                }
                function2 = (Function1) objM87133R;
            }
            if (z19) {
                f13 = 1.0f;
            } else {
                f13 = 0.2f;
            }
            float f118 = 4;
            C2314t c2314t8 = C2314t.f9131w;
            AbstractC18489d0.m53380u(f118, f118, c2314t8, c28655q2);
            Modifier modifierM107879c8 = AbstractC34132o.m107879c(f13, AbstractC1102d.m3409f(1.0f, c2314t8));
            C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM107879c8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a8);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m8);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N8);
            TextResource textResourceM107707b8 = c34071k.getTitleDisplay();
            int i2116 = TextResource.$stable;
            String strM21274h8 = AbstractC8693b.m21274h(textResourceM107707b8, c28655q2, i2116);
            C38072d c38072d8 = C38072d.f163053a;
            int i2117 = C38072d.f163054b;
            C2886a c2886aM8414L8 = c38072d8.m121952e(c28655q2, i2117).getSh4();
            long jM125430y8 = c38072d8.m121949b(c28655q2, i2117).getBrandWhite();
            boolean z213 = z19;
            if (1.0f > 0.0d) {
                z25 = true;
            } else {
                z25 = false;
            }
            if (!z25) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            float f119 = f13;
            LayoutWeightElement layoutWeightElement8 = new LayoutWeightElement(1.0f, true);
            int i2118 = C2886a.f11498d << 18;
            Function1 function11 = function2;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(strM21274h8, layoutWeightElement8, jM125430y8, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8414L8, null, c28655q, 0, i2118, 196600);
            AbstractC39330c.m125320b(0L, c38072d8.m121949b(c28655q, i2117).getAccentAction(), 0L, 0L, AbstractC37817c.m121344e(536764609, c28655q, new C12701f(z24, function11, 4)), c28655q, 24576, 13);
            c28655q.m87173q(true);
            AbstractC18489d0.m53380u(2, f118, c2314t8, c28655q);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c34071k.getDescriptionDisplay(), c28655q, i2116), AbstractC34132o.m107879c(f119, c2314t8), c38072d8.m121949b(c28655q, i2117).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d8.m121952e(c28655q, i2117).getB1(), null, c28655q, 0, i2118, 196600);
            z17 = z213;
            z18 = z24;
            function3 = function11;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            z17 = z14;
            z18 = z15;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2559k4(c34071k, z17, z18, function3, i13, i14, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public static final C23454a0 m115877s1(C34063c c34063c, InterfaceC28601c1 interfaceC28601c1, Function1 function1, InterfaceC28601c1 interfaceC28601c2, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        List<C34062b> listM107665a = c34063c.m107665a();
        h0 h0Var = h0.f155362w;
        ((C26053f) LazyColumn).m77529r(listM107665a.size(), null, new i0(h0Var, listM107665a), new C37816b(new j0(listM107665a, interfaceC28601c1), true, 802480018));
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C2026r((Object) c34063c, function1, (Object) interfaceC28601c1, (Object) interfaceC28601c2, 27), true, 491034363), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final C23454a0 m115879t0(boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public static final C23454a0 m115880t1(C34063c c34063c, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            float f13 = 4;
            C2314t c2314t = C2314t.f9131w;
            AbstractC18489d0.m53380u(f13, f13, c2314t, c28655q);
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 2 * 8, 0.0f, 2);
            TextResource textResourceM107666b = c34063c.getPrimaryButtonTitle();
            boolean z4 = m115805Y0(interfaceC28601c1) != null;
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C25504c(4, function1, interfaceC28601c1, interfaceC28601c2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27292z.m82343j(modifierM3396r, z4, false, null, null, null, textResourceM107666b, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R, c28655q, (TextResource.$stable << 18) | 6, 0, 8124);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final C23454a0 m115882u0(boolean z4, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM3599a = AbstractC1136a.m3599a(C2314t.f9131w, "HormonalInsightsSwitch");
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C36267c(function1, 3);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC29641d.m91043e(modifierM3599a, z4, false, 0L, null, null, (Function1) objM87133R, c28655q, 6, 60);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u1 */
    public static final C23454a0 m115883u1(InterfaceC28601c1 interfaceC28601c1, Function1 function1, InterfaceC28601c1 interfaceC28601c2) {
        String strM115805Y0 = m115805Y0(interfaceC28601c1);
        if (strM115805Y0 != null) {
            function1.invoke(new AbstractC34073m.d(strM115805Y0));
        }
        m115808Z0(interfaceC28601c1, null);
        m115740C1(interfaceC28601c2, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final C23454a0 m115885v0(Function1 function1, boolean z4) {
        function1.invoke(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v1 */
    public static final C23454a0 m115886v1(InterfaceC28601c1 interfaceC28601c1, String value) {
        AbstractC22676k.m65750j(value, "value");
        m115816b1(interfaceC28601c1, m115812a1(interfaceC28601c1).contains(value) ? AbstractC12350b.m34604y(value, m115812a1(interfaceC28601c1)) : AbstractC12350b.m34555D(value, m115812a1(interfaceC28601c1)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final C23454a0 m115888w0(C34071k c34071k, boolean z4, boolean z13, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m115876s0(c34071k, z4, z13, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w1 */
    public static final C23454a0 m115889w1(Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        function1.invoke(new AbstractC34073m.i(AbstractC25265s.m74093D1(m115812a1(interfaceC28601c1))));
        m115740C1(interfaceC28601c2, null);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0259  */
    /* JADX WARN: Code duplicated, block: B:102:0x025d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0270  */
    /* JADX WARN: Code duplicated, block: B:107:0x027e  */
    /* JADX WARN: Code duplicated, block: B:109:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:111:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:113:0x0314  */
    /* JADX WARN: Code duplicated, block: B:114:0x0317  */
    /* JADX WARN: Code duplicated, block: B:117:0x031e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x0323  */
    /* JADX WARN: Code duplicated, block: B:123:0x033e  */
    /* JADX WARN: Code duplicated, block: B:125:0x034b  */
    /* JADX WARN: Code duplicated, block: B:126:0x037b  */
    /* JADX WARN: Code duplicated, block: B:128:0x037f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0392  */
    /* JADX WARN: Code duplicated, block: B:131:0x039e  */
    /* JADX WARN: Code duplicated, block: B:135:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:136:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:139:0x03cb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:140:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:143:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:144:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:147:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:148:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:151:0x03f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:154:0x040b  */
    /* JADX WARN: Code duplicated, block: B:156:0x0414  */
    /* JADX WARN: Code duplicated, block: B:159:0x0420  */
    /* JADX WARN: Code duplicated, block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:75:0x012e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0130  */
    /* JADX WARN: Code duplicated, block: B:79:0x0137 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x0139  */
    /* JADX WARN: Code duplicated, block: B:83:0x0188  */
    /* JADX WARN: Code duplicated, block: B:85:0x0197  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:88:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:97:0x021f  */
    /* JADX WARN: Code duplicated, block: B:99:0x022b  */
    /* JADX INFO: renamed from: x0 */
    public static final void m115891x0(AbstractC34075o viewState, Function1 function1, Function1 function2, Function1 function3, Composer composer, int i13, int i14) {
        int i15;
        Function1 function4;
        int i16;
        Function1 function5;
        int i17;
        int i18;
        Function1 function6;
        int i19;
        boolean z4;
        Function1 function7;
        Function1 function8;
        Function1 function9;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        final Function1 function10;
        Function1 function11;
        Function1 function12;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        boolean z13;
        C28676v0 c28676v1;
        InterfaceC30057d interfaceC30057d;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        boolean z14;
        Object objM87133R3;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z15;
        Object objM87133R4;
        C28676v0 c28676v2;
        boolean z16;
        Object objM87133R5;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objM87133R6;
        boolean z24;
        Object objM87133R7;
        Object objM87133R8;
        Object objM87133R9;
        Object objM87133R10;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-450300851);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                function4 = function1;
                i15 |= c28655q.m87157i(function4) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function5 = function2;
                    if (c28655q.m87157i(function5)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        function6 = function3;
                        if (c28655q.m87157i(function6)) {
                            i19 = 2048;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    if ((i15 & 1171) != 1170) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        c28676v0 = C28635l.f115821a;
                        if (i24 != 0) {
                            objM87133R10 = c28655q.m87133R();
                            if (objM87133R10 == c28676v0) {
                                objM87133R10 = new C36244s(8);
                                c28655q.m87172p0(objM87133R10);
                            }
                            function10 = (Function1) objM87133R10;
                        } else {
                            function10 = function4;
                        }
                        if (i16 != 0) {
                            objM87133R9 = c28655q.m87133R();
                            if (objM87133R9 == c28676v0) {
                                objM87133R9 = new C36244s(11);
                                c28655q.m87172p0(objM87133R9);
                            }
                            function11 = (Function1) objM87133R9;
                        } else {
                            function11 = function5;
                        }
                        if (i18 != 0) {
                            objM87133R8 = c28655q.m87133R();
                            if (objM87133R8 == c28676v0) {
                                objM87133R8 = new C36244s(12);
                                c28655q.m87172p0(objM87133R8);
                            }
                            function12 = (Function1) objM87133R8;
                        } else {
                            function12 = function6;
                        }
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        AbstractC14874j.m42904c(new e(viewState), "healthcare_womens_health_hormonal_insights_settings", c28655q, 48);
                        if (viewState.equals(AbstractC34075o.a.f142908a)) {
                            c28655q.m87150e0(-1729134057);
                            AbstractC33208p0.b bVar = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                            TextResource textResourceM21278l = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                            if ((i15 & 112) == 32) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            objM87133R7 = c28655q.m87133R();
                            if (z24 || objM87133R7 == c28676v0) {
                                final int i25 = 0;
                                objM87133R7 = new InterfaceC4339a() { // from class: vp1.f
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i25) {
                                            case 0:
                                                return AbstractC36272h.m115748F0(function10);
                                            default:
                                                return AbstractC36272h.m115751G0(function10);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R7);
                            }
                            int i26 = AbstractC33208p0.b.f138467h;
                            int i27 = TextResource.$stable;
                            AbstractC33199m0.m105214F(bVar, textResourceM21278l, null, textResourceM21278l2, (InterfaceC4339a) objM87133R7, false, false, null, null, null, false, false, c28655q, i26 | (i27 << 3) | (i27 << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                            interfaceC28601c2 = interfaceC28601c1;
                            c28676v1 = c28676v0;
                        } else {
                            if (viewState.equals(AbstractC34075o.c.f142910a)) {
                                c28655q.m87150e0(-1728612203);
                                AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                                TextResource textResourceM21278l3 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                                TextResource textResourceM21278l4 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164860g));
                                if ((i15 & 112) == 32) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                objM87133R4 = c28655q.m87133R();
                                if (z15) {
                                    c28676v2 = c28676v0;
                                } else {
                                    c28676v2 = c28676v0;
                                    if (objM87133R4 == c28676v2) {
                                    }
                                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R4;
                                    int i28 = AbstractC33208p0.b.f138467h;
                                    int i29 = TextResource.$stable;
                                    AbstractC33199m0.m105214F(bVar2, textResourceM21278l3, null, textResourceM21278l4, interfaceC4339a, false, false, null, null, null, false, false, c28655q, i28 | (i29 << 3) | (i29 << 9), 0, 4068);
                                    c28655q = c28655q;
                                    c28655q.m87173q(false);
                                    c28676v1 = c28676v2;
                                    interfaceC28601c2 = interfaceC28601c1;
                                }
                                final int i34 = 1;
                                objM87133R4 = new InterfaceC4339a() { // from class: vp1.f
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i34) {
                                            case 0:
                                                return AbstractC36272h.m115748F0(function10);
                                            default:
                                                return AbstractC36272h.m115751G0(function10);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R4);
                                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                                int i210 = AbstractC33208p0.b.f138467h;
                                int i211 = TextResource.$stable;
                                AbstractC33199m0.m105214F(bVar2, textResourceM21278l3, null, textResourceM21278l4, interfaceC4339a2, false, false, null, null, null, false, false, c28655q, i210 | (i211 << 3) | (i211 << 9), 0, 4068);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                                c28676v1 = c28676v2;
                                interfaceC28601c2 = interfaceC28601c1;
                            } else if (viewState.equals(AbstractC34075o.b.f142909a)) {
                                c28655q.m87150e0(-1728094658);
                                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                                iHashCode = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
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
                                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                                c28655q = c28655q;
                                c28655q.m87173q(true);
                                c28655q.m87173q(false);
                                function10 = function10;
                                z13 = true;
                                function11 = function11;
                                function12 = function12;
                                c28676v1 = c28676v0;
                                interfaceC28601c2 = interfaceC28601c1;
                                interfaceC30057d = null;
                            } else {
                                if (viewState.equals(AbstractC34075o.d.f142911a)) {
                                    c28655q.m87150e0(-1727704120);
                                    z13 = true;
                                    c28676v1 = c28676v0;
                                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164872s)), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                    Boolean bool = Boolean.TRUE;
                                    if ((i15 & 112) == 32) {
                                        c28655q = c28655q;
                                        z14 = true;
                                    } else {
                                        c28655q = c28655q;
                                        z14 = false;
                                    }
                                    objM87133R3 = c28655q.m87133R();
                                    if (!z14 || objM87133R3 == c28676v1) {
                                        interfaceC30057d = null;
                                        objM87133R3 = new f(function10, null);
                                        c28655q.m87172p0(objM87133R3);
                                    } else {
                                        interfaceC30057d = null;
                                    }
                                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, bool);
                                    c28655q.m87173q(false);
                                } else {
                                    z13 = true;
                                    c28676v1 = c28676v0;
                                    interfaceC30057d = null;
                                    if (viewState.equals(AbstractC34075o.e.f142912a)) {
                                        c28655q.m87150e0(-1727304034);
                                        AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                                        c28655q = c28655q;
                                        c28655q.m87173q(false);
                                    } else {
                                        if (viewState instanceof AbstractC34075o.f) {
                                            throw AbstractC11895b.m32003v(1052600104, c28655q, false);
                                        }
                                        c28655q.m87150e0(1052665725);
                                        C34070j c34070jM107729a = ((AbstractC34075o.f) viewState).getState();
                                        objM87133R2 = c28655q.m87133R();
                                        if (objM87133R2 == c28676v1) {
                                            interfaceC28601c2 = interfaceC28601c1;
                                            objM87133R2 = new C36269e(3, interfaceC28601c2);
                                            c28655q.m87172p0(objM87133R2);
                                        } else {
                                            interfaceC28601c2 = interfaceC28601c1;
                                        }
                                        function10 = function10;
                                        function11 = function11;
                                        function12 = function12;
                                        m115754H0(c34070jM107729a, function10, function11, function12, (InterfaceC4339a) objM87133R2, c28655q, (i15 & 112) | 24576 | (i15 & 896) | (i15 & 7168), 0);
                                        c28655q.m87173q(false);
                                    }
                                }
                                function10 = function10;
                                function11 = function11;
                                function12 = function12;
                                interfaceC28601c2 = interfaceC28601c1;
                            }
                            if ((i15 & 7168) == 2048) {
                                z16 = z13;
                            } else {
                                z16 = false;
                            }
                            objM87133R5 = c28655q.m87133R();
                            if (z16 || objM87133R5 == c28676v1) {
                                objM87133R5 = new c(function12, interfaceC30057d);
                                c28655q.m87172p0(objM87133R5);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
                            if ((i15 & 14) == 4) {
                                z17 = z13;
                            } else {
                                z17 = false;
                            }
                            if ((i15 & 896) == 256) {
                                z18 = z13;
                            } else {
                                z18 = false;
                            }
                            z19 = z17 | z18;
                            objM87133R6 = c28655q.m87133R();
                            if (z19 || objM87133R6 == c28676v1) {
                                objM87133R6 = new d(viewState, function11, interfaceC28601c2, interfaceC30057d);
                                c28655q.m87172p0(objM87133R6);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, viewState);
                            function7 = function10;
                            function8 = function11;
                            function9 = function12;
                        }
                        interfaceC30057d = null;
                        z13 = true;
                        if ((i15 & 7168) == 2048) {
                            z16 = z13;
                        } else {
                            z16 = false;
                        }
                        objM87133R5 = c28655q.m87133R();
                        if (z16) {
                            objM87133R5 = new c(function12, interfaceC30057d);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new c(function12, interfaceC30057d);
                            c28655q.m87172p0(objM87133R5);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
                        if ((i15 & 14) == 4) {
                            z17 = z13;
                        } else {
                            z17 = false;
                        }
                        if ((i15 & 896) == 256) {
                            z18 = z13;
                        } else {
                            z18 = false;
                        }
                        z19 = z17 | z18;
                        objM87133R6 = c28655q.m87133R();
                        if (z19) {
                            objM87133R6 = new d(viewState, function11, interfaceC28601c2, interfaceC30057d);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new d(viewState, function11, interfaceC28601c2, interfaceC30057d);
                            c28655q.m87172p0(objM87133R6);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, viewState);
                        function7 = function10;
                        function8 = function11;
                        function9 = function12;
                    } else {
                        c28655q.m87138X();
                        function7 = function4;
                        function8 = function5;
                        function9 = function6;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 23);
                    }
                }
                i15 |= 3072;
                function6 = function3;
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R10 = c28655q.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = new C36244s(8);
                            c28655q.m87172p0(objM87133R10);
                        }
                        function10 = (Function1) objM87133R10;
                    } else {
                        function10 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R9 = c28655q.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C36244s(11);
                            c28655q.m87172p0(objM87133R9);
                        }
                        function11 = (Function1) objM87133R9;
                    } else {
                        function11 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C36244s(12);
                            c28655q.m87172p0(objM87133R8);
                        }
                        function12 = (Function1) objM87133R8;
                    } else {
                        function12 = function6;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    AbstractC14874j.m42904c(new e(viewState), "healthcare_womens_health_hormonal_insights_settings", c28655q, 48);
                    if (viewState.equals(AbstractC34075o.a.f142908a)) {
                        c28655q.m87150e0(-1729134057);
                        AbstractC33208p0.b bVar3 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                        TextResource textResourceM21278l5 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                        TextResource textResourceM21278l6 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                        if ((i15 & 112) == 32) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (z24) {
                            final int i212 = 0;
                            objM87133R7 = new InterfaceC4339a() { // from class: vp1.f
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i212) {
                                        case 0:
                                            return AbstractC36272h.m115748F0(function10);
                                        default:
                                            return AbstractC36272h.m115751G0(function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            final int i213 = 0;
                            objM87133R7 = new InterfaceC4339a() { // from class: vp1.f
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i213) {
                                        case 0:
                                            return AbstractC36272h.m115748F0(function10);
                                        default:
                                            return AbstractC36272h.m115751G0(function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R7);
                        }
                        int i214 = AbstractC33208p0.b.f138467h;
                        int i215 = TextResource.$stable;
                        AbstractC33199m0.m105214F(bVar3, textResourceM21278l5, null, textResourceM21278l6, (InterfaceC4339a) objM87133R7, false, false, null, null, null, false, false, c28655q, i214 | (i215 << 3) | (i215 << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                        interfaceC28601c2 = interfaceC28601c1;
                        c28676v1 = c28676v0;
                    } else {
                        if (viewState.equals(AbstractC34075o.c.f142910a)) {
                            c28655q.m87150e0(-1728612203);
                            AbstractC33208p0.b bVar4 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                            TextResource textResourceM21278l7 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                            TextResource textResourceM21278l8 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164860g));
                            if ((i15 & 112) == 32) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            objM87133R4 = c28655q.m87133R();
                            if (z15) {
                                c28676v2 = c28676v0;
                                if (objM87133R4 == c28676v2) {
                                }
                                InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R4;
                                int i216 = AbstractC33208p0.b.f138467h;
                                int i217 = TextResource.$stable;
                                AbstractC33199m0.m105214F(bVar4, textResourceM21278l7, null, textResourceM21278l8, interfaceC4339a3, false, false, null, null, null, false, false, c28655q, i216 | (i217 << 3) | (i217 << 9), 0, 4068);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                                c28676v1 = c28676v2;
                                interfaceC28601c2 = interfaceC28601c1;
                            } else {
                                c28676v2 = c28676v0;
                            }
                            final int i35 = 1;
                            objM87133R4 = new InterfaceC4339a() { // from class: vp1.f
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i35) {
                                        case 0:
                                            return AbstractC36272h.m115748F0(function10);
                                        default:
                                            return AbstractC36272h.m115751G0(function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R4);
                            InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
                            int i218 = AbstractC33208p0.b.f138467h;
                            int i219 = TextResource.$stable;
                            AbstractC33199m0.m105214F(bVar4, textResourceM21278l7, null, textResourceM21278l8, interfaceC4339a4, false, false, null, null, null, false, false, c28655q, i218 | (i219 << 3) | (i219 << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                            c28676v1 = c28676v2;
                            interfaceC28601c2 = interfaceC28601c1;
                        } else if (viewState.equals(AbstractC34075o.b.f142909a)) {
                            c28655q.m87150e0(-1728094658);
                            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
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
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                            function10 = function10;
                            z13 = true;
                            function11 = function11;
                            function12 = function12;
                            c28676v1 = c28676v0;
                            interfaceC28601c2 = interfaceC28601c1;
                            interfaceC30057d = null;
                        } else {
                            if (viewState.equals(AbstractC34075o.d.f142911a)) {
                                c28655q.m87150e0(-1727704120);
                                z13 = true;
                                c28676v1 = c28676v0;
                                AbstractC33199m0.m105214F(new AbstractC33208p0.h(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164872s)), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                Boolean bool2 = Boolean.TRUE;
                                if ((i15 & 112) == 32) {
                                    c28655q = c28655q;
                                    z14 = true;
                                } else {
                                    c28655q = c28655q;
                                    z14 = false;
                                }
                                objM87133R3 = c28655q.m87133R();
                                if (z14) {
                                    interfaceC30057d = null;
                                    objM87133R3 = new f(function10, null);
                                    c28655q.m87172p0(objM87133R3);
                                } else {
                                    interfaceC30057d = null;
                                    objM87133R3 = new f(function10, null);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, bool2);
                                c28655q.m87173q(false);
                            } else {
                                z13 = true;
                                c28676v1 = c28676v0;
                                interfaceC30057d = null;
                                if (viewState.equals(AbstractC34075o.e.f142912a)) {
                                    c28655q.m87150e0(-1727304034);
                                    AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                                    c28655q = c28655q;
                                    c28655q.m87173q(false);
                                } else {
                                    if (viewState instanceof AbstractC34075o.f) {
                                        throw AbstractC11895b.m32003v(1052600104, c28655q, false);
                                    }
                                    c28655q.m87150e0(1052665725);
                                    C34070j c34070jM107729a2 = ((AbstractC34075o.f) viewState).getState();
                                    objM87133R2 = c28655q.m87133R();
                                    if (objM87133R2 == c28676v1) {
                                        interfaceC28601c2 = interfaceC28601c1;
                                        objM87133R2 = new C36269e(3, interfaceC28601c2);
                                        c28655q.m87172p0(objM87133R2);
                                    } else {
                                        interfaceC28601c2 = interfaceC28601c1;
                                    }
                                    function10 = function10;
                                    function11 = function11;
                                    function12 = function12;
                                    m115754H0(c34070jM107729a2, function10, function11, function12, (InterfaceC4339a) objM87133R2, c28655q, (i15 & 112) | 24576 | (i15 & 896) | (i15 & 7168), 0);
                                    c28655q.m87173q(false);
                                }
                            }
                            function10 = function10;
                            function11 = function11;
                            function12 = function12;
                            interfaceC28601c2 = interfaceC28601c1;
                        }
                        if ((i15 & 7168) == 2048) {
                            z16 = z13;
                        } else {
                            z16 = false;
                        }
                        objM87133R5 = c28655q.m87133R();
                        if (z16) {
                            objM87133R5 = new c(function12, interfaceC30057d);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new c(function12, interfaceC30057d);
                            c28655q.m87172p0(objM87133R5);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
                        if ((i15 & 14) == 4) {
                            z17 = z13;
                        } else {
                            z17 = false;
                        }
                        if ((i15 & 896) == 256) {
                            z18 = z13;
                        } else {
                            z18 = false;
                        }
                        z19 = z17 | z18;
                        objM87133R6 = c28655q.m87133R();
                        if (z19) {
                            objM87133R6 = new d(viewState, function11, interfaceC28601c2, interfaceC30057d);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new d(viewState, function11, interfaceC28601c2, interfaceC30057d);
                            c28655q.m87172p0(objM87133R6);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, viewState);
                        function7 = function10;
                        function8 = function11;
                        function9 = function12;
                    }
                    interfaceC30057d = null;
                    z13 = true;
                    if ((i15 & 7168) == 2048) {
                        z16 = z13;
                    } else {
                        z16 = false;
                    }
                    objM87133R5 = c28655q.m87133R();
                    if (z16) {
                        objM87133R5 = new c(function12, interfaceC30057d);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new c(function12, interfaceC30057d);
                        c28655q.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
                    if ((i15 & 14) == 4) {
                        z17 = z13;
                    } else {
                        z17 = false;
                    }
                    if ((i15 & 896) == 256) {
                        z18 = z13;
                    } else {
                        z18 = false;
                    }
                    z19 = z17 | z18;
                    objM87133R6 = c28655q.m87133R();
                    if (z19) {
                        objM87133R6 = new d(viewState, function11, interfaceC28601c2, interfaceC30057d);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new d(viewState, function11, interfaceC28601c2, interfaceC30057d);
                        c28655q.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, viewState);
                    function7 = function10;
                    function8 = function11;
                    function9 = function12;
                } else {
                    c28655q.m87138X();
                    function7 = function4;
                    function8 = function5;
                    function9 = function6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 23);
                }
            }
            i15 |= 384;
            function5 = function2;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function6 = function3;
                    if (c28655q.m87157i(function6)) {
                        i19 = 2048;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R10 = c28655q.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = new C36244s(8);
                            c28655q.m87172p0(objM87133R10);
                        }
                        function10 = (Function1) objM87133R10;
                    } else {
                        function10 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R9 = c28655q.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C36244s(11);
                            c28655q.m87172p0(objM87133R9);
                        }
                        function11 = (Function1) objM87133R9;
                    } else {
                        function11 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C36244s(12);
                            c28655q.m87172p0(objM87133R8);
                        }
                        function12 = (Function1) objM87133R8;
                    } else {
                        function12 = function6;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    AbstractC14874j.m42904c(new e(viewState), "healthcare_womens_health_hormonal_insights_settings", c28655q, 48);
                    if (viewState.equals(AbstractC34075o.a.f142908a)) {
                        c28655q.m87150e0(-1729134057);
                        AbstractC33208p0.b bVar5 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                        TextResource textResourceM21278l9 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                        TextResource textResourceM21278l10 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                        if ((i15 & 112) == 32) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (z24) {
                            final int i2110 = 0;
                            objM87133R7 = new InterfaceC4339a() { // from class: vp1.f
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i2110) {
                                        case 0:
                                            return AbstractC36272h.m115748F0(function10);
                                        default:
                                            return AbstractC36272h.m115751G0(function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            final int i2111 = 0;
                            objM87133R7 = new InterfaceC4339a() { // from class: vp1.f
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i2111) {
                                        case 0:
                                            return AbstractC36272h.m115748F0(function10);
                                        default:
                                            return AbstractC36272h.m115751G0(function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R7);
                        }
                        int i2112 = AbstractC33208p0.b.f138467h;
                        int i2113 = TextResource.$stable;
                        AbstractC33199m0.m105214F(bVar5, textResourceM21278l9, null, textResourceM21278l10, (InterfaceC4339a) objM87133R7, false, false, null, null, null, false, false, c28655q, i2112 | (i2113 << 3) | (i2113 << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                        interfaceC28601c2 = interfaceC28601c1;
                        c28676v1 = c28676v0;
                    } else {
                        if (viewState.equals(AbstractC34075o.c.f142910a)) {
                            c28655q.m87150e0(-1728612203);
                            AbstractC33208p0.b bVar6 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                            TextResource textResourceM21278l11 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                            TextResource textResourceM21278l12 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164860g));
                            if ((i15 & 112) == 32) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            objM87133R4 = c28655q.m87133R();
                            if (z15) {
                                c28676v2 = c28676v0;
                                if (objM87133R4 == c28676v2) {
                                }
                                InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R4;
                                int i2114 = AbstractC33208p0.b.f138467h;
                                int i2115 = TextResource.$stable;
                                AbstractC33199m0.m105214F(bVar6, textResourceM21278l11, null, textResourceM21278l12, interfaceC4339a5, false, false, null, null, null, false, false, c28655q, i2114 | (i2115 << 3) | (i2115 << 9), 0, 4068);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                                c28676v1 = c28676v2;
                                interfaceC28601c2 = interfaceC28601c1;
                            } else {
                                c28676v2 = c28676v0;
                            }
                            final int i36 = 1;
                            objM87133R4 = new InterfaceC4339a() { // from class: vp1.f
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i36) {
                                        case 0:
                                            return AbstractC36272h.m115748F0(function10);
                                        default:
                                            return AbstractC36272h.m115751G0(function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R4);
                            InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R4;
                            int i2116 = AbstractC33208p0.b.f138467h;
                            int i2117 = TextResource.$stable;
                            AbstractC33199m0.m105214F(bVar6, textResourceM21278l11, null, textResourceM21278l12, interfaceC4339a6, false, false, null, null, null, false, false, c28655q, i2116 | (i2117 << 3) | (i2117 << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                            c28676v1 = c28676v2;
                            interfaceC28601c2 = interfaceC28601c1;
                        } else if (viewState.equals(AbstractC34075o.b.f142909a)) {
                            c28655q.m87150e0(-1728094658);
                            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                            c0209i = C0217k.f732j;
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                            function10 = function10;
                            z13 = true;
                            function11 = function11;
                            function12 = function12;
                            c28676v1 = c28676v0;
                            interfaceC28601c2 = interfaceC28601c1;
                            interfaceC30057d = null;
                        } else {
                            if (viewState.equals(AbstractC34075o.d.f142911a)) {
                                c28655q.m87150e0(-1727704120);
                                z13 = true;
                                c28676v1 = c28676v0;
                                AbstractC33199m0.m105214F(new AbstractC33208p0.h(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164872s)), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                Boolean bool3 = Boolean.TRUE;
                                if ((i15 & 112) == 32) {
                                    c28655q = c28655q;
                                    z14 = true;
                                } else {
                                    c28655q = c28655q;
                                    z14 = false;
                                }
                                objM87133R3 = c28655q.m87133R();
                                if (z14) {
                                    interfaceC30057d = null;
                                    objM87133R3 = new f(function10, null);
                                    c28655q.m87172p0(objM87133R3);
                                } else {
                                    interfaceC30057d = null;
                                    objM87133R3 = new f(function10, null);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, bool3);
                                c28655q.m87173q(false);
                            } else {
                                z13 = true;
                                c28676v1 = c28676v0;
                                interfaceC30057d = null;
                                if (viewState.equals(AbstractC34075o.e.f142912a)) {
                                    c28655q.m87150e0(-1727304034);
                                    AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                                    c28655q = c28655q;
                                    c28655q.m87173q(false);
                                } else {
                                    if (viewState instanceof AbstractC34075o.f) {
                                        throw AbstractC11895b.m32003v(1052600104, c28655q, false);
                                    }
                                    c28655q.m87150e0(1052665725);
                                    C34070j c34070jM107729a3 = ((AbstractC34075o.f) viewState).getState();
                                    objM87133R2 = c28655q.m87133R();
                                    if (objM87133R2 == c28676v1) {
                                        interfaceC28601c2 = interfaceC28601c1;
                                        objM87133R2 = new C36269e(3, interfaceC28601c2);
                                        c28655q.m87172p0(objM87133R2);
                                    } else {
                                        interfaceC28601c2 = interfaceC28601c1;
                                    }
                                    function10 = function10;
                                    function11 = function11;
                                    function12 = function12;
                                    m115754H0(c34070jM107729a3, function10, function11, function12, (InterfaceC4339a) objM87133R2, c28655q, (i15 & 112) | 24576 | (i15 & 896) | (i15 & 7168), 0);
                                    c28655q.m87173q(false);
                                }
                            }
                            function10 = function10;
                            function11 = function11;
                            function12 = function12;
                            interfaceC28601c2 = interfaceC28601c1;
                        }
                        if ((i15 & 7168) == 2048) {
                            z16 = z13;
                        } else {
                            z16 = false;
                        }
                        objM87133R5 = c28655q.m87133R();
                        if (z16) {
                            objM87133R5 = new c(function12, interfaceC30057d);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new c(function12, interfaceC30057d);
                            c28655q.m87172p0(objM87133R5);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
                        if ((i15 & 14) == 4) {
                            z17 = z13;
                        } else {
                            z17 = false;
                        }
                        if ((i15 & 896) == 256) {
                            z18 = z13;
                        } else {
                            z18 = false;
                        }
                        z19 = z17 | z18;
                        objM87133R6 = c28655q.m87133R();
                        if (z19) {
                            objM87133R6 = new d(viewState, function11, interfaceC28601c2, interfaceC30057d);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new d(viewState, function11, interfaceC28601c2, interfaceC30057d);
                            c28655q.m87172p0(objM87133R6);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, viewState);
                        function7 = function10;
                        function8 = function11;
                        function9 = function12;
                    }
                    interfaceC30057d = null;
                    z13 = true;
                    if ((i15 & 7168) == 2048) {
                        z16 = z13;
                    } else {
                        z16 = false;
                    }
                    objM87133R5 = c28655q.m87133R();
                    if (z16) {
                        objM87133R5 = new c(function12, interfaceC30057d);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new c(function12, interfaceC30057d);
                        c28655q.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
                    if ((i15 & 14) == 4) {
                        z17 = z13;
                    } else {
                        z17 = false;
                    }
                    if ((i15 & 896) == 256) {
                        z18 = z13;
                    } else {
                        z18 = false;
                    }
                    z19 = z17 | z18;
                    objM87133R6 = c28655q.m87133R();
                    if (z19) {
                        objM87133R6 = new d(viewState, function11, interfaceC28601c2, interfaceC30057d);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new d(viewState, function11, interfaceC28601c2, interfaceC30057d);
                        c28655q.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, viewState);
                    function7 = function10;
                    function8 = function11;
                    function9 = function12;
                } else {
                    c28655q.m87138X();
                    function7 = function4;
                    function8 = function5;
                    function9 = function6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 23);
                }
            }
            i15 |= 3072;
            function6 = function3;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R10 = c28655q.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C36244s(8);
                        c28655q.m87172p0(objM87133R10);
                    }
                    function10 = (Function1) objM87133R10;
                } else {
                    function10 = function4;
                }
                if (i16 != 0) {
                    objM87133R9 = c28655q.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C36244s(11);
                        c28655q.m87172p0(objM87133R9);
                    }
                    function11 = (Function1) objM87133R9;
                } else {
                    function11 = function5;
                }
                if (i18 != 0) {
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C36244s(12);
                        c28655q.m87172p0(objM87133R8);
                    }
                    function12 = (Function1) objM87133R8;
                } else {
                    function12 = function6;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                AbstractC14874j.m42904c(new e(viewState), "healthcare_womens_health_hormonal_insights_settings", c28655q, 48);
                if (viewState.equals(AbstractC34075o.a.f142908a)) {
                    c28655q.m87150e0(-1729134057);
                    AbstractC33208p0.b bVar7 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                    TextResource textResourceM21278l13 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                    TextResource textResourceM21278l14 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                    if ((i15 & 112) == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (z24) {
                        final int i2118 = 0;
                        objM87133R7 = new InterfaceC4339a() { // from class: vp1.f
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2118) {
                                    case 0:
                                        return AbstractC36272h.m115748F0(function10);
                                    default:
                                        return AbstractC36272h.m115751G0(function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        final int i2119 = 0;
                        objM87133R7 = new InterfaceC4339a() { // from class: vp1.f
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2119) {
                                    case 0:
                                        return AbstractC36272h.m115748F0(function10);
                                    default:
                                        return AbstractC36272h.m115751G0(function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R7);
                    }
                    int i21110 = AbstractC33208p0.b.f138467h;
                    int i21111 = TextResource.$stable;
                    AbstractC33199m0.m105214F(bVar7, textResourceM21278l13, null, textResourceM21278l14, (InterfaceC4339a) objM87133R7, false, false, null, null, null, false, false, c28655q, i21110 | (i21111 << 3) | (i21111 << 9), 0, 4068);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                    interfaceC28601c2 = interfaceC28601c1;
                    c28676v1 = c28676v0;
                } else {
                    if (viewState.equals(AbstractC34075o.c.f142910a)) {
                        c28655q.m87150e0(-1728612203);
                        AbstractC33208p0.b bVar8 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                        TextResource textResourceM21278l15 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                        TextResource textResourceM21278l16 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164860g));
                        if ((i15 & 112) == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objM87133R4 = c28655q.m87133R();
                        if (z15) {
                            c28676v2 = c28676v0;
                            if (objM87133R4 == c28676v2) {
                            }
                            InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R4;
                            int i21112 = AbstractC33208p0.b.f138467h;
                            int i21113 = TextResource.$stable;
                            AbstractC33199m0.m105214F(bVar8, textResourceM21278l15, null, textResourceM21278l16, interfaceC4339a7, false, false, null, null, null, false, false, c28655q, i21112 | (i21113 << 3) | (i21113 << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                            c28676v1 = c28676v2;
                            interfaceC28601c2 = interfaceC28601c1;
                        } else {
                            c28676v2 = c28676v0;
                        }
                        final int i37 = 1;
                        objM87133R4 = new InterfaceC4339a() { // from class: vp1.f
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i37) {
                                    case 0:
                                        return AbstractC36272h.m115748F0(function10);
                                    default:
                                        return AbstractC36272h.m115751G0(function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R4);
                        InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R4;
                        int i21114 = AbstractC33208p0.b.f138467h;
                        int i21115 = TextResource.$stable;
                        AbstractC33199m0.m105214F(bVar8, textResourceM21278l15, null, textResourceM21278l16, interfaceC4339a8, false, false, null, null, null, false, false, c28655q, i21114 | (i21115 << 3) | (i21115 << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                        c28676v1 = c28676v2;
                        interfaceC28601c2 = interfaceC28601c1;
                    } else if (viewState.equals(AbstractC34075o.b.f142909a)) {
                        c28655q.m87150e0(-1728094658);
                        C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                        function10 = function10;
                        z13 = true;
                        function11 = function11;
                        function12 = function12;
                        c28676v1 = c28676v0;
                        interfaceC28601c2 = interfaceC28601c1;
                        interfaceC30057d = null;
                    } else {
                        if (viewState.equals(AbstractC34075o.d.f142911a)) {
                            c28655q.m87150e0(-1727704120);
                            z13 = true;
                            c28676v1 = c28676v0;
                            AbstractC33199m0.m105214F(new AbstractC33208p0.h(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164872s)), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                            Boolean bool4 = Boolean.TRUE;
                            if ((i15 & 112) == 32) {
                                c28655q = c28655q;
                                z14 = true;
                            } else {
                                c28655q = c28655q;
                                z14 = false;
                            }
                            objM87133R3 = c28655q.m87133R();
                            if (z14) {
                                interfaceC30057d = null;
                                objM87133R3 = new f(function10, null);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                interfaceC30057d = null;
                                objM87133R3 = new f(function10, null);
                                c28655q.m87172p0(objM87133R3);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, bool4);
                            c28655q.m87173q(false);
                        } else {
                            z13 = true;
                            c28676v1 = c28676v0;
                            interfaceC30057d = null;
                            if (viewState.equals(AbstractC34075o.e.f142912a)) {
                                c28655q.m87150e0(-1727304034);
                                AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                if (viewState instanceof AbstractC34075o.f) {
                                    throw AbstractC11895b.m32003v(1052600104, c28655q, false);
                                }
                                c28655q.m87150e0(1052665725);
                                C34070j c34070jM107729a4 = ((AbstractC34075o.f) viewState).getState();
                                objM87133R2 = c28655q.m87133R();
                                if (objM87133R2 == c28676v1) {
                                    interfaceC28601c2 = interfaceC28601c1;
                                    objM87133R2 = new C36269e(3, interfaceC28601c2);
                                    c28655q.m87172p0(objM87133R2);
                                } else {
                                    interfaceC28601c2 = interfaceC28601c1;
                                }
                                function10 = function10;
                                function11 = function11;
                                function12 = function12;
                                m115754H0(c34070jM107729a4, function10, function11, function12, (InterfaceC4339a) objM87133R2, c28655q, (i15 & 112) | 24576 | (i15 & 896) | (i15 & 7168), 0);
                                c28655q.m87173q(false);
                            }
                        }
                        function10 = function10;
                        function11 = function11;
                        function12 = function12;
                        interfaceC28601c2 = interfaceC28601c1;
                    }
                    if ((i15 & 7168) == 2048) {
                        z16 = z13;
                    } else {
                        z16 = false;
                    }
                    objM87133R5 = c28655q.m87133R();
                    if (z16) {
                        objM87133R5 = new c(function12, interfaceC30057d);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new c(function12, interfaceC30057d);
                        c28655q.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
                    if ((i15 & 14) == 4) {
                        z17 = z13;
                    } else {
                        z17 = false;
                    }
                    if ((i15 & 896) == 256) {
                        z18 = z13;
                    } else {
                        z18 = false;
                    }
                    z19 = z17 | z18;
                    objM87133R6 = c28655q.m87133R();
                    if (z19) {
                        objM87133R6 = new d(viewState, function11, interfaceC28601c2, interfaceC30057d);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new d(viewState, function11, interfaceC28601c2, interfaceC30057d);
                        c28655q.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, viewState);
                    function7 = function10;
                    function8 = function11;
                    function9 = function12;
                }
                interfaceC30057d = null;
                z13 = true;
                if ((i15 & 7168) == 2048) {
                    z16 = z13;
                } else {
                    z16 = false;
                }
                objM87133R5 = c28655q.m87133R();
                if (z16) {
                    objM87133R5 = new c(function12, interfaceC30057d);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new c(function12, interfaceC30057d);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
                if ((i15 & 14) == 4) {
                    z17 = z13;
                } else {
                    z17 = false;
                }
                if ((i15 & 896) == 256) {
                    z18 = z13;
                } else {
                    z18 = false;
                }
                z19 = z17 | z18;
                objM87133R6 = c28655q.m87133R();
                if (z19) {
                    objM87133R6 = new d(viewState, function11, interfaceC28601c2, interfaceC30057d);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new d(viewState, function11, interfaceC28601c2, interfaceC30057d);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, viewState);
                function7 = function10;
                function8 = function11;
                function9 = function12;
            } else {
                c28655q.m87138X();
                function7 = function4;
                function8 = function5;
                function9 = function6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 23);
            }
        }
        i15 |= 48;
        function4 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function5 = function2;
                if (c28655q.m87157i(function5)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function6 = function3;
                    if (c28655q.m87157i(function6)) {
                        i19 = 2048;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R10 = c28655q.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = new C36244s(8);
                            c28655q.m87172p0(objM87133R10);
                        }
                        function10 = (Function1) objM87133R10;
                    } else {
                        function10 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R9 = c28655q.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C36244s(11);
                            c28655q.m87172p0(objM87133R9);
                        }
                        function11 = (Function1) objM87133R9;
                    } else {
                        function11 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C36244s(12);
                            c28655q.m87172p0(objM87133R8);
                        }
                        function12 = (Function1) objM87133R8;
                    } else {
                        function12 = function6;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    AbstractC14874j.m42904c(new e(viewState), "healthcare_womens_health_hormonal_insights_settings", c28655q, 48);
                    if (viewState.equals(AbstractC34075o.a.f142908a)) {
                        c28655q.m87150e0(-1729134057);
                        AbstractC33208p0.b bVar9 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                        TextResource textResourceM21278l17 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                        TextResource textResourceM21278l18 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                        if ((i15 & 112) == 32) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (z24) {
                            final int i21116 = 0;
                            objM87133R7 = new InterfaceC4339a() { // from class: vp1.f
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i21116) {
                                        case 0:
                                            return AbstractC36272h.m115748F0(function10);
                                        default:
                                            return AbstractC36272h.m115751G0(function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            final int i21117 = 0;
                            objM87133R7 = new InterfaceC4339a() { // from class: vp1.f
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i21117) {
                                        case 0:
                                            return AbstractC36272h.m115748F0(function10);
                                        default:
                                            return AbstractC36272h.m115751G0(function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R7);
                        }
                        int i21118 = AbstractC33208p0.b.f138467h;
                        int i21119 = TextResource.$stable;
                        AbstractC33199m0.m105214F(bVar9, textResourceM21278l17, null, textResourceM21278l18, (InterfaceC4339a) objM87133R7, false, false, null, null, null, false, false, c28655q, i21118 | (i21119 << 3) | (i21119 << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                        interfaceC28601c2 = interfaceC28601c1;
                        c28676v1 = c28676v0;
                    } else {
                        if (viewState.equals(AbstractC34075o.c.f142910a)) {
                            c28655q.m87150e0(-1728612203);
                            AbstractC33208p0.b bVar10 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                            TextResource textResourceM21278l19 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                            TextResource textResourceM21278l110 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164860g));
                            if ((i15 & 112) == 32) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            objM87133R4 = c28655q.m87133R();
                            if (z15) {
                                c28676v2 = c28676v0;
                                if (objM87133R4 == c28676v2) {
                                }
                                InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R4;
                                int i211110 = AbstractC33208p0.b.f138467h;
                                int i211111 = TextResource.$stable;
                                AbstractC33199m0.m105214F(bVar10, textResourceM21278l19, null, textResourceM21278l110, interfaceC4339a9, false, false, null, null, null, false, false, c28655q, i211110 | (i211111 << 3) | (i211111 << 9), 0, 4068);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                                c28676v1 = c28676v2;
                                interfaceC28601c2 = interfaceC28601c1;
                            } else {
                                c28676v2 = c28676v0;
                            }
                            final int i38 = 1;
                            objM87133R4 = new InterfaceC4339a() { // from class: vp1.f
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i38) {
                                        case 0:
                                            return AbstractC36272h.m115748F0(function10);
                                        default:
                                            return AbstractC36272h.m115751G0(function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R4);
                            InterfaceC4339a interfaceC4339a10 = (InterfaceC4339a) objM87133R4;
                            int i211112 = AbstractC33208p0.b.f138467h;
                            int i211113 = TextResource.$stable;
                            AbstractC33199m0.m105214F(bVar10, textResourceM21278l19, null, textResourceM21278l110, interfaceC4339a10, false, false, null, null, null, false, false, c28655q, i211112 | (i211113 << 3) | (i211113 << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                            c28676v1 = c28676v2;
                            interfaceC28601c2 = interfaceC28601c1;
                        } else if (viewState.equals(AbstractC34075o.b.f142909a)) {
                            c28655q.m87150e0(-1728094658);
                            C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a5);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                            c0209i = C0217k.f732j;
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                            function10 = function10;
                            z13 = true;
                            function11 = function11;
                            function12 = function12;
                            c28676v1 = c28676v0;
                            interfaceC28601c2 = interfaceC28601c1;
                            interfaceC30057d = null;
                        } else {
                            if (viewState.equals(AbstractC34075o.d.f142911a)) {
                                c28655q.m87150e0(-1727704120);
                                z13 = true;
                                c28676v1 = c28676v0;
                                AbstractC33199m0.m105214F(new AbstractC33208p0.h(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164872s)), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                Boolean bool5 = Boolean.TRUE;
                                if ((i15 & 112) == 32) {
                                    c28655q = c28655q;
                                    z14 = true;
                                } else {
                                    c28655q = c28655q;
                                    z14 = false;
                                }
                                objM87133R3 = c28655q.m87133R();
                                if (z14) {
                                    interfaceC30057d = null;
                                    objM87133R3 = new f(function10, null);
                                    c28655q.m87172p0(objM87133R3);
                                } else {
                                    interfaceC30057d = null;
                                    objM87133R3 = new f(function10, null);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, bool5);
                                c28655q.m87173q(false);
                            } else {
                                z13 = true;
                                c28676v1 = c28676v0;
                                interfaceC30057d = null;
                                if (viewState.equals(AbstractC34075o.e.f142912a)) {
                                    c28655q.m87150e0(-1727304034);
                                    AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                                    c28655q = c28655q;
                                    c28655q.m87173q(false);
                                } else {
                                    if (viewState instanceof AbstractC34075o.f) {
                                        throw AbstractC11895b.m32003v(1052600104, c28655q, false);
                                    }
                                    c28655q.m87150e0(1052665725);
                                    C34070j c34070jM107729a5 = ((AbstractC34075o.f) viewState).getState();
                                    objM87133R2 = c28655q.m87133R();
                                    if (objM87133R2 == c28676v1) {
                                        interfaceC28601c2 = interfaceC28601c1;
                                        objM87133R2 = new C36269e(3, interfaceC28601c2);
                                        c28655q.m87172p0(objM87133R2);
                                    } else {
                                        interfaceC28601c2 = interfaceC28601c1;
                                    }
                                    function10 = function10;
                                    function11 = function11;
                                    function12 = function12;
                                    m115754H0(c34070jM107729a5, function10, function11, function12, (InterfaceC4339a) objM87133R2, c28655q, (i15 & 112) | 24576 | (i15 & 896) | (i15 & 7168), 0);
                                    c28655q.m87173q(false);
                                }
                            }
                            function10 = function10;
                            function11 = function11;
                            function12 = function12;
                            interfaceC28601c2 = interfaceC28601c1;
                        }
                        if ((i15 & 7168) == 2048) {
                            z16 = z13;
                        } else {
                            z16 = false;
                        }
                        objM87133R5 = c28655q.m87133R();
                        if (z16) {
                            objM87133R5 = new c(function12, interfaceC30057d);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new c(function12, interfaceC30057d);
                            c28655q.m87172p0(objM87133R5);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
                        if ((i15 & 14) == 4) {
                            z17 = z13;
                        } else {
                            z17 = false;
                        }
                        if ((i15 & 896) == 256) {
                            z18 = z13;
                        } else {
                            z18 = false;
                        }
                        z19 = z17 | z18;
                        objM87133R6 = c28655q.m87133R();
                        if (z19) {
                            objM87133R6 = new d(viewState, function11, interfaceC28601c2, interfaceC30057d);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new d(viewState, function11, interfaceC28601c2, interfaceC30057d);
                            c28655q.m87172p0(objM87133R6);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, viewState);
                        function7 = function10;
                        function8 = function11;
                        function9 = function12;
                    }
                    interfaceC30057d = null;
                    z13 = true;
                    if ((i15 & 7168) == 2048) {
                        z16 = z13;
                    } else {
                        z16 = false;
                    }
                    objM87133R5 = c28655q.m87133R();
                    if (z16) {
                        objM87133R5 = new c(function12, interfaceC30057d);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new c(function12, interfaceC30057d);
                        c28655q.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
                    if ((i15 & 14) == 4) {
                        z17 = z13;
                    } else {
                        z17 = false;
                    }
                    if ((i15 & 896) == 256) {
                        z18 = z13;
                    } else {
                        z18 = false;
                    }
                    z19 = z17 | z18;
                    objM87133R6 = c28655q.m87133R();
                    if (z19) {
                        objM87133R6 = new d(viewState, function11, interfaceC28601c2, interfaceC30057d);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new d(viewState, function11, interfaceC28601c2, interfaceC30057d);
                        c28655q.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, viewState);
                    function7 = function10;
                    function8 = function11;
                    function9 = function12;
                } else {
                    c28655q.m87138X();
                    function7 = function4;
                    function8 = function5;
                    function9 = function6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 23);
                }
            }
            i15 |= 3072;
            function6 = function3;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R10 = c28655q.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C36244s(8);
                        c28655q.m87172p0(objM87133R10);
                    }
                    function10 = (Function1) objM87133R10;
                } else {
                    function10 = function4;
                }
                if (i16 != 0) {
                    objM87133R9 = c28655q.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C36244s(11);
                        c28655q.m87172p0(objM87133R9);
                    }
                    function11 = (Function1) objM87133R9;
                } else {
                    function11 = function5;
                }
                if (i18 != 0) {
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C36244s(12);
                        c28655q.m87172p0(objM87133R8);
                    }
                    function12 = (Function1) objM87133R8;
                } else {
                    function12 = function6;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                AbstractC14874j.m42904c(new e(viewState), "healthcare_womens_health_hormonal_insights_settings", c28655q, 48);
                if (viewState.equals(AbstractC34075o.a.f142908a)) {
                    c28655q.m87150e0(-1729134057);
                    AbstractC33208p0.b bVar11 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                    TextResource textResourceM21278l111 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                    TextResource textResourceM21278l112 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                    if ((i15 & 112) == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (z24) {
                        final int i211114 = 0;
                        objM87133R7 = new InterfaceC4339a() { // from class: vp1.f
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i211114) {
                                    case 0:
                                        return AbstractC36272h.m115748F0(function10);
                                    default:
                                        return AbstractC36272h.m115751G0(function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        final int i211115 = 0;
                        objM87133R7 = new InterfaceC4339a() { // from class: vp1.f
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i211115) {
                                    case 0:
                                        return AbstractC36272h.m115748F0(function10);
                                    default:
                                        return AbstractC36272h.m115751G0(function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R7);
                    }
                    int i211116 = AbstractC33208p0.b.f138467h;
                    int i211117 = TextResource.$stable;
                    AbstractC33199m0.m105214F(bVar11, textResourceM21278l111, null, textResourceM21278l112, (InterfaceC4339a) objM87133R7, false, false, null, null, null, false, false, c28655q, i211116 | (i211117 << 3) | (i211117 << 9), 0, 4068);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                    interfaceC28601c2 = interfaceC28601c1;
                    c28676v1 = c28676v0;
                } else {
                    if (viewState.equals(AbstractC34075o.c.f142910a)) {
                        c28655q.m87150e0(-1728612203);
                        AbstractC33208p0.b bVar12 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                        TextResource textResourceM21278l113 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                        TextResource textResourceM21278l114 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164860g));
                        if ((i15 & 112) == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objM87133R4 = c28655q.m87133R();
                        if (z15) {
                            c28676v2 = c28676v0;
                            if (objM87133R4 == c28676v2) {
                            }
                            InterfaceC4339a interfaceC4339a11 = (InterfaceC4339a) objM87133R4;
                            int i211118 = AbstractC33208p0.b.f138467h;
                            int i211119 = TextResource.$stable;
                            AbstractC33199m0.m105214F(bVar12, textResourceM21278l113, null, textResourceM21278l114, interfaceC4339a11, false, false, null, null, null, false, false, c28655q, i211118 | (i211119 << 3) | (i211119 << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                            c28676v1 = c28676v2;
                            interfaceC28601c2 = interfaceC28601c1;
                        } else {
                            c28676v2 = c28676v0;
                        }
                        final int i39 = 1;
                        objM87133R4 = new InterfaceC4339a() { // from class: vp1.f
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i39) {
                                    case 0:
                                        return AbstractC36272h.m115748F0(function10);
                                    default:
                                        return AbstractC36272h.m115751G0(function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R4);
                        InterfaceC4339a interfaceC4339a12 = (InterfaceC4339a) objM87133R4;
                        int i2111110 = AbstractC33208p0.b.f138467h;
                        int i2111111 = TextResource.$stable;
                        AbstractC33199m0.m105214F(bVar12, textResourceM21278l113, null, textResourceM21278l114, interfaceC4339a12, false, false, null, null, null, false, false, c28655q, i2111110 | (i2111111 << 3) | (i2111111 << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                        c28676v1 = c28676v2;
                        interfaceC28601c2 = interfaceC28601c1;
                    } else if (viewState.equals(AbstractC34075o.b.f142909a)) {
                        c28655q.m87150e0(-1728094658);
                        C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a6);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                        function10 = function10;
                        z13 = true;
                        function11 = function11;
                        function12 = function12;
                        c28676v1 = c28676v0;
                        interfaceC28601c2 = interfaceC28601c1;
                        interfaceC30057d = null;
                    } else {
                        if (viewState.equals(AbstractC34075o.d.f142911a)) {
                            c28655q.m87150e0(-1727704120);
                            z13 = true;
                            c28676v1 = c28676v0;
                            AbstractC33199m0.m105214F(new AbstractC33208p0.h(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164872s)), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                            Boolean bool6 = Boolean.TRUE;
                            if ((i15 & 112) == 32) {
                                c28655q = c28655q;
                                z14 = true;
                            } else {
                                c28655q = c28655q;
                                z14 = false;
                            }
                            objM87133R3 = c28655q.m87133R();
                            if (z14) {
                                interfaceC30057d = null;
                                objM87133R3 = new f(function10, null);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                interfaceC30057d = null;
                                objM87133R3 = new f(function10, null);
                                c28655q.m87172p0(objM87133R3);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, bool6);
                            c28655q.m87173q(false);
                        } else {
                            z13 = true;
                            c28676v1 = c28676v0;
                            interfaceC30057d = null;
                            if (viewState.equals(AbstractC34075o.e.f142912a)) {
                                c28655q.m87150e0(-1727304034);
                                AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                if (viewState instanceof AbstractC34075o.f) {
                                    throw AbstractC11895b.m32003v(1052600104, c28655q, false);
                                }
                                c28655q.m87150e0(1052665725);
                                C34070j c34070jM107729a6 = ((AbstractC34075o.f) viewState).getState();
                                objM87133R2 = c28655q.m87133R();
                                if (objM87133R2 == c28676v1) {
                                    interfaceC28601c2 = interfaceC28601c1;
                                    objM87133R2 = new C36269e(3, interfaceC28601c2);
                                    c28655q.m87172p0(objM87133R2);
                                } else {
                                    interfaceC28601c2 = interfaceC28601c1;
                                }
                                function10 = function10;
                                function11 = function11;
                                function12 = function12;
                                m115754H0(c34070jM107729a6, function10, function11, function12, (InterfaceC4339a) objM87133R2, c28655q, (i15 & 112) | 24576 | (i15 & 896) | (i15 & 7168), 0);
                                c28655q.m87173q(false);
                            }
                        }
                        function10 = function10;
                        function11 = function11;
                        function12 = function12;
                        interfaceC28601c2 = interfaceC28601c1;
                    }
                    if ((i15 & 7168) == 2048) {
                        z16 = z13;
                    } else {
                        z16 = false;
                    }
                    objM87133R5 = c28655q.m87133R();
                    if (z16) {
                        objM87133R5 = new c(function12, interfaceC30057d);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new c(function12, interfaceC30057d);
                        c28655q.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
                    if ((i15 & 14) == 4) {
                        z17 = z13;
                    } else {
                        z17 = false;
                    }
                    if ((i15 & 896) == 256) {
                        z18 = z13;
                    } else {
                        z18 = false;
                    }
                    z19 = z17 | z18;
                    objM87133R6 = c28655q.m87133R();
                    if (z19) {
                        objM87133R6 = new d(viewState, function11, interfaceC28601c2, interfaceC30057d);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new d(viewState, function11, interfaceC28601c2, interfaceC30057d);
                        c28655q.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, viewState);
                    function7 = function10;
                    function8 = function11;
                    function9 = function12;
                }
                interfaceC30057d = null;
                z13 = true;
                if ((i15 & 7168) == 2048) {
                    z16 = z13;
                } else {
                    z16 = false;
                }
                objM87133R5 = c28655q.m87133R();
                if (z16) {
                    objM87133R5 = new c(function12, interfaceC30057d);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new c(function12, interfaceC30057d);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
                if ((i15 & 14) == 4) {
                    z17 = z13;
                } else {
                    z17 = false;
                }
                if ((i15 & 896) == 256) {
                    z18 = z13;
                } else {
                    z18 = false;
                }
                z19 = z17 | z18;
                objM87133R6 = c28655q.m87133R();
                if (z19) {
                    objM87133R6 = new d(viewState, function11, interfaceC28601c2, interfaceC30057d);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new d(viewState, function11, interfaceC28601c2, interfaceC30057d);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, viewState);
                function7 = function10;
                function8 = function11;
                function9 = function12;
            } else {
                c28655q.m87138X();
                function7 = function4;
                function8 = function5;
                function9 = function6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 23);
            }
        }
        i15 |= 384;
        function5 = function2;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                function6 = function3;
                if (c28655q.m87157i(function6)) {
                    i19 = 2048;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R10 = c28655q.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C36244s(8);
                        c28655q.m87172p0(objM87133R10);
                    }
                    function10 = (Function1) objM87133R10;
                } else {
                    function10 = function4;
                }
                if (i16 != 0) {
                    objM87133R9 = c28655q.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C36244s(11);
                        c28655q.m87172p0(objM87133R9);
                    }
                    function11 = (Function1) objM87133R9;
                } else {
                    function11 = function5;
                }
                if (i18 != 0) {
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C36244s(12);
                        c28655q.m87172p0(objM87133R8);
                    }
                    function12 = (Function1) objM87133R8;
                } else {
                    function12 = function6;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                AbstractC14874j.m42904c(new e(viewState), "healthcare_womens_health_hormonal_insights_settings", c28655q, 48);
                if (viewState.equals(AbstractC34075o.a.f142908a)) {
                    c28655q.m87150e0(-1729134057);
                    AbstractC33208p0.b bVar13 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                    TextResource textResourceM21278l115 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                    TextResource textResourceM21278l116 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                    if ((i15 & 112) == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (z24) {
                        final int i2111112 = 0;
                        objM87133R7 = new InterfaceC4339a() { // from class: vp1.f
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2111112) {
                                    case 0:
                                        return AbstractC36272h.m115748F0(function10);
                                    default:
                                        return AbstractC36272h.m115751G0(function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        final int i2111113 = 0;
                        objM87133R7 = new InterfaceC4339a() { // from class: vp1.f
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2111113) {
                                    case 0:
                                        return AbstractC36272h.m115748F0(function10);
                                    default:
                                        return AbstractC36272h.m115751G0(function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R7);
                    }
                    int i2111114 = AbstractC33208p0.b.f138467h;
                    int i2111115 = TextResource.$stable;
                    AbstractC33199m0.m105214F(bVar13, textResourceM21278l115, null, textResourceM21278l116, (InterfaceC4339a) objM87133R7, false, false, null, null, null, false, false, c28655q, i2111114 | (i2111115 << 3) | (i2111115 << 9), 0, 4068);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                    interfaceC28601c2 = interfaceC28601c1;
                    c28676v1 = c28676v0;
                } else {
                    if (viewState.equals(AbstractC34075o.c.f142910a)) {
                        c28655q.m87150e0(-1728612203);
                        AbstractC33208p0.b bVar14 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                        TextResource textResourceM21278l117 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                        TextResource textResourceM21278l118 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164860g));
                        if ((i15 & 112) == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objM87133R4 = c28655q.m87133R();
                        if (z15) {
                            c28676v2 = c28676v0;
                            if (objM87133R4 == c28676v2) {
                            }
                            InterfaceC4339a interfaceC4339a13 = (InterfaceC4339a) objM87133R4;
                            int i2111116 = AbstractC33208p0.b.f138467h;
                            int i2111117 = TextResource.$stable;
                            AbstractC33199m0.m105214F(bVar14, textResourceM21278l117, null, textResourceM21278l118, interfaceC4339a13, false, false, null, null, null, false, false, c28655q, i2111116 | (i2111117 << 3) | (i2111117 << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                            c28676v1 = c28676v2;
                            interfaceC28601c2 = interfaceC28601c1;
                        } else {
                            c28676v2 = c28676v0;
                        }
                        final int i310 = 1;
                        objM87133R4 = new InterfaceC4339a() { // from class: vp1.f
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i310) {
                                    case 0:
                                        return AbstractC36272h.m115748F0(function10);
                                    default:
                                        return AbstractC36272h.m115751G0(function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R4);
                        InterfaceC4339a interfaceC4339a14 = (InterfaceC4339a) objM87133R4;
                        int i2111118 = AbstractC33208p0.b.f138467h;
                        int i2111119 = TextResource.$stable;
                        AbstractC33199m0.m105214F(bVar14, textResourceM21278l117, null, textResourceM21278l118, interfaceC4339a14, false, false, null, null, null, false, false, c28655q, i2111118 | (i2111119 << 3) | (i2111119 << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                        c28676v1 = c28676v2;
                        interfaceC28601c2 = interfaceC28601c1;
                    } else if (viewState.equals(AbstractC34075o.b.f142909a)) {
                        c28655q.m87150e0(-1728094658);
                        C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                        Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a7);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                        function10 = function10;
                        z13 = true;
                        function11 = function11;
                        function12 = function12;
                        c28676v1 = c28676v0;
                        interfaceC28601c2 = interfaceC28601c1;
                        interfaceC30057d = null;
                    } else {
                        if (viewState.equals(AbstractC34075o.d.f142911a)) {
                            c28655q.m87150e0(-1727704120);
                            z13 = true;
                            c28676v1 = c28676v0;
                            AbstractC33199m0.m105214F(new AbstractC33208p0.h(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164872s)), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                            Boolean bool7 = Boolean.TRUE;
                            if ((i15 & 112) == 32) {
                                c28655q = c28655q;
                                z14 = true;
                            } else {
                                c28655q = c28655q;
                                z14 = false;
                            }
                            objM87133R3 = c28655q.m87133R();
                            if (z14) {
                                interfaceC30057d = null;
                                objM87133R3 = new f(function10, null);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                interfaceC30057d = null;
                                objM87133R3 = new f(function10, null);
                                c28655q.m87172p0(objM87133R3);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, bool7);
                            c28655q.m87173q(false);
                        } else {
                            z13 = true;
                            c28676v1 = c28676v0;
                            interfaceC30057d = null;
                            if (viewState.equals(AbstractC34075o.e.f142912a)) {
                                c28655q.m87150e0(-1727304034);
                                AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                if (viewState instanceof AbstractC34075o.f) {
                                    throw AbstractC11895b.m32003v(1052600104, c28655q, false);
                                }
                                c28655q.m87150e0(1052665725);
                                C34070j c34070jM107729a7 = ((AbstractC34075o.f) viewState).getState();
                                objM87133R2 = c28655q.m87133R();
                                if (objM87133R2 == c28676v1) {
                                    interfaceC28601c2 = interfaceC28601c1;
                                    objM87133R2 = new C36269e(3, interfaceC28601c2);
                                    c28655q.m87172p0(objM87133R2);
                                } else {
                                    interfaceC28601c2 = interfaceC28601c1;
                                }
                                function10 = function10;
                                function11 = function11;
                                function12 = function12;
                                m115754H0(c34070jM107729a7, function10, function11, function12, (InterfaceC4339a) objM87133R2, c28655q, (i15 & 112) | 24576 | (i15 & 896) | (i15 & 7168), 0);
                                c28655q.m87173q(false);
                            }
                        }
                        function10 = function10;
                        function11 = function11;
                        function12 = function12;
                        interfaceC28601c2 = interfaceC28601c1;
                    }
                    if ((i15 & 7168) == 2048) {
                        z16 = z13;
                    } else {
                        z16 = false;
                    }
                    objM87133R5 = c28655q.m87133R();
                    if (z16) {
                        objM87133R5 = new c(function12, interfaceC30057d);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new c(function12, interfaceC30057d);
                        c28655q.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
                    if ((i15 & 14) == 4) {
                        z17 = z13;
                    } else {
                        z17 = false;
                    }
                    if ((i15 & 896) == 256) {
                        z18 = z13;
                    } else {
                        z18 = false;
                    }
                    z19 = z17 | z18;
                    objM87133R6 = c28655q.m87133R();
                    if (z19) {
                        objM87133R6 = new d(viewState, function11, interfaceC28601c2, interfaceC30057d);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new d(viewState, function11, interfaceC28601c2, interfaceC30057d);
                        c28655q.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, viewState);
                    function7 = function10;
                    function8 = function11;
                    function9 = function12;
                }
                interfaceC30057d = null;
                z13 = true;
                if ((i15 & 7168) == 2048) {
                    z16 = z13;
                } else {
                    z16 = false;
                }
                objM87133R5 = c28655q.m87133R();
                if (z16) {
                    objM87133R5 = new c(function12, interfaceC30057d);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new c(function12, interfaceC30057d);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
                if ((i15 & 14) == 4) {
                    z17 = z13;
                } else {
                    z17 = false;
                }
                if ((i15 & 896) == 256) {
                    z18 = z13;
                } else {
                    z18 = false;
                }
                z19 = z17 | z18;
                objM87133R6 = c28655q.m87133R();
                if (z19) {
                    objM87133R6 = new d(viewState, function11, interfaceC28601c2, interfaceC30057d);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new d(viewState, function11, interfaceC28601c2, interfaceC30057d);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, viewState);
                function7 = function10;
                function8 = function11;
                function9 = function12;
            } else {
                c28655q.m87138X();
                function7 = function4;
                function8 = function5;
                function9 = function6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 23);
            }
        }
        i15 |= 3072;
        function6 = function3;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R10 = c28655q.m87133R();
                if (objM87133R10 == c28676v0) {
                    objM87133R10 = new C36244s(8);
                    c28655q.m87172p0(objM87133R10);
                }
                function10 = (Function1) objM87133R10;
            } else {
                function10 = function4;
            }
            if (i16 != 0) {
                objM87133R9 = c28655q.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = new C36244s(11);
                    c28655q.m87172p0(objM87133R9);
                }
                function11 = (Function1) objM87133R9;
            } else {
                function11 = function5;
            }
            if (i18 != 0) {
                objM87133R8 = c28655q.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = new C36244s(12);
                    c28655q.m87172p0(objM87133R8);
                }
                function12 = (Function1) objM87133R8;
            } else {
                function12 = function6;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            AbstractC14874j.m42904c(new e(viewState), "healthcare_womens_health_hormonal_insights_settings", c28655q, 48);
            if (viewState.equals(AbstractC34075o.a.f142908a)) {
                c28655q.m87150e0(-1729134057);
                AbstractC33208p0.b bVar15 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                TextResource textResourceM21278l119 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                TextResource textResourceM21278l1110 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                if ((i15 & 112) == 32) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                objM87133R7 = c28655q.m87133R();
                if (z24) {
                    final int i21111110 = 0;
                    objM87133R7 = new InterfaceC4339a() { // from class: vp1.f
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i21111110) {
                                case 0:
                                    return AbstractC36272h.m115748F0(function10);
                                default:
                                    return AbstractC36272h.m115751G0(function10);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R7);
                } else {
                    final int i21111111 = 0;
                    objM87133R7 = new InterfaceC4339a() { // from class: vp1.f
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i21111111) {
                                case 0:
                                    return AbstractC36272h.m115748F0(function10);
                                default:
                                    return AbstractC36272h.m115751G0(function10);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R7);
                }
                int i21111112 = AbstractC33208p0.b.f138467h;
                int i21111113 = TextResource.$stable;
                AbstractC33199m0.m105214F(bVar15, textResourceM21278l119, null, textResourceM21278l1110, (InterfaceC4339a) objM87133R7, false, false, null, null, null, false, false, c28655q, i21111112 | (i21111113 << 3) | (i21111113 << 9), 0, 4068);
                c28655q = c28655q;
                c28655q.m87173q(false);
                interfaceC28601c2 = interfaceC28601c1;
                c28676v1 = c28676v0;
            } else {
                if (viewState.equals(AbstractC34075o.c.f142910a)) {
                    c28655q.m87150e0(-1728612203);
                    AbstractC33208p0.b bVar16 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                    TextResource textResourceM21278l1111 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                    TextResource textResourceM21278l1112 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164860g));
                    if ((i15 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (z15) {
                        c28676v2 = c28676v0;
                        if (objM87133R4 == c28676v2) {
                        }
                        InterfaceC4339a interfaceC4339a15 = (InterfaceC4339a) objM87133R4;
                        int i21111114 = AbstractC33208p0.b.f138467h;
                        int i21111115 = TextResource.$stable;
                        AbstractC33199m0.m105214F(bVar16, textResourceM21278l1111, null, textResourceM21278l1112, interfaceC4339a15, false, false, null, null, null, false, false, c28655q, i21111114 | (i21111115 << 3) | (i21111115 << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                        c28676v1 = c28676v2;
                        interfaceC28601c2 = interfaceC28601c1;
                    } else {
                        c28676v2 = c28676v0;
                    }
                    final int i311 = 1;
                    objM87133R4 = new InterfaceC4339a() { // from class: vp1.f
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i311) {
                                case 0:
                                    return AbstractC36272h.m115748F0(function10);
                                default:
                                    return AbstractC36272h.m115751G0(function10);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R4);
                    InterfaceC4339a interfaceC4339a16 = (InterfaceC4339a) objM87133R4;
                    int i21111116 = AbstractC33208p0.b.f138467h;
                    int i21111117 = TextResource.$stable;
                    AbstractC33199m0.m105214F(bVar16, textResourceM21278l1111, null, textResourceM21278l1112, interfaceC4339a16, false, false, null, null, null, false, false, c28655q, i21111116 | (i21111117 << 3) | (i21111117 << 9), 0, 4068);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                    c28676v1 = c28676v2;
                    interfaceC28601c2 = interfaceC28601c1;
                } else if (viewState.equals(AbstractC34075o.b.f142909a)) {
                    c28655q.m87150e0(-1728094658);
                    C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a8);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                    function10 = function10;
                    z13 = true;
                    function11 = function11;
                    function12 = function12;
                    c28676v1 = c28676v0;
                    interfaceC28601c2 = interfaceC28601c1;
                    interfaceC30057d = null;
                } else {
                    if (viewState.equals(AbstractC34075o.d.f142911a)) {
                        c28655q.m87150e0(-1727704120);
                        z13 = true;
                        c28676v1 = c28676v0;
                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164872s)), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                        Boolean bool8 = Boolean.TRUE;
                        if ((i15 & 112) == 32) {
                            c28655q = c28655q;
                            z14 = true;
                        } else {
                            c28655q = c28655q;
                            z14 = false;
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z14) {
                            interfaceC30057d = null;
                            objM87133R3 = new f(function10, null);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            interfaceC30057d = null;
                            objM87133R3 = new f(function10, null);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, bool8);
                        c28655q.m87173q(false);
                    } else {
                        z13 = true;
                        c28676v1 = c28676v0;
                        interfaceC30057d = null;
                        if (viewState.equals(AbstractC34075o.e.f142912a)) {
                            c28655q.m87150e0(-1727304034);
                            AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            if (viewState instanceof AbstractC34075o.f) {
                                throw AbstractC11895b.m32003v(1052600104, c28655q, false);
                            }
                            c28655q.m87150e0(1052665725);
                            C34070j c34070jM107729a8 = ((AbstractC34075o.f) viewState).getState();
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v1) {
                                interfaceC28601c2 = interfaceC28601c1;
                                objM87133R2 = new C36269e(3, interfaceC28601c2);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                interfaceC28601c2 = interfaceC28601c1;
                            }
                            function10 = function10;
                            function11 = function11;
                            function12 = function12;
                            m115754H0(c34070jM107729a8, function10, function11, function12, (InterfaceC4339a) objM87133R2, c28655q, (i15 & 112) | 24576 | (i15 & 896) | (i15 & 7168), 0);
                            c28655q.m87173q(false);
                        }
                    }
                    function10 = function10;
                    function11 = function11;
                    function12 = function12;
                    interfaceC28601c2 = interfaceC28601c1;
                }
                if ((i15 & 7168) == 2048) {
                    z16 = z13;
                } else {
                    z16 = false;
                }
                objM87133R5 = c28655q.m87133R();
                if (z16) {
                    objM87133R5 = new c(function12, interfaceC30057d);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new c(function12, interfaceC30057d);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
                if ((i15 & 14) == 4) {
                    z17 = z13;
                } else {
                    z17 = false;
                }
                if ((i15 & 896) == 256) {
                    z18 = z13;
                } else {
                    z18 = false;
                }
                z19 = z17 | z18;
                objM87133R6 = c28655q.m87133R();
                if (z19) {
                    objM87133R6 = new d(viewState, function11, interfaceC28601c2, interfaceC30057d);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new d(viewState, function11, interfaceC28601c2, interfaceC30057d);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, viewState);
                function7 = function10;
                function8 = function11;
                function9 = function12;
            }
            interfaceC30057d = null;
            z13 = true;
            if ((i15 & 7168) == 2048) {
                z16 = z13;
            } else {
                z16 = false;
            }
            objM87133R5 = c28655q.m87133R();
            if (z16) {
                objM87133R5 = new c(function12, interfaceC30057d);
                c28655q.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new c(function12, interfaceC30057d);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
            if ((i15 & 14) == 4) {
                z17 = z13;
            } else {
                z17 = false;
            }
            if ((i15 & 896) == 256) {
                z18 = z13;
            } else {
                z18 = false;
            }
            z19 = z17 | z18;
            objM87133R6 = c28655q.m87133R();
            if (z19) {
                objM87133R6 = new d(viewState, function11, interfaceC28601c2, interfaceC30057d);
                c28655q.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new d(viewState, function11, interfaceC28601c2, interfaceC30057d);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, viewState);
            function7 = function10;
            function8 = function11;
            function9 = function12;
        } else {
            c28655q.m87138X();
            function7 = function4;
            function8 = function5;
            function9 = function6;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static final C23454a0 m115892x1(C34070j c34070j, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a, Function1 function3, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, Composer composer, int i13) {
        InterfaceC28601c1 interfaceC28601c5;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44028b0);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            float f13 = 2 * 8;
            Modifier modifierM66725n = AbstractC22953f.m66725n(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f13, 7));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM66725n);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            AbstractC6721d.a aVar = new AbstractC6721d.a(c34070j.getNavigationBarTitle(), null, AbstractC13673n.m38561h(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q, AbstractC35283c.f150167E), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                interfaceC28601c5 = interfaceC28601c1;
                objM87133R = new C29308g(function1, interfaceC28601c5, 9);
                c28655q.m87172p0(objM87133R);
            } else {
                interfaceC28601c5 = interfaceC28601c1;
            }
            AbstractC6719b.m20143d(null, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
            Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2), "TilesTag");
            boolean zM87157i = c28655q.m87157i(c34070j) | c28655q.m87153g(function2) | c28655q.m87153g(function1) | c28655q.m87153g(interfaceC4339a) | c28655q.m87153g(function3);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                C18434s c18434s = new C18434s(c34070j, function2, function1, interfaceC4339a, function3, interfaceC28601c5, interfaceC28601c2, interfaceC28601c3, interfaceC28601c4);
                c28655q.m87172p0(c18434s);
                objM87133R2 = c18434s;
            }
            AbstractC22674j.m65717c(modifierM3599a, null, null, null, null, null, false, null, (Function1) objM87133R2, c28655q, 6, 510);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final C23454a0 m115894y0(AbstractC34073m it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y1 */
    public static final C23454a0 m115895y1(Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        if (m115787S0(interfaceC28601c1)) {
            function1.invoke(AbstractC32871a.a.f136923a);
        } else {
            function1.invoke(AbstractC32871a.b.f136924a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final C23454a0 m115897z0(AbstractC32871a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z1 */
    public static final C23454a0 m115898z1(C34070j c34070j, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a, Function1 function3, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        List<InterfaceC25312u> listM107703p = c34070j.m107703p();
        C26053f c26053f = (C26053f) LazyColumn;
        c26053f.m77529r(listM107703p.size(), null, new l0(k0.f155373w, listM107703p), new C37816b(new m0(listM107703p, c34070j, function1, function2, interfaceC4339a, function3, interfaceC28601c1, interfaceC28601c2, interfaceC28601c3, interfaceC28601c4), true, 802480018));
        return C23454a0.f92919a;
    }
}
