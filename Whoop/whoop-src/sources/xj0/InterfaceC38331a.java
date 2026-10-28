package xj0;

import gk0.C15924a;
import hk0.C17366a;
import java.nio.ByteBuffer;
import lt0.InterfaceC24724a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import st0.EnumC32978v;

/* JADX INFO: renamed from: xj0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000bH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, m65681d2 = {"Lxj0/a;", "", "Llt0/a;", "command", "Ljava/nio/ByteBuffer;", "commandPayload", "b", "(Llt0/a;Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;", "payload", "a", "(Ljava/nio/ByteBuffer;)Llt0/a;", "", "d", "(Ljava/nio/ByteBuffer;)B", "value", "Ll83/a0;", "c", "(Ljava/nio/ByteBuffer;B)V", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC38331a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f164250a;

    /* JADX INFO: renamed from: xj0.a$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lxj0/a$a;", "", "<init>", "()V", "Lst0/v;", "deviceType", "Lxj0/a;", "a", "(Lst0/v;)Lxj0/a;", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ Companion f164250a = new Companion();

        /* JADX INFO: renamed from: xj0.a$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class C42643a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f164251a;

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
                f164251a = iArr;
            }
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC38331a m122890a(EnumC32978v deviceType) {
            AbstractC22676k.m65750j(deviceType, "deviceType");
            switch (C42643a.f164251a[deviceType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    return C15924a.INSTANCE.m44943b();
                case 4:
                    return C15924a.INSTANCE.m44942a();
                case 5:
                case 6:
                    return C17366a.f67286b;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    InterfaceC24724a mo44938a(ByteBuffer payload);

    /* JADX INFO: renamed from: b */
    ByteBuffer mo44939b(InterfaceC24724a command, ByteBuffer commandPayload);

    /* JADX INFO: renamed from: c */
    void mo44940c(ByteBuffer payload, byte value);

    /* JADX INFO: renamed from: d */
    byte mo44941d(ByteBuffer payload);
}
