package j71;

import c71.C4282a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cz0.AbstractC11258s;
import cz0.AbstractC11259t;
import cz0.InterfaceC11257r;
import e71.C12800a;
import f71.C14224e;
import g71.C15546d;
import i71.C18204h;
import i71.C18205i;
import i71.InterfaceC18203g;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import l61.C23379d;
import m83.C25271y;
import nh3.AbstractC26725a;
import o61.C27602a;
import o61.C27606e;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import q61.C29999c;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import u61.C34552a;
import x61.C38023a;
import y00.AbstractC38963t7;
import y61.C39260a;
import z61.C40126c;

/* JADX INFO: renamed from: j71.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000e\f\u0005\t\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\n\u0082\u0001\u000e\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&¨\u0006'"}, m65681d2 = {"Lj71/b;", "", "<init>", "()V", "", "c", "()Ljava/lang/String;", "id", "", "d", "()Z", "skipScrubbing", "b", "hideWhileScrubbing", "g", "n", "a", "k", "i", "f", "j", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "l", "m", "e", "Lj71/b$a;", "Lj71/b$b;", "Lj71/b$c;", "Lj71/b$d;", "Lj71/b$e;", "Lj71/b$f;", "Lj71/b$g;", "Lj71/b$h;", "Lj71/b$i;", "Lj71/b$j;", "Lj71/b$k;", "Lj71/b$l;", "Lj71/b$m;", "Lj71/b$n;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21394b {

    /* JADX INFO: renamed from: j71.b$j */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lj71/b$j;", "Lj71/b;", "Lz61/c;", "progressPlot", "", "id", "", "skipScrubbing", "hideWhileScrubbing", "<init>", "(Lz61/c;Ljava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lz61/c;", "e", "()Lz61/c;", "b", "Ljava/lang/String;", "c", "Z", "d", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j extends AbstractC21394b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C40126c progressPlot;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean skipScrubbing;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean hideWhileScrubbing;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C40126c progressPlot, String id4, boolean z4, boolean z13) {
            super(null);
            AbstractC22676k.m65750j(progressPlot, "progressPlot");
            AbstractC22676k.m65750j(id4, "id");
            this.progressPlot = progressPlot;
            this.id = id4;
            this.skipScrubbing = z4;
            this.hideWhileScrubbing = z13;
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getHideWhileScrubbing() {
            return this.hideWhileScrubbing;
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getId() {
            return this.id;
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: d, reason: from getter */
        public boolean getSkipScrubbing() {
            return this.skipScrubbing;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C40126c getProgressPlot() {
            return this.progressPlot;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof j)) {
                return false;
            }
            j jVar = (j) other;
            return AbstractC22676k.m65745e(this.progressPlot, jVar.progressPlot) && AbstractC22676k.m65745e(this.id, jVar.id) && this.skipScrubbing == jVar.skipScrubbing && this.hideWhileScrubbing == jVar.hideWhileScrubbing;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hideWhileScrubbing) + AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.progressPlot.hashCode() * 31, 31, this.id), 31, this.skipScrubbing);
        }

        public String toString() {
            C40126c c40126c = this.progressPlot;
            String str = this.id;
            boolean z4 = this.skipScrubbing;
            boolean z13 = this.hideWhileScrubbing;
            StringBuilder sb4 = new StringBuilder("Progress(progressPlot=");
            sb4.append(c40126c);
            sb4.append(", id=");
            sb4.append(str);
            sb4.append(", skipScrubbing=");
            return AbstractC36095b.m114682j(sb4, z4, ", hideWhileScrubbing=", z13, ")");
        }
    }

    public /* synthetic */ AbstractC21394b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean getHideWhileScrubbing();

    /* JADX INFO: renamed from: c */
    public abstract String getId();

    /* JADX INFO: renamed from: d */
    public abstract boolean getSkipScrubbing();

    private AbstractC21394b() {
    }

    /* JADX INFO: renamed from: j71.b$b */
    @Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J>\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J\u001a\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0018R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\n\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b!\u0010&¨\u0006'"}, m65681d2 = {"Lj71/b$b;", "Lj71/b;", "Lcz0/r;", "", "Le71/a;", "barGroups", "", "id", "", "skipScrubbing", "hideWhileScrubbing", "<init>", "(Ljava/util/List;Ljava/lang/String;ZZ)V", "", "xInput", "Lcz0/s;", "a", "(F)Lcz0/s;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()I", "e", "(Ljava/util/List;Ljava/lang/String;ZZ)Lj71/b$b;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "g", "()Ljava/util/List;", "b", "Ljava/lang/String;", "c", "Z", "d", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC21394b implements InterfaceC11257r {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<C12800a> barGroups;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean skipScrubbing;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean hideWhileScrubbing;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<C12800a> barGroups, String id4, boolean z4, boolean z13) {
            super(null);
            AbstractC22676k.m65750j(barGroups, "barGroups");
            AbstractC22676k.m65750j(id4, "id");
            this.barGroups = barGroups;
            this.id = id4;
            this.skipScrubbing = z4;
            this.hideWhileScrubbing = z13;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: f */
        public static /* synthetic */ b m60062f(b bVar, List list, String str, boolean z4, boolean z13, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                list = bVar.barGroups;
            }
            if ((i13 & 2) != 0) {
                str = bVar.id;
            }
            if ((i13 & 4) != 0) {
                z4 = bVar.skipScrubbing;
            }
            if ((i13 & 8) != 0) {
                z13 = bVar.hideWhileScrubbing;
            }
            return bVar.m60063e(list, str, z4, z13);
        }

        @Override // cz0.InterfaceC11257r
        /* JADX INFO: renamed from: a */
        public AbstractC11258s mo30407a(float xInput) {
            return AbstractC11259t.m30418b(this.barGroups, xInput, getId());
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getHideWhileScrubbing() {
            return this.hideWhileScrubbing;
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getId() {
            return this.id;
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: d, reason: from getter */
        public boolean getSkipScrubbing() {
            return this.skipScrubbing;
        }

        /* JADX INFO: renamed from: e */
        public final b m60063e(List<C12800a> barGroups, String id4, boolean skipScrubbing, boolean hideWhileScrubbing) {
            AbstractC22676k.m65750j(barGroups, "barGroups");
            AbstractC22676k.m65750j(id4, "id");
            return new b(barGroups, id4, skipScrubbing, hideWhileScrubbing);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.barGroups, bVar.barGroups) && AbstractC22676k.m65745e(this.id, bVar.id) && this.skipScrubbing == bVar.skipScrubbing && this.hideWhileScrubbing == bVar.hideWhileScrubbing;
        }

        /* JADX INFO: renamed from: g */
        public final List<C12800a> m60064g() {
            return this.barGroups;
        }

        /* JADX INFO: renamed from: h */
        public int m60065h() {
            return AbstractC11259t.m30420d(this.barGroups, getId());
        }

        public int hashCode() {
            return Boolean.hashCode(this.hideWhileScrubbing) + AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.barGroups.hashCode() * 31, 31, this.id), 31, this.skipScrubbing);
        }

        public String toString() {
            List<C12800a> list = this.barGroups;
            String str = this.id;
            return AbstractC36095b.m114682j(AbstractC26725a.m79507k("Bar(barGroups=", ", id=", str, ", skipScrubbing=", list), this.skipScrubbing, ", hideWhileScrubbing=", this.hideWhileScrubbing, ")");
        }

        public /* synthetic */ b(List list, String str, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? C25271y.f99162w : list, str, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? false : z13);
        }
    }

    /* JADX INFO: renamed from: j71.b$f */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lj71/b$f;", "Lj71/b;", "", "Lq61/c;", "iconGroup", "", "id", "", "skipScrubbing", "hideWhileScrubbing", "<init>", "(Ljava/util/List;Ljava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "e", "()Ljava/util/List;", "b", "Ljava/lang/String;", "c", "Z", "d", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC21394b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<C29999c> iconGroup;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean skipScrubbing;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean hideWhileScrubbing;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List<C29999c> iconGroup, String id4, boolean z4, boolean z13) {
            super(null);
            AbstractC22676k.m65750j(iconGroup, "iconGroup");
            AbstractC22676k.m65750j(id4, "id");
            this.iconGroup = iconGroup;
            this.id = id4;
            this.skipScrubbing = z4;
            this.hideWhileScrubbing = z13;
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getHideWhileScrubbing() {
            return this.hideWhileScrubbing;
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getId() {
            return this.id;
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: d, reason: from getter */
        public boolean getSkipScrubbing() {
            return this.skipScrubbing;
        }

        /* JADX INFO: renamed from: e */
        public final List<C29999c> m60073e() {
            return this.iconGroup;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return AbstractC22676k.m65745e(this.iconGroup, fVar.iconGroup) && AbstractC22676k.m65745e(this.id, fVar.id) && this.skipScrubbing == fVar.skipScrubbing && this.hideWhileScrubbing == fVar.hideWhileScrubbing;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hideWhileScrubbing) + AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.iconGroup.hashCode() * 31, 31, this.id), 31, this.skipScrubbing);
        }

        public String toString() {
            List<C29999c> list = this.iconGroup;
            String str = this.id;
            return AbstractC36095b.m114682j(AbstractC26725a.m79507k("Icon(iconGroup=", ", id=", str, ", skipScrubbing=", list), this.skipScrubbing, ", hideWhileScrubbing=", this.hideWhileScrubbing, ")");
        }

        public /* synthetic */ f(List list, String str, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? C25271y.f99162w : list, str, (i13 & 4) != 0 ? true : z4, (i13 & 8) != 0 ? false : z13);
        }
    }

    /* JADX INFO: renamed from: j71.b$k */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001f"}, m65681d2 = {"Lj71/b$k;", "Lj71/b;", "", "Lc71/a;", "segments", "", "id", "", "skipScrubbing", "<init>", "(Ljava/util/List;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "e", "()Ljava/util/List;", "b", "Ljava/lang/String;", "c", "Z", "d", "()Z", "hideWhileScrubbing", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k extends AbstractC21394b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<C4282a> segments;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean skipScrubbing;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean hideWhileScrubbing;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(List<C4282a> segments, String id4, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(segments, "segments");
            AbstractC22676k.m65750j(id4, "id");
            this.segments = segments;
            this.id = id4;
            this.skipScrubbing = z4;
            this.hideWhileScrubbing = true;
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getHideWhileScrubbing() {
            return this.hideWhileScrubbing;
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getId() {
            return this.id;
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: d, reason: from getter */
        public boolean getSkipScrubbing() {
            return this.skipScrubbing;
        }

        /* JADX INFO: renamed from: e */
        public final List<C4282a> m60088e() {
            return this.segments;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof k)) {
                return false;
            }
            k kVar = (k) other;
            return AbstractC22676k.m65745e(this.segments, kVar.segments) && AbstractC22676k.m65745e(this.id, kVar.id) && this.skipScrubbing == kVar.skipScrubbing;
        }

        public int hashCode() {
            return Boolean.hashCode(this.skipScrubbing) + AbstractC11266d.m30450d(this.segments.hashCode() * 31, 31, this.id);
        }

        public String toString() {
            List<C4282a> list = this.segments;
            String str = this.id;
            return AbstractC18489d0.m53372m(AbstractC26725a.m79507k("Trend(segments=", ", id=", str, ", skipScrubbing=", list), this.skipScrubbing, ")");
        }

        public /* synthetic */ k(List list, String str, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? C25271y.f99162w : list, str, (i13 & 4) != 0 ? false : z4);
        }
    }

    /* JADX INFO: renamed from: j71.b$l */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lj71/b$l;", "Lj71/b;", "", "Lf71/e;", "markers", "", "id", "", "skipScrubbing", "hideWhileScrubbing", "<init>", "(Ljava/util/List;Ljava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "e", "()Ljava/util/List;", "b", "Ljava/lang/String;", "c", "Z", "d", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l extends AbstractC21394b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<C14224e> markers;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean skipScrubbing;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean hideWhileScrubbing;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(List<C14224e> markers, String id4, boolean z4, boolean z13) {
            super(null);
            AbstractC22676k.m65750j(markers, "markers");
            AbstractC22676k.m65750j(id4, "id");
            this.markers = markers;
            this.id = id4;
            this.skipScrubbing = z4;
            this.hideWhileScrubbing = z13;
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getHideWhileScrubbing() {
            return this.hideWhileScrubbing;
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getId() {
            return this.id;
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: d, reason: from getter */
        public boolean getSkipScrubbing() {
            return this.skipScrubbing;
        }

        /* JADX INFO: renamed from: e */
        public final List<C14224e> m60089e() {
            return this.markers;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof l)) {
                return false;
            }
            l lVar = (l) other;
            return AbstractC22676k.m65745e(this.markers, lVar.markers) && AbstractC22676k.m65745e(this.id, lVar.id) && this.skipScrubbing == lVar.skipScrubbing && this.hideWhileScrubbing == lVar.hideWhileScrubbing;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hideWhileScrubbing) + AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.markers.hashCode() * 31, 31, this.id), 31, this.skipScrubbing);
        }

        public String toString() {
            List<C14224e> list = this.markers;
            String str = this.id;
            return AbstractC36095b.m114682j(AbstractC26725a.m79507k("VerticalMarker(markers=", ", id=", str, ", skipScrubbing=", list), this.skipScrubbing, ", hideWhileScrubbing=", this.hideWhileScrubbing, ")");
        }

        public /* synthetic */ l(List list, String str, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, str, (i13 & 4) != 0 ? true : z4, (i13 & 8) != 0 ? false : z13);
        }
    }

    /* JADX INFO: renamed from: j71.b$m */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lj71/b$m;", "Lj71/b;", "", "Lg71/d;", "buckets", "", "id", "", "skipScrubbing", "hideWhileScrubbing", "<init>", "(Ljava/util/List;Ljava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "e", "()Ljava/util/List;", "b", "Ljava/lang/String;", "c", "Z", "d", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m extends AbstractC21394b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<C15546d> buckets;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean skipScrubbing;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean hideWhileScrubbing;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(List<C15546d> buckets, String id4, boolean z4, boolean z13) {
            super(null);
            AbstractC22676k.m65750j(buckets, "buckets");
            AbstractC22676k.m65750j(id4, "id");
            this.buckets = buckets;
            this.id = id4;
            this.skipScrubbing = z4;
            this.hideWhileScrubbing = z13;
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getHideWhileScrubbing() {
            return this.hideWhileScrubbing;
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getId() {
            return this.id;
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: d, reason: from getter */
        public boolean getSkipScrubbing() {
            return this.skipScrubbing;
        }

        /* JADX INFO: renamed from: e */
        public final List<C15546d> m60090e() {
            return this.buckets;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof m)) {
                return false;
            }
            m mVar = (m) other;
            return AbstractC22676k.m65745e(this.buckets, mVar.buckets) && AbstractC22676k.m65745e(this.id, mVar.id) && this.skipScrubbing == mVar.skipScrubbing && this.hideWhileScrubbing == mVar.hideWhileScrubbing;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hideWhileScrubbing) + AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.buckets.hashCode() * 31, 31, this.id), 31, this.skipScrubbing);
        }

        public String toString() {
            List<C15546d> list = this.buckets;
            String str = this.id;
            return AbstractC36095b.m114682j(AbstractC26725a.m79507k("XLabel(buckets=", ", id=", str, ", skipScrubbing=", list), this.skipScrubbing, ", hideWhileScrubbing=", this.hideWhileScrubbing, ")");
        }

        public /* synthetic */ m(List list, String str, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i13 & 2) != 0 ? "x_axis_plot" : str, (i13 & 4) != 0 ? true : z4, (i13 & 8) != 0 ? false : z13);
        }
    }

    /* JADX INFO: renamed from: j71.b$n */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0013R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\n\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b\u001e\u0010#¨\u0006$"}, m65681d2 = {"Lj71/b$n;", "Lj71/b;", "Lcz0/r;", "", "Lu61/a;", "segments", "", "id", "", "skipScrubbing", "hideWhileScrubbing", "<init>", "(Ljava/util/List;Ljava/lang/String;ZZ)V", "", "xInput", "Lcz0/s;", "a", "(F)Lcz0/s;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "e", "()Ljava/util/List;", "b", "Ljava/lang/String;", "c", "Z", "d", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n extends AbstractC21394b implements InterfaceC11257r {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<C34552a> segments;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean skipScrubbing;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean hideWhileScrubbing;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(List<C34552a> segments, String id4, boolean z4, boolean z13) {
            super(null);
            AbstractC22676k.m65750j(segments, "segments");
            AbstractC22676k.m65750j(id4, "id");
            this.segments = segments;
            this.id = id4;
            this.skipScrubbing = z4;
            this.hideWhileScrubbing = z13;
        }

        @Override // cz0.InterfaceC11257r
        /* JADX INFO: renamed from: a */
        public AbstractC11258s mo30407a(float xInput) {
            return AbstractC11259t.m30422f(this.segments, xInput, getId());
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getHideWhileScrubbing() {
            return this.hideWhileScrubbing;
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getId() {
            return this.id;
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: d, reason: from getter */
        public boolean getSkipScrubbing() {
            return this.skipScrubbing;
        }

        /* JADX INFO: renamed from: e */
        public final List<C34552a> m60091e() {
            return this.segments;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof n)) {
                return false;
            }
            n nVar = (n) other;
            return AbstractC22676k.m65745e(this.segments, nVar.segments) && AbstractC22676k.m65745e(this.id, nVar.id) && this.skipScrubbing == nVar.skipScrubbing && this.hideWhileScrubbing == nVar.hideWhileScrubbing;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hideWhileScrubbing) + AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.segments.hashCode() * 31, 31, this.id), 31, this.skipScrubbing);
        }

        public String toString() {
            List<C34552a> list = this.segments;
            String str = this.id;
            return AbstractC36095b.m114682j(AbstractC26725a.m79507k("Zoom(segments=", ", id=", str, ", skipScrubbing=", list), this.skipScrubbing, ", hideWhileScrubbing=", this.hideWhileScrubbing, ")");
        }

        public /* synthetic */ n(List list, String str, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? C25271y.f99162w : list, str, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? false : z13);
        }
    }

    /* JADX INFO: renamed from: j71.b$a */
    @Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B;\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u001a\u0010\u001c\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u001a\u0010\f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010(\u001a\u0004\b!\u0010)¨\u0006*"}, m65681d2 = {"Lj71/b$a;", "Lj71/b;", "Lcz0/r;", "", "Ll61/d;", "segments", "Lj71/a;", "scrubberShape", "", "id", "", "skipScrubbing", "hideWhileScrubbing", "<init>", "(Ljava/util/List;Lj71/a;Ljava/lang/String;ZZ)V", "", "xInput", "Lcz0/s;", "a", "(F)Lcz0/s;", "", "g", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "f", "()Ljava/util/List;", "b", "Lj71/a;", "e", "()Lj71/a;", "c", "Ljava/lang/String;", "d", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC21394b implements InterfaceC11257r {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<C23379d> segments;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC21393a scrubberShape;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean skipScrubbing;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean hideWhileScrubbing;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<C23379d> segments, EnumC21393a scrubberShape, String id4, boolean z4, boolean z13) {
            super(null);
            AbstractC22676k.m65750j(segments, "segments");
            AbstractC22676k.m65750j(scrubberShape, "scrubberShape");
            AbstractC22676k.m65750j(id4, "id");
            this.segments = segments;
            this.scrubberShape = scrubberShape;
            this.id = id4;
            this.skipScrubbing = z4;
            this.hideWhileScrubbing = z13;
        }

        @Override // cz0.InterfaceC11257r
        /* JADX INFO: renamed from: a */
        public AbstractC11258s mo30407a(float xInput) {
            return AbstractC11259t.m30417a(this.segments, xInput, getId(), this.scrubberShape);
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getHideWhileScrubbing() {
            return this.hideWhileScrubbing;
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getId() {
            return this.id;
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: d, reason: from getter */
        public boolean getSkipScrubbing() {
            return this.skipScrubbing;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final EnumC21393a getScrubberShape() {
            return this.scrubberShape;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.segments, aVar.segments) && this.scrubberShape == aVar.scrubberShape && AbstractC22676k.m65745e(this.id, aVar.id) && this.skipScrubbing == aVar.skipScrubbing && this.hideWhileScrubbing == aVar.hideWhileScrubbing;
        }

        /* JADX INFO: renamed from: f */
        public final List<C23379d> m60060f() {
            return this.segments;
        }

        /* JADX INFO: renamed from: g */
        public int m60061g() {
            return AbstractC11259t.m30419c(this.segments, getId());
        }

        public int hashCode() {
            return Boolean.hashCode(this.hideWhileScrubbing) + AbstractC2875y.m8289b(AbstractC11266d.m30450d((this.scrubberShape.hashCode() + (this.segments.hashCode() * 31)) * 31, 31, this.id), 31, this.skipScrubbing);
        }

        public String toString() {
            List<C23379d> list = this.segments;
            EnumC21393a enumC21393a = this.scrubberShape;
            String str = this.id;
            boolean z4 = this.skipScrubbing;
            boolean z13 = this.hideWhileScrubbing;
            StringBuilder sb4 = new StringBuilder("Band(segments=");
            sb4.append(list);
            sb4.append(", scrubberShape=");
            sb4.append(enumC21393a);
            sb4.append(", id=");
            AbstractC38963t7.m124390t(sb4, str, ", skipScrubbing=", z4, ", hideWhileScrubbing=");
            return AbstractC18489d0.m53372m(sb4, z13, ")");
        }

        public /* synthetic */ a(List list, EnumC21393a enumC21393a, String str, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? C25271y.f99162w : list, enumC21393a, str, (i13 & 8) != 0 ? false : z4, (i13 & 16) != 0 ? false : z13);
        }
    }

    /* JADX INFO: renamed from: j71.b$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\u0018\u0010\u001f¨\u0006 "}, m65681d2 = {"Lj71/b$c;", "Lj71/b;", "", "id", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "", "skipScrubbing", "hideWhileScrubbing", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "getSubtitle", "d", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC21394b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource subtitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean skipScrubbing;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean hideWhileScrubbing;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String id4, TextResource title, TextResource subtitle, boolean z4, boolean z13) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(subtitle, "subtitle");
            this.id = id4;
            this.title = title;
            this.subtitle = subtitle;
            this.skipScrubbing = z4;
            this.hideWhileScrubbing = z13;
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getHideWhileScrubbing() {
            return this.hideWhileScrubbing;
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getId() {
            return this.id;
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: d, reason: from getter */
        public boolean getSkipScrubbing() {
            return this.skipScrubbing;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.id, cVar.id) && AbstractC22676k.m65745e(this.title, cVar.title) && AbstractC22676k.m65745e(this.subtitle, cVar.subtitle) && this.skipScrubbing == cVar.skipScrubbing && this.hideWhileScrubbing == cVar.hideWhileScrubbing;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hideWhileScrubbing) + AbstractC2875y.m8289b(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.id.hashCode() * 31, this.title, 31), this.subtitle, 31), 31, this.skipScrubbing);
        }

        public String toString() {
            String str = this.id;
            TextResource textResource = this.title;
            TextResource textResource2 = this.subtitle;
            boolean z4 = this.skipScrubbing;
            boolean z13 = this.hideWhileScrubbing;
            StringBuilder sbM91847q = AbstractC30007c.m91847q("Calibrating(id=", str, ", title=", textResource, ", subtitle=");
            AbstractC33745d.m106664w(textResource2, ", skipScrubbing=", ", hideWhileScrubbing=", sbM91847q, z4);
            return AbstractC18489d0.m53372m(sbM91847q, z13, ")");
        }

        public /* synthetic */ c(String str, TextResource textResource, TextResource textResource2, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "calibration" : str, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 8) != 0 ? true : z4, (i13 & 16) != 0 ? false : z13);
        }
    }

    /* JADX INFO: renamed from: j71.b$e */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u001a\u0010\n\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\u001a\u0010\"¨\u0006#"}, m65681d2 = {"Lj71/b$e;", "Lj71/b;", "Lo61/a;", "lineState", "Lo61/e;", "pointState", "", "id", "", "skipScrubbing", "hideWhileScrubbing", "<init>", "(Lo61/a;Lo61/e;Ljava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lo61/a;", "getLineState", "()Lo61/a;", "b", "Lo61/e;", "e", "()Lo61/e;", "c", "Ljava/lang/String;", "d", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC21394b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C27602a lineState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C27606e pointState;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean skipScrubbing;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean hideWhileScrubbing;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C27602a lineState, C27606e c27606e, String id4, boolean z4, boolean z13) {
            super(null);
            AbstractC22676k.m65750j(lineState, "lineState");
            AbstractC22676k.m65750j(id4, "id");
            this.lineState = lineState;
            this.pointState = c27606e;
            this.id = id4;
            this.skipScrubbing = z4;
            this.hideWhileScrubbing = z13;
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getHideWhileScrubbing() {
            return this.hideWhileScrubbing;
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getId() {
            return this.id;
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: d, reason: from getter */
        public boolean getSkipScrubbing() {
            return this.skipScrubbing;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C27606e getPointState() {
            return this.pointState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.lineState, eVar.lineState) && AbstractC22676k.m65745e(this.pointState, eVar.pointState) && AbstractC22676k.m65745e(this.id, eVar.id) && this.skipScrubbing == eVar.skipScrubbing && this.hideWhileScrubbing == eVar.hideWhileScrubbing;
        }

        public int hashCode() {
            int iHashCode = this.lineState.hashCode() * 31;
            C27606e c27606e = this.pointState;
            return Boolean.hashCode(this.hideWhileScrubbing) + AbstractC2875y.m8289b(AbstractC11266d.m30450d((iHashCode + (c27606e == null ? 0 : c27606e.hashCode())) * 31, 31, this.id), 31, this.skipScrubbing);
        }

        public String toString() {
            C27602a c27602a = this.lineState;
            C27606e c27606e = this.pointState;
            String str = this.id;
            boolean z4 = this.skipScrubbing;
            boolean z13 = this.hideWhileScrubbing;
            StringBuilder sb4 = new StringBuilder("FinalMarkerPlot(lineState=");
            sb4.append(c27602a);
            sb4.append(", pointState=");
            sb4.append(c27606e);
            sb4.append(", id=");
            AbstractC38963t7.m124390t(sb4, str, ", skipScrubbing=", z4, ", hideWhileScrubbing=");
            return AbstractC18489d0.m53372m(sb4, z13, ")");
        }

        public /* synthetic */ e(C27602a c27602a, C27606e c27606e, String str, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c27602a, c27606e, str, (i13 & 8) != 0 ? true : z4, (i13 & 16) != 0 ? false : z13);
        }
    }

    /* JADX INFO: renamed from: j71.b$i */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJH\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010\u0011R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u001a\u0010\u000b\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b\u001d\u0010%¨\u0006&"}, m65681d2 = {"Lj71/b$i;", "Lj71/b;", "", "Ly61/a;", "overlayGroup", "Lx61/a;", "dynamicGrouping", "", "id", "", "skipScrubbing", "hideWhileScrubbing", "<init>", "(Ljava/util/List;Lx61/a;Ljava/lang/String;ZZ)V", "e", "(Ljava/util/List;Lx61/a;Ljava/lang/String;ZZ)Lj71/b$i;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ljava/util/List;", "b", "Lx61/a;", "g", "()Lx61/a;", "c", "Ljava/lang/String;", "d", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC21394b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<C39260a> overlayGroup;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C38023a dynamicGrouping;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean skipScrubbing;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean hideWhileScrubbing;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(List<C39260a> overlayGroup, C38023a dynamicGrouping, String id4, boolean z4, boolean z13) {
            super(null);
            AbstractC22676k.m65750j(overlayGroup, "overlayGroup");
            AbstractC22676k.m65750j(dynamicGrouping, "dynamicGrouping");
            AbstractC22676k.m65750j(id4, "id");
            this.overlayGroup = overlayGroup;
            this.dynamicGrouping = dynamicGrouping;
            this.id = id4;
            this.skipScrubbing = z4;
            this.hideWhileScrubbing = z13;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: f */
        public static /* synthetic */ i m60083f(i iVar, List list, C38023a c38023a, String str, boolean z4, boolean z13, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                list = iVar.overlayGroup;
            }
            if ((i13 & 2) != 0) {
                c38023a = iVar.dynamicGrouping;
            }
            if ((i13 & 4) != 0) {
                str = iVar.id;
            }
            if ((i13 & 8) != 0) {
                z4 = iVar.skipScrubbing;
            }
            if ((i13 & 16) != 0) {
                z13 = iVar.hideWhileScrubbing;
            }
            boolean z14 = z13;
            String str2 = str;
            return iVar.m60084e(list, c38023a, str2, z4, z14);
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getHideWhileScrubbing() {
            return this.hideWhileScrubbing;
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getId() {
            return this.id;
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: d, reason: from getter */
        public boolean getSkipScrubbing() {
            return this.skipScrubbing;
        }

        /* JADX INFO: renamed from: e */
        public final i m60084e(List<C39260a> overlayGroup, C38023a dynamicGrouping, String id4, boolean skipScrubbing, boolean hideWhileScrubbing) {
            AbstractC22676k.m65750j(overlayGroup, "overlayGroup");
            AbstractC22676k.m65750j(dynamicGrouping, "dynamicGrouping");
            AbstractC22676k.m65750j(id4, "id");
            return new i(overlayGroup, dynamicGrouping, id4, skipScrubbing, hideWhileScrubbing);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof i)) {
                return false;
            }
            i iVar = (i) other;
            return AbstractC22676k.m65745e(this.overlayGroup, iVar.overlayGroup) && AbstractC22676k.m65745e(this.dynamicGrouping, iVar.dynamicGrouping) && AbstractC22676k.m65745e(this.id, iVar.id) && this.skipScrubbing == iVar.skipScrubbing && this.hideWhileScrubbing == iVar.hideWhileScrubbing;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final C38023a getDynamicGrouping() {
            return this.dynamicGrouping;
        }

        /* JADX INFO: renamed from: h */
        public final List<C39260a> m60086h() {
            return this.overlayGroup;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hideWhileScrubbing) + AbstractC2875y.m8289b(AbstractC11266d.m30450d((this.dynamicGrouping.hashCode() + (this.overlayGroup.hashCode() * 31)) * 31, 31, this.id), 31, this.skipScrubbing);
        }

        public String toString() {
            List<C39260a> list = this.overlayGroup;
            C38023a c38023a = this.dynamicGrouping;
            String str = this.id;
            boolean z4 = this.skipScrubbing;
            boolean z13 = this.hideWhileScrubbing;
            StringBuilder sb4 = new StringBuilder("Overlay(overlayGroup=");
            sb4.append(list);
            sb4.append(", dynamicGrouping=");
            sb4.append(c38023a);
            sb4.append(", id=");
            AbstractC38963t7.m124390t(sb4, str, ", skipScrubbing=", z4, ", hideWhileScrubbing=");
            return AbstractC18489d0.m53372m(sb4, z13, ")");
        }

        public /* synthetic */ i(List list, C38023a c38023a, String str, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? C25271y.f99162w : list, (i13 & 2) != 0 ? new C38023a(false, 0.0f, 3, null) : c38023a, str, (i13 & 8) != 0 ? false : z4, (i13 & 16) != 0 ? false : z13);
        }
    }

    /* JADX INFO: renamed from: j71.b$d */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJL\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b!\u0010&R\u001a\u0010\u000b\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b\u001c\u0010&¨\u0006("}, m65681d2 = {"Lj71/b$d;", "Lj71/b;", "", "id", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "", "verticalOffset", "", "skipScrubbing", "hideWhileScrubbing", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FZZ)V", "e", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FZZ)Lj71/b$d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/util/TextResource;", "g", "d", "F", "i", "()F", "Z", "()Z", "f", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC21394b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource subtitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final float verticalOffset;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean skipScrubbing;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean hideWhileScrubbing;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String id4, TextResource title, TextResource subtitle, float f13, boolean z4, boolean z13) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(subtitle, "subtitle");
            this.id = id4;
            this.title = title;
            this.subtitle = subtitle;
            this.verticalOffset = f13;
            this.skipScrubbing = z4;
            this.hideWhileScrubbing = z13;
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ d m60067f(d dVar, String str, TextResource textResource, TextResource textResource2, float f13, boolean z4, boolean z13, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = dVar.id;
            }
            if ((i13 & 2) != 0) {
                textResource = dVar.title;
            }
            if ((i13 & 4) != 0) {
                textResource2 = dVar.subtitle;
            }
            if ((i13 & 8) != 0) {
                f13 = dVar.verticalOffset;
            }
            if ((i13 & 16) != 0) {
                z4 = dVar.skipScrubbing;
            }
            if ((i13 & 32) != 0) {
                z13 = dVar.hideWhileScrubbing;
            }
            boolean z14 = z4;
            boolean z15 = z13;
            return dVar.m60068e(str, textResource, textResource2, f13, z14, z15);
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getHideWhileScrubbing() {
            return this.hideWhileScrubbing;
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getId() {
            return this.id;
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: d, reason: from getter */
        public boolean getSkipScrubbing() {
            return this.skipScrubbing;
        }

        /* JADX INFO: renamed from: e */
        public final d m60068e(String id4, TextResource title, TextResource subtitle, float verticalOffset, boolean skipScrubbing, boolean hideWhileScrubbing) {
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(subtitle, "subtitle");
            return new d(id4, title, subtitle, verticalOffset, skipScrubbing, hideWhileScrubbing);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.id, dVar.id) && AbstractC22676k.m65745e(this.title, dVar.title) && AbstractC22676k.m65745e(this.subtitle, dVar.subtitle) && Float.compare(this.verticalOffset, dVar.verticalOffset) == 0 && this.skipScrubbing == dVar.skipScrubbing && this.hideWhileScrubbing == dVar.hideWhileScrubbing;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final TextResource getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hideWhileScrubbing) + AbstractC2875y.m8289b(AbstractC11266d.m30447a(this.verticalOffset, AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.id.hashCode() * 31, this.title, 31), this.subtitle, 31), 31), 31, this.skipScrubbing);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final float getVerticalOffset() {
            return this.verticalOffset;
        }

        public String toString() {
            String str = this.id;
            TextResource textResource = this.title;
            TextResource textResource2 = this.subtitle;
            float f13 = this.verticalOffset;
            boolean z4 = this.skipScrubbing;
            boolean z13 = this.hideWhileScrubbing;
            StringBuilder sbM91847q = AbstractC30007c.m91847q("Empty(id=", str, ", title=", textResource, ", subtitle=");
            sbM91847q.append(textResource2);
            sbM91847q.append(", verticalOffset=");
            sbM91847q.append(f13);
            sbM91847q.append(", skipScrubbing=");
            return AbstractC36095b.m114682j(sbM91847q, z4, ", hideWhileScrubbing=", z13, ")");
        }

        public /* synthetic */ d(String str, TextResource textResource, TextResource textResource2, float f13, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "empty" : str, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 8) != 0 ? 0.0f : f13, (i13 & 16) != 0 ? true : z4, (i13 & 32) != 0 ? false : z13);
        }
    }

    /* JADX INFO: renamed from: j71.b$g */
    @Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JR\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u001a\u0010 \u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001cR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b)\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0019\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\u000e\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010(\u001a\u0004\b%\u0010*¨\u00062"}, m65681d2 = {"Lj71/b$g;", "Lj71/b;", "Lcz0/r;", "", "Lu61/a;", "segments", "", "id", "", "skipScrubbing", "Li71/g;", "dataScroller", "Li71/h;", "scrollPosition", "hideWhileScrubbing", "<init>", "(Ljava/util/List;Ljava/lang/String;ZLi71/g;Li71/h;Z)V", "", "xInput", "Lcz0/s;", "a", "(F)Lcz0/s;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()I", "e", "(Ljava/util/List;Ljava/lang/String;ZLi71/g;Li71/h;Z)Lj71/b$g;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "g", "()Ljava/util/List;", "b", "Ljava/lang/String;", "c", "Z", "d", "()Z", "Li71/g;", "getDataScroller", "()Li71/g;", "Li71/h;", "getScrollPosition", "()Li71/h;", "f", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC21394b implements InterfaceC11257r {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<C34552a> segments;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean skipScrubbing;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC18203g dataScroller;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C18204h scrollPosition;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean hideWhileScrubbing;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List<C34552a> segments, String id4, boolean z4, InterfaceC18203g dataScroller, C18204h scrollPosition, boolean z13) {
            super(null);
            AbstractC22676k.m65750j(segments, "segments");
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(dataScroller, "dataScroller");
            AbstractC22676k.m65750j(scrollPosition, "scrollPosition");
            this.segments = segments;
            this.id = id4;
            this.skipScrubbing = z4;
            this.dataScroller = dataScroller;
            this.scrollPosition = scrollPosition;
            this.hideWhileScrubbing = z13;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: f */
        public static /* synthetic */ g m60074f(g gVar, List list, String str, boolean z4, InterfaceC18203g interfaceC18203g, C18204h c18204h, boolean z13, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                list = gVar.segments;
            }
            if ((i13 & 2) != 0) {
                str = gVar.id;
            }
            if ((i13 & 4) != 0) {
                z4 = gVar.skipScrubbing;
            }
            if ((i13 & 8) != 0) {
                interfaceC18203g = gVar.dataScroller;
            }
            if ((i13 & 16) != 0) {
                c18204h = gVar.scrollPosition;
            }
            if ((i13 & 32) != 0) {
                z13 = gVar.hideWhileScrubbing;
            }
            C18204h c18204h2 = c18204h;
            boolean z14 = z13;
            return gVar.m60075e(list, str, z4, interfaceC18203g, c18204h2, z14);
        }

        @Override // cz0.InterfaceC11257r
        /* JADX INFO: renamed from: a */
        public AbstractC11258s mo30407a(float xInput) {
            return AbstractC11259t.m30422f(this.segments, xInput, getId());
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getHideWhileScrubbing() {
            return this.hideWhileScrubbing;
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getId() {
            return this.id;
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: d, reason: from getter */
        public boolean getSkipScrubbing() {
            return this.skipScrubbing;
        }

        /* JADX INFO: renamed from: e */
        public final g m60075e(List<C34552a> segments, String id4, boolean skipScrubbing, InterfaceC18203g dataScroller, C18204h scrollPosition, boolean hideWhileScrubbing) {
            AbstractC22676k.m65750j(segments, "segments");
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(dataScroller, "dataScroller");
            AbstractC22676k.m65750j(scrollPosition, "scrollPosition");
            return new g(segments, id4, skipScrubbing, dataScroller, scrollPosition, hideWhileScrubbing);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return AbstractC22676k.m65745e(this.segments, gVar.segments) && AbstractC22676k.m65745e(this.id, gVar.id) && this.skipScrubbing == gVar.skipScrubbing && AbstractC22676k.m65745e(this.dataScroller, gVar.dataScroller) && AbstractC22676k.m65745e(this.scrollPosition, gVar.scrollPosition) && this.hideWhileScrubbing == gVar.hideWhileScrubbing;
        }

        /* JADX INFO: renamed from: g */
        public final List<C34552a> m60076g() {
            return this.segments;
        }

        /* JADX INFO: renamed from: h */
        public int m60077h() {
            return AbstractC11259t.m30421e(this.segments, getId());
        }

        public int hashCode() {
            return Boolean.hashCode(this.hideWhileScrubbing) + ((this.scrollPosition.hashCode() + ((this.dataScroller.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.segments.hashCode() * 31, 31, this.id), 31, this.skipScrubbing)) * 31)) * 31);
        }

        public String toString() {
            List<C34552a> list = this.segments;
            String str = this.id;
            boolean z4 = this.skipScrubbing;
            InterfaceC18203g interfaceC18203g = this.dataScroller;
            C18204h c18204h = this.scrollPosition;
            boolean z13 = this.hideWhileScrubbing;
            StringBuilder sbM79507k = AbstractC26725a.m79507k("Line(segments=", ", id=", str, ", skipScrubbing=", list);
            sbM79507k.append(z4);
            sbM79507k.append(", dataScroller=");
            sbM79507k.append(interfaceC18203g);
            sbM79507k.append(", scrollPosition=");
            sbM79507k.append(c18204h);
            sbM79507k.append(", hideWhileScrubbing=");
            sbM79507k.append(z13);
            sbM79507k.append(")");
            return sbM79507k.toString();
        }

        public /* synthetic */ g(List list, String str, boolean z4, InterfaceC18203g interfaceC18203g, C18204h c18204h, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? C25271y.f99162w : list, str, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? new C18205i() : interfaceC18203g, (i13 & 16) != 0 ? new C18204h(0L, 0L, 0L, 0.0f, 15, null) : c18204h, (i13 & 32) != 0 ? false : z13);
        }
    }

    /* JADX INFO: renamed from: j71.b$h */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010'\u001a\u0004\b\u001f\u0010\u0011R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010(\u001a\u0004\b#\u0010)R\u001a\u0010\r\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010(\u001a\u0004\b\u001d\u0010)¨\u0006*"}, m65681d2 = {"Lj71/b$h;", "Lj71/b;", "", "", "horizontalLines", "verticalLines", "Ly81/e;", "lineColor", "lineAlpha", "", "id", "", "skipScrubbing", "hideWhileScrubbing", "<init>", "(Ljava/util/List;Ljava/util/List;Ly81/e;FLjava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "e", "()Ljava/util/List;", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "Ly81/e;", "g", "()Ly81/e;", "d", "F", "f", "()F", "Ljava/lang/String;", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC21394b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<Float> horizontalLines;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<Float> verticalLines;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC39332e lineColor;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final float lineAlpha;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean skipScrubbing;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final boolean hideWhileScrubbing;

        /* JADX INFO: renamed from: j71.b$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Function1 {

            /* JADX INFO: renamed from: w */
            public static final a f81959w = new a();

            /* JADX INFO: renamed from: a */
            public final long m60082a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getWhite5();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m60082a((C39336i) obj));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List<Float> horizontalLines, List<Float> verticalLines, InterfaceC39332e lineColor, float f13, String id4, boolean z4, boolean z13) {
            super(null);
            AbstractC22676k.m65750j(horizontalLines, "horizontalLines");
            AbstractC22676k.m65750j(verticalLines, "verticalLines");
            AbstractC22676k.m65750j(lineColor, "lineColor");
            AbstractC22676k.m65750j(id4, "id");
            this.horizontalLines = horizontalLines;
            this.verticalLines = verticalLines;
            this.lineColor = lineColor;
            this.lineAlpha = f13;
            this.id = id4;
            this.skipScrubbing = z4;
            this.hideWhileScrubbing = z13;
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getHideWhileScrubbing() {
            return this.hideWhileScrubbing;
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getId() {
            return this.id;
        }

        @Override // j71.AbstractC21394b
        /* JADX INFO: renamed from: d, reason: from getter */
        public boolean getSkipScrubbing() {
            return this.skipScrubbing;
        }

        /* JADX INFO: renamed from: e */
        public final List<Float> m60078e() {
            return this.horizontalLines;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return AbstractC22676k.m65745e(this.horizontalLines, hVar.horizontalLines) && AbstractC22676k.m65745e(this.verticalLines, hVar.verticalLines) && AbstractC22676k.m65745e(this.lineColor, hVar.lineColor) && Float.compare(this.lineAlpha, hVar.lineAlpha) == 0 && AbstractC22676k.m65745e(this.id, hVar.id) && this.skipScrubbing == hVar.skipScrubbing && this.hideWhileScrubbing == hVar.hideWhileScrubbing;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final float getLineAlpha() {
            return this.lineAlpha;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final InterfaceC39332e getLineColor() {
            return this.lineColor;
        }

        /* JADX INFO: renamed from: h */
        public final List<Float> m60081h() {
            return this.verticalLines;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hideWhileScrubbing) + AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30447a(this.lineAlpha, AbstractC33745d.m106648g(this.lineColor, AbstractC11895b.m31983b(this.horizontalLines.hashCode() * 31, 31, this.verticalLines), 31), 31), 31, this.id), 31, this.skipScrubbing);
        }

        public String toString() {
            List<Float> list = this.horizontalLines;
            List<Float> list2 = this.verticalLines;
            InterfaceC39332e interfaceC39332e = this.lineColor;
            float f13 = this.lineAlpha;
            String str = this.id;
            boolean z4 = this.skipScrubbing;
            boolean z13 = this.hideWhileScrubbing;
            StringBuilder sbM124380j = AbstractC38963t7.m124380j("LineGrid(horizontalLines=", ", verticalLines=", list, ", lineColor=", list2);
            sbM124380j.append(interfaceC39332e);
            sbM124380j.append(", lineAlpha=");
            sbM124380j.append(f13);
            sbM124380j.append(", id=");
            AbstractC38963t7.m124390t(sbM124380j, str, ", skipScrubbing=", z4, ", hideWhileScrubbing=");
            return AbstractC18489d0.m53372m(sbM124380j, z13, ")");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ h(List list, List list2, InterfaceC39332e interfaceC39332e, float f13, String str, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            int i14 = i13 & 1;
            C25271y c25271y = C25271y.f99162w;
            this(i14 != 0 ? c25271y : list, (i13 & 2) != 0 ? c25271y : list2, (i13 & 4) != 0 ? p745y81.Function1.m125323a(a.f81959w) : interfaceC39332e, (i13 & 8) != 0 ? 1.0f : f13, str, (i13 & 32) != 0 ? true : z4, (i13 & 64) != 0 ? false : z13);
        }
    }
}
