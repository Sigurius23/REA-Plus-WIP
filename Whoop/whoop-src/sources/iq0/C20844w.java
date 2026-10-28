package iq0;

import android.view.ViewGroup;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListView;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.BaseMessageItemViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewHolderFactory;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners;
import lq0.C24653a;
import lq0.C24659g;
import lq0.C24660h;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: iq0.w */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0014\u001a\u00020\r2\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0017R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Liq0/w;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;", "", "accessToken", "whoopUserName", "Lkotlin/Function1;", "Liq0/s;", "Ll83/a0;", "eventListener", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parentView", "", "viewType", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;", "createViewHolder", "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;", "item", "getItemViewType", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)I", "viewHolder", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;)I", "a", "Ljava/lang/String;", "b", "c", "Lkotlin/jvm/functions/Function1;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C20844w extends MessageListItemViewHolderFactory {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String accessToken;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String whoopUserName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Function1 eventListener;

    public C20844w(String str, String whoopUserName, Function1 eventListener) {
        AbstractC22676k.m65750j(whoopUserName, "whoopUserName");
        AbstractC22676k.m65750j(eventListener, "eventListener");
        this.accessToken = str;
        this.whoopUserName = whoopUserName;
        this.eventListener = eventListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final boolean m57572c(Message it) {
        AbstractC22676k.m65750j(it, "it");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final boolean m57573d(Message it) {
        AbstractC22676k.m65750j(it, "it");
        return false;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewHolderFactory
    public BaseMessageItemViewHolder<? extends MessageListItem> createViewHolder(ViewGroup parentView, int viewType) {
        MessageListView.OnMessageLongClickListener c20842u;
        MessageListView.OnThreadClickListener c20843v;
        AbstractC22676k.m65750j(parentView, "parentView");
        if (!AbstractC20845x.f78369a.contains(Integer.valueOf(viewType))) {
            if (viewType == 1006) {
                return new C24660h(parentView, null, 2, null);
            }
            return viewType == 1002 ? new C24653a(parentView, null, 2, null) : super.createViewHolder(parentView, viewType);
        }
        String str = this.accessToken;
        MessageListListeners listeners = getListeners();
        if (listeners == null || (c20842u = listeners.getMessageLongClickListener()) == null) {
            c20842u = new C20842u();
        }
        MessageListView.OnMessageLongClickListener onMessageLongClickListener = c20842u;
        MessageListListeners listeners2 = getListeners();
        if (listeners2 == null || (c20843v = listeners2.getThreadClickListener()) == null) {
            c20843v = new C20843v();
        }
        return new C24659g(parentView, str, onMessageLongClickListener, c20843v, this.whoopUserName, this.eventListener, null, 64, null);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewHolderFactory
    public int getItemViewType(MessageListItem item) {
        AbstractC22676k.m65750j(item, "item");
        int itemViewType = super.getItemViewType(item);
        if (AbstractC20845x.f78369a.contains(Integer.valueOf(itemViewType))) {
            return 1003;
        }
        return itemViewType;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewHolderFactory
    public int getItemViewType(BaseMessageItemViewHolder<? extends MessageListItem> viewHolder) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        if (viewHolder instanceof C24659g) {
            return 1003;
        }
        if (viewHolder instanceof C24660h) {
            return MessageListItemViewType.THREAD_SEPARATOR;
        }
        if (viewHolder instanceof C24653a) {
            return 1002;
        }
        return super.getItemViewType(viewHolder);
    }
}
