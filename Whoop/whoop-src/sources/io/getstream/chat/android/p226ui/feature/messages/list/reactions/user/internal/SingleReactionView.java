package io.getstream.chat.android.p226ui.feature.messages.list.reactions.user.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemMessageReactionBinding;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.user.SingleReactionViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.view.MessageOptionsUserReactionOrientation;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.view.MessageOptionsUserReactionOrientationKt;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/SingleReactionView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ll83/a0;", "init", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;", "userReactionItem", "setReaction", "(Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageReactionBinding;", "binding", "Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageReactionBinding;", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;", "reactionsViewStyle", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/SingleReactionViewBubbleDrawer;", "bubbleDrawer", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/SingleReactionViewBubbleDrawer;", "", "isMyMessage", "Z", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/MessageOptionsUserReactionOrientation;", "getMessageOrientation", "()Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/MessageOptionsUserReactionOrientation;", "messageOrientation", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SingleReactionView extends FrameLayout {
    private final StreamUiItemMessageReactionBinding binding;
    private SingleReactionViewBubbleDrawer bubbleDrawer;
    private boolean isMyMessage;
    private SingleReactionViewStyle reactionsViewStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleReactionView(Context context) {
        super(ContextKt.createStreamThemeWrapper(context));
        AbstractC22676k.m65750j(context, "context");
        this.binding = StreamUiItemMessageReactionBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this, true);
        init(context, null);
    }

    private final MessageOptionsUserReactionOrientation getMessageOrientation() {
        SingleReactionViewStyle singleReactionViewStyle = this.reactionsViewStyle;
        if (singleReactionViewStyle != null) {
            return MessageOptionsUserReactionOrientationKt.getUserReactionOrientation(singleReactionViewStyle.getReactionOrientation());
        }
        AbstractC22676k.m65757q("reactionsViewStyle");
        throw null;
    }

    private final void init(Context context, AttributeSet attrs) {
        SingleReactionViewStyle singleReactionViewStyleInvoke = SingleReactionViewStyle.INSTANCE.invoke(context, attrs);
        this.reactionsViewStyle = singleReactionViewStyleInvoke;
        if (singleReactionViewStyleInvoke == null) {
            AbstractC22676k.m65757q("reactionsViewStyle");
            throw null;
        }
        this.bubbleDrawer = new SingleReactionViewBubbleDrawer(singleReactionViewStyleInvoke);
        setWillNotDraw(false);
        SingleReactionViewStyle singleReactionViewStyle = this.reactionsViewStyle;
        if (singleReactionViewStyle != null) {
            setMinimumHeight(singleReactionViewStyle.getTotalHeight());
        } else {
            AbstractC22676k.m65757q("reactionsViewStyle");
            throw null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        AbstractC22676k.m65750j(canvas, "canvas");
        super.onDraw(canvas);
        boolean zIsOrientedTowardsStart = MessageOptionsUserReactionOrientationKt.isOrientedTowardsStart(getMessageOrientation(), this.isMyMessage);
        SingleReactionViewBubbleDrawer singleReactionViewBubbleDrawer = this.bubbleDrawer;
        if (singleReactionViewBubbleDrawer == null) {
            AbstractC22676k.m65757q("bubbleDrawer");
            throw null;
        }
        Context context = getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        singleReactionViewBubbleDrawer.drawReactionsBubble(context, canvas, getWidth(), this.isMyMessage, zIsOrientedTowardsStart);
    }

    public final void setReaction(UserReactionItem userReactionItem) {
        AbstractC22676k.m65750j(userReactionItem, "userReactionItem");
        this.isMyMessage = userReactionItem.isMine();
        this.binding.reactionIcon.setImageDrawable(userReactionItem.getDrawable());
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleReactionView(Context context, AttributeSet attributeSet) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet);
        AbstractC22676k.m65750j(context, "context");
        this.binding = StreamUiItemMessageReactionBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this, true);
        init(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleReactionView(Context context, AttributeSet attributeSet, int i13) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.binding = StreamUiItemMessageReactionBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this, true);
        init(context, attributeSet);
    }
}
