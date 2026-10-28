package p705ea2;

import c93.InterfaceC4351m;
import com.whoop.profile.view.edit.C9772c;
import ej1.C13242h;
import hn.InterfaceC17512t;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.view.internal.ViewReactionsView;
import j43.C21317a;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import live.hms.video.utils.C24405c;
import live.hms.video.utils.LogUtils;
import m83.AbstractC25260n;
import p215i9.InterfaceC18242r;
import p708hb2.C17098f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p719m22.C24947b;
import q83.AbstractC30060g;
import t23.C33392g2;
import tx0.C34238a;
import v43.C35698a;
import v43.EnumC35699b;

/* JADX INFO: renamed from: ea2.l */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C12915l implements Comparator {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f44438w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f44439x;

    public /* synthetic */ C12915l(Object obj, int i13) {
        this.f44438w = i13;
        this.f44439x = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iMo49749a;
        int iMo49749a2;
        boolean z4;
        boolean z13;
        int i13 = this.f44438w;
        Object obj3 = this.f44439x;
        switch (i13) {
            case 0:
                return AbstractC42783n.m36355s((C9772c) obj3, obj, obj2);
            case 1:
                return ((Number) ((C13242h) obj3).invoke(obj, obj2)).intValue();
            case 2:
                InterfaceC17512t interfaceC17512t = (InterfaceC17512t) obj3;
                iMo49749a = interfaceC17512t.mo49749a(obj2);
                iMo49749a2 = interfaceC17512t.mo49749a(obj);
                break;
            case 3:
                return ((Number) ((InterfaceC4351m) obj3).invoke(obj, obj2)).intValue();
            case 4:
                InterfaceC18242r interfaceC18242r = (InterfaceC18242r) obj3;
                iMo49749a = interfaceC18242r.mo52502a(obj2);
                iMo49749a2 = interfaceC18242r.mo52502a(obj);
                break;
            case 5:
                int i14 = ViewReactionsView.f74799w;
                return ((Number) ((C17098f) obj3).invoke(obj, obj2)).intValue();
            case 6:
                Comparator[] comparators = (Comparator[]) obj3;
                AbstractC22676k.m65750j(comparators, "$comparators");
                for (Comparator comparator : comparators) {
                    int iCompare = comparator.compare(obj, obj2);
                    if (iCompare != 0) {
                        return iCompare;
                    }
                }
                return 0;
            case 7:
                C21317a c21317a = (C21317a) obj3;
                return AbstractC22676k.m65751k(((Number) c21317a.invoke(((C33392g2) obj).f139426e)).intValue(), ((Number) c21317a.invoke(((C33392g2) obj2).f139426e)).intValue());
            case 8:
                Map pins = (Map) obj3;
                AbstractC22676k.m65750j(pins, "$pins");
                C35698a c35698a = (C35698a) pins.get(((C33392g2) obj).f139422a);
                C35698a c35698a2 = (C35698a) pins.get(((C33392g2) obj2).f139422a);
                if (c35698a != null && c35698a2 == null) {
                    return -1;
                }
                if (c35698a == null && c35698a2 != null) {
                    return 1;
                }
                if (c35698a == null && c35698a2 == null) {
                    return 0;
                }
                AbstractC22676k.m65747g(c35698a);
                EnumC35699b enumC35699b = EnumC35699b.f151897w;
                EnumC35699b enumC35699b2 = EnumC35699b.f151897w;
                AbstractC22676k.m65747g(c35698a2);
                return c35698a2.f151896b.compareTo(c35698a.f151896b);
            case 9:
                String[] strArr = (String[]) obj3;
                C33392g2 c33392g2 = (C33392g2) obj2;
                Iterable iterable = (Iterable) ((C33392g2) obj).f139421M.getValue();
                if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                    z4 = false;
                } else {
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z4 = false;
                        } else if (AbstractC25260n.m74056a0(strArr, (String) it.next())) {
                            z4 = true;
                        }
                    }
                }
                Iterable iterable2 = (Iterable) c33392g2.f139421M.getValue();
                if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                    z13 = false;
                } else {
                    Iterator it3 = iterable2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z13 = false;
                        } else if (AbstractC25260n.m74056a0(strArr, (String) it3.next())) {
                            z13 = true;
                        }
                    }
                }
                if (!z4 || z13) {
                    return (z4 || !z13) ? 0 : 1;
                }
                return -1;
            case 10:
                return LogUtils.checkDirSizeAndRemove$lambda$5$lambda$3((C24405c) obj3, obj, obj2);
            case 11:
                return ((Number) ((C24947b) obj3).invoke(obj, obj2)).intValue();
            case 12:
                for (Function1 function1 : (Function1[]) obj3) {
                    int iM92127q = AbstractC30060g.m92127q((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
                    if (iM92127q != 0) {
                        return iM92127q;
                    }
                }
                return 0;
            default:
                return ((Number) ((C34238a) obj3).invoke(obj, obj2)).intValue();
        }
        return iMo49749a - iMo49749a2;
    }
}
