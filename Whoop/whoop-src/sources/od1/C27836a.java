package od1;

import com.whoop.addactivity.network.model.ScoreType;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wr2.InterfaceC37576d;
import yb3.C39412p;

/* JADX INFO: renamed from: od1.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001e\u0010\u000b¨\u0006 "}, m65681d2 = {"Lod1/a;", "Lwr2/d;", "", "internalName", "displayName", "iconUrl", "Lcom/whoop/addactivity/network/model/ScoreType;", "scoreType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/addactivity/network/model/ScoreType;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "g", "b", "d", "c", "f", "Lcom/whoop/addactivity/network/model/ScoreType;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/addactivity/network/model/ScoreType;", "e", "userFacingText", "select-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27836a implements InterfaceC37576d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String internalName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String displayName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String iconUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ScoreType scoreType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String userFacingText;

    public C27836a(String internalName, String displayName, String iconUrl, ScoreType scoreType) {
        AbstractC22676k.m65750j(internalName, "internalName");
        AbstractC22676k.m65750j(displayName, "displayName");
        AbstractC22676k.m65750j(iconUrl, "iconUrl");
        AbstractC22676k.m65750j(scoreType, "scoreType");
        this.internalName = internalName;
        this.displayName = displayName;
        this.iconUrl = iconUrl;
        this.scoreType = scoreType;
        this.userFacingText = displayName;
    }

    @Override // wr2.InterfaceC37576d
    /* JADX INFO: renamed from: a */
    public /* bridge */ C39412p getSearchQueryDelimiter() {
        return super.getSearchQueryDelimiter();
    }

    @Override // wr2.InterfaceC37576d
    /* JADX INFO: renamed from: b */
    public /* bridge */ List<String> mo30154b() {
        return super.mo30154b();
    }

    @Override // wr2.InterfaceC37576d
    /* JADX INFO: renamed from: c */
    public /* bridge */ Iterable<String> mo30155c() {
        return super.mo30155c();
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @Override // wr2.InterfaceC37576d
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getUserFacingText() {
        return this.userFacingText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27836a)) {
            return false;
        }
        C27836a c27836a = (C27836a) other;
        return AbstractC22676k.m65745e(this.internalName, c27836a.internalName) && AbstractC22676k.m65745e(this.displayName, c27836a.displayName) && AbstractC22676k.m65745e(this.iconUrl, c27836a.iconUrl) && this.scoreType == c27836a.scoreType;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getInternalName() {
        return this.internalName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final ScoreType getScoreType() {
        return this.scoreType;
    }

    public int hashCode() {
        return this.scoreType.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.internalName.hashCode() * 31, 31, this.displayName), 31, this.iconUrl);
    }

    public String toString() {
        String str = this.internalName;
        String str2 = this.displayName;
        String str3 = this.iconUrl;
        ScoreType scoreType = this.scoreType;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ActivityItem(internalName=", str, ", displayName=", str2, ", iconUrl=");
        sbM32001t.append(str3);
        sbM32001t.append(", scoreType=");
        sbM32001t.append(scoreType);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
