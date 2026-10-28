package com.whoop.whooplabs.data.room.entity;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.whooplabs.data.domain.ProtocolStepResultWithStepType;
import com.whoop.whooplabs.data.remote.domain.dto.SessionDto;
import com.whoop.whooplabs.data.remote.domain.dto.SessionDto$$serializer;
import gw1.C16268a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.ReferenceArraySerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25267u;
import m83.C25271y;
import org.joda.time.DateTime;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import u82.C34641b;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 V2\u00020\u0001:\u0002VWBu\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B\u008f\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0016\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00100\rHÆ\u0003¢\u0006\u0004\b(\u0010'J\u0012\u0010)\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0092\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b/\u0010 J\u0010\u00100\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00103\u001a\u00020\b2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104J'\u0010=\u001a\u00020:2\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001¢\u0006\u0004\b;\u0010<R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010>\u0012\u0004\b@\u0010A\u001a\u0004\b?\u0010\u001dR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010>\u0012\u0004\bC\u0010A\u001a\u0004\bB\u0010\u001dR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010D\u0012\u0004\bF\u0010A\u001a\u0004\bE\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010D\u001a\u0004\bG\u0010 R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010H\u0012\u0004\bJ\u0010A\u001a\u0004\bI\u0010#R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010K\u001a\u0004\bL\u0010%R&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010M\u0012\u0004\bO\u0010A\u001a\u0004\bN\u0010'R&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010M\u0012\u0004\bQ\u0010A\u001a\u0004\bP\u0010'R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010R\u001a\u0004\bS\u0010*R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010T\u001a\u0004\bU\u0010,¨\u0006X"}, m65681d2 = {"Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;", "", "Ljava/util/Date;", "startTime", "endTime", "", "activity", "deviceName", "", "hrDeviceConnected", "", "", "campaignIds", "", "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTagDto;", "studyTags", "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;", "protocolStepResults", "Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;", "session", "", "strapBacklog", "<init>", "(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Z[Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;Ljava/lang/Long;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Z[Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/util/Date;", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "()Z", "component6", "()[Ljava/lang/Integer;", "component7", "()Ljava/util/List;", "component8", "component9", "()Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;", "component10", "()Ljava/lang/Long;", "copy", "(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Z[Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;Ljava/lang/Long;)Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whooplabs_release", "(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/util/Date;", "getStartTime", "getStartTime$annotations", "()V", "getEndTime", "getEndTime$annotations", "Ljava/lang/String;", "getActivity", "getActivity$annotations", "getDeviceName", "Z", "getHrDeviceConnected", "getHrDeviceConnected$annotations", "[Ljava/lang/Integer;", "getCampaignIds", "Ljava/util/List;", "getStudyTags", "getStudyTags$annotations", "getProtocolStepResults", "getProtocolStepResults$annotations", "Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;", "getSession", "Ljava/lang/Long;", "getStrapBacklog", "Companion", "$serializer", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WhoopLabsStudyDto {
    private static final InterfaceC23462h[] $childSerializers;
    private final String activity;
    private final Integer[] campaignIds;
    private final String deviceName;
    private final Date endTime;
    private final boolean hrDeviceConnected;
    private final List<ProtocolStepResultDto> protocolStepResults;
    private final SessionDto session;
    private final Date startTime;
    private final Long strapBacklog;
    private final List<WhoopLabsStudyTagDto> studyTags;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JS\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto$Companion;", "", "<init>", "()V", "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;", "study", "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsHrDevice;", "device", "", "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTag;", "studyTags", "Lcom/whoop/whooplabs/data/domain/ProtocolStepResultWithStepType;", "protocolStepResults", "Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;", "session", "", "strapBacklog", "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;", "fromWhoopLabsStudyAndHrDevice", "(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Lcom/whoop/whooplabs/data/room/entity/WhoopLabsHrDevice;Ljava/util/List;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;Ljava/lang/Long;)Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;", "Lwc3/c;", "serializer", "()Lwc3/c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WhoopLabsStudyDto fromWhoopLabsStudyAndHrDevice$default(Companion companion, WhoopLabsStudy whoopLabsStudy, WhoopLabsHrDevice whoopLabsHrDevice, List list, List list2, SessionDto sessionDto, Long l7, int i13, Object obj) {
            if ((i13 & 8) != 0) {
                list2 = C25271y.f99162w;
            }
            return companion.fromWhoopLabsStudyAndHrDevice(whoopLabsStudy, whoopLabsHrDevice, list, list2, (i13 & 16) != 0 ? null : sessionDto, (i13 & 32) != 0 ? null : l7);
        }

        public final WhoopLabsStudyDto fromWhoopLabsStudyAndHrDevice(WhoopLabsStudy study, WhoopLabsHrDevice device, List<WhoopLabsStudyTag> studyTags, List<ProtocolStepResultWithStepType> protocolStepResults, SessionDto session, Long strapBacklog) {
            AbstractC22676k.m65750j(study, "study");
            AbstractC22676k.m65750j(device, "device");
            AbstractC22676k.m65750j(studyTags, "studyTags");
            AbstractC22676k.m65750j(protocolStepResults, "protocolStepResults");
            DateTime startTime = study.getStartTime();
            Date date = startTime != null ? startTime.toDate() : null;
            DateTime endTime = study.getEndTime();
            Date date2 = endTime != null ? endTime.toDate() : null;
            String deviceName = device.getDeviceName();
            boolean hrDeviceConnected = study.getHrDeviceConnected();
            Integer[] numArr = {Integer.valueOf(study.getCampaignId())};
            List<WhoopLabsStudyTag> list = studyTags;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(WhoopLabsStudyTagDto.INSTANCE.fromWhoopLabsStudyTag((WhoopLabsStudyTag) it.next()));
            }
            List<ProtocolStepResultWithStepType> list2 = protocolStepResults;
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(ProtocolStepResultDto.INSTANCE.fromProtocolStepResult((ProtocolStepResultWithStepType) it3.next()));
            }
            return new WhoopLabsStudyDto(date, date2, null, deviceName, hrDeviceConnected, numArr, arrayList, arrayList2, session, strapBacklog);
        }

        public final InterfaceC37138c serializer() {
            return WhoopLabsStudyDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C16268a(18)), AbstractC30060g.m92087G(enumC23463i, new C16268a(19)), AbstractC30060g.m92087G(enumC23463i, new C16268a(20)), null, null};
    }

    public /* synthetic */ WhoopLabsStudyDto(int i13, Date date, Date date2, String str, String str2, boolean z4, Integer[] numArr, List list, List list2, SessionDto sessionDto, Long l7, SerializationConstructorMarker serializationConstructorMarker) {
        if (1023 != (i13 & 1023)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1023, WhoopLabsStudyDto$$serializer.INSTANCE.getDescriptor());
        }
        this.startTime = date;
        this.endTime = date2;
        this.activity = str;
        this.deviceName = str2;
        this.hrDeviceConnected = z4;
        this.campaignIds = numArr;
        this.studyTags = list;
        this.protocolStepResults = list2;
        this.session = sessionDto;
        this.strapBacklog = l7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new ReferenceArraySerializer(AbstractC22671h0.f89337a.getOrCreateKotlinClass(Integer.class), IntSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(WhoopLabsStudyTagDto$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(ProtocolStepResultDto$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WhoopLabsStudyDto copy$default(WhoopLabsStudyDto whoopLabsStudyDto, Date date, Date date2, String str, String str2, boolean z4, Integer[] numArr, List list, List list2, SessionDto sessionDto, Long l7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            date = whoopLabsStudyDto.startTime;
        }
        if ((i13 & 2) != 0) {
            date2 = whoopLabsStudyDto.endTime;
        }
        if ((i13 & 4) != 0) {
            str = whoopLabsStudyDto.activity;
        }
        if ((i13 & 8) != 0) {
            str2 = whoopLabsStudyDto.deviceName;
        }
        if ((i13 & 16) != 0) {
            z4 = whoopLabsStudyDto.hrDeviceConnected;
        }
        if ((i13 & 32) != 0) {
            numArr = whoopLabsStudyDto.campaignIds;
        }
        if ((i13 & 64) != 0) {
            list = whoopLabsStudyDto.studyTags;
        }
        if ((i13 & 128) != 0) {
            list2 = whoopLabsStudyDto.protocolStepResults;
        }
        if ((i13 & 256) != 0) {
            sessionDto = whoopLabsStudyDto.session;
        }
        if ((i13 & 512) != 0) {
            l7 = whoopLabsStudyDto.strapBacklog;
        }
        SessionDto sessionDto2 = sessionDto;
        Long l12 = l7;
        List list3 = list;
        List list4 = list2;
        boolean z13 = z4;
        Integer[] numArr2 = numArr;
        return whoopLabsStudyDto.copy(date, date2, str, str2, z13, numArr2, list3, list4, sessionDto2, l12);
    }

    @InterfaceC37143h("study_type")
    public static /* synthetic */ void getActivity$annotations() {
    }

    @InterfaceC37143h("end")
    @InterfaceC37144i(with = C34641b.class)
    public static /* synthetic */ void getEndTime$annotations() {
    }

    @InterfaceC37143h("external_device_connected")
    public static /* synthetic */ void getHrDeviceConnected$annotations() {
    }

    @InterfaceC37143h("steps")
    public static /* synthetic */ void getProtocolStepResults$annotations() {
    }

    @InterfaceC37143h("start")
    @InterfaceC37144i(with = C34641b.class)
    public static /* synthetic */ void getStartTime$annotations() {
    }

    @InterfaceC37143h("user_timestamps")
    public static /* synthetic */ void getStudyTags$annotations() {
    }

    public static final /* synthetic */ void write$Self$whooplabs_release(WhoopLabsStudyDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        C34641b c34641b = C34641b.f145940a;
        output.encodeNullableSerializableElement(serialDesc, 0, c34641b, self.startTime);
        output.encodeNullableSerializableElement(serialDesc, 1, c34641b, self.endTime);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.activity);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.deviceName);
        output.encodeBooleanElement(serialDesc, 4, self.hrDeviceConnected);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.campaignIds);
        output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.studyTags);
        output.encodeSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.protocolStepResults);
        output.encodeNullableSerializableElement(serialDesc, 8, SessionDto$$serializer.INSTANCE, self.session);
        output.encodeNullableSerializableElement(serialDesc, 9, LongSerializer.INSTANCE, self.strapBacklog);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Date getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getStrapBacklog() {
        return this.strapBacklog;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getActivity() {
        return this.activity;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getHrDeviceConnected() {
        return this.hrDeviceConnected;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer[] getCampaignIds() {
        return this.campaignIds;
    }

    public final List<WhoopLabsStudyTagDto> component7() {
        return this.studyTags;
    }

    public final List<ProtocolStepResultDto> component8() {
        return this.protocolStepResults;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final SessionDto getSession() {
        return this.session;
    }

    public final WhoopLabsStudyDto copy(Date startTime, Date endTime, String activity, String deviceName, boolean hrDeviceConnected, Integer[] campaignIds, List<WhoopLabsStudyTagDto> studyTags, List<ProtocolStepResultDto> protocolStepResults, SessionDto session, Long strapBacklog) {
        AbstractC22676k.m65750j(campaignIds, "campaignIds");
        AbstractC22676k.m65750j(studyTags, "studyTags");
        AbstractC22676k.m65750j(protocolStepResults, "protocolStepResults");
        return new WhoopLabsStudyDto(startTime, endTime, activity, deviceName, hrDeviceConnected, campaignIds, studyTags, protocolStepResults, session, strapBacklog);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WhoopLabsStudyDto)) {
            return false;
        }
        WhoopLabsStudyDto whoopLabsStudyDto = (WhoopLabsStudyDto) other;
        return AbstractC22676k.m65745e(this.startTime, whoopLabsStudyDto.startTime) && AbstractC22676k.m65745e(this.endTime, whoopLabsStudyDto.endTime) && AbstractC22676k.m65745e(this.activity, whoopLabsStudyDto.activity) && AbstractC22676k.m65745e(this.deviceName, whoopLabsStudyDto.deviceName) && this.hrDeviceConnected == whoopLabsStudyDto.hrDeviceConnected && AbstractC22676k.m65745e(this.campaignIds, whoopLabsStudyDto.campaignIds) && AbstractC22676k.m65745e(this.studyTags, whoopLabsStudyDto.studyTags) && AbstractC22676k.m65745e(this.protocolStepResults, whoopLabsStudyDto.protocolStepResults) && AbstractC22676k.m65745e(this.session, whoopLabsStudyDto.session) && AbstractC22676k.m65745e(this.strapBacklog, whoopLabsStudyDto.strapBacklog);
    }

    public final String getActivity() {
        return this.activity;
    }

    public final Integer[] getCampaignIds() {
        return this.campaignIds;
    }

    public final String getDeviceName() {
        return this.deviceName;
    }

    public final Date getEndTime() {
        return this.endTime;
    }

    public final boolean getHrDeviceConnected() {
        return this.hrDeviceConnected;
    }

    public final List<ProtocolStepResultDto> getProtocolStepResults() {
        return this.protocolStepResults;
    }

    public final SessionDto getSession() {
        return this.session;
    }

    public final Date getStartTime() {
        return this.startTime;
    }

    public final Long getStrapBacklog() {
        return this.strapBacklog;
    }

    public final List<WhoopLabsStudyTagDto> getStudyTags() {
        return this.studyTags;
    }

    public int hashCode() {
        Date date = this.startTime;
        int iHashCode = (date == null ? 0 : date.hashCode()) * 31;
        Date date2 = this.endTime;
        int iHashCode2 = (iHashCode + (date2 == null ? 0 : date2.hashCode())) * 31;
        String str = this.activity;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deviceName;
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b((AbstractC2875y.m8289b((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.hrDeviceConnected) + Arrays.hashCode(this.campaignIds)) * 31, 31, this.studyTags), 31, this.protocolStepResults);
        SessionDto sessionDto = this.session;
        int iHashCode4 = (iM31983b + (sessionDto == null ? 0 : sessionDto.hashCode())) * 31;
        Long l7 = this.strapBacklog;
        return iHashCode4 + (l7 != null ? l7.hashCode() : 0);
    }

    public String toString() {
        Date date = this.startTime;
        Date date2 = this.endTime;
        String str = this.activity;
        String str2 = this.deviceName;
        boolean z4 = this.hrDeviceConnected;
        String string = Arrays.toString(this.campaignIds);
        List<WhoopLabsStudyTagDto> list = this.studyTags;
        List<ProtocolStepResultDto> list2 = this.protocolStepResults;
        SessionDto sessionDto = this.session;
        Long l7 = this.strapBacklog;
        StringBuilder sb4 = new StringBuilder("WhoopLabsStudyDto(startTime=");
        sb4.append(date);
        sb4.append(", endTime=");
        sb4.append(date2);
        sb4.append(", activity=");
        AbstractC11266d.m30444B(sb4, str, ", deviceName=", str2, ", hrDeviceConnected=");
        AbstractC38963t7.m124391u(sb4, z4, ", campaignIds=", string, ", studyTags=");
        AbstractC21702c.m61148s(sb4, list, ", protocolStepResults=", list2, ", session=");
        sb4.append(sessionDto);
        sb4.append(", strapBacklog=");
        sb4.append(l7);
        sb4.append(")");
        return sb4.toString();
    }

    public WhoopLabsStudyDto(Date date, Date date2, String str, String str2, boolean z4, Integer[] campaignIds, List<WhoopLabsStudyTagDto> studyTags, List<ProtocolStepResultDto> protocolStepResults, SessionDto sessionDto, Long l7) {
        AbstractC22676k.m65750j(campaignIds, "campaignIds");
        AbstractC22676k.m65750j(studyTags, "studyTags");
        AbstractC22676k.m65750j(protocolStepResults, "protocolStepResults");
        this.startTime = date;
        this.endTime = date2;
        this.activity = str;
        this.deviceName = str2;
        this.hrDeviceConnected = z4;
        this.campaignIds = campaignIds;
        this.studyTags = studyTags;
        this.protocolStepResults = protocolStepResults;
        this.session = sessionDto;
        this.strapBacklog = l7;
    }
}
