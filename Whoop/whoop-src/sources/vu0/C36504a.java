package vu0;

import android.content.Context;
import b12.EnumC2287c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import st0.EnumC32978v;
import uv0.AbstractC35283c;
import x82.C38083j;

/* JADX INFO: renamed from: vu0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0019\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m65681d2 = {"Lvu0/a;", "", "Landroid/content/Context;", "context", "Lx82/j;", "stringsContextProvider", "<init>", "(Landroid/content/Context;Lx82/j;)V", "Lb12/c;", "bucket", "", "c", "(Lb12/c;)Ljava/lang/String;", "", "batteryLevel", "Lst0/v;", "strapGen", "b", "(ILst0/v;)Ljava/lang/String;", "a", "f", "(Lst0/v;)Ljava/lang/String;", "streakValue", "e", "(Ljava/lang/String;)Ljava/lang/String;", "d", "Landroid/content/Context;", "Lx82/j;", "g", "()Landroid/content/Context;", "stringsContext", "connectivity-notifications_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36504a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C38083j stringsContextProvider;

    /* JADX INFO: renamed from: vu0.a$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f155943a;

        static {
            int[] iArr = new int[EnumC2287c.values().length];
            try {
                iArr[EnumC2287c.BUCKET_LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2287c.BUCKET_MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2287c.BUCKET_HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f155943a = iArr;
        }
    }

    public C36504a(Context context, C38083j stringsContextProvider) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(stringsContextProvider, "stringsContextProvider");
        this.context = context;
        this.stringsContextProvider = stringsContextProvider;
    }

    /* JADX INFO: renamed from: g */
    private final Context m117001g() {
        return this.stringsContextProvider.m122034a(this.context);
    }

    /* JADX INFO: renamed from: a */
    public final String m117002a(int batteryLevel, EnumC32978v strapGen) {
        if (strapGen == null || !strapGen.isGen4()) {
            if (batteryLevel <= 5) {
                return "Less than 5%";
            }
            return batteryLevel <= 10 ? "Less than 10%" : "Less than 20%";
        }
        if (batteryLevel <= 5) {
            return "Less than 4 hours";
        }
        return batteryLevel <= 10 ? "Less than 12 hours" : "Less than 24 hours";
    }

    /* JADX INFO: renamed from: b */
    public final String m117003b(int batteryLevel, EnumC32978v strapGen) {
        if (strapGen == null || !strapGen.isGen4()) {
            if (batteryLevel < 5) {
                String string = m117001g().getString(AbstractC35283c.f150193j);
                AbstractC22676k.m65749i(string, "getString(...)");
                return string;
            }
            if (batteryLevel < 10) {
                String string2 = m117001g().getString(AbstractC35283c.f150191h);
                AbstractC22676k.m65749i(string2, "getString(...)");
                return string2;
            }
            String string3 = m117001g().getString(AbstractC35283c.f150192i);
            AbstractC22676k.m65749i(string3, "getString(...)");
            return string3;
        }
        if (batteryLevel < 5) {
            String string4 = m117001g().getString(AbstractC35283c.f150195l);
            AbstractC22676k.m65749i(string4, "getString(...)");
            return string4;
        }
        if (batteryLevel < 10) {
            String string5 = m117001g().getString(AbstractC35283c.f150197n);
            AbstractC22676k.m65749i(string5, "getString(...)");
            return string5;
        }
        String string6 = m117001g().getString(AbstractC35283c.f150194k);
        AbstractC22676k.m65749i(string6, "getString(...)");
        return string6;
    }

    /* JADX INFO: renamed from: c */
    public final String m117004c(EnumC2287c bucket) {
        AbstractC22676k.m65750j(bucket, "bucket");
        int i13 = a.f155943a[bucket.ordinal()];
        if (i13 == 1) {
            String string = m117001g().getString(AbstractC35283c.f150196m);
            AbstractC22676k.m65749i(string, "getString(...)");
            return string;
        }
        if (i13 == 2) {
            String string2 = m117001g().getString(AbstractC35283c.f150198o);
            AbstractC22676k.m65749i(string2, "getString(...)");
            return string2;
        }
        if (i13 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        String string3 = m117001g().getString(AbstractC35283c.f150198o);
        AbstractC22676k.m65749i(string3, "getString(...)");
        return string3;
    }

    /* JADX INFO: renamed from: d */
    public final String m117005d(EnumC32978v strapGen) {
        return (strapGen == null || !strapGen.isGen4()) ? "Less than 5% streak" : "Less than 12 hours streak";
    }

    /* JADX INFO: renamed from: e */
    public final String m117006e(String streakValue) {
        AbstractC22676k.m65750j(streakValue, "streakValue");
        String string = m117001g().getString(AbstractC35283c.f150202s, streakValue);
        AbstractC22676k.m65749i(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: f */
    public final String m117007f(EnumC32978v strapGen) {
        if (strapGen == null || !strapGen.isGen4()) {
            String string = m117001g().getString(AbstractC35283c.f150204u);
            AbstractC22676k.m65747g(string);
            return string;
        }
        String string2 = m117001g().getString(AbstractC35283c.f150203t);
        AbstractC22676k.m65747g(string2);
        return string2;
    }

    public /* synthetic */ C36504a(Context context, C38083j c38083j, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? new C38083j() : c38083j);
    }
}
