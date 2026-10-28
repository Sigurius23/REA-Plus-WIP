package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.TrendBarModel;
import com.whoop.design.models.items.TrendBarType;
import i41.C18083c;
import i41.C18084d;
import i41.EnumC18082b;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;

/* JADX INFO: renamed from: lb1.e5 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\"\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/design/models/items/TrendBarModel;", "trendBarModel", "Li41/d;", "e", "(Lcom/whoop/design/models/items/TrendBarModel;)Li41/d;", "Li41/b;", "trendBarPosition", "Li91/a;", "c", "(Li41/b;)Li91/a;", "Llb1/y0;", "a", "Llb1/y0;", "d", "()Llb1/y0;", "trendBarMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23621e5 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93742a = Function1.m68251a(new C23753z4(8));

    /* JADX INFO: renamed from: lb1.e5$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93743a;

        static {
            int[] iArr = new int[EnumC18082b.values().length];
            try {
                iArr[EnumC18082b.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC18082b.ELEVATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC18082b.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f93743a = iArr;
        }
    }

    /* JADX INFO: renamed from: lb1.e5$b */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f93744w = new b();

        /* JADX INFO: renamed from: a */
        public final long m68725a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68725a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.e5$c */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f93745w = new c();

        /* JADX INFO: renamed from: a */
        public final long m68726a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68726a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.e5$d */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f93746w = new d();

        /* JADX INFO: renamed from: a */
        public final long m68727a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getStrainZone5();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68727a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.e5$e */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f93747w = new e();

        /* JADX INFO: renamed from: a */
        public final long m68728a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getBlack20();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68728a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.e5$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93748w;

        public f(Function1 function1) {
            this.f93748w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93748w.invoke((TrendBarModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final AbstractC18247a m68720c(EnumC18082b trendBarPosition) {
        AbstractC22676k.m65750j(trendBarPosition, "trendBarPosition");
        int i13 = a.f93743a[trendBarPosition.ordinal()];
        if (i13 == 1) {
            return AbstractC18249c.m52574l(b.f93744w);
        }
        if (i13 == 2) {
            return AbstractC18249c.m52574l(c.f93745w);
        }
        if (i13 == 3) {
            return AbstractC18249c.m52574l(d.f93746w);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: d */
    public static final C23743y0 m68721d() {
        return f93742a;
    }

    /* JADX INFO: renamed from: e */
    public static final C18084d m68722e(TrendBarModel trendBarModel) {
        AbstractC22676k.m65750j(trendBarModel, "trendBarModel");
        List<TrendBarType> segments = trendBarModel.getSegments();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(segments, 10));
        for (TrendBarType trendBarType : segments) {
            EnumC18082b enumC18082bValueOf = EnumC18082b.valueOf(trendBarType.getTrend());
            TrendBarType currentPosition = trendBarModel.getCurrentPosition();
            boolean zM65745e = AbstractC22676k.m65745e(currentPosition != null ? currentPosition.getTrend() : null, trendBarType.getTrend());
            arrayList.add(new C18083c(enumC18082bValueOf, Boolean.valueOf(zM65745e), zM65745e ? m68720c(enumC18082bValueOf) : AbstractC18249c.m52574l(e.f93747w)));
        }
        return new C18084d(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m68723f(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(TrendBarModel.class), new f(new C23753z4(9)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C18084d m68724g(TrendBarModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68722e(model);
    }
}
