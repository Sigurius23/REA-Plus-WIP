package zx1;

import com.whoop.design.util.TextResource;
import com.whoop.membership.returns.domain.models.DownloadButtonDomainHolder;
import com.whoop.membership.returns.domain.models.InstructionDomainHolder;
import com.whoop.membership.returns.domain.models.ReturnDomainHolder;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import wx1.InterfaceC37684b;
import yx1.C39840a;
import yx1.C39841b;
import yx1.C39842c;
import yx1.C39845f;

/* JADX INFO: renamed from: zx1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lzx1/a;", "", "<init>", "()V", "Lwx1/b;", "domainResult", "Lyx1/f;", "a", "(Lwx1/b;)Lyx1/f;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C41207a {
    /* JADX INFO: renamed from: a */
    public final C39845f m133862a(InterfaceC37684b domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        if (domainResult instanceof InterfaceC37684b.b) {
            return new C39845f(true, false, null, 6, null);
        }
        if (domainResult instanceof InterfaceC37684b.a) {
            return new C39845f(false, true, null, 5, null);
        }
        if (!(domainResult instanceof InterfaceC37684b.c)) {
            throw new NoWhenBranchMatchedException();
        }
        ReturnDomainHolder returnData = ((InterfaceC37684b.c) domainResult).getReturnData();
        TextResource navbarTitle = returnData.getNavbarTitle();
        TextResource alertTitle = returnData.getAlertTitle();
        TextResource alertSubtitle = returnData.getAlertSubtitle();
        TextResource instructionsTitle = returnData.getInstructionsTitle();
        List<InstructionDomainHolder> instructions = returnData.getInstructions();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(instructions, 10));
        for (InstructionDomainHolder instructionDomainHolder : instructions) {
            arrayList.add(new C39841b(instructionDomainHolder.getIcon(), instructionDomainHolder.getMarkdownText()));
        }
        List<DownloadButtonDomainHolder> buttons = returnData.getButtons();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(buttons, 10));
        for (DownloadButtonDomainHolder downloadButtonDomainHolder : buttons) {
            arrayList2.add(new C39840a(downloadButtonDomainHolder.getText(), downloadButtonDomainHolder.getUrl(), downloadButtonDomainHolder.getFilePath()));
        }
        return new C39845f(false, false, new C39842c(navbarTitle, alertTitle, alertSubtitle, instructionsTitle, arrayList, arrayList2, returnData.getFooterText(), returnData.getPolicyCtaText(), returnData.getPolicyCtaUrl()));
    }
}
