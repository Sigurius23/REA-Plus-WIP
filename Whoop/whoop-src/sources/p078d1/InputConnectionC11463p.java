package p078d1;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import ck1.C4780c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import m83.AbstractC25265s;
import p027b3.AbstractC2378g1;
import p027b3.InterfaceC2395j3;
import p031b9.AbstractC2875y;
import p031b9.RunnableC2833g0;
import p035bp.AbstractC3511b;
import p133f1.C13977s1;
import p294l3.C23283u0;
import p412q3.C29860a;
import p412q3.C29870f;
import p412q3.C29872g;
import p412q3.C29876j;
import p412q3.C29877k;
import p412q3.C29888v;
import p412q3.C29889w;
import p412q3.C29890x;
import p412q3.C29891y;
import p412q3.InterfaceC29874h;
import p510u0.C34354s0;
import p558vp.AbstractC36259c;
import p715kotlin.jvm.internal.AbstractC22676k;
import ro.C31624i;

/* JADX INFO: renamed from: d1.p */
/* JADX INFO: loaded from: classes5.dex */
public final class InputConnectionC11463p implements InputConnection {

    /* JADX INFO: renamed from: a */
    public final C31624i f36791a;

    /* JADX INFO: renamed from: b */
    public final boolean f36792b;

    /* JADX INFO: renamed from: c */
    public final C34354s0 f36793c;

    /* JADX INFO: renamed from: d */
    public final C13977s1 f36794d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2395j3 f36795e;

    /* JADX INFO: renamed from: f */
    public int f36796f;

    /* JADX INFO: renamed from: g */
    public C29891y f36797g;

    /* JADX INFO: renamed from: h */
    public int f36798h;

    /* JADX INFO: renamed from: i */
    public boolean f36799i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f36800j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public boolean f36801k = true;

    public InputConnectionC11463p(C29891y c29891y, C31624i c31624i, boolean z4, C34354s0 c34354s0, C13977s1 c13977s1, InterfaceC2395j3 interfaceC2395j3) {
        this.f36791a = c31624i;
        this.f36792b = z4;
        this.f36793c = c34354s0;
        this.f36794d = c13977s1;
        this.f36795e = interfaceC2395j3;
        this.f36797g = c29891y;
    }

    /* JADX INFO: renamed from: a */
    public final void m30758a(InterfaceC29874h interfaceC29874h) {
        this.f36796f++;
        try {
            this.f36800j.add(interfaceC29874h);
        } finally {
            m30759b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m30759b() {
        int i13 = this.f36796f - 1;
        this.f36796f = i13;
        if (i13 == 0) {
            ArrayList arrayList = this.f36800j;
            if (!arrayList.isEmpty()) {
                ((C11462o) this.f36791a.f130665x).f36780c.invoke(AbstractC25265s.m74097F1(arrayList));
                arrayList.clear();
            }
        }
        return this.f36796f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z4 = this.f36801k;
        if (!z4) {
            return z4;
        }
        this.f36796f++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m30760c(int i13) {
        sendKeyEvent(new KeyEvent(0, i13));
        sendKeyEvent(new KeyEvent(1, i13));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i13) {
        boolean z4 = this.f36801k;
        if (z4) {
            return false;
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f36800j.clear();
        this.f36796f = 0;
        this.f36801k = false;
        ArrayList arrayList = ((C11462o) this.f36791a.f130665x).f36787j;
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
        boolean z4 = this.f36801k;
        if (z4) {
            return false;
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i13, Bundle bundle) {
        boolean z4 = this.f36801k;
        if (z4) {
            return false;
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z4 = this.f36801k;
        return z4 ? this.f36792b : z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i13) {
        boolean z4 = this.f36801k;
        if (z4) {
            m30758a(new C29860a(String.valueOf(charSequence), i13));
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i13, int i14) {
        boolean z4 = this.f36801k;
        if (!z4) {
            return z4;
        }
        m30758a(new C29870f(i13, i14));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i13, int i14) {
        boolean z4 = this.f36801k;
        if (!z4) {
            return z4;
        }
        m30758a(new C29872g(i13, i14));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return m30759b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z4 = this.f36801k;
        if (!z4) {
            return z4;
        }
        m30758a(new C29876j());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i13) {
        C29891y c29891y = this.f36797g;
        return TextUtils.getCapsMode(c29891y.f122125a.f92135x, C23283u0.m67360f(c29891y.f122126b), i13);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i13) {
        boolean z4 = (i13 & 1) != 0;
        this.f36799i = z4;
        if (z4) {
            this.f36798h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return AbstractC3511b.m10376e(this.f36797g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i13) {
        if (C23283u0.m67357c(this.f36797g.f122126b)) {
            return null;
        }
        return AbstractC36259c.m115676V(this.f36797g).f92135x;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i13, int i14) {
        return AbstractC36259c.m115678Y(this.f36797g, i13).f92135x;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i13, int i14) {
        return AbstractC36259c.m115679Z(this.f36797g, i13).f92135x;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i13) {
        boolean z4 = this.f36801k;
        if (z4) {
            z4 = false;
            switch (i13) {
                case R.id.selectAll:
                    m30758a(new C29890x(0, this.f36797g.f122125a.f92135x.length()));
                    break;
                case R.id.cut:
                    m30760c(277);
                    return false;
                case R.id.copy:
                    m30760c(278);
                    return false;
                case R.id.paste:
                    m30760c(279);
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
        boolean z4 = this.f36801k;
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
            ((C11462o) this.f36791a.f130665x).f36781d.invoke(new C29877k(i14));
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            C4780c c4780c = new C4780c(this, 15);
            C34354s0 c34354s0 = this.f36793c;
            int iM7339n = c34354s0 != null ? AbstractC2378g1.m7339n(c34354s0, handwritingGesture, this.f36794d, this.f36795e, c4780c) : 3;
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new RunnableC2833g0(intConsumer, iM7339n, 1));
            } else {
                intConsumer.accept(iM7339n);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z4 = this.f36801k;
        if (z4) {
            return true;
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        C34354s0 c34354s0;
        if (Build.VERSION.SDK_INT < 34 || (c34354s0 = this.f36793c) == null) {
            return false;
        }
        return AbstractC2378g1.m7340o(c34354s0, previewableHandwritingGesture, this.f36794d, cancellationSignal);
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
        C11459l c11459l;
        boolean z15 = this.f36801k;
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
            c11459l = ((C11462o) this.f36791a.f130665x).f36790m;
            synchronized (c11459l.f36761c) {
                try {
                    c11459l.f36764f = z13;
                    c11459l.f36765g = z14;
                    c11459l.f36766h = z16;
                    c11459l.f36767i = z4;
                    if (z17) {
                        c11459l.f36763e = true;
                        if (c11459l.f36768j != null) {
                            c11459l.m30756a();
                        }
                    }
                    c11459l.f36762d = z18;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return true;
        }
        z4 = false;
        z13 = true;
        z14 = z13;
        c11459l = ((C11462o) this.f36791a.f130665x).f36790m;
        synchronized (c11459l.f36761c) {
            c11459l.f36764f = z13;
            c11459l.f36765g = z14;
            c11459l.f36766h = z16;
            c11459l.f36767i = z4;
            if (z17) {
                c11459l.f36763e = true;
                if (c11459l.f36768j != null) {
                    c11459l.m30756a();
                }
            }
            c11459l.f36762d = z18;
            return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, l83.h] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z4 = this.f36801k;
        if (!z4) {
            return z4;
        }
        ((BaseInputConnection) ((C11462o) this.f36791a.f130665x).f36788k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i13, int i14) {
        boolean z4 = this.f36801k;
        if (z4) {
            m30758a(new C29888v(i13, i14));
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i13) {
        boolean z4 = this.f36801k;
        if (z4) {
            m30758a(new C29889w(String.valueOf(charSequence), i13));
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i13, int i14) {
        boolean z4 = this.f36801k;
        if (!z4) {
            return z4;
        }
        m30758a(new C29890x(i13, i14));
        return true;
    }
}
