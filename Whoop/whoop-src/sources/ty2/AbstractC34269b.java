package ty2;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ty2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m65681d2 = {"Lty2/a;", "Lcom/whoop/design/util/TextResource;", "a", "(Lty2/a;)Lcom/whoop/design/util/TextResource;", "cancelCta", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34269b {
    /* JADX INFO: renamed from: a */
    public static final TextResource m108516a(AbstractC34268a abstractC34268a) {
        C34270c cancelState;
        AbstractC22676k.m65750j(abstractC34268a, "<this>");
        AbstractC34268a.a aVar = abstractC34268a instanceof AbstractC34268a.a ? (AbstractC34268a.a) abstractC34268a : null;
        if (aVar == null || (cancelState = aVar.getCancelState()) == null) {
            return null;
        }
        return cancelState.getCta();
    }
}
