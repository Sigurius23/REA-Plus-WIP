package va2;

import com.whoop.design.util.AbstractC8693b;
import kc2.AbstractC22354d;
import kc2.C22359i;
import p705ea2.AbstractC12922s;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import ua2.C34720a;

/* JADX INFO: renamed from: va2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lva2/a;", "", "<init>", "()V", "Lkc2/d;", "result", "Lua2/a;", "a", "(Lkc2/d;)Lua2/a;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35842a {
    /* JADX INFO: renamed from: a */
    public final C34720a m113759a(AbstractC22354d result) {
        AbstractC22676k.m65750j(result, "result");
        if (result.equals(AbstractC22354d.a.f87215a)) {
            return new C34720a(null, 1, null);
        }
        if (result instanceof AbstractC22354d.b) {
            return new C34720a(new C22359i(AbstractC8693b.m21277k(AbstractC12922s.f44602f), AbstractC8693b.m21277k(AbstractC12922s.f44600e), ((AbstractC22354d.b) result).getResult().getShareSheetContent().getMessageText(), null, 8, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
