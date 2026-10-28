package rq0;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.whoop.domain.model.teams.Team;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import rm2.C31604d;
import wb3.AbstractC37056f;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: rq0.z */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001BÝ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f\u0012$\b\u0002\u0010\u000f\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000e0\nj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000e`\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001f\u001a\u00020\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e0\u000e¢\u0006\u0004\b%\u0010 J\u0017\u0010'\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010!¢\u0006\u0004\b'\u0010$Jæ\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2$\b\u0002\u0010\u000f\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000e0\nj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000e`\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\u00132\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010+R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u00108\u001a\u0004\b9\u0010-R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b:\u00108\u001a\u0004\b;\u0010-R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b<\u00108\u001a\u0004\b=\u0010-R'\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f8\u0006¢\u0006\f\n\u0004\b9\u0010>\u001a\u0004\b?\u0010@R3\u0010\u000f\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000e0\nj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000e`\f8\u0006¢\u0006\f\n\u0004\b?\u0010>\u001a\u0004\bA\u0010@R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\b<\u0010DR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bE\u0010C\u001a\u0004\bF\u0010DR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\u0015\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bK\u0010H\u001a\u0004\bL\u0010JR\u0017\u0010\u0016\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bF\u0010H\u001a\u0004\bM\u0010JR\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b;\u0010H\u001a\u0004\bK\u0010JR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b=\u00106\u001a\u0004\bG\u0010+R\u0017\u0010\u0019\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bA\u00108\u001a\u0004\bE\u0010-R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b7\u0010N\u001a\u0004\bB\u0010O¨\u0006P"}, m65681d2 = {"Lrq0/z;", "", "Lrq0/w;", "step", "", "name", "", "bannerIndex", "logoIndex", "logoVariantIndex", "Ljava/util/ArrayList;", "Lrq0/p;", "Lkotlin/collections/ArrayList;", "banners", "", "logos", "Landroid/graphics/Bitmap;", "bannerCropping", "logoCropping", "", "shareStrain", "shareRecovery", "shareSleep", "loading", "finishToast", "finishCode", "Lcom/whoop/domain/model/teams/Team;", "createdTeam", "<init>", "(Lrq0/w;Ljava/lang/String;IIILjava/util/ArrayList;Ljava/util/ArrayList;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;ZZZZLjava/lang/String;ILcom/whoop/domain/model/teams/Team;)V", "urls", "v", "(Ljava/util/List;)Lrq0/z;", "Landroid/graphics/drawable/Drawable;", "newBanner", "u", "(Landroid/graphics/drawable/Drawable;)Lrq0/z;", "x", "newLogo", "z", "c", "(Lrq0/w;Ljava/lang/String;IIILjava/util/ArrayList;Ljava/util/ArrayList;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;ZZZZLjava/lang/String;ILcom/whoop/domain/model/teams/Team;)Lrq0/z;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lrq0/w;", "t", "()Lrq0/w;", "b", "Ljava/lang/String;", "p", "I", "f", "d", "m", "e", "n", "Ljava/util/ArrayList;", "g", "()Ljava/util/ArrayList;", "o", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "i", "l", "j", "Z", "s", "()Z", "k", "q", "r", "Lcom/whoop/domain/model/teams/Team;", "()Lcom/whoop/domain/model/teams/Team;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31707z {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC31701w step;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int bannerIndex;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int logoIndex;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int logoVariantIndex;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final ArrayList<InterfaceC31687p> banners;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final ArrayList<List<InterfaceC31687p>> logos;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Bitmap bannerCropping;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Bitmap logoCropping;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean shareStrain;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean shareRecovery;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean shareSleep;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final boolean loading;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final String finishToast;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final int finishCode;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final Team createdTeam;

    public C31707z(EnumC31701w enumC31701w, String name, int i13, int i14, int i15, ArrayList<InterfaceC31687p> banners, ArrayList<List<InterfaceC31687p>> logos, Bitmap bitmap, Bitmap bitmap2, boolean z4, boolean z13, boolean z14, boolean z15, String str, int i16, Team team) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(banners, "banners");
        AbstractC22676k.m65750j(logos, "logos");
        this.step = enumC31701w;
        this.name = name;
        this.bannerIndex = i13;
        this.logoIndex = i14;
        this.logoVariantIndex = i15;
        this.banners = banners;
        this.logos = logos;
        this.bannerCropping = bitmap;
        this.logoCropping = bitmap2;
        this.shareStrain = z4;
        this.shareRecovery = z13;
        this.shareSleep = z14;
        this.loading = z15;
        this.finishToast = str;
        this.finishCode = i16;
        this.createdTeam = team;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C31707z m98316d(C31707z c31707z, EnumC31701w enumC31701w, String str, int i13, int i14, int i15, ArrayList arrayList, ArrayList arrayList2, Bitmap bitmap, Bitmap bitmap2, boolean z4, boolean z13, boolean z14, boolean z15, String str2, int i16, Team team, int i17, Object obj) {
        return c31707z.m98319c((i17 & 1) != 0 ? c31707z.step : enumC31701w, (i17 & 2) != 0 ? c31707z.name : str, (i17 & 4) != 0 ? c31707z.bannerIndex : i13, (i17 & 8) != 0 ? c31707z.logoIndex : i14, (i17 & 16) != 0 ? c31707z.logoVariantIndex : i15, (i17 & 32) != 0 ? c31707z.banners : arrayList, (i17 & 64) != 0 ? c31707z.logos : arrayList2, (i17 & 128) != 0 ? c31707z.bannerCropping : bitmap, (i17 & 256) != 0 ? c31707z.logoCropping : bitmap2, (i17 & 512) != 0 ? c31707z.shareStrain : z4, (i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c31707z.shareRecovery : z13, (i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c31707z.shareSleep : z14, (i17 & 4096) != 0 ? c31707z.loading : z15, (i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c31707z.finishToast : str2, (i17 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c31707z.finishCode : i16, (i17 & 32768) != 0 ? c31707z.createdTeam : team);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final boolean m98317w(InterfaceC31687p it) {
        AbstractC22676k.m65750j(it, "it");
        return it instanceof C31691r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final boolean m98318y(List listOfLogos) {
        AbstractC22676k.m65750j(listOfLogos, "listOfLogos");
        List list = listOfLogos;
        boolean z4 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!(((InterfaceC31687p) it.next()) instanceof C31691r)) {
                    z4 = true;
                    break;
                }
            }
        }
        return !z4;
    }

    /* JADX INFO: renamed from: c */
    public final C31707z m98319c(EnumC31701w step, String name, int bannerIndex, int logoIndex, int logoVariantIndex, ArrayList<InterfaceC31687p> banners, ArrayList<List<InterfaceC31687p>> logos, Bitmap bannerCropping, Bitmap logoCropping, boolean shareStrain, boolean shareRecovery, boolean shareSleep, boolean loading, String finishToast, int finishCode, Team createdTeam) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(banners, "banners");
        AbstractC22676k.m65750j(logos, "logos");
        return new C31707z(step, name, bannerIndex, logoIndex, logoVariantIndex, banners, logos, bannerCropping, logoCropping, shareStrain, shareRecovery, shareSleep, loading, finishToast, finishCode, createdTeam);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Bitmap getBannerCropping() {
        return this.bannerCropping;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31707z)) {
            return false;
        }
        C31707z c31707z = (C31707z) other;
        return this.step == c31707z.step && AbstractC22676k.m65745e(this.name, c31707z.name) && this.bannerIndex == c31707z.bannerIndex && this.logoIndex == c31707z.logoIndex && this.logoVariantIndex == c31707z.logoVariantIndex && AbstractC22676k.m65745e(this.banners, c31707z.banners) && AbstractC22676k.m65745e(this.logos, c31707z.logos) && AbstractC22676k.m65745e(this.bannerCropping, c31707z.bannerCropping) && AbstractC22676k.m65745e(this.logoCropping, c31707z.logoCropping) && this.shareStrain == c31707z.shareStrain && this.shareRecovery == c31707z.shareRecovery && this.shareSleep == c31707z.shareSleep && this.loading == c31707z.loading && AbstractC22676k.m65745e(this.finishToast, c31707z.finishToast) && this.finishCode == c31707z.finishCode && AbstractC22676k.m65745e(this.createdTeam, c31707z.createdTeam);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getBannerIndex() {
        return this.bannerIndex;
    }

    /* JADX INFO: renamed from: g */
    public final ArrayList<InterfaceC31687p> m98322g() {
        return this.banners;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Team getCreatedTeam() {
        return this.createdTeam;
    }

    public int hashCode() {
        EnumC31701w enumC31701w = this.step;
        int iHashCode = (this.logos.hashCode() + ((this.banners.hashCode() + AbstractC11266d.m30448b(this.logoVariantIndex, AbstractC11266d.m30448b(this.logoIndex, AbstractC11266d.m30448b(this.bannerIndex, AbstractC11266d.m30450d((enumC31701w == null ? 0 : enumC31701w.hashCode()) * 31, 31, this.name), 31), 31), 31)) * 31)) * 31;
        Bitmap bitmap = this.bannerCropping;
        int iHashCode2 = (iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        Bitmap bitmap2 = this.logoCropping;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode2 + (bitmap2 == null ? 0 : bitmap2.hashCode())) * 31, 31, this.shareStrain), 31, this.shareRecovery), 31, this.shareSleep), 31, this.loading);
        String str = this.finishToast;
        int iM30448b = AbstractC11266d.m30448b(this.finishCode, (iM8289b + (str == null ? 0 : str.hashCode())) * 31, 31);
        Team team = this.createdTeam;
        return iM30448b + (team != null ? team.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getFinishCode() {
        return this.finishCode;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getFinishToast() {
        return this.finishToast;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Bitmap getLogoCropping() {
        return this.logoCropping;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getLogoIndex() {
        return this.logoIndex;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getLogoVariantIndex() {
        return this.logoVariantIndex;
    }

    /* JADX INFO: renamed from: o */
    public final ArrayList<List<InterfaceC31687p>> m98330o() {
        return this.logos;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getShareRecovery() {
        return this.shareRecovery;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getShareSleep() {
        return this.shareSleep;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getShareStrain() {
        return this.shareStrain;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final EnumC31701w getStep() {
        return this.step;
    }

    public String toString() {
        EnumC31701w enumC31701w = this.step;
        String str = this.name;
        int i13 = this.bannerIndex;
        int i14 = this.logoIndex;
        int i15 = this.logoVariantIndex;
        ArrayList<InterfaceC31687p> arrayList = this.banners;
        ArrayList<List<InterfaceC31687p>> arrayList2 = this.logos;
        Bitmap bitmap = this.bannerCropping;
        Bitmap bitmap2 = this.logoCropping;
        boolean z4 = this.shareStrain;
        boolean z13 = this.shareRecovery;
        boolean z14 = this.shareSleep;
        boolean z15 = this.loading;
        String str2 = this.finishToast;
        int i16 = this.finishCode;
        Team team = this.createdTeam;
        StringBuilder sb4 = new StringBuilder("TeamCreateViewState(step=");
        sb4.append(enumC31701w);
        sb4.append(", name=");
        sb4.append(str);
        sb4.append(", bannerIndex=");
        AbstractC30802r.m94773v(sb4, i13, ", logoIndex=", i14, ", logoVariantIndex=");
        sb4.append(i15);
        sb4.append(", banners=");
        sb4.append(arrayList);
        sb4.append(", logos=");
        sb4.append(arrayList2);
        sb4.append(", bannerCropping=");
        sb4.append(bitmap);
        sb4.append(", logoCropping=");
        sb4.append(bitmap2);
        sb4.append(", shareStrain=");
        sb4.append(z4);
        sb4.append(", shareRecovery=");
        AbstractC38963t7.m124392v(sb4, z13, ", shareSleep=", z14, ", loading=");
        AbstractC38963t7.m124391u(sb4, z15, ", finishToast=", str2, ", finishCode=");
        sb4.append(i16);
        sb4.append(", createdTeam=");
        sb4.append(team);
        sb4.append(")");
        return sb4.toString();
    }

    /* JADX INFO: renamed from: u */
    public final C31707z m98336u(Drawable newBanner) {
        if (newBanner == null) {
            return this;
        }
        this.banners.add(new C31689q(newBanner));
        return this;
    }

    /* JADX INFO: renamed from: v */
    public final C31707z m98337v(List<String> urls) {
        AbstractC22676k.m65750j(urls, "urls");
        AbstractC25265s.m74132j1(this.banners, new C31604d(6));
        ArrayList<InterfaceC31687p> arrayList = this.banners;
        List<String> list = urls;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C31691r((String) it.next()));
        }
        arrayList.addAll(arrayList2);
        return this;
    }

    /* JADX INFO: renamed from: x */
    public final C31707z m98338x(List<? extends List<String>> urls) {
        AbstractC22676k.m65750j(urls, "urls");
        AbstractC25265s.m74132j1(this.logos, new C31604d(5));
        ArrayList<List<InterfaceC31687p>> arrayList = this.logos;
        ArrayList<List> arrayList2 = new ArrayList();
        for (Object obj : urls) {
            if (!((List) obj).isEmpty()) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
        for (List list : arrayList2) {
            ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList4.add(new C31691r((String) it.next()));
            }
            arrayList3.add(arrayList4);
        }
        arrayList.addAll(arrayList3);
        return m98316d(this, null, null, 0, 0, AbstractC37056f.m118951C((List) AbstractC25265s.m74096F0(this.logos)), null, null, null, null, false, false, false, false, null, 0, null, 65511, null);
    }

    /* JADX INFO: renamed from: z */
    public final C31707z m98339z(Drawable newLogo) {
        if (newLogo == null) {
            return this;
        }
        this.logos.add(AbstractC37056f.m118958J(new C31689q(newLogo)));
        return m98316d(this, null, null, 0, 0, 0, null, null, null, null, false, false, false, false, null, 0, null, 65511, null);
    }

    public /* synthetic */ C31707z(EnumC31701w enumC31701w, String str, int i13, int i14, int i15, ArrayList arrayList, ArrayList arrayList2, Bitmap bitmap, Bitmap bitmap2, boolean z4, boolean z13, boolean z14, boolean z15, String str2, int i16, Team team, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this((i17 & 1) != 0 ? null : enumC31701w, (i17 & 2) != 0 ? "" : str, (i17 & 4) != 0 ? 0 : i13, (i17 & 8) != 0 ? 0 : i14, (i17 & 16) != 0 ? 0 : i15, (i17 & 32) != 0 ? new ArrayList() : arrayList, (i17 & 64) != 0 ? new ArrayList() : arrayList2, (i17 & 128) != 0 ? null : bitmap, (i17 & 256) != 0 ? null : bitmap2, (i17 & 512) != 0 ? true : z4, (i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? true : z13, (i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0 ? z14 : true, (i17 & 4096) != 0 ? false : z15, (i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : str2, (i17 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? 0 : i16, (i17 & 32768) != 0 ? null : team);
    }
}
