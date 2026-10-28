package fn2;

import android.content.Context;
import android.provider.Settings;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fn2.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\n"}, m65681d2 = {"Lfn2/e;", "Lfn2/c;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "a", "()Z", "Landroid/content/Context;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14645e implements InterfaceC14643c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    public C14645e(Context context) {
        AbstractC22676k.m65750j(context, "context");
        this.context = context;
    }

    @Override // fn2.InterfaceC14643c
    /* JADX INFO: renamed from: a */
    public boolean mo41843a() {
        return Settings.System.getInt(this.context.getContentResolver(), "accelerometer_rotation", 0) == 1;
    }
}
