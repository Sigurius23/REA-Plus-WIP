package rk1;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hy0.EnumC17727b2;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import pk1.AbstractC29335a;
import sk1.C32573b;

/* JADX INFO: renamed from: rk1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u000f\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\r\u0010\bR\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001b\u0010\bR\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u0018\u0010\b¨\u0006 "}, m65681d2 = {"Lrk1/a;", "", "<init>", "()V", "Lsk1/b;", "b", "Lsk1/b;", "i", "()Lsk1/b;", "shepherdNotDetected", "c", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "shepherdDetected", "d", "highHeartRateNotDetected", "e", "a", "highHeartRateDetected", "f", "lowHeartRateNotDetected", "g", "lowHeartRateDetected", "normalSinusRhythmNotDetected", "normalSinusRhythmDetected", "j", "inconclusiveDetermination", "k", "l", "unreadableDetermination", "unableToCheckTooLow", "m", "unableToCheckTooHigh", "heart-health-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31494a {

    /* JADX INFO: renamed from: a */
    public static final C31494a f129909a = new C31494a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final C32573b shepherdNotDetected;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final C32573b shepherdDetected;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final C32573b highHeartRateNotDetected;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final C32573b highHeartRateDetected;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final C32573b lowHeartRateNotDetected;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final C32573b lowHeartRateDetected;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final C32573b normalSinusRhythmNotDetected;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final C32573b normalSinusRhythmDetected;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final C32573b inconclusiveDetermination;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static final C32573b unreadableDetermination;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private static final C32573b unableToCheckTooLow;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private static final C32573b unableToCheckTooHigh;

    /* JADX INFO: renamed from: n */
    public static final int f129922n;

    static {
        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC29335a.f118851w);
        EnumC17727b2 enumC17727b2 = EnumC17727b2.POSITIVE_RANGE;
        shepherdNotDetected = new C32573b(c8688bM21277k, enumC17727b2);
        TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC29335a.f118850v);
        EnumC17727b2 enumC17727b3 = EnumC17727b2.CONCERN_RANGE;
        shepherdDetected = new C32573b(c8688bM21277k2, enumC17727b3);
        highHeartRateNotDetected = new C32573b(AbstractC8693b.m21277k(AbstractC29335a.f118830b), enumC17727b2);
        highHeartRateDetected = new C32573b(AbstractC8693b.m21277k(AbstractC29335a.f118829a), enumC17727b3);
        lowHeartRateNotDetected = new C32573b(AbstractC8693b.m21277k(AbstractC29335a.f118843o), enumC17727b2);
        lowHeartRateDetected = new C32573b(AbstractC8693b.m21277k(AbstractC29335a.f118842n), enumC17727b3);
        normalSinusRhythmNotDetected = new C32573b(AbstractC8693b.m21277k(AbstractC29335a.f118846r), enumC17727b3);
        normalSinusRhythmDetected = new C32573b(AbstractC8693b.m21277k(AbstractC29335a.f118845q), enumC17727b2);
        inconclusiveDetermination = new C32573b(AbstractC8693b.m21277k(AbstractC29335a.f118832d), enumC17727b2);
        unreadableDetermination = new C32573b(AbstractC8693b.m21277k(AbstractC29335a.f118854z), enumC17727b3);
        TextResource.C8688b c8688bM21277k3 = AbstractC8693b.m21277k(AbstractC29335a.f118853y);
        EnumC17727b2 enumC17727b4 = EnumC17727b2.NEUTRAL;
        unableToCheckTooLow = new C32573b(c8688bM21277k3, enumC17727b4);
        unableToCheckTooHigh = new C32573b(AbstractC8693b.m21277k(AbstractC29335a.f118852x), enumC17727b4);
        f129922n = TextResource.$stable;
    }

    private C31494a() {
    }

    /* JADX INFO: renamed from: a */
    public final C32573b m97021a() {
        return highHeartRateDetected;
    }

    /* JADX INFO: renamed from: b */
    public final C32573b m97022b() {
        return highHeartRateNotDetected;
    }

    /* JADX INFO: renamed from: c */
    public final C32573b m97023c() {
        return inconclusiveDetermination;
    }

    /* JADX INFO: renamed from: d */
    public final C32573b m97024d() {
        return lowHeartRateDetected;
    }

    /* JADX INFO: renamed from: e */
    public final C32573b m97025e() {
        return lowHeartRateNotDetected;
    }

    /* JADX INFO: renamed from: f */
    public final C32573b m97026f() {
        return normalSinusRhythmDetected;
    }

    /* JADX INFO: renamed from: g */
    public final C32573b m97027g() {
        return normalSinusRhythmNotDetected;
    }

    /* JADX INFO: renamed from: h */
    public final C32573b m97028h() {
        return shepherdDetected;
    }

    /* JADX INFO: renamed from: i */
    public final C32573b m97029i() {
        return shepherdNotDetected;
    }

    /* JADX INFO: renamed from: j */
    public final C32573b m97030j() {
        return unableToCheckTooHigh;
    }

    /* JADX INFO: renamed from: k */
    public final C32573b m97031k() {
        return unableToCheckTooLow;
    }

    /* JADX INFO: renamed from: l */
    public final C32573b m97032l() {
        return unreadableDetermination;
    }
}
