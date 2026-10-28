package sy2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.activity.result.contract.ActivityResultContracts$GetContent;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.viewinterop.AbstractC1137a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bc3.AbstractC3028k2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import com.whoop.whooplabs.data.domain.SurveyProvider;
import com.whoop.whooplabs.feature.navigation.AbstractC10840c;
import d30.C11547l0;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import gb1.AbstractC15673b0;
import gy0.AbstractC16276e;
import id2.C18434s;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.QueryParams;
import kz2.AbstractC22926c;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import nw0.C27198e;
import ny2.AbstractC27299a;
import nz2.AbstractC27310d;
import nz2.C27309c;
import nz2.C27311e;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p179h.C16351i;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p733ry2.AbstractC31917f;
import p733ry2.C31919h;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import ty2.AbstractC34268a;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import yw2.C39832d;

/* JADX INFO: renamed from: sy2.t */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001ac\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0016\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lty2/a$a$i;", "viewState", "Lkotlin/Function1;", "Lny2/a;", "Ll83/a0;", "onViewEvent", "Lcom/whoop/whooplabs/feature/navigation/c;", "onNavEvent", "", "shouldShowWebView", "p", "(Lty2/a$a$i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "", QueryParams.URL, "Lcom/whoop/whooplabs/data/domain/SurveyProvider;", "surveyProvider", "isPageLoaded", "onPageLoaded", "t", "(Ljava/lang/String;Lcom/whoop/whooplabs/data/domain/SurveyProvider;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "isErrorLoading", "G", "(Landroidx/compose/ui/Modifier;ZZ)Landroidx/compose/ui/Modifier;", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33117t {

    /* JADX INFO: renamed from: sy2.t$a */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.view.screens.TypeformStepScreenKt$CampaignStepTypeform$2$1", m100430f = "TypeformStepScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f138127w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f138128x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC34268a.a.i f138129y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, AbstractC34268a.a.i iVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f138128x = function1;
            this.f138129y = iVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f138128x, this.f138129y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f138127w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f138128x.invoke(new AbstractC27299a.w(this.f138129y.getSurveyProvider()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sy2.t$b */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.view.screens.TypeformStepScreenKt$TypeFormWebView$1$1", m100430f = "TypeformStepScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f138130w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f138131x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f138132y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC28601c1 interfaceC28601c1, boolean z4, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f138131x = interfaceC28601c1;
            this.f138132y = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f138131x, this.f138132y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f138130w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f138131x.setValue(Boolean.valueOf(this.f138132y));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sy2.t$c */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.view.screens.TypeformStepScreenKt$TypeFormWebView$2$1", m100430f = "TypeformStepScreen.kt", m100431l = {143}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f138133E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f138134F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ Function1 f138135G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ String f138136H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ SurveyProvider f138137I;

        /* JADX INFO: renamed from: w */
        int f138138w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f138139x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f138140y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f138141z;

        /* JADX INFO: renamed from: sy2.t$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.view.screens.TypeformStepScreenKt$TypeFormWebView$2$1$1", m100430f = "TypeformStepScreen.kt", m100431l = {147}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f138142w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC28601c1 f138143x;

            /* JADX INFO: renamed from: sy2.t$c$a$a, reason: collision with other inner class name */
            @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42357a implements InterfaceC13058l {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13058l f138144w;

                /* JADX INFO: renamed from: sy2.t$c$a$a$a, reason: collision with other inner class name */
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C42358a<T> implements InterfaceC13062m {

                    /* JADX INFO: renamed from: w */
                    final /* synthetic */ InterfaceC13062m f138145w;

                    /* JADX INFO: renamed from: sy2.t$c$a$a$a$a, reason: collision with other inner class name */
                    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.view.screens.TypeformStepScreenKt$TypeFormWebView$2$1$1$invokeSuspend$$inlined$filter$1$2", m100430f = "TypeformStepScreen.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                    public static final class C42359a extends AbstractC32269c {

                        /* JADX INFO: renamed from: F */
                        Object f138147F;

                        /* JADX INFO: renamed from: G */
                        Object f138148G;

                        /* JADX INFO: renamed from: H */
                        int f138149H;

                        /* JADX INFO: renamed from: w */
                        /* synthetic */ Object f138150w;

                        /* JADX INFO: renamed from: x */
                        int f138151x;

                        /* JADX INFO: renamed from: y */
                        Object f138152y;

                        /* JADX INFO: renamed from: z */
                        Object f138153z;

                        public C42359a(InterfaceC30057d interfaceC30057d) {
                            super(interfaceC30057d);
                        }

                        @Override // s83.AbstractC32267a
                        public final Object invokeSuspend(Object obj) {
                            this.f138150w = obj;
                            this.f138151x |= Integer.MIN_VALUE;
                            return C42358a.this.emit(null, this);
                        }
                    }

                    public C42358a(InterfaceC13062m interfaceC13062m) {
                        this.f138145w = interfaceC13062m;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // ec3.InterfaceC13062m
                    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                        C42359a c42359a;
                        if (interfaceC30057d instanceof C42359a) {
                            c42359a = (C42359a) interfaceC30057d;
                            int i13 = c42359a.f138151x;
                            if ((i13 & Integer.MIN_VALUE) != 0) {
                                c42359a.f138151x = i13 - Integer.MIN_VALUE;
                            } else {
                                c42359a = new C42359a(interfaceC30057d);
                            }
                        } else {
                            c42359a = new C42359a(interfaceC30057d);
                        }
                        Object obj2 = c42359a.f138150w;
                        EnumC31071a enumC31071a = EnumC31071a.f128113w;
                        int i14 = c42359a.f138151x;
                        if (i14 == 0) {
                            AbstractC34132o.m107864I(obj2);
                            InterfaceC13062m interfaceC13062m = this.f138145w;
                            if (((Boolean) obj).booleanValue()) {
                                c42359a.f138152y = null;
                                c42359a.f138153z = null;
                                c42359a.f138147F = null;
                                c42359a.f138148G = null;
                                c42359a.f138149H = 0;
                                c42359a.f138151x = 1;
                                if (interfaceC13062m.emit(obj, c42359a) == enumC31071a) {
                                    return enumC31071a;
                                }
                            }
                        } else {
                            if (i14 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC34132o.m107864I(obj2);
                        }
                        return C23454a0.f92919a;
                    }
                }

                public C42357a(InterfaceC13058l interfaceC13058l) {
                    this.f138144w = interfaceC13058l;
                }

                @Override // ec3.InterfaceC13058l
                public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                    Object objCollect = this.f138144w.collect(new C42358a(interfaceC13062m), interfaceC30057d);
                    return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f138143x = interfaceC28601c1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: h */
            public static final boolean m105014h(InterfaceC28601c1 interfaceC28601c1) {
                return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f138143x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f138142w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                C42357a c42357a = new C42357a(AbstractC28683x.m87240H(new C33118u(0, this.f138143x)));
                this.f138142w = 1;
                Object objM36575A = AbstractC13091v.m36575A(c42357a, this);
                return objM36575A == enumC31071a ? enumC31071a : objM36575A;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC28601c1 interfaceC28601c1, Function1 function1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, Function1 function2, String str, SurveyProvider surveyProvider, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f138140y = interfaceC28601c1;
            this.f138141z = function1;
            this.f138133E = interfaceC28601c2;
            this.f138134F = interfaceC28601c3;
            this.f138135G = function2;
            this.f138136H = str;
            this.f138137I = surveyProvider;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f138140y, this.f138141z, this.f138133E, this.f138134F, this.f138135G, this.f138136H, this.f138137I, interfaceC30057d);
            cVar.f138139x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f138139x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f138138w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC28601c1 interfaceC28601c1 = this.f138140y;
                Boolean bool = Boolean.FALSE;
                interfaceC28601c1.setValue(bool);
                this.f138141z.invoke(bool);
                this.f138133E.setValue(bool);
                this.f138134F.setValue(bool);
                a aVar = new a(this.f138140y, null);
                this.f138139x = interfaceC2994c0;
                this.f138138w = 1;
                obj = AbstractC3028k2.m8750d(ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, aVar, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            if (((Boolean) obj) == null) {
                InterfaceC28601c1 interfaceC28601c2 = this.f138133E;
                InterfaceC28601c1 interfaceC28601c3 = this.f138140y;
                Function1 function1 = this.f138135G;
                String str = this.f138136H;
                InterfaceC28601c1 interfaceC28601c4 = this.f138134F;
                SurveyProvider surveyProvider = this.f138137I;
                if (!((Boolean) interfaceC28601c2.getValue()).booleanValue() && !((Boolean) interfaceC28601c3.getValue()).booleanValue()) {
                    function1.invoke(new AbstractC27299a.l(AbstractC11895b.m31996o("(", str, "): timeout"), ((Boolean) interfaceC28601c4.getValue()).booleanValue(), surveyProvider));
                }
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m104980A(Function1 function1, String it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC27299a.n(it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m104981B(InterfaceC28601c1 interfaceC28601c1, ValueCallback valueCallback) {
        interfaceC28601c1.setValue(valueCallback);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m104982C(C16351i c16351i) {
        c16351i.mo4052a("*/*", null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m104983D(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, String str, Function1 function1, SurveyProvider surveyProvider, WebView webView) {
        AbstractC22676k.m65750j(webView, "webView");
        boolean zBooleanValue = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zBooleanValue) {
            webView.clearHistory();
            webView.clearCache(true);
            interfaceC28601c2.setValue(Boolean.FALSE);
            webView.removeJavascriptInterface("JSBridge");
            webView.addJavascriptInterface(new C39832d(new C27198e((Object) interfaceC28601c2, (Object) interfaceC28601c1, function1, (Object) surveyProvider, 17)), "JSBridge");
            if (!AbstractC22676k.m65745e(webView.getUrl(), str)) {
                webView.loadUrl(str);
            }
        }
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m104984E(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, Function1 function1, SurveyProvider surveyProvider) {
        interfaceC28601c1.setValue(Boolean.TRUE);
        interfaceC28601c2.setValue(Boolean.FALSE);
        function1.invoke(new AbstractC27299a.b0(surveyProvider));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m104985F(String str, SurveyProvider surveyProvider, boolean z4, Function1 function1, Function1 function2, Function1 function3, int i13, Composer composer, int i14) {
        m105006t(str, surveyProvider, z4, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G */
    private static final Modifier m104986G(Modifier modifier, boolean z4, boolean z13) {
        C2314t c2314t = C2314t.f9131w;
        return modifier.mo3471e((!z4 || z13) ? AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)) : AbstractC34132o.m107879c(0.0f, AbstractC1102d.m3419p(1, c2314t)));
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0246  */
    /* JADX WARN: Code duplicated, block: B:107:0x0276  */
    /* JADX WARN: Code duplicated, block: B:108:0x027a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0287  */
    /* JADX WARN: Code duplicated, block: B:113:0x0295  */
    /* JADX WARN: Code duplicated, block: B:116:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:117:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:120:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:122:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:125:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:126:0x0320  */
    /* JADX WARN: Code duplicated, block: B:128:0x032c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0358  */
    /* JADX WARN: Code duplicated, block: B:131:0x0368  */
    /* JADX WARN: Code duplicated, block: B:134:0x0372  */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:38:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:46:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:61:0x010c  */
    /* JADX WARN: Code duplicated, block: B:64:0x011d  */
    /* JADX WARN: Code duplicated, block: B:68:0x012d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:91:0x0201  */
    /* JADX WARN: Code duplicated, block: B:92:0x0205  */
    /* JADX WARN: Code duplicated, block: B:95:0x0212  */
    /* JADX WARN: Code duplicated, block: B:97:0x0220  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v1, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r12v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r12v3, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r12v5, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    @SuppressLint({"SetJavaScriptEnabled"})
    /* JADX INFO: renamed from: p */
    public static final void m105002p(AbstractC34268a.a.i viewState, Function1 onViewEvent, Function1 onNavEvent, boolean z4, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        boolean z14;
        boolean z15;
        ?? r14;
        C28677v1 c28677v1M87180u;
        boolean z16;
        Object objM87133R;
        C28676v0 c28676v0;
        Object obj;
        boolean zBooleanValue;
        Function1 function1Mo86980f;
        int i16;
        boolean z17;
        boolean zM87157i;
        Object obj2;
        int iHashCode;
        C2314t c2314t;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        int i17;
        C0209i c0209i3;
        C0209i c0209i4;
        ?? r10;
        int iHashCode2;
        C0209i c0209i5;
        int iHashCode3;
        int iHashCode4;
        ?? r15;
        ?? r16;
        boolean z18;
        ?? r17;
        boolean z19;
        Object obj3;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavEvent, "onNavEvent");
        ?? r18 = (C28655q) composer;
        r18.m87154g0(1422252381);
        if ((i13 & 6) == 0) {
            i15 = (r18.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= r18.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= r18.m87157i(onNavEvent) ? 256 : 128;
        }
        int i18 = i14 & 8;
        if (i18 == 0) {
            if ((i13 & 3072) == 0) {
                z13 = z4;
                i15 |= r18.m87155h(z13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (r18.m87135U(i15 & 1, z14)) {
                if (i18 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                objM87133R = r18.m87133R();
                c28676v0 = C28635l.f115821a;
                obj = objM87133R;
                if (objM87133R == c28676v0) {
                    C28633k1 c28633k1M87272z = AbstractC28683x.m87272z(Boolean.FALSE);
                    r18.m87172p0(c28633k1M87272z);
                    obj = c28633k1M87272z;
                }
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) obj;
                zBooleanValue = ((Boolean) interfaceC28601c1.mo86981i()).booleanValue();
                function1Mo86980f = interfaceC28601c1.mo86980f();
                Integer numValueOf = Integer.valueOf(viewState.getStepId());
                i16 = i15 & 112;
                if (i16 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87157i = z17 | r18.m87157i(viewState);
                Object objM87133R2 = r18.m87133R();
                obj2 = objM87133R2;
                if (zM87157i || objM87133R2 == c28676v0) {
                    a aVar = new a(onViewEvent, viewState, null);
                    r18.m87172p0(aVar);
                    obj2 = aVar;
                }
                AbstractC28683x.m87253g(r18, (InterfaceC4351m) obj2, numValueOf);
                C2307m c2307m = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                iHashCode = Long.hashCode(r18.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = r18.m87165m();
                c2314t = C2314t.f9131w;
                Modifier modifierM118962N = AbstractC37056f.m118962N(r18, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                r18.m87158i0();
                if (r18.f115903S) {
                    r18.m87163l(c0213j);
                } else {
                    r18.m87178s0();
                }
                C0209i c0209i6 = C0217k.f729g;
                AbstractC28683x.m87239G(r18, c0209i6, interfaceC39127r0M66763d);
                c0209i = C0217k.f728f;
                AbstractC28683x.m87239G(r18, c0209i, interfaceC28653p1M87165m);
                c0209i2 = C0217k.f732j;
                if (r18.f115903S) {
                    i17 = i15;
                } else {
                    i17 = i15;
                    if (!AbstractC22676k.m65745e(r18.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i7 = C0217k.f726d;
                    AbstractC28683x.m87239G(r18, c0209i7, modifierM118962N);
                    if (viewState.getIsErrorLoading() || zBooleanValue) {
                        c0209i3 = c0209i;
                        c0209i4 = c0209i2;
                        r10 = 0;
                        r18.m87150e0(1315402699);
                        r18.m87173q(false);
                    } else {
                        r18.m87150e0(1314917394);
                        TextResource textResourceM108527d = viewState.getRetryState().getTitle();
                        TextResource textResourceM108524a = viewState.getRetryState().getBody();
                        TextResource textResourceM108526c = viewState.getRetryState().getPositiveCta();
                        boolean zM87157i2 = (i16 == 32) | r18.m87157i(viewState);
                        Object objM87133R3 = r18.m87133R();
                        if (zM87157i2 || objM87133R3 == c28676v0) {
                            C33107j c33107j = new C33107j(4, onViewEvent, viewState);
                            r18.m87172p0(c33107j);
                            obj3 = c33107j;
                        } else {
                            obj3 = objM87133R3;
                        }
                        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) obj3;
                        TextResource textResourceM108525b = viewState.getRetryState().getNegativeCta();
                        boolean z24 = i16 == 32;
                        Object objM87133R4 = r18.m87133R();
                        Object obj4 = objM87133R4;
                        if (z24 || objM87133R4 == c28676v0) {
                            C33098a c33098a = new C33098a(onViewEvent, 8);
                            r18.m87172p0(c33098a);
                            obj4 = c33098a;
                        }
                        int i19 = TextResource.$stable;
                        c0209i4 = c0209i2;
                        c0209i3 = c0209i;
                        r10 = 0;
                        AbstractC22926c.m66686y(textResourceM108527d, textResourceM108524a, textResourceM108526c, interfaceC4339a, textResourceM108525b, (InterfaceC4339a) obj4, false, r18, (i19 << 12) | (i19 << 3) | i19 | (i19 << 6), 64);
                        r18.m87173q(false);
                    }
                    Modifier modifierM104986G = m104986G(c2314t, viewState.getIsErrorLoading(), zBooleanValue);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r18, r10);
                    iHashCode2 = Long.hashCode(r18.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = r18.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(r18, modifierM104986G);
                    r18.m87158i0();
                    if (r18.f115903S) {
                        r18.m87163l(c0213j);
                    } else {
                        r18.m87178s0();
                    }
                    AbstractC28683x.m87239G(r18, c0209i6, c23010xM66775a);
                    AbstractC28683x.m87239G(r18, c0209i3, interfaceC28653p1M87165m2);
                    if (r18.f115903S && AbstractC22676k.m65745e(r18.m87133R(), Integer.valueOf(iHashCode2))) {
                        c0209i5 = c0209i4;
                    } else {
                        c0209i5 = c0209i4;
                        AbstractC11266d.m30471y(iHashCode2, r18, iHashCode2, c0209i5);
                    }
                    AbstractC28683x.m87239G(r18, c0209i7, modifierM118962N2);
                    AbstractC31917f.m99349g(viewState, onViewEvent, r18, i17 & 126);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM66722k = AbstractC22953f.m66722k(modifierM3409f.mo3471e(new LayoutWeightElement(1.0f, true)));
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, r18, r10);
                    iHashCode3 = Long.hashCode(r18.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = r18.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(r18, modifierM66722k);
                    r18.m87158i0();
                    if (r18.f115903S) {
                        r18.m87163l(c0213j);
                    } else {
                        r18.m87178s0();
                    }
                    AbstractC28683x.m87239G(r18, c0209i6, c22994r1M66759a);
                    AbstractC28683x.m87239G(r18, c0209i3, interfaceC28653p1M87165m3);
                    if (r18.f115903S || !AbstractC22676k.m65745e(r18.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, r18, iHashCode3, c0209i5);
                    }
                    AbstractC28683x.m87239G(r18, c0209i7, modifierM118962N3);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, r10);
                    iHashCode4 = Long.hashCode(r18.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = r18.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(r18, c2314t);
                    r18.m87158i0();
                    if (r18.f115903S) {
                        r18.m87163l(c0213j);
                    } else {
                        r18.m87178s0();
                    }
                    AbstractC28683x.m87239G(r18, c0209i6, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(r18, c0209i3, interfaceC28653p1M87165m4);
                    if (r18.f115903S || !AbstractC22676k.m65745e(r18.m87133R(), Integer.valueOf(iHashCode4))) {
                        AbstractC11266d.m30471y(iHashCode4, r18, iHashCode4, c0209i5);
                    }
                    AbstractC28683x.m87239G(r18, c0209i7, modifierM118962N4);
                    if (z16) {
                        r18.m87150e0(-1135171313);
                        r18.m87144b0(517571683, r18.m87124I(Integer.valueOf(viewState.getStepId()), Integer.valueOf(viewState.getRetryAttempt())));
                        z19 = r10 == true ? 1 : 0;
                        m105006t(viewState.getTypeformUrl(), viewState.getSurveyProvider(), zBooleanValue, function1Mo86980f, onViewEvent, onNavEvent, r18, (i17 << 9) & 516096);
                        r18.m87173q(z19);
                        r18.m87173q(z19);
                    } else {
                        r15 = r10;
                        r18.m87150e0(-1134621621);
                        r18.m87173q(r15);
                    }
                    if (zBooleanValue == 0) {
                        r16 = r15;
                        r16 = z19;
                        r18.m87150e0(-1134574098);
                        z18 = true;
                        AbstractC35684p.m113047h(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d)), false, 0.0f, 0, null, null, null, null, r18, 0, 508);
                        ?? r19 = r18;
                        r19.m87173q(r16);
                        r17 = r19;
                    } else {
                        r16 = r15;
                        r16 = z19;
                        z18 = true;
                        r18.m87150e0(-1134330965);
                        r18.m87173q(r16);
                        r17 = r18;
                    }
                    AbstractC2875y.m8286B(r17, z18, z18, z18, z18);
                    z15 = z16;
                    r14 = r17;
                }
                AbstractC11266d.m30471y(iHashCode, r18, iHashCode, c0209i2);
                C0209i c0209i8 = C0217k.f726d;
                AbstractC28683x.m87239G(r18, c0209i8, modifierM118962N);
                if (viewState.getIsErrorLoading()) {
                    c0209i3 = c0209i;
                    c0209i4 = c0209i2;
                    r10 = 0;
                    r18.m87150e0(1315402699);
                    r18.m87173q(false);
                } else {
                    c0209i3 = c0209i;
                    c0209i4 = c0209i2;
                    r10 = 0;
                    r18.m87150e0(1315402699);
                    r18.m87173q(false);
                }
                Modifier modifierM104986G2 = m104986G(c2314t, viewState.getIsErrorLoading(), zBooleanValue);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r18, r10);
                iHashCode2 = Long.hashCode(r18.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = r18.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(r18, modifierM104986G2);
                r18.m87158i0();
                if (r18.f115903S) {
                    r18.m87163l(c0213j);
                } else {
                    r18.m87178s0();
                }
                AbstractC28683x.m87239G(r18, c0209i6, c23010xM66775a2);
                AbstractC28683x.m87239G(r18, c0209i3, interfaceC28653p1M87165m5);
                if (r18.f115903S) {
                    c0209i5 = c0209i4;
                    AbstractC11266d.m30471y(iHashCode2, r18, iHashCode2, c0209i5);
                } else {
                    c0209i5 = c0209i4;
                    AbstractC11266d.m30471y(iHashCode2, r18, iHashCode2, c0209i5);
                }
                AbstractC28683x.m87239G(r18, c0209i8, modifierM118962N5);
                AbstractC31917f.m99349g(viewState, onViewEvent, r18, i17 & 126);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM66722k2 = AbstractC22953f.m66722k(modifierM3409f2.mo3471e(new LayoutWeightElement(1.0f, true)));
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, r18, r10);
                iHashCode3 = Long.hashCode(r18.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = r18.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(r18, modifierM66722k2);
                r18.m87158i0();
                if (r18.f115903S) {
                    r18.m87163l(c0213j);
                } else {
                    r18.m87178s0();
                }
                AbstractC28683x.m87239G(r18, c0209i6, c22994r1M66759a2);
                AbstractC28683x.m87239G(r18, c0209i3, interfaceC28653p1M87165m6);
                if (r18.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, r18, iHashCode3, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, r18, iHashCode3, c0209i5);
                }
                AbstractC28683x.m87239G(r18, c0209i8, modifierM118962N6);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, r10);
                iHashCode4 = Long.hashCode(r18.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = r18.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(r18, c2314t);
                r18.m87158i0();
                if (r18.f115903S) {
                    r18.m87163l(c0213j);
                } else {
                    r18.m87178s0();
                }
                AbstractC28683x.m87239G(r18, c0209i6, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(r18, c0209i3, interfaceC28653p1M87165m7);
                if (r18.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, r18, iHashCode4, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, r18, iHashCode4, c0209i5);
                }
                AbstractC28683x.m87239G(r18, c0209i8, modifierM118962N7);
                if (z16) {
                    r18.m87150e0(-1135171313);
                    r18.m87144b0(517571683, r18.m87124I(Integer.valueOf(viewState.getStepId()), Integer.valueOf(viewState.getRetryAttempt())));
                    z19 = r10 == true ? 1 : 0;
                    m105006t(viewState.getTypeformUrl(), viewState.getSurveyProvider(), zBooleanValue, function1Mo86980f, onViewEvent, onNavEvent, r18, (i17 << 9) & 516096);
                    r18.m87173q(z19);
                    r18.m87173q(z19);
                } else {
                    r15 = r10;
                    r18.m87150e0(-1134621621);
                    r18.m87173q(r15);
                }
                if (zBooleanValue == 0) {
                    r16 = r15;
                    r16 = z19;
                    r18.m87150e0(-1134574098);
                    z18 = true;
                    AbstractC35684p.m113047h(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d)), false, 0.0f, 0, null, null, null, null, r18, 0, 508);
                    ?? r110 = r18;
                    r110.m87173q(r16);
                    r17 = r110;
                } else {
                    r16 = r15;
                    r16 = z19;
                    z18 = true;
                    r18.m87150e0(-1134330965);
                    r18.m87173q(r16);
                    r17 = r18;
                }
                AbstractC2875y.m8286B(r17, z18, z18, z18, z18);
                z15 = z16;
                r14 = r17;
            } else {
                r18.m87138X();
                z15 = z13;
                r14 = r18;
            }
            c28677v1M87180u = r14.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C31919h(viewState, onViewEvent, onNavEvent, z15, i13, i14, 3);
            }
        }
        i15 |= 3072;
        z13 = z4;
        if ((i15 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (r18.m87135U(i15 & 1, z14)) {
            if (i18 != 0) {
                z16 = true;
            } else {
                z16 = z13;
            }
            objM87133R = r18.m87133R();
            c28676v0 = C28635l.f115821a;
            obj = objM87133R;
            if (objM87133R == c28676v0) {
                C28633k1 c28633k1M87272z2 = AbstractC28683x.m87272z(Boolean.FALSE);
                r18.m87172p0(c28633k1M87272z2);
                obj = c28633k1M87272z2;
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) obj;
            zBooleanValue = ((Boolean) interfaceC28601c2.mo86981i()).booleanValue();
            function1Mo86980f = interfaceC28601c2.mo86980f();
            Integer numValueOf2 = Integer.valueOf(viewState.getStepId());
            i16 = i15 & 112;
            if (i16 == 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            zM87157i = z17 | r18.m87157i(viewState);
            Object objM87133R5 = r18.m87133R();
            obj2 = objM87133R5;
            if (zM87157i) {
                a aVar2 = new a(onViewEvent, viewState, null);
                r18.m87172p0(aVar2);
                obj2 = aVar2;
            } else {
                a aVar3 = new a(onViewEvent, viewState, null);
                r18.m87172p0(aVar3);
                obj2 = aVar3;
            }
            AbstractC28683x.m87253g(r18, (InterfaceC4351m) obj2, numValueOf2);
            C2307m c2307m2 = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m2, false);
            iHashCode = Long.hashCode(r18.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = r18.m87165m();
            c2314t = C2314t.f9131w;
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(r18, c2314t);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            r18.m87158i0();
            if (r18.f115903S) {
                r18.m87163l(c0213j);
            } else {
                r18.m87178s0();
            }
            C0209i c0209i9 = C0217k.f729g;
            AbstractC28683x.m87239G(r18, c0209i9, interfaceC39127r0M66763d4);
            c0209i = C0217k.f728f;
            AbstractC28683x.m87239G(r18, c0209i, interfaceC28653p1M87165m8);
            c0209i2 = C0217k.f732j;
            if (r18.f115903S) {
                i17 = i15;
                if (!AbstractC22676k.m65745e(r18.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i10 = C0217k.f726d;
                AbstractC28683x.m87239G(r18, c0209i10, modifierM118962N8);
                if (viewState.getIsErrorLoading()) {
                    c0209i3 = c0209i;
                    c0209i4 = c0209i2;
                    r10 = 0;
                    r18.m87150e0(1315402699);
                    r18.m87173q(false);
                } else {
                    c0209i3 = c0209i;
                    c0209i4 = c0209i2;
                    r10 = 0;
                    r18.m87150e0(1315402699);
                    r18.m87173q(false);
                }
                Modifier modifierM104986G3 = m104986G(c2314t, viewState.getIsErrorLoading(), zBooleanValue);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r18, r10);
                iHashCode2 = Long.hashCode(r18.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = r18.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(r18, modifierM104986G3);
                r18.m87158i0();
                if (r18.f115903S) {
                    r18.m87163l(c0213j);
                } else {
                    r18.m87178s0();
                }
                AbstractC28683x.m87239G(r18, c0209i9, c23010xM66775a3);
                AbstractC28683x.m87239G(r18, c0209i3, interfaceC28653p1M87165m9);
                if (r18.f115903S) {
                    c0209i5 = c0209i4;
                    AbstractC11266d.m30471y(iHashCode2, r18, iHashCode2, c0209i5);
                } else {
                    c0209i5 = c0209i4;
                    AbstractC11266d.m30471y(iHashCode2, r18, iHashCode2, c0209i5);
                }
                AbstractC28683x.m87239G(r18, c0209i10, modifierM118962N9);
                AbstractC31917f.m99349g(viewState, onViewEvent, r18, i17 & 126);
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM66722k3 = AbstractC22953f.m66722k(modifierM3409f3.mo3471e(new LayoutWeightElement(1.0f, true)));
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, r18, r10);
                iHashCode3 = Long.hashCode(r18.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = r18.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(r18, modifierM66722k3);
                r18.m87158i0();
                if (r18.f115903S) {
                    r18.m87163l(c0213j);
                } else {
                    r18.m87178s0();
                }
                AbstractC28683x.m87239G(r18, c0209i9, c22994r1M66759a3);
                AbstractC28683x.m87239G(r18, c0209i3, interfaceC28653p1M87165m10);
                if (r18.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, r18, iHashCode3, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, r18, iHashCode3, c0209i5);
                }
                AbstractC28683x.m87239G(r18, c0209i10, modifierM118962N10);
                InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m2, r10);
                iHashCode4 = Long.hashCode(r18.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = r18.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(r18, c2314t);
                r18.m87158i0();
                if (r18.f115903S) {
                    r18.m87163l(c0213j);
                } else {
                    r18.m87178s0();
                }
                AbstractC28683x.m87239G(r18, c0209i9, interfaceC39127r0M66763d5);
                AbstractC28683x.m87239G(r18, c0209i3, interfaceC28653p1M87165m11);
                if (r18.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, r18, iHashCode4, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, r18, iHashCode4, c0209i5);
                }
                AbstractC28683x.m87239G(r18, c0209i10, modifierM118962N11);
                if (z16) {
                    r18.m87150e0(-1135171313);
                    r18.m87144b0(517571683, r18.m87124I(Integer.valueOf(viewState.getStepId()), Integer.valueOf(viewState.getRetryAttempt())));
                    z19 = r10 == true ? 1 : 0;
                    m105006t(viewState.getTypeformUrl(), viewState.getSurveyProvider(), zBooleanValue, function1Mo86980f, onViewEvent, onNavEvent, r18, (i17 << 9) & 516096);
                    r18.m87173q(z19);
                    r18.m87173q(z19);
                } else {
                    r15 = r10;
                    r18.m87150e0(-1134621621);
                    r18.m87173q(r15);
                }
                if (zBooleanValue == 0) {
                    r16 = r15;
                    r16 = z19;
                    r18.m87150e0(-1134574098);
                    z18 = true;
                    AbstractC35684p.m113047h(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d)), false, 0.0f, 0, null, null, null, null, r18, 0, 508);
                    ?? r111 = r18;
                    r111.m87173q(r16);
                    r17 = r111;
                } else {
                    r16 = r15;
                    r16 = z19;
                    z18 = true;
                    r18.m87150e0(-1134330965);
                    r18.m87173q(r16);
                    r17 = r18;
                }
                AbstractC2875y.m8286B(r17, z18, z18, z18, z18);
                z15 = z16;
                r14 = r17;
            } else {
                i17 = i15;
            }
            AbstractC11266d.m30471y(iHashCode, r18, iHashCode, c0209i2);
            C0209i c0209i11 = C0217k.f726d;
            AbstractC28683x.m87239G(r18, c0209i11, modifierM118962N8);
            if (viewState.getIsErrorLoading()) {
                c0209i3 = c0209i;
                c0209i4 = c0209i2;
                r10 = 0;
                r18.m87150e0(1315402699);
                r18.m87173q(false);
            } else {
                c0209i3 = c0209i;
                c0209i4 = c0209i2;
                r10 = 0;
                r18.m87150e0(1315402699);
                r18.m87173q(false);
            }
            Modifier modifierM104986G4 = m104986G(c2314t, viewState.getIsErrorLoading(), zBooleanValue);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r18, r10);
            iHashCode2 = Long.hashCode(r18.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m12 = r18.m87165m();
            Modifier modifierM118962N12 = AbstractC37056f.m118962N(r18, modifierM104986G4);
            r18.m87158i0();
            if (r18.f115903S) {
                r18.m87163l(c0213j);
            } else {
                r18.m87178s0();
            }
            AbstractC28683x.m87239G(r18, c0209i9, c23010xM66775a4);
            AbstractC28683x.m87239G(r18, c0209i3, interfaceC28653p1M87165m12);
            if (r18.f115903S) {
                c0209i5 = c0209i4;
                AbstractC11266d.m30471y(iHashCode2, r18, iHashCode2, c0209i5);
            } else {
                c0209i5 = c0209i4;
                AbstractC11266d.m30471y(iHashCode2, r18, iHashCode2, c0209i5);
            }
            AbstractC28683x.m87239G(r18, c0209i11, modifierM118962N12);
            AbstractC31917f.m99349g(viewState, onViewEvent, r18, i17 & 126);
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM66722k4 = AbstractC22953f.m66722k(modifierM3409f4.mo3471e(new LayoutWeightElement(1.0f, true)));
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, r18, r10);
            iHashCode3 = Long.hashCode(r18.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m13 = r18.m87165m();
            Modifier modifierM118962N13 = AbstractC37056f.m118962N(r18, modifierM66722k4);
            r18.m87158i0();
            if (r18.f115903S) {
                r18.m87163l(c0213j);
            } else {
                r18.m87178s0();
            }
            AbstractC28683x.m87239G(r18, c0209i9, c22994r1M66759a4);
            AbstractC28683x.m87239G(r18, c0209i3, interfaceC28653p1M87165m13);
            if (r18.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, r18, iHashCode3, c0209i5);
            } else {
                AbstractC11266d.m30471y(iHashCode3, r18, iHashCode3, c0209i5);
            }
            AbstractC28683x.m87239G(r18, c0209i11, modifierM118962N13);
            InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m2, r10);
            iHashCode4 = Long.hashCode(r18.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m14 = r18.m87165m();
            Modifier modifierM118962N14 = AbstractC37056f.m118962N(r18, c2314t);
            r18.m87158i0();
            if (r18.f115903S) {
                r18.m87163l(c0213j);
            } else {
                r18.m87178s0();
            }
            AbstractC28683x.m87239G(r18, c0209i9, interfaceC39127r0M66763d6);
            AbstractC28683x.m87239G(r18, c0209i3, interfaceC28653p1M87165m14);
            if (r18.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, r18, iHashCode4, c0209i5);
            } else {
                AbstractC11266d.m30471y(iHashCode4, r18, iHashCode4, c0209i5);
            }
            AbstractC28683x.m87239G(r18, c0209i11, modifierM118962N14);
            if (z16) {
                r18.m87150e0(-1135171313);
                r18.m87144b0(517571683, r18.m87124I(Integer.valueOf(viewState.getStepId()), Integer.valueOf(viewState.getRetryAttempt())));
                z19 = r10 == true ? 1 : 0;
                m105006t(viewState.getTypeformUrl(), viewState.getSurveyProvider(), zBooleanValue, function1Mo86980f, onViewEvent, onNavEvent, r18, (i17 << 9) & 516096);
                r18.m87173q(z19);
                r18.m87173q(z19);
            } else {
                r15 = r10;
                r18.m87150e0(-1134621621);
                r18.m87173q(r15);
            }
            if (zBooleanValue == 0) {
                r16 = r15;
                r16 = z19;
                r18.m87150e0(-1134574098);
                z18 = true;
                AbstractC35684p.m113047h(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d)), false, 0.0f, 0, null, null, null, null, r18, 0, 508);
                ?? r112 = r18;
                r112.m87173q(r16);
                r17 = r112;
            } else {
                r16 = r15;
                r16 = z19;
                z18 = true;
                r18.m87150e0(-1134330965);
                r18.m87173q(r16);
                r17 = r18;
            }
            AbstractC2875y.m8286B(r17, z18, z18, z18, z18);
            z15 = z16;
            r14 = r17;
        } else {
            r18.m87138X();
            z15 = z13;
            r14 = r18;
        }
        c28677v1M87180u = r14.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31919h(viewState, onViewEvent, onNavEvent, z15, i13, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m105003q(Function1 function1, AbstractC34268a.a.i iVar) {
        function1.invoke(new AbstractC27299a.t(iVar.getRetryAttempt()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m105004r(Function1 function1) {
        function1.invoke(AbstractC27299a.e.f109323a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m105005s(AbstractC34268a.a.i iVar, Function1 function1, Function1 function2, boolean z4, int i13, int i14, Composer composer, int i15) {
        m105002p(iVar, function1, function2, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* JADX INFO: renamed from: t */
    public static final void m105006t(String url, SurveyProvider surveyProvider, boolean z4, Function1 onPageLoaded, Function1 onViewEvent, Function1 onNavEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        int i15;
        int i16;
        InterfaceC28601c1 interfaceC28601c1;
        InterfaceC28601c1 interfaceC28601c2;
        C28676v0 c28676v0;
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(surveyProvider, "surveyProvider");
        AbstractC22676k.m65750j(onPageLoaded, "onPageLoaded");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavEvent, "onNavEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(504267996);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(url) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87149e(surveyProvider.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87157i(onPageLoaded) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q2.m87157i(onNavEvent) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if (c28655q2.m87135U(i14 & 1, (74899 & i14) != 74898)) {
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (objM87133R == c28676v1) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R;
            Object objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v1) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R2;
            Object objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v1) {
                objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R3);
            }
            InterfaceC28601c1 interfaceC28601c5 = (InterfaceC28601c1) objM87133R3;
            Object objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v1) {
                objM87133R4 = AbstractC28683x.m87272z(null);
                c28655q2.m87172p0(objM87133R4);
            }
            InterfaceC28601c1 interfaceC28601c6 = (InterfaceC28601c1) objM87133R4;
            ActivityResultContracts$GetContent activityResultContracts$GetContent = new ActivityResultContracts$GetContent();
            Object objM87133R5 = c28655q2.m87133R();
            if (objM87133R5 == c28676v1) {
                objM87133R5 = new C33116s(interfaceC28601c6, 1);
                c28655q2.m87172p0(objM87133R5);
            }
            C16351i c16351iM118972a0 = AbstractC37056f.m118972a0(activityResultContracts$GetContent, (Function1) objM87133R5, c28655q2, 48);
            Boolean boolValueOf = Boolean.valueOf(z4);
            boolean z13 = (i14 & 896) == 256;
            Object objM87133R6 = c28655q2.m87133R();
            if (z13 || objM87133R6 == c28676v1) {
                objM87133R6 = new b(interfaceC28601c5, z4, null);
                c28655q2.m87172p0(objM87133R6);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, boolValueOf);
            int i17 = i14 & 7168;
            int i18 = 57344 & i14;
            int i19 = i14;
            int i24 = i19 & 14;
            int i25 = i19 & 112;
            boolean z14 = (i24 == 4) | (i17 == 2048) | (i18 == 16384) | (i25 == 32);
            Object objM87133R7 = c28655q2.m87133R();
            if (z14 || objM87133R7 == c28676v1) {
                i15 = i24;
                i16 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                interfaceC28601c1 = interfaceC28601c3;
                objM87133R7 = new c(interfaceC28601c5, onPageLoaded, interfaceC28601c1, interfaceC28601c4, onViewEvent, url, surveyProvider, null);
                interfaceC28601c2 = interfaceC28601c4;
                c28655q2.m87172p0(objM87133R7);
            } else {
                i15 = i24;
                interfaceC28601c2 = interfaceC28601c4;
                i16 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                interfaceC28601c1 = interfaceC28601c3;
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R7, url);
            Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC34132o.m107879c(z4 ? 1.0f : 0.0f, AbstractC1102d.m3407d(1.0f, C2314t.f9131w)), "TypeFormWebView");
            boolean zM87157i = ((i19 & 458752) == i16) | (i17 == 2048) | (i18 == 16384) | (i15 == 4) | (i25 == 32) | c28655q2.m87157i(c16351iM118972a0);
            Object objM87133R8 = c28655q2.m87133R();
            if (zM87157i) {
                InterfaceC28601c1 interfaceC28601c7 = interfaceC28601c2;
                c28676v0 = c28676v1;
                C18434s c18434s = new C18434s(interfaceC28601c6, onNavEvent, interfaceC28601c1, onPageLoaded, onViewEvent, url, interfaceC28601c7, surveyProvider, c16351iM118972a0);
                interfaceC28601c2 = interfaceC28601c7;
                c28655q2.m87172p0(c18434s);
                objM87133R8 = c18434s;
            } else if (objM87133R8 == c28676v1) {
                c28676v1 = c28676v1;
                InterfaceC28601c1 interfaceC28601c8 = interfaceC28601c2;
                c28676v0 = c28676v1;
                C18434s c18434s2 = new C18434s(interfaceC28601c6, onNavEvent, interfaceC28601c1, onPageLoaded, onViewEvent, url, interfaceC28601c8, surveyProvider, c16351iM118972a0);
                interfaceC28601c2 = interfaceC28601c8;
                c28655q2.m87172p0(c18434s2);
                objM87133R8 = c18434s2;
            } else {
                c28676v0 = c28676v1;
            }
            Function1 function1 = (Function1) objM87133R8;
            boolean z15 = (i18 == 16384) | (i25 == 32) | (i15 == 4);
            Object objM87133R9 = c28655q2.m87133R();
            if (z15 || objM87133R9 == c28676v0) {
                C33115r c33115r = new C33115r(interfaceC28601c1, interfaceC28601c2, url, onViewEvent, surveyProvider);
                c28655q2.m87172p0(c33115r);
                objM87133R9 = c33115r;
            }
            c28655q = c28655q2;
            AbstractC1137a.m3601a(function1, modifierM3599a, (Function1) objM87133R9, c28655q, 0, 0);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11547l0(url, surveyProvider, z4, onPageLoaded, onViewEvent, onNavEvent, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m105007u(InterfaceC28601c1 interfaceC28601c1, Uri uri) {
        ValueCallback valueCallback = (ValueCallback) interfaceC28601c1.getValue();
        if (valueCallback != null) {
            valueCallback.onReceiveValue(uri != null ? new Uri[]{uri} : null);
        }
        interfaceC28601c1.setValue(null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final WebView m105008v(InterfaceC28601c1 interfaceC28601c1, Function1 function1, InterfaceC28601c1 interfaceC28601c2, Function1 function2, Function1 function3, String str, InterfaceC28601c1 interfaceC28601c3, SurveyProvider surveyProvider, C16351i c16351i, Context context) {
        AbstractC22676k.m65750j(context, "context");
        WebView webView = new WebView(context);
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.setWebViewClient(new C27311e(new C33105h(function1, 5), new C33107j(5, interfaceC28601c2, function2), new C33115r(interfaceC28601c2, function3, str, interfaceC28601c3, surveyProvider, 2), new C33115r(interfaceC28601c2, function3, str, interfaceC28601c3, surveyProvider, 0)));
        webView.setWebChromeClient(new C27309c(new C33105h(function3, 4), AbstractC27310d.m82460b((ValueCallback) interfaceC28601c1.getValue(), new C33116s(interfaceC28601c1, 0), new C33100c(c16351i, 1))));
        return webView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m105009w(Function1 function1, String it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC10840c.h(it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m105010x(InterfaceC28601c1 interfaceC28601c1, Function1 function1) {
        if (!((Boolean) interfaceC28601c1.getValue()).booleanValue()) {
            function1.invoke(Boolean.TRUE);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m105011y(InterfaceC28601c1 interfaceC28601c1, Function1 function1, String str, InterfaceC28601c1 interfaceC28601c2, SurveyProvider surveyProvider, String error) {
        AbstractC22676k.m65750j(error, "error");
        if (!((Boolean) interfaceC28601c1.getValue()).booleanValue()) {
            interfaceC28601c1.setValue(Boolean.TRUE);
            function1.invoke(new AbstractC27299a.l(AbstractC18489d0.m53370k(str, " ", error), ((Boolean) interfaceC28601c2.getValue()).booleanValue(), surveyProvider));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m105012z(InterfaceC28601c1 interfaceC28601c1, Function1 function1, String str, InterfaceC28601c1 interfaceC28601c2, SurveyProvider surveyProvider, Integer num) {
        interfaceC28601c1.setValue(Boolean.TRUE);
        function1.invoke(new AbstractC27299a.l("(" + str + "): " + num, ((Boolean) interfaceC28601c2.getValue()).booleanValue(), surveyProvider));
        return C23454a0.f92919a;
    }
}
