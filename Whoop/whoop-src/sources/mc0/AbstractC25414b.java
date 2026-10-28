package mc0;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mc0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"", "step", "Lmc0/a;", "a", "(Ljava/lang/String;)Lmc0/a;", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25414b {
    /* JADX INFO: renamed from: a */
    public static final EnumC25413a m74600a(String str) {
        if (AbstractC22676k.m65745e(str, "SKIPPED_CONFIRMATION")) {
            return EnumC25413a.DISMISS;
        }
        if (AbstractC22676k.m65745e(str, "OPTED_IN_CONFIRMATION")) {
            return EnumC25413a.OPT_IN;
        }
        return null;
    }
}
