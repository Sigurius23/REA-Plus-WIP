package k42;

import c13.AbstractC3855a;
import c93.InterfaceC4351m;
import com.mapbox.common.logger.LogPriority;
import com.whoop.domain.model.User;
import com.whoop.privacyconsent.api.AccountDataSharingResponse;
import com.whoop.privacyconsent.api.AccountResponse;
import com.whoop.privacyconsent.api.AllowRecommendationRequest;
import com.whoop.privacyconsent.api.DataSharingBoxResponse;
import com.whoop.privacyconsent.api.DataSharingResponse;
import com.whoop.privacyconsent.api.PrivacyConsentApi;
import com.whoop.privacyconsent.api.PrivacyConsentSettingsResponse;
import com.whoop.privacyconsent.api.SearchableSetting;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import l83.C23454a0;
import od1.C27858u;
import od1.InterfaceC27844g;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: k42.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001BB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b \u0010!J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\f2\u0006\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b#\u0010\u0019J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\fH\u0002¢\u0006\u0004\b%\u0010\u000fJ\u0013\u0010&\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b&\u0010'J#\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b)\u0010*J\u0015\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b.\u0010/J!\u00104\u001a\b\u0012\u0004\u0012\u000203002\f\u00102\u001a\b\u0012\u0004\u0012\u00020100¢\u0006\u0004\b4\u00105J\u0015\u00109\u001a\u0002082\u0006\u00107\u001a\u000206¢\u0006\u0004\b9\u0010:J!\u0010>\u001a\b\u0012\u0004\u0012\u00020=002\f\u0010<\u001a\b\u0012\u0004\u0012\u00020;00¢\u0006\u0004\b>\u00105J\u001f\u0010@\u001a\u0004\u0018\u0001032\u0006\u0010?\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b@\u0010AR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006H"}, m65681d2 = {"Lk42/g;", "Lod1/g;", "Lk42/e;", "Lk42/f;", "Lcom/whoop/privacyconsent/api/PrivacyConsentApi;", "api", "Ltr2/n;", "logger", "Lod1/u;", "userContext", "<init>", "(Lcom/whoop/privacyconsent/api/PrivacyConsentApi;Ltr2/n;Lod1/u;)V", "Lec3/l;", "Lk42/g$a;", "q", "()Lec3/l;", "", "userId", "", "searchable", "mutualCommunitySharing", "y", "(IZZ)Lec3/l;", "isEnabled", "z", "(Z)Lec3/l;", "", "accountName", "Lk42/g$a$j;", "x", "(Ljava/lang/String;)Lec3/l;", "Lk42/g$a$a;", "o", "(ZZ)Lec3/l;", "Lk42/g$a$g;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lk42/g$a$f;", "r", "n", "(Lk42/f;)Lk42/f;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "Lcom/whoop/privacyconsent/api/DataSharingResponse;", "dataSharingResponse", "Lk42/d;", "u", "(Lcom/whoop/privacyconsent/api/DataSharingResponse;)Lk42/d;", "", "Lcom/whoop/privacyconsent/api/AccountResponse;", "accountListResponse", "Lk42/b;", "t", "(Ljava/util/List;)Ljava/util/List;", "Lcom/whoop/privacyconsent/api/AccountDataSharingResponse;", "accountDataSharingResponse", "Lk42/a;", "s", "(Lcom/whoop/privacyconsent/api/AccountDataSharingResponse;)Lk42/a;", "Lcom/whoop/privacyconsent/api/DataSharingBoxResponse;", "dataSharingBoxesResponse", "Lk42/c;", "v", "previousDomainState", "p", "(Lk42/f;Ljava/lang/String;)Lk42/b;", "a", "Lcom/whoop/privacyconsent/api/PrivacyConsentApi;", "b", "Ltr2/n;", "c", "I", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22197g implements InterfaceC27844g<AbstractC22195e, C22196f> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final PrivacyConsentApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int userId;

    /* JADX INFO: renamed from: k42.g$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, m65681d2 = {"Lk42/g$a;", "", "<init>", "()V", "f", "d", "c", "i", "e", "j", "b", "a", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "Lk42/g$a$a;", "Lk42/g$a$b;", "Lk42/g$a$c;", "Lk42/g$a$d;", "Lk42/g$a$e;", "Lk42/g$a$f;", "Lk42/g$a$g;", "Lk42/g$a$h;", "Lk42/g$a$i;", "Lk42/g$a$j;", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: k42.g$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lk42/g$a$a;", "Lk42/g$a;", "", "searchable", "mutualCommunitySharing", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C41874a extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final boolean searchable;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final boolean mutualCommunitySharing;

            public C41874a(boolean z4, boolean z13) {
                super(null);
                this.searchable = z4;
                this.mutualCommunitySharing = z13;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getMutualCommunitySharing() {
                return this.mutualCommunitySharing;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final boolean getSearchable() {
                return this.searchable;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C41874a)) {
                    return false;
                }
                C41874a c41874a = (C41874a) other;
                return this.searchable == c41874a.searchable && this.mutualCommunitySharing == c41874a.mutualCommunitySharing;
            }

            public int hashCode() {
                return Boolean.hashCode(this.mutualCommunitySharing) + (Boolean.hashCode(this.searchable) * 31);
            }

            public String toString() {
                return AbstractC30802r.m94762k("CommunitySettingsRefresh(searchable=", ", mutualCommunitySharing=", ")", this.searchable, this.mutualCommunitySharing);
            }
        }

        /* JADX INFO: renamed from: k42.g$a$b */
        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lk42/g$a$b;", "Lk42/g$a;", "", "searchable", "mutualCommunitySharing", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class b extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final boolean searchable;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final boolean mutualCommunitySharing;

            public b(boolean z4, boolean z13) {
                super(null);
                this.searchable = z4;
                this.mutualCommunitySharing = z13;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getMutualCommunitySharing() {
                return this.mutualCommunitySharing;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final boolean getSearchable() {
                return this.searchable;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof b)) {
                    return false;
                }
                b bVar = (b) other;
                return this.searchable == bVar.searchable && this.mutualCommunitySharing == bVar.mutualCommunitySharing;
            }

            public int hashCode() {
                return Boolean.hashCode(this.mutualCommunitySharing) + (Boolean.hashCode(this.searchable) * 31);
            }

            public String toString() {
                return AbstractC30802r.m94762k("CommunitySettingsSaved(searchable=", ", mutualCommunitySharing=", ")", this.searchable, this.mutualCommunitySharing);
            }
        }

        /* JADX INFO: renamed from: k42.g$a$c */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lk42/g$a$c;", "Lk42/g$a;", "<init>", "()V", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class c extends a {

            /* JADX INFO: renamed from: a */
            public static final c f86118a = new c();

            private c() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: k42.g$a$d */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lk42/g$a$d;", "Lk42/g$a;", "<init>", "()V", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class d extends a {

            /* JADX INFO: renamed from: a */
            public static final d f86119a = new d();

            private d() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: k42.g$a$e */
        @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lk42/g$a$e;", "Lk42/g$a;", "Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse;", "settingsResponse", "Lcom/whoop/privacyconsent/api/DataSharingResponse;", "dataSharingResponse", "<init>", "(Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse;Lcom/whoop/privacyconsent/api/DataSharingResponse;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse;", "b", "()Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse;", "Lcom/whoop/privacyconsent/api/DataSharingResponse;", "()Lcom/whoop/privacyconsent/api/DataSharingResponse;", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class e extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final PrivacyConsentSettingsResponse settingsResponse;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final DataSharingResponse dataSharingResponse;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(PrivacyConsentSettingsResponse settingsResponse, DataSharingResponse dataSharingResponse) {
                super(null);
                AbstractC22676k.m65750j(settingsResponse, "settingsResponse");
                AbstractC22676k.m65750j(dataSharingResponse, "dataSharingResponse");
                this.settingsResponse = settingsResponse;
                this.dataSharingResponse = dataSharingResponse;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final DataSharingResponse getDataSharingResponse() {
                return this.dataSharingResponse;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final PrivacyConsentSettingsResponse getSettingsResponse() {
                return this.settingsResponse;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof e)) {
                    return false;
                }
                e eVar = (e) other;
                return AbstractC22676k.m65745e(this.settingsResponse, eVar.settingsResponse) && AbstractC22676k.m65745e(this.dataSharingResponse, eVar.dataSharingResponse);
            }

            public int hashCode() {
                return this.dataSharingResponse.hashCode() + (this.settingsResponse.hashCode() * 31);
            }

            public String toString() {
                return "GetSettingsAndDataSharing(settingsResponse=" + this.settingsResponse + ", dataSharingResponse=" + this.dataSharingResponse + ")";
            }
        }

        /* JADX INFO: renamed from: k42.g$a$f */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lk42/g$a$f;", "Lk42/g$a;", "<init>", "()V", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class f extends a {

            /* JADX INFO: renamed from: a */
            public static final f f86122a = new f();

            private f() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: k42.g$a$g */
        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lk42/g$a$g;", "Lk42/g$a;", "", "isEnabled", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class g extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final boolean isEnabled;

            public g(boolean z4) {
                super(null);
                this.isEnabled = z4;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getIsEnabled() {
                return this.isEnabled;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof g) && this.isEnabled == ((g) other).isEnabled;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isEnabled);
            }

            public String toString() {
                return AbstractC3855a.m11827k("RecommendationRefresh(isEnabled=", ")", this.isEnabled);
            }
        }

        /* JADX INFO: renamed from: k42.g$a$h */
        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lk42/g$a$h;", "Lk42/g$a;", "", "isEnabled", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class h extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final boolean isEnabled;

            public h(boolean z4) {
                super(null);
                this.isEnabled = z4;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getIsEnabled() {
                return this.isEnabled;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof h) && this.isEnabled == ((h) other).isEnabled;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isEnabled);
            }

            public String toString() {
                return AbstractC3855a.m11827k("RecommendationSaved(isEnabled=", ")", this.isEnabled);
            }
        }

        /* JADX INFO: renamed from: k42.g$a$i */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lk42/g$a$i;", "Lk42/g$a;", "<init>", "()V", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class i extends a {

            /* JADX INFO: renamed from: a */
            public static final i f86125a = new i();

            private i() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: k42.g$a$j */
        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lk42/g$a$j;", "Lk42/g$a;", "", "accountName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class j extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String accountName;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(String accountName) {
                super(null);
                AbstractC22676k.m65750j(accountName, "accountName");
                this.accountName = accountName;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getAccountName() {
                return this.accountName;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof j) && AbstractC22676k.m65745e(this.accountName, ((j) other).accountName);
            }

            public int hashCode() {
                return this.accountName.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("ShowDataSharingSheet(accountName=", this.accountName, ")");
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: k42.g$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.privacyconsent.interactor.PrivacyConsentInteractor$communitySettingsRefresh$1", m100430f = "PrivacyConsentInteractor.kt", m100431l = {144}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lk42/g$a$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f86127w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f86128x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f86129y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f86130z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z4, boolean z13, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f86129y = z4;
            this.f86130z = z13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f86129y, this.f86130z, interfaceC30057d);
            bVar.f86128x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f86128x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f86127w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                a.C41874a c41874a = new a.C41874a(this.f86129y, this.f86130z);
                this.f86128x = null;
                this.f86127w = 1;
                if (interfaceC13062m.emit(c41874a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: k42.g$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.privacyconsent.interactor.PrivacyConsentInteractor$getSettingsAndDataSharing$1", m100430f = "PrivacyConsentInteractor.kt", m100431l = {94, 95, 97, LogPriority.NONE}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lk42/g$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f86131w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f86132x;

        /* JADX INFO: renamed from: k42.g$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.privacyconsent.interactor.PrivacyConsentInteractor$getSettingsAndDataSharing$1$1", m100430f = "PrivacyConsentInteractor.kt", m100431l = {96}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f86134w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22197g f86135x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C22197g c22197g, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f86135x = c22197g;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f86135x, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f86134w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                PrivacyConsentApi privacyConsentApi = this.f86135x.api;
                this.f86134w = 1;
                Object privacyConsentSettingsV2 = privacyConsentApi.getPrivacyConsentSettingsV2(this);
                return privacyConsentSettingsV2 == enumC31071a ? enumC31071a : privacyConsentSettingsV2;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super PrivacyConsentSettingsResponse> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX INFO: renamed from: k42.g$c$b */
        @InterfaceC32271e(m100429c = "com.whoop.privacyconsent.interactor.PrivacyConsentInteractor$getSettingsAndDataSharing$1$2", m100430f = "PrivacyConsentInteractor.kt", m100431l = {98}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lu02/a$b;", "Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse;", "Ll83/a0;", "<anonymous>", "(Lu02/a$b;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f86136w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC13062m f86137x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f86137x = interfaceC13062m;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f86137x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC34385a.b<PrivacyConsentSettingsResponse> bVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((b) create(bVar, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f86136w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13062m interfaceC13062m = this.f86137x;
                    a.d dVar = a.d.f86119a;
                    this.f86136w = 1;
                    if (interfaceC13062m.emit(dVar, this) == enumC31071a) {
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

        /* JADX INFO: renamed from: k42.g$c$c, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.privacyconsent.interactor.PrivacyConsentInteractor$getSettingsAndDataSharing$1$3", m100430f = "PrivacyConsentInteractor.kt", m100431l = {AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB, 102, 104}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse;", "settingsResponse", "Ll83/a0;", "<anonymous>", "(Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C41875c extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f86138w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f86139x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C22197g f86140y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ InterfaceC13062m f86141z;

            /* JADX INFO: renamed from: k42.g$c$c$a */
            @InterfaceC32271e(m100429c = "com.whoop.privacyconsent.interactor.PrivacyConsentInteractor$getSettingsAndDataSharing$1$3$1", m100430f = "PrivacyConsentInteractor.kt", m100431l = {101}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/privacyconsent/api/DataSharingResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class a extends AbstractC32275i implements Function1 {

                /* JADX INFO: renamed from: w */
                int f86142w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ C22197g f86143x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(C22197g c22197g, InterfaceC30057d<? super a> interfaceC30057d) {
                    super(1, interfaceC30057d);
                    this.f86143x = c22197g;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                    return new a(this.f86143x, interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i13 = this.f86142w;
                    if (i13 != 0) {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                        return obj;
                    }
                    AbstractC34132o.m107864I(obj);
                    PrivacyConsentApi privacyConsentApi = this.f86143x.api;
                    this.f86142w = 1;
                    Object dataSharing = privacyConsentApi.getDataSharing(this);
                    return dataSharing == enumC31071a ? enumC31071a : dataSharing;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(InterfaceC30057d<? super DataSharingResponse> interfaceC30057d) {
                    return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }
            }

            /* JADX INFO: renamed from: k42.g$c$c$b */
            @InterfaceC32271e(m100429c = "com.whoop.privacyconsent.interactor.PrivacyConsentInteractor$getSettingsAndDataSharing$1$3$2", m100430f = "PrivacyConsentInteractor.kt", m100431l = {103}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lu02/a$b;", "Lcom/whoop/privacyconsent/api/DataSharingResponse;", "Ll83/a0;", "<anonymous>", "(Lu02/a$b;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class b extends AbstractC32275i implements InterfaceC4351m {

                /* JADX INFO: renamed from: w */
                int f86144w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ InterfaceC13062m f86145x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super b> interfaceC30057d) {
                    super(2, interfaceC30057d);
                    this.f86145x = interfaceC13062m;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                    return new b(this.f86145x, interfaceC30057d);
                }

                @Override // c93.InterfaceC4351m
                /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC34385a.b<DataSharingResponse> bVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                    return ((b) create(bVar, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i13 = this.f86144w;
                    if (i13 == 0) {
                        AbstractC34132o.m107864I(obj);
                        InterfaceC13062m interfaceC13062m = this.f86145x;
                        a.d dVar = a.d.f86119a;
                        this.f86144w = 1;
                        if (interfaceC13062m.emit(dVar, this) == enumC31071a) {
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

            /* JADX INFO: renamed from: k42.g$c$c$c, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.privacyconsent.interactor.PrivacyConsentInteractor$getSettingsAndDataSharing$1$3$3", m100430f = "PrivacyConsentInteractor.kt", m100431l = {105}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lcom/whoop/privacyconsent/api/DataSharingResponse;", "dataSharingResponse", "Ll83/a0;", "<anonymous>", "(Lcom/whoop/privacyconsent/api/DataSharingResponse;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class C41876c extends AbstractC32275i implements InterfaceC4351m {

                /* JADX INFO: renamed from: w */
                int f86146w;

                /* JADX INFO: renamed from: x */
                /* synthetic */ Object f86147x;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ InterfaceC13062m f86148y;

                /* JADX INFO: renamed from: z */
                final /* synthetic */ PrivacyConsentSettingsResponse f86149z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C41876c(InterfaceC13062m interfaceC13062m, PrivacyConsentSettingsResponse privacyConsentSettingsResponse, InterfaceC30057d<? super C41876c> interfaceC30057d) {
                    super(2, interfaceC30057d);
                    this.f86148y = interfaceC13062m;
                    this.f86149z = privacyConsentSettingsResponse;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                    C41876c c41876c = new C41876c(this.f86148y, this.f86149z, interfaceC30057d);
                    c41876c.f86147x = obj;
                    return c41876c;
                }

                @Override // c93.InterfaceC4351m
                /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
                public final Object invoke(DataSharingResponse dataSharingResponse, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                    return ((C41876c) create(dataSharingResponse, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    DataSharingResponse dataSharingResponse = (DataSharingResponse) this.f86147x;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i13 = this.f86146w;
                    if (i13 == 0) {
                        AbstractC34132o.m107864I(obj);
                        InterfaceC13062m interfaceC13062m = this.f86148y;
                        a.e eVar = new a.e(this.f86149z, dataSharingResponse);
                        this.f86147x = null;
                        this.f86146w = 1;
                        if (interfaceC13062m.emit(eVar, this) == enumC31071a) {
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
            public C41875c(C22197g c22197g, InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C41875c> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f86140y = c22197g;
                this.f86141z = interfaceC13062m;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                C41875c c41875c = new C41875c(this.f86140y, this.f86141z, interfaceC30057d);
                c41875c.f86139x = obj;
                return c41875c;
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(PrivacyConsentSettingsResponse privacyConsentSettingsResponse, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C41875c) create(privacyConsentSettingsResponse, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
            
                if (u02.AbstractC34386b.m108742g((u02.InterfaceC34385a) r0, r1, r13) == r9) goto L20;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                /*
                    r13 = this;
                    java.lang.Object r0 = r13.f86139x
                    r8 = r0
                    com.whoop.privacyconsent.api.PrivacyConsentSettingsResponse r8 = (com.whoop.privacyconsent.api.PrivacyConsentSettingsResponse) r8
                    r83.a r9 = r83.EnumC31071a.f128113w
                    int r0 = r13.f86138w
                    r10 = 3
                    r11 = 2
                    r1 = 1
                    r12 = 0
                    if (r0 == 0) goto L2b
                    if (r0 == r1) goto L26
                    if (r0 == r11) goto L21
                    if (r0 != r10) goto L19
                    p505ts.AbstractC34132o.m107864I(r14)
                    goto L77
                L19:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r1)
                    throw r0
                L21:
                    p505ts.AbstractC34132o.m107864I(r14)
                    r0 = r14
                    goto L63
                L26:
                    p505ts.AbstractC34132o.m107864I(r14)
                    r0 = r14
                    goto L4f
                L2b:
                    p505ts.AbstractC34132o.m107864I(r14)
                    u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                    k42.g r2 = r13.f86140y
                    tr2.n r2 = k42.C22197g.m63588f(r2)
                    k42.g$c$c$a r4 = new k42.g$c$c$a
                    k42.g r3 = r13.f86140y
                    r4.<init>(r3, r12)
                    r13.f86139x = r8
                    r13.f86138w = r1
                    r1 = r2
                    r2 = 0
                    java.lang.String r3 = "getPrivacyConsentDataSharing"
                    r6 = 2
                    r7 = 0
                    r5 = r13
                    java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                    if (r0 != r9) goto L4f
                    goto L76
                L4f:
                    u02.a r0 = (u02.InterfaceC34385a) r0
                    k42.g$c$c$b r1 = new k42.g$c$c$b
                    ec3.m r2 = r13.f86141z
                    r1.<init>(r2, r12)
                    r13.f86139x = r8
                    r13.f86138w = r11
                    java.lang.Object r0 = u02.AbstractC34386b.m108741f(r0, r1, r13)
                    if (r0 != r9) goto L63
                    goto L76
                L63:
                    u02.a r0 = (u02.InterfaceC34385a) r0
                    k42.g$c$c$c r1 = new k42.g$c$c$c
                    ec3.m r2 = r13.f86141z
                    r1.<init>(r2, r8, r12)
                    r13.f86139x = r12
                    r13.f86138w = r10
                    java.lang.Object r0 = u02.AbstractC34386b.m108742g(r0, r1, r13)
                    if (r0 != r9) goto L77
                L76:
                    return r9
                L77:
                    l83.a0 r0 = l83.C23454a0.f92919a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: k42.C22197g.c.C41875c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C22197g.this.new c(interfaceC30057d);
            cVar.f86132x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0076 A[PHI: r0
          0x0076: PHI (r0v9 java.lang.Object) = (r0v8 java.lang.Object), (r0v14 java.lang.Object) binds: [B:21:0x0073, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0087, code lost:
        
            if (u02.AbstractC34386b.m108742g((u02.InterfaceC34385a) r0, r1, r13) == r9) goto L25;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = r13.f86132x
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r13.f86131w
                r10 = 4
                r11 = 3
                r1 = 2
                r2 = 1
                r12 = 0
                if (r0 == 0) goto L33
                if (r0 == r2) goto L2f
                if (r0 == r1) goto L2a
                if (r0 == r11) goto L25
                if (r0 != r10) goto L1d
                p505ts.AbstractC34132o.m107864I(r14)
                goto L8a
            L1d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L25:
                p505ts.AbstractC34132o.m107864I(r14)
                r0 = r14
                goto L76
            L2a:
                p505ts.AbstractC34132o.m107864I(r14)
                r0 = r14
                goto L64
            L2f:
                p505ts.AbstractC34132o.m107864I(r14)
                goto L43
            L33:
                p505ts.AbstractC34132o.m107864I(r14)
                k42.g$a$f r0 = k42.C22197g.a.f.f86122a
                r13.f86132x = r8
                r13.f86131w = r2
                java.lang.Object r0 = r8.emit(r0, r13)
                if (r0 != r9) goto L43
                goto L89
            L43:
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                k42.g r2 = k42.C22197g.this
                tr2.n r2 = k42.C22197g.m63588f(r2)
                k42.g$c$a r4 = new k42.g$c$a
                k42.g r3 = k42.C22197g.this
                r4.<init>(r3, r12)
                r13.f86132x = r8
                r13.f86131w = r1
                r1 = r2
                r2 = 0
                java.lang.String r3 = "getPrivacyConsentSettings"
                r6 = 2
                r7 = 0
                r5 = r13
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L64
                goto L89
            L64:
                u02.a r0 = (u02.InterfaceC34385a) r0
                k42.g$c$b r1 = new k42.g$c$b
                r1.<init>(r8, r12)
                r13.f86132x = r8
                r13.f86131w = r11
                java.lang.Object r0 = u02.AbstractC34386b.m108741f(r0, r1, r13)
                if (r0 != r9) goto L76
                goto L89
            L76:
                u02.a r0 = (u02.InterfaceC34385a) r0
                k42.g$c$c r1 = new k42.g$c$c
                k42.g r2 = k42.C22197g.this
                r1.<init>(r2, r8, r12)
                r13.f86132x = r12
                r13.f86131w = r10
                java.lang.Object r0 = u02.AbstractC34386b.m108742g(r0, r1, r13)
                if (r0 != r9) goto L8a
            L89:
                return r9
            L8a:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: k42.C22197g.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: k42.g$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.privacyconsent.interactor.PrivacyConsentInteractor$interact$$inlined$flatMapLatest$1", m100430f = "PrivacyConsentInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f86150w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f86151x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f86152y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C22197g f86153z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC30057d interfaceC30057d, C22197g c22197g) {
            super(3, interfaceC30057d);
            this.f86153z = c22197g;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC22195e abstractC22195e, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(interfaceC30057d, this.f86153z);
            dVar.f86151x = interfaceC13062m;
            dVar.f86152y = abstractC22195e;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l interfaceC13058lM63600w;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f86150w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f86151x;
                AbstractC22195e abstractC22195e = (AbstractC22195e) this.f86152y;
                if (AbstractC22676k.m65745e(abstractC22195e, AbstractC22195e.c.f86094a)) {
                    interfaceC13058lM63600w = this.f86153z.m63599r();
                } else if (AbstractC22676k.m65745e(abstractC22195e, AbstractC22195e.b.f86093a)) {
                    interfaceC13058lM63600w = this.f86153z.m63598q();
                } else if (abstractC22195e instanceof AbstractC22195e.f) {
                    C22197g c22197g = this.f86153z;
                    AbstractC22195e.f fVar = (AbstractC22195e.f) abstractC22195e;
                    interfaceC13058lM63600w = c22197g.m63602y(c22197g.userId, fVar.getSearchable(), fVar.getMutualCommunitySharing());
                } else if (abstractC22195e instanceof AbstractC22195e.a) {
                    AbstractC22195e.a aVar = (AbstractC22195e.a) abstractC22195e;
                    interfaceC13058lM63600w = this.f86153z.m63597o(aVar.getSearchable(), aVar.getMutualCommunitySharing());
                } else if (abstractC22195e instanceof AbstractC22195e.g) {
                    interfaceC13058lM63600w = this.f86153z.m63603z(((AbstractC22195e.g) abstractC22195e).getIsEnabled());
                } else if (abstractC22195e instanceof AbstractC22195e.e) {
                    interfaceC13058lM63600w = this.f86153z.m63601x(((AbstractC22195e.e) abstractC22195e).getAccountName());
                } else {
                    if (!(abstractC22195e instanceof AbstractC22195e.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC13058lM63600w = this.f86153z.m63600w(((AbstractC22195e.d) abstractC22195e).getIsEnabled());
                }
                this.f86151x = null;
                this.f86152y = null;
                this.f86150w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM63600w, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC22195e) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: k42.g$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.privacyconsent.interactor.PrivacyConsentInteractor$interact$2", m100430f = "PrivacyConsentInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lk42/f;", "previousDomainState", "Lk42/g$a;", "action", "<anonymous>", "(Lk42/f;Lk42/g$a;)Lk42/f;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f86154w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f86155x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f86156y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C22196f c22196f, a aVar, InterfaceC30057d<? super C22196f> interfaceC30057d) {
            e eVar = C22197g.this.new e(interfaceC30057d);
            eVar.f86155x = c22196f;
            eVar.f86156y = aVar;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C22196f c22196f = (C22196f) this.f86155x;
            a aVar = (a) this.f86156y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f86154w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC22676k.m65745e(aVar, a.f.f86122a)) {
                return C22196f.m63572b(c22196f, false, false, false, true, false, false, null, false, false, null, null, 2039, null);
            }
            if (AbstractC22676k.m65745e(aVar, a.d.f86119a)) {
                return C22196f.m63572b(C22197g.this.m63596n(c22196f), true, false, false, false, false, false, null, false, false, null, null, 2046, null);
            }
            if (AbstractC22676k.m65745e(aVar, a.c.f86118a)) {
                return C22196f.m63572b(C22197g.this.m63596n(c22196f), false, true, false, false, false, false, null, false, false, null, null, 2045, null);
            }
            if (AbstractC22676k.m65745e(aVar, a.i.f86125a)) {
                return C22196f.m63572b(C22197g.this.m63596n(c22196f), false, false, false, false, false, false, null, false, true, null, null, 1791, null);
            }
            if (aVar instanceof a.e) {
                a.e eVar = (a.e) aVar;
                boolean searchable = eVar.getSettingsResponse().getSearchable();
                Boolean mutualCommunitySharing = eVar.getSettingsResponse().getMutualCommunitySharing();
                return new C22196f(false, false, false, false, searchable, mutualCommunitySharing != null ? mutualCommunitySharing.booleanValue() : false, eVar.getSettingsResponse().getAllowRecommendation(), false, false, C22197g.this.m63607u(eVar.getDataSharingResponse()), null, 1415, null);
            }
            if (aVar instanceof a.j) {
                return C22196f.m63572b(c22196f, false, false, false, false, false, false, null, false, false, null, C22197g.this.m63604p(c22196f, ((a.j) aVar).getAccountName()), 1023, null);
            }
            if (aVar instanceof a.b) {
                a.b bVar = (a.b) aVar;
                return C22196f.m63572b(c22196f, false, false, true, false, bVar.getSearchable(), bVar.getMutualCommunitySharing(), null, false, false, null, null, 1985, null);
            }
            if (aVar instanceof a.C41874a) {
                a.C41874a c41874a = (a.C41874a) aVar;
                return C22196f.m63572b(c22196f, false, false, false, false, c41874a.getSearchable(), c41874a.getMutualCommunitySharing(), null, false, false, null, null, 1993, null);
            }
            if (aVar instanceof a.h) {
                return C22196f.m63572b(c22196f, false, false, false, false, false, false, Boolean.valueOf(((a.h) aVar).getIsEnabled()), true, false, null, null, 1591, null);
            }
            if (aVar instanceof a.g) {
                return C22196f.m63572b(c22196f, false, false, false, false, false, false, Boolean.valueOf(((a.g) aVar).getIsEnabled()), false, false, null, null, 1599, null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: k42.g$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.privacyconsent.interactor.PrivacyConsentInteractor$loading$1", m100430f = "PrivacyConsentInteractor.kt", m100431l = {152}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lk42/g$a$f;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f86158w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f86159x;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = new f(interfaceC30057d);
            fVar.f86159x = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f86159x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f86158w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                a.f fVar = a.f.f86122a;
                this.f86159x = null;
                this.f86158w = 1;
                if (interfaceC13062m.emit(fVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: k42.g$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.privacyconsent.interactor.PrivacyConsentInteractor$recommendationRefresh$1", m100430f = "PrivacyConsentInteractor.kt", m100431l = {148}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lk42/g$a$g;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f86160w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f86161x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f86162y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z4, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f86162y = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = new g(this.f86162y, interfaceC30057d);
            gVar.f86161x = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f86161x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f86160w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                a.g gVar = new a.g(this.f86162y);
                this.f86161x = null;
                this.f86160w = 1;
                if (interfaceC13062m.emit(gVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: k42.g$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.privacyconsent.interactor.PrivacyConsentInteractor$showDataSharingSheet$1", m100430f = "PrivacyConsentInteractor.kt", m100431l = {140}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lk42/g$a$j;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f86163w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f86164x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f86165y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f86165y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = new h(this.f86165y, interfaceC30057d);
            hVar.f86164x = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f86164x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f86163w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                a.j jVar = new a.j(this.f86165y);
                this.f86164x = null;
                this.f86163w = 1;
                if (interfaceC13062m.emit(jVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: k42.g$i */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.privacyconsent.interactor.PrivacyConsentInteractor$toggleCommunitySettings$1", m100430f = "PrivacyConsentInteractor.kt", m100431l = {116, 118, 120, 122}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lk42/g$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ boolean f86166E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C22197g f86167F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ int f86168G;

        /* JADX INFO: renamed from: w */
        Object f86169w;

        /* JADX INFO: renamed from: x */
        int f86170x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f86171y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f86172z;

        /* JADX INFO: renamed from: k42.g$i$a */
        @InterfaceC32271e(m100429c = "com.whoop.privacyconsent.interactor.PrivacyConsentInteractor$toggleCommunitySettings$1$1", m100430f = "PrivacyConsentInteractor.kt", m100431l = {119}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f86173w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22197g f86174x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ int f86175y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ SearchableSetting f86176z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C22197g c22197g, int i13, SearchableSetting searchableSetting, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f86174x = c22197g;
                this.f86175y = i13;
                this.f86176z = searchableSetting;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f86174x, this.f86175y, this.f86176z, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f86173w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                PrivacyConsentApi privacyConsentApi = this.f86174x.api;
                int i14 = this.f86175y;
                SearchableSetting searchableSetting = this.f86176z;
                this.f86173w = 1;
                Object obj2 = privacyConsentApi.toggleTeamInvitation(i14, searchableSetting, this);
                return obj2 == enumC31071a ? enumC31071a : obj2;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super PrivacyConsentSettingsResponse> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX INFO: renamed from: k42.g$i$b */
        @InterfaceC32271e(m100429c = "com.whoop.privacyconsent.interactor.PrivacyConsentInteractor$toggleCommunitySettings$1$2", m100430f = "PrivacyConsentInteractor.kt", m100431l = {121}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lu02/a$b;", "Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse;", "Ll83/a0;", "<anonymous>", "(Lu02/a$b;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f86177w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC13062m f86178x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f86178x = interfaceC13062m;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f86178x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC34385a.b<PrivacyConsentSettingsResponse> bVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((b) create(bVar, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f86177w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13062m interfaceC13062m = this.f86178x;
                    a.c cVar = a.c.f86118a;
                    this.f86177w = 1;
                    if (interfaceC13062m.emit(cVar, this) == enumC31071a) {
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

        /* JADX INFO: renamed from: k42.g$i$c */
        @InterfaceC32271e(m100429c = "com.whoop.privacyconsent.interactor.PrivacyConsentInteractor$toggleCommunitySettings$1$3", m100430f = "PrivacyConsentInteractor.kt", m100431l = {123}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse;", "it", "Ll83/a0;", "<anonymous>", "(Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class c extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f86179w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f86180x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC13062m f86181y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super c> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f86181y = interfaceC13062m;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                c cVar = new c(this.f86181y, interfaceC30057d);
                cVar.f86180x = obj;
                return cVar;
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(PrivacyConsentSettingsResponse privacyConsentSettingsResponse, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((c) create(privacyConsentSettingsResponse, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                PrivacyConsentSettingsResponse privacyConsentSettingsResponse = (PrivacyConsentSettingsResponse) this.f86180x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f86179w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13062m interfaceC13062m = this.f86181y;
                    boolean searchable = privacyConsentSettingsResponse.getSearchable();
                    Boolean mutualCommunitySharing = privacyConsentSettingsResponse.getMutualCommunitySharing();
                    a.b bVar = new a.b(searchable, mutualCommunitySharing != null ? mutualCommunitySharing.booleanValue() : false);
                    this.f86180x = null;
                    this.f86179w = 1;
                    if (interfaceC13062m.emit(bVar, this) == enumC31071a) {
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
        public i(boolean z4, boolean z13, C22197g c22197g, int i13, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f86172z = z4;
            this.f86166E = z13;
            this.f86167F = c22197g;
            this.f86168G = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            i iVar = new i(this.f86172z, this.f86166E, this.f86167F, this.f86168G, interfaceC30057d);
            iVar.f86171y = obj;
            return iVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0092 A[PHI: r0
          0x0092: PHI (r0v10 java.lang.Object) = (r0v9 java.lang.Object), (r0v19 java.lang.Object) binds: [B:21:0x008f, B:11:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00a3, code lost:
        
            if (u02.AbstractC34386b.m108742g((u02.InterfaceC34385a) r0, r1, r13) == r9) goto L25;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = r13.f86171y
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r13.f86170x
                r10 = 4
                r11 = 3
                r1 = 2
                r2 = 1
                r12 = 0
                if (r0 == 0) goto L3f
                if (r0 == r2) goto L3b
                if (r0 == r1) goto L32
                if (r0 == r11) goto L29
                if (r0 != r10) goto L21
                java.lang.Object r0 = r13.f86169w
                com.whoop.privacyconsent.api.SearchableSetting r0 = (com.whoop.privacyconsent.api.SearchableSetting) r0
                p505ts.AbstractC34132o.m107864I(r14)
                goto La6
            L21:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L29:
                java.lang.Object r0 = r13.f86169w
                com.whoop.privacyconsent.api.SearchableSetting r0 = (com.whoop.privacyconsent.api.SearchableSetting) r0
                p505ts.AbstractC34132o.m107864I(r14)
                r0 = r14
                goto L92
            L32:
                java.lang.Object r0 = r13.f86169w
                com.whoop.privacyconsent.api.SearchableSetting r0 = (com.whoop.privacyconsent.api.SearchableSetting) r0
                p505ts.AbstractC34132o.m107864I(r14)
                r0 = r14
                goto L7e
            L3b:
                p505ts.AbstractC34132o.m107864I(r14)
                goto L4f
            L3f:
                p505ts.AbstractC34132o.m107864I(r14)
                k42.g$a$f r0 = k42.C22197g.a.f.f86122a
                r13.f86171y = r8
                r13.f86170x = r2
                java.lang.Object r0 = r8.emit(r0, r13)
                if (r0 != r9) goto L4f
                goto La5
            L4f:
                com.whoop.privacyconsent.api.SearchableSetting r0 = new com.whoop.privacyconsent.api.SearchableSetting
                boolean r2 = r13.f86172z
                boolean r3 = r13.f86166E
                r0.<init>(r2, r3)
                u02.a$a r2 = u02.InterfaceC34385a.INSTANCE
                k42.g r3 = r13.f86167F
                tr2.n r3 = k42.C22197g.m63588f(r3)
                k42.g$i$a r4 = new k42.g$i$a
                k42.g r6 = r13.f86167F
                int r7 = r13.f86168G
                r4.<init>(r6, r7, r0, r12)
                r13.f86171y = r8
                r13.f86169w = r12
                r13.f86170x = r1
                r0 = r2
                r2 = 0
                r1 = r3
                java.lang.String r3 = "toggleCommunitySettings"
                r6 = 2
                r7 = 0
                r5 = r13
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L7e
                goto La5
            L7e:
                u02.a r0 = (u02.InterfaceC34385a) r0
                k42.g$i$b r1 = new k42.g$i$b
                r1.<init>(r8, r12)
                r13.f86171y = r8
                r13.f86169w = r12
                r13.f86170x = r11
                java.lang.Object r0 = u02.AbstractC34386b.m108741f(r0, r1, r13)
                if (r0 != r9) goto L92
                goto La5
            L92:
                u02.a r0 = (u02.InterfaceC34385a) r0
                k42.g$i$c r1 = new k42.g$i$c
                r1.<init>(r8, r12)
                r13.f86171y = r12
                r13.f86169w = r12
                r13.f86170x = r10
                java.lang.Object r0 = u02.AbstractC34386b.m108742g(r0, r1, r13)
                if (r0 != r9) goto La6
            La5:
                return r9
            La6:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: k42.C22197g.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: k42.g$j */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.privacyconsent.interactor.PrivacyConsentInteractor$toggleRecommendation$1", m100430f = "PrivacyConsentInteractor.kt", m100431l = {128, 130, 132, 134}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lk42/g$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C22197g f86182E;

        /* JADX INFO: renamed from: w */
        Object f86183w;

        /* JADX INFO: renamed from: x */
        int f86184x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f86185y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f86186z;

        /* JADX INFO: renamed from: k42.g$j$a */
        @InterfaceC32271e(m100429c = "com.whoop.privacyconsent.interactor.PrivacyConsentInteractor$toggleRecommendation$1$1", m100430f = "PrivacyConsentInteractor.kt", m100431l = {131}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f86187w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22197g f86188x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ AllowRecommendationRequest f86189y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C22197g c22197g, AllowRecommendationRequest allowRecommendationRequest, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f86188x = c22197g;
                this.f86189y = allowRecommendationRequest;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f86188x, this.f86189y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f86187w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                PrivacyConsentApi privacyConsentApi = this.f86188x.api;
                AllowRecommendationRequest allowRecommendationRequest = this.f86189y;
                this.f86187w = 1;
                Object objUpdateAllowRecommendationV2 = privacyConsentApi.updateAllowRecommendationV2(allowRecommendationRequest, this);
                return objUpdateAllowRecommendationV2 == enumC31071a ? enumC31071a : objUpdateAllowRecommendationV2;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super PrivacyConsentSettingsResponse> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX INFO: renamed from: k42.g$j$b */
        @InterfaceC32271e(m100429c = "com.whoop.privacyconsent.interactor.PrivacyConsentInteractor$toggleRecommendation$1$2", m100430f = "PrivacyConsentInteractor.kt", m100431l = {133}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lu02/a$b;", "Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse;", "Ll83/a0;", "<anonymous>", "(Lu02/a$b;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f86190w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC13062m f86191x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f86191x = interfaceC13062m;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f86191x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC34385a.b<PrivacyConsentSettingsResponse> bVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((b) create(bVar, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f86190w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13062m interfaceC13062m = this.f86191x;
                    a.i iVar = a.i.f86125a;
                    this.f86190w = 1;
                    if (interfaceC13062m.emit(iVar, this) == enumC31071a) {
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

        /* JADX INFO: renamed from: k42.g$j$c */
        @InterfaceC32271e(m100429c = "com.whoop.privacyconsent.interactor.PrivacyConsentInteractor$toggleRecommendation$1$3", m100430f = "PrivacyConsentInteractor.kt", m100431l = {135}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse;", "it", "Ll83/a0;", "<anonymous>", "(Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class c extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f86192w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f86193x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC13062m f86194y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super c> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f86194y = interfaceC13062m;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                c cVar = new c(this.f86194y, interfaceC30057d);
                cVar.f86193x = obj;
                return cVar;
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(PrivacyConsentSettingsResponse privacyConsentSettingsResponse, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((c) create(privacyConsentSettingsResponse, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                PrivacyConsentSettingsResponse privacyConsentSettingsResponse = (PrivacyConsentSettingsResponse) this.f86193x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f86192w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13062m interfaceC13062m = this.f86194y;
                    a.h hVar = new a.h(AbstractC22676k.m65745e(privacyConsentSettingsResponse.getAllowRecommendation(), Boolean.TRUE));
                    this.f86193x = null;
                    this.f86192w = 1;
                    if (interfaceC13062m.emit(hVar, this) == enumC31071a) {
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
        public j(boolean z4, C22197g c22197g, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f86186z = z4;
            this.f86182E = c22197g;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            j jVar = new j(this.f86186z, this.f86182E, interfaceC30057d);
            jVar.f86185y = obj;
            return jVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x008e A[PHI: r0
          0x008e: PHI (r0v10 java.lang.Object) = (r0v9 java.lang.Object), (r0v19 java.lang.Object) binds: [B:21:0x008b, B:11:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x009f, code lost:
        
            if (u02.AbstractC34386b.m108742g((u02.InterfaceC34385a) r0, r1, r13) == r9) goto L25;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = r13.f86185y
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r13.f86184x
                r10 = 4
                r11 = 3
                r1 = 2
                r2 = 1
                r12 = 0
                if (r0 == 0) goto L3f
                if (r0 == r2) goto L3b
                if (r0 == r1) goto L32
                if (r0 == r11) goto L29
                if (r0 != r10) goto L21
                java.lang.Object r0 = r13.f86183w
                com.whoop.privacyconsent.api.AllowRecommendationRequest r0 = (com.whoop.privacyconsent.api.AllowRecommendationRequest) r0
                p505ts.AbstractC34132o.m107864I(r14)
                goto La2
            L21:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L29:
                java.lang.Object r0 = r13.f86183w
                com.whoop.privacyconsent.api.AllowRecommendationRequest r0 = (com.whoop.privacyconsent.api.AllowRecommendationRequest) r0
                p505ts.AbstractC34132o.m107864I(r14)
                r0 = r14
                goto L8e
            L32:
                java.lang.Object r0 = r13.f86183w
                com.whoop.privacyconsent.api.AllowRecommendationRequest r0 = (com.whoop.privacyconsent.api.AllowRecommendationRequest) r0
                p505ts.AbstractC34132o.m107864I(r14)
                r0 = r14
                goto L7a
            L3b:
                p505ts.AbstractC34132o.m107864I(r14)
                goto L4f
            L3f:
                p505ts.AbstractC34132o.m107864I(r14)
                k42.g$a$f r0 = k42.C22197g.a.f.f86122a
                r13.f86185y = r8
                r13.f86184x = r2
                java.lang.Object r0 = r8.emit(r0, r13)
                if (r0 != r9) goto L4f
                goto La1
            L4f:
                com.whoop.privacyconsent.api.AllowRecommendationRequest r0 = new com.whoop.privacyconsent.api.AllowRecommendationRequest
                boolean r2 = r13.f86186z
                r0.<init>(r2)
                u02.a$a r2 = u02.InterfaceC34385a.INSTANCE
                k42.g r3 = r13.f86182E
                tr2.n r3 = k42.C22197g.m63588f(r3)
                k42.g$j$a r4 = new k42.g$j$a
                k42.g r6 = r13.f86182E
                r4.<init>(r6, r0, r12)
                r13.f86185y = r8
                r13.f86183w = r12
                r13.f86184x = r1
                r0 = r2
                r2 = 0
                r1 = r3
                java.lang.String r3 = "toggleRecommendation"
                r6 = 2
                r7 = 0
                r5 = r13
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L7a
                goto La1
            L7a:
                u02.a r0 = (u02.InterfaceC34385a) r0
                k42.g$j$b r1 = new k42.g$j$b
                r1.<init>(r8, r12)
                r13.f86185y = r8
                r13.f86183w = r12
                r13.f86184x = r11
                java.lang.Object r0 = u02.AbstractC34386b.m108741f(r0, r1, r13)
                if (r0 != r9) goto L8e
                goto La1
            L8e:
                u02.a r0 = (u02.InterfaceC34385a) r0
                k42.g$j$c r1 = new k42.g$j$c
                r1.<init>(r8, r12)
                r13.f86185y = r12
                r13.f86183w = r12
                r13.f86184x = r10
                java.lang.Object r0 = u02.AbstractC34386b.m108742g(r0, r1, r13)
                if (r0 != r9) goto La2
            La1:
                return r9
            La2:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: k42.C22197g.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C22197g(PrivacyConsentApi api, InterfaceC34116n logger, C27858u userContext) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(userContext, "userContext");
        this.api = api;
        this.logger = logger;
        User userM84055f = userContext.m84055f();
        this.userId = userM84055f != null ? userM84055f.getId() : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final C22196f m63596n(C22196f c22196f) {
        return C22196f.m63572b(c22196f, false, false, false, false, false, false, null, false, false, null, null, 1780, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final InterfaceC13058l m63597o(boolean searchable, boolean mutualCommunitySharing) {
        return new C13084s1(new b(searchable, mutualCommunitySharing, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final InterfaceC13058l m63598q() {
        return new C13084s1(new c(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final InterfaceC13058l m63599r() {
        return new C13084s1(new f(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public final InterfaceC13058l m63600w(boolean isEnabled) {
        return new C13084s1(new g(isEnabled, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public final InterfaceC13058l m63601x(String accountName) {
        return new C13084s1(new h(accountName, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public final InterfaceC13058l m63602y(int userId, boolean searchable, boolean mutualCommunitySharing) {
        return new C13084s1(new i(searchable, mutualCommunitySharing, this, userId, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public final InterfaceC13058l m63603z(boolean isEnabled) {
        return new C13084s1(new j(isEnabled, this, null));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C22196f(false, false, false, false, false, false, null, false, false, null, null, 2039, null), AbstractC13091v.m36590P(upstream, new d(null, this)), new e(null));
    }

    /* JADX INFO: renamed from: p */
    public final C22192b m63604p(C22196f previousDomainState, String accountName) {
        List<C22192b> listM63560a;
        AbstractC22676k.m65750j(previousDomainState, "previousDomainState");
        AbstractC22676k.m65750j(accountName, "accountName");
        C22194d dataSharingDomainState = previousDomainState.getDataSharingDomainState();
        if (dataSharingDomainState == null || (listM63560a = dataSharingDomainState.m63560a()) == null) {
            return null;
        }
        for (C22192b c22192b : listM63560a) {
            if (AbstractC17176i.m48520v(c22192b.getAccountName(), Locale.ROOT, "toUpperCase(...)", accountName)) {
                return c22192b;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public final C22191a m63605s(AccountDataSharingResponse accountDataSharingResponse) {
        AbstractC22676k.m65750j(accountDataSharingResponse, "accountDataSharingResponse");
        return new C22191a(accountDataSharingResponse.getTitle(), accountDataSharingResponse.getSubtitle(), accountDataSharingResponse.getDisclaimer(), m63608v(accountDataSharingResponse.getDataSharingBoxes()));
    }

    /* JADX INFO: renamed from: t */
    public final List<C22192b> m63606t(List<AccountResponse> accountListResponse) {
        AbstractC22676k.m65750j(accountListResponse, "accountListResponse");
        ArrayList arrayList = new ArrayList();
        for (AccountResponse accountResponse : accountListResponse) {
            arrayList.add(new C22192b(accountResponse.getAccountName(), accountResponse.getDataSharingStatus(), accountResponse.getButtonText(), accountResponse.getIconName(), m63605s(accountResponse.getAccountDataSharing())));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: u */
    public final C22194d m63607u(DataSharingResponse dataSharingResponse) {
        AbstractC22676k.m65750j(dataSharingResponse, "dataSharingResponse");
        return new C22194d(dataSharingResponse.getTitle(), dataSharingResponse.getSubtitle(), m63606t(dataSharingResponse.getAccountList()), dataSharingResponse.getFooterText(), dataSharingResponse.getDisplay());
    }

    /* JADX INFO: renamed from: v */
    public final List<C22193c> m63608v(List<DataSharingBoxResponse> dataSharingBoxesResponse) {
        AbstractC22676k.m65750j(dataSharingBoxesResponse, "dataSharingBoxesResponse");
        ArrayList arrayList = new ArrayList();
        for (DataSharingBoxResponse dataSharingBoxResponse : dataSharingBoxesResponse) {
            arrayList.add(new C22193c(dataSharingBoxResponse.getIconName(), dataSharingBoxResponse.getTitle(), dataSharingBoxResponse.getSubtitle(), dataSharingBoxResponse.getViewableBy()));
        }
        return arrayList;
    }
}
