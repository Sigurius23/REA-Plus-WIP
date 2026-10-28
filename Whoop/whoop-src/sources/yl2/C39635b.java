package yl2;

import androidx.core.app.NotificationCompat;
import l83.C23454a0;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: yl2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lyl2/b;", "Lm91/u;", "", "exerciseId", "", "isExerciseDetailsV2ExperimentEnabled", "", NotificationCompat.CATEGORY_EVENT, "<init>", "(Ljava/lang/String;ZLjava/lang/Object;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "c", "Ljava/lang/Object;", "getEvent", "()Ljava/lang/Object;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39635b implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String exerciseId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isExerciseDetailsV2ExperimentEnabled;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Object event;

    public C39635b(String exerciseId, boolean z4, Object event) {
        AbstractC22676k.m65750j(exerciseId, "exerciseId");
        AbstractC22676k.m65750j(event, "event");
        this.exerciseId = exerciseId;
        this.isExerciseDetailsV2ExperimentEnabled = z4;
        this.event = event;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getExerciseId() {
        return this.exerciseId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsExerciseDetailsV2ExperimentEnabled() {
        return this.isExerciseDetailsV2ExperimentEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39635b)) {
            return false;
        }
        C39635b c39635b = (C39635b) other;
        return AbstractC22676k.m65745e(this.exerciseId, c39635b.exerciseId) && this.isExerciseDetailsV2ExperimentEnabled == c39635b.isExerciseDetailsV2ExperimentEnabled && AbstractC22676k.m65745e(this.event, c39635b.event);
    }

    public int hashCode() {
        return this.event.hashCode() + AbstractC2875y.m8289b(this.exerciseId.hashCode() * 31, 31, this.isExerciseDetailsV2ExperimentEnabled);
    }

    public String toString() {
        String str = this.exerciseId;
        boolean z4 = this.isExerciseDetailsV2ExperimentEnabled;
        return AbstractC2875y.m8303p(AbstractC25012a.m73379l("TrendsExerciseDetailsItemViewState(exerciseId=", str, ", isExerciseDetailsV2ExperimentEnabled=", ", event=", z4), ")", this.event);
    }

    public /* synthetic */ C39635b(String str, boolean z4, Object obj, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? C23454a0.f92919a : obj);
    }
}
