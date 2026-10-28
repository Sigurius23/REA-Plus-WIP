package ep0;

import com.whoop.coacheverywherecommon.models.CoachEntry;
import com.whoop.coacheverywherecommon.models.CoachSurfaceType;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: ep0.k */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0015\u0010\u000b\u001a\u00020\b*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u0015\u0010\f\u001a\u00020\b*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\n¨\u0006\r"}, m65681d2 = {"Lep0/j;", "", "c", "(Lep0/j;)Z", "Ltr2/n;", "a", "Ltr2/n;", "screenContextMetadataLogger", "", "b", "(Lep0/j;)Ljava/lang/String;", "screenIdKey", "conversationKey", "coach-everywhere-common_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13405k {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC34116n f46971a = InterfaceC34116n.INSTANCE.m107848a("ScreenContextMetadata");

    /* JADX INFO: renamed from: a */
    public static final String m37869a(C13404j c13404j) {
        AbstractC22676k.m65750j(c13404j, "<this>");
        String fingerprint = c13404j.getFingerprint();
        return (fingerprint == null && (fingerprint = c13404j.getConversationSeedId()) == null) ? m37870b(c13404j) : fingerprint;
    }

    /* JADX INFO: renamed from: b */
    public static final String m37870b(C13404j c13404j) {
        AbstractC22676k.m65750j(c13404j, "<this>");
        String screenId = c13404j.getScreenId();
        if (screenId != null) {
            return screenId;
        }
        f46971a.mo85230v("ScreenContextMetadata.screenId was null; defaulting screen context key to empty string", new IllegalStateException("ScreenContextMetadata.screenId was null"), new AbstractC30556a.a[0]);
        return "";
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m37871c(C13404j c13404j) {
        CoachEntry coachEntry;
        CoachSurfaceType type;
        return (c13404j == null || !c13404j.getIsBottomNavTab() || (coachEntry = c13404j.getCoachEntry()) == null || (type = coachEntry.getType()) == null || !type.isBar()) ? false : true;
    }
}
