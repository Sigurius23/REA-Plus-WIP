package p716lb1;

import d11.C11474i;
import gb1.AbstractC15673b0;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import k91.C22302a;
import kd1.C22411w;
import kd1.EnumC22400l;
import p208i2.C17919x;
import p712j91.InterfaceC21430b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import y71.C39274g;

/* JADX INFO: renamed from: lb1.x4 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\t\u001a\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0015\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u0018\u001a\u0015\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u0018\u001a\u0015\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, m65681d2 = {"Lkd1/l;", "k", "(Lkd1/l;)Lkd1/l;", "homeCtaType", "Ly81/e;", "a", "(Lkd1/l;)Ly81/e;", "Lj91/b;", "d", "(Lkd1/l;)Lj91/b;", "b", "Li91/a;", "c", "(Lkd1/l;)Li91/a;", "", "icon", "Ly71/g;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lkd1/l;Ljava/lang/String;)Ly71/g;", "Lk91/a;", "f", "(Lkd1/l;)Lk91/a;", "Ly3/f;", "j", "(Lkd1/l;)F", "i", "e", "g", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23741x4 {

    /* JADX INFO: renamed from: lb1.x4$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f94059a;

        static {
            int[] iArr = new int[EnumC22400l.values().length];
            try {
                iArr[EnumC22400l.AI_STRENGTH_TRAINER_AUTO_LINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC22400l.ADD_ACTIVITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC22400l.LINK_STRENGTH_TRAINER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC22400l.ACCESS_HOME_TILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC22400l.HEALTHSPAN_EDUCATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC22400l.EDUCATION_COACH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC22400l.HOLIDAY_GIFT_UPGRADE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC22400l.SANGUINE_WAITLIST.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC22400l.REFER_A_FRIEND.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f94059a = iArr;
        }
    }

    /* JADX INFO: renamed from: lb1.x4$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f94060w = new b();

        /* JADX INFO: renamed from: a */
        public final long m69672a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m69672a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.x4$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f94061w = new c();

        /* JADX INFO: renamed from: a */
        public final long m69673a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrain();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m69673a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.x4$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f94062w = new d();

        /* JADX INFO: renamed from: a */
        public final long m69674a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentOnboardingAction();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m69674a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.x4$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f94063w = new e();

        /* JADX INFO: renamed from: a */
        public final long m69675a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            int i13 = C17919x.f69638o;
            return C17919x.f69637n;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m69675a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.x4$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f94064w = new f();

        /* JADX INFO: renamed from: a */
        public final long m69676a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m69676a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.x4$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f94065w = new g();

        /* JADX INFO: renamed from: a */
        public final long m69677a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getWhite10();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m69677a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.x4$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f94066w = new h();

        /* JADX INFO: renamed from: a */
        public final long m69678a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return C17919x.m51541c(0.15f, colorBackground.getRecovery());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m69678a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.x4$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i f94067w = new i();

        /* JADX INFO: renamed from: a */
        public final long m69679a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getBlack50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m69679a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC39332e m69661a(EnumC22400l homeCtaType) {
        AbstractC22676k.m65750j(homeCtaType, "homeCtaType");
        int i13 = a.f94059a[homeCtaType.ordinal()];
        if (i13 == 2) {
            return p745y81.Function1.m125323a(b.f94060w);
        }
        if (i13 == 3) {
            return p745y81.Function1.m125323a(c.f94061w);
        }
        if (i13 != 4) {
            return (i13 == 5 || i13 == 6) ? p745y81.Function1.m125323a(e.f94063w) : p745y81.Function1.m125323a(f.f94064w);
        }
        return p745y81.Function1.m125323a(d.f94062w);
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC21430b m69662b(EnumC22400l homeCtaType) {
        AbstractC22676k.m65750j(homeCtaType, "homeCtaType");
        int i13 = a.f94059a[homeCtaType.ordinal()];
        if (i13 == 4) {
            return p712j91.Function1.m60318a(AbstractC15673b0.m44075z());
        }
        if (i13 == 6) {
            return p712j91.Function1.m60318a(AbstractC15673b0.m44002P());
        }
        if (i13 != 7) {
            return null;
        }
        return p712j91.Function1.m60318a(AbstractC15673b0.m43991J0());
    }

    /* JADX INFO: renamed from: c */
    public static final AbstractC18247a m69663c(EnumC22400l homeCtaType) {
        AbstractC22676k.m65750j(homeCtaType, "homeCtaType");
        int i13 = a.f94059a[homeCtaType.ordinal()];
        if (i13 != 5) {
            return i13 != 8 ? AbstractC18249c.m52574l(i.f94067w) : AbstractC18249c.m52574l(h.f94066w);
        }
        return AbstractC18249c.m52574l(g.f94065w);
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC21430b m69664d(EnumC22400l homeCtaType) {
        AbstractC22676k.m65750j(homeCtaType, "homeCtaType");
        int i13 = a.f94059a[homeCtaType.ordinal()];
        if (i13 == 5 || i13 == 6) {
            return p712j91.Function1.m60318a(AbstractC15673b0.m43972A());
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final float m69665e(EnumC22400l homeCtaType) {
        AbstractC22676k.m65750j(homeCtaType, "homeCtaType");
        return (a.f94059a[homeCtaType.ordinal()] == 7 ? 2 : (float) 1.5d) * 8;
    }

    /* JADX INFO: renamed from: f */
    public static final C22302a m69666f(EnumC22400l homeCtaType) {
        AbstractC22676k.m65750j(homeCtaType, "homeCtaType");
        return a.f94059a[homeCtaType.ordinal()] == 7 ? C22411w.f87680a.m64536b() : C22411w.f87680a.m64535a();
    }

    /* JADX INFO: renamed from: g */
    public static final float m69667g(EnumC22400l homeCtaType) {
        AbstractC22676k.m65750j(homeCtaType, "homeCtaType");
        if (a.f94059a[homeCtaType.ordinal()] == 7) {
            return Float.NaN;
        }
        return C11474i.INSTANCE.m30839a();
    }

    /* JADX INFO: renamed from: h */
    public static final C39274g m69668h(EnumC22400l homeCtaType, String icon) {
        AbstractC22676k.m65750j(homeCtaType, "homeCtaType");
        AbstractC22676k.m65750j(icon, "icon");
        int i13 = a.f94059a[homeCtaType.ordinal()];
        if (i13 == 4 || i13 == 5 || i13 == 6 || i13 == 9) {
            return null;
        }
        return new C39274g(AbstractC16315n0.m46380e(icon, EnumC16313m0.SURVEY), null, 2, null);
    }

    /* JADX INFO: renamed from: i */
    public static final float m69669i(EnumC22400l homeCtaType) {
        AbstractC22676k.m65750j(homeCtaType, "homeCtaType");
        return (a.f94059a[homeCtaType.ordinal()] == 7 ? 2 : (float) 1.5d) * 8;
    }

    /* JADX INFO: renamed from: j */
    public static final float m69670j(EnumC22400l homeCtaType) {
        AbstractC22676k.m65750j(homeCtaType, "homeCtaType");
        return (a.f94059a[homeCtaType.ordinal()] == 7 ? 16 : 18) * 4;
    }

    /* JADX INFO: renamed from: k */
    public static final EnumC22400l m69671k(EnumC22400l enumC22400l) {
        AbstractC22676k.m65750j(enumC22400l, "<this>");
        return a.f94059a[enumC22400l.ordinal()] == 1 ? EnumC22400l.EDUCATION_COACH : enumC22400l;
    }
}
