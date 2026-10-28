package io.getstream.chat.android.p226ui.utils.extensions;

import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.fragment.app.RunnableC1319m;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, m65681d2 = {"Landroid/widget/EditText;", "Ll83/a0;", "showKeyboardIfFocused", "(Landroid/widget/EditText;)V", "focusAndShowKeyboard", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class EditTextKt {
    @InternalStreamChatApi
    public static final void focusAndShowKeyboard(final EditText editText) {
        AbstractC22676k.m65750j(editText, "<this>");
        editText.requestFocus();
        if (editText.hasWindowFocus()) {
            showKeyboardIfFocused(editText);
        } else {
            editText.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: io.getstream.chat.android.ui.utils.extensions.EditTextKt.focusAndShowKeyboard.1
                @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                public final void onWindowFocusChanged(boolean hasFocus) {
                    if (hasFocus) {
                        EditTextKt.showKeyboardIfFocused(editText);
                        editText.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
                    }
                }
            });
        }
    }

    @InternalStreamChatApi
    public static final void showKeyboardIfFocused(EditText editText) {
        AbstractC22676k.m65750j(editText, "<this>");
        if (editText.isFocused()) {
            editText.post(new RunnableC1319m(editText, 28));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showKeyboardIfFocused$lambda$0(EditText editText) {
        Object systemService = editText.getContext().getSystemService("input_method");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(editText, 1);
    }
}
