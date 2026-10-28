package live.hms.video.interactivity;

import android.annotation.SuppressLint;
import android.util.Log;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.mapbox.maps.MapboxMap;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l83.C23454a0;
import live.hms.video.error.ErrorFactory;
import live.hms.video.error.HMSException;
import live.hms.video.polls.HMSPollBuilder;
import live.hms.video.polls.HMSPollResponseBuilder;
import live.hms.video.polls.models.HMSPollUpdateType;
import live.hms.video.polls.models.HmsPoll;
import live.hms.video.polls.models.HmsPollCreationParams;
import live.hms.video.polls.models.HmsPollState;
import live.hms.video.polls.models.PollStatsQuestions;
import live.hms.video.polls.models.answer.HmsPollAnswer;
import live.hms.video.polls.models.answer.PollAnswerResponse;
import live.hms.video.polls.models.network.HMSPollQuestionResponse;
import live.hms.video.polls.models.network.SingleResponse;
import live.hms.video.polls.models.question.HMSPollQuestion;
import live.hms.video.polls.models.question.HMSPollQuestionOption;
import live.hms.video.polls.network.PollGetResponsesReply;
import live.hms.video.polls.network.PollLeaderboardResponse;
import live.hms.video.polls.network.PollResultsDisplay;
import live.hms.video.polls.network.PollResultsResponse;
import live.hms.video.polls.network.QuestionContainer;
import live.hms.video.sdk.HMSActionResultListener;
import live.hms.video.sdk.HmsTypedActionResultListener;
import live.hms.video.sdk.SDKStore;
import live.hms.video.sdk.models.HMSLocalPeer;
import live.hms.video.sdk.models.HMSNotifications;
import live.hms.video.sdk.models.HMSRoom;
import live.hms.video.signal.jsonrpc.models.HMSParams;
import live.hms.video.transport.models.TransportState;
import live.hms.video.utils.HMSConstantsKt;
import live.hms.video.utils.HMSCoroutineScope;
import live.hms.video.whiteboard.HMSWhiteboard;
import live.hms.video.whiteboard.HMSWhiteboardUpdate;
import live.hms.video.whiteboard.HMSWhiteboardUpdateListener;
import live.hms.video.whiteboard.State;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0096\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001Bë\u0003\b\u0000\u0012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\"\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\"\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\"\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\"\u0010\u001a\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u00120\u0010\u001f\u001a,\b\u0001\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001b\u0012\"\u0010\"\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\"\u0010$\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%\u0012\u0006\u0010)\u001a\u00020(\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0%¢\u0006\u0004\b,\u0010-J\u001d\u00103\u001a\u00020\u000b2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0.H\u0000¢\u0006\u0004\b1\u00102J\u001d\u00108\u001a\u00020\u000b2\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u001d\u0010<\u001a\u00020\u000b2\f\u00100\u001a\b\u0012\u0004\u0012\u00020:0.H\u0000¢\u0006\u0004\b;\u00102J\u000f\u0010?\u001a\u00020\u000bH\u0000¢\u0006\u0004\b=\u0010>J\u001d\u0010@\u001a\u00020\u000b2\u0006\u00105\u001a\u00020:2\u0006\u00107\u001a\u000206¢\u0006\u0004\b@\u0010AJ#\u0010D\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020\u000e2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000f0C¢\u0006\u0004\bD\u0010EJE\u0010J\u001a\u00020\u000b2\u0006\u00105\u001a\u00020:2\b\b\u0002\u0010F\u001a\u00020\u001d2\b\b\u0003\u0010G\u001a\u00020\u001d2\u0006\u0010H\u001a\u00020*2\u0012\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0.0C¢\u0006\u0004\bJ\u0010KJ#\u0010\u0015\u001a\u00020\u000b2\u0006\u00105\u001a\u00020:2\f\u00107\u001a\b\u0012\u0004\u0012\u00020:0C¢\u0006\u0004\b\u0015\u0010LJA\u0010Q\u001a\u00020\u000b2\u0006\u0010M\u001a\u00020\n2\b\b\u0002\u0010G\u001a\u00020N2\b\b\u0002\u0010O\u001a\u00020N2\b\b\u0002\u0010P\u001a\u00020*2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00170C¢\u0006\u0004\bQ\u0010RJ)\u0010T\u001a\u00020\u000b2\u0006\u00105\u001a\u00020:2\u0012\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0.0C¢\u0006\u0004\bT\u0010LJ)\u0010V\u001a\u00020\u000b2\u0006\u0010U\u001a\u00020\u001c2\u0012\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0.0C¢\u0006\u0004\bV\u0010WJA\u0010_\u001a\u00020\u000b2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020X0.2\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010N2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010N2\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010NH\u0000¢\u0006\u0004\b]\u0010^J\u0017\u0010b\u001a\u00020\u000b2\b\u0010a\u001a\u0004\u0018\u00010`¢\u0006\u0004\bb\u0010cJ\u0017\u0010d\u001a\u00020\u000b2\b\u0010a\u001a\u0004\u0018\u00010`¢\u0006\u0004\bd\u0010cJ\u001d\u0010f\u001a\u00020\u000b2\u0006\u0010e\u001a\u00020\n2\u0006\u00107\u001a\u000206¢\u0006\u0004\bf\u0010gJ\u0015\u0010h\u001a\u00020\u000b2\u0006\u00107\u001a\u000206¢\u0006\u0004\bh\u0010iJ\u0017\u0010n\u001a\u00020\u000b2\u0006\u0010k\u001a\u00020jH\u0001¢\u0006\u0004\bl\u0010mJ\u0018\u0010o\u001a\u00020\u00032\u0006\u00105\u001a\u000204H\u0082@¢\u0006\u0004\bo\u0010pJQ\u0010u\u001a\u00020\u000b\"\u0004\b\u0000\u0010q\"\u0004\b\u0001\u0010r2\u0006\u0010s\u001a\u00028\u00002$\u0010t\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\bu\u0010vJW\u0010u\u001a\u00020\u000b\"\u0004\b\u0000\u0010q\"\u0004\b\u0001\u0010r2\u0006\u0010s\u001a\u00028\u00002$\u0010t\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u00010CH\u0002¢\u0006\u0004\bu\u0010wJ\u000f\u0010x\u001a\u00020\u000bH\u0002¢\u0006\u0004\bx\u0010>J@\u0010{\u001a\b\u0012\u0004\u0012\u00020z0.2\u0006\u0010U\u001a\u00020\u001c2\u0006\u0010G\u001a\u00020\u001d2\b\u0010y\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u00100\u001a\b\u0012\u0004\u0012\u00020z0.H\u0082P¢\u0006\u0004\b{\u0010|J\u001b\u0010~\u001a\u00020 2\n\b\u0002\u0010}\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b~\u0010\u007fJ$\u0010\u0082\u0001\u001a\u00020\n2\u0007\u0010\u0080\u0001\u001a\u00020\n2\u0007\u0010\u0081\u0001\u001a\u00020\nH\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001R1\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0006\u0010\u0084\u0001R1\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u0084\u0001R1\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\f\u0010\u0084\u0001R1\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010\u0084\u0001R1\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0010\u0010\u0084\u0001R1\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010\u0084\u0001R1\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010\u0084\u0001R1\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0018\u0010\u0084\u0001R1\u0010\u001a\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001a\u0010\u0084\u0001R?\u0010\u001f\u001a,\b\u0001\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001f\u0010\u0085\u0001R1\u0010\"\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\"\u0010\u0084\u0001R1\u0010$\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b$\u0010\u0084\u0001R\u001b\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b'\u0010\u0086\u0001R\u0015\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b)\u0010\u0087\u0001R\u001b\u0010+\u001a\b\u0012\u0004\u0012\u00020*0%8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b+\u0010\u0086\u0001R\u0019\u0010a\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\ba\u0010\u0088\u0001R\u001c\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R,\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001e\u0010\u0094\u0001\u001a\t\u0012\u0004\u0012\u00020:0\u0093\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R \u00100\u001a\b\u0012\u0004\u0012\u00020:0.8\u0006¢\u0006\u000f\n\u0005\b0\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R)\u0010\u0098\u0001\u001a\u00020*8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R*\u0010\u009f\u0001\u001a\u00030\u009e\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001¨\u0006¥\u0001"}, m65681d2 = {"Llive/hms/video/interactivity/HmsInteractivityCenter;", "", "Lkotlin/Function2;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$SetPollParams;", "Lq83/d;", "Llive/hms/video/polls/network/PollCreateResponse;", "pollCreate", "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsSet;", "Llive/hms/video/polls/network/SetQuestionsResponse;", "addQuestion", "", "Ll83/a0;", "startPoll", "stopPoll", "Llive/hms/video/polls/HMSPollResponseBuilder;", "Llive/hms/video/polls/models/answer/PollAnswerResponse;", "sendAnswers", "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;", "Llive/hms/video/polls/network/PollGetResponsesReply;", "getResponsesInternal", "Llive/hms/video/polls/network/PollResultsResponse;", "getPollResults", "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollLeaderboardQuery;", "Llive/hms/video/polls/network/PollLeaderboardResponse;", "getLeaderboard", "Llive/hms/video/polls/network/QuestionContainer;", "getAllPollQuestions", "Lkotlin/Function4;", "Llive/hms/video/polls/models/HmsPollState;", "", "Llive/hms/video/polls/network/PollListResponse;", "pollGetList", "Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;", "Llive/hms/video/whiteboard/network/HMSCreateWhiteBoardResponse;", "createWhiteBoard", "Llive/hms/video/whiteboard/network/HMSGetWhiteBoardResponse;", "getWhiteBoard", "Lkotlin/Function0;", "Llive/hms/video/transport/models/TransportState;", "getTransportState", "Llive/hms/video/sdk/SDKStore;", "sdkStore", "", "isQa", "<init>", "(Lc93/m;Lc93/m;Lc93/m;Lc93/m;Lc93/m;Lc93/m;Lc93/m;Lc93/m;Lc93/m;Lc93/n;Lc93/m;Lc93/m;Lc93/a;Llive/hms/video/sdk/SDKStore;Lc93/a;)V", "", "Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;", "polls", "updatePollsStopped$lib_release", "(Ljava/util/List;)V", "updatePollsStopped", "Llive/hms/video/polls/HMSPollBuilder;", "poll", "Llive/hms/video/sdk/HMSActionResultListener;", "completion", "quickStartPoll", "(Llive/hms/video/polls/HMSPollBuilder;Llive/hms/video/sdk/HMSActionResultListener;)V", "Llive/hms/video/polls/models/HmsPoll;", "updatePollsList$lib_release", "updatePollsList", "close$lib_release", "()V", "close", "stop", "(Llive/hms/video/polls/models/HmsPoll;Llive/hms/video/sdk/HMSActionResultListener;)V", "response", "Llive/hms/video/sdk/HmsTypedActionResultListener;", "add", "(Llive/hms/video/polls/HMSPollResponseBuilder;Llive/hms/video/sdk/HmsTypedActionResultListener;)V", MapboxMap.QFE_OFFSET, "count", "ownResponsesOnly", "Llive/hms/video/polls/models/network/HMSPollQuestionResponse;", "getResponses", "(Llive/hms/video/polls/models/HmsPoll;IIZLlive/hms/video/sdk/HmsTypedActionResultListener;)V", "(Llive/hms/video/polls/models/HmsPoll;Llive/hms/video/sdk/HmsTypedActionResultListener;)V", "pollId", "", "startIndex", "includeCurrentPeer", "fetchLeaderboard", "(Ljava/lang/String;JJZLlive/hms/video/sdk/HmsTypedActionResultListener;)V", "Llive/hms/video/polls/models/question/HMSPollQuestion;", "fetchPollQuestions", "pollState", "fetchPollList", "(Llive/hms/video/polls/models/HmsPollState;Llive/hms/video/sdk/HmsTypedActionResultListener;)V", "Llive/hms/video/sdk/models/HMSNotifications$PollStats;", "pollUpdate", "totalResponses", "votingUsers", "totalDistinctUsers", "updatePollStats$lib_release", "(Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "updatePollStats", "Llive/hms/video/whiteboard/HMSWhiteboardUpdateListener;", "whiteBoardUpdateListener", "setWhiteboardUpdateListener", "(Llive/hms/video/whiteboard/HMSWhiteboardUpdateListener;)V", "removeWhiteboardUpdateListener", "title", "startWhiteboard", "(Ljava/lang/String;Llive/hms/video/sdk/HMSActionResultListener;)V", "stopWhiteboard", "(Llive/hms/video/sdk/HMSActionResultListener;)V", "Llive/hms/video/sdk/models/HMSNotifications$WhiteboardInfo;", "params", "handleWhiteBoardStateNotification$lib_release", "(Llive/hms/video/sdk/models/HMSNotifications$WhiteboardInfo;)V", "handleWhiteBoardStateNotification", "getParams", "(Llive/hms/video/polls/HMSPollBuilder;Lq83/d;)Ljava/lang/Object;", "T", "R", "data", "op", "runNetworkOperationSafely", "(Ljava/lang/Object;Lc93/m;Llive/hms/video/sdk/HMSActionResultListener;)V", "(Ljava/lang/Object;Lc93/m;Llive/hms/video/sdk/HmsTypedActionResultListener;)V", "throwErrorIfNotConnected", "last", "Llive/hms/video/sdk/models/HMSNotifications$StartedPolls;", "getAllPollsRecursively", "(Llive/hms/video/polls/models/HmsPollState;ILjava/lang/String;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "createOptions", "getCreateOptionsWithDefaults", "(Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;)Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;", "address", "token", "formatWhiteBoardUrl", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lc93/m;", "Lc93/n;", "Lc93/a;", "Llive/hms/video/sdk/SDKStore;", "Llive/hms/video/whiteboard/HMSWhiteboardUpdateListener;", "Llive/hms/video/whiteboard/HMSWhiteboard;", "currentWhiteBoard", "Llive/hms/video/whiteboard/HMSWhiteboard;", "Llive/hms/video/interactivity/HmsPollUpdateListener;", "pollUpdateListener", "Llive/hms/video/interactivity/HmsPollUpdateListener;", "getPollUpdateListener", "()Llive/hms/video/interactivity/HmsPollUpdateListener;", "setPollUpdateListener", "(Llive/hms/video/interactivity/HmsPollUpdateListener;)V", "", "_polls", "Ljava/util/List;", "getPolls", "()Ljava/util/List;", "localWhiteBoardstart", "Z", "getLocalWhiteBoardstart$lib_release", "()Z", "setLocalWhiteBoardstart$lib_release", "(Z)V", "Llive/hms/video/whiteboard/State;", "currentWhiteBoardState", "Llive/hms/video/whiteboard/State;", "getCurrentWhiteBoardState", "()Llive/hms/video/whiteboard/State;", "setCurrentWhiteBoardState", "(Llive/hms/video/whiteboard/State;)V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HmsInteractivityCenter {
    private final List<HmsPoll> _polls;
    private final InterfaceC4351m addQuestion;
    private final InterfaceC4351m createWhiteBoard;
    private HMSWhiteboard currentWhiteBoard;
    private State currentWhiteBoardState;
    private final InterfaceC4351m getAllPollQuestions;
    private final InterfaceC4351m getLeaderboard;
    private final InterfaceC4351m getPollResults;
    private final InterfaceC4351m getResponsesInternal;
    private final InterfaceC4339a getTransportState;
    private final InterfaceC4351m getWhiteBoard;
    private final InterfaceC4339a isQa;
    private boolean localWhiteBoardstart;
    private final InterfaceC4351m pollCreate;
    private final InterfaceC4352n pollGetList;
    private HmsPollUpdateListener pollUpdateListener;
    private final List<HmsPoll> polls;
    private final SDKStore sdkStore;
    private final InterfaceC4351m sendAnswers;
    private final InterfaceC4351m startPoll;
    private final InterfaceC4351m stopPoll;
    private HMSWhiteboardUpdateListener whiteBoardUpdateListener;

    /* JADX INFO: renamed from: live.hms.video.interactivity.HmsInteractivityCenter$fetchPollList$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.interactivity.HmsInteractivityCenter$fetchPollList$1", m100430f = "HmsInteractivityCenter.kt", m100431l = {346, 348}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C241541 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HmsTypedActionResultListener<List<HmsPoll>> $completion;
        final /* synthetic */ boolean $fetchQuestions;
        final /* synthetic */ HmsPollState $pollState;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241541(HmsPollState hmsPollState, HmsTypedActionResultListener<List<HmsPoll>> hmsTypedActionResultListener, boolean z4, InterfaceC30057d<? super C241541> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$pollState = hmsPollState;
            this.$completion = hmsTypedActionResultListener;
            this.$fetchQuestions = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HmsInteractivityCenter.this.new C241541(this.$pollState, this.$completion, this.$fetchQuestions, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C241541) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0086 A[Catch: HMSException -> 0x00c9, TryCatch #2 {HMSException -> 0x00c9, blocks: (B:30:0x00b2, B:32:0x00ba, B:38:0x00e6, B:22:0x007f, B:24:0x0086, B:26:0x008e, B:37:0x00db, B:39:0x00ea, B:35:0x00cc, B:21:0x0062, B:18:0x005b), top: B:48:0x005b }] */
        /* JADX WARN: Code duplicated, block: B:29:0x00af A[EDGE_INSN: B:29:0x00af->B:30:0x00b2 BREAK  A[LOOP:0: B:22:0x007f->B:49:0x007f]] */
        /* JADX WARN: Code duplicated, block: B:37:0x00db A[Catch: HMSException -> 0x00c9, TryCatch #2 {HMSException -> 0x00c9, blocks: (B:30:0x00b2, B:32:0x00ba, B:38:0x00e6, B:22:0x007f, B:24:0x0086, B:26:0x008e, B:37:0x00db, B:39:0x00ea, B:35:0x00cc, B:21:0x0062, B:18:0x005b), top: B:48:0x005b }] */
        /* JADX WARN: Code duplicated, block: B:51:0x008e A[SYNTHETIC] */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 256
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: live.hms.video.interactivity.HmsInteractivityCenter.C241541.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: live.hms.video.interactivity.HmsInteractivityCenter$fetchPollQuestions$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.interactivity.HmsInteractivityCenter$fetchPollQuestions$1", m100430f = "HmsInteractivityCenter.kt", m100431l = {324}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C241551 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HmsTypedActionResultListener<List<HMSPollQuestion>> $completion;
        final /* synthetic */ HmsPoll $poll;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241551(HmsPoll hmsPoll, HmsTypedActionResultListener<List<HMSPollQuestion>> hmsTypedActionResultListener, InterfaceC30057d<? super C241551> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$poll = hmsPoll;
            this.$completion = hmsTypedActionResultListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HmsInteractivityCenter.this.new C241551(this.$poll, this.$completion, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C241551) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object next;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC4351m interfaceC4351m = HmsInteractivityCenter.this.getAllPollQuestions;
                String pollId = this.$poll.getPollId();
                this.label = 1;
                obj = interfaceC4351m.invoke(pollId, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            QuestionContainer questionContainer = (QuestionContainer) obj;
            if (questionContainer.getIsSuccess()) {
                this.$poll.setQuestions(questionContainer.getQuestions());
                List<HmsPoll> polls = HmsInteractivityCenter.this.getPolls();
                HmsPoll hmsPoll = this.$poll;
                Iterator<T> it = polls.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!AbstractC22676k.m65745e(((HmsPoll) next).getPollId(), hmsPoll.getPollId()));
                HmsPoll hmsPoll2 = (HmsPoll) next;
                if (hmsPoll2 != null) {
                    hmsPoll2.setQuestions(questionContainer.getQuestions());
                }
                HmsTypedActionResultListener<List<HMSPollQuestion>> hmsTypedActionResultListener = this.$completion;
                List<HMSPollQuestion> questions = questionContainer.getQuestions();
                if (questions == null) {
                    questions = C25271y.f99162w;
                }
                hmsTypedActionResultListener.onSuccess(questions);
            } else {
                HmsTypedActionResultListener<List<HMSPollQuestion>> hmsTypedActionResultListener2 = this.$completion;
                Throwable error = questionContainer.getError();
                AbstractC22676k.m65748h(error, "null cannot be cast to non-null type live.hms.video.error.HMSException");
                hmsTypedActionResultListener2.onError((HMSException) error);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.interactivity.HmsInteractivityCenter$getAllPollsRecursively$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.interactivity.HmsInteractivityCenter", m100430f = "HmsInteractivityCenter.kt", m100431l = {374}, m100432m = "getAllPollsRecursively")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C241561 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C241561(InterfaceC30057d<? super C241561> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HmsInteractivityCenter.this.getAllPollsRecursively(null, 0, null, null, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.interactivity.HmsInteractivityCenter$getPollResults$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.interactivity.HmsInteractivityCenter$getPollResults$1", m100430f = "HmsInteractivityCenter.kt", m100431l = {291}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m65681d2 = {"<anonymous>", "Llive/hms/video/polls/models/HmsPoll;", "i", ""}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C241571 extends AbstractC32275i implements InterfaceC4351m {
        /* synthetic */ Object L$0;
        int label;

        public C241571(InterfaceC30057d<? super C241571> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C241571 c241571 = HmsInteractivityCenter.this.new C241571(interfaceC30057d);
            c241571.L$0 = obj;
            return c241571;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws HMSException {
            Object next;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                String str = (String) this.L$0;
                InterfaceC4351m interfaceC4351m = HmsInteractivityCenter.this.getPollResults;
                this.label = 1;
                obj = interfaceC4351m.invoke(str, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            PollResultsResponse pollResultsResponse = (PollResultsResponse) obj;
            HmsInteractivityCenter.this.updatePollStats$lib_release(AbstractC37056f.m118958J(new HMSNotifications.PollStats(pollResultsResponse.getPollId(), pollResultsResponse.getQuestion())), new Long(pollResultsResponse.getTotalResponses()), new Long(pollResultsResponse.getVotingUsers()), new Long(pollResultsResponse.getTotalDistinctUsers()));
            Iterator it = HmsInteractivityCenter.this._polls.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC22676k.m65745e(((HmsPoll) next).getPollId(), pollResultsResponse.getPollId()));
            HmsPoll hmsPoll = (HmsPoll) next;
            if (hmsPoll != null) {
                return hmsPoll;
            }
            throw ErrorFactory.GenericErrors.PollNotFound$default(ErrorFactory.GenericErrors.INSTANCE, null, null, null, null, 15, null);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(String str, InterfaceC30057d<? super HmsPoll> interfaceC30057d) {
            return ((C241571) create(str, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.interactivity.HmsInteractivityCenter$getResponses$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.interactivity.HmsInteractivityCenter$getResponses$1", m100430f = "HmsInteractivityCenter.kt", m100431l = {267}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m65681d2 = {"<anonymous>", "", "Llive/hms/video/polls/models/network/HMSPollQuestionResponse;", "i", "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C241581 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HmsPoll $poll;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241581(HmsPoll hmsPoll, InterfaceC30057d<? super C241581> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$poll = hmsPoll;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C241581 c241581 = HmsInteractivityCenter.this.new C241581(this.$poll, interfaceC30057d);
            c241581.L$0 = obj;
            return c241581;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            List<HmsPollAnswer> myResponses;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                HMSParams.PollResponsesQuery pollResponsesQuery = (HMSParams.PollResponsesQuery) this.L$0;
                InterfaceC4351m interfaceC4351m = HmsInteractivityCenter.this.getResponsesInternal;
                this.label = 1;
                obj = interfaceC4351m.invoke(pollResponsesQuery, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            PollGetResponsesReply pollGetResponsesReply = (PollGetResponsesReply) obj;
            HMSLocalPeer localPeer = HmsInteractivityCenter.this.sdkStore.getLocalPeer();
            List<SingleResponse> responses = pollGetResponsesReply.getResponses();
            HmsPoll hmsPoll = this.$poll;
            for (SingleResponse singleResponse : responses) {
                Object obj2 = null;
                if (!AbstractC22676k.m65745e(singleResponse.getPeer().getPeerid(), localPeer != null ? localPeer.getPeerID() : null)) {
                    if (AbstractC22676k.m65745e(singleResponse.getPeer().getUserid(), localPeer != null ? localPeer.getCustomerUserID() : null)) {
                    }
                }
                List<HMSPollQuestion> questions = hmsPoll.getQuestions();
                if (questions != null) {
                    for (Object obj3 : questions) {
                        if (((HMSPollQuestion) obj3).getQuestionID() == singleResponse.getResponse().getIndex()) {
                            obj2 = obj3;
                            break;
                        }
                    }
                    HMSPollQuestion hMSPollQuestion = (HMSPollQuestion) obj2;
                    if (hMSPollQuestion != null && (myResponses = hMSPollQuestion.getMyResponses()) != null) {
                        myResponses.add(new HmsPollAnswer(singleResponse.getResponse()));
                    }
                }
            }
            List<SingleResponse> responses2 = pollGetResponsesReply.getResponses();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(responses2, 10));
            Iterator<T> it = responses2.iterator();
            while (it.hasNext()) {
                arrayList.add(((SingleResponse) it.next()).getResponse());
            }
            return arrayList;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(HMSParams.PollResponsesQuery pollResponsesQuery, InterfaceC30057d<? super List<HMSPollQuestionResponse>> interfaceC30057d) {
            return ((C241581) create(pollResponsesQuery, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.interactivity.HmsInteractivityCenter$quickStartPoll$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.interactivity.HmsInteractivityCenter$quickStartPoll$1", m100430f = "HmsInteractivityCenter.kt", m100431l = {141, 141, 153}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C241591 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSActionResultListener $completion;
        final /* synthetic */ HMSPollBuilder $poll;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ HmsInteractivityCenter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241591(HMSActionResultListener hMSActionResultListener, HmsInteractivityCenter hmsInteractivityCenter, HMSPollBuilder hMSPollBuilder, InterfaceC30057d<? super C241591> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$completion = hMSActionResultListener;
            this.this$0 = hmsInteractivityCenter;
            this.$poll = hMSPollBuilder;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C241591 c241591 = new C241591(this.$completion, this.this$0, this.$poll, interfaceC30057d);
            c241591.L$0 = obj;
            return c241591;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C241591) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x0066  */
        /* JADX WARN: Code duplicated, block: B:35:0x0075 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:36:0x0077  */
        /* JADX WARN: Code duplicated, block: B:41:0x00a0 A[Catch: all -> 0x0019, LOOP:0: B:39:0x009a->B:41:0x00a0, LOOP_END, TryCatch #1 {all -> 0x0019, blocks: (B:7:0x0014, B:45:0x00c6, B:38:0x0081, B:39:0x009a, B:41:0x00a0, B:42:0x00af), top: B:54:0x000c }] */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
        
            if (r15 == r1) goto L44;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 244
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: live.hms.video.interactivity.HmsInteractivityCenter.C241591.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: live.hms.video.interactivity.HmsInteractivityCenter$runNetworkOperationSafely$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.interactivity.HmsInteractivityCenter$runNetworkOperationSafely$1", m100430f = "HmsInteractivityCenter.kt", m100431l = {101}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C241601 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSActionResultListener $completion;
        final /* synthetic */ T $data;
        final /* synthetic */ InterfaceC4351m $op;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241601(InterfaceC4351m interfaceC4351m, T t14, HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C241601> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$op = interfaceC4351m;
            this.$data = t14;
            this.$completion = hMSActionResultListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C241601(this.$op, this.$data, this.$completion, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C241601) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC4351m interfaceC4351m = this.$op;
                    Object obj2 = this.$data;
                    this.label = 1;
                    if (interfaceC4351m.invoke(obj2, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                this.$completion.onSuccess();
            } catch (HMSException e5) {
                this.$completion.onError(e5);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.interactivity.HmsInteractivityCenter$runNetworkOperationSafely$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.interactivity.HmsInteractivityCenter$runNetworkOperationSafely$2", m100430f = "HmsInteractivityCenter.kt", m100431l = {114}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C241612 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HmsTypedActionResultListener<R> $completion;
        final /* synthetic */ T $data;
        final /* synthetic */ InterfaceC4351m $op;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241612(InterfaceC4351m interfaceC4351m, T t14, HmsTypedActionResultListener<R> hmsTypedActionResultListener, InterfaceC30057d<? super C241612> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$op = interfaceC4351m;
            this.$data = t14;
            this.$completion = hmsTypedActionResultListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C241612(this.$op, this.$data, this.$completion, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C241612) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC4351m interfaceC4351m = this.$op;
                    Object obj2 = this.$data;
                    this.label = 1;
                    obj = interfaceC4351m.invoke(obj2, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                HmsTypedActionResultListener<R> hmsTypedActionResultListener = this.$completion;
                AbstractC22676k.m65747g(obj);
                hmsTypedActionResultListener.onSuccess((R) obj);
            } catch (HMSException e5) {
                this.$completion.onError(e5);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.interactivity.HmsInteractivityCenter$startWhiteboard$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.interactivity.HmsInteractivityCenter$startWhiteboard$1", m100430f = "HmsInteractivityCenter.kt", m100431l = {466, 496}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C241621 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSActionResultListener $completion;
        final /* synthetic */ C22669g0 $currentWhiteBoardId;
        final /* synthetic */ String $title;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241621(HMSActionResultListener hMSActionResultListener, C22669g0 c22669g0, String str, InterfaceC30057d<? super C241621> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$completion = hMSActionResultListener;
            this.$currentWhiteBoardId = c22669g0;
            this.$title = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HmsInteractivityCenter.this.new C241621(this.$completion, this.$currentWhiteBoardId, this.$title, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C241621) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:64:0x00ea, code lost:
        
            if (r0 == r2) goto L65;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instruction units count: 457
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: live.hms.video.interactivity.HmsInteractivityCenter.C241621.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: live.hms.video.interactivity.HmsInteractivityCenter$stopWhiteboard$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.interactivity.HmsInteractivityCenter$stopWhiteboard$1", m100430f = "HmsInteractivityCenter.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C241631 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSActionResultListener $completion;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241631(HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C241631> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$completion = hMSActionResultListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HmsInteractivityCenter.this.new C241631(this.$completion, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C241631) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            HmsInteractivityCenter hmsInteractivityCenter = HmsInteractivityCenter.this;
            HMSWhiteboard hMSWhiteboard = hmsInteractivityCenter.currentWhiteBoard;
            hmsInteractivityCenter.currentWhiteBoard = hMSWhiteboard != null ? HMSWhiteboard.copy$default(hMSWhiteboard, null, null, null, false, null, State.Stopped, 31, null) : null;
            HMSWhiteboard hMSWhiteboard2 = HmsInteractivityCenter.this.currentWhiteBoard;
            if (hMSWhiteboard2 != null) {
                HmsInteractivityCenter hmsInteractivityCenter2 = HmsInteractivityCenter.this;
                HMSActionResultListener hMSActionResultListener = this.$completion;
                State currentWhiteBoardState = hmsInteractivityCenter2.getCurrentWhiteBoardState();
                State state = State.Stopped;
                if (currentWhiteBoardState != state) {
                    HMSWhiteboardUpdateListener hMSWhiteboardUpdateListener = hmsInteractivityCenter2.whiteBoardUpdateListener;
                    if (hMSWhiteboardUpdateListener != null) {
                        hMSWhiteboardUpdateListener.onUpdate(new HMSWhiteboardUpdate.Stop(hMSWhiteboard2));
                    }
                    hmsInteractivityCenter2.setCurrentWhiteBoardState(state);
                }
                hMSActionResultListener.onSuccess();
            }
            return C23454a0.f92919a;
        }
    }

    public HmsInteractivityCenter(InterfaceC4351m pollCreate, InterfaceC4351m addQuestion, InterfaceC4351m startPoll, InterfaceC4351m stopPoll, InterfaceC4351m sendAnswers, InterfaceC4351m getResponsesInternal, InterfaceC4351m getPollResults, InterfaceC4351m getLeaderboard, InterfaceC4351m getAllPollQuestions, InterfaceC4352n pollGetList, InterfaceC4351m createWhiteBoard, InterfaceC4351m getWhiteBoard, InterfaceC4339a getTransportState, SDKStore sdkStore, InterfaceC4339a isQa) {
        AbstractC22676k.m65750j(pollCreate, "pollCreate");
        AbstractC22676k.m65750j(addQuestion, "addQuestion");
        AbstractC22676k.m65750j(startPoll, "startPoll");
        AbstractC22676k.m65750j(stopPoll, "stopPoll");
        AbstractC22676k.m65750j(sendAnswers, "sendAnswers");
        AbstractC22676k.m65750j(getResponsesInternal, "getResponsesInternal");
        AbstractC22676k.m65750j(getPollResults, "getPollResults");
        AbstractC22676k.m65750j(getLeaderboard, "getLeaderboard");
        AbstractC22676k.m65750j(getAllPollQuestions, "getAllPollQuestions");
        AbstractC22676k.m65750j(pollGetList, "pollGetList");
        AbstractC22676k.m65750j(createWhiteBoard, "createWhiteBoard");
        AbstractC22676k.m65750j(getWhiteBoard, "getWhiteBoard");
        AbstractC22676k.m65750j(getTransportState, "getTransportState");
        AbstractC22676k.m65750j(sdkStore, "sdkStore");
        AbstractC22676k.m65750j(isQa, "isQa");
        this.pollCreate = pollCreate;
        this.addQuestion = addQuestion;
        this.startPoll = startPoll;
        this.stopPoll = stopPoll;
        this.sendAnswers = sendAnswers;
        this.getResponsesInternal = getResponsesInternal;
        this.getPollResults = getPollResults;
        this.getLeaderboard = getLeaderboard;
        this.getAllPollQuestions = getAllPollQuestions;
        this.pollGetList = pollGetList;
        this.createWhiteBoard = createWhiteBoard;
        this.getWhiteBoard = getWhiteBoard;
        this.getTransportState = getTransportState;
        this.sdkStore = sdkStore;
        this.isQa = isQa;
        ArrayList arrayList = new ArrayList();
        this._polls = arrayList;
        this.polls = arrayList;
        this.currentWhiteBoardState = State.Stopped;
    }

    public static /* synthetic */ void fetchLeaderboard$default(HmsInteractivityCenter hmsInteractivityCenter, String str, long j7, long j13, boolean z4, HmsTypedActionResultListener hmsTypedActionResultListener, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            j7 = 50;
        }
        long j14 = j7;
        if ((i13 & 4) != 0) {
            j13 = 0;
        }
        hmsInteractivityCenter.fetchLeaderboard(str, j14, j13, (i13 & 8) != 0 ? false : z4, hmsTypedActionResultListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatWhiteBoardUrl(String address, String token) {
        return (((Boolean) this.isQa.invoke()).booleanValue() ? HMSConstantsKt.WHITE_BOARD_QA_URL : HMSConstantsKt.WHITE_BOARD_URL) + "/?endpoint=https://" + address + "&token=" + token + "&zoom_to_content=true";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0058 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x0059  */
    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0070  */
    /* JADX WARN: Code duplicated, block: B:25:0x007b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:27:0x0088 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0059 -> B:19:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object getAllPollsRecursively(live.hms.video.polls.models.HmsPollState r7, int r8, java.lang.String r9, java.util.List<live.hms.video.sdk.models.HMSNotifications.StartedPolls> r10, q83.InterfaceC30057d<? super java.util.List<live.hms.video.sdk.models.HMSNotifications.StartedPolls>> r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof live.hms.video.interactivity.HmsInteractivityCenter.C241561
            if (r0 == 0) goto L13
            r0 = r11
            live.hms.video.interactivity.HmsInteractivityCenter$getAllPollsRecursively$1 r0 = (live.hms.video.interactivity.HmsInteractivityCenter.C241561) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            live.hms.video.interactivity.HmsInteractivityCenter$getAllPollsRecursively$1 r0 = new live.hms.video.interactivity.HmsInteractivityCenter$getAllPollsRecursively$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r7 = r0.L$2
            live.hms.video.interactivity.HmsInteractivityCenter r7 = (live.hms.video.interactivity.HmsInteractivityCenter) r7
            java.lang.Object r8 = r0.L$1
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.L$0
            live.hms.video.polls.models.HmsPollState r9 = (live.hms.video.polls.models.HmsPollState) r9
            p505ts.AbstractC34132o.m107864I(r11)
            goto L5d
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            p505ts.AbstractC34132o.m107864I(r11)
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
        L43:
            c93.n r2 = r7.pollGetList
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r9)
            r0.L$0 = r8
            r0.L$1 = r11
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r9 = r2.invoke(r8, r4, r10, r0)
            if (r9 != r1) goto L59
            return r1
        L59:
            r5 = r9
            r9 = r8
            r8 = r11
            r11 = r5
        L5d:
            live.hms.video.polls.network.PollListResponse r11 = (live.hms.video.polls.network.PollListResponse) r11
            java.util.List r10 = r11.getPolls()
            java.lang.Object r10 = m83.AbstractC25265s.m74114R0(r10)
            live.hms.video.sdk.models.HMSNotifications$StartedPolls r10 = (live.hms.video.sdk.models.HMSNotifications.StartedPolls) r10
            if (r10 == 0) goto L70
            java.lang.String r10 = r10.getPollId()
            goto L71
        L70:
            r10 = 0
        L71:
            java.lang.String r2 = r11.getLast()
            int r2 = r2.length()
            if (r2 != 0) goto L88
            java.util.Collection r8 = (java.util.Collection) r8
            java.util.List r7 = r11.getPolls()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r7 = m83.AbstractC25265s.m74129g1(r8, r7)
            return r7
        L88:
            if (r10 == 0) goto L9c
            java.util.Collection r8 = (java.util.Collection) r8
            java.util.List r11 = r11.getPolls()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r11 = m83.AbstractC25265s.m74129g1(r8, r11)
            r8 = 50
            r5 = r9
            r9 = r8
            r8 = r5
            goto L43
        L9c:
            java.util.Collection r8 = (java.util.Collection) r8
            java.util.List r7 = r11.getPolls()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r7 = m83.AbstractC25265s.m74129g1(r8, r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: live.hms.video.interactivity.HmsInteractivityCenter.getAllPollsRecursively(live.hms.video.polls.models.HmsPollState, int, java.lang.String, java.util.List, q83.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getAllPollsRecursively$default(HmsInteractivityCenter hmsInteractivityCenter, HmsPollState hmsPollState, int i13, String str, List list, InterfaceC30057d interfaceC30057d, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            list = C25271y.f99162w;
        }
        return hmsInteractivityCenter.getAllPollsRecursively(hmsPollState, i13, str, list, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HMSParams.Options getCreateOptionsWithDefaults(HMSParams.Options createOptions) {
        String strM73376i;
        List<String> admin;
        List<String> writer;
        List<String> reader;
        List<String> writer2;
        List<String> reader2;
        List<String> admin2;
        HMSNotifications.Whiteboard whiteboard;
        HMSNotifications.Plugins plugins = this.sdkStore.getPlugins();
        HMSNotifications.WhiteboardPermissions permissions = (plugins == null || (whiteboard = plugins.getWhiteboard()) == null) ? null : whiteboard.getPermissions();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        List<String> admin3 = permissions != null ? permissions.getAdmin() : null;
        List list = C25271y.f99162w;
        if (admin3 != null && !admin3.isEmpty()) {
            List listM74093D1 = (permissions == null || (admin2 = permissions.getAdmin()) == null) ? null : AbstractC25265s.m74093D1(admin2);
            if (listM74093D1 == null) {
                listM74093D1 = list;
            }
            arrayList3.addAll(listM74093D1);
        }
        List<String> reader3 = permissions != null ? permissions.getReader() : null;
        if (reader3 != null && !reader3.isEmpty()) {
            List listM74093D2 = (permissions == null || (reader2 = permissions.getReader()) == null) ? null : AbstractC25265s.m74093D1(reader2);
            if (listM74093D2 == null) {
                listM74093D2 = list;
            }
            arrayList.addAll(listM74093D2);
        }
        List<String> writer3 = permissions != null ? permissions.getWriter() : null;
        if (writer3 != null && !writer3.isEmpty()) {
            List listM74093D3 = (permissions == null || (writer2 = permissions.getWriter()) == null) ? null : AbstractC25265s.m74093D1(writer2);
            if (listM74093D3 != null) {
                list = listM74093D3;
            }
            arrayList2.addAll(list);
        }
        String id4 = createOptions != null ? createOptions.getId() : null;
        if (createOptions == null || (strM73376i = createOptions.getTitle()) == null) {
            StringBuilder sb4 = new StringBuilder();
            HMSRoom hMSRoom = this.sdkStore.get_room();
            strM73376i = AbstractC25012a.m73376i(hMSRoom != null ? hMSRoom.getRoomId() : null, " Whiteboard", sb4);
        }
        return new HMSParams.Options(id4, strM73376i, (createOptions == null || (reader = createOptions.getReader()) == null) ? arrayList : reader, (createOptions == null || (writer = createOptions.getWriter()) == null) ? arrayList2 : writer, (createOptions == null || (admin = createOptions.getAdmin()) == null) ? arrayList3 : admin, false, 32, null);
    }

    public static /* synthetic */ HMSParams.Options getCreateOptionsWithDefaults$default(HmsInteractivityCenter hmsInteractivityCenter, HMSParams.Options options, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            options = null;
        }
        return hmsInteractivityCenter.getCreateOptionsWithDefaults(options);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getParams(HMSPollBuilder hMSPollBuilder, InterfaceC30057d<? super HMSParams.SetPollParams> interfaceC30057d) {
        String pollId = hMSPollBuilder.getPollId();
        String title = hMSPollBuilder.getTitle();
        if (title == null) {
            title = AbstractC11895b.m31995n("toString(...)");
        }
        return new HMSParams.SetPollParams(new HmsPollCreationParams(pollId, title, hMSPollBuilder.getDuration(), hMSPollBuilder.getAnonymous(), false, false, hMSPollBuilder.getMode(), hMSPollBuilder.getRolesThatCanVote(), hMSPollBuilder.getRolesThatCanViewResponses(), hMSPollBuilder.getCategory()));
    }

    public static /* synthetic */ void getResponses$default(HmsInteractivityCenter hmsInteractivityCenter, HmsPoll hmsPoll, int i13, int i14, boolean z4, HmsTypedActionResultListener hmsTypedActionResultListener, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            i13 = 0;
        }
        int i16 = i13;
        if ((i15 & 4) != 0) {
            i14 = 50;
        }
        hmsInteractivityCenter.getResponses(hmsPoll, i16, i14, z4, hmsTypedActionResultListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T, R> void runNetworkOperationSafely(T data, InterfaceC4351m op3, HMSActionResultListener completion) {
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C241601(op3, data, completion, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void throwErrorIfNotConnected() throws HMSException {
        TransportState transportState = (TransportState) this.getTransportState.invoke();
        if (transportState == TransportState.Failed || transportState == TransportState.Disconnected) {
            throw ErrorFactory.GenericErrors.NotConnected$default(ErrorFactory.GenericErrors.INSTANCE, ErrorFactory.Action.NONE, "User not joined.", null, null, 12, null);
        }
    }

    public static /* synthetic */ void updatePollStats$lib_release$default(HmsInteractivityCenter hmsInteractivityCenter, List list, Long l7, Long l12, Long l13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            l7 = null;
        }
        if ((i13 & 4) != 0) {
            l12 = null;
        }
        if ((i13 & 8) != 0) {
            l13 = null;
        }
        hmsInteractivityCenter.updatePollStats$lib_release(list, l7, l12, l13);
    }

    public final void add(final HMSPollResponseBuilder response, final HmsTypedActionResultListener<PollAnswerResponse> completion) {
        AbstractC22676k.m65750j(response, "response");
        AbstractC22676k.m65750j(completion, "completion");
        try {
            throwErrorIfNotConnected();
            runNetworkOperationSafely(response, this.sendAnswers, new HmsTypedActionResultListener<PollAnswerResponse>() { // from class: live.hms.video.interactivity.HmsInteractivityCenter$add$update$1
                @Override // live.hms.video.sdk.IErrorListener
                public void onError(HMSException error) {
                    AbstractC22676k.m65750j(error, "error");
                    completion.onError(error);
                }

                @Override // live.hms.video.sdk.HmsTypedActionResultListener
                public void onSuccess(PollAnswerResponse result) {
                    Object next;
                    Object next2;
                    List<HmsPollAnswer> myResponses;
                    AbstractC22676k.m65750j(result, "result");
                    List list = this.this$0._polls;
                    HMSPollResponseBuilder hMSPollResponseBuilder = response;
                    Iterator it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!AbstractC22676k.m65745e(((HmsPoll) next).getPollId(), hMSPollResponseBuilder.getHmsPoll().getPollId()));
                    HmsPoll hmsPoll = (HmsPoll) next;
                    List<HMSPollQuestion> questions = hmsPoll != null ? hmsPoll.getQuestions() : null;
                    if (questions != null) {
                        for (HmsPollAnswer hmsPollAnswer : response.getAllAnswers$lib_release()) {
                            Iterator<T> it3 = questions.iterator();
                            do {
                                if (!it3.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it3.next();
                            } while (((HMSPollQuestion) next2).getQuestionID() != hmsPollAnswer.getQuestionId());
                            HMSPollQuestion hMSPollQuestion = (HMSPollQuestion) next2;
                            if (hMSPollQuestion != null && (myResponses = hMSPollQuestion.getMyResponses()) != null) {
                                myResponses.add(hmsPollAnswer);
                            }
                        }
                    }
                    completion.onSuccess(result);
                }
            });
        } catch (HMSException e5) {
            completion.onError(e5);
        }
    }

    public final void close$lib_release() {
        this._polls.clear();
        this.currentWhiteBoard = null;
        this.localWhiteBoardstart = false;
    }

    public final void fetchLeaderboard(String pollId, long count, long startIndex, boolean includeCurrentPeer, HmsTypedActionResultListener<PollLeaderboardResponse> completion) {
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(completion, "completion");
        runNetworkOperationSafely(new HMSParams.PollLeaderboardQuery(pollId, null, count, startIndex, includeCurrentPeer, null, 34, null), this.getLeaderboard, completion);
    }

    public final void fetchPollList(HmsPollState pollState, HmsTypedActionResultListener<List<HmsPoll>> completion) {
        AbstractC22676k.m65750j(pollState, "pollState");
        AbstractC22676k.m65750j(completion, "completion");
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C241541(pollState, completion, false, null), 3);
    }

    public final void fetchPollQuestions(HmsPoll poll, HmsTypedActionResultListener<List<HMSPollQuestion>> completion) {
        AbstractC22676k.m65750j(poll, "poll");
        AbstractC22676k.m65750j(completion, "completion");
        try {
            throwErrorIfNotConnected();
            AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C241551(poll, completion, null), 3);
        } catch (HMSException e5) {
            completion.onError(e5);
        }
    }

    public final State getCurrentWhiteBoardState() {
        return this.currentWhiteBoardState;
    }

    /* JADX INFO: renamed from: getLocalWhiteBoardstart$lib_release, reason: from getter */
    public final boolean getLocalWhiteBoardstart() {
        return this.localWhiteBoardstart;
    }

    public final void getPollResults(HmsPoll poll, HmsTypedActionResultListener<HmsPoll> completion) {
        AbstractC22676k.m65750j(poll, "poll");
        AbstractC22676k.m65750j(completion, "completion");
        try {
            throwErrorIfNotConnected();
            runNetworkOperationSafely(poll.getPollId(), new C241571(null), completion);
        } catch (HMSException e5) {
            completion.onError(e5);
        }
    }

    public final HmsPollUpdateListener getPollUpdateListener() {
        return this.pollUpdateListener;
    }

    public final List<HmsPoll> getPolls() {
        return this.polls;
    }

    public final void getResponses(HmsPoll poll, int offset, int count, boolean ownResponsesOnly, HmsTypedActionResultListener<List<HMSPollQuestionResponse>> completion) {
        AbstractC22676k.m65750j(poll, "poll");
        AbstractC22676k.m65750j(completion, "completion");
        try {
            throwErrorIfNotConnected();
            runNetworkOperationSafely(new HMSParams.PollResponsesQuery(poll.getPollId(), ownResponsesOnly, offset, count, null, 16, null), new C241581(poll, null), completion);
        } catch (HMSException e5) {
            completion.onError(e5);
        }
    }

    @SuppressLint({"SuspiciousIndentation"})
    public final void handleWhiteBoardStateNotification$lib_release(HMSNotifications.WhiteboardInfo params) {
        AbstractC22676k.m65750j(params, "params");
        String owner = params.getOwner();
        HMSLocalPeer localPeer = this.sdkStore.getLocalPeer();
        boolean zM65745e = AbstractC22676k.m65745e(owner, localPeer != null ? localPeer.getCustomerUserID() : null);
        boolean zM65745e2 = AbstractC22676k.m65745e(params.getState(), ProfileAnalyticsKt.OPEN);
        StringBuilder sb4 = new StringBuilder("handleWhiteBoardStateNotification>state=");
        sb4.append(params.getState());
        sb4.append(" owner ");
        sb4.append(zM65745e);
        sb4.append(" params owner ID ");
        String id4 = params.getId();
        if (id4 == null) {
            id4 = "";
        }
        sb4.append(id4);
        Log.d("XYZ", sb4.toString());
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new HmsInteractivityCenter$handleWhiteBoardStateNotification$1(params, this, zM65745e2, zM65745e, null), 3);
    }

    public final void quickStartPoll(HMSPollBuilder poll, HMSActionResultListener completion) {
        AbstractC22676k.m65750j(poll, "poll");
        AbstractC22676k.m65750j(completion, "completion");
        try {
            throwErrorIfNotConnected();
            AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C241591(completion, this, poll, null), 3);
        } catch (HMSException e5) {
            completion.onError(e5);
        }
    }

    public final void removeWhiteboardUpdateListener(HMSWhiteboardUpdateListener whiteBoardUpdateListener) {
        setWhiteboardUpdateListener(null);
    }

    public final void setCurrentWhiteBoardState(State state) {
        AbstractC22676k.m65750j(state, "<set-?>");
        this.currentWhiteBoardState = state;
    }

    public final void setLocalWhiteBoardstart$lib_release(boolean z4) {
        this.localWhiteBoardstart = z4;
    }

    public final void setPollUpdateListener(HmsPollUpdateListener hmsPollUpdateListener) {
        this.pollUpdateListener = hmsPollUpdateListener;
    }

    public final void setWhiteboardUpdateListener(HMSWhiteboardUpdateListener whiteBoardUpdateListener) {
        this.whiteBoardUpdateListener = whiteBoardUpdateListener;
    }

    public final void startWhiteboard(String title, HMSActionResultListener completion) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(completion, "completion");
        C22669g0 c22669g0 = new C22669g0();
        c22669g0.f89336w = "";
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C241621(completion, c22669g0, title, null), 3);
    }

    public final void stop(HmsPoll poll, HMSActionResultListener completion) {
        AbstractC22676k.m65750j(poll, "poll");
        AbstractC22676k.m65750j(completion, "completion");
        try {
            throwErrorIfNotConnected();
            runNetworkOperationSafely(poll.getPollId(), this.stopPoll, completion);
        } catch (HMSException e5) {
            completion.onError(e5);
        }
    }

    public final void stopWhiteboard(HMSActionResultListener completion) {
        AbstractC22676k.m65750j(completion, "completion");
        if (this.currentWhiteBoard == null) {
            completion.onError(ErrorFactory.GenericErrors.Unknown$default(ErrorFactory.GenericErrors.INSTANCE, ErrorFactory.Action.WHITEBOARD, "No current opened whiteboard", null, null, 8, null));
        }
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C241631(completion, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0092  */
    /* JADX WARN: Code duplicated, block: B:43:0x0098  */
    /* JADX WARN: Code duplicated, block: B:45:0x009e  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00be  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c5  */
    public final void updatePollStats$lib_release(List<HMSNotifications.PollStats> pollUpdate, Long totalResponses, Long votingUsers, Long totalDistinctUsers) {
        Object next;
        Long totalDistinctUsers2;
        Long votingUsers2;
        Long totalResponses2;
        PollResultsDisplay pollResultsDisplay;
        PollResultsDisplay result;
        PollResultsDisplay result2;
        PollResultsDisplay result3;
        HMSPollQuestion hMSPollQuestion;
        List<HMSPollQuestionOption> options;
        Object next2;
        Long totalDistinctUsers3;
        Long votingUsers3;
        Long totalResponses3;
        AbstractC22676k.m65750j(pollUpdate, "pollUpdate");
        for (HMSNotifications.PollStats pollStats : pollUpdate) {
            Iterator<T> it = this._polls.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC22676k.m65745e(((HmsPoll) next).getPollId(), pollStats.getPollId()));
            HmsPoll hmsPoll = (HmsPoll) next;
            if (hmsPoll == null || AbstractC22676k.m65745e(hmsPoll.getQuestions(), pollStats.getQuestions())) {
                return;
            }
            PollResultsDisplay result4 = hmsPoll.getResult();
            if (result4 != null) {
                List<PollStatsQuestions> questions = pollStats.getQuestions();
                if (totalDistinctUsers == null) {
                    PollResultsDisplay result5 = hmsPoll.getResult();
                    totalDistinctUsers3 = result5 != null ? result5.getTotalDistinctUsers() : null;
                } else {
                    totalDistinctUsers3 = totalDistinctUsers;
                }
                if (votingUsers == null) {
                    PollResultsDisplay result6 = hmsPoll.getResult();
                    votingUsers3 = result6 != null ? result6.getVotingUsers() : null;
                } else {
                    votingUsers3 = votingUsers;
                }
                if (totalResponses == null) {
                    PollResultsDisplay result7 = hmsPoll.getResult();
                    totalResponses3 = result7 != null ? result7.getTotalResponses() : null;
                } else {
                    totalResponses3 = totalResponses;
                }
                pollResultsDisplay = result4.copy(totalResponses3, votingUsers3, totalDistinctUsers3, questions);
                if (pollResultsDisplay == null) {
                    List<PollStatsQuestions> questions2 = pollStats.getQuestions();
                    if (totalDistinctUsers == null) {
                        result3 = hmsPoll.getResult();
                        if (result3 != null) {
                            totalDistinctUsers2 = result3.getTotalDistinctUsers();
                        } else {
                            totalDistinctUsers2 = null;
                        }
                    } else {
                        totalDistinctUsers2 = totalDistinctUsers;
                    }
                    if (votingUsers == null) {
                        result2 = hmsPoll.getResult();
                        if (result2 != null) {
                            votingUsers2 = result2.getVotingUsers();
                        } else {
                            votingUsers2 = null;
                        }
                    } else {
                        votingUsers2 = votingUsers;
                    }
                    if (totalResponses == null) {
                        result = hmsPoll.getResult();
                        if (result != null) {
                            totalResponses2 = result.getTotalResponses();
                        } else {
                            totalResponses2 = null;
                        }
                    } else {
                        totalResponses2 = totalResponses;
                    }
                    pollResultsDisplay = new PollResultsDisplay(totalResponses2, votingUsers2, totalDistinctUsers2, questions2);
                }
            } else {
                List<PollStatsQuestions> questions3 = pollStats.getQuestions();
                if (totalDistinctUsers == null) {
                    result3 = hmsPoll.getResult();
                    if (result3 != null) {
                        totalDistinctUsers2 = result3.getTotalDistinctUsers();
                    } else {
                        totalDistinctUsers2 = null;
                    }
                } else {
                    totalDistinctUsers2 = totalDistinctUsers;
                }
                if (votingUsers == null) {
                    result2 = hmsPoll.getResult();
                    if (result2 != null) {
                        votingUsers2 = result2.getVotingUsers();
                    } else {
                        votingUsers2 = null;
                    }
                } else {
                    votingUsers2 = votingUsers;
                }
                if (totalResponses == null) {
                    result = hmsPoll.getResult();
                    if (result != null) {
                        totalResponses2 = result.getTotalResponses();
                    } else {
                        totalResponses2 = null;
                    }
                } else {
                    totalResponses2 = totalResponses;
                }
                pollResultsDisplay = new PollResultsDisplay(totalResponses2, votingUsers2, totalDistinctUsers2, questions3);
            }
            hmsPoll.setResult(pollResultsDisplay);
            for (PollStatsQuestions pollStatsQuestions : pollStats.getQuestions()) {
                List<HMSPollQuestion> questions4 = hmsPoll.getQuestions();
                if (questions4 != null) {
                    Iterator<T> it3 = questions4.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                    } while (((HMSPollQuestion) next2).getQuestionID() != pollStatsQuestions.getIndex());
                    hMSPollQuestion = (HMSPollQuestion) next2;
                } else {
                    hMSPollQuestion = null;
                }
                if (hMSPollQuestion != null) {
                    hMSPollQuestion.setTotal$lib_release(pollStatsQuestions.getAttemptedTimes());
                }
                if (hMSPollQuestion != null && (options = hMSPollQuestion.getOptions()) != null) {
                    int i13 = 0;
                    for (Object obj : options) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        HMSPollQuestionOption hMSPollQuestionOption = (HMSPollQuestionOption) obj;
                        List<Long> options2 = pollStatsQuestions.getOptions();
                        Integer numValueOf = options2 != null ? Integer.valueOf(options2.size()) : null;
                        hMSPollQuestionOption.setVoteCount((numValueOf == null || numValueOf.intValue() <= i13) ? 0L : pollStatsQuestions.getOptions().get(i13).longValue());
                        i13 = i14;
                    }
                }
            }
            HmsPollUpdateListener hmsPollUpdateListener = this.pollUpdateListener;
            if (hmsPollUpdateListener != null) {
                hmsPollUpdateListener.onPollUpdate(hmsPoll, HMSPollUpdateType.resultsupdated);
            }
        }
    }

    public final void updatePollsList$lib_release(List<HmsPoll> polls) {
        AbstractC22676k.m65750j(polls, "polls");
        List<HmsPoll> list = this._polls;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((HmsPoll) it.next()).getPollId());
        }
        Set setM74103I1 = AbstractC25265s.m74103I1(arrayList);
        List<HmsPoll> list2 = this._polls;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : polls) {
            if (!setM74103I1.contains(((HmsPoll) obj).getPollId())) {
                arrayList2.add(obj);
            }
        }
        list2.addAll(arrayList2);
    }

    public final void updatePollsStopped$lib_release(List<HMSNotifications.StoppedPolls> polls) {
        Object next;
        AbstractC22676k.m65750j(polls, "polls");
        for (HmsPoll hmsPoll : this._polls) {
            Iterator<T> it = polls.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC22676k.m65745e(((HMSNotifications.StoppedPolls) next).getPollId(), hmsPoll.getPollId()));
            HMSNotifications.StoppedPolls stoppedPolls = (HMSNotifications.StoppedPolls) next;
            if (stoppedPolls != null) {
                hmsPoll.setStoppedAt(Long.valueOf(stoppedPolls.getStoppedAt()));
                hmsPoll.set_stoppedBy$lib_release(stoppedPolls.getStoppedBy());
                hmsPoll.setDuration(Long.valueOf(stoppedPolls.getDuration()));
                hmsPoll.set_state$lib_release(HmsPollState.STOPPED);
                HmsPollUpdateListener hmsPollUpdateListener = this.pollUpdateListener;
                if (hmsPollUpdateListener != null) {
                    hmsPollUpdateListener.onPollUpdate(hmsPoll, HMSPollUpdateType.stopped);
                }
            }
        }
    }

    private final <T, R> void runNetworkOperationSafely(T data, InterfaceC4351m op3, HmsTypedActionResultListener<R> completion) {
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C241612(op3, data, completion, null), 3);
    }
}
