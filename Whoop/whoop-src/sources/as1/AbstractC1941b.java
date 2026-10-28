package as1;

import p715kotlin.Metadata;

/* JADX INFO: renamed from: as1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"", "autoSaveEnabled", "hasUserEditJournal", "Las1/a;", "a", "(ZZ)Las1/a;", "journal_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC1941b {
    /* JADX INFO: renamed from: a */
    public static final EnumC1940a m5946a(boolean z4, boolean z13) {
        if (z4 && z13) {
            return EnumC1940a.FULL_SAVE;
        }
        return z4 ? EnumC1940a.EXIT_IMMEDIATELY : EnumC1940a.SHOW_DISMISS_DIALOG;
    }
}
