package uk2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.hrZones.network.ZoneID;
import com.whoop.navigation.AddActivityModel;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.p069ui.AbstractC10538f;
import e93.AbstractC12889b;
import gy0.AbstractC16277f;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import j81.C21425i;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kk2.AbstractC22551d;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import mk2.AbstractC25644k;
import mk2.C25637d;
import mk2.C25638e;
import mk2.C25639f;
import mk2.C25642i;
import mk2.C25645l;
import mk2.C25650q;
import mk2.C25653t;
import mk2.EnumC25643j;
import mk2.EnumC25655v;
import mk2.InterfaceC25648o;
import n83.C26460c;
import ok2.AbstractC28005k;
import ok2.C28000f;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.C25292c0;
import p736sz0.AbstractC33208p0;
import p736sz0.C33205o0;
import p736sz0.C33211q0;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import pk2.C29337b;
import tk2.AbstractC33898p;
import tk2.C33883a;
import tk2.C33886d;
import tk2.C33887e;
import tk2.C33890h;
import tk2.C33891i;
import tk2.C33893k;
import tk2.C33895m;
import tk2.C33896n;
import tk2.C33900r;
import tk2.C33901s;
import tk2.InterfaceC33892j;
import tk2.InterfaceC33899q;
import w41.AbstractC36826z;
import w41.C36823w;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39414r;
import yg2.AbstractC39529d;
import zk2.C40845f;
import zk2.C40846g;
import zk2.C40851l;

/* JADX INFO: renamed from: uk2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\"J#\u0010&\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b&\u0010'J#\u0010)\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020(0#2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010'J#\u0010+\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020*0#2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010'J\u0017\u0010,\u001a\u00020(2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020(2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b.\u0010-J\u0017\u0010/\u001a\u00020(2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b/\u0010-J\u0019\u00103\u001a\u0004\u0018\u0001022\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b3\u00104J\u001d\u00105\u001a\u0004\u0018\u00010**\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u0002072\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b8\u00109J\u0019\u0010:\u001a\u0004\u0018\u0001022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020(2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b<\u0010-J\u000f\u0010=\u001a\u00020(H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010B\u001a\u00020A2\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\bB\u0010CJ/\u0010J\u001a\u00020I2\b\u0010E\u001a\u0004\u0018\u00010D2\u0014\b\u0002\u0010H\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020G0#H\u0002¢\u0006\u0004\bJ\u0010KJ\u0013\u0010M\u001a\u00020L*\u00020\u001dH\u0002¢\u0006\u0004\bM\u0010NJ\u0015\u0010O\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\bO\u0010PR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010Q¨\u0006R"}, m65681d2 = {"Luk2/c;", "", "Lpk2/b;", "hrZonesReducer", "<init>", "(Lpk2/b;)V", "Lmk2/q;", "domainState", "Ltk2/m$b;", "r", "(Lmk2/q;)Ltk2/m$b;", "Ltk2/i;", "d", "(Lmk2/q;)Ltk2/i;", "Lmk2/o$d;", "conflict", "Ltk2/m;", "q", "(Lmk2/o$d;)Ltk2/m;", "Lcom/whoop/navigation/e;", "a", "(Lmk2/o$d;)Lcom/whoop/navigation/e;", "f", "()Ltk2/i;", "", "isLoading", "e", "(Z)Ltk2/i;", "", "Lmk2/v;", "x", "(Lmk2/q;)Ljava/util/List;", "Lzk2/f;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lmk2/q;)Lzk2/f;", "", "", "Lzk2/l;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lmk2/q;)Ljava/util/Map;", "Ltk2/a;", "v", "Ltk2/q;", "u", "n", "(Lmk2/q;)Ltk2/a;", "m", "o", "Lmk2/j;", "contentType", "Ly81/f;", "b", "(Lmk2/j;)Ly81/f;", "t", "(Lmk2/v;Lmk2/q;)Ltk2/q;", "Ltk2/q$b;", "l", "(Lmk2/q;)Ltk2/q$b;", "i", "(Lmk2/q;)Ly81/f;", "p", "k", "()Ltk2/a;", "Lmk2/i;", "strainState", "Lj81/i;", "s", "(Lmk2/i;)Lj81/i;", "Lyg2/d;", "heartRate", "Lcom/whoop/hrZones/network/ZoneID;", "Ljava/time/Duration;", "hrZoneDurations", "Lok2/f;", "c", "(Lyg2/d;Ljava/util/Map;)Lok2/f;", "", "g", "(Lmk2/v;)I", "j", "(Lmk2/q;)Ltk2/m;", "Lpk2/b;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35053c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C29337b hrZonesReducer;

    /* JADX INFO: renamed from: uk2.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f148544a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f148545b;

        static {
            int[] iArr = new int[EnumC25655v.values().length];
            try {
                iArr[EnumC25655v.STRAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC25655v.HEART_RATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC25655v.MAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f148544a = iArr;
            int[] iArr2 = new int[EnumC25643j.values().length];
            try {
                iArr2[EnumC25643j.SLEEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC25643j.NAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC25643j.RECOVERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC25643j.WORKOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f148545b = iArr2;
        }
    }

    /* JADX INFO: renamed from: uk2.c$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f148546w = new b();

        /* JADX INFO: renamed from: a */
        public final long m110826a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrain();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m110826a((C39336i) obj));
        }
    }

    public C35053c(C29337b hrZonesReducer) {
        AbstractC22676k.m65750j(hrZonesReducer, "hrZonesReducer");
        this.hrZonesReducer = hrZonesReducer;
    }

    /* JADX INFO: renamed from: a */
    private final C9598e m110802a(InterfaceC25648o.d conflict) {
        return new C9598e(AppScreen.C9461z.f28074w, new AddActivityModel(AbstractC35054d.m110828b(conflict.getStartTime()), AbstractC35054d.m110828b(conflict.getEndTime()), conflict.getActivityInternalName()), null, 4, null);
    }

    /* JADX INFO: renamed from: b */
    private final EnumC39333f m110803b(EnumC25643j contentType) {
        int i13 = a.f148545b[contentType.ordinal()];
        if (i13 == 1 || i13 == 2) {
            return EnumC39333f.SLEEP;
        }
        if (i13 == 3) {
            return EnumC39333f.RECOVERY;
        }
        if (i13 == 4) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    private final C28000f m110804c(AbstractC39529d heartRate, Map<ZoneID, Duration> hrZoneDurations) {
        return this.hrZonesReducer.m89304f(heartRate, hrZoneDurations);
    }

    /* JADX INFO: renamed from: d */
    private final C33891i m110805d(C25650q domainState) {
        InterfaceC25648o currentDialogType = domainState.getCurrentDialogType();
        if (AbstractC22676k.m65745e(currentDialogType, InterfaceC25648o.a.f100649a)) {
            return m110806e(domainState.getIsDiscarding());
        }
        if (AbstractC22676k.m65745e(currentDialogType, InterfaceC25648o.b.f100650a)) {
            return m110807f();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    private final C33891i m110806e(boolean isLoading) {
        return new C33891i(AbstractC8693b.m21277k(AbstractC22551d.f88696j), AbstractC8693b.m21277k(AbstractC22551d.f88695i), AbstractC8693b.m21277k(AbstractC22551d.f88694h), AbstractC8693b.m21277k(AbstractC22551d.f88693g), InterfaceC33892j.d.f141988a, InterfaceC33892j.b.f141986a, isLoading, false, 128, null);
    }

    /* JADX INFO: renamed from: f */
    private final C33891i m110807f() {
        return new C33891i(AbstractC8693b.m21277k(AbstractC22551d.f88707u), AbstractC8693b.m21277k(AbstractC22551d.f88706t), AbstractC8693b.m21277k(AbstractC22551d.f88705s), AbstractC8693b.m21277k(AbstractC22551d.f88704r), InterfaceC33892j.e.f141989a, InterfaceC33892j.c.f141987a, false, true, 64, null);
    }

    /* JADX INFO: renamed from: g */
    private final int m110808g(EnumC25655v enumC25655v) {
        int i13 = a.f148544a[enumC25655v.ordinal()];
        if (i13 == 1) {
            return AbstractC22551d.f88682X;
        }
        if (i13 == 2) {
            return AbstractC22551d.f88680V;
        }
        if (i13 == 3) {
            return AbstractC22551d.f88681W;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: h */
    private final Map<String, C40851l> m110809h(C25650q domainState) {
        C40851l c40851l;
        if (!AbstractC25644k.m75457b(domainState.getContentType())) {
            return C25272z.f99163w;
        }
        C25645l trackSessionState = domainState.getTrackSessionState();
        List<EnumC25655v> listM110824x = m110824x(domainState);
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(listM110824x, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (EnumC25655v enumC25655v : listM110824x) {
            String strName = enumC25655v.name();
            int i13 = a.f148544a[enumC25655v.ordinal()];
            if (i13 == 1) {
                c40851l = new C40851l(C33890h.f141975a.m107194n(trackSessionState), trackSessionState != null ? m110804c(trackSessionState.getHeartRate().getLive(), trackSessionState.m75460c()) : null);
            } else if (i13 == 2) {
                c40851l = new C40851l(C33890h.f141975a.m107192g(trackSessionState), this.hrZonesReducer.m89308j(domainState));
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                c40851l = new C40851l(C33890h.f141975a.m107193h(trackSessionState, domainState.getUnitSystem()), C33886d.f141967a.m107174a(trackSessionState != null ? trackSessionState.getMap() : null, domainState.getTargets().getDistanceMeters(), domainState.getUnitSystem()));
            }
            linkedHashMap.put(strName, c40851l);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: i */
    private final EnumC39333f m110810i(C25650q domainState) {
        ZoneID zoneID;
        C25638e heartRate;
        C25645l trackSessionState = domainState.getTrackSessionState();
        AbstractC39529d live2 = (trackSessionState == null || (heartRate = trackSessionState.getHeartRate()) == null) ? null : heartRate.getLive();
        AbstractC39529d.a aVar = live2 instanceof AbstractC39529d.a ? (AbstractC39529d.a) live2 : null;
        if (aVar == null || (zoneID = aVar.getZoneID()) == null) {
            return null;
        }
        return AbstractC28005k.m84470a(zoneID);
    }

    /* JADX INFO: renamed from: k */
    private final C33883a m110811k() {
        return new C33883a(C25271y.f99162w, false, 0, false, 10, null);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC33899q.b m110812l(C25650q domainState) {
        C25645l trackSessionState = domainState.getTrackSessionState();
        C25639f map = trackSessionState != null ? trackSessionState.getMap() : null;
        List<C36823w> listM75439c = map != null ? map.m75439c() : null;
        if (listM75439c == null) {
            listM75439c = C25271y.f99162w;
        }
        List<C36823w> list = listM75439c;
        C36823w currentLocation = map != null ? map.getCurrentLocation() : null;
        AbstractC36826z.a aVar = (currentLocation == null && list.isEmpty()) ? null : new AbstractC36826z.a(currentLocation, list, true, null, 8, null);
        if (currentLocation == null) {
            currentLocation = (C36823w) AbstractC25265s.m74114R0(list);
        }
        return new InterfaceC33899q.b(aVar, currentLocation);
    }

    /* JADX INFO: renamed from: m */
    private final C33883a m110813m(C25650q domainState) {
        return this.hrZonesReducer.m89311m(domainState);
    }

    /* JADX INFO: renamed from: n */
    private final C33883a m110814n(C25650q domainState) {
        int i13 = a.f148545b[domainState.getContentType().ordinal()];
        if (i13 == 1 || i13 == 2) {
            return m110815o(domainState);
        }
        if (i13 == 3) {
            return m110813m(domainState);
        }
        if (i13 == 4) {
            return new C33883a(C25271y.f99162w, false, 0, false, 14, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: o */
    private final C33883a m110815o(C25650q domainState) {
        return new C33883a(AbstractC37056f.m118958J(AbstractC33898p.m107244a(domainState.getContentType())), false, 0, false, 14, null);
    }

    /* JADX INFO: renamed from: p */
    private final C33883a m110816p(C25650q domainState) {
        C25645l trackSessionState = domainState.getTrackSessionState();
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        c26460cM119000x.add(new C25292c0(0.0f, 6 * 8, 1, null));
        if (trackSessionState != null) {
            c26460cM119000x.add(m110819s(C25642i.m75446b(trackSessionState.getStrain(), 0.0f, 0.0f, 0.0f, domainState.getTargets().getStrain(), 0.0f, 0.0f, 0.0d, 0.0d, 247, null)));
        }
        return new C33883a(AbstractC37056f.m118988k(c26460cM119000x), false, 0, false, 10, null);
    }

    /* JADX INFO: renamed from: q */
    private final C33895m m110817q(InterfaceC25648o.d conflict) {
        C33211q0 c33211q0 = new C33211q0(null, new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC22551d.f88674P), false, null, 6, null), AbstractC8693b.m21277k(AbstractC22551d.f88672N), null, AbstractC8693b.m21277k(AbstractC22551d.f88673O), false, false, null, false, false, 1001, null);
        C9598e c9598eM110802a = m110802a(conflict);
        C25653t c25653t = C25653t.f100872a;
        return new C33895m(new C33895m.a(c33211q0, new C33893k(c9598eM110802a, c25653t.m75540a()), null, new C33893k(c25653t.m75541b(), null, 2, null), 4, null), null, null, 6, null);
    }

    /* JADX INFO: renamed from: r */
    private final C33895m.b m110818r(C25650q domainState) {
        Duration active;
        Duration active2;
        C25637d c25637d;
        C25645l trackSessionState = domainState.getTrackSessionState();
        C25637d c25637d2 = trackSessionState != null ? trackSessionState.getIo.getstream.chat.android.client.extensions.AttachmentExtensionsKt.EXTRA_DURATION java.lang.String() : null;
        C33887e c33887e = C33887e.f141968a;
        if (c25637d2 == null || (active = c25637d2.getActive()) == null) {
            active = Duration.ZERO;
        }
        AbstractC22676k.m65747g(active);
        C23465k c23465kM107176b = c33887e.m107176b(active);
        TextResource textResource = (TextResource) c23465kM107176b.f92937w;
        TextResource textResource2 = (TextResource) c23465kM107176b.f92938x;
        C33900r c33900r = C33900r.f142071a;
        if (c25637d2 == null || (active2 = c25637d2.getActive()) == null) {
            active2 = Duration.ZERO;
        }
        AbstractC22676k.m65747g(active2);
        C33901s c33901sM107248a = c33900r.m107248a(active2, domainState.getTargets().getDurationSeconds());
        C40845f c40845fM110823w = m110823w(domainState);
        Map<String, C33883a> mapM110822v = m110822v(domainState);
        Map<String, C40851l> mapM110809h = m110809h(domainState);
        Map<String, InterfaceC33899q> mapM110821u = m110821u(domainState);
        String activityDisplayName = domainState.getActivityDisplayName();
        if (AbstractC39414r.m125890i0(activityDisplayName)) {
            activityDisplayName = domainState.getSelectedActivityInternalName();
        }
        TextResource textResourceM21278l = AbstractC8693b.m21278l(activityDisplayName);
        TextResource targetSuffix = c33901sM107248a != null ? c33901sM107248a.getTargetSuffix() : null;
        C33896n progressBar = c33901sM107248a != null ? c33901sM107248a.getProgressBar() : null;
        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC22551d.f88670L);
        C25645l trackSessionState2 = domainState.getTrackSessionState();
        return new C33895m.b(c40845fM110823w, mapM110822v, mapM110809h, mapM110821u, textResourceM21278l, textResource, textResource2, targetSuffix, progressBar, null, (trackSessionState2 == null || (c25637d = trackSessionState2.getIo.getstream.chat.android.client.extensions.AttachmentExtensionsKt.EXTRA_DURATION java.lang.String()) == null) ? false : c25637d.m75434c(), c8688bM21277k, m110805d(domainState), 512, null);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0053  */
    /* JADX WARN: Code duplicated, block: B:20:0x005b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0084  */
    /* JADX WARN: Code duplicated, block: B:24:0x0089  */
    /* JADX WARN: Code duplicated, block: B:26:0x008d  */
    /* JADX INFO: renamed from: s */
    private final C21425i m110819s(C25642i strainState) {
        Float f13;
        Float fValueOf;
        TextResource.C8688b c8688bM21277k;
        EnumC39333f enumC39333f;
        EnumC39333f enumC39333f2;
        Float targetScore = strainState.getTargetScore();
        boolean z4 = targetScore != null && strainState.getScore() >= targetScore.floatValue();
        if (targetScore == null) {
            if (strainState.getScoreTarget() > 0.0f) {
                fValueOf = Float.valueOf(strainState.getScoreTarget());
            } else {
                f13 = null;
            }
            TextResource textResourceM21278l = AbstractC8693b.m21278l(AbstractC10538f.m27183h(strainState.getScore()));
            TextResource textResourceM21267a = AbstractC8693b.m21267a();
            if (z4) {
                c8688bM21277k = AbstractC8693b.m21277k(AbstractC22551d.f88679U);
            } else {
                c8688bM21277k = AbstractC8693b.m21277k(AbstractC22551d.f88678T);
            }
            TextResource.C8688b c8688b = c8688bM21277k;
            float gaugeFillPercentage = strainState.getGaugeFillPercentage();
            Float fValueOf2 = Float.valueOf(strainState.getLowerOptimalPercentage());
            Float fValueOf3 = Float.valueOf(strainState.getHigherOptimalPercentage());
            AbstractC18247a abstractC18247aM52575m = AbstractC18249c.m52575m(p745y81.Function1.m125323a(b.f148546w));
            enumC39333f = EnumC39333f.BRAND_WHITE;
            if (z4) {
                enumC39333f2 = EnumC39333f.ACCENT_ACTION;
            } else {
                enumC39333f2 = enumC39333f;
            }
            return new C21425i("TRACK_SESSION_STRAIN_SCORE_GAUGE", "TrackSessionStrainScoreGauge", textResourceM21278l, textResourceM21267a, c8688b, f13, gaugeFillPercentage, fValueOf2, fValueOf3, abstractC18247aM52575m, null, 0.0f, 0.0f, 0.0f, false, null, enumC39333f, enumC39333f2, z4 ? Integer.valueOf(C38072d.f163053a.m121951d().getTinyIcons().getCheckmark()) : null, 30720, null);
        }
        fValueOf = Float.valueOf(AbstractC12889b.m36283m(targetScore.floatValue() / 21.0f, 0.0f, 1.0f));
        f13 = fValueOf;
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(AbstractC10538f.m27183h(strainState.getScore()));
        TextResource textResourceM21267a2 = AbstractC8693b.m21267a();
        if (z4) {
            c8688bM21277k = AbstractC8693b.m21277k(AbstractC22551d.f88679U);
        } else {
            c8688bM21277k = AbstractC8693b.m21277k(AbstractC22551d.f88678T);
        }
        TextResource.C8688b c8688b2 = c8688bM21277k;
        float gaugeFillPercentage2 = strainState.getGaugeFillPercentage();
        Float fValueOf4 = Float.valueOf(strainState.getLowerOptimalPercentage());
        Float fValueOf5 = Float.valueOf(strainState.getHigherOptimalPercentage());
        AbstractC18247a abstractC18247aM52575m2 = AbstractC18249c.m52575m(p745y81.Function1.m125323a(b.f148546w));
        enumC39333f = EnumC39333f.BRAND_WHITE;
        if (z4) {
            enumC39333f2 = EnumC39333f.ACCENT_ACTION;
        } else {
            enumC39333f2 = enumC39333f;
        }
        return new C21425i("TRACK_SESSION_STRAIN_SCORE_GAUGE", "TrackSessionStrainScoreGauge", textResourceM21278l2, textResourceM21267a2, c8688b2, f13, gaugeFillPercentage2, fValueOf4, fValueOf5, abstractC18247aM52575m2, null, 0.0f, 0.0f, 0.0f, false, null, enumC39333f, enumC39333f2, z4 ? Integer.valueOf(C38072d.f163053a.m121951d().getTinyIcons().getCheckmark()) : null, 30720, null);
    }

    /* JADX INFO: renamed from: t */
    private final InterfaceC33899q m110820t(EnumC25655v enumC25655v, C25650q c25650q) {
        int i13 = a.f148544a[enumC25655v.ordinal()];
        if (i13 != 1 && i13 != 2) {
            if (i13 == 3) {
                return m110812l(c25650q);
            }
            throw new NoWhenBranchMatchedException();
        }
        EnumC39333f enumC39333fM110810i = m110810i(c25650q);
        if (enumC39333fM110810i != null) {
            return new InterfaceC33899q.a(enumC39333fM110810i);
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    private final Map<String, InterfaceC33899q> m110821u(C25650q domainState) {
        if (!AbstractC25644k.m75457b(domainState.getContentType())) {
            EnumC39333f enumC39333fM110803b = m110803b(domainState.getContentType());
            return enumC39333fM110803b != null ? AbstractC25247g0.m73989X(new C23465k("MAIN", new InterfaceC33899q.a(enumC39333fM110803b))) : C25272z.f99163w;
        }
        List<EnumC25655v> listM110824x = m110824x(domainState);
        ArrayList arrayList = new ArrayList();
        for (EnumC25655v enumC25655v : listM110824x) {
            InterfaceC33899q interfaceC33899qM110820t = m110820t(enumC25655v, domainState);
            C23465k c23465k = interfaceC33899qM110820t != null ? new C23465k(enumC25655v.name(), interfaceC33899qM110820t) : null;
            if (c23465k != null) {
                arrayList.add(c23465k);
            }
        }
        return AbstractC25247g0.m74000i0(arrayList);
    }

    /* JADX INFO: renamed from: v */
    private final Map<String, C33883a> m110822v(C25650q domainState) {
        C33883a c33883aM110816p;
        if (!AbstractC25644k.m75457b(domainState.getContentType())) {
            return AbstractC25247g0.m73989X(new C23465k("MAIN", m110814n(domainState)));
        }
        List<EnumC25655v> listM110824x = m110824x(domainState);
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(listM110824x, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (EnumC25655v enumC25655v : listM110824x) {
            String strName = enumC25655v.name();
            int i13 = a.f148544a[enumC25655v.ordinal()];
            if (i13 == 1) {
                c33883aM110816p = m110816p(domainState);
            } else if (i13 == 2) {
                c33883aM110816p = this.hrZonesReducer.m89310l(domainState);
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                c33883aM110816p = m110811k();
            }
            linkedHashMap.put(strName, c33883aM110816p);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: w */
    private final C40845f m110823w(C25650q domainState) {
        List<EnumC25655v> listM110824x = m110824x(domainState);
        if (listM110824x.isEmpty()) {
            return new C40845f(C25271y.f99162w, "MAIN", null, 4, null);
        }
        List<EnumC25655v> list = listM110824x;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (EnumC25655v enumC25655v : list) {
            arrayList.add(new C40846g(enumC25655v.name(), AbstractC8693b.m21277k(m110808g(enumC25655v))));
        }
        EnumC25655v selectedTab = domainState.getSelectedTab();
        if (!listM110824x.contains(selectedTab)) {
            selectedTab = null;
        }
        if (selectedTab == null) {
            selectedTab = EnumC25655v.HEART_RATE;
        }
        return new C40845f(arrayList, selectedTab.name(), null, 4, null);
    }

    /* JADX INFO: renamed from: x */
    private final List<EnumC25655v> m110824x(C25650q domainState) {
        if (!AbstractC25644k.m75457b(domainState.getContentType())) {
            return C25271y.f99162w;
        }
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        c26460cM119000x.add(EnumC25655v.STRAIN);
        c26460cM119000x.add(EnumC25655v.HEART_RATE);
        if (domainState.getGpsTrackingEnabled()) {
            c26460cM119000x.add(EnumC25655v.MAP);
        }
        return AbstractC37056f.m118988k(c26460cM119000x);
    }

    /* JADX INFO: renamed from: j */
    public final C33895m m110825j(C25650q domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        C9598e pendingExitEvent = domainState.getPendingExitEvent();
        if (pendingExitEvent != null) {
            return new C33895m(new C33895m.a(AbstractC22676k.m65745e(domainState.getCurrentDialogType(), InterfaceC25648o.f.f100656a) ? C33205o0.f138451a.m105293g() : C33205o0.f138451a.m105288b(), null, null, null, 14, null), null, pendingExitEvent, 2, null);
        }
        InterfaceC25648o currentDialogType = domainState.getCurrentDialogType();
        if (AbstractC22676k.m65745e(currentDialogType, InterfaceC25648o.c.f100651a)) {
            return new C33895m(new C33895m.a(C33205o0.f138451a.m105288b(), null, null, null, 14, null), null, null, 6, null);
        }
        if (AbstractC22676k.m65745e(currentDialogType, InterfaceC25648o.h.f100658a)) {
            return new C33895m(new C33895m.a(C33205o0.f138451a.m105291e(), new InterfaceC33892j.h(domainState.getSelectedActivityInternalName(), domainState.getGpsTrackingEnabled(), domainState.getRestoreSessionDestination()), null, new C33893k(C25653t.f100872a.m75541b(), null, 2, null), 4, null), null, null, 6, null);
        }
        if (!AbstractC22676k.m65745e(currentDialogType, InterfaceC25648o.a.f100649a) && !AbstractC22676k.m65745e(currentDialogType, InterfaceC25648o.b.f100650a)) {
            if (AbstractC22676k.m65745e(currentDialogType, InterfaceC25648o.f.f100656a)) {
                return new C33895m(new C33895m.a(C33205o0.f138451a.m105293g(), null, null, null, 14, null), null, null, 6, null);
            }
            if (AbstractC22676k.m65745e(currentDialogType, InterfaceC25648o.g.f100657a)) {
                return new C33895m(new C33895m.a(new C33211q0(null, new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC16277f.f62298Y1), true, null, 4, null), AbstractC8693b.m21277k(AbstractC16277f.f62301Z1), null, AbstractC8693b.m21277k(AbstractC16277f.f62289V1), false, false, null, false, false, 1001, null), new C33893k(C25653t.f100872a.m75541b(), null, 2, null), null, null, 12, null), null, null, 6, null);
            }
            if (AbstractC22676k.m65745e(currentDialogType, InterfaceC25648o.e.f100655a)) {
                return new C33895m(new C33895m.a(new C33211q0(null, new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC16277f.f62271P1), false, null, 6, null), null, null, AbstractC8693b.m21277k(AbstractC16277f.f62289V1), false, false, null, false, false, MessageListItemViewType.LOADING_INDICATOR, null), new C33893k(C25653t.f100872a.m75541b(), null, 2, null), null, null, 12, null), null, null, 6, null);
            }
            if (currentDialogType instanceof InterfaceC25648o.d) {
                return m110817q((InterfaceC25648o.d) domainState.getCurrentDialogType());
            }
            if (currentDialogType == null) {
                return new C33895m(null, m110818r(domainState), null, 5, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        return new C33895m(null, m110818r(domainState), null, 5, null);
    }
}
