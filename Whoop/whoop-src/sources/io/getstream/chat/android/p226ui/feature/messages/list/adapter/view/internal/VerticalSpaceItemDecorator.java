package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.AbstractC1692i1;
import androidx.recyclerview.widget.AbstractC1724q1;
import androidx.recyclerview.widget.C1701k2;
import androidx.recyclerview.widget.RecyclerView;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/VerticalSpaceItemDecorator;", "Landroidx/recyclerview/widget/q1;", "", "marginPx", "<init>", "(I)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/k2;", "state", "Ll83/a0;", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/k2;)V", "I", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final class VerticalSpaceItemDecorator extends AbstractC1724q1 {
    private final int marginPx;

    public VerticalSpaceItemDecorator(int i13) {
        this.marginPx = i13;
    }

    @Override // androidx.recyclerview.widget.AbstractC1724q1
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, C1701k2 state) {
        AbstractC22676k.m65750j(outRect, "outRect");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(parent, "parent");
        AbstractC22676k.m65750j(state, "state");
        AbstractC1692i1 adapter = parent.getAdapter();
        if (adapter == null || parent.getChildAdapterPosition(view) == adapter.getDisplayCount() - 1) {
            return;
        }
        outRect.bottom = this.marginPx;
    }
}
