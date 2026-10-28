package mk2;

import com.whoop.activitysession.PauseSegment;
import ec3.InterfaceC13058l;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: mk2.u */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001JP\u0010\u000e\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0002H¦@¢\u0006\u0004\b\u000e\u0010\u000fJ`\u0010\u0014\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0002H¦@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H&¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0016H¦@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0002H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001cH&¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u0002H&¢\u0006\u0004\b!\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006$À\u0006\u0003"}, m65681d2 = {"Lmk2/u;", "", "Lec3/l;", "Lmk2/w;", "sessionUpdateFlow", "", "gpsTrackingEnabled", "", "sessionStartTimeMs", "", "activityInternalName", "enableHeartRateStream", "Lcom/whoop/trackactivity/domain/models/SessionTargets;", "targetsFlow", "c", "(Lec3/l;ZJLjava/lang/String;ZLec3/l;Lq83/d;)Ljava/lang/Object;", "startTimeMs", "", "Lcom/whoop/activitysession/PauseSegment;", "pauseSegments", "b", "(Lec3/l;ZJLjava/lang/String;Ljava/util/List;ZLec3/l;Lq83/d;)Ljava/lang/Object;", "Ll83/a0;", "pause", "()V", "resume", "a", "(Lq83/d;)Ljava/lang/Object;", "Lmk2/l;", "f", "()Lec3/l;", "d", "()Lmk2/l;", "e", "isRunning", "()Z", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC25654u {
    /* JADX INFO: renamed from: a */
    Object mo75542a(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: b */
    Object mo75543b(InterfaceC13058l interfaceC13058l, boolean z4, long j7, String str, List<PauseSegment> list, boolean z13, InterfaceC13058l interfaceC13058l2, InterfaceC30057d<? super Boolean> interfaceC30057d);

    /* JADX INFO: renamed from: c */
    Object mo75544c(InterfaceC13058l interfaceC13058l, boolean z4, long j7, String str, boolean z13, InterfaceC13058l interfaceC13058l2, InterfaceC30057d<? super Boolean> interfaceC30057d);

    /* JADX INFO: renamed from: d */
    C25645l mo75545d();

    /* JADX INFO: renamed from: e */
    InterfaceC13058l mo75546e();

    /* JADX INFO: renamed from: f */
    InterfaceC13058l mo75547f();

    boolean isRunning();

    void pause();

    void resume();
}
