package p296l5;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import p184h5.C16870f;
import p184h5.InterfaceC16867e;

/* JADX INFO: renamed from: l5.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C23348l {
    /* JADX INFO: renamed from: a */
    public static C16870f m67596a(View view, C16870f c16870f) {
        CharSequence charSequenceCoerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c16870f);
        }
        InterfaceC16867e interfaceC16867e = c16870f.f64808a;
        if (interfaceC16867e.getSource() == 2) {
            return c16870f;
        }
        ClipData clipDataMo13629c = interfaceC16867e.mo13629c();
        int iMo13630d = interfaceC16867e.mo13630d();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z4 = false;
        for (int i13 = 0; i13 < clipDataMo13629c.getItemCount(); i13++) {
            ClipData.Item itemAt = clipDataMo13629c.getItemAt(i13);
            if ((iMo13630d & 1) != 0) {
                charSequenceCoerceToStyledText = itemAt.coerceToText(context);
                if (charSequenceCoerceToStyledText instanceof Spanned) {
                    charSequenceCoerceToStyledText = charSequenceCoerceToStyledText.toString();
                }
            } else {
                charSequenceCoerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (charSequenceCoerceToStyledText != null) {
                if (z4) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceCoerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, iMax2);
                    editable.replace(iMax, iMax2, charSequenceCoerceToStyledText);
                    z4 = true;
                }
            }
        }
        return null;
    }
}
