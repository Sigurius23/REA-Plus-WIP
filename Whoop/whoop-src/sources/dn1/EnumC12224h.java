package dn1;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: dn1.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m65681d2 = {"Ldn1/h;", "", "", "gaugeIndex", "<init>", "(Ljava/lang/String;II)V", "I", "getGaugeIndex", "()I", "Companion", "a", "START", "END", "NONE", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC12224h {
    START(1),
    END(3),
    NONE(-1);

    private final int gaugeIndex;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: dn1.h$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Ldn1/h$a;", "", "<init>", "()V", "", "value", "Ldn1/h;", "a", "(Ljava/lang/Integer;)Ldn1/h;", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final EnumC12224h m33960a(Integer value) {
            EnumC12224h enumC12224h;
            if (value != null) {
                EnumC12224h[] enumC12224hArrValues = EnumC12224h.values();
                int length = enumC12224hArrValues.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        enumC12224h = null;
                        break;
                    }
                    enumC12224h = enumC12224hArrValues[i13];
                    if (enumC12224h.getGaugeIndex() == value.intValue()) {
                        break;
                    }
                    i13++;
                }
                if (enumC12224h != null) {
                    return enumC12224h;
                }
            }
            return EnumC12224h.NONE;
        }

        private Companion() {
        }
    }

    EnumC12224h(int i13) {
        this.gaugeIndex = i13;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final int getGaugeIndex() {
        return this.gaugeIndex;
    }
}
