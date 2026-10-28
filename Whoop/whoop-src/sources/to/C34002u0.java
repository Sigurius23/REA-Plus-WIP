package to;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p012ab.C0682h0;

/* JADX INFO: renamed from: to.u0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C34002u0 extends AbstractComponentCallbacksC1320m0 implements InterfaceC33977i {

    /* JADX INFO: renamed from: x */
    public static final WeakHashMap f142492x = new WeakHashMap();

    /* JADX INFO: renamed from: w */
    public final C0682h0 f142493w = new C0682h0(16, (byte) 0);

    @Override // to.InterfaceC33977i
    /* JADX INFO: renamed from: d */
    public final AbstractC33975h mo107444d(Class cls, String str) {
        return (AbstractC33975h) cls.cast(((Map) this.f142493w.f2433y).get(str));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.f142493w.f2433y).values().iterator();
        while (it.hasNext()) {
            ((AbstractC33975h) it.next()).getClass();
        }
    }

    @Override // to.InterfaceC33977i
    /* JADX INFO: renamed from: o */
    public final void mo107446o(String str, AbstractC33975h abstractC33975h) {
        this.f142493w.m1708x(str, abstractC33975h);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onActivityResult(int i13, int i14, Intent intent) {
        super.onActivityResult(i13, i14, intent);
        Iterator it = ((Map) this.f142493w.f2433y).values().iterator();
        while (it.hasNext()) {
            ((AbstractC33975h) it.next()).mo107439c(i13, i14, intent);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f142493w.m1709y(bundle);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onDestroy() {
        super.onDestroy();
        C0682h0 c0682h0 = this.f142493w;
        c0682h0.f2432x = 5;
        Iterator it = ((Map) c0682h0.f2433y).values().iterator();
        while (it.hasNext()) {
            ((AbstractC33975h) it.next()).mo107416e();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onResume() {
        super.onResume();
        C0682h0 c0682h0 = this.f142493w;
        c0682h0.f2432x = 3;
        Iterator it = ((Map) c0682h0.f2433y).values().iterator();
        while (it.hasNext()) {
            ((AbstractC33975h) it.next()).mo107441f();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f142493w.m1710z(bundle);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onStart() {
        super.onStart();
        C0682h0 c0682h0 = this.f142493w;
        c0682h0.f2432x = 2;
        Iterator it = ((Map) c0682h0.f2433y).values().iterator();
        while (it.hasNext()) {
            ((AbstractC33975h) it.next()).mo107443h();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onStop() {
        super.onStop();
        C0682h0 c0682h0 = this.f142493w;
        c0682h0.f2432x = 4;
        Iterator it = ((Map) c0682h0.f2433y).values().iterator();
        while (it.hasNext()) {
            ((AbstractC33975h) it.next()).mo29700i();
        }
    }
}
