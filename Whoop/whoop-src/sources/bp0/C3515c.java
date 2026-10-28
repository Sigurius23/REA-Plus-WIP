package bp0;

import cp0.EnumC10974l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: bp0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\f"}, m65681d2 = {"Lbp0/c;", "", "<init>", "()V", "Lcp0/l;", "detent", "", "currentScreenIdentifier", "a", "(Lcp0/l;Ljava/lang/String;)Ljava/lang/String;", "Ljava/lang/String;", "openScreenIdentifier", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3515c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private String openScreenIdentifier;

    /* JADX INFO: renamed from: a */
    public final String m10407a(EnumC10974l detent, String currentScreenIdentifier) {
        AbstractC22676k.m65750j(detent, "detent");
        AbstractC22676k.m65750j(currentScreenIdentifier, "currentScreenIdentifier");
        String str = this.openScreenIdentifier;
        if (str != null) {
            currentScreenIdentifier = str;
        }
        this.openScreenIdentifier = AbstractC3531s.m10501n1(detent) ? currentScreenIdentifier : null;
        return currentScreenIdentifier;
    }
}
