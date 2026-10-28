package io.getstream.chat.android.p226ui.feature.messages.list.internal;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.internal.ViewOnLongClickListenerC19642b;
import io.getstream.chat.android.p226ui.utils.ManufacturerKt;
import io.getstream.chat.android.p226ui.utils.TextViewLinkHandler;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cBA\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod;", "Lio/getstream/chat/android/ui/utils/TextViewLinkHandler;", "Landroid/widget/TextView;", "textView", "Landroid/view/View;", "longClickTarget", "Lkotlin/Function1;", "", "Ll83/a0;", "onLinkClicked", "Lio/getstream/chat/android/models/User;", "onUserClicked", "<init>", "(Landroid/widget/TextView;Landroid/view/View;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "checkLongClick", "()Z", QueryParams.URL, "onLinkClick", "(Ljava/lang/String;)V", UserState.Sources.USER, "onUserClick", "(Lio/getstream/chat/android/models/User;)V", "Landroid/widget/TextView;", "Landroid/view/View;", "Lkotlin/jvm/functions/Function1;", "isLongClick", "Z", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class LongClickFriendlyLinkMovementMethod extends TextViewLinkHandler {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private boolean isLongClick;
    private final View longClickTarget;
    private final Function1 onLinkClicked;
    private final Function1 onUserClicked;
    private final TextView textView;

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod$Companion;", "", "<init>", "()V", "Landroid/widget/TextView;", "textView", "Landroid/view/View;", "longClickTarget", "Lkotlin/Function1;", "", "Ll83/a0;", "onLinkClicked", "Lio/getstream/chat/android/models/User;", "onMentionClicked", "set", "(Landroid/widget/TextView;Landroid/view/View;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final void set(TextView textView, View longClickTarget, Function1 onLinkClicked, Function1 onMentionClicked) {
            AbstractC22676k.m65750j(textView, "textView");
            AbstractC22676k.m65750j(longClickTarget, "longClickTarget");
            AbstractC22676k.m65750j(onLinkClicked, "onLinkClicked");
            AbstractC22676k.m65750j(onMentionClicked, "onMentionClicked");
            new LongClickFriendlyLinkMovementMethod(textView, longClickTarget, onLinkClicked, onMentionClicked, null);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public /* synthetic */ LongClickFriendlyLinkMovementMethod(TextView textView, View view, Function1 function1, Function1 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(textView, view, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(LongClickFriendlyLinkMovementMethod longClickFriendlyLinkMovementMethod, View view) {
        longClickFriendlyLinkMovementMethod.isLongClick = true;
        longClickFriendlyLinkMovementMethod.longClickTarget.performLongClick();
        return ManufacturerKt.shouldConsumeLongTap();
    }

    private final boolean checkLongClick() {
        if (!this.isLongClick) {
            return false;
        }
        this.isLongClick = false;
        return true;
    }

    @Override // io.getstream.chat.android.p226ui.utils.TextViewLinkHandler
    public final void onLinkClick(String url) {
        AbstractC22676k.m65750j(url, "url");
        if (checkLongClick()) {
            return;
        }
        this.onLinkClicked.invoke(url);
    }

    @Override // io.getstream.chat.android.p226ui.utils.TextViewLinkHandler
    public final void onUserClick(User user) {
        AbstractC22676k.m65750j(user, "user");
        if (checkLongClick()) {
            return;
        }
        this.onUserClicked.invoke(user);
    }

    private LongClickFriendlyLinkMovementMethod(TextView textView, View view, Function1 function1, Function1 function2) {
        this.textView = textView;
        this.longClickTarget = view;
        this.onLinkClicked = function1;
        this.onUserClicked = function2;
        textView.setOnLongClickListener(new ViewOnLongClickListenerC19642b(this, 1));
        textView.addTextChangedListener(new TextWatcher() { // from class: io.getstream.chat.android.ui.feature.messages.list.internal.LongClickFriendlyLinkMovementMethod$special$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable s13) {
                this.this$0.textView.setMovementMethod(this.this$0);
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        });
    }
}
