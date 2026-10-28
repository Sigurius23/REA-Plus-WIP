package p208i2;

import android.content.Context;
import android.os.Build;
import androidx.compose.p018ui.platform.AndroidComposeView;
import p027b3.ViewOnAttachStateChangeListenerC2357c0;
import p293l2.C23226c;
import p293l2.C23229f;
import p293l2.C23230g;
import p293l2.C23232i;
import p293l2.InterfaceC23228e;
import p317m2.C24939b;

/* JADX INFO: renamed from: i2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C17882f implements InterfaceC17883f0 {

    /* JADX INFO: renamed from: f */
    public static boolean f69569f = true;

    /* JADX INFO: renamed from: a */
    public final AndroidComposeView f69570a;

    /* JADX INFO: renamed from: b */
    public final Object f69571b = new Object();

    /* JADX INFO: renamed from: c */
    public C24939b f69572c;

    /* JADX INFO: renamed from: d */
    public boolean f69573d;

    /* JADX INFO: renamed from: e */
    public final ComponentCallbacks2C17879e f69574e;

    public C17882f(AndroidComposeView androidComposeView) {
        this.f69570a = androidComposeView;
        ComponentCallbacks2C17879e componentCallbacks2C17879e = new ComponentCallbacks2C17879e(this);
        this.f69574e = componentCallbacks2C17879e;
        if (androidComposeView.isAttachedToWindow()) {
            Context context = androidComposeView.getContext();
            if (!this.f69573d) {
                context.getApplicationContext().registerComponentCallbacks(componentCallbacks2C17879e);
                this.f69573d = true;
            }
        }
        androidComposeView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2357c0(this, 3));
    }

    @Override // p208i2.InterfaceC17883f0
    /* JADX INFO: renamed from: a */
    public final C23226c mo51440a() {
        InterfaceC23228e c23232i;
        C23226c c23226c;
        synchronized (this.f69571b) {
            try {
                AndroidComposeView androidComposeView = this.f69570a;
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 29) {
                    AbstractC17870b.m51407b(androidComposeView);
                }
                if (i13 >= 29) {
                    c23232i = new C23230g();
                } else if (f69569f) {
                    try {
                        c23232i = new C23229f(this.f69570a);
                    } catch (Throwable unused) {
                        f69569f = false;
                        AndroidComposeView androidComposeView2 = this.f69570a;
                        C24939b c24939b = this.f69572c;
                        if (c24939b == null) {
                            C24939b c24939b2 = new C24939b(androidComposeView2.getContext());
                            androidComposeView2.addView(c24939b2, -1);
                            this.f69572c = c24939b2;
                            c24939b = c24939b2;
                        }
                        c23232i = new C23232i(c24939b);
                    }
                } else {
                    AndroidComposeView androidComposeView3 = this.f69570a;
                    C24939b c24939b3 = this.f69572c;
                    if (c24939b3 == null) {
                        C24939b c24939b4 = new C24939b(androidComposeView3.getContext());
                        androidComposeView3.addView(c24939b4, -1);
                        this.f69572c = c24939b4;
                        c24939b3 = c24939b4;
                    }
                    c23232i = new C23232i(c24939b3);
                }
                c23226c = new C23226c(c23232i);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return c23226c;
    }

    @Override // p208i2.InterfaceC17883f0
    /* JADX INFO: renamed from: b */
    public final void mo51441b(C23226c c23226c) {
        synchronized (this.f69571b) {
            if (!c23226c.f91983s) {
                c23226c.f91983s = true;
                c23226c.m67209b();
            }
        }
    }
}
