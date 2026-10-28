package o02;

import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: o02.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\n2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R:\u0010\u0017\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b0\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Lo02/e;", "", "<init>", "()V", "Lj93/d;", "itemClass", "Lkotlin/Function1;", "Lj02/c;", "Lcom/whoop/navigation/reducer/NavigationScreenConfig;", "config", "Ll83/a0;", "a", "(Lj93/d;Lkotlin/jvm/functions/Function1;)V", "", "Lo02/d;", "Ljava/util/List;", "c", "()Ljava/util/List;", "mappers", "", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "configs", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27354e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC27353d> mappers = new ArrayList();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Map<InterfaceC21461d, Function1> configs = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final void m82530a(InterfaceC21461d itemClass, Function1 config) {
        AbstractC22676k.m65750j(itemClass, "itemClass");
        AbstractC22676k.m65750j(config, "config");
        this.configs.put(itemClass, config);
    }

    /* JADX INFO: renamed from: b */
    public final Map<InterfaceC21461d, Function1> m82531b() {
        return this.configs;
    }

    /* JADX INFO: renamed from: c */
    public final List<InterfaceC27353d> m82532c() {
        return this.mappers;
    }
}
