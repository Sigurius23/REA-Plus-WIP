package q20;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import d40.C11671p;
import l83.C23467m;
import l83.C23468n;
import m40.C25046w;
import p208i2.AbstractC17918w0;
import p505ts.AbstractC34132o;
import p513u4.AbstractC34523k;
import p715kotlin.jvm.internal.AbstractC22676k;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: q20.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C29827l {

    /* JADX INFO: renamed from: c */
    public static final ShapeDrawable f121912c = new ShapeDrawable();

    /* JADX INFO: renamed from: a */
    public final Resources f121913a;

    /* JADX INFO: renamed from: b */
    public final C25046w f121914b;

    public C29827l(Resources resources, C25046w imageLoader) {
        AbstractC22676k.m65750j(resources, "resources");
        AbstractC22676k.m65750j(imageLoader, "imageLoader");
        this.f121913a = resources;
        this.f121914b = imageLoader;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m91325b(C29827l c29827l, int i13, Integer num, String str, AbstractC32269c abstractC32269c) {
        C29826k c29826k;
        Object objM73488h;
        if (abstractC32269c instanceof C29826k) {
            c29826k = (C29826k) abstractC32269c;
            int i14 = c29826k.f121907E;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c29826k.f121907E = i14 - Integer.MIN_VALUE;
            } else {
                c29826k = new C29826k(abstractC32269c);
            }
        } else {
            c29826k = new C29826k(abstractC32269c);
        }
        Object obj = c29826k.f121911z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c29826k.f121907E;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            C25046w c25046w = c29827l.f121914b;
            c29826k.f121908w = c29827l;
            c29826k.f121909x = num;
            c29826k.f121910y = i13;
            c29826k.f121907E = 1;
            objM73488h = c25046w.m73488h(str, c29826k);
            if (objM73488h == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = c29826k.f121910y;
            num = c29826k.f121909x;
            c29827l = c29826k.f121908w;
            AbstractC34132o.m107864I(obj);
            objM73488h = ((C23468n) obj).f92940w;
        }
        if (objM73488h instanceof C23467m) {
            objM73488h = null;
        }
        Bitmap bitmap = (Bitmap) objM73488h;
        return bitmap != null ? new BitmapDrawable(c29827l.f121913a, bitmap) : m91326c(c29827l, i13, num);
    }

    /* JADX INFO: renamed from: c */
    public static final Drawable m91326c(C29827l c29827l, int i13, Integer num) {
        Object objM107888l;
        try {
            Resources resources = c29827l.f121913a;
            if (c29827l.m91327a() && num != null) {
                i13 = num.intValue();
            }
            ThreadLocal threadLocal = AbstractC34523k.f145117a;
            objM107888l = resources.getDrawable(i13, null);
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Drawable drawable = (Drawable) (objM107888l instanceof C23467m ? null : objM107888l);
        return drawable == null ? f121912c : drawable;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m91327a() {
        Configuration configuration = this.f121913a.getConfiguration();
        return (configuration != null && (configuration.uiMode & 48) == 32) || ((double) AbstractC17918w0.m51536x(C11671p.f37681b.f37668a)) < 0.5d;
    }
}
