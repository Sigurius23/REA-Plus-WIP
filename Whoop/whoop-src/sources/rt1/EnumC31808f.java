package rt1;

import com.whoop.design.util.TextResource;
import ge3.AbstractC15751g;
import java.util.Locale;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import rs1.AbstractC31794f;
import t83.InterfaceC33616a;
import xr2.InterfaceC38631a;

/* JADX INFO: renamed from: rt1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, m65681d2 = {"Lrt1/f;", "Lxr2/a;", "", "", "serializedValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/whoop/design/util/TextResource;", "toLocalizedString", "()Lcom/whoop/design/util/TextResource;", "Ljava/lang/String;", "getSerializedValue", "()Ljava/lang/String;", "Companion", "a", "FATIGUE", "IRREGULAR_HEARTBEAT", "FAINTING", "DIZZINESS_OR_LIGHTHEADEDNESS", "CHEST_PAIN", "SHORTNESS_OF_BREATH", "HEART_PALPITATIONS", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC31808f implements InterfaceC38631a {
    FATIGUE("FATIGUE"),
    IRREGULAR_HEARTBEAT("IRREGULAR_HEARTBEAT"),
    FAINTING("FAINTING"),
    DIZZINESS_OR_LIGHTHEADEDNESS("DIZZINESS_OR_LIGHTHEADEDNESS"),
    CHEST_PAIN("CHEST_PAIN"),
    SHORTNESS_OF_BREATH("SHORTNESS_OF_BREATH"),
    HEART_PALPITATIONS("HEART_PALPITATIONS");

    private final String serializedValue;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: rt1.f$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lrt1/f$a;", "", "<init>", "()V", "", "value", "Lrt1/f;", "a", "(Ljava/lang/String;)Lrt1/f;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final EnumC31808f m98811a(String value) {
            AbstractC22676k.m65750j(value, "value");
            for (EnumC31808f enumC31808f : EnumC31808f.values()) {
                Locale ROOT = Locale.ROOT;
                AbstractC22676k.m65749i(ROOT, "ROOT");
                String upperCase = value.toUpperCase(ROOT);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                if (upperCase.equals(enumC31808f.getSerializedValue())) {
                    return enumC31808f;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: rt1.f$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f131745a;

        static {
            int[] iArr = new int[EnumC31808f.values().length];
            try {
                iArr[EnumC31808f.FATIGUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC31808f.IRREGULAR_HEARTBEAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC31808f.FAINTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC31808f.DIZZINESS_OR_LIGHTHEADEDNESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC31808f.CHEST_PAIN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC31808f.SHORTNESS_OF_BREATH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC31808f.HEART_PALPITATIONS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f131745a = iArr;
        }
    }

    EnumC31808f(String str) {
        this.serializedValue = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    @Override // xr2.InterfaceC38631a
    public String getSerializedValue() {
        return this.serializedValue;
    }

    public final TextResource toLocalizedString() {
        switch (b.f131745a[ordinal()]) {
            case 1:
                return new TextResource.C8688b(AbstractC31794f.f131692x0, null, 2, null);
            case 2:
                return new TextResource.C8688b(AbstractC31794f.f131696z0, null, 2, null);
            case 3:
                return new TextResource.C8688b(AbstractC31794f.f131690w0, null, 2, null);
            case 4:
                return new TextResource.C8688b(AbstractC31794f.f131686u0, null, 2, null);
            case 5:
                return new TextResource.C8688b(AbstractC31794f.f131684t0, null, 2, null);
            case 6:
                return new TextResource.C8688b(AbstractC31794f.f131620C0, null, 2, null);
            case 7:
                return new TextResource.C8688b(AbstractC31794f.f131694y0, null, 2, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
