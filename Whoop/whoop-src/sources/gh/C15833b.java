package gh;

import al0.C0971f;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import cc.C4409p;
import java.io.IOException;
import m83.AbstractC25265s;
import mh.C25545m;
import ne3.AbstractC26604b;
import org.xmlpull.v1.XmlPullParserException;
import p031b9.AbstractC2875y;
import p092dh.C12014a;
import p092dh.C12038y;
import p092dh.C12039z;
import p092dh.EnumC12020g;
import p425qh.AbstractC30358d;
import p477s2.AbstractC32073e;
import p513u4.AbstractC34523k;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: gh.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C15833b implements InterfaceC15839h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59817a;

    /* JADX INFO: renamed from: b */
    public final Uri f59818b;

    /* JADX INFO: renamed from: c */
    public final C25545m f59819c;

    public /* synthetic */ C15833b(Uri uri, C25545m c25545m, int i13) {
        this.f59817a = i13;
        this.f59818b = uri;
        this.f59819c = c25545m;
    }

    @Override // gh.InterfaceC15839h
    /* JADX INFO: renamed from: a */
    public final Object mo44670a(InterfaceC30057d interfaceC30057d) throws XmlPullParserException, IOException {
        Integer numM125932Q;
        Drawable drawable;
        int i13 = this.f59817a;
        Uri uri = this.f59818b;
        C25545m c25545m = this.f59819c;
        boolean z4 = true;
        int i14 = 2;
        switch (i13) {
            case 0:
                String strM74110N0 = AbstractC25265s.m74110N0(AbstractC25265s.m74161z0(uri.getPathSegments(), 1), "/", null, null, null, 62);
                return new C15845n(new C12039z(AbstractC26604b.m79158c(AbstractC26604b.m79166k(c25545m.f100135a.getAssets().open(strM74110N0))), new C0971f(c25545m.f100135a, i14), new C12014a(strM74110N0)), AbstractC30358d.m92828b(MimeTypeMap.getSingleton(), strM74110N0), EnumC12020g.f39763y);
            default:
                String authority = uri.getAuthority();
                if (authority != null) {
                    if (AbstractC39414r.m125890i0(authority)) {
                        authority = null;
                    }
                    if (authority != null) {
                        String str = (String) AbstractC25265s.m74114R0(uri.getPathSegments());
                        if (str == null || (numM125932Q = AbstractC39421y.m125932Q(str)) == null) {
                            throw new IllegalStateException(AbstractC31061c.m95637m(uri, "Invalid android.resource URI: "));
                        }
                        int iIntValue = numM125932Q.intValue();
                        Context context = c25545m.f100135a;
                        Resources resources = authority.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
                        TypedValue typedValue = new TypedValue();
                        resources.getValue(iIntValue, typedValue, true);
                        CharSequence charSequence = typedValue.string;
                        String strM92828b = AbstractC30358d.m92828b(MimeTypeMap.getSingleton(), charSequence.subSequence(AbstractC39414r.m125892k0(charSequence, '/', 0, 6), charSequence.length()).toString());
                        if (!AbstractC22676k.m65745e(strM92828b, "text/xml")) {
                            TypedValue typedValue2 = new TypedValue();
                            return new C15845n(new C12039z(AbstractC26604b.m79158c(AbstractC26604b.m79166k(resources.openRawResource(iIntValue, typedValue2))), new C0971f(context, i14), new C12038y(authority, iIntValue, typedValue2.density)), strM92828b, EnumC12020g.f39763y);
                        }
                        if (authority.equals(context.getPackageName())) {
                            drawable = AbstractC30060g.m92133x(context, iIntValue);
                            if (drawable == null) {
                                throw new IllegalStateException(AbstractC2875y.m8295h(iIntValue, "Invalid resource ID: ").toString());
                            }
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
                            drawable = resources.getDrawable(iIntValue, theme);
                            if (drawable == null) {
                                throw new IllegalStateException(AbstractC2875y.m8295h(iIntValue, "Invalid resource ID: ").toString());
                            }
                        }
                        if (!(drawable instanceof VectorDrawable) && !(drawable instanceof C4409p)) {
                            z4 = false;
                        }
                        if (z4) {
                            drawable = new BitmapDrawable(context.getResources(), AbstractC32073e.m99759r(drawable, c25545m.f100136b, c25545m.f100138d, c25545m.f100139e, c25545m.f100140f));
                        }
                        return new C15836e(drawable, z4, EnumC12020g.f39763y);
                    }
                }
                throw new IllegalStateException(AbstractC31061c.m95637m(uri, "Invalid android.resource URI: "));
        }
    }
}
