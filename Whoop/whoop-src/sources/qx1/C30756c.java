package qx1;

import com.whoop.design.util.TextResource;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: qx1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0019\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lqx1/c;", "", "Lcom/whoop/design/util/TextResource;", "title", "", "Lqx1/b;", "instructions", "Lqx1/a;", "rafCta", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lqx1/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/util/List;", "()Ljava/util/List;", "Lqx1/a;", "()Lqx1/a;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30756c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C30755b> instructions;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C30754a rafCta;

    public C30756c(TextResource title, List<C30755b> instructions, C30754a c30754a) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(instructions, "instructions");
        this.title = title;
        this.instructions = instructions;
        this.rafCta = c30754a;
    }

    /* JADX INFO: renamed from: a */
    public final List<C30755b> m94487a() {
        return this.instructions;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C30754a getRafCta() {
        return this.rafCta;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30756c)) {
            return false;
        }
        C30756c c30756c = (C30756c) other;
        return AbstractC22676k.m65745e(this.title, c30756c.title) && AbstractC22676k.m65745e(this.instructions, c30756c.instructions) && AbstractC22676k.m65745e(this.rafCta, c30756c.rafCta);
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.title.hashCode() * 31, 31, this.instructions);
        C30754a c30754a = this.rafCta;
        return iM31983b + (c30754a == null ? 0 : c30754a.hashCode());
    }

    public String toString() {
        TextResource textResource = this.title;
        List<C30755b> list = this.instructions;
        C30754a c30754a = this.rafCta;
        StringBuilder sbM106657p = AbstractC33745d.m106657p(textResource, "HowItWorksSection(title=", ", instructions=", ", rafCta=", list);
        sbM106657p.append(c30754a);
        sbM106657p.append(")");
        return sbM106657p.toString();
    }
}
