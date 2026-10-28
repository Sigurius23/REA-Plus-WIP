package yv2;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: yv2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0007\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m65681d2 = {"Lyv2/a;", "", "", "columnWeight", "<init>", "(Ljava/lang/String;IF)V", "F", "getColumnWeight", "()F", "DAY", "MONTH", "YEAR", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC39807a {
    DAY(0.7f),
    MONTH(1.8f),
    YEAR(1.1f);

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final float columnWeight;

    EnumC39807a(float f13) {
        this.columnWeight = f13;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final float getColumnWeight() {
        return this.columnWeight;
    }
}
