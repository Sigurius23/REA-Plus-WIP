package l03;

import c51.C4237n;
import c51.EnumC4225b0;
import e93.AbstractC12889b;
import java.util.Iterator;
import java.util.List;
import l83.C23465k;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p543v4.AbstractC35642a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: l03.c */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Ll03/c;", "", "<init>", "()V", "", "yearsDifferenceScore", "Lc51/n;", "settings", "Ll83/k;", "", "a", "(DLc51/n;)Ll83/k;", "", "ageSubtitleStyle", "Li2/x;", "c", "(Ljava/lang/String;)J", "widget_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C23053c {

    /* JADX INFO: renamed from: a */
    public static final C23053c f90915a = new C23053c();

    /* JADX INFO: renamed from: l03.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f90916a;

        static {
            int[] iArr = new int[EnumC4225b0.values().length];
            try {
                iArr[EnumC4225b0.YOUNGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4225b0.OLDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4225b0.CALIBRATING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC4225b0.NEUTRAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f90916a = iArr;
        }
    }

    private C23053c() {
    }

    /* JADX INFO: renamed from: a */
    public final C23465k m67002a(double yearsDifferenceScore, C4237n settings) {
        AbstractC22676k.m65750j(settings, "settings");
        List<C23465k> listM13202f = settings.m13202f();
        double size = yearsDifferenceScore * ((double) listM13202f.size());
        List<C23465k> list = listM13202f;
        int iM36285o = AbstractC12889b.m36285o((int) size, AbstractC37056f.m118950B(list));
        int iM36285o2 = AbstractC12889b.m36285o(AbstractC12889b.m36257W(Math.ceil(size)), AbstractC37056f.m118950B(list));
        float fM36283m = AbstractC12889b.m36283m((float) (size - ((double) iM36285o)), 0.0f, 1.0f);
        C23465k c23465k = listM13202f.get(iM36285o);
        C23465k c23465k2 = listM13202f.get(iM36285o2);
        return new C23465k(Integer.valueOf(AbstractC35642a.m112833b(fM36283m, AbstractC17918w0.m51506H(((C17919x) c23465k.f92937w).f69639a), AbstractC17918w0.m51506H(((C17919x) c23465k2.f92937w).f69639a))), Integer.valueOf(AbstractC35642a.m112833b(fM36283m, AbstractC17918w0.m51506H(((C17919x) c23465k.f92938x).f69639a), AbstractC17918w0.m51506H(((C17919x) c23465k2.f92938x).f69639a))));
    }

    /* JADX INFO: renamed from: c */
    public final long m67003c(String ageSubtitleStyle) {
        Object next;
        Iterator<E> it = EnumC4225b0.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((EnumC4225b0) next).name(), ageSubtitleStyle));
        EnumC4225b0 enumC4225b0 = (EnumC4225b0) next;
        int i13 = enumC4225b0 == null ? -1 : a.f90916a[enumC4225b0.ordinal()];
        if (i13 != -1) {
            if (i13 == 1) {
                return AbstractC17918w0.m51517e(4278579362L);
            }
            if (i13 == 2) {
                return AbstractC17918w0.m51517e(4293779860L);
            }
            if (i13 == 3) {
                return AbstractC17918w0.m51517e(4289453801L);
            }
            if (i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return AbstractC17918w0.m51517e(4285648113L);
    }
}
