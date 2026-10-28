package io.getstream.chat.android.p226ui.feature.messages.list.reactions.view.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c93.InterfaceC4339a;
import hn.C17508p;
import io.getstream.chat.android.client.C19383k;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.p226ui.ChatUI;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.ReactionClickListener;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.internal.ReactionItem;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.internal.ReactionsAdapter;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.view.ViewReactionsViewStyle;
import io.getstream.chat.android.p226ui.helper.SupportedReactions;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.MessageKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import p009a8.RunnableC0533c;
import p705ea2.C12915l;
import p708hb2.C17098f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0018\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010&\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010/R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00100R\u0016\u00101\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00100¨\u00062"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ll83/a0;", "init", "Lio/getstream/chat/android/models/Message;", "message", "", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionItem;", "createReactionItems", "(Lio/getstream/chat/android/models/Message;)Ljava/util/List;", "", "isMyMessage", "Lkotlin/Function0;", "commitCallback", "setMessage", "(Lio/getstream/chat/android/models/Message;ZLc93/a;)V", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;", "reactionClickListener", "setReactionClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;", "style", "applyStyle$stream_chat_android_ui_components_release", "(Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;)V", "applyStyle", "reactionsViewStyle", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter;", "reactionsAdapter", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter;", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;", "bubbleDrawer", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;", "Z", "isSingleReaction", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ViewReactionsView extends RecyclerView {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ int f74799w = 0;
    private ViewReactionsBubbleDrawer bubbleDrawer;
    private boolean isMyMessage;
    private boolean isSingleReaction;
    private ReactionClickListener reactionClickListener;
    private ReactionsAdapter reactionsAdapter;
    private ViewReactionsViewStyle reactionsViewStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewReactionsView(Context context) {
        super(ContextKt.createStreamThemeWrapper(context), null);
        AbstractC22676k.m65750j(context, "context");
        this.isSingleReaction = true;
        init(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyStyle$lambda$2(ViewReactionsView viewReactionsView, String it) {
        AbstractC22676k.m65750j(it, "it");
        ReactionClickListener reactionClickListener = viewReactionsView.reactionClickListener;
        if (reactionClickListener != null) {
            reactionClickListener.onReactionClick(it);
        }
    }

    private final List<ReactionItem> createReactionItems(Message message) {
        ReactionItem reactionItem;
        List listM74152u1 = AbstractC25265s.m74152u1(AbstractC25247g0.m73999h0(MessageKt.getSupportedReactionGroups(message)), new C12915l(new C17098f(this, 15), 5));
        ArrayList arrayList = new ArrayList();
        Iterator it = listM74152u1.iterator();
        while (it.hasNext()) {
            String str = (String) ((C23465k) it.next()).f92937w;
            SupportedReactions.ReactionDrawable reactionDrawable = ChatUI.getSupportedReactions().getReactionDrawable(str);
            if (reactionDrawable != null) {
                List<Reaction> ownReactions = message.getOwnReactions();
                boolean z4 = false;
                if (!(ownReactions instanceof Collection) || !ownReactions.isEmpty()) {
                    Iterator<T> it3 = ownReactions.iterator();
                    while (it3.hasNext()) {
                        if (AbstractC22676k.m65745e(((Reaction) it3.next()).getType(), str)) {
                            z4 = true;
                            break;
                        }
                    }
                }
                reactionItem = new ReactionItem(str, z4, reactionDrawable);
            } else {
                reactionItem = null;
            }
            if (reactionItem != null) {
                arrayList.add(reactionItem);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int createReactionItems$lambda$4(ViewReactionsView viewReactionsView, C23465k c23465k, C23465k c23465k2) {
        ViewReactionsViewStyle viewReactionsViewStyle = viewReactionsView.reactionsViewStyle;
        if (viewReactionsViewStyle != null) {
            return viewReactionsViewStyle.getReactionSorting().compare(c23465k.f92938x, c23465k2.f92938x);
        }
        AbstractC22676k.m65757q("reactionsViewStyle");
        throw null;
    }

    private final void init(Context context, AttributeSet attrs) {
        applyStyle$stream_chat_android_ui_components_release(ViewReactionsViewStyle.INSTANCE.invoke(context, attrs));
        setLayoutManager(new LinearLayoutManager(0));
        setItemAnimator(null);
        setOverScrollMode(2);
        setWillNotDraw(false);
    }

    public static /* synthetic */ void setMessage$default(ViewReactionsView viewReactionsView, Message message, boolean z4, InterfaceC4339a interfaceC4339a, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            interfaceC4339a = new C19383k(23);
        }
        viewReactionsView.setMessage(message, z4, interfaceC4339a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setMessage$lambda$1(ViewReactionsView viewReactionsView, InterfaceC4339a interfaceC4339a) {
        ViewReactionsViewStyle viewReactionsViewStyle = viewReactionsView.reactionsViewStyle;
        if (viewReactionsViewStyle == null) {
            AbstractC22676k.m65757q("reactionsViewStyle");
            throw null;
        }
        int horizontalPadding = viewReactionsViewStyle.getHorizontalPadding();
        ViewReactionsViewStyle viewReactionsViewStyle2 = viewReactionsView.reactionsViewStyle;
        if (viewReactionsViewStyle2 == null) {
            AbstractC22676k.m65757q("reactionsViewStyle");
            throw null;
        }
        int verticalPadding = viewReactionsViewStyle2.getVerticalPadding();
        ViewReactionsViewStyle viewReactionsViewStyle3 = viewReactionsView.reactionsViewStyle;
        if (viewReactionsViewStyle3 == null) {
            AbstractC22676k.m65757q("reactionsViewStyle");
            throw null;
        }
        int horizontalPadding2 = viewReactionsViewStyle3.getHorizontalPadding();
        ViewReactionsViewStyle viewReactionsViewStyle4 = viewReactionsView.reactionsViewStyle;
        if (viewReactionsViewStyle4 == null) {
            AbstractC22676k.m65757q("reactionsViewStyle");
            throw null;
        }
        viewReactionsView.setPadding(horizontalPadding, verticalPadding, horizontalPadding2, viewReactionsViewStyle4.getVerticalPadding());
        interfaceC4339a.invoke();
    }

    public final void applyStyle$stream_chat_android_ui_components_release(ViewReactionsViewStyle style) {
        AbstractC22676k.m65750j(style, "style");
        this.reactionsViewStyle = style;
        ViewReactionsViewStyle viewReactionsViewStyle = this.reactionsViewStyle;
        if (viewReactionsViewStyle == null) {
            AbstractC22676k.m65757q("reactionsViewStyle");
            throw null;
        }
        this.bubbleDrawer = new ViewReactionsBubbleDrawer(viewReactionsViewStyle);
        ViewReactionsViewStyle viewReactionsViewStyle2 = this.reactionsViewStyle;
        if (viewReactionsViewStyle2 == null) {
            AbstractC22676k.m65757q("reactionsViewStyle");
            throw null;
        }
        setMinimumHeight(viewReactionsViewStyle2.getTotalHeight());
        ViewReactionsViewStyle viewReactionsViewStyle3 = this.reactionsViewStyle;
        if (viewReactionsViewStyle3 == null) {
            AbstractC22676k.m65757q("reactionsViewStyle");
            throw null;
        }
        int horizontalPadding = viewReactionsViewStyle3.getHorizontalPadding();
        ViewReactionsViewStyle viewReactionsViewStyle4 = this.reactionsViewStyle;
        if (viewReactionsViewStyle4 == null) {
            AbstractC22676k.m65757q("reactionsViewStyle");
            throw null;
        }
        int verticalPadding = viewReactionsViewStyle4.getVerticalPadding();
        ViewReactionsViewStyle viewReactionsViewStyle5 = this.reactionsViewStyle;
        if (viewReactionsViewStyle5 == null) {
            AbstractC22676k.m65757q("reactionsViewStyle");
            throw null;
        }
        int horizontalPadding2 = viewReactionsViewStyle5.getHorizontalPadding();
        ViewReactionsViewStyle viewReactionsViewStyle6 = this.reactionsViewStyle;
        if (viewReactionsViewStyle6 == null) {
            AbstractC22676k.m65757q("reactionsViewStyle");
            throw null;
        }
        setPadding(horizontalPadding, verticalPadding, horizontalPadding2, viewReactionsViewStyle6.getVerticalPadding());
        ViewReactionsViewStyle viewReactionsViewStyle7 = this.reactionsViewStyle;
        if (viewReactionsViewStyle7 == null) {
            AbstractC22676k.m65757q("reactionsViewStyle");
            throw null;
        }
        ReactionsAdapter reactionsAdapter = new ReactionsAdapter(viewReactionsViewStyle7.getItemSize(), new C17508p(this, 11));
        this.reactionsAdapter = reactionsAdapter;
        setAdapter(reactionsAdapter);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        AbstractC22676k.m65750j(canvas, "canvas");
        super.onDraw(canvas);
        ViewReactionsBubbleDrawer viewReactionsBubbleDrawer = this.bubbleDrawer;
        if (viewReactionsBubbleDrawer == null) {
            AbstractC22676k.m65757q("bubbleDrawer");
            throw null;
        }
        Context context = getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        ViewReactionsBubbleDrawer.drawReactionsBubble$default(viewReactionsBubbleDrawer, context, canvas, getWidth(), this.isMyMessage, this.isSingleReaction, false, 32, null);
    }

    public final void setMessage(Message message, boolean isMyMessage, InterfaceC4339a commitCallback) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(commitCallback, "commitCallback");
        this.isMyMessage = isMyMessage;
        this.isSingleReaction = MessageKt.hasSingleReaction(message);
        ReactionsAdapter reactionsAdapter = this.reactionsAdapter;
        if (reactionsAdapter != null) {
            reactionsAdapter.submitList(createReactionItems(message), new RunnableC0533c(26, this, commitCallback));
        } else {
            AbstractC22676k.m65757q("reactionsAdapter");
            throw null;
        }
    }

    public final void setReactionClickListener(ReactionClickListener reactionClickListener) {
        AbstractC22676k.m65750j(reactionClickListener, "reactionClickListener");
        this.reactionClickListener = reactionClickListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewReactionsView(Context context, AttributeSet attributeSet) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet);
        AbstractC22676k.m65750j(context, "context");
        this.isSingleReaction = true;
        init(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewReactionsView(Context context, AttributeSet attributeSet, int i13) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.isSingleReaction = true;
        init(context, attributeSet);
    }
}
