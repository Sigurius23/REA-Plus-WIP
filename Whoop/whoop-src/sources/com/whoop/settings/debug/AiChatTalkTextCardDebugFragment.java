package com.whoop.settings.debug;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.coacheverywherecommon.models.AbstractC6219a;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.ChatEntrypointExperience;
import dp0.InterfaceC12251g;
import ej1.C13242h;
import h02.C16587n0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.IOException;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import org.xmlpull.v1.XmlPullParserException;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p602x1.C37816b;
import p708hb2.AbstractC17096d;
import p708hb2.C17095c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import vf3.InterfaceC35951a;
import y31.C39192a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u0003J+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/settings/debug/AiChatTalkTextCardDebugFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onPause", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Ldp0/g;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "B", "()Ldp0/g;", "globalCoachManager", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AiChatTalkTextCardDebugFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h globalCoachManager = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C10096a(this, null, null));

    /* JADX INFO: renamed from: com.whoop.settings.debug.AiChatTalkTextCardDebugFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10096a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30359w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30360x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30361y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10096a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30359w = componentCallbacks;
            this.f30360x = interfaceC35951a;
            this.f30361y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [dp0.g, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC12251g invoke() {
            ComponentCallbacks componentCallbacks = this.f30359w;
            InterfaceC35951a interfaceC35951a = this.f30360x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30361y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC12251g.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: B */
    private final InterfaceC12251g m25362B() {
        return (InterfaceC12251g) this.globalCoachManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m25363C(AiChatTalkTextCardDebugFragment aiChatTalkTextCardDebugFragment, Composer composer, int i13) throws XmlPullParserException, IOException {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM87157i = c28655q.m87157i(aiChatTalkTextCardDebugFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C16587n0(aiChatTalkTextCardDebugFragment, 7);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(aiChatTalkTextCardDebugFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C17095c(aiChatTalkTextCardDebugFragment, 0);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC17096d.m48289e(interfaceC4339a, (Function1) objM87133R2, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m25364D(AiChatTalkTextCardDebugFragment aiChatTalkTextCardDebugFragment) {
        AbstractC5583n.m16799z(aiChatTalkTextCardDebugFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m25365E(AiChatTalkTextCardDebugFragment aiChatTalkTextCardDebugFragment, C39192a button) {
        AbstractC22676k.m65750j(button, "button");
        AiAction aiActionM124827a = button.getAiAction();
        if (aiActionM124827a != null) {
            if (aiActionM124827a.getEntrypointExperience() == ChatEntrypointExperience.FAB_VOICE) {
                aiActionM124827a = AiAction.copy$default(aiActionM124827a, null, null, null, null, null, null, null, null, null, false, null, null, null, null, ChatEntrypointExperience.QUICK_VOICE, null, null, 114687, null);
            }
            InterfaceC12251g.m34132f(aiChatTalkTextCardDebugFragment.m25362B(), 0L, null, AbstractC6219a.m18524b(aiActionM124827a, true), 3, null);
        }
        return C23454a0.f92919a;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onPause() {
        super.onPause();
        InterfaceC12251g.m34131A(m25362B(), null, 1, null);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        InterfaceC12251g.m34133k(m25362B(), true, null, 2, null);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C13242h(this, 29), true, 1601126659));
    }
}
