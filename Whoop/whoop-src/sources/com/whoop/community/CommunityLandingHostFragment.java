package com.whoop.community;

import android.R;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.constraintlayout.widget.C1141d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1579e2;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.AbstractC1848z0;
import aq0.C1904o;
import as2.AbstractC1953c;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.squareup.wire.AbstractC5583n;
import com.whoop.community.CommunityLandingHostFragment;
import com.whoop.community.presentation.login.InviteCodeActivity;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.LanguageRepository;
import com.whoop.domain.model.teams.DrawerDisplayInvite;
import com.whoop.domain.model.teams.FeatureTeam;
import com.whoop.domain.model.teams.MemberStory;
import com.whoop.domain.model.teams.Team;
import com.whoop.domain.model.teams.TeamInviteDto;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.p069ui.C10593k;
import com.whoop.p069ui.ThrobberView;
import com.whoop.p069ui.pills.StrokedPillButton;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import de.hdodenhof.circleimageview.CircleImageView;
import dp0.AbstractC12248d;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import eq0.AbstractC13522r0;
import ge3.AbstractC15751g;
import gy0.AbstractC16272a;
import h51.C16934f;
import hj0.AbstractC17354m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21155m0;
import j02.InterfaceC21159o0;
import j93.InterfaceC21493z;
import java.util.List;
import java.util.WeakHashMap;
import jf3.C21647a;
import l83.C23454a0;
import l83.C23465k;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25247g0;
import nf1.AbstractC26666g;
import nq0.C27039b;
import nq0.C27042e;
import nq0.C27043f;
import nq0.C27046i;
import nq0.C27047j;
import nq0.C27049l;
import nq0.InterfaceC27038a;
import nq0.InterfaceC27052o;
import o02.InterfaceC27353d;
import or2.AbstractC28163g0;
import or2.C28198s;
import or2.C28216y;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p031b9.C2865t;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p184h5.C16905q1;
import p236j.AbstractC21065d;
import p236j.C21062a;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p479s4.AbstractC32122c;
import p505ts.AbstractC34132o;
import p537ux.C35331f0;
import p543v4.C35643b;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p705ea2.C12925v;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22686q;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qe1.C30304b;
import qe1.InterfaceC30303a;
import qr2.AbstractC30556a;
import qv1.AbstractC30650a;
import qv1.C30656g;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import te1.AbstractC33751b;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import xl0.C38448b;
import xp0.AbstractC38499a0;
import xp0.AbstractC38501b0;
import xp0.AbstractC38505d0;
import xp0.AbstractC38529z;
import xp0.C38510g;
import xp0.C38511h;
import xp0.C38512i;
import xp0.C38513j;
import xp0.C38514k;
import z82.C40191e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0003J)\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u0003J/\u0010$\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\nH\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000eH\u0002¢\u0006\u0004\b&\u0010\u0003J\u000f\u0010'\u001a\u00020\u000eH\u0002¢\u0006\u0004\b'\u0010\u0003J\u000f\u0010(\u001a\u00020\u000eH\u0002¢\u0006\u0004\b(\u0010\u0003J\u0019\u0010+\u001a\u00020\u000e2\b\u0010*\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u000eH\u0002¢\u0006\u0004\b1\u0010\u0003J\u000f\u00102\u001a\u00020\u000eH\u0002¢\u0006\u0004\b2\u0010\u0003J\u000f\u00103\u001a\u00020\u000eH\u0002¢\u0006\u0004\b3\u0010\u0003J\u001d\u00107\u001a\u00020\u000e2\f\u00106\u001a\b\u0012\u0004\u0012\u00020504H\u0002¢\u0006\u0004\b7\u00108J\u001d\u0010;\u001a\u00020\u000e2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020904H\u0002¢\u0006\u0004\b;\u00108J\u001d\u0010>\u001a\u00020\u000e2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<04H\u0002¢\u0006\u0004\b>\u00108J\u0017\u0010@\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020<H\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u000e2\u0006\u0010B\u001a\u000209H\u0002¢\u0006\u0004\bC\u0010DJ\u001d\u0010F\u001a\u00020\u000e2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020E04H\u0002¢\u0006\u0004\bF\u00108J\u0017\u0010H\u001a\u00020\u000e2\u0006\u0010G\u001a\u00020EH\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u000eH\u0002¢\u0006\u0004\bJ\u0010\u0003J\u000f\u0010K\u001a\u00020\u000eH\u0002¢\u0006\u0004\bK\u0010\u0003J\u000f\u0010L\u001a\u00020\u000eH\u0002¢\u0006\u0004\bL\u0010\u0003J\u000f\u0010M\u001a\u00020\u000eH\u0002¢\u0006\u0004\bM\u0010\u0003J\u000f\u0010N\u001a\u00020\u000eH\u0002¢\u0006\u0004\bN\u0010\u0003J\u000f\u0010O\u001a\u00020\u000eH\u0002¢\u0006\u0004\bO\u0010\u0003J\u000f\u0010P\u001a\u00020\u000eH\u0002¢\u0006\u0004\bP\u0010\u0003J\u000f\u0010Q\u001a\u00020\u000eH\u0002¢\u0006\u0004\bQ\u0010\u0003J\u0017\u0010T\u001a\u00020\u000e2\u0006\u0010S\u001a\u00020RH\u0002¢\u0006\u0004\bT\u0010UJ\u0017\u0010V\u001a\u00020\u000e2\u0006\u0010S\u001a\u00020RH\u0002¢\u0006\u0004\bV\u0010UJ\u000f\u0010W\u001a\u00020\u000eH\u0002¢\u0006\u0004\bW\u0010\u0003J\u0017\u0010Y\u001a\u00020\u000e2\u0006\u0010X\u001a\u00020\u0013H\u0002¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\u000eH\u0002¢\u0006\u0004\b[\u0010\u0003J\u000f\u0010\\\u001a\u00020RH\u0002¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020\u000eH\u0002¢\u0006\u0004\b^\u0010\u0003J\u000f\u0010_\u001a\u00020\u000eH\u0002¢\u0006\u0004\b_\u0010\u0003J\u000f\u0010`\u001a\u00020\u000eH\u0002¢\u0006\u0004\b`\u0010\u0003J\u000f\u0010a\u001a\u00020\u000eH\u0002¢\u0006\u0004\ba\u0010\u0003J\u000f\u0010b\u001a\u00020\u000eH\u0002¢\u0006\u0004\bb\u0010\u0003J\u000f\u0010c\u001a\u00020\u000eH\u0002¢\u0006\u0004\bc\u0010\u0003J\u000f\u0010d\u001a\u00020\u000eH\u0002¢\u0006\u0004\bd\u0010\u0003J\u001f\u0010g\u001a\u00020R2\u0006\u0010e\u001a\u00020R2\u0006\u0010f\u001a\u00020RH\u0002¢\u0006\u0004\bg\u0010hR\u001a\u0010l\u001a\u00020R8\u0016X\u0096D¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010]R\u001a\u0010o\u001a\u00020R8\u0014X\u0094D¢\u0006\f\n\u0004\bm\u0010j\u001a\u0004\bn\u0010]R\u001b\u0010u\u001a\u00020p8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR\u001b\u0010z\u001a\u00020v8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bw\u0010r\u001a\u0004\bx\u0010yR\u0014\u0010~\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0019\u0010\u0082\u0001\u001a\u00020\u007f8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001a\u0010\u0086\u0001\u001a\u00030\u0083\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001a\u0010\u008a\u0001\u001a\u00030\u0087\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R5\u0010\u0093\u0001\u001a\u00030\u008b\u00012\b\u0010\u008c\u0001\u001a\u00030\u008b\u00018B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R \u0010\u0097\u0001\u001a\t\u0012\u0004\u0012\u00020R0\u0094\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R \u0010\u009b\u0001\u001a\t\u0012\u0004\u0012\u00020R0\u0098\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R \u0010 \u0001\u001a\u00030\u009c\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u009d\u0001\u0010r\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R \u0010¥\u0001\u001a\u00030¡\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b¢\u0001\u0010r\u001a\u0006\b£\u0001\u0010¤\u0001R\u001e\u0010¨\u0001\u001a\u00020v8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b¦\u0001\u0010r\u001a\u0005\b§\u0001\u0010yR \u0010\u00ad\u0001\u001a\u00030©\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bª\u0001\u0010r\u001a\u0006\b«\u0001\u0010¬\u0001R \u0010²\u0001\u001a\u00030®\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b¯\u0001\u0010r\u001a\u0006\b°\u0001\u0010±\u0001R \u0010·\u0001\u001a\u00030³\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b´\u0001\u0010r\u001a\u0006\bµ\u0001\u0010¶\u0001R\"\u0010»\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0016\u0018\u00010¸\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u0019\u0010½\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010\u008d\u0001R\u0018\u0010¿\u0001\u001a\u00020{8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¾\u0001\u0010}R\u001c\u0010Ã\u0001\u001a\u0005\u0018\u00010À\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R'\u0010Æ\u0001\u001a\u0012\u0012\r\u0012\u000b Ä\u0001*\u0004\u0018\u00010\u00160\u00160¸\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010º\u0001R\u0017\u0010É\u0001\u001a\u00020{8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÇ\u0001\u0010È\u0001¨\u0006Ê\u0001"}, m65681d2 = {"Lcom/whoop/community/CommunityLandingHostFragment;", "Lhj0/m;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onCreate", "(Landroid/os/Bundle;)V", "D1", "Landroid/widget/TextView;", "titleView", "Lde/hdodenhof/circleimageview/CircleImageView;", "backArrow", "Landroid/widget/Spinner;", "menu", "toolbar", "F1", "(Landroid/widget/TextView;Lde/hdodenhof/circleimageview/CircleImageView;Landroid/widget/Spinner;Landroid/view/View;)V", "m0", "m1", "l0", "Lh51/f;", "carouselState", "y0", "(Lh51/f;)V", "Lqv1/g;", "communityRafState", "D0", "(Lqv1/g;)V", "i1", "w1", "h1", "", "Lcom/whoop/domain/model/teams/MemberStory;", "memberStories", "r0", "(Ljava/util/List;)V", "Lcom/whoop/domain/model/teams/TeamInviteDto;", "pendingInvites", "s0", "Lcom/whoop/domain/model/teams/FeatureTeam;", "teamList", "o0", "featureTeam", "p1", "(Lcom/whoop/domain/model/teams/FeatureTeam;)V", "teamInviteDto", "q1", "(Lcom/whoop/domain/model/teams/TeamInviteDto;)V", "Lcom/whoop/domain/model/teams/Team;", "u0", "team", "r1", "(Lcom/whoop/domain/model/teams/Team;)V", "W0", "T0", "S0", "J1", "R0", "I1", "t1", "u1", "", "urlPath", "s1", "(Ljava/lang/String;)V", "v1", "y1", "item", "o1", "(I)V", "A1", "I0", "()Ljava/lang/String;", "j1", "U0", "V0", "K1", "w0", "g1", "k1", "period", "pillar", "O0", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "getLogTag", "logTag", "x", "getScreenName", "screenName", "Lnq0/i;", "y", "Ll83/h;", "Q0", "()Lnq0/i;", "viewModel", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "z", "K0", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "", "E", "Z", "isCommunityRafEnabled", "Lnq0/f;", "F", "Lnq0/f;", "communityLandingTeamAdapter", "Lnq0/b;", "G", "Lnq0/b;", "communityLandingFeatureTeamAdapter", "Lnq0/l;", "H", "Lnq0/l;", "communityPendingInviteAdapter", "Leq0/r0;", "<set-?>", "I", "Lcom/whoop/ui/b;", "J0", "()Leq0/r0;", "x1", "(Leq0/r0;)V", "dataBinding", "Landroid/widget/ArrayAdapter;", "J", "Landroid/widget/ArrayAdapter;", "communityMenuAdapter", "", "K", "[Ljava/lang/String;", "communityMenuValues", "Lor2/y;", "L", "getExternalLinkNavigator", "()Lor2/y;", "externalLinkNavigator", "Lqe1/b;", "M", "H0", "()Lqe1/b;", "analyticsHelper", "N", "L0", "ffChecker", "Lcom/whoop/data/repositories/LanguageRepository;", "O", "M0", "()Lcom/whoop/data/repositories/LanguageRepository;", "languageRepository", "Lj02/o0;", "P", "getNavigator", "()Lj02/o0;", "navigator", "Lo02/d;", "Q", "N0", "()Lo02/d;", "navigationReducer", "Lj/d;", "R", "Lj/d;", "activityResultLauncher", "S", "pendingInviteCount", "T", "emptyStateFlag", "Lnq0/e;", "U", "Lnq0/e;", "navRouter", "kotlin.jvm.PlatformType", "V", "videoActivityResultLauncher", "P0", "()Z", "teamsOnly", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class CommunityLandingHostFragment extends AbstractC17354m {

    /* JADX INFO: renamed from: W */
    static final /* synthetic */ InterfaceC21493z[] f24786W = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(CommunityLandingHostFragment.class, "dataBinding", "getDataBinding()Lcom/whoop/community/databinding/FragmentCommunityLandingBinding;", 0))};

    /* JADX INFO: renamed from: X */
    public static final int f24787X = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final boolean isCommunityRafEnabled;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private C27043f communityLandingTeamAdapter;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private C27039b communityLandingFeatureTeamAdapter;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private C27049l communityPendingInviteAdapter;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final C10462b dataBinding;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private ArrayAdapter<String> communityMenuAdapter;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private String[] communityMenuValues;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC23462h externalLinkNavigator;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final InterfaceC23462h ffChecker;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final InterfaceC23462h languageRepository;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final InterfaceC23462h navigationReducer;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private AbstractC21065d activityResultLauncher;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private int pendingInviteCount;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private boolean emptyStateFlag;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private C27042e navRouter;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private final AbstractC21065d videoActivityResultLauncher;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String logTag = "CommunityLandingHostFragment";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final String screenName = "Community Landing";

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C6279j(this, null, new C6278i(this), null));

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: com.whoop.community.CommunityLandingHostFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.community.CommunityLandingHostFragment$onResume$3", m100430f = "CommunityLandingHostFragment.kt", m100431l = {254}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6270a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f24810w;

        /* JADX INFO: renamed from: com.whoop.community.CommunityLandingHostFragment$a$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ CommunityLandingHostFragment f24812w;

            public a(CommunityLandingHostFragment communityLandingHostFragment) {
                this.f24812w = communityLandingHostFragment;
            }

            /* JADX INFO: renamed from: b */
            public final Object m19008b(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (z4) {
                    this.f24812w.getNavigator().mo59393b(AbstractC21155m0.y3.f80645b);
                }
                return C23454a0.f92919a;
            }

            @Override // ec3.InterfaceC13062m
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                return m19008b(((Boolean) obj).booleanValue(), interfaceC30057d);
            }
        }

        public C6270a(InterfaceC30057d<? super C6270a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return CommunityLandingHostFragment.this.new C6270a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C6270a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f24810w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM81242s0 = CommunityLandingHostFragment.this.m18937Q0().getReactivationModalNavigationFlow();
                a aVar = new a(CommunityLandingHostFragment.this);
                this.f24810w = 1;
                if (interfaceC13058lM81242s0.collect(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityLandingHostFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6271b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24813w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24814x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24815y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6271b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24813w = componentCallbacks;
            this.f24814x = interfaceC35951a;
            this.f24815y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f24813w;
            InterfaceC35951a interfaceC35951a = this.f24814x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24815y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityLandingHostFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6272c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24816w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24817x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24818y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6272c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24816w = componentCallbacks;
            this.f24817x = interfaceC35951a;
            this.f24818y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.y] */
        @Override // c93.InterfaceC4339a
        public final C28216y invoke() {
            ComponentCallbacks componentCallbacks = this.f24816w;
            InterfaceC35951a interfaceC35951a = this.f24817x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24818y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28216y.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityLandingHostFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6273d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24819w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24820x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24821y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6273d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24819w = componentCallbacks;
            this.f24820x = interfaceC35951a;
            this.f24821y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, qe1.b] */
        @Override // c93.InterfaceC4339a
        public final C30304b invoke() {
            ComponentCallbacks componentCallbacks = this.f24819w;
            InterfaceC35951a interfaceC35951a = this.f24820x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24821y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C30304b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityLandingHostFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6274e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24822w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24823x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24824y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6274e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24822w = componentCallbacks;
            this.f24823x = interfaceC35951a;
            this.f24824y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f24822w;
            InterfaceC35951a interfaceC35951a = this.f24823x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24824y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityLandingHostFragment$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6275f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24825w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24826x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24827y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6275f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24825w = componentCallbacks;
            this.f24826x = interfaceC35951a;
            this.f24827y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.LanguageRepository, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final LanguageRepository invoke() {
            ComponentCallbacks componentCallbacks = this.f24825w;
            InterfaceC35951a interfaceC35951a = this.f24826x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24827y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(LanguageRepository.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityLandingHostFragment$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6276g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24828w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24829x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24830y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6276g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24828w = componentCallbacks;
            this.f24829x = interfaceC35951a;
            this.f24830y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f24828w;
            InterfaceC35951a interfaceC35951a = this.f24829x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24830y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityLandingHostFragment$h */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6277h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24831w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24832x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24833y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6277h(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24831w = componentCallbacks;
            this.f24832x = interfaceC35951a;
            this.f24833y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o02.d] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC27353d invoke() {
            ComponentCallbacks componentCallbacks = this.f24831w;
            InterfaceC35951a interfaceC35951a = this.f24832x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24833y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC27353d.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityLandingHostFragment$i */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6278i extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f24834w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6278i(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f24834w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.f24834w.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity()");
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity2 = this.f24834w.requireActivity();
            C1579e2 viewModelStore = abstractActivityC1340r0RequireActivity.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, abstractActivityC1340r0RequireActivity2);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityLandingHostFragment$j */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6279j extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f24835w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24836x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24837y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f24838z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6279j(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f24835w = abstractComponentCallbacksC1320m0;
            this.f24836x = interfaceC35951a;
            this.f24837y = interfaceC4339a;
            this.f24838z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, nq0.i] */
        @Override // c93.InterfaceC4339a
        public final C27046i invoke() {
            return AbstractC37056f.m118952D(this.f24835w, this.f24836x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27046i.class), this.f24837y, this.f24838z);
        }
    }

    public CommunityLandingHostFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.featureFlagChecker = AbstractC30060g.m92087G(enumC23463i, new C6271b(this, null, null));
        this.isCommunityRafEnabled = m18923K0().isFeatureEnabled("android-family-plan-community-entry-point");
        this.dataBinding = AbstractC10463c.m26725b(this, new C38448b(2));
        this.externalLinkNavigator = AbstractC30060g.m92087G(enumC23463i, new C6272c(this, null, null));
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C6273d(this, null, null));
        this.ffChecker = AbstractC30060g.m92087G(enumC23463i, new C6274e(this, null, null));
        this.languageRepository = AbstractC30060g.m92087G(enumC23463i, new C6275f(this, null, null));
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C6276g(this, null, new C38511h(this, 0)));
        this.navigationReducer = AbstractC30060g.m92087G(enumC23463i, new C6277h(this, null, null));
        this.emptyStateFlag = true;
        AbstractC21065d abstractC21065dRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new C1904o(this, 18));
        AbstractC22676k.m65749i(abstractC21065dRegisterForActivityResult, "registerForActivityResult(...)");
        this.videoActivityResultLauncher = abstractC21065dRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final C23454a0 m18896A0(C16934f c16934f, CommunityLandingHostFragment communityLandingHostFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            String[] strArr = communityLandingHostFragment.communityMenuValues;
            if (strArr == null) {
                AbstractC22676k.m65757q("communityMenuValues");
                throw null;
            }
            boolean zM87157i = c28655q.m87157i(communityLandingHostFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C38510g(communityLandingHostFragment, 8);
                c28655q.m87172p0(objM87133R);
            }
            Function1 function1 = (Function1) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(communityLandingHostFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C38510g(communityLandingHostFragment, 10);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC33751b.m106709j(c16934f, strArr, function1, (Function1) objM87133R2, c28655q, C16934f.f64958n);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: A1 */
    private final void m18897A1() {
        AbstractC13522r0 abstractC13522r0M18920J0 = m18920J0();
        BottomSheetBehavior bottomSheetBehaviorM15688O = BottomSheetBehavior.m15688O(abstractC13522r0M18920J0.f47599k.f47791d);
        bottomSheetBehaviorM15688O.m15700V(0);
        bottomSheetBehaviorM15688O.f20782J = true;
        bottomSheetBehaviorM15688O.m15701W(5);
        LinearLayout rankLayoutV1 = abstractC13522r0M18920J0.f47583I;
        AbstractC22676k.m65749i(rankLayoutV1, "rankLayoutV1");
        AbstractC1953c.m5963a(rankLayoutV1, new C38512i(this, bottomSheetBehaviorM15688O, abstractC13522r0M18920J0));
        StrokedPillButton communityLandingRankApply = abstractC13522r0M18920J0.f47599k.f47788a;
        AbstractC22676k.m65749i(communityLandingRankApply, "communityLandingRankApply");
        AbstractC1953c.m5963a(communityLandingRankApply, new C38512i(bottomSheetBehaviorM15688O, this, abstractC13522r0M18920J0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final C23454a0 m18898B0(CommunityLandingHostFragment communityLandingHostFragment, Object it) {
        AbstractC22676k.m65750j(it, "it");
        C27042e c27042e = communityLandingHostFragment.navRouter;
        if (c27042e != null) {
            c27042e.m81161c(it);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B1 */
    public static final C23454a0 m18899B1(CommunityLandingHostFragment communityLandingHostFragment, BottomSheetBehavior bottomSheetBehavior, AbstractC13522r0 abstractC13522r0, View it) {
        AbstractC22676k.m65750j(it, "it");
        communityLandingHostFragment.getEventDispatcher().m129042l();
        bottomSheetBehavior.m15701W(3);
        abstractC13522r0.f47599k.f47793f.m19546k(communityLandingHostFragment.m18937Q0().getSelectedRankPillarType().ordinal());
        abstractC13522r0.f47599k.f47798k.check(communityLandingHostFragment.m18937Q0().m81240q0());
        abstractC13522r0.f47599k.f47797j.setText(communityLandingHostFragment.getString(AbstractC38505d0.f165684k2, LocalDate.now().toString(DateTimeFormat.forPattern("MMMM"))));
        abstractC13522r0.f47599k.f47799l.setText(communityLandingHostFragment.m18917I0());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final C23454a0 m18900C0(CommunityLandingHostFragment communityLandingHostFragment, int i13) {
        communityLandingHostFragment.m18985o1(i13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C1 */
    public static final C23454a0 m18901C1(BottomSheetBehavior bottomSheetBehavior, CommunityLandingHostFragment communityLandingHostFragment, AbstractC13522r0 abstractC13522r0, View it) {
        AbstractC22676k.m65750j(it, "it");
        bottomSheetBehavior.m15701W(5);
        C27046i c27046iM18937Q0 = communityLandingHostFragment.m18937Q0();
        Integer selectedIndex = abstractC13522r0.f47599k.f47793f.getSelectedIndex();
        c27046iM18937Q0.m81219F0(selectedIndex != null ? selectedIndex.intValue() : 0);
        communityLandingHostFragment.m18937Q0().m81222K0(abstractC13522r0.f47599k.f47798k.getCheckedRadioButtonId());
        C40191e eventDispatcher = communityLandingHostFragment.getEventDispatcher();
        C27046i c27046iM18937Q1 = communityLandingHostFragment.m18937Q0();
        Integer selectedIndex2 = abstractC13522r0.f47599k.f47793f.getSelectedIndex();
        eventDispatcher.m129026b(c27046iM18937Q1.m81238o0(selectedIndex2 != null ? selectedIndex2.intValue() : 0), communityLandingHostFragment.m18937Q0().m81237n0(abstractC13522r0.f47599k.f47798k.getCheckedRadioButtonId()));
        communityLandingHostFragment.m18975j1();
        communityLandingHostFragment.m18937Q0().m81221I0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D0 */
    private final void m18902D0(C30656g communityRafState) {
        m18920J0().f47611w.setContent(new C37816b(new C38513j(communityRafState, this, 0), true, -2033288500));
    }

    /* JADX INFO: renamed from: D1 */
    private final void m18903D1() {
        TextView communityToolbarTitleV1 = m18920J0().f47594f.f47708c;
        AbstractC22676k.m65749i(communityToolbarTitleV1, "communityToolbarTitleV1");
        CircleImageView communityLeftArrowImageviewV1 = m18920J0().f47594f.f47706a;
        AbstractC22676k.m65749i(communityLeftArrowImageviewV1, "communityLeftArrowImageviewV1");
        Spinner communityMenuV1 = m18920J0().f47594f.f47707b;
        AbstractC22676k.m65749i(communityMenuV1, "communityMenuV1");
        View root = m18920J0().f47594f.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        m18909F1(communityToolbarTitleV1, communityLeftArrowImageviewV1, communityMenuV1, root);
        NestedScrollView nestedScrollView = m18920J0().f47593e;
        C35331f0 c35331f0 = new C35331f0(7);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        AbstractC16877h0.m47517l(nestedScrollView, c35331f0);
        getActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final C23454a0 m18905E0(C30656g c30656g, CommunityLandingHostFragment communityLandingHostFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC38073e.m121966n(null, null, null, null, AbstractC37817c.m121344e(-1771359375, c28655q, new C38513j(c30656g, communityLandingHostFragment, 1)), c28655q, 24576, 15);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E1 */
    public static final C16905q1 m18906E1(View v13, C16905q1 windowInsets) {
        AbstractC22676k.m65750j(v13, "v");
        AbstractC22676k.m65750j(windowInsets, "windowInsets");
        ViewGroup.LayoutParams layoutParams = v13.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = 0;
        v13.setLayoutParams(marginLayoutParams);
        return windowInsets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final C23454a0 m18908F0(C30656g c30656g, CommunityLandingHostFragment communityLandingHostFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM87157i = c28655q.m87157i(communityLandingHostFragment);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C38510g(communityLandingHostFragment, 7);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC30650a.m94213c(c30656g, (Function1) objM87133R, c28655q, C30656g.f126103b);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: F1 */
    private final void m18909F1(TextView titleView, CircleImageView backArrow, Spinner menu, View toolbar) {
        toolbar.setVisibility(0);
        menu.setVisibility(8);
        backArrow.setVisibility(0);
        backArrow.setImageResource(AbstractC16272a.f61979P1);
        titleView.setText(getString(AbstractC38505d0.f165615R0));
        AbstractC1953c.m5963a(backArrow, new C38510g(this, 3));
        C2865t c2865t = new C2865t(toolbar.getPaddingTop(), 5);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        AbstractC16877h0.m47517l(toolbar, c2865t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final C23454a0 m18911G0(CommunityLandingHostFragment communityLandingHostFragment, Object it) {
        AbstractC22676k.m65750j(it, "it");
        C27042e c27042e = communityLandingHostFragment.navRouter;
        if (c27042e != null) {
            c27042e.m81161c(it);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G1 */
    public static final C23454a0 m18912G1(CommunityLandingHostFragment communityLandingHostFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC5583n.m16799z(communityLandingHostFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: H0 */
    private final C30304b m18914H0() {
        return (C30304b) this.analyticsHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H1 */
    public static final C16905q1 m18915H1(int i13, View v13, C16905q1 windowInsets) {
        AbstractC22676k.m65750j(v13, "v");
        AbstractC22676k.m65750j(windowInsets, "windowInsets");
        C35643b c35643bMo47530g = windowInsets.f64864a.mo47530g(7);
        AbstractC22676k.m65749i(c35643bMo47530g, "getInsets(...)");
        v13.setPadding(v13.getPaddingLeft(), c35643bMo47530g.f151450b + i13, v13.getPaddingRight(), v13.getPaddingBottom());
        return windowInsets;
    }

    /* JADX INFO: renamed from: I0 */
    private final String m18917I0() {
        LocalDate localDateNow = LocalDate.now();
        DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("MM/dd");
        String string = getString(AbstractC38505d0.f165688l2, localDateNow.withDayOfWeek(1).toString(dateTimeFormatterForPattern).toString(), localDateNow.withDayOfWeek(7).toString(dateTimeFormatterForPattern));
        AbstractC22676k.m65749i(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: I1 */
    private final void m18918I1() {
        AbstractC13522r0 abstractC13522r0M18920J0 = m18920J0();
        abstractC13522r0M18920J0.f47584J.setVisibility(0);
        abstractC13522r0M18920J0.f47613y.setVisibility(0);
        abstractC13522r0M18920J0.f47610v.setVisibility(8);
        if (m18937Q0().m81218E0()) {
            abstractC13522r0M18920J0.f47609u.setVisibility(0);
            abstractC13522r0M18920J0.f47592d.setVisibility(8);
            abstractC13522r0M18920J0.f47612x.setVisibility(8);
        } else {
            abstractC13522r0M18920J0.f47592d.setVisibility(0);
            abstractC13522r0M18920J0.f47609u.setVisibility(8);
            abstractC13522r0M18920J0.f47612x.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: J0 */
    private final AbstractC13522r0 m18920J0() {
        return (AbstractC13522r0) this.dataBinding.getValue(this, f24786W[0]);
    }

    /* JADX INFO: renamed from: J1 */
    private final void m18921J1() {
        AbstractC13522r0 abstractC13522r0M18920J0 = m18920J0();
        abstractC13522r0M18920J0.f47590b.setVisibility(0);
        abstractC13522r0M18920J0.f47589a.setVisibility(0);
        abstractC13522r0M18920J0.f47578D.setVisibility(0);
        abstractC13522r0M18920J0.f47579E.setVisibility(0);
    }

    /* JADX INFO: renamed from: K0 */
    private final FeatureFlagChecker m18923K0() {
        return (FeatureFlagChecker) this.featureFlagChecker.getValue();
    }

    /* JADX INFO: renamed from: K1 */
    private final void m18924K1() {
        AbstractC13522r0 abstractC13522r0M18920J0 = m18920J0();
        abstractC13522r0M18920J0.f47588N.setVisibility(0);
        abstractC13522r0M18920J0.f47583I.setVisibility(0);
        abstractC13522r0M18920J0.f47587M.setVisibility(0);
    }

    /* JADX INFO: renamed from: L0 */
    private final FeatureFlagChecker m18926L0() {
        return (FeatureFlagChecker) this.ffChecker.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L1 */
    public static final void m18927L1(CommunityLandingHostFragment communityLandingHostFragment, C21062a result) {
        String stringExtra;
        AbstractC22676k.m65750j(result, "result");
        Intent intent = result.f79916x;
        if (intent == null || (stringExtra = intent.getStringExtra("ARTICLE_TITLE")) == null) {
            stringExtra = "";
        }
        communityLandingHostFragment.m18914H0().m92656a(new InterfaceC30303a.a(stringExtra));
        if (intent == null || !intent.getBooleanExtra("USER_VIEWED_FULL_VIDEO", false)) {
            return;
        }
        communityLandingHostFragment.m18914H0().m92656a(new InterfaceC30303a.d(stringExtra));
    }

    /* JADX INFO: renamed from: M0 */
    private final LanguageRepository m18929M0() {
        return (LanguageRepository) this.languageRepository.getValue();
    }

    /* JADX INFO: renamed from: N0 */
    private final InterfaceC27353d m18931N0() {
        return (InterfaceC27353d) this.navigationReducer.getValue();
    }

    /* JADX INFO: renamed from: O0 */
    private final String m18933O0(String period, String pillar) {
        String string = getString(m18937Q0().m81241r0(period, pillar));
        AbstractC22676k.m65749i(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: P0 */
    private final boolean m18935P0() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("teamsOnly");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public final C27046i m18937Q0() {
        return (C27046i) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: R0 */
    private final void m18939R0() {
        AbstractC13522r0 abstractC13522r0M18920J0 = m18920J0();
        m18937Q0().m81226Q0(true);
        abstractC13522r0M18920J0.f47609u.setVisibility(0);
        abstractC13522r0M18920J0.f47592d.setVisibility(8);
        abstractC13522r0M18920J0.f47584J.setVisibility(0);
        abstractC13522r0M18920J0.f47613y.setVisibility(0);
        abstractC13522r0M18920J0.f47612x.setVisibility(8);
    }

    /* JADX INFO: renamed from: S0 */
    private final void m18941S0() {
        m18920J0().f47614z.f47735b.setVisibility(8);
    }

    /* JADX INFO: renamed from: T0 */
    private final void m18943T0() {
        AbstractC13522r0 abstractC13522r0M18920J0 = m18920J0();
        abstractC13522r0M18920J0.f47590b.setVisibility(8);
        abstractC13522r0M18920J0.f47589a.setVisibility(8);
        abstractC13522r0M18920J0.f47578D.setVisibility(8);
        abstractC13522r0M18920J0.f47579E.setVisibility(8);
    }

    /* JADX INFO: renamed from: U0 */
    private final void m18945U0() {
        ThrobberView throbberView = m18920J0().f47601m;
        throbberView.m26664g();
        throbberView.setVisibility(8);
    }

    /* JADX INFO: renamed from: V0 */
    private final void m18947V0() {
        AbstractC13522r0 abstractC13522r0M18920J0 = m18920J0();
        abstractC13522r0M18920J0.f47588N.setVisibility(8);
        abstractC13522r0M18920J0.f47583I.setVisibility(8);
        abstractC13522r0M18920J0.f47587M.setVisibility(8);
    }

    /* JADX INFO: renamed from: W0 */
    private final void m18949W0() {
        final AbstractC13522r0 abstractC13522r0M18920J0 = m18920J0();
        TextView allInviteCountV1 = abstractC13522r0M18920J0.f47590b;
        AbstractC22676k.m65749i(allInviteCountV1, "allInviteCountV1");
        AbstractC1953c.m5963a(allInviteCountV1, new C38510g(this, 4));
        LinearLayout exploreLayoutV1 = abstractC13522r0M18920J0.f47610v;
        AbstractC22676k.m65749i(exploreLayoutV1, "exploreLayoutV1");
        AbstractC1953c.m5963a(exploreLayoutV1, new C38510g(this, 9));
        abstractC13522r0M18920J0.f47608t.setVisibility(8);
        TextView buttonCreateTeam = abstractC13522r0M18920J0.f47604p.f47473a;
        AbstractC22676k.m65749i(buttonCreateTeam, "buttonCreateTeam");
        AbstractC1953c.m5963a(buttonCreateTeam, new C38510g(this, 11));
        TextView buttonInviteCode = abstractC13522r0M18920J0.f47604p.f47474b;
        AbstractC22676k.m65749i(buttonInviteCode, "buttonInviteCode");
        AbstractC1953c.m5963a(buttonInviteCode, new C38510g(this, 12));
        LinearLayout buttonCreateTeam2 = abstractC13522r0M18920J0.f47591c.f47514a.f47418a;
        AbstractC22676k.m65749i(buttonCreateTeam2, "buttonCreateTeam");
        AbstractC1953c.m5963a(buttonCreateTeam2, new C38510g(this, 13));
        LinearLayout buttonInviteCode2 = abstractC13522r0M18920J0.f47591c.f47514a.f47419b;
        AbstractC22676k.m65749i(buttonInviteCode2, "buttonInviteCode");
        AbstractC1953c.m5963a(buttonInviteCode2, new C38510g(this, 14));
        LinearLayout collapseLayoutV1 = abstractC13522r0M18920J0.f47592d;
        AbstractC22676k.m65749i(collapseLayoutV1, "collapseLayoutV1");
        final int i13 = 0;
        AbstractC1953c.m5963a(collapseLayoutV1, new Function1(this) { // from class: xp0.l

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ CommunityLandingHostFragment f165769x;

            {
                this.f165769x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        return CommunityLandingHostFragment.m18963d1(this.f165769x, abstractC13522r0M18920J0, (View) obj);
                    default:
                        return CommunityLandingHostFragment.m18965e1(this.f165769x, abstractC13522r0M18920J0, (View) obj);
                }
            }
        });
        LinearLayout expandLayoutV1 = abstractC13522r0M18920J0.f47609u;
        AbstractC22676k.m65749i(expandLayoutV1, "expandLayoutV1");
        final int i14 = 1;
        AbstractC1953c.m5963a(expandLayoutV1, new Function1(this) { // from class: xp0.l

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ CommunityLandingHostFragment f165769x;

            {
                this.f165769x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        return CommunityLandingHostFragment.m18963d1(this.f165769x, abstractC13522r0M18920J0, (View) obj);
                    default:
                        return CommunityLandingHostFragment.m18965e1(this.f165769x, abstractC13522r0M18920J0, (View) obj);
                }
            }
        });
        LinearLayout viewAllLayout = abstractC13522r0M18920J0.f47614z.f47738e;
        AbstractC22676k.m65749i(viewAllLayout, "viewAllLayout");
        AbstractC1953c.m5963a(viewAllLayout, new C38510g(this, 15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final C23454a0 m18951X0(CommunityLandingHostFragment communityLandingHostFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        communityLandingHostFragment.getEventDispatcher().m129050p(String.valueOf(communityLandingHostFragment.pendingInviteCount));
        AbstractC28163g0.m85259o(communityLandingHostFragment).m85336b(AbstractC38499a0.f165283f);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final C23454a0 m18953Y0(CommunityLandingHostFragment communityLandingHostFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        communityLandingHostFragment.getEventDispatcher().m128991H("Landing Page");
        String string = communityLandingHostFragment.getString(AbstractC38505d0.f165586H1);
        AbstractC22676k.m65749i(string, "getString(...)");
        communityLandingHostFragment.m18993s1(string);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final C23454a0 m18955Z0(CommunityLandingHostFragment communityLandingHostFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC28163g0.m85259o(communityLandingHostFragment).m85336b(AbstractC38499a0.f165310i);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final C23454a0 m18957a1(CommunityLandingHostFragment communityLandingHostFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        Intent intent = new Intent(communityLandingHostFragment.requireContext(), (Class<?>) InviteCodeActivity.class);
        intent.putExtra("fromCommunityLanding", true);
        intent.putExtra("joinTeam", true);
        communityLandingHostFragment.startActivityForResult(intent, AbstractC1848z0.MAX_BIND_PARAMETER_CNT);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final C23454a0 m18959b1(CommunityLandingHostFragment communityLandingHostFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC28163g0.m85259o(communityLandingHostFragment).m85336b(AbstractC38499a0.f165310i);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public static final C23454a0 m18961c1(CommunityLandingHostFragment communityLandingHostFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        communityLandingHostFragment.getEventDispatcher().m129018U0("Empty State", "View");
        AbstractC28163g0.m85259o(communityLandingHostFragment).m85336b(AbstractC38499a0.f165301h);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final C23454a0 m18963d1(CommunityLandingHostFragment communityLandingHostFragment, AbstractC13522r0 abstractC13522r0, View it) {
        AbstractC22676k.m65750j(it, "it");
        communityLandingHostFragment.m18937Q0().m81226Q0(true);
        abstractC13522r0.f47612x.setVisibility(8);
        abstractC13522r0.f47609u.setVisibility(0);
        abstractC13522r0.f47592d.setVisibility(8);
        communityLandingHostFragment.getEventDispatcher().m128997K("Collapse");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public static final C23454a0 m18965e1(CommunityLandingHostFragment communityLandingHostFragment, AbstractC13522r0 abstractC13522r0, View it) {
        AbstractC22676k.m65750j(it, "it");
        communityLandingHostFragment.m18937Q0().m81226Q0(false);
        abstractC13522r0.f47592d.setVisibility(0);
        abstractC13522r0.f47612x.setVisibility(0);
        abstractC13522r0.f47609u.setVisibility(8);
        communityLandingHostFragment.getEventDispatcher().m128997K("Expand");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public static final C23454a0 m18967f1(CommunityLandingHostFragment communityLandingHostFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        communityLandingHostFragment.getEventDispatcher().m129013S();
        communityLandingHostFragment.m18997u1();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g1 */
    private final void m18969g1() {
        m18920J0().f47614z.f47734a.setText(getString(AbstractC38505d0.f165589I1));
    }

    private final C28216y getExternalLinkNavigator() {
        return (C28216y) this.externalLinkNavigator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    /* JADX INFO: renamed from: h1 */
    private final void m18971h1() {
        m18920J0().f47597i.setVisibility(0);
        m18920J0().f47598j.setVisibility(8);
        ThrobberView throbberView = m18920J0().f47600l;
        throbberView.m26663f();
        throbberView.setVisibility(0);
        m18920J0().f47593e.setVisibility(8);
    }

    /* JADX INFO: renamed from: i1 */
    private final void m18973i1() {
        m18920J0().f47597i.setVisibility(0);
        m18920J0().f47593e.setVisibility(8);
        m18920J0().f47598j.setVisibility(0);
        ThrobberView throbberView = m18920J0().f47600l;
        throbberView.m26664g();
        throbberView.setVisibility(8);
    }

    /* JADX INFO: renamed from: j1 */
    private final void m18975j1() {
        ThrobberView throbberView = m18920J0().f47601m;
        throbberView.m26663f();
        throbberView.setVisibility(0);
    }

    /* JADX INFO: renamed from: k1 */
    private final void m18977k1() {
        AbstractC13522r0 abstractC13522r0M18920J0 = m18920J0();
        ViewGroup.LayoutParams layoutParams = abstractC13522r0M18920J0.f47606r.getLayoutParams();
        C1141d c1141d = layoutParams instanceof C1141d ? (C1141d) layoutParams : null;
        if (c1141d != null) {
            c1141d.f5058k = abstractC13522r0M18920J0.f47581G.getId();
        }
        abstractC13522r0M18920J0.f47606r.requestLayout();
        ViewGroup.LayoutParams layoutParams2 = abstractC13522r0M18920J0.f47584J.getLayoutParams();
        C1141d c1141d2 = layoutParams2 instanceof C1141d ? (C1141d) layoutParams2 : null;
        if (c1141d2 != null) {
            c1141d2.f5056j = abstractC13522r0M18920J0.f47614z.getRoot().getId();
        }
        abstractC13522r0M18920J0.f47584J.requestLayout();
        ViewGroup.LayoutParams layoutParams3 = abstractC13522r0M18920J0.f47578D.getLayoutParams();
        C1141d c1141d3 = layoutParams3 instanceof C1141d ? (C1141d) layoutParams3 : null;
        if (c1141d3 != null) {
            c1141d3.f5056j = abstractC13522r0M18920J0.f47581G.getId();
        }
        abstractC13522r0M18920J0.f47578D.requestLayout();
        NestedScrollView communityLandingHomeScrollviewV1 = abstractC13522r0M18920J0.f47593e;
        AbstractC22676k.m65749i(communityLandingHomeScrollviewV1, "communityLandingHomeScrollviewV1");
        communityLandingHomeScrollviewV1.setPadding(0, 0, 0, 0);
        ViewGroup.LayoutParams layoutParams4 = abstractC13522r0M18920J0.f47602n.getLayoutParams();
        FrameLayout.LayoutParams layoutParams5 = layoutParams4 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams4 : null;
        if (layoutParams5 != null) {
            layoutParams5.bottomMargin = 88;
            abstractC13522r0M18920J0.f47602n.setLayoutParams(layoutParams5);
        }
    }

    /* JADX INFO: renamed from: l0 */
    private final void m18978l0() {
        int i13 = (int) (124 * getResources().getDisplayMetrics().density);
        AbstractC13522r0 abstractC13522r0M18920J0 = m18920J0();
        ConstraintLayout constraintLayout = abstractC13522r0M18920J0.f47599k.f47791d;
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), abstractC13522r0M18920J0.f47599k.f47791d.getPaddingTop(), abstractC13522r0M18920J0.f47599k.f47791d.getPaddingRight(), i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public static final C34911a m18979l1(CommunityLandingHostFragment communityLandingHostFragment) {
        return AbstractC15751g.m44431K(communityLandingHostFragment.requireActivity());
    }

    /* JADX INFO: renamed from: m0 */
    private final void m18980m0() {
        boolean zM34112e = AbstractC12248d.m34112e(m18926L0());
        NestedScrollView nestedScrollView = m18920J0().f47593e;
        C12925v c12925v = new C12925v(zM34112e, this);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        AbstractC16877h0.m47517l(nestedScrollView, c12925v);
    }

    /* JADX INFO: renamed from: m1 */
    private final void m18981m1() {
        m18937Q0().m81215A0().observe(getViewLifecycleOwner(), new C6327f(new C38510g(this, 1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final C16905q1 m18982n0(boolean z4, CommunityLandingHostFragment communityLandingHostFragment, View v13, C16905q1 windowInsets) {
        AbstractC22676k.m65750j(v13, "v");
        AbstractC22676k.m65750j(windowInsets, "windowInsets");
        C35643b c35643bMo47530g = windowInsets.f64864a.mo47530g(7);
        AbstractC22676k.m65749i(c35643bMo47530g, "getInsets(...)");
        ViewGroup.LayoutParams layoutParams = v13.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = c35643bMo47530g.f151450b;
        v13.setLayoutParams(marginLayoutParams);
        if (z4) {
            ConstraintLayout communityLayoutV1 = communityLandingHostFragment.m18920J0().f47602n;
            AbstractC22676k.m65749i(communityLayoutV1, "communityLayoutV1");
            communityLayoutV1.setPadding(communityLayoutV1.getPaddingLeft(), communityLayoutV1.getPaddingTop(), communityLayoutV1.getPaddingRight(), c35643bMo47530g.f151452d + ((int) (160 * v13.getResources().getDisplayMetrics().density)));
        }
        return C16905q1.f64863b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public static final C23454a0 m18983n1(CommunityLandingHostFragment communityLandingHostFragment, C27047j c27047j) {
        C30656g c30656gM81262j;
        if (c27047j.getIsConnected()) {
            communityLandingHostFragment.m18971h1();
            if (c27047j.getUserTeamsLoaded() && c27047j.getPendingInvitesLoaded() && c27047j.getFeatureTeamsLoaded() && c27047j.getMemberStoriesLoaded()) {
                if (c27047j.m81263k().isEmpty()) {
                    communityLandingHostFragment.emptyStateFlag = false;
                    communityLandingHostFragment.m18920J0().f47591c.getRoot().setVisibility(0);
                    communityLandingHostFragment.m18920J0().f47604p.getRoot().setVisibility(8);
                    communityLandingHostFragment.m18947V0();
                } else {
                    communityLandingHostFragment.emptyStateFlag = true;
                    communityLandingHostFragment.m18920J0().f47591c.getRoot().setVisibility(8);
                    communityLandingHostFragment.m18920J0().f47603o.setVisibility(8);
                }
                communityLandingHostFragment.m19004y0(c27047j.getEducationCarousel());
                if (communityLandingHostFragment.isCommunityRafEnabled && (c30656gM81262j = c27047j.getRafCommunityScreen()) != null) {
                    ComposeView familyPlanEntryComposeView = communityLandingHostFragment.m18920J0().f47611w;
                    AbstractC22676k.m65749i(familyPlanEntryComposeView, "familyPlanEntryComposeView");
                    familyPlanEntryComposeView.setVisibility(communityLandingHostFragment.m18935P0() ? 8 : 0);
                    communityLandingHostFragment.m18902D0(c30656gM81262j);
                }
                communityLandingHostFragment.m18990r0(c27047j.m81258f());
                communityLandingHostFragment.m18978l0();
                communityLandingHostFragment.pendingInviteCount = c27047j.m81260h().size();
                communityLandingHostFragment.m18992s0(c27047j.m81260h());
                communityLandingHostFragment.m18984o0(c27047j.m81256d());
                communityLandingHostFragment.m18996u0(c27047j.m81263k());
                communityLandingHostFragment.m19001w1();
            }
        } else if (!c27047j.getIsConnected()) {
            communityLandingHostFragment.m18973i1();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o0 */
    private final void m18984o0(List<FeatureTeam> teamList) {
        m18918I1();
        this.communityLandingFeatureTeamAdapter = new C27039b(teamList, new C38510g(this, 6), new C38511h(this, 1));
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        linearLayoutManager.setOrientation(0);
        m18920J0().f47613y.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView = m18920J0().f47613y;
        C27039b c27039b = this.communityLandingFeatureTeamAdapter;
        if (c27039b == null) {
            AbstractC22676k.m65757q("communityLandingFeatureTeamAdapter");
            throw null;
        }
        recyclerView.setAdapter(c27039b);
        C27039b c27039b2 = this.communityLandingFeatureTeamAdapter;
        if (c27039b2 == null) {
            AbstractC22676k.m65757q("communityLandingFeatureTeamAdapter");
            throw null;
        }
        c27039b2.notifyDataSetChanged();
        List<FeatureTeam> list = teamList;
        if (list == null || list.isEmpty()) {
            m18939R0();
        }
    }

    /* JADX INFO: renamed from: o1 */
    private final void m18985o1(int item) {
        if (item == 0) {
            getEventDispatcher().m128983D("Menu");
            AbstractC28163g0.m85259o(this).m85336b(AbstractC38499a0.f165310i);
        } else if (item == 1) {
            getEventDispatcher().m129018U0("Menu", "View");
            AbstractC28163g0.m85259o(this).m85336b(AbstractC38499a0.f165301h);
        } else {
            if (item != 2) {
                return;
            }
            String string = getString(AbstractC38505d0.f165586H1);
            AbstractC22676k.m65749i(string, "getString(...)");
            m18993s1(string);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final C23454a0 m18986p0(CommunityLandingHostFragment communityLandingHostFragment, FeatureTeam it) {
        AbstractC22676k.m65750j(it, "it");
        communityLandingHostFragment.m18987p1(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p1 */
    private final void m18987p1(FeatureTeam featureTeam) {
        getEventDispatcher().m129046n(featureTeam.getCommunityId(), "Recommended Teams");
        C27046i c27046iM18937Q0 = m18937Q0();
        featureTeam.setShowBadge(false);
        c27046iM18937Q0.m81229Z0(featureTeam);
        C28198s c28198sM85259o = AbstractC28163g0.m85259o(this);
        AbstractC6326e.b bVarM19229f = AbstractC6326e.m19213b().m19229f(featureTeam.toDrawerDisplayInvite());
        AbstractC22676k.m65749i(bVarM19229f, "setInvitePojoCode(...)");
        c28198sM85259o.m85340f(bVarM19229f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final C23454a0 m18988q0(CommunityLandingHostFragment communityLandingHostFragment) {
        communityLandingHostFragment.m18995t1();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q1 */
    private final void m18989q1(TeamInviteDto teamInviteDto) {
        getEventDispatcher().m129046n(teamInviteDto.getCommunityId(), "Landing Page");
        C27046i c27046iM18937Q0 = m18937Q0();
        teamInviteDto.setShowBadge(false);
        c27046iM18937Q0.m81230a1(teamInviteDto);
        C28198s c28198sM85259o = AbstractC28163g0.m85259o(this);
        AbstractC6326e.b bVarM19228e = AbstractC6326e.m19213b().m19228e(teamInviteDto.toDrawerDisplayInvite());
        AbstractC22676k.m65749i(bVarM19228e, "setInvitePojo(...)");
        c28198sM85259o.m85340f(bVarM19228e);
    }

    /* JADX INFO: renamed from: r0 */
    private final void m18990r0(List<MemberStory> memberStories) {
        m18941S0();
    }

    /* JADX INFO: renamed from: r1 */
    private final void m18991r1(Team team) {
        C28198s c28198sM85259o = AbstractC28163g0.m85259o(this);
        AbstractC6326e.a aVarM19223k = AbstractC6326e.m19212a(m18937Q0().getSelectedRankPillarType().ordinal() + 1, m18937Q0().getSelectedRankTimePeriod().name()).m19224l(team).m19223k(null);
        AbstractC22676k.m65749i(aVarM19223k, "setParentMessageId(...)");
        c28198sM85259o.m85340f(aVarM19223k);
    }

    /* JADX INFO: renamed from: s0 */
    private final void m18992s0(List<TeamInviteDto> pendingInvites) {
        List<TeamInviteDto> list = pendingInvites;
        if (list == null || list.isEmpty()) {
            m18943T0();
            return;
        }
        m18921J1();
        int iMin = Integer.min(pendingInvites.size(), 2);
        String string = getString(AbstractC38505d0.f165661f, Integer.valueOf(pendingInvites.size()));
        AbstractC22676k.m65749i(string, "getString(...)");
        m18920J0().f47590b.setText(string);
        this.communityPendingInviteAdapter = new C27049l(pendingInvites, iMin, new C38510g(this, 5));
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        linearLayoutManager.setOrientation(1);
        m18920J0().f47580F.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView = m18920J0().f47580F;
        C27049l c27049l = this.communityPendingInviteAdapter;
        if (c27049l == null) {
            AbstractC22676k.m65757q("communityPendingInviteAdapter");
            throw null;
        }
        recyclerView.setAdapter(c27049l);
        C27049l c27049l2 = this.communityPendingInviteAdapter;
        if (c27049l2 != null) {
            c27049l2.notifyDataSetChanged();
        } else {
            AbstractC22676k.m65757q("communityPendingInviteAdapter");
            throw null;
        }
    }

    /* JADX INFO: renamed from: s1 */
    private final void m18993s1(String urlPath) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(urlPath)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final C23454a0 m18994t0(CommunityLandingHostFragment communityLandingHostFragment, TeamInviteDto it) {
        AbstractC22676k.m65750j(it, "it");
        communityLandingHostFragment.m18989q1(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t1 */
    private final void m18995t1() {
        getEventDispatcher().m128991H("Carousel");
        String string = getString(AbstractC38505d0.f165586H1);
        AbstractC22676k.m65749i(string, "getString(...)");
        m18993s1(string);
    }

    /* JADX INFO: renamed from: u0 */
    private final void m18996u0(List<Team> teamList) {
        if (m18920J0().f47601m.getVisibility() == 0) {
            m18945U0();
            TextView textView = m18920J0().f47582H;
            String strM81237n0 = m18937Q0().m81237n0(m18920J0().f47599k.f47798k.getCheckedRadioButtonId());
            C27046i c27046iM18937Q0 = m18937Q0();
            Integer selectedIndex = m18920J0().f47599k.f47793f.getSelectedIndex();
            textView.setText(m18933O0(strM81237n0, c27046iM18937Q0.m81239p0(selectedIndex != null ? selectedIndex.intValue() : 0)));
        }
        if (teamList.isEmpty()) {
            m18947V0();
        } else {
            m18924K1();
        }
        this.communityLandingTeamAdapter = new C27043f(teamList, new C38510g(this, 2));
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        linearLayoutManager.setOrientation(1);
        m18920J0().f47586L.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView = m18920J0().f47586L;
        C27043f c27043f = this.communityLandingTeamAdapter;
        if (c27043f == null) {
            AbstractC22676k.m65757q("communityLandingTeamAdapter");
            throw null;
        }
        recyclerView.setAdapter(c27043f);
        C27043f c27043f2 = this.communityLandingTeamAdapter;
        if (c27043f2 != null) {
            c27043f2.notifyDataSetChanged();
        } else {
            AbstractC22676k.m65757q("communityLandingTeamAdapter");
            throw null;
        }
    }

    /* JADX INFO: renamed from: u1 */
    private final void m18997u1() {
        String string = getString(AbstractC26666g.f106012c);
        AbstractC22676k.m65749i(string, "getString(...)");
        m18999v1(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final C23454a0 m18998v0(CommunityLandingHostFragment communityLandingHostFragment, Team it) {
        AbstractC22676k.m65750j(it, "it");
        communityLandingHostFragment.m18991r1(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v1 */
    private final void m18999v1(String urlPath) {
        C28216y externalLinkNavigator = getExternalLinkNavigator();
        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = requireActivity();
        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
        C28216y.m85414y(externalLinkNavigator, abstractActivityC1340r0RequireActivity, urlPath, false, 4, null);
    }

    /* JADX INFO: renamed from: w0 */
    private final void m19000w0() {
        AbstractC13522r0 abstractC13522r0M18920J0 = m18920J0();
        ViewParent parent = abstractC13522r0M18920J0.f47594f.f47707b.getParent();
        AbstractC22676k.m65749i(parent, "getParent(...)");
        ViewGroup.LayoutParams layoutParams = abstractC13522r0M18920J0.f47594f.f47707b.getLayoutParams();
        AbstractC22676k.m65749i(layoutParams, "getLayoutParams(...)");
        ViewGroup viewGroup = (ViewGroup) parent;
        viewGroup.removeView(abstractC13522r0M18920J0.f47594f.f47707b);
        viewGroup.addView(abstractC13522r0M18920J0.f47594f.f47707b);
        abstractC13522r0M18920J0.f47594f.f47707b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: w1 */
    private final void m19001w1() {
        m18920J0().f47597i.setVisibility(8);
        m18920J0().f47593e.setVisibility(0);
        m18920J0().f47598j.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final C23454a0 m19002x0(AbstractC13522r0 it) {
        AbstractC22676k.m65750j(it, "it");
        it.f47594f.f47707b.setAdapter((SpinnerAdapter) null);
        it.f47586L.setAdapter(null);
        it.f47613y.setAdapter(null);
        it.f47580F.setAdapter(null);
        it.f47614z.f47736c.setAdapter(null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x1 */
    private final void m19003x1(AbstractC13522r0 abstractC13522r0) {
        this.dataBinding.setValue(this, f24786W[0], abstractC13522r0);
    }

    /* JADX INFO: renamed from: y0 */
    private final void m19004y0(C16934f carouselState) {
        m18920J0().f47606r.setContent(new C37816b(new C38514k(carouselState, this, 0), true, -1080864210));
    }

    /* JADX INFO: renamed from: y1 */
    private final void m19005y1() {
        String string = getString(AbstractC38505d0.f165733y1);
        AbstractC22676k.m65749i(string, "getString(...)");
        String string2 = getString(AbstractC38505d0.f165736z1);
        AbstractC22676k.m65749i(string2, "getString(...)");
        String string3 = getString(AbstractC38505d0.f165648b2);
        AbstractC22676k.m65749i(string3, "getString(...)");
        this.communityMenuValues = new String[]{string, string2, string3};
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        int i13 = AbstractC38501b0.f165544t0;
        int i14 = AbstractC38501b0.f165546u0;
        int i15 = AbstractC38499a0.f165255b7;
        String[] strArr = this.communityMenuValues;
        if (strArr == null) {
            AbstractC22676k.m65757q("communityMenuValues");
            throw null;
        }
        this.communityMenuAdapter = new C10593k(contextRequireContext, R.layout.simple_spinner_item, i13, i14, i15, strArr, new C38510g(this, 0));
        Spinner spinner = m18920J0().f47594f.f47707b;
        ArrayAdapter<String> arrayAdapter = this.communityMenuAdapter;
        if (arrayAdapter != null) {
            spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        } else {
            AbstractC22676k.m65757q("communityMenuAdapter");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final C23454a0 m19006z0(C16934f c16934f, CommunityLandingHostFragment communityLandingHostFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC38073e.m121966n(null, null, null, null, AbstractC37817c.m121344e(1543037865, c28655q, new C38514k(c16934f, communityLandingHostFragment, 1)), c28655q, 24576, 15);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z1 */
    public static final C23454a0 m19007z1(CommunityLandingHostFragment communityLandingHostFragment, int i13) {
        communityLandingHostFragment.m19000w0();
        communityLandingHostFragment.m18985o1(i13);
        return C23454a0.f92919a;
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    @Override // hj0.AbstractC17354m
    public String getScreenName() {
        return this.screenName;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 999) {
            if (resultCode != 899 || data == null) {
                getLog().mo85228t("Failed to receive valid ActivityResult", new AbstractC30556a.a[0]);
                return;
            }
            DrawerDisplayInvite drawerDisplayInvite = (DrawerDisplayInvite) data.getParcelableExtra("invitePojo");
            if (drawerDisplayInvite != null) {
                C28198s c28198sM85259o = AbstractC28163g0.m85259o(this);
                AbstractC6326e.b bVarM19229f = AbstractC6326e.m19213b().m19229f(drawerDisplayInvite);
                AbstractC22676k.m65749i(bVarM19229f, "setInvitePojoCode(...)");
                c28198sM85259o.m85340f(bVarM19229f);
            }
        }
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
        this.activityResultLauncher = this.videoActivityResultLauncher;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        AbstractC13522r0 abstractC13522r0M38241c = AbstractC13522r0.m38241c(inflater, container, false);
        AbstractC22676k.m65749i(abstractC13522r0M38241c, "inflate(...)");
        m19003x1(abstractC13522r0M38241c);
        m18920J0().f47596h.setBackground(AbstractC32122c.getDrawable(requireContext(), AbstractC38529z.f165809b));
        m18977k1();
        View root = m18920J0().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onPause() {
        super.onPause();
        m18937Q0().m81227R0(true);
        m18937Q0().m81223N0();
        if (this.emptyStateFlag) {
            return;
        }
        getEventDispatcher().m129034f0("Community Landing", AbstractC25247g0.m73989X(new C23465k("Label", "Empty State")));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        if (m18935P0()) {
            getActivity();
        } else {
            getActivity();
            View root = m18920J0().f47594f.getRoot();
            AbstractC22676k.m65749i(root, "getRoot(...)");
            root.setVisibility(8);
        }
        View root2 = m18920J0().f47604p.getRoot();
        AbstractC22676k.m65749i(root2, "getRoot(...)");
        root2.setVisibility(8);
        if (m18937Q0().getHomePaused()) {
            m18937Q0().m81221I0();
            m18937Q0().m81227R0(false);
            m18920J0().f47582H.setText(m18933O0(m18937Q0().m81237n0(m18920J0().f47599k.f47798k.getCheckedRadioButtonId()), m18937Q0().getSelectedRankPillarType().name()));
        }
        m18937Q0().m81220H0();
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C6270a(null), 3);
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m18980m0();
        m18949W0();
        m18981m1();
        m19005y1();
        m18897A1();
        m18969g1();
        C28216y externalLinkNavigator = getExternalLinkNavigator();
        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = requireActivity();
        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
        this.navRouter = new C27042e(externalLinkNavigator, abstractActivityC1340r0RequireActivity, AbstractC5583n.m16799z(this), m18914H0(), this.activityResultLauncher, m18926L0(), getNavigator(), m18929M0(), m18931N0());
        C27046i c27046iM18937Q0 = m18937Q0();
        c27046iM18937Q0.m81231e0();
        c27046iM18937Q0.m81225P0(InterfaceC27038a.a.f107946a);
        c27046iM18937Q0.m81232f0();
        c27046iM18937Q0.m81224O0(InterfaceC27052o.a.f108156a);
        if (m18935P0()) {
            m18903D1();
        }
    }
}
