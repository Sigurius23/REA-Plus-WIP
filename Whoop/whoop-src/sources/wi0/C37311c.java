package wi0;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: wi0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lwi0/c;", "", "Landroid/content/SharedPreferences;", "sharedPreferences", "<init>", "(Landroid/content/SharedPreferences;)V", "", "", "endpoints", "Ll83/a0;", "d", "(Ljava/util/List;)V", "c", "()Ljava/util/List;", "endpoint", "e", "(Ljava/lang/String;)V", "b", "a", "()V", "Landroid/content/SharedPreferences;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37311c {

    /* JADX INFO: renamed from: c */
    public static final int f159530c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final SharedPreferences sharedPreferences;

    public C37311c(SharedPreferences sharedPreferences) {
        AbstractC22676k.m65750j(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
    }

    /* JADX INFO: renamed from: d */
    private final void m119486d(List<String> endpoints) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putString("arch_v2_playground_recent_endpoint_paths", AbstractC25265s.m74110N0(endpoints, "\n", null, null, null, 62));
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: a */
    public final void m119487a() {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.remove("arch_v2_playground_recent_endpoint_paths");
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: b */
    public final void m119488b(String endpoint) {
        AbstractC22676k.m65750j(endpoint, "endpoint");
        List<String> listM119489c = m119489c();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM119489c) {
            if (!AbstractC22676k.m65745e((String) obj, endpoint)) {
                arrayList.add(obj);
            }
        }
        m119486d(arrayList);
    }

    /* JADX INFO: renamed from: c */
    public final List<String> m119489c() {
        String string = this.sharedPreferences.getString("arch_v2_playground_recent_endpoint_paths", "");
        List listM125906y0 = AbstractC39414r.m125906y0(string != null ? string : "", new String[]{"\n"}, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM125906y0) {
            if (!AbstractC39414r.m125890i0((String) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final void m119490e(String endpoint) {
        AbstractC22676k.m65750j(endpoint, "endpoint");
        if (AbstractC39414r.m125890i0(endpoint)) {
            return;
        }
        List listM118958J = AbstractC37056f.m118958J(endpoint);
        List<String> listM119489c = m119489c();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM119489c) {
            if (!AbstractC22676k.m65745e((String) obj, endpoint)) {
                arrayList.add(obj);
            }
        }
        m119486d(AbstractC25265s.m74129g1(listM118958J, arrayList));
    }
}
