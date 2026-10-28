package lm2;

import com.whoop.service.network.model.Sport;
import com.whoop.service.network.model.SportList;
import e50.C12723b;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC11266d;
import p048ce.AbstractC4482w;
import qr2.AbstractC30556a;
import tr2.C34117o;
import tr2.InterfaceC34116n;
import u92.C34660d;

/* JADX INFO: renamed from: lm2.a */
/* JADX INFO: loaded from: classes4.dex */
public class C24515a {

    /* JADX INFO: renamed from: a */
    private C34660d f95668a;

    /* JADX INFO: renamed from: b */
    private InterfaceC34116n f95669b;

    public C24515a() {
        this(C12723b.m35566a().m35570e(), new C34117o(C12723b.m35566a().m35569d(), "AddActivityHistory"));
    }

    /* JADX INFO: renamed from: a */
    private List<String> m71408a() {
        return this.f95668a.m109535l("ActivityHistory");
    }

    /* JADX INFO: renamed from: b */
    private String m71409b(String str, String str2) {
        return AbstractC18489d0.m53370k(str, ":", str2);
    }

    /* JADX INFO: renamed from: d */
    private void m71410d(String str) {
        this.f95669b.mo85226q(AbstractC11266d.m30461o("Dropping history item, unrecognized format: ", str), new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: c */
    public List<InterfaceC24516b> m71411c(SportList sportList) {
        List<String> listM71408a = m71408a();
        if (AbstractC4482w.m13986W(listM71408a)) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(listM71408a.size());
        for (String str : listM71408a) {
            String[] strArrSplit = str.split(":");
            if (strArrSplit.length != 2) {
                m71410d(str);
            } else {
                String str2 = strArrSplit[0];
                str2.getClass();
                if (str2.equals("Sleep")) {
                    arrayList.add(new C24517c(Boolean.parseBoolean(strArrSplit[1])));
                } else if (str2.equals("Sport")) {
                    Sport sportForId = sportList.getSportForId(Integer.parseInt(strArrSplit[1]));
                    if (sportForId == null) {
                        this.f95669b.mo85226q("Dropping history item, couldn't find sport: ".concat(str), new AbstractC30556a.a[0]);
                    } else {
                        arrayList.add(new C24518d(sportForId));
                    }
                } else {
                    m71410d(str);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public void m71412e(InterfaceC24516b interfaceC24516b) {
        if (!(interfaceC24516b instanceof C24518d)) {
            if (interfaceC24516b instanceof C24517c) {
                return;
            }
            this.f95669b.mo85226q("Dropping activity, unrecognzied type: " + interfaceC24516b, new AbstractC30556a.a[0]);
            return;
        }
        String strM71409b = m71409b("Sport", Integer.toString(((C24518d) interfaceC24516b).m71421k().getId()));
        List<String> listM71408a = m71408a();
        listM71408a.remove(strM71409b);
        listM71408a.add(0, strM71409b);
        if (listM71408a.size() > 4) {
            ArrayList arrayList = new ArrayList(4);
            for (int i13 = 0; i13 < 4; i13++) {
                arrayList.add(listM71408a.get(i13));
            }
            listM71408a = arrayList;
        }
        this.f95668a.m109544w("ActivityHistory", listM71408a);
    }

    public C24515a(C34660d c34660d, InterfaceC34116n interfaceC34116n) {
        this.f95668a = c34660d;
        this.f95669b = interfaceC34116n;
    }
}
