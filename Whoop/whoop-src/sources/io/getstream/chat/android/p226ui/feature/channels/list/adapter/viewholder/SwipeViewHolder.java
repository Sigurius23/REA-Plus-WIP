package io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import i93.InterfaceC18280f;
import io.getstream.chat.android.p226ui.feature.channels.list.ChannelListView;
import io.getstream.chat.android.p226ui.utils.extensions.IntKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22659b0;
import p715kotlin.jvm.internal.C22663d0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u0000 $2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH&¢\u0006\u0004\b\u0012\u0010\u0011J!\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\u000f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010#¨\u0006%"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/BaseChannelListItemViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "getSwipeView", "()Landroid/view/View;", "", "getOpenedX", "()F", "getClosedX", "Li93/f;", "getSwipeDeltaRange", "()Li93/f;", "", "isSwipeEnabled", "()Z", "isSwiped", ProfileAnalyticsKt.VIEW, "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;", "swipeListener", "Ll83/a0;", "setSwipeListener", "(Landroid/view/View;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;)V", "listener", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;", "getListener", "()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;", "setListener", "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;)V", "swiping", "Z", "getSwiping", "setSwiping", "(Z)V", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class SwipeViewHolder extends BaseChannelListItemViewHolder {
    private static final Companion Companion = new Companion();
    private static final float SWIPE_THRESHOLD = IntKt.dpToPxPrecise(16);
    private ChannelListView.SwipeListener listener;
    private boolean swiping;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder$Companion;", "", "<init>", "()V", "SWIPE_THRESHOLD", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeViewHolder(View itemView) {
        super(itemView);
        AbstractC22676k.m65750j(itemView, "itemView");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setSwipeListener$lambda$0(SwipeViewHolder swipeViewHolder, C22663d0 c22663d0, C22663d0 c22663d1, C22663d0 c22663d2, C22659b0 c22659b0, ChannelListView.SwipeListener swipeListener, View view, MotionEvent motionEvent) {
        boolean z4 = false;
        if (swipeViewHolder.isSwipeEnabled()) {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            int action = motionEvent.getAction();
            if (action == 0) {
                c22663d0.f89331w = rawX;
                c22663d1.f89331w = rawY;
                c22663d2.f89331w = c22663d0.f89331w;
                swipeViewHolder.swiping = false;
                return false;
            }
            if (action != 1) {
                if (action == 2) {
                    float f13 = rawX - c22663d0.f89331w;
                    float f14 = rawY - c22663d1.f89331w;
                    float f15 = rawX - c22663d2.f89331w;
                    c22663d2.f89331w = rawX;
                    c22659b0.f89329w = swipeViewHolder.swiping;
                    z4 = Math.abs(f13) > Math.abs(f14);
                    swipeViewHolder.swiping = z4;
                    boolean z13 = c22659b0.f89329w;
                    if (z13 || !z4) {
                        if (z4) {
                            if (swipeListener != null) {
                                swipeListener.onSwipeChanged(swipeViewHolder, swipeViewHolder.getAbsoluteAdapterPosition(), f15, f13);
                            }
                        } else if (z13 && !z4 && swipeListener != null) {
                            swipeListener.onSwipeCanceled(swipeViewHolder, swipeViewHolder.getAbsoluteAdapterPosition(), Float.valueOf(rawX), Float.valueOf(rawY));
                        }
                    } else if (swipeListener != null) {
                        swipeListener.onSwipeStarted(swipeViewHolder, swipeViewHolder.getAbsoluteAdapterPosition(), Float.valueOf(rawX), Float.valueOf(rawY));
                    }
                    return swipeViewHolder.swiping;
                }
                if (action == 3) {
                    if (c22659b0.f89329w) {
                        swipeViewHolder.swiping = false;
                        c22659b0.f89329w = false;
                        if (swipeListener != null) {
                            swipeListener.onSwipeCanceled(swipeViewHolder, swipeViewHolder.getAbsoluteAdapterPosition(), Float.valueOf(rawX), Float.valueOf(rawY));
                        }
                    }
                    return c22659b0.f89329w;
                }
            } else if (c22659b0.f89329w) {
                swipeViewHolder.swiping = false;
                c22659b0.f89329w = false;
                z4 = Math.abs(rawX - c22663d0.f89331w) > SWIPE_THRESHOLD;
                if (swipeListener != null) {
                    swipeListener.onSwipeCompleted(swipeViewHolder, swipeViewHolder.getAbsoluteAdapterPosition(), Float.valueOf(rawX), Float.valueOf(rawY));
                }
            }
        }
        return z4;
    }

    public abstract float getClosedX();

    public final ChannelListView.SwipeListener getListener() {
        return this.listener;
    }

    public abstract float getOpenedX();

    public abstract InterfaceC18280f getSwipeDeltaRange();

    public abstract View getSwipeView();

    public final boolean getSwiping() {
        return this.swiping;
    }

    public abstract boolean isSwipeEnabled();

    public abstract boolean isSwiped();

    public final void setListener(ChannelListView.SwipeListener swipeListener) {
        this.listener = swipeListener;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setSwipeListener(View view, final ChannelListView.SwipeListener swipeListener) {
        AbstractC22676k.m65750j(view, "view");
        final C22663d0 c22663d0 = new C22663d0();
        final C22663d0 c22663d1 = new C22663d0();
        final C22663d0 c22663d2 = new C22663d0();
        final C22659b0 c22659b0 = new C22659b0();
        this.listener = swipeListener;
        view.setOnTouchListener(new View.OnTouchListener() { // from class: io.getstream.chat.android.ui.feature.channels.list.adapter.viewholder.e
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return SwipeViewHolder.setSwipeListener$lambda$0(this.f74489w, c22663d0, c22663d1, c22663d2, c22659b0, swipeListener, view2, motionEvent);
            }
        });
    }

    public final void setSwiping(boolean z4) {
        this.swiping = z4;
    }
}
