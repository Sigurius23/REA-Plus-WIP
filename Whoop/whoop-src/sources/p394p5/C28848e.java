package p394p5;

import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.ResultReceiver;
import androidx.credentials.playservices.HiddenActivity;
import l83.C23454a0;
import p164g2.C15252x;
import p402po.C29389f;
import p402po.C29392i;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22669g0;

/* JADX INFO: renamed from: p5.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C28848e extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f116768w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f116769x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f116770y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C28848e(Object obj, int i13, int i14) {
        super(1);
        this.f116768w = i14;
        this.f116769x = obj;
        this.f116770y = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f116768w) {
            case 0:
                HiddenActivity hiddenActivity = (HiddenActivity) this.f116769x;
                C29389f c29389f = (C29389f) obj;
                try {
                    hiddenActivity.f5315x = true;
                    hiddenActivity.startIntentSenderForResult(c29389f.f119219w.getIntentSender(), this.f116770y, null, 0, 0, 0, null);
                    break;
                } catch (IntentSender.SendIntentException e5) {
                    ResultReceiver resultReceiver = hiddenActivity.f5314w;
                    AbstractC22676k.m65747g(resultReceiver);
                    hiddenActivity.m3714a(resultReceiver, "GET_UNKNOWN", "During begin sign in, one tap ui intent sender failure: " + e5.getMessage());
                }
                return C23454a0.f92919a;
            case 1:
                HiddenActivity hiddenActivity2 = (HiddenActivity) this.f116769x;
                C29392i c29392i = (C29392i) obj;
                try {
                    hiddenActivity2.f5315x = true;
                    hiddenActivity2.startIntentSenderForResult(c29392i.f119229w.getIntentSender(), this.f116770y, null, 0, 0, 0, null);
                    break;
                } catch (IntentSender.SendIntentException e13) {
                    ResultReceiver resultReceiver2 = hiddenActivity2.f5314w;
                    AbstractC22676k.m65747g(resultReceiver2);
                    hiddenActivity2.m3714a(resultReceiver2, "CREATE_UNKNOWN", "During save password, found UI intent sender failure: " + e13.getMessage());
                }
                return C23454a0.f92919a;
            case 2:
                HiddenActivity hiddenActivity3 = (HiddenActivity) this.f116769x;
                PendingIntent result = (PendingIntent) obj;
                AbstractC22676k.m65750j(result, "result");
                try {
                    hiddenActivity3.f5315x = true;
                    hiddenActivity3.startIntentSenderForResult(result.getIntentSender(), this.f116770y, null, 0, 0, 0, null);
                    break;
                } catch (IntentSender.SendIntentException e14) {
                    ResultReceiver resultReceiver3 = hiddenActivity3.f5314w;
                    AbstractC22676k.m65747g(resultReceiver3);
                    hiddenActivity3.m3714a(resultReceiver3, "CREATE_UNKNOWN", "During public key credential, found IntentSender failure on public key creation: " + e14.getMessage());
                }
                return C23454a0.f92919a;
            case 3:
                HiddenActivity hiddenActivity4 = (HiddenActivity) this.f116769x;
                PendingIntent pendingIntent = (PendingIntent) obj;
                try {
                    hiddenActivity4.f5315x = true;
                    hiddenActivity4.startIntentSenderForResult(pendingIntent.getIntentSender(), this.f116770y, null, 0, 0, 0, null);
                    break;
                } catch (IntentSender.SendIntentException e15) {
                    ResultReceiver resultReceiver4 = hiddenActivity4.f5314w;
                    AbstractC22676k.m65747g(resultReceiver4);
                    hiddenActivity4.m3714a(resultReceiver4, "GET_UNKNOWN", "During get sign-in intent, one tap ui intent sender failure: " + e15.getMessage());
                }
                return C23454a0.f92919a;
            default:
                C22669g0 c22669g0 = (C22669g0) this.f116769x;
                Boolean boolValueOf = Boolean.valueOf(((C15252x) obj).m43360b1(this.f116770y));
                c22669g0.f89336w = boolValueOf;
                return boolValueOf;
        }
    }
}
