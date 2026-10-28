package p734sl0;

import com.whoop.navigation.ChatEntrypointExperience;
import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: sl0.x1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m65681d2 = {"Lsl0/x1;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "NONE", "VOICE", "KEYBOARD", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC32692x1 {
    NONE,
    VOICE,
    KEYBOARD;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: sl0.x1$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lsl0/x1$a;", "", "<init>", "()V", "Lcom/whoop/navigation/ChatEntrypointExperience;", "entrypoint", "Lsl0/x1;", "a", "(Lcom/whoop/navigation/ChatEntrypointExperience;)Lsl0/x1;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: sl0.x1$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class C42326a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f135774a;

            static {
                int[] iArr = new int[ChatEntrypointExperience.values().length];
                try {
                    iArr[ChatEntrypointExperience.QUICK_VOICE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ChatEntrypointExperience.QUICK_KEYBOARD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ChatEntrypointExperience.STANDARD.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ChatEntrypointExperience.FAB_VOICE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ChatEntrypointExperience.QUICK_CAMERA_ROLL.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ChatEntrypointExperience.QUICK_FILES.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[ChatEntrypointExperience.QUICK_CAMERA_FRONT.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[ChatEntrypointExperience.QUICK_CAMERA_BACK.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[ChatEntrypointExperience.QUICK_HISTORY.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[ChatEntrypointExperience.FORM_INPUT_ONLY.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                f135774a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final EnumC32692x1 m102585a(ChatEntrypointExperience entrypoint) {
            switch (entrypoint == null ? -1 : C42326a.f135774a[entrypoint.ordinal()]) {
                case -1:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    return EnumC32692x1.NONE;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    return EnumC32692x1.VOICE;
                case 2:
                    return EnumC32692x1.KEYBOARD;
            }
        }

        private Companion() {
        }
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }
}
