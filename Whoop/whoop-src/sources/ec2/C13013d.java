package ec2;

import com.whoop.design.util.AbstractC8693b;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb2.C39394a;
import yb2.C39396c;

/* JADX INFO: renamed from: ec2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lec2/d;", "", "<init>", "()V", "Lyb2/a;", "domainState", "Lec2/c;", "a", "(Lyb2/a;)Lec2/c;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13013d {
    /* JADX INFO: renamed from: a */
    public final C13012c m36556a(C39394a domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        List<C39396c> listM125815b = domainState.m125815b();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM125815b, 10));
        for (C39396c c39396c : listM125815b) {
            arrayList.add(new C13010a(c39396c.getLanguageId(), AbstractC8693b.m21278l(c39396c.getLanguageTitleHardCoded()), c39396c.getLanguageTranslated(), c39396c.getInitiallySelected()));
        }
        return new C13012c(arrayList, domainState.getDebugInfo());
    }
}
