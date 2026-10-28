package rw2;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import c93.InterfaceC4351m;
import com.whoop.analytics.MetricEventModel;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.ActionErrorResponse;
import com.whoop.whoopaction.domain.models.CacheControlModel;
import com.whoop.whoopaction.domain.models.DynamicSuccessResponse;
import com.whoop.whoopaction.domain.models.MediaCaps;
import com.whoop.whoopaction.domain.models.Request;
import com.whoop.whoopaction.domain.models.RequestExtensionsKt;
import com.whoop.whoopaction.domain.models.UpdateAction;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import f63.AbstractC14155c;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import l83.C23454a0;
import l83.C23471q;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import m83.AbstractC25247g0;
import m83.C25271y;
import org.joda.time.DateTimeConstants;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import qw2.AbstractC30694b;
import qw2.InterfaceC30693a;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import tw2.C34225b;
import tw2.InterfaceC34226c;
import u02.C34387c;
import u02.InterfaceC34385a;
import u82.AbstractC34650k;
import w02.C36684a;
import xm0.C38458b;
import yb3.AbstractC39397a;
import z02.InterfaceC39944a;

/* JADX INFO: renamed from: rw2.h */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 Q2\u00020\u0001:\u0002?=B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0016\u0010\u0014J#\u0010\u001b\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010 \u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001f0\u001e\u0018\u00010\u001d*\u00020\u0010H\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u0004\u0018\u00010\u0017*\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J$\u0010'\u001a\u00020\u00122\n\u0010&\u001a\u0006\u0012\u0002\b\u00030%2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b'\u0010(J\u0018\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0082@¢\u0006\u0004\b,\u0010-J\u0019\u0010/\u001a\u0004\u0018\u00010+2\u0006\u0010.\u001a\u00020\u0017H\u0002¢\u0006\u0004\b/\u00100J\u0019\u00102\u001a\u0004\u0018\u0001012\u0006\u0010.\u001a\u00020\u0017H\u0002¢\u0006\u0004\b2\u00103J\u001e\u00106\u001a\u0002052\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00170\u001dH\u0082@¢\u0006\u0004\b6\u00107J\u0019\u00108\u001a\u0004\u0018\u00010\u00172\u0006\u0010.\u001a\u00020\u0017H\u0002¢\u0006\u0004\b8\u00109J#\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00120:2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:H\u0016¢\u0006\u0004\b=\u0010>R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010AR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR(\u0010P\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020L0K0J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\b?\u0010O¨\u0006R"}, m65681d2 = {"Lrw2/h;", "Lrw2/a;", "Lu02/c;", "apiClient", "Lw02/a;", "errorBodyParser", "Lxm0/b;", "cacheUpdater", "Ltw2/c;", "mediaPreparer", "Lad3/c;", "json", "Ltr2/n;", "logger", "<init>", "(Lu02/c;Lw02/a;Lxm0/b;Ltw2/c;Lad3/c;Ltr2/n;)V", "Lcom/whoop/whoopaction/domain/models/UpdateAction;", "action", "Lqw2/b;", "m", "(Lcom/whoop/whoopaction/domain/models/UpdateAction;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/whoopaction/domain/models/Request;", "i", "", "field", "", "bytes", "s", "(Lcom/whoop/whoopaction/domain/models/Request;Ljava/lang/String;[B)Lcom/whoop/whoopaction/domain/models/Request;", "", "Ll83/q;", "Ltw2/b;", "n", "(Lcom/whoop/whoopaction/domain/models/UpdateAction;)Ljava/util/List;", "Lkotlinx/serialization/json/JsonElement;", "r", "(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/String;", "Lu02/a$b;", "apiCall", "q", "(Lu02/a$b;Lcom/whoop/whoopaction/domain/models/UpdateAction;Lq83/d;)Ljava/lang/Object;", "Lf63/c;", "response", "Lrw2/h$b;", "k", "(Lf63/c;Lq83/d;)Ljava/lang/Object;", "body", "p", "(Ljava/lang/String;)Lrw2/h$b;", "Lcom/whoop/navigation/models/GenericInteraction;", "o", "(Ljava/lang/String;)Lcom/whoop/navigation/models/GenericInteraction;", "scopes", "Ll83/a0;", "l", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "j", "(Ljava/lang/String;)Ljava/lang/String;", "Lec3/l;", "Lqw2/a;", "upstream", "b", "(Lec3/l;)Lec3/l;", "a", "Lu02/c;", "Lw02/a;", "c", "Lxm0/b;", "d", "Ltw2/c;", "e", "Lad3/c;", "f", "Ltr2/n;", "", "Lj93/d;", "Lcom/whoop/whoopaction/domain/models/Action;", "g", "Ljava/util/Set;", "()Ljava/util/Set;", "actionTypes", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31878h implements InterfaceC31871a {

    /* JADX INFO: renamed from: h */
    private static final a f132309h = new a(null);

    /* JADX INFO: renamed from: i */
    public static final int f132310i = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C34387c apiClient;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C36684a errorBodyParser;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C38458b cacheUpdater;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34226c mediaPreparer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC0757c json;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Set<InterfaceC21461d> actionTypes;

    /* JADX INFO: renamed from: rw2.h$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lrw2/h$a;", "", "<init>", "()V", "", "JPEG_DATA_URI_PREFIX", "Ljava/lang/String;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: rw2.h$b */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0012B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lrw2/h$b;", "", "Lcom/whoop/navigation/models/GenericInteraction;", "genericInteraction", "", "", "cacheEvictions", "<init>", "(Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/models/GenericInteraction;", "c", "()Lcom/whoop/navigation/models/GenericInteraction;", "b", "Ljava/util/List;", "()Ljava/util/List;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: d */
        private static final b f132319d = new b(null, C25271y.f99162w);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final GenericInteraction genericInteraction;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<String> cacheEvictions;

        /* JADX INFO: renamed from: rw2.h$b$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lrw2/h$b$a;", "", "<init>", "()V", "Lrw2/h$b;", "EMPTY", "Lrw2/h$b;", "a", "()Lrw2/h$b;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final b m99118a() {
                return b.f132319d;
            }

            private Companion() {
            }
        }

        public b(GenericInteraction genericInteraction, List<String> cacheEvictions) {
            AbstractC22676k.m65750j(cacheEvictions, "cacheEvictions");
            this.genericInteraction = genericInteraction;
            this.cacheEvictions = cacheEvictions;
        }

        /* JADX INFO: renamed from: b */
        public final List<String> m99116b() {
            return this.cacheEvictions;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final GenericInteraction getGenericInteraction() {
            return this.genericInteraction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.genericInteraction, bVar.genericInteraction) && AbstractC22676k.m65745e(this.cacheEvictions, bVar.cacheEvictions);
        }

        public int hashCode() {
            GenericInteraction genericInteraction = this.genericInteraction;
            return this.cacheEvictions.hashCode() + ((genericInteraction == null ? 0 : genericInteraction.hashCode()) * 31);
        }

        public String toString() {
            return "ParsedSuccessResponse(genericInteraction=" + this.genericInteraction + ", cacheEvictions=" + this.cacheEvictions + ")";
        }
    }

    /* JADX INFO: renamed from: rw2.h$c */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whoopaction.domain.handlers.UpdateActionHandler", m100430f = "UpdateActionHandler.kt", m100431l = {119}, m100432m = "attachMedia", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f132322E;

        /* JADX INFO: renamed from: F */
        Object f132323F;

        /* JADX INFO: renamed from: G */
        Object f132324G;

        /* JADX INFO: renamed from: H */
        Object f132325H;

        /* JADX INFO: renamed from: I */
        Object f132326I;

        /* JADX INFO: renamed from: J */
        Object f132327J;

        /* JADX INFO: renamed from: K */
        Object f132328K;

        /* JADX INFO: renamed from: L */
        int f132329L;

        /* JADX INFO: renamed from: M */
        int f132330M;

        /* JADX INFO: renamed from: N */
        /* synthetic */ Object f132331N;

        /* JADX INFO: renamed from: P */
        int f132333P;

        /* JADX INFO: renamed from: w */
        Object f132334w;

        /* JADX INFO: renamed from: x */
        Object f132335x;

        /* JADX INFO: renamed from: y */
        Object f132336y;

        /* JADX INFO: renamed from: z */
        Object f132337z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f132331N = obj;
            this.f132333P |= Integer.MIN_VALUE;
            return C31878h.this.m99104i(null, this);
        }
    }

    /* JADX INFO: renamed from: rw2.h$d */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whoopaction.domain.handlers.UpdateActionHandler", m100430f = "UpdateActionHandler.kt", m100431l = {DateTimeConstants.HOURS_PER_WEEK}, m100432m = "decodeSuccessResponse", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f132338w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f132339x;

        /* JADX INFO: renamed from: z */
        int f132341z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f132339x = obj;
            this.f132341z |= Integer.MIN_VALUE;
            return C31878h.this.m99106k(null, this);
        }
    }

    /* JADX INFO: renamed from: rw2.h$e */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whoopaction.domain.handlers.UpdateActionHandler", m100430f = "UpdateActionHandler.kt", m100431l = {195}, m100432m = "evictCacheScopes", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f132342E;

        /* JADX INFO: renamed from: F */
        int f132343F;

        /* JADX INFO: renamed from: G */
        int f132344G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f132345H;

        /* JADX INFO: renamed from: J */
        int f132347J;

        /* JADX INFO: renamed from: w */
        Object f132348w;

        /* JADX INFO: renamed from: x */
        Object f132349x;

        /* JADX INFO: renamed from: y */
        Object f132350y;

        /* JADX INFO: renamed from: z */
        Object f132351z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f132345H = obj;
            this.f132347J |= Integer.MIN_VALUE;
            return C31878h.this.m99107l(null, this);
        }
    }

    /* JADX INFO: renamed from: rw2.h$f */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whoopaction.domain.handlers.UpdateActionHandler", m100430f = "UpdateActionHandler.kt", m100431l = {71, HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE, 83, 108}, m100432m = "executeUpdateAction", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f132353F;

        /* JADX INFO: renamed from: w */
        Object f132354w;

        /* JADX INFO: renamed from: x */
        Object f132355x;

        /* JADX INFO: renamed from: y */
        Object f132356y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f132357z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f132357z = obj;
            this.f132353F |= Integer.MIN_VALUE;
            return C31878h.this.m99108m(null, this);
        }
    }

    /* JADX INFO: renamed from: rw2.h$g */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whoopaction.domain.handlers.UpdateActionHandler$executeUpdateAction$apiCall$1", m100430f = "UpdateActionHandler.kt", m100431l = {77, 78}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lrw2/h$b;", "<anonymous>", "()Lrw2/h$b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ UpdateAction f132358E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C31878h f132359F;

        /* JADX INFO: renamed from: w */
        Object f132360w;

        /* JADX INFO: renamed from: x */
        Object f132361x;

        /* JADX INFO: renamed from: y */
        int f132362y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Request f132363z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Request request, UpdateAction updateAction, C31878h c31878h, InterfaceC30057d<? super g> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f132363z = request;
            this.f132358E = updateAction;
            this.f132359F = c31878h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new g(this.f132363z, this.f132358E, this.f132359F, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f132362y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Request request = this.f132363z;
                MetricEventModel metricEvent = this.f132358E.getMetricEvent();
                InterfaceC39944a<String> actionApiRequest = RequestExtensionsKt.toActionApiRequest(request, metricEvent != null ? metricEvent.getRequestName() : null);
                C34387c c34387c = this.f132359F.apiClient;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(String.class);
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(AbstractC22671h0.f89337a.getOrCreateKotlinClass(String.class), interfaceC21456a0M65689b, AbstractC21478l0.m60396B(interfaceC21456a0M65689b));
                this.f132360w = null;
                this.f132362y = 1;
                obj = c34387c.m108748d(actionApiRequest, c32236aM44445Y, this);
                if (obj != enumC31071a) {
                }
            }
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C31878h c31878h = this.f132359F;
            this.f132360w = null;
            this.f132361x = null;
            this.f132362y = 2;
            Object objM99106k = c31878h.m99106k((AbstractC14155c) obj, this);
            return objM99106k == enumC31071a ? enumC31071a : objM99106k;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super b> interfaceC30057d) {
            return ((g) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: rw2.h$h */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whoopaction.domain.handlers.UpdateActionHandler$handleActions$1", m100430f = "UpdateActionHandler.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lqw2/a;", "domainAction", "Lec3/l;", "Lqw2/b;", "<anonymous>", "(Lqw2/a;)Lec3/l;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f132364w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f132365x;

        /* JADX INFO: renamed from: rw2.h$h$a */
        @InterfaceC32271e(m100429c = "com.whoop.whoopaction.domain.handlers.UpdateActionHandler$handleActions$1$1", m100430f = "UpdateActionHandler.kt", m100431l = {62, 63, 63}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lqw2/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ C31878h f132367E;

            /* JADX INFO: renamed from: w */
            Object f132368w;

            /* JADX INFO: renamed from: x */
            int f132369x;

            /* JADX INFO: renamed from: y */
            private /* synthetic */ Object f132370y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ UpdateAction f132371z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(UpdateAction updateAction, C31878h c31878h, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f132371z = updateAction;
                this.f132367E = c31878h;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f132371z, this.f132367E, interfaceC30057d);
                aVar.f132370y = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
            
                if (r0.emit(r8, r7) == r1) goto L20;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = r7.f132370y
                    ec3.m r0 = (ec3.InterfaceC13062m) r0
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r7.f132369x
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    r6 = 0
                    if (r2 == 0) goto L2c
                    if (r2 == r5) goto L28
                    if (r2 == r4) goto L20
                    if (r2 != r3) goto L18
                    p505ts.AbstractC34132o.m107864I(r8)
                    goto L5f
                L18:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L20:
                    java.lang.Object r0 = r7.f132368w
                    ec3.m r0 = (ec3.InterfaceC13062m) r0
                    p505ts.AbstractC34132o.m107864I(r8)
                    goto L52
                L28:
                    p505ts.AbstractC34132o.m107864I(r8)
                    goto L41
                L2c:
                    p505ts.AbstractC34132o.m107864I(r8)
                    qw2.b$i r8 = new qw2.b$i
                    com.whoop.whoopaction.domain.models.UpdateAction r2 = r7.f132371z
                    r8.<init>(r2)
                    r7.f132370y = r0
                    r7.f132369x = r5
                    java.lang.Object r8 = r0.emit(r8, r7)
                    if (r8 != r1) goto L41
                    goto L5e
                L41:
                    rw2.h r8 = r7.f132367E
                    com.whoop.whoopaction.domain.models.UpdateAction r2 = r7.f132371z
                    r7.f132370y = r6
                    r7.f132368w = r0
                    r7.f132369x = r4
                    java.lang.Object r8 = rw2.C31878h.m99101f(r8, r2, r7)
                    if (r8 != r1) goto L52
                    goto L5e
                L52:
                    r7.f132370y = r6
                    r7.f132368w = r6
                    r7.f132369x = r3
                    java.lang.Object r8 = r0.emit(r8, r7)
                    if (r8 != r1) goto L5f
                L5e:
                    return r1
                L5f:
                    l83.a0 r8 = l83.C23454a0.f92919a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: rw2.C31878h.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = C31878h.this.new h(interfaceC30057d);
            hVar.f132365x = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC30693a interfaceC30693a, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
            return ((h) create(interfaceC30693a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC30693a interfaceC30693a = (InterfaceC30693a) this.f132365x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f132364w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Action action = interfaceC30693a.getAction();
            AbstractC22676k.m65748h(action, "null cannot be cast to non-null type com.whoop.whoopaction.domain.models.UpdateAction");
            return new C13084s1(new a((UpdateAction) action, C31878h.this, null));
        }
    }

    /* JADX INFO: renamed from: rw2.h$i */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whoopaction.domain.handlers.UpdateActionHandler", m100430f = "UpdateActionHandler.kt", m100431l = {146}, m100432m = "resolveApiCallError", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f132372E;

        /* JADX INFO: renamed from: w */
        Object f132373w;

        /* JADX INFO: renamed from: x */
        Object f132374x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f132375y;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f132375y = obj;
            this.f132372E |= Integer.MIN_VALUE;
            return C31878h.this.m99112q(null, null, this);
        }
    }

    public C31878h(C34387c apiClient, C36684a errorBodyParser, C38458b cacheUpdater, InterfaceC34226c mediaPreparer, AbstractC0757c json, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(apiClient, "apiClient");
        AbstractC22676k.m65750j(errorBodyParser, "errorBodyParser");
        AbstractC22676k.m65750j(cacheUpdater, "cacheUpdater");
        AbstractC22676k.m65750j(mediaPreparer, "mediaPreparer");
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(logger, "logger");
        this.apiClient = apiClient;
        this.errorBodyParser = errorBodyParser;
        this.cacheUpdater = cacheUpdater;
        this.mediaPreparer = mediaPreparer;
        this.json = json;
        this.logger = logger;
        this.actionTypes = AbstractC12350b.m34570S(AbstractC22671h0.f89337a.getOrCreateKotlinClass(UpdateAction.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x0078  */
    /* JADX WARN: Code duplicated, block: B:22:0x00ae A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00ac -> B:23:0x00af). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: i */
    public final java.lang.Object m99104i(com.whoop.whoopaction.domain.models.UpdateAction r11, q83.InterfaceC30057d<? super com.whoop.whoopaction.domain.models.Request> r12) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rw2.C31878h.m99104i(com.whoop.whoopaction.domain.models.UpdateAction, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: j */
    private final String m99105j(String body) {
        try {
            return ((ActionErrorResponse) this.json.m1831b(ActionErrorResponse.INSTANCE.serializer(), body)).getErrorMessage();
        } catch (SerializationException e5) {
            this.logger.mo85228t(AbstractC11266d.m30461o("Response body is not an ActionErrorResponse: ", e5.getMessage()), new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m99106k(AbstractC14155c abstractC14155c, InterfaceC30057d<? super b> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f132341z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f132341z = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object objM60440k = dVar.f132339x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f132341z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM60440k);
                dVar.f132338w = null;
                dVar.f132341z = 1;
                objM60440k = AbstractC21478l0.m60440k(abstractC14155c, AbstractC39397a.f169546a, dVar);
                if (objM60440k == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM60440k);
            }
            b bVarM99111p = m99111p((String) objM60440k);
            return bVarM99111p == null ? b.INSTANCE.m99118a() : bVarM99111p;
        } catch (Exception e5) {
            this.logger.mo85228t(AbstractC11266d.m30461o("Failed to read response body for UpdateAction success decoding: ", e5.getMessage()), new AbstractC30556a.a[0]);
            return b.INSTANCE.m99118a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0076 -> B:19:0x004f). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: l */
    public final Object m99107l(List<String> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        e eVar;
        Iterator it;
        int i13;
        String str;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i14 = eVar.f132347J;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f132347J = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object obj = eVar.f132345H;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = eVar.f132347J;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            it = list.iterator();
            i13 = 0;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = eVar.f132343F;
            str = (String) eVar.f132342E;
            it = (Iterator) eVar.f132350y;
            try {
                AbstractC34132o.m107864I(obj);
            } catch (Exception e5) {
                this.logger.mo85230v(AbstractC11895b.m31996o("Failed to evict cache scope '", str, "' after UpdateAction success"), e5, new AbstractC30556a.a[0]);
            }
        }
        while (it.hasNext()) {
            str = (String) it.next();
            C38458b c38458b = this.cacheUpdater;
            eVar.f132348w = null;
            eVar.f132349x = null;
            eVar.f132350y = it;
            eVar.f132351z = null;
            eVar.f132342E = str;
            eVar.f132343F = i13;
            eVar.f132344G = 0;
            eVar.f132347J = 1;
            if (c38458b.m123247a(str, eVar) == enumC31071a) {
                return enumC31071a;
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00dd A[Catch: Exception -> 0x0072, TRY_LEAVE, TryCatch #1 {Exception -> 0x0072, blocks: (B:26:0x006d, B:47:0x00d6, B:49:0x00dd, B:67:0x0142, B:69:0x0146, B:75:0x015b, B:76:0x0160), top: B:85:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:55:0x0108 A[Catch: Exception -> 0x0047, TryCatch #0 {Exception -> 0x0047, blocks: (B:16:0x0042, B:73:0x0158, B:23:0x005f, B:53:0x00fa, B:55:0x0108, B:57:0x010e, B:59:0x0114, B:61:0x011e, B:63:0x0124, B:65:0x013c), top: B:84:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:57:0x010e A[Catch: Exception -> 0x0047, TryCatch #0 {Exception -> 0x0047, blocks: (B:16:0x0042, B:73:0x0158, B:23:0x005f, B:53:0x00fa, B:55:0x0108, B:57:0x010e, B:59:0x0114, B:61:0x011e, B:63:0x0124, B:65:0x013c), top: B:84:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0114 A[Catch: Exception -> 0x0047, TryCatch #0 {Exception -> 0x0047, blocks: (B:16:0x0042, B:73:0x0158, B:23:0x005f, B:53:0x00fa, B:55:0x0108, B:57:0x010e, B:59:0x0114, B:61:0x011e, B:63:0x0124, B:65:0x013c), top: B:84:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:61:0x011e A[Catch: Exception -> 0x0047, TryCatch #0 {Exception -> 0x0047, blocks: (B:16:0x0042, B:73:0x0158, B:23:0x005f, B:53:0x00fa, B:55:0x0108, B:57:0x010e, B:59:0x0114, B:61:0x011e, B:63:0x0124, B:65:0x013c), top: B:84:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0124 A[Catch: Exception -> 0x0047, TryCatch #0 {Exception -> 0x0047, blocks: (B:16:0x0042, B:73:0x0158, B:23:0x005f, B:53:0x00fa, B:55:0x0108, B:57:0x010e, B:59:0x0114, B:61:0x011e, B:63:0x0124, B:65:0x013c), top: B:84:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:65:0x013c A[Catch: Exception -> 0x0047, TRY_LEAVE, TryCatch #0 {Exception -> 0x0047, blocks: (B:16:0x0042, B:73:0x0158, B:23:0x005f, B:53:0x00fa, B:55:0x0108, B:57:0x010e, B:59:0x0114, B:61:0x011e, B:63:0x0124, B:65:0x013c), top: B:84:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0142 A[Catch: Exception -> 0x0072, TRY_ENTER, TryCatch #1 {Exception -> 0x0072, blocks: (B:26:0x006d, B:47:0x00d6, B:49:0x00dd, B:67:0x0142, B:69:0x0146, B:75:0x015b, B:76:0x0160), top: B:85:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0146 A[Catch: Exception -> 0x0072, TRY_LEAVE, TryCatch #1 {Exception -> 0x0072, blocks: (B:26:0x006d, B:47:0x00d6, B:49:0x00dd, B:67:0x0142, B:69:0x0146, B:75:0x015b, B:76:0x0160), top: B:85:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0157  */
    /* JADX WARN: Code duplicated, block: B:75:0x015b A[Catch: Exception -> 0x0072, TRY_ENTER, TryCatch #1 {Exception -> 0x0072, blocks: (B:26:0x006d, B:47:0x00d6, B:49:0x00dd, B:67:0x0142, B:69:0x0146, B:75:0x015b, B:76:0x0160), top: B:85:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0175  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009e, code lost:
    
        if (r2 == r3) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0, types: [rw2.h] */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.whoop.whoopaction.domain.models.Action, com.whoop.whoopaction.domain.models.UpdateAction] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.whoopaction.domain.models.Action] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.whoop.whoopaction.domain.models.UpdateAction, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [com.whoop.whoopaction.domain.models.UpdateAction] */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m99108m(com.whoop.whoopaction.domain.models.UpdateAction r23, q83.InterfaceC30057d<? super qw2.AbstractC30694b> r24) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rw2.C31878h.m99108m(com.whoop.whoopaction.domain.models.UpdateAction, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: n */
    private final List<C23471q> m99109n(UpdateAction updateAction) {
        JsonElement jsonElement;
        Map<String, MediaCaps> media = updateAction.getMedia();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, MediaCaps> entry : media.entrySet()) {
            String key = entry.getKey();
            MediaCaps value = entry.getValue();
            JsonElement body = updateAction.getRequest().getBody();
            C23471q c23471q = null;
            JsonObject jsonObject = body instanceof JsonObject ? (JsonObject) body : null;
            if (jsonObject != null && (jsonElement = (JsonElement) jsonObject.get((Object) key)) != null) {
                String strM99113r = m99113r(jsonElement);
                if (strM99113r == null) {
                    this.logger.mo85222m(AbstractC2875y.m8300m("Media field ", key, " holds a ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(jsonElement.getClass()).getSimpleName(), " rather than a URI, so the request was not sent"), new AbstractC30556a.a[0]);
                    return null;
                }
                c23471q = new C23471q(key, strM99113r, new C34225b(value.getMaxDimension(), value.getMaxBytes()));
            }
            if (c23471q != null) {
                arrayList.add(c23471q);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    private final GenericInteraction m99110o(String body) {
        b bVarM99111p = m99111p(body);
        if (bVarM99111p != null) {
            return bVarM99111p.getGenericInteraction();
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    private final b m99111p(String body) {
        if (body.length() == 0) {
            return b.INSTANCE.m99118a();
        }
        try {
            DynamicSuccessResponse dynamicSuccessResponse = (DynamicSuccessResponse) this.json.m1831b(DynamicSuccessResponse.INSTANCE.serializer(), body);
            GenericInteraction genericInteraction = dynamicSuccessResponse.getGenericInteraction();
            if (genericInteraction == null || genericInteraction.isEmpty()) {
                genericInteraction = null;
            }
            CacheControlModel cacheControl = dynamicSuccessResponse.getCacheControl();
            List<String> evictions = cacheControl != null ? cacheControl.getEvictions() : null;
            if (evictions == null) {
                evictions = C25271y.f99162w;
            }
            return new b(genericInteraction, evictions);
        } catch (SerializationException e5) {
            this.logger.mo85228t(AbstractC11266d.m30461o("Response body is not a DynamicSuccessResponse: ", e5.getMessage()), new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: q */
    public final Object m99112q(InterfaceC34385a.b<?> bVar, UpdateAction updateAction, InterfaceC30057d<? super AbstractC30694b> interfaceC30057d) {
        i iVar;
        if (interfaceC30057d instanceof i) {
            iVar = (i) interfaceC30057d;
            int i13 = iVar.f132372E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iVar.f132372E = i13 - Integer.MIN_VALUE;
            } else {
                iVar = new i(interfaceC30057d);
            }
        } else {
            iVar = new i(interfaceC30057d);
        }
        Object objM117758b = iVar.f132375y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = iVar.f132372E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM117758b);
            C36684a c36684a = this.errorBodyParser;
            Exception exception = bVar.getException();
            iVar.f132373w = bVar;
            iVar.f132374x = updateAction;
            iVar.f132372E = 1;
            objM117758b = c36684a.m117758b(exception, iVar);
            if (objM117758b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            updateAction = (UpdateAction) iVar.f132374x;
            bVar = (InterfaceC34385a.b) iVar.f132373w;
            AbstractC34132o.m107864I(objM117758b);
        }
        String str = (String) objM117758b;
        if (str != null) {
            GenericInteraction genericInteractionM99110o = m99110o(str);
            if (genericInteractionM99110o != null) {
                return new AbstractC30694b.b(genericInteractionM99110o, updateAction);
            }
            String strM99105j = m99105j(str);
            if (strM99105j != null) {
                return new AbstractC30694b.a(AbstractC11266d.m30461o("ApiCall failed: ", bVar.getErrorMessage()), updateAction, strM99105j);
            }
        }
        return new AbstractC30694b.a(AbstractC11266d.m30461o("ApiCall failed: ", bVar.getErrorMessage()), updateAction, null);
    }

    /* JADX INFO: renamed from: r */
    private final String m99113r(JsonElement jsonElement) {
        JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
        if (jsonPrimitive != null) {
            return AbstractC0770m.m1844f(jsonPrimitive);
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    private final Request m99114s(Request request, String str, byte[] bArr) {
        JsonElement body = request.getBody();
        JsonObject jsonObject = body instanceof JsonObject ? (JsonObject) body : null;
        if (jsonObject == null) {
            return request;
        }
        LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(jsonObject);
        linkedHashMapM74003l0.put(str, AbstractC0770m.m1841c("data:image/jpeg;base64," + Base64.getEncoder().encodeToString(bArr)));
        return Request.copy$default(request, null, null, new JsonObject(linkedHashMapM74003l0), null, 11, null);
    }

    @Override // rw2.InterfaceC31871a
    /* JADX INFO: renamed from: a */
    public Set<InterfaceC21461d> mo28414a() {
        return this.actionTypes;
    }

    @Override // rw2.InterfaceC31871a
    /* JADX INFO: renamed from: b */
    public InterfaceC13058l mo28415b(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36578D(new h(null), upstream);
    }

    @Override // rw2.InterfaceC31871a, od1.InterfaceC27844g
    public /* bridge */ InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return super.interact(interfaceC13058l);
    }

    public /* synthetic */ C31878h(C34387c c34387c, C36684a c36684a, C38458b c38458b, InterfaceC34226c interfaceC34226c, AbstractC0757c abstractC0757c, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c34387c, c36684a, c38458b, interfaceC34226c, (i13 & 16) != 0 ? AbstractC34650k.m109496c() : abstractC0757c, (i13 & 32) != 0 ? InterfaceC34116n.INSTANCE.m107848a("UpdateActionHandler") : interfaceC34116n);
    }
}
