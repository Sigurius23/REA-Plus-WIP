package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.EnumC1632v;
import androidx.lifecycle.InterfaceC1577e0;
import androidx.lifecycle.InterfaceC1585g0;
import java.util.Map;

/* JADX INFO: renamed from: androidx.fragment.app.g1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1297g1 implements InterfaceC1577e0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ String f5605w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC1357w1 f5606x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC1638x f5607y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ AbstractC1329o1 f5608z;

    public C1297g1(AbstractC1329o1 abstractC1329o1, String str, InterfaceC1357w1 interfaceC1357w1, AbstractC1638x abstractC1638x) {
        this.f5608z = abstractC1329o1;
        this.f5605w = str;
        this.f5606x = interfaceC1357w1;
        this.f5607y = abstractC1638x;
    }

    @Override // androidx.lifecycle.InterfaceC1577e0
    /* JADX INFO: renamed from: h */
    public final void mo4080h(InterfaceC1585g0 interfaceC1585g0, EnumC1632v enumC1632v) {
        Bundle bundle;
        AbstractC1329o1 abstractC1329o1 = this.f5608z;
        Map map = abstractC1329o1.f5727m;
        EnumC1632v enumC1632v2 = EnumC1632v.ON_START;
        String str = this.f5605w;
        if (enumC1632v == enumC1632v2 && (bundle = (Bundle) map.get(str)) != null) {
            this.f5606x.mo4108a(bundle, str);
            map.remove(str);
            if (AbstractC1329o1.m4132M(2)) {
                Log.v("FragmentManager", "Clearing fragment result with key ".concat(str));
            }
        }
        if (enumC1632v == EnumC1632v.ON_DESTROY) {
            this.f5607y.mo4988d(this);
            abstractC1329o1.f5728n.remove(str);
        }
    }
}
