package rk2;

import ad3.AbstractC0757c;
import com.whoop.addactivity.network.CreateActivityPauseSegment;
import java.util.List;
import kotlinx.serialization.SerializationException;
import p715kotlin.Metadata;
import u82.AbstractC34650k;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: rk2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011¨\u0006\u0013"}, m65681d2 = {"Lrk2/a;", "", "<init>", "()V", "", "Lcom/whoop/addactivity/network/CreateActivityPauseSegment;", "segments", "", "b", "(Ljava/util/List;)Ljava/lang/String;", "value", "a", "(Ljava/lang/String;)Ljava/util/List;", "Lad3/c;", "Lad3/c;", "json", "Lwc3/c;", "Lwc3/c;", "serializer", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31497a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC0757c json = AbstractC34650k.m109496c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC37138c serializer = AbstractC38195a.m122333a(CreateActivityPauseSegment.INSTANCE.serializer());

    /* JADX INFO: renamed from: a */
    public final List<CreateActivityPauseSegment> m97038a(String value) {
        if (value != null && !AbstractC39414r.m125890i0(value)) {
            try {
                Object objM1831b = this.json.m1831b(this.serializer, value);
                if (((List) objM1831b).isEmpty()) {
                    objM1831b = null;
                }
                return (List) objM1831b;
            } catch (SerializationException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final String m97039b(List<CreateActivityPauseSegment> segments) {
        List<CreateActivityPauseSegment> list = segments;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.json.m1833d(this.serializer, segments);
    }
}
