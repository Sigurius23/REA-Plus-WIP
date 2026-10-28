package h91;

import java.time.LocalDate;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h91.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ljava/time/LocalDate;", "monthDate", "a", "(Ljava/time/LocalDate;)Ljava/time/LocalDate;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17028c {
    /* JADX INFO: renamed from: a */
    public static final LocalDate m48089a(LocalDate monthDate) {
        AbstractC22676k.m65750j(monthDate, "monthDate");
        LocalDate localDateOf = LocalDate.of(monthDate.getYear(), monthDate.getMonth(), 1);
        AbstractC22676k.m65749i(localDateOf, "of(...)");
        return localDateOf;
    }
}
