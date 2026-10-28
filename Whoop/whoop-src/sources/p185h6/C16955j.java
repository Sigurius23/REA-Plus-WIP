package p185h6;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import io.sentry.hints.C20363j;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p002a0.C0025h;
import p005a3.C0237p;
import p212i6.C18149b;
import p581we.C37199o;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: h6.j */
/* JADX INFO: loaded from: classes.dex */
public final class C16955j {

    /* JADX INFO: renamed from: j */
    public static final Object f65077j = new Object();

    /* JADX INFO: renamed from: k */
    public static volatile C16955j f65078k;

    /* JADX INFO: renamed from: a */
    public final ReentrantReadWriteLock f65079a;

    /* JADX INFO: renamed from: b */
    public final C0025h f65080b;

    /* JADX INFO: renamed from: c */
    public volatile int f65081c;

    /* JADX INFO: renamed from: d */
    public final Handler f65082d;

    /* JADX INFO: renamed from: e */
    public final C16950e f65083e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC16954i f65084f;

    /* JADX INFO: renamed from: g */
    public final C20363j f65085g;

    /* JADX INFO: renamed from: h */
    public final int f65086h;

    /* JADX INFO: renamed from: i */
    public final C16948c f65087i;

    public C16955j(C16965t c16965t) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f65079a = reentrantReadWriteLock;
        this.f65081c = 3;
        InterfaceC16954i interfaceC16954i = c16965t.f65114a;
        this.f65084f = interfaceC16954i;
        int i13 = c16965t.f65115b;
        this.f65086h = i13;
        this.f65087i = c16965t.f65116c;
        this.f65082d = new Handler(Looper.getMainLooper());
        this.f65080b = new C0025h(0);
        this.f65085g = new C20363j(24);
        C16950e c16950e = new C16950e(this);
        this.f65083e = c16950e;
        reentrantReadWriteLock.writeLock().lock();
        if (i13 == 0) {
            try {
                this.f65081c = 0;
            } catch (Throwable th3) {
                this.f65079a.writeLock().unlock();
                throw th3;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m47711c() == 0) {
            try {
                interfaceC16954i.mo9715a(new C16949d(c16950e));
            } catch (Throwable th4) {
                m47713f(th4);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C16955j m47708a() {
        C16955j c16955j;
        synchronized (f65077j) {
            try {
                c16955j = f65078k;
                if (!(c16955j != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return c16955j;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m47709d() {
        return f65078k != null;
    }

    /* JADX INFO: renamed from: b */
    public final int m47710b(int i13, CharSequence charSequence) {
        if (!(m47711c() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        AbstractC37056f.m118993q(charSequence, "charSequence cannot be null");
        C0237p c0237p = this.f65083e.f65073b;
        c0237p.getClass();
        if (i13 < 0 || i13 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            C16970y[] c16970yArr = (C16970y[]) spanned.getSpans(i13, i13 + 1, C16970y.class);
            if (c16970yArr.length > 0) {
                return spanned.getSpanStart(c16970yArr[0]);
            }
        }
        return ((C16962q) c0237p.m677H(charSequence, Math.max(0, i13 - 16), Math.min(charSequence.length(), i13 + 16), Integer.MAX_VALUE, true, new C16962q(i13))).f65097x;
    }

    /* JADX INFO: renamed from: c */
    public final int m47711c() {
        this.f65079a.readLock().lock();
        try {
            return this.f65081c;
        } finally {
            this.f65079a.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m47712e() {
        if (!(this.f65086h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (m47711c() == 1) {
            return;
        }
        this.f65079a.writeLock().lock();
        try {
            if (this.f65081c == 0) {
                this.f65079a.writeLock().unlock();
                return;
            }
            this.f65081c = 0;
            this.f65079a.writeLock().unlock();
            C16950e c16950e = this.f65083e;
            C16955j c16955j = c16950e.f65072a;
            try {
                c16955j.f65084f.mo9715a(new C16949d(c16950e));
            } catch (Throwable th3) {
                c16955j.m47713f(th3);
            }
        } catch (Throwable th4) {
            this.f65079a.writeLock().unlock();
            throw th4;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m47713f(Throwable th3) {
        ArrayList arrayList = new ArrayList();
        this.f65079a.writeLock().lock();
        try {
            this.f65081c = 2;
            arrayList.addAll(this.f65080b);
            this.f65080b.clear();
            this.f65079a.writeLock().unlock();
            this.f65082d.post(new RunnableC16953h(arrayList, this.f65081c, th3));
        } catch (Throwable th4) {
            this.f65079a.writeLock().unlock();
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a5 A[Catch: all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:35:0x0060, B:38:0x0065, B:40:0x0069, B:42:0x0076, B:49:0x0095, B:51:0x009f, B:53:0x00a2, B:55:0x00a5, B:57:0x00b5, B:58:0x00b8), top: B:92:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b5 A[Catch: all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:35:0x0060, B:38:0x0065, B:40:0x0069, B:42:0x0076, B:49:0x0095, B:51:0x009f, B:53:0x00a2, B:55:0x00a5, B:57:0x00b5, B:58:0x00b8), top: B:92:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:83:0x0103  */
    /* JADX WARN: Code duplicated, block: B:99:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public final CharSequence m47714g(int i13, int i14, int i15, CharSequence charSequence) throws Throwable {
        Throwable th3;
        CharSequence charSequence2;
        int i16;
        int i17;
        C16970y[] c16970yArr;
        int spanStart;
        if (!(m47711c() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i13 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i14 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        AbstractC37056f.m118990m(i13 <= i14, "start should be <= than end");
        C16971z c16971z = null;
        if (charSequence == null) {
            return null;
        }
        AbstractC37056f.m118990m(i13 <= charSequence.length(), "start should be < than charSequence length");
        AbstractC37056f.m118990m(i14 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i13 == i14) {
            return charSequence;
        }
        boolean z4 = i15 == 1;
        C0237p c0237p = this.f65083e.f65073b;
        c0237p.getClass();
        boolean z13 = charSequence instanceof C16968w;
        if (z13) {
            ((C16968w) charSequence).m47726a();
        }
        if (z13) {
            c16971z = new C16971z((Spannable) charSequence);
            if (c16971z != null) {
                for (C16970y c16970y : c16970yArr) {
                    spanStart = c16971z.f65133x.getSpanStart(c16970y);
                    int spanEnd = c16971z.f65133x.getSpanEnd(c16970y);
                    if (spanStart != i14) {
                        c16971z.removeSpan(c16970y);
                    }
                    i13 = Math.min(spanStart, i13);
                    i14 = Math.max(spanEnd, i14);
                }
            }
            i16 = i13;
            i17 = i14;
            if (i16 != i17) {
                charSequence2 = charSequence;
                if (!z13) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                if (!z13) {
                    return charSequence2;
                }
            }
            ((C16968w) charSequence2).m47727b();
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    c16971z = new C16971z((Spannable) charSequence);
                } catch (Throwable th4) {
                    th = th4;
                    charSequence2 = charSequence;
                    th3 = th;
                    if (!z13) {
                        throw th3;
                    }
                    ((C16968w) charSequence2).m47727b();
                    throw th3;
                }
            } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i13 - 1, i14 + 1, C16970y.class) <= i14) {
                c16971z = new C16971z();
                c16971z.f65132w = false;
                c16971z.f65133x = new SpannableString(charSequence);
            }
            if (c16971z != null && (c16970yArr = (C16970y[]) c16971z.f65133x.getSpans(i13, i14, C16970y.class)) != null && c16970yArr.length > 0) {
                while (i < r3) {
                    spanStart = c16971z.f65133x.getSpanStart(c16970y);
                    int spanEnd2 = c16971z.f65133x.getSpanEnd(c16970y);
                    if (spanStart != i14) {
                        c16971z.removeSpan(c16970y);
                    }
                    i13 = Math.min(spanStart, i13);
                    i14 = Math.max(spanEnd2, i14);
                }
            }
            i16 = i13;
            i17 = i14;
            if (i16 != i17 || i16 >= charSequence.length()) {
                charSequence2 = charSequence;
                if (!z13) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                try {
                    C16971z c16971z2 = (C16971z) c0237p.m677H(charSequence2, i16, i17, Integer.MAX_VALUE, z4, new C37199o(c16971z, (C20363j) c0237p.f812x));
                    if (c16971z2 != null) {
                        Spannable spannable = c16971z2.f65133x;
                        if (z13) {
                            ((C16968w) charSequence2).m47727b();
                        }
                        return spannable;
                    }
                    if (!z13) {
                        return charSequence2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    th3 = th;
                    if (!z13) {
                        throw th3;
                    }
                    ((C16968w) charSequence2).m47727b();
                    throw th3;
                }
            }
            ((C16968w) charSequence2).m47727b();
            return charSequence2;
        } catch (Throwable th6) {
            th3 = th6;
            charSequence2 = charSequence;
        }
        if (!z13) {
            throw th3;
        }
        ((C16968w) charSequence2).m47727b();
        throw th3;
    }

    /* JADX INFO: renamed from: h */
    public final void m47715h(AbstractC16952g abstractC16952g) {
        AbstractC37056f.m118993q(abstractC16952g, "initCallback cannot be null");
        this.f65079a.writeLock().lock();
        try {
            if (this.f65081c == 1 || this.f65081c == 2) {
                this.f65082d.post(new RunnableC16953h(Arrays.asList(abstractC16952g), this.f65081c, null));
            } else {
                this.f65080b.add(abstractC16952g);
            }
        } finally {
            this.f65079a.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m47716i(EditorInfo editorInfo) {
        if (m47711c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        C16950e c16950e = this.f65083e;
        c16950e.getClass();
        Bundle bundle = editorInfo.extras;
        C18149b c18149b = (C18149b) c16950e.f65074c.f177224x;
        int iM52082a = c18149b.m52082a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iM52082a != 0 ? ((ByteBuffer) c18149b.f70446z).getInt(iM52082a + c18149b.f70443w) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
