package p702ch0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p390p1.AbstractC28683x;
import p390p1.InterfaceC28601c1;
import p668z1.C39970s;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: ch0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR/\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u0006\u0010\u000f\"\u0004\b\u0010\u0010\u0011R+\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u001a\u0010\t\"\u0004\b\u001b\u0010\u000bR/\u0010\u001f\u001a\u0004\u0018\u00010\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0007\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011R#\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020!0 8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\"\u001a\u0004\b#\u0010$R\"\u0010(\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010&\u001a\u0004\b\u0014\u0010\t\"\u0004\b'\u0010\u000bR#\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020*0)8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\r0/8\u0006¢\u0006\f\n\u0004\b#\u00100\u001a\u0004\b\u000e\u00101¨\u00063"}, m65681d2 = {"Lch0/a;", "", "<init>", "()V", "", "<set-?>", "a", "Lp1/c1;", "d", "()Z", "l", "(Z)V", "initialScrollHandled", "", "b", "()Ljava/lang/String;", "j", "(Ljava/lang/String;)V", "appliedScrollToTurnId", "", "c", "f", "()I", "n", "(I)V", "lastPinnedUserMessageCount", "g", "o", "pinModeActive", "e", "m", "lastInViewTurnId", "Lz1/s;", "", "Lz1/s;", "i", "()Lz1/s;", "turnEndYs", "Z", "k", "hasUserScrolled", "", "Lch0/k1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/util/Map;", "()Ljava/util/Map;", "turnEndPositions", "", "Ljava/util/Set;", "()Ljava/util/Set;", "firedFullySeenTurnIds", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4602a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC28601c1 initialScrollHandled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC28601c1 appliedScrollToTurnId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC28601c1 lastPinnedUserMessageCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC28601c1 pinModeActive;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC28601c1 lastInViewTurnId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C39970s turnEndYs;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean hasUserScrolled;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Map<String, EnumC4634k1> turnEndPositions;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Set<String> firedFullySeenTurnIds;

    public C4602a() {
        Boolean bool = Boolean.FALSE;
        this.initialScrollHandled = AbstractC28683x.m87272z(bool);
        this.appliedScrollToTurnId = AbstractC28683x.m87272z(null);
        this.lastPinnedUserMessageCount = AbstractC28683x.m87272z(0);
        this.pinModeActive = AbstractC28683x.m87272z(bool);
        this.lastInViewTurnId = AbstractC28683x.m87272z(null);
        this.turnEndYs = new C39970s();
        this.turnEndPositions = new LinkedHashMap();
        this.firedFullySeenTurnIds = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: a */
    public final String m14266a() {
        return (String) this.appliedScrollToTurnId.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final Set<String> m14267b() {
        return this.firedFullySeenTurnIds;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getHasUserScrolled() {
        return this.hasUserScrolled;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m14269d() {
        return ((Boolean) this.initialScrollHandled.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: e */
    public final String m14270e() {
        return (String) this.lastInViewTurnId.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final int m14271f() {
        return ((Number) this.lastPinnedUserMessageCount.getValue()).intValue();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m14272g() {
        return ((Boolean) this.pinModeActive.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: h */
    public final Map<String, EnumC4634k1> m14273h() {
        return this.turnEndPositions;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C39970s getTurnEndYs() {
        return this.turnEndYs;
    }

    /* JADX INFO: renamed from: j */
    public final void m14275j(String str) {
        this.appliedScrollToTurnId.setValue(str);
    }

    /* JADX INFO: renamed from: k */
    public final void m14276k(boolean z4) {
        this.hasUserScrolled = z4;
    }

    /* JADX INFO: renamed from: l */
    public final void m14277l(boolean z4) {
        this.initialScrollHandled.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: m */
    public final void m14278m(String str) {
        this.lastInViewTurnId.setValue(str);
    }

    /* JADX INFO: renamed from: n */
    public final void m14279n(int i13) {
        this.lastPinnedUserMessageCount.setValue(Integer.valueOf(i13));
    }

    /* JADX INFO: renamed from: o */
    public final void m14280o(boolean z4) {
        this.pinModeActive.setValue(Boolean.valueOf(z4));
    }
}
