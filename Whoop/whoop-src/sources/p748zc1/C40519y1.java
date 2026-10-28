package p748zc1;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.showcase.navigation.DesignShowcaseGalleryType;
import gd1.InterfaceC15714a;
import id1.AbstractC18410a;
import java.util.HashSet;
import java.util.List;
import p098dt.AbstractC12350b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: zc1.y1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\rj\b\u0012\u0004\u0012\u00020\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m65681d2 = {"Lzc1/y1;", "Lgd1/a;", "Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;", "<init>", "()V", "itemType", "", "Lm91/u;", "c", "(Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;)Ljava/util/List;", "Lid1/a;", "d", "(Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;)Lid1/a;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "a", "Ljava/util/HashSet;", "iconsSet", "design-showcase_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40519y1 implements InterfaceC15714a<DesignShowcaseGalleryType> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final HashSet<DesignShowcaseGalleryType> iconsSet = AbstractC12350b.m34602w(DesignShowcaseGalleryType.ATOM_ICON_ACTION, DesignShowcaseGalleryType.ATOM_ICON_ACTIVITIES, DesignShowcaseGalleryType.ATOM_ICON_CONNECTIONS, DesignShowcaseGalleryType.ATOM_ICON_GENERAL, DesignShowcaseGalleryType.ATOM_ICON_GROWTH, DesignShowcaseGalleryType.ATOM_ICON_LOGO, DesignShowcaseGalleryType.ATOM_ICON_NAVIGATION, DesignShowcaseGalleryType.ATOM_ICON_RECOVERY, DesignShowcaseGalleryType.ATOM_ICON_SLEEP, DesignShowcaseGalleryType.ATOM_ICON_STRAIN, DesignShowcaseGalleryType.ATOM_ICON_STRAP, DesignShowcaseGalleryType.ATOM_ICON_VARIOUS);

    /* JADX INFO: renamed from: zc1.y1$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f174438a;

        static {
            int[] iArr = new int[DesignShowcaseGalleryType.values().length];
            try {
                iArr[DesignShowcaseGalleryType.ATOM_BUTTON_ICON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DesignShowcaseGalleryType.ATOM_SWITCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DesignShowcaseGalleryType.ATOM_ICON_ACTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DesignShowcaseGalleryType.ATOM_ICON_ACTIVITIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DesignShowcaseGalleryType.ATOM_ICON_CONNECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DesignShowcaseGalleryType.ATOM_ICON_GENERAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DesignShowcaseGalleryType.ATOM_ICON_GROWTH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DesignShowcaseGalleryType.ATOM_ICON_LOGO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DesignShowcaseGalleryType.ATOM_ICON_NAVIGATION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[DesignShowcaseGalleryType.ATOM_ICON_RECOVERY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[DesignShowcaseGalleryType.ATOM_ICON_SLEEP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[DesignShowcaseGalleryType.ATOM_ICON_STRAIN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[DesignShowcaseGalleryType.ATOM_ICON_STRAP.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[DesignShowcaseGalleryType.ATOM_ICON_VARIOUS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[DesignShowcaseGalleryType.PARTICLE_COLOR.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[DesignShowcaseGalleryType.PARTICLE_STYLE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[DesignShowcaseGalleryType.PARTICLE_TYPOGRAPHY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            f174438a = iArr;
        }
    }

    @Override // gd1.InterfaceC15714a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public List<InterfaceC25312u> mo32936b(DesignShowcaseGalleryType itemType) {
        AbstractC22676k.m65750j(itemType, "itemType");
        switch (a.f174438a[itemType.ordinal()]) {
            case 1:
                return AbstractC40467t.m130855a();
            case 2:
                return AbstractC40487v.m130993a();
            case 3:
                return AbstractC40477u.m130891a();
            case 4:
                return AbstractC40477u.m130892b();
            case 5:
                return AbstractC40477u.m130893c();
            case 6:
                return AbstractC40477u.m130894d();
            case 7:
                return AbstractC40477u.m130895e();
            case 8:
                return AbstractC40477u.m130896f();
            case 9:
                return AbstractC40477u.m130897g();
            case 10:
                return AbstractC40477u.m130898h();
            case 11:
                return AbstractC40477u.m130899i();
            case 12:
                return AbstractC40477u.m130900j();
            case 13:
                return AbstractC40477u.m130901k();
            case 14:
                return AbstractC40477u.m130902l();
            case 15:
                return AbstractC40523y5.m131218a();
            case 16:
                return AbstractC40523y5.m131219b();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC40523y5.m131220c();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // gd1.InterfaceC15714a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public AbstractC18410a mo32935a(DesignShowcaseGalleryType itemType) {
        AbstractC22676k.m65750j(itemType, "itemType");
        if (this.iconsSet.contains(itemType)) {
            return new AbstractC18410a.a(3);
        }
        int i13 = a.f174438a[itemType.ordinal()];
        return (i13 == 1 || i13 == 15 || i13 == 16) ? new AbstractC18410a.a(2) : AbstractC18410a.b.f71609a;
    }
}
