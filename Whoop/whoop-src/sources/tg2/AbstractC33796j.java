package tg2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b30.C2549j2;
import b81.AbstractC2802i;
import b81.C2803j;
import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import com.whoop.data.local.room.dao.wipeable.C6517d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hg2.AbstractC17260a;
import hy0.AbstractC17755i2;
import hy0.AbstractC17795v0;
import hy0.AbstractC17801x0;
import java.util.List;
import l83.C23454a0;
import n82.C26457c;
import n82.EnumC26455a;
import n82.InterfaceC26456b;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.C15043i8;
import p163g1.C15197y1;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22976l1;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.InterfaceC23013y;
import p319m4.AbstractC25012a;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28653p1;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p733ry2.C31915d;
import p734sl0.C32632k2;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import s90.C32290f;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39282o;

/* JADX INFO: renamed from: tg2.j */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\u001aS\u0010\f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r\u001a?\u0010\u0011\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a=\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017²\u0006\u000e\u0010\u0016\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Ln82/c;", "viewState", "Lkotlin/Function1;", "Ln82/b;", "Ll83/a0;", "onEvent", "", "onActivitySelected", "Landroidx/compose/ui/Modifier;", "modifier", "", "fillsBottomSheet", "l", "(Ln82/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "Ll0/y;", "Ln82/a;", "selectedScreenType", "j", "(Ll0/y;ZLn82/c;Ln82/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "g", "(Ln82/c;Ln82/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "selectedIndex", "start-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33796j {

    /* JADX INFO: renamed from: tg2.j$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C39282o f141511w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f141512x;

        public a(C39282o c39282o, Function1 function1) {
            this.f141511w = c39282o;
            this.f141512x = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m106938a(Object it) {
            AbstractC22676k.m65750j(it, "it");
            Object event = this.f141511w.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
            String str = event instanceof String ? (String) event : null;
            if (str == null) {
                str = "";
            }
            this.f141512x.invoke(str);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m106938a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: tg2.j$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C39282o f141513w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f141514x;

        public b(C39282o c39282o, Function1 function1) {
            this.f141513w = c39282o;
            this.f141514x = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m106939a(Object it) {
            AbstractC22676k.m65750j(it, "it");
            Object event = this.f141513w.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
            String str = event instanceof String ? (String) event : null;
            if (str == null) {
                str = "";
            }
            this.f141514x.invoke(str);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m106939a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: tg2.j$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f141515w;

        public c(List list) {
            this.f141515w = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m106940a(int i13) {
            this.f141515w.get(i13);
            return null;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m106940a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: tg2.j$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f141516w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ int f141517x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f141518y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C26457c f141519z;

        public d(List list, int i13, Function1 function1, C26457c c26457c) {
            this.f141516w = list;
            this.f141517x = i13;
            this.f141518y = function1;
            this.f141519z = c26457c;
        }

        /* JADX INFO: renamed from: a */
        public final void m106941a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = i14 | (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2);
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            C39282o c39282o = (C39282o) this.f141516w.get(i13);
            c28655q.m87150e0(-620763932);
            C2314t c2314t = C2314t.f9131w;
            if (i13 == 0) {
                c28655q.m87150e0(-620760244);
                AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, 2 * 8, 1), null, null, AbstractC8693b.m21277k(this.f141517x), null, 0L, 0L, null, c28655q, (TextResource.C8688b.f25889c << 9) | 6, 246);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-620568044);
                c28655q.m87173q(false);
            }
            boolean zM87157i = c28655q.m87157i(c39282o) | c28655q.m87153g(this.f141518y);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new a(c39282o, this.f141518y);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(c39282o, null, null, (Function1) objM87133R, c28655q, C39282o.f168987q, 6);
            if (i13 == this.f141519z.m78357h().size() - 1) {
                c28655q.m87150e0(-620269979);
                AbstractC25012a.m73388u(1, 8, c2314t, c28655q, false);
            } else {
                c28655q.m87150e0(-620194060);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m106941a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: tg2.j$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f141520w;

        public e(List list) {
            this.f141520w = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m106942a(int i13) {
            this.f141520w.get(i13);
            return null;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m106942a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: tg2.j$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f141521w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f141522x;

        public f(List list, Function1 function1) {
            this.f141521w = list;
            this.f141522x = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m106943a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = i14 | (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2);
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            C39282o c39282o = (C39282o) this.f141521w.get(i13);
            c28655q.m87150e0(1655595768);
            if (i13 == 0) {
                c28655q.m87150e0(1655603765);
                AbstractC17755i2.m50938j(AbstractC1099a.m3396r(C2314t.f9131w, 0.0f, 2 * 8, 1), null, null, AbstractC8693b.m21277k(AbstractC17260a.f66343r), null, 0L, 0L, null, c28655q, (TextResource.C8688b.f25889c << 9) | 6, 246);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1655809419);
                c28655q.m87173q(false);
            }
            boolean zM87157i = c28655q.m87157i(c39282o) | c28655q.m87153g(this.f141522x);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new b(c39282o, this.f141522x);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(c39282o, null, null, (Function1) objM87133R, c28655q, C39282o.f168987q, 6);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m106943a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: tg2.j$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ int f141523w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f141524x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C26457c f141525y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28593a1 f141526z;

        public g(int i13, Function1 function1, C26457c c26457c, InterfaceC28593a1 interfaceC28593a1) {
            this.f141523w = i13;
            this.f141524x = function1;
            this.f141525y = c26457c;
            this.f141526z = interfaceC28593a1;
        }

        /* JADX INFO: renamed from: a */
        public final void m106944a() {
            AbstractC33796j.m106932n(this.f141526z, this.f141523w);
            this.f141524x.invoke(new InterfaceC26456b.b(this.f141525y.getCom.mapbox.common.MapboxServices.SEARCH java.lang.String(), this.f141525y.m78352c().get(this.f141523w)));
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m106944a();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: tg2.j$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f141527w;

        public h(List list) {
            this.f141527w = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m106945a(int i13) {
            this.f141527w.get(i13);
            return null;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m106945a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: tg2.j$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f141528w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f141529x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C26457c f141530y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28593a1 f141531z;

        public i(List list, Function1 function1, C26457c c26457c, InterfaceC28593a1 interfaceC28593a1) {
            this.f141528w = list;
            this.f141529x = function1;
            this.f141530y = c26457c;
            this.f141531z = interfaceC28593a1;
        }

        /* JADX INFO: renamed from: a */
        public final void m106946a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = i14 | (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2);
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            int i16 = i15;
            boolean z4 = true;
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i16 & 1, (i16 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            int iIntValue = ((Number) this.f141528w.get(i13)).intValue();
            c28655q.m87150e0(-1519076104);
            C2803j c2803j = new C2803j(i13, AbstractC30060g.m92103Y(c28655q, iIntValue), AbstractC33796j.m106931m(this.f141531z) == i13, false, 3.0d, 8, null);
            if ((((i16 & 112) ^ 48) <= 32 || !c28655q.m87149e(i13)) && (i16 & 48) != 32) {
                z4 = false;
            }
            boolean zM87153g = c28655q.m87153g(this.f141529x) | z4 | c28655q.m87157i(this.f141530y);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new g(i13, this.f141529x, this.f141530y, this.f141531z);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC2802i.m7980c(c2803j, (InterfaceC4339a) objM87133R, c28655q, C2803j.f10992f);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m106946a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: tg2.j$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class j {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f141532a;

        static {
            int[] iArr = new int[EnumC26455a.values().length];
            try {
                iArr[EnumC26455a.RECOVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f141532a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    private static final void m106925g(C26457c c26457c, EnumC26455a enumC26455a, Function1 function1, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        int i16;
        boolean z13;
        boolean zM87149e;
        Object objM87133R;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1906970376);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(c26457c) : c28655q.m87157i(c26457c) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87149e(enumC26455a.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        int i17 = i14 & 8;
        if (i17 == 0) {
            if ((i13 & 3072) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i17 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if (j.f141532a[enumC26455a.ordinal()] == 1) {
                    i16 = AbstractC17260a.f66340o;
                } else {
                    i16 = AbstractC17260a.f66341p;
                }
                C22971k c22971kM66746i = AbstractC22977m.m66746i(1 * 8);
                if ((i15 & 14) != 4 || ((i15 & 8) != 0 && c28655q.m87157i(c26457c))) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87149e = z13 | c28655q.m87149e(i16) | ((i15 & 896) == 256);
                objM87133R = c28655q.m87133R();
                if (zM87149e || objM87133R == C28635l.f115821a) {
                    objM87133R = new C6517d(c26457c, i16, function1, 15);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC22674j.m65717c(modifier3, null, null, c22971kM66746i, null, null, false, null, (Function1) objM87133R, c28655q, ((i15 >> 9) & 14) | 24576, 494);
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(c26457c, enumC26455a, function1, modifier3, i13, i14, 4);
            }
        }
        i15 |= 3072;
        modifier2 = modifier;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i17 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            if (j.f141532a[enumC26455a.ordinal()] == 1) {
                i16 = AbstractC17260a.f66340o;
            } else {
                i16 = AbstractC17260a.f66341p;
            }
            C22971k c22971kM66746i2 = AbstractC22977m.m66746i(1 * 8);
            if ((i15 & 14) != 4) {
                z13 = true;
            } else {
                z13 = true;
            }
            zM87149e = z13 | c28655q.m87149e(i16) | ((i15 & 896) == 256);
            objM87133R = c28655q.m87133R();
            if (zM87149e) {
                objM87133R = new C6517d(c26457c, i16, function1, 15);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C6517d(c26457c, i16, function1, 15);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC22674j.m65717c(modifier3, null, null, c22971kM66746i2, null, null, false, null, (Function1) objM87133R, c28655q, ((i15 >> 9) & 14) | 24576, 494);
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32632k2(c26457c, enumC26455a, function1, modifier3, i13, i14, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m106926h(C26457c c26457c, int i13, Function1 function1, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        List<C39282o> listM78357h = c26457c.m78357h();
        C26053f c26053f = (C26053f) LazyColumn;
        c26053f.m77529r(listM78357h.size(), null, new c(listM78357h), new C37816b(new d(listM78357h, i13, function1, c26457c), true, 2039820996));
        List<C39282o> listM78356g = c26457c.m78356g();
        if (listM78356g == null) {
            listM78356g = c26457c.m78353d();
        }
        c26053f.m77529r(listM78356g.size(), null, new e(listM78356g), new C37816b(new f(listM78356g, function1), true, 2039820996));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m106927i(C26457c c26457c, EnumC26455a enumC26455a, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m106925g(c26457c, enumC26455a, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    private static final void m106928j(InterfaceC23013y interfaceC23013y, boolean z4, C26457c c26457c, EnumC26455a enumC26455a, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-951527825);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(interfaceC23013y) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= (i13 & 512) == 0 ? c28655q.m87153g(c26457c) : c28655q.m87157i(c26457c) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87149e(enumC26455a.ordinal()) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(function1) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            C2314t c2314t = C2314t.f9131w;
            int i15 = i14 >> 6;
            m106925g(c26457c, enumC26455a, function1, z4 ? ((C23016z) interfaceC23013y).m66779c(AbstractC1102d.m3409f(1.0f, c2314t), true, 1.0f) : AbstractC1102d.m3409f(1.0f, c2314t), c28655q, C26457c.f105074k | (i15 & 14) | (i15 & 112) | (i15 & 896), 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2549j2(interfaceC23013y, z4, c26457c, enumC26455a, function1, i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m106929k(InterfaceC23013y interfaceC23013y, boolean z4, C26457c c26457c, EnumC26455a enumC26455a, Function1 function1, int i13, Composer composer, int i14) {
        m106928j(interfaceC23013y, z4, c26457c, enumC26455a, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:120:0x031a  */
    /* JADX WARN: Code duplicated, block: B:123:0x0326  */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:47:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:66:0x0109  */
    /* JADX WARN: Code duplicated, block: B:67:0x010d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0120  */
    /* JADX WARN: Code duplicated, block: B:72:0x012e  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:88:0x0202  */
    /* JADX WARN: Code duplicated, block: B:91:0x0207  */
    /* JADX WARN: Code duplicated, block: B:95:0x0256  */
    /* JADX INFO: renamed from: l */
    public static final void m106930l(C26457c viewState, Function1 onEvent, Function1 onActivitySelected, Modifier modifier, boolean z4, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        boolean z13;
        int i17;
        boolean z14;
        C28655q c28655q;
        Modifier modifier3;
        boolean z15;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        boolean z16;
        Object objM87133R;
        C28676v0 c28676v0;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i18;
        boolean z17;
        int i19;
        boolean z18;
        boolean z19;
        Object objM87133R2;
        C28676v0 c28676v1;
        int i24;
        boolean z24;
        boolean z25;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        AbstractC22676k.m65750j(onActivitySelected, "onActivitySelected");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1185328368);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(onEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(onActivitySelected) ? 256 : 128;
        }
        int i25 = i14 & 8;
        if (i25 == 0) {
            if ((i13 & 3072) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    z13 = z4;
                    if (c28655q2.m87155h(z13)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                if ((i15 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z14)) {
                    c2314t = C2314t.f9131w;
                    if (i25 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC31061c.m95646v(0, c28655q2);
                    }
                    InterfaceC28593a1 interfaceC28593a1 = (InterfaceC28593a1) objM87133R;
                    List listM118959K = AbstractC37056f.m118959K(Integer.valueOf(AbstractC17260a.f66343r), Integer.valueOf(AbstractC17260a.f66346u), Integer.valueOf(AbstractC17260a.f66344s), Integer.valueOf(AbstractC17260a.f66345t));
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier2);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                    float f13 = 8;
                    Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f13, 7), "searchField");
                    TextResource textResourceM21278l = AbstractC8693b.m21278l(viewState.getCom.mapbox.common.MapboxServices.SEARCH java.lang.String());
                    TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC17260a.f66342q);
                    C38072d c38072d = C38072d.f163053a;
                    int i26 = C38072d.f163054b;
                    long jM125385c1 = c38072d.m121949b(c28655q2, i26).getWhite70();
                    C15043i8 c15043i8 = C15043i8.f56313a;
                    Modifier modifier4 = modifier2;
                    C15197y1 c15197y1M43130h = C15043i8.m43130h(c38072d.m121949b(c28655q2, i26).getBrandWhite(), 0L, c38072d.m121949b(c28655q2, i26).getBlack30(), c38072d.m121949b(c28655q2, i26).getBrandWhite(), c38072d.m121949b(c28655q2, i26).getBrandWhite(), c38072d.m121949b(c28655q2, i26).getWhite40(), c38072d.m121949b(c28655q2, i26).getWhite40(), 0L, c38072d.m121949b(c28655q2, i26).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q2, 2096770);
                    i18 = i15 & 112;
                    if (i18 == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    i19 = i15 & 14;
                    if (i19 != 4 || ((i15 & 8) != 0 && c28655q2.m87157i(viewState))) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | z17;
                    objM87133R2 = c28655q2.m87133R();
                    if (z19) {
                        c28676v1 = c28676v0;
                    } else {
                        if (objM87133R2 == c28676v1) {
                        }
                        c28676v1 = c28676v0;
                        C28676v0 c28676v2 = c28676v1;
                        AbstractC17795v0.m51127j(modifierM3599a, textResourceM21278l, c8688bM21277k, null, 0L, 0, false, c15197y1M43130h, jM125385c1, false, null, false, false, null, (Function1) objM87133R2, c28655q2, (TextResource.$stable << 3) | 6 | (TextResource.C8688b.f25889c << 6), 0, 15992);
                        c28655q = c28655q2;
                        if (viewState.getPageType() == EnumC26455a.ALL || viewState.getCrossScoreTypeSearchEnabled()) {
                            i24 = i15;
                            z24 = true;
                            c28655q.m87150e0(-129222872);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-130065979);
                            float f14 = 1 * f13;
                            C22971k c22971kM66746i = AbstractC22977m.m66746i(f14);
                            C22976l1 c22976l1M3379a = AbstractC1099a.m3379a(0.0f, f14, 1);
                            boolean zM87153g = c28655q.m87153g(listM118959K) | (i18 == 32) | (i19 == 4 || ((i15 & 8) != 0 && c28655q.m87157i(viewState)));
                            Object objM87133R3 = c28655q.m87133R();
                            if (zM87153g || objM87133R3 == c28676v2) {
                                i24 = i15;
                                z25 = false;
                                C31915d c31915d = new C31915d(7, listM118959K, onEvent, viewState, interfaceC28593a1, false);
                                c28655q.m87172p0(c31915d);
                                objM87133R3 = c31915d;
                            } else {
                                i24 = i15;
                                z25 = false;
                            }
                            z24 = true;
                            AbstractC22674j.m65718d(null, null, c22976l1M3379a, c22971kM66746i, null, null, false, null, (Function1) objM87133R3, c28655q, 24960, 491);
                            c28655q = c28655q;
                            c28655q.m87173q(z25);
                        }
                        EnumC26455a enumC26455a = viewState.m78352c().get(m106931m(interfaceC28593a1));
                        int i27 = i24 << 6;
                        int i28 = 6 | ((i24 >> 9) & 112) | (C26457c.f105074k << 6) | (i27 & 896) | (i27 & 57344);
                        boolean z26 = z16;
                        m106928j(C23016z.f90757a, z26, viewState, enumC26455a, onActivitySelected, c28655q, i28);
                        c28655q.m87173q(z24);
                        z15 = z26;
                        modifier3 = modifier4;
                    }
                    c28676v1 = c28676v0;
                    objM87133R2 = new C32290f(onEvent, viewState, interfaceC28593a1, 8);
                    c28655q2.m87172p0(objM87133R2);
                    c28676v1 = c28676v0;
                    C28676v0 c28676v3 = c28676v1;
                    AbstractC17795v0.m51127j(modifierM3599a, textResourceM21278l, c8688bM21277k, null, 0L, 0, false, c15197y1M43130h, jM125385c1, false, null, false, false, null, (Function1) objM87133R2, c28655q2, (TextResource.$stable << 3) | 6 | (TextResource.C8688b.f25889c << 6), 0, 15992);
                    c28655q = c28655q2;
                    if (viewState.getPageType() == EnumC26455a.ALL) {
                        i24 = i15;
                        z24 = true;
                        c28655q.m87150e0(-129222872);
                        c28655q.m87173q(false);
                    } else {
                        i24 = i15;
                        z24 = true;
                        c28655q.m87150e0(-129222872);
                        c28655q.m87173q(false);
                    }
                    EnumC26455a enumC26455a2 = viewState.m78352c().get(m106931m(interfaceC28593a1));
                    int i29 = i24 << 6;
                    int i210 = 6 | ((i24 >> 9) & 112) | (C26457c.f105074k << 6) | (i29 & 896) | (i29 & 57344);
                    boolean z27 = z16;
                    m106928j(C23016z.f90757a, z27, viewState, enumC26455a2, onActivitySelected, c28655q, i210);
                    c28655q.m87173q(z24);
                    z15 = z27;
                    modifier3 = modifier4;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z15 = z13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C33795i(viewState, onEvent, onActivitySelected, modifier3, z15, i13, i14);
                }
            }
            i15 |= 24576;
            z13 = z4;
            if ((i15 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i25 != 0) {
                    modifier2 = c2314t;
                }
                if (i16 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC31061c.m95646v(0, c28655q2);
                }
                InterfaceC28593a1 interfaceC28593a2 = (InterfaceC28593a1) objM87133R;
                List listM118959K2 = AbstractC37056f.m118959K(Integer.valueOf(AbstractC17260a.f66343r), Integer.valueOf(AbstractC17260a.f66346u), Integer.valueOf(AbstractC17260a.f66344s), Integer.valueOf(AbstractC17260a.f66345t));
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier2);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3409f2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                float f15 = 8;
                Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f15, 7), "searchField");
                TextResource textResourceM21278l2 = AbstractC8693b.m21278l(viewState.getCom.mapbox.common.MapboxServices.SEARCH java.lang.String());
                TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC17260a.f66342q);
                C38072d c38072d2 = C38072d.f163053a;
                int i211 = C38072d.f163054b;
                long jM125385c2 = c38072d2.m121949b(c28655q2, i211).getWhite70();
                C15043i8 c15043i9 = C15043i8.f56313a;
                Modifier modifier5 = modifier2;
                C15197y1 c15197y1M43130h2 = C15043i8.m43130h(c38072d2.m121949b(c28655q2, i211).getBrandWhite(), 0L, c38072d2.m121949b(c28655q2, i211).getBlack30(), c38072d2.m121949b(c28655q2, i211).getBrandWhite(), c38072d2.m121949b(c28655q2, i211).getBrandWhite(), c38072d2.m121949b(c28655q2, i211).getWhite40(), c38072d2.m121949b(c28655q2, i211).getWhite40(), 0L, c38072d2.m121949b(c28655q2, i211).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q2, 2096770);
                i18 = i15 & 112;
                if (i18 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                i19 = i15 & 14;
                if (i19 != 4) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                z19 = z18 | z17;
                objM87133R2 = c28655q2.m87133R();
                if (z19) {
                    if (objM87133R2 == c28676v1) {
                    }
                    c28676v1 = c28676v0;
                    C28676v0 c28676v4 = c28676v1;
                    AbstractC17795v0.m51127j(modifierM3599a2, textResourceM21278l2, c8688bM21277k2, null, 0L, 0, false, c15197y1M43130h2, jM125385c2, false, null, false, false, null, (Function1) objM87133R2, c28655q2, (TextResource.$stable << 3) | 6 | (TextResource.C8688b.f25889c << 6), 0, 15992);
                    c28655q = c28655q2;
                    if (viewState.getPageType() == EnumC26455a.ALL) {
                        i24 = i15;
                        z24 = true;
                        c28655q.m87150e0(-129222872);
                        c28655q.m87173q(false);
                    } else {
                        i24 = i15;
                        z24 = true;
                        c28655q.m87150e0(-129222872);
                        c28655q.m87173q(false);
                    }
                    EnumC26455a enumC26455a3 = viewState.m78352c().get(m106931m(interfaceC28593a2));
                    int i212 = i24 << 6;
                    int i213 = 6 | ((i24 >> 9) & 112) | (C26457c.f105074k << 6) | (i212 & 896) | (i212 & 57344);
                    boolean z28 = z16;
                    m106928j(C23016z.f90757a, z28, viewState, enumC26455a3, onActivitySelected, c28655q, i213);
                    c28655q.m87173q(z24);
                    z15 = z28;
                    modifier3 = modifier5;
                } else {
                    c28676v1 = c28676v0;
                }
                c28676v1 = c28676v0;
                objM87133R2 = new C32290f(onEvent, viewState, interfaceC28593a2, 8);
                c28655q2.m87172p0(objM87133R2);
                c28676v1 = c28676v0;
                C28676v0 c28676v5 = c28676v1;
                AbstractC17795v0.m51127j(modifierM3599a2, textResourceM21278l2, c8688bM21277k2, null, 0L, 0, false, c15197y1M43130h2, jM125385c2, false, null, false, false, null, (Function1) objM87133R2, c28655q2, (TextResource.$stable << 3) | 6 | (TextResource.C8688b.f25889c << 6), 0, 15992);
                c28655q = c28655q2;
                if (viewState.getPageType() == EnumC26455a.ALL) {
                    i24 = i15;
                    z24 = true;
                    c28655q.m87150e0(-129222872);
                    c28655q.m87173q(false);
                } else {
                    i24 = i15;
                    z24 = true;
                    c28655q.m87150e0(-129222872);
                    c28655q.m87173q(false);
                }
                EnumC26455a enumC26455a4 = viewState.m78352c().get(m106931m(interfaceC28593a2));
                int i214 = i24 << 6;
                int i215 = 6 | ((i24 >> 9) & 112) | (C26457c.f105074k << 6) | (i214 & 896) | (i214 & 57344);
                boolean z29 = z16;
                m106928j(C23016z.f90757a, z29, viewState, enumC26455a4, onActivitySelected, c28655q, i215);
                c28655q.m87173q(z24);
                z15 = z29;
                modifier3 = modifier5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33795i(viewState, onEvent, onActivitySelected, modifier3, z15, i13, i14);
            }
        }
        i15 |= 3072;
        modifier2 = modifier;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                z13 = z4;
                if (c28655q2.m87155h(z13)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            if ((i15 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i25 != 0) {
                    modifier2 = c2314t;
                }
                if (i16 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC31061c.m95646v(0, c28655q2);
                }
                InterfaceC28593a1 interfaceC28593a3 = (InterfaceC28593a1) objM87133R;
                List listM118959K3 = AbstractC37056f.m118959K(Integer.valueOf(AbstractC17260a.f66343r), Integer.valueOf(AbstractC17260a.f66346u), Integer.valueOf(AbstractC17260a.f66344s), Integer.valueOf(AbstractC17260a.f66345t));
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, modifier2);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3409f3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
                float f16 = 8;
                Modifier modifierM3599a3 = AbstractC1136a.m3599a(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f16, 7), "searchField");
                TextResource textResourceM21278l3 = AbstractC8693b.m21278l(viewState.getCom.mapbox.common.MapboxServices.SEARCH java.lang.String());
                TextResource.C8688b c8688bM21277k3 = AbstractC8693b.m21277k(AbstractC17260a.f66342q);
                C38072d c38072d3 = C38072d.f163053a;
                int i216 = C38072d.f163054b;
                long jM125385c3 = c38072d3.m121949b(c28655q2, i216).getWhite70();
                C15043i8 c15043i10 = C15043i8.f56313a;
                Modifier modifier6 = modifier2;
                C15197y1 c15197y1M43130h3 = C15043i8.m43130h(c38072d3.m121949b(c28655q2, i216).getBrandWhite(), 0L, c38072d3.m121949b(c28655q2, i216).getBlack30(), c38072d3.m121949b(c28655q2, i216).getBrandWhite(), c38072d3.m121949b(c28655q2, i216).getBrandWhite(), c38072d3.m121949b(c28655q2, i216).getWhite40(), c38072d3.m121949b(c28655q2, i216).getWhite40(), 0L, c38072d3.m121949b(c28655q2, i216).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q2, 2096770);
                i18 = i15 & 112;
                if (i18 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                i19 = i15 & 14;
                if (i19 != 4) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                z19 = z18 | z17;
                objM87133R2 = c28655q2.m87133R();
                if (z19) {
                    if (objM87133R2 == c28676v1) {
                    }
                    c28676v1 = c28676v0;
                    C28676v0 c28676v6 = c28676v1;
                    AbstractC17795v0.m51127j(modifierM3599a3, textResourceM21278l3, c8688bM21277k3, null, 0L, 0, false, c15197y1M43130h3, jM125385c3, false, null, false, false, null, (Function1) objM87133R2, c28655q2, (TextResource.$stable << 3) | 6 | (TextResource.C8688b.f25889c << 6), 0, 15992);
                    c28655q = c28655q2;
                    if (viewState.getPageType() == EnumC26455a.ALL) {
                        i24 = i15;
                        z24 = true;
                        c28655q.m87150e0(-129222872);
                        c28655q.m87173q(false);
                    } else {
                        i24 = i15;
                        z24 = true;
                        c28655q.m87150e0(-129222872);
                        c28655q.m87173q(false);
                    }
                    EnumC26455a enumC26455a5 = viewState.m78352c().get(m106931m(interfaceC28593a3));
                    int i217 = i24 << 6;
                    int i218 = 6 | ((i24 >> 9) & 112) | (C26457c.f105074k << 6) | (i217 & 896) | (i217 & 57344);
                    boolean z210 = z16;
                    m106928j(C23016z.f90757a, z210, viewState, enumC26455a5, onActivitySelected, c28655q, i218);
                    c28655q.m87173q(z24);
                    z15 = z210;
                    modifier3 = modifier6;
                } else {
                    c28676v1 = c28676v0;
                }
                c28676v1 = c28676v0;
                objM87133R2 = new C32290f(onEvent, viewState, interfaceC28593a3, 8);
                c28655q2.m87172p0(objM87133R2);
                c28676v1 = c28676v0;
                C28676v0 c28676v7 = c28676v1;
                AbstractC17795v0.m51127j(modifierM3599a3, textResourceM21278l3, c8688bM21277k3, null, 0L, 0, false, c15197y1M43130h3, jM125385c3, false, null, false, false, null, (Function1) objM87133R2, c28655q2, (TextResource.$stable << 3) | 6 | (TextResource.C8688b.f25889c << 6), 0, 15992);
                c28655q = c28655q2;
                if (viewState.getPageType() == EnumC26455a.ALL) {
                    i24 = i15;
                    z24 = true;
                    c28655q.m87150e0(-129222872);
                    c28655q.m87173q(false);
                } else {
                    i24 = i15;
                    z24 = true;
                    c28655q.m87150e0(-129222872);
                    c28655q.m87173q(false);
                }
                EnumC26455a enumC26455a6 = viewState.m78352c().get(m106931m(interfaceC28593a3));
                int i219 = i24 << 6;
                int i2110 = 6 | ((i24 >> 9) & 112) | (C26457c.f105074k << 6) | (i219 & 896) | (i219 & 57344);
                boolean z211 = z16;
                m106928j(C23016z.f90757a, z211, viewState, enumC26455a6, onActivitySelected, c28655q, i2110);
                c28655q.m87173q(z24);
                z15 = z211;
                modifier3 = modifier6;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33795i(viewState, onEvent, onActivitySelected, modifier3, z15, i13, i14);
            }
        }
        i15 |= 24576;
        z13 = z4;
        if ((i15 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z14)) {
            c2314t = C2314t.f9131w;
            if (i25 != 0) {
                modifier2 = c2314t;
            }
            if (i16 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            objM87133R = c28655q2.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC31061c.m95646v(0, c28655q2);
            }
            InterfaceC28593a1 interfaceC28593a4 = (InterfaceC28593a1) objM87133R;
            List listM118959K4 = AbstractC37056f.m118959K(Integer.valueOf(AbstractC17260a.f66343r), Integer.valueOf(AbstractC17260a.f66346u), Integer.valueOf(AbstractC17260a.f66344s), Integer.valueOf(AbstractC17260a.f66345t));
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, modifier2);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3409f4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
            float f17 = 8;
            Modifier modifierM3599a4 = AbstractC1136a.m3599a(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f17, 7), "searchField");
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(viewState.getCom.mapbox.common.MapboxServices.SEARCH java.lang.String());
            TextResource.C8688b c8688bM21277k4 = AbstractC8693b.m21277k(AbstractC17260a.f66342q);
            C38072d c38072d4 = C38072d.f163053a;
            int i2111 = C38072d.f163054b;
            long jM125385c4 = c38072d4.m121949b(c28655q2, i2111).getWhite70();
            C15043i8 c15043i11 = C15043i8.f56313a;
            Modifier modifier7 = modifier2;
            C15197y1 c15197y1M43130h4 = C15043i8.m43130h(c38072d4.m121949b(c28655q2, i2111).getBrandWhite(), 0L, c38072d4.m121949b(c28655q2, i2111).getBlack30(), c38072d4.m121949b(c28655q2, i2111).getBrandWhite(), c38072d4.m121949b(c28655q2, i2111).getBrandWhite(), c38072d4.m121949b(c28655q2, i2111).getWhite40(), c38072d4.m121949b(c28655q2, i2111).getWhite40(), 0L, c38072d4.m121949b(c28655q2, i2111).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q2, 2096770);
            i18 = i15 & 112;
            if (i18 == 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            i19 = i15 & 14;
            if (i19 != 4) {
                z18 = true;
            } else {
                z18 = true;
            }
            z19 = z18 | z17;
            objM87133R2 = c28655q2.m87133R();
            if (z19) {
                if (objM87133R2 == c28676v1) {
                }
                c28676v1 = c28676v0;
                C28676v0 c28676v8 = c28676v1;
                AbstractC17795v0.m51127j(modifierM3599a4, textResourceM21278l4, c8688bM21277k4, null, 0L, 0, false, c15197y1M43130h4, jM125385c4, false, null, false, false, null, (Function1) objM87133R2, c28655q2, (TextResource.$stable << 3) | 6 | (TextResource.C8688b.f25889c << 6), 0, 15992);
                c28655q = c28655q2;
                if (viewState.getPageType() == EnumC26455a.ALL) {
                    i24 = i15;
                    z24 = true;
                    c28655q.m87150e0(-129222872);
                    c28655q.m87173q(false);
                } else {
                    i24 = i15;
                    z24 = true;
                    c28655q.m87150e0(-129222872);
                    c28655q.m87173q(false);
                }
                EnumC26455a enumC26455a7 = viewState.m78352c().get(m106931m(interfaceC28593a4));
                int i2112 = i24 << 6;
                int i2113 = 6 | ((i24 >> 9) & 112) | (C26457c.f105074k << 6) | (i2112 & 896) | (i2112 & 57344);
                boolean z212 = z16;
                m106928j(C23016z.f90757a, z212, viewState, enumC26455a7, onActivitySelected, c28655q, i2113);
                c28655q.m87173q(z24);
                z15 = z212;
                modifier3 = modifier7;
            } else {
                c28676v1 = c28676v0;
            }
            c28676v1 = c28676v0;
            objM87133R2 = new C32290f(onEvent, viewState, interfaceC28593a4, 8);
            c28655q2.m87172p0(objM87133R2);
            c28676v1 = c28676v0;
            C28676v0 c28676v9 = c28676v1;
            AbstractC17795v0.m51127j(modifierM3599a4, textResourceM21278l4, c8688bM21277k4, null, 0L, 0, false, c15197y1M43130h4, jM125385c4, false, null, false, false, null, (Function1) objM87133R2, c28655q2, (TextResource.$stable << 3) | 6 | (TextResource.C8688b.f25889c << 6), 0, 15992);
            c28655q = c28655q2;
            if (viewState.getPageType() == EnumC26455a.ALL) {
                i24 = i15;
                z24 = true;
                c28655q.m87150e0(-129222872);
                c28655q.m87173q(false);
            } else {
                i24 = i15;
                z24 = true;
                c28655q.m87150e0(-129222872);
                c28655q.m87173q(false);
            }
            EnumC26455a enumC26455a8 = viewState.m78352c().get(m106931m(interfaceC28593a4));
            int i2114 = i24 << 6;
            int i2115 = 6 | ((i24 >> 9) & 112) | (C26457c.f105074k << 6) | (i2114 & 896) | (i2114 & 57344);
            boolean z213 = z16;
            m106928j(C23016z.f90757a, z213, viewState, enumC26455a8, onActivitySelected, c28655q, i2115);
            c28655q.m87173q(z24);
            z15 = z213;
            modifier3 = modifier7;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33795i(viewState, onEvent, onActivitySelected, modifier3, z15, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final int m106931m(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final void m106932n(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m106933o(Function1 function1, C26457c c26457c, InterfaceC28593a1 interfaceC28593a1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC17801x0.a) {
            function1.invoke(new InterfaceC26456b.b("", c26457c.m78352c().get(m106931m(interfaceC28593a1))));
        } else if (event instanceof AbstractC17801x0.c) {
            function1.invoke(new InterfaceC26456b.b(((AbstractC17801x0.c) event).getNewText(), c26457c.m78352c().get(m106931m(interfaceC28593a1))));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m106934p(List list, Function1 function1, C26457c c26457c, InterfaceC28593a1 interfaceC28593a1, InterfaceC26064q LazyRow) {
        AbstractC22676k.m65750j(LazyRow, "$this$LazyRow");
        ((C26053f) LazyRow).m77529r(list.size(), null, new h(list), new C37816b(new i(list, function1, c26457c, interfaceC28593a1), true, 2039820996));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m106935q(C26457c c26457c, Function1 function1, Function1 function2, Modifier modifier, boolean z4, int i13, int i14, Composer composer, int i15) {
        m106930l(c26457c, function1, function2, modifier, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
