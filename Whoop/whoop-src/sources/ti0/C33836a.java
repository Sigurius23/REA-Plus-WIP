package ti0;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ti0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lti0/a;", "", "Lti0/m;", "contentState", "<init>", "(Lti0/m;)V", "a", "(Lti0/m;)Lti0/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lti0/m;", "b", "()Lti0/m;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33836a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC33848m contentState;

    public C33836a(InterfaceC33848m contentState) {
        AbstractC22676k.m65750j(contentState, "contentState");
        this.contentState = contentState;
    }

    /* JADX INFO: renamed from: a */
    public final C33836a m107004a(InterfaceC33848m contentState) {
        AbstractC22676k.m65750j(contentState, "contentState");
        return new C33836a(contentState);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC33848m getContentState() {
        return this.contentState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C33836a) && AbstractC22676k.m65745e(this.contentState, ((C33836a) other).contentState);
    }

    public int hashCode() {
        return this.contentState.hashCode();
    }

    public String toString() {
        return "AnyTemplateContentState(contentState=" + this.contentState + ")";
    }
}
