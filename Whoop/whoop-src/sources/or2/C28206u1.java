package or2;

import android.content.Context;
import android.provider.Settings;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: or2.u1 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lor2/u1;", "Lor2/t1;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "name", "", "defaultValue", "getFloat", "(Ljava/lang/String;F)F", "a", "Landroid/content/Context;", "essentials_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28206u1 implements InterfaceC28203t1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    public C28206u1(Context context) {
        AbstractC22676k.m65750j(context, "context");
        this.context = context;
    }

    @Override // or2.InterfaceC28203t1
    public float getFloat(String name, float defaultValue) {
        AbstractC22676k.m65750j(name, "name");
        return Settings.Global.getFloat(this.context.getContentResolver(), name, defaultValue);
    }
}
