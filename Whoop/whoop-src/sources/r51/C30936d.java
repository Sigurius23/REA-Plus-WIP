package r51;

import android.webkit.WebView;
import androidx.work.impl.WorkDatabase;
import com.whoop.cache.persistence.C6101a;
import ge3.AbstractC15751g;
import i93.C18284j;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import p031b9.AbstractC2875y;
import p209i3.InterfaceC18044z;
import p380os.C28301a;
import p420qc.C30207q;
import p420qc.C30211u;
import p500tb.InterfaceC33687a;
import p645yc.C39426e;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q11.C29793c;
import rf2.C31361c;
import sy0.AbstractC33087j;
import sy0.AbstractC33092o;
import v41.AbstractC35661d0;
import xo1.AbstractC38493b;
import y31.AbstractC39195d;
import yb3.AbstractC39414r;
import zi1.AbstractC40685o;
import zo2.AbstractC40935f;

/* JADX INFO: renamed from: r51.d */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C30936d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f127640w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f127641x;

    public /* synthetic */ C30936d(String str, int i13) {
        this.f127640w = i13;
        this.f127641x = str;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f127640w) {
            case 0:
                return Boolean.valueOf(AbstractC30937e.m95166t(this.f127641x, (C23465k) obj));
            case 1:
                WorkDatabase db4 = (WorkDatabase) obj;
                AbstractC22676k.m65750j(db4, "db");
                C28301a c28301a = C30207q.f123632A;
                C30211u c30211uMo5521h = db4.mo5521h();
                c30211uMo5521h.getClass();
                String name = this.f127641x;
                AbstractC22676k.m65750j(name, "name");
                Object objApply = c28301a.apply((List) AbstractC15751g.m44432L(c30211uMo5521h.f123665a, true, true, new C29793c(6, name, c30211uMo5521h)));
                AbstractC22676k.m65749i(objApply, "apply(...)");
                return (List) objApply;
            case 2:
                return C31361c.m96450r(this.f127641x, (InterfaceC33687a) obj);
            case 3:
                return AbstractC33087j.m104825g(this.f127641x, (InterfaceC18044z) obj);
            case 4:
                return AbstractC33092o.m104845f(this.f127641x, (InterfaceC18044z) obj);
            case 5:
                return C6101a.m18308F("DELETE FROM cache_scopes WHERE uri = ?", this.f127641x, (InterfaceC33687a) obj);
            case 6:
                return C6101a.m18307E("DELETE FROM cache_entries WHERE uri = ?", this.f127641x, (InterfaceC33687a) obj);
            case 7:
                return Boolean.valueOf(C6101a.m18304B("SELECT EXISTS(SELECT 1 FROM cache_entries WHERE uri = ?)", this.f127641x, (InterfaceC33687a) obj));
            case 8:
                return C6101a.m18306D("DELETE FROM cache_entries WHERE uri IN (SELECT uri FROM cache_scopes WHERE scope = ?)", this.f127641x, (InterfaceC33687a) obj);
            case 9:
                return AbstractC35661d0.m112925s(this.f127641x, ((Integer) obj).intValue());
            case 10:
                C39426e fromEnvironment = (C39426e) obj;
                AbstractC22676k.m65750j(fromEnvironment, "$this$fromEnvironment");
                fromEnvironment.f169612d = this.f127641x;
                fromEnvironment.f169609a.m133455G(null);
                return C23454a0.f92919a;
            case 11:
                return AbstractC38493b.m123361x(this.f127641x, (InterfaceC18044z) obj);
            case 12:
                return AbstractC39195d.m124842C(this.f127641x, (InterfaceC18044z) obj);
            case 13:
                String it = (String) obj;
                AbstractC22676k.m65750j(it, "it");
                boolean zM125890i0 = AbstractC39414r.m125890i0(it);
                String str = this.f127641x;
                if (zM125890i0) {
                    return it.length() < str.length() ? str : it;
                }
                return AbstractC2875y.m8299l(str, it);
            case 14:
                C18284j it3 = (C18284j) obj;
                AbstractC22676k.m65750j(it3, "it");
                return AbstractC39414r.m125856B0(this.f127641x, it3);
            case 15:
                return AbstractC40685o.m132095f(this.f127641x, (InterfaceC18044z) obj);
            default:
                return AbstractC40935f.m132822k(this.f127641x, (WebView) obj);
        }
    }
}
