package oy2;

import com.whoop.whooplabs.data.domain.ProtocolStep;
import com.whoop.whooplabs.data.domain.ProtocolStepWithOptions;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.Seconds;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: oy2.q */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"", "currentStep", "Lorg/joda/time/DateTime;", "lastStepTime", "", "Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;", "steps", "Lzr2/a;", "dateAndTimeProvider", "Loy2/p;", "a", "(ILorg/joda/time/DateTime;Ljava/util/List;Lzr2/a;)Loy2/p;", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28491q {
    /* JADX INFO: renamed from: a */
    public static final AbstractC28490p m86787a(int i13, DateTime dateTime, List<ProtocolStepWithOptions> steps, InterfaceC41070a dateAndTimeProvider) {
        AbstractC22676k.m65750j(steps, "steps");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        ProtocolStep protocolStep = steps.get(i13).getProtocolStep();
        if (!AbstractC22676k.m65745e(protocolStep.isTimerActive(), Boolean.TRUE)) {
            return AbstractC28490p.b.f115367a;
        }
        boolean zIsCountDownTimerRequired = protocolStep.isCountDownTimerRequired();
        Integer countDownTimerSeconds = protocolStep.getCountDownTimerSeconds();
        int iIntValue = countDownTimerSeconds != null ? countDownTimerSeconds.intValue() : 0;
        if (dateTime == null) {
            dateTime = dateAndTimeProvider.mo133364c();
        }
        int seconds = Seconds.secondsBetween(dateTime, dateAndTimeProvider.mo133364c()).getSeconds();
        if (zIsCountDownTimerRequired) {
            seconds = Math.max(iIntValue - seconds, 0);
        }
        return new AbstractC28490p.a(Integer.valueOf(seconds), zIsCountDownTimerRequired, dateTime);
    }
}
