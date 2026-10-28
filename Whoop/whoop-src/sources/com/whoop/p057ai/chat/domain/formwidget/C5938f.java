package com.whoop.p057ai.chat.domain.formwidget;

import ad3.AbstractC0757c;
import bc3.AbstractC3006f0;
import bc3.C3075y1;
import bc3.InterfaceC2994c0;
import c91.AbstractC4328b;
import c93.InterfaceC4351m;
import com.whoop.bot.api.SubmitFormApi;
import com.whoop.bot.models.conversation.FormQuestionModel;
import com.whoop.bot.models.conversation.FormWidgetModel;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.Request;
import com.whoop.whoopaction.domain.models.UpdateAction;
import ec3.AbstractC13091v;
import ec3.C13054k;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.JsonElement;
import l83.C23454a0;
import l83.C23465k;
import l83.C23467m;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import org.joda.time.DateTimeConstants;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p007a6.C0456u;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pg3.C29218v0;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import retrofit2.HttpException;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import u82.AbstractC34650k;
import ud3.AbstractC34799a1;
import wm0.C37378a;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u0000 a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004QSUOB/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J4\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00142\u001c\u0010\u0018\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0015H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00102\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010#\u001a\u0004\u0018\u00010\u001d2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b#\u0010$J\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00102\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00102\u0006\u0010&\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010+J\u0018\u0010,\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020%H\u0082@¢\u0006\u0004\b,\u0010-J \u00100\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020%2\u0006\u0010/\u001a\u00020.H\u0082@¢\u0006\u0004\b0\u00101J(\u00104\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020%2\u0006\u0010/\u001a\u00020.2\u0006\u00103\u001a\u000202H\u0082@¢\u0006\u0004\b4\u00105J)\u0010:\u001a\u0004\u0018\u00010.2\b\u0010&\u001a\u0004\u0018\u0001062\f\u00109\u001a\b\u0012\u0004\u0012\u00020807H\u0002¢\u0006\u0004\b:\u0010;J\u001b\u0010<\u001a\u0004\u0018\u0001022\b\u0010&\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0004\b<\u0010=J\u0013\u0010?\u001a\u00020>*\u000208H\u0002¢\u0006\u0004\b?\u0010@J'\u0010D\u001a\u00020\u001d2\u0006\u0010A\u001a\u00020\u001b2\u0006\u0010B\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020\u001bH\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020G*\u0006\u0012\u0002\b\u00030FH\u0002¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020\u001d*\u0006\u0012\u0002\b\u00030FH\u0002¢\u0006\u0004\bJ\u0010KJ\u001f\u0010M\u001a\u00020\u00032\u0006\u0010L\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u001dH\u0002¢\u0006\u0004\bM\u0010NR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\\\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010`\u001a\u00020]*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_¨\u0006b"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/f;", "Lod1/g;", "Lcom/whoop/ai/chat/domain/formwidget/c;", "Lcom/whoop/ai/chat/domain/formwidget/d;", "Lnm0/e;", "cachedApiSource", "Lcom/whoop/bot/api/SubmitFormApi;", "submitFormApi", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lwm0/a;", "scopeCoordinator", "Ltr2/n;", "logger", "<init>", "(Lnm0/e;Lcom/whoop/bot/api/SubmitFormApi;Lcom/whoop/data/repositories/FeatureFlagChecker;Lwm0/a;Ltr2/n;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "T", "Lkotlin/Function1;", "Lq83/d;", "", "block", "B", "(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;", "", "formKey", "Lcom/whoop/ai/chat/domain/formwidget/f$b;", "y", "(Ljava/lang/String;)Lec3/l;", "Lpm0/a;", "Lcom/whoop/design/models/DesignSystemModel;", "cacheResult", "u", "(Lpm0/a;Ljava/lang/String;)Lcom/whoop/ai/chat/domain/formwidget/f$b;", "Lcom/whoop/ai/chat/domain/formwidget/c$h;", "action", "C", "(Lcom/whoop/ai/chat/domain/formwidget/c$h;)Lec3/l;", "Lcom/whoop/ai/chat/domain/formwidget/c$d;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lcom/whoop/ai/chat/domain/formwidget/c$d;)Lec3/l;", "s", "(Lcom/whoop/ai/chat/domain/formwidget/c$h;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/ai/chat/domain/formwidget/f$c;", "answer", "r", "(Lcom/whoop/ai/chat/domain/formwidget/c$h;Lcom/whoop/ai/chat/domain/formwidget/f$c;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/ai/chat/domain/formwidget/f$d;", "complete", "q", "(Lcom/whoop/ai/chat/domain/formwidget/c$h;Lcom/whoop/ai/chat/domain/formwidget/f$c;Lcom/whoop/ai/chat/domain/formwidget/f$d;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/whoopaction/domain/models/Action;", "", "Lcom/whoop/ai/chat/domain/formwidget/h;", "selections", "z", "(Lcom/whoop/whoopaction/domain/models/Action;Ljava/util/List;)Lcom/whoop/ai/chat/domain/formwidget/f$c;", "A", "(Lcom/whoop/whoopaction/domain/models/Action;)Lcom/whoop/ai/chat/domain/formwidget/f$d;", "Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest$Answer;", "D", "(Lcom/whoop/ai/chat/domain/formwidget/h;)Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest$Answer;", "field", "formId", "questionId", "v", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/ai/chat/domain/formwidget/f$b;", "Lu02/a$b;", "Lc91/b;", "F", "(Lu02/a$b;)Lc91/b;", "E", "(Lu02/a$b;)Lcom/whoop/ai/chat/domain/formwidget/f$b;", "state", "x", "(Lcom/whoop/ai/chat/domain/formwidget/d;Lcom/whoop/ai/chat/domain/formwidget/f$b;)Lcom/whoop/ai/chat/domain/formwidget/d;", "a", "Lnm0/e;", "b", "Lcom/whoop/bot/api/SubmitFormApi;", "c", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "d", "Lwm0/a;", "e", "Ltr2/n;", "Lmc3/a;", "f", "Lmc3/a;", "writeMutex", "", "t", "(Lcom/whoop/ai/chat/domain/formwidget/d;)Z", "isUserInteracting", "g", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C5938f implements InterfaceC27844g<AbstractC5935c, C5936d> {

    /* JADX INFO: renamed from: h */
    public static final int f23303h = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final SubmitFormApi submitFormApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C37378a scopeCoordinator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC25435a writeMutex;

    /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0011\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0082\u0001\u0011\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/f$b;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "f", "g", "k", "q", "p", "l", "m", "n", "o", "d", "e", "b", "c", "a", "j", "Lcom/whoop/ai/chat/domain/formwidget/f$b$a;", "Lcom/whoop/ai/chat/domain/formwidget/f$b$b;", "Lcom/whoop/ai/chat/domain/formwidget/f$b$c;", "Lcom/whoop/ai/chat/domain/formwidget/f$b$d;", "Lcom/whoop/ai/chat/domain/formwidget/f$b$e;", "Lcom/whoop/ai/chat/domain/formwidget/f$b$f;", "Lcom/whoop/ai/chat/domain/formwidget/f$b$g;", "Lcom/whoop/ai/chat/domain/formwidget/f$b$h;", "Lcom/whoop/ai/chat/domain/formwidget/f$b$i;", "Lcom/whoop/ai/chat/domain/formwidget/f$b$j;", "Lcom/whoop/ai/chat/domain/formwidget/f$b$k;", "Lcom/whoop/ai/chat/domain/formwidget/f$b$l;", "Lcom/whoop/ai/chat/domain/formwidget/f$b$m;", "Lcom/whoop/ai/chat/domain/formwidget/f$b$n;", "Lcom/whoop/ai/chat/domain/formwidget/f$b$o;", "Lcom/whoop/ai/chat/domain/formwidget/f$b$p;", "Lcom/whoop/ai/chat/domain/formwidget/f$b$q;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface b {

        /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$b$a */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/f$b$a;", "Lcom/whoop/ai/chat/domain/formwidget/f$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class a implements b {

            /* JADX INFO: renamed from: a */
            public static final a f23310a = new a();

            private a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 1796545844;
            }

            public String toString() {
                return "ClearResult";
            }
        }

        /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$b$b, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/f$b$b;", "Lcom/whoop/ai/chat/domain/formwidget/f$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C41369b implements b {

            /* JADX INFO: renamed from: a */
            public static final C41369b f23311a = new C41369b();

            private C41369b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C41369b);
            }

            public int hashCode() {
                return 904746821;
            }

            public String toString() {
                return "GoBack";
            }
        }

        /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$b$c */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/f$b$c;", "Lcom/whoop/ai/chat/domain/formwidget/f$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class c implements b {

            /* JADX INFO: renamed from: a */
            public static final c f23312a = new c();

            private c() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 2062924711;
            }

            public String toString() {
                return "GoForward";
            }
        }

        /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$b$d */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/f$b$d;", "Lcom/whoop/ai/chat/domain/formwidget/f$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class d implements b {

            /* JADX INFO: renamed from: a */
            public static final d f23313a = new d();

            private d() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return -1177201001;
            }

            public String toString() {
                return "PersistComplete";
            }
        }

        /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$b$e */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/f$b$e;", "Lcom/whoop/ai/chat/domain/formwidget/f$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class e implements b {

            /* JADX INFO: renamed from: a */
            public static final e f23314a = new e();

            private e() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public int hashCode() {
                return -1760790245;
            }

            public String toString() {
                return "PersistFailed";
            }
        }

        /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$b$f */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/f$b$f;", "Lcom/whoop/ai/chat/domain/formwidget/f$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class f implements b {

            /* JADX INFO: renamed from: a */
            public static final f f23315a = new f();

            private f() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof f);
            }

            public int hashCode() {
                return -37453473;
            }

            public String toString() {
                return "RefreshNetworkError";
            }
        }

        /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$b$g */
        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/f$b$g;", "Lcom/whoop/ai/chat/domain/formwidget/f$b;", "", "formKey", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class g implements b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String formKey;

            public g(String formKey) {
                AbstractC22676k.m65750j(formKey, "formKey");
                this.formKey = formKey;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getFormKey() {
                return this.formKey;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof g) && AbstractC22676k.m65745e(this.formKey, ((g) other).formKey);
            }

            public int hashCode() {
                return this.formKey.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("RefreshRequestFailed(formKey=", this.formKey, ")");
            }
        }

        /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$b$h */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/f$b$h;", "Lcom/whoop/ai/chat/domain/formwidget/f$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class h implements b {

            /* JADX INFO: renamed from: a */
            public static final h f23317a = new h();

            private h() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof h);
            }

            public int hashCode() {
                return -1274030070;
            }

            public String toString() {
                return "RefreshReset";
            }
        }

        /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$b$i */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/f$b$i;", "Lcom/whoop/ai/chat/domain/formwidget/f$b;", "Lcom/whoop/design/models/DesignSystemModel;", "widget", "<init>", "(Lcom/whoop/design/models/DesignSystemModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/models/DesignSystemModel;", "()Lcom/whoop/design/models/DesignSystemModel;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class i implements b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final DesignSystemModel widget;

            public i(DesignSystemModel widget) {
                AbstractC22676k.m65750j(widget, "widget");
                this.widget = widget;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final DesignSystemModel getWidget() {
                return this.widget;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof i) && AbstractC22676k.m65745e(this.widget, ((i) other).widget);
            }

            public int hashCode() {
                return this.widget.hashCode();
            }

            public String toString() {
                return "RefreshSuccess(widget=" + this.widget + ")";
            }
        }

        /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$b$j */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/f$b$j;", "Lcom/whoop/ai/chat/domain/formwidget/f$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class j implements b {

            /* JADX INFO: renamed from: a */
            public static final j f23319a = new j();

            private j() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof j);
            }

            public int hashCode() {
                return 177640761;
            }

            public String toString() {
                return "Reset";
            }
        }

        /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$b$k */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/f$b$k;", "Lcom/whoop/ai/chat/domain/formwidget/f$b;", "Lcom/whoop/design/models/DesignSystemModel;", "widget", "<init>", "(Lcom/whoop/design/models/DesignSystemModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/models/DesignSystemModel;", "()Lcom/whoop/design/models/DesignSystemModel;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class k implements b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final DesignSystemModel widget;

            public k(DesignSystemModel widget) {
                AbstractC22676k.m65750j(widget, "widget");
                this.widget = widget;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final DesignSystemModel getWidget() {
                return this.widget;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof k) && AbstractC22676k.m65745e(this.widget, ((k) other).widget);
            }

            public int hashCode() {
                return this.widget.hashCode();
            }

            public String toString() {
                return "Seed(widget=" + this.widget + ")";
            }
        }

        /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$b$l */
        @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/f$b$l;", "Lcom/whoop/ai/chat/domain/formwidget/f$b;", "", "questionId", "", "Lcom/whoop/ai/chat/domain/formwidget/h;", "selections", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class l implements b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String questionId;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final List<C5940h> selections;

            public l(String questionId, List<C5940h> selections) {
                AbstractC22676k.m65750j(questionId, "questionId");
                AbstractC22676k.m65750j(selections, "selections");
                this.questionId = questionId;
                this.selections = selections;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getQuestionId() {
                return this.questionId;
            }

            /* JADX INFO: renamed from: b */
            public final List<C5940h> m17795b() {
                return this.selections;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof l)) {
                    return false;
                }
                l lVar = (l) other;
                return AbstractC22676k.m65745e(this.questionId, lVar.questionId) && AbstractC22676k.m65745e(this.selections, lVar.selections);
            }

            public int hashCode() {
                return this.selections.hashCode() + (this.questionId.hashCode() * 31);
            }

            public String toString() {
                return AbstractC36095b.m114679g("SubmitAdvance(questionId=", this.questionId, ", selections=", ")", this.selections);
            }
        }

        /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$b$m */
        @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/f$b$m;", "Lcom/whoop/ai/chat/domain/formwidget/f$b;", "", "questionId", "", "Lcom/whoop/ai/chat/domain/formwidget/h;", "selections", "Lcom/whoop/ai/chat/domain/formwidget/i;", "result", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/ai/chat/domain/formwidget/i;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lcom/whoop/ai/chat/domain/formwidget/i;", "()Lcom/whoop/ai/chat/domain/formwidget/i;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class m implements b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String questionId;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final List<C5940h> selections;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final InterfaceC5941i result;

            public m(String questionId, List<C5940h> selections, InterfaceC5941i interfaceC5941i) {
                AbstractC22676k.m65750j(questionId, "questionId");
                AbstractC22676k.m65750j(selections, "selections");
                this.questionId = questionId;
                this.selections = selections;
                this.result = interfaceC5941i;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getQuestionId() {
                return this.questionId;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final InterfaceC5941i getResult() {
                return this.result;
            }

            /* JADX INFO: renamed from: c */
            public final List<C5940h> m17798c() {
                return this.selections;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof m)) {
                    return false;
                }
                m mVar = (m) other;
                return AbstractC22676k.m65745e(this.questionId, mVar.questionId) && AbstractC22676k.m65745e(this.selections, mVar.selections) && AbstractC22676k.m65745e(this.result, mVar.result);
            }

            public int hashCode() {
                int iM31983b = AbstractC11895b.m31983b(this.questionId.hashCode() * 31, 31, this.selections);
                InterfaceC5941i interfaceC5941i = this.result;
                return iM31983b + (interfaceC5941i == null ? 0 : interfaceC5941i.hashCode());
            }

            public String toString() {
                String str = this.questionId;
                List<C5940h> list = this.selections;
                InterfaceC5941i interfaceC5941i = this.result;
                StringBuilder sbM94766o = AbstractC30802r.m94766o("SubmitComplete(questionId=", str, ", selections=", ", result=", list);
                sbM94766o.append(interfaceC5941i);
                sbM94766o.append(")");
                return sbM94766o.toString();
            }
        }

        /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$b$n */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/f$b$n;", "Lcom/whoop/ai/chat/domain/formwidget/f$b;", "Lcom/whoop/ai/chat/domain/formwidget/i;", "result", "<init>", "(Lcom/whoop/ai/chat/domain/formwidget/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/ai/chat/domain/formwidget/i;", "()Lcom/whoop/ai/chat/domain/formwidget/i;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class n implements b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final InterfaceC5941i result;

            public n(InterfaceC5941i result) {
                AbstractC22676k.m65750j(result, "result");
                this.result = result;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final InterfaceC5941i getResult() {
                return this.result;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof n) && AbstractC22676k.m65745e(this.result, ((n) other).result);
            }

            public int hashCode() {
                return this.result.hashCode();
            }

            public String toString() {
                return "SubmitFailed(result=" + this.result + ")";
            }
        }

        /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$b$o */
        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/f$b$o;", "Lcom/whoop/ai/chat/domain/formwidget/f$b;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class o implements b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String message;

            public o(String message) {
                AbstractC22676k.m65750j(message, "message");
                this.message = message;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof o) && AbstractC22676k.m65745e(this.message, ((o) other).message);
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("SubmitModerationRejection(message=", this.message, ")");
            }
        }

        /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$b$p */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/f$b$p;", "Lcom/whoop/ai/chat/domain/formwidget/f$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class p implements b {

            /* JADX INFO: renamed from: a */
            public static final p f23328a = new p();

            private p() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof p);
            }

            public int hashCode() {
                return -1049149228;
            }

            public String toString() {
                return "SubmitOptimisticComplete";
            }
        }

        /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$b$q */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/f$b$q;", "Lcom/whoop/ai/chat/domain/formwidget/f$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class q implements b {

            /* JADX INFO: renamed from: a */
            public static final q f23329a = new q();

            private q() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof q);
            }

            public int hashCode() {
                return -828030060;
            }

            public String toString() {
                return "SubmitStart";
            }
        }
    }

    /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/f$c;", "", "", "path", "Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest;", "body", "<init>", "(Ljava/lang/String;Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest;", "()Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String path;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final SubmitFormAnswersRequest body;

        public c(String path, SubmitFormAnswersRequest body) {
            AbstractC22676k.m65750j(path, "path");
            AbstractC22676k.m65750j(body, "body");
            this.path = path;
            this.body = body;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final SubmitFormAnswersRequest getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.path, cVar.path) && AbstractC22676k.m65745e(this.body, cVar.body);
        }

        public int hashCode() {
            return this.body.hashCode() + (this.path.hashCode() * 31);
        }

        public String toString() {
            return "ResolvedAnswerSubmit(path=" + this.path + ", body=" + this.body + ")";
        }
    }

    /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$d */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/f$d;", "", "", "path", "Lcom/whoop/ai/chat/domain/formwidget/UpdateFormRequest;", "body", "<init>", "(Ljava/lang/String;Lcom/whoop/ai/chat/domain/formwidget/UpdateFormRequest;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/ai/chat/domain/formwidget/UpdateFormRequest;", "()Lcom/whoop/ai/chat/domain/formwidget/UpdateFormRequest;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String path;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final UpdateFormRequest body;

        public d(String path, UpdateFormRequest body) {
            AbstractC22676k.m65750j(path, "path");
            AbstractC22676k.m65750j(body, "body");
            this.path = path;
            this.body = body;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final UpdateFormRequest getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.path, dVar.path) && AbstractC22676k.m65745e(this.body, dVar.body);
        }

        public int hashCode() {
            return this.body.hashCode() + (this.path.hashCode() * 31);
        }

        public String toString() {
            return "ResolvedComplete(path=" + this.path + ", body=" + this.body + ")";
        }
    }

    /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.formwidget.FormWidgetInteractor", m100430f = "FormWidgetInteractor.kt", m100431l = {219, 225, 226}, m100432m = "executeFinalSubmit", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f23334E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f23335F;

        /* JADX INFO: renamed from: H */
        int f23337H;

        /* JADX INFO: renamed from: w */
        Object f23338w;

        /* JADX INFO: renamed from: x */
        Object f23339x;

        /* JADX INFO: renamed from: y */
        Object f23340y;

        /* JADX INFO: renamed from: z */
        Object f23341z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f23335F = obj;
            this.f23337H |= Integer.MIN_VALUE;
            return C5938f.this.m17781q(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.formwidget.FormWidgetInteractor$executeFinalSubmit$answersResult$1", m100430f = "FormWidgetInteractor.kt", m100431l = {219}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f23342w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ c f23344y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(c cVar, InterfaceC30057d<? super f> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f23344y = cVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C5938f.this.new f(this.f23344y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f23342w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            SubmitFormApi submitFormApi = C5938f.this.submitFormApi;
            String path = this.f23344y.getPath();
            SubmitFormAnswersRequest body = this.f23344y.getBody();
            this.f23342w = 1;
            Object objSubmitAnswers = submitFormApi.submitAnswers(path, body, this);
            return objSubmitAnswers == enumC31071a ? enumC31071a : objSubmitAnswers;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((f) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.formwidget.FormWidgetInteractor$executeFinalSubmit$completeResult$1", m100430f = "FormWidgetInteractor.kt", m100431l = {225}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Lcom/whoop/ai/chat/domain/formwidget/UpdateFormResponse;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f23345w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ d f23347y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(d dVar, InterfaceC30057d<? super g> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f23347y = dVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C5938f.this.new g(this.f23347y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f23345w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            SubmitFormApi submitFormApi = C5938f.this.submitFormApi;
            String path = this.f23347y.getPath();
            UpdateFormRequest body = this.f23347y.getBody();
            this.f23345w = 1;
            Object objMarkComplete = submitFormApi.markComplete(path, body, this);
            return objMarkComplete == enumC31071a ? enumC31071a : objMarkComplete;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<UpdateFormResponse>> interfaceC30057d) {
            return ((g) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$h */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.formwidget.FormWidgetInteractor", m100430f = "FormWidgetInteractor.kt", m100431l = {198, 201}, m100432m = "executeIntermediateSubmit", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f23349F;

        /* JADX INFO: renamed from: w */
        Object f23350w;

        /* JADX INFO: renamed from: x */
        Object f23351x;

        /* JADX INFO: renamed from: y */
        Object f23352y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f23353z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f23353z = obj;
            this.f23349F |= Integer.MIN_VALUE;
            return C5938f.this.m17782r(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$i */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.formwidget.FormWidgetInteractor$executeIntermediateSubmit$result$1", m100430f = "FormWidgetInteractor.kt", m100431l = {198}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f23354w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ c f23356y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(c cVar, InterfaceC30057d<? super i> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f23356y = cVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C5938f.this.new i(this.f23356y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f23354w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            SubmitFormApi submitFormApi = C5938f.this.submitFormApi;
            String path = this.f23356y.getPath();
            SubmitFormAnswersRequest body = this.f23356y.getBody();
            this.f23354w = 1;
            Object objSubmitAnswers = submitFormApi.submitAnswers(path, body, this);
            return objSubmitAnswers == enumC31071a ? enumC31071a : objSubmitAnswers;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((i) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$j */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.formwidget.FormWidgetInteractor$executeSubmit$2", m100430f = "FormWidgetInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/f$b;", "<anonymous>", "()Lcom/whoop/ai/chat/domain/formwidget/f$b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ d f23357E;

        /* JADX INFO: renamed from: w */
        int f23358w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC5935c.h f23360y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ c f23361z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(AbstractC5935c.h hVar, c cVar, d dVar, InterfaceC30057d<? super j> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f23360y = hVar;
            this.f23361z = cVar;
            this.f23357E = dVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C5938f.this.new j(this.f23360y, this.f23361z, this.f23357E, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f23358w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C5938f c5938f = C5938f.this;
            AbstractC5935c.h hVar = this.f23360y;
            c cVar = this.f23361z;
            d dVar = this.f23357E;
            this.f23358w = 1;
            Object objM17781q = c5938f.m17781q(hVar, cVar, dVar, this);
            return objM17781q == enumC31071a ? enumC31071a : objM17781q;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super b> interfaceC30057d) {
            return ((j) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$k */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.formwidget.FormWidgetInteractor$executeSubmit$3", m100430f = "FormWidgetInteractor.kt", m100431l = {191}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/f$b;", "<anonymous>", "()Lcom/whoop/ai/chat/domain/formwidget/f$b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f23362w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC5935c.h f23364y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ c f23365z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(AbstractC5935c.h hVar, c cVar, InterfaceC30057d<? super k> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f23364y = hVar;
            this.f23365z = cVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C5938f.this.new k(this.f23364y, this.f23365z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f23362w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C5938f c5938f = C5938f.this;
            AbstractC5935c.h hVar = this.f23364y;
            c cVar = this.f23365z;
            this.f23362w = 1;
            Object objM17782r = c5938f.m17782r(hVar, cVar, this);
            return objM17782r == enumC31071a ? enumC31071a : objM17782r;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super b> interfaceC30057d) {
            return ((k) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$l */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.formwidget.FormWidgetInteractor$interact$$inlined$flatMapLatest$1", m100430f = "FormWidgetInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class l extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f23366w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f23367x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f23368y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C5938f f23369z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC30057d interfaceC30057d, C5938f c5938f) {
            super(3, interfaceC30057d);
            this.f23369z = c5938f;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC5935c abstractC5935c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            l lVar = new l(interfaceC30057d, this.f23369z);
            lVar.f23367x = interfaceC13062m;
            lVar.f23368y = abstractC5935c;
            return lVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f23366w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f23367x;
                AbstractC5935c abstractC5935c = (AbstractC5935c) this.f23368y;
                boolean z4 = abstractC5935c instanceof AbstractC5935c.e;
                InterfaceC13058l c0456u = C13054k.f45116w;
                if (z4) {
                    if (this.f23369z.featureFlagChecker.isFeatureEnabled("aix-form-widget")) {
                        c0456u = this.f23369z.m17789y(((AbstractC5935c.e) abstractC5935c).getFormKey());
                    }
                } else if (abstractC5935c instanceof AbstractC5935c.h) {
                    if (this.f23369z.featureFlagChecker.isFeatureEnabled("aix-form-widget")) {
                        c0456u = this.f23369z.m17763C((AbstractC5935c.h) abstractC5935c);
                    }
                } else if (abstractC5935c instanceof AbstractC5935c.g) {
                    c0456u = new C0456u(new b.k(((AbstractC5935c.g) abstractC5935c).getWidget()), 1);
                } else if (abstractC5935c instanceof AbstractC5935c.d) {
                    if (this.f23369z.featureFlagChecker.isFeatureEnabled("aix-form-widget")) {
                        c0456u = this.f23369z.m17787w((AbstractC5935c.d) abstractC5935c);
                    }
                } else if (abstractC5935c instanceof AbstractC5935c.b) {
                    c0456u = new C0456u(b.C41369b.f23311a, 1);
                } else if (abstractC5935c instanceof AbstractC5935c.c) {
                    c0456u = new C0456u(b.c.f23312a, 1);
                } else if (abstractC5935c instanceof AbstractC5935c.a) {
                    c0456u = new C0456u(b.a.f23310a, 1);
                } else {
                    if (!(abstractC5935c instanceof AbstractC5935c.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c0456u = new C0456u(b.j.f23319a, 1);
                }
                this.f23367x = null;
                this.f23368y = null;
                this.f23366w = 1;
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
            return invoke((InterfaceC13062m) obj, (AbstractC5935c) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$m */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.formwidget.FormWidgetInteractor$interact$2", m100430f = "FormWidgetInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/d;", "state", "Lcom/whoop/ai/chat/domain/formwidget/f$b;", "internal", "<anonymous>", "(Lcom/whoop/ai/chat/domain/formwidget/d;Lcom/whoop/ai/chat/domain/formwidget/f$b;)Lcom/whoop/ai/chat/domain/formwidget/d;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class m extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f23370w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f23371x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f23372y;

        public m(InterfaceC30057d<? super m> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C5936d c5936d, b bVar, InterfaceC30057d<? super C5936d> interfaceC30057d) {
            m mVar = C5938f.this.new m(interfaceC30057d);
            mVar.f23371x = c5936d;
            mVar.f23372y = bVar;
            return mVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C5936d c5936d = (C5936d) this.f23371x;
            b bVar = (b) this.f23372y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f23370w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C5938f.this.m17788x(c5936d, bVar);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$n */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.formwidget.FormWidgetInteractor$persistFlow$1", m100430f = "FormWidgetInteractor.kt", m100431l = {DateTimeConstants.HOURS_PER_WEEK, 172, 171}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/ai/chat/domain/formwidget/f$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class n extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: F */
        final /* synthetic */ AbstractC5935c.d f23375F;

        /* JADX INFO: renamed from: w */
        Object f23376w;

        /* JADX INFO: renamed from: x */
        Object f23377x;

        /* JADX INFO: renamed from: y */
        int f23378y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f23379z;

        /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$n$a */
        @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.formwidget.FormWidgetInteractor$persistFlow$1$result$1", m100430f = "FormWidgetInteractor.kt", m100431l = {172}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lu02/a;", "Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lu02/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f23380w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C5938f f23381x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ c f23382y;

            /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$n$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.formwidget.FormWidgetInteractor$persistFlow$1$result$1$1", m100430f = "FormWidgetInteractor.kt", m100431l = {172}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class C41370a extends AbstractC32275i implements Function1 {

                /* JADX INFO: renamed from: w */
                int f23383w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ C5938f f23384x;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ c f23385y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C41370a(C5938f c5938f, c cVar, InterfaceC30057d<? super C41370a> interfaceC30057d) {
                    super(1, interfaceC30057d);
                    this.f23384x = c5938f;
                    this.f23385y = cVar;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                    return new C41370a(this.f23384x, this.f23385y, interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i13 = this.f23383w;
                    if (i13 != 0) {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                        return obj;
                    }
                    AbstractC34132o.m107864I(obj);
                    SubmitFormApi submitFormApi = this.f23384x.submitFormApi;
                    String path = this.f23385y.getPath();
                    SubmitFormAnswersRequest body = this.f23385y.getBody();
                    this.f23383w = 1;
                    Object objSubmitAnswers = submitFormApi.submitAnswers(path, body, this);
                    return objSubmitAnswers == enumC31071a ? enumC31071a : objSubmitAnswers;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
                    return ((C41370a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C5938f c5938f, c cVar, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f23381x = c5938f;
                this.f23382y = cVar;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f23381x, this.f23382y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f23380w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n = this.f23381x.logger;
                C41370a c41370a = new C41370a(this.f23381x, this.f23382y, null);
                this.f23380w = 1;
                Object objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, c41370a, this, 6, null);
                return objM108729b == enumC31071a ? enumC31071a : objM108729b;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super InterfaceC34385a<C29218v0<C23454a0>>> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(AbstractC5935c.d dVar, InterfaceC30057d<? super n> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f23375F = dVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            n nVar = C5938f.this.new n(this.f23375F, interfaceC30057d);
            nVar.f23379z = obj;
            return nVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((n) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:24:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:26:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:31:0x00e5  */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC34385a interfaceC34385a;
            Object obj2;
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f23379z;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f23378y;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 != 0) {
                if (i13 == 1) {
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                if (i13 == 2) {
                    interfaceC13062m = (InterfaceC13062m) this.f23377x;
                    AbstractC34132o.m107864I(obj);
                    interfaceC34385a = (InterfaceC34385a) obj;
                    if (interfaceC34385a instanceof InterfaceC34385a.c) {
                        obj2 = b.d.f23313a;
                    } else {
                        if (interfaceC34385a instanceof InterfaceC34385a.b) {
                            throw new NoWhenBranchMatchedException();
                        }
                        InterfaceC34116n interfaceC34116n = C5938f.this.logger;
                        String formId = this.f23375F.getFormId();
                        String questionId = this.f23375F.getQuestionId();
                        String errorMessage = ((InterfaceC34385a.b) interfaceC34385a).getErrorMessage();
                        StringBuilder sbM32001t = AbstractC11895b.m32001t("Persist failed for formId=", formId, ", questionId=", questionId, ". ");
                        sbM32001t.append(errorMessage);
                        interfaceC34116n.mo85214e("FormWidget", sbM32001t.toString(), new AbstractC30556a.a[0]);
                        obj2 = b.e.f23314a;
                    }
                    this.f23379z = null;
                    this.f23376w = null;
                    this.f23377x = null;
                    this.f23378y = 3;
                    if (interfaceC13062m.emit(obj2, this) != enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a0;
            }
            AbstractC34132o.m107864I(obj);
            c cVarM17790z = C5938f.this.m17790z(this.f23375F.getOnAnswer(), this.f23375F.m17742d());
            if (cVarM17790z == null) {
                C5938f.this.logger.mo85214e("FormWidget", AbstractC31061c.m95640p("Persist missing/invalid onAnswer action for formId=", this.f23375F.getFormId(), ", questionId=", this.f23375F.getQuestionId()), new AbstractC30556a.a[0]);
                b.e eVar = b.e.f23314a;
                this.f23379z = null;
                this.f23376w = null;
                this.f23378y = 1;
                if (interfaceC13062m.emit(eVar, this) != enumC31071a) {
                    return c23454a0;
                }
            } else {
                C5938f c5938f = C5938f.this;
                a aVar = new a(c5938f, cVarM17790z, null);
                this.f23379z = null;
                this.f23376w = null;
                this.f23377x = interfaceC13062m;
                this.f23378y = 2;
                obj = c5938f.m17762B(aVar, this);
                if (obj != enumC31071a) {
                    interfaceC34385a = (InterfaceC34385a) obj;
                    if (interfaceC34385a instanceof InterfaceC34385a.c) {
                        obj2 = b.d.f23313a;
                    } else {
                        if (interfaceC34385a instanceof InterfaceC34385a.b) {
                            throw new NoWhenBranchMatchedException();
                        }
                        InterfaceC34116n interfaceC34116n2 = C5938f.this.logger;
                        String formId2 = this.f23375F.getFormId();
                        String questionId2 = this.f23375F.getQuestionId();
                        String errorMessage2 = ((InterfaceC34385a.b) interfaceC34385a).getErrorMessage();
                        StringBuilder sbM32001t2 = AbstractC11895b.m32001t("Persist failed for formId=", formId2, ", questionId=", questionId2, ". ");
                        sbM32001t2.append(errorMessage2);
                        interfaceC34116n2.mo85214e("FormWidget", sbM32001t2.toString(), new AbstractC30556a.a[0]);
                        obj2 = b.e.f23314a;
                    }
                    this.f23379z = null;
                    this.f23376w = null;
                    this.f23377x = null;
                    this.f23378y = 3;
                    if (interfaceC13062m.emit(obj2, this) != enumC31071a) {
                        return c23454a0;
                    }
                }
            }
            return enumC31071a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$o */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.formwidget.FormWidgetInteractor$refreshFlow$1", m100430f = "FormWidgetInteractor.kt", m100431l = {130, 135}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/ai/chat/domain/formwidget/f$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class o extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f23386w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f23387x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f23388y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C5938f f23389z;

        /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$o$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f23390w;

            public a(InterfaceC13062m interfaceC13062m) {
                this.f23390w = interfaceC13062m;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(b bVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                Object objEmit = this.f23390w.emit(bVar, interfaceC30057d);
                return objEmit == EnumC31071a.f128113w ? objEmit : C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$o$b */
        @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.formwidget.FormWidgetInteractor$refreshFlow$1$invokeSuspend$$inlined$cacheAPI$1", m100430f = "FormWidgetInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements Function3 {

            /* JADX INFO: renamed from: w */
            int f23391w;

            /* JADX INFO: renamed from: x */
            private /* synthetic */ Object f23392x;

            /* JADX INFO: renamed from: y */
            /* synthetic */ Object f23393y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ InterfaceC26834e f23394z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
                super(3, interfaceC30057d);
                this.f23394z = interfaceC26834e;
            }

            public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                b bVar = new b(interfaceC30057d, this.f23394z);
                bVar.f23392x = interfaceC13062m;
                bVar.f23393y = c26832c;
                return bVar.invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f23391w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f23392x;
                    C26832c c26832c = (C26832c) this.f23393y;
                    InterfaceC26834e interfaceC26834e = this.f23394z;
                    InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                    Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                    C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                    C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                    InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(DesignSystemModel.class);
                    InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                    this.f23392x = null;
                    this.f23393y = null;
                    this.f23391w = 1;
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

        /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$o$c */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class c implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f23395w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C5938f f23396x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f23397y;

            /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$o$c$a */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f23398w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ C5938f f23399x;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ String f23400y;

                /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$o$c$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.formwidget.FormWidgetInteractor$refreshFlow$1$invokeSuspend$$inlined$mapNotNull$1$2", m100430f = "FormWidgetInteractor.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C41371a extends AbstractC32269c {

                    /* JADX INFO: renamed from: E */
                    Object f23401E;

                    /* JADX INFO: renamed from: F */
                    Object f23402F;

                    /* JADX INFO: renamed from: G */
                    Object f23403G;

                    /* JADX INFO: renamed from: H */
                    Object f23404H;

                    /* JADX INFO: renamed from: I */
                    int f23405I;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f23406w;

                    /* JADX INFO: renamed from: x */
                    int f23407x;

                    /* JADX INFO: renamed from: y */
                    Object f23408y;

                    public C41371a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f23406w = obj;
                        this.f23407x |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC13062m interfaceC13062m, C5938f c5938f, String str) {
                    this.f23398w = interfaceC13062m;
                    this.f23399x = c5938f;
                    this.f23400y = str;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C41371a c41371a;
                    if (interfaceC30057d instanceof C41371a) {
                        c41371a = (C41371a) interfaceC30057d;
                        int i13 = c41371a.f23407x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c41371a.f23407x = i13 - Integer.MIN_VALUE;
                        } else {
                            c41371a = new C41371a(interfaceC30057d);
                        }
                    } else {
                        c41371a = new C41371a(interfaceC30057d);
                    }
                    Object obj2 = c41371a.f23406w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c41371a.f23407x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f23398w;
                        b bVarM17785u = this.f23399x.m17785u((InterfaceC29354a) obj, this.f23400y);
                        if (bVarM17785u != null) {
                            c41371a.f23408y = null;
                            c41371a.f23401E = null;
                            c41371a.f23402F = null;
                            c41371a.f23403G = null;
                            c41371a.f23404H = null;
                            c41371a.f23405I = 0;
                            c41371a.f23407x = 1;
                            if (interfaceC13062m.emit(bVarM17785u, c41371a) == enumC31071a) {
                                return enumC31071a;
                            }
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

            public c(InterfaceC13058l interfaceC13058l, C5938f c5938f, String str) {
                this.f23395w = interfaceC13058l;
                this.f23396x = c5938f;
                this.f23397y = str;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f23395w.collect(new a(interfaceC13062m, this.f23396x, this.f23397y), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, C5938f c5938f, InterfaceC30057d<? super o> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f23388y = str;
            this.f23389z = c5938f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            o oVar = new o(this.f23388y, this.f23389z, interfaceC30057d);
            oVar.f23387x = obj;
            return oVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((o) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
        
            if (r6.collect(r8, r7) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f23387x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r7.f23386w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r8)
                goto L73
            L14:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1c:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L30
            L20:
                p505ts.AbstractC34132o.m107864I(r8)
                com.whoop.ai.chat.domain.formwidget.f$b$h r8 = com.whoop.p057ai.chat.domain.formwidget.C5938f.b.h.f23317a
                r7.f23387x = r0
                r7.f23386w = r4
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L30
                goto L72
            L30:
                com.whoop.ai.chat.domain.formwidget.GetFormWidgetRequest r8 = new com.whoop.ai.chat.domain.formwidget.GetFormWidgetRequest
                java.lang.String r2 = "formKey"
                java.lang.String r4 = r7.f23388y
                java.util.Map r2 = r80.AbstractC31061c.m95645u(r2, r4)
                java.lang.String r4 = "ai-conversation-bff/v1/form"
                r8.<init>(r4, r2)
                a6.u r2 = new a6.u
                r4 = 1
                r2.<init>(r8, r4)
                r8 = 3
                r4 = 0
                ec3.l r8 = sm0.AbstractC32714a.m102670b(r2, r4, r4, r8, r4)
                com.whoop.ai.chat.domain.formwidget.f r2 = r7.f23389z
                nm0.e r2 = com.whoop.p057ai.chat.domain.formwidget.C5938f.m17770f(r2)
                com.whoop.ai.chat.domain.formwidget.f$o$b r5 = new com.whoop.ai.chat.domain.formwidget.f$o$b
                r5.<init>(r4, r2)
                fc3.k r8 = ec3.AbstractC13091v.m36590P(r8, r5)
                com.whoop.ai.chat.domain.formwidget.f r2 = r7.f23389z
                java.lang.String r5 = r7.f23388y
                com.whoop.ai.chat.domain.formwidget.f$o$c r6 = new com.whoop.ai.chat.domain.formwidget.f$o$c
                r6.<init>(r8, r2, r5)
                com.whoop.ai.chat.domain.formwidget.f$o$a r8 = new com.whoop.ai.chat.domain.formwidget.f$o$a
                r8.<init>(r0)
                r7.f23387x = r4
                r7.f23386w = r3
                java.lang.Object r8 = r6.collect(r8, r7)
                if (r8 != r1) goto L73
            L72:
                return r1
            L73:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.p057ai.chat.domain.formwidget.C5938f.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$p */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.formwidget.FormWidgetInteractor", m100430f = "FormWidgetInteractor.kt", m100431l = {408, 63}, m100432m = "runSerializedWrite", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p<T> extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f23410E;

        /* JADX INFO: renamed from: G */
        int f23412G;

        /* JADX INFO: renamed from: w */
        Object f23413w;

        /* JADX INFO: renamed from: x */
        Object f23414x;

        /* JADX INFO: renamed from: y */
        int f23415y;

        /* JADX INFO: renamed from: z */
        int f23416z;

        public p(InterfaceC30057d<? super p> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f23410E = obj;
            this.f23412G |= Integer.MIN_VALUE;
            return C5938f.this.m17762B(null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$q */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.formwidget.FormWidgetInteractor$runSerializedWrite$2$1", m100430f = "FormWidgetInteractor.kt", m100431l = {63}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m65681d2 = {"T", "Lbc3/c0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class q extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f23417w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f23418x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Function1 function1, InterfaceC30057d<? super q> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f23418x = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new q(this.f23418x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super T> interfaceC30057d) {
            return ((q) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f23417w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            Function1 function1 = this.f23418x;
            this.f23417w = 1;
            Object objInvoke = function1.invoke(this);
            return objInvoke == enumC31071a ? enumC31071a : objInvoke;
        }
    }

    /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.f$r */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.formwidget.FormWidgetInteractor$submitFlow$1", m100430f = "FormWidgetInteractor.kt", m100431l = {160, 161, 161}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/ai/chat/domain/formwidget/f$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class r extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C5938f f23419E;

        /* JADX INFO: renamed from: w */
        Object f23420w;

        /* JADX INFO: renamed from: x */
        int f23421x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f23422y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC5935c.h f23423z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(AbstractC5935c.h hVar, C5938f c5938f, InterfaceC30057d<? super r> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f23423z = hVar;
            this.f23419E = c5938f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            r rVar = new r(this.f23423z, this.f23419E, interfaceC30057d);
            rVar.f23422y = obj;
            return rVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((r) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
        
            if (r0.emit(r8, r7) == r1) goto L24;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f23422y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r7.f23421x
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L2c
                if (r2 == r5) goto L28
                if (r2 == r4) goto L20
                if (r2 != r3) goto L18
                p505ts.AbstractC34132o.m107864I(r8)
                goto L65
            L18:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L20:
                java.lang.Object r0 = r7.f23420w
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r8)
                goto L58
            L28:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L47
            L2c:
                p505ts.AbstractC34132o.m107864I(r8)
                com.whoop.ai.chat.domain.formwidget.c$h r8 = r7.f23423z
                boolean r8 = r8.getIsFinalQuestion()
                if (r8 == 0) goto L3a
                com.whoop.ai.chat.domain.formwidget.f$b$p r8 = com.whoop.p057ai.chat.domain.formwidget.C5938f.b.p.f23328a
                goto L3c
            L3a:
                com.whoop.ai.chat.domain.formwidget.f$b$q r8 = com.whoop.p057ai.chat.domain.formwidget.C5938f.b.q.f23329a
            L3c:
                r7.f23422y = r0
                r7.f23421x = r5
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L47
                goto L64
            L47:
                com.whoop.ai.chat.domain.formwidget.f r8 = r7.f23419E
                com.whoop.ai.chat.domain.formwidget.c$h r2 = r7.f23423z
                r7.f23422y = r6
                r7.f23420w = r0
                r7.f23421x = r4
                java.lang.Object r8 = com.whoop.p057ai.chat.domain.formwidget.C5938f.m17769e(r8, r2, r7)
                if (r8 != r1) goto L58
                goto L64
            L58:
                r7.f23422y = r6
                r7.f23420w = r6
                r7.f23421x = r3
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L65
            L64:
                return r1
            L65:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.p057ai.chat.domain.formwidget.C5938f.r.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C5938f(InterfaceC26834e cachedApiSource, SubmitFormApi submitFormApi, FeatureFlagChecker featureFlagChecker, C37378a scopeCoordinator, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(submitFormApi, "submitFormApi");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(scopeCoordinator, "scopeCoordinator");
        AbstractC22676k.m65750j(logger, "logger");
        this.cachedApiSource = cachedApiSource;
        this.submitFormApi = submitFormApi;
        this.featureFlagChecker = featureFlagChecker;
        this.scopeCoordinator = scopeCoordinator;
        this.logger = logger;
        this.writeMutex = AbstractC25438d.m74669a();
    }

    /* JADX INFO: renamed from: A */
    private final d m17761A(Action action) {
        Request request;
        JsonElement body;
        Object objM107888l;
        UpdateAction updateAction = action instanceof UpdateAction ? (UpdateAction) action : null;
        if (updateAction == null || (request = updateAction.getRequest()) == null || !AbstractC39421y.m125921F(request.getMethod(), "PUT", true) || (body = request.getBody()) == null) {
            return null;
        }
        try {
            AbstractC0757c abstractC0757cM109496c = AbstractC34650k.m109496c();
            abstractC0757cM109496c.getClass();
            objM107888l = (UpdateFormRequest) abstractC0757cM109496c.m1830a(UpdateFormRequest.INSTANCE.serializer(), body);
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        if (objM107888l instanceof C23467m) {
            objM107888l = null;
        }
        UpdateFormRequest updateFormRequest = (UpdateFormRequest) objM107888l;
        if (updateFormRequest == null) {
            return null;
        }
        return new d(request.getPath(), updateFormRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: B */
    public final <T> Object m17762B(Function1 function1, InterfaceC30057d<? super T> interfaceC30057d) throws Throwable {
        p pVar;
        InterfaceC25435a interfaceC25435a;
        int i13;
        Throwable th3;
        InterfaceC25435a interfaceC25435a2;
        if (interfaceC30057d instanceof p) {
            pVar = (p) interfaceC30057d;
            int i14 = pVar.f23412G;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pVar.f23412G = i14 - Integer.MIN_VALUE;
            } else {
                pVar = new p(interfaceC30057d);
            }
        } else {
            pVar = new p(interfaceC30057d);
        }
        Object obj = pVar.f23410E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = pVar.f23412G;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(obj);
                interfaceC25435a = this.writeMutex;
                pVar.f23413w = function1;
                pVar.f23414x = interfaceC25435a;
                pVar.f23415y = 0;
                pVar.f23412G = 1;
                if (interfaceC25435a.mo68211b(pVar) != enumC31071a) {
                    i13 = 0;
                }
                return enumC31071a;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC25435a2 = (InterfaceC25435a) pVar.f23414x;
                try {
                    AbstractC34132o.m107864I(obj);
                    interfaceC25435a2.mo68214i(null);
                    return obj;
                } catch (Throwable th4) {
                    th3 = th4;
                    interfaceC25435a2.mo68214i(null);
                    throw th3;
                }
            }
            int i16 = pVar.f23415y;
            InterfaceC25435a interfaceC25435a3 = (InterfaceC25435a) pVar.f23414x;
            Function1 function2 = (Function1) pVar.f23413w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a3;
            i13 = i16;
            function1 = function2;
            C3075y1 c3075y1 = C3075y1.f12109w;
            q qVar = new q(function1, null);
            pVar.f23413w = null;
            pVar.f23414x = interfaceC25435a;
            pVar.f23415y = i13;
            pVar.f23416z = 0;
            pVar.f23412G = 2;
            Object objM8705K = AbstractC3006f0.m8705K(c3075y1, qVar, pVar);
            if (objM8705K != enumC31071a) {
                InterfaceC25435a interfaceC25435a4 = interfaceC25435a;
                obj = objM8705K;
                interfaceC25435a2 = interfaceC25435a4;
                interfaceC25435a2.mo68214i(null);
                return obj;
            }
            return enumC31071a;
        } catch (Throwable th5) {
            InterfaceC25435a interfaceC25435a5 = interfaceC25435a;
            th3 = th5;
            interfaceC25435a2 = interfaceC25435a5;
            interfaceC25435a2.mo68214i(null);
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public final InterfaceC13058l m17763C(AbstractC5935c.h action) {
        return new C13084s1(new r(action, this, null));
    }

    /* JADX INFO: renamed from: D */
    private final SubmitFormAnswersRequest.Answer m17764D(C5940h c5940h) {
        String strM17811b = c5940h.getOptionId();
        if (strM17811b.length() <= 0) {
            strM17811b = null;
        }
        return new SubmitFormAnswersRequest.Answer(strM17811b, c5940h.getLabel(), c5940h.getValue(), c5940h.getUserInputText());
    }

    /* JADX INFO: renamed from: E */
    private final b m17765E(InterfaceC34385a.b<?> bVar) {
        Object objM107888l;
        Object objM107888l2;
        C29218v0 c29218v0;
        AbstractC34799a1 abstractC34799a1;
        if (!(bVar instanceof InterfaceC34385a.b.a) || ((InterfaceC34385a.b.a) bVar).getErrorCode() != 403) {
            return new b.n(new InterfaceC5941i.b(m17766F(bVar)));
        }
        try {
            Exception exception = ((InterfaceC34385a.b.a) bVar).getException();
            HttpException httpException = exception instanceof HttpException ? (HttpException) exception : null;
            objM107888l = (httpException == null || (c29218v0 = httpException.f128922y) == null || (abstractC34799a1 = c29218v0.f118271c) == null) ? null : abstractC34799a1.m109860m();
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        if (objM107888l instanceof C23467m) {
            objM107888l = null;
        }
        String str = (String) objM107888l;
        if (str == null) {
            str = "";
        }
        try {
            AbstractC0757c abstractC0757c = AbstractC5939g.f23424a;
            abstractC0757c.getClass();
            objM107888l2 = ((ModerationErrorBody) abstractC0757c.m1831b(ModerationErrorBody.INSTANCE.serializer(), str)).getMessage();
        } catch (Throwable th4) {
            objM107888l2 = AbstractC34132o.m107888l(th4);
        }
        String str2 = (String) (objM107888l2 instanceof C23467m ? null : objM107888l2);
        return new b.o(str2 != null ? str2 : "");
    }

    /* JADX INFO: renamed from: F */
    private final AbstractC4328b m17766F(InterfaceC34385a.b<?> bVar) {
        if (bVar instanceof InterfaceC34385a.b.C42432b) {
            return AbstractC4328b.a.f17584b;
        }
        if (!(bVar instanceof InterfaceC34385a.b.a.C42431a) && !(bVar instanceof InterfaceC34385a.b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        return AbstractC4328b.b.f17585b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x0126  */
    /* JADX WARN: Code duplicated, block: B:36:0x012c  */
    /* JADX WARN: Code duplicated, block: B:38:0x013a  */
    /* JADX WARN: Code duplicated, block: B:39:0x013f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0142  */
    /* JADX WARN: Code duplicated, block: B:43:0x0155  */
    /* JADX WARN: Code duplicated, block: B:45:0x0174  */
    /* JADX WARN: Code duplicated, block: B:47:0x0178  */
    /* JADX WARN: Code duplicated, block: B:49:0x019f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.whoop.ai.chat.domain.formwidget.i] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.String] */
    /* JADX INFO: renamed from: q */
    public final Object m17781q(AbstractC5935c.h hVar, c cVar, d dVar, InterfaceC30057d<? super b> interfaceC30057d) {
        e eVar;
        String str;
        InterfaceC30057d interfaceC30057d2;
        d dVar2;
        Object obj;
        AbstractC5935c.h hVar2;
        AbstractC5935c.h hVar3;
        Object objM108729b;
        InterfaceC30057d interfaceC30057d3;
        InterfaceC34385a interfaceC34385a;
        C37378a c37378a;
        InterfaceC34385a interfaceC34385a2;
        AbstractC5935c.h hVar4;
        ?? r10;
        UpdateFormResponse updateFormResponse;
        ?? r14;
        String turnId;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f23337H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f23337H = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        e eVar2 = eVar;
        Object obj2 = eVar2.f23335F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar2.f23337H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj2);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            f fVar = new f(cVar, null);
            eVar2.f23338w = hVar;
            eVar2.f23339x = null;
            eVar2.f23340y = dVar;
            eVar2.f23337H = 1;
            str = "FormWidget";
            interfaceC30057d2 = null;
            Object objM108729b2 = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, fVar, eVar2, 6, null);
            if (objM108729b2 != enumC31071a) {
                dVar2 = dVar;
                obj = objM108729b2;
                hVar2 = hVar;
            }
            interfaceC30057d3 = interfaceC30057d2;
            return enumC31071a;
        }
        if (i14 == 1) {
            d dVar3 = (d) eVar2.f23340y;
            AbstractC5935c.h hVar5 = (AbstractC5935c.h) eVar2.f23338w;
            AbstractC34132o.m107864I(obj2);
            dVar2 = dVar3;
            hVar2 = hVar5;
            str = "FormWidget";
            obj = obj2;
            interfaceC30057d2 = null;
        } else {
            if (i14 == 2) {
                AbstractC5935c.h hVar6 = (AbstractC5935c.h) eVar2.f23338w;
                AbstractC34132o.m107864I(obj2);
                hVar3 = hVar6;
                str = "FormWidget";
                objM108729b = obj2;
                interfaceC30057d3 = null;
                interfaceC30057d3 = interfaceC30057d2;
                interfaceC34385a = (InterfaceC34385a) objM108729b;
                c37378a = this.scopeCoordinator;
                eVar2.f23338w = hVar3;
                eVar2.f23339x = interfaceC30057d3;
                eVar2.f23340y = interfaceC30057d3;
                eVar2.f23341z = interfaceC30057d3;
                eVar2.f23334E = interfaceC34385a;
                eVar2.f23337H = 3;
                if (c37378a.m119657b("FormCompletionRefreshScope", eVar2) != enumC31071a) {
                    interfaceC34385a2 = interfaceC34385a;
                    hVar4 = hVar3;
                    r10 = interfaceC30057d3;
                }
                interfaceC30057d3 = interfaceC30057d2;
                return enumC31071a;
            }
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC34385a2 = (InterfaceC34385a) eVar2.f23334E;
            hVar4 = (AbstractC5935c.h) eVar2.f23338w;
            AbstractC34132o.m107864I(obj2);
            str = "FormWidget";
            r10 = 0;
        }
        if (interfaceC34385a2 instanceof InterfaceC34385a.c) {
            updateFormResponse = (UpdateFormResponse) ((C29218v0) ((InterfaceC34385a.c) interfaceC34385a2).m108735a()).f118270b;
            if (updateFormResponse != null) {
                turnId = updateFormResponse.getTurnId();
            } else {
                r14 = r10;
            }
            if (r14 != 0) {
                r14 = turnId;
                return new b.m(hVar4.getQuestionId(), hVar4.m17749e(), new InterfaceC5941i.a(r14));
            }
            r14 = turnId;
            this.logger.mo85225p(str, AbstractC11266d.m30461o("markComplete returned no turn_id. formId=", hVar4.getFormId()), new AbstractC30556a.a[0]);
            return new b.m(hVar4.getQuestionId(), hVar4.m17749e(), r10);
        }
        if (interfaceC34385a2 instanceof InterfaceC34385a.b) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC34116n interfaceC34116n2 = this.logger;
        String formId = hVar4.getFormId();
        String questionId = hVar4.getQuestionId();
        InterfaceC34385a.b<?> bVar = (InterfaceC34385a.b) interfaceC34385a2;
        String errorMessage = bVar.getErrorMessage();
        StringBuilder sbM32001t = AbstractC11895b.m32001t("markComplete failed for formId=", formId, ", questionId=", questionId, ". ");
        sbM32001t.append(errorMessage);
        interfaceC34116n2.mo85214e(str, sbM32001t.toString(), new AbstractC30556a.a[0]);
        return m17765E(bVar);
        InterfaceC34385a interfaceC34385a3 = (InterfaceC34385a) obj;
        if (interfaceC34385a3 instanceof InterfaceC34385a.b) {
            InterfaceC34116n interfaceC34116n3 = this.logger;
            String formId2 = hVar2.getFormId();
            String questionId2 = hVar2.getQuestionId();
            InterfaceC34385a.b<?> bVar2 = (InterfaceC34385a.b) interfaceC34385a3;
            String errorMessage2 = bVar2.getErrorMessage();
            StringBuilder sbM32001t2 = AbstractC11895b.m32001t("Submit failed for formId=", formId2, ", questionId=", questionId2, ". ");
            sbM32001t2.append(errorMessage2);
            interfaceC34116n3.mo85214e(str, sbM32001t2.toString(), new AbstractC30556a.a[0]);
            return m17765E(bVar2);
        }
        InterfaceC34385a.Companion companion2 = InterfaceC34385a.INSTANCE;
        InterfaceC34116n interfaceC34116n4 = this.logger;
        g gVar = new g(dVar2, interfaceC30057d2);
        eVar2.f23338w = hVar2;
        eVar2.f23339x = interfaceC30057d2;
        eVar2.f23340y = interfaceC30057d2;
        eVar2.f23341z = interfaceC30057d2;
        eVar2.f23337H = 2;
        hVar3 = hVar2;
        objM108729b = InterfaceC34385a.Companion.m108729b(companion2, interfaceC34116n4, null, null, gVar, eVar2, 6, null);
        if (objM108729b != enumC31071a) {
            interfaceC30057d3 = interfaceC30057d2;
            interfaceC34385a = (InterfaceC34385a) objM108729b;
            c37378a = this.scopeCoordinator;
            eVar2.f23338w = hVar3;
            eVar2.f23339x = interfaceC30057d3;
            eVar2.f23340y = interfaceC30057d3;
            eVar2.f23341z = interfaceC30057d3;
            eVar2.f23334E = interfaceC34385a;
            eVar2.f23337H = 3;
            if (c37378a.m119657b("FormCompletionRefreshScope", eVar2) != enumC31071a) {
                interfaceC34385a2 = interfaceC34385a;
                hVar4 = hVar3;
                r10 = interfaceC30057d3;
                if (interfaceC34385a2 instanceof InterfaceC34385a.c) {
                    updateFormResponse = (UpdateFormResponse) ((C29218v0) ((InterfaceC34385a.c) interfaceC34385a2).m108735a()).f118270b;
                    if (updateFormResponse != null) {
                        turnId = updateFormResponse.getTurnId();
                    } else {
                        r14 = r10;
                    }
                    if (r14 != 0) {
                        r14 = turnId;
                        return new b.m(hVar4.getQuestionId(), hVar4.m17749e(), new InterfaceC5941i.a(r14));
                    }
                    r14 = turnId;
                    this.logger.mo85225p(str, AbstractC11266d.m30461o("markComplete returned no turn_id. formId=", hVar4.getFormId()), new AbstractC30556a.a[0]);
                    return new b.m(hVar4.getQuestionId(), hVar4.m17749e(), r10);
                }
                if (interfaceC34385a2 instanceof InterfaceC34385a.b) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC34116n interfaceC34116n5 = this.logger;
                String formId3 = hVar4.getFormId();
                String questionId3 = hVar4.getQuestionId();
                InterfaceC34385a.b<?> bVar3 = (InterfaceC34385a.b) interfaceC34385a2;
                String errorMessage3 = bVar3.getErrorMessage();
                StringBuilder sbM32001t3 = AbstractC11895b.m32001t("markComplete failed for formId=", formId3, ", questionId=", questionId3, ". ");
                sbM32001t3.append(errorMessage3);
                interfaceC34116n5.mo85214e(str, sbM32001t3.toString(), new AbstractC30556a.a[0]);
                return m17765E(bVar3);
            }
        }
        interfaceC30057d3 = interfaceC30057d2;
        return enumC31071a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
    
        if (r13.m119657b("FormCompletionRefreshScope", r6) == r0) goto L24;
     */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m17782r(com.whoop.p057ai.chat.domain.formwidget.AbstractC5935c.h r12, com.whoop.p057ai.chat.domain.formwidget.C5938f.c r13, q83.InterfaceC30057d<? super com.whoop.p057ai.chat.domain.formwidget.C5938f.b> r14) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.p057ai.chat.domain.formwidget.C5938f.m17782r(com.whoop.ai.chat.domain.formwidget.c$h, com.whoop.ai.chat.domain.formwidget.f$c, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final Object m17783s(AbstractC5935c.h hVar, InterfaceC30057d<? super b> interfaceC30057d) {
        c cVarM17790z = m17790z(hVar.getOnAnswer(), hVar.m17749e());
        if (cVarM17790z == null) {
            return m17786v("onAnswer", hVar.getFormId(), hVar.getQuestionId());
        }
        if (!hVar.getIsFinalQuestion()) {
            return m17762B(new k(hVar, cVarM17790z, null), interfaceC30057d);
        }
        d dVarM17761A = m17761A(hVar.getOnComplete());
        return dVarM17761A == null ? m17786v("onComplete", hVar.getFormId(), hVar.getQuestionId()) : m17762B(new j(hVar, cVarM17790z, dVarM17761A, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: t */
    private final boolean m17784t(C5936d c5936d) {
        return (AbstractC22676k.m65745e(c5936d.getSubmitState(), InterfaceC5942j.c.f23434a) && c5936d.getCurrentQuestionIndex() <= 0 && c5936d.m17757g().isEmpty() && c5936d.getModerationError() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public final b m17785u(InterfaceC29354a<DesignSystemModel> cacheResult, String formKey) {
        if (cacheResult instanceof InterfaceC29354a.e) {
            return null;
        }
        if (cacheResult instanceof InterfaceC29354a.a.C42173a) {
            return new b.i((DesignSystemModel) ((InterfaceC29354a.a.C42173a) cacheResult).getData());
        }
        if (cacheResult instanceof InterfaceC29354a.a.b) {
            return new b.i((DesignSystemModel) ((InterfaceC29354a.a.b) cacheResult).getData());
        }
        if (!(cacheResult instanceof InterfaceC29354a.c)) {
            if (!(cacheResult instanceof InterfaceC29354a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            this.logger.mo85214e("FormWidget", AbstractC31061c.m95640p("Fetch failed with network error (stale data returned). formKey=", formKey, ". ", ((InterfaceC29354a.d) cacheResult).getErrorMessage()), new AbstractC30556a.a[0]);
            return b.f.f23315a;
        }
        InterfaceC29354a.c cVar = (InterfaceC29354a.c) cacheResult;
        if (cVar.getHttpStatusCode() == 0) {
            this.logger.mo85214e("FormWidget", AbstractC31061c.m95640p("Fetch failed with network error (no data). formKey=", formKey, ". ", cVar.getErrorMessage()), new AbstractC30556a.a[0]);
            return b.f.f23315a;
        }
        InterfaceC34116n interfaceC34116n = this.logger;
        int httpStatusCode = cVar.getHttpStatusCode();
        String errorMessage = cVar.getErrorMessage();
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(httpStatusCode, "Fetch failed with HTTP ", ". formKey=", formKey, ". ");
        sbM53373n.append(errorMessage);
        interfaceC34116n.mo85214e("FormWidget", sbM53373n.toString(), new AbstractC30556a.a[0]);
        return new b.g(formKey);
    }

    /* JADX INFO: renamed from: v */
    private final b m17786v(String field, String formId, String questionId) {
        this.logger.mo85214e("FormWidget", AbstractC25012a.m73376i(questionId, " — no client-built fallback", AbstractC11895b.m32001t("Submit missing/invalid ", field, " action for formId=", formId, ", questionId=")), new AbstractC30556a.a[0]);
        return new b.n(new InterfaceC5941i.b(AbstractC4328b.b.f17585b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public final InterfaceC13058l m17787w(AbstractC5935c.d action) {
        return new C13084s1(new n(action, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public final C5936d m17788x(C5936d state, b action) {
        List<FormQuestionModel> questions;
        if (action instanceof b.h) {
            return new C5936d(InterfaceC5934b.a.f23276a, null, null, null, 0, null, null, 126, null);
        }
        if (action instanceof b.i) {
            return new C5936d(null, ((b.i) action).getWidget(), null, null, 0, null, null, 125, null);
        }
        if (action instanceof b.f) {
            return new C5936d(InterfaceC5934b.b.f23277a, null, null, null, 0, null, null, 126, null);
        }
        if (action instanceof b.g) {
            return new C5936d(new InterfaceC5934b.c(((b.g) action).getFormKey()), null, null, null, 0, null, null, 126, null);
        }
        if (action instanceof b.k) {
            return m17784t(state) ? state : new C5936d(null, ((b.k) action).getWidget(), null, null, 0, null, null, 125, null);
        }
        if (action instanceof b.q) {
            return C5936d.m17751b(state, null, null, InterfaceC5942j.d.f23435a, null, 0, null, null, 51, null);
        }
        if (action instanceof b.p) {
            return C5936d.m17751b(state, null, null, InterfaceC5942j.a.f23432a, null, 0, null, null, 51, null);
        }
        if (action instanceof b.l) {
            b.l lVar = (b.l) action;
            return C5936d.m17751b(state, null, null, InterfaceC5942j.c.f23434a, null, state.getCurrentQuestionIndex() + 1, AbstractC25247g0.m73996e0(state.m17757g(), new C23465k(lVar.getQuestionId(), lVar.m17795b())), null, 67, null);
        }
        if (action instanceof b.m) {
            b.m mVar = (b.m) action;
            return C5936d.m17751b(state, null, null, InterfaceC5942j.a.f23432a, mVar.getResult(), 0, AbstractC25247g0.m73996e0(state.m17757g(), new C23465k(mVar.getQuestionId(), mVar.m17798c())), null, 83, null);
        }
        if (action instanceof b.n) {
            return C5936d.m17751b(state, null, null, InterfaceC5942j.b.f23433a, ((b.n) action).getResult(), 0, null, null, 115, null);
        }
        if (action instanceof b.o) {
            return C5936d.m17751b(state, null, null, InterfaceC5942j.c.f23434a, null, 0, null, ((b.o) action).getMessage(), 51, null);
        }
        if (action instanceof b.C41369b) {
            return state.getCurrentQuestionIndex() > 0 ? C5936d.m17751b(state, null, null, AbstractC5937e.m17760a(state.getSubmitState()), null, state.getCurrentQuestionIndex() - 1, null, null, 35, null) : state;
        }
        if (action instanceof b.c) {
            DesignSystemModel widget = state.getWidget();
            FormWidgetModel formWidgetModel = widget instanceof FormWidgetModel ? (FormWidgetModel) widget : null;
            return state.getCurrentQuestionIndex() < ((formWidgetModel == null || (questions = formWidgetModel.getQuestions()) == null) ? 0 : questions.size()) + (-1) ? C5936d.m17751b(state, null, null, AbstractC5937e.m17760a(state.getSubmitState()), null, state.getCurrentQuestionIndex() + 1, null, null, 99, null) : state;
        }
        if ((action instanceof b.d) || (action instanceof b.e)) {
            return state;
        }
        if (action instanceof b.a) {
            return C5936d.m17751b(state, null, null, null, null, 0, null, null, 55, null);
        }
        if (action instanceof b.j) {
            return new C5936d(null, null, null, null, 0, null, null, 127, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public final InterfaceC13058l m17789y(String formKey) {
        return new C13084s1(new o(formKey, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public final c m17790z(Action action, List<C5940h> selections) {
        Request request;
        JsonElement body;
        Object objM107888l;
        UpdateAction updateAction = action instanceof UpdateAction ? (UpdateAction) action : null;
        if (updateAction != null && (request = updateAction.getRequest()) != null && AbstractC39421y.m125921F(request.getMethod(), "PUT", true) && (body = request.getBody()) != null) {
            try {
                AbstractC0757c abstractC0757cM109496c = AbstractC34650k.m109496c();
                abstractC0757cM109496c.getClass();
                objM107888l = (SubmitFormAnswersRequest) abstractC0757cM109496c.m1830a(SubmitFormAnswersRequest.INSTANCE.serializer(), body);
            } catch (Throwable th3) {
                objM107888l = AbstractC34132o.m107888l(th3);
            }
            if (objM107888l instanceof C23467m) {
                objM107888l = null;
            }
            SubmitFormAnswersRequest submitFormAnswersRequest = (SubmitFormAnswersRequest) objM107888l;
            if (submitFormAnswersRequest != null) {
                String path = request.getPath();
                List<C5940h> list = selections;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(m17764D((C5940h) it.next()));
                }
                return new c(path, SubmitFormAnswersRequest.copy$default(submitFormAnswersRequest, null, null, null, arrayList, 7, null));
            }
        }
        return null;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36610t(AbstractC13091v.m36612v(new C13060l1(new C5936d(null, null, null, null, 0, null, null, 127, null), AbstractC13091v.m36590P(upstream, new l(null, this)), new m(null)), 1));
    }
}
