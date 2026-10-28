package ri0;

import ad3.AbstractC0770m;
import ep0.C13404j;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ri0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lep0/j;", "", "a", "(Lep0/j;)Z", "arch-v2_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31445d {
    /* JADX INFO: renamed from: a */
    public static final boolean m96809a(C13404j c13404j) {
        Map<String, JsonElement> mapM37846c;
        JsonElement jsonElement;
        if (c13404j == null || (mapM37846c = c13404j.m37846c()) == null || (jsonElement = mapM37846c.get("refresh_on_coach_dismiss")) == null) {
            return false;
        }
        return AbstractC22676k.m65745e(AbstractC0770m.m1843e(AbstractC0770m.m1848j(jsonElement)), Boolean.TRUE);
    }
}
