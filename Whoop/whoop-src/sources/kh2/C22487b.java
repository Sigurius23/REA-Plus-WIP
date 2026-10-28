package kh2;

import android.app.Application;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import java.util.List;
import p082d6.C11724b;
import p098dt.AbstractC12350b;
import p109e6.AbstractC12755j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: kh2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lkh2/b;", "", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "", "Ld6/b;", "Lf6/f;", "a", "()Ljava/util/List;", "Landroid/app/Application;", "essentials_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22487b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Application application;

    public C22487b(Application application) {
        AbstractC22676k.m65750j(application, "application");
        this.application = application;
    }

    /* JADX INFO: renamed from: a */
    public final List<C11724b> m64988a() {
        return AbstractC37056f.m118959K(AbstractC12755j.m35700a(this.application, AbstractC12350b.m34570S("ShowLanguageModal"), "mainPreferences"), AbstractC12755j.m35700a(this.application, AbstractC12350b.m34570S(SharedPreferenceConstants.KEY_APP_INSTALLATION_UUID), "HttpUtil"));
    }
}
