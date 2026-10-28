package p742vw1;

import ow1.C28436a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pw1.C29586b;
import qw1.C30689c;
import uw1.C35310c;
import uw1.C35311d;
import uw1.C35314g;

/* JADX INFO: renamed from: vw1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lvw1/d;", "", "<init>", "()V", "Lpw1/b;", "familyPlanDomainResult", "Luw1/c;", "b", "(Lpw1/b;)Luw1/c;", "Lqw1/c;", "result", "Luw1/d;", "c", "(Lqw1/c;)Luw1/d;", "Low1/a;", "domainResult", "Luw1/g;", "a", "(Low1/a;)Luw1/g;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36545d {
    /* JADX INFO: renamed from: b */
    private final C35310c m117174b(C29586b familyPlanDomainResult) {
        return new C36543b().m117164b(familyPlanDomainResult);
    }

    /* JADX INFO: renamed from: c */
    private final C35311d m117175c(C30689c result) {
        return new C36544c().m117172d(result);
    }

    /* JADX INFO: renamed from: a */
    public final C35314g m117176a(C28436a domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        return new C35314g(m117174b(domainResult.getFamilyPlanScreen()), m117175c(domainResult.getInviteFamilyMemberScreen()));
    }
}
