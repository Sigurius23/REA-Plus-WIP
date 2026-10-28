package com.whoop.pairing.p066ui.view;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.data.repositories.LanguageRepository;
import com.whoop.pairing.p066ui.view.PairingFragment;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21130a1;
import j02.InterfaceC21159o0;
import j22.AbstractC21256e;
import j22.AbstractC21257f;
import j22.AbstractC21261j;
import j22.C21259h;
import java.util.Locale;
import jf3.C21647a;
import js0.AbstractC21909c;
import k22.C22164d;
import k22.C22166f;
import k22.InterfaceC22165e;
import kd1.AbstractC22387b0;
import kk1.C22541b;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lc0.C23821c;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import lt2.C24738a;
import m32.EnumC25009e;
import m32.InterfaceC25007c;
import or2.AbstractC28163g0;
import or2.C28216y;
import p114eb.AbstractC12939a0;
import p114eb.C12991u0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import t83.InterfaceC33616a;
import tr2.InterfaceC34116n;
import uf3.C34911a;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0002:;B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0016\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0006R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0014\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0014\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u0014\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u0014\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u0014\u001a\u0004\b7\u00108¨\u0006>²\u0006\f\u0010=\u001a\u00020<8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/pairing/ui/view/PairingFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Lcom/whoop/pairing/ui/view/PairingFragment$b;", "J", "()Lcom/whoop/pairing/ui/view/PairingFragment$b;", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "M", "startDestination", "Lk22/f;", "x", "N", "()Lk22/f;", "viewModel", "Lj02/o0;", "y", "getNavigator", "()Lj02/o0;", "navigator", "Ljs0/c;", "z", "I", "()Ljs0/c;", "configurationRepository", "Lor2/y;", "E", "getExternalLinkNavigator", "()Lor2/y;", "externalLinkNavigator", "Lm32/c;", "F", "L", "()Lm32/c;", "permissionHelper", "Ltr2/n;", "G", "getLogger", "()Ltr2/n;", "logger", "Lcom/whoop/data/repositories/LanguageRepository;", "H", "K", "()Lcom/whoop/data/repositories/LanguageRepository;", "languageRepository", "b", "a", "Lk22/d;", "viewState", "pairing-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class PairingFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: J */
    public static final int f28234J = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h externalLinkNavigator;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h permissionHelper;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h logger;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC23462h languageRepository;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h startDestination;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C9635l(this, null, new C9634k(this), null));

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h configurationRepository;

    /* JADX INFO: renamed from: com.whoop.pairing.ui.view.PairingFragment$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/pairing/ui/view/PairingFragment$a;", "", "<init>", "()V", "Lcom/whoop/pairing/ui/view/PairingFragment$b;", "startDestination", "Landroid/os/Bundle;", "a", "(Lcom/whoop/pairing/ui/view/PairingFragment$b;)Landroid/os/Bundle;", "", "NAV_PARAM_START_DESTINATION", "Ljava/lang/String;", "pairing-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Bundle m23220a(EnumC9625b startDestination) {
            AbstractC22676k.m65750j(startDestination, "startDestination");
            Bundle bundle = new Bundle();
            bundle.putString("startDestination", startDestination.name());
            return bundle;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.pairing.ui.view.PairingFragment$b */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/pairing/ui/view/PairingFragment$b;", "", "", "route", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getRoute", "()Ljava/lang/String;", "READY_TO_PAIR_SCREEN", "SEARCHING_SCREEN", "pairing-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum EnumC9625b {
        READY_TO_PAIR_SCREEN(AbstractC21261j.f.f81164b.getRoute()),
        SEARCHING_SCREEN(AbstractC21261j.g.f81165b.getRoute());

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
        private final String route;

        EnumC9625b(String str) {
            this.route = str;
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }

        public final String getRoute() {
            return this.route;
        }
    }

    /* JADX INFO: renamed from: com.whoop.pairing.ui.view.PairingFragment$c */
    @InterfaceC32271e(m100429c = "com.whoop.pairing.ui.view.PairingFragment$onCreateView$1$3$1", m100430f = "PairingFragment.kt", m100431l = {HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9626c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f28243w;

        public C9626c(InterfaceC30057d<? super C9626c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return PairingFragment.this.new C9626c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C9626c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f28243w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC25007c interfaceC25007cM23207L = PairingFragment.this.m23207L();
                this.f28243w = 1;
                obj = InterfaceC25007c.m73347s(interfaceC25007cM23207L, false, this, 1, null);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            PairingFragment.this.m23209N().m63457t(new InterfaceC22165e.e((EnumC25009e) obj));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.pairing.ui.view.PairingFragment$d */
    @InterfaceC32271e(m100429c = "com.whoop.pairing.ui.view.PairingFragment$onCreateView$1$4$1", m100430f = "PairingFragment.kt", m100431l = {80}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9627d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f28245w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C21259h f28247y;

        /* JADX INFO: renamed from: com.whoop.pairing.ui.view.PairingFragment$d$a */
        @InterfaceC32271e(m100429c = "com.whoop.pairing.ui.view.PairingFragment$onCreateView$1$4$1$1", m100430f = "PairingFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lj22/f;", "it", "Ll83/a0;", "<anonymous>", "(Lj22/f;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f28248w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f28249x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C21259h f28250y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C21259h c21259h, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f28250y = c21259h;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f28250y, interfaceC30057d);
                aVar.f28249x = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AbstractC21257f abstractC21257f, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(abstractC21257f, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                AbstractC21257f abstractC21257f = (AbstractC21257f) this.f28249x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f28248w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                this.f28250y.m59661a(abstractC21257f);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9627d(C21259h c21259h, InterfaceC30057d<? super C9627d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f28247y = c21259h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return PairingFragment.this.new C9627d(this.f28247y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C9627d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f28245w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM63456o = PairingFragment.this.m23209N().getNavigationState();
                a aVar = new a(this.f28247y, null);
                this.f28245w = 1;
                if (AbstractC13091v.m36604n(interfaceC13058lM63456o, aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.pairing.ui.view.PairingFragment$e */
    @InterfaceC32271e(m100429c = "com.whoop.pairing.ui.view.PairingFragment$onCreateView$1$5$1", m100430f = "PairingFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9628e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f28251w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f28253y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9628e(InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super C9628e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f28253y = interfaceC28670t2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return PairingFragment.this.new C9628e(this.f28253y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C9628e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f28251w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (PairingFragment.m23213R(this.f28253y).getStartScan()) {
                PairingFragment.this.m23209N().m63457t(InterfaceC22165e.f.f85941a);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.pairing.ui.view.PairingFragment$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9629f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28254w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28255x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28256y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9629f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28254w = componentCallbacks;
            this.f28255x = interfaceC35951a;
            this.f28256y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f28254w;
            InterfaceC35951a interfaceC35951a = this.f28255x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f28256y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.pairing.ui.view.PairingFragment$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9630g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28257w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28258x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28259y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9630g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28257w = componentCallbacks;
            this.f28258x = interfaceC35951a;
            this.f28259y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, js0.c] */
        @Override // c93.InterfaceC4339a
        public final AbstractC21909c invoke() {
            ComponentCallbacks componentCallbacks = this.f28257w;
            InterfaceC35951a interfaceC35951a = this.f28258x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f28259y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC21909c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.pairing.ui.view.PairingFragment$h */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9631h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28260w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28261x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28262y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9631h(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28260w = componentCallbacks;
            this.f28261x = interfaceC35951a;
            this.f28262y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.y] */
        @Override // c93.InterfaceC4339a
        public final C28216y invoke() {
            ComponentCallbacks componentCallbacks = this.f28260w;
            InterfaceC35951a interfaceC35951a = this.f28261x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f28262y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28216y.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.pairing.ui.view.PairingFragment$i */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9632i extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28263w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28264x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28265y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9632i(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28263w = componentCallbacks;
            this.f28264x = interfaceC35951a;
            this.f28265y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, m32.c] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC25007c invoke() {
            ComponentCallbacks componentCallbacks = this.f28263w;
            InterfaceC35951a interfaceC35951a = this.f28264x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f28265y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC25007c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.pairing.ui.view.PairingFragment$j */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9633j extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28266w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28267x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28268y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9633j(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28266w = componentCallbacks;
            this.f28267x = interfaceC35951a;
            this.f28268y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.LanguageRepository, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final LanguageRepository invoke() {
            ComponentCallbacks componentCallbacks = this.f28266w;
            InterfaceC35951a interfaceC35951a = this.f28267x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f28268y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(LanguageRepository.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.pairing.ui.view.PairingFragment$k */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9634k extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28269w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9634k(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f28269w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f28269w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.pairing.ui.view.PairingFragment$l */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9635l extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28270w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28271x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28272y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f28273z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9635l(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f28270w = componentCallbacks;
            this.f28271x = interfaceC35951a;
            this.f28272y = interfaceC4339a;
            this.f28273z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, k22.f] */
        @Override // c93.InterfaceC4339a
        public final C22166f invoke() {
            return AbstractC34132o.m107857B(this.f28270w, this.f28271x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22166f.class), this.f28272y, this.f28273z);
        }
    }

    public PairingFragment() {
        final int i13 = 0;
        this.startDestination = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: m22.g

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PairingFragment f97669x;

            {
                this.f97669x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return PairingFragment.m23217V(this.f97669x);
                    case 1:
                        return PairingFragment.m23211P(this.f97669x);
                    default:
                        return PairingFragment.m23216U(this.f97669x);
                }
            }
        });
        final int i14 = 1;
        InterfaceC4339a interfaceC4339a = new InterfaceC4339a(this) { // from class: m22.g

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PairingFragment f97669x;

            {
                this.f97669x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return PairingFragment.m23217V(this.f97669x);
                    case 1:
                        return PairingFragment.m23211P(this.f97669x);
                    default:
                        return PairingFragment.m23216U(this.f97669x);
                }
            }
        };
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C9629f(this, null, interfaceC4339a));
        this.configurationRepository = AbstractC30060g.m92087G(enumC23463i, new C9630g(this, null, null));
        this.externalLinkNavigator = AbstractC30060g.m92087G(enumC23463i, new C9631h(this, null, null));
        final int i15 = 2;
        this.permissionHelper = AbstractC30060g.m92087G(enumC23463i, new C9632i(this, null, new InterfaceC4339a(this) { // from class: m22.g

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PairingFragment f97669x;

            {
                this.f97669x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return PairingFragment.m23217V(this.f97669x);
                    case 1:
                        return PairingFragment.m23211P(this.f97669x);
                    default:
                        return PairingFragment.m23216U(this.f97669x);
                }
            }
        }));
        this.logger = AbstractC30060g.m92088H(new C24738a(22));
        this.languageRepository = AbstractC30060g.m92087G(enumC23463i, new C9633j(this, null, null));
    }

    /* JADX INFO: renamed from: I */
    private final AbstractC21909c m23204I() {
        return (AbstractC21909c) this.configurationRepository.getValue();
    }

    /* JADX INFO: renamed from: J */
    private final EnumC9625b m23205J() {
        String string;
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("startDestination")) != null) {
            String upperCase = string.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            EnumC9625b enumC9625bValueOf = EnumC9625b.valueOf(upperCase);
            if (enumC9625bValueOf != null) {
                return enumC9625bValueOf;
            }
        }
        return EnumC9625b.READY_TO_PAIR_SCREEN;
    }

    /* JADX INFO: renamed from: K */
    private final LanguageRepository m23206K() {
        return (LanguageRepository) this.languageRepository.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public final InterfaceC25007c m23207L() {
        return (InterfaceC25007c) this.permissionHelper.getValue();
    }

    /* JADX INFO: renamed from: M */
    private final EnumC9625b m23208M() {
        return (EnumC9625b) this.startDestination.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public final C22166f m23209N() {
        return (C22166f) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final InterfaceC34116n m23210O() {
        return InterfaceC34116n.INSTANCE.m107848a("PairingFragment");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C34911a m23211P(PairingFragment pairingFragment) {
        return AbstractC15751g.m44431K(pairingFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m23212Q(PairingFragment pairingFragment, Composer composer, int i13) {
        PairingFragment pairingFragment2;
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i13 & 1, (i13 & 3) != 2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a0;
        }
        C12991u0 c12991u0M58963a = AbstractC21130a1.m58963a("PairingNavHost", null, c28655q, 6, 2);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = AbstractC5583n.m16799z(pairingFragment);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC12939a0 abstractC12939a0 = (AbstractC12939a0) objM87133R;
        Object objM87133R2 = c28655q.m87133R();
        if (objM87133R2 == c28676v0) {
            pairingFragment2 = pairingFragment;
            objM87133R2 = new C21259h(pairingFragment2, c12991u0M58963a, abstractC12939a0, pairingFragment.getExternalLinkNavigator(), pairingFragment.m23204I(), pairingFragment.m23206K());
            c28655q.m87172p0(objM87133R2);
        } else {
            pairingFragment2 = pairingFragment;
        }
        C21259h c21259h = (C21259h) objM87133R2;
        InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(pairingFragment2.m23209N().getViewState(), new C22164d(false, null, false, false, null, 0, 63, null), null, c28655q, 0, 2);
        String route = pairingFragment2.m23208M().getRoute();
        C22164d c22164dM23213R = m23213R(interfaceC28601c1M87260n);
        boolean zM87157i = c28655q.m87157i(pairingFragment2);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i || objM87133R3 == c28676v0) {
            objM87133R3 = new C23821c(pairingFragment2, 10);
            c28655q.m87172p0(objM87133R3);
        }
        Function1 function1 = (Function1) objM87133R3;
        boolean zM87157i2 = c28655q.m87157i(c21259h);
        Object objM87133R4 = c28655q.m87133R();
        if (zM87157i2 || objM87133R4 == c28676v0) {
            objM87133R4 = new C23821c(c21259h, 11);
            c28655q.m87172p0(objM87133R4);
        }
        AbstractC21256e.m59602E(route, c12991u0M58963a, c22164dM23213R, function1, (Function1) objM87133R4, c28655q, 0);
        boolean zM87157i3 = c28655q.m87157i(pairingFragment2);
        Object objM87133R5 = c28655q.m87133R();
        if (zM87157i3 || objM87133R5 == c28676v0) {
            objM87133R5 = pairingFragment2.new C9626c(null);
            c28655q.m87172p0(objM87133R5);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, c23454a0);
        boolean zM87157i4 = c28655q.m87157i(pairingFragment2) | c28655q.m87157i(c21259h);
        Object objM87133R6 = c28655q.m87133R();
        if (zM87157i4 || objM87133R6 == c28676v0) {
            objM87133R6 = pairingFragment2.new C9627d(c21259h, null);
            c28655q.m87172p0(objM87133R6);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, c23454a0);
        Boolean boolValueOf = Boolean.valueOf(m23213R(interfaceC28601c1M87260n).getStartScan());
        boolean zM87153g = c28655q.m87153g(interfaceC28601c1M87260n) | c28655q.m87157i(pairingFragment2);
        Object objM87133R7 = c28655q.m87133R();
        if (zM87153g || objM87133R7 == c28676v0) {
            objM87133R7 = pairingFragment2.new C9628e(interfaceC28601c1M87260n, null);
            c28655q.m87172p0(objM87133R7);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R7, boolValueOf);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C22164d m23213R(InterfaceC28670t2 interfaceC28670t2) {
        return (C22164d) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m23214S(PairingFragment pairingFragment, InterfaceC22165e it) {
        AbstractC22676k.m65750j(it, "it");
        pairingFragment.m23209N().m63457t(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m23215T(C21259h c21259h, AbstractC21257f it) {
        AbstractC22676k.m65750j(it, "it");
        c21259h.m59661a(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C34911a m23216U(PairingFragment pairingFragment) {
        return AbstractC15751g.m44431K(pairingFragment.requireActivity().getActivityResultRegistry());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final EnumC9625b m23217V(PairingFragment pairingFragment) {
        return pairingFragment.m23205J();
    }

    private final C28216y getExternalLinkNavigator() {
        return (C28216y) this.externalLinkNavigator.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
        getLifecycle().mo4986a(m23207L());
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C22541b(this, 26), true, -1079560292));
    }
}
