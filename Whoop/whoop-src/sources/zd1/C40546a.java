package zd1;

import c41.C4092p2;
import com.whoop.common.network.model.ActivityOverlapError;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d13.AbstractC11478a;
import gz0.AbstractC16319p0;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kd1.AbstractC22404p;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import n82.EnumC26455a;
import no.nordicsemi.android.dfu.DfuBaseService;
import od1.C27836a;
import od1.C27850m;
import or2.AbstractC28188o1;
import or2.C28204u;
import or2.C28205u0;
import org.joda.time.LocalDateTime;
import p031b9.AbstractC2875y;
import p208i2.C17919x;
import p294l3.C23246c;
import p294l3.C23254g;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import q83.AbstractC30060g;
import sp0.C32864d;
import sp0.C32870j;
import sp0.EnumC32861a;
import sp0.EnumC32862b;
import sp0.EnumC32863c;
import sp0.InterfaceC32865e;
import xd1.C38203b;
import y71.AbstractC39279l;
import y71.C39282o;
import yb3.AbstractC39414r;
import z90.AbstractC40203a;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: zd1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJC\u0010&\u001a\u00020%2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00132\b\b\u0002\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010'J#\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001f0(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001f0(H\u0002¢\u0006\u0004\b*\u0010+J)\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001b0(*\b\u0012\u0004\u0012\u00020,0(2\b\b\u0002\u0010-\u001a\u00020\u0019H\u0002¢\u0006\u0004\b.\u0010/J\u0013\u00101\u001a\u000200*\u00020\u0011H\u0002¢\u0006\u0004\b1\u00102J\u0013\u00103\u001a\u000200*\u00020\u0011H\u0002¢\u0006\u0004\b3\u00102J\u0017\u00106\u001a\u00020\u000e2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020\u000e2\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b:\u0010;J-\u0010@\u001a\u00020?2\u0006\u0010<\u001a\u00020\u00192\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00190(2\u0006\u0010>\u001a\u00020\u0019H\u0002¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u000eH\u0002¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u000eH\u0002¢\u0006\u0004\bD\u0010CJ\u000f\u0010E\u001a\u00020\u000eH\u0002¢\u0006\u0004\bE\u0010CJ\u0013\u0010H\u001a\u00020G*\u00020FH\u0002¢\u0006\u0004\bH\u0010IJ\u0019\u0010M\u001a\u0004\u0018\u00010L2\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010P\u001a\u00020L2\u0006\u0010O\u001a\u000200H\u0002¢\u0006\u0004\bP\u0010QJ+\u0010U\u001a\u00020#2\b\u0010R\u001a\u0004\u0018\u00010,2\u0006\u0010T\u001a\u00020S2\b\u0010K\u001a\u0004\u0018\u00010JH\u0002¢\u0006\u0004\bU\u0010VJ\u0019\u0010X\u001a\u0004\u0018\u00010W2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\bX\u0010YJ\u0017\u0010[\u001a\u00020#2\u0006\u0010Z\u001a\u00020\u0019H\u0002¢\u0006\u0004\b[\u0010\\J\u001d\u0010]\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b]\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010^R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010_R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010`¨\u0006a"}, m65681d2 = {"Lzd1/a;", "", "Lor2/u0;", "localizedDateTimeFormatter", "Lzr2/a;", "dateAndTimeProvider", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lor2/u0;Lzr2/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lxd1/b;", "domainState", "Lod1/m;", "searchState", "Lzd1/d;", "o", "(Lxd1/b;Lod1/m;)Lzd1/d;", "Lorg/joda/time/LocalDateTime;", "editedStartTime", "Lsp0/d;", "l", "(Lorg/joda/time/LocalDateTime;Lxd1/b;)Lsp0/d;", "editedEndTime", "j", "selectActivityDomainState", "", "activityInternalName", "Ly71/o;", "k", "(Lod1/m;Ljava/lang/String;)Ly71/o;", "selectedActivityMenuItemState", "Lsp0/j;", "currentStrapLocation", "startTimePickerState", "endTimePickerState", "", "primaryButtonEnabled", "Lzd1/d$a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lxd1/b;Ly71/o;Lsp0/j;Lsp0/d;Lsp0/d;Z)Lzd1/d$a;", "", "strapLocation", "i", "(Ljava/util/List;)Ljava/util/List;", "Lod1/a;", "selectedActivityInternalName", "p", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "Lcom/whoop/design/util/TextResource;", "d", "(Lorg/joda/time/LocalDateTime;)Lcom/whoop/design/util/TextResource;", "e", "Lzd1/g;", "progressDomainState", "u", "(Lzd1/g;)Lzd1/d;", "Lcom/whoop/common/network/model/ActivityOverlapError;", "dialogState", "q", "(Lcom/whoop/common/network/model/ActivityOverlapError;)Lzd1/d;", "message", "overlappingActivities", "resolution", "Ll3/g;", "c", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Ll3/g;", "s", "()Lzd1/d;", "t", "r", "Lzd1/f;", "Lzd1/b$p;", "v", "(Lzd1/f;)Lzd1/b$p;", "Lsp0/e;", "dateWarning", "Lc41/p2;", "f", "(Lsp0/e;)Lc41/p2;", "content", "a", "(Lcom/whoop/design/util/TextResource;)Lc41/p2;", "selectActivity", "Lsp0/a;", "activityType", "b", "(Lod1/a;Lsp0/a;Lsp0/e;)Z", "Lcom/whoop/design/util/TextResource$b;", "g", "(Lxd1/b;)Lcom/whoop/design/util/TextResource$b;", "internalName", "m", "(Ljava/lang/String;)Z", "n", "Lor2/u0;", "Lzr2/a;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40546a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C28205u0 localizedDateTimeFormatter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: zd1.a$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f174457a;

        static {
            int[] iArr = new int[EnumC32863c.values().length];
            try {
                iArr[EnumC32863c.EDIT_ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC32863c.COLLAPSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC32863c.SELECT_ACTIVITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f174457a = iArr;
        }
    }

    /* JADX INFO: renamed from: zd1.a$b */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f174458w = new b();

        /* JADX INFO: renamed from: a */
        public final long m131424a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend15();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m131424a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zd1.a$c */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f174459w = new c();

        /* JADX INFO: renamed from: a */
        public final long m131425a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m131425a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zd1.a$d */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t14, T t15) {
            String displayName = ((C27836a) t14).getDisplayName();
            Locale locale = Locale.ROOT;
            String upperCase = displayName.toUpperCase(locale);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            String upperCase2 = ((C27836a) t15).getDisplayName().toUpperCase(locale);
            AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
            return AbstractC30060g.m92127q(upperCase, upperCase2);
        }
    }

    public C40546a(C28205u0 localizedDateTimeFormatter, InterfaceC41070a dateAndTimeProvider, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.localizedDateTimeFormatter = localizedDateTimeFormatter;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: renamed from: a */
    private final C4092p2 m131402a(TextResource content) {
        return new C4092p2(EnumC16313m0.TINY_ATTENTION_ORANGE, 0.0f, null, null, content, null, p745y81.Function1.m125323a(b.f174458w), null, p745y81.Function1.m125323a(c.f174459w), null, null, null, null, false, null, null, null, null, null, null, 1048238, null);
    }

    /* JADX INFO: renamed from: b */
    private final boolean m131403b(C27836a selectActivity, EnumC32861a activityType, InterfaceC32865e dateWarning) {
        if (activityType == EnumC32861a.SLEEP) {
            return AbstractC22676k.m65745e(dateWarning, InterfaceC32865e.c.f136904a);
        }
        return selectActivity != null && AbstractC22676k.m65745e(dateWarning, InterfaceC32865e.c.f136904a);
    }

    /* JADX INFO: renamed from: c */
    private final C23254g m131404c(String message, List<String> overlappingActivities, String resolution) {
        StringBuilder sb4 = new StringBuilder(16);
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        sb4.append(message);
        sb4.append("\n\n");
        String strM8304q = AbstractC2875y.m8304q(sb4, AbstractC25265s.m74110N0(overlappingActivities, "\n", null, null, null, 62), "\n\n", resolution);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            arrayList2.add(((C23246c) arrayList.get(i13)).m67297a(sb4.length()));
        }
        return new C23254g(strM8304q, arrayList2);
    }

    /* JADX INFO: renamed from: d */
    private final TextResource m131405d(LocalDateTime localDateTime) {
        return !AbstractC22676k.m65745e(localDateTime.toLocalDate(), this.dateAndTimeProvider.mo133365d()) ? AbstractC8693b.m21278l(localDateTime.toString("MMM d")) : AbstractC8693b.m21277k(AbstractC40203a.f173542O);
    }

    /* JADX INFO: renamed from: e */
    private final TextResource m131406e(LocalDateTime localDateTime) {
        if (!this.localizedDateTimeFormatter.m85383l()) {
            return AbstractC8693b.m21278l(C28204u.INSTANCE.m85361d(localDateTime));
        }
        return AbstractC8693b.m21278l(localDateTime.getHourOfDay() + ":" + String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(localDateTime.getMinuteOfHour())}, 1)));
    }

    /* JADX INFO: renamed from: f */
    private final C4092p2 m131407f(InterfaceC32865e dateWarning) {
        if (dateWarning instanceof InterfaceC32865e.a) {
            return m131402a(new TextResource.C8688b(AbstractC40203a.f173568y, new TextResource.AbstractC8690d.a(Integer.valueOf(((InterfaceC32865e.a) dateWarning).getMaxDuration()))));
        }
        if (AbstractC22676k.m65745e(dateWarning, InterfaceC32865e.b.f136903a)) {
            return m131402a(AbstractC8693b.m21277k(AbstractC40203a.f173550g));
        }
        if (AbstractC22676k.m65745e(dateWarning, InterfaceC32865e.d.f136905a)) {
            return m131402a(AbstractC8693b.m21277k(AbstractC40203a.f173567x));
        }
        if (AbstractC22676k.m65745e(dateWarning, InterfaceC32865e.c.f136904a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: g */
    private final TextResource.C8688b m131408g(C38203b domainState) {
        if (!domainState.getIsDeletable() || AbstractC39414r.m125890i0(domainState.getActivityId())) {
            return null;
        }
        return AbstractC8693b.m21277k(AbstractC40203a.f173552i);
    }

    /* JADX INFO: renamed from: h */
    private final InterfaceC40549d.a m131409h(C38203b domainState, C39282o selectedActivityMenuItemState, C32870j currentStrapLocation, C32864d startTimePickerState, C32864d endTimePickerState, boolean primaryButtonEnabled) {
        EnumC32862b enumC32862b = EnumC32862b.EXPANDED;
        EnumC32861a activityType = domainState.getActivityType();
        EnumC32861a enumC32861a = EnumC32861a.SLEEP;
        TextResource.C8688b c8688bM21277k = activityType == enumC32861a ? AbstractC8693b.m21277k(AbstractC40203a.f173562s) : AbstractC8693b.m21277k(AbstractC40203a.f173561r);
        TextResource textResourceM21277k = domainState.getCallToActionDisplay().length() == 0 ? AbstractC8693b.m21277k(AbstractC40203a.f173545b) : AbstractC8693b.m21278l(domainState.getCallToActionDisplay());
        TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC40203a.f173539L);
        TextResource.C8688b c8688bM21277k3 = AbstractC8693b.m21277k(AbstractC40203a.f173540M);
        List<C32870j> listM131410i = m131410i(domainState.m122371f());
        EnumC32861a activityType2 = domainState.getActivityType();
        TextResource textResourceM21277k2 = (domainState.getActivityType() == enumC32861a && AbstractC22676k.m65745e(domainState.getFlow(), "SPLIT_SLEEP")) ? AbstractC8693b.m21277k(AbstractC40203a.f173563t) : AbstractC8693b.m21267a();
        C4092p2 c4092p2M131407f = m131407f(domainState.getInvalidDateWarning());
        return new InterfaceC40549d.a(c8688bM21277k, textResourceM21277k, selectedActivityMenuItemState, domainState.getActivityType() != enumC32861a, c8688bM21277k2, c8688bM21277k3, currentStrapLocation, listM131410i, startTimePickerState, endTimePickerState, enumC32862b, activityType2, primaryButtonEnabled, textResourceM21277k2, c4092p2M131407f, domainState.getSelectedScreenSection(), true, m131408g(domainState));
    }

    /* JADX INFO: renamed from: i */
    private final List<C32870j> m131410i(List<C32870j> strapLocation) {
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(strapLocation);
        arrayListM74097F1.add(0, new C32870j(0, AbstractC8693b.m21277k(AbstractC40203a.f173538K)));
        return arrayListM74097F1;
    }

    /* JADX INFO: renamed from: j */
    private final C32864d m131411j(LocalDateTime editedEndTime, C38203b domainState) {
        return new C32864d(m131405d(editedEndTime), m131406e(editedEndTime), domainState.getEndTimeValue(), editedEndTime, domainState.getActivityType() == EnumC32861a.SLEEP ? AbstractC8693b.m21277k(AbstractC40203a.f173543P) : AbstractC8693b.m21277k(AbstractC40203a.f173564u));
    }

    /* JADX INFO: renamed from: k */
    private final C39282o m131412k(C27850m selectActivityDomainState, String activityInternalName) {
        Object next;
        TextResource textResourceM21277k;
        String displayName;
        Iterator<T> it = selectActivityDomainState.m83969c().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((C27836a) next).getInternalName(), activityInternalName));
        C27836a c27836a = (C27836a) next;
        if (c27836a == null || (displayName = c27836a.getDisplayName()) == null || (textResourceM21277k = AbstractC11478a.m30853e(Locale.ROOT, displayName, "toUpperCase(...)")) == null) {
            textResourceM21277k = AbstractC8693b.m21277k(AbstractC40203a.f173533F);
        }
        TextResource textResource = textResourceM21277k;
        C39282o c39282o = new C39282o(null, textResource, null, false, false, new AbstractC39279l.c(null, null, AbstractC22404p.m64502k(AbstractC16319p0.m46430a().getActivities().getOther()), null, AbstractC22404p.m64502k(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationForward()), null, null, null, null, null, null, false, 4075, null), false, null, null, null, false, null, null, null, null, 32733, null);
        return c27836a != null ? c39282o.m125211a((32735 & 1) != 0 ? c39282o.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32735 & 2) != 0 ? c39282o.title : textResource, (32735 & 4) != 0 ? c39282o.titleColor : null, (32735 & 8) != 0 ? c39282o.enabled : false, (32735 & 16) != 0 ? c39282o.selected : false, (32735 & 32) != 0 ? c39282o.alignment : new AbstractC39279l.c(null, null, AbstractC22404p.m64503l(c27836a.getIconUrl()), null, AbstractC22404p.m64502k(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationForward()), null, null, null, null, null, null, false, 4075, null), (32735 & 64) != 0 ? c39282o.shouldApplyCardGradient : false, (32735 & 128) != 0 ? c39282o.background : null, (32735 & 256) != 0 ? c39282o.border : null, (32735 & 512) != 0 ? c39282o.destination : null, (32735 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c39282o.showCaretIcon : false, (32735 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c39282o.menuItemStyle : null, (32735 & 4096) != 0 ? c39282o.trackingId : null, (32735 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c39282o.genericInteraction : null, (32735 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c39282o.analyticEvent : null) : c39282o;
    }

    /* JADX INFO: renamed from: l */
    private final C32864d m131413l(LocalDateTime editedStartTime, C38203b domainState) {
        return new C32864d(m131405d(editedStartTime), m131406e(editedStartTime), domainState.getStartTimeValue(), editedStartTime, domainState.getActivityType() == EnumC32861a.SLEEP ? AbstractC8693b.m21277k(AbstractC40203a.f173549f) : AbstractC8693b.m21277k(AbstractC40203a.f173537J));
    }

    /* JADX INFO: renamed from: m */
    private final boolean m131414m(String internalName) {
        return AbstractC22676k.m65745e(internalName, "activity");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.whoop.design.util.TextResource] */
    /* JADX INFO: renamed from: o */
    private final InterfaceC40549d m131415o(C38203b domainState, C27850m searchState) {
        int i13 = a.f174457a[domainState.getDataState().ordinal()];
        Object obj = null;
        if (i13 == 1) {
            for (Object obj2 : searchState.m83969c()) {
                if (AbstractC22676k.m65745e(((C27836a) obj2).getInternalName(), domainState.getActivityInternalName())) {
                    obj = obj2;
                    break;
                }
            }
            return m131409h(domainState, m131412k(searchState, domainState.getActivityInternalName()), domainState.getStrapLocation(), m131413l(domainState.getStartTimeValue(), domainState), m131411j(domainState.getEndTimeValue(), domainState), m131403b((C27836a) obj, domainState.getActivityType(), domainState.getInvalidDateWarning()));
        }
        if (i13 == 2) {
            return new InterfaceC40549d.a(null, null, null, false, null, null, null, null, null, null, EnumC32862b.COLLAPSED, null, false, null, null, null, false, null, 261119, null);
        }
        if (i13 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        EnumC32862b enumC32862b = EnumC32862b.EXPANDED;
        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC40203a.f173532E);
        String str = searchState.getCom.mapbox.common.MapboxServices.SEARCH java.lang.String();
        EnumC26455a enumC26455aM103132c = EnumC32861a.INSTANCE.m103132c(domainState.getActivityType());
        return new InterfaceC40549d.f(c8688bM21277k, enumC32862b, str, AbstractC39414r.m125890i0(searchState.getCom.mapbox.common.MapboxServices.SEARCH java.lang.String()) ? m131416p(AbstractC25265s.m74156w1(searchState.m83971e(), 5), domainState.getActivityInternalName()) : C25271y.f99162w, m131416p(AbstractC25265s.m74152u1(searchState.m83970d(), new d()), domainState.getActivityInternalName()), null, enumC26455aM103132c, m131414m(domainState.getActivityInternalName()) ? AbstractC8693b.m21277k(AbstractC40203a.f173566w) : null, null, this.featureFlagChecker.isFeatureEnabled("enable-cross-score-type-activity-edits") && !AbstractC39414r.m125890i0(searchState.getCom.mapbox.common.MapboxServices.SEARCH java.lang.String()), 288, null);
    }

    /* JADX INFO: renamed from: p */
    private final List<C39282o> m131416p(List<C27836a> list, String str) {
        List<C27836a> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (C27836a c27836a : list2) {
            C39282o.Companion companion = C39282o.INSTANCE;
            boolean zM65745e = AbstractC22676k.m65745e(c27836a.getInternalName(), str);
            String internalName = c27836a.getInternalName();
            arrayList.add(companion.m125233e(AbstractC11478a.m30853e(Locale.ROOT, c27836a.getDisplayName(), "toUpperCase(...)"), (32718 & 2) != 0 ? p745y81.Function1.m125323a(C39282o.Companion.i.f169013w) : null, (32718 & 4) != 0 ? AbstractC8693b.m21267a() : null, (32718 & 8) != 0 ? p745y81.Function1.m125323a(C39282o.Companion.j.f169014w) : null, (32718 & 16) != 0 ? null : AbstractC22404p.m64503l(c27836a.getIconUrl()), (32718 & 32) == 0 ? null : null, (32718 & 64) != 0 ? AbstractC8693b.m21267a() : null, (32718 & 128) != 0 ? AbstractC8693b.m21267a() : null, (32718 & 256) != 0 ? AbstractC8693b.m21267a() : null, (32718 & 512) != 0 ? AbstractC8693b.m21267a() : null, (32718 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? p745y81.Function1.m125323a(C39282o.Companion.k.f169015w) : null, (32718 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0, (32718 & 4096) != 0 ? false : zM65745e, (32718 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? C23454a0.f92919a : internalName, (32718 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? false : false));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: q */
    private final InterfaceC40549d m131417q(ActivityOverlapError dialogState) {
        TextResource textResourceM21278l = AbstractC8693b.m21278l(dialogState.getErrorTitle());
        C23254g c23254gM131404c = m131404c(dialogState.getMessage(), dialogState.getOverlappingActivities(), dialogState.getResolution());
        return AbstractC28188o1.m85314d(dialogState.getProceedButton()) ? new InterfaceC40549d.b(textResourceM21278l, c23254gM131404c, AbstractC8693b.m21278l(dialogState.getProceedButton()), AbstractC8693b.m21278l(dialogState.getDismissButton())) : new InterfaceC40549d.d(textResourceM21278l, c23254gM131404c, AbstractC8693b.m21278l(dialogState.getDismissButton()));
    }

    /* JADX INFO: renamed from: r */
    private final InterfaceC40549d m131418r() {
        return new InterfaceC40549d.c(AbstractC8693b.m21277k(AbstractC40203a.f173535H), AbstractC8693b.m21277k(AbstractC40203a.f173536I), AbstractC8693b.m21277k(AbstractC40203a.f173551h), AbstractC8693b.m21277k(AbstractC40203a.f173534G), InterfaceC40547b.e.f174464a, InterfaceC40547b.c.f174462a);
    }

    /* JADX INFO: renamed from: s */
    private final InterfaceC40549d m131419s() {
        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC40203a.f173548e);
        TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC40203a.f173550g);
        TextResource.C8688b c8688bM21277k3 = AbstractC8693b.m21277k(AbstractC40203a.f173530C);
        InterfaceC40547b.c cVar = InterfaceC40547b.c.f174462a;
        return new InterfaceC40549d.c(c8688bM21277k, c8688bM21277k2, c8688bM21277k3, null, cVar, cVar, 8, null);
    }

    /* JADX INFO: renamed from: t */
    private final InterfaceC40549d m131420t() {
        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC40203a.f173529B);
        TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC40203a.f173528A);
        TextResource.C8688b c8688bM21277k3 = AbstractC8693b.m21277k(AbstractC40203a.f173530C);
        InterfaceC40547b.c cVar = InterfaceC40547b.c.f174462a;
        return new InterfaceC40549d.c(c8688bM21277k, c8688bM21277k2, c8688bM21277k3, null, cVar, cVar, 8, null);
    }

    /* JADX INFO: renamed from: u */
    private final InterfaceC40549d m131421u(InterfaceC40552g progressDomainState) {
        if (AbstractC22676k.m65745e(progressDomainState, InterfaceC40553h.g.f174622a)) {
            return InterfaceC40549d.e.INSTANCE.m131502b();
        }
        if (progressDomainState instanceof InterfaceC40553h.i) {
            InterfaceC40553h.i iVar = (InterfaceC40553h.i) progressDomainState;
            return InterfaceC40549d.e.m131491h(InterfaceC40549d.e.INSTANCE.m131503c(), null, null, null, m131422v(iVar.getFailedAction()), null, new InterfaceC40547b.j(iVar.getErrorCloseEvent()), null, null, 215, null);
        }
        if (progressDomainState instanceof InterfaceC40553h.f) {
            InterfaceC40553h.f fVar = (InterfaceC40553h.f) progressDomainState;
            return InterfaceC40549d.e.m131491h(InterfaceC40549d.e.INSTANCE.m131501a(), null, null, null, m131422v(fVar.getFailedAction()), null, new InterfaceC40547b.j(fVar.getErrorCloseEvent()), null, null, 215, null);
        }
        if (AbstractC22676k.m65745e(progressDomainState, InterfaceC40553h.m.f174629a)) {
            return InterfaceC40549d.e.m131491h(InterfaceC40549d.e.INSTANCE.m131506f(), null, null, null, null, null, null, InterfaceC40547b.l.f174477a, null, 191, null);
        }
        if (AbstractC22676k.m65745e(progressDomainState, InterfaceC40553h.k.f174627a)) {
            return InterfaceC40549d.e.INSTANCE.m131504d();
        }
        if (AbstractC22676k.m65745e(progressDomainState, InterfaceC40553h.n.f174630a)) {
            return InterfaceC40549d.e.m131491h(InterfaceC40549d.e.INSTANCE.m131506f(), null, null, null, null, null, null, InterfaceC40547b.f.f174465a, null, 191, null);
        }
        if (AbstractC22676k.m65745e(progressDomainState, InterfaceC40553h.l.f174628a)) {
            return InterfaceC40549d.e.INSTANCE.m131505e();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: v */
    private final InterfaceC40547b.p m131422v(InterfaceC40551f interfaceC40551f) {
        if (AbstractC22676k.m65745e(interfaceC40551f, InterfaceC40551f.a.f174614a)) {
            return InterfaceC40547b.p.f174481a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: n */
    public final InterfaceC40549d m131423n(C38203b domainState, C27850m searchState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        AbstractC22676k.m65750j(searchState, "searchState");
        InterfaceC40553h screenState = domainState.getScreenState();
        if (screenState instanceof InterfaceC40552g) {
            return m131421u((InterfaceC40552g) domainState.getScreenState());
        }
        if (screenState instanceof InterfaceC40553h.c) {
            return m131417q(((InterfaceC40553h.c) domainState.getScreenState()).getActivityOverlapError());
        }
        if (AbstractC22676k.m65745e(screenState, InterfaceC40553h.e.f174619a)) {
            return m131419s();
        }
        if (AbstractC22676k.m65745e(screenState, InterfaceC40553h.j.f174626a)) {
            return m131420t();
        }
        return AbstractC22676k.m65745e(screenState, InterfaceC40553h.d.f174618a) ? m131418r() : m131415o(domainState, searchState);
    }
}
