package com.whoop.profile.view;

import android.os.Bundle;
import androidx.lifecycle.C1601k1;
import com.whoop.profile.domain.ProfileApiKt;
import hc3.AbstractC17176i;
import java.util.HashMap;
import p114eb.InterfaceC12959h;

/* JADX INFO: loaded from: classes10.dex */
public class ProfileFragmentArgs implements InterfaceC12959h {
    private final HashMap arguments;

    public /* synthetic */ ProfileFragmentArgs(HashMap map, int i13) {
        this(map);
    }

    public static ProfileFragmentArgs fromBundle(Bundle bundle) {
        ProfileFragmentArgs profileFragmentArgs = new ProfileFragmentArgs();
        if (AbstractC17176i.m48518t(bundle, ProfileFragmentArgs.class, "source")) {
            String string = bundle.getString("source");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"source\" is marked as non-null but was passed a null value.");
            }
            profileFragmentArgs.arguments.put("source", string);
        } else {
            profileFragmentArgs.arguments.put("source", "");
        }
        if (bundle.containsKey(ProfileApiKt.TARGET_USER_ID_PARAM)) {
            profileFragmentArgs.arguments.put(ProfileApiKt.TARGET_USER_ID_PARAM, Integer.valueOf(bundle.getInt(ProfileApiKt.TARGET_USER_ID_PARAM)));
        } else {
            profileFragmentArgs.arguments.put(ProfileApiKt.TARGET_USER_ID_PARAM, -1);
        }
        if (bundle.containsKey(ProfileApiKt.COMMUNITY_ID_PARAM)) {
            profileFragmentArgs.arguments.put(ProfileApiKt.COMMUNITY_ID_PARAM, Integer.valueOf(bundle.getInt(ProfileApiKt.COMMUNITY_ID_PARAM)));
        } else {
            profileFragmentArgs.arguments.put(ProfileApiKt.COMMUNITY_ID_PARAM, -1);
        }
        if (!bundle.containsKey("educationType")) {
            profileFragmentArgs.arguments.put("educationType", null);
            return profileFragmentArgs;
        }
        profileFragmentArgs.arguments.put("educationType", bundle.getString("educationType"));
        return profileFragmentArgs;
    }

    public static ProfileFragmentArgs fromSavedStateHandle(C1601k1 c1601k1) {
        ProfileFragmentArgs profileFragmentArgs = new ProfileFragmentArgs();
        if (c1601k1.m5000a("source")) {
            String str = (String) c1601k1.m5001b("source");
            if (str == null) {
                throw new IllegalArgumentException("Argument \"source\" is marked as non-null but was passed a null value.");
            }
            profileFragmentArgs.arguments.put("source", str);
        } else {
            profileFragmentArgs.arguments.put("source", "");
        }
        if (c1601k1.m5000a(ProfileApiKt.TARGET_USER_ID_PARAM)) {
            Integer num = (Integer) c1601k1.m5001b(ProfileApiKt.TARGET_USER_ID_PARAM);
            num.intValue();
            profileFragmentArgs.arguments.put(ProfileApiKt.TARGET_USER_ID_PARAM, num);
        } else {
            profileFragmentArgs.arguments.put(ProfileApiKt.TARGET_USER_ID_PARAM, -1);
        }
        if (c1601k1.m5000a(ProfileApiKt.COMMUNITY_ID_PARAM)) {
            Integer num2 = (Integer) c1601k1.m5001b(ProfileApiKt.COMMUNITY_ID_PARAM);
            num2.intValue();
            profileFragmentArgs.arguments.put(ProfileApiKt.COMMUNITY_ID_PARAM, num2);
        } else {
            profileFragmentArgs.arguments.put(ProfileApiKt.COMMUNITY_ID_PARAM, -1);
        }
        if (!c1601k1.m5000a("educationType")) {
            profileFragmentArgs.arguments.put("educationType", null);
            return profileFragmentArgs;
        }
        profileFragmentArgs.arguments.put("educationType", (String) c1601k1.m5001b("educationType"));
        return profileFragmentArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProfileFragmentArgs profileFragmentArgs = (ProfileFragmentArgs) obj;
        if (this.arguments.containsKey("source") != profileFragmentArgs.arguments.containsKey("source")) {
            return false;
        }
        if (getSource() == null ? profileFragmentArgs.getSource() != null : !getSource().equals(profileFragmentArgs.getSource())) {
            return false;
        }
        if (this.arguments.containsKey(ProfileApiKt.TARGET_USER_ID_PARAM) == profileFragmentArgs.arguments.containsKey(ProfileApiKt.TARGET_USER_ID_PARAM) && getTargetUserId() == profileFragmentArgs.getTargetUserId() && this.arguments.containsKey(ProfileApiKt.COMMUNITY_ID_PARAM) == profileFragmentArgs.arguments.containsKey(ProfileApiKt.COMMUNITY_ID_PARAM) && getCommunityId() == profileFragmentArgs.getCommunityId() && this.arguments.containsKey("educationType") == profileFragmentArgs.arguments.containsKey("educationType")) {
            return getEducationType() == null ? profileFragmentArgs.getEducationType() == null : getEducationType().equals(profileFragmentArgs.getEducationType());
        }
        return false;
    }

    public int getCommunityId() {
        return ((Integer) this.arguments.get(ProfileApiKt.COMMUNITY_ID_PARAM)).intValue();
    }

    public String getEducationType() {
        return (String) this.arguments.get("educationType");
    }

    public String getSource() {
        return (String) this.arguments.get("source");
    }

    public int getTargetUserId() {
        return ((Integer) this.arguments.get(ProfileApiKt.TARGET_USER_ID_PARAM)).intValue();
    }

    public int hashCode() {
        return ((getCommunityId() + ((getTargetUserId() + (((getSource() != null ? getSource().hashCode() : 0) + 31) * 31)) * 31)) * 31) + (getEducationType() != null ? getEducationType().hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("source")) {
            bundle.putString("source", (String) this.arguments.get("source"));
        } else {
            bundle.putString("source", "");
        }
        if (this.arguments.containsKey(ProfileApiKt.TARGET_USER_ID_PARAM)) {
            bundle.putInt(ProfileApiKt.TARGET_USER_ID_PARAM, ((Integer) this.arguments.get(ProfileApiKt.TARGET_USER_ID_PARAM)).intValue());
        } else {
            bundle.putInt(ProfileApiKt.TARGET_USER_ID_PARAM, -1);
        }
        if (this.arguments.containsKey(ProfileApiKt.COMMUNITY_ID_PARAM)) {
            bundle.putInt(ProfileApiKt.COMMUNITY_ID_PARAM, ((Integer) this.arguments.get(ProfileApiKt.COMMUNITY_ID_PARAM)).intValue());
        } else {
            bundle.putInt(ProfileApiKt.COMMUNITY_ID_PARAM, -1);
        }
        if (this.arguments.containsKey("educationType")) {
            bundle.putString("educationType", (String) this.arguments.get("educationType"));
            return bundle;
        }
        bundle.putString("educationType", null);
        return bundle;
    }

    public C1601k1 toSavedStateHandle() {
        C1601k1 c1601k1 = new C1601k1();
        if (this.arguments.containsKey("source")) {
            c1601k1.m5004e((String) this.arguments.get("source"), "source");
        } else {
            c1601k1.m5004e("", "source");
        }
        if (this.arguments.containsKey(ProfileApiKt.TARGET_USER_ID_PARAM)) {
            Integer num = (Integer) this.arguments.get(ProfileApiKt.TARGET_USER_ID_PARAM);
            num.getClass();
            c1601k1.m5004e(num, ProfileApiKt.TARGET_USER_ID_PARAM);
        } else {
            c1601k1.m5004e(-1, ProfileApiKt.TARGET_USER_ID_PARAM);
        }
        if (this.arguments.containsKey(ProfileApiKt.COMMUNITY_ID_PARAM)) {
            Integer num2 = (Integer) this.arguments.get(ProfileApiKt.COMMUNITY_ID_PARAM);
            num2.getClass();
            c1601k1.m5004e(num2, ProfileApiKt.COMMUNITY_ID_PARAM);
        } else {
            c1601k1.m5004e(-1, ProfileApiKt.COMMUNITY_ID_PARAM);
        }
        if (this.arguments.containsKey("educationType")) {
            c1601k1.m5004e((String) this.arguments.get("educationType"), "educationType");
            return c1601k1;
        }
        c1601k1.m5004e(null, "educationType");
        return c1601k1;
    }

    public String toString() {
        return "ProfileFragmentArgs{source=" + getSource() + ", targetUserId=" + getTargetUserId() + ", communityId=" + getCommunityId() + ", educationType=" + getEducationType() + "}";
    }

    private ProfileFragmentArgs() {
        this.arguments = new HashMap();
    }

    public static final class Builder {
        private final HashMap arguments;

        public Builder(ProfileFragmentArgs profileFragmentArgs) {
            HashMap map = new HashMap();
            this.arguments = map;
            map.putAll(profileFragmentArgs.arguments);
        }

        public ProfileFragmentArgs build() {
            return new ProfileFragmentArgs(this.arguments, 0);
        }

        public int getCommunityId() {
            return ((Integer) this.arguments.get(ProfileApiKt.COMMUNITY_ID_PARAM)).intValue();
        }

        public String getEducationType() {
            return (String) this.arguments.get("educationType");
        }

        public String getSource() {
            return (String) this.arguments.get("source");
        }

        public int getTargetUserId() {
            return ((Integer) this.arguments.get(ProfileApiKt.TARGET_USER_ID_PARAM)).intValue();
        }

        public Builder setCommunityId(int i13) {
            this.arguments.put(ProfileApiKt.COMMUNITY_ID_PARAM, Integer.valueOf(i13));
            return this;
        }

        public Builder setEducationType(String str) {
            this.arguments.put("educationType", str);
            return this;
        }

        public Builder setSource(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Argument \"source\" is marked as non-null but was passed a null value.");
            }
            this.arguments.put("source", str);
            return this;
        }

        public Builder setTargetUserId(int i13) {
            this.arguments.put(ProfileApiKt.TARGET_USER_ID_PARAM, Integer.valueOf(i13));
            return this;
        }

        public Builder() {
            this.arguments = new HashMap();
        }
    }

    private ProfileFragmentArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}
