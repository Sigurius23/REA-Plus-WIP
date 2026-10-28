package fi;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import f93.C14289a;
import ki.AbstractC22500l;
import p253ji.InterfaceC21711d;
import p461rh.AbstractC31426o;

/* JADX INFO: renamed from: fi.k */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC14505k {

    /* JADX INFO: renamed from: a */
    public static final C14289a f52993a = new C14289a(InterfaceC21711d.f83346a, 3);

    /* JADX INFO: renamed from: b */
    public static final C14289a f52994b = new C14289a(AbstractC22500l.f88200b, 3);

    /* JADX INFO: renamed from: c */
    public static final C14289a f52995c = new C14289a(null, 3);

    /* JADX INFO: renamed from: d */
    public static final C14289a f52996d;

    /* JADX INFO: renamed from: e */
    public static final C14289a f52997e;

    /* JADX INFO: renamed from: f */
    public static final C14289a f52998f;

    /* JADX INFO: renamed from: g */
    public static final C14289a f52999g;

    static {
        Boolean bool = Boolean.TRUE;
        f52996d = new C14289a(bool, 3);
        f52997e = new C14289a(null, 3);
        f52998f = new C14289a(bool, 3);
        f52999g = new C14289a(Boolean.FALSE, 3);
    }

    /* JADX INFO: renamed from: a */
    public static final Bitmap.Config m41412a(C14509o c14509o) {
        return (Bitmap.Config) AbstractC31426o.m96742f(c14509o, f52994b);
    }

    /* JADX INFO: renamed from: b */
    public static final ColorSpace m41413b(C14509o c14509o) {
        return (ColorSpace) AbstractC31426o.m96742f(c14509o, f52995c);
    }
}
