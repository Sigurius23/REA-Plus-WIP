package si0;

import com.whoop.archv2.model.template.TemplateBackgroundTheme;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import ti0.EnumC33847l;

/* JADX INFO: renamed from: si0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;", "Lti0/l;", "a", "(Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;)Lti0/l;", "arch-v2_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32536b {

    /* JADX INFO: renamed from: si0.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f134841a;

        static {
            int[] iArr = new int[TemplateBackgroundTheme.values().length];
            try {
                iArr[TemplateBackgroundTheme.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TemplateBackgroundTheme.AI_CHAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TemplateBackgroundTheme.DARK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TemplateBackgroundTheme.AMERICA_250.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TemplateBackgroundTheme.WHOOP_BACKGROUND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TemplateBackgroundTheme.TREND_NEGATIVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TemplateBackgroundTheme.PROGRAM_HOME.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TemplateBackgroundTheme.MENSTRUAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TemplateBackgroundTheme.FOLLICULAR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[TemplateBackgroundTheme.OVULATORY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[TemplateBackgroundTheme.LUTEAL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[TemplateBackgroundTheme.HORMONAL_BIRTH_CONTROL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[TemplateBackgroundTheme.NO_PHASE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f134841a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final EnumC33847l m101547a(TemplateBackgroundTheme templateBackgroundTheme) {
        switch (templateBackgroundTheme == null ? -1 : a.f134841a[templateBackgroundTheme.ordinal()]) {
            case -1:
                return EnumC33847l.DEFAULT;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return EnumC33847l.DEFAULT;
            case 2:
                return EnumC33847l.AI_CHAT;
            case 3:
                return EnumC33847l.DARK;
            case 4:
                return EnumC33847l.AMERICA_250;
            case 5:
                return EnumC33847l.WHOOP_BACKGROUND;
            case 6:
                return EnumC33847l.TREND_NEGATIVE;
            case 7:
                return EnumC33847l.PROGRAM_HOME;
            case 8:
                return EnumC33847l.MENSTRUAL;
            case 9:
                return EnumC33847l.FOLLICULAR;
            case 10:
                return EnumC33847l.OVULATORY;
            case 11:
                return EnumC33847l.LUTEAL;
            case 12:
                return EnumC33847l.HORMONAL_BIRTH_CONTROL;
            case 13:
                return EnumC33847l.NO_PHASE;
        }
    }
}
