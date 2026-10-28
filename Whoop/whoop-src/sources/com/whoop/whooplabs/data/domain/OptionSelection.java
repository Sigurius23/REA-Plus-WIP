package com.whoop.whooplabs.data.domain;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000bR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u000b\"\u0004\b#\u0010$R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b'\u0010\u0015¨\u0006("}, m65681d2 = {"Lcom/whoop/whooplabs/data/domain/OptionSelection;", "Landroid/os/Parcelable;", "", "stepId", "order", "", "key", "value", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "component3", "()Ljava/lang/String;", "component4", "copy", "(IILjava/lang/String;Ljava/lang/String;)Lcom/whoop/whooplabs/data/domain/OptionSelection;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getStepId", "getOrder", "setOrder", "(I)V", "Ljava/lang/String;", "getKey", "getValue", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class OptionSelection implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<OptionSelection> CREATOR = new Creator();
    private final String key;
    private int order;
    private final int stepId;
    private final String value;

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<OptionSelection> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionSelection createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            return new OptionSelection(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionSelection[] newArray(int i13) {
            return new OptionSelection[i13];
        }
    }

    public OptionSelection(int i13, int i14, String key, String value) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(value, "value");
        this.stepId = i13;
        this.order = i14;
        this.key = key;
        this.value = value;
    }

    public static /* synthetic */ OptionSelection copy$default(OptionSelection optionSelection, int i13, int i14, String str, String str2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = optionSelection.stepId;
        }
        if ((i15 & 2) != 0) {
            i14 = optionSelection.order;
        }
        if ((i15 & 4) != 0) {
            str = optionSelection.key;
        }
        if ((i15 & 8) != 0) {
            str2 = optionSelection.value;
        }
        return optionSelection.copy(i13, i14, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStepId() {
        return this.stepId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final OptionSelection copy(int stepId, int order, String key, String value) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(value, "value");
        return new OptionSelection(stepId, order, key, value);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionSelection)) {
            return false;
        }
        OptionSelection optionSelection = (OptionSelection) other;
        return this.stepId == optionSelection.stepId && this.order == optionSelection.order && AbstractC22676k.m65745e(this.key, optionSelection.key) && AbstractC22676k.m65745e(this.value, optionSelection.value);
    }

    public final String getKey() {
        return this.key;
    }

    public final int getOrder() {
        return this.order;
    }

    public final int getStepId() {
        return this.stepId;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.order, Integer.hashCode(this.stepId) * 31, 31), 31, this.key);
    }

    public final void setOrder(int i13) {
        this.order = i13;
    }

    public String toString() {
        int i13 = this.stepId;
        int i14 = this.order;
        return AbstractC11266d.m30464r(AbstractC11266d.m30465s(i13, i14, "OptionSelection(stepId=", ", order=", ", key="), this.key, ", value=", this.value, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.stepId);
        dest.writeInt(this.order);
        dest.writeString(this.key);
        dest.writeString(this.value);
    }
}
