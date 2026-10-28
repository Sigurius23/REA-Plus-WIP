package ww1;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import uw1.C35310c;

/* JADX INFO: renamed from: ww1.o */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lww1/o;", "Lww1/a;", "Luw1/c$c;", "hubScreenContent", "<init>", "(Luw1/c$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Luw1/c$c;", "()Luw1/c$c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37669o implements InterfaceC37655a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C35310c.c hubScreenContent;

    public C37669o(C35310c.c hubScreenContent) {
        AbstractC22676k.m65750j(hubScreenContent, "hubScreenContent");
        this.hubScreenContent = hubScreenContent;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C35310c.c getHubScreenContent() {
        return this.hubScreenContent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C37669o) && AbstractC22676k.m65745e(this.hubScreenContent, ((C37669o) other).hubScreenContent);
    }

    public int hashCode() {
        return this.hubScreenContent.hashCode();
    }

    public String toString() {
        return "ViewScreenFPH(hubScreenContent=" + this.hubScreenContent + ")";
    }
}
