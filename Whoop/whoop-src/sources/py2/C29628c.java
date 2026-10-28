package py2;

import com.whoop.whooplabs.data.domain.ProtocolStepConfigKt;
import com.whoop.whooplabs.data.domain.ProtocolStepWithOptions;
import com.whoop.whooplabs.data.room.entity.ProtocolStepResult;
import com.whoop.whooplabs.data.room.entity.WhoopLabsStudy;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import oy2.C28489o;
import oy2.InterfaceC28476b;
import oy2.InterfaceC28487m;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: py2.c */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lpy2/c;", "Loy2/m;", "<init>", "()V", "Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;", "step", "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;", "study", "", "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;", "results", "Loy2/b$f;", "a", "(Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29628c implements InterfaceC28487m {
    @Override // oy2.InterfaceC28487m
    /* JADX INFO: renamed from: a */
    public Object mo86773a(ProtocolStepWithOptions protocolStepWithOptions, WhoopLabsStudy whoopLabsStudy, List<ProtocolStepResult> list, InterfaceC30057d<? super InterfaceC28476b.f> interfaceC30057d) {
        DateTime timestampInput = list.get(whoopLabsStudy.getProtocolStep()).getTimestampInput();
        LocalDateTime localDateTime = timestampInput != null ? timestampInput.toLocalDateTime() : null;
        LocalDateTime localDateTimeNow = localDateTime == null ? LocalDateTime.now() : localDateTime;
        C28489o c28489o = new C28489o(protocolStepWithOptions.getProtocolStep().getTitle(), protocolStepWithOptions.getProtocolStep().getSubtitle(), null, 4, null);
        String text = protocolStepWithOptions.getProtocolStep().getText();
        String cta = protocolStepWithOptions.getProtocolStep().getCta();
        AbstractC22676k.m65747g(cta);
        return new InterfaceC28476b.b(c28489o, cta, null, false, false, null, localDateTime != null, protocolStepWithOptions.getProtocolStep().getInputRequired(), ProtocolStepConfigKt.toDomainState(protocolStepWithOptions.getInputConfig()), localDateTimeNow.getYear(), localDateTimeNow.getMonthOfYear(), localDateTimeNow.getDayOfMonth(), localDateTimeNow.getHourOfDay(), localDateTimeNow.getMinuteOfHour(), text, 60, null);
    }
}
