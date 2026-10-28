package j02;

import android.content.Context;
import com.whoop.whooplive.selfie.SelfieActivity;
import m02.C24884c;
import m02.InterfaceC24883b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j02.z0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lj02/z0;", "Lm02/b;", "<init>", "()V", "Landroid/content/Context;", "context", "Lm02/c;", "params", "", "a", "(Landroid/content/Context;Lm02/c;)Z", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21181z0 implements InterfaceC24883b {
    @Override // m02.InterfaceC24883b
    /* JADX INFO: renamed from: a */
    public boolean mo59422a(Context context, C24884c params) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(params, "params");
        SelfieActivity.m28839i1(context, params.getCycleId(), params.getLowerBound(), params.getUpperBound(), params.getScaledStrain(), params.getRecoveryScoreValue(), Long.valueOf(params.getMillisOfSleep()), params.getIsComplete(), params.getCalories()).m49154m();
        return true;
    }
}
