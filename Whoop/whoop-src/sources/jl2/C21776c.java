package jl2;

import al2.AbstractC0988d;
import c41.C4092p2;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.training.data.network.response.hrsettings.HeartRateEntryRow;
import com.whoop.training.data.network.response.hrsettings.HrSettingsResponse;
import com.whoop.training.data.network.response.hrsettings.ManualHeartRateZonesForm;
import com.whoop.training.data.network.response.hrsettings.ZoneRow;
import ge3.AbstractC15751g;
import gy0.AbstractC16277f;
import gz0.EnumC16313m0;
import hl2.C17409d;
import hl2.InterfaceC17406a;
import hl2.InterfaceC17407b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import m83.AbstractC25267u;
import m83.C25271y;
import ml2.InterfaceC25676a;
import nl2.C26814a;
import nl2.C26815b;
import nl2.C26816c;
import nl2.C26817d;
import nl2.C26818e;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p736sz0.C33211q0;
import p736sz0.C33221t1;
import p736sz0.EnumC33227v1;
import p745y81.EnumC39333f;
import t83.InterfaceC33616a;
import x21.C37858a;

/* JADX INFO: renamed from: jl2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u00014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JE\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b%\u0010$J\u0013\u0010'\u001a\u00020\b*\u00020&H\u0002¢\u0006\u0004\b'\u0010(J+\u0010-\u001a\u00020\n*\u00020)2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u001f\u00104\u001a\u0002032\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u0002072\u0006\u00106\u001a\u00020+H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020:2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b;\u0010<J%\u0010A\u001a\u00020@2\u0006\u0010>\u001a\u00020=2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\bA\u0010BJ\u0015\u0010E\u001a\u00020\u00112\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bE\u0010FR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010G\u001a\u0004\bH\u0010I¨\u0006J"}, m65681d2 = {"Ljl2/c;", "", "Ljl2/e;", "hrZoneInfoValidator", "<init>", "(Ljl2/e;)V", "Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;", "response", "Lnl2/c$c;", "dialogState", "Lnl2/c$a;", "bottomSheetState", "", "Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;", "editedZonesValues", "", "buttonEnabled", "Lnl2/c;", "l", "(Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;Lnl2/c$c;Lnl2/c$a;Ljava/util/List;Ljava/lang/Boolean;)Lnl2/c;", "Lhl2/b$c;", "modalType", "n", "(Lhl2/b$c;)Lnl2/c;", "Lsz0/q0;", "d", "(Lhl2/b$c;)Lsz0/q0;", "Lml2/a$b;", "e", "(Lhl2/b$c;)Lml2/a$b;", "Lml2/a;", "f", "(Lhl2/b$c;)Lml2/a;", "enabled", "Lnl2/c$b;", "b", "(Ljava/lang/Boolean;)Lnl2/c$b;", "c", "Lhl2/b$k;", "k", "(Lhl2/b$k;)Lnl2/c$c;", "Lhl2/a;", "defaultHrZones", "Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;", "heartRateEntryRow", "j", "(Lhl2/a;Ljava/util/List;Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;)Lnl2/c$a;", "Lsz0/v1;", "zoneValueType", "", "id", "Lcom/whoop/design/util/TextResource;", "a", "(Lsz0/v1;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;", "entryRow", "Lnl2/c$e;", "g", "(Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;)Lnl2/c$e;", "Lnl2/c$g;", "i", "(Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;)Lnl2/c$g;", "Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;", "zonesForm", "zoneRows", "Lsz0/t1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;Ljava/util/List;)Lsz0/t1;", "Lhl2/d;", "domainState", "m", "(Lhl2/d;)Lnl2/c;", "Ljl2/e;", "getHrZoneInfoValidator", "()Ljl2/e;", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21776c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21778e hrZoneInfoValidator;

    /* JADX INFO: renamed from: jl2.c$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m65681d2 = {"Ljl2/c$a;", "", "", "id", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Companion", "a", "RESTING", "MAXIMUM", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum a {
        RESTING("RESTING_HR"),
        MAXIMUM("MAX_HR");

        public static final int MAX_HR_INDEX = 1;
        private final String id;
        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: jl2.c$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Ljl2/c$a$a;", "", "<init>", "()V", "", "id", "Ljl2/c$a;", "a", "(Ljava/lang/String;)Ljl2/c$a;", "", "MAX_HR_INDEX", "I", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0020  */
            /* JADX WARN: Code duplicated, block: B:12:0x0023 A[RETURN] */
            /* JADX INFO: renamed from: a */
            public final a m61597a(String id4) {
                AbstractC22676k.m65750j(id4, "id");
                for (a aVar : a.values()) {
                    if (AbstractC22676k.m65745e(aVar.getId(), id4)) {
                        if (aVar == null) {
                            return a.RESTING;
                        }
                        return aVar;
                    }
                }
                aVar = null;
                if (aVar == null) {
                    return a.RESTING;
                }
                return aVar;
            }

            private Companion() {
            }
        }

        a(String str) {
            this.id = str;
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }

        public final String getId() {
            return this.id;
        }
    }

    /* JADX INFO: renamed from: jl2.c$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f83892a;

        static {
            int[] iArr = new int[EnumC33227v1.values().length];
            try {
                iArr[EnumC33227v1.MANUAL_ZONE_MIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC33227v1.MANUAL_ZONE_MAX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f83892a = iArr;
        }
    }

    public C21776c(C21778e hrZoneInfoValidator) {
        AbstractC22676k.m65750j(hrZoneInfoValidator, "hrZoneInfoValidator");
        this.hrZoneInfoValidator = hrZoneInfoValidator;
    }

    /* JADX INFO: renamed from: a */
    private final TextResource m61583a(EnumC33227v1 zoneValueType, String id4) {
        int i13 = b.f83892a[zoneValueType.ordinal()];
        EnumC21774a enumC21774a = null;
        int i14 = 0;
        if (i13 == 1) {
            EnumC21774a enumC21774a2 = EnumC21774a.ZONE_1;
            EnumC21774a[] enumC21774aArrValues = EnumC21774a.values();
            int length = enumC21774aArrValues.length;
            while (i14 < length) {
                EnumC21774a enumC21774a3 = enumC21774aArrValues[i14];
                if (AbstractC22676k.m65745e(enumC21774a3.name(), id4)) {
                    enumC21774a = enumC21774a3;
                    break;
                }
                i14++;
            }
            if (enumC21774a != null) {
                enumC21774a2 = enumC21774a;
            }
            return enumC21774a2.toMinTitle();
        }
        if (i13 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        EnumC21774a enumC21774a4 = EnumC21774a.ZONE_1;
        EnumC21774a[] enumC21774aArrValues2 = EnumC21774a.values();
        int length2 = enumC21774aArrValues2.length;
        while (i14 < length2) {
            EnumC21774a enumC21774a5 = enumC21774aArrValues2[i14];
            if (AbstractC22676k.m65745e(enumC21774a5.name(), id4)) {
                enumC21774a = enumC21774a5;
                break;
            }
            i14++;
        }
        if (enumC21774a != null) {
            enumC21774a4 = enumC21774a;
        }
        return enumC21774a4.toMaxTitle();
    }

    /* JADX INFO: renamed from: b */
    private final C26816c.b m61584b(Boolean enabled) {
        return new C26816c.b(AbstractC8693b.m21277k(AbstractC0988d.f3671Z), enabled != null ? enabled.booleanValue() : false, InterfaceC25676a.b.h.f100993a);
    }

    /* JADX INFO: renamed from: c */
    private final C26816c.b m61585c(Boolean enabled) {
        return new C26816c.b(AbstractC8693b.m21277k(AbstractC0988d.f3674b), enabled != null ? enabled.booleanValue() : false, InterfaceC25676a.b.m.f101000a);
    }

    /* JADX INFO: renamed from: d */
    private final C33211q0 m61586d(InterfaceC17407b.c modalType) {
        if (AbstractC22676k.m65745e(modalType, InterfaceC17407b.g.f67390a)) {
            return C26815b.f106900a.m79999a();
        }
        if (AbstractC22676k.m65745e(modalType, InterfaceC17407b.d.f67387a)) {
            return C26815b.f106900a.m80000b();
        }
        if (modalType instanceof InterfaceC17407b.i) {
            return C26817d.f106962a.m80049a();
        }
        if (modalType instanceof InterfaceC17407b.j) {
            return C26818e.f106967a.m80052a();
        }
        if (AbstractC22676k.m65745e(modalType, InterfaceC17407b.e.f67388a)) {
            return C26815b.f106900a.m80002d();
        }
        if (AbstractC22676k.m65745e(modalType, InterfaceC17407b.p.f67398a)) {
            return C26815b.f106900a.m80001c();
        }
        if (AbstractC22676k.m65745e(modalType, InterfaceC17407b.q.f67399a)) {
            return C26815b.f106900a.m80003e();
        }
        if (modalType instanceof InterfaceC17407b.r) {
            return C26817d.f106962a.m80051c();
        }
        if (modalType instanceof InterfaceC17407b.s) {
            return C26818e.f106967a.m80054c();
        }
        if (modalType instanceof InterfaceC17407b.n) {
            return C26817d.f106962a.m80050b();
        }
        if (modalType instanceof InterfaceC17407b.o) {
            return C26818e.f106967a.m80053b();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: e */
    private final InterfaceC25676a.b m61587e(InterfaceC17407b.c modalType) {
        if (AbstractC22676k.m65745e(modalType, InterfaceC17407b.d.f67387a) || AbstractC22676k.m65745e(modalType, InterfaceC17407b.e.f67388a) || AbstractC22676k.m65745e(modalType, InterfaceC17407b.n.f67396a) || AbstractC22676k.m65745e(modalType, InterfaceC17407b.o.f67397a) || AbstractC22676k.m65745e(modalType, InterfaceC17407b.r.f67400a) || AbstractC22676k.m65745e(modalType, InterfaceC17407b.s.f67401a)) {
            return InterfaceC25676a.b.f.f100988a;
        }
        if (modalType instanceof InterfaceC17407b.i) {
            return new InterfaceC25676a.b.i(((InterfaceC17407b.i) modalType).getMaxHr());
        }
        if (modalType instanceof InterfaceC17407b.j) {
            return new InterfaceC25676a.b.i(((InterfaceC17407b.j) modalType).getMaxHr());
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    private final InterfaceC25676a m61588f(InterfaceC17407b.c modalType) {
        if (AbstractC22676k.m65745e(modalType, InterfaceC17407b.n.f67396a) || AbstractC22676k.m65745e(modalType, InterfaceC17407b.o.f67397a) || AbstractC22676k.m65745e(modalType, InterfaceC17407b.r.f67400a) || AbstractC22676k.m65745e(modalType, InterfaceC17407b.s.f67401a) || (modalType instanceof InterfaceC17407b.i) || (modalType instanceof InterfaceC17407b.j)) {
            return InterfaceC25676a.b.C42011b.f100982a;
        }
        if (AbstractC22676k.m65745e(modalType, InterfaceC17407b.d.f67387a) || AbstractC22676k.m65745e(modalType, InterfaceC17407b.e.f67388a)) {
            return InterfaceC25676a.a.C42010a.f100980a;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    private final C26816c.e m61589g(HeartRateEntryRow entryRow) {
        return new C26816c.e(a.INSTANCE.m61597a(entryRow.getId()), AbstractC8693b.m21278l(entryRow.getLabel()), entryRow.getValue(), entryRow.getUnits(), entryRow.getEditable(), entryRow.getEditable() ? EnumC39333f.BRAND_WHITE : EnumC39333f.WHITE_30, entryRow.getMinValue(), entryRow.getMaxValue());
    }

    /* JADX INFO: renamed from: h */
    private final C33221t1 m61590h(ManualHeartRateZonesForm zonesForm, List<ZoneRow> zoneRows) {
        return new C33221t1(AbstractC8693b.m21278l(zonesForm.getZoneColumnTitle()), AbstractC8693b.m21278l(zonesForm.getZoneMinColumnTitle()), AbstractC8693b.m21278l(zonesForm.getZoneMaxColumnTitle()), AbstractC21777d.m61598a(zoneRows, zonesForm.getUnits(), zonesForm.getToggleValue()));
    }

    /* JADX INFO: renamed from: i */
    private final C26816c.g m61591i(HrSettingsResponse response) {
        return new C26816c.g(response.getManualHeartRateZonesForm().getToggleValue(), AbstractC8693b.m21278l(response.getManualHeartRateZonesForm().getTitle()), AbstractC8693b.m21278l(response.getManualHeartRateZonesForm().getSubtitle()));
    }

    /* JADX INFO: renamed from: j */
    private final C26816c.a m61592j(InterfaceC17406a interfaceC17406a, List<ZoneRow> list, HeartRateEntryRow heartRateEntryRow) {
        EnumC21774a enumC21774a;
        if (interfaceC17406a instanceof InterfaceC17406a.a) {
            InterfaceC17406a.a aVar = (InterfaceC17406a.a) interfaceC17406a;
            return new C26816c.a.C42064a(AbstractC8693b.m21277k(AbstractC0988d.f3675b0), new C37858a(null, aVar.getValue(), aVar.getMinValue(), aVar.getMaxValue(), false, null, 32, null), new C26816c.b(AbstractC8693b.m21277k(AbstractC16277f.f62216A2), true, null, 4, null), C21778e.m61606i(this.hrZoneInfoValidator, interfaceC17406a, null, null, 0, 14, null));
        }
        if (!(interfaceC17406a instanceof InterfaceC17406a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC17406a.b bVar = (InterfaceC17406a.b) interfaceC17406a;
        String id4 = bVar.getId();
        EnumC21774a enumC21774a2 = EnumC21774a.ZONE_1;
        EnumC21774a[] enumC21774aArrValues = EnumC21774a.values();
        int length = enumC21774aArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC21774a = null;
                break;
            }
            enumC21774a = enumC21774aArrValues[i13];
            if (AbstractC22676k.m65745e(enumC21774a.name(), id4)) {
                break;
            }
            i13++;
        }
        EnumC21774a enumC21774a3 = enumC21774a == null ? enumC21774a2 : enumC21774a;
        TextResource textResourceM61583a = m61583a(bVar.getType(), bVar.getId());
        C4092p2 c4092p2M61607h = this.hrZoneInfoValidator.m61607h(interfaceC17406a, list, enumC21774a3, heartRateEntryRow.getValue());
        return new C26816c.a.b(enumC21774a3, bVar.getType(), Boolean.valueOf((c4092p2M61607h != null ? c4092p2M61607h.getIcon() : null) == EnumC16313m0.TINY_ATTENTION_ORANGE), textResourceM61583a, new C37858a(null, bVar.getValue(), bVar.getMinValue(), bVar.getMaxValue(), false, null, 32, null), new C26816c.b(AbstractC8693b.m21277k(AbstractC0988d.f3663R), true, null, 4, null), c4092p2M61607h);
    }

    /* JADX INFO: renamed from: k */
    private final C26816c.c m61593k(InterfaceC17407b.k kVar) {
        if (AbstractC22676k.m65745e(kVar, InterfaceC17407b.m.f67395a)) {
            return C26814a.f106892a.m79998f();
        }
        if (AbstractC22676k.m65745e(kVar, InterfaceC17407b.h.f67391a)) {
            return C26814a.f106892a.m79996d();
        }
        if (AbstractC22676k.m65745e(kVar, InterfaceC17407b.l.f67394a)) {
            return C26814a.f106892a.m79997e();
        }
        if (AbstractC22676k.m65745e(kVar, InterfaceC17407b.a.f67385a)) {
            return C26814a.f106892a.m79993a();
        }
        if (AbstractC22676k.m65745e(kVar, InterfaceC17407b.f.f67389a)) {
            return C26814a.f106892a.m79995c();
        }
        if (kVar instanceof InterfaceC17407b.b) {
            return C26816c.c.m80017b(C26814a.f106892a.m79994b(), null, null, null, null, null, new InterfaceC25676a.b.d(((InterfaceC17407b.b) kVar).getValue()), false, null, 223, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: l */
    private final C26816c m61594l(HrSettingsResponse response, C26816c.c dialogState, C26816c.a bottomSheetState, List<ZoneRow> editedZonesValues, Boolean buttonEnabled) {
        TextResource textResourceM21278l = AbstractC8693b.m21278l(response.getScreenTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(response.getIntroduction().getTitle());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(response.getIntroduction().getBody());
        List<HeartRateEntryRow> heartRateEntryRow = response.getHeartRateEntryRow();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(heartRateEntryRow, 10));
        Iterator<T> it = heartRateEntryRow.iterator();
        while (it.hasNext()) {
            arrayList.add(m61589g((HeartRateEntryRow) it.next()));
        }
        return new C26816c(null, dialogState, new C26816c.f(textResourceM21278l, textResourceM21278l2, textResourceM21278l3, arrayList, m61591i(response), AbstractC21777d.m61598a(response.getDefaultHrZones(), response.getManualHeartRateZonesForm().getUnits(), response.getManualHeartRateZonesForm().getToggleValue()), m61590h(response.getManualHeartRateZonesForm(), editedZonesValues == null ? C25271y.f99162w : editedZonesValues), m61584b(buttonEnabled), m61585c(buttonEnabled)), bottomSheetState, 1, null);
    }

    /* JADX INFO: renamed from: n */
    private final C26816c m61595n(InterfaceC17407b.c modalType) {
        return new C26816c(new C26816c.d(m61586d(modalType), m61587e(modalType), m61588f(modalType)), null, null, null, 14, null);
    }

    /* JADX INFO: renamed from: m */
    public final C26816c m61596m(C17409d domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        if (domainState.getCurrentDialogType() instanceof InterfaceC17407b.c) {
            return m61595n((InterfaceC17407b.c) domainState.getCurrentDialogType());
        }
        HrSettingsResponse successResponse = domainState.getSuccessResponse();
        InterfaceC17407b currentDialogType = domainState.getCurrentDialogType();
        C26816c.a aVarM61592j = null;
        InterfaceC17407b.k kVar = currentDialogType instanceof InterfaceC17407b.k ? (InterfaceC17407b.k) currentDialogType : null;
        C26816c.c cVarM61593k = kVar != null ? m61593k(kVar) : null;
        InterfaceC17406a currentBottomSheet = domainState.getCurrentBottomSheet();
        if (currentBottomSheet != null) {
            List<ZoneRow> defaultHrZones = domainState.getSuccessResponse().getDefaultHrZones();
            for (HeartRateEntryRow heartRateEntryRow : domainState.getSuccessResponse().getHeartRateEntryRow()) {
                if (AbstractC22676k.m65745e(heartRateEntryRow.getId(), a.RESTING.getId())) {
                    aVarM61592j = m61592j(currentBottomSheet, defaultHrZones, heartRateEntryRow);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        return m61594l(successResponse, cVarM61593k, aVarM61592j, domainState.m49387e(), domainState.getSaveEnabled());
    }
}
