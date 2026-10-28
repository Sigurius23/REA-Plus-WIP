package p342nj;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.AndroidComposeView;
import com.amplitude.android.engagement.C4861a;
import j43.C21317a;
import j93.InterfaceC21493z;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import p002a0.C0057v0;
import p031b9.AbstractC2875y;
import p209i3.AbstractC18037s;
import p209i3.C18034p;
import p209i3.C18036r;
import p209i3.C18043y;
import p553vj.C36065b;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22686q;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: nj.c */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC26738c {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC21493z[] f106347a = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(AbstractC26738c.class, "amplitudeViewTagProperty", "getAmplitudeViewTagProperty(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1))};

    /* JADX INFO: renamed from: b */
    public static final C18043y f106348b = new C18043y("AmplitudeViewTagKey");

    /* JADX INFO: renamed from: a */
    public static final ArrayList m79607a(View view, Context context, Rect rect, String str) {
        ArrayList arrayList = new ArrayList();
        Rect rect2 = new Rect();
        if (view.getGlobalVisibleRect(rect2) && Rect.intersects(rect2, rect)) {
            if ((view.getTag() != null && AbstractC22676k.m65745e(view.getTag(), str)) || (view.getContentDescription() != null && AbstractC22676k.m65745e(view.getContentDescription(), str))) {
                C26737b c26737b = new C26737b(1, rect2);
                Context context2 = view.getContext();
                AbstractC22676k.m65749i(context2, "context");
                arrayList.add(new C21317a(c26737b, 20).invoke(new C36065b(context2)));
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    if (!(i14 < viewGroup.getChildCount())) {
                        break;
                    }
                    int i15 = i14 + 1;
                    View childAt = viewGroup.getChildAt(i14);
                    if (childAt == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    int i16 = i13 + 1;
                    if (i13 < 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    if (childAt.isShown()) {
                        arrayList.addAll(m79607a(childAt, context, rect, str));
                    }
                    i14 = i15;
                    i13 = i16;
                }
            }
            if (view.getClass().getName().equals("androidx.compose.ui.platform.AndroidComposeView")) {
                C4861a.f20259o.m16031I("Entering Compose view hierarchy for ".concat(view.getClass().getSimpleName()));
                try {
                    Class cls = AndroidComposeView.f4886h1;
                    Field declaredField = AndroidComposeView.class.getDeclaredField("semanticsOwner");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(view);
                    AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsOwner");
                    arrayList.addAll(m79608b(AbstractC18037s.m51796a(((C18036r) obj).f69995a, true), context, str));
                    return arrayList;
                } catch (Exception e5) {
                    C4861a.f20259o.m16032K(AbstractC2875y.m8298k(e5, new StringBuilder("Error finding target component in Compose layout ")), e5);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static final ArrayList m79608b(C18034p c18034p, Context context, String str) {
        ArrayList arrayList = new ArrayList();
        c18034p.getClass();
        Iterator it = C18034p.m51776j(7, c18034p).iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                C0057v0 c0057v0 = c18034p.m51786k().f69980w;
                C18043y c18043y = f106348b;
                Object objM129g = c0057v0.m129g(c18043y);
                if (objM129g == null) {
                    objM129g = null;
                }
                if (((String) objM129g) != null) {
                    Object objM129g2 = c18034p.m51786k().f69980w.m129g(c18043y);
                    if (AbstractC22676k.m65745e((String) (objM129g2 != null ? objM129g2 : null), str)) {
                        arrayList.add((Rect) new C21317a(c18034p, 3).invoke(new C36065b(context)));
                    }
                }
                return arrayList;
            }
            Object next = it.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            arrayList.addAll(m79608b((C18034p) next, context, str));
            i13 = i14;
        }
    }
}
