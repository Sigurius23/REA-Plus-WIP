package si0;

import com.whoop.archv2.model.template.TemplatePadding;
import p291l0.C22976l1;
import p291l0.InterfaceC22973k1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: si0.l */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/archv2/model/template/TemplatePadding;", "Ll0/k1;", "a", "(Lcom/whoop/archv2/model/template/TemplatePadding;)Ll0/k1;", "arch-v2_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32546l {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC22973k1 m101577a(TemplatePadding templatePadding) {
        AbstractC22676k.m65750j(templatePadding, "<this>");
        float f13 = 8;
        return new C22976l1(((float) templatePadding.getLeading()) * f13, ((float) templatePadding.getTop()) * f13, ((float) templatePadding.getTrailing()) * f13, ((float) templatePadding.getBottom()) * f13);
    }
}
