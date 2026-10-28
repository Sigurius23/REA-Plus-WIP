package fd2;

import iy1.InterfaceC21030c;
import jy1.C22047a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: fd2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000e\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Liy1/c;", "", "durationNanos", "Lfd2/e;", "result", "Ll83/a0;", "c", "(Liy1/c;JLfd2/e;)V", "Lfd2/a;", "action", "Lfd2/b;", "a", "(Liy1/c;Lfd2/a;Lfd2/b;)V", "Lfd2/c;", "b", "(Liy1/c;Lfd2/c;)V", "share_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14406d {
    /* JADX INFO: renamed from: a */
    public static final void m41047a(InterfaceC21030c interfaceC21030c, EnumC14403a action, EnumC14404b result) {
        AbstractC22676k.m65750j(interfaceC21030c, "<this>");
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(result, "result");
        interfaceC21030c.mo58701b(new C22047a(0, "whoop.share.action.outcome", null, AbstractC37056f.m118959K(AbstractC11266d.m30461o("action:", action.getTagValue()), AbstractC11266d.m30461o("result:", result.getTagValue())), null, 21, null));
    }

    /* JADX INFO: renamed from: b */
    public static final void m41048b(InterfaceC21030c interfaceC21030c, EnumC14405c result) {
        AbstractC22676k.m65750j(interfaceC21030c, "<this>");
        AbstractC22676k.m65750j(result, "result");
        interfaceC21030c.mo58701b(new C22047a(0, "whoop.share.asset_build", null, AbstractC31061c.m95644t("result:", result.getTagValue()), null, 21, null));
    }

    /* JADX INFO: renamed from: c */
    public static final void m41049c(InterfaceC21030c interfaceC21030c, long j7, EnumC14407e result) {
        AbstractC22676k.m65750j(interfaceC21030c, "<this>");
        AbstractC22676k.m65750j(result, "result");
        interfaceC21030c.mo58701b(new C22047a(0, "whoop.share.render", Double.valueOf(j7), AbstractC31061c.m95644t("result:", result.getTagValue()), null, 17, null));
    }
}
