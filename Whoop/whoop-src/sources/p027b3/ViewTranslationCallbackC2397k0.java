package p027b3;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.compose.p018ui.platform.AndroidComposeView;
import c93.InterfaceC4339a;
import p002a0.AbstractC0050s;
import p002a0.C0057v0;
import p079d2.EnumC11479a;
import p079d2.ViewOnAttachStateChangeListenerC11482d;
import p209i3.AbstractC18029k;
import p209i3.AbstractC18039u;
import p209i3.C18017a;
import p209i3.C18035q;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b3.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTranslationCallbackC2397k0 implements ViewTranslationCallback {

    /* JADX INFO: renamed from: a */
    public static final ViewTranslationCallbackC2397k0 f9450a = new ViewTranslationCallbackC2397k0();

    public final boolean onClearTranslation(View view) {
        InterfaceC4339a interfaceC4339a;
        AbstractC22676k.m65748h(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ViewOnAttachStateChangeListenerC11482d contentCaptureManager = ((AndroidComposeView) view).getContentCaptureManager();
        contentCaptureManager.getClass();
        contentCaptureManager.f36900F = EnumC11479a.f36892w;
        AbstractC0050s abstractC0050sM30899d = contentCaptureManager.m30899d();
        Object[] objArr = abstractC0050sM30899d.f150c;
        long[] jArr = abstractC0050sM30899d.f148a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i13 = 0;
        while (true) {
            long j7 = jArr[i13];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j7) < 128) {
                        C0057v0 c0057v0 = ((C18035q) objArr[(i13 << 3) + i15]).f69993a.f69989d.f69980w;
                        Object objM129g = c0057v0.m129g(AbstractC18039u.f70021C);
                        if (objM129g == null) {
                            objM129g = null;
                        }
                        if (objM129g != null) {
                            Object objM129g2 = c0057v0.m129g(AbstractC18029k.f69966m);
                            C18017a c18017a = (C18017a) (objM129g2 != null ? objM129g2 : null);
                            if (c18017a != null && (interfaceC4339a = (InterfaceC4339a) c18017a.f69929b) != null) {
                            }
                        }
                    }
                    j7 >>= 8;
                }
                if (i14 != 8) {
                    return true;
                }
            }
            if (i13 == length) {
                return true;
            }
            i13++;
        }
    }

    public final boolean onHideTranslation(View view) {
        Function1 function1;
        AbstractC22676k.m65748h(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ViewOnAttachStateChangeListenerC11482d contentCaptureManager = ((AndroidComposeView) view).getContentCaptureManager();
        contentCaptureManager.getClass();
        contentCaptureManager.f36900F = EnumC11479a.f36892w;
        AbstractC0050s abstractC0050sM30899d = contentCaptureManager.m30899d();
        Object[] objArr = abstractC0050sM30899d.f150c;
        long[] jArr = abstractC0050sM30899d.f148a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i13 = 0;
        while (true) {
            long j7 = jArr[i13];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j7) < 128) {
                        C0057v0 c0057v0 = ((C18035q) objArr[(i13 << 3) + i15]).f69993a.f69989d.f69980w;
                        Object objM129g = c0057v0.m129g(AbstractC18039u.f70021C);
                        if (objM129g == null) {
                            objM129g = null;
                        }
                        if (AbstractC22676k.m65745e(objM129g, Boolean.TRUE)) {
                            Object objM129g2 = c0057v0.m129g(AbstractC18029k.f69965l);
                            C18017a c18017a = (C18017a) (objM129g2 != null ? objM129g2 : null);
                            if (c18017a != null && (function1 = (Function1) c18017a.f69929b) != null) {
                            }
                        }
                    }
                    j7 >>= 8;
                }
                if (i14 != 8) {
                    return true;
                }
            }
            if (i13 == length) {
                return true;
            }
            i13++;
        }
    }

    public final boolean onShowTranslation(View view) {
        Function1 function1;
        AbstractC22676k.m65748h(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ViewOnAttachStateChangeListenerC11482d contentCaptureManager = ((AndroidComposeView) view).getContentCaptureManager();
        contentCaptureManager.getClass();
        contentCaptureManager.f36900F = EnumC11479a.f36893x;
        AbstractC0050s abstractC0050sM30899d = contentCaptureManager.m30899d();
        Object[] objArr = abstractC0050sM30899d.f150c;
        long[] jArr = abstractC0050sM30899d.f148a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i13 = 0;
        while (true) {
            long j7 = jArr[i13];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j7) < 128) {
                        C0057v0 c0057v0 = ((C18035q) objArr[(i13 << 3) + i15]).f69993a.f69989d.f69980w;
                        Object objM129g = c0057v0.m129g(AbstractC18039u.f70021C);
                        if (objM129g == null) {
                            objM129g = null;
                        }
                        if (AbstractC22676k.m65745e(objM129g, Boolean.FALSE)) {
                            Object objM129g2 = c0057v0.m129g(AbstractC18029k.f69965l);
                            C18017a c18017a = (C18017a) (objM129g2 != null ? objM129g2 : null);
                            if (c18017a != null && (function1 = (Function1) c18017a.f69929b) != null) {
                            }
                        }
                    }
                    j7 >>= 8;
                }
                if (i14 != 8) {
                    return true;
                }
            }
            if (i13 == length) {
                return true;
            }
            i13++;
        }
    }
}
