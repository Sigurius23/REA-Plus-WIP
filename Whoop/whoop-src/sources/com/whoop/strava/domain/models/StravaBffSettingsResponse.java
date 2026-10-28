package com.whoop.strava.domain.models;

import androidx.annotation.Keep;
import androidx.profileinstaller.ProfileVerifier;
import c13.AbstractC3855a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hb1.C17089l;
import hc3.AbstractC17176i;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\b\u0087\b\u0018\u0000 \u007f2\u00020\u0001:\u0004\u0080\u0001\u0081\u0001B¯\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u001b¢\u0006\u0004\b%\u0010&BÉ\u0002\b\u0010\u0012\u0006\u0010(\u001a\u00020'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u001b\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b%\u0010+J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010-J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010-J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010-J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010-J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u0010-J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010-J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010-J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010-J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010-J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010-J\u0012\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u0010-J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u0010-J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u0010-J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u0010-J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u0010-J\u0012\u0010=\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b?\u0010-J\u0012\u0010@\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b@\u0010-J\u0012\u0010A\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bA\u0010>J\u0012\u0010B\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bD\u0010-J\u0018\u0010E\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bG\u0010-J\u0012\u0010H\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bH\u0010-J\u0012\u0010I\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bI\u0010-J\u0012\u0010J\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bJ\u0010-J\u0012\u0010K\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bK\u0010-J\u0018\u0010L\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bL\u0010FJì\u0002\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u001bHÆ\u0001¢\u0006\u0004\bM\u0010NJ\u0010\u0010O\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bO\u0010-J\u0010\u0010P\u001a\u00020'HÖ\u0001¢\u0006\u0004\bP\u0010QJ\u001a\u0010S\u001a\u00020\u00132\b\u0010R\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bS\u0010TJ'\u0010]\u001a\u00020Z2\u0006\u0010U\u001a\u00020\u00002\u0006\u0010W\u001a\u00020V2\u0006\u0010Y\u001a\u00020XH\u0001¢\u0006\u0004\b[\u0010\\R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010^\u001a\u0004\b_\u0010-R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010^\u001a\u0004\b`\u0010-R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010^\u001a\u0004\ba\u0010-R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010^\u001a\u0004\bb\u0010-R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010^\u001a\u0004\bc\u0010-R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010^\u001a\u0004\bd\u0010-R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010^\u001a\u0004\be\u0010-R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010^\u001a\u0004\bf\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010^\u001a\u0004\bg\u0010-R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010^\u001a\u0004\bh\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010^\u001a\u0004\bi\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010^\u001a\u0004\bj\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010^\u001a\u0004\bk\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010^\u001a\u0004\bl\u0010-R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010^\u001a\u0004\bm\u0010-R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010^\u001a\u0004\bn\u0010-R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010o\u001a\u0004\bp\u0010>R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010^\u001a\u0004\bq\u0010-R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010^\u001a\u0004\br\u0010-R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0017\u0010o\u001a\u0004\bs\u0010>R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010t\u001a\u0004\bu\u0010CR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010^\u001a\u0004\bv\u0010-R\u001f\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010w\u001a\u0004\bx\u0010FR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010^\u001a\u0004\by\u0010-R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010^\u001a\u0004\bz\u0010-R\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010^\u001a\u0004\b{\u0010-R\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010^\u001a\u0004\b|\u0010-R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010^\u001a\u0004\b}\u0010-R\u001f\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b$\u0010w\u001a\u0004\b~\u0010F¨\u0006\u0082\u0001"}, m65681d2 = {"Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;", "", "", "state", "backgroundImageUrl", "iconUrl", "titleDisplay", "descriptionDisplay", "buttonDisplay", "learnMoreDisplay", "learnMoreUrl", "learnMoreIcon", "privacyPolicyDisplay", "privacyPolicyUrl", "webAuthorizationUrl", "appAuthorizationUrl", "statusIcon", "statusDisplay", "automaticallyImportDisplay", "", "automaticallyImportEnabled", "automaticallyImportDescriptionDisplay", "automaticPostDisplay", "automaticallyPostEnabled", "Lcom/whoop/strava/domain/models/ActivitiesItemResponse;", "selectedActivitiesItem", "automaticallyPostDescriptionDisplay", "", "Lcom/whoop/strava/domain/models/ShareableGraphicResponse;", "shareableGraphics", "shareableGraphicDescriptionDisplay", "disconnectBubbleTitleDisplay", "disconnectBubbleDescriptionDisplay", "disconnectBubbleConfirmButtonDisplay", "disconnectBubbleCancelButtonDisplay", "Lcom/whoop/strava/domain/models/SelectableActivityResponse;", "selectableActivitiesList", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/strava/domain/models/ActivitiesItemResponse;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/strava/domain/models/ActivitiesItemResponse;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "()Ljava/lang/Boolean;", "component18", "component19", "component20", "component21", "()Lcom/whoop/strava/domain/models/ActivitiesItemResponse;", "component22", "component23", "()Ljava/util/List;", "component24", "component25", "component26", "component27", "component28", "component29", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/strava/domain/models/ActivitiesItemResponse;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$strava_release", "(Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getState", "getBackgroundImageUrl", "getIconUrl", "getTitleDisplay", "getDescriptionDisplay", "getButtonDisplay", "getLearnMoreDisplay", "getLearnMoreUrl", "getLearnMoreIcon", "getPrivacyPolicyDisplay", "getPrivacyPolicyUrl", "getWebAuthorizationUrl", "getAppAuthorizationUrl", "getStatusIcon", "getStatusDisplay", "getAutomaticallyImportDisplay", "Ljava/lang/Boolean;", "getAutomaticallyImportEnabled", "getAutomaticallyImportDescriptionDisplay", "getAutomaticPostDisplay", "getAutomaticallyPostEnabled", "Lcom/whoop/strava/domain/models/ActivitiesItemResponse;", "getSelectedActivitiesItem", "getAutomaticallyPostDescriptionDisplay", "Ljava/util/List;", "getShareableGraphics", "getShareableGraphicDescriptionDisplay", "getDisconnectBubbleTitleDisplay", "getDisconnectBubbleDescriptionDisplay", "getDisconnectBubbleConfirmButtonDisplay", "getDisconnectBubbleCancelButtonDisplay", "getSelectableActivitiesList", "Companion", "$serializer", "a", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StravaBffSettingsResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final String appAuthorizationUrl;
    private final String automaticPostDisplay;
    private final String automaticallyImportDescriptionDisplay;
    private final String automaticallyImportDisplay;
    private final Boolean automaticallyImportEnabled;
    private final String automaticallyPostDescriptionDisplay;
    private final Boolean automaticallyPostEnabled;
    private final String backgroundImageUrl;
    private final String buttonDisplay;
    private final String descriptionDisplay;
    private final String disconnectBubbleCancelButtonDisplay;
    private final String disconnectBubbleConfirmButtonDisplay;
    private final String disconnectBubbleDescriptionDisplay;
    private final String disconnectBubbleTitleDisplay;
    private final String iconUrl;
    private final String learnMoreDisplay;
    private final String learnMoreIcon;
    private final String learnMoreUrl;
    private final String privacyPolicyDisplay;
    private final String privacyPolicyUrl;
    private final List<SelectableActivityResponse> selectableActivitiesList;
    private final ActivitiesItemResponse selectedActivitiesItem;
    private final String shareableGraphicDescriptionDisplay;
    private final List<ShareableGraphicResponse> shareableGraphics;
    private final String state;
    private final String statusDisplay;
    private final String statusIcon;
    private final String titleDisplay;
    private final String webAuthorizationUrl;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.strava.domain.models.StravaBffSettingsResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/strava/domain/models/StravaBffSettingsResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;", "serializer", "()Lwc3/c;", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StravaBffSettingsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C17089l(7)), null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C17089l(8))};
    }

    public /* synthetic */ StravaBffSettingsResponse(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool, String str17, String str18, Boolean bool2, ActivitiesItemResponse activitiesItemResponse, String str19, List list, String str20, String str21, String str22, String str23, String str24, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (536641535 != (i13 & 536641535)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 536641535, StravaBffSettingsResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.state = str;
        this.backgroundImageUrl = str2;
        this.iconUrl = str3;
        this.titleDisplay = str4;
        this.descriptionDisplay = str5;
        this.buttonDisplay = str6;
        this.learnMoreDisplay = str7;
        this.learnMoreUrl = str8;
        this.learnMoreIcon = str9;
        this.privacyPolicyDisplay = str10;
        this.privacyPolicyUrl = str11;
        this.webAuthorizationUrl = str12;
        this.appAuthorizationUrl = str13;
        this.statusIcon = str14;
        this.statusDisplay = str15;
        if ((32768 & i13) == 0) {
            this.automaticallyImportDisplay = null;
        } else {
            this.automaticallyImportDisplay = str16;
        }
        if ((65536 & i13) == 0) {
            this.automaticallyImportEnabled = null;
        } else {
            this.automaticallyImportEnabled = bool;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) == 0) {
            this.automaticallyImportDescriptionDisplay = null;
        } else {
            this.automaticallyImportDescriptionDisplay = str17;
        }
        this.automaticPostDisplay = str18;
        this.automaticallyPostEnabled = bool2;
        this.selectedActivitiesItem = activitiesItemResponse;
        this.automaticallyPostDescriptionDisplay = str19;
        this.shareableGraphics = list;
        this.shareableGraphicDescriptionDisplay = str20;
        this.disconnectBubbleTitleDisplay = str21;
        this.disconnectBubbleDescriptionDisplay = str22;
        this.disconnectBubbleConfirmButtonDisplay = str23;
        this.disconnectBubbleCancelButtonDisplay = str24;
        this.selectableActivitiesList = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ShareableGraphicResponse$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(SelectableActivityResponse$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StravaBffSettingsResponse copy$default(StravaBffSettingsResponse stravaBffSettingsResponse, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool, String str17, String str18, Boolean bool2, ActivitiesItemResponse activitiesItemResponse, String str19, List list, String str20, String str21, String str22, String str23, String str24, List list2, int i13, Object obj) {
        List list3;
        String str25;
        String str26 = (i13 & 1) != 0 ? stravaBffSettingsResponse.state : str;
        String str27 = (i13 & 2) != 0 ? stravaBffSettingsResponse.backgroundImageUrl : str2;
        String str28 = (i13 & 4) != 0 ? stravaBffSettingsResponse.iconUrl : str3;
        String str29 = (i13 & 8) != 0 ? stravaBffSettingsResponse.titleDisplay : str4;
        String str30 = (i13 & 16) != 0 ? stravaBffSettingsResponse.descriptionDisplay : str5;
        String str31 = (i13 & 32) != 0 ? stravaBffSettingsResponse.buttonDisplay : str6;
        String str32 = (i13 & 64) != 0 ? stravaBffSettingsResponse.learnMoreDisplay : str7;
        String str33 = (i13 & 128) != 0 ? stravaBffSettingsResponse.learnMoreUrl : str8;
        String str34 = (i13 & 256) != 0 ? stravaBffSettingsResponse.learnMoreIcon : str9;
        String str35 = (i13 & 512) != 0 ? stravaBffSettingsResponse.privacyPolicyDisplay : str10;
        String str36 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? stravaBffSettingsResponse.privacyPolicyUrl : str11;
        String str37 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? stravaBffSettingsResponse.webAuthorizationUrl : str12;
        String str38 = (i13 & 4096) != 0 ? stravaBffSettingsResponse.appAuthorizationUrl : str13;
        String str39 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? stravaBffSettingsResponse.statusIcon : str14;
        String str40 = str26;
        String str41 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? stravaBffSettingsResponse.statusDisplay : str15;
        String str42 = (i13 & 32768) != 0 ? stravaBffSettingsResponse.automaticallyImportDisplay : str16;
        Boolean bool3 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? stravaBffSettingsResponse.automaticallyImportEnabled : bool;
        String str43 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? stravaBffSettingsResponse.automaticallyImportDescriptionDisplay : str17;
        String str44 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? stravaBffSettingsResponse.automaticPostDisplay : str18;
        Boolean bool4 = (i13 & 524288) != 0 ? stravaBffSettingsResponse.automaticallyPostEnabled : bool2;
        ActivitiesItemResponse activitiesItemResponse2 = (i13 & 1048576) != 0 ? stravaBffSettingsResponse.selectedActivitiesItem : activitiesItemResponse;
        String str45 = (i13 & 2097152) != 0 ? stravaBffSettingsResponse.automaticallyPostDescriptionDisplay : str19;
        List list4 = (i13 & 4194304) != 0 ? stravaBffSettingsResponse.shareableGraphics : list;
        String str46 = (i13 & 8388608) != 0 ? stravaBffSettingsResponse.shareableGraphicDescriptionDisplay : str20;
        String str47 = (i13 & 16777216) != 0 ? stravaBffSettingsResponse.disconnectBubbleTitleDisplay : str21;
        String str48 = (i13 & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? stravaBffSettingsResponse.disconnectBubbleDescriptionDisplay : str22;
        String str49 = (i13 & 67108864) != 0 ? stravaBffSettingsResponse.disconnectBubbleConfirmButtonDisplay : str23;
        String str50 = (i13 & 134217728) != 0 ? stravaBffSettingsResponse.disconnectBubbleCancelButtonDisplay : str24;
        if ((i13 & 268435456) != 0) {
            str25 = str50;
            list3 = stravaBffSettingsResponse.selectableActivitiesList;
        } else {
            list3 = list2;
            str25 = str50;
        }
        return stravaBffSettingsResponse.copy(str40, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str41, str42, bool3, str43, str44, bool4, activitiesItemResponse2, str45, list4, str46, str47, str48, str49, str25, list3);
    }

    public static final /* synthetic */ void write$Self$strava_release(StravaBffSettingsResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.state);
        output.encodeStringElement(serialDesc, 1, self.backgroundImageUrl);
        output.encodeStringElement(serialDesc, 2, self.iconUrl);
        output.encodeStringElement(serialDesc, 3, self.titleDisplay);
        output.encodeStringElement(serialDesc, 4, self.descriptionDisplay);
        output.encodeStringElement(serialDesc, 5, self.buttonDisplay);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.learnMoreDisplay);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.learnMoreUrl);
        output.encodeNullableSerializableElement(serialDesc, 8, stringSerializer, self.learnMoreIcon);
        output.encodeNullableSerializableElement(serialDesc, 9, stringSerializer, self.privacyPolicyDisplay);
        output.encodeNullableSerializableElement(serialDesc, 10, stringSerializer, self.privacyPolicyUrl);
        output.encodeNullableSerializableElement(serialDesc, 11, stringSerializer, self.webAuthorizationUrl);
        output.encodeNullableSerializableElement(serialDesc, 12, stringSerializer, self.appAuthorizationUrl);
        output.encodeNullableSerializableElement(serialDesc, 13, stringSerializer, self.statusIcon);
        output.encodeNullableSerializableElement(serialDesc, 14, stringSerializer, self.statusDisplay);
        if (output.shouldEncodeElementDefault(serialDesc, 15) || self.automaticallyImportDisplay != null) {
            output.encodeNullableSerializableElement(serialDesc, 15, stringSerializer, self.automaticallyImportDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 16) || self.automaticallyImportEnabled != null) {
            output.encodeNullableSerializableElement(serialDesc, 16, BooleanSerializer.INSTANCE, self.automaticallyImportEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 17) || self.automaticallyImportDescriptionDisplay != null) {
            output.encodeNullableSerializableElement(serialDesc, 17, stringSerializer, self.automaticallyImportDescriptionDisplay);
        }
        output.encodeNullableSerializableElement(serialDesc, 18, stringSerializer, self.automaticPostDisplay);
        output.encodeNullableSerializableElement(serialDesc, 19, BooleanSerializer.INSTANCE, self.automaticallyPostEnabled);
        output.encodeNullableSerializableElement(serialDesc, 20, ActivitiesItemResponse$$serializer.INSTANCE, self.selectedActivitiesItem);
        output.encodeNullableSerializableElement(serialDesc, 21, stringSerializer, self.automaticallyPostDescriptionDisplay);
        output.encodeNullableSerializableElement(serialDesc, 22, (InterfaceC37145j) interfaceC23462hArr[22].getValue(), self.shareableGraphics);
        output.encodeNullableSerializableElement(serialDesc, 23, stringSerializer, self.shareableGraphicDescriptionDisplay);
        output.encodeNullableSerializableElement(serialDesc, 24, stringSerializer, self.disconnectBubbleTitleDisplay);
        output.encodeNullableSerializableElement(serialDesc, 25, stringSerializer, self.disconnectBubbleDescriptionDisplay);
        output.encodeNullableSerializableElement(serialDesc, 26, stringSerializer, self.disconnectBubbleConfirmButtonDisplay);
        output.encodeNullableSerializableElement(serialDesc, 27, stringSerializer, self.disconnectBubbleCancelButtonDisplay);
        output.encodeNullableSerializableElement(serialDesc, 28, (InterfaceC37145j) interfaceC23462hArr[28].getValue(), self.selectableActivitiesList);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPrivacyPolicyDisplay() {
        return this.privacyPolicyDisplay;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPrivacyPolicyUrl() {
        return this.privacyPolicyUrl;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getWebAuthorizationUrl() {
        return this.webAuthorizationUrl;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getAppAuthorizationUrl() {
        return this.appAuthorizationUrl;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getStatusIcon() {
        return this.statusIcon;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getStatusDisplay() {
        return this.statusDisplay;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getAutomaticallyImportDisplay() {
        return this.automaticallyImportDisplay;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Boolean getAutomaticallyImportEnabled() {
        return this.automaticallyImportEnabled;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getAutomaticallyImportDescriptionDisplay() {
        return this.automaticallyImportDescriptionDisplay;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getAutomaticPostDisplay() {
        return this.automaticPostDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Boolean getAutomaticallyPostEnabled() {
        return this.automaticallyPostEnabled;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final ActivitiesItemResponse getSelectedActivitiesItem() {
        return this.selectedActivitiesItem;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getAutomaticallyPostDescriptionDisplay() {
        return this.automaticallyPostDescriptionDisplay;
    }

    public final List<ShareableGraphicResponse> component23() {
        return this.shareableGraphics;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getShareableGraphicDescriptionDisplay() {
        return this.shareableGraphicDescriptionDisplay;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getDisconnectBubbleTitleDisplay() {
        return this.disconnectBubbleTitleDisplay;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getDisconnectBubbleDescriptionDisplay() {
        return this.disconnectBubbleDescriptionDisplay;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getDisconnectBubbleConfirmButtonDisplay() {
        return this.disconnectBubbleConfirmButtonDisplay;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getDisconnectBubbleCancelButtonDisplay() {
        return this.disconnectBubbleCancelButtonDisplay;
    }

    public final List<SelectableActivityResponse> component29() {
        return this.selectableActivitiesList;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getButtonDisplay() {
        return this.buttonDisplay;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLearnMoreDisplay() {
        return this.learnMoreDisplay;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLearnMoreUrl() {
        return this.learnMoreUrl;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLearnMoreIcon() {
        return this.learnMoreIcon;
    }

    public final StravaBffSettingsResponse copy(String state, String backgroundImageUrl, String iconUrl, String titleDisplay, String descriptionDisplay, String buttonDisplay, String learnMoreDisplay, String learnMoreUrl, String learnMoreIcon, String privacyPolicyDisplay, String privacyPolicyUrl, String webAuthorizationUrl, String appAuthorizationUrl, String statusIcon, String statusDisplay, String automaticallyImportDisplay, Boolean automaticallyImportEnabled, String automaticallyImportDescriptionDisplay, String automaticPostDisplay, Boolean automaticallyPostEnabled, ActivitiesItemResponse selectedActivitiesItem, String automaticallyPostDescriptionDisplay, List<ShareableGraphicResponse> shareableGraphics, String shareableGraphicDescriptionDisplay, String disconnectBubbleTitleDisplay, String disconnectBubbleDescriptionDisplay, String disconnectBubbleConfirmButtonDisplay, String disconnectBubbleCancelButtonDisplay, List<SelectableActivityResponse> selectableActivitiesList) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(backgroundImageUrl, "backgroundImageUrl");
        AbstractC22676k.m65750j(iconUrl, "iconUrl");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(buttonDisplay, "buttonDisplay");
        return new StravaBffSettingsResponse(state, backgroundImageUrl, iconUrl, titleDisplay, descriptionDisplay, buttonDisplay, learnMoreDisplay, learnMoreUrl, learnMoreIcon, privacyPolicyDisplay, privacyPolicyUrl, webAuthorizationUrl, appAuthorizationUrl, statusIcon, statusDisplay, automaticallyImportDisplay, automaticallyImportEnabled, automaticallyImportDescriptionDisplay, automaticPostDisplay, automaticallyPostEnabled, selectedActivitiesItem, automaticallyPostDescriptionDisplay, shareableGraphics, shareableGraphicDescriptionDisplay, disconnectBubbleTitleDisplay, disconnectBubbleDescriptionDisplay, disconnectBubbleConfirmButtonDisplay, disconnectBubbleCancelButtonDisplay, selectableActivitiesList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StravaBffSettingsResponse)) {
            return false;
        }
        StravaBffSettingsResponse stravaBffSettingsResponse = (StravaBffSettingsResponse) other;
        return AbstractC22676k.m65745e(this.state, stravaBffSettingsResponse.state) && AbstractC22676k.m65745e(this.backgroundImageUrl, stravaBffSettingsResponse.backgroundImageUrl) && AbstractC22676k.m65745e(this.iconUrl, stravaBffSettingsResponse.iconUrl) && AbstractC22676k.m65745e(this.titleDisplay, stravaBffSettingsResponse.titleDisplay) && AbstractC22676k.m65745e(this.descriptionDisplay, stravaBffSettingsResponse.descriptionDisplay) && AbstractC22676k.m65745e(this.buttonDisplay, stravaBffSettingsResponse.buttonDisplay) && AbstractC22676k.m65745e(this.learnMoreDisplay, stravaBffSettingsResponse.learnMoreDisplay) && AbstractC22676k.m65745e(this.learnMoreUrl, stravaBffSettingsResponse.learnMoreUrl) && AbstractC22676k.m65745e(this.learnMoreIcon, stravaBffSettingsResponse.learnMoreIcon) && AbstractC22676k.m65745e(this.privacyPolicyDisplay, stravaBffSettingsResponse.privacyPolicyDisplay) && AbstractC22676k.m65745e(this.privacyPolicyUrl, stravaBffSettingsResponse.privacyPolicyUrl) && AbstractC22676k.m65745e(this.webAuthorizationUrl, stravaBffSettingsResponse.webAuthorizationUrl) && AbstractC22676k.m65745e(this.appAuthorizationUrl, stravaBffSettingsResponse.appAuthorizationUrl) && AbstractC22676k.m65745e(this.statusIcon, stravaBffSettingsResponse.statusIcon) && AbstractC22676k.m65745e(this.statusDisplay, stravaBffSettingsResponse.statusDisplay) && AbstractC22676k.m65745e(this.automaticallyImportDisplay, stravaBffSettingsResponse.automaticallyImportDisplay) && AbstractC22676k.m65745e(this.automaticallyImportEnabled, stravaBffSettingsResponse.automaticallyImportEnabled) && AbstractC22676k.m65745e(this.automaticallyImportDescriptionDisplay, stravaBffSettingsResponse.automaticallyImportDescriptionDisplay) && AbstractC22676k.m65745e(this.automaticPostDisplay, stravaBffSettingsResponse.automaticPostDisplay) && AbstractC22676k.m65745e(this.automaticallyPostEnabled, stravaBffSettingsResponse.automaticallyPostEnabled) && AbstractC22676k.m65745e(this.selectedActivitiesItem, stravaBffSettingsResponse.selectedActivitiesItem) && AbstractC22676k.m65745e(this.automaticallyPostDescriptionDisplay, stravaBffSettingsResponse.automaticallyPostDescriptionDisplay) && AbstractC22676k.m65745e(this.shareableGraphics, stravaBffSettingsResponse.shareableGraphics) && AbstractC22676k.m65745e(this.shareableGraphicDescriptionDisplay, stravaBffSettingsResponse.shareableGraphicDescriptionDisplay) && AbstractC22676k.m65745e(this.disconnectBubbleTitleDisplay, stravaBffSettingsResponse.disconnectBubbleTitleDisplay) && AbstractC22676k.m65745e(this.disconnectBubbleDescriptionDisplay, stravaBffSettingsResponse.disconnectBubbleDescriptionDisplay) && AbstractC22676k.m65745e(this.disconnectBubbleConfirmButtonDisplay, stravaBffSettingsResponse.disconnectBubbleConfirmButtonDisplay) && AbstractC22676k.m65745e(this.disconnectBubbleCancelButtonDisplay, stravaBffSettingsResponse.disconnectBubbleCancelButtonDisplay) && AbstractC22676k.m65745e(this.selectableActivitiesList, stravaBffSettingsResponse.selectableActivitiesList);
    }

    public final String getAppAuthorizationUrl() {
        return this.appAuthorizationUrl;
    }

    public final String getAutomaticPostDisplay() {
        return this.automaticPostDisplay;
    }

    public final String getAutomaticallyImportDescriptionDisplay() {
        return this.automaticallyImportDescriptionDisplay;
    }

    public final String getAutomaticallyImportDisplay() {
        return this.automaticallyImportDisplay;
    }

    public final Boolean getAutomaticallyImportEnabled() {
        return this.automaticallyImportEnabled;
    }

    public final String getAutomaticallyPostDescriptionDisplay() {
        return this.automaticallyPostDescriptionDisplay;
    }

    public final Boolean getAutomaticallyPostEnabled() {
        return this.automaticallyPostEnabled;
    }

    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public final String getButtonDisplay() {
        return this.buttonDisplay;
    }

    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    public final String getDisconnectBubbleCancelButtonDisplay() {
        return this.disconnectBubbleCancelButtonDisplay;
    }

    public final String getDisconnectBubbleConfirmButtonDisplay() {
        return this.disconnectBubbleConfirmButtonDisplay;
    }

    public final String getDisconnectBubbleDescriptionDisplay() {
        return this.disconnectBubbleDescriptionDisplay;
    }

    public final String getDisconnectBubbleTitleDisplay() {
        return this.disconnectBubbleTitleDisplay;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getLearnMoreDisplay() {
        return this.learnMoreDisplay;
    }

    public final String getLearnMoreIcon() {
        return this.learnMoreIcon;
    }

    public final String getLearnMoreUrl() {
        return this.learnMoreUrl;
    }

    public final String getPrivacyPolicyDisplay() {
        return this.privacyPolicyDisplay;
    }

    public final String getPrivacyPolicyUrl() {
        return this.privacyPolicyUrl;
    }

    public final List<SelectableActivityResponse> getSelectableActivitiesList() {
        return this.selectableActivitiesList;
    }

    public final ActivitiesItemResponse getSelectedActivitiesItem() {
        return this.selectedActivitiesItem;
    }

    public final String getShareableGraphicDescriptionDisplay() {
        return this.shareableGraphicDescriptionDisplay;
    }

    public final List<ShareableGraphicResponse> getShareableGraphics() {
        return this.shareableGraphics;
    }

    public final String getState() {
        return this.state;
    }

    public final String getStatusDisplay() {
        return this.statusDisplay;
    }

    public final String getStatusIcon() {
        return this.statusIcon;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public final String getWebAuthorizationUrl() {
        return this.webAuthorizationUrl;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.state.hashCode() * 31, 31, this.backgroundImageUrl), 31, this.iconUrl), 31, this.titleDisplay), 31, this.descriptionDisplay), 31, this.buttonDisplay);
        String str = this.learnMoreDisplay;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.learnMoreUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.learnMoreIcon;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.privacyPolicyDisplay;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.privacyPolicyUrl;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.webAuthorizationUrl;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.appAuthorizationUrl;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.statusIcon;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.statusDisplay;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.automaticallyImportDisplay;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool = this.automaticallyImportEnabled;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str11 = this.automaticallyImportDescriptionDisplay;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.automaticPostDisplay;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Boolean bool2 = this.automaticallyPostEnabled;
        int iHashCode14 = (iHashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        ActivitiesItemResponse activitiesItemResponse = this.selectedActivitiesItem;
        int iHashCode15 = (iHashCode14 + (activitiesItemResponse == null ? 0 : activitiesItemResponse.hashCode())) * 31;
        String str13 = this.automaticallyPostDescriptionDisplay;
        int iHashCode16 = (iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        List<ShareableGraphicResponse> list = this.shareableGraphics;
        int iHashCode17 = (iHashCode16 + (list == null ? 0 : list.hashCode())) * 31;
        String str14 = this.shareableGraphicDescriptionDisplay;
        int iHashCode18 = (iHashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.disconnectBubbleTitleDisplay;
        int iHashCode19 = (iHashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.disconnectBubbleDescriptionDisplay;
        int iHashCode20 = (iHashCode19 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.disconnectBubbleConfirmButtonDisplay;
        int iHashCode21 = (iHashCode20 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.disconnectBubbleCancelButtonDisplay;
        int iHashCode22 = (iHashCode21 + (str18 == null ? 0 : str18.hashCode())) * 31;
        List<SelectableActivityResponse> list2 = this.selectableActivitiesList;
        return iHashCode22 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        String str = this.state;
        String str2 = this.backgroundImageUrl;
        String str3 = this.iconUrl;
        String str4 = this.titleDisplay;
        String str5 = this.descriptionDisplay;
        String str6 = this.buttonDisplay;
        String str7 = this.learnMoreDisplay;
        String str8 = this.learnMoreUrl;
        String str9 = this.learnMoreIcon;
        String str10 = this.privacyPolicyDisplay;
        String str11 = this.privacyPolicyUrl;
        String str12 = this.webAuthorizationUrl;
        String str13 = this.appAuthorizationUrl;
        String str14 = this.statusIcon;
        String str15 = this.statusDisplay;
        String str16 = this.automaticallyImportDisplay;
        Boolean bool = this.automaticallyImportEnabled;
        String str17 = this.automaticallyImportDescriptionDisplay;
        String str18 = this.automaticPostDisplay;
        Boolean bool2 = this.automaticallyPostEnabled;
        ActivitiesItemResponse activitiesItemResponse = this.selectedActivitiesItem;
        String str19 = this.automaticallyPostDescriptionDisplay;
        List<ShareableGraphicResponse> list = this.shareableGraphics;
        String str20 = this.shareableGraphicDescriptionDisplay;
        String str21 = this.disconnectBubbleTitleDisplay;
        String str22 = this.disconnectBubbleDescriptionDisplay;
        String str23 = this.disconnectBubbleConfirmButtonDisplay;
        String str24 = this.disconnectBubbleCancelButtonDisplay;
        List<SelectableActivityResponse> list2 = this.selectableActivitiesList;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("StravaBffSettingsResponse(state=", str, ", backgroundImageUrl=", str2, ", iconUrl=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", titleDisplay=", str4, ", descriptionDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", buttonDisplay=", str6, ", learnMoreDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str7, ", learnMoreUrl=", str8, ", learnMoreIcon=");
        AbstractC11266d.m30444B(sbM32001t, str9, ", privacyPolicyDisplay=", str10, ", privacyPolicyUrl=");
        AbstractC11266d.m30444B(sbM32001t, str11, ", webAuthorizationUrl=", str12, ", appAuthorizationUrl=");
        AbstractC11266d.m30444B(sbM32001t, str13, ", statusIcon=", str14, ", statusDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str15, ", automaticallyImportDisplay=", str16, ", automaticallyImportEnabled=");
        AbstractC13673n.m38576w(bool, ", automaticallyImportDescriptionDisplay=", str17, ", automaticPostDisplay=", sbM32001t);
        AbstractC36095b.m114692t(bool2, str18, ", automaticallyPostEnabled=", ", selectedActivitiesItem=", sbM32001t);
        sbM32001t.append(activitiesItemResponse);
        sbM32001t.append(", automaticallyPostDescriptionDisplay=");
        sbM32001t.append(str19);
        sbM32001t.append(", shareableGraphics=");
        AbstractC17176i.m48511m(", shareableGraphicDescriptionDisplay=", str20, ", disconnectBubbleTitleDisplay=", sbM32001t, list);
        AbstractC11266d.m30444B(sbM32001t, str21, ", disconnectBubbleDescriptionDisplay=", str22, ", disconnectBubbleConfirmButtonDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str23, ", disconnectBubbleCancelButtonDisplay=", str24, ", selectableActivitiesList=");
        return AbstractC3855a.m11829m(sbM32001t, list2, ")");
    }

    public StravaBffSettingsResponse(String state, String backgroundImageUrl, String iconUrl, String titleDisplay, String descriptionDisplay, String buttonDisplay, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, String str12, Boolean bool2, ActivitiesItemResponse activitiesItemResponse, String str13, List<ShareableGraphicResponse> list, String str14, String str15, String str16, String str17, String str18, List<SelectableActivityResponse> list2) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(backgroundImageUrl, "backgroundImageUrl");
        AbstractC22676k.m65750j(iconUrl, "iconUrl");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(buttonDisplay, "buttonDisplay");
        this.state = state;
        this.backgroundImageUrl = backgroundImageUrl;
        this.iconUrl = iconUrl;
        this.titleDisplay = titleDisplay;
        this.descriptionDisplay = descriptionDisplay;
        this.buttonDisplay = buttonDisplay;
        this.learnMoreDisplay = str;
        this.learnMoreUrl = str2;
        this.learnMoreIcon = str3;
        this.privacyPolicyDisplay = str4;
        this.privacyPolicyUrl = str5;
        this.webAuthorizationUrl = str6;
        this.appAuthorizationUrl = str7;
        this.statusIcon = str8;
        this.statusDisplay = str9;
        this.automaticallyImportDisplay = str10;
        this.automaticallyImportEnabled = bool;
        this.automaticallyImportDescriptionDisplay = str11;
        this.automaticPostDisplay = str12;
        this.automaticallyPostEnabled = bool2;
        this.selectedActivitiesItem = activitiesItemResponse;
        this.automaticallyPostDescriptionDisplay = str13;
        this.shareableGraphics = list;
        this.shareableGraphicDescriptionDisplay = str14;
        this.disconnectBubbleTitleDisplay = str15;
        this.disconnectBubbleDescriptionDisplay = str16;
        this.disconnectBubbleConfirmButtonDisplay = str17;
        this.disconnectBubbleCancelButtonDisplay = str18;
        this.selectableActivitiesList = list2;
    }

    public /* synthetic */ StravaBffSettingsResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool, String str17, String str18, Boolean bool2, ActivitiesItemResponse activitiesItemResponse, String str19, List list, String str20, String str21, String str22, String str23, String str24, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, (i13 & 32768) != 0 ? null : str16, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? null : bool, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? null : str17, str18, bool2, activitiesItemResponse, str19, list, str20, str21, str22, str23, str24, list2);
    }
}
