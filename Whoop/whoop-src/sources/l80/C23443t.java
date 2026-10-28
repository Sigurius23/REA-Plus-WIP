package l80;

import android.content.Context;
import p030b7.C2772a;
import p030b7.InterfaceC2773b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l80.t */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Ll80/t;", "Ll80/s;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "a", "()Z", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C23443t implements InterfaceC23442s {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    public C23443t(Context context) {
        AbstractC22676k.m65750j(context, "context");
        this.context = context;
    }

    @Override // l80.InterfaceC23442s
    /* JADX INFO: renamed from: a */
    public boolean mo68006a() {
        return C2772a.m7836c(InterfaceC2773b.f10911a, this.context) == 3;
    }
}
