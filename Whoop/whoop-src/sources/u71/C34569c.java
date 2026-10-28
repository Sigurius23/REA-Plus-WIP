package u71;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.items.emoji.EmojiModel;
import com.whoop.design.models.items.whooprow.WhoopRowModel;
import com.whoop.navigation.C9598e;
import com.whoop.settings.journalv2.AbstractC10114e;
import jb1.C21536b;
import p319m4.AbstractC25012a;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.C25308q;
import p739ui0.AbstractC35005g;
import p739ui0.AbstractC35012n;
import ri0.InterfaceC31443b;
import sf0.InterfaceC32443a;
import td2.InterfaceC33715f;
import u80.AbstractC34633c;
import u80.C34631a;
import u90.AbstractC34654b;
import ub1.AbstractC34741a;
import ub2.AbstractC34745d;
import uc1.AbstractC34760a;
import uc3.C34769g;
import ud2.AbstractC34792a;
import ud2.AbstractC34796e;
import uf0.AbstractC34906g;
import uf0.AbstractC34907h;
import ug.AbstractC34930s;
import ug2.AbstractC34949b;
import ug2.AbstractC34951d;
import uh1.C34967b;
import uk2.AbstractC35052b;

/* JADX INFO: renamed from: u71.c */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C34569c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f145580w;

    public /* synthetic */ C34569c(int i13) {
        this.f145580w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f145580w) {
            case 0:
                return AbstractC34570d.m109305d(obj);
            case 1:
                return AbstractC34573g.m109336s(obj);
            case 2:
                return AbstractC34575i.m109350d(obj);
            case 3:
                return AbstractC34633c.m109439i((C34631a) obj);
            case 4:
                return AbstractC34633c.m109443m(obj);
            case 5:
                return AbstractC34654b.m109506d(obj);
            case 6:
                return AbstractC34741a.m109734c((C23749z0) obj);
            case 7:
                return AbstractC34741a.m109735d((EmojiModel) obj);
            case 8:
                return AbstractC34745d.m109745c((C25308q) obj);
            case 9:
                return Integer.valueOf(AbstractC10114e.m25471u(((Integer) obj).intValue()));
            case 10:
                return Integer.valueOf(AbstractC10114e.m25472v(((Integer) obj).intValue()));
            case 11:
                return AbstractC34760a.m109765h((C23749z0) obj);
            case 12:
                return AbstractC34760a.m109766i((WhoopRowModel) obj);
            case 13:
                C34769g it = (C34769g) obj;
                AbstractC22676k.m65750j(it, "it");
                StringBuilder sb4 = new StringBuilder("position ");
                sb4.append(it.f146436a);
                sb4.append(": '");
                return AbstractC25012a.m73377j(sb4, (String) it.f146437b.invoke(), '\'');
            case 14:
                return AbstractC34792a.m109799e((C9598e) obj);
            case 15:
                return AbstractC34796e.m109826H((InterfaceC33715f.f) obj);
            case 16:
                return AbstractC34906g.m110077t(obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC34906g.m110078u((C25308q) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC34907h.m110092k((InterfaceC32443a) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((Character) obj).getClass();
                int i13 = AbstractC34930s.f147047a;
                return 0;
            case 20:
                AbstractC22676k.m65750j((String) obj, "it");
                return 0;
            case 21:
                return AbstractC34949b.m110402c((C25308q) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC34951d.m110414i(obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC34951d.m110420o(obj);
            case 24:
                return C34967b.m110441l((InterfaceC33687a) obj);
            case 25:
                return AbstractC35005g.m110529f(obj);
            case 26:
                return AbstractC35012n.m110602x((InterfaceC31443b) obj);
            case 27:
                return AbstractC35052b.m110797g((C21536b) obj);
            case 28:
                return AbstractC35052b.m110800j((C25308q) obj);
            default:
                return AbstractC35052b.m110798h((C23749z0) obj);
        }
    }
}
