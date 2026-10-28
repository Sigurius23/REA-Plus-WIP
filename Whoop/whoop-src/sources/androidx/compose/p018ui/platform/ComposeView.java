package androidx.compose.p018ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p026b2.C2312r;
import p027b3.AbstractC2346a;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR*\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0014@RX\u0094\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m65681d2 = {"Landroidx/compose/ui/platform/ComposeView;", "Lb3/a;", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "Lkotlin/Function0;", "Ll83/a0;", "content", "setContent", "(Lc93/m;)V", "", "value", "K", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "getShouldCreateCompositionOnAttachedToWindow$annotations", "()V", "shouldCreateCompositionOnAttachedToWindow", "ui_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class ComposeView extends AbstractC2346a {

    /* JADX INFO: renamed from: J */
    public final C28633k1 f4981J;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public boolean shouldCreateCompositionOnAttachedToWindow;

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // p027b3.AbstractC2346a
    /* JADX INFO: renamed from: a */
    public final void mo3598a(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(420213850);
        int i14 = (c28655q.m87157i(this) ? 4 : 2) | i13;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            InterfaceC4351m interfaceC4351m = (InterfaceC4351m) this.f4981J.getValue();
            if (interfaceC4351m == null) {
                c28655q.m87150e0(-1238798753);
            } else {
                c28655q.m87150e0(98586082);
                interfaceC4351m.invoke(c28655q, 0);
            }
            c28655q.m87173q(false);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2312r(this, i13, 2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // p027b3.AbstractC2346a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final void setContent(InterfaceC4351m content) {
        this.shouldCreateCompositionOnAttachedToWindow = true;
        this.f4981J.setValue(content);
        if (isAttachedToWindow()) {
            m7234c();
        }
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i13) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, 0);
        this.f4981J = AbstractC28683x.m87272z(null);
    }
}
