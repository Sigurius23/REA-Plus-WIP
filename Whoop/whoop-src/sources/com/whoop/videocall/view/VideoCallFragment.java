package com.whoop.videocall.view;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import fs2.InterfaceC14760m;
import ge3.AbstractC15751g;
import gs2.C16159a;
import gs2.C16161c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal.C19683b;
import js2.AbstractC21931i;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import p390p1.C28635l;
import p390p1.C28655q;
import p602x1.C37816b;
import p708hb2.C17098f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import uf3.C34911a;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, m65681d2 = {"Lcom/whoop/videocall/view/VideoCallFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ll83/a0;", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lgs2/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "B", "()Lgs2/c;", "navRouter", "Lgs2/a;", "x", "A", "()Lgs2/a;", "actionRouter", "Lfs2/m;", "y", "C", "()Lfs2/m;", "videoCallUiProvider", "z", "a", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class VideoCallFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h navRouter;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h actionRouter;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h videoCallUiProvider;

    /* JADX INFO: renamed from: E */
    public static final int f32644E = 8;

    /* JADX INFO: renamed from: com.whoop.videocall.view.VideoCallFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10710b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32649w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32650x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32651y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10710b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32649w = componentCallbacks;
            this.f32650x = interfaceC35951a;
            this.f32651y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gs2.c, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C16161c invoke() {
            ComponentCallbacks componentCallbacks = this.f32649w;
            InterfaceC35951a interfaceC35951a = this.f32650x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32651y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C16161c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.videocall.view.VideoCallFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10711c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32652w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32653x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32654y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10711c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32652w = componentCallbacks;
            this.f32653x = interfaceC35951a;
            this.f32654y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gs2.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C16159a invoke() {
            ComponentCallbacks componentCallbacks = this.f32652w;
            InterfaceC35951a interfaceC35951a = this.f32653x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32654y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C16159a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.videocall.view.VideoCallFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10712d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32655w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32656x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32657y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10712d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32655w = componentCallbacks;
            this.f32656x = interfaceC35951a;
            this.f32657y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [fs2.m, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC14760m invoke() {
            ComponentCallbacks componentCallbacks = this.f32655w;
            InterfaceC35951a interfaceC35951a = this.f32656x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32657y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14760m.class), interfaceC35951a);
        }
    }

    public VideoCallFragment() {
        C19683b c19683b = new C19683b(this, 13);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navRouter = AbstractC30060g.m92087G(enumC23463i, new C10710b(this, null, c19683b));
        this.actionRouter = AbstractC30060g.m92087G(enumC23463i, new C10711c(this, null, null));
        this.videoCallUiProvider = AbstractC30060g.m92087G(enumC23463i, new C10712d(this, null, null));
    }

    /* JADX INFO: renamed from: A */
    private final C16159a m27830A() {
        return (C16159a) this.actionRouter.getValue();
    }

    /* JADX INFO: renamed from: B */
    private final C16161c m27831B() {
        return (C16161c) this.navRouter.getValue();
    }

    /* JADX INFO: renamed from: C */
    private final InterfaceC14760m m27832C() {
        return (InterfaceC14760m) this.videoCallUiProvider.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C34911a m27833D(VideoCallFragment videoCallFragment) {
        return AbstractC15751g.m44431K(videoCallFragment.requireActivity(), AbstractC5583n.m16799z(videoCallFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m27834E(VideoCallFragment videoCallFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                Bundle arguments = videoCallFragment.getArguments();
                if (arguments == null || (objM87133R = arguments.getString("call_id")) == null) {
                    objM87133R = "";
                }
                c28655q.m87172p0(objM87133R);
            }
            AbstractC21931i.m62471k((String) objM87133R, videoCallFragment.m27831B(), videoCallFragment.m27830A(), videoCallFragment.m27832C(), c28655q, 6);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        getActivity();
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C17098f(this, 23), true, 614612599));
    }
}
