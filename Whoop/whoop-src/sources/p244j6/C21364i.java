package p244j6;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import p185h6.C16955j;

/* JADX INFO: renamed from: j6.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C21364i implements TextWatcher {

    /* JADX INFO: renamed from: w */
    public final EditText f81712w;

    /* JADX INFO: renamed from: x */
    public RunnableC21363h f81713x;

    /* JADX INFO: renamed from: y */
    public boolean f81714y = true;

    public C21364i(EditText editText) {
        this.f81712w = editText;
    }

    /* JADX INFO: renamed from: a */
    public static void m59958a(EditText editText, int i13) {
        int length;
        if (i13 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C16955j c16955jM47708a = C16955j.m47708a();
            if (editableText == null) {
                length = 0;
            } else {
                c16955jM47708a.getClass();
                length = editableText.length();
            }
            c16955jM47708a.m47714g(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) throws Throwable {
        EditText editText = this.f81712w;
        if (!editText.isInEditMode() && this.f81714y && C16955j.m47709d() && i14 <= i15 && (charSequence instanceof Spannable)) {
            int iM47711c = C16955j.m47708a().m47711c();
            if (iM47711c != 0) {
                if (iM47711c == 1) {
                    C16955j.m47708a().m47714g(i13, i15 + i13, 0, (Spannable) charSequence);
                    return;
                } else if (iM47711c != 3) {
                    return;
                }
            }
            C16955j c16955jM47708a = C16955j.m47708a();
            if (this.f81713x == null) {
                this.f81713x = new RunnableC21363h(editText);
            }
            c16955jM47708a.m47715h(this.f81713x);
        }
    }
}
