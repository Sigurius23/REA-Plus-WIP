package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.EnumC1635w;

/* JADX INFO: renamed from: androidx.fragment.app.x1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1360x1 implements Parcelable {
    public static final Parcelable.Creator<C1360x1> CREATOR = new C1337q1(1);

    /* JADX INFO: renamed from: E */
    public final int f5830E;

    /* JADX INFO: renamed from: F */
    public final int f5831F;

    /* JADX INFO: renamed from: G */
    public final String f5832G;

    /* JADX INFO: renamed from: H */
    public final boolean f5833H;

    /* JADX INFO: renamed from: I */
    public final boolean f5834I;

    /* JADX INFO: renamed from: J */
    public final boolean f5835J;

    /* JADX INFO: renamed from: K */
    public final boolean f5836K;

    /* JADX INFO: renamed from: L */
    public final int f5837L;

    /* JADX INFO: renamed from: M */
    public final String f5838M;

    /* JADX INFO: renamed from: N */
    public final int f5839N;

    /* JADX INFO: renamed from: O */
    public final boolean f5840O;

    /* JADX INFO: renamed from: w */
    public final String f5841w;

    /* JADX INFO: renamed from: x */
    public final String f5842x;

    /* JADX INFO: renamed from: y */
    public final boolean f5843y;

    /* JADX INFO: renamed from: z */
    public final boolean f5844z;

    public C1360x1(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        this.f5841w = abstractComponentCallbacksC1320m0.getClass().getName();
        this.f5842x = abstractComponentCallbacksC1320m0.mWho;
        this.f5843y = abstractComponentCallbacksC1320m0.mFromLayout;
        this.f5844z = abstractComponentCallbacksC1320m0.mInDynamicContainer;
        this.f5830E = abstractComponentCallbacksC1320m0.mFragmentId;
        this.f5831F = abstractComponentCallbacksC1320m0.mContainerId;
        this.f5832G = abstractComponentCallbacksC1320m0.mTag;
        this.f5833H = abstractComponentCallbacksC1320m0.mRetainInstance;
        this.f5834I = abstractComponentCallbacksC1320m0.mRemoving;
        this.f5835J = abstractComponentCallbacksC1320m0.mDetached;
        this.f5836K = abstractComponentCallbacksC1320m0.mHidden;
        this.f5837L = abstractComponentCallbacksC1320m0.mMaxState.ordinal();
        this.f5838M = abstractComponentCallbacksC1320m0.mTargetWho;
        this.f5839N = abstractComponentCallbacksC1320m0.mTargetRequestCode;
        this.f5840O = abstractComponentCallbacksC1320m0.mUserVisibleHint;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractComponentCallbacksC1320m0 m4244b(AbstractC1356w0 abstractC1356w0, ClassLoader classLoader) {
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0Mo4083a = abstractC1356w0.mo4083a(classLoader, this.f5841w);
        abstractComponentCallbacksC1320m0Mo4083a.mWho = this.f5842x;
        abstractComponentCallbacksC1320m0Mo4083a.mFromLayout = this.f5843y;
        abstractComponentCallbacksC1320m0Mo4083a.mInDynamicContainer = this.f5844z;
        abstractComponentCallbacksC1320m0Mo4083a.mRestored = true;
        abstractComponentCallbacksC1320m0Mo4083a.mFragmentId = this.f5830E;
        abstractComponentCallbacksC1320m0Mo4083a.mContainerId = this.f5831F;
        abstractComponentCallbacksC1320m0Mo4083a.mTag = this.f5832G;
        abstractComponentCallbacksC1320m0Mo4083a.mRetainInstance = this.f5833H;
        abstractComponentCallbacksC1320m0Mo4083a.mRemoving = this.f5834I;
        abstractComponentCallbacksC1320m0Mo4083a.mDetached = this.f5835J;
        abstractComponentCallbacksC1320m0Mo4083a.mHidden = this.f5836K;
        abstractComponentCallbacksC1320m0Mo4083a.mMaxState = EnumC1635w.values()[this.f5837L];
        abstractComponentCallbacksC1320m0Mo4083a.mTargetWho = this.f5838M;
        abstractComponentCallbacksC1320m0Mo4083a.mTargetRequestCode = this.f5839N;
        abstractComponentCallbacksC1320m0Mo4083a.mUserVisibleHint = this.f5840O;
        return abstractComponentCallbacksC1320m0Mo4083a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder(128);
        sb4.append("FragmentState{");
        sb4.append(this.f5841w);
        sb4.append(" (");
        sb4.append(this.f5842x);
        sb4.append(")}:");
        if (this.f5843y) {
            sb4.append(" fromLayout");
        }
        if (this.f5844z) {
            sb4.append(" dynamicContainer");
        }
        int i13 = this.f5831F;
        if (i13 != 0) {
            sb4.append(" id=0x");
            sb4.append(Integer.toHexString(i13));
        }
        String str = this.f5832G;
        if (str != null && !str.isEmpty()) {
            sb4.append(" tag=");
            sb4.append(str);
        }
        if (this.f5833H) {
            sb4.append(" retainInstance");
        }
        if (this.f5834I) {
            sb4.append(" removing");
        }
        if (this.f5835J) {
            sb4.append(" detached");
        }
        if (this.f5836K) {
            sb4.append(" hidden");
        }
        String str2 = this.f5838M;
        if (str2 != null) {
            sb4.append(" targetWho=");
            sb4.append(str2);
            sb4.append(" targetRequestCode=");
            sb4.append(this.f5839N);
        }
        if (this.f5840O) {
            sb4.append(" userVisibleHint");
        }
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f5841w);
        parcel.writeString(this.f5842x);
        parcel.writeInt(this.f5843y ? 1 : 0);
        parcel.writeInt(this.f5844z ? 1 : 0);
        parcel.writeInt(this.f5830E);
        parcel.writeInt(this.f5831F);
        parcel.writeString(this.f5832G);
        parcel.writeInt(this.f5833H ? 1 : 0);
        parcel.writeInt(this.f5834I ? 1 : 0);
        parcel.writeInt(this.f5835J ? 1 : 0);
        parcel.writeInt(this.f5836K ? 1 : 0);
        parcel.writeInt(this.f5837L);
        parcel.writeString(this.f5838M);
        parcel.writeInt(this.f5839N);
        parcel.writeInt(this.f5840O ? 1 : 0);
    }

    public C1360x1(Parcel parcel) {
        this.f5841w = parcel.readString();
        this.f5842x = parcel.readString();
        this.f5843y = parcel.readInt() != 0;
        this.f5844z = parcel.readInt() != 0;
        this.f5830E = parcel.readInt();
        this.f5831F = parcel.readInt();
        this.f5832G = parcel.readString();
        this.f5833H = parcel.readInt() != 0;
        this.f5834I = parcel.readInt() != 0;
        this.f5835J = parcel.readInt() != 0;
        this.f5836K = parcel.readInt() != 0;
        this.f5837L = parcel.readInt();
        this.f5838M = parcel.readString();
        this.f5839N = parcel.readInt();
        this.f5840O = parcel.readInt() != 0;
    }
}
