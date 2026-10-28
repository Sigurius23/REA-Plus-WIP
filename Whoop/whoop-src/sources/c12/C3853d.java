package c12;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.core.app.NotificationCompat;

/* JADX INFO: renamed from: c12.d */
/* JADX INFO: loaded from: classes4.dex */
public class C3853d {

    /* JADX INFO: renamed from: a */
    private EnumC3851b f15767a;

    /* JADX INFO: renamed from: b */
    private String f15768b;

    /* JADX INFO: renamed from: c */
    private int f15769c;

    /* JADX INFO: renamed from: d */
    private int f15770d;

    /* JADX INFO: renamed from: e */
    private boolean f15771e;

    /* JADX INFO: renamed from: f */
    private boolean f15772f;

    /* JADX INFO: renamed from: g */
    private boolean f15773g;

    /* JADX INFO: renamed from: c12.d$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f15774a;

        static {
            int[] iArr = new int[EnumC3851b.values().length];
            f15774a = iArr;
            try {
                iArr[EnumC3851b.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15774a[EnumC3851b.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15774a[EnumC3851b.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15774a[EnumC3851b.URGENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15774a[EnumC3851b.MAX.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C3853d(EnumC3851b enumC3851b, String str, int i13) {
        m11808g(str);
        m11809h(i13);
        m11810i(enumC3851b);
        m11812k(true);
    }

    /* JADX INFO: renamed from: b */
    private void m11802b(NotificationCompat.Builder builder) {
        int i13 = a.f15774a[this.f15767a.ordinal()];
        if (i13 == 1) {
            builder.setPriority(-2);
            return;
        }
        if (i13 == 2) {
            builder.setPriority(-1);
            return;
        }
        if (i13 == 3) {
            builder.setPriority(0);
            return;
        }
        if (i13 == 4) {
            builder.setPriority(1);
        } else if (i13 != 5) {
            builder.setPriority(0);
        } else {
            builder.setPriority(2);
        }
    }

    /* JADX INFO: renamed from: c */
    private NotificationChannel m11803c(Context context) {
        NotificationChannel notificationChannel = new NotificationChannel(this.f15768b, context.getString(this.f15769c), m11804d());
        int i13 = this.f15770d;
        if (i13 != 0) {
            notificationChannel.setDescription(context.getString(i13));
        }
        notificationChannel.enableVibration(this.f15771e);
        notificationChannel.enableLights(this.f15772f);
        notificationChannel.setShowBadge(this.f15773g);
        return notificationChannel;
    }

    /* JADX INFO: renamed from: d */
    private int m11804d() {
        int i13 = a.f15774a[this.f15767a.ordinal()];
        int i14 = 1;
        if (i13 != 1) {
            i14 = 2;
            if (i13 != 2) {
                i14 = 4;
                if (i13 != 4 && i13 != 5) {
                    return 3;
                }
            }
        }
        return i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX INFO: renamed from: a */
    public void m11805a(NotificationCompat.Builder builder) {
        builder.setChannelId(this.f15768b);
        m11802b(builder);
        boolean zHasSound = this.f15767a.hasSound();
        ?? r10 = zHasSound;
        if (this.f15771e) {
            r10 = (zHasSound ? 1 : 0) | 2;
        }
        int i13 = r10;
        if (this.f15772f) {
            i13 = (r10 == true ? 1 : 0) | 4;
        }
        builder.setDefaults(i13);
    }

    /* JADX INFO: renamed from: e */
    public void m11806e(NotificationManager notificationManager, Context context) {
        notificationManager.createNotificationChannel(m11803c(context));
    }

    /* JADX INFO: renamed from: f */
    public C3853d m11807f(int i13) {
        this.f15770d = i13;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public C3853d m11808g(String str) {
        this.f15768b = str;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public C3853d m11809h(int i13) {
        this.f15769c = i13;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public C3853d m11810i(EnumC3851b enumC3851b) {
        this.f15767a = enumC3851b;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public C3853d m11811j(boolean z4) {
        this.f15772f = z4;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public C3853d m11812k(boolean z4) {
        this.f15773g = z4;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public C3853d m11813l(boolean z4) {
        this.f15771e = z4;
        return this;
    }
}
