package com.whoop.integrations.domain.models;

import androidx.profileinstaller.ProfileVerifier;
import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.MarkdownTextModel;
import com.whoop.design.models.MarkdownTextModel$$serializer;
import com.whoop.design.models.items.CtaTileModel;
import com.whoop.design.models.items.CtaTileModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import dq2.C12293a;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b1\b\u0087\b\u0018\u0000 \u0086\u00012\u00020\u0001:\u0004\u0087\u0001\u0086\u0001Bù\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#B\u008f\u0002\b\u0010\u0012\u0006\u0010%\u001a\u00020$\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b\"\u0010(J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010*J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010*J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010*J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010*J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010*J\u0012\u00100\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010*J\u0010\u00105\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b5\u0010*J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010*J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010*J\u0012\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u0010*J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u0010*J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u0010*J\u0012\u0010;\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b=\u0010*J\u0012\u0010>\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0018\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bD\u0010AJ\u0012\u0010E\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bE\u0010*J\u0012\u0010F\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\bH\u0010IJ¦\u0002\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 HÆ\u0001¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bL\u0010*J\u0010\u0010M\u001a\u00020$HÖ\u0001¢\u0006\u0004\bM\u0010NJ\u001a\u0010P\u001a\u00020\u000b2\b\u0010O\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bP\u0010QJ'\u0010Z\u001a\u00020W2\u0006\u0010R\u001a\u00020\u00002\u0006\u0010T\u001a\u00020S2\u0006\u0010V\u001a\u00020UH\u0001¢\u0006\u0004\bX\u0010YR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010[\u001a\u0004\b\\\u0010*R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010[\u001a\u0004\b]\u0010*R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010[\u001a\u0004\b^\u0010*R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010[\u001a\u0004\b_\u0010*R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010[\u0012\u0004\ba\u0010b\u001a\u0004\b`\u0010*R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010[\u0012\u0004\bd\u0010b\u001a\u0004\bc\u0010*R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010e\u0012\u0004\bg\u0010b\u001a\u0004\bf\u00101R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010h\u001a\u0004\bi\u00103R\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010[\u0012\u0004\bk\u0010b\u001a\u0004\bj\u0010*R \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010[\u0012\u0004\bm\u0010b\u001a\u0004\bl\u0010*R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010[\u001a\u0004\bn\u0010*R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010[\u0012\u0004\bp\u0010b\u001a\u0004\bo\u0010*R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010[\u0012\u0004\br\u0010b\u001a\u0004\bq\u0010*R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010[\u0012\u0004\bt\u0010b\u001a\u0004\bs\u0010*R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010[\u0012\u0004\bv\u0010b\u001a\u0004\bu\u0010*R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010w\u001a\u0004\bx\u0010<R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010[\u001a\u0004\by\u0010*R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010z\u001a\u0004\b{\u0010?R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010|\u001a\u0004\b}\u0010AR\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010~\u001a\u0004\b\u007f\u0010CR\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u001c\u0010|\u001a\u0005\b\u0080\u0001\u0010AR\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u001d\u0010[\u001a\u0005\b\u0081\u0001\u0010*R\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001f\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010GR\u001e\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b!\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010I¨\u0006\u0088\u0001"}, m65681d2 = {"Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;", "", "", "id", "reportingKey", "backgroundImageUrl", "iconUrl", "title", "description", "Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;", "learnMoreButton", "", "connected", "connectedStatus", "buttonText", "connectionUrl", "disconnectPopupTitle", "disconnectPopupDescription", "disconnectPopupPrimaryButton", "disconnectPopupSecondaryButton", "shouldPerformFullOauth", "providerId", "Lcom/whoop/design/models/items/CtaTileModel;", "upsellCtaTile", "Lcom/whoop/design/models/DesignSystemModel;", "overridePrimaryButton", "", "designItems", "footerDisclaimer", "lastUpdated", "Lcom/whoop/design/models/MarkdownTextModel;", "descriptionFootnote", "Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;", "privacyControls", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;", "component8", "()Z", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "()Ljava/lang/Boolean;", "component17", "component18", "()Lcom/whoop/design/models/items/CtaTileModel;", "component19", "()Lcom/whoop/design/models/DesignSystemModel;", "component20", "()Ljava/util/List;", "component21", "component22", "component23", "()Lcom/whoop/design/models/MarkdownTextModel;", "component24", "()Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;)Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$integrations_release", "(Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getReportingKey", "getBackgroundImageUrl", "getIconUrl", "getTitle", "getTitle$annotations", "()V", "getDescription", "getDescription$annotations", "Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;", "getLearnMoreButton", "getLearnMoreButton$annotations", "Z", "getConnected", "getConnectedStatus", "getConnectedStatus$annotations", "getButtonText", "getButtonText$annotations", "getConnectionUrl", "getDisconnectPopupTitle", "getDisconnectPopupTitle$annotations", "getDisconnectPopupDescription", "getDisconnectPopupDescription$annotations", "getDisconnectPopupPrimaryButton", "getDisconnectPopupPrimaryButton$annotations", "getDisconnectPopupSecondaryButton", "getDisconnectPopupSecondaryButton$annotations", "Ljava/lang/Boolean;", "getShouldPerformFullOauth", "getProviderId", "Lcom/whoop/design/models/items/CtaTileModel;", "getUpsellCtaTile", "Lcom/whoop/design/models/DesignSystemModel;", "getOverridePrimaryButton", "Ljava/util/List;", "getDesignItems", "getFooterDisclaimer", "getLastUpdated", "Lcom/whoop/design/models/MarkdownTextModel;", "getDescriptionFootnote", "Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;", "getPrivacyControls", "Companion", "$serializer", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class IntegrationsDetailsComponentsModel {
    private static final InterfaceC23462h[] $childSerializers;

    @SerializedName("background_image_url")
    private final String backgroundImageUrl;

    @SerializedName("button_text_display")
    private final String buttonText;

    @SerializedName("connected")
    private final boolean connected;

    @SerializedName("connected_status_display")
    private final String connectedStatus;

    @SerializedName("connection_url")
    private final String connectionUrl;

    @SerializedName("description_display")
    private final String description;

    @SerializedName("description_footnote")
    private final MarkdownTextModel descriptionFootnote;

    @SerializedName("design_items")
    private final List<DesignSystemModel> designItems;

    @SerializedName("disconnect_popup_description_display")
    private final String disconnectPopupDescription;

    @SerializedName("disconnect_popup_primary_button_display")
    private final String disconnectPopupPrimaryButton;

    @SerializedName("disconnect_popup_secondary_button_display")
    private final String disconnectPopupSecondaryButton;

    @SerializedName("disconnect_popup_title_display")
    private final String disconnectPopupTitle;

    @SerializedName("footer_disclaimer")
    private final DesignSystemModel footerDisclaimer;

    @SerializedName("icon_url")
    private final String iconUrl;

    @SerializedName("id")
    private final String id;

    @SerializedName("last_updated")
    private final String lastUpdated;

    @SerializedName("learn_more")
    private final IntegrationsLearnMoreButtonModel learnMoreButton;

    @SerializedName("override_primary_button")
    private final DesignSystemModel overridePrimaryButton;

    @SerializedName("privacy_controls")
    private final IntegrationsPrivacyControlsModel privacyControls;

    @SerializedName("provider_id")
    private final String providerId;

    @SerializedName("reporting_key")
    private final String reportingKey;

    @SerializedName("should_perform_full_oauth")
    private final Boolean shouldPerformFullOauth;

    @SerializedName("title_display")
    private final String title;

    @SerializedName("upsell_cta_tile")
    private final CtaTileModel upsellCtaTile;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;", "serializer", "()Lwc3/c;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return IntegrationsDetailsComponentsModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C12293a(5)), AbstractC30060g.m92087G(enumC23463i, new C12293a(6)), AbstractC30060g.m92087G(enumC23463i, new C12293a(7)), null, null, null};
    }

    public /* synthetic */ IntegrationsDetailsComponentsModel(int i13, String str, String str2, String str3, String str4, String str5, String str6, IntegrationsLearnMoreButtonModel integrationsLearnMoreButtonModel, boolean z4, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool, String str14, CtaTileModel ctaTileModel, DesignSystemModel designSystemModel, List list, DesignSystemModel designSystemModel2, String str15, MarkdownTextModel markdownTextModel, IntegrationsPrivacyControlsModel integrationsPrivacyControlsModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (262143 != (i13 & 262143)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 262143, IntegrationsDetailsComponentsModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.reportingKey = str2;
        this.backgroundImageUrl = str3;
        this.iconUrl = str4;
        this.title = str5;
        this.description = str6;
        this.learnMoreButton = integrationsLearnMoreButtonModel;
        this.connected = z4;
        this.connectedStatus = str7;
        this.buttonText = str8;
        this.connectionUrl = str9;
        this.disconnectPopupTitle = str10;
        this.disconnectPopupDescription = str11;
        this.disconnectPopupPrimaryButton = str12;
        this.disconnectPopupSecondaryButton = str13;
        this.shouldPerformFullOauth = bool;
        this.providerId = str14;
        this.upsellCtaTile = ctaTileModel;
        if ((262144 & i13) == 0) {
            this.overridePrimaryButton = null;
        } else {
            this.overridePrimaryButton = designSystemModel;
        }
        if ((524288 & i13) == 0) {
            this.designItems = null;
        } else {
            this.designItems = list;
        }
        if ((1048576 & i13) == 0) {
            this.footerDisclaimer = null;
        } else {
            this.footerDisclaimer = designSystemModel2;
        }
        if ((2097152 & i13) == 0) {
            this.lastUpdated = null;
        } else {
            this.lastUpdated = str15;
        }
        if ((4194304 & i13) == 0) {
            this.descriptionFootnote = null;
        } else {
            this.descriptionFootnote = markdownTextModel;
        }
        if ((i13 & 8388608) == 0) {
            this.privacyControls = null;
        } else {
            this.privacyControls = integrationsPrivacyControlsModel;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IntegrationsDetailsComponentsModel copy$default(IntegrationsDetailsComponentsModel integrationsDetailsComponentsModel, String str, String str2, String str3, String str4, String str5, String str6, IntegrationsLearnMoreButtonModel integrationsLearnMoreButtonModel, boolean z4, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool, String str14, CtaTileModel ctaTileModel, DesignSystemModel designSystemModel, List list, DesignSystemModel designSystemModel2, String str15, MarkdownTextModel markdownTextModel, IntegrationsPrivacyControlsModel integrationsPrivacyControlsModel, int i13, Object obj) {
        IntegrationsPrivacyControlsModel integrationsPrivacyControlsModel2;
        MarkdownTextModel markdownTextModel2;
        String str16 = (i13 & 1) != 0 ? integrationsDetailsComponentsModel.id : str;
        String str17 = (i13 & 2) != 0 ? integrationsDetailsComponentsModel.reportingKey : str2;
        String str18 = (i13 & 4) != 0 ? integrationsDetailsComponentsModel.backgroundImageUrl : str3;
        String str19 = (i13 & 8) != 0 ? integrationsDetailsComponentsModel.iconUrl : str4;
        String str20 = (i13 & 16) != 0 ? integrationsDetailsComponentsModel.title : str5;
        String str21 = (i13 & 32) != 0 ? integrationsDetailsComponentsModel.description : str6;
        IntegrationsLearnMoreButtonModel integrationsLearnMoreButtonModel2 = (i13 & 64) != 0 ? integrationsDetailsComponentsModel.learnMoreButton : integrationsLearnMoreButtonModel;
        boolean z13 = (i13 & 128) != 0 ? integrationsDetailsComponentsModel.connected : z4;
        String str22 = (i13 & 256) != 0 ? integrationsDetailsComponentsModel.connectedStatus : str7;
        String str23 = (i13 & 512) != 0 ? integrationsDetailsComponentsModel.buttonText : str8;
        String str24 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? integrationsDetailsComponentsModel.connectionUrl : str9;
        String str25 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? integrationsDetailsComponentsModel.disconnectPopupTitle : str10;
        String str26 = (i13 & 4096) != 0 ? integrationsDetailsComponentsModel.disconnectPopupDescription : str11;
        String str27 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? integrationsDetailsComponentsModel.disconnectPopupPrimaryButton : str12;
        String str28 = str16;
        String str29 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? integrationsDetailsComponentsModel.disconnectPopupSecondaryButton : str13;
        Boolean bool2 = (i13 & 32768) != 0 ? integrationsDetailsComponentsModel.shouldPerformFullOauth : bool;
        String str30 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? integrationsDetailsComponentsModel.providerId : str14;
        CtaTileModel ctaTileModel2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? integrationsDetailsComponentsModel.upsellCtaTile : ctaTileModel;
        DesignSystemModel designSystemModel3 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? integrationsDetailsComponentsModel.overridePrimaryButton : designSystemModel;
        List list2 = (i13 & 524288) != 0 ? integrationsDetailsComponentsModel.designItems : list;
        DesignSystemModel designSystemModel4 = (i13 & 1048576) != 0 ? integrationsDetailsComponentsModel.footerDisclaimer : designSystemModel2;
        String str31 = (i13 & 2097152) != 0 ? integrationsDetailsComponentsModel.lastUpdated : str15;
        MarkdownTextModel markdownTextModel3 = (i13 & 4194304) != 0 ? integrationsDetailsComponentsModel.descriptionFootnote : markdownTextModel;
        if ((i13 & 8388608) != 0) {
            markdownTextModel2 = markdownTextModel3;
            integrationsPrivacyControlsModel2 = integrationsDetailsComponentsModel.privacyControls;
        } else {
            integrationsPrivacyControlsModel2 = integrationsPrivacyControlsModel;
            markdownTextModel2 = markdownTextModel3;
        }
        return integrationsDetailsComponentsModel.copy(str28, str17, str18, str19, str20, str21, integrationsLearnMoreButtonModel2, z13, str22, str23, str24, str25, str26, str27, str29, bool2, str30, ctaTileModel2, designSystemModel3, list2, designSystemModel4, str31, markdownTextModel2, integrationsPrivacyControlsModel2);
    }

    @InterfaceC37143h("button_text_display")
    public static /* synthetic */ void getButtonText$annotations() {
    }

    @InterfaceC37143h("connected_status_display")
    public static /* synthetic */ void getConnectedStatus$annotations() {
    }

    @InterfaceC37143h("description_display")
    public static /* synthetic */ void getDescription$annotations() {
    }

    @InterfaceC37143h("disconnect_popup_description_display")
    public static /* synthetic */ void getDisconnectPopupDescription$annotations() {
    }

    @InterfaceC37143h("disconnect_popup_primary_button_display")
    public static /* synthetic */ void getDisconnectPopupPrimaryButton$annotations() {
    }

    @InterfaceC37143h("disconnect_popup_secondary_button_display")
    public static /* synthetic */ void getDisconnectPopupSecondaryButton$annotations() {
    }

    @InterfaceC37143h("disconnect_popup_title_display")
    public static /* synthetic */ void getDisconnectPopupTitle$annotations() {
    }

    @InterfaceC37143h("learn_more")
    public static /* synthetic */ void getLearnMoreButton$annotations() {
    }

    @InterfaceC37143h("title_display")
    public static /* synthetic */ void getTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$integrations_release(IntegrationsDetailsComponentsModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.reportingKey);
        output.encodeStringElement(serialDesc, 2, self.backgroundImageUrl);
        output.encodeStringElement(serialDesc, 3, self.iconUrl);
        output.encodeStringElement(serialDesc, 4, self.title);
        output.encodeStringElement(serialDesc, 5, self.description);
        output.encodeNullableSerializableElement(serialDesc, 6, IntegrationsLearnMoreButtonModel$$serializer.INSTANCE, self.learnMoreButton);
        output.encodeBooleanElement(serialDesc, 7, self.connected);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 8, stringSerializer, self.connectedStatus);
        output.encodeStringElement(serialDesc, 9, self.buttonText);
        output.encodeNullableSerializableElement(serialDesc, 10, stringSerializer, self.connectionUrl);
        output.encodeNullableSerializableElement(serialDesc, 11, stringSerializer, self.disconnectPopupTitle);
        output.encodeNullableSerializableElement(serialDesc, 12, stringSerializer, self.disconnectPopupDescription);
        output.encodeNullableSerializableElement(serialDesc, 13, stringSerializer, self.disconnectPopupPrimaryButton);
        output.encodeNullableSerializableElement(serialDesc, 14, stringSerializer, self.disconnectPopupSecondaryButton);
        output.encodeNullableSerializableElement(serialDesc, 15, BooleanSerializer.INSTANCE, self.shouldPerformFullOauth);
        output.encodeNullableSerializableElement(serialDesc, 16, stringSerializer, self.providerId);
        output.encodeNullableSerializableElement(serialDesc, 17, CtaTileModel$$serializer.INSTANCE, self.upsellCtaTile);
        if (output.shouldEncodeElementDefault(serialDesc, 18) || self.overridePrimaryButton != null) {
            output.encodeNullableSerializableElement(serialDesc, 18, (InterfaceC37145j) interfaceC23462hArr[18].getValue(), self.overridePrimaryButton);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 19) || self.designItems != null) {
            output.encodeNullableSerializableElement(serialDesc, 19, (InterfaceC37145j) interfaceC23462hArr[19].getValue(), self.designItems);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 20) || self.footerDisclaimer != null) {
            output.encodeNullableSerializableElement(serialDesc, 20, (InterfaceC37145j) interfaceC23462hArr[20].getValue(), self.footerDisclaimer);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 21) || self.lastUpdated != null) {
            output.encodeNullableSerializableElement(serialDesc, 21, stringSerializer, self.lastUpdated);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 22) || self.descriptionFootnote != null) {
            output.encodeNullableSerializableElement(serialDesc, 22, MarkdownTextModel$$serializer.INSTANCE, self.descriptionFootnote);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 23) && self.privacyControls == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 23, IntegrationsPrivacyControlsModel$$serializer.INSTANCE, self.privacyControls);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getConnectionUrl() {
        return this.connectionUrl;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getDisconnectPopupTitle() {
        return this.disconnectPopupTitle;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getDisconnectPopupDescription() {
        return this.disconnectPopupDescription;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getDisconnectPopupPrimaryButton() {
        return this.disconnectPopupPrimaryButton;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getDisconnectPopupSecondaryButton() {
        return this.disconnectPopupSecondaryButton;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Boolean getShouldPerformFullOauth() {
        return this.shouldPerformFullOauth;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getProviderId() {
        return this.providerId;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final CtaTileModel getUpsellCtaTile() {
        return this.upsellCtaTile;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final DesignSystemModel getOverridePrimaryButton() {
        return this.overridePrimaryButton;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getReportingKey() {
        return this.reportingKey;
    }

    public final List<DesignSystemModel> component20() {
        return this.designItems;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final DesignSystemModel getFooterDisclaimer() {
        return this.footerDisclaimer;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getLastUpdated() {
        return this.lastUpdated;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final MarkdownTextModel getDescriptionFootnote() {
        return this.descriptionFootnote;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final IntegrationsPrivacyControlsModel getPrivacyControls() {
        return this.privacyControls;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final IntegrationsLearnMoreButtonModel getLearnMoreButton() {
        return this.learnMoreButton;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getConnected() {
        return this.connected;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getConnectedStatus() {
        return this.connectedStatus;
    }

    public final IntegrationsDetailsComponentsModel copy(String id4, String reportingKey, String backgroundImageUrl, String iconUrl, String title, String description, IntegrationsLearnMoreButtonModel learnMoreButton, boolean connected, String connectedStatus, String buttonText, String connectionUrl, String disconnectPopupTitle, String disconnectPopupDescription, String disconnectPopupPrimaryButton, String disconnectPopupSecondaryButton, Boolean shouldPerformFullOauth, String providerId, CtaTileModel upsellCtaTile, DesignSystemModel overridePrimaryButton, List<? extends DesignSystemModel> designItems, DesignSystemModel footerDisclaimer, String lastUpdated, MarkdownTextModel descriptionFootnote, IntegrationsPrivacyControlsModel privacyControls) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(reportingKey, "reportingKey");
        AbstractC22676k.m65750j(backgroundImageUrl, "backgroundImageUrl");
        AbstractC22676k.m65750j(iconUrl, "iconUrl");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(buttonText, "buttonText");
        return new IntegrationsDetailsComponentsModel(id4, reportingKey, backgroundImageUrl, iconUrl, title, description, learnMoreButton, connected, connectedStatus, buttonText, connectionUrl, disconnectPopupTitle, disconnectPopupDescription, disconnectPopupPrimaryButton, disconnectPopupSecondaryButton, shouldPerformFullOauth, providerId, upsellCtaTile, overridePrimaryButton, designItems, footerDisclaimer, lastUpdated, descriptionFootnote, privacyControls);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntegrationsDetailsComponentsModel)) {
            return false;
        }
        IntegrationsDetailsComponentsModel integrationsDetailsComponentsModel = (IntegrationsDetailsComponentsModel) other;
        return AbstractC22676k.m65745e(this.id, integrationsDetailsComponentsModel.id) && AbstractC22676k.m65745e(this.reportingKey, integrationsDetailsComponentsModel.reportingKey) && AbstractC22676k.m65745e(this.backgroundImageUrl, integrationsDetailsComponentsModel.backgroundImageUrl) && AbstractC22676k.m65745e(this.iconUrl, integrationsDetailsComponentsModel.iconUrl) && AbstractC22676k.m65745e(this.title, integrationsDetailsComponentsModel.title) && AbstractC22676k.m65745e(this.description, integrationsDetailsComponentsModel.description) && AbstractC22676k.m65745e(this.learnMoreButton, integrationsDetailsComponentsModel.learnMoreButton) && this.connected == integrationsDetailsComponentsModel.connected && AbstractC22676k.m65745e(this.connectedStatus, integrationsDetailsComponentsModel.connectedStatus) && AbstractC22676k.m65745e(this.buttonText, integrationsDetailsComponentsModel.buttonText) && AbstractC22676k.m65745e(this.connectionUrl, integrationsDetailsComponentsModel.connectionUrl) && AbstractC22676k.m65745e(this.disconnectPopupTitle, integrationsDetailsComponentsModel.disconnectPopupTitle) && AbstractC22676k.m65745e(this.disconnectPopupDescription, integrationsDetailsComponentsModel.disconnectPopupDescription) && AbstractC22676k.m65745e(this.disconnectPopupPrimaryButton, integrationsDetailsComponentsModel.disconnectPopupPrimaryButton) && AbstractC22676k.m65745e(this.disconnectPopupSecondaryButton, integrationsDetailsComponentsModel.disconnectPopupSecondaryButton) && AbstractC22676k.m65745e(this.shouldPerformFullOauth, integrationsDetailsComponentsModel.shouldPerformFullOauth) && AbstractC22676k.m65745e(this.providerId, integrationsDetailsComponentsModel.providerId) && AbstractC22676k.m65745e(this.upsellCtaTile, integrationsDetailsComponentsModel.upsellCtaTile) && AbstractC22676k.m65745e(this.overridePrimaryButton, integrationsDetailsComponentsModel.overridePrimaryButton) && AbstractC22676k.m65745e(this.designItems, integrationsDetailsComponentsModel.designItems) && AbstractC22676k.m65745e(this.footerDisclaimer, integrationsDetailsComponentsModel.footerDisclaimer) && AbstractC22676k.m65745e(this.lastUpdated, integrationsDetailsComponentsModel.lastUpdated) && AbstractC22676k.m65745e(this.descriptionFootnote, integrationsDetailsComponentsModel.descriptionFootnote) && AbstractC22676k.m65745e(this.privacyControls, integrationsDetailsComponentsModel.privacyControls);
    }

    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final boolean getConnected() {
        return this.connected;
    }

    public final String getConnectedStatus() {
        return this.connectedStatus;
    }

    public final String getConnectionUrl() {
        return this.connectionUrl;
    }

    public final String getDescription() {
        return this.description;
    }

    public final MarkdownTextModel getDescriptionFootnote() {
        return this.descriptionFootnote;
    }

    public final List<DesignSystemModel> getDesignItems() {
        return this.designItems;
    }

    public final String getDisconnectPopupDescription() {
        return this.disconnectPopupDescription;
    }

    public final String getDisconnectPopupPrimaryButton() {
        return this.disconnectPopupPrimaryButton;
    }

    public final String getDisconnectPopupSecondaryButton() {
        return this.disconnectPopupSecondaryButton;
    }

    public final String getDisconnectPopupTitle() {
        return this.disconnectPopupTitle;
    }

    public final DesignSystemModel getFooterDisclaimer() {
        return this.footerDisclaimer;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLastUpdated() {
        return this.lastUpdated;
    }

    public final IntegrationsLearnMoreButtonModel getLearnMoreButton() {
        return this.learnMoreButton;
    }

    public final DesignSystemModel getOverridePrimaryButton() {
        return this.overridePrimaryButton;
    }

    public final IntegrationsPrivacyControlsModel getPrivacyControls() {
        return this.privacyControls;
    }

    public final String getProviderId() {
        return this.providerId;
    }

    public final String getReportingKey() {
        return this.reportingKey;
    }

    public final Boolean getShouldPerformFullOauth() {
        return this.shouldPerformFullOauth;
    }

    public final String getTitle() {
        return this.title;
    }

    public final CtaTileModel getUpsellCtaTile() {
        return this.upsellCtaTile;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.reportingKey), 31, this.backgroundImageUrl), 31, this.iconUrl), 31, this.title), 31, this.description);
        IntegrationsLearnMoreButtonModel integrationsLearnMoreButtonModel = this.learnMoreButton;
        int iM8289b = AbstractC2875y.m8289b((iM30450d + (integrationsLearnMoreButtonModel == null ? 0 : integrationsLearnMoreButtonModel.hashCode())) * 31, 31, this.connected);
        String str = this.connectedStatus;
        int iM30450d2 = AbstractC11266d.m30450d((iM8289b + (str == null ? 0 : str.hashCode())) * 31, 31, this.buttonText);
        String str2 = this.connectionUrl;
        int iHashCode = (iM30450d2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.disconnectPopupTitle;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.disconnectPopupDescription;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.disconnectPopupPrimaryButton;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.disconnectPopupSecondaryButton;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.shouldPerformFullOauth;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str7 = this.providerId;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        CtaTileModel ctaTileModel = this.upsellCtaTile;
        int iHashCode8 = (iHashCode7 + (ctaTileModel == null ? 0 : ctaTileModel.hashCode())) * 31;
        DesignSystemModel designSystemModel = this.overridePrimaryButton;
        int iHashCode9 = (iHashCode8 + (designSystemModel == null ? 0 : designSystemModel.hashCode())) * 31;
        List<DesignSystemModel> list = this.designItems;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        DesignSystemModel designSystemModel2 = this.footerDisclaimer;
        int iHashCode11 = (iHashCode10 + (designSystemModel2 == null ? 0 : designSystemModel2.hashCode())) * 31;
        String str8 = this.lastUpdated;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        MarkdownTextModel markdownTextModel = this.descriptionFootnote;
        int iHashCode13 = (iHashCode12 + (markdownTextModel == null ? 0 : markdownTextModel.hashCode())) * 31;
        IntegrationsPrivacyControlsModel integrationsPrivacyControlsModel = this.privacyControls;
        return iHashCode13 + (integrationsPrivacyControlsModel != null ? integrationsPrivacyControlsModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.reportingKey;
        String str3 = this.backgroundImageUrl;
        String str4 = this.iconUrl;
        String str5 = this.title;
        String str6 = this.description;
        IntegrationsLearnMoreButtonModel integrationsLearnMoreButtonModel = this.learnMoreButton;
        boolean z4 = this.connected;
        String str7 = this.connectedStatus;
        String str8 = this.buttonText;
        String str9 = this.connectionUrl;
        String str10 = this.disconnectPopupTitle;
        String str11 = this.disconnectPopupDescription;
        String str12 = this.disconnectPopupPrimaryButton;
        String str13 = this.disconnectPopupSecondaryButton;
        Boolean bool = this.shouldPerformFullOauth;
        String str14 = this.providerId;
        CtaTileModel ctaTileModel = this.upsellCtaTile;
        DesignSystemModel designSystemModel = this.overridePrimaryButton;
        List<DesignSystemModel> list = this.designItems;
        DesignSystemModel designSystemModel2 = this.footerDisclaimer;
        String str15 = this.lastUpdated;
        MarkdownTextModel markdownTextModel = this.descriptionFootnote;
        IntegrationsPrivacyControlsModel integrationsPrivacyControlsModel = this.privacyControls;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("IntegrationsDetailsComponentsModel(id=", str, ", reportingKey=", str2, ", backgroundImageUrl=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", iconUrl=", str4, ", title=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", description=", str6, ", learnMoreButton=");
        sbM32001t.append(integrationsLearnMoreButtonModel);
        sbM32001t.append(", connected=");
        sbM32001t.append(z4);
        sbM32001t.append(", connectedStatus=");
        AbstractC11266d.m30444B(sbM32001t, str7, ", buttonText=", str8, ", connectionUrl=");
        AbstractC11266d.m30444B(sbM32001t, str9, ", disconnectPopupTitle=", str10, ", disconnectPopupDescription=");
        AbstractC11266d.m30444B(sbM32001t, str11, ", disconnectPopupPrimaryButton=", str12, ", disconnectPopupSecondaryButton=");
        AbstractC36095b.m114692t(bool, str13, ", shouldPerformFullOauth=", ", providerId=", sbM32001t);
        sbM32001t.append(str14);
        sbM32001t.append(", upsellCtaTile=");
        sbM32001t.append(ctaTileModel);
        sbM32001t.append(", overridePrimaryButton=");
        sbM32001t.append(designSystemModel);
        sbM32001t.append(", designItems=");
        sbM32001t.append(list);
        sbM32001t.append(", footerDisclaimer=");
        sbM32001t.append(designSystemModel2);
        sbM32001t.append(", lastUpdated=");
        sbM32001t.append(str15);
        sbM32001t.append(", descriptionFootnote=");
        sbM32001t.append(markdownTextModel);
        sbM32001t.append(", privacyControls=");
        sbM32001t.append(integrationsPrivacyControlsModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IntegrationsDetailsComponentsModel(String id4, String reportingKey, String backgroundImageUrl, String iconUrl, String title, String description, IntegrationsLearnMoreButtonModel integrationsLearnMoreButtonModel, boolean z4, String str, String buttonText, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, CtaTileModel ctaTileModel, DesignSystemModel designSystemModel, List<? extends DesignSystemModel> list, DesignSystemModel designSystemModel2, String str8, MarkdownTextModel markdownTextModel, IntegrationsPrivacyControlsModel integrationsPrivacyControlsModel) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(reportingKey, "reportingKey");
        AbstractC22676k.m65750j(backgroundImageUrl, "backgroundImageUrl");
        AbstractC22676k.m65750j(iconUrl, "iconUrl");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(buttonText, "buttonText");
        this.id = id4;
        this.reportingKey = reportingKey;
        this.backgroundImageUrl = backgroundImageUrl;
        this.iconUrl = iconUrl;
        this.title = title;
        this.description = description;
        this.learnMoreButton = integrationsLearnMoreButtonModel;
        this.connected = z4;
        this.connectedStatus = str;
        this.buttonText = buttonText;
        this.connectionUrl = str2;
        this.disconnectPopupTitle = str3;
        this.disconnectPopupDescription = str4;
        this.disconnectPopupPrimaryButton = str5;
        this.disconnectPopupSecondaryButton = str6;
        this.shouldPerformFullOauth = bool;
        this.providerId = str7;
        this.upsellCtaTile = ctaTileModel;
        this.overridePrimaryButton = designSystemModel;
        this.designItems = list;
        this.footerDisclaimer = designSystemModel2;
        this.lastUpdated = str8;
        this.descriptionFootnote = markdownTextModel;
        this.privacyControls = integrationsPrivacyControlsModel;
    }

    public /* synthetic */ IntegrationsDetailsComponentsModel(String str, String str2, String str3, String str4, String str5, String str6, IntegrationsLearnMoreButtonModel integrationsLearnMoreButtonModel, boolean z4, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool, String str14, CtaTileModel ctaTileModel, DesignSystemModel designSystemModel, List list, DesignSystemModel designSystemModel2, String str15, MarkdownTextModel markdownTextModel, IntegrationsPrivacyControlsModel integrationsPrivacyControlsModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, integrationsLearnMoreButtonModel, z4, str7, str8, str9, str10, str11, str12, str13, bool, str14, ctaTileModel, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? null : designSystemModel, (i13 & 524288) != 0 ? null : list, (i13 & 1048576) != 0 ? null : designSystemModel2, (i13 & 2097152) != 0 ? null : str15, (i13 & 4194304) != 0 ? null : markdownTextModel, (i13 & 8388608) != 0 ? null : integrationsPrivacyControlsModel);
    }
}
