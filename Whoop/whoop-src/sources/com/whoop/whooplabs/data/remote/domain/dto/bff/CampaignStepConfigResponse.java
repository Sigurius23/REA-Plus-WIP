package com.whoop.whooplabs.data.remote.domain.dto.bff;

import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import dq2.C12293a;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import live.hms.video.utils.AndroidSDKConstants;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\b\u0087\b\u0018\u0000 \u0087\u00012\u00020\u0001:\u0004\u0088\u0001\u0087\u0001B\u0085\u0002\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%BÍ\u0002\b\u0010\u0012\u0006\u0010&\u001a\u00020\u0005\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b$\u0010)J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b.\u0010-J\u0010\u0010/\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b1\u00100J\u0010\u00102\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b2\u00100J\u0010\u00103\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b3\u00100J\u0010\u00104\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b4\u00100J\u0010\u00105\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b5\u00100J\u0010\u00106\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b6\u00100J\u0010\u00107\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b7\u00100J\u0010\u00108\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b8\u00100J\u0010\u00109\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b9\u00100J\u0010\u0010:\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b:\u00100J\u0010\u0010;\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b;\u00100J\u0010\u0010<\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b<\u00100J\u0010\u0010=\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b=\u00100J\u0010\u0010>\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b>\u00100J\u0010\u0010?\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b?\u00100J\u0010\u0010@\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b@\u00100J\u0010\u0010A\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bA\u00100J\u0010\u0010B\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bB\u00100J\u0010\u0010C\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bC\u00100J\u0010\u0010D\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bD\u00100J\u0010\u0010E\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bE\u00100J\u0010\u0010F\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bF\u00100J\u0010\u0010G\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bG\u00100J\u0010\u0010H\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bH\u00100J\u0010\u0010I\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bI\u00100J\u0012\u0010J\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0004\bJ\u0010KJÈ\u0002\u0010L\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"HÆ\u0001¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\bN\u00100J\u0010\u0010O\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\bO\u0010PJ\u001a\u0010S\u001a\u00020R2\b\u0010Q\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bS\u0010TJ'\u0010]\u001a\u00020Z2\u0006\u0010U\u001a\u00020\u00002\u0006\u0010W\u001a\u00020V2\u0006\u0010Y\u001a\u00020XH\u0001¢\u0006\u0004\b[\u0010\\R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010^\u001a\u0004\b_\u0010+R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010`\u001a\u0004\ba\u0010-R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010`\u001a\u0004\bb\u0010-R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010c\u001a\u0004\bd\u00100R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010c\u001a\u0004\be\u00100R\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010c\u001a\u0004\bf\u00100R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010c\u001a\u0004\bg\u00100R\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010c\u001a\u0004\bh\u00100R\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010c\u001a\u0004\bi\u00100R\u0017\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010c\u001a\u0004\bj\u00100R \u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010c\u0012\u0004\bl\u0010m\u001a\u0004\bk\u00100R \u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010c\u0012\u0004\bo\u0010m\u001a\u0004\bn\u00100R\u0017\u0010\u0011\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010c\u001a\u0004\bp\u00100R\u0017\u0010\u0012\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010c\u001a\u0004\bq\u00100R\u0017\u0010\u0013\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010c\u001a\u0004\br\u00100R\u0017\u0010\u0014\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010c\u001a\u0004\bs\u00100R\u0017\u0010\u0015\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010c\u001a\u0004\bt\u00100R\u0017\u0010\u0016\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010c\u001a\u0004\bu\u00100R\u0017\u0010\u0017\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010c\u001a\u0004\bv\u00100R\u0017\u0010\u0018\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010c\u001a\u0004\bw\u00100R\u0017\u0010\u0019\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010c\u001a\u0004\bx\u00100R\u0017\u0010\u001a\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010c\u001a\u0004\by\u00100R\u0017\u0010\u001b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010c\u001a\u0004\bz\u00100R\u0017\u0010\u001c\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010c\u001a\u0004\b{\u00100R \u0010\u001d\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010c\u0012\u0004\b}\u0010m\u001a\u0004\b|\u00100R\u0017\u0010\u001e\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010c\u001a\u0004\b~\u00100R\u0017\u0010\u001f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010c\u001a\u0004\b\u007f\u00100R\"\u0010 \u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b \u0010c\u0012\u0005\b\u0081\u0001\u0010m\u001a\u0005\b\u0080\u0001\u00100R\"\u0010!\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b!\u0010c\u0012\u0005\b\u0083\u0001\u0010m\u001a\u0005\b\u0082\u0001\u00100R%\u0010#\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b#\u0010\u0084\u0001\u0012\u0005\b\u0086\u0001\u0010m\u001a\u0005\b\u0085\u0001\u0010K¨\u0006\u0089\u0001"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;", "", "", "", "dataTypes", "", "additionalDataCollection", "bthrAdditionalDataCollection", "submittingText", "successIcon", "successText", "successSubtext", "successBackgroundUrl", "submitErrorTitle", "submitErrorBody", "errorCta", "errorDiscard", "submittedText", "submittedCta", "cancelCta", "cancelDialogTitle", "cancelDialogBody", "cancelDialogPositiveCta", "cancelDialogNegativeCta", "startErrorTitle", "startErrorBody", "startErrorPositiveCta", "startErrorNegativeCta", "startErrorMissingStrapBody", "startErrorBtHrFailedBody", "webViewErrorTitle", "webViewErrorBody", "webViewPositiveCta", "webViewNegativeCta", "Lcom/whoop/navigation/e;", "navigationAction", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "()Ljava/lang/String;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whooplabs_release", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/util/List;", "getDataTypes", "Ljava/lang/Integer;", "getAdditionalDataCollection", "getBthrAdditionalDataCollection", "Ljava/lang/String;", "getSubmittingText", "getSuccessIcon", "getSuccessText", "getSuccessSubtext", "getSuccessBackgroundUrl", "getSubmitErrorTitle", "getSubmitErrorBody", "getErrorCta", "getErrorCta$annotations", "()V", "getErrorDiscard", "getErrorDiscard$annotations", "getSubmittedText", "getSubmittedCta", "getCancelCta", "getCancelDialogTitle", "getCancelDialogBody", "getCancelDialogPositiveCta", "getCancelDialogNegativeCta", "getStartErrorTitle", "getStartErrorBody", "getStartErrorPositiveCta", "getStartErrorNegativeCta", "getStartErrorMissingStrapBody", "getStartErrorBtHrFailedBody", "getStartErrorBtHrFailedBody$annotations", "getWebViewErrorTitle", "getWebViewErrorBody", "getWebViewPositiveCta", "getWebViewPositiveCta$annotations", "getWebViewNegativeCta", "getWebViewNegativeCta$annotations", "Lcom/whoop/navigation/e;", "getNavigationAction", "getNavigationAction$annotations", "Companion", "$serializer", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CampaignStepConfigResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final Integer additionalDataCollection;
    private final Integer bthrAdditionalDataCollection;
    private final String cancelCta;
    private final String cancelDialogBody;
    private final String cancelDialogNegativeCta;
    private final String cancelDialogPositiveCta;
    private final String cancelDialogTitle;
    private final List<String> dataTypes;
    private final String errorCta;
    private final String errorDiscard;
    private final C9598e navigationAction;
    private final String startErrorBody;
    private final String startErrorBtHrFailedBody;
    private final String startErrorMissingStrapBody;
    private final String startErrorNegativeCta;
    private final String startErrorPositiveCta;
    private final String startErrorTitle;
    private final String submitErrorBody;
    private final String submitErrorTitle;
    private final String submittedCta;
    private final String submittedText;
    private final String submittingText;
    private final String successBackgroundUrl;
    private final String successIcon;
    private final String successSubtext;
    private final String successText;
    private final String webViewErrorBody;
    private final String webViewErrorTitle;
    private final String webViewNegativeCta;
    private final String webViewPositiveCta;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;", "serializer", "()Lwc3/c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CampaignStepConfigResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C12293a(27)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C12293a(28))};
    }

    public /* synthetic */ CampaignStepConfigResponse(int i13, List list, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (1073741822 != (i13 & 1073741822)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1073741822, CampaignStepConfigResponse$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.dataTypes = C25271y.f99162w;
        } else {
            this.dataTypes = list;
        }
        this.additionalDataCollection = num;
        this.bthrAdditionalDataCollection = num2;
        this.submittingText = str;
        this.successIcon = str2;
        this.successText = str3;
        this.successSubtext = str4;
        this.successBackgroundUrl = str5;
        this.submitErrorTitle = str6;
        this.submitErrorBody = str7;
        this.errorCta = str8;
        this.errorDiscard = str9;
        this.submittedText = str10;
        this.submittedCta = str11;
        this.cancelCta = str12;
        this.cancelDialogTitle = str13;
        this.cancelDialogBody = str14;
        this.cancelDialogPositiveCta = str15;
        this.cancelDialogNegativeCta = str16;
        this.startErrorTitle = str17;
        this.startErrorBody = str18;
        this.startErrorPositiveCta = str19;
        this.startErrorNegativeCta = str20;
        this.startErrorMissingStrapBody = str21;
        this.startErrorBtHrFailedBody = str22;
        this.webViewErrorTitle = str23;
        this.webViewErrorBody = str24;
        this.webViewPositiveCta = str25;
        this.webViewNegativeCta = str26;
        this.navigationAction = c9598e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CampaignStepConfigResponse copy$default(CampaignStepConfigResponse campaignStepConfigResponse, List list, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, C9598e c9598e, int i13, Object obj) {
        C9598e c9598e2;
        String str27;
        List list2 = (i13 & 1) != 0 ? campaignStepConfigResponse.dataTypes : list;
        Integer num3 = (i13 & 2) != 0 ? campaignStepConfigResponse.additionalDataCollection : num;
        Integer num4 = (i13 & 4) != 0 ? campaignStepConfigResponse.bthrAdditionalDataCollection : num2;
        String str28 = (i13 & 8) != 0 ? campaignStepConfigResponse.submittingText : str;
        String str29 = (i13 & 16) != 0 ? campaignStepConfigResponse.successIcon : str2;
        String str30 = (i13 & 32) != 0 ? campaignStepConfigResponse.successText : str3;
        String str31 = (i13 & 64) != 0 ? campaignStepConfigResponse.successSubtext : str4;
        String str32 = (i13 & 128) != 0 ? campaignStepConfigResponse.successBackgroundUrl : str5;
        String str33 = (i13 & 256) != 0 ? campaignStepConfigResponse.submitErrorTitle : str6;
        String str34 = (i13 & 512) != 0 ? campaignStepConfigResponse.submitErrorBody : str7;
        String str35 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? campaignStepConfigResponse.errorCta : str8;
        String str36 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? campaignStepConfigResponse.errorDiscard : str9;
        String str37 = (i13 & 4096) != 0 ? campaignStepConfigResponse.submittedText : str10;
        String str38 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? campaignStepConfigResponse.submittedCta : str11;
        List list3 = list2;
        String str39 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? campaignStepConfigResponse.cancelCta : str12;
        String str40 = (i13 & 32768) != 0 ? campaignStepConfigResponse.cancelDialogTitle : str13;
        String str41 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? campaignStepConfigResponse.cancelDialogBody : str14;
        String str42 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? campaignStepConfigResponse.cancelDialogPositiveCta : str15;
        String str43 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? campaignStepConfigResponse.cancelDialogNegativeCta : str16;
        String str44 = (i13 & 524288) != 0 ? campaignStepConfigResponse.startErrorTitle : str17;
        String str45 = (i13 & 1048576) != 0 ? campaignStepConfigResponse.startErrorBody : str18;
        String str46 = (i13 & 2097152) != 0 ? campaignStepConfigResponse.startErrorPositiveCta : str19;
        String str47 = (i13 & 4194304) != 0 ? campaignStepConfigResponse.startErrorNegativeCta : str20;
        String str48 = (i13 & 8388608) != 0 ? campaignStepConfigResponse.startErrorMissingStrapBody : str21;
        String str49 = (i13 & 16777216) != 0 ? campaignStepConfigResponse.startErrorBtHrFailedBody : str22;
        String str50 = (i13 & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? campaignStepConfigResponse.webViewErrorTitle : str23;
        String str51 = (i13 & 67108864) != 0 ? campaignStepConfigResponse.webViewErrorBody : str24;
        String str52 = (i13 & 134217728) != 0 ? campaignStepConfigResponse.webViewPositiveCta : str25;
        String str53 = (i13 & 268435456) != 0 ? campaignStepConfigResponse.webViewNegativeCta : str26;
        if ((i13 & 536870912) != 0) {
            str27 = str53;
            c9598e2 = campaignStepConfigResponse.navigationAction;
        } else {
            c9598e2 = c9598e;
            str27 = str53;
        }
        return campaignStepConfigResponse.copy(list3, num3, num4, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, str48, str49, str50, str51, str52, str27, c9598e2);
    }

    @InterfaceC37143h("submit_error_positive_cta")
    public static /* synthetic */ void getErrorCta$annotations() {
    }

    @InterfaceC37143h("submit_error_negative_cta")
    public static /* synthetic */ void getErrorDiscard$annotations() {
    }

    @InterfaceC37143h(NotificationCompat.CATEGORY_NAVIGATION)
    public static /* synthetic */ void getNavigationAction$annotations() {
    }

    @InterfaceC37143h("start_error_bthr_failed_body")
    public static /* synthetic */ void getStartErrorBtHrFailedBody$annotations() {
    }

    @InterfaceC37143h("web_view_error_negative_cta")
    public static /* synthetic */ void getWebViewNegativeCta$annotations() {
    }

    @InterfaceC37143h("web_view_error_positive_cta")
    public static /* synthetic */ void getWebViewPositiveCta$annotations() {
    }

    public static final /* synthetic */ void write$Self$whooplabs_release(CampaignStepConfigResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.dataTypes, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.dataTypes);
        }
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, intSerializer, self.additionalDataCollection);
        output.encodeNullableSerializableElement(serialDesc, 2, intSerializer, self.bthrAdditionalDataCollection);
        output.encodeStringElement(serialDesc, 3, self.submittingText);
        output.encodeStringElement(serialDesc, 4, self.successIcon);
        output.encodeStringElement(serialDesc, 5, self.successText);
        output.encodeStringElement(serialDesc, 6, self.successSubtext);
        output.encodeStringElement(serialDesc, 7, self.successBackgroundUrl);
        output.encodeStringElement(serialDesc, 8, self.submitErrorTitle);
        output.encodeStringElement(serialDesc, 9, self.submitErrorBody);
        output.encodeStringElement(serialDesc, 10, self.errorCta);
        output.encodeStringElement(serialDesc, 11, self.errorDiscard);
        output.encodeStringElement(serialDesc, 12, self.submittedText);
        output.encodeStringElement(serialDesc, 13, self.submittedCta);
        output.encodeStringElement(serialDesc, 14, self.cancelCta);
        output.encodeStringElement(serialDesc, 15, self.cancelDialogTitle);
        output.encodeStringElement(serialDesc, 16, self.cancelDialogBody);
        output.encodeStringElement(serialDesc, 17, self.cancelDialogPositiveCta);
        output.encodeStringElement(serialDesc, 18, self.cancelDialogNegativeCta);
        output.encodeStringElement(serialDesc, 19, self.startErrorTitle);
        output.encodeStringElement(serialDesc, 20, self.startErrorBody);
        output.encodeStringElement(serialDesc, 21, self.startErrorPositiveCta);
        output.encodeStringElement(serialDesc, 22, self.startErrorNegativeCta);
        output.encodeStringElement(serialDesc, 23, self.startErrorMissingStrapBody);
        output.encodeStringElement(serialDesc, 24, self.startErrorBtHrFailedBody);
        output.encodeStringElement(serialDesc, 25, self.webViewErrorTitle);
        output.encodeStringElement(serialDesc, 26, self.webViewErrorBody);
        output.encodeStringElement(serialDesc, 27, self.webViewPositiveCta);
        output.encodeStringElement(serialDesc, 28, self.webViewNegativeCta);
        output.encodeNullableSerializableElement(serialDesc, 29, (InterfaceC37145j) interfaceC23462hArr[29].getValue(), self.navigationAction);
    }

    public final List<String> component1() {
        return this.dataTypes;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSubmitErrorBody() {
        return this.submitErrorBody;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getErrorCta() {
        return this.errorCta;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getErrorDiscard() {
        return this.errorDiscard;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getSubmittedText() {
        return this.submittedText;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getSubmittedCta() {
        return this.submittedCta;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getCancelCta() {
        return this.cancelCta;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getCancelDialogTitle() {
        return this.cancelDialogTitle;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getCancelDialogBody() {
        return this.cancelDialogBody;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getCancelDialogPositiveCta() {
        return this.cancelDialogPositiveCta;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getCancelDialogNegativeCta() {
        return this.cancelDialogNegativeCta;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getAdditionalDataCollection() {
        return this.additionalDataCollection;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getStartErrorTitle() {
        return this.startErrorTitle;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getStartErrorBody() {
        return this.startErrorBody;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getStartErrorPositiveCta() {
        return this.startErrorPositiveCta;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getStartErrorNegativeCta() {
        return this.startErrorNegativeCta;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getStartErrorMissingStrapBody() {
        return this.startErrorMissingStrapBody;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getStartErrorBtHrFailedBody() {
        return this.startErrorBtHrFailedBody;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getWebViewErrorTitle() {
        return this.webViewErrorTitle;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getWebViewErrorBody() {
        return this.webViewErrorBody;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getWebViewPositiveCta() {
        return this.webViewPositiveCta;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getWebViewNegativeCta() {
        return this.webViewNegativeCta;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getBthrAdditionalDataCollection() {
        return this.bthrAdditionalDataCollection;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final C9598e getNavigationAction() {
        return this.navigationAction;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubmittingText() {
        return this.submittingText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSuccessIcon() {
        return this.successIcon;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSuccessText() {
        return this.successText;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSuccessSubtext() {
        return this.successSubtext;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSuccessBackgroundUrl() {
        return this.successBackgroundUrl;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSubmitErrorTitle() {
        return this.submitErrorTitle;
    }

    public final CampaignStepConfigResponse copy(List<String> dataTypes, Integer additionalDataCollection, Integer bthrAdditionalDataCollection, String submittingText, String successIcon, String successText, String successSubtext, String successBackgroundUrl, String submitErrorTitle, String submitErrorBody, String errorCta, String errorDiscard, String submittedText, String submittedCta, String cancelCta, String cancelDialogTitle, String cancelDialogBody, String cancelDialogPositiveCta, String cancelDialogNegativeCta, String startErrorTitle, String startErrorBody, String startErrorPositiveCta, String startErrorNegativeCta, String startErrorMissingStrapBody, String startErrorBtHrFailedBody, String webViewErrorTitle, String webViewErrorBody, String webViewPositiveCta, String webViewNegativeCta, C9598e navigationAction) {
        AbstractC22676k.m65750j(dataTypes, "dataTypes");
        AbstractC22676k.m65750j(submittingText, "submittingText");
        AbstractC22676k.m65750j(successIcon, "successIcon");
        AbstractC22676k.m65750j(successText, "successText");
        AbstractC22676k.m65750j(successSubtext, "successSubtext");
        AbstractC22676k.m65750j(successBackgroundUrl, "successBackgroundUrl");
        AbstractC22676k.m65750j(submitErrorTitle, "submitErrorTitle");
        AbstractC22676k.m65750j(submitErrorBody, "submitErrorBody");
        AbstractC22676k.m65750j(errorCta, "errorCta");
        AbstractC22676k.m65750j(errorDiscard, "errorDiscard");
        AbstractC22676k.m65750j(submittedText, "submittedText");
        AbstractC22676k.m65750j(submittedCta, "submittedCta");
        AbstractC22676k.m65750j(cancelCta, "cancelCta");
        AbstractC22676k.m65750j(cancelDialogTitle, "cancelDialogTitle");
        AbstractC22676k.m65750j(cancelDialogBody, "cancelDialogBody");
        AbstractC22676k.m65750j(cancelDialogPositiveCta, "cancelDialogPositiveCta");
        AbstractC22676k.m65750j(cancelDialogNegativeCta, "cancelDialogNegativeCta");
        AbstractC22676k.m65750j(startErrorTitle, "startErrorTitle");
        AbstractC22676k.m65750j(startErrorBody, "startErrorBody");
        AbstractC22676k.m65750j(startErrorPositiveCta, "startErrorPositiveCta");
        AbstractC22676k.m65750j(startErrorNegativeCta, "startErrorNegativeCta");
        AbstractC22676k.m65750j(startErrorMissingStrapBody, "startErrorMissingStrapBody");
        AbstractC22676k.m65750j(startErrorBtHrFailedBody, "startErrorBtHrFailedBody");
        AbstractC22676k.m65750j(webViewErrorTitle, "webViewErrorTitle");
        AbstractC22676k.m65750j(webViewErrorBody, "webViewErrorBody");
        AbstractC22676k.m65750j(webViewPositiveCta, "webViewPositiveCta");
        AbstractC22676k.m65750j(webViewNegativeCta, "webViewNegativeCta");
        return new CampaignStepConfigResponse(dataTypes, additionalDataCollection, bthrAdditionalDataCollection, submittingText, successIcon, successText, successSubtext, successBackgroundUrl, submitErrorTitle, submitErrorBody, errorCta, errorDiscard, submittedText, submittedCta, cancelCta, cancelDialogTitle, cancelDialogBody, cancelDialogPositiveCta, cancelDialogNegativeCta, startErrorTitle, startErrorBody, startErrorPositiveCta, startErrorNegativeCta, startErrorMissingStrapBody, startErrorBtHrFailedBody, webViewErrorTitle, webViewErrorBody, webViewPositiveCta, webViewNegativeCta, navigationAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CampaignStepConfigResponse)) {
            return false;
        }
        CampaignStepConfigResponse campaignStepConfigResponse = (CampaignStepConfigResponse) other;
        return AbstractC22676k.m65745e(this.dataTypes, campaignStepConfigResponse.dataTypes) && AbstractC22676k.m65745e(this.additionalDataCollection, campaignStepConfigResponse.additionalDataCollection) && AbstractC22676k.m65745e(this.bthrAdditionalDataCollection, campaignStepConfigResponse.bthrAdditionalDataCollection) && AbstractC22676k.m65745e(this.submittingText, campaignStepConfigResponse.submittingText) && AbstractC22676k.m65745e(this.successIcon, campaignStepConfigResponse.successIcon) && AbstractC22676k.m65745e(this.successText, campaignStepConfigResponse.successText) && AbstractC22676k.m65745e(this.successSubtext, campaignStepConfigResponse.successSubtext) && AbstractC22676k.m65745e(this.successBackgroundUrl, campaignStepConfigResponse.successBackgroundUrl) && AbstractC22676k.m65745e(this.submitErrorTitle, campaignStepConfigResponse.submitErrorTitle) && AbstractC22676k.m65745e(this.submitErrorBody, campaignStepConfigResponse.submitErrorBody) && AbstractC22676k.m65745e(this.errorCta, campaignStepConfigResponse.errorCta) && AbstractC22676k.m65745e(this.errorDiscard, campaignStepConfigResponse.errorDiscard) && AbstractC22676k.m65745e(this.submittedText, campaignStepConfigResponse.submittedText) && AbstractC22676k.m65745e(this.submittedCta, campaignStepConfigResponse.submittedCta) && AbstractC22676k.m65745e(this.cancelCta, campaignStepConfigResponse.cancelCta) && AbstractC22676k.m65745e(this.cancelDialogTitle, campaignStepConfigResponse.cancelDialogTitle) && AbstractC22676k.m65745e(this.cancelDialogBody, campaignStepConfigResponse.cancelDialogBody) && AbstractC22676k.m65745e(this.cancelDialogPositiveCta, campaignStepConfigResponse.cancelDialogPositiveCta) && AbstractC22676k.m65745e(this.cancelDialogNegativeCta, campaignStepConfigResponse.cancelDialogNegativeCta) && AbstractC22676k.m65745e(this.startErrorTitle, campaignStepConfigResponse.startErrorTitle) && AbstractC22676k.m65745e(this.startErrorBody, campaignStepConfigResponse.startErrorBody) && AbstractC22676k.m65745e(this.startErrorPositiveCta, campaignStepConfigResponse.startErrorPositiveCta) && AbstractC22676k.m65745e(this.startErrorNegativeCta, campaignStepConfigResponse.startErrorNegativeCta) && AbstractC22676k.m65745e(this.startErrorMissingStrapBody, campaignStepConfigResponse.startErrorMissingStrapBody) && AbstractC22676k.m65745e(this.startErrorBtHrFailedBody, campaignStepConfigResponse.startErrorBtHrFailedBody) && AbstractC22676k.m65745e(this.webViewErrorTitle, campaignStepConfigResponse.webViewErrorTitle) && AbstractC22676k.m65745e(this.webViewErrorBody, campaignStepConfigResponse.webViewErrorBody) && AbstractC22676k.m65745e(this.webViewPositiveCta, campaignStepConfigResponse.webViewPositiveCta) && AbstractC22676k.m65745e(this.webViewNegativeCta, campaignStepConfigResponse.webViewNegativeCta) && AbstractC22676k.m65745e(this.navigationAction, campaignStepConfigResponse.navigationAction);
    }

    public final Integer getAdditionalDataCollection() {
        return this.additionalDataCollection;
    }

    public final Integer getBthrAdditionalDataCollection() {
        return this.bthrAdditionalDataCollection;
    }

    public final String getCancelCta() {
        return this.cancelCta;
    }

    public final String getCancelDialogBody() {
        return this.cancelDialogBody;
    }

    public final String getCancelDialogNegativeCta() {
        return this.cancelDialogNegativeCta;
    }

    public final String getCancelDialogPositiveCta() {
        return this.cancelDialogPositiveCta;
    }

    public final String getCancelDialogTitle() {
        return this.cancelDialogTitle;
    }

    public final List<String> getDataTypes() {
        return this.dataTypes;
    }

    public final String getErrorCta() {
        return this.errorCta;
    }

    public final String getErrorDiscard() {
        return this.errorDiscard;
    }

    public final C9598e getNavigationAction() {
        return this.navigationAction;
    }

    public final String getStartErrorBody() {
        return this.startErrorBody;
    }

    public final String getStartErrorBtHrFailedBody() {
        return this.startErrorBtHrFailedBody;
    }

    public final String getStartErrorMissingStrapBody() {
        return this.startErrorMissingStrapBody;
    }

    public final String getStartErrorNegativeCta() {
        return this.startErrorNegativeCta;
    }

    public final String getStartErrorPositiveCta() {
        return this.startErrorPositiveCta;
    }

    public final String getStartErrorTitle() {
        return this.startErrorTitle;
    }

    public final String getSubmitErrorBody() {
        return this.submitErrorBody;
    }

    public final String getSubmitErrorTitle() {
        return this.submitErrorTitle;
    }

    public final String getSubmittedCta() {
        return this.submittedCta;
    }

    public final String getSubmittedText() {
        return this.submittedText;
    }

    public final String getSubmittingText() {
        return this.submittingText;
    }

    public final String getSuccessBackgroundUrl() {
        return this.successBackgroundUrl;
    }

    public final String getSuccessIcon() {
        return this.successIcon;
    }

    public final String getSuccessSubtext() {
        return this.successSubtext;
    }

    public final String getSuccessText() {
        return this.successText;
    }

    public final String getWebViewErrorBody() {
        return this.webViewErrorBody;
    }

    public final String getWebViewErrorTitle() {
        return this.webViewErrorTitle;
    }

    public final String getWebViewNegativeCta() {
        return this.webViewNegativeCta;
    }

    public final String getWebViewPositiveCta() {
        return this.webViewPositiveCta;
    }

    public int hashCode() {
        int iHashCode = this.dataTypes.hashCode() * 31;
        Integer num = this.additionalDataCollection;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.bthrAdditionalDataCollection;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.submittingText), 31, this.successIcon), 31, this.successText), 31, this.successSubtext), 31, this.successBackgroundUrl), 31, this.submitErrorTitle), 31, this.submitErrorBody), 31, this.errorCta), 31, this.errorDiscard), 31, this.submittedText), 31, this.submittedCta), 31, this.cancelCta), 31, this.cancelDialogTitle), 31, this.cancelDialogBody), 31, this.cancelDialogPositiveCta), 31, this.cancelDialogNegativeCta), 31, this.startErrorTitle), 31, this.startErrorBody), 31, this.startErrorPositiveCta), 31, this.startErrorNegativeCta), 31, this.startErrorMissingStrapBody), 31, this.startErrorBtHrFailedBody), 31, this.webViewErrorTitle), 31, this.webViewErrorBody), 31, this.webViewPositiveCta), 31, this.webViewNegativeCta);
        C9598e c9598e = this.navigationAction;
        return iM30450d + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        List<String> list = this.dataTypes;
        Integer num = this.additionalDataCollection;
        Integer num2 = this.bthrAdditionalDataCollection;
        String str = this.submittingText;
        String str2 = this.successIcon;
        String str3 = this.successText;
        String str4 = this.successSubtext;
        String str5 = this.successBackgroundUrl;
        String str6 = this.submitErrorTitle;
        String str7 = this.submitErrorBody;
        String str8 = this.errorCta;
        String str9 = this.errorDiscard;
        String str10 = this.submittedText;
        String str11 = this.submittedCta;
        String str12 = this.cancelCta;
        String str13 = this.cancelDialogTitle;
        String str14 = this.cancelDialogBody;
        String str15 = this.cancelDialogPositiveCta;
        String str16 = this.cancelDialogNegativeCta;
        String str17 = this.startErrorTitle;
        String str18 = this.startErrorBody;
        String str19 = this.startErrorPositiveCta;
        String str20 = this.startErrorNegativeCta;
        String str21 = this.startErrorMissingStrapBody;
        String str22 = this.startErrorBtHrFailedBody;
        String str23 = this.webViewErrorTitle;
        String str24 = this.webViewErrorBody;
        String str25 = this.webViewPositiveCta;
        String str26 = this.webViewNegativeCta;
        C9598e c9598e = this.navigationAction;
        StringBuilder sb4 = new StringBuilder("CampaignStepConfigResponse(dataTypes=");
        sb4.append(list);
        sb4.append(", additionalDataCollection=");
        sb4.append(num);
        sb4.append(", bthrAdditionalDataCollection=");
        AbstractC13673n.m38577x(num2, ", submittingText=", str, ", successIcon=", sb4);
        AbstractC11266d.m30444B(sb4, str2, ", successText=", str3, ", successSubtext=");
        AbstractC11266d.m30444B(sb4, str4, ", successBackgroundUrl=", str5, ", submitErrorTitle=");
        AbstractC11266d.m30444B(sb4, str6, ", submitErrorBody=", str7, ", errorCta=");
        AbstractC11266d.m30444B(sb4, str8, ", errorDiscard=", str9, ", submittedText=");
        AbstractC11266d.m30444B(sb4, str10, ", submittedCta=", str11, ", cancelCta=");
        AbstractC11266d.m30444B(sb4, str12, ", cancelDialogTitle=", str13, ", cancelDialogBody=");
        AbstractC11266d.m30444B(sb4, str14, ", cancelDialogPositiveCta=", str15, ", cancelDialogNegativeCta=");
        AbstractC11266d.m30444B(sb4, str16, ", startErrorTitle=", str17, ", startErrorBody=");
        AbstractC11266d.m30444B(sb4, str18, ", startErrorPositiveCta=", str19, ", startErrorNegativeCta=");
        AbstractC11266d.m30444B(sb4, str20, ", startErrorMissingStrapBody=", str21, ", startErrorBtHrFailedBody=");
        AbstractC11266d.m30444B(sb4, str22, ", webViewErrorTitle=", str23, ", webViewErrorBody=");
        AbstractC11266d.m30444B(sb4, str24, ", webViewPositiveCta=", str25, ", webViewNegativeCta=");
        return AbstractC13673n.m38563j(sb4, str26, ", navigationAction=", c9598e, ")");
    }

    public CampaignStepConfigResponse(List<String> dataTypes, Integer num, Integer num2, String submittingText, String successIcon, String successText, String successSubtext, String successBackgroundUrl, String submitErrorTitle, String submitErrorBody, String errorCta, String errorDiscard, String submittedText, String submittedCta, String cancelCta, String cancelDialogTitle, String cancelDialogBody, String cancelDialogPositiveCta, String cancelDialogNegativeCta, String startErrorTitle, String startErrorBody, String startErrorPositiveCta, String startErrorNegativeCta, String startErrorMissingStrapBody, String startErrorBtHrFailedBody, String webViewErrorTitle, String webViewErrorBody, String webViewPositiveCta, String webViewNegativeCta, C9598e c9598e) {
        AbstractC22676k.m65750j(dataTypes, "dataTypes");
        AbstractC22676k.m65750j(submittingText, "submittingText");
        AbstractC22676k.m65750j(successIcon, "successIcon");
        AbstractC22676k.m65750j(successText, "successText");
        AbstractC22676k.m65750j(successSubtext, "successSubtext");
        AbstractC22676k.m65750j(successBackgroundUrl, "successBackgroundUrl");
        AbstractC22676k.m65750j(submitErrorTitle, "submitErrorTitle");
        AbstractC22676k.m65750j(submitErrorBody, "submitErrorBody");
        AbstractC22676k.m65750j(errorCta, "errorCta");
        AbstractC22676k.m65750j(errorDiscard, "errorDiscard");
        AbstractC22676k.m65750j(submittedText, "submittedText");
        AbstractC22676k.m65750j(submittedCta, "submittedCta");
        AbstractC22676k.m65750j(cancelCta, "cancelCta");
        AbstractC22676k.m65750j(cancelDialogTitle, "cancelDialogTitle");
        AbstractC22676k.m65750j(cancelDialogBody, "cancelDialogBody");
        AbstractC22676k.m65750j(cancelDialogPositiveCta, "cancelDialogPositiveCta");
        AbstractC22676k.m65750j(cancelDialogNegativeCta, "cancelDialogNegativeCta");
        AbstractC22676k.m65750j(startErrorTitle, "startErrorTitle");
        AbstractC22676k.m65750j(startErrorBody, "startErrorBody");
        AbstractC22676k.m65750j(startErrorPositiveCta, "startErrorPositiveCta");
        AbstractC22676k.m65750j(startErrorNegativeCta, "startErrorNegativeCta");
        AbstractC22676k.m65750j(startErrorMissingStrapBody, "startErrorMissingStrapBody");
        AbstractC22676k.m65750j(startErrorBtHrFailedBody, "startErrorBtHrFailedBody");
        AbstractC22676k.m65750j(webViewErrorTitle, "webViewErrorTitle");
        AbstractC22676k.m65750j(webViewErrorBody, "webViewErrorBody");
        AbstractC22676k.m65750j(webViewPositiveCta, "webViewPositiveCta");
        AbstractC22676k.m65750j(webViewNegativeCta, "webViewNegativeCta");
        this.dataTypes = dataTypes;
        this.additionalDataCollection = num;
        this.bthrAdditionalDataCollection = num2;
        this.submittingText = submittingText;
        this.successIcon = successIcon;
        this.successText = successText;
        this.successSubtext = successSubtext;
        this.successBackgroundUrl = successBackgroundUrl;
        this.submitErrorTitle = submitErrorTitle;
        this.submitErrorBody = submitErrorBody;
        this.errorCta = errorCta;
        this.errorDiscard = errorDiscard;
        this.submittedText = submittedText;
        this.submittedCta = submittedCta;
        this.cancelCta = cancelCta;
        this.cancelDialogTitle = cancelDialogTitle;
        this.cancelDialogBody = cancelDialogBody;
        this.cancelDialogPositiveCta = cancelDialogPositiveCta;
        this.cancelDialogNegativeCta = cancelDialogNegativeCta;
        this.startErrorTitle = startErrorTitle;
        this.startErrorBody = startErrorBody;
        this.startErrorPositiveCta = startErrorPositiveCta;
        this.startErrorNegativeCta = startErrorNegativeCta;
        this.startErrorMissingStrapBody = startErrorMissingStrapBody;
        this.startErrorBtHrFailedBody = startErrorBtHrFailedBody;
        this.webViewErrorTitle = webViewErrorTitle;
        this.webViewErrorBody = webViewErrorBody;
        this.webViewPositiveCta = webViewPositiveCta;
        this.webViewNegativeCta = webViewNegativeCta;
        this.navigationAction = c9598e;
    }

    public /* synthetic */ CampaignStepConfigResponse(List list, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list, num, num2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, c9598e);
    }
}
