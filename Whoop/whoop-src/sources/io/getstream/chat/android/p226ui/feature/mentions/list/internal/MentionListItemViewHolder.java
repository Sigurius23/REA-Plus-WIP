package io.getstream.chat.android.p226ui.feature.mentions.list.internal;

import android.view.View;
import androidx.recyclerview.widget.AbstractC1717o2;
import io.getstream.chat.android.p226ui.feature.mentions.list.MentionListItem;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemViewHolder;", "Lio/getstream/chat/android/ui/feature/mentions/list/MentionListItem;", "Item", "Landroidx/recyclerview/widget/o2;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "item", "Ll83/a0;", "bind", "(Lio/getstream/chat/android/ui/feature/mentions/list/MentionListItem;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class MentionListItemViewHolder<Item extends MentionListItem> extends AbstractC1717o2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MentionListItemViewHolder(View itemView) {
        super(itemView);
        AbstractC22676k.m65750j(itemView, "itemView");
    }

    public abstract void bind(Item item);
}
