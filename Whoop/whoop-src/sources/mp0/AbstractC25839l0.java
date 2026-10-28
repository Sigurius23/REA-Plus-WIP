package mp0;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import kp0.AbstractC22734a;
import kp0.C22736c;
import kp0.C22739f;
import kp0.C22747n;
import l83.C23465k;
import np0.EnumC27008a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import vu1.AbstractC36510a;

/* JADX INFO: renamed from: mp0.l0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Landroid/content/res/Resources;", "resources", "Lnp0/a;", "alarmType", "Ll83/k;", "", "c", "(Landroid/content/res/Resources;Lnp0/a;)Ll83/k;", "Lkp0/a;", "b", "(Landroid/content/res/Resources;Lkp0/a;)Ll83/k;", "notEnabledColor", "enabledColor", "Landroid/content/res/ColorStateList;", "a", "(II)Landroid/content/res/ColorStateList;", "sleep-coach_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25839l0 {

    /* JADX INFO: renamed from: mp0.l0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f101782a;

        static {
            int[] iArr = new int[EnumC27008a.values().length];
            try {
                iArr[EnumC27008a.EXACT_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC27008a.SLEEP_GOAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC27008a.IN_THE_GREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f101782a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final ColorStateList m76288a(int i13, int i14) {
        return new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}, new int[]{-16842919}}, new int[]{i14, i13});
    }

    /* JADX INFO: renamed from: b */
    public static final C23465k m76289b(Resources resources, AbstractC22734a alarmType) {
        AbstractC22676k.m65750j(resources, "resources");
        AbstractC22676k.m65750j(alarmType, "alarmType");
        if (!(alarmType instanceof C22736c) && !(alarmType instanceof C22739f)) {
            if (alarmType instanceof C22747n) {
                return new C23465k(Integer.valueOf(resources.getColor(AbstractC36510a.f156038q, null)), Integer.valueOf(resources.getColor(AbstractC36510a.f156039r, null)));
            }
            throw new NoWhenBranchMatchedException();
        }
        return new C23465k(Integer.valueOf(resources.getColor(AbstractC36510a.f156003L, null)), Integer.valueOf(resources.getColor(AbstractC36510a.f156004M, null)));
    }

    /* JADX INFO: renamed from: c */
    public static final C23465k m76290c(Resources resources, EnumC27008a alarmType) {
        AbstractC22676k.m65750j(resources, "resources");
        AbstractC22676k.m65750j(alarmType, "alarmType");
        int i13 = a.f101782a[alarmType.ordinal()];
        if (i13 == 1) {
            return new C23465k(Integer.valueOf(resources.getColor(AbstractC36510a.f156042u, null)), Integer.valueOf(resources.getColor(AbstractC36510a.f156007P, null)));
        }
        if (i13 == 2) {
            return new C23465k(Integer.valueOf(resources.getColor(AbstractC36510a.f156038q, null)), Integer.valueOf(resources.getColor(AbstractC36510a.f156039r, null)));
        }
        if (i13 == 3) {
            return new C23465k(Integer.valueOf(resources.getColor(AbstractC36510a.f156003L, null)), Integer.valueOf(resources.getColor(AbstractC36510a.f156004M, null)));
        }
        throw new NoWhenBranchMatchedException();
    }
}
