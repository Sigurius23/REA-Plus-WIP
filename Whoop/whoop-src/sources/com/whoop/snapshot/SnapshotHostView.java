package com.whoop.snapshot;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.EnumC1635w;
import gg2.C15826a;
import gg2.C15827b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/snapshot/SnapshotHostView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ll83/a0;", "onAttachedToWindow", "()V", "snapshot-compose-host_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SnapshotHostView extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotHostView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC22676k.m65750j(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Object parent = getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            AbstractC1613o1.m5024n(view, new C15826a(EnumC1635w.f6327y, true).getLifecycleOwner());
            AbstractC34132o.m107862G(this, new C15827b(new C15826a(null, false, 3, null)));
        }
    }
}
