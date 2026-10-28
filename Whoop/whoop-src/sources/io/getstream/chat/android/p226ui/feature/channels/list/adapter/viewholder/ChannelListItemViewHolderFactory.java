package io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder;

import android.content.Context;
import android.view.ViewGroup;
import io.getstream.chat.android.p226ui.feature.channels.list.ChannelListView;
import io.getstream.chat.android.p226ui.feature.channels.list.ChannelListViewStyle;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.ChannelListItem;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.internal.ChannelListLoadingMoreViewHolder;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.internal.ChannelViewHolder;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020%2\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020%2\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b*\u0010)R$\u0010\n\u001a\u00020\t2\u0006\u0010+\u001a\u00020\t8\u0004@BX\u0084.¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010.R$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000e8\u0004@BX\u0084.¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u00101R$\u0010\u0014\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u00138\u0004@BX\u0084.¢\u0006\f\n\u0004\b\u0014\u00102\u001a\u0004\b3\u00104R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u00188\u0004@BX\u0084.¢\u0006\f\n\u0004\b\u0019\u00105\u001a\u0004\b6\u00107¨\u00068"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ll83/a0;", "ensureInitialized", "(Landroid/content/Context;)V", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainer;", "listenerContainer", "setListenerContainer$stream_chat_android_ui_components_release", "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainer;)V", "setListenerContainer", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListVisibilityContainer;", "visibilityContainer", "setVisibilityContainer$stream_chat_android_ui_components_release", "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListVisibilityContainer;)V", "setVisibilityContainer", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainer;", "iconProviderContainer", "setIconProviderContainer$stream_chat_android_ui_components_release", "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainer;)V", "setIconProviderContainer", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;", "style", "setStyle$stream_chat_android_ui_components_release", "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;)V", "setStyle", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;", "item", "", "getItemViewType", "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;)I", "Landroid/view/ViewGroup;", "parentView", "viewType", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/BaseChannelListItemViewHolder;", "createViewHolder", "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/BaseChannelListItemViewHolder;", "createChannelViewHolder", "(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/BaseChannelListItemViewHolder;", "createLoadingMoreViewHolder", "value", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainer;", "getListenerContainer", "()Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainer;", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListVisibilityContainer;", "getVisibilityContainer", "()Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListVisibilityContainer;", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainer;", "getIconProviderContainer", "()Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainer;", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;", "getStyle", "()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public class ChannelListItemViewHolderFactory {
    private ChannelListIconProviderContainer iconProviderContainer;
    private ChannelListListenerContainer listenerContainer;
    private ChannelListViewStyle style;
    private ChannelListVisibilityContainer visibilityContainer;

    /* JADX WARN: Multi-variable type inference failed */
    private final void ensureInitialized(Context context) {
        if (this.listenerContainer == null) {
            this.listenerContainer = new ChannelListListenerContainerImpl(null, null, null, null, null, null, 63, null);
        }
        int i13 = 3;
        ChannelListView.ChannelOptionVisibilityPredicate channelOptionVisibilityPredicate = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        if (this.visibilityContainer == null) {
            this.visibilityContainer = new ChannelListVisibilityContainerImpl(channelOptionVisibilityPredicate, objArr5 == true ? 1 : 0, i13, objArr4 == true ? 1 : 0);
        }
        if (this.iconProviderContainer == null) {
            this.iconProviderContainer = new ChannelListIconProviderContainerImpl(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, i13, objArr == true ? 1 : 0);
        }
        if (this.style == null) {
            this.style = ChannelListViewStyle.INSTANCE.invoke(context, null);
        }
    }

    public final BaseChannelListItemViewHolder createChannelViewHolder(ViewGroup parentView) {
        AbstractC22676k.m65750j(parentView, "parentView");
        Context context = parentView.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        ensureInitialized(context);
        return new ChannelViewHolder(parentView, getListenerContainer().getChannelClickListener(), getListenerContainer().getChannelLongClickListener(), getListenerContainer().getDeleteClickListener(), getListenerContainer().getMoreOptionsClickListener(), getListenerContainer().getUserClickListener(), getListenerContainer().getSwipeListener(), getStyle(), getVisibilityContainer().isMoreOptionsVisible(), getVisibilityContainer().isDeleteOptionVisible(), getIconProviderContainer().getGetMoreOptionsIcon(), getIconProviderContainer().getGetDeleteOptionIcon(), null, 4096, null);
    }

    public final BaseChannelListItemViewHolder createLoadingMoreViewHolder(ViewGroup parentView) {
        AbstractC22676k.m65750j(parentView, "parentView");
        return new ChannelListLoadingMoreViewHolder(parentView, getStyle());
    }

    public final BaseChannelListItemViewHolder createViewHolder(ViewGroup parentView, int viewType) {
        AbstractC22676k.m65750j(parentView, "parentView");
        if (viewType == 1001) {
            return createChannelViewHolder(parentView);
        }
        if (viewType == 1002) {
            return createLoadingMoreViewHolder(parentView);
        }
        throw new IllegalArgumentException(AbstractC2875y.m8295h(viewType, "Unhandled ChannelList view type: "));
    }

    public final ChannelListIconProviderContainer getIconProviderContainer() {
        ChannelListIconProviderContainer channelListIconProviderContainer = this.iconProviderContainer;
        if (channelListIconProviderContainer != null) {
            return channelListIconProviderContainer;
        }
        AbstractC22676k.m65757q("iconProviderContainer");
        throw null;
    }

    public final int getItemViewType(ChannelListItem item) {
        AbstractC22676k.m65750j(item, "item");
        if (item instanceof ChannelListItem.LoadingMoreItem) {
            return 1002;
        }
        if (item instanceof ChannelListItem.ChannelItem) {
            return 1001;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final ChannelListListenerContainer getListenerContainer() {
        ChannelListListenerContainer channelListListenerContainer = this.listenerContainer;
        if (channelListListenerContainer != null) {
            return channelListListenerContainer;
        }
        AbstractC22676k.m65757q("listenerContainer");
        throw null;
    }

    public final ChannelListViewStyle getStyle() {
        ChannelListViewStyle channelListViewStyle = this.style;
        if (channelListViewStyle != null) {
            return channelListViewStyle;
        }
        AbstractC22676k.m65757q("style");
        throw null;
    }

    public final ChannelListVisibilityContainer getVisibilityContainer() {
        ChannelListVisibilityContainer channelListVisibilityContainer = this.visibilityContainer;
        if (channelListVisibilityContainer != null) {
            return channelListVisibilityContainer;
        }
        AbstractC22676k.m65757q("visibilityContainer");
        throw null;
    }

    /* JADX INFO: renamed from: setIconProviderContainer$stream_chat_android_ui_components_release */
    public final void m55117x1d84bd02(ChannelListIconProviderContainer iconProviderContainer) {
        AbstractC22676k.m65750j(iconProviderContainer, "iconProviderContainer");
        this.iconProviderContainer = iconProviderContainer;
    }

    public final void setListenerContainer$stream_chat_android_ui_components_release(ChannelListListenerContainer listenerContainer) {
        AbstractC22676k.m65750j(listenerContainer, "listenerContainer");
        this.listenerContainer = listenerContainer;
    }

    public final void setStyle$stream_chat_android_ui_components_release(ChannelListViewStyle style) {
        AbstractC22676k.m65750j(style, "style");
        this.style = style;
    }

    public final void setVisibilityContainer$stream_chat_android_ui_components_release(ChannelListVisibilityContainer visibilityContainer) {
        AbstractC22676k.m65750j(visibilityContainer, "visibilityContainer");
        this.visibilityContainer = visibilityContainer;
    }
}
