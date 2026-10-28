package mk2;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mk2.k */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0007"}, m65681d2 = {"Lmk2/j;", "", "b", "(Lmk2/j;)Z", "usesTabbedLayout", "a", "usesHeartRateStream", "track-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25644k {
    /* JADX INFO: renamed from: a */
    public static final boolean m75456a(EnumC25643j enumC25643j) {
        AbstractC22676k.m65750j(enumC25643j, "<this>");
        return (enumC25643j == EnumC25643j.SLEEP || enumC25643j == EnumC25643j.NAP) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m75457b(EnumC25643j enumC25643j) {
        AbstractC22676k.m65750j(enumC25643j, "<this>");
        return enumC25643j == EnumC25643j.WORKOUT;
    }
}
