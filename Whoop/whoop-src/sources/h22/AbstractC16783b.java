package h22;

import com.whoop.pairing.membershipAdjustment.domain.models.MembershipAdjustmentResponse;
import g22.C15281a;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h22.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/pairing/membershipAdjustment/domain/models/MembershipAdjustmentResponse;", "Lg22/a;", "a", "(Lcom/whoop/pairing/membershipAdjustment/domain/models/MembershipAdjustmentResponse;)Lg22/a;", "pairing-ui_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16783b {
    /* JADX INFO: renamed from: a */
    public static final C15281a m47334a(MembershipAdjustmentResponse membershipAdjustmentResponse) {
        AbstractC22676k.m65750j(membershipAdjustmentResponse, "<this>");
        return new C15281a(membershipAdjustmentResponse.getHeader(), membershipAdjustmentResponse.getTag(), membershipAdjustmentResponse.getTitle(), membershipAdjustmentResponse.getBody(), membershipAdjustmentResponse.getContinueCtaTitle(), membershipAdjustmentResponse.getCancelCtaTitle(), new AbstractC22403o.c(membershipAdjustmentResponse.getStrapImage(), 0, 0, 0, 14, null), membershipAdjustmentResponse.getPath(), membershipAdjustmentResponse.getPayload());
    }
}
