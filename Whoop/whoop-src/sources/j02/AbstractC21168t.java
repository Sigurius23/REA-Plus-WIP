package j02;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j02.t */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"", "Lj02/v;", "a", "(Ljava/lang/String;)Lj02/v;", "navigation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21168t {
    /* JADX INFO: renamed from: a */
    public static final EnumC21172v m59412a(String str) {
        for (EnumC21172v enumC21172v : EnumC21172v.values()) {
            if (AbstractC22676k.m65745e(enumC21172v.name(), str)) {
                return enumC21172v;
            }
        }
        return null;
    }
}
