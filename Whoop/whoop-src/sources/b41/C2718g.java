package b41;

import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b41.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R'\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lb41/g;", "", "Lkotlin/Function1;", "", "Lcom/whoop/whoopaction/domain/models/Action;", "onUpdatedInput", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C2718g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function1 onUpdatedInput;

    public C2718g(Function1 onUpdatedInput) {
        AbstractC22676k.m65750j(onUpdatedInput, "onUpdatedInput");
        this.onUpdatedInput = onUpdatedInput;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Function1 getOnUpdatedInput() {
        return this.onUpdatedInput;
    }

    public boolean equals(Object other) {
        return other instanceof C2718g;
    }

    public int hashCode() {
        return C2718g.class.hashCode();
    }

    public String toString() {
        return "UpdateTextInput(onUpdatedInput=" + this.onUpdatedInput + ")";
    }
}
