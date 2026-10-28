package io.getstream.chat.android.p226ui.utils;

import android.text.style.ClickableSpan;
import android.view.View;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.models.User;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lio/getstream/chat/android/ui/utils/UserSpan;", "Landroid/text/style/ClickableSpan;", "Lio/getstream/chat/android/models/User;", UserState.Sources.USER, "<init>", "(Lio/getstream/chat/android/models/User;)V", "Landroid/view/View;", "widget", "Ll83/a0;", "onClick", "(Landroid/view/View;)V", "Lio/getstream/chat/android/models/User;", "getUser", "()Lio/getstream/chat/android/models/User;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UserSpan extends ClickableSpan {
    private final User user;

    public UserSpan(User user) {
        AbstractC22676k.m65750j(user, "user");
        this.user = user;
    }

    public final User getUser() {
        return this.user;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        AbstractC22676k.m65750j(widget, "widget");
    }
}
