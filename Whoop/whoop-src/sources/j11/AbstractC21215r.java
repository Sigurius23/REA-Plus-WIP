package j11;

import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import gy0.AbstractC16277f;
import h00.C16506i;
import ih1.C18522f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.joda.time.LocalDate;
import p163g1.AbstractC15002f0;
import p163g1.AbstractC15011f9;
import p291l0.InterfaceC22997s1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: j11.r */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\u001a=\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lorg/joda/time/LocalDate;", "startingDate", "", "daysToShow", "Lzr2/a;", "dateAndTimeProvider", "Lkotlin/Function1;", "Ll83/a0;", "onDateSelected", "d", "(Lorg/joda/time/LocalDate;ILzr2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(ILzr2/a;Lorg/joda/time/LocalDate;)Ljava/util/List;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21215r {
    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    /* JADX WARN: Code duplicated, block: B:38:0x0079  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    /* JADX WARN: Code duplicated, block: B:47:0x0098  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m59512d(LocalDate startingDate, int i13, InterfaceC41070a dateAndTimeProvider, Function1 onDateSelected, Composer composer, int i14, int i15) {
        int i16;
        boolean z4;
        int i17;
        C28677v1 c28677v1M87180u;
        boolean z13;
        boolean zM87157i;
        Object objM87133R;
        int i18;
        int i19;
        AbstractC22676k.m65750j(startingDate, "startingDate");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(onDateSelected, "onDateSelected");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1246817855);
        int i24 = (i14 & 6) == 0 ? (c28655q.m87157i(startingDate) ? 4 : 2) | i14 : i14;
        int i25 = i15 & 2;
        if (i25 == 0) {
            if ((i14 & 48) == 0) {
                i16 = i13;
                i24 |= c28655q.m87149e(i16) ? 32 : 16;
            }
            if ((i14 & 384) == 0) {
                if (c28655q.m87157i(dateAndTimeProvider)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i24 |= i19;
            }
            if ((i14 & 3072) == 0) {
                if (c28655q.m87157i(onDateSelected)) {
                    i18 = 2048;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i24 |= i18;
            }
            if ((i24 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i24 & 1, z4)) {
                if (i25 != 0) {
                    i17 = 20;
                } else {
                    i17 = i16;
                }
                for (LocalDate localDate : m59516h(i17, dateAndTimeProvider, startingDate)) {
                    if ((i24 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zM87157i = z13 | c28655q.m87157i(localDate);
                    objM87133R = c28655q.m87133R();
                    if (zM87157i || objM87133R == C28635l.f115821a) {
                        objM87133R = new C21214q(0, onDateSelected, localDate);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC15002f0.m43106b((InterfaceC4339a) objM87133R, null, false, null, AbstractC37817c.m121344e(-1923818302, c28655q, new C18522f(3, localDate, dateAndTimeProvider)), c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, 30);
                }
            } else {
                c28655q.m87138X();
                i17 = i16;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C16506i(startingDate, i17, dateAndTimeProvider, onDateSelected, i14, i15);
            }
        }
        i24 |= 48;
        i16 = i13;
        if ((i14 & 384) == 0) {
            if (c28655q.m87157i(dateAndTimeProvider)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i24 |= i19;
        }
        if ((i14 & 3072) == 0) {
            if (c28655q.m87157i(onDateSelected)) {
                i18 = 2048;
            } else {
                i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i24 |= i18;
        }
        if ((i24 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i24 & 1, z4)) {
            if (i25 != 0) {
                i17 = 20;
            } else {
                i17 = i16;
            }
            while (r17.hasNext()) {
                if ((i24 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87157i = z13 | c28655q.m87157i(localDate);
                objM87133R = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R = new C21214q(0, onDateSelected, localDate);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C21214q(0, onDateSelected, localDate);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC15002f0.m43106b((InterfaceC4339a) objM87133R, null, false, null, AbstractC37817c.m121344e(-1923818302, c28655q, new C18522f(3, localDate, dateAndTimeProvider)), c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, 30);
            }
        } else {
            c28655q.m87138X();
            i17 = i16;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16506i(startingDate, i17, dateAndTimeProvider, onDateSelected, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m59513e(Function1 function1, LocalDate localDate) {
        function1.invoke(localDate);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m59514f(LocalDate localDate, InterfaceC41070a interfaceC41070a, InterfaceC22997s1 DropdownMenuItem, Composer composer, int i13) {
        String strM21273g;
        AbstractC22676k.m65750j(DropdownMenuItem, "$this$DropdownMenuItem");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            if (AbstractC22676k.m65745e(localDate, interfaceC41070a.mo133365d())) {
                c28655q.m87150e0(-1953447514);
                strM21273g = AbstractC8693b.m21273g(AbstractC16277f.f62224C2, c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1953448393);
                c28655q.m87173q(false);
                strM21273g = localDate.toString("EE MMM d");
            }
            String str = strM21273g;
            AbstractC22676k.m65747g(str);
            AbstractC15011f9.m43114b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, 0, 0, 131070);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m59515g(LocalDate localDate, int i13, InterfaceC41070a interfaceC41070a, Function1 function1, int i14, int i15, Composer composer, int i16) {
        m59512d(localDate, i13, interfaceC41070a, function1, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    private static final List<LocalDate> m59516h(int i13, InterfaceC41070a interfaceC41070a, LocalDate localDate) {
        ArrayList arrayList = new ArrayList();
        int i14 = 1;
        if (1 <= i13) {
            while (true) {
                int dayOfYear = interfaceC41070a.mo133365d().getYear() == localDate.getYear() ? interfaceC41070a.mo133365d().getDayOfYear() - localDate.getDayOfYear() : interfaceC41070a.mo133365d().getDayOfYear() + localDate.getDayOfYear();
                int iCeil = (int) Math.ceil(i13 / 2.0f);
                LocalDate localDateMinusDays = iCeil > dayOfYear ? localDate.plusDays(dayOfYear + 1).minusDays(i14) : localDate.plusDays(iCeil).minusDays(i14);
                AbstractC22676k.m65747g(localDateMinusDays);
                arrayList.add(localDateMinusDays);
                if (i14 == i13) {
                    break;
                }
                i14++;
            }
        }
        return arrayList;
    }
}
