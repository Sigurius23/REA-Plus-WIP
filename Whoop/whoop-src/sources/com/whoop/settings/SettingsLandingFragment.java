package com.whoop.settings;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.fragment.app.C1271a;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1585g0;
import as2.AbstractC1953c;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.data.remote.domain.response.growth.AffiliateStatus;
import com.whoop.data.remote.domain.response.growth.MembershipAffiliate;
import com.whoop.data.remote.domain.response.growth.MembershipInfo;
import com.whoop.data.remote.domain.response.growth.MembershipStatus;
import com.whoop.data.repositories.ArabicBetaOptOutStatusStore;
import com.whoop.data.repositories.ArabicLanguageEnabledChecker;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.LanguageChecker;
import com.whoop.domain.model.User;
import com.whoop.navigation.AbstractC9597d;
import com.whoop.navigation.C9598e;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.p069ui.drawer.strapsettings.connectstrap.AbstractC10531a;
import com.whoop.p069ui.pills.StrokedPillButton;
import com.whoop.p069ui.views.WhoopScrollView;
import com.whoop.personalrecords.miniarch.domain.PersonalRecordsApiKt;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.service.network.model.UserSessionDto;
import com.whoop.settings.SettingsLandingFragment;
import com.whoop.settings.about.AbstractC10092a;
import com.whoop.whattoexpect.domain.models.CtaLocation;
import d13.AbstractC11478a;
import dp0.AbstractC12248d;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fa2.C14300c;
import fi0.InterfaceC14515a;
import gc2.EnumC15710a;
import ge3.AbstractC15751g;
import hi0.AbstractC17305c;
import hi0.AbstractC17306d;
import hi0.AbstractC17307e;
import hi0.AbstractC17312j;
import hj0.AbstractC17354m;
import hj0.AbstractC17357p;
import ii0.AbstractC18563s;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.common.model.MimeType;
import j02.AbstractC21157n0;
import j93.InterfaceC21461d;
import j93.InterfaceC21493z;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import jc2.C21606a;
import jd0.C21608a;
import jd0.C21610c;
import jf3.C21647a;
import js0.AbstractC21909c;
import js0.C21908b;
import kc2.C22356f;
import kd0.InterfaceC22381a;
import l83.C23454a0;
import l83.C23465k;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import live.hms.video.media.tracks.HMSTrackSource;
import m83.AbstractC25247g0;
import m83.C25272z;
import nf1.AbstractC26660a;
import od1.InterfaceC27837a0;
import or2.AbstractC28153d;
import or2.AbstractC28163g0;
import or2.AbstractC28165h;
import or2.C28156e;
import or2.C28162g;
import or2.C28198s;
import or2.C28216y;
import oz1.C28498a;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p114eb.AbstractC12939a0;
import p114eb.C12962i;
import p114eb.C12969k0;
import p114eb.C12997x0;
import p114eb.InterfaceC12981p0;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p184h5.C16899o1;
import p184h5.C16905q1;
import p390p1.C28635l;
import p390p1.C28655q;
import p399pb.InterfaceC29049f;
import p479s4.AbstractC32122c;
import p505ts.AbstractC34132o;
import p543v4.C35643b;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p705ea2.C12895a0;
import p705ea2.C12899c0;
import p705ea2.C12910i;
import p705ea2.C12913j0;
import p705ea2.C12916m;
import p705ea2.C12923t;
import p705ea2.C12924u;
import p705ea2.C12925v;
import p705ea2.C12926w;
import p705ea2.C12928y;
import p705ea2.C12929z;
import p705ea2.Function0;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22686q;
import p720m91.AbstractC25303l;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qa2.C30114b;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sz1.C33236a;
import sz1.C33238c;
import td1.InterfaceC33704b;
import tz1.InterfaceC34282d;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import vu1.AbstractC36511b;
import vu1.AbstractC36512c;
import wb2.C37050a;
import x81.AbstractC38073e;
import xf3.C38266c;
import xp0.AbstractC38505d0;
import y71.C39282o;
import ya2.C39357a;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;
import z92.InterfaceC40205a;
import za2.AbstractC40244t;
import za2.C40227c;
import za2.C40234j;
import za2.C40245u;
import zf2.C40613a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000¦\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010\u0003J\u0010\u0010!\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010\u0003J\u000f\u0010$\u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010\u0003J\u000f\u0010%\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010\u0003J\u000f\u0010&\u001a\u00020\u0006H\u0002¢\u0006\u0004\b&\u0010\u0003J\u000f\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010\u0003J\u000f\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010\u0003J\u000f\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010\u0003J\u000f\u0010*\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010\u0003J\u000f\u0010+\u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010\u0003J\u0010\u0010,\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b,\u0010\"J\u000f\u0010-\u001a\u00020\u0006H\u0002¢\u0006\u0004\b-\u0010\u0003J\u000f\u0010.\u001a\u00020\u0006H\u0002¢\u0006\u0004\b.\u0010\u0003J\u000f\u0010/\u001a\u00020\u0006H\u0002¢\u0006\u0004\b/\u0010\u0003J\u000f\u00100\u001a\u00020\u0006H\u0002¢\u0006\u0004\b0\u0010\u0003J\u0010\u00101\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b1\u0010\"J\u0019\u00104\u001a\u00020\u00062\b\u00103\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\b4\u00105J\u0019\u00108\u001a\u00020\u00062\b\u00107\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b:\u0010\"J\u0017\u0010=\u001a\u00020\u00152\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0006H\u0002¢\u0006\u0004\b?\u0010\u0003J\u000f\u0010@\u001a\u00020\u0006H\u0002¢\u0006\u0004\b@\u0010\u0003J\u000f\u0010A\u001a\u00020\u0006H\u0002¢\u0006\u0004\bA\u0010\u0003J\u000f\u0010B\u001a\u00020\u0006H\u0002¢\u0006\u0004\bB\u0010\u0003J\u000f\u0010C\u001a\u00020\u0006H\u0002¢\u0006\u0004\bC\u0010\u0003J\u000f\u0010D\u001a\u00020\u0006H\u0002¢\u0006\u0004\bD\u0010\u0003J\u000f\u0010E\u001a\u00020\u0006H\u0002¢\u0006\u0004\bE\u0010\u0003J\u000f\u0010F\u001a\u00020\u0006H\u0002¢\u0006\u0004\bF\u0010\u0003J\u000f\u0010G\u001a\u00020\u0006H\u0002¢\u0006\u0004\bG\u0010\u0003J\u0010\u0010H\u001a\u00020\u0006H\u0082@¢\u0006\u0004\bH\u0010\"J\u000f\u0010I\u001a\u00020\u0015H\u0002¢\u0006\u0004\bI\u0010\u0017J\u000f\u0010J\u001a\u00020\u0006H\u0002¢\u0006\u0004\bJ\u0010\u0003J\u000f\u0010K\u001a\u00020\u0006H\u0002¢\u0006\u0004\bK\u0010\u0003J\u000f\u0010L\u001a\u00020\u0006H\u0002¢\u0006\u0004\bL\u0010\u0003J\u0019\u0010M\u001a\u0004\u0018\u00010\r2\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\u0006H\u0002¢\u0006\u0004\bO\u0010\u0003J\u000f\u0010P\u001a\u00020\u0006H\u0002¢\u0006\u0004\bP\u0010\u0003R\u001a\u0010V\u001a\u00020Q8\u0016X\u0096D¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u001a\u0010Y\u001a\u00020Q8\u0014X\u0094D¢\u0006\f\n\u0004\bW\u0010S\u001a\u0004\bX\u0010UR\u001b\u0010_\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u001b\u0010d\u001a\u00020`8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010\\\u001a\u0004\bb\u0010cR\u001b\u0010i\u001a\u00020e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010\\\u001a\u0004\bg\u0010hR\u001b\u0010n\u001a\u00020j8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010\\\u001a\u0004\bl\u0010mR\u001b\u0010s\u001a\u00020o8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bp\u0010\\\u001a\u0004\bq\u0010rR\u001b\u0010x\u001a\u00020t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bu\u0010\\\u001a\u0004\bv\u0010wR\u001b\u0010}\u001a\u00020y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bz\u0010\\\u001a\u0004\b{\u0010|R\u001e\u0010\u0082\u0001\u001a\u00020~8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b\u007f\u0010\\\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R \u0010\u0087\u0001\u001a\u00030\u0083\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0084\u0001\u0010\\\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R \u0010\u008c\u0001\u001a\u00030\u0088\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0089\u0001\u0010\\\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R \u0010\u0091\u0001\u001a\u00030\u008d\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008e\u0001\u0010\\\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R \u0010\u0096\u0001\u001a\u00030\u0092\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0093\u0001\u0010\\\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R \u0010\u009b\u0001\u001a\u00030\u0097\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0098\u0001\u0010\\\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R \u0010 \u0001\u001a\u00030\u009c\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u009d\u0001\u0010\\\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R \u0010¥\u0001\u001a\u00030¡\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b¢\u0001\u0010\\\u001a\u0006\b£\u0001\u0010¤\u0001R \u0010ª\u0001\u001a\u00030¦\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b§\u0001\u0010\\\u001a\u0006\b¨\u0001\u0010©\u0001R \u0010¯\u0001\u001a\u00030«\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b¬\u0001\u0010\\\u001a\u0006\b\u00ad\u0001\u0010®\u0001R \u0010´\u0001\u001a\u00030°\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b±\u0001\u0010\\\u001a\u0006\b²\u0001\u0010³\u0001R \u0010¹\u0001\u001a\u00030µ\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b¶\u0001\u0010\\\u001a\u0006\b·\u0001\u0010¸\u0001R \u0010¾\u0001\u001a\u00030º\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b»\u0001\u0010\\\u001a\u0006\b¼\u0001\u0010½\u0001R \u0010Ã\u0001\u001a\u00030¿\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bÀ\u0001\u0010\\\u001a\u0006\bÁ\u0001\u0010Â\u0001R \u0010È\u0001\u001a\u00030Ä\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bÅ\u0001\u0010\\\u001a\u0006\bÆ\u0001\u0010Ç\u0001R \u0010Í\u0001\u001a\u00030É\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bÊ\u0001\u0010\\\u001a\u0006\bË\u0001\u0010Ì\u0001R\u0017\u0010Ï\u0001\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0001\u0010Î\u0001R!\u0010Õ\u0001\u001a\u00030Ð\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÑ\u0001\u0010Ò\u0001\u001a\u0006\bÓ\u0001\u0010Ô\u0001R\u001c\u0010Ø\u0001\u001a\u0005\u0018\u00010Ð\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÖ\u0001\u0010×\u0001R5\u0010á\u0001\u001a\u00030Ù\u00012\b\u0010Ú\u0001\u001a\u00030Ù\u00018B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\bÛ\u0001\u0010Ü\u0001\u001a\u0006\bÝ\u0001\u0010Þ\u0001\"\u0006\bß\u0001\u0010à\u0001R\u0019\u0010ã\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bâ\u0001\u0010Î\u0001R\u0019\u0010å\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bä\u0001\u0010Î\u0001R\u0017\u0010è\u0001\u001a\u00020\u00188BX\u0082\u0004¢\u0006\b\u001a\u0006\bæ\u0001\u0010ç\u0001¨\u0006é\u0001"}, m65681d2 = {"Lcom/whoop/settings/SettingsLandingFragment;", "Lhj0/m;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "a1", "", "Z2", "()Z", "", "nonModalTopPx", "n3", "(I)I", "g3", "u2", "q2", "U2", "W2", "f2", "(Lq83/d;)Ljava/lang/Object;", "G1", "s2", "s3", "r3", "g2", "v2", "w2", "G2", "k3", "H1", "A2", "p3", "b3", "X2", "f3", "Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;", "membershipStatus", "e3", "(Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;)V", "Lcom/whoop/settings/a;", "alertStatus", PersonalRecordsApiKt.VERSION, "(Lcom/whoop/settings/a;)V", "r2", "Lgc2/a;", "tile", "y2", "(Lgc2/a;)Z", "V2", "c1", "D1", "F1", "E1", "p2", "h2", "k2", "m2", "d3", "q3", "j2", "K2", "P2", "u3", "(Lgc2/a;)Landroid/view/View;", "B2", "a3", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "x", "getScreenName", "screenName", "Lcom/whoop/settings/m;", "y", "Ll83/h;", "B1", "()Lcom/whoop/settings/m;", "viewModel", "Lz92/a;", "z", "z1", "()Lz92/a;", "userInfoAccessor", "Lod1/a0;", "E", "A1", "()Lod1/a0;", "userSessionManager", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "F", "q1", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagRepository", "Lor2/y;", "G", "getExternalLinkNavigator", "()Lor2/y;", "externalLinkNavigator", "Lzf2/a;", "H", "y1", "()Lzf2/a;", "smsSettingsNavigationRouter", "Ljc2/a;", "I", "v1", "()Ljc2/a;", "privacyEntryPointRouter", "Lya2/a;", "J", "k1", "()Lya2/a;", "arabicOptOutEntryPointRouter", "Lcom/whoop/data/repositories/ArabicLanguageEnabledChecker;", "K", "j1", "()Lcom/whoop/data/repositories/ArabicLanguageEnabledChecker;", "arabicLanguageEnabledChecker", "Lcom/whoop/data/repositories/ArabicBetaOptOutStatusStore;", "L", "i1", "()Lcom/whoop/data/repositories/ArabicBetaOptOutStatusStore;", "arabicBetaOptOutStatusStore", "Ltd1/b;", "M", "C1", "()Ltd1/b;", "whoopStrapProxy", "Lza2/u;", "N", "w1", "()Lza2/u;", "settingsBannerCoordinator", "Lfi0/a;", "O", "h1", "()Lfi0/a;", "analytics", "Lor2/e;", "P", "m1", "()Lor2/e;", "authAnalyticHelper", "Ljd0/c;", "Q", "g1", "()Ljd0/c;", "advancedLabsNavigationRouter", "Ljd0/a;", "R", "f1", "()Ljd0/a;", "advancedLabsActionRouter", "Lsz1/c;", "S", "u1", "()Lsz1/c;", "nativeStoreRouter", "Lea2/c0;", "T", "x1", "()Lea2/c0;", "settingsModalRouter", "Lfa2/c;", "U", "e1", "()Lfa2/c;", "aboutNavigationRouter", "Lsz1/a;", "V", "s1", "()Lsz1/a;", "nativeStoreActionRouter", "Loz1/a;", "W", "t1", "()Loz1/a;", "nativeStoreAnalyticsHelper", "Lza2/c;", "X", "n1", "()Lza2/c;", "bannerCoordinator", "Lor2/g;", "Y", "p1", "()Lor2/g;", "buildConfigProvider", "Z", "isGiftWhoopExtensionEnabled", "Lea2/a0;", "a0", "Leb/i;", "l1", "()Lea2/a0;", "args", "b0", "Lea2/a0;", "lastArgs", "Lii0/s;", "<set-?>", "c0", "Lcom/whoop/ui/b;", "o1", "()Lii0/s;", "c3", "(Lii0/s;)V", "binding", "d0", "isWteRedirection", "e0", "isModal", "r1", "()I", "modalTopPaddingPx", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SettingsLandingFragment extends AbstractC17354m {

    /* JADX INFO: renamed from: f0 */
    static final /* synthetic */ InterfaceC21493z[] f30143f0 = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(SettingsLandingFragment.class, "binding", "getBinding()Lcom/whoop/android/databinding/FragmentSettingsLandingBinding;", 0))};

    /* JADX INFO: renamed from: g0 */
    public static final int f30144g0 = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h userSessionManager;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagRepository;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h externalLinkNavigator;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC23462h smsSettingsNavigationRouter;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC23462h privacyEntryPointRouter;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC23462h arabicOptOutEntryPointRouter;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC23462h arabicLanguageEnabledChecker;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC23462h arabicBetaOptOutStatusStore;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final InterfaceC23462h whoopStrapProxy;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final InterfaceC23462h settingsBannerCoordinator;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final InterfaceC23462h analytics;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final InterfaceC23462h authAnalyticHelper;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final InterfaceC23462h advancedLabsNavigationRouter;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final InterfaceC23462h advancedLabsActionRouter;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private final InterfaceC23462h nativeStoreRouter;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private final InterfaceC23462h settingsModalRouter;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private final InterfaceC23462h aboutNavigationRouter;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private final InterfaceC23462h nativeStoreActionRouter;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private final InterfaceC23462h nativeStoreAnalyticsHelper;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private final InterfaceC23462h bannerCoordinator;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private final InterfaceC23462h buildConfigProvider;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private final boolean isGiftWhoopExtensionEnabled;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    private final C12962i args;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    private C12895a0 lastArgs;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    private final C10462b binding;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    private boolean isWteRedirection;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    private boolean isModal;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String logTag = "SettingsLandingFragment";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final String screenName = "";

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10072q0(this, null, new C10070p0(this), null));

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h userInfoAccessor;

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C10039a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f30176a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f30177b;

        static {
            int[] iArr = new int[CtaLocation.values().length];
            try {
                iArr[CtaLocation.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CtaLocation.SUPPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f30176a = iArr;
            int[] iArr2 = new int[EnumC15710a.values().length];
            try {
                iArr2[EnumC15710a.DEVICE_SETTINGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC15710a.TUTORIALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC15710a.WHAT_TO_EXPECT_IN_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC15710a.WHAT_TO_EXPECT_COMPLETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC15710a.DATA_EXPORT.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC15710a.INTEGRATIONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC15710a.NOTIFICATION_SETTINGS.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EnumC15710a.ACTIVITY_SETTINGS.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[EnumC15710a.STEALTH_MODE.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[EnumC15710a.WHOOP_LABS.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[EnumC15710a.JOURNAL.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[EnumC15710a.HORMONAL_INSIGHTS_SETTINGS.ordinal()] = 12;
            } catch (NoSuchFieldError unused14) {
            }
            f30177b = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$a0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10040a0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30178w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30179x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30180y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10040a0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30178w = componentCallbacks;
            this.f30179x = interfaceC35951a;
            this.f30180y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [fa2.c, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C14300c invoke() {
            ComponentCallbacks componentCallbacks = this.f30178w;
            InterfaceC35951a interfaceC35951a = this.f30179x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30180y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C14300c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$b */
    @InterfaceC32271e(m100429c = "com.whoop.settings.SettingsLandingFragment$initClickListeners$16$1$1", m100430f = "SettingsLandingFragment.kt", m100431l = {680}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10041b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f30181w;

        public C10041b(InterfaceC30057d<? super C10041b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SettingsLandingFragment.this.new C10041b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10041b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f30181w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC40205a interfaceC40205aM25277z1 = SettingsLandingFragment.this.m25277z1();
                this.f30181w = 1;
                obj = interfaceC40205aM25277z1.mo129089c(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            User user = (User) obj;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (user == null) {
                return c23454a0;
            }
            int id4 = user.getId();
            C28216y externalLinkNavigator = SettingsLandingFragment.this.getExternalLinkNavigator();
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = SettingsLandingFragment.this.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
            C38266c c38266cM88492A = AbstractC29125c.m88492A(SettingsLandingFragment.this);
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            Object objM125868N0 = null;
            AbstractC21909c abstractC21909c = (AbstractC21909c) c38266cM88492A.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null);
            C12910i c12910i = C12910i.f44428a;
            C21908b configurations = abstractC21909c.getConfigurations();
            String name = c12910i.getName();
            Object defaultValue = c12910i.getDefaultValue();
            InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(String.class);
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                String str = (String) configurations.get(name);
                if (str != null) {
                    objM125868N0 = AbstractC39421y.m125932Q(str);
                }
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                String str2 = (String) configurations.get(name);
                if (str2 != null) {
                    objM125868N0 = AbstractC39421y.m125933R(str2);
                }
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                String str3 = (String) configurations.get(name);
                if (str3 != null) {
                    objM125868N0 = AbstractC39420x.m125915y(str3);
                }
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                String str4 = (String) configurations.get(name);
                if (str4 != null) {
                    objM125868N0 = AbstractC39420x.m125914x(str4);
                }
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean.TYPE))) {
                String str5 = (String) configurations.get(name);
                if (str5 != null) {
                    objM125868N0 = AbstractC39414r.m125868N0(str5);
                }
            } else {
                objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations.get(name) : defaultValue;
            }
            if (objM125868N0 != null) {
                defaultValue = objM125868N0;
            }
            if (defaultValue == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(defaultValue);
            sb4.append(id4);
            externalLinkNavigator.m85434x(abstractActivityC1340r0RequireActivity, sb4.toString(), false);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$b0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10042b0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30183w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30184x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30185y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10042b0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30183w = componentCallbacks;
            this.f30184x = interfaceC35951a;
            this.f30185y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, sz1.a] */
        @Override // c93.InterfaceC4339a
        public final C33236a invoke() {
            ComponentCallbacks componentCallbacks = this.f30183w;
            InterfaceC35951a interfaceC35951a = this.f30184x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30185y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33236a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$c */
    @InterfaceC32271e(m100429c = "com.whoop.settings.SettingsLandingFragment$initClickListeners$19$1", m100430f = "SettingsLandingFragment.kt", m100431l = {707}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10043c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f30186w;

        public C10043c(InterfaceC30057d<? super C10043c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SettingsLandingFragment.this.new C10043c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10043c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f30186w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C10124m c10124mM25083B1 = SettingsLandingFragment.this.m25083B1();
                this.f30186w = 1;
                obj = c10124mM25083B1.m25552d0(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                SettingsLandingFragment.this.m25081A2();
            } else if (SettingsLandingFragment.this.m25083B1().m25543S().length() == 0) {
                Toast.makeText(SettingsLandingFragment.this.requireContext(), SettingsLandingFragment.this.getResources().getString(AbstractC17312j.f66964Z), 0).show();
            } else {
                SettingsLandingFragment.this.m25242p3();
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$c0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10044c0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30188w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30189x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30190y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10044c0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30188w = componentCallbacks;
            this.f30189x = interfaceC35951a;
            this.f30190y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, z92.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC40205a invoke() {
            ComponentCallbacks componentCallbacks = this.f30188w;
            InterfaceC35951a interfaceC35951a = this.f30189x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30190y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC40205a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$d */
    @InterfaceC32271e(m100429c = "com.whoop.settings.SettingsLandingFragment", m100430f = "SettingsLandingFragment.kt", m100431l = {700}, m100432m = "initClickListeners", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10045d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f30191E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f30192F;

        /* JADX INFO: renamed from: H */
        int f30194H;

        /* JADX INFO: renamed from: w */
        boolean f30195w;

        /* JADX INFO: renamed from: x */
        boolean f30196x;

        /* JADX INFO: renamed from: y */
        int f30197y;

        /* JADX INFO: renamed from: z */
        int f30198z;

        public C10045d(InterfaceC30057d<? super C10045d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f30192F = obj;
            this.f30194H |= Integer.MIN_VALUE;
            return SettingsLandingFragment.this.m25105H1(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$d0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10046d0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30199w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30200x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30201y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10046d0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30199w = componentCallbacks;
            this.f30200x = interfaceC35951a;
            this.f30201y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, oz1.a] */
        @Override // c93.InterfaceC4339a
        public final C28498a invoke() {
            ComponentCallbacks componentCallbacks = this.f30199w;
            InterfaceC35951a interfaceC35951a = this.f30200x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30201y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28498a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$e */
    @InterfaceC32271e(m100429c = "com.whoop.settings.SettingsLandingFragment", m100430f = "SettingsLandingFragment.kt", m100431l = {369}, m100432m = "initConcealedMenuItems", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10047e extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f30202w;

        /* JADX INFO: renamed from: y */
        int f30204y;

        public C10047e(InterfaceC30057d<? super C10047e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f30202w = obj;
            this.f30204y |= Integer.MIN_VALUE;
            return SettingsLandingFragment.this.m25201f2(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$e0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10048e0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30205w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30206x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30207y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10048e0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30205w = componentCallbacks;
            this.f30206x = interfaceC35951a;
            this.f30207y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, za2.c] */
        @Override // c93.InterfaceC4339a
        public final C40227c invoke() {
            ComponentCallbacks componentCallbacks = this.f30205w;
            InterfaceC35951a interfaceC35951a = this.f30206x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30207y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C40227c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$f */
    @InterfaceC32271e(m100429c = "com.whoop.settings.SettingsLandingFragment", m100430f = "SettingsLandingFragment.kt", m100431l = {839, 846}, m100432m = "initReferralSection", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10049f extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f30208w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f30209x;

        /* JADX INFO: renamed from: z */
        int f30211z;

        public C10049f(InterfaceC30057d<? super C10049f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f30209x = obj;
            this.f30211z |= Integer.MIN_VALUE;
            return SettingsLandingFragment.this.m25249r2(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$f0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10050f0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30212w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30213x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30214y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10050f0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30212w = componentCallbacks;
            this.f30213x = interfaceC35951a;
            this.f30214y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.g] */
        @Override // c93.InterfaceC4339a
        public final C28162g invoke() {
            ComponentCallbacks componentCallbacks = this.f30212w;
            InterfaceC35951a interfaceC35951a = this.f30213x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30214y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28162g.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$g */
    @InterfaceC32271e(m100429c = "com.whoop.settings.SettingsLandingFragment$initWhoopCoach$1", m100430f = "SettingsLandingFragment.kt", m100431l = {299}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10051g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f30215w;

        public C10051g(InterfaceC30057d<? super C10051g> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final C23454a0 m25280h(SettingsLandingFragment settingsLandingFragment, View view) {
            AbstractC28163g0.m85259o(settingsLandingFragment).m85336b(AbstractC17307e.f66631P);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SettingsLandingFragment.this.new C10051g(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10051g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f30215w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C10124m c10124mM25083B1 = SettingsLandingFragment.this.m25083B1();
                this.f30215w = 1;
                obj = c10124mM25083B1.m25551c0(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            ConstraintLayout whoopCoachLayout = SettingsLandingFragment.this.m25236o1().f72450b1;
            AbstractC22676k.m65749i(whoopCoachLayout, "whoopCoachLayout");
            whoopCoachLayout.setVisibility(zBooleanValue ? 0 : 8);
            if (zBooleanValue) {
                ConstraintLayout whoopCoachLayout2 = SettingsLandingFragment.this.m25236o1().f72450b1;
                AbstractC22676k.m65749i(whoopCoachLayout2, "whoopCoachLayout");
                final SettingsLandingFragment settingsLandingFragment = SettingsLandingFragment.this;
                AbstractC1953c.m5963a(whoopCoachLayout2, new Function1() { // from class: com.whoop.settings.j
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsLandingFragment.C10051g.m25280h(settingsLandingFragment, (View) obj2);
                    }
                });
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$g0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10052g0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30217w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30218x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30219y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10052g0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30217w = componentCallbacks;
            this.f30218x = interfaceC35951a;
            this.f30219y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od1.a0] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC27837a0 invoke() {
            ComponentCallbacks componentCallbacks = this.f30217w;
            InterfaceC35951a interfaceC35951a = this.f30218x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30219y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC27837a0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$h */
    @InterfaceC32271e(m100429c = "com.whoop.settings.SettingsLandingFragment$initWteEntryPoint$1", m100430f = "SettingsLandingFragment.kt", m100431l = {471}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10053h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f30220w;

        public C10053h(InterfaceC30057d<? super C10053h> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SettingsLandingFragment.this.new C10053h(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10053h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f30220w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C10124m c10124mM25083B1 = SettingsLandingFragment.this.m25083B1();
                this.f30220w = 1;
                if (c10124mM25083B1.m25548Y(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$h0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10054h0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30222w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30223x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30224y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10054h0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30222w = componentCallbacks;
            this.f30223x = interfaceC35951a;
            this.f30224y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f30222w;
            InterfaceC35951a interfaceC35951a = this.f30223x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30224y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$i */
    @InterfaceC32271e(m100429c = "com.whoop.settings.SettingsLandingFragment$observeTileVisibility$1", m100430f = "SettingsLandingFragment.kt", m100431l = {321}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10055i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f30225w;

        /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$i$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ SettingsLandingFragment f30227w;

            public a(SettingsLandingFragment settingsLandingFragment) {
                this.f30227w = settingsLandingFragment;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(Map<EnumC15710a, Boolean> map, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                SettingsLandingFragment settingsLandingFragment = this.f30227w;
                for (Map.Entry<EnumC15710a, Boolean> entry : map.entrySet()) {
                    EnumC15710a key = entry.getKey();
                    boolean zBooleanValue = entry.getValue().booleanValue();
                    View viewM25262u3 = settingsLandingFragment.m25262u3(key);
                    if (viewM25262u3 != null) {
                        viewM25262u3.setVisibility(zBooleanValue ? 0 : 8);
                    }
                }
                return C23454a0.f92919a;
            }
        }

        public C10055i(InterfaceC30057d<? super C10055i> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SettingsLandingFragment.this.new C10055i(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10055i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f30225w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13037f2 interfaceC13037f2M25546W = SettingsLandingFragment.this.m25083B1().getTileVisibility();
                a aVar = new a(SettingsLandingFragment.this);
                this.f30225w = 1;
                if (interfaceC13037f2M25546W.collect(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$i0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10056i0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30228w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30229x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30230y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10056i0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30228w = componentCallbacks;
            this.f30229x = interfaceC35951a;
            this.f30230y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.y] */
        @Override // c93.InterfaceC4339a
        public final C28216y invoke() {
            ComponentCallbacks componentCallbacks = this.f30228w;
            InterfaceC35951a interfaceC35951a = this.f30229x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30230y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28216y.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$j */
    @InterfaceC32271e(m100429c = "com.whoop.settings.SettingsLandingFragment$observeUpsellVisibility$1", m100430f = "SettingsLandingFragment.kt", m100431l = {869}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10057j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f30231w;

        /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$j$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ SettingsLandingFragment f30233w;

            public a(SettingsLandingFragment settingsLandingFragment) {
                this.f30233w = settingsLandingFragment;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(Map<EnumC15710a, Boolean> map, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f30233w.m25188c1();
                return C23454a0.f92919a;
            }
        }

        public C10057j(InterfaceC30057d<? super C10057j> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SettingsLandingFragment.this.new C10057j(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10057j) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f30231w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13037f2 interfaceC13037f2M25546W = SettingsLandingFragment.this.m25083B1().getTileVisibility();
                a aVar = new a(SettingsLandingFragment.this);
                this.f30231w = 1;
                if (interfaceC13037f2M25546W.collect(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$j0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10058j0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30234w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30235x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30236y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10058j0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30234w = componentCallbacks;
            this.f30235x = interfaceC35951a;
            this.f30236y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, zf2.a] */
        @Override // c93.InterfaceC4339a
        public final C40613a invoke() {
            ComponentCallbacks componentCallbacks = this.f30234w;
            InterfaceC35951a interfaceC35951a = this.f30235x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30236y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C40613a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$k */
    @InterfaceC32271e(m100429c = "com.whoop.settings.SettingsLandingFragment$observeWteContent$1", m100430f = "SettingsLandingFragment.kt", m100431l = {329}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10059k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f30237w;

        /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$k$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ SettingsLandingFragment f30239w;

            /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$k$a$a, reason: collision with other inner class name */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final /* synthetic */ class C41414a {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int[] f30240a;

                static {
                    int[] iArr = new int[CtaLocation.values().length];
                    try {
                        iArr[CtaLocation.TOP.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CtaLocation.SUPPORT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f30240a = iArr;
                }
            }

            public a(SettingsLandingFragment settingsLandingFragment) {
                this.f30239w = settingsLandingFragment;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(C12913j0 c12913j0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (c12913j0 == null) {
                    return c23454a0;
                }
                this.f30239w.isWteRedirection = true;
                int i13 = C41414a.f30240a[c12913j0.getCtaLocation().ordinal()];
                if (i13 == 1) {
                    Integer numM36326c = c12913j0.getIcon();
                    if (numM36326c != null) {
                        SettingsLandingFragment settingsLandingFragment = this.f30239w;
                        settingsLandingFragment.m25236o1().f72425Q.setImageDrawable(settingsLandingFragment.getResources().getDrawable(numM36326c.intValue(), null));
                    }
                    ConstraintLayout journeyToAHealthierYou = this.f30239w.m25236o1().f72452c0;
                    AbstractC22676k.m65749i(journeyToAHealthierYou, "journeyToAHealthierYou");
                    journeyToAHealthierYou.setVisibility(0);
                    this.f30239w.m25236o1().f72427R.setText(c12913j0.getTitle());
                    String strM36324a = c12913j0.getBody();
                    if (strM36324a != null) {
                        SettingsLandingFragment settingsLandingFragment2 = this.f30239w;
                        TextView healthierYouSubtext = settingsLandingFragment2.m25236o1().f72429S;
                        AbstractC22676k.m65749i(healthierYouSubtext, "healthierYouSubtext");
                        healthierYouSubtext.setVisibility(0);
                        settingsLandingFragment2.m25236o1().f72429S.setText(strM36324a);
                    }
                    MembershipAffiliate membershipAffiliate = (MembershipAffiliate) this.f30239w.m25083B1().getMembershipAffiliate().getValue();
                    if ((membershipAffiliate != null ? membershipAffiliate.getStatus() : null) == AffiliateStatus.APPROVED) {
                        int dimensionPixelSize = this.f30239w.getResources().getDimensionPixelSize(AbstractC36511b.f156056i);
                        this.f30239w.m25236o1().f72400D0.setPadding(dimensionPixelSize, this.f30239w.getResources().getDimensionPixelSize(AbstractC36511b.f156051d), dimensionPixelSize, 0);
                    }
                } else {
                    if (i13 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Integer numM36326c2 = c12913j0.getIcon();
                    if (numM36326c2 != null) {
                        SettingsLandingFragment settingsLandingFragment3 = this.f30239w;
                        settingsLandingFragment3.m25236o1().f72477k1.setImageDrawable(settingsLandingFragment3.getResources().getDrawable(numM36326c2.intValue(), null));
                    }
                    this.f30239w.m25236o1().f72471i1.setText(c12913j0.getTitle());
                    String strM36324a2 = c12913j0.getBody();
                    if (strM36324a2 != null) {
                        SettingsLandingFragment settingsLandingFragment4 = this.f30239w;
                        TextView wteDescription = settingsLandingFragment4.m25236o1().f72474j1;
                        AbstractC22676k.m65749i(wteDescription, "wteDescription");
                        wteDescription.setVisibility(0);
                        settingsLandingFragment4.m25236o1().f72474j1.setText(strM36324a2);
                    }
                    MembershipAffiliate membershipAffiliate2 = (MembershipAffiliate) this.f30239w.m25083B1().getMembershipAffiliate().getValue();
                    if ((membershipAffiliate2 != null ? membershipAffiliate2.getStatus() : null) == AffiliateStatus.APPROVED) {
                        int dimensionPixelSize2 = this.f30239w.getResources().getDimensionPixelSize(AbstractC36511b.f156056i);
                        this.f30239w.m25236o1().f72400D0.setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
                    }
                }
                return c23454a0;
            }
        }

        public C10059k(InterfaceC30057d<? super C10059k> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SettingsLandingFragment.this.new C10059k(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10059k) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f30237w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13037f2 interfaceC13037f2M25549Z = SettingsLandingFragment.this.m25083B1().getWteContentState();
                a aVar = new a(SettingsLandingFragment.this);
                this.f30237w = 1;
                if (interfaceC13037f2M25549Z.collect(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$k0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10060k0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30241w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30242x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30243y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10060k0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30241w = componentCallbacks;
            this.f30242x = interfaceC35951a;
            this.f30243y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, jc2.a] */
        @Override // c93.InterfaceC4339a
        public final C21606a invoke() {
            ComponentCallbacks componentCallbacks = this.f30241w;
            InterfaceC35951a interfaceC35951a = this.f30242x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30243y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21606a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$l */
    @InterfaceC32271e(m100429c = "com.whoop.settings.SettingsLandingFragment$onMembershipUpdated$1", m100430f = "SettingsLandingFragment.kt", m100431l = {778}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10061l extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f30244w;

        public C10061l(InterfaceC30057d<? super C10061l> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SettingsLandingFragment.this.new C10061l(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10061l) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f30244w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                SettingsLandingFragment settingsLandingFragment = SettingsLandingFragment.this;
                this.f30244w = 1;
                if (settingsLandingFragment.m25202f3(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$l0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10062l0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30246w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30247x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30248y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10062l0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30246w = componentCallbacks;
            this.f30247x = interfaceC35951a;
            this.f30248y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ya2.a] */
        @Override // c93.InterfaceC4339a
        public final C39357a invoke() {
            ComponentCallbacks componentCallbacks = this.f30246w;
            InterfaceC35951a interfaceC35951a = this.f30247x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30248y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39357a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$m */
    @InterfaceC32271e(m100429c = "com.whoop.settings.SettingsLandingFragment$onViewCreated$1", m100430f = "SettingsLandingFragment.kt", m100431l = {198, 199, 201, 202, 203}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10063m extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f30249w;

        public C10063m(InterfaceC30057d<? super C10063m> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SettingsLandingFragment.this.new C10063m(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10063m) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x005e  */
        /* JADX WARN: Code duplicated, block: B:28:0x006d  */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
        
            if (r8.m25555h0(r7) == r0) goto L30;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r7.f30249w
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L31
                if (r1 == r6) goto L2d
                if (r1 == r5) goto L29
                if (r1 == r4) goto L25
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                p505ts.AbstractC34132o.m107864I(r8)
                goto L7c
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L21:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L6d
            L25:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L5e
            L29:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L4a
            L2d:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L3f
            L31:
                p505ts.AbstractC34132o.m107864I(r8)
                com.whoop.settings.SettingsLandingFragment r8 = com.whoop.settings.SettingsLandingFragment.this
                r7.f30249w = r6
                java.lang.Object r8 = com.whoop.settings.SettingsLandingFragment.m25144R0(r8, r7)
                if (r8 != r0) goto L3f
                goto L7b
            L3f:
                com.whoop.settings.SettingsLandingFragment r8 = com.whoop.settings.SettingsLandingFragment.this
                r7.f30249w = r5
                java.lang.Object r8 = com.whoop.settings.SettingsLandingFragment.m25132O0(r8, r7)
                if (r8 != r0) goto L4a
                goto L7b
            L4a:
                com.whoop.settings.SettingsLandingFragment r8 = com.whoop.settings.SettingsLandingFragment.this
                com.whoop.settings.SettingsLandingFragment.m25140Q0(r8)
                com.whoop.settings.SettingsLandingFragment r8 = com.whoop.settings.SettingsLandingFragment.this
                com.whoop.settings.m r8 = com.whoop.settings.SettingsLandingFragment.m25128N0(r8)
                r7.f30249w = r4
                java.lang.Object r8 = r8.m25553f0(r7)
                if (r8 != r0) goto L5e
                goto L7b
            L5e:
                com.whoop.settings.SettingsLandingFragment r8 = com.whoop.settings.SettingsLandingFragment.this
                com.whoop.settings.m r8 = com.whoop.settings.SettingsLandingFragment.m25128N0(r8)
                r7.f30249w = r3
                java.lang.Object r8 = r8.m25554g0(r7)
                if (r8 != r0) goto L6d
                goto L7b
            L6d:
                com.whoop.settings.SettingsLandingFragment r8 = com.whoop.settings.SettingsLandingFragment.this
                com.whoop.settings.m r8 = com.whoop.settings.SettingsLandingFragment.m25128N0(r8)
                r7.f30249w = r2
                java.lang.Object r8 = r8.m25555h0(r7)
                if (r8 != r0) goto L7c
            L7b:
                return r0
            L7c:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.settings.SettingsLandingFragment.C10063m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$m0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10064m0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30251w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30252x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30253y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10064m0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30251w = componentCallbacks;
            this.f30252x = interfaceC35951a;
            this.f30253y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.ArabicLanguageEnabledChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final ArabicLanguageEnabledChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f30251w;
            InterfaceC35951a interfaceC35951a = this.f30252x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30253y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(ArabicLanguageEnabledChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$n */
    @InterfaceC32271e(m100429c = "com.whoop.settings.SettingsLandingFragment$onViewCreated$2", m100430f = "SettingsLandingFragment.kt", m100431l = {211}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10065n extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f30254w;

        public C10065n(InterfaceC30057d<? super C10065n> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SettingsLandingFragment.this.new C10065n(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10065n) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f30254w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                SettingsLandingFragment settingsLandingFragment = SettingsLandingFragment.this;
                this.f30254w = 1;
                if (settingsLandingFragment.m25194d3(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$n0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10066n0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30256w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30257x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30258y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10066n0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30256w = componentCallbacks;
            this.f30257x = interfaceC35951a;
            this.f30258y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.ArabicBetaOptOutStatusStore, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final ArabicBetaOptOutStatusStore invoke() {
            ComponentCallbacks componentCallbacks = this.f30256w;
            InterfaceC35951a interfaceC35951a = this.f30257x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30258y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(ArabicBetaOptOutStatusStore.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$o */
    @InterfaceC32271e(m100429c = "com.whoop.settings.SettingsLandingFragment$onViewCreated$3", m100430f = "SettingsLandingFragment.kt", m100431l = {224}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10067o extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f30259w;

        public C10067o(InterfaceC30057d<? super C10067o> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SettingsLandingFragment.this.new C10067o(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10067o) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f30259w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                SettingsLandingFragment settingsLandingFragment = SettingsLandingFragment.this;
                this.f30259w = 1;
                if (settingsLandingFragment.m25201f2(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$o0 */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Leb/h;", "Args", "Landroid/os/Bundle;", "invoke", "()Landroid/os/Bundle;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10068o0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f30261w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10068o0(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f30261w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final Bundle invoke() {
            Bundle arguments = this.f30261w.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException(AbstractC11266d.m30463q(new StringBuilder("Fragment "), this.f30261w, " has null arguments"));
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$p */
    @InterfaceC32271e(m100429c = "com.whoop.settings.SettingsLandingFragment", m100430f = "SettingsLandingFragment.kt", m100431l = {957}, m100432m = "setInfo", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10069p extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        int f30262w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f30263x;

        /* JADX INFO: renamed from: z */
        int f30265z;

        public C10069p(InterfaceC30057d<? super C10069p> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f30263x = obj;
            this.f30265z |= Integer.MIN_VALUE;
            return SettingsLandingFragment.this.m25194d3(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$p0 */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10070p0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30266w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10070p0(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f30266w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f30266w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$q */
    @InterfaceC32271e(m100429c = "com.whoop.settings.SettingsLandingFragment", m100430f = "SettingsLandingFragment.kt", m100431l = {787}, m100432m = "setReferAFriendButtonColor", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10071q extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f30267w;

        /* JADX INFO: renamed from: y */
        int f30269y;

        public C10071q(InterfaceC30057d<? super C10071q> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f30267w = obj;
            this.f30269y |= Integer.MIN_VALUE;
            return SettingsLandingFragment.this.m25202f3(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$q0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10072q0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30270w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30271x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30272y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f30273z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10072q0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f30270w = componentCallbacks;
            this.f30271x = interfaceC35951a;
            this.f30272y = interfaceC4339a;
            this.f30273z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, com.whoop.settings.m] */
        @Override // c93.InterfaceC4339a
        public final C10124m invoke() {
            return AbstractC34132o.m107857B(this.f30270w, this.f30271x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C10124m.class), this.f30272y, this.f30273z);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$r */
    @InterfaceC32271e(m100429c = "com.whoop.settings.SettingsLandingFragment$showSettingsBanners$1", m100430f = "SettingsLandingFragment.kt", m100431l = {428}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10073r extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f30274w;

        /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$r$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ SettingsLandingFragment f30276w;

            public a(SettingsLandingFragment settingsLandingFragment) {
                this.f30276w = settingsLandingFragment;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC40244t abstractC40244t, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (!(abstractC40244t instanceof AbstractC40244t.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f30276w.m25236o1().f72485o.setVisibility(8);
                ConstraintLayout settingsContainer = this.f30276w.m25236o1().f72406G0;
                AbstractC22676k.m65749i(settingsContainer, "settingsContainer");
                settingsContainer.setPadding(settingsContainer.getPaddingLeft(), this.f30276w.m25234n3(20), settingsContainer.getPaddingRight(), settingsContainer.getPaddingBottom());
                return C23454a0.f92919a;
            }
        }

        public C10073r(InterfaceC30057d<? super C10073r> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SettingsLandingFragment.this.new C10073r(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10073r) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f30274w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM129247b = SettingsLandingFragment.this.m25268w1().m129247b();
                a aVar = new a(SettingsLandingFragment.this);
                this.f30274w = 1;
                if (interfaceC13058lM129247b.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$s */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10074s extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30277w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30278x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30279y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10074s(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30277w = componentCallbacks;
            this.f30278x = interfaceC35951a;
            this.f30279y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, td1.b] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC33704b invoke() {
            ComponentCallbacks componentCallbacks = this.f30277w;
            InterfaceC35951a interfaceC35951a = this.f30278x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30279y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC33704b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$t */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10075t extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30280w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30281x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30282y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10075t(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30280w = componentCallbacks;
            this.f30281x = interfaceC35951a;
            this.f30282y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, za2.u] */
        @Override // c93.InterfaceC4339a
        public final C40245u invoke() {
            ComponentCallbacks componentCallbacks = this.f30280w;
            InterfaceC35951a interfaceC35951a = this.f30281x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30282y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C40245u.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$u */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10076u extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30283w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30284x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30285y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10076u(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30283w = componentCallbacks;
            this.f30284x = interfaceC35951a;
            this.f30285y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [fi0.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC14515a invoke() {
            ComponentCallbacks componentCallbacks = this.f30283w;
            InterfaceC35951a interfaceC35951a = this.f30284x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30285y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$v */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10077v extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30286w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30287x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30288y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10077v(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30286w = componentCallbacks;
            this.f30287x = interfaceC35951a;
            this.f30288y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.e] */
        @Override // c93.InterfaceC4339a
        public final C28156e invoke() {
            ComponentCallbacks componentCallbacks = this.f30286w;
            InterfaceC35951a interfaceC35951a = this.f30287x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30288y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28156e.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$w */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10078w extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30289w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30290x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30291y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10078w(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30289w = componentCallbacks;
            this.f30290x = interfaceC35951a;
            this.f30291y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, jd0.c] */
        @Override // c93.InterfaceC4339a
        public final C21610c invoke() {
            ComponentCallbacks componentCallbacks = this.f30289w;
            InterfaceC35951a interfaceC35951a = this.f30290x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30291y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21610c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$x */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10079x extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30292w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30293x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30294y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10079x(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30292w = componentCallbacks;
            this.f30293x = interfaceC35951a;
            this.f30294y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, jd0.a] */
        @Override // c93.InterfaceC4339a
        public final C21608a invoke() {
            ComponentCallbacks componentCallbacks = this.f30292w;
            InterfaceC35951a interfaceC35951a = this.f30293x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30294y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21608a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$y */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10080y extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30295w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30296x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30297y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10080y(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30295w = componentCallbacks;
            this.f30296x = interfaceC35951a;
            this.f30297y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, sz1.c] */
        @Override // c93.InterfaceC4339a
        public final C33238c invoke() {
            ComponentCallbacks componentCallbacks = this.f30295w;
            InterfaceC35951a interfaceC35951a = this.f30296x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30297y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33238c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.SettingsLandingFragment$z */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10081z extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30298w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30299x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30300y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10081z(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30298w = componentCallbacks;
            this.f30299x = interfaceC35951a;
            this.f30300y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [ea2.c0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C12899c0 invoke() {
            ComponentCallbacks componentCallbacks = this.f30298w;
            InterfaceC35951a interfaceC35951a = this.f30299x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30300y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C12899c0.class), interfaceC35951a);
        }
    }

    public SettingsLandingFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.userInfoAccessor = AbstractC30060g.m92087G(enumC23463i, new C10044c0(this, null, null));
        this.userSessionManager = AbstractC30060g.m92087G(enumC23463i, new C10052g0(this, null, null));
        this.featureFlagRepository = AbstractC30060g.m92087G(enumC23463i, new C10054h0(this, null, null));
        this.externalLinkNavigator = AbstractC30060g.m92087G(enumC23463i, new C10056i0(this, null, null));
        this.smsSettingsNavigationRouter = AbstractC30060g.m92087G(enumC23463i, new C10058j0(this, null, new C12923t(this, 0)));
        this.privacyEntryPointRouter = AbstractC30060g.m92087G(enumC23463i, new C10060k0(this, null, new C12923t(this, 1)));
        this.arabicOptOutEntryPointRouter = AbstractC30060g.m92087G(enumC23463i, new C10062l0(this, null, new C12923t(this, 2)));
        this.arabicLanguageEnabledChecker = AbstractC30060g.m92087G(enumC23463i, new C10064m0(this, null, null));
        this.arabicBetaOptOutStatusStore = AbstractC30060g.m92087G(enumC23463i, new C10066n0(this, null, null));
        this.whoopStrapProxy = AbstractC30060g.m92087G(enumC23463i, new C10074s(this, null, null));
        this.settingsBannerCoordinator = AbstractC30060g.m92087G(enumC23463i, new C10075t(this, null, null));
        this.analytics = AbstractC30060g.m92087G(enumC23463i, new C10076u(this, null, null));
        this.authAnalyticHelper = AbstractC30060g.m92087G(enumC23463i, new C10077v(this, null, null));
        this.advancedLabsNavigationRouter = AbstractC30060g.m92087G(enumC23463i, new C10078w(this, null, new C12923t(this, 3)));
        this.advancedLabsActionRouter = AbstractC30060g.m92087G(enumC23463i, new C10079x(this, null, null));
        this.nativeStoreRouter = AbstractC30060g.m92087G(enumC23463i, new C10080y(this, null, new C12923t(this, 4)));
        this.settingsModalRouter = AbstractC30060g.m92087G(enumC23463i, new C10081z(this, null, new C12923t(this, 6)));
        this.aboutNavigationRouter = AbstractC30060g.m92087G(enumC23463i, new C10040a0(this, null, null));
        this.nativeStoreActionRouter = AbstractC30060g.m92087G(enumC23463i, new C10042b0(this, null, null));
        this.nativeStoreAnalyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C10046d0(this, null, null));
        this.bannerCoordinator = AbstractC30060g.m92087G(enumC23463i, new C10048e0(this, null, null));
        this.buildConfigProvider = AbstractC30060g.m92087G(enumC23463i, new C10050f0(this, null, null));
        this.isGiftWhoopExtensionEnabled = m25244q1().isFeatureEnabled(FeatureFlagRepositoryKt.GIFT_WHOOP_EXTENSION);
        this.args = new C12962i(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C12895a0.class), new C10068o0(this));
        this.binding = AbstractC10463c.m26726c(this, null, 1, null);
    }

    /* JADX INFO: renamed from: A1 */
    private final InterfaceC27837a0 m25080A1() {
        return (InterfaceC27837a0) this.userSessionManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public final void m25081A2() {
        C28216y externalLinkNavigator = getExternalLinkNavigator();
        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = requireActivity();
        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
        externalLinkNavigator.m85434x(abstractActivityC1340r0RequireActivity, m25083B1().getConcealedUrl(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B1 */
    public final C10124m m25083B1() {
        return (C10124m) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: B2 */
    private final void m25084B2() {
        m25083B1().m25547X().observe(getViewLifecycleOwner(), new AbstractC10120l.a(new C12926w(this, 29)));
    }

    /* JADX INFO: renamed from: C1 */
    private final InterfaceC33704b m25086C1() {
        return (InterfaceC33704b) this.whoopStrapProxy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C2 */
    public static final C23454a0 m25087C2(SettingsLandingFragment settingsLandingFragment, C37050a c37050a) {
        C39282o c39282oM118937c = c37050a.getAdvancedLabsItem();
        ComposeView advancedLabsLayout = settingsLandingFragment.m25236o1().f72463g;
        AbstractC22676k.m65749i(advancedLabsLayout, "advancedLabsLayout");
        advancedLabsLayout.setVisibility(c39282oM118937c != null ? 0 : 8);
        if (c39282oM118937c != null) {
            settingsLandingFragment.m25236o1().f72463g.setContent(new C37816b(new C12929z(c39282oM118937c, settingsLandingFragment, 1), true, 1743813287));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D1 */
    private final void m25089D1() {
        AbstractC18563s abstractC18563sM25236o1 = m25236o1();
        abstractC18563sM25236o1.f72415L.setVisibility(8);
        abstractC18563sM25236o1.f72423P.setVisibility(8);
        abstractC18563sM25236o1.f72409I.setVisibility(8);
        abstractC18563sM25236o1.f72393A.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D2 */
    public static final C23454a0 m25090D2(C39282o c39282o, SettingsLandingFragment settingsLandingFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC38073e.m121966n(null, null, null, null, AbstractC37817c.m121344e(440270754, c28655q, new C12929z(c39282o, settingsLandingFragment, 5)), c28655q, 24576, 15);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: E1 */
    private final void m25093E1() {
        AbstractC18563s abstractC18563sM25236o1 = m25236o1();
        abstractC18563sM25236o1.f72416L0.setVisibility(8);
        abstractC18563sM25236o1.f72464g0.setVisibility(8);
        abstractC18563sM25236o1.f72485o.setVisibility(8);
        abstractC18563sM25236o1.f72400D0.setVisibility(8);
        ConstraintLayout settingsContainer = abstractC18563sM25236o1.f72406G0;
        AbstractC22676k.m65749i(settingsContainer, "settingsContainer");
        settingsContainer.setPadding(settingsContainer.getPaddingLeft(), m25234n3(0), settingsContainer.getPaddingRight(), settingsContainer.getPaddingBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E2 */
    public static final C23454a0 m25094E2(C39282o c39282o, SettingsLandingFragment settingsLandingFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM87157i = c28655q.m87157i(c39282o) | c28655q.m87157i(settingsLandingFragment);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C12916m(1, c39282o, settingsLandingFragment);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(c39282o, null, null, (Function1) objM87133R, c28655q, C39282o.f168987q, 6);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: F1 */
    private final void m25097F1() {
        ComposeView whoopShopLayout = m25236o1().f72468h1;
        AbstractC22676k.m65749i(whoopShopLayout, "whoopShopLayout");
        whoopShopLayout.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F2 */
    public static final C23454a0 m25098F2(C39282o c39282o, SettingsLandingFragment settingsLandingFragment, Object it) {
        AbstractC22676k.m65750j(it, "it");
        C9598e destination = c39282o.getDestination();
        if (destination != null) {
            InterfaceC22381a interfaceC22381aM60769d = settingsLandingFragment.m25200f1().m60769d(new InterfaceC22381a.j(destination));
            if (interfaceC22381aM60769d instanceof InterfaceC22381a.a0) {
                settingsLandingFragment.m25208h1().mo41424f("al", "swipe", UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE, "In App Banners");
                settingsLandingFragment.m25204g1().m60774e((InterfaceC22381a.a0) interfaceC22381aM60769d);
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G1 */
    private final void m25101G1() {
        m25236o1().f72464g0.setVisibility(8);
        AbstractC1329o1 childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        C1271a c1271a = new C1271a(childFragmentManager);
        c1271a.m4068e(m25236o1().f72400D0.getId(), new C30114b(), C30114b.class.getName());
        c1271a.m4046j();
        m25236o1().f72400D0.setVisibility(0);
        m25236o1().f72485o.setVisibility(8);
        m25236o1().f72416L0.setVisibility(8);
    }

    /* JADX INFO: renamed from: G2 */
    private final void m25102G2() {
        observe(m25083B1().getMembershipInfo(), new AbstractC10120l.a(new C12928y(this, 5)));
        observe(m25083B1().getMembershipStatus(), new AbstractC10120l.a(new C12928y(this, 6)));
        m25083B1().getCardAlertStatus().observe(getViewLifecycleOwner(), new AbstractC10120l.a(new C12928y(this, 7)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: H1 */
    public final Object m25105H1(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C10045d c10045d;
        StrokedPillButton strokedPillButton;
        if (interfaceC30057d instanceof C10045d) {
            c10045d = (C10045d) interfaceC30057d;
            int i13 = c10045d.f30194H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c10045d.f30194H = i13 - Integer.MIN_VALUE;
            } else {
                c10045d = new C10045d(interfaceC30057d);
            }
        } else {
            c10045d = new C10045d(interfaceC30057d);
        }
        Object objM25552d0 = c10045d.f30192F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c10045d.f30194H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM25552d0);
            StrokedPillButton settingsLogout = m25236o1().f72412J0;
            AbstractC22676k.m65749i(settingsLogout, "settingsLogout");
            AbstractC1953c.m5963a(settingsLogout, new C12926w(this, 1));
            ConstraintLayout strapSettingsLayout = m25236o1().f72432T0;
            AbstractC22676k.m65749i(strapSettingsLayout, "strapSettingsLayout");
            AbstractC1953c.m5963a(strapSettingsLayout, new C12926w(this, 12));
            ConstraintLayout tutorialsLayout = m25236o1().f72444Z0;
            AbstractC22676k.m65749i(tutorialsLayout, "tutorialsLayout");
            AbstractC1953c.m5963a(tutorialsLayout, new C12926w(this, 16));
            ConstraintLayout myAccountLayout = m25236o1().f72479l0;
            AbstractC22676k.m65749i(myAccountLayout, "myAccountLayout");
            AbstractC1953c.m5963a(myAccountLayout, new C12926w(this, 17));
            ConstraintLayout aboutLayout = m25236o1().f72448b;
            AbstractC22676k.m65749i(aboutLayout, "aboutLayout");
            AbstractC1953c.m5963a(aboutLayout, new C12926w(this, 18));
            ConstraintLayout journalLayout = m25236o1().f72446a0;
            AbstractC22676k.m65749i(journalLayout, "journalLayout");
            AbstractC1953c.m5963a(journalLayout, new C12926w(this, 19));
            ConstraintLayout constraintLayout = m25236o1().f72437W;
            final C12997x0 c12997x0 = new C12997x0(false, false, -1, false, false, AbstractC26660a.f105960e, -1, -1, AbstractC26660a.f105971p);
            constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: ea2.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SettingsLandingFragment.m25185b2(this.f44653w, c12997x0, view);
                }
            });
            ConstraintLayout constraintLayout2 = m25236o1().f72426Q0;
            AbstractC22676k.m65747g(constraintLayout2);
            constraintLayout2.setVisibility(m25244q1().isFeatureEnabled(FeatureFlagRepositoryKt.STEALTH_MODE) ? 0 : 8);
            AbstractC1953c.m5963a(constraintLayout2, new C12926w(this, 20));
            ConstraintLayout integrationsLayout = m25236o1().f72441Y;
            AbstractC22676k.m65749i(integrationsLayout, "integrationsLayout");
            AbstractC1953c.m5963a(integrationsLayout, new C12926w(this, 21));
            if (m25244q1().isFeatureEnabled(FeatureFlagRepositoryKt.MEMBER_DATA_EXPORT)) {
                ConstraintLayout memberDataExportLayout = m25236o1().f72467h0;
                AbstractC22676k.m65749i(memberDataExportLayout, "memberDataExportLayout");
                AbstractC1953c.m5963a(memberDataExportLayout, new C12926w(this, 22));
            }
            ConstraintLayout constraintLayout3 = m25236o1().f72492r0;
            AbstractC22676k.m65747g(constraintLayout3);
            AbstractC1953c.m5963a(constraintLayout3, new C12926w(this, 2));
            ConstraintLayout helpLayout = m25236o1().f72433U;
            AbstractC22676k.m65749i(helpLayout, "helpLayout");
            AbstractC1953c.m5963a(helpLayout, new C12926w(this, 3));
            ConstraintLayout debugLayout = m25236o1().f72497u;
            AbstractC22676k.m65749i(debugLayout, "debugLayout");
            AbstractC1953c.m5963a(debugLayout, new C12926w(this, 4));
            ConstraintLayout privacyLayout = m25236o1().f72504x0;
            AbstractC22676k.m65749i(privacyLayout, "privacyLayout");
            AbstractC1953c.m5963a(privacyLayout, new C12926w(this, 5));
            boolean zIsArabicBetaMember = m25216j1().isArabicBetaMember();
            boolean hasOptedOut = m25212i1().getHasOptedOut();
            int i15 = (zIsArabicBetaMember && m25244q1().isFeatureEnabled(FeatureFlagRepositoryKt.ARABIC_OPT_OUT_SETTINGS_BUTTON_ENABLED_ANDROID) && !hasOptedOut) ? 1 : 0;
            int i16 = (m25244q1().isFeatureEnabled(FeatureFlagRepositoryKt.ARABIC_FEEDBACK_BUTTON_ENABLED_ANDROID) && AbstractC22676k.m65745e(((LanguageChecker) AbstractC29125c.m88492A(this).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(LanguageChecker.class), null)).getAllowedLanguage().getLanguage(), "ar") && i15 == 0) ? 1 : 0;
            ConstraintLayout constraintLayout4 = m25236o1().f72469i;
            AbstractC22676k.m65747g(constraintLayout4);
            constraintLayout4.setVisibility(i16 != 0 ? 0 : 8);
            AbstractC1953c.m5963a(constraintLayout4, new C12926w(this, 6));
            ConstraintLayout constraintLayout5 = m25236o1().f72478l;
            AbstractC22676k.m65747g(constraintLayout5);
            constraintLayout5.setVisibility(i15 != 0 ? 0 : 8);
            AbstractC1953c.m5963a(constraintLayout5, new C12926w(this, 7));
            ConstraintLayout activitySettingsLayout = m25236o1().f72457e;
            AbstractC22676k.m65749i(activitySettingsLayout, "activitySettingsLayout");
            AbstractC1953c.m5963a(activitySettingsLayout, new C12926w(this, 8));
            StrokedPillButton strokedPillButton2 = m25236o1().f72491r;
            C10124m c10124mM25083B1 = m25083B1();
            c10045d.f30191E = strokedPillButton2;
            c10045d.f30195w = zIsArabicBetaMember;
            c10045d.f30196x = hasOptedOut;
            c10045d.f30197y = i15;
            c10045d.f30198z = i16;
            c10045d.f30194H = 1;
            objM25552d0 = c10124mM25083B1.m25552d0(c10045d);
            if (objM25552d0 == enumC31071a) {
                return enumC31071a;
            }
            strokedPillButton = strokedPillButton2;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            strokedPillButton = (StrokedPillButton) c10045d.f30191E;
            AbstractC34132o.m107864I(objM25552d0);
        }
        strokedPillButton.setText(((Boolean) objM25552d0).booleanValue() ? getResources().getString(AbstractC17312j.f66936L) : getResources().getString(AbstractC17312j.f66965Z0));
        StrokedPillButton btnSettingReferAFriend = m25236o1().f72491r;
        AbstractC22676k.m65749i(btnSettingReferAFriend, "btnSettingReferAFriend");
        AbstractC1953c.m5963a(btnSettingReferAFriend, new C12926w(this, 9));
        ConstraintLayout pairHarvardShortcut = m25236o1().f72496t0;
        AbstractC22676k.m65749i(pairHarvardShortcut, "pairHarvardShortcut");
        AbstractC1953c.m5963a(pairHarvardShortcut, new C12926w(this, 10));
        ConstraintLayout whoopLabsLayout = m25236o1().f72459e1;
        AbstractC22676k.m65749i(whoopLabsLayout, "whoopLabsLayout");
        AbstractC1953c.m5963a(whoopLabsLayout, new C12926w(this, 11));
        ConstraintLayout journeyToAHealthierYou = m25236o1().f72452c0;
        AbstractC22676k.m65749i(journeyToAHealthierYou, "journeyToAHealthierYou");
        AbstractC1953c.m5963a(journeyToAHealthierYou, new C12926w(this, 13));
        ConstraintLayout constraintLayout6 = m25236o1().f72458e0;
        AbstractC22676k.m65747g(constraintLayout6);
        AbstractC1953c.m5963a(constraintLayout6, new C12926w(this, 14));
        ConstraintLayout wteLayout = m25236o1().f72480l1;
        AbstractC22676k.m65749i(wteLayout, "wteLayout");
        AbstractC1953c.m5963a(wteLayout, new C12926w(this, 15));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H2 */
    public static final C23454a0 m25106H2(SettingsLandingFragment settingsLandingFragment, MembershipInfo it) {
        AbstractC22676k.m65750j(it, "it");
        settingsLandingFragment.m25170X2();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I1 */
    public static final C23454a0 m25109I1(SettingsLandingFragment settingsLandingFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        settingsLandingFragment.getEventDispatcher().m129017U("Settings");
        settingsLandingFragment.m25228m1().m85206c(AbstractC28153d.d.f113834a);
        settingsLandingFragment.m25080A1().mo83911a();
        settingsLandingFragment.m25232n1().m129155m();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I2 */
    public static final C23454a0 m25110I2(SettingsLandingFragment settingsLandingFragment, MembershipStatus membershipStatus) {
        settingsLandingFragment.m25198e3(membershipStatus);
        settingsLandingFragment.m25170X2();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J1 */
    public static final C23454a0 m25113J1(SettingsLandingFragment settingsLandingFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        settingsLandingFragment.getEventDispatcher().m129040k("Settings - Device Settings", "Device Settings", settingsLandingFragment.m25086C1().mo106491d().analyticsName());
        InterfaceC12981p0 interfaceC12981p0M25504i = AbstractC10119k.m25504i();
        AbstractC22676k.m65749i(interfaceC12981p0M25504i, "actionSettingsLandingToNewStrapSettings(...)");
        AbstractC28163g0.m85259o(settingsLandingFragment).m85340f(interfaceC12981p0M25504i);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J2 */
    public static final C23454a0 m25114J2(SettingsLandingFragment settingsLandingFragment, AbstractC10089a abstractC10089a) {
        settingsLandingFragment.m25266v3(abstractC10089a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K1 */
    public static final C23454a0 m25117K1(SettingsLandingFragment settingsLandingFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        C12997x0 c12997x0 = new C12997x0(false, false, -1, false, false, AbstractC26660a.f105960e, -1, -1, AbstractC26660a.f105971p);
        Uri uri = Uri.parse("android-app://com.whoop/settingsNotificationFragment");
        C12969k0 c12969k0M30854f = AbstractC11478a.m30854f(uri, "uri", uri, null, null);
        AbstractC12939a0 abstractC12939a0M16799z = AbstractC5583n.m16799z(settingsLandingFragment);
        abstractC12939a0M16799z.getClass();
        abstractC12939a0M16799z.m36409x(c12969k0M30854f, c12997x0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: K2 */
    private final void m25118K2() {
        m25083B1().m25547X().observe(getViewLifecycleOwner(), new AbstractC10120l.a(new C12926w(this, 28)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L1 */
    public static final C23454a0 m25121L1(SettingsLandingFragment settingsLandingFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        settingsLandingFragment.m25083B1().m25556i0();
        AbstractC28163g0.m85259o(settingsLandingFragment).m85339e(Uri.parse("whoop://com.whoop/help_center"), new C12997x0(false, false, -1, false, false, AbstractC26660a.f105960e, -1, -1, AbstractC26660a.f105971p));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L2 */
    public static final C23454a0 m25122L2(SettingsLandingFragment settingsLandingFragment, C37050a c37050a) {
        boolean zM25510c = AbstractC10120l.m25510c(settingsLandingFragment.isModal, settingsLandingFragment.m25275y2(EnumC15710a.WHOOP_STORE));
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (zM25510c) {
            settingsLandingFragment.m25097F1();
            return c23454a0;
        }
        C39282o c39282oM118938d = c37050a.getShopMenuItem();
        ComposeView whoopShopLayout = settingsLandingFragment.m25236o1().f72468h1;
        AbstractC22676k.m65749i(whoopShopLayout, "whoopShopLayout");
        whoopShopLayout.setVisibility(c39282oM118938d != null ? 0 : 8);
        if (c39282oM118938d != null) {
            settingsLandingFragment.m25236o1().f72468h1.setContent(new C37816b(new C12929z(c39282oM118938d, settingsLandingFragment, 0), true, 1900849337));
        }
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M1 */
    public static final C23454a0 m25125M1(SettingsLandingFragment settingsLandingFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        C28198s c28198sM85259o = AbstractC28163g0.m85259o(settingsLandingFragment);
        InterfaceC12981p0 interfaceC12981p0M25503h = AbstractC10119k.m25503h();
        AbstractC22676k.m65749i(interfaceC12981p0M25503h, "actionSettingsLandingToDebugSettings(...)");
        c28198sM85259o.m85340f(interfaceC12981p0M25503h);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M2 */
    public static final C23454a0 m25126M2(C39282o c39282o, SettingsLandingFragment settingsLandingFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC38073e.m121966n(null, null, null, null, AbstractC37817c.m121344e(-6268748, c28655q, new C12929z(c39282o, settingsLandingFragment, 4)), c28655q, 24576, 15);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N1 */
    public static final C23454a0 m25129N1(SettingsLandingFragment settingsLandingFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        settingsLandingFragment.m25264v1().m60765a(AbstractC28163g0.m85259o(settingsLandingFragment));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N2 */
    public static final C23454a0 m25130N2(C39282o c39282o, SettingsLandingFragment settingsLandingFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM87157i = c28655q.m87157i(settingsLandingFragment);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C12928y(settingsLandingFragment, 2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(c39282o, null, null, (Function1) objM87133R, c28655q, C39282o.f168987q, 6);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O1 */
    public static final C23454a0 m25133O1(SettingsLandingFragment settingsLandingFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        InterfaceC14515a.m41418i(settingsLandingFragment.m25208h1(), null, null, null, "arabic_feedback_clicked", null, null, 55, null);
        InterfaceC1585g0 viewLifecycleOwner = settingsLandingFragment.getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(viewLifecycleOwner), null, null, settingsLandingFragment.new C10041b(null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O2 */
    public static final C23454a0 m25134O2(SettingsLandingFragment settingsLandingFragment, Object event) {
        AbstractC22676k.m65750j(event, "event");
        InterfaceC34282d interfaceC34282dM105436c = C33236a.m105436c(settingsLandingFragment.m25252s1(), event, null, 2, null);
        if (interfaceC34282dM105436c instanceof InterfaceC34282d.c) {
            settingsLandingFragment.m25256t1().m86810l(((InterfaceC34282d.c) interfaceC34282dM105436c).getNavAction());
            settingsLandingFragment.m25260u1().m105439a((InterfaceC34282d.i) interfaceC34282dM105436c);
        } else if (interfaceC34282dM105436c instanceof InterfaceC34282d.i) {
            settingsLandingFragment.m25260u1().m105439a((InterfaceC34282d.i) interfaceC34282dM105436c);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P1 */
    public static final C23454a0 m25137P1(SettingsLandingFragment settingsLandingFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        settingsLandingFragment.m25220k1().m125514a();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: P2 */
    private final void m25138P2() {
        m25083B1().m25547X().observe(getViewLifecycleOwner(), new AbstractC10120l.a(new C12926w(this, 24)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q1 */
    public static final C23454a0 m25141Q1(SettingsLandingFragment settingsLandingFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        C28198s c28198sM85259o = AbstractC28163g0.m85259o(settingsLandingFragment);
        InterfaceC12981p0 interfaceC12981p0M25497b = AbstractC10119k.m25497b();
        AbstractC22676k.m65749i(interfaceC12981p0M25497b, "actionSettingsLandingFra…vitySettingsFragment(...)");
        c28198sM85259o.m85340f(interfaceC12981p0M25497b);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q2 */
    public static final C23454a0 m25142Q2(SettingsLandingFragment settingsLandingFragment, C37050a c37050a) {
        C39282o c39282oM118939e = c37050a.getSmsSettingsMenuItem();
        ComposeView smsSettingsLayout = settingsLandingFragment.m25236o1().f72422O0;
        AbstractC22676k.m65749i(smsSettingsLayout, "smsSettingsLayout");
        smsSettingsLayout.setVisibility(c39282oM118939e != null ? 0 : 8);
        if (c39282oM118939e != null) {
            settingsLandingFragment.m25236o1().f72422O0.setContent(new C37816b(new C12929z(c39282oM118939e, settingsLandingFragment, 2), true, -511246483));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R1 */
    public static final C23454a0 m25145R1(SettingsLandingFragment settingsLandingFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(settingsLandingFragment), null, null, settingsLandingFragment.new C10043c(null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R2 */
    public static final C23454a0 m25146R2(C39282o c39282o, SettingsLandingFragment settingsLandingFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC38073e.m121966n(null, null, null, null, AbstractC37817c.m121344e(-414748910, c28655q, new C12929z(c39282o, settingsLandingFragment, 3)), c28655q, 24576, 15);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S1 */
    public static final C23454a0 m25149S1(SettingsLandingFragment settingsLandingFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        Context contextRequireContext = settingsLandingFragment.requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        AbstractC10531a.m27136a(contextRequireContext).m93405s().m49154m();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S2 */
    public static final C23454a0 m25150S2(C39282o c39282o, SettingsLandingFragment settingsLandingFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM87157i = c28655q.m87157i(settingsLandingFragment);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C12928y(settingsLandingFragment, 3);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(c39282o, null, null, (Function1) objM87133R, c28655q, C39282o.f168987q, 6);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T1 */
    public static final C23454a0 m25153T1(SettingsLandingFragment settingsLandingFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        C28198s c28198sM85259o = AbstractC28163g0.m85259o(settingsLandingFragment);
        InterfaceC12981p0 interfaceC12981p0M25502g = AbstractC10119k.m25502g();
        AbstractC22676k.m65749i(interfaceC12981p0M25502g, "actionSettingsLandingFra…bsNavigationFragment(...)");
        c28198sM85259o.m85340f(interfaceC12981p0M25502g);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T2 */
    public static final C23454a0 m25154T2(SettingsLandingFragment settingsLandingFragment, Object event) {
        AbstractC22676k.m65750j(event, "event");
        settingsLandingFragment.m25274y1().m131733a(event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U1 */
    public static final C23454a0 m25157U1(SettingsLandingFragment settingsLandingFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        C12997x0 c12997x0 = new C12997x0(false, false, -1, false, false, AbstractC26660a.f105960e, -1, -1, AbstractC26660a.f105971p);
        settingsLandingFragment.getEventDispatcher().m129040k("Settings - Tutorials", null, settingsLandingFragment.m25086C1().mo106491d().analyticsName());
        C28198s c28198sM85259o = AbstractC28163g0.m85259o(settingsLandingFragment);
        InterfaceC12981p0 interfaceC12981p0M25501f = AbstractC10119k.m25501f();
        AbstractC22676k.m65749i(interfaceC12981p0M25501f, "actionSettingsLandingFra…tToTutorialsFragment(...)");
        c28198sM85259o.m85341g(interfaceC12981p0M25501f, c12997x0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: U2 */
    private final void m25158U2() {
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(viewLifecycleOwner), null, null, new C10055i(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V1 */
    public static final C23454a0 m25161V1(SettingsLandingFragment settingsLandingFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        if (settingsLandingFragment.isWteRedirection) {
            C28198s c28198sM85259o = AbstractC28163g0.m85259o(settingsLandingFragment);
            InterfaceC12981p0 interfaceC12981p0M25505j = AbstractC10119k.m25505j();
            AbstractC22676k.m65749i(interfaceC12981p0M25505j, "actionSettingsLandingToWhatToExpectFragment(...)");
            c28198sM85259o.m85340f(interfaceC12981p0M25505j);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: V2 */
    private final void m25162V2() {
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(viewLifecycleOwner), null, null, new C10057j(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W1 */
    public static final C23454a0 m25165W1(SettingsLandingFragment settingsLandingFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        InterfaceC14515a.m41418i(settingsLandingFragment.m25208h1(), null, "Open", ((LanguageChecker) AbstractC29125c.m88492A(settingsLandingFragment).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(LanguageChecker.class), null)).getAllowedLanguage().getLanguage(), "Settings - Language", null, null, 49, null);
        AbstractC28163g0.m85259o(settingsLandingFragment).m85342h("android-app://com.whoop/settings/chooseLanguage");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: W2 */
    private final void m25166W2() {
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(viewLifecycleOwner), null, null, new C10059k(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X1 */
    public static final C23454a0 m25169X1(SettingsLandingFragment settingsLandingFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        C28198s c28198sM85259o = AbstractC28163g0.m85259o(settingsLandingFragment);
        InterfaceC12981p0 interfaceC12981p0M25505j = AbstractC10119k.m25505j();
        AbstractC22676k.m65749i(interfaceC12981p0M25505j, "actionSettingsLandingToWhatToExpectFragment(...)");
        c28198sM85259o.m85340f(interfaceC12981p0M25505j);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: X2 */
    private final void m25170X2() {
        ConstraintLayout pairHarvardShortcut = m25236o1().f72496t0;
        AbstractC22676k.m65749i(pairHarvardShortcut, "pairHarvardShortcut");
        int i13 = 8;
        pairHarvardShortcut.setVisibility(8);
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C10061l(null), 3);
        m25083B1().m25536L();
        AbstractC18563s abstractC18563sM25236o1 = m25236o1();
        ConstraintLayout topSectionContainer = abstractC18563sM25236o1.f72440X0;
        AbstractC22676k.m65749i(topSectionContainer, "topSectionContainer");
        ConstraintLayout topSectionContainer2 = abstractC18563sM25236o1.f72440X0;
        AbstractC22676k.m65749i(topSectionContainer2, "topSectionContainer");
        int i14 = 0;
        while (true) {
            if (!(i14 < topSectionContainer2.getChildCount())) {
                break;
            }
            int i15 = i14 + 1;
            View childAt = topSectionContainer2.getChildAt(i14);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.getVisibility() == 0) {
                i13 = 0;
                break;
            }
            i14 = i15;
        }
        topSectionContainer.setVisibility(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y1 */
    public static final C23454a0 m25173Y1(SettingsLandingFragment settingsLandingFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        settingsLandingFragment.getEventDispatcher().m129040k("Settings - My Account", null, settingsLandingFragment.m25086C1().mo106491d().analyticsName());
        C28198s c28198sM85259o = AbstractC28163g0.m85259o(settingsLandingFragment);
        AbstractC10119k.a aVarM25499d = AbstractC10119k.m25499d(null);
        AbstractC22676k.m65749i(aVarM25499d, "actionSettingsLandingFra…tToMyAccountFragment(...)");
        c28198sM85259o.m85340f(aVarM25499d);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y2 */
    public static final C34911a m25174Y2(SettingsLandingFragment settingsLandingFragment) {
        return AbstractC15751g.m44431K(settingsLandingFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final C34911a m25176Z0(SettingsLandingFragment settingsLandingFragment) {
        return AbstractC15751g.m44431K(settingsLandingFragment.requireActivity(), AbstractC5583n.m16799z(settingsLandingFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1 */
    public static final C23454a0 m25177Z1(SettingsLandingFragment settingsLandingFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        settingsLandingFragment.getEventDispatcher().m129040k("Settings - About", null, settingsLandingFragment.m25086C1().mo106491d().analyticsName());
        C28198s c28198sM85259o = AbstractC28163g0.m85259o(settingsLandingFragment);
        InterfaceC12981p0 interfaceC12981p0M25496a = AbstractC10119k.m25496a();
        AbstractC22676k.m65749i(interfaceC12981p0M25496a, "actionSettingsLandingFragmentToAboutFragment(...)");
        c28198sM85259o.m85340f(interfaceC12981p0M25496a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Z2 */
    private final boolean m25178Z2() {
        try {
            return AbstractC9597d.m23117i(AbstractC5583n.m16799z(this));
        } catch (IllegalStateException e5) {
            getLog().mo85211a("No NavController available in onViewCreated; treating settings as non-modal", e5, new AbstractC30556a.a[0]);
            return false;
        }
    }

    /* JADX INFO: renamed from: a1 */
    private final void m25180a1() {
        C12925v c12925v = new C12925v(this, AbstractC12248d.m34112e(m25244q1()), 0);
        View root = m25236o1().getRoot();
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        AbstractC16877h0.m47517l(root, c12925v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public static final C23454a0 m25181a2(SettingsLandingFragment settingsLandingFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        settingsLandingFragment.getEventDispatcher().m129040k("Settings - Journal", null, settingsLandingFragment.m25086C1().mo106491d().analyticsName());
        AbstractC28163g0.m85259o(settingsLandingFragment).m85339e(Uri.parse("android-app://com.whoop/journal_settings_fragment_v2"), new C12997x0(false, false, -1, false, false, AbstractC26660a.f105960e, -1, -1, AbstractC26660a.f105971p));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: a3 */
    private final void m25182a3() {
        String strM59388d = AbstractC21157n0.m59388d(getArguments());
        LinkedHashMap linkedHashMapM73995d0 = AbstractC25247g0.m73995d0(m25083B1().m25535H(), strM59388d != null ? AbstractC31061c.m95645u("source", strM59388d) : C25272z.f99163w);
        if (linkedHashMapM73995d0.isEmpty()) {
            getEventDispatcher().m129035g0("Settings Landing");
        } else {
            getEventDispatcher().m129036h0("Settings Landing", linkedHashMapM73995d0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final C16905q1 m25184b1(SettingsLandingFragment settingsLandingFragment, boolean z4, View view, C16905q1 windowInsets) {
        AbstractC22676k.m65750j(view, "<unused var>");
        AbstractC22676k.m65750j(windowInsets, "windowInsets");
        C16899o1 c16899o1 = windowInsets.f64864a;
        C35643b c35643bMo47530g = c16899o1.mo47530g(1);
        AbstractC22676k.m65749i(c35643bMo47530g, "getInsets(...)");
        boolean z13 = settingsLandingFragment.isModal;
        int i13 = c35643bMo47530g.f151450b;
        int iM25508a = AbstractC10120l.m25508a(z13, i13);
        ComposeView settingsModalHeader = settingsLandingFragment.m25236o1().f72414K0;
        AbstractC22676k.m65749i(settingsModalHeader, "settingsModalHeader");
        settingsModalHeader.setPadding(settingsModalHeader.getPaddingLeft(), i13, settingsModalHeader.getPaddingRight(), settingsModalHeader.getPaddingBottom());
        ImageView backgroundImage = settingsLandingFragment.m25236o1().f72483n;
        AbstractC22676k.m65749i(backgroundImage, "backgroundImage");
        backgroundImage.setPadding(backgroundImage.getPaddingLeft(), iM25508a, backgroundImage.getPaddingRight(), backgroundImage.getPaddingBottom());
        WhoopScrollView settingsLandingScrollview = settingsLandingFragment.m25236o1().f72410I0;
        AbstractC22676k.m65749i(settingsLandingScrollview, "settingsLandingScrollview");
        settingsLandingScrollview.setPadding(settingsLandingScrollview.getPaddingLeft(), iM25508a, settingsLandingScrollview.getPaddingRight(), settingsLandingScrollview.getPaddingBottom());
        if (z4) {
            int i14 = c16899o1.mo47530g(2).f151452d;
            ConstraintLayout settingsContainer = settingsLandingFragment.m25236o1().f72406G0;
            AbstractC22676k.m65749i(settingsContainer, "settingsContainer");
            settingsContainer.setPadding(settingsContainer.getPaddingLeft(), settingsContainer.getPaddingTop(), settingsContainer.getPaddingRight(), i14 + ((int) (160 * settingsLandingFragment.m25236o1().getRoot().getResources().getDisplayMetrics().density)));
        }
        return C16905q1.f64863b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2 */
    public static final void m25185b2(SettingsLandingFragment settingsLandingFragment, C12997x0 c12997x0, View view) {
        Uri uri = Uri.parse("android-app://com.whoop/hormonalSettingsFragment");
        C12969k0 c12969k0M30854f = AbstractC11478a.m30854f(uri, "uri", uri, null, null);
        AbstractC12939a0 abstractC12939a0M16799z = AbstractC5583n.m16799z(settingsLandingFragment);
        abstractC12939a0M16799z.getClass();
        abstractC12939a0M16799z.m36409x(c12969k0M30854f, c12997x0);
    }

    /* JADX INFO: renamed from: b3 */
    private final void m25186b3() {
        String string = getString(AbstractC17312j.f66957V0, m25240p1().getVersionName(), Integer.valueOf(m25240p1().getVersionCode()));
        AbstractC22676k.m65749i(string, "getString(...)");
        m25236o1().f72394A0.setText(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public final void m25188c1() {
        EnumC15710a enumC15710a = EnumC15710a.GIFT;
        if (m25275y2(enumC15710a)) {
            m25089D1();
        }
        EnumC15710a enumC15710a2 = EnumC15710a.WHOOP_STORE;
        if (m25275y2(enumC15710a2)) {
            m25097F1();
        }
        if (m25275y2(EnumC15710a.REFER_A_FRIEND)) {
            m25093E1();
        }
        TextView shopHeader = m25236o1().f72420N0;
        AbstractC22676k.m65749i(shopHeader, "shopHeader");
        shopHeader.setVisibility(AbstractC10120l.m25512e(this.isModal, m25275y2(enumC15710a), m25275y2(enumC15710a2)) ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public static final C23454a0 m25189c2(SettingsLandingFragment settingsLandingFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        C28198s c28198sM85259o = AbstractC28163g0.m85259o(settingsLandingFragment);
        InterfaceC12981p0 interfaceC12981p0M25500e = AbstractC10119k.m25500e();
        AbstractC22676k.m65749i(interfaceC12981p0M25500e, "actionSettingsLandingFra…oStealthModeFragment(...)");
        c28198sM85259o.m85340f(interfaceC12981p0M25500e);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c3 */
    private final void m25190c3(AbstractC18563s abstractC18563s) {
        this.binding.setValue(this, f30143f0[0], abstractC18563s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final C34911a m25192d1(SettingsLandingFragment settingsLandingFragment) {
        return AbstractC15751g.m44431K(settingsLandingFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public static final C23454a0 m25193d2(SettingsLandingFragment settingsLandingFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        C12997x0 c12997x0 = new C12997x0(false, false, -1, false, false, AbstractC26660a.f105960e, -1, -1, AbstractC26660a.f105971p);
        settingsLandingFragment.getEventDispatcher().m129040k("Settings - Integrations", "Integrations", settingsLandingFragment.m25086C1().mo106491d().analyticsName());
        AbstractC28163g0.m85259o(settingsLandingFragment).m85337c(AbstractC17307e.f66643R, null, c12997x0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d3 */
    public final Object m25194d3(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C10069p c10069p;
        if (interfaceC30057d instanceof C10069p) {
            c10069p = (C10069p) interfaceC30057d;
            int i13 = c10069p.f30265z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c10069p.f30265z = i13 - Integer.MIN_VALUE;
            } else {
                c10069p = new C10069p(interfaceC30057d);
            }
        } else {
            c10069p = new C10069p(interfaceC30057d);
        }
        Object objMo129089c = c10069p.f30263x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c10069p.f30265z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo129089c);
            boolean zM85266b = AbstractC28165h.m85266b(m25240p1());
            int i15 = !zM85266b ? 1 : 0;
            ConstraintLayout debugLayout = m25236o1().f72497u;
            AbstractC22676k.m65749i(debugLayout, "debugLayout");
            debugLayout.setVisibility(!zM85266b ? 0 : 8);
            TextView settingsUserId = m25236o1().f72418M0;
            AbstractC22676k.m65749i(settingsUserId, "settingsUserId");
            settingsUserId.setVisibility(!zM85266b ? 0 : 8);
            TextView settingsAppId = m25236o1().f72402E0;
            AbstractC22676k.m65749i(settingsAppId, "settingsAppId");
            settingsAppId.setVisibility(zM85266b ? 8 : 0);
            if (!zM85266b) {
                InterfaceC40205a interfaceC40205aM25277z1 = m25277z1();
                c10069p.f30262w = i15;
                c10069p.f30265z = 1;
                objMo129089c = interfaceC40205aM25277z1.mo129089c(c10069p);
                if (objMo129089c == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(objMo129089c);
        User user = (User) objMo129089c;
        m25236o1().f72418M0.setText(getString(AbstractC17312j.f66971b1, String.valueOf(user != null ? new Integer(user.getId()) : null)));
        m25236o1().f72402E0.setText(getString(AbstractC17312j.f66955U0, m25240p1().getApplicationId()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e1 */
    private final C14300c m25196e1() {
        return (C14300c) this.aboutNavigationRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public static final C23454a0 m25197e2(SettingsLandingFragment settingsLandingFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        settingsLandingFragment.getEventDispatcher().m129040k("Settings - Export My Data", null, settingsLandingFragment.m25086C1().mo106491d().analyticsName());
        C12997x0 c12997x0 = new C12997x0(false, false, -1, false, false, AbstractC26660a.f105960e, -1, -1, AbstractC26660a.f105971p);
        C28198s c28198sM85259o = AbstractC28163g0.m85259o(settingsLandingFragment);
        InterfaceC12981p0 interfaceC12981p0M25498c = AbstractC10119k.m25498c();
        AbstractC22676k.m65749i(interfaceC12981p0M25498c, "actionSettingsLandingFra…entToDataExportGraph(...)");
        c28198sM85259o.m85341g(interfaceC12981p0M25498c, c12997x0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e3 */
    private final void m25198e3(MembershipStatus membershipStatus) {
        if (m25083B1().getCardAlertStatus().getValue() != null) {
            return;
        }
        String string = (membershipStatus == null || !membershipStatus.isInSubscriptionPeriod()) ? null : getString(AbstractC17312j.f66970b0);
        TextView myAccountSubtext = m25236o1().f72482m0;
        AbstractC22676k.m65749i(myAccountSubtext, "myAccountSubtext");
        myAccountSubtext.setVisibility(string != null ? 0 : 8);
        m25236o1().f72482m0.setText(string);
    }

    /* JADX INFO: renamed from: f1 */
    private final C21608a m25200f1() {
        return (C21608a) this.advancedLabsActionRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f2 */
    public final Object m25201f2(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C10047e c10047e;
        if (interfaceC30057d instanceof C10047e) {
            c10047e = (C10047e) interfaceC30057d;
            int i13 = c10047e.f30204y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c10047e.f30204y = i13 - Integer.MIN_VALUE;
            } else {
                c10047e = new C10047e(interfaceC30057d);
            }
        } else {
            c10047e = new C10047e(interfaceC30057d);
        }
        Object objM25552d0 = c10047e.f30202w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c10047e.f30204y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM25552d0);
            C10124m c10124mM25083B1 = m25083B1();
            c10047e.f30204y = 1;
            objM25552d0 = c10124mM25083B1.m25552d0(c10047e);
            if (objM25552d0 == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM25552d0);
        }
        if (((Boolean) objM25552d0).booleanValue()) {
            ConstraintLayout integrationsLayout = m25236o1().f72441Y;
            AbstractC22676k.m65749i(integrationsLayout, "integrationsLayout");
            integrationsLayout.setVisibility(8);
            ConstraintLayout memberDataExportLayout = m25236o1().f72467h0;
            AbstractC22676k.m65749i(memberDataExportLayout, "memberDataExportLayout");
            memberDataExportLayout.setVisibility(8);
            ConstraintLayout notificationsLayout = m25236o1().f72492r0;
            AbstractC22676k.m65749i(notificationsLayout, "notificationsLayout");
            notificationsLayout.setVisibility(8);
        } else {
            ConstraintLayout integrationsLayout2 = m25236o1().f72441Y;
            AbstractC22676k.m65749i(integrationsLayout2, "integrationsLayout");
            integrationsLayout2.setVisibility(0);
            ConstraintLayout memberDataExportLayout2 = m25236o1().f72467h0;
            AbstractC22676k.m65749i(memberDataExportLayout2, "memberDataExportLayout");
            memberDataExportLayout2.setVisibility(0);
            ConstraintLayout notificationsLayout2 = m25236o1().f72492r0;
            AbstractC22676k.m65749i(notificationsLayout2, "notificationsLayout");
            notificationsLayout2.setVisibility(0);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f3 */
    public final Object m25202f3(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C10071q c10071q;
        if (interfaceC30057d instanceof C10071q) {
            c10071q = (C10071q) interfaceC30057d;
            int i13 = c10071q.f30269y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c10071q.f30269y = i13 - Integer.MIN_VALUE;
            } else {
                c10071q = new C10071q(interfaceC30057d);
            }
        } else {
            c10071q = new C10071q(interfaceC30057d);
        }
        Object objM25552d0 = c10071q.f30267w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c10071q.f30269y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM25552d0);
            C10124m c10124mM25083B1 = m25083B1();
            c10071q.f30269y = 1;
            objM25552d0 = c10124mM25083B1.m25552d0(c10071q);
            if (objM25552d0 == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM25552d0);
        }
        int i15 = ((Boolean) objM25552d0).booleanValue() ? AbstractC17305c.f66525f : AbstractC17305c.f66526g;
        StrokedPillButton strokedPillButton = m25236o1().f72491r;
        strokedPillButton.setTextColor(AbstractC17357p.m49142b(this, i15));
        strokedPillButton.setStrokeColor(AbstractC17357p.m49142b(this, i15));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g1 */
    private final C21610c m25204g1() {
        return (C21610c) this.advancedLabsNavigationRouter.getValue();
    }

    /* JADX INFO: renamed from: g2 */
    private final void m25205g2() {
        ConstraintLayout memberDataExportLayout = m25236o1().f72467h0;
        AbstractC22676k.m65749i(memberDataExportLayout, "memberDataExportLayout");
        memberDataExportLayout.setVisibility(m25244q1().isFeatureEnabled(FeatureFlagRepositoryKt.MEMBER_DATA_EXPORT) ? 0 : 8);
    }

    /* JADX INFO: renamed from: g3 */
    private final void m25206g3() {
        if (!this.isModal) {
            ComposeView settingsModalHeader = m25236o1().f72414K0;
            AbstractC22676k.m65749i(settingsModalHeader, "settingsModalHeader");
            settingsModalHeader.setVisibility(8);
            return;
        }
        m25236o1().getRoot().setBackgroundResource(AbstractC17306d.f66530a);
        m25236o1().f72414K0.setContent(new C37816b(new C12924u(this, 0), true, -91121493));
        ComposeView settingsModalHeader2 = m25236o1().f72414K0;
        AbstractC22676k.m65749i(settingsModalHeader2, "settingsModalHeader");
        settingsModalHeader2.setVisibility(0);
        m25236o1().f72420N0.setText(getString(AbstractC17312j.f66963Y0));
        m25236o1().f72410I0.setVerticalFadingEdgeEnabled(true);
        m25236o1().f72410I0.setFadingEdgeLength((int) (48 * getResources().getDisplayMetrics().density));
        ConstraintLayout settingsContainer = m25236o1().f72406G0;
        AbstractC22676k.m65749i(settingsContainer, "settingsContainer");
        settingsContainer.setPadding(settingsContainer.getPaddingLeft(), m25248r1(), settingsContainer.getPaddingRight(), settingsContainer.getPaddingBottom());
        ConstraintLayout settingsContainer2 = m25236o1().f72406G0;
        AbstractC22676k.m65749i(settingsContainer2, "settingsContainer");
        ViewGroup.LayoutParams layoutParams = settingsContainer2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = 0;
        settingsContainer2.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C28216y getExternalLinkNavigator() {
        return (C28216y) this.externalLinkNavigator.getValue();
    }

    /* JADX INFO: renamed from: h1 */
    private final InterfaceC14515a m25208h1() {
        return (InterfaceC14515a) this.analytics.getValue();
    }

    /* JADX INFO: renamed from: h2 */
    private final void m25209h2() {
        ConstraintLayout giftHubLayout = m25236o1().f72393A;
        AbstractC22676k.m65749i(giftHubLayout, "giftHubLayout");
        AbstractC1953c.m5963a(giftHubLayout, new C12926w(this, 23));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h3 */
    public static final C23454a0 m25210h3(SettingsLandingFragment settingsLandingFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC38073e.m121966n(null, null, null, null, AbstractC37817c.m121344e(401198502, c28655q, new C12924u(settingsLandingFragment, 1)), c28655q, 24576, 15);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i1 */
    private final ArabicBetaOptOutStatusStore m25212i1() {
        return (ArabicBetaOptOutStatusStore) this.arabicBetaOptOutStatusStore.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public static final C23454a0 m25213i2(SettingsLandingFragment settingsLandingFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC5583n.m16799z(settingsLandingFragment).m36402q(Uri.parse("android-app://com.whoop/giftHub"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i3 */
    public static final C23454a0 m25214i3(SettingsLandingFragment settingsLandingFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM87157i = c28655q.m87157i(settingsLandingFragment);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C12923t(settingsLandingFragment, 5);
                c28655q.m87172p0(objM87133R);
            }
            Function0.m36302b((InterfaceC4339a) objM87133R, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j1 */
    private final ArabicLanguageEnabledChecker m25216j1() {
        return (ArabicLanguageEnabledChecker) this.arabicLanguageEnabledChecker.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j2 */
    public final void m25217j2() {
        if (m25246q3()) {
            m25236o1().f72507z.setText(AbstractC17312j.f66997k0);
            m25236o1().f72503x.setText(AbstractC17312j.f66994j0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j3 */
    public static final C23454a0 m25218j3(SettingsLandingFragment settingsLandingFragment) {
        settingsLandingFragment.m25271x1().m36304a();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k1 */
    private final C39357a m25220k1() {
        return (C39357a) this.arabicOptOutEntryPointRouter.getValue();
    }

    /* JADX INFO: renamed from: k2 */
    private final void m25221k2() {
        ConstraintLayout giftWhoopLayout = m25236o1().f72415L;
        AbstractC22676k.m65749i(giftWhoopLayout, "giftWhoopLayout");
        AbstractC1953c.m5963a(giftWhoopLayout, new C12926w(this, 27));
    }

    /* JADX INFO: renamed from: k3 */
    private final void m25222k3() {
        ConstraintLayout regulatoryLabelsLayout = m25236o1().f72508z0;
        AbstractC22676k.m65749i(regulatoryLabelsLayout, "regulatoryLabelsLayout");
        regulatoryLabelsLayout.setVisibility(AbstractC10120l.m25511d(this.isModal, m25244q1().isFeatureEnabled(FeatureFlagRepositoryKt.REGULATORY_LABELS_SCREEN), m25244q1().isFeatureEnabled(FeatureFlagRepositoryKt.DEVICE_SETTINGS_REGULATORY_TILES)) ? 0 : 8);
        ConstraintLayout regulatoryLabelsLayout2 = m25236o1().f72508z0;
        AbstractC22676k.m65749i(regulatoryLabelsLayout2, "regulatoryLabelsLayout");
        AbstractC1953c.m5963a(regulatoryLabelsLayout2, new C12928y(this, 0));
    }

    /* JADX INFO: renamed from: l1 */
    private final C12895a0 m25224l1() {
        return (C12895a0) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l2 */
    public static final C23454a0 m25225l2(SettingsLandingFragment settingsLandingFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        settingsLandingFragment.getEventDispatcher().m128994I0("Click to webview", AbstractC25247g0.m73989X(new C23465k(HMSTrackSource.SCREEN, "Settings")));
        C28216y externalLinkNavigator = settingsLandingFragment.getExternalLinkNavigator();
        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = settingsLandingFragment.requireActivity();
        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
        externalLinkNavigator.m85423l(abstractActivityC1340r0RequireActivity);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l3 */
    public static final C23454a0 m25226l3(SettingsLandingFragment settingsLandingFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        C14300c c14300cM25196e1 = settingsLandingFragment.m25196e1();
        AbstractC10092a.d dVar = AbstractC10092a.d.f30348a;
        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = settingsLandingFragment.requireActivity();
        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
        C14300c.m40905b(c14300cM25196e1, dVar, abstractActivityC1340r0RequireActivity, null, new C12928y(settingsLandingFragment, 1), 4, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m1 */
    private final C28156e m25228m1() {
        return (C28156e) this.authAnalyticHelper.getValue();
    }

    /* JADX INFO: renamed from: m2 */
    private final void m25229m2() {
        ConstraintLayout giftWhoopNewMemberLayout = m25236o1().f72423P;
        AbstractC22676k.m65749i(giftWhoopNewMemberLayout, "giftWhoopNewMemberLayout");
        AbstractC1953c.m5963a(giftWhoopNewMemberLayout, new C12926w(this, 25));
        ConstraintLayout giftWhoopExtensionLayout = m25236o1().f72409I;
        AbstractC22676k.m65749i(giftWhoopExtensionLayout, "giftWhoopExtensionLayout");
        AbstractC1953c.m5963a(giftWhoopExtensionLayout, new C12926w(this, 26));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m3 */
    public static final C23454a0 m25230m3(SettingsLandingFragment settingsLandingFragment, String deepLink) {
        AbstractC22676k.m65750j(deepLink, "deepLink");
        AbstractC28163g0.m85259o(settingsLandingFragment).m85338d(Uri.parse(deepLink));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n1 */
    private final C40227c m25232n1() {
        return (C40227c) this.bannerCoordinator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n2 */
    public static final C23454a0 m25233n2(SettingsLandingFragment settingsLandingFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        settingsLandingFragment.getEventDispatcher().m128994I0("Click to webview", AbstractC25247g0.m73989X(new C23465k(HMSTrackSource.SCREEN, "Settings")));
        C28216y externalLinkNavigator = settingsLandingFragment.getExternalLinkNavigator();
        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = settingsLandingFragment.requireActivity();
        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
        externalLinkNavigator.m85423l(abstractActivityC1340r0RequireActivity);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n3 */
    public final int m25234n3(int nonModalTopPx) {
        return AbstractC10120l.m25509b(this.isModal, m25248r1(), nonModalTopPx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public final AbstractC18563s m25236o1() {
        return (AbstractC18563s) this.binding.getValue(this, f30143f0[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o2 */
    public static final C23454a0 m25237o2(SettingsLandingFragment settingsLandingFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        settingsLandingFragment.getEventDispatcher().m128996J0("Click to webview", "Settings");
        C28216y externalLinkNavigator = settingsLandingFragment.getExternalLinkNavigator();
        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = settingsLandingFragment.requireActivity();
        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
        externalLinkNavigator.m85424m(abstractActivityC1340r0RequireActivity);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o3 */
    public static final C34911a m25238o3(SettingsLandingFragment settingsLandingFragment) {
        return AbstractC15751g.m44431K(AbstractC5583n.m16799z(settingsLandingFragment));
    }

    /* JADX INFO: renamed from: p1 */
    private final C28162g m25240p1() {
        return (C28162g) this.buildConfigProvider.getValue();
    }

    /* JADX INFO: renamed from: p2 */
    private final void m25241p2() {
        m25236o1().f72423P.setVisibility(8);
        m25236o1().f72409I.setVisibility(8);
        m25236o1().f72415L.setVisibility(8);
        m25236o1().f72393A.setVisibility(8);
        if (m25275y2(EnumC15710a.GIFT)) {
            return;
        }
        if (m25244q1().isFeatureEnabled("gift-hub-android")) {
            m25236o1().f72393A.setVisibility(0);
            m25209h2();
        } else if (!this.isGiftWhoopExtensionEnabled) {
            m25236o1().f72415L.setVisibility(0);
            m25221k2();
        } else {
            m25236o1().f72423P.setVisibility(0);
            m25236o1().f72409I.setVisibility(0);
            m25229m2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p3 */
    public final void m25242p3() {
        getEventDispatcher().m128998K0();
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", m25083B1().m25543S());
        intent.setType(MimeType.MIME_TYPE_TXT);
        startActivity(Intent.createChooser(intent, getResources().getString(AbstractC38505d0.f165668g2)));
    }

    /* JADX INFO: renamed from: q1 */
    private final FeatureFlagChecker m25244q1() {
        return (FeatureFlagChecker) this.featureFlagRepository.getValue();
    }

    /* JADX INFO: renamed from: q2 */
    private final void m25245q2() {
        if (m25244q1().isFeatureEnabled(FeatureFlagRepositoryKt.HOLIDAY_TAG_IN_SETTINGS)) {
            m25236o1().f72397C.setVisibility(0);
            m25236o1().f72486o0.setVisibility(0);
        } else {
            m25236o1().f72397C.setVisibility(8);
            m25236o1().f72486o0.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: q3 */
    private final boolean m25246q3() {
        return m25244q1().isFeatureEnabled("android-gift-menu-copy-change");
    }

    /* JADX INFO: renamed from: r1 */
    private final int m25248r1() {
        return getResources().getDimensionPixelSize(AbstractC36511b.f156048a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: r2 */
    public final Object m25249r2(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C10049f c10049f;
        TextView textView;
        String strM25544U;
        TextView textView2;
        String string;
        if (interfaceC30057d instanceof C10049f) {
            c10049f = (C10049f) interfaceC30057d;
            int i13 = c10049f.f30211z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c10049f.f30211z = i13 - Integer.MIN_VALUE;
            } else {
                c10049f = new C10049f(interfaceC30057d);
            }
        } else {
            c10049f = new C10049f(interfaceC30057d);
        }
        Object objM25552d0 = c10049f.f30209x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c10049f.f30211z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM25552d0);
            textView = m25236o1().f72398C0;
            C10124m c10124mM25083B1 = m25083B1();
            c10049f.f30208w = textView;
            c10049f.f30211z = 1;
            objM25552d0 = c10124mM25083B1.m25552d0(c10049f);
            if (objM25552d0 != enumC31071a) {
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            textView = (TextView) c10049f.f30208w;
            AbstractC34132o.m107864I(objM25552d0);
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            textView2 = (TextView) c10049f.f30208w;
            AbstractC34132o.m107864I(objM25552d0);
        }
        if (((Boolean) objM25552d0).booleanValue()) {
            string = getResources().getString(AbstractC17312j.f66940N);
        } else if (m25083B1().m25542R().length() > 0) {
            string = m25083B1().m25542R();
        } else {
            string = getResources().getString(AbstractC17312j.f67013p1);
        }
        textView2.setText(string);
        return C23454a0.f92919a;
        if (((Boolean) objM25552d0).booleanValue()) {
            strM25544U = getResources().getString(AbstractC17312j.f66938M);
        } else {
            strM25544U = m25083B1().m25544U().length() > 0 ? m25083B1().m25544U() : getResources().getString(AbstractC17312j.f67016q1);
        }
        textView.setText(strM25544U);
        TextView textView3 = m25236o1().f72396B0;
        C10124m c10124mM25083B2 = m25083B1();
        c10049f.f30208w = textView3;
        c10049f.f30211z = 2;
        Object objM25552d1 = c10124mM25083B2.m25552d0(c10049f);
        if (objM25552d1 != enumC31071a) {
            textView2 = textView3;
            objM25552d0 = objM25552d1;
            if (((Boolean) objM25552d0).booleanValue()) {
                string = getResources().getString(AbstractC17312j.f66940N);
            } else if (m25083B1().m25542R().length() > 0) {
                string = m25083B1().m25542R();
            } else {
                string = getResources().getString(AbstractC17312j.f67013p1);
            }
            textView2.setText(string);
            return C23454a0.f92919a;
        }
        return enumC31071a;
    }

    /* JADX INFO: renamed from: r3 */
    private final void m25250r3() {
        m25236o1().f72416L0.setVisibility(0);
        AbstractC1329o1 childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        C1271a c1271a = new C1271a(childFragmentManager);
        c1271a.m4068e(m25236o1().f72416L0.getId(), new C22356f(), C22356f.class.getName());
        c1271a.m4046j();
    }

    /* JADX INFO: renamed from: s1 */
    private final C33236a m25252s1() {
        return (C33236a) this.nativeStoreActionRouter.getValue();
    }

    /* JADX INFO: renamed from: s2 */
    private final void m25253s2() {
        observe(m25083B1().getMembershipAffiliate(), new AbstractC10120l.a(new C12926w(this, 0)));
    }

    /* JADX INFO: renamed from: s3 */
    private final void m25254s3() {
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(viewLifecycleOwner), null, null, new C10073r(null), 3);
        AbstractC1329o1 childFragmentManager = getChildFragmentManager();
        C1271a c1271aM94758g = AbstractC30802r.m94758g(childFragmentManager, childFragmentManager);
        c1271aM94758g.m4068e(m25236o1().f72485o.getId(), new C40234j(), C40234j.class.getName());
        c1271aM94758g.m4046j();
    }

    /* JADX INFO: renamed from: t1 */
    private final C28498a m25256t1() {
        return (C28498a) this.nativeStoreAnalyticsHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0067  */
    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0073  */
    /* JADX INFO: renamed from: t2 */
    public static final C23454a0 m25257t2(SettingsLandingFragment settingsLandingFragment, MembershipAffiliate membershipAffiliate) {
        boolean zM25275y2 = settingsLandingFragment.m25275y2(EnumC15710a.REFER_A_FRIEND);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (zM25275y2) {
            settingsLandingFragment.m25093E1();
            return c23454a0;
        }
        if (settingsLandingFragment.m25244q1().isFeatureEnabled(FeatureFlagRepositoryKt.SETTINGS_BANNERS)) {
            if ((membershipAffiliate != null ? membershipAffiliate.getStatus() : null) != AffiliateStatus.APPROVED) {
                settingsLandingFragment.m25236o1().f72483n.setBackground(null);
                settingsLandingFragment.m25236o1().f72464g0.setVisibility(8);
                settingsLandingFragment.m25236o1().f72400D0.setVisibility(8);
                if (AbstractC22676k.m65745e(AbstractC21157n0.m59388d(settingsLandingFragment.getArguments()), "profile")) {
                    settingsLandingFragment.m25236o1().f72485o.setVisibility(8);
                } else {
                    settingsLandingFragment.m25254s3();
                }
                settingsLandingFragment.m25250r3();
            } else {
                if ((membershipAffiliate != null ? membershipAffiliate.getStatus() : null) == AffiliateStatus.APPROVED) {
                    settingsLandingFragment.m25101G1();
                } else {
                    settingsLandingFragment.m25236o1().f72483n.setBackground(AbstractC32122c.getDrawable(settingsLandingFragment.requireContext(), AbstractC17306d.f66536g));
                    settingsLandingFragment.m25236o1().f72485o.setVisibility(8);
                    settingsLandingFragment.m25236o1().f72416L0.setVisibility(8);
                    settingsLandingFragment.m25236o1().f72400D0.setVisibility(8);
                }
            }
        } else {
            if ((membershipAffiliate != null ? membershipAffiliate.getStatus() : null) == AffiliateStatus.APPROVED) {
                settingsLandingFragment.m25101G1();
            } else {
                settingsLandingFragment.m25236o1().f72483n.setBackground(AbstractC32122c.getDrawable(settingsLandingFragment.requireContext(), AbstractC17306d.f66536g));
                settingsLandingFragment.m25236o1().f72485o.setVisibility(8);
                settingsLandingFragment.m25236o1().f72416L0.setVisibility(8);
                settingsLandingFragment.m25236o1().f72400D0.setVisibility(8);
            }
        }
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t3 */
    public static final C34911a m25258t3(SettingsLandingFragment settingsLandingFragment) {
        return AbstractC15751g.m44431K(settingsLandingFragment.requireActivity());
    }

    /* JADX INFO: renamed from: u1 */
    private final C33238c m25260u1() {
        return (C33238c) this.nativeStoreRouter.getValue();
    }

    /* JADX INFO: renamed from: u2 */
    private final void m25261u2() {
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(viewLifecycleOwner), null, null, new C10051g(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u3 */
    public final View m25262u3(EnumC15710a tile) {
        switch (C10039a.f30177b[tile.ordinal()]) {
            case 1:
                return m25236o1().f72432T0;
            case 2:
                return m25236o1().f72444Z0;
            case 3:
                return m25236o1().f72499v;
            case 4:
                return m25236o1().f72480l1;
            case 5:
                return m25236o1().f72467h0;
            case 6:
                return m25236o1().f72441Y;
            case 7:
                return m25236o1().f72492r0;
            case 8:
                return m25236o1().f72457e;
            case 9:
                return m25236o1().f72426Q0;
            case 10:
                return m25236o1().f72459e1;
            case 11:
                return m25236o1().f72446a0;
            case 12:
                return m25236o1().f72437W;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: v1 */
    private final C21606a m25264v1() {
        return (C21606a) this.privacyEntryPointRouter.getValue();
    }

    /* JADX INFO: renamed from: v2 */
    private final void m25265v2() {
        ConstraintLayout whoopLabsLayout = m25236o1().f72459e1;
        AbstractC22676k.m65749i(whoopLabsLayout, "whoopLabsLayout");
        whoopLabsLayout.setVisibility(m25244q1().isFeatureEnabled("whoop-labs-remote-study-android") ? 0 : 8);
    }

    /* JADX INFO: renamed from: v3 */
    private final void m25266v3(AbstractC10089a alertStatus) {
        String string;
        if (alertStatus == null) {
            m25236o1().f72479l0.setBackgroundResource(AbstractC36512c.f156063f);
            m25198e3((MembershipStatus) m25083B1().getMembershipStatus().getValue());
            return;
        }
        m25236o1().f72479l0.setBackgroundResource(AbstractC17306d.f66531b);
        if (alertStatus.equals(AbstractC10089a.d.f30333a)) {
            string = getString(AbstractC17312j.f67009o0);
        } else if (alertStatus.equals(AbstractC10089a.c.f30332a)) {
            string = getString(AbstractC17312j.f67006n0);
        } else if (alertStatus instanceof AbstractC10089a.a) {
            AbstractC10089a.a aVar = (AbstractC10089a.a) alertStatus;
            string = getString(AbstractC17312j.f67000l0, aVar.getBrand(), aVar.getLast4());
        } else {
            if (!(alertStatus instanceof AbstractC10089a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC10089a.b bVar = (AbstractC10089a.b) alertStatus;
            string = getString(AbstractC17312j.f67003m0, bVar.getBrand(), bVar.getLast4());
        }
        AbstractC22676k.m65747g(string);
        TextView myAccountSubtext = m25236o1().f72482m0;
        AbstractC22676k.m65749i(myAccountSubtext, "myAccountSubtext");
        myAccountSubtext.setVisibility(0);
        m25236o1().f72482m0.setText(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w1 */
    public final C40245u m25268w1() {
        return (C40245u) this.settingsBannerCoordinator.getValue();
    }

    /* JADX INFO: renamed from: w2 */
    private final void m25269w2() {
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(viewLifecycleOwner), null, null, new C10053h(null), 3);
        observe(m25083B1().getWteViewState(), new AbstractC10120l.a(new C12928y(this, 4)));
    }

    /* JADX INFO: renamed from: x1 */
    private final C12899c0 m25271x1() {
        return (C12899c0) this.settingsModalRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x2 */
    public static final C23454a0 m25272x2(SettingsLandingFragment settingsLandingFragment, C12913j0 wteViewState) {
        AbstractC22676k.m65750j(wteViewState, "wteViewState");
        settingsLandingFragment.isWteRedirection = true;
        int i13 = C10039a.f30176a[wteViewState.getCtaLocation().ordinal()];
        if (i13 == 1) {
            ConstraintLayout gettingStartedSectionContainer = settingsLandingFragment.m25236o1().f72499v;
            AbstractC22676k.m65749i(gettingStartedSectionContainer, "gettingStartedSectionContainer");
            gettingStartedSectionContainer.setVisibility(0);
            Integer numM36326c = wteViewState.getIcon();
            if (numM36326c != null) {
                settingsLandingFragment.m25236o1().f72425Q.setImageDrawable(settingsLandingFragment.getResources().getDrawable(numM36326c.intValue(), null));
            }
            ConstraintLayout journeyToAHealthierYou = settingsLandingFragment.m25236o1().f72452c0;
            AbstractC22676k.m65749i(journeyToAHealthierYou, "journeyToAHealthierYou");
            journeyToAHealthierYou.setVisibility(0);
            settingsLandingFragment.m25236o1().f72427R.setText(wteViewState.getTitle());
            String strM36324a = wteViewState.getBody();
            if (strM36324a != null) {
                TextView healthierYouSubtext = settingsLandingFragment.m25236o1().f72429S;
                AbstractC22676k.m65749i(healthierYouSubtext, "healthierYouSubtext");
                healthierYouSubtext.setVisibility(0);
                settingsLandingFragment.m25236o1().f72429S.setText(strM36324a);
            }
            MembershipAffiliate membershipAffiliate = (MembershipAffiliate) settingsLandingFragment.m25083B1().getMembershipAffiliate().getValue();
            if ((membershipAffiliate != null ? membershipAffiliate.getStatus() : null) == AffiliateStatus.APPROVED) {
                int dimensionPixelSize = settingsLandingFragment.getResources().getDimensionPixelSize(AbstractC36511b.f156056i);
                settingsLandingFragment.m25236o1().f72400D0.setPadding(dimensionPixelSize, settingsLandingFragment.getResources().getDimensionPixelSize(AbstractC36511b.f156051d), dimensionPixelSize, 0);
            }
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ConstraintLayout gettingStartedSectionContainer2 = settingsLandingFragment.m25236o1().f72499v;
            AbstractC22676k.m65749i(gettingStartedSectionContainer2, "gettingStartedSectionContainer");
            gettingStartedSectionContainer2.setVisibility(8);
            ConstraintLayout wteLayout = settingsLandingFragment.m25236o1().f72480l1;
            AbstractC22676k.m65749i(wteLayout, "wteLayout");
            wteLayout.setVisibility(0);
            Integer numM36326c2 = wteViewState.getIcon();
            if (numM36326c2 != null) {
                settingsLandingFragment.m25236o1().f72477k1.setImageDrawable(settingsLandingFragment.getResources().getDrawable(numM36326c2.intValue(), null));
            }
            settingsLandingFragment.m25236o1().f72471i1.setText(wteViewState.getTitle());
            String strM36324a2 = wteViewState.getBody();
            if (strM36324a2 != null) {
                TextView wteDescription = settingsLandingFragment.m25236o1().f72474j1;
                AbstractC22676k.m65749i(wteDescription, "wteDescription");
                wteDescription.setVisibility(0);
                settingsLandingFragment.m25236o1().f72474j1.setText(strM36324a2);
            }
            MembershipAffiliate membershipAffiliate2 = (MembershipAffiliate) settingsLandingFragment.m25083B1().getMembershipAffiliate().getValue();
            if ((membershipAffiliate2 != null ? membershipAffiliate2.getStatus() : null) == AffiliateStatus.APPROVED) {
                int dimensionPixelSize2 = settingsLandingFragment.getResources().getDimensionPixelSize(AbstractC36511b.f156056i);
                settingsLandingFragment.m25236o1().f72400D0.setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y1 */
    private final C40613a m25274y1() {
        return (C40613a) this.smsSettingsNavigationRouter.getValue();
    }

    /* JADX INFO: renamed from: y2 */
    private final boolean m25275y2(EnumC15710a tile) {
        return AbstractC22676k.m65745e(((Map) m25083B1().getTileVisibility().getValue()).get(tile), Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z1 */
    public final InterfaceC40205a m25277z1() {
        return (InterfaceC40205a) this.userInfoAccessor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public static final C34911a m25278z2(SettingsLandingFragment settingsLandingFragment) {
        return AbstractC15751g.m44431K(AbstractC5583n.m16799z(settingsLandingFragment), settingsLandingFragment.requireActivity());
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    @Override // hj0.AbstractC17354m
    public String getScreenName() {
        return this.screenName;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        AbstractC18563s abstractC18563sM53775c = AbstractC18563s.m53775c(inflater, container, false);
        AbstractC22676k.m65747g(abstractC18563sM53775c);
        m25190c3(abstractC18563sM53775c);
        View root = abstractC18563sM53775c.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        getActivity();
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m25182a3();
        this.isModal = m25178Z2();
        m25180a1();
        m25206g3();
        m25222k3();
        m25083B1().m25545V();
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C10063m(null), 3);
        m25186b3();
        m25102G2();
        m25241p2();
        m25162V2();
        m25245q2();
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C10065n(null), 3);
        m25253s2();
        m25261u2();
        m25084B2();
        m25118K2();
        m25138P2();
        if (m25244q1().isFeatureEnabled(FeatureFlagRepositoryKt.ADVANCED_LABS_STANDALONE)) {
            m25158U2();
            m25166W2();
        } else {
            m25205g2();
            m25265v2();
            AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C10067o(null), 3);
            m25269w2();
        }
        if (m25224l1().m36300a() && (!AbstractC22676k.m65745e(this.lastArgs, m25224l1()) || this.lastArgs == null)) {
            this.lastArgs = m25224l1();
            String strM25543S = m25083B1().m25543S();
            getEventDispatcher().m128998K0();
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", strM25543S);
            intent.setType(MimeType.MIME_TYPE_TXT);
            AbstractC32122c.startActivity(requireContext(), Intent.createChooser(intent, getString(AbstractC38505d0.f165668g2)), null);
        }
        m25236o1().f72434U0.setText(getString(AbstractC17312j.f66944P));
    }
}
