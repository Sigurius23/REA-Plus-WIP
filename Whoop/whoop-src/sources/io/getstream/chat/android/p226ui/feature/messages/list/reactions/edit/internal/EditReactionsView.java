package io.getstream.chat.android.p226ui.feature.messages.list.reactions.edit.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import i93.C18284j;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.p226ui.ChatUI;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.ReactionClickListener;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.edit.EditReactionsViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.internal.ReactionItem;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.internal.ReactionsAdapter;
import io.getstream.chat.android.p226ui.helper.SupportedReactions;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.IntKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p465rm.C31559p;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u001d\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010%\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010.R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010/R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00100R\u0016\u00101\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102¨\u00064"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ll83/a0;", "init", "Lio/getstream/chat/android/models/Message;", "message", "", "isMyMessage", "setMessage", "(Lio/getstream/chat/android/models/Message;Z)V", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;", "reactionClickListener", "setReactionClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;", "editReactionsViewStyle", "applyStyle$stream_chat_android_ui_components_release", "(Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;)V", "applyStyle", "", "messageAnchorPosition", "positionBubbleTail$stream_chat_android_ui_components_release", "(F)V", "positionBubbleTail", "reactionsViewStyle", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter;", "reactionsAdapter", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter;", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;", "bubbleDrawer", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;", "Z", "F", "bubbleHeight", "I", "reactionsColumns", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class EditReactionsView extends RecyclerView {
    private EditReactionsBubbleDrawer bubbleDrawer;
    private int bubbleHeight;
    private boolean isMyMessage;
    private float messageAnchorPosition;
    private ReactionClickListener reactionClickListener;
    private ReactionsAdapter reactionsAdapter;
    private int reactionsColumns;
    private EditReactionsViewStyle reactionsViewStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditReactionsView(Context context) {
        super(ContextKt.createStreamThemeWrapper(context), null);
        AbstractC22676k.m65750j(context, "context");
        this.reactionsColumns = 5;
        init(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyStyle$lambda$2(EditReactionsView editReactionsView, String it) {
        AbstractC22676k.m65750j(it, "it");
        ReactionClickListener reactionClickListener = editReactionsView.reactionClickListener;
        if (reactionClickListener != null) {
            reactionClickListener.onReactionClick(it);
        }
    }

    private final void init(Context context, AttributeSet attrs) {
        EditReactionsViewStyle editReactionsViewStyleInvoke$stream_chat_android_ui_components_release = EditReactionsViewStyle.INSTANCE.invoke$stream_chat_android_ui_components_release(context, attrs);
        applyStyle$stream_chat_android_ui_components_release(editReactionsViewStyleInvoke$stream_chat_android_ui_components_release);
        this.bubbleHeight = editReactionsViewStyleInvoke$stream_chat_android_ui_components_release.getBubbleHeight();
        setItemAnimator(null);
        setOverScrollMode(2);
        setWillNotDraw(false);
    }

    public final void applyStyle$stream_chat_android_ui_components_release(EditReactionsViewStyle editReactionsViewStyle) {
        AbstractC22676k.m65750j(editReactionsViewStyle, "editReactionsViewStyle");
        this.reactionsViewStyle = editReactionsViewStyle;
        this.bubbleDrawer = new EditReactionsBubbleDrawer(editReactionsViewStyle);
        this.reactionsColumns = Math.min(ChatUI.getSupportedReactions().getReactions().size(), editReactionsViewStyle.getReactionsColumn());
        EditReactionsViewStyle editReactionsViewStyle2 = this.reactionsViewStyle;
        if (editReactionsViewStyle2 == null) {
            AbstractC22676k.m65757q("reactionsViewStyle");
            throw null;
        }
        int horizontalPadding = editReactionsViewStyle2.getHorizontalPadding();
        EditReactionsViewStyle editReactionsViewStyle3 = this.reactionsViewStyle;
        if (editReactionsViewStyle3 == null) {
            AbstractC22676k.m65757q("reactionsViewStyle");
            throw null;
        }
        int verticalPadding = editReactionsViewStyle3.getVerticalPadding();
        EditReactionsViewStyle editReactionsViewStyle4 = this.reactionsViewStyle;
        if (editReactionsViewStyle4 == null) {
            AbstractC22676k.m65757q("reactionsViewStyle");
            throw null;
        }
        int horizontalPadding2 = editReactionsViewStyle4.getHorizontalPadding();
        EditReactionsViewStyle editReactionsViewStyle5 = this.reactionsViewStyle;
        if (editReactionsViewStyle5 == null) {
            AbstractC22676k.m65757q("reactionsViewStyle");
            throw null;
        }
        setPadding(horizontalPadding, verticalPadding, horizontalPadding2, editReactionsViewStyle5.getVerticalPadding());
        getContext();
        setLayoutManager(new GridLayoutManager(this.reactionsColumns));
        EditReactionsViewStyle editReactionsViewStyle6 = this.reactionsViewStyle;
        if (editReactionsViewStyle6 == null) {
            AbstractC22676k.m65757q("reactionsViewStyle");
            throw null;
        }
        ReactionsAdapter reactionsAdapter = new ReactionsAdapter(editReactionsViewStyle6.getItemSize(), new C31559p(this, 15));
        this.reactionsAdapter = reactionsAdapter;
        setAdapter(reactionsAdapter);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        AbstractC22676k.m65750j(canvas, "canvas");
        super.onDraw(canvas);
        int width = getWidth();
        int iDpToPx = IntKt.dpToPx(12);
        C18284j c18284j = new C18284j(iDpToPx, width - iDpToPx, 1);
        EditReactionsBubbleDrawer editReactionsBubbleDrawer = this.bubbleDrawer;
        if (editReactionsBubbleDrawer == null) {
            AbstractC22676k.m65757q("bubbleDrawer");
            throw null;
        }
        Context context = getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        editReactionsBubbleDrawer.drawReactionsBubble(context, canvas, getWidth(), this.bubbleHeight, this.isMyMessage, true, this.messageAnchorPosition, c18284j);
    }

    public final void positionBubbleTail$stream_chat_android_ui_components_release(float messageAnchorPosition) {
        this.messageAnchorPosition = messageAnchorPosition;
        requestLayout();
    }

    public final void setMessage(Message message, boolean isMyMessage) {
        AbstractC22676k.m65750j(message, "message");
        this.isMyMessage = isMyMessage;
        Map<String, SupportedReactions.ReactionDrawable> reactions = ChatUI.getSupportedReactions().getReactions();
        ArrayList arrayList = new ArrayList(reactions.size());
        for (Map.Entry<String, SupportedReactions.ReactionDrawable> entry : reactions.entrySet()) {
            String key = entry.getKey();
            SupportedReactions.ReactionDrawable value = entry.getValue();
            List<Reaction> ownReactions = message.getOwnReactions();
            boolean z4 = false;
            if (!(ownReactions instanceof Collection) || !ownReactions.isEmpty()) {
                Iterator<T> it = ownReactions.iterator();
                while (it.hasNext()) {
                    if (AbstractC22676k.m65745e(((Reaction) it.next()).getType(), key)) {
                        z4 = true;
                        break;
                    }
                }
            }
            arrayList.add(new ReactionItem(key, z4, value));
        }
        if (arrayList.size() > this.reactionsColumns) {
            this.bubbleHeight *= (int) Math.ceil(arrayList.size() / this.reactionsColumns);
        }
        setMinimumHeight(IntKt.dpToPx(16) + this.bubbleHeight);
        ReactionsAdapter reactionsAdapter = this.reactionsAdapter;
        if (reactionsAdapter == null) {
            AbstractC22676k.m65757q("reactionsAdapter");
            throw null;
        }
        reactionsAdapter.submitList(arrayList);
    }

    public final void setReactionClickListener(ReactionClickListener reactionClickListener) {
        AbstractC22676k.m65750j(reactionClickListener, "reactionClickListener");
        this.reactionClickListener = reactionClickListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditReactionsView(Context context, AttributeSet attributeSet) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet);
        AbstractC22676k.m65750j(context, "context");
        this.reactionsColumns = 5;
        init(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditReactionsView(Context context, AttributeSet attributeSet, int i13) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.reactionsColumns = 5;
        init(context, attributeSet);
    }
}
