package z82;

import com.whoop.data.repositories.AnalyticsUserRepository;
import fi0.InterfaceC14515a;
import java.util.Iterator;
import java.util.Map;
import q92.C30076h;

/* JADX INFO: renamed from: z82.c */
/* JADX INFO: loaded from: classes4.dex */
public class C40189c implements InterfaceC40188b {

    /* JADX INFO: renamed from: a */
    private final Iterable<InterfaceC14515a> f173480a;

    /* JADX INFO: renamed from: b */
    private final C40191e f173481b;

    public C40189c(Iterable<InterfaceC14515a> iterable, AnalyticsUserRepository analyticsUserRepository, C30076h c30076h) {
        this.f173480a = iterable;
        this.f173481b = new C40191e(this, analyticsUserRepository, c30076h);
    }

    @Override // fi0.InterfaceC14515a
    /* JADX INFO: renamed from: a */
    public void mo41419a() {
        Iterator<InterfaceC14515a> it = this.f173480a.iterator();
        while (it.hasNext()) {
            it.next().mo41419a();
        }
    }

    @Override // fi0.InterfaceC14515a
    /* JADX INFO: renamed from: b */
    public void mo41420b() {
        Iterator<InterfaceC14515a> it = this.f173480a.iterator();
        while (it.hasNext()) {
            it.next().mo41420b();
        }
    }

    @Override // fi0.InterfaceC14515a
    /* JADX INFO: renamed from: c */
    public void mo41421c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map<String, ?> map) {
        Iterator<InterfaceC14515a> it = this.f173480a.iterator();
        while (it.hasNext()) {
            it.next().mo41421c(str, str2, str3, str4, str5, str6, str7, str8, map);
        }
    }

    @Override // fi0.InterfaceC14515a
    /* JADX INFO: renamed from: d */
    public void mo41422d(String str, String str2, String str3, String str4, String str5, Map<String, ?> map) {
        Iterator<InterfaceC14515a> it = this.f173480a.iterator();
        while (it.hasNext()) {
            it.next().mo41422d(str, str2, str3, str4, str5, map);
        }
    }

    @Override // fi0.InterfaceC14515a
    /* JADX INFO: renamed from: e */
    public void mo41423e(String str, Map<String, ?> map) {
        Iterator<InterfaceC14515a> it = this.f173480a.iterator();
        while (it.hasNext()) {
            it.next().mo41423e(str, map);
        }
    }

    @Override // fi0.InterfaceC14515a
    /* JADX INFO: renamed from: f */
    public void mo41424f(String str, String str2, String str3, String str4) {
        Iterator<InterfaceC14515a> it = this.f173480a.iterator();
        while (it.hasNext()) {
            it.next().mo41424f(str, str2, str3, str4);
        }
    }

    @Override // fi0.InterfaceC14515a
    /* JADX INFO: renamed from: g */
    public void mo41425g(String str) {
        Iterator<InterfaceC14515a> it = this.f173480a.iterator();
        while (it.hasNext()) {
            it.next().mo41425g(str);
        }
    }

    @Override // fi0.InterfaceC14515a
    /* JADX INFO: renamed from: h */
    public void mo41426h(String str, String str2, String str3, String str4, String str5) {
        Iterator<InterfaceC14515a> it = this.f173480a.iterator();
        while (it.hasNext()) {
            it.next().mo41426h(str, str2, str3, str4, str5);
        }
    }

    @Override // fi0.InterfaceC14515a
    /* JADX INFO: renamed from: j */
    public void mo41427j(boolean z4) {
        Iterator<InterfaceC14515a> it = this.f173480a.iterator();
        while (it.hasNext()) {
            it.next().mo41427j(z4);
        }
    }

    @Override // fi0.InterfaceC14515a
    /* JADX INFO: renamed from: k */
    public void mo41428k(String str, String str2, String str3, String str4, Map<String, ?> map) {
        Iterator<InterfaceC14515a> it = this.f173480a.iterator();
        while (it.hasNext()) {
            it.next().mo41428k(str, str2, str3, str4, map);
        }
    }

    @Override // z82.InterfaceC40188b
    /* JADX INFO: renamed from: l */
    public C40191e mo128972l() {
        return this.f173481b;
    }
}
