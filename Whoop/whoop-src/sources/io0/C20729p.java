package io0;

import c93.InterfaceC4351m;
import com.whoop.clinicianintheloop.api.GetHealthIntakeRequest;
import com.whoop.clinicianintheloop.api.GetVideoSchedulingIntakeRequest;
import com.whoop.clinicianintheloop.api.HealthIntakeEntryResponse;
import com.whoop.clinicianintheloop.api.HealthIntakeResponse;
import com.whoop.clinicianintheloop.api.HealthIntakeResponseItem;
import com.whoop.clinicianintheloop.api.HeightWeightScreen;
import com.whoop.clinicianintheloop.api.MultiSelectScreen;
import com.whoop.clinicianintheloop.api.PersonalIntakeFieldError;
import com.whoop.clinicianintheloop.api.PersonalIntakeForm;
import com.whoop.clinicianintheloop.api.PersonalIntakeScreen;
import com.whoop.clinicianintheloop.api.PersonalIntakeSubmitError;
import com.whoop.clinicianintheloop.api.SaveHealthIntakeRequest;
import com.whoop.clinicianintheloop.api.SavePersonalIntakeRequest;
import com.whoop.clinicianintheloop.api.SaveVideoSchedulingIntakeRequest;
import com.whoop.clinicianintheloop.api.StateSelectScreen;
import com.whoop.clinicianintheloop.api.StateSelector;
import com.whoop.clinicianintheloop.api.TextEntryScreen;
import com.whoop.clinicianintheloop.api.VideoSchedulingIntakeApi;
import com.whoop.clinicianintheloop.api.VideoSchedulingIntakeMultiSelectResponseBody;
import com.whoop.clinicianintheloop.api.VideoSchedulingIntakeResponse;
import com.whoop.clinicianintheloop.api.VideoSchedulingIntakeScreen;
import com.whoop.design.models.items.SelectableCellListModel;
import com.whoop.design.models.items.SelectableCellModel;
import com.whoop.design.models.items.TextAreaModel;
import com.whoop.navigation.C9598e;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import go0.EnumC16015e;
import go0.InterfaceC16013c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.JsonObject;
import l83.C23454a0;
import l83.C23465k;
import lo0.InterfaceC24615z;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import no.nordicsemi.android.dfu.DfuBaseService;
import od1.InterfaceC27844g;
import p000.AbstractC11266d;
import p007a6.C0456u;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pm0.AbstractC29355b;
import pm0.InterfaceC29354a;
import q63.AbstractC30007c;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import te0.AbstractC33745d;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import w02.C36684a;
import wb3.AbstractC37056f;
import wc3.InterfaceC37138c;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: io0.p */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001bB=\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0003H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u00122\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\"\u0010#J=\u0010%\u001a\u00020\u0003*\u00020\u00032\f\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b%\u0010&J\u001b\u0010(\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0016\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u001b\u0010+\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0016\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010,J\u001b\u0010.\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0016\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010/J\u001b\u00101\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0016\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102J\u001b\u00104\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0016\u001a\u000203H\u0002¢\u0006\u0004\b4\u00105J\u001b\u00107\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0016\u001a\u000206H\u0002¢\u0006\u0004\b7\u00108J\u001b\u0010:\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0016\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u001b\u0010=\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0016\u001a\u00020<H\u0002¢\u0006\u0004\b=\u0010>J\u0013\u0010?\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b?\u0010@J%\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u00122\u0006\u0010B\u001a\u00020A2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\bD\u0010EJ\u0018\u0010G\u001a\u00020C*\u0006\u0012\u0002\b\u00030FH\u0082@¢\u0006\u0004\bG\u0010HJ!\u0010L\u001a\u00020\u0003*\u00020\u00032\f\u0010K\u001a\b\u0012\u0004\u0012\u00020J0IH\u0002¢\u0006\u0004\bL\u0010MJ+\u0010P\u001a\b\u0012\u0004\u0012\u00020C0\u00122\u0006\u0010\u001f\u001a\u00020\u001c2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020N0IH\u0002¢\u0006\u0004\bP\u0010QJ%\u0010S\u001a\b\u0012\u0004\u0012\u00020C0\u00122\u0006\u0010O\u001a\u00020\u001c2\u0006\u0010R\u001a\u00020\u001cH\u0002¢\u0006\u0004\bS\u0010TJ\u0015\u0010V\u001a\u0004\u0018\u00010U*\u00020AH\u0002¢\u0006\u0004\bV\u0010WJ\u001d\u0010Z\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010Y\u001a\u00020XH\u0002¢\u0006\u0004\bZ\u0010[J/\u0010_\u001a\b\u0012\u0004\u0012\u00020N0I*\u00020\u00032\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\\0I2\u0006\u0010^\u001a\u00020\u0019H\u0002¢\u0006\u0004\b_\u0010`J\u0013\u0010a\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\ba\u0010@R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010m¨\u0006n"}, m65681d2 = {"Lio0/p;", "Lod1/g;", "Lio0/o;", "Lio0/y;", "Lnm0/e;", "cachedApiSource", "Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeApi;", "api", "Lio0/a;", "analyticsHelper", "Lio0/s;", "fieldValidator", "Lw02/a;", "errorBodyParser", "Ltr2/n;", "logger", "<init>", "(Lnm0/e;Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeApi;Lio0/a;Lio0/s;Lw02/a;Ltr2/n;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "action", "s", "(Lio0/y;Lio0/o;)Lio0/y;", "", "I", "(Lio0/y;)I", "", "appointmentType", "intakeType", "appointmentId", "Lpm0/a;", "Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeResponse;", "E", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lec3/l;", "result", "q", "(Lio0/y;Lpm0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio0/y;", "Lio0/o$e;", "t", "(Lio0/y;Lio0/o$e;)Lio0/y;", "Lio0/o$f;", "u", "(Lio0/y;Lio0/o$f;)Lio0/y;", "Lio0/o$l;", "z", "(Lio0/y;Lio0/o$l;)Lio0/y;", "Lio0/o$n;", "B", "(Lio0/y;Lio0/o$n;)Lio0/y;", "Lio0/o$j;", "x", "(Lio0/y;Lio0/o$j;)Lio0/y;", "Lio0/o$m;", "A", "(Lio0/y;Lio0/o$m;)Lio0/y;", "Lio0/o$k;", "y", "(Lio0/y;Lio0/o$k;)Lio0/y;", "Lio0/o$o;", "C", "(Lio0/y;Lio0/o$o;)Lio0/y;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lio0/y;)Lio0/y;", "Lio0/u;", "responses", "Lio0/p$a;", "H", "(Lio0/u;Ljava/lang/String;)Lec3/l;", "Lu02/a$b;", "J", "(Lu02/a$b;Lq83/d;)Ljava/lang/Object;", "", "Lcom/whoop/clinicianintheloop/api/PersonalIntakeFieldError;", "errors", "r", "(Lio0/y;Ljava/util/List;)Lio0/y;", "Lcom/whoop/clinicianintheloop/api/HealthIntakeResponseItem;", "intakeResponses", "F", "(Ljava/lang/String;Ljava/util/List;)Lec3/l;", "usState", "G", "(Ljava/lang/String;Ljava/lang/String;)Lec3/l;", "Lcom/whoop/clinicianintheloop/api/SavePersonalIntakeRequest;", "K", "(Lio0/u;)Lcom/whoop/clinicianintheloop/api/SavePersonalIntakeRequest;", "", "preserveDialogOnBack", "o", "(Lio0/y;Z)Lio0/y;", "Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;", "screens", "upToIndex", "D", "(Lio0/y;Ljava/util/List;I)Ljava/util/List;", "v", "a", "Lnm0/e;", "b", "Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeApi;", "c", "Lio0/a;", "d", "Lio0/s;", "e", "Lw02/a;", "f", "Ltr2/n;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C20729p implements InterfaceC27844g<AbstractC20728o, C20738y> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final VideoSchedulingIntakeApi api;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C20713a analyticsHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C20732s fieldValidator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C36684a errorBodyParser;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: io0.p$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m65681d2 = {"Lio0/p$a;", "", "<init>", "()V", "a", "c", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "d", "g", "e", "b", "f", "Lio0/p$a$a;", "Lio0/p$a$b;", "Lio0/p$a$c;", "Lio0/p$a$d;", "Lio0/p$a$e;", "Lio0/p$a$f;", "Lio0/p$a$g;", "Lio0/p$a$h;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: io0.p$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0015\u0010\f¨\u0006\u001c"}, m65681d2 = {"Lio0/p$a$a;", "Lio0/p$a;", "Lpm0/a;", "Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeResponse;", "result", "", "appointmentType", "intakeType", "appointmentId", "<init>", "(Lpm0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpm0/a;", "d", "()Lpm0/a;", "b", "Ljava/lang/String;", "c", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C41770a extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final InterfaceC29354a<VideoSchedulingIntakeResponse> result;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final String appointmentType;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final String intakeType;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final String appointmentId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41770a(InterfaceC29354a<VideoSchedulingIntakeResponse> result, String appointmentType, String str, String str2) {
                super(null);
                AbstractC22676k.m65750j(result, "result");
                AbstractC22676k.m65750j(appointmentType, "appointmentType");
                this.result = result;
                this.appointmentType = appointmentType;
                this.intakeType = str;
                this.appointmentId = str2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getAppointmentId() {
                return this.appointmentId;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getAppointmentType() {
                return this.appointmentType;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getIntakeType() {
                return this.intakeType;
            }

            /* JADX INFO: renamed from: d */
            public final InterfaceC29354a<VideoSchedulingIntakeResponse> m57003d() {
                return this.result;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C41770a)) {
                    return false;
                }
                C41770a c41770a = (C41770a) other;
                return AbstractC22676k.m65745e(this.result, c41770a.result) && AbstractC22676k.m65745e(this.appointmentType, c41770a.appointmentType) && AbstractC22676k.m65745e(this.intakeType, c41770a.intakeType) && AbstractC22676k.m65745e(this.appointmentId, c41770a.appointmentId);
            }

            public int hashCode() {
                int iM30450d = AbstractC11266d.m30450d(this.result.hashCode() * 31, 31, this.appointmentType);
                String str = this.intakeType;
                int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.appointmentId;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                InterfaceC29354a<VideoSchedulingIntakeResponse> interfaceC29354a = this.result;
                String str = this.appointmentType;
                String str2 = this.intakeType;
                String str3 = this.appointmentId;
                StringBuilder sb4 = new StringBuilder("CachedResult(result=");
                sb4.append(interfaceC29354a);
                sb4.append(", appointmentType=");
                sb4.append(str);
                sb4.append(", intakeType=");
                return AbstractC11266d.m30464r(sb4, str2, ", appointmentId=", str3, ")");
            }
        }

        /* JADX INFO: renamed from: io0.p$a$b */
        @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lio0/p$a$b;", "Lio0/p$a;", "", "Lcom/whoop/clinicianintheloop/api/PersonalIntakeFieldError;", "errors", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class b extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final List<PersonalIntakeFieldError> errors;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(List<PersonalIntakeFieldError> errors) {
                super(null);
                AbstractC22676k.m65750j(errors, "errors");
                this.errors = errors;
            }

            /* JADX INFO: renamed from: a */
            public final List<PersonalIntakeFieldError> m57004a() {
                return this.errors;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof b) && AbstractC22676k.m65745e(this.errors, ((b) other).errors);
            }

            public int hashCode() {
                return this.errors.hashCode();
            }

            public String toString() {
                return AbstractC33745d.m106654m("FieldErrors(errors=", ")", this.errors);
            }
        }

        /* JADX INFO: renamed from: io0.p$a$c */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lio0/p$a$c;", "Lio0/p$a;", "Lio0/o;", "action", "<init>", "(Lio0/o;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lio0/o;", "()Lio0/o;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class c extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final AbstractC20728o action;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(AbstractC20728o action) {
                super(null);
                AbstractC22676k.m65750j(action, "action");
                this.action = action;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final AbstractC20728o getAction() {
                return this.action;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof c) && AbstractC22676k.m65745e(this.action, ((c) other).action);
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            public String toString() {
                return "HandleDomainAction(action=" + this.action + ")";
            }
        }

        /* JADX INFO: renamed from: io0.p$a$d */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lio0/p$a$d;", "Lio0/p$a;", "<init>", "()V", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class d extends a {

            /* JADX INFO: renamed from: a */
            public static final d f77722a = new d();

            private d() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: io0.p$a$e */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lio0/p$a$e;", "Lio0/p$a;", "<init>", "()V", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class e extends a {

            /* JADX INFO: renamed from: a */
            public static final e f77723a = new e();

            private e() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: io0.p$a$f */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lio0/p$a$f;", "Lio0/p$a;", "<init>", "()V", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class f extends a {

            /* JADX INFO: renamed from: a */
            public static final f f77724a = new f();

            private f() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: io0.p$a$g */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lio0/p$a$g;", "Lio0/p$a;", "Lcom/whoop/navigation/e;", "navigationAction", "<init>", "(Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class g extends a {

            /* JADX INFO: renamed from: b */
            public static final int f77725b = C9598e.f28134d;

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final C9598e navigationAction;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(C9598e navigationAction) {
                super(null);
                AbstractC22676k.m65750j(navigationAction, "navigationAction");
                this.navigationAction = navigationAction;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final C9598e getNavigationAction() {
                return this.navigationAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof g) && AbstractC22676k.m65745e(this.navigationAction, ((g) other).navigationAction);
            }

            public int hashCode() {
                return this.navigationAction.hashCode();
            }

            public String toString() {
                return AbstractC33745d.m106650i("SaveSuccess(navigationAction=", this.navigationAction, ")");
            }
        }

        /* JADX INFO: renamed from: io0.p$a$h */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lio0/p$a$h;", "Lio0/p$a;", "<init>", "()V", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class h extends a {

            /* JADX INFO: renamed from: a */
            public static final h f77727a = new h();

            private h() {
                super(null);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: io0.p$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f77728a;

        static {
            int[] iArr = new int[EnumC16015e.values().length];
            try {
                iArr[EnumC16015e.HEIGHT_WEIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f77728a = iArr;
        }
    }

    /* JADX INFO: renamed from: io0.p$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.domain.ClinicianVideoSchedulingIntakeInteractor$fetchSchedulingIntake$$inlined$cacheAPI$1", m100430f = "ClinicianVideoSchedulingIntakeInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f77729w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f77730x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f77731y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f77732z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f77732z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f77732z);
            cVar.f77730x = interfaceC13062m;
            cVar.f77731y = c26832c;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f77729w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f77730x;
                C26832c c26832c = (C26832c) this.f77731y;
                InterfaceC26834e interfaceC26834e = this.f77732z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(VideoSchedulingIntakeResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(VideoSchedulingIntakeResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f77730x = null;
                this.f77731y = null;
                this.f77729w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (C26832c<C23454a0>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: io0.p$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.domain.ClinicianVideoSchedulingIntakeInteractor$interact$$inlined$flatMapLatest$1", m100430f = "ClinicianVideoSchedulingIntakeInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f77733w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f77734x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f77735y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C20729p f77736z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC30057d interfaceC30057d, C20729p c20729p) {
            super(3, interfaceC30057d);
            this.f77736z = c20729p;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC20728o abstractC20728o, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(interfaceC30057d, this.f77736z);
            dVar.f77734x = interfaceC13062m;
            dVar.f77735y = abstractC20728o;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c0456u;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f77733w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f77734x;
                AbstractC20728o abstractC20728o = (AbstractC20728o) this.f77735y;
                if (abstractC20728o instanceof AbstractC20728o.a) {
                    AbstractC20728o.a aVar = (AbstractC20728o.a) abstractC20728o;
                    c0456u = new f(this.f77736z.m56969E(aVar.getAppointmentType(), aVar.getIntakeType(), aVar.getAppointmentId()), abstractC20728o);
                } else if (abstractC20728o instanceof AbstractC20728o.b) {
                    AbstractC20728o.b bVar = (AbstractC20728o.b) abstractC20728o;
                    c0456u = this.f77736z.m56971G(bVar.getIntakeResponses(), bVar.getUsState());
                } else if (abstractC20728o instanceof AbstractC20728o.d) {
                    AbstractC20728o.d dVar = (AbstractC20728o.d) abstractC20728o;
                    c0456u = this.f77736z.m56972H(dVar.getResponses(), dVar.getAppointmentType());
                } else if (abstractC20728o instanceof AbstractC20728o.c) {
                    AbstractC20728o.c cVar = (AbstractC20728o.c) abstractC20728o;
                    c0456u = this.f77736z.m56970F(cVar.getAppointmentId(), cVar.m56949b());
                } else {
                    if (!AbstractC22676k.m65745e(abstractC20728o, AbstractC20728o.h.f77697a) && !AbstractC22676k.m65745e(abstractC20728o, AbstractC20728o.i.f77698a) && !AbstractC22676k.m65745e(abstractC20728o, AbstractC20728o.g.f77696a) && !(abstractC20728o instanceof AbstractC20728o.e) && !(abstractC20728o instanceof AbstractC20728o.f) && !(abstractC20728o instanceof AbstractC20728o.l) && !(abstractC20728o instanceof AbstractC20728o.m) && !(abstractC20728o instanceof AbstractC20728o.o) && !(abstractC20728o instanceof AbstractC20728o.n) && !(abstractC20728o instanceof AbstractC20728o.k) && !(abstractC20728o instanceof AbstractC20728o.j)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c0456u = new C0456u(new a.c(abstractC20728o), 1);
                }
                this.f77734x = null;
                this.f77735y = null;
                this.f77733w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c0456u, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC20728o) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: io0.p$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.domain.ClinicianVideoSchedulingIntakeInteractor$interact$2", m100430f = "ClinicianVideoSchedulingIntakeInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lio0/y;", "previousState", "Lio0/p$a;", "internalAction", "<anonymous>", "(Lio0/y;Lio0/p$a;)Lio0/y;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f77737w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f77738x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f77739y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C20738y c20738y, a aVar, InterfaceC30057d<? super C20738y> interfaceC30057d) {
            e eVar = C20729p.this.new e(interfaceC30057d);
            eVar.f77738x = c20738y;
            eVar.f77739y = aVar;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C20738y c20738yM57042a;
            C20738y c20738y = (C20738y) this.f77738x;
            a aVar = (a) this.f77739y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f77737w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (aVar instanceof a.C41770a) {
                a.C41770a c41770a = (a.C41770a) aVar;
                c20738yM57042a = C20729p.this.m56990q(c20738y, c41770a.m57003d(), c41770a.getAppointmentType(), c41770a.getIntakeType(), c41770a.getAppointmentId());
                c20738y = c20738y;
            } else if (aVar instanceof a.c) {
                c20738yM57042a = C20729p.this.m56999s(c20738y, ((a.c) aVar).getAction());
            } else if (aVar instanceof a.h) {
                c20738yM57042a = c20738y.m57042a((32719 & 1) != 0 ? c20738y.currentDialogType : InterfaceC20737x.f.f77817a, (32719 & 2) != 0 ? c20738y.response : null, (32719 & 4) != 0 ? c20738y.currentScreenId : null, (32719 & 8) != 0 ? c20738y.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32719 & 16) != 0 ? c20738y.lastScreenIndex : 0, (32719 & 32) != 0 ? c20738y.currentScreenIndex : 0, (32719 & 64) != 0 ? c20738y.appointmentType : null, (32719 & 128) != 0 ? c20738y.intakeType : null, (32719 & 256) != 0 ? c20738y.appointmentId : null, (32719 & 512) != 0 ? c20738y.stateSelectSelectedId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c20738y.intakeResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c20738y.personalIntakeResponses : null, (32719 & 4096) != 0 ? c20738y.textEntryResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c20738y.pickerEntryResponseByScreenId : null, (32719 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c20738y.skippedScreenIds : null);
            } else if (aVar instanceof a.d) {
                c20738yM57042a = C20729p.this.m56988o(c20738y, true);
            } else if (aVar instanceof a.g) {
                c20738yM57042a = c20738y.m57042a((32719 & 1) != 0 ? c20738y.currentDialogType : InterfaceC20737x.f.f77817a, (32719 & 2) != 0 ? c20738y.response : null, (32719 & 4) != 0 ? c20738y.currentScreenId : null, (32719 & 8) != 0 ? c20738y.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : new InterfaceC24615z.a(((a.g) aVar).getNavigationAction()), (32719 & 16) != 0 ? c20738y.lastScreenIndex : 0, (32719 & 32) != 0 ? c20738y.currentScreenIndex : 0, (32719 & 64) != 0 ? c20738y.appointmentType : null, (32719 & 128) != 0 ? c20738y.intakeType : null, (32719 & 256) != 0 ? c20738y.appointmentId : null, (32719 & 512) != 0 ? c20738y.stateSelectSelectedId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c20738y.intakeResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c20738y.personalIntakeResponses : null, (32719 & 4096) != 0 ? c20738y.textEntryResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c20738y.pickerEntryResponseByScreenId : null, (32719 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c20738y.skippedScreenIds : null);
            } else if (aVar instanceof a.e) {
                c20738yM57042a = c20738y.m57042a((32719 & 1) != 0 ? c20738y.currentDialogType : InterfaceC20737x.c.f77814a, (32719 & 2) != 0 ? c20738y.response : null, (32719 & 4) != 0 ? c20738y.currentScreenId : null, (32719 & 8) != 0 ? c20738y.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32719 & 16) != 0 ? c20738y.lastScreenIndex : 0, (32719 & 32) != 0 ? c20738y.currentScreenIndex : 0, (32719 & 64) != 0 ? c20738y.appointmentType : null, (32719 & 128) != 0 ? c20738y.intakeType : null, (32719 & 256) != 0 ? c20738y.appointmentId : null, (32719 & 512) != 0 ? c20738y.stateSelectSelectedId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c20738y.intakeResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c20738y.personalIntakeResponses : null, (32719 & 4096) != 0 ? c20738y.textEntryResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c20738y.pickerEntryResponseByScreenId : null, (32719 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c20738y.skippedScreenIds : null);
            } else if (aVar instanceof a.b) {
                c20738yM57042a = C20729p.this.m56991r(c20738y, ((a.b) aVar).m57004a());
            } else {
                if (!(aVar instanceof a.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                c20738yM57042a = c20738y.m57042a((32719 & 1) != 0 ? c20738y.currentDialogType : InterfaceC20737x.e.f77816a, (32719 & 2) != 0 ? c20738y.response : null, (32719 & 4) != 0 ? c20738y.currentScreenId : null, (32719 & 8) != 0 ? c20738y.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32719 & 16) != 0 ? c20738y.lastScreenIndex : 0, (32719 & 32) != 0 ? c20738y.currentScreenIndex : 0, (32719 & 64) != 0 ? c20738y.appointmentType : null, (32719 & 128) != 0 ? c20738y.intakeType : null, (32719 & 256) != 0 ? c20738y.appointmentId : null, (32719 & 512) != 0 ? c20738y.stateSelectSelectedId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c20738y.intakeResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c20738y.personalIntakeResponses : null, (32719 & 4096) != 0 ? c20738y.textEntryResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c20738y.pickerEntryResponseByScreenId : null, (32719 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c20738y.skippedScreenIds : null);
            }
            C20738y c20738y2 = c20738yM57042a;
            return c20738y2.m57042a((32719 & 1) != 0 ? c20738y2.currentDialogType : null, (32719 & 2) != 0 ? c20738y2.response : null, (32719 & 4) != 0 ? c20738y2.currentScreenId : null, (32719 & 8) != 0 ? c20738y2.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32719 & 16) != 0 ? c20738y2.lastScreenIndex : c20738y.getCurrentScreenIndex(), (32719 & 32) != 0 ? c20738y2.currentScreenIndex : C20729p.this.m56973I(c20738y2), (32719 & 64) != 0 ? c20738y2.appointmentType : null, (32719 & 128) != 0 ? c20738y2.intakeType : null, (32719 & 256) != 0 ? c20738y2.appointmentId : null, (32719 & 512) != 0 ? c20738y2.stateSelectSelectedId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c20738y2.intakeResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c20738y2.personalIntakeResponses : null, (32719 & 4096) != 0 ? c20738y2.textEntryResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c20738y2.pickerEntryResponseByScreenId : null, (32719 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c20738y2.skippedScreenIds : null);
        }
    }

    /* JADX INFO: renamed from: io0.p$f */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f77741w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC20728o f77742x;

        /* JADX INFO: renamed from: io0.p$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f77743w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ AbstractC20728o f77744x;

            /* JADX INFO: renamed from: io0.p$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.domain.ClinicianVideoSchedulingIntakeInteractor$interact$lambda$0$$inlined$map$1$2", m100430f = "ClinicianVideoSchedulingIntakeInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41771a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f77745E;

                /* JADX INFO: renamed from: F */
                Object f77746F;

                /* JADX INFO: renamed from: G */
                Object f77747G;

                /* JADX INFO: renamed from: H */
                int f77748H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f77749w;

                /* JADX INFO: renamed from: x */
                int f77750x;

                /* JADX INFO: renamed from: y */
                Object f77751y;

                public C41771a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f77749w = obj;
                    this.f77750x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, AbstractC20728o abstractC20728o) {
                this.f77743w = interfaceC13062m;
                this.f77744x = abstractC20728o;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41771a c41771a;
                if (interfaceC30057d instanceof C41771a) {
                    c41771a = (C41771a) interfaceC30057d;
                    int i13 = c41771a.f77750x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41771a.f77750x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41771a = new C41771a(interfaceC30057d);
                    }
                } else {
                    c41771a = new C41771a(interfaceC30057d);
                }
                Object obj2 = c41771a.f77749w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41771a.f77750x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f77743w;
                    a.C41770a c41770a = new a.C41770a((InterfaceC29354a) obj, ((AbstractC20728o.a) this.f77744x).getAppointmentType(), ((AbstractC20728o.a) this.f77744x).getIntakeType(), ((AbstractC20728o.a) this.f77744x).getAppointmentId());
                    c41771a.f77751y = null;
                    c41771a.f77745E = null;
                    c41771a.f77746F = null;
                    c41771a.f77747G = null;
                    c41771a.f77748H = 0;
                    c41771a.f77750x = 1;
                    if (interfaceC13062m.emit(c41770a, c41771a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public f(InterfaceC13058l interfaceC13058l, AbstractC20728o abstractC20728o) {
            this.f77741w = interfaceC13058l;
            this.f77742x = abstractC20728o;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f77741w.collect(new a(interfaceC13062m, this.f77742x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io0.p$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.domain.ClinicianVideoSchedulingIntakeInteractor$saveHealthIntakeFlow$1", m100430f = "ClinicianVideoSchedulingIntakeInteractor.kt", m100431l = {609, 610, 617, 618}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lio0/p$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f77753E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ List<HealthIntakeResponseItem> f77754F;

        /* JADX INFO: renamed from: w */
        Object f77755w;

        /* JADX INFO: renamed from: x */
        int f77756x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f77757y;

        /* JADX INFO: renamed from: io0.p$g$a */
        @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.domain.ClinicianVideoSchedulingIntakeInteractor$saveHealthIntakeFlow$1$result$1", m100430f = "ClinicianVideoSchedulingIntakeInteractor.kt", m100431l = {611}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f77759w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C20729p f77760x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f77761y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ List<HealthIntakeResponseItem> f77762z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C20729p c20729p, String str, List<HealthIntakeResponseItem> list, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f77760x = c20729p;
                this.f77761y = str;
                this.f77762z = list;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f77760x, this.f77761y, this.f77762z, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f77759w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    VideoSchedulingIntakeApi videoSchedulingIntakeApi = this.f77760x.api;
                    String str = this.f77761y;
                    SaveHealthIntakeRequest saveHealthIntakeRequest = new SaveHealthIntakeRequest(this.f77762z);
                    this.f77759w = 1;
                    if (videoSchedulingIntakeApi.saveHealthIntake(str, saveHealthIntakeRequest, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, List<HealthIntakeResponseItem> list, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f77753E = str;
            this.f77754F = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = C20729p.this.new g(this.f77753E, this.f77754F, interfaceC30057d);
            gVar.f77757y = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x006d  */
        /* JADX WARN: Code duplicated, block: B:25:0x007c  */
        /* JADX WARN: Code duplicated, block: B:27:0x0080  */
        /* JADX WARN: Code duplicated, block: B:32:0x0092  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
        
            if (r8.emit(r0, r13) == r9) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
        
            if (r8.emit(r0, r13) == r9) goto L29;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = r13.f77757y
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r13.f77756x
                r10 = 4
                r11 = 3
                r1 = 2
                r2 = 1
                r12 = 0
                if (r0 == 0) goto L32
                if (r0 == r2) goto L2e
                if (r0 == r1) goto L29
                if (r0 == r11) goto L21
                if (r0 != r10) goto L19
                goto L21
            L19:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L21:
                java.lang.Object r0 = r13.f77755w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r14)
                goto L8f
            L29:
                p505ts.AbstractC34132o.m107864I(r14)
                r0 = r14
                goto L67
            L2e:
                p505ts.AbstractC34132o.m107864I(r14)
                goto L42
            L32:
                p505ts.AbstractC34132o.m107864I(r14)
                io0.p$a$h r0 = io0.C20729p.a.h.f77727a
                r13.f77757y = r8
                r13.f77756x = r2
                java.lang.Object r0 = r8.emit(r0, r13)
                if (r0 != r9) goto L42
                goto L8e
            L42:
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                io0.p r2 = io0.C20729p.this
                tr2.n r2 = io0.C20729p.m56981h(r2)
                io0.p$g$a r4 = new io0.p$g$a
                io0.p r3 = io0.C20729p.this
                java.lang.String r6 = r13.f77753E
                java.util.List<com.whoop.clinicianintheloop.api.HealthIntakeResponseItem> r7 = r13.f77754F
                r4.<init>(r3, r6, r7, r12)
                r13.f77757y = r8
                r13.f77756x = r1
                r1 = r2
                r2 = 0
                java.lang.String r3 = "Failed to save health intake"
                r6 = 2
                r7 = 0
                r5 = r13
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L67
                goto L8e
            L67:
                u02.a r0 = (u02.InterfaceC34385a) r0
                boolean r1 = r0 instanceof u02.InterfaceC34385a.c
                if (r1 == 0) goto L7c
                io0.p$a$d r0 = io0.C20729p.a.d.f77722a
                r13.f77757y = r12
                r13.f77755w = r12
                r13.f77756x = r11
                java.lang.Object r0 = r8.emit(r0, r13)
                if (r0 != r9) goto L8f
                goto L8e
            L7c:
                boolean r0 = r0 instanceof u02.InterfaceC34385a.b
                if (r0 == 0) goto L92
                io0.p$a$f r0 = io0.C20729p.a.f.f77724a
                r13.f77757y = r12
                r13.f77755w = r12
                r13.f77756x = r10
                java.lang.Object r0 = r8.emit(r0, r13)
                if (r0 != r9) goto L8f
            L8e:
                return r9
            L8f:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            L92:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io0.C20729p.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: io0.p$h */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.domain.ClinicianVideoSchedulingIntakeInteractor$saveOnDemand$1", m100430f = "ClinicianVideoSchedulingIntakeInteractor.kt", m100431l = {623, 625, 628, 638, 639}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lio0/p$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        private /* synthetic */ Object f77763E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f77764F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ C20729p f77765G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ String f77766H;

        /* JADX INFO: renamed from: w */
        Object f77767w;

        /* JADX INFO: renamed from: x */
        Object f77768x;

        /* JADX INFO: renamed from: y */
        int f77769y;

        /* JADX INFO: renamed from: z */
        int f77770z;

        /* JADX INFO: renamed from: io0.p$h$a */
        @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.domain.ClinicianVideoSchedulingIntakeInteractor$saveOnDemand$1$response$1", m100430f = "ClinicianVideoSchedulingIntakeInteractor.kt", m100431l = {629}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lcom/whoop/navigation/e;", "<anonymous>", "()Lcom/whoop/navigation/e;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f77771w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C20729p f77772x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f77773y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ List<JsonObject> f77774z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C20729p c20729p, String str, List<JsonObject> list, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f77772x = c20729p;
                this.f77773y = str;
                this.f77774z = list;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f77772x, this.f77773y, this.f77774z, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f77771w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                VideoSchedulingIntakeApi videoSchedulingIntakeApi = this.f77772x.api;
                SaveVideoSchedulingIntakeRequest saveVideoSchedulingIntakeRequest = new SaveVideoSchedulingIntakeRequest(this.f77773y, this.f77774z);
                this.f77771w = 1;
                Object objSaveVideoSchedulingIntakeOnDemand = videoSchedulingIntakeApi.saveVideoSchedulingIntakeOnDemand("ON_DEMAND", saveVideoSchedulingIntakeRequest, this);
                return objSaveVideoSchedulingIntakeOnDemand == enumC31071a ? enumC31071a : objSaveVideoSchedulingIntakeOnDemand;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C9598e> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, C20729p c20729p, String str2, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f77764F = str;
            this.f77765G = c20729p;
            this.f77766H = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = new h(this.f77764F, this.f77765G, this.f77766H, interfaceC30057d);
            hVar.f77763E = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:33:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:35:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:37:0x00d0 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:38:0x00d1 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:39:0x00d2  */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objM108729b;
            InterfaceC34385a interfaceC34385a;
            a.e eVar;
            a.g gVar;
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f77763E;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f77770z;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                a.h hVar = a.h.f77727a;
                this.f77763E = interfaceC13062m;
                this.f77770z = 1;
                if (interfaceC13062m.emit(hVar, this) != enumC31071a) {
                }
                return enumC31071a;
            }
            if (i13 != 1) {
                if (i13 == 2) {
                } else if (i13 == 3) {
                    AbstractC34132o.m107864I(obj);
                    objM108729b = obj;
                } else {
                    if (i13 != 4 && i13 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            }
            AbstractC34132o.m107864I(obj);
            interfaceC34385a = (InterfaceC34385a) objM108729b;
            if (interfaceC34385a instanceof InterfaceC34385a.c) {
                gVar = new a.g((C9598e) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
                this.f77763E = null;
                this.f77767w = null;
                this.f77768x = null;
                this.f77770z = 4;
                if (interfaceC13062m.emit(gVar, this) != enumC31071a) {
                    return enumC31071a;
                }
                return c23454a0;
            }
            if (interfaceC34385a instanceof InterfaceC34385a.b) {
                throw new NoWhenBranchMatchedException();
            }
            eVar = a.e.f77723a;
            this.f77763E = null;
            this.f77767w = null;
            this.f77768x = null;
            this.f77770z = 5;
            if (interfaceC13062m.emit(eVar, this) != enumC31071a) {
                return enumC31071a;
            }
            return c23454a0;
            List<JsonObject> listM57058a = AbstractC20739z.m57058a(this.f77764F, this.f77765G.logger);
            if (listM57058a == null) {
                a.e eVar2 = a.e.f77723a;
                this.f77763E = null;
                this.f77767w = null;
                this.f77769y = 0;
                this.f77770z = 2;
                if (interfaceC13062m.emit(eVar2, this) != enumC31071a) {
                    return c23454a0;
                }
            } else {
                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n = this.f77765G.logger;
                a aVar = new a(this.f77765G, this.f77766H, listM57058a, null);
                this.f77763E = interfaceC13062m;
                this.f77767w = null;
                this.f77770z = 3;
                objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to save on-demand scheduling", aVar, this, 2, null);
                if (objM108729b != enumC31071a) {
                    interfaceC34385a = (InterfaceC34385a) objM108729b;
                    if (interfaceC34385a instanceof InterfaceC34385a.c) {
                        gVar = new a.g((C9598e) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
                        this.f77763E = null;
                        this.f77767w = null;
                        this.f77768x = null;
                        this.f77770z = 4;
                        if (interfaceC13062m.emit(gVar, this) != enumC31071a) {
                            return c23454a0;
                        }
                    } else {
                        if (interfaceC34385a instanceof InterfaceC34385a.b) {
                            throw new NoWhenBranchMatchedException();
                        }
                        eVar = a.e.f77723a;
                        this.f77763E = null;
                        this.f77767w = null;
                        this.f77768x = null;
                        this.f77770z = 5;
                        if (interfaceC13062m.emit(eVar, this) != enumC31071a) {
                            return c23454a0;
                        }
                    }
                }
            }
            return enumC31071a;
        }
    }

    /* JADX INFO: renamed from: io0.p$i */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.domain.ClinicianVideoSchedulingIntakeInteractor$savePersonalIntake$1", m100430f = "ClinicianVideoSchedulingIntakeInteractor.kt", m100431l = {555, 558, 561, 565, 566, 566}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lio0/p$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f77775E;

        /* JADX INFO: renamed from: F */
        private /* synthetic */ Object f77776F;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ C20734u f77778H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ String f77779I;

        /* JADX INFO: renamed from: w */
        Object f77780w;

        /* JADX INFO: renamed from: x */
        Object f77781x;

        /* JADX INFO: renamed from: y */
        Object f77782y;

        /* JADX INFO: renamed from: z */
        int f77783z;

        /* JADX INFO: renamed from: io0.p$i$a */
        @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.domain.ClinicianVideoSchedulingIntakeInteractor$savePersonalIntake$1$result$1", m100430f = "ClinicianVideoSchedulingIntakeInteractor.kt", m100431l = {562}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f77784w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C20729p f77785x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f77786y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ SavePersonalIntakeRequest f77787z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C20729p c20729p, String str, SavePersonalIntakeRequest savePersonalIntakeRequest, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f77785x = c20729p;
                this.f77786y = str;
                this.f77787z = savePersonalIntakeRequest;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f77785x, this.f77786y, this.f77787z, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f77784w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    VideoSchedulingIntakeApi videoSchedulingIntakeApi = this.f77785x.api;
                    String str = this.f77786y;
                    SavePersonalIntakeRequest savePersonalIntakeRequest = this.f77787z;
                    this.f77784w = 1;
                    if (videoSchedulingIntakeApi.savePersonalIntake(str, savePersonalIntakeRequest, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C20734u c20734u, String str, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f77778H = c20734u;
            this.f77779I = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            i iVar = C20729p.this.new i(this.f77778H, this.f77779I, interfaceC30057d);
            iVar.f77776F = obj;
            return iVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0069  */
        /* JADX WARN: Code duplicated, block: B:20:0x008a  */
        /* JADX WARN: Code duplicated, block: B:23:0x00af A[PHI: r10 r14
          0x00af: PHI (r10v2 io0.p$i) = (r10v1 io0.p$i), (r10v3 io0.p$i) binds: [B:21:0x00ac, B:8:0x0036] A[DONT_GENERATE, DONT_INLINE]
          0x00af: PHI (r14v11 java.lang.Object) = (r14v6 java.lang.Object), (r14v0 java.lang.Object) binds: [B:21:0x00ac, B:8:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:25:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:28:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:30:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:33:0x00e6 A[PHI: r0 r10 r14
          0x00e6: PHI (r0v8 ec3.m) = (r0v1 ec3.m), (r0v10 ec3.m) binds: [B:31:0x00e3, B:6:0x0016] A[DONT_GENERATE, DONT_INLINE]
          0x00e6: PHI (r10v5 io0.p$i) = (r10v2 io0.p$i), (r10v6 io0.p$i) binds: [B:31:0x00e3, B:6:0x0016] A[DONT_GENERATE, DONT_INLINE]
          0x00e6: PHI (r14v18 java.lang.Object) = (r14v15 java.lang.Object), (r14v0 java.lang.Object) binds: [B:31:0x00e3, B:6:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:36:0x00f8 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:37:0x00f9  */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0086, code lost:
        
            if (r0.emit(r14, r13) == r1) goto L13;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 274
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io0.C20729p.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: io0.p$j */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.domain.ClinicianVideoSchedulingIntakeInteractor", m100430f = "ClinicianVideoSchedulingIntakeInteractor.kt", m100431l = {572}, m100432m = "toInternalAction", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f77788w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f77789x;

        /* JADX INFO: renamed from: z */
        int f77791z;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f77789x = obj;
            this.f77791z |= Integer.MIN_VALUE;
            return C20729p.this.m56974J(null, this);
        }
    }

    public C20729p(InterfaceC26834e cachedApiSource, VideoSchedulingIntakeApi api, C20713a analyticsHelper, C20732s fieldValidator, C36684a errorBodyParser, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(fieldValidator, "fieldValidator");
        AbstractC22676k.m65750j(errorBodyParser, "errorBodyParser");
        AbstractC22676k.m65750j(logger, "logger");
        this.cachedApiSource = cachedApiSource;
        this.api = api;
        this.analyticsHelper = analyticsHelper;
        this.fieldValidator = fieldValidator;
        this.errorBodyParser = errorBodyParser;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: A */
    private final C20738y m56965A(C20738y c20738y, AbstractC20728o.m mVar) {
        VideoSchedulingIntakeScreen videoSchedulingIntakeScreen;
        C20731r c20731rM57022c;
        List<VideoSchedulingIntakeScreen> intakeScreens;
        Object next;
        String currentScreenId = c20738y.getCurrentScreenId();
        if (currentScreenId == null) {
            this.logger.mo85226q("UpdatePersonalIntakeField: no current screen; ignoring", new AbstractC30556a.a[0]);
            return c20738y;
        }
        VideoSchedulingIntakeResponse response = c20738y.getResponse();
        if (response == null || (intakeScreens = response.getIntakeScreens()) == null) {
            videoSchedulingIntakeScreen = null;
        } else {
            Iterator<T> it = intakeScreens.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC22676k.m65745e(((VideoSchedulingIntakeScreen) next).getId(), currentScreenId));
            videoSchedulingIntakeScreen = (VideoSchedulingIntakeScreen) next;
        }
        if (videoSchedulingIntakeScreen == null) {
            this.logger.mo85226q("UpdatePersonalIntakeField: unknown screen; ignoring", new AbstractC30556a.a[0]);
            return c20738y;
        }
        InterfaceC16013c content = videoSchedulingIntakeScreen.getContent();
        PersonalIntakeScreen personalIntakeScreen = content instanceof PersonalIntakeScreen ? (PersonalIntakeScreen) content : null;
        if (personalIntakeScreen == null) {
            this.logger.mo85226q("UpdatePersonalIntakeField: not personal intake screen; ignoring", new AbstractC30556a.a[0]);
            return c20738y;
        }
        C20734u c20734uM57034p = c20738y.getPersonalIntakeResponses().m57034p(mVar.getType(), mVar.getNewValue());
        if (mVar.getValidate() && (c20731rM57022c = c20734uM57034p.m57022c(mVar.getType())) != null) {
            c20734uM57034p = c20734uM57034p.m57035q(mVar.getType(), this.fieldValidator.m57014a(c20731rM57022c.getText(), AbstractC20730q.m57008a(personalIntakeScreen.getPersonalIntakeForm(), mVar.getType()).getValidRegex()));
        }
        return c20738y.m57042a((32719 & 1) != 0 ? c20738y.currentDialogType : null, (32719 & 2) != 0 ? c20738y.response : null, (32719 & 4) != 0 ? c20738y.currentScreenId : null, (32719 & 8) != 0 ? c20738y.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32719 & 16) != 0 ? c20738y.lastScreenIndex : 0, (32719 & 32) != 0 ? c20738y.currentScreenIndex : 0, (32719 & 64) != 0 ? c20738y.appointmentType : null, (32719 & 128) != 0 ? c20738y.intakeType : null, (32719 & 256) != 0 ? c20738y.appointmentId : null, (32719 & 512) != 0 ? c20738y.stateSelectSelectedId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c20738y.intakeResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c20738y.personalIntakeResponses : c20734uM57034p, (32719 & 4096) != 0 ? c20738y.textEntryResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c20738y.pickerEntryResponseByScreenId : null, (32719 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c20738y.skippedScreenIds : null);
    }

    /* JADX INFO: renamed from: B */
    private final C20738y m56966B(C20738y c20738y, AbstractC20728o.n nVar) {
        VideoSchedulingIntakeScreen videoSchedulingIntakeScreen;
        List<VideoSchedulingIntakeScreen> intakeScreens;
        Object next;
        String currentScreenId = c20738y.getCurrentScreenId();
        if (currentScreenId == null) {
            this.logger.mo85226q("UpdateTextEntryInput: no current screen; ignoring", new AbstractC30556a.a[0]);
            return c20738y;
        }
        VideoSchedulingIntakeResponse response = c20738y.getResponse();
        if (response == null || (intakeScreens = response.getIntakeScreens()) == null) {
            videoSchedulingIntakeScreen = null;
        } else {
            Iterator<T> it = intakeScreens.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC22676k.m65745e(((VideoSchedulingIntakeScreen) next).getId(), currentScreenId));
            videoSchedulingIntakeScreen = (VideoSchedulingIntakeScreen) next;
        }
        if (videoSchedulingIntakeScreen == null) {
            this.logger.mo85226q("UpdateTextEntryInput: unknown screen; ignoring", new AbstractC30556a.a[0]);
            return c20738y;
        }
        InterfaceC16013c content = videoSchedulingIntakeScreen.getContent();
        TextEntryScreen textEntryScreen = content instanceof TextEntryScreen ? (TextEntryScreen) content : null;
        if (textEntryScreen == null) {
            this.logger.mo85226q("UpdateTextEntryInput: not text entry screen; ignoring", new AbstractC30556a.a[0]);
            return c20738y;
        }
        List<TextAreaModel> textAreas = textEntryScreen.getTextAreas();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it3 = textAreas.iterator();
        while (it3.hasNext()) {
            String id4 = ((TextAreaModel) it3.next()).getId();
            if (id4 != null) {
                arrayList.add(id4);
            }
        }
        if (!AbstractC25265s.m74103I1(arrayList).contains(nVar.getTextAreaId())) {
            this.logger.mo85226q("UpdateTextEntryInput: textAreaId not in screen's text areas; ignoring", new AbstractC30556a.a[0]);
            return c20738y;
        }
        C20736w c20736w = c20738y.m57057q().get(currentScreenId);
        if (c20736w == null) {
            c20736w = new C20736w(null, null, 3, null);
        }
        return c20738y.m57042a((32719 & 1) != 0 ? c20738y.currentDialogType : null, (32719 & 2) != 0 ? c20738y.response : null, (32719 & 4) != 0 ? c20738y.currentScreenId : null, (32719 & 8) != 0 ? c20738y.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32719 & 16) != 0 ? c20738y.lastScreenIndex : 0, (32719 & 32) != 0 ? c20738y.currentScreenIndex : 0, (32719 & 64) != 0 ? c20738y.appointmentType : null, (32719 & 128) != 0 ? c20738y.intakeType : null, (32719 & 256) != 0 ? c20738y.appointmentId : null, (32719 & 512) != 0 ? c20738y.stateSelectSelectedId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c20738y.intakeResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c20738y.personalIntakeResponses : null, (32719 & 4096) != 0 ? c20738y.textEntryResponsesByScreenId : AbstractC25247g0.m73996e0(c20738y.m57057q(), new C23465k(currentScreenId, C20736w.m57037b(c20736w, AbstractC25247g0.m73996e0(c20736w.m57040d(), new C23465k(nVar.getTextAreaId(), nVar.getText())), null, 2, null))), (32719 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c20738y.pickerEntryResponseByScreenId : null, (32719 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c20738y.skippedScreenIds : AbstractC12350b.m34604y(currentScreenId, c20738y.m57055o()));
    }

    /* JADX INFO: renamed from: C */
    private final C20738y m56967C(C20738y c20738y, AbstractC20728o.o oVar) {
        VideoSchedulingIntakeScreen videoSchedulingIntakeScreen;
        List<VideoSchedulingIntakeScreen> intakeScreens;
        Object next;
        String currentScreenId = c20738y.getCurrentScreenId();
        if (currentScreenId == null) {
            this.logger.mo85226q("ValidatePersonalIntakeField: no current screen; ignoring", new AbstractC30556a.a[0]);
            return c20738y;
        }
        VideoSchedulingIntakeResponse response = c20738y.getResponse();
        if (response == null || (intakeScreens = response.getIntakeScreens()) == null) {
            videoSchedulingIntakeScreen = null;
        } else {
            Iterator<T> it = intakeScreens.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC22676k.m65745e(((VideoSchedulingIntakeScreen) next).getId(), currentScreenId));
            videoSchedulingIntakeScreen = (VideoSchedulingIntakeScreen) next;
        }
        if (videoSchedulingIntakeScreen == null) {
            this.logger.mo85226q("ValidatePersonalIntakeField: unknown screen; ignoring", new AbstractC30556a.a[0]);
            return c20738y;
        }
        InterfaceC16013c content = videoSchedulingIntakeScreen.getContent();
        PersonalIntakeScreen personalIntakeScreen = content instanceof PersonalIntakeScreen ? (PersonalIntakeScreen) content : null;
        if (personalIntakeScreen == null) {
            this.logger.mo85226q("ValidatePersonalIntakeField: not personal intake screen; ignoring", new AbstractC30556a.a[0]);
            return c20738y;
        }
        C20731r c20731rM57022c = c20738y.getPersonalIntakeResponses().m57022c(oVar.getType());
        return c20731rM57022c == null ? c20738y : c20738y.m57042a((32719 & 1) != 0 ? c20738y.currentDialogType : null, (32719 & 2) != 0 ? c20738y.response : null, (32719 & 4) != 0 ? c20738y.currentScreenId : null, (32719 & 8) != 0 ? c20738y.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32719 & 16) != 0 ? c20738y.lastScreenIndex : 0, (32719 & 32) != 0 ? c20738y.currentScreenIndex : 0, (32719 & 64) != 0 ? c20738y.appointmentType : null, (32719 & 128) != 0 ? c20738y.intakeType : null, (32719 & 256) != 0 ? c20738y.appointmentId : null, (32719 & 512) != 0 ? c20738y.stateSelectSelectedId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c20738y.intakeResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c20738y.personalIntakeResponses : c20738y.getPersonalIntakeResponses().m57035q(oVar.getType(), this.fieldValidator.m57014a(c20731rM57022c.getText(), AbstractC20730q.m57008a(personalIntakeScreen.getPersonalIntakeForm(), oVar.getType()).getValidRegex())), (32719 & 4096) != 0 ? c20738y.textEntryResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c20738y.pickerEntryResponseByScreenId : null, (32719 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c20738y.skippedScreenIds : null);
    }

    /* JADX INFO: renamed from: D */
    private final List<HealthIntakeResponseItem> m56968D(C20738y c20738y, List<VideoSchedulingIntakeScreen> list, int i13) {
        HealthIntakeResponse textEntryHealthIntakeResponse;
        List<VideoSchedulingIntakeScreen> listM74156w1 = AbstractC25265s.m74156w1(list, i13 + 1);
        ArrayList arrayList = new ArrayList();
        for (VideoSchedulingIntakeScreen videoSchedulingIntakeScreen : listM74156w1) {
            HealthIntakeResponseItem healthIntakeResponseItem = null;
            healthIntakeResponseItem = null;
            healthIntakeResponseItem = null;
            arrayList = null;
            ArrayList arrayList2 = null;
            healthIntakeResponseItem = null;
            if (!c20738y.m57055o().contains(videoSchedulingIntakeScreen.getId())) {
                if (b.f77728a[videoSchedulingIntakeScreen.getType().ordinal()] == 1) {
                    C20733t c20733t = c20738y.m57053m().get(videoSchedulingIntakeScreen.getId());
                    if (c20733t != null) {
                        if (c20733t.getWeight() == null || c20733t.getHeight() == null || c20733t.getUnit() == null) {
                            this.logger.mo85226q(AbstractC11895b.m31996o("Invalid State detected on ", videoSchedulingIntakeScreen.getId(), " intake screen. Response is ignored."), new AbstractC30556a.a[0]);
                        } else {
                            textEntryHealthIntakeResponse = new HealthIntakeResponse.HeightWeightHealthIntakeResponse(c20733t.getHeight().intValue(), c20733t.getWeight().intValue(), c20733t.getUnit());
                            healthIntakeResponseItem = new HealthIntakeResponseItem(videoSchedulingIntakeScreen.getId(), textEntryHealthIntakeResponse);
                        }
                    }
                } else {
                    C20736w c20736w = c20738y.m57057q().get(videoSchedulingIntakeScreen.getId());
                    if (c20736w != null) {
                        if (!AbstractC22676k.m65745e(c20736w.getCheckboxSelected(), Boolean.TRUE)) {
                            Map<String, String> mapM57040d = c20736w.m57040d();
                            ArrayList arrayList3 = new ArrayList(mapM57040d.size());
                            for (Map.Entry<String, String> entry : mapM57040d.entrySet()) {
                                arrayList3.add(new HealthIntakeEntryResponse(entry.getKey(), entry.getValue()));
                            }
                            if (!arrayList3.isEmpty()) {
                                arrayList2 = arrayList3;
                            }
                        }
                        textEntryHealthIntakeResponse = new HealthIntakeResponse.TextEntryHealthIntakeResponse(arrayList2, c20736w.getCheckboxSelected());
                        healthIntakeResponseItem = new HealthIntakeResponseItem(videoSchedulingIntakeScreen.getId(), textEntryHealthIntakeResponse);
                    }
                }
            }
            if (healthIntakeResponseItem != null) {
                arrayList.add(healthIntakeResponseItem);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public final InterfaceC13058l m56969E(String appointmentType, String intakeType, String appointmentId) {
        return AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(AbstractC22676k.m65745e(intakeType, "HEALTH") ? GetHealthIntakeRequest.INSTANCE : new GetVideoSchedulingIntakeRequest(appointmentType, appointmentId), 1), AbstractC12350b.m34570S("video-scheduling-intake"), null, 2, null), new c(null, this.cachedApiSource));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public final InterfaceC13058l m56970F(String appointmentId, List<HealthIntakeResponseItem> intakeResponses) {
        return new C13084s1(new g(appointmentId, intakeResponses, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public final InterfaceC13058l m56971G(String intakeResponses, String usState) {
        return new C13084s1(new h(intakeResponses, this, usState, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public final InterfaceC13058l m56972H(C20734u responses, String appointmentType) {
        return new C13084s1(new i(responses, appointmentType, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public final int m56973I(C20738y c20738y) {
        VideoSchedulingIntakeResponse response;
        List<VideoSchedulingIntakeScreen> intakeScreens;
        String currentScreenId = c20738y.getCurrentScreenId();
        if (currentScreenId != null && (response = c20738y.getResponse()) != null && (intakeScreens = response.getIntakeScreens()) != null) {
            Iterator<VideoSchedulingIntakeScreen> it = intakeScreens.iterator();
            int i13 = 0;
            while (it.hasNext()) {
                if (AbstractC22676k.m65745e(it.next().getId(), currentScreenId)) {
                    return i13;
                }
                i13++;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: J */
    public final Object m56974J(InterfaceC34385a.b<?> bVar, InterfaceC30057d<? super a> interfaceC30057d) {
        j jVar;
        if (interfaceC30057d instanceof j) {
            jVar = (j) interfaceC30057d;
            int i13 = jVar.f77791z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                jVar.f77791z = i13 - Integer.MIN_VALUE;
            } else {
                jVar = new j(interfaceC30057d);
            }
        } else {
            jVar = new j(interfaceC30057d);
        }
        Object objM117757a = jVar.f77789x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = jVar.f77791z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM117757a);
            if (bVar instanceof InterfaceC34385a.b.a) {
                InterfaceC34385a.b.a aVar = (InterfaceC34385a.b.a) bVar;
                if (aVar.getErrorCode() == 400) {
                    C36684a c36684a = this.errorBodyParser;
                    Exception exception = aVar.getException();
                    InterfaceC37138c interfaceC37138cSerializer = PersonalIntakeSubmitError.INSTANCE.serializer();
                    jVar.f77788w = null;
                    jVar.f77791z = 1;
                    objM117757a = c36684a.m117757a(exception, interfaceC37138cSerializer, jVar);
                    if (objM117757a == enumC31071a) {
                        return enumC31071a;
                    }
                }
            }
            return a.e.f77723a;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(objM117757a);
        PersonalIntakeSubmitError personalIntakeSubmitError = (PersonalIntakeSubmitError) objM117757a;
        List<PersonalIntakeFieldError> fieldErrors = personalIntakeSubmitError != null ? personalIntakeSubmitError.getFieldErrors() : null;
        if (fieldErrors == null) {
            fieldErrors = C25271y.f99162w;
        }
        if (!fieldErrors.isEmpty()) {
            return new a.b(fieldErrors);
        }
        return a.e.f77723a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public final SavePersonalIntakeRequest m56975K(C20734u c20734u) {
        String text;
        C20731r lastName;
        String text2;
        C20731r dateOfBirth;
        String text3;
        C20731r addressLine1;
        String text4;
        C20731r city;
        String text5;
        C20731r state;
        String text6;
        C20731r zipCode;
        String text7;
        C20731r country;
        String text8;
        C20731r phoneNumber;
        String text9;
        String text10;
        C20731r firstName = c20734u.getFirstName();
        if (firstName != null && (text = firstName.getText()) != null) {
            String str = !AbstractC39414r.m125890i0(text) ? text : null;
            if (str != null && (lastName = c20734u.getLastName()) != null && (text2 = lastName.getText()) != null) {
                String str2 = !AbstractC39414r.m125890i0(text2) ? text2 : null;
                if (str2 != null && (dateOfBirth = c20734u.getDateOfBirth()) != null && (text3 = dateOfBirth.getText()) != null) {
                    String str3 = !AbstractC39414r.m125890i0(text3) ? text3 : null;
                    if (str3 != null && (addressLine1 = c20734u.getAddressLine1()) != null && (text4 = addressLine1.getText()) != null) {
                        String str4 = !AbstractC39414r.m125890i0(text4) ? text4 : null;
                        if (str4 != null && (city = c20734u.getCity()) != null && (text5 = city.getText()) != null) {
                            String str5 = !AbstractC39414r.m125890i0(text5) ? text5 : null;
                            if (str5 != null && (state = c20734u.getState()) != null && (text6 = state.getText()) != null) {
                                String str6 = !AbstractC39414r.m125890i0(text6) ? text6 : null;
                                if (str6 != null && (zipCode = c20734u.getZipCode()) != null && (text7 = zipCode.getText()) != null) {
                                    String str7 = !AbstractC39414r.m125890i0(text7) ? text7 : null;
                                    if (str7 != null && (country = c20734u.getCountry()) != null && (text8 = country.getText()) != null) {
                                        String str8 = !AbstractC39414r.m125890i0(text8) ? text8 : null;
                                        if (str8 != null && (phoneNumber = c20734u.getPhoneNumber()) != null && (text9 = phoneNumber.getText()) != null) {
                                            String str9 = !AbstractC39414r.m125890i0(text9) ? text9 : null;
                                            if (str9 != null) {
                                                C20731r addressLine2 = c20734u.getAddressLine2();
                                                return new SavePersonalIntakeRequest(str, str2, str3, str4, (addressLine2 == null || (text10 = addressLine2.getText()) == null || AbstractC39414r.m125890i0(text10)) ? null : text10, str5, str6, str7, str8, str9);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final C20738y m56988o(C20738y c20738y, boolean z4) {
        VideoSchedulingIntakeResponse response = c20738y.getResponse();
        List<VideoSchedulingIntakeScreen> intakeScreens = response != null ? response.getIntakeScreens() : null;
        if (intakeScreens == null) {
            intakeScreens = C25271y.f99162w;
        }
        Iterator<VideoSchedulingIntakeScreen> it = intakeScreens.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            if (AbstractC22676k.m65745e(it.next().getId(), c20738y.getCurrentScreenId())) {
                break;
            }
            i13++;
        }
        if (i13 < 0 || i13 >= AbstractC37056f.m118951C(intakeScreens)) {
            return c20738y.m57042a((32719 & 1) != 0 ? c20738y.currentDialogType : z4 ? c20738y.getCurrentDialogType() : null, (32719 & 2) != 0 ? c20738y.response : null, (32719 & 4) != 0 ? c20738y.currentScreenId : null, (32719 & 8) != 0 ? c20738y.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : InterfaceC24615z.b.f96222a, (32719 & 16) != 0 ? c20738y.lastScreenIndex : 0, (32719 & 32) != 0 ? c20738y.currentScreenIndex : 0, (32719 & 64) != 0 ? c20738y.appointmentType : null, (32719 & 128) != 0 ? c20738y.intakeType : null, (32719 & 256) != 0 ? c20738y.appointmentId : null, (32719 & 512) != 0 ? c20738y.stateSelectSelectedId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c20738y.intakeResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c20738y.personalIntakeResponses : null, (32719 & 4096) != 0 ? c20738y.textEntryResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c20738y.pickerEntryResponseByScreenId : null, (32719 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c20738y.skippedScreenIds : null);
        }
        return c20738y.m57042a((32719 & 1) != 0 ? c20738y.currentDialogType : null, (32719 & 2) != 0 ? c20738y.response : null, (32719 & 4) != 0 ? c20738y.currentScreenId : intakeScreens.get(i13 + 1).getId(), (32719 & 8) != 0 ? c20738y.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32719 & 16) != 0 ? c20738y.lastScreenIndex : 0, (32719 & 32) != 0 ? c20738y.currentScreenIndex : 0, (32719 & 64) != 0 ? c20738y.appointmentType : null, (32719 & 128) != 0 ? c20738y.intakeType : null, (32719 & 256) != 0 ? c20738y.appointmentId : null, (32719 & 512) != 0 ? c20738y.stateSelectSelectedId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c20738y.intakeResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c20738y.personalIntakeResponses : null, (32719 & 4096) != 0 ? c20738y.textEntryResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c20738y.pickerEntryResponseByScreenId : null, (32719 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c20738y.skippedScreenIds : null);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ C20738y m56989p(C20729p c20729p, C20738y c20738y, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = false;
        }
        return c20729p.m56988o(c20738y, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final C20738y m56990q(C20738y c20738y, InterfaceC29354a<VideoSchedulingIntakeResponse> interfaceC29354a, String str, String str2, String str3) {
        VideoSchedulingIntakeResponse videoSchedulingIntakeResponse;
        C20738y c20738yM57042a = c20738y.m57042a((32719 & 1) != 0 ? c20738y.currentDialogType : null, (32719 & 2) != 0 ? c20738y.response : null, (32719 & 4) != 0 ? c20738y.currentScreenId : null, (32719 & 8) != 0 ? c20738y.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32719 & 16) != 0 ? c20738y.lastScreenIndex : 0, (32719 & 32) != 0 ? c20738y.currentScreenIndex : 0, (32719 & 64) != 0 ? c20738y.appointmentType : str, (32719 & 128) != 0 ? c20738y.intakeType : str2, (32719 & 256) != 0 ? c20738y.appointmentId : str3, (32719 & 512) != 0 ? c20738y.stateSelectSelectedId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c20738y.intakeResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c20738y.personalIntakeResponses : null, (32719 & 4096) != 0 ? c20738y.textEntryResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c20738y.pickerEntryResponseByScreenId : null, (32719 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c20738y.skippedScreenIds : null);
        if ((interfaceC29354a instanceof InterfaceC29354a.a.b) || (interfaceC29354a instanceof InterfaceC29354a.a.C42173a)) {
            videoSchedulingIntakeResponse = (VideoSchedulingIntakeResponse) ((InterfaceC29354a.a) interfaceC29354a).getData();
        } else {
            if (!(interfaceC29354a instanceof InterfaceC29354a.d)) {
                if (interfaceC29354a instanceof InterfaceC29354a.e) {
                    return c20738yM57042a.m57042a((32719 & 1) != 0 ? c20738yM57042a.currentDialogType : InterfaceC20737x.b.f77813a, (32719 & 2) != 0 ? c20738yM57042a.response : null, (32719 & 4) != 0 ? c20738yM57042a.currentScreenId : null, (32719 & 8) != 0 ? c20738yM57042a.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32719 & 16) != 0 ? c20738yM57042a.lastScreenIndex : 0, (32719 & 32) != 0 ? c20738yM57042a.currentScreenIndex : 0, (32719 & 64) != 0 ? c20738yM57042a.appointmentType : null, (32719 & 128) != 0 ? c20738yM57042a.intakeType : null, (32719 & 256) != 0 ? c20738yM57042a.appointmentId : null, (32719 & 512) != 0 ? c20738yM57042a.stateSelectSelectedId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c20738yM57042a.intakeResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c20738yM57042a.personalIntakeResponses : null, (32719 & 4096) != 0 ? c20738yM57042a.textEntryResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c20738yM57042a.pickerEntryResponseByScreenId : null, (32719 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c20738yM57042a.skippedScreenIds : null);
                }
                if (interfaceC29354a instanceof InterfaceC29354a.c) {
                    return c20738yM57042a.m57042a((32719 & 1) != 0 ? c20738yM57042a.currentDialogType : AbstractC29355b.m89462a((InterfaceC29354a.b) interfaceC29354a) ? InterfaceC20737x.d.f77815a : InterfaceC20737x.c.f77814a, (32719 & 2) != 0 ? c20738yM57042a.response : null, (32719 & 4) != 0 ? c20738yM57042a.currentScreenId : null, (32719 & 8) != 0 ? c20738yM57042a.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32719 & 16) != 0 ? c20738yM57042a.lastScreenIndex : 0, (32719 & 32) != 0 ? c20738yM57042a.currentScreenIndex : 0, (32719 & 64) != 0 ? c20738yM57042a.appointmentType : null, (32719 & 128) != 0 ? c20738yM57042a.intakeType : null, (32719 & 256) != 0 ? c20738yM57042a.appointmentId : null, (32719 & 512) != 0 ? c20738yM57042a.stateSelectSelectedId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c20738yM57042a.intakeResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c20738yM57042a.personalIntakeResponses : null, (32719 & 4096) != 0 ? c20738yM57042a.textEntryResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c20738yM57042a.pickerEntryResponseByScreenId : null, (32719 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c20738yM57042a.skippedScreenIds : null);
                }
                throw new NoWhenBranchMatchedException();
            }
            videoSchedulingIntakeResponse = (VideoSchedulingIntakeResponse) ((InterfaceC29354a.d) interfaceC29354a).getData();
        }
        VideoSchedulingIntakeResponse videoSchedulingIntakeResponse2 = videoSchedulingIntakeResponse;
        VideoSchedulingIntakeScreen videoSchedulingIntakeScreen = (VideoSchedulingIntakeScreen) AbstractC25265s.m74100H0(videoSchedulingIntakeResponse2.getIntakeScreens());
        String id4 = videoSchedulingIntakeScreen != null ? videoSchedulingIntakeScreen.getId() : null;
        List<VideoSchedulingIntakeScreen> intakeScreens = videoSchedulingIntakeResponse2.getIntakeScreens();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(intakeScreens, 10));
        Iterator<T> it = intakeScreens.iterator();
        while (it.hasNext()) {
            arrayList.add(((VideoSchedulingIntakeScreen) it.next()).getId());
        }
        Set setM74103I1 = AbstractC25265s.m74103I1(arrayList);
        if (c20738y.getCurrentScreenId() == null) {
            if (id4 == null) {
                return c20738yM57042a.m57042a((32719 & 1) != 0 ? c20738yM57042a.currentDialogType : InterfaceC20737x.d.f77815a, (32719 & 2) != 0 ? c20738yM57042a.response : videoSchedulingIntakeResponse2, (32719 & 4) != 0 ? c20738yM57042a.currentScreenId : null, (32719 & 8) != 0 ? c20738yM57042a.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32719 & 16) != 0 ? c20738yM57042a.lastScreenIndex : 0, (32719 & 32) != 0 ? c20738yM57042a.currentScreenIndex : 0, (32719 & 64) != 0 ? c20738yM57042a.appointmentType : null, (32719 & 128) != 0 ? c20738yM57042a.intakeType : null, (32719 & 256) != 0 ? c20738yM57042a.appointmentId : null, (32719 & 512) != 0 ? c20738yM57042a.stateSelectSelectedId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c20738yM57042a.intakeResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c20738yM57042a.personalIntakeResponses : null, (32719 & 4096) != 0 ? c20738yM57042a.textEntryResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c20738yM57042a.pickerEntryResponseByScreenId : null, (32719 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c20738yM57042a.skippedScreenIds : null);
            }
            C20734u c20734u = new C20734u(null, null, null, null, null, null, null, null, null, null, 1023, null);
            C25272z c25272z = C25272z.f99163w;
            return c20738yM57042a.m57042a((32719 & 1) != 0 ? c20738yM57042a.currentDialogType : null, (32719 & 2) != 0 ? c20738yM57042a.response : videoSchedulingIntakeResponse2, (32719 & 4) != 0 ? c20738yM57042a.currentScreenId : id4, (32719 & 8) != 0 ? c20738yM57042a.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32719 & 16) != 0 ? c20738yM57042a.lastScreenIndex : 0, (32719 & 32) != 0 ? c20738yM57042a.currentScreenIndex : 0, (32719 & 64) != 0 ? c20738yM57042a.appointmentType : null, (32719 & 128) != 0 ? c20738yM57042a.intakeType : null, (32719 & 256) != 0 ? c20738yM57042a.appointmentId : null, (32719 & 512) != 0 ? c20738yM57042a.stateSelectSelectedId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c20738yM57042a.intakeResponsesByScreenId : c25272z, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c20738yM57042a.personalIntakeResponses : c20734u, (32719 & 4096) != 0 ? c20738yM57042a.textEntryResponsesByScreenId : c25272z, (32719 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c20738yM57042a.pickerEntryResponseByScreenId : c25272z, (32719 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c20738yM57042a.skippedScreenIds : null);
        }
        Map<String, VideoSchedulingIntakeMultiSelectResponseBody> mapM57049i = c20738y.m57049i();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, VideoSchedulingIntakeMultiSelectResponseBody> entry : mapM57049i.entrySet()) {
            if (setM74103I1.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Map<String, C20736w> mapM57057q = c20738y.m57057q();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, C20736w> entry2 : mapM57057q.entrySet()) {
            if (setM74103I1.contains(entry2.getKey())) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        Map<String, C20733t> mapM57053m = c20738y.m57053m();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry<String, C20733t> entry3 : mapM57053m.entrySet()) {
            if (setM74103I1.contains(entry3.getKey())) {
                linkedHashMap3.put(entry3.getKey(), entry3.getValue());
            }
        }
        return c20738yM57042a.m57042a((32719 & 1) != 0 ? c20738yM57042a.currentDialogType : null, (32719 & 2) != 0 ? c20738yM57042a.response : videoSchedulingIntakeResponse2, (32719 & 4) != 0 ? c20738yM57042a.currentScreenId : null, (32719 & 8) != 0 ? c20738yM57042a.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32719 & 16) != 0 ? c20738yM57042a.lastScreenIndex : 0, (32719 & 32) != 0 ? c20738yM57042a.currentScreenIndex : 0, (32719 & 64) != 0 ? c20738yM57042a.appointmentType : null, (32719 & 128) != 0 ? c20738yM57042a.intakeType : null, (32719 & 256) != 0 ? c20738yM57042a.appointmentId : null, (32719 & 512) != 0 ? c20738yM57042a.stateSelectSelectedId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c20738yM57042a.intakeResponsesByScreenId : linkedHashMap, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c20738yM57042a.personalIntakeResponses : null, (32719 & 4096) != 0 ? c20738yM57042a.textEntryResponsesByScreenId : linkedHashMap2, (32719 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c20738yM57042a.pickerEntryResponseByScreenId : linkedHashMap3, (32719 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c20738yM57042a.skippedScreenIds : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final C20738y m56991r(C20738y c20738y, List<PersonalIntakeFieldError> list) {
        VideoSchedulingIntakeScreen videoSchedulingIntakeScreen;
        Object next;
        List<VideoSchedulingIntakeScreen> intakeScreens;
        Object next2;
        VideoSchedulingIntakeResponse response = c20738y.getResponse();
        if (response == null || (intakeScreens = response.getIntakeScreens()) == null) {
            videoSchedulingIntakeScreen = null;
        } else {
            Iterator<T> it = intakeScreens.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (!AbstractC22676k.m65745e(((VideoSchedulingIntakeScreen) next2).getId(), c20738y.getCurrentScreenId()));
            videoSchedulingIntakeScreen = (VideoSchedulingIntakeScreen) next2;
        }
        InterfaceC16013c content = videoSchedulingIntakeScreen != null ? videoSchedulingIntakeScreen.getContent() : null;
        PersonalIntakeScreen personalIntakeScreen = content instanceof PersonalIntakeScreen ? (PersonalIntakeScreen) content : null;
        if (personalIntakeScreen == null || list.isEmpty()) {
            return c20738y.m57042a((32719 & 1) != 0 ? c20738y.currentDialogType : InterfaceC20737x.c.f77814a, (32719 & 2) != 0 ? c20738y.response : null, (32719 & 4) != 0 ? c20738y.currentScreenId : null, (32719 & 8) != 0 ? c20738y.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32719 & 16) != 0 ? c20738y.lastScreenIndex : 0, (32719 & 32) != 0 ? c20738y.currentScreenIndex : 0, (32719 & 64) != 0 ? c20738y.appointmentType : null, (32719 & 128) != 0 ? c20738y.intakeType : null, (32719 & 256) != 0 ? c20738y.appointmentId : null, (32719 & 512) != 0 ? c20738y.stateSelectSelectedId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c20738y.intakeResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c20738y.personalIntakeResponses : null, (32719 & 4096) != 0 ? c20738y.textEntryResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c20738y.pickerEntryResponseByScreenId : null, (32719 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c20738y.skippedScreenIds : null);
        }
        PersonalIntakeForm personalIntakeForm = personalIntakeScreen.getPersonalIntakeForm();
        C20734u personalIntakeResponses = c20738y.getPersonalIntakeResponses();
        for (PersonalIntakeFieldError personalIntakeFieldError : list) {
            Iterator<E> it3 = EnumC20735v.getEntries().iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!AbstractC22676k.m65745e(AbstractC20730q.m57008a(personalIntakeForm, (EnumC20735v) next).getId(), personalIntakeFieldError.getId()));
            EnumC20735v enumC20735v = (EnumC20735v) next;
            if (enumC20735v == null) {
                this.logger.mo85226q(AbstractC11895b.m31996o("applyFieldErrors: unknown field id '", personalIntakeFieldError.getId(), "'; skipping"), new AbstractC30556a.a[0]);
            } else {
                personalIntakeResponses = personalIntakeResponses.m57036r(enumC20735v, personalIntakeFieldError.getErrorMessage());
            }
        }
        return c20738y.m57042a((32719 & 1) != 0 ? c20738y.currentDialogType : null, (32719 & 2) != 0 ? c20738y.response : null, (32719 & 4) != 0 ? c20738y.currentScreenId : null, (32719 & 8) != 0 ? c20738y.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32719 & 16) != 0 ? c20738y.lastScreenIndex : 0, (32719 & 32) != 0 ? c20738y.currentScreenIndex : 0, (32719 & 64) != 0 ? c20738y.appointmentType : null, (32719 & 128) != 0 ? c20738y.intakeType : null, (32719 & 256) != 0 ? c20738y.appointmentId : null, (32719 & 512) != 0 ? c20738y.stateSelectSelectedId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c20738y.intakeResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c20738y.personalIntakeResponses : personalIntakeResponses, (32719 & 4096) != 0 ? c20738y.textEntryResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c20738y.pickerEntryResponseByScreenId : null, (32719 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c20738y.skippedScreenIds : null);
    }

    /* JADX INFO: renamed from: t */
    private final C20738y m56992t(C20738y c20738y, AbstractC20728o.e eVar) {
        List<VideoSchedulingIntakeScreen> intakeScreens;
        Object next;
        StateSelector stateSelector;
        SelectableCellListModel states;
        List<SelectableCellModel> cells;
        String stateId = eVar.getStateId();
        if (stateId == null) {
            return c20738y.m57042a((32719 & 1) != 0 ? c20738y.currentDialogType : null, (32719 & 2) != 0 ? c20738y.response : null, (32719 & 4) != 0 ? c20738y.currentScreenId : null, (32719 & 8) != 0 ? c20738y.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32719 & 16) != 0 ? c20738y.lastScreenIndex : 0, (32719 & 32) != 0 ? c20738y.currentScreenIndex : 0, (32719 & 64) != 0 ? c20738y.appointmentType : null, (32719 & 128) != 0 ? c20738y.intakeType : null, (32719 & 256) != 0 ? c20738y.appointmentId : null, (32719 & 512) != 0 ? c20738y.stateSelectSelectedId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c20738y.intakeResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c20738y.personalIntakeResponses : null, (32719 & 4096) != 0 ? c20738y.textEntryResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c20738y.pickerEntryResponseByScreenId : null, (32719 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c20738y.skippedScreenIds : null);
        }
        VideoSchedulingIntakeResponse response = c20738y.getResponse();
        if (response != null && (intakeScreens = response.getIntakeScreens()) != null) {
            Iterator<T> it = intakeScreens.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC22676k.m65745e(((VideoSchedulingIntakeScreen) next).getId(), c20738y.getCurrentScreenId()));
            VideoSchedulingIntakeScreen videoSchedulingIntakeScreen = (VideoSchedulingIntakeScreen) next;
            if (videoSchedulingIntakeScreen != null) {
                InterfaceC16013c content = videoSchedulingIntakeScreen.getContent();
                StateSelectScreen stateSelectScreen = content instanceof StateSelectScreen ? (StateSelectScreen) content : null;
                if (stateSelectScreen != null && (stateSelector = stateSelectScreen.getStateSelector()) != null && (states = stateSelector.getStates()) != null && (cells = states.getCells()) != null) {
                    List<SelectableCellModel> list = cells;
                    ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                    Iterator<T> it3 = list.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(((SelectableCellModel) it3.next()).getId());
                    }
                    if (AbstractC25265s.m74103I1(arrayList).contains(stateId)) {
                        return c20738y.m57042a((32719 & 1) != 0 ? c20738y.currentDialogType : null, (32719 & 2) != 0 ? c20738y.response : null, (32719 & 4) != 0 ? c20738y.currentScreenId : null, (32719 & 8) != 0 ? c20738y.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32719 & 16) != 0 ? c20738y.lastScreenIndex : 0, (32719 & 32) != 0 ? c20738y.currentScreenIndex : 0, (32719 & 64) != 0 ? c20738y.appointmentType : null, (32719 & 128) != 0 ? c20738y.intakeType : null, (32719 & 256) != 0 ? c20738y.appointmentId : null, (32719 & 512) != 0 ? c20738y.stateSelectSelectedId : stateId, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c20738y.intakeResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c20738y.personalIntakeResponses : null, (32719 & 4096) != 0 ? c20738y.textEntryResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c20738y.pickerEntryResponseByScreenId : null, (32719 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c20738y.skippedScreenIds : null);
                    }
                }
            }
        }
        return c20738y;
    }

    /* JADX INFO: renamed from: u */
    private final C20738y m56993u(C20738y c20738y, AbstractC20728o.f fVar) {
        VideoSchedulingIntakeScreen videoSchedulingIntakeScreen;
        Object next;
        List<VideoSchedulingIntakeScreen> intakeScreens;
        Object next2;
        String currentScreenId = c20738y.getCurrentScreenId();
        boolean z4 = false;
        if (currentScreenId == null) {
            this.logger.mo85226q("SetMultiSelectSelectedIds: no current screen; ignoring", new AbstractC30556a.a[0]);
            return c20738y;
        }
        VideoSchedulingIntakeResponse response = c20738y.getResponse();
        if (response == null || (intakeScreens = response.getIntakeScreens()) == null) {
            videoSchedulingIntakeScreen = null;
        } else {
            Iterator<T> it = intakeScreens.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (!AbstractC22676k.m65745e(((VideoSchedulingIntakeScreen) next2).getId(), currentScreenId));
            videoSchedulingIntakeScreen = (VideoSchedulingIntakeScreen) next2;
        }
        if (videoSchedulingIntakeScreen == null) {
            this.logger.mo85226q("SetMultiSelectSelectedIds: unknown screen; ignoring", new AbstractC30556a.a[0]);
            return c20738y;
        }
        if (!(videoSchedulingIntakeScreen.getContent() instanceof MultiSelectScreen)) {
            this.logger.mo85226q("SetMultiSelectSelectedIds: not multi-select screen; ignoring", new AbstractC30556a.a[0]);
            return c20738y;
        }
        SelectableCellListModel selectableCellList = ((MultiSelectScreen) videoSchedulingIntakeScreen.getContent()).getSelectableCellList();
        List<SelectableCellModel> cells = selectableCellList.getCells();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(cells, 10));
        Iterator<T> it3 = cells.iterator();
        while (it3.hasNext()) {
            arrayList.add(((SelectableCellModel) it3.next()).getId());
        }
        Set setM74103I1 = AbstractC25265s.m74103I1(arrayList);
        List<String> listM56953a = fVar.m56953a();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listM56953a) {
            if (setM74103I1.contains((String) obj)) {
                arrayList2.add(obj);
            }
        }
        Set setM74103I2 = AbstractC25265s.m74103I1(arrayList2);
        Iterator<T> it4 = selectableCellList.getCells().iterator();
        do {
            if (!it4.hasNext()) {
                next = null;
                break;
            }
            next = it4.next();
        } while (!AbstractC39421y.m125921F(((SelectableCellModel) next).getId(), "OTHER", true));
        SelectableCellModel selectableCellModel = (SelectableCellModel) next;
        String id4 = selectableCellModel != null ? selectableCellModel.getId() : null;
        if (id4 != null && !setM74103I2.contains(id4)) {
            z4 = true;
        }
        VideoSchedulingIntakeMultiSelectResponseBody videoSchedulingIntakeMultiSelectResponseBody = c20738y.m57049i().get(currentScreenId);
        if (videoSchedulingIntakeMultiSelectResponseBody == null) {
            videoSchedulingIntakeMultiSelectResponseBody = new VideoSchedulingIntakeMultiSelectResponseBody(C25271y.f99162w, null);
        }
        return c20738y.m57042a((32719 & 1) != 0 ? c20738y.currentDialogType : null, (32719 & 2) != 0 ? c20738y.response : null, (32719 & 4) != 0 ? c20738y.currentScreenId : null, (32719 & 8) != 0 ? c20738y.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32719 & 16) != 0 ? c20738y.lastScreenIndex : 0, (32719 & 32) != 0 ? c20738y.currentScreenIndex : 0, (32719 & 64) != 0 ? c20738y.appointmentType : null, (32719 & 128) != 0 ? c20738y.intakeType : null, (32719 & 256) != 0 ? c20738y.appointmentId : null, (32719 & 512) != 0 ? c20738y.stateSelectSelectedId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c20738y.intakeResponsesByScreenId : AbstractC25247g0.m73996e0(c20738y.m57049i(), new C23465k(currentScreenId, new VideoSchedulingIntakeMultiSelectResponseBody(AbstractC25265s.m74093D1(setM74103I2), z4 ? null : videoSchedulingIntakeMultiSelectResponseBody.getText()))), (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c20738y.personalIntakeResponses : null, (32719 & 4096) != 0 ? c20738y.textEntryResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c20738y.pickerEntryResponseByScreenId : null, (32719 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c20738y.skippedScreenIds : null);
    }

    /* JADX INFO: renamed from: v */
    private final C20738y m56994v(C20738y c20738y) {
        VideoSchedulingIntakeResponse response = c20738y.getResponse();
        List<VideoSchedulingIntakeScreen> intakeScreens = response != null ? response.getIntakeScreens() : null;
        if (intakeScreens == null) {
            intakeScreens = C25271y.f99162w;
        }
        Iterator<VideoSchedulingIntakeScreen> it = intakeScreens.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            if (AbstractC22676k.m65745e(it.next().getId(), c20738y.getCurrentScreenId())) {
                break;
            }
            i13++;
        }
        if (intakeScreens.isEmpty()) {
            this.logger.mo85226q("StepBack: intakeScreens empty; emitting GoBack", new AbstractC30556a.a[0]);
            return c20738y.m57042a((32719 & 1) != 0 ? c20738y.currentDialogType : null, (32719 & 2) != 0 ? c20738y.response : null, (32719 & 4) != 0 ? c20738y.currentScreenId : null, (32719 & 8) != 0 ? c20738y.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : InterfaceC24615z.b.f96222a, (32719 & 16) != 0 ? c20738y.lastScreenIndex : 0, (32719 & 32) != 0 ? c20738y.currentScreenIndex : 0, (32719 & 64) != 0 ? c20738y.appointmentType : null, (32719 & 128) != 0 ? c20738y.intakeType : null, (32719 & 256) != 0 ? c20738y.appointmentId : null, (32719 & 512) != 0 ? c20738y.stateSelectSelectedId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c20738y.intakeResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c20738y.personalIntakeResponses : null, (32719 & 4096) != 0 ? c20738y.textEntryResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c20738y.pickerEntryResponseByScreenId : null, (32719 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c20738y.skippedScreenIds : null);
        }
        if (c20738y.getCurrentScreenId() == null) {
            this.logger.mo85226q("StepBack: currentScreenId null; emitting GoBack", new AbstractC30556a.a[0]);
            return c20738y.m57042a((32719 & 1) != 0 ? c20738y.currentDialogType : null, (32719 & 2) != 0 ? c20738y.response : null, (32719 & 4) != 0 ? c20738y.currentScreenId : null, (32719 & 8) != 0 ? c20738y.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : InterfaceC24615z.b.f96222a, (32719 & 16) != 0 ? c20738y.lastScreenIndex : 0, (32719 & 32) != 0 ? c20738y.currentScreenIndex : 0, (32719 & 64) != 0 ? c20738y.appointmentType : null, (32719 & 128) != 0 ? c20738y.intakeType : null, (32719 & 256) != 0 ? c20738y.appointmentId : null, (32719 & 512) != 0 ? c20738y.stateSelectSelectedId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c20738y.intakeResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c20738y.personalIntakeResponses : null, (32719 & 4096) != 0 ? c20738y.textEntryResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c20738y.pickerEntryResponseByScreenId : null, (32719 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c20738y.skippedScreenIds : null);
        }
        if (i13 < 0) {
            this.logger.mo85226q(AbstractC30007c.m91838h(intakeScreens.size(), "StepBack: currentScreenId not in intakeScreens (screenCount=", ", currentScreenId=", c20738y.getCurrentScreenId(), "); emitting GoBack"), new AbstractC30556a.a[0]);
            return c20738y.m57042a((32719 & 1) != 0 ? c20738y.currentDialogType : null, (32719 & 2) != 0 ? c20738y.response : null, (32719 & 4) != 0 ? c20738y.currentScreenId : null, (32719 & 8) != 0 ? c20738y.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : InterfaceC24615z.b.f96222a, (32719 & 16) != 0 ? c20738y.lastScreenIndex : 0, (32719 & 32) != 0 ? c20738y.currentScreenIndex : 0, (32719 & 64) != 0 ? c20738y.appointmentType : null, (32719 & 128) != 0 ? c20738y.intakeType : null, (32719 & 256) != 0 ? c20738y.appointmentId : null, (32719 & 512) != 0 ? c20738y.stateSelectSelectedId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c20738y.intakeResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c20738y.personalIntakeResponses : null, (32719 & 4096) != 0 ? c20738y.textEntryResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c20738y.pickerEntryResponseByScreenId : null, (32719 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c20738y.skippedScreenIds : null);
        }
        if (i13 == 0) {
            return c20738y.m57042a((32719 & 1) != 0 ? c20738y.currentDialogType : null, (32719 & 2) != 0 ? c20738y.response : null, (32719 & 4) != 0 ? c20738y.currentScreenId : null, (32719 & 8) != 0 ? c20738y.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : InterfaceC24615z.b.f96222a, (32719 & 16) != 0 ? c20738y.lastScreenIndex : 0, (32719 & 32) != 0 ? c20738y.currentScreenIndex : 0, (32719 & 64) != 0 ? c20738y.appointmentType : null, (32719 & 128) != 0 ? c20738y.intakeType : null, (32719 & 256) != 0 ? c20738y.appointmentId : null, (32719 & 512) != 0 ? c20738y.stateSelectSelectedId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c20738y.intakeResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c20738y.personalIntakeResponses : null, (32719 & 4096) != 0 ? c20738y.textEntryResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c20738y.pickerEntryResponseByScreenId : null, (32719 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c20738y.skippedScreenIds : null);
        }
        String id4 = intakeScreens.get(i13 - 1).getId();
        return c20738y.m57042a((32719 & 1) != 0 ? c20738y.currentDialogType : null, (32719 & 2) != 0 ? c20738y.response : null, (32719 & 4) != 0 ? c20738y.currentScreenId : id4, (32719 & 8) != 0 ? c20738y.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32719 & 16) != 0 ? c20738y.lastScreenIndex : 0, (32719 & 32) != 0 ? c20738y.currentScreenIndex : 0, (32719 & 64) != 0 ? c20738y.appointmentType : null, (32719 & 128) != 0 ? c20738y.intakeType : null, (32719 & 256) != 0 ? c20738y.appointmentId : null, (32719 & 512) != 0 ? c20738y.stateSelectSelectedId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c20738y.intakeResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c20738y.personalIntakeResponses : null, (32719 & 4096) != 0 ? c20738y.textEntryResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c20738y.pickerEntryResponseByScreenId : null, (32719 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c20738y.skippedScreenIds : AbstractC12350b.m34604y(id4, c20738y.m57055o()));
    }

    /* JADX INFO: renamed from: w */
    private final C20738y m56995w(C20738y c20738y) {
        VideoSchedulingIntakeResponse response = c20738y.getResponse();
        List<VideoSchedulingIntakeScreen> intakeScreens = response != null ? response.getIntakeScreens() : null;
        if (intakeScreens == null) {
            intakeScreens = C25271y.f99162w;
        }
        Iterator<VideoSchedulingIntakeScreen> it = intakeScreens.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            if (AbstractC22676k.m65745e(it.next().getId(), c20738y.getCurrentScreenId())) {
                break;
            }
            i13++;
        }
        if (i13 < 0) {
            this.logger.mo85226q(AbstractC30007c.m91838h(intakeScreens.size(), "StepForward: currentScreenId not in intakeScreens (screenCount=", ", currentScreenId=", c20738y.getCurrentScreenId(), ")"), new AbstractC30556a.a[0]);
            return c20738y;
        }
        if (AbstractC22676k.m65745e(c20738y.getIntakeType(), "HEALTH")) {
            String appointmentId = c20738y.getAppointmentId();
            if (appointmentId != null && appointmentId.length() != 0) {
                return c20738y.m57042a((32719 & 1) != 0 ? c20738y.currentDialogType : null, (32719 & 2) != 0 ? c20738y.response : null, (32719 & 4) != 0 ? c20738y.currentScreenId : null, (32719 & 8) != 0 ? c20738y.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : new InterfaceC24615z.i(c20738y.getAppointmentId(), m56968D(c20738y, intakeScreens, i13)), (32719 & 16) != 0 ? c20738y.lastScreenIndex : 0, (32719 & 32) != 0 ? c20738y.currentScreenIndex : 0, (32719 & 64) != 0 ? c20738y.appointmentType : null, (32719 & 128) != 0 ? c20738y.intakeType : null, (32719 & 256) != 0 ? c20738y.appointmentId : null, (32719 & 512) != 0 ? c20738y.stateSelectSelectedId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c20738y.intakeResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c20738y.personalIntakeResponses : null, (32719 & 4096) != 0 ? c20738y.textEntryResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c20738y.pickerEntryResponseByScreenId : null, (32719 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c20738y.skippedScreenIds : null);
            }
            this.logger.mo85222m("StepForward: HEALTH intake but appointmentId is null or empty", new AbstractC30556a.a[0]);
            return c20738y.m57042a((32719 & 1) != 0 ? c20738y.currentDialogType : InterfaceC20737x.d.f77815a, (32719 & 2) != 0 ? c20738y.response : null, (32719 & 4) != 0 ? c20738y.currentScreenId : null, (32719 & 8) != 0 ? c20738y.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32719 & 16) != 0 ? c20738y.lastScreenIndex : 0, (32719 & 32) != 0 ? c20738y.currentScreenIndex : 0, (32719 & 64) != 0 ? c20738y.appointmentType : null, (32719 & 128) != 0 ? c20738y.intakeType : null, (32719 & 256) != 0 ? c20738y.appointmentId : null, (32719 & 512) != 0 ? c20738y.stateSelectSelectedId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c20738y.intakeResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c20738y.personalIntakeResponses : null, (32719 & 4096) != 0 ? c20738y.textEntryResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c20738y.pickerEntryResponseByScreenId : null, (32719 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c20738y.skippedScreenIds : null);
        }
        if (i13 < AbstractC37056f.m118951C(intakeScreens)) {
            return m56989p(this, c20738y, false, 1, null);
        }
        this.analyticsHelper.m56904c(c20738y.getAppointmentType());
        String appointmentType = c20738y.getAppointmentType();
        if (AbstractC22676k.m65745e(appointmentType, "SCHEDULED_AHEAD")) {
            return c20738y.m57042a((32719 & 1) != 0 ? c20738y.currentDialogType : null, (32719 & 2) != 0 ? c20738y.response : null, (32719 & 4) != 0 ? c20738y.currentScreenId : null, (32719 & 8) != 0 ? c20738y.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : new InterfaceC24615z.f(c20738y.getStateSelectSelectedId(), AbstractC20714a0.m56906b(intakeScreens, c20738y.m57049i()), c20738y.getAppointmentId()), (32719 & 16) != 0 ? c20738y.lastScreenIndex : 0, (32719 & 32) != 0 ? c20738y.currentScreenIndex : 0, (32719 & 64) != 0 ? c20738y.appointmentType : null, (32719 & 128) != 0 ? c20738y.intakeType : null, (32719 & 256) != 0 ? c20738y.appointmentId : null, (32719 & 512) != 0 ? c20738y.stateSelectSelectedId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c20738y.intakeResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c20738y.personalIntakeResponses : null, (32719 & 4096) != 0 ? c20738y.textEntryResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c20738y.pickerEntryResponseByScreenId : null, (32719 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c20738y.skippedScreenIds : null);
        }
        if (!AbstractC22676k.m65745e(appointmentType, "ON_DEMAND")) {
            throw new IllegalStateException(AbstractC11895b.m31996o("StepForward: last intake screen reached for unknown appointmentType=", c20738y.getAppointmentType(), " (expected SCHEDULED_AHEAD or ON_DEMAND)"));
        }
        String stateSelectSelectedId = c20738y.getStateSelectSelectedId();
        if (stateSelectSelectedId == null) {
            stateSelectSelectedId = "";
        }
        return c20738y.m57042a((32719 & 1) != 0 ? c20738y.currentDialogType : null, (32719 & 2) != 0 ? c20738y.response : null, (32719 & 4) != 0 ? c20738y.currentScreenId : null, (32719 & 8) != 0 ? c20738y.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : new InterfaceC24615z.h(AbstractC20714a0.m56906b(intakeScreens, c20738y.m57049i()), stateSelectSelectedId), (32719 & 16) != 0 ? c20738y.lastScreenIndex : 0, (32719 & 32) != 0 ? c20738y.currentScreenIndex : 0, (32719 & 64) != 0 ? c20738y.appointmentType : null, (32719 & 128) != 0 ? c20738y.intakeType : null, (32719 & 256) != 0 ? c20738y.appointmentId : null, (32719 & 512) != 0 ? c20738y.stateSelectSelectedId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c20738y.intakeResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c20738y.personalIntakeResponses : null, (32719 & 4096) != 0 ? c20738y.textEntryResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c20738y.pickerEntryResponseByScreenId : null, (32719 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c20738y.skippedScreenIds : null);
    }

    /* JADX INFO: renamed from: x */
    private final C20738y m56996x(C20738y c20738y, AbstractC20728o.j jVar) {
        VideoSchedulingIntakeScreen videoSchedulingIntakeScreen;
        List<VideoSchedulingIntakeScreen> intakeScreens;
        Object next;
        String currentScreenId = c20738y.getCurrentScreenId();
        if (currentScreenId == null) {
            this.logger.mo85226q("ToggleTextEntryCheckbox: no current screen; ignoring", new AbstractC30556a.a[0]);
            return c20738y;
        }
        VideoSchedulingIntakeResponse response = c20738y.getResponse();
        if (response == null || (intakeScreens = response.getIntakeScreens()) == null) {
            videoSchedulingIntakeScreen = null;
        } else {
            Iterator<T> it = intakeScreens.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC22676k.m65745e(((VideoSchedulingIntakeScreen) next).getId(), currentScreenId));
            videoSchedulingIntakeScreen = (VideoSchedulingIntakeScreen) next;
        }
        if (videoSchedulingIntakeScreen == null) {
            this.logger.mo85226q("ToggleTextEntryCheckbox: unknown screen; ignoring", new AbstractC30556a.a[0]);
            return c20738y;
        }
        InterfaceC16013c content = videoSchedulingIntakeScreen.getContent();
        TextEntryScreen textEntryScreen = content instanceof TextEntryScreen ? (TextEntryScreen) content : null;
        if (textEntryScreen == null) {
            this.logger.mo85226q("ToggleTextEntryCheckbox: not text entry screen; ignoring", new AbstractC30556a.a[0]);
            return c20738y;
        }
        if (textEntryScreen.getCheckbox() == null) {
            this.logger.mo85226q("ToggleTextEntryCheckbox: screen has no checkbox; ignoring", new AbstractC30556a.a[0]);
            return c20738y;
        }
        C20736w c20736w = c20738y.m57057q().get(currentScreenId);
        if (c20736w == null) {
            c20736w = new C20736w(null, null, 3, null);
        }
        return c20738y.m57042a((32719 & 1) != 0 ? c20738y.currentDialogType : null, (32719 & 2) != 0 ? c20738y.response : null, (32719 & 4) != 0 ? c20738y.currentScreenId : null, (32719 & 8) != 0 ? c20738y.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32719 & 16) != 0 ? c20738y.lastScreenIndex : 0, (32719 & 32) != 0 ? c20738y.currentScreenIndex : 0, (32719 & 64) != 0 ? c20738y.appointmentType : null, (32719 & 128) != 0 ? c20738y.intakeType : null, (32719 & 256) != 0 ? c20738y.appointmentId : null, (32719 & 512) != 0 ? c20738y.stateSelectSelectedId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c20738y.intakeResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c20738y.personalIntakeResponses : null, (32719 & 4096) != 0 ? c20738y.textEntryResponsesByScreenId : AbstractC25247g0.m73996e0(c20738y.m57057q(), new C23465k(currentScreenId, C20736w.m57037b(c20736w, null, Boolean.valueOf(jVar.getIsSelected()), 1, null))), (32719 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c20738y.pickerEntryResponseByScreenId : null, (32719 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c20738y.skippedScreenIds : null);
    }

    /* JADX INFO: renamed from: y */
    private final C20738y m56997y(C20738y c20738y, AbstractC20728o.k kVar) {
        List<VideoSchedulingIntakeScreen> intakeScreens;
        Object next;
        String currentScreenId = c20738y.getCurrentScreenId();
        if (currentScreenId == null) {
            this.logger.mo85226q("HeightWeightSelection: no current screen; ignoring", new AbstractC30556a.a[0]);
            return c20738y;
        }
        VideoSchedulingIntakeResponse response = c20738y.getResponse();
        if (response != null && (intakeScreens = response.getIntakeScreens()) != null) {
            Iterator<T> it = intakeScreens.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC22676k.m65745e(((VideoSchedulingIntakeScreen) next).getId(), currentScreenId));
            VideoSchedulingIntakeScreen videoSchedulingIntakeScreen = (VideoSchedulingIntakeScreen) next;
            if (videoSchedulingIntakeScreen != null) {
                if (!(videoSchedulingIntakeScreen.getContent() instanceof HeightWeightScreen)) {
                    this.logger.mo85226q("HeightWeightSelection: unknown content; ignoring", new AbstractC30556a.a[0]);
                    return c20738y;
                }
                C20733t c20733t = c20738y.m57053m().get(currentScreenId);
                if (c20733t == null) {
                    c20733t = new C20733t(null, null, null, 7, null);
                }
                Integer weight = kVar.getWeight();
                if (weight == null) {
                    weight = c20733t.getWeight();
                }
                Integer height = kVar.getHeight();
                if (height == null) {
                    height = c20733t.getHeight();
                }
                return c20738y.m57042a((32719 & 1) != 0 ? c20738y.currentDialogType : null, (32719 & 2) != 0 ? c20738y.response : null, (32719 & 4) != 0 ? c20738y.currentScreenId : null, (32719 & 8) != 0 ? c20738y.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32719 & 16) != 0 ? c20738y.lastScreenIndex : 0, (32719 & 32) != 0 ? c20738y.currentScreenIndex : 0, (32719 & 64) != 0 ? c20738y.appointmentType : null, (32719 & 128) != 0 ? c20738y.intakeType : null, (32719 & 256) != 0 ? c20738y.appointmentId : null, (32719 & 512) != 0 ? c20738y.stateSelectSelectedId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c20738y.intakeResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c20738y.personalIntakeResponses : null, (32719 & 4096) != 0 ? c20738y.textEntryResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c20738y.pickerEntryResponseByScreenId : AbstractC25247g0.m73996e0(c20738y.m57053m(), new C23465k(currentScreenId, c20733t.m57015a(weight, height, kVar.getUnit().toName()))), (32719 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c20738y.skippedScreenIds : null);
            }
        }
        this.logger.mo85226q("HeightWeightSelection: unknown screen; ignoring", new AbstractC30556a.a[0]);
        return c20738y;
    }

    /* JADX INFO: renamed from: z */
    private final C20738y m56998z(C20738y c20738y, AbstractC20728o.l lVar) {
        VideoSchedulingIntakeScreen videoSchedulingIntakeScreen;
        List<VideoSchedulingIntakeScreen> intakeScreens;
        Object next;
        String currentScreenId = c20738y.getCurrentScreenId();
        if (currentScreenId == null) {
            this.logger.mo85226q("UpdateMultiSelectTextInput: no current screen; ignoring", new AbstractC30556a.a[0]);
            return c20738y;
        }
        VideoSchedulingIntakeResponse response = c20738y.getResponse();
        if (response == null || (intakeScreens = response.getIntakeScreens()) == null) {
            videoSchedulingIntakeScreen = null;
        } else {
            Iterator<T> it = intakeScreens.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC22676k.m65745e(((VideoSchedulingIntakeScreen) next).getId(), currentScreenId));
            videoSchedulingIntakeScreen = (VideoSchedulingIntakeScreen) next;
        }
        if (videoSchedulingIntakeScreen == null) {
            this.logger.mo85226q("UpdateMultiSelectTextInput: unknown screen; ignoring", new AbstractC30556a.a[0]);
            return c20738y;
        }
        InterfaceC16013c content = videoSchedulingIntakeScreen.getContent();
        MultiSelectScreen multiSelectScreen = content instanceof MultiSelectScreen ? (MultiSelectScreen) content : null;
        if (multiSelectScreen == null) {
            this.logger.mo85226q("UpdateMultiSelectTextInput: not multi-select screen; ignoring", new AbstractC30556a.a[0]);
            return c20738y;
        }
        if (multiSelectScreen.getTextInput() == null) {
            this.logger.mo85226q("UpdateMultiSelectTextInput: no text input; ignoring", new AbstractC30556a.a[0]);
            return c20738y;
        }
        VideoSchedulingIntakeMultiSelectResponseBody videoSchedulingIntakeMultiSelectResponseBody = c20738y.m57049i().get(currentScreenId);
        if (videoSchedulingIntakeMultiSelectResponseBody == null) {
            videoSchedulingIntakeMultiSelectResponseBody = new VideoSchedulingIntakeMultiSelectResponseBody(C25271y.f99162w, null);
        }
        return c20738y.m57042a((32719 & 1) != 0 ? c20738y.currentDialogType : null, (32719 & 2) != 0 ? c20738y.response : null, (32719 & 4) != 0 ? c20738y.currentScreenId : null, (32719 & 8) != 0 ? c20738y.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32719 & 16) != 0 ? c20738y.lastScreenIndex : 0, (32719 & 32) != 0 ? c20738y.currentScreenIndex : 0, (32719 & 64) != 0 ? c20738y.appointmentType : null, (32719 & 128) != 0 ? c20738y.intakeType : null, (32719 & 256) != 0 ? c20738y.appointmentId : null, (32719 & 512) != 0 ? c20738y.stateSelectSelectedId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c20738y.intakeResponsesByScreenId : AbstractC25247g0.m73996e0(c20738y.m57049i(), new C23465k(currentScreenId, VideoSchedulingIntakeMultiSelectResponseBody.copy$default(videoSchedulingIntakeMultiSelectResponseBody, null, lVar.getText(), 1, null))), (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c20738y.personalIntakeResponses : null, (32719 & 4096) != 0 ? c20738y.textEntryResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c20738y.pickerEntryResponseByScreenId : null, (32719 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c20738y.skippedScreenIds : null);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36612v(new C13060l1(new C20738y(InterfaceC20737x.b.f77813a, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, 32766, null), AbstractC13091v.m36590P(upstream, new d(null, this)), new e(null)), 1);
    }

    /* JADX INFO: renamed from: s */
    public final C20738y m56999s(C20738y c20738y, AbstractC20728o action) {
        C20738y c20738yM57042a;
        C20738y c20738y2 = c20738y;
        AbstractC22676k.m65750j(c20738y2, "<this>");
        AbstractC22676k.m65750j(action, "action");
        if (action.equals(AbstractC20728o.h.f77697a)) {
            return m56994v(c20738y);
        }
        if (action.equals(AbstractC20728o.i.f77698a)) {
            return m56995w(c20738y);
        }
        if (action.equals(AbstractC20728o.g.f77696a)) {
            String currentScreenId = c20738y2.getCurrentScreenId();
            if (currentScreenId != null && (c20738yM57042a = c20738y2.m57042a((32719 & 1) != 0 ? c20738y2.currentDialogType : null, (32719 & 2) != 0 ? c20738y2.response : null, (32719 & 4) != 0 ? c20738y2.currentScreenId : null, (32719 & 8) != 0 ? c20738y2.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32719 & 16) != 0 ? c20738y2.lastScreenIndex : 0, (32719 & 32) != 0 ? c20738y2.currentScreenIndex : 0, (32719 & 64) != 0 ? c20738y2.appointmentType : null, (32719 & 128) != 0 ? c20738y2.intakeType : null, (32719 & 256) != 0 ? c20738y2.appointmentId : null, (32719 & 512) != 0 ? c20738y2.stateSelectSelectedId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c20738y2.intakeResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c20738y2.personalIntakeResponses : null, (32719 & 4096) != 0 ? c20738y2.textEntryResponsesByScreenId : null, (32719 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c20738y2.pickerEntryResponseByScreenId : null, (32719 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c20738y2.skippedScreenIds : AbstractC12350b.m34555D(currentScreenId, c20738y2.m57055o()))) != null) {
                c20738y2 = c20738yM57042a;
            }
            return m56989p(this, c20738y2, false, 1, null);
        }
        if (action instanceof AbstractC20728o.e) {
            return m56992t(c20738y2, (AbstractC20728o.e) action);
        }
        if (action instanceof AbstractC20728o.f) {
            return m56993u(c20738y2, (AbstractC20728o.f) action);
        }
        if (action instanceof AbstractC20728o.l) {
            return m56998z(c20738y2, (AbstractC20728o.l) action);
        }
        if (action instanceof AbstractC20728o.m) {
            return m56965A(c20738y2, (AbstractC20728o.m) action);
        }
        if (action instanceof AbstractC20728o.o) {
            return m56967C(c20738y2, (AbstractC20728o.o) action);
        }
        if (action instanceof AbstractC20728o.n) {
            return m56966B(c20738y2, (AbstractC20728o.n) action);
        }
        if (action instanceof AbstractC20728o.j) {
            return m56996x(c20738y2, (AbstractC20728o.j) action);
        }
        if (action instanceof AbstractC20728o.k) {
            return m56997y(c20738y2, (AbstractC20728o.k) action);
        }
        if (!(action instanceof AbstractC20728o.a) && !(action instanceof AbstractC20728o.b) && !(action instanceof AbstractC20728o.d) && !(action instanceof AbstractC20728o.c)) {
            throw new NoWhenBranchMatchedException();
        }
        this.logger.mo85222m(AbstractC11895b.m31996o("applyHandleDomainAction: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(action.getClass()).getSimpleName(), " should not reach here"), new AbstractC30556a.a[0]);
        return c20738y2;
    }

    public /* synthetic */ C20729p(InterfaceC26834e interfaceC26834e, VideoSchedulingIntakeApi videoSchedulingIntakeApi, C20713a c20713a, C20732s c20732s, C36684a c36684a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC26834e, videoSchedulingIntakeApi, c20713a, (i13 & 8) != 0 ? new C20732s(null, 1, null) : c20732s, (i13 & 16) != 0 ? new C36684a(null, null, 3, null) : c36684a, (i13 & 32) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ClinicianVideoSchedulingIntakeInteractor") : interfaceC34116n);
    }
}
