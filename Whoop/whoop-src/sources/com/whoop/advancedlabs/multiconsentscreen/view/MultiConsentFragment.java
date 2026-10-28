package com.whoop.advancedlabs.multiconsentscreen.view;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.advancedlabs.multiconsentscreen.domain.models.ConsentAction;
import fd0.AbstractC14397a;
import fd0.C14398b;
import gd0.AbstractC15711a;
import gd0.AbstractC15713c;
import gd0.C15712b;
import ge3.AbstractC15751g;
import h02.C16574h;
import h02.C16587n0;
import id0.AbstractC18409c;
import id0.C18407a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21159o0;
import java.util.Locale;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nf3.C26669a;
import or2.AbstractC28163g0;
import p000.AbstractC11266d;
import p114eb.C12962i;
import p249jc.AbstractC21598x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p602x1.C37816b;
import p708hb2.C17095c;
import p708hb2.C17098f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import pf3.C29155a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import wy1.C37696c;
import xf3.C38266c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006(²\u0006\f\u0010%\u001a\u00020$8\nX\u008a\u0084\u0002²\u0006\f\u0010'\u001a\u00020&8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/advancedlabs/multiconsentscreen/view/MultiConsentFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ll83/a0;", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lj02/o0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "getNavigator", "()Lj02/o0;", "navigator", "Lwy1/c;", "x", "I", "()Lwy1/c;", "mfaChecker", "Lid0/a;", "y", "Leb/i;", "H", "()Lid0/a;", "args", "", "z", "Z", "hasCheckedMfa", "Lgd0/b;", "viewModel", "Lgd0/c;", "viewState", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class MultiConsentFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h mfaChecker;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C12962i args;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private boolean hasCheckedMfa;

    /* JADX INFO: renamed from: com.whoop.advancedlabs.multiconsentscreen.view.MultiConsentFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.multiconsentscreen.view.MultiConsentFragment$onCreateView$1$1$1", m100430f = "MultiConsentFragment.kt", m100431l = {53}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5846a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f23034w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C14398b f23036y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC23462h f23037z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5846a(C14398b c14398b, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super C5846a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f23036y = c14398b;
            this.f23037z = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MultiConsentFragment.this.new C5846a(this.f23036y, this.f23037z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C5846a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0044  */
        /* JADX WARN: Code duplicated, block: B:18:0x0068  */
        /* JADX WARN: Code duplicated, block: B:21:0x0075 A[LOOP:0: B:17:0x0066->B:21:0x0075, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:25:0x007c  */
        /* JADX WARN: Code duplicated, block: B:29:0x0078 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:30:0x0079 A[EDGE_INSN: B:30:0x0079->B:23:0x0079 BREAK  A[LOOP:0: B:17:0x0066->B:21:0x0075], SYNTHETIC] */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String upperCase;
            ConsentAction consentAction;
            ConsentAction[] consentActionArrValues;
            int length;
            int i13;
            ConsentAction consentAction2;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.f23034w;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                if (MultiConsentFragment.this.hasCheckedMfa) {
                    String strM52951a = MultiConsentFragment.this.m17493H().m52951a();
                    AbstractC22676k.m65749i(strM52951a, "getConsentAction(...)");
                    upperCase = strM52951a.toUpperCase(Locale.ROOT);
                    AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                    consentAction = ConsentAction.SCHEDULING;
                    consentActionArrValues = ConsentAction.values();
                    length = consentActionArrValues.length;
                    i13 = 0;
                    while (true) {
                        if (i13 < length) {
                            consentAction2 = null;
                            break;
                        }
                        consentAction2 = consentActionArrValues[i13];
                        if (AbstractC22676k.m65745e(consentAction2.name(), upperCase)) {
                            break;
                        }
                        i13++;
                    }
                    if (consentAction2 != null) {
                        consentAction = consentAction2;
                    }
                    MultiConsentFragment.m17497L(this.f23037z).m44287l(new AbstractC15711a.a(consentAction, MultiConsentFragment.this.m17493H().m52952b()));
                } else {
                    C37696c c37696cM17494I = MultiConsentFragment.this.m17494I();
                    this.f23034w = 1;
                    obj = c37696cM17494I.m121138a(this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                }
                return C23454a0.f92919a;
            }
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (((Boolean) obj).booleanValue()) {
                MultiConsentFragment.this.hasCheckedMfa = true;
                this.f23036y.m41045a(AbstractC14397a.c.f52544a);
            } else {
                String strM52951a2 = MultiConsentFragment.this.m17493H().m52951a();
                AbstractC22676k.m65749i(strM52951a2, "getConsentAction(...)");
                upperCase = strM52951a2.toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                consentAction = ConsentAction.SCHEDULING;
                consentActionArrValues = ConsentAction.values();
                length = consentActionArrValues.length;
                i13 = 0;
                while (true) {
                    if (i13 < length) {
                        consentAction2 = null;
                        break;
                    }
                    consentAction2 = consentActionArrValues[i13];
                    if (AbstractC22676k.m65745e(consentAction2.name(), upperCase)) {
                        break;
                        break;
                    }
                    i13++;
                }
                if (consentAction2 != null) {
                    consentAction = consentAction2;
                }
                MultiConsentFragment.m17497L(this.f23037z).m44287l(new AbstractC15711a.a(consentAction, MultiConsentFragment.this.m17493H().m52952b()));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.multiconsentscreen.view.MultiConsentFragment$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C5847b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f23038w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23039x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23040y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f23041z;

        /* JADX INFO: renamed from: com.whoop.advancedlabs.multiconsentscreen.view.MultiConsentFragment$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f23042w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C21647a c21647a) {
                super(0);
                this.f23042w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f23042w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5847b(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f23038w = c38266c;
            this.f23039x = interfaceC35951a;
            this.f23040y = interfaceC4339a;
            this.f23041z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, gd0.b] */
        @Override // c93.InterfaceC4339a
        public final C15712b invoke() {
            return AbstractC21598x.m60668X(this.f23038w, this.f23039x, new a(this.f23041z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C15712b.class), null, this.f23040y);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.multiconsentscreen.view.MultiConsentFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5848c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23043w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23044x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23045y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5848c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23043w = componentCallbacks;
            this.f23044x = interfaceC35951a;
            this.f23045y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f23043w;
            InterfaceC35951a interfaceC35951a = this.f23044x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23045y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.multiconsentscreen.view.MultiConsentFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5849d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23046w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23047x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23048y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5849d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23046w = componentCallbacks;
            this.f23047x = interfaceC35951a;
            this.f23048y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, wy1.c] */
        @Override // c93.InterfaceC4339a
        public final C37696c invoke() {
            ComponentCallbacks componentCallbacks = this.f23046w;
            InterfaceC35951a interfaceC35951a = this.f23047x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23048y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37696c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.multiconsentscreen.view.MultiConsentFragment$e */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Leb/h;", "Args", "Landroid/os/Bundle;", "invoke", "()Landroid/os/Bundle;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5850e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f23049w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5850e(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f23049w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final Bundle invoke() {
            Bundle arguments = this.f23049w.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException(AbstractC11266d.m30463q(new StringBuilder("Fragment "), this.f23049w, " has null arguments"));
        }
    }

    public MultiConsentFragment() {
        C16587n0 c16587n0 = new C16587n0(this, 16);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C5848c(this, null, c16587n0));
        this.mfaChecker = AbstractC30060g.m92087G(enumC23463i, new C5849d(this, null, null));
        this.args = new C12962i(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C18407a.class), new C5850e(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public final C18407a m17493H() {
        return (C18407a) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public final C37696c m17494I() {
        return (C37696c) this.mfaChecker.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C34911a m17495J(MultiConsentFragment multiConsentFragment) {
        return AbstractC15751g.m44431K(multiConsentFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m17496K(MultiConsentFragment multiConsentFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i13 & 1, (i13 & 3) != 2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a0;
        }
        c28655q.m87152f0(-1688186518);
        C26669a c26669a = C29155a.f118017b;
        if (c26669a == null) {
            throw new IllegalStateException("KoinApplication has not been started");
        }
        C38266c c38266c = c26669a.f106046a.f159364d;
        C21647a c21647aM114690r = AbstractC36095b.m114690r(c28655q, -1688186210, c28655q, false, -3686552);
        boolean zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C5847b(c38266c, null, null, c21647aM114690r));
            c28655q.m87172p0(objM87133R);
        }
        c28655q.m87173q(false);
        InterfaceC23462h interfaceC23462h = (InterfaceC23462h) objM87133R;
        c28655q.m87173q(false);
        InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(m17497L(interfaceC23462h).getViewState(), AbstractC15713c.c.f59205b, null, c28655q, 48, 2);
        Object objM87133R2 = c28655q.m87133R();
        if (objM87133R2 == c28676v0) {
            objM87133R2 = new C14398b(AbstractC5583n.m16799z(multiConsentFragment), multiConsentFragment.getNavigator());
            c28655q.m87172p0(objM87133R2);
        }
        C14398b c14398b = (C14398b) objM87133R2;
        boolean zM87157i = c28655q.m87157i(multiConsentFragment) | c28655q.m87157i(c14398b) | c28655q.m87157i(interfaceC23462h);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i || objM87133R3 == c28676v0) {
            objM87133R3 = multiConsentFragment.new C5846a(c14398b, interfaceC23462h, null);
            c28655q.m87172p0(objM87133R3);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, c23454a0);
        AbstractC15713c abstractC15713cM17498M = m17498M(interfaceC28601c1M87260n);
        boolean zM87157i2 = c28655q.m87157i(c14398b) | c28655q.m87157i(interfaceC23462h);
        Object objM87133R4 = c28655q.m87133R();
        if (zM87157i2 || objM87133R4 == c28676v0) {
            objM87133R4 = new C16574h(15, c14398b, interfaceC23462h);
            c28655q.m87172p0(objM87133R4);
        }
        Function1 function1 = (Function1) objM87133R4;
        boolean zM87157i3 = c28655q.m87157i(c14398b);
        Object objM87133R5 = c28655q.m87133R();
        if (zM87157i3 || objM87133R5 == c28676v0) {
            objM87133R5 = new C17095c(c14398b, 8);
            c28655q.m87172p0(objM87133R5);
        }
        AbstractC18409c.m52956D(abstractC15713cM17498M, function1, (Function1) objM87133R5, c28655q, 0, 0);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C15712b m17497L(InterfaceC23462h interfaceC23462h) {
        return (C15712b) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: M */
    private static final AbstractC15713c m17498M(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC15713c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m17499N(C14398b c14398b, InterfaceC23462h interfaceC23462h, AbstractC15711a viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        m17497L(interfaceC23462h).m44287l(viewEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m17500O(C14398b c14398b, AbstractC14397a it) {
        AbstractC22676k.m65750j(it, "it");
        c14398b.m41045a(it);
        return C23454a0.f92919a;
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C17098f(this, 7), true, 273905075));
    }
}
