package p244j6;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import g73.C15553a;
import p185h6.C16955j;

/* JADX INFO: renamed from: j6.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C21357b extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final EditText f81699a;

    /* JADX INFO: renamed from: b */
    public final C15553a f81700b;

    public C21357b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        C15553a c15553a = new C15553a(11);
        super(inputConnection, false);
        this.f81699a = editText;
        this.f81700b = c15553a;
        if (C16955j.m47709d()) {
            C16955j.m47708a().m47716i(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i13, int i14) {
        Editable editableText = this.f81699a.getEditableText();
        this.f81700b.getClass();
        return C15553a.m43791t(this, editableText, i13, i14, false) || super.deleteSurroundingText(i13, i14);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i13, int i14) {
        Editable editableText = this.f81699a.getEditableText();
        this.f81700b.getClass();
        return C15553a.m43791t(this, editableText, i13, i14, true) || super.deleteSurroundingTextInCodePoints(i13, i14);
    }
}
