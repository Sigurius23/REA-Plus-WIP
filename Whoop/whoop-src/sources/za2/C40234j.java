package za2;

import ab2.C0708a;
import android.content.ComponentCallbacks;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import aq0.C1904o;
import bb2.AbstractC2933i;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import eb2.C13006a;
import eb2.InterfaceC13007b;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fi0.InterfaceC14515a;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Iterator;
import java.util.List;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p236j.AbstractC21065d;
import p236j.C21062a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uf3.C34911a;
import vf3.C35953c;
import vf3.InterfaceC35951a;
import w20.C36727q;
import wb3.AbstractC37056f;
import x30.C37888f1;
import yw1.C39818e;

/* JADX INFO: renamed from: za2.j */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0003R\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0012\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0012\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0012\u001a\u0004\b1\u00102R\"\u00108\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\u001b0\u001b048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u0006>²\u0006\f\u0010:\u001a\u0002098\nX\u008a\u0084\u0002²\u0006\u0018\u0010=\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u00040;8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lza2/j;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ll83/a0;", "Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "onResume", "Lza2/p;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "Q", "()Lza2/p;", "viewModel", "Lza2/n;", "x", "O", "()Lza2/n;", "navigationRouter", "Landroid/content/Intent;", "y", "P", "()Landroid/content/Intent;", "pairingFlowIntent", "Lab2/a;", "z", "L", "()Lab2/a;", "analytics", "Lza2/u;", "E", "N", "()Lza2/u;", "coordinator", "Lfi0/a;", "F", "M", "()Lfi0/a;", "analyticsWriter", "Leb2/a;", "G", "K", "()Leb2/a;", "actionRouter", "Lj/d;", "kotlin.jvm.PlatformType", "H", "Lj/d;", "chooseStrapLauncher", "Lza2/q;", "viewState", "Lkotlin/Function1;", "Leb2/b;", "handleRoutedEvent", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40234j extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h coordinator;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsWriter;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h actionRouter;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final AbstractC21065d chooseStrapLauncher;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new i(this, null, new h(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h navigationRouter;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h pairingFlowIntent;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h analytics;

    /* JADX INFO: renamed from: za2.j$a */
    @InterfaceC32271e(m100429c = "com.whoop.settings.banner.SettingsBannerFragment$onCreateView$1$3$1", m100430f = "SettingsBannerFragment.kt", m100431l = {92}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f173903w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f173905y;

        /* JADX INFO: renamed from: za2.j$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42735a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C40234j f173906w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC28670t2 f173907x;

            public C42735a(C40234j c40234j, InterfaceC28670t2 interfaceC28670t2) {
                this.f173906w = c40234j;
                this.f173907x = interfaceC28670t2;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(InterfaceC40231g interfaceC40231g, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (!(interfaceC40231g instanceof InterfaceC40231g.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                List<InterfaceC13007b> listM36536i = this.f173906w.m129198K().m36536i(new AbstractC40237m.a(((InterfaceC40231g.a) interfaceC40231g).getDestination()));
                Function1 function1M129212Y = C40234j.m129212Y(this.f173907x);
                Iterator<T> it = listM36536i.iterator();
                while (it.hasNext()) {
                    function1M129212Y.invoke(it.next());
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f173905y = interfaceC28670t2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C40234j.this.new a(this.f173905y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f173903w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM129235l = C40234j.this.m129204Q().getEffects();
                C42735a c42735a = new C42735a(C40234j.this, this.f173905y);
                this.f173903w = 1;
                if (interfaceC13058lM129235l.collect(c42735a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: za2.j$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f173908w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f173909x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f173910y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f173908w = componentCallbacks;
            this.f173909x = interfaceC35951a;
            this.f173910y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, za2.n] */
        @Override // c93.InterfaceC4339a
        public final C40238n invoke() {
            ComponentCallbacks componentCallbacks = this.f173908w;
            InterfaceC35951a interfaceC35951a = this.f173909x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f173910y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C40238n.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: za2.j$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f173911w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f173912x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f173913y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f173911w = componentCallbacks;
            this.f173912x = interfaceC35951a;
            this.f173913y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [android.content.Intent, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final Intent invoke() {
            ComponentCallbacks componentCallbacks = this.f173911w;
            InterfaceC35951a interfaceC35951a = this.f173912x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f173913y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Intent.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: za2.j$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f173914w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f173915x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f173916y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f173914w = componentCallbacks;
            this.f173915x = interfaceC35951a;
            this.f173916y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [ab2.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C0708a invoke() {
            ComponentCallbacks componentCallbacks = this.f173914w;
            InterfaceC35951a interfaceC35951a = this.f173915x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f173916y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C0708a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: za2.j$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f173917w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f173918x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f173919y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f173917w = componentCallbacks;
            this.f173918x = interfaceC35951a;
            this.f173919y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, za2.u] */
        @Override // c93.InterfaceC4339a
        public final C40245u invoke() {
            ComponentCallbacks componentCallbacks = this.f173917w;
            InterfaceC35951a interfaceC35951a = this.f173918x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f173919y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C40245u.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: za2.j$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f173920w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f173921x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f173922y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f173920w = componentCallbacks;
            this.f173921x = interfaceC35951a;
            this.f173922y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [fi0.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC14515a invoke() {
            ComponentCallbacks componentCallbacks = this.f173920w;
            InterfaceC35951a interfaceC35951a = this.f173921x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f173922y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: za2.j$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f173923w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f173924x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f173925y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f173923w = componentCallbacks;
            this.f173924x = interfaceC35951a;
            this.f173925y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [eb2.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C13006a invoke() {
            ComponentCallbacks componentCallbacks = this.f173923w;
            InterfaceC35951a interfaceC35951a = this.f173924x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f173925y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C13006a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: za2.j$h */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f173926w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f173926w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.f173926w.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity()");
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity2 = this.f173926w.requireActivity();
            C1579e2 viewModelStore = abstractActivityC1340r0RequireActivity.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, abstractActivityC1340r0RequireActivity2);
        }
    }

    /* JADX INFO: renamed from: za2.j$i */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f173927w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f173928x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f173929y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f173930z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f173927w = abstractComponentCallbacksC1320m0;
            this.f173928x = interfaceC35951a;
            this.f173929y = interfaceC4339a;
            this.f173930z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, za2.p] */
        @Override // c93.InterfaceC4339a
        public final C40240p invoke() {
            return AbstractC37056f.m118952D(this.f173927w, this.f173928x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C40240p.class), this.f173929y, this.f173930z);
        }
    }

    public C40234j() {
        final int i13 = 0;
        InterfaceC4339a interfaceC4339a = new InterfaceC4339a(this) { // from class: za2.h

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C40234j f173892x;

            {
                this.f173892x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return C40234j.m129205R(this.f173892x);
                    default:
                        return C40234j.m129214a0(this.f173892x);
                }
            }
        };
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navigationRouter = AbstractC30060g.m92087G(enumC23463i, new b(this, null, interfaceC4339a));
        final int i14 = 1;
        this.pairingFlowIntent = AbstractC30060g.m92087G(enumC23463i, new c(this, new C35953c("CONNECTIVITY_PAIRING_FLOW_INTENT"), new InterfaceC4339a(this) { // from class: za2.h

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C40234j f173892x;

            {
                this.f173892x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return C40234j.m129205R(this.f173892x);
                    default:
                        return C40234j.m129214a0(this.f173892x);
                }
            }
        }));
        this.analytics = AbstractC30060g.m92087G(enumC23463i, new d(this, null, null));
        this.coordinator = AbstractC30060g.m92087G(enumC23463i, new e(this, null, null));
        this.analyticsWriter = AbstractC30060g.m92087G(enumC23463i, new f(this, null, null));
        this.actionRouter = AbstractC30060g.m92087G(enumC23463i, new g(this, null, null));
        AbstractC21065d abstractC21065dRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new C1904o(this, 21));
        AbstractC22676k.m65749i(abstractC21065dRegisterForActivityResult, "registerForActivityResult(...)");
        this.chooseStrapLauncher = abstractC21065dRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final void m129197J(C40234j c40234j, C21062a result) {
        AbstractC22676k.m65750j(result, "result");
        if (result.f79915w == -1) {
            c40234j.m129204Q().m129236n(AbstractC40239o.d.f173964a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public final C13006a m129198K() {
        return (C13006a) this.actionRouter.getValue();
    }

    /* JADX INFO: renamed from: L */
    private final C0708a m129199L() {
        return (C0708a) this.analytics.getValue();
    }

    /* JADX INFO: renamed from: M */
    private final InterfaceC14515a m129200M() {
        return (InterfaceC14515a) this.analyticsWriter.getValue();
    }

    /* JADX INFO: renamed from: N */
    private final C40245u m129201N() {
        return (C40245u) this.coordinator.getValue();
    }

    /* JADX INFO: renamed from: O */
    private final C40238n m129202O() {
        return (C40238n) this.navigationRouter.getValue();
    }

    /* JADX INFO: renamed from: P */
    private final Intent m129203P() {
        return (Intent) this.pairingFlowIntent.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public final C40240p m129204Q() {
        return (C40240p) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C34911a m129205R(C40234j c40234j) {
        return AbstractC15751g.m44431K(c40234j.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m129206S(final C40234j c40234j, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(c40234j.m129204Q().getViewState(), new C40241q(true, false, null, null, null, null, 62, null), null, c28655q, 0, 2);
            if (m129207T(interfaceC28601c1M87260n).getIsError()) {
                c40234j.m129201N().m129248c(AbstractC40244t.a.f174029a);
            }
            boolean zM87157i = c28655q.m87157i(c40234j);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                final int i14 = 0;
                objM87133R = new Function1(c40234j) { // from class: za2.i

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ C40234j f173894x;

                    {
                        this.f173894x = c40234j;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return C40234j.m129208U(this.f173894x, (InterfaceC13007b) obj);
                            default:
                                return C40234j.m129210W(this.f173894x, (AbstractC40225a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            Function1 function1 = (Function1) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(c40234j) | c28655q.m87153g(interfaceC28601c1M87260n) | c28655q.m87153g(function1);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C39818e((Object) c40234j, function1, (Object) interfaceC28601c1M87260n, 4);
                c28655q.m87172p0(objM87133R2);
            }
            Function3 function3 = (Function3) objM87133R2;
            if (m129207T(interfaceC28601c1M87260n).getIsError() || m129207T(interfaceC28601c1M87260n).getIsLoading()) {
                c28655q.m87150e0(-1751922880);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1753232072);
                C40241q c40241qM129207T = m129207T(interfaceC28601c1M87260n);
                C13006a c13006aM129198K = c40234j.m129198K();
                InterfaceC14515a interfaceC14515aM129200M = c40234j.m129200M();
                boolean zM87157i3 = c28655q.m87157i(c40234j);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87157i3 || objM87133R3 == c28676v0) {
                    final int i15 = 1;
                    objM87133R3 = new Function1(c40234j) { // from class: za2.i

                        /* JADX INFO: renamed from: x */
                        public final /* synthetic */ C40234j f173894x;

                        {
                            this.f173894x = c40234j;
                        }

                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i15) {
                                case 0:
                                    return C40234j.m129208U(this.f173894x, (InterfaceC13007b) obj);
                                default:
                                    return C40234j.m129210W(this.f173894x, (AbstractC40225a) obj);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                Function1 function2 = (Function1) objM87133R3;
                boolean zM87157i4 = c28655q.m87157i(c40234j) | c28655q.m87153g(interfaceC28601c1M87260n);
                Object objM87133R4 = c28655q.m87133R();
                if (zM87157i4 || objM87133R4 == c28676v0) {
                    objM87133R4 = new C37888f1(11, c40234j, interfaceC28601c1M87260n);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC2933i.m8555i(c40241qM129207T, function3, function2, (InterfaceC4351m) objM87133R4, c13006aM129198K, function1, interfaceC14515aM129200M, c28655q, 0, 0);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(function1, c28655q);
            C40240p c40240pM129204Q = c40234j.m129204Q();
            boolean zM87157i5 = c28655q.m87157i(c40234j) | c28655q.m87153g(interfaceC28601c1M87238F);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i5 || objM87133R5 == c28676v0) {
                objM87133R5 = c40234j.new a(interfaceC28601c1M87238F, null);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, c40240pM129204Q);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: T */
    private static final C40241q m129207T(InterfaceC28670t2 interfaceC28670t2) {
        return (C40241q) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m129208U(C40234j c40234j, InterfaceC13007b routed) {
        AbstractC22676k.m65750j(routed, "routed");
        if (routed instanceof InterfaceC13007b.c) {
            c40234j.m129204Q().m129236n(((InterfaceC13007b.c) routed).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String());
        } else if (routed instanceof InterfaceC13007b.b) {
            c40234j.m129202O().m129228a(((InterfaceC13007b.b) routed).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String());
        } else {
            if (!routed.equals(InterfaceC13007b.a.f44961a)) {
                throw new NoWhenBranchMatchedException();
            }
            c40234j.m129213Z();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m129209V(C40234j c40234j, Function1 function1, InterfaceC28670t2 interfaceC28670t2, AbstractC40237m event, int i13, boolean z4) {
        AbstractC22676k.m65750j(event, "event");
        if (z4) {
            c40234j.m129199L().m1771a(i13, m129207T(interfaceC28670t2).m129237a().get(i13).getAnalyticsCategory(), m129207T(interfaceC28670t2).m129237a().get(i13).getAnalyticsValue());
        }
        Iterator<T> it = c40234j.m129198K().m36536i(event).iterator();
        while (it.hasNext()) {
            function1.invoke(it.next());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m129210W(C40234j c40234j, AbstractC40225a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC40225a.a) {
            AbstractC40225a.a aVar = (AbstractC40225a.a) event;
            c40234j.m129199L().m1773c(aVar.getCategory(), aVar.getValue());
            c40234j.m129204Q().m129236n(new AbstractC40239o.b(aVar.getScreenId()));
        } else if (event instanceof AbstractC40225a.b) {
            AbstractC40225a.b bVar = (AbstractC40225a.b) event;
            c40234j.m129199L().m1772b(bVar.getCategory(), bVar.getValue(), bVar.getButton().getCardName());
        } else {
            if (!(event instanceof AbstractC40225a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC40225a.c cVar = (AbstractC40225a.c) event;
            c40234j.m129199L().m1775g(cVar.getCategory(), cVar.getValue());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m129211X(C40234j c40234j, InterfaceC28670t2 interfaceC28670t2, C40236l item, int i13) {
        AbstractC22676k.m65750j(item, "item");
        c40234j.m129199L().m1774e(i13, m129207T(interfaceC28670t2).m129237a().get(i13).getAnalyticsCategory(), m129207T(interfaceC28670t2).m129237a().get(i13).getAnalyticsValue());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final Function1 m129212Y(InterfaceC28670t2 interfaceC28670t2) {
        return (Function1) interfaceC28670t2.getValue();
    }

    /* JADX INFO: renamed from: Z */
    private final void m129213Z() {
        Intent intentM129203P = m129203P();
        intentM129203P.putExtra("asBrowse", true);
        intentM129203P.putExtra("bleChooseStrapDestination", "wake_your_whoop");
        this.chooseStrapLauncher.mo4052a(m129203P(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C34911a m129214a0(C40234j c40234j) {
        return AbstractC15751g.m44431K(c40234j.requireActivity());
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        m129204Q().m129236n(AbstractC40239o.g.f173968a);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C36727q(this, 25), true, -1859995550));
    }
}
