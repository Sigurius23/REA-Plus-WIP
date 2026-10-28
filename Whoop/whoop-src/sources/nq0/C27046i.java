package nq0;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1630u0;
import androidx.lifecycle.InterfaceC1618q0;
import androidx.lifecycle.InterfaceC1633v0;
import aq0.C1898i;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.community.domain.model.teams.TimePeriod;
import com.whoop.data.local.room.entity.TeamsDto;
import com.whoop.data.remote.commons.Resource;
import com.whoop.data.remote.commons.Status;
import com.whoop.data.repositories.LanguageRepository;
import com.whoop.data.repositories.LanguageRepositoryKt;
import com.whoop.domain.model.User;
import com.whoop.domain.model.teams.FeatureTeam;
import com.whoop.domain.model.teams.MemberStory;
import com.whoop.domain.model.teams.Team;
import com.whoop.domain.model.teams.TeamInviteDto;
import com.whoop.p069ui.EnumC10591i;
import cq0.C11059g;
import ec3.AbstractC13091v;
import ec3.C13052j1;
import ec3.C13078q1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import f93.InterfaceC14292d;
import hj0.AbstractC17356o;
import i92.AbstractC18263h;
import i92.InterfaceC18260e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.InterfaceC23462h;
import le1.C23876c;
import le1.InterfaceC23874a;
import le1.InterfaceC23875b;
import live.hms.video.connection.degredation.C24117a;
import m83.AbstractC25267u;
import m83.C25271y;
import no1.C26993g;
import or2.C28180m;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDate;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.C30064k;
import q83.InterfaceC30057d;
import qe1.C30306d;
import qe1.InterfaceC30305c;
import qv1.C30653d;
import qv1.C30655f;
import qv1.InterfaceC30651b;
import qv1.InterfaceC30652c;
import qv1.InterfaceC30657h;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sx1.C33067c;
import sx1.C33069e;
import sx1.EnumC33066b;
import tr2.InterfaceC34116n;
import xp0.AbstractC38499a0;
import xp0.AbstractC38505d0;
import z92.InterfaceC40205a;

/* JADX INFO: renamed from: nq0.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u008a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u001d¢\u0006\u0004\b \u0010\u001fJ\r\u0010!\u001a\u00020\u001d¢\u0006\u0004\b!\u0010\u001fJ\r\u0010\"\u001a\u00020\u001d¢\u0006\u0004\b\"\u0010\u001fJ\u0015\u0010%\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u0013\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*¢\u0006\u0004\b,\u0010-J\u0013\u0010.\u001a\b\u0012\u0004\u0012\u00020+0*¢\u0006\u0004\b.\u0010-J\u0013\u00100\u001a\b\u0012\u0004\u0012\u00020/0*¢\u0006\u0004\b0\u0010-J$\u00104\u001a\u0016\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030201\u0018\u00010*H\u0086@¢\u0006\u0004\b4\u0010\u001cJ\u0015\u00107\u001a\u00020\u001d2\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u0015\u0010:\u001a\u00020\u001d2\u0006\u00109\u001a\u000203¢\u0006\u0004\b:\u0010;J#\u0010>\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020+2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020302¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u001dH\u0014¢\u0006\u0004\b@\u0010\u001fJ\u0015\u0010C\u001a\u00020\u001d2\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJ\u0015\u0010F\u001a\u00020\u001d2\u0006\u0010E\u001a\u00020A¢\u0006\u0004\bF\u0010DJ\u0015\u0010H\u001a\u00020G2\u0006\u0010E\u001a\u00020A¢\u0006\u0004\bH\u0010IJ\u0015\u0010J\u001a\u00020G2\u0006\u0010E\u001a\u00020A¢\u0006\u0004\bJ\u0010IJ\u0015\u0010K\u001a\u00020G2\u0006\u0010E\u001a\u00020A¢\u0006\u0004\bK\u0010IJ\r\u0010L\u001a\u00020A¢\u0006\u0004\bL\u0010MJ\r\u0010N\u001a\u00020\u001d¢\u0006\u0004\bN\u0010\u001fJ\r\u0010O\u001a\u00020+¢\u0006\u0004\bO\u0010PJ\u0015\u0010R\u001a\u00020\u001d2\u0006\u0010Q\u001a\u00020+¢\u0006\u0004\bR\u0010SJ\u001d\u0010V\u001a\u00020A2\u0006\u0010T\u001a\u00020G2\u0006\u0010U\u001a\u00020G¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\u001dH\u0002¢\u0006\u0004\bX\u0010\u001fJ\u0013\u0010Z\u001a\u00020Y*\u00020'H\u0002¢\u0006\u0004\bZ\u0010[J\u001f\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\\*\b\u0012\u0004\u0012\u00020Y0\\H\u0002¢\u0006\u0004\b^\u0010_J\u001f\u0010a\u001a\b\u0012\u0004\u0012\u00020`0\\*\b\u0012\u0004\u0012\u00020]0\\H\u0002¢\u0006\u0004\ba\u0010_J\u0013\u0010c\u001a\u00020b*\u00020#H\u0002¢\u0006\u0004\bc\u0010dJ\u001f\u0010f\u001a\b\u0012\u0004\u0012\u00020e0\\*\b\u0012\u0004\u0012\u00020b0\\H\u0002¢\u0006\u0004\bf\u0010_J\u001f\u0010h\u001a\b\u0012\u0004\u0012\u00020g0\\*\b\u0012\u0004\u0012\u00020e0\\H\u0002¢\u0006\u0004\bh\u0010_J\u001f\u0010k\u001a\u0004\u0018\u00010i2\f\u0010j\u001a\b\u0012\u0004\u0012\u00020i02H\u0002¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00020\u001dH\u0002¢\u0006\u0004\bm\u0010\u001fJ\u0017\u0010n\u001a\u00020\u001d2\u0006\u0010E\u001a\u00020AH\u0002¢\u0006\u0004\bn\u0010DR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0016\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R#\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00020/0\u0085\u00018\u0006¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R3\u0010\u0092\u0001\u001a\u00020/2\u0007\u0010\u008b\u0001\u001a\u00020/8B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R\"\u0010\u0097\u0001\u001a\b\u0012\u0004\u0012\u00020+0\\8\u0006¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0019\u0010\u009a\u0001\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R*\u0010¢\u0001\u001a\u00030\u009b\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R)\u0010¨\u0001\u001a\u00020G8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b£\u0001\u0010\u0099\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R+\u0010¬\u0001\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b©\u0001\u0010\u0099\u0001\u001a\u0006\bª\u0001\u0010¥\u0001\"\u0006\b«\u0001\u0010§\u0001R*\u0010T\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u00ad\u0001\u0010\u0099\u0001\u001a\u0006\b®\u0001\u0010¥\u0001\"\u0006\b¯\u0001\u0010§\u0001R*\u0010·\u0001\u001a\u00030°\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001\"\u0006\bµ\u0001\u0010¶\u0001R'\u0010¼\u0001\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b¸\u0001\u0010¹\u0001\u001a\u0005\bº\u0001\u0010P\"\u0005\b»\u0001\u0010SR+\u0010¾\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020302010*8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¹\u0001\u0010½\u0001R,\u0010Á\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¿\u000102010*8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÀ\u0001\u0010½\u0001R#\u0010Ä\u0001\u001a\t\u0012\u0004\u0012\u00020+0\u0085\u00018\u0006¢\u0006\u0010\n\u0006\bÂ\u0001\u0010\u0087\u0001\u001a\u0006\bÃ\u0001\u0010\u0089\u0001R\u001e\u0010È\u0001\u001a\t\u0012\u0004\u0012\u00020'0Å\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R\u001e\u0010Ê\u0001\u001a\t\u0012\u0004\u0012\u00020#0Å\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÉ\u0001\u0010Ç\u0001R3\u0010Ï\u0001\u001a\u0016\u0012\u0011\u0012\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¿\u000102010Ë\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b!\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001R)\u0010Ñ\u0001\u001a\u0015\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020302010Ë\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\"\u0010Ð\u0001R\u001e\u0010Ó\u0001\u001a\u00020G8\u0016X\u0096D¢\u0006\u000f\n\u0005\b.\u0010\u0099\u0001\u001a\u0006\bÒ\u0001\u0010¥\u0001¨\u0006Ô\u0001"}, m65681d2 = {"Lnq0/i;", "Lhj0/o;", "Lcq0/g;", "teamsRepository", "Li92/e;", "networkMonitor", "Ltr2/n;", "logger", "Lle1/c;", "educationCarouselInteractor", "Lqe1/d;", "educationCarouselViewStateReducer", "Lqv1/d;", "communityRafInteractor", "Lqv1/f;", "communityRafReducer", "Lbc3/c0;", "coroutineScope", "Lcom/whoop/data/repositories/LanguageRepository;", "languageRepository", "Lsx1/c;", "reactivationModalCoordinator", "Lz92/a;", "userInfoAccessor", "<init>", "(Lcq0/g;Li92/e;Ltr2/n;Lle1/c;Lqe1/d;Lqv1/d;Lqv1/f;Lbc3/c0;Lcom/whoop/data/repositories/LanguageRepository;Lsx1/c;Lz92/a;)V", "Lcom/whoop/domain/model/User;", "y0", "(Lq83/d;)Ljava/lang/Object;", "Ll83/a0;", "I0", "()V", "H0", "e0", "f0", "Lnq0/o;", NotificationCompat.CATEGORY_EVENT, "O0", "(Lnq0/o;)V", "Lnq0/a;", "P0", "(Lnq0/a;)V", "Landroidx/lifecycle/p0;", "", "C", "()Landroidx/lifecycle/p0;", "g0", "Lnq0/j;", "A0", "Lcom/whoop/data/remote/commons/Resource;", "", "Lcom/whoop/domain/model/teams/TeamInviteDto;", "w0", "Lcom/whoop/domain/model/teams/FeatureTeam;", "featureTeam", "Z0", "(Lcom/whoop/domain/model/teams/FeatureTeam;)V", "teamInviteDto", "a1", "(Lcom/whoop/domain/model/teams/TeamInviteDto;)V", "showBadge", "teams", "Y0", "(ZLjava/util/List;)V", "onCleared", "", "position", "F0", "(I)V", "id", "K0", "", "n0", "(I)Ljava/lang/String;", "p0", "o0", "q0", "()I", "N0", "E0", "()Z", "flag", "Q0", "(Z)V", "period", "pillar", "r0", "(Ljava/lang/String;Ljava/lang/String;)I", "G0", "Lle1/a;", "W0", "(Lnq0/a;)Lle1/a;", "Lec3/l;", "Lle1/b;", "interact", "(Lec3/l;)Lec3/l;", "Lqe1/c;", "L0", "Lqv1/b;", "X0", "(Lnq0/o;)Lqv1/b;", "Lqv1/c;", "C0", "Lqv1/h;", "M0", "Lcom/whoop/domain/model/teams/MemberStory;", "memberStories", "h0", "(Ljava/util/List;)Lcom/whoop/domain/model/teams/MemberStory;", "J0", "S0", "E", "Lcq0/g;", "F", "Li92/e;", "G", "Ltr2/n;", "H", "Lle1/c;", "I", "Lqe1/d;", "J", "Lqv1/d;", "K", "Lqv1/f;", "L", "Lbc3/c0;", "M", "Lcom/whoop/data/repositories/LanguageRepository;", "N", "Lsx1/c;", "O", "Lz92/a;", "Landroidx/lifecycle/u0;", "P", "Landroidx/lifecycle/u0;", "B0", "()Landroidx/lifecycle/u0;", "viewStateLiveData", "<set-?>", "Q", "Lf93/d;", "z0", "()Lnq0/j;", "T0", "(Lnq0/j;)V", "viewState", "R", "Lec3/l;", "s0", "()Lec3/l;", "reactivationModalNavigationFlow", "S", "Ljava/lang/String;", "leaderBoardType", "Lcom/whoop/community/domain/model/teams/TimePeriod;", "T", "Lcom/whoop/community/domain/model/teams/TimePeriod;", "u0", "()Lcom/whoop/community/domain/model/teams/TimePeriod;", "setSelectedRankTimePeriod", "(Lcom/whoop/community/domain/model/teams/TimePeriod;)V", "selectedRankTimePeriod", "U", "v0", "()Ljava/lang/String;", "setStartDate", "(Ljava/lang/String;)V", "startDate", "V", "k0", "setEndDate", "endDate", "W", "m0", "setPeriod", "Lcom/whoop/ui/i;", "X", "Lcom/whoop/ui/i;", "t0", "()Lcom/whoop/ui/i;", "setSelectedRankPillarType", "(Lcom/whoop/ui/i;)V", "selectedRankPillarType", "Y", "Z", "l0", "R0", "homePaused", "Landroidx/lifecycle/p0;", "pendingTeamInviteLiveData", "Lcom/whoop/data/local/room/entity/TeamsDto;", "a0", "teamLiveData", "b0", "getShowUnreadMessageBadge", "showUnreadMessageBadge", "Lec3/o1;", "c0", "Lec3/o1;", "educationCarouselEventFlow", "d0", "rafEventFlow", "Landroidx/lifecycle/v0;", "Ll83/h;", "x0", "()Landroidx/lifecycle/v0;", "teamsObserver", "Landroidx/lifecycle/v0;", "invitesObserver", "o", "logTag", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27046i extends AbstractC17356o {

    /* JADX INFO: renamed from: h0 */
    static final /* synthetic */ InterfaceC21493z[] f107983h0 = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C27046i.class, "viewState", "getViewState()Lcom/whoop/community/presentation/landing/CommunityLandingViewState;", 0))};

    /* JADX INFO: renamed from: i0 */
    public static final int f107984i0 = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C11059g teamsRepository;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC18260e networkMonitor;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final C23876c educationCarouselInteractor;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final C30306d educationCarouselViewStateReducer;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final C30653d communityRafInteractor;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final C30655f communityRafReducer;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final LanguageRepository languageRepository;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final C33067c reactivationModalCoordinator;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final InterfaceC40205a userInfoAccessor;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final C1630u0 viewStateLiveData;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final InterfaceC14292d viewState;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final InterfaceC13058l reactivationModalNavigationFlow;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private String leaderBoardType;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private TimePeriod selectedRankTimePeriod;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private String startDate;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private String endDate;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private String period;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private EnumC10591i selectedRankPillarType;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private boolean homePaused;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private AbstractC1615p0 pendingTeamInviteLiveData;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    private AbstractC1615p0 teamLiveData;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    private final C1630u0 showUnreadMessageBadge;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    private final InterfaceC13072o1 educationCarouselEventFlow;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    private final InterfaceC13072o1 rafEventFlow;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    private final InterfaceC23462h teamsObserver;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    private final InterfaceC1633v0 invitesObserver;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: nq0.i$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f108014a;

        static {
            int[] iArr = new int[TimePeriod.values().length];
            try {
                iArr[TimePeriod.WEEK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimePeriod.MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f108014a = iArr;
        }
    }

    /* JADX INFO: renamed from: nq0.i$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.landing.CommunityLandingViewModel$acceptAllInvites$1", m100430f = "CommunityLandingViewModel.kt", m100431l = {225, 225, 225}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/q0;", "", "Ll83/a0;", "<anonymous>", "(Landroidx/lifecycle/q0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f108016w;

        /* JADX INFO: renamed from: x */
        Object f108017x;

        /* JADX INFO: renamed from: y */
        int f108018y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f108019z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = C27046i.this.new b(interfaceC30057d);
            bVar.f108019z = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC1618q0 interfaceC1618q0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC1618q0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
        
            if (((androidx.lifecycle.C1621r0) r0).m5031a(r9, r8) == r1) goto L26;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f108019z
                androidx.lifecycle.q0 r0 = (androidx.lifecycle.InterfaceC1618q0) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r8.f108018y
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L34
                if (r2 == r5) goto L28
                if (r2 == r4) goto L20
                if (r2 != r3) goto L18
                p505ts.AbstractC34132o.m107864I(r9)
                goto L7b
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L20:
                java.lang.Object r0 = r8.f108016w
                androidx.lifecycle.q0 r0 = (androidx.lifecycle.InterfaceC1618q0) r0
                p505ts.AbstractC34132o.m107864I(r9)
                goto L6c
            L28:
                java.lang.Object r0 = r8.f108017x
                cq0.g r0 = (cq0.C11059g) r0
                java.lang.Object r2 = r8.f108016w
                androidx.lifecycle.q0 r2 = (androidx.lifecycle.InterfaceC1618q0) r2
                p505ts.AbstractC34132o.m107864I(r9)
                goto L52
            L34:
                p505ts.AbstractC34132o.m107864I(r9)
                nq0.i r9 = nq0.C27046i.this
                cq0.g r9 = nq0.C27046i.m81190R(r9)
                nq0.i r2 = nq0.C27046i.this
                r8.f108019z = r6
                r8.f108016w = r0
                r8.f108017x = r9
                r8.f108018y = r5
                java.lang.Object r2 = r2.m81247y0(r8)
                if (r2 != r1) goto L4e
                goto L7a
            L4e:
                r7 = r0
                r0 = r9
                r9 = r2
                r2 = r7
            L52:
                com.whoop.domain.model.User r9 = (com.whoop.domain.model.User) r9
                if (r9 == 0) goto L5b
                int r9 = r9.getId()
                goto L5c
            L5b:
                r9 = 0
            L5c:
                r8.f108019z = r6
                r8.f108016w = r2
                r8.f108017x = r6
                r8.f108018y = r4
                java.lang.Object r9 = r0.m29800k(r9, r8)
                if (r9 != r1) goto L6b
                goto L7a
            L6b:
                r0 = r2
            L6c:
                r8.f108019z = r6
                r8.f108016w = r6
                r8.f108018y = r3
                androidx.lifecycle.r0 r0 = (androidx.lifecycle.C1621r0) r0
                java.lang.Object r9 = r0.m5031a(r9, r8)
                if (r9 != r1) goto L7b
            L7a:
                return r1
            L7b:
                l83.a0 r9 = l83.C23454a0.f92919a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: nq0.C27046i.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: nq0.i$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.landing.CommunityLandingViewModel$collectCarouselViewState$1", m100430f = "CommunityLandingViewModel.kt", m100431l = {DateTimeConstants.HOURS_PER_WEEK}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f108020w;

        /* JADX INFO: renamed from: nq0.i$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C27046i f108022w;

            public a(C27046i c27046i) {
                this.f108022w = c27046i;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(InterfaceC30305c interfaceC30305c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                C27046i c27046i = this.f108022w;
                C27047j c27047jM81214z0 = c27046i.m81214z0();
                InterfaceC30305c.b bVar = interfaceC30305c instanceof InterfaceC30305c.b ? (InterfaceC30305c.b) interfaceC30305c : null;
                c27046i.m81193T0(C27047j.m81253b(c27047jM81214z0, false, null, null, null, null, false, false, false, false, null, bVar != null ? bVar.getData() : null, null, null, 7167, null));
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: nq0.i$c$b */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f108023w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C27046i f108024x;

            /* JADX INFO: renamed from: nq0.i$c$b$a */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f108025w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ C27046i f108026x;

                /* JADX INFO: renamed from: nq0.i$c$b$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.community.presentation.landing.CommunityLandingViewModel$collectCarouselViewState$1$invokeSuspend$$inlined$map$1$2", m100430f = "CommunityLandingViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C42081a extends AbstractC32269c {

                    /* JADX INFO: renamed from: E */
                    Object f108027E;

                    /* JADX INFO: renamed from: F */
                    Object f108028F;

                    /* JADX INFO: renamed from: G */
                    Object f108029G;

                    /* JADX INFO: renamed from: H */
                    int f108030H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f108031w;

                    /* JADX INFO: renamed from: x */
                    int f108032x;

                    /* JADX INFO: renamed from: y */
                    Object f108033y;

                    public C42081a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f108031w = obj;
                        this.f108032x |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC13062m interfaceC13062m, C27046i c27046i) {
                    this.f108025w = interfaceC13062m;
                    this.f108026x = c27046i;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C42081a c42081a;
                    if (interfaceC30057d instanceof C42081a) {
                        c42081a = (C42081a) interfaceC30057d;
                        int i13 = c42081a.f108032x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c42081a.f108032x = i13 - Integer.MIN_VALUE;
                        } else {
                            c42081a = new C42081a(interfaceC30057d);
                        }
                    } else {
                        c42081a = new C42081a(interfaceC30057d);
                    }
                    Object obj2 = c42081a.f108031w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c42081a.f108032x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f108025w;
                        InterfaceC23874a interfaceC23874aM81199W0 = this.f108026x.m81199W0((InterfaceC27038a) obj);
                        c42081a.f108033y = null;
                        c42081a.f108027E = null;
                        c42081a.f108028F = null;
                        c42081a.f108029G = null;
                        c42081a.f108030H = 0;
                        c42081a.f108032x = 1;
                        if (interfaceC13062m.emit(interfaceC23874aM81199W0, c42081a) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj2);
                    }
                    return C23454a0.f92919a;
                }
            }

            public b(InterfaceC13058l interfaceC13058l, C27046i c27046i) {
                this.f108023w = interfaceC13058l;
                this.f108024x = c27046i;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f108023w.collect(new a(interfaceC13062m, this.f108024x), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C27046i.this.new c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f108020w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C27046i c27046i = C27046i.this;
                C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(c27046i.m81183L0(c27046i.interact(new b(c27046i.educationCarouselEventFlow, C27046i.this))), C27046i.this.coroutineScope, C13105z1.f45288a, 1);
                a aVar = new a(C27046i.this);
                this.f108020w = 1;
                if (c13078q1M36586L.f45191w.collect(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: nq0.i$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.landing.CommunityLandingViewModel$collectRafCommunity$1", m100430f = "CommunityLandingViewModel.kt", m100431l = {184}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f108035w;

        /* JADX INFO: renamed from: nq0.i$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C27046i f108037w;

            public a(C27046i c27046i) {
                this.f108037w = c27046i;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(InterfaceC30657h interfaceC30657h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                C27046i c27046i = this.f108037w;
                C27047j c27047jM81214z0 = c27046i.m81214z0();
                InterfaceC30657h.b bVar = interfaceC30657h instanceof InterfaceC30657h.b ? (InterfaceC30657h.b) interfaceC30657h : null;
                c27046i.m81193T0(C27047j.m81253b(c27047jM81214z0, false, null, null, null, null, false, false, false, false, null, null, bVar != null ? bVar.getData() : null, null, 6143, null));
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: nq0.i$d$b */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f108038w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C27046i f108039x;

            /* JADX INFO: renamed from: nq0.i$d$b$a */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f108040w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ C27046i f108041x;

                /* JADX INFO: renamed from: nq0.i$d$b$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.community.presentation.landing.CommunityLandingViewModel$collectRafCommunity$1$invokeSuspend$$inlined$map$1$2", m100430f = "CommunityLandingViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C42082a extends AbstractC32269c {

                    /* JADX INFO: renamed from: E */
                    Object f108042E;

                    /* JADX INFO: renamed from: F */
                    Object f108043F;

                    /* JADX INFO: renamed from: G */
                    Object f108044G;

                    /* JADX INFO: renamed from: H */
                    int f108045H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f108046w;

                    /* JADX INFO: renamed from: x */
                    int f108047x;

                    /* JADX INFO: renamed from: y */
                    Object f108048y;

                    public C42082a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f108046w = obj;
                        this.f108047x |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC13062m interfaceC13062m, C27046i c27046i) {
                    this.f108040w = interfaceC13062m;
                    this.f108041x = c27046i;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C42082a c42082a;
                    if (interfaceC30057d instanceof C42082a) {
                        c42082a = (C42082a) interfaceC30057d;
                        int i13 = c42082a.f108047x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c42082a.f108047x = i13 - Integer.MIN_VALUE;
                        } else {
                            c42082a = new C42082a(interfaceC30057d);
                        }
                    } else {
                        c42082a = new C42082a(interfaceC30057d);
                    }
                    Object obj2 = c42082a.f108046w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c42082a.f108047x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f108040w;
                        InterfaceC30651b interfaceC30651bM81201X0 = this.f108041x.m81201X0((InterfaceC27052o) obj);
                        c42082a.f108048y = null;
                        c42082a.f108042E = null;
                        c42082a.f108043F = null;
                        c42082a.f108044G = null;
                        c42082a.f108045H = 0;
                        c42082a.f108047x = 1;
                        if (interfaceC13062m.emit(interfaceC30651bM81201X0, c42082a) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj2);
                    }
                    return C23454a0.f92919a;
                }
            }

            public b(InterfaceC13058l interfaceC13058l, C27046i c27046i) {
                this.f108038w = interfaceC13058l;
                this.f108039x = c27046i;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f108038w.collect(new a(interfaceC13062m, this.f108039x), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C27046i.this.new d(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f108035w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C27046i c27046i = C27046i.this;
                C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(c27046i.m81185M0(c27046i.m81171C0(new b(c27046i.rafEventFlow, C27046i.this))), C27046i.this.coroutineScope, C13105z1.f45288a, 1);
                a aVar = new a(C27046i.this);
                this.f108035w = 1;
                if (c13078q1M36586L.f45191w.collect(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: nq0.i$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.landing.CommunityLandingViewModel$declineAllInvites$1", m100430f = "CommunityLandingViewModel.kt", m100431l = {231, 231, 231}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/q0;", "", "Ll83/a0;", "<anonymous>", "(Landroidx/lifecycle/q0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f108051w;

        /* JADX INFO: renamed from: x */
        Object f108052x;

        /* JADX INFO: renamed from: y */
        int f108053y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f108054z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = C27046i.this.new e(interfaceC30057d);
            eVar.f108054z = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC1618q0 interfaceC1618q0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC1618q0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
        
            if (((androidx.lifecycle.C1621r0) r0).m5031a(r9, r8) == r1) goto L26;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f108054z
                androidx.lifecycle.q0 r0 = (androidx.lifecycle.InterfaceC1618q0) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r8.f108053y
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L34
                if (r2 == r5) goto L28
                if (r2 == r4) goto L20
                if (r2 != r3) goto L18
                p505ts.AbstractC34132o.m107864I(r9)
                goto L7b
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L20:
                java.lang.Object r0 = r8.f108051w
                androidx.lifecycle.q0 r0 = (androidx.lifecycle.InterfaceC1618q0) r0
                p505ts.AbstractC34132o.m107864I(r9)
                goto L6c
            L28:
                java.lang.Object r0 = r8.f108052x
                cq0.g r0 = (cq0.C11059g) r0
                java.lang.Object r2 = r8.f108051w
                androidx.lifecycle.q0 r2 = (androidx.lifecycle.InterfaceC1618q0) r2
                p505ts.AbstractC34132o.m107864I(r9)
                goto L52
            L34:
                p505ts.AbstractC34132o.m107864I(r9)
                nq0.i r9 = nq0.C27046i.this
                cq0.g r9 = nq0.C27046i.m81190R(r9)
                nq0.i r2 = nq0.C27046i.this
                r8.f108054z = r6
                r8.f108051w = r0
                r8.f108052x = r9
                r8.f108053y = r5
                java.lang.Object r2 = r2.m81247y0(r8)
                if (r2 != r1) goto L4e
                goto L7a
            L4e:
                r7 = r0
                r0 = r9
                r9 = r2
                r2 = r7
            L52:
                com.whoop.domain.model.User r9 = (com.whoop.domain.model.User) r9
                if (r9 == 0) goto L5b
                int r9 = r9.getId()
                goto L5c
            L5b:
                r9 = 0
            L5c:
                r8.f108054z = r6
                r8.f108051w = r2
                r8.f108052x = r6
                r8.f108053y = r4
                java.lang.Object r9 = r0.m29811r(r9, r8)
                if (r9 != r1) goto L6b
                goto L7a
            L6b:
                r0 = r2
            L6c:
                r8.f108054z = r6
                r8.f108051w = r6
                r8.f108053y = r3
                androidx.lifecycle.r0 r0 = (androidx.lifecycle.C1621r0) r0
                java.lang.Object r9 = r0.m5031a(r9, r8)
                if (r9 != r1) goto L7b
            L7a:
                return r1
            L7b:
                l83.a0 r9 = l83.C23454a0.f92919a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: nq0.C27046i.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: nq0.i$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.landing.CommunityLandingViewModel", m100430f = "CommunityLandingViewModel.kt", m100431l = {242}, m100432m = "getTeamInviteLiveData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f108055w;

        /* JADX INFO: renamed from: y */
        int f108057y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f108055w = obj;
            this.f108057y |= Integer.MIN_VALUE;
            return C27046i.this.m81246w0(this);
        }
    }

    /* JADX INFO: renamed from: nq0.i$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.landing.CommunityLandingViewModel$loadFeatureTeams$1", m100430f = "CommunityLandingViewModel.kt", m100431l = {144}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f108058w;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C27046i.this.new g(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objM29778E;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f108058w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C11059g c11059g = C27046i.this.teamsRepository;
                this.f108058w = 1;
                objM29778E = c11059g.m29778E(this);
                if (objM29778E == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objM29778E = obj;
            }
            C27046i c27046i = C27046i.this;
            c27046i.m81193T0(C27047j.m81253b(c27046i.m81214z0(), false, null, null, (List) objM29778E, null, false, false, true, false, null, null, null, null, 8055, null));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: nq0.i$h */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.landing.CommunityLandingViewModel$loadMemberStories$1", m100430f = "CommunityLandingViewModel.kt", m100431l = {151}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f108060w;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C27046i.this.new h(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objM29780G;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f108060w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C11059g c11059g = C27046i.this.teamsRepository;
                this.f108060w = 1;
                objM29780G = c11059g.m29780G(this);
                if (objM29780G == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objM29780G = obj;
            }
            List list = (List) objM29780G;
            C27046i c27046i = C27046i.this;
            c27046i.m81193T0(C27047j.m81253b(c27046i.m81214z0(), false, null, null, null, list, false, false, false, true, C27046i.this.m81207h0(list), null, null, null, 7407, null));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: nq0.i$i */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.landing.CommunityLandingViewModel$loadUserTeams$1", m100430f = "CommunityLandingViewModel.kt", m100431l = {126}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f108062w;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C27046i.this.new i(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f108062w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C27046i c27046i = C27046i.this;
                this.f108062w = 1;
                obj = c27046i.m81247y0(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            User user = (User) obj;
            if (user != null) {
                C27046i c27046i2 = C27046i.this;
                c27046i2.teamLiveData = c27046i2.teamsRepository.m29790Q(user, c27046i2.leaderBoardType, c27046i2.getStartDate(), c27046i2.getEndDate(), c27046i2.getPeriod());
                AbstractC1615p0 abstractC1615p0 = c27046i2.teamLiveData;
                if (abstractC1615p0 == null) {
                    AbstractC22676k.m65757q("teamLiveData");
                    throw null;
                }
                abstractC1615p0.observeForever(c27046i2.m81211x0());
                c27046i2.pendingTeamInviteLiveData = c27046i2.teamsRepository.m29786M(user);
                AbstractC1615p0 abstractC1615p1 = c27046i2.pendingTeamInviteLiveData;
                if (abstractC1615p1 == null) {
                    AbstractC22676k.m65757q("pendingTeamInviteLiveData");
                    throw null;
                }
                abstractC1615p1.observeForever(c27046i2.invitesObserver);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: nq0.i$j */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.landing.CommunityLandingViewModel$observeConnectivity$1", m100430f = "CommunityLandingViewModel.kt", m100431l = {282}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f108064w;

        /* JADX INFO: renamed from: nq0.i$j$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C27046i f108066w;

            public a(C27046i c27046i) {
                this.f108066w = c27046i;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC18263h abstractC18263h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (abstractC18263h.m52614a() != this.f108066w.m81214z0().getIsConnected()) {
                    if (abstractC18263h.m52614a()) {
                        C27046i c27046i = this.f108066w;
                        c27046i.m81193T0(C27047j.m81253b(c27046i.m81214z0(), true, null, null, null, null, false, false, false, false, null, null, null, null, 8190, null));
                        this.f108066w.m81221I0();
                    } else {
                        C27046i c27046i2 = this.f108066w;
                        c27046i2.m81193T0(C27047j.m81253b(c27046i2.m81214z0(), false, null, null, null, null, false, false, false, false, null, null, null, null, 7966, null));
                    }
                }
                return C23454a0.f92919a;
            }
        }

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C27046i.this.new j(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f108064w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lMo52604a = C27046i.this.networkMonitor.getNetworkFlow();
                a aVar = new a(C27046i.this);
                this.f108064w = 1;
                if (interfaceC13058lMo52604a.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: nq0.i$k */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.landing.CommunityLandingViewModel$reactivationModalNavigationFlow$3", m100430f = "CommunityLandingViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"", "it", "Ll83/a0;", "<anonymous>", "(Z)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f108067w;

        public k(InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C27046i.this.new k(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (InterfaceC30057d<? super C23454a0>) obj2);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f108067w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C27046i.this.reactivationModalCoordinator.m104725f(EnumC33066b.COMMUNITY_SCREEN, false);
            return C23454a0.f92919a;
        }

        public final Object invoke(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((k) create(Boolean.valueOf(z4), interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: nq0.i$l */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f108069w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C27046i f108070x;

        /* JADX INFO: renamed from: nq0.i$l$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f108071w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C27046i f108072x;

            /* JADX INFO: renamed from: nq0.i$l$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.community.presentation.landing.CommunityLandingViewModel$reduce$$inlined$map$1$2", m100430f = "CommunityLandingViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42083a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f108073E;

                /* JADX INFO: renamed from: F */
                Object f108074F;

                /* JADX INFO: renamed from: G */
                Object f108075G;

                /* JADX INFO: renamed from: H */
                int f108076H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f108077w;

                /* JADX INFO: renamed from: x */
                int f108078x;

                /* JADX INFO: renamed from: y */
                Object f108079y;

                public C42083a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f108077w = obj;
                    this.f108078x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C27046i c27046i) {
                this.f108071w = interfaceC13062m;
                this.f108072x = c27046i;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42083a c42083a;
                if (interfaceC30057d instanceof C42083a) {
                    c42083a = (C42083a) interfaceC30057d;
                    int i13 = c42083a.f108078x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42083a.f108078x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42083a = new C42083a(interfaceC30057d);
                    }
                } else {
                    c42083a = new C42083a(interfaceC30057d);
                }
                Object obj2 = c42083a.f108077w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42083a.f108078x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f108071w;
                    InterfaceC30305c interfaceC30305cM92660a = this.f108072x.educationCarouselViewStateReducer.m92660a((InterfaceC23875b) obj);
                    c42083a.f108079y = null;
                    c42083a.f108073E = null;
                    c42083a.f108074F = null;
                    c42083a.f108075G = null;
                    c42083a.f108076H = 0;
                    c42083a.f108078x = 1;
                    if (interfaceC13062m.emit(interfaceC30305cM92660a, c42083a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public l(InterfaceC13058l interfaceC13058l, C27046i c27046i) {
            this.f108069w = interfaceC13058l;
            this.f108070x = c27046i;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f108069w.collect(new a(interfaceC13062m, this.f108070x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: nq0.i$m */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f108081w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C27046i f108082x;

        /* JADX INFO: renamed from: nq0.i$m$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f108083w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C27046i f108084x;

            /* JADX INFO: renamed from: nq0.i$m$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.community.presentation.landing.CommunityLandingViewModel$reduceNow$$inlined$map$1$2", m100430f = "CommunityLandingViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42084a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f108085E;

                /* JADX INFO: renamed from: F */
                Object f108086F;

                /* JADX INFO: renamed from: G */
                Object f108087G;

                /* JADX INFO: renamed from: H */
                int f108088H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f108089w;

                /* JADX INFO: renamed from: x */
                int f108090x;

                /* JADX INFO: renamed from: y */
                Object f108091y;

                public C42084a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f108089w = obj;
                    this.f108090x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C27046i c27046i) {
                this.f108083w = interfaceC13062m;
                this.f108084x = c27046i;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42084a c42084a;
                if (interfaceC30057d instanceof C42084a) {
                    c42084a = (C42084a) interfaceC30057d;
                    int i13 = c42084a.f108090x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42084a.f108090x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42084a = new C42084a(interfaceC30057d);
                    }
                } else {
                    c42084a = new C42084a(interfaceC30057d);
                }
                Object obj2 = c42084a.f108089w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42084a.f108090x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f108083w;
                    InterfaceC30657h interfaceC30657hM94222a = this.f108084x.communityRafReducer.m94222a((InterfaceC30652c) obj);
                    c42084a.f108091y = null;
                    c42084a.f108085E = null;
                    c42084a.f108086F = null;
                    c42084a.f108087G = null;
                    c42084a.f108088H = 0;
                    c42084a.f108090x = 1;
                    if (interfaceC13062m.emit(interfaceC30657hM94222a, c42084a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public m(InterfaceC13058l interfaceC13058l, C27046i c27046i) {
            this.f108081w = interfaceC13058l;
            this.f108082x = c27046i;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f108081w.collect(new a(interfaceC13062m, this.f108082x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: nq0.i$n */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.landing.CommunityLandingViewModel$sendCommunityRafViewEvent$1", m100430f = "CommunityLandingViewModel.kt", m100431l = {193}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class n extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f108093w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC27052o f108095y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC27052o interfaceC27052o, InterfaceC30057d<? super n> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f108095y = interfaceC27052o;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C27046i.this.new n(this.f108095y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((n) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f108093w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C27046i.this.rafEventFlow;
                InterfaceC27052o interfaceC27052o = this.f108095y;
                this.f108093w = 1;
                if (interfaceC13072o1.emit(interfaceC27052o, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: nq0.i$o */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.landing.CommunityLandingViewModel$sendEducationCarouselViewEvent$1", m100430f = "CommunityLandingViewModel.kt", m100431l = {199}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class o extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f108096w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC27038a f108098y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(InterfaceC27038a interfaceC27038a, InterfaceC30057d<? super o> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f108098y = interfaceC27038a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C27046i.this.new o(this.f108098y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((o) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f108096w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C27046i.this.educationCarouselEventFlow;
                InterfaceC27038a interfaceC27038a = this.f108098y;
                this.f108096w = 1;
                if (interfaceC13072o1.emit(interfaceC27038a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: nq0.i$p */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f108099w;

        /* JADX INFO: renamed from: nq0.i$p$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f108100w;

            /* JADX INFO: renamed from: nq0.i$p$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.community.presentation.landing.CommunityLandingViewModel$special$$inlined$filter$1$2", m100430f = "CommunityLandingViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42085a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f108102F;

                /* JADX INFO: renamed from: G */
                Object f108103G;

                /* JADX INFO: renamed from: H */
                int f108104H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f108105w;

                /* JADX INFO: renamed from: x */
                int f108106x;

                /* JADX INFO: renamed from: y */
                Object f108107y;

                /* JADX INFO: renamed from: z */
                Object f108108z;

                public C42085a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f108105w = obj;
                    this.f108106x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f108100w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42085a c42085a;
                if (interfaceC30057d instanceof C42085a) {
                    c42085a = (C42085a) interfaceC30057d;
                    int i13 = c42085a.f108106x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42085a.f108106x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42085a = new C42085a(interfaceC30057d);
                    }
                } else {
                    c42085a = new C42085a(interfaceC30057d);
                }
                Object obj2 = c42085a.f108105w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42085a.f108106x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f108100w;
                    if (((Boolean) obj).booleanValue()) {
                        c42085a.f108107y = null;
                        c42085a.f108108z = null;
                        c42085a.f108102F = null;
                        c42085a.f108103G = null;
                        c42085a.f108104H = 0;
                        c42085a.f108106x = 1;
                        if (interfaceC13062m.emit(obj, c42085a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public p(InterfaceC13058l interfaceC13058l) {
            this.f108099w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f108099w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: nq0.i$q */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f108109w;

        /* JADX INFO: renamed from: nq0.i$q$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f108110w;

            /* JADX INFO: renamed from: nq0.i$q$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.community.presentation.landing.CommunityLandingViewModel$special$$inlined$map$1$2", m100430f = "CommunityLandingViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42086a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f108111E;

                /* JADX INFO: renamed from: F */
                Object f108112F;

                /* JADX INFO: renamed from: G */
                Object f108113G;

                /* JADX INFO: renamed from: H */
                int f108114H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f108115w;

                /* JADX INFO: renamed from: x */
                int f108116x;

                /* JADX INFO: renamed from: y */
                Object f108117y;

                public C42086a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f108115w = obj;
                    this.f108116x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f108110w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42086a c42086a;
                if (interfaceC30057d instanceof C42086a) {
                    c42086a = (C42086a) interfaceC30057d;
                    int i13 = c42086a.f108116x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42086a.f108116x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42086a = new C42086a(interfaceC30057d);
                    }
                } else {
                    c42086a = new C42086a(interfaceC30057d);
                }
                Object obj2 = c42086a.f108115w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42086a.f108116x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f108110w;
                    C33069e c33069e = (C33069e) obj;
                    Boolean boolValueOf = Boolean.valueOf((c33069e.getModel() == null || c33069e.m104731d().contains(EnumC33066b.COMMUNITY_SCREEN)) ? false : true);
                    c42086a.f108117y = null;
                    c42086a.f108111E = null;
                    c42086a.f108112F = null;
                    c42086a.f108113G = null;
                    c42086a.f108114H = 0;
                    c42086a.f108116x = 1;
                    if (interfaceC13062m.emit(boolValueOf, c42086a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public q(InterfaceC13058l interfaceC13058l) {
            this.f108109w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f108109w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: nq0.i$r */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\u0006\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\b\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"nq0/i$r", "Lf93/d;", "", "thisRef", "Lj93/z;", "property", "getValue", "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;", "value", "Ll83/a0;", "setValue", "(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r implements InterfaceC14292d {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private C27047j value;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C27046i f108120x;

        /* JADX WARN: Multi-variable type inference failed */
        public r(Object obj, C27046i c27046i) {
            this.f108120x = c27046i;
            this.value = obj;
        }

        @Override // f93.InterfaceC14291c
        public C27047j getValue(Object thisRef, InterfaceC21493z property) {
            AbstractC22676k.m65750j(property, "property");
            return this.value;
        }

        @Override // f93.InterfaceC14292d
        public void setValue(Object thisRef, InterfaceC21493z property, C27047j value) {
            AbstractC22676k.m65750j(property, "property");
            this.value = value;
            this.f108120x.getViewStateLiveData().postValue(value);
        }
    }

    /* JADX INFO: renamed from: nq0.i$s */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.landing.CommunityLandingViewModel$updateAllTeamInviteBadgeStatus$1", m100430f = "CommunityLandingViewModel.kt", m100431l = {269}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class s extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f108121w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f108123y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ List<TeamInviteDto> f108124z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(boolean z4, List<TeamInviteDto> list, InterfaceC30057d<? super s> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f108123y = z4;
            this.f108124z = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C27046i.this.new s(this.f108123y, this.f108124z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((s) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f108121w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C11059g c11059g = C27046i.this.teamsRepository;
                boolean z4 = this.f108123y;
                List<TeamInviteDto> list = this.f108124z;
                this.f108121w = 1;
                if (c11059g.m29805m0(z4, list, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: nq0.i$t */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.landing.CommunityLandingViewModel$updateFeatureTeamBannerStatus$1", m100430f = "CommunityLandingViewModel.kt", m100431l = {257}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class t extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f108125w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ FeatureTeam f108127y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(FeatureTeam featureTeam, InterfaceC30057d<? super t> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f108127y = featureTeam;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C27046i.this.new t(this.f108127y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((t) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f108125w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C11059g c11059g = C27046i.this.teamsRepository;
                FeatureTeam featureTeam = this.f108127y;
                this.f108125w = 1;
                if (c11059g.m29807o0(featureTeam, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: nq0.i$u */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.landing.CommunityLandingViewModel$updateTeamInviteBadgeStatus$1", m100430f = "CommunityLandingViewModel.kt", m100431l = {263}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class u extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f108128w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ TeamInviteDto f108130y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(TeamInviteDto teamInviteDto, InterfaceC30057d<? super u> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f108130y = teamInviteDto;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C27046i.this.new u(this.f108130y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((u) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f108128w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C11059g c11059g = C27046i.this.teamsRepository;
                TeamInviteDto teamInviteDto = this.f108130y;
                this.f108128w = 1;
                if (c11059g.m29808p0(teamInviteDto, this) == enumC31071a) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27046i(C11059g teamsRepository, InterfaceC18260e networkMonitor, InterfaceC34116n logger, C23876c educationCarouselInteractor, C30306d educationCarouselViewStateReducer, C30653d communityRafInteractor, C30655f communityRafReducer, InterfaceC2994c0 coroutineScope, LanguageRepository languageRepository, C33067c reactivationModalCoordinator, InterfaceC40205a userInfoAccessor) {
        super(coroutineScope);
        AbstractC22676k.m65750j(teamsRepository, "teamsRepository");
        AbstractC22676k.m65750j(networkMonitor, "networkMonitor");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(educationCarouselInteractor, "educationCarouselInteractor");
        AbstractC22676k.m65750j(educationCarouselViewStateReducer, "educationCarouselViewStateReducer");
        AbstractC22676k.m65750j(communityRafInteractor, "communityRafInteractor");
        AbstractC22676k.m65750j(communityRafReducer, "communityRafReducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(languageRepository, "languageRepository");
        AbstractC22676k.m65750j(reactivationModalCoordinator, "reactivationModalCoordinator");
        AbstractC22676k.m65750j(userInfoAccessor, "userInfoAccessor");
        this.teamsRepository = teamsRepository;
        this.networkMonitor = networkMonitor;
        this.logger = logger;
        this.educationCarouselInteractor = educationCarouselInteractor;
        this.educationCarouselViewStateReducer = educationCarouselViewStateReducer;
        this.communityRafInteractor = communityRafInteractor;
        this.communityRafReducer = communityRafReducer;
        this.coroutineScope = coroutineScope;
        this.languageRepository = languageRepository;
        this.reactivationModalCoordinator = reactivationModalCoordinator;
        this.userInfoAccessor = userInfoAccessor;
        this.viewStateLiveData = new C1630u0();
        this.viewState = new r(new C27047j(false, null, null, null, null, false, false, false, false, null, null, null, null, 8191, null), this);
        this.reactivationModalNavigationFlow = new C13052j1(new p(new q(reactivationModalCoordinator.getReactivationModalFlow())), new k(null), 0);
        this.leaderBoardType = "STRAIN";
        this.selectedRankTimePeriod = TimePeriod.DAILY;
        String string = LocalDate.now().toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        this.startDate = string;
        this.selectedRankPillarType = EnumC10591i.STRAIN;
        this.showUnreadMessageBadge = new C1630u0();
        this.educationCarouselEventFlow = AbstractC13091v.m36592b(0, 0, null, 7);
        this.rafEventFlow = AbstractC13091v.m36592b(0, 0, null, 7);
        this.teamsObserver = AbstractC30060g.m92088H(new C24117a(this, 29));
        this.invitesObserver = new C27045h(this, 0);
        this.logTag = "CommunityLandingViewModel";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public final InterfaceC13058l m81171C0(InterfaceC13058l interfaceC13058l) {
        return this.communityRafInteractor.m94220d(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final void m81173D0(C27046i c27046i, Resource it) {
        AbstractC22676k.m65750j(it, "it");
        if (it.getStatus() == Status.SUCCESS || it.getStatus() == Status.ERROR) {
            C27047j c27047jM81214z0 = c27046i.m81214z0();
            List list = (List) it.getData();
            if (list == null) {
                list = C25271y.f99162w;
            }
            c27046i.m81193T0(C27047j.m81253b(c27047jM81214z0, false, list, null, null, null, true, false, false, false, null, null, null, null, 8157, null));
        }
    }

    /* JADX INFO: renamed from: G0 */
    private final void m81177G0() {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new g(null), 3);
    }

    /* JADX INFO: renamed from: J0 */
    private final void m81180J0() {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new j(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public final InterfaceC13058l m81183L0(InterfaceC13058l interfaceC13058l) {
        return new l(interfaceC13058l, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public final InterfaceC13058l m81185M0(InterfaceC13058l interfaceC13058l) {
        return new m(interfaceC13058l, this);
    }

    /* JADX INFO: renamed from: S0 */
    private final void m81192S0(int id4) {
        if (id4 == AbstractC38499a0.f165082H5) {
            String string = LocalDate.now().withDayOfWeek(1).toString();
            AbstractC22676k.m65749i(string, "toString(...)");
            this.startDate = string;
            this.endDate = LocalDate.now().withDayOfWeek(7).toString();
            return;
        }
        if (id4 == AbstractC38499a0.f165064F5) {
            String string2 = new LocalDate(new DateTime().dayOfMonth().withMinimumValue()).toString();
            AbstractC22676k.m65749i(string2, "toString(...)");
            this.startDate = string2;
            this.endDate = new LocalDate(new DateTime().dayOfMonth().withMaximumValue()).toString();
            return;
        }
        String string3 = LocalDate.now().toString();
        AbstractC22676k.m65749i(string3, "toString(...)");
        this.startDate = string3;
        this.endDate = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public final void m81193T0(C27047j c27047j) {
        this.viewState.setValue(this, f107983h0[0], c27047j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final InterfaceC1633v0 m81195U0(C27046i c27046i) {
        return new C27045h(c27046i, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final void m81197V0(C27046i c27046i, Resource it) {
        List arrayList;
        AbstractC22676k.m65750j(it, "it");
        if (it.getStatus() == Status.SUCCESS || it.getStatus() == Status.ERROR) {
            List list = (List) it.getData();
            if (list != null) {
                List list2 = list;
                arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((TeamsDto) it3.next()).toTeam());
                }
            } else {
                arrayList = C25271y.f99162w;
            }
            List list3 = arrayList;
            List list4 = list3;
            boolean z4 = false;
            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                Iterator it4 = list4.iterator();
                while (it4.hasNext()) {
                    if (((Team) it4.next()).getUnreadCount() > 0) {
                        z4 = true;
                        break;
                    }
                }
            }
            boolean z13 = z4;
            c27046i.m81193T0(C27047j.m81253b(c27046i.m81214z0(), false, null, list3, null, null, false, true, false, false, null, null, null, null, 8123, null));
            c27046i.m49140v(c27046i.showUnreadMessageBadge, Boolean.valueOf(z13));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public final InterfaceC23874a m81199W0(InterfaceC27038a interfaceC27038a) {
        if (interfaceC27038a instanceof InterfaceC27038a.a) {
            return InterfaceC23874a.a.f94394a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public final InterfaceC30651b m81201X0(InterfaceC27052o interfaceC27052o) {
        if (AbstractC22676k.m65745e(interfaceC27052o, InterfaceC27052o.a.f108156a)) {
            return InterfaceC30651b.a.f126081a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public final MemberStory m81207h0(List<MemberStory> memberStories) {
        return memberStories.stream().filter(new C1898i(new C26993g(1), 5)).findFirst().orElse(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final boolean m81208i0(MemberStory memberStory) {
        return memberStory.getFeatured() && AbstractC22676k.m65745e(memberStory.getContentType(), "ama");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.educationCarouselInteractor.m70151e(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final boolean m81209j0(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public final InterfaceC1633v0 m81211x0() {
        return (InterfaceC1633v0) this.teamsObserver.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public final C27047j m81214z0() {
        return (C27047j) this.viewState.getValue(this, f107983h0[0]);
    }

    /* JADX INFO: renamed from: A0 */
    public final AbstractC1615p0 m81215A0() {
        m81180J0();
        return this.viewStateLiveData;
    }

    /* JADX INFO: renamed from: B0, reason: from getter */
    public final C1630u0 getViewStateLiveData() {
        return this.viewStateLiveData;
    }

    /* JADX INFO: renamed from: C */
    public final AbstractC1615p0 m81217C() {
        return AbstractC1640x1.m5044c(C30064k.f122676w, new b(null));
    }

    /* JADX INFO: renamed from: E0 */
    public final boolean m81218E0() {
        return this.teamsRepository.m29791R();
    }

    /* JADX INFO: renamed from: F0 */
    public final void m81219F0(int position) {
        if (position == 1) {
            this.leaderBoardType = "RECOVERY";
            this.selectedRankPillarType = EnumC10591i.RECOVERY;
        } else if (position != 2) {
            this.leaderBoardType = "STRAIN";
            this.selectedRankPillarType = EnumC10591i.STRAIN;
        } else {
            this.leaderBoardType = "SLEEP";
            this.selectedRankPillarType = EnumC10591i.SLEEP;
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m81220H0() {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new h(null), 3);
    }

    /* JADX INFO: renamed from: I0 */
    public final void m81221I0() {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new i(null), 3);
        m81177G0();
    }

    /* JADX INFO: renamed from: K0 */
    public final void m81222K0(int id4) {
        if (id4 == AbstractC38499a0.f165082H5) {
            this.period = "WEEK";
            this.selectedRankTimePeriod = TimePeriod.WEEK;
        } else if (id4 == AbstractC38499a0.f165064F5) {
            this.period = "MONTH";
            this.selectedRankTimePeriod = TimePeriod.MONTH;
        } else {
            this.period = null;
            this.selectedRankTimePeriod = TimePeriod.DAILY;
        }
        m81192S0(id4);
    }

    /* JADX INFO: renamed from: N0 */
    public final void m81223N0() {
        m81193T0(C27047j.m81253b(m81214z0(), false, null, null, null, null, false, false, false, false, null, null, null, null, 7711, null));
    }

    /* JADX INFO: renamed from: O0 */
    public final void m81224O0(InterfaceC27052o event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new n(event, null), 3);
    }

    /* JADX INFO: renamed from: P0 */
    public final void m81225P0(InterfaceC27038a event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new o(event, null), 3);
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m81226Q0(boolean flag) {
        this.teamsRepository.m29801k0(flag);
    }

    /* JADX INFO: renamed from: R0 */
    public final void m81227R0(boolean z4) {
        this.homePaused = z4;
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m81228Y0(boolean showBadge, List<TeamInviteDto> teams) {
        AbstractC22676k.m65750j(teams, "teams");
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new s(showBadge, teams, null), 3);
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m81229Z0(FeatureTeam featureTeam) {
        AbstractC22676k.m65750j(featureTeam, "featureTeam");
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new t(featureTeam, null), 3);
    }

    /* JADX INFO: renamed from: a1 */
    public final void m81230a1(TeamInviteDto teamInviteDto) {
        AbstractC22676k.m65750j(teamInviteDto, "teamInviteDto");
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new u(teamInviteDto, null), 3);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m81231e0() {
        if (AbstractC22676k.m65745e(this.languageRepository.getAllowedLanguage().getLanguage(), LanguageRepositoryKt.DEFAULT_LANGUAGE)) {
            AbstractC3006f0.m8732z(this.coroutineScope, null, null, new c(null), 3);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m81232f0() {
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new d(null), 3);
    }

    /* JADX INFO: renamed from: g0 */
    public final AbstractC1615p0 m81233g0() {
        return AbstractC1640x1.m5044c(C30064k.f122676w, new e(null));
    }

    /* JADX INFO: renamed from: k0, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: l0, reason: from getter */
    public final boolean getHomePaused() {
        return this.homePaused;
    }

    /* JADX INFO: renamed from: m0, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: n0 */
    public final String m81237n0(int id4) {
        if (id4 == AbstractC38499a0.f165082H5) {
            return "Weekly";
        }
        return id4 == AbstractC38499a0.f165064F5 ? "Monthly" : "Daily";
    }

    @Override // hj0.AbstractC17356o
    /* JADX INFO: renamed from: o, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }

    /* JADX INFO: renamed from: o0 */
    public final String m81238o0(int id4) {
        if (id4 != 1) {
            return id4 != 2 ? "Day Strain" : "Sleep Performance";
        }
        return "Recovery";
    }

    @Override // hj0.AbstractC17356o, androidx.lifecycle.AbstractC1637w1
    public void onCleared() {
        super.onCleared();
        AbstractC1615p0 abstractC1615p0 = this.teamLiveData;
        if (abstractC1615p0 != null) {
            if (abstractC1615p0 == null) {
                AbstractC22676k.m65757q("teamLiveData");
                throw null;
            }
            abstractC1615p0.removeObserver(m81211x0());
        }
        AbstractC1615p0 abstractC1615p1 = this.pendingTeamInviteLiveData;
        if (abstractC1615p1 != null) {
            if (abstractC1615p1 != null) {
                abstractC1615p1.removeObserver(this.invitesObserver);
            } else {
                AbstractC22676k.m65757q("pendingTeamInviteLiveData");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final String m81239p0(int id4) {
        if (id4 != 1) {
            return id4 != 2 ? "STRAIN" : "SLEEP";
        }
        return "RECOVERY";
    }

    /* JADX INFO: renamed from: q0 */
    public final int m81240q0() {
        int i13 = a.f108014a[this.selectedRankTimePeriod.ordinal()];
        if (i13 != 1) {
            return i13 != 2 ? AbstractC38499a0.f165055E5 : AbstractC38499a0.f165064F5;
        }
        return AbstractC38499a0.f165082H5;
    }

    /* JADX INFO: renamed from: r0 */
    public final int m81241r0(String period, String pillar) {
        AbstractC22676k.m65750j(period, "period");
        AbstractC22676k.m65750j(pillar, "pillar");
        if (period.equals("Daily") && pillar.equals("SLEEP")) {
            return AbstractC38505d0.f165666g0;
        }
        if (period.equals("Weekly") && pillar.equals("SLEEP")) {
            return AbstractC38505d0.f165694n0;
        }
        if (period.equals("Monthly") && pillar.equals("SLEEP")) {
            return AbstractC38505d0.f165678j0;
        }
        if (period.equals("Daily") && pillar.equals("STRAIN")) {
            return AbstractC38505d0.f165670h0;
        }
        if (period.equals("Weekly") && pillar.equals("STRAIN")) {
            return AbstractC38505d0.f165698o0;
        }
        if (period.equals("Monthly") && pillar.equals("STRAIN")) {
            return AbstractC38505d0.f165682k0;
        }
        if (period.equals("Daily") && pillar.equals("RECOVERY")) {
            return AbstractC38505d0.f165662f0;
        }
        if (period.equals("Weekly") && pillar.equals("RECOVERY")) {
            return AbstractC38505d0.f165690m0;
        }
        return (period.equals("Monthly") && pillar.equals("RECOVERY")) ? AbstractC38505d0.f165674i0 : AbstractC38505d0.f165686l0;
    }

    /* JADX INFO: renamed from: s0, reason: from getter */
    public final InterfaceC13058l getReactivationModalNavigationFlow() {
        return this.reactivationModalNavigationFlow;
    }

    /* JADX INFO: renamed from: t0, reason: from getter */
    public final EnumC10591i getSelectedRankPillarType() {
        return this.selectedRankPillarType;
    }

    /* JADX INFO: renamed from: u0, reason: from getter */
    public final TimePeriod getSelectedRankTimePeriod() {
        return this.selectedRankTimePeriod;
    }

    /* JADX INFO: renamed from: v0, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: w0 */
    public final Object m81246w0(InterfaceC30057d<? super AbstractC1615p0> interfaceC30057d) {
        f fVar;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f108057y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f108057y = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        Object objM81247y0 = fVar.f108055w;
        Object obj = EnumC31071a.f128113w;
        int i14 = fVar.f108057y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM81247y0);
            m81193T0(C27047j.m81253b(m81214z0(), false, null, null, null, null, false, false, false, false, null, null, null, null, 8159, null));
            fVar.f108057y = 1;
            objM81247y0 = m81247y0(fVar);
            if (objM81247y0 == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM81247y0);
        }
        User user = (User) objM81247y0;
        if (user == null) {
            return null;
        }
        AbstractC1615p0 abstractC1615p0M29786M = this.teamsRepository.m29786M(user);
        m81193T0(C27047j.m81253b(m81214z0(), false, null, null, null, null, true, false, false, false, null, null, null, null, 8159, null));
        return abstractC1615p0M29786M;
    }

    /* JADX INFO: renamed from: y0 */
    public final Object m81247y0(InterfaceC30057d<? super User> interfaceC30057d) {
        return this.userInfoAccessor.mo129089c(interfaceC30057d);
    }

    public /* synthetic */ C27046i(C11059g c11059g, InterfaceC18260e interfaceC18260e, InterfaceC34116n interfaceC34116n, C23876c c23876c, C30306d c30306d, C30653d c30653d, C30655f c30655f, InterfaceC2994c0 interfaceC2994c0, LanguageRepository languageRepository, C33067c c33067c, InterfaceC40205a interfaceC40205a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c11059g, interfaceC18260e, interfaceC34116n, c23876c, c30306d, c30653d, c30655f, (i13 & 128) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0, languageRepository, c33067c, interfaceC40205a);
    }
}
