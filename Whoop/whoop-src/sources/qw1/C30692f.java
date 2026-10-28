package qw1;

import ad3.AbstractC0757c;
import com.whoop.membership.familyPlan.domain.model.InviteMemberErrorResponse;
import kotlinx.serialization.SerializationException;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import tr2.InterfaceC34116n;
import u82.AbstractC34650k;

/* JADX INFO: renamed from: qw1.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lqw1/f;", "", "Lad3/c;", "json", "Ltr2/n;", "logger", "<init>", "(Lad3/c;Ltr2/n;)V", "", "errorBody", "Lcom/whoop/membership/familyPlan/domain/model/InviteMemberErrorResponse;", "a", "(Ljava/lang/String;)Lcom/whoop/membership/familyPlan/domain/model/InviteMemberErrorResponse;", "Lad3/c;", "b", "Ltr2/n;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30692f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC0757c json;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C30692f(AbstractC0757c json, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(logger, "logger");
        this.json = json;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: a */
    public final InviteMemberErrorResponse m94314a(String errorBody) {
        if (errorBody == null || errorBody.length() == 0) {
            this.logger.mo85228t("Error body is null or empty, cannot deserialize.", new AbstractC30556a.a[0]);
            return null;
        }
        try {
            AbstractC0757c abstractC0757c = this.json;
            abstractC0757c.getClass();
            return (InviteMemberErrorResponse) abstractC0757c.m1831b(InviteMemberErrorResponse.INSTANCE.serializer(), errorBody);
        } catch (SerializationException e5) {
            this.logger.mo85222m(AbstractC31061c.m95640p("Failed to parse subscription error response body: ", e5.getMessage(), ". Body: ", errorBody), new AbstractC30556a.a[0]);
            return null;
        } catch (Exception e13) {
            InterfaceC34116n interfaceC34116n = this.logger;
            StackTraceElement[] stackTrace = e13.getStackTrace();
            StringBuilder sb4 = new StringBuilder("Unexpected error parsing subscription response body: ");
            sb4.append(stackTrace);
            interfaceC34116n.mo85222m(AbstractC25012a.m73376i(". Body: ", errorBody, sb4), new AbstractC30556a.a[0]);
            return null;
        }
    }

    public /* synthetic */ C30692f(AbstractC0757c abstractC0757c, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC34650k.m109496c() : abstractC0757c, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ProcessInviteErrorParser") : interfaceC34116n);
    }
}
