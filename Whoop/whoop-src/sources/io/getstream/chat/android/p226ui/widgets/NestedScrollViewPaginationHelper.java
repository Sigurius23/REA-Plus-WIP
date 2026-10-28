package io.getstream.chat.android.p226ui.widgets;

import android.content.res.Resources;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.RunnableC1319m;
import c93.InterfaceC4339a;
import hn.C17508p;
import p296l5.InterfaceC23343g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m65681d2 = {"Lio/getstream/chat/android/ui/widgets/NestedScrollViewPaginationHelper;", "", "", "loadMoreThresholdDp", "Lkotlin/Function0;", "Ll83/a0;", "loadMoreListener", "Landroid/content/res/Resources;", "resources", "<init>", "(ILc93/a;Landroid/content/res/Resources;)V", "Landroidx/core/widget/NestedScrollView;", "nestedScrollView", "attachTo", "(Landroidx/core/widget/NestedScrollView;)V", "detachFrom", "enablePagination", "()V", "disablePagination", "I", "Lc93/a;", "Landroid/content/res/Resources;", "", "paginationEnabled", "Z", "Ll5/g;", "scrollChangeListener", "Ll5/g;", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class NestedScrollViewPaginationHelper {
    private static final Companion Companion = new Companion();
    private static final int DEFAULT_LOAD_MORE_THRESHOLD_DP = 200;
    private final InterfaceC4339a loadMoreListener;
    private final int loadMoreThresholdDp;
    private boolean paginationEnabled;
    private final Resources resources;
    private final InterfaceC23343g scrollChangeListener;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/widgets/NestedScrollViewPaginationHelper$Companion;", "", "<init>", "()V", "DEFAULT_LOAD_MORE_THRESHOLD_DP", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public NestedScrollViewPaginationHelper(int i13, InterfaceC4339a loadMoreListener, Resources resources) {
        AbstractC22676k.m65750j(loadMoreListener, "loadMoreListener");
        AbstractC22676k.m65750j(resources, "resources");
        this.loadMoreThresholdDp = i13;
        this.loadMoreListener = loadMoreListener;
        this.resources = resources;
        if (i13 < 0) {
            throw new IllegalArgumentException("Load more threshold must not be negative");
        }
        this.scrollChangeListener = new C17508p(this, 13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollChangeListener$lambda$2(NestedScrollViewPaginationHelper nestedScrollViewPaginationHelper, NestedScrollView nestedScrollView, int i13, int i14, int i15, int i16) {
        AbstractC22676k.m65750j(nestedScrollView, "nestedScrollView");
        if (nestedScrollViewPaginationHelper.paginationEnabled) {
            View childAt = nestedScrollView.getChildAt(0);
            int height = childAt != null ? childAt.getHeight() : 0;
            int height2 = nestedScrollView.getHeight() + i14;
            float f13 = nestedScrollViewPaginationHelper.loadMoreThresholdDp * nestedScrollViewPaginationHelper.resources.getDisplayMetrics().density;
            if (height <= 0 || height - height2 >= f13) {
                return;
            }
            nestedScrollView.post(new RunnableC1319m(nestedScrollViewPaginationHelper, 29));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollChangeListener$lambda$2$lambda$1(NestedScrollViewPaginationHelper nestedScrollViewPaginationHelper) {
        if (nestedScrollViewPaginationHelper.paginationEnabled) {
            nestedScrollViewPaginationHelper.loadMoreListener.invoke();
        }
    }

    public final void attachTo(NestedScrollView nestedScrollView) {
        AbstractC22676k.m65750j(nestedScrollView, "nestedScrollView");
        nestedScrollView.setOnScrollChangeListener(this.scrollChangeListener);
    }

    public final void detachFrom(NestedScrollView nestedScrollView) {
        AbstractC22676k.m65750j(nestedScrollView, "nestedScrollView");
        nestedScrollView.setOnScrollChangeListener((InterfaceC23343g) null);
    }

    public final void disablePagination() {
        this.paginationEnabled = false;
    }

    public final void enablePagination() {
        this.paginationEnabled = true;
    }

    public /* synthetic */ NestedScrollViewPaginationHelper(int i13, InterfaceC4339a interfaceC4339a, Resources resources, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 200 : i13, interfaceC4339a, resources);
    }
}
