package oi2;

import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import ui2.EnumC35020a;

/* JADX INFO: renamed from: oi2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lui2/a;", "", "b", "(Lui2/a;)Ljava/lang/String;", "streaks_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27952c {

    /* JADX INFO: renamed from: oi2.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f112746a;

        static {
            int[] iArr = new int[EnumC35020a.values().length];
            try {
                iArr[EnumC35020a.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC35020a.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC35020a.BROKEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC35020a.FROZEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f112746a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final String m84393b(EnumC35020a enumC35020a) {
        int i13 = enumC35020a == null ? -1 : a.f112746a[enumC35020a.ordinal()];
        if (i13 == -1) {
            return "";
        }
        if (i13 == 1) {
            return "healthy";
        }
        if (i13 == 2) {
            return "at risk";
        }
        if (i13 == 3) {
            return "broken";
        }
        if (i13 == 4) {
            return "frozen";
        }
        throw new NoWhenBranchMatchedException();
    }
}
