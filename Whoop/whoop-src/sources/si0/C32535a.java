package si0;

import com.whoop.archv2.model.template.BackgroundModel;
import com.whoop.archv2.model.template.TemplateBackgroundTheme;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import ti0.C33838c;
import ti0.EnumC33847l;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: si0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lsi0/a;", "", "<init>", "()V", "Lcom/whoop/archv2/model/template/BackgroundModel;", "model", "Lti0/c;", "a", "(Lcom/whoop/archv2/model/template/BackgroundModel;)Lti0/c;", "", "imageUrl", "b", "(Lcom/whoop/archv2/model/template/BackgroundModel;Ljava/lang/String;)Lti0/c;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32535a {

    /* JADX INFO: renamed from: a */
    public static final C32535a f134840a = new C32535a();

    private C32535a() {
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0019  */
    /* JADX WARN: Code duplicated, block: B:28:0x0038  */
    /* JADX INFO: renamed from: a */
    public final C33838c m101545a(BackgroundModel model) {
        AbstractC22403o abstractC22403oM64503l;
        EnumC33847l enumC33847l;
        EnumC33847l enumC33847lM101547a;
        if (model == null) {
            return null;
        }
        String url = model.getUrl();
        if (url == null) {
            abstractC22403oM64503l = null;
        } else {
            if (AbstractC39414r.m125890i0(url)) {
                url = null;
            }
            if (url != null) {
                abstractC22403oM64503l = AbstractC22404p.m64503l(url);
            } else {
                abstractC22403oM64503l = null;
            }
        }
        if (abstractC22403oM64503l == null && model.getTheme() == null) {
            return null;
        }
        TemplateBackgroundTheme theme = model.getTheme();
        if (theme == null || (enumC33847lM101547a = AbstractC32536b.m101547a(theme)) == null) {
            enumC33847l = EnumC33847l.DARK;
        } else {
            enumC33847l = enumC33847lM101547a != EnumC33847l.DEFAULT ? enumC33847lM101547a : null;
            if (enumC33847l == null) {
                enumC33847l = EnumC33847l.DARK;
            }
        }
        return new C33838c(abstractC22403oM64503l, enumC33847l);
    }

    /* JADX INFO: renamed from: b */
    public final C33838c m101546b(BackgroundModel model, String imageUrl) {
        C33838c c33838cM101545a = m101545a(model);
        return c33838cM101545a == null ? m101545a(new BackgroundModel(imageUrl, (TemplateBackgroundTheme) null, 2, (DefaultConstructorMarker) null)) : c33838cM101545a;
    }
}
