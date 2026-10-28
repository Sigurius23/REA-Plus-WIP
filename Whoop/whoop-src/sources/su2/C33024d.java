package su2;

import com.whoop.design.util.TextResource;
import com.whoop.weightlifting.data.domain.StrapLaterality;
import com.whoop.weightlifting.data.domain.StrapLocation;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import ru2.InterfaceC31820a;

/* JADX INFO: renamed from: su2.d */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001\u0018B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ<\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, m65681d2 = {"Lsu2/d;", "", "Lcom/whoop/weightlifting/data/domain/StrapLaterality;", "selectedStrapLaterality", "Lcom/whoop/weightlifting/data/domain/StrapLocation;", "selectedStrapLocation", "Lsu2/a;", "asyncProcessStarted", "Lru2/a;", "navigationEvent", "<init>", "(Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lsu2/a;Lru2/a;)V", "d", "(Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lsu2/a;Lru2/a;)Lsu2/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/weightlifting/data/domain/StrapLaterality;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/weightlifting/data/domain/StrapLaterality;", "b", "Lcom/whoop/weightlifting/data/domain/StrapLocation;", "i", "()Lcom/whoop/weightlifting/data/domain/StrapLocation;", "c", "Lsu2/a;", "f", "()Lsu2/a;", "Lru2/a;", "g", "()Lru2/a;", "e", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33024d {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    public static final int f137551f = TextResource.$stable;

    /* JADX INFO: renamed from: g */
    private static final C33024d f137552g;

    /* JADX INFO: renamed from: h */
    private static final C33024d f137553h;

    /* JADX INFO: renamed from: i */
    private static final C33024d f137554i;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final StrapLaterality selectedStrapLaterality;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final StrapLocation selectedStrapLocation;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C33021a asyncProcessStarted;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC31820a navigationEvent;

    /* JADX INFO: renamed from: su2.d$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, m65681d2 = {"Lsu2/d$a;", "", "<init>", "()V", "Lsu2/d;", "leftWristSelected", "Lsu2/d;", "b", "()Lsu2/d;", "rightWristSelected", "c", "initial", "a", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C33024d m104292a() {
            return C33024d.f137554i;
        }

        /* JADX INFO: renamed from: b */
        public final C33024d m104293b() {
            return C33024d.f137552g;
        }

        /* JADX INFO: renamed from: c */
        public final C33024d m104294c() {
            return C33024d.f137553h;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        StrapLaterality strapLaterality = StrapLaterality.Left;
        StrapLocation strapLocation = StrapLocation.Wrist;
        C33024d c33024d = new C33024d(strapLaterality, strapLocation, null, null, 12, null);
        f137552g = c33024d;
        f137553h = new C33024d(StrapLaterality.Right, strapLocation, null, 0 == true ? 1 : 0, 12, null);
        f137554i = c33024d;
    }

    public C33024d(StrapLaterality selectedStrapLaterality, StrapLocation selectedStrapLocation, C33021a c33021a, InterfaceC31820a interfaceC31820a) {
        AbstractC22676k.m65750j(selectedStrapLaterality, "selectedStrapLaterality");
        AbstractC22676k.m65750j(selectedStrapLocation, "selectedStrapLocation");
        this.selectedStrapLaterality = selectedStrapLaterality;
        this.selectedStrapLocation = selectedStrapLocation;
        this.asyncProcessStarted = c33021a;
        this.navigationEvent = interfaceC31820a;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C33024d m104286e(C33024d c33024d, StrapLaterality strapLaterality, StrapLocation strapLocation, C33021a c33021a, InterfaceC31820a interfaceC31820a, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            strapLaterality = c33024d.selectedStrapLaterality;
        }
        if ((i13 & 2) != 0) {
            strapLocation = c33024d.selectedStrapLocation;
        }
        if ((i13 & 4) != 0) {
            c33021a = c33024d.asyncProcessStarted;
        }
        if ((i13 & 8) != 0) {
            interfaceC31820a = c33024d.navigationEvent;
        }
        return c33024d.m104287d(strapLaterality, strapLocation, c33021a, interfaceC31820a);
    }

    /* JADX INFO: renamed from: d */
    public final C33024d m104287d(StrapLaterality selectedStrapLaterality, StrapLocation selectedStrapLocation, C33021a asyncProcessStarted, InterfaceC31820a navigationEvent) {
        AbstractC22676k.m65750j(selectedStrapLaterality, "selectedStrapLaterality");
        AbstractC22676k.m65750j(selectedStrapLocation, "selectedStrapLocation");
        return new C33024d(selectedStrapLaterality, selectedStrapLocation, asyncProcessStarted, navigationEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33024d)) {
            return false;
        }
        C33024d c33024d = (C33024d) other;
        return this.selectedStrapLaterality == c33024d.selectedStrapLaterality && this.selectedStrapLocation == c33024d.selectedStrapLocation && AbstractC22676k.m65745e(this.asyncProcessStarted, c33024d.asyncProcessStarted) && AbstractC22676k.m65745e(this.navigationEvent, c33024d.navigationEvent);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C33021a getAsyncProcessStarted() {
        return this.asyncProcessStarted;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final InterfaceC31820a getNavigationEvent() {
        return this.navigationEvent;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final StrapLaterality getSelectedStrapLaterality() {
        return this.selectedStrapLaterality;
    }

    public int hashCode() {
        int iHashCode = (this.selectedStrapLocation.hashCode() + (this.selectedStrapLaterality.hashCode() * 31)) * 31;
        C33021a c33021a = this.asyncProcessStarted;
        int iHashCode2 = (iHashCode + (c33021a == null ? 0 : c33021a.hashCode())) * 31;
        InterfaceC31820a interfaceC31820a = this.navigationEvent;
        return iHashCode2 + (interfaceC31820a != null ? interfaceC31820a.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final StrapLocation getSelectedStrapLocation() {
        return this.selectedStrapLocation;
    }

    public String toString() {
        return "DeviceLocationViewState(selectedStrapLaterality=" + this.selectedStrapLaterality + ", selectedStrapLocation=" + this.selectedStrapLocation + ", asyncProcessStarted=" + this.asyncProcessStarted + ", navigationEvent=" + this.navigationEvent + ")";
    }

    public /* synthetic */ C33024d(StrapLaterality strapLaterality, StrapLocation strapLocation, C33021a c33021a, InterfaceC31820a interfaceC31820a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(strapLaterality, strapLocation, (i13 & 4) != 0 ? null : c33021a, (i13 & 8) != 0 ? null : interfaceC31820a);
    }
}
