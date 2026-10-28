package l31;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.service.network.model.UserSessionDto;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.UUID;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r41.AbstractC30925i;

/* JADX INFO: renamed from: l31.n */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0002\"\u0014\u0010\t\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0002\"\u0014\u0010\u000b\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0002\"\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\b\u0010\u000f\"\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0001\u0010\u0014\"\u0017\u0010\u001a\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0006\u0010\u0019\"\u0017\u0010\u001c\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u0004\u0010\u0019\"\u0017\u0010!\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\n\u0010 \"\u0017\u0010'\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "a", "Lcom/whoop/design/util/TextResource;", "sampleSetNumberText", "b", "sampleRepsText", "c", "sampleTimeText", "d", "sampleTimeText2", "e", "sampleWeightText", "Lr41/i$d;", "f", "Lr41/i$d;", "()Lr41/i$d;", "sampleWeightliftingSetEdit", "Lr41/i$a;", "g", "Lr41/i$a;", "()Lr41/i$a;", "sampleWeightliftingSetCompleted", "Lr41/i$c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lr41/i$c;", "()Lr41/i$c;", "sampleWeightliftingSetCurrentRest", "i", "sampleWeightliftingSetCurrentActive", "Lr41/i$e;", "j", "Lr41/i$e;", "()Lr41/i$e;", "sampleWeightliftingSetInProgress", "Lr41/i$b;", "k", "Lr41/i$b;", "getSampleWeightliftingSetCompleteUndoable", "()Lr41/i$b;", "sampleWeightliftingSetCompleteUndoable", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23320n {

    /* JADX INFO: renamed from: a */
    private static final TextResource f92448a;

    /* JADX INFO: renamed from: b */
    private static final TextResource f92449b;

    /* JADX INFO: renamed from: c */
    private static final TextResource f92450c;

    /* JADX INFO: renamed from: d */
    private static final TextResource f92451d;

    /* JADX INFO: renamed from: e */
    private static final TextResource f92452e;

    /* JADX INFO: renamed from: f */
    private static final AbstractC30925i.d f92453f;

    /* JADX INFO: renamed from: g */
    private static final AbstractC30925i.a f92454g;

    /* JADX INFO: renamed from: h */
    private static final AbstractC30925i.c f92455h;

    /* JADX INFO: renamed from: i */
    private static final AbstractC30925i.c f92456i;

    /* JADX INFO: renamed from: j */
    private static final AbstractC30925i.e f92457j;

    /* JADX INFO: renamed from: k */
    private static final AbstractC30925i.b f92458k;

    static {
        TextResource textResourceM21278l = AbstractC8693b.m21278l(UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE);
        f92448a = textResourceM21278l;
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("6");
        f92449b = textResourceM21278l2;
        TextResource textResourceM21267a = AbstractC8693b.m21267a();
        f92450c = textResourceM21267a;
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l("1530");
        f92451d = textResourceM21278l3;
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l("135");
        f92452e = textResourceM21278l4;
        UUID uuidRandomUUID = UUID.randomUUID();
        AbstractC22676k.m65749i(uuidRandomUUID, "randomUUID(...)");
        f92453f = new AbstractC30925i.d(uuidRandomUUID, 0, textResourceM21278l, textResourceM21278l2, null, false, textResourceM21278l4, 0, null, 432, null);
        UUID uuidRandomUUID2 = UUID.randomUUID();
        AbstractC22676k.m65749i(uuidRandomUUID2, "randomUUID(...)");
        f92454g = new AbstractC30925i.a(uuidRandomUUID2, 0, textResourceM21278l, textResourceM21278l2, null, false, textResourceM21278l4, 0, 176, null);
        UUID uuidRandomUUID3 = UUID.randomUUID();
        AbstractC22676k.m65749i(uuidRandomUUID3, "randomUUID(...)");
        f92455h = new AbstractC30925i.c(uuidRandomUUID3, 0, textResourceM21278l, textResourceM21278l2, textResourceM21267a, true, textResourceM21278l4, 0, null, false, 0, null, null, null, false, 32128, null);
        UUID uuidRandomUUID4 = UUID.randomUUID();
        AbstractC22676k.m65749i(uuidRandomUUID4, "randomUUID(...)");
        f92456i = new AbstractC30925i.c(uuidRandomUUID4, 0, textResourceM21278l, textResourceM21278l2, null, false, textResourceM21278l4, 0, null, true, 0, null, null, null, false, 32176, null);
        UUID uuidRandomUUID5 = UUID.randomUUID();
        AbstractC22676k.m65749i(uuidRandomUUID5, "randomUUID(...)");
        f92457j = new AbstractC30925i.e(uuidRandomUUID5, 0, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, true, textResourceM21278l4, 0, null, false, 0, null, null, null, false, 32640, null);
        UUID uuidRandomUUID6 = UUID.randomUUID();
        AbstractC22676k.m65749i(uuidRandomUUID6, "randomUUID(...)");
        f92458k = new AbstractC30925i.b(uuidRandomUUID6, 0, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, true, textResourceM21278l4, 0, false, null, 0, 0, null, null, null, false, false, 130944, null);
    }

    /* JADX INFO: renamed from: a */
    public static final AbstractC30925i.a m67512a() {
        return f92454g;
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC30925i.c m67513b() {
        return f92456i;
    }

    /* JADX INFO: renamed from: c */
    public static final AbstractC30925i.c m67514c() {
        return f92455h;
    }

    /* JADX INFO: renamed from: d */
    public static final AbstractC30925i.d m67515d() {
        return f92453f;
    }

    /* JADX INFO: renamed from: e */
    public static final AbstractC30925i.e m67516e() {
        return f92457j;
    }
}
