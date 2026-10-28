package io.getstream.chat.android.p226ui.feature.messages.list.adapter.internal;

import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1717o2;
import androidx.recyclerview.widget.AbstractC1759z0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import io.getstream.chat.android.p226ui.common.extensions.internal.RecyclerViewKt;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.BaseMessageItemViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemPayloadDiff;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewHolderFactory;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.InterfaceC23462h;
import p510u0.C34350r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016¢\u0006\u0004\b\u0016\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00152\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00152\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00152\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010\"\u001a\u00020\u00152\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00152\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\"\u0010-\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/\"\u0004\b0\u00101¨\u00062"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;", "Landroidx/recyclerview/widget/z0;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;", "viewHolderFactory", "<init>", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;)V", "", "position", "", "getItemId", "(I)J", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;", "holder", "Ll83/a0;", "onBindViewHolder", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;I)V", "", "", "payloads", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;ILjava/util/List;)V", "onViewRecycled", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;)V", "onViewAttachedToWindow", "onViewDetachedFromWindow", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "onDetachedFromRecyclerView", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "", "isThread", "Z", "()Z", "setThread", "(Z)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageListItemAdapter extends AbstractC1759z0 {
    private boolean isThread;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final MessageListItemViewHolderFactory viewHolderFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListItemAdapter(MessageListItemViewHolderFactory viewHolderFactory) {
        super(MessageListItemDiffCallback.INSTANCE);
        AbstractC22676k.m65750j(viewHolderFactory, "viewHolderFactory");
        this.viewHolderFactory = viewHolderFactory;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:MessageListAdapter");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "<init> no args", null);
        }
        setHasStableIds(true);
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 onAttachedToRecyclerView$lambda$5(BaseMessageItemViewHolder baseMessageItemViewHolder) {
        baseMessageItemViewHolder.onAttachedToWindow();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 onDetachedFromRecyclerView$lambda$6(BaseMessageItemViewHolder baseMessageItemViewHolder) {
        baseMessageItemViewHolder.onDetachedFromWindow();
        return C23454a0.f92919a;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final long getItemId(int position) {
        return ((MessageListItem) getItem(position)).getStableId();
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final int getItemViewType(int position) {
        MessageListItem messageListItem = (MessageListItem) getItem(position);
        MessageListItemViewHolderFactory messageListItemViewHolderFactory = this.viewHolderFactory;
        AbstractC22676k.m65747g(messageListItem);
        return messageListItemViewHolderFactory.getItemViewType(messageListItem);
    }

    /* JADX INFO: renamed from: isThread, reason: from getter */
    public final boolean getIsThread() {
        return this.isThread;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        AbstractC22676k.m65750j(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerViewKt.doForAllViewHolders(this, recyclerView, new C34350r(18));
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        AbstractC22676k.m65750j(recyclerView, "recyclerView");
        RecyclerViewKt.doForAllViewHolders(this, recyclerView, new C34350r(19));
        super.onDetachedFromRecyclerView(recyclerView);
    }

    public final void setThread(boolean z4) {
        this.isThread = z4;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final /* bridge */ /* synthetic */ void onBindViewHolder(AbstractC1717o2 abstractC1717o2, int i13, List list) {
        onBindViewHolder((BaseMessageItemViewHolder<? extends MessageListItem>) abstractC1717o2, i13, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final BaseMessageItemViewHolder<? extends MessageListItem> onCreateViewHolder(ViewGroup parent, int viewType) {
        AbstractC22676k.m65750j(parent, "parent");
        return this.viewHolderFactory.createViewHolder(parent, viewType);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final void onViewAttachedToWindow(BaseMessageItemViewHolder<? extends MessageListItem> holder) {
        AbstractC22676k.m65750j(holder, "holder");
        super.onViewAttachedToWindow((AbstractC1717o2) holder);
        holder.onAttachedToWindow();
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final void onViewDetachedFromWindow(BaseMessageItemViewHolder<? extends MessageListItem> holder) {
        AbstractC22676k.m65750j(holder, "holder");
        holder.onDetachedFromWindow();
        super.onViewDetachedFromWindow((AbstractC1717o2) holder);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final void onViewRecycled(BaseMessageItemViewHolder<? extends MessageListItem> holder) {
        AbstractC22676k.m65750j(holder, "holder");
        super.onViewRecycled((AbstractC1717o2) holder);
        holder.unbind();
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final void onBindViewHolder(BaseMessageItemViewHolder<? extends MessageListItem> holder, int position) {
        AbstractC22676k.m65750j(holder, "holder");
        MessageListItem messageListItem = (MessageListItem) getItem(position);
        MessageListItemViewHolderFactory messageListItemViewHolderFactory = this.viewHolderFactory;
        AbstractC22676k.m65747g(messageListItem);
        int itemViewType = messageListItemViewHolderFactory.getItemViewType(messageListItem);
        int itemViewType2 = this.viewHolderFactory.getItemViewType(holder);
        if (itemViewType != itemViewType2) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                InterfaceC2344j interfaceC2344j = logger.f9274b;
                MessageListItemViewType messageListItemViewType = MessageListItemViewType.INSTANCE;
                interfaceC2344j.log(enumC2341g, str, AbstractC31061c.m95640p("[onBindViewHolder] #regular; viewType mismatch; item: ", messageListItemViewType.toString(itemViewType), ", viewHolder: ", messageListItemViewType.toString(itemViewType2)), null);
                return;
            }
            return;
        }
        MessageListItemPayloadDiff.INSTANCE.getClass();
        holder.bindListItem$stream_chat_android_ui_components_release(messageListItem, MessageListItemPayloadDiff.FULL);
    }

    public final void onBindViewHolder(BaseMessageItemViewHolder<? extends MessageListItem> holder, int position, List<Object> payloads) {
        AbstractC22676k.m65750j(holder, "holder");
        AbstractC22676k.m65750j(payloads, "payloads");
        ArrayList arrayList = new ArrayList();
        for (Object obj : payloads) {
            if (obj instanceof MessageListItemPayloadDiff) {
                arrayList.add(obj);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        List listM118958J = arrayList;
        if (zIsEmpty) {
            listM118958J = null;
        }
        if (listM118958J == null) {
            MessageListItemPayloadDiff.INSTANCE.getClass();
            listM118958J = AbstractC37056f.m118958J(MessageListItemPayloadDiff.FULL);
        }
        MessageListItemPayloadDiff.INSTANCE.getClass();
        MessageListItemPayloadDiff messageListItemPayloadDiffPlus = MessageListItemPayloadDiff.EMPTY;
        Iterator it = listM118958J.iterator();
        while (it.hasNext()) {
            messageListItemPayloadDiffPlus = messageListItemPayloadDiffPlus.plus((MessageListItemPayloadDiff) it.next());
        }
        MessageListItem messageListItem = (MessageListItem) getItem(position);
        MessageListItemViewHolderFactory messageListItemViewHolderFactory = this.viewHolderFactory;
        AbstractC22676k.m65747g(messageListItem);
        int itemViewType = messageListItemViewHolderFactory.getItemViewType(messageListItem);
        int itemViewType2 = this.viewHolderFactory.getItemViewType(holder);
        if (itemViewType != itemViewType2) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                InterfaceC2344j interfaceC2344j = logger.f9274b;
                MessageListItemViewType messageListItemViewType = MessageListItemViewType.INSTANCE;
                interfaceC2344j.log(enumC2341g, str, AbstractC31061c.m95640p("[onBindViewHolder] #payloads; viewType mismatch; item: ", messageListItemViewType.toString(itemViewType), ", viewHolder: ", messageListItemViewType.toString(itemViewType2)), null);
                return;
            }
            return;
        }
        holder.bindListItem$stream_chat_android_ui_components_release(messageListItem, messageListItemPayloadDiffPlus);
    }
}
