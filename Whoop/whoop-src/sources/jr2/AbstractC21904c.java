package jr2;

import b91.C2886a;
import com.whoop.user.journey.model.yearinreview.FooterText;
import com.whoop.user.journey.model.yearinreview.HighlightedText;
import e93.AbstractC12889b;
import gy0.AbstractC16273b;
import hg3.AbstractC17269i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import l83.C23465k;
import m83.AbstractC25267u;
import p208i2.AbstractC17911t;
import p208i2.C17924z0;
import p294l3.C23267m0;
import p294l3.C23285v0;
import p392p3.AbstractC28771i;
import p392p3.C28776n;
import p392p3.C28777o;
import p392p3.C28780r;
import p478s3.C32096b;
import p571w3.C36765a;
import p571w3.C36776l;
import p571w3.C36780p;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import v63.AbstractC35745c;

/* JADX INFO: renamed from: jr2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\u0007*\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\u0007*\b\u0012\u0004\u0012\u00020\u000e0\u0007¢\u0006\u0004\b\u000f\u0010\r\"\u001a\u0010\u0014\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u0017\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013\"\u001a\u0010\u0018\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013\"\u001a\u0010\u001d\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u001a\u0010\u001f\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u001e\u0010\u001c\"\u001a\u0010!\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\u0011\u001a\u0004\b \u0010\u0013\"\u0014\u0010$\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010#\"\u0014\u0010%\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010#¨\u0006&"}, m65681d2 = {"", "fontSize", "Li2/t;", "brush", "Lb91/a;", "g", "(DLi2/t;)Lb91/a;", "", "Lcom/whoop/user/journey/model/yearinreview/HighlightedText;", "Ll83/k;", "", "Ll3/m0;", "i", "(Ljava/util/List;)Ljava/util/List;", "Lcom/whoop/user/journey/model/yearinreview/FooterText;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "a", "Lb91/a;", "c", "()Lb91/a;", "pillarIntroTextStyle", "b", "e", "shortTextStepTextStyle", "longTextStepTextStyle", "d", "Ll3/m0;", "getHighlightedSpanStyle", "()Ll3/m0;", "highlightedSpanStyle", "getNormalSpanStyle", "normalSpanStyle", "f", "statValueTextStyle", "Lp3/i;", "()Lp3/i;", "proximaNova", "dinpro", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21904c {

    /* JADX INFO: renamed from: a */
    private static final C2886a f84626a;

    /* JADX INFO: renamed from: b */
    private static final C2886a f84627b;

    /* JADX INFO: renamed from: c */
    private static final C2886a f84628c;

    /* JADX INFO: renamed from: d */
    private static final C23267m0 f84629d;

    /* JADX INFO: renamed from: e */
    private static final C23267m0 f84630e;

    /* JADX INFO: renamed from: f */
    private static final C2886a f84631f;

    static {
        C2886a.Companion companion = C2886a.INSTANCE;
        C23285v0 style = companion.m8401a().getStyle();
        AbstractC28771i abstractC28771iM62316d = m62316d();
        C28780r c28780r = C28780r.f116541H;
        f84626a = new C2886a(C23285v0.m67364b(style, 0L, 0L, c28780r, abstractC28771iM62316d, 0L, 0, 0L, null, null, 16777179), null, 2, null);
        f84627b = new C2886a(C23285v0.m67364b(companion.m8401a().getStyle(), 0L, AbstractC35745c.m113246h(44), c28780r, m62316d(), 0L, 0, AbstractC35745c.m113246h(48), null, null, 16646105), null, 2, null);
        f84628c = new C2886a(C23285v0.m67364b(companion.m8401a().getStyle(), 0L, 0L, c28780r, m62316d(), 0L, 0, 0L, null, null, 16777179), null, 2, null);
        f84629d = new C23267m0(EnumC39333f.BRAND_WHITE.getColor(), 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65534);
        f84630e = new C23267m0(EnumC39333f.WHITE_50.getColor(), 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65534);
        f84631f = new C2886a(C23285v0.m67364b(companion.m8401a().getStyle(), 0L, AbstractC35745c.m113246h(43), c28780r, m62316d(), 0L, 0, 0L, null, null, 16777177), null, 2, null);
    }

    /* JADX INFO: renamed from: a */
    private static final AbstractC28771i m62313a() {
        return AbstractC12889b.m36267d(AbstractC17269i.m48882b(AbstractC16273b.f62203d, C28780r.f116542I, 12), AbstractC17269i.m48882b(AbstractC16273b.f62204e, C28780r.f116540G, 12));
    }

    /* JADX INFO: renamed from: b */
    public static final C2886a m62314b() {
        return f84628c;
    }

    /* JADX INFO: renamed from: c */
    public static final C2886a m62315c() {
        return f84626a;
    }

    /* JADX INFO: renamed from: d */
    private static final AbstractC28771i m62316d() {
        return AbstractC12889b.m36267d(AbstractC17269i.m48882b(AbstractC16273b.f62201b, null, 14), AbstractC17269i.m48882b(AbstractC16273b.f62200a, C28780r.f116542I, 12), AbstractC17269i.m48882b(AbstractC16273b.f62202c, C28780r.f116541H, 12));
    }

    /* JADX INFO: renamed from: e */
    public static final C2886a m62317e() {
        return f84627b;
    }

    /* JADX INFO: renamed from: f */
    public static final C2886a m62318f() {
        return f84631f;
    }

    /* JADX INFO: renamed from: g */
    public static final C2886a m62319g(double d3, AbstractC17911t brush) {
        AbstractC22676k.m65750j(brush, "brush");
        return new C2886a(C23285v0.m67363a(C2886a.INSTANCE.m8401a().getStyle(), brush, AbstractC35745c.m113245g(d3), C28780r.f116542I, m62313a(), AbstractC35745c.m113245g(361.45d), 33292210), null, 2, null);
    }

    /* JADX INFO: renamed from: h */
    public static final List<C23465k> m62320h(List<FooterText> list) {
        AbstractC22676k.m65750j(list, "<this>");
        List<FooterText> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (FooterText footerText : list2) {
            arrayList.add(new C23465k(footerText.getText(), footerText.getHighlighted() ? f84629d : f84630e));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public static final List<C23465k> m62321i(List<HighlightedText> list) {
        AbstractC22676k.m65750j(list, "<this>");
        List<HighlightedText> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (HighlightedText highlightedText : list2) {
            arrayList.add(new C23465k(highlightedText.getText(), highlightedText.getHighlighted() ? f84629d : f84630e));
        }
        return arrayList;
    }
}
