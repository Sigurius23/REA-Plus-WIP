package com.whoop.user.journey.model;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0005\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\tÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/user/journey/model/UserJourneyContentState;", "", "isError", "", "()Z", "UserJourneyContentStateV1", "UserJourneyContentStateV2", "Lcom/whoop/user/journey/model/UserJourneyContentState$UserJourneyContentStateV1;", "Lcom/whoop/user/journey/model/UserJourneyContentState$UserJourneyContentStateV2;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface UserJourneyContentState {

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/user/journey/model/UserJourneyContentState$UserJourneyContentStateV1;", "Lcom/whoop/user/journey/model/UserJourneyContentState;", "model", "Lcom/whoop/user/journey/model/UserJourneyContentModel;", "isError", "", "<init>", "(Lcom/whoop/user/journey/model/UserJourneyContentModel;Z)V", "getModel", "()Lcom/whoop/user/journey/model/UserJourneyContentModel;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class UserJourneyContentStateV1 implements UserJourneyContentState {
        public static final int $stable = 8;
        private final boolean isError;
        private final UserJourneyContentModel model;

        /* JADX WARN: Multi-variable type inference failed */
        public UserJourneyContentStateV1() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ UserJourneyContentStateV1 copy$default(UserJourneyContentStateV1 userJourneyContentStateV1, UserJourneyContentModel userJourneyContentModel, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                userJourneyContentModel = userJourneyContentStateV1.model;
            }
            if ((i13 & 2) != 0) {
                z4 = userJourneyContentStateV1.isError;
            }
            return userJourneyContentStateV1.copy(userJourneyContentModel, z4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final UserJourneyContentModel getModel() {
            return this.model;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsError() {
            return this.isError;
        }

        public final UserJourneyContentStateV1 copy(UserJourneyContentModel model, boolean isError) {
            return new UserJourneyContentStateV1(model, isError);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserJourneyContentStateV1)) {
                return false;
            }
            UserJourneyContentStateV1 userJourneyContentStateV1 = (UserJourneyContentStateV1) other;
            return AbstractC22676k.m65745e(this.model, userJourneyContentStateV1.model) && this.isError == userJourneyContentStateV1.isError;
        }

        public final UserJourneyContentModel getModel() {
            return this.model;
        }

        public int hashCode() {
            UserJourneyContentModel userJourneyContentModel = this.model;
            return Boolean.hashCode(this.isError) + ((userJourneyContentModel == null ? 0 : userJourneyContentModel.hashCode()) * 31);
        }

        @Override // com.whoop.user.journey.model.UserJourneyContentState
        public boolean isError() {
            return this.isError;
        }

        public String toString() {
            return "UserJourneyContentStateV1(model=" + this.model + ", isError=" + this.isError + ")";
        }

        public UserJourneyContentStateV1(UserJourneyContentModel userJourneyContentModel, boolean z4) {
            this.model = userJourneyContentModel;
            this.isError = z4;
        }

        public /* synthetic */ UserJourneyContentStateV1(UserJourneyContentModel userJourneyContentModel, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : userJourneyContentModel, (i13 & 2) != 0 ? false : z4);
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/user/journey/model/UserJourneyContentState$UserJourneyContentStateV2;", "Lcom/whoop/user/journey/model/UserJourneyContentState;", "model", "Lcom/whoop/user/journey/model/UserJourneyContentModelV2;", "isError", "", "<init>", "(Lcom/whoop/user/journey/model/UserJourneyContentModelV2;Z)V", "getModel", "()Lcom/whoop/user/journey/model/UserJourneyContentModelV2;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class UserJourneyContentStateV2 implements UserJourneyContentState {
        public static final int $stable = 8;
        private final boolean isError;
        private final UserJourneyContentModelV2 model;

        /* JADX WARN: Multi-variable type inference failed */
        public UserJourneyContentStateV2() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ UserJourneyContentStateV2 copy$default(UserJourneyContentStateV2 userJourneyContentStateV2, UserJourneyContentModelV2 userJourneyContentModelV2, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                userJourneyContentModelV2 = userJourneyContentStateV2.model;
            }
            if ((i13 & 2) != 0) {
                z4 = userJourneyContentStateV2.isError;
            }
            return userJourneyContentStateV2.copy(userJourneyContentModelV2, z4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final UserJourneyContentModelV2 getModel() {
            return this.model;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsError() {
            return this.isError;
        }

        public final UserJourneyContentStateV2 copy(UserJourneyContentModelV2 model, boolean isError) {
            return new UserJourneyContentStateV2(model, isError);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserJourneyContentStateV2)) {
                return false;
            }
            UserJourneyContentStateV2 userJourneyContentStateV2 = (UserJourneyContentStateV2) other;
            return AbstractC22676k.m65745e(this.model, userJourneyContentStateV2.model) && this.isError == userJourneyContentStateV2.isError;
        }

        public final UserJourneyContentModelV2 getModel() {
            return this.model;
        }

        public int hashCode() {
            UserJourneyContentModelV2 userJourneyContentModelV2 = this.model;
            return Boolean.hashCode(this.isError) + ((userJourneyContentModelV2 == null ? 0 : userJourneyContentModelV2.hashCode()) * 31);
        }

        @Override // com.whoop.user.journey.model.UserJourneyContentState
        public boolean isError() {
            return this.isError;
        }

        public String toString() {
            return "UserJourneyContentStateV2(model=" + this.model + ", isError=" + this.isError + ")";
        }

        public UserJourneyContentStateV2(UserJourneyContentModelV2 userJourneyContentModelV2, boolean z4) {
            this.model = userJourneyContentModelV2;
            this.isError = z4;
        }

        public /* synthetic */ UserJourneyContentStateV2(UserJourneyContentModelV2 userJourneyContentModelV2, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : userJourneyContentModelV2, (i13 & 2) != 0 ? false : z4);
        }
    }

    boolean isError();
}
