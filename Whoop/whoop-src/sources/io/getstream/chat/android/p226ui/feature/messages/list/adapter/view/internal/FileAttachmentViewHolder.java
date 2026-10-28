package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import android.view.View;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.widgets.internal.SimpleListAdapter;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\t\u0082\u0001\u0002\u000b\f¨\u0006\r"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentViewHolder;", "Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter$ViewHolder;", "Lio/getstream/chat/android/models/Attachment;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Ll83/a0;", "clearScope", "()V", "restartJob", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/RecordingFileAttachmentViewHolder;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
abstract class FileAttachmentViewHolder extends SimpleListAdapter.ViewHolder<Attachment> {
    private FileAttachmentViewHolder(View view) {
        super(view);
    }

    public abstract void clearScope();

    public abstract void restartJob();

    public FileAttachmentViewHolder(View view, DefaultConstructorMarker defaultConstructorMarker) {
        super(view);
    }
}
