package da0;

import ba0.C2898b;
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
import od1.AbstractC27852o;
import od1.C27836a;
import od1.C27850m;
import or2.C28204u;
import or2.C28205u0;
import org.joda.time.LocalDateTime;
import p208i2.C17919x;
import p294l3.C23246c;
import p294l3.C23254g;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import pp0.C29426d;
import q83.AbstractC30060g;
import sp0.C32864d;
import sp0.C32870j;
import sp0.EnumC32862b;
import sp0.EnumC32863c;
import sp0.InterfaceC32865e;
import sp0.InterfaceC32867g;
import sp0.InterfaceC32868h;
import sp0.InterfaceC32869i;
import y71.AbstractC39279l;
import y71.C39282o;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import z90.AbstractC40203a;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: da0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001dH\u0002¢\u0006\u0004\b#\u0010!J\u001f\u0010&\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u0016H\u0002¢\u0006\u0004\b&\u0010'JC\u00100\u001a\u00020/2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u001a2\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u001f2\b\b\u0002\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00105\u001a\u0002042\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b5\u00106J\u0019\u00109\u001a\u0004\u0018\u0001042\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b9\u0010:J#\u0010<\u001a\b\u0012\u0004\u0012\u00020)0\u00132\f\u0010;\u001a\b\u0012\u0004\u0012\u00020)0\u0013H\u0002¢\u0006\u0004\b<\u0010=J)\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0013*\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0002\u0010>\u001a\u00020\u0016H\u0002¢\u0006\u0004\b?\u0010@J\u0013\u0010A\u001a\u000202*\u00020\u001dH\u0002¢\u0006\u0004\bA\u0010BJ\u0013\u0010C\u001a\u000202*\u00020\u001dH\u0002¢\u0006\u0004\bC\u0010BJ\u0017\u0010F\u001a\u00020\u00102\u0006\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00020\u00102\u0006\u0010I\u001a\u00020HH\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010N\u001a\u00020M2\u0006\u0010L\u001a\u00020HH\u0002¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u0010H\u0002¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\u0010H\u0002¢\u0006\u0004\bR\u0010QJ\u0013\u0010U\u001a\u00020T*\u00020SH\u0002¢\u0006\u0004\bU\u0010VJ#\u0010X\u001a\u00020-2\b\u0010W\u001a\u0004\u0018\u00010\u00142\b\u00108\u001a\u0004\u0018\u000107H\u0002¢\u0006\u0004\bX\u0010YJ\u001d\u0010Z\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bZ\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010[R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010\\R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bN\u0010]\u001a\u0004\b^\u0010_R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010`¨\u0006a"}, m65681d2 = {"Lda0/a;", "", "Lor2/u0;", "localizedDateTimeFormatter", "Lzr2/a;", "dateAndTimeProvider", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lpp0/d;", "imageUtils", "<init>", "(Lor2/u0;Lzr2/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Lpp0/d;)V", "Lba0/b;", "domainState", "Lod1/m;", "searchState", "Lda0/d;", "n", "(Lba0/b;Lod1/m;)Lda0/d;", "", "Lod1/a;", "activityList", "", "selectedActivityName", "Ln82/a;", "pageType", "Ly71/o;", "l", "(Ljava/util/List;Ljava/lang/String;Ln82/a;)Ljava/util/List;", "Lorg/joda/time/LocalDateTime;", "editedStartTime", "Lsp0/d;", "k", "(Lorg/joda/time/LocalDateTime;)Lsp0/d;", "editedEndTime", "i", "selectActivityDomainState", "activityInternalName", "j", "(Lod1/m;Ljava/lang/String;)Ly71/o;", "selectedActivityMenuItemState", "Lsp0/j;", "currentStrapLocation", "startTimePickerState", "endTimePickerState", "", "primaryButtonEnabled", "Lda0/d$a;", "g", "(Lba0/b;Ly71/o;Lsp0/j;Lsp0/d;Lsp0/d;Z)Lda0/d$a;", "Lcom/whoop/design/util/TextResource;", "content", "Lc41/p2;", "a", "(Lcom/whoop/design/util/TextResource;)Lc41/p2;", "Lsp0/e;", "dateWarning", "f", "(Lsp0/e;)Lc41/p2;", "strapLocation", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/util/List;)Ljava/util/List;", "selectedActivityInternalName", "o", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "d", "(Lorg/joda/time/LocalDateTime;)Lcom/whoop/design/util/TextResource;", "e", "Lsp0/h;", "progressDomainState", "s", "(Lsp0/h;)Lda0/d;", "Lcom/whoop/common/network/model/ActivityOverlapError;", "dialogState", "p", "(Lcom/whoop/common/network/model/ActivityOverlapError;)Lda0/d;", "overlapError", "Ll3/g;", "c", "(Lcom/whoop/common/network/model/ActivityOverlapError;)Ll3/g;", "q", "()Lda0/d;", "r", "Lsp0/g;", "Lda0/b$j;", "t", "(Lsp0/g;)Lda0/b$j;", "selectActivity", "b", "(Lod1/a;Lsp0/e;)Z", "m", "Lor2/u0;", "Lzr2/a;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "getFeatureFlagChecker", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "Lpp0/d;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11828a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C28205u0 localizedDateTimeFormatter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C29426d imageUtils;

    /* JADX INFO: renamed from: da0.a$a */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38424a;

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
            f38424a = iArr;
        }
    }

    /* JADX INFO: renamed from: da0.a$b */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f38425w = new b();

        /* JADX INFO: renamed from: a */
        public final long m31711a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend15();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m31711a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: da0.a$c */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f38426w = new c();

        /* JADX INFO: renamed from: a */
        public final long m31712a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m31712a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: da0.a$d */
    /* JADX INFO: loaded from: classes6.dex */
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

    /* JADX INFO: renamed from: da0.a$e */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e<T> implements Comparator {
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

    public C11828a(C28205u0 localizedDateTimeFormatter, InterfaceC41070a dateAndTimeProvider, FeatureFlagChecker featureFlagChecker, C29426d imageUtils) {
        AbstractC22676k.m65750j(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(imageUtils, "imageUtils");
        this.localizedDateTimeFormatter = localizedDateTimeFormatter;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.featureFlagChecker = featureFlagChecker;
        this.imageUtils = imageUtils;
    }

    /* JADX INFO: renamed from: a */
    private final C4092p2 m31691a(TextResource content) {
        return new C4092p2(EnumC16313m0.TINY_ATTENTION_ORANGE, 0.0f, null, null, content, null, p745y81.Function1.m125323a(b.f38425w), null, p745y81.Function1.m125323a(c.f38426w), null, null, null, null, false, null, null, null, null, null, null, 1048238, null);
    }

    /* JADX INFO: renamed from: b */
    private final boolean m31692b(C27836a selectActivity, InterfaceC32865e dateWarning) {
        return selectActivity != null && AbstractC22676k.m65745e(dateWarning, InterfaceC32865e.c.f136904a);
    }

    /* JADX INFO: renamed from: c */
    private final C23254g m31693c(ActivityOverlapError overlapError) {
        StringBuilder sb4 = new StringBuilder(16);
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        sb4.append(overlapError.getMessage());
        sb4.append("\n\n");
        sb4.append(AbstractC25265s.m74110N0(overlapError.getOverlappingActivities(), "\n", null, null, null, 62));
        sb4.append("\n\n");
        sb4.append(overlapError.getResolution());
        sb4.append("\n\n");
        String string = sb4.toString();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            arrayList2.add(((C23246c) arrayList.get(i13)).m67297a(sb4.length()));
        }
        return new C23254g(string, arrayList2);
    }

    /* JADX INFO: renamed from: d */
    private final TextResource m31694d(LocalDateTime localDateTime) {
        return !AbstractC22676k.m65745e(localDateTime.toLocalDate(), this.dateAndTimeProvider.mo133365d()) ? AbstractC8693b.m21278l(localDateTime.toString("MMM d")) : AbstractC8693b.m21277k(AbstractC40203a.f173542O);
    }

    /* JADX INFO: renamed from: e */
    private final TextResource m31695e(LocalDateTime localDateTime) {
        if (!this.localizedDateTimeFormatter.m85383l()) {
            return AbstractC8693b.m21278l(C28204u.INSTANCE.m85361d(localDateTime));
        }
        return AbstractC8693b.m21278l(localDateTime.getHourOfDay() + ":" + String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(localDateTime.getMinuteOfHour())}, 1)));
    }

    /* JADX INFO: renamed from: f */
    private final C4092p2 m31696f(InterfaceC32865e dateWarning) {
        if (dateWarning instanceof InterfaceC32865e.a) {
            return m31691a(new TextResource.C8688b(AbstractC40203a.f173568y, new TextResource.AbstractC8690d.a(Integer.valueOf(((InterfaceC32865e.a) dateWarning).getMaxDuration()))));
        }
        if (AbstractC22676k.m65745e(dateWarning, InterfaceC32865e.b.f136903a)) {
            return m31691a(AbstractC8693b.m21277k(AbstractC40203a.f173550g));
        }
        if (AbstractC22676k.m65745e(dateWarning, InterfaceC32865e.d.f136905a)) {
            return m31691a(AbstractC8693b.m21277k(AbstractC40203a.f173567x));
        }
        if (AbstractC22676k.m65745e(dateWarning, InterfaceC32865e.c.f136904a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: g */
    private final InterfaceC11831d.a m31697g(C2898b domainState, C39282o selectedActivityMenuItemState, C32870j currentStrapLocation, C32864d startTimePickerState, C32864d endTimePickerState, boolean primaryButtonEnabled) {
        return new InterfaceC11831d.a(AbstractC8693b.m21277k(AbstractC40203a.f173547d), domainState.getCallToActionDisplay().length() == 0 ? AbstractC8693b.m21277k(AbstractC40203a.f173545b) : AbstractC8693b.m21278l(domainState.getCallToActionDisplay()), selectedActivityMenuItemState, AbstractC8693b.m21277k(AbstractC40203a.f173539L), AbstractC8693b.m21277k(AbstractC40203a.f173540M), currentStrapLocation, m31698h(domainState.m8473d()), startTimePickerState, endTimePickerState, EnumC32862b.EXPANDED, null, domainState.getPageType(), primaryButtonEnabled, m31696f(domainState.getInvalidDateWarning()), DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED, null);
    }

    /* JADX INFO: renamed from: h */
    private final List<C32870j> m31698h(List<C32870j> strapLocation) {
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(strapLocation);
        arrayListM74097F1.add(0, new C32870j(0, AbstractC8693b.m21277k(AbstractC40203a.f173538K)));
        return arrayListM74097F1;
    }

    /* JADX INFO: renamed from: i */
    private final C32864d m31699i(LocalDateTime editedEndTime) {
        return new C32864d(m31694d(editedEndTime), m31695e(editedEndTime), editedEndTime, editedEndTime, AbstractC8693b.m21277k(AbstractC40203a.f173564u));
    }

    /* JADX INFO: renamed from: j */
    private final C39282o m31700j(C27850m selectActivityDomainState, String activityInternalName) {
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

    /* JADX INFO: renamed from: k */
    private final C32864d m31701k(LocalDateTime editedStartTime) {
        return new C32864d(m31694d(editedStartTime), m31695e(editedStartTime), editedStartTime, editedStartTime, AbstractC8693b.m21277k(AbstractC40203a.f173537J));
    }

    /* JADX INFO: renamed from: l */
    private final List<C39282o> m31702l(List<C27836a> activityList, String selectedActivityName, EnumC26455a pageType) {
        List<C27836a> listM74152u1 = AbstractC25265s.m74152u1(AbstractC27852o.m83991j(activityList, pageType), new d());
        Iterator it = listM74152u1.iterator();
        while (it.hasNext()) {
            this.imageUtils.m89701a(((C27836a) it.next()).getIconUrl());
        }
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM74152u1, 10));
        for (C27836a c27836a : listM74152u1) {
            C39282o.Companion companion = C39282o.INSTANCE;
            boolean zM125921F = AbstractC39421y.m125921F(selectedActivityName, c27836a.getInternalName(), true);
            String internalName = c27836a.getInternalName();
            arrayList.add(companion.m125233e(AbstractC11478a.m30853e(Locale.ROOT, c27836a.getDisplayName(), "toUpperCase(...)"), (32718 & 2) != 0 ? p745y81.Function1.m125323a(C39282o.Companion.i.f169013w) : null, (32718 & 4) != 0 ? AbstractC8693b.m21267a() : null, (32718 & 8) != 0 ? p745y81.Function1.m125323a(C39282o.Companion.j.f169014w) : null, (32718 & 16) != 0 ? null : AbstractC22404p.m64503l(c27836a.getIconUrl()), (32718 & 32) == 0 ? null : null, (32718 & 64) != 0 ? AbstractC8693b.m21267a() : null, (32718 & 128) != 0 ? AbstractC8693b.m21267a() : null, (32718 & 256) != 0 ? AbstractC8693b.m21267a() : null, (32718 & 512) != 0 ? AbstractC8693b.m21267a() : null, (32718 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? p745y81.Function1.m125323a(C39282o.Companion.k.f169015w) : null, (32718 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0, (32718 & 4096) != 0 ? false : zM125921F, (32718 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? C23454a0.f92919a : internalName, (32718 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? false : false));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    private final InterfaceC11831d m31703n(C2898b domainState, C27850m searchState) {
        Object next;
        int i13 = a.f38424a[domainState.getDataState().ordinal()];
        if (i13 == 1) {
            m31702l(searchState.m83970d(), domainState.getActivityInternalName(), domainState.getPageType());
            Iterator<T> it = searchState.m83969c().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (AbstractC22676k.m65745e(((C27836a) next).getInternalName(), domainState.getActivityInternalName())) {
                    return m31697g(domainState, m31700j(searchState, domainState.getActivityInternalName()), domainState.getStrapLocation(), m31701k(domainState.getStartTimeValue()), m31699i(domainState.getEndTimeValue()), m31692b((C27836a) next, domainState.getInvalidDateWarning()));
                }
            }
            next = null;
            return m31697g(domainState, m31700j(searchState, domainState.getActivityInternalName()), domainState.getStrapLocation(), m31701k(domainState.getStartTimeValue()), m31699i(domainState.getEndTimeValue()), m31692b((C27836a) next, domainState.getInvalidDateWarning()));
        }
        if (i13 == 2) {
            return new InterfaceC11831d.a(null, null, null, null, null, null, null, null, null, EnumC32862b.COLLAPSED, null, null, false, null, 15871, null);
        }
        if (i13 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        m31702l(searchState.m83970d(), domainState.getActivityInternalName(), domainState.getPageType());
        EnumC32862b enumC32862b = EnumC32862b.EXPANDED;
        return new InterfaceC11831d.e(AbstractC8693b.m21277k(AbstractC40203a.f173532E), enumC32862b, searchState.getCom.mapbox.common.MapboxServices.SEARCH java.lang.String(), AbstractC39414r.m125890i0(searchState.getCom.mapbox.common.MapboxServices.SEARCH java.lang.String()) ? m31704o(AbstractC25265s.m74156w1(searchState.m83971e(), 5), domainState.getActivityInternalName()) : C25271y.f99162w, m31704o(AbstractC25265s.m74152u1(searchState.m83970d(), new e()), domainState.getActivityInternalName()), null, domainState.getPageType(), null, m31702l(searchState.m83970d(), domainState.getActivityInternalName(), domainState.getPageType()), this.featureFlagChecker.isFeatureEnabled("enable-cross-score-type-activity-edits") && !AbstractC39414r.m125890i0(searchState.getCom.mapbox.common.MapboxServices.SEARCH java.lang.String()), 160, null);
    }

    /* JADX INFO: renamed from: o */
    private final List<C39282o> m31704o(List<C27836a> list, String str) {
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

    /* JADX INFO: renamed from: p */
    private final InterfaceC11831d m31705p(ActivityOverlapError dialogState) {
        return new InterfaceC11831d.b(AbstractC8693b.m21278l(dialogState.getErrorTitle()), m31693c(dialogState), AbstractC8693b.m21278l(dialogState.getDismissButton()));
    }

    /* JADX INFO: renamed from: q */
    private final InterfaceC11831d m31706q() {
        return new InterfaceC11831d.c(AbstractC8693b.m21277k(AbstractC40203a.f173548e), AbstractC8693b.m21277k(AbstractC40203a.f173550g), AbstractC8693b.m21277k(AbstractC40203a.f173530C));
    }

    /* JADX INFO: renamed from: r */
    private final InterfaceC11831d m31707r() {
        return new InterfaceC11831d.c(AbstractC8693b.m21277k(AbstractC40203a.f173529B), AbstractC8693b.m21277k(AbstractC40203a.f173528A), AbstractC8693b.m21277k(AbstractC40203a.f173530C));
    }

    /* JADX INFO: renamed from: s */
    private final InterfaceC11831d m31708s(InterfaceC32868h progressDomainState) {
        if (AbstractC22676k.m65745e(progressDomainState, InterfaceC32869i.f.f136913a)) {
            return InterfaceC11831d.d.INSTANCE.m31771b();
        }
        if (progressDomainState instanceof InterfaceC32869i.h) {
            InterfaceC32869i.h hVar = (InterfaceC32869i.h) progressDomainState;
            return InterfaceC11831d.d.m31761g(InterfaceC11831d.d.INSTANCE.m31772c(), null, null, null, m31709t(hVar.getFailedAction()), null, new InterfaceC11829b.f(hVar.getErrorCloseEvent()), null, 87, null);
        }
        if (progressDomainState instanceof InterfaceC32869i.e) {
            InterfaceC32869i.e eVar = (InterfaceC32869i.e) progressDomainState;
            return InterfaceC11831d.d.m31761g(InterfaceC11831d.d.INSTANCE.m31770a(), null, null, null, m31709t(eVar.getFailedAction()), null, new InterfaceC11829b.f(eVar.getErrorCloseEvent()), null, 87, null);
        }
        if (AbstractC22676k.m65745e(progressDomainState, InterfaceC32869i.k.f136919a)) {
            return InterfaceC11831d.d.m31761g(InterfaceC11831d.d.INSTANCE.m31774e(), null, null, null, null, null, null, InterfaceC11829b.h.f38438a, 63, null);
        }
        if (AbstractC22676k.m65745e(progressDomainState, InterfaceC32869i.j.f136918a)) {
            return InterfaceC11831d.d.INSTANCE.m31773d();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: t */
    private final InterfaceC11829b.j m31709t(InterfaceC32867g interfaceC32867g) {
        if (AbstractC22676k.m65745e(interfaceC32867g, InterfaceC32867g.a.f136906a)) {
            return InterfaceC11829b.j.f38440a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC11831d m31710m(C2898b domainState, C27850m searchState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        AbstractC22676k.m65750j(searchState, "searchState");
        InterfaceC32869i screenState = domainState.getScreenState();
        if (screenState instanceof InterfaceC32868h) {
            return m31708s((InterfaceC32868h) domainState.getScreenState());
        }
        if (screenState instanceof InterfaceC32869i.a) {
            return m31705p(((InterfaceC32869i.a) domainState.getScreenState()).getActivityOverlapError());
        }
        if (AbstractC22676k.m65745e(screenState, InterfaceC32869i.d.f136910a)) {
            return m31706q();
        }
        return AbstractC22676k.m65745e(screenState, InterfaceC32869i.i.f136917a) ? m31707r() : m31703n(domainState, searchState);
    }
}
