package td2;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: td2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Ltd2/a;", "", "Lcom/whoop/design/util/TextResource;", "upsellDescription", "Lm91/u;", "labradorNewRecordingCta", "<init>", "(Lcom/whoop/design/util/TextResource;Lm91/u;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "Lm91/u;", "()Lm91/u;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33710a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource upsellDescription;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC25312u labradorNewRecordingCta;

    public C33710a(TextResource upsellDescription, InterfaceC25312u labradorNewRecordingCta) {
        AbstractC22676k.m65750j(upsellDescription, "upsellDescription");
        AbstractC22676k.m65750j(labradorNewRecordingCta, "labradorNewRecordingCta");
        this.upsellDescription = upsellDescription;
        this.labradorNewRecordingCta = labradorNewRecordingCta;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC25312u getLabradorNewRecordingCta() {
        return this.labradorNewRecordingCta;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getUpsellDescription() {
        return this.upsellDescription;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33710a)) {
            return false;
        }
        C33710a c33710a = (C33710a) other;
        return AbstractC22676k.m65745e(this.upsellDescription, c33710a.upsellDescription) && AbstractC22676k.m65745e(this.labradorNewRecordingCta, c33710a.labradorNewRecordingCta);
    }

    public int hashCode() {
        return this.labradorNewRecordingCta.hashCode() + (this.upsellDescription.hashCode() * 31);
    }

    public String toString() {
        return "LabradorItemInfoViewState(upsellDescription=" + this.upsellDescription + ", labradorNewRecordingCta=" + this.labradorNewRecordingCta + ")";
    }
}
