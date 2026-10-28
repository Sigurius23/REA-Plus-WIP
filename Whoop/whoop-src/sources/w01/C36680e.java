package w01;

import ad3.C0764g;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.onboardingpersonalization.dayzero.header.models.ConversationProgressBarModel;
import gv1.InterfaceC16239m;
import j93.InterfaceC21461d;
import jb1.C21536b;
import kotlinx.serialization.internal.PlatformKt;
import l83.C23454a0;
import p208i2.InterfaceC17886g0;
import p549vb.AbstractC35862g;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.C25308q;
import ra2.AbstractC31179a;
import ta2.AbstractC33673a;
import u60.InterfaceC34549a;
import v61.C35736a;
import v63.AbstractC35745c;
import w11.AbstractC36695b;
import w12.AbstractC36701d;
import w20.C36714d;
import w20.C36715e;
import w20.C36735y;
import w20.C36736z;
import w51.AbstractC36841g;
import w60.AbstractC36854b;
import w60.AbstractC36855c;
import w60.AbstractC36857e;
import w60.AbstractC36858f;
import w61.AbstractC36863c;
import w80.AbstractC36941b;
import w81.AbstractC36945c;
import w81.EnumC36946d;
import w90.AbstractC36952b;
import wa2.AbstractC36981a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wd3.C37169c;
import xc3.AbstractC38195a;

/* JADX INFO: renamed from: w01.e */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C36680e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f157097w;

    public /* synthetic */ C36680e(int i13) {
        this.f157097w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f157097w) {
            case 0:
                return AbstractC36682g.m117746r(obj);
            case 1:
                return AbstractC36695b.m117782s(obj);
            case 2:
                return AbstractC36695b.m117778o((InterfaceC17886g0) obj);
            case 3:
                return AbstractC36701d.m117824h((C25308q) obj);
            case 4:
                return AbstractC36701d.m117821e((C21536b) obj);
            case 5:
                return AbstractC36701d.m117822f((C23749z0) obj);
            case 6:
                return AbstractC36701d.m117823g((ConversationProgressBarModel) obj);
            case 7:
                C36735y state = (C36735y) obj;
                AbstractC22676k.m65750j(state, "state");
                C36736z c36736z = state.f157238c;
                return c36736z.f157242c ? new C36714d(c36736z.f157240a) : C36715e.f157198a;
            case 8:
                C0764g Json = (C0764g) obj;
                AbstractC22676k.m65750j(Json, "$this$Json");
                Json.f2776c = true;
                Json.f2777d = true;
                Json.f2774a = true;
                return C23454a0.f92919a;
            case 9:
                return AbstractC36841g.m118116j(obj);
            case 10:
                return AbstractC36854b.m118150i((InterfaceC34549a) obj);
            case 11:
                return AbstractC36855c.m118162e((InterfaceC34549a) obj);
            case 12:
                return AbstractC36857e.m118176l((InterfaceC34549a) obj);
            case 13:
                return AbstractC36857e.m118177m((InterfaceC16239m) obj);
            case 14:
                return AbstractC36857e.m118184t(obj);
            case 15:
                return AbstractC36857e.m118185u((C25308q) obj);
            case 16:
                return AbstractC36858f.m118200n((InterfaceC34549a) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC36858f.m118201o((InterfaceC16239m) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC36863c.m118232e((C35736a) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC36941b.m118583n(obj);
            case 20:
                return AbstractC36945c.m118621j(((Integer) obj).intValue());
            case 21:
                return AbstractC36945c.m118622k((EnumC36946d) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return Integer.valueOf(AbstractC36952b.m118654k(((Integer) obj).intValue()));
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC36952b.m118663t(obj);
            case 24:
                return AbstractC36952b.m118639A((InterfaceC17886g0) obj);
            case 25:
                return AbstractC36981a.m118721h((AbstractC31179a) obj);
            case 26:
                return AbstractC36981a.m118722i((AbstractC33673a) obj);
            case 27:
                InterfaceC21461d it = (InterfaceC21461d) obj;
                AbstractC22676k.m65750j(it, "it");
                InterfaceC37138c interfaceC37138cM113847j = AbstractC35862g.m113847j(it);
                if (interfaceC37138cM113847j != null) {
                    return interfaceC37138cM113847j;
                }
                if (PlatformKt.isInterface(it)) {
                    return new C37140e(it);
                }
                return null;
            case 28:
                InterfaceC21461d it3 = (InterfaceC21461d) obj;
                AbstractC22676k.m65750j(it3, "it");
                InterfaceC37138c interfaceC37138cM113847j2 = AbstractC35862g.m113847j(it3);
                if (interfaceC37138cM113847j2 == null) {
                    interfaceC37138cM113847j2 = PlatformKt.isInterface(it3) ? new C37140e(it3) : null;
                }
                if (interfaceC37138cM113847j2 != null) {
                    return AbstractC38195a.m122336d(interfaceC37138cM113847j2);
                }
                return null;
            default:
                C37169c it4 = (C37169c) obj;
                AbstractC22676k.m65750j(it4, "it");
                AbstractC35745c abstractC35745c = it4.f158954c;
                if (abstractC35745c instanceof C37169c) {
                    return (C37169c) abstractC35745c;
                }
                return null;
        }
    }
}
