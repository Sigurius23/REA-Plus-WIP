package j53;

import io.getstream.chat.android.models.querysort.C19467a;
import j43.C21317a;
import java.util.Comparator;
import java.util.Map;
import p087db.C11858k0;
import p705ea2.C12915l;
import p715kotlin.jvm.internal.AbstractC22676k;
import stream.video.sfu.models.ParticipantSource;

/* JADX INFO: renamed from: j53.g */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC21349g {

    /* JADX INFO: renamed from: a */
    public static final C12915l f81666a = new C12915l(new C21317a(new ParticipantSource[]{ParticipantSource.PARTICIPANT_SOURCE_RTMP, ParticipantSource.PARTICIPANT_SOURCE_WHIP, ParticipantSource.PARTICIPANT_SOURCE_SRT, ParticipantSource.PARTICIPANT_SOURCE_RTSP}, 1), 7);

    /* JADX INFO: renamed from: a */
    public static final Comparator m59950a(InterfaceC21348f interfaceC21348f, Map pins) {
        C21343a c21343a = C21343a.f81654y;
        AbstractC22676k.m65750j(interfaceC21348f, "<this>");
        AbstractC22676k.m65750j(pins, "pins");
        C21345c c21345c = C21345c.f81663a;
        boolean zEquals = interfaceC21348f.equals(c21345c);
        int i13 = 8;
        int i14 = 6;
        C11858k0 c11858k0 = AbstractC21344b.f81658c;
        C11858k0 c11858k1 = AbstractC21344b.f81662g;
        C11858k0 c11858k2 = AbstractC21344b.f81660e;
        C11858k0 c11858k3 = AbstractC21344b.f81659d;
        C12915l c12915l = f81666a;
        C11858k0 c11858k4 = AbstractC21344b.f81661f;
        C11858k0 c11858k5 = AbstractC21344b.f81657b;
        C11858k0 c11858k6 = AbstractC21344b.f81656a;
        if (zEquals) {
            return new C12915l(new Comparator[]{c11858k0, new C12915l(pins, i13), new C19467a(c21343a, new C12915l(new Comparator[]{c11858k6, c11858k5, c11858k4, c12915l, c11858k3, c11858k2}, i14)), new C19467a(c21343a, c11858k1)}, i14);
        }
        if (!interfaceC21348f.equals(C21347e.f81665a)) {
            return interfaceC21348f.equals(C21346d.f81664a) ? new C12915l(new Comparator[]{new C19467a(c21343a, new C12915l(new Comparator[]{c11858k6, c11858k5, c11858k4, c12915l, c11858k3, c11858k2}, i14)), new C12915l(new String[]{"admin", "host", "speaker"}, 9), new C19467a(c21343a, c11858k1)}, i14) : m59950a(c21345c, pins);
        }
        C12915l c12915l2 = new C12915l(pins, i13);
        C12915l c12915l3 = new C12915l(new Comparator[]{c11858k5, c11858k4, c12915l, c11858k3, c11858k2}, i14);
        C21343a c21343a2 = C21343a.f81653x;
        return new C12915l(new Comparator[]{c11858k0, c12915l2, c11858k6, new C19467a(c21343a2, c12915l3), new C19467a(c21343a2, c11858k1)}, i14);
    }
}
