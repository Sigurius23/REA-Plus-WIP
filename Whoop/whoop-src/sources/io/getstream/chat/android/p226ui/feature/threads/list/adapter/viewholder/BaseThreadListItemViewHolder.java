package io.getstream.chat.android.p226ui.feature.threads.list.adapter.viewholder;

import android.view.View;
import androidx.recyclerview.widget.AbstractC1717o2;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import io.getstream.chat.android.p226ui.feature.threads.list.adapter.ThreadListItem;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\f\u0010\u000bR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;", "Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem;", "T", "Landroidx/recyclerview/widget/o2;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "item", "Ll83/a0;", "bind", "(Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem;)V", "bindInternal$stream_chat_android_ui_components_release", "bindInternal", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class BaseThreadListItemViewHolder<T extends ThreadListItem> extends AbstractC1717o2 {

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseThreadListItemViewHolder(View itemView) {
        super(itemView);
        AbstractC22676k.m65750j(itemView, "itemView");
        this.logger = AbstractC1772c1.m5382S(this, "Chat:BaseThreadListItemViewHolder");
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    public abstract void bind(T item);

    public final void bindInternal$stream_chat_android_ui_components_release(ThreadListItem item) {
        AbstractC22676k.m65750j(item, "item");
        bind(item);
    }
}
