package ip1;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.postpartum.domain.models.CongratulationsScreen;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalNameScreen;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalNumberPickerScreen;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalSaveScreen;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreen;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenContent;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalTextInputScreen;
import com.whoop.hormonalinsights.postpartum.domain.models.PostPartumResponse;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fp1.C14676d;
import fp1.InterfaceC14677e;
import gz0.EnumC16313m0;
import hp1.AbstractC17548h;
import hp1.C17541a;
import hp1.C17545e;
import hp1.C17549i;
import hp1.C17550j;
import hp1.C17551k;
import hp1.C17552l;
import hp1.C17553m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Iterator;
import kd1.AbstractC22403o;
import l83.C23454a0;
import l83.C23464j;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: ip1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\n\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010$J!\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060%2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%¢\u0006\u0004\b(\u0010)¨\u0006*"}, m65681d2 = {"Lip1/a;", "", "<init>", "()V", "Lfp1/e$f;", "domainResult", "Lhp1/h;", "b", "(Lfp1/e$f;)Lhp1/h;", "Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;", "result", "Lhp1/h$a;", "c", "(Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;)Lhp1/h$a;", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;", "Lhp1/h$b;", "d", "(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;)Lhp1/h$b;", "Lhp1/h$g;", "f", "(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;)Lhp1/h$g;", "Lhp1/h$k;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;)Lhp1/h$k;", "Lfp1/d;", "saveData", "Lhp1/h$m;", "i", "(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;Lfp1/d;)Lhp1/h$m;", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "screenId", "Lhp1/h$e;", "e", "(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;)Lhp1/h$e;", "Lhp1/h$h;", "g", "(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;)Lhp1/h$h;", "Lec3/l;", "Lfp1/e;", "upstream", "j", "(Lec3/l;)Lec3/l;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C20812a {

    /* JADX INFO: renamed from: ip1.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f78140a;

        static {
            int[] iArr = new int[HormonalScreenId.values().length];
            try {
                iArr[HormonalScreenId.CELEBRATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HormonalScreenId.DELIVERY_DATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HormonalScreenId.CHILDREN_COUNT_NUMBER_PICKER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HormonalScreenId.POST_PARTUM_CONTINUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HormonalScreenId.CHILDREN_WEIGHTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HormonalScreenId.CHILDREN_COUNT_MULTI_SELECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HormonalScreenId.DELIVERY_METHOD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HormonalScreenId.PREGNANCY_NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[HormonalScreenId.UPDATE_PREGNANCY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[HormonalScreenId.UNKNOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f78140a = iArr;
        }
    }

    /* JADX INFO: renamed from: ip1.a$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f78141w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C20812a f78142x;

        /* JADX INFO: renamed from: ip1.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f78143w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C20812a f78144x;

            /* JADX INFO: renamed from: ip1.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.postpartum.presentation.reducers.PostPartumViewStateReducer$reduce$$inlined$map$1$2", m100430f = "PostPartumViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41775a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f78145E;

                /* JADX INFO: renamed from: F */
                Object f78146F;

                /* JADX INFO: renamed from: G */
                Object f78147G;

                /* JADX INFO: renamed from: H */
                int f78148H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f78149w;

                /* JADX INFO: renamed from: x */
                int f78150x;

                /* JADX INFO: renamed from: y */
                Object f78151y;

                public C41775a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f78149w = obj;
                    this.f78150x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C20812a c20812a) {
                this.f78143w = interfaceC13062m;
                this.f78144x = c20812a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41775a c41775a;
                Object objM57389b;
                Object iVar;
                if (interfaceC30057d instanceof C41775a) {
                    c41775a = (C41775a) interfaceC30057d;
                    int i13 = c41775a.f78150x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41775a.f78150x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41775a = new C41775a(interfaceC30057d);
                    }
                } else {
                    c41775a = new C41775a(interfaceC30057d);
                }
                Object obj2 = c41775a.f78149w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41775a.f78150x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f78143w;
                    InterfaceC14677e interfaceC14677e = (InterfaceC14677e) obj;
                    if (AbstractC22676k.m65745e(interfaceC14677e, InterfaceC14677e.b.f54201a)) {
                        objM57389b = AbstractC17548h.d.f67920a;
                    } else {
                        if (interfaceC14677e instanceof InterfaceC14677e.a) {
                            InterfaceC14677e.a aVar = (InterfaceC14677e.a) interfaceC14677e;
                            iVar = new AbstractC17548h.c(aVar.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), aVar.getId());
                        } else if (interfaceC14677e instanceof InterfaceC14677e.f) {
                            objM57389b = this.f78144x.m57389b((InterfaceC14677e.f) interfaceC14677e);
                        } else if (interfaceC14677e instanceof InterfaceC14677e.c) {
                            iVar = new AbstractC17548h.i(((InterfaceC14677e.c) interfaceC14677e).getIsStealthModeOn());
                        } else if (interfaceC14677e instanceof InterfaceC14677e.e) {
                            objM57389b = AbstractC17548h.l.f67931a;
                        } else {
                            if (!AbstractC22676k.m65745e(interfaceC14677e, InterfaceC14677e.d.f54205a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            objM57389b = AbstractC17548h.j.f67928a;
                        }
                        objM57389b = iVar;
                    }
                    c41775a.f78151y = null;
                    c41775a.f78145E = null;
                    c41775a.f78146F = null;
                    c41775a.f78147G = null;
                    c41775a.f78148H = 0;
                    c41775a.f78150x = 1;
                    if (interfaceC13062m.emit(objM57389b, c41775a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C20812a c20812a) {
            this.f78141w = interfaceC13058l;
            this.f78142x = c20812a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f78141w.collect(new a(interfaceC13062m, this.f78142x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final AbstractC17548h m57389b(InterfaceC14677e.f domainResult) {
        Object next;
        AbstractC17548h.b bVarM57391d;
        AbstractC17548h.g gVarM57393f;
        AbstractC17548h.k kVarM57395h;
        AbstractC17548h.m mVarM57396i;
        AbstractC17548h.e eVarM57392e;
        AbstractC17548h.h hVarM57394g;
        HormonalScreenId currentScreen = domainResult.getProgressResult().getCurrentScreen();
        PostPartumResponse response = domainResult.getResponse();
        C14676d saveRequest = domainResult.getSaveRequest();
        Iterator<T> it = response.getScreens().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((HormonalScreen) next).getId() != currentScreen);
        HormonalScreen hormonalScreen = (HormonalScreen) next;
        switch (a.f78140a[currentScreen.ordinal()]) {
            case 1:
                return m57390c(response.getCongratulationsScreen());
            case 2:
                return (hormonalScreen == null || (bVarM57391d = m57391d(hormonalScreen)) == null) ? AbstractC17548h.f.f67922a : bVarM57391d;
            case 3:
                return (hormonalScreen == null || (gVarM57393f = m57393f(hormonalScreen)) == null) ? AbstractC17548h.f.f67922a : gVarM57393f;
            case 4:
                return (hormonalScreen == null || (kVarM57395h = m57395h(hormonalScreen)) == null) ? AbstractC17548h.f.f67922a : kVarM57395h;
            case 5:
                return (hormonalScreen == null || (mVarM57396i = m57396i(hormonalScreen, saveRequest)) == null) ? AbstractC17548h.f.f67922a : mVarM57396i;
            case 6:
            case 7:
                return (hormonalScreen == null || (eVarM57392e = m57392e(hormonalScreen, currentScreen)) == null) ? AbstractC17548h.f.f67922a : eVarM57392e;
            case 8:
                return (hormonalScreen == null || (hVarM57394g = m57394g(hormonalScreen)) == null) ? AbstractC17548h.f.f67922a : hVarM57394g;
            case 9:
                throw new C23464j("An operation is not implemented: HEAL-1413");
            case 10:
                return AbstractC17548h.f.f67922a;
            default:
                return AbstractC17548h.f.f67922a;
        }
    }

    /* JADX INFO: renamed from: c */
    private final AbstractC17548h.a m57390c(CongratulationsScreen result) {
        return new AbstractC17548h.a(new C17541a(new AbstractC22403o.c(result.getImageUrl(), 0, 0, 0, 14, null), AbstractC8693b.m21278l(result.getTitle()), AbstractC8693b.m21278l(result.getSubtitle()), AbstractC8693b.m21278l(result.getPrimaryButtonTitle()), result.getNextPregnancyScreen()));
    }

    /* JADX INFO: renamed from: d */
    private final AbstractC17548h.b m57391d(HormonalScreen result) {
        return new AbstractC17548h.b(AbstractC20813b.m57398a(result));
    }

    /* JADX INFO: renamed from: e */
    private final AbstractC17548h.e m57392e(HormonalScreen result, HormonalScreenId screenId) {
        return new AbstractC17548h.e(AbstractC20813b.m57400c(result, screenId, null, 4, null));
    }

    /* JADX INFO: renamed from: f */
    private final AbstractC17548h.g m57393f(HormonalScreen result) {
        HormonalScreenContent content = result.getContent();
        AbstractC22676k.m65748h(content, "null cannot be cast to non-null type com.whoop.hormonalinsights.postpartum.domain.models.HormonalNumberPickerScreen");
        return new AbstractC17548h.g(new C17545e(AbstractC8693b.m21278l(result.getNavigationTitle()), AbstractC8693b.m21278l(result.getNavigationSubtitle()), AbstractC8693b.m21278l(((HormonalNumberPickerScreen) result.getContent()).getTitle()), ((HormonalNumberPickerScreen) result.getContent()).getMinValue(), ((HormonalNumberPickerScreen) result.getContent()).getMaxValue(), AbstractC8693b.m21278l(((HormonalNumberPickerScreen) result.getContent()).getButtonTitle()), ((HormonalNumberPickerScreen) result.getContent()).getNextId()));
    }

    /* JADX INFO: renamed from: g */
    private final AbstractC17548h.h m57394g(HormonalScreen result) {
        HormonalScreenContent content = result.getContent();
        AbstractC22676k.m65748h(content, "null cannot be cast to non-null type com.whoop.hormonalinsights.postpartum.domain.models.HormonalNameScreen");
        return new AbstractC17548h.h(new C17549i(AbstractC8693b.m21278l(result.getNavigationTitle()), AbstractC8693b.m21278l(result.getNavigationSubtitle()), ((HormonalNameScreen) result.getContent()).getCurrentName(), AbstractC8693b.m21278l(((HormonalNameScreen) result.getContent()).getSaveButton())));
    }

    /* JADX INFO: renamed from: h */
    private final AbstractC17548h.k m57395h(HormonalScreen result) {
        HormonalScreenContent content = result.getContent();
        AbstractC22676k.m65748h(content, "null cannot be cast to non-null type com.whoop.hormonalinsights.postpartum.domain.models.HormonalSaveScreen");
        return new AbstractC17548h.k(new C17550j(AbstractC8693b.m21278l(result.getNavigationTitle()), AbstractC8693b.m21278l(result.getNavigationSubtitle()), AbstractC8693b.m21278l(((HormonalSaveScreen) result.getContent()).getTitle()), AbstractC8693b.m21278l(((HormonalSaveScreen) result.getContent()).getSubtitle()), new C17551k(EnumC16313m0.valueOf(((HormonalSaveScreen) result.getContent()).getStealthModeInput().getIcon()), AbstractC8693b.m21278l(((HormonalSaveScreen) result.getContent()).getStealthModeInput().getLabel()), AbstractC8693b.m21278l(((HormonalSaveScreen) result.getContent()).getStealthModeInput().getSublabel())), AbstractC8693b.m21278l(((HormonalSaveScreen) result.getContent()).getSaveButtonTitle())));
    }

    /* JADX INFO: renamed from: i */
    private final AbstractC17548h.m m57396i(HormonalScreen result, C14676d saveData) {
        HormonalScreenContent content = result.getContent();
        AbstractC22676k.m65748h(content, "null cannot be cast to non-null type com.whoop.hormonalinsights.postpartum.domain.models.HormonalTextInputScreen");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(result.getNavigationTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(result.getNavigationSubtitle());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(((HormonalTextInputScreen) result.getContent()).getSingleTitle());
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(((HormonalTextInputScreen) result.getContent()).getMultipleTitle());
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l(((HormonalTextInputScreen) result.getContent()).getButtonTitle());
        TextResource textResourceM21278l6 = AbstractC8693b.m21278l(((HormonalTextInputScreen) result.getContent()).getSkipTitle());
        HormonalScreenId skipNextId = ((HormonalTextInputScreen) result.getContent()).getSkipNextId();
        HormonalScreenId nextId = ((HormonalTextInputScreen) result.getContent()).getNextId();
        TextResource textResourceM21278l7 = AbstractC8693b.m21278l(((HormonalTextInputScreen) result.getContent()).getTextField().getTitle());
        TextResource textResourceM21278l8 = AbstractC8693b.m21278l(((HormonalTextInputScreen) result.getContent()).getTextField().getFirstTextFieldUnits());
        String secondTextFieldUnits = ((HormonalTextInputScreen) result.getContent()).getTextField().getSecondTextFieldUnits();
        return new AbstractC17548h.m(new C17553m(textResourceM21278l, textResourceM21278l2, textResourceM21278l3, textResourceM21278l4, new C17552l(textResourceM21278l7, textResourceM21278l8, secondTextFieldUnits != null ? AbstractC8693b.m21278l(secondTextFieldUnits) : null, AbstractC8693b.m21278l(((HormonalTextInputScreen) result.getContent()).getTextField().getErrorMessage()), (float) ((HormonalTextInputScreen) result.getContent()).getTextField().getMinValueG(), (float) ((HormonalTextInputScreen) result.getContent()).getTextField().getMaxValueG()), textResourceM21278l5, textResourceM21278l6, skipNextId, nextId, saveData.m41956j(), saveData.m41957k(), saveData.getBabyCount()));
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC13058l m57397j(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new b(upstream, this);
    }
}
