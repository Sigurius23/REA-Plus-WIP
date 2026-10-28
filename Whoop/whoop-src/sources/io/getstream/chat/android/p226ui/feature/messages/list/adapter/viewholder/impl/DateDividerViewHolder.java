package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import io.getstream.chat.android.p226ui.ChatUI;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemDateDividerBinding;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListItemStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemPayloadDiff;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.internal.DecoratedBaseMessageItemViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.Decorator;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.utils.extensions.IntKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import java.util.List;
import kr.C22782a;
import kr.C22786e;
import kr.C22788g;
import kr.C22790i;
import kr.C22792k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB1\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/DateDividerViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$DateSeparatorItem;", "Landroid/view/ViewGroup;", "parent", "", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;", "decorators", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "style", "Lio/getstream/chat/android/ui/databinding/StreamUiItemDateDividerBinding;", "binding", "<init>", "(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;Lio/getstream/chat/android/ui/databinding/StreamUiItemDateDividerBinding;)V", "data", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;", "diff", "Ll83/a0;", "bindData", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$DateSeparatorItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "getStyle", "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemDateDividerBinding;", "getBinding", "()Lio/getstream/chat/android/ui/databinding/StreamUiItemDateDividerBinding;", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DateDividerViewHolder extends DecoratedBaseMessageItemViewHolder<MessageListItem.DateSeparatorItem> {
    private static final Companion Companion = new Companion();
    private static final float DEFAULT_CORNER_RADIUS = IntKt.dpToPxPrecise(16);
    private final StreamUiItemDateDividerBinding binding;
    private final MessageListItemStyle style;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/DateDividerViewHolder$Companion;", "", "<init>", "()V", "DEFAULT_CORNER_RADIUS", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public /* synthetic */ DateDividerViewHolder(ViewGroup viewGroup, List list, MessageListItemStyle messageListItemStyle, StreamUiItemDateDividerBinding streamUiItemDateDividerBinding, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, list, messageListItemStyle, (i13 & 8) != 0 ? StreamUiItemDateDividerBinding.inflate(ViewGroupKt.getStreamThemeInflater(viewGroup), viewGroup, false) : streamUiItemDateDividerBinding);
    }

    public final StreamUiItemDateDividerBinding getBinding() {
        return this.binding;
    }

    public final MessageListItemStyle getStyle() {
        return this.style;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.internal.DecoratedBaseMessageItemViewHolder, io.getstream.chat.android.p226ui.feature.messages.list.adapter.BaseMessageItemViewHolder
    public final void bindData(MessageListItem.DateSeparatorItem data, MessageListItemPayloadDiff diff) {
        AbstractC22676k.m65750j(data, "data");
        AbstractC22676k.m65750j(diff, "diff");
        super.bindData(data, diff);
        this.binding.dateLabel.setText(ChatUI.getDateFormatter().formatRelativeDate(data.getDate()));
        TextView dateLabel = this.binding.dateLabel;
        AbstractC22676k.m65749i(dateLabel, "dateLabel");
        TextStyleKt.setTextStyle(dateLabel, this.style.getTextStyleDateSeparator());
        TextView textView = this.binding.dateLabel;
        C22790i c22790i = new C22790i();
        C22790i c22790i2 = new C22790i();
        C22790i c22790i3 = new C22790i();
        C22790i c22790i4 = new C22790i();
        C22786e c22786e = new C22786e(0);
        C22786e c22786e2 = new C22786e(0);
        C22786e c22786e3 = new C22786e(0);
        C22786e c22786e4 = new C22786e(0);
        float f13 = DEFAULT_CORNER_RADIUS;
        C22782a c22782a = new C22782a(f13);
        C22782a c22782a2 = new C22782a(f13);
        C22782a c22782a3 = new C22782a(f13);
        C22782a c22782a4 = new C22782a(f13);
        C22792k c22792k = new C22792k();
        c22792k.f89766a = c22790i;
        c22792k.f89767b = c22790i2;
        c22792k.f89768c = c22790i3;
        c22792k.f89769d = c22790i4;
        c22792k.f89770e = c22782a;
        c22792k.f89771f = c22782a2;
        c22792k.f89772g = c22782a3;
        c22792k.f89773h = c22782a4;
        c22792k.f89774i = c22786e;
        c22792k.f89775j = c22786e2;
        c22792k.f89776k = c22786e3;
        c22792k.f89777l = c22786e4;
        C22788g c22788g = new C22788g(c22792k);
        c22788g.setTint(this.style.getDateSeparatorBackgroundColor());
        textView.setBackground(c22788g);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DateDividerViewHolder(ViewGroup parent, List<? extends Decorator> decorators, MessageListItemStyle style, StreamUiItemDateDividerBinding binding) {
        AbstractC22676k.m65750j(parent, "parent");
        AbstractC22676k.m65750j(decorators, "decorators");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(binding, "binding");
        FrameLayout root = binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        super(root, decorators);
        this.style = style;
        this.binding = binding;
    }
}
