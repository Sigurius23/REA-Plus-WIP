package zj0;

import gk0.C15925b;
import hk0.C17384s;
import java.nio.ByteBuffer;
import lt0.InterfaceC24724a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import st0.EnumC32978v;
import wj0.EnumC37318b;

/* JADX INFO: renamed from: zj0.f0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, m65681d2 = {"Lzj0/f0;", "", "Ljava/nio/ByteBuffer;", "payload", "Llt0/a;", "a", "(Ljava/nio/ByteBuffer;)Llt0/a;", "", "d", "(Ljava/nio/ByteBuffer;)B", "Lwj0/b;", "b", "(Ljava/nio/ByteBuffer;)Lwj0/b;", "", "c", "()I", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC40722f0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f175638a;

    /* JADX INFO: renamed from: zj0.f0$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lzj0/f0$a;", "", "<init>", "()V", "Lst0/v;", "deviceType", "Lzj0/f0;", "a", "(Lst0/v;)Lzj0/f0;", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ Companion f175638a = new Companion();

        /* JADX INFO: renamed from: zj0.f0$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class C42759a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f175639a;

            static {
                int[] iArr = new int[EnumC32978v.values().length];
                try {
                    iArr[EnumC32978v.GEN_4.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC32978v.MAVERICK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC32978v.GOOSE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC32978v.PUFFIN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC32978v.MONUMENT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC32978v.SYMPHONY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f175639a = iArr;
            }
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC40722f0 m132190a(EnumC32978v deviceType) {
            AbstractC22676k.m65750j(deviceType, "deviceType");
            switch (C42759a.f175639a[deviceType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    return C15925b.INSTANCE.m44955b();
                case 4:
                    return C15925b.INSTANCE.m44954a();
                case 5:
                case 6:
                    return C17384s.f67321b;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    InterfaceC24724a mo44950a(ByteBuffer payload);

    /* JADX INFO: renamed from: b */
    EnumC37318b mo44951b(ByteBuffer payload);

    /* JADX INFO: renamed from: c */
    int mo44952c();

    /* JADX INFO: renamed from: d */
    byte mo44953d(ByteBuffer payload);
}
