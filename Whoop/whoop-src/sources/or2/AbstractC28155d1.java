package or2;

import android.content.Context;
import android.content.Intent;
import com.whoop.p069ui.home.redesign.view.MainActivity;

/* JADX INFO: renamed from: or2.d1 */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class AbstractC28155d1 {
    /* JADX INFO: renamed from: a */
    public static Intent m85196a(Context context) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        return intent;
    }
}
