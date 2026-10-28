package com.whoop.profile.view.memberlevels;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.C1601k1;
import com.whoop.domain.model.memberlevels.MemberLevelProfileViewData;
import hc3.AbstractC17176i;
import java.io.Serializable;
import java.util.HashMap;
import p114eb.InterfaceC12959h;

/* JADX INFO: loaded from: classes10.dex */
public class MemberLevelsFragmentArgs implements InterfaceC12959h {
    private final HashMap arguments;

    public /* synthetic */ MemberLevelsFragmentArgs(HashMap map, int i13) {
        this(map);
    }

    public static MemberLevelsFragmentArgs fromBundle(Bundle bundle) {
        MemberLevelsFragmentArgs memberLevelsFragmentArgs = new MemberLevelsFragmentArgs();
        if (!AbstractC17176i.m48518t(bundle, MemberLevelsFragmentArgs.class, "memberLevelData")) {
            throw new IllegalArgumentException("Required argument \"memberLevelData\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(MemberLevelProfileViewData.class) && !Serializable.class.isAssignableFrom(MemberLevelProfileViewData.class)) {
            throw new UnsupportedOperationException(MemberLevelProfileViewData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        MemberLevelProfileViewData memberLevelProfileViewData = (MemberLevelProfileViewData) bundle.get("memberLevelData");
        if (memberLevelProfileViewData == null) {
            throw new IllegalArgumentException("Argument \"memberLevelData\" is marked as non-null but was passed a null value.");
        }
        memberLevelsFragmentArgs.arguments.put("memberLevelData", memberLevelProfileViewData);
        return memberLevelsFragmentArgs;
    }

    public static MemberLevelsFragmentArgs fromSavedStateHandle(C1601k1 c1601k1) {
        MemberLevelsFragmentArgs memberLevelsFragmentArgs = new MemberLevelsFragmentArgs();
        if (!c1601k1.m5000a("memberLevelData")) {
            throw new IllegalArgumentException("Required argument \"memberLevelData\" is missing and does not have an android:defaultValue");
        }
        MemberLevelProfileViewData memberLevelProfileViewData = (MemberLevelProfileViewData) c1601k1.m5001b("memberLevelData");
        if (memberLevelProfileViewData == null) {
            throw new IllegalArgumentException("Argument \"memberLevelData\" is marked as non-null but was passed a null value.");
        }
        memberLevelsFragmentArgs.arguments.put("memberLevelData", memberLevelProfileViewData);
        return memberLevelsFragmentArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MemberLevelsFragmentArgs memberLevelsFragmentArgs = (MemberLevelsFragmentArgs) obj;
        if (this.arguments.containsKey("memberLevelData") != memberLevelsFragmentArgs.arguments.containsKey("memberLevelData")) {
            return false;
        }
        return getMemberLevelData() == null ? memberLevelsFragmentArgs.getMemberLevelData() == null : getMemberLevelData().equals(memberLevelsFragmentArgs.getMemberLevelData());
    }

    public MemberLevelProfileViewData getMemberLevelData() {
        return (MemberLevelProfileViewData) this.arguments.get("memberLevelData");
    }

    public int hashCode() {
        return 31 + (getMemberLevelData() != null ? getMemberLevelData().hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("memberLevelData")) {
            MemberLevelProfileViewData memberLevelProfileViewData = (MemberLevelProfileViewData) this.arguments.get("memberLevelData");
            if (!Parcelable.class.isAssignableFrom(MemberLevelProfileViewData.class) && memberLevelProfileViewData != null) {
                if (!Serializable.class.isAssignableFrom(MemberLevelProfileViewData.class)) {
                    throw new UnsupportedOperationException(MemberLevelProfileViewData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                bundle.putSerializable("memberLevelData", (Serializable) Serializable.class.cast(memberLevelProfileViewData));
                return bundle;
            }
            bundle.putParcelable("memberLevelData", (Parcelable) Parcelable.class.cast(memberLevelProfileViewData));
        }
        return bundle;
    }

    public C1601k1 toSavedStateHandle() {
        C1601k1 c1601k1 = new C1601k1();
        if (this.arguments.containsKey("memberLevelData")) {
            MemberLevelProfileViewData memberLevelProfileViewData = (MemberLevelProfileViewData) this.arguments.get("memberLevelData");
            if (!Parcelable.class.isAssignableFrom(MemberLevelProfileViewData.class) && memberLevelProfileViewData != null) {
                if (!Serializable.class.isAssignableFrom(MemberLevelProfileViewData.class)) {
                    throw new UnsupportedOperationException(MemberLevelProfileViewData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                c1601k1.m5004e((Serializable) Serializable.class.cast(memberLevelProfileViewData), "memberLevelData");
                return c1601k1;
            }
            c1601k1.m5004e((Parcelable) Parcelable.class.cast(memberLevelProfileViewData), "memberLevelData");
        }
        return c1601k1;
    }

    public String toString() {
        return "MemberLevelsFragmentArgs{memberLevelData=" + getMemberLevelData() + "}";
    }

    private MemberLevelsFragmentArgs() {
        this.arguments = new HashMap();
    }

    public static final class Builder {
        private final HashMap arguments;

        public Builder(MemberLevelsFragmentArgs memberLevelsFragmentArgs) {
            HashMap map = new HashMap();
            this.arguments = map;
            map.putAll(memberLevelsFragmentArgs.arguments);
        }

        public MemberLevelsFragmentArgs build() {
            return new MemberLevelsFragmentArgs(this.arguments, 0);
        }

        public MemberLevelProfileViewData getMemberLevelData() {
            return (MemberLevelProfileViewData) this.arguments.get("memberLevelData");
        }

        public Builder setMemberLevelData(MemberLevelProfileViewData memberLevelProfileViewData) {
            if (memberLevelProfileViewData == null) {
                throw new IllegalArgumentException("Argument \"memberLevelData\" is marked as non-null but was passed a null value.");
            }
            this.arguments.put("memberLevelData", memberLevelProfileViewData);
            return this;
        }

        public Builder(MemberLevelProfileViewData memberLevelProfileViewData) {
            HashMap map = new HashMap();
            this.arguments = map;
            if (memberLevelProfileViewData != null) {
                map.put("memberLevelData", memberLevelProfileViewData);
                return;
            }
            throw new IllegalArgumentException("Argument \"memberLevelData\" is marked as non-null but was passed a null value.");
        }
    }

    private MemberLevelsFragmentArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}
