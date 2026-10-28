package io.getstream.chat.android.p226ui.feature.messages.list.adapter;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.AbstractC1717o2;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import io.getstream.chat.android.p226ui.common.internal.AnimationUtilsKt;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import l83.InterfaceC23462h;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0015\u0010\nJ\u000f\u0010\u0017\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0016\u0010\nJ\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\nJ\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\nR\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR$\u0010\u0013\u001a\u00028\u00002\u0006\u0010 \u001a\u00028\u00008\u0006@BX\u0086.¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010(\u001a\u00020'8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;", "T", "Landroidx/recyclerview/widget/o2;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Ll83/a0;", "cancelHighlightAnimation", "()V", "messageContainerView", "()Landroid/view/View;", "messageListItem", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;", "diff", "bindListItem$stream_chat_android_ui_components_release", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V", "bindListItem", "data", "bindData", "unbind", "startHighlightAnimation$stream_chat_android_ui_components_release", "startHighlightAnimation", "onDetachedFromWindow", "onAttachedToWindow", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "value", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;", "getData", "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;", "Landroid/animation/ValueAnimator;", "highlightAnimation", "Landroid/animation/ValueAnimator;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class BaseMessageItemViewHolder<T extends MessageListItem> extends AbstractC1717o2 {
    private final Context context;
    private T data;
    private ValueAnimator highlightAnimation;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMessageItemViewHolder(View itemView) {
        super(itemView);
        AbstractC22676k.m65750j(itemView, "itemView");
        this.logger = AbstractC1772c1.m5382S(this, "Chat:MessageItemBaseVH");
        Context context = itemView.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        this.context = context;
    }

    private final void cancelHighlightAnimation() {
        ValueAnimator valueAnimator = this.highlightAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.highlightAnimation = null;
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    public abstract void bindData(T data, MessageListItemPayloadDiff diff);

    /* JADX WARN: Multi-variable type inference failed */
    public final void bindListItem$stream_chat_android_ui_components_release(MessageListItem messageListItem, MessageListItemPayloadDiff diff) {
        AbstractC22676k.m65750j(messageListItem, "messageListItem");
        AbstractC22676k.m65750j(diff, "diff");
        this.data = messageListItem;
        try {
            bindData(messageListItem, diff);
        } catch (Throwable th3) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, AbstractC2875y.m8301n("[bindListItem] failed: ", th3), th3);
            }
            throw th3;
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final T getData() {
        T t14 = this.data;
        if (t14 != null) {
            return t14;
        }
        AbstractC22676k.m65757q("data");
        throw null;
    }

    public View messageContainerView() {
        return null;
    }

    public void onAttachedToWindow() {
    }

    public void onDetachedFromWindow() {
    }

    /* JADX INFO: renamed from: startHighlightAnimation$stream_chat_android_ui_components_release */
    public final void m55426xb1d0af1f() {
        View itemView = this.itemView;
        AbstractC22676k.m65749i(itemView, "itemView");
        this.highlightAnimation = AnimationUtilsKt.animateHighlight$default(itemView, 0, 1, null);
    }

    public void unbind() {
        cancelHighlightAnimation();
    }
}
