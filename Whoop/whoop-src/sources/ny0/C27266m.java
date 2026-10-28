package ny0;

import a72.AbstractC0524a;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.realtime.presentation.C9886j;
import com.whoop.realtime.presentation.RealTimeFinishPromptActivity;
import com.whoop.realtime.presentation.StartActivityActivity;
import f72.AbstractC14227b;
import io.getstream.chat.android.p226ui.common.images.StreamImageLoaderFactory;
import java.util.List;
import l83.C23454a0;
import lm2.InterfaceC24516b;
import m52.AbstractC25091k;
import m83.C25271y;
import n23.AbstractC26202e;
import o01.AbstractC27346b;
import o01.AbstractC27348d;
import o11.AbstractC27406l;
import o11.AbstractC27407m;
import o21.AbstractC27464b;
import o51.AbstractC27535a;
import o51.AbstractC27537c;
import o52.C27585w;
import o61.C27607f;
import o71.AbstractC27633c;
import o72.AbstractC27641b;
import o72.AbstractC27645f;
import p208i2.InterfaceC17886g0;
import p209i3.InterfaceC18044z;
import p353o0.AbstractC27316a0;
import p353o0.C27331o;
import p353o0.C27341y;
import p383ov.InterfaceC28381c;
import p461rh.C31424m;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import tv.C34199b;
import xg3.C38280g;

/* JADX INFO: renamed from: ny0.m */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C27266m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f109102w;

    public /* synthetic */ C27266m(int i13) {
        this.f109102w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object it) {
        int i13 = this.f109102w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case 0:
                return C27268n.m82237k(it);
            case 1:
                return AbstractC27255g0.m82139e(it);
            case 2:
                return AbstractC27265l0.m82218j(it);
            case 3:
                List list = (List) it;
                return new C27341y(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 4:
                ((Integer) it).getClass();
                C27331o c27331o = AbstractC27316a0.f109384a;
                return C25271y.f99162w;
            case 5:
                ((Integer) it).getClass();
                C27331o c27331o2 = AbstractC27316a0.f109384a;
                return -1;
            case 6:
                return AbstractC27346b.m82501i((InterfaceC17886g0) it);
            case 7:
                return AbstractC27348d.m82520d((InterfaceC17886g0) it);
            case 8:
                return AbstractC27406l.m82670q(it);
            case 9:
                return AbstractC27407m.m82683x((InterfaceC18044z) it);
            case 10:
                return AbstractC27407m.c.a.m82737x((InterfaceC18044z) it);
            case 11:
                return AbstractC27407m.c.C42106c.m82750x((InterfaceC18044z) it);
            case 12:
                StreamImageLoaderFactory._init_$lambda$1((C31424m) it);
                return c23454a0;
            case 13:
                StreamImageLoaderFactory._init_$lambda$0((C31424m) it);
                return c23454a0;
            case 14:
                return AbstractC27464b.m82878e(it);
            case 15:
                AbstractC22676k.m65750j(it, "it");
                return c23454a0;
            case 16:
                AbstractC22676k.m65750j((AbstractC26202e) it, "it");
                return c23454a0;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC27537c.m83065k((AbstractC27535a) it);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return RealTimeFinishPromptActivity.m23736f0((C38280g) it);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C27585w.m83321g0((InterfaceC28381c) it);
            case 20:
                return C9886j.m24055a0((AbstractC25091k) it);
            case 21:
                return C9886j.m24053Y((InterfaceC24516b) it);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C9886j.m24052X(((Boolean) it).booleanValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return StartActivityActivity.m23861B1((InterfaceC28381c) it);
            case 24:
                return StartActivityActivity.m23901P0((C34199b) it);
            case 25:
                return C27607f.m83359j((C39336i) it);
            case 26:
                return AbstractC27633c.m83421k(it);
            case 27:
                return AbstractC27641b.m83462f((AbstractC14227b) it);
            case 28:
                return AbstractC27645f.m83485q((AbstractC14227b) it);
            default:
                return AbstractC27645f.m83486r((AbstractC0524a) it);
        }
    }
}
