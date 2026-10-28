package od1;

import android.text.TextUtils;
import com.whoop.service.network.model.cycles.Activity;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import pg3.C29218v0;
import ud3.AbstractC34799a1;

/* JADX INFO: renamed from: od1.k */
/* JADX INFO: loaded from: classes8.dex */
public class C27848k {

    /* JADX INFO: renamed from: a */
    private Activity f112166a;

    /* JADX INFO: renamed from: b */
    private C29218v0<?> f112167b;

    public C27848k(Activity activity, C29218v0<? extends Activity> c29218v0) {
        Object obj;
        this.f112166a = activity;
        this.f112167b = c29218v0;
        if (!c29218v0.f118269a.f146788Q || (obj = c29218v0.f118270b) == null) {
            return;
        }
        this.f112166a = (Activity) obj;
    }

    /* JADX INFO: renamed from: a */
    public boolean m83959a() {
        C29218v0<?> c29218v0 = this.f112167b;
        return (c29218v0 == null || c29218v0.f118269a.f146792z == 650) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public boolean m83960b() {
        return this.f112167b.f118269a.f146792z == 409;
    }

    /* JADX INFO: renamed from: c */
    public boolean m83961c() {
        return this.f112167b.f118269a.f146788Q;
    }

    /* JADX INFO: renamed from: d */
    public boolean m83962d() {
        AbstractC34799a1 abstractC34799a1;
        if (!m83961c() && (abstractC34799a1 = this.f112167b.f118271c) != null) {
            try {
                String strM109860m = abstractC34799a1.m109860m();
                if (!TextUtils.isEmpty(strM109860m) && "Duration unreasonably long".equals(new JSONObject(strM109860m).getString("message"))) {
                    return true;
                }
            } catch (IOException | JSONException unused) {
            }
        }
        return false;
    }
}
