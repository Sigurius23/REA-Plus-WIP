package b42;

import c42.C4164a;
import c42.C4165b;
import c42.C4166c;
import c42.C4167d;
import c42.C4168e;
import c42.C4169f;
import c42.C4170g;
import c42.C4171h;
import c42.C4180q;
import c42.C4181r;
import c42.C4182s;
import c42.C4183t;
import c42.C4184u;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.educationModels.EducationDtoToModelMapperKt;
import com.whoop.educationModels.FeatureEducationDto;
import com.whoop.educationModels.NavBarDto;
import com.whoop.pregnancy.api.DueDateDto;
import com.whoop.pregnancy.api.DueDateOptionsDto;
import com.whoop.pregnancy.api.ExitDialogDto;
import com.whoop.pregnancy.api.PregnancyDTO;
import com.whoop.pregnancy.api.PregnancyDueDateSavedScreenDto;
import com.whoop.pregnancy.api.PregnancyDueDateScreenDto;
import com.whoop.pregnancy.api.PregnancyOnboardingDto;
import com.whoop.pregnancy.api.PregnancySettingsDto;
import com.whoop.pregnancy.api.PregnancyToggleDto;
import com.whoop.pregnancy.api.PregnancyWelcomeScreenDto;
import com.whoop.pregnancy.api.PrivacyDto;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import gz0.EnumC16313m0;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import l83.C23454a0;
import l83.C23471q;
import m83.AbstractC25267u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import y71.C39274g;
import y71.C39282o;
import z32.AbstractC40050b;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: b42.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Lb42/a;", "", "Lzr2/a;", "dateAndTimeProvider", "<init>", "(Lzr2/a;)V", "Lcom/whoop/pregnancy/api/PregnancySettingsDto;", "settingsDto", "Lcom/whoop/educationModels/FeatureEducationDto;", "pregnancyEducation", "Lc42/r;", "f", "(Lcom/whoop/pregnancy/api/PregnancySettingsDto;Lcom/whoop/educationModels/FeatureEducationDto;)Lc42/r;", "Lcom/whoop/pregnancy/api/PregnancyOnboardingDto;", "dto", "d", "(Lcom/whoop/pregnancy/api/PregnancyOnboardingDto;)Lc42/r;", "", "currentDate", "Ll83/q;", "", "c", "(Ljava/lang/String;)Ll83/q;", "Lec3/l;", "Lz32/b;", "upstream", "e", "(Lec3/l;)Lec3/l;", "a", "Lzr2/a;", "getDateAndTimeProvider", "()Lzr2/a;", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C2719a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: b42.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.pregnancy.reducer.PregnancySettingsViewStateReducer$reduce$1", m100430f = "PregnancySettingsViewStateReducer.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lc42/r;", "previousViewState", "Lz32/b;", "currentDomainState", "<anonymous>", "(Lc42/r;Lz32/b;)Lc42/r;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f10723w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f10724x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f10725y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C4181r c4181r, AbstractC40050b abstractC40050b, InterfaceC30057d<? super C4181r> interfaceC30057d) {
            a aVar = C2719a.this.new a(interfaceC30057d);
            aVar.f10724x = c4181r;
            aVar.f10725y = abstractC40050b;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C4181r c4181r = (C4181r) this.f10724x;
            AbstractC40050b abstractC40050b = (AbstractC40050b) this.f10725y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f10723w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC22676k.m65745e(abstractC40050b, AbstractC40050b.f.f172789a)) {
                return new C4181r(false, true, false, false, null, null, null, null, null, 509, null);
            }
            if (abstractC40050b instanceof AbstractC40050b.e) {
                AbstractC40050b.e eVar = (AbstractC40050b.e) abstractC40050b;
                return C2719a.this.m7671f(eVar.getSettingsDto(), eVar.getPregnancyEducation());
            }
            if (abstractC40050b instanceof AbstractC40050b.b) {
                AbstractC40050b.b bVar = (AbstractC40050b.b) abstractC40050b;
                return C2719a.this.m7671f(bVar.getSettingsDto(), bVar.getPregnancyEducation());
            }
            if (AbstractC22676k.m65745e(abstractC40050b, AbstractC40050b.c.f172783a)) {
                return C4181r.m13054b(c4181r, false, false, true, false, null, null, null, null, null, 505, null);
            }
            if (abstractC40050b instanceof AbstractC40050b.a) {
                return C4181r.m13054b(C2719a.this.m7670d(((AbstractC40050b.a) abstractC40050b).getOnboardingDto()), false, false, false, false, null, c4181r.getSettingsScreenViewState(), null, null, null, 479, null);
            }
            if (abstractC40050b instanceof AbstractC40050b.d) {
                AbstractC40050b.d dVar = (AbstractC40050b.d) abstractC40050b;
                C4181r c4181rM7671f = C2719a.this.m7671f(dVar.getSettingsDto(), dVar.getPregnancyEducation());
                PregnancyDueDateSavedScreenDto dueDateSavedDto = dVar.getDueDateSavedDto();
                return C4181r.m13054b(c4181rM7671f, false, false, false, false, null, null, null, new C4168e(AbstractC8693b.m21278l(dueDateSavedDto.getTitle()), AbstractC8693b.m21278l(dueDateSavedDto.getSubtitle()), AbstractC8693b.m21278l(dueDateSavedDto.getDescription()), AbstractC8693b.m21278l(dueDateSavedDto.getButton()), dueDateSavedDto.getBackgroundImageUrl()), null, 383, null);
            }
            if (AbstractC22676k.m65745e(abstractC40050b, AbstractC40050b.h.f172791a)) {
                return C4181r.m13054b(c4181r, true, false, false, false, null, null, null, null, null, 502, null);
            }
            if (abstractC40050b instanceof AbstractC40050b.g) {
                return C4181r.m13054b(c4181r, false, false, false, true, ((AbstractC40050b.g) abstractC40050b).getPreviousDueDate(), null, null, null, null, 486, null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public C2719a(InterfaceC41070a dateAndTimeProvider) {
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        this.dateAndTimeProvider = dateAndTimeProvider;
    }

    /* JADX INFO: renamed from: c */
    private final C23471q m7669c(String currentDate) throws ParseException {
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(currentDate);
        Calendar calendar = Calendar.getInstance();
        if (date == null) {
            date = this.dateAndTimeProvider.mo133364c().toDate();
        }
        calendar.setTime(date);
        return new C23471q(Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2)), Integer.valueOf(calendar.get(5)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final C4181r m7670d(PregnancyOnboardingDto dto) {
        PregnancyWelcomeScreenDto welcomeScreen = dto.getWelcomeScreen();
        C4169f c4169f = new C4169f(AbstractC8693b.m21278l(welcomeScreen.getTitle()), AbstractC8693b.m21278l(welcomeScreen.getDescription()), AbstractC8693b.m21278l(welcomeScreen.getButton()), welcomeScreen.getBackgroundImageUrl());
        PregnancyDueDateScreenDto dueDateScreen = dto.getDueDateScreen();
        return new C4181r(false, false, false, false, null, null, new C4171h(c4169f, new C4167d(AbstractC8693b.m21278l(dueDateScreen.getTitle()), AbstractC8693b.m21278l(dueDateScreen.getDescription()), AbstractC8693b.m21278l(dueDateScreen.getButton()), dueDateScreen.getCurrentDate(), dueDateScreen.getMaxDate(), dueDateScreen.getMinDate(), m7669c(dueDateScreen.getCurrentDate()))), null, null, 447, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final C4181r m7671f(PregnancySettingsDto settingsDto, FeatureEducationDto pregnancyEducation) {
        TextResource textResourceM21267a;
        C4170g c4170g;
        String title;
        PregnancyToggleDto pregnancyToggle = settingsDto.getPregnancyToggle();
        C4182s c4182s = new C4182s(AbstractC8693b.m21278l(pregnancyToggle.getTitle()), pregnancyToggle.getEnabled(), AbstractC8693b.m21278l(pregnancyToggle.getDescription()));
        DueDateDto dueDate = settingsDto.getDueDate();
        C4165b c4165b = new C4165b(AbstractC8693b.m21278l(dueDate.getTitle()), AbstractC8693b.m21278l(dueDate.getDate()));
        PrivacyDto privacy = settingsDto.getPrivacy();
        C4184u c4184u = new C4184u(AbstractC8693b.m21278l(privacy.getTitle()), AbstractC8693b.m21278l(privacy.getDescription()), AbstractC8693b.m21278l(privacy.getCtaText()), privacy.getCtaUrl());
        DueDateOptionsDto dueDateOptions = settingsDto.getDueDateOptions();
        C4164a c4164a = new C4164a(AbstractC8693b.m21278l(dueDateOptions.getTitle()), AbstractC8693b.m21278l(dueDateOptions.getButton()), dueDateOptions.getCurrentDate(), dueDateOptions.getMaxDate(), dueDateOptions.getMinDate(), m7669c(dueDateOptions.getCurrentDate()));
        ExitDialogDto exitDialog = settingsDto.getExitDialog();
        C4166c c4166c = new C4166c(AbstractC8693b.m21278l(exitDialog.getSubtitle()), AbstractC8693b.m21278l(exitDialog.getTitle()), AbstractC8693b.m21278l(exitDialog.getDescription()), AbstractC8693b.m21278l(exitDialog.getFeaturedDescription()), AbstractC8693b.m21278l(exitDialog.getCtaText()), exitDialog.getCtaUrl(), AbstractC8693b.m21278l(exitDialog.getDismissText()));
        NavBarDto navBar = pregnancyEducation.getNavBar();
        if (navBar == null || (title = navBar.getTitle()) == null || (textResourceM21267a = AbstractC8693b.m21278l(title)) == null) {
            textResourceM21267a = AbstractC8693b.m21267a();
        }
        C4170g c4170g2 = new C4170g(textResourceM21267a, EducationDtoToModelMapperKt.toStressEducationSections(pregnancyEducation));
        C4183t c4183t = null;
        if (settingsDto.getPreviousPregnanciesSection() != null) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l(settingsDto.getPreviousPregnanciesSection().getTitle());
            List<PregnancyDTO> pregnancies = settingsDto.getPreviousPregnanciesSection().getPregnancies();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(pregnancies, 10));
            for (PregnancyDTO pregnancyDTO : pregnancies) {
                C39282o.Companion companion = C39282o.INSTANCE;
                TextResource textResourceM21278l2 = AbstractC8693b.m21278l(pregnancyDTO.getTitle());
                TextResource textResourceM21278l3 = AbstractC8693b.m21278l(pregnancyDTO.getSubtitle());
                String leftIcon = pregnancyDTO.getLeftIcon();
                arrayList.add(C39282o.Companion.m125229d(companion, textResourceM21278l2, null, null, textResourceM21278l3, null, leftIcon != null ? new C39274g(EnumC16313m0.valueOf(leftIcon).toWhoopIcon(), null, 2, null) : null, null, null, null, null, null, null, null, null, false, false, pregnancyDTO.getDestination(), false, null, null, null, false, null, 8323030, null));
                c4170g2 = c4170g2;
            }
            c4170g = c4170g2;
            c4183t = new C4183t(textResourceM21278l, arrayList);
        } else {
            c4170g = c4170g2;
        }
        return new C4181r(false, false, false, false, null, new C4180q(c4182s, c4165b, c4184u, c4166c, c4164a, c4183t), null, null, c4170g, 223, null);
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC13058l m7672e(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C4181r(false, true, false, false, null, null, null, null, null, 509, null), upstream, new a(null));
    }
}
