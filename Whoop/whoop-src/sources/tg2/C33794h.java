package tg2;

import com.whoop.design.util.AbstractC8693b;
import d13.AbstractC11478a;
import hg3.AbstractC17269i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kd1.AbstractC22404p;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import n82.C26457c;
import n82.EnumC26455a;
import no.nordicsemi.android.dfu.DfuBaseService;
import od1.C27836a;
import od1.C27850m;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import q83.AbstractC30060g;
import y71.C39282o;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: tg2.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u000f*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004*\b\u0012\u0004\u0012\u00020\u000f0\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Ltg2/h;", "", "<init>", "()V", "", "Lod1/a;", "activities", "Ll83/k;", "e", "(Ljava/util/List;)Ll83/k;", "", "d", "(Lod1/a;)Z", "", "selectedInternalName", "Ly71/o;", "i", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lod1/a;Ljava/lang/String;)Ly71/o;", "c", "b", "(Ly71/o;Ljava/lang/String;)Ly71/o;", "Lod1/m;", "domainState", "Ln82/c;", "f", "(Lod1/m;Ljava/lang/String;)Ln82/c;", "viewState", "a", "(Ln82/c;Ljava/lang/String;)Ln82/c;", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33794h {

    /* JADX INFO: renamed from: tg2.h$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f141500a;

        static {
            int[] iArr = new int[EnumC26455a.values().length];
            try {
                iArr[EnumC26455a.RECOVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f141500a = iArr;
        }
    }

    /* JADX INFO: renamed from: tg2.h$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f141501w = new b();

        /* JADX INFO: renamed from: a */
        public final long m106917a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(0.15f, whoopColor.getStrain());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m106917a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: tg2.h$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f141502w = new c();

        /* JADX INFO: renamed from: a */
        public final long m106918a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrain();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m106918a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: tg2.h$d */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t14, T t15) {
            String strM83907d = ((C27836a) t14).getDisplayName();
            Locale locale = Locale.ROOT;
            String upperCase = strM83907d.toUpperCase(locale);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            String upperCase2 = ((C27836a) t15).getDisplayName().toUpperCase(locale);
            AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
            return AbstractC30060g.m92127q(upperCase, upperCase2);
        }
    }

    /* JADX INFO: renamed from: b */
    private final C39282o m106908b(C39282o c39282o, String str) {
        Object obj = c39282o.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        return (AbstractC39414r.m125890i0(str) || !AbstractC22676k.m65745e(obj instanceof String ? (String) obj : null, str)) ? c39282o : c39282o.m125211a((32735 & 1) != 0 ? c39282o.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32735 & 2) != 0 ? c39282o.title : null, (32735 & 4) != 0 ? c39282o.titleColor : null, (32735 & 8) != 0 ? c39282o.enabled : false, (32735 & 16) != 0 ? c39282o.selected : false, (32735 & 32) != 0 ? c39282o.alignment : null, (32735 & 64) != 0 ? c39282o.shouldApplyCardGradient : false, (32735 & 128) != 0 ? c39282o.background : p745y81.Function1.m125323a(b.f141501w), (32735 & 256) != 0 ? c39282o.border : AbstractC17269i.m48880a(((float) 0.375d) * 4, p745y81.Function1.m125323a(c.f141502w).getColor()), (32735 & 512) != 0 ? c39282o.destination : null, (32735 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c39282o.showCaretIcon : false, (32735 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c39282o.menuItemStyle : null, (32735 & 4096) != 0 ? c39282o.trackingId : null, (32735 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c39282o.genericInteraction : null, (32735 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c39282o.analyticEvent : null);
    }

    /* JADX INFO: renamed from: c */
    private final List<C39282o> m106909c(List<C39282o> list, String str) {
        List<C39282o> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(m106908b((C39282o) it.next(), str));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    private final boolean m106910d(C27836a c27836a) {
        return AbstractC22676k.m65745e(c27836a.getInternalName(), "increase_alertness") || AbstractC22676k.m65745e(c27836a.getInternalName(), "increase_relaxation");
    }

    /* JADX INFO: renamed from: e */
    private final C23465k m106911e(List<C27836a> activities) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : activities) {
            if (m106910d((C27836a) obj)) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return new C23465k(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C26457c m106912g(C33794h c33794h, C27850m c27850m, String str, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str = "";
        }
        return c33794h.m106916f(c27850m, str);
    }

    /* JADX INFO: renamed from: h */
    private final C39282o m106913h(C27836a c27836a, String str) {
        C39282o.Companion companion = C39282o.INSTANCE;
        String strM83909g = c27836a.getInternalName();
        return m106908b(companion.m125233e(AbstractC11478a.m30853e(Locale.ROOT, c27836a.getDisplayName(), "toUpperCase(...)"), (32718 & 2) != 0 ? p745y81.Function1.m125323a(C39282o.Companion.i.f169013w) : null, (32718 & 4) != 0 ? AbstractC8693b.m21267a() : null, (32718 & 8) != 0 ? p745y81.Function1.m125323a(C39282o.Companion.j.f169014w) : null, (32718 & 16) != 0 ? null : AbstractC22404p.m64503l(c27836a.getIconUrl()), (32718 & 32) == 0 ? null : null, (32718 & 64) != 0 ? AbstractC8693b.m21267a() : null, (32718 & 128) != 0 ? AbstractC8693b.m21267a() : null, (32718 & 256) != 0 ? AbstractC8693b.m21267a() : null, (32718 & 512) != 0 ? AbstractC8693b.m21267a() : null, (32718 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? p745y81.Function1.m125323a(C39282o.Companion.k.f169015w) : null, (32718 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0, (32718 & 4096) != 0 ? false : false, (32718 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? C23454a0.f92919a : strM83909g, (32718 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? false : false), str);
    }

    /* JADX INFO: renamed from: i */
    private final List<C39282o> m106914i(List<C27836a> list, String str) {
        List<C27836a> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(m106913h((C27836a) it.next(), str));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final C26457c m106915a(C26457c viewState, String selectedInternalName) {
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(selectedInternalName, "selectedInternalName");
        if (AbstractC39414r.m125890i0(selectedInternalName)) {
            return viewState;
        }
        List<C39282o> listM106909c = m106909c(viewState.m78357h(), selectedInternalName);
        List<C39282o> listM106909c2 = m106909c(viewState.m78353d(), selectedInternalName);
        List<C39282o> listM78356g = viewState.m78356g();
        return C26457c.m78350b(viewState, null, null, listM106909c, listM106909c2, listM78356g != null ? m106909c(listM78356g, selectedInternalName) : null, null, null, null, null, false, 995, null);
    }

    /* JADX INFO: renamed from: f */
    public final C26457c m106916f(C27850m domainState, String selectedInternalName) {
        C23465k c23465k;
        AbstractC22676k.m65750j(domainState, "domainState");
        AbstractC22676k.m65750j(selectedInternalName, "selectedInternalName");
        if (a.f141500a[domainState.getSelectedScreenType().ordinal()] == 1) {
            c23465k = m106911e(domainState.m83970d());
        } else {
            List<C27836a> listM83971e = domainState.m83971e();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM83971e) {
                if (!AbstractC33797k.m106947a(((C27836a) obj).getInternalName())) {
                    arrayList.add(obj);
                }
            }
            c23465k = new C23465k(arrayList, domainState.m83970d());
        }
        return new C26457c(null, domainState.getCom.mapbox.common.MapboxServices.SEARCH java.lang.String(), m106914i((List) c23465k.f92937w, selectedInternalName), m106914i(AbstractC25265s.m74152u1((List) c23465k.f92938x, new d()), selectedInternalName), null, null, domainState.getPageType(), null, null, false, 945, null);
    }
}
