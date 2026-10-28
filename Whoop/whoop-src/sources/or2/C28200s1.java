package or2;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import androidx.core.app.LocaleManagerCompat;
import androidx.room.ExecutorC1834u1;
import p029b5.C2728g;
import p314m.AbstractC24856o;
import p314m.AbstractC24857p;
import p314m.AbstractC24858q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: or2.s1 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\nR$\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m65681d2 = {"Lor2/s1;", "Lor2/r1;", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "a", "Landroid/content/Context;", "Lb5/g;", "c", "()Lb5/g;", "localeList", "systemLocaleList", "value", "b", "d", "(Lb5/g;)V", "appSpecificLocalList", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28200s1 implements InterfaceC28197r1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context applicationContext;

    public C28200s1(Context applicationContext) {
        AbstractC22676k.m65750j(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
    }

    @Override // or2.InterfaceC28197r1
    /* JADX INFO: renamed from: a */
    public C2728g mo85331a() {
        C2728g systemLocales = LocaleManagerCompat.getSystemLocales(this.applicationContext);
        AbstractC22676k.m65749i(systemLocales, "getSystemLocales(...)");
        return systemLocales;
    }

    @Override // or2.InterfaceC28197r1
    /* JADX INFO: renamed from: b */
    public C2728g mo85332b() {
        C2728g c2728gM72880d = AbstractC24858q.m72880d();
        AbstractC22676k.m65749i(c2728gM72880d, "getApplicationLocales(...)");
        return c2728gM72880d;
    }

    @Override // or2.InterfaceC28197r1
    /* JADX INFO: renamed from: c */
    public C2728g mo85333c() {
        C2728g c2728g = C2728g.f10738b;
        return C2728g.m7699f(LocaleList.getAdjustedDefault());
    }

    @Override // or2.InterfaceC28197r1
    /* JADX INFO: renamed from: d */
    public void mo85334d(C2728g value) {
        AbstractC22676k.m65750j(value, "value");
        ExecutorC1834u1 executorC1834u1 = AbstractC24858q.f97382w;
        if (Build.VERSION.SDK_INT >= 33) {
            Object objM72881e = AbstractC24858q.m72881e();
            if (objM72881e != null) {
                AbstractC24857p.m72878b(objM72881e, AbstractC24856o.m72876a(value.m7703e()));
                return;
            }
            return;
        }
        if (value.equals(AbstractC24858q.f97384y)) {
            return;
        }
        synchronized (AbstractC24858q.f97380H) {
            AbstractC24858q.f97384y = value;
            AbstractC24858q.m72879c();
        }
    }
}
