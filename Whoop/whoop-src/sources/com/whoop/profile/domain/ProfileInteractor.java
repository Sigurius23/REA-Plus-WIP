package com.whoop.profile.domain;

import ad3.AbstractC0757c;
import c93.InterfaceC4351m;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.appconfiguration.TabConfiguration;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.SmartAlarmTriggerRepository;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.profile.analytics.ProfileAnalyticsHelper;
import com.whoop.profile.domain.models.ProfileResponse;
import com.whoop.profile.presentation.ProfileEvent;
import com.whoop.whoopaction.domain.models.Action;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13045h2;
import ec3.C13052j1;
import ec3.C13054k;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.C13100y;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13075p1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ji0.InterfaceC21718f;
import l83.C23454a0;
import nm0.InterfaceC26834e;
import no.nordicsemi.android.dfu.DfuBaseService;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pm0.AbstractC29355b;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import qw2.C30695c;
import qw2.C30698f;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import tr2.InterfaceC34116n;
import u02.C34387c;
import u02.InterfaceC34385a;
import wm0.C37378a;
import y82.EnumC39339b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001DBg\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b!\u0010\"J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002¢\u0006\u0004\b)\u0010(J\u001d\u0010-\u001a\u00020\u00032\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*H\u0002¢\u0006\u0004\b-\u0010.J#\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0016¢\u0006\u0004\b0\u00101J!\u00102\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f¢\u0006\u0004\b2\u00101J\u0015\u00105\u001a\b\u0012\u0004\u0012\u0002030\u001fH\u0000¢\u0006\u0004\b4\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00107R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00108R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00109R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010:R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010;R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010<R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010=R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010>R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010?R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010?R\u001c\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001c\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010B¨\u0006E"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileInteractor;", "Lod1/g;", "Lcom/whoop/profile/domain/ProfileDomainAction;", "Lcom/whoop/profile/domain/ProfileDomainState;", "Lnm0/e;", "cachedApiSource", "Lu02/c;", "apiClient", "Lqw2/c;", "actionInteractor", "Lwm0/a;", "scopeCoordinator", "Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;", "analytics", "Lji0/f;", "bffBottomNavConfigSource", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ltr2/n;", "logger", "Lad3/c;", "json", "", ProfileApiKt.TARGET_USER_ID_PARAM, ProfileApiKt.COMMUNITY_ID_PARAM, "<init>", "(Lnm0/e;Lu02/c;Lqw2/c;Lwm0/a;Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;Lji0/f;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;Lad3/c;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "", "cardButtonId", "Lec3/l;", "Lcom/whoop/profile/domain/ProfileInternalDomainAction;", "performAction", "(Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;)Lec3/l;", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "handleInteraction", "(Lcom/whoop/navigation/models/GenericInteraction;)Lec3/l;", "reportProfile", "()Lec3/l;", "loadProfile", "Lpm0/a$c;", "Lcom/whoop/profile/domain/models/ProfileResponse;", "cacheResult", "handleError", "(Lpm0/a$c;)Lcom/whoop/profile/domain/ProfileDomainState;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "profileStateFlow", "", "settingsGearEnabledFlow$profile_release", "settingsGearEnabledFlow", "Lnm0/e;", "Lu02/c;", "Lqw2/c;", "Lwm0/a;", "Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;", "Lji0/f;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Ltr2/n;", "Lad3/c;", "Ljava/lang/Integer;", "Lec3/p1;", "inFlightCardButtonIdHolder", "Lec3/p1;", "reportedAvatarUrlHolder", "InternalResult", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ProfileInteractor implements InterfaceC27844g<ProfileDomainAction, ProfileDomainState> {
    public static final int $stable = 8;
    private final C30695c actionInteractor;
    private final ProfileAnalyticsHelper analytics;
    private final C34387c apiClient;
    private final InterfaceC21718f bffBottomNavConfigSource;
    private final InterfaceC26834e cachedApiSource;
    private final Integer communityId;
    private final FeatureFlagChecker featureFlagChecker;
    private final InterfaceC13075p1 inFlightCardButtonIdHolder;
    private final AbstractC0757c json;
    private final InterfaceC34116n logger;
    private final InterfaceC13075p1 reportedAvatarUrlHolder;
    private final C37378a scopeCoordinator;
    private final Integer targetUserId;

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileInteractor$InternalResult;", "", "<init>", "()V", "Loading", EnumC39339b.RESULT_SUCCESS, "Updating", "ErrorWithData", "Error", "Lcom/whoop/profile/domain/ProfileInteractor$InternalResult$Error;", "Lcom/whoop/profile/domain/ProfileInteractor$InternalResult$ErrorWithData;", "Lcom/whoop/profile/domain/ProfileInteractor$InternalResult$Loading;", "Lcom/whoop/profile/domain/ProfileInteractor$InternalResult$Success;", "Lcom/whoop/profile/domain/ProfileInteractor$InternalResult$Updating;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class InternalResult {

        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileInteractor$InternalResult$Error;", "Lcom/whoop/profile/domain/ProfileInteractor$InternalResult;", "errorState", "Lcom/whoop/profile/domain/ProfileDomainState;", "<init>", "(Lcom/whoop/profile/domain/ProfileDomainState;)V", "getErrorState", "()Lcom/whoop/profile/domain/ProfileDomainState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class Error extends InternalResult {
            public static final int $stable = 8;
            private final ProfileDomainState errorState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(ProfileDomainState errorState) {
                super(null);
                AbstractC22676k.m65750j(errorState, "errorState");
                this.errorState = errorState;
            }

            public static /* synthetic */ Error copy$default(Error error, ProfileDomainState profileDomainState, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    profileDomainState = error.errorState;
                }
                return error.copy(profileDomainState);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final ProfileDomainState getErrorState() {
                return this.errorState;
            }

            public final Error copy(ProfileDomainState errorState) {
                AbstractC22676k.m65750j(errorState, "errorState");
                return new Error(errorState);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && AbstractC22676k.m65745e(this.errorState, ((Error) other).errorState);
            }

            public final ProfileDomainState getErrorState() {
                return this.errorState;
            }

            public int hashCode() {
                return this.errorState.hashCode();
            }

            public String toString() {
                return "Error(errorState=" + this.errorState + ")";
            }
        }

        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileInteractor$InternalResult$ErrorWithData;", "Lcom/whoop/profile/domain/ProfileInteractor$InternalResult;", "response", "Lcom/whoop/profile/domain/models/ProfileResponse;", "<init>", "(Lcom/whoop/profile/domain/models/ProfileResponse;)V", "getResponse", "()Lcom/whoop/profile/domain/models/ProfileResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class ErrorWithData extends InternalResult {
            public static final int $stable = 8;
            private final ProfileResponse response;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ErrorWithData(ProfileResponse response) {
                super(null);
                AbstractC22676k.m65750j(response, "response");
                this.response = response;
            }

            public static /* synthetic */ ErrorWithData copy$default(ErrorWithData errorWithData, ProfileResponse profileResponse, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    profileResponse = errorWithData.response;
                }
                return errorWithData.copy(profileResponse);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final ProfileResponse getResponse() {
                return this.response;
            }

            public final ErrorWithData copy(ProfileResponse response) {
                AbstractC22676k.m65750j(response, "response");
                return new ErrorWithData(response);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ErrorWithData) && AbstractC22676k.m65745e(this.response, ((ErrorWithData) other).response);
            }

            public final ProfileResponse getResponse() {
                return this.response;
            }

            public int hashCode() {
                return this.response.hashCode();
            }

            public String toString() {
                return "ErrorWithData(response=" + this.response + ")";
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileInteractor$InternalResult$Loading;", "Lcom/whoop/profile/domain/ProfileInteractor$InternalResult;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Loading extends InternalResult {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }
        }

        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileInteractor$InternalResult$Success;", "Lcom/whoop/profile/domain/ProfileInteractor$InternalResult;", "response", "Lcom/whoop/profile/domain/models/ProfileResponse;", "manualRefresh", "", "<init>", "(Lcom/whoop/profile/domain/models/ProfileResponse;Z)V", "getResponse", "()Lcom/whoop/profile/domain/models/ProfileResponse;", "getManualRefresh", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class Success extends InternalResult {
            public static final int $stable = 8;
            private final boolean manualRefresh;
            private final ProfileResponse response;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(ProfileResponse response, boolean z4) {
                super(null);
                AbstractC22676k.m65750j(response, "response");
                this.response = response;
                this.manualRefresh = z4;
            }

            public static /* synthetic */ Success copy$default(Success success, ProfileResponse profileResponse, boolean z4, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    profileResponse = success.response;
                }
                if ((i13 & 2) != 0) {
                    z4 = success.manualRefresh;
                }
                return success.copy(profileResponse, z4);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final ProfileResponse getResponse() {
                return this.response;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final boolean getManualRefresh() {
                return this.manualRefresh;
            }

            public final Success copy(ProfileResponse response, boolean manualRefresh) {
                AbstractC22676k.m65750j(response, "response");
                return new Success(response, manualRefresh);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return AbstractC22676k.m65745e(this.response, success.response) && this.manualRefresh == success.manualRefresh;
            }

            public final boolean getManualRefresh() {
                return this.manualRefresh;
            }

            public final ProfileResponse getResponse() {
                return this.response;
            }

            public int hashCode() {
                return Boolean.hashCode(this.manualRefresh) + (this.response.hashCode() * 31);
            }

            public String toString() {
                return "Success(response=" + this.response + ", manualRefresh=" + this.manualRefresh + ")";
            }
        }

        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileInteractor$InternalResult$Updating;", "Lcom/whoop/profile/domain/ProfileInteractor$InternalResult;", "response", "Lcom/whoop/profile/domain/models/ProfileResponse;", "manualRefresh", "", "<init>", "(Lcom/whoop/profile/domain/models/ProfileResponse;Z)V", "getResponse", "()Lcom/whoop/profile/domain/models/ProfileResponse;", "getManualRefresh", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class Updating extends InternalResult {
            public static final int $stable = 8;
            private final boolean manualRefresh;
            private final ProfileResponse response;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Updating(ProfileResponse response, boolean z4) {
                super(null);
                AbstractC22676k.m65750j(response, "response");
                this.response = response;
                this.manualRefresh = z4;
            }

            public static /* synthetic */ Updating copy$default(Updating updating, ProfileResponse profileResponse, boolean z4, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    profileResponse = updating.response;
                }
                if ((i13 & 2) != 0) {
                    z4 = updating.manualRefresh;
                }
                return updating.copy(profileResponse, z4);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final ProfileResponse getResponse() {
                return this.response;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final boolean getManualRefresh() {
                return this.manualRefresh;
            }

            public final Updating copy(ProfileResponse response, boolean manualRefresh) {
                AbstractC22676k.m65750j(response, "response");
                return new Updating(response, manualRefresh);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Updating)) {
                    return false;
                }
                Updating updating = (Updating) other;
                return AbstractC22676k.m65745e(this.response, updating.response) && this.manualRefresh == updating.manualRefresh;
            }

            public final boolean getManualRefresh() {
                return this.manualRefresh;
            }

            public final ProfileResponse getResponse() {
                return this.response;
            }

            public int hashCode() {
                return Boolean.hashCode(this.manualRefresh) + (this.response.hashCode() * 31);
            }

            public String toString() {
                return "Updating(response=" + this.response + ", manualRefresh=" + this.manualRefresh + ")";
            }
        }

        public /* synthetic */ InternalResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private InternalResult() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.profile.domain.ProfileInteractor$interact$2 */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.profile.domain.ProfileInteractor$interact$2", m100430f = "ProfileInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/profile/domain/ProfileDomainState;", "previousState", "internal", "Lcom/whoop/profile/domain/ProfileInternalDomainAction;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C96922 extends AbstractC32275i implements Function3 {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public C96922(InterfaceC30057d<? super C96922> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(ProfileDomainState profileDomainState, ProfileInternalDomainAction profileInternalDomainAction, InterfaceC30057d<? super ProfileDomainState> interfaceC30057d) {
            C96922 c96922 = ProfileInteractor.this.new C96922(interfaceC30057d);
            c96922.L$0 = profileDomainState;
            c96922.L$1 = profileInternalDomainAction;
            return c96922.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            ProfileDomainState profileDomainStateCopy$default = (ProfileDomainState) this.L$0;
            ProfileInternalDomainAction profileInternalDomainAction = (ProfileInternalDomainAction) this.L$1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (profileInternalDomainAction instanceof ProfileInternalDomainAction.LoadData) {
                profileDomainStateCopy$default = ((ProfileInternalDomainAction.LoadData) profileInternalDomainAction).getDomainState();
            } else if (profileInternalDomainAction instanceof ProfileInternalDomainAction.UpdateModal) {
                profileDomainStateCopy$default = ProfileDomainState.copy$default(profileDomainStateCopy$default, null, null, false, false, ((ProfileInternalDomainAction.UpdateModal) profileInternalDomainAction).getModal(), null, null, null, false, 495, null);
            } else if (profileInternalDomainAction instanceof ProfileInternalDomainAction.UpdateDialogType) {
                profileDomainStateCopy$default = ProfileDomainState.copy$default(profileDomainStateCopy$default, ((ProfileInternalDomainAction.UpdateDialogType) profileInternalDomainAction).getDialogType(), null, false, false, null, null, null, null, false, 510, null);
            } else if (profileInternalDomainAction instanceof ProfileInternalDomainAction.UpdateNavigation) {
                profileDomainStateCopy$default = ProfileDomainState.copy$default(profileDomainStateCopy$default, null, null, false, false, null, ((ProfileInternalDomainAction.UpdateNavigation) profileInternalDomainAction).getNavigation(), null, null, false, 479, null);
            } else if (profileInternalDomainAction instanceof ProfileInternalDomainAction.ClearSideEffects) {
                profileDomainStateCopy$default = ProfileDomainState.copy$default(profileDomainStateCopy$default, null, null, false, false, null, null, null, null, false, 479, null);
            } else if (profileInternalDomainAction instanceof ProfileInternalDomainAction.UpdateReportResult) {
                profileDomainStateCopy$default = ProfileDomainState.copy$default(profileDomainStateCopy$default, null, null, false, false, null, null, null, ((ProfileInternalDomainAction.UpdateReportResult) profileInternalDomainAction).getResult(), false, 383, null);
            } else if (!(profileInternalDomainAction instanceof ProfileInternalDomainAction.SyncInFlightCardButton)) {
                throw new NoWhenBranchMatchedException();
            }
            return ProfileDomainState.copy$default(profileDomainStateCopy$default, null, null, false, false, null, null, (String) ((C13045h2) ProfileInteractor.this.inFlightCardButtonIdHolder).getValue(), null, false, 447, null);
        }
    }

    /* JADX INFO: renamed from: com.whoop.profile.domain.ProfileInteractor$loadProfile$1 */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.profile.domain.ProfileInteractor$loadProfile$1", m100430f = "ProfileInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lpm0/a;", "Lcom/whoop/profile/domain/models/ProfileResponse;", "cacheResult", "Ll83/a0;", "<anonymous>", "(Lpm0/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C96951 extends AbstractC32275i implements InterfaceC4351m {
        /* synthetic */ Object L$0;
        int label;

        public C96951(InterfaceC30057d<? super C96951> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C96951 c96951 = ProfileInteractor.this.new C96951(interfaceC30057d);
            c96951.L$0 = obj;
            return c96951;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC29354a interfaceC29354a = (InterfaceC29354a) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (interfaceC29354a instanceof InterfaceC29354a.a) {
                ((C13045h2) ProfileInteractor.this.reportedAvatarUrlHolder).m36570j(((ProfileResponse) ((InterfaceC29354a.a) interfaceC29354a).getData()).getProfileMetadata().getUserData().getProfileImageUrl());
            }
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC29354a<ProfileResponse> interfaceC29354a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C96951) create(interfaceC29354a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.profile.domain.ProfileInteractor$loadProfile$4 */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.profile.domain.ProfileInteractor$loadProfile$4", m100430f = "ProfileInteractor.kt", m100431l = {230}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/profile/domain/ProfileInternalDomainAction$LoadData;", "", "exception", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C96964 extends AbstractC32275i implements Function3 {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public C96964(InterfaceC30057d<? super C96964> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C96964 c96964 = ProfileInteractor.this.new C96964(interfaceC30057d);
            c96964.L$0 = interfaceC13062m;
            c96964.L$1 = th3;
            return c96964.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.L$0;
            Throwable th3 = (Throwable) this.L$1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                ProfileInteractor.this.logger.mo85230v("Caught exception during data processing", th3, new AbstractC30556a.a[0]);
                ProfileInternalDomainAction.LoadData loadData = new ProfileInternalDomainAction.LoadData(new ProfileDomainState(ProfileDialogType.RequestFailed.INSTANCE, null, false, false, null, null, null, null, false, 510, null));
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (interfaceC13062m.emit(loadData, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.profile.domain.ProfileInteractor$performAction$2 */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.profile.domain.ProfileInteractor$performAction$2", m100430f = "ProfileInteractor.kt", m100431l = {138}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/profile/domain/ProfileInternalDomainAction;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C96972 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $cardButtonId;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ProfileInteractor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C96972(String str, ProfileInteractor profileInteractor, InterfaceC30057d<? super C96972> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$cardButtonId = str;
            this.this$0 = profileInteractor;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C96972 c96972 = new C96972(this.$cardButtonId, this.this$0, interfaceC30057d);
            c96972.L$0 = obj;
            return c96972;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C96972) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (this.$cardButtonId != null) {
                    ((C13045h2) this.this$0.inFlightCardButtonIdHolder).m36570j(this.$cardButtonId);
                }
                ProfileInternalDomainAction.UpdateModal updateModal = new ProfileInternalDomainAction.UpdateModal(null);
                this.L$0 = null;
                this.label = 1;
                if (interfaceC13062m.emit(updateModal, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.profile.domain.ProfileInteractor$performAction$3 */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.profile.domain.ProfileInteractor$performAction$3", m100430f = "ProfileInteractor.kt", m100431l = {143}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/profile/domain/ProfileInternalDomainAction;", "", "it", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C96983 extends AbstractC32275i implements Function3 {
        final /* synthetic */ String $cardButtonId;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ProfileInteractor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C96983(String str, ProfileInteractor profileInteractor, InterfaceC30057d<? super C96983> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.$cardButtonId = str;
            this.this$0 = profileInteractor;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C96983 c96983 = new C96983(this.$cardButtonId, this.this$0, interfaceC30057d);
            c96983.L$0 = interfaceC13062m;
            return c96983.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (this.$cardButtonId != null) {
                    ((C13045h2) this.this$0.inFlightCardButtonIdHolder).m36570j(null);
                    ProfileInternalDomainAction.SyncInFlightCardButton syncInFlightCardButton = ProfileInternalDomainAction.SyncInFlightCardButton.INSTANCE;
                    this.L$0 = null;
                    this.label = 1;
                    if (interfaceC13062m.emit(syncInFlightCardButton, this) == enumC31071a) {
                        return enumC31071a;
                    }
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

    /* JADX INFO: renamed from: com.whoop.profile.domain.ProfileInteractor$profileStateFlow$1 */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.profile.domain.ProfileInteractor$profileStateFlow$1", m100430f = "ProfileInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/profile/domain/ProfileDomainState;", "state", "showSettingsButton", ""}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C96991 extends AbstractC32275i implements Function3 {
        /* synthetic */ Object L$0;
        /* synthetic */ boolean Z$0;
        int label;

        public C96991(InterfaceC30057d<? super C96991> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(ProfileDomainState profileDomainState, boolean z4, InterfaceC30057d<? super ProfileDomainState> interfaceC30057d) {
            C96991 c96991 = new C96991(interfaceC30057d);
            c96991.L$0 = profileDomainState;
            c96991.Z$0 = z4;
            return c96991.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            ProfileDomainState profileDomainState = (ProfileDomainState) this.L$0;
            boolean z4 = this.Z$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ProfileDomainState.copy$default(profileDomainState, null, null, false, false, null, null, null, null, z4, 255, null);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((ProfileDomainState) obj, ((Boolean) obj2).booleanValue(), (InterfaceC30057d<? super ProfileDomainState>) obj3);
        }
    }

    /* JADX INFO: renamed from: com.whoop.profile.domain.ProfileInteractor$reportProfile$1 */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.profile.domain.ProfileInteractor$reportProfile$1", m100430f = "ProfileInteractor.kt", m100431l = {169, 177, 184}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/profile/domain/ProfileInternalDomainAction;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C97001 extends AbstractC32275i implements InterfaceC4351m {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        public C97001(InterfaceC30057d<? super C97001> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C97001 c97001 = ProfileInteractor.this.new C97001(interfaceC30057d);
            c97001.L$0 = obj;
            return c97001;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C97001) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00ce A[RETURN] */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objM108729b;
            ProfileReportResult profileReportResult;
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (ProfileInteractor.this.targetUserId == null) {
                    ProfileInteractor.this.logger.mo85222m("Cannot report a profile without a target user id", new AbstractC30556a.a[0]);
                    ProfileInternalDomainAction.UpdateReportResult updateReportResult = new ProfileInternalDomainAction.UpdateReportResult(ProfileReportResult.FAILURE);
                    this.L$0 = null;
                    this.label = 1;
                    if (interfaceC13062m.emit(updateReportResult, this) != enumC31071a) {
                        return c23454a0;
                    }
                } else {
                    ReportAvatarRequest reportAvatarRequest = new ReportAvatarRequest(ProfileInteractor.this.targetUserId.intValue(), (String) ((C13045h2) ProfileInteractor.this.reportedAvatarUrlHolder).getValue());
                    InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                    InterfaceC34116n interfaceC34116n = ProfileInteractor.this.logger;
                    ProfileInteractor$reportProfile$1$apiResult$1 profileInteractor$reportProfile$1$apiResult$1 = new ProfileInteractor$reportProfile$1$apiResult$1(ProfileInteractor.this, reportAvatarRequest, null);
                    this.L$0 = interfaceC13062m;
                    this.L$1 = null;
                    this.label = 2;
                    objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to report profile", profileInteractor$reportProfile$1$apiResult$1, this, 2, null);
                    if (objM108729b != enumC31071a) {
                    }
                }
                return enumC31071a;
            }
            if (i13 == 1) {
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            }
            if (i13 != 2) {
                if (i13 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            }
            AbstractC34132o.m107864I(obj);
            objM108729b = obj;
            InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
            if (interfaceC34385a instanceof InterfaceC34385a.c) {
                profileReportResult = ProfileReportResult.SUCCESS;
            } else {
                if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                profileReportResult = ProfileReportResult.FAILURE;
            }
            ProfileInternalDomainAction.UpdateReportResult updateReportResult2 = new ProfileInternalDomainAction.UpdateReportResult(profileReportResult);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 3;
            if (interfaceC13062m.emit(updateReportResult2, this) == enumC31071a) {
                return enumC31071a;
            }
            return c23454a0;
        }
    }

    public ProfileInteractor(InterfaceC26834e cachedApiSource, C34387c apiClient, C30695c actionInteractor, C37378a scopeCoordinator, ProfileAnalyticsHelper analytics, InterfaceC21718f bffBottomNavConfigSource, FeatureFlagChecker featureFlagChecker, InterfaceC34116n logger, AbstractC0757c json, Integer num, Integer num2) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(apiClient, "apiClient");
        AbstractC22676k.m65750j(actionInteractor, "actionInteractor");
        AbstractC22676k.m65750j(scopeCoordinator, "scopeCoordinator");
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(bffBottomNavConfigSource, "bffBottomNavConfigSource");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(json, "json");
        this.cachedApiSource = cachedApiSource;
        this.apiClient = apiClient;
        this.actionInteractor = actionInteractor;
        this.scopeCoordinator = scopeCoordinator;
        this.analytics = analytics;
        this.bffBottomNavConfigSource = bffBottomNavConfigSource;
        this.featureFlagChecker = featureFlagChecker;
        this.logger = logger;
        this.json = json;
        this.targetUserId = num;
        this.communityId = num2;
        this.inFlightCardButtonIdHolder = AbstractC13091v.m36593c(null);
        this.reportedAvatarUrlHolder = AbstractC13091v.m36593c(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProfileDomainState handleError(InterfaceC29354a.c<ProfileResponse> cacheResult) {
        return AbstractC29355b.m89462a(cacheResult) ? new ProfileDomainState(ProfileDialogType.RequestFailed.INSTANCE, null, false, false, null, null, null, null, false, 510, null) : new ProfileDomainState(ProfileDialogType.NetworkError.INSTANCE, null, false, false, null, null, null, null, false, 510, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC13058l handleInteraction(GenericInteraction interaction) {
        ProfileInteractionResolution profileInteractionResolutionResolve = ProfileGenericInteractionHandler.INSTANCE.resolve(interaction, this.json);
        AnalyticEventModel analyticEvent = profileInteractionResolutionResolve.getAnalyticEvent();
        if (analyticEvent != null) {
            this.analytics.sendAnalytics(new ProfileEvent.BffAnalyticEvent(analyticEvent));
        }
        if (profileInteractionResolutionResolve instanceof ProfileInteractionResolution.PresentModal) {
            return new C0456u(new ProfileInternalDomainAction.UpdateModal(((ProfileInteractionResolution.PresentModal) profileInteractionResolutionResolve).getModal()), 1);
        }
        if (profileInteractionResolutionResolve instanceof ProfileInteractionResolution.PerformAction) {
            return performAction$default(this, ((ProfileInteractionResolution.PerformAction) profileInteractionResolutionResolve).getAction(), null, 2, null);
        }
        if (profileInteractionResolutionResolve instanceof ProfileInteractionResolution.Navigate) {
            return new C0456u(new ProfileInternalDomainAction.UpdateNavigation(new ProfileNavigationEffect.BackendDriven(((ProfileInteractionResolution.Navigate) profileInteractionResolutionResolve).getDestination(), null, 2, null)), 1);
        }
        if (profileInteractionResolutionResolve instanceof ProfileInteractionResolution.None) {
            return C13054k.f45116w;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC13058l loadProfile() {
        final C13052j1 c13052j1 = new C13052j1(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetProfileRequest(this.targetUserId, this.communityId), 1), AbstractC12350b.m34570S(SmartAlarmTriggerRepository.DEFAULT_REFRESH_SCOPE), null, 2, null), new ProfileInteractor$loadProfile$$inlined$cacheAPI$1(null, this.cachedApiSource)), new C96951(null), 0);
        final InterfaceC13058l interfaceC13058l = new InterfaceC13058l() { // from class: com.whoop.profile.domain.ProfileInteractor$loadProfile$$inlined$map$1

            /* JADX INFO: renamed from: com.whoop.profile.domain.ProfileInteractor$loadProfile$$inlined$map$1$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C96932<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;
                final /* synthetic */ ProfileInteractor this$0;

                /* JADX INFO: renamed from: com.whoop.profile.domain.ProfileInteractor$loadProfile$$inlined$map$1$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "com.whoop.profile.domain.ProfileInteractor$loadProfile$$inlined$map$1$2", m100430f = "ProfileInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class AnonymousClass1 extends AbstractC32269c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C96932.this.emit(null, this);
                    }
                }

                public C96932(InterfaceC13062m interfaceC13062m, ProfileInteractor profileInteractor) {
                    this.$this_unsafeFlow = interfaceC13062m;
                    this.this$0 = profileInteractor;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    AnonymousClass1 anonymousClass1;
                    Object error;
                    Object obj2;
                    if (interfaceC30057d instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC30057d;
                        int i13 = anonymousClass1.label;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i13 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                    }
                    Object obj3 = anonymousClass1.result;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = anonymousClass1.label;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj3);
                        InterfaceC13062m interfaceC13062m = this.$this_unsafeFlow;
                        InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                        if (interfaceC29354a instanceof InterfaceC29354a.e) {
                            obj2 = ProfileInteractor.InternalResult.Loading.INSTANCE;
                        } else {
                            if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                                error = new ProfileInteractor.InternalResult.Success((ProfileResponse) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData(), false);
                            } else if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                                error = new ProfileInteractor.InternalResult.Updating((ProfileResponse) ((InterfaceC29354a.a.b) interfaceC29354a).getData(), false);
                            } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                                error = new ProfileInteractor.InternalResult.ErrorWithData((ProfileResponse) ((InterfaceC29354a.d) interfaceC29354a).getData());
                            } else {
                                if (!(interfaceC29354a instanceof InterfaceC29354a.c)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                error = new ProfileInteractor.InternalResult.Error(this.this$0.handleError((InterfaceC29354a.c) interfaceC29354a));
                            }
                            obj2 = error;
                        }
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC13062m.emit(obj2, anonymousClass1) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj3);
                    }
                    return C23454a0.f92919a;
                }
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = c13052j1.collect(new C96932(interfaceC13062m, this), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        };
        return new C13015a0(new InterfaceC13058l() { // from class: com.whoop.profile.domain.ProfileInteractor$loadProfile$$inlined$map$2

            /* JADX INFO: renamed from: com.whoop.profile.domain.ProfileInteractor$loadProfile$$inlined$map$2$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C96942<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                /* JADX INFO: renamed from: com.whoop.profile.domain.ProfileInteractor$loadProfile$$inlined$map$2$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "com.whoop.profile.domain.ProfileInteractor$loadProfile$$inlined$map$2$2", m100430f = "ProfileInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class AnonymousClass1 extends AbstractC32269c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C96942.this.emit(null, this);
                    }
                }

                public C96942(InterfaceC13062m interfaceC13062m) {
                    this.$this_unsafeFlow = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    AnonymousClass1 anonymousClass1;
                    ProfileDomainState errorState;
                    if (interfaceC30057d instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC30057d;
                        int i13 = anonymousClass1.label;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i13 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                    }
                    Object obj2 = anonymousClass1.result;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = anonymousClass1.label;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.$this_unsafeFlow;
                        ProfileInteractor.InternalResult internalResult = (ProfileInteractor.InternalResult) obj;
                        if (internalResult instanceof ProfileInteractor.InternalResult.Loading) {
                            errorState = new ProfileDomainState(ProfileDialogType.Loading.INSTANCE, null, false, false, null, null, null, null, false, 510, null);
                        } else if (internalResult instanceof ProfileInteractor.InternalResult.Success) {
                            errorState = new ProfileDomainState(null, ((ProfileInteractor.InternalResult.Success) internalResult).getResponse(), false, false, null, null, null, null, false, 509, null);
                        } else if (internalResult instanceof ProfileInteractor.InternalResult.Updating) {
                            ProfileInteractor.InternalResult.Updating updating = (ProfileInteractor.InternalResult.Updating) internalResult;
                            errorState = new ProfileDomainState(null, updating.getResponse(), updating.getManualRefresh(), true, null, null, null, null, false, 497, null);
                        } else if (internalResult instanceof ProfileInteractor.InternalResult.ErrorWithData) {
                            errorState = new ProfileDomainState(null, ((ProfileInteractor.InternalResult.ErrorWithData) internalResult).getResponse(), false, false, null, null, null, null, false, 509, null);
                        } else {
                            if (!(internalResult instanceof ProfileInteractor.InternalResult.Error)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            errorState = ((ProfileInteractor.InternalResult.Error) internalResult).getErrorState();
                        }
                        ProfileInternalDomainAction.LoadData loadData = new ProfileInternalDomainAction.LoadData(errorState);
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC13062m.emit(loadData, anonymousClass1) == enumC31071a) {
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

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = interfaceC13058l.collect(new C96942(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }, new C96964(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC13058l performAction(Action action, String cardButtonId) {
        return new C13100y(new C13015a0(new C96972(cardButtonId, this, null), AbstractC13091v.m36590P(this.actionInteractor.interact(new C0456u(new C30698f(action), 1)), new ProfileInteractor$performAction$$inlined$flatMapLatest$1(null, this))), new C96983(cardButtonId, this, null));
    }

    public static /* synthetic */ InterfaceC13058l performAction$default(ProfileInteractor profileInteractor, Action action, String str, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str = null;
        }
        return profileInteractor.performAction(action, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC13058l reportProfile() {
        return new C13084s1(new C97001(null));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new ProfileDomainState(ProfileDialogType.Loading.INSTANCE, null, false, false, null, null, null, null, false, 510, null), AbstractC13091v.m36590P(upstream, new ProfileInteractor$interact$$inlined$flatMapLatest$1(null, this)), new C96922(null));
    }

    public final InterfaceC13058l profileStateFlow(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(interact(upstream), settingsGearEnabledFlow$profile_release(), new C96991(null), 1);
    }

    public final InterfaceC13058l settingsGearEnabledFlow$profile_release() {
        final InterfaceC13037f2 tabsFlow = this.bffBottomNavConfigSource.getTabsFlow();
        return AbstractC13091v.m36610t(new InterfaceC13058l() { // from class: com.whoop.profile.domain.ProfileInteractor$settingsGearEnabledFlow$$inlined$map$1

            /* JADX INFO: renamed from: com.whoop.profile.domain.ProfileInteractor$settingsGearEnabledFlow$$inlined$map$1$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C97012<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;
                final /* synthetic */ ProfileInteractor this$0;

                /* JADX INFO: renamed from: com.whoop.profile.domain.ProfileInteractor$settingsGearEnabledFlow$$inlined$map$1$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "com.whoop.profile.domain.ProfileInteractor$settingsGearEnabledFlow$$inlined$map$1$2", m100430f = "ProfileInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class AnonymousClass1 extends AbstractC32269c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C97012.this.emit(null, this);
                    }
                }

                public C97012(InterfaceC13062m interfaceC13062m, ProfileInteractor profileInteractor) {
                    this.$this_unsafeFlow = interfaceC13062m;
                    this.this$0 = profileInteractor;
                }

                /* JADX WARN: Code duplicated, block: B:27:0x007a  */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    AnonymousClass1 anonymousClass1;
                    boolean z4;
                    if (interfaceC30057d instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC30057d;
                        int i13 = anonymousClass1.label;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i13 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                    }
                    Object obj2 = anonymousClass1.result;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = anonymousClass1.label;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.$this_unsafeFlow;
                        List list = (List) obj;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (AbstractC22676k.m65745e(((TabConfiguration) it.next()).getId(), "menu")) {
                                    }
                                } else if (this.this$0.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.PROFILE_SETTINGS_GEAR)) {
                                    z4 = true;
                                }
                                z4 = false;
                            }
                        } else if (this.this$0.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.PROFILE_SETTINGS_GEAR)) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        Boolean boolValueOf = Boolean.valueOf(z4);
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC13062m.emit(boolValueOf, anonymousClass1) == enumC31071a) {
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

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = tabsFlow.collect(new C97012(interfaceC13062m, this), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        });
    }

    public /* synthetic */ ProfileInteractor(InterfaceC26834e interfaceC26834e, C34387c c34387c, C30695c c30695c, C37378a c37378a, ProfileAnalyticsHelper profileAnalyticsHelper, InterfaceC21718f interfaceC21718f, FeatureFlagChecker featureFlagChecker, InterfaceC34116n interfaceC34116n, AbstractC0757c abstractC0757c, Integer num, Integer num2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC26834e, c34387c, c30695c, c37378a, profileAnalyticsHelper, interfaceC21718f, featureFlagChecker, interfaceC34116n, abstractC0757c, (i13 & 512) != 0 ? null : num, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : num2);
    }
}
