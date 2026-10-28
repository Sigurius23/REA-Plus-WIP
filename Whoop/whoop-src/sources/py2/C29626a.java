package py2;

import com.whoop.whooplabs.data.domain.ProtocolStep;
import com.whoop.whooplabs.data.domain.ProtocolStepWithOptions;
import com.whoop.whooplabs.data.room.entity.ProtocolStepMysticReading;
import com.whoop.whooplabs.data.room.entity.ProtocolStepResult;
import com.whoop.whooplabs.data.room.entity.WhoopLabsStudy;
import java.util.List;
import oy2.C28489o;
import oy2.InterfaceC28476b;
import oy2.InterfaceC28487m;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: py2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lpy2/a;", "Loy2/m;", "<init>", "()V", "Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;", "step", "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;", "study", "", "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;", "results", "Loy2/b$f;", "a", "(Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29626a implements InterfaceC28487m {
    @Override // oy2.InterfaceC28487m
    /* JADX INFO: renamed from: a */
    public Object mo86773a(ProtocolStepWithOptions protocolStepWithOptions, WhoopLabsStudy whoopLabsStudy, List<ProtocolStepResult> list, InterfaceC30057d<? super InterfaceC28476b.f> interfaceC30057d) {
        ProtocolStepResult protocolStepResult = list.get(protocolStepWithOptions.getProtocolStep().getOrder());
        ProtocolStepMysticReading mysticReading = protocolStepResult.getMysticReading();
        boolean z4 = (mysticReading != null ? mysticReading.getSystolic() : null) != null;
        boolean z13 = (mysticReading != null ? mysticReading.getDiastolic() : null) != null;
        boolean z14 = (mysticReading != null ? mysticReading.getHeartRate() : null) != null;
        ProtocolStep protocolStep = protocolStepWithOptions.getProtocolStep();
        C28489o c28489o = new C28489o(protocolStepWithOptions.getProtocolStep().getTitle(), protocolStepWithOptions.getProtocolStep().getSubtitle(), null, 4, null);
        String text = protocolStep.getText();
        String imageUrl = protocolStep.getImageUrl();
        String imageAlt = protocolStep.getImageAlt();
        String cta = protocolStep.getCta();
        AbstractC22676k.m65747g(cta);
        String systolicLabel = protocolStep.getSystolicLabel();
        AbstractC22676k.m65747g(systolicLabel);
        Integer systolicMax = protocolStep.getSystolicMax();
        AbstractC22676k.m65747g(systolicMax);
        int iIntValue = systolicMax.intValue();
        Integer systolicMin = protocolStep.getSystolicMin();
        AbstractC22676k.m65747g(systolicMin);
        int iIntValue2 = systolicMin.intValue();
        String systolicTooHighText = protocolStep.getSystolicTooHighText();
        AbstractC22676k.m65747g(systolicTooHighText);
        String systolicTooLowText = protocolStep.getSystolicTooLowText();
        AbstractC22676k.m65747g(systolicTooLowText);
        String systolicSuffix = protocolStep.getSystolicSuffix();
        AbstractC22676k.m65747g(systolicSuffix);
        Boolean systolicRequired = protocolStep.getSystolicRequired();
        AbstractC22676k.m65747g(systolicRequired);
        boolean zBooleanValue = systolicRequired.booleanValue();
        String systolicRequiredText = protocolStep.getSystolicRequiredText();
        AbstractC22676k.m65747g(systolicRequiredText);
        String diastolicLabel = protocolStep.getDiastolicLabel();
        AbstractC22676k.m65747g(diastolicLabel);
        Integer diastolicMax = protocolStep.getDiastolicMax();
        AbstractC22676k.m65747g(diastolicMax);
        int iIntValue3 = diastolicMax.intValue();
        Integer diastolicMin = protocolStep.getDiastolicMin();
        AbstractC22676k.m65747g(diastolicMin);
        int iIntValue4 = diastolicMin.intValue();
        String diastolicTooHighText = protocolStep.getDiastolicTooHighText();
        AbstractC22676k.m65747g(diastolicTooHighText);
        String diastolicTooLowText = protocolStep.getDiastolicTooLowText();
        AbstractC22676k.m65747g(diastolicTooLowText);
        String diastolicSuffix = protocolStep.getDiastolicSuffix();
        AbstractC22676k.m65747g(diastolicSuffix);
        Boolean diastolicRequired = protocolStep.getDiastolicRequired();
        AbstractC22676k.m65747g(diastolicRequired);
        boolean zBooleanValue2 = diastolicRequired.booleanValue();
        String diastolicRequiredText = protocolStep.getDiastolicRequiredText();
        AbstractC22676k.m65747g(diastolicRequiredText);
        String hrLabel = protocolStep.getHrLabel();
        AbstractC22676k.m65747g(hrLabel);
        Integer hrMax = protocolStep.getHrMax();
        AbstractC22676k.m65747g(hrMax);
        int iIntValue5 = hrMax.intValue();
        Integer hrMin = protocolStep.getHrMin();
        AbstractC22676k.m65747g(hrMin);
        int iIntValue6 = hrMin.intValue();
        String hrTooHighText = protocolStep.getHrTooHighText();
        AbstractC22676k.m65747g(hrTooHighText);
        String hrTooLowText = protocolStep.getHrTooLowText();
        AbstractC22676k.m65747g(hrTooLowText);
        String hrSuffix = protocolStep.getHrSuffix();
        AbstractC22676k.m65747g(hrSuffix);
        Boolean hrRequired = protocolStep.getHrRequired();
        AbstractC22676k.m65747g(hrRequired);
        boolean zBooleanValue3 = hrRequired.booleanValue();
        String hrRequiredText = protocolStep.getHrRequiredText();
        AbstractC22676k.m65747g(hrRequiredText);
        return new InterfaceC28476b.c(c28489o, cta, null, false, false, null, protocolStepResult, text, imageUrl, imageAlt, systolicLabel, iIntValue, iIntValue2, systolicTooHighText, systolicTooLowText, systolicSuffix, zBooleanValue, systolicRequiredText, diastolicLabel, iIntValue3, iIntValue4, diastolicTooHighText, diastolicTooLowText, diastolicSuffix, zBooleanValue2, diastolicRequiredText, hrLabel, iIntValue5, iIntValue6, hrTooHighText, hrTooLowText, hrSuffix, zBooleanValue3, hrRequiredText, z4, z13, z14, 60, 0, null);
    }
}
