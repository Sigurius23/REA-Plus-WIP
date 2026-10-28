package zg0;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import m83.AbstractC25265s;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zg0.m */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\fR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lzg0/m;", "", "<init>", "()V", "", "fingerprint", "", "orderedTurnIds", "", "settledTurnIds", "a", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Set;)Ljava/util/List;", "Ljava/lang/String;", "", "b", "Ljava/util/Set;", "knownSettledTurnIds", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40630m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private String fingerprint;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Set<String> knownSettledTurnIds;

    /* JADX INFO: renamed from: a */
    public final List<String> m131860a(String fingerprint, List<String> orderedTurnIds, Set<String> settledTurnIds) {
        AbstractC22676k.m65750j(fingerprint, "fingerprint");
        AbstractC22676k.m65750j(orderedTurnIds, "orderedTurnIds");
        AbstractC22676k.m65750j(settledTurnIds, "settledTurnIds");
        if (!fingerprint.equals(this.fingerprint)) {
            this.fingerprint = fingerprint;
            this.knownSettledTurnIds = null;
        }
        Set<String> set = this.knownSettledTurnIds;
        if (set == null) {
            if (!orderedTurnIds.isEmpty()) {
                this.knownSettledTurnIds = AbstractC25265s.m74101H1(settledTurnIds);
            }
            return C25271y.f99162w;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : orderedTurnIds) {
            String str = (String) obj;
            if (settledTurnIds.contains(str) && !set.contains(str)) {
                arrayList.add(obj);
            }
        }
        set.addAll(settledTurnIds);
        return arrayList;
    }
}
