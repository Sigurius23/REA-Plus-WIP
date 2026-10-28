package gq2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.user.journey.model.yearinreview.RecapStatistic;
import com.whoop.user.journey.model.yearinreview.StatStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr2.AbstractC21902a;
import jr2.C21905d;
import m83.AbstractC25267u;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import uq2.C35164a;
import uq2.C35165b;
import uq2.C35166c;
import yp2.AbstractC39706c;

/* JADX INFO: renamed from: gq2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lgq2/b;", "", "<init>", "()V", "Lcom/whoop/user/journey/model/yearinreview/StatStyle;", "style", "Luq2/a;", "a", "(Lcom/whoop/user/journey/model/yearinreview/StatStyle;)Luq2/a;", "Ly81/e;", "c", "(Lcom/whoop/user/journey/model/yearinreview/StatStyle;)Ly81/e;", "", "Lcom/whoop/user/journey/model/yearinreview/RecapStatistic;", "statistics", "Luq2/b;", "b", "(Ljava/util/List;)Ljava/util/List;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C16083b {

    /* JADX INFO: renamed from: gq2.b$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f60862a;

        static {
            int[] iArr = new int[StatStyle.values().length];
            try {
                iArr[StatStyle.ALL_OUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatStyle.STRENUOUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatStyle.MODERATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StatStyle.LIGHT_STRAIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StatStyle.SUFFICIENT_SLEEP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StatStyle.AVERAGE_SLEEP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StatStyle.INSUFFICIENT_SLEEP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[StatStyle.GREEN_RECOVERY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[StatStyle.YELLOW_RECOVERY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[StatStyle.RED_RECOVERY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[StatStyle.NO_DATA.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f60862a = iArr;
        }
    }

    /* JADX INFO: renamed from: gq2.b$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f60863w = new b();

        /* JADX INFO: renamed from: a */
        public final long m45441a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryHighRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m45441a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gq2.b$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f60864w = new c();

        /* JADX INFO: renamed from: a */
        public final long m45442a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryMediumRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m45442a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gq2.b$d */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f60865w = new d();

        /* JADX INFO: renamed from: a */
        public final long m45443a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryLowRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m45443a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gq2.b$e */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f60866w = new e();

        /* JADX INFO: renamed from: a */
        public final long m45444a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m45444a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gq2.b$f */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f60867w = new f();

        /* JADX INFO: renamed from: a */
        public final long m45445a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(0.7f, whoopColor.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m45445a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gq2.b$g */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f60868w = new g();

        /* JADX INFO: renamed from: a */
        public final long m45446a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(0.4f, whoopColor.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m45446a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gq2.b$h */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f60869w = new h();

        /* JADX INFO: renamed from: a */
        public final long m45447a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandBlack();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m45447a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: a */
    private final C35164a m45438a(StatStyle style) {
        switch (a.f60862a[style.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return new C35164a(AbstractC8693b.m21277k(AbstractC39706c.f170933z), new C21905d(null, AbstractC21902a.m62309d(), 1, null), AbstractC8693b.m21277k(AbstractC39706c.f170932y));
            case 5:
            case 6:
            case 7:
                return new C35164a(AbstractC8693b.m21277k(AbstractC39706c.f170931x), new C21905d(null, AbstractC21902a.m62308c(), 1, null), AbstractC8693b.m21277k(AbstractC39706c.f170930w));
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private final InterfaceC39332e m45439c(StatStyle style) {
        switch (a.f60862a[style.ordinal()]) {
            case 1:
                return p745y81.Function1.m125324b(AbstractC17918w0.m51517e(4284931839L));
            case 2:
                return p745y81.Function1.m125324b(AbstractC17918w0.m51517e(4278227943L));
            case 3:
                return p745y81.Function1.m125324b(AbstractC17918w0.m51517e(4278741938L));
            case 4:
                return p745y81.Function1.m125324b(AbstractC17918w0.m51517e(4279126662L));
            case 5:
                return p745y81.Function1.m125323a(e.f60866w);
            case 6:
                return p745y81.Function1.m125323a(f.f60867w);
            case 7:
                return p745y81.Function1.m125323a(g.f60868w);
            case 8:
                return p745y81.Function1.m125323a(b.f60863w);
            case 9:
                return p745y81.Function1.m125323a(c.f60864w);
            case 10:
                return p745y81.Function1.m125323a(d.f60865w);
            case 11:
                return p745y81.Function1.m125323a(h.f60869w);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: b */
    public final List<C35165b> m45440b(List<RecapStatistic> statistics) {
        AbstractC22676k.m65750j(statistics, "statistics");
        List<RecapStatistic> list = statistics;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (RecapStatistic recapStatistic : list) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l(recapStatistic.getTitle());
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(recapStatistic.getSubtitle());
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(recapStatistic.getAverageStat());
            InterfaceC39332e interfaceC39332eM45439c = m45439c(recapStatistic.getAverageStatStyle());
            List<StatStyle> statStyles = recapStatistic.getStatStyles();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(statStyles, 10));
            Iterator<T> it = statStyles.iterator();
            while (it.hasNext()) {
                arrayList2.add(new C35166c(m45439c((StatStyle) it.next())));
            }
            arrayList.add(new C35165b(textResourceM21278l, textResourceM21278l2, textResourceM21278l3, interfaceC39332eM45439c, arrayList2, m45438a(recapStatistic.getAverageStatStyle())));
        }
        return arrayList;
    }
}
