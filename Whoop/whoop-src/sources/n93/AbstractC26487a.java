package n93;

import fa3.AbstractC14331x;
import java.util.LinkedHashSet;
import java.util.List;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.C35845c;
import va3.C35847e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: n93.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC26487a {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashSet f105199a;

    /* JADX INFO: renamed from: b */
    public static final C35845c f105200b;

    static {
        List<C35847e> listM118959K = AbstractC37056f.m118959K(AbstractC14331x.f52306a, AbstractC14331x.f52313h, AbstractC14331x.f52314i, AbstractC14331x.f52308c, AbstractC14331x.f52309d, AbstractC14331x.f52311f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C35847e topLevelFqName : listM118959K) {
            AbstractC22676k.m65750j(topLevelFqName, "topLevelFqName");
            linkedHashSet.add(new C35845c(topLevelFqName.m113789b(), topLevelFqName.f152613a.m113796g()));
        }
        f105199a = linkedHashSet;
        C35847e REPEATABLE_ANNOTATION = AbstractC14331x.f52312g;
        AbstractC22676k.m65749i(REPEATABLE_ANNOTATION, "REPEATABLE_ANNOTATION");
        f105200b = new C35845c(REPEATABLE_ANNOTATION.m113789b(), REPEATABLE_ANNOTATION.f152613a.m113796g());
    }
}
