package i82;

import android.net.Uri;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.searcharchmini.api.SearchArchMiniApi;
import com.whoop.searcharchmini.domain.model.SearchArchMiniResponse;
import com.whoop.whoopaction.domain.models.Action;
import ec3.AbstractC13091v;
import ec3.C13054k;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25272z;
import od1.InterfaceC27844g;
import p000.AbstractC11266d;
import p007a6.C0456u;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qw2.AbstractC30694b;
import qw2.C30695c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: i82.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002-/B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001a\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u00172\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001f\u001a\u00020\u0015H\u0002¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\b$\u0010%J&\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0015H\u0002¢\u0006\u0004\b(\u0010)J#\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, m65681d2 = {"Li82/h;", "Lod1/g;", "Li82/f;", "Li82/g;", "Lcom/whoop/searcharchmini/api/SearchArchMiniApi;", "api", "Lqw2/c;", "actionInteractor", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Li82/d;", "progressionResolver", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/searcharchmini/api/SearchArchMiniApi;Lqw2/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Li82/d;Ltr2/n;)V", "state", "Li82/h$b;", "result", "s", "(Li82/g;Li82/h$b;)Li82/g;", "", "path", "Lec3/l;", "q", "(Ljava/lang/String;)Lec3/l;", "query", "t", "(Ljava/lang/String;Ljava/lang/String;)Lec3/l;", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "currentQuery", "r", "(Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Ljava/lang/String;)Lec3/l;", "Lu02/a;", "Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;", "n", "(Lu02/a;)Li82/h$b;", "p", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "o", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/searcharchmini/api/SearchArchMiniApi;", "b", "Lqw2/c;", "c", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "d", "Li82/d;", "e", "Ltr2/n;", "search-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18224h implements InterfaceC27844g<AbstractC18222f, C18223g> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final SearchArchMiniApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C30695c actionInteractor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C18220d progressionResolver;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: i82.h$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, m65681d2 = {"Li82/h$b;", "", "<init>", "()V", "a", "k", "b", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "j", "e", "i", "g", "c", "f", "Li82/h$b$a;", "Li82/h$b$b;", "Li82/h$b$c;", "Li82/h$b$d;", "Li82/h$b$e;", "Li82/h$b$f;", "Li82/h$b$g;", "Li82/h$b$h;", "Li82/h$b$i;", "Li82/h$b$j;", "Li82/h$b$k;", "search-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: i82.h$b$a */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Li82/h$b$a;", "Li82/h$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "search-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class a extends b {

            /* JADX INFO: renamed from: a */
            public static final a f70842a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 1827998654;
            }

            public String toString() {
                return "BlankInitialPath";
            }
        }

        /* JADX INFO: renamed from: i82.h$b$b, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Li82/h$b$b;", "Li82/h$b;", "Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;", "data", "<init>", "(Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;", "()Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;", "search-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C41729b extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final SearchArchMiniResponse data;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41729b(SearchArchMiniResponse data) {
                super(null);
                AbstractC22676k.m65750j(data, "data");
                this.data = data;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final SearchArchMiniResponse getData() {
                return this.data;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof C41729b) && AbstractC22676k.m65745e(this.data, ((C41729b) other).data);
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "DataLoaded(data=" + this.data + ")";
            }
        }

        /* JADX INFO: renamed from: i82.h$b$c */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Li82/h$b$c;", "Li82/h$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "search-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class c extends b {

            /* JADX INFO: renamed from: a */
            public static final c f70844a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 1518253546;
            }

            public String toString() {
                return "ErrorDismissed";
            }
        }

        /* JADX INFO: renamed from: i82.h$b$d */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Li82/h$b$d;", "Li82/h$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "search-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class d extends b {

            /* JADX INFO: renamed from: a */
            public static final d f70845a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return -1164052905;
            }

            public String toString() {
                return "FetchError";
            }
        }

        /* JADX INFO: renamed from: i82.h$b$e */
        @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Li82/h$b$e;", "Li82/h$b;", "", "id", "Li82/b;", "stages", "<init>", "(Ljava/lang/String;Li82/b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Li82/b;", "()Li82/b;", "search-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class e extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String id;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final C18218b stages;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String id4, C18218b stages) {
                super(null);
                AbstractC22676k.m65750j(id4, "id");
                AbstractC22676k.m65750j(stages, "stages");
                this.id = id4;
                this.stages = stages;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final C18218b getStages() {
                return this.stages;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof e)) {
                    return false;
                }
                e eVar = (e) other;
                return AbstractC22676k.m65745e(this.id, eVar.id) && AbstractC22676k.m65745e(this.stages, eVar.stages);
            }

            public int hashCode() {
                return this.stages.hashCode() + (this.id.hashCode() * 31);
            }

            public String toString() {
                return "FollowerRequestStageAdvanced(id=" + this.id + ", stages=" + this.stages + ")";
            }
        }

        /* JADX INFO: renamed from: i82.h$b$f */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Li82/h$b$f;", "Li82/h$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "search-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class f extends b {

            /* JADX INFO: renamed from: a */
            public static final f f70848a = new f();

            private f() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof f);
            }

            public int hashCode() {
                return 752063267;
            }

            public String toString() {
                return "InteractionCleared";
            }
        }

        /* JADX INFO: renamed from: i82.h$b$g */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Li82/h$b$g;", "Li82/h$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "search-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class g extends b {

            /* JADX INFO: renamed from: a */
            public static final g f70849a = new g();

            private g() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof g);
            }

            public int hashCode() {
                return 211083578;
            }

            public String toString() {
                return "ItemActionCleared";
            }
        }

        /* JADX INFO: renamed from: i82.h$b$h */
        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Li82/h$b$h;", "Li82/h$b;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "search-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class h extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(String message) {
                super(null);
                AbstractC22676k.m65750j(message, "message");
                this.message = message;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof h) && AbstractC22676k.m65745e(this.message, ((h) other).message);
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("ItemActionFailed(message=", this.message, ")");
            }
        }

        /* JADX INFO: renamed from: i82.h$b$i */
        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Li82/h$b$i;", "Li82/h$b;", "", "followerRequestId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "search-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class i extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String followerRequestId;

            public i(String str) {
                super(null);
                this.followerRequestId = str;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getFollowerRequestId() {
                return this.followerRequestId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof i) && AbstractC22676k.m65745e(this.followerRequestId, ((i) other).followerRequestId);
            }

            public int hashCode() {
                String str = this.followerRequestId;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("ItemActionInFlight(followerRequestId=", this.followerRequestId, ")");
            }
        }

        /* JADX INFO: renamed from: i82.h$b$j */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Li82/h$b$j;", "Li82/h$b;", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "<init>", "(Lcom/whoop/navigation/models/GenericInteraction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "search-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class j extends b {

            /* JADX INFO: renamed from: b */
            public static final int f70852b = GenericInteraction.$stable;

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final GenericInteraction interaction;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(GenericInteraction interaction) {
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
                return (other instanceof j) && AbstractC22676k.m65745e(this.interaction, ((j) other).interaction);
            }

            public int hashCode() {
                return this.interaction.hashCode();
            }

            public String toString() {
                return "ItemActionInteraction(interaction=" + this.interaction + ")";
            }
        }

        /* JADX INFO: renamed from: i82.h$b$k */
        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Li82/h$b$k;", "Li82/h$b;", "", "path", "query", "", "isItemActionRefresh", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "()Z", "search-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class k extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String path;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final String query;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final boolean isItemActionRefresh;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(String path, String query, boolean z4) {
                super(null);
                AbstractC22676k.m65750j(path, "path");
                AbstractC22676k.m65750j(query, "query");
                this.path = path;
                this.query = query;
                this.isItemActionRefresh = z4;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getPath() {
                return this.path;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getQuery() {
                return this.query;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final boolean getIsItemActionRefresh() {
                return this.isItemActionRefresh;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof k)) {
                    return false;
                }
                k kVar = (k) other;
                return AbstractC22676k.m65745e(this.path, kVar.path) && AbstractC22676k.m65745e(this.query, kVar.query) && this.isItemActionRefresh == kVar.isItemActionRefresh;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isItemActionRefresh) + AbstractC11266d.m30450d(this.path.hashCode() * 31, 31, this.query);
            }

            public String toString() {
                String str = this.path;
                String str2 = this.query;
                return AbstractC18489d0.m53372m(AbstractC11895b.m32001t("Loading(path=", str, ", query=", str2, ", isItemActionRefresh="), this.isItemActionRefresh, ")");
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: i82.h$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.searcharchmini.domain.SearchArchMiniInteractor$fetchResult$2", m100430f = "SearchArchMiniInteractor.kt", m100431l = {244}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f70857w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f70859y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f70859y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C18224h.this.new c(this.f70859y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f70857w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            SearchArchMiniApi searchArchMiniApi = C18224h.this.api;
            String str = this.f70859y;
            this.f70857w = 1;
            Object searchResponse = searchArchMiniApi.getSearchResponse(str, this);
            return searchResponse == enumC31071a ? enumC31071a : searchResponse;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super SearchArchMiniResponse> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: i82.h$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.searcharchmini.domain.SearchArchMiniInteractor$interact$$inlined$flatMapLatest$1", m100430f = "SearchArchMiniInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f70860w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f70861x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f70862y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C18224h f70863z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC30057d interfaceC30057d, C18224h c18224h) {
            super(3, interfaceC30057d);
            this.f70863z = c18224h;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, a aVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(interfaceC30057d, this.f70863z);
            dVar.f70861x = interfaceC13062m;
            dVar.f70862y = aVar;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C0456u c0456u;
            InterfaceC13058l interfaceC13058lM52462r;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f70860w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f70861x;
                a aVar = (a) this.f70862y;
                AbstractC18222f action = aVar.getAction();
                if (action == null) {
                    interfaceC13058lM52462r = C13054k.f45116w;
                } else if (action instanceof AbstractC18222f.c) {
                    interfaceC13058lM52462r = this.f70863z.m52461q(aVar.getPath());
                } else if (action instanceof AbstractC18222f.e) {
                    interfaceC13058lM52462r = this.f70863z.m52464t(aVar.getPath(), aVar.getQuery());
                } else if (action instanceof AbstractC18222f.d) {
                    interfaceC13058lM52462r = this.f70863z.m52462r(((AbstractC18222f.d) action).getAction(), aVar.getPath(), aVar.getQuery());
                } else {
                    if (action.equals(AbstractC18222f.b.f70819a)) {
                        c0456u = new C0456u(b.c.f70844a, 1);
                    } else {
                        if (!action.equals(AbstractC18222f.a.f70818a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c0456u = new C0456u(b.f.f70848a, 1);
                    }
                    interfaceC13058lM52462r = c0456u;
                }
                this.f70861x = null;
                this.f70862y = null;
                this.f70860w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM52462r, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: i82.h$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.searcharchmini.domain.SearchArchMiniInteractor$interact$1", m100430f = "SearchArchMiniInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Li82/h$a;", "carry", "Li82/f;", "action", "<anonymous>", "(Li82/h$a;Li82/f;)Li82/h$a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f70864w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f70865x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f70866y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a aVar, AbstractC18222f abstractC18222f, InterfaceC30057d<? super a> interfaceC30057d) {
            e eVar = new e(interfaceC30057d);
            eVar.f70865x = aVar;
            eVar.f70866y = abstractC18222f;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            a aVar = (a) this.f70865x;
            AbstractC18222f abstractC18222f = (AbstractC18222f) this.f70866y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f70864w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!(abstractC18222f instanceof AbstractC18222f.c)) {
                return abstractC18222f instanceof AbstractC18222f.e ? a.m52465b(aVar, abstractC18222f, null, ((AbstractC18222f.e) abstractC18222f).getQuery(), 2, null) : a.m52465b(aVar, abstractC18222f, null, null, 6, null);
            }
            String string = AbstractC39414r.m125869O0(((AbstractC18222f.c) abstractC18222f).getPath()).toString();
            if (string.length() == 0) {
                string = null;
            }
            return new a(abstractC18222f, string, "");
        }
    }

    /* JADX INFO: renamed from: i82.h$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.searcharchmini.domain.SearchArchMiniInteractor$interact$3", m100430f = "SearchArchMiniInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Li82/g;", "state", "Li82/h$b;", "result", "<anonymous>", "(Li82/g;Li82/h$b;)Li82/g;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f70867w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f70868x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f70869y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C18223g c18223g, b bVar, InterfaceC30057d<? super C18223g> interfaceC30057d) {
            f fVar = C18224h.this.new f(interfaceC30057d);
            fVar.f70868x = c18223g;
            fVar.f70869y = bVar;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C18223g c18223g = (C18223g) this.f70868x;
            b bVar = (b) this.f70869y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f70867w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C18224h.this.m52463s(c18223g, bVar);
        }
    }

    /* JADX INFO: renamed from: i82.h$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.searcharchmini.domain.SearchArchMiniInteractor$loadInitial$1", m100430f = "SearchArchMiniInteractor.kt", m100431l = {159, 162, 163, 165}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Li82/h$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C18224h f70871E;

        /* JADX INFO: renamed from: w */
        Object f70872w;

        /* JADX INFO: renamed from: x */
        int f70873x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f70874y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f70875z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, C18224h c18224h, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f70875z = str;
            this.f70871E = c18224h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = new g(this.f70875z, this.f70871E, interfaceC30057d);
            gVar.f70874y = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x006e A[PHI: r2 r11
          0x006e: PHI (r2v3 i82.h) = (r2v2 i82.h), (r2v8 i82.h) binds: [B:23:0x006b, B:11:0x002c] A[DONT_GENERATE, DONT_INLINE]
          0x006e: PHI (r11v9 java.lang.Object) = (r11v8 java.lang.Object), (r11v0 java.lang.Object) binds: [B:23:0x006b, B:11:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:27:0x0078  */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C18224h c18224h;
            b bVarM52458n;
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f70874y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f70873x;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                String str = this.f70875z;
                if (str == null || AbstractC39414r.m125890i0(str)) {
                    b.a aVar = b.a.f70842a;
                    this.f70874y = null;
                    this.f70873x = 1;
                    if (interfaceC13062m.emit(aVar, this) != enumC31071a) {
                        return c23454a0;
                    }
                } else {
                    b.k kVar = new b.k(this.f70875z, "", false);
                    this.f70874y = interfaceC13062m;
                    this.f70873x = 2;
                    if (interfaceC13062m.emit(kVar, this) != enumC31071a) {
                        c18224h = this.f70871E;
                        String str2 = this.f70875z;
                        this.f70874y = interfaceC13062m;
                        this.f70872w = c18224h;
                        this.f70873x = 3;
                        obj = c18224h.m52460p(str2, "", this);
                        if (obj != enumC31071a) {
                            bVarM52458n = c18224h.m52458n((InterfaceC34385a) obj);
                            if (bVarM52458n instanceof b.C41729b) {
                                this.f70871E.progressionResolver.m52427b(((b.C41729b) bVarM52458n).getData());
                            }
                            this.f70874y = null;
                            this.f70872w = null;
                            this.f70873x = 4;
                            if (interfaceC13062m.emit(bVarM52458n, this) != enumC31071a) {
                                return c23454a0;
                            }
                        }
                    }
                }
                return enumC31071a;
            }
            if (i13 == 1) {
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            }
            if (i13 == 2) {
                AbstractC34132o.m107864I(obj);
                c18224h = this.f70871E;
                String str3 = this.f70875z;
                this.f70874y = interfaceC13062m;
                this.f70872w = c18224h;
                this.f70873x = 3;
                obj = c18224h.m52460p(str3, "", this);
                if (obj != enumC31071a) {
                    bVarM52458n = c18224h.m52458n((InterfaceC34385a) obj);
                    if (bVarM52458n instanceof b.C41729b) {
                        this.f70871E.progressionResolver.m52427b(((b.C41729b) bVarM52458n).getData());
                    }
                    this.f70874y = null;
                    this.f70872w = null;
                    this.f70873x = 4;
                    if (interfaceC13062m.emit(bVarM52458n, this) != enumC31071a) {
                    }
                }
                return enumC31071a;
            }
            if (i13 == 3) {
                c18224h = (C18224h) this.f70872w;
                AbstractC34132o.m107864I(obj);
                bVarM52458n = c18224h.m52458n((InterfaceC34385a) obj);
                if (bVarM52458n instanceof b.C41729b) {
                    this.f70871E.progressionResolver.m52427b(((b.C41729b) bVarM52458n).getData());
                }
                this.f70874y = null;
                this.f70872w = null;
                this.f70873x = 4;
                if (interfaceC13062m.emit(bVarM52458n, this) != enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: i82.h$h */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.searcharchmini.domain.SearchArchMiniInteractor$performItemAction$1", m100430f = "SearchArchMiniInteractor.kt", m100431l = {182, 188, 203, 208, 210, 212, 218, 222, 231, 231}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Li82/h$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        boolean f70876E;

        /* JADX INFO: renamed from: F */
        int f70877F;

        /* JADX INFO: renamed from: G */
        private /* synthetic */ Object f70878G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ String f70879H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ C18224h f70880I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ Action f70881J;

        /* JADX INFO: renamed from: K */
        final /* synthetic */ String f70882K;

        /* JADX INFO: renamed from: w */
        Object f70883w;

        /* JADX INFO: renamed from: x */
        Object f70884x;

        /* JADX INFO: renamed from: y */
        Object f70885y;

        /* JADX INFO: renamed from: z */
        Object f70886z;

        /* JADX INFO: renamed from: i82.h$h$a */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f70887w;

            /* JADX INFO: renamed from: i82.h$h$a$a, reason: collision with other inner class name */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41730a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f70888w;

                /* JADX INFO: renamed from: i82.h$h$a$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.searcharchmini.domain.SearchArchMiniInteractor$performItemAction$1$invokeSuspend$$inlined$filter$1$2", m100430f = "SearchArchMiniInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C41731a extends AbstractC32269c {

                    /* JADX INFO: renamed from: F */
                    Object f70890F;

                    /* JADX INFO: renamed from: G */
                    Object f70891G;

                    /* JADX INFO: renamed from: H */
                    int f70892H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f70893w;

                    /* JADX INFO: renamed from: x */
                    int f70894x;

                    /* JADX INFO: renamed from: y */
                    Object f70895y;

                    /* JADX INFO: renamed from: z */
                    Object f70896z;

                    public C41731a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f70893w = obj;
                        this.f70894x |= Integer.MIN_VALUE;
                        return C41730a.this.emit(null, this);
                    }
                }

                public C41730a(InterfaceC13062m interfaceC13062m) {
                    this.f70888w = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C41731a c41731a;
                    if (interfaceC30057d instanceof C41731a) {
                        c41731a = (C41731a) interfaceC30057d;
                        int i13 = c41731a.f70894x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c41731a.f70894x = i13 - Integer.MIN_VALUE;
                        } else {
                            c41731a = new C41731a(interfaceC30057d);
                        }
                    } else {
                        c41731a = new C41731a(interfaceC30057d);
                    }
                    Object obj2 = c41731a.f70893w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c41731a.f70894x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f70888w;
                        AbstractC30694b abstractC30694b = (AbstractC30694b) obj;
                        if ((abstractC30694b instanceof AbstractC30694b.f) || (abstractC30694b instanceof AbstractC30694b.a) || (abstractC30694b instanceof AbstractC30694b.b)) {
                            c41731a.f70895y = null;
                            c41731a.f70896z = null;
                            c41731a.f70890F = null;
                            c41731a.f70891G = null;
                            c41731a.f70892H = 0;
                            c41731a.f70894x = 1;
                            if (interfaceC13062m.emit(obj, c41731a) == enumC31071a) {
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

            public a(InterfaceC13058l interfaceC13058l) {
                this.f70887w = interfaceC13058l;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f70887w.collect(new C41730a(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, C18224h c18224h, Action action, String str2, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f70879H = str;
            this.f70880I = c18224h;
            this.f70881J = action;
            this.f70882K = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = new h(this.f70879H, this.f70880I, this.f70881J, this.f70882K, interfaceC30057d);
            hVar.f70878G = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:44:0x0106 A[DONT_INVERT, PHI: r3 r6
          0x0106: PHI (r3v6 boolean) = (r3v5 boolean), (r3v5 boolean), (r3v7 boolean) binds: [B:36:0x00e6, B:42:0x0102, B:29:0x00b5] A[DONT_GENERATE, DONT_INLINE]
          0x0106: PHI (r6v2 i82.a) = (r6v1 i82.a), (r6v1 i82.a), (r6v7 i82.a) binds: [B:36:0x00e6, B:42:0x0102, B:29:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:45:0x0108  */
        /* JADX WARN: Code duplicated, block: B:46:0x0114  */
        /* JADX WARN: Code duplicated, block: B:48:0x0117 A[Catch: all -> 0x00a4, TRY_ENTER, TryCatch #0 {all -> 0x00a4, blocks: (B:22:0x009f, B:54:0x0162, B:57:0x016a, B:62:0x01a1, B:72:0x01f3, B:74:0x01f8, B:77:0x0222, B:80:0x0239, B:82:0x023d, B:85:0x025d, B:27:0x00b0, B:51:0x0133, B:48:0x0117), top: B:96:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:50:0x0131  */
        /* JADX WARN: Code duplicated, block: B:51:0x0133 A[Catch: all -> 0x00a4, PHI: r3 r6
          0x0133: PHI (r3v8 boolean) = (r3v6 boolean), (r3v6 boolean), (r3v9 boolean) binds: [B:47:0x0115, B:49:0x012f, B:27:0x00b0] A[DONT_GENERATE, DONT_INLINE]
          0x0133: PHI (r6v8 i82.d$a) = (r6v4 i82.d$a), (r6v4 i82.d$a), (r6v10 i82.d$a) binds: [B:47:0x0115, B:49:0x012f, B:27:0x00b0] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x00a4, blocks: (B:22:0x009f, B:54:0x0162, B:57:0x016a, B:62:0x01a1, B:72:0x01f3, B:74:0x01f8, B:77:0x0222, B:80:0x0239, B:82:0x023d, B:85:0x025d, B:27:0x00b0, B:51:0x0133, B:48:0x0117), top: B:96:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:53:0x0160  */
        /* JADX WARN: Code duplicated, block: B:54:0x0162 A[Catch: all -> 0x00a4, PHI: r3 r6 r12
          0x0162: PHI (r3v10 boolean) = (r3v8 boolean), (r3v12 boolean) binds: [B:52:0x015e, B:22:0x009f] A[DONT_GENERATE, DONT_INLINE]
          0x0162: PHI (r6v11 i82.d$a) = (r6v8 i82.d$a), (r6v19 i82.d$a) binds: [B:52:0x015e, B:22:0x009f] A[DONT_GENERATE, DONT_INLINE]
          0x0162: PHI (r12v24 java.lang.Object) = (r12v23 java.lang.Object), (r12v0 java.lang.Object) binds: [B:52:0x015e, B:22:0x009f] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x00a4, blocks: (B:22:0x009f, B:54:0x0162, B:57:0x016a, B:62:0x01a1, B:72:0x01f3, B:74:0x01f8, B:77:0x0222, B:80:0x0239, B:82:0x023d, B:85:0x025d, B:27:0x00b0, B:51:0x0133, B:48:0x0117), top: B:96:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:56:0x0168 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:57:0x016a A[Catch: all -> 0x00a4, TryCatch #0 {all -> 0x00a4, blocks: (B:22:0x009f, B:54:0x0162, B:57:0x016a, B:62:0x01a1, B:72:0x01f3, B:74:0x01f8, B:77:0x0222, B:80:0x0239, B:82:0x023d, B:85:0x025d, B:27:0x00b0, B:51:0x0133, B:48:0x0117), top: B:96:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:59:0x019b  */
        /* JADX WARN: Code duplicated, block: B:60:0x019d  */
        /* JADX WARN: Code duplicated, block: B:62:0x01a1 A[Catch: all -> 0x00a4, TRY_LEAVE, TryCatch #0 {all -> 0x00a4, blocks: (B:22:0x009f, B:54:0x0162, B:57:0x016a, B:62:0x01a1, B:72:0x01f3, B:74:0x01f8, B:77:0x0222, B:80:0x0239, B:82:0x023d, B:85:0x025d, B:27:0x00b0, B:51:0x0133, B:48:0x0117), top: B:96:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:65:0x01be  */
        /* JADX WARN: Code duplicated, block: B:68:0x01cc A[Catch: all -> 0x0048, TryCatch #1 {all -> 0x0048, blocks: (B:10:0x0043, B:18:0x0081, B:66:0x01c2, B:68:0x01cc, B:69:0x01dc), top: B:96:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:72:0x01f3 A[Catch: all -> 0x00a4, TRY_ENTER, TryCatch #0 {all -> 0x00a4, blocks: (B:22:0x009f, B:54:0x0162, B:57:0x016a, B:62:0x01a1, B:72:0x01f3, B:74:0x01f8, B:77:0x0222, B:80:0x0239, B:82:0x023d, B:85:0x025d, B:27:0x00b0, B:51:0x0133, B:48:0x0117), top: B:96:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:74:0x01f8 A[Catch: all -> 0x00a4, TryCatch #0 {all -> 0x00a4, blocks: (B:22:0x009f, B:54:0x0162, B:57:0x016a, B:62:0x01a1, B:72:0x01f3, B:74:0x01f8, B:77:0x0222, B:80:0x0239, B:82:0x023d, B:85:0x025d, B:27:0x00b0, B:51:0x0133, B:48:0x0117), top: B:96:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:76:0x0220  */
        /* JADX WARN: Code duplicated, block: B:79:0x0238  */
        /* JADX WARN: Code duplicated, block: B:80:0x0239 A[Catch: all -> 0x00a4, TryCatch #0 {all -> 0x00a4, blocks: (B:22:0x009f, B:54:0x0162, B:57:0x016a, B:62:0x01a1, B:72:0x01f3, B:74:0x01f8, B:77:0x0222, B:80:0x0239, B:82:0x023d, B:85:0x025d, B:27:0x00b0, B:51:0x0133, B:48:0x0117), top: B:96:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:82:0x023d A[Catch: all -> 0x00a4, TryCatch #0 {all -> 0x00a4, blocks: (B:22:0x009f, B:54:0x0162, B:57:0x016a, B:62:0x01a1, B:72:0x01f3, B:74:0x01f8, B:77:0x0222, B:80:0x0239, B:82:0x023d, B:85:0x025d, B:27:0x00b0, B:51:0x0133, B:48:0x0117), top: B:96:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:84:0x025c  */
        /* JADX WARN: Code duplicated, block: B:85:0x025d A[Catch: all -> 0x00a4, TRY_LEAVE, TryCatch #0 {all -> 0x00a4, blocks: (B:22:0x009f, B:54:0x0162, B:57:0x016a, B:62:0x01a1, B:72:0x01f3, B:74:0x01f8, B:77:0x0222, B:80:0x0239, B:82:0x023d, B:85:0x025d, B:27:0x00b0, B:51:0x0133, B:48:0x0117), top: B:96:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:87:0x026c  */
        /* JADX WARN: Code duplicated, block: B:91:0x0287  */
        /* JADX WARN: Code duplicated, block: B:93:0x029f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x01ef, code lost:
        
            if (r1.emit(r12, r11) == r2) goto L93;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:74:0x01f8, please report this as an issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [int] */
        /* JADX WARN: Type inference failed for: r3v1 */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 700
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: i82.C18224h.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: i82.h$i */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.searcharchmini.domain.SearchArchMiniInteractor$searchWithQuery$1", m100430f = "SearchArchMiniInteractor.kt", m100431l = {170, 171, 173}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Li82/h$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f70897E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C18224h f70898F;

        /* JADX INFO: renamed from: w */
        Object f70899w;

        /* JADX INFO: renamed from: x */
        int f70900x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f70901y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f70902z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, String str2, C18224h c18224h, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f70902z = str;
            this.f70897E = str2;
            this.f70898F = c18224h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            i iVar = new i(this.f70902z, this.f70897E, this.f70898F, interfaceC30057d);
            iVar.f70901y = obj;
            return iVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0068 A[PHI: r2 r10
          0x0068: PHI (r2v3 i82.h) = (r2v2 i82.h), (r2v9 i82.h) binds: [B:21:0x0065, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE]
          0x0068: PHI (r10v7 java.lang.Object) = (r10v6 java.lang.Object), (r10v0 java.lang.Object) binds: [B:21:0x0065, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:25:0x0072  */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C18224h c18224h;
            b bVarM52458n;
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f70901y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f70900x;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                String str = this.f70902z;
                if (str != null && !AbstractC39414r.m125890i0(str)) {
                    b.k kVar = new b.k(this.f70902z, this.f70897E, false);
                    this.f70901y = interfaceC13062m;
                    this.f70900x = 1;
                    if (interfaceC13062m.emit(kVar, this) != enumC31071a) {
                        c18224h = this.f70898F;
                        String str2 = this.f70902z;
                        String str3 = this.f70897E;
                        this.f70901y = interfaceC13062m;
                        this.f70899w = c18224h;
                        this.f70900x = 2;
                        obj = c18224h.m52460p(str2, str3, this);
                        if (obj != enumC31071a) {
                            bVarM52458n = c18224h.m52458n((InterfaceC34385a) obj);
                            if (bVarM52458n instanceof b.C41729b) {
                                this.f70898F.progressionResolver.m52427b(((b.C41729b) bVarM52458n).getData());
                            }
                            this.f70901y = null;
                            this.f70899w = null;
                            this.f70900x = 3;
                            if (interfaceC13062m.emit(bVarM52458n, this) == enumC31071a) {
                            }
                        }
                    }
                    return enumC31071a;
                }
                return c23454a0;
            }
            if (i13 == 1) {
                AbstractC34132o.m107864I(obj);
                c18224h = this.f70898F;
                String str4 = this.f70902z;
                String str5 = this.f70897E;
                this.f70901y = interfaceC13062m;
                this.f70899w = c18224h;
                this.f70900x = 2;
                obj = c18224h.m52460p(str4, str5, this);
                if (obj != enumC31071a) {
                    bVarM52458n = c18224h.m52458n((InterfaceC34385a) obj);
                    if (bVarM52458n instanceof b.C41729b) {
                        this.f70898F.progressionResolver.m52427b(((b.C41729b) bVarM52458n).getData());
                    }
                    this.f70901y = null;
                    this.f70899w = null;
                    this.f70900x = 3;
                    if (interfaceC13062m.emit(bVarM52458n, this) == enumC31071a) {
                    }
                }
                return enumC31071a;
            }
            if (i13 == 2) {
                c18224h = (C18224h) this.f70899w;
                AbstractC34132o.m107864I(obj);
                bVarM52458n = c18224h.m52458n((InterfaceC34385a) obj);
                if (bVarM52458n instanceof b.C41729b) {
                    this.f70898F.progressionResolver.m52427b(((b.C41729b) bVarM52458n).getData());
                }
                this.f70901y = null;
                this.f70899w = null;
                this.f70900x = 3;
                if (interfaceC13062m.emit(bVarM52458n, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return c23454a0;
        }
    }

    public C18224h(SearchArchMiniApi api, C30695c actionInteractor, FeatureFlagChecker featureFlagChecker, C18220d progressionResolver, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(actionInteractor, "actionInteractor");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(progressionResolver, "progressionResolver");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.actionInteractor = actionInteractor;
        this.featureFlagChecker = featureFlagChecker;
        this.progressionResolver = progressionResolver;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final b m52458n(InterfaceC34385a<SearchArchMiniResponse> result) {
        if (result instanceof InterfaceC34385a.c) {
            return new b.C41729b((SearchArchMiniResponse) ((InterfaceC34385a.c) result).m108735a());
        }
        if (result instanceof InterfaceC34385a.b) {
            return b.d.f70845a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: o */
    private final String m52459o(String path, String query) {
        String string = AbstractC39414r.m125869O0(query).toString();
        if (string.length() == 0) {
            return path;
        }
        String string2 = Uri.parse(path).buildUpon().appendQueryParameter("input", string).build().toString();
        AbstractC22676k.m65749i(string2, "toString(...)");
        return string2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final Object m52460p(String str, String str2, InterfaceC30057d<? super InterfaceC34385a<SearchArchMiniResponse>> interfaceC30057d) {
        return InterfaceC34385a.Companion.m108729b(InterfaceC34385a.INSTANCE, this.logger, null, "Failed to fetch search arch mini", new c(m52459o(str, str2), null), interfaceC30057d, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final InterfaceC13058l m52461q(String path) {
        return new C13084s1(new g(path, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final InterfaceC13058l m52462r(Action action, String path, String currentQuery) {
        return new C13084s1(new h(path, this, action, currentQuery, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final C18223g m52463s(C18223g state, b result) {
        if (AbstractC22676k.m65745e(result, b.a.f70842a)) {
            return C18223g.m52436b(state, false, true, null, null, null, null, false, null, false, null, null, 1588, null);
        }
        if (result instanceof b.k) {
            b.k kVar = (b.k) result;
            return C18223g.m52436b(state, true, false, null, kVar.getPath(), kVar.getQuery(), null, kVar.getIsItemActionRefresh() ? state.getItemActionInProgress() : false, kVar.getIsItemActionRefresh() ? state.getInFlightFollowerRequestId() : null, kVar.getIsItemActionRefresh() ? state.getFollowerItemActionProgressVisibleInUi() : false, null, null, 1028, null);
        }
        if (result instanceof b.C41729b) {
            return C18223g.m52436b(state, false, false, ((b.C41729b) result).getData(), null, null, null, false, null, false, null, C25272z.f99163w, 56, null);
        }
        if (AbstractC22676k.m65745e(result, b.d.f70845a)) {
            return C18223g.m52436b(state, false, true, null, null, null, null, false, null, false, null, null, 1596, null);
        }
        if (result instanceof b.h) {
            return C18223g.m52436b(state, false, false, null, null, null, ((b.h) result).getMessage(), false, null, false, null, null, 1054, null);
        }
        if (result instanceof b.j) {
            return C18223g.m52436b(state, false, false, null, null, null, null, false, null, false, ((b.j) result).getInteraction(), null, 1054, null);
        }
        if (result instanceof b.e) {
            b.e eVar = (b.e) result;
            return C18223g.m52436b(state, false, false, null, null, null, null, false, null, false, null, AbstractC25247g0.m73996e0(state.m52441f(), new C23465k(eVar.getId(), eVar.getStages())), 574, null);
        }
        if (result instanceof b.i) {
            return C18223g.m52436b(state, false, false, null, null, null, null, true, ((b.i) result).getFollowerRequestId(), true, null, null, 1599, null);
        }
        if (AbstractC22676k.m65745e(result, b.g.f70849a)) {
            return C18223g.m52436b(state, false, false, null, null, null, null, false, null, false, null, null, 1599, null);
        }
        if (AbstractC22676k.m65745e(result, b.c.f70844a)) {
            return C18223g.m52436b(state, false, false, null, null, null, null, false, null, false, null, null, 2015, null);
        }
        if (AbstractC22676k.m65745e(result, b.f.f70848a)) {
            return C18223g.m52436b(state, false, false, null, null, null, null, false, null, false, null, null, 1535, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final InterfaceC13058l m52464t(String path, String query) {
        return new C13084s1(new i(path, query, this, null));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C18223g(false, false, null, null, null, null, false, null, false, null, null, 2047, null), AbstractC13091v.m36590P(new C13060l1(new a(null, null, null, 7, null), upstream, new e(null)), new d(null, this)), new f(null));
    }

    /* JADX INFO: renamed from: i82.h$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u001a\u0010\f¨\u0006\u001b"}, m65681d2 = {"Li82/h$a;", "", "Li82/f;", "action", "", "path", "query", "<init>", "(Li82/f;Ljava/lang/String;Ljava/lang/String;)V", "a", "(Li82/f;Ljava/lang/String;Ljava/lang/String;)Li82/h$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Li82/f;", "c", "()Li82/f;", "b", "Ljava/lang/String;", "d", "e", "search-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC18222f action;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String path;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String query;

        public a(AbstractC18222f abstractC18222f, String str, String query) {
            AbstractC22676k.m65750j(query, "query");
            this.action = abstractC18222f;
            this.path = str;
            this.query = query;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ a m52465b(a aVar, AbstractC18222f abstractC18222f, String str, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                abstractC18222f = aVar.action;
            }
            if ((i13 & 2) != 0) {
                str = aVar.path;
            }
            if ((i13 & 4) != 0) {
                str2 = aVar.query;
            }
            return aVar.m52466a(abstractC18222f, str, str2);
        }

        /* JADX INFO: renamed from: a */
        public final a m52466a(AbstractC18222f action, String path, String query) {
            AbstractC22676k.m65750j(query, "query");
            return new a(action, path, query);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final AbstractC18222f getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getQuery() {
            return this.query;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.action, aVar.action) && AbstractC22676k.m65745e(this.path, aVar.path) && AbstractC22676k.m65745e(this.query, aVar.query);
        }

        public int hashCode() {
            AbstractC18222f abstractC18222f = this.action;
            int iHashCode = (abstractC18222f == null ? 0 : abstractC18222f.hashCode()) * 31;
            String str = this.path;
            return this.query.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
        }

        public String toString() {
            AbstractC18222f abstractC18222f = this.action;
            String str = this.path;
            String str2 = this.query;
            StringBuilder sb4 = new StringBuilder("ActionCarry(action=");
            sb4.append(abstractC18222f);
            sb4.append(", path=");
            sb4.append(str);
            sb4.append(", query=");
            return AbstractC25012a.m73376i(str2, ")", sb4);
        }

        public /* synthetic */ a(AbstractC18222f abstractC18222f, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : abstractC18222f, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? "" : str2);
        }
    }

    public /* synthetic */ C18224h(SearchArchMiniApi searchArchMiniApi, C30695c c30695c, FeatureFlagChecker featureFlagChecker, C18220d c18220d, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(searchArchMiniApi, c30695c, featureFlagChecker, (i13 & 8) != 0 ? new C18220d() : c18220d, (i13 & 16) != 0 ? InterfaceC34116n.INSTANCE.m107848a("SearchArchMiniInteractor") : interfaceC34116n);
    }
}
