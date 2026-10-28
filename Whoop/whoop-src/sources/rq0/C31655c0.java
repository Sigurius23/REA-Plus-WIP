package rq0;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.domain.model.teams.Team;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import live.hms.video.media.tracks.HMSTrackSource;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: rq0.c0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b@\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011\u0012$\b\u0002\u0010\u0014\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00130\u000fj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0013`\u0011\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b \u0010!J\u001b\u0010#\u001a\u00020\u00002\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0004¢\u0006\u0004\b*\u0010+J!\u0010,\u001a\u00020\u00002\u0012\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00130\u0013¢\u0006\u0004\b,\u0010$J\u0015\u0010.\u001a\u00020\u00002\u0006\u0010-\u001a\u00020%¢\u0006\u0004\b.\u0010(J\u0015\u0010/\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0004¢\u0006\u0004\b/\u0010+J\u0092\u0002\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u00112$\b\u0002\u0010\u0014\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00130\u000fj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0013`\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00107\u001a\u00020\u00062\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0004H\u0002¢\u0006\u0004\b9\u0010:J\u001d\u0010<\u001a\u00020\u00062\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013H\u0002¢\u0006\u0004\b<\u0010=J+\u0010@\u001a\u00020\u00062\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00100\u00132\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013H\u0002¢\u0006\u0004\b@\u0010AR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b<\u0010E\u001a\u0004\bF\u00103R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bN\u0010G\u001a\u0004\bO\u0010IR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bP\u0010E\u001a\u0004\bQ\u00103R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bP\u00105R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bT\u0010S\u001a\u0004\bU\u00105R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bV\u0010S\u001a\u0004\bW\u00105R'\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u00118\u0006¢\u0006\f\n\u0004\bQ\u0010X\u001a\u0004\bT\u0010YR3\u0010\u0014\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00130\u000fj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0013`\u00118\u0006¢\u0006\f\n\u0004\bZ\u0010X\u001a\u0004\b[\u0010YR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bC\u0010\\\u001a\u0004\bN\u0010]R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bL\u0010\\\u001a\u0004\b^\u0010]R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bH\u0010_\u001a\u0004\b`\u0010aR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b^\u0010E\u001a\u0004\bR\u00103R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bU\u0010E\u001a\u0004\bb\u00103R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bb\u0010S\u001a\u0004\bc\u00105R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bW\u0010E\u001a\u0004\bZ\u00103R\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b[\u0010S\u001a\u0004\bd\u00105R\u0017\u0010\u001f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bc\u0010G\u001a\u0004\bV\u0010I¨\u0006e"}, m65681d2 = {"Lrq0/c0;", "", "", "id", "", "name", "", "loading", "Lcom/whoop/domain/model/teams/Team;", "loadedTeam", "isConnected", "description", "bannerIndex", "logoIndex", "logoVariantIndex", "Ljava/util/ArrayList;", "Lrq0/p;", "Lkotlin/collections/ArrayList;", "banners", "", "logos", "Landroid/graphics/Bitmap;", "bannerCropping", "logoCropping", "Lrq0/a0;", HMSTrackSource.SCREEN, "bannerUrlToLoad", "logoUrlToLoad", "memberCount", "finishToast", "finishCode", "chatEnabled", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;ZLcom/whoop/domain/model/teams/Team;ZLjava/lang/String;IIILjava/util/ArrayList;Ljava/util/ArrayList;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lrq0/a0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IZ)V", "urls", "A", "(Ljava/util/List;)Lrq0/c0;", "Landroid/graphics/drawable/Drawable;", "newBanner", "y", "(Landroid/graphics/drawable/Drawable;)Lrq0/c0;", QueryParams.URL, "z", "(Ljava/lang/String;)Lrq0/c0;", "B", "newLogo", "C", "D", "c", "(Ljava/lang/Integer;Ljava/lang/String;ZLcom/whoop/domain/model/teams/Team;ZLjava/lang/String;IIILjava/util/ArrayList;Ljava/util/ArrayList;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lrq0/a0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IZ)Lrq0/c0;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "(Ljava/lang/String;)Z", "variants", "b", "(Ljava/util/List;)Z", "variants1", "variants2", "x", "(Ljava/util/List;Ljava/util/List;)Z", "Ljava/lang/Integer;", "l", "()Ljava/lang/Integer;", "Ljava/lang/String;", "u", "Z", "n", "()Z", "d", "Lcom/whoop/domain/model/teams/Team;", "m", "()Lcom/whoop/domain/model/teams/Team;", "e", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "f", "j", "g", "I", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "p", "i", "r", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "k", "s", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "o", "Lrq0/a0;", "v", "()Lrq0/a0;", "q", "t", "getFinishCode", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31655c0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Integer id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean loading;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Team loadedTeam;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isConnected;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String description;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int bannerIndex;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int logoIndex;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int logoVariantIndex;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final ArrayList<InterfaceC31687p> banners;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final ArrayList<List<InterfaceC31687p>> logos;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final Bitmap bannerCropping;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Bitmap logoCropping;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final EnumC31649a0 screen;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final String bannerUrlToLoad;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final String logoUrlToLoad;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final int memberCount;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final String finishToast;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final int finishCode;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final boolean chatEnabled;

    public C31655c0(Integer num, String name, boolean z4, Team team, boolean z13, String description, int i13, int i14, int i15, ArrayList<InterfaceC31687p> banners, ArrayList<List<InterfaceC31687p>> logos, Bitmap bitmap, Bitmap bitmap2, EnumC31649a0 screen, String str, String str2, int i16, String str3, int i17, boolean z14) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(banners, "banners");
        AbstractC22676k.m65750j(logos, "logos");
        AbstractC22676k.m65750j(screen, "screen");
        this.id = num;
        this.name = name;
        this.loading = z4;
        this.loadedTeam = team;
        this.isConnected = z13;
        this.description = description;
        this.bannerIndex = i13;
        this.logoIndex = i14;
        this.logoVariantIndex = i15;
        this.banners = banners;
        this.logos = logos;
        this.bannerCropping = bitmap;
        this.logoCropping = bitmap2;
        this.screen = screen;
        this.bannerUrlToLoad = str;
        this.logoUrlToLoad = str2;
        this.memberCount = i16;
        this.finishToast = str3;
        this.finishCode = i17;
        this.chatEnabled = z14;
    }

    /* JADX INFO: renamed from: a */
    private final boolean m97880a(String url) {
        ArrayList<InterfaceC31687p> arrayList = this.banners;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof C31691r) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((C31691r) it.next()).getUrl());
        }
        return arrayList3.contains(url);
    }

    /* JADX INFO: renamed from: b */
    private final boolean m97881b(List<String> variants) {
        Iterator<T> it = this.logos.iterator();
        while (it.hasNext()) {
            if (m97883x((List) it.next(), variants)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C31655c0 m97882d(C31655c0 c31655c0, Integer num, String str, boolean z4, Team team, boolean z13, String str2, int i13, int i14, int i15, ArrayList arrayList, ArrayList arrayList2, Bitmap bitmap, Bitmap bitmap2, EnumC31649a0 enumC31649a0, String str3, String str4, int i16, String str5, int i17, boolean z14, int i18, Object obj) {
        boolean z15;
        int i19;
        Integer num2 = (i18 & 1) != 0 ? c31655c0.id : num;
        String str6 = (i18 & 2) != 0 ? c31655c0.name : str;
        boolean z16 = (i18 & 4) != 0 ? c31655c0.loading : z4;
        Team team2 = (i18 & 8) != 0 ? c31655c0.loadedTeam : team;
        boolean z17 = (i18 & 16) != 0 ? c31655c0.isConnected : z13;
        String str7 = (i18 & 32) != 0 ? c31655c0.description : str2;
        int i24 = (i18 & 64) != 0 ? c31655c0.bannerIndex : i13;
        int i25 = (i18 & 128) != 0 ? c31655c0.logoIndex : i14;
        int i26 = (i18 & 256) != 0 ? c31655c0.logoVariantIndex : i15;
        ArrayList arrayList3 = (i18 & 512) != 0 ? c31655c0.banners : arrayList;
        ArrayList arrayList4 = (i18 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c31655c0.logos : arrayList2;
        Bitmap bitmap3 = (i18 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c31655c0.bannerCropping : bitmap;
        Bitmap bitmap4 = (i18 & 4096) != 0 ? c31655c0.logoCropping : bitmap2;
        EnumC31649a0 enumC31649a1 = (i18 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c31655c0.screen : enumC31649a0;
        Integer num3 = num2;
        String str8 = (i18 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c31655c0.bannerUrlToLoad : str3;
        String str9 = (i18 & 32768) != 0 ? c31655c0.logoUrlToLoad : str4;
        int i27 = (i18 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? c31655c0.memberCount : i16;
        String str10 = (i18 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? c31655c0.finishToast : str5;
        int i28 = (i18 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? c31655c0.finishCode : i17;
        if ((i18 & 524288) != 0) {
            i19 = i28;
            z15 = c31655c0.chatEnabled;
        } else {
            z15 = z14;
            i19 = i28;
        }
        return c31655c0.m97888c(num3, str6, z16, team2, z17, str7, i24, i25, i26, arrayList3, arrayList4, bitmap3, bitmap4, enumC31649a1, str8, str9, i27, str10, i19, z15);
    }

    /* JADX INFO: renamed from: x */
    private final boolean m97883x(List<? extends InterfaceC31687p> variants1, List<String> variants2) {
        List<? extends InterfaceC31687p> list = variants1;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((InterfaceC31687p) it.next()) instanceof C31689q) {
                    return false;
                }
            }
        }
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (InterfaceC31687p interfaceC31687p : list) {
            AbstractC22676k.m65748h(interfaceC31687p, "null cannot be cast to non-null type com.whoop.community.presentation.teams.TeamCreateImageUrl");
            arrayList.add(((C31691r) interfaceC31687p).getUrl());
        }
        return new HashSet(arrayList).equals(new HashSet(variants2));
    }

    /* JADX INFO: renamed from: A */
    public final C31655c0 m97884A(List<String> urls) {
        AbstractC22676k.m65750j(urls, "urls");
        ArrayList<InterfaceC31687p> arrayList = this.banners;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : urls) {
            if (!m97880a((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(new C31691r((String) it.next()));
        }
        arrayList.addAll(arrayList3);
        return this;
    }

    /* JADX INFO: renamed from: B */
    public final C31655c0 m97885B(List<? extends List<String>> urls) {
        AbstractC22676k.m65750j(urls, "urls");
        ArrayList<List<InterfaceC31687p>> arrayList = this.logos;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : urls) {
            if (!((List) obj).isEmpty()) {
                arrayList2.add(obj);
            }
        }
        ArrayList<List> arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (!m97881b((List) obj2)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(arrayList3, 10));
        for (List list : arrayList3) {
            ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList5.add(new C31691r((String) it.next()));
            }
            arrayList4.add(arrayList5);
        }
        arrayList.addAll(arrayList4);
        return this;
    }

    /* JADX INFO: renamed from: C */
    public final C31655c0 m97886C(Drawable newLogo) {
        AbstractC22676k.m65750j(newLogo, "newLogo");
        this.logos.add(AbstractC37056f.m118958J(new C31689q(newLogo)));
        return m97882d(this, null, null, false, null, false, null, 0, AbstractC37056f.m118951C(this.logos), 0, null, null, null, null, null, null, null, 0, null, 0, false, 1048191, null);
    }

    /* JADX INFO: renamed from: D */
    public final C31655c0 m97887D(String url) {
        AbstractC22676k.m65750j(url, "url");
        this.logos.add(AbstractC37056f.m118958J(new C31691r(url)));
        return m97882d(this, null, null, false, null, false, null, 0, AbstractC37056f.m118951C(this.logos), AbstractC37056f.m118951C((List) AbstractC25265s.m74112P0(this.logos)), null, null, null, null, null, null, null, 0, null, 0, false, 1048191, null);
    }

    /* JADX INFO: renamed from: c */
    public final C31655c0 m97888c(Integer id4, String name, boolean loading, Team loadedTeam, boolean isConnected, String description, int bannerIndex, int logoIndex, int logoVariantIndex, ArrayList<InterfaceC31687p> banners, ArrayList<List<InterfaceC31687p>> logos, Bitmap bannerCropping, Bitmap logoCropping, EnumC31649a0 screen, String bannerUrlToLoad, String logoUrlToLoad, int memberCount, String finishToast, int finishCode, boolean chatEnabled) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(banners, "banners");
        AbstractC22676k.m65750j(logos, "logos");
        AbstractC22676k.m65750j(screen, "screen");
        return new C31655c0(id4, name, loading, loadedTeam, isConnected, description, bannerIndex, logoIndex, logoVariantIndex, banners, logos, bannerCropping, logoCropping, screen, bannerUrlToLoad, logoUrlToLoad, memberCount, finishToast, finishCode, chatEnabled);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Bitmap getBannerCropping() {
        return this.bannerCropping;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31655c0)) {
            return false;
        }
        C31655c0 c31655c0 = (C31655c0) other;
        return AbstractC22676k.m65745e(this.id, c31655c0.id) && AbstractC22676k.m65745e(this.name, c31655c0.name) && this.loading == c31655c0.loading && AbstractC22676k.m65745e(this.loadedTeam, c31655c0.loadedTeam) && this.isConnected == c31655c0.isConnected && AbstractC22676k.m65745e(this.description, c31655c0.description) && this.bannerIndex == c31655c0.bannerIndex && this.logoIndex == c31655c0.logoIndex && this.logoVariantIndex == c31655c0.logoVariantIndex && AbstractC22676k.m65745e(this.banners, c31655c0.banners) && AbstractC22676k.m65745e(this.logos, c31655c0.logos) && AbstractC22676k.m65745e(this.bannerCropping, c31655c0.bannerCropping) && AbstractC22676k.m65745e(this.logoCropping, c31655c0.logoCropping) && this.screen == c31655c0.screen && AbstractC22676k.m65745e(this.bannerUrlToLoad, c31655c0.bannerUrlToLoad) && AbstractC22676k.m65745e(this.logoUrlToLoad, c31655c0.logoUrlToLoad) && this.memberCount == c31655c0.memberCount && AbstractC22676k.m65745e(this.finishToast, c31655c0.finishToast) && this.finishCode == c31655c0.finishCode && this.chatEnabled == c31655c0.chatEnabled;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getBannerIndex() {
        return this.bannerIndex;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getBannerUrlToLoad() {
        return this.bannerUrlToLoad;
    }

    /* JADX INFO: renamed from: h */
    public final ArrayList<InterfaceC31687p> m97892h() {
        return this.banners;
    }

    public int hashCode() {
        Integer num = this.id;
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d((num == null ? 0 : num.hashCode()) * 31, 31, this.name), 31, this.loading);
        Team team = this.loadedTeam;
        int iHashCode = (this.logos.hashCode() + ((this.banners.hashCode() + AbstractC11266d.m30448b(this.logoVariantIndex, AbstractC11266d.m30448b(this.logoIndex, AbstractC11266d.m30448b(this.bannerIndex, AbstractC11266d.m30450d(AbstractC2875y.m8289b((iM8289b + (team == null ? 0 : team.hashCode())) * 31, 31, this.isConnected), 31, this.description), 31), 31), 31)) * 31)) * 31;
        Bitmap bitmap = this.bannerCropping;
        int iHashCode2 = (iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        Bitmap bitmap2 = this.logoCropping;
        int iHashCode3 = (this.screen.hashCode() + ((iHashCode2 + (bitmap2 == null ? 0 : bitmap2.hashCode())) * 31)) * 31;
        String str = this.bannerUrlToLoad;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.logoUrlToLoad;
        int iM30448b = AbstractC11266d.m30448b(this.memberCount, (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.finishToast;
        return Boolean.hashCode(this.chatEnabled) + AbstractC11266d.m30448b(this.finishCode, (iM30448b + (str3 != null ? str3.hashCode() : 0)) * 31, 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getChatEnabled() {
        return this.chatEnabled;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getFinishToast() {
        return this.finishToast;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Team getLoadedTeam() {
        return this.loadedTeam;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Bitmap getLogoCropping() {
        return this.logoCropping;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final int getLogoIndex() {
        return this.logoIndex;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getLogoUrlToLoad() {
        return this.logoUrlToLoad;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final int getLogoVariantIndex() {
        return this.logoVariantIndex;
    }

    /* JADX INFO: renamed from: s */
    public final ArrayList<List<InterfaceC31687p>> m97903s() {
        return this.logos;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getMemberCount() {
        return this.memberCount;
    }

    public String toString() {
        Integer num = this.id;
        String str = this.name;
        boolean z4 = this.loading;
        Team team = this.loadedTeam;
        boolean z13 = this.isConnected;
        String str2 = this.description;
        int i13 = this.bannerIndex;
        int i14 = this.logoIndex;
        int i15 = this.logoVariantIndex;
        ArrayList<InterfaceC31687p> arrayList = this.banners;
        ArrayList<List<InterfaceC31687p>> arrayList2 = this.logos;
        Bitmap bitmap = this.bannerCropping;
        Bitmap bitmap2 = this.logoCropping;
        EnumC31649a0 enumC31649a0 = this.screen;
        String str3 = this.bannerUrlToLoad;
        String str4 = this.logoUrlToLoad;
        int i16 = this.memberCount;
        String str5 = this.finishToast;
        int i17 = this.finishCode;
        boolean z14 = this.chatEnabled;
        StringBuilder sbM95643s = AbstractC31061c.m95643s("TeamManageViewState(id=", ", name=", num, str, ", loading=");
        sbM95643s.append(z4);
        sbM95643s.append(", loadedTeam=");
        sbM95643s.append(team);
        sbM95643s.append(", isConnected=");
        AbstractC38963t7.m124391u(sbM95643s, z13, ", description=", str2, ", bannerIndex=");
        AbstractC30802r.m94773v(sbM95643s, i13, ", logoIndex=", i14, ", logoVariantIndex=");
        sbM95643s.append(i15);
        sbM95643s.append(", banners=");
        sbM95643s.append(arrayList);
        sbM95643s.append(", logos=");
        sbM95643s.append(arrayList2);
        sbM95643s.append(", bannerCropping=");
        sbM95643s.append(bitmap);
        sbM95643s.append(", logoCropping=");
        sbM95643s.append(bitmap2);
        sbM95643s.append(", screen=");
        sbM95643s.append(enumC31649a0);
        sbM95643s.append(", bannerUrlToLoad=");
        AbstractC11266d.m30444B(sbM95643s, str3, ", logoUrlToLoad=", str4, ", memberCount=");
        AbstractC11895b.m31979B(i16, ", finishToast=", str5, ", finishCode=", sbM95643s);
        sbM95643s.append(i17);
        sbM95643s.append(", chatEnabled=");
        sbM95643s.append(z14);
        sbM95643s.append(")");
        return sbM95643s.toString();
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final EnumC31649a0 getScreen() {
        return this.screen;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final boolean getIsConnected() {
        return this.isConnected;
    }

    /* JADX INFO: renamed from: y */
    public final C31655c0 m97908y(Drawable newBanner) {
        AbstractC22676k.m65750j(newBanner, "newBanner");
        this.banners.add(new C31689q(newBanner));
        return m97882d(this, null, null, false, null, false, null, AbstractC37056f.m118951C(this.banners), 0, 0, null, null, null, null, null, null, null, 0, null, 0, false, 1048511, null);
    }

    /* JADX INFO: renamed from: z */
    public final C31655c0 m97909z(String url) {
        AbstractC22676k.m65750j(url, "url");
        this.banners.add(new C31691r(url));
        return m97882d(this, null, null, false, null, false, null, AbstractC37056f.m118951C(this.banners), 0, 0, null, null, null, null, null, null, null, 0, null, 0, false, 1048511, null);
    }

    public /* synthetic */ C31655c0(Integer num, String str, boolean z4, Team team, boolean z13, String str2, int i13, int i14, int i15, ArrayList arrayList, ArrayList arrayList2, Bitmap bitmap, Bitmap bitmap2, EnumC31649a0 enumC31649a0, String str3, String str4, int i16, String str5, int i17, boolean z14, int i18, DefaultConstructorMarker defaultConstructorMarker) {
        this((i18 & 1) != 0 ? null : num, (i18 & 2) != 0 ? "" : str, (i18 & 4) != 0 ? true : z4, (i18 & 8) != 0 ? null : team, (i18 & 16) == 0 ? z13 : true, (i18 & 32) == 0 ? str2 : "", (i18 & 64) != 0 ? 0 : i13, (i18 & 128) != 0 ? 0 : i14, (i18 & 256) != 0 ? 0 : i15, (i18 & 512) != 0 ? new ArrayList() : arrayList, (i18 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? new ArrayList() : arrayList2, (i18 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : bitmap, (i18 & 4096) != 0 ? null : bitmap2, (i18 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? EnumC31649a0.MAIN : enumC31649a0, (i18 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : str3, (i18 & 32768) != 0 ? null : str4, (i18 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? 0 : i16, (i18 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? null : str5, (i18 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? 0 : i17, (i18 & 524288) != 0 ? false : z14);
    }
}
