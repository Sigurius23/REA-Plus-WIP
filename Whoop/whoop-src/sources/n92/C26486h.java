package n92;

import android.net.Uri;
import com.iterable.iterableapi.C5313d;
import com.iterable.iterableapi.C5378v;
import com.iterable.iterableapi.InterfaceC5324f2;
import com.whoop.domain.model.WhoopUriParser;
import iy1.InterfaceC21030c;
import j92.AbstractC21453u;
import j92.C21452t;
import jy1.C22047a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import ud3.C34810e0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: n92.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u000fB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Ln92/h;", "Lcom/iterable/iterableapi/f2;", "Liy1/c;", "metricWriter", "Lcom/whoop/domain/model/WhoopUriParser;", "whoopUriParser", "Lj92/t;", "topPrivateDomainHelper", "<init>", "(Liy1/c;Lcom/whoop/domain/model/WhoopUriParser;Lj92/t;)V", "Landroid/net/Uri;", "uri", "Lcom/iterable/iterableapi/d;", "actionContext", "", "a", "(Landroid/net/Uri;Lcom/iterable/iterableapi/d;)Z", "Liy1/c;", "b", "Lcom/whoop/domain/model/WhoopUriParser;", "c", "Lj92/t;", "d", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26486h implements InterfaceC5324f2 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    public static final int f105195e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final WhoopUriParser whoopUriParser;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C21452t topPrivateDomainHelper;

    /* JADX INFO: renamed from: n92.h$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Ln92/h$a;", "", "<init>", "()V", "Lj92/t;", "topPrivateDomainHelper", "Lcom/whoop/domain/model/WhoopUriParser;", "whoopUriParser", "", "uri", "a", "(Lj92/t;Lcom/whoop/domain/model/WhoopUriParser;Ljava/lang/String;)Ljava/lang/String;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m78533a(C21452t topPrivateDomainHelper, WhoopUriParser whoopUriParser, String uri) {
            AbstractC22676k.m65750j(topPrivateDomainHelper, "topPrivateDomainHelper");
            AbstractC22676k.m65750j(whoopUriParser, "whoopUriParser");
            if (uri == null) {
                return "unparseable";
            }
            C26480b.Companion companion = C26480b.INSTANCE;
            if (companion.m78522d(uri)) {
                return companion.m78524g(uri, whoopUriParser);
            }
            C34810e0 c34810e0M16526b = null;
            try {
                C5378v c5378v = new C5378v(1);
                c5378v.m16528d(null, uri);
                c34810e0M16526b = c5378v.m16526b();
            } catch (IllegalArgumentException unused) {
            }
            if (c34810e0M16526b == null) {
                return "malformed";
            }
            return AbstractC21453u.m60389b(topPrivateDomainHelper, c34810e0M16526b) ? companion.m78524g(uri, whoopUriParser) : "nonwhoop";
        }

        private Companion() {
        }
    }

    public C26486h(InterfaceC21030c metricWriter, WhoopUriParser whoopUriParser, C21452t topPrivateDomainHelper) {
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(whoopUriParser, "whoopUriParser");
        AbstractC22676k.m65750j(topPrivateDomainHelper, "topPrivateDomainHelper");
        this.metricWriter = metricWriter;
        this.whoopUriParser = whoopUriParser;
        this.topPrivateDomainHelper = topPrivateDomainHelper;
    }

    @Override // com.iterable.iterableapi.InterfaceC5324f2
    /* JADX INFO: renamed from: a */
    public boolean mo16437a(Uri uri, C5313d actionContext) {
        AbstractC22676k.m65750j(uri, "uri");
        AbstractC22676k.m65750j(actionContext, "actionContext");
        this.metricWriter.mo58701b(new C22047a(0, "iterable.message.url.click", null, AbstractC37056f.m118959K(AbstractC11266d.m30461o("medium:", C26480b.INSTANCE.m78521b(actionContext)), AbstractC11266d.m30461o("scheme:", uri.getScheme()), AbstractC11266d.m30461o("intent:", INSTANCE.m78533a(this.topPrivateDomainHelper, this.whoopUriParser, uri.toString()))), null, 21, null));
        return false;
    }

    public /* synthetic */ C26486h(InterfaceC21030c interfaceC21030c, WhoopUriParser whoopUriParser, C21452t c21452t, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC21030c, (i13 & 2) != 0 ? WhoopUriParser.INSTANCE.parser() : whoopUriParser, (i13 & 4) != 0 ? new C21452t() : c21452t);
    }
}
