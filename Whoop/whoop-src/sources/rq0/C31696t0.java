package rq0;

import android.animation.ValueAnimator;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.recyclerview.widget.AbstractC1740u1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b13.ViewOnClickListenerC2292a;
import c93.InterfaceC4339a;
import com.bumptech.glide.C4964f;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.mapbox.common.HttpHeaders;
import com.whoop.community.domain.model.teams.TimePeriod;
import com.whoop.community.presentation.p059ui.ParallaxHeaderBehavior;
import com.whoop.community.presentation.p059ui.PillRadioGroup;
import com.whoop.community.presentation.teams.calendar.TeamCalendarView;
import com.whoop.data.repositories.FeatureFlagRepository;
import com.whoop.domain.model.teams.LeadersEntry;
import com.whoop.domain.model.teams.Team;
import com.whoop.domain.model.teams.TeamType;
import com.whoop.domain.model.teams.TeamUserListing;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.AbstractC10538f;
import com.whoop.p069ui.C10462b;
import com.whoop.p069ui.ScoreContext;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import e50.C12724c;
import eq0.AbstractC13552x1;
import ge3.AbstractC15751g;
import hj0.AbstractC17354m;
import ih0.AbstractC18489d0;
import il.C18615a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21155m0;
import j02.InterfaceC21159o0;
import j93.InterfaceC21493z;
import java.io.Serializable;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import nf1.AbstractC26666g;
import od1.InterfaceC27837a0;
import or2.AbstractC28163g0;
import or2.C28204u;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import p031b9.AbstractC2875y;
import p087db.ViewOnClickListenerC11877u;
import p088dc.AbstractC11895b;
import p217ib.AbstractC18317n;
import p404pq.AbstractC29455c;
import p413q4.C29960e;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pf.AbstractC29125c;
import q11.C29793c;
import q83.AbstractC30060g;
import rm2.C31604d;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import vu1.AbstractC36510a;
import vu1.AbstractC36517h;
import wb3.AbstractC37056f;
import xp0.AbstractC38499a0;
import xp0.AbstractC38505d0;
import xp0.AbstractC38529z;
import yb3.AbstractC39421y;
import z82.C40191e;

/* JADX INFO: renamed from: rq0.t0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 ¤\u00012\u00020\u0001:\u0002¥\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\r\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0003J'\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000eH\u0002¢\u0006\u0004\b+\u0010\u0003J\u000f\u0010,\u001a\u00020\u000eH\u0002¢\u0006\u0004\b,\u0010\u0003J\u0017\u0010/\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u000eH\u0002¢\u0006\u0004\b1\u0010\u0003J\u000f\u00102\u001a\u00020\u000eH\u0002¢\u0006\u0004\b2\u0010\u0003J\u0017\u00103\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b3\u00100J\u0017\u00105\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u0018H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020$H\u0002¢\u0006\u0004\b7\u00108J#\u0010;\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010$2\b\u0010:\u001a\u0004\u0018\u000109H\u0002¢\u0006\u0004\b;\u0010<J!\u0010=\u001a\u00020\u000e2\b\u0010:\u001a\u0004\u0018\u0001092\u0006\u0010\u0019\u001a\u00020$H\u0002¢\u0006\u0004\b=\u0010>J\u001f\u0010@\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010?\u001a\u00020\u001dH\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bD\u0010EJ\u001f\u0010F\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020B2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\bF\u0010GJ!\u0010H\u001a\u00020'2\b\u0010:\u001a\u0004\u0018\u0001092\u0006\u0010\u0019\u001a\u00020$H\u0002¢\u0006\u0004\bH\u0010IJ\u001f\u0010J\u001a\u00020\u00182\u0006\u0010:\u001a\u0002092\u0006\u0010\u0019\u001a\u00020$H\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020$H\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010O\u001a\u00020\u000e2\u0006\u0010N\u001a\u000209H\u0002¢\u0006\u0004\bO\u0010PJ\u0017\u0010T\u001a\u00020S2\u0006\u0010R\u001a\u00020QH\u0002¢\u0006\u0004\bT\u0010UR\u001b\u0010[\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u001b\u0010`\u001a\u00020\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010X\u001a\u0004\b^\u0010_R\u001a\u0010e\u001a\u00020\u00188\u0016X\u0096D¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR+\u0010n\u001a\u00020f2\u0006\u0010g\u001a\u00020f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010v\u001a\u00020s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u001b\u0010{\u001a\u00020w8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bx\u0010X\u001a\u0004\by\u0010zR&\u0010\u0081\u0001\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020~0}\u0018\u00010|8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001c\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001a\u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0019\u0010\u008c\u0001\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R3\u0010\u0093\u0001\u001a\u00030\u008d\u00012\u0007\u0010g\u001a\u00030\u008d\u00018B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0005\b\u008e\u0001\u0010i\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001c\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0094\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\u009b\u0001\u001a\u00030\u0098\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0018\u0010\u009d\u0001\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010\u007fR\u0019\u0010\u009f\u0001\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u008b\u0001R\u001f\u0010£\u0001\u001a\u00020S8\u0014X\u0094D¢\u0006\u0010\n\u0006\b \u0001\u0010\u008b\u0001\u001a\u0006\b¡\u0001\u0010¢\u0001¨\u0006¦\u0001"}, m65681d2 = {"Lrq0/t0;", "Lhj0/m;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onDestroyView", "onPause", "D0", "G0", "Lcom/whoop/community/domain/model/teams/TimePeriod;", "timePeriod", "", "sortOption", "value", "A0", "(Lcom/whoop/community/domain/model/teams/TimePeriod;Ljava/lang/String;Ljava/lang/String;)V", "Lorg/joda/time/LocalDate;", "previousLocalDate", "e0", "(Lorg/joda/time/LocalDate;)Ljava/lang/String;", "Lcom/whoop/ui/ScoreContext;", "scoreContext", "", "Lrq0/v0;", "h0", "(Lcom/whoop/ui/ScoreContext;)Ljava/util/List;", "", "index", "C0", "(I)V", "s0", "x0", "Lrq0/i1;", "state", "X0", "(Lrq0/i1;)V", "z0", "p0", "n0", "bannerUrl", "b0", "(Ljava/lang/String;)V", "V0", "(Lrq0/v0;)V", "Lcom/whoop/domain/model/teams/TeamUserListing;", "userData", "W0", "(Lrq0/v0;Lcom/whoop/domain/model/teams/TeamUserListing;)V", "R0", "(Lcom/whoop/domain/model/teams/TeamUserListing;Lrq0/v0;)V", HttpHeaders.DATE, "S0", "(Lcom/whoop/community/domain/model/teams/TimePeriod;Lorg/joda/time/LocalDate;)V", "Lorg/joda/time/LocalDateTime;", "lastUpdatedAt", "T0", "(Lorg/joda/time/LocalDateTime;)V", "U0", "(Lorg/joda/time/LocalDateTime;Lcom/whoop/ui/ScoreContext;)V", "c0", "(Lcom/whoop/domain/model/teams/TeamUserListing;Lrq0/v0;)I", "d0", "(Lcom/whoop/domain/model/teams/TeamUserListing;Lrq0/v0;)Ljava/lang/String;", "g0", "(Lrq0/v0;)Ljava/lang/String;", "userListing", "m0", "(Lcom/whoop/domain/model/teams/TeamUserListing;)V", "Ljava/util/Calendar;", "calendar", "", "l0", "(Ljava/util/Calendar;)Z", "Lod1/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "j0", "()Lod1/a0;", "userManager", "Lj02/o0;", "x", "getNavigator", "()Lj02/o0;", "navigator", "y", "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "Leq0/x1;", "<set-?>", "z", "Lcom/whoop/ui/b;", "f0", "()Leq0/x1;", "B0", "(Leq0/x1;)V", "fragmentTeamsBoardV1Binding", "E", "Lcom/whoop/ui/ScoreContext;", "F", "Lcom/whoop/community/domain/model/teams/TimePeriod;", "Lcom/whoop/domain/model/teams/TeamType;", "G", "Lcom/whoop/domain/model/teams/TeamType;", "teamType", "Lrq0/h1;", "H", "k0", "()Lrq0/h1;", "viewModel", "Landroidx/lifecycle/p0;", "Lib/n;", "Lcom/whoop/domain/model/teams/LeadersEntry;", "I", "Landroidx/lifecycle/p0;", "observedDataSource", "Lrq0/c1;", "J", "Lrq0/c1;", "listAdapter", "Lcom/whoop/community/presentation/ui/ParallaxHeaderBehavior;", "K", "Lcom/whoop/community/presentation/ui/ParallaxHeaderBehavior;", "scrollBehavior", "L", "Z", "teamLoaded", "Lrq0/d1;", "M", "i0", "()Lrq0/d1;", "F0", "(Lrq0/d1;)V", "userItemHolder", "Landroid/animation/ValueAnimator;", "N", "Landroid/animation/ValueAnimator;", "userItemAnimator", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "O", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "featureFlagRepository", "P", "currentSortOptionIndex", "Q", "skipLog", "R", "getShowBottomNavigationBar", "()Z", "showBottomNavigationBar", "S", "a", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31696t0 extends AbstractC17354m {

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: T */
    static final /* synthetic */ InterfaceC21493z[] f131224T;

    /* JADX INFO: renamed from: U */
    public static final int f131225U;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private ScoreContext scoreContext;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private TimePeriod timePeriod;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private TeamType teamType;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private AbstractC1615p0 observedDataSource;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private C31656c1 listAdapter;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private ParallaxHeaderBehavior scrollBehavior;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private boolean teamLoaded;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final C10462b userItemHolder;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private ValueAnimator userItemAnimator;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final FeatureFlagRepository featureFlagRepository;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private int currentSortOptionIndex;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private boolean skipLog;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final boolean showBottomNavigationBar;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h userManager;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C10462b fragmentTeamsBoardV1Binding;

    /* JADX INFO: renamed from: rq0.t0$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lrq0/t0$a;", "", "<init>", "()V", "Lcom/whoop/ui/ScoreContext;", "scoreContext", "Lcom/whoop/domain/model/teams/TeamType;", "teamType", "Lcom/whoop/community/domain/model/teams/TimePeriod;", "timePeriod", "", "sortBy", "Lrq0/t0;", "b", "(Lcom/whoop/ui/ScoreContext;Lcom/whoop/domain/model/teams/TeamType;Lcom/whoop/community/domain/model/teams/TimePeriod;I)Lrq0/t0;", "", "a", "(Lcom/whoop/ui/ScoreContext;)Ljava/lang/String;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: rq0.t0$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class C42285a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f131244a;

            static {
                int[] iArr = new int[ScoreContext.values().length];
                try {
                    iArr[ScoreContext.OVERVIEW.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ScoreContext.STRAIN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ScoreContext.RECOVERY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ScoreContext.SLEEP.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f131244a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m98266a(ScoreContext scoreContext) {
            AbstractC22676k.m65750j(scoreContext, "scoreContext");
            int i13 = C42285a.f131244a[scoreContext.ordinal()];
            if (i13 == 1) {
                return "Team Overview";
            }
            if (i13 == 2) {
                return "Team Strain";
            }
            if (i13 == 3) {
                return "Team Recovery";
            }
            if (i13 == 4) {
                return "Team Sleep";
            }
            throw new IllegalArgumentException();
        }

        /* JADX INFO: renamed from: b */
        public final C31696t0 m98267b(ScoreContext scoreContext, TeamType teamType, TimePeriod timePeriod, int sortBy) {
            AbstractC22676k.m65750j(scoreContext, "scoreContext");
            AbstractC22676k.m65750j(teamType, "teamType");
            AbstractC22676k.m65750j(timePeriod, "timePeriod");
            C31696t0 c31696t0 = new C31696t0();
            c31696t0.obtainArguments().putSerializable("scoreContext", scoreContext);
            c31696t0.obtainArguments().putSerializable("teamType", teamType);
            c31696t0.obtainArguments().putSerializable("timePeriod", timePeriod);
            c31696t0.obtainArguments().putInt("sortBy", sortBy);
            return c31696t0;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: rq0.t0$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f131245a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f131246b;

        static {
            int[] iArr = new int[TimePeriod.values().length];
            try {
                iArr[TimePeriod.DAILY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimePeriod.WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimePeriod.MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f131245a = iArr;
            int[] iArr2 = new int[ScoreContext.values().length];
            try {
                iArr2[ScoreContext.STRAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ScoreContext.RECOVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ScoreContext.SLEEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f131246b = iArr2;
        }
    }

    /* JADX INFO: renamed from: rq0.t0$c */
    @Metadata(m65680d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"rq0/t0$c", "Lpq/c;", "Landroid/view/View;", "bottomSheet", "", "newState", "Ll83/a0;", "c", "(Landroid/view/View;I)V", "", "slideOffset", "b", "(Landroid/view/View;F)V", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC29455c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ TeamCalendarView f131247a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C31696t0 f131248b;

        public c(TeamCalendarView teamCalendarView, C31696t0 c31696t0) {
            this.f131247a = teamCalendarView;
            this.f131248b = c31696t0;
        }

        @Override // p404pq.AbstractC29455c
        /* JADX INFO: renamed from: b */
        public void mo5841b(View bottomSheet, float slideOffset) {
            AbstractC22676k.m65750j(bottomSheet, "bottomSheet");
        }

        @Override // p404pq.AbstractC29455c
        /* JADX INFO: renamed from: c */
        public void mo5842c(View bottomSheet, int newState) {
            AbstractC22676k.m65750j(bottomSheet, "bottomSheet");
            if (newState == 2) {
                this.f131247a.setType(this.f131248b.m98249k0().getSelectedTimePeriod());
            } else {
                if (newState != 3) {
                    return;
                }
                this.f131247a.setType(this.f131248b.m98249k0().getSelectedTimePeriod());
            }
        }
    }

    /* JADX INFO: renamed from: rq0.t0$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f131249w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f131250x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f131251y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f131249w = componentCallbacks;
            this.f131250x = interfaceC35951a;
            this.f131251y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od1.a0] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC27837a0 invoke() {
            ComponentCallbacks componentCallbacks = this.f131249w;
            InterfaceC35951a interfaceC35951a = this.f131250x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f131251y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC27837a0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: rq0.t0$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f131252w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f131253x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f131254y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f131252w = componentCallbacks;
            this.f131253x = interfaceC35951a;
            this.f131254y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f131252w;
            InterfaceC35951a interfaceC35951a = this.f131253x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f131254y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: rq0.t0$f */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f131255w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f131255w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.f131255w.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity()");
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity2 = this.f131255w.requireActivity();
            C1579e2 viewModelStore = abstractActivityC1340r0RequireActivity.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, abstractActivityC1340r0RequireActivity2);
        }
    }

    /* JADX INFO: renamed from: rq0.t0$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f131256w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f131257x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f131258y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f131259z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f131256w = abstractComponentCallbacksC1320m0;
            this.f131257x = interfaceC35951a;
            this.f131258y = interfaceC4339a;
            this.f131259z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, rq0.h1] */
        @Override // c93.InterfaceC4339a
        public final C31671h1 invoke() {
            return AbstractC37056f.m118952D(this.f131256w, this.f131257x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C31671h1.class), this.f131258y, this.f131259z);
        }
    }

    static {
        C22686q c22686q = new C22686q(C31696t0.class, "fragmentTeamsBoardV1Binding", "getFragmentTeamsBoardV1Binding()Lcom/whoop/community/databinding/FragmentTeamsBoardV1Binding;", 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f131224T = new InterfaceC21493z[]{c22673i0.mutableProperty1(c22686q), AbstractC11895b.m31990i(C31696t0.class, "userItemHolder", "getUserItemHolder()Lcom/whoop/community/presentation/teams/TeamsListHolder;", 0, c22673i0)};
        INSTANCE = new Companion(null);
        f131225U = 8;
    }

    public C31696t0() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.userManager = AbstractC30060g.m92087G(enumC23463i, new d(this, null, null));
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new e(this, null, new C31682m0(this, 0)));
        this.logTag = "TeamsBoardFragment";
        this.fragmentTeamsBoardV1Binding = AbstractC10463c.m26726c(this, null, 1, null);
        this.teamType = TeamType.COMMUNITY;
        this.viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new g(this, null, new f(this), null));
        this.userItemHolder = AbstractC10463c.m26726c(this, null, 1, null);
        this.featureFlagRepository = (FeatureFlagRepository) AbstractC29125c.m88492A(this).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagRepository.class), null);
    }

    /* JADX INFO: renamed from: A0 */
    private final void m98192A0(TimePeriod timePeriod, String sortOption, String value) {
        String str;
        if (this.skipLog) {
            this.skipLog = false;
            return;
        }
        int i13 = b.f131245a[timePeriod.ordinal()];
        if (i13 == 1) {
            str = "Daily";
        } else if (i13 == 2) {
            str = "Weekly";
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "Monthly";
        }
        C40191e eventDispatcher = getEventDispatcher();
        Team teamM98033c0 = m98249k0().m98033c0();
        eventDispatcher.m129016T0(sortOption, str, value, String.valueOf(teamM98033c0 != null ? Integer.valueOf(teamM98033c0.getId()) : null));
    }

    /* JADX INFO: renamed from: B0 */
    private final void m98193B0(AbstractC13552x1 abstractC13552x1) {
        this.fragmentTeamsBoardV1Binding.setValue(this, f131224T[0], abstractC13552x1);
    }

    /* JADX INFO: renamed from: C0 */
    private final void m98194C0(int index) {
        AbstractC13552x1 abstractC13552x1M98244f0 = m98244f0();
        abstractC13552x1M98244f0.f47753h.f47562h.m19546k(index);
        abstractC13552x1M98244f0.f47747b.f47686d.m19546k(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final C23454a0 m98196E0(C31696t0 c31696t0) {
        c31696t0.m98194C0(c31696t0.m98249k0().getSelectedTimePeriod().ordinal());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: F0 */
    private final void m98198F0(C31659d1 c31659d1) {
        this.userItemHolder.setValue(this, f131224T[1], c31659d1);
    }

    /* JADX INFO: renamed from: G0 */
    private final void m98200G0() {
        final AbstractC13552x1 abstractC13552x1M98244f0 = m98244f0();
        final TeamCalendarView teamCalendarView = abstractC13552x1M98244f0.f47747b.f47698p;
        AbstractC22676k.m65749i(teamCalendarView, "teamCalendarView");
        final BottomSheetBehavior bottomSheetBehaviorM15688O = BottomSheetBehavior.m15688O(abstractC13552x1M98244f0.f47747b.f47694l);
        abstractC13552x1M98244f0.f47747b.f47693k.setOnClickListener(new ViewOnClickListenerC31694s0(1));
        int i13 = 2;
        abstractC13552x1M98244f0.f47747b.f47694l.setOnClickListener(new ViewOnClickListenerC31694s0(i13));
        bottomSheetBehaviorM15688O.m15701W(5);
        bottomSheetBehaviorM15688O.m15700V(0);
        bottomSheetBehaviorM15688O.f20782J = true;
        abstractC13552x1M98244f0.f47753h.f47562h.m19545i(new C31682m0(this, i13));
        bottomSheetBehaviorM15688O.m15690I(new c(teamCalendarView, this));
        abstractC13552x1M98244f0.f47753h.f47559e.setOnClickListener(new ViewOnClickListenerC11877u(bottomSheetBehaviorM15688O, teamCalendarView, this, abstractC13552x1M98244f0, i13));
        teamCalendarView.m19512g(Calendar.getInstance().getTime(), TimePeriod.DAILY);
        m98249k0().m98045u0(LocalDate.now());
        abstractC13552x1M98244f0.f47747b.f47695m.setText(teamCalendarView.getDisplayMonth());
        abstractC13552x1M98244f0.f47747b.f47686d.setOnItemChangeListener(new C31703x(teamCalendarView, 3));
        abstractC13552x1M98244f0.f47753h.f47562h.setOnItemChangeListener(new C29793c(20, this, abstractC13552x1M98244f0));
        ScoreContext scoreContext = this.scoreContext;
        if (scoreContext == null) {
            AbstractC22676k.m65757q("scoreContext");
            throw null;
        }
        final List<C31700v0> listM98246h0 = m98246h0(scoreContext);
        PillRadioGroup pillRadioGroup = abstractC13552x1M98244f0.f47747b.f47697o;
        List<C31700v0> list = listM98246h0;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (C31700v0 c31700v0 : list) {
            String string = c31700v0.getSortType() == 1 ? getResources().getString(AbstractC38505d0.f165716t) : c31700v0.getName();
            AbstractC22676k.m65747g(string);
            arrayList.add(string);
        }
        pillRadioGroup.m19544d(arrayList);
        C31700v0 c31700v1 = (C31700v0) AbstractC25265s.m74102I0(this.currentSortOptionIndex, listM98246h0);
        if (c31700v1 != null) {
            C31671h1 c31671h1M98249k0 = m98249k0();
            ScoreContext scoreContext2 = this.scoreContext;
            if (scoreContext2 == null) {
                AbstractC22676k.m65757q("scoreContext");
                throw null;
            }
            c31671h1M98249k0.m98021C0(scoreContext2, c31700v1);
        }
        abstractC13552x1M98244f0.f47747b.f47683a.setOnClickListener(new View.OnClickListener() { // from class: rq0.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C31696t0.m98220Q0(teamCalendarView, this, bottomSheetBehaviorM15688O, abstractC13552x1M98244f0, listM98246h0, view);
            }
        });
        final int i14 = 0;
        abstractC13552x1M98244f0.f47747b.f47685c.setOnClickListener(new View.OnClickListener() { // from class: rq0.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        C31696t0.m98206J0(teamCalendarView, abstractC13552x1M98244f0, this, view);
                        break;
                    default:
                        C31696t0.m98208K0(teamCalendarView, abstractC13552x1M98244f0, this, view);
                        break;
                }
            }
        });
        final int i15 = 1;
        abstractC13552x1M98244f0.f47747b.f47684b.setOnClickListener(new View.OnClickListener() { // from class: rq0.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        C31696t0.m98206J0(teamCalendarView, abstractC13552x1M98244f0, this, view);
                        break;
                    default:
                        C31696t0.m98208K0(teamCalendarView, abstractC13552x1M98244f0, this, view);
                        break;
                }
            }
        });
        abstractC13552x1M98244f0.f47753h.f47556b.setOnClickListener(new ViewOnClickListenerC2292a(10, abstractC13552x1M98244f0, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final void m98202H0(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final void m98204I0(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final void m98206J0(TeamCalendarView teamCalendarView, AbstractC13552x1 abstractC13552x1, C31696t0 c31696t0, View view) {
        teamCalendarView.m19513h(-1);
        abstractC13552x1.f47747b.f47695m.setText(teamCalendarView.getDisplayMonth());
        if (c31696t0.m98250l0(teamCalendarView.getCurrentMonth())) {
            abstractC13552x1.f47747b.f47684b.setImageDrawable(AbstractC32122c.getDrawable(c31696t0.requireContext(), AbstractC38529z.f165818k));
            abstractC13552x1.f47747b.f47684b.setEnabled(false);
        } else {
            abstractC13552x1.f47747b.f47684b.setImageDrawable(AbstractC32122c.getDrawable(c31696t0.requireContext(), AbstractC38529z.f165817j));
            abstractC13552x1.f47747b.f47684b.setEnabled(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final void m98208K0(TeamCalendarView teamCalendarView, AbstractC13552x1 abstractC13552x1, C31696t0 c31696t0, View view) {
        teamCalendarView.m19513h(1);
        abstractC13552x1.f47747b.f47695m.setText(teamCalendarView.getDisplayMonth());
        if (c31696t0.m98250l0(teamCalendarView.getCurrentMonth())) {
            abstractC13552x1.f47747b.f47684b.setImageDrawable(AbstractC32122c.getDrawable(c31696t0.requireContext(), AbstractC38529z.f165818k));
            abstractC13552x1.f47747b.f47684b.setEnabled(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final void m98210L0(AbstractC13552x1 abstractC13552x1, C31696t0 c31696t0, View view) {
        abstractC13552x1.f47753h.f47556b.setVisibility(8);
        abstractC13552x1.f47753h.f47562h.setVisibility(0);
        c31696t0.m98249k0().m98045u0(LocalDate.now());
        C31671h1 c31671h1M98249k0 = c31696t0.m98249k0();
        TimePeriod timePeriod = TimePeriod.DAILY;
        c31671h1M98249k0.m98046v0(timePeriod);
        c31696t0.m98194C0(timePeriod.ordinal());
        C31671h1 c31671h1M98249k1 = c31696t0.m98249k0();
        ScoreContext scoreContext = c31696t0.scoreContext;
        if (scoreContext == null) {
            AbstractC22676k.m65757q("scoreContext");
            throw null;
        }
        c31671h1M98249k1.m98022D0(scoreContext, timePeriod);
        C31671h1 c31671h1M98249k2 = c31696t0.m98249k0();
        LocalDate localDateNow = LocalDate.now();
        AbstractC22676k.m65749i(localDateNow, "now(...)");
        c31671h1M98249k2.m98041m0(localDateNow);
        LocalDate localDateNow2 = LocalDate.now();
        AbstractC22676k.m65749i(localDateNow2, "now(...)");
        c31696t0.m98224S0(timePeriod, localDateNow2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final C23454a0 m98212M0(C31696t0 c31696t0) {
        c31696t0.skipLog = true;
        c31696t0.m98194C0(c31696t0.m98249k0().getSelectedTimePeriod().ordinal());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final void m98214N0(BottomSheetBehavior bottomSheetBehavior, TeamCalendarView teamCalendarView, C31696t0 c31696t0, AbstractC13552x1 abstractC13552x1, View view) {
        Date time;
        if (bottomSheetBehavior.f20784L != 3) {
            Calendar calendar = Calendar.getInstance();
            LocalDate localDateM98030W = c31696t0.m98249k0().getSelectedDate();
            if (localDateM98030W == null || (time = localDateM98030W.toDate()) == null) {
                time = calendar.getTime();
            }
            teamCalendarView.m19512g(time, c31696t0.m98249k0().getSelectedTimePeriod());
            abstractC13552x1.f47747b.f47695m.setText(teamCalendarView.getDisplayMonth());
            if (c31696t0.m98250l0(teamCalendarView.getCurrentMonth())) {
                abstractC13552x1.f47747b.f47684b.setImageDrawable(AbstractC32122c.getDrawable(c31696t0.requireContext(), AbstractC38529z.f165818k));
                abstractC13552x1.f47747b.f47684b.setEnabled(false);
            } else {
                abstractC13552x1.f47747b.f47684b.setImageDrawable(AbstractC32122c.getDrawable(c31696t0.requireContext(), AbstractC38529z.f165817j));
                abstractC13552x1.f47747b.f47684b.setEnabled(true);
            }
            abstractC13552x1.f47747b.f47686d.m19546k(c31696t0.m98249k0().getSelectedTimePeriod().ordinal());
            abstractC13552x1.f47747b.f47697o.m19546k(c31696t0.currentSortOptionIndex);
            bottomSheetBehavior.m15701W(3);
        } else {
            bottomSheetBehavior.m15701W(5);
        }
        c31696t0.getEventDispatcher().m129012R0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final C23454a0 m98216O0(TeamCalendarView teamCalendarView, int i13) {
        TimePeriod timePeriod = TimePeriod.DAILY;
        if (i13 == timePeriod.ordinal()) {
            teamCalendarView.setType(timePeriod);
        } else {
            TimePeriod timePeriod2 = TimePeriod.WEEK;
            if (i13 == timePeriod2.ordinal()) {
                teamCalendarView.setType(timePeriod2);
            } else {
                TimePeriod timePeriod3 = TimePeriod.MONTH;
                if (i13 == timePeriod3.ordinal()) {
                    teamCalendarView.setType(timePeriod3);
                }
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final C23454a0 m98218P0(C31696t0 c31696t0, AbstractC13552x1 abstractC13552x1, int i13) {
        c31696t0.teamLoaded = false;
        TimePeriod timePeriod = TimePeriod.DAILY;
        if (i13 == timePeriod.ordinal()) {
            c31696t0.m98192A0(timePeriod, abstractC13552x1.f47753h.f47564j.getText().toString(), "Leaderboard Sort");
            LocalDate localDateM98030W = c31696t0.m98249k0().getSelectedDate();
            if (localDateM98030W != null) {
                c31696t0.m98224S0(timePeriod, localDateM98030W);
            }
            C31671h1 c31671h1M98249k0 = c31696t0.m98249k0();
            ScoreContext scoreContext = c31696t0.scoreContext;
            if (scoreContext == null) {
                AbstractC22676k.m65757q("scoreContext");
                throw null;
            }
            c31671h1M98249k0.m98022D0(scoreContext, timePeriod);
            abstractC13552x1.f47747b.f47686d.m19546k(timePeriod.ordinal());
        } else {
            TimePeriod timePeriod2 = TimePeriod.WEEK;
            if (i13 == timePeriod2.ordinal()) {
                c31696t0.m98192A0(timePeriod2, abstractC13552x1.f47753h.f47564j.getText().toString(), "Leaderboard Sort");
                LocalDate localDateM98030W2 = c31696t0.m98249k0().getSelectedDate();
                if (localDateM98030W2 != null) {
                    c31696t0.m98224S0(timePeriod2, localDateM98030W2);
                }
                C31671h1 c31671h1M98249k1 = c31696t0.m98249k0();
                ScoreContext scoreContext2 = c31696t0.scoreContext;
                if (scoreContext2 == null) {
                    AbstractC22676k.m65757q("scoreContext");
                    throw null;
                }
                c31671h1M98249k1.m98022D0(scoreContext2, timePeriod2);
                abstractC13552x1.f47747b.f47686d.m19546k(timePeriod2.ordinal());
            } else {
                TimePeriod timePeriod3 = TimePeriod.MONTH;
                if (i13 == timePeriod3.ordinal()) {
                    c31696t0.m98192A0(timePeriod3, abstractC13552x1.f47753h.f47564j.getText().toString(), "Leaderboard Sort");
                    LocalDate localDateM98030W3 = c31696t0.m98249k0().getSelectedDate();
                    if (localDateM98030W3 != null) {
                        c31696t0.m98224S0(timePeriod3, localDateM98030W3);
                    }
                    C31671h1 c31671h1M98249k2 = c31696t0.m98249k0();
                    ScoreContext scoreContext3 = c31696t0.scoreContext;
                    if (scoreContext3 == null) {
                        AbstractC22676k.m65757q("scoreContext");
                        throw null;
                    }
                    c31671h1M98249k2.m98022D0(scoreContext3, timePeriod3);
                    abstractC13552x1.f47747b.f47686d.m19546k(timePeriod3.ordinal());
                }
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final void m98220Q0(TeamCalendarView teamCalendarView, C31696t0 c31696t0, BottomSheetBehavior bottomSheetBehavior, AbstractC13552x1 abstractC13552x1, List list, View view) {
        if (teamCalendarView.getStartDate() == null && teamCalendarView.getEndDate() == null) {
            Toast.makeText(c31696t0.getContext(), AbstractC38505d0.f165601M1, 1).show();
        } else {
            LocalDate localDate = new LocalDate(teamCalendarView.getEndDate());
            C31671h1 c31671h1M98249k0 = c31696t0.m98249k0();
            if (localDate.isAfter(LocalDate.now())) {
                localDate = LocalDate.now();
            }
            c31671h1M98249k0.m98045u0(localDate);
            bottomSheetBehavior.m15701W(4);
        }
        Integer selectedIndex = abstractC13552x1.f47747b.f47697o.getSelectedIndex();
        if (selectedIndex != null) {
            C31700v0 c31700v0 = (C31700v0) list.get(selectedIndex.intValue());
            C31671h1 c31671h1M98249k1 = c31696t0.m98249k0();
            ScoreContext scoreContext = c31696t0.scoreContext;
            if (scoreContext == null) {
                AbstractC22676k.m65757q("scoreContext");
                throw null;
            }
            c31671h1M98249k1.m98021C0(scoreContext, c31700v0);
            c31696t0.m98230V0(c31700v0);
            abstractC13552x1.f47753h.f47564j.setText(c31696t0.m98245g0(c31700v0));
            C40191e eventDispatcher = c31696t0.getEventDispatcher();
            String strM98273a = c31700v0.getAnalyticsAction();
            Companion companion = INSTANCE;
            ScoreContext scoreContext2 = c31696t0.scoreContext;
            if (scoreContext2 == null) {
                AbstractC22676k.m65757q("scoreContext");
                throw null;
            }
            eventDispatcher.m128986E0(strM98273a, companion.m98266a(scoreContext2));
        }
        Integer selectedIndex2 = abstractC13552x1.f47747b.f47686d.getSelectedIndex();
        if (selectedIndex2 != null) {
            TimePeriod timePeriod = TimePeriod.values()[selectedIndex2.intValue()];
            LocalDate localDate2 = new LocalDate(teamCalendarView.getEndDate());
            if (localDate2.isAfter(LocalDate.now())) {
                localDate2 = LocalDate.now();
            }
            c31696t0.teamLoaded = false;
            c31696t0.m98249k0().m98045u0(localDate2);
            C31671h1 c31671h1M98249k2 = c31696t0.m98249k0();
            AbstractC22676k.m65747g(localDate2);
            c31671h1M98249k2.m98041m0(localDate2);
            C31671h1 c31671h1M98249k3 = c31696t0.m98249k0();
            ScoreContext scoreContext3 = c31696t0.scoreContext;
            if (scoreContext3 == null) {
                AbstractC22676k.m65757q("scoreContext");
                throw null;
            }
            c31671h1M98249k3.m98022D0(scoreContext3, timePeriod);
        }
        c31696t0.m98194C0(c31696t0.m98249k0().getSelectedTimePeriod().ordinal());
        c31696t0.m98192A0(teamCalendarView.getTimePeriod(), abstractC13552x1.f47753h.f47564j.getText().toString(), "Calendar Picker");
        C40191e eventDispatcher2 = c31696t0.getEventDispatcher();
        LocalDate localDateM98030W = c31696t0.m98249k0().getSelectedDate();
        if (localDateM98030W == null) {
            localDateM98030W = LocalDate.now();
        }
        AbstractC22676k.m65747g(localDateM98030W);
        eventDispatcher2.m129004N0(c31696t0.m98243e0(localDateM98030W));
    }

    /* JADX INFO: renamed from: R0 */
    private final void m98222R0(TeamUserListing userData, C31700v0 sortOption) {
        if (userData != null) {
            AbstractC13552x1 abstractC13552x1M98244f0 = m98244f0();
            String strM98242d0 = m98242d0(userData, sortOption);
            if (AbstractC22676k.m65745e(strM98242d0, "")) {
                abstractC13552x1M98244f0.f47753h.f47565k.setVisibility(8);
                return;
            }
            abstractC13552x1M98244f0.f47753h.f47565k.setTextColor(AbstractC32122c.getColor(requireContext(), m98241c0(userData, sortOption)));
            abstractC13552x1M98244f0.f47753h.f47565k.setAlpha(0.6f);
            abstractC13552x1M98244f0.f47753h.f47564j.setTextColor(AbstractC32122c.getColor(requireContext(), m98241c0(userData, sortOption)));
            abstractC13552x1M98244f0.f47753h.f47565k.setText(getResources().getString(AbstractC38505d0.f165610P1, strM98242d0));
            abstractC13552x1M98244f0.f47753h.f47565k.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: S0 */
    private final void m98224S0(TimePeriod timePeriod, LocalDate date) {
        String string;
        LocalDate localDateNow;
        int[] iArr = b.f131245a;
        int i13 = iArr[timePeriod.ordinal()];
        if (i13 != 1) {
            if (i13 == 2) {
                LocalDate localDateWithDayOfWeek = date.withDayOfWeek(1);
                LocalDate localDateWithDayOfWeek2 = date.withDayOfWeek(7);
                C28204u.Companion aVar = C28204u.INSTANCE;
                AbstractC22676k.m65747g(localDateWithDayOfWeek);
                String strM85358a = aVar.m85358a(localDateWithDayOfWeek, "EEE M/d");
                AbstractC22676k.m65747g(localDateWithDayOfWeek2);
                string = AbstractC18489d0.m53370k(strM85358a, " - ", aVar.m85358a(localDateWithDayOfWeek2, "EEE M/d"));
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                string = C28204u.INSTANCE.m85358a(date, "MMMM yyyy");
            }
        } else if (date.isEqual(new LocalDate())) {
            string = getResources().getString(AbstractC38505d0.f165715s1);
            AbstractC22676k.m65747g(string);
        } else {
            string = C28204u.INSTANCE.m85358a(date, "EEE M/d");
        }
        AbstractC13552x1 abstractC13552x1M98244f0 = m98244f0();
        abstractC13552x1M98244f0.f47753h.f47563i.setText(string);
        int i14 = iArr[timePeriod.ordinal()];
        if (i14 == 1) {
            localDateNow = LocalDate.now();
        } else if (i14 == 2) {
            localDateNow = LocalDate.now().withDayOfWeek(1);
        } else {
            if (i14 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            localDateNow = LocalDate.now().withDayOfMonth(1);
        }
        if (date.isBefore(localDateNow)) {
            abstractC13552x1M98244f0.f47753h.f47556b.setVisibility(0);
            abstractC13552x1M98244f0.f47753h.f47562h.setVisibility(8);
        } else {
            abstractC13552x1M98244f0.f47753h.f47556b.setVisibility(8);
            abstractC13552x1M98244f0.f47753h.f47562h.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: T0 */
    private final void m98226T0(LocalDateTime lastUpdatedAt) {
        AbstractC13552x1 abstractC13552x1M98244f0 = m98244f0();
        if (lastUpdatedAt.toLocalDate().isEqual(new LocalDate())) {
            abstractC13552x1M98244f0.f47753h.f47558d.setText(getResources().getString(AbstractC38505d0.f165605O, C28204u.INSTANCE.m85361d(lastUpdatedAt)));
        } else {
            abstractC13552x1M98244f0.f47753h.f47558d.setText(getResources().getString(AbstractC38505d0.f165602N, String.valueOf(lastUpdatedAt.getMonthOfYear()), String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(lastUpdatedAt.getDayOfMonth())}, 1)), C28204u.INSTANCE.m85361d(lastUpdatedAt)));
        }
        abstractC13552x1M98244f0.f47753h.f47558d.setVisibility(0);
    }

    /* JADX INFO: renamed from: U0 */
    private final void m98228U0(LocalDateTime lastUpdatedAt, ScoreContext scoreContext) {
        int i13 = b.f131246b[scoreContext.ordinal()];
        if (i13 == 1) {
            m98226T0(lastUpdatedAt);
        } else if (i13 == 2 || i13 == 3) {
            m98226T0(new LocalDateTime());
        }
    }

    /* JADX INFO: renamed from: V0 */
    private final void m98230V0(C31700v0 sortOption) {
        AbstractC13552x1 abstractC13552x1M98244f0 = m98244f0();
        this.currentSortOptionIndex = sortOption.getIndex();
        abstractC13552x1M98244f0.f47747b.f47697o.m19546k(sortOption.getIndex());
        abstractC13552x1M98244f0.f47753h.f47564j.setTextColor(AbstractC32122c.getColor(requireContext(), m98241c0(null, sortOption)));
    }

    /* JADX INFO: renamed from: W0 */
    private final void m98232W0(C31700v0 sortOption, TeamUserListing userData) {
    }

    /* JADX INFO: renamed from: X0 */
    private final void m98234X0(C31674i1 state) {
        Map<ScoreContext, Boolean> mapM98100h = state.m98100h();
        ScoreContext scoreContext = this.scoreContext;
        if (scoreContext == null) {
            AbstractC22676k.m65757q("scoreContext");
            throw null;
        }
        if (AbstractC22676k.m65745e(mapM98100h.get(scoreContext), Boolean.FALSE)) {
            C31671h1 c31671h1M98249k0 = m98249k0();
            ScoreContext scoreContext2 = this.scoreContext;
            if (scoreContext2 == null) {
                AbstractC22676k.m65757q("scoreContext");
                throw null;
            }
            if (c31671h1M98249k0.mo97830c(scoreContext2) != 0) {
                AbstractC1740u1 layoutManager = m98244f0().f47754i.getLayoutManager();
                AbstractC22676k.m65748h(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                final int i13 = 1;
                int iFindLastCompletelyVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition() + 1;
                C31671h1 c31671h1M98249k1 = m98249k0();
                ScoreContext scoreContext3 = this.scoreContext;
                if (scoreContext3 == null) {
                    AbstractC22676k.m65757q("scoreContext");
                    throw null;
                }
                LeadersEntry leadersEntryM98025G0 = c31671h1M98249k1.m98025G0(scoreContext3);
                Integer numValueOf = leadersEntryM98025G0 != null ? Integer.valueOf(leadersEntryM98025G0.getRank()) : null;
                if (numValueOf == null || numValueOf.intValue() == 0) {
                    m98247i0().itemView.setAlpha(0.0f);
                    return;
                }
                final int i14 = 0;
                if (numValueOf.intValue() <= iFindLastCompletelyVisibleItemPosition) {
                    ValueAnimator valueAnimator = this.userItemAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(m98247i0().itemView.getAlpha(), 0.0f);
                    valueAnimatorOfFloat.setDuration(300L);
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: rq0.p0

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ C31696t0 f131212b;

                        {
                            this.f131212b = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            switch (i14) {
                                case 0:
                                    C31696t0.m98236Y0(this.f131212b, valueAnimator2);
                                    break;
                                default:
                                    C31696t0.m98238Z0(this.f131212b, valueAnimator2);
                                    break;
                            }
                        }
                    });
                    valueAnimatorOfFloat.start();
                    m98247i0().itemView.setVisibility(8);
                    this.userItemAnimator = valueAnimatorOfFloat;
                } else {
                    ValueAnimator valueAnimator2 = this.userItemAnimator;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(m98247i0().itemView.getAlpha(), 1.0f);
                    valueAnimatorOfFloat2.setDuration(300L);
                    valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: rq0.p0

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ C31696t0 f131212b;

                        {
                            this.f131212b = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                            switch (i13) {
                                case 0:
                                    C31696t0.m98236Y0(this.f131212b, valueAnimator3);
                                    break;
                                default:
                                    C31696t0.m98238Z0(this.f131212b, valueAnimator3);
                                    break;
                            }
                        }
                    });
                    valueAnimatorOfFloat2.start();
                    m98247i0().itemView.setVisibility(0);
                    this.userItemAnimator = valueAnimatorOfFloat2;
                }
                if (m98249k0().getSelectedTimePeriod() != TimePeriod.DAILY) {
                    Map<ScoreContext, Integer> mapM98029V = m98249k0().m98029V();
                    ScoreContext scoreContext4 = this.scoreContext;
                    if (scoreContext4 == null) {
                        AbstractC22676k.m65757q("scoreContext");
                        throw null;
                    }
                    Integer num = mapM98029V.get(scoreContext4);
                    if (iFindLastCompletelyVisibleItemPosition < (num != null ? num.intValue() : 0)) {
                        m98247i0().itemView.setVisibility(0);
                        return;
                    } else {
                        m98247i0().itemView.setVisibility(8);
                        return;
                    }
                }
                return;
            }
        }
        m98247i0().itemView.setAlpha(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final void m98236Y0(C31696t0 c31696t0, ValueAnimator it) {
        AbstractC22676k.m65750j(it, "it");
        View view = c31696t0.m98247i0().itemView;
        Object animatedValue = it.getAnimatedValue();
        AbstractC22676k.m65748h(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        view.setAlpha(((Float) animatedValue).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final void m98238Z0(C31696t0 c31696t0, ValueAnimator it) {
        AbstractC22676k.m65750j(it, "it");
        View view = c31696t0.m98247i0().itemView;
        Object animatedValue = it.getAnimatedValue();
        AbstractC22676k.m65748h(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        view.setAlpha(((Float) animatedValue).floatValue());
    }

    /* JADX INFO: renamed from: b0 */
    private final void m98240b0(String bannerUrl) {
        AbstractC13552x1 abstractC13552x1M98244f0 = m98244f0();
        abstractC13552x1M98244f0.f47753h.f47555a.setImageDrawable(null);
        Context context = getContext();
        if (context != null) {
            if (!AbstractC39421y.m125930O(bannerUrl, "http", false)) {
                bannerUrl = AbstractC2875y.m8299l(context.getResources().getString(AbstractC26666g.f106020k), bannerUrl);
            }
            C4964f c4964fM15549m = ComponentCallbacks2C4960b.m15528d(context).m75567f(context).m15549m(bannerUrl);
            c4964fM15549m.f20320X = C18615a.m53885b(500);
            c4964fM15549m.m15537y(abstractC13552x1M98244f0.f47753h.f47555a);
            C31671h1 c31671h1M98249k0 = m98249k0();
            ScoreContext scoreContext = this.scoreContext;
            if (scoreContext != null) {
                c31671h1M98249k0.m98049z0(scoreContext, true);
            } else {
                AbstractC22676k.m65757q("scoreContext");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    private final int m98241c0(TeamUserListing userData, C31700v0 sortOption) {
        Double recovery;
        int iM98276d = sortOption.getSortType();
        if (iM98276d != 3) {
            if (iM98276d != 4 && iM98276d != 5) {
                if (iM98276d != 6 && iM98276d != 7) {
                    return AbstractC36510a.f156020b;
                }
                return AbstractC36510a.f156024d;
            }
            return AbstractC36510a.f156042u;
        }
        if (userData == null || (recovery = userData.getRecovery()) == null) {
            return AbstractC36510a.f156030i;
        }
        double dDoubleValue = recovery.doubleValue();
        if (dDoubleValue <= 33.0d) {
            return AbstractC36510a.f156040s;
        }
        return dDoubleValue <= 66.0d ? AbstractC36510a.f156025d0 : AbstractC36510a.f156036o;
    }

    /* JADX INFO: renamed from: d0 */
    private final String m98242d0(TeamUserListing userData, C31700v0 sortOption) {
        String strM27183h;
        String strM27183h2;
        String strM27182g;
        String strValueOf;
        String strValueOf2;
        String strM27182g2;
        switch (sortOption.getSortType()) {
            case 0:
                Float dayStrain = userData.getDayStrain();
                return (dayStrain == null || (strM27183h = AbstractC10538f.m27183h((double) dayStrain.floatValue())) == null) ? "" : strM27183h;
            case 1:
                Float activity = userData.getActivity();
                return (activity == null || (strM27183h2 = AbstractC10538f.m27183h((double) activity.floatValue())) == null) ? "" : strM27183h2;
            case 2:
                Integer calories = userData.getCalories();
                if (calories != null) {
                    String str = NumberFormat.getIntegerInstance().format(Integer.valueOf(calories.intValue()));
                    if (str != null) {
                        return str;
                    }
                }
                return "";
            case 3:
                Double recovery = userData.getRecovery();
                return (recovery == null || (strM27182g = AbstractC10538f.m27182g(recovery.doubleValue())) == null) ? "" : strM27182g;
            case 4:
                Integer hrv = userData.getHRV();
                return (hrv == null || (strValueOf = String.valueOf(hrv.intValue())) == null) ? "" : strValueOf;
            case 5:
                Integer rhr = userData.getRHR();
                return (rhr == null || (strValueOf2 = String.valueOf(rhr.intValue())) == null) ? "" : strValueOf2;
            case 6:
                Double sleepPerf = userData.getSleepPerf();
                return (sleepPerf == null || (strM27182g2 = AbstractC10538f.m27182g(sleepPerf.doubleValue())) == null) ? "" : strM27182g2;
            case 7:
                String sleepDurationString = userData.getSleepDurationString();
                return sleepDurationString == null ? "" : sleepDurationString;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: e0 */
    private final String m98243e0(LocalDate previousLocalDate) {
        return String.valueOf(Days.daysBetween(previousLocalDate, LocalDate.now()).getDays());
    }

    /* JADX INFO: renamed from: f0 */
    private final AbstractC13552x1 m98244f0() {
        return (AbstractC13552x1) this.fragmentTeamsBoardV1Binding.getValue(this, f131224T[0]);
    }

    /* JADX INFO: renamed from: g0 */
    private final String m98245g0(C31700v0 sortOption) {
        if (sortOption.getSortType() != 1 || m98249k0().m98034d0() == TimePeriod.DAILY) {
            return sortOption.getName();
        }
        String string = getResources().getString(AbstractC38505d0.f165650c0, sortOption.getName());
        AbstractC22676k.m65747g(string);
        return string;
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    /* JADX INFO: renamed from: h0 */
    private final List<C31700v0> m98246h0(ScoreContext scoreContext) {
        int i13 = b.f131246b[scoreContext.ordinal()];
        if (i13 == 1) {
            String string = getResources().getString(AbstractC38505d0.f165564A0);
            AbstractC22676k.m65749i(string, "getString(...)");
            C31700v0 c31700v0 = new C31700v0(string, 0, "Day Strain", 0);
            String string2 = getResources().getString(AbstractC38505d0.f165735z0);
            AbstractC22676k.m65749i(string2, "getString(...)");
            C31700v0 c31700v1 = new C31700v0(string2, 1, "Activity Strain", 1);
            String string3 = getResources().getString(AbstractC38505d0.f165722v);
            AbstractC22676k.m65749i(string3, "getString(...)");
            return AbstractC37056f.m118959K(c31700v0, c31700v1, new C31700v0(string3, 2, "Calories", 2));
        }
        if (i13 != 2) {
            if (i13 != 3) {
                throw new IllegalArgumentException();
            }
            String string4 = getResources().getString(AbstractC38505d0.f165607O1);
            AbstractC22676k.m65749i(string4, "getString(...)");
            C31700v0 c31700v2 = new C31700v0(string4, 6, "Sleep Performance", 0);
            String string5 = getResources().getString(AbstractC38505d0.f165726w0);
            AbstractC22676k.m65749i(string5, "getString(...)");
            return AbstractC37056f.m118959K(c31700v2, new C31700v0(string5, 7, "Hours of Sleep", 1));
        }
        String string6 = getResources().getString(AbstractC38505d0.f165704p2);
        AbstractC22676k.m65749i(string6, "getString(...)");
        C31700v0 c31700v3 = new C31700v0(string6, 3, "Recovery", 0);
        String string7 = getResources().getString(AbstractC36517h.f156124g);
        AbstractC22676k.m65749i(string7, "getString(...)");
        C31700v0 c31700v4 = new C31700v0(string7, 4, "HRV", 1);
        String string8 = getResources().getString(AbstractC36517h.f156126i);
        AbstractC22676k.m65749i(string8, "getString(...)");
        return AbstractC37056f.m118959K(c31700v3, c31700v4, new C31700v0(string8, 5, "RHR", 2));
    }

    /* JADX INFO: renamed from: i0 */
    private final C31659d1 m98247i0() {
        return (C31659d1) this.userItemHolder.getValue(this, f131224T[1]);
    }

    /* JADX INFO: renamed from: j0 */
    private final InterfaceC27837a0 m98248j0() {
        return (InterfaceC27837a0) this.userManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public final C31671h1 m98249k0() {
        return (C31671h1) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: l0 */
    private final boolean m98250l0(Calendar calendar) {
        return calendar.get(1) >= Calendar.getInstance().get(1) && calendar.get(2) >= Calendar.getInstance().get(2);
    }

    /* JADX INFO: renamed from: m0 */
    private final void m98251m0(TeamUserListing userListing) {
        getEventDispatcher().m129006O0(String.valueOf(userListing.getId()), userListing.getId() == m98248j0().getUserId());
        getNavigator().mo59393b(new AbstractC21155m0.w3(Integer.valueOf(userListing.getId()), null, "community", null, 8, null));
    }

    /* JADX INFO: renamed from: n0 */
    private final void m98252n0(C31674i1 state) {
        Team teamMo97831b;
        String bannerUrl;
        Map<ScoreContext, Boolean> mapM98097e = state.m98097e();
        ScoreContext scoreContext = this.scoreContext;
        if (scoreContext == null) {
            AbstractC22676k.m65757q("scoreContext");
            throw null;
        }
        if (!AbstractC22676k.m65745e(mapM98097e.get(scoreContext), Boolean.FALSE) || (teamMo97831b = state.getTeam()) == null || (bannerUrl = teamMo97831b.getBannerUrl()) == null) {
            return;
        }
        m98240b0(bannerUrl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C34911a m98253o0(C31696t0 c31696t0) {
        return AbstractC15751g.m44431K(c31696t0.requireActivity());
    }

    /* JADX INFO: renamed from: p0 */
    private final void m98254p0() {
        C12724c<C31674i1> c12724cM98039j0 = m98249k0().m98039j0();
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        c12724cM98039j0.m35577c(viewLifecycleOwner, new C31690q0(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q0 */
    public static final C23454a0 m98255q0(C31696t0 c31696t0, C31674i1 state) throws Throwable {
        String string;
        Throwable th3;
        TeamUserListing teamUserListing;
        AbstractC22676k.m65750j(state, "state");
        AbstractC13552x1 abstractC13552x1M98244f0 = c31696t0.m98244f0();
        c31696t0.m98252n0(state);
        c31696t0.m98234X0(state);
        TextView textView = abstractC13552x1M98244f0.f47753h.f47560f;
        Team teamMo97831b = state.getTeam();
        textView.setText(teamMo97831b != null ? teamMo97831b.getName() : null);
        Map<ScoreContext, Boolean> mapM98101i = state.m98101i();
        ScoreContext scoreContext = c31696t0.scoreContext;
        if (scoreContext == null) {
            AbstractC22676k.m65757q("scoreContext");
            throw null;
        }
        if (AbstractC22676k.m65745e(mapM98101i.get(scoreContext), Boolean.TRUE)) {
            c31696t0.m98262x0();
        }
        LocalDate localDateM98030W = c31696t0.m98249k0().getSelectedDate();
        if (localDateM98030W != null) {
            c31696t0.m98224S0(state.getTimePeriod(), localDateM98030W);
        }
        if (!state.getIsConnected() || state.getRequestFail()) {
            abstractC13552x1M98244f0.f47748c.setVisibility(0);
            abstractC13552x1M98244f0.f47755j.setVisibility(8);
            abstractC13552x1M98244f0.f47749d.setVisibility(0);
            abstractC13552x1M98244f0.f47751f.setVisibility(8);
            abstractC13552x1M98244f0.f47754i.setVisibility(8);
            abstractC13552x1M98244f0.f47756k.setVisibility(8);
            abstractC13552x1M98244f0.f47753h.f47565k.setVisibility(4);
            abstractC13552x1M98244f0.f47753h.f47558d.setVisibility(4);
            TextView textView2 = abstractC13552x1M98244f0.f47750e;
            Context context = c31696t0.getContext();
            if (context != null) {
                string = context.getString(!state.getIsConnected() ? AbstractC38505d0.f165643a1 : AbstractC38505d0.f165647b1);
            } else {
                string = null;
            }
            textView2.setText(string);
        } else if (state.getTeam() != null) {
            if (c31696t0.teamLoaded) {
                Map<ScoreContext, Boolean> mapM98100h = state.m98100h();
                ScoreContext scoreContext2 = c31696t0.scoreContext;
                if (scoreContext2 == null) {
                    AbstractC22676k.m65757q("scoreContext");
                    throw null;
                }
                if (AbstractC22676k.m65745e(mapM98100h.get(scoreContext2), Boolean.FALSE)) {
                    C31671h1 c31671h1M98249k0 = c31696t0.m98249k0();
                    ScoreContext scoreContext3 = c31696t0.scoreContext;
                    if (scoreContext3 == null) {
                        AbstractC22676k.m65757q("scoreContext");
                        throw null;
                    }
                    if (c31671h1M98249k0.mo97830c(scoreContext3) == 0) {
                        abstractC13552x1M98244f0.f47754i.setVisibility(8);
                        abstractC13552x1M98244f0.f47748c.setVisibility(0);
                        abstractC13552x1M98244f0.f47749d.setVisibility(8);
                        abstractC13552x1M98244f0.f47751f.setVisibility(0);
                        abstractC13552x1M98244f0.f47755j.setVisibility(8);
                        abstractC13552x1M98244f0.f47753h.f47565k.setVisibility(4);
                        abstractC13552x1M98244f0.f47753h.f47558d.setVisibility(4);
                    } else {
                        int i13 = c31696t0.currentSortOptionIndex;
                        Team teamMo97831b2 = state.getTeam();
                        Map<ScoreContext, C31700v0> mapM98104l = state.m98104l();
                        ScoreContext scoreContext4 = c31696t0.scoreContext;
                        if (scoreContext4 == null) {
                            AbstractC22676k.m65757q("scoreContext");
                            throw null;
                        }
                        C31700v0 c31700v0 = mapM98104l.get(scoreContext4);
                        if (c31700v0 != null) {
                            c31696t0.m98230V0(c31700v0);
                            Map<ScoreContext, LeadersEntry> mapM98107o = state.m98107o();
                            ScoreContext scoreContext5 = c31696t0.scoreContext;
                            if (scoreContext5 == null) {
                                AbstractC22676k.m65757q("scoreContext");
                                throw null;
                            }
                            LeadersEntry leadersEntry = mapM98107o.get(scoreContext5);
                            if (leadersEntry == null || (teamUserListing = leadersEntry.toTeamUserListing()) == null || teamMo97831b2 == null) {
                                th3 = null;
                            } else {
                                C31659d1 c31659d1M98247i0 = c31696t0.m98247i0();
                                ScoreContext scoreContext6 = c31696t0.scoreContext;
                                if (scoreContext6 == null) {
                                    AbstractC22676k.m65757q("scoreContext");
                                    throw null;
                                }
                                th3 = null;
                                c31659d1M98247i0.m97930b(scoreContext6, c31696t0.m98249k0().m98034d0(), c31700v0, teamUserListing.getRank(), teamUserListing, teamMo97831b2, c31696t0.m98249k0().getSelectedTimePeriod(), c31696t0.m98249k0().getSelectedDate(), c31696t0.featureFlagRepository, new C31604d(7));
                            }
                            Map<ScoreContext, LeadersEntry> mapM98096d = state.m98096d();
                            ScoreContext scoreContext7 = c31696t0.scoreContext;
                            if (scoreContext7 == null) {
                                AbstractC22676k.m65757q("scoreContext");
                                throw th3;
                            }
                            LeadersEntry leadersEntry2 = mapM98096d.get(scoreContext7);
                            c31696t0.m98232W0(c31700v0, leadersEntry2 != null ? leadersEntry2.toTeamUserListing() : th3);
                            Map<ScoreContext, LeadersEntry> mapM98096d2 = state.m98096d();
                            ScoreContext scoreContext8 = c31696t0.scoreContext;
                            if (scoreContext8 == null) {
                                AbstractC22676k.m65757q("scoreContext");
                                throw th3;
                            }
                            LeadersEntry leadersEntry3 = mapM98096d2.get(scoreContext8);
                            c31696t0.m98222R0(leadersEntry3 != null ? leadersEntry3.toTeamUserListing() : th3, c31700v0);
                            abstractC13552x1M98244f0.f47753h.f47564j.setText(c31696t0.m98245g0(c31700v0));
                        } else {
                            th3 = null;
                        }
                        Map<ScoreContext, LocalDateTime> mapM98099g = state.m98099g();
                        ScoreContext scoreContext9 = c31696t0.scoreContext;
                        if (scoreContext9 == null) {
                            AbstractC22676k.m65757q("scoreContext");
                            throw th3;
                        }
                        LocalDateTime localDateTime = mapM98099g.get(scoreContext9);
                        if (localDateTime != null) {
                            ScoreContext scoreContext10 = c31696t0.scoreContext;
                            if (scoreContext10 == null) {
                                AbstractC22676k.m65757q("scoreContext");
                                throw th3;
                            }
                            c31696t0.m98228U0(localDateTime, scoreContext10);
                        }
                        abstractC13552x1M98244f0.f47754i.setVisibility(0);
                        abstractC13552x1M98244f0.f47756k.setVisibility(0);
                        abstractC13552x1M98244f0.f47753h.f47563i.setVisibility(0);
                        abstractC13552x1M98244f0.f47748c.setVisibility(8);
                        if (i13 != c31696t0.currentSortOptionIndex) {
                            c31696t0.m98264z0();
                        }
                    }
                } else {
                    abstractC13552x1M98244f0.f47754i.setVisibility(8);
                    abstractC13552x1M98244f0.f47748c.setVisibility(0);
                    abstractC13552x1M98244f0.f47749d.setVisibility(8);
                    abstractC13552x1M98244f0.f47751f.setVisibility(8);
                    abstractC13552x1M98244f0.f47755j.setVisibility(0);
                    abstractC13552x1M98244f0.f47753h.f47565k.setVisibility(4);
                    abstractC13552x1M98244f0.f47753h.f47558d.setVisibility(4);
                    abstractC13552x1M98244f0.f47755j.m26663f();
                }
            } else {
                c31696t0.teamLoaded = true;
                c31696t0.m98257s0();
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C23454a0 m98256r0(TeamUserListing it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s0 */
    private final void m98257s0() {
        ScoreContext scoreContext = this.scoreContext;
        if (scoreContext == null) {
            AbstractC22676k.m65757q("scoreContext");
            throw null;
        }
        this.listAdapter = new C31656c1(scoreContext, m98249k0(), this.featureFlagRepository, new C31690q0(this, 2));
        m98244f0().f47754i.setAdapter(this.listAdapter);
        m98262x0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final C23454a0 m98258t0(C31696t0 c31696t0, TeamUserListing it) {
        AbstractC22676k.m65750j(it, "it");
        c31696t0.m98251m0(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final C23454a0 m98259u0(AbstractC13552x1 abstractC13552x1, float f13) {
        float f14 = (3.3E-4f * f13) + 1.1f;
        TextView textView = abstractC13552x1.f47753h.f47560f;
        textView.setPadding(textView.getPaddingLeft(), abstractC13552x1.f47753h.f47560f.getPaddingTop(), abstractC13552x1.f47753h.f47560f.getPaddingRight(), Math.max(0, (int) (((f13 * 0.4f) + 160) / f14)));
        abstractC13552x1.f47753h.f47560f.setScaleX(f14);
        abstractC13552x1.f47753h.f47560f.setScaleY(f14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final void m98260v0(C31696t0 c31696t0, View view, int i13, int i14, int i15, int i16) {
        c31696t0.m98234X0(c31696t0.m98249k0().state());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final void m98261w0(View view) {
    }

    /* JADX INFO: renamed from: x0 */
    private final void m98262x0() {
        C31671h1 c31671h1M98249k0 = m98249k0();
        ScoreContext scoreContext = this.scoreContext;
        if (scoreContext == null) {
            AbstractC22676k.m65757q("scoreContext");
            throw null;
        }
        c31671h1M98249k0.m98043o0(scoreContext);
        AbstractC1615p0 abstractC1615p0 = this.observedDataSource;
        if (abstractC1615p0 != null) {
            abstractC1615p0.removeObservers(this);
        }
        C31671h1 c31671h1M98249k1 = m98249k0();
        ScoreContext scoreContext2 = this.scoreContext;
        if (scoreContext2 == null) {
            AbstractC22676k.m65757q("scoreContext");
            throw null;
        }
        AbstractC1615p0 abstractC1615p0M98026N = c31671h1M98249k1.m98026N(scoreContext2);
        this.observedDataSource = abstractC1615p0M98026N;
        if (abstractC1615p0M98026N != null) {
            abstractC1615p0M98026N.observe(this, new AbstractC31698u0.a(new C31690q0(this, 0)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final C23454a0 m98263y0(C31696t0 c31696t0, AbstractC18317n abstractC18317n) {
        C31656c1 c31656c1 = c31696t0.listAdapter;
        if (c31656c1 != null) {
            c31656c1.m52734c(abstractC18317n);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z0 */
    private final void m98264z0() {
        AbstractC13552x1 abstractC13552x1M98244f0 = m98244f0();
        AbstractC1740u1 layoutManager = abstractC13552x1M98244f0.f47754i.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.scrollToPosition(0);
        }
        ParallaxHeaderBehavior parallaxHeaderBehavior = this.scrollBehavior;
        if (parallaxHeaderBehavior == null) {
            AbstractC22676k.m65757q("scrollBehavior");
            throw null;
        }
        View root = abstractC13552x1M98244f0.f47753h.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        parallaxHeaderBehavior.m19532I(root);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m98265D0() {
        m98244f0().f47753h.f47562h.m19545i(new C31682m0(this, 1));
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    @Override // hj0.AbstractC17354m
    public boolean getShowBottomNavigationBar() {
        return this.showBottomNavigationBar;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        Serializable serializable = obtainArguments().getSerializable("scoreContext");
        AbstractC22676k.m65748h(serializable, "null cannot be cast to non-null type com.whoop.ui.ScoreContext");
        this.scoreContext = (ScoreContext) serializable;
        TeamType teamType = (TeamType) obtainArguments().getParcelable("teamType");
        if (teamType == null) {
            teamType = TeamType.COMMUNITY;
        }
        this.teamType = teamType;
        AbstractC13552x1 abstractC13552x1M38265c = AbstractC13552x1.m38265c(inflater, container, false);
        AbstractC22676k.m65749i(abstractC13552x1M38265c, "inflate(...)");
        m98193B0(abstractC13552x1M38265c);
        AbstractC28163g0.m85256l(this);
        View root = m98244f0().getRoot();
        AbstractC22676k.m65748h(root, "null cannot be cast to non-null type android.view.ViewGroup");
        m98198F0(new C31659d1(inflater, (ViewGroup) root, true));
        m98247i0().itemView.setBackgroundResource(AbstractC38529z.f165811d);
        View root2 = m98244f0().getRoot();
        AbstractC22676k.m65749i(root2, "getRoot(...)");
        return root2;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onDestroyView() {
        super.onDestroyView();
        ValueAnimator valueAnimator = this.userItemAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onPause() {
        super.onPause();
        Intent intent = requireActivity().getIntent();
        if (intent == null || !AbstractC22676k.m65745e(intent.getStringExtra("ActionType"), "ViewCommunity")) {
            return;
        }
        intent.removeExtra("ActionType");
        this.currentSortOptionIndex = 0;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onStart() {
        super.onStart();
        C31671h1 c31671h1M98249k0 = m98249k0();
        ScoreContext scoreContext = this.scoreContext;
        if (scoreContext == null) {
            AbstractC22676k.m65757q("scoreContext");
            throw null;
        }
        c31671h1M98249k0.m98049z0(scoreContext, false);
        this.teamLoaded = false;
        m98264z0();
        m98254p0();
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        AbstractC31698u0.m98270b(m98244f0());
        AbstractC13552x1 abstractC13552x1M98244f0 = m98244f0();
        RecyclerView recyclerView = abstractC13552x1M98244f0.f47754i;
        AbstractC22676k.m65749i(recyclerView, "recyclerView");
        View root = abstractC13552x1M98244f0.f47753h.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        int height = abstractC13552x1M98244f0.f47753h.f47561g.getHeight();
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        this.scrollBehavior = new ParallaxHeaderBehavior(recyclerView, root, height, contextRequireContext, new C31703x(abstractC13552x1M98244f0, 2));
        ViewGroup.LayoutParams layoutParams = abstractC13552x1M98244f0.f47753h.getRoot().getLayoutParams();
        AbstractC22676k.m65748h(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        C29960e c29960e = (C29960e) layoutParams;
        ParallaxHeaderBehavior parallaxHeaderBehavior = this.scrollBehavior;
        if (parallaxHeaderBehavior == null) {
            AbstractC22676k.m65757q("scrollBehavior");
            throw null;
        }
        c29960e.m91654b(parallaxHeaderBehavior);
        int i13 = AbstractC38499a0.f165188T5;
        c29960e.f122375l = null;
        c29960e.f122374k = null;
        c29960e.f122369f = i13;
        c29960e.f122367d = 3;
        c29960e.f122366c = 3;
        abstractC13552x1M98244f0.f47753h.getRoot().requestLayout();
        LinearLayout linearLayout = abstractC13552x1M98244f0.f47756k;
        AbstractC22676k.m65748h(linearLayout, "null cannot be cast to non-null type android.view.ViewGroup");
        linearLayout.addView(m98247i0().itemView);
        m98247i0().itemView.setAlpha(0.0f);
        RecyclerView recyclerView2 = abstractC13552x1M98244f0.f47754i;
        recyclerView2.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: rq0.r0
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view2, int i14, int i15, int i16, int i17) {
                C31696t0.m98260v0(this.f131217a, view2, i14, i15, i16, i17);
            }
        });
        Context contextRequireContext2 = requireContext();
        AbstractC22676k.m65749i(contextRequireContext2, "requireContext(...)");
        recyclerView2.setLayoutManager(new C31651b(contextRequireContext2));
        abstractC13552x1M98244f0.f47753h.f47557c.setOnClickListener(new ViewOnClickListenerC31694s0(0));
        this.currentSortOptionIndex = requireArguments().getInt("sortBy", 0);
        TimePeriod timePeriod = (TimePeriod) obtainArguments().getSerializable("timePeriod");
        if (timePeriod == null) {
            timePeriod = TimePeriod.DAILY;
        }
        this.timePeriod = timePeriod;
        C31671h1 c31671h1M98249k0 = m98249k0();
        ScoreContext scoreContext = this.scoreContext;
        if (scoreContext == null) {
            AbstractC22676k.m65757q("scoreContext");
            throw null;
        }
        TimePeriod timePeriod2 = this.timePeriod;
        if (timePeriod2 == null) {
            AbstractC22676k.m65757q("timePeriod");
            throw null;
        }
        c31671h1M98249k0.m98022D0(scoreContext, timePeriod2);
        m98200G0();
    }
}
