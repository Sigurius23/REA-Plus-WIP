package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.IntKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Ll83/a0;", "showSmallGap", "()V", "showBigGap", "Landroid/view/View;", "smallGap", "Landroid/view/View;", "bigGap", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class GapView extends LinearLayout {
    private static final int BIG_GAP_HEIGHT_DP = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final int SMALL_GAP_HEIGHT_DP = 2;
    private final View bigGap;
    private final View smallGap;

    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView$Companion;", "", "<init>", "()V", "SMALL_GAP_HEIGHT_DP", "", "BIG_GAP_HEIGHT_DP", "createLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "height", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ViewGroup.LayoutParams createLayoutParams(int height) {
            return new LinearLayout.LayoutParams(-1, height);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GapView(Context context) {
        super(ContextKt.createStreamThemeWrapper(context));
        AbstractC22676k.m65750j(context, "context");
        Space space = new Space(getContext());
        Companion companion = INSTANCE;
        space.setLayoutParams(companion.createLayoutParams(IntKt.dpToPx(2)));
        space.setVisibility(8);
        this.smallGap = space;
        Space space2 = new Space(getContext());
        space2.setLayoutParams(companion.createLayoutParams(IntKt.dpToPx(8)));
        space2.setVisibility(8);
        this.bigGap = space2;
        addView(space);
        addView(space2);
    }

    public final void showBigGap() {
        this.smallGap.setVisibility(8);
        this.bigGap.setVisibility(0);
    }

    public final void showSmallGap() {
        this.smallGap.setVisibility(0);
        this.bigGap.setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GapView(Context context, AttributeSet attributeSet) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet);
        AbstractC22676k.m65750j(context, "context");
        Space space = new Space(getContext());
        Companion companion = INSTANCE;
        space.setLayoutParams(companion.createLayoutParams(IntKt.dpToPx(2)));
        space.setVisibility(8);
        this.smallGap = space;
        Space space2 = new Space(getContext());
        space2.setLayoutParams(companion.createLayoutParams(IntKt.dpToPx(8)));
        space2.setVisibility(8);
        this.bigGap = space2;
        addView(space);
        addView(space2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GapView(Context context, AttributeSet attributeSet, int i13) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        Space space = new Space(getContext());
        Companion companion = INSTANCE;
        space.setLayoutParams(companion.createLayoutParams(IntKt.dpToPx(2)));
        space.setVisibility(8);
        this.smallGap = space;
        Space space2 = new Space(getContext());
        space2.setLayoutParams(companion.createLayoutParams(IntKt.dpToPx(8)));
        space2.setVisibility(8);
        this.bigGap = space2;
        addView(space);
        addView(space2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GapView(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13, i14);
        AbstractC22676k.m65750j(context, "context");
        Space space = new Space(getContext());
        Companion companion = INSTANCE;
        space.setLayoutParams(companion.createLayoutParams(IntKt.dpToPx(2)));
        space.setVisibility(8);
        this.smallGap = space;
        Space space2 = new Space(getContext());
        space2.setLayoutParams(companion.createLayoutParams(IntKt.dpToPx(8)));
        space2.setVisibility(8);
        this.bigGap = space2;
        addView(space);
        addView(space2);
    }
}
