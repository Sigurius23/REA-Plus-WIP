package jy1;

import androidx.room.AbstractC1794i;
import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import bp0.C3526n;
import com.whoop.data.local.room.dao.wipeable.C6516c;
import com.whoop.metrics.domain.models.MetricPostType;
import ge3.AbstractC15751g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ky1.C22891a;
import l83.C23454a0;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: jy1.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C22049c implements InterfaceC22048b {

    /* JADX INFO: renamed from: a */
    private final AbstractC1848z0 f85531a;

    /* JADX INFO: renamed from: c */
    private final C22891a f85533c = new C22891a();

    /* JADX INFO: renamed from: b */
    private final AbstractC1802k f85532b = new a();

    /* JADX INFO: renamed from: d */
    private final AbstractC1794i f85534d = new b();

    /* JADX INFO: renamed from: jy1.c$a */
    public class a extends AbstractC1802k {
        public a() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C22047a c22047a) {
            interfaceC33689c.mo5356p(1, c22047a.getId());
            if (c22047a.getName() == null) {
                interfaceC33689c.mo5359u(2);
            } else {
                interfaceC33689c.mo5354L(2, c22047a.getName());
            }
            if (c22047a.getValue() == null) {
                interfaceC33689c.mo5359u(3);
            } else {
                interfaceC33689c.mo5358t(c22047a.getValue().doubleValue(), 3);
            }
            String strM66532a = C22049c.this.f85533c.m66532a(c22047a.m63105f());
            if (strM66532a == null) {
                interfaceC33689c.mo5359u(4);
            } else {
                interfaceC33689c.mo5354L(4, strM66532a);
            }
            if (c22047a.getMetricType() == null) {
                interfaceC33689c.mo5359u(5);
            } else {
                interfaceC33689c.mo5354L(5, C22049c.this.m63115i(c22047a.getMetricType()));
            }
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR IGNORE INTO `metrics_table` (`id`,`name`,`value`,`tags`,`metric_type`) VALUES (nullif(?, 0),?,?,?,?)";
        }
    }

    /* JADX INFO: renamed from: jy1.c$b */
    public class b extends AbstractC1794i {
        public b() {
        }

        @Override // androidx.room.AbstractC1794i
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C22047a c22047a) {
            interfaceC33689c.mo5356p(1, c22047a.getId());
        }

        @Override // androidx.room.AbstractC1794i
        public String createQuery() {
            return "DELETE FROM `metrics_table` WHERE `id` = ?";
        }
    }

    /* JADX INFO: renamed from: jy1.c$c */
    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f85537a;

        static {
            int[] iArr = new int[MetricPostType.values().length];
            f85537a = iArr;
            try {
                iArr[MetricPostType.COUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f85537a[MetricPostType.DISTRIBUTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f85537a[MetricPostType.GAUGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f85537a[MetricPostType.HISTOGRAM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C22049c(AbstractC1848z0 abstractC1848z0) {
        this.f85531a = abstractC1848z0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public String m63115i(MetricPostType metricPostType) {
        int i13 = c.f85537a[metricPostType.ordinal()];
        if (i13 == 1) {
            return "COUNT";
        }
        if (i13 == 2) {
            return "DISTRIBUTION";
        }
        if (i13 == 3) {
            return "GAUGE";
        }
        if (i13 == 4) {
            return "HISTOGRAM";
        }
        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + metricPostType);
    }

    /* JADX INFO: renamed from: j */
    private MetricPostType m63116j(String str) {
        str.getClass();
        switch (str) {
            case "COUNT":
                return MetricPostType.COUNT;
            case "GAUGE":
                return MetricPostType.GAUGE;
            case "HISTOGRAM":
                return MetricPostType.HISTOGRAM;
            case "DISTRIBUTION":
                return MetricPostType.DISTRIBUTION;
            default:
                throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: k */
    public static List<Class<?>> m63117k() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ C23454a0 m63118l(List list, InterfaceC33687a interfaceC33687a) {
        this.f85534d.handleMultiple(interfaceC33687a, list);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ List m63119m(int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM metrics_table LIMIT ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "name");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "value");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "tags");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "metric_type");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                arrayList.add(new C22047a((int) interfaceC33689cMo68212g1.getLong(iM60658N), interfaceC33689cMo68212g1.isNull(iM60658N2) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N2), interfaceC33689cMo68212g1.isNull(iM60658N3) ? null : Double.valueOf(interfaceC33689cMo68212g1.getDouble(iM60658N3)), this.f85533c.m66533b(interfaceC33689cMo68212g1.isNull(iM60658N4) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N4)), interfaceC33689cMo68212g1.isNull(iM60658N5) ? null : m63116j(interfaceC33689cMo68212g1.mo5353J0(iM60658N5))));
            }
            return arrayList;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ C23454a0 m63120n(C22047a c22047a, InterfaceC33687a interfaceC33687a) {
        this.f85532b.insert(interfaceC33687a, c22047a);
        return C23454a0.f92919a;
    }

    @Override // jy1.InterfaceC22048b
    /* JADX INFO: renamed from: a */
    public Object mo63107a(C22047a c22047a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        c22047a.getClass();
        return AbstractC15751g.m44434N(this.f85531a, false, true, new C3526n(16, this, c22047a), interfaceC30057d);
    }

    @Override // jy1.InterfaceC22048b
    /* JADX INFO: renamed from: b */
    public Object mo63108b(List<C22047a> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        list.getClass();
        return AbstractC15751g.m44434N(this.f85531a, false, true, new C3526n(17, this, list), interfaceC30057d);
    }

    @Override // jy1.InterfaceC22048b
    /* JADX INFO: renamed from: c */
    public Object mo63109c(int i13, InterfaceC30057d<? super List<C22047a>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f85531a, true, false, new C6516c(this, i13, 12), interfaceC30057d);
    }
}
