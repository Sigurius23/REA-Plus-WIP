package no0;

import am0.C0999c;
import am2.C1040r;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import az1.C2165f;
import b91.C2886a;
import bb2.C2931g;
import bc3.InterfaceC2994c0;
import c31.AbstractC3926j;
import c31.C3927k;
import c31.EnumC3919c;
import c41.AbstractC4106r2;
import c41.C4092p2;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.models.AppointmentButtonModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.view.C9812h;
import eh0.C13193b;
import fy1.AbstractC14874j;
import gb1.AbstractC15673b0;
import gb1.AbstractC15674c;
import gf1.C15786e;
import gh0.C15848c;
import gy0.AbstractC16277f;
import h11.AbstractC16611f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j81.C21421e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jf3.C21647a;
import l72.C23407n;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lo0.AbstractC24614y;
import lo0.C24596o;
import lo0.C24598p;
import lo0.C24600q;
import lo0.C24601q0;
import lo0.C24603r0;
import lo0.C24604s;
import lo0.C24605s0;
import lo0.C24606t;
import lo0.C24608u;
import lo0.C24613x;
import lo0.InterfaceC24610v;
import m83.AbstractC25267u;
import m83.C25271y;
import mf2.C25514e;
import mx1.C26003i;
import n72.C26439b;
import nf3.C26669a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p249jc.AbstractC21598x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p719m22.C24965t;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import pf.AbstractC29125c;
import pf3.C29155a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;
import x81.C38072d;
import xf3.C38266c;

/* JADX INFO: renamed from: no0.w */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aU\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a_\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a[\u0010\u0013\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a!\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a3\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u001a\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u00060\u001cH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a5\u0010#\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b#\u0010$\u001a[\u0010*\u001a\u00020\u00062\b\b\u0002\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010)\u001a\u0004\u0018\u00010\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b*\u0010+\u001a\u000f\u0010,\u001a\u00020\u0006H\u0003¢\u0006\u0004\b,\u0010-\u001a+\u0010/\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020.2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b/\u00100\u001a+\u00101\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b1\u00102¨\u00065²\u0006\f\u00104\u001a\u0002038\nX\u008a\u0084\u0002²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002"}, m65681d2 = {"", "usState", "intakeResponses", "rescheduleAppointmentId", "Lkotlin/Function1;", "Llo0/r;", "Ll83/a0;", "onNavigationEvent", "Lcom/whoop/analytics/AnalyticEventModel;", "onAnalyticEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Llo0/y;", "viewState", "Llo0/v;", "onViewEvent", "x", "(Llo0/y;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Llo0/y$d;", "a0", "(Llo0/y$d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "J", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V", "Llo0/s0;", "schedulingDatePicker", "Lkotlin/Function2;", "", "onPillClick", "E", "(Llo0/s0;Lc93/m;Landroidx/compose/runtime/Composer;I)V", "Lc41/p2;", "callout", "S", "(Llo0/s0;Lc41/p2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "Lc31/k;", "nextButton", "selectedTimeSlot", "P", "(Landroidx/compose/ui/Modifier;Lc31/k;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "L", "(Landroidx/compose/runtime/Composer;I)V", "Llo0/y$c;", "N", "(Llo0/y$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "G", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Llo0/x;", "viewModel", "clinician-in-the-loop_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26979w {

    /* JADX INFO: renamed from: no0.w$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f107616w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f107617x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f107618y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f107619z;

        /* JADX INFO: renamed from: no0.w$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42075a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f107620w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42075a(C21647a c21647a) {
                super(0);
                this.f107620w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f107620w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f107616w = c38266c;
            this.f107617x = interfaceC35951a;
            this.f107618y = interfaceC4339a;
            this.f107619z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, lo0.x] */
        @Override // c93.InterfaceC4339a
        public final C24613x invoke() {
            return AbstractC21598x.m60668X(this.f107616w, this.f107617x, new C42075a(this.f107619z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C24613x.class), null, this.f107618y);
        }
    }

    /* JADX INFO: renamed from: no0.w$b */
    @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.view.ClinicianVideoSchedulingFormScreenKt$ClinicianVideoSchedulingFormScreen$2$1", m100430f = "ClinicianVideoSchedulingFormScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f107621w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f107622x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f107623y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC23462h f107624z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f107622x = str;
            this.f107623y = str2;
            this.f107624z = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f107622x, this.f107623y, this.f107624z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f107621w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC26979w.m80889z(this.f107624z).m71871n(new C24600q(this.f107622x, this.f107623y));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: no0.w$c */
    @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.view.ClinicianVideoSchedulingFormScreenKt$ClinicianVideoSchedulingFormScreen$3$1", m100430f = "ClinicianVideoSchedulingFormScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f107625w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AnalyticEventModel f107626x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f107627y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AnalyticEventModel analyticEventModel, Function1 function1, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f107626x = analyticEventModel;
            this.f107627y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f107626x, this.f107627y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f107625w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AnalyticEventModel analyticEventModel = this.f107626x;
            if (analyticEventModel != null) {
                this.f107627y.invoke(analyticEventModel);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: no0.w$d */
    @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.view.ClinicianVideoSchedulingFormScreenKt$SavingState$1$1", m100430f = "ClinicianVideoSchedulingFormScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f107628w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC24614y.c f107629x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f107630y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC24614y.c cVar, Function1 function1, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f107629x = cVar;
            this.f107630y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f107629x, this.f107630y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f107628w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C9598e c9598eM71872b = this.f107629x.getSaveSuccessDestination();
            if (c9598eM71872b != null) {
                this.f107630y.invoke(new C24596o(c9598eM71872b));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: no0.w$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f107631w;

        public e(Function1 function1) {
            this.f107631w = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m80890a(AppointmentButtonModel slot) {
            AbstractC22676k.m65750j(slot, "slot");
            this.f107631w.invoke(new C24608u(slot.getDate()));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m80890a((AppointmentButtonModel) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: no0.w$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f107632w = new f();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C24603r0 c24603r0) {
            return null;
        }
    }

    /* JADX INFO: renamed from: no0.w$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f107633w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f107634x;

        public g(Function1 function1, List list) {
            this.f107633w = function1;
            this.f107634x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m80892a(int i13) {
            return this.f107633w.invoke(this.f107634x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m80892a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: no0.w$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f107635w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f107636x;

        public h(Function1 function1, List list) {
            this.f107635w = function1;
            this.f107636x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m80893a(int i13) {
            return this.f107635w.invoke(this.f107636x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m80893a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: no0.w$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f107637w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C24605s0 f107638x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f107639y;

        public i(List list, C24605s0 c24605s0, Function1 function1) {
            this.f107637w = list;
            this.f107638x = c24605s0;
            this.f107639y = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m80894a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
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
            C24603r0 c24603r0 = (C24603r0) this.f107637w.get(i13);
            c28655q.m87150e0(-2086513569);
            String strM71849c = this.f107638x.getSelectedTimeSlot();
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            boolean zM87153g = c28655q.m87153g(this.f107639y);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new e(this.f107639y);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC26980w0.m80899e(modifierM3409f, c24603r0, strM71849c, (Function1) objM87133R, c28655q, 6, 0);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m80894a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: A */
    private static final AbstractC24614y m80833A(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC24614y) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m80834B(InterfaceC23462h interfaceC23462h, InterfaceC24610v it) {
        AbstractC22676k.m65750j(it, "it");
        m80889z(interfaceC23462h).m71871n(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m80835C(String str, String str2, String str3, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m80886w(str, str2, str3, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m80836D(AbstractC24614y abstractC24614y, String str, String str2, String str3, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m80887x(abstractC24614y, str, str2, str3, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: E */
    private static final void m80837E(C24605s0 c24605s0, InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2011057948);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c24605s0) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4351m) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 4 * f13, 0.0f, 0.0f, 13), 0.0f, 0.0f, 0.0f, f14, 7);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC29125c.m88520b(AbstractC8693b.m21274h(c24605s0.getDateDisplay(), c28655q, TextResource.$stable), AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2)), null, "datePickerHeading", C26972s0.f107607a.m80809b(), c28655q, 27696, 4);
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f14, 0.0f, 0.0f, 13);
            List<C24601q0> listM71848b = c24605s0.m71848b();
            int i15 = i14;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM71848b, 10));
            Iterator<T> it = listM71848b.iterator();
            while (it.hasNext()) {
                arrayList.add(((C24601q0) it.next()).getDateDisplay());
            }
            AbstractC16611f.m47150h(modifierM3398t2, arrayList, interfaceC4351m, null, null, null, null, null, c28655q, ((i15 << 3) & 896) | 6, 248);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26003i(c24605s0, interfaceC4351m, i13, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m80838F(C24605s0 c24605s0, InterfaceC4351m interfaceC4351m, int i13, Composer composer, int i14) {
        m80837E(c24605s0, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    private static final void m80839G(String str, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-958807071);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, null, i15, 0 == true ? 1 : 0), false, null, 6, null);
            TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC16277f.f62259L1, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
            TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC16277f.f62292W1, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
            boolean z4 = ((i14 & 112) == 32) | ((i14 & 14) == 4);
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C26969r(function1, str, 1);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            int i16 = AbstractC33208p0.b.f138467h;
            int i17 = TextResource.C8688b.f25889c;
            AbstractC33199m0.m105214F(bVar, c8688b, null, c8688b2, interfaceC4339a, false, false, null, null, null, false, false, c28655q, i16 | (i17 << 3) | (i17 << 9), 0, 4068);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15848c(str, i13, 3, function1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m80840H(Function1 function1, String str) {
        function1.invoke(new C24600q(str, null, 2, 0 == true ? 1 : 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m80841I(String str, Function1 function1, int i13, Composer composer, int i14) {
        m80839G(str, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: J */
    private static final void m80842J(TextResource textResource, TextResource textResource2, Composer composer, int i13) {
        int i14;
        boolean z4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1300805073);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(textResource) : c28655q.m87157i(textResource) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(textResource2) : c28655q.m87157i(textResource2) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f14, 0.0f, 0.0f, 13), f14, 0.0f, 2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
            int i15 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, (i14 & 14) | i15);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q, i16).getBrandWhite();
            C2886a c2886aM8418P = c38072d.m121952e(c28655q, i16).getT3();
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P, null, c28655q, 0, i17, 196602);
            c28655q = c28655q;
            if (textResource2 == null) {
                c28655q.m87150e0(-1407607779);
                c28655q.m87173q(false);
                z4 = true;
            } else {
                c28655q.m87150e0(-1407607778);
                z4 = true;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q, i15), AbstractC1099a.m3398t(c2314t, 0.0f, 1 * f13, 0.0f, 0.0f, 13), c38072d.m121949b(c28655q, i16).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB1(), null, c28655q, 48, i17, 196600);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z4);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0999c(textResource, textResource2, i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m80843K(TextResource textResource, TextResource textResource2, int i13, Composer composer, int i14) {
        m80842J(textResource, textResource2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: L */
    private static final void m80844L(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1406416489);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62274Q1)), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24965t(i13, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m80845M(int i13, Composer composer, int i14) {
        m80844L(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: N */
    private static final void m80846N(AbstractC24614y.c cVar, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-641755944);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(cVar) : c28655q.m87157i(cVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C9598e c9598eM71872b = cVar.getSaveSuccessDestination();
            boolean z4 = ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q.m87157i(cVar))) | ((i14 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new d(cVar, function1, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c9598eM71872b);
            AbstractC33199m0.m105214F(new AbstractC33208p0.d(cVar.getSavingTitle()), cVar.getSavingSubtitle(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.d.f138473f | (TextResource.$stable << 3), 0, 4092);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26003i(cVar, function1, i13, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m80847O(AbstractC24614y.c cVar, Function1 function1, int i13, Composer composer, int i14) {
        m80846N(cVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0193  */
    /* JADX WARN: Code duplicated, block: B:102:0x0195  */
    /* JADX WARN: Code duplicated, block: B:105:0x019d  */
    /* JADX WARN: Code duplicated, block: B:106:0x019f  */
    /* JADX WARN: Code duplicated, block: B:109:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:110:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:113:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:114:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:117:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:121:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:123:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:126:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:78:0x0100  */
    /* JADX WARN: Code duplicated, block: B:81:0x0113  */
    /* JADX WARN: Code duplicated, block: B:84:0x0124  */
    /* JADX WARN: Code duplicated, block: B:88:0x015d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0161  */
    /* JADX WARN: Code duplicated, block: B:92:0x016e  */
    /* JADX WARN: Code duplicated, block: B:94:0x017c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0189  */
    /* JADX WARN: Code duplicated, block: B:98:0x018b  */
    /* JADX INFO: renamed from: P */
    private static final void m80848P(Modifier modifier, C3927k c3927k, String str, String str2, String str3, String str4, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        String str5;
        boolean z4;
        Modifier modifier3;
        String str6;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        String str7;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Modifier modifier4;
        int iHashCode2;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objM87133R;
        boolean z19;
        int i16;
        int i17;
        int i18;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(555128365);
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
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(c3927k) : c28655q.m87157i(c3927k) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(str) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87153g(str2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i24 = i14 & 16;
        if (i24 == 0) {
            if ((i13 & 24576) == 0) {
                str5 = str3;
                i15 |= c28655q.m87153g(str5) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((196608 & i13) != 0) {
                if (c28655q.m87153g(str4)) {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i18;
            }
            if ((i13 & 1572864) == 0) {
                if (c28655q.m87157i(function1)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i15 |= i17;
            }
            if ((i15 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier2 = c2314t;
                }
                if (i24 != 0) {
                    str7 = null;
                } else {
                    str7 = str5;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier2);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, c28655q, 6);
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
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    modifier4 = modifier2;
                } else {
                    modifier4 = modifier2;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    float f13 = 4 * 8;
                    Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, f13, 0.0f, f13, f13, 2);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                    c28655q.m87158i0();
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
                    if ((458752 & i15) == 131072) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((3670016 & i15) == 1048576) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z24 = z13 | z14;
                    if ((i15 & 896) == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z25 = z24 | z15;
                    if ((i15 & 7168) == 2048) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z26 = z25 | z16;
                    if ((57344 & i15) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z26 | z17;
                    objM87133R = c28655q.m87133R();
                    if (!z18 || objM87133R == C28635l.f115821a) {
                        z19 = true;
                        i16 = 0;
                        C1040r c1040r = new C1040r(str4, function1, str, str2, str7, 22);
                        c28655q.m87172p0(c1040r);
                        objM87133R = c1040r;
                    } else {
                        z19 = true;
                        i16 = 0;
                    }
                    AbstractC3926j.m11931e(c3927k, (Function1) objM87133R, c28655q, C3927k.f16020r | ((i15 >> 3) & 14), i16);
                    c28655q.m87173q(z19);
                    c28655q.m87173q(z19);
                    modifier3 = modifier4;
                    str6 = str7;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                float f14 = 4 * 8;
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, f14, 0.0f, f14, f14, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                if ((458752 & i15) == 131072) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((3670016 & i15) == 1048576) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z27 = z13 | z14;
                if ((i15 & 896) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z28 = z27 | z15;
                if ((i15 & 7168) == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z29 = z28 | z16;
                if ((57344 & i15) == 16384) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z29 | z17;
                objM87133R = c28655q.m87133R();
                if (z18) {
                    z19 = true;
                    i16 = 0;
                    C1040r c1040r2 = new C1040r(str4, function1, str, str2, str7, 22);
                    c28655q.m87172p0(c1040r2);
                    objM87133R = c1040r2;
                } else {
                    z19 = true;
                    i16 = 0;
                    C1040r c1040r3 = new C1040r(str4, function1, str, str2, str7, 22);
                    c28655q.m87172p0(c1040r3);
                    objM87133R = c1040r3;
                }
                AbstractC3926j.m11931e(c3927k, (Function1) objM87133R, c28655q, C3927k.f16020r | ((i15 >> 3) & 14), i16);
                c28655q.m87173q(z19);
                c28655q.m87173q(z19);
                modifier3 = modifier4;
                str6 = str7;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                str6 = str5;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2931g((Object) modifier3, (Object) c3927k, (Object) str, (Object) str2, (Object) str6, (Object) str4, function1, i13, i14, 15);
            }
        }
        i15 |= 24576;
        str5 = str3;
        if ((196608 & i13) != 0) {
            if (c28655q.m87153g(str4)) {
                i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i18;
        }
        if ((i13 & 1572864) == 0) {
            if (c28655q.m87157i(function1)) {
                i17 = 1048576;
            } else {
                i17 = 524288;
            }
            i15 |= i17;
        }
        if ((i15 & 599187) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i19 != 0) {
                modifier2 = c2314t;
            }
            if (i24 != 0) {
                str7 = null;
            } else {
                str7 = str5;
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier2);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M66759a2);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                modifier4 = modifier2;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i8 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N4);
                float f15 = 4 * 8;
                Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t, f15, 0.0f, f15, f15, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3398t3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N5);
                if ((458752 & i15) == 131072) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((3670016 & i15) == 1048576) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z210 = z13 | z14;
                if ((i15 & 896) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z211 = z210 | z15;
                if ((i15 & 7168) == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z212 = z211 | z16;
                if ((57344 & i15) == 16384) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z212 | z17;
                objM87133R = c28655q.m87133R();
                if (z18) {
                    z19 = true;
                    i16 = 0;
                    C1040r c1040r4 = new C1040r(str4, function1, str, str2, str7, 22);
                    c28655q.m87172p0(c1040r4);
                    objM87133R = c1040r4;
                } else {
                    z19 = true;
                    i16 = 0;
                    C1040r c1040r5 = new C1040r(str4, function1, str, str2, str7, 22);
                    c28655q.m87172p0(c1040r5);
                    objM87133R = c1040r5;
                }
                AbstractC3926j.m11931e(c3927k, (Function1) objM87133R, c28655q, C3927k.f16020r | ((i15 >> 3) & 14), i16);
                c28655q.m87173q(z19);
                c28655q.m87173q(z19);
                modifier3 = modifier4;
                str6 = str7;
            } else {
                modifier4 = modifier2;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N4);
            float f16 = 4 * 8;
            Modifier modifierM3398t4 = AbstractC1099a.m3398t(c2314t, f16, 0.0f, f16, f16, 2);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3398t4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
            if ((458752 & i15) == 131072) {
                z13 = true;
            } else {
                z13 = false;
            }
            if ((3670016 & i15) == 1048576) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z213 = z13 | z14;
            if ((i15 & 896) == 256) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z214 = z213 | z15;
            if ((i15 & 7168) == 2048) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z215 = z214 | z16;
            if ((57344 & i15) == 16384) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = z215 | z17;
            objM87133R = c28655q.m87133R();
            if (z18) {
                z19 = true;
                i16 = 0;
                C1040r c1040r6 = new C1040r(str4, function1, str, str2, str7, 22);
                c28655q.m87172p0(c1040r6);
                objM87133R = c1040r6;
            } else {
                z19 = true;
                i16 = 0;
                C1040r c1040r7 = new C1040r(str4, function1, str, str2, str7, 22);
                c28655q.m87172p0(c1040r7);
                objM87133R = c1040r7;
            }
            AbstractC3926j.m11931e(c3927k, (Function1) objM87133R, c28655q, C3927k.f16020r | ((i15 >> 3) & 14), i16);
            c28655q.m87173q(z19);
            c28655q.m87173q(z19);
            modifier3 = modifier4;
            str6 = str7;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            str6 = str5;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2931g((Object) modifier3, (Object) c3927k, (Object) str, (Object) str2, (Object) str6, (Object) str4, function1, i13, i14, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m80849Q(String str, Function1 function1, String str2, String str3, String str4, EnumC3919c it) {
        AbstractC22676k.m65750j(it, "it");
        if (str != null) {
            function1.invoke(new C24604s(str2, str3, str, str4));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m80850R(Modifier modifier, C3927k c3927k, String str, String str2, String str3, String str4, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m80848P(modifier, c3927k, str, str2, str3, str4, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: S */
    private static final void m80851S(C24605s0 c24605s0, C4092p2 c4092p2, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(613136063);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c24605s0) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(c4092p2) : c28655q.m87157i(c4092p2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            AbstractC29125c.m88520b(AbstractC8693b.m21274h(c24605s0.getDateDisplay(), c28655q, TextResource.$stable), null, null, "scheduleSectionsByDate", AbstractC37817c.m121344e(2106059457, c28655q, new C26949h(c24605s0, c4092p2, function1, 1)), c28655q, 27648, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23407n(c24605s0, c4092p2, function1, i13, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m80852T(C24605s0 c24605s0, C4092p2 c4092p2, Function1 function1, String dateLabel, Composer composer, int i13) {
        int i14;
        Object next;
        AbstractC22676k.m65750j(dateLabel, "dateLabel");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87153g(dateLabel) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87150e0(993544445);
            Iterator<T> it = c24605s0.m71848b().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC22676k.m65745e(AbstractC8693b.m21274h(((C24601q0) next).getSelectionDisplay(), c28655q, TextResource.$stable), dateLabel));
            C24601q0 c24601q0 = (C24601q0) next;
            c28655q.m87173q(false);
            List<InterfaceC25312u> listM71839d = c24601q0 != null ? c24601q0.m71839d() : null;
            C25271y c25271y = C25271y.f99162w;
            List<InterfaceC25312u> list = listM71839d == null ? c25271y : listM71839d;
            List<C24603r0> listM71837b = c24601q0 != null ? c24601q0.m71837b() : null;
            List<C24603r0> list2 = listM71837b == null ? c25271y : listM71837b;
            float f13 = 8;
            Modifier modifierM44081e = AbstractC15674c.m44081e(AbstractC15674c.m44085i(AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), 0.0f, 0.0f, 0.0f, 10 * f13, 7), 0.0f, null, 3, null), AbstractC26973t.m80810a());
            C22971k c22971kM66746i = AbstractC22977m.m66746i(4 * f13);
            float f14 = 2 * f13;
            C22976l1 c22976l1 = new C22976l1(f14, f14, f14, 6 * f13);
            boolean zM87157i = c28655q.m87157i(c4092p2) | c28655q.m87157i(list) | c28655q.m87157i(list2) | c28655q.m87157i(c24605s0) | c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                C1040r c1040r = new C1040r((Object) c4092p2, (Object) list, (Object) list2, (Object) c24605s0, function1, 23);
                c28655q.m87172p0(c1040r);
                objM87133R = c1040r;
            }
            AbstractC22674j.m65717c(modifierM44081e, null, c22976l1, c22971kM66746i, null, null, false, null, (Function1) objM87133R, c28655q, 24576, 490);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m80853U(C4092p2 c4092p2, List list, List list2, C24605s0 c24605s0, Function1 function1, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        if (c4092p2 != null) {
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C26977v(c4092p2, 0), true, 1144081393), 3);
        }
        if (!list.isEmpty()) {
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C13193b(list, 2), true, 592399976), 3);
        }
        C26053f c26053f = (C26053f) LazyColumn;
        c26053f.m77529r(list2.size(), new g(new C26439b(14), list2), new h(f.f107632w, list2), new C37816b(new i(list2, c24605s0, function1), true, 802480018));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m80854V(C4092p2 c4092p2, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC4106r2.m12647f(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), c4092p2, null, c28655q, (C4092p2.f16593v << 3) | 6, 4);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m80855W(List list, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
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
            c28655q.m87150e0(-1744045484);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, new C15786e(28), null, c28655q, 0, 10);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final Modifier m80856X(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1834188560);
        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
        c28655q.m87173q(false);
        return modifierM3409f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final Object m80857Y(C24603r0 it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m80858Z(C24605s0 c24605s0, C4092p2 c4092p2, Function1 function1, int i13, Composer composer, int i14) {
        m80851S(c24605s0, c4092p2, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:70:0x0130  */
    /* JADX WARN: Code duplicated, block: B:71:0x0134  */
    /* JADX WARN: Code duplicated, block: B:76:0x014f  */
    /* JADX WARN: Code duplicated, block: B:79:0x018a  */
    /* JADX WARN: Code duplicated, block: B:80:0x018c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0197  */
    /* JADX WARN: Code duplicated, block: B:87:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:88:0x01de  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:94:0x024a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0254  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a0 */
    private static final void m80860a0(AbstractC24614y.d dVar, String str, String str2, String str3, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        AbstractC24614y.d dVar2;
        int i15;
        String str4;
        boolean z4;
        String str5;
        C28677v1 c28677v1M87180u;
        String str6;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        boolean z13;
        Object objM87133R;
        boolean z14;
        Object objM87133R2;
        int i16;
        int i17;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(284998322);
        if ((i13 & 6) == 0) {
            dVar2 = dVar;
            i15 = (c28655q.m87157i(dVar2) ? 4 : 2) | i13;
        } else {
            dVar2 = dVar;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(str2) ? 256 : 128;
        }
        int i18 = i14 & 8;
        if (i18 == 0) {
            if ((i13 & 3072) == 0) {
                str4 = str3;
                i15 |= c28655q.m87153g(str4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(function1)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            if ((196608 & i13) == 0) {
                if (c28655q.m87157i(function2)) {
                    i16 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i16 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i16;
            }
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i18 != 0) {
                    str6 = null;
                } else {
                    str6 = str4;
                }
                C24605s0 c24605s0M71851a = dVar2.getScreenState().getFormContent().getSchedulingDatePicker();
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
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
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
                String str7 = str6;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3407d2);
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
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                AbstractC6721d.a aVar = new AbstractC6721d.a(null, null, AbstractC13673n.m38561h(C38072d.f163053a), null, null, null, null, null, false, null, null, null, null, null, null, null, 65531, null);
                if ((458752 & i15) == 131072) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new C25514e(function2, 19);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC6719b.m20143d(null, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
                TextResource textResourceM71866e = dVar.getScreenState().getTitle();
                TextResource textResourceM71865d = dVar.getScreenState().getSubtitle();
                int i19 = TextResource.$stable;
                m80842J(textResourceM71866e, textResourceM71865d, c28655q, i19 | (i19 << 3));
                if ((i15 & 57344) == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z14 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C9812h(function1, 4);
                    c28655q.m87172p0(objM87133R2);
                }
                m80837E(c24605s0M71851a, (InterfaceC4351m) objM87133R2, c28655q, 0);
                m80851S(c24605s0M71851a, dVar.getScreenState().getCallout(), function1, c28655q, (C4092p2.f16593v << 3) | ((i15 >> 6) & 896));
                c28655q.m87173q(true);
                int i24 = i15 << 6;
                str5 = str7;
                m80848P(C1100b.f4583a.mo3400a(c2314t, C2299e.f9105H), dVar.getScreenState().getNextButton(), str2, str, str5, c24605s0M71851a.getSelectedTimeSlot(), function1, c28655q, ((i15 << 3) & 57344) | (C3927k.f16020r << 3) | (i15 & 896) | (i24 & 7168) | (3670016 & i24), 0);
                c28655q.m87173q(true);
            } else {
                c28655q.m87138X();
                str5 = str4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2165f(i13, i14, 25, dVar, str, str2, str5, function1, function2);
            }
        }
        i15 |= 3072;
        str4 = str3;
        if ((i13 & 24576) == 0) {
            if (c28655q.m87157i(function1)) {
                i17 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i17 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i17;
        }
        if ((196608 & i13) == 0) {
            if (c28655q.m87157i(function2)) {
                i16 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i16 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i16;
        }
        if ((74899 & i15) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i18 != 0) {
                str6 = null;
            } else {
                str6 = str4;
            }
            C24605s0 c24605s0M71851a2 = dVar2.getScreenState().getFormContent().getSchedulingDatePicker();
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, c2314t2);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3407d3);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
            Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, c2314t2);
            String str8 = str6;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3407d4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            AbstractC6721d.a aVar2 = new AbstractC6721d.a(null, null, AbstractC13673n.m38561h(C38072d.f163053a), null, null, null, null, null, false, null, null, null, null, null, null, null, 65531, null);
            if ((458752 & i15) == 131072) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (z13) {
                objM87133R = new C25514e(function2, 19);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C25514e(function2, 19);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(null, aVar2, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
            TextResource textResourceM71866e2 = dVar.getScreenState().getTitle();
            TextResource textResourceM71865d2 = dVar.getScreenState().getSubtitle();
            int i110 = TextResource.$stable;
            m80842J(textResourceM71866e2, textResourceM71865d2, c28655q, i110 | (i110 << 3));
            if ((i15 & 57344) == 16384) {
                z14 = true;
            } else {
                z14 = false;
            }
            objM87133R2 = c28655q.m87133R();
            if (z14) {
                objM87133R2 = new C9812h(function1, 4);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C9812h(function1, 4);
                c28655q.m87172p0(objM87133R2);
            }
            m80837E(c24605s0M71851a2, (InterfaceC4351m) objM87133R2, c28655q, 0);
            m80851S(c24605s0M71851a2, dVar.getScreenState().getCallout(), function1, c28655q, (C4092p2.f16593v << 3) | ((i15 >> 6) & 896));
            c28655q.m87173q(true);
            int i25 = i15 << 6;
            str5 = str8;
            m80848P(C1100b.f4583a.mo3400a(c2314t2, C2299e.f9105H), dVar.getScreenState().getNextButton(), str2, str, str5, c24605s0M71851a2.getSelectedTimeSlot(), function1, c28655q, ((i15 << 3) & 57344) | (C3927k.f16020r << 3) | (i15 & 896) | (i25 & 7168) | (3670016 & i25), 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
            str5 = str4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2165f(i13, i14, 25, dVar, str, str2, str5, function1, function2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m80862b0(Function1 function1) {
        function1.invoke(C24598p.f96138a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m80864c0(Function1 function1, String selectionDisplay, Long l7) {
        AbstractC22676k.m65750j(selectionDisplay, "selectionDisplay");
        function1.invoke(new C24606t(selectionDisplay));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m80866d0(AbstractC24614y.d dVar, String str, String str2, String str3, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m80860a0(dVar, str, str2, str3, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0199  */
    /* JADX WARN: Code duplicated, block: B:103:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:105:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:108:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:44:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x0091  */
    /* JADX WARN: Code duplicated, block: B:49:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:70:0x0117  */
    /* JADX WARN: Code duplicated, block: B:71:0x011a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0124  */
    /* JADX WARN: Code duplicated, block: B:75:0x0127  */
    /* JADX WARN: Code duplicated, block: B:78:0x0130 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x0135  */
    /* JADX WARN: Code duplicated, block: B:84:0x014b  */
    /* JADX WARN: Code duplicated, block: B:85:0x014f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0152  */
    /* JADX WARN: Code duplicated, block: B:88:0x0157  */
    /* JADX WARN: Code duplicated, block: B:92:0x0165  */
    /* JADX WARN: Code duplicated, block: B:95:0x016f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:96:0x0171  */
    /* JADX WARN: Code duplicated, block: B:99:0x0197 A[ADDED_TO_REGION] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public static final void m80886w(String usState, String intakeResponses, String str, Function1 onNavigationEvent, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        String str2;
        int i16;
        Function1 function2;
        int i17;
        boolean z4;
        String str3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Object obj;
        Function1 function4;
        C26669a c26669a;
        C38266c c38266c;
        C21647a c21647aM114690r;
        boolean zM87153g;
        Object objM87133R;
        InterfaceC23462h interfaceC23462h;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R2;
        InterfaceC30057d interfaceC30057d;
        AbstractC24614y abstractC24614yM80833A;
        AbstractC24614y.d dVar;
        AnalyticEventModel analyticEventModelM71875b;
        boolean zM87157i;
        Object objM87133R3;
        boolean zM87157i2;
        Object objM87133R4;
        AbstractC24614y.d dVar2;
        Object objM87133R5;
        int i18;
        AbstractC22676k.m65750j(usState, "usState");
        AbstractC22676k.m65750j(intakeResponses, "intakeResponses");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1021789978);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(usState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(intakeResponses) ? 32 : 16;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                str2 = str;
                i15 |= c28655q.m87153g(str2) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(onNavigationEvent)) {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i18;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i19 != 0) {
                        str2 = null;
                    }
                    obj = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == obj) {
                            objM87133R5 = new C26439b(13);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function4 = (Function1) objM87133R5;
                    } else {
                        function4 = function2;
                    }
                    c28655q.m87152f0(-1688186518);
                    c26669a = C29155a.f118017b;
                    if (c26669a != null) {
                        throw new IllegalStateException("KoinApplication has not been started");
                    }
                    c38266c = c26669a.f106046a.f159364d;
                    c21647aM114690r = AbstractC36095b.m114690r(c28655q, -1688186210, c28655q, false, -3686552);
                    zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
                    objM87133R = c28655q.m87133R();
                    if (zM87153g || objM87133R == obj) {
                        objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                        c28655q.m87172p0(objM87133R);
                    }
                    c28655q.m87173q(false);
                    interfaceC23462h = (InterfaceC23462h) objM87133R;
                    c28655q.m87173q(false);
                    InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(m80889z(interfaceC23462h).getViewState(), AbstractC24614y.b.f96213b, null, c28655q, 48, 2);
                    boolean zM87157i3 = c28655q.m87157i(interfaceC23462h);
                    if ((i15 & 14) == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z16 = zM87157i3 | z13;
                    if ((i15 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z16 | z14;
                    objM87133R2 = c28655q.m87133R();
                    if (!z15 || objM87133R2 == obj) {
                        interfaceC30057d = null;
                        objM87133R2 = new b(usState, str2, interfaceC23462h, null);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        interfaceC30057d = null;
                    }
                    AbstractC28683x.m87254h(usState, str2, (InterfaceC4351m) objM87133R2, c28655q);
                    abstractC24614yM80833A = m80833A(interfaceC28601c1M87260n);
                    if (abstractC24614yM80833A instanceof AbstractC24614y.d) {
                        dVar2 = (AbstractC24614y.d) abstractC24614yM80833A;
                    } else {
                        dVar = interfaceC30057d;
                    }
                    if (dVar != 0) {
                        dVar = dVar2;
                        analyticEventModelM71875b = dVar.getAnalyticEvent();
                    } else {
                        dVar = dVar2;
                        analyticEventModelM71875b = interfaceC30057d;
                    }
                    zM87157i = c28655q.m87157i(analyticEventModelM71875b) | ((57344 & i15) == 16384);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i || objM87133R3 == obj) {
                        objM87133R3 = new c(analyticEventModelM71875b, function4, interfaceC30057d);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, analyticEventModelM71875b);
                    AbstractC14874j.m42904c(m80833A(interfaceC28601c1M87260n), "healthcare_loop_scheduling_form", c28655q, 48);
                    AbstractC24614y abstractC24614yM80833A2 = m80833A(interfaceC28601c1M87260n);
                    zM87157i2 = c28655q.m87157i(interfaceC23462h);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i2 || objM87133R4 == obj) {
                        objM87133R4 = new C26967q(interfaceC23462h, 1);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function2 = function4;
                    String str4 = str2;
                    m80887x(abstractC24614yM80833A2, usState, intakeResponses, str4, (Function1) objM87133R4, onNavigationEvent, c28655q, ((i15 << 6) & 458752) | ((i15 << 3) & 8176), 0);
                    str3 = str4;
                } else {
                    c28655q.m87138X();
                    str3 = str2;
                }
                function3 = function2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C21421e(i13, i14, 8, usState, intakeResponses, str3, onNavigationEvent, function3, false);
                }
            }
            i15 |= 24576;
            function2 = function1;
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i19 != 0) {
                    str2 = null;
                }
                obj = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == obj) {
                        objM87133R5 = new C26439b(13);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                } else {
                    function4 = function2;
                }
                c28655q.m87152f0(-1688186518);
                c26669a = C29155a.f118017b;
                if (c26669a != null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                c38266c = c26669a.f106046a.f159364d;
                c21647aM114690r = AbstractC36095b.m114690r(c28655q, -1688186210, c28655q, false, -3686552);
                zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
                objM87133R = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                interfaceC23462h = (InterfaceC23462h) objM87133R;
                c28655q.m87173q(false);
                InterfaceC28601c1 interfaceC28601c1M87260n2 = AbstractC28683x.m87260n(m80889z(interfaceC23462h).getViewState(), AbstractC24614y.b.f96213b, null, c28655q, 48, 2);
                boolean zM87157i4 = c28655q.m87157i(interfaceC23462h);
                if ((i15 & 14) == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z17 = zM87157i4 | z13;
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z17 | z14;
                objM87133R2 = c28655q.m87133R();
                if (z15) {
                    interfaceC30057d = null;
                    objM87133R2 = new b(usState, str2, interfaceC23462h, null);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    interfaceC30057d = null;
                    objM87133R2 = new b(usState, str2, interfaceC23462h, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87254h(usState, str2, (InterfaceC4351m) objM87133R2, c28655q);
                abstractC24614yM80833A = m80833A(interfaceC28601c1M87260n2);
                if (abstractC24614yM80833A instanceof AbstractC24614y.d) {
                    dVar2 = (AbstractC24614y.d) abstractC24614yM80833A;
                } else {
                    dVar = interfaceC30057d;
                }
                if (dVar != 0) {
                    dVar = dVar2;
                    analyticEventModelM71875b = dVar.getAnalyticEvent();
                } else {
                    dVar = dVar2;
                    analyticEventModelM71875b = interfaceC30057d;
                }
                zM87157i = c28655q.m87157i(analyticEventModelM71875b) | ((57344 & i15) == 16384);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R3 = new c(analyticEventModelM71875b, function4, interfaceC30057d);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new c(analyticEventModelM71875b, function4, interfaceC30057d);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, analyticEventModelM71875b);
                AbstractC14874j.m42904c(m80833A(interfaceC28601c1M87260n2), "healthcare_loop_scheduling_form", c28655q, 48);
                AbstractC24614y abstractC24614yM80833A3 = m80833A(interfaceC28601c1M87260n2);
                zM87157i2 = c28655q.m87157i(interfaceC23462h);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R4 = new C26967q(interfaceC23462h, 1);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C26967q(interfaceC23462h, 1);
                    c28655q.m87172p0(objM87133R4);
                }
                function2 = function4;
                String str5 = str2;
                m80887x(abstractC24614yM80833A3, usState, intakeResponses, str5, (Function1) objM87133R4, onNavigationEvent, c28655q, ((i15 << 6) & 458752) | ((i15 << 3) & 8176), 0);
                str3 = str5;
            } else {
                c28655q.m87138X();
                str3 = str2;
            }
            function3 = function2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21421e(i13, i14, 8, usState, intakeResponses, str3, onNavigationEvent, function3, false);
            }
        }
        i15 |= 384;
        str2 = str;
        if ((i13 & 3072) == 0) {
            if (c28655q.m87157i(onNavigationEvent)) {
                i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i18;
        }
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i19 != 0) {
                    str2 = null;
                }
                obj = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == obj) {
                        objM87133R5 = new C26439b(13);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                } else {
                    function4 = function2;
                }
                c28655q.m87152f0(-1688186518);
                c26669a = C29155a.f118017b;
                if (c26669a != null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                c38266c = c26669a.f106046a.f159364d;
                c21647aM114690r = AbstractC36095b.m114690r(c28655q, -1688186210, c28655q, false, -3686552);
                zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
                objM87133R = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                interfaceC23462h = (InterfaceC23462h) objM87133R;
                c28655q.m87173q(false);
                InterfaceC28601c1 interfaceC28601c1M87260n3 = AbstractC28683x.m87260n(m80889z(interfaceC23462h).getViewState(), AbstractC24614y.b.f96213b, null, c28655q, 48, 2);
                boolean zM87157i5 = c28655q.m87157i(interfaceC23462h);
                if ((i15 & 14) == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z18 = zM87157i5 | z13;
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z18 | z14;
                objM87133R2 = c28655q.m87133R();
                if (z15) {
                    interfaceC30057d = null;
                    objM87133R2 = new b(usState, str2, interfaceC23462h, null);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    interfaceC30057d = null;
                    objM87133R2 = new b(usState, str2, interfaceC23462h, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87254h(usState, str2, (InterfaceC4351m) objM87133R2, c28655q);
                abstractC24614yM80833A = m80833A(interfaceC28601c1M87260n3);
                if (abstractC24614yM80833A instanceof AbstractC24614y.d) {
                    dVar2 = (AbstractC24614y.d) abstractC24614yM80833A;
                } else {
                    dVar = interfaceC30057d;
                }
                if (dVar != 0) {
                    dVar = dVar2;
                    analyticEventModelM71875b = dVar.getAnalyticEvent();
                } else {
                    dVar = dVar2;
                    analyticEventModelM71875b = interfaceC30057d;
                }
                zM87157i = c28655q.m87157i(analyticEventModelM71875b) | ((57344 & i15) == 16384);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R3 = new c(analyticEventModelM71875b, function4, interfaceC30057d);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new c(analyticEventModelM71875b, function4, interfaceC30057d);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, analyticEventModelM71875b);
                AbstractC14874j.m42904c(m80833A(interfaceC28601c1M87260n3), "healthcare_loop_scheduling_form", c28655q, 48);
                AbstractC24614y abstractC24614yM80833A4 = m80833A(interfaceC28601c1M87260n3);
                zM87157i2 = c28655q.m87157i(interfaceC23462h);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R4 = new C26967q(interfaceC23462h, 1);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C26967q(interfaceC23462h, 1);
                    c28655q.m87172p0(objM87133R4);
                }
                function2 = function4;
                String str6 = str2;
                m80887x(abstractC24614yM80833A4, usState, intakeResponses, str6, (Function1) objM87133R4, onNavigationEvent, c28655q, ((i15 << 6) & 458752) | ((i15 << 3) & 8176), 0);
                str3 = str6;
            } else {
                c28655q.m87138X();
                str3 = str2;
            }
            function3 = function2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21421e(i13, i14, 8, usState, intakeResponses, str3, onNavigationEvent, function3, false);
            }
        }
        i15 |= 24576;
        function2 = function1;
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i19 != 0) {
                str2 = null;
            }
            obj = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == obj) {
                    objM87133R5 = new C26439b(13);
                    c28655q.m87172p0(objM87133R5);
                }
                function4 = (Function1) objM87133R5;
            } else {
                function4 = function2;
            }
            c28655q.m87152f0(-1688186518);
            c26669a = C29155a.f118017b;
            if (c26669a != null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            c38266c = c26669a.f106046a.f159364d;
            c21647aM114690r = AbstractC36095b.m114690r(c28655q, -1688186210, c28655q, false, -3686552);
            zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
            objM87133R = c28655q.m87133R();
            if (zM87153g) {
                objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            interfaceC23462h = (InterfaceC23462h) objM87133R;
            c28655q.m87173q(false);
            InterfaceC28601c1 interfaceC28601c1M87260n4 = AbstractC28683x.m87260n(m80889z(interfaceC23462h).getViewState(), AbstractC24614y.b.f96213b, null, c28655q, 48, 2);
            boolean zM87157i6 = c28655q.m87157i(interfaceC23462h);
            if ((i15 & 14) == 4) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z19 = zM87157i6 | z13;
            if ((i15 & 896) == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z19 | z14;
            objM87133R2 = c28655q.m87133R();
            if (z15) {
                interfaceC30057d = null;
                objM87133R2 = new b(usState, str2, interfaceC23462h, null);
                c28655q.m87172p0(objM87133R2);
            } else {
                interfaceC30057d = null;
                objM87133R2 = new b(usState, str2, interfaceC23462h, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87254h(usState, str2, (InterfaceC4351m) objM87133R2, c28655q);
            abstractC24614yM80833A = m80833A(interfaceC28601c1M87260n4);
            if (abstractC24614yM80833A instanceof AbstractC24614y.d) {
                dVar2 = (AbstractC24614y.d) abstractC24614yM80833A;
            } else {
                dVar = interfaceC30057d;
            }
            if (dVar != 0) {
                dVar = dVar2;
                analyticEventModelM71875b = dVar.getAnalyticEvent();
            } else {
                dVar = dVar2;
                analyticEventModelM71875b = interfaceC30057d;
            }
            zM87157i = c28655q.m87157i(analyticEventModelM71875b) | ((57344 & i15) == 16384);
            objM87133R3 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R3 = new c(analyticEventModelM71875b, function4, interfaceC30057d);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new c(analyticEventModelM71875b, function4, interfaceC30057d);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, analyticEventModelM71875b);
            AbstractC14874j.m42904c(m80833A(interfaceC28601c1M87260n4), "healthcare_loop_scheduling_form", c28655q, 48);
            AbstractC24614y abstractC24614yM80833A5 = m80833A(interfaceC28601c1M87260n4);
            zM87157i2 = c28655q.m87157i(interfaceC23462h);
            objM87133R4 = c28655q.m87133R();
            if (zM87157i2) {
                objM87133R4 = new C26967q(interfaceC23462h, 1);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C26967q(interfaceC23462h, 1);
                c28655q.m87172p0(objM87133R4);
            }
            function2 = function4;
            String str7 = str2;
            m80887x(abstractC24614yM80833A5, usState, intakeResponses, str7, (Function1) objM87133R4, onNavigationEvent, c28655q, ((i15 << 6) & 458752) | ((i15 << 3) & 8176), 0);
            str3 = str7;
        } else {
            c28655q.m87138X();
            str3 = str2;
        }
        function3 = function2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21421e(i13, i14, 8, usState, intakeResponses, str3, onNavigationEvent, function3, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x0061  */
    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x007c  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0086  */
    /* JADX WARN: Code duplicated, block: B:47:0x008c  */
    /* JADX WARN: Code duplicated, block: B:48:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:77:0x0103  */
    /* JADX WARN: Code duplicated, block: B:80:0x0116  */
    /* JADX WARN: Code duplicated, block: B:82:0x0124  */
    /* JADX WARN: Code duplicated, block: B:85:0x0130  */
    /* JADX WARN: Code duplicated, block: B:86:0x014f  */
    /* JADX WARN: Code duplicated, block: B:88:0x015a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0170  */
    /* JADX WARN: Code duplicated, block: B:91:0x0178  */
    /* JADX WARN: Code duplicated, block: B:92:0x0185  */
    /* JADX WARN: Code duplicated, block: B:94:0x0189  */
    /* JADX WARN: Code duplicated, block: B:97:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ae  */
    /* JADX INFO: renamed from: x */
    public static final void m80887x(AbstractC24614y viewState, String str, String str2, String str3, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        String str4;
        int i16;
        int i17;
        int i18;
        String str5;
        int i19;
        boolean z4;
        String str6;
        String str7;
        String str8;
        C28677v1 c28677v1M87180u;
        String str9;
        String str10;
        String str11;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i24;
        int i25;
        Function1 onViewEvent = function1;
        Function1 onNavigationEvent = function2;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1069316267);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i26 = i14 & 2;
        if (i26 == 0) {
            if ((i13 & 48) == 0) {
                str4 = str;
                i15 |= c28655q.m87153g(str4) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    if (c28655q.m87153g(str2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        str5 = str3;
                        if (c28655q.m87153g(str5)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    if ((i13 & 24576) == 0) {
                        if (c28655q.m87157i(onViewEvent)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((196608 & i13) == 0) {
                        if (c28655q.m87157i(onNavigationEvent)) {
                            i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i24;
                    }
                    if ((74899 & i15) != 74898) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        if (i26 != 0) {
                            str9 = "";
                        } else {
                            str9 = str4;
                        }
                        if (i16 != 0) {
                            str10 = "";
                        } else {
                            str10 = str2;
                        }
                        if (i18 != 0) {
                            str11 = null;
                        } else {
                            str11 = str5;
                        }
                        Modifier modifierM66725n = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w)));
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66725n);
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
                        if (viewState instanceof AbstractC24614y.d) {
                            c28655q.m87150e0(674757627);
                            m80860a0((AbstractC24614y.d) viewState, str9, str10, str11, function1, onNavigationEvent, c28655q, i15 & 524286, 0);
                            str5 = str11;
                            onViewEvent = function1;
                            onNavigationEvent = onNavigationEvent;
                            c28655q.m87173q(false);
                        } else {
                            str5 = str11;
                            onViewEvent = function1;
                            if (viewState.equals(AbstractC24614y.a.f96212b)) {
                                c28655q.m87150e0(674762865);
                                m80839G(str9, onViewEvent, c28655q, ((i15 >> 9) & 112) | ((i15 >> 3) & 14));
                                c28655q.m87173q(false);
                            } else if (viewState.equals(AbstractC24614y.b.f96213b)) {
                                c28655q.m87150e0(674765855);
                                m80844L(c28655q, 0);
                                c28655q.m87173q(false);
                            } else {
                                if (viewState instanceof AbstractC24614y.c) {
                                    throw AbstractC11895b.m32003v(674755337, c28655q, false);
                                }
                                c28655q.m87150e0(674768378);
                                m80846N((AbstractC24614y.c) viewState, onNavigationEvent, c28655q, ((i15 >> 12) & 112) | (i15 & 14));
                                c28655q.m87173q(false);
                            }
                        }
                        c28655q.m87173q(true);
                        str7 = str9;
                        str6 = str10;
                    } else {
                        c28655q.m87138X();
                        str6 = str2;
                        str7 = str4;
                    }
                    str8 = str5;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2165f(i13, i14, 26, viewState, str7, str6, str8, onViewEvent, onNavigationEvent);
                    }
                }
                i15 |= 3072;
                str5 = str3;
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87157i(onViewEvent)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((196608 & i13) == 0) {
                    if (c28655q.m87157i(onNavigationEvent)) {
                        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i24;
                }
                if ((74899 & i15) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i26 != 0) {
                        str9 = "";
                    } else {
                        str9 = str4;
                    }
                    if (i16 != 0) {
                        str10 = "";
                    } else {
                        str10 = str2;
                    }
                    if (i18 != 0) {
                        str11 = null;
                    } else {
                        str11 = str5;
                    }
                    Modifier modifierM66725n2 = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w)));
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM66725n2);
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
                    if (viewState instanceof AbstractC24614y.d) {
                        c28655q.m87150e0(674757627);
                        m80860a0((AbstractC24614y.d) viewState, str9, str10, str11, function1, onNavigationEvent, c28655q, i15 & 524286, 0);
                        str5 = str11;
                        onViewEvent = function1;
                        onNavigationEvent = onNavigationEvent;
                        c28655q.m87173q(false);
                    } else {
                        str5 = str11;
                        onViewEvent = function1;
                        if (viewState.equals(AbstractC24614y.a.f96212b)) {
                            c28655q.m87150e0(674762865);
                            m80839G(str9, onViewEvent, c28655q, ((i15 >> 9) & 112) | ((i15 >> 3) & 14));
                            c28655q.m87173q(false);
                        } else if (viewState.equals(AbstractC24614y.b.f96213b)) {
                            c28655q.m87150e0(674765855);
                            m80844L(c28655q, 0);
                            c28655q.m87173q(false);
                        } else {
                            if (viewState instanceof AbstractC24614y.c) {
                                throw AbstractC11895b.m32003v(674755337, c28655q, false);
                            }
                            c28655q.m87150e0(674768378);
                            m80846N((AbstractC24614y.c) viewState, onNavigationEvent, c28655q, ((i15 >> 12) & 112) | (i15 & 14));
                            c28655q.m87173q(false);
                        }
                    }
                    c28655q.m87173q(true);
                    str7 = str9;
                    str6 = str10;
                } else {
                    c28655q.m87138X();
                    str6 = str2;
                    str7 = str4;
                }
                str8 = str5;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2165f(i13, i14, 26, viewState, str7, str6, str8, onViewEvent, onNavigationEvent);
                }
            }
            i15 |= 384;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    str5 = str3;
                    if (c28655q.m87153g(str5)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87157i(onViewEvent)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((196608 & i13) == 0) {
                    if (c28655q.m87157i(onNavigationEvent)) {
                        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i24;
                }
                if ((74899 & i15) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i26 != 0) {
                        str9 = "";
                    } else {
                        str9 = str4;
                    }
                    if (i16 != 0) {
                        str10 = "";
                    } else {
                        str10 = str2;
                    }
                    if (i18 != 0) {
                        str11 = null;
                    } else {
                        str11 = str5;
                    }
                    Modifier modifierM66725n3 = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w)));
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM66725n3);
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
                    if (viewState instanceof AbstractC24614y.d) {
                        c28655q.m87150e0(674757627);
                        m80860a0((AbstractC24614y.d) viewState, str9, str10, str11, function1, onNavigationEvent, c28655q, i15 & 524286, 0);
                        str5 = str11;
                        onViewEvent = function1;
                        onNavigationEvent = onNavigationEvent;
                        c28655q.m87173q(false);
                    } else {
                        str5 = str11;
                        onViewEvent = function1;
                        if (viewState.equals(AbstractC24614y.a.f96212b)) {
                            c28655q.m87150e0(674762865);
                            m80839G(str9, onViewEvent, c28655q, ((i15 >> 9) & 112) | ((i15 >> 3) & 14));
                            c28655q.m87173q(false);
                        } else if (viewState.equals(AbstractC24614y.b.f96213b)) {
                            c28655q.m87150e0(674765855);
                            m80844L(c28655q, 0);
                            c28655q.m87173q(false);
                        } else {
                            if (viewState instanceof AbstractC24614y.c) {
                                throw AbstractC11895b.m32003v(674755337, c28655q, false);
                            }
                            c28655q.m87150e0(674768378);
                            m80846N((AbstractC24614y.c) viewState, onNavigationEvent, c28655q, ((i15 >> 12) & 112) | (i15 & 14));
                            c28655q.m87173q(false);
                        }
                    }
                    c28655q.m87173q(true);
                    str7 = str9;
                    str6 = str10;
                } else {
                    c28655q.m87138X();
                    str6 = str2;
                    str7 = str4;
                }
                str8 = str5;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2165f(i13, i14, 26, viewState, str7, str6, str8, onViewEvent, onNavigationEvent);
                }
            }
            i15 |= 3072;
            str5 = str3;
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(onViewEvent)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            if ((196608 & i13) == 0) {
                if (c28655q.m87157i(onNavigationEvent)) {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i24;
            }
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i26 != 0) {
                    str9 = "";
                } else {
                    str9 = str4;
                }
                if (i16 != 0) {
                    str10 = "";
                } else {
                    str10 = str2;
                }
                if (i18 != 0) {
                    str11 = null;
                } else {
                    str11 = str5;
                }
                Modifier modifierM66725n4 = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w)));
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM66725n4);
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
                if (viewState instanceof AbstractC24614y.d) {
                    c28655q.m87150e0(674757627);
                    m80860a0((AbstractC24614y.d) viewState, str9, str10, str11, function1, onNavigationEvent, c28655q, i15 & 524286, 0);
                    str5 = str11;
                    onViewEvent = function1;
                    onNavigationEvent = onNavigationEvent;
                    c28655q.m87173q(false);
                } else {
                    str5 = str11;
                    onViewEvent = function1;
                    if (viewState.equals(AbstractC24614y.a.f96212b)) {
                        c28655q.m87150e0(674762865);
                        m80839G(str9, onViewEvent, c28655q, ((i15 >> 9) & 112) | ((i15 >> 3) & 14));
                        c28655q.m87173q(false);
                    } else if (viewState.equals(AbstractC24614y.b.f96213b)) {
                        c28655q.m87150e0(674765855);
                        m80844L(c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC24614y.c) {
                            throw AbstractC11895b.m32003v(674755337, c28655q, false);
                        }
                        c28655q.m87150e0(674768378);
                        m80846N((AbstractC24614y.c) viewState, onNavigationEvent, c28655q, ((i15 >> 12) & 112) | (i15 & 14));
                        c28655q.m87173q(false);
                    }
                }
                c28655q.m87173q(true);
                str7 = str9;
                str6 = str10;
            } else {
                c28655q.m87138X();
                str6 = str2;
                str7 = str4;
            }
            str8 = str5;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2165f(i13, i14, 26, viewState, str7, str6, str8, onViewEvent, onNavigationEvent);
            }
        }
        i15 |= 48;
        str4 = str;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                if (c28655q.m87153g(str2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    str5 = str3;
                    if (c28655q.m87153g(str5)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87157i(onViewEvent)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((196608 & i13) == 0) {
                    if (c28655q.m87157i(onNavigationEvent)) {
                        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i24;
                }
                if ((74899 & i15) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i26 != 0) {
                        str9 = "";
                    } else {
                        str9 = str4;
                    }
                    if (i16 != 0) {
                        str10 = "";
                    } else {
                        str10 = str2;
                    }
                    if (i18 != 0) {
                        str11 = null;
                    } else {
                        str11 = str5;
                    }
                    Modifier modifierM66725n5 = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w)));
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM66725n5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d5);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                    if (viewState instanceof AbstractC24614y.d) {
                        c28655q.m87150e0(674757627);
                        m80860a0((AbstractC24614y.d) viewState, str9, str10, str11, function1, onNavigationEvent, c28655q, i15 & 524286, 0);
                        str5 = str11;
                        onViewEvent = function1;
                        onNavigationEvent = onNavigationEvent;
                        c28655q.m87173q(false);
                    } else {
                        str5 = str11;
                        onViewEvent = function1;
                        if (viewState.equals(AbstractC24614y.a.f96212b)) {
                            c28655q.m87150e0(674762865);
                            m80839G(str9, onViewEvent, c28655q, ((i15 >> 9) & 112) | ((i15 >> 3) & 14));
                            c28655q.m87173q(false);
                        } else if (viewState.equals(AbstractC24614y.b.f96213b)) {
                            c28655q.m87150e0(674765855);
                            m80844L(c28655q, 0);
                            c28655q.m87173q(false);
                        } else {
                            if (viewState instanceof AbstractC24614y.c) {
                                throw AbstractC11895b.m32003v(674755337, c28655q, false);
                            }
                            c28655q.m87150e0(674768378);
                            m80846N((AbstractC24614y.c) viewState, onNavigationEvent, c28655q, ((i15 >> 12) & 112) | (i15 & 14));
                            c28655q.m87173q(false);
                        }
                    }
                    c28655q.m87173q(true);
                    str7 = str9;
                    str6 = str10;
                } else {
                    c28655q.m87138X();
                    str6 = str2;
                    str7 = str4;
                }
                str8 = str5;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2165f(i13, i14, 26, viewState, str7, str6, str8, onViewEvent, onNavigationEvent);
                }
            }
            i15 |= 3072;
            str5 = str3;
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(onViewEvent)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            if ((196608 & i13) == 0) {
                if (c28655q.m87157i(onNavigationEvent)) {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i24;
            }
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i26 != 0) {
                    str9 = "";
                } else {
                    str9 = str4;
                }
                if (i16 != 0) {
                    str10 = "";
                } else {
                    str10 = str2;
                }
                if (i18 != 0) {
                    str11 = null;
                } else {
                    str11 = str5;
                }
                Modifier modifierM66725n6 = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w)));
                InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM66725n6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d6);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                if (viewState instanceof AbstractC24614y.d) {
                    c28655q.m87150e0(674757627);
                    m80860a0((AbstractC24614y.d) viewState, str9, str10, str11, function1, onNavigationEvent, c28655q, i15 & 524286, 0);
                    str5 = str11;
                    onViewEvent = function1;
                    onNavigationEvent = onNavigationEvent;
                    c28655q.m87173q(false);
                } else {
                    str5 = str11;
                    onViewEvent = function1;
                    if (viewState.equals(AbstractC24614y.a.f96212b)) {
                        c28655q.m87150e0(674762865);
                        m80839G(str9, onViewEvent, c28655q, ((i15 >> 9) & 112) | ((i15 >> 3) & 14));
                        c28655q.m87173q(false);
                    } else if (viewState.equals(AbstractC24614y.b.f96213b)) {
                        c28655q.m87150e0(674765855);
                        m80844L(c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC24614y.c) {
                            throw AbstractC11895b.m32003v(674755337, c28655q, false);
                        }
                        c28655q.m87150e0(674768378);
                        m80846N((AbstractC24614y.c) viewState, onNavigationEvent, c28655q, ((i15 >> 12) & 112) | (i15 & 14));
                        c28655q.m87173q(false);
                    }
                }
                c28655q.m87173q(true);
                str7 = str9;
                str6 = str10;
            } else {
                c28655q.m87138X();
                str6 = str2;
                str7 = str4;
            }
            str8 = str5;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2165f(i13, i14, 26, viewState, str7, str6, str8, onViewEvent, onNavigationEvent);
            }
        }
        i15 |= 384;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                str5 = str3;
                if (c28655q.m87153g(str5)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(onViewEvent)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            if ((196608 & i13) == 0) {
                if (c28655q.m87157i(onNavigationEvent)) {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i24;
            }
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i26 != 0) {
                    str9 = "";
                } else {
                    str9 = str4;
                }
                if (i16 != 0) {
                    str10 = "";
                } else {
                    str10 = str2;
                }
                if (i18 != 0) {
                    str11 = null;
                } else {
                    str11 = str5;
                }
                Modifier modifierM66725n7 = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w)));
                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM66725n7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d7);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                if (viewState instanceof AbstractC24614y.d) {
                    c28655q.m87150e0(674757627);
                    m80860a0((AbstractC24614y.d) viewState, str9, str10, str11, function1, onNavigationEvent, c28655q, i15 & 524286, 0);
                    str5 = str11;
                    onViewEvent = function1;
                    onNavigationEvent = onNavigationEvent;
                    c28655q.m87173q(false);
                } else {
                    str5 = str11;
                    onViewEvent = function1;
                    if (viewState.equals(AbstractC24614y.a.f96212b)) {
                        c28655q.m87150e0(674762865);
                        m80839G(str9, onViewEvent, c28655q, ((i15 >> 9) & 112) | ((i15 >> 3) & 14));
                        c28655q.m87173q(false);
                    } else if (viewState.equals(AbstractC24614y.b.f96213b)) {
                        c28655q.m87150e0(674765855);
                        m80844L(c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC24614y.c) {
                            throw AbstractC11895b.m32003v(674755337, c28655q, false);
                        }
                        c28655q.m87150e0(674768378);
                        m80846N((AbstractC24614y.c) viewState, onNavigationEvent, c28655q, ((i15 >> 12) & 112) | (i15 & 14));
                        c28655q.m87173q(false);
                    }
                }
                c28655q.m87173q(true);
                str7 = str9;
                str6 = str10;
            } else {
                c28655q.m87138X();
                str6 = str2;
                str7 = str4;
            }
            str8 = str5;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2165f(i13, i14, 26, viewState, str7, str6, str8, onViewEvent, onNavigationEvent);
            }
        }
        i15 |= 3072;
        str5 = str3;
        if ((i13 & 24576) == 0) {
            if (c28655q.m87157i(onViewEvent)) {
                i25 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i25 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i25;
        }
        if ((196608 & i13) == 0) {
            if (c28655q.m87157i(onNavigationEvent)) {
                i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i24;
        }
        if ((74899 & i15) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i26 != 0) {
                str9 = "";
            } else {
                str9 = str4;
            }
            if (i16 != 0) {
                str10 = "";
            } else {
                str10 = str2;
            }
            if (i18 != 0) {
                str11 = null;
            } else {
                str11 = str5;
            }
            Modifier modifierM66725n8 = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w)));
            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM66725n8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d8);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
            if (viewState instanceof AbstractC24614y.d) {
                c28655q.m87150e0(674757627);
                m80860a0((AbstractC24614y.d) viewState, str9, str10, str11, function1, onNavigationEvent, c28655q, i15 & 524286, 0);
                str5 = str11;
                onViewEvent = function1;
                onNavigationEvent = onNavigationEvent;
                c28655q.m87173q(false);
            } else {
                str5 = str11;
                onViewEvent = function1;
                if (viewState.equals(AbstractC24614y.a.f96212b)) {
                    c28655q.m87150e0(674762865);
                    m80839G(str9, onViewEvent, c28655q, ((i15 >> 9) & 112) | ((i15 >> 3) & 14));
                    c28655q.m87173q(false);
                } else if (viewState.equals(AbstractC24614y.b.f96213b)) {
                    c28655q.m87150e0(674765855);
                    m80844L(c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    if (viewState instanceof AbstractC24614y.c) {
                        throw AbstractC11895b.m32003v(674755337, c28655q, false);
                    }
                    c28655q.m87150e0(674768378);
                    m80846N((AbstractC24614y.c) viewState, onNavigationEvent, c28655q, ((i15 >> 12) & 112) | (i15 & 14));
                    c28655q.m87173q(false);
                }
            }
            c28655q.m87173q(true);
            str7 = str9;
            str6 = str10;
        } else {
            c28655q.m87138X();
            str6 = str2;
            str7 = str4;
        }
        str8 = str5;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2165f(i13, i14, 26, viewState, str7, str6, str8, onViewEvent, onNavigationEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m80888y(AnalyticEventModel it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C24613x m80889z(InterfaceC23462h interfaceC23462h) {
        return (C24613x) interfaceC23462h.getValue();
    }
}
