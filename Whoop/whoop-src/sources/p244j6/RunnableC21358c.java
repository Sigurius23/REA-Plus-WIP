package p244j6;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p185h6.AbstractC16952g;
import p185h6.C16955j;

/* JADX INFO: renamed from: j6.c */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC21358c extends AbstractC16952g implements Runnable {

    /* JADX INFO: renamed from: w */
    public final WeakReference f81701w;

    /* JADX INFO: renamed from: x */
    public final WeakReference f81702x;

    public RunnableC21358c(TextView textView, C21359d c21359d) {
        this.f81701w = new WeakReference(textView);
        this.f81702x = new WeakReference(c21359d);
    }

    @Override // p185h6.AbstractC16952g
    /* JADX INFO: renamed from: b */
    public final void mo47707b() {
        Handler handler;
        TextView textView = (TextView) this.f81701w.get();
        if (textView == null || (handler = textView.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f81701w.get();
        InputFilter inputFilter = (InputFilter) this.f81702x.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    C16955j c16955jM47708a = C16955j.m47708a();
                    if (text == null) {
                        length = 0;
                    } else {
                        c16955jM47708a.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceM47714g = c16955jM47708a.m47714g(0, length, 0, text);
                    if (text == charSequenceM47714g) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceM47714g);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceM47714g);
                    textView.setText(charSequenceM47714g);
                    if (charSequenceM47714g instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceM47714g;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
