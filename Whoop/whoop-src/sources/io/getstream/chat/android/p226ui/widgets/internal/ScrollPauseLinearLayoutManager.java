package io.getstream.chat.android.p226ui.widgets.internal;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000f\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u0007H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000b¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "verticalScrollEnabled", "", "getVerticalScrollEnabled", "()Z", "setVerticalScrollEnabled", "(Z)V", "horizontalScrollEnabled", "getHorizontalScrollEnabled", "setHorizontalScrollEnabled", "canScrollVertically", "canScrollHorizontally", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ScrollPauseLinearLayoutManager extends LinearLayoutManager {
    private boolean horizontalScrollEnabled;
    private boolean verticalScrollEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollPauseLinearLayoutManager(Context context) {
        super(1);
        AbstractC22676k.m65750j(context, "context");
        this.verticalScrollEnabled = getOrientation() == 1;
        this.horizontalScrollEnabled = getOrientation() == 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC1740u1
    public final boolean canScrollHorizontally() {
        return this.horizontalScrollEnabled && super.canScrollHorizontally();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC1740u1
    public final boolean canScrollVertically() {
        return this.verticalScrollEnabled && super.canScrollVertically();
    }

    public final boolean getHorizontalScrollEnabled() {
        return this.horizontalScrollEnabled;
    }

    public final boolean getVerticalScrollEnabled() {
        return this.verticalScrollEnabled;
    }

    public final void setHorizontalScrollEnabled(boolean z4) {
        this.horizontalScrollEnabled = z4;
    }

    public final void setVerticalScrollEnabled(boolean z4) {
        this.verticalScrollEnabled = z4;
    }
}
