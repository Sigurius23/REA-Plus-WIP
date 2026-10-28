package fx2;

import androidx.core.app.NotificationCompat;
import androidx.room.AbstractC1794i;
import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import com.whoop.data.local.room.dao.persistent.C6494e;
import com.whoop.data.local.room.entity.converter.DatesTypeConverter;
import com.whoop.whooplabs.data.domain.LabsCampaign;
import com.whoop.whooplabs.data.domain.LabsProtocol;
import com.whoop.whooplabs.data.domain.LabsSession;
import com.whoop.whooplabs.data.domain.LegalDocument;
import com.whoop.whooplabs.data.domain.OptionSelection;
import com.whoop.whooplabs.data.domain.ProtocolStep;
import com.whoop.whooplabs.data.domain.ProtocolStepConfig;
import com.whoop.whooplabs.data.domain.ProtocolStepKt;
import com.whoop.whooplabs.data.domain.ProtocolStepResultWithStepType;
import com.whoop.whooplabs.data.domain.ProtocolStepWithOptions;
import com.whoop.whooplabs.data.domain.StringListConverter;
import com.whoop.whooplabs.data.domain.SurveyProviderConverter;
import com.whoop.whooplabs.data.room.entity.LabsCampaignToLegalDocumentCrossRef;
import com.whoop.whooplabs.data.room.entity.LastKnownStrapInfo;
import com.whoop.whooplabs.data.room.entity.LastKnownStrapInfoKt;
import com.whoop.whooplabs.data.room.entity.ProtocolStepMysticReading;
import com.whoop.whooplabs.data.room.entity.ProtocolStepResult;
import com.whoop.whooplabs.data.room.entity.RemoteCampaign;
import com.whoop.whooplabs.data.room.entity.StudyStatus;
import com.whoop.whooplabs.data.room.entity.WhoopLabsHrDevice;
import com.whoop.whooplabs.data.room.entity.WhoopLabsStudy;
import com.whoop.whooplabs.data.room.entity.WhoopLabsStudyTag;
import fd3.C14408a;
import fq2.C14686c;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l83.C23454a0;
import org.joda.time.DateTime;
import org.joda.time.Instant;
import org.joda.time.LocalDateTime;
import p002a0.C0062y;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import se.AbstractC32411b;

/* JADX INFO: renamed from: fx2.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C14855g implements InterfaceC14849a {

    /* JADX INFO: renamed from: a */
    private final AbstractC1848z0 f55438a;

    /* JADX INFO: renamed from: c */
    private final DatesTypeConverter f55440c = new DatesTypeConverter();

    /* JADX INFO: renamed from: f */
    private final StringListConverter f55443f = new StringListConverter();

    /* JADX INFO: renamed from: i */
    private final SurveyProviderConverter f55446i = new SurveyProviderConverter();

    /* JADX INFO: renamed from: b */
    private final AbstractC1802k f55439b = new j();

    /* JADX INFO: renamed from: d */
    private final AbstractC1802k f55441d = new k();

    /* JADX INFO: renamed from: e */
    private final AbstractC1802k f55442e = new l();

    /* JADX INFO: renamed from: g */
    private final AbstractC1802k f55444g = new m();

    /* JADX INFO: renamed from: h */
    private final AbstractC1802k f55445h = new n();

    /* JADX INFO: renamed from: j */
    private final AbstractC1802k f55447j = new o();

    /* JADX INFO: renamed from: k */
    private final AbstractC1802k f55448k = new p();

    /* JADX INFO: renamed from: l */
    private final AbstractC1802k f55449l = new q();

    /* JADX INFO: renamed from: m */
    private final AbstractC1802k f55450m = new r();

    /* JADX INFO: renamed from: n */
    private final AbstractC1802k f55451n = new a();

    /* JADX INFO: renamed from: o */
    private final AbstractC1802k f55452o = new b();

    /* JADX INFO: renamed from: p */
    private final AbstractC1802k f55453p = new c();

    /* JADX INFO: renamed from: q */
    private final AbstractC1794i f55454q = new d();

    /* JADX INFO: renamed from: r */
    private final AbstractC1794i f55455r = new e();

    /* JADX INFO: renamed from: s */
    private final AbstractC1794i f55456s = new f();

    /* JADX INFO: renamed from: t */
    private final AbstractC1794i f55457t = new g();

    /* JADX INFO: renamed from: u */
    private final AbstractC1794i f55458u = new h();

    /* JADX INFO: renamed from: fx2.g$a */
    /* JADX INFO: loaded from: classes11.dex */
    public class a extends AbstractC1802k {
        public a() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, LastKnownStrapInfo lastKnownStrapInfo) {
            if (lastKnownStrapInfo.getWhoopStrapId() == null) {
                interfaceC33689c.mo5359u(1);
            } else {
                interfaceC33689c.mo5354L(1, lastKnownStrapInfo.getWhoopStrapId());
            }
            if (lastKnownStrapInfo.getHardwareVersion() == null) {
                interfaceC33689c.mo5359u(2);
            } else {
                interfaceC33689c.mo5354L(2, lastKnownStrapInfo.getHardwareVersion());
            }
            if (lastKnownStrapInfo.getFirmwareVersion() == null) {
                interfaceC33689c.mo5359u(3);
            } else {
                interfaceC33689c.mo5354L(3, lastKnownStrapInfo.getFirmwareVersion());
            }
            if (lastKnownStrapInfo.getBluetoothVersion() == null) {
                interfaceC33689c.mo5359u(4);
            } else {
                interfaceC33689c.mo5354L(4, lastKnownStrapInfo.getBluetoothVersion());
            }
            if (lastKnownStrapInfo.getSigProcVersion() == null) {
                interfaceC33689c.mo5359u(5);
            } else {
                interfaceC33689c.mo5354L(5, lastKnownStrapInfo.getSigProcVersion());
            }
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `whoop_labs_strap_info` (`whoop_strap_id`,`hardware_version`,`firmware_version`,`bluetooth_version`,`sig_proc_version`) VALUES (?,?,?,?,?)";
        }
    }

    /* JADX INFO: renamed from: fx2.g$b */
    /* JADX INFO: loaded from: classes11.dex */
    public class b extends AbstractC1802k {
        public b() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, OptionSelection optionSelection) {
            interfaceC33689c.mo5356p(1, optionSelection.getStepId());
            interfaceC33689c.mo5356p(2, optionSelection.getOrder());
            if (optionSelection.getKey() == null) {
                interfaceC33689c.mo5359u(3);
            } else {
                interfaceC33689c.mo5354L(3, optionSelection.getKey());
            }
            if (optionSelection.getValue() == null) {
                interfaceC33689c.mo5359u(4);
            } else {
                interfaceC33689c.mo5354L(4, optionSelection.getValue());
            }
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `whoop_labs_input_option` (`step_id`,`option_order`,`option_key`,`option_value`) VALUES (?,?,?,?)";
        }
    }

    /* JADX INFO: renamed from: fx2.g$c */
    /* JADX INFO: loaded from: classes11.dex */
    public class c extends AbstractC1802k {
        public c() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, ProtocolStepConfig protocolStepConfig) {
            interfaceC33689c.mo5356p(1, protocolStepConfig.getStepId());
            if (protocolStepConfig.getInputLabel() == null) {
                interfaceC33689c.mo5359u(2);
            } else {
                interfaceC33689c.mo5354L(2, protocolStepConfig.getInputLabel());
            }
            if (protocolStepConfig.getMin() == null) {
                interfaceC33689c.mo5359u(3);
            } else {
                interfaceC33689c.mo5356p(3, protocolStepConfig.getMin().intValue());
            }
            if (protocolStepConfig.getMax() == null) {
                interfaceC33689c.mo5359u(4);
            } else {
                interfaceC33689c.mo5356p(4, protocolStepConfig.getMax().intValue());
            }
            if (protocolStepConfig.getMinErrorText() == null) {
                interfaceC33689c.mo5359u(5);
            } else {
                interfaceC33689c.mo5354L(5, protocolStepConfig.getMinErrorText());
            }
            if (protocolStepConfig.getMaxErrorText() == null) {
                interfaceC33689c.mo5359u(6);
            } else {
                interfaceC33689c.mo5354L(6, protocolStepConfig.getMaxErrorText());
            }
            if (protocolStepConfig.getHint() == null) {
                interfaceC33689c.mo5359u(7);
            } else {
                interfaceC33689c.mo5354L(7, protocolStepConfig.getHint());
            }
            if (protocolStepConfig.getRowCount() == null) {
                interfaceC33689c.mo5359u(8);
            } else {
                interfaceC33689c.mo5356p(8, protocolStepConfig.getRowCount().intValue());
            }
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `whoop_labs_protocol_step_config` (`step_id`,`input_label`,`min`,`max`,`min_error_text`,`max_error_text`,`hint`,`row_count`) VALUES (?,?,?,?,?,?,?,?)";
        }
    }

    /* JADX INFO: renamed from: fx2.g$d */
    /* JADX INFO: loaded from: classes11.dex */
    public class d extends AbstractC1794i {
        public d() {
        }

        @Override // androidx.room.AbstractC1794i
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, WhoopLabsHrDevice whoopLabsHrDevice) {
            if (whoopLabsHrDevice.getHrDeviceId() == null) {
                interfaceC33689c.mo5359u(1);
            } else {
                interfaceC33689c.mo5354L(1, whoopLabsHrDevice.getHrDeviceId());
            }
        }

        @Override // androidx.room.AbstractC1794i
        public String createQuery() {
            return "DELETE FROM `whoop_labs_hr_device` WHERE `hr_device_id` = ?";
        }
    }

    /* JADX INFO: renamed from: fx2.g$e */
    /* JADX INFO: loaded from: classes11.dex */
    public class e extends AbstractC1794i {
        public e() {
        }

        @Override // androidx.room.AbstractC1794i
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, LabsCampaignToLegalDocumentCrossRef labsCampaignToLegalDocumentCrossRef) {
            interfaceC33689c.mo5356p(1, labsCampaignToLegalDocumentCrossRef.getCampaignId());
            interfaceC33689c.mo5356p(2, labsCampaignToLegalDocumentCrossRef.getLegalId());
        }

        @Override // androidx.room.AbstractC1794i
        public String createQuery() {
            return "DELETE FROM `legal_document_to_campaign` WHERE `campaign_id` = ? AND `legal_id` = ?";
        }
    }

    /* JADX INFO: renamed from: fx2.g$f */
    /* JADX INFO: loaded from: classes11.dex */
    public class f extends AbstractC1794i {
        public f() {
        }

        @Override // androidx.room.AbstractC1794i
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, LegalDocument legalDocument) {
            interfaceC33689c.mo5356p(1, legalDocument.getLegalId());
        }

        @Override // androidx.room.AbstractC1794i
        public String createQuery() {
            return "DELETE FROM `whoop_labs_legal_ducment` WHERE `legal_id` = ?";
        }
    }

    /* JADX INFO: renamed from: fx2.g$g */
    /* JADX INFO: loaded from: classes11.dex */
    public class g extends AbstractC1794i {
        public g() {
        }

        @Override // androidx.room.AbstractC1794i
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, WhoopLabsStudy whoopLabsStudy) {
            interfaceC33689c.mo5356p(1, whoopLabsStudy.getStudyId());
            String strDateTimeToString = C14855g.this.f55440c.dateTimeToString(whoopLabsStudy.getStartTime());
            if (strDateTimeToString == null) {
                interfaceC33689c.mo5359u(2);
            } else {
                interfaceC33689c.mo5354L(2, strDateTimeToString);
            }
            String strDateTimeToString2 = C14855g.this.f55440c.dateTimeToString(whoopLabsStudy.getEndTime());
            if (strDateTimeToString2 == null) {
                interfaceC33689c.mo5359u(3);
            } else {
                interfaceC33689c.mo5354L(3, strDateTimeToString2);
            }
            interfaceC33689c.mo5356p(4, whoopLabsStudy.getHrDeviceConnected() ? 1L : 0L);
            interfaceC33689c.mo5354L(5, C14855g.this.m42859r0(whoopLabsStudy.getStatus()));
            interfaceC33689c.mo5356p(6, whoopLabsStudy.getCampaignId());
            if (whoopLabsStudy.getPdfFileName() == null) {
                interfaceC33689c.mo5359u(7);
            } else {
                interfaceC33689c.mo5354L(7, whoopLabsStudy.getPdfFileName());
            }
            interfaceC33689c.mo5356p(8, whoopLabsStudy.getProtocolStep());
            interfaceC33689c.mo5356p(9, whoopLabsStudy.getProtocolCompleted() ? 1L : 0L);
            interfaceC33689c.mo5356p(10, whoopLabsStudy.getStudyId());
        }

        @Override // androidx.room.AbstractC1794i
        public String createQuery() {
            return "UPDATE OR ABORT `whoop_labs_study` SET `study_id` = ?,`start_time` = ?,`end_time` = ?,`hr_device_connected` = ?,`status` = ?,`campaign_id` = ?,`pdf_file_name` = ?,`protocol_step` = ?,`protocol_completed` = ? WHERE `study_id` = ?";
        }
    }

    /* JADX INFO: renamed from: fx2.g$h */
    /* JADX INFO: loaded from: classes11.dex */
    public class h extends AbstractC1794i {
        public h() {
        }

        @Override // androidx.room.AbstractC1794i
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, ProtocolStepResult protocolStepResult) {
            interfaceC33689c.mo5356p(1, protocolStepResult.getCampaignId());
            interfaceC33689c.mo5356p(2, protocolStepResult.getResultId());
            interfaceC33689c.mo5356p(3, protocolStepResult.getOrder());
            String strDateTimeToString = C14855g.this.f55440c.dateTimeToString(protocolStepResult.getStartTimestamp());
            if (strDateTimeToString == null) {
                interfaceC33689c.mo5359u(4);
            } else {
                interfaceC33689c.mo5354L(4, strDateTimeToString);
            }
            String strDateTimeToString2 = C14855g.this.f55440c.dateTimeToString(protocolStepResult.getEndTimestamp());
            if (strDateTimeToString2 == null) {
                interfaceC33689c.mo5359u(5);
            } else {
                interfaceC33689c.mo5354L(5, strDateTimeToString2);
            }
            interfaceC33689c.mo5356p(6, protocolStepResult.getTypeformSubmitted() ? 1L : 0L);
            if (protocolStepResult.getTextOption() == null) {
                interfaceC33689c.mo5359u(7);
            } else {
                interfaceC33689c.mo5354L(7, protocolStepResult.getTextOption());
            }
            if (protocolStepResult.getNumberInput() == null) {
                interfaceC33689c.mo5359u(8);
            } else {
                interfaceC33689c.mo5356p(8, protocolStepResult.getNumberInput().intValue());
            }
            if (protocolStepResult.getTextInput() == null) {
                interfaceC33689c.mo5359u(9);
            } else {
                interfaceC33689c.mo5354L(9, protocolStepResult.getTextInput());
            }
            String strDateTimeToString3 = C14855g.this.f55440c.dateTimeToString(protocolStepResult.getTimestampInput());
            if (strDateTimeToString3 == null) {
                interfaceC33689c.mo5359u(10);
            } else {
                interfaceC33689c.mo5354L(10, strDateTimeToString3);
            }
            ProtocolStepMysticReading mysticReading = protocolStepResult.getMysticReading();
            if (mysticReading != null) {
                String strInstantToString = C14855g.this.f55440c.instantToString(mysticReading.getTimestamp());
                if (strInstantToString == null) {
                    interfaceC33689c.mo5359u(11);
                } else {
                    interfaceC33689c.mo5354L(11, strInstantToString);
                }
                if (mysticReading.getSystolic() == null) {
                    interfaceC33689c.mo5359u(12);
                } else {
                    interfaceC33689c.mo5356p(12, mysticReading.getSystolic().intValue());
                }
                if (mysticReading.getDiastolic() == null) {
                    interfaceC33689c.mo5359u(13);
                } else {
                    interfaceC33689c.mo5356p(13, mysticReading.getDiastolic().intValue());
                }
                if (mysticReading.getHeartRate() == null) {
                    interfaceC33689c.mo5359u(14);
                } else {
                    interfaceC33689c.mo5356p(14, mysticReading.getHeartRate().intValue());
                }
            } else {
                interfaceC33689c.mo5359u(11);
                interfaceC33689c.mo5359u(12);
                interfaceC33689c.mo5359u(13);
                interfaceC33689c.mo5359u(14);
            }
            interfaceC33689c.mo5356p(15, protocolStepResult.getCampaignId());
            interfaceC33689c.mo5356p(16, protocolStepResult.getResultId());
        }

        @Override // androidx.room.AbstractC1794i
        public String createQuery() {
            return "UPDATE OR ABORT `whoop_labs_protocol_step_result` SET `campaign_id` = ?,`result_id` = ?,`step_order` = ?,`start_timestamp` = ?,`end_timestamp` = ?,`typeform_submitted` = ?,`text_option` = ?,`number_input` = ?,`text_input` = ?,`timestamp_input` = ?,`timestamp` = ?,`systolic` = ?,`diastolic` = ?,`heart_rate` = ? WHERE `campaign_id` = ? AND `result_id` = ?";
        }
    }

    /* JADX INFO: renamed from: fx2.g$i */
    /* JADX INFO: loaded from: classes11.dex */
    public static /* synthetic */ class i {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f55467a;

        static {
            int[] iArr = new int[StudyStatus.values().length];
            f55467a = iArr;
            try {
                iArr[StudyStatus.NOT_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55467a[StudyStatus.IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55467a[StudyStatus.ENDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: fx2.g$j */
    /* JADX INFO: loaded from: classes11.dex */
    public class j extends AbstractC1802k {
        public j() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, WhoopLabsStudy whoopLabsStudy) {
            interfaceC33689c.mo5356p(1, whoopLabsStudy.getStudyId());
            String strDateTimeToString = C14855g.this.f55440c.dateTimeToString(whoopLabsStudy.getStartTime());
            if (strDateTimeToString == null) {
                interfaceC33689c.mo5359u(2);
            } else {
                interfaceC33689c.mo5354L(2, strDateTimeToString);
            }
            String strDateTimeToString2 = C14855g.this.f55440c.dateTimeToString(whoopLabsStudy.getEndTime());
            if (strDateTimeToString2 == null) {
                interfaceC33689c.mo5359u(3);
            } else {
                interfaceC33689c.mo5354L(3, strDateTimeToString2);
            }
            interfaceC33689c.mo5356p(4, whoopLabsStudy.getHrDeviceConnected() ? 1L : 0L);
            interfaceC33689c.mo5354L(5, C14855g.this.m42859r0(whoopLabsStudy.getStatus()));
            interfaceC33689c.mo5356p(6, whoopLabsStudy.getCampaignId());
            if (whoopLabsStudy.getPdfFileName() == null) {
                interfaceC33689c.mo5359u(7);
            } else {
                interfaceC33689c.mo5354L(7, whoopLabsStudy.getPdfFileName());
            }
            interfaceC33689c.mo5356p(8, whoopLabsStudy.getProtocolStep());
            interfaceC33689c.mo5356p(9, whoopLabsStudy.getProtocolCompleted() ? 1L : 0L);
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR IGNORE INTO `whoop_labs_study` (`study_id`,`start_time`,`end_time`,`hr_device_connected`,`status`,`campaign_id`,`pdf_file_name`,`protocol_step`,`protocol_completed`) VALUES (?,?,?,?,?,?,?,?,?)";
        }
    }

    /* JADX INFO: renamed from: fx2.g$k */
    /* JADX INFO: loaded from: classes11.dex */
    public class k extends AbstractC1802k {
        public k() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, WhoopLabsHrDevice whoopLabsHrDevice) {
            if (whoopLabsHrDevice.getHrDeviceId() == null) {
                interfaceC33689c.mo5359u(1);
            } else {
                interfaceC33689c.mo5354L(1, whoopLabsHrDevice.getHrDeviceId());
            }
            if (whoopLabsHrDevice.getDeviceName() == null) {
                interfaceC33689c.mo5359u(2);
            } else {
                interfaceC33689c.mo5354L(2, whoopLabsHrDevice.getDeviceName());
            }
            if (whoopLabsHrDevice.getFileName() == null) {
                interfaceC33689c.mo5359u(3);
            } else {
                interfaceC33689c.mo5354L(3, whoopLabsHrDevice.getFileName());
            }
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `whoop_labs_hr_device` (`hr_device_id`,`device_name`,`hr_file_path`) VALUES (?,?,?)";
        }
    }

    /* JADX INFO: renamed from: fx2.g$l */
    /* JADX INFO: loaded from: classes11.dex */
    public class l extends AbstractC1802k {
        public l() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, LabsCampaign labsCampaign) {
            interfaceC33689c.mo5356p(1, labsCampaign.getCampaignId());
            if (labsCampaign.getDescription() == null) {
                interfaceC33689c.mo5359u(2);
            } else {
                interfaceC33689c.mo5354L(2, labsCampaign.getDescription());
            }
            if (labsCampaign.getName() == null) {
                interfaceC33689c.mo5359u(3);
            } else {
                interfaceC33689c.mo5354L(3, labsCampaign.getName());
            }
            if (labsCampaign.getSubtitle() == null) {
                interfaceC33689c.mo5359u(4);
            } else {
                interfaceC33689c.mo5354L(4, labsCampaign.getSubtitle());
            }
            String strLocalDateTimeToString = C14855g.this.f55440c.localDateTimeToString(labsCampaign.getParticipationCooldownDate());
            if (strLocalDateTimeToString == null) {
                interfaceC33689c.mo5359u(5);
            } else {
                interfaceC33689c.mo5354L(5, strLocalDateTimeToString);
            }
            if (labsCampaign.getAdditionalCollectionLength() == null) {
                interfaceC33689c.mo5359u(6);
            } else {
                interfaceC33689c.mo5356p(6, labsCampaign.getAdditionalCollectionLength().intValue());
            }
            if (labsCampaign.getBthrAdditionalCollectionLength() == null) {
                interfaceC33689c.mo5359u(7);
            } else {
                interfaceC33689c.mo5356p(7, labsCampaign.getBthrAdditionalCollectionLength().intValue());
            }
            String strFromStringList = C14855g.this.f55443f.fromStringList(labsCampaign.getDataTypes());
            if (strFromStringList == null) {
                interfaceC33689c.mo5359u(8);
            } else {
                interfaceC33689c.mo5354L(8, strFromStringList);
            }
            LabsProtocol protocol = labsCampaign.getProtocol();
            if (protocol != null) {
                interfaceC33689c.mo5356p(9, protocol.getProtocolId());
                if (protocol.getProtocolName() == null) {
                    interfaceC33689c.mo5359u(10);
                } else {
                    interfaceC33689c.mo5354L(10, protocol.getProtocolName());
                }
                if (protocol.getPdfUrl() == null) {
                    interfaceC33689c.mo5359u(11);
                } else {
                    interfaceC33689c.mo5354L(11, protocol.getPdfUrl());
                }
            } else {
                interfaceC33689c.mo5359u(9);
                interfaceC33689c.mo5359u(10);
                interfaceC33689c.mo5359u(11);
            }
            LabsSession session = labsCampaign.getSession();
            if (session != null) {
                interfaceC33689c.mo5356p(12, session.getCampaignSessionId());
            } else {
                interfaceC33689c.mo5359u(12);
            }
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `labs_campaign` (`campaign_id`,`description`,`name`,`subtitle`,`participation_cooldown_date`,`additional_collection_length`,`bthr_additional_collection_length`,`data_types`,`protocol_id`,`protocol_name`,`pdf_url`,`campaign_session_id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* JADX INFO: renamed from: fx2.g$m */
    /* JADX INFO: loaded from: classes11.dex */
    public class m extends AbstractC1802k {
        public m() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, LabsCampaignToLegalDocumentCrossRef labsCampaignToLegalDocumentCrossRef) {
            interfaceC33689c.mo5356p(1, labsCampaignToLegalDocumentCrossRef.getCampaignId());
            interfaceC33689c.mo5356p(2, labsCampaignToLegalDocumentCrossRef.getLegalId());
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `legal_document_to_campaign` (`campaign_id`,`legal_id`) VALUES (?,?)";
        }
    }

    /* JADX INFO: renamed from: fx2.g$n */
    /* JADX INFO: loaded from: classes11.dex */
    public class n extends AbstractC1802k {
        public n() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, ProtocolStep protocolStep) {
            interfaceC33689c.mo5356p(1, protocolStep.getCampaignId());
            interfaceC33689c.mo5356p(2, protocolStep.getId());
            if (protocolStep.getText() == null) {
                interfaceC33689c.mo5359u(3);
            } else {
                interfaceC33689c.mo5354L(3, protocolStep.getText());
            }
            interfaceC33689c.mo5356p(4, protocolStep.getOrder());
            if (protocolStep.getTypeFormUrl() == null) {
                interfaceC33689c.mo5359u(5);
            } else {
                interfaceC33689c.mo5354L(5, protocolStep.getTypeFormUrl());
            }
            if (protocolStep.getImageUrl() == null) {
                interfaceC33689c.mo5359u(6);
            } else {
                interfaceC33689c.mo5354L(6, protocolStep.getImageUrl());
            }
            if (protocolStep.getImageAlt() == null) {
                interfaceC33689c.mo5359u(7);
            } else {
                interfaceC33689c.mo5354L(7, protocolStep.getImageAlt());
            }
            interfaceC33689c.mo5356p(8, protocolStep.isBpStep() ? 1L : 0L);
            Integer numValueOf = protocolStep.isTimerActive() == null ? null : Integer.valueOf(protocolStep.isTimerActive().booleanValue() ? 1 : 0);
            if (numValueOf == null) {
                interfaceC33689c.mo5359u(9);
            } else {
                interfaceC33689c.mo5356p(9, numValueOf.intValue());
            }
            interfaceC33689c.mo5356p(10, protocolStep.isBtHr() ? 1L : 0L);
            if (protocolStep.getTitle() == null) {
                interfaceC33689c.mo5359u(11);
            } else {
                interfaceC33689c.mo5354L(11, protocolStep.getTitle());
            }
            if (protocolStep.getSubtitle() == null) {
                interfaceC33689c.mo5359u(12);
            } else {
                interfaceC33689c.mo5354L(12, protocolStep.getSubtitle());
            }
            if (protocolStep.getCta() == null) {
                interfaceC33689c.mo5359u(13);
            } else {
                interfaceC33689c.mo5354L(13, protocolStep.getCta());
            }
            if (protocolStep.getTypeFormTitle() == null) {
                interfaceC33689c.mo5359u(14);
            } else {
                interfaceC33689c.mo5354L(14, protocolStep.getTypeFormTitle());
            }
            if (protocolStep.getSystolicLabel() == null) {
                interfaceC33689c.mo5359u(15);
            } else {
                interfaceC33689c.mo5354L(15, protocolStep.getSystolicLabel());
            }
            if (protocolStep.getSystolicTooLowText() == null) {
                interfaceC33689c.mo5359u(16);
            } else {
                interfaceC33689c.mo5354L(16, protocolStep.getSystolicTooLowText());
            }
            if (protocolStep.getSystolicTooHighText() == null) {
                interfaceC33689c.mo5359u(17);
            } else {
                interfaceC33689c.mo5354L(17, protocolStep.getSystolicTooHighText());
            }
            if (protocolStep.getSystolicRequiredText() == null) {
                interfaceC33689c.mo5359u(18);
            } else {
                interfaceC33689c.mo5354L(18, protocolStep.getSystolicRequiredText());
            }
            if (protocolStep.getSystolicMax() == null) {
                interfaceC33689c.mo5359u(19);
            } else {
                interfaceC33689c.mo5356p(19, protocolStep.getSystolicMax().intValue());
            }
            if (protocolStep.getSystolicMin() == null) {
                interfaceC33689c.mo5359u(20);
            } else {
                interfaceC33689c.mo5356p(20, protocolStep.getSystolicMin().intValue());
            }
            if (protocolStep.getSystolicSuffix() == null) {
                interfaceC33689c.mo5359u(21);
            } else {
                interfaceC33689c.mo5354L(21, protocolStep.getSystolicSuffix());
            }
            Integer numValueOf2 = protocolStep.getSystolicRequired() == null ? null : Integer.valueOf(protocolStep.getSystolicRequired().booleanValue() ? 1 : 0);
            if (numValueOf2 == null) {
                interfaceC33689c.mo5359u(22);
            } else {
                interfaceC33689c.mo5356p(22, numValueOf2.intValue());
            }
            if (protocolStep.getDiastolicLabel() == null) {
                interfaceC33689c.mo5359u(23);
            } else {
                interfaceC33689c.mo5354L(23, protocolStep.getDiastolicLabel());
            }
            if (protocolStep.getDiastolicTooLowText() == null) {
                interfaceC33689c.mo5359u(24);
            } else {
                interfaceC33689c.mo5354L(24, protocolStep.getDiastolicTooLowText());
            }
            if (protocolStep.getDiastolicTooHighText() == null) {
                interfaceC33689c.mo5359u(25);
            } else {
                interfaceC33689c.mo5354L(25, protocolStep.getDiastolicTooHighText());
            }
            if (protocolStep.getDiastolicRequiredText() == null) {
                interfaceC33689c.mo5359u(26);
            } else {
                interfaceC33689c.mo5354L(26, protocolStep.getDiastolicRequiredText());
            }
            if (protocolStep.getDiastolicMax() == null) {
                interfaceC33689c.mo5359u(27);
            } else {
                interfaceC33689c.mo5356p(27, protocolStep.getDiastolicMax().intValue());
            }
            if (protocolStep.getDiastolicMin() == null) {
                interfaceC33689c.mo5359u(28);
            } else {
                interfaceC33689c.mo5356p(28, protocolStep.getDiastolicMin().intValue());
            }
            if (protocolStep.getDiastolicSuffix() == null) {
                interfaceC33689c.mo5359u(29);
            } else {
                interfaceC33689c.mo5354L(29, protocolStep.getDiastolicSuffix());
            }
            Integer numValueOf3 = protocolStep.getDiastolicRequired() == null ? null : Integer.valueOf(protocolStep.getDiastolicRequired().booleanValue() ? 1 : 0);
            if (numValueOf3 == null) {
                interfaceC33689c.mo5359u(30);
            } else {
                interfaceC33689c.mo5356p(30, numValueOf3.intValue());
            }
            if (protocolStep.getHrLabel() == null) {
                interfaceC33689c.mo5359u(31);
            } else {
                interfaceC33689c.mo5354L(31, protocolStep.getHrLabel());
            }
            if (protocolStep.getHrTooLowText() == null) {
                interfaceC33689c.mo5359u(32);
            } else {
                interfaceC33689c.mo5354L(32, protocolStep.getHrTooLowText());
            }
            if (protocolStep.getHrTooHighText() == null) {
                interfaceC33689c.mo5359u(33);
            } else {
                interfaceC33689c.mo5354L(33, protocolStep.getHrTooHighText());
            }
            if (protocolStep.getHrRequiredText() == null) {
                interfaceC33689c.mo5359u(34);
            } else {
                interfaceC33689c.mo5354L(34, protocolStep.getHrRequiredText());
            }
            if (protocolStep.getHrMax() == null) {
                interfaceC33689c.mo5359u(35);
            } else {
                interfaceC33689c.mo5356p(35, protocolStep.getHrMax().intValue());
            }
            if (protocolStep.getHrMin() == null) {
                interfaceC33689c.mo5359u(36);
            } else {
                interfaceC33689c.mo5356p(36, protocolStep.getHrMin().intValue());
            }
            if (protocolStep.getHrSuffix() == null) {
                interfaceC33689c.mo5359u(37);
            } else {
                interfaceC33689c.mo5354L(37, protocolStep.getHrSuffix());
            }
            Integer numValueOf4 = protocolStep.getHrRequired() != null ? Integer.valueOf(protocolStep.getHrRequired().booleanValue() ? 1 : 0) : null;
            if (numValueOf4 == null) {
                interfaceC33689c.mo5359u(38);
            } else {
                interfaceC33689c.mo5356p(38, numValueOf4.intValue());
            }
            if (protocolStep.getInputType() == null) {
                interfaceC33689c.mo5359u(39);
            } else {
                interfaceC33689c.mo5354L(39, protocolStep.getInputType());
            }
            interfaceC33689c.mo5356p(40, protocolStep.getInputRequired() ? 1L : 0L);
            if (protocolStep.getRequiredRegex() == null) {
                interfaceC33689c.mo5359u(41);
            } else {
                interfaceC33689c.mo5354L(41, protocolStep.getRequiredRegex());
            }
            if (protocolStep.getBlockedRegex() == null) {
                interfaceC33689c.mo5359u(42);
            } else {
                interfaceC33689c.mo5354L(42, protocolStep.getBlockedRegex());
            }
            interfaceC33689c.mo5356p(43, protocolStep.isCountDownTimerRequired() ? 1L : 0L);
            if (protocolStep.getCountDownTimerSeconds() == null) {
                interfaceC33689c.mo5359u(44);
            } else {
                interfaceC33689c.mo5356p(44, protocolStep.getCountDownTimerSeconds().intValue());
            }
            if (protocolStep.getSurveyFormId() == null) {
                interfaceC33689c.mo5359u(45);
            } else {
                interfaceC33689c.mo5354L(45, protocolStep.getSurveyFormId());
            }
            if (protocolStep.getSurveyVendorMetadata() == null) {
                interfaceC33689c.mo5359u(46);
            } else {
                interfaceC33689c.mo5354L(46, protocolStep.getSurveyVendorMetadata());
            }
            String strFromSurveyProvider = C14855g.this.f55446i.fromSurveyProvider(protocolStep.getSurveyProvider());
            if (strFromSurveyProvider == null) {
                interfaceC33689c.mo5359u(47);
            } else {
                interfaceC33689c.mo5354L(47, strFromSurveyProvider);
            }
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `protocol_step` (`campaign_id`,`step_id`,`text`,`step_order`,`typeform_url`,`image_url`,`image_alt`,`is_bp`,`is_timer_active`,`is_bthr`,`title`,`sub_title`,`cta`,`typeform_title`,`systolic_label`,`systolic_too_low_text`,`systolic_too_high_text`,`systolic_required_text`,`systolic_max`,`systolic_min`,`systolic_suffix`,`systolic_required`,`diastolic_label`,`diastolic_too_low_text`,`diastolic_too_high_text`,`diastolic_required_text`,`diastolic_max`,`diastolic_min`,`diastolic_suffix`,`diastolic_required`,`heart_rate_label`,`heart_rate_too_low_text`,`heart_rate_too_high_text`,`heart_required_text`,`heart_rate_max`,`heart_rate_min`,`heart_rate_suffix`,`heart_rate_required`,`input_type`,`input_required`,`required_regex`,`blocked_regex`,`countdown_timer_required`,`countdown_timer_seconds`,`survey_form_id`,`survey_vendor_metadata`,`survey_provider`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* JADX INFO: renamed from: fx2.g$o */
    /* JADX INFO: loaded from: classes11.dex */
    public class o extends AbstractC1802k {
        public o() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, LabsSession labsSession) {
            interfaceC33689c.mo5356p(1, labsSession.getCampaignSessionId());
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `whoop_labs_session` (`campaign_session_id`) VALUES (?)";
        }
    }

    /* JADX INFO: renamed from: fx2.g$p */
    /* JADX INFO: loaded from: classes11.dex */
    public class p extends AbstractC1802k {
        public p() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, LegalDocument legalDocument) {
            interfaceC33689c.mo5356p(1, legalDocument.getLegalId());
            if (legalDocument.getName() == null) {
                interfaceC33689c.mo5359u(2);
            } else {
                interfaceC33689c.mo5354L(2, legalDocument.getName());
            }
            if (legalDocument.getPdfUrl() == null) {
                interfaceC33689c.mo5359u(3);
            } else {
                interfaceC33689c.mo5354L(3, legalDocument.getPdfUrl());
            }
            if (legalDocument.getPdfFileName() == null) {
                interfaceC33689c.mo5359u(4);
            } else {
                interfaceC33689c.mo5354L(4, legalDocument.getPdfFileName());
            }
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `whoop_labs_legal_ducment` (`legal_id`,`name`,`pdf_url`,`pdf_file_name`) VALUES (?,?,?,?)";
        }
    }

    /* JADX INFO: renamed from: fx2.g$q */
    /* JADX INFO: loaded from: classes11.dex */
    public class q extends AbstractC1802k {
        public q() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, WhoopLabsStudyTag whoopLabsStudyTag) {
            String strLocalDateTimeToString = C14855g.this.f55440c.localDateTimeToString(whoopLabsStudyTag.getTimestamp());
            if (strLocalDateTimeToString == null) {
                interfaceC33689c.mo5359u(1);
            } else {
                interfaceC33689c.mo5354L(1, strLocalDateTimeToString);
            }
            if (whoopLabsStudyTag.getNote() == null) {
                interfaceC33689c.mo5359u(2);
            } else {
                interfaceC33689c.mo5354L(2, whoopLabsStudyTag.getNote());
            }
            interfaceC33689c.mo5356p(3, whoopLabsStudyTag.getCampaignId());
            interfaceC33689c.mo5356p(4, whoopLabsStudyTag.getId());
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `whoop_labs_study_tag` (`timestamp`,`note`,`campaign_id`,`tag_id`) VALUES (?,?,?,nullif(?, 0))";
        }
    }

    /* JADX INFO: renamed from: fx2.g$r */
    /* JADX INFO: loaded from: classes11.dex */
    public class r extends AbstractC1802k {
        public r() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, ProtocolStepResult protocolStepResult) {
            interfaceC33689c.mo5356p(1, protocolStepResult.getCampaignId());
            interfaceC33689c.mo5356p(2, protocolStepResult.getResultId());
            interfaceC33689c.mo5356p(3, protocolStepResult.getOrder());
            String strDateTimeToString = C14855g.this.f55440c.dateTimeToString(protocolStepResult.getStartTimestamp());
            if (strDateTimeToString == null) {
                interfaceC33689c.mo5359u(4);
            } else {
                interfaceC33689c.mo5354L(4, strDateTimeToString);
            }
            String strDateTimeToString2 = C14855g.this.f55440c.dateTimeToString(protocolStepResult.getEndTimestamp());
            if (strDateTimeToString2 == null) {
                interfaceC33689c.mo5359u(5);
            } else {
                interfaceC33689c.mo5354L(5, strDateTimeToString2);
            }
            interfaceC33689c.mo5356p(6, protocolStepResult.getTypeformSubmitted() ? 1L : 0L);
            if (protocolStepResult.getTextOption() == null) {
                interfaceC33689c.mo5359u(7);
            } else {
                interfaceC33689c.mo5354L(7, protocolStepResult.getTextOption());
            }
            if (protocolStepResult.getNumberInput() == null) {
                interfaceC33689c.mo5359u(8);
            } else {
                interfaceC33689c.mo5356p(8, protocolStepResult.getNumberInput().intValue());
            }
            if (protocolStepResult.getTextInput() == null) {
                interfaceC33689c.mo5359u(9);
            } else {
                interfaceC33689c.mo5354L(9, protocolStepResult.getTextInput());
            }
            String strDateTimeToString3 = C14855g.this.f55440c.dateTimeToString(protocolStepResult.getTimestampInput());
            if (strDateTimeToString3 == null) {
                interfaceC33689c.mo5359u(10);
            } else {
                interfaceC33689c.mo5354L(10, strDateTimeToString3);
            }
            ProtocolStepMysticReading mysticReading = protocolStepResult.getMysticReading();
            if (mysticReading == null) {
                interfaceC33689c.mo5359u(11);
                interfaceC33689c.mo5359u(12);
                interfaceC33689c.mo5359u(13);
                interfaceC33689c.mo5359u(14);
                return;
            }
            String strInstantToString = C14855g.this.f55440c.instantToString(mysticReading.getTimestamp());
            if (strInstantToString == null) {
                interfaceC33689c.mo5359u(11);
            } else {
                interfaceC33689c.mo5354L(11, strInstantToString);
            }
            if (mysticReading.getSystolic() == null) {
                interfaceC33689c.mo5359u(12);
            } else {
                interfaceC33689c.mo5356p(12, mysticReading.getSystolic().intValue());
            }
            if (mysticReading.getDiastolic() == null) {
                interfaceC33689c.mo5359u(13);
            } else {
                interfaceC33689c.mo5356p(13, mysticReading.getDiastolic().intValue());
            }
            if (mysticReading.getHeartRate() == null) {
                interfaceC33689c.mo5359u(14);
            } else {
                interfaceC33689c.mo5356p(14, mysticReading.getHeartRate().intValue());
            }
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR IGNORE INTO `whoop_labs_protocol_step_result` (`campaign_id`,`result_id`,`step_order`,`start_timestamp`,`end_timestamp`,`typeform_submitted`,`text_option`,`number_input`,`text_input`,`timestamp_input`,`timestamp`,`systolic`,`diastolic`,`heart_rate`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public C14855g(AbstractC1848z0 abstractC1848z0) {
        this.f55438a = abstractC1848z0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ C23454a0 m42795A0(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM whoop_labs_hr_device");
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static /* synthetic */ C23454a0 m42796B0(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM legal_document_to_campaign");
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ C23454a0 m42797C0(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM whoop_labs_legal_ducment");
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ C23454a0 m42798D0(int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM whoop_labs_protocol_step_result WHERE campaign_id = ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ C23454a0 m42799E0(int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM protocol_step WHERE campaign_id = ? ");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ C23454a0 m42800F0(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM whoop_labs_input_option");
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static /* synthetic */ C23454a0 m42801G0(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM whoop_labs_protocol_step_config");
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ C23454a0 m42803H0(int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM whoop_labs_study WHERE campaign_id = ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ C23454a0 m42805I0(int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM whoop_labs_study_tag WHERE campaign_id = ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ WhoopLabsHrDevice m42807J0(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM whoop_labs_hr_device LIMIT 1");
        try {
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "hr_device_id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "device_name");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "hr_file_path");
            WhoopLabsHrDevice whoopLabsHrDevice = null;
            String strMo5353J0 = null;
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J1 = interfaceC33689cMo68212g1.isNull(iM60658N) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                String strMo5353J2 = interfaceC33689cMo68212g1.isNull(iM60658N2) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                if (!interfaceC33689cMo68212g1.isNull(iM60658N3)) {
                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                }
                whoopLabsHrDevice = new WhoopLabsHrDevice(strMo5353J1, strMo5353J2, strMo5353J0);
            }
            return whoopLabsHrDevice;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public /* synthetic */ LabsCampaign m42809K0(int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        LabsCampaign labsCampaign;
        LabsProtocol labsProtocol;
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM labs_campaign where campaign_id = ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "campaign_id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "description");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "name");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "subtitle");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "participation_cooldown_date");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "additional_collection_length");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "bthr_additional_collection_length");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "data_types");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "protocol_id");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "protocol_name");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pdf_url");
            int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "campaign_session_id");
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                int i14 = (int) interfaceC33689cMo68212g1.getLong(iM60658N);
                String strMo5353J0 = interfaceC33689cMo68212g1.isNull(iM60658N2) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J1 = interfaceC33689cMo68212g1.isNull(iM60658N3) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                String strMo5353J2 = interfaceC33689cMo68212g1.isNull(iM60658N4) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N4);
                LocalDateTime localDateTimeStringToLocalDateTime = this.f55440c.stringToLocalDateTime(interfaceC33689cMo68212g1.isNull(iM60658N5) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N5));
                Integer numValueOf = interfaceC33689cMo68212g1.isNull(iM60658N6) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(iM60658N6));
                Integer numValueOf2 = interfaceC33689cMo68212g1.isNull(iM60658N7) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(iM60658N7));
                List<String> stringList = this.f55443f.toStringList(interfaceC33689cMo68212g1.isNull(iM60658N8) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N8));
                if (interfaceC33689cMo68212g1.isNull(iM60658N9) && interfaceC33689cMo68212g1.isNull(iM60658N10) && interfaceC33689cMo68212g1.isNull(iM60658N11)) {
                    labsProtocol = null;
                } else {
                    labsProtocol = new LabsProtocol((int) interfaceC33689cMo68212g1.getLong(iM60658N9), interfaceC33689cMo68212g1.isNull(iM60658N10) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N10), interfaceC33689cMo68212g1.isNull(iM60658N11) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N11));
                }
                labsCampaign = new LabsCampaign(i14, strMo5353J0, strMo5353J1, strMo5353J2, localDateTimeStringToLocalDateTime, labsProtocol, numValueOf, numValueOf2, stringList, !interfaceC33689cMo68212g1.isNull(iM60658N12) ? new LabsSession((int) interfaceC33689cMo68212g1.getLong(iM60658N12)) : null);
            } else {
                labsCampaign = null;
            }
            return labsCampaign;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ LastKnownStrapInfo m42811L0(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1(LastKnownStrapInfoKt.STRAP_INFO_QUERY);
        try {
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "whoop_strap_id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "hardware_version");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "firmware_version");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "bluetooth_version");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "sig_proc_version");
            LastKnownStrapInfo lastKnownStrapInfo = null;
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                lastKnownStrapInfo = new LastKnownStrapInfo(interfaceC33689cMo68212g1.isNull(iM60658N) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N), interfaceC33689cMo68212g1.isNull(iM60658N2) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N2), interfaceC33689cMo68212g1.isNull(iM60658N3) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N3), interfaceC33689cMo68212g1.isNull(iM60658N4) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N4), interfaceC33689cMo68212g1.isNull(iM60658N5) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N5));
            }
            return lastKnownStrapInfo;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:53:0x014f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0156 A[Catch: all -> 0x0137, TryCatch #0 {all -> 0x0137, blocks: (B:3:0x000e, B:4:0x006c, B:6:0x0072, B:11:0x009c, B:15:0x00af, B:19:0x00c2, B:23:0x00d1, B:27:0x00e5, B:31:0x00f4, B:35:0x0101, B:37:0x010d, B:39:0x0115, B:41:0x011d, B:51:0x0149, B:56:0x015f, B:60:0x017b, B:64:0x0191, B:69:0x01aa, B:70:0x01b1, B:68:0x019d, B:63:0x0186, B:59:0x0170, B:55:0x0156, B:34:0x00fd, B:30:0x00ee, B:26:0x00da, B:22:0x00cb, B:14:0x00ab, B:10:0x0097), top: B:76:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:58:0x016b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0170 A[Catch: all -> 0x0137, TryCatch #0 {all -> 0x0137, blocks: (B:3:0x000e, B:4:0x006c, B:6:0x0072, B:11:0x009c, B:15:0x00af, B:19:0x00c2, B:23:0x00d1, B:27:0x00e5, B:31:0x00f4, B:35:0x0101, B:37:0x010d, B:39:0x0115, B:41:0x011d, B:51:0x0149, B:56:0x015f, B:60:0x017b, B:64:0x0191, B:69:0x01aa, B:70:0x01b1, B:68:0x019d, B:63:0x0186, B:59:0x0170, B:55:0x0156, B:34:0x00fd, B:30:0x00ee, B:26:0x00da, B:22:0x00cb, B:14:0x00ab, B:10:0x0097), top: B:76:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0181  */
    /* JADX WARN: Code duplicated, block: B:63:0x0186 A[Catch: all -> 0x0137, TryCatch #0 {all -> 0x0137, blocks: (B:3:0x000e, B:4:0x006c, B:6:0x0072, B:11:0x009c, B:15:0x00af, B:19:0x00c2, B:23:0x00d1, B:27:0x00e5, B:31:0x00f4, B:35:0x0101, B:37:0x010d, B:39:0x0115, B:41:0x011d, B:51:0x0149, B:56:0x015f, B:60:0x017b, B:64:0x0191, B:69:0x01aa, B:70:0x01b1, B:68:0x019d, B:63:0x0186, B:59:0x0170, B:55:0x0156, B:34:0x00fd, B:30:0x00ee, B:26:0x00da, B:22:0x00cb, B:14:0x00ab, B:10:0x0097), top: B:76:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0197  */
    /* JADX WARN: Code duplicated, block: B:68:0x019d A[Catch: all -> 0x0137, TryCatch #0 {all -> 0x0137, blocks: (B:3:0x000e, B:4:0x006c, B:6:0x0072, B:11:0x009c, B:15:0x00af, B:19:0x00c2, B:23:0x00d1, B:27:0x00e5, B:31:0x00f4, B:35:0x0101, B:37:0x010d, B:39:0x0115, B:41:0x011d, B:51:0x0149, B:56:0x015f, B:60:0x017b, B:64:0x0191, B:69:0x01aa, B:70:0x01b1, B:68:0x019d, B:63:0x0186, B:59:0x0170, B:55:0x0156, B:34:0x00fd, B:30:0x00ee, B:26:0x00da, B:22:0x00cb, B:14:0x00ab, B:10:0x0097), top: B:76:0x000e }] */
    /* JADX INFO: renamed from: M0 */
    public /* synthetic */ List m42813M0(int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        int i14;
        int i15;
        int i16;
        ProtocolStepMysticReading protocolStepMysticReading;
        String strMo5353J0;
        Integer numValueOf;
        Integer numValueOf2;
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM whoop_labs_protocol_step_result WHERE campaign_id = ? ORDER BY step_order");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "campaign_id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "result_id");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "step_order");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "start_timestamp");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "end_timestamp");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "typeform_submitted");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "text_option");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "number_input");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "text_input");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "timestamp_input");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "timestamp");
            int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "systolic");
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "diastolic");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "heart_rate");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                int i17 = iM60658N12;
                int i18 = iM60658N13;
                int i19 = (int) interfaceC33689cMo68212g1.getLong(iM60658N);
                int i24 = (int) interfaceC33689cMo68212g1.getLong(iM60658N2);
                int i25 = iM60658N;
                int i26 = iM60658N2;
                int i27 = (int) interfaceC33689cMo68212g1.getLong(iM60658N3);
                Integer numValueOf3 = null;
                DateTime dateTimeStringToDateTime = this.f55440c.stringToDateTime(interfaceC33689cMo68212g1.isNull(iM60658N4) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N4));
                DateTime dateTimeStringToDateTime2 = this.f55440c.stringToDateTime(interfaceC33689cMo68212g1.isNull(iM60658N5) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N5));
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N6)) != 0;
                String strMo5353J1 = interfaceC33689cMo68212g1.isNull(iM60658N7) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N7);
                Integer numValueOf4 = interfaceC33689cMo68212g1.isNull(iM60658N8) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(iM60658N8));
                String strMo5353J2 = interfaceC33689cMo68212g1.isNull(iM60658N9) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N9);
                DateTime dateTimeStringToDateTime3 = this.f55440c.stringToDateTime(interfaceC33689cMo68212g1.isNull(iM60658N10) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N10));
                if (interfaceC33689cMo68212g1.isNull(iM60658N11)) {
                    i14 = i17;
                    if (interfaceC33689cMo68212g1.isNull(i14)) {
                        i15 = i18;
                        if (interfaceC33689cMo68212g1.isNull(i15)) {
                            iM60658N3 = iM60658N3;
                            i16 = iM60658N14;
                            if (interfaceC33689cMo68212g1.isNull(i16)) {
                                i15 = i15;
                                iM60658N4 = iM60658N4;
                                iM60658N6 = iM60658N6;
                                iM60658N7 = iM60658N7;
                                protocolStepMysticReading = null;
                                i14 = i14;
                            } else {
                                if (interfaceC33689cMo68212g1.isNull(iM60658N11)) {
                                    strMo5353J0 = null;
                                } else {
                                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N11);
                                }
                                Instant instantStringToInstant = this.f55440c.stringToInstant(strMo5353J0);
                                if (interfaceC33689cMo68212g1.isNull(i14)) {
                                    numValueOf = null;
                                } else {
                                    numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i14));
                                }
                                if (interfaceC33689cMo68212g1.isNull(i15)) {
                                    numValueOf2 = null;
                                } else {
                                    numValueOf2 = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i15));
                                }
                                if (!interfaceC33689cMo68212g1.isNull(i16)) {
                                    numValueOf3 = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i16));
                                }
                                protocolStepMysticReading = new ProtocolStepMysticReading(instantStringToInstant, numValueOf, numValueOf2, numValueOf3);
                            }
                        }
                    } else {
                        i15 = i18;
                        i16 = iM60658N14;
                        if (interfaceC33689cMo68212g1.isNull(iM60658N11)) {
                            strMo5353J0 = null;
                        } else {
                            strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N11);
                        }
                        Instant instantStringToInstant2 = this.f55440c.stringToInstant(strMo5353J0);
                        if (interfaceC33689cMo68212g1.isNull(i14)) {
                            numValueOf = null;
                        } else {
                            numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i14));
                        }
                        if (interfaceC33689cMo68212g1.isNull(i15)) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i15));
                        }
                        if (!interfaceC33689cMo68212g1.isNull(i16)) {
                            numValueOf3 = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i16));
                        }
                        protocolStepMysticReading = new ProtocolStepMysticReading(instantStringToInstant2, numValueOf, numValueOf2, numValueOf3);
                    }
                    arrayList.add(new ProtocolStepResult(i19, i24, i27, dateTimeStringToDateTime, dateTimeStringToDateTime2, protocolStepMysticReading, z4, strMo5353J1, numValueOf4, strMo5353J2, dateTimeStringToDateTime3));
                    iM60658N4 = iM60658N4;
                    iM60658N14 = i16;
                    iM60658N12 = i14;
                    iM60658N = i25;
                    iM60658N3 = iM60658N3;
                    iM60658N5 = iM60658N5;
                    iM60658N2 = i26;
                    iM60658N6 = iM60658N6;
                    iM60658N7 = iM60658N7;
                    iM60658N13 = i15;
                } else {
                    i14 = i17;
                    i15 = i18;
                }
                i16 = iM60658N14;
                if (interfaceC33689cMo68212g1.isNull(iM60658N11)) {
                    strMo5353J0 = null;
                } else {
                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N11);
                }
                Instant instantStringToInstant3 = this.f55440c.stringToInstant(strMo5353J0);
                if (interfaceC33689cMo68212g1.isNull(i14)) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i14));
                }
                if (interfaceC33689cMo68212g1.isNull(i15)) {
                    numValueOf2 = null;
                } else {
                    numValueOf2 = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i15));
                }
                if (!interfaceC33689cMo68212g1.isNull(i16)) {
                    numValueOf3 = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i16));
                }
                protocolStepMysticReading = new ProtocolStepMysticReading(instantStringToInstant3, numValueOf, numValueOf2, numValueOf3);
                arrayList.add(new ProtocolStepResult(i19, i24, i27, dateTimeStringToDateTime, dateTimeStringToDateTime2, protocolStepMysticReading, z4, strMo5353J1, numValueOf4, strMo5353J2, dateTimeStringToDateTime3));
                iM60658N4 = iM60658N4;
                iM60658N14 = i16;
                iM60658N12 = i14;
                iM60658N = i25;
                iM60658N3 = iM60658N3;
                iM60658N5 = iM60658N5;
                iM60658N2 = i26;
                iM60658N6 = iM60658N6;
                iM60658N7 = iM60658N7;
                iM60658N13 = i15;
            }
            return arrayList;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:56:0x016c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0173 A[Catch: all -> 0x0156, TryCatch #0 {all -> 0x0156, blocks: (B:3:0x000e, B:4:0x0074, B:6:0x007a, B:10:0x0097, B:15:0x00bb, B:19:0x00ce, B:23:0x00e1, B:27:0x00f0, B:31:0x0104, B:35:0x0113, B:39:0x0120, B:41:0x012c, B:43:0x0134, B:45:0x013c, B:54:0x0166, B:59:0x017c, B:63:0x0198, B:67:0x01ae, B:71:0x01c6, B:72:0x01cd, B:70:0x01ba, B:66:0x01a3, B:62:0x018d, B:58:0x0173, B:38:0x011c, B:34:0x010d, B:30:0x00f9, B:26:0x00ea, B:18:0x00ca, B:14:0x00b6, B:9:0x008b), top: B:78:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0188  */
    /* JADX WARN: Code duplicated, block: B:62:0x018d A[Catch: all -> 0x0156, TryCatch #0 {all -> 0x0156, blocks: (B:3:0x000e, B:4:0x0074, B:6:0x007a, B:10:0x0097, B:15:0x00bb, B:19:0x00ce, B:23:0x00e1, B:27:0x00f0, B:31:0x0104, B:35:0x0113, B:39:0x0120, B:41:0x012c, B:43:0x0134, B:45:0x013c, B:54:0x0166, B:59:0x017c, B:63:0x0198, B:67:0x01ae, B:71:0x01c6, B:72:0x01cd, B:70:0x01ba, B:66:0x01a3, B:62:0x018d, B:58:0x0173, B:38:0x011c, B:34:0x010d, B:30:0x00f9, B:26:0x00ea, B:18:0x00ca, B:14:0x00b6, B:9:0x008b), top: B:78:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:65:0x019e  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a3 A[Catch: all -> 0x0156, TryCatch #0 {all -> 0x0156, blocks: (B:3:0x000e, B:4:0x0074, B:6:0x007a, B:10:0x0097, B:15:0x00bb, B:19:0x00ce, B:23:0x00e1, B:27:0x00f0, B:31:0x0104, B:35:0x0113, B:39:0x0120, B:41:0x012c, B:43:0x0134, B:45:0x013c, B:54:0x0166, B:59:0x017c, B:63:0x0198, B:67:0x01ae, B:71:0x01c6, B:72:0x01cd, B:70:0x01ba, B:66:0x01a3, B:62:0x018d, B:58:0x0173, B:38:0x011c, B:34:0x010d, B:30:0x00f9, B:26:0x00ea, B:18:0x00ca, B:14:0x00b6, B:9:0x008b), top: B:78:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ba A[Catch: all -> 0x0156, TryCatch #0 {all -> 0x0156, blocks: (B:3:0x000e, B:4:0x0074, B:6:0x007a, B:10:0x0097, B:15:0x00bb, B:19:0x00ce, B:23:0x00e1, B:27:0x00f0, B:31:0x0104, B:35:0x0113, B:39:0x0120, B:41:0x012c, B:43:0x0134, B:45:0x013c, B:54:0x0166, B:59:0x017c, B:63:0x0198, B:67:0x01ae, B:71:0x01c6, B:72:0x01cd, B:70:0x01ba, B:66:0x01a3, B:62:0x018d, B:58:0x0173, B:38:0x011c, B:34:0x010d, B:30:0x00f9, B:26:0x00ea, B:18:0x00ca, B:14:0x00b6, B:9:0x008b), top: B:78:0x000e }] */
    /* JADX INFO: renamed from: N0 */
    public /* synthetic */ List m42815N0(int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        int i14;
        int i15;
        int i16;
        int i17;
        ProtocolStepMysticReading protocolStepMysticReading;
        String strMo5353J0;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("\n        SELECT psr.*, ps.input_type AS timestamp_step_type\n        FROM whoop_labs_protocol_step_result psr\n        INNER JOIN protocol_step ps\n        ON psr.campaign_id = ps.campaign_id AND psr.result_id = ps.step_id\n        WHERE psr.campaign_id = ?\n        ORDER BY psr.step_order\n    ");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "campaign_id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "result_id");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "step_order");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "start_timestamp");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "end_timestamp");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "typeform_submitted");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "text_option");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "number_input");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "text_input");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "timestamp_input");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "timestamp");
            int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "systolic");
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "diastolic");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "heart_rate");
            int iM60658N15 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "timestamp_step_type");
            int i18 = iM60658N13;
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J1 = interfaceC33689cMo68212g1.isNull(iM60658N15) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N15);
                int i19 = (int) interfaceC33689cMo68212g1.getLong(iM60658N);
                int i24 = (int) interfaceC33689cMo68212g1.getLong(iM60658N2);
                int i25 = iM60658N;
                int i26 = iM60658N2;
                int i27 = (int) interfaceC33689cMo68212g1.getLong(iM60658N3);
                DateTime dateTimeStringToDateTime = this.f55440c.stringToDateTime(interfaceC33689cMo68212g1.isNull(iM60658N4) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N4));
                DateTime dateTimeStringToDateTime2 = this.f55440c.stringToDateTime(interfaceC33689cMo68212g1.isNull(iM60658N5) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N5));
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N6)) != 0;
                String strMo5353J2 = interfaceC33689cMo68212g1.isNull(iM60658N7) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N7);
                Integer numValueOf4 = interfaceC33689cMo68212g1.isNull(iM60658N8) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(iM60658N8));
                String strMo5353J3 = interfaceC33689cMo68212g1.isNull(iM60658N9) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N9);
                DateTime dateTimeStringToDateTime3 = this.f55440c.stringToDateTime(interfaceC33689cMo68212g1.isNull(iM60658N10) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N10));
                if (interfaceC33689cMo68212g1.isNull(iM60658N11)) {
                    i15 = iM60658N12;
                    if (interfaceC33689cMo68212g1.isNull(i15)) {
                        i14 = i18;
                        if (interfaceC33689cMo68212g1.isNull(i14)) {
                            i16 = iM60658N3;
                            i17 = iM60658N14;
                            if (interfaceC33689cMo68212g1.isNull(i17)) {
                                iM60658N4 = iM60658N4;
                                iM60658N6 = iM60658N6;
                                iM60658N7 = iM60658N7;
                                protocolStepMysticReading = null;
                                i15 = i15;
                                i14 = i14;
                            }
                            ProtocolStepResultWithStepType protocolStepResultWithStepType = new ProtocolStepResultWithStepType(new ProtocolStepResult(i19, i24, i27, dateTimeStringToDateTime, dateTimeStringToDateTime2, protocolStepMysticReading, z4, strMo5353J2, numValueOf4, strMo5353J3, dateTimeStringToDateTime3), strMo5353J1);
                            ArrayList arrayList2 = arrayList;
                            arrayList2.add(protocolStepResultWithStepType);
                            iM60658N4 = iM60658N4;
                            iM60658N14 = i17;
                            iM60658N12 = i15;
                            iM60658N = i25;
                            iM60658N3 = i16;
                            iM60658N5 = iM60658N5;
                            i18 = i14;
                            iM60658N2 = i26;
                            iM60658N6 = iM60658N6;
                            iM60658N7 = iM60658N7;
                            arrayList = arrayList2;
                            iM60658N15 = iM60658N15;
                        }
                        if (interfaceC33689cMo68212g1.isNull(iM60658N11)) {
                            strMo5353J0 = null;
                        } else {
                            strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N11);
                        }
                        Instant instantStringToInstant = this.f55440c.stringToInstant(strMo5353J0);
                        if (interfaceC33689cMo68212g1.isNull(i15)) {
                            numValueOf = null;
                        } else {
                            numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i15));
                        }
                        if (interfaceC33689cMo68212g1.isNull(i14)) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i14));
                        }
                        if (interfaceC33689cMo68212g1.isNull(i17)) {
                            numValueOf3 = null;
                        } else {
                            numValueOf3 = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i17));
                        }
                        protocolStepMysticReading = new ProtocolStepMysticReading(instantStringToInstant, numValueOf, numValueOf2, numValueOf3);
                        ProtocolStepResultWithStepType protocolStepResultWithStepType2 = new ProtocolStepResultWithStepType(new ProtocolStepResult(i19, i24, i27, dateTimeStringToDateTime, dateTimeStringToDateTime2, protocolStepMysticReading, z4, strMo5353J2, numValueOf4, strMo5353J3, dateTimeStringToDateTime3), strMo5353J1);
                        ArrayList arrayList3 = arrayList;
                        arrayList3.add(protocolStepResultWithStepType2);
                        iM60658N4 = iM60658N4;
                        iM60658N14 = i17;
                        iM60658N12 = i15;
                        iM60658N = i25;
                        iM60658N3 = i16;
                        iM60658N5 = iM60658N5;
                        i18 = i14;
                        iM60658N2 = i26;
                        iM60658N6 = iM60658N6;
                        iM60658N7 = iM60658N7;
                        arrayList = arrayList3;
                        iM60658N15 = iM60658N15;
                    } else {
                        i14 = i18;
                    }
                } else {
                    i14 = i18;
                    i15 = iM60658N12;
                }
                i16 = iM60658N3;
                i17 = iM60658N14;
                if (interfaceC33689cMo68212g1.isNull(iM60658N11)) {
                    strMo5353J0 = null;
                } else {
                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N11);
                }
                Instant instantStringToInstant2 = this.f55440c.stringToInstant(strMo5353J0);
                if (interfaceC33689cMo68212g1.isNull(i15)) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i15));
                }
                if (interfaceC33689cMo68212g1.isNull(i14)) {
                    numValueOf2 = null;
                } else {
                    numValueOf2 = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i14));
                }
                if (interfaceC33689cMo68212g1.isNull(i17)) {
                    numValueOf3 = null;
                } else {
                    numValueOf3 = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i17));
                }
                protocolStepMysticReading = new ProtocolStepMysticReading(instantStringToInstant2, numValueOf, numValueOf2, numValueOf3);
                ProtocolStepResultWithStepType protocolStepResultWithStepType3 = new ProtocolStepResultWithStepType(new ProtocolStepResult(i19, i24, i27, dateTimeStringToDateTime, dateTimeStringToDateTime2, protocolStepMysticReading, z4, strMo5353J2, numValueOf4, strMo5353J3, dateTimeStringToDateTime3), strMo5353J1);
                ArrayList arrayList4 = arrayList;
                arrayList4.add(protocolStepResultWithStepType3);
                iM60658N4 = iM60658N4;
                iM60658N14 = i17;
                iM60658N12 = i15;
                iM60658N = i25;
                iM60658N3 = i16;
                iM60658N5 = iM60658N5;
                i18 = i14;
                iM60658N2 = i26;
                iM60658N6 = iM60658N6;
                iM60658N7 = iM60658N7;
                arrayList = arrayList4;
                iM60658N15 = iM60658N15;
            }
            return arrayList;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O0 */
    public List m42817O0(int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        Integer numValueOf;
        Integer num;
        Boolean boolValueOf;
        int i14;
        String strMo5353J0;
        int i15;
        String str;
        int i16;
        String str2;
        int i17;
        String str3;
        int i18;
        String str4;
        int i19;
        String str5;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        Boolean boolValueOf4;
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM protocol_step S INNER JOIN whoop_labs_protocol_step_result R ON S.step_id = R.result_id AND S.campaign_id = R.campaign_id AND R.campaign_id = ? ");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "campaign_id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "step_id");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "text");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "step_order");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "typeform_url");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "image_url");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "image_alt");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "is_bp");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "is_timer_active");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "is_bthr");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "title");
            int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "sub_title");
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "cta");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "typeform_title");
            int iM60658N15 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "systolic_label");
            int iM60658N16 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "systolic_too_low_text");
            int iM60658N17 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "systolic_too_high_text");
            int iM60658N18 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "systolic_required_text");
            int iM60658N19 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "systolic_max");
            int iM60658N20 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "systolic_min");
            int iM60658N21 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "systolic_suffix");
            int iM60658N22 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "systolic_required");
            int iM60658N23 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "diastolic_label");
            int iM60658N24 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "diastolic_too_low_text");
            int iM60658N25 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "diastolic_too_high_text");
            int iM60658N26 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "diastolic_required_text");
            int iM60658N27 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "diastolic_max");
            int iM60658N28 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "diastolic_min");
            int iM60658N29 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "diastolic_suffix");
            int iM60658N30 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "diastolic_required");
            int iM60658N31 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "heart_rate_label");
            int iM60658N32 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "heart_rate_too_low_text");
            int iM60658N33 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "heart_rate_too_high_text");
            int iM60658N34 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "heart_required_text");
            int iM60658N35 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "heart_rate_max");
            int iM60658N36 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "heart_rate_min");
            int iM60658N37 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "heart_rate_suffix");
            int iM60658N38 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "heart_rate_required");
            int iM60658N39 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "input_type");
            int iM60658N40 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "input_required");
            int iM60658N41 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "required_regex");
            int iM60658N42 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "blocked_regex");
            int iM60658N43 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "countdown_timer_required");
            int iM60658N44 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "countdown_timer_seconds");
            int iM60658N45 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "survey_form_id");
            int iM60658N46 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "survey_vendor_metadata");
            int iM60658N47 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "survey_provider");
            int i24 = iM60658N12;
            String str6 = null;
            C0062y c0062y = new C0062y(str6);
            int i25 = iM60658N11;
            C0062y c0062y2 = new C0062y(str6);
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                int i26 = iM60658N9;
                int i27 = iM60658N10;
                long j7 = interfaceC33689cMo68212g1.getLong(iM60658N2);
                if (!c0062y.m150b(j7)) {
                    c0062y.m155g(j7, new ArrayList());
                }
                str6 = null;
                c0062y2.m155g(interfaceC33689cMo68212g1.getLong(iM60658N2), null);
                iM60658N9 = i26;
                iM60658N10 = i27;
            }
            int i28 = iM60658N9;
            int i29 = iM60658N10;
            interfaceC33689cMo68212g1.reset();
            m42861t0(interfaceC33687a, c0062y);
            m42862u0(interfaceC33687a, c0062y2);
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                int i34 = (int) interfaceC33689cMo68212g1.getLong(iM60658N);
                int i35 = (int) interfaceC33689cMo68212g1.getLong(iM60658N2);
                String strMo5353J1 = interfaceC33689cMo68212g1.isNull(iM60658N3) ? str6 : interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                int i36 = (int) interfaceC33689cMo68212g1.getLong(iM60658N4);
                String strMo5353J2 = interfaceC33689cMo68212g1.isNull(iM60658N5) ? str6 : interfaceC33689cMo68212g1.mo5353J0(iM60658N5);
                String strMo5353J3 = interfaceC33689cMo68212g1.isNull(iM60658N6) ? str6 : interfaceC33689cMo68212g1.mo5353J0(iM60658N6);
                String strMo5353J4 = interfaceC33689cMo68212g1.isNull(iM60658N7) ? str6 : interfaceC33689cMo68212g1.mo5353J0(iM60658N7);
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N8)) != 0;
                int i37 = i28;
                if (interfaceC33689cMo68212g1.isNull(i37)) {
                    num = str6;
                } else {
                    numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i37));
                }
                if (num == 0) {
                    num = numValueOf;
                    boolValueOf = str6;
                } else {
                    num = numValueOf;
                    boolValueOf = Boolean.valueOf(num.intValue() != 0);
                }
                int i38 = i29;
                int i39 = iM60658N6;
                boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(i38)) != 0;
                int i44 = i25;
                String strMo5353J5 = interfaceC33689cMo68212g1.isNull(i44) ? str6 : interfaceC33689cMo68212g1.mo5353J0(i44);
                int i45 = i24;
                String strMo5353J6 = interfaceC33689cMo68212g1.isNull(i45) ? str6 : interfaceC33689cMo68212g1.mo5353J0(i45);
                int i46 = iM60658N13;
                if (interfaceC33689cMo68212g1.isNull(i46)) {
                    i14 = iM60658N14;
                    strMo5353J0 = null;
                } else {
                    i14 = iM60658N14;
                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(i46);
                }
                if (interfaceC33689cMo68212g1.isNull(i14)) {
                    i15 = iM60658N15;
                    str = null;
                } else {
                    String strMo5353J7 = interfaceC33689cMo68212g1.mo5353J0(i14);
                    i15 = iM60658N15;
                    str = strMo5353J7;
                }
                if (interfaceC33689cMo68212g1.isNull(i15)) {
                    i16 = iM60658N16;
                    str2 = null;
                } else {
                    String strMo5353J8 = interfaceC33689cMo68212g1.mo5353J0(i15);
                    i16 = iM60658N16;
                    str2 = strMo5353J8;
                }
                if (interfaceC33689cMo68212g1.isNull(i16)) {
                    i17 = iM60658N17;
                    str3 = null;
                } else {
                    String strMo5353J9 = interfaceC33689cMo68212g1.mo5353J0(i16);
                    i17 = iM60658N17;
                    str3 = strMo5353J9;
                }
                if (interfaceC33689cMo68212g1.isNull(i17)) {
                    i18 = iM60658N18;
                    str4 = null;
                } else {
                    String strMo5353J10 = interfaceC33689cMo68212g1.mo5353J0(i17);
                    i18 = iM60658N18;
                    str4 = strMo5353J10;
                }
                if (interfaceC33689cMo68212g1.isNull(i18)) {
                    i19 = iM60658N19;
                    str5 = null;
                } else {
                    String strMo5353J11 = interfaceC33689cMo68212g1.mo5353J0(i18);
                    i19 = iM60658N19;
                    str5 = strMo5353J11;
                }
                Integer numValueOf2 = interfaceC33689cMo68212g1.isNull(i19) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i19));
                int i47 = iM60658N20;
                Integer numValueOf3 = interfaceC33689cMo68212g1.isNull(i47) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i47));
                int i48 = iM60658N21;
                String strMo5353J12 = interfaceC33689cMo68212g1.isNull(i48) ? null : interfaceC33689cMo68212g1.mo5353J0(i48);
                int i49 = iM60658N22;
                Integer numValueOf4 = interfaceC33689cMo68212g1.isNull(i49) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i49));
                if (numValueOf4 == null) {
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = Boolean.valueOf(numValueOf4.intValue() != 0);
                }
                int i54 = iM60658N23;
                String strMo5353J13 = interfaceC33689cMo68212g1.isNull(i54) ? null : interfaceC33689cMo68212g1.mo5353J0(i54);
                int i55 = iM60658N24;
                String strMo5353J14 = interfaceC33689cMo68212g1.isNull(i55) ? null : interfaceC33689cMo68212g1.mo5353J0(i55);
                int i56 = i19;
                int i57 = iM60658N25;
                String strMo5353J15 = interfaceC33689cMo68212g1.isNull(i57) ? null : interfaceC33689cMo68212g1.mo5353J0(i57);
                iM60658N25 = i57;
                int i58 = iM60658N26;
                String strMo5353J16 = interfaceC33689cMo68212g1.isNull(i58) ? null : interfaceC33689cMo68212g1.mo5353J0(i58);
                iM60658N26 = i58;
                int i59 = iM60658N27;
                Integer numValueOf5 = interfaceC33689cMo68212g1.isNull(i59) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i59));
                int i64 = iM60658N28;
                Integer numValueOf6 = interfaceC33689cMo68212g1.isNull(i64) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i64));
                int i65 = iM60658N29;
                String strMo5353J17 = interfaceC33689cMo68212g1.isNull(i65) ? null : interfaceC33689cMo68212g1.mo5353J0(i65);
                int i66 = iM60658N30;
                Integer numValueOf7 = interfaceC33689cMo68212g1.isNull(i66) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i66));
                if (numValueOf7 == null) {
                    boolValueOf3 = null;
                } else {
                    boolValueOf3 = Boolean.valueOf(numValueOf7.intValue() != 0);
                }
                int i67 = iM60658N31;
                String strMo5353J18 = interfaceC33689cMo68212g1.isNull(i67) ? null : interfaceC33689cMo68212g1.mo5353J0(i67);
                int i68 = iM60658N32;
                String strMo5353J19 = interfaceC33689cMo68212g1.isNull(i68) ? null : interfaceC33689cMo68212g1.mo5353J0(i68);
                int i69 = iM60658N33;
                String strMo5353J20 = interfaceC33689cMo68212g1.isNull(i69) ? null : interfaceC33689cMo68212g1.mo5353J0(i69);
                iM60658N33 = i69;
                int i74 = iM60658N34;
                String strMo5353J21 = interfaceC33689cMo68212g1.isNull(i74) ? null : interfaceC33689cMo68212g1.mo5353J0(i74);
                iM60658N34 = i74;
                int i75 = iM60658N35;
                Integer numValueOf8 = interfaceC33689cMo68212g1.isNull(i75) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i75));
                int i76 = iM60658N36;
                Integer numValueOf9 = interfaceC33689cMo68212g1.isNull(i76) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i76));
                int i77 = iM60658N37;
                String strMo5353J22 = interfaceC33689cMo68212g1.isNull(i77) ? null : interfaceC33689cMo68212g1.mo5353J0(i77);
                int i78 = iM60658N38;
                Integer numValueOf10 = interfaceC33689cMo68212g1.isNull(i78) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i78));
                if (numValueOf10 == null) {
                    boolValueOf4 = null;
                } else {
                    boolValueOf4 = Boolean.valueOf(numValueOf10.intValue() != 0);
                }
                int i79 = iM60658N39;
                String strMo5353J23 = interfaceC33689cMo68212g1.isNull(i79) ? null : interfaceC33689cMo68212g1.mo5353J0(i79);
                int i83 = iM60658N40;
                boolean z14 = ((int) interfaceC33689cMo68212g1.getLong(i83)) != 0;
                int i84 = iM60658N41;
                String strMo5353J24 = interfaceC33689cMo68212g1.isNull(i84) ? null : interfaceC33689cMo68212g1.mo5353J0(i84);
                int i85 = iM60658N42;
                String strMo5353J25 = interfaceC33689cMo68212g1.isNull(i85) ? null : interfaceC33689cMo68212g1.mo5353J0(i85);
                int i86 = iM60658N43;
                boolean z15 = ((int) interfaceC33689cMo68212g1.getLong(i86)) != 0;
                int i87 = iM60658N44;
                int i88 = iM60658N45;
                int i89 = iM60658N46;
                iM60658N47 = iM60658N47;
                arrayList.add(new ProtocolStepWithOptions(new ProtocolStep(i34, i35, strMo5353J1, i36, strMo5353J2, strMo5353J3, strMo5353J4, z4, boolValueOf, z13, strMo5353J5, strMo5353J6, strMo5353J0, str, str2, str3, str4, str5, numValueOf2, numValueOf3, strMo5353J12, boolValueOf2, strMo5353J13, strMo5353J14, strMo5353J15, strMo5353J16, numValueOf5, numValueOf6, strMo5353J17, boolValueOf3, strMo5353J18, strMo5353J19, strMo5353J20, strMo5353J21, numValueOf8, numValueOf9, strMo5353J22, boolValueOf4, strMo5353J23, z14, strMo5353J24, strMo5353J25, z15, interfaceC33689cMo68212g1.isNull(i87) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i87)), interfaceC33689cMo68212g1.isNull(i88) ? null : interfaceC33689cMo68212g1.mo5353J0(i88), interfaceC33689cMo68212g1.isNull(i89) ? null : interfaceC33689cMo68212g1.mo5353J0(i89), this.f55446i.toSurveyProvider(interfaceC33689cMo68212g1.isNull(iM60658N47) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N47))), (ArrayList) c0062y.m151c(interfaceC33689cMo68212g1.getLong(iM60658N2)), (ProtocolStepConfig) c0062y2.m151c(interfaceC33689cMo68212g1.getLong(iM60658N2))));
                iM60658N3 = iM60658N3;
                iM60658N13 = i46;
                iM60658N = iM60658N;
                iM60658N14 = i14;
                iM60658N15 = i15;
                iM60658N16 = i16;
                iM60658N17 = i17;
                iM60658N18 = i18;
                iM60658N19 = i56;
                iM60658N23 = i54;
                iM60658N24 = i55;
                iM60658N27 = i59;
                iM60658N31 = i67;
                iM60658N32 = i68;
                iM60658N35 = i75;
                iM60658N41 = i84;
                iM60658N44 = i87;
                iM60658N5 = iM60658N5;
                iM60658N46 = i89;
                iM60658N4 = iM60658N4;
                str6 = null;
                i28 = i37;
                i24 = i45;
                iM60658N39 = i79;
                iM60658N42 = i85;
                iM60658N6 = i39;
                i29 = i38;
                i25 = i44;
                iM60658N20 = i47;
                iM60658N21 = i48;
                iM60658N22 = i49;
                iM60658N28 = i64;
                iM60658N29 = i65;
                iM60658N30 = i66;
                iM60658N36 = i76;
                iM60658N37 = i77;
                iM60658N38 = i78;
                iM60658N40 = i83;
                iM60658N43 = i86;
                iM60658N45 = i88;
            }
            return arrayList;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public /* synthetic */ WhoopLabsStudy m42819P0(int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM whoop_labs_study WHERE campaign_id = ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "study_id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "start_time");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "end_time");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "hr_device_connected");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, NotificationCompat.CATEGORY_STATUS);
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "campaign_id");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pdf_file_name");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, ProtocolStepKt.PROTOCOL_STEP_TABLE);
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "protocol_completed");
            WhoopLabsStudy whoopLabsStudy = null;
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                whoopLabsStudy = new WhoopLabsStudy((int) interfaceC33689cMo68212g1.getLong(iM60658N), this.f55440c.stringToDateTime(interfaceC33689cMo68212g1.isNull(iM60658N2) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N2)), this.f55440c.stringToDateTime(interfaceC33689cMo68212g1.isNull(iM60658N3) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N3)), ((int) interfaceC33689cMo68212g1.getLong(iM60658N4)) != 0, m42860s0(interfaceC33689cMo68212g1.mo5353J0(iM60658N5)), (int) interfaceC33689cMo68212g1.getLong(iM60658N6), interfaceC33689cMo68212g1.isNull(iM60658N7) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N7), (int) interfaceC33689cMo68212g1.getLong(iM60658N8), ((int) interfaceC33689cMo68212g1.getLong(iM60658N9)) != 0);
            }
            return whoopLabsStudy;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public /* synthetic */ List m42821Q0(int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("select * from whoop_labs_study_tag WHERE campaign_id = ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "timestamp");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "note");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "campaign_id");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "tag_id");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J0 = null;
                LocalDateTime localDateTimeStringToLocalDateTime = this.f55440c.stringToLocalDateTime(interfaceC33689cMo68212g1.isNull(iM60658N) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N));
                if (!interfaceC33689cMo68212g1.isNull(iM60658N2)) {
                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                }
                WhoopLabsStudyTag whoopLabsStudyTag = new WhoopLabsStudyTag(localDateTimeStringToLocalDateTime, strMo5353J0, (int) interfaceC33689cMo68212g1.getLong(iM60658N3));
                whoopLabsStudyTag.setId((int) interfaceC33689cMo68212g1.getLong(iM60658N4));
                arrayList.add(whoopLabsStudyTag);
            }
            return arrayList;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public /* synthetic */ C23454a0 m42823R0(ProtocolStepConfig protocolStepConfig, InterfaceC33687a interfaceC33687a) {
        this.f55453p.insert(interfaceC33687a, protocolStepConfig);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public /* synthetic */ C23454a0 m42825S0(OptionSelection optionSelection, InterfaceC33687a interfaceC33687a) {
        this.f55452o.insert(interfaceC33687a, optionSelection);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public /* synthetic */ C23454a0 m42827T0(ProtocolStep protocolStep, InterfaceC33687a interfaceC33687a) {
        this.f55445h.insert(interfaceC33687a, protocolStep);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public /* synthetic */ C23454a0 m42829U0(LabsCampaign labsCampaign, InterfaceC33687a interfaceC33687a) {
        this.f55442e.insert(interfaceC33687a, labsCampaign);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public /* synthetic */ C23454a0 m42831V0(WhoopLabsHrDevice whoopLabsHrDevice, InterfaceC33687a interfaceC33687a) {
        this.f55441d.insert(interfaceC33687a, whoopLabsHrDevice);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public /* synthetic */ C23454a0 m42833W0(ProtocolStepResult protocolStepResult, InterfaceC33687a interfaceC33687a) {
        this.f55450m.insert(interfaceC33687a, protocolStepResult);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public /* synthetic */ C23454a0 m42835X0(LastKnownStrapInfo lastKnownStrapInfo, InterfaceC33687a interfaceC33687a) {
        this.f55451n.insert(interfaceC33687a, lastKnownStrapInfo);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public /* synthetic */ C23454a0 m42837Y0(WhoopLabsStudy whoopLabsStudy, InterfaceC33687a interfaceC33687a) {
        this.f55439b.insert(interfaceC33687a, whoopLabsStudy);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public /* synthetic */ C23454a0 m42839Z0(WhoopLabsStudyTag whoopLabsStudyTag, InterfaceC33687a interfaceC33687a) {
        this.f55449l.insert(interfaceC33687a, whoopLabsStudyTag);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public /* synthetic */ C23454a0 m42841a1(ProtocolStepResult protocolStepResult, InterfaceC33687a interfaceC33687a) {
        this.f55458u.handle(interfaceC33687a, protocolStepResult);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public /* synthetic */ C23454a0 m42843b1(WhoopLabsStudy whoopLabsStudy, InterfaceC33687a interfaceC33687a) {
        this.f55457t.handle(interfaceC33687a, whoopLabsStudy);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public String m42859r0(StudyStatus studyStatus) {
        int i13 = i.f55467a[studyStatus.ordinal()];
        if (i13 == 1) {
            return "NOT_STARTED";
        }
        if (i13 == 2) {
            return "IN_PROGRESS";
        }
        if (i13 == 3) {
            return "ENDED";
        }
        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + studyStatus);
    }

    /* JADX INFO: renamed from: s0 */
    private StudyStatus m42860s0(String str) {
        str.getClass();
        switch (str) {
            case "NOT_STARTED":
                return StudyStatus.NOT_STARTED;
            case "IN_PROGRESS":
                return StudyStatus.IN_PROGRESS;
            case "ENDED":
                return StudyStatus.ENDED;
            default:
                throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: t0 */
    private void m42861t0(InterfaceC33687a interfaceC33687a, C0062y c0062y) throws Exception {
        if (c0062y.m153e()) {
            return;
        }
        if (c0062y.m157i() > 999) {
            AbstractC32411b.m101081Y(c0062y, true, new C14854f(1, this, interfaceC33687a));
            return;
        }
        StringBuilder sbM53374o = AbstractC18489d0.m53374o("SELECT `step_id`,`option_order`,`option_key`,`option_value` FROM `whoop_labs_input_option` WHERE `step_id` IN (");
        AbstractC29125c.m88533j(c0062y.m157i(), sbM53374o);
        sbM53374o.append(")");
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1(sbM53374o.toString());
        int i13 = 1;
        for (int i14 = 0; i14 < c0062y.m157i(); i14++) {
            interfaceC33689cMo68212g1.mo5356p(i13, c0062y.m154f(i14));
            i13++;
        }
        try {
            int iM60657M = AbstractC21598x.m60657M(interfaceC33689cMo68212g1, "step_id");
            if (iM60657M == -1) {
                return;
            }
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                ArrayList arrayList = (ArrayList) c0062y.m151c(interfaceC33689cMo68212g1.getLong(iM60657M));
                if (arrayList != null) {
                    int i15 = (int) interfaceC33689cMo68212g1.getLong(0);
                    int i16 = (int) interfaceC33689cMo68212g1.getLong(1);
                    String strMo5353J0 = null;
                    String strMo5353J1 = interfaceC33689cMo68212g1.isNull(2) ? null : interfaceC33689cMo68212g1.mo5353J0(2);
                    if (!interfaceC33689cMo68212g1.isNull(3)) {
                        strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(3);
                    }
                    arrayList.add(new OptionSelection(i15, i16, strMo5353J1, strMo5353J0));
                }
            }
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: renamed from: u0 */
    private void m42862u0(InterfaceC33687a interfaceC33687a, C0062y c0062y) throws Exception {
        if (c0062y.m153e()) {
            return;
        }
        if (c0062y.m157i() > 999) {
            AbstractC32411b.m101081Y(c0062y, false, new C14854f(0, this, interfaceC33687a));
            return;
        }
        StringBuilder sbM53374o = AbstractC18489d0.m53374o("SELECT `step_id`,`input_label`,`min`,`max`,`min_error_text`,`max_error_text`,`hint`,`row_count` FROM `whoop_labs_protocol_step_config` WHERE `step_id` IN (");
        AbstractC29125c.m88533j(c0062y.m157i(), sbM53374o);
        sbM53374o.append(")");
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1(sbM53374o.toString());
        int i13 = 1;
        for (int i14 = 0; i14 < c0062y.m157i(); i14++) {
            interfaceC33689cMo68212g1.mo5356p(i13, c0062y.m154f(i14));
            i13++;
        }
        try {
            int iM60657M = AbstractC21598x.m60657M(interfaceC33689cMo68212g1, "step_id");
            if (iM60657M == -1) {
                return;
            }
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                long j7 = interfaceC33689cMo68212g1.getLong(iM60657M);
                if (c0062y.m150b(j7)) {
                    c0062y.m155g(j7, new ProtocolStepConfig((int) interfaceC33689cMo68212g1.getLong(0), interfaceC33689cMo68212g1.isNull(1) ? null : interfaceC33689cMo68212g1.mo5353J0(1), interfaceC33689cMo68212g1.isNull(2) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(2)), interfaceC33689cMo68212g1.isNull(3) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(3)), interfaceC33689cMo68212g1.isNull(4) ? null : interfaceC33689cMo68212g1.mo5353J0(4), interfaceC33689cMo68212g1.isNull(5) ? null : interfaceC33689cMo68212g1.mo5353J0(5), interfaceC33689cMo68212g1.isNull(6) ? null : interfaceC33689cMo68212g1.mo5353J0(6), interfaceC33689cMo68212g1.isNull(7) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(7))));
                }
            }
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public static List<Class<?>> m42863v0() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public /* synthetic */ C23454a0 m42864w0(InterfaceC33687a interfaceC33687a, C0062y c0062y) throws Exception {
        m42861t0(interfaceC33687a, c0062y);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ C23454a0 m42865x0(InterfaceC33687a interfaceC33687a, C0062y c0062y) throws Exception {
        m42862u0(interfaceC33687a, c0062y);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ C23454a0 m42866y0(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM labs_campaign");
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ C23454a0 m42867z0(WhoopLabsHrDevice whoopLabsHrDevice, InterfaceC33687a interfaceC33687a) {
        this.f55454q.handle(interfaceC33687a, whoopLabsHrDevice);
        return C23454a0.f92919a;
    }

    @Override // fx2.InterfaceC14849a
    /* JADX INFO: renamed from: A */
    public Object mo42763A(WhoopLabsHrDevice whoopLabsHrDevice, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        whoopLabsHrDevice.getClass();
        return AbstractC15751g.m44434N(this.f55438a, false, true, new C14851c(this, whoopLabsHrDevice, 0), interfaceC30057d);
    }

    @Override // fx2.InterfaceC14849a
    /* JADX INFO: renamed from: B */
    public Object mo42764B(int i13, InterfaceC30057d<? super WhoopLabsStudy> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f55438a, true, false, new C14850b(this, i13, 4), interfaceC30057d);
    }

    @Override // fx2.InterfaceC14849a
    /* JADX INFO: renamed from: C */
    public Object mo42765C(ProtocolStepResult protocolStepResult, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        protocolStepResult.getClass();
        return AbstractC15751g.m44434N(this.f55438a, false, true, new C14852d(this, protocolStepResult, 0), interfaceC30057d);
    }

    @Override // fx2.InterfaceC14849a
    /* JADX INFO: renamed from: D */
    public Object mo42766D(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f55438a, false, true, new C14686c(14), interfaceC30057d);
    }

    @Override // fx2.InterfaceC14849a
    /* JADX INFO: renamed from: E */
    public Object mo42767E(int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f55438a, false, true, new C6494e(i13, 14), interfaceC30057d);
    }

    @Override // fx2.InterfaceC14849a
    /* JADX INFO: renamed from: G */
    public Object mo42768G(ProtocolStep protocolStep, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        protocolStep.getClass();
        return AbstractC15751g.m44434N(this.f55438a, false, true, new C14408a(3, this, protocolStep), interfaceC30057d);
    }

    @Override // fx2.InterfaceC14849a
    /* JADX INFO: renamed from: a */
    public Object mo42769a(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f55438a, false, true, new C14686c(15), interfaceC30057d);
    }

    @Override // fx2.InterfaceC14849a
    /* JADX INFO: renamed from: b */
    public Object mo42770b(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f55438a, false, true, new C14686c(18), interfaceC30057d);
    }

    @Override // fx2.InterfaceC14849a
    /* JADX INFO: renamed from: c */
    public Object mo42771c(int i13, InterfaceC30057d<? super List<ProtocolStepWithOptions>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f55438a, true, false, new C14850b(this, i13, 5), interfaceC30057d);
    }

    @Override // fx2.InterfaceC14849a
    /* JADX INFO: renamed from: d */
    public Object mo42772d(LastKnownStrapInfo lastKnownStrapInfo, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        lastKnownStrapInfo.getClass();
        return AbstractC15751g.m44434N(this.f55438a, false, true, new C14408a(5, this, lastKnownStrapInfo), interfaceC30057d);
    }

    @Override // fx2.InterfaceC14849a
    /* JADX INFO: renamed from: e */
    public Object mo42773e(WhoopLabsHrDevice whoopLabsHrDevice, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        whoopLabsHrDevice.getClass();
        return AbstractC15751g.m44434N(this.f55438a, false, true, new C14851c(this, whoopLabsHrDevice, 1), interfaceC30057d);
    }

    @Override // fx2.InterfaceC14849a
    /* JADX INFO: renamed from: f */
    public Object mo42774f(ProtocolStepConfig protocolStepConfig, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        protocolStepConfig.getClass();
        return AbstractC15751g.m44434N(this.f55438a, false, true, new C14408a(4, this, protocolStepConfig), interfaceC30057d);
    }

    @Override // fx2.InterfaceC14849a
    /* JADX INFO: renamed from: g */
    public Object mo42775g(LabsCampaign labsCampaign, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        labsCampaign.getClass();
        return AbstractC15751g.m44434N(this.f55438a, false, true, new C14408a(6, this, labsCampaign), interfaceC30057d);
    }

    @Override // fx2.InterfaceC14849a
    /* JADX INFO: renamed from: h */
    public Object mo42776h(int i13, InterfaceC30057d<? super List<ProtocolStepResult>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f55438a, true, false, new C14850b(this, i13, 0), interfaceC30057d);
    }

    @Override // fx2.InterfaceC14849a
    /* JADX INFO: renamed from: i */
    public Object mo42777i(InterfaceC30057d<? super WhoopLabsHrDevice> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f55438a, true, false, new C14686c(12), interfaceC30057d);
    }

    @Override // fx2.InterfaceC14849a
    /* JADX INFO: renamed from: j */
    public Object mo42778j(int i13, InterfaceC30057d<? super RemoteCampaign> interfaceC30057d) {
        return InterfaceC14849a.a.m42794a(this, i13, interfaceC30057d);
    }

    @Override // fx2.InterfaceC14849a
    /* JADX INFO: renamed from: k */
    public Object mo42779k(int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f55438a, false, true, new C6494e(i13, 13), interfaceC30057d);
    }

    @Override // fx2.InterfaceC14849a
    /* JADX INFO: renamed from: l */
    public Object mo42780l(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f55438a, false, true, new C14686c(13), interfaceC30057d);
    }

    @Override // fx2.InterfaceC14849a
    /* JADX INFO: renamed from: n */
    public Object mo42781n(OptionSelection optionSelection, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        optionSelection.getClass();
        return AbstractC15751g.m44434N(this.f55438a, false, true, new C14408a(8, this, optionSelection), interfaceC30057d);
    }

    @Override // fx2.InterfaceC14849a
    /* JADX INFO: renamed from: o */
    public Object mo42782o(int i13, InterfaceC30057d<? super LabsCampaign> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f55438a, true, false, new C14850b(this, i13, 1), interfaceC30057d);
    }

    @Override // fx2.InterfaceC14849a
    /* JADX INFO: renamed from: p */
    public Object mo42783p(WhoopLabsStudy whoopLabsStudy, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        whoopLabsStudy.getClass();
        return AbstractC15751g.m44434N(this.f55438a, false, true, new C14853e(this, whoopLabsStudy, 1), interfaceC30057d);
    }

    @Override // fx2.InterfaceC14849a
    /* JADX INFO: renamed from: q */
    public Object mo42784q(ProtocolStepResult protocolStepResult, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        protocolStepResult.getClass();
        return AbstractC15751g.m44434N(this.f55438a, false, true, new C14852d(this, protocolStepResult, 1), interfaceC30057d);
    }

    @Override // fx2.InterfaceC14849a
    /* JADX INFO: renamed from: r */
    public Object mo42785r(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f55438a, false, true, new C14686c(16), interfaceC30057d);
    }

    @Override // fx2.InterfaceC14849a
    /* JADX INFO: renamed from: s */
    public Object mo42786s(int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f55438a, false, true, new C6494e(i13, 11), interfaceC30057d);
    }

    @Override // fx2.InterfaceC14849a
    /* JADX INFO: renamed from: t */
    public Object mo42787t(int i13, InterfaceC30057d<? super List<ProtocolStepResultWithStepType>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f55438a, true, false, new C14850b(this, i13, 3), interfaceC30057d);
    }

    @Override // fx2.InterfaceC14849a
    /* JADX INFO: renamed from: u */
    public Object mo42788u(int i13, InterfaceC30057d<? super List<WhoopLabsStudyTag>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f55438a, true, false, new C14850b(this, i13, 2), interfaceC30057d);
    }

    @Override // fx2.InterfaceC14849a
    /* JADX INFO: renamed from: v */
    public Object mo42789v(InterfaceC30057d<? super LastKnownStrapInfo> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f55438a, true, false, new C14686c(17), interfaceC30057d);
    }

    @Override // fx2.InterfaceC14849a
    /* JADX INFO: renamed from: w */
    public Object mo42790w(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f55438a, false, true, new C14686c(19), interfaceC30057d);
    }

    @Override // fx2.InterfaceC14849a
    /* JADX INFO: renamed from: x */
    public Object mo42791x(int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f55438a, false, true, new C6494e(i13, 12), interfaceC30057d);
    }

    @Override // fx2.InterfaceC14849a
    /* JADX INFO: renamed from: y */
    public Object mo42792y(WhoopLabsStudy whoopLabsStudy, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        whoopLabsStudy.getClass();
        return AbstractC15751g.m44434N(this.f55438a, false, true, new C14853e(this, whoopLabsStudy, 0), interfaceC30057d);
    }

    @Override // fx2.InterfaceC14849a
    /* JADX INFO: renamed from: z */
    public Object mo42793z(WhoopLabsStudyTag whoopLabsStudyTag, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        whoopLabsStudyTag.getClass();
        return AbstractC15751g.m44434N(this.f55438a, false, true, new C14408a(7, this, whoopLabsStudyTag), interfaceC30057d);
    }
}
