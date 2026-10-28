package n92;

import com.iterable.iterableapi.C5339j1;
import com.iterable.iterableapi.EnumC5382w0;
import com.iterable.iterableapi.InterfaceC5385x0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n92.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, m65681d2 = {"Ln92/c;", "Lcom/iterable/iterableapi/x0;", "Ln92/d;", "inAppHandlerReporter", "<init>", "(Ln92/d;)V", "Lcom/iterable/iterableapi/j1;", "message", "Lcom/iterable/iterableapi/w0;", "a", "(Lcom/iterable/iterableapi/j1;)Lcom/iterable/iterableapi/w0;", "Ln92/d;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26481c implements InterfaceC5385x0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C26482d inAppHandlerReporter;

    public C26481c(C26482d inAppHandlerReporter) {
        AbstractC22676k.m65750j(inAppHandlerReporter, "inAppHandlerReporter");
        this.inAppHandlerReporter = inAppHandlerReporter;
    }

    @Override // com.iterable.iterableapi.InterfaceC5385x0
    /* JADX INFO: renamed from: a */
    public EnumC5382w0 mo16414a(C5339j1 message) {
        AbstractC22676k.m65750j(message, "message");
        C26482d c26482d = this.inAppHandlerReporter;
        String html = message.m16457e().f21677a;
        AbstractC22676k.m65749i(html, "html");
        c26482d.m78526b(html);
        return EnumC5382w0.f21883w;
    }
}
