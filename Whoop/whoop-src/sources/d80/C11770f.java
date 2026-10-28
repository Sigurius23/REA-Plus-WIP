package d80;

import c31.C3927k;
import c31.EnumC3921e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import ny0.C27256h;
import ny0.EnumC27272p;
import p390p1.AbstractC28683x;
import p390p1.InterfaceC28601c1;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: d80.f */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0013B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\u0005J\u0017\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R+\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u0010R/\u0010\u001e\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u0005¨\u0006\u001f"}, m65681d2 = {"Ld80/f;", "", "Lc31/k;", "initialProgressButtonState", "<init>", "(Lc31/k;)V", "Lc31/e;", "action", "Ll83/a0;", "d", "(Lc31/e;)V", "newState", "i", "", "defaultEnabled", "e", "(Z)V", "Lny0/h;", "button", "a", "(Lny0/h;)Lny0/h;", "<set-?>", "Lp1/c1;", "b", "()Z", "g", "footerButtonsEnabled", "c", "()Lc31/k;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "progressButtonState", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11770f {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC28601c1 footerButtonsEnabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC28601c1 progressButtonState;

    /* JADX INFO: renamed from: d80.f$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Ld80/f$a;", "", "<init>", "()V", "Lny0/h;", "", "enabled", "a", "(Lny0/h;Z)Lny0/h;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: d80.f$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class C41457a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f38146a;

            static {
                int[] iArr = new int[EnumC27272p.values().length];
                try {
                    iArr[EnumC27272p.HIGHLIGHT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC27272p.DEFAULT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f38146a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C27256h m31545a(C27256h c27256h, boolean z4) {
            AbstractC22676k.m65750j(c27256h, "<this>");
            if (!z4) {
                return C27256h.m82144b(c27256h, null, null, EnumC27272p.DEFAULT.getBackground(), EnumC39333f.WHITE_20, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33554419, null);
            }
            int i13 = C41457a.f38146a[c27256h.getStyle().ordinal()];
            if (i13 == 1) {
                EnumC27272p enumC27272p = EnumC27272p.HIGHLIGHT;
                return C27256h.m82144b(c27256h, null, null, enumC27272p.getBackground(), EnumC39333f.BRAND_BLACK, null, null, enumC27272p, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33554355, null);
            }
            if (i13 != 2) {
                return c27256h;
            }
            EnumC27272p enumC27272p2 = EnumC27272p.DEFAULT;
            return C27256h.m82144b(c27256h, null, null, enumC27272p2.getBackground(), EnumC39333f.BRAND_WHITE, null, null, enumC27272p2, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33554355, null);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: d80.f$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38147a;

        static {
            int[] iArr = new int[EnumC3921e.values().length];
            try {
                iArr[EnumC3921e.ENABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3921e.DISABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3921e.HIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3921e.SHOW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC3921e.DISMISS_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f38147a = iArr;
        }
    }

    public C11770f(C3927k c3927k) {
        this.footerButtonsEnabled = AbstractC28683x.m87272z(Boolean.valueOf(c3927k != null ? c3927k.getEnabled() : true));
        this.progressButtonState = AbstractC28683x.m87272z(c3927k);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m31536f(C11770f c11770f, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = true;
        }
        c11770f.m31543e(z4);
    }

    /* JADX INFO: renamed from: g */
    private final void m31537g(boolean z4) {
        this.footerButtonsEnabled.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: h */
    private final void m31538h(C3927k c3927k) {
        this.progressButtonState.setValue(c3927k);
    }

    /* JADX INFO: renamed from: a */
    public final C27256h m31539a(C27256h button) {
        AbstractC22676k.m65750j(button, "button");
        boolean z4 = m31540b() && button.getEnabled();
        return INSTANCE.m31545a(C27256h.m82144b(button, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, z4, false, null, null, null, null, null, null, null, 33488895, null), z4);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m31540b() {
        return ((Boolean) this.footerButtonsEnabled.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public final C3927k m31541c() {
        return (C3927k) this.progressButtonState.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final void m31542d(EnumC3921e action) {
        boolean zM31540b;
        C3927k c3927kM11937b;
        AbstractC22676k.m65750j(action, "action");
        int[] iArr = b.f38147a;
        int i13 = iArr[action.ordinal()];
        if (i13 != 1) {
            zM31540b = i13 != 2 ? m31540b() : false;
        } else {
            zM31540b = true;
        }
        m31537g(zM31540b);
        C3927k c3927kM31541c = m31541c();
        if (c3927kM31541c != null) {
            int i14 = iArr[action.ordinal()];
            if (i14 == 1) {
                c3927kM11937b = C3927k.m11937b(c3927kM31541c, null, null, null, null, null, null, 0, 0, null, true, false, null, null, null, null, null, null, 130559, null);
            } else if (i14 == 2) {
                c3927kM11937b = C3927k.m11937b(c3927kM31541c, null, null, null, null, null, null, 0, 0, null, false, false, null, null, null, null, null, null, 130559, null);
            } else if (i14 == 3) {
                c3927kM11937b = C3927k.m11937b(c3927kM31541c, null, null, null, null, null, null, 0, 0, null, false, false, null, null, null, null, null, null, 130047, null);
            } else if (i14 == 4) {
                c3927kM11937b = C3927k.m11937b(c3927kM31541c, null, null, null, null, null, null, 0, 0, null, false, true, null, null, null, null, null, null, 130047, null);
            } else {
                if (i14 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                c3927kM11937b = C3927k.m11937b(c3927kM31541c, null, null, null, null, null, null, 0, 0, null, false, false, null, null, null, null, null, null, 131047, null);
            }
        } else {
            c3927kM11937b = null;
        }
        m31538h(c3927kM11937b);
    }

    /* JADX INFO: renamed from: e */
    public final void m31543e(boolean defaultEnabled) {
        C3927k c3927kM31541c = m31541c();
        if (c3927kM31541c != null) {
            defaultEnabled = c3927kM31541c.getEnabled();
        }
        m31537g(defaultEnabled);
    }

    /* JADX INFO: renamed from: i */
    public final void m31544i(C3927k newState) {
        m31538h(newState);
        m31537g(newState != null ? newState.getEnabled() : m31540b());
    }
}
