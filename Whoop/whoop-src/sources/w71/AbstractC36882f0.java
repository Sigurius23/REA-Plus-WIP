package w71;

import c13.AbstractC3855a;
import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: w71.f0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, m65681d2 = {"Lw71/f0;", "", "<init>", "()V", "b", "d", "c", "e", "f", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "a", "Lw71/f0$a;", "Lw71/f0$b;", "Lw71/f0$c;", "Lw71/f0$d;", "Lw71/f0$e;", "Lw71/f0$f;", "Lw71/f0$g;", "Lw71/f0$h;", "Lw71/f0$i;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36882f0 {

    /* JADX INFO: renamed from: w71.f0$a */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lw71/f0$a;", "Lw71/f0;", "", "isChecked", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC36882f0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isChecked;

        public a(boolean z4) {
            super(null);
            this.isChecked = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsChecked() {
            return this.isChecked;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.isChecked == ((a) other).isChecked;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isChecked);
        }

        public String toString() {
            return AbstractC3855a.m11827k("CheckboxAnswer(isChecked=", ")", this.isChecked);
        }
    }

    /* JADX INFO: renamed from: w71.f0$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u0018\u0010\f¨\u0006\u001d"}, m65681d2 = {"Lw71/f0$c;", "Lw71/f0;", "", "presetNumber", "min", "max", "increment", "", "level", "<init>", "(Ljava/lang/Integer;IIILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "b", "I", "d", "c", "Ljava/lang/String;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC36882f0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Integer presetNumber;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int min;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int max;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final int increment;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String level;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Integer num, int i13, int i14, int i15, String level) {
            super(null);
            AbstractC22676k.m65750j(level, "level");
            this.presetNumber = num;
            this.min = i13;
            this.max = i14;
            this.increment = i15;
            this.level = level;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getIncrement() {
            return this.increment;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLevel() {
            return this.level;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getMax() {
            return this.max;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getMin() {
            return this.min;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Integer getPresetNumber() {
            return this.presetNumber;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.presetNumber, cVar.presetNumber) && this.min == cVar.min && this.max == cVar.max && this.increment == cVar.increment && AbstractC22676k.m65745e(this.level, cVar.level);
        }

        public int hashCode() {
            Integer num = this.presetNumber;
            return this.level.hashCode() + AbstractC11266d.m30448b(this.increment, AbstractC11266d.m30448b(this.max, AbstractC11266d.m30448b(this.min, (num == null ? 0 : num.hashCode()) * 31, 31), 31), 31);
        }

        public String toString() {
            Integer num = this.presetNumber;
            int i13 = this.min;
            int i14 = this.max;
            int i15 = this.increment;
            String str = this.level;
            StringBuilder sb4 = new StringBuilder("NumericScale(presetNumber=");
            sb4.append(num);
            sb4.append(", min=");
            sb4.append(i13);
            sb4.append(", max=");
            AbstractC30802r.m94773v(sb4, i14, ", increment=", i15, ", level=");
            return AbstractC25012a.m73376i(str, ")", sb4);
        }

        public /* synthetic */ c(Integer num, int i13, int i14, int i15, String str, int i16, DefaultConstructorMarker defaultConstructorMarker) {
            this((i16 & 1) != 0 ? null : num, i13, i14, (i16 & 8) != 0 ? 1 : i15, str);
        }
    }

    /* JADX INFO: renamed from: w71.f0$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\u000e¨\u0006\u001b"}, m65681d2 = {"Lw71/f0$d;", "Lw71/f0;", "", "presetNumber", "min", "max", "<init>", "(Ljava/lang/Integer;II)V", "a", "(Ljava/lang/Integer;II)Lw71/f0$d;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "b", "I", "d", "c", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC36882f0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Integer presetNumber;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int min;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int max;

        public d(Integer num, int i13, int i14) {
            super(null);
            this.presetNumber = num;
            this.min = i13;
            this.max = i14;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ d m118323b(d dVar, Integer num, int i13, int i14, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                num = dVar.presetNumber;
            }
            if ((i15 & 2) != 0) {
                i13 = dVar.min;
            }
            if ((i15 & 4) != 0) {
                i14 = dVar.max;
            }
            return dVar.m118324a(num, i13, i14);
        }

        /* JADX INFO: renamed from: a */
        public final d m118324a(Integer presetNumber, int min, int max) {
            return new d(presetNumber, min, max);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getMax() {
            return this.max;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getMin() {
            return this.min;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Integer getPresetNumber() {
            return this.presetNumber;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.presetNumber, dVar.presetNumber) && this.min == dVar.min && this.max == dVar.max;
        }

        public int hashCode() {
            Integer num = this.presetNumber;
            return Integer.hashCode(this.max) + AbstractC11266d.m30448b(this.min, (num == null ? 0 : num.hashCode()) * 31, 31);
        }

        public String toString() {
            Integer num = this.presetNumber;
            int i13 = this.min;
            int i14 = this.max;
            StringBuilder sb4 = new StringBuilder("NumericStepper(presetNumber=");
            sb4.append(num);
            sb4.append(", min=");
            sb4.append(i13);
            sb4.append(", max=");
            return AbstractC18489d0.m53371l(sb4, i14, ")");
        }

        public /* synthetic */ d(Integer num, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this((i15 & 1) != 0 ? null : num, i13, i14);
        }
    }

    /* JADX INFO: renamed from: w71.f0$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJD\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u001e\u0010\u000e¨\u0006 "}, m65681d2 = {"Lw71/f0$e;", "Lw71/f0;", "", "presetNumber", "min", "max", "increment", "", "level", "<init>", "(Ljava/lang/Integer;IIILjava/lang/String;)V", "a", "(Ljava/lang/Integer;IIILjava/lang/String;)Lw71/f0$e;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "b", "I", "f", "c", "e", "d", "Ljava/lang/String;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC36882f0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Integer presetNumber;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int min;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int max;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final int increment;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String level;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Integer num, int i13, int i14, int i15, String level) {
            super(null);
            AbstractC22676k.m65750j(level, "level");
            this.presetNumber = num;
            this.min = i13;
            this.max = i14;
            this.increment = i15;
            this.level = level;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ e m118328b(e eVar, Integer num, int i13, int i14, int i15, String str, int i16, Object obj) {
            if ((i16 & 1) != 0) {
                num = eVar.presetNumber;
            }
            if ((i16 & 2) != 0) {
                i13 = eVar.min;
            }
            if ((i16 & 4) != 0) {
                i14 = eVar.max;
            }
            if ((i16 & 8) != 0) {
                i15 = eVar.increment;
            }
            if ((i16 & 16) != 0) {
                str = eVar.level;
            }
            String str2 = str;
            int i17 = i14;
            return eVar.m118329a(num, i13, i17, i15, str2);
        }

        /* JADX INFO: renamed from: a */
        public final e m118329a(Integer presetNumber, int min, int max, int increment, String level) {
            AbstractC22676k.m65750j(level, "level");
            return new e(presetNumber, min, max, increment, level);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getIncrement() {
            return this.increment;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getLevel() {
            return this.level;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getMax() {
            return this.max;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.presetNumber, eVar.presetNumber) && this.min == eVar.min && this.max == eVar.max && this.increment == eVar.increment && AbstractC22676k.m65745e(this.level, eVar.level);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getMin() {
            return this.min;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Integer getPresetNumber() {
            return this.presetNumber;
        }

        public int hashCode() {
            Integer num = this.presetNumber;
            return this.level.hashCode() + AbstractC11266d.m30448b(this.increment, AbstractC11266d.m30448b(this.max, AbstractC11266d.m30448b(this.min, (num == null ? 0 : num.hashCode()) * 31, 31), 31), 31);
        }

        public String toString() {
            Integer num = this.presetNumber;
            int i13 = this.min;
            int i14 = this.max;
            int i15 = this.increment;
            String str = this.level;
            StringBuilder sb4 = new StringBuilder("Slider(presetNumber=");
            sb4.append(num);
            sb4.append(", min=");
            sb4.append(i13);
            sb4.append(", max=");
            AbstractC30802r.m94773v(sb4, i14, ", increment=", i15, ", level=");
            return AbstractC25012a.m73376i(str, ")", sb4);
        }

        public /* synthetic */ e(Integer num, int i13, int i14, int i15, String str, int i16, DefaultConstructorMarker defaultConstructorMarker) {
            this((i16 & 1) != 0 ? null : num, i13, i14, (i16 & 8) != 0 ? 1 : i15, str);
        }
    }

    /* JADX INFO: renamed from: w71.f0$f */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lw71/f0$f;", "Lw71/f0;", "", "time", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC36882f0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String time;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String time) {
            super(null);
            AbstractC22676k.m65750j(time, "time");
            this.time = time;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getTime() {
            return this.time;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && AbstractC22676k.m65745e(this.time, ((f) other).time);
        }

        public int hashCode() {
            return this.time.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("TimeInput(time=", this.time, ")");
        }

        public /* synthetic */ f(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "" : str);
        }
    }

    /* JADX INFO: renamed from: w71.f0$g */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ8\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001e\u0010\u001d¨\u0006 "}, m65681d2 = {"Lw71/f0$g;", "Lw71/f0;", "Lcom/whoop/design/util/TextResource;", "time", "", "minTime", "maxTime", "curTime", "<init>", "(Lcom/whoop/design/util/TextResource;JJJ)V", "a", "(Lcom/whoop/design/util/TextResource;JJJ)Lw71/f0$g;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "b", "J", "e", "()J", "c", "d", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC36882f0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource time;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final long minTime;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final long maxTime;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final long curTime;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(TextResource time, long j7, long j13, long j14) {
            super(null);
            AbstractC22676k.m65750j(time, "time");
            this.time = time;
            this.minTime = j7;
            this.maxTime = j13;
            this.curTime = j14;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ g m118336b(g gVar, TextResource textResource, long j7, long j13, long j14, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                textResource = gVar.time;
            }
            if ((i13 & 2) != 0) {
                j7 = gVar.minTime;
            }
            if ((i13 & 4) != 0) {
                j13 = gVar.maxTime;
            }
            if ((i13 & 8) != 0) {
                j14 = gVar.curTime;
            }
            long j15 = j14;
            return gVar.m118337a(textResource, j7, j13, j15);
        }

        /* JADX INFO: renamed from: a */
        public final g m118337a(TextResource time, long minTime, long maxTime, long curTime) {
            AbstractC22676k.m65750j(time, "time");
            return new g(time, minTime, maxTime, curTime);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getCurTime() {
            return this.curTime;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getMaxTime() {
            return this.maxTime;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final long getMinTime() {
            return this.minTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return AbstractC22676k.m65745e(this.time, gVar.time) && this.minTime == gVar.minTime && this.maxTime == gVar.maxTime && this.curTime == gVar.curTime;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextResource getTime() {
            return this.time;
        }

        public int hashCode() {
            return Long.hashCode(this.curTime) + AbstractC11266d.m30451e(AbstractC11266d.m30451e(this.time.hashCode() * 31, this.minTime, 31), this.maxTime, 31);
        }

        public String toString() {
            TextResource textResource = this.time;
            long j7 = this.minTime;
            long j13 = this.maxTime;
            long j14 = this.curTime;
            StringBuilder sb4 = new StringBuilder("TimeSlider(time=");
            sb4.append(textResource);
            sb4.append(", minTime=");
            sb4.append(j7);
            AbstractC2875y.m8285A(sb4, ", maxTime=", j13, ", curTime=");
            return AbstractC11266d.m30457k(j14, ")", sb4);
        }
    }

    /* JADX INFO: renamed from: w71.f0$h */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lw71/f0$h;", "Lw71/f0;", "", "boolean", "<init>", "(Ljava/lang/Boolean;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC36882f0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Boolean boolean;

        public h(Boolean bool) {
            super(null);
            this.boolean = bool;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Boolean getBoolean() {
            return this.boolean;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof h) && AbstractC22676k.m65745e(this.boolean, ((h) other).boolean);
        }

        public int hashCode() {
            Boolean bool = this.boolean;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106651j("ToggleAnswer(boolean=", this.boolean, ")");
        }
    }

    /* JADX INFO: renamed from: w71.f0$i */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lw71/f0$i;", "Lw71/f0;", "", "boolean", "<init>", "(Ljava/lang/Boolean;)V", "a", "(Ljava/lang/Boolean;)Lw71/f0$i;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "b", "()Ljava/lang/Boolean;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC36882f0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Boolean boolean;

        public i(Boolean bool) {
            super(null);
            this.boolean = bool;
        }

        /* JADX INFO: renamed from: a */
        public final i m118343a(Boolean bool) {
            return new i(bool);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Boolean getBoolean() {
            return this.boolean;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof i) && AbstractC22676k.m65745e(this.boolean, ((i) other).boolean);
        }

        public int hashCode() {
            Boolean bool = this.boolean;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106651j("YesNoAnswer(boolean=", this.boolean, ")");
        }

        public /* synthetic */ i(Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : bool);
        }
    }

    public /* synthetic */ AbstractC36882f0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC36882f0() {
    }

    /* JADX INFO: renamed from: w71.f0$b */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJH\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b \u0010\u000f¨\u0006!"}, m65681d2 = {"Lw71/f0$b;", "Lw71/f0;", "", "number", "min", "max", "", "decimalPlaces", "", "unit", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ILjava/lang/String;)V", "a", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ILjava/lang/String;)Lw71/f0$b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Double;", "f", "()Ljava/lang/Double;", "b", "e", "c", "d", "I", "Ljava/lang/String;", "g", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC36882f0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Double number;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Double min;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Double max;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final int decimalPlaces;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String unit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Double d3, Double d14, Double d15, int i13, String unit) {
            super(null);
            AbstractC22676k.m65750j(unit, "unit");
            this.number = d3;
            this.min = d14;
            this.max = d15;
            this.decimalPlaces = i13;
            this.unit = unit;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ b m118311b(b bVar, Double d3, Double d14, Double d15, int i13, String str, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                d3 = bVar.number;
            }
            if ((i14 & 2) != 0) {
                d14 = bVar.min;
            }
            if ((i14 & 4) != 0) {
                d15 = bVar.max;
            }
            if ((i14 & 8) != 0) {
                i13 = bVar.decimalPlaces;
            }
            if ((i14 & 16) != 0) {
                str = bVar.unit;
            }
            String str2 = str;
            Double d16 = d15;
            return bVar.m118312a(d3, d14, d16, i13, str2);
        }

        /* JADX INFO: renamed from: a */
        public final b m118312a(Double number, Double min, Double max, int decimalPlaces, String unit) {
            AbstractC22676k.m65750j(unit, "unit");
            return new b(number, min, max, decimalPlaces, unit);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getDecimalPlaces() {
            return this.decimalPlaces;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Double getMax() {
            return this.max;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Double getMin() {
            return this.min;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.number, bVar.number) && AbstractC22676k.m65745e(this.min, bVar.min) && AbstractC22676k.m65745e(this.max, bVar.max) && this.decimalPlaces == bVar.decimalPlaces && AbstractC22676k.m65745e(this.unit, bVar.unit);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Double getNumber() {
            return this.number;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getUnit() {
            return this.unit;
        }

        public int hashCode() {
            Double d3 = this.number;
            int iHashCode = (d3 == null ? 0 : d3.hashCode()) * 31;
            Double d14 = this.min;
            int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
            Double d15 = this.max;
            return this.unit.hashCode() + AbstractC11266d.m30448b(this.decimalPlaces, (iHashCode2 + (d15 != null ? d15.hashCode() : 0)) * 31, 31);
        }

        public String toString() {
            Double d3 = this.number;
            Double d14 = this.min;
            Double d15 = this.max;
            int i13 = this.decimalPlaces;
            String str = this.unit;
            StringBuilder sb4 = new StringBuilder("NumericInputAnswer(number=");
            sb4.append(d3);
            sb4.append(", min=");
            sb4.append(d14);
            sb4.append(", max=");
            sb4.append(d15);
            sb4.append(", decimalPlaces=");
            sb4.append(i13);
            sb4.append(", unit=");
            return AbstractC25012a.m73376i(str, ")", sb4);
        }

        public /* synthetic */ b(Double d3, Double d14, Double d15, int i13, String str, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this((i14 & 1) != 0 ? null : d3, (i14 & 2) != 0 ? null : d14, (i14 & 4) != 0 ? null : d15, (i14 & 8) != 0 ? 0 : i13, (i14 & 16) != 0 ? "" : str);
        }
    }
}
