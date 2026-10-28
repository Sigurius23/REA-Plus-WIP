package com.whoop.whooplabs.data.domain;

import android.os.Parcel;
import android.os.Parcelable;
import d13.AbstractC11478a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.C25271y;
import nh3.AbstractC26725a;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J6\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001f\u0010\rJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0015R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0019¨\u0006+"}, m65681d2 = {"Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;", "Landroid/os/Parcelable;", "Lcom/whoop/whooplabs/data/domain/ProtocolStep;", "protocolStep", "", "Lcom/whoop/whooplabs/data/domain/OptionSelection;", "options", "Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;", "inputConfig", "<init>", "(Lcom/whoop/whooplabs/data/domain/ProtocolStep;Ljava/util/List;Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/whoop/whooplabs/data/domain/ProtocolStep;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;", "copy", "(Lcom/whoop/whooplabs/data/domain/ProtocolStep;Ljava/util/List;Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;)Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/whooplabs/data/domain/ProtocolStep;", "getProtocolStep", "Ljava/util/List;", "getOptions", "Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;", "getInputConfig", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class ProtocolStepWithOptions implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ProtocolStepWithOptions> CREATOR = new Creator();
    private final ProtocolStepConfig inputConfig;
    private final List<OptionSelection> options;
    private final ProtocolStep protocolStep;

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<ProtocolStepWithOptions> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProtocolStepWithOptions createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            ProtocolStep protocolStepCreateFromParcel = ProtocolStep.CREATOR.createFromParcel(parcel);
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iM79498b = 0;
            while (iM79498b != i13) {
                iM79498b = AbstractC26725a.m79498b(OptionSelection.CREATOR, parcel, arrayList, iM79498b, 1);
            }
            return new ProtocolStepWithOptions(protocolStepCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : ProtocolStepConfig.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProtocolStepWithOptions[] newArray(int i13) {
            return new ProtocolStepWithOptions[i13];
        }
    }

    public ProtocolStepWithOptions(ProtocolStep protocolStep, List<OptionSelection> options, ProtocolStepConfig protocolStepConfig) {
        AbstractC22676k.m65750j(protocolStep, "protocolStep");
        AbstractC22676k.m65750j(options, "options");
        this.protocolStep = protocolStep;
        this.options = options;
        this.inputConfig = protocolStepConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProtocolStepWithOptions copy$default(ProtocolStepWithOptions protocolStepWithOptions, ProtocolStep protocolStep, List list, ProtocolStepConfig protocolStepConfig, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            protocolStep = protocolStepWithOptions.protocolStep;
        }
        if ((i13 & 2) != 0) {
            list = protocolStepWithOptions.options;
        }
        if ((i13 & 4) != 0) {
            protocolStepConfig = protocolStepWithOptions.inputConfig;
        }
        return protocolStepWithOptions.copy(protocolStep, list, protocolStepConfig);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ProtocolStep getProtocolStep() {
        return this.protocolStep;
    }

    public final List<OptionSelection> component2() {
        return this.options;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ProtocolStepConfig getInputConfig() {
        return this.inputConfig;
    }

    public final ProtocolStepWithOptions copy(ProtocolStep protocolStep, List<OptionSelection> options, ProtocolStepConfig inputConfig) {
        AbstractC22676k.m65750j(protocolStep, "protocolStep");
        AbstractC22676k.m65750j(options, "options");
        return new ProtocolStepWithOptions(protocolStep, options, inputConfig);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProtocolStepWithOptions)) {
            return false;
        }
        ProtocolStepWithOptions protocolStepWithOptions = (ProtocolStepWithOptions) other;
        return AbstractC22676k.m65745e(this.protocolStep, protocolStepWithOptions.protocolStep) && AbstractC22676k.m65745e(this.options, protocolStepWithOptions.options) && AbstractC22676k.m65745e(this.inputConfig, protocolStepWithOptions.inputConfig);
    }

    public final ProtocolStepConfig getInputConfig() {
        return this.inputConfig;
    }

    public final List<OptionSelection> getOptions() {
        return this.options;
    }

    public final ProtocolStep getProtocolStep() {
        return this.protocolStep;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.protocolStep.hashCode() * 31, 31, this.options);
        ProtocolStepConfig protocolStepConfig = this.inputConfig;
        return iM31983b + (protocolStepConfig == null ? 0 : protocolStepConfig.hashCode());
    }

    public String toString() {
        return "ProtocolStepWithOptions(protocolStep=" + this.protocolStep + ", options=" + this.options + ", inputConfig=" + this.inputConfig + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        this.protocolStep.writeToParcel(dest, flags);
        Iterator itM30863o = AbstractC11478a.m30863o(this.options, dest);
        while (itM30863o.hasNext()) {
            ((OptionSelection) itM30863o.next()).writeToParcel(dest, flags);
        }
        ProtocolStepConfig protocolStepConfig = this.inputConfig;
        if (protocolStepConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            protocolStepConfig.writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ ProtocolStepWithOptions(ProtocolStep protocolStep, List list, ProtocolStepConfig protocolStepConfig, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(protocolStep, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? null : protocolStepConfig);
    }
}
