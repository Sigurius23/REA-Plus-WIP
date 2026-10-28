package p412q3;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import p002a0.C0006a1;
import p078d1.InputConnectionC11463p;

/* JADX INFO: renamed from: q3.o */
/* JADX INFO: loaded from: classes5.dex */
public class InputConnectionC29881o implements InputConnection {

    /* JADX INFO: renamed from: a */
    public final C0006a1 f122107a;

    /* JADX INFO: renamed from: b */
    public InputConnectionC11463p f122108b;

    public InputConnectionC29881o(InputConnectionC11463p inputConnectionC11463p, C0006a1 c0006a1) {
        this.f122107a = c0006a1;
        this.f122108b = inputConnectionC11463p;
    }

    /* JADX INFO: renamed from: a */
    public final void m91504a(InputConnectionC11463p inputConnectionC11463p) {
        inputConnectionC11463p.closeConnection();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        InputConnectionC11463p inputConnectionC11463p = this.f122108b;
        if (inputConnectionC11463p != null) {
            return inputConnectionC11463p.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i13) {
        InputConnectionC11463p inputConnectionC11463p = this.f122108b;
        if (inputConnectionC11463p != null) {
            return inputConnectionC11463p.clearMetaKeyStates(i13);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        InputConnectionC11463p inputConnectionC11463p = this.f122108b;
        if (inputConnectionC11463p != null) {
            if (inputConnectionC11463p != null) {
                m91504a(inputConnectionC11463p);
                this.f122108b = null;
            }
            this.f122107a.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        InputConnectionC11463p inputConnectionC11463p = this.f122108b;
        if (inputConnectionC11463p != null) {
            return inputConnectionC11463p.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i13, Bundle bundle) {
        InputConnectionC11463p inputConnectionC11463p = this.f122108b;
        if (inputConnectionC11463p != null) {
            return inputConnectionC11463p.commitContent(inputContentInfo, i13, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        InputConnectionC11463p inputConnectionC11463p = this.f122108b;
        if (inputConnectionC11463p != null) {
            return inputConnectionC11463p.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i13) {
        InputConnectionC11463p inputConnectionC11463p = this.f122108b;
        if (inputConnectionC11463p != null) {
            return inputConnectionC11463p.commitText(charSequence, i13);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i13, int i14) {
        InputConnectionC11463p inputConnectionC11463p = this.f122108b;
        if (inputConnectionC11463p != null) {
            return inputConnectionC11463p.deleteSurroundingText(i13, i14);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i13, int i14) {
        InputConnectionC11463p inputConnectionC11463p = this.f122108b;
        if (inputConnectionC11463p != null) {
            return inputConnectionC11463p.deleteSurroundingTextInCodePoints(i13, i14);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        InputConnectionC11463p inputConnectionC11463p = this.f122108b;
        if (inputConnectionC11463p != null) {
            return inputConnectionC11463p.m30759b();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        InputConnectionC11463p inputConnectionC11463p = this.f122108b;
        if (inputConnectionC11463p != null) {
            return inputConnectionC11463p.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i13) {
        InputConnectionC11463p inputConnectionC11463p = this.f122108b;
        if (inputConnectionC11463p != null) {
            return inputConnectionC11463p.getCursorCapsMode(i13);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i13) {
        InputConnectionC11463p inputConnectionC11463p = this.f122108b;
        if (inputConnectionC11463p != null) {
            return inputConnectionC11463p.getExtractedText(extractedTextRequest, i13);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i13) {
        InputConnectionC11463p inputConnectionC11463p = this.f122108b;
        if (inputConnectionC11463p != null) {
            return inputConnectionC11463p.getSelectedText(i13);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i13, int i14) {
        InputConnectionC11463p inputConnectionC11463p = this.f122108b;
        if (inputConnectionC11463p != null) {
            return inputConnectionC11463p.getTextAfterCursor(i13, i14);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i13, int i14) {
        InputConnectionC11463p inputConnectionC11463p = this.f122108b;
        if (inputConnectionC11463p != null) {
            return inputConnectionC11463p.getTextBeforeCursor(i13, i14);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i13) {
        InputConnectionC11463p inputConnectionC11463p = this.f122108b;
        if (inputConnectionC11463p != null) {
            return inputConnectionC11463p.performContextMenuAction(i13);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i13) {
        InputConnectionC11463p inputConnectionC11463p = this.f122108b;
        if (inputConnectionC11463p != null) {
            return inputConnectionC11463p.performEditorAction(i13);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        InputConnectionC11463p inputConnectionC11463p = this.f122108b;
        if (inputConnectionC11463p != null) {
            return inputConnectionC11463p.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z4) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i13) {
        InputConnectionC11463p inputConnectionC11463p = this.f122108b;
        if (inputConnectionC11463p != null) {
            return inputConnectionC11463p.requestCursorUpdates(i13);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        InputConnectionC11463p inputConnectionC11463p = this.f122108b;
        if (inputConnectionC11463p != null) {
            return inputConnectionC11463p.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i13, int i14) {
        InputConnectionC11463p inputConnectionC11463p = this.f122108b;
        if (inputConnectionC11463p != null) {
            return inputConnectionC11463p.setComposingRegion(i13, i14);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i13) {
        InputConnectionC11463p inputConnectionC11463p = this.f122108b;
        if (inputConnectionC11463p != null) {
            return inputConnectionC11463p.setComposingText(charSequence, i13);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i13, int i14) {
        InputConnectionC11463p inputConnectionC11463p = this.f122108b;
        if (inputConnectionC11463p != null) {
            return inputConnectionC11463p.setSelection(i13, i14);
        }
        return false;
    }
}
