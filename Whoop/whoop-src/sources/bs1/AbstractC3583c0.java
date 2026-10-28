package bs1;

import a00.C0073h;
import a01.C0089i;
import a81.C0556g;
import am2.C1008b;
import am2.C1012d;
import am2.C1040r;
import am2.C1042s;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import ar2.C1935f;
import b30.C2609r;
import b30.C2633u2;
import b91.C2886a;
import bb2.C2931g;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import be1.C3169c;
import bg0.C3226h;
import bm2.C3424a0;
import bo2.C3509a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import c93.InterfaceC4353o;
import com.mapbox.common.HttpHeaders;
import com.whoop.coacheverywherecommon.models.AbstractC6219a;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.models.calendar.CalendarDateModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.C9598e;
import cs1.AbstractC11103c;
import d13.AbstractC11478a;
import dp0.AbstractC12250f;
import ds1.AbstractC12331a;
import ds1.AbstractC12336f;
import ds1.C12332b;
import ds1.C12333c;
import ds1.C12337g;
import ds1.C12341k;
import ds1.C12344n;
import ec3.C13084s1;
import ec3.InterfaceC13062m;
import ep0.C13404j;
import gb1.AbstractC15676d;
import ge3.AbstractC15751g;
import gy0.AbstractC16277f;
import gz0.AbstractC16319p0;
import h11.AbstractC16611f;
import h11.C16613h;
import h91.C17027b;
import hy0.AbstractC17766l1;
import i11.AbstractC17862e;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import io.sentry.config.AbstractC20301a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import km0.C22580d;
import km0.C22581e;
import km0.C22582f;
import km0.C22583g;
import kotlin.C2032u;
import l41.AbstractC23332d;
import l83.C23454a0;
import l83.C23465k;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import live.hms.video.error.ErrorCodes;
import live.hms.video.utils.AndroidSDKConstants;
import m12.AbstractC24936d;
import m12.C24937e;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import nf3.C26669a;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27282u;
import ny0.AbstractC27292z;
import ny0.EnumC27284v;
import org.joda.time.LocalTime;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p000.C0003a0;
import p000.C13762f;
import p000.C17820i;
import p000.C21061j;
import p000.C26047n;
import p000.C29656q;
import p000.C3718c;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.AbstractC2294a;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p027b3.C2463x1;
import p027b3.InterfaceC2464x2;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p132f0.C13821r1;
import p163g1.AbstractC15005f3;
import p163g1.AbstractC15166v0;
import p163g1.C15077m1;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p164g2.C15240l;
import p164g2.InterfaceC15237i;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17894k0;
import p208i2.C17909s;
import p208i2.C17919x;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22957g;
import p291l0.C22961h;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22997s1;
import p291l0.InterfaceC23013y;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28617g1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p390p1.InterfaceC28690z0;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39147y;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22669g0;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p745y81.AbstractC39330c;
import pf.AbstractC29125c;
import pf3.C29155a;
import pr1.AbstractC29492c;
import pz0.AbstractC29641d;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30784c;
import qz0.AbstractC30792k;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sr1.EnumC32914f;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.C35666g;
import vf3.InterfaceC35951a;
import w71.AbstractC36877d;
import w71.C36873b;
import wb3.AbstractC37056f;
import x81.C38072d;
import xf3.C38266c;
import yb3.AbstractC39421y;
import yr1.EnumC39731b;
import zr1.AbstractC41068b;
import zr1.AbstractC41069c;

/* JADX INFO: renamed from: bs1.c0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u00ad\u0004\u0010-\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00132$\u0010\u0019\u001a \u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00152\u001a\b\u0002\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040\u000f2\u001a\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u00040\u000f2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u001c\b\u0002\u0010#\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0004\u0012\u00020\u00040\u000f2\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010&\u001a\u00020\u00062\b\b\u0002\u0010'\u001a\u00020\u001c2\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010)\u001a\u00020\u00062\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\b\u0002\u0010+\u001a\u00020\u00162\u001a\b\u0002\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040\u000fH\u0007¢\u0006\u0004\b-\u0010.\u001a9\u00104\u001a\u00020\u00042\f\u00101\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u00103\u001a\u0002022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b4\u00105\u001a9\u00108\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0003¢\u0006\u0004\b8\u00109\u001a!\u0010<\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010;\u001a\u00020:H\u0003¢\u0006\u0004\b<\u0010=\u001a9\u0010A\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020>2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0003¢\u0006\u0004\bA\u0010B\u001a?\u0010E\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\bE\u0010F\u001a3\u0010G\u001a\u00020\u00042\u0006\u0010;\u001a\u00020:2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\bG\u0010H\u001a1\u0010K\u001a\u00020\u00042\u0006\u0010I\u001a\u00020\u00062\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u00172\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0003¢\u0006\u0004\bK\u0010L\u001a\u0081\u0001\u0010U\u001a\u00020\u00042\b\u0010M\u001a\u0004\u0018\u00010\"2\u0018\u0010N\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00040\u000f2\u0014\u0010P\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010O\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020S2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\bU\u0010V\u001a?\u0010[\u001a\u00020\u00042\b\b\u0002\u0010W\u001a\u00020\u00062\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010X2\u0018\u0010Z\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00040\u000fH\u0003¢\u0006\u0004\b[\u0010\\\u001aS\u0010c\u001a\u00020\u00042\b\b\u0002\u0010]\u001a\u00020\u00172\b\b\u0002\u0010^\u001a\u00020\u00172\u0006\u0010_\u001a\u00020O2\u0006\u0010`\u001a\u00020O2\b\b\u0002\u0010a\u001a\u00020\u00172\u0014\u0010b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010O\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\bc\u0010d\u001a«\u0001\u0010g\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00040\u00022\u001a\b\u0002\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040\u000f2\u0014\b\u0002\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040\u00022*\u0010\u0019\u001a&\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0003¢\u0006\u0004\bg\u0010h\u001a-\u0010j\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020i2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\bj\u0010k\u001aI\u0010r\u001a\u00020\u00042\b\u0010m\u001a\u0004\u0018\u00010l2\u0006\u0010n\u001a\u00020\u00172\b\u0010o\u001a\u0004\u0018\u00010\u00172\u0006\u0010p\u001a\u00020\u00062\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020q\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\br\u0010s\u001aO\u0010y\u001a\u00020\u00042\u0006\u0010t\u001a\u00020$2\b\u0010v\u001a\u0004\u0018\u00010u2\u0018\u0010x\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020w0/\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\by\u0010z\u001a'\u0010|\u001a\b\u0012\u0004\u0012\u00020w0/2\b\u0010{\u001a\u0004\u0018\u00010u2\u0006\u0010t\u001a\u00020$H\u0000¢\u0006\u0004\b|\u0010}\u001a\u001c\u0010\u007f\u001a\u00020:*\u00020:2\u0006\u0010~\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001\u001a\u001e\u0010\u0081\u0001\u001a\u00020:*\u00020:2\u0006\u0010~\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0080\u0001\u001a]\u0010\u0083\u0001\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002$\u0010\u0019\u001a \u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00152\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00040\u00022\u0007\u0010\u0082\u0001\u001a\u00020$H\u0000¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001\u001ag\u0010\u0089\u0001\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00062\u0007\u0010\u0085\u0001\u001a\u00020\u00062\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00040\u00022\u000e\u0010\u0087\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060\u0086\u00012\u000e\u0010\u0088\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060\u0086\u00012\u0006\u0010T\u001a\u00020S2\u0006\u0010R\u001a\u00020QH\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001\u001aV\u0010\u008b\u0001\u001a\u00020\u00042\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00040\u00022\u000e\u0010\u0087\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060\u0086\u00012\u000e\u0010\u0088\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060\u0086\u00012\u0006\u0010T\u001a\u00020S2\u0006\u0010R\u001a\u00020QH\u0002¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001¨\u0006\u0092\u0001²\u0006\u000e\u0010\u008e\u0001\u001a\u00030\u008d\u00018\nX\u008a\u0084\u0002²\u0006\u000f\u0010\u008f\u0001\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0090\u00018\nX\u008a\u0084\u0002"}, m65681d2 = {"Lds1/k;", "viewState", "Lkotlin/Function1;", "Lw71/d;", "Ll83/a0;", "onJournalQuestionClicked", "", "defaultToggleCallbackType", "Lkotlin/Function0;", "onRefresh", "onSavedClicked", "onSavedFinish", "onExitClicked", "exit", "onNeverShowDismissDialogClick", "Lkotlin/Function2;", "onDismissConfirmationDialogClicked", "onDefaultsQuestionClicked", "showOnboardingOverlay", "Lm12/e;", "defaultOnboardingstate", "Lkotlin/Function4;", "", "", "Lyr1/b;", "onDateClicked", "onPillClicked", "onCalendarOpened", "", "onCalendarPaged", "Lcom/whoop/navigation/e;", "onNavigationButtonClicked", "onSearchFieldFocusChanged", "onBottomSheetDismissed", "Lds1/a;", "onBottomSheetStateChanged", "", "onViewEvent", "showCustomizeOnStart", "initialScrollPosition", "onScrollPositionChanged", "scrollToTopRequest", "onScrollToTopConsumed", "scrollEntryFallbackCycleId", "onSyncScrollEntry", "r1", "(Lds1/k;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/a;ZLm12/e;Lc93/n;Lc93/m;Lc93/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/m;Lkotlin/jvm/functions/Function1;ZILkotlin/jvm/functions/Function1;ZLc93/a;JLc93/m;Landroidx/compose/runtime/Composer;IIII)V", "", "Lw71/b;", "questions", "Lg2/i;", "focusManager", "X0", "(Ljava/util/List;Lg2/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "isIntraday", "onCustomizeJournalClicked", "q2", "(ZLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "L0", "(Lds1/k;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lds1/c;", "isToggledEnabledCallback", "supportClicked", "B0", "(Lds1/c;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "", "scrollYPosition", "k1", "(Lds1/k;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "I0", "(Landroidx/compose/ui/Modifier;Lds1/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "isJournalEditable", "buttonText", "o1", "(ZLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "type", "timeCallback", "", "currentInput", "Lv41/f$a;", "bottomSheetGestures", "Lbc3/c0;", "coroutineScope", "G0", "(Lds1/a;Lc93/m;Lkotlin/jvm/functions/Function1;Lv41/f$a;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "is24HourFormat", "Lorg/joda/time/LocalTime;", "initialTime", "currentTime", "n2", "(ZLorg/joda/time/LocalTime;Lc93/m;Landroidx/compose/runtime/Composer;II)V", "questionLabel", "currentValue", "min", "max", "unit", "inputCallBack", "a1", "(Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "onCalendarClicked", "Lkotlin/Function5;", "N0", "(Lds1/k;Lkotlin/jvm/functions/Function1;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/o;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Lds1/n;", "f1", "(Lds1/n;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lds1/f;", "datePickerState", HttpHeaders.DATE, "currentDate", "hasUserEditJournal", "Lcs1/c;", "B2", "(Lds1/f;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "viewEvent", "Lds1/b;", "shouldShowBottomSheet", "Lkm0/d;", "onEnableConfirmationDialog", "v2", "(Ljava/lang/Object;Lds1/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "bottomSheetInfo", "u2", "(Lds1/b;Ljava/lang/Object;)Ljava/util/List;", "showIntradayGradient", "y2", "(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;", "z2", NotificationCompat.CATEGORY_EVENT, "w2", "(Lds1/k;Lc93/n;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V", "isLoading", "Lp1/c1;", "isFirstSearchBarFocus", "isHidingBottomSheetFromSave", "x2", "(ZZLkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lbc3/c0;Lv41/f$a;)V", "A2", "(Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lbc3/c0;Lv41/f$a;)V", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "showCalendar", "Lb3/x2;", "keyboard", "journal_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3583c0 {

    /* JADX INFO: renamed from: bs1.c0$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f14507w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f14508x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f14509y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f14507w = c38266c;
            this.f14508x = interfaceC35951a;
            this.f14509y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            return this.f14507w.m122602a(this.f14509y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), this.f14508x);
        }
    }

    /* JADX INFO: renamed from: bs1.c0$b */
    @InterfaceC32271e(m100429c = "com.whoop.journal.view.screen.JournalSurveyAnswerScreenKt$SurveyAnswerScreen$10$1", m100430f = "JournalSurveyAnswerScreen.kt", m100431l = {187}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C12341k f14510E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C15199y3 f14511F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ Function1 f14512G;

        /* JADX INFO: renamed from: w */
        Object f14513w;

        /* JADX INFO: renamed from: x */
        Object f14514x;

        /* JADX INFO: renamed from: y */
        int f14515y;

        /* JADX INFO: renamed from: z */
        int f14516z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C12341k c12341k, C15199y3 c15199y3, Function1 function1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f14510E = c12341k;
            this.f14511F = c15199y3;
            this.f14512G = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f14510E, this.f14511F, this.f14512G, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C9598e c9598e;
            Function1 function1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f14516z;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C9598e c9598eM34456o = this.f14510E.getIsSuccess().getOnSaveNavigation();
                if (c9598eM34456o != null) {
                    C15199y3 c15199y3 = this.f14511F;
                    Function1 function2 = this.f14512G;
                    this.f14513w = function2;
                    this.f14514x = c9598eM34456o;
                    this.f14515y = 0;
                    this.f14516z = 1;
                    if (c15199y3.m43223d(this) == enumC31071a) {
                        return enumC31071a;
                    }
                    c9598e = c9598eM34456o;
                    function1 = function2;
                }
                return C23454a0.f92919a;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c9598e = (C9598e) this.f14514x;
            function1 = (Function1) this.f14513w;
            AbstractC34132o.m107864I(obj);
            function1.invoke(c9598e);
            function1.invoke(AbstractC11103c.d.f35269a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: bs1.c0$c */
    @InterfaceC32271e(m100429c = "com.whoop.journal.view.screen.JournalSurveyAnswerScreenKt$SurveyAnswerScreen$11$1", m100430f = "JournalSurveyAnswerScreen.kt", m100431l = {198, 204}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ boolean f14517E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C13821r1 f14518F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ Function1 f14519G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ InterfaceC4339a f14520H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ int f14521I;

        /* JADX INFO: renamed from: w */
        int f14522w;

        /* JADX INFO: renamed from: x */
        int f14523x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f14524y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f14525z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z4, InterfaceC28601c1 interfaceC28601c1, boolean z13, C13821r1 c13821r1, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f14524y = z4;
            this.f14525z = interfaceC28601c1;
            this.f14517E = z13;
            this.f14518F = c13821r1;
            this.f14519G = function1;
            this.f14520H = interfaceC4339a;
            this.f14521I = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f14524y, this.f14525z, this.f14517E, this.f14518F, this.f14519G, this.f14520H, this.f14521I, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
        
            if (r7.m39185g(0, r6) == r0) goto L28;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r6.f14523x
                l83.a0 r2 = l83.C23454a0.f92919a
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L21
                if (r1 == r4) goto L1d
                if (r1 != r3) goto L15
                int r0 = r6.f14522w
                p505ts.AbstractC34132o.m107864I(r7)
                goto L6d
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L3f
            L21:
                p505ts.AbstractC34132o.m107864I(r7)
                boolean r7 = r6.f14524y
                if (r7 != 0) goto L29
                goto L77
            L29:
                p1.c1 r7 = r6.f14525z
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                r7.setValue(r1)
                boolean r7 = r6.f14517E
                if (r7 == 0) goto L4f
                f0.r1 r7 = r6.f14518F
                r6.f14523x = r4
                java.lang.Object r7 = r7.m39185g(r5, r6)
                if (r7 != r0) goto L3f
                goto L6b
            L3f:
                kotlin.jvm.functions.Function1 r7 = r6.f14519G
                java.lang.Integer r0 = new java.lang.Integer
                r0.<init>(r5)
                r7.invoke(r0)
                c93.a r7 = r6.f14520H
                r7.invoke()
                return r2
            L4f:
                int r7 = r6.f14521I
                if (r7 >= 0) goto L54
                goto L55
            L54:
                r5 = r7
            L55:
                f0.r1 r7 = r6.f14518F
                p1.h1 r7 = r7.f49318a
                int r7 = r7.m87024x()
                if (r7 == r5) goto L77
                f0.r1 r7 = r6.f14518F
                r6.f14522w = r5
                r6.f14523x = r3
                java.lang.Object r7 = r7.m39185g(r5, r6)
                if (r7 != r0) goto L6c
            L6b:
                return r0
            L6c:
                r0 = r5
            L6d:
                kotlin.jvm.functions.Function1 r7 = r6.f14519G
                java.lang.Integer r1 = new java.lang.Integer
                r1.<init>(r0)
                r7.invoke(r1)
            L77:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: bs1.AbstractC3583c0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: bs1.c0$d */
    @InterfaceC32271e(m100429c = "com.whoop.journal.view.screen.JournalSurveyAnswerScreenKt$SurveyAnswerScreen$12$1", m100430f = "JournalSurveyAnswerScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC4351m f14526E;

        /* JADX INFO: renamed from: w */
        int f14527w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f14528x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ List<C16613h> f14529y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ long f14530z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, List<C16613h> list, long j7, InterfaceC4351m interfaceC4351m, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f14528x = str;
            this.f14529y = list;
            this.f14530z = j7;
            this.f14526E = interfaceC4351m;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f14528x, this.f14529y, this.f14530z, this.f14526E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object next;
            Long lM47165e;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f14527w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            String str = this.f14528x;
            if (str != null) {
                List<C16613h> list = this.f14529y;
                long jLongValue = this.f14530z;
                InterfaceC4351m interfaceC4351m = this.f14526E;
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!AbstractC22676k.m65745e(((C16613h) next).getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), str));
                    C16613h c16613h = (C16613h) next;
                    if (c16613h != null && (lM47165e = c16613h.getCycleId()) != null) {
                        Long l7 = lM47165e.longValue() != -1 ? lM47165e : null;
                        if (l7 != null) {
                            jLongValue = l7.longValue();
                        }
                    }
                }
                interfaceC4351m.invoke(new Long(jLongValue), str);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: bs1.c0$e */
    @InterfaceC32271e(m100429c = "com.whoop.journal.view.screen.JournalSurveyAnswerScreenKt$SurveyAnswerScreen$13$1", m100430f = "JournalSurveyAnswerScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f14531E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f14532F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC2994c0 f14533G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ AbstractC35664f.a f14534H;

        /* JADX INFO: renamed from: w */
        int f14535w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f14536x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C12341k f14537y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f14538z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z4, C12341k c12341k, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f14536x = z4;
            this.f14537y = c12341k;
            this.f14538z = function1;
            this.f14531E = interfaceC28601c1;
            this.f14532F = interfaceC28601c2;
            this.f14533G = interfaceC2994c0;
            this.f14534H = aVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f14536x, this.f14537y, this.f14538z, this.f14531E, this.f14532F, this.f14533G, this.f14534H, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f14535w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC3583c0.m10908x2(this.f14536x, this.f14537y.getIsLoading(), this.f14538z, this.f14531E, this.f14532F, this.f14533G, this.f14534H);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: bs1.c0$f */
    @InterfaceC32271e(m100429c = "com.whoop.journal.view.screen.JournalSurveyAnswerScreenKt$SurveyAnswerScreen$16$1$1$1", m100430f = "JournalSurveyAnswerScreen.kt", m100431l = {276}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f14539w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC35664f.a f14540x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AbstractC35664f.a aVar, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f14540x = aVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f14540x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f14539w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3M112950a = this.f14540x.getModalBottomSheetState();
                this.f14539w = 1;
                if (c15199y3M112950a.m43223d(this) == enumC31071a) {
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
    }

    /* JADX INFO: renamed from: bs1.c0$g */
    @InterfaceC32271e(m100429c = "com.whoop.journal.view.screen.JournalSurveyAnswerScreenKt$SurveyAnswerScreen$17$1", m100430f = "JournalSurveyAnswerScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28670t2 f14541E;

        /* JADX INFO: renamed from: w */
        int f14542w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f14543x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C12341k f14544y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f14545z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C15199y3 c15199y3, C12341k c12341k, Function1 function1, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f14543x = c15199y3;
            this.f14544y = c12341k;
            this.f14545z = function1;
            this.f14541E = interfaceC28670t2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new g(this.f14543x, this.f14544y, this.f14545z, this.f14541E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f14542w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f14543x.m43222c() == EnumC15209z3.f57106w && this.f14544y.getIsSuccess().getShouldShowBottomSheet() != null) {
                if (this.f14544y.getIsSuccess().getShouldShowBottomSheet().getType() instanceof AbstractC12331a.a) {
                    InterfaceC2464x2 interfaceC2464x2M10907x1 = AbstractC3583c0.m10907x1(this.f14541E);
                    if (interfaceC2464x2M10907x1 != null) {
                        ((C2463x1) interfaceC2464x2M10907x1).m7442a();
                    }
                } else {
                    this.f14545z.invoke(new AbstractC36877d.h(-1, "25:25"));
                }
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: bs1.c0$h */
    @InterfaceC32271e(m100429c = "com.whoop.journal.view.screen.JournalSurveyAnswerScreenKt$SurveyAnswerScreen$18$1", m100430f = "JournalSurveyAnswerScreen.kt", m100431l = {305}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C12341k f14546E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f14547F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC4339a f14548G;

        /* JADX INFO: renamed from: w */
        Object f14549w;

        /* JADX INFO: renamed from: x */
        int f14550x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC35664f.a f14551y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4351m f14552z;

        /* JADX INFO: renamed from: bs1.c0$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ InterfaceC4339a f14553E;

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC4351m f14554w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C12341k f14555x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC28601c1 f14556y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C22669g0 f14557z;

            public a(InterfaceC4351m interfaceC4351m, C12341k c12341k, InterfaceC28601c1 interfaceC28601c1, C22669g0 c22669g0, InterfaceC4339a interfaceC4339a) {
                this.f14554w = interfaceC4351m;
                this.f14555x = c12341k;
                this.f14556y = interfaceC28601c1;
                this.f14557z = c22669g0;
                this.f14553E = interfaceC4339a;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(EnumC15209z3 enumC15209z3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                InterfaceC4351m interfaceC4351m = this.f14554w;
                EnumC15209z3 enumC15209z4 = EnumC15209z3.f57106w;
                Boolean boolValueOf = Boolean.valueOf(enumC15209z3 != enumC15209z4);
                C12332b c12332bM34459r = this.f14555x.getIsSuccess().getShouldShowBottomSheet();
                interfaceC4351m.invoke(boolValueOf, c12332bM34459r != null ? c12332bM34459r.getType() : null);
                if (enumC15209z3 == enumC15209z4 && !((Boolean) this.f14556y.getValue()).booleanValue()) {
                    this.f14556y.setValue(Boolean.FALSE);
                    Object obj = this.f14557z.f89336w;
                    if (obj != null && obj != enumC15209z4) {
                        this.f14553E.invoke();
                    }
                }
                this.f14557z.f89336w = enumC15209z3;
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(AbstractC35664f.a aVar, InterfaceC4351m interfaceC4351m, C12341k c12341k, InterfaceC28601c1 interfaceC28601c1, InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f14551y = aVar;
            this.f14552z = interfaceC4351m;
            this.f14546E = c12341k;
            this.f14547F = interfaceC28601c1;
            this.f14548G = interfaceC4339a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final EnumC15209z3 m10918h(AbstractC35664f.a aVar) {
            return aVar.getModalBottomSheetState().m43221b();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new h(this.f14551y, this.f14552z, this.f14546E, this.f14547F, this.f14548G, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f14550x;
            if (i13 == 0) {
                C22669g0 c22669g0M32004w = AbstractC11895b.m32004w(obj);
                C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new C3598q(this.f14551y, 2));
                a aVar = new a(this.f14552z, this.f14546E, this.f14547F, c22669g0M32004w, this.f14548G);
                this.f14549w = null;
                this.f14550x = 1;
                if (c13084s1M87240H.collect(aVar, this) == enumC31071a) {
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
    }

    /* JADX INFO: renamed from: bs1.c0$i */
    @InterfaceC32271e(m100429c = "com.whoop.journal.view.screen.JournalSurveyAnswerScreenKt$SurveyAnswerScreen$19$1$1$1$1", m100430f = "JournalSurveyAnswerScreen.kt", m100431l = {344}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f14558w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f14559x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C15199y3 c15199y3, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f14559x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new i(this.f14559x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f14558w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f14559x;
                this.f14558w = 1;
                if (c15199y3.m43223d(this) == enumC31071a) {
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
    }

    /* JADX INFO: renamed from: bs1.c0$j */
    @InterfaceC32271e(m100429c = "com.whoop.journal.view.screen.JournalSurveyAnswerScreenKt$SurveyAnswerScreen$19$1$2$1$1", m100430f = "JournalSurveyAnswerScreen.kt", m100431l = {335}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f14560w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f14561x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C15199y3 c15199y3, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f14561x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new j(this.f14561x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f14560w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f14561x;
                this.f14560w = 1;
                if (c15199y3.m43223d(this) == enumC31071a) {
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
    }

    /* JADX INFO: renamed from: bs1.c0$k */
    @InterfaceC32271e(m100429c = "com.whoop.journal.view.screen.JournalSurveyAnswerScreenKt$SurveyAnswerScreen$19$1$3$1$2$1", m100430f = "JournalSurveyAnswerScreen.kt", m100431l = {369}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f14562w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC35664f.a f14563x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(AbstractC35664f.a aVar, InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f14563x = aVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new k(this.f14563x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((k) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f14562w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3M112950a = this.f14563x.getModalBottomSheetState();
                this.f14562w = 1;
                if (c15199y3M112950a.m43223d(this) == enumC31071a) {
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
    }

    /* JADX INFO: renamed from: bs1.c0$l */
    @InterfaceC32271e(m100429c = "com.whoop.journal.view.screen.JournalSurveyAnswerScreenKt$SurveyAnswerScreen$19$2$6$3$1$1", m100430f = "JournalSurveyAnswerScreen.kt", m100431l = {473}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class l extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f14564w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12341k f14565x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C15199y3 f14566y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(C12341k c12341k, C15199y3 c15199y3, InterfaceC30057d<? super l> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f14565x = c12341k;
            this.f14566y = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new l(this.f14565x, this.f14566y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((l) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f14564w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (this.f14565x.getIsSuccess().getShouldShowBottomSheet() != null && !this.f14566y.m43224e() && !(this.f14565x.getIsSuccess().getShouldShowBottomSheet().getType() instanceof AbstractC12331a.a)) {
                    C15199y3 c15199y3 = this.f14566y;
                    this.f14564w = 1;
                    if (c15199y3.m43225f(this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: bs1.c0$m */
    @InterfaceC32271e(m100429c = "com.whoop.journal.view.screen.JournalSurveyAnswerScreenKt$SurveyAnswerScreen$19$2$7$1$1", m100430f = "JournalSurveyAnswerScreen.kt", m100431l = {659}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class m extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f14567w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC35664f.a f14568x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(AbstractC35664f.a aVar, InterfaceC30057d<? super m> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f14568x = aVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new m(this.f14568x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((m) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f14567w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3M112950a = this.f14568x.getModalBottomSheetState();
                this.f14567w = 1;
                if (c15199y3M112950a.m43223d(this) == enumC31071a) {
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
    }

    /* JADX INFO: renamed from: bs1.c0$n */
    @InterfaceC32271e(m100429c = "com.whoop.journal.view.screen.JournalSurveyAnswerScreenKt$showCustomizeJournal$1", m100430f = "JournalSurveyAnswerScreen.kt", m100431l = {1243}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class n extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f14569w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC35664f.a f14570x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(AbstractC35664f.a aVar, InterfaceC30057d<? super n> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f14570x = aVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new n(this.f14570x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((n) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f14569w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3M112950a = this.f14570x.getModalBottomSheetState();
                this.f14569w = 1;
                if (c15199y3M112950a.m43225f(this) == enumC31071a) {
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A1 */
    public static final C23454a0 m10735A1(Function1 function1, C13821r1 c13821r1, Function1 function2, C9598e action) {
        AbstractC22676k.m65750j(action, "action");
        function1.invoke(Integer.valueOf(c13821r1.f49318a.m87024x()));
        function2.invoke(action);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: A2 */
    private static final void m10736A2(Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar) {
        function1.invoke(AbstractC11103c.g.f35272a);
        interfaceC28601c1.setValue(Boolean.TRUE);
        interfaceC28601c2.setValue(Boolean.FALSE);
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new n(aVar, null), 3);
    }

    /* JADX INFO: renamed from: B0 */
    private static final void m10738B0(C12333c c12333c, Function1 function1, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1934862871);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(c12333c) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q, i15).getBrandWhite();
            long jM125382b1 = c38072d.m121949b(c28655q, i15).getWhite50();
            float f13 = 8;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1099a.m3392n(c2314t, (-1) * f13, 0.0f, 2), 2 * f13, 0.0f, 2);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC39330c.m125320b(0L, c38072d.m121949b(c28655q, i15).getRecovery(), 0L, 0L, AbstractC37817c.m121344e(1689535348, c28655q, new C0003a0(7, c12333c, function1)), c28655q, 24576, 13);
            float f14 = 1 * f13;
            AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC29492c.f119838a), AbstractC1099a.m3398t(c2314t, f14, 0.0f, 0.0f, 0.0f, 14), c12333c.getIsToggleEnabled() ? jM125430y : jM125382b1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getH5(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, f14, 0.0f, 0.0f, 0.0f, 14);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
            boolean z4 = (i14 & 896) == 256;
            Object objM87133R2 = c28655q.m87133R();
            if (z4 || objM87133R2 == c28676v0) {
                objM87133R2 = new C3584d(interfaceC4339a, 2);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC29125c.m88524d(AbstractC34132o.m107874S(AbstractC16319p0.m46430a().getTinyIcons().getTinyHelp(), c28655q, 6), "defaults question", AbstractC1092a.m3360e(modifierM3398t, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R2, 28), null, c28655q, 196656, 88);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21061j(c12333c, function1, interfaceC4339a, i13, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B1 */
    public static final C23454a0 m10739B1(Function1 function1, C13821r1 c13821r1, InterfaceC4339a interfaceC4339a) {
        function1.invoke(Integer.valueOf(c13821r1.f49318a.m87024x()));
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B2 */
    public static final void m10740B2(AbstractC12336f abstractC12336f, String date, String str, boolean z4, Function1 onViewEvent) {
        AbstractC22676k.m65750j(date, "date");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        Object obj = null;
        AbstractC12336f.c cVar = abstractC12336f instanceof AbstractC12336f.c ? (AbstractC12336f.c) abstractC12336f : null;
        if (cVar != null) {
            for (Object obj2 : cVar.m34463a()) {
                if (AbstractC22676k.m65745e(((C16613h) obj2).getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), date)) {
                    obj = obj2;
                    break;
                }
            }
            C16613h c16613h = (C16613h) obj;
            if (c16613h != null) {
                onViewEvent.invoke(new AbstractC11103c.s(c16613h.getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), str, z4));
            } else {
                onViewEvent.invoke(new AbstractC11103c.i(date, true));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final C23454a0 m10742C0(C12333c c12333c, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM44101d = AbstractC15676d.m44101d(C2314t.f9131w, "Defaults Toggle");
            boolean zM34435b = c12333c.getIsToggleEnabled();
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C3586e(function1, 4);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC29641d.m91043e(modifierM44101d, zM34435b, false, 0L, null, null, (Function1) objM87133R, c28655q, 0, 60);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C1 */
    public static final C23454a0 m10743C1() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final C23454a0 m10745D0(Function1 function1, boolean z4) {
        function1.invoke(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D1 */
    public static final C23454a0 m10746D1(InterfaceC28601c1 interfaceC28601c1, Function1 function1, List list, InterfaceC28601c1 interfaceC28601c2, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, List savedBehaviors) {
        AbstractC22676k.m65750j(savedBehaviors, "savedBehaviors");
        interfaceC28601c1.setValue(Boolean.TRUE);
        function1.invoke(new AbstractC11103c.m(list, savedBehaviors));
        interfaceC28601c2.setValue(C25271y.f99162w);
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new f(aVar, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final C23454a0 m10748E0(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E1 */
    public static final C23454a0 m10749E1(InterfaceC28601c1 interfaceC28601c1) {
        interfaceC28601c1.setValue(C25271y.f99162w);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final C23454a0 m10751F0(C12333c c12333c, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m10738B0(c12333c, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F1 */
    public static final C23454a0 m10752F1(C12341k c12341k, Function1 function1, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, AbstractC35664f.a aVar, Function1 function2, Function1 function3, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, InterfaceC23013y BottomSheet, Composer composer, int i13) {
        Object c2032u;
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C12332b c12332bM34459r = c12341k.getIsSuccess().getShouldShowBottomSheet();
            AbstractC12331a abstractC12331aM34433c = c12332bM34459r != null ? c12332bM34459r.getType() : null;
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(c12341k) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                c2032u = new C2032u(function1, (Object) c12341k, (Object) interfaceC2994c0, (Object) c15199y3, 3);
                c28655q.m87172p0(c2032u);
            } else {
                c2032u = objM87133R;
            }
            InterfaceC4351m interfaceC4351m = (InterfaceC4351m) c2032u;
            boolean zM87153g2 = c28655q.m87153g(function1) | c28655q.m87157i(c12341k) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                C1042s c1042s = new C1042s(function1, (Object) c12341k, interfaceC2994c0, (Object) c15199y3, 6);
                c28655q.m87172p0(c1042s);
                objM87133R2 = c1042s;
            }
            Function1 function4 = (Function1) objM87133R2;
            boolean zM87157i = c28655q.m87157i(c12341k) | c28655q.m87153g(function2) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i || objM87133R3 == c28676v0) {
                C3424a0 c3424a0 = new C3424a0(c12341k, interfaceC28601c1, interfaceC28601c2, function2, interfaceC28601c3, interfaceC2994c0, aVar);
                c28655q.m87172p0(c3424a0);
                objM87133R3 = c3424a0;
            }
            Function1 function5 = (Function1) objM87133R3;
            boolean zM87153g3 = c28655q.m87153g(function3);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87153g3 || objM87133R4 == c28676v0) {
                objM87133R4 = new C2609r(interfaceC28601c4, function3, 1);
                c28655q.m87172p0(objM87133R4);
            }
            m10754G0(abstractC12331aM34433c, interfaceC4351m, function4, aVar, interfaceC2994c0, function5, (Function1) objM87133R4, c28655q, AbstractC35664f.a.f151587c << 9);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G0 */
    private static final void m10754G0(AbstractC12331a abstractC12331a, InterfaceC4351m interfaceC4351m, Function1 function1, AbstractC35664f.a aVar, InterfaceC2994c0 interfaceC2994c0, Function1 function2, Function1 function3, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(720262597);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(abstractC12331a) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4351m) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= (i13 & 4096) == 0 ? c28655q.m87153g(aVar) : c28655q.m87157i(aVar) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(interfaceC2994c0) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87157i(function2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q.m87157i(function3) ? 1048576 : 524288;
        }
        if (!c28655q.m87135U(i14 & 1, (599187 & i14) != 599186)) {
            c28655q.m87138X();
        } else if (abstractC12331a instanceof AbstractC12331a.b) {
            c28655q.m87150e0(-313186880);
            AbstractC12331a.b bVar = (AbstractC12331a.b) abstractC12331a;
            m10815a1(bVar.getQuestionTitle(), bVar.getCurrentValue(), bVar.getMin(), bVar.getMax(), bVar.getUnit(), function1, c28655q, (i14 << 9) & 458752, 0);
            c28655q = c28655q;
            c28655q.m87173q(false);
        } else if (abstractC12331a instanceof AbstractC12331a.c) {
            c28655q.m87150e0(-312895139);
            AbstractC12331a.c cVar = (AbstractC12331a.c) abstractC12331a;
            m10868n2(cVar.getIs24HourFormat(), cVar.getInitialTime(), interfaceC4351m, c28655q, (i14 << 3) & 896, 0);
            c28655q.m87173q(false);
        } else if (abstractC12331a instanceof AbstractC12331a.a) {
            c28655q.m87150e0(-312665646);
            int i15 = i14;
            int i16 = (i15 & 14) | (AbstractC35664f.a.f151587c << 3);
            int i17 = i15 >> 6;
            AbstractC41068b.m133321i((AbstractC12331a.a) abstractC12331a, aVar, interfaceC2994c0, function2, function3, c28655q, i16 | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (i17 & 57344), 0);
            c28655q.m87173q(false);
        } else {
            if (abstractC12331a != null) {
                throw AbstractC11895b.m32003v(682632573, c28655q, false);
            }
            c28655q.m87150e0(-312350469);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2633u2(abstractC12331a, interfaceC4351m, function1, aVar, interfaceC2994c0, function2, function3, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G1 */
    public static final C23454a0 m10755G1(Function1 function1, C12341k c12341k, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, int i13, int i14) {
        C12332b c12332bM34459r = c12341k.getIsSuccess().getShouldShowBottomSheet();
        function1.invoke(new AbstractC36877d.h(c12332bM34459r != null ? c12332bM34459r.getQuestionId() : -11, i13 + ":" + i14));
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new i(c15199y3, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final C23454a0 m10757H0(AbstractC12331a abstractC12331a, InterfaceC4351m interfaceC4351m, Function1 function1, AbstractC35664f.a aVar, InterfaceC2994c0 interfaceC2994c0, Function1 function2, Function1 function3, int i13, Composer composer, int i14) {
        m10754G0(abstractC12331a, interfaceC4351m, function1, aVar, interfaceC2994c0, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H1 */
    public static final C23454a0 m10758H1(Function1 function1, C12341k c12341k, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, Double d3) {
        C12332b c12332bM34459r = c12341k.getIsSuccess().getShouldShowBottomSheet();
        function1.invoke(new AbstractC36877d.g(c12332bM34459r != null ? c12332bM34459r.getQuestionId() : -11, d3));
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new j(c15199y3, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: I0 */
    private static final void m10760I0(Modifier modifier, C12341k c12341k, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1522699613);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(c12341k) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            boolean zM34462u = c12341k.getIsSuccess().getIsJournalEditable();
            String strM34444c = c12341k.getIsSuccess().getBottomButtonText();
            boolean zM87157i = c28655q.m87157i(c12341k) | ((i14 & 896) == 256);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C17820i(29, function1, c12341k);
                c28655q.m87172p0(objM87133R);
            }
            m10871o1(zM34462u, strM34444c, (InterfaceC4339a) objM87133R, c28655q, 0, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21061j(modifier, c12341k, function1, i13, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I1 */
    public static final C23454a0 m10761I1(C12341k c12341k, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, Function1 function1, InterfaceC28601c1 interfaceC28601c3, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, Object it) {
        AbstractC22676k.m65750j(it, "it");
        m10900v2(it, c12341k.getIsSuccess().getShouldShowBottomSheet(), new C29656q(it, interfaceC28601c1, interfaceC28601c2, 14), new C1042s(function1, (Object) interfaceC28601c3, interfaceC2994c0, (Object) aVar, 8));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final C23454a0 m10763J0(Function1 function1, C12341k c12341k) {
        function1.invoke(Boolean.valueOf(c12341k.getIsSuccess().getDefaultAnswersToggleInfo().getShouldShowDefaultAnswersToggle()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J1 */
    public static final C23454a0 m10764J1(Object obj, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, List wpBehaviors) {
        AbstractC22676k.m65750j(wpBehaviors, "wpBehaviors");
        AbstractC11103c.m mVar = obj instanceof AbstractC11103c.m ? (AbstractC11103c.m) obj : null;
        if (mVar != null) {
            interfaceC28601c2.setValue(mVar.m30020b());
        }
        interfaceC28601c1.setValue(wpBehaviors);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final C23454a0 m10766K0(Modifier modifier, C12341k c12341k, Function1 function1, int i13, Composer composer, int i14) {
        m10760I0(modifier, c12341k, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K1 */
    public static final C23454a0 m10767K1(Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, Object viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        function1.invoke(viewEvent);
        if (viewEvent instanceof AbstractC11103c.m) {
            interfaceC28601c1.setValue(Boolean.TRUE);
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new k(aVar, null), 3);
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: L0 */
    private static final void m10769L0(C12341k c12341k, Modifier modifier, Composer composer, int i13, int i14) {
        C12341k c12341k2;
        int i15;
        Modifier modifier2;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1779841060);
        if ((i13 & 6) == 0) {
            c12341k2 = c12341k;
            i15 = i13 | (c28655q2.m87157i(c12341k2) ? 4 : 2);
        } else {
            c12341k2 = c12341k;
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                String strM21274h = AbstractC8693b.m21274h(c12341k2.getIsSuccess().getHeaderText(), c28655q2, TextResource.$stable);
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                c28655q = c28655q2;
                AbstractC30795n.m94707h(strM21274h, AbstractC1102d.m3427x(AbstractC1102d.m3429z(AbstractC1099a.m3396r(modifier4, 2 * 8, 0.0f, 2), null, 3), null, 3), c38072d.m121949b(c28655q2, i17).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 0, 0, null, c38072d.m121952e(c28655q2, i17).getT3(), null, c28655q, 0, (C2886a.f11498d << 18) | 48, 194040);
                modifier3 = modifier4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0089i(c12341k, i13, modifier3, i14, 13);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            String strM21274h2 = AbstractC8693b.m21274h(c12341k2.getIsSuccess().getHeaderText(), c28655q2, TextResource.$stable);
            C38072d c38072d2 = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(strM21274h2, AbstractC1102d.m3427x(AbstractC1102d.m3429z(AbstractC1099a.m3396r(modifier4, 2 * 8, 0.0f, 2), null, 3), null, 3), c38072d2.m121949b(c28655q2, i18).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 0, 0, null, c38072d2.m121952e(c28655q2, i18).getT3(), null, c28655q, 0, (C2886a.f11498d << 18) | 48, 194040);
            modifier3 = modifier4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0089i(c12341k, i13, modifier3, i14, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L1 */
    public static final C23454a0 m10770L1(InterfaceC28601c1 interfaceC28601c1, Function1 function1, boolean z4) {
        if (((Boolean) interfaceC28601c1.getValue()).booleanValue()) {
            interfaceC28601c1.setValue(Boolean.FALSE);
        } else {
            function1.invoke(Boolean.valueOf(z4));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final C23454a0 m10772M0(C12341k c12341k, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m10769L0(c12341k, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:113:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:119:0x0429  */
    /* JADX WARN: Code duplicated, block: B:122:0x048e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0492  */
    /* JADX WARN: Code duplicated, block: B:128:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:131:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:134:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:135:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:139:0x0529 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:142:0x0531  */
    /* JADX WARN: Code duplicated, block: B:145:0x0563 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:146:0x0565  */
    /* JADX WARN: Code duplicated, block: B:149:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:152:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:154:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:155:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:159:0x061e  */
    /* JADX WARN: Code duplicated, block: B:162:0x0677  */
    /* JADX WARN: Code duplicated, block: B:164:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:165:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:168:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:172:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:175:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:177:0x070c  */
    /* JADX WARN: Code duplicated, block: B:181:0x071a A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:185:0x074a  */
    /* JADX WARN: Code duplicated, block: B:188:0x077a  */
    /* JADX WARN: Code duplicated, block: B:192:0x0819  */
    /* JADX WARN: Code duplicated, block: B:193:0x081d  */
    /* JADX WARN: Code duplicated, block: B:196:0x0828  */
    /* JADX WARN: Code duplicated, block: B:199:0x0849  */
    /* JADX WARN: Code duplicated, block: B:200:0x0857  */
    /* JADX WARN: Code duplicated, block: B:202:0x087e  */
    /* JADX WARN: Code duplicated, block: B:203:0x0882  */
    /* JADX WARN: Code duplicated, block: B:206:0x088f  */
    /* JADX WARN: Code duplicated, block: B:208:0x089d  */
    /* JADX WARN: Code duplicated, block: B:213:0x08b4  */
    /* JADX WARN: Code duplicated, block: B:216:0x08ef A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:217:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:227:0x09a0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25, types: [bc3.d0, q83.j] */
    /* JADX WARN: Type inference failed for: r5v79 */
    /* JADX INFO: renamed from: M1 */
    public static final C23454a0 m10773M1(C12341k c12341k, InterfaceC4339a interfaceC4339a, Function1 function1, InterfaceC4339a interfaceC4339a2, Function1 function2, Function1 function3, final InterfaceC28601c1 interfaceC28601c1, C15199y3 c15199y3, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, InterfaceC4339a interfaceC4339a3, InterfaceC4339a interfaceC4339a4, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, Function1 function4, InterfaceC4351m interfaceC4351m, Function1 function5, C13821r1 c13821r1, InterfaceC28601c1 interfaceC28601c4, Function1 function6, InterfaceC4351m interfaceC4351m2, InterfaceC4351m interfaceC4351m3, final InterfaceC4352n interfaceC4352n, Function1 function7, InterfaceC4339a interfaceC4339a5, InterfaceC28601c1 interfaceC28601c5, Function1 function8, InterfaceC23462h interfaceC23462h, InterfaceC28690z0 interfaceC28690z0, Function1 function9, Composer composer, int i13) {
        C28655q c28655q;
        C28676v0 c28676v0;
        boolean zM87157i;
        Object objM87133R;
        boolean z4;
        Function1 function10;
        InterfaceC2994c0 interfaceC2994c1;
        C28676v0 c28676v1;
        ?? r10;
        boolean zM87153g;
        Object objM87133R2;
        boolean zM87153g2;
        Object objM87133R3;
        final Function1 function11;
        C13821r1 c13821r2;
        int iHashCode;
        float f13;
        boolean zM87153g3;
        Object objM87133R4;
        C28676v0 c28676v2;
        C28676v0 c28676v3;
        C12341k c12341k2;
        Function1 function12;
        boolean zM87157i2;
        Object objM87133R5;
        boolean zM87153g4;
        Object objM87133R6;
        C28676v0 c28676v4;
        float f14;
        C12337g c12337gM34447f;
        InterfaceC25312u interfaceC25312uM34461t;
        int i14;
        C2314t c2314t;
        boolean z13;
        C12337g c12337gM34447f2;
        int iHashCode2;
        C0209i c0209i;
        C28655q c28655q2;
        C12341k c12341k3;
        float f15;
        Function1 function13;
        Object objM87133R7;
        boolean z14;
        boolean zM87153g5;
        Object objM87133R8;
        C28676v0 c28676v5;
        C28655q c28655q3;
        C0209i c0209i2;
        float f16;
        float f17;
        Object objM87133R9;
        C17027b<CalendarDateModel> c17027bM34445d;
        int iHashCode3;
        Object objM87133R10;
        boolean zM87153g6;
        Object c3424a0;
        C28655q c28655q4;
        boolean z15;
        boolean z16;
        List<C16613h> listM34463a;
        C28655q c28655q5 = (C28655q) composer;
        if (c28655q5.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM34482d = c12341k.getIsLoading();
            C28676v0 c28676v6 = C28635l.f115821a;
            if (zM34482d || c12341k.getIsSuccess().getShouldRefresh()) {
                c28655q = c28655q5;
                c28676v0 = c28676v6;
                c28655q.m87150e0(-137519018);
                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, new TextResource.C8688b(AbstractC29492c.f119850m, null, 2, 0 == true ? 1 : 0), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.C8688b.f25889c << 3), 0, 4092);
                c28655q.m87173q(false);
            } else {
                if (c12341k.getIsSaving()) {
                    c28655q5.m87150e0(-137243273);
                    AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, new TextResource.C8688b(AbstractC29492c.f119850m, null, 2, 0 == true ? 1 : 0), null, null, null, false, false, null, null, null, false, false, c28655q5, AbstractC33208p0.f.f138479f | (TextResource.C8688b.f25889c << 3), 0, 4092);
                    c28655q5.m87173q(false);
                } else if (c12341k.getIsJournalSaved()) {
                    c28655q5.m87150e0(-136960181);
                    AbstractC33208p0.h hVar = new AbstractC33208p0.h(null, 0L, null, 7, null);
                    TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC29492c.f119856s, null, 2, 0 == true ? 1 : 0);
                    Object objM87133R11 = c28655q5.m87133R();
                    if (objM87133R11 == c28676v6) {
                        objM87133R11 = new C3509a(10);
                        c28655q5.m87172p0(objM87133R11);
                    }
                    AbstractC33199m0.m105214F(hVar, c8688b, (InterfaceC4339a) objM87133R11, null, null, false, false, null, null, null, false, false, c28655q5, AbstractC33208p0.h.f138482h | 384 | (TextResource.C8688b.f25889c << 3), 0, 4088);
                    interfaceC4339a.invoke();
                    c28655q5.m87173q(false);
                } else if (c12341k.getIsError() != null) {
                    c28655q5.m87150e0(-136558204);
                    AbstractC33208p0.b bVar = new AbstractC33208p0.b(c12341k.getIsError().getIsError(), false, null, 6, null);
                    int i15 = 2;
                    TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC29492c.f119844g, null, i15, 0 == true ? 1 : 0);
                    TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC29492c.f119846i, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
                    TextResource.C8688b c8688b4 = new TextResource.C8688b(AbstractC29492c.f119847j, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
                    boolean zM87153g7 = c28655q5.m87153g(function1);
                    Object objM87133R12 = c28655q5.m87133R();
                    if (zM87153g7 || objM87133R12 == c28676v6) {
                        objM87133R12 = new C3599r(function1, 0);
                        c28655q5.m87172p0(objM87133R12);
                    }
                    InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R12;
                    boolean zM87157i3 = c28655q5.m87157i(c12341k) | c28655q5.m87153g(interfaceC4339a2) | c28655q5.m87153g(function2) | c28655q5.m87153g(function3);
                    Object objM87133R13 = c28655q5.m87133R();
                    if (zM87157i3 || objM87133R13 == c28676v6) {
                        objM87133R13 = new C1012d((Object) c12341k, (Object) interfaceC4339a2, function2, (Object) function3, 4);
                        c28655q5.m87172p0(objM87133R13);
                    }
                    InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R13;
                    boolean zM87153g8 = c28655q5.m87153g(function1);
                    Object objM87133R14 = c28655q5.m87133R();
                    if (zM87153g8 || objM87133R14 == c28676v6) {
                        objM87133R14 = new C3599r(function1, 1);
                        c28655q5.m87172p0(objM87133R14);
                    }
                    int i16 = 196608 | AbstractC33208p0.b.f138467h;
                    int i17 = TextResource.C8688b.f25889c;
                    AbstractC33199m0.m105214F(bVar, c8688b2, interfaceC4339a6, c8688b3, interfaceC4339a7, true, false, c8688b4, (InterfaceC4339a) objM87133R14, null, false, false, c28655q5, i16 | (i17 << 3) | (i17 << 9) | (i17 << 21), 0, 3648);
                    c28655q5.m87173q(false);
                } else {
                    c28655q5.m87150e0(-135052162);
                    InterfaceC15237i interfaceC15237i = (InterfaceC15237i) c28655q5.m87161k(AbstractC2453v1.f9570i);
                    if (c12341k.getIsSuccess().getShouldUpdateDatePicker()) {
                        C12337g c12337gM34447f3 = c12341k.getIsSuccess().getDateSelectorState();
                        String strM34470d = c12337gM34447f3 != null ? c12337gM34447f3.getCurrentDate() : null;
                        AbstractC12336f abstractC12336fM34453l = c12341k.getIsSuccess().getJournalDatePillViewState();
                        AbstractC12336f.c cVar = abstractC12336fM34453l instanceof AbstractC12336f.c ? (AbstractC12336f.c) abstractC12336fM34453l : null;
                        if (strM34470d != null && cVar != null && (listM34463a = cVar.m34463a()) != null) {
                            List<C16613h> list = listM34463a;
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    if (AbstractC22676k.m65745e(((C16613h) it.next()).getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), strM34470d)) {
                                        function3.invoke(new AbstractC11103c.i(strM34470d, false));
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    C12337g c12337gM34447f4 = c12341k.getIsSuccess().getDateSelectorState();
                    if (c12337gM34447f4 == null || !c12337gM34447f4.getIsLoading()) {
                        interfaceC28601c1.setValue(Boolean.FALSE);
                    }
                    C2314t c2314t2 = C2314t.f9131w;
                    Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t2);
                    C2307m c2307m = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                    int iHashCode4 = Long.hashCode(c28655q5.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q5.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q5, modifierM3407d);
                    InterfaceC0221l.f734a.getClass();
                    C0213j c0213j = C0217k.f724b;
                    c28655q5.m87158i0();
                    if (c28655q5.f115903S) {
                        c28655q5.m87163l(c0213j);
                    } else {
                        c28655q5.m87178s0();
                    }
                    C0209i c0209i3 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q5, c0209i3, interfaceC39127r0M66763d);
                    C0209i c0209i4 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q5, c0209i4, interfaceC28653p1M87165m);
                    C0209i c0209i5 = C0217k.f732j;
                    if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode4))) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q5, iHashCode4, c0209i5);
                    }
                    C0209i c0209i6 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q5, c0209i6, modifierM118962N);
                    boolean zM34480b = c12341k.getIsIntraday();
                    boolean zM87153g9 = c28655q5.m87153g(interfaceC4339a4);
                    Object objM87133R15 = c28655q5.m87133R();
                    if (zM87153g9 || objM87133R15 == c28676v6) {
                        objM87133R15 = new C3578a(interfaceC4339a4, 2);
                        c28655q5.m87172p0(objM87133R15);
                    }
                    Function1 function14 = (Function1) objM87133R15;
                    boolean zM87153g10 = c28655q5.m87153g(function3) | c28655q5.m87157i(interfaceC2994c0) | c28655q5.m87157i(aVar);
                    Object objM87133R16 = c28655q5.m87133R();
                    if (zM87153g10 || objM87133R16 == c28676v6) {
                        z4 = zM34480b;
                        function10 = function14;
                        C0073h c0073h = new C0073h(function3, interfaceC28601c2, interfaceC28601c3, interfaceC2994c0, aVar, 6);
                        interfaceC2994c1 = interfaceC2994c0;
                        c28655q5.m87172p0(c0073h);
                        objM87133R16 = c0073h;
                    } else {
                        z4 = zM34480b;
                        function10 = function14;
                        interfaceC2994c1 = interfaceC2994c0;
                    }
                    m10880q2(z4, function10, (InterfaceC4339a) objM87133R16, c28655q5, 0);
                    C22957g c22957g = AbstractC22977m.f90652c;
                    C2305k c2305k = C2299e.f9110M;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q5, 0);
                    int iHashCode5 = Long.hashCode(c28655q5.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q5.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q5, r44);
                    c28655q5.m87158i0();
                    if (c28655q5.f115903S) {
                        c28655q5.m87163l(c0213j);
                    } else {
                        c28655q5.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q5, r20, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q5, c0209i4, interfaceC28653p1M87165m2);
                    if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode5))) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q5, iHashCode5, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q5, c0209i6, modifierM118962N2);
                    if (c12341k.getIsSuccess().getExitNow()) {
                        function1.invoke(Boolean.TRUE);
                    }
                    boolean zM87157i4 = c28655q5.m87157i(c12341k) | c28655q5.m87157i(c15199y3);
                    Object objM87133R17 = c28655q5.m87133R();
                    if (zM87157i4) {
                        c28676v1 = c28676v6;
                    } else {
                        c28676v1 = c28676v6;
                        if (objM87133R17 != c28676v1) {
                            r10 = 0;
                        }
                        AbstractC3006f0.m8732z(interfaceC2994c1, r10, r10, (InterfaceC4351m) objM87133R17, 3);
                        zM87153g = c28655q5.m87153g(function4) | c28655q5.m87153g(interfaceC4351m);
                        objM87133R2 = c28655q5.m87133R();
                        if (zM87153g || objM87133R2 == c28676v1) {
                            objM87133R2 = new C3169c(function4, interfaceC4351m, 4);
                            c28655q5.m87172p0(objM87133R2);
                        }
                        Function1 function15 = (Function1) objM87133R2;
                        zM87153g2 = c28655q5.m87153g(function4) | c28655q5.m87153g(function5) | c28655q5.m87153g(c13821r1) | c28655q5.m87153g(interfaceC4351m);
                        objM87133R3 = c28655q5.m87133R();
                        if (!zM87153g2 || objM87133R3 == c28676v1) {
                            objM87133R3 = new C1042s(function4, (Object) function5, (Object) c13821r1, (Object) interfaceC4351m, 7);
                            function11 = function5;
                            c13821r2 = c13821r1;
                            c28655q5.m87172p0(objM87133R3);
                        } else {
                            function11 = function5;
                            c13821r2 = c13821r1;
                        }
                        AbstractC3593l.m10955e(r1, function15, (Function1) objM87133R3, c28655q5, 0);
                        Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC30060g.m92116f0(AbstractC22953f.m66720i(AbstractC22953f.m66724m(c2314t2)), c13821r2, 14), 0.0f, 0.0f, 0.0f, ((InterfaceC39171c) c28655q5.m87161k(AbstractC2453v1.f9569h)).mo733e0(((Number) interfaceC28601c4.getValue()).intValue()), 7);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q5, 0);
                        iHashCode = Long.hashCode(c28655q5.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q5.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q5, modifierM3398t);
                        c28655q5.m87158i0();
                        if (c28655q5.f115903S) {
                            c28655q5.m87163l(c0213j);
                        } else {
                            c28655q5.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q5, r20, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q5, c0209i4, interfaceC28653p1M87165m3);
                        if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q5, c0209i6, modifierM118962N3);
                        float f18 = 8;
                        f13 = f18 * f18;
                        AbstractC22953f.m66715b(c28655q5, AbstractC1102d.m3419p(f13, c2314t2));
                        zM87153g3 = c28655q5.m87153g(function11) | c28655q5.m87153g(c13821r2) | c28655q5.m87153g(interfaceC4351m2) | c28655q5.m87153g(function3) | c28655q5.m87157i(r1);
                        objM87133R4 = c28655q5.m87133R();
                        if (zM87153g3) {
                            c28676v2 = c28676v1;
                        } else {
                            c28676v2 = c28676v1;
                            if (objM87133R4 == c28676v2) {
                                c28676v3 = c28676v2;
                                c12341k2 = c12341k;
                                function12 = function3;
                            }
                            InterfaceC4351m interfaceC4351m4 = (InterfaceC4351m) objM87133R4;
                            zM87157i2 = c28655q5.m87157i(c12341k2) | c28655q5.m87153g(interfaceC4351m3);
                            objM87133R5 = c28655q5.m87133R();
                            if (zM87157i2 || objM87133R5 == c28676v3) {
                                objM87133R5 = new C29656q(c12341k2, interfaceC4351m3, interfaceC28601c5, 13);
                                c28655q5.m87172p0(objM87133R5);
                            }
                            Function1 function16 = (Function1) objM87133R5;
                            zM87153g4 = c28655q5.m87153g(function11) | c28655q5.m87153g(c13821r2) | c28655q5.m87153g(interfaceC4352n) | c28655q5.m87157i(c12341k2) | c28655q5.m87153g(function12);
                            objM87133R6 = c28655q5.m87133R();
                            if (zM87153g4 || objM87133R6 == c28676v3) {
                                final Function1 function17 = function12;
                                final C13821r1 c13821r3 = c13821r2;
                                final C12341k c12341k4 = c12341k2;
                                InterfaceC4353o interfaceC4353o = new InterfaceC4353o() { // from class: bs1.p
                                    @Override // c93.InterfaceC4353o
                                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                                        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                                        boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                                        return AbstractC3583c0.m10806X1(function11, c13821r3, interfaceC4352n, c12341k4, interfaceC28601c1, function17, ((Long) obj).longValue(), (String) obj2, (EnumC39731b) obj3, zBooleanValue, zBooleanValue2);
                                    }
                                };
                                c28655q5.m87172p0(interfaceC4353o);
                                objM87133R6 = interfaceC4353o;
                            }
                            c28676v4 = c28676v3;
                            m10775N0(c12341k, function6, interfaceC4351m4, function16, (InterfaceC4353o) objM87133R6, function7, interfaceC4339a5, c28655q5, 0, 0);
                            float f19 = 4;
                            f14 = f19 * r19;
                            AbstractC22953f.m66715b(c28655q5, AbstractC1102d.m3419p(f14, c2314t2));
                            c12337gM34447f = c12341k.getIsSuccess().getDateSelectorState();
                            if (c12337gM34447f == null && c12337gM34447f.getIsLoading()) {
                                c28655q5.m87150e0(-727738825);
                                c28655q5.m87173q(false);
                                f19 = f19;
                                i14 = 3;
                                c2314t = c2314t2;
                            } else {
                                c28655q5.m87150e0(1084880516);
                                interfaceC25312uM34461t = c12341k.getIsSuccess().getTalkTextWidget();
                                if (interfaceC25312uM34461t == null) {
                                    c28655q5.m87150e0(-728442371);
                                    c28655q5.m87173q(false);
                                    i14 = 3;
                                    c2314t = c2314t2;
                                    z13 = false;
                                } else {
                                    c28655q5.m87150e0(-728442370);
                                    i14 = 3;
                                    c2314t = c2314t2;
                                    AbstractC25303l.m74291r(interfaceC25312uM34461t, p720m91.Function1.m74307h(null, 1, null), new C13762f(20), null, c28655q5, C25307p.f99300b << 3, 8);
                                    z13 = false;
                                    AbstractC25012a.m73389v(c2314t, f14, c28655q5, false);
                                }
                                c28655q5.m87173q(z13);
                            }
                            c12337gM34447f2 = c12341k.getIsSuccess().getDateSelectorState();
                            if (c12337gM34447f2 == null && c12337gM34447f2.getIsLoading()) {
                                c28655q5.m87150e0(-727591699);
                                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, AbstractC1102d.m3411h(100 * f19, AbstractC1102d.m3409f(1.0f, c2314t)), true, false, c28655q5, 805306368 | AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 6, 2556);
                                c28655q5.m87173q(false);
                                c0209i = c0209i6;
                                f15 = 0.0f;
                                c28655q2 = c28655q5;
                                c12341k3 = c12341k;
                                c28676v0 = c28676v4;
                                z14 = true;
                            } else {
                                c28655q5.m87150e0(-727041449);
                                Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 2 * r19, 0.0f, 2);
                                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q5, 0);
                                iHashCode2 = Long.hashCode(c28655q5.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q5.m87165m();
                                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q5, modifierM3396r);
                                c28655q5.m87158i0();
                                if (c28655q5.f115903S) {
                                    c28655q5.m87163l(c0213j);
                                } else {
                                    c28655q5.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q5, r20, c23010xM66775a3);
                                AbstractC28683x.m87239G(c28655q5, c0209i4, interfaceC28653p1M87165m4);
                                if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode2))) {
                                    AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i5);
                                }
                                c0209i = c0209i6;
                                AbstractC28683x.m87239G(c28655q5, c0209i, modifierM118962N4);
                                if (m10895u1(interfaceC23462h).isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_IN_JOURNAL_NON_ONBOARDING)) {
                                    c28655q5.m87150e0(-30551116);
                                    List<C36873b> listM34457p = c12341k.getIsSuccess().m34457p();
                                    zM87153g5 = c28655q5.m87153g(function5) | c28655q5.m87153g(c13821r1) | c28655q5.m87157i(c12341k) | c28655q5.m87153g(interfaceC4352n) | c28655q5.m87153g(function3);
                                    objM87133R8 = c28655q5.m87133R();
                                    if (!zM87153g5 || objM87133R8 == c28676v4) {
                                        c28676v5 = c28676v4;
                                        c28655q3 = c28655q5;
                                        f15 = 0.0f;
                                        c28676v0 = c28676v5;
                                        C1040r c1040r = new C1040r(function5, (Object) c13821r1, (Object) c12341k, (Object) interfaceC4352n, (Object) function3, 3);
                                        c12341k3 = c12341k;
                                        c28655q3.m87172p0(c1040r);
                                        objM87133R8 = c1040r;
                                    } else {
                                        c12341k3 = c12341k;
                                        f15 = 0.0f;
                                        c28676v0 = c28676v4;
                                        c28655q3 = c28655q5;
                                    }
                                    function13 = function8;
                                    C28655q c28655q6 = c28655q3;
                                    AbstractC3585d0.m10924e(listM34457p, interfaceC15237i, function13, (Function1) objM87133R8, c28655q6, 0);
                                    c28655q2 = c28655q6;
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2 = c28655q5;
                                    c12341k3 = c12341k;
                                    c28676v0 = c28676v4;
                                    f15 = 0.0f;
                                    function13 = function8;
                                    c28655q2.m87150e0(-29469061);
                                    m10805X0(c12341k3.getIsSuccess().m34457p(), interfaceC15237i, function13, c28655q2, 0);
                                    c28655q2.m87173q(false);
                                }
                                float f24 = i14 * r19;
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f24, c2314t));
                                objM87133R7 = c28655q2.m87133R();
                                if (objM87133R7 == c28676v0) {
                                    objM87133R7 = new C3578a(interfaceC28690z0, 1);
                                    c28655q2.m87172p0(objM87133R7);
                                }
                                m10855k1(c12341k3, (Function1) objM87133R7, function13, c28655q2, 48);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f24, c2314t));
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f13, c2314t));
                                z14 = true;
                                c28655q2.m87173q(true);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(z14);
                            c28655q2.m87173q(z14);
                            c0209i2 = c0209i;
                            float f25 = f15;
                            Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC1092a.m3357b(AbstractC1102d.m3409f(1.0f, C1100b.f4583a.mo3400a(c2314t, C2299e.f9105H)), C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(f15), new C17919x(C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getTransparent())), new C23465k(Float.valueOf(0.25f), new C17919x(AbstractC17918w0.m51517e(4279244056L)))}, f25, f25, 14), null, f25, 6));
                            float f26 = 2 * r19;
                            f16 = 3 * f18;
                            if (c12341k3.getIsSuccess().getCoachAiAction() != null) {
                                f17 = 90;
                            } else {
                                f17 = f16;
                            }
                            Modifier modifierM3397s = AbstractC1099a.m3397s(modifierM66722k, f16, f14, f17, f26);
                            objM87133R9 = c28655q2.m87133R();
                            if (objM87133R9 == c28676v0) {
                                objM87133R9 = new C3591j(1, interfaceC28601c4);
                                c28655q2.m87172p0(objM87133R9);
                            }
                            m10760I0(AbstractC1131a.m3500d(modifierM3397s, (Function1) objM87133R9), c12341k3, function2, c28655q2, 0);
                            c17027bM34445d = c12341k3.getIsSuccess().m34445d();
                            if (c17027bM34445d == null) {
                                c28655q2.m87150e0(-1142830328);
                                c28655q2.m87173q(false);
                                c28655q = c28655q2;
                                z16 = false;
                                z15 = true;
                            } else {
                                c28655q2.m87150e0(-1142830327);
                                Modifier modifierM7154a = AbstractC2294a.m7154a(2.0f, c2314t);
                                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM7154a);
                                c28655q2.m87158i0();
                                if (c28655q2.f115903S) {
                                    c28655q2.m87163l(c0213j);
                                } else {
                                    c28655q2.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC39127r0M66763d2);
                                AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m5);
                                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
                                }
                                AbstractC28683x.m87239G(c28655q2, c0209i2, modifierM118962N5);
                                boolean zM10899v1 = m10899v1(interfaceC28601c5);
                                objM87133R10 = c28655q2.m87133R();
                                if (objM87133R10 == c28676v0) {
                                    objM87133R10 = new C3598q(interfaceC28601c5, 0);
                                    c28655q2.m87172p0(objM87133R10);
                                }
                                InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R10;
                                zM87153g6 = c28655q2.m87153g(function9) | c28655q2.m87153g(function5) | c28655q2.m87153g(c13821r1) | c28655q2.m87153g(interfaceC4352n) | c28655q2.m87157i(c12341k3) | c28655q2.m87153g(function3);
                                Object objM87133R18 = c28655q2.m87133R();
                                if (!zM87153g6 || objM87133R18 == c28676v0) {
                                    c28655q4 = c28655q2;
                                    c3424a0 = new C3424a0(function9, function5, c13821r1, interfaceC4352n, c12341k3, interfaceC28601c1, function3);
                                    c28655q4.m87172p0(c3424a0);
                                } else {
                                    c28655q4 = c28655q2;
                                    c3424a0 = objM87133R18;
                                }
                                C28655q c28655q7 = c28655q4;
                                AbstractC3587f.m10937h(c17027bM34445d, zM10899v1, interfaceC4339a8, (Function1) c3424a0, c28655q7, C17027b.f65485k | 384);
                                c28655q = c28655q7;
                                z15 = true;
                                c28655q.m87173q(true);
                                z16 = false;
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(z15);
                            c28655q.m87173q(z16);
                        }
                        c28676v3 = c28676v2;
                        c12341k2 = r1;
                        objM87133R4 = new C0556g(function11, (Object) c13821r2, (Object) interfaceC4351m2, (Object) function3, (Object) c12341k2, 1);
                        function12 = function3;
                        c28655q5.m87172p0(objM87133R4);
                        InterfaceC4351m interfaceC4351m5 = (InterfaceC4351m) objM87133R4;
                        zM87157i2 = c28655q5.m87157i(c12341k2) | c28655q5.m87153g(interfaceC4351m3);
                        objM87133R5 = c28655q5.m87133R();
                        if (zM87157i2) {
                            objM87133R5 = new C29656q(c12341k2, interfaceC4351m3, interfaceC28601c5, 13);
                            c28655q5.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C29656q(c12341k2, interfaceC4351m3, interfaceC28601c5, 13);
                            c28655q5.m87172p0(objM87133R5);
                        }
                        Function1 function18 = (Function1) objM87133R5;
                        zM87153g4 = c28655q5.m87153g(function11) | c28655q5.m87153g(c13821r2) | c28655q5.m87153g(interfaceC4352n) | c28655q5.m87157i(c12341k2) | c28655q5.m87153g(function12);
                        objM87133R6 = c28655q5.m87133R();
                        if (zM87153g4) {
                            final Function1 function19 = function12;
                            final C13821r1 c13821r4 = c13821r2;
                            final C12341k c12341k5 = c12341k2;
                            InterfaceC4353o interfaceC4353o2 = new InterfaceC4353o() { // from class: bs1.p
                                @Override // c93.InterfaceC4353o
                                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                                    boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                                    boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                                    return AbstractC3583c0.m10806X1(function11, c13821r4, interfaceC4352n, c12341k5, interfaceC28601c1, function19, ((Long) obj).longValue(), (String) obj2, (EnumC39731b) obj3, zBooleanValue, zBooleanValue2);
                                }
                            };
                            c28655q5.m87172p0(interfaceC4353o2);
                            objM87133R6 = interfaceC4353o2;
                        } else {
                            final Function1 function110 = function12;
                            final C13821r1 c13821r5 = c13821r2;
                            final C12341k c12341k6 = c12341k2;
                            InterfaceC4353o interfaceC4353o3 = new InterfaceC4353o() { // from class: bs1.p
                                @Override // c93.InterfaceC4353o
                                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                                    boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                                    boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                                    return AbstractC3583c0.m10806X1(function11, c13821r5, interfaceC4352n, c12341k6, interfaceC28601c1, function110, ((Long) obj).longValue(), (String) obj2, (EnumC39731b) obj3, zBooleanValue, zBooleanValue2);
                                }
                            };
                            c28655q5.m87172p0(interfaceC4353o3);
                            objM87133R6 = interfaceC4353o3;
                        }
                        c28676v4 = c28676v3;
                        m10775N0(c12341k, function6, interfaceC4351m5, function18, (InterfaceC4353o) objM87133R6, function7, interfaceC4339a5, c28655q5, 0, 0);
                        float f110 = 4;
                        f14 = f110 * r19;
                        AbstractC22953f.m66715b(c28655q5, AbstractC1102d.m3419p(f14, c2314t2));
                        c12337gM34447f = c12341k.getIsSuccess().getDateSelectorState();
                        if (c12337gM34447f == null) {
                            c28655q5.m87150e0(1084880516);
                            interfaceC25312uM34461t = c12341k.getIsSuccess().getTalkTextWidget();
                            if (interfaceC25312uM34461t == null) {
                                c28655q5.m87150e0(-728442371);
                                c28655q5.m87173q(false);
                                i14 = 3;
                                c2314t = c2314t2;
                                z13 = false;
                            } else {
                                c28655q5.m87150e0(-728442370);
                                i14 = 3;
                                c2314t = c2314t2;
                                AbstractC25303l.m74291r(interfaceC25312uM34461t, p720m91.Function1.m74307h(null, 1, null), new C13762f(20), null, c28655q5, C25307p.f99300b << 3, 8);
                                z13 = false;
                                AbstractC25012a.m73389v(c2314t, f14, c28655q5, false);
                            }
                            c28655q5.m87173q(z13);
                        } else {
                            c28655q5.m87150e0(1084880516);
                            interfaceC25312uM34461t = c12341k.getIsSuccess().getTalkTextWidget();
                            if (interfaceC25312uM34461t == null) {
                                c28655q5.m87150e0(-728442371);
                                c28655q5.m87173q(false);
                                i14 = 3;
                                c2314t = c2314t2;
                                z13 = false;
                            } else {
                                c28655q5.m87150e0(-728442370);
                                i14 = 3;
                                c2314t = c2314t2;
                                AbstractC25303l.m74291r(interfaceC25312uM34461t, p720m91.Function1.m74307h(null, 1, null), new C13762f(20), null, c28655q5, C25307p.f99300b << 3, 8);
                                z13 = false;
                                AbstractC25012a.m73389v(c2314t, f14, c28655q5, false);
                            }
                            c28655q5.m87173q(z13);
                        }
                        c12337gM34447f2 = c12341k.getIsSuccess().getDateSelectorState();
                        if (c12337gM34447f2 == null) {
                            c28655q5.m87150e0(-727041449);
                            Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t, 2 * r19, 0.0f, 2);
                            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q5, 0);
                            iHashCode2 = Long.hashCode(c28655q5.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q5.m87165m();
                            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q5, modifierM3396r2);
                            c28655q5.m87158i0();
                            if (c28655q5.f115903S) {
                                c28655q5.m87163l(c0213j);
                            } else {
                                c28655q5.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q5, r20, c23010xM66775a4);
                            AbstractC28683x.m87239G(c28655q5, c0209i4, interfaceC28653p1M87165m6);
                            if (c28655q5.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i5);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i5);
                            }
                            c0209i = c0209i6;
                            AbstractC28683x.m87239G(c28655q5, c0209i, modifierM118962N6);
                            if (m10895u1(interfaceC23462h).isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_IN_JOURNAL_NON_ONBOARDING)) {
                                c28655q5.m87150e0(-30551116);
                                List<C36873b> listM34457p2 = c12341k.getIsSuccess().m34457p();
                                zM87153g5 = c28655q5.m87153g(function5) | c28655q5.m87153g(c13821r1) | c28655q5.m87157i(c12341k) | c28655q5.m87153g(interfaceC4352n) | c28655q5.m87153g(function3);
                                objM87133R8 = c28655q5.m87133R();
                                if (zM87153g5) {
                                    c28676v5 = c28676v4;
                                } else {
                                    c28676v5 = c28676v4;
                                }
                                c28655q3 = c28655q5;
                                f15 = 0.0f;
                                c28676v0 = c28676v5;
                                C1040r c1040r2 = new C1040r(function5, (Object) c13821r1, (Object) c12341k, (Object) interfaceC4352n, (Object) function3, 3);
                                c12341k3 = c12341k;
                                c28655q3.m87172p0(c1040r2);
                                objM87133R8 = c1040r2;
                                function13 = function8;
                                C28655q c28655q8 = c28655q3;
                                AbstractC3585d0.m10924e(listM34457p2, interfaceC15237i, function13, (Function1) objM87133R8, c28655q8, 0);
                                c28655q2 = c28655q8;
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2 = c28655q5;
                                c12341k3 = c12341k;
                                c28676v0 = c28676v4;
                                f15 = 0.0f;
                                function13 = function8;
                                c28655q2.m87150e0(-29469061);
                                m10805X0(c12341k3.getIsSuccess().m34457p(), interfaceC15237i, function13, c28655q2, 0);
                                c28655q2.m87173q(false);
                            }
                            float f27 = i14 * r19;
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f27, c2314t));
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C3578a(interfaceC28690z0, 1);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            m10855k1(c12341k3, (Function1) objM87133R7, function13, c28655q2, 48);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f27, c2314t));
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f13, c2314t));
                            z14 = true;
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q5.m87150e0(-727041449);
                            Modifier modifierM3396r3 = AbstractC1099a.m3396r(c2314t, 2 * r19, 0.0f, 2);
                            C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q5, 0);
                            iHashCode2 = Long.hashCode(c28655q5.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q5.m87165m();
                            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q5, modifierM3396r3);
                            c28655q5.m87158i0();
                            if (c28655q5.f115903S) {
                                c28655q5.m87163l(c0213j);
                            } else {
                                c28655q5.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q5, r20, c23010xM66775a5);
                            AbstractC28683x.m87239G(c28655q5, c0209i4, interfaceC28653p1M87165m7);
                            if (c28655q5.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i5);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i5);
                            }
                            c0209i = c0209i6;
                            AbstractC28683x.m87239G(c28655q5, c0209i, modifierM118962N7);
                            if (m10895u1(interfaceC23462h).isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_IN_JOURNAL_NON_ONBOARDING)) {
                                c28655q5.m87150e0(-30551116);
                                List<C36873b> listM34457p3 = c12341k.getIsSuccess().m34457p();
                                zM87153g5 = c28655q5.m87153g(function5) | c28655q5.m87153g(c13821r1) | c28655q5.m87157i(c12341k) | c28655q5.m87153g(interfaceC4352n) | c28655q5.m87153g(function3);
                                objM87133R8 = c28655q5.m87133R();
                                if (zM87153g5) {
                                    c28676v5 = c28676v4;
                                } else {
                                    c28676v5 = c28676v4;
                                }
                                c28655q3 = c28655q5;
                                f15 = 0.0f;
                                c28676v0 = c28676v5;
                                C1040r c1040r3 = new C1040r(function5, (Object) c13821r1, (Object) c12341k, (Object) interfaceC4352n, (Object) function3, 3);
                                c12341k3 = c12341k;
                                c28655q3.m87172p0(c1040r3);
                                objM87133R8 = c1040r3;
                                function13 = function8;
                                C28655q c28655q9 = c28655q3;
                                AbstractC3585d0.m10924e(listM34457p3, interfaceC15237i, function13, (Function1) objM87133R8, c28655q9, 0);
                                c28655q2 = c28655q9;
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2 = c28655q5;
                                c12341k3 = c12341k;
                                c28676v0 = c28676v4;
                                f15 = 0.0f;
                                function13 = function8;
                                c28655q2.m87150e0(-29469061);
                                m10805X0(c12341k3.getIsSuccess().m34457p(), interfaceC15237i, function13, c28655q2, 0);
                                c28655q2.m87173q(false);
                            }
                            float f28 = i14 * r19;
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f28, c2314t));
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C3578a(interfaceC28690z0, 1);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            m10855k1(c12341k3, (Function1) objM87133R7, function13, c28655q2, 48);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f28, c2314t));
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f13, c2314t));
                            z14 = true;
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z14);
                        c28655q2.m87173q(z14);
                        c0209i2 = c0209i;
                        float f29 = f15;
                        Modifier modifierM66722k2 = AbstractC22953f.m66722k(AbstractC1092a.m3357b(AbstractC1102d.m3409f(1.0f, C1100b.f4583a.mo3400a(c2314t, C2299e.f9105H)), C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(f15), new C17919x(C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getTransparent())), new C23465k(Float.valueOf(0.25f), new C17919x(AbstractC17918w0.m51517e(4279244056L)))}, f29, f29, 14), null, f29, 6));
                        float f210 = 2 * r19;
                        f16 = 3 * f18;
                        if (c12341k3.getIsSuccess().getCoachAiAction() != null) {
                            f17 = 90;
                        } else {
                            f17 = f16;
                        }
                        Modifier modifierM3397s2 = AbstractC1099a.m3397s(modifierM66722k2, f16, f14, f17, f210);
                        objM87133R9 = c28655q2.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C3591j(1, interfaceC28601c4);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        m10760I0(AbstractC1131a.m3500d(modifierM3397s2, (Function1) objM87133R9), c12341k3, function2, c28655q2, 0);
                        c17027bM34445d = c12341k3.getIsSuccess().m34445d();
                        if (c17027bM34445d == null) {
                            c28655q2.m87150e0(-1142830328);
                            c28655q2.m87173q(false);
                            c28655q = c28655q2;
                            z16 = false;
                            z15 = true;
                        } else {
                            c28655q2.m87150e0(-1142830327);
                            Modifier modifierM7154a2 = AbstractC2294a.m7154a(2.0f, c2314t);
                            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
                            iHashCode3 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM7154a2);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC39127r0M66763d3);
                            AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m8);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i2, modifierM118962N8);
                            boolean zM10899v2 = m10899v1(interfaceC28601c5);
                            objM87133R10 = c28655q2.m87133R();
                            if (objM87133R10 == c28676v0) {
                                objM87133R10 = new C3598q(interfaceC28601c5, 0);
                                c28655q2.m87172p0(objM87133R10);
                            }
                            InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R10;
                            zM87153g6 = c28655q2.m87153g(function9) | c28655q2.m87153g(function5) | c28655q2.m87153g(c13821r1) | c28655q2.m87153g(interfaceC4352n) | c28655q2.m87157i(c12341k3) | c28655q2.m87153g(function3);
                            Object objM87133R19 = c28655q2.m87133R();
                            if (zM87153g6) {
                                c28655q4 = c28655q2;
                                c3424a0 = new C3424a0(function9, function5, c13821r1, interfaceC4352n, c12341k3, interfaceC28601c1, function3);
                                c28655q4.m87172p0(c3424a0);
                            } else {
                                c28655q4 = c28655q2;
                                c3424a0 = new C3424a0(function9, function5, c13821r1, interfaceC4352n, c12341k3, interfaceC28601c1, function3);
                                c28655q4.m87172p0(c3424a0);
                            }
                            C28655q c28655q10 = c28655q4;
                            AbstractC3587f.m10937h(c17027bM34445d, zM10899v2, interfaceC4339a9, (Function1) c3424a0, c28655q10, C17027b.f65485k | 384);
                            c28655q = c28655q10;
                            z15 = true;
                            c28655q.m87173q(true);
                            z16 = false;
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z15);
                        c28655q.m87173q(z16);
                    }
                    r10 = 0;
                    objM87133R17 = new l(c12341k, c15199y3, null);
                    c28655q5.m87172p0(objM87133R17);
                    AbstractC3006f0.m8732z(interfaceC2994c1, r10, r10, (InterfaceC4351m) objM87133R17, 3);
                    zM87153g = c28655q5.m87153g(function4) | c28655q5.m87153g(interfaceC4351m);
                    objM87133R2 = c28655q5.m87133R();
                    if (zM87153g) {
                        objM87133R2 = new C3169c(function4, interfaceC4351m, 4);
                        c28655q5.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C3169c(function4, interfaceC4351m, 4);
                        c28655q5.m87172p0(objM87133R2);
                    }
                    Function1 function111 = (Function1) objM87133R2;
                    zM87153g2 = c28655q5.m87153g(function4) | c28655q5.m87153g(function5) | c28655q5.m87153g(c13821r1) | c28655q5.m87153g(interfaceC4351m);
                    objM87133R3 = c28655q5.m87133R();
                    if (zM87153g2) {
                        objM87133R3 = new C1042s(function4, (Object) function5, (Object) c13821r1, (Object) interfaceC4351m, 7);
                        function11 = function5;
                        c13821r2 = c13821r1;
                        c28655q5.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C1042s(function4, (Object) function5, (Object) c13821r1, (Object) interfaceC4351m, 7);
                        function11 = function5;
                        c13821r2 = c13821r1;
                        c28655q5.m87172p0(objM87133R3);
                    }
                    AbstractC3593l.m10955e(r1, function111, (Function1) objM87133R3, c28655q5, 0);
                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC30060g.m92116f0(AbstractC22953f.m66720i(AbstractC22953f.m66724m(c2314t2)), c13821r2, 14), 0.0f, 0.0f, 0.0f, ((InterfaceC39171c) c28655q5.m87161k(AbstractC2453v1.f9569h)).mo733e0(((Number) interfaceC28601c4.getValue()).intValue()), 7);
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q5, 0);
                    iHashCode = Long.hashCode(c28655q5.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q5.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q5, modifierM3398t2);
                    c28655q5.m87158i0();
                    if (c28655q5.f115903S) {
                        c28655q5.m87163l(c0213j);
                    } else {
                        c28655q5.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q5, r20, c23010xM66775a6);
                    AbstractC28683x.m87239G(c28655q5, c0209i4, interfaceC28653p1M87165m9);
                    if (c28655q5.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i5);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q5, c0209i6, modifierM118962N9);
                    float f111 = 8;
                    f13 = f111 * f111;
                    AbstractC22953f.m66715b(c28655q5, AbstractC1102d.m3419p(f13, c2314t2));
                    zM87153g3 = c28655q5.m87153g(function11) | c28655q5.m87153g(c13821r2) | c28655q5.m87153g(interfaceC4351m2) | c28655q5.m87153g(function3) | c28655q5.m87157i(r1);
                    objM87133R4 = c28655q5.m87133R();
                    if (zM87153g3) {
                        c28676v2 = c28676v1;
                        if (objM87133R4 == c28676v2) {
                            c28676v3 = c28676v2;
                            c12341k2 = c12341k;
                            function12 = function3;
                        }
                        InterfaceC4351m interfaceC4351m6 = (InterfaceC4351m) objM87133R4;
                        zM87157i2 = c28655q5.m87157i(c12341k2) | c28655q5.m87153g(interfaceC4351m3);
                        objM87133R5 = c28655q5.m87133R();
                        if (zM87157i2) {
                            objM87133R5 = new C29656q(c12341k2, interfaceC4351m3, interfaceC28601c5, 13);
                            c28655q5.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C29656q(c12341k2, interfaceC4351m3, interfaceC28601c5, 13);
                            c28655q5.m87172p0(objM87133R5);
                        }
                        Function1 function112 = (Function1) objM87133R5;
                        zM87153g4 = c28655q5.m87153g(function11) | c28655q5.m87153g(c13821r2) | c28655q5.m87153g(interfaceC4352n) | c28655q5.m87157i(c12341k2) | c28655q5.m87153g(function12);
                        objM87133R6 = c28655q5.m87133R();
                        if (zM87153g4) {
                            final Function1 function113 = function12;
                            final C13821r1 c13821r6 = c13821r2;
                            final C12341k c12341k7 = c12341k2;
                            InterfaceC4353o interfaceC4353o4 = new InterfaceC4353o() { // from class: bs1.p
                                @Override // c93.InterfaceC4353o
                                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                                    boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                                    boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                                    return AbstractC3583c0.m10806X1(function11, c13821r6, interfaceC4352n, c12341k7, interfaceC28601c1, function113, ((Long) obj).longValue(), (String) obj2, (EnumC39731b) obj3, zBooleanValue, zBooleanValue2);
                                }
                            };
                            c28655q5.m87172p0(interfaceC4353o4);
                            objM87133R6 = interfaceC4353o4;
                        } else {
                            final Function1 function114 = function12;
                            final C13821r1 c13821r7 = c13821r2;
                            final C12341k c12341k8 = c12341k2;
                            InterfaceC4353o interfaceC4353o5 = new InterfaceC4353o() { // from class: bs1.p
                                @Override // c93.InterfaceC4353o
                                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                                    boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                                    boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                                    return AbstractC3583c0.m10806X1(function11, c13821r7, interfaceC4352n, c12341k8, interfaceC28601c1, function114, ((Long) obj).longValue(), (String) obj2, (EnumC39731b) obj3, zBooleanValue, zBooleanValue2);
                                }
                            };
                            c28655q5.m87172p0(interfaceC4353o5);
                            objM87133R6 = interfaceC4353o5;
                        }
                        c28676v4 = c28676v3;
                        m10775N0(c12341k, function6, interfaceC4351m6, function112, (InterfaceC4353o) objM87133R6, function7, interfaceC4339a5, c28655q5, 0, 0);
                        float f112 = 4;
                        f14 = f112 * r19;
                        AbstractC22953f.m66715b(c28655q5, AbstractC1102d.m3419p(f14, c2314t2));
                        c12337gM34447f = c12341k.getIsSuccess().getDateSelectorState();
                        if (c12337gM34447f == null) {
                            c28655q5.m87150e0(1084880516);
                            interfaceC25312uM34461t = c12341k.getIsSuccess().getTalkTextWidget();
                            if (interfaceC25312uM34461t == null) {
                                c28655q5.m87150e0(-728442371);
                                c28655q5.m87173q(false);
                                i14 = 3;
                                c2314t = c2314t2;
                                z13 = false;
                            } else {
                                c28655q5.m87150e0(-728442370);
                                i14 = 3;
                                c2314t = c2314t2;
                                AbstractC25303l.m74291r(interfaceC25312uM34461t, p720m91.Function1.m74307h(null, 1, null), new C13762f(20), null, c28655q5, C25307p.f99300b << 3, 8);
                                z13 = false;
                                AbstractC25012a.m73389v(c2314t, f14, c28655q5, false);
                            }
                            c28655q5.m87173q(z13);
                        } else {
                            c28655q5.m87150e0(1084880516);
                            interfaceC25312uM34461t = c12341k.getIsSuccess().getTalkTextWidget();
                            if (interfaceC25312uM34461t == null) {
                                c28655q5.m87150e0(-728442371);
                                c28655q5.m87173q(false);
                                i14 = 3;
                                c2314t = c2314t2;
                                z13 = false;
                            } else {
                                c28655q5.m87150e0(-728442370);
                                i14 = 3;
                                c2314t = c2314t2;
                                AbstractC25303l.m74291r(interfaceC25312uM34461t, p720m91.Function1.m74307h(null, 1, null), new C13762f(20), null, c28655q5, C25307p.f99300b << 3, 8);
                                z13 = false;
                                AbstractC25012a.m73389v(c2314t, f14, c28655q5, false);
                            }
                            c28655q5.m87173q(z13);
                        }
                        c12337gM34447f2 = c12341k.getIsSuccess().getDateSelectorState();
                        if (c12337gM34447f2 == null) {
                            c28655q5.m87150e0(-727041449);
                            Modifier modifierM3396r4 = AbstractC1099a.m3396r(c2314t, 2 * r19, 0.0f, 2);
                            C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q5, 0);
                            iHashCode2 = Long.hashCode(c28655q5.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q5.m87165m();
                            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q5, modifierM3396r4);
                            c28655q5.m87158i0();
                            if (c28655q5.f115903S) {
                                c28655q5.m87163l(c0213j);
                            } else {
                                c28655q5.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q5, r20, c23010xM66775a7);
                            AbstractC28683x.m87239G(c28655q5, c0209i4, interfaceC28653p1M87165m10);
                            if (c28655q5.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i5);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i5);
                            }
                            c0209i = c0209i6;
                            AbstractC28683x.m87239G(c28655q5, c0209i, modifierM118962N10);
                            if (m10895u1(interfaceC23462h).isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_IN_JOURNAL_NON_ONBOARDING)) {
                                c28655q5.m87150e0(-30551116);
                                List<C36873b> listM34457p4 = c12341k.getIsSuccess().m34457p();
                                zM87153g5 = c28655q5.m87153g(function5) | c28655q5.m87153g(c13821r1) | c28655q5.m87157i(c12341k) | c28655q5.m87153g(interfaceC4352n) | c28655q5.m87153g(function3);
                                objM87133R8 = c28655q5.m87133R();
                                if (zM87153g5) {
                                    c28676v5 = c28676v4;
                                } else {
                                    c28676v5 = c28676v4;
                                }
                                c28655q3 = c28655q5;
                                f15 = 0.0f;
                                c28676v0 = c28676v5;
                                C1040r c1040r4 = new C1040r(function5, (Object) c13821r1, (Object) c12341k, (Object) interfaceC4352n, (Object) function3, 3);
                                c12341k3 = c12341k;
                                c28655q3.m87172p0(c1040r4);
                                objM87133R8 = c1040r4;
                                function13 = function8;
                                C28655q c28655q11 = c28655q3;
                                AbstractC3585d0.m10924e(listM34457p4, interfaceC15237i, function13, (Function1) objM87133R8, c28655q11, 0);
                                c28655q2 = c28655q11;
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2 = c28655q5;
                                c12341k3 = c12341k;
                                c28676v0 = c28676v4;
                                f15 = 0.0f;
                                function13 = function8;
                                c28655q2.m87150e0(-29469061);
                                m10805X0(c12341k3.getIsSuccess().m34457p(), interfaceC15237i, function13, c28655q2, 0);
                                c28655q2.m87173q(false);
                            }
                            float f211 = i14 * r19;
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f211, c2314t));
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C3578a(interfaceC28690z0, 1);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            m10855k1(c12341k3, (Function1) objM87133R7, function13, c28655q2, 48);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f211, c2314t));
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f13, c2314t));
                            z14 = true;
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q5.m87150e0(-727041449);
                            Modifier modifierM3396r5 = AbstractC1099a.m3396r(c2314t, 2 * r19, 0.0f, 2);
                            C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q5, 0);
                            iHashCode2 = Long.hashCode(c28655q5.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q5.m87165m();
                            Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q5, modifierM3396r5);
                            c28655q5.m87158i0();
                            if (c28655q5.f115903S) {
                                c28655q5.m87163l(c0213j);
                            } else {
                                c28655q5.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q5, r20, c23010xM66775a8);
                            AbstractC28683x.m87239G(c28655q5, c0209i4, interfaceC28653p1M87165m11);
                            if (c28655q5.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i5);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i5);
                            }
                            c0209i = c0209i6;
                            AbstractC28683x.m87239G(c28655q5, c0209i, modifierM118962N11);
                            if (m10895u1(interfaceC23462h).isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_IN_JOURNAL_NON_ONBOARDING)) {
                                c28655q5.m87150e0(-30551116);
                                List<C36873b> listM34457p5 = c12341k.getIsSuccess().m34457p();
                                zM87153g5 = c28655q5.m87153g(function5) | c28655q5.m87153g(c13821r1) | c28655q5.m87157i(c12341k) | c28655q5.m87153g(interfaceC4352n) | c28655q5.m87153g(function3);
                                objM87133R8 = c28655q5.m87133R();
                                if (zM87153g5) {
                                    c28676v5 = c28676v4;
                                } else {
                                    c28676v5 = c28676v4;
                                }
                                c28655q3 = c28655q5;
                                f15 = 0.0f;
                                c28676v0 = c28676v5;
                                C1040r c1040r5 = new C1040r(function5, (Object) c13821r1, (Object) c12341k, (Object) interfaceC4352n, (Object) function3, 3);
                                c12341k3 = c12341k;
                                c28655q3.m87172p0(c1040r5);
                                objM87133R8 = c1040r5;
                                function13 = function8;
                                C28655q c28655q12 = c28655q3;
                                AbstractC3585d0.m10924e(listM34457p5, interfaceC15237i, function13, (Function1) objM87133R8, c28655q12, 0);
                                c28655q2 = c28655q12;
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2 = c28655q5;
                                c12341k3 = c12341k;
                                c28676v0 = c28676v4;
                                f15 = 0.0f;
                                function13 = function8;
                                c28655q2.m87150e0(-29469061);
                                m10805X0(c12341k3.getIsSuccess().m34457p(), interfaceC15237i, function13, c28655q2, 0);
                                c28655q2.m87173q(false);
                            }
                            float f212 = i14 * r19;
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f212, c2314t));
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C3578a(interfaceC28690z0, 1);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            m10855k1(c12341k3, (Function1) objM87133R7, function13, c28655q2, 48);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f212, c2314t));
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f13, c2314t));
                            z14 = true;
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z14);
                        c28655q2.m87173q(z14);
                        c0209i2 = c0209i;
                        float f213 = f15;
                        Modifier modifierM66722k3 = AbstractC22953f.m66722k(AbstractC1092a.m3357b(AbstractC1102d.m3409f(1.0f, C1100b.f4583a.mo3400a(c2314t, C2299e.f9105H)), C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(f15), new C17919x(C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getTransparent())), new C23465k(Float.valueOf(0.25f), new C17919x(AbstractC17918w0.m51517e(4279244056L)))}, f213, f213, 14), null, f213, 6));
                        float f214 = 2 * r19;
                        f16 = 3 * f111;
                        if (c12341k3.getIsSuccess().getCoachAiAction() != null) {
                            f17 = 90;
                        } else {
                            f17 = f16;
                        }
                        Modifier modifierM3397s3 = AbstractC1099a.m3397s(modifierM66722k3, f16, f14, f17, f214);
                        objM87133R9 = c28655q2.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C3591j(1, interfaceC28601c4);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        m10760I0(AbstractC1131a.m3500d(modifierM3397s3, (Function1) objM87133R9), c12341k3, function2, c28655q2, 0);
                        c17027bM34445d = c12341k3.getIsSuccess().m34445d();
                        if (c17027bM34445d == null) {
                            c28655q2.m87150e0(-1142830328);
                            c28655q2.m87173q(false);
                            c28655q = c28655q2;
                            z16 = false;
                            z15 = true;
                        } else {
                            c28655q2.m87150e0(-1142830327);
                            Modifier modifierM7154a3 = AbstractC2294a.m7154a(2.0f, c2314t);
                            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m, false);
                            iHashCode3 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q2.m87165m();
                            Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q2, modifierM7154a3);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC39127r0M66763d4);
                            AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m12);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i2, modifierM118962N12);
                            boolean zM10899v3 = m10899v1(interfaceC28601c5);
                            objM87133R10 = c28655q2.m87133R();
                            if (objM87133R10 == c28676v0) {
                                objM87133R10 = new C3598q(interfaceC28601c5, 0);
                                c28655q2.m87172p0(objM87133R10);
                            }
                            InterfaceC4339a interfaceC4339a10 = (InterfaceC4339a) objM87133R10;
                            zM87153g6 = c28655q2.m87153g(function9) | c28655q2.m87153g(function5) | c28655q2.m87153g(c13821r1) | c28655q2.m87153g(interfaceC4352n) | c28655q2.m87157i(c12341k3) | c28655q2.m87153g(function3);
                            Object objM87133R110 = c28655q2.m87133R();
                            if (zM87153g6) {
                                c28655q4 = c28655q2;
                                c3424a0 = new C3424a0(function9, function5, c13821r1, interfaceC4352n, c12341k3, interfaceC28601c1, function3);
                                c28655q4.m87172p0(c3424a0);
                            } else {
                                c28655q4 = c28655q2;
                                c3424a0 = new C3424a0(function9, function5, c13821r1, interfaceC4352n, c12341k3, interfaceC28601c1, function3);
                                c28655q4.m87172p0(c3424a0);
                            }
                            C28655q c28655q13 = c28655q4;
                            AbstractC3587f.m10937h(c17027bM34445d, zM10899v3, interfaceC4339a10, (Function1) c3424a0, c28655q13, C17027b.f65485k | 384);
                            c28655q = c28655q13;
                            z15 = true;
                            c28655q.m87173q(true);
                            z16 = false;
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z15);
                        c28655q.m87173q(z16);
                    } else {
                        c28676v2 = c28676v1;
                    }
                    c28676v3 = c28676v2;
                    c12341k2 = r1;
                    objM87133R4 = new C0556g(function11, (Object) c13821r2, (Object) interfaceC4351m2, (Object) function3, (Object) c12341k2, 1);
                    function12 = function3;
                    c28655q5.m87172p0(objM87133R4);
                    InterfaceC4351m interfaceC4351m7 = (InterfaceC4351m) objM87133R4;
                    zM87157i2 = c28655q5.m87157i(c12341k2) | c28655q5.m87153g(interfaceC4351m3);
                    objM87133R5 = c28655q5.m87133R();
                    if (zM87157i2) {
                        objM87133R5 = new C29656q(c12341k2, interfaceC4351m3, interfaceC28601c5, 13);
                        c28655q5.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C29656q(c12341k2, interfaceC4351m3, interfaceC28601c5, 13);
                        c28655q5.m87172p0(objM87133R5);
                    }
                    Function1 function115 = (Function1) objM87133R5;
                    zM87153g4 = c28655q5.m87153g(function11) | c28655q5.m87153g(c13821r2) | c28655q5.m87153g(interfaceC4352n) | c28655q5.m87157i(c12341k2) | c28655q5.m87153g(function12);
                    objM87133R6 = c28655q5.m87133R();
                    if (zM87153g4) {
                        final Function1 function116 = function12;
                        final C13821r1 c13821r8 = c13821r2;
                        final C12341k c12341k9 = c12341k2;
                        InterfaceC4353o interfaceC4353o6 = new InterfaceC4353o() { // from class: bs1.p
                            @Override // c93.InterfaceC4353o
                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                                boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                                boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                                return AbstractC3583c0.m10806X1(function11, c13821r8, interfaceC4352n, c12341k9, interfaceC28601c1, function116, ((Long) obj).longValue(), (String) obj2, (EnumC39731b) obj3, zBooleanValue, zBooleanValue2);
                            }
                        };
                        c28655q5.m87172p0(interfaceC4353o6);
                        objM87133R6 = interfaceC4353o6;
                    } else {
                        final Function1 function117 = function12;
                        final C13821r1 c13821r9 = c13821r2;
                        final C12341k c12341k10 = c12341k2;
                        InterfaceC4353o interfaceC4353o7 = new InterfaceC4353o() { // from class: bs1.p
                            @Override // c93.InterfaceC4353o
                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                                boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                                boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                                return AbstractC3583c0.m10806X1(function11, c13821r9, interfaceC4352n, c12341k10, interfaceC28601c1, function117, ((Long) obj).longValue(), (String) obj2, (EnumC39731b) obj3, zBooleanValue, zBooleanValue2);
                            }
                        };
                        c28655q5.m87172p0(interfaceC4353o7);
                        objM87133R6 = interfaceC4353o7;
                    }
                    c28676v4 = c28676v3;
                    m10775N0(c12341k, function6, interfaceC4351m7, function115, (InterfaceC4353o) objM87133R6, function7, interfaceC4339a5, c28655q5, 0, 0);
                    float f113 = 4;
                    f14 = f113 * r19;
                    AbstractC22953f.m66715b(c28655q5, AbstractC1102d.m3419p(f14, c2314t2));
                    c12337gM34447f = c12341k.getIsSuccess().getDateSelectorState();
                    if (c12337gM34447f == null) {
                        c28655q5.m87150e0(1084880516);
                        interfaceC25312uM34461t = c12341k.getIsSuccess().getTalkTextWidget();
                        if (interfaceC25312uM34461t == null) {
                            c28655q5.m87150e0(-728442371);
                            c28655q5.m87173q(false);
                            i14 = 3;
                            c2314t = c2314t2;
                            z13 = false;
                        } else {
                            c28655q5.m87150e0(-728442370);
                            i14 = 3;
                            c2314t = c2314t2;
                            AbstractC25303l.m74291r(interfaceC25312uM34461t, p720m91.Function1.m74307h(null, 1, null), new C13762f(20), null, c28655q5, C25307p.f99300b << 3, 8);
                            z13 = false;
                            AbstractC25012a.m73389v(c2314t, f14, c28655q5, false);
                        }
                        c28655q5.m87173q(z13);
                    } else {
                        c28655q5.m87150e0(1084880516);
                        interfaceC25312uM34461t = c12341k.getIsSuccess().getTalkTextWidget();
                        if (interfaceC25312uM34461t == null) {
                            c28655q5.m87150e0(-728442371);
                            c28655q5.m87173q(false);
                            i14 = 3;
                            c2314t = c2314t2;
                            z13 = false;
                        } else {
                            c28655q5.m87150e0(-728442370);
                            i14 = 3;
                            c2314t = c2314t2;
                            AbstractC25303l.m74291r(interfaceC25312uM34461t, p720m91.Function1.m74307h(null, 1, null), new C13762f(20), null, c28655q5, C25307p.f99300b << 3, 8);
                            z13 = false;
                            AbstractC25012a.m73389v(c2314t, f14, c28655q5, false);
                        }
                        c28655q5.m87173q(z13);
                    }
                    c12337gM34447f2 = c12341k.getIsSuccess().getDateSelectorState();
                    if (c12337gM34447f2 == null) {
                        c28655q5.m87150e0(-727041449);
                        Modifier modifierM3396r6 = AbstractC1099a.m3396r(c2314t, 2 * r19, 0.0f, 2);
                        C23010x c23010xM66775a9 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q5, 0);
                        iHashCode2 = Long.hashCode(c28655q5.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q5.m87165m();
                        Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q5, modifierM3396r6);
                        c28655q5.m87158i0();
                        if (c28655q5.f115903S) {
                            c28655q5.m87163l(c0213j);
                        } else {
                            c28655q5.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q5, r20, c23010xM66775a9);
                        AbstractC28683x.m87239G(c28655q5, c0209i4, interfaceC28653p1M87165m13);
                        if (c28655q5.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i5);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i5);
                        }
                        c0209i = c0209i6;
                        AbstractC28683x.m87239G(c28655q5, c0209i, modifierM118962N13);
                        if (m10895u1(interfaceC23462h).isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_IN_JOURNAL_NON_ONBOARDING)) {
                            c28655q5.m87150e0(-30551116);
                            List<C36873b> listM34457p6 = c12341k.getIsSuccess().m34457p();
                            zM87153g5 = c28655q5.m87153g(function5) | c28655q5.m87153g(c13821r1) | c28655q5.m87157i(c12341k) | c28655q5.m87153g(interfaceC4352n) | c28655q5.m87153g(function3);
                            objM87133R8 = c28655q5.m87133R();
                            if (zM87153g5) {
                                c28676v5 = c28676v4;
                            } else {
                                c28676v5 = c28676v4;
                            }
                            c28655q3 = c28655q5;
                            f15 = 0.0f;
                            c28676v0 = c28676v5;
                            C1040r c1040r6 = new C1040r(function5, (Object) c13821r1, (Object) c12341k, (Object) interfaceC4352n, (Object) function3, 3);
                            c12341k3 = c12341k;
                            c28655q3.m87172p0(c1040r6);
                            objM87133R8 = c1040r6;
                            function13 = function8;
                            C28655q c28655q14 = c28655q3;
                            AbstractC3585d0.m10924e(listM34457p6, interfaceC15237i, function13, (Function1) objM87133R8, c28655q14, 0);
                            c28655q2 = c28655q14;
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2 = c28655q5;
                            c12341k3 = c12341k;
                            c28676v0 = c28676v4;
                            f15 = 0.0f;
                            function13 = function8;
                            c28655q2.m87150e0(-29469061);
                            m10805X0(c12341k3.getIsSuccess().m34457p(), interfaceC15237i, function13, c28655q2, 0);
                            c28655q2.m87173q(false);
                        }
                        float f215 = i14 * r19;
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f215, c2314t));
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C3578a(interfaceC28690z0, 1);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        m10855k1(c12341k3, (Function1) objM87133R7, function13, c28655q2, 48);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f215, c2314t));
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f13, c2314t));
                        z14 = true;
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q5.m87150e0(-727041449);
                        Modifier modifierM3396r7 = AbstractC1099a.m3396r(c2314t, 2 * r19, 0.0f, 2);
                        C23010x c23010xM66775a10 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q5, 0);
                        iHashCode2 = Long.hashCode(c28655q5.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q5.m87165m();
                        Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q5, modifierM3396r7);
                        c28655q5.m87158i0();
                        if (c28655q5.f115903S) {
                            c28655q5.m87163l(c0213j);
                        } else {
                            c28655q5.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q5, r20, c23010xM66775a10);
                        AbstractC28683x.m87239G(c28655q5, c0209i4, interfaceC28653p1M87165m14);
                        if (c28655q5.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i5);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i5);
                        }
                        c0209i = c0209i6;
                        AbstractC28683x.m87239G(c28655q5, c0209i, modifierM118962N14);
                        if (m10895u1(interfaceC23462h).isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_IN_JOURNAL_NON_ONBOARDING)) {
                            c28655q5.m87150e0(-30551116);
                            List<C36873b> listM34457p7 = c12341k.getIsSuccess().m34457p();
                            zM87153g5 = c28655q5.m87153g(function5) | c28655q5.m87153g(c13821r1) | c28655q5.m87157i(c12341k) | c28655q5.m87153g(interfaceC4352n) | c28655q5.m87153g(function3);
                            objM87133R8 = c28655q5.m87133R();
                            if (zM87153g5) {
                                c28676v5 = c28676v4;
                            } else {
                                c28676v5 = c28676v4;
                            }
                            c28655q3 = c28655q5;
                            f15 = 0.0f;
                            c28676v0 = c28676v5;
                            C1040r c1040r7 = new C1040r(function5, (Object) c13821r1, (Object) c12341k, (Object) interfaceC4352n, (Object) function3, 3);
                            c12341k3 = c12341k;
                            c28655q3.m87172p0(c1040r7);
                            objM87133R8 = c1040r7;
                            function13 = function8;
                            C28655q c28655q15 = c28655q3;
                            AbstractC3585d0.m10924e(listM34457p7, interfaceC15237i, function13, (Function1) objM87133R8, c28655q15, 0);
                            c28655q2 = c28655q15;
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2 = c28655q5;
                            c12341k3 = c12341k;
                            c28676v0 = c28676v4;
                            f15 = 0.0f;
                            function13 = function8;
                            c28655q2.m87150e0(-29469061);
                            m10805X0(c12341k3.getIsSuccess().m34457p(), interfaceC15237i, function13, c28655q2, 0);
                            c28655q2.m87173q(false);
                        }
                        float f216 = i14 * r19;
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f216, c2314t));
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C3578a(interfaceC28690z0, 1);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        m10855k1(c12341k3, (Function1) objM87133R7, function13, c28655q2, 48);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f216, c2314t));
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f13, c2314t));
                        z14 = true;
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z14);
                    c28655q2.m87173q(z14);
                    c0209i2 = c0209i;
                    float f217 = f15;
                    Modifier modifierM66722k4 = AbstractC22953f.m66722k(AbstractC1092a.m3357b(AbstractC1102d.m3409f(1.0f, C1100b.f4583a.mo3400a(c2314t, C2299e.f9105H)), C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(f15), new C17919x(C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getTransparent())), new C23465k(Float.valueOf(0.25f), new C17919x(AbstractC17918w0.m51517e(4279244056L)))}, f217, f217, 14), null, f217, 6));
                    float f218 = 2 * r19;
                    f16 = 3 * f111;
                    if (c12341k3.getIsSuccess().getCoachAiAction() != null) {
                        f17 = 90;
                    } else {
                        f17 = f16;
                    }
                    Modifier modifierM3397s4 = AbstractC1099a.m3397s(modifierM66722k4, f16, f14, f17, f218);
                    objM87133R9 = c28655q2.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C3591j(1, interfaceC28601c4);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    m10760I0(AbstractC1131a.m3500d(modifierM3397s4, (Function1) objM87133R9), c12341k3, function2, c28655q2, 0);
                    c17027bM34445d = c12341k3.getIsSuccess().m34445d();
                    if (c17027bM34445d == null) {
                        c28655q2.m87150e0(-1142830328);
                        c28655q2.m87173q(false);
                        c28655q = c28655q2;
                        z16 = false;
                        z15 = true;
                    } else {
                        c28655q2.m87150e0(-1142830327);
                        Modifier modifierM7154a4 = AbstractC2294a.m7154a(2.0f, c2314t);
                        InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q2.m87165m();
                        Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q2, modifierM7154a4);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC39127r0M66763d5);
                        AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m15);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i2, modifierM118962N15);
                        boolean zM10899v4 = m10899v1(interfaceC28601c5);
                        objM87133R10 = c28655q2.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = new C3598q(interfaceC28601c5, 0);
                            c28655q2.m87172p0(objM87133R10);
                        }
                        InterfaceC4339a interfaceC4339a11 = (InterfaceC4339a) objM87133R10;
                        zM87153g6 = c28655q2.m87153g(function9) | c28655q2.m87153g(function5) | c28655q2.m87153g(c13821r1) | c28655q2.m87153g(interfaceC4352n) | c28655q2.m87157i(c12341k3) | c28655q2.m87153g(function3);
                        Object objM87133R111 = c28655q2.m87133R();
                        if (zM87153g6) {
                            c28655q4 = c28655q2;
                            c3424a0 = new C3424a0(function9, function5, c13821r1, interfaceC4352n, c12341k3, interfaceC28601c1, function3);
                            c28655q4.m87172p0(c3424a0);
                        } else {
                            c28655q4 = c28655q2;
                            c3424a0 = new C3424a0(function9, function5, c13821r1, interfaceC4352n, c12341k3, interfaceC28601c1, function3);
                            c28655q4.m87172p0(c3424a0);
                        }
                        C28655q c28655q16 = c28655q4;
                        AbstractC3587f.m10937h(c17027bM34445d, zM10899v4, interfaceC4339a11, (Function1) c3424a0, c28655q16, C17027b.f65485k | 384);
                        c28655q = c28655q16;
                        z15 = true;
                        c28655q.m87173q(true);
                        z16 = false;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z15);
                    c28655q.m87173q(z16);
                }
                c28655q = c28655q5;
                c28676v0 = c28676v6;
                zM87157i = c28655q.m87157i(c15199y3) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar) | c28655q.m87153g(interfaceC4339a3);
                objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new C1012d(c15199y3, interfaceC2994c0, interfaceC4339a3, aVar, 3);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q, 0, 1);
            }
            zM87157i = c28655q.m87157i(c15199y3) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar) | c28655q.m87153g(interfaceC4339a3);
            objM87133R = c28655q.m87133R();
            if (zM87157i) {
                objM87133R = new C1012d(c15199y3, interfaceC2994c0, interfaceC4339a3, aVar, 3);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C1012d(c15199y3, interfaceC2994c0, interfaceC4339a3, aVar, 3);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q, 0, 1);
        } else {
            c28655q5.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01af  */
    /* JADX WARN: Code duplicated, block: B:102:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:105:0x0200  */
    /* JADX WARN: Code duplicated, block: B:106:0x0204  */
    /* JADX WARN: Code duplicated, block: B:109:0x0211  */
    /* JADX WARN: Code duplicated, block: B:111:0x021f  */
    /* JADX WARN: Code duplicated, block: B:114:0x023c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0244  */
    /* JADX WARN: Code duplicated, block: B:120:0x024b  */
    /* JADX WARN: Code duplicated, block: B:124:0x0257  */
    /* JADX WARN: Code duplicated, block: B:127:0x0273  */
    /* JADX WARN: Code duplicated, block: B:128:0x0275  */
    /* JADX WARN: Code duplicated, block: B:131:0x027e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x0280  */
    /* JADX WARN: Code duplicated, block: B:136:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:137:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:139:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:141:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:143:0x0348  */
    /* JADX WARN: Code duplicated, block: B:144:0x034a  */
    /* JADX WARN: Code duplicated, block: B:147:0x0356  */
    /* JADX WARN: Code duplicated, block: B:150:0x035b  */
    /* JADX WARN: Code duplicated, block: B:154:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:155:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:158:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:160:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:162:0x0414  */
    /* JADX WARN: Code duplicated, block: B:166:0x0447  */
    /* JADX WARN: Code duplicated, block: B:167:0x044b  */
    /* JADX WARN: Code duplicated, block: B:170:0x0458  */
    /* JADX WARN: Code duplicated, block: B:172:0x0466  */
    /* JADX WARN: Code duplicated, block: B:175:0x0476  */
    /* JADX WARN: Code duplicated, block: B:177:0x0486  */
    /* JADX WARN: Code duplicated, block: B:179:0x0495  */
    /* JADX WARN: Code duplicated, block: B:181:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:183:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:184:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:186:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:188:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:189:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:192:0x04d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:195:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:198:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:199:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:202:0x0500 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:205:0x0508  */
    /* JADX WARN: Code duplicated, block: B:210:0x055f  */
    /* JADX WARN: Code duplicated, block: B:213:0x0577  */
    /* JADX WARN: Code duplicated, block: B:215:0x059a  */
    /* JADX WARN: Code duplicated, block: B:216:0x059e  */
    /* JADX WARN: Code duplicated, block: B:219:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:221:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:225:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:228:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:230:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:232:0x0600  */
    /* JADX WARN: Code duplicated, block: B:233:0x0602  */
    /* JADX WARN: Code duplicated, block: B:236:0x0609 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:239:0x060f  */
    /* JADX WARN: Code duplicated, block: B:243:0x0636  */
    /* JADX WARN: Code duplicated, block: B:244:0x0641  */
    /* JADX WARN: Code duplicated, block: B:247:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:248:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:251:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:253:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:256:0x070a  */
    /* JADX WARN: Code duplicated, block: B:258:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x0115  */
    /* JADX WARN: Code duplicated, block: B:82:0x0119  */
    /* JADX WARN: Code duplicated, block: B:85:0x012c  */
    /* JADX WARN: Code duplicated, block: B:87:0x013a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0151  */
    /* JADX WARN: Code duplicated, block: B:91:0x0170  */
    /* JADX WARN: Code duplicated, block: B:93:0x0198  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ad A[ADDED_TO_REGION] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v26, types: [int] */
    /* JADX WARN: Type inference failed for: r10v48 */
    /* JADX WARN: Type inference failed for: r10v62 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: N0 */
    private static final void m10775N0(C12341k c12341k, Function1 function1, InterfaceC4351m interfaceC4351m, Function1 function2, InterfaceC4353o interfaceC4353o, Function1 function3, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4351m interfaceC4351m2;
        int i16;
        Function1 function4;
        int i17;
        boolean z4;
        Function1 function5;
        C12341k c12341k2;
        InterfaceC4351m interfaceC4351m3;
        Function1 function6;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4351m interfaceC4351m4;
        Function1 function7;
        C2314t c2314t;
        C2307m c2307m;
        int iHashCode;
        C0213j c0213j;
        InterfaceC4351m interfaceC4351m5;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        C12337g c12337gM34447f;
        C1100b c1100b;
        C2314t c2314t2;
        boolean z13;
        Modifier modifierM3362g;
        int i18;
        int iHashCode2;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        Object objM87133R;
        Function1 function8;
        C2314t c2314t3;
        boolean z18;
        C0209i c0209i5;
        boolean z19;
        boolean z24;
        Object objM87133R2;
        C28655q c28655q2;
        AbstractC12336f abstractC12336fM34453l;
        boolean z25;
        char c3;
        C2314t c2314t4;
        C28676v0 c28676v1;
        boolean z26;
        C28655q c28655q3;
        AbstractC12336f.c cVar;
        boolean z27;
        boolean zM87153g;
        Object objM87133R3;
        int iHashCode3;
        ?? r10;
        C28655q c28655q4;
        C22949e c22949e;
        int iHashCode4;
        AbstractC12336f abstractC12336fM34453l2;
        int i19;
        boolean z28;
        Object objM87133R4;
        InterfaceC4351m interfaceC4351m6;
        boolean z29;
        Object objM87133R5;
        Function1 function9;
        C22949e c22949e2;
        boolean z34;
        C28655q c28655q5;
        C28655q c28655q6;
        float f13;
        C12337g c12337gM34447f2;
        int iHashCode5;
        C12344n c12344nM34454m;
        boolean z35;
        Object objM87133R6;
        boolean z36;
        String strM34443b;
        C28655q c28655q7;
        boolean z37;
        C28655q c28655q8;
        Object objM87133R7;
        Object objM87133R8;
        int i24;
        int i25;
        int i26;
        InterfaceC4339a interfaceC4339a2 = interfaceC4339a;
        C28655q c28655q9 = (C28655q) composer;
        c28655q9.m87154g0(-252016636);
        if ((i13 & 6) == 0) {
            i15 = (c28655q9.m87157i(c12341k) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q9.m87157i(function1) ? 32 : 16;
        }
        int i27 = i14 & 4;
        if (i27 == 0) {
            if ((i13 & 384) == 0) {
                interfaceC4351m2 = interfaceC4351m;
                i15 |= c28655q9.m87157i(interfaceC4351m2) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    function4 = function2;
                    if (c28655q9.m87157i(function4)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i13 & 24576) == 0) {
                    if (c28655q9.m87157i(interfaceC4353o)) {
                        i26 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i26 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i26;
                }
                if ((196608 & i13) == 0) {
                    if (c28655q9.m87157i(function3)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                if ((1572864 & i13) == 0) {
                    if (c28655q9.m87157i(interfaceC4339a2)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i15 |= i24;
                }
                if ((599187 & i15) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q9.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i27 != 0) {
                        objM87133R8 = c28655q9.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C26047n(25);
                            c28655q9.m87172p0(objM87133R8);
                        }
                        interfaceC4351m4 = (InterfaceC4351m) objM87133R8;
                    } else {
                        interfaceC4351m4 = interfaceC4351m2;
                    }
                    if (i16 != 0) {
                        objM87133R7 = c28655q9.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C3595n(2);
                            c28655q9.m87172p0(objM87133R7);
                        }
                        function7 = (Function1) objM87133R7;
                    } else {
                        function7 = function4;
                    }
                    c2314t = C2314t.f9131w;
                    Modifier modifierM3427x = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t), null, 3);
                    c2307m = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode = Long.hashCode(c28655q9.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q9.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q9, modifierM3427x);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q9.m87158i0();
                    interfaceC4351m5 = interfaceC4351m4;
                    if (c28655q9.f115903S) {
                        c28655q9.m87163l(c0213j);
                    } else {
                        c28655q9.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q9, c0209i, interfaceC39127r0M66763d);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q9, c0209i2, interfaceC28653p1M87165m);
                    c0209i3 = C0217k.f732j;
                    if (c28655q9.f115903S || !AbstractC22676k.m65745e(c28655q9.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q9, iHashCode, c0209i3);
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q9, c0209i4, modifierM118962N);
                    c12337gM34447f = c12341k.getIsSuccess().getDateSelectorState();
                    c1100b = C1100b.f4583a;
                    if (c12337gM34447f == null) {
                        c28655q9.m87150e0(284646928);
                        c28655q9.m87173q(false);
                        i18 = i15;
                        z18 = false;
                        function8 = function7;
                        c2314t3 = c2314t;
                        c0209i5 = c0209i3;
                        c28655q2 = c28655q9;
                        z19 = true;
                    } else {
                        c28655q9.m87150e0(284646929);
                        Modifier modifierM3409f = AbstractC1102d.m3409f(0.4f, c1100b.mo3400a(AbstractC1099a.m3396r(c2314t, 0.0f, 8 * 2, 1), C2299e.f9102E));
                        if (c12337gM34447f.getIsLoading()) {
                            c2314t2 = c2314t;
                            z13 = false;
                            c28655q9.m87150e0(162819610);
                            c28655q9.m87173q(false);
                            modifierM3362g = c2314t2;
                        } else {
                            c28655q9.m87150e0(162697315);
                            if ((i15 & 7168) == 2048) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            objM87133R2 = c28655q9.m87133R();
                            if (z24 || objM87133R2 == c28676v0) {
                                objM87133R2 = new C3599r(function7, 2);
                                c28655q9.m87172p0(objM87133R2);
                            }
                            modifierM3362g = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                            c2314t2 = c2314t;
                            z13 = false;
                            c28655q9.m87173q(false);
                        }
                        Modifier modifierMo3471e = modifierM3409f.mo3471e(modifierM3362g);
                        Function1 function10 = function7;
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, z13);
                        i18 = i15;
                        iHashCode2 = Long.hashCode(c28655q9.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q9.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q9, modifierMo3471e);
                        c28655q9.m87158i0();
                        if (c28655q9.f115903S) {
                            c28655q9.m87163l(c0213j);
                        } else {
                            c28655q9.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q9, c0209i, interfaceC39127r0M66763d2);
                        AbstractC28683x.m87239G(c28655q9, c0209i2, interfaceC28653p1M87165m2);
                        if (c28655q9.f115903S || !AbstractC22676k.m65745e(c28655q9.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q9, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q9, c0209i4, modifierM118962N2);
                        Modifier modifierM44101d = AbstractC15676d.m44101d(c2314t2, "JournalDateSelector");
                        boolean zM34475i = c12337gM34447f.getIsLoading();
                        C22961h c22961h = AbstractC22977m.f90655f;
                        C2314t c2314t5 = c2314t2;
                        TextResource textResourceM34474h = c12337gM34447f.getText();
                        if (c12337gM34447f.getBackButtonEnabled() || c12337gM34447f.getIsLoading()) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        if (c12337gM34447f.getForwardButtonEnabled() || c12337gM34447f.getIsLoading()) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        String strM34469c = c12337gM34447f.getBackDate();
                        String strM34473g = c12337gM34447f.getForwardDate();
                        boolean zM87157i = c28655q9.m87157i(c12337gM34447f);
                        if ((i18 & 57344) == 16384) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = zM87157i | z16;
                        objM87133R = c28655q9.m87133R();
                        if (z17 || objM87133R == c28676v0) {
                            objM87133R = new C3169c(5, c12337gM34447f, interfaceC4353o);
                            c28655q9.m87172p0(objM87133R);
                        }
                        function8 = function10;
                        c2314t3 = c2314t5;
                        z18 = false;
                        c0209i5 = c0209i3;
                        z19 = true;
                        AbstractC17862e.m51358q(modifierM44101d, zM34475i, c22961h, textResourceM34474h, z14, z15, strM34469c, strM34473g, null, null, null, null, (Function1) objM87133R, c28655q9, (TextResource.$stable << 9) | 384, 0, 3840);
                        C28655q c28655q10 = c28655q9;
                        c28655q10.m87173q(true);
                        c28655q10.m87173q(false);
                        c28655q2 = c28655q10;
                    }
                    abstractC12336fM34453l = c12341k.getIsSuccess().getJournalDatePillViewState();
                    if (abstractC12336fM34453l == null) {
                        c28655q2.m87150e0(286188744);
                        c28655q2.m87173q(z18);
                        z25 = z19;
                        r10 = z18;
                        c3 = 18;
                        c2314t4 = c2314t3;
                        c28676v1 = c28676v0;
                        c28655q4 = c28655q2;
                    } else {
                        c28655q2.m87150e0(286188745);
                        if (abstractC12336fM34453l instanceof AbstractC12336f.c) {
                            cVar = (AbstractC12336f.c) abstractC12336fM34453l;
                            if (cVar.getTodayCta() != null) {
                                c28655q2.m87150e0(-2139006474);
                                C2314t c2314t6 = c2314t3;
                                C38072d c38072d = C38072d.f163053a;
                                int i28 = C38072d.f163054b;
                                Modifier modifierM44455h = AbstractC15751g.m44455h(AbstractC37056f.m118994r(c1100b.mo3400a(AbstractC1099a.m3398t(c2314t6, 0.0f, 0.0f, 18, 0.0f, 11), C2299e.f9103F), AbstractC33253j.m105486b(40)), (float) 1.5d, c38072d.m121949b(c28655q2, i28).getWhite20(), AbstractC33253j.m105486b(40));
                                if ((i18 & 57344) == 16384) {
                                    z27 = true;
                                } else {
                                    z27 = false;
                                }
                                zM87153g = z27 | c28655q2.m87153g(abstractC12336fM34453l);
                                objM87133R3 = c28655q2.m87133R();
                                if (zM87153g) {
                                    c28676v1 = c28676v0;
                                } else {
                                    c28676v1 = c28676v0;
                                    if (objM87133R3 == c28676v1) {
                                    }
                                    Modifier modifierM44101d2 = AbstractC15676d.m44101d(AbstractC1099a.m3395q(AbstractC1092a.m3362g(modifierM44455h, false, null, null, (InterfaceC4339a) objM87133R3, 15), 10, 6), "Journal_DatePicker_TodayButton");
                                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
                                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM44101d2);
                                    c28655q2.m87158i0();
                                    if (c28655q2.f115903S) {
                                        c28655q2.m87163l(c0213j);
                                    } else {
                                        c28655q2.m87178s0();
                                    }
                                    AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d3);
                                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m3);
                                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
                                    }
                                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N3);
                                    c2314t4 = c2314t6;
                                    C28655q c28655q11 = c28655q2;
                                    c3 = 18;
                                    AbstractC30795n.m94707h(cVar.getTodayCta().getText(), null, C17919x.f69629f, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i28).getH5(), null, c28655q11, 384, C2886a.f11498d << 18, 196602);
                                    C28655q c28655q12 = c28655q11;
                                    z25 = true;
                                    c28655q12.m87173q(true);
                                    z26 = false;
                                    c28655q12.m87173q(false);
                                    c28655q3 = c28655q12;
                                }
                                objM87133R3 = new C17820i(28, interfaceC4353o, abstractC12336fM34453l);
                                c28655q2.m87172p0(objM87133R3);
                                Modifier modifierM44101d3 = AbstractC15676d.m44101d(AbstractC1099a.m3395q(AbstractC1092a.m3362g(modifierM44455h, false, null, null, (InterfaceC4339a) objM87133R3, 15), 10, 6), "Journal_DatePicker_TodayButton");
                                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m, false);
                                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM44101d3);
                                c28655q2.m87158i0();
                                if (c28655q2.f115903S) {
                                    c28655q2.m87163l(c0213j);
                                } else {
                                    c28655q2.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d4);
                                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m4);
                                if (c28655q2.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
                                }
                                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N4);
                                c2314t4 = c2314t6;
                                C28655q c28655q13 = c28655q2;
                                c3 = 18;
                                AbstractC30795n.m94707h(cVar.getTodayCta().getText(), null, C17919x.f69629f, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i28).getH5(), null, c28655q13, 384, C2886a.f11498d << 18, 196602);
                                C28655q c28655q14 = c28655q13;
                                z25 = true;
                                c28655q14.m87173q(true);
                                z26 = false;
                                c28655q14.m87173q(false);
                                c28655q3 = c28655q14;
                            } else {
                                z25 = z19;
                                boolean z38 = z18;
                                c3 = 18;
                                c2314t4 = c2314t3;
                                c28676v1 = c28676v0;
                                c28655q2.m87150e0(-2138052201);
                                c28655q2.m87173q(z38);
                                c28655q3 = c28655q2;
                                z26 = z38;
                            }
                        } else {
                            z25 = z19;
                            boolean z39 = z18;
                            c3 = 18;
                            c2314t4 = c2314t3;
                            c28676v1 = c28676v0;
                            c28655q2.m87150e0(-2138052201);
                            c28655q2.m87173q(z39);
                            c28655q3 = c28655q2;
                            z26 = z39;
                        }
                        c28655q3.m87173q(z26);
                        c28655q4 = c28655q3;
                        r10 = z26;
                    }
                    c28655q4.m87173q(z25);
                    c22949e = AbstractC22977m.f90650a;
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, C2299e.f9107J, c28655q4, r10);
                    iHashCode4 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q4.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q4, c2314t4);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m5);
                    if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode4))) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N5);
                    abstractC12336fM34453l2 = c12341k.getIsSuccess().getJournalDatePillViewState();
                    if (abstractC12336fM34453l2 == null) {
                        c28655q4.m87150e0(1797254041);
                        c28655q4.m87173q(false);
                        c22949e2 = c22949e;
                        c28655q6 = c28655q4;
                    } else {
                        c28655q4.m87150e0(1797254042);
                        if (abstractC12336fM34453l2.equals(AbstractC12336f.a.f41453a)) {
                            c28655q4.m87150e0(763465134);
                            c28655q4.m87173q(false);
                        } else {
                            if (abstractC12336fM34453l2.equals(AbstractC12336f.b.f41454a)) {
                                c28655q4.m87150e0(763521678);
                                c28655q4.m87173q(false);
                            } else {
                                if (abstractC12336fM34453l2 instanceof AbstractC12336f.c) {
                                    throw AbstractC11895b.m32003v(578815926, c28655q4, false);
                                }
                                c28655q4.m87150e0(763598031);
                                AbstractC12336f.c cVar2 = (AbstractC12336f.c) abstractC12336fM34453l2;
                                List<C16613h> listM34463a = cVar2.m34463a();
                                i19 = i18;
                                if ((i19 & 896) == 256) {
                                    z28 = true;
                                } else {
                                    z28 = false;
                                }
                                objM87133R4 = c28655q4.m87133R();
                                if (!z28 || objM87133R4 == c28676v1) {
                                    interfaceC4351m6 = interfaceC4351m5;
                                    objM87133R4 = new C3600s(0, interfaceC4351m6);
                                    c28655q4.m87172p0(objM87133R4);
                                } else {
                                    interfaceC4351m6 = interfaceC4351m5;
                                }
                                InterfaceC4351m interfaceC4351m7 = (InterfaceC4351m) objM87133R4;
                                interfaceC4351m5 = interfaceC4351m6;
                                if ((i19 & 7168) == 2048) {
                                    z29 = true;
                                } else {
                                    z29 = false;
                                }
                                objM87133R5 = c28655q4.m87133R();
                                if (!z29 || objM87133R5 == c28676v1) {
                                    function9 = function8;
                                    objM87133R5 = new C3599r(function9, 3);
                                    c28655q4.m87172p0(objM87133R5);
                                } else {
                                    function9 = function8;
                                }
                                C28655q c28655q15 = c28655q4;
                                function8 = function9;
                                i18 = i19;
                                c22949e2 = c22949e;
                                AbstractC16611f.m47150h(null, listM34463a, interfaceC4351m7, null, (InterfaceC4339a) objM87133R5, r12.getLeftCalendarDisplayIcon(), cVar2.getRightCalendarDisplayIcon(), "Journal_DatePicker_DayPill", c28655q15, 12582912, 9);
                                C28655q c28655q16 = c28655q15;
                                z34 = false;
                                c28655q16.m87173q(false);
                                c28655q5 = c28655q16;
                            }
                            c28655q5.m87173q(z34);
                            c28655q6 = c28655q5;
                        }
                        c22949e2 = c22949e;
                        z34 = false;
                        c28655q5 = c28655q4;
                        c28655q5.m87173q(z34);
                        c28655q6 = c28655q5;
                    }
                    c28655q6.m87173q(true);
                    f13 = 8;
                    AbstractC22953f.m66715b(c28655q6, AbstractC1102d.m3419p(3 * f13, c2314t4));
                    c12337gM34447f2 = c12341k.getIsSuccess().getDateSelectorState();
                    if (c12337gM34447f2 == null && c12337gM34447f2.getIsLoading()) {
                        c28655q6.m87150e0(-219424770);
                        c28655q6.m87173q(false);
                        c12341k2 = c12341k;
                        function5 = function3;
                        interfaceC4339a2 = interfaceC4339a;
                        c28655q8 = c28655q6;
                    } else {
                        c28655q6.m87150e0(-220551062);
                        C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9108K, c28655q6, 48);
                        iHashCode5 = Long.hashCode(c28655q6.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q6.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q6, c2314t4);
                        c28655q6.m87158i0();
                        if (c28655q6.f115903S) {
                            c28655q6.m87163l(c0213j);
                        } else {
                            c28655q6.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q6, c0209i, c22994r1M66759a2);
                        AbstractC28683x.m87239G(c28655q6, c0209i2, interfaceC28653p1M87165m6);
                        if (c28655q6.f115903S || !AbstractC22676k.m65745e(c28655q6.m87133R(), Integer.valueOf(iHashCode5))) {
                            AbstractC11266d.m30471y(iHashCode5, c28655q6, iHashCode5, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q6, c0209i4, modifierM118962N6);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        c12341k2 = c12341k;
                        m10769L0(c12341k2, new LayoutWeightElement(1.0f, true), c28655q6, i18 & 14, 0);
                        c12344nM34454m = c12341k2.getIsSuccess().getNavigationButton();
                        if (c12344nM34454m == null) {
                            c28655q6.m87150e0(469396342);
                            c28655q6.m87173q(false);
                            z36 = false;
                        } else {
                            c28655q6.m87150e0(469396343);
                            if ((i18 & 112) == 32) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            objM87133R6 = c28655q6.m87133R();
                            if (z35 || objM87133R6 == c28676v1) {
                                objM87133R6 = new C3586e(function1, 1);
                                c28655q6.m87172p0(objM87133R6);
                            }
                            z36 = false;
                            m10835f1(c12344nM34454m, (Function1) objM87133R6, c28655q6, TextResource.$stable | C9598e.f28134d, 0);
                            c28655q6.m87173q(false);
                        }
                        c28655q6.m87173q(true);
                        strM34443b = c12341k2.getIsSuccess().getAutosaveInstructionText();
                        if (strM34443b == null) {
                            c28655q6.m87150e0(-220233406);
                            c28655q6.m87173q(z36);
                            c28655q7 = c28655q6;
                        } else {
                            c28655q6.m87150e0(-220233405);
                            float f14 = 2 * f13;
                            AbstractC22953f.m66715b(c28655q6, AbstractC1102d.m3419p(f14, c2314t4));
                            C38072d c38072d2 = C38072d.f163053a;
                            int i29 = C38072d.f163054b;
                            C28655q c28655q17 = c28655q6;
                            AbstractC30795n.m94707h(strM34443b, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t4), f14, 0.0f, 2), c38072d2.m121949b(c28655q6, i29).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q6, i29).getB1(), null, c28655q17, 48, C2886a.f11498d << 18, 196088);
                            C28655q c28655q18 = c28655q17;
                            c28655q18.m87173q(false);
                            c28655q7 = c28655q18;
                        }
                        if (c12341k2.getIsSuccess().getDefaultAnswersToggleInfo().getShouldShowDefaultAnswersToggle()) {
                            c28655q7.m87150e0(-219738242);
                            AbstractC22953f.m66715b(c28655q7, AbstractC1102d.m3419p(1 * f13, c2314t4));
                            function5 = function3;
                            interfaceC4339a2 = interfaceC4339a;
                            m10738B0(c12341k2.getIsSuccess().getDefaultAnswersToggleInfo(), function5, interfaceC4339a2, c28655q7, (i18 >> 12) & MessageListItemViewType.GIPHY);
                            z37 = false;
                            c28655q7.m87173q(false);
                        } else {
                            function5 = function3;
                            interfaceC4339a2 = interfaceC4339a;
                            z37 = false;
                            c28655q7.m87150e0(-219430722);
                            c28655q7.m87173q(false);
                        }
                        c28655q7.m87173q(z37);
                        c28655q8 = c28655q7;
                    }
                    interfaceC4351m3 = interfaceC4351m5;
                    function6 = function8;
                    c28655q = c28655q8;
                } else {
                    C28655q c28655q19 = c28655q9;
                    function5 = function3;
                    c12341k2 = c12341k;
                    c28655q19.m87138X();
                    interfaceC4351m3 = interfaceC4351m2;
                    function6 = function4;
                    c28655q = c28655q19;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2931g(c12341k2, function1, interfaceC4351m3, function6, interfaceC4353o, function5, interfaceC4339a2, i13, i14);
                }
            }
            i15 |= 3072;
            function4 = function2;
            if ((i13 & 24576) == 0) {
                if (c28655q9.m87157i(interfaceC4353o)) {
                    i26 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i26 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i26;
            }
            if ((196608 & i13) == 0) {
                if (c28655q9.m87157i(function3)) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i25;
            }
            if ((1572864 & i13) == 0) {
                if (c28655q9.m87157i(interfaceC4339a2)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i15 |= i24;
            }
            if ((599187 & i15) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q9.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i27 != 0) {
                    objM87133R8 = c28655q9.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C26047n(25);
                        c28655q9.m87172p0(objM87133R8);
                    }
                    interfaceC4351m4 = (InterfaceC4351m) objM87133R8;
                } else {
                    interfaceC4351m4 = interfaceC4351m2;
                }
                if (i16 != 0) {
                    objM87133R7 = c28655q9.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C3595n(2);
                        c28655q9.m87172p0(objM87133R7);
                    }
                    function7 = (Function1) objM87133R7;
                } else {
                    function7 = function4;
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM3427x2 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t), null, 3);
                c2307m = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode = Long.hashCode(c28655q9.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q9.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q9, modifierM3427x2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q9.m87158i0();
                interfaceC4351m5 = interfaceC4351m4;
                if (c28655q9.f115903S) {
                    c28655q9.m87163l(c0213j);
                } else {
                    c28655q9.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q9, c0209i, interfaceC39127r0M66763d5);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q9, c0209i2, interfaceC28653p1M87165m7);
                c0209i3 = C0217k.f732j;
                if (c28655q9.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q9, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q9, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q9, c0209i4, modifierM118962N7);
                c12337gM34447f = c12341k.getIsSuccess().getDateSelectorState();
                c1100b = C1100b.f4583a;
                if (c12337gM34447f == null) {
                    c28655q9.m87150e0(284646928);
                    c28655q9.m87173q(false);
                    i18 = i15;
                    z18 = false;
                    function8 = function7;
                    c2314t3 = c2314t;
                    c0209i5 = c0209i3;
                    c28655q2 = c28655q9;
                    z19 = true;
                } else {
                    c28655q9.m87150e0(284646929);
                    Modifier modifierM3409f2 = AbstractC1102d.m3409f(0.4f, c1100b.mo3400a(AbstractC1099a.m3396r(c2314t, 0.0f, 8 * 2, 1), C2299e.f9102E));
                    if (c12337gM34447f.getIsLoading()) {
                        c28655q9.m87150e0(162697315);
                        if ((i15 & 7168) == 2048) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        objM87133R2 = c28655q9.m87133R();
                        if (z24) {
                            objM87133R2 = new C3599r(function7, 2);
                            c28655q9.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C3599r(function7, 2);
                            c28655q9.m87172p0(objM87133R2);
                        }
                        modifierM3362g = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                        c2314t2 = c2314t;
                        z13 = false;
                        c28655q9.m87173q(false);
                    } else {
                        c2314t2 = c2314t;
                        z13 = false;
                        c28655q9.m87150e0(162819610);
                        c28655q9.m87173q(false);
                        modifierM3362g = c2314t2;
                    }
                    Modifier modifierMo3471e2 = modifierM3409f2.mo3471e(modifierM3362g);
                    Function1 function11 = function7;
                    InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m, z13);
                    i18 = i15;
                    iHashCode2 = Long.hashCode(c28655q9.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q9.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q9, modifierMo3471e2);
                    c28655q9.m87158i0();
                    if (c28655q9.f115903S) {
                        c28655q9.m87163l(c0213j);
                    } else {
                        c28655q9.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q9, c0209i, interfaceC39127r0M66763d6);
                    AbstractC28683x.m87239G(c28655q9, c0209i2, interfaceC28653p1M87165m8);
                    if (c28655q9.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q9, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q9, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q9, c0209i4, modifierM118962N8);
                    Modifier modifierM44101d4 = AbstractC15676d.m44101d(c2314t2, "JournalDateSelector");
                    boolean zM34475i2 = c12337gM34447f.getIsLoading();
                    C22961h c22961h2 = AbstractC22977m.f90655f;
                    C2314t c2314t7 = c2314t2;
                    TextResource textResourceM34474h2 = c12337gM34447f.getText();
                    if (c12337gM34447f.getBackButtonEnabled()) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    if (c12337gM34447f.getForwardButtonEnabled()) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    String strM34469c2 = c12337gM34447f.getBackDate();
                    String strM34473g2 = c12337gM34447f.getForwardDate();
                    boolean zM87157i2 = c28655q9.m87157i(c12337gM34447f);
                    if ((i18 & 57344) == 16384) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = zM87157i2 | z16;
                    objM87133R = c28655q9.m87133R();
                    if (z17) {
                        objM87133R = new C3169c(5, c12337gM34447f, interfaceC4353o);
                        c28655q9.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C3169c(5, c12337gM34447f, interfaceC4353o);
                        c28655q9.m87172p0(objM87133R);
                    }
                    function8 = function11;
                    c2314t3 = c2314t7;
                    z18 = false;
                    c0209i5 = c0209i3;
                    z19 = true;
                    AbstractC17862e.m51358q(modifierM44101d4, zM34475i2, c22961h2, textResourceM34474h2, z14, z15, strM34469c2, strM34473g2, null, null, null, null, (Function1) objM87133R, c28655q9, (TextResource.$stable << 9) | 384, 0, 3840);
                    C28655q c28655q110 = c28655q9;
                    c28655q110.m87173q(true);
                    c28655q110.m87173q(false);
                    c28655q2 = c28655q110;
                }
                abstractC12336fM34453l = c12341k.getIsSuccess().getJournalDatePillViewState();
                if (abstractC12336fM34453l == null) {
                    c28655q2.m87150e0(286188744);
                    c28655q2.m87173q(z18);
                    z25 = z19;
                    r10 = z18;
                    c3 = 18;
                    c2314t4 = c2314t3;
                    c28676v1 = c28676v0;
                    c28655q4 = c28655q2;
                } else {
                    c28655q2.m87150e0(286188745);
                    if (abstractC12336fM34453l instanceof AbstractC12336f.c) {
                        cVar = (AbstractC12336f.c) abstractC12336fM34453l;
                        if (cVar.getTodayCta() != null) {
                            c28655q2.m87150e0(-2139006474);
                            C2314t c2314t8 = c2314t3;
                            C38072d c38072d3 = C38072d.f163053a;
                            int i210 = C38072d.f163054b;
                            Modifier modifierM44455h2 = AbstractC15751g.m44455h(AbstractC37056f.m118994r(c1100b.mo3400a(AbstractC1099a.m3398t(c2314t8, 0.0f, 0.0f, 18, 0.0f, 11), C2299e.f9103F), AbstractC33253j.m105486b(40)), (float) 1.5d, c38072d3.m121949b(c28655q2, i210).getWhite20(), AbstractC33253j.m105486b(40));
                            if ((i18 & 57344) == 16384) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            zM87153g = z27 | c28655q2.m87153g(abstractC12336fM34453l);
                            objM87133R3 = c28655q2.m87133R();
                            if (zM87153g) {
                                c28676v1 = c28676v0;
                                if (objM87133R3 == c28676v1) {
                                }
                                Modifier modifierM44101d5 = AbstractC15676d.m44101d(AbstractC1099a.m3395q(AbstractC1092a.m3362g(modifierM44455h2, false, null, null, (InterfaceC4339a) objM87133R3, 15), 10, 6), "Journal_DatePicker_TodayButton");
                                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m, false);
                                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifierM44101d5);
                                c28655q2.m87158i0();
                                if (c28655q2.f115903S) {
                                    c28655q2.m87163l(c0213j);
                                } else {
                                    c28655q2.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d7);
                                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m9);
                                if (c28655q2.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
                                }
                                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N9);
                                c2314t4 = c2314t8;
                                C28655q c28655q111 = c28655q2;
                                c3 = 18;
                                AbstractC30795n.m94707h(cVar.getTodayCta().getText(), null, C17919x.f69629f, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q2, i210).getH5(), null, c28655q111, 384, C2886a.f11498d << 18, 196602);
                                C28655q c28655q112 = c28655q111;
                                z25 = true;
                                c28655q112.m87173q(true);
                                z26 = false;
                                c28655q112.m87173q(false);
                                c28655q3 = c28655q112;
                            } else {
                                c28676v1 = c28676v0;
                            }
                            objM87133R3 = new C17820i(28, interfaceC4353o, abstractC12336fM34453l);
                            c28655q2.m87172p0(objM87133R3);
                            Modifier modifierM44101d6 = AbstractC15676d.m44101d(AbstractC1099a.m3395q(AbstractC1092a.m3362g(modifierM44455h2, false, null, null, (InterfaceC4339a) objM87133R3, 15), 10, 6), "Journal_DatePicker_TodayButton");
                            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m, false);
                            iHashCode3 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
                            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, modifierM44101d6);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d8);
                            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m10);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N10);
                            c2314t4 = c2314t8;
                            C28655q c28655q113 = c28655q2;
                            c3 = 18;
                            AbstractC30795n.m94707h(cVar.getTodayCta().getText(), null, C17919x.f69629f, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q2, i210).getH5(), null, c28655q113, 384, C2886a.f11498d << 18, 196602);
                            C28655q c28655q114 = c28655q113;
                            z25 = true;
                            c28655q114.m87173q(true);
                            z26 = false;
                            c28655q114.m87173q(false);
                            c28655q3 = c28655q114;
                        } else {
                            z25 = z19;
                            boolean z310 = z18;
                            c3 = 18;
                            c2314t4 = c2314t3;
                            c28676v1 = c28676v0;
                            c28655q2.m87150e0(-2138052201);
                            c28655q2.m87173q(z310);
                            c28655q3 = c28655q2;
                            z26 = z310;
                        }
                    } else {
                        z25 = z19;
                        boolean z311 = z18;
                        c3 = 18;
                        c2314t4 = c2314t3;
                        c28676v1 = c28676v0;
                        c28655q2.m87150e0(-2138052201);
                        c28655q2.m87173q(z311);
                        c28655q3 = c28655q2;
                        z26 = z311;
                    }
                    c28655q3.m87173q(z26);
                    c28655q4 = c28655q3;
                    r10 = z26;
                }
                c28655q4.m87173q(z25);
                c22949e = AbstractC22977m.f90650a;
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22949e, C2299e.f9107J, c28655q4, r10);
                iHashCode4 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q4.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q4, c2314t4);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a3);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m11);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N11);
                abstractC12336fM34453l2 = c12341k.getIsSuccess().getJournalDatePillViewState();
                if (abstractC12336fM34453l2 == null) {
                    c28655q4.m87150e0(1797254041);
                    c28655q4.m87173q(false);
                    c22949e2 = c22949e;
                    c28655q6 = c28655q4;
                } else {
                    c28655q4.m87150e0(1797254042);
                    if (abstractC12336fM34453l2.equals(AbstractC12336f.a.f41453a)) {
                        c28655q4.m87150e0(763465134);
                        c28655q4.m87173q(false);
                    } else {
                        if (abstractC12336fM34453l2.equals(AbstractC12336f.b.f41454a)) {
                            c28655q4.m87150e0(763521678);
                            c28655q4.m87173q(false);
                        } else {
                            if (abstractC12336fM34453l2 instanceof AbstractC12336f.c) {
                                throw AbstractC11895b.m32003v(578815926, c28655q4, false);
                            }
                            c28655q4.m87150e0(763598031);
                            AbstractC12336f.c cVar3 = (AbstractC12336f.c) abstractC12336fM34453l2;
                            List<C16613h> listM34463a2 = cVar3.m34463a();
                            i19 = i18;
                            if ((i19 & 896) == 256) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                            objM87133R4 = c28655q4.m87133R();
                            if (z28) {
                                interfaceC4351m6 = interfaceC4351m5;
                                objM87133R4 = new C3600s(0, interfaceC4351m6);
                                c28655q4.m87172p0(objM87133R4);
                            } else {
                                interfaceC4351m6 = interfaceC4351m5;
                                objM87133R4 = new C3600s(0, interfaceC4351m6);
                                c28655q4.m87172p0(objM87133R4);
                            }
                            InterfaceC4351m interfaceC4351m8 = (InterfaceC4351m) objM87133R4;
                            interfaceC4351m5 = interfaceC4351m6;
                            if ((i19 & 7168) == 2048) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            objM87133R5 = c28655q4.m87133R();
                            if (z29) {
                                function9 = function8;
                                objM87133R5 = new C3599r(function9, 3);
                                c28655q4.m87172p0(objM87133R5);
                            } else {
                                function9 = function8;
                                objM87133R5 = new C3599r(function9, 3);
                                c28655q4.m87172p0(objM87133R5);
                            }
                            C28655q c28655q115 = c28655q4;
                            function8 = function9;
                            i18 = i19;
                            c22949e2 = c22949e;
                            AbstractC16611f.m47150h(null, listM34463a2, interfaceC4351m8, null, (InterfaceC4339a) objM87133R5, r12.getLeftCalendarDisplayIcon(), cVar3.getRightCalendarDisplayIcon(), "Journal_DatePicker_DayPill", c28655q115, 12582912, 9);
                            C28655q c28655q116 = c28655q115;
                            z34 = false;
                            c28655q116.m87173q(false);
                            c28655q5 = c28655q116;
                        }
                        c28655q5.m87173q(z34);
                        c28655q6 = c28655q5;
                    }
                    c22949e2 = c22949e;
                    z34 = false;
                    c28655q5 = c28655q4;
                    c28655q5.m87173q(z34);
                    c28655q6 = c28655q5;
                }
                c28655q6.m87173q(true);
                f13 = 8;
                AbstractC22953f.m66715b(c28655q6, AbstractC1102d.m3419p(3 * f13, c2314t4));
                c12337gM34447f2 = c12341k.getIsSuccess().getDateSelectorState();
                if (c12337gM34447f2 == null) {
                    c28655q6.m87150e0(-220551062);
                    C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9108K, c28655q6, 48);
                    iHashCode5 = Long.hashCode(c28655q6.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q6.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q6, c2314t4);
                    c28655q6.m87158i0();
                    if (c28655q6.f115903S) {
                        c28655q6.m87163l(c0213j);
                    } else {
                        c28655q6.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q6, c0209i, c22994r1M66759a4);
                    AbstractC28683x.m87239G(c28655q6, c0209i2, interfaceC28653p1M87165m12);
                    if (c28655q6.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q6, iHashCode5, c0209i5);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, c28655q6, iHashCode5, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q6, c0209i4, modifierM118962N12);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    c12341k2 = c12341k;
                    m10769L0(c12341k2, new LayoutWeightElement(1.0f, true), c28655q6, i18 & 14, 0);
                    c12344nM34454m = c12341k2.getIsSuccess().getNavigationButton();
                    if (c12344nM34454m == null) {
                        c28655q6.m87150e0(469396342);
                        c28655q6.m87173q(false);
                        z36 = false;
                    } else {
                        c28655q6.m87150e0(469396343);
                        if ((i18 & 112) == 32) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        objM87133R6 = c28655q6.m87133R();
                        if (z35) {
                            objM87133R6 = new C3586e(function1, 1);
                            c28655q6.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C3586e(function1, 1);
                            c28655q6.m87172p0(objM87133R6);
                        }
                        z36 = false;
                        m10835f1(c12344nM34454m, (Function1) objM87133R6, c28655q6, TextResource.$stable | C9598e.f28134d, 0);
                        c28655q6.m87173q(false);
                    }
                    c28655q6.m87173q(true);
                    strM34443b = c12341k2.getIsSuccess().getAutosaveInstructionText();
                    if (strM34443b == null) {
                        c28655q6.m87150e0(-220233406);
                        c28655q6.m87173q(z36);
                        c28655q7 = c28655q6;
                    } else {
                        c28655q6.m87150e0(-220233405);
                        float f15 = 2 * f13;
                        AbstractC22953f.m66715b(c28655q6, AbstractC1102d.m3419p(f15, c2314t4));
                        C38072d c38072d4 = C38072d.f163053a;
                        int i211 = C38072d.f163054b;
                        C28655q c28655q117 = c28655q6;
                        AbstractC30795n.m94707h(strM34443b, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t4), f15, 0.0f, 2), c38072d4.m121949b(c28655q6, i211).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q6, i211).getB1(), null, c28655q117, 48, C2886a.f11498d << 18, 196088);
                        C28655q c28655q118 = c28655q117;
                        c28655q118.m87173q(false);
                        c28655q7 = c28655q118;
                    }
                    if (c12341k2.getIsSuccess().getDefaultAnswersToggleInfo().getShouldShowDefaultAnswersToggle()) {
                        c28655q7.m87150e0(-219738242);
                        AbstractC22953f.m66715b(c28655q7, AbstractC1102d.m3419p(1 * f13, c2314t4));
                        function5 = function3;
                        interfaceC4339a2 = interfaceC4339a;
                        m10738B0(c12341k2.getIsSuccess().getDefaultAnswersToggleInfo(), function5, interfaceC4339a2, c28655q7, (i18 >> 12) & MessageListItemViewType.GIPHY);
                        z37 = false;
                        c28655q7.m87173q(false);
                    } else {
                        function5 = function3;
                        interfaceC4339a2 = interfaceC4339a;
                        z37 = false;
                        c28655q7.m87150e0(-219430722);
                        c28655q7.m87173q(false);
                    }
                    c28655q7.m87173q(z37);
                    c28655q8 = c28655q7;
                } else {
                    c28655q6.m87150e0(-220551062);
                    C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9108K, c28655q6, 48);
                    iHashCode5 = Long.hashCode(c28655q6.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q6.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q6, c2314t4);
                    c28655q6.m87158i0();
                    if (c28655q6.f115903S) {
                        c28655q6.m87163l(c0213j);
                    } else {
                        c28655q6.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q6, c0209i, c22994r1M66759a5);
                    AbstractC28683x.m87239G(c28655q6, c0209i2, interfaceC28653p1M87165m13);
                    if (c28655q6.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q6, iHashCode5, c0209i5);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, c28655q6, iHashCode5, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q6, c0209i4, modifierM118962N13);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    c12341k2 = c12341k;
                    m10769L0(c12341k2, new LayoutWeightElement(1.0f, true), c28655q6, i18 & 14, 0);
                    c12344nM34454m = c12341k2.getIsSuccess().getNavigationButton();
                    if (c12344nM34454m == null) {
                        c28655q6.m87150e0(469396342);
                        c28655q6.m87173q(false);
                        z36 = false;
                    } else {
                        c28655q6.m87150e0(469396343);
                        if ((i18 & 112) == 32) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        objM87133R6 = c28655q6.m87133R();
                        if (z35) {
                            objM87133R6 = new C3586e(function1, 1);
                            c28655q6.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C3586e(function1, 1);
                            c28655q6.m87172p0(objM87133R6);
                        }
                        z36 = false;
                        m10835f1(c12344nM34454m, (Function1) objM87133R6, c28655q6, TextResource.$stable | C9598e.f28134d, 0);
                        c28655q6.m87173q(false);
                    }
                    c28655q6.m87173q(true);
                    strM34443b = c12341k2.getIsSuccess().getAutosaveInstructionText();
                    if (strM34443b == null) {
                        c28655q6.m87150e0(-220233406);
                        c28655q6.m87173q(z36);
                        c28655q7 = c28655q6;
                    } else {
                        c28655q6.m87150e0(-220233405);
                        float f16 = 2 * f13;
                        AbstractC22953f.m66715b(c28655q6, AbstractC1102d.m3419p(f16, c2314t4));
                        C38072d c38072d5 = C38072d.f163053a;
                        int i212 = C38072d.f163054b;
                        C28655q c28655q119 = c28655q6;
                        AbstractC30795n.m94707h(strM34443b, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t4), f16, 0.0f, 2), c38072d5.m121949b(c28655q6, i212).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d5.m121952e(c28655q6, i212).getB1(), null, c28655q119, 48, C2886a.f11498d << 18, 196088);
                        C28655q c28655q1110 = c28655q119;
                        c28655q1110.m87173q(false);
                        c28655q7 = c28655q1110;
                    }
                    if (c12341k2.getIsSuccess().getDefaultAnswersToggleInfo().getShouldShowDefaultAnswersToggle()) {
                        c28655q7.m87150e0(-219738242);
                        AbstractC22953f.m66715b(c28655q7, AbstractC1102d.m3419p(1 * f13, c2314t4));
                        function5 = function3;
                        interfaceC4339a2 = interfaceC4339a;
                        m10738B0(c12341k2.getIsSuccess().getDefaultAnswersToggleInfo(), function5, interfaceC4339a2, c28655q7, (i18 >> 12) & MessageListItemViewType.GIPHY);
                        z37 = false;
                        c28655q7.m87173q(false);
                    } else {
                        function5 = function3;
                        interfaceC4339a2 = interfaceC4339a;
                        z37 = false;
                        c28655q7.m87150e0(-219430722);
                        c28655q7.m87173q(false);
                    }
                    c28655q7.m87173q(z37);
                    c28655q8 = c28655q7;
                }
                interfaceC4351m3 = interfaceC4351m5;
                function6 = function8;
                c28655q = c28655q8;
            } else {
                C28655q c28655q120 = c28655q9;
                function5 = function3;
                c12341k2 = c12341k;
                c28655q120.m87138X();
                interfaceC4351m3 = interfaceC4351m2;
                function6 = function4;
                c28655q = c28655q120;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2931g(c12341k2, function1, interfaceC4351m3, function6, interfaceC4353o, function5, interfaceC4339a2, i13, i14);
            }
        }
        i15 |= 384;
        interfaceC4351m2 = interfaceC4351m;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                function4 = function2;
                if (c28655q9.m87157i(function4)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q9.m87157i(interfaceC4353o)) {
                    i26 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i26 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i26;
            }
            if ((196608 & i13) == 0) {
                if (c28655q9.m87157i(function3)) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i25;
            }
            if ((1572864 & i13) == 0) {
                if (c28655q9.m87157i(interfaceC4339a2)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i15 |= i24;
            }
            if ((599187 & i15) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q9.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i27 != 0) {
                    objM87133R8 = c28655q9.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C26047n(25);
                        c28655q9.m87172p0(objM87133R8);
                    }
                    interfaceC4351m4 = (InterfaceC4351m) objM87133R8;
                } else {
                    interfaceC4351m4 = interfaceC4351m2;
                }
                if (i16 != 0) {
                    objM87133R7 = c28655q9.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C3595n(2);
                        c28655q9.m87172p0(objM87133R7);
                    }
                    function7 = (Function1) objM87133R7;
                } else {
                    function7 = function4;
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM3427x3 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t), null, 3);
                c2307m = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode = Long.hashCode(c28655q9.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q9.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q9, modifierM3427x3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q9.m87158i0();
                interfaceC4351m5 = interfaceC4351m4;
                if (c28655q9.f115903S) {
                    c28655q9.m87163l(c0213j);
                } else {
                    c28655q9.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q9, c0209i, interfaceC39127r0M66763d9);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q9, c0209i2, interfaceC28653p1M87165m14);
                c0209i3 = C0217k.f732j;
                if (c28655q9.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q9, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q9, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q9, c0209i4, modifierM118962N14);
                c12337gM34447f = c12341k.getIsSuccess().getDateSelectorState();
                c1100b = C1100b.f4583a;
                if (c12337gM34447f == null) {
                    c28655q9.m87150e0(284646928);
                    c28655q9.m87173q(false);
                    i18 = i15;
                    z18 = false;
                    function8 = function7;
                    c2314t3 = c2314t;
                    c0209i5 = c0209i3;
                    c28655q2 = c28655q9;
                    z19 = true;
                } else {
                    c28655q9.m87150e0(284646929);
                    Modifier modifierM3409f3 = AbstractC1102d.m3409f(0.4f, c1100b.mo3400a(AbstractC1099a.m3396r(c2314t, 0.0f, 8 * 2, 1), C2299e.f9102E));
                    if (c12337gM34447f.getIsLoading()) {
                        c28655q9.m87150e0(162697315);
                        if ((i15 & 7168) == 2048) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        objM87133R2 = c28655q9.m87133R();
                        if (z24) {
                            objM87133R2 = new C3599r(function7, 2);
                            c28655q9.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C3599r(function7, 2);
                            c28655q9.m87172p0(objM87133R2);
                        }
                        modifierM3362g = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                        c2314t2 = c2314t;
                        z13 = false;
                        c28655q9.m87173q(false);
                    } else {
                        c2314t2 = c2314t;
                        z13 = false;
                        c28655q9.m87150e0(162819610);
                        c28655q9.m87173q(false);
                        modifierM3362g = c2314t2;
                    }
                    Modifier modifierMo3471e3 = modifierM3409f3.mo3471e(modifierM3362g);
                    Function1 function12 = function7;
                    InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(c2307m, z13);
                    i18 = i15;
                    iHashCode2 = Long.hashCode(c28655q9.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q9.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q9, modifierMo3471e3);
                    c28655q9.m87158i0();
                    if (c28655q9.f115903S) {
                        c28655q9.m87163l(c0213j);
                    } else {
                        c28655q9.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q9, c0209i, interfaceC39127r0M66763d10);
                    AbstractC28683x.m87239G(c28655q9, c0209i2, interfaceC28653p1M87165m15);
                    if (c28655q9.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q9, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q9, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q9, c0209i4, modifierM118962N15);
                    Modifier modifierM44101d7 = AbstractC15676d.m44101d(c2314t2, "JournalDateSelector");
                    boolean zM34475i3 = c12337gM34447f.getIsLoading();
                    C22961h c22961h3 = AbstractC22977m.f90655f;
                    C2314t c2314t9 = c2314t2;
                    TextResource textResourceM34474h3 = c12337gM34447f.getText();
                    if (c12337gM34447f.getBackButtonEnabled()) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    if (c12337gM34447f.getForwardButtonEnabled()) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    String strM34469c3 = c12337gM34447f.getBackDate();
                    String strM34473g3 = c12337gM34447f.getForwardDate();
                    boolean zM87157i3 = c28655q9.m87157i(c12337gM34447f);
                    if ((i18 & 57344) == 16384) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = zM87157i3 | z16;
                    objM87133R = c28655q9.m87133R();
                    if (z17) {
                        objM87133R = new C3169c(5, c12337gM34447f, interfaceC4353o);
                        c28655q9.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C3169c(5, c12337gM34447f, interfaceC4353o);
                        c28655q9.m87172p0(objM87133R);
                    }
                    function8 = function12;
                    c2314t3 = c2314t9;
                    z18 = false;
                    c0209i5 = c0209i3;
                    z19 = true;
                    AbstractC17862e.m51358q(modifierM44101d7, zM34475i3, c22961h3, textResourceM34474h3, z14, z15, strM34469c3, strM34473g3, null, null, null, null, (Function1) objM87133R, c28655q9, (TextResource.$stable << 9) | 384, 0, 3840);
                    C28655q c28655q1111 = c28655q9;
                    c28655q1111.m87173q(true);
                    c28655q1111.m87173q(false);
                    c28655q2 = c28655q1111;
                }
                abstractC12336fM34453l = c12341k.getIsSuccess().getJournalDatePillViewState();
                if (abstractC12336fM34453l == null) {
                    c28655q2.m87150e0(286188744);
                    c28655q2.m87173q(z18);
                    z25 = z19;
                    r10 = z18;
                    c3 = 18;
                    c2314t4 = c2314t3;
                    c28676v1 = c28676v0;
                    c28655q4 = c28655q2;
                } else {
                    c28655q2.m87150e0(286188745);
                    if (abstractC12336fM34453l instanceof AbstractC12336f.c) {
                        cVar = (AbstractC12336f.c) abstractC12336fM34453l;
                        if (cVar.getTodayCta() != null) {
                            c28655q2.m87150e0(-2139006474);
                            C2314t c2314t10 = c2314t3;
                            C38072d c38072d6 = C38072d.f163053a;
                            int i213 = C38072d.f163054b;
                            Modifier modifierM44455h3 = AbstractC15751g.m44455h(AbstractC37056f.m118994r(c1100b.mo3400a(AbstractC1099a.m3398t(c2314t10, 0.0f, 0.0f, 18, 0.0f, 11), C2299e.f9103F), AbstractC33253j.m105486b(40)), (float) 1.5d, c38072d6.m121949b(c28655q2, i213).getWhite20(), AbstractC33253j.m105486b(40));
                            if ((i18 & 57344) == 16384) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            zM87153g = z27 | c28655q2.m87153g(abstractC12336fM34453l);
                            objM87133R3 = c28655q2.m87133R();
                            if (zM87153g) {
                                c28676v1 = c28676v0;
                                if (objM87133R3 == c28676v1) {
                                }
                                Modifier modifierM44101d8 = AbstractC15676d.m44101d(AbstractC1099a.m3395q(AbstractC1092a.m3362g(modifierM44455h3, false, null, null, (InterfaceC4339a) objM87133R3, 15), 10, 6), "Journal_DatePicker_TodayButton");
                                InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(c2307m, false);
                                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q2.m87165m();
                                Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q2, modifierM44101d8);
                                c28655q2.m87158i0();
                                if (c28655q2.f115903S) {
                                    c28655q2.m87163l(c0213j);
                                } else {
                                    c28655q2.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d11);
                                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m16);
                                if (c28655q2.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
                                }
                                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N16);
                                c2314t4 = c2314t10;
                                C28655q c28655q1112 = c28655q2;
                                c3 = 18;
                                AbstractC30795n.m94707h(cVar.getTodayCta().getText(), null, C17919x.f69629f, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d6.m121952e(c28655q2, i213).getH5(), null, c28655q1112, 384, C2886a.f11498d << 18, 196602);
                                C28655q c28655q1113 = c28655q1112;
                                z25 = true;
                                c28655q1113.m87173q(true);
                                z26 = false;
                                c28655q1113.m87173q(false);
                                c28655q3 = c28655q1113;
                            } else {
                                c28676v1 = c28676v0;
                            }
                            objM87133R3 = new C17820i(28, interfaceC4353o, abstractC12336fM34453l);
                            c28655q2.m87172p0(objM87133R3);
                            Modifier modifierM44101d9 = AbstractC15676d.m44101d(AbstractC1099a.m3395q(AbstractC1092a.m3362g(modifierM44455h3, false, null, null, (InterfaceC4339a) objM87133R3, 15), 10, 6), "Journal_DatePicker_TodayButton");
                            InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(c2307m, false);
                            iHashCode3 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q2.m87165m();
                            Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q2, modifierM44101d9);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d12);
                            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m17);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N17);
                            c2314t4 = c2314t10;
                            C28655q c28655q1114 = c28655q2;
                            c3 = 18;
                            AbstractC30795n.m94707h(cVar.getTodayCta().getText(), null, C17919x.f69629f, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d6.m121952e(c28655q2, i213).getH5(), null, c28655q1114, 384, C2886a.f11498d << 18, 196602);
                            C28655q c28655q1115 = c28655q1114;
                            z25 = true;
                            c28655q1115.m87173q(true);
                            z26 = false;
                            c28655q1115.m87173q(false);
                            c28655q3 = c28655q1115;
                        } else {
                            z25 = z19;
                            boolean z312 = z18;
                            c3 = 18;
                            c2314t4 = c2314t3;
                            c28676v1 = c28676v0;
                            c28655q2.m87150e0(-2138052201);
                            c28655q2.m87173q(z312);
                            c28655q3 = c28655q2;
                            z26 = z312;
                        }
                    } else {
                        z25 = z19;
                        boolean z313 = z18;
                        c3 = 18;
                        c2314t4 = c2314t3;
                        c28676v1 = c28676v0;
                        c28655q2.m87150e0(-2138052201);
                        c28655q2.m87173q(z313);
                        c28655q3 = c28655q2;
                        z26 = z313;
                    }
                    c28655q3.m87173q(z26);
                    c28655q4 = c28655q3;
                    r10 = z26;
                }
                c28655q4.m87173q(z25);
                c22949e = AbstractC22977m.f90650a;
                C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(c22949e, C2299e.f9107J, c28655q4, r10);
                iHashCode4 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q4.m87165m();
                Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q4, c2314t4);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a6);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m18);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N18);
                abstractC12336fM34453l2 = c12341k.getIsSuccess().getJournalDatePillViewState();
                if (abstractC12336fM34453l2 == null) {
                    c28655q4.m87150e0(1797254041);
                    c28655q4.m87173q(false);
                    c22949e2 = c22949e;
                    c28655q6 = c28655q4;
                } else {
                    c28655q4.m87150e0(1797254042);
                    if (abstractC12336fM34453l2.equals(AbstractC12336f.a.f41453a)) {
                        c28655q4.m87150e0(763465134);
                        c28655q4.m87173q(false);
                    } else {
                        if (abstractC12336fM34453l2.equals(AbstractC12336f.b.f41454a)) {
                            c28655q4.m87150e0(763521678);
                            c28655q4.m87173q(false);
                        } else {
                            if (abstractC12336fM34453l2 instanceof AbstractC12336f.c) {
                                throw AbstractC11895b.m32003v(578815926, c28655q4, false);
                            }
                            c28655q4.m87150e0(763598031);
                            AbstractC12336f.c cVar4 = (AbstractC12336f.c) abstractC12336fM34453l2;
                            List<C16613h> listM34463a3 = cVar4.m34463a();
                            i19 = i18;
                            if ((i19 & 896) == 256) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                            objM87133R4 = c28655q4.m87133R();
                            if (z28) {
                                interfaceC4351m6 = interfaceC4351m5;
                                objM87133R4 = new C3600s(0, interfaceC4351m6);
                                c28655q4.m87172p0(objM87133R4);
                            } else {
                                interfaceC4351m6 = interfaceC4351m5;
                                objM87133R4 = new C3600s(0, interfaceC4351m6);
                                c28655q4.m87172p0(objM87133R4);
                            }
                            InterfaceC4351m interfaceC4351m9 = (InterfaceC4351m) objM87133R4;
                            interfaceC4351m5 = interfaceC4351m6;
                            if ((i19 & 7168) == 2048) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            objM87133R5 = c28655q4.m87133R();
                            if (z29) {
                                function9 = function8;
                                objM87133R5 = new C3599r(function9, 3);
                                c28655q4.m87172p0(objM87133R5);
                            } else {
                                function9 = function8;
                                objM87133R5 = new C3599r(function9, 3);
                                c28655q4.m87172p0(objM87133R5);
                            }
                            C28655q c28655q1116 = c28655q4;
                            function8 = function9;
                            i18 = i19;
                            c22949e2 = c22949e;
                            AbstractC16611f.m47150h(null, listM34463a3, interfaceC4351m9, null, (InterfaceC4339a) objM87133R5, r12.getLeftCalendarDisplayIcon(), cVar4.getRightCalendarDisplayIcon(), "Journal_DatePicker_DayPill", c28655q1116, 12582912, 9);
                            C28655q c28655q1117 = c28655q1116;
                            z34 = false;
                            c28655q1117.m87173q(false);
                            c28655q5 = c28655q1117;
                        }
                        c28655q5.m87173q(z34);
                        c28655q6 = c28655q5;
                    }
                    c22949e2 = c22949e;
                    z34 = false;
                    c28655q5 = c28655q4;
                    c28655q5.m87173q(z34);
                    c28655q6 = c28655q5;
                }
                c28655q6.m87173q(true);
                f13 = 8;
                AbstractC22953f.m66715b(c28655q6, AbstractC1102d.m3419p(3 * f13, c2314t4));
                c12337gM34447f2 = c12341k.getIsSuccess().getDateSelectorState();
                if (c12337gM34447f2 == null) {
                    c28655q6.m87150e0(-220551062);
                    C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9108K, c28655q6, 48);
                    iHashCode5 = Long.hashCode(c28655q6.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q6.m87165m();
                    Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q6, c2314t4);
                    c28655q6.m87158i0();
                    if (c28655q6.f115903S) {
                        c28655q6.m87163l(c0213j);
                    } else {
                        c28655q6.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q6, c0209i, c22994r1M66759a7);
                    AbstractC28683x.m87239G(c28655q6, c0209i2, interfaceC28653p1M87165m19);
                    if (c28655q6.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q6, iHashCode5, c0209i5);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, c28655q6, iHashCode5, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q6, c0209i4, modifierM118962N19);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    c12341k2 = c12341k;
                    m10769L0(c12341k2, new LayoutWeightElement(1.0f, true), c28655q6, i18 & 14, 0);
                    c12344nM34454m = c12341k2.getIsSuccess().getNavigationButton();
                    if (c12344nM34454m == null) {
                        c28655q6.m87150e0(469396342);
                        c28655q6.m87173q(false);
                        z36 = false;
                    } else {
                        c28655q6.m87150e0(469396343);
                        if ((i18 & 112) == 32) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        objM87133R6 = c28655q6.m87133R();
                        if (z35) {
                            objM87133R6 = new C3586e(function1, 1);
                            c28655q6.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C3586e(function1, 1);
                            c28655q6.m87172p0(objM87133R6);
                        }
                        z36 = false;
                        m10835f1(c12344nM34454m, (Function1) objM87133R6, c28655q6, TextResource.$stable | C9598e.f28134d, 0);
                        c28655q6.m87173q(false);
                    }
                    c28655q6.m87173q(true);
                    strM34443b = c12341k2.getIsSuccess().getAutosaveInstructionText();
                    if (strM34443b == null) {
                        c28655q6.m87150e0(-220233406);
                        c28655q6.m87173q(z36);
                        c28655q7 = c28655q6;
                    } else {
                        c28655q6.m87150e0(-220233405);
                        float f17 = 2 * f13;
                        AbstractC22953f.m66715b(c28655q6, AbstractC1102d.m3419p(f17, c2314t4));
                        C38072d c38072d7 = C38072d.f163053a;
                        int i214 = C38072d.f163054b;
                        C28655q c28655q1118 = c28655q6;
                        AbstractC30795n.m94707h(strM34443b, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t4), f17, 0.0f, 2), c38072d7.m121949b(c28655q6, i214).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d7.m121952e(c28655q6, i214).getB1(), null, c28655q1118, 48, C2886a.f11498d << 18, 196088);
                        C28655q c28655q1119 = c28655q1118;
                        c28655q1119.m87173q(false);
                        c28655q7 = c28655q1119;
                    }
                    if (c12341k2.getIsSuccess().getDefaultAnswersToggleInfo().getShouldShowDefaultAnswersToggle()) {
                        c28655q7.m87150e0(-219738242);
                        AbstractC22953f.m66715b(c28655q7, AbstractC1102d.m3419p(1 * f13, c2314t4));
                        function5 = function3;
                        interfaceC4339a2 = interfaceC4339a;
                        m10738B0(c12341k2.getIsSuccess().getDefaultAnswersToggleInfo(), function5, interfaceC4339a2, c28655q7, (i18 >> 12) & MessageListItemViewType.GIPHY);
                        z37 = false;
                        c28655q7.m87173q(false);
                    } else {
                        function5 = function3;
                        interfaceC4339a2 = interfaceC4339a;
                        z37 = false;
                        c28655q7.m87150e0(-219430722);
                        c28655q7.m87173q(false);
                    }
                    c28655q7.m87173q(z37);
                    c28655q8 = c28655q7;
                } else {
                    c28655q6.m87150e0(-220551062);
                    C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9108K, c28655q6, 48);
                    iHashCode5 = Long.hashCode(c28655q6.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q6.m87165m();
                    Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q6, c2314t4);
                    c28655q6.m87158i0();
                    if (c28655q6.f115903S) {
                        c28655q6.m87163l(c0213j);
                    } else {
                        c28655q6.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q6, c0209i, c22994r1M66759a8);
                    AbstractC28683x.m87239G(c28655q6, c0209i2, interfaceC28653p1M87165m110);
                    if (c28655q6.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q6, iHashCode5, c0209i5);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, c28655q6, iHashCode5, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q6, c0209i4, modifierM118962N110);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    c12341k2 = c12341k;
                    m10769L0(c12341k2, new LayoutWeightElement(1.0f, true), c28655q6, i18 & 14, 0);
                    c12344nM34454m = c12341k2.getIsSuccess().getNavigationButton();
                    if (c12344nM34454m == null) {
                        c28655q6.m87150e0(469396342);
                        c28655q6.m87173q(false);
                        z36 = false;
                    } else {
                        c28655q6.m87150e0(469396343);
                        if ((i18 & 112) == 32) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        objM87133R6 = c28655q6.m87133R();
                        if (z35) {
                            objM87133R6 = new C3586e(function1, 1);
                            c28655q6.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C3586e(function1, 1);
                            c28655q6.m87172p0(objM87133R6);
                        }
                        z36 = false;
                        m10835f1(c12344nM34454m, (Function1) objM87133R6, c28655q6, TextResource.$stable | C9598e.f28134d, 0);
                        c28655q6.m87173q(false);
                    }
                    c28655q6.m87173q(true);
                    strM34443b = c12341k2.getIsSuccess().getAutosaveInstructionText();
                    if (strM34443b == null) {
                        c28655q6.m87150e0(-220233406);
                        c28655q6.m87173q(z36);
                        c28655q7 = c28655q6;
                    } else {
                        c28655q6.m87150e0(-220233405);
                        float f18 = 2 * f13;
                        AbstractC22953f.m66715b(c28655q6, AbstractC1102d.m3419p(f18, c2314t4));
                        C38072d c38072d8 = C38072d.f163053a;
                        int i215 = C38072d.f163054b;
                        C28655q c28655q11110 = c28655q6;
                        AbstractC30795n.m94707h(strM34443b, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t4), f18, 0.0f, 2), c38072d8.m121949b(c28655q6, i215).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d8.m121952e(c28655q6, i215).getB1(), null, c28655q11110, 48, C2886a.f11498d << 18, 196088);
                        C28655q c28655q11111 = c28655q11110;
                        c28655q11111.m87173q(false);
                        c28655q7 = c28655q11111;
                    }
                    if (c12341k2.getIsSuccess().getDefaultAnswersToggleInfo().getShouldShowDefaultAnswersToggle()) {
                        c28655q7.m87150e0(-219738242);
                        AbstractC22953f.m66715b(c28655q7, AbstractC1102d.m3419p(1 * f13, c2314t4));
                        function5 = function3;
                        interfaceC4339a2 = interfaceC4339a;
                        m10738B0(c12341k2.getIsSuccess().getDefaultAnswersToggleInfo(), function5, interfaceC4339a2, c28655q7, (i18 >> 12) & MessageListItemViewType.GIPHY);
                        z37 = false;
                        c28655q7.m87173q(false);
                    } else {
                        function5 = function3;
                        interfaceC4339a2 = interfaceC4339a;
                        z37 = false;
                        c28655q7.m87150e0(-219430722);
                        c28655q7.m87173q(false);
                    }
                    c28655q7.m87173q(z37);
                    c28655q8 = c28655q7;
                }
                interfaceC4351m3 = interfaceC4351m5;
                function6 = function8;
                c28655q = c28655q8;
            } else {
                C28655q c28655q121 = c28655q9;
                function5 = function3;
                c12341k2 = c12341k;
                c28655q121.m87138X();
                interfaceC4351m3 = interfaceC4351m2;
                function6 = function4;
                c28655q = c28655q121;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2931g(c12341k2, function1, interfaceC4351m3, function6, interfaceC4353o, function5, interfaceC4339a2, i13, i14);
            }
        }
        i15 |= 3072;
        function4 = function2;
        if ((i13 & 24576) == 0) {
            if (c28655q9.m87157i(interfaceC4353o)) {
                i26 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i26 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i26;
        }
        if ((196608 & i13) == 0) {
            if (c28655q9.m87157i(function3)) {
                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i25;
        }
        if ((1572864 & i13) == 0) {
            if (c28655q9.m87157i(interfaceC4339a2)) {
                i24 = 1048576;
            } else {
                i24 = 524288;
            }
            i15 |= i24;
        }
        if ((599187 & i15) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q9.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i27 != 0) {
                objM87133R8 = c28655q9.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = new C26047n(25);
                    c28655q9.m87172p0(objM87133R8);
                }
                interfaceC4351m4 = (InterfaceC4351m) objM87133R8;
            } else {
                interfaceC4351m4 = interfaceC4351m2;
            }
            if (i16 != 0) {
                objM87133R7 = c28655q9.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C3595n(2);
                    c28655q9.m87172p0(objM87133R7);
                }
                function7 = (Function1) objM87133R7;
            } else {
                function7 = function4;
            }
            c2314t = C2314t.f9131w;
            Modifier modifierM3427x4 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t), null, 3);
            c2307m = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d13 = AbstractC22989q.m66763d(c2307m, false);
            iHashCode = Long.hashCode(c28655q9.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q9.m87165m();
            Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q9, modifierM3427x4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q9.m87158i0();
            interfaceC4351m5 = interfaceC4351m4;
            if (c28655q9.f115903S) {
                c28655q9.m87163l(c0213j);
            } else {
                c28655q9.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q9, c0209i, interfaceC39127r0M66763d13);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q9, c0209i2, interfaceC28653p1M87165m111);
            c0209i3 = C0217k.f732j;
            if (c28655q9.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q9, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q9, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q9, c0209i4, modifierM118962N111);
            c12337gM34447f = c12341k.getIsSuccess().getDateSelectorState();
            c1100b = C1100b.f4583a;
            if (c12337gM34447f == null) {
                c28655q9.m87150e0(284646928);
                c28655q9.m87173q(false);
                i18 = i15;
                z18 = false;
                function8 = function7;
                c2314t3 = c2314t;
                c0209i5 = c0209i3;
                c28655q2 = c28655q9;
                z19 = true;
            } else {
                c28655q9.m87150e0(284646929);
                Modifier modifierM3409f4 = AbstractC1102d.m3409f(0.4f, c1100b.mo3400a(AbstractC1099a.m3396r(c2314t, 0.0f, 8 * 2, 1), C2299e.f9102E));
                if (c12337gM34447f.getIsLoading()) {
                    c28655q9.m87150e0(162697315);
                    if ((i15 & 7168) == 2048) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objM87133R2 = c28655q9.m87133R();
                    if (z24) {
                        objM87133R2 = new C3599r(function7, 2);
                        c28655q9.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C3599r(function7, 2);
                        c28655q9.m87172p0(objM87133R2);
                    }
                    modifierM3362g = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                    c2314t2 = c2314t;
                    z13 = false;
                    c28655q9.m87173q(false);
                } else {
                    c2314t2 = c2314t;
                    z13 = false;
                    c28655q9.m87150e0(162819610);
                    c28655q9.m87173q(false);
                    modifierM3362g = c2314t2;
                }
                Modifier modifierMo3471e4 = modifierM3409f4.mo3471e(modifierM3362g);
                Function1 function13 = function7;
                InterfaceC39127r0 interfaceC39127r0M66763d14 = AbstractC22989q.m66763d(c2307m, z13);
                i18 = i15;
                iHashCode2 = Long.hashCode(c28655q9.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q9.m87165m();
                Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q9, modifierMo3471e4);
                c28655q9.m87158i0();
                if (c28655q9.f115903S) {
                    c28655q9.m87163l(c0213j);
                } else {
                    c28655q9.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q9, c0209i, interfaceC39127r0M66763d14);
                AbstractC28683x.m87239G(c28655q9, c0209i2, interfaceC28653p1M87165m112);
                if (c28655q9.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q9, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q9, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q9, c0209i4, modifierM118962N112);
                Modifier modifierM44101d10 = AbstractC15676d.m44101d(c2314t2, "JournalDateSelector");
                boolean zM34475i4 = c12337gM34447f.getIsLoading();
                C22961h c22961h4 = AbstractC22977m.f90655f;
                C2314t c2314t11 = c2314t2;
                TextResource textResourceM34474h4 = c12337gM34447f.getText();
                if (c12337gM34447f.getBackButtonEnabled()) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                if (c12337gM34447f.getForwardButtonEnabled()) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                String strM34469c4 = c12337gM34447f.getBackDate();
                String strM34473g4 = c12337gM34447f.getForwardDate();
                boolean zM87157i4 = c28655q9.m87157i(c12337gM34447f);
                if ((i18 & 57344) == 16384) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = zM87157i4 | z16;
                objM87133R = c28655q9.m87133R();
                if (z17) {
                    objM87133R = new C3169c(5, c12337gM34447f, interfaceC4353o);
                    c28655q9.m87172p0(objM87133R);
                } else {
                    objM87133R = new C3169c(5, c12337gM34447f, interfaceC4353o);
                    c28655q9.m87172p0(objM87133R);
                }
                function8 = function13;
                c2314t3 = c2314t11;
                z18 = false;
                c0209i5 = c0209i3;
                z19 = true;
                AbstractC17862e.m51358q(modifierM44101d10, zM34475i4, c22961h4, textResourceM34474h4, z14, z15, strM34469c4, strM34473g4, null, null, null, null, (Function1) objM87133R, c28655q9, (TextResource.$stable << 9) | 384, 0, 3840);
                C28655q c28655q11112 = c28655q9;
                c28655q11112.m87173q(true);
                c28655q11112.m87173q(false);
                c28655q2 = c28655q11112;
            }
            abstractC12336fM34453l = c12341k.getIsSuccess().getJournalDatePillViewState();
            if (abstractC12336fM34453l == null) {
                c28655q2.m87150e0(286188744);
                c28655q2.m87173q(z18);
                z25 = z19;
                r10 = z18;
                c3 = 18;
                c2314t4 = c2314t3;
                c28676v1 = c28676v0;
                c28655q4 = c28655q2;
            } else {
                c28655q2.m87150e0(286188745);
                if (abstractC12336fM34453l instanceof AbstractC12336f.c) {
                    cVar = (AbstractC12336f.c) abstractC12336fM34453l;
                    if (cVar.getTodayCta() != null) {
                        c28655q2.m87150e0(-2139006474);
                        C2314t c2314t12 = c2314t3;
                        C38072d c38072d9 = C38072d.f163053a;
                        int i216 = C38072d.f163054b;
                        Modifier modifierM44455h4 = AbstractC15751g.m44455h(AbstractC37056f.m118994r(c1100b.mo3400a(AbstractC1099a.m3398t(c2314t12, 0.0f, 0.0f, 18, 0.0f, 11), C2299e.f9103F), AbstractC33253j.m105486b(40)), (float) 1.5d, c38072d9.m121949b(c28655q2, i216).getWhite20(), AbstractC33253j.m105486b(40));
                        if ((i18 & 57344) == 16384) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        zM87153g = z27 | c28655q2.m87153g(abstractC12336fM34453l);
                        objM87133R3 = c28655q2.m87133R();
                        if (zM87153g) {
                            c28676v1 = c28676v0;
                            if (objM87133R3 == c28676v1) {
                            }
                            Modifier modifierM44101d11 = AbstractC15676d.m44101d(AbstractC1099a.m3395q(AbstractC1092a.m3362g(modifierM44455h4, false, null, null, (InterfaceC4339a) objM87133R3, 15), 10, 6), "Journal_DatePicker_TodayButton");
                            InterfaceC39127r0 interfaceC39127r0M66763d15 = AbstractC22989q.m66763d(c2307m, false);
                            iHashCode3 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q2.m87165m();
                            Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q2, modifierM44101d11);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d15);
                            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m113);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N113);
                            c2314t4 = c2314t12;
                            C28655q c28655q11113 = c28655q2;
                            c3 = 18;
                            AbstractC30795n.m94707h(cVar.getTodayCta().getText(), null, C17919x.f69629f, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d9.m121952e(c28655q2, i216).getH5(), null, c28655q11113, 384, C2886a.f11498d << 18, 196602);
                            C28655q c28655q11114 = c28655q11113;
                            z25 = true;
                            c28655q11114.m87173q(true);
                            z26 = false;
                            c28655q11114.m87173q(false);
                            c28655q3 = c28655q11114;
                        } else {
                            c28676v1 = c28676v0;
                        }
                        objM87133R3 = new C17820i(28, interfaceC4353o, abstractC12336fM34453l);
                        c28655q2.m87172p0(objM87133R3);
                        Modifier modifierM44101d12 = AbstractC15676d.m44101d(AbstractC1099a.m3395q(AbstractC1092a.m3362g(modifierM44455h4, false, null, null, (InterfaceC4339a) objM87133R3, 15), 10, 6), "Journal_DatePicker_TodayButton");
                        InterfaceC39127r0 interfaceC39127r0M66763d16 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q2.m87165m();
                        Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q2, modifierM44101d12);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d16);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m114);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N114);
                        c2314t4 = c2314t12;
                        C28655q c28655q11115 = c28655q2;
                        c3 = 18;
                        AbstractC30795n.m94707h(cVar.getTodayCta().getText(), null, C17919x.f69629f, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d9.m121952e(c28655q2, i216).getH5(), null, c28655q11115, 384, C2886a.f11498d << 18, 196602);
                        C28655q c28655q11116 = c28655q11115;
                        z25 = true;
                        c28655q11116.m87173q(true);
                        z26 = false;
                        c28655q11116.m87173q(false);
                        c28655q3 = c28655q11116;
                    } else {
                        z25 = z19;
                        boolean z314 = z18;
                        c3 = 18;
                        c2314t4 = c2314t3;
                        c28676v1 = c28676v0;
                        c28655q2.m87150e0(-2138052201);
                        c28655q2.m87173q(z314);
                        c28655q3 = c28655q2;
                        z26 = z314;
                    }
                } else {
                    z25 = z19;
                    boolean z315 = z18;
                    c3 = 18;
                    c2314t4 = c2314t3;
                    c28676v1 = c28676v0;
                    c28655q2.m87150e0(-2138052201);
                    c28655q2.m87173q(z315);
                    c28655q3 = c28655q2;
                    z26 = z315;
                }
                c28655q3.m87173q(z26);
                c28655q4 = c28655q3;
                r10 = z26;
            }
            c28655q4.m87173q(z25);
            c22949e = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(c22949e, C2299e.f9107J, c28655q4, r10);
            iHashCode4 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q4.m87165m();
            Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q4, c2314t4);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a9);
            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m115);
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i5);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N115);
            abstractC12336fM34453l2 = c12341k.getIsSuccess().getJournalDatePillViewState();
            if (abstractC12336fM34453l2 == null) {
                c28655q4.m87150e0(1797254041);
                c28655q4.m87173q(false);
                c22949e2 = c22949e;
                c28655q6 = c28655q4;
            } else {
                c28655q4.m87150e0(1797254042);
                if (abstractC12336fM34453l2.equals(AbstractC12336f.a.f41453a)) {
                    c28655q4.m87150e0(763465134);
                    c28655q4.m87173q(false);
                } else {
                    if (abstractC12336fM34453l2.equals(AbstractC12336f.b.f41454a)) {
                        c28655q4.m87150e0(763521678);
                        c28655q4.m87173q(false);
                    } else {
                        if (abstractC12336fM34453l2 instanceof AbstractC12336f.c) {
                            throw AbstractC11895b.m32003v(578815926, c28655q4, false);
                        }
                        c28655q4.m87150e0(763598031);
                        AbstractC12336f.c cVar5 = (AbstractC12336f.c) abstractC12336fM34453l2;
                        List<C16613h> listM34463a4 = cVar5.m34463a();
                        i19 = i18;
                        if ((i19 & 896) == 256) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        objM87133R4 = c28655q4.m87133R();
                        if (z28) {
                            interfaceC4351m6 = interfaceC4351m5;
                            objM87133R4 = new C3600s(0, interfaceC4351m6);
                            c28655q4.m87172p0(objM87133R4);
                        } else {
                            interfaceC4351m6 = interfaceC4351m5;
                            objM87133R4 = new C3600s(0, interfaceC4351m6);
                            c28655q4.m87172p0(objM87133R4);
                        }
                        InterfaceC4351m interfaceC4351m10 = (InterfaceC4351m) objM87133R4;
                        interfaceC4351m5 = interfaceC4351m6;
                        if ((i19 & 7168) == 2048) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        objM87133R5 = c28655q4.m87133R();
                        if (z29) {
                            function9 = function8;
                            objM87133R5 = new C3599r(function9, 3);
                            c28655q4.m87172p0(objM87133R5);
                        } else {
                            function9 = function8;
                            objM87133R5 = new C3599r(function9, 3);
                            c28655q4.m87172p0(objM87133R5);
                        }
                        C28655q c28655q11117 = c28655q4;
                        function8 = function9;
                        i18 = i19;
                        c22949e2 = c22949e;
                        AbstractC16611f.m47150h(null, listM34463a4, interfaceC4351m10, null, (InterfaceC4339a) objM87133R5, r12.getLeftCalendarDisplayIcon(), cVar5.getRightCalendarDisplayIcon(), "Journal_DatePicker_DayPill", c28655q11117, 12582912, 9);
                        C28655q c28655q11118 = c28655q11117;
                        z34 = false;
                        c28655q11118.m87173q(false);
                        c28655q5 = c28655q11118;
                    }
                    c28655q5.m87173q(z34);
                    c28655q6 = c28655q5;
                }
                c22949e2 = c22949e;
                z34 = false;
                c28655q5 = c28655q4;
                c28655q5.m87173q(z34);
                c28655q6 = c28655q5;
            }
            c28655q6.m87173q(true);
            f13 = 8;
            AbstractC22953f.m66715b(c28655q6, AbstractC1102d.m3419p(3 * f13, c2314t4));
            c12337gM34447f2 = c12341k.getIsSuccess().getDateSelectorState();
            if (c12337gM34447f2 == null) {
                c28655q6.m87150e0(-220551062);
                C22994r1 c22994r1M66759a10 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9108K, c28655q6, 48);
                iHashCode5 = Long.hashCode(c28655q6.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q6.m87165m();
                Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q6, c2314t4);
                c28655q6.m87158i0();
                if (c28655q6.f115903S) {
                    c28655q6.m87163l(c0213j);
                } else {
                    c28655q6.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q6, c0209i, c22994r1M66759a10);
                AbstractC28683x.m87239G(c28655q6, c0209i2, interfaceC28653p1M87165m116);
                if (c28655q6.f115903S) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q6, iHashCode5, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, c28655q6, iHashCode5, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q6, c0209i4, modifierM118962N116);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                c12341k2 = c12341k;
                m10769L0(c12341k2, new LayoutWeightElement(1.0f, true), c28655q6, i18 & 14, 0);
                c12344nM34454m = c12341k2.getIsSuccess().getNavigationButton();
                if (c12344nM34454m == null) {
                    c28655q6.m87150e0(469396342);
                    c28655q6.m87173q(false);
                    z36 = false;
                } else {
                    c28655q6.m87150e0(469396343);
                    if ((i18 & 112) == 32) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    objM87133R6 = c28655q6.m87133R();
                    if (z35) {
                        objM87133R6 = new C3586e(function1, 1);
                        c28655q6.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C3586e(function1, 1);
                        c28655q6.m87172p0(objM87133R6);
                    }
                    z36 = false;
                    m10835f1(c12344nM34454m, (Function1) objM87133R6, c28655q6, TextResource.$stable | C9598e.f28134d, 0);
                    c28655q6.m87173q(false);
                }
                c28655q6.m87173q(true);
                strM34443b = c12341k2.getIsSuccess().getAutosaveInstructionText();
                if (strM34443b == null) {
                    c28655q6.m87150e0(-220233406);
                    c28655q6.m87173q(z36);
                    c28655q7 = c28655q6;
                } else {
                    c28655q6.m87150e0(-220233405);
                    float f19 = 2 * f13;
                    AbstractC22953f.m66715b(c28655q6, AbstractC1102d.m3419p(f19, c2314t4));
                    C38072d c38072d10 = C38072d.f163053a;
                    int i217 = C38072d.f163054b;
                    C28655q c28655q11119 = c28655q6;
                    AbstractC30795n.m94707h(strM34443b, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t4), f19, 0.0f, 2), c38072d10.m121949b(c28655q6, i217).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d10.m121952e(c28655q6, i217).getB1(), null, c28655q11119, 48, C2886a.f11498d << 18, 196088);
                    C28655q c28655q111110 = c28655q11119;
                    c28655q111110.m87173q(false);
                    c28655q7 = c28655q111110;
                }
                if (c12341k2.getIsSuccess().getDefaultAnswersToggleInfo().getShouldShowDefaultAnswersToggle()) {
                    c28655q7.m87150e0(-219738242);
                    AbstractC22953f.m66715b(c28655q7, AbstractC1102d.m3419p(1 * f13, c2314t4));
                    function5 = function3;
                    interfaceC4339a2 = interfaceC4339a;
                    m10738B0(c12341k2.getIsSuccess().getDefaultAnswersToggleInfo(), function5, interfaceC4339a2, c28655q7, (i18 >> 12) & MessageListItemViewType.GIPHY);
                    z37 = false;
                    c28655q7.m87173q(false);
                } else {
                    function5 = function3;
                    interfaceC4339a2 = interfaceC4339a;
                    z37 = false;
                    c28655q7.m87150e0(-219430722);
                    c28655q7.m87173q(false);
                }
                c28655q7.m87173q(z37);
                c28655q8 = c28655q7;
            } else {
                c28655q6.m87150e0(-220551062);
                C22994r1 c22994r1M66759a11 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9108K, c28655q6, 48);
                iHashCode5 = Long.hashCode(c28655q6.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q6.m87165m();
                Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q6, c2314t4);
                c28655q6.m87158i0();
                if (c28655q6.f115903S) {
                    c28655q6.m87163l(c0213j);
                } else {
                    c28655q6.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q6, c0209i, c22994r1M66759a11);
                AbstractC28683x.m87239G(c28655q6, c0209i2, interfaceC28653p1M87165m117);
                if (c28655q6.f115903S) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q6, iHashCode5, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, c28655q6, iHashCode5, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q6, c0209i4, modifierM118962N117);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                c12341k2 = c12341k;
                m10769L0(c12341k2, new LayoutWeightElement(1.0f, true), c28655q6, i18 & 14, 0);
                c12344nM34454m = c12341k2.getIsSuccess().getNavigationButton();
                if (c12344nM34454m == null) {
                    c28655q6.m87150e0(469396342);
                    c28655q6.m87173q(false);
                    z36 = false;
                } else {
                    c28655q6.m87150e0(469396343);
                    if ((i18 & 112) == 32) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    objM87133R6 = c28655q6.m87133R();
                    if (z35) {
                        objM87133R6 = new C3586e(function1, 1);
                        c28655q6.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C3586e(function1, 1);
                        c28655q6.m87172p0(objM87133R6);
                    }
                    z36 = false;
                    m10835f1(c12344nM34454m, (Function1) objM87133R6, c28655q6, TextResource.$stable | C9598e.f28134d, 0);
                    c28655q6.m87173q(false);
                }
                c28655q6.m87173q(true);
                strM34443b = c12341k2.getIsSuccess().getAutosaveInstructionText();
                if (strM34443b == null) {
                    c28655q6.m87150e0(-220233406);
                    c28655q6.m87173q(z36);
                    c28655q7 = c28655q6;
                } else {
                    c28655q6.m87150e0(-220233405);
                    float f110 = 2 * f13;
                    AbstractC22953f.m66715b(c28655q6, AbstractC1102d.m3419p(f110, c2314t4));
                    C38072d c38072d11 = C38072d.f163053a;
                    int i218 = C38072d.f163054b;
                    C28655q c28655q111111 = c28655q6;
                    AbstractC30795n.m94707h(strM34443b, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t4), f110, 0.0f, 2), c38072d11.m121949b(c28655q6, i218).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d11.m121952e(c28655q6, i218).getB1(), null, c28655q111111, 48, C2886a.f11498d << 18, 196088);
                    C28655q c28655q111112 = c28655q111111;
                    c28655q111112.m87173q(false);
                    c28655q7 = c28655q111112;
                }
                if (c12341k2.getIsSuccess().getDefaultAnswersToggleInfo().getShouldShowDefaultAnswersToggle()) {
                    c28655q7.m87150e0(-219738242);
                    AbstractC22953f.m66715b(c28655q7, AbstractC1102d.m3419p(1 * f13, c2314t4));
                    function5 = function3;
                    interfaceC4339a2 = interfaceC4339a;
                    m10738B0(c12341k2.getIsSuccess().getDefaultAnswersToggleInfo(), function5, interfaceC4339a2, c28655q7, (i18 >> 12) & MessageListItemViewType.GIPHY);
                    z37 = false;
                    c28655q7.m87173q(false);
                } else {
                    function5 = function3;
                    interfaceC4339a2 = interfaceC4339a;
                    z37 = false;
                    c28655q7.m87150e0(-219430722);
                    c28655q7.m87173q(false);
                }
                c28655q7.m87173q(z37);
                c28655q8 = c28655q7;
            }
            interfaceC4351m3 = interfaceC4351m5;
            function6 = function8;
            c28655q = c28655q8;
        } else {
            C28655q c28655q122 = c28655q9;
            function5 = function3;
            c12341k2 = c12341k;
            c28655q122.m87138X();
            interfaceC4351m3 = interfaceC4351m2;
            function6 = function4;
            c28655q = c28655q122;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2931g(c12341k2, function1, interfaceC4351m3, function6, interfaceC4353o, function5, interfaceC4339a2, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N1 */
    public static final C23454a0 m10776N1() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final C23454a0 m10778O0(long j7, String str) {
        AbstractC22676k.m65750j(str, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O1 */
    public static final C23454a0 m10779O1(Function1 function1) {
        function1.invoke(Boolean.FALSE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final C23454a0 m10781P0(String it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P1 */
    public static final C23454a0 m10782P1(C12341k c12341k, InterfaceC4339a interfaceC4339a, Function1 function1, Function1 function2) {
        if (c12341k.getIsError().getErrorType() == EnumC32914f.COULD_NOT_LOAD_ENTRIES) {
            interfaceC4339a.invoke();
        } else {
            function1.invoke(Boolean.FALSE);
        }
        function2.invoke(new AbstractC11103c.i(null, false, 3, 0 == true ? 1 : 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final C23454a0 m10784Q0(Function1 function1) {
        function1.invoke("Header");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q1 */
    public static final C23454a0 m10785Q1(Function1 function1) {
        function1.invoke(Boolean.TRUE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public static final C23454a0 m10787R0(C12337g c12337g, InterfaceC4353o interfaceC4353o, Object date) {
        AbstractC22676k.m65750j(date, "date");
        if (date.equals(c12337g.getBackDate())) {
            Long lM34468b = c12337g.getBackCycleId();
            Long lValueOf = Long.valueOf(lM34468b != null ? lM34468b.longValue() : 0L);
            String strM34469c = c12337g.getBackDate();
            EnumC39731b enumC39731b = EnumC39731b.BACK_ARROW;
            Boolean bool = Boolean.FALSE;
            interfaceC4353o.invoke(lValueOf, strM34469c, enumC39731b, bool, bool);
        } else if (date.equals(c12337g.getForwardDate())) {
            Long lM34472f = c12337g.getForwardCycleId();
            Long lValueOf2 = Long.valueOf(lM34472f != null ? lM34472f.longValue() : 0L);
            String strM34473g = c12337g.getForwardDate();
            EnumC39731b enumC39731b2 = EnumC39731b.FORWARD_ARROW;
            Boolean bool2 = Boolean.FALSE;
            interfaceC4353o.invoke(lValueOf2, strM34473g, enumC39731b2, bool2, bool2);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R1 */
    public static final C23454a0 m10788R1(InterfaceC4339a interfaceC4339a, boolean z4) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final C23454a0 m10790S0(InterfaceC4353o interfaceC4353o, AbstractC12336f abstractC12336f) {
        String strM34511a = ((AbstractC12336f.c) abstractC12336f).getTodayCta().getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
        EnumC39731b enumC39731b = EnumC39731b.DATE_SELECTION;
        Boolean bool = Boolean.TRUE;
        interfaceC4353o.invoke(0L, strM34511a, enumC39731b, bool, bool);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S1 */
    public static final C23454a0 m10791S1(Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar) {
        m10736A2(function1, interfaceC28601c1, interfaceC28601c2, interfaceC2994c0, aVar);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final C23454a0 m10793T0(InterfaceC4351m interfaceC4351m, String date, Long l7) {
        AbstractC22676k.m65750j(date, "date");
        interfaceC4351m.invoke(Long.valueOf(l7 != null ? l7.longValue() : 0L), date);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T1 */
    public static final C23454a0 m10794T1(Function1 function1, InterfaceC4351m interfaceC4351m, boolean z4) {
        if (z4) {
            function1.invoke(Boolean.TRUE);
        }
        interfaceC4351m.invoke(Boolean.valueOf(z4), Boolean.FALSE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final C23454a0 m10796U0(Function1 function1) {
        function1.invoke("Carousel");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U1 */
    public static final C23454a0 m10797U1(Function1 function1, Function1 function2, C13821r1 c13821r1, InterfaceC4351m interfaceC4351m, boolean z4) {
        if (z4) {
            function1.invoke(Boolean.TRUE);
        }
        function2.invoke(Integer.valueOf(c13821r1.f49318a.m87024x()));
        interfaceC4351m.invoke(Boolean.valueOf(z4), Boolean.TRUE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final C23454a0 m10799V0(Function1 function1, C9598e it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V1 */
    public static final C23454a0 m10800V1(Function1 function1, C13821r1 c13821r1, InterfaceC4351m interfaceC4351m, Function1 function2, C12341k c12341k, long j7, String date) {
        AbstractC22676k.m65750j(date, "date");
        function1.invoke(Integer.valueOf(c13821r1.f49318a.m87024x()));
        interfaceC4351m.invoke(Long.valueOf(j7), date);
        C12337g c12337gM34447f = c12341k.getIsSuccess().getDateSelectorState();
        function2.invoke(new AbstractC11103c.s(date, c12337gM34447f != null ? c12337gM34447f.getCurrentDate() : null, c12341k.getIsSuccess().getHasUserEditJournal()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public static final C23454a0 m10802W0(C12341k c12341k, Function1 function1, InterfaceC4351m interfaceC4351m, Function1 function2, InterfaceC4353o interfaceC4353o, Function1 function3, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m10775N0(c12341k, function1, interfaceC4351m, function2, interfaceC4353o, function3, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W1 */
    public static final C23454a0 m10803W1(C12341k c12341k, InterfaceC4351m interfaceC4351m, InterfaceC28601c1 interfaceC28601c1, String source) {
        AbstractC22676k.m65750j(source, "source");
        C12337g c12337gM34447f = c12341k.getIsSuccess().getDateSelectorState();
        if (c12337gM34447f != null) {
            interfaceC4351m.invoke(c12337gM34447f.getCurrentDate(), source);
            m10903w1(interfaceC28601c1, true);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: X0 */
    private static final void m10805X0(List<C36873b> list, InterfaceC15237i interfaceC15237i, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(163260689);
        int i14 = (i13 & 6) == 0 ? (c28655q.m87157i(list) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC15237i) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            for (C36873b c36873b : list) {
                c28655q.m87150e0(-2020259996);
                for (InterfaceC25312u interfaceC25312u : c36873b.mo78412a()) {
                    C25307p c25307pM74307h = p720m91.Function1.m74307h(null, 1, null);
                    boolean zM87157i = c28655q.m87157i(interfaceC15237i) | ((i14 & 896) == 256);
                    Object objM87133R = c28655q.m87133R();
                    if (zM87157i || objM87133R == C28635l.f115821a) {
                        objM87133R = new C3601t(interfaceC15237i, function1, 0);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC25303l.m74291r(interfaceC25312u, c25307pM74307h, null, (Function1) objM87133R, c28655q, C25307p.f99300b << 3, 4);
                }
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21061j(list, interfaceC15237i, function1, i13, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X1 */
    public static final C23454a0 m10806X1(Function1 function1, C13821r1 c13821r1, InterfaceC4352n interfaceC4352n, C12341k c12341k, InterfaceC28601c1 interfaceC28601c1, Function1 function2, long j7, String date, EnumC39731b type, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(date, "date");
        AbstractC22676k.m65750j(type, "type");
        function1.invoke(Integer.valueOf(c13821r1.f49318a.m87024x()));
        interfaceC4352n.invoke(Long.valueOf(j7), date, type, Boolean.valueOf(z13));
        AbstractC12336f abstractC12336fM34453l = c12341k.getIsSuccess().getJournalDatePillViewState();
        C12337g c12337gM34447f = c12341k.getIsSuccess().getDateSelectorState();
        m10740B2(abstractC12336fM34453l, date, c12337gM34447f != null ? c12337gM34447f.getCurrentDate() : null, c12341k.getIsSuccess().getHasUserEditJournal(), new C2609r(interfaceC28601c1, function2, 3));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final C23454a0 m10808Y0(InterfaceC15237i interfaceC15237i, Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        ((C15240l) interfaceC15237i).m43339b(false);
        if (it instanceof AbstractC36877d) {
            function1.invoke(it);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y1 */
    public static final C23454a0 m10809Y1(InterfaceC28601c1 interfaceC28601c1, Function1 function1, AbstractC11103c event) {
        AbstractC22676k.m65750j(event, "event");
        interfaceC28601c1.setValue(Boolean.valueOf(event instanceof AbstractC11103c.i));
        function1.invoke(event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final C23454a0 m10811Z0(List list, InterfaceC15237i interfaceC15237i, Function1 function1, int i13, Composer composer, int i14) {
        m10805X0(list, interfaceC15237i, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1 */
    public static final Modifier m10812Z1(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-875267380);
        Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 2 * 8, 0.0f, 2);
        c28655q.m87173q(false);
        return modifierM3396r;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:103:0x0273  */
    /* JADX WARN: Code duplicated, block: B:104:0x0275  */
    /* JADX WARN: Code duplicated, block: B:107:0x027d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x027f  */
    /* JADX WARN: Code duplicated, block: B:110:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:113:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:77:0x0113  */
    /* JADX WARN: Code duplicated, block: B:78:0x0117  */
    /* JADX WARN: Code duplicated, block: B:81:0x012a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0138  */
    /* JADX WARN: Code duplicated, block: B:86:0x018e  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a1 */
    private static final void m10815a1(String str, String str2, final double d3, final double d14, String str3, final Function1 function1, Composer composer, final int i13, final int i14) {
        String str4;
        int i15;
        String str5;
        int i16;
        String str6;
        int i17;
        boolean z4;
        final String str7;
        final String str8;
        final String str9;
        C28677v1 c28677v1M87180u;
        Object objM87133R;
        C28676v0 c28676v0;
        final InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        final InterfaceC28601c1 interfaceC28601c2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R3;
        char c3;
        char c7;
        boolean z13;
        Object obj;
        InterfaceC28601c1 interfaceC28601c3;
        InterfaceC28601c1 interfaceC28601c4;
        boolean z14;
        Object objM87133R4;
        int i18;
        int i19;
        int i24;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1067662605);
        int i25 = i14 & 1;
        if (i25 != 0) {
            i15 = i13 | 6;
            str4 = str;
        } else if ((i13 & 6) == 0) {
            str4 = str;
            i15 = (c28655q.m87153g(str4) ? 4 : 2) | i13;
        } else {
            str4 = str;
            i15 = i13;
        }
        int i26 = i14 & 2;
        if (i26 == 0) {
            if ((i13 & 48) == 0) {
                str5 = str2;
                i15 |= c28655q.m87153g(str5) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q.m87145c(d3)) {
                    i24 = 256;
                } else {
                    i24 = 128;
                }
                i15 |= i24;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q.m87145c(d14)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    str6 = str3;
                    if (c28655q.m87153g(str6)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(function1)) {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i18;
                }
                if ((i15 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i25 != 0) {
                        str4 = "";
                    }
                    if (i26 != 0) {
                        str5 = "";
                    }
                    if (i16 != 0) {
                        str6 = "";
                    }
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(str5);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    C2314t c2314t = C2314t.f9131w;
                    Modifier modifierM66720i = AbstractC22953f.m66720i(c2314t);
                    String str10 = str6;
                    String str11 = str4;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66720i);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    TextResource textResourceM21278l = AbstractC8693b.m21278l(str11);
                    TextResource textResourceM21278l2 = AbstractC8693b.m21278l((String) interfaceC28601c1.getValue());
                    TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC29492c.f119854q, new TextResource.AbstractC8690d.b(Double.valueOf(d3)), new TextResource.AbstractC8690d.b(Double.valueOf(d14)));
                    AbstractC30784c.c cVar = new AbstractC30784c.c(AbstractC8693b.m21278l(str10), null, 2, 0 == true ? 1 : 0);
                    boolean zBooleanValue = ((Boolean) interfaceC28601c2.getValue()).booleanValue();
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C3509a(11);
                        c28655q.m87172p0(objM87133R3);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R3;
                    if ((i15 & 896) == 256) {
                        c3 = true;
                    } else {
                        c3 = false;
                    }
                    if ((i15 & 7168) == 2048) {
                        c7 = true;
                    } else {
                        c7 = false;
                    }
                    z13 = c3 | c7;
                    Object objM87133R5 = c28655q.m87133R();
                    if (!z13 || objM87133R5 == c28676v0) {
                        obj = new Function1() { // from class: bs1.z
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return AbstractC3583c0.m10823c1(interfaceC28601c1, interfaceC28601c2, d3, d14, (String) obj2);
                            }
                        };
                        interfaceC28601c3 = interfaceC28601c1;
                        interfaceC28601c4 = interfaceC28601c2;
                        c28655q.m87172p0(obj);
                    } else {
                        interfaceC28601c3 = interfaceC28601c1;
                        obj = objM87133R5;
                        interfaceC28601c4 = interfaceC28601c2;
                    }
                    int i27 = TextResource.$stable;
                    AbstractC30792k.m94678l(null, textResourceM21278l2, null, textResourceM21278l, null, null, null, cVar, c8688b, zBooleanValue, false, null, 0L, false, 3, 0, 0, true, null, false, false, 0, false, null, null, null, null, null, null, null, interfaceC4339a, (Function1) obj, c28655q, (i27 << 9) | (i27 << 3) | (AbstractC30784c.c.f126792d << 21) | (TextResource.C8688b.f25889c << 24), 12607488, 0, 6, 1073593461, 0);
                    Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 4 * 8, 1);
                    EnumC27284v enumC27284v = EnumC27284v.TextLarge;
                    String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62216A2);
                    long jM125371X = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getRecovery();
                    boolean z15 = !((Boolean) interfaceC28601c4.getValue()).booleanValue();
                    if ((458752 & i15) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (z14 || objM87133R4 == c28676v0) {
                        objM87133R4 = new C3590i(function1, interfaceC28601c3, 2);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC27282u.m82292h(modifierM3396r, enumC27284v, strM92103Y, z15, jM125371X, null, false, (InterfaceC4339a) objM87133R4, c28655q, 54, 96);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    str8 = str5;
                    str9 = str11;
                    str7 = str10;
                } else {
                    c28655q.m87138X();
                    String str12 = str5;
                    str7 = str6;
                    str8 = str12;
                    str9 = str4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs1.a0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return AbstractC3583c0.m10831e1(str9, str8, d3, d14, str7, function1, i13, i14, (Composer) obj2, iIntValue);
                        }
                    };
                }
            }
            i15 |= 24576;
            str6 = str3;
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87157i(function1)) {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i18;
            }
            if ((i15 & 74899) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i25 != 0) {
                    str4 = "";
                }
                if (i26 != 0) {
                    str5 = "";
                }
                if (i16 != 0) {
                    str6 = "";
                }
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(str5);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                C2314t c2314t2 = C2314t.f9131w;
                Modifier modifierM66720i2 = AbstractC22953f.m66720i(c2314t2);
                String str13 = str6;
                String str14 = str4;
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM66720i2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                TextResource textResourceM21278l3 = AbstractC8693b.m21278l(str14);
                TextResource textResourceM21278l4 = AbstractC8693b.m21278l((String) interfaceC28601c1.getValue());
                TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC29492c.f119854q, new TextResource.AbstractC8690d.b(Double.valueOf(d3)), new TextResource.AbstractC8690d.b(Double.valueOf(d14)));
                AbstractC30784c.c cVar2 = new AbstractC30784c.c(AbstractC8693b.m21278l(str13), null, 2, 0 == true ? 1 : 0);
                boolean zBooleanValue2 = ((Boolean) interfaceC28601c2.getValue()).booleanValue();
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C3509a(11);
                    c28655q.m87172p0(objM87133R3);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                if ((i15 & 896) == 256) {
                    c3 = true;
                } else {
                    c3 = false;
                }
                if ((i15 & 7168) == 2048) {
                    c7 = true;
                } else {
                    c7 = false;
                }
                z13 = c3 | c7;
                Object objM87133R6 = c28655q.m87133R();
                if (z13) {
                    obj = new Function1() { // from class: bs1.z
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return AbstractC3583c0.m10823c1(interfaceC28601c1, interfaceC28601c2, d3, d14, (String) obj2);
                        }
                    };
                    interfaceC28601c3 = interfaceC28601c1;
                    interfaceC28601c4 = interfaceC28601c2;
                    c28655q.m87172p0(obj);
                } else {
                    obj = new Function1() { // from class: bs1.z
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return AbstractC3583c0.m10823c1(interfaceC28601c1, interfaceC28601c2, d3, d14, (String) obj2);
                        }
                    };
                    interfaceC28601c3 = interfaceC28601c1;
                    interfaceC28601c4 = interfaceC28601c2;
                    c28655q.m87172p0(obj);
                }
                int i28 = TextResource.$stable;
                AbstractC30792k.m94678l(null, textResourceM21278l4, null, textResourceM21278l3, null, null, null, cVar2, c8688b2, zBooleanValue2, false, null, 0L, false, 3, 0, 0, true, null, false, false, 0, false, null, null, null, null, null, null, null, interfaceC4339a2, (Function1) obj, c28655q, (i28 << 9) | (i28 << 3) | (AbstractC30784c.c.f126792d << 21) | (TextResource.C8688b.f25889c << 24), 12607488, 0, 6, 1073593461, 0);
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), 0.0f, 4 * 8, 1);
                EnumC27284v enumC27284v2 = EnumC27284v.TextLarge;
                String strM92103Y2 = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62216A2);
                long jM125371X2 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getRecovery();
                boolean z16 = !((Boolean) interfaceC28601c4.getValue()).booleanValue();
                if ((458752 & i15) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R4 = c28655q.m87133R();
                if (z14) {
                    objM87133R4 = new C3590i(function1, interfaceC28601c3, 2);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C3590i(function1, interfaceC28601c3, 2);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC27282u.m82292h(modifierM3396r2, enumC27284v2, strM92103Y2, z16, jM125371X2, null, false, (InterfaceC4339a) objM87133R4, c28655q, 54, 96);
                c28655q = c28655q;
                c28655q.m87173q(true);
                str8 = str5;
                str9 = str14;
                str7 = str13;
            } else {
                c28655q.m87138X();
                String str15 = str5;
                str7 = str6;
                str8 = str15;
                str9 = str4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs1.a0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC3583c0.m10831e1(str9, str8, d3, d14, str7, function1, i13, i14, (Composer) obj2, iIntValue);
                    }
                };
            }
        }
        i15 |= 48;
        str5 = str2;
        if ((i13 & 384) == 0) {
            if (c28655q.m87145c(d3)) {
                i24 = 256;
            } else {
                i24 = 128;
            }
            i15 |= i24;
        }
        if ((i13 & 3072) == 0) {
            if (c28655q.m87145c(d14)) {
                i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i19;
        }
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                str6 = str3;
                if (c28655q.m87153g(str6)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87157i(function1)) {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i18;
            }
            if ((i15 & 74899) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i25 != 0) {
                    str4 = "";
                }
                if (i26 != 0) {
                    str5 = "";
                }
                if (i16 != 0) {
                    str6 = "";
                }
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(str5);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                C2314t c2314t3 = C2314t.f9131w;
                Modifier modifierM66720i3 = AbstractC22953f.m66720i(c2314t3);
                String str16 = str6;
                String str17 = str4;
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM66720i3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                TextResource textResourceM21278l5 = AbstractC8693b.m21278l(str17);
                TextResource textResourceM21278l6 = AbstractC8693b.m21278l((String) interfaceC28601c1.getValue());
                TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC29492c.f119854q, new TextResource.AbstractC8690d.b(Double.valueOf(d3)), new TextResource.AbstractC8690d.b(Double.valueOf(d14)));
                AbstractC30784c.c cVar3 = new AbstractC30784c.c(AbstractC8693b.m21278l(str16), null, 2, 0 == true ? 1 : 0);
                boolean zBooleanValue3 = ((Boolean) interfaceC28601c2.getValue()).booleanValue();
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C3509a(11);
                    c28655q.m87172p0(objM87133R3);
                }
                InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R3;
                if ((i15 & 896) == 256) {
                    c3 = true;
                } else {
                    c3 = false;
                }
                if ((i15 & 7168) == 2048) {
                    c7 = true;
                } else {
                    c7 = false;
                }
                z13 = c3 | c7;
                Object objM87133R7 = c28655q.m87133R();
                if (z13) {
                    obj = new Function1() { // from class: bs1.z
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return AbstractC3583c0.m10823c1(interfaceC28601c1, interfaceC28601c2, d3, d14, (String) obj2);
                        }
                    };
                    interfaceC28601c3 = interfaceC28601c1;
                    interfaceC28601c4 = interfaceC28601c2;
                    c28655q.m87172p0(obj);
                } else {
                    obj = new Function1() { // from class: bs1.z
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return AbstractC3583c0.m10823c1(interfaceC28601c1, interfaceC28601c2, d3, d14, (String) obj2);
                        }
                    };
                    interfaceC28601c3 = interfaceC28601c1;
                    interfaceC28601c4 = interfaceC28601c2;
                    c28655q.m87172p0(obj);
                }
                int i29 = TextResource.$stable;
                AbstractC30792k.m94678l(null, textResourceM21278l6, null, textResourceM21278l5, null, null, null, cVar3, c8688b3, zBooleanValue3, false, null, 0L, false, 3, 0, 0, true, null, false, false, 0, false, null, null, null, null, null, null, null, interfaceC4339a3, (Function1) obj, c28655q, (i29 << 9) | (i29 << 3) | (AbstractC30784c.c.f126792d << 21) | (TextResource.C8688b.f25889c << 24), 12607488, 0, 6, 1073593461, 0);
                Modifier modifierM3396r3 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t3), 0.0f, 4 * 8, 1);
                EnumC27284v enumC27284v3 = EnumC27284v.TextLarge;
                String strM92103Y3 = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62216A2);
                long jM125371X3 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getRecovery();
                boolean z17 = !((Boolean) interfaceC28601c4.getValue()).booleanValue();
                if ((458752 & i15) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R4 = c28655q.m87133R();
                if (z14) {
                    objM87133R4 = new C3590i(function1, interfaceC28601c3, 2);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C3590i(function1, interfaceC28601c3, 2);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC27282u.m82292h(modifierM3396r3, enumC27284v3, strM92103Y3, z17, jM125371X3, null, false, (InterfaceC4339a) objM87133R4, c28655q, 54, 96);
                c28655q = c28655q;
                c28655q.m87173q(true);
                str8 = str5;
                str9 = str17;
                str7 = str16;
            } else {
                c28655q.m87138X();
                String str18 = str5;
                str7 = str6;
                str8 = str18;
                str9 = str4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs1.a0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC3583c0.m10831e1(str9, str8, d3, d14, str7, function1, i13, i14, (Composer) obj2, iIntValue);
                    }
                };
            }
        }
        i15 |= 24576;
        str6 = str3;
        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q.m87157i(function1)) {
                i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i18;
        }
        if ((i15 & 74899) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i25 != 0) {
                str4 = "";
            }
            if (i26 != 0) {
                str5 = "";
            }
            if (i16 != 0) {
                str6 = "";
            }
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(str5);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            C2314t c2314t4 = C2314t.f9131w;
            Modifier modifierM66720i4 = AbstractC22953f.m66720i(c2314t4);
            String str19 = str6;
            String str110 = str4;
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM66720i4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            TextResource textResourceM21278l7 = AbstractC8693b.m21278l(str110);
            TextResource textResourceM21278l8 = AbstractC8693b.m21278l((String) interfaceC28601c1.getValue());
            TextResource.C8688b c8688b4 = new TextResource.C8688b(AbstractC29492c.f119854q, new TextResource.AbstractC8690d.b(Double.valueOf(d3)), new TextResource.AbstractC8690d.b(Double.valueOf(d14)));
            AbstractC30784c.c cVar4 = new AbstractC30784c.c(AbstractC8693b.m21278l(str19), null, 2, 0 == true ? 1 : 0);
            boolean zBooleanValue4 = ((Boolean) interfaceC28601c2.getValue()).booleanValue();
            objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C3509a(11);
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
            if ((i15 & 896) == 256) {
                c3 = true;
            } else {
                c3 = false;
            }
            if ((i15 & 7168) == 2048) {
                c7 = true;
            } else {
                c7 = false;
            }
            z13 = c3 | c7;
            Object objM87133R8 = c28655q.m87133R();
            if (z13) {
                obj = new Function1() { // from class: bs1.z
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AbstractC3583c0.m10823c1(interfaceC28601c1, interfaceC28601c2, d3, d14, (String) obj2);
                    }
                };
                interfaceC28601c3 = interfaceC28601c1;
                interfaceC28601c4 = interfaceC28601c2;
                c28655q.m87172p0(obj);
            } else {
                obj = new Function1() { // from class: bs1.z
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AbstractC3583c0.m10823c1(interfaceC28601c1, interfaceC28601c2, d3, d14, (String) obj2);
                    }
                };
                interfaceC28601c3 = interfaceC28601c1;
                interfaceC28601c4 = interfaceC28601c2;
                c28655q.m87172p0(obj);
            }
            int i210 = TextResource.$stable;
            AbstractC30792k.m94678l(null, textResourceM21278l8, null, textResourceM21278l7, null, null, null, cVar4, c8688b4, zBooleanValue4, false, null, 0L, false, 3, 0, 0, true, null, false, false, 0, false, null, null, null, null, null, null, null, interfaceC4339a4, (Function1) obj, c28655q, (i210 << 9) | (i210 << 3) | (AbstractC30784c.c.f126792d << 21) | (TextResource.C8688b.f25889c << 24), 12607488, 0, 6, 1073593461, 0);
            Modifier modifierM3396r4 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t4), 0.0f, 4 * 8, 1);
            EnumC27284v enumC27284v4 = EnumC27284v.TextLarge;
            String strM92103Y4 = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62216A2);
            long jM125371X4 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getRecovery();
            boolean z18 = !((Boolean) interfaceC28601c4.getValue()).booleanValue();
            if ((458752 & i15) == 131072) {
                z14 = true;
            } else {
                z14 = false;
            }
            objM87133R4 = c28655q.m87133R();
            if (z14) {
                objM87133R4 = new C3590i(function1, interfaceC28601c3, 2);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C3590i(function1, interfaceC28601c3, 2);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC27282u.m82292h(modifierM3396r4, enumC27284v4, strM92103Y4, z18, jM125371X4, null, false, (InterfaceC4339a) objM87133R4, c28655q, 54, 96);
            c28655q = c28655q;
            c28655q.m87173q(true);
            str8 = str5;
            str9 = str110;
            str7 = str19;
        } else {
            c28655q.m87138X();
            String str111 = str5;
            str7 = str6;
            str8 = str111;
            str9 = str4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs1.a0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return AbstractC3583c0.m10831e1(str9, str8, d3, d14, str7, function1, i13, i14, (Composer) obj2, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public static final C23454a0 m10816a2(Function1 function1, C13821r1 c13821r1, C12341k c12341k, InterfaceC4352n interfaceC4352n, Function1 function2, Object event) {
        AbstractC22676k.m65750j(event, "event");
        function1.invoke(Integer.valueOf(c13821r1.f49318a.m87024x()));
        m10904w2(c12341k, interfaceC4352n, function2, event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final C23454a0 m10819b1() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2 */
    public static final C23454a0 m10820b2(InterfaceC28690z0 interfaceC28690z0, float f13) {
        interfaceC28690z0.getClass();
        ((C28617g1) interfaceC28690z0).m87023y(f13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public static final C23454a0 m10823c1(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, double d3, double d14, String it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC28601c1.setValue(it);
        interfaceC28601c2.setValue(Boolean.valueOf(AbstractC3594m.m10961b((String) interfaceC28601c1.getValue(), d3, d14)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public static final C23454a0 m10824c2(InterfaceC28601c1 interfaceC28601c1, InterfaceC39147y coordinates) {
        AbstractC22676k.m65750j(coordinates, "coordinates");
        interfaceC28601c1.setValue(Integer.valueOf((int) (coordinates.mo3541n() & 4294967295L)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final C23454a0 m10827d1(Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        function1.invoke(AbstractC3594m.m10960a((String) interfaceC28601c1.getValue()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public static final C23454a0 m10828d2(InterfaceC28601c1 interfaceC28601c1) {
        m10903w1(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public static final C23454a0 m10831e1(String str, String str2, double d3, double d14, String str3, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m10815a1(str, str2, d3, d14, str3, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public static final C23454a0 m10832e2(Function1 function1, Function1 function2, C13821r1 c13821r1, InterfaceC4352n interfaceC4352n, C12341k c12341k, InterfaceC28601c1 interfaceC28601c1, Function1 function3, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC3588g.a) {
            function1.invoke(Integer.valueOf(((AbstractC3588g.a) event).getCom.mapbox.maps.MapboxMap.QFE_OFFSET java.lang.String()));
        } else if (event instanceof AbstractC3588g.b) {
            function2.invoke(Integer.valueOf(c13821r1.f49318a.m87024x()));
            AbstractC3588g.b bVar = (AbstractC3588g.b) event;
            Long lM10946a = bVar.getCycleId();
            interfaceC4352n.invoke(Long.valueOf(lM10946a != null ? lM10946a.longValue() : 0L), bVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), EnumC39731b.DATE_SELECTION, Boolean.FALSE);
            AbstractC12336f abstractC12336fM34453l = c12341k.getIsSuccess().getJournalDatePillViewState();
            String strM10947b = bVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
            C12337g c12337gM34447f = c12341k.getIsSuccess().getDateSelectorState();
            m10740B2(abstractC12336fM34453l, strM10947b, c12337gM34447f != null ? c12337gM34447f.getCurrentDate() : null, c12341k.getIsSuccess().getHasUserEditJournal(), new C2609r(interfaceC28601c1, function3, 2));
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:57:0x0119  */
    /* JADX WARN: Code duplicated, block: B:60:0x0124  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f1 */
    private static final void m10835f1(final C12344n c12344n, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        boolean z13;
        C28655q c28655q;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        int i16;
        C28676v0 c28676v0;
        Function1 function4;
        Function1 function5;
        boolean z14;
        boolean z15;
        Object objM87133R;
        Function1 function6;
        Object objM87133R2;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1885806750);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q2.m87153g(c12344n) : c28655q2.m87157i(c12344n) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 32 : 16;
            }
            z4 = true;
            if ((i15 & 19) != 18) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z13)) {
                i16 = 3;
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C3595n(i16);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                float f13 = 4;
                float f14 = 2;
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3411h(10 * f13, C2314t.f9131w), 8 * f14, 0.0f, 2);
                float f15 = 3 * f13;
                C33252i c33252iM105489e = AbstractC33253j.m105489e(f15);
                C22976l1 c22976l1 = AbstractC15166v0.f56891a;
                C38072d c38072d = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                function5 = function4;
                C15077m1 c15077m1M43196a = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q2, i18).getWhite10(), c38072d.m121949b(c28655q2, i18).getBrandWhite(), 0L, 0L, c28655q2, 0, 12);
                float f16 = f14 * f13;
                C22976l1 c22976l2 = new C22976l1(f15, f16, f15, f16);
                if ((i15 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i15 & 14) != 4 && ((i15 & 8) == 0 || !c28655q2.m87157i(c12344n))) {
                    z4 = false;
                }
                z15 = z14 | z4;
                objM87133R = c28655q2.m87133R();
                if (!z15 || objM87133R == c28676v0) {
                    function6 = function5;
                    objM87133R = new C3603v(0, function6, c12344n);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    function6 = function5;
                }
                AbstractC12350b.m34578a((InterfaceC4339a) objM87133R, modifierM3396r, false, null, c33252iM105489e, null, c15077m1M43196a, c22976l2, AbstractC37817c.m121344e(-1836517234, c28655q2, new Function3() { // from class: bs1.w
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC3583c0.m10847i1(c12344n, (InterfaceC22997s1) obj, (Composer) obj2, iIntValue);
                    }
                }), c28655q2, 905994288, 76);
                c28655q = c28655q2;
                function3 = function6;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0089i(c12344n, i13, function3, i14, 12);
            }
        }
        i15 |= 48;
        function2 = function1;
        z4 = true;
        if ((i15 & 19) != 18) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z13)) {
            i16 = 3;
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C3595n(i16);
                    c28655q2.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            float f17 = 4;
            float f18 = 2;
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3411h(10 * f17, C2314t.f9131w), 8 * f18, 0.0f, 2);
            float f19 = 3 * f17;
            C33252i c33252iM105489e2 = AbstractC33253j.m105489e(f19);
            C22976l1 c22976l3 = AbstractC15166v0.f56891a;
            C38072d c38072d2 = C38072d.f163053a;
            int i19 = C38072d.f163054b;
            function5 = function4;
            C15077m1 c15077m1M43196a2 = AbstractC15166v0.m43196a(c38072d2.m121949b(c28655q2, i19).getWhite10(), c38072d2.m121949b(c28655q2, i19).getBrandWhite(), 0L, 0L, c28655q2, 0, 12);
            float f110 = f18 * f17;
            C22976l1 c22976l4 = new C22976l1(f19, f110, f19, f110);
            if ((i15 & 112) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            if ((i15 & 14) != 4) {
                z4 = false;
            }
            z15 = z14 | z4;
            objM87133R = c28655q2.m87133R();
            if (z15) {
                function6 = function5;
                objM87133R = new C3603v(0, function6, c12344n);
                c28655q2.m87172p0(objM87133R);
            } else {
                function6 = function5;
                objM87133R = new C3603v(0, function6, c12344n);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC12350b.m34578a((InterfaceC4339a) objM87133R, modifierM3396r2, false, null, c33252iM105489e2, null, c15077m1M43196a2, c22976l4, AbstractC37817c.m121344e(-1836517234, c28655q2, new Function3() { // from class: bs1.w
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return AbstractC3583c0.m10847i1(c12344n, (InterfaceC22997s1) obj, (Composer) obj2, iIntValue);
                }
            }), c28655q2, 905994288, 76);
            c28655q = c28655q2;
            function3 = function6;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0089i(c12344n, i13, function3, i14, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f2 */
    public static final C23454a0 m10836f2(InterfaceC28601c1 interfaceC28601c1, Function1 function1, AbstractC11103c event) {
        AbstractC22676k.m65750j(event, "event");
        interfaceC28601c1.setValue(Boolean.valueOf(event instanceof AbstractC11103c.i));
        function1.invoke(event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public static final C23454a0 m10839g1(C9598e it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public static final C23454a0 m10840g2(C15199y3 c15199y3, InterfaceC2994c0 interfaceC2994c0, InterfaceC4339a interfaceC4339a, AbstractC35664f.a aVar) {
        if (c15199y3.m43224e()) {
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new m(aVar, null), 3);
        } else {
            interfaceC4339a.invoke();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public static final C23454a0 m10843h1(Function1 function1, C12344n c12344n) {
        function1.invoke(c12344n.getDestination());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public static final C23454a0 m10844h2(C12341k c12341k, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a, Function1 function3, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, Function1 function4, Function1 function5, InterfaceC4351m interfaceC4351m, InterfaceC4339a interfaceC4339a4, boolean z4, C24937e c24937e, InterfaceC4352n interfaceC4352n, InterfaceC4351m interfaceC4351m2, InterfaceC4351m interfaceC4351m3, Function1 function6, Function1 function7, Function1 function8, InterfaceC4339a interfaceC4339a5, InterfaceC4351m interfaceC4351m4, Function1 function9, boolean z13, int i13, Function1 function10, boolean z14, InterfaceC4339a interfaceC4339a6, long j7, InterfaceC4351m interfaceC4351m5, int i14, int i15, int i16, int i17, Composer composer, int i18) {
        m10883r1(c12341k, function1, function2, interfaceC4339a, function3, interfaceC4339a2, interfaceC4339a3, function4, function5, interfaceC4351m, interfaceC4339a4, z4, c24937e, interfaceC4352n, interfaceC4351m2, interfaceC4351m3, function6, function7, function8, interfaceC4339a5, interfaceC4351m4, function9, z13, i13, function10, z14, interfaceC4339a6, j7, interfaceC4351m5, composer, AbstractC28683x.m87244L(i14 | 1), AbstractC28683x.m87244L(i15), AbstractC28683x.m87244L(i16), i17);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public static final C23454a0 m10847i1(C12344n c12344n, InterfaceC22997s1 Button, Composer composer, int i13) throws XmlPullParserException, IOException {
        AbstractC22676k.m65750j(Button, "$this$Button");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            float f13 = 4;
            Modifier modifierM3419p = AbstractC1102d.m3419p(f13 * f13, AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 1 * 8, 0.0f, 11));
            C27430e c27430eM107874S = AbstractC34132o.m107874S(c12344n.getIcon(), c28655q, 6);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC15005f3.m43108b(c27430eM107874S, null, modifierM3419p, c38072d.m121949b(c28655q, i14).getBrandWhite(), c28655q, 432, 0);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c12344n.getTitleDisplay(), c28655q, TextResource.$stable), null, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getH5(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public static final C23454a0 m10848i2(boolean z4, AbstractC12331a abstractC12331a) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public static final C23454a0 m10851j1(C12344n c12344n, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m10835f1(c12344n, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j2 */
    public static final C23454a0 m10852j2(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k1 */
    private static final void m10855k1(C12341k c12341k, Function1 function1, Function1 function2, Composer composer, int i13) {
        C12341k c12341k2;
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1411689703);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            c12341k2 = c12341k;
            i14 = (c28655q2.m87157i(c12341k2) ? 4 : 2) | i13;
        } else {
            c12341k2 = c12341k;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(function2) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC29492c.f119853p, null, i15, 0 == true ? 1 : 0);
            TextResource textResourceM21278l = AbstractC8693b.m21278l(c12341k2.getIsSuccess().getNotes());
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l("");
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l("");
            Modifier modifierM44101d = AbstractC15676d.m44101d(C2314t.f9131w, "Journal Notes");
            boolean z4 = (i14 & 112) == 32;
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C3586e(function1, 2);
                c28655q2.m87172p0(objM87133R);
            }
            Modifier modifierM3500d = AbstractC1131a.m3500d(modifierM44101d, (Function1) objM87133R);
            boolean z13 = !c12341k2.getIsSuccess().getIsJournalEditable();
            boolean z14 = (i14 & 896) == 256;
            Object objM87133R2 = c28655q2.m87133R();
            if (z14 || objM87133R2 == c28676v0) {
                objM87133R2 = new C3586e(function2, 3);
                c28655q2.m87172p0(objM87133R2);
            }
            Function1 function3 = (Function1) objM87133R2;
            int i16 = (TextResource.C8688b.f25889c << 3) | ProfileVerifier.CompilationStatus.f6515xf2722a21;
            int i17 = TextResource.$stable;
            c28655q = c28655q2;
            AbstractC17766l1.m50964e(modifierM3500d, c8688b, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, ErrorCodes.WebsocketMethodErrors.cServerErrors, 0, false, false, z13, null, true, function3, c28655q, i16 | (i17 << 6) | (i17 << 9) | (i17 << 12), 48, 1472);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3592k(c12341k2, function1, function2, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public static final C23454a0 m10856k2(int i13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public static final C23454a0 m10859l1(Function1 function1, InterfaceC39147y coordinates) {
        AbstractC22676k.m65750j(coordinates, "coordinates");
        InterfaceC39147y interfaceC39147yMo3517V = coordinates.mo3517V();
        function1.invoke(Float.valueOf(Float.intBitsToFloat((int) ((interfaceC39147yMo3517V != null ? interfaceC39147yMo3517V.mo3537k(coordinates, 0L) : 0L) & 4294967295L))));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l2 */
    public static final C23454a0 m10860l2() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public static final C23454a0 m10863m1(Function1 function1, String it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC36877d.f(it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m2 */
    public static final C23454a0 m10864m2(long j7, String str) {
        AbstractC22676k.m65750j(str, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public static final C23454a0 m10867n1(C12341k c12341k, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m10855k1(c12341k, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: n2 */
    private static final void m10868n2(boolean z4, LocalTime localTime, InterfaceC4351m interfaceC4351m, Composer composer, int i13, int i14) {
        boolean z13;
        int i15;
        boolean z14;
        LocalTime localTime2;
        C28677v1 c28677v1M87180u;
        boolean z15;
        LocalTime localTime3;
        boolean z16;
        Object objM87133R;
        int i16;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1506892434);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            z13 = z4;
        } else if ((i13 & 6) == 0) {
            z13 = z4;
            i15 = (c28655q.m87155h(z13) ? 4 : 2) | i13;
        } else {
            z13 = z4;
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                i15 |= c28655q.m87157i(localTime) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q.m87157i(interfaceC4351m)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i15 |= i16;
            }
            if ((i15 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i17 != 0) {
                    z15 = false;
                } else {
                    z15 = z13;
                }
                if (i18 != 0) {
                    localTime3 = null;
                } else {
                    localTime3 = localTime;
                }
                z16 = (i15 & 896) == 256;
                objM87133R = c28655q.m87133R();
                if (z16 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C3600s(1, interfaceC4351m);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC23332d.m67560g(null, z15, localTime3, false, null, 0L, null, false, (InterfaceC4351m) objM87133R, c28655q, (i15 << 3) & MessageListItemViewType.GIPHY, 249);
                z13 = z15;
                localTime2 = localTime3;
            } else {
                c28655q.m87138X();
                localTime2 = localTime;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3226h(z13, localTime2, interfaceC4351m, i13, i14, 2);
            }
        }
        i15 |= 48;
        if ((i13 & 384) == 0) {
            if (c28655q.m87157i(interfaceC4351m)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i15 |= i16;
        }
        if ((i15 & 147) != 146) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            if (i17 != 0) {
                z15 = false;
            } else {
                z15 = z13;
            }
            if (i18 != 0) {
                localTime3 = null;
            } else {
                localTime3 = localTime;
            }
            if ((i15 & 896) == 256) {
            }
            objM87133R = c28655q.m87133R();
            if (z16) {
                objM87133R = new C3600s(1, interfaceC4351m);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C3600s(1, interfaceC4351m);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC23332d.m67560g(null, z15, localTime3, false, null, 0L, null, false, (InterfaceC4351m) objM87133R, c28655q, (i15 << 3) & MessageListItemViewType.GIPHY, 249);
            z13 = z15;
            localTime2 = localTime3;
        } else {
            c28655q.m87138X();
            localTime2 = localTime;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3226h(z13, localTime2, interfaceC4351m, i13, i14, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Code duplicated, block: B:44:0x009d  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: o1 */
    private static final void m10871o1(boolean z4, String str, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        boolean z13;
        int i15;
        String str2;
        boolean z14;
        C28655q c28655q;
        String str3;
        C28677v1 c28677v1M87180u;
        String str4;
        String strM92103Y;
        boolean z15;
        Object objM87133R;
        int i16;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-189035137);
        if ((i13 & 6) == 0) {
            z13 = z4;
            i15 = (c28655q2.m87155h(z13) ? 4 : 2) | i13;
        } else {
            z13 = z4;
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                str2 = str;
                i15 |= c28655q2.m87153g(str2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q2.m87157i(interfaceC4339a)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i15 |= i16;
            }
            if ((i15 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                if (i17 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                Modifier modifierM44101d = AbstractC15676d.m44101d(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), "Journal_SaveButton");
                if (str4 == null) {
                    c28655q2.m87150e0(-1274131468);
                    strM92103Y = AbstractC30060g.m92103Y(c28655q2, AbstractC29492c.f119855r);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-1274131902);
                    c28655q2.m87173q(false);
                    strM92103Y = str4;
                }
                TextResource textResourceM21278l = AbstractC8693b.m21278l(strM92103Y);
                z15 = (i15 & 896) == 256;
                objM87133R = c28655q2.m87133R();
                if (z15 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C3584d(interfaceC4339a, 1);
                    c28655q2.m87172p0(objM87133R);
                }
                c28655q = c28655q2;
                AbstractC27292z.m82343j(modifierM44101d, z13, false, null, null, null, textResourceM21278l, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R, c28655q, ((i15 << 3) & 112) | (TextResource.$stable << 18), 0, 8124);
                str3 = str4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                str3 = str2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3605x(z4, str3, interfaceC4339a, i13, i14);
            }
        }
        i15 |= 48;
        str2 = str;
        if ((i13 & 384) == 0) {
            if (c28655q2.m87157i(interfaceC4339a)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i15 |= i16;
        }
        if ((i15 & 147) != 146) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z14)) {
            if (i17 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            Modifier modifierM44101d2 = AbstractC15676d.m44101d(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), "Journal_SaveButton");
            if (str4 == null) {
                c28655q2.m87150e0(-1274131468);
                strM92103Y = AbstractC30060g.m92103Y(c28655q2, AbstractC29492c.f119855r);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-1274131902);
                c28655q2.m87173q(false);
                strM92103Y = str4;
            }
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(strM92103Y);
            if ((i15 & 896) == 256) {
            }
            objM87133R = c28655q2.m87133R();
            if (z15) {
                objM87133R = new C3584d(interfaceC4339a, 1);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C3584d(interfaceC4339a, 1);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q = c28655q2;
            AbstractC27292z.m82343j(modifierM44101d2, z13, false, null, null, null, textResourceM21278l2, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R, c28655q, ((i15 << 3) & 112) | (TextResource.$stable << 18), 0, 8124);
            str3 = str4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            str3 = str2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3605x(z4, str3, interfaceC4339a, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o2 */
    public static final C23454a0 m10872o2(InterfaceC4351m interfaceC4351m, int i13, int i14) {
        interfaceC4351m.invoke(Integer.valueOf(i13), Integer.valueOf(i14));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public static final C23454a0 m10875p1(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p2 */
    public static final C23454a0 m10876p2(boolean z4, LocalTime localTime, InterfaceC4351m interfaceC4351m, int i13, int i14, Composer composer, int i15) {
        m10868n2(z4, localTime, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public static final C23454a0 m10879q1(boolean z4, String str, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m10871o1(z4, str, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q2 */
    private static final void m10880q2(boolean z4, Function1 function1, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(729714999);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            float f13 = 4;
            Modifier modifierM7154a = AbstractC2294a.m7154a(1.0f, AbstractC1099a.m3398t(m10916z2(AbstractC22953f.m66724m(C2314t.f9131w), z4), 0.0f, f13 * f13, 0.0f, 0.0f, 13));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM7154a);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC6721d.a aVar = new AbstractC6721d.a(new TextResource.C8688b(AbstractC29492c.f119851n, null, i15, 0 == true ? 1 : 0), null, Integer.valueOf(AbstractC16319p0.m46430a().getAction().getCross()), AbstractC30060g.m92103Y(c28655q, AbstractC29492c.f119848k), Integer.valueOf(AbstractC16319p0.m46430a().getAction().getPencil()), AbstractC30060g.m92103Y(c28655q, AbstractC29492c.f119849l), null, null, false, null, null, null, null, null, null, null, 65474, null);
            boolean z13 = (i14 & 112) == 32;
            Object objM87133R = c28655q.m87133R();
            if (z13 || objM87133R == C28635l.f115821a) {
                objM87133R = new C3599r(function1, 4);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(null, aVar, null, (InterfaceC4339a) objM87133R, interfaceC4339a, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i14 << 6) & 57344), 37);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1935f(z4, function1, interfaceC4339a, i13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:127:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:128:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:132:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:134:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:135:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:139:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:140:0x0200  */
    /* JADX WARN: Code duplicated, block: B:142:0x0206  */
    /* JADX WARN: Code duplicated, block: B:144:0x020c  */
    /* JADX WARN: Code duplicated, block: B:145:0x020f  */
    /* JADX WARN: Code duplicated, block: B:149:0x0219  */
    /* JADX WARN: Code duplicated, block: B:150:0x021e  */
    /* JADX WARN: Code duplicated, block: B:152:0x0224  */
    /* JADX WARN: Code duplicated, block: B:154:0x022a  */
    /* JADX WARN: Code duplicated, block: B:155:0x022d  */
    /* JADX WARN: Code duplicated, block: B:159:0x0235 A[PHI: r34
      0x0235: PHI (r34v13 int) = (r34v1 int), (r34v4 int), (r34v5 int) binds: [B:158:0x0233, B:166:0x0249, B:165:0x0246] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:161:0x023a  */
    /* JADX WARN: Code duplicated, block: B:163:0x0240  */
    /* JADX WARN: Code duplicated, block: B:165:0x0246  */
    /* JADX WARN: Code duplicated, block: B:166:0x0249  */
    /* JADX WARN: Code duplicated, block: B:169:0x0250  */
    /* JADX WARN: Code duplicated, block: B:170:0x0259  */
    /* JADX WARN: Code duplicated, block: B:172:0x025f  */
    /* JADX WARN: Code duplicated, block: B:174:0x0269  */
    /* JADX WARN: Code duplicated, block: B:176:0x026e  */
    /* JADX WARN: Code duplicated, block: B:179:0x027a  */
    /* JADX WARN: Code duplicated, block: B:181:0x027f  */
    /* JADX WARN: Code duplicated, block: B:183:0x0285  */
    /* JADX WARN: Code duplicated, block: B:185:0x028b  */
    /* JADX WARN: Code duplicated, block: B:189:0x0294  */
    /* JADX WARN: Code duplicated, block: B:190:0x0297  */
    /* JADX WARN: Code duplicated, block: B:192:0x029d  */
    /* JADX WARN: Code duplicated, block: B:194:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:197:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:200:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:201:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:203:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:205:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:208:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:211:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:213:0x02db  */
    /* JADX WARN: Code duplicated, block: B:215:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:217:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:221:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:222:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:224:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:226:0x0302  */
    /* JADX WARN: Code duplicated, block: B:230:0x030a  */
    /* JADX WARN: Code duplicated, block: B:231:0x030f  */
    /* JADX WARN: Code duplicated, block: B:233:0x0315  */
    /* JADX WARN: Code duplicated, block: B:235:0x031b  */
    /* JADX WARN: Code duplicated, block: B:239:0x0325  */
    /* JADX WARN: Code duplicated, block: B:240:0x032a  */
    /* JADX WARN: Code duplicated, block: B:242:0x0330  */
    /* JADX WARN: Code duplicated, block: B:244:0x0336  */
    /* JADX WARN: Code duplicated, block: B:248:0x033e  */
    /* JADX WARN: Code duplicated, block: B:250:0x0345  */
    /* JADX WARN: Code duplicated, block: B:252:0x034b  */
    /* JADX WARN: Code duplicated, block: B:254:0x0351  */
    /* JADX WARN: Code duplicated, block: B:258:0x0360  */
    /* JADX WARN: Code duplicated, block: B:264:0x0370  */
    /* JADX WARN: Code duplicated, block: B:267:0x0379  */
    /* JADX WARN: Code duplicated, block: B:269:0x0382  */
    /* JADX WARN: Code duplicated, block: B:276:0x03b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:277:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:278:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:281:0x03be  */
    /* JADX WARN: Code duplicated, block: B:282:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:284:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:286:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:288:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:290:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:292:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:294:0x040b  */
    /* JADX WARN: Code duplicated, block: B:296:0x040f  */
    /* JADX WARN: Code duplicated, block: B:298:0x0415  */
    /* JADX WARN: Code duplicated, block: B:299:0x0421  */
    /* JADX WARN: Code duplicated, block: B:301:0x0427  */
    /* JADX WARN: Code duplicated, block: B:303:0x042d  */
    /* JADX WARN: Code duplicated, block: B:305:0x0433  */
    /* JADX WARN: Code duplicated, block: B:306:0x0440  */
    /* JADX WARN: Code duplicated, block: B:308:0x0446  */
    /* JADX WARN: Code duplicated, block: B:310:0x044c  */
    /* JADX WARN: Code duplicated, block: B:312:0x0452  */
    /* JADX WARN: Code duplicated, block: B:313:0x045f  */
    /* JADX WARN: Code duplicated, block: B:315:0x0465  */
    /* JADX WARN: Code duplicated, block: B:317:0x046b  */
    /* JADX WARN: Code duplicated, block: B:319:0x0471  */
    /* JADX WARN: Code duplicated, block: B:320:0x047d  */
    /* JADX WARN: Code duplicated, block: B:322:0x0483  */
    /* JADX WARN: Code duplicated, block: B:324:0x0489  */
    /* JADX WARN: Code duplicated, block: B:325:0x048b  */
    /* JADX WARN: Code duplicated, block: B:327:0x048f  */
    /* JADX WARN: Code duplicated, block: B:328:0x0492  */
    /* JADX WARN: Code duplicated, block: B:331:0x0498  */
    /* JADX WARN: Code duplicated, block: B:333:0x049e  */
    /* JADX WARN: Code duplicated, block: B:334:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:336:0x04af  */
    /* JADX WARN: Code duplicated, block: B:338:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:339:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:342:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:344:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:345:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:347:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:349:0x04db  */
    /* JADX WARN: Code duplicated, block: B:350:0x04de  */
    /* JADX WARN: Code duplicated, block: B:352:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:354:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:355:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:358:0x0517  */
    /* JADX WARN: Code duplicated, block: B:361:0x053d  */
    /* JADX WARN: Code duplicated, block: B:364:0x0554  */
    /* JADX WARN: Code duplicated, block: B:367:0x0567  */
    /* JADX WARN: Code duplicated, block: B:368:0x056c  */
    /* JADX WARN: Code duplicated, block: B:370:0x056f  */
    /* JADX WARN: Code duplicated, block: B:373:0x057b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:374:0x057d  */
    /* JADX WARN: Code duplicated, block: B:377:0x0592  */
    /* JADX WARN: Code duplicated, block: B:379:0x059b  */
    /* JADX WARN: Code duplicated, block: B:381:0x059f  */
    /* JADX WARN: Code duplicated, block: B:384:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:388:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:391:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:393:0x05dc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:396:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:399:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:402:0x0643  */
    /* JADX WARN: Code duplicated, block: B:405:0x0658  */
    /* JADX WARN: Code duplicated, block: B:408:0x0669  */
    /* JADX WARN: Code duplicated, block: B:411:0x067a  */
    /* JADX WARN: Code duplicated, block: B:414:0x068d  */
    /* JADX WARN: Code duplicated, block: B:417:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:418:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:421:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:422:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:425:0x06d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:428:0x06de  */
    /* JADX WARN: Code duplicated, block: B:431:0x070e  */
    /* JADX WARN: Code duplicated, block: B:432:0x0710  */
    /* JADX WARN: Code duplicated, block: B:435:0x071f  */
    /* JADX WARN: Code duplicated, block: B:436:0x0721  */
    /* JADX WARN: Code duplicated, block: B:439:0x072c  */
    /* JADX WARN: Code duplicated, block: B:440:0x072e  */
    /* JADX WARN: Code duplicated, block: B:443:0x0736  */
    /* JADX WARN: Code duplicated, block: B:444:0x0738  */
    /* JADX WARN: Code duplicated, block: B:447:0x0740 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:450:0x074d  */
    /* JADX WARN: Code duplicated, block: B:453:0x0783  */
    /* JADX WARN: Code duplicated, block: B:454:0x0788  */
    /* JADX WARN: Code duplicated, block: B:457:0x0795  */
    /* JADX WARN: Code duplicated, block: B:458:0x0798  */
    /* JADX WARN: Code duplicated, block: B:460:0x079b  */
    /* JADX WARN: Code duplicated, block: B:461:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:464:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:465:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:468:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:469:0x07c1  */
    /* JADX WARN: Code duplicated, block: B:472:0x07c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:475:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:478:0x07f1  */
    /* JADX WARN: Code duplicated, block: B:479:0x07f3  */
    /* JADX WARN: Code duplicated, block: B:482:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:483:0x0801  */
    /* JADX WARN: Code duplicated, block: B:486:0x0809 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:487:0x080b  */
    /* JADX WARN: Code duplicated, block: B:490:0x081a  */
    /* JADX WARN: Code duplicated, block: B:491:0x081c  */
    /* JADX WARN: Code duplicated, block: B:494:0x0828  */
    /* JADX WARN: Code duplicated, block: B:495:0x082a  */
    /* JADX WARN: Code duplicated, block: B:498:0x0832 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:499:0x0834  */
    /* JADX WARN: Code duplicated, block: B:502:0x0845  */
    /* JADX WARN: Code duplicated, block: B:503:0x0847  */
    /* JADX WARN: Code duplicated, block: B:506:0x0855  */
    /* JADX WARN: Code duplicated, block: B:507:0x0857  */
    /* JADX WARN: Code duplicated, block: B:510:0x085f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:511:0x0861  */
    /* JADX WARN: Code duplicated, block: B:514:0x088f  */
    /* JADX WARN: Code duplicated, block: B:515:0x0891  */
    /* JADX WARN: Code duplicated, block: B:518:0x089b  */
    /* JADX WARN: Code duplicated, block: B:519:0x089d  */
    /* JADX WARN: Code duplicated, block: B:522:0x08b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:525:0x08c1  */
    /* JADX WARN: Code duplicated, block: B:528:0x08f3  */
    /* JADX WARN: Code duplicated, block: B:530:0x08ff  */
    /* JADX WARN: Code duplicated, block: B:531:0x0902  */
    /* JADX WARN: Code duplicated, block: B:533:0x0905  */
    /* JADX WARN: Code duplicated, block: B:536:0x0915  */
    /* JADX WARN: Code duplicated, block: B:542:0x0928  */
    /* JADX WARN: Code duplicated, block: B:544:0x0934  */
    /* JADX WARN: Code duplicated, block: B:546:0x093b  */
    /* JADX WARN: Code duplicated, block: B:550:0x0960  */
    /* JADX WARN: Code duplicated, block: B:551:0x0965  */
    /* JADX WARN: Code duplicated, block: B:554:0x096a  */
    /* JADX WARN: Code duplicated, block: B:555:0x096d  */
    /* JADX WARN: Code duplicated, block: B:557:0x0970  */
    /* JADX WARN: Code duplicated, block: B:562:0x098a  */
    /* JADX WARN: Code duplicated, block: B:564:0x099a  */
    /* JADX WARN: Code duplicated, block: B:565:0x099f  */
    /* JADX WARN: Code duplicated, block: B:568:0x09a4  */
    /* JADX WARN: Code duplicated, block: B:569:0x09a7  */
    /* JADX WARN: Code duplicated, block: B:571:0x09aa  */
    /* JADX WARN: Code duplicated, block: B:574:0x09b5  */
    /* JADX WARN: Code duplicated, block: B:576:0x09b8  */
    /* JADX WARN: Code duplicated, block: B:577:0x09ca  */
    /* JADX WARN: Code duplicated, block: B:579:0x09e0  */
    /* JADX WARN: Code duplicated, block: B:580:0x09e3  */
    /* JADX WARN: Code duplicated, block: B:582:0x09e6  */
    /* JADX WARN: Code duplicated, block: B:583:0x09eb  */
    /* JADX WARN: Code duplicated, block: B:585:0x09ee  */
    /* JADX WARN: Code duplicated, block: B:588:0x0a02  */
    /* JADX WARN: Code duplicated, block: B:589:0x0a04  */
    /* JADX WARN: Code duplicated, block: B:592:0x0a1a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:595:0x0a23  */
    /* JADX WARN: Code duplicated, block: B:598:0x0a49  */
    /* JADX WARN: Code duplicated, block: B:601:0x0a79  */
    /* JADX WARN: Code duplicated, block: B:604:0x0a9f  */
    /* JADX WARN: Code duplicated, block: B:605:0x0aa1  */
    /* JADX WARN: Code duplicated, block: B:608:0x0ab0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:611:0x0ab6  */
    /* JADX WARN: Code duplicated, block: B:614:0x0ae9  */
    /* JADX WARN: Code duplicated, block: B:615:0x0aeb  */
    /* JADX WARN: Code duplicated, block: B:618:0x0afa  */
    /* JADX WARN: Code duplicated, block: B:619:0x0afc  */
    /* JADX WARN: Code duplicated, block: B:622:0x0b04 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:625:0x0b0c  */
    /* JADX WARN: Code duplicated, block: B:628:0x0b39  */
    /* JADX WARN: Code duplicated, block: B:629:0x0b3e  */
    /* JADX WARN: Code duplicated, block: B:632:0x0b8a  */
    /* JADX WARN: Code duplicated, block: B:633:0x0b8e  */
    /* JADX WARN: Code duplicated, block: B:636:0x0ba1  */
    /* JADX WARN: Code duplicated, block: B:638:0x0baf  */
    /* JADX WARN: Code duplicated, block: B:641:0x0bc3  */
    /* JADX WARN: Code duplicated, block: B:644:0x0bd4  */
    /* JADX WARN: Code duplicated, block: B:647:0x0c8c  */
    /* JADX WARN: Code duplicated, block: B:649:0x0cc1  */
    /* JADX WARN: Code duplicated, block: B:651:0x0cef  */
    /* JADX WARN: Code duplicated, block: B:653:0x0cf7  */
    /* JADX WARN: Code duplicated, block: B:656:0x0d21  */
    /* JADX WARN: Code duplicated, block: B:658:0x0923 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:661:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: r1 */
    public static final void m10883r1(final C12341k viewState, final Function1 onJournalQuestionClicked, final Function1 defaultToggleCallbackType, final InterfaceC4339a onRefresh, final Function1 onSavedClicked, final InterfaceC4339a onSavedFinish, final InterfaceC4339a onExitClicked, final Function1 exit, final Function1 onNeverShowDismissDialogClick, final InterfaceC4351m onDismissConfirmationDialogClicked, final InterfaceC4339a onDefaultsQuestionClicked, boolean z4, C24937e c24937e, final InterfaceC4352n onDateClicked, InterfaceC4351m interfaceC4351m, final InterfaceC4351m onCalendarOpened, final Function1 onCalendarPaged, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a, InterfaceC4351m interfaceC4351m2, Function1 function3, boolean z13, int i13, Function1 function4, boolean z14, InterfaceC4339a interfaceC4339a2, long j7, InterfaceC4351m interfaceC4351m3, Composer composer, final int i14, final int i15, final int i16, final int i17) {
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i54;
        int i55;
        int i56;
        int i57;
        int i58;
        int i59;
        int i64;
        boolean z15;
        final boolean z16;
        final C24937e c24937e2;
        final Function1 function5;
        final Function1 function6;
        final InterfaceC4339a interfaceC4339a3;
        final InterfaceC4351m interfaceC4351m4;
        final Function1 function7;
        final boolean z17;
        final int i65;
        final Function1 function8;
        final boolean z18;
        final InterfaceC4339a interfaceC4339a4;
        final long j13;
        final InterfaceC4351m interfaceC4351m5;
        C28655q c28655q;
        final InterfaceC4351m interfaceC4351m6;
        C28677v1 c28677v1M87180u;
        int i66;
        C28676v0 c28676v0;
        boolean z19;
        C24937e c24937e3;
        InterfaceC4351m interfaceC4351m7;
        final Function1 function9;
        Function1 function10;
        InterfaceC4339a interfaceC4339a5;
        InterfaceC4351m interfaceC4351m8;
        Function1 function11;
        boolean z24;
        int i67;
        Function1 function12;
        Function1 function13;
        boolean z25;
        Function1 function14;
        InterfaceC4339a interfaceC4339a6;
        long j14;
        InterfaceC4339a interfaceC4339a7;
        InterfaceC4351m interfaceC4351m9;
        boolean z26;
        InterfaceC4351m interfaceC4351m10;
        Object objM87133R;
        Object objM87133R2;
        Object objM87133R3;
        Object objM87133R4;
        Object objM87133R5;
        Object objM87133R6;
        Object objM87133R7;
        Object objM87133R8;
        Object objM87133R9;
        InterfaceC4339a interfaceC4339a8;
        Object objM87133R10;
        final InterfaceC2994c0 interfaceC2994c0;
        final InterfaceC4351m interfaceC4351m11;
        C13821r1 c13821r1M92099U;
        Object objM87133R11;
        final InterfaceC28690z0 interfaceC28690z0;
        C12337g c12337gM34447f;
        String strM34470d;
        boolean zM87153g;
        Object objM87133R12;
        InterfaceC28601c1 interfaceC28601c1;
        C12337g c12337gM34447f2;
        InterfaceC4351m interfaceC4351m12;
        boolean z27;
        C26669a c26669a;
        C38266c c38266c;
        boolean zM87153g2;
        Object objM87133R13;
        Object objM87133R14;
        InterfaceC28601c1 interfaceC28601c1M87238F;
        final C15199y3 c15199y3M3460c;
        AbstractC35664f.a aVar;
        Object objM87133R15;
        Object objM87133R16;
        C25271y c25271y;
        InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R17;
        InterfaceC28601c1 interfaceC28601c3;
        Object objM87133R18;
        final InterfaceC28601c1 interfaceC28601c4;
        Object objM87133R19;
        final InterfaceC28601c1 interfaceC28601c5;
        Object objM87133R20;
        int i68;
        boolean z28;
        boolean z29;
        Object objM87133R21;
        boolean z34;
        int i69;
        boolean z35;
        Function1 function15;
        boolean z36;
        boolean z37;
        boolean z38;
        Object objM87133R22;
        boolean z39;
        final C13821r1 c13821r1;
        final Function1 function16;
        InterfaceC4339a interfaceC4339a9;
        int i74;
        C12337g c12337gM34447f3;
        String strM34470d2;
        AbstractC12336f abstractC12336fM34453l;
        AbstractC12336f.c cVar;
        List<C16613h> listM34463a;
        boolean z44;
        boolean z45;
        boolean z46;
        Object objM87133R23;
        InterfaceC4351m interfaceC4351m13;
        boolean z47;
        boolean z48;
        boolean z49;
        Object objM87133R24;
        boolean z52;
        boolean z54;
        boolean z55;
        Object objM87133R25;
        boolean z56;
        boolean z57;
        boolean z58;
        Object objM87133R26;
        boolean z59;
        boolean z60;
        boolean zM87157i;
        Object objM87133R27;
        boolean z64;
        Function1 function17;
        AbstractC35664f.a aVar2;
        C12332b c12332bM34459r;
        AbstractC12331a abstractC12331aM34433c;
        AbstractC12331a.a aVar3;
        AbstractC35664f.a aVar4;
        Function1 function18;
        InterfaceC28601c1 interfaceC28601c6;
        boolean z65;
        boolean zM87153g3;
        Object objM87133R28;
        C12341k c12341k;
        boolean z66;
        boolean z67;
        boolean z68;
        Object objM87133R29;
        InterfaceC4351m interfaceC4351m14;
        InterfaceC4339a interfaceC4339a10;
        AiAction aiActionM34446e;
        C13404j c13404jM18524b;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C12332b c12332bM34459r2;
        TextResource textResourceM30853e;
        String strM34432b;
        C12332b c12332bM34459r3;
        AbstractC12331a abstractC12331aM34433c2;
        AbstractC12331a.a aVar5;
        C22582f c22582fM65421f;
        AbstractC12331a abstractC12331aM34433c3;
        AbstractC12331a.a aVar6;
        List<Integer> listM34419b;
        boolean z69;
        boolean zM87157i2;
        Object objM87133R30;
        Object objM87133R31;
        boolean z74;
        C22581e c22581eM34418a;
        String strM34420c;
        AbstractC12336f abstractC12336fM34453l2;
        AbstractC12336f.c cVar2;
        Iterator<T> it;
        Object next;
        C16613h c16613h;
        Long lM47165e;
        long jLongValue;
        int i75;
        int i76;
        int i77;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onJournalQuestionClicked, "onJournalQuestionClicked");
        AbstractC22676k.m65750j(defaultToggleCallbackType, "defaultToggleCallbackType");
        AbstractC22676k.m65750j(onRefresh, "onRefresh");
        AbstractC22676k.m65750j(onSavedClicked, "onSavedClicked");
        AbstractC22676k.m65750j(onSavedFinish, "onSavedFinish");
        AbstractC22676k.m65750j(onExitClicked, "onExitClicked");
        AbstractC22676k.m65750j(exit, "exit");
        AbstractC22676k.m65750j(onNeverShowDismissDialogClick, "onNeverShowDismissDialogClick");
        AbstractC22676k.m65750j(onDismissConfirmationDialogClicked, "onDismissConfirmationDialogClicked");
        AbstractC22676k.m65750j(onDefaultsQuestionClicked, "onDefaultsQuestionClicked");
        AbstractC22676k.m65750j(onDateClicked, "onDateClicked");
        AbstractC22676k.m65750j(onCalendarOpened, "onCalendarOpened");
        AbstractC22676k.m65750j(onCalendarPaged, "onCalendarPaged");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-932517134);
        if ((i14 & 6) == 0) {
            i18 = i14 | (c28655q2.m87157i(viewState) ? 4 : 2);
        } else {
            i18 = i14;
        }
        if ((i14 & 48) == 0) {
            i18 |= c28655q2.m87157i(onJournalQuestionClicked) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i18 |= c28655q2.m87157i(defaultToggleCallbackType) ? 256 : 128;
        }
        int i78 = i14 & 3072;
        int i79 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i78 == 0) {
            i18 |= c28655q2.m87157i(onRefresh) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : 1024;
        }
        int i83 = i14 & 24576;
        int i84 = DfuBaseService.ERROR_REMOTE_MASK;
        if (i83 == 0) {
            i18 |= c28655q2.m87157i(onSavedClicked) ? DfuBaseService.ERROR_CONNECTION_MASK : 8192;
        }
        int i85 = i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21;
        int i86 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        if (i85 == 0) {
            i18 |= c28655q2.m87157i(onSavedFinish) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i18 |= c28655q2.m87157i(onExitClicked) ? 1048576 : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i18 |= c28655q2.m87157i(exit) ? 8388608 : 4194304;
        }
        int i87 = i14 & 100663296;
        int i88 = AndroidSDKConstants.FLAG_MUTABLE;
        if (i87 == 0) {
            i18 |= c28655q2.m87157i(onNeverShowDismissDialogClick) ? 67108864 : 33554432;
        }
        int i89 = 805306368;
        if ((i14 & 805306368) == 0) {
            i18 |= c28655q2.m87157i(onDismissConfirmationDialogClicked) ? 536870912 : 268435456;
        }
        if ((i15 & 6) == 0) {
            i19 = i15 | (c28655q2.m87157i(onDefaultsQuestionClicked) ? 4 : 2);
        } else {
            i19 = i15;
        }
        int i94 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        if (i94 != 0) {
            i19 |= 48;
        } else if ((i15 & 48) == 0) {
            i19 |= c28655q2.m87155h(z4) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            if ((i17 & 4096) == 0) {
                if ((i15 & 512) == 0 ? c28655q2.m87153g(c24937e) : c28655q2.m87157i(c24937e)) {
                    i77 = 256;
                }
                i19 |= i77;
            }
            i77 = 128;
            i19 |= i77;
        }
        if ((i15 & 3072) == 0) {
            i19 |= c28655q2.m87157i(onDateClicked) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : 1024;
        }
        int i95 = i19;
        int i96 = i17 & DfuBaseService.ERROR_CONNECTION_MASK;
        if (i96 == 0) {
            i24 = i95;
            if ((i15 & 24576) == 0) {
                i24 |= c28655q2.m87157i(interfaceC4351m) ? DfuBaseService.ERROR_CONNECTION_MASK : 8192;
            }
            if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87157i(onCalendarOpened)) {
                    i76 = 131072;
                } else {
                    i76 = 65536;
                }
                i24 |= i76;
            }
            if ((i15 & 1572864) == 0) {
                if (c28655q2.m87157i(onCalendarPaged)) {
                    i75 = 1048576;
                } else {
                    i75 = 524288;
                }
                i24 |= i75;
            }
            i25 = i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            if (i25 != 0) {
                i24 |= 12582912;
            } else if ((i15 & 12582912) == 0) {
                if (c28655q2.m87157i(function1)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i24 |= i26;
            }
            i27 = i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION;
            if (i27 != 0) {
                i24 |= 100663296;
            } else if ((i15 & 100663296) == 0) {
                if (c28655q2.m87157i(function2)) {
                    i28 = 67108864;
                } else {
                    i28 = 33554432;
                }
                i24 |= i28;
            }
            i29 = i17 & 524288;
            if (i29 == 0) {
                i24 |= i89;
            } else if ((i15 & 805306368) == 0) {
                if (c28655q2.m87157i(interfaceC4339a)) {
                    i89 = 536870912;
                } else {
                    i89 = 268435456;
                }
                i24 |= i89;
            }
            i34 = i24;
            i35 = i17 & 1048576;
            if (i35 != 0) {
                i36 = i16;
                i37 = i36 | 6;
            } else {
                i36 = i16;
                if ((i36 & 6) == 0) {
                    i37 = i36 | (c28655q2.m87157i(interfaceC4351m2) ? 4 : 2);
                } else {
                    i37 = i36;
                }
            }
            i38 = i17 & 2097152;
            if (i38 != 0) {
                i37 |= 48;
            } else if ((i36 & 48) == 0) {
                i37 |= c28655q2.m87157i(function3) ? 32 : 16;
            }
            i39 = i37;
            i44 = i17 & 4194304;
            if (i44 != 0) {
                i46 = i39 | 384;
            } else {
                i45 = i39;
                if ((i36 & 384) != 0) {
                    i45 |= c28655q2.m87155h(z13) ? 256 : 128;
                }
                i46 = i45;
            }
            i47 = i17 & 8388608;
            if (i47 != 0) {
                i49 = i46 | 3072;
            } else {
                i48 = i46;
                if ((i36 & 3072) != 0) {
                    if (c28655q2.m87149e(i13)) {
                        i79 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i48 |= i79;
                }
                i49 = i48;
            }
            i54 = i17 & 16777216;
            if (i54 != 0) {
                i55 = i49;
                if ((i36 & 24576) == 0) {
                    if (c28655q2.m87157i(function4)) {
                        i84 = DfuBaseService.ERROR_CONNECTION_MASK;
                    }
                    i55 |= i84;
                }
                i56 = i17 & AndroidSDKConstants.FLAG_MUTABLE;
                if (i56 != 0) {
                    i55 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i36 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87155h(z14)) {
                        i86 = 131072;
                    }
                    i55 |= i86;
                }
                i57 = i17 & 67108864;
                if (i57 != 0) {
                    i55 |= 1572864;
                } else if ((i16 & 1572864) == 0) {
                    i55 |= c28655q2.m87157i(interfaceC4339a2) ? 1048576 : 524288;
                }
                i58 = i17 & 134217728;
                if (i58 != 0) {
                    i55 |= 12582912;
                } else if ((i16 & 12582912) == 0) {
                    i55 |= c28655q2.m87151f(j7) ? 8388608 : 4194304;
                }
                i59 = i17 & 268435456;
                if (i59 != 0) {
                    i55 |= 100663296;
                } else if ((i16 & 100663296) == 0) {
                    if (c28655q2.m87157i(interfaceC4351m3)) {
                        i88 = 67108864;
                    }
                    i55 |= i88;
                }
                i64 = i55;
                if ((i18 & 306783379) != 306783378 && (i34 & 306783379) == 306783378 && (38347923 & i64) == 38347922) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                if (c28655q2.m87135U(i18 & 1, z15)) {
                    c28655q2.m87140Z();
                    i66 = i14 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i66 != 0 || c28655q2.m87118C()) {
                        if (i94 != 0) {
                            z19 = false;
                        } else {
                            z19 = z4;
                        }
                        if ((i17 & 4096) != 0) {
                            c24937e3 = new C24937e(false, null, null, null, null, null, null, null, false, 510, null);
                            i34 &= -897;
                        } else {
                            c24937e3 = c24937e;
                        }
                        if (i96 != 0) {
                            objM87133R9 = c28655q2.m87133R();
                            if (objM87133R9 == c28676v0) {
                                objM87133R9 = new C26047n(22);
                                c28655q2.m87172p0(objM87133R9);
                            }
                            interfaceC4351m7 = (InterfaceC4351m) objM87133R9;
                        } else {
                            interfaceC4351m7 = interfaceC4351m;
                        }
                        if (i25 != 0) {
                            objM87133R8 = c28655q2.m87133R();
                            if (objM87133R8 == c28676v0) {
                                objM87133R8 = new C3595n(4);
                                c28655q2.m87172p0(objM87133R8);
                            }
                            function9 = (Function1) objM87133R8;
                        } else {
                            function9 = function1;
                        }
                        if (i27 != 0) {
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C3595n(5);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            function10 = (Function1) objM87133R7;
                        } else {
                            function9 = function9;
                            function10 = function2;
                        }
                        if (i29 != 0) {
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C3509a(8);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            interfaceC4339a5 = (InterfaceC4339a) objM87133R6;
                        } else {
                            function10 = function10;
                            interfaceC4339a5 = interfaceC4339a;
                        }
                        if (i35 != 0) {
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C26047n(23);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            interfaceC4351m8 = (InterfaceC4351m) objM87133R5;
                        } else {
                            interfaceC4339a5 = interfaceC4339a5;
                            interfaceC4351m8 = interfaceC4351m2;
                        }
                        if (i38 != 0) {
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C3595n(0);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            function11 = (Function1) objM87133R4;
                        } else {
                            interfaceC4351m8 = interfaceC4351m8;
                            function11 = function3;
                        }
                        if (i44 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        if (i47 != 0) {
                            i67 = 0;
                        } else {
                            i67 = i13;
                        }
                        function12 = function11;
                        if (i54 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C3595n(1);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            function13 = (Function1) objM87133R3;
                        } else {
                            i34 = i34;
                            function13 = function4;
                        }
                        if (i56 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                        function14 = function13;
                        if (i57 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C3509a(9);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                        } else {
                            z25 = z25;
                            interfaceC4339a6 = interfaceC4339a2;
                        }
                        if (i58 != 0) {
                            j14 = 0;
                        } else {
                            j14 = j7;
                        }
                        if (i59 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C26047n(24);
                                c28655q2.m87172p0(objM87133R);
                            }
                            interfaceC4339a7 = interfaceC4339a6;
                            interfaceC4351m9 = (InterfaceC4351m) objM87133R;
                        } else {
                            interfaceC4339a7 = interfaceC4339a6;
                            interfaceC4351m9 = interfaceC4351m3;
                        }
                        z26 = z24;
                        interfaceC4351m10 = interfaceC4351m8;
                    } else {
                        c28655q2.m87138X();
                        if ((i17 & 4096) != 0) {
                            i34 &= -897;
                        }
                        z19 = z4;
                        c24937e3 = c24937e;
                        interfaceC4351m7 = interfaceC4351m;
                        function9 = function1;
                        function10 = function2;
                        interfaceC4339a5 = interfaceC4339a;
                        interfaceC4351m10 = interfaceC4351m2;
                        z26 = z13;
                        i67 = i13;
                        function14 = function4;
                        z25 = z14;
                        interfaceC4339a7 = interfaceC4339a2;
                        j14 = j7;
                        interfaceC4351m9 = interfaceC4351m3;
                        i34 = i34;
                        function12 = function3;
                    }
                    c28655q2.m87175r();
                    interfaceC4339a8 = interfaceC4339a5;
                    objM87133R10 = c28655q2.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R10;
                    interfaceC4351m11 = interfaceC4351m7;
                    c13821r1M92099U = AbstractC30060g.m92099U(6, c28655q2, 0);
                    objM87133R11 = c28655q2.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = AbstractC11266d.m30468v(0.0f, c28655q2);
                    }
                    interfaceC28690z0 = (InterfaceC28690z0) objM87133R11;
                    c12337gM34447f = viewState.getIsSuccess().getDateSelectorState();
                    if (c12337gM34447f != null) {
                        strM34470d = c12337gM34447f.getCurrentDate();
                    } else {
                        strM34470d = null;
                    }
                    if (strM34470d == null) {
                        strM34470d = "";
                    }
                    zM87153g = c28655q2.m87153g(strM34470d);
                    objM87133R12 = c28655q2.m87133R();
                    if (zM87153g || objM87133R12 == c28676v0) {
                        objM87133R12 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R12);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R12;
                    c12337gM34447f2 = viewState.getIsSuccess().getDateSelectorState();
                    if (c12337gM34447f2 != null) {
                        interfaceC4351m12 = interfaceC4351m10;
                        boolean z75 = c12337gM34447f2.getIsLoading();
                        if (!viewState.getIsLoading() || viewState.getIsSuccess().getShouldRefresh() || z75) {
                            z27 = false;
                        } else {
                            z27 = true;
                        }
                        c28655q2.m87152f0(1903845737);
                        c26669a = C29155a.f118017b;
                        if (c26669a != null) {
                            throw new IllegalStateException("KoinApplication has not been started");
                        }
                        c38266c = c26669a.f106046a.f159364d;
                        c28655q2.m87152f0(-3686552);
                        zM87153g2 = c28655q2.m87153g(null) | c28655q2.m87153g(null);
                        objM87133R13 = c28655q2.m87133R();
                        if (zM87153g2 || objM87133R13 == c28676v0) {
                            objM87133R13 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null));
                            c28655q2.m87172p0(objM87133R13);
                        }
                        c28655q2.m87173q(false);
                        final InterfaceC23462h interfaceC23462h = (InterfaceC23462h) objM87133R13;
                        c28655q2.m87173q(false);
                        objM87133R14 = c28655q2.m87133R();
                        if (objM87133R14 == c28676v0) {
                            objM87133R14 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q2.m87172p0(objM87133R14);
                        }
                        final InterfaceC28601c1 interfaceC28601c7 = (InterfaceC28601c1) objM87133R14;
                        interfaceC28601c1M87238F = AbstractC28683x.m87238F(c28655q2.m87161k(AbstractC2453v1.f9577p), c28655q2);
                        c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q2, 3078, 6);
                        aVar = new AbstractC35664f.a(c15199y3M3460c);
                        objM87133R15 = c28655q2.m87133R();
                        if (objM87133R15 == c28676v0) {
                            objM87133R15 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q2.m87172p0(objM87133R15);
                        }
                        final InterfaceC28601c1 interfaceC28601c8 = (InterfaceC28601c1) objM87133R15;
                        objM87133R16 = c28655q2.m87133R();
                        c25271y = C25271y.f99162w;
                        if (objM87133R16 == c28676v0) {
                            objM87133R16 = AbstractC28683x.m87272z(c25271y);
                            c28655q2.m87172p0(objM87133R16);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R16;
                        objM87133R17 = c28655q2.m87133R();
                        if (objM87133R17 == c28676v0) {
                            objM87133R17 = AbstractC28683x.m87272z(c25271y);
                            c28655q2.m87172p0(objM87133R17);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R17;
                        objM87133R18 = c28655q2.m87133R();
                        if (objM87133R18 == c28676v0) {
                            objM87133R18 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q2.m87172p0(objM87133R18);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM87133R18;
                        objM87133R19 = c28655q2.m87133R();
                        if (objM87133R19 == c28676v0) {
                            objM87133R19 = AbstractC28683x.m87272z(Boolean.TRUE);
                            c28655q2.m87172p0(objM87133R19);
                        }
                        interfaceC28601c5 = (InterfaceC28601c1) objM87133R19;
                        objM87133R20 = c28655q2.m87133R();
                        if (objM87133R20 == c28676v0) {
                            objM87133R20 = AbstractC11895b.m32005x(0, c28655q2);
                        }
                        final InterfaceC28601c1 interfaceC28601c9 = (InterfaceC28601c1) objM87133R20;
                        C9598e c9598eM34456o = viewState.getIsSuccess().getOnSaveNavigation();
                        boolean zM87157i3 = c28655q2.m87157i(viewState) | c28655q2.m87157i(c15199y3M3460c);
                        i68 = i64 & 112;
                        if (i68 == 32) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        z29 = zM87157i3 | z28;
                        objM87133R21 = c28655q2.m87133R();
                        if (z29 || objM87133R21 == c28676v0) {
                            objM87133R21 = new b(viewState, c15199y3M3460c, function12, null);
                            c28655q2.m87172p0(objM87133R21);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R21, c9598eM34456o);
                        Object[] objArr = {strM34470d, Boolean.valueOf(z27), Integer.valueOf(i67), Boolean.valueOf(z25)};
                        boolean zM87155h = c28655q2.m87155h(z27) | c28655q2.m87153g(interfaceC28601c1);
                        if ((458752 & i64) == 131072) {
                            z34 = true;
                        } else {
                            z34 = false;
                        }
                        boolean zM87153g4 = zM87155h | z34 | c28655q2.m87153g(c13821r1M92099U);
                        i69 = 57344 & i64;
                        if (i69 == 16384) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        boolean z76 = zM87153g4 | z35;
                        function15 = function12;
                        if ((3670016 & i64) == 1048576) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        boolean z77 = z36 | z76;
                        if ((i64 & 7168) == 2048) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        z38 = z77 | z37;
                        objM87133R22 = c28655q2.m87133R();
                        if (!z38 || objM87133R22 == c28676v0) {
                            int i97 = i67;
                            Function1 function19 = function14;
                            boolean z78 = z25;
                            InterfaceC4339a interfaceC4339a11 = interfaceC4339a7;
                            objM87133R22 = new c(z27, interfaceC28601c1, z78, c13821r1M92099U, function19, interfaceC4339a11, i97, null);
                            z39 = z78;
                            c13821r1 = c13821r1M92099U;
                            function16 = function19;
                            interfaceC4339a9 = interfaceC4339a11;
                            i74 = i97;
                            c28655q2.m87172p0(objM87133R22);
                        } else {
                            c13821r1 = c13821r1M92099U;
                            i74 = i67;
                            function16 = function14;
                            z39 = z25;
                            interfaceC4339a9 = interfaceC4339a7;
                        }
                        AbstractC28683x.m87256j(objArr, (InterfaceC4351m) objM87133R22, c28655q2);
                        c12337gM34447f3 = viewState.getIsSuccess().getDateSelectorState();
                        if (c12337gM34447f3 != null) {
                            strM34470d2 = c12337gM34447f3.getCurrentDate();
                        } else {
                            strM34470d2 = null;
                        }
                        abstractC12336fM34453l = viewState.getIsSuccess().getJournalDatePillViewState();
                        if (abstractC12336fM34453l instanceof AbstractC12336f.c) {
                            cVar = (AbstractC12336f.c) abstractC12336fM34453l;
                        } else {
                            cVar = null;
                        }
                        if (cVar != null) {
                            listM34463a = cVar.m34463a();
                        } else {
                            listM34463a = null;
                        }
                        boolean zM87153g5 = c28655q2.m87153g(strM34470d2) | c28655q2.m87157i(listM34463a);
                        if ((i64 & 29360128) == 8388608) {
                            z44 = true;
                        } else {
                            z44 = false;
                        }
                        boolean z79 = zM87153g5 | z44;
                        if ((234881024 & i64) == 67108864) {
                            z45 = true;
                        } else {
                            z45 = false;
                        }
                        z46 = z79 | z45;
                        objM87133R23 = c28655q2.m87133R();
                        if (!z46 || objM87133R23 == c28676v0) {
                            InterfaceC4351m interfaceC4351m15 = interfaceC4351m9;
                            objM87133R23 = new d(strM34470d2, listM34463a, j14, interfaceC4351m15, null);
                            interfaceC4351m13 = interfaceC4351m15;
                            c28655q2.m87172p0(objM87133R23);
                        } else {
                            interfaceC4351m13 = interfaceC4351m9;
                        }
                        AbstractC28683x.m87254h(strM34470d2, listM34463a, (InterfaceC4351m) objM87133R23, c28655q2);
                        if (i69 == 16384) {
                            z47 = true;
                        } else {
                            z47 = false;
                        }
                        boolean zM87153g6 = z47 | c28655q2.m87153g(c13821r1);
                        if ((i18 & 29360128) == 8388608) {
                            z48 = true;
                        } else {
                            z48 = false;
                        }
                        z49 = zM87153g6 | z48;
                        objM87133R24 = c28655q2.m87133R();
                        if (z49 || objM87133R24 == c28676v0) {
                            final int i98 = 0;
                            objM87133R24 = new Function1() { // from class: bs1.o
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    switch (i98) {
                                        case 0:
                                            return AbstractC3583c0.m10915z1(function16, c13821r1, exit, ((Boolean) obj).booleanValue());
                                        default:
                                            return AbstractC3583c0.m10735A1(function16, c13821r1, exit, (C9598e) obj);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R24);
                        }
                        final Function1 function20 = (Function1) objM87133R24;
                        if (i69 == 16384) {
                            z52 = true;
                        } else {
                            z52 = false;
                        }
                        boolean zM87153g7 = z52 | c28655q2.m87153g(c13821r1);
                        if ((i34 & 29360128) == 8388608) {
                            z54 = true;
                        } else {
                            z54 = false;
                        }
                        z55 = zM87153g7 | z54;
                        objM87133R25 = c28655q2.m87133R();
                        if (z55 || objM87133R25 == c28676v0) {
                            final int i99 = 1;
                            objM87133R25 = new Function1() { // from class: bs1.o
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    switch (i99) {
                                        case 0:
                                            return AbstractC3583c0.m10915z1(function16, c13821r1, function9, ((Boolean) obj).booleanValue());
                                        default:
                                            return AbstractC3583c0.m10735A1(function16, c13821r1, function9, (C9598e) obj);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R25);
                        }
                        final Function1 function21 = (Function1) objM87133R25;
                        if (i69 == 16384) {
                            z56 = true;
                        } else {
                            z56 = false;
                        }
                        boolean zM87153g8 = z56 | c28655q2.m87153g(c13821r1);
                        if ((i18 & 3670016) == 1048576) {
                            z57 = true;
                        } else {
                            z57 = false;
                        }
                        z58 = zM87153g8 | z57;
                        objM87133R26 = c28655q2.m87133R();
                        if (z58 || objM87133R26 == c28676v0) {
                            objM87133R26 = new C3718c(function16, c13821r1, false, onExitClicked, 21);
                            c28655q2.m87172p0(objM87133R26);
                        }
                        final InterfaceC4339a interfaceC4339a12 = (InterfaceC4339a) objM87133R26;
                        Boolean boolValueOf = Boolean.valueOf(z26);
                        Boolean boolValueOf2 = Boolean.valueOf(viewState.getIsLoading());
                        if ((i64 & 896) == 256) {
                            z59 = true;
                        } else {
                            z59 = false;
                        }
                        boolean zM87157i4 = z59 | c28655q2.m87157i(viewState);
                        if (i68 == 32) {
                            z60 = true;
                        } else {
                            z60 = false;
                        }
                        zM87157i = zM87157i4 | z60 | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(aVar);
                        objM87133R27 = c28655q2.m87133R();
                        if (!zM87157i || objM87133R27 == c28676v0) {
                            boolean z84 = z26;
                            objM87133R27 = new e(z84, viewState, function15, interfaceC28601c5, interfaceC28601c4, interfaceC2994c0, aVar, null);
                            z64 = z84;
                            function17 = function15;
                            aVar2 = aVar;
                            c28655q2.m87172p0(objM87133R27);
                        } else {
                            z64 = z26;
                            function17 = function15;
                            aVar2 = aVar;
                        }
                        AbstractC28683x.m87254h(boolValueOf, boolValueOf2, (InterfaceC4351m) objM87133R27, c28655q2);
                        if (viewState.getIsSuccess().getShouldRefresh()) {
                            abstractC12336fM34453l2 = viewState.getIsSuccess().getJournalDatePillViewState();
                            if (abstractC12336fM34453l2 instanceof AbstractC12336f.c) {
                                cVar2 = (AbstractC12336f.c) abstractC12336fM34453l2;
                            } else {
                                cVar2 = null;
                            }
                            if (cVar2 != null) {
                                it = cVar2.m34463a().iterator();
                                do {
                                    if (it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (!((C16613h) next).getIsSelected());
                                c16613h = (C16613h) next;
                                if (c16613h != null) {
                                    String strM47166f = c16613h.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
                                    lM47165e = c16613h.getCycleId();
                                    if (lM47165e != null) {
                                        jLongValue = lM47165e.longValue();
                                    } else {
                                        jLongValue = 0;
                                    }
                                    function17.invoke(new AbstractC11103c.j(strM47166f, jLongValue, false, null, null, false, false, null, 252, null));
                                }
                            }
                        }
                        c12332bM34459r = viewState.getIsSuccess().getShouldShowBottomSheet();
                        if (c12332bM34459r != null) {
                            abstractC12331aM34433c = c12332bM34459r.getType();
                        } else {
                            abstractC12331aM34433c = null;
                        }
                        if (abstractC12331aM34433c instanceof AbstractC12331a.a) {
                            aVar3 = (AbstractC12331a.a) abstractC12331aM34433c;
                        } else {
                            aVar3 = null;
                        }
                        if (aVar3 != null && (strM34420c = aVar3.getPerformFuzzySearch()) != null) {
                            function17.invoke(new AbstractC11103c.h(strM34420c));
                        }
                        if (((Collection) interfaceC28601c2.getValue()).isEmpty()) {
                            aVar4 = aVar2;
                            function18 = function17;
                            interfaceC28601c6 = interfaceC28601c2;
                            c28655q2.m87150e0(-762104848);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(1499406798);
                            c12332bM34459r3 = viewState.getIsSuccess().getShouldShowBottomSheet();
                            if (c12332bM34459r3 != null) {
                                abstractC12331aM34433c2 = c12332bM34459r3.getType();
                            } else {
                                abstractC12331aM34433c2 = null;
                            }
                            if (abstractC12331aM34433c2 instanceof AbstractC12331a.a) {
                                aVar5 = (AbstractC12331a.a) abstractC12331aM34433c2;
                            } else {
                                aVar5 = null;
                            }
                            if (aVar5 != null || (c22581eM34418a = aVar5.getBottomSheetViewState()) == null) {
                                c22582fM65421f = null;
                            } else {
                                c22582fM65421f = c22581eM34418a.getConfirmationModal();
                            }
                            if (c22582fM65421f == null) {
                                c28655q2.m87150e0(-763029517);
                                c28655q2.m87173q(false);
                                z74 = false;
                                aVar4 = aVar2;
                                function18 = function17;
                                interfaceC28601c6 = interfaceC28601c2;
                            } else {
                                c28655q2.m87150e0(-763029516);
                                abstractC12331aM34433c3 = viewState.getIsSuccess().getShouldShowBottomSheet().getType();
                                if (abstractC12331aM34433c3 instanceof AbstractC12331a.a) {
                                    aVar6 = (AbstractC12331a.a) abstractC12331aM34433c3;
                                } else {
                                    aVar6 = null;
                                }
                                if (aVar6 != null) {
                                    listM34419b = aVar6.m34419b();
                                } else {
                                    listM34419b = null;
                                }
                                if (listM34419b == null) {
                                    listM34419b = c25271y;
                                }
                                List list = (List) interfaceC28601c2.getValue();
                                List list2 = (List) interfaceC28601c3.getValue();
                                C22582f c22582f = c22582fM65421f;
                                if (i68 == 32) {
                                    z69 = true;
                                } else {
                                    z69 = false;
                                }
                                zM87157i2 = z69 | c28655q2.m87157i(listM34419b) | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(aVar2);
                                objM87133R30 = c28655q2.m87133R();
                                if (!zM87157i2 || objM87133R30 == c28676v0) {
                                    AbstractC35664f.a aVar7 = aVar2;
                                    Function1 function22 = function17;
                                    objM87133R30 = new C1008b(listM34419b, function22, interfaceC2994c0, aVar7, interfaceC28601c4, interfaceC28601c2);
                                    function18 = function22;
                                    aVar4 = aVar7;
                                    interfaceC28601c6 = interfaceC28601c2;
                                    c28655q2.m87172p0(objM87133R30);
                                } else {
                                    aVar4 = aVar2;
                                    function18 = function17;
                                    interfaceC28601c6 = interfaceC28601c2;
                                }
                                Function1 function23 = (Function1) objM87133R30;
                                objM87133R31 = c28655q2.m87133R();
                                if (objM87133R31 == c28676v0) {
                                    objM87133R31 = new C3598q(interfaceC28601c6, 1);
                                    c28655q2.m87172p0(objM87133R31);
                                }
                                AbstractC41069c.m133347o(c22582f, list, list2, false, function23, (InterfaceC4339a) objM87133R31, c28655q2, C22582f.f88880e | ProfileVerifier.CompilationStatus.f6515xf2722a21, 8);
                                z74 = false;
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(z74);
                        }
                        EnumC15209z3 enumC15209z3M43221b = c15199y3M3460c.m43221b();
                        EnumC15209z3 enumC15209z3M43222c = c15199y3M3460c.m43222c();
                        boolean zM87157i5 = c28655q2.m87157i(c15199y3M3460c) | c28655q2.m87157i(viewState);
                        if ((i18 & 112) == 32) {
                            z65 = true;
                        } else {
                            z65 = false;
                        }
                        zM87153g3 = z65 | zM87157i5 | c28655q2.m87153g(interfaceC28601c1M87238F);
                        objM87133R28 = c28655q2.m87133R();
                        if (!zM87153g3 || objM87133R28 == c28676v0) {
                            objM87133R28 = new g(c15199y3M3460c, viewState, onJournalQuestionClicked, interfaceC28601c1M87238F, null);
                            c12341k = viewState;
                            c28655q2.m87172p0(objM87133R28);
                        } else {
                            c12341k = viewState;
                        }
                        AbstractC28683x.m87254h(enumC15209z3M43221b, enumC15209z3M43222c, (InterfaceC4351m) objM87133R28, c28655q2);
                        C15199y3 c15199y3M112950a = aVar4.getModalBottomSheetState();
                        C12332b c12332bM34459r4 = c12341k.getIsSuccess().getShouldShowBottomSheet();
                        boolean zM87157i6 = c28655q2.m87157i(aVar4);
                        if ((i64 & 14) == 4) {
                            z66 = true;
                        } else {
                            z66 = false;
                        }
                        boolean zM87157i7 = z66 | zM87157i6 | c28655q2.m87157i(c12341k);
                        if ((i34 & 1879048192) == 536870912) {
                            z67 = true;
                        } else {
                            z67 = false;
                        }
                        z68 = zM87157i7 | z67;
                        objM87133R29 = c28655q2.m87133R();
                        if (!z68 || objM87133R29 == c28676v0) {
                            InterfaceC4351m interfaceC4351m16 = interfaceC4351m12;
                            objM87133R29 = new h(aVar4, interfaceC4351m16, c12341k, interfaceC28601c4, interfaceC4339a8, null);
                            interfaceC4351m14 = interfaceC4351m16;
                            interfaceC4339a10 = interfaceC4339a8;
                            c28655q2.m87172p0(objM87133R29);
                        } else {
                            interfaceC4339a10 = interfaceC4339a8;
                            interfaceC4351m14 = interfaceC4351m12;
                        }
                        AbstractC28683x.m87254h(c15199y3M112950a, c12332bM34459r4, (InterfaceC4351m) objM87133R29, c28655q2);
                        aiActionM34446e = viewState.getIsSuccess().getCoachAiAction();
                        if (aiActionM34446e != null) {
                            c13404jM18524b = AbstractC6219a.m18524b(aiActionM34446e, true);
                        } else {
                            c13404jM18524b = null;
                        }
                        Modifier modifierM34129b = AbstractC12250f.m34129b(AbstractC1102d.m3407d(1.0f, m10912y2(C2314t.f9131w, viewState.getIsIntraday())), c13404jM18524b, false, c28655q2, C13404j.f46947x << 3, 2);
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM34129b);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                        c12332bM34459r2 = viewState.getIsSuccess().getShouldShowBottomSheet();
                        if (c12332bM34459r2 != null || (strM34432b = c12332bM34459r2.getTitle()) == null) {
                            textResourceM30853e = null;
                        } else {
                            textResourceM30853e = AbstractC11478a.m30853e(Locale.ROOT, strM34432b, "toUpperCase(...)");
                        }
                        Function1 function24 = function10;
                        final AbstractC35664f.a aVar8 = aVar4;
                        final Function1 function25 = function16;
                        final C13821r1 c13821r2 = c13821r1;
                        final Function1 function26 = function18;
                        Function1 function27 = function9;
                        AbstractC35660d.m112871m(null, new C35666g(textResourceM30853e, null, null, null, null, 0.0f, 0.0f, 126, null), aVar8, null, null, null, null, AbstractC37817c.m121344e(-1468159270, c28655q2, new C3602u(viewState, onJournalQuestionClicked, interfaceC2994c0, c15199y3M3460c, aVar4, function18, function24, interfaceC28601c6, interfaceC28601c3, interfaceC28601c4, interfaceC28601c5)), false, null, null, null, false, null, AbstractC37817c.m121344e(1150183326, c28655q2, new InterfaceC4351m() { // from class: bs1.y
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC3583c0.m10773M1(viewState, onSavedFinish, function20, onRefresh, onSavedClicked, function26, interfaceC28601c8, c15199y3M3460c, interfaceC2994c0, aVar8, onExitClicked, interfaceC4339a12, interfaceC28601c5, interfaceC28601c4, onNeverShowDismissDialogClick, onDismissConfirmationDialogClicked, function25, c13821r2, interfaceC28601c9, function21, interfaceC4351m11, onCalendarOpened, onDateClicked, defaultToggleCallbackType, onDefaultsQuestionClicked, interfaceC28601c7, onJournalQuestionClicked, interfaceC23462h, interfaceC28690z0, onCalendarPaged, (Composer) obj, iIntValue);
                            }
                        }), c28655q2, (C35666g.f151591h << 3) | 12582912 | (AbstractC35664f.a.f151587c << 6), 24576, 16249);
                        if (z19) {
                            c28655q2.m87150e0(-352673422);
                            AbstractC24936d.m73080z("INTRADAY_JOURNAL_ONBOARDING", c24937e3, false, null, null, null, null, c28655q2, (C24937e.f97642j << 3) | ((i34 >> 3) & 112), 124);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-352485066);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(true);
                        function8 = function25;
                        function7 = function26;
                        c28655q = c28655q2;
                        z16 = z19;
                        z17 = z64;
                        j13 = j14;
                        interfaceC4339a3 = interfaceC4339a10;
                        function5 = function27;
                        interfaceC4351m5 = interfaceC4351m13;
                        interfaceC4351m4 = interfaceC4351m14;
                        function6 = function24;
                        c24937e2 = c24937e3;
                        i65 = i74;
                        z18 = z39;
                        interfaceC4339a4 = interfaceC4339a9;
                        interfaceC4351m6 = interfaceC4351m11;
                    } else {
                        interfaceC4351m12 = interfaceC4351m10;
                    }
                    if (viewState.getIsLoading()) {
                        z27 = false;
                    } else {
                        z27 = false;
                    }
                    c28655q2.m87152f0(1903845737);
                    c26669a = C29155a.f118017b;
                    if (c26669a != null) {
                        throw new IllegalStateException("KoinApplication has not been started");
                    }
                    c38266c = c26669a.f106046a.f159364d;
                    c28655q2.m87152f0(-3686552);
                    zM87153g2 = c28655q2.m87153g(null) | c28655q2.m87153g(null);
                    objM87133R13 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R13 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null));
                        c28655q2.m87172p0(objM87133R13);
                    } else {
                        objM87133R13 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null));
                        c28655q2.m87172p0(objM87133R13);
                    }
                    c28655q2.m87173q(false);
                    final InterfaceC23462h interfaceC23462h2 = (InterfaceC23462h) objM87133R13;
                    c28655q2.m87173q(false);
                    objM87133R14 = c28655q2.m87133R();
                    if (objM87133R14 == c28676v0) {
                        objM87133R14 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R14);
                    }
                    final InterfaceC28601c1 interfaceC28601c10 = (InterfaceC28601c1) objM87133R14;
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(c28655q2.m87161k(AbstractC2453v1.f9577p), c28655q2);
                    c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q2, 3078, 6);
                    aVar = new AbstractC35664f.a(c15199y3M3460c);
                    objM87133R15 = c28655q2.m87133R();
                    if (objM87133R15 == c28676v0) {
                        objM87133R15 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R15);
                    }
                    final InterfaceC28601c1 interfaceC28601c11 = (InterfaceC28601c1) objM87133R15;
                    objM87133R16 = c28655q2.m87133R();
                    c25271y = C25271y.f99162w;
                    if (objM87133R16 == c28676v0) {
                        objM87133R16 = AbstractC28683x.m87272z(c25271y);
                        c28655q2.m87172p0(objM87133R16);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R16;
                    objM87133R17 = c28655q2.m87133R();
                    if (objM87133R17 == c28676v0) {
                        objM87133R17 = AbstractC28683x.m87272z(c25271y);
                        c28655q2.m87172p0(objM87133R17);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R17;
                    objM87133R18 = c28655q2.m87133R();
                    if (objM87133R18 == c28676v0) {
                        objM87133R18 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R18);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R18;
                    objM87133R19 = c28655q2.m87133R();
                    if (objM87133R19 == c28676v0) {
                        objM87133R19 = AbstractC28683x.m87272z(Boolean.TRUE);
                        c28655q2.m87172p0(objM87133R19);
                    }
                    interfaceC28601c5 = (InterfaceC28601c1) objM87133R19;
                    objM87133R20 = c28655q2.m87133R();
                    if (objM87133R20 == c28676v0) {
                        objM87133R20 = AbstractC11895b.m32005x(0, c28655q2);
                    }
                    final InterfaceC28601c1 interfaceC28601c12 = (InterfaceC28601c1) objM87133R20;
                    C9598e c9598eM34456o2 = viewState.getIsSuccess().getOnSaveNavigation();
                    boolean zM87157i8 = c28655q2.m87157i(viewState) | c28655q2.m87157i(c15199y3M3460c);
                    i68 = i64 & 112;
                    if (i68 == 32) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = zM87157i8 | z28;
                    objM87133R21 = c28655q2.m87133R();
                    if (z29) {
                        objM87133R21 = new b(viewState, c15199y3M3460c, function12, null);
                        c28655q2.m87172p0(objM87133R21);
                    } else {
                        objM87133R21 = new b(viewState, c15199y3M3460c, function12, null);
                        c28655q2.m87172p0(objM87133R21);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R21, c9598eM34456o2);
                    Object[] objArr2 = {strM34470d, Boolean.valueOf(z27), Integer.valueOf(i67), Boolean.valueOf(z25)};
                    boolean zM87155h2 = c28655q2.m87155h(z27) | c28655q2.m87153g(interfaceC28601c1);
                    if ((458752 & i64) == 131072) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    boolean zM87153g9 = zM87155h2 | z34 | c28655q2.m87153g(c13821r1M92099U);
                    i69 = 57344 & i64;
                    if (i69 == 16384) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    boolean z710 = zM87153g9 | z35;
                    function15 = function12;
                    if ((3670016 & i64) == 1048576) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    boolean z711 = z36 | z710;
                    if ((i64 & 7168) == 2048) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    z38 = z711 | z37;
                    objM87133R22 = c28655q2.m87133R();
                    if (z38) {
                        int i910 = i67;
                        Function1 function110 = function14;
                        boolean z712 = z25;
                        InterfaceC4339a interfaceC4339a13 = interfaceC4339a7;
                        objM87133R22 = new c(z27, interfaceC28601c1, z712, c13821r1M92099U, function110, interfaceC4339a13, i910, null);
                        z39 = z712;
                        c13821r1 = c13821r1M92099U;
                        function16 = function110;
                        interfaceC4339a9 = interfaceC4339a13;
                        i74 = i910;
                        c28655q2.m87172p0(objM87133R22);
                    } else {
                        int i911 = i67;
                        Function1 function111 = function14;
                        boolean z713 = z25;
                        InterfaceC4339a interfaceC4339a14 = interfaceC4339a7;
                        objM87133R22 = new c(z27, interfaceC28601c1, z713, c13821r1M92099U, function111, interfaceC4339a14, i911, null);
                        z39 = z713;
                        c13821r1 = c13821r1M92099U;
                        function16 = function111;
                        interfaceC4339a9 = interfaceC4339a14;
                        i74 = i911;
                        c28655q2.m87172p0(objM87133R22);
                    }
                    AbstractC28683x.m87256j(objArr2, (InterfaceC4351m) objM87133R22, c28655q2);
                    c12337gM34447f3 = viewState.getIsSuccess().getDateSelectorState();
                    if (c12337gM34447f3 != null) {
                        strM34470d2 = c12337gM34447f3.getCurrentDate();
                    } else {
                        strM34470d2 = null;
                    }
                    abstractC12336fM34453l = viewState.getIsSuccess().getJournalDatePillViewState();
                    if (abstractC12336fM34453l instanceof AbstractC12336f.c) {
                        cVar = (AbstractC12336f.c) abstractC12336fM34453l;
                    } else {
                        cVar = null;
                    }
                    if (cVar != null) {
                        listM34463a = cVar.m34463a();
                    } else {
                        listM34463a = null;
                    }
                    boolean zM87153g10 = c28655q2.m87153g(strM34470d2) | c28655q2.m87157i(listM34463a);
                    if ((i64 & 29360128) == 8388608) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    boolean z714 = zM87153g10 | z44;
                    if ((234881024 & i64) == 67108864) {
                        z45 = true;
                    } else {
                        z45 = false;
                    }
                    z46 = z714 | z45;
                    objM87133R23 = c28655q2.m87133R();
                    if (z46) {
                        InterfaceC4351m interfaceC4351m17 = interfaceC4351m9;
                        objM87133R23 = new d(strM34470d2, listM34463a, j14, interfaceC4351m17, null);
                        interfaceC4351m13 = interfaceC4351m17;
                        c28655q2.m87172p0(objM87133R23);
                    } else {
                        InterfaceC4351m interfaceC4351m18 = interfaceC4351m9;
                        objM87133R23 = new d(strM34470d2, listM34463a, j14, interfaceC4351m18, null);
                        interfaceC4351m13 = interfaceC4351m18;
                        c28655q2.m87172p0(objM87133R23);
                    }
                    AbstractC28683x.m87254h(strM34470d2, listM34463a, (InterfaceC4351m) objM87133R23, c28655q2);
                    if (i69 == 16384) {
                        z47 = true;
                    } else {
                        z47 = false;
                    }
                    boolean zM87153g11 = z47 | c28655q2.m87153g(c13821r1);
                    if ((i18 & 29360128) == 8388608) {
                        z48 = true;
                    } else {
                        z48 = false;
                    }
                    z49 = zM87153g11 | z48;
                    objM87133R24 = c28655q2.m87133R();
                    if (z49) {
                        final int i912 = 0;
                        objM87133R24 = new Function1() { // from class: bs1.o
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i912) {
                                    case 0:
                                        return AbstractC3583c0.m10915z1(function16, c13821r1, exit, ((Boolean) obj).booleanValue());
                                    default:
                                        return AbstractC3583c0.m10735A1(function16, c13821r1, exit, (C9598e) obj);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R24);
                    } else {
                        final int i913 = 0;
                        objM87133R24 = new Function1() { // from class: bs1.o
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i913) {
                                    case 0:
                                        return AbstractC3583c0.m10915z1(function16, c13821r1, exit, ((Boolean) obj).booleanValue());
                                    default:
                                        return AbstractC3583c0.m10735A1(function16, c13821r1, exit, (C9598e) obj);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R24);
                    }
                    final Function1 function28 = (Function1) objM87133R24;
                    if (i69 == 16384) {
                        z52 = true;
                    } else {
                        z52 = false;
                    }
                    boolean zM87153g12 = z52 | c28655q2.m87153g(c13821r1);
                    if ((i34 & 29360128) == 8388608) {
                        z54 = true;
                    } else {
                        z54 = false;
                    }
                    z55 = zM87153g12 | z54;
                    objM87133R25 = c28655q2.m87133R();
                    if (z55) {
                        final int i914 = 1;
                        objM87133R25 = new Function1() { // from class: bs1.o
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i914) {
                                    case 0:
                                        return AbstractC3583c0.m10915z1(function16, c13821r1, function9, ((Boolean) obj).booleanValue());
                                    default:
                                        return AbstractC3583c0.m10735A1(function16, c13821r1, function9, (C9598e) obj);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R25);
                    } else {
                        final int i915 = 1;
                        objM87133R25 = new Function1() { // from class: bs1.o
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i915) {
                                    case 0:
                                        return AbstractC3583c0.m10915z1(function16, c13821r1, function9, ((Boolean) obj).booleanValue());
                                    default:
                                        return AbstractC3583c0.m10735A1(function16, c13821r1, function9, (C9598e) obj);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R25);
                    }
                    final Function1 function29 = (Function1) objM87133R25;
                    if (i69 == 16384) {
                        z56 = true;
                    } else {
                        z56 = false;
                    }
                    boolean zM87153g13 = z56 | c28655q2.m87153g(c13821r1);
                    if ((i18 & 3670016) == 1048576) {
                        z57 = true;
                    } else {
                        z57 = false;
                    }
                    z58 = zM87153g13 | z57;
                    objM87133R26 = c28655q2.m87133R();
                    if (z58) {
                        objM87133R26 = new C3718c(function16, c13821r1, false, onExitClicked, 21);
                        c28655q2.m87172p0(objM87133R26);
                    } else {
                        objM87133R26 = new C3718c(function16, c13821r1, false, onExitClicked, 21);
                        c28655q2.m87172p0(objM87133R26);
                    }
                    final InterfaceC4339a interfaceC4339a15 = (InterfaceC4339a) objM87133R26;
                    Boolean boolValueOf3 = Boolean.valueOf(z26);
                    Boolean boolValueOf4 = Boolean.valueOf(viewState.getIsLoading());
                    if ((i64 & 896) == 256) {
                        z59 = true;
                    } else {
                        z59 = false;
                    }
                    boolean zM87157i9 = z59 | c28655q2.m87157i(viewState);
                    if (i68 == 32) {
                        z60 = true;
                    } else {
                        z60 = false;
                    }
                    zM87157i = zM87157i9 | z60 | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(aVar);
                    objM87133R27 = c28655q2.m87133R();
                    if (zM87157i) {
                        boolean z85 = z26;
                        objM87133R27 = new e(z85, viewState, function15, interfaceC28601c5, interfaceC28601c4, interfaceC2994c0, aVar, null);
                        z64 = z85;
                        function17 = function15;
                        aVar2 = aVar;
                        c28655q2.m87172p0(objM87133R27);
                    } else {
                        boolean z86 = z26;
                        objM87133R27 = new e(z86, viewState, function15, interfaceC28601c5, interfaceC28601c4, interfaceC2994c0, aVar, null);
                        z64 = z86;
                        function17 = function15;
                        aVar2 = aVar;
                        c28655q2.m87172p0(objM87133R27);
                    }
                    AbstractC28683x.m87254h(boolValueOf3, boolValueOf4, (InterfaceC4351m) objM87133R27, c28655q2);
                    if (viewState.getIsSuccess().getShouldRefresh()) {
                        abstractC12336fM34453l2 = viewState.getIsSuccess().getJournalDatePillViewState();
                        if (abstractC12336fM34453l2 instanceof AbstractC12336f.c) {
                            cVar2 = (AbstractC12336f.c) abstractC12336fM34453l2;
                        } else {
                            cVar2 = null;
                        }
                        if (cVar2 != null) {
                            it = cVar2.m34463a().iterator();
                            do {
                                if (it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!((C16613h) next).getIsSelected());
                            c16613h = (C16613h) next;
                            if (c16613h != null) {
                                String strM47166f2 = c16613h.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
                                lM47165e = c16613h.getCycleId();
                                if (lM47165e != null) {
                                    jLongValue = lM47165e.longValue();
                                } else {
                                    jLongValue = 0;
                                }
                                function17.invoke(new AbstractC11103c.j(strM47166f2, jLongValue, false, null, null, false, false, null, 252, null));
                            }
                        }
                    }
                    c12332bM34459r = viewState.getIsSuccess().getShouldShowBottomSheet();
                    if (c12332bM34459r != null) {
                        abstractC12331aM34433c = c12332bM34459r.getType();
                    } else {
                        abstractC12331aM34433c = null;
                    }
                    if (abstractC12331aM34433c instanceof AbstractC12331a.a) {
                        aVar3 = (AbstractC12331a.a) abstractC12331aM34433c;
                    } else {
                        aVar3 = null;
                    }
                    if (aVar3 != null) {
                        function17.invoke(new AbstractC11103c.h(strM34420c));
                    }
                    if (((Collection) interfaceC28601c2.getValue()).isEmpty()) {
                        c28655q2.m87150e0(1499406798);
                        c12332bM34459r3 = viewState.getIsSuccess().getShouldShowBottomSheet();
                        if (c12332bM34459r3 != null) {
                            abstractC12331aM34433c2 = c12332bM34459r3.getType();
                        } else {
                            abstractC12331aM34433c2 = null;
                        }
                        if (abstractC12331aM34433c2 instanceof AbstractC12331a.a) {
                            aVar5 = (AbstractC12331a.a) abstractC12331aM34433c2;
                        } else {
                            aVar5 = null;
                        }
                        if (aVar5 != null) {
                            c22582fM65421f = null;
                        } else {
                            c22582fM65421f = null;
                        }
                        if (c22582fM65421f == null) {
                            c28655q2.m87150e0(-763029517);
                            c28655q2.m87173q(false);
                            z74 = false;
                            aVar4 = aVar2;
                            function18 = function17;
                            interfaceC28601c6 = interfaceC28601c2;
                        } else {
                            c28655q2.m87150e0(-763029516);
                            abstractC12331aM34433c3 = viewState.getIsSuccess().getShouldShowBottomSheet().getType();
                            if (abstractC12331aM34433c3 instanceof AbstractC12331a.a) {
                                aVar6 = (AbstractC12331a.a) abstractC12331aM34433c3;
                            } else {
                                aVar6 = null;
                            }
                            if (aVar6 != null) {
                                listM34419b = aVar6.m34419b();
                            } else {
                                listM34419b = null;
                            }
                            if (listM34419b == null) {
                                listM34419b = c25271y;
                            }
                            List list3 = (List) interfaceC28601c2.getValue();
                            List list4 = (List) interfaceC28601c3.getValue();
                            C22582f c22582f2 = c22582fM65421f;
                            if (i68 == 32) {
                                z69 = true;
                            } else {
                                z69 = false;
                            }
                            zM87157i2 = z69 | c28655q2.m87157i(listM34419b) | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(aVar2);
                            objM87133R30 = c28655q2.m87133R();
                            if (zM87157i2) {
                                AbstractC35664f.a aVar9 = aVar2;
                                Function1 function210 = function17;
                                objM87133R30 = new C1008b(listM34419b, function210, interfaceC2994c0, aVar9, interfaceC28601c4, interfaceC28601c2);
                                function18 = function210;
                                aVar4 = aVar9;
                                interfaceC28601c6 = interfaceC28601c2;
                                c28655q2.m87172p0(objM87133R30);
                            } else {
                                AbstractC35664f.a aVar10 = aVar2;
                                Function1 function211 = function17;
                                objM87133R30 = new C1008b(listM34419b, function211, interfaceC2994c0, aVar10, interfaceC28601c4, interfaceC28601c2);
                                function18 = function211;
                                aVar4 = aVar10;
                                interfaceC28601c6 = interfaceC28601c2;
                                c28655q2.m87172p0(objM87133R30);
                            }
                            Function1 function212 = (Function1) objM87133R30;
                            objM87133R31 = c28655q2.m87133R();
                            if (objM87133R31 == c28676v0) {
                                objM87133R31 = new C3598q(interfaceC28601c6, 1);
                                c28655q2.m87172p0(objM87133R31);
                            }
                            AbstractC41069c.m133347o(c22582f2, list3, list4, false, function212, (InterfaceC4339a) objM87133R31, c28655q2, C22582f.f88880e | ProfileVerifier.CompilationStatus.f6515xf2722a21, 8);
                            z74 = false;
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z74);
                    } else {
                        aVar4 = aVar2;
                        function18 = function17;
                        interfaceC28601c6 = interfaceC28601c2;
                        c28655q2.m87150e0(-762104848);
                        c28655q2.m87173q(false);
                    }
                    EnumC15209z3 enumC15209z3M43221b2 = c15199y3M3460c.m43221b();
                    EnumC15209z3 enumC15209z3M43222c2 = c15199y3M3460c.m43222c();
                    boolean zM87157i10 = c28655q2.m87157i(c15199y3M3460c) | c28655q2.m87157i(viewState);
                    if ((i18 & 112) == 32) {
                        z65 = true;
                    } else {
                        z65 = false;
                    }
                    zM87153g3 = z65 | zM87157i10 | c28655q2.m87153g(interfaceC28601c1M87238F);
                    objM87133R28 = c28655q2.m87133R();
                    if (zM87153g3) {
                        objM87133R28 = new g(c15199y3M3460c, viewState, onJournalQuestionClicked, interfaceC28601c1M87238F, null);
                        c12341k = viewState;
                        c28655q2.m87172p0(objM87133R28);
                    } else {
                        objM87133R28 = new g(c15199y3M3460c, viewState, onJournalQuestionClicked, interfaceC28601c1M87238F, null);
                        c12341k = viewState;
                        c28655q2.m87172p0(objM87133R28);
                    }
                    AbstractC28683x.m87254h(enumC15209z3M43221b2, enumC15209z3M43222c2, (InterfaceC4351m) objM87133R28, c28655q2);
                    C15199y3 c15199y3M112950a2 = aVar4.getModalBottomSheetState();
                    C12332b c12332bM34459r5 = c12341k.getIsSuccess().getShouldShowBottomSheet();
                    boolean zM87157i11 = c28655q2.m87157i(aVar4);
                    if ((i64 & 14) == 4) {
                        z66 = true;
                    } else {
                        z66 = false;
                    }
                    boolean zM87157i12 = z66 | zM87157i11 | c28655q2.m87157i(c12341k);
                    if ((i34 & 1879048192) == 536870912) {
                        z67 = true;
                    } else {
                        z67 = false;
                    }
                    z68 = zM87157i12 | z67;
                    objM87133R29 = c28655q2.m87133R();
                    if (z68) {
                        InterfaceC4351m interfaceC4351m19 = interfaceC4351m12;
                        objM87133R29 = new h(aVar4, interfaceC4351m19, c12341k, interfaceC28601c4, interfaceC4339a8, null);
                        interfaceC4351m14 = interfaceC4351m19;
                        interfaceC4339a10 = interfaceC4339a8;
                        c28655q2.m87172p0(objM87133R29);
                    } else {
                        InterfaceC4351m interfaceC4351m110 = interfaceC4351m12;
                        objM87133R29 = new h(aVar4, interfaceC4351m110, c12341k, interfaceC28601c4, interfaceC4339a8, null);
                        interfaceC4351m14 = interfaceC4351m110;
                        interfaceC4339a10 = interfaceC4339a8;
                        c28655q2.m87172p0(objM87133R29);
                    }
                    AbstractC28683x.m87254h(c15199y3M112950a2, c12332bM34459r5, (InterfaceC4351m) objM87133R29, c28655q2);
                    aiActionM34446e = viewState.getIsSuccess().getCoachAiAction();
                    if (aiActionM34446e != null) {
                        c13404jM18524b = AbstractC6219a.m18524b(aiActionM34446e, true);
                    } else {
                        c13404jM18524b = null;
                    }
                    Modifier modifierM34129b2 = AbstractC12250f.m34129b(AbstractC1102d.m3407d(1.0f, m10912y2(C2314t.f9131w, viewState.getIsIntraday())), c13404jM18524b, false, c28655q2, C13404j.f46947x << 3, 2);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM34129b2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                    c12332bM34459r2 = viewState.getIsSuccess().getShouldShowBottomSheet();
                    if (c12332bM34459r2 != null) {
                        textResourceM30853e = null;
                    } else {
                        textResourceM30853e = null;
                    }
                    Function1 function213 = function10;
                    final AbstractC35664f.a aVar11 = aVar4;
                    final Function1 function214 = function16;
                    final C13821r1 c13821r3 = c13821r1;
                    final Function1 function215 = function18;
                    Function1 function216 = function9;
                    AbstractC35660d.m112871m(null, new C35666g(textResourceM30853e, null, null, null, null, 0.0f, 0.0f, 126, null), aVar11, null, null, null, null, AbstractC37817c.m121344e(-1468159270, c28655q2, new C3602u(viewState, onJournalQuestionClicked, interfaceC2994c0, c15199y3M3460c, aVar4, function18, function213, interfaceC28601c6, interfaceC28601c3, interfaceC28601c4, interfaceC28601c5)), false, null, null, null, false, null, AbstractC37817c.m121344e(1150183326, c28655q2, new InterfaceC4351m() { // from class: bs1.y
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC3583c0.m10773M1(viewState, onSavedFinish, function28, onRefresh, onSavedClicked, function215, interfaceC28601c11, c15199y3M3460c, interfaceC2994c0, aVar11, onExitClicked, interfaceC4339a15, interfaceC28601c5, interfaceC28601c4, onNeverShowDismissDialogClick, onDismissConfirmationDialogClicked, function214, c13821r3, interfaceC28601c12, function29, interfaceC4351m11, onCalendarOpened, onDateClicked, defaultToggleCallbackType, onDefaultsQuestionClicked, interfaceC28601c10, onJournalQuestionClicked, interfaceC23462h2, interfaceC28690z0, onCalendarPaged, (Composer) obj, iIntValue);
                        }
                    }), c28655q2, (C35666g.f151591h << 3) | 12582912 | (AbstractC35664f.a.f151587c << 6), 24576, 16249);
                    if (z19) {
                        c28655q2.m87150e0(-352673422);
                        AbstractC24936d.m73080z("INTRADAY_JOURNAL_ONBOARDING", c24937e3, false, null, null, null, null, c28655q2, (C24937e.f97642j << 3) | ((i34 >> 3) & 112), 124);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-352485066);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    function8 = function214;
                    function7 = function215;
                    c28655q = c28655q2;
                    z16 = z19;
                    z17 = z64;
                    j13 = j14;
                    interfaceC4339a3 = interfaceC4339a10;
                    function5 = function216;
                    interfaceC4351m5 = interfaceC4351m13;
                    interfaceC4351m4 = interfaceC4351m14;
                    function6 = function213;
                    c24937e2 = c24937e3;
                    i65 = i74;
                    z18 = z39;
                    interfaceC4339a4 = interfaceC4339a9;
                    interfaceC4351m6 = interfaceC4351m11;
                } else {
                    c28655q2.m87138X();
                    z16 = z4;
                    c24937e2 = c24937e;
                    function5 = function1;
                    function6 = function2;
                    interfaceC4339a3 = interfaceC4339a;
                    interfaceC4351m4 = interfaceC4351m2;
                    function7 = function3;
                    z17 = z13;
                    i65 = i13;
                    function8 = function4;
                    z18 = z14;
                    interfaceC4339a4 = interfaceC4339a2;
                    j13 = j7;
                    interfaceC4351m5 = interfaceC4351m3;
                    c28655q = c28655q2;
                    interfaceC4351m6 = interfaceC4351m;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs1.b0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC3583c0.m10844h2(viewState, onJournalQuestionClicked, defaultToggleCallbackType, onRefresh, onSavedClicked, onSavedFinish, onExitClicked, exit, onNeverShowDismissDialogClick, onDismissConfirmationDialogClicked, onDefaultsQuestionClicked, z16, c24937e2, onDateClicked, interfaceC4351m6, onCalendarOpened, onCalendarPaged, function5, function6, interfaceC4339a3, interfaceC4351m4, function7, z17, i65, function8, z18, interfaceC4339a4, j13, interfaceC4351m5, i14, i15, i16, i17, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i55 = i49 | 24576;
            i56 = i17 & AndroidSDKConstants.FLAG_MUTABLE;
            if (i56 != 0) {
                i55 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i36 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87155h(z14)) {
                    i86 = 131072;
                }
                i55 |= i86;
            }
            i57 = i17 & 67108864;
            if (i57 != 0) {
                i55 |= 1572864;
            } else if ((i16 & 1572864) == 0) {
                i55 |= c28655q2.m87157i(interfaceC4339a2) ? 1048576 : 524288;
            }
            i58 = i17 & 134217728;
            if (i58 != 0) {
                i55 |= 12582912;
            } else if ((i16 & 12582912) == 0) {
                i55 |= c28655q2.m87151f(j7) ? 8388608 : 4194304;
            }
            i59 = i17 & 268435456;
            if (i59 != 0) {
                i55 |= 100663296;
            } else if ((i16 & 100663296) == 0) {
                if (c28655q2.m87157i(interfaceC4351m3)) {
                    i88 = 67108864;
                }
                i55 |= i88;
            }
            i64 = i55;
            if ((i18 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (c28655q2.m87135U(i18 & 1, z15)) {
                c28655q2.m87140Z();
                i66 = i14 & 1;
                c28676v0 = C28635l.f115821a;
                if (i66 != 0) {
                    if (i94 != 0) {
                        z19 = false;
                    } else {
                        z19 = z4;
                    }
                    if ((i17 & 4096) != 0) {
                        c24937e3 = new C24937e(false, null, null, null, null, null, null, null, false, 510, null);
                        i34 &= -897;
                    } else {
                        c24937e3 = c24937e;
                    }
                    if (i96 != 0) {
                        objM87133R9 = c28655q2.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C26047n(22);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        interfaceC4351m7 = (InterfaceC4351m) objM87133R9;
                    } else {
                        interfaceC4351m7 = interfaceC4351m;
                    }
                    if (i25 != 0) {
                        objM87133R8 = c28655q2.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C3595n(4);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        function9 = (Function1) objM87133R8;
                    } else {
                        function9 = function1;
                    }
                    if (i27 != 0) {
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C3595n(5);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        function10 = (Function1) objM87133R7;
                    } else {
                        function9 = function9;
                        function10 = function2;
                    }
                    if (i29 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C3509a(8);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC4339a5 = (InterfaceC4339a) objM87133R6;
                    } else {
                        function10 = function10;
                        interfaceC4339a5 = interfaceC4339a;
                    }
                    if (i35 != 0) {
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C26047n(23);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC4351m8 = (InterfaceC4351m) objM87133R5;
                    } else {
                        interfaceC4339a5 = interfaceC4339a5;
                        interfaceC4351m8 = interfaceC4351m2;
                    }
                    if (i38 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C3595n(0);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        function11 = (Function1) objM87133R4;
                    } else {
                        interfaceC4351m8 = interfaceC4351m8;
                        function11 = function3;
                    }
                    if (i44 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    if (i47 != 0) {
                        i67 = 0;
                    } else {
                        i67 = i13;
                    }
                    function12 = function11;
                    if (i54 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C3595n(1);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function13 = (Function1) objM87133R3;
                    } else {
                        i34 = i34;
                        function13 = function4;
                    }
                    if (i56 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                    function14 = function13;
                    if (i57 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C3509a(9);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                    } else {
                        z25 = z25;
                        interfaceC4339a6 = interfaceC4339a2;
                    }
                    if (i58 != 0) {
                        j14 = 0;
                    } else {
                        j14 = j7;
                    }
                    if (i59 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C26047n(24);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC4339a7 = interfaceC4339a6;
                        interfaceC4351m9 = (InterfaceC4351m) objM87133R;
                    } else {
                        interfaceC4339a7 = interfaceC4339a6;
                        interfaceC4351m9 = interfaceC4351m3;
                    }
                    z26 = z24;
                    interfaceC4351m10 = interfaceC4351m8;
                } else {
                    if (i94 != 0) {
                        z19 = false;
                    } else {
                        z19 = z4;
                    }
                    if ((i17 & 4096) != 0) {
                        c24937e3 = new C24937e(false, null, null, null, null, null, null, null, false, 510, null);
                        i34 &= -897;
                    } else {
                        c24937e3 = c24937e;
                    }
                    if (i96 != 0) {
                        objM87133R9 = c28655q2.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C26047n(22);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        interfaceC4351m7 = (InterfaceC4351m) objM87133R9;
                    } else {
                        interfaceC4351m7 = interfaceC4351m;
                    }
                    if (i25 != 0) {
                        objM87133R8 = c28655q2.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C3595n(4);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        function9 = (Function1) objM87133R8;
                    } else {
                        function9 = function1;
                    }
                    if (i27 != 0) {
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C3595n(5);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        function10 = (Function1) objM87133R7;
                    } else {
                        function9 = function9;
                        function10 = function2;
                    }
                    if (i29 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C3509a(8);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC4339a5 = (InterfaceC4339a) objM87133R6;
                    } else {
                        function10 = function10;
                        interfaceC4339a5 = interfaceC4339a;
                    }
                    if (i35 != 0) {
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C26047n(23);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC4351m8 = (InterfaceC4351m) objM87133R5;
                    } else {
                        interfaceC4339a5 = interfaceC4339a5;
                        interfaceC4351m8 = interfaceC4351m2;
                    }
                    if (i38 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C3595n(0);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        function11 = (Function1) objM87133R4;
                    } else {
                        interfaceC4351m8 = interfaceC4351m8;
                        function11 = function3;
                    }
                    if (i44 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    if (i47 != 0) {
                        i67 = 0;
                    } else {
                        i67 = i13;
                    }
                    function12 = function11;
                    if (i54 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C3595n(1);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function13 = (Function1) objM87133R3;
                    } else {
                        i34 = i34;
                        function13 = function4;
                    }
                    if (i56 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                    function14 = function13;
                    if (i57 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C3509a(9);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                    } else {
                        z25 = z25;
                        interfaceC4339a6 = interfaceC4339a2;
                    }
                    if (i58 != 0) {
                        j14 = 0;
                    } else {
                        j14 = j7;
                    }
                    if (i59 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C26047n(24);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC4339a7 = interfaceC4339a6;
                        interfaceC4351m9 = (InterfaceC4351m) objM87133R;
                    } else {
                        interfaceC4339a7 = interfaceC4339a6;
                        interfaceC4351m9 = interfaceC4351m3;
                    }
                    z26 = z24;
                    interfaceC4351m10 = interfaceC4351m8;
                }
                c28655q2.m87175r();
                interfaceC4339a8 = interfaceC4339a5;
                objM87133R10 = c28655q2.m87133R();
                if (objM87133R10 == c28676v0) {
                    objM87133R10 = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R10);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R10;
                interfaceC4351m11 = interfaceC4351m7;
                c13821r1M92099U = AbstractC30060g.m92099U(6, c28655q2, 0);
                objM87133R11 = c28655q2.m87133R();
                if (objM87133R11 == c28676v0) {
                    objM87133R11 = AbstractC11266d.m30468v(0.0f, c28655q2);
                }
                interfaceC28690z0 = (InterfaceC28690z0) objM87133R11;
                c12337gM34447f = viewState.getIsSuccess().getDateSelectorState();
                if (c12337gM34447f != null) {
                    strM34470d = c12337gM34447f.getCurrentDate();
                } else {
                    strM34470d = null;
                }
                if (strM34470d == null) {
                    strM34470d = "";
                }
                zM87153g = c28655q2.m87153g(strM34470d);
                objM87133R12 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R12 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R12);
                } else {
                    objM87133R12 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R12);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R12;
                c12337gM34447f2 = viewState.getIsSuccess().getDateSelectorState();
                if (c12337gM34447f2 != null) {
                    interfaceC4351m12 = interfaceC4351m10;
                    if (c12337gM34447f2.getIsLoading()) {
                    }
                    if (viewState.getIsLoading()) {
                        z27 = false;
                    } else {
                        z27 = false;
                    }
                    c28655q2.m87152f0(1903845737);
                    c26669a = C29155a.f118017b;
                    if (c26669a != null) {
                        throw new IllegalStateException("KoinApplication has not been started");
                    }
                    c38266c = c26669a.f106046a.f159364d;
                    c28655q2.m87152f0(-3686552);
                    zM87153g2 = c28655q2.m87153g(null) | c28655q2.m87153g(null);
                    objM87133R13 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R13 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null));
                        c28655q2.m87172p0(objM87133R13);
                    } else {
                        objM87133R13 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null));
                        c28655q2.m87172p0(objM87133R13);
                    }
                    c28655q2.m87173q(false);
                    final InterfaceC23462h interfaceC23462h3 = (InterfaceC23462h) objM87133R13;
                    c28655q2.m87173q(false);
                    objM87133R14 = c28655q2.m87133R();
                    if (objM87133R14 == c28676v0) {
                        objM87133R14 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R14);
                    }
                    final InterfaceC28601c1 interfaceC28601c13 = (InterfaceC28601c1) objM87133R14;
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(c28655q2.m87161k(AbstractC2453v1.f9577p), c28655q2);
                    c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q2, 3078, 6);
                    aVar = new AbstractC35664f.a(c15199y3M3460c);
                    objM87133R15 = c28655q2.m87133R();
                    if (objM87133R15 == c28676v0) {
                        objM87133R15 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R15);
                    }
                    final InterfaceC28601c1 interfaceC28601c14 = (InterfaceC28601c1) objM87133R15;
                    objM87133R16 = c28655q2.m87133R();
                    c25271y = C25271y.f99162w;
                    if (objM87133R16 == c28676v0) {
                        objM87133R16 = AbstractC28683x.m87272z(c25271y);
                        c28655q2.m87172p0(objM87133R16);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R16;
                    objM87133R17 = c28655q2.m87133R();
                    if (objM87133R17 == c28676v0) {
                        objM87133R17 = AbstractC28683x.m87272z(c25271y);
                        c28655q2.m87172p0(objM87133R17);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R17;
                    objM87133R18 = c28655q2.m87133R();
                    if (objM87133R18 == c28676v0) {
                        objM87133R18 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R18);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R18;
                    objM87133R19 = c28655q2.m87133R();
                    if (objM87133R19 == c28676v0) {
                        objM87133R19 = AbstractC28683x.m87272z(Boolean.TRUE);
                        c28655q2.m87172p0(objM87133R19);
                    }
                    interfaceC28601c5 = (InterfaceC28601c1) objM87133R19;
                    objM87133R20 = c28655q2.m87133R();
                    if (objM87133R20 == c28676v0) {
                        objM87133R20 = AbstractC11895b.m32005x(0, c28655q2);
                    }
                    final InterfaceC28601c1 interfaceC28601c15 = (InterfaceC28601c1) objM87133R20;
                    C9598e c9598eM34456o3 = viewState.getIsSuccess().getOnSaveNavigation();
                    boolean zM87157i13 = c28655q2.m87157i(viewState) | c28655q2.m87157i(c15199y3M3460c);
                    i68 = i64 & 112;
                    if (i68 == 32) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = zM87157i13 | z28;
                    objM87133R21 = c28655q2.m87133R();
                    if (z29) {
                        objM87133R21 = new b(viewState, c15199y3M3460c, function12, null);
                        c28655q2.m87172p0(objM87133R21);
                    } else {
                        objM87133R21 = new b(viewState, c15199y3M3460c, function12, null);
                        c28655q2.m87172p0(objM87133R21);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R21, c9598eM34456o3);
                    Object[] objArr3 = {strM34470d, Boolean.valueOf(z27), Integer.valueOf(i67), Boolean.valueOf(z25)};
                    boolean zM87155h3 = c28655q2.m87155h(z27) | c28655q2.m87153g(interfaceC28601c1);
                    if ((458752 & i64) == 131072) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    boolean zM87153g14 = zM87155h3 | z34 | c28655q2.m87153g(c13821r1M92099U);
                    i69 = 57344 & i64;
                    if (i69 == 16384) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    boolean z715 = zM87153g14 | z35;
                    function15 = function12;
                    if ((3670016 & i64) == 1048576) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    boolean z716 = z36 | z715;
                    if ((i64 & 7168) == 2048) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    z38 = z716 | z37;
                    objM87133R22 = c28655q2.m87133R();
                    if (z38) {
                        int i916 = i67;
                        Function1 function112 = function14;
                        boolean z717 = z25;
                        InterfaceC4339a interfaceC4339a16 = interfaceC4339a7;
                        objM87133R22 = new c(z27, interfaceC28601c1, z717, c13821r1M92099U, function112, interfaceC4339a16, i916, null);
                        z39 = z717;
                        c13821r1 = c13821r1M92099U;
                        function16 = function112;
                        interfaceC4339a9 = interfaceC4339a16;
                        i74 = i916;
                        c28655q2.m87172p0(objM87133R22);
                    } else {
                        int i917 = i67;
                        Function1 function113 = function14;
                        boolean z718 = z25;
                        InterfaceC4339a interfaceC4339a17 = interfaceC4339a7;
                        objM87133R22 = new c(z27, interfaceC28601c1, z718, c13821r1M92099U, function113, interfaceC4339a17, i917, null);
                        z39 = z718;
                        c13821r1 = c13821r1M92099U;
                        function16 = function113;
                        interfaceC4339a9 = interfaceC4339a17;
                        i74 = i917;
                        c28655q2.m87172p0(objM87133R22);
                    }
                    AbstractC28683x.m87256j(objArr3, (InterfaceC4351m) objM87133R22, c28655q2);
                    c12337gM34447f3 = viewState.getIsSuccess().getDateSelectorState();
                    if (c12337gM34447f3 != null) {
                        strM34470d2 = c12337gM34447f3.getCurrentDate();
                    } else {
                        strM34470d2 = null;
                    }
                    abstractC12336fM34453l = viewState.getIsSuccess().getJournalDatePillViewState();
                    if (abstractC12336fM34453l instanceof AbstractC12336f.c) {
                        cVar = (AbstractC12336f.c) abstractC12336fM34453l;
                    } else {
                        cVar = null;
                    }
                    if (cVar != null) {
                        listM34463a = cVar.m34463a();
                    } else {
                        listM34463a = null;
                    }
                    boolean zM87153g15 = c28655q2.m87153g(strM34470d2) | c28655q2.m87157i(listM34463a);
                    if ((i64 & 29360128) == 8388608) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    boolean z719 = zM87153g15 | z44;
                    if ((234881024 & i64) == 67108864) {
                        z45 = true;
                    } else {
                        z45 = false;
                    }
                    z46 = z719 | z45;
                    objM87133R23 = c28655q2.m87133R();
                    if (z46) {
                        InterfaceC4351m interfaceC4351m111 = interfaceC4351m9;
                        objM87133R23 = new d(strM34470d2, listM34463a, j14, interfaceC4351m111, null);
                        interfaceC4351m13 = interfaceC4351m111;
                        c28655q2.m87172p0(objM87133R23);
                    } else {
                        InterfaceC4351m interfaceC4351m112 = interfaceC4351m9;
                        objM87133R23 = new d(strM34470d2, listM34463a, j14, interfaceC4351m112, null);
                        interfaceC4351m13 = interfaceC4351m112;
                        c28655q2.m87172p0(objM87133R23);
                    }
                    AbstractC28683x.m87254h(strM34470d2, listM34463a, (InterfaceC4351m) objM87133R23, c28655q2);
                    if (i69 == 16384) {
                        z47 = true;
                    } else {
                        z47 = false;
                    }
                    boolean zM87153g16 = z47 | c28655q2.m87153g(c13821r1);
                    if ((i18 & 29360128) == 8388608) {
                        z48 = true;
                    } else {
                        z48 = false;
                    }
                    z49 = zM87153g16 | z48;
                    objM87133R24 = c28655q2.m87133R();
                    if (z49) {
                        final int i918 = 0;
                        objM87133R24 = new Function1() { // from class: bs1.o
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i918) {
                                    case 0:
                                        return AbstractC3583c0.m10915z1(function16, c13821r1, exit, ((Boolean) obj).booleanValue());
                                    default:
                                        return AbstractC3583c0.m10735A1(function16, c13821r1, exit, (C9598e) obj);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R24);
                    } else {
                        final int i919 = 0;
                        objM87133R24 = new Function1() { // from class: bs1.o
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i919) {
                                    case 0:
                                        return AbstractC3583c0.m10915z1(function16, c13821r1, exit, ((Boolean) obj).booleanValue());
                                    default:
                                        return AbstractC3583c0.m10735A1(function16, c13821r1, exit, (C9598e) obj);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R24);
                    }
                    final Function1 function217 = (Function1) objM87133R24;
                    if (i69 == 16384) {
                        z52 = true;
                    } else {
                        z52 = false;
                    }
                    boolean zM87153g17 = z52 | c28655q2.m87153g(c13821r1);
                    if ((i34 & 29360128) == 8388608) {
                        z54 = true;
                    } else {
                        z54 = false;
                    }
                    z55 = zM87153g17 | z54;
                    objM87133R25 = c28655q2.m87133R();
                    if (z55) {
                        final int i9110 = 1;
                        objM87133R25 = new Function1() { // from class: bs1.o
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i9110) {
                                    case 0:
                                        return AbstractC3583c0.m10915z1(function16, c13821r1, function9, ((Boolean) obj).booleanValue());
                                    default:
                                        return AbstractC3583c0.m10735A1(function16, c13821r1, function9, (C9598e) obj);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R25);
                    } else {
                        final int i9111 = 1;
                        objM87133R25 = new Function1() { // from class: bs1.o
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i9111) {
                                    case 0:
                                        return AbstractC3583c0.m10915z1(function16, c13821r1, function9, ((Boolean) obj).booleanValue());
                                    default:
                                        return AbstractC3583c0.m10735A1(function16, c13821r1, function9, (C9598e) obj);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R25);
                    }
                    final Function1 function218 = (Function1) objM87133R25;
                    if (i69 == 16384) {
                        z56 = true;
                    } else {
                        z56 = false;
                    }
                    boolean zM87153g18 = z56 | c28655q2.m87153g(c13821r1);
                    if ((i18 & 3670016) == 1048576) {
                        z57 = true;
                    } else {
                        z57 = false;
                    }
                    z58 = zM87153g18 | z57;
                    objM87133R26 = c28655q2.m87133R();
                    if (z58) {
                        objM87133R26 = new C3718c(function16, c13821r1, false, onExitClicked, 21);
                        c28655q2.m87172p0(objM87133R26);
                    } else {
                        objM87133R26 = new C3718c(function16, c13821r1, false, onExitClicked, 21);
                        c28655q2.m87172p0(objM87133R26);
                    }
                    final InterfaceC4339a interfaceC4339a18 = (InterfaceC4339a) objM87133R26;
                    Boolean boolValueOf5 = Boolean.valueOf(z26);
                    Boolean boolValueOf6 = Boolean.valueOf(viewState.getIsLoading());
                    if ((i64 & 896) == 256) {
                        z59 = true;
                    } else {
                        z59 = false;
                    }
                    boolean zM87157i14 = z59 | c28655q2.m87157i(viewState);
                    if (i68 == 32) {
                        z60 = true;
                    } else {
                        z60 = false;
                    }
                    zM87157i = zM87157i14 | z60 | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(aVar);
                    objM87133R27 = c28655q2.m87133R();
                    if (zM87157i) {
                        boolean z87 = z26;
                        objM87133R27 = new e(z87, viewState, function15, interfaceC28601c5, interfaceC28601c4, interfaceC2994c0, aVar, null);
                        z64 = z87;
                        function17 = function15;
                        aVar2 = aVar;
                        c28655q2.m87172p0(objM87133R27);
                    } else {
                        boolean z88 = z26;
                        objM87133R27 = new e(z88, viewState, function15, interfaceC28601c5, interfaceC28601c4, interfaceC2994c0, aVar, null);
                        z64 = z88;
                        function17 = function15;
                        aVar2 = aVar;
                        c28655q2.m87172p0(objM87133R27);
                    }
                    AbstractC28683x.m87254h(boolValueOf5, boolValueOf6, (InterfaceC4351m) objM87133R27, c28655q2);
                    if (viewState.getIsSuccess().getShouldRefresh()) {
                        abstractC12336fM34453l2 = viewState.getIsSuccess().getJournalDatePillViewState();
                        if (abstractC12336fM34453l2 instanceof AbstractC12336f.c) {
                            cVar2 = (AbstractC12336f.c) abstractC12336fM34453l2;
                        } else {
                            cVar2 = null;
                        }
                        if (cVar2 != null) {
                            it = cVar2.m34463a().iterator();
                            do {
                                if (it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!((C16613h) next).getIsSelected());
                            c16613h = (C16613h) next;
                            if (c16613h != null) {
                                String strM47166f3 = c16613h.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
                                lM47165e = c16613h.getCycleId();
                                if (lM47165e != null) {
                                    jLongValue = lM47165e.longValue();
                                } else {
                                    jLongValue = 0;
                                }
                                function17.invoke(new AbstractC11103c.j(strM47166f3, jLongValue, false, null, null, false, false, null, 252, null));
                            }
                        }
                    }
                    c12332bM34459r = viewState.getIsSuccess().getShouldShowBottomSheet();
                    if (c12332bM34459r != null) {
                        abstractC12331aM34433c = c12332bM34459r.getType();
                    } else {
                        abstractC12331aM34433c = null;
                    }
                    if (abstractC12331aM34433c instanceof AbstractC12331a.a) {
                        aVar3 = (AbstractC12331a.a) abstractC12331aM34433c;
                    } else {
                        aVar3 = null;
                    }
                    if (aVar3 != null) {
                        function17.invoke(new AbstractC11103c.h(strM34420c));
                    }
                    if (((Collection) interfaceC28601c2.getValue()).isEmpty()) {
                        c28655q2.m87150e0(1499406798);
                        c12332bM34459r3 = viewState.getIsSuccess().getShouldShowBottomSheet();
                        if (c12332bM34459r3 != null) {
                            abstractC12331aM34433c2 = c12332bM34459r3.getType();
                        } else {
                            abstractC12331aM34433c2 = null;
                        }
                        if (abstractC12331aM34433c2 instanceof AbstractC12331a.a) {
                            aVar5 = (AbstractC12331a.a) abstractC12331aM34433c2;
                        } else {
                            aVar5 = null;
                        }
                        if (aVar5 != null) {
                            c22582fM65421f = null;
                        } else {
                            c22582fM65421f = null;
                        }
                        if (c22582fM65421f == null) {
                            c28655q2.m87150e0(-763029517);
                            c28655q2.m87173q(false);
                            z74 = false;
                            aVar4 = aVar2;
                            function18 = function17;
                            interfaceC28601c6 = interfaceC28601c2;
                        } else {
                            c28655q2.m87150e0(-763029516);
                            abstractC12331aM34433c3 = viewState.getIsSuccess().getShouldShowBottomSheet().getType();
                            if (abstractC12331aM34433c3 instanceof AbstractC12331a.a) {
                                aVar6 = (AbstractC12331a.a) abstractC12331aM34433c3;
                            } else {
                                aVar6 = null;
                            }
                            if (aVar6 != null) {
                                listM34419b = aVar6.m34419b();
                            } else {
                                listM34419b = null;
                            }
                            if (listM34419b == null) {
                                listM34419b = c25271y;
                            }
                            List list5 = (List) interfaceC28601c2.getValue();
                            List list6 = (List) interfaceC28601c3.getValue();
                            C22582f c22582f3 = c22582fM65421f;
                            if (i68 == 32) {
                                z69 = true;
                            } else {
                                z69 = false;
                            }
                            zM87157i2 = z69 | c28655q2.m87157i(listM34419b) | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(aVar2);
                            objM87133R30 = c28655q2.m87133R();
                            if (zM87157i2) {
                                AbstractC35664f.a aVar12 = aVar2;
                                Function1 function219 = function17;
                                objM87133R30 = new C1008b(listM34419b, function219, interfaceC2994c0, aVar12, interfaceC28601c4, interfaceC28601c2);
                                function18 = function219;
                                aVar4 = aVar12;
                                interfaceC28601c6 = interfaceC28601c2;
                                c28655q2.m87172p0(objM87133R30);
                            } else {
                                AbstractC35664f.a aVar13 = aVar2;
                                Function1 function2110 = function17;
                                objM87133R30 = new C1008b(listM34419b, function2110, interfaceC2994c0, aVar13, interfaceC28601c4, interfaceC28601c2);
                                function18 = function2110;
                                aVar4 = aVar13;
                                interfaceC28601c6 = interfaceC28601c2;
                                c28655q2.m87172p0(objM87133R30);
                            }
                            Function1 function2111 = (Function1) objM87133R30;
                            objM87133R31 = c28655q2.m87133R();
                            if (objM87133R31 == c28676v0) {
                                objM87133R31 = new C3598q(interfaceC28601c6, 1);
                                c28655q2.m87172p0(objM87133R31);
                            }
                            AbstractC41069c.m133347o(c22582f3, list5, list6, false, function2111, (InterfaceC4339a) objM87133R31, c28655q2, C22582f.f88880e | ProfileVerifier.CompilationStatus.f6515xf2722a21, 8);
                            z74 = false;
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z74);
                    } else {
                        aVar4 = aVar2;
                        function18 = function17;
                        interfaceC28601c6 = interfaceC28601c2;
                        c28655q2.m87150e0(-762104848);
                        c28655q2.m87173q(false);
                    }
                    EnumC15209z3 enumC15209z3M43221b3 = c15199y3M3460c.m43221b();
                    EnumC15209z3 enumC15209z3M43222c3 = c15199y3M3460c.m43222c();
                    boolean zM87157i15 = c28655q2.m87157i(c15199y3M3460c) | c28655q2.m87157i(viewState);
                    if ((i18 & 112) == 32) {
                        z65 = true;
                    } else {
                        z65 = false;
                    }
                    zM87153g3 = z65 | zM87157i15 | c28655q2.m87153g(interfaceC28601c1M87238F);
                    objM87133R28 = c28655q2.m87133R();
                    if (zM87153g3) {
                        objM87133R28 = new g(c15199y3M3460c, viewState, onJournalQuestionClicked, interfaceC28601c1M87238F, null);
                        c12341k = viewState;
                        c28655q2.m87172p0(objM87133R28);
                    } else {
                        objM87133R28 = new g(c15199y3M3460c, viewState, onJournalQuestionClicked, interfaceC28601c1M87238F, null);
                        c12341k = viewState;
                        c28655q2.m87172p0(objM87133R28);
                    }
                    AbstractC28683x.m87254h(enumC15209z3M43221b3, enumC15209z3M43222c3, (InterfaceC4351m) objM87133R28, c28655q2);
                    C15199y3 c15199y3M112950a3 = aVar4.getModalBottomSheetState();
                    C12332b c12332bM34459r6 = c12341k.getIsSuccess().getShouldShowBottomSheet();
                    boolean zM87157i16 = c28655q2.m87157i(aVar4);
                    if ((i64 & 14) == 4) {
                        z66 = true;
                    } else {
                        z66 = false;
                    }
                    boolean zM87157i17 = z66 | zM87157i16 | c28655q2.m87157i(c12341k);
                    if ((i34 & 1879048192) == 536870912) {
                        z67 = true;
                    } else {
                        z67 = false;
                    }
                    z68 = zM87157i17 | z67;
                    objM87133R29 = c28655q2.m87133R();
                    if (z68) {
                        InterfaceC4351m interfaceC4351m113 = interfaceC4351m12;
                        objM87133R29 = new h(aVar4, interfaceC4351m113, c12341k, interfaceC28601c4, interfaceC4339a8, null);
                        interfaceC4351m14 = interfaceC4351m113;
                        interfaceC4339a10 = interfaceC4339a8;
                        c28655q2.m87172p0(objM87133R29);
                    } else {
                        InterfaceC4351m interfaceC4351m114 = interfaceC4351m12;
                        objM87133R29 = new h(aVar4, interfaceC4351m114, c12341k, interfaceC28601c4, interfaceC4339a8, null);
                        interfaceC4351m14 = interfaceC4351m114;
                        interfaceC4339a10 = interfaceC4339a8;
                        c28655q2.m87172p0(objM87133R29);
                    }
                    AbstractC28683x.m87254h(c15199y3M112950a3, c12332bM34459r6, (InterfaceC4351m) objM87133R29, c28655q2);
                    aiActionM34446e = viewState.getIsSuccess().getCoachAiAction();
                    if (aiActionM34446e != null) {
                        c13404jM18524b = AbstractC6219a.m18524b(aiActionM34446e, true);
                    } else {
                        c13404jM18524b = null;
                    }
                    Modifier modifierM34129b3 = AbstractC12250f.m34129b(AbstractC1102d.m3407d(1.0f, m10912y2(C2314t.f9131w, viewState.getIsIntraday())), c13404jM18524b, false, c28655q2, C13404j.f46947x << 3, 2);
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM34129b3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
                    c12332bM34459r2 = viewState.getIsSuccess().getShouldShowBottomSheet();
                    if (c12332bM34459r2 != null) {
                        textResourceM30853e = null;
                    } else {
                        textResourceM30853e = null;
                    }
                    Function1 function2112 = function10;
                    final AbstractC35664f.a aVar14 = aVar4;
                    final Function1 function2113 = function16;
                    final C13821r1 c13821r4 = c13821r1;
                    final Function1 function2114 = function18;
                    Function1 function2115 = function9;
                    AbstractC35660d.m112871m(null, new C35666g(textResourceM30853e, null, null, null, null, 0.0f, 0.0f, 126, null), aVar14, null, null, null, null, AbstractC37817c.m121344e(-1468159270, c28655q2, new C3602u(viewState, onJournalQuestionClicked, interfaceC2994c0, c15199y3M3460c, aVar4, function18, function2112, interfaceC28601c6, interfaceC28601c3, interfaceC28601c4, interfaceC28601c5)), false, null, null, null, false, null, AbstractC37817c.m121344e(1150183326, c28655q2, new InterfaceC4351m() { // from class: bs1.y
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC3583c0.m10773M1(viewState, onSavedFinish, function217, onRefresh, onSavedClicked, function2114, interfaceC28601c14, c15199y3M3460c, interfaceC2994c0, aVar14, onExitClicked, interfaceC4339a18, interfaceC28601c5, interfaceC28601c4, onNeverShowDismissDialogClick, onDismissConfirmationDialogClicked, function2113, c13821r4, interfaceC28601c15, function218, interfaceC4351m11, onCalendarOpened, onDateClicked, defaultToggleCallbackType, onDefaultsQuestionClicked, interfaceC28601c13, onJournalQuestionClicked, interfaceC23462h3, interfaceC28690z0, onCalendarPaged, (Composer) obj, iIntValue);
                        }
                    }), c28655q2, (C35666g.f151591h << 3) | 12582912 | (AbstractC35664f.a.f151587c << 6), 24576, 16249);
                    if (z19) {
                        c28655q2.m87150e0(-352673422);
                        AbstractC24936d.m73080z("INTRADAY_JOURNAL_ONBOARDING", c24937e3, false, null, null, null, null, c28655q2, (C24937e.f97642j << 3) | ((i34 >> 3) & 112), 124);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-352485066);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    function8 = function2113;
                    function7 = function2114;
                    c28655q = c28655q2;
                    z16 = z19;
                    z17 = z64;
                    j13 = j14;
                    interfaceC4339a3 = interfaceC4339a10;
                    function5 = function2115;
                    interfaceC4351m5 = interfaceC4351m13;
                    interfaceC4351m4 = interfaceC4351m14;
                    function6 = function2112;
                    c24937e2 = c24937e3;
                    i65 = i74;
                    z18 = z39;
                    interfaceC4339a4 = interfaceC4339a9;
                    interfaceC4351m6 = interfaceC4351m11;
                } else {
                    interfaceC4351m12 = interfaceC4351m10;
                }
                if (viewState.getIsLoading()) {
                    z27 = false;
                } else {
                    z27 = false;
                }
                c28655q2.m87152f0(1903845737);
                c26669a = C29155a.f118017b;
                if (c26669a != null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                c38266c = c26669a.f106046a.f159364d;
                c28655q2.m87152f0(-3686552);
                zM87153g2 = c28655q2.m87153g(null) | c28655q2.m87153g(null);
                objM87133R13 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R13 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null));
                    c28655q2.m87172p0(objM87133R13);
                } else {
                    objM87133R13 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null));
                    c28655q2.m87172p0(objM87133R13);
                }
                c28655q2.m87173q(false);
                final InterfaceC23462h interfaceC23462h4 = (InterfaceC23462h) objM87133R13;
                c28655q2.m87173q(false);
                objM87133R14 = c28655q2.m87133R();
                if (objM87133R14 == c28676v0) {
                    objM87133R14 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R14);
                }
                final InterfaceC28601c1 interfaceC28601c16 = (InterfaceC28601c1) objM87133R14;
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(c28655q2.m87161k(AbstractC2453v1.f9577p), c28655q2);
                c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q2, 3078, 6);
                aVar = new AbstractC35664f.a(c15199y3M3460c);
                objM87133R15 = c28655q2.m87133R();
                if (objM87133R15 == c28676v0) {
                    objM87133R15 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R15);
                }
                final InterfaceC28601c1 interfaceC28601c17 = (InterfaceC28601c1) objM87133R15;
                objM87133R16 = c28655q2.m87133R();
                c25271y = C25271y.f99162w;
                if (objM87133R16 == c28676v0) {
                    objM87133R16 = AbstractC28683x.m87272z(c25271y);
                    c28655q2.m87172p0(objM87133R16);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R16;
                objM87133R17 = c28655q2.m87133R();
                if (objM87133R17 == c28676v0) {
                    objM87133R17 = AbstractC28683x.m87272z(c25271y);
                    c28655q2.m87172p0(objM87133R17);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R17;
                objM87133R18 = c28655q2.m87133R();
                if (objM87133R18 == c28676v0) {
                    objM87133R18 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R18);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R18;
                objM87133R19 = c28655q2.m87133R();
                if (objM87133R19 == c28676v0) {
                    objM87133R19 = AbstractC28683x.m87272z(Boolean.TRUE);
                    c28655q2.m87172p0(objM87133R19);
                }
                interfaceC28601c5 = (InterfaceC28601c1) objM87133R19;
                objM87133R20 = c28655q2.m87133R();
                if (objM87133R20 == c28676v0) {
                    objM87133R20 = AbstractC11895b.m32005x(0, c28655q2);
                }
                final InterfaceC28601c1 interfaceC28601c18 = (InterfaceC28601c1) objM87133R20;
                C9598e c9598eM34456o4 = viewState.getIsSuccess().getOnSaveNavigation();
                boolean zM87157i18 = c28655q2.m87157i(viewState) | c28655q2.m87157i(c15199y3M3460c);
                i68 = i64 & 112;
                if (i68 == 32) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = zM87157i18 | z28;
                objM87133R21 = c28655q2.m87133R();
                if (z29) {
                    objM87133R21 = new b(viewState, c15199y3M3460c, function12, null);
                    c28655q2.m87172p0(objM87133R21);
                } else {
                    objM87133R21 = new b(viewState, c15199y3M3460c, function12, null);
                    c28655q2.m87172p0(objM87133R21);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R21, c9598eM34456o4);
                Object[] objArr4 = {strM34470d, Boolean.valueOf(z27), Integer.valueOf(i67), Boolean.valueOf(z25)};
                boolean zM87155h4 = c28655q2.m87155h(z27) | c28655q2.m87153g(interfaceC28601c1);
                if ((458752 & i64) == 131072) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                boolean zM87153g19 = zM87155h4 | z34 | c28655q2.m87153g(c13821r1M92099U);
                i69 = 57344 & i64;
                if (i69 == 16384) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                boolean z7110 = zM87153g19 | z35;
                function15 = function12;
                if ((3670016 & i64) == 1048576) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                boolean z7111 = z36 | z7110;
                if ((i64 & 7168) == 2048) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                z38 = z7111 | z37;
                objM87133R22 = c28655q2.m87133R();
                if (z38) {
                    int i9112 = i67;
                    Function1 function114 = function14;
                    boolean z7112 = z25;
                    InterfaceC4339a interfaceC4339a19 = interfaceC4339a7;
                    objM87133R22 = new c(z27, interfaceC28601c1, z7112, c13821r1M92099U, function114, interfaceC4339a19, i9112, null);
                    z39 = z7112;
                    c13821r1 = c13821r1M92099U;
                    function16 = function114;
                    interfaceC4339a9 = interfaceC4339a19;
                    i74 = i9112;
                    c28655q2.m87172p0(objM87133R22);
                } else {
                    int i9113 = i67;
                    Function1 function115 = function14;
                    boolean z7113 = z25;
                    InterfaceC4339a interfaceC4339a110 = interfaceC4339a7;
                    objM87133R22 = new c(z27, interfaceC28601c1, z7113, c13821r1M92099U, function115, interfaceC4339a110, i9113, null);
                    z39 = z7113;
                    c13821r1 = c13821r1M92099U;
                    function16 = function115;
                    interfaceC4339a9 = interfaceC4339a110;
                    i74 = i9113;
                    c28655q2.m87172p0(objM87133R22);
                }
                AbstractC28683x.m87256j(objArr4, (InterfaceC4351m) objM87133R22, c28655q2);
                c12337gM34447f3 = viewState.getIsSuccess().getDateSelectorState();
                if (c12337gM34447f3 != null) {
                    strM34470d2 = c12337gM34447f3.getCurrentDate();
                } else {
                    strM34470d2 = null;
                }
                abstractC12336fM34453l = viewState.getIsSuccess().getJournalDatePillViewState();
                if (abstractC12336fM34453l instanceof AbstractC12336f.c) {
                    cVar = (AbstractC12336f.c) abstractC12336fM34453l;
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    listM34463a = cVar.m34463a();
                } else {
                    listM34463a = null;
                }
                boolean zM87153g110 = c28655q2.m87153g(strM34470d2) | c28655q2.m87157i(listM34463a);
                if ((i64 & 29360128) == 8388608) {
                    z44 = true;
                } else {
                    z44 = false;
                }
                boolean z7114 = zM87153g110 | z44;
                if ((234881024 & i64) == 67108864) {
                    z45 = true;
                } else {
                    z45 = false;
                }
                z46 = z7114 | z45;
                objM87133R23 = c28655q2.m87133R();
                if (z46) {
                    InterfaceC4351m interfaceC4351m115 = interfaceC4351m9;
                    objM87133R23 = new d(strM34470d2, listM34463a, j14, interfaceC4351m115, null);
                    interfaceC4351m13 = interfaceC4351m115;
                    c28655q2.m87172p0(objM87133R23);
                } else {
                    InterfaceC4351m interfaceC4351m116 = interfaceC4351m9;
                    objM87133R23 = new d(strM34470d2, listM34463a, j14, interfaceC4351m116, null);
                    interfaceC4351m13 = interfaceC4351m116;
                    c28655q2.m87172p0(objM87133R23);
                }
                AbstractC28683x.m87254h(strM34470d2, listM34463a, (InterfaceC4351m) objM87133R23, c28655q2);
                if (i69 == 16384) {
                    z47 = true;
                } else {
                    z47 = false;
                }
                boolean zM87153g111 = z47 | c28655q2.m87153g(c13821r1);
                if ((i18 & 29360128) == 8388608) {
                    z48 = true;
                } else {
                    z48 = false;
                }
                z49 = zM87153g111 | z48;
                objM87133R24 = c28655q2.m87133R();
                if (z49) {
                    final int i9114 = 0;
                    objM87133R24 = new Function1() { // from class: bs1.o
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i9114) {
                                case 0:
                                    return AbstractC3583c0.m10915z1(function16, c13821r1, exit, ((Boolean) obj).booleanValue());
                                default:
                                    return AbstractC3583c0.m10735A1(function16, c13821r1, exit, (C9598e) obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R24);
                } else {
                    final int i9115 = 0;
                    objM87133R24 = new Function1() { // from class: bs1.o
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i9115) {
                                case 0:
                                    return AbstractC3583c0.m10915z1(function16, c13821r1, exit, ((Boolean) obj).booleanValue());
                                default:
                                    return AbstractC3583c0.m10735A1(function16, c13821r1, exit, (C9598e) obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R24);
                }
                final Function1 function2116 = (Function1) objM87133R24;
                if (i69 == 16384) {
                    z52 = true;
                } else {
                    z52 = false;
                }
                boolean zM87153g112 = z52 | c28655q2.m87153g(c13821r1);
                if ((i34 & 29360128) == 8388608) {
                    z54 = true;
                } else {
                    z54 = false;
                }
                z55 = zM87153g112 | z54;
                objM87133R25 = c28655q2.m87133R();
                if (z55) {
                    final int i9116 = 1;
                    objM87133R25 = new Function1() { // from class: bs1.o
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i9116) {
                                case 0:
                                    return AbstractC3583c0.m10915z1(function16, c13821r1, function9, ((Boolean) obj).booleanValue());
                                default:
                                    return AbstractC3583c0.m10735A1(function16, c13821r1, function9, (C9598e) obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R25);
                } else {
                    final int i9117 = 1;
                    objM87133R25 = new Function1() { // from class: bs1.o
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i9117) {
                                case 0:
                                    return AbstractC3583c0.m10915z1(function16, c13821r1, function9, ((Boolean) obj).booleanValue());
                                default:
                                    return AbstractC3583c0.m10735A1(function16, c13821r1, function9, (C9598e) obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R25);
                }
                final Function1 function2117 = (Function1) objM87133R25;
                if (i69 == 16384) {
                    z56 = true;
                } else {
                    z56 = false;
                }
                boolean zM87153g113 = z56 | c28655q2.m87153g(c13821r1);
                if ((i18 & 3670016) == 1048576) {
                    z57 = true;
                } else {
                    z57 = false;
                }
                z58 = zM87153g113 | z57;
                objM87133R26 = c28655q2.m87133R();
                if (z58) {
                    objM87133R26 = new C3718c(function16, c13821r1, false, onExitClicked, 21);
                    c28655q2.m87172p0(objM87133R26);
                } else {
                    objM87133R26 = new C3718c(function16, c13821r1, false, onExitClicked, 21);
                    c28655q2.m87172p0(objM87133R26);
                }
                final InterfaceC4339a interfaceC4339a111 = (InterfaceC4339a) objM87133R26;
                Boolean boolValueOf7 = Boolean.valueOf(z26);
                Boolean boolValueOf8 = Boolean.valueOf(viewState.getIsLoading());
                if ((i64 & 896) == 256) {
                    z59 = true;
                } else {
                    z59 = false;
                }
                boolean zM87157i19 = z59 | c28655q2.m87157i(viewState);
                if (i68 == 32) {
                    z60 = true;
                } else {
                    z60 = false;
                }
                zM87157i = zM87157i19 | z60 | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(aVar);
                objM87133R27 = c28655q2.m87133R();
                if (zM87157i) {
                    boolean z89 = z26;
                    objM87133R27 = new e(z89, viewState, function15, interfaceC28601c5, interfaceC28601c4, interfaceC2994c0, aVar, null);
                    z64 = z89;
                    function17 = function15;
                    aVar2 = aVar;
                    c28655q2.m87172p0(objM87133R27);
                } else {
                    boolean z810 = z26;
                    objM87133R27 = new e(z810, viewState, function15, interfaceC28601c5, interfaceC28601c4, interfaceC2994c0, aVar, null);
                    z64 = z810;
                    function17 = function15;
                    aVar2 = aVar;
                    c28655q2.m87172p0(objM87133R27);
                }
                AbstractC28683x.m87254h(boolValueOf7, boolValueOf8, (InterfaceC4351m) objM87133R27, c28655q2);
                if (viewState.getIsSuccess().getShouldRefresh()) {
                    abstractC12336fM34453l2 = viewState.getIsSuccess().getJournalDatePillViewState();
                    if (abstractC12336fM34453l2 instanceof AbstractC12336f.c) {
                        cVar2 = (AbstractC12336f.c) abstractC12336fM34453l2;
                    } else {
                        cVar2 = null;
                    }
                    if (cVar2 != null) {
                        it = cVar2.m34463a().iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!((C16613h) next).getIsSelected());
                        c16613h = (C16613h) next;
                        if (c16613h != null) {
                            String strM47166f4 = c16613h.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
                            lM47165e = c16613h.getCycleId();
                            if (lM47165e != null) {
                                jLongValue = lM47165e.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            function17.invoke(new AbstractC11103c.j(strM47166f4, jLongValue, false, null, null, false, false, null, 252, null));
                        }
                    }
                }
                c12332bM34459r = viewState.getIsSuccess().getShouldShowBottomSheet();
                if (c12332bM34459r != null) {
                    abstractC12331aM34433c = c12332bM34459r.getType();
                } else {
                    abstractC12331aM34433c = null;
                }
                if (abstractC12331aM34433c instanceof AbstractC12331a.a) {
                    aVar3 = (AbstractC12331a.a) abstractC12331aM34433c;
                } else {
                    aVar3 = null;
                }
                if (aVar3 != null) {
                    function17.invoke(new AbstractC11103c.h(strM34420c));
                }
                if (((Collection) interfaceC28601c2.getValue()).isEmpty()) {
                    c28655q2.m87150e0(1499406798);
                    c12332bM34459r3 = viewState.getIsSuccess().getShouldShowBottomSheet();
                    if (c12332bM34459r3 != null) {
                        abstractC12331aM34433c2 = c12332bM34459r3.getType();
                    } else {
                        abstractC12331aM34433c2 = null;
                    }
                    if (abstractC12331aM34433c2 instanceof AbstractC12331a.a) {
                        aVar5 = (AbstractC12331a.a) abstractC12331aM34433c2;
                    } else {
                        aVar5 = null;
                    }
                    if (aVar5 != null) {
                        c22582fM65421f = null;
                    } else {
                        c22582fM65421f = null;
                    }
                    if (c22582fM65421f == null) {
                        c28655q2.m87150e0(-763029517);
                        c28655q2.m87173q(false);
                        z74 = false;
                        aVar4 = aVar2;
                        function18 = function17;
                        interfaceC28601c6 = interfaceC28601c2;
                    } else {
                        c28655q2.m87150e0(-763029516);
                        abstractC12331aM34433c3 = viewState.getIsSuccess().getShouldShowBottomSheet().getType();
                        if (abstractC12331aM34433c3 instanceof AbstractC12331a.a) {
                            aVar6 = (AbstractC12331a.a) abstractC12331aM34433c3;
                        } else {
                            aVar6 = null;
                        }
                        if (aVar6 != null) {
                            listM34419b = aVar6.m34419b();
                        } else {
                            listM34419b = null;
                        }
                        if (listM34419b == null) {
                            listM34419b = c25271y;
                        }
                        List list7 = (List) interfaceC28601c2.getValue();
                        List list8 = (List) interfaceC28601c3.getValue();
                        C22582f c22582f4 = c22582fM65421f;
                        if (i68 == 32) {
                            z69 = true;
                        } else {
                            z69 = false;
                        }
                        zM87157i2 = z69 | c28655q2.m87157i(listM34419b) | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(aVar2);
                        objM87133R30 = c28655q2.m87133R();
                        if (zM87157i2) {
                            AbstractC35664f.a aVar15 = aVar2;
                            Function1 function2118 = function17;
                            objM87133R30 = new C1008b(listM34419b, function2118, interfaceC2994c0, aVar15, interfaceC28601c4, interfaceC28601c2);
                            function18 = function2118;
                            aVar4 = aVar15;
                            interfaceC28601c6 = interfaceC28601c2;
                            c28655q2.m87172p0(objM87133R30);
                        } else {
                            AbstractC35664f.a aVar16 = aVar2;
                            Function1 function2119 = function17;
                            objM87133R30 = new C1008b(listM34419b, function2119, interfaceC2994c0, aVar16, interfaceC28601c4, interfaceC28601c2);
                            function18 = function2119;
                            aVar4 = aVar16;
                            interfaceC28601c6 = interfaceC28601c2;
                            c28655q2.m87172p0(objM87133R30);
                        }
                        Function1 function21110 = (Function1) objM87133R30;
                        objM87133R31 = c28655q2.m87133R();
                        if (objM87133R31 == c28676v0) {
                            objM87133R31 = new C3598q(interfaceC28601c6, 1);
                            c28655q2.m87172p0(objM87133R31);
                        }
                        AbstractC41069c.m133347o(c22582f4, list7, list8, false, function21110, (InterfaceC4339a) objM87133R31, c28655q2, C22582f.f88880e | ProfileVerifier.CompilationStatus.f6515xf2722a21, 8);
                        z74 = false;
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z74);
                } else {
                    aVar4 = aVar2;
                    function18 = function17;
                    interfaceC28601c6 = interfaceC28601c2;
                    c28655q2.m87150e0(-762104848);
                    c28655q2.m87173q(false);
                }
                EnumC15209z3 enumC15209z3M43221b4 = c15199y3M3460c.m43221b();
                EnumC15209z3 enumC15209z3M43222c4 = c15199y3M3460c.m43222c();
                boolean zM87157i110 = c28655q2.m87157i(c15199y3M3460c) | c28655q2.m87157i(viewState);
                if ((i18 & 112) == 32) {
                    z65 = true;
                } else {
                    z65 = false;
                }
                zM87153g3 = z65 | zM87157i110 | c28655q2.m87153g(interfaceC28601c1M87238F);
                objM87133R28 = c28655q2.m87133R();
                if (zM87153g3) {
                    objM87133R28 = new g(c15199y3M3460c, viewState, onJournalQuestionClicked, interfaceC28601c1M87238F, null);
                    c12341k = viewState;
                    c28655q2.m87172p0(objM87133R28);
                } else {
                    objM87133R28 = new g(c15199y3M3460c, viewState, onJournalQuestionClicked, interfaceC28601c1M87238F, null);
                    c12341k = viewState;
                    c28655q2.m87172p0(objM87133R28);
                }
                AbstractC28683x.m87254h(enumC15209z3M43221b4, enumC15209z3M43222c4, (InterfaceC4351m) objM87133R28, c28655q2);
                C15199y3 c15199y3M112950a4 = aVar4.getModalBottomSheetState();
                C12332b c12332bM34459r7 = c12341k.getIsSuccess().getShouldShowBottomSheet();
                boolean zM87157i111 = c28655q2.m87157i(aVar4);
                if ((i64 & 14) == 4) {
                    z66 = true;
                } else {
                    z66 = false;
                }
                boolean zM87157i112 = z66 | zM87157i111 | c28655q2.m87157i(c12341k);
                if ((i34 & 1879048192) == 536870912) {
                    z67 = true;
                } else {
                    z67 = false;
                }
                z68 = zM87157i112 | z67;
                objM87133R29 = c28655q2.m87133R();
                if (z68) {
                    InterfaceC4351m interfaceC4351m117 = interfaceC4351m12;
                    objM87133R29 = new h(aVar4, interfaceC4351m117, c12341k, interfaceC28601c4, interfaceC4339a8, null);
                    interfaceC4351m14 = interfaceC4351m117;
                    interfaceC4339a10 = interfaceC4339a8;
                    c28655q2.m87172p0(objM87133R29);
                } else {
                    InterfaceC4351m interfaceC4351m118 = interfaceC4351m12;
                    objM87133R29 = new h(aVar4, interfaceC4351m118, c12341k, interfaceC28601c4, interfaceC4339a8, null);
                    interfaceC4351m14 = interfaceC4351m118;
                    interfaceC4339a10 = interfaceC4339a8;
                    c28655q2.m87172p0(objM87133R29);
                }
                AbstractC28683x.m87254h(c15199y3M112950a4, c12332bM34459r7, (InterfaceC4351m) objM87133R29, c28655q2);
                aiActionM34446e = viewState.getIsSuccess().getCoachAiAction();
                if (aiActionM34446e != null) {
                    c13404jM18524b = AbstractC6219a.m18524b(aiActionM34446e, true);
                } else {
                    c13404jM18524b = null;
                }
                Modifier modifierM34129b4 = AbstractC12250f.m34129b(AbstractC1102d.m3407d(1.0f, m10912y2(C2314t.f9131w, viewState.getIsIntraday())), c13404jM18524b, false, c28655q2, C13404j.f46947x << 3, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM34129b4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
                c12332bM34459r2 = viewState.getIsSuccess().getShouldShowBottomSheet();
                if (c12332bM34459r2 != null) {
                    textResourceM30853e = null;
                } else {
                    textResourceM30853e = null;
                }
                Function1 function21111 = function10;
                final AbstractC35664f.a aVar17 = aVar4;
                final Function1 function21112 = function16;
                final C13821r1 c13821r5 = c13821r1;
                final Function1 function21113 = function18;
                Function1 function21114 = function9;
                AbstractC35660d.m112871m(null, new C35666g(textResourceM30853e, null, null, null, null, 0.0f, 0.0f, 126, null), aVar17, null, null, null, null, AbstractC37817c.m121344e(-1468159270, c28655q2, new C3602u(viewState, onJournalQuestionClicked, interfaceC2994c0, c15199y3M3460c, aVar4, function18, function21111, interfaceC28601c6, interfaceC28601c3, interfaceC28601c4, interfaceC28601c5)), false, null, null, null, false, null, AbstractC37817c.m121344e(1150183326, c28655q2, new InterfaceC4351m() { // from class: bs1.y
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC3583c0.m10773M1(viewState, onSavedFinish, function2116, onRefresh, onSavedClicked, function21113, interfaceC28601c17, c15199y3M3460c, interfaceC2994c0, aVar17, onExitClicked, interfaceC4339a111, interfaceC28601c5, interfaceC28601c4, onNeverShowDismissDialogClick, onDismissConfirmationDialogClicked, function21112, c13821r5, interfaceC28601c18, function2117, interfaceC4351m11, onCalendarOpened, onDateClicked, defaultToggleCallbackType, onDefaultsQuestionClicked, interfaceC28601c16, onJournalQuestionClicked, interfaceC23462h4, interfaceC28690z0, onCalendarPaged, (Composer) obj, iIntValue);
                    }
                }), c28655q2, (C35666g.f151591h << 3) | 12582912 | (AbstractC35664f.a.f151587c << 6), 24576, 16249);
                if (z19) {
                    c28655q2.m87150e0(-352673422);
                    AbstractC24936d.m73080z("INTRADAY_JOURNAL_ONBOARDING", c24937e3, false, null, null, null, null, c28655q2, (C24937e.f97642j << 3) | ((i34 >> 3) & 112), 124);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-352485066);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(true);
                function8 = function21112;
                function7 = function21113;
                c28655q = c28655q2;
                z16 = z19;
                z17 = z64;
                j13 = j14;
                interfaceC4339a3 = interfaceC4339a10;
                function5 = function21114;
                interfaceC4351m5 = interfaceC4351m13;
                interfaceC4351m4 = interfaceC4351m14;
                function6 = function21111;
                c24937e2 = c24937e3;
                i65 = i74;
                z18 = z39;
                interfaceC4339a4 = interfaceC4339a9;
                interfaceC4351m6 = interfaceC4351m11;
            } else {
                c28655q2.m87138X();
                z16 = z4;
                c24937e2 = c24937e;
                function5 = function1;
                function6 = function2;
                interfaceC4339a3 = interfaceC4339a;
                interfaceC4351m4 = interfaceC4351m2;
                function7 = function3;
                z17 = z13;
                i65 = i13;
                function8 = function4;
                z18 = z14;
                interfaceC4339a4 = interfaceC4339a2;
                j13 = j7;
                interfaceC4351m5 = interfaceC4351m3;
                c28655q = c28655q2;
                interfaceC4351m6 = interfaceC4351m;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs1.b0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC3583c0.m10844h2(viewState, onJournalQuestionClicked, defaultToggleCallbackType, onRefresh, onSavedClicked, onSavedFinish, onExitClicked, exit, onNeverShowDismissDialogClick, onDismissConfirmationDialogClicked, onDefaultsQuestionClicked, z16, c24937e2, onDateClicked, interfaceC4351m6, onCalendarOpened, onCalendarPaged, function5, function6, interfaceC4339a3, interfaceC4351m4, function7, z17, i65, function8, z18, interfaceC4339a4, j13, interfaceC4351m5, i14, i15, i16, i17, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i24 = i95 | 24576;
        if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q2.m87157i(onCalendarOpened)) {
                i76 = 131072;
            } else {
                i76 = 65536;
            }
            i24 |= i76;
        }
        if ((i15 & 1572864) == 0) {
            if (c28655q2.m87157i(onCalendarPaged)) {
                i75 = 1048576;
            } else {
                i75 = 524288;
            }
            i24 |= i75;
        }
        i25 = i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
        if (i25 != 0) {
            i24 |= 12582912;
        } else if ((i15 & 12582912) == 0) {
            if (c28655q2.m87157i(function1)) {
                i26 = 8388608;
            } else {
                i26 = 4194304;
            }
            i24 |= i26;
        }
        i27 = i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION;
        if (i27 != 0) {
            i24 |= 100663296;
        } else if ((i15 & 100663296) == 0) {
            if (c28655q2.m87157i(function2)) {
                i28 = 67108864;
            } else {
                i28 = 33554432;
            }
            i24 |= i28;
        }
        i29 = i17 & 524288;
        if (i29 == 0) {
            i24 |= i89;
        } else if ((i15 & 805306368) == 0) {
            if (c28655q2.m87157i(interfaceC4339a)) {
                i89 = 536870912;
            } else {
                i89 = 268435456;
            }
            i24 |= i89;
        }
        i34 = i24;
        i35 = i17 & 1048576;
        if (i35 != 0) {
            i36 = i16;
            i37 = i36 | 6;
        } else {
            i36 = i16;
            if ((i36 & 6) == 0) {
                i37 = i36 | (c28655q2.m87157i(interfaceC4351m2) ? 4 : 2);
            } else {
                i37 = i36;
            }
        }
        i38 = i17 & 2097152;
        if (i38 != 0) {
            i37 |= 48;
        } else if ((i36 & 48) == 0) {
            i37 |= c28655q2.m87157i(function3) ? 32 : 16;
        }
        i39 = i37;
        i44 = i17 & 4194304;
        if (i44 != 0) {
            i46 = i39 | 384;
        } else {
            i45 = i39;
            if ((i36 & 384) != 0) {
                i45 |= c28655q2.m87155h(z13) ? 256 : 128;
            }
            i46 = i45;
        }
        i47 = i17 & 8388608;
        if (i47 != 0) {
            i49 = i46 | 3072;
        } else {
            i48 = i46;
            if ((i36 & 3072) != 0) {
                if (c28655q2.m87149e(i13)) {
                    i79 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i48 |= i79;
            }
            i49 = i48;
        }
        i54 = i17 & 16777216;
        if (i54 != 0) {
            i55 = i49;
            if ((i36 & 24576) == 0) {
                if (c28655q2.m87157i(function4)) {
                    i84 = DfuBaseService.ERROR_CONNECTION_MASK;
                }
                i55 |= i84;
            }
            i56 = i17 & AndroidSDKConstants.FLAG_MUTABLE;
            if (i56 != 0) {
                i55 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i36 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87155h(z14)) {
                    i86 = 131072;
                }
                i55 |= i86;
            }
            i57 = i17 & 67108864;
            if (i57 != 0) {
                i55 |= 1572864;
            } else if ((i16 & 1572864) == 0) {
                i55 |= c28655q2.m87157i(interfaceC4339a2) ? 1048576 : 524288;
            }
            i58 = i17 & 134217728;
            if (i58 != 0) {
                i55 |= 12582912;
            } else if ((i16 & 12582912) == 0) {
                i55 |= c28655q2.m87151f(j7) ? 8388608 : 4194304;
            }
            i59 = i17 & 268435456;
            if (i59 != 0) {
                i55 |= 100663296;
            } else if ((i16 & 100663296) == 0) {
                if (c28655q2.m87157i(interfaceC4351m3)) {
                    i88 = 67108864;
                }
                i55 |= i88;
            }
            i64 = i55;
            if ((i18 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (c28655q2.m87135U(i18 & 1, z15)) {
                c28655q2.m87140Z();
                i66 = i14 & 1;
                c28676v0 = C28635l.f115821a;
                if (i66 != 0) {
                    if (i94 != 0) {
                        z19 = false;
                    } else {
                        z19 = z4;
                    }
                    if ((i17 & 4096) != 0) {
                        c24937e3 = new C24937e(false, null, null, null, null, null, null, null, false, 510, null);
                        i34 &= -897;
                    } else {
                        c24937e3 = c24937e;
                    }
                    if (i96 != 0) {
                        objM87133R9 = c28655q2.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C26047n(22);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        interfaceC4351m7 = (InterfaceC4351m) objM87133R9;
                    } else {
                        interfaceC4351m7 = interfaceC4351m;
                    }
                    if (i25 != 0) {
                        objM87133R8 = c28655q2.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C3595n(4);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        function9 = (Function1) objM87133R8;
                    } else {
                        function9 = function1;
                    }
                    if (i27 != 0) {
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C3595n(5);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        function10 = (Function1) objM87133R7;
                    } else {
                        function9 = function9;
                        function10 = function2;
                    }
                    if (i29 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C3509a(8);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC4339a5 = (InterfaceC4339a) objM87133R6;
                    } else {
                        function10 = function10;
                        interfaceC4339a5 = interfaceC4339a;
                    }
                    if (i35 != 0) {
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C26047n(23);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC4351m8 = (InterfaceC4351m) objM87133R5;
                    } else {
                        interfaceC4339a5 = interfaceC4339a5;
                        interfaceC4351m8 = interfaceC4351m2;
                    }
                    if (i38 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C3595n(0);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        function11 = (Function1) objM87133R4;
                    } else {
                        interfaceC4351m8 = interfaceC4351m8;
                        function11 = function3;
                    }
                    if (i44 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    if (i47 != 0) {
                        i67 = 0;
                    } else {
                        i67 = i13;
                    }
                    function12 = function11;
                    if (i54 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C3595n(1);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function13 = (Function1) objM87133R3;
                    } else {
                        i34 = i34;
                        function13 = function4;
                    }
                    if (i56 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                    function14 = function13;
                    if (i57 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C3509a(9);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                    } else {
                        z25 = z25;
                        interfaceC4339a6 = interfaceC4339a2;
                    }
                    if (i58 != 0) {
                        j14 = 0;
                    } else {
                        j14 = j7;
                    }
                    if (i59 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C26047n(24);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC4339a7 = interfaceC4339a6;
                        interfaceC4351m9 = (InterfaceC4351m) objM87133R;
                    } else {
                        interfaceC4339a7 = interfaceC4339a6;
                        interfaceC4351m9 = interfaceC4351m3;
                    }
                    z26 = z24;
                    interfaceC4351m10 = interfaceC4351m8;
                } else {
                    if (i94 != 0) {
                        z19 = false;
                    } else {
                        z19 = z4;
                    }
                    if ((i17 & 4096) != 0) {
                        c24937e3 = new C24937e(false, null, null, null, null, null, null, null, false, 510, null);
                        i34 &= -897;
                    } else {
                        c24937e3 = c24937e;
                    }
                    if (i96 != 0) {
                        objM87133R9 = c28655q2.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C26047n(22);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        interfaceC4351m7 = (InterfaceC4351m) objM87133R9;
                    } else {
                        interfaceC4351m7 = interfaceC4351m;
                    }
                    if (i25 != 0) {
                        objM87133R8 = c28655q2.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C3595n(4);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        function9 = (Function1) objM87133R8;
                    } else {
                        function9 = function1;
                    }
                    if (i27 != 0) {
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C3595n(5);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        function10 = (Function1) objM87133R7;
                    } else {
                        function9 = function9;
                        function10 = function2;
                    }
                    if (i29 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C3509a(8);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC4339a5 = (InterfaceC4339a) objM87133R6;
                    } else {
                        function10 = function10;
                        interfaceC4339a5 = interfaceC4339a;
                    }
                    if (i35 != 0) {
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C26047n(23);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC4351m8 = (InterfaceC4351m) objM87133R5;
                    } else {
                        interfaceC4339a5 = interfaceC4339a5;
                        interfaceC4351m8 = interfaceC4351m2;
                    }
                    if (i38 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C3595n(0);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        function11 = (Function1) objM87133R4;
                    } else {
                        interfaceC4351m8 = interfaceC4351m8;
                        function11 = function3;
                    }
                    if (i44 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    if (i47 != 0) {
                        i67 = 0;
                    } else {
                        i67 = i13;
                    }
                    function12 = function11;
                    if (i54 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C3595n(1);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function13 = (Function1) objM87133R3;
                    } else {
                        i34 = i34;
                        function13 = function4;
                    }
                    if (i56 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                    function14 = function13;
                    if (i57 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C3509a(9);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                    } else {
                        z25 = z25;
                        interfaceC4339a6 = interfaceC4339a2;
                    }
                    if (i58 != 0) {
                        j14 = 0;
                    } else {
                        j14 = j7;
                    }
                    if (i59 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C26047n(24);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC4339a7 = interfaceC4339a6;
                        interfaceC4351m9 = (InterfaceC4351m) objM87133R;
                    } else {
                        interfaceC4339a7 = interfaceC4339a6;
                        interfaceC4351m9 = interfaceC4351m3;
                    }
                    z26 = z24;
                    interfaceC4351m10 = interfaceC4351m8;
                }
                c28655q2.m87175r();
                interfaceC4339a8 = interfaceC4339a5;
                objM87133R10 = c28655q2.m87133R();
                if (objM87133R10 == c28676v0) {
                    objM87133R10 = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R10);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R10;
                interfaceC4351m11 = interfaceC4351m7;
                c13821r1M92099U = AbstractC30060g.m92099U(6, c28655q2, 0);
                objM87133R11 = c28655q2.m87133R();
                if (objM87133R11 == c28676v0) {
                    objM87133R11 = AbstractC11266d.m30468v(0.0f, c28655q2);
                }
                interfaceC28690z0 = (InterfaceC28690z0) objM87133R11;
                c12337gM34447f = viewState.getIsSuccess().getDateSelectorState();
                if (c12337gM34447f != null) {
                    strM34470d = c12337gM34447f.getCurrentDate();
                } else {
                    strM34470d = null;
                }
                if (strM34470d == null) {
                    strM34470d = "";
                }
                zM87153g = c28655q2.m87153g(strM34470d);
                objM87133R12 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R12 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R12);
                } else {
                    objM87133R12 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R12);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R12;
                c12337gM34447f2 = viewState.getIsSuccess().getDateSelectorState();
                if (c12337gM34447f2 != null) {
                    interfaceC4351m12 = interfaceC4351m10;
                    if (c12337gM34447f2.getIsLoading()) {
                    }
                    if (viewState.getIsLoading()) {
                        z27 = false;
                    } else {
                        z27 = false;
                    }
                    c28655q2.m87152f0(1903845737);
                    c26669a = C29155a.f118017b;
                    if (c26669a != null) {
                        throw new IllegalStateException("KoinApplication has not been started");
                    }
                    c38266c = c26669a.f106046a.f159364d;
                    c28655q2.m87152f0(-3686552);
                    zM87153g2 = c28655q2.m87153g(null) | c28655q2.m87153g(null);
                    objM87133R13 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R13 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null));
                        c28655q2.m87172p0(objM87133R13);
                    } else {
                        objM87133R13 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null));
                        c28655q2.m87172p0(objM87133R13);
                    }
                    c28655q2.m87173q(false);
                    final InterfaceC23462h interfaceC23462h5 = (InterfaceC23462h) objM87133R13;
                    c28655q2.m87173q(false);
                    objM87133R14 = c28655q2.m87133R();
                    if (objM87133R14 == c28676v0) {
                        objM87133R14 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R14);
                    }
                    final InterfaceC28601c1 interfaceC28601c19 = (InterfaceC28601c1) objM87133R14;
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(c28655q2.m87161k(AbstractC2453v1.f9577p), c28655q2);
                    c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q2, 3078, 6);
                    aVar = new AbstractC35664f.a(c15199y3M3460c);
                    objM87133R15 = c28655q2.m87133R();
                    if (objM87133R15 == c28676v0) {
                        objM87133R15 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R15);
                    }
                    final InterfaceC28601c1 interfaceC28601c110 = (InterfaceC28601c1) objM87133R15;
                    objM87133R16 = c28655q2.m87133R();
                    c25271y = C25271y.f99162w;
                    if (objM87133R16 == c28676v0) {
                        objM87133R16 = AbstractC28683x.m87272z(c25271y);
                        c28655q2.m87172p0(objM87133R16);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R16;
                    objM87133R17 = c28655q2.m87133R();
                    if (objM87133R17 == c28676v0) {
                        objM87133R17 = AbstractC28683x.m87272z(c25271y);
                        c28655q2.m87172p0(objM87133R17);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R17;
                    objM87133R18 = c28655q2.m87133R();
                    if (objM87133R18 == c28676v0) {
                        objM87133R18 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R18);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R18;
                    objM87133R19 = c28655q2.m87133R();
                    if (objM87133R19 == c28676v0) {
                        objM87133R19 = AbstractC28683x.m87272z(Boolean.TRUE);
                        c28655q2.m87172p0(objM87133R19);
                    }
                    interfaceC28601c5 = (InterfaceC28601c1) objM87133R19;
                    objM87133R20 = c28655q2.m87133R();
                    if (objM87133R20 == c28676v0) {
                        objM87133R20 = AbstractC11895b.m32005x(0, c28655q2);
                    }
                    final InterfaceC28601c1 interfaceC28601c111 = (InterfaceC28601c1) objM87133R20;
                    C9598e c9598eM34456o5 = viewState.getIsSuccess().getOnSaveNavigation();
                    boolean zM87157i113 = c28655q2.m87157i(viewState) | c28655q2.m87157i(c15199y3M3460c);
                    i68 = i64 & 112;
                    if (i68 == 32) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = zM87157i113 | z28;
                    objM87133R21 = c28655q2.m87133R();
                    if (z29) {
                        objM87133R21 = new b(viewState, c15199y3M3460c, function12, null);
                        c28655q2.m87172p0(objM87133R21);
                    } else {
                        objM87133R21 = new b(viewState, c15199y3M3460c, function12, null);
                        c28655q2.m87172p0(objM87133R21);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R21, c9598eM34456o5);
                    Object[] objArr5 = {strM34470d, Boolean.valueOf(z27), Integer.valueOf(i67), Boolean.valueOf(z25)};
                    boolean zM87155h5 = c28655q2.m87155h(z27) | c28655q2.m87153g(interfaceC28601c1);
                    if ((458752 & i64) == 131072) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    boolean zM87153g114 = zM87155h5 | z34 | c28655q2.m87153g(c13821r1M92099U);
                    i69 = 57344 & i64;
                    if (i69 == 16384) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    boolean z7115 = zM87153g114 | z35;
                    function15 = function12;
                    if ((3670016 & i64) == 1048576) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    boolean z7116 = z36 | z7115;
                    if ((i64 & 7168) == 2048) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    z38 = z7116 | z37;
                    objM87133R22 = c28655q2.m87133R();
                    if (z38) {
                        int i9118 = i67;
                        Function1 function116 = function14;
                        boolean z7117 = z25;
                        InterfaceC4339a interfaceC4339a112 = interfaceC4339a7;
                        objM87133R22 = new c(z27, interfaceC28601c1, z7117, c13821r1M92099U, function116, interfaceC4339a112, i9118, null);
                        z39 = z7117;
                        c13821r1 = c13821r1M92099U;
                        function16 = function116;
                        interfaceC4339a9 = interfaceC4339a112;
                        i74 = i9118;
                        c28655q2.m87172p0(objM87133R22);
                    } else {
                        int i9119 = i67;
                        Function1 function117 = function14;
                        boolean z7118 = z25;
                        InterfaceC4339a interfaceC4339a113 = interfaceC4339a7;
                        objM87133R22 = new c(z27, interfaceC28601c1, z7118, c13821r1M92099U, function117, interfaceC4339a113, i9119, null);
                        z39 = z7118;
                        c13821r1 = c13821r1M92099U;
                        function16 = function117;
                        interfaceC4339a9 = interfaceC4339a113;
                        i74 = i9119;
                        c28655q2.m87172p0(objM87133R22);
                    }
                    AbstractC28683x.m87256j(objArr5, (InterfaceC4351m) objM87133R22, c28655q2);
                    c12337gM34447f3 = viewState.getIsSuccess().getDateSelectorState();
                    if (c12337gM34447f3 != null) {
                        strM34470d2 = c12337gM34447f3.getCurrentDate();
                    } else {
                        strM34470d2 = null;
                    }
                    abstractC12336fM34453l = viewState.getIsSuccess().getJournalDatePillViewState();
                    if (abstractC12336fM34453l instanceof AbstractC12336f.c) {
                        cVar = (AbstractC12336f.c) abstractC12336fM34453l;
                    } else {
                        cVar = null;
                    }
                    if (cVar != null) {
                        listM34463a = cVar.m34463a();
                    } else {
                        listM34463a = null;
                    }
                    boolean zM87153g115 = c28655q2.m87153g(strM34470d2) | c28655q2.m87157i(listM34463a);
                    if ((i64 & 29360128) == 8388608) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    boolean z7119 = zM87153g115 | z44;
                    if ((234881024 & i64) == 67108864) {
                        z45 = true;
                    } else {
                        z45 = false;
                    }
                    z46 = z7119 | z45;
                    objM87133R23 = c28655q2.m87133R();
                    if (z46) {
                        InterfaceC4351m interfaceC4351m119 = interfaceC4351m9;
                        objM87133R23 = new d(strM34470d2, listM34463a, j14, interfaceC4351m119, null);
                        interfaceC4351m13 = interfaceC4351m119;
                        c28655q2.m87172p0(objM87133R23);
                    } else {
                        InterfaceC4351m interfaceC4351m1110 = interfaceC4351m9;
                        objM87133R23 = new d(strM34470d2, listM34463a, j14, interfaceC4351m1110, null);
                        interfaceC4351m13 = interfaceC4351m1110;
                        c28655q2.m87172p0(objM87133R23);
                    }
                    AbstractC28683x.m87254h(strM34470d2, listM34463a, (InterfaceC4351m) objM87133R23, c28655q2);
                    if (i69 == 16384) {
                        z47 = true;
                    } else {
                        z47 = false;
                    }
                    boolean zM87153g116 = z47 | c28655q2.m87153g(c13821r1);
                    if ((i18 & 29360128) == 8388608) {
                        z48 = true;
                    } else {
                        z48 = false;
                    }
                    z49 = zM87153g116 | z48;
                    objM87133R24 = c28655q2.m87133R();
                    if (z49) {
                        final int i91110 = 0;
                        objM87133R24 = new Function1() { // from class: bs1.o
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i91110) {
                                    case 0:
                                        return AbstractC3583c0.m10915z1(function16, c13821r1, exit, ((Boolean) obj).booleanValue());
                                    default:
                                        return AbstractC3583c0.m10735A1(function16, c13821r1, exit, (C9598e) obj);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R24);
                    } else {
                        final int i91111 = 0;
                        objM87133R24 = new Function1() { // from class: bs1.o
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i91111) {
                                    case 0:
                                        return AbstractC3583c0.m10915z1(function16, c13821r1, exit, ((Boolean) obj).booleanValue());
                                    default:
                                        return AbstractC3583c0.m10735A1(function16, c13821r1, exit, (C9598e) obj);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R24);
                    }
                    final Function1 function21115 = (Function1) objM87133R24;
                    if (i69 == 16384) {
                        z52 = true;
                    } else {
                        z52 = false;
                    }
                    boolean zM87153g117 = z52 | c28655q2.m87153g(c13821r1);
                    if ((i34 & 29360128) == 8388608) {
                        z54 = true;
                    } else {
                        z54 = false;
                    }
                    z55 = zM87153g117 | z54;
                    objM87133R25 = c28655q2.m87133R();
                    if (z55) {
                        final int i91112 = 1;
                        objM87133R25 = new Function1() { // from class: bs1.o
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i91112) {
                                    case 0:
                                        return AbstractC3583c0.m10915z1(function16, c13821r1, function9, ((Boolean) obj).booleanValue());
                                    default:
                                        return AbstractC3583c0.m10735A1(function16, c13821r1, function9, (C9598e) obj);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R25);
                    } else {
                        final int i91113 = 1;
                        objM87133R25 = new Function1() { // from class: bs1.o
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i91113) {
                                    case 0:
                                        return AbstractC3583c0.m10915z1(function16, c13821r1, function9, ((Boolean) obj).booleanValue());
                                    default:
                                        return AbstractC3583c0.m10735A1(function16, c13821r1, function9, (C9598e) obj);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R25);
                    }
                    final Function1 function21116 = (Function1) objM87133R25;
                    if (i69 == 16384) {
                        z56 = true;
                    } else {
                        z56 = false;
                    }
                    boolean zM87153g118 = z56 | c28655q2.m87153g(c13821r1);
                    if ((i18 & 3670016) == 1048576) {
                        z57 = true;
                    } else {
                        z57 = false;
                    }
                    z58 = zM87153g118 | z57;
                    objM87133R26 = c28655q2.m87133R();
                    if (z58) {
                        objM87133R26 = new C3718c(function16, c13821r1, false, onExitClicked, 21);
                        c28655q2.m87172p0(objM87133R26);
                    } else {
                        objM87133R26 = new C3718c(function16, c13821r1, false, onExitClicked, 21);
                        c28655q2.m87172p0(objM87133R26);
                    }
                    final InterfaceC4339a interfaceC4339a114 = (InterfaceC4339a) objM87133R26;
                    Boolean boolValueOf9 = Boolean.valueOf(z26);
                    Boolean boolValueOf10 = Boolean.valueOf(viewState.getIsLoading());
                    if ((i64 & 896) == 256) {
                        z59 = true;
                    } else {
                        z59 = false;
                    }
                    boolean zM87157i114 = z59 | c28655q2.m87157i(viewState);
                    if (i68 == 32) {
                        z60 = true;
                    } else {
                        z60 = false;
                    }
                    zM87157i = zM87157i114 | z60 | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(aVar);
                    objM87133R27 = c28655q2.m87133R();
                    if (zM87157i) {
                        boolean z811 = z26;
                        objM87133R27 = new e(z811, viewState, function15, interfaceC28601c5, interfaceC28601c4, interfaceC2994c0, aVar, null);
                        z64 = z811;
                        function17 = function15;
                        aVar2 = aVar;
                        c28655q2.m87172p0(objM87133R27);
                    } else {
                        boolean z812 = z26;
                        objM87133R27 = new e(z812, viewState, function15, interfaceC28601c5, interfaceC28601c4, interfaceC2994c0, aVar, null);
                        z64 = z812;
                        function17 = function15;
                        aVar2 = aVar;
                        c28655q2.m87172p0(objM87133R27);
                    }
                    AbstractC28683x.m87254h(boolValueOf9, boolValueOf10, (InterfaceC4351m) objM87133R27, c28655q2);
                    if (viewState.getIsSuccess().getShouldRefresh()) {
                        abstractC12336fM34453l2 = viewState.getIsSuccess().getJournalDatePillViewState();
                        if (abstractC12336fM34453l2 instanceof AbstractC12336f.c) {
                            cVar2 = (AbstractC12336f.c) abstractC12336fM34453l2;
                        } else {
                            cVar2 = null;
                        }
                        if (cVar2 != null) {
                            it = cVar2.m34463a().iterator();
                            do {
                                if (it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!((C16613h) next).getIsSelected());
                            c16613h = (C16613h) next;
                            if (c16613h != null) {
                                String strM47166f5 = c16613h.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
                                lM47165e = c16613h.getCycleId();
                                if (lM47165e != null) {
                                    jLongValue = lM47165e.longValue();
                                } else {
                                    jLongValue = 0;
                                }
                                function17.invoke(new AbstractC11103c.j(strM47166f5, jLongValue, false, null, null, false, false, null, 252, null));
                            }
                        }
                    }
                    c12332bM34459r = viewState.getIsSuccess().getShouldShowBottomSheet();
                    if (c12332bM34459r != null) {
                        abstractC12331aM34433c = c12332bM34459r.getType();
                    } else {
                        abstractC12331aM34433c = null;
                    }
                    if (abstractC12331aM34433c instanceof AbstractC12331a.a) {
                        aVar3 = (AbstractC12331a.a) abstractC12331aM34433c;
                    } else {
                        aVar3 = null;
                    }
                    if (aVar3 != null) {
                        function17.invoke(new AbstractC11103c.h(strM34420c));
                    }
                    if (((Collection) interfaceC28601c2.getValue()).isEmpty()) {
                        c28655q2.m87150e0(1499406798);
                        c12332bM34459r3 = viewState.getIsSuccess().getShouldShowBottomSheet();
                        if (c12332bM34459r3 != null) {
                            abstractC12331aM34433c2 = c12332bM34459r3.getType();
                        } else {
                            abstractC12331aM34433c2 = null;
                        }
                        if (abstractC12331aM34433c2 instanceof AbstractC12331a.a) {
                            aVar5 = (AbstractC12331a.a) abstractC12331aM34433c2;
                        } else {
                            aVar5 = null;
                        }
                        if (aVar5 != null) {
                            c22582fM65421f = null;
                        } else {
                            c22582fM65421f = null;
                        }
                        if (c22582fM65421f == null) {
                            c28655q2.m87150e0(-763029517);
                            c28655q2.m87173q(false);
                            z74 = false;
                            aVar4 = aVar2;
                            function18 = function17;
                            interfaceC28601c6 = interfaceC28601c2;
                        } else {
                            c28655q2.m87150e0(-763029516);
                            abstractC12331aM34433c3 = viewState.getIsSuccess().getShouldShowBottomSheet().getType();
                            if (abstractC12331aM34433c3 instanceof AbstractC12331a.a) {
                                aVar6 = (AbstractC12331a.a) abstractC12331aM34433c3;
                            } else {
                                aVar6 = null;
                            }
                            if (aVar6 != null) {
                                listM34419b = aVar6.m34419b();
                            } else {
                                listM34419b = null;
                            }
                            if (listM34419b == null) {
                                listM34419b = c25271y;
                            }
                            List list9 = (List) interfaceC28601c2.getValue();
                            List list10 = (List) interfaceC28601c3.getValue();
                            C22582f c22582f5 = c22582fM65421f;
                            if (i68 == 32) {
                                z69 = true;
                            } else {
                                z69 = false;
                            }
                            zM87157i2 = z69 | c28655q2.m87157i(listM34419b) | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(aVar2);
                            objM87133R30 = c28655q2.m87133R();
                            if (zM87157i2) {
                                AbstractC35664f.a aVar18 = aVar2;
                                Function1 function21117 = function17;
                                objM87133R30 = new C1008b(listM34419b, function21117, interfaceC2994c0, aVar18, interfaceC28601c4, interfaceC28601c2);
                                function18 = function21117;
                                aVar4 = aVar18;
                                interfaceC28601c6 = interfaceC28601c2;
                                c28655q2.m87172p0(objM87133R30);
                            } else {
                                AbstractC35664f.a aVar19 = aVar2;
                                Function1 function21118 = function17;
                                objM87133R30 = new C1008b(listM34419b, function21118, interfaceC2994c0, aVar19, interfaceC28601c4, interfaceC28601c2);
                                function18 = function21118;
                                aVar4 = aVar19;
                                interfaceC28601c6 = interfaceC28601c2;
                                c28655q2.m87172p0(objM87133R30);
                            }
                            Function1 function21119 = (Function1) objM87133R30;
                            objM87133R31 = c28655q2.m87133R();
                            if (objM87133R31 == c28676v0) {
                                objM87133R31 = new C3598q(interfaceC28601c6, 1);
                                c28655q2.m87172p0(objM87133R31);
                            }
                            AbstractC41069c.m133347o(c22582f5, list9, list10, false, function21119, (InterfaceC4339a) objM87133R31, c28655q2, C22582f.f88880e | ProfileVerifier.CompilationStatus.f6515xf2722a21, 8);
                            z74 = false;
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z74);
                    } else {
                        aVar4 = aVar2;
                        function18 = function17;
                        interfaceC28601c6 = interfaceC28601c2;
                        c28655q2.m87150e0(-762104848);
                        c28655q2.m87173q(false);
                    }
                    EnumC15209z3 enumC15209z3M43221b5 = c15199y3M3460c.m43221b();
                    EnumC15209z3 enumC15209z3M43222c5 = c15199y3M3460c.m43222c();
                    boolean zM87157i115 = c28655q2.m87157i(c15199y3M3460c) | c28655q2.m87157i(viewState);
                    if ((i18 & 112) == 32) {
                        z65 = true;
                    } else {
                        z65 = false;
                    }
                    zM87153g3 = z65 | zM87157i115 | c28655q2.m87153g(interfaceC28601c1M87238F);
                    objM87133R28 = c28655q2.m87133R();
                    if (zM87153g3) {
                        objM87133R28 = new g(c15199y3M3460c, viewState, onJournalQuestionClicked, interfaceC28601c1M87238F, null);
                        c12341k = viewState;
                        c28655q2.m87172p0(objM87133R28);
                    } else {
                        objM87133R28 = new g(c15199y3M3460c, viewState, onJournalQuestionClicked, interfaceC28601c1M87238F, null);
                        c12341k = viewState;
                        c28655q2.m87172p0(objM87133R28);
                    }
                    AbstractC28683x.m87254h(enumC15209z3M43221b5, enumC15209z3M43222c5, (InterfaceC4351m) objM87133R28, c28655q2);
                    C15199y3 c15199y3M112950a5 = aVar4.getModalBottomSheetState();
                    C12332b c12332bM34459r8 = c12341k.getIsSuccess().getShouldShowBottomSheet();
                    boolean zM87157i116 = c28655q2.m87157i(aVar4);
                    if ((i64 & 14) == 4) {
                        z66 = true;
                    } else {
                        z66 = false;
                    }
                    boolean zM87157i117 = z66 | zM87157i116 | c28655q2.m87157i(c12341k);
                    if ((i34 & 1879048192) == 536870912) {
                        z67 = true;
                    } else {
                        z67 = false;
                    }
                    z68 = zM87157i117 | z67;
                    objM87133R29 = c28655q2.m87133R();
                    if (z68) {
                        InterfaceC4351m interfaceC4351m1111 = interfaceC4351m12;
                        objM87133R29 = new h(aVar4, interfaceC4351m1111, c12341k, interfaceC28601c4, interfaceC4339a8, null);
                        interfaceC4351m14 = interfaceC4351m1111;
                        interfaceC4339a10 = interfaceC4339a8;
                        c28655q2.m87172p0(objM87133R29);
                    } else {
                        InterfaceC4351m interfaceC4351m1112 = interfaceC4351m12;
                        objM87133R29 = new h(aVar4, interfaceC4351m1112, c12341k, interfaceC28601c4, interfaceC4339a8, null);
                        interfaceC4351m14 = interfaceC4351m1112;
                        interfaceC4339a10 = interfaceC4339a8;
                        c28655q2.m87172p0(objM87133R29);
                    }
                    AbstractC28683x.m87254h(c15199y3M112950a5, c12332bM34459r8, (InterfaceC4351m) objM87133R29, c28655q2);
                    aiActionM34446e = viewState.getIsSuccess().getCoachAiAction();
                    if (aiActionM34446e != null) {
                        c13404jM18524b = AbstractC6219a.m18524b(aiActionM34446e, true);
                    } else {
                        c13404jM18524b = null;
                    }
                    Modifier modifierM34129b5 = AbstractC12250f.m34129b(AbstractC1102d.m3407d(1.0f, m10912y2(C2314t.f9131w, viewState.getIsIntraday())), c13404jM18524b, false, c28655q2, C13404j.f46947x << 3, 2);
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM34129b5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d5);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m5);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N5);
                    c12332bM34459r2 = viewState.getIsSuccess().getShouldShowBottomSheet();
                    if (c12332bM34459r2 != null) {
                        textResourceM30853e = null;
                    } else {
                        textResourceM30853e = null;
                    }
                    Function1 function211110 = function10;
                    final AbstractC35664f.a aVar110 = aVar4;
                    final Function1 function211111 = function16;
                    final C13821r1 c13821r6 = c13821r1;
                    final Function1 function211112 = function18;
                    Function1 function211113 = function9;
                    AbstractC35660d.m112871m(null, new C35666g(textResourceM30853e, null, null, null, null, 0.0f, 0.0f, 126, null), aVar110, null, null, null, null, AbstractC37817c.m121344e(-1468159270, c28655q2, new C3602u(viewState, onJournalQuestionClicked, interfaceC2994c0, c15199y3M3460c, aVar4, function18, function211110, interfaceC28601c6, interfaceC28601c3, interfaceC28601c4, interfaceC28601c5)), false, null, null, null, false, null, AbstractC37817c.m121344e(1150183326, c28655q2, new InterfaceC4351m() { // from class: bs1.y
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC3583c0.m10773M1(viewState, onSavedFinish, function21115, onRefresh, onSavedClicked, function211112, interfaceC28601c110, c15199y3M3460c, interfaceC2994c0, aVar110, onExitClicked, interfaceC4339a114, interfaceC28601c5, interfaceC28601c4, onNeverShowDismissDialogClick, onDismissConfirmationDialogClicked, function211111, c13821r6, interfaceC28601c111, function21116, interfaceC4351m11, onCalendarOpened, onDateClicked, defaultToggleCallbackType, onDefaultsQuestionClicked, interfaceC28601c19, onJournalQuestionClicked, interfaceC23462h5, interfaceC28690z0, onCalendarPaged, (Composer) obj, iIntValue);
                        }
                    }), c28655q2, (C35666g.f151591h << 3) | 12582912 | (AbstractC35664f.a.f151587c << 6), 24576, 16249);
                    if (z19) {
                        c28655q2.m87150e0(-352673422);
                        AbstractC24936d.m73080z("INTRADAY_JOURNAL_ONBOARDING", c24937e3, false, null, null, null, null, c28655q2, (C24937e.f97642j << 3) | ((i34 >> 3) & 112), 124);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-352485066);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    function8 = function211111;
                    function7 = function211112;
                    c28655q = c28655q2;
                    z16 = z19;
                    z17 = z64;
                    j13 = j14;
                    interfaceC4339a3 = interfaceC4339a10;
                    function5 = function211113;
                    interfaceC4351m5 = interfaceC4351m13;
                    interfaceC4351m4 = interfaceC4351m14;
                    function6 = function211110;
                    c24937e2 = c24937e3;
                    i65 = i74;
                    z18 = z39;
                    interfaceC4339a4 = interfaceC4339a9;
                    interfaceC4351m6 = interfaceC4351m11;
                } else {
                    interfaceC4351m12 = interfaceC4351m10;
                }
                if (viewState.getIsLoading()) {
                    z27 = false;
                } else {
                    z27 = false;
                }
                c28655q2.m87152f0(1903845737);
                c26669a = C29155a.f118017b;
                if (c26669a != null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                c38266c = c26669a.f106046a.f159364d;
                c28655q2.m87152f0(-3686552);
                zM87153g2 = c28655q2.m87153g(null) | c28655q2.m87153g(null);
                objM87133R13 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R13 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null));
                    c28655q2.m87172p0(objM87133R13);
                } else {
                    objM87133R13 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null));
                    c28655q2.m87172p0(objM87133R13);
                }
                c28655q2.m87173q(false);
                final InterfaceC23462h interfaceC23462h6 = (InterfaceC23462h) objM87133R13;
                c28655q2.m87173q(false);
                objM87133R14 = c28655q2.m87133R();
                if (objM87133R14 == c28676v0) {
                    objM87133R14 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R14);
                }
                final InterfaceC28601c1 interfaceC28601c112 = (InterfaceC28601c1) objM87133R14;
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(c28655q2.m87161k(AbstractC2453v1.f9577p), c28655q2);
                c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q2, 3078, 6);
                aVar = new AbstractC35664f.a(c15199y3M3460c);
                objM87133R15 = c28655q2.m87133R();
                if (objM87133R15 == c28676v0) {
                    objM87133R15 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R15);
                }
                final InterfaceC28601c1 interfaceC28601c113 = (InterfaceC28601c1) objM87133R15;
                objM87133R16 = c28655q2.m87133R();
                c25271y = C25271y.f99162w;
                if (objM87133R16 == c28676v0) {
                    objM87133R16 = AbstractC28683x.m87272z(c25271y);
                    c28655q2.m87172p0(objM87133R16);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R16;
                objM87133R17 = c28655q2.m87133R();
                if (objM87133R17 == c28676v0) {
                    objM87133R17 = AbstractC28683x.m87272z(c25271y);
                    c28655q2.m87172p0(objM87133R17);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R17;
                objM87133R18 = c28655q2.m87133R();
                if (objM87133R18 == c28676v0) {
                    objM87133R18 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R18);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R18;
                objM87133R19 = c28655q2.m87133R();
                if (objM87133R19 == c28676v0) {
                    objM87133R19 = AbstractC28683x.m87272z(Boolean.TRUE);
                    c28655q2.m87172p0(objM87133R19);
                }
                interfaceC28601c5 = (InterfaceC28601c1) objM87133R19;
                objM87133R20 = c28655q2.m87133R();
                if (objM87133R20 == c28676v0) {
                    objM87133R20 = AbstractC11895b.m32005x(0, c28655q2);
                }
                final InterfaceC28601c1 interfaceC28601c114 = (InterfaceC28601c1) objM87133R20;
                C9598e c9598eM34456o6 = viewState.getIsSuccess().getOnSaveNavigation();
                boolean zM87157i118 = c28655q2.m87157i(viewState) | c28655q2.m87157i(c15199y3M3460c);
                i68 = i64 & 112;
                if (i68 == 32) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = zM87157i118 | z28;
                objM87133R21 = c28655q2.m87133R();
                if (z29) {
                    objM87133R21 = new b(viewState, c15199y3M3460c, function12, null);
                    c28655q2.m87172p0(objM87133R21);
                } else {
                    objM87133R21 = new b(viewState, c15199y3M3460c, function12, null);
                    c28655q2.m87172p0(objM87133R21);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R21, c9598eM34456o6);
                Object[] objArr6 = {strM34470d, Boolean.valueOf(z27), Integer.valueOf(i67), Boolean.valueOf(z25)};
                boolean zM87155h6 = c28655q2.m87155h(z27) | c28655q2.m87153g(interfaceC28601c1);
                if ((458752 & i64) == 131072) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                boolean zM87153g119 = zM87155h6 | z34 | c28655q2.m87153g(c13821r1M92099U);
                i69 = 57344 & i64;
                if (i69 == 16384) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                boolean z71110 = zM87153g119 | z35;
                function15 = function12;
                if ((3670016 & i64) == 1048576) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                boolean z71111 = z36 | z71110;
                if ((i64 & 7168) == 2048) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                z38 = z71111 | z37;
                objM87133R22 = c28655q2.m87133R();
                if (z38) {
                    int i91114 = i67;
                    Function1 function118 = function14;
                    boolean z71112 = z25;
                    InterfaceC4339a interfaceC4339a115 = interfaceC4339a7;
                    objM87133R22 = new c(z27, interfaceC28601c1, z71112, c13821r1M92099U, function118, interfaceC4339a115, i91114, null);
                    z39 = z71112;
                    c13821r1 = c13821r1M92099U;
                    function16 = function118;
                    interfaceC4339a9 = interfaceC4339a115;
                    i74 = i91114;
                    c28655q2.m87172p0(objM87133R22);
                } else {
                    int i91115 = i67;
                    Function1 function119 = function14;
                    boolean z71113 = z25;
                    InterfaceC4339a interfaceC4339a116 = interfaceC4339a7;
                    objM87133R22 = new c(z27, interfaceC28601c1, z71113, c13821r1M92099U, function119, interfaceC4339a116, i91115, null);
                    z39 = z71113;
                    c13821r1 = c13821r1M92099U;
                    function16 = function119;
                    interfaceC4339a9 = interfaceC4339a116;
                    i74 = i91115;
                    c28655q2.m87172p0(objM87133R22);
                }
                AbstractC28683x.m87256j(objArr6, (InterfaceC4351m) objM87133R22, c28655q2);
                c12337gM34447f3 = viewState.getIsSuccess().getDateSelectorState();
                if (c12337gM34447f3 != null) {
                    strM34470d2 = c12337gM34447f3.getCurrentDate();
                } else {
                    strM34470d2 = null;
                }
                abstractC12336fM34453l = viewState.getIsSuccess().getJournalDatePillViewState();
                if (abstractC12336fM34453l instanceof AbstractC12336f.c) {
                    cVar = (AbstractC12336f.c) abstractC12336fM34453l;
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    listM34463a = cVar.m34463a();
                } else {
                    listM34463a = null;
                }
                boolean zM87153g1110 = c28655q2.m87153g(strM34470d2) | c28655q2.m87157i(listM34463a);
                if ((i64 & 29360128) == 8388608) {
                    z44 = true;
                } else {
                    z44 = false;
                }
                boolean z71114 = zM87153g1110 | z44;
                if ((234881024 & i64) == 67108864) {
                    z45 = true;
                } else {
                    z45 = false;
                }
                z46 = z71114 | z45;
                objM87133R23 = c28655q2.m87133R();
                if (z46) {
                    InterfaceC4351m interfaceC4351m1113 = interfaceC4351m9;
                    objM87133R23 = new d(strM34470d2, listM34463a, j14, interfaceC4351m1113, null);
                    interfaceC4351m13 = interfaceC4351m1113;
                    c28655q2.m87172p0(objM87133R23);
                } else {
                    InterfaceC4351m interfaceC4351m1114 = interfaceC4351m9;
                    objM87133R23 = new d(strM34470d2, listM34463a, j14, interfaceC4351m1114, null);
                    interfaceC4351m13 = interfaceC4351m1114;
                    c28655q2.m87172p0(objM87133R23);
                }
                AbstractC28683x.m87254h(strM34470d2, listM34463a, (InterfaceC4351m) objM87133R23, c28655q2);
                if (i69 == 16384) {
                    z47 = true;
                } else {
                    z47 = false;
                }
                boolean zM87153g1111 = z47 | c28655q2.m87153g(c13821r1);
                if ((i18 & 29360128) == 8388608) {
                    z48 = true;
                } else {
                    z48 = false;
                }
                z49 = zM87153g1111 | z48;
                objM87133R24 = c28655q2.m87133R();
                if (z49) {
                    final int i91116 = 0;
                    objM87133R24 = new Function1() { // from class: bs1.o
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i91116) {
                                case 0:
                                    return AbstractC3583c0.m10915z1(function16, c13821r1, exit, ((Boolean) obj).booleanValue());
                                default:
                                    return AbstractC3583c0.m10735A1(function16, c13821r1, exit, (C9598e) obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R24);
                } else {
                    final int i91117 = 0;
                    objM87133R24 = new Function1() { // from class: bs1.o
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i91117) {
                                case 0:
                                    return AbstractC3583c0.m10915z1(function16, c13821r1, exit, ((Boolean) obj).booleanValue());
                                default:
                                    return AbstractC3583c0.m10735A1(function16, c13821r1, exit, (C9598e) obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R24);
                }
                final Function1 function211114 = (Function1) objM87133R24;
                if (i69 == 16384) {
                    z52 = true;
                } else {
                    z52 = false;
                }
                boolean zM87153g1112 = z52 | c28655q2.m87153g(c13821r1);
                if ((i34 & 29360128) == 8388608) {
                    z54 = true;
                } else {
                    z54 = false;
                }
                z55 = zM87153g1112 | z54;
                objM87133R25 = c28655q2.m87133R();
                if (z55) {
                    final int i91118 = 1;
                    objM87133R25 = new Function1() { // from class: bs1.o
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i91118) {
                                case 0:
                                    return AbstractC3583c0.m10915z1(function16, c13821r1, function9, ((Boolean) obj).booleanValue());
                                default:
                                    return AbstractC3583c0.m10735A1(function16, c13821r1, function9, (C9598e) obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R25);
                } else {
                    final int i91119 = 1;
                    objM87133R25 = new Function1() { // from class: bs1.o
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i91119) {
                                case 0:
                                    return AbstractC3583c0.m10915z1(function16, c13821r1, function9, ((Boolean) obj).booleanValue());
                                default:
                                    return AbstractC3583c0.m10735A1(function16, c13821r1, function9, (C9598e) obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R25);
                }
                final Function1 function211115 = (Function1) objM87133R25;
                if (i69 == 16384) {
                    z56 = true;
                } else {
                    z56 = false;
                }
                boolean zM87153g1113 = z56 | c28655q2.m87153g(c13821r1);
                if ((i18 & 3670016) == 1048576) {
                    z57 = true;
                } else {
                    z57 = false;
                }
                z58 = zM87153g1113 | z57;
                objM87133R26 = c28655q2.m87133R();
                if (z58) {
                    objM87133R26 = new C3718c(function16, c13821r1, false, onExitClicked, 21);
                    c28655q2.m87172p0(objM87133R26);
                } else {
                    objM87133R26 = new C3718c(function16, c13821r1, false, onExitClicked, 21);
                    c28655q2.m87172p0(objM87133R26);
                }
                final InterfaceC4339a interfaceC4339a117 = (InterfaceC4339a) objM87133R26;
                Boolean boolValueOf11 = Boolean.valueOf(z26);
                Boolean boolValueOf12 = Boolean.valueOf(viewState.getIsLoading());
                if ((i64 & 896) == 256) {
                    z59 = true;
                } else {
                    z59 = false;
                }
                boolean zM87157i119 = z59 | c28655q2.m87157i(viewState);
                if (i68 == 32) {
                    z60 = true;
                } else {
                    z60 = false;
                }
                zM87157i = zM87157i119 | z60 | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(aVar);
                objM87133R27 = c28655q2.m87133R();
                if (zM87157i) {
                    boolean z813 = z26;
                    objM87133R27 = new e(z813, viewState, function15, interfaceC28601c5, interfaceC28601c4, interfaceC2994c0, aVar, null);
                    z64 = z813;
                    function17 = function15;
                    aVar2 = aVar;
                    c28655q2.m87172p0(objM87133R27);
                } else {
                    boolean z814 = z26;
                    objM87133R27 = new e(z814, viewState, function15, interfaceC28601c5, interfaceC28601c4, interfaceC2994c0, aVar, null);
                    z64 = z814;
                    function17 = function15;
                    aVar2 = aVar;
                    c28655q2.m87172p0(objM87133R27);
                }
                AbstractC28683x.m87254h(boolValueOf11, boolValueOf12, (InterfaceC4351m) objM87133R27, c28655q2);
                if (viewState.getIsSuccess().getShouldRefresh()) {
                    abstractC12336fM34453l2 = viewState.getIsSuccess().getJournalDatePillViewState();
                    if (abstractC12336fM34453l2 instanceof AbstractC12336f.c) {
                        cVar2 = (AbstractC12336f.c) abstractC12336fM34453l2;
                    } else {
                        cVar2 = null;
                    }
                    if (cVar2 != null) {
                        it = cVar2.m34463a().iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!((C16613h) next).getIsSelected());
                        c16613h = (C16613h) next;
                        if (c16613h != null) {
                            String strM47166f6 = c16613h.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
                            lM47165e = c16613h.getCycleId();
                            if (lM47165e != null) {
                                jLongValue = lM47165e.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            function17.invoke(new AbstractC11103c.j(strM47166f6, jLongValue, false, null, null, false, false, null, 252, null));
                        }
                    }
                }
                c12332bM34459r = viewState.getIsSuccess().getShouldShowBottomSheet();
                if (c12332bM34459r != null) {
                    abstractC12331aM34433c = c12332bM34459r.getType();
                } else {
                    abstractC12331aM34433c = null;
                }
                if (abstractC12331aM34433c instanceof AbstractC12331a.a) {
                    aVar3 = (AbstractC12331a.a) abstractC12331aM34433c;
                } else {
                    aVar3 = null;
                }
                if (aVar3 != null) {
                    function17.invoke(new AbstractC11103c.h(strM34420c));
                }
                if (((Collection) interfaceC28601c2.getValue()).isEmpty()) {
                    c28655q2.m87150e0(1499406798);
                    c12332bM34459r3 = viewState.getIsSuccess().getShouldShowBottomSheet();
                    if (c12332bM34459r3 != null) {
                        abstractC12331aM34433c2 = c12332bM34459r3.getType();
                    } else {
                        abstractC12331aM34433c2 = null;
                    }
                    if (abstractC12331aM34433c2 instanceof AbstractC12331a.a) {
                        aVar5 = (AbstractC12331a.a) abstractC12331aM34433c2;
                    } else {
                        aVar5 = null;
                    }
                    if (aVar5 != null) {
                        c22582fM65421f = null;
                    } else {
                        c22582fM65421f = null;
                    }
                    if (c22582fM65421f == null) {
                        c28655q2.m87150e0(-763029517);
                        c28655q2.m87173q(false);
                        z74 = false;
                        aVar4 = aVar2;
                        function18 = function17;
                        interfaceC28601c6 = interfaceC28601c2;
                    } else {
                        c28655q2.m87150e0(-763029516);
                        abstractC12331aM34433c3 = viewState.getIsSuccess().getShouldShowBottomSheet().getType();
                        if (abstractC12331aM34433c3 instanceof AbstractC12331a.a) {
                            aVar6 = (AbstractC12331a.a) abstractC12331aM34433c3;
                        } else {
                            aVar6 = null;
                        }
                        if (aVar6 != null) {
                            listM34419b = aVar6.m34419b();
                        } else {
                            listM34419b = null;
                        }
                        if (listM34419b == null) {
                            listM34419b = c25271y;
                        }
                        List list11 = (List) interfaceC28601c2.getValue();
                        List list12 = (List) interfaceC28601c3.getValue();
                        C22582f c22582f6 = c22582fM65421f;
                        if (i68 == 32) {
                            z69 = true;
                        } else {
                            z69 = false;
                        }
                        zM87157i2 = z69 | c28655q2.m87157i(listM34419b) | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(aVar2);
                        objM87133R30 = c28655q2.m87133R();
                        if (zM87157i2) {
                            AbstractC35664f.a aVar111 = aVar2;
                            Function1 function211116 = function17;
                            objM87133R30 = new C1008b(listM34419b, function211116, interfaceC2994c0, aVar111, interfaceC28601c4, interfaceC28601c2);
                            function18 = function211116;
                            aVar4 = aVar111;
                            interfaceC28601c6 = interfaceC28601c2;
                            c28655q2.m87172p0(objM87133R30);
                        } else {
                            AbstractC35664f.a aVar112 = aVar2;
                            Function1 function211117 = function17;
                            objM87133R30 = new C1008b(listM34419b, function211117, interfaceC2994c0, aVar112, interfaceC28601c4, interfaceC28601c2);
                            function18 = function211117;
                            aVar4 = aVar112;
                            interfaceC28601c6 = interfaceC28601c2;
                            c28655q2.m87172p0(objM87133R30);
                        }
                        Function1 function211118 = (Function1) objM87133R30;
                        objM87133R31 = c28655q2.m87133R();
                        if (objM87133R31 == c28676v0) {
                            objM87133R31 = new C3598q(interfaceC28601c6, 1);
                            c28655q2.m87172p0(objM87133R31);
                        }
                        AbstractC41069c.m133347o(c22582f6, list11, list12, false, function211118, (InterfaceC4339a) objM87133R31, c28655q2, C22582f.f88880e | ProfileVerifier.CompilationStatus.f6515xf2722a21, 8);
                        z74 = false;
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z74);
                } else {
                    aVar4 = aVar2;
                    function18 = function17;
                    interfaceC28601c6 = interfaceC28601c2;
                    c28655q2.m87150e0(-762104848);
                    c28655q2.m87173q(false);
                }
                EnumC15209z3 enumC15209z3M43221b6 = c15199y3M3460c.m43221b();
                EnumC15209z3 enumC15209z3M43222c6 = c15199y3M3460c.m43222c();
                boolean zM87157i1110 = c28655q2.m87157i(c15199y3M3460c) | c28655q2.m87157i(viewState);
                if ((i18 & 112) == 32) {
                    z65 = true;
                } else {
                    z65 = false;
                }
                zM87153g3 = z65 | zM87157i1110 | c28655q2.m87153g(interfaceC28601c1M87238F);
                objM87133R28 = c28655q2.m87133R();
                if (zM87153g3) {
                    objM87133R28 = new g(c15199y3M3460c, viewState, onJournalQuestionClicked, interfaceC28601c1M87238F, null);
                    c12341k = viewState;
                    c28655q2.m87172p0(objM87133R28);
                } else {
                    objM87133R28 = new g(c15199y3M3460c, viewState, onJournalQuestionClicked, interfaceC28601c1M87238F, null);
                    c12341k = viewState;
                    c28655q2.m87172p0(objM87133R28);
                }
                AbstractC28683x.m87254h(enumC15209z3M43221b6, enumC15209z3M43222c6, (InterfaceC4351m) objM87133R28, c28655q2);
                C15199y3 c15199y3M112950a6 = aVar4.getModalBottomSheetState();
                C12332b c12332bM34459r9 = c12341k.getIsSuccess().getShouldShowBottomSheet();
                boolean zM87157i1111 = c28655q2.m87157i(aVar4);
                if ((i64 & 14) == 4) {
                    z66 = true;
                } else {
                    z66 = false;
                }
                boolean zM87157i1112 = z66 | zM87157i1111 | c28655q2.m87157i(c12341k);
                if ((i34 & 1879048192) == 536870912) {
                    z67 = true;
                } else {
                    z67 = false;
                }
                z68 = zM87157i1112 | z67;
                objM87133R29 = c28655q2.m87133R();
                if (z68) {
                    InterfaceC4351m interfaceC4351m1115 = interfaceC4351m12;
                    objM87133R29 = new h(aVar4, interfaceC4351m1115, c12341k, interfaceC28601c4, interfaceC4339a8, null);
                    interfaceC4351m14 = interfaceC4351m1115;
                    interfaceC4339a10 = interfaceC4339a8;
                    c28655q2.m87172p0(objM87133R29);
                } else {
                    InterfaceC4351m interfaceC4351m1116 = interfaceC4351m12;
                    objM87133R29 = new h(aVar4, interfaceC4351m1116, c12341k, interfaceC28601c4, interfaceC4339a8, null);
                    interfaceC4351m14 = interfaceC4351m1116;
                    interfaceC4339a10 = interfaceC4339a8;
                    c28655q2.m87172p0(objM87133R29);
                }
                AbstractC28683x.m87254h(c15199y3M112950a6, c12332bM34459r9, (InterfaceC4351m) objM87133R29, c28655q2);
                aiActionM34446e = viewState.getIsSuccess().getCoachAiAction();
                if (aiActionM34446e != null) {
                    c13404jM18524b = AbstractC6219a.m18524b(aiActionM34446e, true);
                } else {
                    c13404jM18524b = null;
                }
                Modifier modifierM34129b6 = AbstractC12250f.m34129b(AbstractC1102d.m3407d(1.0f, m10912y2(C2314t.f9131w, viewState.getIsIntraday())), c13404jM18524b, false, c28655q2, C13404j.f46947x << 3, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM34129b6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d6);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m6);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N6);
                c12332bM34459r2 = viewState.getIsSuccess().getShouldShowBottomSheet();
                if (c12332bM34459r2 != null) {
                    textResourceM30853e = null;
                } else {
                    textResourceM30853e = null;
                }
                Function1 function211119 = function10;
                final AbstractC35664f.a aVar113 = aVar4;
                final Function1 function2111110 = function16;
                final C13821r1 c13821r7 = c13821r1;
                final Function1 function2111111 = function18;
                Function1 function2111112 = function9;
                AbstractC35660d.m112871m(null, new C35666g(textResourceM30853e, null, null, null, null, 0.0f, 0.0f, 126, null), aVar113, null, null, null, null, AbstractC37817c.m121344e(-1468159270, c28655q2, new C3602u(viewState, onJournalQuestionClicked, interfaceC2994c0, c15199y3M3460c, aVar4, function18, function211119, interfaceC28601c6, interfaceC28601c3, interfaceC28601c4, interfaceC28601c5)), false, null, null, null, false, null, AbstractC37817c.m121344e(1150183326, c28655q2, new InterfaceC4351m() { // from class: bs1.y
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC3583c0.m10773M1(viewState, onSavedFinish, function211114, onRefresh, onSavedClicked, function2111111, interfaceC28601c113, c15199y3M3460c, interfaceC2994c0, aVar113, onExitClicked, interfaceC4339a117, interfaceC28601c5, interfaceC28601c4, onNeverShowDismissDialogClick, onDismissConfirmationDialogClicked, function2111110, c13821r7, interfaceC28601c114, function211115, interfaceC4351m11, onCalendarOpened, onDateClicked, defaultToggleCallbackType, onDefaultsQuestionClicked, interfaceC28601c112, onJournalQuestionClicked, interfaceC23462h6, interfaceC28690z0, onCalendarPaged, (Composer) obj, iIntValue);
                    }
                }), c28655q2, (C35666g.f151591h << 3) | 12582912 | (AbstractC35664f.a.f151587c << 6), 24576, 16249);
                if (z19) {
                    c28655q2.m87150e0(-352673422);
                    AbstractC24936d.m73080z("INTRADAY_JOURNAL_ONBOARDING", c24937e3, false, null, null, null, null, c28655q2, (C24937e.f97642j << 3) | ((i34 >> 3) & 112), 124);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-352485066);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(true);
                function8 = function2111110;
                function7 = function2111111;
                c28655q = c28655q2;
                z16 = z19;
                z17 = z64;
                j13 = j14;
                interfaceC4339a3 = interfaceC4339a10;
                function5 = function2111112;
                interfaceC4351m5 = interfaceC4351m13;
                interfaceC4351m4 = interfaceC4351m14;
                function6 = function211119;
                c24937e2 = c24937e3;
                i65 = i74;
                z18 = z39;
                interfaceC4339a4 = interfaceC4339a9;
                interfaceC4351m6 = interfaceC4351m11;
            } else {
                c28655q2.m87138X();
                z16 = z4;
                c24937e2 = c24937e;
                function5 = function1;
                function6 = function2;
                interfaceC4339a3 = interfaceC4339a;
                interfaceC4351m4 = interfaceC4351m2;
                function7 = function3;
                z17 = z13;
                i65 = i13;
                function8 = function4;
                z18 = z14;
                interfaceC4339a4 = interfaceC4339a2;
                j13 = j7;
                interfaceC4351m5 = interfaceC4351m3;
                c28655q = c28655q2;
                interfaceC4351m6 = interfaceC4351m;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs1.b0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC3583c0.m10844h2(viewState, onJournalQuestionClicked, defaultToggleCallbackType, onRefresh, onSavedClicked, onSavedFinish, onExitClicked, exit, onNeverShowDismissDialogClick, onDismissConfirmationDialogClicked, onDefaultsQuestionClicked, z16, c24937e2, onDateClicked, interfaceC4351m6, onCalendarOpened, onCalendarPaged, function5, function6, interfaceC4339a3, interfaceC4351m4, function7, z17, i65, function8, z18, interfaceC4339a4, j13, interfaceC4351m5, i14, i15, i16, i17, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i55 = i49 | 24576;
        i56 = i17 & AndroidSDKConstants.FLAG_MUTABLE;
        if (i56 != 0) {
            i55 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        } else if ((i36 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q2.m87155h(z14)) {
                i86 = 131072;
            }
            i55 |= i86;
        }
        i57 = i17 & 67108864;
        if (i57 != 0) {
            i55 |= 1572864;
        } else if ((i16 & 1572864) == 0) {
            i55 |= c28655q2.m87157i(interfaceC4339a2) ? 1048576 : 524288;
        }
        i58 = i17 & 134217728;
        if (i58 != 0) {
            i55 |= 12582912;
        } else if ((i16 & 12582912) == 0) {
            i55 |= c28655q2.m87151f(j7) ? 8388608 : 4194304;
        }
        i59 = i17 & 268435456;
        if (i59 != 0) {
            i55 |= 100663296;
        } else if ((i16 & 100663296) == 0) {
            if (c28655q2.m87157i(interfaceC4351m3)) {
                i88 = 67108864;
            }
            i55 |= i88;
        }
        i64 = i55;
        if ((i18 & 306783379) != 306783378) {
            z15 = true;
        } else {
            z15 = true;
        }
        if (c28655q2.m87135U(i18 & 1, z15)) {
            c28655q2.m87140Z();
            i66 = i14 & 1;
            c28676v0 = C28635l.f115821a;
            if (i66 != 0) {
                if (i94 != 0) {
                    z19 = false;
                } else {
                    z19 = z4;
                }
                if ((i17 & 4096) != 0) {
                    c24937e3 = new C24937e(false, null, null, null, null, null, null, null, false, 510, null);
                    i34 &= -897;
                } else {
                    c24937e3 = c24937e;
                }
                if (i96 != 0) {
                    objM87133R9 = c28655q2.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C26047n(22);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    interfaceC4351m7 = (InterfaceC4351m) objM87133R9;
                } else {
                    interfaceC4351m7 = interfaceC4351m;
                }
                if (i25 != 0) {
                    objM87133R8 = c28655q2.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C3595n(4);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    function9 = (Function1) objM87133R8;
                } else {
                    function9 = function1;
                }
                if (i27 != 0) {
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C3595n(5);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    function10 = (Function1) objM87133R7;
                } else {
                    function9 = function9;
                    function10 = function2;
                }
                if (i29 != 0) {
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C3509a(8);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC4339a5 = (InterfaceC4339a) objM87133R6;
                } else {
                    function10 = function10;
                    interfaceC4339a5 = interfaceC4339a;
                }
                if (i35 != 0) {
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C26047n(23);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC4351m8 = (InterfaceC4351m) objM87133R5;
                } else {
                    interfaceC4339a5 = interfaceC4339a5;
                    interfaceC4351m8 = interfaceC4351m2;
                }
                if (i38 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C3595n(0);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function11 = (Function1) objM87133R4;
                } else {
                    interfaceC4351m8 = interfaceC4351m8;
                    function11 = function3;
                }
                if (i44 != 0) {
                    z24 = false;
                } else {
                    z24 = z13;
                }
                if (i47 != 0) {
                    i67 = 0;
                } else {
                    i67 = i13;
                }
                function12 = function11;
                if (i54 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C3595n(1);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function13 = (Function1) objM87133R3;
                } else {
                    i34 = i34;
                    function13 = function4;
                }
                if (i56 != 0) {
                    z25 = false;
                } else {
                    z25 = z14;
                }
                function14 = function13;
                if (i57 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C3509a(9);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                } else {
                    z25 = z25;
                    interfaceC4339a6 = interfaceC4339a2;
                }
                if (i58 != 0) {
                    j14 = 0;
                } else {
                    j14 = j7;
                }
                if (i59 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C26047n(24);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC4339a7 = interfaceC4339a6;
                    interfaceC4351m9 = (InterfaceC4351m) objM87133R;
                } else {
                    interfaceC4339a7 = interfaceC4339a6;
                    interfaceC4351m9 = interfaceC4351m3;
                }
                z26 = z24;
                interfaceC4351m10 = interfaceC4351m8;
            } else {
                if (i94 != 0) {
                    z19 = false;
                } else {
                    z19 = z4;
                }
                if ((i17 & 4096) != 0) {
                    c24937e3 = new C24937e(false, null, null, null, null, null, null, null, false, 510, null);
                    i34 &= -897;
                } else {
                    c24937e3 = c24937e;
                }
                if (i96 != 0) {
                    objM87133R9 = c28655q2.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C26047n(22);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    interfaceC4351m7 = (InterfaceC4351m) objM87133R9;
                } else {
                    interfaceC4351m7 = interfaceC4351m;
                }
                if (i25 != 0) {
                    objM87133R8 = c28655q2.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C3595n(4);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    function9 = (Function1) objM87133R8;
                } else {
                    function9 = function1;
                }
                if (i27 != 0) {
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C3595n(5);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    function10 = (Function1) objM87133R7;
                } else {
                    function9 = function9;
                    function10 = function2;
                }
                if (i29 != 0) {
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C3509a(8);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC4339a5 = (InterfaceC4339a) objM87133R6;
                } else {
                    function10 = function10;
                    interfaceC4339a5 = interfaceC4339a;
                }
                if (i35 != 0) {
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C26047n(23);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC4351m8 = (InterfaceC4351m) objM87133R5;
                } else {
                    interfaceC4339a5 = interfaceC4339a5;
                    interfaceC4351m8 = interfaceC4351m2;
                }
                if (i38 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C3595n(0);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function11 = (Function1) objM87133R4;
                } else {
                    interfaceC4351m8 = interfaceC4351m8;
                    function11 = function3;
                }
                if (i44 != 0) {
                    z24 = false;
                } else {
                    z24 = z13;
                }
                if (i47 != 0) {
                    i67 = 0;
                } else {
                    i67 = i13;
                }
                function12 = function11;
                if (i54 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C3595n(1);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function13 = (Function1) objM87133R3;
                } else {
                    i34 = i34;
                    function13 = function4;
                }
                if (i56 != 0) {
                    z25 = false;
                } else {
                    z25 = z14;
                }
                function14 = function13;
                if (i57 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C3509a(9);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                } else {
                    z25 = z25;
                    interfaceC4339a6 = interfaceC4339a2;
                }
                if (i58 != 0) {
                    j14 = 0;
                } else {
                    j14 = j7;
                }
                if (i59 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C26047n(24);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC4339a7 = interfaceC4339a6;
                    interfaceC4351m9 = (InterfaceC4351m) objM87133R;
                } else {
                    interfaceC4339a7 = interfaceC4339a6;
                    interfaceC4351m9 = interfaceC4351m3;
                }
                z26 = z24;
                interfaceC4351m10 = interfaceC4351m8;
            }
            c28655q2.m87175r();
            interfaceC4339a8 = interfaceC4339a5;
            objM87133R10 = c28655q2.m87133R();
            if (objM87133R10 == c28676v0) {
                objM87133R10 = AbstractC28683x.m87262p(c28655q2);
                c28655q2.m87172p0(objM87133R10);
            }
            interfaceC2994c0 = (InterfaceC2994c0) objM87133R10;
            interfaceC4351m11 = interfaceC4351m7;
            c13821r1M92099U = AbstractC30060g.m92099U(6, c28655q2, 0);
            objM87133R11 = c28655q2.m87133R();
            if (objM87133R11 == c28676v0) {
                objM87133R11 = AbstractC11266d.m30468v(0.0f, c28655q2);
            }
            interfaceC28690z0 = (InterfaceC28690z0) objM87133R11;
            c12337gM34447f = viewState.getIsSuccess().getDateSelectorState();
            if (c12337gM34447f != null) {
                strM34470d = c12337gM34447f.getCurrentDate();
            } else {
                strM34470d = null;
            }
            if (strM34470d == null) {
                strM34470d = "";
            }
            zM87153g = c28655q2.m87153g(strM34470d);
            objM87133R12 = c28655q2.m87133R();
            if (zM87153g) {
                objM87133R12 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R12);
            } else {
                objM87133R12 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R12);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R12;
            c12337gM34447f2 = viewState.getIsSuccess().getDateSelectorState();
            if (c12337gM34447f2 != null) {
                interfaceC4351m12 = interfaceC4351m10;
                if (c12337gM34447f2.getIsLoading()) {
                }
                if (viewState.getIsLoading()) {
                    z27 = false;
                } else {
                    z27 = false;
                }
                c28655q2.m87152f0(1903845737);
                c26669a = C29155a.f118017b;
                if (c26669a != null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                c38266c = c26669a.f106046a.f159364d;
                c28655q2.m87152f0(-3686552);
                zM87153g2 = c28655q2.m87153g(null) | c28655q2.m87153g(null);
                objM87133R13 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R13 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null));
                    c28655q2.m87172p0(objM87133R13);
                } else {
                    objM87133R13 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null));
                    c28655q2.m87172p0(objM87133R13);
                }
                c28655q2.m87173q(false);
                final InterfaceC23462h interfaceC23462h7 = (InterfaceC23462h) objM87133R13;
                c28655q2.m87173q(false);
                objM87133R14 = c28655q2.m87133R();
                if (objM87133R14 == c28676v0) {
                    objM87133R14 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R14);
                }
                final InterfaceC28601c1 interfaceC28601c115 = (InterfaceC28601c1) objM87133R14;
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(c28655q2.m87161k(AbstractC2453v1.f9577p), c28655q2);
                c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q2, 3078, 6);
                aVar = new AbstractC35664f.a(c15199y3M3460c);
                objM87133R15 = c28655q2.m87133R();
                if (objM87133R15 == c28676v0) {
                    objM87133R15 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R15);
                }
                final InterfaceC28601c1 interfaceC28601c116 = (InterfaceC28601c1) objM87133R15;
                objM87133R16 = c28655q2.m87133R();
                c25271y = C25271y.f99162w;
                if (objM87133R16 == c28676v0) {
                    objM87133R16 = AbstractC28683x.m87272z(c25271y);
                    c28655q2.m87172p0(objM87133R16);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R16;
                objM87133R17 = c28655q2.m87133R();
                if (objM87133R17 == c28676v0) {
                    objM87133R17 = AbstractC28683x.m87272z(c25271y);
                    c28655q2.m87172p0(objM87133R17);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R17;
                objM87133R18 = c28655q2.m87133R();
                if (objM87133R18 == c28676v0) {
                    objM87133R18 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R18);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R18;
                objM87133R19 = c28655q2.m87133R();
                if (objM87133R19 == c28676v0) {
                    objM87133R19 = AbstractC28683x.m87272z(Boolean.TRUE);
                    c28655q2.m87172p0(objM87133R19);
                }
                interfaceC28601c5 = (InterfaceC28601c1) objM87133R19;
                objM87133R20 = c28655q2.m87133R();
                if (objM87133R20 == c28676v0) {
                    objM87133R20 = AbstractC11895b.m32005x(0, c28655q2);
                }
                final InterfaceC28601c1 interfaceC28601c117 = (InterfaceC28601c1) objM87133R20;
                C9598e c9598eM34456o7 = viewState.getIsSuccess().getOnSaveNavigation();
                boolean zM87157i1113 = c28655q2.m87157i(viewState) | c28655q2.m87157i(c15199y3M3460c);
                i68 = i64 & 112;
                if (i68 == 32) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = zM87157i1113 | z28;
                objM87133R21 = c28655q2.m87133R();
                if (z29) {
                    objM87133R21 = new b(viewState, c15199y3M3460c, function12, null);
                    c28655q2.m87172p0(objM87133R21);
                } else {
                    objM87133R21 = new b(viewState, c15199y3M3460c, function12, null);
                    c28655q2.m87172p0(objM87133R21);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R21, c9598eM34456o7);
                Object[] objArr7 = {strM34470d, Boolean.valueOf(z27), Integer.valueOf(i67), Boolean.valueOf(z25)};
                boolean zM87155h7 = c28655q2.m87155h(z27) | c28655q2.m87153g(interfaceC28601c1);
                if ((458752 & i64) == 131072) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                boolean zM87153g1114 = zM87155h7 | z34 | c28655q2.m87153g(c13821r1M92099U);
                i69 = 57344 & i64;
                if (i69 == 16384) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                boolean z71115 = zM87153g1114 | z35;
                function15 = function12;
                if ((3670016 & i64) == 1048576) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                boolean z71116 = z36 | z71115;
                if ((i64 & 7168) == 2048) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                z38 = z71116 | z37;
                objM87133R22 = c28655q2.m87133R();
                if (z38) {
                    int i911110 = i67;
                    Function1 function1110 = function14;
                    boolean z71117 = z25;
                    InterfaceC4339a interfaceC4339a118 = interfaceC4339a7;
                    objM87133R22 = new c(z27, interfaceC28601c1, z71117, c13821r1M92099U, function1110, interfaceC4339a118, i911110, null);
                    z39 = z71117;
                    c13821r1 = c13821r1M92099U;
                    function16 = function1110;
                    interfaceC4339a9 = interfaceC4339a118;
                    i74 = i911110;
                    c28655q2.m87172p0(objM87133R22);
                } else {
                    int i911111 = i67;
                    Function1 function1111 = function14;
                    boolean z71118 = z25;
                    InterfaceC4339a interfaceC4339a119 = interfaceC4339a7;
                    objM87133R22 = new c(z27, interfaceC28601c1, z71118, c13821r1M92099U, function1111, interfaceC4339a119, i911111, null);
                    z39 = z71118;
                    c13821r1 = c13821r1M92099U;
                    function16 = function1111;
                    interfaceC4339a9 = interfaceC4339a119;
                    i74 = i911111;
                    c28655q2.m87172p0(objM87133R22);
                }
                AbstractC28683x.m87256j(objArr7, (InterfaceC4351m) objM87133R22, c28655q2);
                c12337gM34447f3 = viewState.getIsSuccess().getDateSelectorState();
                if (c12337gM34447f3 != null) {
                    strM34470d2 = c12337gM34447f3.getCurrentDate();
                } else {
                    strM34470d2 = null;
                }
                abstractC12336fM34453l = viewState.getIsSuccess().getJournalDatePillViewState();
                if (abstractC12336fM34453l instanceof AbstractC12336f.c) {
                    cVar = (AbstractC12336f.c) abstractC12336fM34453l;
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    listM34463a = cVar.m34463a();
                } else {
                    listM34463a = null;
                }
                boolean zM87153g1115 = c28655q2.m87153g(strM34470d2) | c28655q2.m87157i(listM34463a);
                if ((i64 & 29360128) == 8388608) {
                    z44 = true;
                } else {
                    z44 = false;
                }
                boolean z71119 = zM87153g1115 | z44;
                if ((234881024 & i64) == 67108864) {
                    z45 = true;
                } else {
                    z45 = false;
                }
                z46 = z71119 | z45;
                objM87133R23 = c28655q2.m87133R();
                if (z46) {
                    InterfaceC4351m interfaceC4351m1117 = interfaceC4351m9;
                    objM87133R23 = new d(strM34470d2, listM34463a, j14, interfaceC4351m1117, null);
                    interfaceC4351m13 = interfaceC4351m1117;
                    c28655q2.m87172p0(objM87133R23);
                } else {
                    InterfaceC4351m interfaceC4351m1118 = interfaceC4351m9;
                    objM87133R23 = new d(strM34470d2, listM34463a, j14, interfaceC4351m1118, null);
                    interfaceC4351m13 = interfaceC4351m1118;
                    c28655q2.m87172p0(objM87133R23);
                }
                AbstractC28683x.m87254h(strM34470d2, listM34463a, (InterfaceC4351m) objM87133R23, c28655q2);
                if (i69 == 16384) {
                    z47 = true;
                } else {
                    z47 = false;
                }
                boolean zM87153g1116 = z47 | c28655q2.m87153g(c13821r1);
                if ((i18 & 29360128) == 8388608) {
                    z48 = true;
                } else {
                    z48 = false;
                }
                z49 = zM87153g1116 | z48;
                objM87133R24 = c28655q2.m87133R();
                if (z49) {
                    final int i911112 = 0;
                    objM87133R24 = new Function1() { // from class: bs1.o
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i911112) {
                                case 0:
                                    return AbstractC3583c0.m10915z1(function16, c13821r1, exit, ((Boolean) obj).booleanValue());
                                default:
                                    return AbstractC3583c0.m10735A1(function16, c13821r1, exit, (C9598e) obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R24);
                } else {
                    final int i911113 = 0;
                    objM87133R24 = new Function1() { // from class: bs1.o
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i911113) {
                                case 0:
                                    return AbstractC3583c0.m10915z1(function16, c13821r1, exit, ((Boolean) obj).booleanValue());
                                default:
                                    return AbstractC3583c0.m10735A1(function16, c13821r1, exit, (C9598e) obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R24);
                }
                final Function1 function2111113 = (Function1) objM87133R24;
                if (i69 == 16384) {
                    z52 = true;
                } else {
                    z52 = false;
                }
                boolean zM87153g1117 = z52 | c28655q2.m87153g(c13821r1);
                if ((i34 & 29360128) == 8388608) {
                    z54 = true;
                } else {
                    z54 = false;
                }
                z55 = zM87153g1117 | z54;
                objM87133R25 = c28655q2.m87133R();
                if (z55) {
                    final int i911114 = 1;
                    objM87133R25 = new Function1() { // from class: bs1.o
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i911114) {
                                case 0:
                                    return AbstractC3583c0.m10915z1(function16, c13821r1, function9, ((Boolean) obj).booleanValue());
                                default:
                                    return AbstractC3583c0.m10735A1(function16, c13821r1, function9, (C9598e) obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R25);
                } else {
                    final int i911115 = 1;
                    objM87133R25 = new Function1() { // from class: bs1.o
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i911115) {
                                case 0:
                                    return AbstractC3583c0.m10915z1(function16, c13821r1, function9, ((Boolean) obj).booleanValue());
                                default:
                                    return AbstractC3583c0.m10735A1(function16, c13821r1, function9, (C9598e) obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R25);
                }
                final Function1 function2111114 = (Function1) objM87133R25;
                if (i69 == 16384) {
                    z56 = true;
                } else {
                    z56 = false;
                }
                boolean zM87153g1118 = z56 | c28655q2.m87153g(c13821r1);
                if ((i18 & 3670016) == 1048576) {
                    z57 = true;
                } else {
                    z57 = false;
                }
                z58 = zM87153g1118 | z57;
                objM87133R26 = c28655q2.m87133R();
                if (z58) {
                    objM87133R26 = new C3718c(function16, c13821r1, false, onExitClicked, 21);
                    c28655q2.m87172p0(objM87133R26);
                } else {
                    objM87133R26 = new C3718c(function16, c13821r1, false, onExitClicked, 21);
                    c28655q2.m87172p0(objM87133R26);
                }
                final InterfaceC4339a interfaceC4339a1110 = (InterfaceC4339a) objM87133R26;
                Boolean boolValueOf13 = Boolean.valueOf(z26);
                Boolean boolValueOf14 = Boolean.valueOf(viewState.getIsLoading());
                if ((i64 & 896) == 256) {
                    z59 = true;
                } else {
                    z59 = false;
                }
                boolean zM87157i1114 = z59 | c28655q2.m87157i(viewState);
                if (i68 == 32) {
                    z60 = true;
                } else {
                    z60 = false;
                }
                zM87157i = zM87157i1114 | z60 | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(aVar);
                objM87133R27 = c28655q2.m87133R();
                if (zM87157i) {
                    boolean z815 = z26;
                    objM87133R27 = new e(z815, viewState, function15, interfaceC28601c5, interfaceC28601c4, interfaceC2994c0, aVar, null);
                    z64 = z815;
                    function17 = function15;
                    aVar2 = aVar;
                    c28655q2.m87172p0(objM87133R27);
                } else {
                    boolean z816 = z26;
                    objM87133R27 = new e(z816, viewState, function15, interfaceC28601c5, interfaceC28601c4, interfaceC2994c0, aVar, null);
                    z64 = z816;
                    function17 = function15;
                    aVar2 = aVar;
                    c28655q2.m87172p0(objM87133R27);
                }
                AbstractC28683x.m87254h(boolValueOf13, boolValueOf14, (InterfaceC4351m) objM87133R27, c28655q2);
                if (viewState.getIsSuccess().getShouldRefresh()) {
                    abstractC12336fM34453l2 = viewState.getIsSuccess().getJournalDatePillViewState();
                    if (abstractC12336fM34453l2 instanceof AbstractC12336f.c) {
                        cVar2 = (AbstractC12336f.c) abstractC12336fM34453l2;
                    } else {
                        cVar2 = null;
                    }
                    if (cVar2 != null) {
                        it = cVar2.m34463a().iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!((C16613h) next).getIsSelected());
                        c16613h = (C16613h) next;
                        if (c16613h != null) {
                            String strM47166f7 = c16613h.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
                            lM47165e = c16613h.getCycleId();
                            if (lM47165e != null) {
                                jLongValue = lM47165e.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            function17.invoke(new AbstractC11103c.j(strM47166f7, jLongValue, false, null, null, false, false, null, 252, null));
                        }
                    }
                }
                c12332bM34459r = viewState.getIsSuccess().getShouldShowBottomSheet();
                if (c12332bM34459r != null) {
                    abstractC12331aM34433c = c12332bM34459r.getType();
                } else {
                    abstractC12331aM34433c = null;
                }
                if (abstractC12331aM34433c instanceof AbstractC12331a.a) {
                    aVar3 = (AbstractC12331a.a) abstractC12331aM34433c;
                } else {
                    aVar3 = null;
                }
                if (aVar3 != null) {
                    function17.invoke(new AbstractC11103c.h(strM34420c));
                }
                if (((Collection) interfaceC28601c2.getValue()).isEmpty()) {
                    c28655q2.m87150e0(1499406798);
                    c12332bM34459r3 = viewState.getIsSuccess().getShouldShowBottomSheet();
                    if (c12332bM34459r3 != null) {
                        abstractC12331aM34433c2 = c12332bM34459r3.getType();
                    } else {
                        abstractC12331aM34433c2 = null;
                    }
                    if (abstractC12331aM34433c2 instanceof AbstractC12331a.a) {
                        aVar5 = (AbstractC12331a.a) abstractC12331aM34433c2;
                    } else {
                        aVar5 = null;
                    }
                    if (aVar5 != null) {
                        c22582fM65421f = null;
                    } else {
                        c22582fM65421f = null;
                    }
                    if (c22582fM65421f == null) {
                        c28655q2.m87150e0(-763029517);
                        c28655q2.m87173q(false);
                        z74 = false;
                        aVar4 = aVar2;
                        function18 = function17;
                        interfaceC28601c6 = interfaceC28601c2;
                    } else {
                        c28655q2.m87150e0(-763029516);
                        abstractC12331aM34433c3 = viewState.getIsSuccess().getShouldShowBottomSheet().getType();
                        if (abstractC12331aM34433c3 instanceof AbstractC12331a.a) {
                            aVar6 = (AbstractC12331a.a) abstractC12331aM34433c3;
                        } else {
                            aVar6 = null;
                        }
                        if (aVar6 != null) {
                            listM34419b = aVar6.m34419b();
                        } else {
                            listM34419b = null;
                        }
                        if (listM34419b == null) {
                            listM34419b = c25271y;
                        }
                        List list13 = (List) interfaceC28601c2.getValue();
                        List list14 = (List) interfaceC28601c3.getValue();
                        C22582f c22582f7 = c22582fM65421f;
                        if (i68 == 32) {
                            z69 = true;
                        } else {
                            z69 = false;
                        }
                        zM87157i2 = z69 | c28655q2.m87157i(listM34419b) | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(aVar2);
                        objM87133R30 = c28655q2.m87133R();
                        if (zM87157i2) {
                            AbstractC35664f.a aVar114 = aVar2;
                            Function1 function2111115 = function17;
                            objM87133R30 = new C1008b(listM34419b, function2111115, interfaceC2994c0, aVar114, interfaceC28601c4, interfaceC28601c2);
                            function18 = function2111115;
                            aVar4 = aVar114;
                            interfaceC28601c6 = interfaceC28601c2;
                            c28655q2.m87172p0(objM87133R30);
                        } else {
                            AbstractC35664f.a aVar115 = aVar2;
                            Function1 function2111116 = function17;
                            objM87133R30 = new C1008b(listM34419b, function2111116, interfaceC2994c0, aVar115, interfaceC28601c4, interfaceC28601c2);
                            function18 = function2111116;
                            aVar4 = aVar115;
                            interfaceC28601c6 = interfaceC28601c2;
                            c28655q2.m87172p0(objM87133R30);
                        }
                        Function1 function2111117 = (Function1) objM87133R30;
                        objM87133R31 = c28655q2.m87133R();
                        if (objM87133R31 == c28676v0) {
                            objM87133R31 = new C3598q(interfaceC28601c6, 1);
                            c28655q2.m87172p0(objM87133R31);
                        }
                        AbstractC41069c.m133347o(c22582f7, list13, list14, false, function2111117, (InterfaceC4339a) objM87133R31, c28655q2, C22582f.f88880e | ProfileVerifier.CompilationStatus.f6515xf2722a21, 8);
                        z74 = false;
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z74);
                } else {
                    aVar4 = aVar2;
                    function18 = function17;
                    interfaceC28601c6 = interfaceC28601c2;
                    c28655q2.m87150e0(-762104848);
                    c28655q2.m87173q(false);
                }
                EnumC15209z3 enumC15209z3M43221b7 = c15199y3M3460c.m43221b();
                EnumC15209z3 enumC15209z3M43222c7 = c15199y3M3460c.m43222c();
                boolean zM87157i1115 = c28655q2.m87157i(c15199y3M3460c) | c28655q2.m87157i(viewState);
                if ((i18 & 112) == 32) {
                    z65 = true;
                } else {
                    z65 = false;
                }
                zM87153g3 = z65 | zM87157i1115 | c28655q2.m87153g(interfaceC28601c1M87238F);
                objM87133R28 = c28655q2.m87133R();
                if (zM87153g3) {
                    objM87133R28 = new g(c15199y3M3460c, viewState, onJournalQuestionClicked, interfaceC28601c1M87238F, null);
                    c12341k = viewState;
                    c28655q2.m87172p0(objM87133R28);
                } else {
                    objM87133R28 = new g(c15199y3M3460c, viewState, onJournalQuestionClicked, interfaceC28601c1M87238F, null);
                    c12341k = viewState;
                    c28655q2.m87172p0(objM87133R28);
                }
                AbstractC28683x.m87254h(enumC15209z3M43221b7, enumC15209z3M43222c7, (InterfaceC4351m) objM87133R28, c28655q2);
                C15199y3 c15199y3M112950a7 = aVar4.getModalBottomSheetState();
                C12332b c12332bM34459r10 = c12341k.getIsSuccess().getShouldShowBottomSheet();
                boolean zM87157i1116 = c28655q2.m87157i(aVar4);
                if ((i64 & 14) == 4) {
                    z66 = true;
                } else {
                    z66 = false;
                }
                boolean zM87157i1117 = z66 | zM87157i1116 | c28655q2.m87157i(c12341k);
                if ((i34 & 1879048192) == 536870912) {
                    z67 = true;
                } else {
                    z67 = false;
                }
                z68 = zM87157i1117 | z67;
                objM87133R29 = c28655q2.m87133R();
                if (z68) {
                    InterfaceC4351m interfaceC4351m1119 = interfaceC4351m12;
                    objM87133R29 = new h(aVar4, interfaceC4351m1119, c12341k, interfaceC28601c4, interfaceC4339a8, null);
                    interfaceC4351m14 = interfaceC4351m1119;
                    interfaceC4339a10 = interfaceC4339a8;
                    c28655q2.m87172p0(objM87133R29);
                } else {
                    InterfaceC4351m interfaceC4351m11110 = interfaceC4351m12;
                    objM87133R29 = new h(aVar4, interfaceC4351m11110, c12341k, interfaceC28601c4, interfaceC4339a8, null);
                    interfaceC4351m14 = interfaceC4351m11110;
                    interfaceC4339a10 = interfaceC4339a8;
                    c28655q2.m87172p0(objM87133R29);
                }
                AbstractC28683x.m87254h(c15199y3M112950a7, c12332bM34459r10, (InterfaceC4351m) objM87133R29, c28655q2);
                aiActionM34446e = viewState.getIsSuccess().getCoachAiAction();
                if (aiActionM34446e != null) {
                    c13404jM18524b = AbstractC6219a.m18524b(aiActionM34446e, true);
                } else {
                    c13404jM18524b = null;
                }
                Modifier modifierM34129b7 = AbstractC12250f.m34129b(AbstractC1102d.m3407d(1.0f, m10912y2(C2314t.f9131w, viewState.getIsIntraday())), c13404jM18524b, false, c28655q2, C13404j.f46947x << 3, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM34129b7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d7);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N7);
                c12332bM34459r2 = viewState.getIsSuccess().getShouldShowBottomSheet();
                if (c12332bM34459r2 != null) {
                    textResourceM30853e = null;
                } else {
                    textResourceM30853e = null;
                }
                Function1 function2111118 = function10;
                final AbstractC35664f.a aVar116 = aVar4;
                final Function1 function2111119 = function16;
                final C13821r1 c13821r8 = c13821r1;
                final Function1 function21111110 = function18;
                Function1 function21111111 = function9;
                AbstractC35660d.m112871m(null, new C35666g(textResourceM30853e, null, null, null, null, 0.0f, 0.0f, 126, null), aVar116, null, null, null, null, AbstractC37817c.m121344e(-1468159270, c28655q2, new C3602u(viewState, onJournalQuestionClicked, interfaceC2994c0, c15199y3M3460c, aVar4, function18, function2111118, interfaceC28601c6, interfaceC28601c3, interfaceC28601c4, interfaceC28601c5)), false, null, null, null, false, null, AbstractC37817c.m121344e(1150183326, c28655q2, new InterfaceC4351m() { // from class: bs1.y
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC3583c0.m10773M1(viewState, onSavedFinish, function2111113, onRefresh, onSavedClicked, function21111110, interfaceC28601c116, c15199y3M3460c, interfaceC2994c0, aVar116, onExitClicked, interfaceC4339a1110, interfaceC28601c5, interfaceC28601c4, onNeverShowDismissDialogClick, onDismissConfirmationDialogClicked, function2111119, c13821r8, interfaceC28601c117, function2111114, interfaceC4351m11, onCalendarOpened, onDateClicked, defaultToggleCallbackType, onDefaultsQuestionClicked, interfaceC28601c115, onJournalQuestionClicked, interfaceC23462h7, interfaceC28690z0, onCalendarPaged, (Composer) obj, iIntValue);
                    }
                }), c28655q2, (C35666g.f151591h << 3) | 12582912 | (AbstractC35664f.a.f151587c << 6), 24576, 16249);
                if (z19) {
                    c28655q2.m87150e0(-352673422);
                    AbstractC24936d.m73080z("INTRADAY_JOURNAL_ONBOARDING", c24937e3, false, null, null, null, null, c28655q2, (C24937e.f97642j << 3) | ((i34 >> 3) & 112), 124);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-352485066);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(true);
                function8 = function2111119;
                function7 = function21111110;
                c28655q = c28655q2;
                z16 = z19;
                z17 = z64;
                j13 = j14;
                interfaceC4339a3 = interfaceC4339a10;
                function5 = function21111111;
                interfaceC4351m5 = interfaceC4351m13;
                interfaceC4351m4 = interfaceC4351m14;
                function6 = function2111118;
                c24937e2 = c24937e3;
                i65 = i74;
                z18 = z39;
                interfaceC4339a4 = interfaceC4339a9;
                interfaceC4351m6 = interfaceC4351m11;
            } else {
                interfaceC4351m12 = interfaceC4351m10;
            }
            if (viewState.getIsLoading()) {
                z27 = false;
            } else {
                z27 = false;
            }
            c28655q2.m87152f0(1903845737);
            c26669a = C29155a.f118017b;
            if (c26669a != null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            c38266c = c26669a.f106046a.f159364d;
            c28655q2.m87152f0(-3686552);
            zM87153g2 = c28655q2.m87153g(null) | c28655q2.m87153g(null);
            objM87133R13 = c28655q2.m87133R();
            if (zM87153g2) {
                objM87133R13 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null));
                c28655q2.m87172p0(objM87133R13);
            } else {
                objM87133R13 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null));
                c28655q2.m87172p0(objM87133R13);
            }
            c28655q2.m87173q(false);
            final InterfaceC23462h interfaceC23462h8 = (InterfaceC23462h) objM87133R13;
            c28655q2.m87173q(false);
            objM87133R14 = c28655q2.m87133R();
            if (objM87133R14 == c28676v0) {
                objM87133R14 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R14);
            }
            final InterfaceC28601c1 interfaceC28601c118 = (InterfaceC28601c1) objM87133R14;
            interfaceC28601c1M87238F = AbstractC28683x.m87238F(c28655q2.m87161k(AbstractC2453v1.f9577p), c28655q2);
            c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q2, 3078, 6);
            aVar = new AbstractC35664f.a(c15199y3M3460c);
            objM87133R15 = c28655q2.m87133R();
            if (objM87133R15 == c28676v0) {
                objM87133R15 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R15);
            }
            final InterfaceC28601c1 interfaceC28601c119 = (InterfaceC28601c1) objM87133R15;
            objM87133R16 = c28655q2.m87133R();
            c25271y = C25271y.f99162w;
            if (objM87133R16 == c28676v0) {
                objM87133R16 = AbstractC28683x.m87272z(c25271y);
                c28655q2.m87172p0(objM87133R16);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R16;
            objM87133R17 = c28655q2.m87133R();
            if (objM87133R17 == c28676v0) {
                objM87133R17 = AbstractC28683x.m87272z(c25271y);
                c28655q2.m87172p0(objM87133R17);
            }
            interfaceC28601c3 = (InterfaceC28601c1) objM87133R17;
            objM87133R18 = c28655q2.m87133R();
            if (objM87133R18 == c28676v0) {
                objM87133R18 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R18);
            }
            interfaceC28601c4 = (InterfaceC28601c1) objM87133R18;
            objM87133R19 = c28655q2.m87133R();
            if (objM87133R19 == c28676v0) {
                objM87133R19 = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q2.m87172p0(objM87133R19);
            }
            interfaceC28601c5 = (InterfaceC28601c1) objM87133R19;
            objM87133R20 = c28655q2.m87133R();
            if (objM87133R20 == c28676v0) {
                objM87133R20 = AbstractC11895b.m32005x(0, c28655q2);
            }
            final InterfaceC28601c1 interfaceC28601c1110 = (InterfaceC28601c1) objM87133R20;
            C9598e c9598eM34456o8 = viewState.getIsSuccess().getOnSaveNavigation();
            boolean zM87157i1118 = c28655q2.m87157i(viewState) | c28655q2.m87157i(c15199y3M3460c);
            i68 = i64 & 112;
            if (i68 == 32) {
                z28 = true;
            } else {
                z28 = false;
            }
            z29 = zM87157i1118 | z28;
            objM87133R21 = c28655q2.m87133R();
            if (z29) {
                objM87133R21 = new b(viewState, c15199y3M3460c, function12, null);
                c28655q2.m87172p0(objM87133R21);
            } else {
                objM87133R21 = new b(viewState, c15199y3M3460c, function12, null);
                c28655q2.m87172p0(objM87133R21);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R21, c9598eM34456o8);
            Object[] objArr8 = {strM34470d, Boolean.valueOf(z27), Integer.valueOf(i67), Boolean.valueOf(z25)};
            boolean zM87155h8 = c28655q2.m87155h(z27) | c28655q2.m87153g(interfaceC28601c1);
            if ((458752 & i64) == 131072) {
                z34 = true;
            } else {
                z34 = false;
            }
            boolean zM87153g1119 = zM87155h8 | z34 | c28655q2.m87153g(c13821r1M92099U);
            i69 = 57344 & i64;
            if (i69 == 16384) {
                z35 = true;
            } else {
                z35 = false;
            }
            boolean z711110 = zM87153g1119 | z35;
            function15 = function12;
            if ((3670016 & i64) == 1048576) {
                z36 = true;
            } else {
                z36 = false;
            }
            boolean z711111 = z36 | z711110;
            if ((i64 & 7168) == 2048) {
                z37 = true;
            } else {
                z37 = false;
            }
            z38 = z711111 | z37;
            objM87133R22 = c28655q2.m87133R();
            if (z38) {
                int i911116 = i67;
                Function1 function1112 = function14;
                boolean z711112 = z25;
                InterfaceC4339a interfaceC4339a1111 = interfaceC4339a7;
                objM87133R22 = new c(z27, interfaceC28601c1, z711112, c13821r1M92099U, function1112, interfaceC4339a1111, i911116, null);
                z39 = z711112;
                c13821r1 = c13821r1M92099U;
                function16 = function1112;
                interfaceC4339a9 = interfaceC4339a1111;
                i74 = i911116;
                c28655q2.m87172p0(objM87133R22);
            } else {
                int i911117 = i67;
                Function1 function1113 = function14;
                boolean z711113 = z25;
                InterfaceC4339a interfaceC4339a1112 = interfaceC4339a7;
                objM87133R22 = new c(z27, interfaceC28601c1, z711113, c13821r1M92099U, function1113, interfaceC4339a1112, i911117, null);
                z39 = z711113;
                c13821r1 = c13821r1M92099U;
                function16 = function1113;
                interfaceC4339a9 = interfaceC4339a1112;
                i74 = i911117;
                c28655q2.m87172p0(objM87133R22);
            }
            AbstractC28683x.m87256j(objArr8, (InterfaceC4351m) objM87133R22, c28655q2);
            c12337gM34447f3 = viewState.getIsSuccess().getDateSelectorState();
            if (c12337gM34447f3 != null) {
                strM34470d2 = c12337gM34447f3.getCurrentDate();
            } else {
                strM34470d2 = null;
            }
            abstractC12336fM34453l = viewState.getIsSuccess().getJournalDatePillViewState();
            if (abstractC12336fM34453l instanceof AbstractC12336f.c) {
                cVar = (AbstractC12336f.c) abstractC12336fM34453l;
            } else {
                cVar = null;
            }
            if (cVar != null) {
                listM34463a = cVar.m34463a();
            } else {
                listM34463a = null;
            }
            boolean zM87153g11110 = c28655q2.m87153g(strM34470d2) | c28655q2.m87157i(listM34463a);
            if ((i64 & 29360128) == 8388608) {
                z44 = true;
            } else {
                z44 = false;
            }
            boolean z711114 = zM87153g11110 | z44;
            if ((234881024 & i64) == 67108864) {
                z45 = true;
            } else {
                z45 = false;
            }
            z46 = z711114 | z45;
            objM87133R23 = c28655q2.m87133R();
            if (z46) {
                InterfaceC4351m interfaceC4351m11111 = interfaceC4351m9;
                objM87133R23 = new d(strM34470d2, listM34463a, j14, interfaceC4351m11111, null);
                interfaceC4351m13 = interfaceC4351m11111;
                c28655q2.m87172p0(objM87133R23);
            } else {
                InterfaceC4351m interfaceC4351m11112 = interfaceC4351m9;
                objM87133R23 = new d(strM34470d2, listM34463a, j14, interfaceC4351m11112, null);
                interfaceC4351m13 = interfaceC4351m11112;
                c28655q2.m87172p0(objM87133R23);
            }
            AbstractC28683x.m87254h(strM34470d2, listM34463a, (InterfaceC4351m) objM87133R23, c28655q2);
            if (i69 == 16384) {
                z47 = true;
            } else {
                z47 = false;
            }
            boolean zM87153g11111 = z47 | c28655q2.m87153g(c13821r1);
            if ((i18 & 29360128) == 8388608) {
                z48 = true;
            } else {
                z48 = false;
            }
            z49 = zM87153g11111 | z48;
            objM87133R24 = c28655q2.m87133R();
            if (z49) {
                final int i911118 = 0;
                objM87133R24 = new Function1() { // from class: bs1.o
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i911118) {
                            case 0:
                                return AbstractC3583c0.m10915z1(function16, c13821r1, exit, ((Boolean) obj).booleanValue());
                            default:
                                return AbstractC3583c0.m10735A1(function16, c13821r1, exit, (C9598e) obj);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R24);
            } else {
                final int i911119 = 0;
                objM87133R24 = new Function1() { // from class: bs1.o
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i911119) {
                            case 0:
                                return AbstractC3583c0.m10915z1(function16, c13821r1, exit, ((Boolean) obj).booleanValue());
                            default:
                                return AbstractC3583c0.m10735A1(function16, c13821r1, exit, (C9598e) obj);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R24);
            }
            final Function1 function21111112 = (Function1) objM87133R24;
            if (i69 == 16384) {
                z52 = true;
            } else {
                z52 = false;
            }
            boolean zM87153g11112 = z52 | c28655q2.m87153g(c13821r1);
            if ((i34 & 29360128) == 8388608) {
                z54 = true;
            } else {
                z54 = false;
            }
            z55 = zM87153g11112 | z54;
            objM87133R25 = c28655q2.m87133R();
            if (z55) {
                final int i9111110 = 1;
                objM87133R25 = new Function1() { // from class: bs1.o
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i9111110) {
                            case 0:
                                return AbstractC3583c0.m10915z1(function16, c13821r1, function9, ((Boolean) obj).booleanValue());
                            default:
                                return AbstractC3583c0.m10735A1(function16, c13821r1, function9, (C9598e) obj);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R25);
            } else {
                final int i9111111 = 1;
                objM87133R25 = new Function1() { // from class: bs1.o
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i9111111) {
                            case 0:
                                return AbstractC3583c0.m10915z1(function16, c13821r1, function9, ((Boolean) obj).booleanValue());
                            default:
                                return AbstractC3583c0.m10735A1(function16, c13821r1, function9, (C9598e) obj);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R25);
            }
            final Function1 function21111113 = (Function1) objM87133R25;
            if (i69 == 16384) {
                z56 = true;
            } else {
                z56 = false;
            }
            boolean zM87153g11113 = z56 | c28655q2.m87153g(c13821r1);
            if ((i18 & 3670016) == 1048576) {
                z57 = true;
            } else {
                z57 = false;
            }
            z58 = zM87153g11113 | z57;
            objM87133R26 = c28655q2.m87133R();
            if (z58) {
                objM87133R26 = new C3718c(function16, c13821r1, false, onExitClicked, 21);
                c28655q2.m87172p0(objM87133R26);
            } else {
                objM87133R26 = new C3718c(function16, c13821r1, false, onExitClicked, 21);
                c28655q2.m87172p0(objM87133R26);
            }
            final InterfaceC4339a interfaceC4339a1113 = (InterfaceC4339a) objM87133R26;
            Boolean boolValueOf15 = Boolean.valueOf(z26);
            Boolean boolValueOf16 = Boolean.valueOf(viewState.getIsLoading());
            if ((i64 & 896) == 256) {
                z59 = true;
            } else {
                z59 = false;
            }
            boolean zM87157i1119 = z59 | c28655q2.m87157i(viewState);
            if (i68 == 32) {
                z60 = true;
            } else {
                z60 = false;
            }
            zM87157i = zM87157i1119 | z60 | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(aVar);
            objM87133R27 = c28655q2.m87133R();
            if (zM87157i) {
                boolean z817 = z26;
                objM87133R27 = new e(z817, viewState, function15, interfaceC28601c5, interfaceC28601c4, interfaceC2994c0, aVar, null);
                z64 = z817;
                function17 = function15;
                aVar2 = aVar;
                c28655q2.m87172p0(objM87133R27);
            } else {
                boolean z818 = z26;
                objM87133R27 = new e(z818, viewState, function15, interfaceC28601c5, interfaceC28601c4, interfaceC2994c0, aVar, null);
                z64 = z818;
                function17 = function15;
                aVar2 = aVar;
                c28655q2.m87172p0(objM87133R27);
            }
            AbstractC28683x.m87254h(boolValueOf15, boolValueOf16, (InterfaceC4351m) objM87133R27, c28655q2);
            if (viewState.getIsSuccess().getShouldRefresh()) {
                abstractC12336fM34453l2 = viewState.getIsSuccess().getJournalDatePillViewState();
                if (abstractC12336fM34453l2 instanceof AbstractC12336f.c) {
                    cVar2 = (AbstractC12336f.c) abstractC12336fM34453l2;
                } else {
                    cVar2 = null;
                }
                if (cVar2 != null) {
                    it = cVar2.m34463a().iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!((C16613h) next).getIsSelected());
                    c16613h = (C16613h) next;
                    if (c16613h != null) {
                        String strM47166f8 = c16613h.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
                        lM47165e = c16613h.getCycleId();
                        if (lM47165e != null) {
                            jLongValue = lM47165e.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        function17.invoke(new AbstractC11103c.j(strM47166f8, jLongValue, false, null, null, false, false, null, 252, null));
                    }
                }
            }
            c12332bM34459r = viewState.getIsSuccess().getShouldShowBottomSheet();
            if (c12332bM34459r != null) {
                abstractC12331aM34433c = c12332bM34459r.getType();
            } else {
                abstractC12331aM34433c = null;
            }
            if (abstractC12331aM34433c instanceof AbstractC12331a.a) {
                aVar3 = (AbstractC12331a.a) abstractC12331aM34433c;
            } else {
                aVar3 = null;
            }
            if (aVar3 != null) {
                function17.invoke(new AbstractC11103c.h(strM34420c));
            }
            if (((Collection) interfaceC28601c2.getValue()).isEmpty()) {
                c28655q2.m87150e0(1499406798);
                c12332bM34459r3 = viewState.getIsSuccess().getShouldShowBottomSheet();
                if (c12332bM34459r3 != null) {
                    abstractC12331aM34433c2 = c12332bM34459r3.getType();
                } else {
                    abstractC12331aM34433c2 = null;
                }
                if (abstractC12331aM34433c2 instanceof AbstractC12331a.a) {
                    aVar5 = (AbstractC12331a.a) abstractC12331aM34433c2;
                } else {
                    aVar5 = null;
                }
                if (aVar5 != null) {
                    c22582fM65421f = null;
                } else {
                    c22582fM65421f = null;
                }
                if (c22582fM65421f == null) {
                    c28655q2.m87150e0(-763029517);
                    c28655q2.m87173q(false);
                    z74 = false;
                    aVar4 = aVar2;
                    function18 = function17;
                    interfaceC28601c6 = interfaceC28601c2;
                } else {
                    c28655q2.m87150e0(-763029516);
                    abstractC12331aM34433c3 = viewState.getIsSuccess().getShouldShowBottomSheet().getType();
                    if (abstractC12331aM34433c3 instanceof AbstractC12331a.a) {
                        aVar6 = (AbstractC12331a.a) abstractC12331aM34433c3;
                    } else {
                        aVar6 = null;
                    }
                    if (aVar6 != null) {
                        listM34419b = aVar6.m34419b();
                    } else {
                        listM34419b = null;
                    }
                    if (listM34419b == null) {
                        listM34419b = c25271y;
                    }
                    List list15 = (List) interfaceC28601c2.getValue();
                    List list16 = (List) interfaceC28601c3.getValue();
                    C22582f c22582f8 = c22582fM65421f;
                    if (i68 == 32) {
                        z69 = true;
                    } else {
                        z69 = false;
                    }
                    zM87157i2 = z69 | c28655q2.m87157i(listM34419b) | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(aVar2);
                    objM87133R30 = c28655q2.m87133R();
                    if (zM87157i2) {
                        AbstractC35664f.a aVar117 = aVar2;
                        Function1 function21111114 = function17;
                        objM87133R30 = new C1008b(listM34419b, function21111114, interfaceC2994c0, aVar117, interfaceC28601c4, interfaceC28601c2);
                        function18 = function21111114;
                        aVar4 = aVar117;
                        interfaceC28601c6 = interfaceC28601c2;
                        c28655q2.m87172p0(objM87133R30);
                    } else {
                        AbstractC35664f.a aVar118 = aVar2;
                        Function1 function21111115 = function17;
                        objM87133R30 = new C1008b(listM34419b, function21111115, interfaceC2994c0, aVar118, interfaceC28601c4, interfaceC28601c2);
                        function18 = function21111115;
                        aVar4 = aVar118;
                        interfaceC28601c6 = interfaceC28601c2;
                        c28655q2.m87172p0(objM87133R30);
                    }
                    Function1 function21111116 = (Function1) objM87133R30;
                    objM87133R31 = c28655q2.m87133R();
                    if (objM87133R31 == c28676v0) {
                        objM87133R31 = new C3598q(interfaceC28601c6, 1);
                        c28655q2.m87172p0(objM87133R31);
                    }
                    AbstractC41069c.m133347o(c22582f8, list15, list16, false, function21111116, (InterfaceC4339a) objM87133R31, c28655q2, C22582f.f88880e | ProfileVerifier.CompilationStatus.f6515xf2722a21, 8);
                    z74 = false;
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(z74);
            } else {
                aVar4 = aVar2;
                function18 = function17;
                interfaceC28601c6 = interfaceC28601c2;
                c28655q2.m87150e0(-762104848);
                c28655q2.m87173q(false);
            }
            EnumC15209z3 enumC15209z3M43221b8 = c15199y3M3460c.m43221b();
            EnumC15209z3 enumC15209z3M43222c8 = c15199y3M3460c.m43222c();
            boolean zM87157i11110 = c28655q2.m87157i(c15199y3M3460c) | c28655q2.m87157i(viewState);
            if ((i18 & 112) == 32) {
                z65 = true;
            } else {
                z65 = false;
            }
            zM87153g3 = z65 | zM87157i11110 | c28655q2.m87153g(interfaceC28601c1M87238F);
            objM87133R28 = c28655q2.m87133R();
            if (zM87153g3) {
                objM87133R28 = new g(c15199y3M3460c, viewState, onJournalQuestionClicked, interfaceC28601c1M87238F, null);
                c12341k = viewState;
                c28655q2.m87172p0(objM87133R28);
            } else {
                objM87133R28 = new g(c15199y3M3460c, viewState, onJournalQuestionClicked, interfaceC28601c1M87238F, null);
                c12341k = viewState;
                c28655q2.m87172p0(objM87133R28);
            }
            AbstractC28683x.m87254h(enumC15209z3M43221b8, enumC15209z3M43222c8, (InterfaceC4351m) objM87133R28, c28655q2);
            C15199y3 c15199y3M112950a8 = aVar4.getModalBottomSheetState();
            C12332b c12332bM34459r11 = c12341k.getIsSuccess().getShouldShowBottomSheet();
            boolean zM87157i11111 = c28655q2.m87157i(aVar4);
            if ((i64 & 14) == 4) {
                z66 = true;
            } else {
                z66 = false;
            }
            boolean zM87157i11112 = z66 | zM87157i11111 | c28655q2.m87157i(c12341k);
            if ((i34 & 1879048192) == 536870912) {
                z67 = true;
            } else {
                z67 = false;
            }
            z68 = zM87157i11112 | z67;
            objM87133R29 = c28655q2.m87133R();
            if (z68) {
                InterfaceC4351m interfaceC4351m11113 = interfaceC4351m12;
                objM87133R29 = new h(aVar4, interfaceC4351m11113, c12341k, interfaceC28601c4, interfaceC4339a8, null);
                interfaceC4351m14 = interfaceC4351m11113;
                interfaceC4339a10 = interfaceC4339a8;
                c28655q2.m87172p0(objM87133R29);
            } else {
                InterfaceC4351m interfaceC4351m11114 = interfaceC4351m12;
                objM87133R29 = new h(aVar4, interfaceC4351m11114, c12341k, interfaceC28601c4, interfaceC4339a8, null);
                interfaceC4351m14 = interfaceC4351m11114;
                interfaceC4339a10 = interfaceC4339a8;
                c28655q2.m87172p0(objM87133R29);
            }
            AbstractC28683x.m87254h(c15199y3M112950a8, c12332bM34459r11, (InterfaceC4351m) objM87133R29, c28655q2);
            aiActionM34446e = viewState.getIsSuccess().getCoachAiAction();
            if (aiActionM34446e != null) {
                c13404jM18524b = AbstractC6219a.m18524b(aiActionM34446e, true);
            } else {
                c13404jM18524b = null;
            }
            Modifier modifierM34129b8 = AbstractC12250f.m34129b(AbstractC1102d.m3407d(1.0f, m10912y2(C2314t.f9131w, viewState.getIsIntraday())), c13404jM18524b, false, c28655q2, C13404j.f46947x << 3, 2);
            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM34129b8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d8);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m8);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N8);
            c12332bM34459r2 = viewState.getIsSuccess().getShouldShowBottomSheet();
            if (c12332bM34459r2 != null) {
                textResourceM30853e = null;
            } else {
                textResourceM30853e = null;
            }
            Function1 function21111117 = function10;
            final AbstractC35664f.a aVar119 = aVar4;
            final Function1 function21111118 = function16;
            final C13821r1 c13821r9 = c13821r1;
            final Function1 function21111119 = function18;
            Function1 function211111110 = function9;
            AbstractC35660d.m112871m(null, new C35666g(textResourceM30853e, null, null, null, null, 0.0f, 0.0f, 126, null), aVar119, null, null, null, null, AbstractC37817c.m121344e(-1468159270, c28655q2, new C3602u(viewState, onJournalQuestionClicked, interfaceC2994c0, c15199y3M3460c, aVar4, function18, function21111117, interfaceC28601c6, interfaceC28601c3, interfaceC28601c4, interfaceC28601c5)), false, null, null, null, false, null, AbstractC37817c.m121344e(1150183326, c28655q2, new InterfaceC4351m() { // from class: bs1.y
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC3583c0.m10773M1(viewState, onSavedFinish, function21111112, onRefresh, onSavedClicked, function21111119, interfaceC28601c119, c15199y3M3460c, interfaceC2994c0, aVar119, onExitClicked, interfaceC4339a1113, interfaceC28601c5, interfaceC28601c4, onNeverShowDismissDialogClick, onDismissConfirmationDialogClicked, function21111118, c13821r9, interfaceC28601c1110, function21111113, interfaceC4351m11, onCalendarOpened, onDateClicked, defaultToggleCallbackType, onDefaultsQuestionClicked, interfaceC28601c118, onJournalQuestionClicked, interfaceC23462h8, interfaceC28690z0, onCalendarPaged, (Composer) obj, iIntValue);
                }
            }), c28655q2, (C35666g.f151591h << 3) | 12582912 | (AbstractC35664f.a.f151587c << 6), 24576, 16249);
            if (z19) {
                c28655q2.m87150e0(-352673422);
                AbstractC24936d.m73080z("INTRADAY_JOURNAL_ONBOARDING", c24937e3, false, null, null, null, null, c28655q2, (C24937e.f97642j << 3) | ((i34 >> 3) & 112), 124);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-352485066);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            function8 = function21111118;
            function7 = function21111119;
            c28655q = c28655q2;
            z16 = z19;
            z17 = z64;
            j13 = j14;
            interfaceC4339a3 = interfaceC4339a10;
            function5 = function211111110;
            interfaceC4351m5 = interfaceC4351m13;
            interfaceC4351m4 = interfaceC4351m14;
            function6 = function21111117;
            c24937e2 = c24937e3;
            i65 = i74;
            z18 = z39;
            interfaceC4339a4 = interfaceC4339a9;
            interfaceC4351m6 = interfaceC4351m11;
        } else {
            c28655q2.m87138X();
            z16 = z4;
            c24937e2 = c24937e;
            function5 = function1;
            function6 = function2;
            interfaceC4339a3 = interfaceC4339a;
            interfaceC4351m4 = interfaceC4351m2;
            function7 = function3;
            z17 = z13;
            i65 = i13;
            function8 = function4;
            z18 = z14;
            interfaceC4339a4 = interfaceC4339a2;
            j13 = j7;
            interfaceC4351m5 = interfaceC4351m3;
            c28655q = c28655q2;
            interfaceC4351m6 = interfaceC4351m;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs1.b0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC3583c0.m10844h2(viewState, onJournalQuestionClicked, defaultToggleCallbackType, onRefresh, onSavedClicked, onSavedFinish, onExitClicked, exit, onNeverShowDismissDialogClick, onDismissConfirmationDialogClicked, onDefaultsQuestionClicked, z16, c24937e2, onDateClicked, interfaceC4351m6, onCalendarOpened, onCalendarPaged, function5, function6, interfaceC4339a3, interfaceC4351m4, function7, z17, i65, function8, z18, interfaceC4339a4, j13, interfaceC4351m5, i14, i15, i16, i17, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r2 */
    public static final C23454a0 m10884r2(Function1 function1) {
        function1.invoke(Boolean.TRUE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public static final C23454a0 m10887s1(long j7, String str) {
        AbstractC22676k.m65750j(str, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s2 */
    public static final C23454a0 m10888s2(boolean z4, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m10880q2(z4, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public static final C23454a0 m10891t1(C9598e it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u1 */
    private static final FeatureFlagChecker m10895u1(InterfaceC23462h interfaceC23462h) {
        return (FeatureFlagChecker) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: u2 */
    public static final List<C22580d> m10896u2(C12332b c12332b, Object viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        ArrayList arrayList = null;
        AbstractC11103c.m mVar = viewEvent instanceof AbstractC11103c.m ? (AbstractC11103c.m) viewEvent : null;
        if (mVar != null) {
            AbstractC12331a abstractC12331aM34433c = c12332b != null ? c12332b.getType() : null;
            AbstractC12331a.a aVar = abstractC12331aM34433c instanceof AbstractC12331a.a ? (AbstractC12331a.a) abstractC12331aM34433c : null;
            if (aVar != null) {
                ArrayList arrayListM74164j0 = AbstractC25267u.m74164j0(aVar.getBottomSheetViewState().m65425j());
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayListM74164j0.iterator();
                while (it.hasNext()) {
                    AbstractC25265s.m74141p0(arrayList2, ((C22583g) it.next()).m65438c());
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    C22580d c22580d = (C22580d) obj;
                    if (c22580d.getWeeklyPlanGoal() && AbstractC25265s.m74155w0(aVar.m34419b(), AbstractC39421y.m125932Q(c22580d.getId())) && !AbstractC25265s.m74155w0(mVar.m30020b(), AbstractC39421y.m125932Q(c22580d.getId()))) {
                        arrayList3.add(obj);
                    }
                }
                HashSet hashSet = new HashSet();
                arrayList = new ArrayList();
                for (Object obj2 : arrayList3) {
                    if (hashSet.add(((C22580d) obj2).getId())) {
                        arrayList.add(obj2);
                    }
                }
            }
        }
        return arrayList == null ? C25271y.f99162w : arrayList;
    }

    /* JADX INFO: renamed from: v1 */
    private static final boolean m10899v1(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: v2 */
    public static final void m10900v2(Object viewEvent, C12332b c12332b, Function1 onEnableConfirmationDialog, Function1 onViewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC22676k.m65750j(onEnableConfirmationDialog, "onEnableConfirmationDialog");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        List<C22580d> listM10896u2 = m10896u2(c12332b, viewEvent);
        if (listM10896u2.isEmpty()) {
            onViewEvent.invoke(viewEvent);
        } else {
            onEnableConfirmationDialog.invoke(listM10896u2);
        }
    }

    /* JADX INFO: renamed from: w1 */
    private static final void m10903w1(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: w2 */
    public static final void m10904w2(C12341k viewState, InterfaceC4352n onDateClicked, Function1 onViewEvent, Object event) {
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onDateClicked, "onDateClicked");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(event, "event");
        AbstractC12336f abstractC12336fM34453l = viewState.getIsSuccess().getJournalDatePillViewState();
        Object obj = null;
        AbstractC12336f.c cVar = abstractC12336fM34453l instanceof AbstractC12336f.c ? (AbstractC12336f.c) abstractC12336fM34453l : null;
        if (cVar != null) {
            for (Object obj2 : cVar.m34463a()) {
                if (((C16613h) obj2).getIsSelected()) {
                    obj = obj2;
                    break;
                }
            }
            C16613h c16613h = (C16613h) obj;
            if (c16613h != null) {
                Long lM47165e = c16613h.getCycleId();
                onDateClicked.invoke(Long.valueOf(lM47165e != null ? lM47165e.longValue() : 0L), c16613h.getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), EnumC39731b.CAROUSEL_DATE_SELECTION, Boolean.FALSE);
            }
        }
        onViewEvent.invoke(event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static final InterfaceC2464x2 m10907x1(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC2464x2) interfaceC28670t2.getValue();
    }

    /* JADX INFO: renamed from: x2 */
    public static final void m10908x2(boolean z4, boolean z13, Function1 onViewEvent, InterfaceC28601c1 isFirstSearchBarFocus, InterfaceC28601c1 isHidingBottomSheetFromSave, InterfaceC2994c0 coroutineScope, AbstractC35664f.a bottomSheetGestures) {
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(isFirstSearchBarFocus, "isFirstSearchBarFocus");
        AbstractC22676k.m65750j(isHidingBottomSheetFromSave, "isHidingBottomSheetFromSave");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(bottomSheetGestures, "bottomSheetGestures");
        if (!z4 || z13) {
            return;
        }
        m10736A2(onViewEvent, isFirstSearchBarFocus, isHidingBottomSheetFromSave, coroutineScope, bottomSheetGestures);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y1 */
    public static final C23454a0 m10911y1(boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y2 */
    private static final Modifier m10912y2(Modifier modifier, boolean z4) {
        C17909s c17909s = AbstractC17911t.f69612b;
        Float fValueOf = Float.valueOf(0.0f);
        C23465k c23465k = new C23465k(fValueOf, new C17919x(AbstractC17918w0.m51517e(4291407244L)));
        Float fValueOf2 = Float.valueOf(0.1f);
        C23465k c23465k2 = new C23465k(fValueOf2, new C17919x(AbstractC17918w0.m51517e(4291407244L)));
        C23465k c23465k3 = new C23465k(Float.valueOf(0.5f), new C17919x(AbstractC17918w0.m51515c(1083035135)));
        Float fValueOf3 = Float.valueOf(0.75f);
        C17894k0 c17894k0M51494l = C17909s.m51494l(c17909s, new C23465k[]{c23465k, c23465k2, c23465k3, new C23465k(fValueOf3, new C17919x(AbstractC17918w0.m51515c(9293311)))}, 0.0f, 0.0f, 14);
        C17894k0 c17894k0M51494l2 = C17909s.m51494l(c17909s, new C23465k[]{new C23465k(fValueOf, new C17919x(AbstractC17918w0.m51517e(4282592896L))), new C23465k(fValueOf2, new C17919x(AbstractC17918w0.m51517e(4282592896L))), new C23465k(fValueOf3, new C17919x(AbstractC17918w0.m51515c(3091057)))}, 0.0f, 0.0f, 14);
        if (!z4) {
            c17894k0M51494l = c17894k0M51494l2;
        }
        return modifier.mo3471e(AbstractC1092a.m3357b(modifier, c17894k0M51494l, null, 0.0f, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z1 */
    public static final C23454a0 m10915z1(Function1 function1, C13821r1 c13821r1, Function1 function2, boolean z4) {
        function1.invoke(Integer.valueOf(c13821r1.f49318a.m87024x()));
        function2.invoke(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z2 */
    private static final Modifier m10916z2(Modifier modifier, boolean z4) {
        C17909s c17909s = AbstractC17911t.f69612b;
        Float fValueOf = Float.valueOf(0.0f);
        C23465k c23465k = new C23465k(fValueOf, new C17919x(AbstractC17918w0.m51517e(4291407244L)));
        Float fValueOf2 = Float.valueOf(0.85f);
        C23465k c23465k2 = new C23465k(fValueOf2, new C17919x(AbstractC17918w0.m51517e(4291407244L)));
        Float fValueOf3 = Float.valueOf(1.0f);
        long j7 = C17919x.f69636m;
        C17894k0 c17894k0M51494l = C17909s.m51494l(c17909s, new C23465k[]{c23465k, c23465k2, new C23465k(fValueOf3, new C17919x(j7))}, 0.0f, 0.0f, 14);
        C17894k0 c17894k0M51494l2 = C17909s.m51494l(c17909s, new C23465k[]{new C23465k(fValueOf, new C17919x(AbstractC17918w0.m51517e(4282592896L))), new C23465k(fValueOf2, new C17919x(AbstractC17918w0.m51517e(4282592896L))), new C23465k(fValueOf3, new C17919x(j7))}, 0.0f, 0.0f, 14);
        if (!z4) {
            c17894k0M51494l = c17894k0M51494l2;
        }
        return modifier.mo3471e(AbstractC1092a.m3357b(modifier, c17894k0M51494l, null, 0.0f, 6));
    }
}
