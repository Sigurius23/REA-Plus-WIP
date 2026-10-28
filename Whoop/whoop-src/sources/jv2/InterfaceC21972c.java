package jv2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cu2.AbstractC11128h;
import d13.AbstractC11478a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import kd1.AbstractC22403o;
import o11.AbstractC27407m;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p736sz0.AbstractC33208p0;
import p736sz0.C33210q;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: jv2.c */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Ljv2/c;", "", "a", "b", "Ljv2/c$a;", "Ljv2/c$b;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC21972c {

    /* JADX INFO: renamed from: jv2.c$b */
    @Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b'\u0010&R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b\u001f\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b*\u0010-R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b+\u0010&R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00028\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b.\u0010\"R\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b#\u0010&¨\u0006/"}, m65681d2 = {"Ljv2/c$b;", "Ljv2/c;", "", "Lo11/m$c$a;", "exerciseTileList", "Lcom/whoop/design/util/TextResource;", "toolbarTitle", "screenTitle", "screenSubTitle", "description", "Lkd1/o;", "screenBackgroundImage", "screenCtaText", "Lsz0/q;", "horizontalStats", "Ljv2/e;", "workoutMetaDataList", "exerciseListTitle", "<init>", "(Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Lcom/whoop/design/util/TextResource;", "i", "()Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "d", "g", "e", "f", "Lkd1/o;", "()Lkd1/o;", "j", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC21972c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<AbstractC27407m.c.a> exerciseTileList;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource toolbarTitle;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource screenTitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource screenSubTitle;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource description;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final AbstractC22403o screenBackgroundImage;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final TextResource screenCtaText;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final List<C33210q> horizontalStats;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final List<C21974e> workoutMetaDataList;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final TextResource exerciseListTitle;

        public b(List<AbstractC27407m.c.a> exerciseTileList, TextResource toolbarTitle, TextResource screenTitle, TextResource screenSubTitle, TextResource description, AbstractC22403o screenBackgroundImage, TextResource screenCtaText, List<C33210q> horizontalStats, List<C21974e> workoutMetaDataList, TextResource exerciseListTitle) {
            AbstractC22676k.m65750j(exerciseTileList, "exerciseTileList");
            AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
            AbstractC22676k.m65750j(screenTitle, "screenTitle");
            AbstractC22676k.m65750j(screenSubTitle, "screenSubTitle");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(screenBackgroundImage, "screenBackgroundImage");
            AbstractC22676k.m65750j(screenCtaText, "screenCtaText");
            AbstractC22676k.m65750j(horizontalStats, "horizontalStats");
            AbstractC22676k.m65750j(workoutMetaDataList, "workoutMetaDataList");
            AbstractC22676k.m65750j(exerciseListTitle, "exerciseListTitle");
            this.exerciseTileList = exerciseTileList;
            this.toolbarTitle = toolbarTitle;
            this.screenTitle = screenTitle;
            this.screenSubTitle = screenSubTitle;
            this.description = description;
            this.screenBackgroundImage = screenBackgroundImage;
            this.screenCtaText = screenCtaText;
            this.horizontalStats = horizontalStats;
            this.workoutMetaDataList = workoutMetaDataList;
            this.exerciseListTitle = exerciseListTitle;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getExerciseListTitle() {
            return this.exerciseListTitle;
        }

        /* JADX INFO: renamed from: c */
        public final List<AbstractC27407m.c.a> m62730c() {
            return this.exerciseTileList;
        }

        /* JADX INFO: renamed from: d */
        public final List<C33210q> m62731d() {
            return this.horizontalStats;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final AbstractC22403o getScreenBackgroundImage() {
            return this.screenBackgroundImage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.exerciseTileList, bVar.exerciseTileList) && AbstractC22676k.m65745e(this.toolbarTitle, bVar.toolbarTitle) && AbstractC22676k.m65745e(this.screenTitle, bVar.screenTitle) && AbstractC22676k.m65745e(this.screenSubTitle, bVar.screenSubTitle) && AbstractC22676k.m65745e(this.description, bVar.description) && AbstractC22676k.m65745e(this.screenBackgroundImage, bVar.screenBackgroundImage) && AbstractC22676k.m65745e(this.screenCtaText, bVar.screenCtaText) && AbstractC22676k.m65745e(this.horizontalStats, bVar.horizontalStats) && AbstractC22676k.m65745e(this.workoutMetaDataList, bVar.workoutMetaDataList) && AbstractC22676k.m65745e(this.exerciseListTitle, bVar.exerciseListTitle);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextResource getScreenCtaText() {
            return this.screenCtaText;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final TextResource getScreenSubTitle() {
            return this.screenSubTitle;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final TextResource getScreenTitle() {
            return this.screenTitle;
        }

        public int hashCode() {
            return this.exerciseListTitle.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC31061c.m95625a(AbstractC30007c.m91833c(this.screenBackgroundImage, AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.exerciseTileList.hashCode() * 31, this.toolbarTitle, 31), this.screenTitle, 31), this.screenSubTitle, 31), this.description, 31), 31), this.screenCtaText, 31), 31, this.horizontalStats), 31, this.workoutMetaDataList);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final TextResource getToolbarTitle() {
            return this.toolbarTitle;
        }

        /* JADX INFO: renamed from: j */
        public final List<C21974e> m62737j() {
            return this.workoutMetaDataList;
        }

        public String toString() {
            List<AbstractC27407m.c.a> list = this.exerciseTileList;
            TextResource textResource = this.toolbarTitle;
            TextResource textResource2 = this.screenTitle;
            TextResource textResource3 = this.screenSubTitle;
            TextResource textResource4 = this.description;
            AbstractC22403o abstractC22403o = this.screenBackgroundImage;
            TextResource textResource5 = this.screenCtaText;
            List<C33210q> list2 = this.horizontalStats;
            List<C21974e> list3 = this.workoutMetaDataList;
            TextResource textResource6 = this.exerciseListTitle;
            StringBuilder sb4 = new StringBuilder("Loaded(exerciseTileList=");
            sb4.append(list);
            sb4.append(", toolbarTitle=");
            sb4.append(textResource);
            sb4.append(", screenTitle=");
            AbstractC30007c.m91855y(sb4, textResource2, ", screenSubTitle=", textResource3, ", description=");
            sb4.append(textResource4);
            sb4.append(", screenBackgroundImage=");
            sb4.append(abstractC22403o);
            sb4.append(", screenCtaText=");
            AbstractC21702c.m61143n(textResource5, ", horizontalStats=", ", workoutMetaDataList=", sb4, list2);
            sb4.append(list3);
            sb4.append(", exerciseListTitle=");
            sb4.append(textResource6);
            sb4.append(")");
            return sb4.toString();
        }
    }

    /* JADX INFO: renamed from: jv2.c$a */
    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001\u0018B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ:\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Ljv2/c$a;", "Ljv2/c;", "Lsz0/p0;", "type", "Lcom/whoop/design/util/TextResource;", "supportText", "primaryButtonText", "Ljv2/a;", "buttonClickEvent", "<init>", "(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljv2/a;)V", "d", "(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljv2/a;)Ljv2/c$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/p0;", "i", "()Lsz0/p0;", "b", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/util/TextResource;", "c", "g", "Ljv2/a;", "f", "()Ljv2/a;", "e", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC21972c {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: f */
        public static final int f85081f = TextResource.$stable | AbstractC33208p0.f138461d;

        /* JADX INFO: renamed from: g */
        private static final a f85082g = new a(AbstractC33208p0.c.f138471e, null, null, null, 14, null);

        /* JADX INFO: renamed from: h */
        private static final a f85083h;

        /* JADX INFO: renamed from: i */
        private static final a f85084i;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC33208p0 type;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource supportText;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource primaryButtonText;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC21970a buttonClickEvent;

        /* JADX INFO: renamed from: jv2.c$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, m65681d2 = {"Ljv2/c$a$a;", "", "<init>", "()V", "Ljv2/c$a;", "loading", "Ljv2/c$a;", "a", "()Ljv2/c$a;", "networkError", "b", "serverError", "c", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final a m62725a() {
                return a.f85082g;
            }

            /* JADX INFO: renamed from: b */
            public final a m62726b() {
                return a.f85083h;
            }

            /* JADX INFO: renamed from: c */
            public final a m62727c() {
                return a.f85084i;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            f85083h = new a(new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC11128h.f35473h1), false, null, 6, defaultConstructorMarker), null, AbstractC8693b.m21277k(AbstractC11128h.f35409N), 0 == true ? 1 : 0, 10, defaultConstructorMarker);
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            f85084i = new a(new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC11128h.f35506s1), false, null, 6, defaultConstructorMarker2), null, AbstractC8693b.m21277k(AbstractC11128h.f35409N), 0 == true ? 1 : 0, 10, defaultConstructorMarker2);
        }

        public a(AbstractC33208p0 type, TextResource supportText, TextResource primaryButtonText, InterfaceC21970a interfaceC21970a) {
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(supportText, "supportText");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            this.type = type;
            this.supportText = supportText;
            this.primaryButtonText = primaryButtonText;
            this.buttonClickEvent = interfaceC21970a;
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ a m62719e(a aVar, AbstractC33208p0 abstractC33208p0, TextResource textResource, TextResource textResource2, InterfaceC21970a interfaceC21970a, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                abstractC33208p0 = aVar.type;
            }
            if ((i13 & 2) != 0) {
                textResource = aVar.supportText;
            }
            if ((i13 & 4) != 0) {
                textResource2 = aVar.primaryButtonText;
            }
            if ((i13 & 8) != 0) {
                interfaceC21970a = aVar.buttonClickEvent;
            }
            return aVar.m62720d(abstractC33208p0, textResource, textResource2, interfaceC21970a);
        }

        /* JADX INFO: renamed from: d */
        public final a m62720d(AbstractC33208p0 type, TextResource supportText, TextResource primaryButtonText, InterfaceC21970a buttonClickEvent) {
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(supportText, "supportText");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            return new a(type, supportText, primaryButtonText, buttonClickEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.type, aVar.type) && AbstractC22676k.m65745e(this.supportText, aVar.supportText) && AbstractC22676k.m65745e(this.primaryButtonText, aVar.primaryButtonText) && AbstractC22676k.m65745e(this.buttonClickEvent, aVar.buttonClickEvent);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final InterfaceC21970a getButtonClickEvent() {
            return this.buttonClickEvent;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final TextResource getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final TextResource getSupportText() {
            return this.supportText;
        }

        public int hashCode() {
            int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.type.hashCode() * 31, this.supportText, 31), this.primaryButtonText, 31);
            InterfaceC21970a interfaceC21970a = this.buttonClickEvent;
            return iM95625a + (interfaceC21970a == null ? 0 : interfaceC21970a.hashCode());
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final AbstractC33208p0 getType() {
            return this.type;
        }

        public String toString() {
            AbstractC33208p0 abstractC33208p0 = this.type;
            TextResource textResource = this.supportText;
            TextResource textResource2 = this.primaryButtonText;
            InterfaceC21970a interfaceC21970a = this.buttonClickEvent;
            StringBuilder sbM30862n = AbstractC11478a.m30862n("FullScreenModal(type=", abstractC33208p0, ", supportText=", textResource, ", primaryButtonText=");
            sbM30862n.append(textResource2);
            sbM30862n.append(", buttonClickEvent=");
            sbM30862n.append(interfaceC21970a);
            sbM30862n.append(")");
            return sbM30862n.toString();
        }

        public /* synthetic */ a(AbstractC33208p0 abstractC33208p0, TextResource textResource, TextResource textResource2, InterfaceC21970a interfaceC21970a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractC33208p0, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 8) != 0 ? null : interfaceC21970a);
        }
    }
}
