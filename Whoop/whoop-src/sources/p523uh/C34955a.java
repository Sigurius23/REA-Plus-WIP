package p523uh;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import bi.AbstractC3269g;
import cc.C4409p;
import com.squareup.wire.AbstractC5583n;
import fi.AbstractC14505k;
import fi.C14509o;
import gi.EnumC15873d;
import java.io.IOException;
import java.util.Locale;
import ki.AbstractC22496h;
import ki.AbstractC22500l;
import m83.AbstractC25265s;
import ne3.AbstractC26604b;
import ne3.AbstractC26632p;
import ne3.C26611e0;
import ne3.C26616h;
import o72.C27644e;
import o73.C27648a;
import org.xmlpull.v1.XmlPullParserException;
import p031b9.AbstractC2875y;
import p249jc.C21567b;
import p461rh.AbstractC31426o;
import p461rh.C31436y;
import p477s2.AbstractC32072d;
import p513u4.AbstractC34523k;
import p547v8.AbstractC35785b;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import sh.C32475a;
import sh.C32490p;
import sh.C32492r;
import sh.C32493s;
import sh.EnumC32482h;
import y83.C39347c;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: uh.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C34955a implements InterfaceC34960f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f147919a;

    /* JADX INFO: renamed from: b */
    public final C31436y f147920b;

    /* JADX INFO: renamed from: c */
    public final C14509o f147921c;

    public /* synthetic */ C34955a(C31436y c31436y, C14509o c14509o, int i13) {
        this.f147919a = i13;
        this.f147920b = c31436y;
        this.f147921c = c14509o;
    }

    @Override // p523uh.InterfaceC34960f
    /* JADX INFO: renamed from: a */
    public final Object mo9540a(InterfaceC30057d interfaceC30057d) throws XmlPullParserException, IOException {
        Integer numM125932Q;
        Drawable bitmapDrawable;
        int i13 = this.f147919a;
        String mimeTypeFromExtension = null;
        C31436y c31436y = this.f147920b;
        C14509o c14509o = this.f147921c;
        switch (i13) {
            case 0:
                String strM74110N0 = AbstractC25265s.m74110N0(AbstractC25265s.m74161z0(AbstractC31426o.m96744h(c31436y), 1), "/", null, null, null, 62);
                return new C34962h(new C32493s(AbstractC26604b.m79158c(AbstractC26604b.m79166k(c14509o.f53003a.getAssets().open(strM74110N0))), c14509o.f53008f, new C32475a(strM74110N0)), AbstractC5583n.m16751K(strM74110N0), EnumC32482h.f134509y);
            case 1:
                String str = c31436y.f129327a;
                String str2 = c31436y.f129327a;
                int iM125888g0 = AbstractC39414r.m125888g0(str, ";base64,", 0, false, 6);
                if (iM125888g0 == -1) {
                    throw new IllegalStateException(("invalid data uri: " + c31436y).toString());
                }
                int iM125887f0 = AbstractC39414r.m125887f0(str2, ':', 0, false, 6);
                if (iM125887f0 == -1) {
                    throw new IllegalStateException(("invalid data uri: " + c31436y).toString());
                }
                String strSubstring = str2.substring(iM125887f0 + 1, iM125888g0);
                AbstractC22676k.m65749i(strSubstring, "substring(...)");
                byte[] bArrM125469a = C39347c.m125469a(C39347c.f169348f, str2, iM125888g0 + 8, 4);
                C26616h c26616h = new C26616h();
                c26616h.m134462write(bArrM125469a);
                return new C34962h(AbstractC32072d.m99699h(c26616h, c14509o.f53008f), strSubstring, EnumC32482h.f134508x);
            case 2:
                String str3 = C26611e0.f105848x;
                String strM96743g = AbstractC31426o.m96743g(c31436y);
                if (strM96743g == null) {
                    throw new IllegalStateException("filePath == null");
                }
                C26611e0 c26611e0M60606o = C21567b.m60606o(strM96743g, false);
                C32490p c32490pM99698g = AbstractC32072d.m99698g(c26611e0M60606o, c14509o.f53008f, null, null, 28);
                String strM125860F0 = AbstractC39414r.m125860F0('.', c26611e0M60606o.m79173b(), "");
                if (!AbstractC39414r.m125890i0(strM125860F0)) {
                    String lowerCase = strM125860F0.toLowerCase(Locale.ROOT);
                    AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
                    mimeTypeFromExtension = (String) AbstractC22496h.f88194a.get(lowerCase);
                    if (mimeTypeFromExtension == null) {
                        mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
                    }
                }
                return new C34962h(c32490pM99698g, mimeTypeFromExtension, EnumC32482h.f134509y);
            case 3:
                String str4 = c31436y.f129331e;
                if (str4 == null) {
                    str4 = "";
                }
                int iM125887f1 = AbstractC39414r.m125887f0(str4, '!', 0, false, 6);
                if (iM125887f1 == -1) {
                    throw new IllegalStateException(("Invalid jar:file URI: " + c31436y).toString());
                }
                String str5 = C26611e0.f105848x;
                String strSubstring2 = str4.substring(0, iM125887f1);
                AbstractC22676k.m65749i(strSubstring2, "substring(...)");
                C26611e0 c26611e0M60606o2 = C21567b.m60606o(strSubstring2, false);
                String strSubstring3 = str4.substring(iM125887f1 + 1, str4.length());
                AbstractC22676k.m65749i(strSubstring3, "substring(...)");
                C26611e0 c26611e0M60606o3 = C21567b.m60606o(strSubstring3, false);
                AbstractC26632p abstractC26632p = c14509o.f53008f;
                AbstractC22676k.m65750j(abstractC26632p, "<this>");
                C32490p c32490pM99698g2 = AbstractC32072d.m99698g(c26611e0M60606o3, AbstractC35785b.m113389L(c26611e0M60606o2, abstractC26632p, new C27644e(10)), null, null, 28);
                String strM125860F1 = AbstractC39414r.m125860F0('.', c26611e0M60606o3.m79173b(), "");
                if (!AbstractC39414r.m125890i0(strM125860F1)) {
                    String lowerCase2 = strM125860F1.toLowerCase(Locale.ROOT);
                    AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
                    mimeTypeFromExtension = (String) AbstractC22496h.f88194a.get(lowerCase2);
                    if (mimeTypeFromExtension == null) {
                        mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase2);
                    }
                }
                return new C34962h(c32490pM99698g2, mimeTypeFromExtension, EnumC32482h.f134509y);
            default:
                String str6 = c31436y.f129330d;
                if (str6 != null) {
                    mimeTypeFromExtension = AbstractC39414r.m125890i0(str6) ? null : str6;
                    if (mimeTypeFromExtension != null) {
                        String str7 = (String) AbstractC25265s.m74114R0(AbstractC31426o.m96744h(c31436y));
                        if (str7 == null || (numM125932Q = AbstractC39421y.m125932Q(str7)) == null) {
                            throw new IllegalStateException("Invalid android.resource URI: " + c31436y);
                        }
                        int iIntValue = numM125932Q.intValue();
                        Context context = c14509o.f53003a;
                        Resources resources = mimeTypeFromExtension.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(mimeTypeFromExtension);
                        TypedValue typedValue = new TypedValue();
                        resources.getValue(iIntValue, typedValue, true);
                        String strM16751K = AbstractC5583n.m16751K(typedValue.string.toString());
                        if (!AbstractC22676k.m65745e(strM16751K, "text/xml")) {
                            return new C34962h(new C32493s(AbstractC26604b.m79158c(AbstractC26604b.m79166k(resources.openRawResource(iIntValue, new TypedValue()))), c14509o.f53008f, new C32492r(mimeTypeFromExtension, iIntValue)), strM16751K, EnumC32482h.f134509y);
                        }
                        if (mimeTypeFromExtension.equals(context.getPackageName())) {
                            bitmapDrawable = C27648a.m83553D(context, iIntValue);
                        } else {
                            XmlResourceParser xml = resources.getXml(iIntValue);
                            int next = xml.next();
                            while (next != 2 && next != 1) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found.");
                            }
                            Resources.Theme theme = context.getTheme();
                            ThreadLocal threadLocal = AbstractC34523k.f145117a;
                            Drawable drawable = resources.getDrawable(iIntValue, theme);
                            if (drawable == null) {
                                throw new IllegalStateException(AbstractC2875y.m8295h(iIntValue, "Invalid resource ID: ").toString());
                            }
                            bitmapDrawable = drawable;
                        }
                        Bitmap.Config[] configArr = AbstractC22500l.f88199a;
                        boolean z4 = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof C4409p);
                        if (z4) {
                            bitmapDrawable = new BitmapDrawable(context.getResources(), AbstractC3269g.m9515v(bitmapDrawable, (Bitmap.Config) AbstractC31426o.m96742f(c14509o, AbstractC14505k.f52994b), c14509o.f53004b, c14509o.f53005c, c14509o.f53006d == EnumC15873d.f59981x));
                        }
                        return new C34961g(AbstractC31426o.m96739c(bitmapDrawable), z4, EnumC32482h.f134509y);
                    }
                }
                throw new IllegalStateException("Invalid android.resource URI: " + c31436y);
        }
    }
}
