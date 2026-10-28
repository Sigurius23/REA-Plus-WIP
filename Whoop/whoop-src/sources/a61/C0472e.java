package a61;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import k71.C22259p;
import k71.EnumC22244c;
import l83.C23454a0;
import p01.C28582b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import x11.C37829c;

/* JADX INFO: renamed from: a61.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0088\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u00103R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b0\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b6\u0010;\u001a\u0004\b/\u0010<R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b9\u0010=\u001a\u0004\b4\u0010>¨\u0006?"}, m65681d2 = {"La61/e;", "Lm91/u;", "", NotificationCompat.CATEGORY_EVENT, "Ly81/f;", "backgroundColor", "Lcom/whoop/design/util/TextResource;", "title", "subText", "footerText", "Lk71/c;", "checkmarkStyle", "Lk71/p;", "planProgressStatusState", "", "La61/f;", "progressMetadata", "Lx11/c;", "cardCtaState", "Lp01/b;", "circularProgress", "<init>", "(Ljava/lang/Object;Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk71/c;Lk71/p;Ljava/util/List;Lx11/c;Lp01/b;)V", "a", "(Ljava/lang/Object;Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk71/c;Lk71/p;Ljava/util/List;Lx11/c;Lp01/b;)La61/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getEvent", "()Ljava/lang/Object;", "b", "Ly81/f;", "c", "()Ly81/f;", "Lcom/whoop/design/util/TextResource;", "l", "()Lcom/whoop/design/util/TextResource;", "d", "k", "e", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "f", "Lk71/c;", "()Lk71/c;", "g", "Lk71/p;", "i", "()Lk71/p;", "Ljava/util/List;", "j", "()Ljava/util/List;", "Lx11/c;", "()Lx11/c;", "Lp01/b;", "()Lp01/b;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C0472e implements InterfaceC25312u {

    /* JADX INFO: renamed from: k */
    public static final int f1599k = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object event;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC39333f backgroundColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource subText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource footerText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC22244c checkmarkStyle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C22259p planProgressStatusState;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final List<C0473f> progressMetadata;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C37829c cardCtaState;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C28582b circularProgress;

    public C0472e(Object event, EnumC39333f backgroundColor, TextResource title, TextResource textResource, TextResource textResource2, EnumC22244c enumC22244c, C22259p c22259p, List<C0473f> list, C37829c c37829c, C28582b c28582b) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(backgroundColor, "backgroundColor");
        AbstractC22676k.m65750j(title, "title");
        this.event = event;
        this.backgroundColor = backgroundColor;
        this.title = title;
        this.subText = textResource;
        this.footerText = textResource2;
        this.checkmarkStyle = enumC22244c;
        this.planProgressStatusState = c22259p;
        this.progressMetadata = list;
        this.cardCtaState = c37829c;
        this.circularProgress = c28582b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C0472e m1178b(C0472e c0472e, Object obj, EnumC39333f enumC39333f, TextResource textResource, TextResource textResource2, TextResource textResource3, EnumC22244c enumC22244c, C22259p c22259p, List list, C37829c c37829c, C28582b c28582b, int i13, Object obj2) {
        if ((i13 & 1) != 0) {
            obj = c0472e.event;
        }
        if ((i13 & 2) != 0) {
            enumC39333f = c0472e.backgroundColor;
        }
        if ((i13 & 4) != 0) {
            textResource = c0472e.title;
        }
        if ((i13 & 8) != 0) {
            textResource2 = c0472e.subText;
        }
        if ((i13 & 16) != 0) {
            textResource3 = c0472e.footerText;
        }
        if ((i13 & 32) != 0) {
            enumC22244c = c0472e.checkmarkStyle;
        }
        if ((i13 & 64) != 0) {
            c22259p = c0472e.planProgressStatusState;
        }
        if ((i13 & 128) != 0) {
            list = c0472e.progressMetadata;
        }
        if ((i13 & 256) != 0) {
            c37829c = c0472e.cardCtaState;
        }
        if ((i13 & 512) != 0) {
            c28582b = c0472e.circularProgress;
        }
        C37829c c37829c2 = c37829c;
        C28582b c28582b2 = c28582b;
        C22259p c22259p2 = c22259p;
        List list2 = list;
        TextResource textResource4 = textResource3;
        EnumC22244c enumC22244c2 = enumC22244c;
        return c0472e.m1179a(obj, enumC39333f, textResource, textResource2, textResource4, enumC22244c2, c22259p2, list2, c37829c2, c28582b2);
    }

    /* JADX INFO: renamed from: a */
    public final C0472e m1179a(Object event, EnumC39333f backgroundColor, TextResource title, TextResource subText, TextResource footerText, EnumC22244c checkmarkStyle, C22259p planProgressStatusState, List<C0473f> progressMetadata, C37829c cardCtaState, C28582b circularProgress) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(backgroundColor, "backgroundColor");
        AbstractC22676k.m65750j(title, "title");
        return new C0472e(event, backgroundColor, title, subText, footerText, checkmarkStyle, planProgressStatusState, progressMetadata, cardCtaState, circularProgress);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC39333f getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C37829c getCardCtaState() {
        return this.cardCtaState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0472e)) {
            return false;
        }
        C0472e c0472e = (C0472e) other;
        return AbstractC22676k.m65745e(this.event, c0472e.event) && this.backgroundColor == c0472e.backgroundColor && AbstractC22676k.m65745e(this.title, c0472e.title) && AbstractC22676k.m65745e(this.subText, c0472e.subText) && AbstractC22676k.m65745e(this.footerText, c0472e.footerText) && this.checkmarkStyle == c0472e.checkmarkStyle && AbstractC22676k.m65745e(this.planProgressStatusState, c0472e.planProgressStatusState) && AbstractC22676k.m65745e(this.progressMetadata, c0472e.progressMetadata) && AbstractC22676k.m65745e(this.cardCtaState, c0472e.cardCtaState) && AbstractC22676k.m65745e(this.circularProgress, c0472e.circularProgress);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC22244c getCheckmarkStyle() {
        return this.checkmarkStyle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C28582b getCircularProgress() {
        return this.circularProgress;
    }

    @Override // p720m91.InterfaceC25312u
    /* JADX INFO: renamed from: getEvent, reason: from getter */
    public Object getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String() {
        return this.event;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getFooterText() {
        return this.footerText;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC21702c.m61132c(this.backgroundColor, this.event.hashCode() * 31, 31), this.title, 31);
        TextResource textResource = this.subText;
        int iHashCode = (iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TextResource textResource2 = this.footerText;
        int iHashCode2 = (iHashCode + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        EnumC22244c enumC22244c = this.checkmarkStyle;
        int iHashCode3 = (iHashCode2 + (enumC22244c == null ? 0 : enumC22244c.hashCode())) * 31;
        C22259p c22259p = this.planProgressStatusState;
        int iHashCode4 = (iHashCode3 + (c22259p == null ? 0 : c22259p.hashCode())) * 31;
        List<C0473f> list = this.progressMetadata;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        C37829c c37829c = this.cardCtaState;
        int iHashCode6 = (iHashCode5 + (c37829c == null ? 0 : c37829c.hashCode())) * 31;
        C28582b c28582b = this.circularProgress;
        return iHashCode6 + (c28582b != null ? c28582b.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C22259p getPlanProgressStatusState() {
        return this.planProgressStatusState;
    }

    /* JADX INFO: renamed from: j */
    public final List<C0473f> m1186j() {
        return this.progressMetadata;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final TextResource getSubText() {
        return this.subText;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public String toString() {
        Object obj = this.event;
        EnumC39333f enumC39333f = this.backgroundColor;
        TextResource textResource = this.title;
        TextResource textResource2 = this.subText;
        TextResource textResource3 = this.footerText;
        EnumC22244c enumC22244c = this.checkmarkStyle;
        C22259p c22259p = this.planProgressStatusState;
        List<C0473f> list = this.progressMetadata;
        C37829c c37829c = this.cardCtaState;
        C28582b c28582b = this.circularProgress;
        StringBuilder sb4 = new StringBuilder("GoalProgressCardState(event=");
        sb4.append(obj);
        sb4.append(", backgroundColor=");
        sb4.append(enumC39333f);
        sb4.append(", title=");
        AbstractC30007c.m91855y(sb4, textResource, ", subText=", textResource2, ", footerText=");
        sb4.append(textResource3);
        sb4.append(", checkmarkStyle=");
        sb4.append(enumC22244c);
        sb4.append(", planProgressStatusState=");
        sb4.append(c22259p);
        sb4.append(", progressMetadata=");
        sb4.append(list);
        sb4.append(", cardCtaState=");
        sb4.append(c37829c);
        sb4.append(", circularProgress=");
        sb4.append(c28582b);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C0472e(Object obj, EnumC39333f enumC39333f, TextResource textResource, TextResource textResource2, TextResource textResource3, EnumC22244c enumC22244c, C22259p c22259p, List list, C37829c c37829c, C28582b c28582b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C23454a0.f92919a : obj, (i13 & 2) != 0 ? EnumC39333f.WHITE_5 : enumC39333f, textResource, (i13 & 8) != 0 ? null : textResource2, (i13 & 16) != 0 ? null : textResource3, (i13 & 32) != 0 ? null : enumC22244c, (i13 & 64) != 0 ? null : c22259p, (i13 & 128) != 0 ? null : list, (i13 & 256) != 0 ? null : c37829c, (i13 & 512) != 0 ? null : c28582b);
    }
}
