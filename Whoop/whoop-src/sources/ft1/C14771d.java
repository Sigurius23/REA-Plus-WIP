package ft1;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.labrador.feature.details.domain.model.LabradorDetailsDomainHolder;
import dt1.C12363a;
import dt1.InterfaceC12369g;
import h71.C16993j;
import h71.C16994k;
import i71.C18200d;
import i71.InterfaceC18201e;
import i92.InterfaceC18260e;
import j71.AbstractC21394b;
import java.time.Instant;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import rk1.AbstractC31495b;
import sk1.C32573b;
import tr2.InterfaceC34116n;
import u61.C34552a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: ft1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lft1/d;", "", "Ltr2/n;", "logger", "Li92/e;", "networkMonitor", "<init>", "(Ltr2/n;Li92/e;)V", "Ldt1/g$g;", "state", "Lft1/c$g;", "c", "(Ldt1/g$g;)Lft1/c$g;", "", "", "samples", "Lh71/j;", "b", "(Ljava/util/List;)Lh71/j;", "Ldt1/g;", "domainState", "Lft1/c;", "a", "(Ldt1/g;)Lft1/c;", "Ltr2/n;", "Li92/e;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14771d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC18260e networkMonitor;

    public C14771d(InterfaceC34116n logger, InterfaceC18260e networkMonitor) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(networkMonitor, "networkMonitor");
        this.logger = logger;
        this.networkMonitor = networkMonitor;
    }

    /* JADX INFO: renamed from: b */
    private final C16993j m42374b(List<Double> samples) {
        AbstractC21394b.g gVarM97033a = AbstractC31495b.m97033a(samples, Float.valueOf(-1000.0f), Float.valueOf(2000.0f));
        C34552a c34552a = (C34552a) AbstractC25265s.m74100H0(gVarM97033a.m60076g());
        return new C16993j(new C16994k(null, null, null, false, false, false, 63, null), AbstractC37056f.m118959K(AbstractC14772e.m42378b(), AbstractC14772e.m42377a(), AbstractC21394b.g.m60074f(gVarM97033a, AbstractC37056f.m118958J(C34552a.m109231b(c34552a == null ? new C34552a(null, null, null, null, 15, null) : c34552a, null, null, null, new C18200d(10, null, 2, null), 7, null)), null, false, null, null, false, 62, null)), 15.0f, new InterfaceC18201e.b(samples.size() / ((int) 15.0f)), null, null, 48, null);
    }

    /* JADX INFO: renamed from: c */
    private final InterfaceC14770c.g m42375c(InterfaceC12369g.g state) {
        LabradorDetailsDomainHolder domain = state.getDomain();
        TextResource timestampTitle = domain.getTimestampTitle();
        C16993j c16993jM42374b = m42374b(domain.getSamples());
        TextResource determinationTitle = domain.getDeterminationTitle();
        List<C32573b> readings = domain.getReadings();
        TextResource insightBody = domain.getInsightBody();
        TextResource averageHr = domain.getAverageHr();
        TextResource shareText = domain.getShareText();
        TextResource disclaimerText = domain.getDisclaimerText();
        TextResource addNotesText = domain.getAddNotesText();
        TextResource removeReadingText = domain.getRemoveReadingText();
        boolean zIsConnected = this.networkMonitor.isConnected();
        String id4 = domain.getId();
        Instant timestamp = domain.getTimestamp();
        List<String> savedSymptoms = domain.getSavedSymptoms();
        String savedNotes = domain.getSavedNotes();
        C12363a dialogState = state.getDialogState();
        String pdfPresignedUrl = domain.getPdfPresignedUrl();
        String pdfPath = state.getPdfPath();
        String protectYourPrivacyTitle = domain.getProtectYourPrivacyTitle();
        TextResource textResourceM21278l = protectYourPrivacyTitle != null ? AbstractC8693b.m21278l(protectYourPrivacyTitle) : null;
        String protectYourPrivacyDescription = domain.getProtectYourPrivacyDescription();
        return new InterfaceC14770c.g(timestampTitle, c16993jM42374b, 0L, determinationTitle, readings, insightBody, averageHr, shareText, disclaimerText, addNotesText, removeReadingText, zIsConnected, id4, timestamp, savedSymptoms, savedNotes, null, dialogState, pdfPresignedUrl, pdfPath, textResourceM21278l, protectYourPrivacyDescription != null ? AbstractC8693b.m21278l(protectYourPrivacyDescription) : null, state.getSharingPdf(), null, 8454148, null);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC14770c m42376a(InterfaceC12369g domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        if (domainState instanceof InterfaceC12369g.d) {
            return InterfaceC14770c.d.f54717a;
        }
        if (domainState instanceof InterfaceC12369g.g) {
            return m42375c((InterfaceC12369g.g) domainState);
        }
        if (domainState.equals(InterfaceC12369g.h.f41613a)) {
            return InterfaceC14770c.h.f54744a;
        }
        if (domainState.equals(InterfaceC12369g.j.f41615a)) {
            return InterfaceC14770c.j.f54746a;
        }
        if (domainState.equals(InterfaceC12369g.i.f41614a)) {
            return InterfaceC14770c.i.f54745a;
        }
        if (domainState instanceof InterfaceC12369g.k) {
            InterfaceC12369g.k kVar = (InterfaceC12369g.k) domainState;
            return new InterfaceC14770c.k(kVar.getId(), kVar.getTimestamp(), kVar.m34665c(), kVar.getNotes());
        }
        if (domainState instanceof InterfaceC12369g.a) {
            return new InterfaceC14770c.a(((InterfaceC12369g.a) domainState).getTimestamp());
        }
        if (domainState instanceof InterfaceC12369g.c) {
            return InterfaceC14770c.c.f54716a;
        }
        if (domainState.equals(InterfaceC12369g.b.f41604a)) {
            return InterfaceC14770c.b.f54715a;
        }
        if (domainState.equals(InterfaceC12369g.f.f41608a)) {
            return InterfaceC14770c.f.f54719a;
        }
        InterfaceC12369g.e eVar = InterfaceC12369g.e.f41607a;
        if (!domainState.equals(eVar) && !domainState.equals(eVar)) {
            throw new NoWhenBranchMatchedException();
        }
        return InterfaceC14770c.e.f54718a;
    }

    public /* synthetic */ C14771d(InterfaceC34116n interfaceC34116n, InterfaceC18260e interfaceC18260e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC34116n.INSTANCE.m107848a("LabradorReducer") : interfaceC34116n, interfaceC18260e);
    }
}
