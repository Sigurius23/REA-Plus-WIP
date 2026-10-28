package p045c6;

import al0.C0971f;
import c41.C4139w0;
import c93.InterfaceC4351m;
import java.util.LinkedHashSet;
import kr.C22786e;
import l83.C23470p;
import ne3.AbstractC26632p;
import ne3.C26611e0;
import p007a6.C0415d1;
import p007a6.InterfaceC0421f1;
import p007a6.InterfaceC0424g1;
import p671z5.C40084b;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: c6.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C4262e implements InterfaceC0421f1 {

    /* JADX INFO: renamed from: f */
    public static final LinkedHashSet f17311f = new LinkedHashSet();

    /* JADX INFO: renamed from: g */
    public static final C22786e f17312g = new C22786e(17);

    /* JADX INFO: renamed from: a */
    public final AbstractC26632p f17313a;

    /* JADX INFO: renamed from: b */
    public final C40084b f17314b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4351m f17315c;

    /* JADX INFO: renamed from: d */
    public final C0971f f17316d;

    /* JADX INFO: renamed from: e */
    public final C23470p f17317e;

    public C4262e(AbstractC26632p fileSystem, C40084b c40084b, C0971f c0971f) {
        C4139w0 c4139w0 = new C4139w0(1);
        AbstractC22676k.m65750j(fileSystem, "fileSystem");
        this.f17313a = fileSystem;
        this.f17314b = c40084b;
        this.f17315c = c4139w0;
        this.f17316d = c0971f;
        this.f17317e = AbstractC30060g.m92088H(new C4261d(this, 1));
    }

    @Override // p007a6.InterfaceC0421f1
    /* JADX INFO: renamed from: a */
    public final InterfaceC0424g1 mo1101a() {
        String strM79265s = ((C26611e0) this.f17317e.getValue()).f105849w.m79265s();
        synchronized (f17312g) {
            LinkedHashSet linkedHashSet = f17311f;
            if (linkedHashSet.contains(strM79265s)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + strM79265s + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            linkedHashSet.add(strM79265s);
        }
        return new C4265h(this.f17313a, (C26611e0) this.f17317e.getValue(), this.f17314b, (C0415d1) this.f17315c.invoke((C26611e0) this.f17317e.getValue(), this.f17313a), new C4261d(this, 0));
    }
}
