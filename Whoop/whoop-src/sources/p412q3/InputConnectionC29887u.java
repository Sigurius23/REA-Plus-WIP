package p412q3;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import la.C23548b;
import m83.AbstractC25265s;
import p005a3.C0237p;
import p031b9.AbstractC2875y;
import p294l3.C23283u0;
import p550vd.AbstractC35903f;
import p558vp.AbstractC36259c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q3.u */
/* JADX INFO: loaded from: classes5.dex */
public final class InputConnectionC29887u implements InputConnection {

    /* JADX INFO: renamed from: a */
    public final C23548b f122110a;

    /* JADX INFO: renamed from: b */
    public final boolean f122111b;

    /* JADX INFO: renamed from: c */
    public int f122112c;

    /* JADX INFO: renamed from: d */
    public C29891y f122113d;

    /* JADX INFO: renamed from: e */
    public int f122114e;

    /* JADX INFO: renamed from: f */
    public boolean f122115f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f122116g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public boolean f122117h = true;

    public InputConnectionC29887u(C29891y c29891y, C23548b c23548b, boolean z4) {
        this.f122110a = c23548b;
        this.f122111b = z4;
        this.f122113d = c29891y;
    }

    /* JADX INFO: renamed from: a */
    public final void m91505a(InterfaceC29874h interfaceC29874h) {
        this.f122112c++;
        try {
            this.f122116g.add(interfaceC29874h);
        } finally {
            m91506b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m91506b() {
        int i13 = this.f122112c - 1;
        this.f122112c = i13;
        if (i13 == 0) {
            ArrayList arrayList = this.f122116g;
            if (!arrayList.isEmpty()) {
                ((C29863b0) this.f122110a.f93280x).f122053e.invoke(AbstractC25265s.m74097F1(arrayList));
                arrayList.clear();
            }
        }
        return this.f122112c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z4 = this.f122117h;
        if (!z4) {
            return z4;
        }
        this.f122112c++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m91507c(int i13) {
        sendKeyEvent(new KeyEvent(0, i13));
        sendKeyEvent(new KeyEvent(1, i13));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i13) {
        boolean z4 = this.f122117h;
        if (z4) {
            return false;
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f122116g.clear();
        this.f122112c = 0;
        this.f122117h = false;
        ArrayList arrayList = ((C29863b0) this.f122110a.f93280x).f122057i;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (AbstractC22676k.m65745e(((WeakReference) arrayList.get(i13)).get(), this)) {
                arrayList.remove(i13);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z4 = this.f122117h;
        if (z4) {
            return false;
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i13, Bundle bundle) {
        boolean z4 = this.f122117h;
        if (z4) {
            return false;
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z4 = this.f122117h;
        return z4 ? this.f122111b : z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i13) {
        boolean z4 = this.f122117h;
        if (z4) {
            m91505a(new C29860a(String.valueOf(charSequence), i13));
        }
        return z4;
    }

    /* JADX INFO: renamed from: d */
    public final void m91508d(C29891y c29891y) {
        this.f122113d = c29891y;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i13, int i14) {
        boolean z4 = this.f122117h;
        if (!z4) {
            return z4;
        }
        m91505a(new C29870f(i13, i14));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i13, int i14) {
        boolean z4 = this.f122117h;
        if (!z4) {
            return z4;
        }
        m91505a(new C29872g(i13, i14));
        return true;
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, l83.h] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, l83.h] */
    /* JADX INFO: renamed from: e */
    public final void m91509e(C29891y c29891y, C0237p c0237p) {
        if (this.f122117h) {
            this.f122113d = c29891y;
            if (this.f122115f) {
                ((InputMethodManager) c0237p.f813y.getValue()).updateExtractedText((View) c0237p.f812x, this.f122114e, AbstractC35903f.m114001U(c29891y));
            }
            C23283u0 c23283u0 = c29891y.f122127c;
            long j7 = c29891y.f122126b;
            int iM67360f = c23283u0 != null ? C23283u0.m67360f(c23283u0.f92253a) : -1;
            C23283u0 c23283u1 = c29891y.f122127c;
            int iM67359e = c23283u1 != null ? C23283u0.m67359e(c23283u1.f92253a) : -1;
            ((InputMethodManager) c0237p.f813y.getValue()).updateSelection((View) c0237p.f812x, C23283u0.m67360f(j7), C23283u0.m67359e(j7), iM67360f, iM67359e);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return m91506b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z4 = this.f122117h;
        if (!z4) {
            return z4;
        }
        m91505a(new C29876j());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i13) {
        C29891y c29891y = this.f122113d;
        return TextUtils.getCapsMode(c29891y.f122125a.f92135x, C23283u0.m67360f(c29891y.f122126b), i13);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i13) {
        boolean z4 = (i13 & 1) != 0;
        this.f122115f = z4;
        if (z4) {
            this.f122114e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return AbstractC35903f.m114001U(this.f122113d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i13) {
        if (C23283u0.m67357c(this.f122113d.f122126b)) {
            return null;
        }
        return AbstractC36259c.m115676V(this.f122113d).f92135x;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i13, int i14) {
        return AbstractC36259c.m115678Y(this.f122113d, i13).f92135x;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i13, int i14) {
        return AbstractC36259c.m115679Z(this.f122113d, i13).f92135x;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i13) {
        boolean z4 = this.f122117h;
        if (z4) {
            z4 = false;
            switch (i13) {
                case R.id.selectAll:
                    m91505a(new C29890x(0, this.f122113d.f122125a.f92135x.length()));
                    break;
                case R.id.cut:
                    m91507c(277);
                    return false;
                case R.id.copy:
                    m91507c(278);
                    return false;
                case R.id.paste:
                    m91507c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i13) {
        int i14;
        boolean z4 = this.f122117h;
        if (z4) {
            z4 = true;
            if (i13 != 0) {
                switch (i13) {
                    case 2:
                        i14 = 2;
                        break;
                    case 3:
                        i14 = 3;
                        break;
                    case 4:
                        i14 = 4;
                        break;
                    case 5:
                        i14 = 6;
                        break;
                    case 6:
                        i14 = 7;
                        break;
                    case 7:
                        i14 = 5;
                        break;
                    default:
                        AbstractC2875y.m8313z(i13, "IME sends unsupported Editor Action: ", "RecordingIC");
                        i14 = 1;
                        break;
                }
            } else {
                i14 = 1;
            }
            ((C29863b0) this.f122110a.f93280x).f122054f.invoke(new C29877k(i14));
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z4 = this.f122117h;
        if (z4) {
            return true;
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z4) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0065 A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:44:0x005b, B:46:0x0065, B:48:0x006b, B:51:0x0071), top: B:57:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:48:0x006b A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:44:0x005b, B:46:0x0065, B:48:0x006b, B:51:0x0071), top: B:57:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:57:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i13) {
        boolean z4;
        boolean z13;
        boolean z14;
        C29866d c29866d;
        boolean z15 = this.f122117h;
        if (!z15) {
            return z15;
        }
        boolean z16 = false;
        boolean z17 = (i13 & 1) != 0;
        boolean z18 = (i13 & 2) != 0;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            z13 = (i13 & 16) != 0;
            z14 = (i13 & 8) != 0;
            boolean z19 = (i13 & 4) != 0;
            if (i14 >= 34 && (i13 & 32) != 0) {
                z16 = true;
            }
            if (z13 || z14 || z19 || z16) {
                z4 = z16;
                z16 = z19;
            } else {
                if (i14 >= 34) {
                    z4 = true;
                    z16 = true;
                } else {
                    z4 = z16;
                    z16 = true;
                }
                z13 = z16;
            }
            c29866d = ((C29863b0) this.f122110a.f93280x).f122060l;
            synchronized (c29866d.f122070c) {
                try {
                    c29866d.f122073f = z13;
                    c29866d.f122074g = z14;
                    c29866d.f122075h = z16;
                    c29866d.f122076i = z4;
                    if (z17) {
                        c29866d.f122072e = true;
                        if (c29866d.f122077j != null) {
                            c29866d.m91494a();
                        }
                    }
                    c29866d.f122071d = z18;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return true;
        }
        z4 = false;
        z13 = true;
        z14 = z13;
        c29866d = ((C29863b0) this.f122110a.f93280x).f122060l;
        synchronized (c29866d.f122070c) {
            c29866d.f122073f = z13;
            c29866d.f122074g = z14;
            c29866d.f122075h = z16;
            c29866d.f122076i = z4;
            if (z17) {
                c29866d.f122072e = true;
                if (c29866d.f122077j != null) {
                    c29866d.m91494a();
                }
            }
            c29866d.f122071d = z18;
            return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, l83.h] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z4 = this.f122117h;
        if (!z4) {
            return z4;
        }
        ((BaseInputConnection) ((C29863b0) this.f122110a.f93280x).f122058j.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i13, int i14) {
        boolean z4 = this.f122117h;
        if (z4) {
            m91505a(new C29888v(i13, i14));
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i13) {
        boolean z4 = this.f122117h;
        if (z4) {
            m91505a(new C29889w(String.valueOf(charSequence), i13));
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i13, int i14) {
        boolean z4 = this.f122117h;
        if (!z4) {
            return z4;
        }
        m91505a(new C29890x(i13, i14));
        return true;
    }
}
