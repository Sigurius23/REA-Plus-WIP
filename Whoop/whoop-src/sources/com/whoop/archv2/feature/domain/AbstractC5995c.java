package com.whoop.archv2.feature.domain;

import com.whoop.design.models.modal.AnyModal;
import com.whoop.navigation.models.ApiRequest;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.ReloadAction;
import d13.AbstractC11478a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.whoop.archv2.feature.domain.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000e\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000e\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/c;", "", "<init>", "()V", "d", "n", "i", "j", "k", "l", "m", "c", "b", "a", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "f", "e", "Lcom/whoop/archv2/feature/domain/c$a;", "Lcom/whoop/archv2/feature/domain/c$b;", "Lcom/whoop/archv2/feature/domain/c$c;", "Lcom/whoop/archv2/feature/domain/c$d;", "Lcom/whoop/archv2/feature/domain/c$e;", "Lcom/whoop/archv2/feature/domain/c$f;", "Lcom/whoop/archv2/feature/domain/c$g;", "Lcom/whoop/archv2/feature/domain/c$h;", "Lcom/whoop/archv2/feature/domain/c$i;", "Lcom/whoop/archv2/feature/domain/c$j;", "Lcom/whoop/archv2/feature/domain/c$k;", "Lcom/whoop/archv2/feature/domain/c$l;", "Lcom/whoop/archv2/feature/domain/c$m;", "Lcom/whoop/archv2/feature/domain/c$n;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC5995c {

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.c$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/c$a;", "Lcom/whoop/archv2/feature/domain/c;", "<init>", "()V", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC5995c {

        /* JADX INFO: renamed from: a */
        public static final a f23693a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.c$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/c$b;", "Lcom/whoop/archv2/feature/domain/c;", "<init>", "()V", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC5995c {

        /* JADX INFO: renamed from: a */
        public static final b f23694a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.c$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/c$c;", "Lcom/whoop/archv2/feature/domain/c;", "<init>", "()V", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC5995c {

        /* JADX INFO: renamed from: a */
        public static final c f23695a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.c$d */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/c$d;", "Lcom/whoop/archv2/feature/domain/c;", "Lcom/whoop/navigation/models/ApiRequest;", "apiRequest", "Lcom/whoop/navigation/models/GenericInteraction;", "callerOnStartInteraction", "Lcom/whoop/archv2/feature/domain/m;", "genericTopItems", "<init>", "(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/archv2/feature/domain/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/models/ApiRequest;", "()Lcom/whoop/navigation/models/ApiRequest;", "b", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "c", "Lcom/whoop/archv2/feature/domain/m;", "()Lcom/whoop/archv2/feature/domain/m;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC5995c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final ApiRequest apiRequest;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final GenericInteraction callerOnStartInteraction;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C6005m genericTopItems;

        public d(ApiRequest apiRequest, GenericInteraction genericInteraction, C6005m c6005m) {
            super(null);
            this.apiRequest = apiRequest;
            this.callerOnStartInteraction = genericInteraction;
            this.genericTopItems = c6005m;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ApiRequest getApiRequest() {
            return this.apiRequest;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final GenericInteraction getCallerOnStartInteraction() {
            return this.callerOnStartInteraction;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C6005m getGenericTopItems() {
            return this.genericTopItems;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.apiRequest, dVar.apiRequest) && AbstractC22676k.m65745e(this.callerOnStartInteraction, dVar.callerOnStartInteraction) && AbstractC22676k.m65745e(this.genericTopItems, dVar.genericTopItems);
        }

        public int hashCode() {
            ApiRequest apiRequest = this.apiRequest;
            int iHashCode = (apiRequest == null ? 0 : apiRequest.hashCode()) * 31;
            GenericInteraction genericInteraction = this.callerOnStartInteraction;
            int iHashCode2 = (iHashCode + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
            C6005m c6005m = this.genericTopItems;
            return iHashCode2 + (c6005m != null ? c6005m.hashCode() : 0);
        }

        public String toString() {
            return "Init(apiRequest=" + this.apiRequest + ", callerOnStartInteraction=" + this.callerOnStartInteraction + ", genericTopItems=" + this.genericTopItems + ")";
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.c$e */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/c$e;", "Lcom/whoop/archv2/feature/domain/c;", "Lcom/whoop/navigation/models/ApiRequest;", "request", "<init>", "(Lcom/whoop/navigation/models/ApiRequest;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/models/ApiRequest;", "()Lcom/whoop/navigation/models/ApiRequest;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC5995c {

        /* JADX INFO: renamed from: b */
        public static final int f23699b = ApiRequest.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final ApiRequest request;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ApiRequest request) {
            super(null);
            AbstractC22676k.m65750j(request, "request");
            this.request = request;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ApiRequest getRequest() {
            return this.request;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && AbstractC22676k.m65745e(this.request, ((e) other).request);
        }

        public int hashCode() {
            return this.request.hashCode();
        }

        public String toString() {
            return "LoadMore(request=" + this.request + ")";
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.c$f */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/c$f;", "Lcom/whoop/archv2/feature/domain/c;", "Lcom/whoop/archv2/feature/domain/p;", "pick", "<init>", "(Lcom/whoop/archv2/feature/domain/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/archv2/feature/domain/p;", "()Lcom/whoop/archv2/feature/domain/p;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC5995c {

        /* JADX INFO: renamed from: b */
        public static final int f23701b = GenericInteraction.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C6010p pick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C6010p pick) {
            super(null);
            AbstractC22676k.m65750j(pick, "pick");
            this.pick = pick;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C6010p getPick() {
            return this.pick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && AbstractC22676k.m65745e(this.pick, ((f) other).pick);
        }

        public int hashCode() {
            return this.pick.hashCode();
        }

        public String toString() {
            return "MediaPickFailed(pick=" + this.pick + ")";
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.c$g */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/c$g;", "Lcom/whoop/archv2/feature/domain/c;", "Lcom/whoop/archv2/feature/domain/p;", "pick", "", "uri", "<init>", "(Lcom/whoop/archv2/feature/domain/p;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/archv2/feature/domain/p;", "()Lcom/whoop/archv2/feature/domain/p;", "b", "Ljava/lang/String;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC5995c {

        /* JADX INFO: renamed from: c */
        public static final int f23703c = GenericInteraction.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C6010p pick;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C6010p pick, String uri) {
            super(null);
            AbstractC22676k.m65750j(pick, "pick");
            AbstractC22676k.m65750j(uri, "uri");
            this.pick = pick;
            this.uri = uri;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C6010p getPick() {
            return this.pick;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return AbstractC22676k.m65745e(this.pick, gVar.pick) && AbstractC22676k.m65745e(this.uri, gVar.uri);
        }

        public int hashCode() {
            return this.uri.hashCode() + (this.pick.hashCode() * 31);
        }

        public String toString() {
            return "MediaPicked(pick=" + this.pick + ", uri=" + this.uri + ")";
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.c$h */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/c$h;", "Lcom/whoop/archv2/feature/domain/c;", "<init>", "()V", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC5995c {

        /* JADX INFO: renamed from: a */
        public static final h f23706a = new h();

        private h() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.c$i */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/c$i;", "Lcom/whoop/archv2/feature/domain/c;", "<init>", "()V", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC5995c {

        /* JADX INFO: renamed from: a */
        public static final i f23707a = new i();

        private i() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.c$j */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/c$j;", "Lcom/whoop/archv2/feature/domain/c;", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "<init>", "(Lcom/whoop/whoopaction/domain/models/Action;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j extends AbstractC5995c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Action action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Action action) {
            super(null);
            AbstractC22676k.m65750j(action, "action");
            this.action = action;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Action getAction() {
            return this.action;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof j) && AbstractC22676k.m65745e(this.action, ((j) other).action);
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        public String toString() {
            return AbstractC11478a.m30856h("PerformAction(action=", this.action, ")");
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.c$k */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/c$k;", "Lcom/whoop/archv2/feature/domain/c;", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "<init>", "(Lcom/whoop/navigation/models/GenericInteraction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k extends AbstractC5995c {

        /* JADX INFO: renamed from: b */
        public static final int f23709b = GenericInteraction.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final GenericInteraction interaction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(GenericInteraction interaction) {
            super(null);
            AbstractC22676k.m65750j(interaction, "interaction");
            this.interaction = interaction;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final GenericInteraction getInteraction() {
            return this.interaction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof k) && AbstractC22676k.m65745e(this.interaction, ((k) other).interaction);
        }

        public int hashCode() {
            return this.interaction.hashCode();
        }

        public String toString() {
            return "PerformInteraction(interaction=" + this.interaction + ")";
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.c$l */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/c$l;", "Lcom/whoop/archv2/feature/domain/c;", "Lcom/whoop/design/models/modal/AnyModal;", "modal", "<init>", "(Lcom/whoop/design/models/modal/AnyModal;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/models/modal/AnyModal;", "()Lcom/whoop/design/models/modal/AnyModal;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l extends AbstractC5995c {

        /* JADX INFO: renamed from: b */
        public static final int f23711b = AnyModal.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AnyModal modal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(AnyModal modal) {
            super(null);
            AbstractC22676k.m65750j(modal, "modal");
            this.modal = modal;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AnyModal getModal() {
            return this.modal;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof l) && AbstractC22676k.m65745e(this.modal, ((l) other).modal);
        }

        public int hashCode() {
            return this.modal.hashCode();
        }

        public String toString() {
            return AbstractC21702c.m61135f("PresentModal(modal=", ")", this.modal);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.c$m */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/c$m;", "Lcom/whoop/archv2/feature/domain/c;", "Lcom/whoop/design/models/modal/AnyModal;", "modal", "<init>", "(Lcom/whoop/design/models/modal/AnyModal;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/models/modal/AnyModal;", "()Lcom/whoop/design/models/modal/AnyModal;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m extends AbstractC5995c {

        /* JADX INFO: renamed from: b */
        public static final int f23713b = AnyModal.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AnyModal modal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(AnyModal modal) {
            super(null);
            AbstractC22676k.m65750j(modal, "modal");
            this.modal = modal;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AnyModal getModal() {
            return this.modal;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof m) && AbstractC22676k.m65745e(this.modal, ((m) other).modal);
        }

        public int hashCode() {
            return this.modal.hashCode();
        }

        public String toString() {
            return AbstractC21702c.m61135f("PresentNestedModal(modal=", ")", this.modal);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.c$n */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/c$n;", "Lcom/whoop/archv2/feature/domain/c;", "", "manualRefresh", "", "refreshScope", "Lcom/whoop/whoopaction/domain/models/ReloadAction;", "reloadAction", "<init>", "(ZLjava/lang/String;Lcom/whoop/whoopaction/domain/models/ReloadAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Ljava/lang/String;", "c", "Lcom/whoop/whoopaction/domain/models/ReloadAction;", "()Lcom/whoop/whoopaction/domain/models/ReloadAction;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n extends AbstractC5995c {

        /* JADX INFO: renamed from: d */
        public static final int f23715d = ReloadAction.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean manualRefresh;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String refreshScope;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final ReloadAction reloadAction;

        public n(boolean z4, String str, ReloadAction reloadAction) {
            super(null);
            this.manualRefresh = z4;
            this.refreshScope = str;
            this.reloadAction = reloadAction;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getManualRefresh() {
            return this.manualRefresh;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getRefreshScope() {
            return this.refreshScope;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ReloadAction getReloadAction() {
            return this.reloadAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof n)) {
                return false;
            }
            n nVar = (n) other;
            return this.manualRefresh == nVar.manualRefresh && AbstractC22676k.m65745e(this.refreshScope, nVar.refreshScope) && AbstractC22676k.m65745e(this.reloadAction, nVar.reloadAction);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.manualRefresh) * 31;
            String str = this.refreshScope;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ReloadAction reloadAction = this.reloadAction;
            return iHashCode2 + (reloadAction != null ? reloadAction.hashCode() : 0);
        }

        public String toString() {
            boolean z4 = this.manualRefresh;
            String str = this.refreshScope;
            ReloadAction reloadAction = this.reloadAction;
            StringBuilder sbM38567n = AbstractC13673n.m38567n("Refresh(manualRefresh=", ", refreshScope=", str, ", reloadAction=", z4);
            sbM38567n.append(reloadAction);
            sbM38567n.append(")");
            return sbM38567n.toString();
        }
    }

    public /* synthetic */ AbstractC5995c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC5995c() {
    }
}
