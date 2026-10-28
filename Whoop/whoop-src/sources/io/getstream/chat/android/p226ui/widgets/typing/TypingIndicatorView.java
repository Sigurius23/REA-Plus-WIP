package io.getstream.chat.android.p226ui.widgets.typing;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.IntKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ll83/a0;", "init", "(Landroid/util/AttributeSet;)V", "", "Lio/getstream/chat/android/models/User;", "users", "setTypingUsers", "(Ljava/util/List;)V", "Landroid/widget/TextView;", "userTypingTextView", "Landroid/widget/TextView;", "Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;", "style", "Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class TypingIndicatorView extends LinearLayout {
    private TypingIndicatorViewStyle style;
    private final TextView userTypingTextView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypingIndicatorView(Context context) {
        super(ContextKt.createStreamThemeWrapper(context));
        AbstractC22676k.m65750j(context, "context");
        this.userTypingTextView = new TextView(getContext());
        init(null);
    }

    private final void init(AttributeSet attrs) {
        int iDpToPx = IntKt.dpToPx(8);
        setPadding(iDpToPx, 0, iDpToPx, 0);
        setGravity(16);
        setOrientation(0);
        setVisibility(8);
        TypingIndicatorViewStyle.Companion companion = TypingIndicatorViewStyle.INSTANCE;
        Context context = getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        this.style = companion.invoke(context, attrs);
        LayoutInflater streamThemeInflater = ViewGroupKt.getStreamThemeInflater(this);
        TypingIndicatorViewStyle typingIndicatorViewStyle = this.style;
        if (typingIndicatorViewStyle == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        streamThemeInflater.inflate(typingIndicatorViewStyle.getTypingIndicatorAnimationView(), this);
        TextView textView = this.userTypingTextView;
        TypingIndicatorViewStyle typingIndicatorViewStyle2 = this.style;
        if (typingIndicatorViewStyle2 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        TextStyleKt.setTextStyle(textView, typingIndicatorViewStyle2.getTypingIndicatorUsersTextStyle());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(IntKt.dpToPx(8));
        addView(textView, layoutParams);
    }

    public final void setTypingUsers(List<User> users) {
        boolean z4;
        AbstractC22676k.m65750j(users, "users");
        if (users.isEmpty()) {
            z4 = false;
        } else {
            z4 = true;
            this.userTypingTextView.setText(getResources().getQuantityString(C19469R.plurals.stream_ui_channel_header_typing_users, users.size(), ((User) AbstractC25265s.m74096F0(users)).getName(), Integer.valueOf(users.size() - 1)));
        }
        setVisibility(z4 ? 0 : 8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypingIndicatorView(Context context, AttributeSet attributeSet) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet);
        AbstractC22676k.m65750j(context, "context");
        this.userTypingTextView = new TextView(getContext());
        init(attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypingIndicatorView(Context context, AttributeSet attributeSet, int i13) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.userTypingTextView = new TextView(getContext());
        init(attributeSet);
    }
}
