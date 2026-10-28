package n92;

import com.whoop.domain.model.WhoopUriParser;
import iy1.InterfaceC21030c;
import j92.C21452t;
import jy1.C22047a;
import p000.AbstractC11266d;
import p098dt.AbstractC12350b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;
import yb3.C39408l;
import yb3.C39410n;
import yb3.C39412p;
import yb3.EnumC39413q;

/* JADX INFO: renamed from: n92.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Ln92/d;", "", "Liy1/c;", "metricWriter", "Lcom/whoop/domain/model/WhoopUriParser;", "whoopUriParser", "Lj92/t;", "topPrivateDomainHelper", "<init>", "(Liy1/c;Lcom/whoop/domain/model/WhoopUriParser;Lj92/t;)V", "", "html", "a", "(Ljava/lang/String;)Ljava/lang/String;", "messageContent", "Ll83/a0;", "b", "(Ljava/lang/String;)V", "Liy1/c;", "Lcom/whoop/domain/model/WhoopUriParser;", "c", "Lj92/t;", "Lyb3/p;", "d", "Lyb3/p;", "regex", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26482d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final WhoopUriParser whoopUriParser;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C21452t topPrivateDomainHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C39412p regex;

    public C26482d(InterfaceC21030c metricWriter, WhoopUriParser whoopUriParser, C21452t topPrivateDomainHelper) {
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(whoopUriParser, "whoopUriParser");
        AbstractC22676k.m65750j(topPrivateDomainHelper, "topPrivateDomainHelper");
        this.metricWriter = metricWriter;
        this.whoopUriParser = whoopUriParser;
        this.topPrivateDomainHelper = topPrivateDomainHelper;
        this.regex = new C39412p("<a\\b(?=[^>]*\\bclass\\s*=\\s*\"cta-button\")(?=[^>]*\\bhref\\s*=\\s*\"([^\"]+)\")[^>]*>", AbstractC12350b.m34570S(EnumC39413q.IGNORE_CASE));
    }

    /* JADX INFO: renamed from: a */
    private final String m78525a(String html) {
        C39410n c39410nM125848a = this.regex.m125848a(html);
        if (c39410nM125848a != null) {
            return (String) ((C39408l) c39410nM125848a.m125843a()).get(1);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m78526b(String messageContent) {
        AbstractC22676k.m65750j(messageContent, "messageContent");
        String strM78525a = m78525a(messageContent);
        this.metricWriter.mo58701b(new C22047a(0, "iterable.inapp.display", null, AbstractC37056f.m118959K(AbstractC11266d.m30461o("scheme:", strM78525a == null ? "unparseable" : C26480b.INSTANCE.m78523f(strM78525a)), AbstractC11266d.m30461o("intent:", C26486h.INSTANCE.m78533a(this.topPrivateDomainHelper, this.whoopUriParser, strM78525a))), null, 21, null));
    }

    public /* synthetic */ C26482d(InterfaceC21030c interfaceC21030c, WhoopUriParser whoopUriParser, C21452t c21452t, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC21030c, (i13 & 2) != 0 ? WhoopUriParser.INSTANCE.parser() : whoopUriParser, (i13 & 4) != 0 ? new C21452t() : c21452t);
    }
}
