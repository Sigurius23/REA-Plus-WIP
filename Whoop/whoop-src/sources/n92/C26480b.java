package n92;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ContextWrapper;
import android.content.Intent;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.google.gson.Gson;
import com.iterable.iterableapi.C5309c;
import com.iterable.iterableapi.C5313d;
import com.iterable.iterableapi.InterfaceC5384x;
import com.whoop.WhoopApplication;
import com.whoop.community.presentation.login.JoinTeamLandingActivity;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.domain.model.WhoopUri;
import com.whoop.domain.model.WhoopUriParser;
import com.whoop.domain.model.teams.Team;
import com.whoop.domain.model.teams.TeamType;
import com.whoop.entitlements.Entitlement;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.CommunityScreenModel;
import com.whoop.navigation.CommunityUnavailableScreenModel;
import com.whoop.navigation.HomeScreenModel;
import com.whoop.navigation.MenuScreenModel;
import com.whoop.navigation.ReferAFriendHubScreenModel;
import com.whoop.p069ui.ScoreContext;
import com.whoop.p069ui.home.redesign.view.MainActivity;
import com.whoop.realtime.presentation.StartActivityActivity;
import cq0.C11059g;
import hc3.AbstractC17182o;
import hf1.InterfaceC17235b;
import hi0.AbstractC17307e;
import hi0.AbstractC17309g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import j02.C21147i0;
import j02.C21173v0;
import j02.InterfaceC21159o0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import jy1.C22047a;
import kc3.C22365e;
import l83.C23454a0;
import l83.InterfaceC23462h;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import mq2.C25888a;
import n82.EnumC26455a;
import n83.C26460c;
import no.nordicsemi.android.dfu.DfuBaseService;
import od1.C27858u;
import or2.C28216y;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p108e4.AbstractC12682p;
import p114eb.AbstractC12939a0;
import p114eb.C12969k0;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;
import we1.InterfaceC37217a;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import yp0.AbstractC39701b;
import yp0.InterfaceC39700a;
import z82.C40191e;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: n92.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 Ù\u00012\u00020\u0001:\u0001%B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010&J+\u0010-\u001a\u00020,2\u0006\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020$2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b-\u0010.J3\u00101\u001a\u00020,2\u0006\u0010(\u001a\u00020'2\u0006\u00100\u001a\u00020/2\b\b\u0002\u0010)\u001a\u00020$2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b1\u00102J!\u00103\u001a\u00020,2\u0006\u00100\u001a\u00020/2\b\u0010+\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b5\u00106J#\u00108\u001a\u00020,2\u0006\u00100\u001a\u00020/2\n\b\u0002\u00107\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b:\u00106J%\u0010=\u001a\u00020,2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020'0;2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b=\u0010>J%\u0010?\u001a\u00020,2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020'0;2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b?\u0010>J\u0017\u0010@\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b@\u00106J\u0017\u0010A\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\bA\u00106J\u0017\u0010B\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\bB\u00106J\u0017\u0010C\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\bC\u00106J\u0017\u0010D\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\bD\u00106J\u0017\u0010E\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\bE\u00106J\u0017\u0010F\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\bF\u00106J\u0017\u0010G\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\bG\u00106J!\u0010H\u001a\u00020,2\u0006\u00100\u001a\u00020/2\b\u0010+\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\bH\u00104J\u0019\u0010I\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\bI\u0010JJ!\u0010K\u001a\u00020,2\u0006\u00100\u001a\u00020/2\b\u0010+\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\bK\u00104J\u0017\u0010L\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\bL\u00106J%\u0010M\u001a\u00020,2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020'0;2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\bM\u0010>J\u0017\u0010N\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\bN\u00106J\u001f\u0010P\u001a\u00020,2\u0006\u00100\u001a\u00020/2\u0006\u0010O\u001a\u00020$H\u0002¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020,H\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\bT\u00106J\u0017\u0010U\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\bU\u00106J\u0017\u0010V\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\bV\u00106J\u0017\u0010W\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\bW\u00106J\u0017\u0010X\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\bX\u00106J\u001f\u0010Z\u001a\u00020,2\u0006\u0010Y\u001a\u00020'2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\bZ\u0010[J/\u0010]\u001a\u00020,2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020'0;2\u0006\u00100\u001a\u00020/2\b\u0010+\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b]\u0010^J\u001f\u0010`\u001a\u00020,2\u0006\u00100\u001a\u00020/2\u0006\u0010_\u001a\u00020'H\u0002¢\u0006\u0004\b`\u00109J%\u0010a\u001a\u00020,2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020'0;2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\ba\u0010>J\u001d\u0010b\u001a\u00020,2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020'0;H\u0002¢\u0006\u0004\bb\u0010cJ/\u0010d\u001a\u00020,2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020'0;2\u0006\u00100\u001a\u00020/2\b\u0010+\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\bd\u0010^J\u0019\u0010f\u001a\u0004\u0018\u00010'2\u0006\u0010e\u001a\u00020'H\u0002¢\u0006\u0004\bf\u0010gJ\u0019\u0010h\u001a\u0004\u0018\u00010'2\u0006\u0010e\u001a\u00020'H\u0002¢\u0006\u0004\bh\u0010gJ)\u0010k\u001a\u00020j2\u0006\u00100\u001a\u00020/2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010i\u001a\u00020'H\u0002¢\u0006\u0004\bk\u0010lJ!\u0010m\u001a\u00020j2\u0006\u00100\u001a\u00020/2\b\u0010+\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\bm\u0010nJ%\u0010o\u001a\u00020j2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020'0;2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\bo\u0010pJ\u0017\u0010s\u001a\u00020r2\u0006\u0010q\u001a\u00020'H\u0002¢\u0006\u0004\bs\u0010tJ\u0017\u0010v\u001a\u00020u2\u0006\u0010_\u001a\u00020'H\u0002¢\u0006\u0004\bv\u0010wJ\u000f\u0010x\u001a\u00020,H\u0002¢\u0006\u0004\bx\u0010SJ\u0017\u0010y\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\by\u00106J%\u0010z\u001a\u00020,2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020'0;2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\bz\u0010>J\u000f\u0010{\u001a\u00020,H\u0002¢\u0006\u0004\b{\u0010SJ\u000f\u0010|\u001a\u00020,H\u0002¢\u0006\u0004\b|\u0010SJ%\u0010}\u001a\u00020,2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020'0;2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b}\u0010>J\u0017\u0010~\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b~\u00106J\u0017\u0010\u007f\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b\u007f\u00106J1\u0010\u0080\u0001\u001a\u00020,2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020'0;2\u0006\u00100\u001a\u00020/2\b\u0010+\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0005\b\u0080\u0001\u0010^J(\u0010\u0081\u0001\u001a\u00020,2\u0006\u00100\u001a\u00020/2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020'0;H\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0019\u0010\u0083\u0001\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0005\b\u0083\u0001\u00106J\u0019\u0010\u0084\u0001\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0005\b\u0084\u0001\u00106J\u0019\u0010\u0085\u0001\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0005\b\u0085\u0001\u00106J\u0019\u0010\u0086\u0001\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0005\b\u0086\u0001\u00106J(\u0010\u0087\u0001\u001a\u00020,2\u0006\u00100\u001a\u00020/2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020'0;H\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0082\u0001J\u0019\u0010\u0088\u0001\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0005\b\u0088\u0001\u00106J\u0019\u0010\u0089\u0001\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0005\b\u0089\u0001\u00106J\u0019\u0010\u008a\u0001\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0005\b\u008a\u0001\u00106J\u0019\u0010\u008b\u0001\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0005\b\u008b\u0001\u00106J\u0019\u0010\u008c\u0001\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0005\b\u008c\u0001\u00106J\u0019\u0010\u008d\u0001\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0005\b\u008d\u0001\u00106J\u0019\u0010\u008e\u0001\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0005\b\u008e\u0001\u00106J\u0019\u0010\u008f\u0001\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0005\b\u008f\u0001\u00106J\u0019\u0010\u0090\u0001\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0005\b\u0090\u0001\u00106J'\u0010\u0091\u0001\u001a\u00020,2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020'0;2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0005\b\u0091\u0001\u0010>J\u0019\u0010\u0092\u0001\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0005\b\u0092\u0001\u00106J4\u0010\u0093\u0001\u001a\u00020,2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020'0;2\u0006\u00100\u001a\u00020/2\n\b\u0002\u00107\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u0019\u0010\u0095\u0001\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0005\b\u0095\u0001\u00106J\u0019\u0010\u0096\u0001\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0005\b\u0096\u0001\u00106J\u0019\u0010\u0097\u0001\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0005\b\u0097\u0001\u00106J\u0019\u0010\u0098\u0001\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0005\b\u0098\u0001\u00106J\u0019\u0010\u0099\u0001\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0005\b\u0099\u0001\u00106J\u0019\u0010\u009a\u0001\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0005\b\u009a\u0001\u00106J\u0019\u0010\u009b\u0001\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0005\b\u009b\u0001\u00106J\u0019\u0010\u009c\u0001\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0005\b\u009c\u0001\u00106J\u0019\u0010\u009d\u0001\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0005\b\u009d\u0001\u00106J\u0019\u0010\u009e\u0001\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0005\b\u009e\u0001\u00106J\u0019\u0010\u009f\u0001\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0005\b\u009f\u0001\u00106J!\u0010 \u0001\u001a\u00020,2\u0006\u00100\u001a\u00020/2\u0006\u0010)\u001a\u00020$H\u0002¢\u0006\u0005\b \u0001\u0010QJ#\u0010¤\u0001\u001a\u00030£\u00012\u000e\b\u0002\u0010¢\u0001\u001a\u0007\u0012\u0002\b\u00030¡\u0001H\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u001c\u0010¨\u0001\u001a\u00030§\u00012\u0007\u0010¦\u0001\u001a\u00020'H\u0002¢\u0006\u0006\b¨\u0001\u0010©\u0001J+\u0010«\u0001\u001a\u00020j2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0007\u0010ª\u0001\u001a\u00020,H\u0002¢\u0006\u0006\b«\u0001\u0010¬\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b%\u0010\u00ad\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u0016\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u0016\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R\u0017\u0010Ê\u0001\u001a\u00030È\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bv\u0010É\u0001R \u0010Î\u0001\u001a\u00030Ë\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bs\u0010Ì\u0001\u001a\u0006\bÀ\u0001\u0010Í\u0001R\u001a\u0010Ñ\u0001\u001a\u0005\u0018\u00010Ï\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¼\u0001\u0010Ð\u0001R\u001a\u0010Ô\u0001\u001a\u0005\u0018\u00010Ò\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¾\u0001\u0010Ó\u0001R\u0017\u0010Ö\u0001\u001a\u00020$8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÂ\u0001\u0010Õ\u0001R\u0016\u00100\u001a\u00020/8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÄ\u0001\u0010×\u0001R\u0018\u0010+\u001a\u0004\u0018\u00010*8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÆ\u0001\u0010Ø\u0001¨\u0006Ú\u0001"}, m65681d2 = {"Ln92/b;", "Lcom/iterable/iterableapi/x;", "Lcom/whoop/WhoopApplication;", "app", "Lz82/e;", "eventDispatcher", "Lcq0/g;", "teamsRepository", "Lod1/u;", "userContext", "Lor2/y;", "externalLinkNavigator", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lzr2/a;", "dateAndTimeProvider", "Lwe1/a;", "entitlementChecker", "Lhf1/b;", "experimentsChecker", "Liy1/c;", "metricWriter", "Lyp0/a;", "communityAccessChecker", "Lcom/whoop/domain/model/WhoopUriParser;", "uriParser", "Lj02/i0;", "navDeepLinkRequestHelper", "Lbc3/c0;", "coroutineScope", "<init>", "(Lcom/whoop/WhoopApplication;Lz82/e;Lcq0/g;Lod1/u;Lor2/y;Lcom/whoop/data/repositories/FeatureFlagChecker;Lzr2/a;Lwe1/a;Lhf1/b;Liy1/c;Lyp0/a;Lcom/whoop/domain/model/WhoopUriParser;Lj02/i0;Lbc3/c0;)V", "Lcom/iterable/iterableapi/c;", "action", "Lcom/iterable/iterableapi/d;", "actionContext", "", "a", "(Lcom/iterable/iterableapi/c;Lcom/iterable/iterableapi/d;)Z", "", "actionString", "isDeepLink", "Lj02/o0;", "navigator", "Ln92/a;", "s", "(Ljava/lang/String;ZLj02/o0;)Ln92/a;", "Leb/a0;", "navController", "r", "(Ljava/lang/String;Leb/a0;ZLj02/o0;)Ln92/a;", "G0", "(Leb/a0;Lj02/o0;)Ln92/a;", "F0", "(Leb/a0;)Ln92/a;", "sourceType", "M0", "(Leb/a0;Ljava/lang/String;)Ln92/a;", "E0", "", "actionData", "O0", "(Ljava/util/List;Leb/a0;)Ln92/a;", "B0", "A", "K", "G", "J0", "K0", "S", "b0", "Y", "L", "U0", "(Lj02/o0;)Ln92/a;", "x0", "D0", "v0", "a0", "showCustomizeJournal", "Z", "(Leb/a0;Z)Ln92/a;", "A0", "()Ln92/a;", "q0", "c0", "d0", "T", "m0", "inviteCode", "x", "(Ljava/lang/String;Leb/a0;)Ln92/a;", "actions", "T0", "(Ljava/util/List;Leb/a0;Lj02/o0;)Ln92/a;", "pillarType", "V0", "X0", "W0", "(Ljava/util/List;)Ln92/a;", "Z0", "subItem", "S0", "(Ljava/lang/String;)Ljava/lang/String;", "R0", "subScreenUri", "Ll83/a0;", "p0", "(Leb/a0;Lj02/o0;Ljava/lang/String;)V", "o0", "(Leb/a0;Lj02/o0;)V", "Y0", "(Ljava/util/List;Leb/a0;)V", "selectedMetric", "", "p", "(Ljava/lang/String;)I", "Lcom/whoop/ui/ScoreContext;", "o", "(Ljava/lang/String;)Lcom/whoop/ui/ScoreContext;", "O", "V", "f0", "H", "R", "z", "e0", "i0", "F", "W", "(Leb/a0;Ljava/util/List;)Ln92/a;", "X", "k0", "j0", "P0", "U", "w0", "s0", "r0", "y0", "l0", "z0", "h0", "L0", "I0", "J", "H0", "t0", "(Ljava/util/List;Leb/a0;Ljava/lang/String;)Ln92/a;", "C0", "g0", "B", "C", "D", "E", "Q", "P", "N", "M", "I", "n0", "Ljava/lang/Class;", "destinationActivity", "Landroid/content/Intent;", "v", "(Ljava/lang/Class;)Landroid/content/Intent;", "uriString", "Leb/k0;", "y", "(Ljava/lang/String;)Leb/k0;", "result", "Q0", "(Lcom/iterable/iterableapi/c;Lcom/iterable/iterableapi/d;Ln92/a;)V", "Lcom/whoop/WhoopApplication;", "b", "Lz82/e;", "c", "Lcq0/g;", "d", "Lod1/u;", "e", "Lor2/y;", "f", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "g", "Lzr2/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lwe1/a;", "i", "Lhf1/b;", "j", "Liy1/c;", "k", "Lyp0/a;", "l", "Lcom/whoop/domain/model/WhoopUriParser;", "m", "Lj02/i0;", "n", "Lbc3/c0;", "Ltr2/n;", "Ltr2/n;", "logger", "Lcom/google/gson/Gson;", "Ll83/h;", "()Lcom/google/gson/Gson;", "gson", "Landroid/app/Activity;", "()Landroid/app/Activity;", "currentActivity", "Lcom/whoop/ui/home/redesign/view/MainActivity;", "()Lcom/whoop/ui/home/redesign/view/MainActivity;", "currentMainActivity", "()Z", "inMainActivity", "()Leb/a0;", "()Lj02/o0;", "q", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26480b implements InterfaceC5384x {

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: r */
    public static final int f105157r = 8;

    /* JADX INFO: renamed from: s */
    private static final Set<String> f105158s = AbstractC25260n.m74059b1(new String[]{"JoinCommunity", "TeamDirectory", "ViewCommunity", "Community", "Ama"});

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final WhoopApplication app;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C40191e eventDispatcher;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C11059g teamsRepository;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C27858u userContext;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C28216y externalLinkNavigator;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC37217a entitlementChecker;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC17235b experimentsChecker;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC39700a communityAccessChecker;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final WhoopUriParser uriParser;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C21147i0 navDeepLinkRequestHelper;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final InterfaceC23462h gson;

    /* JADX INFO: renamed from: n92.b$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\bJ\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Ln92/b$a;", "", "<init>", "()V", "", "type", "", "e", "(Ljava/lang/String;)Z", "Lcom/whoop/domain/model/WhoopUriParser;", "whoopUriParser", "", "c", "(Ljava/lang/String;Lcom/whoop/domain/model/WhoopUriParser;)Ljava/util/List;", "actionData", "g", "(Ljava/lang/String;Lcom/whoop/domain/model/WhoopUriParser;)Ljava/lang/String;", "d", "Lcom/iterable/iterableapi/d;", "actionContext", "b", "(Lcom/iterable/iterableapi/d;)Ljava/lang/String;", "f", "(Ljava/lang/String;)Ljava/lang/String;", "", "COMMUNITY_GATED_ACTIONS", "Ljava/util/Set;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [m83.y] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
        /* JADX INFO: renamed from: c */
        public final List<String> m78519c(String type, WhoopUriParser whoopUriParser) {
            ?? arrayList;
            if (!m78520e(type)) {
                return AbstractC39414r.m125906y0(AbstractC39414r.m125898q0(type, "action://"), new String[]{"|"}, 6);
            }
            WhoopUri whoopUri = whoopUriParser.parse(type);
            String query = whoopUri.getQuery();
            if (query != null) {
                List<String> listM125906y0 = AbstractC39414r.m125906y0(query, new String[]{"&"}, 6);
                arrayList = new ArrayList(AbstractC25267u.m74163i0(listM125906y0, 10));
                for (String str : listM125906y0) {
                    arrayList.add(AbstractC39414r.m125859E0(str, "=", str));
                }
            } else {
                arrayList = C25271y.f99162w;
            }
            C26460c c26460cM119000x = AbstractC37056f.m119000x();
            String str2 = (String) AbstractC25265s.m74100H0(whoopUri.getPathSegments());
            if (str2 != null) {
                c26460cM119000x.add(str2);
            }
            c26460cM119000x.addAll((Collection) arrayList);
            return AbstractC37056f.m118988k(c26460cM119000x);
        }

        /* JADX INFO: renamed from: e */
        private final boolean m78520e(String type) {
            if (type != null) {
                return AbstractC39421y.m125930O(type, "https://", false);
            }
            return false;
        }

        /* JADX INFO: renamed from: b */
        public final String m78521b(C5313d actionContext) {
            AbstractC22676k.m65750j(actionContext, "actionContext");
            int iM35485e = AbstractC12682p.m35485e(actionContext.f21655a);
            if (iM35485e == 0) {
                return "push";
            }
            if (iM35485e == 1) {
                return "app_link";
            }
            if (iM35485e == 2) {
                return "in_app";
            }
            if (iM35485e == 3) {
                return "embedded";
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: renamed from: d */
        public final boolean m78522d(String type) {
            if (type != null) {
                return AbstractC39421y.m125930O(type, "action://", false);
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        public final String m78523f(String actionData) {
            AbstractC22676k.m65750j(actionData, "actionData");
            if (!AbstractC39414r.m125876U(actionData, ":", false)) {
                actionData = null;
            }
            if (actionData != null) {
                return (String) AbstractC25265s.m74100H0(AbstractC39414r.m125906y0(actionData, new String[]{":"}, 6));
            }
            return null;
        }

        /* JADX INFO: renamed from: g */
        public final String m78524g(String actionData, WhoopUriParser whoopUriParser) {
            AbstractC22676k.m65750j(whoopUriParser, "whoopUriParser");
            if (m78520e(actionData)) {
                if (actionData == null) {
                    actionData = "";
                }
                return (String) AbstractC25265s.m74100H0(m78519c(actionData, whoopUriParser));
            }
            if (!m78522d(actionData)) {
                return "unknown";
            }
            if (actionData == null) {
                actionData = "";
            }
            return (String) AbstractC25265s.m74100H0(m78519c(actionData, whoopUriParser));
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: n92.b$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.push.iterable.CustomActionHandler$navigateToSleepDetails$1", m100430f = "CustomActionHandler.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f105175w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ List<String> f105177y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC12939a0 f105178z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<String> list, AbstractC12939a0 abstractC12939a0, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f105177y = list;
            this.f105178z = abstractC12939a0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C26480b.this.new b(this.f105177y, this.f105178z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f105175w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C26480b.this.m78503t0(this.f105177y, this.f105178z, "home_todays_activities");
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: n92.b$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.push.iterable.CustomActionHandler$viewCommunity$1", m100430f = "CustomActionHandler.kt", m100431l = {791}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f105179w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ List<String> f105181y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC12939a0 f105182z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<String> list, AbstractC12939a0 abstractC12939a0, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f105181y = list;
            this.f105182z = abstractC12939a0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C26480b.this.new c(this.f105181y, this.f105182z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f105179w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C11059g c11059g = C26480b.this.teamsRepository;
                Integer numValueOf = Integer.valueOf(this.f105181y.get(1));
                AbstractC22676k.m65749i(numValueOf, "valueOf(...)");
                int iIntValue = numValueOf.intValue();
                int iM84056g = C26480b.this.userContext.m84056g();
                TeamType teamType = TeamType.COMMUNITY;
                this.f105179w = 1;
                obj = c11059g.m29819w(iIntValue, iM84056g, teamType, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            Team team = (Team) obj;
            if (team != null) {
                C26480b c26480b = C26480b.this;
                List<String> list = this.f105181y;
                this.f105182z.m36404s(c26480b.m78512y("android-app://com.whoop/communityFragment?pillarType=" + c26480b.m78496p(list.get(2)) + "&timePeriod=DAILY&widgetUrl=null&teamString=" + c26480b.m78486k().toJson(team)));
            }
            return C23454a0.f92919a;
        }
    }

    public C26480b(WhoopApplication app, C40191e eventDispatcher, C11059g teamsRepository, C27858u userContext, C28216y externalLinkNavigator, FeatureFlagChecker featureFlagChecker, InterfaceC41070a dateAndTimeProvider, InterfaceC37217a entitlementChecker, InterfaceC17235b experimentsChecker, InterfaceC21030c metricWriter, InterfaceC39700a communityAccessChecker, WhoopUriParser uriParser, C21147i0 navDeepLinkRequestHelper, InterfaceC2994c0 coroutineScope) {
        AbstractC22676k.m65750j(app, "app");
        AbstractC22676k.m65750j(eventDispatcher, "eventDispatcher");
        AbstractC22676k.m65750j(teamsRepository, "teamsRepository");
        AbstractC22676k.m65750j(userContext, "userContext");
        AbstractC22676k.m65750j(externalLinkNavigator, "externalLinkNavigator");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(entitlementChecker, "entitlementChecker");
        AbstractC22676k.m65750j(experimentsChecker, "experimentsChecker");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(communityAccessChecker, "communityAccessChecker");
        AbstractC22676k.m65750j(uriParser, "uriParser");
        AbstractC22676k.m65750j(navDeepLinkRequestHelper, "navDeepLinkRequestHelper");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.app = app;
        this.eventDispatcher = eventDispatcher;
        this.teamsRepository = teamsRepository;
        this.userContext = userContext;
        this.externalLinkNavigator = externalLinkNavigator;
        this.featureFlagChecker = featureFlagChecker;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.entitlementChecker = entitlementChecker;
        this.experimentsChecker = experimentsChecker;
        this.metricWriter = metricWriter;
        this.communityAccessChecker = communityAccessChecker;
        this.uriParser = uriParser;
        this.navDeepLinkRequestHelper = navDeepLinkRequestHelper;
        this.coroutineScope = coroutineScope;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("CustomActionHandler");
        this.gson = AbstractC30060g.m92088H(new C25888a(29));
    }

    /* JADX INFO: renamed from: A */
    private final EnumC26479a m78415A(AbstractC12939a0 navController) {
        navController.m36404s(m78512y(AbstractC11266d.m30461o("android-app://com.whoop/editActivity/AddActivity?screenType=", EnumC26455a.SLEEP.getValue())));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: A0 */
    private final EnumC26479a m78416A0() {
        ContextWrapper contextWrapperM78482i = m78482i();
        if (contextWrapperM78482i == null) {
            contextWrapperM78482i = this.app;
        }
        contextWrapperM78482i.startActivity(new Intent(contextWrapperM78482i, (Class<?>) StartActivityActivity.class));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: B */
    private final EnumC26479a m78417B(AbstractC12939a0 navController) {
        navController.m36404s(m78512y("android-app://com.whoop/AdvancedLabsFragment?source=deepLink"));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: B0 */
    private final EnumC26479a m78418B0(List<String> actionData, AbstractC12939a0 navController) {
        String str;
        String str2;
        String str3;
        if (actionData.size() == 4) {
            str = actionData.get(1);
            str3 = actionData.get(2);
            str2 = actionData.get(3);
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        StringBuilder sbM32001t = AbstractC11895b.m32001t("android-app://com.whoop/strava/navigation/code=", str, "&scope=", str3, "&state=");
        sbM32001t.append(str2);
        navController.m36404s(m78512y(sbM32001t.toString()));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: C */
    private final EnumC26479a m78419C(AbstractC12939a0 navController) {
        navController.m36404s(m78512y("android-app://com.whoop/advanced_labs_join?source=deepLink"));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: C0 */
    private final EnumC26479a m78420C0(AbstractC12939a0 navController) {
        navController.m36404s(m78512y("android-app://com.whoop/streaks"));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: D */
    private final EnumC26479a m78421D(AbstractC12939a0 navController) {
        navController.m36404s(m78512y("android-app://com.whoop/advanced_labs_purchase_add_ons?source=iterable"));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: D0 */
    private final EnumC26479a m78422D0(AbstractC12939a0 navController) {
        navController.m36404s(m78512y("whoop://strength.builder"));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: E */
    private final EnumC26479a m78423E(AbstractC12939a0 navController) {
        navController.m36404s(m78512y("android-app://com.whoop/advanced_labs_update_tests?source=iterable"));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: E0 */
    private final EnumC26479a m78424E0(AbstractC12939a0 navController) {
        if (this.entitlementChecker.mo119272b(Entitlement.STRESS_MONITOR)) {
            navController.m36404s(m78512y("android-app://com.whoop/stress-monitor/IterableCustomAction"));
            return EnumC26479a.SUCCESS;
        }
        navController.m36404s(m78512y("android-app://com.whoop/notfound?id=STRESS_MONITOR"));
        return EnumC26479a.ERROR;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F */
    private final EnumC26479a m78425F(List<String> actionData, AbstractC12939a0 navController, InterfaceC21159o0 navigator) {
        if (navigator != null) {
            C21173v0 c21173v0 = null;
            navigator.mo59392a(new C9598e(AppScreen.C9361m1.f27766w, new CommunityScreenModel((AiAction) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0)), c21173v0, 4, null));
        } else if (actionData.size() == 1) {
            navController.m36404s(m78512y("android-app://com.whoop/communityLandingFragment?toAma=true"));
        } else if (actionData.size() == 2) {
            navController.m36404s(m78512y(AbstractC11266d.m30461o("android-app://com.whoop/communityLandingFragment?toAma=true&amaId=", actionData.get(1))));
        }
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: F0 */
    private final EnumC26479a m78426F0(AbstractC12939a0 navController) {
        navController.m36404s(m78512y("android-app://com.whoop/tiltGraphRevamp"));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: G */
    private final EnumC26479a m78427G(AbstractC12939a0 navController) {
        if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_HOME_TILE_BEHAVIOR_IMPACTS)) {
            navController.m36404s(m78512y("android-app://com.whoop/behavior_impact?source=Notification"));
        } else {
            navController.m36404s(m78512y("android-app://com.whoop/coaching?tab=1"));
        }
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: G0 */
    private final EnumC26479a m78428G0(AbstractC12939a0 navController, InterfaceC21159o0 navigator) {
        if (navigator != null) {
            navigator.mo59392a(new C9598e(AppScreen.C9361m1.f27766w, new CommunityUnavailableScreenModel("followers-service/v1/error/medicare", "COMMUNITY"), new C21173v0("community")));
        } else {
            navController.m36402q(AbstractC39701b.m127035b());
        }
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: H */
    private final EnumC26479a m78429H() {
        Activity activityM78482i = m78482i();
        if (activityM78482i != null) {
            this.externalLinkNavigator.m85419h(activityM78482i);
        }
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: H0 */
    private final EnumC26479a m78430H0(AbstractC12939a0 navController) {
        if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.AUTH_WEB_VIEW_UPGRADE_SUPPORT)) {
            navController.m36404s(m78512y("android-app://com.whoop/upgrade?url=checkout"));
        } else {
            navController.m36404s(m78512y("android-app://com.whoop/home"));
        }
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: I */
    private final EnumC26479a m78431I(AbstractC12939a0 navController) {
        navController.m36404s(m78512y("android-app://com.whoop/weekly_plan_challenge?source=iterable"));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: I0 */
    private final EnumC26479a m78432I0(AbstractC12939a0 navController) {
        navController.m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/education?path=WU&screenName=WU&entryPoint=deeplink"));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: J */
    private final EnumC26479a m78433J(List<String> actionData, AbstractC12939a0 navController) {
        String str = (String) AbstractC25265s.m74102I0(1, actionData);
        if (str != null) {
            navController.m36404s(m78512y("android-app://com.whoop/challengeDetails?name=".concat(str)));
        } else {
            navController.m36404s(m78512y("android-app://com.whoop/home"));
        }
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: J0 */
    private final EnumC26479a m78434J0(AbstractC12939a0 navController) {
        navController.m36404s(m78512y("android-app://com.whoop/weeklyPlan"));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: K */
    private final EnumC26479a m78435K(AbstractC12939a0 navController) {
        navController.m36404s(m78512y("android-app://com.whoop/coaching?tab=2"));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: K0 */
    private final EnumC26479a m78436K0(AbstractC12939a0 navController) {
        navController.m36404s(m78512y("android-app://com.whoop/weeklyPlan?navigateToPresets=true"));
        return EnumC26479a.SUCCESS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L */
    private final EnumC26479a m78437L(AbstractC12939a0 navController, InterfaceC21159o0 navigator) {
        if (navigator != null) {
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            navigator.mo59392a(new C9598e(AppScreen.C9361m1.f27766w, new CommunityScreenModel((AiAction) null, (String) objArr, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0)), objArr2, 4, null));
        } else {
            navController.m36404s(m78512y("android-app://com.whoop/communityLandingFragment"));
        }
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: L0 */
    private final EnumC26479a m78438L0(AbstractC12939a0 navController) {
        navController.m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/whatToExpect"));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: M */
    private final EnumC26479a m78439M(AbstractC12939a0 navController) {
        navController.m36404s(m78512y("android-app://com.whoop/familyPlan?startDestination=FAMILY_PLAN_HUB"));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: M0 */
    private final EnumC26479a m78440M0(AbstractC12939a0 navController, String sourceType) {
        String strConcat;
        if (sourceType == null || (strConcat = "android-app://com.whoop/ai-coach?sourcePillar=Iterable&sourceType=".concat(sourceType)) == null) {
            strConcat = "android-app://com.whoop/ai-coach?sourcePillar=Iterable";
        }
        navController.m36404s(m78512y(strConcat));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: N */
    private final EnumC26479a m78441N(AbstractC12939a0 navController) {
        navController.m36404s(m78512y("android-app://com.whoop/giftHub?source=iterable"));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ EnumC26479a m78442N0(C26480b c26480b, AbstractC12939a0 abstractC12939a0, String str, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str = null;
        }
        return c26480b.m78440M0(abstractC12939a0, str);
    }

    /* JADX INFO: renamed from: O */
    private final EnumC26479a m78443O() {
        Activity activityM78482i = m78482i();
        if (activityM78482i != null) {
            this.externalLinkNavigator.m85423l(activityM78482i);
        }
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: O0 */
    private final EnumC26479a m78444O0(List<String> actionData, AbstractC12939a0 navController) {
        int i13 = actionData.size() >= 2 ? Integer.parseInt(actionData.get(1)) : 0;
        Integer numValueOf = actionData.size() == 3 ? Integer.valueOf(Integer.parseInt(actionData.get(2))) : null;
        if (!this.featureFlagChecker.isFeatureEnabled("whoop-labs-remote-study-android")) {
            return EnumC26479a.UNKNOWN_ACTION;
        }
        navController.m36404s(m78512y("android-app://com.whoop/whooplabs?campaignId=" + i13 + "&sessionId=" + numValueOf));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: P */
    private final EnumC26479a m78445P(AbstractC12939a0 navController) {
        navController.m36404s(m78512y("android-app://com.whoop/gifted?source=iterable"));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: P0 */
    private final EnumC26479a m78446P0(AbstractC12939a0 navController) {
        navController.m36404s(m78512y("android-app://com.whoop/userJourneyFragment?year=2025"));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: Q */
    private final EnumC26479a m78447Q(AbstractC12939a0 navController) {
        navController.m36404s(m78512y("android-app://com.whoop/gifting?source=iterable"));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: Q0 */
    private final void m78448Q0(C5309c action, C5313d actionContext, EnumC26479a result) {
        Companion companion = INSTANCE;
        String strM78521b = companion.m78521b(actionContext);
        String strValueOf = String.valueOf(action.m16417c());
        this.metricWriter.mo58701b(new C22047a(0, "iterable.message.customaction.click", null, AbstractC37056f.m118959K(AbstractC11266d.m30461o("medium:", strM78521b), AbstractC11266d.m30461o("scheme:", companion.m78523f(strValueOf)), AbstractC11266d.m30461o("intent:", companion.m78524g(strValueOf, this.uriParser)), "result:" + result), null, 21, null));
    }

    /* JADX INFO: renamed from: R */
    private final EnumC26479a m78449R() {
        Activity activityM78482i = m78482i();
        if (activityM78482i != null) {
            this.externalLinkNavigator.m85425n(activityM78482i);
        }
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: R0 */
    private final String m78450R0(String subItem) {
        if (AbstractC39421y.m125921F(subItem, "About", true)) {
            return "Settings - About";
        }
        if (AbstractC39421y.m125921F(subItem, "Tutorials", true)) {
            return "Settings - Tutorials";
        }
        if (AbstractC39421y.m125921F(subItem, "journal", true)) {
            return "Settings - Journal";
        }
        return null;
    }

    /* JADX INFO: renamed from: S */
    private final EnumC26479a m78451S(AbstractC12939a0 navController) {
        navController.m36404s(m78512y("android-app://com.whoop/composableHealthMonitor"));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: S0 */
    private final String m78452S0(String subItem) {
        if (AbstractC39421y.m125921F(subItem, "MyAccount", true)) {
            return "android-app://com.whoop/settings/myAccountFragment";
        }
        if (AbstractC39421y.m125921F(subItem, "FirmwareUpdate", true)) {
            return "whoop://com.whoop/settings/newStrapSettings";
        }
        if (AbstractC39421y.m125921F(subItem, "MembershipServices", true)) {
            return "whoop://com.whoop/help_center";
        }
        if (AbstractC39421y.m125921F(subItem, "DataExport", true)) {
            return "whoop://com.whoop/memberdataexport_mdeFragment";
        }
        if (AbstractC39421y.m125921F(subItem, "About", true)) {
            return "android-app://com.whoop/settings/about";
        }
        if (AbstractC39421y.m125921F(subItem, "Tutorials", true)) {
            return "android-app://com.whoop/settings/tutorials";
        }
        if (AbstractC39421y.m125921F(subItem, "journal", true)) {
            return "android-app://com.whoop/journal_settings_fragment_v2";
        }
        return null;
    }

    /* JADX INFO: renamed from: T */
    private final EnumC26479a m78453T(AbstractC12939a0 navController) {
        navController.m36404s(m78512y("android-app://com.whoop/healthspan?date=" + this.dateAndTimeProvider.mo133365d()));
        return EnumC26479a.SUCCESS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T0 */
    private final EnumC26479a m78454T0(List<String> actions, AbstractC12939a0 navController, InterfaceC21159o0 navigator) {
        String str = actions.get(0);
        if (AbstractC22676k.m65745e(str, "OverviewPillar")) {
            if (navigator != null) {
                C21173v0 c21173v0 = null;
                navigator.mo59392a(new C9598e(AppScreen.C9426u2.f27963w, new HomeScreenModel((String) null, (AiAction) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0)), c21173v0, 4, null));
            } else {
                navController.m36404s(m78512y("android-app://com.whoop/home"));
            }
        } else {
            if (!AbstractC22676k.m65745e(str, "TeamDirectory")) {
                this.logger.mo85222m(AbstractC25012a.m73375h(actions.get(0), "Unknown Iterable action: "), new AbstractC30556a.a[0]);
                return EnumC26479a.UNKNOWN_ACTION;
            }
            Activity activityM16946h = this.app.m16946h();
            if (activityM16946h == null) {
                return EnumC26479a.ERROR;
            }
            Intent intent = new Intent(this.app.m16946h(), (Class<?>) JoinTeamLandingActivity.class);
            intent.putExtra("ActionType", actions.get(0));
            intent.setFlags(536903680);
            activityM16946h.startActivity(intent);
        }
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: U */
    private final EnumC26479a m78455U(AbstractC12939a0 navController, List<String> actionData) {
        if (actionData.size() > 1) {
            navController.m36404s(m78512y("android-app://com.whoop/trends?trendKey=" + actionData.get(1) + "&date=" + this.dateAndTimeProvider.mo133365d() + "&source=deepLink"));
        } else {
            navController.m36404s(m78512y("android-app://com.whoop/trends?trendKey=SLEEP_PERFORMANCE&date=" + this.dateAndTimeProvider.mo133365d() + "&source=deepLink"));
        }
        return EnumC26479a.SUCCESS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U0 */
    private final EnumC26479a m78456U0(InterfaceC21159o0 navigator) {
        this.eventDispatcher.m129019V("Menu");
        if (navigator == null) {
            this.logger.mo85230v("Cannot route ReferAFriend to the BE-driven hub without a Navigator", new IllegalStateException("Cannot route ReferAFriend to the BE-driven hub without a Navigator"), new AbstractC30556a.a[0]);
            return EnumC26479a.ERROR;
        }
        Object[] objArr = 0 == true ? 1 : 0;
        navigator.mo59392a(new C9598e(AppScreen.C9444w4.f28018w, new ReferAFriendHubScreenModel((String) null, "Deeplink", (Integer) null, true, 5, (DefaultConstructorMarker) null), objArr, 4, 0 == true ? 1 : 0));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: V */
    private final EnumC26479a m78457V(AbstractC12939a0 navController) {
        navController.m36404s(m78512y("whoop://com.whoop/raf-gift-fragment"));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: V0 */
    private final EnumC26479a m78458V0(AbstractC12939a0 navController, String pillarType) {
        if (AbstractC22676k.m65745e(pillarType, "StrainPillar")) {
            navController.m36404s(m78512y("android-app://com.whoop/deep_dive?pillar=strain"));
        } else if (AbstractC22676k.m65745e(pillarType, "RecoveryPillar")) {
            navController.m36404s(m78512y("android-app://com.whoop/deep_dive?pillar=recovery"));
        }
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: W */
    private final EnumC26479a m78459W(AbstractC12939a0 navController, List<String> actionData) {
        String str = (String) AbstractC25265s.m74102I0(1, actionData);
        if (str != null) {
            navController.m36404s(m78512y("android-app://com.whoop/hormonalInsightsOnboarding?feature=".concat(str)));
        } else {
            navController.m36404s(m78512y("android-app://com.whoop/hormonalInsightsOnboarding"));
        }
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: W0 */
    private final EnumC26479a m78460W0(List<String> actions) {
        Activity activityM16946h = this.app.m16946h();
        if (activityM16946h == null) {
            return EnumC26479a.ERROR;
        }
        Intent intent = new Intent(activityM16946h, (Class<?>) MainActivity.class);
        intent.putExtra("ActionType", actions.get(0));
        intent.putExtra("PillarType", m78494o(actions.get(1)));
        activityM16946h.startActivity(intent);
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: X */
    private final EnumC26479a m78461X(AbstractC12939a0 navController) {
        navController.m36404s(m78512y("android-app://com.whoop/hormonalSettingsFragment"));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: X0 */
    private final EnumC26479a m78462X0(List<String> actions, AbstractC12939a0 navController) {
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new c(actions, navController, null), 3);
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: Y */
    private final EnumC26479a m78463Y(AbstractC12939a0 navController) {
        navController.m36404s(m78512y("android-app://com.whoop/hrSettingsFragment"));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: Y0 */
    private final void m78464Y0(List<String> actions, AbstractC12939a0 navController) {
        String str = (String) AbstractC25265s.m74102I0(2, actions);
        if (str == null) {
            str = "";
        }
        String strConcat = "android-app://com.whoop/settings/integrations?integrationId=".concat(str);
        String str2 = (String) AbstractC25265s.m74102I0(2, actions);
        if (AbstractC22676k.m65745e(str2, "HealthConnect")) {
            navController.m36404s(m78512y("android-app://com.whoop/settings/integrations/healthConnect"));
        } else if (AbstractC22676k.m65745e(str2, "Strava")) {
            m78418B0(actions, navController);
        } else {
            navController.m36404s(m78512y(strConcat));
        }
    }

    /* JADX INFO: renamed from: Z */
    private final EnumC26479a m78465Z(AbstractC12939a0 navController, boolean showCustomizeJournal) {
        LocalDate localDateMo133365d = this.dateAndTimeProvider.mo133365d();
        navController.m36404s(m78512y("android-app://com.whoop.journal.view.fragment/-1/-1/-1?todayCycleStartTime=-1&todayCycleEndTime=-1&fromSettings=false&source=Iterable&newHome=false&fromFab=false&showCustomize=" + showCustomizeJournal + "&requestDate=" + java.time.LocalDate.of(localDateMo133365d.getYear(), localDateMo133365d.getMonthOfYear(), localDateMo133365d.getDayOfMonth())));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: Z0 */
    private final EnumC26479a m78466Z0(List<String> actions, AbstractC12939a0 navController, InterfaceC21159o0 navigator) {
        String str = (String) AbstractC25265s.m74102I0(1, actions);
        if (str == null) {
            m78495o0(navController, navigator);
        } else if (str.equalsIgnoreCase("Integrations")) {
            m78495o0(navController, navigator);
            m78464Y0(actions, navController);
        } else {
            String strM78452S0 = m78452S0(str);
            if (strM78452S0 == null) {
                m78495o0(navController, navigator);
            } else {
                String strM78450R0 = m78450R0(str);
                if (strM78450R0 != null) {
                    this.eventDispatcher.m129040k(strM78450R0, null, null);
                }
                m78497p0(navController, navigator, strM78452S0);
            }
        }
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: a0 */
    private final EnumC26479a m78467a0(AbstractC12939a0 navController) {
        navController.m36404s(m78512y("android-app://com.whoop/journal_settings_fragment_v2"));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: b0 */
    private final EnumC26479a m78469b0(AbstractC12939a0 navController) {
        m78461X(navController);
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: c0 */
    private final EnumC26479a m78471c0(AbstractC12939a0 navController) {
        navController.m36404s(m78512y("android-app://com.whoop/menstrual_cycle_insights?date=" + this.dateAndTimeProvider.mo133365d()));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: d0 */
    private final EnumC26479a m78473d0(AbstractC12939a0 navController) {
        navController.m36404s(m78512y("android-app://com.whoop/phaseCoaching?phase=MENSTRUAL"));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: e0 */
    private final EnumC26479a m78475e0(AbstractC12939a0 navController) throws PendingIntent.CanceledException {
        if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.PROFILE_NAVIGATION_FIX)) {
            this.navDeepLinkRequestHelper.m58995b(this.app, AbstractC17309g.f66902a, AbstractC17307e.f66550B3, -1, false, true, null, true, false).send();
        } else {
            navController.m36404s(m78512y("android-app://com.whoop/profile/0?showDialogView=false&fromButton=true&achievementId=null&navigateToMemberLevels=true&fromCommunity=false"));
        }
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: f0 */
    private final EnumC26479a m78477f0(List<String> actions, AbstractC12939a0 navController) {
        String str = (String) AbstractC25265s.m74102I0(1, actions);
        if (str == null) {
            str = "@null";
        }
        Object obj = (String) AbstractC25265s.m74102I0(2, actions);
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        Object obj2 = (String) AbstractC25265s.m74102I0(3, actions);
        if (obj2 == null) {
            obj2 = Boolean.FALSE;
        }
        navController.m36404s(m78512y("android-app://com.whoop/extensions?promoCode=" + str + "&amp;isOnTrial=" + obj + "&amp;isReactivationUpsell=" + obj2));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: g0 */
    private final EnumC26479a m78479g0(AbstractC12939a0 navController) {
        navController.m36404s(m78512y("android-app://com.whoop/mfasetupfragment?source=iterable"));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: h0 */
    private final EnumC26479a m78481h0(AbstractC12939a0 navController) {
        navController.m36404s(m78512y("android-app://com.whoop/paymentMethodManagement?source=push_notification"));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: i */
    private final Activity m78482i() {
        return this.app.m16946h();
    }

    /* JADX INFO: renamed from: i0 */
    private final EnumC26479a m78483i0(AbstractC12939a0 navController) throws PendingIntent.CanceledException {
        if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.PROFILE_NAVIGATION_FIX)) {
            this.navDeepLinkRequestHelper.m58995b(this.app, AbstractC17309g.f66902a, AbstractC17307e.f66550B3, -1, false, true, null, false, false).send();
        } else {
            navController.m36404s(m78512y("android-app://com.whoop/profile/0?showDialogView=false&fromButton=true&achievementId=null&navigateToMemberLevels=false&fromCommunity=false"));
        }
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: j */
    private final MainActivity m78484j() {
        Activity activityM16946h = this.app.m16946h();
        if (activityM16946h instanceof MainActivity) {
            return (MainActivity) activityM16946h;
        }
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    private final EnumC26479a m78485j0(AbstractC12939a0 navController) {
        navController.m36404s(m78512y("android-app://com.whoop/pregnancyInsights"));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final Gson m78486k() {
        return (Gson) this.gson.getValue();
    }

    /* JADX INFO: renamed from: k0 */
    private final EnumC26479a m78487k0(AbstractC12939a0 navController) {
        navController.m36404s(m78512y("android-app://com.whoop/pregnancySettingsFragment"));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: l */
    private final boolean m78488l() {
        return m78484j() != null;
    }

    /* JADX INFO: renamed from: l0 */
    private final EnumC26479a m78489l0(AbstractC12939a0 navController) {
        navController.m36404s(m78512y("android-app://com.whoop/trends?trendKey=REM_SLEEP_DURATION&date=" + this.dateAndTimeProvider.mo133365d() + "&source=deepLink"));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: m */
    private final AbstractC12939a0 m78490m() {
        MainActivity mainActivityM78484j = m78484j();
        if (mainActivityM78484j != null) {
            return AbstractC12350b.m34597r(mainActivityM78484j, AbstractC17307e.f66639Q1);
        }
        throw new IllegalStateException("Can only access this NavController from MainActivity");
    }

    /* JADX INFO: renamed from: m0 */
    private final EnumC26479a m78491m0(AbstractC12939a0 navController) {
        navController.m36404s(m78512y("android-app://com.whoop/sage?date=" + this.dateAndTimeProvider.mo133365d()));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: n */
    private final InterfaceC21159o0 m78492n() {
        MainActivity mainActivityM78484j = m78484j();
        if (mainActivityM78484j != null) {
            return mainActivityM78484j.m27323w0();
        }
        return null;
    }

    /* JADX INFO: renamed from: n0 */
    private final EnumC26479a m78493n0(AbstractC12939a0 navController, boolean isDeepLink) {
        if (this.featureFlagChecker.isFeatureEnabled("sanguine-waitlist")) {
            navController.m36404s(m78512y(isDeepLink ? "android-app://com.whoop/SanguineFragment?source=deeplink" : "android-app://com.whoop/SanguineFragment"));
        } else {
            navController.m36404s(m78512y("android-app://com.whoop/home"));
        }
        return EnumC26479a.SUCCESS;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: o */
    private final ScoreContext m78494o(String pillarType) {
        switch (pillarType.hashCode()) {
            case -2093995839:
                if (pillarType.equals("SleepPillar")) {
                    return ScoreContext.SLEEP;
                }
                break;
            case -2046162397:
                if (pillarType.equals("OverviewPillar")) {
                    return ScoreContext.OVERVIEW;
                }
                break;
            case -777848545:
                if (pillarType.equals("StrainPillar")) {
                    return ScoreContext.STRAIN;
                }
                break;
            case -435644609:
                if (pillarType.equals("RecoveryPillar")) {
                    return ScoreContext.RECOVERY;
                }
                break;
            case 2368780:
                if (pillarType.equals("Live")) {
                    return ScoreContext.LIVE;
                }
                break;
        }
        return ScoreContext.OVERVIEW;
    }

    /* JADX INFO: renamed from: o0 */
    private final void m78495o0(AbstractC12939a0 navController, InterfaceC21159o0 navigator) {
        if (navigator == null) {
            navController.m36404s(m78512y("android-app://com.whoop/settings/settingsFragment"));
        } else {
            navigator.mo59392a(new C9598e(AppScreen.C9276b4.f27502w, MenuScreenModel.INSTANCE, null, 4, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final int m78496p(String selectedMetric) {
        switch (selectedMetric.hashCode()) {
            case -1808126571:
                return selectedMetric.equals("Strain") ? 1 : 0;
            case -1443696391:
                return !selectedMetric.equals("SleepPerformance") ? 0 : 3;
            case -734469195:
                return !selectedMetric.equals("Recovery") ? 0 : 2;
            case -104321242:
                return !selectedMetric.equals("Calories") ? 0 : 1;
            case 71820:
                return !selectedMetric.equals("HRV") ? 0 : 2;
            case 81116:
                return !selectedMetric.equals("RHR") ? 0 : 2;
            case 355476817:
                return !selectedMetric.equals("HoursOfSleep") ? 0 : 3;
            case 893920644:
                return !selectedMetric.equals("ActivityStrain") ? 0 : 1;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: p0 */
    private final void m78497p0(AbstractC12939a0 navController, InterfaceC21159o0 navigator, String subScreenUri) {
        m78495o0(navController, navigator);
        navController.m36404s(m78512y(subScreenUri));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final Gson m78498q() {
        return new Gson();
    }

    /* JADX INFO: renamed from: q0 */
    private final EnumC26479a m78499q0(AbstractC12939a0 navController) {
        navController.m36404s(m78512y("whoop://com.whoop/sleepCoachFragment/?entryPoint=Iterable - Bedtime Recommendation&clickType="));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: r0 */
    private final EnumC26479a m78500r0(AbstractC12939a0 navController) {
        navController.m36404s(m78512y("android-app://com.whoop/trends?trendKey=SLEEP_CONSISTENCY&date=" + this.dateAndTimeProvider.mo133365d() + "&source=deepLink"));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: s0 */
    private final EnumC26479a m78501s0(AbstractC12939a0 navController) {
        navController.m36404s(m78512y("android-app://com.whoop/trends?trendKey=SLEEP_NEED_FROM_SLEEP_DEBT_POST&date=" + this.dateAndTimeProvider.mo133365d() + "&source=deepLink"));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ EnumC26479a m78502t(C26480b c26480b, String str, AbstractC12939a0 abstractC12939a0, boolean z4, InterfaceC21159o0 interfaceC21159o0, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z4 = false;
        }
        if ((i13 & 8) != 0) {
            interfaceC21159o0 = null;
        }
        return c26480b.m78516r(str, abstractC12939a0, z4, interfaceC21159o0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public final EnumC26479a m78503t0(List<String> actionData, AbstractC12939a0 navController, String sourceType) {
        if (actionData.size() == 1) {
            navController.m36404s(m78512y(AbstractC11266d.m30461o("android-app://com.whoop/deep_dive?pillar=sleep&source=", sourceType)));
        } else if (actionData.size() == 2) {
            String str = actionData.get(1);
            DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("yyyyMMdd");
            AbstractC22676k.m65749i(dateTimeFormatterForPattern, "forPattern(...)");
            navController.m36404s(m78512y("android-app://com.whoop/deep_dive?pillar=sleep&date=" + dateTimeFormatterForPattern.parseLocalDate(str) + "&source=" + sourceType));
        }
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ EnumC26479a m78504u(C26480b c26480b, String str, boolean z4, InterfaceC21159o0 interfaceC21159o0, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        if ((i13 & 4) != 0) {
            interfaceC21159o0 = null;
        }
        return c26480b.m78517s(str, z4, interfaceC21159o0);
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ EnumC26479a m78505u0(C26480b c26480b, List list, AbstractC12939a0 abstractC12939a0, String str, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str = "";
        }
        return c26480b.m78503t0(list, abstractC12939a0, str);
    }

    /* JADX INFO: renamed from: v */
    private final Intent m78506v(Class<?> destinationActivity) {
        Activity activityM78482i = m78482i();
        if (activityM78482i != null) {
            return new Intent(activityM78482i, destinationActivity);
        }
        Intent intent = new Intent(this.app, destinationActivity);
        intent.setFlags(268435456);
        return intent;
    }

    /* JADX INFO: renamed from: v0 */
    private final EnumC26479a m78507v0(List<String> actionData, AbstractC12939a0 navController) {
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(actionData, navController, null), 3);
        return EnumC26479a.SUCCESS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public static /* synthetic */ Intent m78508w(C26480b c26480b, Class cls, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            cls = MainActivity.class;
        }
        return c26480b.m78506v(cls);
    }

    /* JADX INFO: renamed from: w0 */
    private final EnumC26479a m78509w0(AbstractC12939a0 navController) {
        navController.m36404s(m78512y("android-app://com.whoop/trends?trendKey=IN_SLEEP_EFFICIENCY&date=" + this.dateAndTimeProvider.mo133365d() + "&source=deepLink"));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: x */
    private final EnumC26479a m78510x(String inviteCode, AbstractC12939a0 navController) {
        navController.m36404s(m78512y(AbstractC11266d.m30461o("android-app://com.whoop/inviteCodeActivity?inviteCode=", inviteCode)));
        return EnumC26479a.SUCCESS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x0 */
    private final EnumC26479a m78511x0(AbstractC12939a0 navController, InterfaceC21159o0 navigator) {
        if (navigator != null) {
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            navigator.mo59392a(new C9598e(AppScreen.C9426u2.f27963w, new HomeScreenModel((String) null, (AiAction) objArr, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0)), objArr2, 4, null));
        } else {
            navController.m36404s(m78512y("android-app://com.whoop/home"));
        }
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public final C12969k0 m78512y(String uriString) {
        return this.navDeepLinkRequestHelper.m58994a(uriString);
    }

    /* JADX INFO: renamed from: y0 */
    private final EnumC26479a m78513y0(AbstractC12939a0 navController) {
        navController.m36404s(m78512y("android-app://com.whoop/trends?trendKey=RESTORATIVE_SLEEP_PERCENT&date=" + this.dateAndTimeProvider.mo133365d() + "&source=deepLink"));
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: z */
    private final EnumC26479a m78514z(List<String> actions, AbstractC12939a0 navController) throws PendingIntent.CanceledException {
        String str = actions.size() == 2 ? actions.get(1) : actions.get(0);
        if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.PROFILE_NAVIGATION_FIX)) {
            this.navDeepLinkRequestHelper.m58995b(this.app, AbstractC17309g.f66902a, AbstractC17307e.f66550B3, -1, false, true, str, false, false).send();
        } else {
            navController.m36404s(m78512y(AbstractC11895b.m31996o("android-app://com.whoop/profile/0?showDialogView=false&fromButton=true&achievementId=", str, "&navigateToMemberLevels=false&fromCommunity=false")));
        }
        return EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: z0 */
    private final EnumC26479a m78515z0(AbstractC12939a0 navController) {
        navController.m36404s(m78512y("android-app://com.whoop/trends?trendKey=STEPS&date=" + this.dateAndTimeProvider.mo133365d() + "&source=deepLink"));
        return EnumC26479a.SUCCESS;
    }

    @Override // com.iterable.iterableapi.InterfaceC5384x
    /* JADX INFO: renamed from: a */
    public boolean mo16540a(C5309c action, C5313d actionContext) {
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(actionContext, "actionContext");
        EnumC26479a enumC26479aM78504u = m78504u(this, String.valueOf(action.m16417c()), false, null, 6, null);
        m78448Q0(action, actionContext, enumC26479aM78504u);
        return enumC26479aM78504u == EnumC26479a.SUCCESS;
    }

    /* JADX INFO: renamed from: r */
    public final EnumC26479a m78516r(String actionString, AbstractC12939a0 navController, boolean isDeepLink, InterfaceC21159o0 navigator) {
        AbstractC22676k.m65750j(actionString, "actionString");
        AbstractC22676k.m65750j(navController, "navController");
        this.logger.mo85216g("handling action ".concat(actionString), new AbstractC30556a.a[0]);
        List<String> listM78519c = INSTANCE.m78519c(actionString, this.uriParser);
        if (listM78519c.isEmpty()) {
            return EnumC26479a.ERROR;
        }
        String str = listM78519c.get(0);
        if (f105158s.contains(str) && this.communityAccessChecker.mo31687a()) {
            return m78428G0(navController, navigator);
        }
        try {
            if (AbstractC22676k.m65745e(str, "advanced_labs_waitlist")) {
                return m78493n0(navController, isDeepLink);
            }
            if (AbstractC22676k.m65745e(str, "advanced_labs_home")) {
                return m78417B(navController);
            }
            if (AbstractC22676k.m65745e(str, "advanced_labs_join")) {
                return m78419C(navController);
            }
            if (AbstractC22676k.m65745e(str, "advanced_labs_purchase_add_ons")) {
                return m78421D(navController);
            }
            if (AbstractC22676k.m65745e(str, "advanced_labs_update_tests")) {
                return m78423E(navController);
            }
            if (AbstractC22676k.m65745e(str, "gifting")) {
                return m78447Q(navController);
            }
            if (AbstractC22676k.m65745e(str, "gifted")) {
                return m78445P(navController);
            }
            if (AbstractC22676k.m65745e(str, "gift")) {
                return m78441N(navController);
            }
            if (AbstractC22676k.m65745e(str, "FamilyPlanHub")) {
                return m78439M(navController);
            }
            if (AbstractC22676k.m65745e(str, "JoinCommunity")) {
                if (listM78519c.size() > 1) {
                    return m78510x(listM78519c.get(1), navController);
                }
                this.logger.mo85230v("Iterable custom action for join community is missing invite code", new IllegalArgumentException("Iterable custom action for join community is missing invite code"), new AbstractC30556a.a[0]);
                return EnumC26479a.ERROR;
            }
            if (!AbstractC22676k.m65745e(str, "ReferAFriend")) {
                Locale US = Locale.US;
                AbstractC22676k.m65749i(US, "US");
                String lowerCase = "ReferAFriend".toLowerCase(US);
                AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
                if (!AbstractC22676k.m65745e(str, lowerCase)) {
                    if (!AbstractC22676k.m65745e(str, "OverviewPillar") && !AbstractC22676k.m65745e(str, "TeamDirectory")) {
                        if (AbstractC22676k.m65745e(str, "Coaching")) {
                            return m78435K(navController);
                        }
                        if (AbstractC22676k.m65745e(str, "impacts")) {
                            return m78427G(navController);
                        }
                        if (AbstractC22676k.m65745e(str, "weekly-plan-home")) {
                            return m78434J0(navController);
                        }
                        if (AbstractC22676k.m65745e(str, "weekly-plan-presets")) {
                            return m78436K0(navController);
                        }
                        if (AbstractC22676k.m65745e(str, "sage")) {
                            return m78491m0(navController);
                        }
                        if (AbstractC22676k.m65745e(str, "StrainCoach")) {
                            return m78416A0();
                        }
                        if (AbstractC22676k.m65745e(str, "SleepCoach")) {
                            return m78499q0(navController);
                        }
                        if (AbstractC22676k.m65745e(str, "SleepDetails")) {
                            return m78507v0(listM78519c, navController);
                        }
                        if (AbstractC22676k.m65745e(str, "SleepNeeded")) {
                            return m78511x0(navController, navigator);
                        }
                        if (AbstractC22676k.m65745e(str, "SleepPillar")) {
                            return m78505u0(this, listM78519c, navController, null, 4, null);
                        }
                        if (!AbstractC22676k.m65745e(str, "StrainPillar") && !AbstractC22676k.m65745e(str, "RecoveryPillar")) {
                            if (AbstractC22676k.m65745e(str, "ViewCommunity")) {
                                return m78462X0(listM78519c, navController);
                            }
                            if (AbstractC22676k.m65745e(str, "WHOOPLive")) {
                                return m78460W0(listM78519c);
                            }
                            if (AbstractC22676k.m65745e(str, "ViewSettings")) {
                                return m78466Z0(listM78519c, navController, navigator);
                            }
                            if (AbstractC22676k.m65745e(str, "GiftWHOOP")) {
                                return m78443O();
                            }
                            if (AbstractC22676k.m65745e(str, "Community")) {
                                return m78437L(navController, navigator);
                            }
                            if (AbstractC22676k.m65745e(str, "RAFGiftPage")) {
                                return m78457V(navController);
                            }
                            if (AbstractC22676k.m65745e(str, "ExtendMembership")) {
                                return m78477f0(listM78519c, navController);
                            }
                            if (AbstractC22676k.m65745e(str, "BillingOptions")) {
                                return m78429H();
                            }
                            if (AbstractC22676k.m65745e(str, "journalsettings")) {
                                return m78467a0(navController);
                            }
                            if (AbstractC22676k.m65745e(str, "journal")) {
                                return m78465Z(navController, false);
                            }
                            if (AbstractC22676k.m65745e(str, "customizeyourjournal")) {
                                return m78465Z(navController, true);
                            }
                            if (AbstractC22676k.m65745e(str, "HarvardUpgradeFlow")) {
                                return m78449R();
                            }
                            if (AbstractC22676k.m65745e(str, "ViewAchievement")) {
                                return m78514z(listM78519c, navController);
                            }
                            if (AbstractC22676k.m65745e(str, "ViewLevel")) {
                                return m78475e0(navController);
                            }
                            if (!AbstractC22676k.m65745e(str, "ViewProfile") && !AbstractC22676k.m65745e(str, "AthleteBio")) {
                                if (AbstractC22676k.m65745e(str, "Ama")) {
                                    return m78425F(listM78519c, navController, navigator);
                                }
                                if (AbstractC22676k.m65745e(str, "HealthMonitor")) {
                                    return m78451S(navController);
                                }
                                if (AbstractC22676k.m65745e(str, "Healthspan")) {
                                    return m78453T(navController);
                                }
                                if (AbstractC22676k.m65745e(str, "HrSettings")) {
                                    return m78463Y(navController);
                                }
                                if (AbstractC22676k.m65745e(str, "MccSettings")) {
                                    return m78469b0(navController);
                                }
                                if (AbstractC22676k.m65745e(str, "menstrual_cycle_insights")) {
                                    return m78471c0(navController);
                                }
                                if (AbstractC22676k.m65745e(str, "menstrual_cycle_insights_phase_education")) {
                                    return m78473d0(navController);
                                }
                                if (AbstractC22676k.m65745e(str, "MaxHRSettings")) {
                                    return m78463Y(navController);
                                }
                                if (AbstractC22676k.m65745e(str, "AddSleep")) {
                                    return m78415A(navController);
                                }
                                if (AbstractC22676k.m65745e(str, "hormonal_insights_onboarding")) {
                                    return m78459W(navController, listM78519c);
                                }
                                if (AbstractC22676k.m65745e(str, "hormonal_insights_settings")) {
                                    return m78461X(navController);
                                }
                                if (AbstractC22676k.m65745e(str, "PregnancyCoachingSettings")) {
                                    return m78487k0(navController);
                                }
                                if (AbstractC22676k.m65745e(str, "pregnancy_insights")) {
                                    return m78485j0(navController);
                                }
                                if (AbstractC22676k.m65745e(str, "whoop_labs")) {
                                    return m78444O0(listM78519c, navController);
                                }
                                if (AbstractC22676k.m65745e(str, "YearInReview")) {
                                    return m78446P0(navController);
                                }
                                if (AbstractC22676k.m65745e(str, "trends")) {
                                    return m78455U(navController, listM78519c);
                                }
                                if (AbstractC22676k.m65745e(str, "sleep_efficiency")) {
                                    return m78509w0(navController);
                                }
                                if (AbstractC22676k.m65745e(str, "sleep_debt")) {
                                    return m78501s0(navController);
                                }
                                if (AbstractC22676k.m65745e(str, "sleep_consistency")) {
                                    return m78500r0(navController);
                                }
                                if (AbstractC22676k.m65745e(str, "sleep_restorative_percent")) {
                                    return m78513y0(navController);
                                }
                                if (AbstractC22676k.m65745e(str, "restorative_sleep")) {
                                    return m78489l0(navController);
                                }
                                if (AbstractC22676k.m65745e(str, "payment")) {
                                    return m78481h0(navController);
                                }
                                if (AbstractC22676k.m65745e(str, "Steps")) {
                                    return m78515z0(navController);
                                }
                                if (AbstractC22676k.m65745e(str, "stress_monitor")) {
                                    return m78424E0(navController);
                                }
                                if (AbstractC22676k.m65745e(str, "StrengthTrainer")) {
                                    return m78422D0(navController);
                                }
                                if (AbstractC22676k.m65745e(str, "whoop_coach")) {
                                    return m78440M0(navController, listM78519c.size() > 1 ? listM78519c.get(1) : null);
                                }
                                if (AbstractC22676k.m65745e(str, "tilt_mode")) {
                                    return m78426F0(navController);
                                }
                                if (AbstractC22676k.m65745e(str, "what_to_expect")) {
                                    return m78438L0(navController);
                                }
                                if (AbstractC22676k.m65745e(str, "WU")) {
                                    return m78432I0(navController);
                                }
                                if (AbstractC22676k.m65745e(str, "challenge_landing")) {
                                    return m78431I(navController);
                                }
                                if (AbstractC22676k.m65745e(str, "challenges")) {
                                    return m78433J(listM78519c, navController);
                                }
                                if (AbstractC22676k.m65745e(str, "upgrade")) {
                                    return m78430H0(navController);
                                }
                                if (AbstractC22676k.m65745e(str, "DATA_STREAK_EXPLAINER")) {
                                    return m78420C0(navController);
                                }
                                if (AbstractC22676k.m65745e(str, "mfa_setup")) {
                                    return m78479g0(navController);
                                }
                                if (AbstractC39421y.m125921F(str, "whoop_coach", true)) {
                                    return m78442N0(this, navController, null, 2, null);
                                }
                                this.logger.mo85222m("Unknown Iterable action: " + ((Object) listM78519c.get(0)), new AbstractC30556a.a[0]);
                                return EnumC26479a.UNKNOWN_ACTION;
                            }
                            return m78483i0(navController);
                        }
                        return m78458V0(navController, str);
                    }
                    return m78454T0(listM78519c, navController, navigator);
                }
            }
            return m78456U0(navigator);
        } catch (Exception e5) {
            this.logger.mo85230v("Error occurred while processing custom action ", e5, new AbstractC30556a.a[0]);
            return EnumC26479a.ERROR;
        }
    }

    /* JADX INFO: renamed from: s */
    public final EnumC26479a m78517s(String actionString, boolean isDeepLink, InterfaceC21159o0 navigator) {
        AbstractC22676k.m65750j(actionString, "actionString");
        if (m78488l()) {
            AbstractC12939a0 abstractC12939a0M78490m = m78490m();
            if (navigator == null) {
                navigator = m78492n();
            }
            return m78516r(actionString, abstractC12939a0M78490m, isDeepLink, navigator);
        }
        Intent intentM78508w = m78508w(this, null, 1, null);
        intentM78508w.putExtra("iterableNavType", actionString);
        ContextWrapper contextWrapperM78482i = m78482i();
        if (contextWrapperM78482i == null) {
            contextWrapperM78482i = this.app;
        }
        contextWrapperM78482i.startActivity(intentM78508w);
        this.logger.mo85228t(AbstractC11895b.m31996o("before handling action ", actionString, ", sending user to MainActivity"), new AbstractC30556a.a[0]);
        return EnumC26479a.MUST_LAUNCH_MAIN_ACTIVITY;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C26480b(WhoopApplication whoopApplication, C40191e c40191e, C11059g c11059g, C27858u c27858u, C28216y c28216y, FeatureFlagChecker featureFlagChecker, InterfaceC41070a interfaceC41070a, InterfaceC37217a interfaceC37217a, InterfaceC17235b interfaceC17235b, InterfaceC21030c interfaceC21030c, InterfaceC39700a interfaceC39700a, WhoopUriParser whoopUriParser, C21147i0 c21147i0, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        InterfaceC2994c0 interfaceC2994c0M8708b;
        WhoopUriParser rVar = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? WhoopUriParser.INSTANCE.parser() : whoopUriParser;
        C21147i0 c21147i1 = (i13 & 4096) != 0 ? new C21147i0() : c21147i0;
        if ((i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            interfaceC2994c0M8708b = AbstractC3006f0.m8708b(AbstractC17182o.f65999a.mo8825s().plus(AbstractC3006f0.m8710d()));
        } else {
            interfaceC2994c0M8708b = interfaceC2994c0;
        }
        this(whoopApplication, c40191e, c11059g, c27858u, c28216y, featureFlagChecker, interfaceC41070a, interfaceC37217a, interfaceC17235b, interfaceC21030c, interfaceC39700a, rVar, c21147i1, interfaceC2994c0M8708b);
    }
}
