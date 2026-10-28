package io.getstream.chat.android.p226ui.feature.messages.composer.internal;

import android.content.Context;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.common.state.messages.composer.ValidationError;
import io.getstream.chat.android.p226ui.common.utils.MediaStringUtil;
import io.getstream.chat.android.p226ui.utils.ViewOnClickListenerC19903b;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import m83.AbstractC25265s;
import mr.AbstractC25903i;
import mr.C25908n;
import mr.ViewOnAttachStateChangeListenerC25902h;
import p184h5.AbstractC16901p0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/internal/ValidationErrorRenderer;", "Lmr/i;", "Lmr/n;", "Landroid/content/Context;", "context", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "<init>", "(Landroid/content/Context;Landroid/view/View;)V", "", "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;", "validationErrors", "Ll83/a0;", "renderValidationErrors", "(Ljava/util/List;)V", "dismissValidationErrors", "()V", "snackbar", "onShown", "(Lmr/n;)V", "", NotificationCompat.CATEGORY_EVENT, "onDismissed", "(Lmr/n;I)V", "Landroid/content/Context;", "Landroid/view/View;", "previousValidationError", "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;", "currentlyVisibleSnackbar", "Lmr/n;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ValidationErrorRenderer extends AbstractC25903i {
    private final Context context;
    private C25908n currentlyVisibleSnackbar;
    private ValidationError previousValidationError;
    private final View view;

    public ValidationErrorRenderer(Context context, View view) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(view, "view");
        this.context = context;
        this.view = view;
    }

    public final void dismissValidationErrors() {
        C25908n c25908n = this.currentlyVisibleSnackbar;
        if (c25908n != null) {
            c25908n.m76610a(3);
        }
    }

    @Override // mr.AbstractC25903i
    public final void onDismissed(Object obj, int i13) {
        this.currentlyVisibleSnackbar = null;
    }

    @Override // mr.AbstractC25903i
    public final void onShown(Object obj) {
        this.currentlyVisibleSnackbar = (C25908n) obj;
    }

    public final void renderValidationErrors(List<? extends ValidationError> validationErrors) {
        String string;
        ViewOnAttachStateChangeListenerC25902h viewOnAttachStateChangeListenerC25902h;
        AbstractC22676k.m65750j(validationErrors, "validationErrors");
        if (validationErrors.isEmpty()) {
            dismissValidationErrors();
            return;
        }
        ValidationError validationError = (ValidationError) AbstractC25265s.m74100H0(validationErrors);
        if (this.currentlyVisibleSnackbar == null && validationError != null && !validationError.equals(this.previousValidationError)) {
            if (validationError instanceof ValidationError.MessageLengthExceeded) {
                string = this.context.getString(C19469R.string.stream_ui_message_composer_error_message_length, Integer.valueOf(((ValidationError.MessageLengthExceeded) validationError).getMaxMessageLength()));
            } else if (validationError instanceof ValidationError.AttachmentCountExceeded) {
                string = this.context.getString(C19469R.string.stream_ui_message_composer_error_attachment_count, Integer.valueOf(((ValidationError.AttachmentCountExceeded) validationError).getMaxAttachmentCount()));
            } else if (validationError instanceof ValidationError.AttachmentSizeExceeded) {
                string = this.context.getString(C19469R.string.stream_ui_message_composer_error_file_size, MediaStringUtil.convertFileSizeByteCount(((ValidationError.AttachmentSizeExceeded) validationError).getMaxAttachmentSize()));
            } else {
                if (!(validationError instanceof ValidationError.ContainsLinksWhenNotAllowed)) {
                    throw new NoWhenBranchMatchedException();
                }
                string = this.context.getString(C19469R.string.stream_ui_message_composer_sending_links_not_allowed);
            }
            AbstractC22676k.m65747g(string);
            C25908n c25908nM76617h = C25908n.m76617h(this.view, string, -2);
            View view = this.view;
            ViewOnAttachStateChangeListenerC25902h viewOnAttachStateChangeListenerC25902h2 = c25908nM76617h.f102262l;
            if (viewOnAttachStateChangeListenerC25902h2 != null) {
                viewOnAttachStateChangeListenerC25902h2.m76608a();
            }
            if (view == null) {
                viewOnAttachStateChangeListenerC25902h = null;
            } else {
                ViewOnAttachStateChangeListenerC25902h viewOnAttachStateChangeListenerC25902h3 = new ViewOnAttachStateChangeListenerC25902h(c25908nM76617h, view);
                WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                if (view.isAttachedToWindow()) {
                    view.getViewTreeObserver().addOnGlobalLayoutListener(viewOnAttachStateChangeListenerC25902h3);
                }
                view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC25902h3);
                viewOnAttachStateChangeListenerC25902h = viewOnAttachStateChangeListenerC25902h3;
            }
            c25908nM76617h.f102262l = viewOnAttachStateChangeListenerC25902h;
            if (c25908nM76617h.f102271u == null) {
                c25908nM76617h.f102271u = new ArrayList();
            }
            c25908nM76617h.f102271u.add(this);
            c25908nM76617h.m76618i(C19469R.string.stream_ui_ok, new ViewOnClickListenerC19903b(c25908nM76617h, 1));
            c25908nM76617h.m76619j();
        }
        this.previousValidationError = validationError;
    }

    public final void onDismissed(C25908n snackbar, int event) {
        this.currentlyVisibleSnackbar = null;
    }

    public final void onShown(C25908n snackbar) {
        this.currentlyVisibleSnackbar = snackbar;
    }
}
