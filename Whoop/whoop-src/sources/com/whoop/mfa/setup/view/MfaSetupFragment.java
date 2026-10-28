package com.whoop.mfa.setup.view;

import a80.C0539c;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import az1.AbstractC2173n;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.mfa.setup.view.MfaSetupFragment;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import js0.AbstractC21909c;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import p114eb.AbstractC12939a0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pf.AbstractC29125c;
import py1.C29622a;
import q83.AbstractC30060g;
import tr2.InterfaceC34116n;
import xf3.C38266c;
import yy1.AbstractC39895c;
import yy1.C39896d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001f"}, m65681d2 = {"Lcom/whoop/mfa/setup/view/MfaSetupFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Ltr2/n;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ltr2/n;", "logger", "", "x", "Ll83/h;", "F", "()Ljava/lang/String;", "source", "y", "E", "enforcementTag", "z", "a", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class MfaSetupFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC34116n logger = InterfaceC34116n.INSTANCE.m107848a("MfaSetupFragment");

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h source;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h enforcementTag;

    /* JADX INFO: renamed from: E */
    public static final int f27390E = 8;

    public MfaSetupFragment() {
        final int i13 = 0;
        this.source = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: az1.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ MfaSetupFragment f8590x;

            {
                this.f8590x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return MfaSetupFragment.m22907J(this.f8590x);
                    default:
                        return MfaSetupFragment.m22901D(this.f8590x);
                }
            }
        });
        final int i14 = 1;
        this.enforcementTag = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: az1.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ MfaSetupFragment f8590x;

            {
                this.f8590x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return MfaSetupFragment.m22907J(this.f8590x);
                    default:
                        return MfaSetupFragment.m22901D(this.f8590x);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final String m22901D(MfaSetupFragment mfaSetupFragment) {
        Bundle arguments = mfaSetupFragment.getArguments();
        String string = arguments != null ? arguments.getString("enforcementTag") : null;
        return string == null ? "" : string;
    }

    /* JADX INFO: renamed from: E */
    private final String m22902E() {
        return (String) this.enforcementTag.getValue();
    }

    /* JADX INFO: renamed from: F */
    private final String m22903F() {
        return (String) this.source.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m22904G(MfaSetupFragment mfaSetupFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                AbstractC12939a0 abstractC12939a0M16799z = AbstractC5583n.m16799z(mfaSetupFragment);
                Context contextRequireContext = mfaSetupFragment.requireContext();
                AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
                C38266c c38266cM88492A = AbstractC29125c.m88492A(mfaSetupFragment);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C39896d c39896d = new C39896d(abstractC12939a0M16799z, contextRequireContext, (AbstractC21909c) c38266cM88492A.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null), (C29622a) AbstractC29125c.m88492A(mfaSetupFragment).m122602a(null, c22673i0.getOrCreateKotlinClass(C29622a.class), null), null, mfaSetupFragment.m22903F(), mfaSetupFragment.m22902E(), 16, null);
                c28655q.m87172p0(c39896d);
                objM87133R = c39896d;
            }
            final C39896d c39896d2 = (C39896d) objM87133R;
            String strM22903F = mfaSetupFragment.m22903F();
            boolean zM87157i = c28655q.m87157i(c39896d2);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                final int i14 = 0;
                objM87133R2 = new Function1() { // from class: az1.e
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return MfaSetupFragment.m22905H(c39896d2, (String) obj);
                            default:
                                return MfaSetupFragment.m22906I(c39896d2, (AbstractC39895c) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function1 = (Function1) objM87133R2;
            boolean zM87157i2 = c28655q.m87157i(c39896d2);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                final int i15 = 1;
                objM87133R3 = new Function1() { // from class: az1.e
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return MfaSetupFragment.m22905H(c39896d2, (String) obj);
                            default:
                                return MfaSetupFragment.m22906I(c39896d2, (AbstractC39895c) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC2173n.m6842x(strM22903F, null, function1, (Function1) objM87133R3, c28655q, 0, 2);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m22905H(C39896d c39896d, String str) {
        c39896d.m127995d(new AbstractC39895c.e(str));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m22906I(C39896d c39896d, AbstractC39895c event) {
        AbstractC22676k.m65750j(event, "event");
        c39896d.m127995d(event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final String m22907J(MfaSetupFragment mfaSetupFragment) {
        Bundle arguments = mfaSetupFragment.getArguments();
        String string = arguments != null ? arguments.getString("source") : null;
        return string == null ? "" : string;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85250f(this, this.logger);
        AbstractC28163g0.m85256l(this);
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C0539c(this, 6), true, 1372904055));
    }
}
