package p254jj;

import ad3.AbstractC0770m;
import android.app.Activity;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.C2990b0;
import com.amplitude.android.engagement.C4861a;
import e93.AbstractC12889b;
import g20.C15270p;
import hc3.C17171d;
import io.sentry.RunnableC20277c7;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import live.hms.video.factories.MediaConstraintsFactory;
import p027b3.C2442t0;
import p031b9.AbstractC2875y;
import p197hj.C17338u;
import p222ij.C18581g;
import p222ij.C18582h;
import p222ij.InterfaceC18576b;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: jj.b */
/* JADX INFO: loaded from: classes.dex */
public final class C21736b implements InterfaceC18576b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f83582a;

    /* JADX INFO: renamed from: b */
    public final Object f83583b;

    public /* synthetic */ C21736b(C4861a c4861a, int i13) {
        this.f83582a = i13;
        this.f83583b = c4861a;
    }

    @Override // p222ij.InterfaceC18576b
    /* JADX INFO: renamed from: a */
    public final String mo53797a(String msgId, JsonObject jsonObject, C2442t0 c2442t0) {
        JsonElement jsonElement;
        String strM1844f;
        Activity activityM49083a;
        switch (this.f83582a) {
            case 0:
                AbstractC22676k.m65750j(msgId, "msgId");
                C4861a.f20259o.m16047a0("Hiding debug toolbar with args: " + jsonObject);
                Activity activityM49083a2 = C17338u.f67142w.m49083a();
                if (activityM49083a2 == null) {
                    c2442t0.invoke(new C18581g("No active activity to hide debug toolbar"));
                    return "";
                }
                try {
                    activityM49083a2.runOnUiThread(new RunnableC20277c7(this, 15));
                    c2442t0.invoke(new C18582h(MediaConstraintsFactory.kValueTrue));
                    break;
                } catch (Exception e5) {
                    C4861a.f20259o.m16047a0("Error hiding debug toolbar", e5);
                    c2442t0.invoke(new C18581g(AbstractC2875y.m8298k(e5, new StringBuilder("Failed to hide debug toolbar: "))));
                }
                return null;
            case 1:
                AbstractC22676k.m65750j(msgId, "msgId");
                C4861a.f20259o.m16047a0("Showing debug toolbar with args: " + jsonObject);
                Activity activityM49083a3 = C17338u.f67142w.m49083a();
                if (activityM49083a3 == null) {
                    c2442t0.invoke(new C18581g("No active activity to show debug toolbar"));
                    return "";
                }
                try {
                    activityM49083a3.runOnUiThread(new RunnableC20277c7(this, 16));
                    c2442t0.invoke(new C18582h(MediaConstraintsFactory.kValueTrue));
                    break;
                } catch (Exception e13) {
                    C4861a.f20259o.m16032K("Error showing debug toolbar", e13);
                    c2442t0.invoke(new C18581g(AbstractC2875y.m8298k(e13, new StringBuilder("Failed to show debug toolbar: "))));
                }
                return null;
            default:
                AbstractC22676k.m65750j(msgId, "msgId");
                InterfaceC30057d interfaceC30057d = null;
                if (!jsonObject.isEmpty() && (jsonElement = (JsonElement) jsonObject.get("selector")) != null && (strM1844f = AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement))) != null && (activityM49083a = C17338u.f67142w.m49083a()) != null) {
                    AbstractC3006f0.m8732z((C17171d) this.f83583b, null, null, new C15270p(activityM49083a, strM1844f, c2442t0, interfaceC30057d, 21), 3);
                }
                return null;
        }
    }

    public C21736b() {
        this.f83582a = 2;
        this.f83583b = AbstractC3006f0.m8708b(AbstractC12889b.m36254T(AbstractC3006f0.m8710d(), AbstractC3050q0.f12077a).plus(new C2990b0("isElementVisible")));
    }
}
