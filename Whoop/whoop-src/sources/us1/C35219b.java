package us1;

import androidx.room.AbstractC1794i;
import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import com.whoop.labrador.data.dto.FilteredLabradorDataConverter;
import ge3.AbstractC15751g;
import io2.C20758f;
import java.util.Collections;
import java.util.List;
import l83.C23454a0;
import p132f0.C13819r;
import p163g1.C14984d4;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p736sz0.C33209p1;
import q83.InterfaceC30057d;
import uk2.C35051a;
import um0.C35076b;
import uo1.C35141b;
import vs1.C36472a;
import vs1.C36474c;

/* JADX INFO: renamed from: us1.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C35219b implements InterfaceC35218a {

    /* JADX INFO: renamed from: a */
    private final AbstractC1848z0 f149768a;

    /* JADX INFO: renamed from: c */
    private final FilteredLabradorDataConverter f149770c = new FilteredLabradorDataConverter();

    /* JADX INFO: renamed from: d */
    private final C36474c f149771d = new C36474c();

    /* JADX INFO: renamed from: b */
    private final AbstractC1802k f149769b = new a();

    /* JADX INFO: renamed from: e */
    private final AbstractC1794i f149772e = new b();

    /* JADX INFO: renamed from: us1.b$a */
    public class a extends AbstractC1802k {
        public a() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C36472a c36472a) {
            interfaceC33689c.mo5358t(c36472a.getAverageHr(), 1);
            interfaceC33689c.mo5356p(2, c36472a.getClassification());
            String strM22423a = C35219b.this.f149770c.m22423a(c36472a.m116832e());
            if (strM22423a == null) {
                interfaceC33689c.mo5359u(3);
            } else {
                interfaceC33689c.mo5354L(3, strM22423a);
            }
            interfaceC33689c.mo5356p(4, c36472a.getTimeStamp());
            String strM116837a = C35219b.this.f149771d.m116837a(c36472a.m116833f());
            if (strM116837a == null) {
                interfaceC33689c.mo5359u(5);
            } else {
                interfaceC33689c.mo5354L(5, strM116837a);
            }
            if (c36472a.getNotes() == null) {
                interfaceC33689c.mo5359u(6);
            } else {
                interfaceC33689c.mo5354L(6, c36472a.getNotes());
            }
            interfaceC33689c.mo5356p(7, c36472a.getUploaded() ? 1L : 0L);
            interfaceC33689c.mo5356p(8, c36472a.getDeleted() ? 1L : 0L);
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `table_labrador_reading_result_data` (`average_hr`,`classification`,`samples`,`time_stamp`,`symptoms_list`,`notes`,`uploaded`,`deleted`) VALUES (?,?,?,?,?,?,?,?)";
        }
    }

    /* JADX INFO: renamed from: us1.b$b */
    public class b extends AbstractC1794i {
        public b() {
        }

        @Override // androidx.room.AbstractC1794i
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C36472a c36472a) {
            interfaceC33689c.mo5358t(c36472a.getAverageHr(), 1);
            interfaceC33689c.mo5356p(2, c36472a.getClassification());
            String strM22423a = C35219b.this.f149770c.m22423a(c36472a.m116832e());
            if (strM22423a == null) {
                interfaceC33689c.mo5359u(3);
            } else {
                interfaceC33689c.mo5354L(3, strM22423a);
            }
            interfaceC33689c.mo5356p(4, c36472a.getTimeStamp());
            String strM116837a = C35219b.this.f149771d.m116837a(c36472a.m116833f());
            if (strM116837a == null) {
                interfaceC33689c.mo5359u(5);
            } else {
                interfaceC33689c.mo5354L(5, strM116837a);
            }
            if (c36472a.getNotes() == null) {
                interfaceC33689c.mo5359u(6);
            } else {
                interfaceC33689c.mo5354L(6, c36472a.getNotes());
            }
            interfaceC33689c.mo5356p(7, c36472a.getUploaded() ? 1L : 0L);
            interfaceC33689c.mo5356p(8, c36472a.getDeleted() ? 1L : 0L);
            interfaceC33689c.mo5356p(9, c36472a.getTimeStamp());
        }

        @Override // androidx.room.AbstractC1794i
        public String createQuery() {
            return "UPDATE OR ABORT `table_labrador_reading_result_data` SET `average_hr` = ?,`classification` = ?,`samples` = ?,`time_stamp` = ?,`symptoms_list` = ?,`notes` = ?,`uploaded` = ?,`deleted` = ? WHERE `time_stamp` = ?";
        }
    }

    public C35219b(AbstractC1848z0 abstractC1848z0) {
        this.f149768a = abstractC1848z0;
    }

    /* JADX INFO: renamed from: p */
    public static List<Class<?>> m111577p() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ C23454a0 m111578q(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM table_labrador_reading_result_data");
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static /* synthetic */ C23454a0 m111579r(long j7, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM table_labrador_reading_result_data WHERE time_stamp = ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, j7);
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ C36472a m111580s(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM table_labrador_reading_result_data ORDER BY time_stamp DESC LIMIT 1");
        try {
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "average_hr");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "classification");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "samples");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "time_stamp");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "symptoms_list");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "notes");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "uploaded");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deleted");
            C36472a c36472a = null;
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                c36472a = new C36472a((float) interfaceC33689cMo68212g1.getDouble(iM60658N), (int) interfaceC33689cMo68212g1.getLong(iM60658N2), this.f149770c.m22424b(interfaceC33689cMo68212g1.isNull(iM60658N3) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N3)), interfaceC33689cMo68212g1.getLong(iM60658N4), this.f149771d.m116838b(interfaceC33689cMo68212g1.isNull(iM60658N5) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N5)), interfaceC33689cMo68212g1.isNull(iM60658N6) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N6), ((int) interfaceC33689cMo68212g1.getLong(iM60658N7)) != 0, ((int) interfaceC33689cMo68212g1.getLong(iM60658N8)) != 0);
            }
            return c36472a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public /* synthetic */ C36472a m111581t(long j7, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM table_labrador_reading_result_data WHERE time_stamp = ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, j7);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "average_hr");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "classification");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "samples");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "time_stamp");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "symptoms_list");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "notes");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "uploaded");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deleted");
            C36472a c36472a = null;
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                c36472a = new C36472a((float) interfaceC33689cMo68212g1.getDouble(iM60658N), (int) interfaceC33689cMo68212g1.getLong(iM60658N2), this.f149770c.m22424b(interfaceC33689cMo68212g1.isNull(iM60658N3) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N3)), interfaceC33689cMo68212g1.getLong(iM60658N4), this.f149771d.m116838b(interfaceC33689cMo68212g1.isNull(iM60658N5) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N5)), interfaceC33689cMo68212g1.isNull(iM60658N6) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N6), ((int) interfaceC33689cMo68212g1.getLong(iM60658N7)) != 0, ((int) interfaceC33689cMo68212g1.getLong(iM60658N8)) != 0);
            }
            return c36472a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ C23454a0 m111582u(C36472a c36472a, InterfaceC33687a interfaceC33687a) {
        this.f149769b.insert(interfaceC33687a, c36472a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ C23454a0 m111583v(List list, String str, long j7, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("UPDATE table_labrador_reading_result_data SET symptoms_list = ?, notes = ? WHERE time_stamp = ?");
        try {
            String strM116837a = this.f149771d.m116837a(list);
            if (strM116837a == null) {
                interfaceC33689cMo68212g1.mo5359u(1);
            } else {
                interfaceC33689cMo68212g1.mo5354L(1, strM116837a);
            }
            if (str == null) {
                interfaceC33689cMo68212g1.mo5359u(2);
            } else {
                interfaceC33689cMo68212g1.mo5354L(2, str);
            }
            interfaceC33689cMo68212g1.mo5356p(3, j7);
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static /* synthetic */ C23454a0 m111584w(boolean z4, long j7, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("UPDATE table_labrador_reading_result_data SET uploaded = ? WHERE time_stamp = ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, z4 ? 1L : 0L);
            interfaceC33689cMo68212g1.mo5356p(2, j7);
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    @Override // us1.InterfaceC35218a
    /* JADX INFO: renamed from: a */
    public Object mo111562a(long j7, List<String> list, String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f149768a, false, true, new C13819r(this, list, str, j7), interfaceC30057d);
    }

    @Override // us1.InterfaceC35218a
    /* JADX INFO: renamed from: b */
    public Object mo111563b(long j7, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f149768a, false, true, new C33209p1(j7, 3), interfaceC30057d);
    }

    @Override // us1.InterfaceC35218a
    /* JADX INFO: renamed from: c */
    public Object mo111564c(long j7, InterfaceC30057d<? super C36472a> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f149768a, true, false, new C14984d4(this, j7, 5), interfaceC30057d);
    }

    @Override // us1.InterfaceC35218a
    /* JADX INFO: renamed from: d */
    public Object mo111565d(InterfaceC30057d<? super C36472a> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f149768a, true, false, new C35141b(this, 1), interfaceC30057d);
    }

    @Override // us1.InterfaceC35218a
    public Object deleteAll(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f149768a, false, true, new C35051a(13), interfaceC30057d);
    }

    @Override // us1.InterfaceC35218a
    /* JADX INFO: renamed from: e */
    public Object mo111566e(C36472a c36472a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        c36472a.getClass();
        return AbstractC15751g.m44434N(this.f149768a, false, true, new C35076b(2, this, c36472a), interfaceC30057d);
    }

    @Override // us1.InterfaceC35218a
    /* JADX INFO: renamed from: f */
    public Object mo111567f(long j7, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f149768a, false, true, new C20758f(1, j7, z4), interfaceC30057d);
    }
}
