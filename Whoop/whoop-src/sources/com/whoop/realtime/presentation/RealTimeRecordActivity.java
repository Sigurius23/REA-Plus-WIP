package com.whoop.realtime.presentation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.AbstractC1329o1;
import androidx.lifecycle.AbstractC1613o1;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3018i0;
import bh3.InterfaceC3255b;
import bl2.C3374c;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.data.remote.domain.dto.CycleMetadataResponseDto;
import com.whoop.data.repositories.FeatureFlagRepository;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.data.repositories.RestingHeartRate;
import com.whoop.data.repositories.UserRepository;
import com.whoop.domain.model.StrainRecoveryMapping;
import com.whoop.p069ui.activities.realtime.SportCategory;
import com.whoop.realtime.presentation.RealTimeRecordActivity;
import com.whoop.realtime.presentation.adapter.WhoopViewPager;
import com.whoop.realtime.presentation.views.SlidingTabIndicator;
import com.whoop.realtime.service.C9907b;
import com.whoop.service.network.model.Sport;
import com.whoop.service.network.model.UserState;
import com.whoop.weeklyplan.api.WeeklyPlanApiKt;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ge3.AbstractC15751g;
import hj0.AbstractActivityC17347f;
import hj0.C17358q;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21153l0;
import java.util.Arrays;
import java.util.WeakHashMap;
import k52.AbstractC22206b;
import k52.AbstractC22207c;
import k52.AbstractC22208d;
import k52.AbstractC22209e;
import k52.AbstractC22211g;
import l52.C23359a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lh3.C24079b;
import lh3.C24082e;
import live.hms.video.utils.HMSConstantsKt;
import lm2.C24517c;
import lm2.C24518d;
import lm2.InterfaceC24516b;
import lr.RunnableC24693e;
import m02.C24884c;
import m02.InterfaceC24882a;
import m02.InterfaceC24883b;
import nr0.C27072e;
import o52.AbstractC27589z;
import o52.C27549e;
import o52.C27588y;
import od1.C27840c;
import od1.C27843f;
import org.joda.time.Period;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodFormatterBuilder;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p161g.AbstractC14917t;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p184h5.C16899o1;
import p184h5.C16905q1;
import p505ts.AbstractC34132o;
import p52.C28858a;
import p52.C28859b;
import p52.C28860c;
import p543v4.C35643b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p92.C29016e;
import p92.C29019h;
import p92.C29020i;
import pf.AbstractC29125c;
import q52.C29988f;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u92.C34660d;
import uf3.C34911a;
import vf3.C35953c;
import vf3.InterfaceC35951a;
import x82.AbstractC38077d;
import xg3.C38280g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000¦\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 %2\u00020\u0001:\u0004Ý\u0001Þ\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\bJ)\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u0003J\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010 \u001a\u00020\u001f*\u00020\u000fH\u0002¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020\u001f*\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010!J\u0013\u0010#\u001a\u00020\u001f*\u00020\u000fH\u0002¢\u0006\u0004\b#\u0010!J\u0015\u0010%\u001a\u0004\u0018\u00010$*\u00020\u000fH\u0002¢\u0006\u0004\b%\u0010&J\u0013\u0010(\u001a\u00020'*\u00020\u000fH\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010\u0003J\u000f\u0010+\u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010\u0003J\u000f\u0010,\u001a\u00020\u0006H\u0002¢\u0006\u0004\b,\u0010\u0003J\u000f\u0010-\u001a\u00020\u0006H\u0002¢\u0006\u0004\b-\u0010\u0003J#\u00101\u001a\u00020\u00062\b\u0010/\u001a\u0004\u0018\u00010.2\b\u00100\u001a\u0004\u0018\u00010.H\u0002¢\u0006\u0004\b1\u00102J\u0011\u00104\u001a\u0004\u0018\u000103H\u0002¢\u0006\u0004\b4\u00105J\u0011\u00106\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b6\u00107J\u0011\u00108\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u00062\u0006\u0010:\u001a\u000203H\u0002¢\u0006\u0004\b;\u0010<J\u0019\u0010>\u001a\u00020\u00062\b\u0010=\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b>\u0010?J\u0019\u0010A\u001a\u00020\u00062\b\u0010@\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u001fH\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u001fH\u0002¢\u0006\u0004\bE\u0010DJ\u000f\u0010F\u001a\u00020\u001fH\u0002¢\u0006\u0004\bF\u0010DJ\u000f\u0010G\u001a\u00020\u001fH\u0002¢\u0006\u0004\bG\u0010DJ\u000f\u0010H\u001a\u00020\u0006H\u0002¢\u0006\u0004\bH\u0010\u0003J\u000f\u0010I\u001a\u00020\u0006H\u0002¢\u0006\u0004\bI\u0010\u0003J\u000f\u0010J\u001a\u00020\u0006H\u0002¢\u0006\u0004\bJ\u0010\u0003J\u000f\u0010K\u001a\u00020\u0006H\u0002¢\u0006\u0004\bK\u0010\u0003J\u000f\u0010L\u001a\u00020\u0006H\u0002¢\u0006\u0004\bL\u0010\u0003J\u000f\u0010M\u001a\u00020\u0006H\u0002¢\u0006\u0004\bM\u0010\u0003J!\u0010P\u001a\u00020\u00062\b\u0010O\u001a\u0004\u0018\u00010N2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\bP\u0010QJ\u0017\u0010S\u001a\u00020\u00062\u0006\u0010R\u001a\u00020\u001fH\u0002¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u0006H\u0002¢\u0006\u0004\bU\u0010\u0003J\u0010\u0010V\u001a\u00020\u0006H\u0082@¢\u0006\u0004\bV\u0010WJ\u0017\u0010Y\u001a\u00020\u00062\u0006\u0010X\u001a\u00020.H\u0002¢\u0006\u0004\bY\u0010ZJ\u0017\u0010[\u001a\u00020\u00062\u0006\u0010X\u001a\u00020.H\u0002¢\u0006\u0004\b[\u0010ZJ\u0017\u0010^\u001a\u00020\u00062\u0006\u0010]\u001a\u00020\\H\u0002¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020\u0006H\u0002¢\u0006\u0004\b`\u0010\u0003J\u000f\u0010a\u001a\u00020\u0006H\u0002¢\u0006\u0004\ba\u0010\u0003J\u000f\u0010b\u001a\u00020\u0006H\u0002¢\u0006\u0004\bb\u0010\u0003J\u000f\u0010c\u001a\u00020\u0006H\u0002¢\u0006\u0004\bc\u0010\u0003J\u000f\u0010d\u001a\u00020\u0006H\u0002¢\u0006\u0004\bd\u0010\u0003J\u000f\u0010e\u001a\u00020\u0006H\u0002¢\u0006\u0004\be\u0010\u0003J\u000f\u0010f\u001a\u00020\u0006H\u0002¢\u0006\u0004\bf\u0010\u0003J\u000f\u0010g\u001a\u00020\u0006H\u0002¢\u0006\u0004\bg\u0010\u0003R\u0014\u0010k\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010o\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010s\u001a\u00020p8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bq\u0010rR\u001a\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00170t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0018\u0010{\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u001f\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020.0|8\u0006¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001a\u0010:\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001b\u0010\u0086\u0001\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001b\u0010\u0089\u0001\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001c\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R!\u0010\u0093\u0001\u001a\u00030\u008e\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R!\u0010\u0098\u0001\u001a\u00030\u0094\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0090\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R!\u0010\u009d\u0001\u001a\u00030\u0099\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010\u0090\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R!\u0010¢\u0001\u001a\u00030\u009e\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009f\u0001\u0010\u0090\u0001\u001a\u0006\b \u0001\u0010¡\u0001R!\u0010§\u0001\u001a\u00030£\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¤\u0001\u0010\u0090\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001R!\u0010¬\u0001\u001a\u00030¨\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b©\u0001\u0010\u0090\u0001\u001a\u0006\bª\u0001\u0010«\u0001R!\u0010±\u0001\u001a\u00030\u00ad\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b®\u0001\u0010\u0090\u0001\u001a\u0006\b¯\u0001\u0010°\u0001R!\u0010¶\u0001\u001a\u00030²\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b³\u0001\u0010\u0090\u0001\u001a\u0006\b´\u0001\u0010µ\u0001R!\u0010»\u0001\u001a\u00030·\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¸\u0001\u0010\u0090\u0001\u001a\u0006\b¹\u0001\u0010º\u0001R\u0019\u0010½\u0001\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010³\u0001R\u0019\u0010¿\u0001\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010³\u0001R\u0018\u0010À\u0001\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bV\u0010³\u0001R\u0018\u0010Á\u0001\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bg\u0010³\u0001R\u0018\u0010Ã\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÂ\u0001\u0010iR\u0018\u0010Å\u0001\u001a\u00020N8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\bU\u0010Ä\u0001R\u0018\u0010Æ\u0001\u001a\u00020N8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\bJ\u0010Ä\u0001R\u0019\u0010É\u0001\u001a\u00030Ç\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b4\u0010È\u0001R\u001a\u0010Ì\u0001\u001a\u00030Ê\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¹\u0001\u0010Ë\u0001R\u001a\u0010Í\u0001\u001a\u00030Ç\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b \u0001\u0010È\u0001R\u0019\u0010Î\u0001\u001a\u00020N8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0096\u0001\u0010Ä\u0001R\u0019\u0010Ï\u0001\u001a\u00020N8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u009b\u0001\u0010Ä\u0001R\u0019\u0010Ð\u0001\u001a\u00020N8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¯\u0001\u0010Ä\u0001R\u0019\u0010Ñ\u0001\u001a\u00020N8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bª\u0001\u0010Ä\u0001R\u0019\u0010Ò\u0001\u001a\u00030Ç\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u001d\u0010È\u0001R\u001a\u0010Õ\u0001\u001a\u00030Ó\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¥\u0001\u0010Ô\u0001R\u0019\u0010Ø\u0001\u001a\u00030Ö\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b(\u0010×\u0001R\u0018\u0010Ù\u0001\u001a\u00020N8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b8\u0010Ä\u0001R\u001d\u0010Ü\u0001\u001a\t\u0012\u0004\u0012\u00020.0Ú\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b6\u0010Û\u0001¨\u0006ß\u0001"}, m65681d2 = {"Lcom/whoop/realtime/presentation/RealTimeRecordActivity;", "Lhj0/f;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "outState", "onSaveInstanceState", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "p", "()Ljava/lang/String;", "Lxg3/g;", "Lp92/h;", "Q0", "()Lxg3/g;", "N0", "finish", "Llm2/d;", "p0", "(Landroid/content/Intent;)Llm2/d;", "", "H0", "(Landroid/content/Intent;)Z", "G0", "I0", "Lcom/whoop/domain/model/StrainRecoveryMapping;", "u0", "(Landroid/content/Intent;)Lcom/whoop/domain/model/StrainRecoveryMapping;", "", "r0", "(Landroid/content/Intent;)D", "B0", "E0", "A0", "S0", "", "startTime", "endTime", "R0", "(Ljava/lang/Long;Ljava/lang/Long;)V", "Llm2/b;", "i0", "()Llm2/b;", "t0", "()Lcom/whoop/domain/model/StrainRecoveryMapping;", "s0", "()Ljava/lang/Double;", "activity", "Z0", "(Llm2/b;)V", "map", "b1", "(Lcom/whoop/domain/model/StrainRecoveryMapping;)V", WeeklyPlanApiKt.GOAL, "a1", "(Ljava/lang/Double;)V", "J0", "()Z", "L0", "M0", "K0", "W0", "Y0", "h0", "m1", "X0", "y0", "Landroid/view/View;", "splashContainer", "O0", "(Landroid/view/View;J)V", "isSleep", "i1", "(Z)V", "g0", "d0", "(Lq83/d;)Ljava/lang/Object;", "start", "l1", "(J)V", "j1", "Lcom/whoop/data/repositories/RestingHeartRate;", "restingHr", "k1", "(Lcom/whoop/data/repositories/RestingHeartRate;)V", "P0", "e1", "d1", "h1", "c1", "f1", "g1", "e0", "Ltr2/n;", "I", "Ltr2/n;", "logger", "Lo52/e;", "J", "Lo52/e;", "promptBlock", "Lcom/whoop/realtime/service/b;", "K", "Lcom/whoop/realtime/service/b;", "controller", "Llh3/b;", "L", "Llh3/b;", "strainControllerSubject", "Lq52/f;", "M", "Lq52/f;", "timer", "Llh3/e;", "N", "Llh3/e;", "v0", "()Llh3/e;", "timerSubject", "O", "Llm2/b;", "P", "Lcom/whoop/domain/model/StrainRecoveryMapping;", "strainMapping", "Q", "Ljava/lang/Double;", "strainGoal", "Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;", "R", "Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;", "currentCycleMetadata", "Lcom/whoop/data/repositories/UserRepository;", "S", "Ll83/h;", "w0", "()Lcom/whoop/data/repositories/UserRepository;", "userRepository", "Lod1/f;", "T", "l0", "()Lod1/f;", "cycleMgr", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "U", "m0", "()Lcom/whoop/data/repositories/FeatureFlagRepository;", "featureFlagRepository", "Lod1/c;", "V", "k0", "()Lod1/c;", "currentCycleInteractor", "Lu92/d;", "W", "q0", "()Lu92/d;", "strainCoachPrefs", "Ll52/a;", "X", "o0", "()Ll52/a;", "mapboxManager", "Lm02/a;", "Y", "n0", "()Lm02/a;", "homeNavigator", "Lm02/b;", "Z", "x0", "()Lm02/b;", "whoopLiveNavigator", "Lcom/whoop/realtime/presentation/f;", "a0", "j0", "()Lcom/whoop/realtime/presentation/f;", "addableActivityFetcher", "b0", "isExistingRecording", "c0", "startedRecording", "useGps", "isSplashing", "f0", "originalToolbarContainerTopPadding", "Landroid/view/View;", "sleepSplash", "sleepSplashContent", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "sleepSplashText", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "sleepSplashIcon", "workoutCountdown", "timerContainer", "toolbar", "resumeButton", "saveButton", "timerTv", "Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;", "Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;", "tabStrip", "Lcom/whoop/realtime/presentation/adapter/WhoopViewPager;", "Lcom/whoop/realtime/presentation/adapter/WhoopViewPager;", "pager", "toolbarContainer", "Lbh3/b;", "Lbh3/b;", "timerUpdateAction", "a", "b", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class RealTimeRecordActivity extends AbstractActivityC17347f {

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: v0 */
    public static final int f28767v0 = 8;

    /* JADX INFO: renamed from: w0 */
    private static final PeriodFormatter f28768w0;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private C9907b controller;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private C29988f timer;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private InterfaceC24516b activity;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private StrainRecoveryMapping strainMapping;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private Double strainGoal;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private CycleMetadataResponseDto currentCycleMetadata;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private final InterfaceC23462h userRepository;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private final InterfaceC23462h cycleMgr;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagRepository;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private final InterfaceC23462h currentCycleInteractor;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private final InterfaceC23462h strainCoachPrefs;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private final InterfaceC23462h mapboxManager;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private final InterfaceC23462h homeNavigator;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private final InterfaceC23462h whoopLiveNavigator;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    private final InterfaceC23462h addableActivityFetcher;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    private boolean isExistingRecording;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    private boolean startedRecording;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    private boolean useGps;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    private boolean isSplashing;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    private int originalToolbarContainerTopPadding;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    private View sleepSplash;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    private View sleepSplashContent;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    private TextView sleepSplashText;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    private ImageView sleepSplashIcon;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    private TextView workoutCountdown;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    private View timerContainer;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    private View toolbar;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    private View resumeButton;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    private View saveButton;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    private TextView timerTv;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    private SlidingTabIndicator tabStrip;

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    private WhoopViewPager pager;

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    private View toolbarContainer;

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    private final InterfaceC3255b timerUpdateAction;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC34116n logger = InterfaceC34116n.INSTANCE.m107848a("RealTimeRecordActivity");

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final C27549e promptBlock = new C27549e();

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final C24079b strainControllerSubject = C24079b.m70996Y(null, false);

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final C24082e timerSubject = C24082e.m71000Y();

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.RealTimeRecordActivity$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\f*\u00020\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000bH\u0000¢\u0006\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0014\u0010\u0019\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013R\u0014\u0010\u001b\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0013R\u0014\u0010\u001d\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0013R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\u001e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010 R\u0014\u0010#\u001a\u00020\u001e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010 R\u0014\u0010$\u001a\u00020\u001e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010 R\u0014\u0010&\u001a\u00020%8\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, m65681d2 = {"Lcom/whoop/realtime/presentation/RealTimeRecordActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lp92/i;", "realTimeStreamStateMachine", "Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;", "b", "(Landroid/content/Context;Lp92/i;)Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;", "Landroid/content/Intent;", "", "d", "(Landroid/content/Intent;)Z", "c", "a", "", "KEY_IS_SLEEP", "Ljava/lang/String;", "KEY_IS_NAP", "KEY_IS_GPS", "KEY_SPORT", "KEY_STRAIN_MAPPING", "KEY_STRAIN_GOAL", "KEY_EXISTING_RECORDING", "KEY_DISCARD", "KEY_SAVE", "KEY_END", "KEY_STARTED_RECORDING", "", "REQUEST_CODE_SAVE", "I", "REQUEST_CODE_END", "FRAGMENT_POS_STRAIN", "FRAGMENT_POS_HEART", "FRAGMENT_POS_MAP", "", "STRAIN_CALIBRATION_SECONDS", "J", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m23842a(Intent intent) {
            AbstractC22676k.m65750j(intent, "<this>");
            return intent.hasExtra("sport");
        }

        /* JADX INFO: renamed from: b */
        public final C9845b m23843b(Context context, C29020i realTimeStreamStateMachine) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(realTimeStreamStateMachine, "realTimeStreamStateMachine");
            return new C9845b(context, realTimeStreamStateMachine);
        }

        /* JADX INFO: renamed from: c */
        public final boolean m23844c(Intent intent) {
            AbstractC22676k.m65750j(intent, "<this>");
            return intent.getBooleanExtra("isForNap", false);
        }

        /* JADX INFO: renamed from: d */
        public final boolean m23845d(Intent intent) {
            AbstractC22676k.m65750j(intent, "<this>");
            return intent.getBooleanExtra("isForSleep", false);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.RealTimeRecordActivity$b */
    @Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0019\u0010\r\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0000¢\u0006\u0004\b\"\u0010\tJ\r\u0010#\u001a\u00020\u0000¢\u0006\u0004\b#\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, m65681d2 = {"Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;", "Lhj0/q;", "Landroid/content/Context;", "context", "Lp92/i;", "realTimeStreamController", "<init>", "(Landroid/content/Context;Lp92/i;)V", "y", "()Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;", "x", "Lcom/whoop/service/network/model/Sport;", "sport", "z", "(Lcom/whoop/service/network/model/Sport;)Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;", "Landroid/content/Intent;", "f", "()Landroid/content/Intent;", "Llm2/b;", "activity", "u", "(Llm2/b;)Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;", "Lcom/whoop/domain/model/StrainRecoveryMapping;", "mapping", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lcom/whoop/domain/model/StrainRecoveryMapping;)Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;", "", "strainGoal", "A", "(D)Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;", "", "value", "v", "(Z)Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;", "s", "r", "d", "Lp92/i;", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9845b extends C17358q {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C29020i realTimeStreamController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9845b(Context context, C29020i realTimeStreamController) {
            super(context, (Class<?>) RealTimeRecordActivity.class);
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(realTimeStreamController, "realTimeStreamController");
            this.realTimeStreamController = realTimeStreamController;
            m49145b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: t */
        public static final void m23847t(C9845b c9845b) {
            c9845b.realTimeStreamController.m88252b();
        }

        /* JADX INFO: renamed from: x */
        private final C9845b m23848x() {
            m49150i().putExtra("isForNap", true);
            return this;
        }

        /* JADX INFO: renamed from: y */
        private final C9845b m23849y() {
            m49150i().putExtra("isForSleep", true);
            return this;
        }

        /* JADX INFO: renamed from: z */
        private final C9845b m23850z(Sport sport) {
            m49150i().putExtra("sport", sport);
            return this;
        }

        /* JADX INFO: renamed from: A */
        public final C9845b m23851A(double strainGoal) {
            m49150i().putExtra("strainGoal", strainGoal);
            return this;
        }

        @Override // hj0.C17358q
        /* JADX INFO: renamed from: f */
        public Intent mo23852f() {
            if (m49150i().hasExtra("sport")) {
                this.realTimeStreamController.m88251a();
                AbstractC38077d.m121983a().postDelayed(new RunnableC24693e(this, 4), 8000L);
            }
            Intent intentMo23852f = super.mo23852f();
            AbstractC22676k.m65749i(intentMo23852f, "build(...)");
            return intentMo23852f;
        }

        /* JADX INFO: renamed from: r */
        public final C9845b m23853r() {
            m49150i().putExtra("end", true);
            return this;
        }

        /* JADX INFO: renamed from: s */
        public final C9845b m23854s() {
            m49150i().putExtra("existingRecording", true);
            return this;
        }

        /* JADX INFO: renamed from: u */
        public final C9845b m23855u(InterfaceC24516b activity) {
            AbstractC22676k.m65750j(activity, "activity");
            if (activity instanceof C24517c) {
                return ((C24517c) activity).m71418s() ? m23848x() : m23849y();
            }
            if (activity instanceof C24518d) {
                return m23850z(((C24518d) activity).m71421k());
            }
            InterfaceC34116n.INSTANCE.m107848a("RealTimeRecordActIntentBuild").mo85222m("Unrecognized activity: " + activity, new AbstractC30556a.a[0]);
            return this;
        }

        /* JADX INFO: renamed from: v */
        public final C9845b m23856v(boolean value) {
            m49150i().putExtra("isGps", value);
            return this;
        }

        /* JADX INFO: renamed from: w */
        public final C9845b m23857w(StrainRecoveryMapping mapping) {
            if (mapping != null) {
                m49150i().putExtra("strainMapping", (Parcelable) mapping);
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.RealTimeRecordActivity$c */
    @InterfaceC32271e(m100429c = "com.whoop.realtime.presentation.RealTimeRecordActivity", m100430f = "RealTimeRecordActivity.kt", m100431l = {567, 569, 571}, m100432m = "animateCountdown", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9846c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f28808w;

        /* JADX INFO: renamed from: y */
        int f28810y;

        public C9846c(InterfaceC30057d<? super C9846c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f28808w = obj;
            this.f28810y |= Integer.MIN_VALUE;
            return RealTimeRecordActivity.this.m23807d0(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.RealTimeRecordActivity$d */
    @InterfaceC32271e(m100429c = "com.whoop.realtime.presentation.RealTimeRecordActivity$countdownWorkout$1", m100430f = "RealTimeRecordActivity.kt", m100431l = {553}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9847d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f28811w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f28812x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ long f28814z;

        /* JADX INFO: renamed from: com.whoop.realtime.presentation.RealTimeRecordActivity$d$a */
        @InterfaceC32271e(m100429c = "com.whoop.realtime.presentation.RealTimeRecordActivity$countdownWorkout$1$1", m100430f = "RealTimeRecordActivity.kt", m100431l = {549}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f28815w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ RealTimeRecordActivity f28816x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ long f28817y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(RealTimeRecordActivity realTimeRecordActivity, long j7, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f28816x = realTimeRecordActivity;
                this.f28817y = j7;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f28816x, this.f28817y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f28815w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    UserRepository userRepositoryM23836w0 = this.f28816x.m23836w0();
                    this.f28815w = 1;
                    obj = userRepositoryM23836w0.getRestingHeartRate(false, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                RestingHeartRate restingHeartRate = (RestingHeartRate) obj;
                C9907b c9907b = this.f28816x.controller;
                if (c9907b == null) {
                    AbstractC22676k.m65757q("controller");
                    throw null;
                }
                long j7 = this.f28817y;
                InterfaceC24516b interfaceC24516b = this.f28816x.activity;
                StrainRecoveryMapping strainRecoveryMapping = this.f28816x.strainMapping;
                Double d3 = this.f28816x.strainGoal;
                c9907b.m24274R(j7, interfaceC24516b, strainRecoveryMapping, d3 != null ? d3.doubleValue() : 0.0d, this.f28816x.useGps, restingHeartRate);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9847d(long j7, InterfaceC30057d<? super C9847d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f28814z = j7;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C9847d c9847d = RealTimeRecordActivity.this.new C9847d(this.f28814z, interfaceC30057d);
            c9847d.f28812x = obj;
            return c9847d;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C9847d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f28812x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f28811w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new a(RealTimeRecordActivity.this, this.f28814z, null), 3);
                RealTimeRecordActivity realTimeRecordActivity = RealTimeRecordActivity.this;
                this.f28812x = null;
                this.f28811w = 1;
                if (realTimeRecordActivity.m23807d0(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            RealTimeRecordActivity.this.m23824l1(this.f28814z);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.RealTimeRecordActivity$e */
    @InterfaceC32271e(m100429c = "com.whoop.realtime.presentation.RealTimeRecordActivity$countdownWorkout$2", m100430f = "RealTimeRecordActivity.kt", m100431l = {559, 560}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9848e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f28819w;

        /* JADX INFO: renamed from: x */
        Object f28820x;

        /* JADX INFO: renamed from: y */
        int f28821y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f28822z;

        /* JADX INFO: renamed from: com.whoop.realtime.presentation.RealTimeRecordActivity$e$a */
        @InterfaceC32271e(m100429c = "com.whoop.realtime.presentation.RealTimeRecordActivity$countdownWorkout$2$getRhrJob$1", m100430f = "RealTimeRecordActivity.kt", m100431l = {558}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/data/repositories/RestingHeartRate;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/data/repositories/RestingHeartRate;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f28823w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ RealTimeRecordActivity f28824x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(RealTimeRecordActivity realTimeRecordActivity, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f28824x = realTimeRecordActivity;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f28824x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super RestingHeartRate> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f28823w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                UserRepository userRepositoryM23836w0 = this.f28824x.m23836w0();
                this.f28823w = 1;
                Object restingHeartRate = userRepositoryM23836w0.getRestingHeartRate(true, this);
                return restingHeartRate == enumC31071a ? enumC31071a : restingHeartRate;
            }
        }

        public C9848e(InterfaceC30057d<? super C9848e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C9848e c9848e = RealTimeRecordActivity.this.new C9848e(interfaceC30057d);
            c9848e.f28822z = obj;
            return c9848e;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C9848e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC3018i0 interfaceC3018i0M8711e;
            RealTimeRecordActivity realTimeRecordActivity;
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f28822z;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f28821y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                interfaceC3018i0M8711e = AbstractC3006f0.m8711e(interfaceC2994c0, null, new a(RealTimeRecordActivity.this, null), 3);
                RealTimeRecordActivity realTimeRecordActivity2 = RealTimeRecordActivity.this;
                this.f28822z = null;
                this.f28819w = interfaceC3018i0M8711e;
                this.f28821y = 1;
                if (realTimeRecordActivity2.m23807d0(this) != enumC31071a) {
                }
                return enumC31071a;
            }
            if (i13 == 1) {
                interfaceC3018i0M8711e = (InterfaceC3018i0) this.f28819w;
                AbstractC34132o.m107864I(obj);
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                realTimeRecordActivity = (RealTimeRecordActivity) this.f28820x;
                AbstractC34132o.m107864I(obj);
            }
            realTimeRecordActivity.m23822k1((RestingHeartRate) obj);
            return C23454a0.f92919a;
            RealTimeRecordActivity realTimeRecordActivity3 = RealTimeRecordActivity.this;
            this.f28822z = null;
            this.f28819w = null;
            this.f28820x = realTimeRecordActivity3;
            this.f28821y = 2;
            Object objAwait = interfaceC3018i0M8711e.await(this);
            if (objAwait != enumC31071a) {
                realTimeRecordActivity = realTimeRecordActivity3;
                obj = objAwait;
                realTimeRecordActivity.m23822k1((RestingHeartRate) obj);
                return C23454a0.f92919a;
            }
            return enumC31071a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.RealTimeRecordActivity$f */
    @InterfaceC32271e(m100429c = "com.whoop.realtime.presentation.RealTimeRecordActivity$onCreate$2", m100430f = "RealTimeRecordActivity.kt", m100431l = {234}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9849f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f28825w;

        /* JADX INFO: renamed from: x */
        int f28826x;

        public C9849f(InterfaceC30057d<? super C9849f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return RealTimeRecordActivity.this.new C9849f(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C9849f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            RealTimeRecordActivity realTimeRecordActivity;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f28826x;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    RealTimeRecordActivity realTimeRecordActivity2 = RealTimeRecordActivity.this;
                    InterfaceC13058l interfaceC13058lM83933d = realTimeRecordActivity2.m23821k0().getCycleDataFlow();
                    this.f28825w = realTimeRecordActivity2;
                    this.f28826x = 1;
                    Object objM36575A = AbstractC13091v.m36575A(interfaceC13058lM83933d, this);
                    if (objM36575A == enumC31071a) {
                        return enumC31071a;
                    }
                    realTimeRecordActivity = realTimeRecordActivity2;
                    obj = objM36575A;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    realTimeRecordActivity = (RealTimeRecordActivity) this.f28825w;
                    AbstractC34132o.m107864I(obj);
                }
                realTimeRecordActivity.currentCycleMetadata = (CycleMetadataResponseDto) obj;
            } catch (Exception e5) {
                RealTimeRecordActivity.this.logger.mo85230v("Failed to load cycle metadata from unified endpoint", e5, new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.RealTimeRecordActivity$g */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"com/whoop/realtime/presentation/RealTimeRecordActivity$g", "Lg/t;", "Ll83/a0;", "d", "()V", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9850g extends AbstractC14917t {
        public C9850g() {
            super(true);
        }

        @Override // p161g.AbstractC14917t
        /* JADX INFO: renamed from: d */
        public void mo4073d() {
            RealTimeRecordActivity.this.m23754A0();
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.RealTimeRecordActivity$h */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9851h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28829w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28830x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28831y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9851h(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28829w = componentCallbacks;
            this.f28830x = interfaceC35951a;
            this.f28831y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.UserRepository, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final UserRepository invoke() {
            ComponentCallbacks componentCallbacks = this.f28829w;
            InterfaceC35951a interfaceC35951a = this.f28830x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f28831y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(UserRepository.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.RealTimeRecordActivity$i */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9852i extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28832w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28833x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28834y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9852i(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28832w = componentCallbacks;
            this.f28833x = interfaceC35951a;
            this.f28834y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od1.f] */
        @Override // c93.InterfaceC4339a
        public final C27843f invoke() {
            ComponentCallbacks componentCallbacks = this.f28832w;
            InterfaceC35951a interfaceC35951a = this.f28833x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f28834y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27843f.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.RealTimeRecordActivity$j */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9853j extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28835w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28836x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28837y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9853j(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28835w = componentCallbacks;
            this.f28836x = interfaceC35951a;
            this.f28837y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagRepository, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagRepository invoke() {
            ComponentCallbacks componentCallbacks = this.f28835w;
            InterfaceC35951a interfaceC35951a = this.f28836x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f28837y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagRepository.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.RealTimeRecordActivity$k */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9854k extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28838w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28839x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28840y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9854k(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28838w = componentCallbacks;
            this.f28839x = interfaceC35951a;
            this.f28840y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od1.c] */
        @Override // c93.InterfaceC4339a
        public final C27840c invoke() {
            ComponentCallbacks componentCallbacks = this.f28838w;
            InterfaceC35951a interfaceC35951a = this.f28839x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f28840y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27840c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.RealTimeRecordActivity$l */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9855l extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28841w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28842x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28843y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9855l(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28841w = componentCallbacks;
            this.f28842x = interfaceC35951a;
            this.f28843y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, u92.d] */
        @Override // c93.InterfaceC4339a
        public final C34660d invoke() {
            ComponentCallbacks componentCallbacks = this.f28841w;
            InterfaceC35951a interfaceC35951a = this.f28842x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f28843y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34660d.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.RealTimeRecordActivity$m */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9856m extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28844w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28845x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28846y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9856m(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28844w = componentCallbacks;
            this.f28845x = interfaceC35951a;
            this.f28846y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, l52.a] */
        @Override // c93.InterfaceC4339a
        public final C23359a invoke() {
            ComponentCallbacks componentCallbacks = this.f28844w;
            InterfaceC35951a interfaceC35951a = this.f28845x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f28846y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C23359a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.RealTimeRecordActivity$n */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9857n extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28847w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28848x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28849y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9857n(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28847w = componentCallbacks;
            this.f28848x = interfaceC35951a;
            this.f28849y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, m02.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC24882a invoke() {
            ComponentCallbacks componentCallbacks = this.f28847w;
            InterfaceC35951a interfaceC35951a = this.f28848x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f28849y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC24882a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.RealTimeRecordActivity$o */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9858o extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28850w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28851x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28852y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9858o(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28850w = componentCallbacks;
            this.f28851x = interfaceC35951a;
            this.f28852y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, m02.b] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC24883b invoke() {
            ComponentCallbacks componentCallbacks = this.f28850w;
            InterfaceC35951a interfaceC35951a = this.f28851x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f28852y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC24883b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.RealTimeRecordActivity$p */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9859p extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28853w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28854x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28855y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9859p(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28853w = componentCallbacks;
            this.f28854x = interfaceC35951a;
            this.f28855y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.realtime.presentation.f, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C9882f invoke() {
            ComponentCallbacks componentCallbacks = this.f28853w;
            InterfaceC35951a interfaceC35951a = this.f28854x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f28855y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9882f.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.RealTimeRecordActivity$q */
    @InterfaceC32271e(m100429c = "com.whoop.realtime.presentation.RealTimeRecordActivity$splashNonWorkout$1", m100430f = "RealTimeRecordActivity.kt", m100431l = {508}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9860q extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f28856w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f28857x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ long f28859z;

        /* JADX INFO: renamed from: com.whoop.realtime.presentation.RealTimeRecordActivity$q$a */
        @InterfaceC32271e(m100429c = "com.whoop.realtime.presentation.RealTimeRecordActivity$splashNonWorkout$1$1", m100430f = "RealTimeRecordActivity.kt", m100431l = {504}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f28860w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ RealTimeRecordActivity f28861x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ long f28862y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(RealTimeRecordActivity realTimeRecordActivity, long j7, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f28861x = realTimeRecordActivity;
                this.f28862y = j7;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f28861x, this.f28862y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f28860w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    UserRepository userRepositoryM23836w0 = this.f28861x.m23836w0();
                    this.f28860w = 1;
                    obj = userRepositoryM23836w0.getRestingHeartRate(false, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                RestingHeartRate restingHeartRate = (RestingHeartRate) obj;
                C9907b c9907b = this.f28861x.controller;
                if (c9907b != null) {
                    c9907b.m24273Q(this.f28862y, this.f28861x.activity, restingHeartRate);
                    return C23454a0.f92919a;
                }
                AbstractC22676k.m65757q("controller");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9860q(long j7, InterfaceC30057d<? super C9860q> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f28859z = j7;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C9860q c9860q = RealTimeRecordActivity.this.new C9860q(this.f28859z, interfaceC30057d);
            c9860q.f28857x = obj;
            return c9860q;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C9860q) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f28857x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f28856w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new a(RealTimeRecordActivity.this, this.f28859z, null), 3);
                this.f28857x = null;
                this.f28856w = 1;
                if (AbstractC3034m0.m8782b(HMSConstantsKt.TIMEOUT_FOR_LOW_SPEED_INDICATOR_MILLIS, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            View view = RealTimeRecordActivity.this.sleepSplashContent;
            if (view == null) {
                AbstractC22676k.m65757q("sleepSplashContent");
                throw null;
            }
            view.setVisibility(0);
            RealTimeRecordActivity.this.m23820j1(this.f28859z);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.RealTimeRecordActivity$r */
    @InterfaceC32271e(m100429c = "com.whoop.realtime.presentation.RealTimeRecordActivity$splashNonWorkout$2", m100430f = "RealTimeRecordActivity.kt", m100431l = {517, 518}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9861r extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f28864w;

        /* JADX INFO: renamed from: x */
        Object f28865x;

        /* JADX INFO: renamed from: y */
        int f28866y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f28867z;

        /* JADX INFO: renamed from: com.whoop.realtime.presentation.RealTimeRecordActivity$r$a */
        @InterfaceC32271e(m100429c = "com.whoop.realtime.presentation.RealTimeRecordActivity$splashNonWorkout$2$delayJob$1", m100430f = "RealTimeRecordActivity.kt", m100431l = {515}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f28868w;

            public a(InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f28868w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f28868w = 1;
                    if (AbstractC3034m0.m8782b(HMSConstantsKt.TIMEOUT_FOR_LOW_SPEED_INDICATOR_MILLIS, this) == enumC31071a) {
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

        /* JADX INFO: renamed from: com.whoop.realtime.presentation.RealTimeRecordActivity$r$b */
        @InterfaceC32271e(m100429c = "com.whoop.realtime.presentation.RealTimeRecordActivity$splashNonWorkout$2$getRhrJob$1", m100430f = "RealTimeRecordActivity.kt", m100431l = {516}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/data/repositories/RestingHeartRate;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/data/repositories/RestingHeartRate;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f28869w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ RealTimeRecordActivity f28870x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(RealTimeRecordActivity realTimeRecordActivity, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f28870x = realTimeRecordActivity;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f28870x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super RestingHeartRate> interfaceC30057d) {
                return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f28869w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                UserRepository userRepositoryM23836w0 = this.f28870x.m23836w0();
                this.f28869w = 1;
                Object restingHeartRate = userRepositoryM23836w0.getRestingHeartRate(true, this);
                return restingHeartRate == enumC31071a ? enumC31071a : restingHeartRate;
            }
        }

        public C9861r(InterfaceC30057d<? super C9861r> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C9861r c9861r = RealTimeRecordActivity.this.new C9861r(interfaceC30057d);
            c9861r.f28867z = obj;
            return c9861r;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C9861r) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
        
            if (r9 == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f28867z
                bc3.c0 r0 = (bc3.InterfaceC2994c0) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r8.f28866y
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L31
                if (r2 == r4) goto L25
                if (r2 != r3) goto L1d
                java.lang.Object r0 = r8.f28865x
                bc3.i0 r0 = (bc3.InterfaceC3018i0) r0
                java.lang.Object r0 = r8.f28864w
                bc3.i0 r0 = (bc3.InterfaceC3018i0) r0
                p505ts.AbstractC34132o.m107864I(r9)
                goto L67
            L1d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L25:
                java.lang.Object r0 = r8.f28865x
                bc3.i0 r0 = (bc3.InterfaceC3018i0) r0
                java.lang.Object r2 = r8.f28864w
                bc3.i0 r2 = (bc3.InterfaceC3018i0) r2
                p505ts.AbstractC34132o.m107864I(r9)
                goto L58
            L31:
                p505ts.AbstractC34132o.m107864I(r9)
                com.whoop.realtime.presentation.RealTimeRecordActivity$r$a r9 = new com.whoop.realtime.presentation.RealTimeRecordActivity$r$a
                r9.<init>(r5)
                r2 = 3
                bc3.j0 r9 = bc3.AbstractC3006f0.m8711e(r0, r5, r9, r2)
                com.whoop.realtime.presentation.RealTimeRecordActivity$r$b r6 = new com.whoop.realtime.presentation.RealTimeRecordActivity$r$b
                com.whoop.realtime.presentation.RealTimeRecordActivity r7 = com.whoop.realtime.presentation.RealTimeRecordActivity.this
                r6.<init>(r7, r5)
                bc3.j0 r0 = bc3.AbstractC3006f0.m8711e(r0, r5, r6, r2)
                r8.f28867z = r5
                r8.f28864w = r5
                r8.f28865x = r0
                r8.f28866y = r4
                java.lang.Object r9 = r9.m8817m(r8)
                if (r9 != r1) goto L58
                goto L66
            L58:
                r8.f28867z = r5
                r8.f28864w = r5
                r8.f28865x = r5
                r8.f28866y = r3
                java.lang.Object r9 = r0.await(r8)
                if (r9 != r1) goto L67
            L66:
                return r1
            L67:
                com.whoop.data.repositories.RestingHeartRate r9 = (com.whoop.data.repositories.RestingHeartRate) r9
                com.whoop.realtime.presentation.RealTimeRecordActivity r0 = com.whoop.realtime.presentation.RealTimeRecordActivity.this
                android.view.View r0 = com.whoop.realtime.presentation.RealTimeRecordActivity.m23782Q(r0)
                if (r0 == 0) goto Lb0
                r1 = 0
                r0.setVisibility(r1)
                com.whoop.realtime.presentation.RealTimeRecordActivity r0 = com.whoop.realtime.presentation.RealTimeRecordActivity.this
                android.view.View r0 = com.whoop.realtime.presentation.RealTimeRecordActivity.m23780P(r0)
                if (r0 == 0) goto Laa
                long r2 = java.lang.System.currentTimeMillis()
                com.whoop.realtime.presentation.RealTimeRecordActivity r4 = com.whoop.realtime.presentation.RealTimeRecordActivity.this
                com.whoop.realtime.service.b r4 = com.whoop.realtime.presentation.RealTimeRecordActivity.m23775M(r4)
                if (r4 == 0) goto La4
                com.whoop.realtime.presentation.RealTimeRecordActivity r5 = com.whoop.realtime.presentation.RealTimeRecordActivity.this
                lm2.b r5 = com.whoop.realtime.presentation.RealTimeRecordActivity.m23773L(r5)
                r4.m24273Q(r2, r5, r9)
                com.whoop.realtime.presentation.RealTimeRecordActivity r9 = com.whoop.realtime.presentation.RealTimeRecordActivity.this
                com.whoop.realtime.presentation.RealTimeRecordActivity.m23793W(r9, r0, r2)
                com.whoop.realtime.presentation.RealTimeRecordActivity r9 = com.whoop.realtime.presentation.RealTimeRecordActivity.this
                com.whoop.realtime.presentation.RealTimeRecordActivity.m23795X(r9)
                com.whoop.realtime.presentation.RealTimeRecordActivity r9 = com.whoop.realtime.presentation.RealTimeRecordActivity.this
                com.whoop.realtime.presentation.RealTimeRecordActivity.m23799Z(r9, r1)
                l83.a0 r9 = l83.C23454a0.f92919a
                return r9
            La4:
                java.lang.String r9 = "controller"
                p715kotlin.jvm.internal.AbstractC22676k.m65757q(r9)
                throw r5
            Laa:
                java.lang.String r9 = "sleepSplash"
                p715kotlin.jvm.internal.AbstractC22676k.m65757q(r9)
                throw r5
            Lb0:
                java.lang.String r9 = "sleepSplashContent"
                p715kotlin.jvm.internal.AbstractC22676k.m65757q(r9)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.realtime.presentation.RealTimeRecordActivity.C9861r.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        PeriodFormatterBuilder periodFormatterBuilder = new PeriodFormatterBuilder();
        periodFormatterBuilder.printZeroAlways();
        periodFormatterBuilder.minimumPrintedDigits(2);
        periodFormatterBuilder.appendHours();
        periodFormatterBuilder.appendSuffix(":");
        periodFormatterBuilder.minimumPrintedDigits(2);
        periodFormatterBuilder.appendMinutes();
        periodFormatterBuilder.appendSuffix(":");
        periodFormatterBuilder.minimumPrintedDigits(2);
        periodFormatterBuilder.appendSeconds();
        f28768w0 = periodFormatterBuilder.toFormatter();
    }

    public RealTimeRecordActivity() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.userRepository = AbstractC30060g.m92087G(enumC23463i, new C9851h(this, null, null));
        this.cycleMgr = AbstractC30060g.m92087G(enumC23463i, new C9852i(this, null, null));
        this.featureFlagRepository = AbstractC30060g.m92087G(enumC23463i, new C9853j(this, null, null));
        this.currentCycleInteractor = AbstractC30060g.m92087G(enumC23463i, new C9854k(this, null, null));
        this.strainCoachPrefs = AbstractC30060g.m92087G(enumC23463i, new C9855l(this, new C35953c("strainCoachPrefs"), null));
        this.mapboxManager = AbstractC30060g.m92087G(enumC23463i, new C9856m(this, null, null));
        this.homeNavigator = AbstractC30060g.m92087G(enumC23463i, new C9857n(this, null, null));
        this.whoopLiveNavigator = AbstractC30060g.m92087G(enumC23463i, new C9858o(this, null, null));
        this.addableActivityFetcher = AbstractC30060g.m92087G(enumC23463i, new C9859p(this, null, null));
        this.timerUpdateAction = new C3374c(this, 27);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public final void m23754A0() {
        if (this.isSplashing) {
            return;
        }
        m23798Y0();
    }

    /* JADX INFO: renamed from: B0 */
    private final void m23755B0() {
        C9907b c9907b = (C9907b) AbstractC29125c.m88492A(this).m122602a(new C27072e(this, 10), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9907b.class), null);
        this.controller = c9907b;
        if (c9907b == null) {
            AbstractC22676k.m65757q("controller");
            throw null;
        }
        c9907b.m24271O(new C27588y(this));
        C9907b c9907b2 = this.controller;
        if (c9907b2 != null) {
            c9907b2.m24275n(this.strainControllerSubject);
        } else {
            AbstractC22676k.m65757q("controller");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final C34911a m23756C0(RealTimeRecordActivity realTimeRecordActivity) {
        return AbstractC15751g.m44431K(realTimeRecordActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final void m23758D0(RealTimeRecordActivity realTimeRecordActivity, Long l7, Long l12) {
        realTimeRecordActivity.m23784R0(l7, l12);
    }

    /* JADX INFO: renamed from: E0 */
    private final void m23760E0() {
        View viewFindViewById = findViewById(AbstractC22208d.f86359l);
        AbstractC22676k.m65749i(viewFindViewById, "findViewById(...)");
        this.sleepSplash = viewFindViewById;
        View viewFindViewById2 = findViewById(AbstractC22208d.f86361m);
        AbstractC22676k.m65749i(viewFindViewById2, "findViewById(...)");
        this.sleepSplashContent = viewFindViewById2;
        View viewFindViewById3 = findViewById(AbstractC22208d.f86363n);
        AbstractC22676k.m65749i(viewFindViewById3, "findViewById(...)");
        this.sleepSplashText = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(AbstractC22208d.f86357k);
        AbstractC22676k.m65749i(viewFindViewById4, "findViewById(...)");
        this.sleepSplashIcon = (ImageView) viewFindViewById4;
        View viewFindViewById5 = findViewById(AbstractC22208d.f86375t);
        AbstractC22676k.m65749i(viewFindViewById5, "findViewById(...)");
        this.workoutCountdown = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(AbstractC22208d.f86369q);
        AbstractC22676k.m65749i(viewFindViewById6, "findViewById(...)");
        this.timerContainer = viewFindViewById6;
        View viewFindViewById7 = findViewById(AbstractC22208d.f86371r);
        AbstractC22676k.m65749i(viewFindViewById7, "findViewById(...)");
        this.toolbar = viewFindViewById7;
        View viewFindViewById8 = findViewById(AbstractC22208d.f86340e);
        AbstractC22676k.m65749i(viewFindViewById8, "findViewById(...)");
        this.resumeButton = viewFindViewById8;
        View viewFindViewById9 = findViewById(AbstractC22208d.f86377u);
        AbstractC22676k.m65749i(viewFindViewById9, "findViewById(...)");
        this.saveButton = viewFindViewById9;
        View viewFindViewById10 = findViewById(AbstractC22208d.f86367p);
        AbstractC22676k.m65749i(viewFindViewById10, "findViewById(...)");
        this.timerTv = (TextView) viewFindViewById10;
        View viewFindViewById11 = findViewById(AbstractC22208d.f86365o);
        AbstractC22676k.m65749i(viewFindViewById11, "findViewById(...)");
        this.tabStrip = (SlidingTabIndicator) viewFindViewById11;
        View viewFindViewById12 = findViewById(AbstractC22208d.f86373s);
        AbstractC22676k.m65749i(viewFindViewById12, "findViewById(...)");
        this.pager = (WhoopViewPager) viewFindViewById12;
        View viewFindViewById13 = findViewById(AbstractC22208d.f86313S0);
        AbstractC22676k.m65749i(viewFindViewById13, "findViewById(...)");
        this.toolbarContainer = viewFindViewById13;
    }

    /* JADX INFO: renamed from: F0 */
    public static final C9845b m23762F0(Context context, C29020i c29020i) {
        return INSTANCE.m23843b(context, c29020i);
    }

    /* JADX INFO: renamed from: G0 */
    private final boolean m23764G0(Intent intent) {
        return intent.getBooleanExtra("end", false);
    }

    /* JADX INFO: renamed from: H0 */
    private final boolean m23766H0(Intent intent) {
        return intent.getBooleanExtra("existingRecording", false);
    }

    /* JADX INFO: renamed from: I0 */
    private final boolean m23768I0(Intent intent) {
        return intent.getBooleanExtra("isGps", false);
    }

    /* JADX INFO: renamed from: J0 */
    private final boolean m23770J0() {
        InterfaceC24516b interfaceC24516bM23817i0 = m23817i0();
        return (interfaceC24516bM23817i0 instanceof C24517c) && ((C24517c) interfaceC24516bM23817i0).m71418s();
    }

    /* JADX INFO: renamed from: K0 */
    private final boolean m23772K0() {
        InterfaceC24516b interfaceC24516bM23817i0 = m23817i0();
        if (!(interfaceC24516bM23817i0 instanceof C24518d)) {
            return false;
        }
        Sport sportM71421k = ((C24518d) interfaceC24516bM23817i0).m71421k();
        return (sportM71421k != null ? sportM71421k.getCategory() : null) == SportCategory.RESTORATIVE;
    }

    /* JADX INFO: renamed from: L0 */
    private final boolean m23774L0() {
        InterfaceC24516b interfaceC24516bM23817i0 = m23817i0();
        return (interfaceC24516bM23817i0 instanceof C24517c) && !((C24517c) interfaceC24516bM23817i0).m71418s();
    }

    /* JADX INFO: renamed from: M0 */
    private final boolean m23776M0() {
        return m23817i0() instanceof C24518d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public final void m23779O0(View splashContainer, long startTime) {
        this.logger.mo85216g(AbstractC11895b.m31994m(startTime, "STRAINCOACH RealTimeRecordActivity starting timer at "), new AbstractC30556a.a[0]);
        if (splashContainer != null) {
            View view = this.toolbar;
            if (view == null) {
                AbstractC22676k.m65757q("toolbar");
                throw null;
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(splashContainer, "translationY", 0.0f, view.getBottom() - splashContainer.getBottom());
            objectAnimatorOfFloat.setDuration(400L);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(splashContainer, "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat2.setDuration(180L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet.start();
        } else {
            m23806c1();
        }
        C29988f c29988f = new C29988f(startTime, 1000L, this.timerUpdateAction);
        this.timer = c29988f;
        c29988f.m91719e();
    }

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
    /* JADX INFO: renamed from: P0 */
    private final void m23781P0() {
        if (!m23776M0()) {
            if (m23774L0() || m23770J0()) {
                AbstractC1329o1 abstractC1329o1M49102v = m49102v();
                AbstractC22676k.m65749i(abstractC1329o1M49102v, "getWhoopFragmentManager(...)");
                C28860c c28860c = new C28860c(abstractC1329o1M49102v, m23774L0());
                WhoopViewPager whoopViewPager = this.pager;
                if (whoopViewPager == null) {
                    AbstractC22676k.m65757q("pager");
                    throw null;
                }
                whoopViewPager.setAdapter(c28860c);
                SlidingTabIndicator slidingTabIndicator = this.tabStrip;
                if (slidingTabIndicator != null) {
                    slidingTabIndicator.setVisibility(8);
                    return;
                } else {
                    AbstractC22676k.m65757q("tabStrip");
                    throw null;
                }
            }
            return;
        }
        AbstractC1329o1 abstractC1329o1M49102v2 = m49102v();
        AbstractC22676k.m65749i(abstractC1329o1M49102v2, "getWhoopFragmentManager(...)");
        WhoopViewPager whoopViewPager2 = this.pager;
        if (whoopViewPager2 == null) {
            AbstractC22676k.m65757q("pager");
            throw null;
        }
        StrainRecoveryMapping strainRecoveryMappingM23834t0 = m23834t0();
        Double dM23833s0 = m23833s0();
        Companion companion = INSTANCE;
        Intent intent = getIntent();
        AbstractC22676k.m65749i(intent, "getIntent(...)");
        boolean zM23842a = companion.m23842a(intent);
        Intent intent2 = getIntent();
        AbstractC22676k.m65749i(intent2, "getIntent(...)");
        C28859b c28859b = new C28859b(abstractC1329o1M49102v2, whoopViewPager2, strainRecoveryMappingM23834t0, dM23833s0, zM23842a, m23830p0(intent2), this.useGps, this);
        WhoopViewPager whoopViewPager3 = this.pager;
        if (whoopViewPager3 == null) {
            AbstractC22676k.m65757q("pager");
            throw null;
        }
        whoopViewPager3.setAdapter(c28859b);
        WhoopViewPager whoopViewPager4 = this.pager;
        if (whoopViewPager4 == null) {
            AbstractC22676k.m65757q("pager");
            throw null;
        }
        whoopViewPager4.requestTransparentRegion(whoopViewPager4);
        SlidingTabIndicator slidingTabIndicator2 = this.tabStrip;
        if (slidingTabIndicator2 == null) {
            AbstractC22676k.m65757q("tabStrip");
            throw null;
        }
        WhoopViewPager whoopViewPager5 = this.pager;
        if (whoopViewPager5 == null) {
            AbstractC22676k.m65757q("pager");
            throw null;
        }
        slidingTabIndicator2.setViewPager(whoopViewPager5);
        SlidingTabIndicator slidingTabIndicator3 = this.tabStrip;
        if (slidingTabIndicator3 == null) {
            AbstractC22676k.m65757q("tabStrip");
            throw null;
        }
        slidingTabIndicator3.setVisibility(0);
        WhoopViewPager whoopViewPager6 = this.pager;
        if (whoopViewPager6 == null) {
            AbstractC22676k.m65757q("pager");
            throw null;
        }
        whoopViewPager6.m5472G(false, new C28858a());
        WhoopViewPager whoopViewPager7 = this.pager;
        if (whoopViewPager7 != null) {
            whoopViewPager7.setOffscreenPageLimit(3);
        } else {
            AbstractC22676k.m65757q("pager");
            throw null;
        }
    }

    /* JADX INFO: renamed from: R0 */
    private final void m23784R0(Long startTime, Long endTime) {
        C29988f c29988f = this.timer;
        if (c29988f != null) {
            c29988f.m91720f();
        }
        this.startedRecording = false;
        if (startTime == null || endTime == null) {
            return;
        }
        this.timerUpdateAction.mo9472b(Long.valueOf(endTime.longValue() - startTime.longValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public final void m23786S0() {
        this.startedRecording = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final void m23788T0(RealTimeRecordActivity realTimeRecordActivity, View view) {
        realTimeRecordActivity.m23794W0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final void m23790U0(RealTimeRecordActivity realTimeRecordActivity, View view) {
        realTimeRecordActivity.m23815h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final void m23792V0(RealTimeRecordActivity realTimeRecordActivity, View view) {
        realTimeRecordActivity.m23826m1();
    }

    /* JADX INFO: renamed from: W0 */
    private final void m23794W0() {
        m23812f1();
    }

    /* JADX INFO: renamed from: X0 */
    private final void m23796X0() {
        if (isTaskRoot()) {
            m23838y0();
        } else {
            finish();
        }
    }

    /* JADX INFO: renamed from: Y0 */
    private final void m23798Y0() {
        if (this.promptBlock.m83141a()) {
            RealTimeFinishPromptActivity.INSTANCE.m23751a(this).m23752q().m49155n(this, 234);
        }
    }

    /* JADX INFO: renamed from: Z0 */
    private final void m23800Z0(InterfaceC24516b activity) {
        this.activity = activity;
    }

    /* JADX INFO: renamed from: a1 */
    private final void m23802a1(Double goal) {
        this.strainGoal = goal;
    }

    /* JADX INFO: renamed from: b1 */
    private final void m23804b1(StrainRecoveryMapping map) {
        this.strainMapping = map;
    }

    /* JADX INFO: renamed from: c1 */
    private final void m23806c1() {
        View view = this.sleepSplash;
        if (view == null) {
            AbstractC22676k.m65757q("sleepSplash");
            throw null;
        }
        view.setVisibility(4);
        TextView textView = this.workoutCountdown;
        if (textView != null) {
            textView.setVisibility(4);
        } else {
            AbstractC22676k.m65757q("workoutCountdown");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        if (bc3.AbstractC3034m0.m8782b(1000, r0) == r1) goto L32;
     */
    /* JADX INFO: renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m23807d0(q83.InterfaceC30057d<? super l83.C23454a0> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.whoop.realtime.presentation.RealTimeRecordActivity.C9846c
            if (r0 == 0) goto L13
            r0 = r11
            com.whoop.realtime.presentation.RealTimeRecordActivity$c r0 = (com.whoop.realtime.presentation.RealTimeRecordActivity.C9846c) r0
            int r1 = r0.f28810y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28810y = r1
            goto L18
        L13:
            com.whoop.realtime.presentation.RealTimeRecordActivity$c r0 = new com.whoop.realtime.presentation.RealTimeRecordActivity$c
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f28808w
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f28810y
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 1000(0x3e8, double:4.94E-321)
            r8 = 0
            java.lang.String r9 = "workoutCountdown"
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            p505ts.AbstractC34132o.m107864I(r11)
            goto L7b
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3a:
            p505ts.AbstractC34132o.m107864I(r11)
            goto L69
        L3e:
            p505ts.AbstractC34132o.m107864I(r11)
            goto L57
        L42:
            p505ts.AbstractC34132o.m107864I(r11)
            android.widget.TextView r11 = r10.workoutCountdown
            if (r11 == 0) goto L93
            java.lang.String r2 = "3"
            r11.setText(r2)
            r0.f28810y = r5
            java.lang.Object r11 = bc3.AbstractC3034m0.m8782b(r6, r0)
            if (r11 != r1) goto L57
            goto L7a
        L57:
            android.widget.TextView r11 = r10.workoutCountdown
            if (r11 == 0) goto L8f
            java.lang.String r2 = "2"
            r11.setText(r2)
            r0.f28810y = r4
            java.lang.Object r11 = bc3.AbstractC3034m0.m8782b(r6, r0)
            if (r11 != r1) goto L69
            goto L7a
        L69:
            android.widget.TextView r11 = r10.workoutCountdown
            if (r11 == 0) goto L8b
            java.lang.String r2 = "1"
            r11.setText(r2)
            r0.f28810y = r3
            java.lang.Object r11 = bc3.AbstractC3034m0.m8782b(r6, r0)
            if (r11 != r1) goto L7b
        L7a:
            return r1
        L7b:
            android.widget.TextView r11 = r10.workoutCountdown
            if (r11 == 0) goto L87
            java.lang.String r0 = ""
            r11.setText(r0)
            l83.a0 r11 = l83.C23454a0.f92919a
            return r11
        L87:
            p715kotlin.jvm.internal.AbstractC22676k.m65757q(r9)
            throw r8
        L8b:
            p715kotlin.jvm.internal.AbstractC22676k.m65757q(r9)
            throw r8
        L8f:
            p715kotlin.jvm.internal.AbstractC22676k.m65757q(r9)
            throw r8
        L93:
            p715kotlin.jvm.internal.AbstractC22676k.m65757q(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.realtime.presentation.RealTimeRecordActivity.m23807d0(q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: d1 */
    private final void m23808d1() {
        String strMo71415h;
        TextView textView = this.sleepSplashText;
        if (textView == null) {
            AbstractC22676k.m65757q("sleepSplashText");
            throw null;
        }
        if (textView == null) {
            AbstractC22676k.m65757q("sleepSplashText");
            throw null;
        }
        String string = textView.getText().toString();
        InterfaceC24516b interfaceC24516bM23817i0 = m23817i0();
        if (interfaceC24516bM23817i0 == null || (strMo71415h = interfaceC24516bM23817i0.mo71415h(this)) == null) {
            strMo71415h = "";
        }
        textView.setText(String.format(string, Arrays.copyOf(new Object[]{strMo71415h}, 1)));
        AbstractC9881e.Companion aVar = AbstractC9881e.INSTANCE;
        ImageView imageView = this.sleepSplashIcon;
        if (imageView == null) {
            AbstractC22676k.m65757q("sleepSplashIcon");
            throw null;
        }
        aVar.m24023a(imageView, m23817i0());
        View view = this.sleepSplash;
        if (view == null) {
            AbstractC22676k.m65757q("sleepSplash");
            throw null;
        }
        view.setVisibility(0);
        TextView textView2 = this.workoutCountdown;
        if (textView2 != null) {
            textView2.setVisibility(4);
        } else {
            AbstractC22676k.m65757q("workoutCountdown");
            throw null;
        }
    }

    /* JADX INFO: renamed from: e0 */
    private final void m23809e0() {
        View viewFindViewById = findViewById(AbstractC22208d.f86343f);
        C27588y c27588y = new C27588y(this);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        AbstractC16877h0.m47517l(viewFindViewById, c27588y);
    }

    /* JADX INFO: renamed from: e1 */
    private final void m23810e1() {
        View view = this.sleepSplash;
        if (view == null) {
            AbstractC22676k.m65757q("sleepSplash");
            throw null;
        }
        view.setVisibility(0);
        TextView textView = this.workoutCountdown;
        if (textView != null) {
            textView.setVisibility(4);
        } else {
            AbstractC22676k.m65757q("workoutCountdown");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C16905q1 m23811f0(RealTimeRecordActivity realTimeRecordActivity, View view, C16905q1 windowInsets) {
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(windowInsets, "windowInsets");
        C16899o1 c16899o1 = windowInsets.f64864a;
        C35643b c35643bMo47530g = c16899o1.mo47530g(1);
        AbstractC22676k.m65749i(c35643bMo47530g, "getInsets(...)");
        C35643b c35643bMo47530g2 = c16899o1.mo47530g(2);
        AbstractC22676k.m65749i(c35643bMo47530g2, "getInsets(...)");
        View view2 = realTimeRecordActivity.toolbarContainer;
        if (view2 == null) {
            AbstractC22676k.m65757q("toolbarContainer");
            throw null;
        }
        view2.setPadding(view2.getPaddingLeft(), c35643bMo47530g.f151450b + realTimeRecordActivity.originalToolbarContainerTopPadding, view2.getPaddingRight(), view2.getPaddingBottom());
        WhoopViewPager whoopViewPager = realTimeRecordActivity.pager;
        if (whoopViewPager == null) {
            AbstractC22676k.m65757q("pager");
            throw null;
        }
        whoopViewPager.setPadding(whoopViewPager.getPaddingLeft(), whoopViewPager.getPaddingTop(), whoopViewPager.getPaddingRight(), c35643bMo47530g2.f151452d);
        return windowInsets;
    }

    /* JADX INFO: renamed from: f1 */
    private final void m23812f1() {
        View view = this.timerContainer;
        if (view == null) {
            AbstractC22676k.m65757q("timerContainer");
            throw null;
        }
        view.setVisibility(0);
        View view2 = this.toolbar;
        if (view2 != null) {
            view2.setVisibility(4);
        } else {
            AbstractC22676k.m65757q("toolbar");
            throw null;
        }
    }

    /* JADX INFO: renamed from: g0 */
    private final void m23813g0() {
        this.isSplashing = true;
        m23816h1();
        if (m23825m0().isFeatureEnabled(OnboardingFeatureFlag.HOME_XP)) {
            TextView textView = this.workoutCountdown;
            if (textView == null) {
                AbstractC22676k.m65757q("workoutCountdown");
                throw null;
            }
            textView.setBackground(getDrawable(AbstractC22207c.f86275p));
        } else {
            TextView textView2 = this.workoutCountdown;
            if (textView2 == null) {
                AbstractC22676k.m65757q("workoutCountdown");
                throw null;
            }
            textView2.setBackground(getDrawable(AbstractC22206b.f86248g));
        }
        if (!m23825m0().isFeatureEnabled(FeatureFlagRepositoryKt.START_ACTIVITY_SKIP_COUNTDOWN_TIMER_START_RECORDING)) {
            AbstractC1613o1.m5020j(this).m4972a(new C9848e(null));
        } else {
            AbstractC1613o1.m5020j(this).m4972a(new C9847d(System.currentTimeMillis(), null));
        }
    }

    /* JADX INFO: renamed from: g1 */
    private final void m23814g1() {
        View view = this.timerContainer;
        if (view == null) {
            AbstractC22676k.m65757q("timerContainer");
            throw null;
        }
        view.setVisibility(4);
        View view2 = this.toolbar;
        if (view2 != null) {
            view2.setVisibility(0);
        } else {
            AbstractC22676k.m65757q("toolbar");
            throw null;
        }
    }

    /* JADX INFO: renamed from: h0 */
    private final void m23815h0() {
        if (this.promptBlock.m83141a()) {
            RealTimeFinishPromptActivity.INSTANCE.m23751a(this).m23752q().m49155n(this, 235);
        }
    }

    /* JADX INFO: renamed from: h1 */
    private final void m23816h1() {
        View view = this.sleepSplash;
        if (view == null) {
            AbstractC22676k.m65757q("sleepSplash");
            throw null;
        }
        view.setVisibility(4);
        TextView textView = this.workoutCountdown;
        if (textView != null) {
            textView.setVisibility(0);
        } else {
            AbstractC22676k.m65757q("workoutCountdown");
            throw null;
        }
    }

    /* JADX INFO: renamed from: i0 */
    private final InterfaceC24516b m23817i0() {
        if (this.activity == null) {
            this.activity = m23819j0().m24024a(this);
        }
        return this.activity;
    }

    /* JADX INFO: renamed from: i1 */
    private final void m23818i1(boolean isSleep) {
        this.isSplashing = true;
        if (isSleep) {
            m23810e1();
        } else {
            m23808d1();
        }
        if (!m23825m0().isFeatureEnabled(FeatureFlagRepositoryKt.START_ACTIVITY_SKIP_COUNTDOWN_TIMER_START_RECORDING)) {
            AbstractC1613o1.m5020j(this).m4972a(new C9861r(null));
        } else {
            AbstractC1613o1.m5020j(this).m4972a(new C9860q(System.currentTimeMillis(), null));
        }
    }

    /* JADX INFO: renamed from: j0 */
    private final C9882f m23819j0() {
        return (C9882f) this.addableActivityFetcher.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public final void m23820j1(long start) {
        View view = this.sleepSplash;
        if (view == null) {
            AbstractC22676k.m65757q("sleepSplash");
            throw null;
        }
        m23779O0(view, start);
        m23786S0();
        this.isSplashing = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public final C27840c m23821k0() {
        return (C27840c) this.currentCycleInteractor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public final void m23822k1(RestingHeartRate restingHr) {
        TextView textView = this.workoutCountdown;
        if (textView == null) {
            AbstractC22676k.m65757q("workoutCountdown");
            throw null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C9907b c9907b = this.controller;
        if (c9907b == null) {
            AbstractC22676k.m65757q("controller");
            throw null;
        }
        InterfaceC24516b interfaceC24516b = this.activity;
        StrainRecoveryMapping strainRecoveryMapping = this.strainMapping;
        Double d3 = this.strainGoal;
        c9907b.m24274R(jCurrentTimeMillis, interfaceC24516b, strainRecoveryMapping, d3 != null ? d3.doubleValue() : 0.0d, this.useGps, restingHr);
        if (m23825m0().isFeatureEnabled(OnboardingFeatureFlag.HOME_XP)) {
            View view = this.toolbar;
            if (view == null) {
                AbstractC22676k.m65757q("toolbar");
                throw null;
            }
            view.setBackground(getDrawable(AbstractC22206b.f86242a));
            View view2 = this.toolbarContainer;
            if (view2 == null) {
                AbstractC22676k.m65757q("toolbarContainer");
                throw null;
            }
            view2.setBackground(getDrawable(AbstractC22206b.f86242a));
            View view3 = this.timerContainer;
            if (view3 == null) {
                AbstractC22676k.m65757q("timerContainer");
                throw null;
            }
            view3.setBackground(getDrawable(AbstractC22206b.f86242a));
        } else {
            View view4 = this.toolbar;
            if (view4 == null) {
                AbstractC22676k.m65757q("toolbar");
                throw null;
            }
            view4.setBackground(getDrawable(AbstractC22206b.f86248g));
            View view5 = this.toolbarContainer;
            if (view5 == null) {
                AbstractC22676k.m65757q("toolbarContainer");
                throw null;
            }
            view5.setBackground(getDrawable(AbstractC22206b.f86248g));
            View view6 = this.timerContainer;
            if (view6 == null) {
                AbstractC22676k.m65757q("timerContainer");
                throw null;
            }
            view6.setBackground(getDrawable(AbstractC22206b.f86248g));
        }
        m23779O0(textView, jCurrentTimeMillis);
        m23786S0();
        this.isSplashing = false;
        this.logger.mo85216g("STRAINCOACH RealTimeRecordActivity startWorkout", new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: l0 */
    private final C27843f m23823l0() {
        return (C27843f) this.cycleMgr.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public final void m23824l1(long start) {
        TextView textView = this.workoutCountdown;
        if (textView == null) {
            AbstractC22676k.m65757q("workoutCountdown");
            throw null;
        }
        if (m23825m0().isFeatureEnabled(OnboardingFeatureFlag.HOME_XP)) {
            View view = this.toolbar;
            if (view == null) {
                AbstractC22676k.m65757q("toolbar");
                throw null;
            }
            view.setBackground(getDrawable(AbstractC22206b.f86242a));
            View view2 = this.toolbarContainer;
            if (view2 == null) {
                AbstractC22676k.m65757q("toolbarContainer");
                throw null;
            }
            view2.setBackground(getDrawable(AbstractC22206b.f86242a));
            View view3 = this.timerContainer;
            if (view3 == null) {
                AbstractC22676k.m65757q("timerContainer");
                throw null;
            }
            view3.setBackground(getDrawable(AbstractC22206b.f86242a));
        } else {
            View view4 = this.toolbar;
            if (view4 == null) {
                AbstractC22676k.m65757q("toolbar");
                throw null;
            }
            view4.setBackground(getDrawable(AbstractC22206b.f86248g));
            View view5 = this.toolbarContainer;
            if (view5 == null) {
                AbstractC22676k.m65757q("toolbarContainer");
                throw null;
            }
            view5.setBackground(getDrawable(AbstractC22206b.f86248g));
            View view6 = this.timerContainer;
            if (view6 == null) {
                AbstractC22676k.m65757q("timerContainer");
                throw null;
            }
            view6.setBackground(getDrawable(AbstractC22206b.f86248g));
        }
        m23779O0(textView, start);
        m23786S0();
        this.isSplashing = false;
        this.logger.mo85216g("STRAINCOACH RealTimeRecordActivity startWorkout", new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: m0 */
    private final FeatureFlagRepository m23825m0() {
        return (FeatureFlagRepository) this.featureFlagRepository.getValue();
    }

    /* JADX INFO: renamed from: m1 */
    private final void m23826m1() {
        m23814g1();
    }

    /* JADX INFO: renamed from: n0 */
    private final InterfaceC24882a m23827n0() {
        return (InterfaceC24882a) this.homeNavigator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public static final void m23828n1(RealTimeRecordActivity realTimeRecordActivity, Long l7) {
        PeriodFormatter periodFormatter = f28768w0;
        AbstractC22676k.m65747g(l7);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(periodFormatter.print(new Period(l7.longValue())));
        TextView textView = realTimeRecordActivity.timerTv;
        if (textView == null) {
            AbstractC22676k.m65757q("timerTv");
            throw null;
        }
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        realTimeRecordActivity.timerSubject.onNext(l7);
    }

    /* JADX INFO: renamed from: o0 */
    private final C23359a m23829o0() {
        return (C23359a) this.mapboxManager.getValue();
    }

    /* JADX INFO: renamed from: p0 */
    private final C24518d m23830p0(Intent intent) {
        return new C24518d((Sport) intent.getParcelableExtra("sport"));
    }

    /* JADX INFO: renamed from: q0 */
    private final C34660d m23831q0() {
        return (C34660d) this.strainCoachPrefs.getValue();
    }

    /* JADX INFO: renamed from: r0 */
    private final double m23832r0(Intent intent) {
        return intent.getDoubleExtra("strainGoal", 0.0d);
    }

    /* JADX INFO: renamed from: s0 */
    private final Double m23833s0() {
        if (this.strainGoal == null) {
            Intent intent = getIntent();
            AbstractC22676k.m65749i(intent, "getIntent(...)");
            Double dValueOf = Double.valueOf(m23832r0(intent));
            this.strainGoal = dValueOf;
            this.logger.mo85216g("STRAINCOACH got strain goal from intent: " + dValueOf, new AbstractC30556a.a[0]);
        }
        return this.strainGoal;
    }

    /* JADX INFO: renamed from: t0 */
    private final StrainRecoveryMapping m23834t0() {
        if (this.strainMapping == null) {
            Intent intent = getIntent();
            AbstractC22676k.m65749i(intent, "getIntent(...)");
            StrainRecoveryMapping strainRecoveryMappingM23835u0 = m23835u0(intent);
            this.strainMapping = strainRecoveryMappingM23835u0;
            this.logger.mo85216g("STRAINCOACH got strain mapping from intent: " + strainRecoveryMappingM23835u0, new AbstractC30556a.a[0]);
        }
        return this.strainMapping;
    }

    /* JADX INFO: renamed from: u0 */
    private final StrainRecoveryMapping m23835u0(Intent intent) {
        return (StrainRecoveryMapping) intent.getParcelableExtra("strainMapping");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public final UserRepository m23836w0() {
        return (UserRepository) this.userRepository.getValue();
    }

    /* JADX INFO: renamed from: x0 */
    private final InterfaceC24883b m23837x0() {
        return (InterfaceC24883b) this.whoopLiveNavigator.getValue();
    }

    /* JADX INFO: renamed from: y0 */
    private final void m23838y0() {
        m23827n0().mo58972b(this);
        finish();
    }

    /* JADX INFO: renamed from: N0 */
    public final void m23839N0() {
        C24884c c24884cM83343a = AbstractC27589z.m83343a(this.currentCycleMetadata);
        if (c24884cM83343a != null) {
            m23837x0().mo59422a(this, c24884cM83343a);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final C38280g<C29019h> m23840Q0() {
        return this.strainControllerSubject;
    }

    @Override // hj0.AbstractActivityC17347f, android.app.Activity
    public void finish() {
        m23823l0().m83944o(UserState.States.IDLE, com.whoop.data.remote.domain.request.UserState.Idle).m122660J();
        super.finish();
    }

    @Override // hj0.AbstractActivityC17347f, androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        m23831q0().m109537p(SharedPreferenceConstants.IS_USING_STRAIN_COACH_IN_REAL_TIME);
        if (resultCode != 0) {
            m23796X0();
            this.promptBlock.m83142b();
        }
    }

    @Override // hj0.AbstractActivityC17347f, androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        String string;
        super.onCreate(savedInstanceState);
        getWindow().addFlags(128);
        this.logger.mo85216g("STRAINCOACH RealTimeRecordActivity onCreate", new AbstractC30556a.a[0]);
        if (savedInstanceState != null) {
            this.startedRecording = savedInstanceState.getBoolean("startedRecording", false);
        }
        Intent intent = getIntent();
        AbstractC22676k.m65749i(intent, "getIntent(...)");
        if (m23766H0(intent)) {
            this.startedRecording = true;
        }
        m23755B0();
        m49096B();
        InterfaceC24516b interfaceC24516bM23817i0 = m23817i0();
        m23834t0();
        m23833s0();
        Intent intent2 = getIntent();
        AbstractC22676k.m65749i(intent2, "getIntent(...)");
        this.useGps = m23768I0(intent2);
        if (this.startedRecording) {
            this.isExistingRecording = true;
            interfaceC24516bM23817i0 = null;
        }
        C9907b c9907b = this.controller;
        if (c9907b == null) {
            AbstractC22676k.m65757q("controller");
            throw null;
        }
        C29016e c29016eM24278s = c9907b.m24278s();
        if (c29016eM24278s != null) {
            InterfaceC34116n interfaceC34116n = this.logger;
            StrainRecoveryMapping strainRecoveryMappingM88172e = c29016eM24278s.m88172e();
            if (strainRecoveryMappingM88172e == null || (string = strainRecoveryMappingM88172e.toString()) == null) {
                string = "null";
            }
            interfaceC34116n.mo85216g("STRAINCOACH resuming existing strainmapping " + string + " and goal " + c29016eM24278s.m88171d(), new AbstractC30556a.a[0]);
            interfaceC24516bM23817i0 = c29016eM24278s.m88168a();
            AbstractC22676k.m65747g(interfaceC24516bM23817i0);
            m23800Z0(interfaceC24516bM23817i0);
            m23804b1(c29016eM24278s.m88172e());
            m23802a1(Double.valueOf(c29016eM24278s.m88171d()));
            this.useGps = c29016eM24278s.m88173f();
            this.isExistingRecording = true;
            this.startedRecording = true;
        }
        if (interfaceC24516bM23817i0 == null) {
            this.logger.mo85222m(AbstractC11266d.m30462p("No activity found, aborting. startedRecording=", this.startedRecording), new AbstractC30556a.a[0]);
            finish();
            return;
        }
        if (m23770J0()) {
            setTheme(AbstractC22211g.f86539b);
        } else if (m23774L0()) {
            setTheme(AbstractC22211g.f86541d);
        } else if (m23772K0()) {
            setTheme(AbstractC22211g.f86540c);
        } else {
            setTheme(AbstractC22211g.f86542e);
        }
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C9849f(null), 3);
        if (this.useGps) {
            m23829o0().m67651b();
        }
        setContentView(AbstractC22209e.f86389a);
        m23760E0();
        View view = this.toolbarContainer;
        if (view == null) {
            AbstractC22676k.m65757q("toolbarContainer");
            throw null;
        }
        this.originalToolbarContainerTopPadding = view.getPaddingTop();
        m23809e0();
        if (this.isExistingRecording) {
            Long lValueOf = c29016eM24278s != null ? Long.valueOf(c29016eM24278s.m88170c()) : null;
            AbstractC22676k.m65747g(lValueOf);
            m23779O0(null, lValueOf.longValue());
        } else if (!m23776M0()) {
            m23818i1(true);
        } else if (m23772K0()) {
            m23818i1(false);
        } else {
            m23813g0();
        }
        View view2 = this.resumeButton;
        if (view2 == null) {
            AbstractC22676k.m65757q("resumeButton");
            throw null;
        }
        final int i13 = 0;
        view2.setOnClickListener(new View.OnClickListener(this) { // from class: o52.x

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ RealTimeRecordActivity f111079x;

            {
                this.f111079x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i13) {
                    case 0:
                        RealTimeRecordActivity.m23788T0(this.f111079x, view3);
                        break;
                    case 1:
                        RealTimeRecordActivity.m23790U0(this.f111079x, view3);
                        break;
                    default:
                        RealTimeRecordActivity.m23792V0(this.f111079x, view3);
                        break;
                }
            }
        });
        View view3 = this.saveButton;
        if (view3 == null) {
            AbstractC22676k.m65757q("saveButton");
            throw null;
        }
        final int i14 = 1;
        view3.setOnClickListener(new View.OnClickListener(this) { // from class: o52.x

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ RealTimeRecordActivity f111079x;

            {
                this.f111079x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i14) {
                    case 0:
                        RealTimeRecordActivity.m23788T0(this.f111079x, view4);
                        break;
                    case 1:
                        RealTimeRecordActivity.m23790U0(this.f111079x, view4);
                        break;
                    default:
                        RealTimeRecordActivity.m23792V0(this.f111079x, view4);
                        break;
                }
            }
        });
        View view4 = this.timerContainer;
        if (view4 == null) {
            AbstractC22676k.m65757q("timerContainer");
            throw null;
        }
        final int i15 = 2;
        view4.setOnClickListener(new View.OnClickListener(this) { // from class: o52.x

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ RealTimeRecordActivity f111079x;

            {
                this.f111079x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                switch (i15) {
                    case 0:
                        RealTimeRecordActivity.m23788T0(this.f111079x, view5);
                        break;
                    case 1:
                        RealTimeRecordActivity.m23790U0(this.f111079x, view5);
                        break;
                    default:
                        RealTimeRecordActivity.m23792V0(this.f111079x, view5);
                        break;
                }
            }
        });
        Intent intent3 = getIntent();
        AbstractC22676k.m65749i(intent3, "getIntent(...)");
        if (m23764G0(intent3)) {
            getIntent().removeExtra("end");
            m23815h0();
        } else {
            m23781P0();
        }
        ((InterfaceC21153l0) AbstractC29125c.m88492A(this).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21153l0.class), null)).mo59004J("RealTimeRecordActivity");
        getOnBackPressedDispatcher().m43015a(this, new C9850g());
    }

    @Override // hj0.AbstractActivityC17347f, p314m.AbstractActivityC24852m, androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public void onDestroy() {
        this.logger.mo85216g("STRAINCOACH RealTimeRecordActivity onDestroy -- stopping timer, disconnecting controller", new AbstractC30556a.a[0]);
        super.onDestroy();
        C29988f c29988f = this.timer;
        if (c29988f != null) {
            c29988f.m91720f();
        }
        C9907b c9907b = this.controller;
        if (c9907b != null) {
            if (c9907b == null) {
                AbstractC22676k.m65757q("controller");
                throw null;
            }
            c9907b.m24277q();
        }
        getWindow().clearFlags(128);
    }

    @Override // p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        AbstractC22676k.m65750j(outState, "outState");
        this.logger.mo85216g("STRAINCOACH RealTimeRecordActivity saveInstanceState", new AbstractC30556a.a[0]);
        super.onSaveInstanceState(outState);
        outState.putBoolean("startedRecording", this.startedRecording);
    }

    @Override // hj0.AbstractActivityC17347f
    /* JADX INFO: renamed from: p */
    public String mo19335p() {
        return "Activity Recording";
    }

    /* JADX INFO: renamed from: v0, reason: from getter */
    public final C24082e getTimerSubject() {
        return this.timerSubject;
    }
}
