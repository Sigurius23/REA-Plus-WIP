package wr0;

import b91.C2886a;
import com.whoop.communitymoments.domain.models.MomentCardFillMode;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.GenericInteraction;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25305n;

/* JADX INFO: renamed from: wr0.b0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013Jl\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b!\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b,\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b$\u00101\u001a\u0004\b&\u00102R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u00105R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b(\u00106\u001a\u0004\b7\u00108¨\u00069"}, m65681d2 = {"Lwr0/b0;", "Lm91/n;", "", "id", "Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;", "fillMode", "Lkd1/o;", "image", "Lwr0/v;", "dateBadge", "Lwr0/a0;", "profile", "Lwr0/u;", "badge", "Lwr0/w;", "footer", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "<init>", "(Ljava/lang/String;Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;Lkd1/o;Lwr0/v;Lwr0/a0;Lwr0/u;Lwr0/w;Lcom/whoop/navigation/models/GenericInteraction;)V", "a", "(Ljava/lang/String;Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;Lkd1/o;Lwr0/v;Lwr0/a0;Lwr0/u;Lwr0/w;Lcom/whoop/navigation/models/GenericInteraction;)Lwr0/b0;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", "Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;", "f", "()Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;", "c", "Lkd1/o;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lkd1/o;", "d", "Lwr0/v;", "e", "()Lwr0/v;", "Lwr0/a0;", "j", "()Lwr0/a0;", "Lwr0/u;", "()Lwr0/u;", "g", "Lwr0/w;", "()Lwr0/w;", "Lcom/whoop/navigation/models/GenericInteraction;", "i", "()Lcom/whoop/navigation/models/GenericInteraction;", "community-moments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37519b0 implements InterfaceC25305n<String> {

    /* JADX INFO: renamed from: i */
    public static final int f160454i;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final MomentCardFillMode fillMode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C37558v dateBadge;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C37517a0 profile;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C37556u badge;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C37560w footer;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final GenericInteraction interaction;

    static {
        int i13 = GenericInteraction.$stable;
        int i14 = C2886a.f11498d;
        int i15 = TextResource.$stable;
        int i16 = AbstractC22403o.f87638a;
        f160454i = i13 | i14 | i13 | i14 | i15 | i15 | i16 | i15 | i16 | i15 | i15 | i15 | i15 | i16;
    }

    public C37519b0(String id4, MomentCardFillMode fillMode, AbstractC22403o abstractC22403o, C37558v c37558v, C37517a0 c37517a0, C37556u c37556u, C37560w c37560w, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(fillMode, "fillMode");
        this.id = id4;
        this.fillMode = fillMode;
        this.image = abstractC22403o;
        this.dateBadge = c37558v;
        this.profile = c37517a0;
        this.badge = c37556u;
        this.footer = c37560w;
        this.interaction = genericInteraction;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C37519b0 m120301b(C37519b0 c37519b0, String str, MomentCardFillMode momentCardFillMode, AbstractC22403o abstractC22403o, C37558v c37558v, C37517a0 c37517a0, C37556u c37556u, C37560w c37560w, GenericInteraction genericInteraction, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c37519b0.id;
        }
        if ((i13 & 2) != 0) {
            momentCardFillMode = c37519b0.fillMode;
        }
        if ((i13 & 4) != 0) {
            abstractC22403o = c37519b0.image;
        }
        if ((i13 & 8) != 0) {
            c37558v = c37519b0.dateBadge;
        }
        if ((i13 & 16) != 0) {
            c37517a0 = c37519b0.profile;
        }
        if ((i13 & 32) != 0) {
            c37556u = c37519b0.badge;
        }
        if ((i13 & 64) != 0) {
            c37560w = c37519b0.footer;
        }
        if ((i13 & 128) != 0) {
            genericInteraction = c37519b0.interaction;
        }
        C37560w c37560w2 = c37560w;
        GenericInteraction genericInteraction2 = genericInteraction;
        C37517a0 c37517a1 = c37517a0;
        C37556u c37556u2 = c37556u;
        return c37519b0.m120302a(str, momentCardFillMode, abstractC22403o, c37558v, c37517a1, c37556u2, c37560w2, genericInteraction2);
    }

    /* JADX INFO: renamed from: a */
    public final C37519b0 m120302a(String id4, MomentCardFillMode fillMode, AbstractC22403o image, C37558v dateBadge, C37517a0 profile, C37556u badge, C37560w footer, GenericInteraction interaction) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(fillMode, "fillMode");
        return new C37519b0(id4, fillMode, image, dateBadge, profile, badge, footer, interaction);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C37556u getBadge() {
        return this.badge;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C37558v getDateBadge() {
        return this.dateBadge;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37519b0)) {
            return false;
        }
        C37519b0 c37519b0 = (C37519b0) other;
        return AbstractC22676k.m65745e(this.id, c37519b0.id) && this.fillMode == c37519b0.fillMode && AbstractC22676k.m65745e(this.image, c37519b0.image) && AbstractC22676k.m65745e(this.dateBadge, c37519b0.dateBadge) && AbstractC22676k.m65745e(this.profile, c37519b0.profile) && AbstractC22676k.m65745e(this.badge, c37519b0.badge) && AbstractC22676k.m65745e(this.footer, c37519b0.footer) && AbstractC22676k.m65745e(this.interaction, c37519b0.interaction);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final MomentCardFillMode getFillMode() {
        return this.fillMode;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C37560w getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    public int hashCode() {
        int iHashCode = (this.fillMode.hashCode() + (this.id.hashCode() * 31)) * 31;
        AbstractC22403o abstractC22403o = this.image;
        int iHashCode2 = (iHashCode + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31;
        C37558v c37558v = this.dateBadge;
        int iHashCode3 = (iHashCode2 + (c37558v == null ? 0 : c37558v.hashCode())) * 31;
        C37517a0 c37517a0 = this.profile;
        int iHashCode4 = (iHashCode3 + (c37517a0 == null ? 0 : c37517a0.hashCode())) * 31;
        C37556u c37556u = this.badge;
        int iHashCode5 = (iHashCode4 + (c37556u == null ? 0 : c37556u.hashCode())) * 31;
        C37560w c37560w = this.footer;
        int iHashCode6 = (iHashCode5 + (c37560w == null ? 0 : c37560w.hashCode())) * 31;
        GenericInteraction genericInteraction = this.interaction;
        return iHashCode6 + (genericInteraction != null ? genericInteraction.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C37517a0 getProfile() {
        return this.profile;
    }

    public String toString() {
        return "MomentCardState(id=" + this.id + ", fillMode=" + this.fillMode + ", image=" + this.image + ", dateBadge=" + this.dateBadge + ", profile=" + this.profile + ", badge=" + this.badge + ", footer=" + this.footer + ", interaction=" + this.interaction + ")";
    }

    @Override // p720m91.InterfaceC25305n
    public String getId() {
        return this.id;
    }
}
