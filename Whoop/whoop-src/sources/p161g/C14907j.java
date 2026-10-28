package p161g;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import androidx.profileinstaller.RunnableC1650a;
import p236j.AbstractC21071j;
import p236j.C21073l;
import p267k.AbstractC22081b;
import p267k.C22080a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g.j */
/* JADX INFO: loaded from: classes.dex */
public final class C14907j extends AbstractC21071j {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractActivityC14909l f55586h;

    public C14907j(AbstractActivityC14909l abstractActivityC14909l) {
        this.f55586h = abstractActivityC14909l;
    }

    @Override // p236j.AbstractC21071j
    /* JADX INFO: renamed from: b */
    public final void mo42997b(int i13, AbstractC22081b contract, Object obj, ActivityOptionsCompat activityOptionsCompat) {
        Bundle bundle;
        int i14;
        AbstractC22676k.m65750j(contract, "contract");
        AbstractActivityC14909l abstractActivityC14909l = this.f55586h;
        C22080a synchronousResult = contract.getSynchronousResult(abstractActivityC14909l, obj);
        if (synchronousResult != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC1650a(this, i13, synchronousResult, 1));
            return;
        }
        Intent intentCreateIntent = contract.createIntent(abstractActivityC14909l, obj);
        if (intentCreateIntent.getExtras() != null) {
            Bundle extras = intentCreateIntent.getExtras();
            AbstractC22676k.m65747g(extras);
            if (extras.getClassLoader() == null) {
                intentCreateIntent.setExtrasClassLoader(abstractActivityC14909l.getClassLoader());
            }
        }
        if (intentCreateIntent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = intentCreateIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentCreateIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = activityOptionsCompat != null ? activityOptionsCompat.toBundle() : null;
        }
        Bundle bundle2 = bundle;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentCreateIntent.getAction())) {
            String[] stringArrayExtra = intentCreateIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            ActivityCompat.requestPermissions(abstractActivityC14909l, stringArrayExtra, i13);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentCreateIntent.getAction())) {
            ActivityCompat.startActivityForResult(abstractActivityC14909l, intentCreateIntent, i13, bundle2);
            return;
        }
        C21073l c21073l = (C21073l) intentCreateIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            AbstractC22676k.m65747g(c21073l);
            i14 = i13;
            try {
                ActivityCompat.startIntentSenderForResult(abstractActivityC14909l, c21073l.m58920i(), i14, c21073l.m58917b(), c21073l.m58918f(), c21073l.m58919h(), 0, bundle2);
            } catch (IntentSender.SendIntentException e5) {
                e = e5;
                new Handler(Looper.getMainLooper()).post(new RunnableC1650a(this, i14, e, 2));
            }
        } catch (IntentSender.SendIntentException e13) {
            e = e13;
            i14 = i13;
        }
    }
}
