package so;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import p073cq.C11052u;
import p073cq.InterfaceC11033b;
import p073cq.InterfaceC11039h;

/* JADX INFO: renamed from: so.e */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C32788e implements InterfaceC11033b, InterfaceC11039h {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ C32788e f136475w = new C32788e();

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ C32788e f136476x = new C32788e();

    @Override // p073cq.InterfaceC11033b
    /* JADX INFO: renamed from: a */
    public Object mo11178a(Task task) {
        Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
        if (intent != null) {
            return new C32784a(intent);
        }
        return null;
    }

    @Override // p073cq.InterfaceC11039h
    /* JADX INFO: renamed from: i */
    public C11052u mo8623i(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i13 = C32785b.f136463h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? Tasks.m15640d(bundle) : Tasks.m15640d(null);
    }
}
