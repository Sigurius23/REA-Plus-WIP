package k72;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.sage.onboarding.domain.models.ManualBloodPressureReadingInput;
import com.whoop.sage.onboarding.domain.models.SageGuideline;
import com.whoop.sage.onboarding.domain.models.SageInfoCheckboxSection;
import com.whoop.sage.onboarding.domain.models.SageInputRange;
import com.whoop.sage.onboarding.domain.models.SageManualReadingInputScreen;
import com.whoop.sage.onboarding.domain.models.SageManualReadingInputSectionText;
import com.whoop.sage.onboarding.domain.models.SageOnboardingContent;
import com.whoop.sage.onboarding.domain.models.SageOnboardingGuidelinesAcknowledgeScreen;
import com.whoop.sage.onboarding.domain.models.SageOnboardingInfoCheckboxScreen;
import com.whoop.sage.onboarding.domain.models.SageOnboardingInformationScreen;
import com.whoop.sage.onboarding.domain.models.SageOnboardingResponse;
import com.whoop.sage.onboarding.domain.models.SageOnboardingScreen;
import com.whoop.sage.onboarding.domain.models.SageOnboardingSelectionOption;
import com.whoop.sage.onboarding.domain.models.SageOnboardingSelectionScreen;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import g72.AbstractC15548b;
import g72.C15552f;
import hy0.C17731c2;
import hy0.EnumC17727b2;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j72.AbstractC21405j;
import j72.C21396a;
import j72.C21397b;
import j72.C21398c;
import j72.C21399d;
import j72.C21400e;
import j72.C21401f;
import j72.C21407l;
import j72.C21408m;
import j72.C21409n;
import j72.EnumC21402g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: k72.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0015\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b!\u0010\"J%\u0010$\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020#2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b$\u0010%¨\u0006'"}, m65681d2 = {"Lk72/a;", "", "<init>", "()V", "Lg72/b$g;", "domainResult", "Lj72/j;", "b", "(Lg72/b$g;)Lj72/j;", "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInformationScreen;", "content", "Lj72/g;", "screenId", "e", "(Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInformationScreen;Lj72/g;)Lj72/j;", "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingSelectionScreen;", "Lg72/f;", "saveRequest", "g", "(Lcom/whoop/sage/onboarding/domain/models/SageOnboardingSelectionScreen;Lj72/g;Lg72/f;)Lj72/j;", "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;", "d", "(Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;Lj72/g;Lg72/f;)Lj72/j;", "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingGuidelinesAcknowledgeScreen;", "c", "(Lcom/whoop/sage/onboarding/domain/models/SageOnboardingGuidelinesAcknowledgeScreen;Lj72/g;)Lj72/j;", "Lcom/whoop/sage/onboarding/domain/models/SageGuideline;", "Lj72/a$a;", "i", "(Lcom/whoop/sage/onboarding/domain/models/SageGuideline;)Lj72/a$a;", "Lec3/l;", "Lg72/b;", "upstream", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lec3/l;)Lec3/l;", "Lcom/whoop/sage/onboarding/domain/models/SageManualReadingInputScreen;", "f", "(Lcom/whoop/sage/onboarding/domain/models/SageManualReadingInputScreen;Lj72/g;Lg72/f;)Lj72/j;", "a", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22270a {

    /* JADX INFO: renamed from: b */
    private static final SageInputRange f86900b = new SageInputRange(90, 180, "");

    /* JADX INFO: renamed from: c */
    private static final SageInputRange f86901c = new SageInputRange(60, 120, "");

    /* JADX INFO: renamed from: k72.a$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f86902w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22270a f86903x;

        /* JADX INFO: renamed from: k72.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f86904w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22270a f86905x;

            /* JADX INFO: renamed from: k72.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.sage.onboarding.presentation.reducers.SageOnboardingViewStateReducer$reduce$$inlined$map$1$2", m100430f = "SageOnboardingViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41877a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f86906E;

                /* JADX INFO: renamed from: F */
                Object f86907F;

                /* JADX INFO: renamed from: G */
                Object f86908G;

                /* JADX INFO: renamed from: H */
                int f86909H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f86910w;

                /* JADX INFO: renamed from: x */
                int f86911x;

                /* JADX INFO: renamed from: y */
                Object f86912y;

                public C41877a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f86910w = obj;
                    this.f86911x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C22270a c22270a) {
                this.f86904w = interfaceC13062m;
                this.f86905x = c22270a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41877a c41877a;
                Object mVar;
                Object objM63989b;
                if (interfaceC30057d instanceof C41877a) {
                    c41877a = (C41877a) interfaceC30057d;
                    int i13 = c41877a.f86911x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41877a.f86911x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41877a = new C41877a(interfaceC30057d);
                    }
                } else {
                    c41877a = new C41877a(interfaceC30057d);
                }
                Object obj2 = c41877a.f86910w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41877a.f86911x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f86904w;
                    AbstractC15548b abstractC15548b = (AbstractC15548b) obj;
                    if (abstractC15548b instanceof AbstractC15548b.b) {
                        objM63989b = AbstractC21405j.f.f82062a;
                    } else if (AbstractC22676k.m65745e(abstractC15548b, AbstractC15548b.a.f58316a)) {
                        objM63989b = AbstractC21405j.a.f82056a;
                    } else if (AbstractC22676k.m65745e(abstractC15548b, AbstractC15548b.d.f58320a)) {
                        objM63989b = AbstractC21405j.j.f82067a;
                    } else if (abstractC15548b instanceof AbstractC15548b.e) {
                        objM63989b = AbstractC21405j.k.f82068a;
                    } else if (abstractC15548b instanceof AbstractC15548b.g) {
                        objM63989b = this.f86905x.m63989b((AbstractC15548b.g) abstractC15548b);
                    } else {
                        if (abstractC15548b instanceof AbstractC15548b.c) {
                            AbstractC15548b.c cVar = (AbstractC15548b.c) abstractC15548b;
                            mVar = new AbstractC21405j.i(cVar.getProgressResult(), cVar.getSaveRequest());
                        } else {
                            if (!(abstractC15548b instanceof AbstractC15548b.f)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            AbstractC15548b.f fVar = (AbstractC15548b.f) abstractC15548b;
                            mVar = new AbstractC21405j.m(new C21409n(fVar.getVarianceDialog().getTitleDisplay(), fVar.getVarianceDialog().getDescriptionDisplay(), fVar.getVarianceDialog().getPrimaryButtonDisplay(), fVar.getVarianceDialog().getSecondaryButtonDisplay()), fVar.getProgressResult(), fVar.getSaveRequest());
                        }
                        objM63989b = mVar;
                    }
                    c41877a.f86912y = null;
                    c41877a.f86906E = null;
                    c41877a.f86907F = null;
                    c41877a.f86908G = null;
                    c41877a.f86909H = 0;
                    c41877a.f86911x = 1;
                    if (interfaceC13062m.emit(objM63989b, c41877a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public b(InterfaceC13058l interfaceC13058l, C22270a c22270a) {
            this.f86902w = interfaceC13058l;
            this.f86903x = c22270a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f86902w.collect(new a(interfaceC13062m, this.f86903x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final AbstractC21405j m63989b(AbstractC15548b.g domainResult) {
        SageOnboardingContent content;
        EnumC21402g currentScreen = domainResult.getProgressResult().getCurrentScreen();
        SageOnboardingResponse response = domainResult.getResponse();
        if (domainResult.getShouldExit()) {
            return AbstractC21405j.b.f82057a;
        }
        SageOnboardingScreen orDefault = response.getScreens().getOrDefault(currentScreen, null);
        if (orDefault == null || (content = orDefault.getContent()) == null) {
            return AbstractC21405j.h.f82064a;
        }
        if (content instanceof SageOnboardingSelectionScreen) {
            return m63993g((SageOnboardingSelectionScreen) content, currentScreen, domainResult.getSaveRequest());
        }
        if (content instanceof SageManualReadingInputScreen) {
            return m63995f((SageManualReadingInputScreen) content, currentScreen, domainResult.getSaveRequest());
        }
        if (content instanceof SageOnboardingInfoCheckboxScreen) {
            return m63991d((SageOnboardingInfoCheckboxScreen) content, currentScreen, domainResult.getSaveRequest());
        }
        if (content instanceof SageOnboardingGuidelinesAcknowledgeScreen) {
            return m63990c((SageOnboardingGuidelinesAcknowledgeScreen) content, currentScreen);
        }
        return content instanceof SageOnboardingInformationScreen ? m63992e((SageOnboardingInformationScreen) content, currentScreen) : AbstractC21405j.h.f82064a;
    }

    /* JADX INFO: renamed from: c */
    private final AbstractC21405j m63990c(SageOnboardingGuidelinesAcknowledgeScreen content, EnumC21402g screenId) {
        AbstractC22403o abstractC22403oM64503l = AbstractC22404p.m64503l(content.getBackgroundImageUrl());
        String titleDisplay = content.getTitleDisplay();
        List<SageGuideline> guidelines = content.getGuidelines();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(guidelines, 10));
        Iterator<T> it = guidelines.iterator();
        while (it.hasNext()) {
            arrayList.add(m63994i((SageGuideline) it.next()));
        }
        return new AbstractC21405j.c(new C21396a(screenId, abstractC22403oM64503l, titleDisplay, arrayList, content.getPrimaryButtonTextDisplay(), content.getSecondaryButtonTextDisplay(), content.getPrimaryButtonNextId(), content.getSecondaryButtonNavigation()));
    }

    /* JADX INFO: renamed from: d */
    private final AbstractC21405j m63991d(SageOnboardingInfoCheckboxScreen content, EnumC21402g screenId, C15552f saveRequest) {
        AbstractC22403o.c cVar = new AbstractC22403o.c(content.getImageUrl(), 0, 0, 0, 14, null);
        String title = content.getTitle();
        String subtitle = content.getSubtitle();
        List<SageInfoCheckboxSection> sections = content.getSections();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sections, 10));
        for (SageInfoCheckboxSection sageInfoCheckboxSection : sections) {
            arrayList.add(new C21400e(sageInfoCheckboxSection.getTitle(), sageInfoCheckboxSection.getSubtitle()));
        }
        return new AbstractC21405j.d(new C21397b(screenId, cVar, title, subtitle, arrayList, content.getCheckboxText(), content.getNextButtonText(), content.getButtonNextId(), saveRequest.m43787d().contains(screenId)));
    }

    /* JADX INFO: renamed from: e */
    private final AbstractC21405j m63992e(SageOnboardingInformationScreen content, EnumC21402g screenId) {
        return new AbstractC21405j.e(new C21398c(screenId, new AbstractC22403o.c(content.getImageUrl(), 0, 0, 0, 14, null), content.getSupertitle(), content.getTitle(), content.getSubtitle(), content.getNextButtonText(), content.getButtonNextId()));
    }

    /* JADX INFO: renamed from: g */
    private final AbstractC21405j m63993g(SageOnboardingSelectionScreen content, EnumC21402g screenId, C15552f saveRequest) {
        TextResource textResourceM21278l = AbstractC8693b.m21278l(content.getTitle());
        List<SageOnboardingSelectionOption> options = content.getOptions();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(options, 10));
        for (SageOnboardingSelectionOption sageOnboardingSelectionOption : options) {
            arrayList.add(new C21407l(AbstractC8693b.m21278l(sageOnboardingSelectionOption.getTitle()), sageOnboardingSelectionOption.getOptionId(), saveRequest.m43785b().getOrDefault(screenId, C25271y.f99162w).contains(sageOnboardingSelectionOption.getOptionId())));
        }
        return new AbstractC21405j.l(new C21408m(screenId, textResourceM21278l, AbstractC8693b.m21278l(content.getButtonTitle()), arrayList, content.getOptionLimit(), content.getButtonNextId()));
    }

    /* JADX INFO: renamed from: i */
    private final C21396a.a m63994i(SageGuideline sageGuideline) {
        EnumC17727b2 enumC17727b2;
        TextResource textResourceM21278l = AbstractC8693b.m21278l("");
        String leftTrendIcon = sageGuideline.getLeftTrendIcon();
        EnumC17727b2 enumC17727b3 = EnumC17727b2.NONE;
        EnumC17727b2[] enumC17727b2ArrValues = EnumC17727b2.values();
        int length = enumC17727b2ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC17727b2 = null;
                break;
            }
            enumC17727b2 = enumC17727b2ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC17727b2.name(), leftTrendIcon)) {
                break;
            }
            i13++;
        }
        return new C21396a.a(new C17731c2(textResourceM21278l, true, enumC17727b2 == null ? enumC17727b3 : enumC17727b2, false, null, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32760, null), sageGuideline.getTextDisplay());
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC21405j m63995f(SageManualReadingInputScreen content, EnumC21402g screenId, C15552f saveRequest) {
        AbstractC22676k.m65750j(content, "content");
        AbstractC22676k.m65750j(screenId, "screenId");
        AbstractC22676k.m65750j(saveRequest, "saveRequest");
        String titleDisplay = content.getTitleDisplay();
        String descriptionDisplay = content.getDescriptionDisplay();
        List<SageManualReadingInputSectionText> inputSections = content.getInputSections();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(inputSections, 10));
        int i13 = 0;
        for (Object obj : inputSections) {
            int i14 = i13 + 1;
            Integer numValueOf = null;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            SageManualReadingInputSectionText sageManualReadingInputSectionText = (SageManualReadingInputSectionText) obj;
            ManualBloodPressureReadingInput manualBloodPressureReadingInput = (ManualBloodPressureReadingInput) AbstractC25265s.m74102I0(i13, saveRequest.m43786c());
            Integer numValueOf2 = manualBloodPressureReadingInput != null ? Integer.valueOf(manualBloodPressureReadingInput.getSystolicMmhg()) : null;
            if (manualBloodPressureReadingInput != null) {
                numValueOf = Integer.valueOf(manualBloodPressureReadingInput.getDiastolicMmhg());
            }
            arrayList.add(new C21401f(sageManualReadingInputSectionText, numValueOf2, numValueOf));
            i13 = i14;
        }
        String nextButtonText = content.getNextButtonText();
        EnumC21402g buttonNextId = content.getButtonNextId();
        SageInputRange systolicRange = content.getSystolicRange();
        if (systolicRange == null) {
            systolicRange = f86900b;
        }
        SageInputRange sageInputRange = systolicRange;
        SageInputRange diastolicRange = content.getDiastolicRange();
        if (diastolicRange == null) {
            diastolicRange = f86901c;
        }
        return new AbstractC21405j.g(new C21399d(screenId, titleDisplay, descriptionDisplay, arrayList, nextButtonText, buttonNextId, sageInputRange, diastolicRange));
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC13058l m63996h(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new b(upstream, this);
    }
}
