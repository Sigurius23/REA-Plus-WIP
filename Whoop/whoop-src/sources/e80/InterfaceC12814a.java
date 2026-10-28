package e80;

import hc3.AbstractC17176i;
import java.util.List;
import jy1.C22047a;
import m83.AbstractC25260n;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: e80.a */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0011\u0003\u000e\u0012J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u0004\u0018\u00010\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0004\u0013\u0014\u0015\u0016¨\u0006\u0017À\u0006\u0003"}, m65681d2 = {"Le80/a;", "", "Ljy1/a;", "b", "()Ljy1/a;", "", "getName", "()Ljava/lang/String;", "name", "", "getValue", "()Ljava/lang/Double;", "value", "", "a", "()Ljava/util/List;", "tags", "c", "d", "Le80/a$a;", "Le80/a$b;", "Le80/a$c;", "Le80/a$d;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC12814a {
    /* JADX INFO: renamed from: a */
    List<String> mo35877a();

    /* JADX INFO: renamed from: b */
    default C22047a mo35878b() {
        return new C22047a(0, getName(), getValue(), mo35877a(), null, 17, null);
    }

    String getName();

    Double getValue();

    /* JADX INFO: renamed from: e80.a$c */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0014\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Le80/a$c;", "Le80/a;", "", "name", "", "value", "", "tags", "<init>", "(Ljava/lang/String;DLjava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "D", "getValue", "()Ljava/lang/Double;", "c", "Ljava/util/List;", "()Ljava/util/List;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC12814a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String name;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final double value;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<String> tags;

        public c(String name, double d3, List<String> tags) {
            AbstractC22676k.m65750j(name, "name");
            AbstractC22676k.m65750j(tags, "tags");
            this.name = name;
            this.value = d3;
            this.tags = tags;
        }

        @Override // e80.InterfaceC12814a
        /* JADX INFO: renamed from: a */
        public List<String> mo35877a() {
            return this.tags;
        }

        @Override // e80.InterfaceC12814a
        /* JADX INFO: renamed from: b */
        public /* bridge */ C22047a mo35878b() {
            return super.mo35878b();
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.name, cVar.name) && Double.compare(this.value, cVar.value) == 0 && AbstractC22676k.m65745e(this.tags, cVar.tags);
        }

        @Override // e80.InterfaceC12814a
        public String getName() {
            return this.name;
        }

        @Override // e80.InterfaceC12814a
        public Double getValue() {
            return Double.valueOf(this.value);
        }

        public int hashCode() {
            return this.tags.hashCode() + AbstractC17176i.m48499a(this.name.hashCode() * 31, 31, this.value);
        }

        public String toString() {
            return "DeviceEducationFetchTimeMetric(name=" + this.name + ", value=" + this.value + ", tags=" + this.tags + ")";
        }

        public /* synthetic */ c(String str, double d3, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "whoop.activation.device_education.fetch.time" : str, d3, (i13 & 4) != 0 ? C25271y.f99162w : list);
        }
    }

    /* JADX INFO: renamed from: e80.a$a */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001\u0017BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u0017\u0010&¨\u0006("}, m65681d2 = {"Le80/a$a;", "Le80/a;", "", "operation", "result", "destination", "name", "", "value", "", "tags", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getOperation", "b", "getResult", "c", "getDestination", "d", "getName", "e", "Ljava/lang/Double;", "getValue", "()Ljava/lang/Double;", "f", "Ljava/util/List;", "()Ljava/util/List;", "g", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC12814a {

        /* JADX INFO: renamed from: h */
        public static final int f43854h = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String operation;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String result;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String destination;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String name;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final Double value;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final List<String> tags;

        public a(String operation, String result, String str, String name, Double d3, List<String> tags) {
            AbstractC22676k.m65750j(operation, "operation");
            AbstractC22676k.m65750j(result, "result");
            AbstractC22676k.m65750j(name, "name");
            AbstractC22676k.m65750j(tags, "tags");
            this.operation = operation;
            this.result = result;
            this.destination = str;
            this.name = name;
            this.value = d3;
            this.tags = tags;
        }

        @Override // e80.InterfaceC12814a
        /* JADX INFO: renamed from: a */
        public List<String> mo35877a() {
            return this.tags;
        }

        @Override // e80.InterfaceC12814a
        /* JADX INFO: renamed from: b */
        public /* bridge */ C22047a mo35878b() {
            return super.mo35878b();
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.operation, aVar.operation) && AbstractC22676k.m65745e(this.result, aVar.result) && AbstractC22676k.m65745e(this.destination, aVar.destination) && AbstractC22676k.m65745e(this.name, aVar.name) && AbstractC22676k.m65745e(this.value, aVar.value) && AbstractC22676k.m65745e(this.tags, aVar.tags);
        }

        @Override // e80.InterfaceC12814a
        public String getName() {
            return this.name;
        }

        @Override // e80.InterfaceC12814a
        public Double getValue() {
            return this.value;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.operation.hashCode() * 31, 31, this.result);
            String str = this.destination;
            int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.name);
            Double d3 = this.value;
            return this.tags.hashCode() + ((iM30450d2 + (d3 != null ? d3.hashCode() : 0)) * 31);
        }

        public String toString() {
            String str = this.operation;
            String str2 = this.result;
            String str3 = this.destination;
            String str4 = this.name;
            Double d3 = this.value;
            List<String> list = this.tags;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("AppDestinationCacheMetric(operation=", str, ", result=", str2, ", destination=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", name=", str4, ", value=");
            sbM32001t.append(d3);
            sbM32001t.append(", tags=");
            sbM32001t.append(list);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(String str, String str2, String str3, String str4, Double d3, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            str3 = (i13 & 4) != 0 ? null : str3;
            str4 = (i13 & 8) != 0 ? "app_destination.cache" : str4;
            d3 = (i13 & 16) != 0 ? null : d3;
            if ((i13 & 32) != 0) {
                list = AbstractC25260n.m74077r0(new String[]{AbstractC11266d.m30461o("operation:", str), AbstractC11266d.m30461o("result:", str2), str3 != null ? "destination:".concat(str3) : null});
            }
            this(str, str2, str3, str4, d3, list);
        }
    }

    /* JADX INFO: renamed from: e80.a$b */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001\u0017BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u0017\u0010&¨\u0006("}, m65681d2 = {"Le80/a$b;", "Le80/a;", "", "result", "destination", "context", "name", "", "value", "", "tags", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getResult", "b", "getDestination", "c", "getContext", "d", "getName", "e", "Ljava/lang/Double;", "getValue", "()Ljava/lang/Double;", "f", "Ljava/util/List;", "()Ljava/util/List;", "g", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC12814a {

        /* JADX INFO: renamed from: h */
        public static final int f43862h = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String result;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String destination;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String context;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String name;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final Double value;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final List<String> tags;

        public b(String result, String destination, String context, String name, Double d3, List<String> tags) {
            AbstractC22676k.m65750j(result, "result");
            AbstractC22676k.m65750j(destination, "destination");
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(name, "name");
            AbstractC22676k.m65750j(tags, "tags");
            this.result = result;
            this.destination = destination;
            this.context = context;
            this.name = name;
            this.value = d3;
            this.tags = tags;
        }

        @Override // e80.InterfaceC12814a
        /* JADX INFO: renamed from: a */
        public List<String> mo35877a() {
            return this.tags;
        }

        @Override // e80.InterfaceC12814a
        /* JADX INFO: renamed from: b */
        public /* bridge */ C22047a mo35878b() {
            return super.mo35878b();
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.result, bVar.result) && AbstractC22676k.m65745e(this.destination, bVar.destination) && AbstractC22676k.m65745e(this.context, bVar.context) && AbstractC22676k.m65745e(this.name, bVar.name) && AbstractC22676k.m65745e(this.value, bVar.value) && AbstractC22676k.m65745e(this.tags, bVar.tags);
        }

        @Override // e80.InterfaceC12814a
        public String getName() {
            return this.name;
        }

        @Override // e80.InterfaceC12814a
        public Double getValue() {
            return this.value;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.result.hashCode() * 31, 31, this.destination), 31, this.context), 31, this.name);
            Double d3 = this.value;
            return this.tags.hashCode() + ((iM30450d + (d3 == null ? 0 : d3.hashCode())) * 31);
        }

        public String toString() {
            String str = this.result;
            String str2 = this.destination;
            String str3 = this.context;
            String str4 = this.name;
            Double d3 = this.value;
            List<String> list = this.tags;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("AppDestinationMetric(result=", str, ", destination=", str2, ", context=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", name=", str4, ", value=");
            sbM32001t.append(d3);
            sbM32001t.append(", tags=");
            sbM32001t.append(list);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }

        public /* synthetic */ b(String str, String str2, String str3, String str4, Double d3, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i13 & 8) != 0 ? "app_destination" : str4, (i13 & 16) != 0 ? null : d3, (i13 & 32) != 0 ? AbstractC37056f.m118959K(AbstractC11266d.m30461o("result:", str), AbstractC11266d.m30461o("destination:", str2), AbstractC11266d.m30461o("context:", str3)) : list);
        }
    }

    /* JADX INFO: renamed from: e80.a$d */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001\u0017BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u0017\u0010&¨\u0006("}, m65681d2 = {"Le80/a$d;", "Le80/a;", "", "result", "destination", "flowBoundary", "name", "", "value", "", "tags", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getResult", "b", "getDestination", "c", "getFlowBoundary", "d", "getName", "e", "Ljava/lang/Double;", "getValue", "()Ljava/lang/Double;", "f", "Ljava/util/List;", "()Ljava/util/List;", "g", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements InterfaceC12814a {

        /* JADX INFO: renamed from: h */
        public static final int f43873h = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String result;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String destination;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String flowBoundary;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String name;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final Double value;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final List<String> tags;

        public d(String result, String destination, String flowBoundary, String name, Double d3, List<String> tags) {
            AbstractC22676k.m65750j(result, "result");
            AbstractC22676k.m65750j(destination, "destination");
            AbstractC22676k.m65750j(flowBoundary, "flowBoundary");
            AbstractC22676k.m65750j(name, "name");
            AbstractC22676k.m65750j(tags, "tags");
            this.result = result;
            this.destination = destination;
            this.flowBoundary = flowBoundary;
            this.name = name;
            this.value = d3;
            this.tags = tags;
        }

        @Override // e80.InterfaceC12814a
        /* JADX INFO: renamed from: a */
        public List<String> mo35877a() {
            return this.tags;
        }

        @Override // e80.InterfaceC12814a
        /* JADX INFO: renamed from: b */
        public /* bridge */ C22047a mo35878b() {
            return super.mo35878b();
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.result, dVar.result) && AbstractC22676k.m65745e(this.destination, dVar.destination) && AbstractC22676k.m65745e(this.flowBoundary, dVar.flowBoundary) && AbstractC22676k.m65745e(this.name, dVar.name) && AbstractC22676k.m65745e(this.value, dVar.value) && AbstractC22676k.m65745e(this.tags, dVar.tags);
        }

        @Override // e80.InterfaceC12814a
        public String getName() {
            return this.name;
        }

        @Override // e80.InterfaceC12814a
        public Double getValue() {
            return this.value;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.result.hashCode() * 31, 31, this.destination), 31, this.flowBoundary), 31, this.name);
            Double d3 = this.value;
            return this.tags.hashCode() + ((iM30450d + (d3 == null ? 0 : d3.hashCode())) * 31);
        }

        public String toString() {
            String str = this.result;
            String str2 = this.destination;
            String str3 = this.flowBoundary;
            String str4 = this.name;
            Double d3 = this.value;
            List<String> list = this.tags;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("FlowBoundaryReachedMetric(result=", str, ", destination=", str2, ", flowBoundary=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", name=", str4, ", value=");
            sbM32001t.append(d3);
            sbM32001t.append(", tags=");
            sbM32001t.append(list);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }

        public /* synthetic */ d(String str, String str2, String str3, String str4, Double d3, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i13 & 8) != 0 ? "activation.flow_boundary_reached" : str4, (i13 & 16) != 0 ? null : d3, (i13 & 32) != 0 ? AbstractC37056f.m118959K(AbstractC11266d.m30461o("result:", str), AbstractC11266d.m30461o("destination:", str2), AbstractC11266d.m30461o("flow_boundary:", str3)) : list);
        }
    }
}
