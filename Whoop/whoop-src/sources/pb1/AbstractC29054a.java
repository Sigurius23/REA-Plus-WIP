package pb1;

import com.whoop.design.models.items.TagStyle;
import com.whoop.design.models.items.TileTagModel;
import i21.C18011u;
import i21.EnumC18012v;
import l83.C23471q;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: pb1.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/design/models/items/TileTagModel;", "Li21/u;", "a", "(Lcom/whoop/design/models/items/TileTagModel;)Li21/u;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29054a {

    /* JADX INFO: renamed from: pb1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f117567a;

        static {
            int[] iArr = new int[TagStyle.values().length];
            try {
                iArr[TagStyle.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TagStyle.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TagStyle.NEUTRAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TagStyle.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TagStyle.NEW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TagStyle.AUTOMATED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TagStyle.CONFUSING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f117567a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final C18011u m88313a(TileTagModel tileTagModel) {
        TagStyle tagStyle;
        C23471q c23471q;
        AbstractC22676k.m65750j(tileTagModel, "<this>");
        String tagStyle2 = tileTagModel.getTagStyle();
        TagStyle tagStyle3 = TagStyle.NEUTRAL;
        TagStyle[] tagStyleArrValues = TagStyle.values();
        int length = tagStyleArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                tagStyle = null;
                break;
            }
            tagStyle = tagStyleArrValues[i13];
            if (AbstractC22676k.m65745e(tagStyle.name(), tagStyle2)) {
                break;
            }
            i13++;
        }
        if (tagStyle != null) {
            tagStyle3 = tagStyle;
        }
        switch (a.f117567a[tagStyle3.ordinal()]) {
            case 1:
                c23471q = new C23471q(EnumC18012v.POSITIVE, EnumC39333f.ACCENT_POSITIVE_TREND_15, EnumC39333f.ACCENT_POSITIVE_TREND);
                break;
            case 2:
                c23471q = new C23471q(EnumC18012v.NEGATIVE, EnumC39333f.ACCENT_NEGATIVE_TREND_15, EnumC39333f.ACCENT_NEGATIVE_TREND);
                break;
            case 3:
            case 4:
                c23471q = new C23471q(EnumC18012v.NEUTRAL, EnumC39333f.NEUTRAL_15, EnumC39333f.BRAND_WHITE);
                break;
            case 5:
                c23471q = new C23471q(EnumC18012v.NEW, EnumC39333f.NEUTRAL_15, EnumC39333f.RECOVERY);
                break;
            case 6:
                c23471q = new C23471q(EnumC18012v.AUTO_DETECTED, EnumC39333f.NEUTRAL_15, EnumC39333f.RECOVERY);
                break;
            case 7:
                c23471q = new C23471q(EnumC18012v.TREND_INDICATOR, EnumC39333f.NEUTRAL_15, EnumC39333f.RECOVERY);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new C18011u((EnumC18012v) c23471q.f92947w, tileTagModel.getTagTitleDisplay(), (EnumC39333f) c23471q.f92948x, (EnumC39333f) c23471q.f92949y);
    }
}
