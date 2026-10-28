package yu2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.domain.model.UnitSystem;
import com.whoop.service.network.model.UserSessionDto;
import com.whoop.weightlifting.StrengthTrainerDestination;
import cu2.AbstractC11128h;
import eu2.AbstractC13650g;
import eu2.AbstractC13653j;
import eu2.C13659p;
import gy0.AbstractC16277f;
import hu2.C17661h;
import hu2.InterfaceC17655b;
import in2.C18733e;
import io.sentry.config.AbstractC20301a;
import j11.AbstractC21211n;
import java.util.List;
import java.util.UUID;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m12.AbstractC24936d;
import nf3.C26669a;
import no.nordicsemi.android.dfu.DfuBaseService;
import nw0.C27198e;
import o11.AbstractC27407m;
import o11.InterfaceC27402h;
import o81.C27656a;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p249jc.AbstractC21598x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p329n0.AbstractC26071x;
import p329n0.C26068u;
import p389p0.C28539n0;
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
import p635y2.InterfaceC39127r0;
import p702ch0.C4614e;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p734sl0.C32676t1;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p745y81.InterfaceC39332e;
import pf.AbstractC29125c;
import pf3.C29155a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r41.AbstractC30925i;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uv0.AbstractC35283c;
import vf3.InterfaceC35951a;
import vv2.C36538d;
import wb3.AbstractC37056f;
import wo1.C37450h;
import wr0.C37526f;
import x81.C38072d;
import xf3.C38266c;
import xu2.AbstractC38656b;
import xu2.C38657c;
import xu2.InterfaceC38655a;
import xu2.InterfaceC38658d;
import y71.C39274g;
import y71.C39277j;
import yb0.AbstractC39383f;
import yf1.C39516e;
import yk2.C39611k;
import yo1.C39689b;

/* JADX INFO: renamed from: yu2.e */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a9\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\rH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a;\u0010\u0017\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00122\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a=\u0010\u001a\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\rH\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a-\u0010\u001f\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\rH\u0003¢\u0006\u0004\b\u001f\u0010 \"\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\"\u0014\u0010'\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\"\u0014\u0010)\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&¨\u0006,²\u0006\f\u0010+\u001a\u00020*8\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;", "navArgs", "Lyu2/a;", "navRouter", "", "isExerciseDetailsV2ExperimentEnabled", "Ll83/a0;", "x", "(Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;Lyu2/a;ZLandroidx/compose/runtime/Composer;II)V", "Lxu2/d;", "viewState", "Lin2/e;", "initialListPosition", "Lkotlin/Function1;", "Lhu2/b;", "onEvent", "y", "(Lxu2/d;Lin2/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lxu2/d$c;", "Lbc3/c0;", "coroutineScope", "Ln0/u;", "listState", "F", "(Lxu2/d$c;Lkotlin/jvm/functions/Function1;Lbc3/c0;Ln0/u;Landroidx/compose/runtime/Composer;I)V", "Lxu2/d$b;", "L", "(Lxu2/d$b;Ln0/u;Lin2/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lxu2/b;", "dialog", "onViewEvent", "s", "(Lxu2/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lo11/h$b;", "a", "Lo11/h$b;", "previewExpandedTileContent", "b", "Lxu2/d$b;", "previewViewState", "c", "previewSharedWorkoutViewState", "Lxu2/c;", "viewModel", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39795e {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC27402h.b f171433a;

    /* JADX INFO: renamed from: b */
    private static final InterfaceC38658d.b f171434b;

    /* JADX INFO: renamed from: c */
    private static final InterfaceC38658d.b f171435c;

    /* JADX INFO: renamed from: yu2.e$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f171436w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f171437x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f171438y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f171439z;

        /* JADX INFO: renamed from: yu2.e$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42711a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f171440w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42711a(C21647a c21647a) {
                super(0);
                this.f171440w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f171440w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f171436w = c38266c;
            this.f171437x = interfaceC35951a;
            this.f171438y = interfaceC4339a;
            this.f171439z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, xu2.c] */
        @Override // c93.InterfaceC4339a
        public final C38657c invoke() {
            return AbstractC21598x.m60668X(this.f171436w, this.f171437x, new C42711a(this.f171439z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38657c.class), null, this.f171438y);
        }
    }

    /* JADX INFO: renamed from: yu2.e$b */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.edit.view.EditWorkoutScreenKt$EditWorkoutScreen$1$1", m100430f = "EditWorkoutScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f171441w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ StrengthTrainerDestination.C10741d.a f171442x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f171443y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC23462h f171444z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(StrengthTrainerDestination.C10741d.a aVar, String str, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f171442x = aVar;
            this.f171443y = str;
            this.f171444z = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f171442x, this.f171443y, this.f171444z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f171441w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C38657c c38657cM127575z = AbstractC39795e.m127575z(this.f171444z);
            Long templateId = this.f171442x.getTemplateId();
            String activityId = this.f171442x.getActivityId();
            String sharedTemplateId = this.f171442x.getSharedTemplateId();
            Boolean isFromWhoopCoach = this.f171442x.getIsFromWhoopCoach();
            c38657cM127575z.m123951n(new InterfaceC17655b.k(templateId, activityId, sharedTemplateId, isFromWhoopCoach != null ? isFromWhoopCoach.booleanValue() : false, this.f171442x.getIsCopyFlow(), this.f171443y, this.f171442x.getEntryPoint()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: yu2.e$c */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.edit.view.EditWorkoutScreenKt$FullScreenModalScreens$1$1$1$1$1", m100430f = "EditWorkoutScreen.kt", m100431l = {132}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f171445w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C26068u f171446x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C26068u c26068u, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f171446x = c26068u;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f171446x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f171445w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C26068u c26068u = this.f171446x;
                this.f171445w = 1;
                C28539n0 c28539n0 = C26068u.f103217x;
                if (c26068u.m77567j(0, 0, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: yu2.e$d */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.edit.view.EditWorkoutScreenKt$FullScreenModalScreens$1$4$1", m100430f = "EditWorkoutScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f171447w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC38658d.c f171448x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f171449y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC38658d.c cVar, Function1 function1, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f171448x = cVar;
            this.f171449y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f171448x, this.f171449y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f171447w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC17655b followUpEvent = this.f171448x.getFollowUpEvent();
            if (followUpEvent != null) {
                this.f171449y.invoke(followUpEvent);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        UUID uuidRandomUUID = UUID.randomUUID();
        AbstractC22676k.m65749i(uuidRandomUUID, "randomUUID(...)");
        AbstractC30925i.d dVar = new AbstractC30925i.d(uuidRandomUUID, 0, AbstractC8693b.m21278l(UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE), AbstractC8693b.m21278l("20"), null, false, AbstractC8693b.m21278l("30"), 0, null, 432, null);
        UUID uuidRandomUUID2 = UUID.randomUUID();
        AbstractC22676k.m65749i(uuidRandomUUID2, "randomUUID(...)");
        C39274g c39274g = null;
        TextResource textResource = null;
        TextResource textResource2 = null;
        boolean z4 = false;
        boolean z13 = true;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        C23454a0 c23454a0 = C23454a0.f92919a;
        InterfaceC27402h.b bVar = new InterfaceC27402h.b(AbstractC37056f.m118959K(dVar, new AbstractC30925i.d(uuidRandomUUID2, 1, AbstractC8693b.m21278l("2"), AbstractC8693b.m21278l("20"), null, false, AbstractC8693b.m21278l("30"), 0, c39274g, 432, null)), UnitSystem.IMPERIAL, textResource, textResource2, z4, z13, z14, z15, z16, c23454a0, c23454a0, c23454a0, 476, null);
        f171433a = bVar;
        TextResource textResourceM21278l = AbstractC8693b.m21278l("MORNING ROUTINE");
        C38072d c38072d = C38072d.f163053a;
        Object[] objArr = 0 == true ? 1 : 0;
        AbstractC6721d.a aVar = new AbstractC6721d.a(textResourceM21278l, null, new C39274g(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowBackward(), AbstractC8693b.m21277k(AbstractC35283c.f150167E)), c39274g, null, objArr, false, null, null, null, null, null, null, null, null, 32762, null);
        UUID uuidRandomUUID3 = UUID.randomUUID();
        AbstractC22676k.m65749i(uuidRandomUUID3, "randomUUID(...)");
        UUID uuidRandomUUID4 = UUID.randomUUID();
        AbstractC22676k.m65749i(uuidRandomUUID4, "randomUUID(...)");
        int i13 = 1200;
        DefaultConstructorMarker defaultConstructorMarker = null;
        AbstractC27407m.b.a aVar2 = new AbstractC27407m.b.a(uuidRandomUUID4, AbstractC8693b.m21278l("Abdominal Crunch"), AbstractC8693b.m21278l("3 Sets"), null, null, 0, c23454a0, null, false, bVar, false, i13, defaultConstructorMarker);
        UUID uuidRandomUUID5 = UUID.randomUUID();
        AbstractC22676k.m65749i(uuidRandomUUID5, "randomUUID(...)");
        C13659p c13659p = new C13659p(uuidRandomUUID3, true, false, AbstractC37056f.m118959K(aVar2, new AbstractC27407m.b.a(uuidRandomUUID5, AbstractC8693b.m21278l("Push-Ups"), AbstractC8693b.m21278l("3 Sets"), null, null, 0, c23454a0, null, false, bVar, false, i13, defaultConstructorMarker)), 4, null);
        UUID uuidRandomUUID6 = UUID.randomUUID();
        AbstractC22676k.m65749i(uuidRandomUUID6, "randomUUID(...)");
        UUID uuidRandomUUID7 = UUID.randomUUID();
        AbstractC22676k.m65749i(uuidRandomUUID7, "randomUUID(...)");
        int i14 = 1168;
        boolean z17 = true;
        boolean z18 = false;
        C13659p c13659p2 = new C13659p(uuidRandomUUID6, z17, z18, AbstractC37056f.m118958J(new AbstractC27407m.b.a(uuidRandomUUID7, AbstractC8693b.m21278l("Bicep Curls - DB"), AbstractC8693b.m21278l("2 Sets"), null, null, c38072d.m121951d().getVarious().getDrag(), c23454a0, null, true, bVar, false, i14, defaultConstructorMarker)), 4, null);
        UUID uuidRandomUUID8 = UUID.randomUUID();
        AbstractC22676k.m65749i(uuidRandomUUID8, "randomUUID(...)");
        UUID uuidRandomUUID9 = UUID.randomUUID();
        AbstractC22676k.m65749i(uuidRandomUUID9, "randomUUID(...)");
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        boolean z19 = true;
        boolean z24 = false;
        AbstractC38656b abstractC38656b = null;
        boolean z25 = false;
        InterfaceC38658d.b bVar2 = new InterfaceC38658d.b(aVar, AbstractC37056f.m118959K(c13659p, c13659p2, new C13659p(uuidRandomUUID8, z19, z24, AbstractC37056f.m118958J(new AbstractC27407m.b.a(uuidRandomUUID9, AbstractC8693b.m21278l("Bent Over Row - DB"), AbstractC8693b.m21278l("1 Set"), null, null, c38072d.m121951d().getVarious().getDrag(), c23454a0, null, false, bVar, false, i14, defaultConstructorMarker)), 4, defaultConstructorMarker2)), new InterfaceC38655a.b(true), abstractC38656b, InterfaceC17655b.c.f68493w, z25, 32, defaultConstructorMarker2);
        f171434b = bVar2;
        AbstractC6721d.a toolbarState = bVar2.getToolbarState();
        f171435c = InterfaceC38658d.b.m123954b(bVar2, toolbarState.m20156a((32763 & 1) != 0 ? toolbarState.title : null, (32763 & 2) != 0 ? toolbarState.subtitle : new C27656a(AbstractC8693b.m21278l("SHARED BY CHUCK"), false, 2, null), (32763 & 4) != 0 ? toolbarState.leftIcon : new C39274g(AbstractC39383f.m125595a(c38072d), AbstractC8693b.m21277k(AbstractC16277f.f62253K)), (32763 & 8) != 0 ? toolbarState.rightIcon : null, (32763 & 16) != 0 ? toolbarState.leftIconButtonType : null, (32763 & 32) != 0 ? toolbarState.rightIconButtonType : null, (32763 & 64) != 0 ? toolbarState.shouldKeepOriginalIconColor : false, (32763 & 128) != 0 ? toolbarState.rightIconView : null, (32763 & 256) != 0 ? toolbarState.rightIconColor : null, (32763 & 512) != 0 ? toolbarState.leftIconColor : null, (32763 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? toolbarState.titleColor : null, (32763 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? toolbarState.subtitleColor : null, (32763 & 4096) != 0 ? toolbarState.tag : null, (32763 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? toolbarState.titleAutomationTag : null, (32763 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? toolbarState.leftIconAutomationTag : null), null, null, null, null, false, 62, null);
    }

    /* JADX INFO: renamed from: A */
    private static final InterfaceC38658d m127532A(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC38658d) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m127533B(StrengthTrainerDestination.C10741d.a aVar, C39791a c39791a, boolean z4, InterfaceC23462h interfaceC23462h, InterfaceC17655b viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        if (viewEvent instanceof C17661h) {
            aVar.getOnInitialListPositionConsumed().invoke();
        } else if (viewEvent instanceof InterfaceC17655b.p) {
            m127575z(interfaceC23462h).m123951n((InterfaceC17655b.p) viewEvent);
        } else {
            if (!(viewEvent instanceof InterfaceC17655b.f)) {
                throw new NoWhenBranchMatchedException();
            }
            c39791a.m127531a((InterfaceC17655b.f) viewEvent, z4);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m127534C(StrengthTrainerDestination.C10741d.a aVar, C39791a c39791a, boolean z4, int i13, int i14, Composer composer, int i15) {
        m127573x(aVar, c39791a, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m127535D(InterfaceC17655b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m127536E(InterfaceC38658d interfaceC38658d, C18733e c18733e, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m127574y(interfaceC38658d, c18733e, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: F */
    private static final void m127537F(final InterfaceC38658d.c cVar, final Function1 function1, InterfaceC2994c0 interfaceC2994c0, C26068u c26068u, Composer composer, int i13) {
        int i14;
        C26068u c26068u2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1922070935);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(cVar) : c28655q.m87157i(cVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(interfaceC2994c0) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            c26068u2 = c26068u;
            i14 |= c28655q.m87153g(c26068u2) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            c26068u2 = c26068u;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            boolean z4 = cVar.getType() instanceof AbstractC33208p0.h;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4) {
                c28655q.m87150e0(-1234767726);
                boolean zM87157i = ((i14 & 112) == 32) | c28655q.m87157i(cVar) | c28655q.m87157i(interfaceC2994c0) | ((i14 & 7168) == 2048);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    C27198e c27198e = new C27198e((Object) cVar, function1, (Object) interfaceC2994c0, (Object) c26068u2, 27);
                    c28655q.m87172p0(c27198e);
                    objM87133R = c27198e;
                }
                AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, (InterfaceC4339a) objM87133R, 3, null), cVar.getSupportText(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                c28655q.m87173q(false);
                c28655q = c28655q;
            } else {
                c28655q.m87150e0(-1234342096);
                AbstractC33208p0 type = cVar.getType();
                TextResource supportText = cVar.getSupportText();
                TextResource primaryButtonText = cVar.getPrimaryButtonText();
                int i15 = i14 & 112;
                boolean zM87157i2 = c28655q.m87157i(cVar) | (i15 == 32);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i2 || objM87133R2 == c28676v0) {
                    final int i16 = 0;
                    objM87133R2 = new InterfaceC4339a() { // from class: yu2.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i16) {
                                case 0:
                                    return AbstractC39795e.m127539H(cVar, function1);
                                case 1:
                                    return AbstractC39795e.m127540I(cVar, function1);
                                default:
                                    return AbstractC39795e.m127541J(cVar, function1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                boolean showSecondaryAction = cVar.getShowSecondaryAction();
                TextResource secondaryButtonText = cVar.getSecondaryButtonText();
                boolean zM87157i3 = c28655q.m87157i(cVar) | (i15 == 32);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87157i3 || objM87133R3 == c28676v0) {
                    final int i17 = 1;
                    objM87133R3 = new InterfaceC4339a() { // from class: yu2.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i17) {
                                case 0:
                                    return AbstractC39795e.m127539H(cVar, function1);
                                case 1:
                                    return AbstractC39795e.m127540I(cVar, function1);
                                default:
                                    return AbstractC39795e.m127541J(cVar, function1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                int i18 = AbstractC33208p0.f138461d;
                int i19 = TextResource.$stable;
                AbstractC33199m0.m105214F(type, supportText, null, primaryButtonText, interfaceC4339a, showSecondaryAction, false, secondaryButtonText, interfaceC4339a2, null, false, false, c28655q, i18 | (i19 << 3) | (i19 << 9) | (i19 << 21), 0, 3652);
                c28655q = c28655q;
                InterfaceC17655b followUpEvent = cVar.getFollowUpEvent();
                boolean zM87157i4 = c28655q.m87157i(cVar) | (i15 == 32);
                Object objM87133R4 = c28655q.m87133R();
                if (zM87157i4 || objM87133R4 == c28676v0) {
                    objM87133R4 = new d(cVar, function1, null);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, followUpEvent);
                boolean zM87157i5 = c28655q.m87157i(cVar) | (i15 == 32);
                Object objM87133R5 = c28655q.m87133R();
                if (zM87157i5 || objM87133R5 == c28676v0) {
                    final int i24 = 2;
                    objM87133R5 = new InterfaceC4339a() { // from class: yu2.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i24) {
                                case 0:
                                    return AbstractC39795e.m127539H(cVar, function1);
                                case 1:
                                    return AbstractC39795e.m127540I(cVar, function1);
                                default:
                                    return AbstractC39795e.m127541J(cVar, function1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R5, false, c28655q, 0, 1);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C39277j(cVar, function1, interfaceC2994c0, c26068u, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m127538G(InterfaceC38658d.c cVar, Function1 function1, InterfaceC2994c0 interfaceC2994c0, C26068u c26068u) {
        InterfaceC17655b followUpEvent = cVar.getFollowUpEvent();
        if (followUpEvent != null) {
            function1.invoke(followUpEvent);
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new c(c26068u, null), 3);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m127539H(InterfaceC38658d.c cVar, Function1 function1) {
        InterfaceC17655b buttonClickViewEvent = cVar.getButtonClickViewEvent();
        if (buttonClickViewEvent != null) {
            function1.invoke(buttonClickViewEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m127540I(InterfaceC38658d.c cVar, Function1 function1) {
        InterfaceC17655b secondaryButtonClickViewEvent = cVar.getSecondaryButtonClickViewEvent();
        if (secondaryButtonClickViewEvent != null) {
            function1.invoke(secondaryButtonClickViewEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m127541J(InterfaceC38658d.c cVar, Function1 function1) {
        InterfaceC17655b buttonClickViewEvent = cVar.getButtonClickViewEvent();
        if (buttonClickViewEvent != null) {
            function1.invoke(buttonClickViewEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m127542K(InterfaceC38658d.c cVar, Function1 function1, InterfaceC2994c0 interfaceC2994c0, C26068u c26068u, int i13, Composer composer, int i14) {
        m127537F(cVar, function1, interfaceC2994c0, c26068u, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:104:0x0221  */
    /* JADX WARN: Code duplicated, block: B:105:0x0223  */
    /* JADX WARN: Code duplicated, block: B:109:0x0231  */
    /* JADX WARN: Code duplicated, block: B:112:0x0262  */
    /* JADX WARN: Code duplicated, block: B:114:0x027a  */
    /* JADX WARN: Code duplicated, block: B:59:0x011b  */
    /* JADX WARN: Code duplicated, block: B:60:0x011f  */
    /* JADX WARN: Code duplicated, block: B:65:0x013a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0148  */
    /* JADX WARN: Code duplicated, block: B:69:0x014a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0158  */
    /* JADX WARN: Code duplicated, block: B:76:0x0186  */
    /* JADX WARN: Code duplicated, block: B:79:0x0196  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ef  */
    /* JADX INFO: renamed from: L */
    private static final void m127543L(final InterfaceC38658d.b bVar, C26068u c26068u, C18733e c18733e, final Function1 function1, Composer composer, int i13) {
        int i14;
        int i15;
        int iHashCode;
        boolean z4;
        boolean zM87157i;
        Object objM87133R;
        boolean z13;
        int i16;
        InterfaceC38655a cta;
        boolean z14;
        boolean zM87157i2;
        Object objM87133R2;
        boolean z15;
        Object objM87133R3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(643926901);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(bVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(c26068u) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(c18733e) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(function1) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            int i17 = i14 & 7168;
            boolean zM87157i3 = (i17 == 2048) | c28655q.m87157i(bVar);
            Object objM87133R4 = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i3 || objM87133R4 == c28676v0) {
                final int i18 = 0;
                objM87133R4 = new InterfaceC4339a() { // from class: yu2.d
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i18) {
                            case 0:
                                return AbstractC39795e.m127544M(function1, bVar);
                            default:
                                return AbstractC39795e.m127545N(function1, bVar);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R4, false, c28655q, 0, 1);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
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
            if (c28655q.f115903S) {
                i15 = i14;
            } else {
                i15 = i14;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                m127568s(bVar.getDisplayedDialog(), function1, c28655q, (i15 >> 6) & 112);
                Modifier modifierM94757f = AbstractC30802r.m94757f(c2314t, 1.0f);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM94757f);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                AbstractC6721d.a toolbarState = bVar.getToolbarState();
                if (i17 == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zM87157i = z4 | c28655q.m87157i(bVar);
                objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    final int i19 = 1;
                    objM87133R = new InterfaceC4339a() { // from class: yu2.d
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i19) {
                                case 0:
                                    return AbstractC39795e.m127544M(function1, bVar);
                                default:
                                    return AbstractC39795e.m127545N(function1, bVar);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC6719b.m20143d(null, toolbarState, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
                c28655q = c28655q;
                if (bVar.m123961h() != null) {
                    c28655q.m87150e0(1188328970);
                    List<C13659p> listM123961h = bVar.m123961h();
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM3396r = AbstractC1099a.m3396r(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), ((float) 2.5d) * 8, 0.0f, 2);
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    if (i17 == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z15 || objM87133R3 == c28676v0) {
                        objM87133R3 = new C37450h(function1, 21);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC13650g.m38474v(listM123961h, modifierM3396r, c26068u, c18733e, (Function1) objM87133R3, c28655q, (i15 << 3) & 8064, 0);
                    c28655q = c28655q;
                    z13 = false;
                    c28655q.m87173q(false);
                } else {
                    z13 = false;
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    c28655q.m87150e0(1188757142);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
                    c28655q.m87173q(false);
                }
                c28655q.m87150e0(-515839847);
                cta = bVar.getCta();
                String strM21274h = AbstractC8693b.m21274h(cta.getText(), c28655q, TextResource.$stable);
                boolean zMo123915b = cta.getUseAccentColor();
                boolean zMo123914a = cta.getEnabled();
                if (i17 == i16) {
                    z14 = true;
                } else {
                    z14 = z13;
                }
                zM87157i2 = c28655q.m87157i(cta) | z14;
                objM87133R2 = c28655q.m87133R();
                if (zM87157i2 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C39689b(4, function1, cta);
                    c28655q.m87172p0(objM87133R2);
                }
                boolean z16 = z13;
                AbstractC13653j.m38495g(null, strM21274h, zMo123914a, null, zMo123915b, false, (InterfaceC4339a) objM87133R2, c28655q, 0, 41);
                c28655q.m87173q(z16);
                c28655q.m87173q(true);
                AbstractC24936d.m73080z("OVERLAY_STRENGTH_BUILDER_WORKOUT_BUILDER", null, false, null, null, null, null, c28655q, 0, 126);
                if (bVar.getShowOnboardingOverlayForOtherExercise()) {
                    c28655q.m87150e0(1184923854);
                    AbstractC24936d.m73080z("OVERLAY_CREATE_CUSTOM_EXERCISE_ANDROID", null, false, null, null, null, null, c28655q, 0, 126);
                } else {
                    c28655q.m87150e0(-1921986425);
                }
                c28655q.m87173q(z16);
                c28655q.m87173q(true);
            }
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            m127568s(bVar.getDisplayedDialog(), function1, c28655q, (i15 >> 6) & 112);
            Modifier modifierM94757f2 = AbstractC30802r.m94757f(c2314t, 1.0f);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM94757f2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            AbstractC6721d.a toolbarState2 = bVar.getToolbarState();
            if (i17 == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            zM87157i = z4 | c28655q.m87157i(bVar);
            objM87133R = c28655q.m87133R();
            if (zM87157i) {
                final int i110 = 1;
                objM87133R = new InterfaceC4339a() { // from class: yu2.d
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i110) {
                            case 0:
                                return AbstractC39795e.m127544M(function1, bVar);
                            default:
                                return AbstractC39795e.m127545N(function1, bVar);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            } else {
                final int i111 = 1;
                objM87133R = new InterfaceC4339a() { // from class: yu2.d
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i111) {
                            case 0:
                                return AbstractC39795e.m127544M(function1, bVar);
                            default:
                                return AbstractC39795e.m127545N(function1, bVar);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(null, toolbarState2, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
            c28655q = c28655q;
            if (bVar.m123961h() != null) {
                c28655q.m87150e0(1188328970);
                List<C13659p> listM123961h2 = bVar.m123961h();
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), ((float) 2.5d) * 8, 0.0f, 2);
                i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                if (i17 == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z15) {
                    objM87133R3 = new C37450h(function1, 21);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C37450h(function1, 21);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC13650g.m38474v(listM123961h2, modifierM3396r2, c26068u, c18733e, (Function1) objM87133R3, c28655q, (i15 << 3) & 8064, 0);
                c28655q = c28655q;
                z13 = false;
                c28655q.m87173q(false);
            } else {
                z13 = false;
                i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                c28655q.m87150e0(1188757142);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
                c28655q.m87173q(false);
            }
            c28655q.m87150e0(-515839847);
            cta = bVar.getCta();
            String strM21274h2 = AbstractC8693b.m21274h(cta.getText(), c28655q, TextResource.$stable);
            boolean zMo123915b2 = cta.getUseAccentColor();
            boolean zMo123914a2 = cta.getEnabled();
            if (i17 == i16) {
                z14 = true;
            } else {
                z14 = z13;
            }
            zM87157i2 = c28655q.m87157i(cta) | z14;
            objM87133R2 = c28655q.m87133R();
            if (zM87157i2) {
                objM87133R2 = new C39689b(4, function1, cta);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C39689b(4, function1, cta);
                c28655q.m87172p0(objM87133R2);
            }
            boolean z17 = z13;
            AbstractC13653j.m38495g(null, strM21274h2, zMo123914a2, null, zMo123915b2, false, (InterfaceC4339a) objM87133R2, c28655q, 0, 41);
            c28655q.m87173q(z17);
            c28655q.m87173q(true);
            AbstractC24936d.m73080z("OVERLAY_STRENGTH_BUILDER_WORKOUT_BUILDER", null, false, null, null, null, null, c28655q, 0, 126);
            if (bVar.getShowOnboardingOverlayForOtherExercise()) {
                c28655q.m87150e0(1184923854);
                AbstractC24936d.m73080z("OVERLAY_CREATE_CUSTOM_EXERCISE_ANDROID", null, false, null, null, null, null, c28655q, 0, 126);
            } else {
                c28655q.m87150e0(-1921986425);
            }
            c28655q.m87173q(z17);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C39277j(bVar, c26068u, c18733e, function1, i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m127544M(Function1 function1, InterfaceC38658d.b bVar) {
        function1.invoke(bVar.getBackClickEvent());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m127545N(Function1 function1, InterfaceC38658d.b bVar) {
        function1.invoke(bVar.getBackClickEvent());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m127546O(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof InterfaceC17655b) {
            function1.invoke(it);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m127547P(Function1 function1, InterfaceC38655a interfaceC38655a) {
        function1.invoke(interfaceC38655a.getClickEvent());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m127548Q(InterfaceC38658d.b bVar, C26068u c26068u, C18733e c18733e, Function1 function1, int i13, Composer composer, int i14) {
        m127543L(bVar, c26068u, c18733e, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    private static final void m127568s(AbstractC38656b abstractC38656b, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2061450845);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(abstractC38656b) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            AbstractC29125c.m88520b(Boolean.valueOf(abstractC38656b != null), null, null, null, AbstractC37817c.m121344e(-1260108930, c28655q, new C36538d(16, abstractC38656b, function1)), c28655q, 24576, 14);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C39516e(abstractC38656b, function1, i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m127569t(final AbstractC38656b abstractC38656b, final Function1 function1, boolean z4, Composer composer, int i13) {
        int i14;
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87155h(z4) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (!c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87138X();
        } else if (!z4 || abstractC38656b == null) {
            c28655q.m87150e0(-1890299964);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-1890876564);
            TextResource textResourceMo123929h = abstractC38656b.getTitle();
            TextResource textResourceMo123923b = abstractC38656b.getDescription();
            TextResource textResourceMo123926e = abstractC38656b.getPrimaryActionText();
            InterfaceC39332e interfaceC39332eMo123925d = abstractC38656b.getPrimaryActionColor();
            TextResource.C8688b c8688bM123927f = abstractC38656b.getSecondaryActionText();
            boolean zM123928g = abstractC38656b.getShowCloseIcon();
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(abstractC38656b);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                final int i15 = 0;
                objM87133R = new InterfaceC4339a() { // from class: yu2.c
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                return AbstractC39795e.m127570u(function1, abstractC38656b);
                            default:
                                return AbstractC39795e.m127571v(function1, abstractC38656b);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87153g2 = c28655q.m87153g(function1) | c28655q.m87157i(abstractC38656b);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                final int i16 = 1;
                objM87133R2 = new InterfaceC4339a() { // from class: yu2.c
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                return AbstractC39795e.m127570u(function1, abstractC38656b);
                            default:
                                return AbstractC39795e.m127571v(function1, abstractC38656b);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            int i17 = TextResource.$stable;
            AbstractC21211n.m59497o(null, textResourceMo123929h, textResourceMo123923b, textResourceMo123926e, false, interfaceC39332eMo123925d, null, null, null, c8688bM123927f, null, false, zM123928g, null, null, false, 0, null, null, null, false, null, interfaceC4339a, null, (InterfaceC4339a) objM87133R2, null, null, null, c28655q, (i17 << 9) | (i17 << 3) | (i17 << 6) | (TextResource.C8688b.f25889c << 27), 0, 0, 247459281);
            c28655q.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m127570u(Function1 function1, AbstractC38656b abstractC38656b) {
        function1.invoke(abstractC38656b.getDismissEvent());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m127571v(Function1 function1, AbstractC38656b abstractC38656b) {
        function1.invoke(abstractC38656b.getApproveEvent());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m127572w(AbstractC38656b abstractC38656b, Function1 function1, int i13, Composer composer, int i14) {
        m127568s(abstractC38656b, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x0099  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:49:0x0111  */
    /* JADX WARN: Code duplicated, block: B:53:0x011c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0131  */
    /* JADX WARN: Code duplicated, block: B:57:0x0139  */
    /* JADX WARN: Code duplicated, block: B:60:0x0143  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: x */
    public static final void m127573x(StrengthTrainerDestination.C10741d.a navArgs, C39791a navRouter, boolean z4, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        boolean z14;
        boolean z15;
        C28677v1 c28677v1M87180u;
        C26669a c26669a;
        C38266c c38266c;
        C21647a c21647aM114690r;
        boolean zM87153g;
        Object objM87133R;
        InterfaceC23462h interfaceC23462h;
        String strM92103Y;
        boolean zM87157i;
        Object objM87133R2;
        boolean zM87157i2;
        Object objM87133R3;
        AbstractC22676k.m65750j(navArgs, "navArgs");
        AbstractC22676k.m65750j(navRouter, "navRouter");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1757977262);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(navArgs) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(navRouter) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i16 != 0) {
                    z15 = false;
                } else {
                    z15 = z13;
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
                C28676v0 c28676v0 = C28635l.f115821a;
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                interfaceC23462h = (InterfaceC23462h) objM87133R;
                c28655q.m87173q(false);
                InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(m127575z(interfaceC23462h).getViewState(), InterfaceC38658d.INSTANCE.m123953a(), null, c28655q, 0, 2);
                strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC11128h.f35455b2);
                C38657c c38657cM127575z = m127575z(interfaceC23462h);
                zM87157i = c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(navArgs) | c28655q.m87153g(strM92103Y);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    objM87133R2 = new b(navArgs, strM92103Y, interfaceC23462h, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c38657cM127575z);
                InterfaceC38658d interfaceC38658dM127532A = m127532A(interfaceC28601c1M87260n);
                C18733e initialListPosition = navArgs.getInitialListPosition();
                zM87157i2 = c28655q.m87157i(navArgs) | c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(navRouter) | ((i15 & 896) == 256);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i2 || objM87133R3 == c28676v0) {
                    C4614e c4614e = new C4614e(navArgs, navRouter, z15, interfaceC23462h, 15);
                    c28655q.m87172p0(c4614e);
                    objM87133R3 = c4614e;
                }
                m127574y(interfaceC38658dM127532A, initialListPosition, (Function1) objM87133R3, c28655q, 0, 0);
            } else {
                c28655q.m87138X();
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32676t1(navArgs, navRouter, z15, i13, i14, 10);
            }
        }
        i15 |= 384;
        z13 = z4;
        if ((i15 & 147) != 146) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            if (i16 != 0) {
                z15 = false;
            } else {
                z15 = z13;
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
            C28676v0 c28676v1 = C28635l.f115821a;
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
            InterfaceC28601c1 interfaceC28601c1M87260n2 = AbstractC28683x.m87260n(m127575z(interfaceC23462h).getViewState(), InterfaceC38658d.INSTANCE.m123953a(), null, c28655q, 0, 2);
            strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC11128h.f35455b2);
            C38657c c38657cM127575z2 = m127575z(interfaceC23462h);
            zM87157i = c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(navArgs) | c28655q.m87153g(strM92103Y);
            objM87133R2 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R2 = new b(navArgs, strM92103Y, interfaceC23462h, null);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new b(navArgs, strM92103Y, interfaceC23462h, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c38657cM127575z2);
            InterfaceC38658d interfaceC38658dM127532A2 = m127532A(interfaceC28601c1M87260n2);
            C18733e initialListPosition2 = navArgs.getInitialListPosition();
            zM87157i2 = c28655q.m87157i(navArgs) | c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(navRouter) | ((i15 & 896) == 256);
            objM87133R3 = c28655q.m87133R();
            if (zM87157i2) {
                C4614e c4614e2 = new C4614e(navArgs, navRouter, z15, interfaceC23462h, 15);
                c28655q.m87172p0(c4614e2);
                objM87133R3 = c4614e2;
            } else {
                C4614e c4614e3 = new C4614e(navArgs, navRouter, z15, interfaceC23462h, 15);
                c28655q.m87172p0(c4614e3);
                objM87133R3 = c4614e3;
            }
            m127574y(interfaceC38658dM127532A2, initialListPosition2, (Function1) objM87133R3, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32676t1(navArgs, navRouter, z15, i13, i14, 10);
        }
    }

    /* JADX INFO: renamed from: y */
    private static final void m127574y(InterfaceC38658d interfaceC38658d, C18733e c18733e, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        C18733e c18733e2;
        Function1 function2;
        C18733e c18733e3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(289111622);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(interfaceC38658d) : c28655q.m87157i(interfaceC38658d) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(c18733e) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            if (i16 != 0) {
                c18733e = null;
            }
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C39611k(27);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            Function1 function3 = function1;
            C26068u c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q, 3);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
            if (interfaceC38658d instanceof InterfaceC38658d.c) {
                c28655q.m87150e0(-1336595573);
                m127537F((InterfaceC38658d.c) interfaceC38658d, function3, interfaceC2994c0, c26068uM77569a, c28655q, (i15 & 14) | ((i15 >> 3) & 112));
                c28655q.m87173q(false);
                c18733e3 = c18733e;
            } else {
                if (!(interfaceC38658d instanceof InterfaceC38658d.b)) {
                    throw AbstractC11895b.m32003v(-1336596998, c28655q, false);
                }
                c28655q.m87150e0(-1336592633);
                int i18 = i15 << 3;
                c18733e3 = c18733e;
                m127543L((InterfaceC38658d.b) interfaceC38658d, c26068uM77569a, c18733e3, function3, c28655q, (i18 & 896) | (i15 & 14) | (i18 & 7168));
                function3 = function3;
                c28655q.m87173q(false);
            }
            function2 = function3;
            c18733e2 = c18733e3;
        } else {
            c28655q.m87138X();
            c18733e2 = c18733e;
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37526f(i13, i14, 28, interfaceC38658d, c18733e2, function2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C38657c m127575z(InterfaceC23462h interfaceC23462h) {
        return (C38657c) interfaceC23462h.getValue();
    }
}
