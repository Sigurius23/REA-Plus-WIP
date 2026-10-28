package fp1;

import com.whoop.hormonalinsights.postpartum.domain.models.PostPartumScreenType;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import live.hms.video.media.tracks.HMSTrackSource;
import m83.C25271y;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: fp1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u008e\u0001\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b\u001f\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b+\u0010\u0018R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\"\u0010,\u001a\u0004\b'\u0010\u001aR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b.\u0010&R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b/\u0010&R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u001e\u001a\u0004\b-\u0010\u0018R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b.\u00101\u001a\u0004\b0\u00102¨\u00063"}, m65681d2 = {"Lfp1/d;", "", "", "deliveryDate", "Lfp1/b;", "deliveryMethod", "", "Lfp1/a;", "babies", "", "turnOnStealth", "pregnancyName", "", "babyCount", "weightFirst", "weightSecond", "id", "Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;", HMSTrackSource.SCREEN, "<init>", "(Ljava/lang/String;Lfp1/b;Ljava/util/List;ZLjava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;)V", "a", "(Ljava/lang/String;Lfp1/b;Ljava/util/List;ZLjava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;)Lfp1/d;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "Lfp1/b;", "f", "()Lfp1/b;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "Z", "getTurnOnStealth", "()Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "I", "g", "j", "k", "i", "Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;", "()Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14676d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String deliveryDate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC14674b deliveryMethod;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C14673a> babies;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean turnOnStealth;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String pregnancyName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int babyCount;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<String> weightFirst;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final List<String> weightSecond;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final PostPartumScreenType screen;

    public C14676d(String str, EnumC14674b enumC14674b, List<C14673a> list, boolean z4, String str2, int i13, List<String> weightFirst, List<String> weightSecond, String id4, PostPartumScreenType screen) {
        AbstractC22676k.m65750j(weightFirst, "weightFirst");
        AbstractC22676k.m65750j(weightSecond, "weightSecond");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(screen, "screen");
        this.deliveryDate = str;
        this.deliveryMethod = enumC14674b;
        this.babies = list;
        this.turnOnStealth = z4;
        this.pregnancyName = str2;
        this.babyCount = i13;
        this.weightFirst = weightFirst;
        this.weightSecond = weightSecond;
        this.id = id4;
        this.screen = screen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C14676d m41947b(C14676d c14676d, String str, EnumC14674b enumC14674b, List list, boolean z4, String str2, int i13, List list2, List list3, String str3, PostPartumScreenType postPartumScreenType, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = c14676d.deliveryDate;
        }
        if ((i14 & 2) != 0) {
            enumC14674b = c14676d.deliveryMethod;
        }
        if ((i14 & 4) != 0) {
            list = c14676d.babies;
        }
        if ((i14 & 8) != 0) {
            z4 = c14676d.turnOnStealth;
        }
        if ((i14 & 16) != 0) {
            str2 = c14676d.pregnancyName;
        }
        if ((i14 & 32) != 0) {
            i13 = c14676d.babyCount;
        }
        if ((i14 & 64) != 0) {
            list2 = c14676d.weightFirst;
        }
        if ((i14 & 128) != 0) {
            list3 = c14676d.weightSecond;
        }
        if ((i14 & 256) != 0) {
            str3 = c14676d.id;
        }
        if ((i14 & 512) != 0) {
            postPartumScreenType = c14676d.screen;
        }
        String str4 = str3;
        PostPartumScreenType postPartumScreenType2 = postPartumScreenType;
        List list4 = list2;
        List list5 = list3;
        String str5 = str2;
        int i15 = i13;
        return c14676d.m41948a(str, enumC14674b, list, z4, str5, i15, list4, list5, str4, postPartumScreenType2);
    }

    /* JADX INFO: renamed from: a */
    public final C14676d m41948a(String deliveryDate, EnumC14674b deliveryMethod, List<C14673a> babies, boolean turnOnStealth, String pregnancyName, int babyCount, List<String> weightFirst, List<String> weightSecond, String id4, PostPartumScreenType screen) {
        AbstractC22676k.m65750j(weightFirst, "weightFirst");
        AbstractC22676k.m65750j(weightSecond, "weightSecond");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(screen, "screen");
        return new C14676d(deliveryDate, deliveryMethod, babies, turnOnStealth, pregnancyName, babyCount, weightFirst, weightSecond, id4, screen);
    }

    /* JADX INFO: renamed from: c */
    public final List<C14673a> m41949c() {
        return this.babies;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getBabyCount() {
        return this.babyCount;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDeliveryDate() {
        return this.deliveryDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14676d)) {
            return false;
        }
        C14676d c14676d = (C14676d) other;
        return AbstractC22676k.m65745e(this.deliveryDate, c14676d.deliveryDate) && this.deliveryMethod == c14676d.deliveryMethod && AbstractC22676k.m65745e(this.babies, c14676d.babies) && this.turnOnStealth == c14676d.turnOnStealth && AbstractC22676k.m65745e(this.pregnancyName, c14676d.pregnancyName) && this.babyCount == c14676d.babyCount && AbstractC22676k.m65745e(this.weightFirst, c14676d.weightFirst) && AbstractC22676k.m65745e(this.weightSecond, c14676d.weightSecond) && AbstractC22676k.m65745e(this.id, c14676d.id) && this.screen == c14676d.screen;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC14674b getDeliveryMethod() {
        return this.deliveryMethod;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getPregnancyName() {
        return this.pregnancyName;
    }

    public int hashCode() {
        String str = this.deliveryDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        EnumC14674b enumC14674b = this.deliveryMethod;
        int iHashCode2 = (iHashCode + (enumC14674b == null ? 0 : enumC14674b.hashCode())) * 31;
        List<C14673a> list = this.babies;
        int iM8289b = AbstractC2875y.m8289b((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.turnOnStealth);
        String str2 = this.pregnancyName;
        return this.screen.hashCode() + AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11266d.m30448b(this.babyCount, (iM8289b + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31, this.weightFirst), 31, this.weightSecond), 31, this.id);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final PostPartumScreenType getScreen() {
        return this.screen;
    }

    /* JADX INFO: renamed from: j */
    public final List<String> m41956j() {
        return this.weightFirst;
    }

    /* JADX INFO: renamed from: k */
    public final List<String> m41957k() {
        return this.weightSecond;
    }

    public String toString() {
        String str = this.deliveryDate;
        EnumC14674b enumC14674b = this.deliveryMethod;
        List<C14673a> list = this.babies;
        boolean z4 = this.turnOnStealth;
        String str2 = this.pregnancyName;
        int i13 = this.babyCount;
        List<String> list2 = this.weightFirst;
        List<String> list3 = this.weightSecond;
        String str3 = this.id;
        PostPartumScreenType postPartumScreenType = this.screen;
        StringBuilder sb4 = new StringBuilder("PostPartumDomainRequest(deliveryDate=");
        sb4.append(str);
        sb4.append(", deliveryMethod=");
        sb4.append(enumC14674b);
        sb4.append(", babies=");
        AbstractC26725a.m79512p(", turnOnStealth=", ", pregnancyName=", sb4, list, z4);
        AbstractC11266d.m30470x(i13, str2, ", babyCount=", ", weightFirst=", sb4);
        AbstractC21702c.m61148s(sb4, list2, ", weightSecond=", list3, ", id=");
        sb4.append(str3);
        sb4.append(", screen=");
        sb4.append(postPartumScreenType);
        sb4.append(")");
        return sb4.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C14676d(String str, EnumC14674b enumC14674b, List list, boolean z4, String str2, int i13, List list2, List list3, String str3, PostPartumScreenType postPartumScreenType, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i14 & 1) != 0 ? null : str;
        enumC14674b = (i14 & 2) != 0 ? null : enumC14674b;
        list = (i14 & 4) != 0 ? null : list;
        z4 = (i14 & 8) != 0 ? false : z4;
        str2 = (i14 & 16) != 0 ? null : str2;
        i13 = (i14 & 32) != 0 ? 1 : i13;
        int i15 = i14 & 64;
        C25271y c25271y = C25271y.f99162w;
        this(str, enumC14674b, list, z4, str2, i13, i15 != 0 ? c25271y : list2, (i14 & 128) != 0 ? c25271y : list3, (i14 & 256) != 0 ? "" : str3, (i14 & 512) != 0 ? PostPartumScreenType.ALL : postPartumScreenType);
    }
}
