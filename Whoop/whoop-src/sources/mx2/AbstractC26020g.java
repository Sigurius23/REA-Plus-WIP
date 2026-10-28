package mx2;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mx2.g */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0019\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0006\u001a\u0011\u0010\u0014\u001a\u00020\u0003*\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a#\u0010\u0017\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lmx2/f$a;", "c", "(Lmx2/f$a;)Lmx2/f$a;", "Lmx2/b;", "action", "a", "(Lmx2/f$a;Lmx2/b;)Lmx2/f$a;", "Lmx2/i;", "config", "b", "(Lmx2/f$a;Lmx2/b;Lmx2/i;)Lmx2/f$a;", "", "reason", "g", "(Lmx2/f$a;Ljava/lang/String;)Lmx2/f$a;", "reasonKey", "reasonDisplayText", "e", "(Lmx2/f$a;Ljava/lang/String;Ljava/lang/String;)Lmx2/f$a;", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lmx2/b;)Lmx2/b;", "additionalText", "f", "(Lmx2/b;Ljava/lang/String;Ljava/lang/String;)Lmx2/b;", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26020g {
    /* JADX INFO: renamed from: a */
    public static final AbstractC26019f.a m77346a(AbstractC26019f.a aVar, InterfaceC26015b action) {
        AbstractC22676k.m65750j(aVar, "<this>");
        AbstractC22676k.m65750j(action, "action");
        return AbstractC26019f.a.m77338b(aVar, null, new AbstractC26024k.a(action), false, null, 13, null);
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC26019f.a m77347b(AbstractC26019f.a aVar, InterfaceC26015b action, C26022i config) {
        AbstractC22676k.m65750j(aVar, "<this>");
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(config, "config");
        return AbstractC26019f.a.m77338b(aVar, null, new AbstractC26024k.b(action, config, null, 4, null), false, null, 13, null);
    }

    /* JADX INFO: renamed from: c */
    public static final AbstractC26019f.a m77348c(AbstractC26019f.a aVar) {
        AbstractC22676k.m65750j(aVar, "<this>");
        return AbstractC26019f.a.m77338b(aVar, null, AbstractC26024k.d.f102940a, false, null, 13, null).m77344g(null);
    }

    /* JADX INFO: renamed from: d */
    public static final AbstractC26019f.a m77349d(AbstractC26019f.a aVar, InterfaceC26015b action) {
        AbstractC22676k.m65750j(aVar, "<this>");
        AbstractC22676k.m65750j(action, "action");
        return AbstractC26019f.a.m77338b(aVar, null, new AbstractC26024k.e(action), false, null, 13, null);
    }

    /* JADX INFO: renamed from: e */
    public static final AbstractC26019f.a m77350e(AbstractC26019f.a aVar, String reasonKey, String reasonDisplayText) {
        AbstractC22676k.m65750j(aVar, "<this>");
        AbstractC22676k.m65750j(reasonKey, "reasonKey");
        AbstractC22676k.m65750j(reasonDisplayText, "reasonDisplayText");
        AbstractC26024k overlayState = aVar.getOverlayState();
        if (!(overlayState instanceof AbstractC26024k.b)) {
            return aVar;
        }
        AbstractC26024k.b bVar = (AbstractC26024k.b) overlayState;
        return AbstractC26019f.a.m77338b(aVar, null, new AbstractC26024k.c(bVar.getOriginalAction(), bVar.getFeedbackConfig(), reasonDisplayText, reasonKey, null, 16, null), false, null, 13, null);
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC26015b m77351f(InterfaceC26015b interfaceC26015b, String reason, String str) {
        AbstractC22676k.m65750j(interfaceC26015b, "<this>");
        AbstractC22676k.m65750j(reason, "reason");
        return interfaceC26015b instanceof InterfaceC26015b.a ? InterfaceC26015b.a.m77315h((InterfaceC26015b.a) interfaceC26015b, 0, null, null, null, null, null, new C26014a(reason, str), 63, null) : interfaceC26015b;
    }

    /* JADX INFO: renamed from: g */
    public static final AbstractC26019f.a m77352g(AbstractC26019f.a aVar, String reason) {
        AbstractC22676k.m65750j(aVar, "<this>");
        AbstractC22676k.m65750j(reason, "reason");
        AbstractC26024k overlayState = aVar.getOverlayState();
        return overlayState instanceof AbstractC26024k.b ? AbstractC26019f.a.m77338b(aVar, null, AbstractC26024k.b.m77412b((AbstractC26024k.b) overlayState, null, null, reason, 3, null), false, null, 13, null) : aVar;
    }

    /* JADX INFO: renamed from: h */
    public static final InterfaceC26015b m77353h(InterfaceC26015b interfaceC26015b) {
        AbstractC22676k.m65750j(interfaceC26015b, "<this>");
        if (interfaceC26015b instanceof InterfaceC26015b.a) {
            return InterfaceC26015b.a.m77315h((InterfaceC26015b.a) interfaceC26015b, 0, null, null, null, null, null, null, 119, null);
        }
        if (interfaceC26015b instanceof InterfaceC26015b.b) {
            return InterfaceC26015b.b.m77318h((InterfaceC26015b.b) interfaceC26015b, 0, null, null, null, null, null, 55, null);
        }
        if (interfaceC26015b instanceof InterfaceC26015b.d) {
            return InterfaceC26015b.d.m77322h((InterfaceC26015b.d) interfaceC26015b, 0, null, null, null, null, null, 55, null);
        }
        if (interfaceC26015b instanceof InterfaceC26015b.c) {
            return InterfaceC26015b.c.m77320h((InterfaceC26015b.c) interfaceC26015b, 0, null, null, null, null, null, 55, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
