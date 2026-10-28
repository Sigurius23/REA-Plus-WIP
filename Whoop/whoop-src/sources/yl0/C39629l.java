package yl0;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.p226ui.common.helper.DefaultDateFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l11.C23223e;
import l11.InterfaceC23222d;
import l21.C23239c;
import m83.AbstractC25267u;
import org.joda.time.DateTime;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import w71.AbstractC36882f0;
import w71.C36906y;

/* JADX INFO: renamed from: yl0.l */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u0004\u0018\u00010\u0007*\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lyl0/l;", "", "Ll21/c;", "initialViewState", "<init>", "(Ll21/c;)V", "Lyl0/g;", "", "served", "a", "(Lyl0/g;Ljava/lang/Double;)Ljava/lang/Double;", "domainState", "", "Lm91/u;", "items", "Lyl0/c;", "b", "(Lyl0/g;Ljava/util/List;)Lyl0/c;", "Lyl0/o;", "c", "(Lyl0/g;)Lyl0/o;", "Ll21/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39629l {

    /* JADX INFO: renamed from: b */
    public static final int f170499b = C23239c.f92089h;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C23239c initialViewState;

    /* JADX INFO: renamed from: yl0.l$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f170501a;

        static {
            int[] iArr = new int[EnumC39622e.values().length];
            try {
                iArr[EnumC39622e.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC39622e.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC39622e.TERMINAL_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC39622e.IDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC39622e.RETRYABLE_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f170501a = iArr;
        }
    }

    public C39629l(C23239c initialViewState) {
        AbstractC22676k.m65750j(initialViewState, "initialViewState");
        this.initialViewState = initialViewState;
    }

    /* JADX INFO: renamed from: a */
    private final Double m126662a(C39624g c39624g, Double d3) {
        Double magnitudeValue = c39624g.getMagnitudeValue();
        if (magnitudeValue != null) {
            return magnitudeValue;
        }
        if (c39624g.getInputsCleared()) {
            return null;
        }
        return d3;
    }

    /* JADX INFO: renamed from: b */
    private final C39620c m126663b(C39624g domainState, List<? extends InterfaceC25312u> items) {
        C39618a magnitudeConfig;
        Object next;
        if (domainState.getIsMagnitudeSheetVisible() && (magnitudeConfig = domainState.getMagnitudeConfig()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : items) {
                if (obj instanceof C36906y) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((C36906y) next).getType() instanceof AbstractC36882f0.b));
            C36906y c36906y = (C36906y) next;
            if (c36906y != null) {
                return new C39620c(this.initialViewState.getTitle(), c36906y.getQuestion(), domainState.getMagnitudeValue(), magnitudeConfig.getMin(), magnitudeConfig.getMax(), magnitudeConfig.getDecimalPlaces(), magnitudeConfig.getUnit());
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0138 A[PHI: r12
      0x0138: PHI (r12v6 java.lang.Long) = (r12v5 java.lang.Long), (r12v11 java.lang.Long) binds: [B:53:0x0125, B:55:0x0136] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x0278  */
    /* JADX INFO: renamed from: c */
    public final C39632o m126664c(C39624g domainState) {
        boolean z4;
        InterfaceC25312u button;
        C23223e c23223eM67193b;
        C23223e c23223eM67193b2;
        C23223e c23223eM67193b3;
        C23223e c23223eM67193b4;
        ArrayList arrayList;
        Long l7;
        TextResource textResourceM21267a;
        AbstractC22676k.m65750j(domainState, "domainState");
        int i13 = a.f170501a[domainState.getButtonState().ordinal()];
        if (i13 == 1 || i13 == 2 || i13 == 3) {
            z4 = false;
        } else {
            if (i13 != 4 && i13 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            z4 = true;
        }
        List<InterfaceC25312u> listM67283e = this.initialViewState.m67283e();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM67283e, 10));
        Iterator<T> it = listM67283e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object objM118507b = (InterfaceC25312u) it.next();
            if (objM118507b instanceof C36906y) {
                C36906y c36906y = (C36906y) objM118507b;
                AbstractC36882f0 type = c36906y.getType();
                if (type instanceof AbstractC36882f0.i) {
                    type = ((AbstractC36882f0.i) type).m118343a(domainState.getAnsweredYes());
                } else if (type instanceof AbstractC36882f0.d) {
                    AbstractC36882f0.d dVar = (AbstractC36882f0.d) type;
                    Integer presetNumber = dVar.getPresetNumber();
                    Double dM126662a = m126662a(domainState, presetNumber != null ? Double.valueOf(presetNumber.intValue()) : null);
                    type = AbstractC36882f0.d.m118323b(dVar, dM126662a != null ? Integer.valueOf((int) dM126662a.doubleValue()) : null, 0, 0, 6, null);
                } else if (type instanceof AbstractC36882f0.e) {
                    AbstractC36882f0.e eVar = (AbstractC36882f0.e) type;
                    Integer presetNumber2 = eVar.getPresetNumber();
                    Double dM126662a2 = m126662a(domainState, presetNumber2 != null ? Double.valueOf(presetNumber2.intValue()) : null);
                    Integer numValueOf = dM126662a2 != null ? Integer.valueOf((int) dM126662a2.doubleValue()) : null;
                    String str = numValueOf != null ? this.initialViewState.m67284f().get(Integer.valueOf(numValueOf.intValue())) : null;
                    if (str == null) {
                        str = "";
                    }
                    type = AbstractC36882f0.e.m118328b(eVar, numValueOf, 0, 0, 0, str, 14, null);
                } else if (type instanceof AbstractC36882f0.b) {
                    AbstractC36882f0.b bVar = (AbstractC36882f0.b) type;
                    type = AbstractC36882f0.b.m118311b(bVar, m126662a(domainState, bVar.getNumber()), null, null, 0, null, 30, null);
                } else if (type instanceof AbstractC36882f0.g) {
                    Long timeValue = domainState.getTimeValue();
                    if (timeValue == null) {
                        timeValue = Long.valueOf(((AbstractC36882f0.g) type).getCurTime());
                        l7 = domainState.getInputsCleared() ? null : timeValue;
                    }
                    AbstractC36882f0.g gVar = (AbstractC36882f0.g) type;
                    long jLongValue = l7 != null ? l7.longValue() : 0L;
                    if (l7 == null || (textResourceM21267a = AbstractC8693b.m21278l(new DateTime(l7.longValue()).toString(DefaultDateFormatter.TIME_FORMAT_12H))) == null) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    type = AbstractC36882f0.g.m118336b(gVar, textResourceM21267a, 0L, 0L, jLongValue, 6, null);
                }
                arrayList = arrayList2;
                objM118507b = C36906y.m118507b(c36906y, 0, null, null, null, false, z4, type, null, null, null, 927, null);
            } else {
                arrayList = arrayList2;
            }
            arrayList.add(objM118507b);
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = arrayList2;
        InterfaceC25312u button2 = this.initialViewState.getButton();
        C23223e c23223e = button2 instanceof C23223e ? (C23223e) button2 : null;
        if (c23223e != null) {
            int i14 = a.f170501a[domainState.getButtonState().ordinal()];
            if (i14 != 1) {
                if (i14 == 2) {
                    c23223eM67193b = C23223e.m67193b(c23223e, null, null, null, null, null, null, null, InterfaceC23222d.g.f91944a, false, null, null, null, 3967, null);
                } else if (i14 == 3) {
                    c23223eM67193b2 = C23223e.m67193b(c23223e, null, null, null, null, null, "", null, InterfaceC23222d.c.f91940a, false, null, null, null, 3935, null);
                } else if (i14 == 4) {
                    c23223eM67193b3 = C23223e.m67193b(c23223e, null, null, null, null, null, null, null, InterfaceC23222d.a.f91938a, false, null, null, null, 3967, null);
                } else {
                    if (i14 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c23223eM67193b4 = C23223e.m67193b(c23223e, null, null, null, null, null, null, null, InterfaceC23222d.f.f91943a, false, null, null, null, 3967, null);
                }
            } else if (c23223e.getShowLoading()) {
                button = c23223e;
                button = C23223e.m67193b(c23223e, null, null, null, null, null, null, null, InterfaceC23222d.d.f91941a, false, null, null, null, 3967, null);
            }
            if (button == null) {
                button = c23223eM67193b;
                button = c23223eM67193b2;
                button = c23223eM67193b3;
                button = c23223eM67193b4;
                button = this.initialViewState.getButton();
            }
        } else {
            button = c23223eM67193b;
            button = c23223eM67193b2;
            button = c23223eM67193b3;
            button = c23223eM67193b4;
            button = this.initialViewState.getButton();
        }
        button = c23223eM67193b;
        button = c23223eM67193b2;
        button = c23223eM67193b3;
        button = c23223eM67193b4;
        return new C39632o(C23239c.m67280b(this.initialViewState, null, null, arrayList3, button, false, null, null, 115, null), domainState.getFollowupMessage(), m126663b(domainState, arrayList3), domainState.getDidCommitSucceed());
    }
}
