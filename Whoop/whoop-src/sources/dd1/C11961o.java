package dd1;

import com.whoop.design.showcase.navigation.DesignShowcaseMenuType;
import ed1.C13113b;
import gd1.InterfaceC15714a;
import i93.C18283i;
import i93.C18284j;
import id1.AbstractC18410a;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25243e0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import n91.AbstractC26477b;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: dd1.o */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Ldd1/o;", "Lgd1/a;", "Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;", "<init>", "()V", "", "Lm91/u;", "g", "()Ljava/util/List;", "c", "itemType", "e", "(Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;)Ljava/util/List;", "menuType", "", "d", "(Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;)Ljava/lang/String;", "design-showcase_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11961o implements InterfaceC15714a<DesignShowcaseMenuType> {

    /* JADX INFO: renamed from: dd1.o$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f39310a;

        static {
            int[] iArr = new int[DesignShowcaseMenuType.values().length];
            try {
                iArr[DesignShowcaseMenuType.ATOMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DesignShowcaseMenuType.ATOM_ICONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DesignShowcaseMenuType.ATOM_BUTTONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DesignShowcaseMenuType.ATOM_PROGRESS_BAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DesignShowcaseMenuType.COMPOSE_STRESS_TEST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DesignShowcaseMenuType.MOLECULES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DesignShowcaseMenuType.MOLECULE_GRAPHING_ELEMENTS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DesignShowcaseMenuType.MOLECULES_TILES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DesignShowcaseMenuType.ORGANISMS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[DesignShowcaseMenuType.PARTICLES.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[DesignShowcaseMenuType.ROOT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[DesignShowcaseMenuType.TEMPLATES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f39310a = iArr;
        }
    }

    /* JADX INFO: renamed from: c */
    private final List<InterfaceC25312u> m32933c() {
        C18284j c18284j = new C18284j(0, 100, 1);
        ArrayList arrayList = new ArrayList();
        Iterator it = c18284j.iterator();
        while (((C18283i) it).f71138y) {
            int iNextInt = ((AbstractC25243e0) it).nextInt();
            C18284j c18284j2 = new C18284j(1, 10, 1);
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(c18284j2, 10));
            Iterator it3 = c18284j2.iterator();
            while (((C18283i) it3).f71138y) {
                arrayList2.add(AbstractC11964r.m32943b(AbstractC2875y.m8295h((iNextInt * 10) + ((AbstractC25243e0) it3).nextInt(), "Item "), null, null, 6, null));
            }
            C13113b[] c13113bArr = (C13113b[]) arrayList2.toArray(new C13113b[0]);
            AbstractC25265s.m74141p0(arrayList, AbstractC26477b.m78414b((InterfaceC25312u[]) Arrays.copyOf(c13113bArr, c13113bArr.length)).mo78412a());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    private final List<InterfaceC25312u> m32934g() {
        return AbstractC26477b.m78413a(AbstractC37056f.m118959K(AbstractC26477b.m78414b(AbstractC11964r.m32943b("Particles", AbstractC11964r.m32947f(DesignShowcaseMenuType.PARTICLES), null, 4, null), AbstractC11964r.m32943b("Atoms", AbstractC11964r.m32947f(DesignShowcaseMenuType.ATOMS), null, 4, null), AbstractC11964r.m32943b("Molecules", AbstractC11964r.m32947f(DesignShowcaseMenuType.MOLECULES), null, 4, null), AbstractC11964r.m32943b("Organisms", AbstractC11964r.m32947f(DesignShowcaseMenuType.ORGANISMS), null, 4, null), AbstractC11964r.m32943b("Templates", AbstractC11964r.m32947f(DesignShowcaseMenuType.TEMPLATES), null, 4, null)), AbstractC26477b.m78414b(AbstractC11964r.m32943b("Compose Legacy Interop Test", AbstractC11964r.m32946e(), null, 4, null), AbstractC11964r.m32943b("Compose Stress Test", AbstractC11964r.m32947f(DesignShowcaseMenuType.COMPOSE_STRESS_TEST), null, 4, null))));
    }

    /* JADX INFO: renamed from: d */
    public final String m32937d(DesignShowcaseMenuType menuType) {
        if (menuType == null || menuType == DesignShowcaseMenuType.ROOT) {
            return "";
        }
        String strM32937d = m32937d(menuType.getParent());
        int length = strM32937d.length();
        String title = menuType.getTitle();
        return length == 0 ? title : AbstractC18489d0.m53370k(strM32937d, " > ", title);
    }

    @Override // gd1.InterfaceC15714a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public List<InterfaceC25312u> mo32936b(DesignShowcaseMenuType itemType) {
        List<InterfaceC25312u> listM32278a;
        C13113b c13113bM36660g;
        AbstractC22676k.m65750j(itemType, "itemType");
        String strM32937d = m32937d(itemType);
        if (strM32937d.length() == 0) {
            strM32937d = DesignShowcaseMenuType.ROOT.getTitle();
        }
        String str = strM32937d;
        switch (a.f39310a[itemType.ordinal()]) {
            case 1:
                listM32278a = AbstractC11947a.m32278a();
                break;
            case 2:
                listM32278a = AbstractC11963q.m32941a();
                break;
            case 3:
                listM32278a = AbstractC11948b.m32279a();
                break;
            case 4:
                listM32278a = AbstractC11968v.m32951a();
                break;
            case 5:
                listM32278a = m32933c();
                break;
            case 6:
                listM32278a = AbstractC11965s.m32948a();
                break;
            case 7:
                listM32278a = AbstractC11962p.m32940a();
                break;
            case 8:
                listM32278a = AbstractC11970x.m32953a();
                break;
            case 9:
                listM32278a = AbstractC11966t.m32949a();
                break;
            case 10:
                listM32278a = AbstractC11967u.m32950a();
                break;
            case 11:
                listM32278a = m32934g();
                break;
            case 12:
                listM32278a = AbstractC11969w.m32952a();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        List<InterfaceC25312u> list = listM32278a;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (InterfaceC25312u interfaceC25312u : list) {
            C13113b c13113b = interfaceC25312u instanceof C13113b ? (C13113b) interfaceC25312u : null;
            if (c13113b != null && (c13113bM36660g = C13113b.m36660g(c13113b, null, null, null, str, false, null, 55, null)) != null) {
                interfaceC25312u = c13113bM36660g;
            }
            arrayList.add(interfaceC25312u);
        }
        return arrayList;
    }

    @Override // gd1.InterfaceC15714a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public /* bridge */ AbstractC18410a mo32935a(DesignShowcaseMenuType designShowcaseMenuType) {
        return super.mo32935a(designShowcaseMenuType);
    }
}
