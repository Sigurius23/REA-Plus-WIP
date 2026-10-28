package com.whoop.bot.view;

import ad3.AbstractC0757c;
import ad3.C0755b;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.bot.view.AiConversationFragment;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ge3.AbstractC15751g;
import hj0.C17359r;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j11.AbstractC21211n;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import kh2.AbstractC22486a;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m32.InterfaceC25005a;
import m32.InterfaceC25007c;
import m83.C25272z;
import ml0.AbstractC25669a;
import ml0.C25671c;
import nl0.AbstractC26802d;
import nl0.C26803e;
import nl0.C26804f;
import o01.EnumC27349e;
import or2.AbstractC28163g0;
import or2.C28180m;
import p007a6.InterfaceC0422g;
import p138f6.C14132d;
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
import p734sl0.AbstractC32635l0;
import p734sl0.AbstractC32662q2;
import p734sl0.AbstractC32679u0;
import p734sl0.C32580a0;
import p734sl0.C32605f0;
import p734sl0.C32609g;
import p734sl0.C32625j0;
import p734sl0.C32645n0;
import p734sl0.Function2;
import p734sl0.InterfaceC32647n2;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import uf3.C34911a;
import vf3.C35953c;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;
import wk0.AbstractC37336b;
import xk0.C38423a;
import xk0.C38424b;
import z92.InterfaceC40205a;
import zr2.InterfaceC41070a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u0010\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u001b*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020!0 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u0004\u0018\u00010\u001e2\u0006\u0010$\u001a\u00020\u001eH\u0002¢\u0006\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001b\u00100\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010)\u001a\u0004\b3\u00104R\u001b\u0010:\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010)\u001a\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010)\u001a\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010)\u001a\u0004\bB\u0010CR\u001b\u0010I\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010)\u001a\u0004\bG\u0010HR\u001b\u0010N\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010)\u001a\u0004\bL\u0010MR!\u0010T\u001a\b\u0012\u0004\u0012\u00020P0O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010)\u001a\u0004\bR\u0010SR\u001b\u0010Y\u001a\u00020U8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010)\u001a\u0004\bW\u0010XR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u001b\u0010b\u001a\u00020^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010)\u001a\u0004\b`\u0010a¨\u0006f²\u0006\f\u0010d\u001a\u00020c8\nX\u008a\u0084\u0002²\u0006\u0010\u0010e\u001a\u0004\u0018\u00010\u00158\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lcom/whoop/bot/view/AiConversationFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "", "F0", "(Lq83/d;)Ljava/lang/Object;", "shouldRequestPermissions", "c0", "(ZLq83/d;)Ljava/lang/Object;", "Lsl0/n0;", "g0", "(Landroid/os/Bundle;)Lsl0/n0;", "", "argsString", "", "Lkotlinx/serialization/json/JsonElement;", "E0", "(Ljava/lang/String;)Ljava/util/Map;", "message", "i0", "(Ljava/lang/String;)Ljava/lang/String;", "Lml0/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "e0", "()Lml0/c;", "aiConversationNavigationRouter", "x", "f0", "()Lsl0/n0;", "aiConversationScreenArgs", "Lnl0/e;", "y", "p0", "()Lnl0/e;", "viewModel", "Lxk0/a;", "z", "getAnalyticsHelper", "()Lxk0/a;", "analyticsHelper", "Lm32/a;", "E", "n0", "()Lm32/a;", "permissionChecker", "Lm32/c;", "F", "m0", "()Lm32/c;", "locationPermissionHelper", "Lz92/a;", "G", "o0", "()Lz92/a;", "userInfoAccessor", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "H", "l0", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "La6/g;", "Lf6/f;", "I", "j0", "()La6/g;", "dataStore", "Lzr2/a;", "J", "k0", "()Lzr2/a;", "dateAndTimeProvider", "Ltr2/n;", "K", "Ltr2/n;", "logger", "Lxk0/b;", "L", "h0", "()Lxk0/b;", "analyticsTracker", "Lnl0/f;", "viewState", "showPermissionsDisclaimerModal", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AiConversationFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h permissionChecker;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h locationPermissionHelper;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h userInfoAccessor;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC23462h dataStore;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC23462h dateAndTimeProvider;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsTracker;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h aiConversationNavigationRouter;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h aiConversationScreenArgs;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: com.whoop.bot.view.AiConversationFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.AiConversationFragment", m100430f = "AiConversationFragment.kt", m100431l = {196, 198}, m100432m = "checkPermissionsAndStartConversation", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6079a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        boolean f24149w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f24150x;

        /* JADX INFO: renamed from: z */
        int f24152z;

        public C6079a(InterfaceC30057d<? super C6079a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f24150x = obj;
            this.f24152z |= Integer.MIN_VALUE;
            return AiConversationFragment.this.m18270c0(false, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.bot.view.AiConversationFragment$b */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.AiConversationFragment$onCreateView$1$1$1", m100430f = "AiConversationFragment.kt", m100431l = {114}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6080b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f24153w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f24155y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6080b(InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super C6080b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f24155y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return AiConversationFragment.this.new C6080b(this.f24155y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C6080b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f24153w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (AiConversationFragment.this.m18279l0().isFeatureEnabled("whoop-coach-weather-gps-android") && AbstractC22676k.m65745e(AiConversationFragment.m18291x0(this.f24155y), Boolean.FALSE)) {
                    AiConversationFragment aiConversationFragment = AiConversationFragment.this;
                    this.f24153w = 1;
                    if (AiConversationFragment.m18271d0(aiConversationFragment, false, this, 1, null) == enumC31071a) {
                        return enumC31071a;
                    }
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

    /* JADX INFO: renamed from: com.whoop.bot.view.AiConversationFragment$c */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.AiConversationFragment$onCreateView$1$10$1$1", m100430f = "AiConversationFragment.kt", m100431l = {170, 172}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6081c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f24156w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f24158y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6081c(InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super C6081c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f24158y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return AiConversationFragment.this.new C6081c(this.f24158y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C6081c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
            if (r6.m18270c0(true, r5) == r0) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r5.f24156w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r6)
                goto L46
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L34
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                com.whoop.bot.view.AiConversationFragment r6 = com.whoop.bot.view.AiConversationFragment.this
                a6.g r6 = com.whoop.bot.view.AiConversationFragment.m18259R(r6)
                f6.d r1 = p734sl0.AbstractC32635l0.m101921a()
                r5.f24156w = r3
                java.lang.String r4 = "true"
                java.lang.Object r6 = kh2.AbstractC22486a.m64987c(r6, r1, r4, r5)
                if (r6 != r0) goto L34
                goto L45
            L34:
                p1.c1 r6 = r5.f24158y
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                com.whoop.bot.view.AiConversationFragment.m18264W(r6, r1)
                com.whoop.bot.view.AiConversationFragment r6 = com.whoop.bot.view.AiConversationFragment.this
                r5.f24156w = r2
                java.lang.Object r6 = com.whoop.bot.view.AiConversationFragment.m18256O(r6, r3, r5)
                if (r6 != r0) goto L46
            L45:
                return r0
            L46:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.bot.view.AiConversationFragment.C6081c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.bot.view.AiConversationFragment$d */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.AiConversationFragment$onCreateView$1$2$1", m100430f = "AiConversationFragment.kt", m100431l = {118}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6082d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f24159w;

        /* JADX INFO: renamed from: x */
        int f24160x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f24162z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6082d(InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super C6082d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f24162z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return AiConversationFragment.this.new C6082d(this.f24162z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C6082d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC28601c1 interfaceC28601c1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f24160x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC28601c1 interfaceC28601c2 = this.f24162z;
                AiConversationFragment aiConversationFragment = AiConversationFragment.this;
                this.f24159w = interfaceC28601c2;
                this.f24160x = 1;
                Object objM18246F0 = aiConversationFragment.m18246F0(this);
                if (objM18246F0 == enumC31071a) {
                    return enumC31071a;
                }
                interfaceC28601c1 = interfaceC28601c2;
                obj = objM18246F0;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC28601c1 = (InterfaceC28601c1) this.f24159w;
                AbstractC34132o.m107864I(obj);
            }
            AiConversationFragment.m18293y0(interfaceC28601c1, (Boolean) obj);
            if (!AiConversationFragment.this.m18279l0().isFeatureEnabled("whoop-coach-weather-gps-android")) {
                AiConversationFragment.this.m18283p0().mo1216g(new AbstractC26802d.h(AiConversationFragment.this.m18273f0().getContextualMessage(), AiConversationFragment.this.m18273f0().getConversationIdSeed(), AiConversationFragment.this.m18273f0().getSourceType(), AiConversationFragment.this.m18273f0().getPresetQuestion(), AiConversationFragment.this.m18273f0().getIncludeInitialMessage(), false, AiConversationFragment.this.m18273f0().getSourceId(), AiConversationFragment.this.m18273f0().m102016a(), 32, null));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.bot.view.AiConversationFragment$e */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.AiConversationFragment$onCreateView$1$3$1$1$1", m100430f = "AiConversationFragment.kt", m100431l = {154}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6083e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28670t2 f24163E;

        /* JADX INFO: renamed from: w */
        Object f24164w;

        /* JADX INFO: renamed from: x */
        int f24165x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC32662q2 f24166y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AiConversationFragment f24167z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6083e(AbstractC32662q2 abstractC32662q2, AiConversationFragment aiConversationFragment, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super C6083e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f24166y = abstractC32662q2;
            this.f24167z = aiConversationFragment;
            this.f24163E = interfaceC28670t2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C6083e(this.f24166y, this.f24167z, this.f24163E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C6083e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f24165x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                String str = this.f24166y instanceof AbstractC32662q2.a ? "camera" : "picker";
                C38423a analyticsHelper = this.f24167z.getAnalyticsHelper();
                String strM79882e = AiConversationFragment.m18286s0(this.f24163E).getConversation().getId();
                this.f24164w = null;
                this.f24165x = 1;
                if (analyticsHelper.m123061P(strM79882e, str, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.bot.view.AiConversationFragment$f */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.AiConversationFragment$onCreateView$1$9$1$1", m100430f = "AiConversationFragment.kt", m100431l = {177, 179}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6084f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f24168w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f24170y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6084f(InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super C6084f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f24170y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return AiConversationFragment.this.new C6084f(this.f24170y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C6084f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        
            if (com.whoop.bot.view.AiConversationFragment.m18271d0(r6, false, r5, 1, null) == r0) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r5.f24168w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r6)
                goto L48
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L34
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                com.whoop.bot.view.AiConversationFragment r6 = com.whoop.bot.view.AiConversationFragment.this
                a6.g r6 = com.whoop.bot.view.AiConversationFragment.m18259R(r6)
                f6.d r1 = p734sl0.AbstractC32635l0.m101921a()
                r5.f24168w = r3
                java.lang.String r4 = "true"
                java.lang.Object r6 = kh2.AbstractC22486a.m64987c(r6, r1, r4, r5)
                if (r6 != r0) goto L34
                goto L47
            L34:
                p1.c1 r6 = r5.f24170y
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                com.whoop.bot.view.AiConversationFragment.m18264W(r6, r1)
                com.whoop.bot.view.AiConversationFragment r6 = com.whoop.bot.view.AiConversationFragment.this
                r5.f24168w = r2
                r1 = 0
                r2 = 0
                java.lang.Object r6 = com.whoop.bot.view.AiConversationFragment.m18271d0(r6, r1, r5, r3, r2)
                if (r6 != r0) goto L48
            L47:
                return r0
            L48:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.bot.view.AiConversationFragment.C6084f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.bot.view.AiConversationFragment$g */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.AiConversationFragment", m100430f = "AiConversationFragment.kt", m100431l = {189}, m100432m = "shouldShowPermissionDisclaimerModal", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6085g extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        boolean f24171w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f24172x;

        /* JADX INFO: renamed from: z */
        int f24174z;

        public C6085g(InterfaceC30057d<? super C6085g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f24172x = obj;
            this.f24174z |= Integer.MIN_VALUE;
            return AiConversationFragment.this.m18246F0(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.bot.view.AiConversationFragment$h */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6086h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24175w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24176x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24177y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6086h(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24175w = componentCallbacks;
            this.f24176x = interfaceC35951a;
            this.f24177y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ml0.c] */
        @Override // c93.InterfaceC4339a
        public final C25671c invoke() {
            ComponentCallbacks componentCallbacks = this.f24175w;
            InterfaceC35951a interfaceC35951a = this.f24176x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24177y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25671c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.bot.view.AiConversationFragment$i */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6087i extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24178w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24179x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24180y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6087i(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24178w = componentCallbacks;
            this.f24179x = interfaceC35951a;
            this.f24180y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, xk0.a] */
        @Override // c93.InterfaceC4339a
        public final C38423a invoke() {
            ComponentCallbacks componentCallbacks = this.f24178w;
            InterfaceC35951a interfaceC35951a = this.f24179x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24180y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38423a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.bot.view.AiConversationFragment$j */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6088j extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24181w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24182x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24183y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6088j(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24181w = componentCallbacks;
            this.f24182x = interfaceC35951a;
            this.f24183y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, m32.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC25005a invoke() {
            ComponentCallbacks componentCallbacks = this.f24181w;
            InterfaceC35951a interfaceC35951a = this.f24182x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24183y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC25005a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.bot.view.AiConversationFragment$k */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6089k extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24184w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24185x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24186y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6089k(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24184w = componentCallbacks;
            this.f24185x = interfaceC35951a;
            this.f24186y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, m32.c] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC25007c invoke() {
            ComponentCallbacks componentCallbacks = this.f24184w;
            InterfaceC35951a interfaceC35951a = this.f24185x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24186y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC25007c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.bot.view.AiConversationFragment$l */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6090l extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24187w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24188x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24189y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6090l(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24187w = componentCallbacks;
            this.f24188x = interfaceC35951a;
            this.f24189y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, z92.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC40205a invoke() {
            ComponentCallbacks componentCallbacks = this.f24187w;
            InterfaceC35951a interfaceC35951a = this.f24188x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24189y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC40205a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.bot.view.AiConversationFragment$m */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6091m extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24190w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24191x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24192y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6091m(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24190w = componentCallbacks;
            this.f24191x = interfaceC35951a;
            this.f24192y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f24190w;
            InterfaceC35951a interfaceC35951a = this.f24191x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24192y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.bot.view.AiConversationFragment$n */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6092n extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24193w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24194x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24195y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6092n(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24193w = componentCallbacks;
            this.f24194x = interfaceC35951a;
            this.f24195y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [a6.g, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC0422g invoke() {
            ComponentCallbacks componentCallbacks = this.f24193w;
            InterfaceC35951a interfaceC35951a = this.f24194x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24195y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC0422g.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.bot.view.AiConversationFragment$o */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6093o extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24196w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24197x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24198y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6093o(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24196w = componentCallbacks;
            this.f24197x = interfaceC35951a;
            this.f24198y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, zr2.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC41070a invoke() {
            ComponentCallbacks componentCallbacks = this.f24196w;
            InterfaceC35951a interfaceC35951a = this.f24197x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24198y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC41070a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.bot.view.AiConversationFragment$p */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6094p extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24199w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6094p(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f24199w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f24199w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.bot.view.AiConversationFragment$q */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6095q extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24200w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24201x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24202y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f24203z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6095q(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f24200w = componentCallbacks;
            this.f24201x = interfaceC35951a;
            this.f24202y = interfaceC4339a;
            this.f24203z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, nl0.e] */
        @Override // c93.InterfaceC4339a
        public final C26803e invoke() {
            return AbstractC34132o.m107857B(this.f24200w, this.f24201x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C26803e.class), this.f24202y, this.f24203z);
        }
    }

    public AiConversationFragment() {
        C32605f0 c32605f0 = new C32605f0(this, 0);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.aiConversationNavigationRouter = AbstractC30060g.m92087G(enumC23463i, new C6086h(this, null, c32605f0));
        EnumC23463i enumC23463i2 = EnumC23463i.f92935y;
        this.aiConversationScreenArgs = AbstractC30060g.m92087G(enumC23463i2, new C32605f0(this, 2));
        this.viewModel = AbstractC30060g.m92087G(enumC23463i2, new C6095q(this, null, new C6094p(this), new C32605f0(this, 3)));
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C6087i(this, null, new C32605f0(this, 4)));
        this.permissionChecker = AbstractC30060g.m92087G(enumC23463i, new C6088j(this, null, null));
        this.locationPermissionHelper = AbstractC30060g.m92087G(enumC23463i, new C6089k(this, new C35953c("location-permission-helper"), new C32605f0(this, 5)));
        this.userInfoAccessor = AbstractC30060g.m92087G(enumC23463i, new C6090l(this, null, null));
        this.featureFlagChecker = AbstractC30060g.m92087G(enumC23463i, new C6091m(this, null, null));
        this.dataStore = AbstractC30060g.m92087G(enumC23463i, new C6092n(this, null, null));
        this.dateAndTimeProvider = AbstractC30060g.m92087G(enumC23463i, new C6093o(this, null, null));
        this.logger = InterfaceC34116n.INSTANCE.m107848a("AiConversationFragment");
        this.analyticsTracker = AbstractC30060g.m92088H(new C32605f0(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final C23454a0 m18236A0(AiConversationFragment aiConversationFragment, AbstractC26802d it) {
        AbstractC22676k.m65750j(it, "it");
        aiConversationFragment.m18283p0().mo1216g(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final C23454a0 m18238B0(AiConversationFragment aiConversationFragment, AbstractC25669a it) {
        AbstractC22676k.m65750j(it, "it");
        aiConversationFragment.m18272e0().m75588c(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final C23454a0 m18240C0(AiConversationFragment aiConversationFragment) {
        AbstractC28163g0.m85259o(aiConversationFragment).m85343i();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final C34911a m18242D0(AiConversationFragment aiConversationFragment) {
        return AbstractC15751g.m44431K(aiConversationFragment.m18273f0().getSourcePillar(), aiConversationFragment.m18273f0().getSourceType(), aiConversationFragment.m18273f0().getPresetQuestion(), aiConversationFragment.m18273f0().getSourceId(), aiConversationFragment.m18273f0().getSource());
    }

    /* JADX INFO: renamed from: E0 */
    private final Map<String, JsonElement> m18244E0(String argsString) {
        C25272z c25272z = C25272z.f99163w;
        if (argsString != null && argsString.length() != 0) {
            try {
                String strDecode = URLDecoder.decode(argsString, "UTF-8");
                C0755b c0755b = AbstractC0757c.f2762d;
                AbstractC22676k.m65747g(strDecode);
                c0755b.getClass();
                return (Map) c0755b.m1831b(new LinkedHashMapSerializer(StringSerializer.INSTANCE, JsonElement.Companion.serializer()), strDecode);
            } catch (Exception unused) {
            }
        }
        return c25272z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: F0 */
    public final Object m18246F0(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        C6085g c6085g;
        if (interfaceC30057d instanceof C6085g) {
            c6085g = (C6085g) interfaceC30057d;
            int i13 = c6085g.f24174z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c6085g.f24174z = i13 - Integer.MIN_VALUE;
            } else {
                c6085g = new C6085g(interfaceC30057d);
            }
        } else {
            c6085g = new C6085g(interfaceC30057d);
        }
        Object objM64985a = c6085g.f24172x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c6085g.f24174z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM64985a);
            boolean zMo73346a = m18281n0().mo73346a("android.permission.ACCESS_COARSE_LOCATION");
            if (zMo73346a) {
                return Boolean.FALSE;
            }
            InterfaceC0422g interfaceC0422gM18277j0 = m18277j0();
            C14132d c14132dM101921a = AbstractC32635l0.m101921a();
            c6085g.f24171w = zMo73346a;
            c6085g.f24174z = 1;
            objM64985a = AbstractC22486a.m64985a(interfaceC0422gM18277j0, c14132dM101921a, c6085g);
            if (objM64985a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM64985a);
        }
        return Boolean.valueOf(!((Boolean) objM64985a).booleanValue() && m18279l0().isFeatureEnabled("whoop-coach-weather-gps-android"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final C34911a m18248G0(AiConversationFragment aiConversationFragment) {
        return AbstractC15751g.m44431K(aiConversationFragment.m18273f0(), new C28180m(null, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C34911a m18266Y(AiConversationFragment aiConversationFragment) {
        return AbstractC15751g.m44431K(aiConversationFragment.requireActivity(), AbstractC5583n.m16799z(aiConversationFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C32645n0 m18267Z(AiConversationFragment aiConversationFragment) {
        return aiConversationFragment.m18274g0(aiConversationFragment.getArguments());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C34911a m18268a0(AiConversationFragment aiConversationFragment) {
        return AbstractC15751g.m44431K(aiConversationFragment.m18273f0().getSourcePillar(), aiConversationFragment.m18273f0().getSourceType(), aiConversationFragment.m18273f0().getPresetQuestion(), aiConversationFragment.m18273f0().getSourceId(), aiConversationFragment.m18273f0().getSource());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C38424b m18269b0(AiConversationFragment aiConversationFragment) {
        return new C38424b(aiConversationFragment.m18283p0().getViewState(), aiConversationFragment.getAnalyticsHelper(), aiConversationFragment.m18278k0(), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
    
        if (r1 == r4) goto L35;
     */
    /* JADX INFO: renamed from: c0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m18270c0(boolean r19, q83.InterfaceC30057d<? super l83.C23454a0> r20) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.bot.view.AiConversationFragment.m18270c0(boolean, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ Object m18271d0(AiConversationFragment aiConversationFragment, boolean z4, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = false;
        }
        return aiConversationFragment.m18270c0(z4, interfaceC30057d);
    }

    /* JADX INFO: renamed from: e0 */
    private final C25671c m18272e0() {
        return (C25671c) this.aiConversationNavigationRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public final C32645n0 m18273f0() {
        return (C32645n0) this.aiConversationScreenArgs.getValue();
    }

    /* JADX INFO: renamed from: g0 */
    private final C32645n0 m18274g0(Bundle bundle) {
        if (bundle == null) {
            return new C32645n0(null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, false, 262143, null);
        }
        EnumC27349e enumC27349eM82522a = EnumC27349e.INSTANCE.m82522a(bundle.getString("suggestion"));
        String string = bundle.getString("hint");
        if (string == null) {
            string = "";
        }
        String string2 = bundle.getString("contextualMessage");
        if (string2 == null) {
            string2 = "";
        }
        String strM18276i0 = m18276i0(string2);
        String string3 = bundle.getString("conversationIdSeed");
        if (string3 == null) {
            string3 = "";
        }
        String string4 = bundle.getString("sourcePillar");
        if (string4 == null) {
            string4 = "";
        }
        String string5 = bundle.getString("sourceType");
        if (string5 == null) {
            string5 = "";
        }
        String string6 = bundle.getString("presetQuestion");
        boolean z4 = bundle.getBoolean("includeInitialMessage");
        String string7 = bundle.getString("sourceId");
        String str = string7 == null ? "" : string7;
        Map<String, JsonElement> mapM18244E0 = m18244E0(bundle.getString("args"));
        String string8 = bundle.getString("source");
        return new C32645n0(enumC27349eM82522a, string, strM18276i0, string3, null, string4, string5, string6, null, z4, str, mapM18244E0, string8 == null ? "" : string8, false, null, null, null, false, 254224, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C38423a getAnalyticsHelper() {
        return (C38423a) this.analyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: h0 */
    private final C38424b m18275h0() {
        return (C38424b) this.analyticsTracker.getValue();
    }

    /* JADX INFO: renamed from: i0 */
    private final String m18276i0(String message) {
        if (AbstractC22676k.m65745e(message, "")) {
            return null;
        }
        return message;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public final InterfaceC0422g m18277j0() {
        return (InterfaceC0422g) this.dataStore.getValue();
    }

    /* JADX INFO: renamed from: k0 */
    private final InterfaceC41070a m18278k0() {
        return (InterfaceC41070a) this.dateAndTimeProvider.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public final FeatureFlagChecker m18279l0() {
        return (FeatureFlagChecker) this.featureFlagChecker.getValue();
    }

    /* JADX INFO: renamed from: m0 */
    private final InterfaceC25007c m18280m0() {
        return (InterfaceC25007c) this.locationPermissionHelper.getValue();
    }

    /* JADX INFO: renamed from: n0 */
    private final InterfaceC25005a m18281n0() {
        return (InterfaceC25005a) this.permissionChecker.getValue();
    }

    /* JADX INFO: renamed from: o0 */
    private final InterfaceC40205a m18282o0() {
        return (InterfaceC40205a) this.userInfoAccessor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public final C26803e m18283p0() {
        return (C26803e) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final C34911a m18284q0(AiConversationFragment aiConversationFragment) {
        return AbstractC15751g.m44431K(aiConversationFragment.requireActivity().getActivityResultRegistry(), AbstractC37056f.m118958J("android.permission.ACCESS_COARSE_LOCATION"), "aiConversationFragment");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C23454a0 m18285r0(final AiConversationFragment aiConversationFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i13 & 1, (i13 & 3) != 2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a0;
        }
        final InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(aiConversationFragment.m18283p0().getViewState(), new C26804f(0, null, false, false, null, null, null, null, null, false, null, null, false, false, null, null, false, false, null, null, 1048575, null), null, c28655q, 0, 2);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = AbstractC28683x.m87272z(null);
            c28655q.m87172p0(objM87133R);
        }
        final InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
        Object objM87133R2 = c28655q.m87133R();
        if (objM87133R2 == c28676v0) {
            objM87133R2 = AbstractC28683x.m87262p(c28655q);
            c28655q.m87172p0(objM87133R2);
        }
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
        Boolean boolM18291x0 = m18291x0(interfaceC28601c1);
        boolean zM87157i = c28655q.m87157i(aiConversationFragment);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i || objM87133R3 == c28676v0) {
            objM87133R3 = aiConversationFragment.new C6080b(interfaceC28601c1, null);
            c28655q.m87172p0(objM87133R3);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, boolM18291x0);
        boolean zM87157i2 = c28655q.m87157i(aiConversationFragment);
        Object objM87133R4 = c28655q.m87133R();
        if (zM87157i2 || objM87133R4 == c28676v0) {
            objM87133R4 = aiConversationFragment.new C6082d(interfaceC28601c1, null);
            c28655q.m87172p0(objM87133R4);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, c23454a0);
        C26804f c26804fM18286s0 = m18286s0(interfaceC28601c1M87260n);
        String sourceType = aiConversationFragment.m18273f0().getSourceType();
        boolean zM87157i3 = c28655q.m87157i(aiConversationFragment) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87153g(interfaceC28601c1M87260n);
        Object objM87133R5 = c28655q.m87133R();
        if (zM87157i3 || objM87133R5 == c28676v0) {
            objM87133R5 = new C32625j0(aiConversationFragment, interfaceC2994c0, interfaceC28601c1M87260n, 0);
            c28655q.m87172p0(objM87133R5);
        }
        InterfaceC32647n2 interfaceC32647n2M102168h = Function2.m102168h((InterfaceC4351m) objM87133R5, c28655q, 0);
        boolean zM87157i4 = c28655q.m87157i(aiConversationFragment);
        Object objM87133R6 = c28655q.m87133R();
        if (zM87157i4 || objM87133R6 == c28676v0) {
            final int i14 = 1;
            objM87133R6 = new Function1(aiConversationFragment) { // from class: sl0.g0

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ AiConversationFragment f135166x;

                {
                    this.f135166x = aiConversationFragment;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i14) {
                        case 0:
                            return AiConversationFragment.m18238B0(this.f135166x, (AbstractC25669a) obj);
                        default:
                            return AiConversationFragment.m18236A0(this.f135166x, (AbstractC26802d) obj);
                    }
                }
            };
            c28655q.m87172p0(objM87133R6);
        }
        Function1 function1 = (Function1) objM87133R6;
        boolean zM87157i5 = c28655q.m87157i(aiConversationFragment);
        Object objM87133R7 = c28655q.m87133R();
        if (zM87157i5 || objM87133R7 == c28676v0) {
            final int i15 = 0;
            objM87133R7 = new Function1(aiConversationFragment) { // from class: sl0.g0

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ AiConversationFragment f135166x;

                {
                    this.f135166x = aiConversationFragment;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i15) {
                        case 0:
                            return AiConversationFragment.m18238B0(this.f135166x, (AbstractC25669a) obj);
                        default:
                            return AiConversationFragment.m18236A0(this.f135166x, (AbstractC26802d) obj);
                    }
                }
            };
            c28655q.m87172p0(objM87133R7);
        }
        Function1 function2 = (Function1) objM87133R7;
        boolean zM87157i6 = c28655q.m87157i(aiConversationFragment);
        Object objM87133R8 = c28655q.m87133R();
        if (zM87157i6 || objM87133R8 == c28676v0) {
            objM87133R8 = new C32605f0(aiConversationFragment, 1);
            c28655q.m87172p0(objM87133R8);
        }
        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R8;
        boolean zM87157i7 = c28655q.m87157i(aiConversationFragment) | c28655q.m87153g(interfaceC28601c1M87260n);
        Object objM87133R9 = c28655q.m87133R();
        if (zM87157i7 || objM87133R9 == c28676v0) {
            objM87133R9 = new InterfaceC4351m() { // from class: sl0.h0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    return AiConversationFragment.m18287t0(this.f135192w, interfaceC28601c1M87260n, (C38423a.a) obj, zBooleanValue);
                }
            };
            c28655q.m87172p0(objM87133R9);
        }
        InterfaceC4351m interfaceC4351m = (InterfaceC4351m) objM87133R9;
        boolean zM87157i8 = c28655q.m87157i(aiConversationFragment) | c28655q.m87153g(interfaceC28601c1M87260n);
        Object objM87133R10 = c28655q.m87133R();
        if (zM87157i8 || objM87133R10 == c28676v0) {
            objM87133R10 = new C32580a0(5, aiConversationFragment, interfaceC28601c1M87260n);
            c28655q.m87172p0(objM87133R10);
        }
        AbstractC32679u0.m102395q0(c26804fM18286s0, function1, sourceType, interfaceC32647n2M102168h, function2, interfaceC4339a, interfaceC4351m, false, null, (InterfaceC4339a) objM87133R10, false, c28655q, 0, 0, 1408);
        if (!AbstractC22676k.m65745e(m18291x0(interfaceC28601c1), Boolean.TRUE)) {
            c28655q.m87150e0(-436160037);
            c28655q.m87173q(false);
            return c23454a0;
        }
        c28655q.m87150e0(-437230901);
        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC37336b.f159691r);
        TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC37336b.f159685o);
        TextResource.C8688b c8688bM21277k3 = AbstractC8693b.m21277k(AbstractC37336b.f159687p);
        TextResource.C8688b c8688bM21277k4 = AbstractC8693b.m21277k(AbstractC37336b.f159689q);
        boolean zM87157i9 = c28655q.m87157i(aiConversationFragment);
        Object objM87133R11 = c28655q.m87133R();
        if (zM87157i9 || objM87133R11 == c28676v0) {
            final int i16 = 0;
            objM87133R11 = new InterfaceC4339a(aiConversationFragment) { // from class: sl0.i0

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ AiConversationFragment f135212x;

                {
                    this.f135212x = aiConversationFragment;
                }

                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i16) {
                        case 0:
                            return AiConversationFragment.m18289v0(this.f135212x, interfaceC28601c1);
                        default:
                            return AiConversationFragment.m18290w0(this.f135212x, interfaceC28601c1);
                    }
                }
            };
            c28655q.m87172p0(objM87133R11);
        }
        InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R11;
        boolean zM87157i10 = c28655q.m87157i(aiConversationFragment);
        Object objM87133R12 = c28655q.m87133R();
        if (zM87157i10 || objM87133R12 == c28676v0) {
            final int i17 = 1;
            objM87133R12 = new InterfaceC4339a(aiConversationFragment) { // from class: sl0.i0

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ AiConversationFragment f135212x;

                {
                    this.f135212x = aiConversationFragment;
                }

                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i17) {
                        case 0:
                            return AiConversationFragment.m18289v0(this.f135212x, interfaceC28601c1);
                        default:
                            return AiConversationFragment.m18290w0(this.f135212x, interfaceC28601c1);
                    }
                }
            };
            c28655q.m87172p0(objM87133R12);
        }
        int i18 = TextResource.C8688b.f25889c;
        AbstractC21211n.m59497o(null, c8688bM21277k, c8688bM21277k2, c8688bM21277k3, true, null, null, null, null, c8688bM21277k4, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a2, null, (InterfaceC4339a) objM87133R12, null, null, null, c28655q, (i18 << 3) | 24576 | (i18 << 6) | (i18 << 9) | (i18 << 27), 0, 0, 247463393);
        c28655q.m87173q(false);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final C26804f m18286s0(InterfaceC28670t2 interfaceC28670t2) {
        return (C26804f) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final C23454a0 m18287t0(AiConversationFragment aiConversationFragment, InterfaceC28670t2 interfaceC28670t2, C38423a.a action, boolean z4) {
        AbstractC22676k.m65750j(action, "action");
        aiConversationFragment.getAnalyticsHelper().m123072j(m18286s0(interfaceC28670t2).getConversation().getId(), action, z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final C23454a0 m18288u0(AiConversationFragment aiConversationFragment, InterfaceC28670t2 interfaceC28670t2) {
        aiConversationFragment.getAnalyticsHelper().m123068f(m18286s0(interfaceC28670t2).getConversation().getId());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final C23454a0 m18289v0(AiConversationFragment aiConversationFragment, InterfaceC28601c1 interfaceC28601c1) {
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(aiConversationFragment), null, null, aiConversationFragment.new C6084f(interfaceC28601c1, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final C23454a0 m18290w0(AiConversationFragment aiConversationFragment, InterfaceC28601c1 interfaceC28601c1) {
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(aiConversationFragment), null, null, aiConversationFragment.new C6081c(interfaceC28601c1, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final Boolean m18291x0(InterfaceC28601c1 interfaceC28601c1) {
        return (Boolean) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final void m18293y0(InterfaceC28601c1 interfaceC28601c1, Boolean bool) {
        interfaceC28601c1.setValue(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final C23454a0 m18295z0(AiConversationFragment aiConversationFragment, InterfaceC2994c0 interfaceC2994c0, InterfaceC28670t2 interfaceC28670t2, List list, AbstractC32662q2 abstractC32662q2) {
        if (list != null && !list.isEmpty()) {
            aiConversationFragment.m18283p0().mo1216g(new AbstractC26802d.r(list));
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C6083e(abstractC32662q2, aiConversationFragment, interfaceC28670t2, null), 3);
        }
        return C23454a0.f92919a;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycle().mo4986a(new C17359r(InterfaceC34116n.INSTANCE.m107848a("AiConversationFragment")));
        getLifecycle().mo4986a(m18280m0());
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onDestroyView() {
        super.onDestroyView();
        m18275h0().m123095h();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getActivity();
        ((C38423a) AbstractC29125c.m88492A(this).m122602a(new C32605f0(this, 7), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38423a.class), null)).m123078p();
        m18275h0().m123096i(AbstractC1613o1.m5020j(this));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C32609g(this, 2), true, -1397021689));
    }
}
