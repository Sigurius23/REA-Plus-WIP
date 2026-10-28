package io.getstream.chat.android.p226ui.utils;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.models.User;
import m83.AbstractC25260n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/ui/utils/TextViewLinkHandler;", "Landroid/text/method/LinkMovementMethod;", "<init>", "()V", "Landroid/widget/TextView;", "widget", "Landroid/text/Spannable;", "buffer", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "", "onTouchEvent", "(Landroid/widget/TextView;Landroid/text/Spannable;Landroid/view/MotionEvent;)Z", "", QueryParams.URL, "Ll83/a0;", "onLinkClick", "(Ljava/lang/String;)V", "Lio/getstream/chat/android/models/User;", UserState.Sources.USER, "onUserClick", "(Lio/getstream/chat/android/models/User;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class TextViewLinkHandler extends LinkMovementMethod {
    public abstract void onLinkClick(String url);

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView widget, Spannable buffer, MotionEvent event) {
        AbstractC22676k.m65750j(widget, "widget");
        AbstractC22676k.m65750j(buffer, "buffer");
        AbstractC22676k.m65750j(event, "event");
        if (event.getAction() != 1) {
            return super.onTouchEvent(widget, buffer, event);
        }
        int x3 = (int) event.getX();
        int y13 = (int) event.getY();
        int totalPaddingLeft = x3 - widget.getTotalPaddingLeft();
        int totalPaddingTop = y13 - widget.getTotalPaddingTop();
        int scrollX = widget.getScrollX() + totalPaddingLeft;
        int scrollY = widget.getScrollY() + totalPaddingTop;
        Layout layout = widget.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
        Object[] spans = buffer.getSpans(offsetForHorizontal, offsetForHorizontal, URLSpan.class);
        AbstractC22676k.m65749i(spans, "getSpans(...)");
        URLSpan uRLSpan = (URLSpan) AbstractC25260n.m74079t0(spans);
        if (uRLSpan != null) {
            String url = uRLSpan.getURL();
            AbstractC22676k.m65749i(url, "getURL(...)");
            onLinkClick(url);
        }
        Object[] spans2 = buffer.getSpans(offsetForHorizontal, offsetForHorizontal, UserSpan.class);
        AbstractC22676k.m65749i(spans2, "getSpans(...)");
        UserSpan userSpan = (UserSpan) AbstractC25260n.m74079t0(spans2);
        if (userSpan != null) {
            onUserClick(userSpan.getUser());
        }
        return true;
    }

    public abstract void onUserClick(User user);
}
