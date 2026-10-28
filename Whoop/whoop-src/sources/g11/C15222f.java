package g11;

import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g11.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lg11/f;", "", "Lkotlin/Function1;", "Ljava/time/LocalDate;", "Lcom/whoop/whoopaction/domain/models/Action;", "onDateSelected", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C15222f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function1 onDateSelected;

    public C15222f(Function1 onDateSelected) {
        AbstractC22676k.m65750j(onDateSelected, "onDateSelected");
        this.onDateSelected = onDateSelected;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Function1 getOnDateSelected() {
        return this.onDateSelected;
    }

    public boolean equals(Object other) {
        return other instanceof C15222f;
    }

    public int hashCode() {
        return C15222f.class.hashCode();
    }

    public String toString() {
        return "UpdateDatePicker(onDateSelected=" + this.onDateSelected + ")";
    }
}
