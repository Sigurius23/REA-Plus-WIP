package xu2;

import c13.AbstractC3855a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cu2.AbstractC11128h;
import hu2.C17659f;
import hu2.InterfaceC17655b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;

/* JADX INFO: renamed from: xu2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0005\u0007\u000b\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0006X\u0086D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0019\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0011\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001cR\u0014\u0010#\u001a\u00020!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\"\u0082\u0001\u0004$%&'¨\u0006("}, m65681d2 = {"Lxu2/b;", "", "<init>", "()V", "Ly81/e;", "a", "Ly81/e;", "d", "()Ly81/e;", "primaryActionColor", "Lcom/whoop/design/util/TextResource$b;", "b", "Lcom/whoop/design/util/TextResource$b;", "f", "()Lcom/whoop/design/util/TextResource$b;", "secondaryActionText", "", "c", "Z", "g", "()Z", "showCloseIcon", "Lhu2/b$b;", "Lhu2/b$b;", "()Lhu2/b$b;", "dismissEvent", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/util/TextResource;", "title", "description", "e", "primaryActionText", "Lhu2/b;", "()Lhu2/b;", "approveEvent", "Lxu2/b$a;", "Lxu2/b$b;", "Lxu2/b$c;", "Lxu2/b$d;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38656b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC39332e primaryActionColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource.C8688b secondaryActionText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean showCloseIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC17655b.b dismissEvent;

    /* JADX INFO: renamed from: xu2.b$a */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\u000bR\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u001a\u0010!\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001aR\u001a\u0010%\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b\u001f\u0010$¨\u0006&"}, m65681d2 = {"Lxu2/b$a;", "Lxu2/b;", "", "groupIndex", "exerciseIndex", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "I", "getGroupIndex", "f", "getExerciseIndex", "Lcom/whoop/design/util/TextResource$b;", "g", "Lcom/whoop/design/util/TextResource$b;", "l", "()Lcom/whoop/design/util/TextResource$b;", "title", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "j", "description", "i", "k", "primaryActionText", "Lhu2/f;", "Lhu2/f;", "()Lhu2/f;", "approveEvent", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC38656b {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final int groupIndex;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final int exerciseIndex;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final TextResource.C8688b title;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final TextResource.C8688b description;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final TextResource.C8688b primaryActionText;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final C17659f approveEvent;

        public a(int i13, int i14) {
            super(null);
            this.groupIndex = i13;
            this.exerciseIndex = i14;
            this.title = AbstractC8693b.m21277k(AbstractC11128h.f35471h);
            this.description = AbstractC8693b.m21277k(AbstractC11128h.f35468g);
            this.primaryActionText = AbstractC8693b.m21277k(AbstractC11128h.f35496p0);
            this.approveEvent = new C17659f(i13, i14);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.groupIndex == aVar.groupIndex && this.exerciseIndex == aVar.exerciseIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.exerciseIndex) + (Integer.hashCode(this.groupIndex) * 31);
        }

        @Override // xu2.AbstractC38656b
        /* JADX INFO: renamed from: i, reason: from getter and merged with bridge method [inline-methods] */
        public C17659f mo123922a() {
            return this.approveEvent;
        }

        @Override // xu2.AbstractC38656b
        /* JADX INFO: renamed from: j, reason: from getter and merged with bridge method [inline-methods] */
        public TextResource.C8688b mo123923b() {
            return this.description;
        }

        @Override // xu2.AbstractC38656b
        /* JADX INFO: renamed from: k, reason: from getter and merged with bridge method [inline-methods] */
        public TextResource.C8688b mo123926e() {
            return this.primaryActionText;
        }

        @Override // xu2.AbstractC38656b
        /* JADX INFO: renamed from: l, reason: from getter and merged with bridge method [inline-methods] */
        public TextResource.C8688b mo123929h() {
            return this.title;
        }

        public String toString() {
            return AbstractC25012a.m73372e(this.groupIndex, this.exerciseIndex, "DeleteExercise(groupIndex=", ", exerciseIndex=", ")");
        }
    }

    /* JADX INFO: renamed from: xu2.b$b */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0003\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u001a\u0010#\u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006$"}, m65681d2 = {"Lxu2/b$b;", "Lxu2/b;", "", "isFromWhoopCoach", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "e", "Z", "()Z", "Lcom/whoop/design/util/TextResource$b;", "f", "Lcom/whoop/design/util/TextResource$b;", "l", "()Lcom/whoop/design/util/TextResource$b;", "title", "g", "j", "description", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "k", "primaryActionText", "Lhu2/b$f;", "i", "Lhu2/b$f;", "()Lhu2/b$f;", "approveEvent", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC38656b {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean isFromWhoopCoach;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final TextResource.C8688b title;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final TextResource.C8688b description;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final TextResource.C8688b primaryActionText;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final InterfaceC17655b.f approveEvent;

        public b(boolean z4) {
            super(null);
            this.isFromWhoopCoach = z4;
            this.title = AbstractC8693b.m21277k(AbstractC11128h.f35377C0);
            this.description = AbstractC8693b.m21277k(AbstractC11128h.f35383E0);
            this.primaryActionText = AbstractC8693b.m21277k(AbstractC11128h.f35415P);
            this.approveEvent = z4 ? InterfaceC17655b.d.f68494w : InterfaceC17655b.c.f68493w;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && this.isFromWhoopCoach == ((b) other).isFromWhoopCoach;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isFromWhoopCoach);
        }

        @Override // xu2.AbstractC38656b
        /* JADX INFO: renamed from: i, reason: from getter and merged with bridge method [inline-methods] */
        public InterfaceC17655b.f mo123922a() {
            return this.approveEvent;
        }

        @Override // xu2.AbstractC38656b
        /* JADX INFO: renamed from: j, reason: from getter and merged with bridge method [inline-methods] */
        public TextResource.C8688b mo123923b() {
            return this.description;
        }

        @Override // xu2.AbstractC38656b
        /* JADX INFO: renamed from: k, reason: from getter and merged with bridge method [inline-methods] */
        public TextResource.C8688b mo123926e() {
            return this.primaryActionText;
        }

        @Override // xu2.AbstractC38656b
        /* JADX INFO: renamed from: l, reason: from getter and merged with bridge method [inline-methods] */
        public TextResource.C8688b mo123929h() {
            return this.title;
        }

        public String toString() {
            return AbstractC3855a.m11827k("DiscardWorkout(isFromWhoopCoach=", ")", this.isFromWhoopCoach);
        }
    }

    /* JADX INFO: renamed from: xu2.b$c */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0011\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lxu2/b$c;", "Lxu2/b;", "<init>", "()V", "Lcom/whoop/design/util/TextResource$b;", "f", "Lcom/whoop/design/util/TextResource$b;", "m", "()Lcom/whoop/design/util/TextResource$b;", "title", "g", "j", "description", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "l", "primaryActionText", "Ly81/f;", "i", "Ly81/f;", "k", "()Ly81/f;", "primaryActionColor", "Lhu2/b$l;", "Lhu2/b$l;", "()Lhu2/b$l;", "approveEvent", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC38656b {

        /* JADX INFO: renamed from: e */
        public static final c f166335e = new c();

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private static final TextResource.C8688b title = AbstractC8693b.m21277k(AbstractC11128h.f35507t);

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private static final TextResource.C8688b description = AbstractC8693b.m21277k(AbstractC11128h.f35504s);

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private static final TextResource.C8688b primaryActionText = AbstractC8693b.m21277k(AbstractC11128h.f35427T);

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private static final EnumC39333f primaryActionColor = EnumC39333f.ACCENT_ACTION;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private static final InterfaceC17655b.l approveEvent = InterfaceC17655b.l.f68507w;

        /* JADX INFO: renamed from: k */
        public static final int f166341k = 8;

        private c() {
            super(null);
        }

        @Override // xu2.AbstractC38656b
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public InterfaceC17655b.l mo123922a() {
            return approveEvent;
        }

        @Override // xu2.AbstractC38656b
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public TextResource.C8688b mo123923b() {
            return description;
        }

        @Override // xu2.AbstractC38656b
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public EnumC39333f getPrimaryActionColor() {
            return primaryActionColor;
        }

        @Override // xu2.AbstractC38656b
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public TextResource.C8688b mo123926e() {
            return primaryActionText;
        }

        @Override // xu2.AbstractC38656b
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public TextResource.C8688b mo123929h() {
            return title;
        }
    }

    /* JADX INFO: renamed from: xu2.b$d */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u0014\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lxu2/b$d;", "Lxu2/b;", "<init>", "()V", "Lcom/whoop/design/util/TextResource$b;", "f", "Lcom/whoop/design/util/TextResource$b;", "l", "()Lcom/whoop/design/util/TextResource$b;", "title", "g", "j", "description", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "k", "primaryActionText", "Lhu2/b$c;", "i", "Lhu2/b$c;", "()Lhu2/b$c;", "approveEvent", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC38656b {

        /* JADX INFO: renamed from: e */
        public static final d f166342e = new d();

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private static final TextResource.C8688b title = AbstractC8693b.m21277k(AbstractC11128h.f35406M);

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private static final TextResource.C8688b description = AbstractC8693b.m21277k(AbstractC11128h.f35403L);

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private static final TextResource.C8688b primaryActionText = AbstractC8693b.m21277k(AbstractC11128h.f35418Q);

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private static final InterfaceC17655b.c approveEvent = InterfaceC17655b.c.f68493w;

        /* JADX INFO: renamed from: j */
        public static final int f166347j = 8;

        private d() {
            super(null);
        }

        @Override // xu2.AbstractC38656b
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public InterfaceC17655b.c mo123922a() {
            return approveEvent;
        }

        @Override // xu2.AbstractC38656b
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public TextResource.C8688b mo123923b() {
            return description;
        }

        @Override // xu2.AbstractC38656b
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public TextResource.C8688b mo123926e() {
            return primaryActionText;
        }

        @Override // xu2.AbstractC38656b
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public TextResource.C8688b mo123929h() {
            return title;
        }
    }

    public /* synthetic */ AbstractC38656b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract InterfaceC17655b mo123922a();

    /* JADX INFO: renamed from: b */
    public abstract TextResource mo123923b();

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC17655b.b getDismissEvent() {
        return this.dismissEvent;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public InterfaceC39332e getPrimaryActionColor() {
        return this.primaryActionColor;
    }

    /* JADX INFO: renamed from: e */
    public abstract TextResource mo123926e();

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource.C8688b getSecondaryActionText() {
        return this.secondaryActionText;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getShowCloseIcon() {
        return this.showCloseIcon;
    }

    /* JADX INFO: renamed from: h */
    public abstract TextResource mo123929h();

    private AbstractC38656b() {
        this.primaryActionColor = EnumC39333f.ACCENT_ALERT;
        this.secondaryActionText = AbstractC8693b.m21277k(AbstractC11128h.f35453b0);
        this.dismissEvent = InterfaceC17655b.b.f68492w;
    }
}
