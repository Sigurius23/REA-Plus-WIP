package com.whoop.whooplabs.data.remote.domain.dto.bff;

import androidx.profileinstaller.ProfileVerifier;
import c13.AbstractC3855a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.whooplabs.data.domain.SurveyProvider;
import dq2.C12293a;
import dx2.C12430a;
import hx2.C17711a;
import ih0.AbstractC18489d0;
import java.util.Map;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\b\u0087\b\u0018\u0000 |2\u00020\u0001:\u0002}|Bç\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001e\u0010\u001fBí\u0001\b\u0010\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0012\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b)\u0010'J\u0012\u0010*\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b*\u0010'J\u0012\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b+\u0010'J\u0012\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b,\u0010'J\u0012\u0010-\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b-\u0010'J\u0012\u0010.\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b0\u0010/J\u0012\u00101\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b3\u0010'J\u0012\u00104\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b4\u00105J \u00106\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b@\u0010'J\u0012\u0010A\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bA\u0010'J\u0088\u0002\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0018\b\u0002\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bD\u0010'J\u0010\u0010E\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bE\u0010%J\u001a\u0010G\u001a\u00020\f2\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bG\u0010HJ'\u0010Q\u001a\u00020N2\u0006\u0010I\u001a\u00020\u00002\u0006\u0010K\u001a\u00020J2\u0006\u0010M\u001a\u00020LH\u0001¢\u0006\u0004\bO\u0010PR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010R\u001a\u0004\bS\u0010%R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010T\u0012\u0004\bV\u0010W\u001a\u0004\bU\u0010'R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010T\u0012\u0004\bY\u0010W\u001a\u0004\bX\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010T\u001a\u0004\bZ\u0010'R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010T\u001a\u0004\b[\u0010'R\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010T\u0012\u0004\b]\u0010W\u001a\u0004\b\\\u0010'R\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010T\u0012\u0004\b_\u0010W\u001a\u0004\b^\u0010'R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010T\u0012\u0004\ba\u0010W\u001a\u0004\b`\u0010'R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010b\u0012\u0004\bc\u0010W\u001a\u0004\b\r\u0010/R\"\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010b\u0012\u0004\bd\u0010W\u001a\u0004\b\u000e\u0010/R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010e\u0012\u0004\bg\u0010W\u001a\u0004\bf\u00102R \u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010T\u0012\u0004\bi\u0010W\u001a\u0004\bh\u0010'R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010j\u001a\u0004\bk\u00105R0\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010l\u0012\u0004\bn\u0010W\u001a\u0004\bm\u00107R \u0010\u0016\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010o\u0012\u0004\bq\u0010W\u001a\u0004\bp\u00109R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010r\u0012\u0004\bt\u0010W\u001a\u0004\bs\u0010;R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010u\u0012\u0004\bw\u0010W\u001a\u0004\bv\u0010=R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010x\u001a\u0004\by\u0010?R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010T\u001a\u0004\bz\u0010'R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010T\u001a\u0004\b{\u0010'¨\u0006~"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;", "", "", "id", "", "title", "subtitle", "content", "imageUrl", "imageAlt", "webViewUrl", "webViewTitle", "", "isTimerActive", "isBthr", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;", "mysticResponse", "cta", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;", "inputType", "", "inputConfig", "countDownTimerRequired", "countDownTimerSeconds", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;", "btHrConfig", "Lcom/whoop/whooplabs/data/domain/SurveyProvider;", "surveyProvider", "surveyFormId", "surveyVendorMetadata", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;Ljava/util/Map;ZLjava/lang/Integer;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;Lcom/whoop/whooplabs/data/domain/SurveyProvider;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;Ljava/util/Map;ZLjava/lang/Integer;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;Lcom/whoop/whooplabs/data/domain/SurveyProvider;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Ljava/lang/Boolean;", "component10", "component11", "()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;", "component12", "component13", "()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;", "component14", "()Ljava/util/Map;", "component15", "()Z", "component16", "()Ljava/lang/Integer;", "component17", "()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;", "component18", "()Lcom/whoop/whooplabs/data/domain/SurveyProvider;", "component19", "component20", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;Ljava/util/Map;ZLjava/lang/Integer;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;Lcom/whoop/whooplabs/data/domain/SurveyProvider;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whooplabs_release", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "I", "getId", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getSubtitle", "getSubtitle$annotations", "getContent", "getImageUrl", "getImageAlt", "getImageAlt$annotations", "getWebViewUrl", "getWebViewUrl$annotations", "getWebViewTitle", "getWebViewTitle$annotations", "Ljava/lang/Boolean;", "isTimerActive$annotations", "isBthr$annotations", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;", "getMysticResponse", "getMysticResponse$annotations", "getCta", "getCta$annotations", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;", "getInputType", "Ljava/util/Map;", "getInputConfig", "getInputConfig$annotations", "Z", "getCountDownTimerRequired", "getCountDownTimerRequired$annotations", "Ljava/lang/Integer;", "getCountDownTimerSeconds", "getCountDownTimerSeconds$annotations", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;", "getBtHrConfig", "getBtHrConfig$annotations", "Lcom/whoop/whooplabs/data/domain/SurveyProvider;", "getSurveyProvider", "getSurveyFormId", "getSurveyVendorMetadata", "Companion", "$serializer", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CampaignStepResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final BtHrConfigResponse btHrConfig;
    private final String content;
    private final boolean countDownTimerRequired;
    private final Integer countDownTimerSeconds;
    private final String cta;
    private final int id;
    private final String imageAlt;
    private final String imageUrl;
    private final Map<String, Object> inputConfig;
    private final InputType inputType;
    private final Boolean isBthr;
    private final Boolean isTimerActive;
    private final MysticResponse mysticResponse;
    private final String subtitle;
    private final String surveyFormId;
    private final SurveyProvider surveyProvider;
    private final String surveyVendorMetadata;
    private final String title;
    private final String webViewTitle;
    private final String webViewUrl;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;", "serializer", "()Lwc3/c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CampaignStepResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C12293a(29)), null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C12430a(0)), null, null};
    }

    public /* synthetic */ CampaignStepResponse(int i13, int i14, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, MysticResponse mysticResponse, String str8, InputType inputType, Map map, boolean z4, Integer num, BtHrConfigResponse btHrConfigResponse, SurveyProvider surveyProvider, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if (15615 != (i13 & 15615)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15615, CampaignStepResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.id = i14;
        this.title = str;
        this.subtitle = str2;
        this.content = str3;
        this.imageUrl = str4;
        this.imageAlt = str5;
        this.webViewUrl = str6;
        this.webViewTitle = str7;
        if ((i13 & 256) == 0) {
            this.isTimerActive = Boolean.FALSE;
        } else {
            this.isTimerActive = bool;
        }
        if ((i13 & 512) == 0) {
            this.isBthr = Boolean.FALSE;
        } else {
            this.isBthr = bool2;
        }
        this.mysticResponse = mysticResponse;
        this.cta = str8;
        this.inputType = inputType;
        this.inputConfig = map;
        this.countDownTimerRequired = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 0 ? false : z4;
        if ((32768 & i13) == 0) {
            this.countDownTimerSeconds = null;
        } else {
            this.countDownTimerSeconds = num;
        }
        if ((65536 & i13) == 0) {
            this.btHrConfig = null;
        } else {
            this.btHrConfig = btHrConfigResponse;
        }
        if ((131072 & i13) == 0) {
            this.surveyProvider = null;
        } else {
            this.surveyProvider = surveyProvider;
        }
        if ((262144 & i13) == 0) {
            this.surveyFormId = null;
        } else {
            this.surveyFormId = str9;
        }
        if ((i13 & 524288) == 0) {
            this.surveyVendorMetadata = null;
        } else {
            this.surveyVendorMetadata = str10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return InputType.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return SurveyProvider.INSTANCE.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CampaignStepResponse copy$default(CampaignStepResponse campaignStepResponse, int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, MysticResponse mysticResponse, String str8, InputType inputType, Map map, boolean z4, Integer num, BtHrConfigResponse btHrConfigResponse, SurveyProvider surveyProvider, String str9, String str10, int i14, Object obj) {
        String str11;
        String str12;
        int i15 = (i14 & 1) != 0 ? campaignStepResponse.id : i13;
        String str13 = (i14 & 2) != 0 ? campaignStepResponse.title : str;
        String str14 = (i14 & 4) != 0 ? campaignStepResponse.subtitle : str2;
        String str15 = (i14 & 8) != 0 ? campaignStepResponse.content : str3;
        String str16 = (i14 & 16) != 0 ? campaignStepResponse.imageUrl : str4;
        String str17 = (i14 & 32) != 0 ? campaignStepResponse.imageAlt : str5;
        String str18 = (i14 & 64) != 0 ? campaignStepResponse.webViewUrl : str6;
        String str19 = (i14 & 128) != 0 ? campaignStepResponse.webViewTitle : str7;
        Boolean bool3 = (i14 & 256) != 0 ? campaignStepResponse.isTimerActive : bool;
        Boolean bool4 = (i14 & 512) != 0 ? campaignStepResponse.isBthr : bool2;
        MysticResponse mysticResponse2 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? campaignStepResponse.mysticResponse : mysticResponse;
        String str20 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? campaignStepResponse.cta : str8;
        InputType inputType2 = (i14 & 4096) != 0 ? campaignStepResponse.inputType : inputType;
        Map map2 = (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? campaignStepResponse.inputConfig : map;
        int i16 = i15;
        boolean z13 = (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? campaignStepResponse.countDownTimerRequired : z4;
        Integer num2 = (i14 & 32768) != 0 ? campaignStepResponse.countDownTimerSeconds : num;
        BtHrConfigResponse btHrConfigResponse2 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? campaignStepResponse.btHrConfig : btHrConfigResponse;
        SurveyProvider surveyProvider2 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? campaignStepResponse.surveyProvider : surveyProvider;
        String str21 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? campaignStepResponse.surveyFormId : str9;
        if ((i14 & 524288) != 0) {
            str12 = str21;
            str11 = campaignStepResponse.surveyVendorMetadata;
        } else {
            str11 = str10;
            str12 = str21;
        }
        return campaignStepResponse.copy(i16, str13, str14, str15, str16, str17, str18, str19, bool3, bool4, mysticResponse2, str20, inputType2, map2, z13, num2, btHrConfigResponse2, surveyProvider2, str12, str11);
    }

    @InterfaceC37143h("bthrs_config")
    public static /* synthetic */ void getBtHrConfig$annotations() {
    }

    @InterfaceC37143h("countdown_timer_required")
    public static /* synthetic */ void getCountDownTimerRequired$annotations() {
    }

    @InterfaceC37143h("countdown_timer_seconds")
    public static /* synthetic */ void getCountDownTimerSeconds$annotations() {
    }

    @InterfaceC37143h("cta_display")
    public static /* synthetic */ void getCta$annotations() {
    }

    @InterfaceC37143h("image_alt_text")
    public static /* synthetic */ void getImageAlt$annotations() {
    }

    @InterfaceC37144i(with = C17711a.class)
    public static /* synthetic */ void getInputConfig$annotations() {
    }

    @InterfaceC37143h("mystic_config")
    public static /* synthetic */ void getMysticResponse$annotations() {
    }

    @InterfaceC37143h("page_subtitle_display")
    public static /* synthetic */ void getSubtitle$annotations() {
    }

    @InterfaceC37143h("page_title_display")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @InterfaceC37143h("webview_title_text")
    public static /* synthetic */ void getWebViewTitle$annotations() {
    }

    @InterfaceC37143h("webview_url")
    public static /* synthetic */ void getWebViewUrl$annotations() {
    }

    @InterfaceC37143h("bthrs_step")
    public static /* synthetic */ void isBthr$annotations() {
    }

    @InterfaceC37143h("show_timer")
    public static /* synthetic */ void isTimerActive$annotations() {
    }

    public static final /* synthetic */ void write$Self$whooplabs_release(CampaignStepResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeIntElement(serialDesc, 0, self.id);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.title);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.subtitle);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.content);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.imageUrl);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.imageAlt);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.webViewUrl);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.webViewTitle);
        if (output.shouldEncodeElementDefault(serialDesc, 8) || !AbstractC22676k.m65745e(self.isTimerActive, Boolean.FALSE)) {
            output.encodeNullableSerializableElement(serialDesc, 8, BooleanSerializer.INSTANCE, self.isTimerActive);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || !AbstractC22676k.m65745e(self.isBthr, Boolean.FALSE)) {
            output.encodeNullableSerializableElement(serialDesc, 9, BooleanSerializer.INSTANCE, self.isBthr);
        }
        output.encodeNullableSerializableElement(serialDesc, 10, MysticResponse$$serializer.INSTANCE, self.mysticResponse);
        output.encodeStringElement(serialDesc, 11, self.cta);
        output.encodeNullableSerializableElement(serialDesc, 12, (InterfaceC37145j) interfaceC23462hArr[12].getValue(), self.inputType);
        output.encodeNullableSerializableElement(serialDesc, 13, C17711a.f68844a, self.inputConfig);
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.countDownTimerRequired) {
            output.encodeBooleanElement(serialDesc, 14, self.countDownTimerRequired);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || self.countDownTimerSeconds != null) {
            output.encodeNullableSerializableElement(serialDesc, 15, IntSerializer.INSTANCE, self.countDownTimerSeconds);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 16) || self.btHrConfig != null) {
            output.encodeNullableSerializableElement(serialDesc, 16, BtHrConfigResponse$$serializer.INSTANCE, self.btHrConfig);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 17) || self.surveyProvider != null) {
            output.encodeNullableSerializableElement(serialDesc, 17, (InterfaceC37145j) interfaceC23462hArr[17].getValue(), self.surveyProvider);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 18) || self.surveyFormId != null) {
            output.encodeNullableSerializableElement(serialDesc, 18, stringSerializer, self.surveyFormId);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 19) && self.surveyVendorMetadata == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 19, stringSerializer, self.surveyVendorMetadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getIsBthr() {
        return this.isBthr;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final MysticResponse getMysticResponse() {
        return this.mysticResponse;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final InputType getInputType() {
        return this.inputType;
    }

    public final Map<String, Object> component14() {
        return this.inputConfig;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getCountDownTimerRequired() {
        return this.countDownTimerRequired;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Integer getCountDownTimerSeconds() {
        return this.countDownTimerSeconds;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final BtHrConfigResponse getBtHrConfig() {
        return this.btHrConfig;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final SurveyProvider getSurveyProvider() {
        return this.surveyProvider;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getSurveyFormId() {
        return this.surveyFormId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getSurveyVendorMetadata() {
        return this.surveyVendorMetadata;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getImageAlt() {
        return this.imageAlt;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getWebViewUrl() {
        return this.webViewUrl;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getWebViewTitle() {
        return this.webViewTitle;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getIsTimerActive() {
        return this.isTimerActive;
    }

    public final CampaignStepResponse copy(int id4, String title, String subtitle, String content, String imageUrl, String imageAlt, String webViewUrl, String webViewTitle, Boolean isTimerActive, Boolean isBthr, MysticResponse mysticResponse, String cta, InputType inputType, Map<String, ? extends Object> inputConfig, boolean countDownTimerRequired, Integer countDownTimerSeconds, BtHrConfigResponse btHrConfig, SurveyProvider surveyProvider, String surveyFormId, String surveyVendorMetadata) {
        AbstractC22676k.m65750j(cta, "cta");
        return new CampaignStepResponse(id4, title, subtitle, content, imageUrl, imageAlt, webViewUrl, webViewTitle, isTimerActive, isBthr, mysticResponse, cta, inputType, inputConfig, countDownTimerRequired, countDownTimerSeconds, btHrConfig, surveyProvider, surveyFormId, surveyVendorMetadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CampaignStepResponse)) {
            return false;
        }
        CampaignStepResponse campaignStepResponse = (CampaignStepResponse) other;
        return this.id == campaignStepResponse.id && AbstractC22676k.m65745e(this.title, campaignStepResponse.title) && AbstractC22676k.m65745e(this.subtitle, campaignStepResponse.subtitle) && AbstractC22676k.m65745e(this.content, campaignStepResponse.content) && AbstractC22676k.m65745e(this.imageUrl, campaignStepResponse.imageUrl) && AbstractC22676k.m65745e(this.imageAlt, campaignStepResponse.imageAlt) && AbstractC22676k.m65745e(this.webViewUrl, campaignStepResponse.webViewUrl) && AbstractC22676k.m65745e(this.webViewTitle, campaignStepResponse.webViewTitle) && AbstractC22676k.m65745e(this.isTimerActive, campaignStepResponse.isTimerActive) && AbstractC22676k.m65745e(this.isBthr, campaignStepResponse.isBthr) && AbstractC22676k.m65745e(this.mysticResponse, campaignStepResponse.mysticResponse) && AbstractC22676k.m65745e(this.cta, campaignStepResponse.cta) && this.inputType == campaignStepResponse.inputType && AbstractC22676k.m65745e(this.inputConfig, campaignStepResponse.inputConfig) && this.countDownTimerRequired == campaignStepResponse.countDownTimerRequired && AbstractC22676k.m65745e(this.countDownTimerSeconds, campaignStepResponse.countDownTimerSeconds) && AbstractC22676k.m65745e(this.btHrConfig, campaignStepResponse.btHrConfig) && this.surveyProvider == campaignStepResponse.surveyProvider && AbstractC22676k.m65745e(this.surveyFormId, campaignStepResponse.surveyFormId) && AbstractC22676k.m65745e(this.surveyVendorMetadata, campaignStepResponse.surveyVendorMetadata);
    }

    public final BtHrConfigResponse getBtHrConfig() {
        return this.btHrConfig;
    }

    public final String getContent() {
        return this.content;
    }

    public final boolean getCountDownTimerRequired() {
        return this.countDownTimerRequired;
    }

    public final Integer getCountDownTimerSeconds() {
        return this.countDownTimerSeconds;
    }

    public final String getCta() {
        return this.cta;
    }

    public final int getId() {
        return this.id;
    }

    public final String getImageAlt() {
        return this.imageAlt;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final Map<String, Object> getInputConfig() {
        return this.inputConfig;
    }

    public final InputType getInputType() {
        return this.inputType;
    }

    public final MysticResponse getMysticResponse() {
        return this.mysticResponse;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getSurveyFormId() {
        return this.surveyFormId;
    }

    public final SurveyProvider getSurveyProvider() {
        return this.surveyProvider;
    }

    public final String getSurveyVendorMetadata() {
        return this.surveyVendorMetadata;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getWebViewTitle() {
        return this.webViewTitle;
    }

    public final String getWebViewUrl() {
        return this.webViewUrl;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.content;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.imageUrl;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.imageAlt;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.webViewUrl;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.webViewTitle;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.isTimerActive;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isBthr;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        MysticResponse mysticResponse = this.mysticResponse;
        int iM30450d = AbstractC11266d.m30450d((iHashCode10 + (mysticResponse == null ? 0 : mysticResponse.hashCode())) * 31, 31, this.cta);
        InputType inputType = this.inputType;
        int iHashCode11 = (iM30450d + (inputType == null ? 0 : inputType.hashCode())) * 31;
        Map<String, Object> map = this.inputConfig;
        int iM8289b = AbstractC2875y.m8289b((iHashCode11 + (map == null ? 0 : map.hashCode())) * 31, 31, this.countDownTimerRequired);
        Integer num = this.countDownTimerSeconds;
        int iHashCode12 = (iM8289b + (num == null ? 0 : num.hashCode())) * 31;
        BtHrConfigResponse btHrConfigResponse = this.btHrConfig;
        int iHashCode13 = (iHashCode12 + (btHrConfigResponse == null ? 0 : btHrConfigResponse.hashCode())) * 31;
        SurveyProvider surveyProvider = this.surveyProvider;
        int iHashCode14 = (iHashCode13 + (surveyProvider == null ? 0 : surveyProvider.hashCode())) * 31;
        String str8 = this.surveyFormId;
        int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.surveyVendorMetadata;
        return iHashCode15 + (str9 != null ? str9.hashCode() : 0);
    }

    public final Boolean isBthr() {
        return this.isBthr;
    }

    public final Boolean isTimerActive() {
        return this.isTimerActive;
    }

    public String toString() {
        int i13 = this.id;
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.content;
        String str4 = this.imageUrl;
        String str5 = this.imageAlt;
        String str6 = this.webViewUrl;
        String str7 = this.webViewTitle;
        Boolean bool = this.isTimerActive;
        Boolean bool2 = this.isBthr;
        MysticResponse mysticResponse = this.mysticResponse;
        String str8 = this.cta;
        InputType inputType = this.inputType;
        Map<String, Object> map = this.inputConfig;
        boolean z4 = this.countDownTimerRequired;
        Integer num = this.countDownTimerSeconds;
        BtHrConfigResponse btHrConfigResponse = this.btHrConfig;
        SurveyProvider surveyProvider = this.surveyProvider;
        String str9 = this.surveyFormId;
        String str10 = this.surveyVendorMetadata;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "CampaignStepResponse(id=", ", title=", str, ", subtitle=");
        AbstractC11266d.m30444B(sbM53373n, str2, ", content=", str3, ", imageUrl=");
        AbstractC11266d.m30444B(sbM53373n, str4, ", imageAlt=", str5, ", webViewUrl=");
        AbstractC11266d.m30444B(sbM53373n, str6, ", webViewTitle=", str7, ", isTimerActive=");
        AbstractC3855a.m11839w(sbM53373n, bool, ", isBthr=", bool2, ", mysticResponse=");
        sbM53373n.append(mysticResponse);
        sbM53373n.append(", cta=");
        sbM53373n.append(str8);
        sbM53373n.append(", inputType=");
        sbM53373n.append(inputType);
        sbM53373n.append(", inputConfig=");
        sbM53373n.append(map);
        sbM53373n.append(", countDownTimerRequired=");
        sbM53373n.append(z4);
        sbM53373n.append(", countDownTimerSeconds=");
        sbM53373n.append(num);
        sbM53373n.append(", btHrConfig=");
        sbM53373n.append(btHrConfigResponse);
        sbM53373n.append(", surveyProvider=");
        sbM53373n.append(surveyProvider);
        sbM53373n.append(", surveyFormId=");
        return AbstractC11266d.m30464r(sbM53373n, str9, ", surveyVendorMetadata=", str10, ")");
    }

    public CampaignStepResponse(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, MysticResponse mysticResponse, String cta, InputType inputType, Map<String, ? extends Object> map, boolean z4, Integer num, BtHrConfigResponse btHrConfigResponse, SurveyProvider surveyProvider, String str8, String str9) {
        AbstractC22676k.m65750j(cta, "cta");
        this.id = i13;
        this.title = str;
        this.subtitle = str2;
        this.content = str3;
        this.imageUrl = str4;
        this.imageAlt = str5;
        this.webViewUrl = str6;
        this.webViewTitle = str7;
        this.isTimerActive = bool;
        this.isBthr = bool2;
        this.mysticResponse = mysticResponse;
        this.cta = cta;
        this.inputType = inputType;
        this.inputConfig = map;
        this.countDownTimerRequired = z4;
        this.countDownTimerSeconds = num;
        this.btHrConfig = btHrConfigResponse;
        this.surveyProvider = surveyProvider;
        this.surveyFormId = str8;
        this.surveyVendorMetadata = str9;
    }

    public /* synthetic */ CampaignStepResponse(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, MysticResponse mysticResponse, String str8, InputType inputType, Map map, boolean z4, Integer num, BtHrConfigResponse btHrConfigResponse, SurveyProvider surveyProvider, String str9, String str10, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, str, str2, str3, str4, str5, str6, str7, (i14 & 256) != 0 ? Boolean.FALSE : bool, (i14 & 512) != 0 ? Boolean.FALSE : bool2, mysticResponse, str8, inputType, map, (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? false : z4, (32768 & i14) != 0 ? null : num, (65536 & i14) != 0 ? null : btHrConfigResponse, (131072 & i14) != 0 ? null : surveyProvider, (262144 & i14) != 0 ? null : str9, (i14 & 524288) != 0 ? null : str10);
    }
}
