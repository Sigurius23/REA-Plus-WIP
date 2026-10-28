package com.whoop.activation.domain.models.steps;

import androidx.profileinstaller.ProfileVerifier;
import c13.AbstractC3855a;
import com.whoop.activation.domain.models.ActivationFlowStepModel;
import com.whoop.activation.domain.models.FooterAlignment;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.ProgressButtonModel;
import com.whoop.design.models.ProgressButtonModel$$serializer;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import live.hms.video.utils.AndroidSDKConstants;
import m83.C25271y;
import md1.C25452a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import r70.C31049a;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\b\u0087\b\u0018\u0000 \u0081\u00012\u00020\u00012\u00020\u0002:\u0004\u0082\u0001\u0081\u0001Bý\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\u0006\u0010\u001b\u001a\u00020\b\u0012\u0006\u0010\u001c\u001a\u00020\u000e\u0012\u0006\u0010\u001d\u001a\u00020\u000e\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u001f\u001a\u00020\b\u0012\u0006\u0010 \u001a\u00020\b\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#¢\u0006\u0004\b%\u0010&B«\u0002\b\u0010\u0012\u0006\u0010'\u001a\u00020\u000e\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u000e\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u001c\u001a\u00020\u000e\u0012\u0006\u0010\u001d\u001a\u00020\u000e\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\b\u0012\b\u0010 \u001a\u0004\u0018\u00010\b\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b%\u0010*J\u0010\u0010+\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b-\u0010,J\u0010\u0010.\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b.\u0010,J\u0010\u0010/\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b/\u0010,J\u0010\u00100\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b2\u00101J\u0010\u00103\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b3\u00101J\u0010\u00104\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b4\u00101J\u0010\u00105\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b5\u00101J\u0010\u00106\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b8\u00107J\u0010\u00109\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b9\u00107J\u0010\u0010:\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b:\u00107J\u0010\u0010;\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b;\u00107J\u0010\u0010<\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b<\u00107J\u0010\u0010=\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b=\u00107J\u0010\u0010>\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b>\u00107J\u0010\u0010?\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b?\u00107J\u0010\u0010@\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b@\u00107J\u0010\u0010A\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bA\u0010,J\u0010\u0010B\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bB\u00101J\u0010\u0010C\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bC\u00101J\u0010\u0010D\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\bD\u00107J\u0010\u0010E\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\bE\u00107J\u0012\u0010F\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bF\u00101J\u0010\u0010G\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bG\u00101J\u0010\u0010H\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bH\u00101J\u0012\u0010I\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0018\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#HÆ\u0003¢\u0006\u0004\bK\u0010LJ¾\u0002\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u000e2\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u000e2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#HÆ\u0001¢\u0006\u0004\bM\u0010NJ\u0010\u0010O\u001a\u00020\bHÖ\u0001¢\u0006\u0004\bO\u00101J\u0010\u0010P\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\bP\u00107J\u001a\u0010T\u001a\u00020S2\b\u0010R\u001a\u0004\u0018\u00010QHÖ\u0003¢\u0006\u0004\bT\u0010UJ'\u0010^\u001a\u00020[2\u0006\u0010V\u001a\u00020\u00002\u0006\u0010X\u001a\u00020W2\u0006\u0010Z\u001a\u00020YH\u0001¢\u0006\u0004\b\\\u0010]R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010_\u001a\u0004\b`\u0010,R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010_\u001a\u0004\ba\u0010,R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010_\u001a\u0004\bb\u0010,R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010_\u001a\u0004\bc\u0010,R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010d\u001a\u0004\be\u00101R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010d\u001a\u0004\bf\u00101R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010d\u001a\u0004\bg\u00101R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010d\u001a\u0004\bh\u00101R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010d\u001a\u0004\bi\u00101R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010j\u001a\u0004\bk\u00107R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010j\u001a\u0004\bl\u00107R\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010j\u001a\u0004\bm\u00107R\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0012\u0010j\u001a\u0004\bn\u00107R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010j\u001a\u0004\bo\u00107R\u0017\u0010\u0014\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010j\u001a\u0004\bp\u00107R\u0017\u0010\u0015\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0015\u0010j\u001a\u0004\bq\u00107R\u0017\u0010\u0016\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0016\u0010j\u001a\u0004\br\u00107R\u0017\u0010\u0017\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0017\u0010j\u001a\u0004\bs\u00107R\u0017\u0010\u0018\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0018\u0010j\u001a\u0004\bt\u00107R\u0017\u0010\u0019\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010_\u001a\u0004\bu\u0010,R\u0017\u0010\u001a\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010d\u001a\u0004\bv\u00101R\u0017\u0010\u001b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010d\u001a\u0004\bw\u00101R\u0017\u0010\u001c\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001c\u0010j\u001a\u0004\bx\u00107R\u0017\u0010\u001d\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001d\u0010j\u001a\u0004\by\u00107R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010d\u001a\u0004\bz\u00101R\u001a\u0010\u001f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010d\u001a\u0004\b{\u00101R\u001a\u0010 \u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010d\u001a\u0004\b|\u00101R\u001c\u0010\"\u001a\u0004\u0018\u00010!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010}\u001a\u0004\b~\u0010JR#\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8\u0016X\u0096\u0004¢\u0006\r\n\u0004\b$\u0010\u007f\u001a\u0005\b\u0080\u0001\u0010L¨\u0006\u0083\u0001"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;", "Lcom/whoop/activation/domain/models/ActivationFlowStepModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "imperialTitle", "metricTitle", "heightTitle", "weightTitle", "", "feetText", "inchesText", "poundsText", "centimetersText", "kilogramsText", "", "heightFeetMinValue", "heightFeetMaxValue", "weightPoundsMinValue", "weightPoundsMaxValue", "heightCentimetersMinValue", "heightCentimetersMaxValue", "heightCentimetersPreselectedValue", "weightKilogramsMinValue", "weightKilogramsMaxValue", "weightKilogramsPreselectedValue", "title", "subtitle", "imageUrl", "heightFeetPreselectedValue", "weightPoundsPreselectedValue", "navigationBarText", "mobileScreenName", "analyticsName", "Lcom/whoop/design/models/ProgressButtonModel;", "progressCircle", "", "footerButtons", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIIIIILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIIIIILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "component4", "component5", "()Ljava/lang/String;", "component6", "component7", "component8", "component9", "component10", "()I", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "()Lcom/whoop/design/models/ProgressButtonModel;", "component29", "()Ljava/util/List;", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIIIIILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/design/util/TextResource;", "getImperialTitle", "getMetricTitle", "getHeightTitle", "getWeightTitle", "Ljava/lang/String;", "getFeetText", "getInchesText", "getPoundsText", "getCentimetersText", "getKilogramsText", "I", "getHeightFeetMinValue", "getHeightFeetMaxValue", "getWeightPoundsMinValue", "getWeightPoundsMaxValue", "getHeightCentimetersMinValue", "getHeightCentimetersMaxValue", "getHeightCentimetersPreselectedValue", "getWeightKilogramsMinValue", "getWeightKilogramsMaxValue", "getWeightKilogramsPreselectedValue", "getTitle", "getSubtitle", "getImageUrl", "getHeightFeetPreselectedValue", "getWeightPoundsPreselectedValue", "getNavigationBarText", "getMobileScreenName", "getAnalyticsName", "Lcom/whoop/design/models/ProgressButtonModel;", "getProgressCircle", "Ljava/util/List;", "getFooterButtons", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HeightAndWeightStepModel implements ActivationFlowStepModel, DesignSystemModel {
    private final String analyticsName;
    private final String centimetersText;
    private final String feetText;
    private final List<DesignSystemModel> footerButtons;
    private final int heightCentimetersMaxValue;
    private final int heightCentimetersMinValue;
    private final int heightCentimetersPreselectedValue;
    private final int heightFeetMaxValue;
    private final int heightFeetMinValue;
    private final int heightFeetPreselectedValue;
    private final TextResource heightTitle;
    private final String imageUrl;
    private final TextResource imperialTitle;
    private final String inchesText;
    private final String kilogramsText;
    private final TextResource metricTitle;
    private final String mobileScreenName;
    private final String navigationBarText;
    private final String poundsText;
    private final ProgressButtonModel progressCircle;
    private final String subtitle;
    private final TextResource title;
    private final int weightKilogramsMaxValue;
    private final int weightKilogramsMinValue;
    private final int weightKilogramsPreselectedValue;
    private final int weightPoundsMaxValue;
    private final int weightPoundsMinValue;
    private final int weightPoundsPreselectedValue;
    private final TextResource weightTitle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C31049a(15))};

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HeightAndWeightStepModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HeightAndWeightStepModel(int i13, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, String str, String str2, String str3, String str4, String str5, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, int i26, int i27, TextResource textResource5, String str6, String str7, int i28, int i29, String str8, String str9, String str10, ProgressButtonModel progressButtonModel, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (268435455 != (i13 & 268435455)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 268435455, HeightAndWeightStepModel$$serializer.INSTANCE.getDescriptor());
        }
        this.imperialTitle = textResource;
        this.metricTitle = textResource2;
        this.heightTitle = textResource3;
        this.weightTitle = textResource4;
        this.feetText = str;
        this.inchesText = str2;
        this.poundsText = str3;
        this.centimetersText = str4;
        this.kilogramsText = str5;
        this.heightFeetMinValue = i14;
        this.heightFeetMaxValue = i15;
        this.weightPoundsMinValue = i16;
        this.weightPoundsMaxValue = i17;
        this.heightCentimetersMinValue = i18;
        this.heightCentimetersMaxValue = i19;
        this.heightCentimetersPreselectedValue = i24;
        this.weightKilogramsMinValue = i25;
        this.weightKilogramsMaxValue = i26;
        this.weightKilogramsPreselectedValue = i27;
        this.title = textResource5;
        this.subtitle = str6;
        this.imageUrl = str7;
        this.heightFeetPreselectedValue = i28;
        this.weightPoundsPreselectedValue = i29;
        this.navigationBarText = str8;
        this.mobileScreenName = str9;
        this.analyticsName = str10;
        this.progressCircle = progressButtonModel;
        this.footerButtons = (i13 & 268435456) == 0 ? C25271y.f99162w : list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HeightAndWeightStepModel copy$default(HeightAndWeightStepModel heightAndWeightStepModel, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, String str, String str2, String str3, String str4, String str5, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, int i26, TextResource textResource5, String str6, String str7, int i27, int i28, String str8, String str9, String str10, ProgressButtonModel progressButtonModel, List list, int i29, Object obj) {
        List list2;
        ProgressButtonModel progressButtonModel2;
        TextResource textResource6 = (i29 & 1) != 0 ? heightAndWeightStepModel.imperialTitle : textResource;
        TextResource textResource7 = (i29 & 2) != 0 ? heightAndWeightStepModel.metricTitle : textResource2;
        TextResource textResource8 = (i29 & 4) != 0 ? heightAndWeightStepModel.heightTitle : textResource3;
        TextResource textResource9 = (i29 & 8) != 0 ? heightAndWeightStepModel.weightTitle : textResource4;
        String str11 = (i29 & 16) != 0 ? heightAndWeightStepModel.feetText : str;
        String str12 = (i29 & 32) != 0 ? heightAndWeightStepModel.inchesText : str2;
        String str13 = (i29 & 64) != 0 ? heightAndWeightStepModel.poundsText : str3;
        String str14 = (i29 & 128) != 0 ? heightAndWeightStepModel.centimetersText : str4;
        String str15 = (i29 & 256) != 0 ? heightAndWeightStepModel.kilogramsText : str5;
        int i34 = (i29 & 512) != 0 ? heightAndWeightStepModel.heightFeetMinValue : i13;
        int i35 = (i29 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? heightAndWeightStepModel.heightFeetMaxValue : i14;
        int i36 = (i29 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? heightAndWeightStepModel.weightPoundsMinValue : i15;
        int i37 = (i29 & 4096) != 0 ? heightAndWeightStepModel.weightPoundsMaxValue : i16;
        int i38 = (i29 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? heightAndWeightStepModel.heightCentimetersMinValue : i17;
        TextResource textResource10 = textResource6;
        int i39 = (i29 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? heightAndWeightStepModel.heightCentimetersMaxValue : i18;
        int i44 = (i29 & 32768) != 0 ? heightAndWeightStepModel.heightCentimetersPreselectedValue : i19;
        int i45 = (i29 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? heightAndWeightStepModel.weightKilogramsMinValue : i24;
        int i46 = (i29 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? heightAndWeightStepModel.weightKilogramsMaxValue : i25;
        int i47 = (i29 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? heightAndWeightStepModel.weightKilogramsPreselectedValue : i26;
        TextResource textResource11 = (i29 & 524288) != 0 ? heightAndWeightStepModel.title : textResource5;
        String str16 = (i29 & 1048576) != 0 ? heightAndWeightStepModel.subtitle : str6;
        String str17 = (i29 & 2097152) != 0 ? heightAndWeightStepModel.imageUrl : str7;
        int i48 = (i29 & 4194304) != 0 ? heightAndWeightStepModel.heightFeetPreselectedValue : i27;
        int i49 = (i29 & 8388608) != 0 ? heightAndWeightStepModel.weightPoundsPreselectedValue : i28;
        String str18 = (i29 & 16777216) != 0 ? heightAndWeightStepModel.navigationBarText : str8;
        String str19 = (i29 & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? heightAndWeightStepModel.mobileScreenName : str9;
        String str20 = (i29 & 67108864) != 0 ? heightAndWeightStepModel.analyticsName : str10;
        ProgressButtonModel progressButtonModel3 = (i29 & 134217728) != 0 ? heightAndWeightStepModel.progressCircle : progressButtonModel;
        if ((i29 & 268435456) != 0) {
            progressButtonModel2 = progressButtonModel3;
            list2 = heightAndWeightStepModel.footerButtons;
        } else {
            list2 = list;
            progressButtonModel2 = progressButtonModel3;
        }
        return heightAndWeightStepModel.copy(textResource10, textResource7, textResource8, textResource9, str11, str12, str13, str14, str15, i34, i35, i36, i37, i38, i39, i44, i45, i46, i47, textResource11, str16, str17, i48, i49, str18, str19, str20, progressButtonModel2, list2);
    }

    public static final /* synthetic */ void write$Self$activation_release(HeightAndWeightStepModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 0, c25452a, self.imperialTitle);
        output.encodeSerializableElement(serialDesc, 1, c25452a, self.metricTitle);
        output.encodeSerializableElement(serialDesc, 2, c25452a, self.heightTitle);
        output.encodeSerializableElement(serialDesc, 3, c25452a, self.weightTitle);
        output.encodeStringElement(serialDesc, 4, self.feetText);
        output.encodeStringElement(serialDesc, 5, self.inchesText);
        output.encodeStringElement(serialDesc, 6, self.poundsText);
        output.encodeStringElement(serialDesc, 7, self.centimetersText);
        output.encodeStringElement(serialDesc, 8, self.kilogramsText);
        output.encodeIntElement(serialDesc, 9, self.heightFeetMinValue);
        output.encodeIntElement(serialDesc, 10, self.heightFeetMaxValue);
        output.encodeIntElement(serialDesc, 11, self.weightPoundsMinValue);
        output.encodeIntElement(serialDesc, 12, self.weightPoundsMaxValue);
        output.encodeIntElement(serialDesc, 13, self.heightCentimetersMinValue);
        output.encodeIntElement(serialDesc, 14, self.heightCentimetersMaxValue);
        output.encodeIntElement(serialDesc, 15, self.heightCentimetersPreselectedValue);
        output.encodeIntElement(serialDesc, 16, self.weightKilogramsMinValue);
        output.encodeIntElement(serialDesc, 17, self.weightKilogramsMaxValue);
        output.encodeIntElement(serialDesc, 18, self.weightKilogramsPreselectedValue);
        output.encodeSerializableElement(serialDesc, 19, c25452a, self.title);
        output.encodeStringElement(serialDesc, 20, self.subtitle);
        output.encodeStringElement(serialDesc, 21, self.imageUrl);
        output.encodeIntElement(serialDesc, 22, self.heightFeetPreselectedValue);
        output.encodeIntElement(serialDesc, 23, self.weightPoundsPreselectedValue);
        output.encodeNullableSerializableElement(serialDesc, 24, StringSerializer.INSTANCE, self.getNavigationBarText());
        output.encodeStringElement(serialDesc, 25, self.getMobileScreenName());
        output.encodeStringElement(serialDesc, 26, self.getAnalyticsName());
        output.encodeNullableSerializableElement(serialDesc, 27, ProgressButtonModel$$serializer.INSTANCE, self.getProgressCircle());
        if (!output.shouldEncodeElementDefault(serialDesc, 28) && AbstractC22676k.m65745e(self.getFooterButtons(), C25271y.f99162w)) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 28, (InterfaceC37145j) interfaceC23462hArr[28].getValue(), self.getFooterButtons());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getImperialTitle() {
        return this.imperialTitle;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getHeightFeetMinValue() {
        return this.heightFeetMinValue;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getHeightFeetMaxValue() {
        return this.heightFeetMaxValue;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getWeightPoundsMinValue() {
        return this.weightPoundsMinValue;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getWeightPoundsMaxValue() {
        return this.weightPoundsMaxValue;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getHeightCentimetersMinValue() {
        return this.heightCentimetersMinValue;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getHeightCentimetersMaxValue() {
        return this.heightCentimetersMaxValue;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getHeightCentimetersPreselectedValue() {
        return this.heightCentimetersPreselectedValue;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getWeightKilogramsMinValue() {
        return this.weightKilogramsMinValue;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getWeightKilogramsMaxValue() {
        return this.weightKilogramsMaxValue;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getWeightKilogramsPreselectedValue() {
        return this.weightKilogramsPreselectedValue;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getMetricTitle() {
        return this.metricTitle;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final int getHeightFeetPreselectedValue() {
        return this.heightFeetPreselectedValue;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final int getWeightPoundsPreselectedValue() {
        return this.weightPoundsPreselectedValue;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getNavigationBarText() {
        return this.navigationBarText;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getMobileScreenName() {
        return this.mobileScreenName;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final ProgressButtonModel getProgressCircle() {
        return this.progressCircle;
    }

    public final List<DesignSystemModel> component29() {
        return this.footerButtons;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getHeightTitle() {
        return this.heightTitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextResource getWeightTitle() {
        return this.weightTitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFeetText() {
        return this.feetText;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getInchesText() {
        return this.inchesText;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPoundsText() {
        return this.poundsText;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCentimetersText() {
        return this.centimetersText;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getKilogramsText() {
        return this.kilogramsText;
    }

    public final HeightAndWeightStepModel copy(TextResource imperialTitle, TextResource metricTitle, TextResource heightTitle, TextResource weightTitle, String feetText, String inchesText, String poundsText, String centimetersText, String kilogramsText, int heightFeetMinValue, int heightFeetMaxValue, int weightPoundsMinValue, int weightPoundsMaxValue, int heightCentimetersMinValue, int heightCentimetersMaxValue, int heightCentimetersPreselectedValue, int weightKilogramsMinValue, int weightKilogramsMaxValue, int weightKilogramsPreselectedValue, TextResource title, String subtitle, String imageUrl, int heightFeetPreselectedValue, int weightPoundsPreselectedValue, String navigationBarText, String mobileScreenName, String analyticsName, ProgressButtonModel progressCircle, List<? extends DesignSystemModel> footerButtons) {
        AbstractC22676k.m65750j(imperialTitle, "imperialTitle");
        AbstractC22676k.m65750j(metricTitle, "metricTitle");
        AbstractC22676k.m65750j(heightTitle, "heightTitle");
        AbstractC22676k.m65750j(weightTitle, "weightTitle");
        AbstractC22676k.m65750j(feetText, "feetText");
        AbstractC22676k.m65750j(inchesText, "inchesText");
        AbstractC22676k.m65750j(poundsText, "poundsText");
        AbstractC22676k.m65750j(centimetersText, "centimetersText");
        AbstractC22676k.m65750j(kilogramsText, "kilogramsText");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(mobileScreenName, "mobileScreenName");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        return new HeightAndWeightStepModel(imperialTitle, metricTitle, heightTitle, weightTitle, feetText, inchesText, poundsText, centimetersText, kilogramsText, heightFeetMinValue, heightFeetMaxValue, weightPoundsMinValue, weightPoundsMaxValue, heightCentimetersMinValue, heightCentimetersMaxValue, heightCentimetersPreselectedValue, weightKilogramsMinValue, weightKilogramsMaxValue, weightKilogramsPreselectedValue, title, subtitle, imageUrl, heightFeetPreselectedValue, weightPoundsPreselectedValue, navigationBarText, mobileScreenName, analyticsName, progressCircle, footerButtons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeightAndWeightStepModel)) {
            return false;
        }
        HeightAndWeightStepModel heightAndWeightStepModel = (HeightAndWeightStepModel) other;
        return AbstractC22676k.m65745e(this.imperialTitle, heightAndWeightStepModel.imperialTitle) && AbstractC22676k.m65745e(this.metricTitle, heightAndWeightStepModel.metricTitle) && AbstractC22676k.m65745e(this.heightTitle, heightAndWeightStepModel.heightTitle) && AbstractC22676k.m65745e(this.weightTitle, heightAndWeightStepModel.weightTitle) && AbstractC22676k.m65745e(this.feetText, heightAndWeightStepModel.feetText) && AbstractC22676k.m65745e(this.inchesText, heightAndWeightStepModel.inchesText) && AbstractC22676k.m65745e(this.poundsText, heightAndWeightStepModel.poundsText) && AbstractC22676k.m65745e(this.centimetersText, heightAndWeightStepModel.centimetersText) && AbstractC22676k.m65745e(this.kilogramsText, heightAndWeightStepModel.kilogramsText) && this.heightFeetMinValue == heightAndWeightStepModel.heightFeetMinValue && this.heightFeetMaxValue == heightAndWeightStepModel.heightFeetMaxValue && this.weightPoundsMinValue == heightAndWeightStepModel.weightPoundsMinValue && this.weightPoundsMaxValue == heightAndWeightStepModel.weightPoundsMaxValue && this.heightCentimetersMinValue == heightAndWeightStepModel.heightCentimetersMinValue && this.heightCentimetersMaxValue == heightAndWeightStepModel.heightCentimetersMaxValue && this.heightCentimetersPreselectedValue == heightAndWeightStepModel.heightCentimetersPreselectedValue && this.weightKilogramsMinValue == heightAndWeightStepModel.weightKilogramsMinValue && this.weightKilogramsMaxValue == heightAndWeightStepModel.weightKilogramsMaxValue && this.weightKilogramsPreselectedValue == heightAndWeightStepModel.weightKilogramsPreselectedValue && AbstractC22676k.m65745e(this.title, heightAndWeightStepModel.title) && AbstractC22676k.m65745e(this.subtitle, heightAndWeightStepModel.subtitle) && AbstractC22676k.m65745e(this.imageUrl, heightAndWeightStepModel.imageUrl) && this.heightFeetPreselectedValue == heightAndWeightStepModel.heightFeetPreselectedValue && this.weightPoundsPreselectedValue == heightAndWeightStepModel.weightPoundsPreselectedValue && AbstractC22676k.m65745e(this.navigationBarText, heightAndWeightStepModel.navigationBarText) && AbstractC22676k.m65745e(this.mobileScreenName, heightAndWeightStepModel.mobileScreenName) && AbstractC22676k.m65745e(this.analyticsName, heightAndWeightStepModel.analyticsName) && AbstractC22676k.m65745e(this.progressCircle, heightAndWeightStepModel.progressCircle) && AbstractC22676k.m65745e(this.footerButtons, heightAndWeightStepModel.footerButtons);
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public String getAnalyticsName() {
        return this.analyticsName;
    }

    public final String getCentimetersText() {
        return this.centimetersText;
    }

    public final String getFeetText() {
        return this.feetText;
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public /* bridge */ FooterAlignment getFooterAlignment() {
        return super.getFooterAlignment();
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public List<DesignSystemModel> getFooterButtons() {
        return this.footerButtons;
    }

    public final int getHeightCentimetersMaxValue() {
        return this.heightCentimetersMaxValue;
    }

    public final int getHeightCentimetersMinValue() {
        return this.heightCentimetersMinValue;
    }

    public final int getHeightCentimetersPreselectedValue() {
        return this.heightCentimetersPreselectedValue;
    }

    public final int getHeightFeetMaxValue() {
        return this.heightFeetMaxValue;
    }

    public final int getHeightFeetMinValue() {
        return this.heightFeetMinValue;
    }

    public final int getHeightFeetPreselectedValue() {
        return this.heightFeetPreselectedValue;
    }

    public final TextResource getHeightTitle() {
        return this.heightTitle;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final TextResource getImperialTitle() {
        return this.imperialTitle;
    }

    public final String getInchesText() {
        return this.inchesText;
    }

    public final String getKilogramsText() {
        return this.kilogramsText;
    }

    public final TextResource getMetricTitle() {
        return this.metricTitle;
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public String getMobileScreenName() {
        return this.mobileScreenName;
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public String getNavigationBarText() {
        return this.navigationBarText;
    }

    public final String getPoundsText() {
        return this.poundsText;
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public ProgressButtonModel getProgressCircle() {
        return this.progressCircle;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public final int getWeightKilogramsMaxValue() {
        return this.weightKilogramsMaxValue;
    }

    public final int getWeightKilogramsMinValue() {
        return this.weightKilogramsMinValue;
    }

    public final int getWeightKilogramsPreselectedValue() {
        return this.weightKilogramsPreselectedValue;
    }

    public final int getWeightPoundsMaxValue() {
        return this.weightPoundsMaxValue;
    }

    public final int getWeightPoundsMinValue() {
        return this.weightPoundsMinValue;
    }

    public final int getWeightPoundsPreselectedValue() {
        return this.weightPoundsPreselectedValue;
    }

    public final TextResource getWeightTitle() {
        return this.weightTitle;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.weightPoundsPreselectedValue, AbstractC11266d.m30448b(this.heightFeetPreselectedValue, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC31061c.m95625a(AbstractC11266d.m30448b(this.weightKilogramsPreselectedValue, AbstractC11266d.m30448b(this.weightKilogramsMaxValue, AbstractC11266d.m30448b(this.weightKilogramsMinValue, AbstractC11266d.m30448b(this.heightCentimetersPreselectedValue, AbstractC11266d.m30448b(this.heightCentimetersMaxValue, AbstractC11266d.m30448b(this.heightCentimetersMinValue, AbstractC11266d.m30448b(this.weightPoundsMaxValue, AbstractC11266d.m30448b(this.weightPoundsMinValue, AbstractC11266d.m30448b(this.heightFeetMaxValue, AbstractC11266d.m30448b(this.heightFeetMinValue, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.imperialTitle.hashCode() * 31, this.metricTitle, 31), this.heightTitle, 31), this.weightTitle, 31), 31, this.feetText), 31, this.inchesText), 31, this.poundsText), 31, this.centimetersText), 31, this.kilogramsText), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), this.title, 31), 31, this.subtitle), 31, this.imageUrl), 31), 31);
        String str = this.navigationBarText;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM30448b + (str == null ? 0 : str.hashCode())) * 31, 31, this.mobileScreenName), 31, this.analyticsName);
        ProgressButtonModel progressButtonModel = this.progressCircle;
        int iHashCode = (iM30450d + (progressButtonModel == null ? 0 : progressButtonModel.hashCode())) * 31;
        List<DesignSystemModel> list = this.footerButtons;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.imperialTitle;
        TextResource textResource2 = this.metricTitle;
        TextResource textResource3 = this.heightTitle;
        TextResource textResource4 = this.weightTitle;
        String str = this.feetText;
        String str2 = this.inchesText;
        String str3 = this.poundsText;
        String str4 = this.centimetersText;
        String str5 = this.kilogramsText;
        int i13 = this.heightFeetMinValue;
        int i14 = this.heightFeetMaxValue;
        int i15 = this.weightPoundsMinValue;
        int i16 = this.weightPoundsMaxValue;
        int i17 = this.heightCentimetersMinValue;
        int i18 = this.heightCentimetersMaxValue;
        int i19 = this.heightCentimetersPreselectedValue;
        int i24 = this.weightKilogramsMinValue;
        int i25 = this.weightKilogramsMaxValue;
        int i26 = this.weightKilogramsPreselectedValue;
        TextResource textResource5 = this.title;
        String str6 = this.subtitle;
        String str7 = this.imageUrl;
        int i27 = this.heightFeetPreselectedValue;
        int i28 = this.weightPoundsPreselectedValue;
        String str8 = this.navigationBarText;
        String str9 = this.mobileScreenName;
        String str10 = this.analyticsName;
        ProgressButtonModel progressButtonModel = this.progressCircle;
        List<DesignSystemModel> list = this.footerButtons;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("HeightAndWeightStepModel(imperialTitle=", textResource, ", metricTitle=", textResource2, ", heightTitle=");
        AbstractC30007c.m91855y(sbM106658q, textResource3, ", weightTitle=", textResource4, ", feetText=");
        AbstractC11266d.m30444B(sbM106658q, str, ", inchesText=", str2, ", poundsText=");
        AbstractC11266d.m30444B(sbM106658q, str3, ", centimetersText=", str4, ", kilogramsText=");
        AbstractC11266d.m30470x(i13, str5, ", heightFeetMinValue=", ", heightFeetMaxValue=", sbM106658q);
        AbstractC30802r.m94773v(sbM106658q, i14, ", weightPoundsMinValue=", i15, ", weightPoundsMaxValue=");
        AbstractC30802r.m94773v(sbM106658q, i16, ", heightCentimetersMinValue=", i17, ", heightCentimetersMaxValue=");
        AbstractC30802r.m94773v(sbM106658q, i18, ", heightCentimetersPreselectedValue=", i19, ", weightKilogramsMinValue=");
        AbstractC30802r.m94773v(sbM106658q, i24, ", weightKilogramsMaxValue=", i25, ", weightKilogramsPreselectedValue=");
        sbM106658q.append(i26);
        sbM106658q.append(", title=");
        sbM106658q.append(textResource5);
        sbM106658q.append(", subtitle=");
        AbstractC11266d.m30444B(sbM106658q, str6, ", imageUrl=", str7, ", heightFeetPreselectedValue=");
        AbstractC30802r.m94773v(sbM106658q, i27, ", weightPoundsPreselectedValue=", i28, ", navigationBarText=");
        AbstractC11266d.m30444B(sbM106658q, str8, ", mobileScreenName=", str9, ", analyticsName=");
        sbM106658q.append(str10);
        sbM106658q.append(", progressCircle=");
        sbM106658q.append(progressButtonModel);
        sbM106658q.append(", footerButtons=");
        return AbstractC3855a.m11829m(sbM106658q, list, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HeightAndWeightStepModel(TextResource imperialTitle, TextResource metricTitle, TextResource heightTitle, TextResource weightTitle, String feetText, String inchesText, String poundsText, String centimetersText, String kilogramsText, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, int i26, TextResource title, String subtitle, String imageUrl, int i27, int i28, String str, String mobileScreenName, String analyticsName, ProgressButtonModel progressButtonModel, List<? extends DesignSystemModel> list) {
        AbstractC22676k.m65750j(imperialTitle, "imperialTitle");
        AbstractC22676k.m65750j(metricTitle, "metricTitle");
        AbstractC22676k.m65750j(heightTitle, "heightTitle");
        AbstractC22676k.m65750j(weightTitle, "weightTitle");
        AbstractC22676k.m65750j(feetText, "feetText");
        AbstractC22676k.m65750j(inchesText, "inchesText");
        AbstractC22676k.m65750j(poundsText, "poundsText");
        AbstractC22676k.m65750j(centimetersText, "centimetersText");
        AbstractC22676k.m65750j(kilogramsText, "kilogramsText");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(mobileScreenName, "mobileScreenName");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        this.imperialTitle = imperialTitle;
        this.metricTitle = metricTitle;
        this.heightTitle = heightTitle;
        this.weightTitle = weightTitle;
        this.feetText = feetText;
        this.inchesText = inchesText;
        this.poundsText = poundsText;
        this.centimetersText = centimetersText;
        this.kilogramsText = kilogramsText;
        this.heightFeetMinValue = i13;
        this.heightFeetMaxValue = i14;
        this.weightPoundsMinValue = i15;
        this.weightPoundsMaxValue = i16;
        this.heightCentimetersMinValue = i17;
        this.heightCentimetersMaxValue = i18;
        this.heightCentimetersPreselectedValue = i19;
        this.weightKilogramsMinValue = i24;
        this.weightKilogramsMaxValue = i25;
        this.weightKilogramsPreselectedValue = i26;
        this.title = title;
        this.subtitle = subtitle;
        this.imageUrl = imageUrl;
        this.heightFeetPreselectedValue = i27;
        this.weightPoundsPreselectedValue = i28;
        this.navigationBarText = str;
        this.mobileScreenName = mobileScreenName;
        this.analyticsName = analyticsName;
        this.progressCircle = progressButtonModel;
        this.footerButtons = list;
    }

    public /* synthetic */ HeightAndWeightStepModel(TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, String str, String str2, String str3, String str4, String str5, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, int i26, TextResource textResource5, String str6, String str7, int i27, int i28, String str8, String str9, String str10, ProgressButtonModel progressButtonModel, List list, int i29, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, textResource3, textResource4, str, str2, str3, str4, str5, i13, i14, i15, i16, i17, i18, i19, i24, i25, i26, textResource5, str6, str7, i27, i28, str8, str9, str10, progressButtonModel, (i29 & 268435456) != 0 ? C25271y.f99162w : list);
    }
}
