package dt1;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.labrador.feature.details.domain.model.LabradorDetailsDomainHolder;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qk1.C30443a;
import rk1.EnumC31496c;
import rs1.AbstractC31789a;
import rs1.AbstractC31794f;
import sk1.C32573b;

/* JADX INFO: renamed from: dt1.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\f¨\u0006\u000e"}, m65681d2 = {"Ldt1/f;", "", "Ljava/time/ZoneId;", "zone", "<init>", "(Ljava/time/ZoneId;)V", "Lqk1/a;", "model", "Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;", "a", "(Lqk1/a;)Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;", "Ljava/time/format/DateTimeFormatter;", "Ljava/time/format/DateTimeFormatter;", "printer", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12368f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final DateTimeFormatter printer;

    public C12368f(ZoneId zone) {
        AbstractC22676k.m65750j(zone, "zone");
        DateTimeFormatter dateTimeFormatterWithZone = DateTimeFormatter.ofPattern("MMM d, yyyy h:mm:ss a", Locale.US).withZone(zone);
        AbstractC22676k.m65749i(dateTimeFormatterWithZone, "withZone(...)");
        this.printer = dateTimeFormatterWithZone;
    }

    /* JADX INFO: renamed from: a */
    public final LabradorDetailsDomainHolder m34653a(C30443a model) {
        AbstractC22676k.m65750j(model, "model");
        EnumC31496c enumC31496cM97036a = EnumC31496c.INSTANCE.m97036a(model.getClassification());
        TextResource textResourceM21278l = AbstractC8693b.m21278l(this.printer.format(Instant.ofEpochMilli(model.getTimestamp())));
        ArrayList arrayListM74164j0 = AbstractC25267u.m74164j0(model.m93121g());
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayListM74164j0, 10));
        Iterator it = arrayListM74164j0.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(((Number) it.next()).intValue()));
        }
        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(enumC31496cM97036a.getDisplayTitle());
        List<C32573b> determinations = enumC31496cM97036a.getDeterminations();
        TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(enumC31496cM97036a.getDisplayBody());
        TextResource textResourceM98725a = AbstractC31789a.m98725a((int) model.getAverageHr());
        TextResource.C8688b c8688bM21277k3 = model.m93122h().isEmpty() ? AbstractC8693b.m21277k(AbstractC31794f.f131667l) : AbstractC8693b.m21277k(AbstractC31794f.f131669m);
        Instant instantOfEpochMilli = Instant.ofEpochMilli(model.getTimestamp());
        AbstractC22676k.m65749i(instantOfEpochMilli, "ofEpochMilli(...)");
        return new LabradorDetailsDomainHolder(textResourceM21278l, arrayList, c8688bM21277k, determinations, c8688bM21277k2, textResourceM98725a, null, null, c8688bM21277k3, null, "", instantOfEpochMilli, model.m93122h(), model.getNotes(), model.getPdfPresignedUrl(), model.getProtectYourPrivacyTitle(), model.getProtectYourPrivacyDescription(), 704, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C12368f(ZoneId zoneId, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 1) != 0) {
            zoneId = ZoneId.systemDefault();
            AbstractC22676k.m65749i(zoneId, "systemDefault(...)");
        }
        this(zoneId);
    }
}
