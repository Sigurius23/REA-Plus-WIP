package es2;

import c13.AbstractC3855a;
import c93.InterfaceC4351m;
import com.whoop.navigation.C9598e;
import com.whoop.videocall.api.GetVideoCallContentRequest;
import com.whoop.videocall.api.VideoCallContentResponse;
import ec3.AbstractC13091v;
import ec3.C13052j1;
import ec3.C13054k;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fs2.EnumC14748a;
import fs2.InterfaceC14758k;
import fs2.InterfaceC14759l;
import ge3.AbstractC15751g;
import hs2.InterfaceC17607a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import l83.C23454a0;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pm0.AbstractC29355b;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: es2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001f\u001dB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\n*\b\u0012\u0004\u0012\u00020\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u000eJ#\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Les2/d;", "Lod1/g;", "Les2/b;", "Les2/c;", "Lnm0/e;", "cachedApiSource", "Lfs2/k;", "videoCallManager", "<init>", "(Lnm0/e;Lfs2/k;)V", "Lec3/l;", "upstream", "Les2/d$a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lec3/l;)Lec3/l;", "action", "Ll83/a0;", "k", "(Les2/d$a;Lq83/d;)Ljava/lang/Object;", "j", "", "callId", "Lpm0/a;", "Lcom/whoop/videocall/api/VideoCallContentResponse;", "i", "(Ljava/lang/String;)Lec3/l;", "g", "(Les2/c;Les2/d$a;)Les2/c;", "interact", "a", "Lnm0/e;", "b", "Lfs2/k;", "c", "Lec3/l;", "callFlow", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13594d implements InterfaceC27844g<AbstractC13592b, C13593c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC14758k videoCallManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC13058l callFlow;

    /* JADX INFO: renamed from: es2.d$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Les2/d$a;", "", "<init>", "()V", "a", "b", "c", "d", "Les2/d$a$a;", "Les2/d$a$b;", "Les2/d$a$c;", "Les2/d$a$d;", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: es2.d$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Les2/d$a$a;", "Les2/d$a;", "Lpm0/a;", "Lcom/whoop/videocall/api/VideoCallContentResponse;", "result", "<init>", "(Lpm0/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpm0/a;", "()Lpm0/a;", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C41565a extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final InterfaceC29354a<VideoCallContentResponse> result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41565a(InterfaceC29354a<VideoCallContentResponse> result) {
                super(null);
                AbstractC22676k.m65750j(result, "result");
                this.result = result;
            }

            /* JADX INFO: renamed from: a */
            public final InterfaceC29354a<VideoCallContentResponse> m38412a() {
                return this.result;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof C41565a) && AbstractC22676k.m65745e(this.result, ((C41565a) other).result);
            }

            public int hashCode() {
                return this.result.hashCode();
            }

            public String toString() {
                return "CachedResult(result=" + this.result + ")";
            }
        }

        /* JADX INFO: renamed from: es2.d$a$b */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Les2/d$a$b;", "Les2/d$a;", "Lfs2/l;", "videoCallState", "<init>", "(Lfs2/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfs2/l;", "()Lfs2/l;", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class b extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final InterfaceC14759l videoCallState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC14759l videoCallState) {
                super(null);
                AbstractC22676k.m65750j(videoCallState, "videoCallState");
                this.videoCallState = videoCallState;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final InterfaceC14759l getVideoCallState() {
                return this.videoCallState;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof b) && AbstractC22676k.m65745e(this.videoCallState, ((b) other).videoCallState);
            }

            public int hashCode() {
                return this.videoCallState.hashCode();
            }

            public String toString() {
                return "CallStateUpdated(videoCallState=" + this.videoCallState + ")";
            }
        }

        /* JADX INFO: renamed from: es2.d$a$c */
        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Les2/d$a$c;", "Les2/d$a;", "", "isDisabled", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class c extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final boolean isDisabled;

            public c(boolean z4) {
                super(null);
                this.isDisabled = z4;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getIsDisabled() {
                return this.isDisabled;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof c) && this.isDisabled == ((c) other).isDisabled;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isDisabled);
            }

            public String toString() {
                return AbstractC3855a.m11827k("PermissionsStateUpdated(isDisabled=", ")", this.isDisabled);
            }
        }

        /* JADX INFO: renamed from: es2.d$a$d */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Les2/d$a$d;", "Les2/d$a;", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class d extends a {

            /* JADX INFO: renamed from: b */
            public static final int f48004b = C9598e.f28134d;

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final C9598e destination;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(C9598e destination) {
                super(null);
                AbstractC22676k.m65750j(destination, "destination");
                this.destination = destination;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final C9598e getDestination() {
                return this.destination;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof d) && AbstractC22676k.m65745e(this.destination, ((d) other).destination);
            }

            public int hashCode() {
                return this.destination.hashCode();
            }

            public String toString() {
                return AbstractC33745d.m106650i("SetPendingDestination(destination=", this.destination, ")");
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: es2.d$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, m65681d2 = {"Les2/d$b;", "", "Les2/b;", "action", "", "callId", "<init>", "(Les2/b;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Les2/b;", "()Les2/b;", "b", "Ljava/lang/String;", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC13592b action;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String callId;

        public b(AbstractC13592b action, String str) {
            AbstractC22676k.m65750j(action, "action");
            this.action = action;
            this.callId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC13592b getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCallId() {
            return this.callId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.action, bVar.action) && AbstractC22676k.m65745e(this.callId, bVar.callId);
        }

        public int hashCode() {
            int iHashCode = this.action.hashCode() * 31;
            String str = this.callId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "RefreshAccumulator(action=" + this.action + ", callId=" + this.callId + ")";
        }
    }

    /* JADX INFO: renamed from: es2.d$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.videocall.domain.VideoCallInteractor$contentFlow$$inlined$flatMapLatest$1", m100430f = "VideoCallInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f48008w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f48009x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f48010y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C13594d f48011z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, C13594d c13594d) {
            super(3, interfaceC30057d);
            this.f48011z = c13594d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC13592b abstractC13592b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f48011z);
            cVar.f48009x = interfaceC13062m;
            cVar.f48010y = abstractC13592b;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c0456u;
            InterfaceC13058l c13084s1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f48008w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f48009x;
                AbstractC13592b abstractC13592b = (AbstractC13592b) this.f48010y;
                if (abstractC13592b instanceof AbstractC13592b.a) {
                    c13084s1 = new h(this.f48011z.m38409i(((AbstractC13592b.a) abstractC13592b).getCallId()));
                } else if (abstractC13592b instanceof AbstractC13592b.f) {
                    c13084s1 = C13054k.f45116w;
                } else if (abstractC13592b instanceof AbstractC13592b.b) {
                    c13084s1 = new C13084s1(this.f48011z.new d(null));
                } else if (abstractC13592b instanceof AbstractC13592b.d) {
                    c13084s1 = new C13084s1(this.f48011z.new e(null));
                } else {
                    if (abstractC13592b instanceof AbstractC13592b.c) {
                        c0456u = new C13084s1(new f(abstractC13592b, this.f48011z, null));
                    } else {
                        if (!(abstractC13592b instanceof AbstractC13592b.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c0456u = new C0456u(new a.c(((AbstractC13592b.e) abstractC13592b).getIsDisabled()), 1);
                    }
                    c13084s1 = c0456u;
                }
                this.f48009x = null;
                this.f48010y = null;
                this.f48008w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC13592b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: es2.d$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.videocall.domain.VideoCallInteractor$contentFlow$1$2", m100430f = "VideoCallInteractor.kt", m100431l = {67}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Les2/d$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f48012w;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C13594d.this.new d(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f48012w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC14758k interfaceC14758k = C13594d.this.videoCallManager;
                this.f48012w = 1;
                if (interfaceC14758k.mo42293d(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: es2.d$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.videocall.domain.VideoCallInteractor$contentFlow$1$3", m100430f = "VideoCallInteractor.kt", m100431l = {70}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Les2/d$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f48014w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f48015x;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = C13594d.this.new e(interfaceC30057d);
            eVar.f48015x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f48015x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f48014w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                a.b bVar = new a.b(InterfaceC14759l.f.f54672a);
                this.f48015x = null;
                this.f48014w = 1;
                if (interfaceC13062m.emit(bVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            C13594d.this.videoCallManager.mo42290a(EnumC14748a.USER_LEFT);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: es2.d$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.videocall.domain.VideoCallInteractor$contentFlow$1$4", m100430f = "VideoCallInteractor.kt", m100431l = {74, HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Les2/d$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f48017w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f48018x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC13592b f48019y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C13594d f48020z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AbstractC13592b abstractC13592b, C13594d c13594d, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f48019y = abstractC13592b;
            this.f48020z = c13594d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = new f(this.f48019y, this.f48020z, interfaceC30057d);
            fVar.f48018x = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            if (r0.emit(r6, r5) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f48018x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r5.f48017w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r6)
                goto L4e
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L3b
            L20:
                p505ts.AbstractC34132o.m107864I(r6)
                es2.d$a$d r6 = new es2.d$a$d
                es2.b r2 = r5.f48019y
                es2.b$c r2 = (es2.AbstractC13592b.c) r2
                com.whoop.navigation.e r2 = r2.getNavAction()
                r6.<init>(r2)
                r5.f48018x = r0
                r5.f48017w = r4
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L3b
                goto L4d
            L3b:
                es2.d$a$b r6 = new es2.d$a$b
                fs2.l$f r2 = fs2.InterfaceC14759l.f.f54672a
                r6.<init>(r2)
                r2 = 0
                r5.f48018x = r2
                r5.f48017w = r3
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L4e
            L4d:
                return r1
            L4e:
                es2.d r6 = r5.f48020z
                fs2.k r6 = es2.C13594d.m38405e(r6)
                fs2.a r0 = fs2.EnumC14748a.USER_LEFT
                r6.mo42290a(r0)
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: es2.C13594d.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: es2.d$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.videocall.domain.VideoCallInteractor$contentFlow$2", m100430f = "VideoCallInteractor.kt", m100431l = {83}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Les2/d$a;", "it", "Ll83/a0;", "<anonymous>", "(Les2/d$a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f48021w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f48022x;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = C13594d.this.new g(interfaceC30057d);
            gVar.f48022x = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a aVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(aVar, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            a aVar = (a) this.f48022x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f48021w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13594d c13594d = C13594d.this;
                this.f48022x = null;
                this.f48021w = 1;
                if (c13594d.m38411k(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: es2.d$h */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f48024w;

        /* JADX INFO: renamed from: es2.d$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f48025w;

            /* JADX INFO: renamed from: es2.d$h$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.videocall.domain.VideoCallInteractor$contentFlow$lambda$0$$inlined$map$1$2", m100430f = "VideoCallInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41566a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f48026E;

                /* JADX INFO: renamed from: F */
                Object f48027F;

                /* JADX INFO: renamed from: G */
                Object f48028G;

                /* JADX INFO: renamed from: H */
                int f48029H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f48030w;

                /* JADX INFO: renamed from: x */
                int f48031x;

                /* JADX INFO: renamed from: y */
                Object f48032y;

                public C41566a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f48030w = obj;
                    this.f48031x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f48025w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41566a c41566a;
                if (interfaceC30057d instanceof C41566a) {
                    c41566a = (C41566a) interfaceC30057d;
                    int i13 = c41566a.f48031x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41566a.f48031x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41566a = new C41566a(interfaceC30057d);
                    }
                } else {
                    c41566a = new C41566a(interfaceC30057d);
                }
                Object obj2 = c41566a.f48030w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41566a.f48031x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f48025w;
                    a.C41565a c41565a = new a.C41565a((InterfaceC29354a) obj);
                    c41566a.f48032y = null;
                    c41566a.f48026E = null;
                    c41566a.f48027F = null;
                    c41566a.f48028G = null;
                    c41566a.f48029H = 0;
                    c41566a.f48031x = 1;
                    if (interfaceC13062m.emit(c41565a, c41566a) == enumC31071a) {
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

        public h(InterfaceC13058l interfaceC13058l) {
            this.f48024w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f48024w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: es2.d$i */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.videocall.domain.VideoCallInteractor$fetchCachedData$$inlined$cacheAPI$1", m100430f = "VideoCallInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f48034w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f48035x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f48036y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f48037z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f48037z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            i iVar = new i(interfaceC30057d, this.f48037z);
            iVar.f48035x = interfaceC13062m;
            iVar.f48036y = c26832c;
            return iVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f48034w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f48035x;
                C26832c c26832c = (C26832c) this.f48036y;
                InterfaceC26834e interfaceC26834e = this.f48037z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(VideoCallContentResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(VideoCallContentResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f48035x = null;
                this.f48036y = null;
                this.f48034w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (C26832c<C23454a0>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: es2.d$j */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.videocall.domain.VideoCallInteractor$interact$1", m100430f = "VideoCallInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Les2/c;", "previousState", "Les2/d$a;", "internalAction", "<anonymous>", "(Les2/c;Les2/d$a;)Les2/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f48038w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f48039x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f48040y;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C13593c c13593c, a aVar, InterfaceC30057d<? super C13593c> interfaceC30057d) {
            j jVar = C13594d.this.new j(interfaceC30057d);
            jVar.f48039x = c13593c;
            jVar.f48040y = aVar;
            return jVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C13593c c13593c = (C13593c) this.f48039x;
            a aVar = (a) this.f48040y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f48038w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C13594d.this.m38407g(c13593c, aVar);
        }
    }

    /* JADX INFO: renamed from: es2.d$k */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f48042w;

        /* JADX INFO: renamed from: es2.d$k$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f48043w;

            /* JADX INFO: renamed from: es2.d$k$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.videocall.domain.VideoCallInteractor$saveParamsForRefresh$$inlined$map$1$2", m100430f = "VideoCallInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41567a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f48044E;

                /* JADX INFO: renamed from: F */
                Object f48045F;

                /* JADX INFO: renamed from: G */
                Object f48046G;

                /* JADX INFO: renamed from: H */
                int f48047H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f48048w;

                /* JADX INFO: renamed from: x */
                int f48049x;

                /* JADX INFO: renamed from: y */
                Object f48050y;

                public C41567a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f48048w = obj;
                    this.f48049x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f48043w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41567a c41567a;
                if (interfaceC30057d instanceof C41567a) {
                    c41567a = (C41567a) interfaceC30057d;
                    int i13 = c41567a.f48049x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41567a.f48049x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41567a = new C41567a(interfaceC30057d);
                    }
                } else {
                    c41567a = new C41567a(interfaceC30057d);
                }
                Object obj2 = c41567a.f48048w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41567a.f48049x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f48043w;
                    AbstractC13592b action = ((b) obj).getAction();
                    c41567a.f48050y = null;
                    c41567a.f48044E = null;
                    c41567a.f48045F = null;
                    c41567a.f48046G = null;
                    c41567a.f48047H = 0;
                    c41567a.f48049x = 1;
                    if (interfaceC13062m.emit(action, c41567a) == enumC31071a) {
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

        public k(InterfaceC13058l interfaceC13058l) {
            this.f48042w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f48042w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: es2.d$l */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.videocall.domain.VideoCallInteractor$saveParamsForRefresh$1", m100430f = "VideoCallInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Les2/d$b;", "acc", "Les2/b;", "domainAction", "<anonymous>", "(Les2/d$b;Les2/b;)Les2/d$b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class l extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f48052w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f48053x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f48054y;

        public l(InterfaceC30057d<? super l> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b bVar, AbstractC13592b abstractC13592b, InterfaceC30057d<? super b> interfaceC30057d) {
            l lVar = new l(interfaceC30057d);
            lVar.f48053x = bVar;
            lVar.f48054y = abstractC13592b;
            return lVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            b bVar = (b) this.f48053x;
            AbstractC13592b abstractC13592b = (AbstractC13592b) this.f48054y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f48052w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return new b((!(abstractC13592b instanceof AbstractC13592b.f) || bVar.getCallId() == null) ? abstractC13592b : new AbstractC13592b.a(bVar.getCallId()), abstractC13592b instanceof AbstractC13592b.a ? ((AbstractC13592b.a) abstractC13592b).getCallId() : bVar.getCallId());
        }
    }

    /* JADX INFO: renamed from: es2.d$m */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f48055w;

        /* JADX INFO: renamed from: es2.d$m$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f48056w;

            /* JADX INFO: renamed from: es2.d$m$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.videocall.domain.VideoCallInteractor$special$$inlined$map$1$2", m100430f = "VideoCallInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41568a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f48057E;

                /* JADX INFO: renamed from: F */
                Object f48058F;

                /* JADX INFO: renamed from: G */
                Object f48059G;

                /* JADX INFO: renamed from: H */
                int f48060H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f48061w;

                /* JADX INFO: renamed from: x */
                int f48062x;

                /* JADX INFO: renamed from: y */
                Object f48063y;

                public C41568a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f48061w = obj;
                    this.f48062x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f48056w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41568a c41568a;
                if (interfaceC30057d instanceof C41568a) {
                    c41568a = (C41568a) interfaceC30057d;
                    int i13 = c41568a.f48062x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41568a.f48062x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41568a = new C41568a(interfaceC30057d);
                    }
                } else {
                    c41568a = new C41568a(interfaceC30057d);
                }
                Object obj2 = c41568a.f48061w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41568a.f48062x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f48056w;
                    a.b bVar = new a.b((InterfaceC14759l) obj);
                    c41568a.f48063y = null;
                    c41568a.f48057E = null;
                    c41568a.f48058F = null;
                    c41568a.f48059G = null;
                    c41568a.f48060H = 0;
                    c41568a.f48062x = 1;
                    if (interfaceC13062m.emit(bVar, c41568a) == enumC31071a) {
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

        public m(InterfaceC13058l interfaceC13058l) {
            this.f48055w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f48055w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C13594d(InterfaceC26834e cachedApiSource, InterfaceC14758k videoCallManager) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(videoCallManager, "videoCallManager");
        this.cachedApiSource = cachedApiSource;
        this.videoCallManager = videoCallManager;
        this.callFlow = new m(videoCallManager.getCallStateFlow());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [es2.a] */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.whoop.navigation.e] */
    /* JADX INFO: renamed from: g */
    public final C13593c m38407g(C13593c c13593c, a aVar) {
        InterfaceC17607a aVar2;
        InterfaceC13591a interfaceC13591a;
        if (aVar instanceof a.C41565a) {
            ?? r10 = c13593c.getCallState() instanceof InterfaceC14759l.c ? InterfaceC13591a.c.f47982a : null;
            InterfaceC29354a<VideoCallContentResponse> interfaceC29354aM38412a = ((a.C41565a) aVar).m38412a();
            if (interfaceC29354aM38412a instanceof InterfaceC29354a.e) {
                return C13593c.m38395b(c13593c, InterfaceC13591a.b.f47981a, null, null, null, false, null, 62, null);
            }
            if (interfaceC29354aM38412a instanceof InterfaceC29354a.a.b) {
                return C13593c.m38395b(c13593c, r10, (VideoCallContentResponse) ((InterfaceC29354a.a.b) interfaceC29354aM38412a).getData(), null, null, false, null, 60, null);
            }
            if (interfaceC29354aM38412a instanceof InterfaceC29354a.a.C42173a) {
                return C13593c.m38395b(c13593c, r10, (VideoCallContentResponse) ((InterfaceC29354a.a.C42173a) interfaceC29354aM38412a).getData(), null, null, false, null, 60, null);
            }
            if (interfaceC29354aM38412a instanceof InterfaceC29354a.d) {
                return C13593c.m38395b(c13593c, r10, (VideoCallContentResponse) ((InterfaceC29354a.d) interfaceC29354aM38412a).getData(), null, null, false, null, 60, null);
            }
            if (interfaceC29354aM38412a instanceof InterfaceC29354a.c) {
                return C13593c.m38395b(c13593c, AbstractC29355b.m89462a((InterfaceC29354a.b) interfaceC29354aM38412a) ? InterfaceC13591a.d.f47983a : InterfaceC13591a.c.f47982a, null, null, null, false, null, 62, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(aVar instanceof a.b)) {
            if (aVar instanceof a.c) {
                return C13593c.m38395b(c13593c, null, null, null, null, !((a.c) aVar).getIsDisabled(), null, 47, null);
            }
            if (aVar instanceof a.d) {
                return C13593c.m38395b(c13593c, null, null, null, null, false, ((a.d) aVar).getDestination(), 31, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        a.b bVar = (a.b) aVar;
        boolean z4 = (bVar.getVideoCallState() instanceof InterfaceC14759l.b) && ((c13593c.getCallState() instanceof InterfaceC14759l.f) || (c13593c.getCallState() instanceof InterfaceC14759l.e) || (c13593c.getCallState() instanceof InterfaceC14759l.a));
        if (z4) {
            aVar2 = c13593c.getPendingDestination() != null ? new InterfaceC17607a.a(c13593c.getPendingDestination()) : InterfaceC17607a.b.f68219a;
        } else {
            aVar2 = null;
        }
        InterfaceC14759l videoCallState = bVar.getVideoCallState();
        InterfaceC14759l videoCallState2 = bVar.getVideoCallState();
        if (videoCallState2 instanceof InterfaceC14759l.f) {
            interfaceC13591a = InterfaceC13591a.b.f47981a;
        } else if (videoCallState2 instanceof InterfaceC14759l.c) {
            interfaceC13591a = InterfaceC13591a.c.f47982a;
        } else {
            if (!(videoCallState2 instanceof InterfaceC14759l.a) && !(videoCallState2 instanceof InterfaceC14759l.e) && !(videoCallState2 instanceof InterfaceC14759l.d) && !(videoCallState2 instanceof InterfaceC14759l.b)) {
                throw new NoWhenBranchMatchedException();
            }
            interfaceC13591a = null;
        }
        return C13593c.m38395b(c13593c, interfaceC13591a, null, videoCallState, aVar2, false, z4 ? null : c13593c.getPendingDestination(), 18, null);
    }

    /* JADX INFO: renamed from: h */
    private final InterfaceC13058l m38408h(InterfaceC13058l upstream) {
        return new C13052j1(AbstractC13091v.m36590P(m38410j(upstream), new c(null, this)), new g(null), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final InterfaceC13058l m38409i(String callId) {
        return AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetVideoCallContentRequest(callId), 1), AbstractC12350b.m34570S("video-call"), null, 2, null), new i(null, this.cachedApiSource));
    }

    /* JADX INFO: renamed from: j */
    private final InterfaceC13058l m38410j(InterfaceC13058l interfaceC13058l) {
        return new k(AbstractC13091v.m36612v(new C13060l1(new b(AbstractC13592b.f.f47990a, null), interfaceC13058l, new l(null)), 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final Object m38411k(a aVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo42291b;
        boolean z4 = aVar instanceof a.C41565a;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!z4) {
            return c23454a0;
        }
        InterfaceC29354a<VideoCallContentResponse> interfaceC29354aM38412a = ((a.C41565a) aVar).m38412a();
        return ((interfaceC29354aM38412a instanceof InterfaceC29354a.a.C42173a) && (objMo42291b = this.videoCallManager.mo42291b(((VideoCallContentResponse) ((InterfaceC29354a.a.C42173a) interfaceC29354aM38412a).getData()).getCallId(), interfaceC30057d)) == EnumC31071a.f128113w) ? objMo42291b : c23454a0;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36612v(new C13060l1(new C13593c(InterfaceC13591a.b.f47981a, null, null, null, false, null, 62, null), AbstractC13091v.m36584J(m38408h(upstream), this.callFlow), new j(null)), 1);
    }
}
