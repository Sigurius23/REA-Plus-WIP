package p739ui0;

import a81.AbstractC0564o;
import a81.InterfaceC0569t;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bc3.InterfaceC2994c0;
import bm2.C3440f1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4354p;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.ScreenAnalyticEventModel;
import com.whoop.archv2.feature.domain.C6005m;
import com.whoop.archv2.feature.domain.C6010p;
import com.whoop.archv2.feature.domain.C6011q;
import com.whoop.coacheverywherecommon.models.AbstractC6219a;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.models.modal.BottomSheet;
import com.whoop.design.models.modal.CoachModal;
import com.whoop.design.models.modal.DecodedGenericInteraction;
import com.whoop.design.models.modal.DialogModel;
import com.whoop.design.models.modal.FullScreenContentModal;
import com.whoop.design.models.modal.Modal;
import com.whoop.design.models.modal.ModalAnalyticEventModel;
import com.whoop.design.models.modal.ModalLifecycleInteraction;
import com.whoop.design.models.modal.ModalLifecycleInteractions;
import com.whoop.design.models.modal.ModalTrackingKt;
import com.whoop.design.models.modal.ModalType;
import com.whoop.design.models.modal.ToastModal;
import com.whoop.design.models.modal.UnknownModal;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.CachePolicyModel;
import com.whoop.navigation.models.ApiRequest;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.PermissionType;
import com.whoop.whoopaction.domain.models.ReloadAction;
import dp0.AbstractC12252h;
import dp0.InterfaceC12251g;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fi0.InterfaceC14515a;
import fy1.AbstractC14874j;
import ge3.AbstractC15751g;
import io.sentry.config.AbstractC20301a;
import iy1.InterfaceC21030c;
import j02.C21166s;
import jf3.C21647a;
import kotlin.C1990b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import live.hms.video.utils.AndroidSDKConstants;
import nf3.C26669a;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26967q;
import p088dc.AbstractC11895b;
import p249jc.AbstractC21598x;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p634y1.AbstractC39038k;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22672i;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p734sl0.C32632k2;
import p736sz0.C33205o0;
import pf3.C29155a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qi0.C30406a;
import qi0.C30409d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import re1.C31324k;
import ri0.C31444c;
import ri0.C31446e;
import ri0.InterfaceC31443b;
import s51.C32209f;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import s90.C32290f;
import sg2.C32451b;
import ti0.C33840e;
import tr2.InterfaceC34116n;
import tx0.C34238a;
import u71.C34569c;
import u91.C34656a;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import vi0.AbstractC36056a;
import xf3.C38266c;
import xi0.AbstractC38320b;

/* JADX INFO: renamed from: ui0.n */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0089\u0001\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2$\b\u0002\u0010\u0016\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0011H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001aE\u0010\"\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00140\u001fH\u0001¢\u0006\u0004\b\"\u0010#\u001a\u0015\u0010%\u001a\u0004\u0018\u00010\u0006*\u00020$H\u0002¢\u0006\u0004\b%\u0010&\u001aM\u0010.\u001a\u00020\u00142\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u00062\u0014\b\u0002\u0010-\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020,0\u001fH\u0002¢\u0006\u0004\b.\u0010/\"\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00066²\u0006\f\u0010*\u001a\u00020)8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001a\u001a\u00020\u00198\nX\u008a\u0084\u0002²\u0006\u000e\u00105\u001a\u0002048\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lqi0/d;", "navRouter", "Lqi0/a;", "actionRouter", "Lcom/whoop/navigation/models/ApiRequest;", "apiRequest", "", "metricFeatureName", "Lcom/whoop/analytics/ScreenAnalyticEventModel;", "screenAnalytics", "requestName", "Lcom/whoop/navigation/CachePolicyModel;", "cachePolicy", "Lcom/whoop/navigation/models/GenericInteraction;", "callerOnStartInteraction", "Lcom/whoop/archv2/feature/domain/m;", "genericTopItems", "Lkotlin/Function2;", "Lcom/whoop/whoopaction/domain/models/PermissionType;", "Lq83/d;", "Ll83/a0;", "", "onRequestPermission", "n", "(Lqi0/d;Lqi0/a;Lcom/whoop/navigation/models/ApiRequest;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Ljava/lang/String;Lcom/whoop/navigation/CachePolicyModel;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/archv2/feature/domain/m;Lc93/m;Landroidx/compose/runtime/Composer;II)V", "Lri0/e;", "viewState", "Liy1/c;", "metricWriter", "Lfi0/a;", "analyticsWriter", "Lkotlin/Function1;", "Lri0/b;", "onEvent", "o", "(Lri0/e;Liy1/c;Lfi0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/design/models/modal/AnyModal;", "N", "(Lcom/whoop/design/models/modal/AnyModal;)Ljava/lang/String;", "Lcom/whoop/design/models/modal/DecodedGenericInteraction;", "interaction", "Lri0/c;", "viewModel", "lifecycleEvent", "Lri0/b$w;", "presentModal", "L", "(Lcom/whoop/design/models/modal/DecodedGenericInteraction;Lri0/c;Lqi0/a;Lqi0/d;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Ltr2/n;", "a", "Ltr2/n;", "logger", "", "lastFiredOnStartHash", "arch-v2_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35012n {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC34116n f148111a = InterfaceC34116n.INSTANCE.m107848a("GenericScreen");

    /* JADX INFO: renamed from: ui0.n$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f148112w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f148113x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f148114y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f148115z;

        /* JADX INFO: renamed from: ui0.n$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42482a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f148116w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42482a(C21647a c21647a) {
                super(0);
                this.f148116w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f148116w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f148112w = c38266c;
            this.f148113x = interfaceC35951a;
            this.f148114y = interfaceC4339a;
            this.f148115z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, ri0.c] */
        @Override // c93.InterfaceC4339a
        public final C31444c invoke() {
            return AbstractC21598x.m60668X(this.f148112w, this.f148113x, new C42482a(this.f148115z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C31444c.class), null, this.f148114y);
        }
    }

    /* JADX INFO: renamed from: ui0.n$b */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.view.GenericScreenKt$GenericScreen$1$1", m100430f = "GenericScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/PermissionType;", "it", "Ll83/a0;", "<anonymous>", "(Lcom/whoop/whoopaction/domain/models/PermissionType;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f148117w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(PermissionType permissionType, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(permissionType, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f148117w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ui0.n$c */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.view.GenericScreenKt$GenericScreen$10$1", m100430f = "GenericScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC23462h f148118E;

        /* JADX INFO: renamed from: w */
        int f148119w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C30406a f148120x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C30409d f148121y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28670t2 f148122z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C30406a c30406a, C30409d c30409d, InterfaceC28670t2 interfaceC28670t2, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f148120x = c30406a;
            this.f148121y = c30409d;
            this.f148122z = interfaceC28670t2;
            this.f148118E = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f148120x, this.f148121y, this.f148122z, this.f148118E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            DecodedGenericInteraction onStart;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f148119w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            ModalLifecycleInteraction modalLifecycleInteractionM96817i = AbstractC35012n.m110568D(this.f148122z).getModalLifecycleInteraction();
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (modalLifecycleInteractionM96817i != null && (onStart = modalLifecycleInteractionM96817i.getOnStart()) != null) {
                AbstractC35012n.m110577M(onStart, AbstractC35012n.m110600v(this.f148118E), this.f148120x, this.f148121y, "modal on_start", null, 32, null);
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: ui0.n$d */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.view.GenericScreenKt$GenericScreen$11$1", m100430f = "GenericScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC23462h f148123E;

        /* JADX INFO: renamed from: w */
        int f148124w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C30406a f148125x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C30409d f148126y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28670t2 f148127z;

        /* JADX INFO: renamed from: ui0.n$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class a extends C22672i implements Function1 {

            /* JADX INFO: renamed from: w */
            public static final a f148128w = new a();

            public a() {
                super(1, InterfaceC31443b.t.class, "<init>", "<init>(Lcom/whoop/design/models/modal/AnyModal;)V", 0);
            }

            @Override // p715kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC31443b.t invoke(AnyModal p13) {
                AbstractC22676k.m65750j(p13, "p0");
                return new InterfaceC31443b.t(p13);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C30406a c30406a, C30409d c30409d, InterfaceC28670t2 interfaceC28670t2, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f148125x = c30406a;
            this.f148126y = c30409d;
            this.f148127z = interfaceC28670t2;
            this.f148123E = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f148125x, this.f148126y, this.f148127z, this.f148123E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            DecodedGenericInteraction onStart;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f148124w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            ModalLifecycleInteraction modalLifecycleInteractionM96819k = AbstractC35012n.m110568D(this.f148127z).getNestedModalLifecycleInteraction();
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (modalLifecycleInteractionM96819k != null && (onStart = modalLifecycleInteractionM96819k.getOnStart()) != null) {
                AbstractC35012n.m110576L(onStart, AbstractC35012n.m110600v(this.f148123E), this.f148125x, this.f148126y, "nested modal on_start", a.f148128w);
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: ui0.n$e */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.view.GenericScreenKt$GenericScreen$12$1", m100430f = "GenericScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28670t2 f148129E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC23462h f148130F;

        /* JADX INFO: renamed from: w */
        int f148131w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC21030c f148132x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC14515a f148133y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC12251g f148134z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC21030c interfaceC21030c, InterfaceC14515a interfaceC14515a, InterfaceC12251g interfaceC12251g, InterfaceC28670t2 interfaceC28670t2, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f148132x = interfaceC21030c;
            this.f148133y = interfaceC14515a;
            this.f148134z = interfaceC12251g;
            this.f148129E = interfaceC28670t2;
            this.f148130F = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f148132x, this.f148133y, this.f148134z, this.f148129E, this.f148130F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f148131w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AnyModal anyModalM96818j = AbstractC35012n.m110568D(this.f148129E).getNestedModal();
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (anyModalM96818j == null && (anyModalM96818j = AbstractC35012n.m110568D(this.f148129E).getModal()) == null) {
                return c23454a0;
            }
            Modal modal = anyModalM96818j.getModal();
            CoachModal coachModal = modal instanceof CoachModal ? (CoachModal) modal : null;
            if (coachModal == null) {
                return c23454a0;
            }
            ModalTrackingKt.trackModalPresentedMetric(ModalType.COACH, coachModal.getId(), this.f148132x);
            ModalTrackingKt.trackModalViewed(anyModalM96818j, this.f148133y);
            InterfaceC12251g.m34132f(this.f148134z, 0L, null, AbstractC6219a.m18524b(coachModal.getAiAction(), true), 3, null);
            AbstractC35012n.m110600v(this.f148130F).m96808r(InterfaceC31443b.f.f129347a);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: ui0.n$f */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.view.GenericScreenKt$GenericScreen$13$1", m100430f = "GenericScreen.kt", m100431l = {148}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f148135w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC23462h f148136x;

        /* JADX INFO: renamed from: ui0.n$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC23462h f148137w;

            public a(InterfaceC23462h interfaceC23462h) {
                this.f148137w = interfaceC23462h;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(InterfaceC31443b.w wVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                AbstractC35012n.m110600v(this.f148137w).m96808r(wVar);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f148136x = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f148136x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f148135w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM96806o = AbstractC35012n.m110600v(this.f148136x).m96806o();
                a aVar = new a(this.f148136x);
                this.f148135w = 1;
                if (interfaceC13058lM96806o.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ui0.n$g */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.view.GenericScreenKt$GenericScreen$2$1", m100430f = "GenericScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC23462h f148138E;

        /* JADX INFO: renamed from: w */
        int f148139w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ ApiRequest f148140x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ GenericInteraction f148141y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C6005m f148142z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ApiRequest apiRequest, GenericInteraction genericInteraction, C6005m c6005m, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f148140x = apiRequest;
            this.f148141y = genericInteraction;
            this.f148142z = c6005m;
            this.f148138E = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new g(this.f148140x, this.f148141y, this.f148142z, this.f148138E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f148139w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC35012n.m110600v(this.f148138E).m96808r(new InterfaceC31443b.i(this.f148140x, this.f148141y, this.f148142z));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ui0.n$h */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.view.GenericScreenKt$GenericScreen$3$1", m100430f = "GenericScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f148143w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28670t2 f148144x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC23462h f148145y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC28670t2 interfaceC28670t2, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f148144x = interfaceC28670t2;
            this.f148145y = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new h(this.f148144x, this.f148145y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f148143w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            ReloadAction reloadActionM96823o = AbstractC35012n.m110568D(this.f148144x).getPendingReloadAction();
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (reloadActionM96823o == null) {
                return c23454a0;
            }
            AbstractC35012n.m110600v(this.f148145y).m96808r(new InterfaceC31443b.u(false, null, reloadActionM96823o, 3, null));
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: ui0.n$i */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.view.GenericScreenKt$GenericScreen$4$1", m100430f = "GenericScreen.kt", m100431l = {88}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC23462h f148146E;

        /* JADX INFO: renamed from: w */
        Object f148147w;

        /* JADX INFO: renamed from: x */
        int f148148x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4351m f148149y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28670t2 f148150z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC4351m interfaceC4351m, InterfaceC28670t2 interfaceC28670t2, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f148149y = interfaceC4351m;
            this.f148150z = interfaceC28670t2;
            this.f148146E = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new i(this.f148149y, this.f148150z, this.f148146E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C6011q c6011q;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f148148x;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C6011q c6011qM96822n = AbstractC35012n.m110568D(this.f148150z).getPendingPermissionRequest();
                if (c6011qM96822n == null) {
                    return c23454a0;
                }
                InterfaceC4351m interfaceC4351m = this.f148149y;
                PermissionType permissionTypeM18039b = c6011qM96822n.getPermission();
                this.f148147w = c6011qM96822n;
                this.f148148x = 1;
                if (interfaceC4351m.invoke(permissionTypeM18039b, this) == enumC31071a) {
                    return enumC31071a;
                }
                c6011q = c6011qM96822n;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c6011q = (C6011q) this.f148147w;
                AbstractC34132o.m107864I(obj);
            }
            AbstractC35012n.m110600v(this.f148146E).m96808r(InterfaceC31443b.d.f129345a);
            GenericInteraction genericInteractionM18038a = c6011q.getOnSuccess();
            if (genericInteractionM18038a != null) {
                AbstractC35012n.m110600v(this.f148146E).m96808r(new InterfaceC31443b.r(genericInteractionM18038a));
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: ui0.n$j */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.view.GenericScreenKt$GenericScreen$7$1", m100430f = "GenericScreen.kt", m100431l = {106}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f148151w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC23462h f148152x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C30409d f148153y;

        /* JADX INFO: renamed from: ui0.n$j$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C30409d f148154w;

            public a(C30409d c30409d) {
                this.f148154w = c30409d;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(InterfaceC31443b.n nVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f148154w.m92936c(nVar);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC23462h interfaceC23462h, C30409d c30409d, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f148152x = interfaceC23462h;
            this.f148153y = c30409d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new j(this.f148152x, this.f148153y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f148151w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM96807q = AbstractC35012n.m110600v(this.f148152x).getNavigationEvents();
                a aVar = new a(this.f148153y);
                this.f148151w = 1;
                if (interfaceC13058lM96807q.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ui0.n$k */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.view.GenericScreenKt$GenericScreen$8$1", m100430f = "GenericScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f148155w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28670t2 f148156x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C30406a f148157y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC28670t2 interfaceC28670t2, C30406a c30406a, InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f148156x = interfaceC28670t2;
            this.f148157y = c30406a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new k(this.f148156x, this.f148157y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((k) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f148155w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC31443b.a aVarM96812d = AbstractC35012n.m110568D(this.f148156x).getAnalyticEvent();
            if (aVarM96812d != null) {
                this.f148157y.m92912i(aVarM96812d);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ui0.n$l */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.view.GenericScreenKt$GenericScreen$9$1", m100430f = "GenericScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class l extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28593a1 f148158E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC23462h f148159F;

        /* JADX INFO: renamed from: w */
        int f148160w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C30406a f148161x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C30409d f148162y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28670t2 f148163z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(C30406a c30406a, C30409d c30409d, InterfaceC28670t2 interfaceC28670t2, InterfaceC28593a1 interfaceC28593a1, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super l> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f148161x = c30406a;
            this.f148162y = c30409d;
            this.f148163z = interfaceC28670t2;
            this.f148158E = interfaceC28593a1;
            this.f148159F = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new l(this.f148161x, this.f148162y, this.f148163z, this.f148158E, this.f148159F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((l) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            int iHashCode;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f148160w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            DecodedGenericInteraction decodedGenericInteractionM96820l = AbstractC35012n.m110568D(this.f148163z).getOnStartLifecycleInteraction();
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (decodedGenericInteractionM96820l == null || AbstractC35012n.m110596r(this.f148158E) == (iHashCode = decodedGenericInteractionM96820l.hashCode())) {
                return c23454a0;
            }
            AbstractC35012n.m110597s(this.f148158E, iHashCode);
            AbstractC35012n.m110577M(decodedGenericInteractionM96820l, AbstractC35012n.m110600v(this.f148159F), this.f148161x, this.f148162y, "screen on_start", null, 32, null);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: ui0.n$m */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class m extends C22672i implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final m f148164w = new m();

        public m() {
            super(1, InterfaceC31443b.s.class, "<init>", "<init>(Lcom/whoop/design/models/modal/AnyModal;)V", 0);
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC31443b.s invoke(AnyModal p13) {
            AbstractC22676k.m65750j(p13, "p0");
            return new InterfaceC31443b.s(p13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m110565A(C31446e c31446e, Function1 function1) {
        ModalLifecycleInteractions modalLifecycleInteractions;
        GenericInteraction onUserDismiss;
        AnyModal anyModalM96816h = c31446e.getModal();
        if (anyModalM96816h != null && (modalLifecycleInteractions = anyModalM96816h.getModalLifecycleInteractions()) != null && (onUserDismiss = modalLifecycleInteractions.getOnUserDismiss()) != null) {
            function1.invoke(new InterfaceC31443b.r(onUserDismiss));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m110566B(C31446e c31446e, InterfaceC21030c interfaceC21030c, Function1 function1, FullScreenContentModal unused$var$, ModalAnalyticEventModel modalAnalyticEventModel, InterfaceC14515a interfaceC14515a, Function1 unused$var$2, Composer composer, int i13) {
        AbstractC22676k.m65750j(unused$var$, "$unused$var$");
        AbstractC22676k.m65750j(unused$var$2, "$unused$var$");
        C33840e c33840eM96814f = c31446e.getFullScreenContentState();
        if (c33840eM96814f == null) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-1368253498);
            c28655q.m87173q(false);
        } else {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(-1368253497);
            int i14 = i13 << 3;
            AbstractC36056a.m114478d(c33840eM96814f, c31446e.getNestedModal(), modalAnalyticEventModel, interfaceC14515a, interfaceC21030c, function1, c28655q2, (AnyModal.$stable << 3) | (ModalAnalyticEventModel.$stable << 6) | (i14 & 896) | (i14 & 7168));
            c28655q2.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m110567C(C31446e c31446e, InterfaceC21030c interfaceC21030c, InterfaceC14515a interfaceC14515a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m110593o(c31446e, interfaceC21030c, interfaceC14515a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C31446e m110568D(InterfaceC28670t2 interfaceC28670t2) {
        return (C31446e) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m110569E(InterfaceC23462h interfaceC23462h, C6010p c6010p, String str) {
        m110600v(interfaceC23462h).m96808r((c6010p == null || str == null) ? InterfaceC31443b.o.f129363a : new InterfaceC31443b.m(c6010p, str));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m110570F(InterfaceC23462h interfaceC23462h, C6010p c6010p) {
        m110600v(interfaceC23462h).m96808r(c6010p != null ? new InterfaceC31443b.l(c6010p) : InterfaceC31443b.o.f129363a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final void m110576L(DecodedGenericInteraction decodedGenericInteraction, C31444c c31444c, C30406a c30406a, C30409d c30409d, String str, Function1 function1) {
        boolean z4 = false;
        f148111a.mo85228t(AbstractC11895b.m31996o("Dispatching ", str, " lifecycle interaction"), new AbstractC30556a.a[0]);
        AnyModal modal = decodedGenericInteraction.getModal();
        if (modal != null) {
            c31444c.m96808r((InterfaceC31443b.w) function1.invoke(modal));
        }
        AnalyticEventModel analyticEvent = decodedGenericInteraction.getAnalyticEvent();
        if (analyticEvent != null) {
            c30406a.m92912i(new InterfaceC31443b.g(analyticEvent));
        }
        Action action = decodedGenericInteraction.getAction();
        if (action != null) {
            c31444c.m96808r(new InterfaceC31443b.p(action));
        }
        C9598e navigation = decodedGenericInteraction.getNavigation();
        if (navigation != null) {
            c30409d.m92936c(new InterfaceC31443b.c(navigation, z4, 2, null));
        }
        C21166s dismissEvent = decodedGenericInteraction.getDismissEvent();
        if (dismissEvent != null) {
            c30409d.m92936c(new InterfaceC31443b.q(dismissEvent));
        }
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m110577M(DecodedGenericInteraction decodedGenericInteraction, C31444c c31444c, C30406a c30406a, C30409d c30409d, String str, Function1 function1, int i13, Object obj) {
        if ((i13 & 32) != 0) {
            function1 = m.f148164w;
        }
        m110576L(decodedGenericInteraction, c31444c, c30406a, c30409d, str, function1);
    }

    /* JADX INFO: renamed from: N */
    private static final String m110578N(AnyModal anyModal) {
        Modal modal = anyModal.getModal();
        if (modal instanceof DialogModel) {
            return ((DialogModel) modal).getId();
        }
        if (modal instanceof BottomSheet) {
            return ((BottomSheet) modal).getId();
        }
        if (modal instanceof FullScreenContentModal) {
            return ((FullScreenContentModal) modal).getId();
        }
        if (modal instanceof ToastModal) {
            return ((ToastModal) modal).getId();
        }
        if (modal instanceof CoachModal) {
            return ((CoachModal) modal).getId();
        }
        if (modal instanceof UnknownModal) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:127:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:128:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:137:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:144:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:150:0x0218  */
    /* JADX WARN: Code duplicated, block: B:153:0x0288  */
    /* JADX WARN: Code duplicated, block: B:159:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:162:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:167:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:170:0x0313  */
    /* JADX WARN: Code duplicated, block: B:175:0x0333  */
    /* JADX WARN: Code duplicated, block: B:184:0x0377  */
    /* JADX WARN: Code duplicated, block: B:193:0x0391  */
    /* JADX WARN: Code duplicated, block: B:199:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:203:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:207:0x040f  */
    /* JADX WARN: Code duplicated, block: B:211:0x0433  */
    /* JADX WARN: Code duplicated, block: B:215:0x044d  */
    /* JADX WARN: Code duplicated, block: B:219:0x047b  */
    /* JADX WARN: Code duplicated, block: B:223:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:226:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:230:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:235:0x0521  */
    /* JADX WARN: Code duplicated, block: B:236:0x0524  */
    /* JADX WARN: Code duplicated, block: B:239:0x0534  */
    /* JADX WARN: Code duplicated, block: B:240:0x053a  */
    /* JADX WARN: Code duplicated, block: B:246:0x0569  */
    /* JADX WARN: Code duplicated, block: B:250:0x0586  */
    /* JADX WARN: Code duplicated, block: B:253:0x0596  */
    /* JADX WARN: Code duplicated, block: B:254:0x059c  */
    /* JADX WARN: Code duplicated, block: B:258:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:264:0x0605  */
    /* JADX WARN: Code duplicated, block: B:268:0x0632  */
    /* JADX WARN: Code duplicated, block: B:270:0x0678  */
    /* JADX WARN: Code duplicated, block: B:272:0x0680  */
    /* JADX WARN: Code duplicated, block: B:274:0x0688  */
    /* JADX WARN: Code duplicated, block: B:276:0x068f  */
    /* JADX INFO: renamed from: n */
    public static final void m110592n(C30409d navRouter, C30406a actionRouter, ApiRequest apiRequest, String metricFeatureName, ScreenAnalyticEventModel screenAnalytics, String requestName, CachePolicyModel cachePolicy, GenericInteraction genericInteraction, C6005m c6005m, InterfaceC4351m interfaceC4351m, Composer composer, int i13, int i14) {
        int i15;
        C6005m c6005m2;
        ApiRequest apiRequest2;
        GenericInteraction genericInteraction2;
        InterfaceC4351m interfaceC4351m2;
        C6005m c6005m3;
        C28655q c28655q;
        ApiRequest apiRequest3;
        int i16;
        C6005m c6005m4;
        GenericInteraction genericInteraction3;
        Object obj;
        InterfaceC4351m interfaceC4351m3;
        boolean z4;
        boolean z13;
        boolean z14;
        Object obj2;
        InterfaceC4339a interfaceC4339a;
        C26669a c26669a;
        C38266c c38266c;
        C21647a c21647aM114690r;
        boolean zM87153g;
        Object obj3;
        InterfaceC23462h interfaceC23462h;
        int i17;
        InterfaceC28601c1 interfaceC28601c1M87260n;
        C26669a c26669a2;
        C38266c c38266c2;
        boolean zM87153g2;
        Object objM87133R;
        InterfaceC21030c interfaceC21030c;
        C26669a c26669a3;
        C38266c c38266c3;
        boolean zM87153g3;
        Object objM87133R2;
        InterfaceC14515a interfaceC14515a;
        C26669a c26669a4;
        C38266c c38266c4;
        boolean zM87153g4;
        Object objM87133R3;
        InterfaceC12251g interfaceC12251g;
        boolean z15;
        ApiRequest apiRequest4;
        boolean z16;
        boolean zM87157i;
        Object objM87133R4;
        GenericInteraction genericInteraction4;
        C6005m c6005m5;
        boolean zM87153g5;
        Object obj4;
        boolean zM87153g6;
        Object obj5;
        boolean zM87157i2;
        Object obj6;
        boolean zM87157i3;
        int i18;
        Object obj7;
        C28655q c28655q2;
        boolean zM87157i4;
        Object obj8;
        boolean zM87153g7;
        Object obj9;
        Object objM87133R5;
        Object obj10;
        InterfaceC28593a1 interfaceC28593a1;
        boolean zM87153g8;
        InterfaceC28601c1 interfaceC28601c1;
        Object lVar;
        boolean z17;
        boolean z18;
        AnyModal anyModalM96816h;
        String strM110578N;
        boolean zM87153g9;
        Object obj11;
        AnyModal anyModalM96818j;
        String strM110578N2;
        boolean zM87153g10;
        Object objM87133R6;
        boolean zM87153g11;
        Object objM87133R7;
        InterfaceC14515a interfaceC14515a2;
        InterfaceC21030c interfaceC21030c2;
        boolean zM87157i5;
        Object obj12;
        AbstractC22676k.m65750j(navRouter, "navRouter");
        AbstractC22676k.m65750j(actionRouter, "actionRouter");
        AbstractC22676k.m65750j(metricFeatureName, "metricFeatureName");
        AbstractC22676k.m65750j(screenAnalytics, "screenAnalytics");
        AbstractC22676k.m65750j(requestName, "requestName");
        AbstractC22676k.m65750j(cachePolicy, "cachePolicy");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(1701872595);
        if ((i13 & 6) == 0) {
            i15 = (c28655q3.m87157i(navRouter) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q3.m87157i(actionRouter) ? 32 : 16;
        }
        int i19 = i14 & 4;
        if (i19 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q3.m87153g(apiRequest) : c28655q3.m87157i(apiRequest) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q3.m87153g(metricFeatureName) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q3.m87157i(screenAnalytics) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q3.m87153g(requestName) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i15 |= (i13 & 2097152) == 0 ? c28655q3.m87153g(cachePolicy) : c28655q3.m87157i(cachePolicy) ? 1048576 : 524288;
        }
        int i24 = i14 & 128;
        int i25 = 12582912;
        if (i24 != 0) {
            i15 |= i25;
        } else if ((i13 & 12582912) == 0) {
            i25 = (i13 & 16777216) == 0 ? c28655q3.m87153g(genericInteraction) : c28655q3.m87157i(genericInteraction) ? 8388608 : 4194304;
            i15 |= i25;
        }
        int i26 = i14 & 256;
        if (i26 != 0) {
            i15 |= 100663296;
            c6005m2 = c6005m;
        } else {
            c6005m2 = c6005m;
            if ((i13 & 100663296) == 0) {
                i15 |= c28655q3.m87157i(c6005m2) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
            }
        }
        if ((i13 & 805306368) == 0) {
            i15 |= ((i14 & 512) == 0 && c28655q3.m87157i(interfaceC4351m)) ? 536870912 : 268435456;
        }
        if (c28655q3.m87135U(i15 & 1, (i15 & 306783379) != 306783378)) {
            c28655q3.m87140Z();
            int i27 = i13 & 1;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i27 == 0 || c28655q3.m87118C()) {
                apiRequest3 = i19 != 0 ? null : apiRequest;
                GenericInteraction genericInteraction5 = i24 != 0 ? null : genericInteraction;
                if (i26 != 0) {
                    c6005m2 = null;
                }
                if ((i14 & 512) != 0) {
                    Object objM87133R8 = c28655q3.m87133R();
                    if (objM87133R8 == c28676v0) {
                        obj = objM87133R8;
                        b bVar = new b(null);
                        c28655q3.m87172p0(bVar);
                        obj = bVar;
                    }
                    obj = objM87133R8;
                    GenericInteraction genericInteraction6 = genericInteraction5;
                    interfaceC4351m3 = (InterfaceC4351m) obj;
                    genericInteraction3 = genericInteraction6;
                    C6005m c6005m6 = c6005m2;
                    i16 = i15 & (-1879048193);
                    c6005m4 = c6005m6;
                } else {
                    C6005m c6005m7 = c6005m2;
                    i16 = i15;
                    c6005m4 = c6005m7;
                    genericInteraction3 = genericInteraction5;
                }
                c28655q3.m87175r();
                boolean zM87157i6 = c28655q3.m87157i(screenAnalytics);
                if ((i16 & 458752) == 131072) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z19 = zM87157i6 | z4;
                if ((3670016 & i16) != 1048576 || ((i16 & 2097152) != 0 && c28655q3.m87157i(cachePolicy))) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z19 | z13;
                Object objM87133R9 = c28655q3.m87133R();
                obj2 = objM87133R9;
                if (z14 || objM87133R9 == c28676v0) {
                    C31324k c31324k = new C31324k(screenAnalytics, requestName, cachePolicy, 8);
                    c28655q3.m87172p0(c31324k);
                    obj2 = c31324k;
                }
                interfaceC4339a = (InterfaceC4339a) obj2;
                c28655q3.m87152f0(-1688186518);
                c26669a = C29155a.f118017b;
                if (c26669a != null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                c38266c = c26669a.f106046a.f159364d;
                c21647aM114690r = AbstractC36095b.m114690r(c28655q3, -1688186210, c28655q3, false, -3686552);
                zM87153g = c28655q3.m87153g(null) | c28655q3.m87153g(interfaceC4339a);
                Object objM87133R10 = c28655q3.m87133R();
                if (!zM87153g || objM87133R10 == c28676v0) {
                    InterfaceC23462h interfaceC23462hM92087G = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, interfaceC4339a, c21647aM114690r));
                    c28655q3.m87172p0(interfaceC23462hM92087G);
                    obj3 = interfaceC23462hM92087G;
                } else {
                    obj3 = objM87133R10;
                }
                c28655q3.m87173q(false);
                interfaceC23462h = (InterfaceC23462h) obj3;
                c28655q3.m87173q(false);
                InterfaceC31443b.a aVar = null;
                boolean z24 = false ? 1 : 0;
                interfaceC4351m2 = interfaceC4351m3;
                i17 = i16;
                interfaceC28601c1M87260n = AbstractC28683x.m87260n(m110600v(interfaceC23462h).getViewState(), new C31446e(new C31446e.b(C33205o0.f138451a.m105288b(), null, aVar, null, null, null, 62, null), null, false, aVar, false ? 1 : 0, false ? 1 : 0, false ? 1 : 0, null, z24, null, null, null, null, false, 16382, null), null, c28655q3, 0, 2);
                c28655q3.m87152f0(-909571169);
                c26669a2 = C29155a.f118017b;
                if (c26669a2 != null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                c38266c2 = c26669a2.f106046a.f159364d;
                c28655q3.m87152f0(-3686552);
                zM87153g2 = c28655q3.m87153g(null) | c28655q3.m87153g(null);
                objM87133R = c28655q3.m87133R();
                if (zM87153g2 || objM87133R == c28676v0) {
                    objM87133R = c38266c2.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21030c.class), null);
                    c28655q3.m87172p0(objM87133R);
                }
                c28655q3.m87173q(false);
                c28655q3.m87173q(false);
                interfaceC21030c = (InterfaceC21030c) objM87133R;
                c28655q3.m87152f0(-909571169);
                c26669a3 = C29155a.f118017b;
                if (c26669a3 != null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                c38266c3 = c26669a3.f106046a.f159364d;
                c28655q3.m87152f0(-3686552);
                zM87153g3 = c28655q3.m87153g(null) | c28655q3.m87153g(null);
                objM87133R2 = c28655q3.m87133R();
                if (zM87153g3 || objM87133R2 == c28676v0) {
                    Object objM122602a = c38266c3.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null);
                    c28655q3.m87172p0(objM122602a);
                    objM87133R2 = objM122602a;
                }
                c28655q3.m87173q(false);
                c28655q3.m87173q(false);
                interfaceC14515a = (InterfaceC14515a) objM87133R2;
                c28655q3.m87152f0(-909571169);
                c26669a4 = C29155a.f118017b;
                if (c26669a4 != null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                c38266c4 = c26669a4.f106046a.f159364d;
                c28655q3.m87152f0(-3686552);
                zM87153g4 = c28655q3.m87153g(null) | c28655q3.m87153g(null);
                objM87133R3 = c28655q3.m87133R();
                if (zM87153g4 || objM87133R3 == c28676v0) {
                    Object objM122602a2 = c38266c4.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25307p.class), null);
                    c28655q3.m87172p0(objM122602a2);
                    objM87133R3 = objM122602a2;
                }
                c28655q3.m87173q(false);
                c28655q3.m87173q(false);
                C25307p c25307p = (C25307p) objM87133R3;
                interfaceC12251g = (InterfaceC12251g) c28655q3.m87161k(AbstractC12252h.m34153c());
                C31444c c31444cM110600v = m110600v(interfaceC23462h);
                boolean zM87157i7 = c28655q3.m87157i(interfaceC23462h);
                if ((i17 & 896) != 256 || ((i17 & 512) != 0 && c28655q3.m87157i(apiRequest3))) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z25 = zM87157i7 | z15;
                apiRequest4 = apiRequest3;
                if ((29360128 & i17) != 8388608 || ((i17 & 16777216) != 0 && c28655q3.m87157i(genericInteraction3))) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zM87157i = z16 | z25 | c28655q3.m87157i(c6005m4);
                objM87133R4 = c28655q3.m87133R();
                if (!zM87157i || objM87133R4 == c28676v0) {
                    GenericInteraction genericInteraction7 = genericInteraction3;
                    C6005m c6005m8 = c6005m4;
                    objM87133R4 = new g(apiRequest4, genericInteraction7, c6005m8, interfaceC23462h, null);
                    genericInteraction4 = genericInteraction7;
                    c6005m5 = c6005m8;
                    c28655q3.m87172p0(objM87133R4);
                } else {
                    genericInteraction4 = genericInteraction3;
                    c6005m5 = c6005m4;
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R4, c31444cM110600v);
                ReloadAction reloadActionM96823o = m110568D(interfaceC28601c1M87260n).getPendingReloadAction();
                zM87153g5 = c28655q3.m87153g(interfaceC28601c1M87260n) | c28655q3.m87157i(r28);
                Object objM87133R11 = c28655q3.m87133R();
                obj4 = objM87133R11;
                if (zM87153g5 || objM87133R11 == c28676v0) {
                    h hVar = new h(interfaceC28601c1M87260n, r28, null);
                    c28655q3.m87172p0(hVar);
                    obj4 = hVar;
                }
                ReloadAction.Companion companion = ReloadAction.INSTANCE;
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) obj4, reloadActionM96823o);
                C6011q c6011qM96822n = m110568D(interfaceC28601c1M87260n).getPendingPermissionRequest();
                zM87153g6 = c28655q3.m87153g(interfaceC28601c1M87260n) | c28655q3.m87157i(interfaceC4351m2) | c28655q3.m87157i(r28);
                Object objM87133R12 = c28655q3.m87133R();
                obj5 = objM87133R12;
                if (zM87153g6 || objM87133R12 == c28676v0) {
                    i iVar = new i(interfaceC4351m2, interfaceC28601c1M87260n, r28, null);
                    c28655q3.m87172p0(iVar);
                    obj5 = iVar;
                }
                int i28 = GenericInteraction.$stable;
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) obj5, c6011qM96822n);
                C6010p c6010pM96821m = m110568D(interfaceC28601c1M87260n).getPendingMediaPick();
                zM87157i2 = c28655q3.m87157i(r28);
                Object objM87133R13 = c28655q3.m87133R();
                obj6 = objM87133R13;
                if (zM87157i2 || objM87133R13 == c28676v0) {
                    C34238a c34238a = new C34238a(r28, 12);
                    c28655q3.m87172p0(c34238a);
                    obj6 = c34238a;
                }
                InterfaceC4351m interfaceC4351m4 = (InterfaceC4351m) obj6;
                zM87157i3 = c28655q3.m87157i(r28);
                Object objM87133R14 = c28655q3.m87133R();
                i18 = 6;
                obj7 = objM87133R14;
                if (zM87157i3 || objM87133R14 == c28676v0) {
                    C26967q c26967q = new C26967q(r28, i18);
                    c28655q3.m87172p0(c26967q);
                    obj7 = c26967q;
                }
                AbstractC35016r.m110638f(c6010pM96821m, interfaceC4351m4, (Function1) obj7, null, c28655q3, i28, 8);
                c28655q2 = c28655q3;
                C31444c c31444cM110600v2 = m110600v(r28);
                zM87157i4 = c28655q2.m87157i(r28) | c28655q2.m87157i(navRouter);
                Object objM87133R15 = c28655q2.m87133R();
                obj8 = objM87133R15;
                if (zM87157i4 || objM87133R15 == c28676v0) {
                    j jVar = new j(r28, navRouter, null);
                    c28655q2.m87172p0(jVar);
                    obj8 = jVar;
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) obj8, c31444cM110600v2);
                InterfaceC31443b.a aVarM96812d = m110568D(interfaceC28601c1M87260n).getAnalyticEvent();
                zM87153g7 = c28655q2.m87153g(interfaceC28601c1M87260n) | c28655q2.m87157i(actionRouter);
                Object objM87133R16 = c28655q2.m87133R();
                obj9 = objM87133R16;
                if (zM87153g7 || objM87133R16 == c28676v0) {
                    k kVar = new k(interfaceC28601c1M87260n, actionRouter, null);
                    c28655q2.m87172p0(kVar);
                    obj9 = kVar;
                }
                AbstractC28683x.m87254h(actionRouter, aVarM96812d, (InterfaceC4351m) obj9, c28655q2);
                Object[] objArr = new Object[0];
                objM87133R5 = c28655q2.m87133R();
                obj10 = objM87133R5;
                if (objM87133R5 == c28676v0) {
                    C34656a c34656a = new C34656a(19);
                    c28655q2.m87172p0(c34656a);
                    obj10 = c34656a;
                }
                interfaceC28593a1 = (InterfaceC28593a1) AbstractC39038k.m124457c(objArr, (InterfaceC4339a) obj10, c28655q2, 48);
                DecodedGenericInteraction decodedGenericInteractionM96820l = m110568D(interfaceC28601c1M87260n).getOnStartLifecycleInteraction();
                zM87153g8 = c28655q2.m87153g(interfaceC28601c1M87260n) | c28655q2.m87153g(interfaceC28593a1) | c28655q2.m87157i(r28) | c28655q2.m87157i(actionRouter) | c28655q2.m87157i(navRouter);
                Object objM87133R17 = c28655q2.m87133R();
                if (!zM87153g8 || objM87133R17 == c28676v0) {
                    interfaceC28601c1 = interfaceC28601c1M87260n;
                    z17 = false;
                    lVar = new l(actionRouter, navRouter, interfaceC28601c1, interfaceC28593a1, r28, null);
                    c28655q2.m87172p0(lVar);
                } else {
                    interfaceC28601c1 = interfaceC28601c1M87260n;
                    lVar = objM87133R17;
                    z17 = false;
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) lVar, decodedGenericInteractionM96820l);
                if (m110568D(interfaceC28601c1).getModal() != null) {
                    z18 = true;
                } else {
                    z18 = z17;
                }
                Boolean boolValueOf = Boolean.valueOf(z18);
                anyModalM96816h = m110568D(interfaceC28601c1).getModal();
                if (anyModalM96816h != null) {
                    strM110578N = m110578N(anyModalM96816h);
                } else {
                    strM110578N = null;
                }
                ModalLifecycleInteraction modalLifecycleInteractionM96817i = m110568D(interfaceC28601c1).getModalLifecycleInteraction();
                zM87153g9 = c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87157i(r28) | c28655q2.m87157i(actionRouter) | c28655q2.m87157i(navRouter);
                Object objM87133R18 = c28655q2.m87133R();
                if (!zM87153g9 || objM87133R18 == c28676v0) {
                    c cVar = new c(actionRouter, navRouter, interfaceC28601c1, r28, null);
                    c28655q2.m87172p0(cVar);
                    obj11 = cVar;
                } else {
                    obj11 = objM87133R18;
                }
                AbstractC28683x.m87255i(boolValueOf, strM110578N, modalLifecycleInteractionM96817i, (InterfaceC4351m) obj11, c28655q2);
                Boolean boolValueOf2 = Boolean.valueOf(m110568D(interfaceC28601c1).getNestedModal() == null ? z17 : true);
                anyModalM96818j = m110568D(interfaceC28601c1).getNestedModal();
                if (anyModalM96818j != null) {
                    strM110578N2 = m110578N(anyModalM96818j);
                } else {
                    strM110578N2 = null;
                }
                ModalLifecycleInteraction modalLifecycleInteractionM96819k = m110568D(interfaceC28601c1).getNestedModalLifecycleInteraction();
                zM87153g10 = c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87157i(r28) | c28655q2.m87157i(actionRouter) | c28655q2.m87157i(navRouter);
                objM87133R6 = c28655q2.m87133R();
                if (zM87153g10 || objM87133R6 == c28676v0) {
                    d dVar = new d(actionRouter, navRouter, interfaceC28601c1, r28, null);
                    c28655q2.m87172p0(dVar);
                    objM87133R6 = dVar;
                }
                AbstractC28683x.m87255i(boolValueOf2, strM110578N2, modalLifecycleInteractionM96819k, (InterfaceC4351m) objM87133R6, c28655q2);
                AnyModal anyModalM96816h2 = m110568D(interfaceC28601c1).getModal();
                AnyModal anyModalM96818j2 = m110568D(interfaceC28601c1).getNestedModal();
                zM87153g11 = c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87157i(interfaceC21030c) | c28655q2.m87157i(interfaceC14515a) | c28655q2.m87157i(interfaceC12251g) | c28655q2.m87157i(r28);
                objM87133R7 = c28655q2.m87133R();
                if (!zM87153g11 || objM87133R7 == c28676v0) {
                    interfaceC14515a2 = interfaceC14515a;
                    interfaceC21030c2 = interfaceC21030c;
                    objM87133R7 = new e(interfaceC21030c2, interfaceC14515a2, interfaceC12251g, interfaceC28601c1, r28, null);
                    c28655q2.m87172p0(objM87133R7);
                } else {
                    interfaceC14515a2 = interfaceC14515a;
                    interfaceC21030c2 = interfaceC21030c;
                }
                AnyModal.Companion companion2 = AnyModal.INSTANCE;
                AbstractC28683x.m87254h(anyModalM96816h2, anyModalM96818j2, (InterfaceC4351m) objM87133R7, c28655q2);
                C31444c c31444cM110600v3 = m110600v(r28);
                zM87157i5 = c28655q2.m87157i(r28);
                Object objM87133R19 = c28655q2.m87133R();
                obj12 = objM87133R19;
                if (zM87157i5 || objM87133R19 == c28676v0) {
                    f fVar = new f(r28, null);
                    c28655q2.m87172p0(fVar);
                    obj12 = fVar;
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) obj12, c31444cM110600v3);
                AbstractC14874j.m42904c(m110568D(interfaceC28601c1), metricFeatureName, c28655q2, (i17 >> 6) & 112);
                AbstractC28683x.m87247a(AbstractC25303l.m74272C().mo86977a(c25307p), AbstractC37817c.m121344e(-1841940333, c28655q2, new C1990b0(interfaceC21030c2, interfaceC14515a2, actionRouter, interfaceC23462h, navRouter, interfaceC28601c1, 10)), c28655q2, 56);
                apiRequest2 = apiRequest4;
                genericInteraction2 = genericInteraction4;
                c6005m3 = c6005m5;
                c28655q = c28655q2;
            } else {
                c28655q3.m87138X();
                if ((i14 & 512) != 0) {
                    i15 &= -1879048193;
                }
                C6005m c6005m9 = c6005m2;
                i16 = i15;
                c6005m4 = c6005m9;
                apiRequest3 = apiRequest;
                genericInteraction3 = genericInteraction;
            }
            interfaceC4351m3 = interfaceC4351m;
            c28655q3.m87175r();
            boolean zM87157i8 = c28655q3.m87157i(screenAnalytics);
            if ((i16 & 458752) == 131072) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z110 = zM87157i8 | z4;
            if ((3670016 & i16) != 1048576) {
                z13 = true;
            } else {
                z13 = true;
            }
            z14 = z110 | z13;
            Object objM87133R20 = c28655q3.m87133R();
            obj2 = objM87133R20;
            if (z14) {
                C31324k c31324k2 = new C31324k(screenAnalytics, requestName, cachePolicy, 8);
                c28655q3.m87172p0(c31324k2);
                obj2 = c31324k2;
            } else {
                C31324k c31324k3 = new C31324k(screenAnalytics, requestName, cachePolicy, 8);
                c28655q3.m87172p0(c31324k3);
                obj2 = c31324k3;
            }
            interfaceC4339a = (InterfaceC4339a) obj2;
            c28655q3.m87152f0(-1688186518);
            c26669a = C29155a.f118017b;
            if (c26669a != null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            c38266c = c26669a.f106046a.f159364d;
            c21647aM114690r = AbstractC36095b.m114690r(c28655q3, -1688186210, c28655q3, false, -3686552);
            zM87153g = c28655q3.m87153g(null) | c28655q3.m87153g(interfaceC4339a);
            Object objM87133R110 = c28655q3.m87133R();
            if (zM87153g) {
                InterfaceC23462h interfaceC23462hM92087G2 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, interfaceC4339a, c21647aM114690r));
                c28655q3.m87172p0(interfaceC23462hM92087G2);
                obj3 = interfaceC23462hM92087G2;
            } else {
                InterfaceC23462h interfaceC23462hM92087G3 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, interfaceC4339a, c21647aM114690r));
                c28655q3.m87172p0(interfaceC23462hM92087G3);
                obj3 = interfaceC23462hM92087G3;
            }
            c28655q3.m87173q(false);
            interfaceC23462h = (InterfaceC23462h) obj3;
            c28655q3.m87173q(false);
            InterfaceC31443b.a aVar2 = null;
            boolean z26 = false ? 1 : 0;
            interfaceC4351m2 = interfaceC4351m3;
            i17 = i16;
            interfaceC28601c1M87260n = AbstractC28683x.m87260n(m110600v(interfaceC23462h).getViewState(), new C31446e(new C31446e.b(C33205o0.f138451a.m105288b(), null, aVar2, null, null, null, 62, null), null, false, aVar2, false ? 1 : 0, false ? 1 : 0, false ? 1 : 0, null, z26, null, null, null, null, false, 16382, null), null, c28655q3, 0, 2);
            c28655q3.m87152f0(-909571169);
            c26669a2 = C29155a.f118017b;
            if (c26669a2 != null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            c38266c2 = c26669a2.f106046a.f159364d;
            c28655q3.m87152f0(-3686552);
            zM87153g2 = c28655q3.m87153g(null) | c28655q3.m87153g(null);
            objM87133R = c28655q3.m87133R();
            if (zM87153g2) {
                objM87133R = c38266c2.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21030c.class), null);
                c28655q3.m87172p0(objM87133R);
            } else {
                objM87133R = c38266c2.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21030c.class), null);
                c28655q3.m87172p0(objM87133R);
            }
            c28655q3.m87173q(false);
            c28655q3.m87173q(false);
            interfaceC21030c = (InterfaceC21030c) objM87133R;
            c28655q3.m87152f0(-909571169);
            c26669a3 = C29155a.f118017b;
            if (c26669a3 != null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            c38266c3 = c26669a3.f106046a.f159364d;
            c28655q3.m87152f0(-3686552);
            zM87153g3 = c28655q3.m87153g(null) | c28655q3.m87153g(null);
            objM87133R2 = c28655q3.m87133R();
            if (zM87153g3) {
                Object objM122602a3 = c38266c3.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null);
                c28655q3.m87172p0(objM122602a3);
                objM87133R2 = objM122602a3;
            } else {
                Object objM122602a4 = c38266c3.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null);
                c28655q3.m87172p0(objM122602a4);
                objM87133R2 = objM122602a4;
            }
            c28655q3.m87173q(false);
            c28655q3.m87173q(false);
            interfaceC14515a = (InterfaceC14515a) objM87133R2;
            c28655q3.m87152f0(-909571169);
            c26669a4 = C29155a.f118017b;
            if (c26669a4 != null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            c38266c4 = c26669a4.f106046a.f159364d;
            c28655q3.m87152f0(-3686552);
            zM87153g4 = c28655q3.m87153g(null) | c28655q3.m87153g(null);
            objM87133R3 = c28655q3.m87133R();
            if (zM87153g4) {
                Object objM122602a5 = c38266c4.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25307p.class), null);
                c28655q3.m87172p0(objM122602a5);
                objM87133R3 = objM122602a5;
            } else {
                Object objM122602a6 = c38266c4.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25307p.class), null);
                c28655q3.m87172p0(objM122602a6);
                objM87133R3 = objM122602a6;
            }
            c28655q3.m87173q(false);
            c28655q3.m87173q(false);
            C25307p c25307p2 = (C25307p) objM87133R3;
            interfaceC12251g = (InterfaceC12251g) c28655q3.m87161k(AbstractC12252h.m34153c());
            C31444c c31444cM110600v4 = m110600v(interfaceC23462h);
            boolean zM87157i9 = c28655q3.m87157i(interfaceC23462h);
            if ((i17 & 896) != 256) {
                z15 = true;
            } else {
                z15 = true;
            }
            boolean z27 = zM87157i9 | z15;
            apiRequest4 = apiRequest3;
            if ((29360128 & i17) != 8388608) {
                z16 = true;
            } else {
                z16 = true;
            }
            zM87157i = z16 | z27 | c28655q3.m87157i(c6005m4);
            objM87133R4 = c28655q3.m87133R();
            if (zM87157i) {
                GenericInteraction genericInteraction8 = genericInteraction3;
                C6005m c6005m10 = c6005m4;
                objM87133R4 = new g(apiRequest4, genericInteraction8, c6005m10, interfaceC23462h, null);
                genericInteraction4 = genericInteraction8;
                c6005m5 = c6005m10;
                c28655q3.m87172p0(objM87133R4);
            } else {
                GenericInteraction genericInteraction9 = genericInteraction3;
                C6005m c6005m11 = c6005m4;
                objM87133R4 = new g(apiRequest4, genericInteraction9, c6005m11, interfaceC23462h, null);
                genericInteraction4 = genericInteraction9;
                c6005m5 = c6005m11;
                c28655q3.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R4, c31444cM110600v4);
            ReloadAction reloadActionM96823o2 = m110568D(interfaceC28601c1M87260n).getPendingReloadAction();
            zM87153g5 = c28655q3.m87153g(interfaceC28601c1M87260n) | c28655q3.m87157i(r28);
            Object objM87133R111 = c28655q3.m87133R();
            obj4 = objM87133R111;
            if (zM87153g5) {
                h hVar2 = new h(interfaceC28601c1M87260n, r28, null);
                c28655q3.m87172p0(hVar2);
                obj4 = hVar2;
            } else {
                h hVar3 = new h(interfaceC28601c1M87260n, r28, null);
                c28655q3.m87172p0(hVar3);
                obj4 = hVar3;
            }
            ReloadAction.Companion companion3 = ReloadAction.INSTANCE;
            AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) obj4, reloadActionM96823o2);
            C6011q c6011qM96822n2 = m110568D(interfaceC28601c1M87260n).getPendingPermissionRequest();
            zM87153g6 = c28655q3.m87153g(interfaceC28601c1M87260n) | c28655q3.m87157i(interfaceC4351m2) | c28655q3.m87157i(r28);
            Object objM87133R112 = c28655q3.m87133R();
            obj5 = objM87133R112;
            if (zM87153g6) {
                i iVar2 = new i(interfaceC4351m2, interfaceC28601c1M87260n, r28, null);
                c28655q3.m87172p0(iVar2);
                obj5 = iVar2;
            } else {
                i iVar3 = new i(interfaceC4351m2, interfaceC28601c1M87260n, r28, null);
                c28655q3.m87172p0(iVar3);
                obj5 = iVar3;
            }
            int i29 = GenericInteraction.$stable;
            AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) obj5, c6011qM96822n2);
            C6010p c6010pM96821m2 = m110568D(interfaceC28601c1M87260n).getPendingMediaPick();
            zM87157i2 = c28655q3.m87157i(r28);
            Object objM87133R113 = c28655q3.m87133R();
            obj6 = objM87133R113;
            if (zM87157i2) {
                C34238a c34238a2 = new C34238a(r28, 12);
                c28655q3.m87172p0(c34238a2);
                obj6 = c34238a2;
            } else {
                C34238a c34238a3 = new C34238a(r28, 12);
                c28655q3.m87172p0(c34238a3);
                obj6 = c34238a3;
            }
            InterfaceC4351m interfaceC4351m5 = (InterfaceC4351m) obj6;
            zM87157i3 = c28655q3.m87157i(r28);
            Object objM87133R114 = c28655q3.m87133R();
            i18 = 6;
            obj7 = objM87133R114;
            if (zM87157i3) {
                C26967q c26967q2 = new C26967q(r28, i18);
                c28655q3.m87172p0(c26967q2);
                obj7 = c26967q2;
            } else {
                C26967q c26967q3 = new C26967q(r28, i18);
                c28655q3.m87172p0(c26967q3);
                obj7 = c26967q3;
            }
            AbstractC35016r.m110638f(c6010pM96821m2, interfaceC4351m5, (Function1) obj7, null, c28655q3, i29, 8);
            c28655q2 = c28655q3;
            C31444c c31444cM110600v5 = m110600v(r28);
            zM87157i4 = c28655q2.m87157i(r28) | c28655q2.m87157i(navRouter);
            Object objM87133R115 = c28655q2.m87133R();
            obj8 = objM87133R115;
            if (zM87157i4) {
                j jVar2 = new j(r28, navRouter, null);
                c28655q2.m87172p0(jVar2);
                obj8 = jVar2;
            } else {
                j jVar3 = new j(r28, navRouter, null);
                c28655q2.m87172p0(jVar3);
                obj8 = jVar3;
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) obj8, c31444cM110600v5);
            InterfaceC31443b.a aVarM96812d2 = m110568D(interfaceC28601c1M87260n).getAnalyticEvent();
            zM87153g7 = c28655q2.m87153g(interfaceC28601c1M87260n) | c28655q2.m87157i(actionRouter);
            Object objM87133R116 = c28655q2.m87133R();
            obj9 = objM87133R116;
            if (zM87153g7) {
                k kVar2 = new k(interfaceC28601c1M87260n, actionRouter, null);
                c28655q2.m87172p0(kVar2);
                obj9 = kVar2;
            } else {
                k kVar3 = new k(interfaceC28601c1M87260n, actionRouter, null);
                c28655q2.m87172p0(kVar3);
                obj9 = kVar3;
            }
            AbstractC28683x.m87254h(actionRouter, aVarM96812d2, (InterfaceC4351m) obj9, c28655q2);
            Object[] objArr2 = new Object[0];
            objM87133R5 = c28655q2.m87133R();
            obj10 = objM87133R5;
            if (objM87133R5 == c28676v0) {
                C34656a c34656a2 = new C34656a(19);
                c28655q2.m87172p0(c34656a2);
                obj10 = c34656a2;
            }
            interfaceC28593a1 = (InterfaceC28593a1) AbstractC39038k.m124457c(objArr2, (InterfaceC4339a) obj10, c28655q2, 48);
            DecodedGenericInteraction decodedGenericInteractionM96820l2 = m110568D(interfaceC28601c1M87260n).getOnStartLifecycleInteraction();
            zM87153g8 = c28655q2.m87153g(interfaceC28601c1M87260n) | c28655q2.m87153g(interfaceC28593a1) | c28655q2.m87157i(r28) | c28655q2.m87157i(actionRouter) | c28655q2.m87157i(navRouter);
            Object objM87133R117 = c28655q2.m87133R();
            if (zM87153g8) {
                interfaceC28601c1 = interfaceC28601c1M87260n;
                z17 = false;
                lVar = new l(actionRouter, navRouter, interfaceC28601c1, interfaceC28593a1, r28, null);
                c28655q2.m87172p0(lVar);
            } else {
                interfaceC28601c1 = interfaceC28601c1M87260n;
                z17 = false;
                lVar = new l(actionRouter, navRouter, interfaceC28601c1, interfaceC28593a1, r28, null);
                c28655q2.m87172p0(lVar);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) lVar, decodedGenericInteractionM96820l2);
            if (m110568D(interfaceC28601c1).getModal() != null) {
                z18 = true;
            } else {
                z18 = z17;
            }
            Boolean boolValueOf3 = Boolean.valueOf(z18);
            anyModalM96816h = m110568D(interfaceC28601c1).getModal();
            if (anyModalM96816h != null) {
                strM110578N = m110578N(anyModalM96816h);
            } else {
                strM110578N = null;
            }
            ModalLifecycleInteraction modalLifecycleInteractionM96817i2 = m110568D(interfaceC28601c1).getModalLifecycleInteraction();
            zM87153g9 = c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87157i(r28) | c28655q2.m87157i(actionRouter) | c28655q2.m87157i(navRouter);
            Object objM87133R118 = c28655q2.m87133R();
            if (zM87153g9) {
                c cVar2 = new c(actionRouter, navRouter, interfaceC28601c1, r28, null);
                c28655q2.m87172p0(cVar2);
                obj11 = cVar2;
            } else {
                c cVar3 = new c(actionRouter, navRouter, interfaceC28601c1, r28, null);
                c28655q2.m87172p0(cVar3);
                obj11 = cVar3;
            }
            AbstractC28683x.m87255i(boolValueOf3, strM110578N, modalLifecycleInteractionM96817i2, (InterfaceC4351m) obj11, c28655q2);
            Boolean boolValueOf4 = Boolean.valueOf(m110568D(interfaceC28601c1).getNestedModal() == null ? z17 : true);
            anyModalM96818j = m110568D(interfaceC28601c1).getNestedModal();
            if (anyModalM96818j != null) {
                strM110578N2 = m110578N(anyModalM96818j);
            } else {
                strM110578N2 = null;
            }
            ModalLifecycleInteraction modalLifecycleInteractionM96819k2 = m110568D(interfaceC28601c1).getNestedModalLifecycleInteraction();
            zM87153g10 = c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87157i(r28) | c28655q2.m87157i(actionRouter) | c28655q2.m87157i(navRouter);
            objM87133R6 = c28655q2.m87133R();
            if (zM87153g10) {
                d dVar2 = new d(actionRouter, navRouter, interfaceC28601c1, r28, null);
                c28655q2.m87172p0(dVar2);
                objM87133R6 = dVar2;
            } else {
                d dVar3 = new d(actionRouter, navRouter, interfaceC28601c1, r28, null);
                c28655q2.m87172p0(dVar3);
                objM87133R6 = dVar3;
            }
            AbstractC28683x.m87255i(boolValueOf4, strM110578N2, modalLifecycleInteractionM96819k2, (InterfaceC4351m) objM87133R6, c28655q2);
            AnyModal anyModalM96816h3 = m110568D(interfaceC28601c1).getModal();
            AnyModal anyModalM96818j3 = m110568D(interfaceC28601c1).getNestedModal();
            zM87153g11 = c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87157i(interfaceC21030c) | c28655q2.m87157i(interfaceC14515a) | c28655q2.m87157i(interfaceC12251g) | c28655q2.m87157i(r28);
            objM87133R7 = c28655q2.m87133R();
            if (zM87153g11) {
                interfaceC14515a2 = interfaceC14515a;
                interfaceC21030c2 = interfaceC21030c;
                objM87133R7 = new e(interfaceC21030c2, interfaceC14515a2, interfaceC12251g, interfaceC28601c1, r28, null);
                c28655q2.m87172p0(objM87133R7);
            } else {
                interfaceC14515a2 = interfaceC14515a;
                interfaceC21030c2 = interfaceC21030c;
                objM87133R7 = new e(interfaceC21030c2, interfaceC14515a2, interfaceC12251g, interfaceC28601c1, r28, null);
                c28655q2.m87172p0(objM87133R7);
            }
            AnyModal.Companion companion4 = AnyModal.INSTANCE;
            AbstractC28683x.m87254h(anyModalM96816h3, anyModalM96818j3, (InterfaceC4351m) objM87133R7, c28655q2);
            C31444c c31444cM110600v6 = m110600v(r28);
            zM87157i5 = c28655q2.m87157i(r28);
            Object objM87133R119 = c28655q2.m87133R();
            obj12 = objM87133R119;
            if (zM87157i5) {
                f fVar2 = new f(r28, null);
                c28655q2.m87172p0(fVar2);
                obj12 = fVar2;
            } else {
                f fVar3 = new f(r28, null);
                c28655q2.m87172p0(fVar3);
                obj12 = fVar3;
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) obj12, c31444cM110600v6);
            AbstractC14874j.m42904c(m110568D(interfaceC28601c1), metricFeatureName, c28655q2, (i17 >> 6) & 112);
            AbstractC28683x.m87247a(AbstractC25303l.m74272C().mo86977a(c25307p2), AbstractC37817c.m121344e(-1841940333, c28655q2, new C1990b0(interfaceC21030c2, interfaceC14515a2, actionRouter, interfaceC23462h, navRouter, interfaceC28601c1, 10)), c28655q2, 56);
            apiRequest2 = apiRequest4;
            genericInteraction2 = genericInteraction4;
            c6005m3 = c6005m5;
            c28655q = c28655q2;
        } else {
            C28655q c28655q4 = c28655q3;
            c28655q4.m87138X();
            apiRequest2 = apiRequest;
            genericInteraction2 = genericInteraction;
            interfaceC4351m2 = interfaceC4351m;
            c6005m3 = c6005m2;
            c28655q = c28655q4;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3440f1(navRouter, actionRouter, apiRequest2, metricFeatureName, screenAnalytics, requestName, cachePolicy, genericInteraction2, c6005m3, interfaceC4351m2, i13, i14, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ff A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x0101  */
    /* JADX WARN: Code duplicated, block: B:81:0x0114  */
    /* JADX WARN: Code duplicated, block: B:84:0x011d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x011f  */
    /* JADX WARN: Code duplicated, block: B:87:0x015c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0169  */
    /* JADX WARN: Code duplicated, block: B:92:0x0176  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: o */
    public static final void m110593o(final C31446e viewState, InterfaceC21030c interfaceC21030c, InterfaceC14515a interfaceC14515a, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        final InterfaceC21030c interfaceC21030c2;
        int i16;
        InterfaceC14515a interfaceC14515a2;
        int i17;
        int i18;
        int i19;
        boolean z4;
        final Function1 function2;
        InterfaceC21030c interfaceC21030c3;
        InterfaceC14515a interfaceC14515a3;
        C28677v1 c28677v1M87180u;
        InterfaceC14515a interfaceC14515a4;
        C28676v0 c28676v0;
        Object objM87133R;
        InterfaceC21030c interfaceC21030c4;
        int i24;
        boolean z13;
        Object objM87133R2;
        boolean zM87157i;
        Object objM87133R3;
        Object objM87133R4;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1268339789);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i25 = i14 & 2;
        if (i25 == 0) {
            if ((i13 & 48) == 0) {
                interfaceC21030c2 = interfaceC21030c;
                i15 |= c28655q.m87157i(interfaceC21030c2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    interfaceC14515a2 = interfaceC14515a;
                    if (c28655q.m87157i(interfaceC14515a2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        if (c28655q.m87157i(function1)) {
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
                        if (i25 != 0) {
                            interfaceC21030c2 = null;
                        }
                        if (i16 != 0) {
                            interfaceC14515a4 = null;
                        } else {
                            interfaceC14515a4 = interfaceC14515a2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i18 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C34569c(26);
                                c28655q.m87172p0(objM87133R4);
                            }
                            function2 = (Function1) objM87133R4;
                        } else {
                            function2 = function1;
                        }
                        boolean zM96813e = viewState.getDisableBackNavigation();
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C34656a(20);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, zM96813e, c28655q, 48, 0);
                        if (viewState.getFullScreenModal() != null) {
                            c28655q.m87150e0(896188025);
                            AbstractC35009k.m110546m(viewState.getFullScreenModal(), function2, c28655q, (i15 >> 6) & 112);
                            c28655q.m87173q(false);
                            interfaceC21030c4 = interfaceC21030c2;
                        } else if (viewState.getTemplateContentState() != null) {
                            c28655q.m87150e0(2012178792);
                            AnyModal anyModalM96816h = viewState.getModal();
                            i24 = i15 & 7168;
                            if (i24 == 2048) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z13 || objM87133R2 == c28676v0) {
                                objM87133R2 = new C32451b(function2, 25);
                                c28655q.m87172p0(objM87133R2);
                            }
                            Function1 function3 = (Function1) objM87133R2;
                            zM87157i = c28655q.m87157i(viewState) | (i24 == 2048);
                            objM87133R3 = c28655q.m87133R();
                            if (zM87157i || objM87133R3 == c28676v0) {
                                objM87133R3 = new C32209f(29, viewState, function2);
                                c28655q.m87172p0(objM87133R3);
                            }
                            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R3;
                            C37816b c37816bM121344e = AbstractC37817c.m121344e(635311084, c28655q, new InterfaceC4354p() { // from class: ui0.m
                                @Override // c93.InterfaceC4354p
                                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                                    int iIntValue = ((Integer) obj6).intValue();
                                    return AbstractC35012n.m110566B(viewState, interfaceC21030c2, function2, (FullScreenContentModal) obj, (ModalAnalyticEventModel) obj2, (InterfaceC14515a) obj3, (Function1) obj4, (Composer) obj5, iIntValue);
                                }
                            });
                            int i26 = i15 << 3;
                            int i27 = 196608 | AnyModal.$stable | (i26 & 896) | (i26 & 7168);
                            interfaceC21030c4 = interfaceC21030c2;
                            AbstractC0564o.m1394P(anyModalM96816h, function3, interfaceC21030c4, interfaceC14515a4, interfaceC4339a, c37816bM121344e, c28655q, i27, 0);
                            AbstractC38320b.m122800b(viewState.getTemplateContentState(), function2, c28655q, (i15 >> 6) & 112);
                            c28655q.m87173q(false);
                        } else {
                            interfaceC21030c4 = interfaceC21030c2;
                            c28655q.m87150e0(2013298543);
                            c28655q.m87173q(false);
                        }
                        interfaceC21030c3 = interfaceC21030c4;
                        interfaceC14515a3 = interfaceC14515a4;
                    } else {
                        c28655q.m87138X();
                        function2 = function1;
                        interfaceC21030c3 = interfaceC21030c2;
                        interfaceC14515a3 = interfaceC14515a2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C32632k2(viewState, interfaceC21030c3, interfaceC14515a3, function2, i13, i14, 9);
                    }
                }
                i15 |= 3072;
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i25 != 0) {
                        interfaceC21030c2 = null;
                    }
                    if (i16 != 0) {
                        interfaceC14515a4 = null;
                    } else {
                        interfaceC14515a4 = interfaceC14515a2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C34569c(26);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function2 = (Function1) objM87133R4;
                    } else {
                        function2 = function1;
                    }
                    boolean zM96813e2 = viewState.getDisableBackNavigation();
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C34656a(20);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, zM96813e2, c28655q, 48, 0);
                    if (viewState.getFullScreenModal() != null) {
                        c28655q.m87150e0(896188025);
                        AbstractC35009k.m110546m(viewState.getFullScreenModal(), function2, c28655q, (i15 >> 6) & 112);
                        c28655q.m87173q(false);
                        interfaceC21030c4 = interfaceC21030c2;
                    } else if (viewState.getTemplateContentState() != null) {
                        c28655q.m87150e0(2012178792);
                        AnyModal anyModalM96816h2 = viewState.getModal();
                        i24 = i15 & 7168;
                        if (i24 == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z13) {
                            objM87133R2 = new C32451b(function2, 25);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C32451b(function2, 25);
                            c28655q.m87172p0(objM87133R2);
                        }
                        Function1 function4 = (Function1) objM87133R2;
                        zM87157i = c28655q.m87157i(viewState) | (i24 == 2048);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R3 = new C32209f(29, viewState, function2);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C32209f(29, viewState, function2);
                            c28655q.m87172p0(objM87133R3);
                        }
                        InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                        C37816b c37816bM121344e2 = AbstractC37817c.m121344e(635311084, c28655q, new InterfaceC4354p() { // from class: ui0.m
                            @Override // c93.InterfaceC4354p
                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                                int iIntValue = ((Integer) obj6).intValue();
                                return AbstractC35012n.m110566B(viewState, interfaceC21030c2, function2, (FullScreenContentModal) obj, (ModalAnalyticEventModel) obj2, (InterfaceC14515a) obj3, (Function1) obj4, (Composer) obj5, iIntValue);
                            }
                        });
                        int i28 = i15 << 3;
                        int i29 = 196608 | AnyModal.$stable | (i28 & 896) | (i28 & 7168);
                        interfaceC21030c4 = interfaceC21030c2;
                        AbstractC0564o.m1394P(anyModalM96816h2, function4, interfaceC21030c4, interfaceC14515a4, interfaceC4339a2, c37816bM121344e2, c28655q, i29, 0);
                        AbstractC38320b.m122800b(viewState.getTemplateContentState(), function2, c28655q, (i15 >> 6) & 112);
                        c28655q.m87173q(false);
                    } else {
                        interfaceC21030c4 = interfaceC21030c2;
                        c28655q.m87150e0(2013298543);
                        c28655q.m87173q(false);
                    }
                    interfaceC21030c3 = interfaceC21030c4;
                    interfaceC14515a3 = interfaceC14515a4;
                } else {
                    c28655q.m87138X();
                    function2 = function1;
                    interfaceC21030c3 = interfaceC21030c2;
                    interfaceC14515a3 = interfaceC14515a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32632k2(viewState, interfaceC21030c3, interfaceC14515a3, function2, i13, i14, 9);
                }
            }
            i15 |= 384;
            interfaceC14515a2 = interfaceC14515a;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    if (c28655q.m87157i(function1)) {
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
                    if (i25 != 0) {
                        interfaceC21030c2 = null;
                    }
                    if (i16 != 0) {
                        interfaceC14515a4 = null;
                    } else {
                        interfaceC14515a4 = interfaceC14515a2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C34569c(26);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function2 = (Function1) objM87133R4;
                    } else {
                        function2 = function1;
                    }
                    boolean zM96813e3 = viewState.getDisableBackNavigation();
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C34656a(20);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, zM96813e3, c28655q, 48, 0);
                    if (viewState.getFullScreenModal() != null) {
                        c28655q.m87150e0(896188025);
                        AbstractC35009k.m110546m(viewState.getFullScreenModal(), function2, c28655q, (i15 >> 6) & 112);
                        c28655q.m87173q(false);
                        interfaceC21030c4 = interfaceC21030c2;
                    } else if (viewState.getTemplateContentState() != null) {
                        c28655q.m87150e0(2012178792);
                        AnyModal anyModalM96816h3 = viewState.getModal();
                        i24 = i15 & 7168;
                        if (i24 == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z13) {
                            objM87133R2 = new C32451b(function2, 25);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C32451b(function2, 25);
                            c28655q.m87172p0(objM87133R2);
                        }
                        Function1 function5 = (Function1) objM87133R2;
                        zM87157i = c28655q.m87157i(viewState) | (i24 == 2048);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R3 = new C32209f(29, viewState, function2);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C32209f(29, viewState, function2);
                            c28655q.m87172p0(objM87133R3);
                        }
                        InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R3;
                        C37816b c37816bM121344e3 = AbstractC37817c.m121344e(635311084, c28655q, new InterfaceC4354p() { // from class: ui0.m
                            @Override // c93.InterfaceC4354p
                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                                int iIntValue = ((Integer) obj6).intValue();
                                return AbstractC35012n.m110566B(viewState, interfaceC21030c2, function2, (FullScreenContentModal) obj, (ModalAnalyticEventModel) obj2, (InterfaceC14515a) obj3, (Function1) obj4, (Composer) obj5, iIntValue);
                            }
                        });
                        int i210 = i15 << 3;
                        int i211 = 196608 | AnyModal.$stable | (i210 & 896) | (i210 & 7168);
                        interfaceC21030c4 = interfaceC21030c2;
                        AbstractC0564o.m1394P(anyModalM96816h3, function5, interfaceC21030c4, interfaceC14515a4, interfaceC4339a3, c37816bM121344e3, c28655q, i211, 0);
                        AbstractC38320b.m122800b(viewState.getTemplateContentState(), function2, c28655q, (i15 >> 6) & 112);
                        c28655q.m87173q(false);
                    } else {
                        interfaceC21030c4 = interfaceC21030c2;
                        c28655q.m87150e0(2013298543);
                        c28655q.m87173q(false);
                    }
                    interfaceC21030c3 = interfaceC21030c4;
                    interfaceC14515a3 = interfaceC14515a4;
                } else {
                    c28655q.m87138X();
                    function2 = function1;
                    interfaceC21030c3 = interfaceC21030c2;
                    interfaceC14515a3 = interfaceC14515a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32632k2(viewState, interfaceC21030c3, interfaceC14515a3, function2, i13, i14, 9);
                }
            }
            i15 |= 3072;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i25 != 0) {
                    interfaceC21030c2 = null;
                }
                if (i16 != 0) {
                    interfaceC14515a4 = null;
                } else {
                    interfaceC14515a4 = interfaceC14515a2;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C34569c(26);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function2 = (Function1) objM87133R4;
                } else {
                    function2 = function1;
                }
                boolean zM96813e4 = viewState.getDisableBackNavigation();
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C34656a(20);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, zM96813e4, c28655q, 48, 0);
                if (viewState.getFullScreenModal() != null) {
                    c28655q.m87150e0(896188025);
                    AbstractC35009k.m110546m(viewState.getFullScreenModal(), function2, c28655q, (i15 >> 6) & 112);
                    c28655q.m87173q(false);
                    interfaceC21030c4 = interfaceC21030c2;
                } else if (viewState.getTemplateContentState() != null) {
                    c28655q.m87150e0(2012178792);
                    AnyModal anyModalM96816h4 = viewState.getModal();
                    i24 = i15 & 7168;
                    if (i24 == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z13) {
                        objM87133R2 = new C32451b(function2, 25);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C32451b(function2, 25);
                        c28655q.m87172p0(objM87133R2);
                    }
                    Function1 function6 = (Function1) objM87133R2;
                    zM87157i = c28655q.m87157i(viewState) | (i24 == 2048);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R3 = new C32209f(29, viewState, function2);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C32209f(29, viewState, function2);
                        c28655q.m87172p0(objM87133R3);
                    }
                    InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                    C37816b c37816bM121344e4 = AbstractC37817c.m121344e(635311084, c28655q, new InterfaceC4354p() { // from class: ui0.m
                        @Override // c93.InterfaceC4354p
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                            int iIntValue = ((Integer) obj6).intValue();
                            return AbstractC35012n.m110566B(viewState, interfaceC21030c2, function2, (FullScreenContentModal) obj, (ModalAnalyticEventModel) obj2, (InterfaceC14515a) obj3, (Function1) obj4, (Composer) obj5, iIntValue);
                        }
                    });
                    int i212 = i15 << 3;
                    int i213 = 196608 | AnyModal.$stable | (i212 & 896) | (i212 & 7168);
                    interfaceC21030c4 = interfaceC21030c2;
                    AbstractC0564o.m1394P(anyModalM96816h4, function6, interfaceC21030c4, interfaceC14515a4, interfaceC4339a4, c37816bM121344e4, c28655q, i213, 0);
                    AbstractC38320b.m122800b(viewState.getTemplateContentState(), function2, c28655q, (i15 >> 6) & 112);
                    c28655q.m87173q(false);
                } else {
                    interfaceC21030c4 = interfaceC21030c2;
                    c28655q.m87150e0(2013298543);
                    c28655q.m87173q(false);
                }
                interfaceC21030c3 = interfaceC21030c4;
                interfaceC14515a3 = interfaceC14515a4;
            } else {
                c28655q.m87138X();
                function2 = function1;
                interfaceC21030c3 = interfaceC21030c2;
                interfaceC14515a3 = interfaceC14515a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(viewState, interfaceC21030c3, interfaceC14515a3, function2, i13, i14, 9);
            }
        }
        i15 |= 48;
        interfaceC21030c2 = interfaceC21030c;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                interfaceC14515a2 = interfaceC14515a;
                if (c28655q.m87157i(interfaceC14515a2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    if (c28655q.m87157i(function1)) {
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
                    if (i25 != 0) {
                        interfaceC21030c2 = null;
                    }
                    if (i16 != 0) {
                        interfaceC14515a4 = null;
                    } else {
                        interfaceC14515a4 = interfaceC14515a2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C34569c(26);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function2 = (Function1) objM87133R4;
                    } else {
                        function2 = function1;
                    }
                    boolean zM96813e5 = viewState.getDisableBackNavigation();
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C34656a(20);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, zM96813e5, c28655q, 48, 0);
                    if (viewState.getFullScreenModal() != null) {
                        c28655q.m87150e0(896188025);
                        AbstractC35009k.m110546m(viewState.getFullScreenModal(), function2, c28655q, (i15 >> 6) & 112);
                        c28655q.m87173q(false);
                        interfaceC21030c4 = interfaceC21030c2;
                    } else if (viewState.getTemplateContentState() != null) {
                        c28655q.m87150e0(2012178792);
                        AnyModal anyModalM96816h5 = viewState.getModal();
                        i24 = i15 & 7168;
                        if (i24 == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z13) {
                            objM87133R2 = new C32451b(function2, 25);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C32451b(function2, 25);
                            c28655q.m87172p0(objM87133R2);
                        }
                        Function1 function7 = (Function1) objM87133R2;
                        zM87157i = c28655q.m87157i(viewState) | (i24 == 2048);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R3 = new C32209f(29, viewState, function2);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C32209f(29, viewState, function2);
                            c28655q.m87172p0(objM87133R3);
                        }
                        InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R3;
                        C37816b c37816bM121344e5 = AbstractC37817c.m121344e(635311084, c28655q, new InterfaceC4354p() { // from class: ui0.m
                            @Override // c93.InterfaceC4354p
                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                                int iIntValue = ((Integer) obj6).intValue();
                                return AbstractC35012n.m110566B(viewState, interfaceC21030c2, function2, (FullScreenContentModal) obj, (ModalAnalyticEventModel) obj2, (InterfaceC14515a) obj3, (Function1) obj4, (Composer) obj5, iIntValue);
                            }
                        });
                        int i214 = i15 << 3;
                        int i215 = 196608 | AnyModal.$stable | (i214 & 896) | (i214 & 7168);
                        interfaceC21030c4 = interfaceC21030c2;
                        AbstractC0564o.m1394P(anyModalM96816h5, function7, interfaceC21030c4, interfaceC14515a4, interfaceC4339a5, c37816bM121344e5, c28655q, i215, 0);
                        AbstractC38320b.m122800b(viewState.getTemplateContentState(), function2, c28655q, (i15 >> 6) & 112);
                        c28655q.m87173q(false);
                    } else {
                        interfaceC21030c4 = interfaceC21030c2;
                        c28655q.m87150e0(2013298543);
                        c28655q.m87173q(false);
                    }
                    interfaceC21030c3 = interfaceC21030c4;
                    interfaceC14515a3 = interfaceC14515a4;
                } else {
                    c28655q.m87138X();
                    function2 = function1;
                    interfaceC21030c3 = interfaceC21030c2;
                    interfaceC14515a3 = interfaceC14515a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32632k2(viewState, interfaceC21030c3, interfaceC14515a3, function2, i13, i14, 9);
                }
            }
            i15 |= 3072;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i25 != 0) {
                    interfaceC21030c2 = null;
                }
                if (i16 != 0) {
                    interfaceC14515a4 = null;
                } else {
                    interfaceC14515a4 = interfaceC14515a2;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C34569c(26);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function2 = (Function1) objM87133R4;
                } else {
                    function2 = function1;
                }
                boolean zM96813e6 = viewState.getDisableBackNavigation();
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C34656a(20);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, zM96813e6, c28655q, 48, 0);
                if (viewState.getFullScreenModal() != null) {
                    c28655q.m87150e0(896188025);
                    AbstractC35009k.m110546m(viewState.getFullScreenModal(), function2, c28655q, (i15 >> 6) & 112);
                    c28655q.m87173q(false);
                    interfaceC21030c4 = interfaceC21030c2;
                } else if (viewState.getTemplateContentState() != null) {
                    c28655q.m87150e0(2012178792);
                    AnyModal anyModalM96816h6 = viewState.getModal();
                    i24 = i15 & 7168;
                    if (i24 == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z13) {
                        objM87133R2 = new C32451b(function2, 25);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C32451b(function2, 25);
                        c28655q.m87172p0(objM87133R2);
                    }
                    Function1 function8 = (Function1) objM87133R2;
                    zM87157i = c28655q.m87157i(viewState) | (i24 == 2048);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R3 = new C32209f(29, viewState, function2);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C32209f(29, viewState, function2);
                        c28655q.m87172p0(objM87133R3);
                    }
                    InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R3;
                    C37816b c37816bM121344e6 = AbstractC37817c.m121344e(635311084, c28655q, new InterfaceC4354p() { // from class: ui0.m
                        @Override // c93.InterfaceC4354p
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                            int iIntValue = ((Integer) obj6).intValue();
                            return AbstractC35012n.m110566B(viewState, interfaceC21030c2, function2, (FullScreenContentModal) obj, (ModalAnalyticEventModel) obj2, (InterfaceC14515a) obj3, (Function1) obj4, (Composer) obj5, iIntValue);
                        }
                    });
                    int i216 = i15 << 3;
                    int i217 = 196608 | AnyModal.$stable | (i216 & 896) | (i216 & 7168);
                    interfaceC21030c4 = interfaceC21030c2;
                    AbstractC0564o.m1394P(anyModalM96816h6, function8, interfaceC21030c4, interfaceC14515a4, interfaceC4339a6, c37816bM121344e6, c28655q, i217, 0);
                    AbstractC38320b.m122800b(viewState.getTemplateContentState(), function2, c28655q, (i15 >> 6) & 112);
                    c28655q.m87173q(false);
                } else {
                    interfaceC21030c4 = interfaceC21030c2;
                    c28655q.m87150e0(2013298543);
                    c28655q.m87173q(false);
                }
                interfaceC21030c3 = interfaceC21030c4;
                interfaceC14515a3 = interfaceC14515a4;
            } else {
                c28655q.m87138X();
                function2 = function1;
                interfaceC21030c3 = interfaceC21030c2;
                interfaceC14515a3 = interfaceC14515a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(viewState, interfaceC21030c3, interfaceC14515a3, function2, i13, i14, 9);
            }
        }
        i15 |= 384;
        interfaceC14515a2 = interfaceC14515a;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(function1)) {
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
                if (i25 != 0) {
                    interfaceC21030c2 = null;
                }
                if (i16 != 0) {
                    interfaceC14515a4 = null;
                } else {
                    interfaceC14515a4 = interfaceC14515a2;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C34569c(26);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function2 = (Function1) objM87133R4;
                } else {
                    function2 = function1;
                }
                boolean zM96813e7 = viewState.getDisableBackNavigation();
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C34656a(20);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, zM96813e7, c28655q, 48, 0);
                if (viewState.getFullScreenModal() != null) {
                    c28655q.m87150e0(896188025);
                    AbstractC35009k.m110546m(viewState.getFullScreenModal(), function2, c28655q, (i15 >> 6) & 112);
                    c28655q.m87173q(false);
                    interfaceC21030c4 = interfaceC21030c2;
                } else if (viewState.getTemplateContentState() != null) {
                    c28655q.m87150e0(2012178792);
                    AnyModal anyModalM96816h7 = viewState.getModal();
                    i24 = i15 & 7168;
                    if (i24 == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z13) {
                        objM87133R2 = new C32451b(function2, 25);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C32451b(function2, 25);
                        c28655q.m87172p0(objM87133R2);
                    }
                    Function1 function9 = (Function1) objM87133R2;
                    zM87157i = c28655q.m87157i(viewState) | (i24 == 2048);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R3 = new C32209f(29, viewState, function2);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C32209f(29, viewState, function2);
                        c28655q.m87172p0(objM87133R3);
                    }
                    InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R3;
                    C37816b c37816bM121344e7 = AbstractC37817c.m121344e(635311084, c28655q, new InterfaceC4354p() { // from class: ui0.m
                        @Override // c93.InterfaceC4354p
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                            int iIntValue = ((Integer) obj6).intValue();
                            return AbstractC35012n.m110566B(viewState, interfaceC21030c2, function2, (FullScreenContentModal) obj, (ModalAnalyticEventModel) obj2, (InterfaceC14515a) obj3, (Function1) obj4, (Composer) obj5, iIntValue);
                        }
                    });
                    int i218 = i15 << 3;
                    int i219 = 196608 | AnyModal.$stable | (i218 & 896) | (i218 & 7168);
                    interfaceC21030c4 = interfaceC21030c2;
                    AbstractC0564o.m1394P(anyModalM96816h7, function9, interfaceC21030c4, interfaceC14515a4, interfaceC4339a7, c37816bM121344e7, c28655q, i219, 0);
                    AbstractC38320b.m122800b(viewState.getTemplateContentState(), function2, c28655q, (i15 >> 6) & 112);
                    c28655q.m87173q(false);
                } else {
                    interfaceC21030c4 = interfaceC21030c2;
                    c28655q.m87150e0(2013298543);
                    c28655q.m87173q(false);
                }
                interfaceC21030c3 = interfaceC21030c4;
                interfaceC14515a3 = interfaceC14515a4;
            } else {
                c28655q.m87138X();
                function2 = function1;
                interfaceC21030c3 = interfaceC21030c2;
                interfaceC14515a3 = interfaceC14515a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(viewState, interfaceC21030c3, interfaceC14515a3, function2, i13, i14, 9);
            }
        }
        i15 |= 3072;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i25 != 0) {
                interfaceC21030c2 = null;
            }
            if (i16 != 0) {
                interfaceC14515a4 = null;
            } else {
                interfaceC14515a4 = interfaceC14515a2;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C34569c(26);
                    c28655q.m87172p0(objM87133R4);
                }
                function2 = (Function1) objM87133R4;
            } else {
                function2 = function1;
            }
            boolean zM96813e8 = viewState.getDisableBackNavigation();
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = new C34656a(20);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, zM96813e8, c28655q, 48, 0);
            if (viewState.getFullScreenModal() != null) {
                c28655q.m87150e0(896188025);
                AbstractC35009k.m110546m(viewState.getFullScreenModal(), function2, c28655q, (i15 >> 6) & 112);
                c28655q.m87173q(false);
                interfaceC21030c4 = interfaceC21030c2;
            } else if (viewState.getTemplateContentState() != null) {
                c28655q.m87150e0(2012178792);
                AnyModal anyModalM96816h8 = viewState.getModal();
                i24 = i15 & 7168;
                if (i24 == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z13) {
                    objM87133R2 = new C32451b(function2, 25);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C32451b(function2, 25);
                    c28655q.m87172p0(objM87133R2);
                }
                Function1 function10 = (Function1) objM87133R2;
                zM87157i = c28655q.m87157i(viewState) | (i24 == 2048);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R3 = new C32209f(29, viewState, function2);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C32209f(29, viewState, function2);
                    c28655q.m87172p0(objM87133R3);
                }
                InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R3;
                C37816b c37816bM121344e8 = AbstractC37817c.m121344e(635311084, c28655q, new InterfaceC4354p() { // from class: ui0.m
                    @Override // c93.InterfaceC4354p
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                        int iIntValue = ((Integer) obj6).intValue();
                        return AbstractC35012n.m110566B(viewState, interfaceC21030c2, function2, (FullScreenContentModal) obj, (ModalAnalyticEventModel) obj2, (InterfaceC14515a) obj3, (Function1) obj4, (Composer) obj5, iIntValue);
                    }
                });
                int i2110 = i15 << 3;
                int i2111 = 196608 | AnyModal.$stable | (i2110 & 896) | (i2110 & 7168);
                interfaceC21030c4 = interfaceC21030c2;
                AbstractC0564o.m1394P(anyModalM96816h8, function10, interfaceC21030c4, interfaceC14515a4, interfaceC4339a8, c37816bM121344e8, c28655q, i2111, 0);
                AbstractC38320b.m122800b(viewState.getTemplateContentState(), function2, c28655q, (i15 >> 6) & 112);
                c28655q.m87173q(false);
            } else {
                interfaceC21030c4 = interfaceC21030c2;
                c28655q.m87150e0(2013298543);
                c28655q.m87173q(false);
            }
            interfaceC21030c3 = interfaceC21030c4;
            interfaceC14515a3 = interfaceC14515a4;
        } else {
            c28655q.m87138X();
            function2 = function1;
            interfaceC21030c3 = interfaceC21030c2;
            interfaceC14515a3 = interfaceC14515a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32632k2(viewState, interfaceC21030c3, interfaceC14515a3, function2, i13, i14, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C34911a m110594p(ScreenAnalyticEventModel screenAnalyticEventModel, String str, CachePolicyModel cachePolicyModel) {
        return AbstractC15751g.m44431K(screenAnalyticEventModel, str, cachePolicyModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final InterfaceC28593a1 m110595q() {
        return new C28621h1(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final int m110596r(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final void m110597s(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m110598t(InterfaceC21030c interfaceC21030c, InterfaceC14515a interfaceC14515a, C30406a c30406a, InterfaceC23462h interfaceC23462h, C30409d c30409d, InterfaceC28670t2 interfaceC28670t2, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C31446e c31446eM110568D = m110568D(interfaceC28670t2);
            boolean zM87157i = c28655q.m87157i(c30406a) | c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(c30409d);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C32290f(c30406a, c30409d, interfaceC23462h, 18);
                c28655q.m87172p0(objM87133R);
            }
            m110593o(c31446eM110568D, interfaceC21030c, interfaceC14515a, (Function1) objM87133R, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m110599u(C30406a c30406a, C30409d c30409d, InterfaceC23462h interfaceC23462h, InterfaceC31443b event) {
        AbstractC22676k.m65750j(event, "event");
        InterfaceC31443b interfaceC31443bM92912i = c30406a.m92912i(event);
        if (interfaceC31443bM92912i instanceof InterfaceC31443b.w) {
            m110600v(interfaceC23462h).m96808r((InterfaceC31443b.w) interfaceC31443bM92912i);
        } else if (interfaceC31443bM92912i instanceof InterfaceC31443b.n) {
            c30409d.m92936c((InterfaceC31443b.n) interfaceC31443bM92912i);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C31444c m110600v(InterfaceC23462h interfaceC23462h) {
        return (C31444c) interfaceC23462h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m110601w(C30409d c30409d, C30406a c30406a, ApiRequest apiRequest, String str, ScreenAnalyticEventModel screenAnalyticEventModel, String str2, CachePolicyModel cachePolicyModel, GenericInteraction genericInteraction, C6005m c6005m, InterfaceC4351m interfaceC4351m, int i13, int i14, Composer composer, int i15) {
        m110592n(c30409d, c30406a, apiRequest, str, screenAnalyticEventModel, str2, cachePolicyModel, genericInteraction, c6005m, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m110602x(InterfaceC31443b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m110603y() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m110604z(Function1 function1, InterfaceC0569t modalEvent) {
        AbstractC22676k.m65750j(modalEvent, "modalEvent");
        function1.invoke(AbstractC35017s.m110650a(modalEvent));
        return C23454a0.f92919a;
    }
}
