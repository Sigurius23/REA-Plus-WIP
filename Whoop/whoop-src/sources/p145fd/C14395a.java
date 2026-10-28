package p145fd;

import androidx.room.AbstractC1772c1;
import e93.AbstractC12889b;
import java.util.List;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: fd.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C14395a {

    /* JADX INFO: renamed from: a */
    public final List f52537a;

    /* JADX INFO: renamed from: b */
    public final Map f52538b;

    /* JADX INFO: renamed from: c */
    public final List f52539c;

    public C14395a(List list, int i13) {
        switch (i13) {
            case 1:
                this.f52537a = list;
                this.f52538b = AbstractC25247g0.m73989X(new C23465k("CreateToken", AbstractC37056f.m118958J(AbstractC12889b.m36261a("smithy.api#noAuth"))));
                this.f52539c = AbstractC37056f.m118958J(AbstractC1772c1.m5380Q(31, null));
                break;
            case 2:
                this.f52537a = list;
                this.f52538b = AbstractC25247g0.m73989X(new C23465k("AssumeRoleWithWebIdentity", AbstractC37056f.m118958J(AbstractC12889b.m36261a("smithy.api#noAuth"))));
                this.f52539c = AbstractC37056f.m118958J(AbstractC1772c1.m5380Q(31, null));
                break;
            case 3:
                this.f52537a = list;
                this.f52538b = AbstractC25247g0.m73989X(new C23465k("CreateOAuth2Token", AbstractC37056f.m118958J(AbstractC12889b.m36261a("smithy.api#noAuth"))));
                this.f52539c = AbstractC37056f.m118958J(AbstractC1772c1.m5380Q(31, null));
                break;
            default:
                this.f52537a = list;
                this.f52538b = AbstractC25247g0.m73989X(new C23465k("GetRoleCredentials", AbstractC37056f.m118958J(AbstractC12889b.m36261a("smithy.api#noAuth"))));
                this.f52539c = AbstractC37056f.m118958J(AbstractC1772c1.m5380Q(31, null));
                break;
        }
    }
}
