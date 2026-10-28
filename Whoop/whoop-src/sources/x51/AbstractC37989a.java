package x51;

import androidx.core.app.NotificationCompat;
import c13.AbstractC3855a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gy0.AbstractC16277f;
import gz0.AbstractC16319p0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.EnumC22400l;
import l83.C23454a0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import y00.AbstractC38963t7;
import y71.C39274g;

/* JADX INFO: renamed from: x51.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0017#\u001a\u0014\u001e\u001c\u0010$B?\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0010\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0017\u0010 R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\u001e\u0010\"\u0082\u0001\b%&'()*+,¨\u0006-"}, m65681d2 = {"Lx51/a;", "Lm91/u;", "", NotificationCompat.CATEGORY_EVENT, "Ly71/g;", "icon", "Lcom/whoop/design/util/TextResource;", "displayText", "", "isGlowing", "", "testTag", "Lkd1/l;", "type", "<init>", "(Ljava/lang/Object;Ly71/g;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;Lkd1/l;)V", "a", "Ljava/lang/Object;", "getEvent", "()Ljava/lang/Object;", "b", "Ly71/g;", "()Ly71/g;", "c", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "d", "Z", "f", "()Z", "e", "Ljava/lang/String;", "()Ljava/lang/String;", "Lkd1/l;", "()Lkd1/l;", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lx51/a$a;", "Lx51/a$b;", "Lx51/a$c;", "Lx51/a$d;", "Lx51/a$e;", "Lx51/a$f;", "Lx51/a$g;", "Lx51/a$h;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37989a implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object event;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C39274g icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource displayText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isGlowing;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String testTag;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC22400l type;

    /* JADX INFO: renamed from: x51.a$a */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lx51/a$a;", "Lx51/a;", "", "setToGlow", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "g", "Z", "getSetToGlow", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC37989a {

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final boolean setToGlow;

        public /* synthetic */ a(boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? false : z4);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.setToGlow == ((a) other).setToGlow;
        }

        public int hashCode() {
            return Boolean.hashCode(this.setToGlow);
        }

        public String toString() {
            return AbstractC3855a.m11827k("Action(setToGlow=", ")", this.setToGlow);
        }

        public a(boolean z4) {
            super(null, new C39274g(AbstractC16319p0.m46430a().getAction().getAdd(), AbstractC8693b.m21278l("")), null, z4, "ActionFab", EnumC22400l.ADD_ACTIVITY, 5, null);
            this.setToGlow = z4;
        }
    }

    /* JADX INFO: renamed from: x51.a$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lx51/a$b;", "Lx51/a;", "<init>", "()V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC37989a {

        /* JADX INFO: renamed from: g */
        public static final b f162712g = new b();

        /* JADX INFO: renamed from: h */
        public static final int f162713h = 8;

        private b() {
            super(null, new C39274g(AbstractC16319p0.m46430a().getAction().getAdd(), new TextResource.C8688b(AbstractC16277f.f62330h, null, 2, null)), new TextResource.C8688b(AbstractC16277f.f62375s0, null, 2, null), false, "AddActivityFab", EnumC22400l.ADD_ACTIVITY, 9, null);
        }
    }

    /* JADX INFO: renamed from: x51.a$c */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u000fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, m65681d2 = {"Lx51/a$c;", "Lx51/a;", "Ly71/g;", "genericIcon", "Lcom/whoop/design/util/TextResource;", "genericDisplayText", "", "genericIsGlowing", "", "genericTestTag", "Lkd1/l;", "genericType", "<init>", "(Ly71/g;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;Lkd1/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "g", "Ly71/g;", "getGenericIcon", "()Ly71/g;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/design/util/TextResource;", "getGenericDisplayText", "()Lcom/whoop/design/util/TextResource;", "i", "Z", "getGenericIsGlowing", "()Z", "j", "Ljava/lang/String;", "getGenericTestTag", "k", "Lkd1/l;", "getGenericType", "()Lkd1/l;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC37989a {

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final C39274g genericIcon;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final TextResource genericDisplayText;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final boolean genericIsGlowing;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final String genericTestTag;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final EnumC22400l genericType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C39274g genericIcon, TextResource genericDisplayText, boolean z4, String genericTestTag, EnumC22400l genericType) {
            super(null, genericIcon, genericDisplayText, z4, genericTestTag, genericType, 1, null);
            AbstractC22676k.m65750j(genericIcon, "genericIcon");
            AbstractC22676k.m65750j(genericDisplayText, "genericDisplayText");
            AbstractC22676k.m65750j(genericTestTag, "genericTestTag");
            AbstractC22676k.m65750j(genericType, "genericType");
            this.genericIcon = genericIcon;
            this.genericDisplayText = genericDisplayText;
            this.genericIsGlowing = z4;
            this.genericTestTag = genericTestTag;
            this.genericType = genericType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.genericIcon, cVar.genericIcon) && AbstractC22676k.m65745e(this.genericDisplayText, cVar.genericDisplayText) && this.genericIsGlowing == cVar.genericIsGlowing && AbstractC22676k.m65745e(this.genericTestTag, cVar.genericTestTag) && this.genericType == cVar.genericType;
        }

        public int hashCode() {
            return this.genericType.hashCode() + AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC31061c.m95625a(this.genericIcon.hashCode() * 31, this.genericDisplayText, 31), 31, this.genericIsGlowing), 31, this.genericTestTag);
        }

        public String toString() {
            C39274g c39274g = this.genericIcon;
            TextResource textResource = this.genericDisplayText;
            boolean z4 = this.genericIsGlowing;
            String str = this.genericTestTag;
            EnumC22400l enumC22400l = this.genericType;
            StringBuilder sb4 = new StringBuilder("BackendFabItem(genericIcon=");
            sb4.append(c39274g);
            sb4.append(", genericDisplayText=");
            sb4.append(textResource);
            sb4.append(", genericIsGlowing=");
            AbstractC38963t7.m124391u(sb4, z4, ", genericTestTag=", str, ", genericType=");
            sb4.append(enumC22400l);
            sb4.append(")");
            return sb4.toString();
        }
    }

    /* JADX INFO: renamed from: x51.a$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lx51/a$d;", "Lx51/a;", "<init>", "()V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC37989a {

        /* JADX INFO: renamed from: g */
        public static final d f162719g = new d();

        /* JADX INFO: renamed from: h */
        public static final int f162720h = 8;

        private d() {
            super(null, new C39274g(AbstractC16319p0.m46430a().getAction().getJournal(), new TextResource.C8688b(AbstractC16277f.f62334i, null, 2, null)), new TextResource.C8688b(AbstractC16277f.f62387v0, null, 2, null), false, "JournalFab", EnumC22400l.JOURNAL, 9, null);
        }
    }

    /* JADX INFO: renamed from: x51.a$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lx51/a$e;", "Lx51/a;", "<init>", "()V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC37989a {

        /* JADX INFO: renamed from: g */
        public static final e f162721g = new e();

        /* JADX INFO: renamed from: h */
        public static final int f162722h = 8;

        private e() {
            super(null, new C39274g(AbstractC16319p0.m46430a().getAction().getStartActivity(), new TextResource.C8688b(AbstractC16277f.f62338j, null, 2, null)), new TextResource.C8688b(AbstractC16277f.f62391w0, null, 2, null), false, "StartActivityFab", EnumC22400l.START_ACTIVITY, 9, null);
        }
    }

    /* JADX INFO: renamed from: x51.a$f */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lx51/a$f;", "Lx51/a;", "<init>", "()V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC37989a {

        /* JADX INFO: renamed from: g */
        public static final f f162723g = new f();

        /* JADX INFO: renamed from: h */
        public static final int f162724h = 8;

        private f() {
            super(null, new C39274g(AbstractC16319p0.m46430a().getAction().getStartActivity(), AbstractC8693b.m21278l("START ACTIVITY REVAMP")), AbstractC8693b.m21278l("START ACTIVITY REVAMP"), false, "StartActivityRevampFab", EnumC22400l.START_ACTIVITY_REVAMP, 9, null);
        }
    }

    /* JADX INFO: renamed from: x51.a$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lx51/a$g;", "Lx51/a;", "<init>", "()V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC37989a {

        /* JADX INFO: renamed from: g */
        public static final g f162725g = new g();

        /* JADX INFO: renamed from: h */
        public static final int f162726h = 8;

        private g() {
            super(null, new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getCamera(), new TextResource.C8688b(AbstractC16277f.f62342k, null, 2, null)), new TextResource.C8688b(AbstractC16277f.f62383u0, null, 2, null), false, "WhoopLiveFab", EnumC22400l.WHOOP_LIVE, 9, null);
        }
    }

    /* JADX INFO: renamed from: x51.a$h */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lx51/a$h;", "Lx51/a;", "<init>", "()V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC37989a {

        /* JADX INFO: renamed from: g */
        public static final h f162727g = new h();

        /* JADX INFO: renamed from: h */
        public static final int f162728h = 8;

        private h() {
            super(null, new C39274g(AbstractC16319p0.m46430a().getActivities().getWeightlifting(), AbstractC8693b.m21278l("")), new TextResource.C8688b(AbstractC16277f.f62395x0, null, 2, null), false, "WorkoutLibraryTag", EnumC22400l.STRENGTH_BUILDER, 9, null);
        }
    }

    public /* synthetic */ AbstractC37989a(Object obj, C39274g c39274g, TextResource textResource, boolean z4, String str, EnumC22400l enumC22400l, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, c39274g, textResource, z4, str, enumC22400l);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getDisplayText() {
        return this.displayText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C39274g getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTestTag() {
        return this.testTag;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC22400l getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsGlowing() {
        return this.isGlowing;
    }

    private AbstractC37989a(Object obj, C39274g c39274g, TextResource textResource, boolean z4, String str, EnumC22400l enumC22400l) {
        this.event = obj;
        this.icon = c39274g;
        this.displayText = textResource;
        this.isGlowing = z4;
        this.testTag = str;
        this.type = enumC22400l;
    }

    public /* synthetic */ AbstractC37989a(Object obj, C39274g c39274g, TextResource textResource, boolean z4, String str, EnumC22400l enumC22400l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C23454a0.f92919a : obj, c39274g, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 8) != 0 ? false : z4, str, enumC22400l, null);
    }
}
