package com.whoop.data.remote.domain.response.journal;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/data/remote/domain/response/journal/JournalMagnitudeValue;", "", "label", "", "value", "", "<init>", "(Ljava/lang/String;F)V", "getLabel", "()Ljava/lang/String;", "getValue", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class JournalMagnitudeValue {
    private final String label;
    private final float value;

    public JournalMagnitudeValue(String label, float f13) {
        AbstractC22676k.m65750j(label, "label");
        this.label = label;
        this.value = f13;
    }

    public static /* synthetic */ JournalMagnitudeValue copy$default(JournalMagnitudeValue journalMagnitudeValue, String str, float f13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = journalMagnitudeValue.label;
        }
        if ((i13 & 2) != 0) {
            f13 = journalMagnitudeValue.value;
        }
        return journalMagnitudeValue.copy(str, f13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    public final JournalMagnitudeValue copy(String label, float value) {
        AbstractC22676k.m65750j(label, "label");
        return new JournalMagnitudeValue(label, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JournalMagnitudeValue)) {
            return false;
        }
        JournalMagnitudeValue journalMagnitudeValue = (JournalMagnitudeValue) other;
        return AbstractC22676k.m65745e(this.label, journalMagnitudeValue.label) && Float.compare(this.value, journalMagnitudeValue.value) == 0;
    }

    public final String getLabel() {
        return this.label;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return Float.hashCode(this.value) + (this.label.hashCode() * 31);
    }

    public String toString() {
        return "JournalMagnitudeValue(label=" + this.label + ", value=" + this.value + ")";
    }
}
