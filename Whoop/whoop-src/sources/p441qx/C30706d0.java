package p441qx;

import java.util.Comparator;
import java.util.Locale;
import java.util.Map;
import ki.InterfaceC22490b;
import ki.InterfaceC22491c;
import l83.C23465k;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import t23.C33392g2;
import t23.C33465v0;
import tg.C33770b;
import y00.EnumC38853i;

/* JADX INFO: renamed from: qx.d0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C30706d0 implements Comparator {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f126448w;

    public /* synthetic */ C30706d0(int i13) {
        this.f126448w = i13;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f126448w) {
            case 0:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 1:
                return AbstractC30060g.m92127q(Integer.valueOf(((InterfaceC22491c) obj2).mo37116b()), Integer.valueOf(((InterfaceC22491c) obj).mo37116b()));
            case 2:
                ((InterfaceC22490b) obj2).getClass();
                ((InterfaceC22490b) obj).getClass();
                return AbstractC30060g.m92127q(0, 0);
            case 3:
                return AbstractC30060g.m92127q((Float) ((C33392g2) obj2).f139410B.getValue(), (Float) ((C33392g2) obj).f139410B.getValue());
            case 4:
                return AbstractC30060g.m92127q(Integer.valueOf(((C33465v0) obj).f139736d), Integer.valueOf(((C33465v0) obj2).f139736d));
            case 5:
                return AbstractC30060g.m92127q(((C33770b) ((Map.Entry) obj).getKey()).f141349b, ((C33770b) ((Map.Entry) obj2).getKey()).f141349b);
            case 6:
                return AbstractC30060g.m92127q(((C33770b) obj).f141349b, ((C33770b) obj2).f141349b);
            case 7:
                String str = (String) ((Map.Entry) obj).getKey();
                Locale locale = Locale.ROOT;
                String lowerCase = str.toLowerCase(locale);
                AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
                String lowerCase2 = ((String) ((Map.Entry) obj2).getKey()).toLowerCase(locale);
                AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
                return AbstractC30060g.m92127q(lowerCase, lowerCase2);
            case 8:
                return AbstractC30060g.m92127q((String) ((C23465k) obj).f92937w, (String) ((C23465k) obj2).f92937w);
            case 9:
                String str2 = (String) ((Map.Entry) obj).getKey();
                Locale locale2 = Locale.ROOT;
                String lowerCase3 = str2.toLowerCase(locale2);
                AbstractC22676k.m65749i(lowerCase3, "toLowerCase(...)");
                String lowerCase4 = ((String) ((Map.Entry) obj2).getKey()).toLowerCase(locale2);
                AbstractC22676k.m65749i(lowerCase4, "toLowerCase(...)");
                return AbstractC30060g.m92127q(lowerCase3, lowerCase4);
            default:
                return AbstractC30060g.m92127q(Integer.valueOf(((EnumC38853i) obj).f167259L), Integer.valueOf(((EnumC38853i) obj2).f167259L));
        }
    }
}
