package io.getstream.chat.android.p226ui.feature.messages.list.internal;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.AbstractC1707m0;
import androidx.recyclerview.widget.AbstractC1717o2;
import androidx.recyclerview.widget.RecyclerView;
import com.whoop.android.R;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.common.utils.extensions.C19616a;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.BaseMessageItemViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import java.util.WeakHashMap;
import l83.C23454a0;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 ;2\u00020\u0001:\u0001;B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJG\u0010$\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0006H\u0016¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R%\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+R.\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001b0\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+\"\u0004\b.\u0010/R\u001a\u00102\u001a\u0004\u0018\u00010\u0005*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u001e\u00106\u001a\u0004\u0018\u000103*\u0006\u0012\u0002\b\u00030\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0018\u0010:\u001a\u00020\u0011*\u0002078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006<"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;", "Landroidx/recyclerview/widget/m0;", "Landroid/graphics/drawable/Drawable;", "replyDrawable", "Lkotlin/Function1;", "Lio/getstream/chat/android/models/Message;", "", "canReply", "<init>", "(Landroid/graphics/drawable/Drawable;Lkotlin/jvm/functions/Function1;)V", "Landroidx/recyclerview/widget/o2;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;", "asBaseMessageItemViewHolder", "(Landroidx/recyclerview/widget/o2;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "viewHolder", "", "getMovementFlags", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o2;)I", "target", "onMove", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o2;Landroidx/recyclerview/widget/o2;)Z", "", "getSwipeThreshold", "(Landroidx/recyclerview/widget/o2;)F", "direction", "Ll83/a0;", "onSwiped", "(Landroidx/recyclerview/widget/o2;I)V", "Landroid/graphics/Canvas;", "canvas", "dX", "dY", "actionState", "isCurrentlyActive", "onChildDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o2;FFIZ)V", "Landroid/graphics/drawable/Drawable;", "getReplyDrawable", "()Landroid/graphics/drawable/Drawable;", "Lkotlin/jvm/functions/Function1;", "getCanReply", "()Lkotlin/jvm/functions/Function1;", "onReply", "getOnReply", "setOnReply", "(Lkotlin/jvm/functions/Function1;)V", "getMessage", "(Landroidx/recyclerview/widget/o2;)Lio/getstream/chat/android/models/Message;", "message", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "getMessageItem", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "messageItem", "Landroid/view/View;", "getMiddleVerticalPoint", "(Landroid/view/View;)I", "middleVerticalPoint", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SwipeReplyCallback extends AbstractC1707m0 {
    private static final int REPLY_DRAWABLE_SIZE_MULTIPLIER = 3;
    private final Function1 canReply;
    private Function1 onReply;
    private final Drawable replyDrawable;

    public SwipeReplyCallback(Drawable replyDrawable, Function1 canReply) {
        AbstractC22676k.m65750j(replyDrawable, "replyDrawable");
        AbstractC22676k.m65750j(canReply, "canReply");
        this.replyDrawable = replyDrawable;
        this.canReply = canReply;
        this.onReply = new C19616a(23);
    }

    private final BaseMessageItemViewHolder<?> asBaseMessageItemViewHolder(AbstractC1717o2 abstractC1717o2) {
        if (abstractC1717o2 instanceof BaseMessageItemViewHolder) {
            return (BaseMessageItemViewHolder) abstractC1717o2;
        }
        return null;
    }

    private final Message getMessage(AbstractC1717o2 abstractC1717o2) {
        MessageListItem.MessageItem messageItem;
        BaseMessageItemViewHolder<?> baseMessageItemViewHolderAsBaseMessageItemViewHolder = asBaseMessageItemViewHolder(abstractC1717o2);
        if (baseMessageItemViewHolderAsBaseMessageItemViewHolder == null || (messageItem = getMessageItem(baseMessageItemViewHolderAsBaseMessageItemViewHolder)) == null) {
            return null;
        }
        return messageItem.getMessage();
    }

    private final MessageListItem.MessageItem getMessageItem(BaseMessageItemViewHolder<?> baseMessageItemViewHolder) {
        MessageListItem data = baseMessageItemViewHolder.getData();
        if (data instanceof MessageListItem.MessageItem) {
            return (MessageListItem.MessageItem) data;
        }
        return null;
    }

    private final int getMiddleVerticalPoint(View view) {
        return (view.getBottom() + view.getTop()) / 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 onReply$lambda$0(Message it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    public final Function1 getCanReply() {
        return this.canReply;
    }

    @Override // androidx.recyclerview.widget.AbstractC1707m0
    public final int getMovementFlags(RecyclerView recyclerView, AbstractC1717o2 viewHolder) {
        AbstractC22676k.m65750j(recyclerView, "recyclerView");
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        boolean zBooleanValue = ((Boolean) this.canReply.invoke(getMessage(viewHolder))).booleanValue();
        if (zBooleanValue) {
            return AbstractC1707m0.makeMovementFlags(0, 8);
        }
        if (zBooleanValue) {
            throw new NoWhenBranchMatchedException();
        }
        return 0;
    }

    public final Function1 getOnReply() {
        return this.onReply;
    }

    public final Drawable getReplyDrawable() {
        return this.replyDrawable;
    }

    public final float getSwipeThreshold(AbstractC1717o2 viewHolder) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        return 0.3f;
    }

    @Override // androidx.recyclerview.widget.AbstractC1707m0
    public final void onChildDraw(Canvas canvas, RecyclerView recyclerView, AbstractC1717o2 viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
        AbstractC22676k.m65750j(canvas, "canvas");
        AbstractC22676k.m65750j(recyclerView, "recyclerView");
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        int iMin = Math.min((int) dX, this.replyDrawable.getIntrinsicWidth() * 3);
        View itemView = viewHolder.itemView;
        AbstractC22676k.m65749i(itemView, "itemView");
        int middleVerticalPoint = getMiddleVerticalPoint(itemView) - (this.replyDrawable.getIntrinsicHeight() / 2);
        this.replyDrawable.setBounds(new Rect(iMin - this.replyDrawable.getIntrinsicWidth(), middleVerticalPoint, iMin, this.replyDrawable.getIntrinsicHeight() + middleVerticalPoint));
        float fMin = Math.min(dX, recyclerView.getWidth() / 2);
        View view = viewHolder.itemView;
        if (isCurrentlyActive && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            Float fValueOf = Float.valueOf(AbstractC16877h0.m47510e(view));
            int childCount = recyclerView.getChildCount();
            float f13 = 0.0f;
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = recyclerView.getChildAt(i13);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = AbstractC16901p0.f64851a;
                    float fM47510e = AbstractC16877h0.m47510e(childAt);
                    if (fM47510e > f13) {
                        f13 = fM47510e;
                    }
                }
            }
            AbstractC16877h0.m47516k(view, f13 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, fValueOf);
        }
        view.setTranslationX(fMin);
        view.setTranslationY(dY);
        this.replyDrawable.draw(canvas);
    }

    public final boolean onMove(RecyclerView recyclerView, AbstractC1717o2 viewHolder, AbstractC1717o2 target) {
        AbstractC22676k.m65750j(recyclerView, "recyclerView");
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(target, "target");
        return false;
    }

    public final void onSwiped(AbstractC1717o2 viewHolder, int direction) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        Message message = getMessage(viewHolder);
        if (message != null) {
            this.onReply.invoke(message);
        }
    }

    public final void setOnReply(Function1 function1) {
        AbstractC22676k.m65750j(function1, "<set-?>");
        this.onReply = function1;
    }
}
