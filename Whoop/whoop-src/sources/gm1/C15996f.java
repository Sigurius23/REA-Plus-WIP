package gm1;

import a11.C0140r;
import am1.C1005b;
import b11.AbstractC2282i;
import b11.AbstractC2284k;
import b11.C2281h;
import c41.C3989a4;
import c41.C4069m0;
import c41.C4092p2;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.calendar.CalendarDateModel;
import com.whoop.design.models.items.FabModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.home.domain.models.CalendarResponse;
import com.whoop.home.domain.models.ComponentItemSpacingType;
import com.whoop.home.domain.models.ComponentItems;
import com.whoop.home.domain.models.CycleDays;
import com.whoop.home.domain.models.DayOneTransition;
import com.whoop.home.domain.models.DayOneTransitionViewState;
import com.whoop.home.domain.models.FabMenuModel;
import com.whoop.home.domain.models.HomeBffFeedResponse;
import com.whoop.home.domain.models.HomeResponseMetaData;
import com.whoop.home.domain.models.JournalMetaData;
import com.whoop.home.domain.models.Pillars;
import com.whoop.home.domain.models.WhoopLiveMetaData;
import com.whoop.service.network.model.cycles.Period;
import d11.C11474i;
import em1.C13338l;
import em1.C13348v;
import em1.EnumC13339m;
import em1.EnumC13344r;
import fl1.AbstractC14568a;
import fm1.C14597a;
import fm1.C14598b;
import fm1.C14599c;
import fm1.C14600d;
import fm1.C14601e;
import fm1.C14602f;
import fm1.C14607k;
import fm1.C14608l;
import fm1.EnumC14603g;
import gz0.EnumC16313m0;
import h91.C17027b;
import hm1.C17425b;
import i93.C18284j;
import ik2.C18613a;
import ik2.C18614b;
import il1.C18629f;
import il1.C18637n;
import il1.InterfaceC18631h;
import il1.InterfaceC18640q;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jb1.C21535a;
import jl1.C21770a;
import kd1.AbstractC22403o;
import kd1.EnumC22400l;
import kl1.AbstractC22564d;
import m83.AbstractC25243e0;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import n83.C26460c;
import ol1.AbstractC28015a;
import p31.AbstractC28794e;
import p31.AbstractC28805p;
import p31.C28801l;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.C25292c0;
import p720m91.InterfaceC25312u;
import p741vn1.C36213q;
import p745y81.InterfaceC39332e;
import sl1.AbstractC32703b;
import sl1.C32702a;
import sl1.C32704c;
import sm1.C32715a;
import tr2.InterfaceC34116n;
import u92.C34659c;
import u92.C34660d;
import ul1.AbstractC35065b;
import ul1.EnumC35066c;
import vl1.C36103a;
import vm1.AbstractC36155b;
import wb3.AbstractC37056f;
import x31.EnumC37944c;
import x51.AbstractC37989a;
import x51.C37992d;
import x81.C38072d;
import xl1.C38453c;
import xl1.EnumC38451a;
import y71.C39274g;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: gm1.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000ö\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J-\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\b\b\u0002\u0010)\u001a\u00020\u001eH\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020,2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00102\u001a\u0002012\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00107\u001a\u0002062\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b7\u00108J!\u0010<\u001a\u00020;2\u0006\u0010\u001d\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u000101H\u0002¢\u0006\u0004\b<\u0010=J%\u0010A\u001a\u00020#2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0&2\u0006\u0010@\u001a\u00020,H\u0002¢\u0006\u0004\bA\u0010BJ!\u0010F\u001a\f\u0012\u0004\u0012\u00020D0Cj\u0002`E2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\bF\u0010GJ)\u0010J\u001a\u0014\u0012\u0004\u0012\u00020I\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0&0H2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\bJ\u0010KJ7\u0010N\u001a\u0014\u0012\u0004\u0012\u00020I\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0&0H2\u0014\u0010M\u001a\u0010\u0012\u0004\u0012\u00020I\u0012\u0006\u0012\u0004\u0018\u00010L0HH\u0002¢\u0006\u0004\bN\u0010OJ\u000f\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\bQ\u0010RJG\u0010b\u001a\u00020a2\u0006\u0010T\u001a\u00020S2\u0006\u0010V\u001a\u00020U2\u0006\u0010X\u001a\u00020W2\u0006\u0010Z\u001a\u00020Y2\u0006\u0010\\\u001a\u00020[2\u0006\u0010^\u001a\u00020]2\u0006\u0010`\u001a\u00020_H\u0002¢\u0006\u0004\bb\u0010cJ\u001f\u0010f\u001a\u00020\u001e2\u0006\u0010Z\u001a\u00020Y2\u0006\u0010e\u001a\u00020dH\u0002¢\u0006\u0004\bf\u0010gJ!\u0010i\u001a\u00020\u001e2\u0006\u0010\\\u001a\u00020[2\b\u0010h\u001a\u0004\u0018\u00010]H\u0002¢\u0006\u0004\bi\u0010jJ\u001f\u0010m\u001a\u00020\u001e2\u0006\u0010l\u001a\u00020k2\u0006\u0010^\u001a\u00020]H\u0002¢\u0006\u0004\bm\u0010nJ\u0017\u0010r\u001a\u00020q2\u0006\u0010p\u001a\u00020oH\u0002¢\u0006\u0004\br\u0010sJ\u001f\u0010w\u001a\u00020v2\u0006\u0010u\u001a\u00020t2\u0006\u0010X\u001a\u00020WH\u0002¢\u0006\u0004\bw\u0010xJ\u0019\u0010|\u001a\u0004\u0018\u00010{2\u0006\u0010z\u001a\u00020yH\u0002¢\u0006\u0004\b|\u0010}J\u001c\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f2\u0006\u0010\u001d\u001a\u00020~H\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001a\u0010\u0082\u0001\u001a\u00020\u001e2\u0006\u0010z\u001a\u00020yH\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0019\u0010\u0085\u0001\u001a\u00020 2\u0007\u0010\u001d\u001a\u00030\u0084\u0001¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bi\u0010\u0087\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b*\u0010\u0088\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bJ\u0010\u008b\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bN\u0010\u008c\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bQ\u0010\u008d\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001a\u0010\u008e\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bF\u0010\u008f\u0001R\u0017\u0010\u0092\u0001\u001a\u00030\u0090\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bb\u0010\u0091\u0001R\u0017\u0010\u0095\u0001\u001a\u00030\u0093\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b!\u0010\u0094\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0017\u0010\u009b\u0001\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u009a\u0001R\u0017\u0010\u009d\u0001\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u009a\u0001¨\u0006\u009e\u0001"}, m65681d2 = {"Lgm1/f;", "", "Lzr2/a;", "dateAndTimeProvider", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ljava/util/Locale;", "locale", "Lgm1/a;", "cycleReducer", "Lsl1/c;", "connectivityTileViewStateReducer", "Lu92/d;", "prefsStore", "Lu92/c;", "ltoDismissStore", "Lhm1/b;", "streaksReducerHelper", "<init>", "(Lzr2/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Ljava/util/Locale;Lgm1/a;Lsl1/c;Lu92/d;Lu92/c;Lhm1/b;)V", "Lsl1/a;", "strapIndicatorResult", "Lb11/h;", "q", "(Lsl1/a;)Lb11/h;", "Lb11/k;", "g", "(Lsl1/a;)Lb11/k;", "Lil1/n;", "result", "", "showUpdating", "Lem1/v;", "j", "(Lil1/n;Z)Lem1/v;", "Lx51/d;", "s", "()Lx51/d;", "", "Lx51/a;", "fabList", "includeStartActivityRevamp", "b", "(Ljava/util/List;Z)Ljava/util/List;", "Lam1/b;", "z", "(Lil1/n;)Lam1/b;", "Lcom/whoop/home/domain/models/DayOneTransition;", "dayOneTransition", "Lik2/a;", "y", "(Lcom/whoop/home/domain/models/DayOneTransition;)Lik2/a;", "Lvl1/a;", "hideRecoveryDomainState", "Lsm1/a;", "v", "(Lvl1/a;)Lsm1/a;", "Lul1/b;", "dayOneOverlayState", "Lem1/l;", "t", "(Lul1/b;Lik2/a;)Lem1/l;", "Lcom/whoop/design/models/items/FabModel;", "fabItems", "onboardingDomainState", "u", "(Ljava/util/List;Lam1/b;)Lx51/d;", "Lh91/b;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/domain/calendar/CalendarDomainState;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lil1/n;)Lh91/b;", "", "", "d", "(Lil1/n;)Ljava/util/Map;", "Lcom/whoop/home/domain/models/CalendarResponse;", "responseMap", "e", "(Ljava/util/Map;)Ljava/util/Map;", "Ljava/time/LocalDate;", "f", "()Ljava/time/LocalDate;", "Lcom/whoop/home/domain/models/HomeBffFeedResponse;", "response", "Lsl1/b;", "alertTile", "Lxl1/c;", "journalData", "Lil1/h;", "dismissConfigCtaState", "Lil1/f;", "dismissAlertTileState", "", "currentUserId", "Ljl1/a;", "autoPopDomainState", "Lfm1/c;", "i", "(Lcom/whoop/home/domain/models/HomeBffFeedResponse;Lsl1/b;Lxl1/c;Lil1/h;Lil1/f;Ljava/lang/String;Ljl1/a;)Lfm1/c;", "", "cycleId", "m", "(Lil1/h;J)Z", "id", "a", "(Lil1/f;Ljava/lang/String;)Z", "Lc41/a4;", "viewState", "o", "(Lc41/a4;Ljava/lang/String;)Z", "Lcom/whoop/home/domain/models/WhoopLiveMetaData;", "whoopLiveMetaData", "Lfm1/l;", "A", "(Lcom/whoop/home/domain/models/WhoopLiveMetaData;)Lfm1/l;", "Lcom/whoop/home/domain/models/JournalMetaData;", "journalMetaData", "Lfm1/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lcom/whoop/home/domain/models/JournalMetaData;Lxl1/c;)Lfm1/e;", "Lcom/whoop/home/domain/models/CycleDays;", "cycleDays", "Lfm1/b;", "r", "(Lcom/whoop/home/domain/models/CycleDays;)Lfm1/b;", "Lol1/a;", "Lvm1/b;", "x", "(Lol1/a;)Lvm1/b;", "l", "(Lcom/whoop/home/domain/models/CycleDays;)Z", "Lil1/q;", "p", "(Lil1/q;)Lem1/v;", "Lzr2/a;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "c", "Ljava/util/Locale;", "Lgm1/a;", "Lsl1/c;", "Lu92/d;", "Lu92/c;", "Lhm1/b;", "Ljava/time/format/DateTimeFormatter;", "Ljava/time/format/DateTimeFormatter;", "dateTimeFormatter", "Ljb1/a;", "Ljb1/a;", "reducer", "Ltr2/n;", "k", "Ltr2/n;", "logger", "()Z", "isDayZeroCalendarFeatureFlag", "n", "isStartActivityRevampEnabled", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15996f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Locale locale;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C15991a cycleReducer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C32704c connectivityTileViewStateReducer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C34660d prefsStore;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C34659c ltoDismissStore;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C17425b streaksReducerHelper;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final DateTimeFormatter dateTimeFormatter;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C21535a reducer;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: gm1.f$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f60552a;

        static {
            int[] iArr = new int[EnumC35066c.values().length];
            try {
                iArr[EnumC35066c.SOFT_TOMBSTONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC35066c.HARD_TOMBSTONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC35066c.CDM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f60552a = iArr;
        }
    }

    public C15996f(InterfaceC41070a dateAndTimeProvider, FeatureFlagChecker featureFlagChecker, Locale locale, C15991a cycleReducer, C32704c connectivityTileViewStateReducer, C34660d prefsStore, C34659c ltoDismissStore, C17425b streaksReducerHelper) {
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(locale, "locale");
        AbstractC22676k.m65750j(cycleReducer, "cycleReducer");
        AbstractC22676k.m65750j(connectivityTileViewStateReducer, "connectivityTileViewStateReducer");
        AbstractC22676k.m65750j(prefsStore, "prefsStore");
        AbstractC22676k.m65750j(ltoDismissStore, "ltoDismissStore");
        AbstractC22676k.m65750j(streaksReducerHelper, "streaksReducerHelper");
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.featureFlagChecker = featureFlagChecker;
        this.locale = locale;
        this.cycleReducer = cycleReducer;
        this.connectivityTileViewStateReducer = connectivityTileViewStateReducer;
        this.prefsStore = prefsStore;
        this.ltoDismissStore = ltoDismissStore;
        this.streaksReducerHelper = streaksReducerHelper;
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        AbstractC22676k.m65749i(dateTimeFormatterOfPattern, "ofPattern(...)");
        this.dateTimeFormatter = dateTimeFormatterOfPattern;
        this.reducer = AbstractC15993c.m45178C();
        this.logger = InterfaceC34116n.INSTANCE.m107848a("HomeViewStateReducer");
    }

    /* JADX INFO: renamed from: A */
    private final C14608l m45266A(WhoopLiveMetaData whoopLiveMetaData) {
        return new C14608l(whoopLiveMetaData.getDayStrain(), whoopLiveMetaData.getRecoveryScore(), whoopLiveMetaData.getMsOfSleep(), whoopLiveMetaData.getCalories());
    }

    /* JADX INFO: renamed from: a */
    private final boolean m45267a(C18629f dismissAlertTileState, String id4) {
        return AbstractC25265s.m74155w0(dismissAlertTileState.m53917a(), id4);
    }

    /* JADX INFO: renamed from: b */
    private final List<AbstractC37989a> m45268b(List<? extends AbstractC37989a> fabList, boolean includeStartActivityRevamp) {
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        List<? extends AbstractC37989a> list = fabList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof AbstractC37989a.a) {
                arrayList.add(obj);
            }
        }
        AbstractC37989a.a aVar = (AbstractC37989a.a) AbstractC25265s.m74100H0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            AbstractC37989a abstractC37989a = (AbstractC37989a) obj2;
            if (abstractC37989a.getType() != EnumC22400l.START_ACTIVITY_REVAMP && !(abstractC37989a instanceof AbstractC37989a.a)) {
                arrayList2.add(obj2);
            }
        }
        c26460cM119000x.addAll(arrayList2);
        if (includeStartActivityRevamp) {
            c26460cM119000x.add(AbstractC37989a.f.f162723g);
        }
        if (aVar != null) {
            c26460cM119000x.add(aVar);
        }
        return AbstractC37056f.m118988k(c26460cM119000x);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ List m45269c(C15996f c15996f, List list, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = c15996f.m45280n();
        }
        return c15996f.m45268b(list, z4);
    }

    /* JADX INFO: renamed from: d */
    private final Map<Integer, List<CalendarDateModel>> m45270d(C18637n result) {
        Map<Integer, CalendarResponse> map = result.getCalendarResponseAccumulator().getCalendarAccumulatedList().m65297b().get(EnumC14603g.OVERVIEW);
        if (map == null) {
            map = C25272z.f99163w;
        }
        return m45271e(map);
    }

    /* JADX INFO: renamed from: e */
    private final Map<Integer, List<CalendarDateModel>> m45271e(Map<Integer, CalendarResponse> responseMap) {
        List<CalendarDateModel> daysOfMonth;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(responseMap.size()));
        Iterator<T> it = responseMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            CalendarResponse calendarResponse = (CalendarResponse) entry.getValue();
            if (calendarResponse == null || (daysOfMonth = calendarResponse.getDaysOfMonth()) == null) {
                daysOfMonth = C25271y.f99162w;
            }
            linkedHashMap.put(key, daysOfMonth);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: f */
    private final LocalDate m45272f() {
        org.joda.time.LocalDate localDateMo133365d = this.dateAndTimeProvider.mo133365d();
        LocalDate localDateOf = LocalDate.of(localDateMo133365d.getYear(), localDateMo133365d.getMonthOfYear(), localDateMo133365d.getDayOfMonth());
        AbstractC22676k.m65749i(localDateOf, "of(...)");
        return localDateOf;
    }

    /* JADX INFO: renamed from: g */
    private final AbstractC2284k m45273g(C32702a strapIndicatorResult) {
        if (!strapIndicatorResult.getIsConnected()) {
            return AbstractC2284k.c.f9074d;
        }
        if (strapIndicatorResult.getNetworkDisconnected()) {
            return AbstractC2284k.d.f9077d;
        }
        if (strapIndicatorResult.getIsOffBody()) {
            return AbstractC2284k.e.f9080d;
        }
        return strapIndicatorResult.getDataCatchingUpDomainResult().getIsDataCatchingUp() ? AbstractC2284k.b.f9071d : AbstractC2284k.a.f9068d;
    }

    /* JADX INFO: renamed from: h */
    private final C17027b<CalendarDateModel> m45274h(C18637n result) {
        LocalDate localDateM45272f = m45272f();
        return C17027b.Companion.m48086b(C17027b.INSTANCE, this.locale, localDateM45272f, result.getCurrentDateTime(), localDateM45272f, m45270d(result), AbstractC22676k.m65745e(result.getCalendarResponseAccumulator().getDomainResult(), AbstractC22564d.a.f88795a), null, 0, 192, null);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x01eb A[PHI: r15 r21
      0x01eb: PHI (r15v13 com.whoop.home.domain.models.Pillars) = 
      (r15v11 com.whoop.home.domain.models.Pillars)
      (r15v11 com.whoop.home.domain.models.Pillars)
      (r15v11 com.whoop.home.domain.models.Pillars)
      (r15v17 com.whoop.home.domain.models.Pillars)
     binds: [B:80:0x0232, B:76:0x0221, B:72:0x0210, B:63:0x01e8] A[DONT_GENERATE, DONT_INLINE]
      0x01eb: PHI (r21v7 java.util.Iterator) = (r21v5 java.util.Iterator), (r21v5 java.util.Iterator), (r21v5 java.util.Iterator), (r21v8 java.util.Iterator) binds: [B:80:0x0232, B:76:0x0221, B:72:0x0210, B:63:0x01e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x0238  */
    /* JADX WARN: Code duplicated, block: B:86:0x0249 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: i */
    private final C14599c m45275i(HomeBffFeedResponse response, AbstractC32703b alertTile, C38453c journalData, InterfaceC18631h dismissConfigCtaState, C18629f dismissAlertTileState, String currentUserId, C21770a autoPopDomainState) {
        ArrayList arrayList;
        char c3;
        ComponentItemSpacingType insetBottom;
        Iterator it;
        Pillars pillars;
        ArrayList arrayList2 = new ArrayList();
        List<Pillars> pillars2 = response.getPillars();
        int i13 = 10;
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(pillars2, 10));
        Iterator it3 = pillars2.iterator();
        while (it3.hasNext()) {
            Pillars pillars3 = (Pillars) it3.next();
            ArrayList arrayList4 = new ArrayList();
            C0140r c0140rM102648a = this.connectivityTileViewStateReducer.m102648a(alertTile);
            if (c0140rM102648a.getIsVisible()) {
                arrayList4.add(new C14597a(c0140rM102648a, null, 2, null));
            }
            for (ComponentItems componentItems : pillars3.getComponentSections()) {
                List<InterfaceC25312u> listM60540g = this.reducer.m60540g(componentItems.getItems());
                ArrayList<Object> arrayList5 = new ArrayList(AbstractC25267u.m74163i0(listM60540g, i13));
                Iterator<T> it4 = listM60540g.iterator();
                while (it4.hasNext()) {
                    arrayList5.add(AbstractC15997g.m45294b((InterfaceC25312u) it4.next(), autoPopDomainState));
                }
                if (!arrayList5.isEmpty()) {
                    for (InterfaceC25312u interfaceC25312u : arrayList5) {
                        if ((interfaceC25312u instanceof C11474i) && ((C11474i) interfaceC25312u).getType() == EnumC22400l.BEHAVIOR_IMPACTS) {
                            arrayList2.add("Impacts");
                            break;
                        }
                    }
                }
                if (!this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_XP) || response.getDayOneTransition() == null) {
                    arrayList = arrayList2;
                } else {
                    ArrayList arrayList6 = new ArrayList(AbstractC25267u.m74163i0(arrayList5, 10));
                    for (Object objCopy$default : arrayList5) {
                        if (objCopy$default instanceof DayOneTransitionViewState) {
                            objCopy$default = DayOneTransitionViewState.copy$default((DayOneTransitionViewState) objCopy$default, null, null, null, this.prefsStore.m109528e(SharedPreferenceConstants.HAS_SEEN_TRANSITION_OVERLAY, false), 7, null);
                        }
                        arrayList6.add(objCopy$default);
                        arrayList2 = arrayList2;
                    }
                    arrayList = arrayList2;
                    arrayList5 = arrayList6;
                }
                ArrayList arrayList7 = new ArrayList(AbstractC25267u.m74163i0(arrayList5, 10));
                for (Object c28801l : arrayList5) {
                    if (c28801l instanceof C28801l) {
                        C28801l c28801l2 = (C28801l) c28801l;
                        if (c28801l2.getState() instanceof AbstractC28805p.a) {
                            AbstractC28805p state = c28801l2.getState();
                            AbstractC22676k.m65748h(state, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.sectionheader.HomeSectionHeaderState.OneTitle");
                            AbstractC28805p.a aVar = (AbstractC28805p.a) state;
                            c28801l = new C28801l(AbstractC28805p.a.m87633b(aVar, null, null, null, null, null, null, false, response.getMetadata().getJournalMetaData().getJournalEnabled(), aVar.getLeadingButton() ? AbstractC28794e.m87543a(response.getMetadata().getJournalMetaData().getJournalEnabled(), m45280n()) : null, null, 639, null), c28801l2.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String());
                        } else {
                            it3 = it3;
                        }
                    } else {
                        it3 = it3;
                    }
                    arrayList7.add(c28801l);
                    it3 = it3;
                }
                Iterator it5 = it3;
                ArrayList<InterfaceC25312u> arrayList8 = new ArrayList();
                for (Iterator it6 = arrayList7.iterator(); it6.hasNext(); it6 = it) {
                    Object next = it6.next();
                    InterfaceC25312u interfaceC25312u2 = (InterfaceC25312u) next;
                    boolean z4 = interfaceC25312u2 instanceof C11474i;
                    if (z4) {
                        it = it6;
                        if (((C11474i) interfaceC25312u2).getType() == EnumC22400l.ADD_ACTIVITY) {
                            pillars = pillars3;
                            if (!m45279m(dismissConfigCtaState, response.getMetadata().getCycleMetaData().getCycleId())) {
                            }
                            pillars3 = pillars;
                        }
                        if ((z4 || ((C11474i) interfaceC25312u2).getType() != EnumC22400l.BEHAVIOR_IMPACTS || !m45279m(dismissConfigCtaState, response.getMetadata().getCycleMetaData().getCycleId())) && ((!(interfaceC25312u2 instanceof C4069m0) || !m45267a(dismissAlertTileState, ((C4069m0) interfaceC25312u2).getDismissalId())) && (!(interfaceC25312u2 instanceof C4092p2) || !m45267a(dismissAlertTileState, ((C4092p2) interfaceC25312u2).getDismissalId())))) {
                            if ((interfaceC25312u2 instanceof C3989a4) || !m45281o((C3989a4) interfaceC25312u2, currentUserId)) {
                                arrayList8.add(next);
                            }
                        }
                        pillars3 = pillars;
                    } else {
                        it = it6;
                    }
                    pillars = pillars3;
                    if (z4) {
                        if (interfaceC25312u2 instanceof C3989a4) {
                        }
                        arrayList8.add(next);
                    } else {
                        if (interfaceC25312u2 instanceof C3989a4) {
                        }
                        arrayList8.add(next);
                    }
                    pillars3 = pillars;
                }
                Pillars pillars4 = pillars3;
                ArrayList arrayList9 = new ArrayList(AbstractC25267u.m74163i0(arrayList8, 10));
                for (InterfaceC25312u interfaceC25312u3 : arrayList8) {
                    if ((interfaceC25312u3 instanceof C36213q) && ((C36213q) interfaceC25312u3).m115262b()) {
                        insetBottom = ComponentItemSpacingType.NONE;
                    } else {
                        insetBottom = componentItems.getInsetBottom();
                        if (insetBottom == null) {
                            insetBottom = ComponentItemSpacingType.COMPACT;
                        }
                    }
                    arrayList9.add(new C14597a(interfaceC25312u3, insetBottom));
                }
                arrayList4.addAll(arrayList9);
                if (arrayList9.isEmpty()) {
                    c3 = 2;
                } else {
                    c3 = 2;
                    arrayList4.add(new C14597a(new C25292c0(0.0f, 2 * 4, 1, null), null, 2, null));
                }
                pillars3 = pillars4;
                it3 = it5;
                arrayList2 = arrayList;
                i13 = 10;
            }
            Pillars pillars5 = pillars3;
            arrayList3.add(new C14602f(EnumC14603g.valueOf(pillars5.getPillarType()), pillars5.getDisplayName(), arrayList4));
            it3 = it3;
            arrayList2 = arrayList2;
            i13 = 10;
        }
        ArrayList arrayList10 = arrayList2;
        HomeResponseMetaData metadata = response.getMetadata();
        long cycleId = metadata.getCycleMetaData().getCycleId();
        LocalDate localDate = LocalDate.parse(metadata.getCycleMetaData().getCycleDays().getLowerEndpoint(), this.dateTimeFormatter);
        AbstractC22676k.m65749i(localDate, "parse(...)");
        String cycleDateDisplay = metadata.getCycleMetaData().getCycleDateDisplay();
        LocalDate localDate2 = LocalDate.parse(metadata.getCycleMetaData().getPreviousCycleDay(), this.dateTimeFormatter);
        AbstractC22676k.m65749i(localDate2, "parse(...)");
        LocalDate localDateMinusDays = LocalDate.parse(metadata.getCycleMetaData().getCycleDays().getUpperEndpoint(), this.dateTimeFormatter).minusDays(1L);
        AbstractC22676k.m65749i(localDateMinusDays, "minusDays(...)");
        LocalDate localDate3 = LocalDate.parse(metadata.getCycleMetaData().getCycleDays().getLowerEndpoint(), this.dateTimeFormatter);
        AbstractC22676k.m65749i(localDate3, "parse(...)");
        LocalDate localDate4 = LocalDate.parse(metadata.getCycleMetaData().getCycleDays().getUpperEndpoint(), this.dateTimeFormatter);
        AbstractC22676k.m65749i(localDate4, "parse(...)");
        boolean hasCycle = metadata.getJournalMetaData().getHasCycle();
        boolean hasRecovery = metadata.getJournalMetaData().getHasRecovery();
        EnumC38451a enumC38451a = null;
        C14607k c14607k = new C14607k(metadata.getUserMetaData().getAvatarUrl());
        C14608l c14608lM45266A = m45266A(metadata.getWhoopLiveMetaData());
        C14601e c14601eM45288w = m45288w(response.getMetadata().getJournalMetaData(), journalData);
        LocalDate localDate5 = LocalDate.parse(metadata.getCycleMetaData().getNextCycleDay(), this.dateTimeFormatter);
        AbstractC22676k.m65749i(localDate5, "parse(...)");
        boolean multiDayCycle = metadata.getCycleMetaData().getMultiDayCycle();
        boolean zIsGDCFlow = metadata.getCycleMetaData().isGDCFlow();
        String sleepState = metadata.getCycleMetaData().getSleepState();
        String displayCycleState = metadata.getJournalMetaData().getDisplayCycleState();
        if (displayCycleState == null) {
            displayCycleState = "";
        }
        String str = displayCycleState;
        EnumC38451a enumC38451a2 = EnumC38451a.ADD_SLEEP;
        EnumC38451a[] enumC38451aArrValues = EnumC38451a.values();
        int length = enumC38451aArrValues.length;
        int i14 = 0;
        while (i14 < length) {
            EnumC38451a enumC38451a3 = enumC38451aArrValues[i14];
            int i15 = i14;
            if (AbstractC22676k.m65745e(enumC38451a3.name(), str)) {
                enumC38451a = enumC38451a3;
                break;
            }
            i14 = i15 + 1;
        }
        return new C14599c(arrayList3, new C14600d(cycleId, localDate, cycleDateDisplay, localDate2, localDateMinusDays, localDate3, localDate4, hasCycle, hasRecovery, c14607k, c14608lM45266A, c14601eM45288w, localDate5, multiDayCycle, sleepState, Boolean.valueOf(zIsGDCFlow), arrayList10, metadata.getExperimentIds(), enumC38451a == null ? enumC38451a2 : enumC38451a));
    }

    /* JADX INFO: renamed from: j */
    private final C13348v m45276j(C18637n result, boolean showUpdating) {
        C37992d c37992dM45286u;
        DayOneTransition dayOneTransition;
        HomeBffFeedResponse bffFeed = result.getBffFeed();
        C18613a c18613aM45290y = (bffFeed == null || (dayOneTransition = bffFeed.getDayOneTransition()) == null) ? null : m45290y(dayOneTransition);
        HomeBffFeedResponse bffFeed2 = result.getBffFeed();
        if (bffFeed2 == null) {
            return new C13348v(false, false, EnumC13339m.OFFLINE, false, null, null, 0, null, null, new C18614b(null, false, false, null, m45282q(result.getStrapStatusIconIndicatorResult()), false, false, false, false, false, MessageListItemViewType.TYPING_INDICATOR, null), m45284s(), null, null, null, null, null, null, null, null, false, false, false, null, null, 16775674, null);
        }
        boolean zM65745e = AbstractC22676k.m65745e(bffFeed2.getMetadata().getCycleMetaData().isDayZero(), Boolean.TRUE);
        boolean zM65745e2 = AbstractC22676k.m65745e(result.getCurrentDateTime(), m45272f());
        boolean multiDayCycle = bffFeed2.getMetadata().getCycleMetaData().getMultiDayCycle();
        C13338l c13338lM45285t = m45285t(result.getHomeDialogDomainResult(), c18613aM45290y);
        C17425b.a aVarM49454b = this.streaksReducerHelper.m49454b(result, c13338lM45285t, zM65745e2);
        boolean z4 = true;
        boolean z13 = showUpdating && result.getRefreshType() != EnumC13344r.PULL_TO_REFRESH;
        boolean z14 = showUpdating && result.getRefreshType() == EnumC13344r.PULL_TO_REFRESH;
        C17027b<CalendarDateModel> c17027bM45274h = m45274h(result);
        C14599c c14599cM45275i = m45275i(bffFeed2, result.getConnectivityTileType(), result.getJournalData(), result.getDismissConfigCtaState(), result.getDismissAlertTileState(), result.getCurrentUserId(), result.getAutoPopDomainState());
        TextResource textResourceM21278l = AbstractC8693b.m21278l(bffFeed2.getMetadata().getCycleMetaData().getCycleDateDisplay());
        String avatarUrl = bffFeed2.getMetadata().getUserMetaData().getAvatarUrl();
        if (avatarUrl == null) {
            avatarUrl = "";
        }
        String str = avatarUrl;
        C38072d c38072d = C38072d.f163053a;
        AbstractC22403o.c cVar = new AbstractC22403o.c(str, c38072d.m121951d().getVarious().getMyAccount(), c38072d.m121951d().getVarious().getMyAccount(), 0, 8, null);
        if (zM65745e && m45277k()) {
            z4 = false;
        }
        C18614b c18614b = new C18614b(textResourceM21278l, m45278l(bffFeed2.getMetadata().getCycleMetaData().getCycleDays()), z4, cVar, m45282q(result.getStrapStatusIconIndicatorResult()), false, (zM65745e && m45277k()) ? false : z4, result.getShouldShowGiftIconNewIndicator(), zM65745e2, multiDayCycle, 32, null);
        LocalDate currentDateTime = result.getCurrentDateTime();
        C0140r c0140rM102648a = this.connectivityTileViewStateReducer.m102648a(result.getConnectivityTileType());
        int pillarChangeIndex = result.getPillarChangeIndex();
        FabMenuModel fabMenu = result.getBffFeed().getFabMenu();
        if (fabMenu != null) {
            C18284j c18284jM118950B = AbstractC37056f.m118950B(fabMenu.getElements());
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM118950B, 10));
            Iterator it = c18284jM118950B.iterator();
            while (it.hasNext()) {
                arrayList.add(fabMenu.getElements().get((fabMenu.getElements().size() - 1) - ((AbstractC25243e0) it).nextInt()));
            }
            c37992dM45286u = m45286u(arrayList, result.getOnboardingDomainState());
        } else {
            c37992dM45286u = null;
        }
        AbstractC36155b abstractC36155bM45289x = m45289x(result.getProcessNowDomainResult());
        C1005b c1005bM45291z = m45291z(result);
        EnumC37944c enumC37944c = EnumC37944c.DYNAMIC;
        C32715a c32715aM45287v = m45287v(result.getHideRecoveryDomainState());
        boolean z15 = (!this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_XP) || (result.getDayOneTransitionDomainState().getShouldShowOverviewTabs() && result.getBffFeed().getPillars().size() > z4)) ? z4 : false;
        DesignSystemModel header = result.getBffFeed().getHeader();
        return new C13348v(false, z13, null, z14, c1005bM45291z, c14599cM45275i, pillarChangeIndex, c17027bM45274h, header != null ? this.reducer.m60541h(header) : null, c18614b, c37992dM45286u, currentDateTime, c0140rM102648a, c13338lM45285t, abstractC36155bM45289x, enumC37944c, c32715aM45287v, null, c18613aM45290y, z15, result.getShouldRequestPermissions(), result.getWeeklyPlanHomeTileDomainState().getIsExpanded(), aVarM49454b.getStreaksHomeViewState(), result.getInAppReviewDomainState(), 131076, null);
    }

    /* JADX INFO: renamed from: k */
    private final boolean m45277k() {
        return this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.DAY_ZERO_CALENDAR_BLOCK);
    }

    /* JADX INFO: renamed from: l */
    private final boolean m45278l(CycleDays cycleDays) {
        return !this.cycleReducer.m45175a(cycleDays, this.dateTimeFormatter);
    }

    /* JADX INFO: renamed from: m */
    private final boolean m45279m(InterfaceC18631h dismissConfigCtaState, long cycleId) {
        if (AbstractC22676k.m65745e(dismissConfigCtaState, InterfaceC18631h.b.f72868a) || AbstractC22676k.m65745e(dismissConfigCtaState, InterfaceC18631h.c.f72869a)) {
            return true;
        }
        if (dismissConfigCtaState instanceof InterfaceC18631h.d) {
            return cycleId == ((InterfaceC18631h.d) dismissConfigCtaState).getCycleId();
        }
        if (AbstractC22676k.m65745e(dismissConfigCtaState, InterfaceC18631h.a.f72867a)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: n */
    private final boolean m45280n() {
        return this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.START_ACTIVITY_REVAMP);
    }

    /* JADX INFO: renamed from: o */
    private final boolean m45281o(C3989a4 viewState, String currentUserId) {
        return this.ltoDismissStore.m109519e(currentUserId, viewState.getOfferId());
    }

    /* JADX INFO: renamed from: q */
    private final C2281h m45282q(C32702a strapIndicatorResult) {
        AbstractC2282i cVar;
        if (!strapIndicatorResult.getIsConnected()) {
            return new C2281h(AbstractC8693b.m21278l("--%"), false, m45273g(strapIndicatorResult), AbstractC2282i.e.f9060f, 2, null);
        }
        if (strapIndicatorResult.getIsCharging() && strapIndicatorResult.getDataCatchingUpDomainResult().getIsDataCatchingUp()) {
            cVar = new AbstractC2282i.a(strapIndicatorResult.getDataCatchingUpDomainResult().getMinutesBehind());
        } else if (strapIndicatorResult.getIsCharging()) {
            cVar = AbstractC2282i.b.f9057f;
        } else if (strapIndicatorResult.getChargePercent() < 20 && strapIndicatorResult.getDataCatchingUpDomainResult().getIsDataCatchingUp()) {
            cVar = new AbstractC2282i.f(strapIndicatorResult.getDataCatchingUpDomainResult().getMinutesBehind());
        } else if (strapIndicatorResult.getChargePercent() < 20) {
            cVar = AbstractC2282i.g.f9062f;
        } else if (strapIndicatorResult.getIsOffBody()) {
            cVar = AbstractC2282i.h.f9063f;
        } else {
            cVar = strapIndicatorResult.getDataCatchingUpDomainResult().getIsDataCatchingUp() ? new AbstractC2282i.c(strapIndicatorResult.getDataCatchingUpDomainResult().getMinutesBehind()) : AbstractC2282i.d.f9059f;
        }
        return new C2281h(AbstractC8693b.m21278l(strapIndicatorResult.getChargePercent() + "%"), strapIndicatorResult.getChargePercent() < 20, m45273g(strapIndicatorResult), cVar);
    }

    /* JADX INFO: renamed from: r */
    private final C14598b m45283r(CycleDays cycleDays) {
        if (cycleDays.getLowerEndpoint() == null || cycleDays.getLowerBoundType() == null || cycleDays.getUpperEndpoint() == null || cycleDays.getUpperBoundType() == null) {
            return null;
        }
        Period period = new Period(cycleDays.getLowerEndpoint(), cycleDays.getUpperEndpoint());
        return new C14598b(period.getLower().getMillis(), cycleDays.getLowerBoundType(), period.getUpper().getMillis(), cycleDays.getUpperBoundType());
    }

    /* JADX INFO: renamed from: s */
    private final C37992d m45284s() {
        return new C37992d(m45269c(this, new C37992d(null, null, 3, null).m121719c(), false, 2, null), null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    /* JADX INFO: renamed from: t */
    private final C13338l m45285t(AbstractC35065b result, C18613a dayOneOverlayState) {
        boolean z4;
        if (result.getIsVisible()) {
            int i13 = a.f60552a[result.getType().ordinal()];
            if (i13 == 1 || i13 == 2 || i13 == 3 || dayOneOverlayState == null || !dayOneOverlayState.getDisplay()) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        EnumC35066c type = result.getType();
        TextResource title = result.getTitle();
        TextResource subtitle = result.getSubtitle();
        TextResource primaryActionText = result.getPrimaryActionText();
        InterfaceC39332e primaryActionTextColor = result.getPrimaryActionTextColor();
        TextResource secondaryActionText = result.getSecondaryActionText();
        Integer icon = result.getIcon();
        boolean isDismissable = result.getIsDismissable();
        boolean z13 = result instanceof AbstractC35065b.k;
        if (z13) {
        }
        return new C13338l(z4, type, title, subtitle, primaryActionText, primaryActionTextColor, secondaryActionText, result.getUseSolidCtaButtons(), result.getTopDialogStyle(), icon, isDismissable, z13, null, result.getShowCloseIcon() && result.getIsDismissable());
    }

    /* JADX INFO: renamed from: u */
    private final C37992d m45286u(List<FabModel> fabItems, C1005b onboardingDomainState) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = fabItems.iterator();
        while (true) {
            boolean zBooleanValue = false;
            if (!it.hasNext()) {
                arrayList.add(new AbstractC37989a.a(!onboardingDomainState.getHasSeenFabOnboarding()));
                return new C37992d(m45269c(this, arrayList, false, 2, null), null, 2, null);
            }
            FabModel fabModel = (FabModel) it.next();
            C39274g c39274g = new C39274g(EnumC16313m0.valueOf(fabModel.getIcon()).toWhoopIcon(), AbstractC8693b.m21278l(fabModel.getCta().name()));
            TextResource title = fabModel.getTitle();
            Boolean boolIsHighlighted = fabModel.isHighlighted();
            if (boolIsHighlighted != null) {
                zBooleanValue = boolIsHighlighted.booleanValue();
            }
            arrayList.add(new AbstractC37989a.c(c39274g, title, zBooleanValue, fabModel.getCta().name(), fabModel.getCta()));
        }
    }

    /* JADX INFO: renamed from: v */
    private final C32715a m45287v(C36103a hideRecoveryDomainState) {
        return new C32715a(hideRecoveryDomainState.getIsLoading(), hideRecoveryDomainState.getIsGeneralError(), hideRecoveryDomainState.getIsEnabled());
    }

    /* JADX INFO: renamed from: w */
    private final C14601e m45288w(JournalMetaData journalMetaData, C38453c journalData) {
        return new C14601e(journalData.getShouldShowJournalTutorial(), journalData.getShouldShowJournal(), journalMetaData.getJournalCompleted(), m45283r(journalMetaData.getPreviousCycleDuring()));
    }

    /* JADX INFO: renamed from: x */
    private final AbstractC36155b m45289x(AbstractC28015a result) {
        if (AbstractC22676k.m65745e(result, AbstractC28015a.b.f112982a)) {
            return null;
        }
        if (result instanceof AbstractC28015a.c) {
            return new AbstractC36155b.b(((AbstractC28015a.c) result).getProcessingText());
        }
        if (result instanceof AbstractC28015a.d) {
            AbstractC28015a.d dVar = (AbstractC28015a.d) result;
            return new AbstractC36155b.c(dVar.getTitle(), dVar.getDescription());
        }
        if (!(result instanceof AbstractC28015a.a)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC28015a.a aVar = (AbstractC28015a.a) result;
        return new AbstractC36155b.a(aVar.getTitle(), aVar.getDescription(), aVar.getCtaText());
    }

    /* JADX INFO: renamed from: y */
    private final C18613a m45290y(DayOneTransition dayOneTransition) {
        boolean z4 = true;
        if (this.prefsStore.m109527d().contains(SharedPreferenceConstants.HAS_SEEN_TRANSITION_OVERLAY) && (this.prefsStore.m109528e(SharedPreferenceConstants.HAS_SEEN_TRANSITION_OVERLAY, true) || !this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_XP))) {
            z4 = false;
        }
        return new C18613a(z4, new AbstractC22403o.c(dayOneTransition.getImageUrl(), AbstractC14568a.f53556a, 0, 0, 12, null), AbstractC8693b.m21267a(), AbstractC8693b.m21278l(dayOneTransition.getTitle()), AbstractC8693b.m21278l(dayOneTransition.getBody()), AbstractC8693b.m21278l(dayOneTransition.getCtaText()), dayOneTransition.getOnboardingFeature());
    }

    /* JADX INFO: renamed from: z */
    private final C1005b m45291z(C18637n result) {
        return C1005b.m2716b(result.getOnboardingDomainState(), this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_XP) || result.getOnboardingDomainState().getHasSeenNewHome(), false, 2, null);
    }

    /* JADX INFO: renamed from: p */
    public final C13348v m45292p(InterfaceC18640q result) {
        EnumC13339m enumC13339m;
        AbstractC22676k.m65750j(result, "result");
        if (!(result instanceof InterfaceC18640q.a)) {
            if (result instanceof InterfaceC18640q.d) {
                return m45276j(((InterfaceC18640q.d) result).getHomeData(), true);
            }
            if (result instanceof InterfaceC18640q.b) {
                return new C13348v(true, false, null, false, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, 16777212, null);
            }
            if (result instanceof InterfaceC18640q.c) {
                return m45276j(((InterfaceC18640q.c) result).getHomeData(), false);
            }
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC18640q.a aVar = (InterfaceC18640q.a) result;
        if (aVar.getHomeData().getBffFeed() != null) {
            return m45276j(aVar.getHomeData(), false);
        }
        if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.HOME_FUTURE_IA) || this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA)) {
            enumC13339m = aVar.getNetworkError() ? EnumC13339m.OFFLINE : EnumC13339m.SERVER_ERROR;
        } else {
            enumC13339m = EnumC13339m.LEGACY;
        }
        return new C13348v(false, false, enumC13339m, false, null, null, 0, null, null, null, m45284s(), null, null, null, null, null, null, null, null, false, false, false, null, null, 16776184, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C15996f(InterfaceC41070a interfaceC41070a, FeatureFlagChecker featureFlagChecker, Locale locale, C15991a c15991a, C32704c c32704c, C34660d c34660d, C34659c c34659c, C17425b c17425b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 4) != 0) {
            locale = Locale.getDefault();
            AbstractC22676k.m65749i(locale, "getDefault(...)");
        }
        this(interfaceC41070a, featureFlagChecker, locale, c15991a, (i13 & 16) != 0 ? new C32704c() : c32704c, c34660d, c34659c, c17425b);
    }
}
