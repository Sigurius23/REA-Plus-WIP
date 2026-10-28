package kf2;

import com.whoop.design.util.TextResource;
import gz0.AbstractC16319p0;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jf2.C21643a;
import jf2.C21645c;
import m83.AbstractC25267u;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import qe2.AbstractC30314g;
import x81.C38072d;
import xe2.EnumC38232a;
import y71.C39274g;
import ze2.C40590b;
import ze2.C40593e;
import ze2.InterfaceC40592d;
import ze2.InterfaceC40595g;

/* JADX INFO: renamed from: kf2.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/¨\u00060"}, m65681d2 = {"Lkf2/e;", "", "<init>", "()V", "Lze2/d;", "scheduleList", "Lkf2/d;", "f", "(Lze2/d;)Lkf2/d;", "Lze2/e;", "sleepScheduleDomain", "j", "(Lze2/e;)Lkf2/d;", "Lkf2/b;", "l", "(Lze2/e;)Lkf2/b;", "Lxe2/a;", "alarmMode", "Ly81/f;", "a", "(Lxe2/a;)Ly81/f;", "b", "", "scheduleId", "Lkf2/d$a;", "d", "(Ljava/lang/String;)Lkf2/d$a;", "Lkf2/d$c;", "e", "()Lkf2/d$c;", "Lkf2/d$b;", "c", "()Lkf2/d$b;", "", "isScheduleEnabled", "Lkf2/d$f;", "g", "(Z)Lkf2/d$f;", "Lkf2/d$h;", "i", "(Z)Lkf2/d$h;", "Lkf2/d$g;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Z)Lkf2/d$g;", "Lze2/g;", "result", "k", "(Lze2/g;)Lkf2/d;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22446e {

    /* JADX INFO: renamed from: kf2.e$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f87874a;

        static {
            int[] iArr = new int[EnumC38232a.values().length];
            try {
                iArr[EnumC38232a.EXACT_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC38232a.SLEEP_GOAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC38232a.IN_THE_GREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC38232a.NO_ALARM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f87874a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    private final EnumC39333f m64791a(EnumC38232a alarmMode) {
        int i13 = a.f87874a[alarmMode.ordinal()];
        if (i13 == 1) {
            return EnumC39333f.WHITE_10;
        }
        if (i13 == 2) {
            return EnumC39333f.ACCENT_POSITIVE_TREND_15;
        }
        if (i13 == 3) {
            return EnumC39333f.RECOVERY_HIGH_RECOVERY_10;
        }
        if (i13 == 4) {
            return EnumC39333f.WHITE_10;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    private final EnumC39333f m64792b(EnumC38232a alarmMode) {
        int i13 = a.f87874a[alarmMode.ordinal()];
        if (i13 == 1) {
            return EnumC39333f.BRAND_WHITE;
        }
        if (i13 == 2) {
            return EnumC39333f.ACCENT_POSITIVE_TREND;
        }
        if (i13 == 3) {
            return EnumC39333f.RECOVERY_HIGH_RECOVERY;
        }
        if (i13 == 4) {
            return EnumC39333f.WHITE_30;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    private final AbstractC22445d.b m64793c() {
        return new AbstractC22445d.b(new C21645c(new TextResource.C8688b(AbstractC30314g.f124297b0, null, 2, null), new TextResource.C8688b(AbstractC30314g.f124330m0, null, 2, null)));
    }

    /* JADX INFO: renamed from: d */
    private final AbstractC22445d.a m64794d(String scheduleId) {
        return new AbstractC22445d.a(new C21643a(new TextResource.C8688b(AbstractC30314g.f124300c0, null, 2, null), new TextResource.C8688b(AbstractC30314g.f124303d0, null, 2, null), new TextResource.C8688b(AbstractC30314g.f124264L0, null, 2, null), new TextResource.C8688b(AbstractC30314g.f124245E0, null, 2, null)), scheduleId);
    }

    /* JADX INFO: renamed from: e */
    private final AbstractC22445d.c m64795e() {
        return new AbstractC22445d.c(new C21645c(new TextResource.C8688b(AbstractC30314g.f124337o1, null, 2, null), new TextResource.C8688b(AbstractC30314g.f124248F0, null, 2, null)));
    }

    /* JADX INFO: renamed from: f */
    private final AbstractC22445d m64796f(InterfaceC40592d scheduleList) {
        if (scheduleList instanceof InterfaceC40592d.d) {
            return m64800j(((InterfaceC40592d.d) scheduleList).getSleepScheduleDomain());
        }
        if (scheduleList instanceof InterfaceC40592d.c) {
            return m64795e();
        }
        if (scheduleList instanceof InterfaceC40592d.b) {
            return m64794d(((InterfaceC40592d.b) scheduleList).getScheduleId());
        }
        if (scheduleList instanceof InterfaceC40592d.a) {
            return m64793c();
        }
        if (scheduleList instanceof InterfaceC40592d.e) {
            return m64798h(((InterfaceC40592d.e) scheduleList).getIsScheduleEnabled());
        }
        if (scheduleList instanceof InterfaceC40592d.f) {
            return m64797g(((InterfaceC40592d.f) scheduleList).getIsScheduleEnabled());
        }
        return scheduleList instanceof InterfaceC40592d.g ? m64799i(((InterfaceC40592d.g) scheduleList).getIsScheduleEnabled()) : AbstractC22445d.d.f87865a;
    }

    /* JADX INFO: renamed from: g */
    private final AbstractC22445d.f m64797g(boolean isScheduleEnabled) {
        return new AbstractC22445d.f(new C21643a(new TextResource.C8688b(AbstractC30314g.f124309f0, null, 2, null), isScheduleEnabled ? new TextResource.C8688b(AbstractC30314g.f124249F1, null, 2, null) : new TextResource.C8688b(AbstractC30314g.f124240C1, null, 2, null), new TextResource.C8688b(AbstractC30314g.f124264L0, null, 2, null), new TextResource.C8688b(AbstractC30314g.f124245E0, null, 2, null)), isScheduleEnabled);
    }

    /* JADX INFO: renamed from: h */
    private final AbstractC22445d.g m64798h(boolean isScheduleEnabled) {
        return new AbstractC22445d.g(new C21645c(isScheduleEnabled ? new TextResource.C8688b(AbstractC30314g.f124246E1, null, 2, null) : new TextResource.C8688b(AbstractC30314g.f124237B1, null, 2, null), new TextResource.C8688b(AbstractC30314g.f124330m0, null, 2, null)));
    }

    /* JADX INFO: renamed from: i */
    private final AbstractC22445d.h m64799i(boolean isScheduleEnabled) {
        return new AbstractC22445d.h(new C21645c(new TextResource.C8688b(AbstractC30314g.f124337o1, null, 2, null), isScheduleEnabled ? new TextResource.C8688b(AbstractC30314g.f124262K0, null, 2, null) : new TextResource.C8688b(AbstractC30314g.f124260J0, null, 2, null)));
    }

    /* JADX INFO: renamed from: j */
    private final AbstractC22445d m64800j(C40593e sleepScheduleDomain) {
        return new AbstractC22445d.e(m64801l(sleepScheduleDomain));
    }

    /* JADX INFO: renamed from: l */
    private final C22443b m64801l(C40593e c40593e) {
        boolean z4 = !c40593e.m131644b().isEmpty();
        List<C40590b> listM131644b = c40593e.m131644b();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM131644b, 10));
        for (C40590b c40590b : listM131644b) {
            EnumC39333f enumC39333fM64791a = m64791a(c40590b.getAlarmMode());
            EnumC39333f enumC39333fM64792b = m64792b(c40590b.getAlarmMode());
            TextResource.C8691e c8691e = new TextResource.C8691e(c40590b.getAlarmModeLabelDisplay());
            C39274g c39274g = c40590b.getAlarmOn() ? new C39274g(AbstractC16319p0.m46430a().getStrap().getStrapVibration(), null, 2, null) : new C39274g(AbstractC16319p0.m46430a().getStrap().getStrap(), null, 2, null);
            List<String> listM131632d = c40590b.m131632d();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM131632d, 10));
            Iterator<T> it = listM131632d.iterator();
            while (it.hasNext()) {
                arrayList2.add(new TextResource.C8691e((String) it.next()));
            }
            arrayList.add(new C22442a(enumC39333fM64791a, enumC39333fM64792b, c8691e, c39274g, arrayList2, new TextResource.C8691e(c40590b.getEditLabelDisplay()), new TextResource.C8691e(c40590b.getDeleteLabelDisplay()), new TextResource.C8691e(c40590b.getLatestWakeTime()), c40590b.getScheduleId()));
        }
        return new C22443b(z4, arrayList, c40593e.getScheduleButtonComponent().getShouldShowAddScheduleButton(), c40593e.getAlarmScheduleFooter().getShouldShowCalloutText(), new TextResource.C8691e(c40593e.getAlarmScheduleFooter().getCalloutTextHeaderDisplay()), c40593e.getAlarmScheduleFooter().getScheduleComplete() ? EnumC39333f.ACCENT_ACTION : EnumC39333f.ACCENT_NEGATIVE_TREND, c40593e.getAlarmScheduleFooter().getScheduleComplete() ? new C39274g(AbstractC2875y.m8290c(C38072d.f163053a), null, 2, null) : new C39274g(AbstractC18489d0.m53362c(C38072d.f163053a), null, 2, null), c40593e.getAlarmScheduleFooter().getShouldShowDescriptionText(), new TextResource.C8691e(c40593e.getAlarmScheduleFooter().getDescriptionTextDisplay()), c40593e.getIsScheduleEnabled(), c40593e.getShouldShowOverlay(), new TextResource.C8691e(c40593e.getScheduleDisabledText()));
    }

    /* JADX INFO: renamed from: k */
    public final AbstractC22445d m64802k(InterfaceC40595g result) {
        AbstractC22676k.m65750j(result, "result");
        if (!(result instanceof InterfaceC40595g.a) && !(result instanceof InterfaceC40595g.b)) {
            if (result instanceof InterfaceC40595g.c) {
                return m64796f(((InterfaceC40595g.c) result).getScheduleList());
            }
            throw new NoWhenBranchMatchedException();
        }
        return AbstractC22445d.d.f87865a;
    }
}
