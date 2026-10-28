package p702ch0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p390p1.AbstractC28683x;
import p390p1.InterfaceC28601c1;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: ch0.s0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR+\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0006\u0010\u0017\"\u0004\b\u0018\u0010\u0019R+\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0007\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u001c\u0010\u0012R+\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u001e\u0010\u0012R+\u0010!\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b \u0010\u0012¨\u0006\""}, m65681d2 = {"Lch0/s0;", "", "<init>", "()V", "", "<set-?>", "a", "Lp1/c1;", "e", "()I", "k", "(I)V", "viewportHeightPx", "", "b", "f", "()F", "l", "(F)V", "viewportTopY", "", "c", "Z", "()Z", "g", "(Z)V", "hasBeenVisible", "d", "i", "latestUserMessageTopY", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "latestAssistantMessageTopY", "j", "messagesBottomY", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4650s0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC28601c1 viewportHeightPx = AbstractC28683x.m87272z(0);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC28601c1 viewportTopY;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean hasBeenVisible;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC28601c1 latestUserMessageTopY;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC28601c1 latestAssistantMessageTopY;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC28601c1 messagesBottomY;

    public C4650s0() {
        Float fValueOf = Float.valueOf(0.0f);
        this.viewportTopY = AbstractC28683x.m87272z(fValueOf);
        this.latestUserMessageTopY = AbstractC28683x.m87272z(fValueOf);
        this.latestAssistantMessageTopY = AbstractC28683x.m87272z(fValueOf);
        this.messagesBottomY = AbstractC28683x.m87272z(fValueOf);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getHasBeenVisible() {
        return this.hasBeenVisible;
    }

    /* JADX INFO: renamed from: b */
    public final float m14619b() {
        return ((Number) this.latestAssistantMessageTopY.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: c */
    public final float m14620c() {
        return ((Number) this.latestUserMessageTopY.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: d */
    public final float m14621d() {
        return ((Number) this.messagesBottomY.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: e */
    public final int m14622e() {
        return ((Number) this.viewportHeightPx.getValue()).intValue();
    }

    /* JADX INFO: renamed from: f */
    public final float m14623f() {
        return ((Number) this.viewportTopY.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: g */
    public final void m14624g(boolean z4) {
        this.hasBeenVisible = z4;
    }

    /* JADX INFO: renamed from: h */
    public final void m14625h(float f13) {
        this.latestAssistantMessageTopY.setValue(Float.valueOf(f13));
    }

    /* JADX INFO: renamed from: i */
    public final void m14626i(float f13) {
        this.latestUserMessageTopY.setValue(Float.valueOf(f13));
    }

    /* JADX INFO: renamed from: j */
    public final void m14627j(float f13) {
        this.messagesBottomY.setValue(Float.valueOf(f13));
    }

    /* JADX INFO: renamed from: k */
    public final void m14628k(int i13) {
        this.viewportHeightPx.setValue(Integer.valueOf(i13));
    }

    /* JADX INFO: renamed from: l */
    public final void m14629l(float f13) {
        this.viewportTopY.setValue(Float.valueOf(f13));
    }
}
