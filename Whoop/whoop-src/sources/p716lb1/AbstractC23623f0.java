package p716lb1;

import com.whoop.design.models.colortheme.ColorBackgroundModel;
import com.whoop.design.models.colortheme.ColorBackgroundType;
import com.whoop.design.models.colortheme.ColorValueModel;
import i51.AbstractC18123t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m51.InterfaceC25079a;
import m83.AbstractC25265s;
import p208i2.AbstractC17918w0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import p745y81.Function1;
import p745y81.InterfaceC39332e;

/* JADX INFO: renamed from: lb1.f0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/colortheme/ColorValueModel;", "Ly81/e;", "b", "(Lcom/whoop/design/models/colortheme/ColorValueModel;)Ly81/e;", "Lcom/whoop/design/models/colortheme/ColorBackgroundModel;", "Lm51/a;", "a", "(Lcom/whoop/design/models/colortheme/ColorBackgroundModel;)Lm51/a;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23623f0 {

    /* JADX INFO: renamed from: lb1.f0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93751a;

        static {
            int[] iArr = new int[ColorBackgroundType.values().length];
            try {
                iArr[ColorBackgroundType.SOLID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ColorBackgroundType.RADIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ColorBackgroundType.LINEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f93751a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC25079a m68736a(ColorBackgroundModel colorBackgroundModel) {
        AbstractC22676k.m65750j(colorBackgroundModel, "<this>");
        List<ColorValueModel> colors = colorBackgroundModel.getColors();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = colors.iterator();
        while (it.hasNext()) {
            InterfaceC39332e interfaceC39332eM68737b = m68737b((ColorValueModel) it.next());
            if (interfaceC39332eM68737b != null) {
                arrayList.add(interfaceC39332eM68737b);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        Float opacity = colorBackgroundModel.getOpacity();
        float fFloatValue = opacity != null ? opacity.floatValue() : 0.7f;
        int i13 = a.f93751a[colorBackgroundModel.getType().ordinal()];
        if (i13 == 1) {
            return new InterfaceC25079a.c((InterfaceC39332e) AbstractC25265s.m74096F0(arrayList), fFloatValue);
        }
        if (i13 == 2) {
            return new InterfaceC25079a.b((InterfaceC39332e) AbstractC25265s.m74096F0(arrayList), fFloatValue);
        }
        if (i13 == 3) {
            return arrayList.size() < 2 ? new InterfaceC25079a.c((InterfaceC39332e) AbstractC25265s.m74096F0(arrayList), fFloatValue) : new InterfaceC25079a.a(arrayList, fFloatValue);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC39332e m68737b(ColorValueModel colorValueModel) {
        Integer numM52042a;
        AbstractC22676k.m65750j(colorValueModel, "<this>");
        EnumC39333f token = colorValueModel.getToken();
        if (token != null) {
            return token;
        }
        String hex = colorValueModel.getHex();
        if (hex == null || (numM52042a = AbstractC18123t.m52042a(hex)) == null) {
            return null;
        }
        return Function1.m125324b(AbstractC17918w0.m51515c(numM52042a.intValue()));
    }
}
