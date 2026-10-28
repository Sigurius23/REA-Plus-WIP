package cj1;

import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: cj1.r */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010Jj\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b!\u0010'R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010\u0014R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b(\u0010\u0014R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b,\u0010.\u001a\u0004\b*\u0010/¨\u00060"}, m65681d2 = {"Lcj1/r;", "Lm91/u;", "", "cardName", "title", "Lgz0/m0;", "endIcon", "Lcj1/o;", "bodyContent", "tag", "Lcj1/p;", "footer", "cta", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcj1/o;Ljava/lang/String;Lcj1/p;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcj1/o;Ljava/lang/String;Lcj1/p;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcj1/r;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCardName", "b", "j", "c", "Lgz0/m0;", "g", "()Lgz0/m0;", "d", "Lcj1/o;", "()Lcj1/o;", "e", "i", "f", "Lcj1/p;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcj1/p;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4762r implements InterfaceC25312u {

    /* JADX INFO: renamed from: i */
    public static final int f19625i = C9598e.f28134d | AbstractC22403o.f87638a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String cardName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC16313m0 endIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C4759o bodyContent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String tag;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C4760p footer;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String cta;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C9598e destination;

    public C4762r(String cardName, String title, EnumC16313m0 enumC16313m0, C4759o bodyContent, String str, C4760p c4760p, String str2, C9598e c9598e) {
        AbstractC22676k.m65750j(cardName, "cardName");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(bodyContent, "bodyContent");
        this.cardName = cardName;
        this.title = title;
        this.endIcon = enumC16313m0;
        this.bodyContent = bodyContent;
        this.tag = str;
        this.footer = c4760p;
        this.cta = str2;
        this.destination = c9598e;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C4762r m15006b(C4762r c4762r, String str, String str2, EnumC16313m0 enumC16313m0, C4759o c4759o, String str3, C4760p c4760p, String str4, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c4762r.cardName;
        }
        if ((i13 & 2) != 0) {
            str2 = c4762r.title;
        }
        if ((i13 & 4) != 0) {
            enumC16313m0 = c4762r.endIcon;
        }
        if ((i13 & 8) != 0) {
            c4759o = c4762r.bodyContent;
        }
        if ((i13 & 16) != 0) {
            str3 = c4762r.tag;
        }
        if ((i13 & 32) != 0) {
            c4760p = c4762r.footer;
        }
        if ((i13 & 64) != 0) {
            str4 = c4762r.cta;
        }
        if ((i13 & 128) != 0) {
            c9598e = c4762r.destination;
        }
        String str5 = str4;
        C9598e c9598e2 = c9598e;
        String str6 = str3;
        C4760p c4760p2 = c4760p;
        return c4762r.m15007a(str, str2, enumC16313m0, c4759o, str6, c4760p2, str5, c9598e2);
    }

    /* JADX INFO: renamed from: a */
    public final C4762r m15007a(String cardName, String title, EnumC16313m0 endIcon, C4759o bodyContent, String tag, C4760p footer, String cta, C9598e destination) {
        AbstractC22676k.m65750j(cardName, "cardName");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(bodyContent, "bodyContent");
        return new C4762r(cardName, title, endIcon, bodyContent, tag, footer, cta, destination);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C4759o getBodyContent() {
        return this.bodyContent;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCta() {
        return this.cta;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4762r)) {
            return false;
        }
        C4762r c4762r = (C4762r) other;
        return AbstractC22676k.m65745e(this.cardName, c4762r.cardName) && AbstractC22676k.m65745e(this.title, c4762r.title) && this.endIcon == c4762r.endIcon && AbstractC22676k.m65745e(this.bodyContent, c4762r.bodyContent) && AbstractC22676k.m65745e(this.tag, c4762r.tag) && AbstractC22676k.m65745e(this.footer, c4762r.footer) && AbstractC22676k.m65745e(this.cta, c4762r.cta) && AbstractC22676k.m65745e(this.destination, c4762r.destination);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final EnumC16313m0 getEndIcon() {
        return this.endIcon;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C4760p getFooter() {
        return this.footer;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.cardName.hashCode() * 31, 31, this.title);
        EnumC16313m0 enumC16313m0 = this.endIcon;
        int iHashCode = (this.bodyContent.hashCode() + ((iM30450d + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31)) * 31;
        String str = this.tag;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C4760p c4760p = this.footer;
        int iHashCode3 = (iHashCode2 + (c4760p == null ? 0 : c4760p.hashCode())) * 31;
        String str2 = this.cta;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C9598e c9598e = this.destination;
        return iHashCode4 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public String toString() {
        String str = this.cardName;
        String str2 = this.title;
        EnumC16313m0 enumC16313m0 = this.endIcon;
        C4759o c4759o = this.bodyContent;
        String str3 = this.tag;
        C4760p c4760p = this.footer;
        String str4 = this.cta;
        C9598e c9598e = this.destination;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HorizontalRecordsTileViewState(cardName=", str, ", title=", str2, ", endIcon=");
        sbM32001t.append(enumC16313m0);
        sbM32001t.append(", bodyContent=");
        sbM32001t.append(c4759o);
        sbM32001t.append(", tag=");
        sbM32001t.append(str3);
        sbM32001t.append(", footer=");
        sbM32001t.append(c4760p);
        sbM32001t.append(", cta=");
        return AbstractC13673n.m38563j(sbM32001t, str4, ", destination=", c9598e, ")");
    }

    public /* synthetic */ C4762r(String str, String str2, EnumC16313m0 enumC16313m0, C4759o c4759o, String str3, C4760p c4760p, String str4, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? null : enumC16313m0, (i13 & 8) != 0 ? new C4759o(null, null, null, 7, null) : c4759o, (i13 & 16) != 0 ? null : str3, (i13 & 32) != 0 ? null : c4760p, (i13 & 64) != 0 ? null : str4, (i13 & 128) != 0 ? null : c9598e);
    }
}
