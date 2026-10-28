package p408q;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p290l.AbstractC22932a;
import p444r.ActionProviderVisibilityListenerC30821o;
import p444r.MenuC30818l;
import p474s.AbstractC31950e1;
import p474s.C31983m2;

/* JADX INFO: renamed from: q.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C29666j extends MenuInflater {

    /* JADX INFO: renamed from: e */
    public static final Class[] f121269e;

    /* JADX INFO: renamed from: f */
    public static final Class[] f121270f;

    /* JADX INFO: renamed from: a */
    public final Object[] f121271a;

    /* JADX INFO: renamed from: b */
    public final Object[] f121272b;

    /* JADX INFO: renamed from: c */
    public final Context f121273c;

    /* JADX INFO: renamed from: d */
    public Object f121274d;

    static {
        Class[] clsArr = {Context.class};
        f121269e = clsArr;
        f121270f = clsArr;
    }

    public C29666j(Context context) {
        super(context);
        this.f121273c = context;
        Object[] objArr = {context};
        this.f121271a = objArr;
        this.f121272b = objArr;
    }

    /* JADX INFO: renamed from: a */
    public static Object m91140a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m91140a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX INFO: renamed from: b */
    public final void m91141b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i13;
        ColorStateList colorStateList;
        C29665i c29665i = new C29665i(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            i13 = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
                break;
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z4 = false;
        boolean z13 = false;
        String str = null;
        while (!z4) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType == i13) {
                if (!z13) {
                    String name2 = xmlPullParser.getName();
                    boolean zEquals = name2.equals("group");
                    Context context = this.f121273c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC22932a.f90523p);
                        c29665i.f121244b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        c29665i.f121245c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        c29665i.f121246d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        c29665i.f121247e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        c29665i.f121248f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        c29665i.f121249g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        C31983m2 c31983m2M99478p = C31983m2.m99478p(context, attributeSet, AbstractC22932a.f90524q);
                        TypedArray typedArray = (TypedArray) c31983m2M99478p.f132769x;
                        c29665i.f121251i = typedArray.getResourceId(2, 0);
                        c29665i.f121252j = (typedArray.getInt(5, c29665i.f121245c) & (-65536)) | (typedArray.getInt(6, c29665i.f121246d) & 65535);
                        c29665i.f121253k = typedArray.getText(7);
                        c29665i.f121254l = typedArray.getText(8);
                        c29665i.f121255m = typedArray.getResourceId(0, 0);
                        String string = typedArray.getString(9);
                        c29665i.f121256n = string == null ? (char) 0 : string.charAt(0);
                        c29665i.f121257o = typedArray.getInt(16, 4096);
                        String string2 = typedArray.getString(10);
                        c29665i.f121258p = string2 == null ? (char) 0 : string2.charAt(0);
                        c29665i.f121259q = typedArray.getInt(20, 4096);
                        if (typedArray.hasValue(11)) {
                            c29665i.f121260r = typedArray.getBoolean(11, false) ? 1 : 0;
                        } else {
                            c29665i.f121260r = c29665i.f121247e;
                        }
                        c29665i.f121261s = typedArray.getBoolean(3, false);
                        c29665i.f121262t = typedArray.getBoolean(4, c29665i.f121248f);
                        c29665i.f121263u = typedArray.getBoolean(1, c29665i.f121249g);
                        c29665i.f121264v = typedArray.getInt(21, -1);
                        c29665i.f121267y = typedArray.getString(12);
                        c29665i.f121265w = typedArray.getResourceId(13, 0);
                        c29665i.f121266x = typedArray.getString(15);
                        String string3 = typedArray.getString(14);
                        boolean z14 = string3 != null;
                        if (z14 && c29665i.f121265w == 0 && c29665i.f121266x == null) {
                            c29665i.f121268z = (ActionProviderVisibilityListenerC30821o) c29665i.m91138a(string3, f121270f, this.f121272b);
                        } else {
                            if (z14) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            c29665i.f121268z = null;
                        }
                        c29665i.f121238A = typedArray.getText(17);
                        c29665i.f121239B = typedArray.getText(22);
                        if (typedArray.hasValue(19)) {
                            c29665i.f121241D = AbstractC31950e1.m99445c(typedArray.getInt(19, -1), c29665i.f121241D);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            c29665i.f121241D = null;
                        }
                        if (typedArray.hasValue(18)) {
                            c29665i.f121240C = c31983m2M99478p.m99484h(18);
                        } else {
                            c29665i.f121240C = colorStateList;
                        }
                        c31983m2M99478p.m99491r();
                        c29665i.f121250h = false;
                        xmlPullParser = xmlPullParser;
                    } else if (name2.equals("menu")) {
                        c29665i.f121250h = true;
                        SubMenu subMenuAddSubMenu = c29665i.f121243a.addSubMenu(c29665i.f121244b, c29665i.f121251i, c29665i.f121252j, c29665i.f121253k);
                        c29665i.m91139b(subMenuAddSubMenu.getItem());
                        xmlPullParser = xmlPullParser;
                        m91141b(xmlPullParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        xmlPullParser = xmlPullParser;
                        str = name2;
                        z13 = true;
                    }
                }
                z4 = z4;
            } else if (eventType != 3) {
                z4 = z4;
            } else {
                String name3 = xmlPullParser.getName();
                if (z13 && name3.equals(str)) {
                    xmlPullParser = xmlPullParser;
                    z13 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        c29665i.f121244b = 0;
                        c29665i.f121245c = 0;
                        c29665i.f121246d = 0;
                        c29665i.f121247e = 0;
                        c29665i.f121248f = true;
                        c29665i.f121249g = true;
                    } else if (name3.equals("item")) {
                        if (!c29665i.f121250h) {
                            ActionProviderVisibilityListenerC30821o actionProviderVisibilityListenerC30821o = c29665i.f121268z;
                            if (actionProviderVisibilityListenerC30821o == null || !actionProviderVisibilityListenerC30821o.f127112b.hasSubMenu()) {
                                c29665i.f121250h = true;
                                c29665i.m91139b(c29665i.f121243a.add(c29665i.f121244b, c29665i.f121251i, c29665i.f121252j, c29665i.f121253k));
                            } else {
                                c29665i.f121250h = true;
                                c29665i.m91139b(c29665i.f121243a.addSubMenu(c29665i.f121244b, c29665i.f121251i, c29665i.f121252j, c29665i.f121253k).getItem());
                            }
                        }
                    } else if (name3.equals("menu")) {
                        z4 = true;
                    }
                    z4 = z4;
                }
            }
            eventType = xmlPullParser.next();
            i13 = 2;
            z4 = z4;
            z13 = z13;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i13, Menu menu) {
        if (!(menu instanceof MenuC30818l)) {
            super.inflate(i13, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z4 = false;
        try {
            try {
                layout = this.f121273c.getResources().getLayout(i13);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof MenuC30818l) {
                    MenuC30818l menuC30818l = (MenuC30818l) menu;
                    if (!menuC30818l.f127070q) {
                        menuC30818l.m94828z();
                        z4 = true;
                    }
                }
                m91141b(layout, attributeSetAsAttributeSet, menu);
                if (z4) {
                    ((MenuC30818l) menu).m94827y();
                }
                layout.close();
            } catch (IOException e5) {
                throw new InflateException("Error inflating menu XML", e5);
            } catch (XmlPullParserException e13) {
                throw new InflateException("Error inflating menu XML", e13);
            }
        } catch (Throwable th3) {
            if (z4) {
                ((MenuC30818l) menu).m94827y();
            }
            if (layout != null) {
                layout.close();
            }
            throw th3;
        }
    }
}
