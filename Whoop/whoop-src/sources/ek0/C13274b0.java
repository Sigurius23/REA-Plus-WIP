package ek0;

import e93.AbstractC12889b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import m83.C25271y;
import or2.AbstractC28209v1;
import ot0.C28323a;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import wj0.AbstractC37317a;

/* JADX INFO: renamed from: ek0.b0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b1\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u0010\u000fR\u0014\u0010\u001a\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\u000fR\u0014\u0010\u001c\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u000fR\u0014\u0010\u001e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u000fR\u0014\u0010 \u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001f\u0010\u000fR\u0014\u0010\"\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b!\u0010\u000fR\u0014\u0010$\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u000fR\u0014\u0010&\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b%\u0010\u000fR\u0014\u0010(\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u000fR\u0014\u0010*\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b)\u0010\u000fR\u0014\u0010,\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u000fR\u0014\u0010.\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b-\u0010\u000fR\u0014\u00100\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u000fR\u0014\u00102\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b1\u0010\u000fR\u0014\u00104\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u000fR\u0014\u00106\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b5\u0010\u000fR\u0014\u00108\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010\u000fR\u0014\u0010:\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b9\u0010\u000fR\u0014\u0010<\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010\u000fR\u0014\u0010>\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010\u000fR\u0014\u0010B\u001a\u00020?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010E\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0011\u0010G\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bF\u0010DR\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020\r0H8F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0011\u0010M\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bL\u0010DR\u0011\u0010O\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bN\u0010DR\u0011\u0010Q\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bP\u0010DR\u0011\u0010S\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bR\u0010DR\u0011\u0010U\u001a\u00020?8F¢\u0006\u0006\u001a\u0004\bT\u0010A¨\u0006V"}, m65681d2 = {"Lek0/b0;", "Lot0/a;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "toString", "()Ljava/lang/String;", "Ltr2/n;", "e", "Ltr2/n;", "logger", "", "f", "I", "epochSecondsLengthRev1", "g", "epochSecondsOffsetRev1", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "subSecondsOffsetRev1", "i", "alarmIdOffsetRev2", "j", "epochSecondsLengthRev2", "k", "epochSecondsOffsetRev2", "l", "subSecondsOffsetRev2", "m", "alarmIdOffsetRev3", "n", "alarmIdLengthRev3", "o", "epochSecondsLengthRev3", "p", "epochSecondsOffsetRev3", "q", "subSecondsLengthRev3", "r", "subSecondsOffsetRev3", "s", "waveformEffectsLengthRev3", "t", "waveformEffectsOffsetRev3", "u", "loopControlForEffectsLengthRev3", "v", "loopControlForEffectsOffsetRev3", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "overallWaveformLoopControlLengthRev3", "x", "overallWaveformLoopControlOffsetRev3", "y", "alarmDurationLengthRev3", "z", "alarmDurationOffsetRev3", "A", "alarmTypeLengthRev3", "B", "alarmTypeOffsetRev3", "C", "revision", "", "W", "()J", "epochSeconds", "Z", "()I", "subSeconds", "U", "alarmId", "", "b0", "()Ljava/util/List;", "waveformEffects", "X", "loopControlForEffects", "Y", "overallWaveformLoopControl", "T", "alarmDuration", "V", "alarmType", "a0", "timeStampMillis", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13274b0 extends C28323a {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final int alarmTypeLengthRev3;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final int alarmTypeOffsetRev3;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final int revision;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int epochSecondsLengthRev1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int epochSecondsOffsetRev1;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int subSecondsOffsetRev1;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int alarmIdOffsetRev2;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int epochSecondsLengthRev2;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int epochSecondsOffsetRev2;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final int subSecondsOffsetRev2;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final int alarmIdOffsetRev3;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final int alarmIdLengthRev3;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final int epochSecondsLengthRev3;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final int epochSecondsOffsetRev3;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final int subSecondsLengthRev3;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final int subSecondsOffsetRev3;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final int waveformEffectsLengthRev3;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final int waveformEffectsOffsetRev3;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final int loopControlForEffectsLengthRev3;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final int loopControlForEffectsOffsetRev3;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final int overallWaveformLoopControlLengthRev3;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final int overallWaveformLoopControlOffsetRev3;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final int alarmDurationLengthRev3;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final int alarmDurationOffsetRev3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13274b0(ByteBuffer payload) {
        super(payload);
        AbstractC22676k.m65750j(payload, "payload");
        this.logger = InterfaceC34116n.INSTANCE.m107848a("StrapDrivenAlarmSetEventPacket");
        this.epochSecondsLengthRev1 = 4;
        this.epochSecondsOffsetRev1 = 1;
        this.subSecondsOffsetRev1 = 1 + 4;
        this.alarmIdOffsetRev2 = 1;
        this.epochSecondsLengthRev2 = 4;
        this.epochSecondsOffsetRev2 = 2;
        this.subSecondsOffsetRev2 = 2 + 4;
        this.alarmIdOffsetRev3 = 1;
        this.alarmIdLengthRev3 = 1;
        this.epochSecondsLengthRev3 = 4;
        int i13 = 1 + 1;
        this.epochSecondsOffsetRev3 = i13;
        this.subSecondsLengthRev3 = 2;
        this.subSecondsOffsetRev3 = i13 + 4;
        this.waveformEffectsLengthRev3 = 8;
        this.waveformEffectsOffsetRev3 = i13 + 6;
        this.loopControlForEffectsLengthRev3 = 2;
        this.loopControlForEffectsOffsetRev3 = i13 + 14;
        this.overallWaveformLoopControlLengthRev3 = 1;
        this.overallWaveformLoopControlOffsetRev3 = i13 + 16;
        this.alarmDurationLengthRev3 = 1;
        this.alarmDurationOffsetRev3 = i13 + 17;
        this.alarmTypeLengthRev3 = 1;
        this.alarmTypeOffsetRev3 = i13 + 18;
        ByteBuffer byteBufferM85784Q = m85784Q();
        AbstractC22676k.m65747g(byteBufferM85784Q);
        this.revision = AbstractC37317a.m119536a(byteBufferM85784Q.get(0));
    }

    /* JADX INFO: renamed from: W */
    private final long m37322W() {
        int i13 = this.revision;
        if (i13 == 1) {
            ByteBuffer byteBufferM85784Q = m85784Q();
            AbstractC22676k.m65747g(byteBufferM85784Q);
            return AbstractC37317a.m119538c(byteBufferM85784Q.getInt(this.epochSecondsOffsetRev1));
        }
        if (i13 == 2) {
            ByteBuffer byteBufferM85784Q2 = m85784Q();
            AbstractC22676k.m65747g(byteBufferM85784Q2);
            return AbstractC37317a.m119538c(byteBufferM85784Q2.getInt(this.epochSecondsOffsetRev2));
        }
        if (i13 != 3) {
            this.logger.mo85222m(AbstractC2875y.m8296i(i13, "Revision ", " is not supported in the app yet for StrapDrivenAlarmSetEventPacket, returning 0"), new AbstractC30556a.a[0]);
            return 0L;
        }
        ByteBuffer byteBufferM85784Q3 = m85784Q();
        AbstractC22676k.m65747g(byteBufferM85784Q3);
        return AbstractC37317a.m119538c(byteBufferM85784Q3.getInt(this.epochSecondsOffsetRev3));
    }

    /* JADX INFO: renamed from: Z */
    private final int m37323Z() {
        int i13 = this.revision;
        if (i13 == 1) {
            ByteBuffer byteBufferM85784Q = m85784Q();
            AbstractC22676k.m65747g(byteBufferM85784Q);
            return AbstractC37317a.m119537b(byteBufferM85784Q.getShort(this.subSecondsOffsetRev1));
        }
        if (i13 == 2) {
            ByteBuffer byteBufferM85784Q2 = m85784Q();
            AbstractC22676k.m65747g(byteBufferM85784Q2);
            return AbstractC37317a.m119537b(byteBufferM85784Q2.getShort(this.subSecondsOffsetRev2));
        }
        if (i13 != 3) {
            return 0;
        }
        ByteBuffer byteBufferM85784Q3 = m85784Q();
        AbstractC22676k.m65747g(byteBufferM85784Q3);
        return AbstractC37317a.m119537b(byteBufferM85784Q3.getShort(this.subSecondsOffsetRev3));
    }

    /* JADX INFO: renamed from: T */
    public final int m37324T() {
        if (this.revision != 3) {
            return 0;
        }
        ByteBuffer byteBufferM85784Q = m85784Q();
        AbstractC22676k.m65747g(byteBufferM85784Q);
        return AbstractC37317a.m119536a(byteBufferM85784Q.get(this.alarmDurationOffsetRev3));
    }

    /* JADX INFO: renamed from: U */
    public final int m37325U() {
        int i13 = this.revision;
        if (i13 == 2) {
            ByteBuffer byteBufferM85784Q = m85784Q();
            AbstractC22676k.m65747g(byteBufferM85784Q);
            return AbstractC37317a.m119536a(byteBufferM85784Q.get(this.alarmIdOffsetRev2));
        }
        if (i13 != 3) {
            this.logger.mo85222m(AbstractC2875y.m8296i(i13, "AlarmId does not exist for Revision ", " in the StrapDrivenAlarmSetEventPacket; returning 0"), new AbstractC30556a.a[0]);
            return 0;
        }
        ByteBuffer byteBufferM85784Q2 = m85784Q();
        AbstractC22676k.m65747g(byteBufferM85784Q2);
        return AbstractC37317a.m119536a(byteBufferM85784Q2.get(this.alarmIdOffsetRev3));
    }

    /* JADX INFO: renamed from: V */
    public final int m37326V() {
        if (this.revision != 3) {
            return 0;
        }
        ByteBuffer byteBufferM85784Q = m85784Q();
        AbstractC22676k.m65747g(byteBufferM85784Q);
        return AbstractC37317a.m119536a(byteBufferM85784Q.get(this.alarmTypeOffsetRev3));
    }

    /* JADX INFO: renamed from: X */
    public final int m37327X() {
        if (this.revision != 3) {
            return 0;
        }
        ByteBuffer byteBufferM85784Q = m85784Q();
        AbstractC22676k.m65747g(byteBufferM85784Q);
        return AbstractC37317a.m119537b(byteBufferM85784Q.getShort(this.loopControlForEffectsOffsetRev3));
    }

    /* JADX INFO: renamed from: Y */
    public final int m37328Y() {
        if (this.revision != 3) {
            return 0;
        }
        ByteBuffer byteBufferM85784Q = m85784Q();
        AbstractC22676k.m65747g(byteBufferM85784Q);
        return AbstractC37317a.m119536a(byteBufferM85784Q.get(this.overallWaveformLoopControlOffsetRev3));
    }

    /* JADX INFO: renamed from: a0 */
    public final long m37329a0() {
        try {
            return AbstractC12889b.m36259Y(((((double) m37323Z()) * 1000.0d) / 32768.0d) + (m37322W() * 1000.0d));
        } catch (NullPointerException e5) {
            this.logger.mo85222m("Caught a NPE when trying to parse StrapDrivenAlarmSetEventPacket: " + e5, new AbstractC30556a.a[0]);
            return 0L;
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final List<Integer> m37330b0() {
        if (this.revision != 3) {
            return C25271y.f99162w;
        }
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < 8; i13++) {
            ByteBuffer byteBufferM85784Q = m85784Q();
            AbstractC22676k.m65747g(byteBufferM85784Q);
            arrayList.add(Integer.valueOf(AbstractC37317a.m119536a(byteBufferM85784Q.get(this.waveformEffectsOffsetRev3 + i13))));
        }
        return arrayList;
    }

    @Override // ot0.C28323a, lt0.AbstractC24726c
    public String toString() {
        C13274b0 c13274b0 = this;
        try {
            int i13 = c13274b0.revision;
            if (i13 == 1) {
                return "Strap Driven Alarm Set Event | Revision: " + i13 + " | Time: " + AbstractC28209v1.m85388b(m37329a0()) + " | Epoch Seconds: " + m37322W() + " | Sub Seconds: " + m37323Z();
            }
            if (i13 == 2) {
                return "Strap Driven Alarm Set Event | Revision: " + i13 + " | AlarmId: " + m37325U() + " | Time: " + AbstractC28209v1.m85388b(m37329a0()) + " | Epoch Seconds: " + m37322W() + " | Sub Seconds: " + m37323Z();
            }
            if (i13 != 3) {
                try {
                    return super.toString();
                } catch (Exception e5) {
                    e = e5;
                    c13274b0.logger.mo85222m(AbstractC2875y.m8297j(e, "Caught an exception when trying to parse StrapDrivenAlarmSetEventPacket: "), new AbstractC30556a.a[0]);
                    return super.toString();
                }
            }
            return "Strap Driven Alarm Set Event | Revision: " + i13 + " | AlarmId: " + c13274b0.m37325U() + " | Time: " + AbstractC28209v1.m85388b(c13274b0.m37329a0()) + " | Epoch Seconds: " + c13274b0.m37322W() + " | Sub Seconds: " + c13274b0.m37323Z() + " | Waveform Effects: " + c13274b0.m37330b0() + " | Loop Control: " + c13274b0.m37327X() + " | Overall Loop: " + c13274b0.m37328Y() + " | Duration: " + c13274b0.m37324T() + " | Type: " + m37326V();
        } catch (Exception e13) {
            e = e13;
            c13274b0 = this;
        }
    }
}
