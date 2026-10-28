package com.whoop.home.view;

import a11.EnumC0124b;
import android.companion.CompanionDeviceManager;
import android.content.ComponentCallbacks;
import android.content.ContentResolver;
import android.content.Context;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.contract.ActivityResultContracts$StartIntentSenderForResult;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.fragment.app.InterfaceC1357w1;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.EnumC1635w;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1585g0;
import b03.C2209f;
import b03.InterfaceC2208e;
import b11.C2281h;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c03.C3815c;
import c41.C3989a4;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ch.C4588i;
import com.google.android.material.textfield.C5057p;
import com.squareup.wire.AbstractC5583n;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.design.models.calendar.CalendarDateModel;
import com.whoop.home.view.HomeFragment;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.GiftHubScreenModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import dm1.AbstractC12177a;
import dm1.C12178b;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import em1.AbstractC13325a;
import em1.AbstractC13328b0;
import em1.AbstractC13329c;
import em1.AbstractC13333g;
import em1.AbstractC13334h;
import em1.AbstractC13335i;
import em1.AbstractC13337k;
import em1.AbstractC13340n;
import em1.AbstractC13341o;
import em1.AbstractC13342p;
import em1.AbstractC13345s;
import em1.AbstractC13349w;
import em1.C13326a0;
import em1.C13347u;
import em1.C13348v;
import em1.C13350x;
import em1.C13351y;
import em1.EnumC13344r;
import em1.InterfaceC13346t;
import fm1.C14597a;
import fm1.C14599c;
import fm1.C14600d;
import fm1.C14602f;
import fm1.EnumC14603g;
import fm1.EnumC14606j;
import fn2.InterfaceC14643c;
import fn2.InterfaceC14644d;
import fn2.InterfaceC14652l;
import fn2.InterfaceC14654n;
import ga1.C15621b;
import ge3.AbstractC15751g;
import gl1.C15966a;
import gl1.C15967b;
import gl1.C15970e;
import h91.C17027b;
import hj0.C17359r;
import ih1.C18518b;
import ik2.C18613a;
import il1.AbstractC18642s;
import il1.EnumC18633j;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21155m0;
import j02.C21133b1;
import j02.C21138e;
import j02.C21173v0;
import j02.InterfaceC21136d;
import j02.InterfaceC21159o0;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jf3.C21647a;
import jl1.AbstractC21772c;
import kb1.C22325e;
import kd1.AbstractC22387b0;
import kd1.EnumC22400l;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import live.hms.video.media.tracks.HMSTrackSource;
import m32.C25010f;
import m32.EnumC25009e;
import m32.InterfaceC25007c;
import m83.AbstractC25265s;
import m83.C25271y;
import or2.AbstractC28163g0;
import or2.C28217y0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p007a6.C0467z0;
import p026b2.C2299e;
import p026b2.C2314t;
import p077d0.C11328a;
import p088dc.AbstractC11895b;
import p114eb.C12977n0;
import p189hb.C17071g;
import p236j.AbstractC21065d;
import p236j.C21062a;
import p236j.C21073l;
import p236j.InterfaceC21063b;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p532ur.InterfaceC35173b;
import p602x1.C37816b;
import p634y1.AbstractC39038k;
import p635y2.InterfaceC39127r0;
import p710im1.AbstractC18697t0;
import p710im1.C18656a0;
import p710im1.C18662c0;
import p710im1.C18688p;
import p710im1.C18701v0;
import p710im1.C18708z;
import p710im1.Function0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u92.C34660d;
import uf3.C34911a;
import ul1.EnumC35066c;
import vf3.C35953c;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;
import wl1.AbstractC37356b;
import wm1.C37382d;
import x90.C38099e;
import ym2.InterfaceC39659g;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000ô\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0002è\u0001\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0018\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0082@¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010\u0003J\u000f\u0010,\u001a\u00020\u0006H\u0002¢\u0006\u0004\b,\u0010\u0003J\u000f\u0010-\u001a\u00020\u0006H\u0002¢\u0006\u0004\b-\u0010\u0003J\u0017\u00100\u001a\u00020\u00062\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0006H\u0002¢\u0006\u0004\b2\u0010\u0003J\u000f\u00103\u001a\u00020\u0006H\u0002¢\u0006\u0004\b3\u0010\u0003J\u000f\u00104\u001a\u00020\u0006H\u0002¢\u0006\u0004\b4\u0010\u0003J\u000f\u00105\u001a\u00020\u0006H\u0002¢\u0006\u0004\b5\u0010\u0003J\u000f\u00106\u001a\u00020\u0006H\u0002¢\u0006\u0004\b6\u0010\u0003J\u000f\u00107\u001a\u00020\u001fH\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0006H\u0002¢\u0006\u0004\b9\u0010\u0003J'\u0010=\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020.H\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u001fH\u0002¢\u0006\u0004\b?\u00108J%\u0010C\u001a\u00020\u00062\u0006\u0010@\u001a\u00020.2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00060AH\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020\u00062\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\bI\u0010JJ\u001f\u0010O\u001a\u00020N2\u0006\u0010L\u001a\u00020K2\u0006\u0010F\u001a\u00020MH\u0002¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u0006H\u0002¢\u0006\u0004\bQ\u0010\u0003J\u0019\u0010T\u001a\u00020\u001f2\b\u0010S\u001a\u0004\u0018\u00010RH\u0002¢\u0006\u0004\bT\u0010UR\u001b\u0010[\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u001b\u0010`\u001a\u00020\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010X\u001a\u0004\b^\u0010_R\u001b\u0010e\u001a\u00020a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010X\u001a\u0004\bc\u0010dR\u001b\u0010j\u001a\u00020f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010X\u001a\u0004\bh\u0010iR\u001b\u0010o\u001a\u00020k8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010X\u001a\u0004\bm\u0010nR\u001b\u0010t\u001a\u00020p8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u0010X\u001a\u0004\br\u0010sR\u001b\u0010y\u001a\u00020u8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u0010X\u001a\u0004\bw\u0010xR\u001b\u0010~\u001a\u00020z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010X\u001a\u0004\b|\u0010}R\u001f\u0010\u0083\u0001\u001a\u00020\u007f8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0080\u0001\u0010X\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0019\u0010\u0086\u0001\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001c\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R \u0010\u008f\u0001\u001a\u00030\u008b\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008c\u0001\u0010X\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R!\u0010\u0094\u0001\u001a\n\u0012\u0005\u0012\u00030\u0091\u00010\u0090\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R!\u0010\u0096\u0001\u001a\n\u0012\u0005\u0012\u00030\u0091\u00010\u0090\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0093\u0001R\u0018\u0010\u009a\u0001\u001a\u00030\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R \u0010\u009f\u0001\u001a\u00030\u009b\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u009c\u0001\u0010X\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R \u0010¤\u0001\u001a\u00030 \u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b¡\u0001\u0010X\u001a\u0006\b¢\u0001\u0010£\u0001R \u0010©\u0001\u001a\u00030¥\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b¦\u0001\u0010X\u001a\u0006\b§\u0001\u0010¨\u0001R \u0010®\u0001\u001a\u00030ª\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b«\u0001\u0010X\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R \u0010³\u0001\u001a\u00030¯\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b°\u0001\u0010X\u001a\u0006\b±\u0001\u0010²\u0001R!\u0010·\u0001\u001a\u0004\u0018\u00010.8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b´\u0001\u0010X\u001a\u0006\bµ\u0001\u0010¶\u0001R!\u0010º\u0001\u001a\u0004\u0018\u00010.8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b¸\u0001\u0010X\u001a\u0006\b¹\u0001\u0010¶\u0001R \u0010¿\u0001\u001a\u00030»\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b¼\u0001\u0010X\u001a\u0006\b½\u0001\u0010¾\u0001R \u0010Ä\u0001\u001a\u00030À\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bÁ\u0001\u0010X\u001a\u0006\bÂ\u0001\u0010Ã\u0001R \u0010Ç\u0001\u001a\u00030À\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bÅ\u0001\u0010X\u001a\u0006\bÆ\u0001\u0010Ã\u0001R \u0010Ë\u0001\u001a\u00030È\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0085\u0001\u0010X\u001a\u0006\bÉ\u0001\u0010Ê\u0001R \u0010Ð\u0001\u001a\u00030Ì\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bÍ\u0001\u0010X\u001a\u0006\bÎ\u0001\u0010Ï\u0001R \u0010Õ\u0001\u001a\u00030Ñ\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bÒ\u0001\u0010X\u001a\u0006\bÓ\u0001\u0010Ô\u0001R \u0010Ú\u0001\u001a\u00030Ö\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b×\u0001\u0010X\u001a\u0006\bØ\u0001\u0010Ù\u0001R \u0010ß\u0001\u001a\u00030Û\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bÜ\u0001\u0010X\u001a\u0006\bÝ\u0001\u0010Þ\u0001R \u0010â\u0001\u001a\u00030Ñ\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bà\u0001\u0010X\u001a\u0006\bá\u0001\u0010Ô\u0001R \u0010ç\u0001\u001a\u00030ã\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bä\u0001\u0010X\u001a\u0006\bå\u0001\u0010æ\u0001R\u0018\u0010ë\u0001\u001a\u00030è\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bé\u0001\u0010ê\u0001¨\u0006ð\u0001²\u0006\f\u0010L\u001a\u00020K8\nX\u008a\u0084\u0002²\u0006\u000e\u0010í\u0001\u001a\u00030ì\u00018\nX\u008a\u0084\u0002²\u0006\r\u0010î\u0001\u001a\u00020\u001f8\nX\u008a\u0084\u0002²\u0006\u000f\u0010ï\u0001\u001a\u00020'8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lcom/whoop/home/view/HomeFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "onStop", "onResume", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Ldm1/a;", NotificationCompat.CATEGORY_EVENT, "x1", "(Ldm1/a;)V", "", "isNavBarVisible", "L2", "(Z)V", "Lem1/t;", "homeViewEvent", "y2", "(Lem1/t;Lq83/d;)Ljava/lang/Object;", "", "featureId", "H2", "(I)V", "H1", "D2", "C2", "", "source", "I1", "(Ljava/lang/String;)V", "T0", "Q0", "x2", "M2", "z1", "D1", "()Z", "K1", "Lcom/whoop/navigation/AppScreen;", HMSTrackSource.SCREEN, "autoPopId", "F2", "(Ldm1/a;Lcom/whoop/navigation/AppScreen;Ljava/lang/String;)V", "C1", "expectedIdentifier", "Lkotlin/Function0;", "onDismiss", "E1", "(Ljava/lang/String;Lc93/a;)V", "Lul1/c;", "type", "a1", "(Lul1/c;)V", "G2", "(Ldm1/a;)Z", "Lem1/v;", "viewState", "Lfm1/j;", "Lem1/n$c;", "t1", "(Lem1/v;Lfm1/j;)Lem1/n$c;", "I2", "Lfm1/f;", "pillarContent", "B1", "(Lfm1/f;)Z", "Lem1/u;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "u1", "()Lem1/u;", "viewModel", "Lem1/a0;", "x", "q1", "()Lem1/a0;", "tiltEntryButtonViewModel", "Lb03/f;", "y", "n1", "()Lb03/f;", "statusViewModel", "Ldm1/b;", "z", "e1", "()Ldm1/b;", "homeScreenNavigationRouter", "Lx90/e;", "E", "V0", "()Lx90/e;", "activeSessionNavigationResolver", "Lfn2/d;", "F", "k1", "()Lfn2/d;", "rotationDetector", "Lfn2/l;", "G", "r1", "()Lfn2/l;", "tiltEntryRotationMonitor", "Lfn2/n;", "H", "s1", "()Lfn2/n;", "tiltOrientationPolicy", "Lfn2/c;", "I", "g1", "()Lfn2/c;", "orientationLockChecker", "J", "Z", "isTiltEntryEligible", "Landroid/database/ContentObserver;", "K", "Landroid/database/ContentObserver;", "orientationLockObserver", "Lym2/g;", "L", "v1", "()Lym2/g;", "whoopSplashState", "Lj/d;", "Lj/l;", "M", "Lj/d;", "activityLauncher", "N", "checkLocationSettings", "Ltr2/n;", "O", "Ltr2/n;", "logger", "Lgl1/b;", "P", "W0", "()Lgl1/b;", "analyticsHelper", "Lgl1/a;", "Q", "X0", "()Lgl1/a;", "autoPopTracker", "Lgl1/e;", "R", "p1", "()Lgl1/e;", "streaksAnalyticsHelper", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "S", "b1", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lim1/c0;", "T", "d1", "()Lim1/c0;", "homeItemActionRouter", "U", "m1", "()Ljava/lang/String;", "sourceId", "V", "Z0", "destinationPillar", "Lj02/b1;", "W", "w1", "()Lj02/b1;", "yirCoordinator", "Lu92/d;", "X", "l1", "()Lu92/d;", "sharedPrefs", "Y", "o1", "strainCoachPrefs", "Lj02/o0;", "getNavigator", "()Lj02/o0;", "navigator", "Lor2/y0;", "a0", "f1", "()Lor2/y0;", "locationServicesHelper", "Lm32/c;", "b0", "c1", "()Lm32/c;", "fwUpdatePermissionHelper", "Lm32/f;", "c0", "h1", "()Lm32/f;", "pushNotificationPermissionRequestValidator", "Lj02/e;", "d0", "Y0", "()Lj02/e;", "bffBottomNavTabEventPublisher", "e0", "i1", "pushNotificationsPermissionHelper", "Lur/b;", "f0", "j1", "()Lur/b;", "reviewManager", "com/whoop/home/view/HomeFragment$b", "g0", "Lcom/whoop/home/view/HomeFragment$b;", "callBack", "Lc03/c;", "statusViewState", "showTiltEntryButton", "currentCalendarPageIndex", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class HomeFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h activeSessionNavigationResolver;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h rotationDetector;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h tiltEntryRotationMonitor;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC23462h tiltOrientationPolicy;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC23462h orientationLockChecker;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private boolean isTiltEntryEligible;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private ContentObserver orientationLockObserver;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC23462h whoopSplashState;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private AbstractC21065d activityLauncher;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private AbstractC21065d checkLocationSettings;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final InterfaceC23462h autoPopTracker;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final InterfaceC23462h streaksAnalyticsHelper;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private final InterfaceC23462h homeItemActionRouter;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private final InterfaceC23462h sourceId;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private final InterfaceC23462h destinationPillar;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private final InterfaceC23462h yirCoordinator;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private final InterfaceC23462h sharedPrefs;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private final InterfaceC23462h strainCoachPrefs;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    private final InterfaceC23462h locationServicesHelper;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    private final InterfaceC23462h fwUpdatePermissionHelper;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    private final InterfaceC23462h pushNotificationPermissionRequestValidator;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    private final InterfaceC23462h bffBottomNavTabEventPublisher;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    private final InterfaceC23462h pushNotificationsPermissionHelper;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    private final InterfaceC23462h reviewManager;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    private final C8819b callBack;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h tiltEntryButtonViewModel;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h statusViewModel;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h homeScreenNavigationRouter;

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C8817a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f26410a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f26411b;

        static {
            int[] iArr = new int[EnumC35066c.values().length];
            try {
                iArr[EnumC35066c.CDM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC35066c.FIRMWARE_UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC35066c.HARD_TOMBSTONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC35066c.SOFT_TOMBSTONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC35066c.LANGUAGE_MODAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC35066c.PROCESS_FW.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC35066c.APP_CRASH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f26410a = iArr;
            int[] iArr2 = new int[EnumC14606j.values().length];
            try {
                iArr2[EnumC14606j.PREVIOUS_CYCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC14606j.NEXT_CYCLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            f26411b = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$a0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8818a0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26412w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26413x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26414y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8818a0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26412w = componentCallbacks;
            this.f26413x = interfaceC35951a;
            this.f26414y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.e, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C21138e invoke() {
            ComponentCallbacks componentCallbacks = this.f26412w;
            InterfaceC35951a interfaceC35951a = this.f26413x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26414y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21138e.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$b */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"com/whoop/home/view/HomeFragment$b", "Landroid/companion/CompanionDeviceManager$Callback;", "Landroid/content/IntentSender;", "chooserLauncher", "Ll83/a0;", "onDeviceFound", "(Landroid/content/IntentSender;)V", "", "error", "onFailure", "(Ljava/lang/CharSequence;)V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C8819b extends CompanionDeviceManager.Callback {
        public C8819b() {
        }

        @Override // android.companion.CompanionDeviceManager.Callback
        @InterfaceC23457c
        public void onDeviceFound(IntentSender chooserLauncher) {
            AbstractC22676k.m65750j(chooserLauncher, "chooserLauncher");
            HomeFragment.this.logger.mo85228t("CDM: Launching CDM Dialog", new AbstractC30556a.a[0]);
            C21073l c21073lM15858a = new C5057p(chooserLauncher).m15858a();
            AbstractC21065d abstractC21065d = HomeFragment.this.activityLauncher;
            if (abstractC21065d != null) {
                abstractC21065d.mo4052a(c21073lM15858a, null);
            } else {
                AbstractC22676k.m65757q("activityLauncher");
                throw null;
            }
        }

        @Override // android.companion.CompanionDeviceManager.Callback
        public void onFailure(CharSequence error) {
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$b0 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8820b0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26416w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26417x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26418y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8820b0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26416w = componentCallbacks;
            this.f26417x = interfaceC35951a;
            this.f26418y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, m32.c] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC25007c invoke() {
            ComponentCallbacks componentCallbacks = this.f26416w;
            InterfaceC35951a interfaceC35951a = this.f26417x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26418y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC25007c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$c */
    @InterfaceC32271e(m100429c = "com.whoop.home.view.HomeFragment$detectScreenRotation$1", m100430f = "HomeFragment.kt", m100431l = {626}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8821c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f26419w;

        /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.home.view.HomeFragment$detectScreenRotation$1$1", m100430f = "HomeFragment.kt", m100431l = {627, 629, 630, 634}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f26421w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ HomeFragment f26422x;

            /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes9.dex */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41390a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ HomeFragment f26423w;

                public C41390a(HomeFragment homeFragment) {
                    this.f26423w = homeFragment;
                }

                @Override // ec3.InterfaceC13062m
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object emit(LocalDate localDate, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                    if (!this.f26423w.m21723D1()) {
                        this.f26423w.m21814e1().m33776j(new AbstractC12177a.b0(localDate != null ? localDate.toString() : null, "Tilt"));
                    }
                    return C23454a0.f92919a;
                }
            }

            /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$c$a$b */
            /* JADX INFO: loaded from: classes9.dex */
            @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class b implements InterfaceC13058l {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13058l f26424w;

                /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$c$a$b$a, reason: collision with other inner class name */
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C41391a<T> implements InterfaceC13062m {

                    /* JADX INFO: renamed from: w */
                    final /* synthetic */ InterfaceC13062m f26425w;

                    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$c$a$b$a$a, reason: collision with other inner class name */
                    @InterfaceC32271e(m100429c = "com.whoop.home.view.HomeFragment$detectScreenRotation$1$1$invokeSuspend$$inlined$filter$1$2", m100430f = "HomeFragment.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                    public static final class C41392a extends AbstractC32269c {

                        /* JADX INFO: renamed from: F */
                        Object f26427F;

                        /* JADX INFO: renamed from: G */
                        Object f26428G;

                        /* JADX INFO: renamed from: H */
                        int f26429H;

                        /* JADX INFO: renamed from: w */
                        /* synthetic */ Object f26430w;

                        /* JADX INFO: renamed from: x */
                        int f26431x;

                        /* JADX INFO: renamed from: y */
                        Object f26432y;

                        /* JADX INFO: renamed from: z */
                        Object f26433z;

                        public C41392a(InterfaceC30057d interfaceC30057d) {
                            super(interfaceC30057d);
                        }

                        @Override // s83.AbstractC32267a
                        public final Object invokeSuspend(Object obj) {
                            this.f26430w = obj;
                            this.f26431x |= Integer.MIN_VALUE;
                            return C41391a.this.emit(null, this);
                        }
                    }

                    public C41391a(InterfaceC13062m interfaceC13062m) {
                        this.f26425w = interfaceC13062m;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // ec3.InterfaceC13062m
                    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                        C41392a c41392a;
                        if (interfaceC30057d instanceof C41392a) {
                            c41392a = (C41392a) interfaceC30057d;
                            int i13 = c41392a.f26431x;
                            if ((i13 & Integer.MIN_VALUE) != 0) {
                                c41392a.f26431x = i13 - Integer.MIN_VALUE;
                            } else {
                                c41392a = new C41392a(interfaceC30057d);
                            }
                        } else {
                            c41392a = new C41392a(interfaceC30057d);
                        }
                        Object obj2 = c41392a.f26430w;
                        EnumC31071a enumC31071a = EnumC31071a.f128113w;
                        int i14 = c41392a.f26431x;
                        if (i14 == 0) {
                            AbstractC34132o.m107864I(obj2);
                            InterfaceC13062m interfaceC13062m = this.f26425w;
                            if (!((C13348v) obj).getIsLoading()) {
                                c41392a.f26432y = null;
                                c41392a.f26433z = null;
                                c41392a.f26427F = null;
                                c41392a.f26428G = null;
                                c41392a.f26429H = 0;
                                c41392a.f26431x = 1;
                                if (interfaceC13062m.emit(obj, c41392a) == enumC31071a) {
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

                public b(InterfaceC13058l interfaceC13058l) {
                    this.f26424w = interfaceC13058l;
                }

                @Override // ec3.InterfaceC13058l
                public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                    Object objCollect = this.f26424w.collect(new C41391a(interfaceC13062m), interfaceC30057d);
                    return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
                }
            }

            /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$c$a$c */
            /* JADX INFO: loaded from: classes9.dex */
            @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class c implements InterfaceC13058l {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13058l f26434w;

                /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$c$a$c$a, reason: collision with other inner class name */
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C41393a<T> implements InterfaceC13062m {

                    /* JADX INFO: renamed from: w */
                    final /* synthetic */ InterfaceC13062m f26435w;

                    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$c$a$c$a$a, reason: collision with other inner class name */
                    @InterfaceC32271e(m100429c = "com.whoop.home.view.HomeFragment$detectScreenRotation$1$1$invokeSuspend$$inlined$map$1$2", m100430f = "HomeFragment.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                    public static final class C41394a extends AbstractC32269c {

                        /* JADX INFO: renamed from: E */
                        Object f26436E;

                        /* JADX INFO: renamed from: F */
                        Object f26437F;

                        /* JADX INFO: renamed from: G */
                        Object f26438G;

                        /* JADX INFO: renamed from: H */
                        int f26439H;

                        /* JADX INFO: renamed from: w */
                        /* synthetic */ Object f26440w;

                        /* JADX INFO: renamed from: x */
                        int f26441x;

                        /* JADX INFO: renamed from: y */
                        Object f26442y;

                        public C41394a(InterfaceC30057d interfaceC30057d) {
                            super(interfaceC30057d);
                        }

                        @Override // s83.AbstractC32267a
                        public final Object invokeSuspend(Object obj) {
                            this.f26440w = obj;
                            this.f26441x |= Integer.MIN_VALUE;
                            return C41393a.this.emit(null, this);
                        }
                    }

                    public C41393a(InterfaceC13062m interfaceC13062m) {
                        this.f26435w = interfaceC13062m;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // ec3.InterfaceC13062m
                    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                        C41394a c41394a;
                        C14600d c14600dM41768a;
                        if (interfaceC30057d instanceof C41394a) {
                            c41394a = (C41394a) interfaceC30057d;
                            int i13 = c41394a.f26441x;
                            if ((i13 & Integer.MIN_VALUE) != 0) {
                                c41394a.f26441x = i13 - Integer.MIN_VALUE;
                            } else {
                                c41394a = new C41394a(interfaceC30057d);
                            }
                        } else {
                            c41394a = new C41394a(interfaceC30057d);
                        }
                        Object obj2 = c41394a.f26440w;
                        EnumC31071a enumC31071a = EnumC31071a.f128113w;
                        int i14 = c41394a.f26441x;
                        if (i14 == 0) {
                            AbstractC34132o.m107864I(obj2);
                            InterfaceC13062m interfaceC13062m = this.f26435w;
                            C14599c c14599cM37585l = ((C13348v) obj).getHomeFeed();
                            LocalDate localDateM41772c = (c14599cM37585l == null || (c14600dM41768a = c14599cM37585l.getHomeMetaData()) == null) ? null : c14600dM41768a.getCurrentDay();
                            c41394a.f26442y = null;
                            c41394a.f26436E = null;
                            c41394a.f26437F = null;
                            c41394a.f26438G = null;
                            c41394a.f26439H = 0;
                            c41394a.f26441x = 1;
                            if (interfaceC13062m.emit(localDateM41772c, c41394a) == enumC31071a) {
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

                public c(InterfaceC13058l interfaceC13058l) {
                    this.f26434w = interfaceC13058l;
                }

                @Override // ec3.InterfaceC13058l
                public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                    Object objCollect = this.f26434w.collect(new C41393a(interfaceC13062m), interfaceC30057d);
                    return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HomeFragment homeFragment, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f26422x = homeFragment;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f26422x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code duplicated, block: B:17:0x0039  */
            /* JADX WARN: Code duplicated, block: B:20:0x0048  */
            /* JADX WARN: Code duplicated, block: B:23:0x0057  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005d -> B:17:0x0039). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0087 -> B:17:0x0039). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // s83.AbstractC32267a
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r6.f26421w
                    r2 = 4
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L27
                    if (r1 == r5) goto L23
                    if (r1 == r4) goto L1f
                    if (r1 == r3) goto L1b
                    if (r1 != r2) goto L13
                    goto L23
                L13:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1b:
                    p505ts.AbstractC34132o.m107864I(r7)
                    goto L57
                L1f:
                    p505ts.AbstractC34132o.m107864I(r7)
                    goto L48
                L23:
                    p505ts.AbstractC34132o.m107864I(r7)
                    goto L39
                L27:
                    p505ts.AbstractC34132o.m107864I(r7)
                    com.whoop.home.view.HomeFragment r7 = r6.f26422x
                    ym2.g r7 = com.whoop.home.view.HomeFragment.m21738H0(r7)
                    r6.f26421w = r5
                    java.lang.Object r7 = r7.mo126789a(r6)
                    if (r7 != r0) goto L39
                    goto L89
                L39:
                    com.whoop.home.view.HomeFragment r7 = r6.f26422x
                    fn2.d r7 = com.whoop.home.view.HomeFragment.m21722D0(r7)
                    r6.f26421w = r4
                    java.lang.Object r7 = r7.mo41844a(r6)
                    if (r7 != r0) goto L48
                    goto L89
                L48:
                    com.whoop.home.view.HomeFragment r7 = r6.f26422x
                    fn2.d r7 = com.whoop.home.view.HomeFragment.m21722D0(r7)
                    r6.f26421w = r3
                    java.lang.Object r7 = r7.mo41845b(r6)
                    if (r7 != r0) goto L57
                    goto L89
                L57:
                    com.whoop.home.view.HomeFragment r7 = r6.f26422x
                    boolean r7 = com.whoop.home.view.HomeFragment.m21754L0(r7)
                    if (r7 == 0) goto L60
                    goto L39
                L60:
                    com.whoop.home.view.HomeFragment r7 = r6.f26422x
                    em1.u r7 = com.whoop.home.view.HomeFragment.m21734G0(r7)
                    ec3.l r7 = r7.getViewState()
                    com.whoop.home.view.HomeFragment$c$a$b r1 = new com.whoop.home.view.HomeFragment$c$a$b
                    r1.<init>(r7)
                    com.whoop.home.view.HomeFragment$c$a$c r7 = new com.whoop.home.view.HomeFragment$c$a$c
                    r7.<init>(r1)
                    ch.i r1 = new ch.i
                    r5 = 1
                    r1.<init>(r7, r5)
                    com.whoop.home.view.HomeFragment$c$a$a r7 = new com.whoop.home.view.HomeFragment$c$a$a
                    com.whoop.home.view.HomeFragment r5 = r6.f26422x
                    r7.<init>(r5)
                    r6.f26421w = r2
                    java.lang.Object r7 = r1.collect(r7, r6)
                    if (r7 != r0) goto L39
                L89:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.whoop.home.view.HomeFragment.C8821c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C8821c(InterfaceC30057d<? super C8821c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HomeFragment.this.new C8821c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C8821c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f26419w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC1585g0 viewLifecycleOwner = HomeFragment.this.getViewLifecycleOwner();
                AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                EnumC1635w enumC1635w = EnumC1635w.f6323E;
                a aVar = new a(HomeFragment.this, null);
                this.f26419w = 1;
                if (AbstractC1613o1.m5023m(viewLifecycleOwner, enumC1635w, aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$c0 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8822c0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26444w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26445x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26446y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8822c0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26444w = componentCallbacks;
            this.f26445x = interfaceC35951a;
            this.f26446y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ur.b] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC35173b invoke() {
            ComponentCallbacks componentCallbacks = this.f26444w;
            InterfaceC35951a interfaceC35951a = this.f26445x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26446y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC35173b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.view.HomeFragment$navigateToTiltGraph$1", m100430f = "HomeFragment.kt", m100431l = {616}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8823d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f26447w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f26449y;

        /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ HomeFragment f26450w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ String f26451x;

            public a(HomeFragment homeFragment, String str) {
                this.f26450w = homeFragment;
                this.f26451x = str;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(LocalDate localDate, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (!this.f26450w.m21723D1()) {
                    this.f26450w.m21814e1().m33776j(new AbstractC12177a.b0(localDate != null ? localDate.toString() : null, this.f26451x));
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$d$b */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f26452w;

            /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$d$b$a */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f26453w;

                /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$d$b$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.home.view.HomeFragment$navigateToTiltGraph$1$invokeSuspend$$inlined$filter$1$2", m100430f = "HomeFragment.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C41395a extends AbstractC32269c {

                    /* JADX INFO: renamed from: F */
                    Object f26455F;

                    /* JADX INFO: renamed from: G */
                    Object f26456G;

                    /* JADX INFO: renamed from: H */
                    int f26457H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f26458w;

                    /* JADX INFO: renamed from: x */
                    int f26459x;

                    /* JADX INFO: renamed from: y */
                    Object f26460y;

                    /* JADX INFO: renamed from: z */
                    Object f26461z;

                    public C41395a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f26458w = obj;
                        this.f26459x |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC13062m interfaceC13062m) {
                    this.f26453w = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C41395a c41395a;
                    if (interfaceC30057d instanceof C41395a) {
                        c41395a = (C41395a) interfaceC30057d;
                        int i13 = c41395a.f26459x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c41395a.f26459x = i13 - Integer.MIN_VALUE;
                        } else {
                            c41395a = new C41395a(interfaceC30057d);
                        }
                    } else {
                        c41395a = new C41395a(interfaceC30057d);
                    }
                    Object obj2 = c41395a.f26458w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c41395a.f26459x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f26453w;
                        if (!((C13348v) obj).getIsLoading()) {
                            c41395a.f26460y = null;
                            c41395a.f26461z = null;
                            c41395a.f26455F = null;
                            c41395a.f26456G = null;
                            c41395a.f26457H = 0;
                            c41395a.f26459x = 1;
                            if (interfaceC13062m.emit(obj, c41395a) == enumC31071a) {
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

            public b(InterfaceC13058l interfaceC13058l) {
                this.f26452w = interfaceC13058l;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f26452w.collect(new a(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$d$c */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class c implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f26462w;

            /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$d$c$a */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f26463w;

                /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$d$c$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.home.view.HomeFragment$navigateToTiltGraph$1$invokeSuspend$$inlined$map$1$2", m100430f = "HomeFragment.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C41396a extends AbstractC32269c {

                    /* JADX INFO: renamed from: E */
                    Object f26464E;

                    /* JADX INFO: renamed from: F */
                    Object f26465F;

                    /* JADX INFO: renamed from: G */
                    Object f26466G;

                    /* JADX INFO: renamed from: H */
                    int f26467H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f26468w;

                    /* JADX INFO: renamed from: x */
                    int f26469x;

                    /* JADX INFO: renamed from: y */
                    Object f26470y;

                    public C41396a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f26468w = obj;
                        this.f26469x |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC13062m interfaceC13062m) {
                    this.f26463w = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C41396a c41396a;
                    C14600d c14600dM41768a;
                    if (interfaceC30057d instanceof C41396a) {
                        c41396a = (C41396a) interfaceC30057d;
                        int i13 = c41396a.f26469x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c41396a.f26469x = i13 - Integer.MIN_VALUE;
                        } else {
                            c41396a = new C41396a(interfaceC30057d);
                        }
                    } else {
                        c41396a = new C41396a(interfaceC30057d);
                    }
                    Object obj2 = c41396a.f26468w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c41396a.f26469x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f26463w;
                        C14599c c14599cM37585l = ((C13348v) obj).getHomeFeed();
                        LocalDate localDateM41772c = (c14599cM37585l == null || (c14600dM41768a = c14599cM37585l.getHomeMetaData()) == null) ? null : c14600dM41768a.getCurrentDay();
                        c41396a.f26470y = null;
                        c41396a.f26464E = null;
                        c41396a.f26465F = null;
                        c41396a.f26466G = null;
                        c41396a.f26467H = 0;
                        c41396a.f26469x = 1;
                        if (interfaceC13062m.emit(localDateM41772c, c41396a) == enumC31071a) {
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

            public c(InterfaceC13058l interfaceC13058l) {
                this.f26462w = interfaceC13058l;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f26462w.collect(new a(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8823d(String str, InterfaceC30057d<? super C8823d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f26449y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HomeFragment.this.new C8823d(this.f26449y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C8823d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f26447w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C4588i c4588i = new C4588i(new c(new b(HomeFragment.this.m21862u1().getViewState())), 1);
                a aVar = new a(HomeFragment.this, this.f26449y);
                this.f26447w = 1;
                if (c4588i.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$d0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8824d0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26472w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26473x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26474y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8824d0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26472w = componentCallbacks;
            this.f26473x = interfaceC35951a;
            this.f26474y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, x90.e] */
        @Override // c93.InterfaceC4339a
        public final C38099e invoke() {
            ComponentCallbacks componentCallbacks = this.f26472w;
            InterfaceC35951a interfaceC35951a = this.f26473x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26474y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38099e.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$e */
    @InterfaceC32271e(m100429c = "com.whoop.home.view.HomeFragment$observeNavigationState$1", m100430f = "HomeFragment.kt", m100431l = {699}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8825e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f26475w;

        /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$e$a */
        @InterfaceC32271e(m100429c = "com.whoop.home.view.HomeFragment$observeNavigationState$1$1", m100430f = "HomeFragment.kt", m100431l = {700}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f26477w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ HomeFragment f26478x;

            /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$e$a$a, reason: collision with other inner class name */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41397a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ HomeFragment f26479w;

                /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$e$a$a$a, reason: collision with other inner class name */
                /* JADX INFO: loaded from: classes9.dex */
                @InterfaceC32271e(m100429c = "com.whoop.home.view.HomeFragment$observeNavigationState$1$1$1", m100430f = "HomeFragment.kt", m100431l = {702}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C41398a extends AbstractC32269c {

                    /* JADX INFO: renamed from: w */
                    Object f26480w;

                    /* JADX INFO: renamed from: x */
                    /* synthetic */ Object f26481x;

                    /* JADX INFO: renamed from: y */
                    final /* synthetic */ C41397a<T> f26482y;

                    /* JADX INFO: renamed from: z */
                    int f26483z;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C41398a(C41397a<? super T> c41397a, InterfaceC30057d<? super C41398a> interfaceC30057d) {
                        super(interfaceC30057d);
                        this.f26482y = c41397a;
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f26481x = obj;
                        this.f26483z |= Integer.MIN_VALUE;
                        return this.f26482y.emit(null, this);
                    }
                }

                public C41397a(HomeFragment homeFragment) {
                    this.f26479w = homeFragment;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object emit(AbstractC12177a abstractC12177a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                    C41398a c41398a;
                    if (interfaceC30057d instanceof C41398a) {
                        c41398a = (C41398a) interfaceC30057d;
                        int i13 = c41398a.f26483z;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c41398a.f26483z = i13 - Integer.MIN_VALUE;
                        } else {
                            c41398a = new C41398a(this, interfaceC30057d);
                        }
                    } else {
                        c41398a = new C41398a(this, interfaceC30057d);
                    }
                    Object obj = c41398a.f26481x;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c41398a.f26483z;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj);
                        this.f26479w.logger.mo85228t(AbstractC11266d.m30461o("observeNavigationState: Received event=", AbstractC22671h0.f89337a.getOrCreateKotlinClass(abstractC12177a.getClass()).getSimpleName()), new AbstractC30556a.a[0]);
                        InterfaceC39659g interfaceC39659gM21865v1 = this.f26479w.m21865v1();
                        c41398a.f26480w = abstractC12177a;
                        c41398a.f26483z = 1;
                        if (interfaceC39659gM21865v1.mo126789a(c41398a) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        abstractC12177a = (AbstractC12177a) c41398a.f26480w;
                        AbstractC34132o.m107864I(obj);
                    }
                    this.f26479w.m21880x1(abstractC12177a);
                    return C23454a0.f92919a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HomeFragment homeFragment, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f26478x = homeFragment;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f26478x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f26477w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13058l interfaceC13058lM37564h0 = this.f26478x.m21862u1().getNavigationState();
                    C41397a c41397a = new C41397a(this.f26478x);
                    this.f26477w = 1;
                    if (interfaceC13058lM37564h0.collect(c41397a, this) == enumC31071a) {
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

        public C8825e(InterfaceC30057d<? super C8825e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HomeFragment.this.new C8825e(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C8825e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f26475w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                HomeFragment homeFragment = HomeFragment.this;
                EnumC1635w enumC1635w = EnumC1635w.f6323E;
                a aVar = new a(homeFragment, null);
                this.f26475w = 1;
                if (AbstractC1613o1.m5023m(homeFragment, enumC1635w, aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$e0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8826e0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26484w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26485x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26486y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8826e0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26484w = componentCallbacks;
            this.f26485x = interfaceC35951a;
            this.f26486y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [fn2.d, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC14644d invoke() {
            ComponentCallbacks componentCallbacks = this.f26484w;
            InterfaceC35951a interfaceC35951a = this.f26485x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26486y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14644d.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$f */
    @InterfaceC32271e(m100429c = "com.whoop.home.view.HomeFragment$onCreateView$1$1$1", m100430f = "HomeFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8827f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f26487w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f26489y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8827f(InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super C8827f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f26489y = interfaceC28670t2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HomeFragment.this.new C8827f(this.f26489y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C8827f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f26487w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC22676k.m65745e(HomeFragment.m21770P1(this.f26489y).getShowInAppReviewPrompt(), AbstractC37356b.b.f159780a)) {
                HomeFragment.this.m21744I2();
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$f0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8828f0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26490w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26491x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26492y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8828f0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26490w = componentCallbacks;
            this.f26491x = interfaceC35951a;
            this.f26492y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [fn2.l, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC14652l invoke() {
            ComponentCallbacks componentCallbacks = this.f26490w;
            InterfaceC35951a interfaceC35951a = this.f26491x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26492y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14652l.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$g */
    @InterfaceC32271e(m100429c = "com.whoop.home.view.HomeFragment$onCreateView$1$2$1", m100430f = "HomeFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8829g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f26493w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Configuration f26495y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8829g(Configuration configuration, InterfaceC30057d<? super C8829g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f26495y = configuration;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HomeFragment.this.new C8829g(this.f26495y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C8829g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f26493w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (HomeFragment.this.isTiltEntryEligible && !HomeFragment.this.m21723D1()) {
                HomeFragment.this.m21850q1().m37454t(this.f26495y.orientation);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$g0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8830g0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26496w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26497x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26498y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8830g0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26496w = componentCallbacks;
            this.f26497x = interfaceC35951a;
            this.f26498y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [fn2.n, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC14654n invoke() {
            ComponentCallbacks componentCallbacks = this.f26496w;
            InterfaceC35951a interfaceC35951a = this.f26497x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26498y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14654n.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.view.HomeFragment$onCreateView$1$3$12$1$2$1", m100430f = "HomeFragment.kt", m100431l = {374}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8831h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f26499w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13346t f26501y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8831h(InterfaceC13346t interfaceC13346t, InterfaceC30057d<? super C8831h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f26501y = interfaceC13346t;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HomeFragment.this.new C8831h(this.f26501y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C8831h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f26499w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                HomeFragment homeFragment = HomeFragment.this;
                InterfaceC13346t interfaceC13346t = this.f26501y;
                this.f26499w = 1;
                if (homeFragment.m21875y2(interfaceC13346t, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$h0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8832h0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26502w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26503x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26504y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8832h0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26502w = componentCallbacks;
            this.f26503x = interfaceC35951a;
            this.f26504y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [fn2.c, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC14643c invoke() {
            ComponentCallbacks componentCallbacks = this.f26502w;
            InterfaceC35951a interfaceC35951a = this.f26503x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26504y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14643c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$i */
    @InterfaceC32271e(m100429c = "com.whoop.home.view.HomeFragment$onResume$1", m100430f = "HomeFragment.kt", m100431l = {563}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8833i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f26505w;

        /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$i$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ HomeFragment f26507w;

            public a(HomeFragment homeFragment) {
                this.f26507w = homeFragment;
            }

            /* JADX INFO: renamed from: b */
            public final Object m21884b(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (!this.f26507w.m21835l1().m109528e("has-shown-yir-2025", false)) {
                    this.f26507w.m21814e1().m33776j(AbstractC12177a.i0.f40537a);
                    this.f26507w.m21835l1().m109538q("has-shown-yir-2025", true);
                }
                return C23454a0.f92919a;
            }

            @Override // ec3.InterfaceC13062m
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                return m21884b(((Boolean) obj).booleanValue(), interfaceC30057d);
            }
        }

        /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$i$b */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f26508w;

            /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$i$b$a */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f26509w;

                /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$i$b$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.home.view.HomeFragment$onResume$1$invokeSuspend$$inlined$filter$1$2", m100430f = "HomeFragment.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C41399a extends AbstractC32269c {

                    /* JADX INFO: renamed from: F */
                    Object f26511F;

                    /* JADX INFO: renamed from: G */
                    Object f26512G;

                    /* JADX INFO: renamed from: H */
                    int f26513H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f26514w;

                    /* JADX INFO: renamed from: x */
                    int f26515x;

                    /* JADX INFO: renamed from: y */
                    Object f26516y;

                    /* JADX INFO: renamed from: z */
                    Object f26517z;

                    public C41399a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f26514w = obj;
                        this.f26515x |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC13062m interfaceC13062m) {
                    this.f26509w = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C41399a c41399a;
                    if (interfaceC30057d instanceof C41399a) {
                        c41399a = (C41399a) interfaceC30057d;
                        int i13 = c41399a.f26515x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c41399a.f26515x = i13 - Integer.MIN_VALUE;
                        } else {
                            c41399a = new C41399a(interfaceC30057d);
                        }
                    } else {
                        c41399a = new C41399a(interfaceC30057d);
                    }
                    Object obj2 = c41399a.f26514w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c41399a.f26515x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f26509w;
                        if (((Boolean) obj).booleanValue()) {
                            c41399a.f26516y = null;
                            c41399a.f26517z = null;
                            c41399a.f26511F = null;
                            c41399a.f26512G = null;
                            c41399a.f26513H = 0;
                            c41399a.f26515x = 1;
                            if (interfaceC13062m.emit(obj, c41399a) == enumC31071a) {
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

            public b(InterfaceC13058l interfaceC13058l) {
                this.f26508w = interfaceC13058l;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f26508w.collect(new a(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        public C8833i(InterfaceC30057d<? super C8833i> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HomeFragment.this.new C8833i(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C8833i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f26505w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                b bVar = new b(HomeFragment.this.m21868w1().m58969b());
                a aVar = new a(HomeFragment.this);
                this.f26505w = 1;
                if (bVar.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$i0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8834i0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26518w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26519x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26520y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8834i0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26518w = componentCallbacks;
            this.f26519x = interfaceC35951a;
            this.f26520y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ym2.g] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC39659g invoke() {
            ComponentCallbacks componentCallbacks = this.f26518w;
            InterfaceC35951a interfaceC35951a = this.f26519x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26520y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC39659g.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$j */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"com/whoop/home/view/HomeFragment$j", "Landroid/database/ContentObserver;", "", "selfChange", "Ll83/a0;", "onChange", "(Z)V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C8835j extends ContentObserver {
        public C8835j(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange) {
            HomeFragment.this.m21878z1();
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$j0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8836j0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26522w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26523x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26524y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8836j0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26522w = componentCallbacks;
            this.f26523x = interfaceC35951a;
            this.f26524y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gl1.b, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C15967b invoke() {
            ComponentCallbacks componentCallbacks = this.f26522w;
            InterfaceC35951a interfaceC35951a = this.f26523x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26524y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C15967b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$k */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.view.HomeFragment", m100430f = "HomeFragment.kt", m100431l = {485}, m100432m = "requestLocationServicesToBeEnabled", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C8837k extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f26525w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f26526x;

        /* JADX INFO: renamed from: z */
        int f26528z;

        public C8837k(InterfaceC30057d<? super C8837k> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f26526x = obj;
            this.f26528z |= Integer.MIN_VALUE;
            return HomeFragment.this.m21875y2(null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$k0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8838k0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26529w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26530x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26531y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8838k0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26529w = componentCallbacks;
            this.f26530x = interfaceC35951a;
            this.f26531y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gl1.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C15966a invoke() {
            ComponentCallbacks componentCallbacks = this.f26529w;
            InterfaceC35951a interfaceC35951a = this.f26530x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26531y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C15966a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$l */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.view.HomeFragment$requestPushNotificationPermissionsIfNotAlreadyGranted$1", m100430f = "HomeFragment.kt", m100431l = {607, 608}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8839l extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f26532w;

        public C8839l(InterfaceC30057d<? super C8839l> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HomeFragment.this.new C8839l(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C8839l) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        
            if (r5.mo73348x(true, r4) == r0) goto L17;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r4.f26532w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r5)
                goto L45
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                p505ts.AbstractC34132o.m107864I(r5)
                goto L2e
            L1c:
                p505ts.AbstractC34132o.m107864I(r5)
                com.whoop.home.view.HomeFragment r5 = com.whoop.home.view.HomeFragment.this
                m32.f r5 = com.whoop.home.view.HomeFragment.m21710A0(r5)
                r4.f26532w = r3
                java.lang.Object r5 = r5.m73363b(r4)
                if (r5 != r0) goto L2e
                goto L44
            L2e:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L45
                com.whoop.home.view.HomeFragment r5 = com.whoop.home.view.HomeFragment.this
                m32.c r5 = com.whoop.home.view.HomeFragment.m21714B0(r5)
                r4.f26532w = r2
                java.lang.Object r5 = r5.mo73348x(r3, r4)
                if (r5 != r0) goto L45
            L44:
                return r0
            L45:
                l83.a0 r5 = l83.C23454a0.f92919a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.home.view.HomeFragment.C8839l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$l0 */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8840l0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f26534w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8840l0(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f26534w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.f26534w.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity()");
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity2 = this.f26534w.requireActivity();
            C1579e2 viewModelStore = abstractActivityC1340r0RequireActivity.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, abstractActivityC1340r0RequireActivity2);
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$m */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.view.HomeFragment$resumeActiveTrackActivitySessionIfNeeded$1", m100430f = "HomeFragment.kt", m100431l = {599}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8841m extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f26535w;

        public C8841m(InterfaceC30057d<? super C8841m> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HomeFragment.this.new C8841m(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C8841m) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f26535w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C38099e c38099eM21787V0 = HomeFragment.this.m21787V0();
                this.f26535w = 1;
                obj = c38099eM21787V0.m122071a(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            C9598e c9598e = (C9598e) obj;
            if (c9598e != null) {
                HomeFragment.this.m21814e1().m33776j(new AbstractC12177a.s(c9598e, null, false, 6, null));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$m0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8842m0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f26537w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26538x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26539y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f26540z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8842m0(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f26537w = abstractComponentCallbacksC1320m0;
            this.f26538x = interfaceC35951a;
            this.f26539y = interfaceC4339a;
            this.f26540z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, em1.u] */
        @Override // c93.InterfaceC4339a
        public final C13347u invoke() {
            return AbstractC37056f.m118952D(this.f26537w, this.f26538x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C13347u.class), this.f26539y, this.f26540z);
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$n */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.view.HomeFragment$sendTransitionFromDayZeroToDayOneEvent$1", m100430f = "HomeFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8843n extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f26541w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f26543y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8843n(int i13, InterfaceC30057d<? super C8843n> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f26543y = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HomeFragment.this.new C8843n(this.f26543y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C8843n) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f26541w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            HomeFragment.this.m21862u1().m37566p0(new AbstractC13329c.b(true));
            HomeFragment.this.m21862u1().m37566p0(new AbstractC13329c.a(this.f26543y));
            HomeFragment.this.m21790W0().m45095x();
            HomeFragment.this.m21756L2(true);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$n0 */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8844n0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f26544w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8844n0(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f26544w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.f26544w.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity()");
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity2 = this.f26544w.requireActivity();
            C1579e2 viewModelStore = abstractActivityC1340r0RequireActivity.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, abstractActivityC1340r0RequireActivity2);
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$o */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.view.HomeFragment$showInAppReview$1", m100430f = "HomeFragment.kt", m100431l = {858, 862, 864}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8845o extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f26545w;

        /* JADX INFO: renamed from: x */
        int f26546x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f26547y;

        public C8845o(InterfaceC30057d<? super C8845o> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C8845o c8845o = HomeFragment.this.new C8845o(interfaceC30057d);
            c8845o.f26547y = obj;
            return c8845o;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C8845o) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x006d A[Catch: Exception -> 0x001f, ReviewException -> 0x0022, TryCatch #2 {ReviewException -> 0x0022, Exception -> 0x001f, blocks: (B:8:0x001a, B:31:0x0098, B:17:0x0031, B:26:0x0067, B:28:0x006d, B:32:0x00a4, B:23:0x0049), top: B:38:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:32:0x00a4 A[Catch: Exception -> 0x001f, ReviewException -> 0x0022, TRY_LEAVE, TryCatch #2 {ReviewException -> 0x0022, Exception -> 0x001f, blocks: (B:8:0x001a, B:31:0x0098, B:17:0x0031, B:26:0x0067, B:28:0x006d, B:32:0x00a4, B:23:0x0049), top: B:38:0x000e }] */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
        
            if (com.squareup.wire.AbstractC5583n.m16789o(r11, r10) == r2) goto L30;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:32:0x00a4, please report this as an issue */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 237
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.home.view.HomeFragment.C8845o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$o0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8846o0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f26549w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26550x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26551y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f26552z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8846o0(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f26549w = abstractComponentCallbacksC1320m0;
            this.f26550x = interfaceC35951a;
            this.f26551y = interfaceC4339a;
            this.f26552z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, em1.a0] */
        @Override // c93.InterfaceC4339a
        public final C13326a0 invoke() {
            return AbstractC37056f.m118952D(this.f26549w, this.f26550x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C13326a0.class), this.f26551y, this.f26552z);
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$p */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8847p extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26553w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26554x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26555y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8847p(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26553w = componentCallbacks;
            this.f26554x = interfaceC35951a;
            this.f26555y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gl1.e, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C15970e invoke() {
            ComponentCallbacks componentCallbacks = this.f26553w;
            InterfaceC35951a interfaceC35951a = this.f26554x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26555y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C15970e.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$p0 */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8848p0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26556w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8848p0(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f26556w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f26556w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$q */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8849q extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26557w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26558x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26559y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8849q(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26557w = componentCallbacks;
            this.f26558x = interfaceC35951a;
            this.f26559y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f26557w;
            InterfaceC35951a interfaceC35951a = this.f26558x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26559y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$q0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8850q0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26560w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26561x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26562y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f26563z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8850q0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f26560w = componentCallbacks;
            this.f26561x = interfaceC35951a;
            this.f26562y = interfaceC4339a;
            this.f26563z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, b03.f] */
        @Override // c93.InterfaceC4339a
        public final C2209f invoke() {
            return AbstractC34132o.m107857B(this.f26560w, this.f26561x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C2209f.class), this.f26562y, this.f26563z);
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$r */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8851r extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26564w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26565x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26566y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8851r(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26564w = componentCallbacks;
            this.f26565x = interfaceC35951a;
            this.f26566y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [im1.c0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C18662c0 invoke() {
            ComponentCallbacks componentCallbacks = this.f26564w;
            InterfaceC35951a interfaceC35951a = this.f26565x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26566y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C18662c0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$s */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8852s extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26567w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26568x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26569y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8852s(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26567w = componentCallbacks;
            this.f26568x = interfaceC35951a;
            this.f26569y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.b1, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C21133b1 invoke() {
            ComponentCallbacks componentCallbacks = this.f26567w;
            InterfaceC35951a interfaceC35951a = this.f26568x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26569y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21133b1.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$t */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8853t extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26570w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26571x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26572y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8853t(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26570w = componentCallbacks;
            this.f26571x = interfaceC35951a;
            this.f26572y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, u92.d] */
        @Override // c93.InterfaceC4339a
        public final C34660d invoke() {
            ComponentCallbacks componentCallbacks = this.f26570w;
            InterfaceC35951a interfaceC35951a = this.f26571x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26572y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34660d.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$u */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8854u extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26573w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26574x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26575y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8854u(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26573w = componentCallbacks;
            this.f26574x = interfaceC35951a;
            this.f26575y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, u92.d] */
        @Override // c93.InterfaceC4339a
        public final C34660d invoke() {
            ComponentCallbacks componentCallbacks = this.f26573w;
            InterfaceC35951a interfaceC35951a = this.f26574x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26575y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34660d.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$v */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8855v extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26576w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26577x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26578y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8855v(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26576w = componentCallbacks;
            this.f26577x = interfaceC35951a;
            this.f26578y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f26576w;
            InterfaceC35951a interfaceC35951a = this.f26577x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26578y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$w */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8856w extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26579w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26580x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26581y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8856w(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26579w = componentCallbacks;
            this.f26580x = interfaceC35951a;
            this.f26581y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.y0] */
        @Override // c93.InterfaceC4339a
        public final C28217y0 invoke() {
            ComponentCallbacks componentCallbacks = this.f26579w;
            InterfaceC35951a interfaceC35951a = this.f26580x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26581y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28217y0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$x */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8857x extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26582w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26583x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26584y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8857x(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26582w = componentCallbacks;
            this.f26583x = interfaceC35951a;
            this.f26584y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, m32.c] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC25007c invoke() {
            ComponentCallbacks componentCallbacks = this.f26582w;
            InterfaceC35951a interfaceC35951a = this.f26583x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26584y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC25007c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$y */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8858y extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26585w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26586x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26587y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8858y(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26585w = componentCallbacks;
            this.f26586x = interfaceC35951a;
            this.f26587y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, m32.f] */
        @Override // c93.InterfaceC4339a
        public final C25010f invoke() {
            ComponentCallbacks componentCallbacks = this.f26585w;
            InterfaceC35951a interfaceC35951a = this.f26586x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26587y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25010f.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.home.view.HomeFragment$z */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8859z extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26588w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26589x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26590y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8859z(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26588w = componentCallbacks;
            this.f26589x = interfaceC35951a;
            this.f26590y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [dm1.b, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C12178b invoke() {
            ComponentCallbacks componentCallbacks = this.f26588w;
            InterfaceC35951a interfaceC35951a = this.f26589x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26590y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C12178b.class), interfaceC35951a);
        }
    }

    public HomeFragment() {
        C18688p c18688p = new C18688p(this, 6);
        C8840l0 c8840l0 = new C8840l0(this);
        EnumC23463i enumC23463i = EnumC23463i.f92935y;
        this.viewModel = AbstractC30060g.m92087G(enumC23463i, new C8842m0(this, null, c8840l0, c18688p));
        this.tiltEntryButtonViewModel = AbstractC30060g.m92087G(enumC23463i, new C8846o0(this, null, new C8844n0(this), null));
        this.statusViewModel = AbstractC30060g.m92087G(enumC23463i, new C8850q0(this, null, new C8848p0(this), null));
        C18688p c18688p2 = new C18688p(this, 7);
        EnumC23463i enumC23463i2 = EnumC23463i.f92933w;
        this.homeScreenNavigationRouter = AbstractC30060g.m92087G(enumC23463i2, new C8859z(this, null, c18688p2));
        this.activeSessionNavigationResolver = AbstractC30060g.m92087G(enumC23463i2, new C8824d0(this, null, null));
        this.rotationDetector = AbstractC30060g.m92087G(enumC23463i2, new C8826e0(this, null, new C18688p(this, 8)));
        this.tiltEntryRotationMonitor = AbstractC30060g.m92087G(enumC23463i2, new C8828f0(this, null, new C18688p(this, 9)));
        this.tiltOrientationPolicy = AbstractC30060g.m92087G(enumC23463i2, new C8830g0(this, null, null));
        this.orientationLockChecker = AbstractC30060g.m92087G(enumC23463i2, new C8832h0(this, null, null));
        this.whoopSplashState = AbstractC30060g.m92087G(enumC23463i2, new C8834i0(this, null, null));
        this.logger = InterfaceC34116n.INSTANCE.m107848a("HomeRedesignFragment");
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i2, new C8836j0(this, null, null));
        this.autoPopTracker = AbstractC30060g.m92087G(enumC23463i2, new C8838k0(this, null, null));
        this.streaksAnalyticsHelper = AbstractC30060g.m92087G(enumC23463i2, new C8847p(this, null, null));
        this.featureFlagChecker = AbstractC30060g.m92087G(enumC23463i2, new C8849q(this, null, null));
        this.homeItemActionRouter = AbstractC30060g.m92087G(enumC23463i2, new C8851r(this, null, null));
        this.sourceId = AbstractC30060g.m92088H(new C18688p(this, 10));
        this.destinationPillar = AbstractC30060g.m92088H(new C18688p(this, 11));
        this.yirCoordinator = AbstractC30060g.m92087G(enumC23463i2, new C8852s(this, null, null));
        this.sharedPrefs = AbstractC30060g.m92087G(enumC23463i2, new C8853t(this, new C35953c("mainPrefs"), null));
        this.strainCoachPrefs = AbstractC30060g.m92087G(enumC23463i2, new C8854u(this, new C35953c("strainCoachPrefs"), null));
        this.navigator = AbstractC30060g.m92087G(enumC23463i2, new C8855v(this, null, new C18688p(this, 12)));
        this.locationServicesHelper = AbstractC30060g.m92087G(enumC23463i2, new C8856w(this, null, new C18688p(this, 0)));
        this.fwUpdatePermissionHelper = AbstractC30060g.m92087G(enumC23463i2, new C8857x(this, new C35953c("firmware-update-permission-helper"), new C18688p(this, 1)));
        this.pushNotificationPermissionRequestValidator = AbstractC30060g.m92087G(enumC23463i2, new C8858y(this, null, null));
        this.bffBottomNavTabEventPublisher = AbstractC30060g.m92087G(enumC23463i2, new C8818a0(this, null, null));
        this.pushNotificationsPermissionHelper = AbstractC30060g.m92087G(enumC23463i2, new C8820b0(this, new C35953c("push-notification-permission-helper"), new C18688p(this, 2)));
        this.reviewManager = AbstractC30060g.m92087G(enumC23463i2, new C8822c0(this, null, null));
        this.callBack = new C8819b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A1 */
    public static final C34911a m21711A1(HomeFragment homeFragment) {
        return AbstractC15751g.m44431K(homeFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public static final C23454a0 m21712A2() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B1 */
    private final boolean m21715B1(C14602f pillarContent) {
        List<C14597a> listM41787a;
        C9598e c9598eM12044e;
        if (pillarContent != null && (listM41787a = pillarContent.m41787a()) != null) {
            List<C14597a> list = listM41787a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    InterfaceC25312u interfaceC25312uM41765b = ((C14597a) it.next()).getItemViewState();
                    AppScreen screen = null;
                    C3989a4 c3989a4 = interfaceC25312uM41765b instanceof C3989a4 ? (C3989a4) interfaceC25312uM41765b : null;
                    if (c3989a4 != null && (c9598eM12044e = c3989a4.getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String()) != null) {
                        screen = c9598eM12044e.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String();
                    }
                    if (AbstractC22676k.m65745e(screen, AppScreen.C9379o3.f27824w)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public static final C23454a0 m21716B2() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C1 */
    private final boolean m21719C1() {
        try {
            C12977n0 c12977n0M36394i = AbstractC5583n.m16799z(this).m36394i();
            if (c12977n0M36394i == null) {
                return false;
            }
            return ((c12977n0M36394i instanceof C17071g) && ((C17071g) c12977n0M36394i).m48197p().equals(HomeFragment.class.getName())) ? false : true;
        } catch (IllegalStateException e5) {
            this.logger.mo85218i("isNonHomeDestinationTopmost: NavController unavailable", e5, new AbstractC30556a.a[0]);
            return false;
        }
    }

    /* JADX INFO: renamed from: C2 */
    private final void m21720C2() {
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(viewLifecycleOwner), null, null, new C8839l(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D1 */
    public final boolean m21723D1() {
        try {
            C12977n0 c12977n0M36394i = AbstractC5583n.m16799z(this).m36394i();
            return (c12977n0M36394i instanceof C17071g) && ((C17071g) c12977n0M36394i).m48197p().equals("com.whoop.tiltgraph.view.TiltGraphFragment");
        } catch (IllegalStateException e5) {
            this.logger.mo85218i("isTiltGraphVisible: NavController unavailable", e5, new AbstractC30556a.a[0]);
            return false;
        }
    }

    /* JADX INFO: renamed from: D2 */
    private final void m21724D2() {
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C8841m(null), 3);
    }

    /* JADX INFO: renamed from: E1 */
    private final void m21727E1(final String expectedIdentifier, final InterfaceC4339a onDismiss) {
        getParentFragmentManager().m4170g0("achievement_celebration_dismissed", getViewLifecycleOwner(), new InterfaceC1357w1() { // from class: im1.b0
            @Override // androidx.fragment.app.InterfaceC1357w1
            /* JADX INFO: renamed from: a */
            public final void mo4108a(Bundle bundle, String str) {
                HomeFragment.m21731F1(this.f73217a, expectedIdentifier, onDismiss, str, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E2 */
    public static final C34911a m21728E2(HomeFragment homeFragment) {
        return AbstractC15751g.m44431K(homeFragment.requireContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F1 */
    public static final void m21731F1(HomeFragment homeFragment, String str, InterfaceC4339a interfaceC4339a, String str2, Bundle bundle) {
        AbstractC22676k.m65750j(str2, "<unused var>");
        AbstractC22676k.m65750j(bundle, "bundle");
        String string = bundle.getString("achievementType");
        homeFragment.logger.mo85228t(AbstractC31061c.m95640p("listenForAchievementDismiss: Result received, dismissedId=", string, ", expectedId=", str), new AbstractC30556a.a[0]);
        if (AbstractC22676k.m65745e(string, str)) {
            interfaceC4339a.invoke();
        }
    }

    /* JADX INFO: renamed from: F2 */
    private final void m21732F2(AbstractC12177a event, AppScreen screen, String autoPopId) {
        boolean zM21719C1 = m21719C1();
        if (m21736G2(event)) {
            m21793X0().m45045b(screen, autoPopId, zM21719C1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G1 */
    public static final C34911a m21735G1(HomeFragment homeFragment) {
        return AbstractC15751g.m44431K(homeFragment.requireActivity(), homeFragment.logger);
    }

    /* JADX INFO: renamed from: G2 */
    private final boolean m21736G2(AbstractC12177a event) {
        return m21814e1().m33776j(event);
    }

    /* JADX INFO: renamed from: H1 */
    private final void m21739H1() {
        if (m21835l1().m109533j(SharedPreferenceConstants.STRENGTH_BUILDER_SAVED_STATE) != null && m21805b1().isFeatureEnabled(FeatureFlagRepositoryKt.AUTO_RESUME_TO_ST_WORKOUT)) {
            getNavigator().mo59393b(new AbstractC21155m0.y4(null, null, false, null, null, null, 63, null));
            return;
        }
        if (m21844o1().m109526c(SharedPreferenceConstants.IS_USING_STRAIN_COACH_IN_REAL_TIME) && m21844o1().m109528e(SharedPreferenceConstants.IS_USING_STRAIN_COACH_IN_REAL_TIME, false) && m21805b1().isFeatureEnabled(FeatureFlagRepositoryKt.AUTO_RESUME_TO_STRAIN_COACH_WORKOUT)) {
            getNavigator().mo59393b(new AbstractC21155m0.t4(null, null, null, 7, null));
        }
    }

    /* JADX INFO: renamed from: H2 */
    private final void m21740H2(int featureId) {
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C8843n(featureId, null), 3);
    }

    /* JADX INFO: renamed from: I1 */
    private final void m21743I1(String source) {
        if (m21723D1()) {
            return;
        }
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(viewLifecycleOwner), null, null, new C8823d(source, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I2 */
    public final void m21744I2() {
        this.logger.mo85216g("Request InAppReview", new AbstractC30556a.a[0]);
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C8845o(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J1 */
    public static final C34911a m21747J1(HomeFragment homeFragment) {
        return AbstractC15751g.m44431K(homeFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J2 */
    public static final String m21748J2(HomeFragment homeFragment) {
        Bundle arguments = homeFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("sourceId");
        }
        return null;
    }

    /* JADX INFO: renamed from: K1 */
    private final void m21751K1() {
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(viewLifecycleOwner), null, null, new C8825e(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K2 */
    public static final C34911a m21752K2(HomeFragment homeFragment) {
        return AbstractC15751g.m44431K(homeFragment.requireContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L1 */
    public static final void m21755L1(HomeFragment homeFragment, C21062a result) {
        AbstractC22676k.m65750j(result, "result");
        if (result.f79915w == -1) {
            homeFragment.logger.mo85228t("CDM: enabled!", new AbstractC30556a.a[0]);
        } else {
            homeFragment.logger.mo85228t("CDM: cancelled!", new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L2 */
    public final void m21756L2(boolean isNavBarVisible) {
        getActivity();
        m21796Y0().m58980c(new InterfaceC21136d.a(!isNavBarVisible));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M1 */
    public static final void m21759M1(HomeFragment homeFragment, C21062a result) {
        AbstractC22676k.m65750j(result, "result");
        if (result.f79915w == -1) {
            homeFragment.m21862u1().m37566p0(AbstractC13333g.c.f46197a);
        }
    }

    /* JADX INFO: renamed from: M2 */
    private final void m21760M2() {
        ContentResolver contentResolver;
        ContentObserver contentObserver = this.orientationLockObserver;
        if (contentObserver != null) {
            Context context = getContext();
            if (context != null && (contentResolver = context.getContentResolver()) != null) {
                contentResolver.unregisterContentObserver(contentObserver);
            }
            this.orientationLockObserver = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N1 */
    public static final void m21763N1(HomeFragment homeFragment, String str, Bundle bundle) {
        AbstractC22676k.m65750j(str, "<unused var>");
        AbstractC22676k.m65750j(bundle, "<unused var>");
        homeFragment.m21862u1().m37566p0(AbstractC13349w.a.f46661a);
        homeFragment.m21862u1().m37566p0(C13350x.f46663a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N2 */
    public static final C34911a m21764N2(HomeFragment homeFragment) {
        return AbstractC15751g.m44431K(homeFragment.requireActivity().getSystemService(CompanionDeviceManager.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O1 */
    public static final C23454a0 m21767O1(final HomeFragment homeFragment, final float f13, final LocaleList localeList, Composer composer, int i13) {
        Object obj;
        final EnumC14603g enumC14603gM41789c;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        final EnumC14603g enumC14603g;
        int iOrdinal;
        Object obj6;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            final InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(homeFragment.m21862u1().getViewState(), new C13348v(false, false, null, false, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, 16777215, null), null, c28655q, 0, 2);
            InterfaceC13058l viewState = homeFragment.m21841n1().getViewState();
            C3815c c3815c = new C3815c(false, null, false ? 1 : 0, 7, false ? 1 : 0);
            int i14 = C3815c.f15649d << 3;
            final InterfaceC28601c1 interfaceC28601c1M87260n2 = AbstractC28683x.m87260n(viewState, c3815c, null, c28655q, i14, 2);
            AbstractC37356b abstractC37356bM37591r = m21770P1(interfaceC28601c1M87260n).getShowInAppReviewPrompt();
            boolean zM87153g = c28655q.m87153g(interfaceC28601c1M87260n) | c28655q.m87157i(homeFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                obj = objM87133R;
                C8827f c8827f = homeFragment.new C8827f(interfaceC28601c1M87260n, null);
                c28655q.m87172p0(c8827f);
                obj = c8827f;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) obj, abstractC37356bM37591r);
            Object objM87133R2 = c28655q.m87133R();
            Object obj7 = objM87133R2;
            if (objM87133R2 == c28676v0) {
                InterfaceC2994c0 interfaceC2994c0M87262p = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(interfaceC2994c0M87262p);
                obj7 = interfaceC2994c0M87262p;
            }
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj7;
            Object[] objArr = new Object[0];
            Object objM87133R3 = c28655q.m87133R();
            Object obj8 = objM87133R3;
            if (objM87133R3 == c28676v0) {
                C15621b c15621b = new C15621b(24);
                c28655q.m87172p0(c15621b);
                obj8 = c15621b;
            }
            final InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr, (InterfaceC4339a) obj8, c28655q, 48);
            InterfaceC28601c1 interfaceC28601c1M87261o = AbstractC28683x.m87261o(homeFragment.m21850q1().getVisible(), c28655q, 0);
            Configuration configuration = (Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a);
            Integer numValueOf = Integer.valueOf(configuration.orientation);
            boolean zM87157i = c28655q.m87157i(homeFragment) | c28655q.m87157i(configuration);
            Object objM87133R4 = c28655q.m87133R();
            Object obj9 = objM87133R4;
            if (zM87157i || objM87133R4 == c28676v0) {
                C8829g c8829g = homeFragment.new C8829g(configuration, null);
                c28655q.m87172p0(c8829g);
                obj9 = c8829g;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) obj9, numValueOf);
            Object objM87133R5 = c28655q.m87133R();
            Object objM32005x = objM87133R5;
            if (objM87133R5 == c28676v0) {
                objM32005x = AbstractC11895b.m32005x(0, c28655q);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM32005x;
            C14599c c14599cM37585l = m21770P1(interfaceC28601c1M87260n).getHomeFeed();
            if (c14599cM37585l != null) {
                enumC14603gM41789c = m21770P1(interfaceC28601c1M87260n).getCurrentPageIndex() < c14599cM37585l.m41769b().size() ? c14599cM37585l.m41769b().get(m21770P1(interfaceC28601c1M87260n).getCurrentPageIndex()).getPillarType() : EnumC14603g.OVERVIEW;
            } else {
                enumC14603gM41789c = null;
            }
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
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
            C13348v c13348vM21770P1 = m21770P1(interfaceC28601c1M87260n);
            C3815c c3815cM21773Q1 = m21773Q1(interfaceC28601c1M87260n2);
            boolean zM87157i2 = c28655q.m87157i(homeFragment) | c28655q.m87149e(enumC14603gM41789c == null ? -1 : enumC14603gM41789c.ordinal());
            Object objM87133R6 = c28655q.m87133R();
            Object obj10 = objM87133R6;
            if (zM87157i2 || objM87133R6 == c28676v0) {
                final int i15 = 0;
                InterfaceC4339a interfaceC4339a = new InterfaceC4339a(homeFragment) { // from class: im1.w

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ HomeFragment f73425x;

                    {
                        this.f73425x = homeFragment;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                return HomeFragment.m21776R1(this.f73425x, enumC14603gM41789c);
                            default:
                                return HomeFragment.m21842n2(this.f73425x, enumC14603gM41789c);
                        }
                    }
                };
                c28655q.m87172p0(interfaceC4339a);
                obj10 = interfaceC4339a;
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) obj10;
            boolean zM87153g2 = c28655q.m87153g(interfaceC28601c1M87260n) | c28655q.m87157i(homeFragment);
            Object objM87133R7 = c28655q.m87133R();
            Object obj11 = objM87133R7;
            if (zM87153g2 || objM87133R7 == c28676v0) {
                final int i16 = 0;
                InterfaceC4339a interfaceC4339a3 = new InterfaceC4339a(homeFragment) { // from class: im1.x

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ HomeFragment f73445x;

                    {
                        this.f73445x = homeFragment;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                return HomeFragment.m21779S1(this.f73445x, interfaceC28601c1M87260n);
                            case 1:
                                return HomeFragment.m21815e2(this.f73445x, interfaceC28601c1M87260n);
                            default:
                                return HomeFragment.m21833k2(this.f73445x, interfaceC28601c1M87260n);
                        }
                    }
                };
                c28655q.m87172p0(interfaceC4339a3);
                obj11 = interfaceC4339a3;
            }
            InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) obj11;
            boolean zM87157i3 = c28655q.m87157i(homeFragment) | c28655q.m87153g(interfaceC28601c1M87260n);
            Object objM87133R8 = c28655q.m87133R();
            Object obj12 = objM87133R8;
            if (zM87157i3 || objM87133R8 == c28676v0) {
                final int i17 = 1;
                InterfaceC4339a interfaceC4339a5 = new InterfaceC4339a(homeFragment) { // from class: im1.x

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ HomeFragment f73445x;

                    {
                        this.f73445x = homeFragment;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i17) {
                            case 0:
                                return HomeFragment.m21779S1(this.f73445x, interfaceC28601c1M87260n);
                            case 1:
                                return HomeFragment.m21815e2(this.f73445x, interfaceC28601c1M87260n);
                            default:
                                return HomeFragment.m21833k2(this.f73445x, interfaceC28601c1M87260n);
                        }
                    }
                };
                c28655q.m87172p0(interfaceC4339a5);
                obj12 = interfaceC4339a5;
            }
            InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) obj12;
            boolean zM87157i4 = c28655q.m87157i(homeFragment) | c28655q.m87153g(interfaceC28601c1M87260n);
            Object objM87133R9 = c28655q.m87133R();
            if (zM87157i4 || objM87133R9 == c28676v0) {
                final int i18 = 2;
                InterfaceC4339a interfaceC4339a7 = new InterfaceC4339a(homeFragment) { // from class: im1.x

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ HomeFragment f73445x;

                    {
                        this.f73445x = homeFragment;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i18) {
                            case 0:
                                return HomeFragment.m21779S1(this.f73445x, interfaceC28601c1M87260n);
                            case 1:
                                return HomeFragment.m21815e2(this.f73445x, interfaceC28601c1M87260n);
                            default:
                                return HomeFragment.m21833k2(this.f73445x, interfaceC28601c1M87260n);
                        }
                    }
                };
                c28655q.m87172p0(interfaceC4339a7);
                obj2 = interfaceC4339a7;
            } else {
                obj2 = objM87133R9;
            }
            InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) obj2;
            boolean zM87157i5 = c28655q.m87157i(homeFragment) | c28655q.m87149e(enumC14603gM41789c == null ? -1 : enumC14603gM41789c.ordinal());
            Object objM87133R10 = c28655q.m87133R();
            if (zM87157i5 || objM87133R10 == c28676v0) {
                final int i19 = 0;
                Function1 function1 = new Function1(homeFragment) { // from class: im1.y

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ HomeFragment f73459x;

                    {
                        this.f73459x = homeFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj13) {
                        switch (i19) {
                            case 0:
                                return HomeFragment.m21836l2(this.f73459x, enumC14603gM41789c, (C22325e) obj13);
                            default:
                                return HomeFragment.m21845o2(this.f73459x, enumC14603gM41789c, (C2281h) obj13);
                        }
                    }
                };
                c28655q.m87172p0(function1);
                obj3 = function1;
            } else {
                obj3 = objM87133R10;
            }
            Function1 function2 = (Function1) obj3;
            boolean zM87157i6 = c28655q.m87157i(homeFragment) | c28655q.m87149e(enumC14603gM41789c == null ? -1 : enumC14603gM41789c.ordinal());
            Object objM87133R11 = c28655q.m87133R();
            if (zM87157i6 || objM87133R11 == c28676v0) {
                C0467z0 c0467z0 = new C0467z0(homeFragment, enumC14603gM41789c, interfaceC28601c2, 4);
                c28655q.m87172p0(c0467z0);
                obj4 = c0467z0;
            } else {
                obj4 = objM87133R11;
            }
            Function1 function3 = (Function1) obj4;
            boolean zM87157i7 = c28655q.m87157i(homeFragment) | c28655q.m87149e(enumC14603gM41789c == null ? -1 : enumC14603gM41789c.ordinal());
            Object objM87133R12 = c28655q.m87133R();
            Object obj13 = objM87133R12;
            if (zM87157i7 || objM87133R12 == c28676v0) {
                final int i24 = 1;
                InterfaceC4339a interfaceC4339a9 = new InterfaceC4339a(homeFragment) { // from class: im1.w

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ HomeFragment f73425x;

                    {
                        this.f73425x = homeFragment;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i24) {
                            case 0:
                                return HomeFragment.m21776R1(this.f73425x, enumC14603gM41789c);
                            default:
                                return HomeFragment.m21842n2(this.f73425x, enumC14603gM41789c);
                        }
                    }
                };
                c28655q.m87172p0(interfaceC4339a9);
                obj13 = interfaceC4339a9;
            }
            InterfaceC4339a interfaceC4339a10 = (InterfaceC4339a) obj13;
            boolean zM87157i8 = c28655q.m87157i(homeFragment) | c28655q.m87149e(enumC14603gM41789c == null ? -1 : enumC14603gM41789c.ordinal());
            Object objM87133R13 = c28655q.m87133R();
            Object obj14 = objM87133R13;
            if (zM87157i8 || objM87133R13 == c28676v0) {
                final int i25 = 1;
                Function1 function4 = new Function1(homeFragment) { // from class: im1.y

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ HomeFragment f73459x;

                    {
                        this.f73459x = homeFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj15) {
                        switch (i25) {
                            case 0:
                                return HomeFragment.m21836l2(this.f73459x, enumC14603gM41789c, (C22325e) obj15);
                            default:
                                return HomeFragment.m21845o2(this.f73459x, enumC14603gM41789c, (C2281h) obj15);
                        }
                    }
                };
                c28655q.m87172p0(function4);
                obj14 = function4;
            }
            Function1 function5 = (Function1) obj14;
            boolean zM87157i9 = c28655q.m87157i(homeFragment) | c28655q.m87149e(enumC14603gM41789c == null ? -1 : enumC14603gM41789c.ordinal()) | c28655q.m87153g(interfaceC28601c1M87260n) | c28655q.m87153g(interfaceC28601c1);
            Object objM87133R14 = c28655q.m87133R();
            if (zM87157i9 || objM87133R14 == c28676v0) {
                enumC14603g = enumC14603gM41789c;
                final int i26 = 1;
                obj5 = new Function1(homeFragment) { // from class: im1.s

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ HomeFragment f73369x;

                    {
                        this.f73369x = homeFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj15) {
                        switch (i26) {
                            case 0:
                                return HomeFragment.m21854r2(this.f73369x, enumC14603g, interfaceC28601c1, interfaceC28601c1M87260n, ((Boolean) obj15).booleanValue());
                            default:
                                return HomeFragment.m21848p2(this.f73369x, enumC14603g, interfaceC28601c1, interfaceC28601c1M87260n, (EnumC22400l) obj15);
                        }
                    }
                };
                c28655q.m87172p0(obj5);
            } else {
                obj5 = objM87133R14;
                enumC14603g = enumC14603gM41789c;
            }
            Function1 function6 = (Function1) obj5;
            boolean zM87153g3 = c28655q.m87153g(interfaceC28601c1M87260n) | c28655q.m87157i(homeFragment) | c28655q.m87149e(enumC14603g == null ? -1 : enumC14603g.ordinal()) | c28655q.m87153g(interfaceC28601c1);
            Object objM87133R15 = c28655q.m87133R();
            if (zM87153g3 || objM87133R15 == c28676v0) {
                final int i27 = 0;
                Function1 function7 = new Function1(homeFragment) { // from class: im1.s

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ HomeFragment f73369x;

                    {
                        this.f73369x = homeFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj15) {
                        switch (i27) {
                            case 0:
                                return HomeFragment.m21854r2(this.f73369x, enumC14603g, interfaceC28601c1, interfaceC28601c1M87260n, ((Boolean) obj15).booleanValue());
                            default:
                                return HomeFragment.m21848p2(this.f73369x, enumC14603g, interfaceC28601c1, interfaceC28601c1M87260n, (EnumC22400l) obj15);
                        }
                    }
                };
                iOrdinal = -1;
                c28655q.m87172p0(function7);
                objM87133R15 = function7;
            } else {
                iOrdinal = -1;
            }
            Function1 function8 = (Function1) objM87133R15;
            boolean zM87157i10 = c28655q.m87157i(homeFragment);
            Object objM87133R16 = c28655q.m87133R();
            Object obj15 = objM87133R16;
            if (zM87157i10 || objM87133R16 == c28676v0) {
                C18688p c18688p = new C18688p(homeFragment, 3);
                c28655q.m87172p0(c18688p);
                obj15 = c18688p;
            }
            InterfaceC4339a interfaceC4339a11 = (InterfaceC4339a) obj15;
            boolean zM87157i11 = c28655q.m87157i(homeFragment) | c28655q.m87153g(interfaceC28601c1M87260n);
            if (enumC14603g != null) {
                iOrdinal = enumC14603g.ordinal();
            }
            boolean zM87149e = zM87157i11 | c28655q.m87149e(iOrdinal) | c28655q.m87157i(r48);
            Object objM87133R17 = c28655q.m87133R();
            if (zM87149e || objM87133R17 == c28676v0) {
                C11328a c11328a = new C11328a(homeFragment, enumC14603g, interfaceC28601c1M87260n, interfaceC2994c0, 2);
                interfaceC28601c1M87260n = interfaceC28601c1M87260n;
                c28655q.m87172p0(c11328a);
                objM87133R17 = c11328a;
            }
            Function1 function9 = (Function1) objM87133R17;
            boolean zM87157i12 = c28655q.m87157i(homeFragment);
            Object objM87133R18 = c28655q.m87133R();
            Object obj16 = objM87133R18;
            if (zM87157i12 || objM87133R18 == c28676v0) {
                final int i28 = 0;
                Function1 function10 = new Function1(homeFragment) { // from class: im1.t

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ HomeFragment f73387x;

                    {
                        this.f73387x = homeFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj17) {
                        switch (i28) {
                            case 0:
                                return HomeFragment.m21791W1(this.f73387x, (AbstractC13341o) obj17);
                            case 1:
                                return HomeFragment.m21794X1(this.f73387x, (EnumC35066c) obj17);
                            case 2:
                                return HomeFragment.m21797Y1(this.f73387x, (EnumC35066c) obj17);
                            case 3:
                                return HomeFragment.m21800Z1(this.f73387x, (InterfaceC13346t) obj17);
                            case 4:
                                return HomeFragment.m21809c2(this.f73387x, (String) obj17);
                            case 5:
                                return HomeFragment.m21812d2(this.f73387x, obj17);
                            case 6:
                                return HomeFragment.m21824h2(this.f73387x, ((Boolean) obj17).booleanValue());
                            default:
                                return HomeFragment.m21827i2(this.f73387x, (C9598e) obj17);
                        }
                    }
                };
                c28655q.m87172p0(function10);
                obj16 = function10;
            }
            Function1 function11 = (Function1) obj16;
            boolean zM87157i13 = c28655q.m87157i(homeFragment);
            Object objM87133R19 = c28655q.m87133R();
            Object obj17 = objM87133R19;
            if (zM87157i13 || objM87133R19 == c28676v0) {
                final int i29 = 1;
                Function1 function12 = new Function1(homeFragment) { // from class: im1.t

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ HomeFragment f73387x;

                    {
                        this.f73387x = homeFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj18) {
                        switch (i29) {
                            case 0:
                                return HomeFragment.m21791W1(this.f73387x, (AbstractC13341o) obj18);
                            case 1:
                                return HomeFragment.m21794X1(this.f73387x, (EnumC35066c) obj18);
                            case 2:
                                return HomeFragment.m21797Y1(this.f73387x, (EnumC35066c) obj18);
                            case 3:
                                return HomeFragment.m21800Z1(this.f73387x, (InterfaceC13346t) obj18);
                            case 4:
                                return HomeFragment.m21809c2(this.f73387x, (String) obj18);
                            case 5:
                                return HomeFragment.m21812d2(this.f73387x, obj18);
                            case 6:
                                return HomeFragment.m21824h2(this.f73387x, ((Boolean) obj18).booleanValue());
                            default:
                                return HomeFragment.m21827i2(this.f73387x, (C9598e) obj18);
                        }
                    }
                };
                c28655q.m87172p0(function12);
                obj17 = function12;
            }
            Function1 function13 = (Function1) obj17;
            boolean zM87157i14 = c28655q.m87157i(homeFragment);
            Object objM87133R20 = c28655q.m87133R();
            Object obj18 = objM87133R20;
            if (zM87157i14 || objM87133R20 == c28676v0) {
                final int i34 = 2;
                Function1 function14 = new Function1(homeFragment) { // from class: im1.t

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ HomeFragment f73387x;

                    {
                        this.f73387x = homeFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj19) {
                        switch (i34) {
                            case 0:
                                return HomeFragment.m21791W1(this.f73387x, (AbstractC13341o) obj19);
                            case 1:
                                return HomeFragment.m21794X1(this.f73387x, (EnumC35066c) obj19);
                            case 2:
                                return HomeFragment.m21797Y1(this.f73387x, (EnumC35066c) obj19);
                            case 3:
                                return HomeFragment.m21800Z1(this.f73387x, (InterfaceC13346t) obj19);
                            case 4:
                                return HomeFragment.m21809c2(this.f73387x, (String) obj19);
                            case 5:
                                return HomeFragment.m21812d2(this.f73387x, obj19);
                            case 6:
                                return HomeFragment.m21824h2(this.f73387x, ((Boolean) obj19).booleanValue());
                            default:
                                return HomeFragment.m21827i2(this.f73387x, (C9598e) obj19);
                        }
                    }
                };
                c28655q.m87172p0(function14);
                obj18 = function14;
            }
            Function1 function15 = (Function1) obj18;
            boolean zM87157i15 = c28655q.m87157i(homeFragment);
            Object objM87133R21 = c28655q.m87133R();
            Object obj19 = objM87133R21;
            if (zM87157i15 || objM87133R21 == c28676v0) {
                final int i35 = 3;
                Function1 function16 = new Function1(homeFragment) { // from class: im1.t

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ HomeFragment f73387x;

                    {
                        this.f73387x = homeFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj110) {
                        switch (i35) {
                            case 0:
                                return HomeFragment.m21791W1(this.f73387x, (AbstractC13341o) obj110);
                            case 1:
                                return HomeFragment.m21794X1(this.f73387x, (EnumC35066c) obj110);
                            case 2:
                                return HomeFragment.m21797Y1(this.f73387x, (EnumC35066c) obj110);
                            case 3:
                                return HomeFragment.m21800Z1(this.f73387x, (InterfaceC13346t) obj110);
                            case 4:
                                return HomeFragment.m21809c2(this.f73387x, (String) obj110);
                            case 5:
                                return HomeFragment.m21812d2(this.f73387x, obj110);
                            case 6:
                                return HomeFragment.m21824h2(this.f73387x, ((Boolean) obj110).booleanValue());
                            default:
                                return HomeFragment.m21827i2(this.f73387x, (C9598e) obj110);
                        }
                    }
                };
                c28655q.m87172p0(function16);
                obj19 = function16;
            }
            Function1 function17 = (Function1) obj19;
            boolean zM87157i16 = c28655q.m87157i(homeFragment) | c28655q.m87153g(interfaceC28601c1M87260n) | c28655q.m87147d(f13) | c28655q.m87157i(localeList);
            Object objM87133R22 = c28655q.m87133R();
            Object obj20 = objM87133R22;
            if (zM87157i16 || objM87133R22 == c28676v0) {
                Function1 function18 = new Function1() { // from class: im1.u
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj21) {
                        return HomeFragment.m21803a2(this.f73413w, f13, localeList, interfaceC28601c1M87260n, (EnumC14603g) obj21);
                    }
                };
                c28655q.m87172p0(function18);
                obj20 = function18;
            }
            Function1 function19 = (Function1) obj20;
            boolean zM87157i17 = c28655q.m87157i(homeFragment) | c28655q.m87153g(interfaceC28601c1M87260n2);
            Object objM87133R23 = c28655q.m87133R();
            Object obj21 = objM87133R23;
            if (zM87157i17 || objM87133R23 == c28676v0) {
                final int i36 = 0;
                Function1 function20 = new Function1(homeFragment) { // from class: im1.v

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ HomeFragment f73420x;

                    {
                        this.f73420x = homeFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj22) {
                        switch (i36) {
                            case 0:
                                return HomeFragment.m21806b2(this.f73420x, interfaceC28601c1M87260n2, (String) obj22);
                            default:
                                return HomeFragment.m21818f2(this.f73420x, interfaceC28601c1M87260n2, ((Boolean) obj22).booleanValue());
                        }
                    }
                };
                c28655q.m87172p0(function20);
                obj21 = function20;
            }
            Function1 function21 = (Function1) obj21;
            boolean zM87157i18 = c28655q.m87157i(homeFragment);
            Object objM87133R24 = c28655q.m87133R();
            Object obj22 = objM87133R24;
            if (zM87157i18 || objM87133R24 == c28676v0) {
                final int i37 = 4;
                Function1 function22 = new Function1(homeFragment) { // from class: im1.t

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ HomeFragment f73387x;

                    {
                        this.f73387x = homeFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj110) {
                        switch (i37) {
                            case 0:
                                return HomeFragment.m21791W1(this.f73387x, (AbstractC13341o) obj110);
                            case 1:
                                return HomeFragment.m21794X1(this.f73387x, (EnumC35066c) obj110);
                            case 2:
                                return HomeFragment.m21797Y1(this.f73387x, (EnumC35066c) obj110);
                            case 3:
                                return HomeFragment.m21800Z1(this.f73387x, (InterfaceC13346t) obj110);
                            case 4:
                                return HomeFragment.m21809c2(this.f73387x, (String) obj110);
                            case 5:
                                return HomeFragment.m21812d2(this.f73387x, obj110);
                            case 6:
                                return HomeFragment.m21824h2(this.f73387x, ((Boolean) obj110).booleanValue());
                            default:
                                return HomeFragment.m21827i2(this.f73387x, (C9598e) obj110);
                        }
                    }
                };
                c28655q.m87172p0(function22);
                obj22 = function22;
            }
            Function1 function23 = (Function1) obj22;
            boolean zM87157i19 = c28655q.m87157i(homeFragment);
            Object objM87133R25 = c28655q.m87133R();
            Object obj23 = objM87133R25;
            if (zM87157i19 || objM87133R25 == c28676v0) {
                final int i38 = 5;
                Function1 function24 = new Function1(homeFragment) { // from class: im1.t

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ HomeFragment f73387x;

                    {
                        this.f73387x = homeFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj110) {
                        switch (i38) {
                            case 0:
                                return HomeFragment.m21791W1(this.f73387x, (AbstractC13341o) obj110);
                            case 1:
                                return HomeFragment.m21794X1(this.f73387x, (EnumC35066c) obj110);
                            case 2:
                                return HomeFragment.m21797Y1(this.f73387x, (EnumC35066c) obj110);
                            case 3:
                                return HomeFragment.m21800Z1(this.f73387x, (InterfaceC13346t) obj110);
                            case 4:
                                return HomeFragment.m21809c2(this.f73387x, (String) obj110);
                            case 5:
                                return HomeFragment.m21812d2(this.f73387x, obj110);
                            case 6:
                                return HomeFragment.m21824h2(this.f73387x, ((Boolean) obj110).booleanValue());
                            default:
                                return HomeFragment.m21827i2(this.f73387x, (C9598e) obj110);
                        }
                    }
                };
                c28655q.m87172p0(function24);
                obj23 = function24;
            }
            Function1 function25 = (Function1) obj23;
            boolean zM87157i20 = c28655q.m87157i(homeFragment) | c28655q.m87153g(interfaceC28601c1M87260n);
            Object objM87133R26 = c28655q.m87133R();
            Object obj24 = objM87133R26;
            if (zM87157i20 || objM87133R26 == c28676v0) {
                final int i39 = 1;
                Function1 function26 = new Function1(homeFragment) { // from class: im1.v

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ HomeFragment f73420x;

                    {
                        this.f73420x = homeFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj25) {
                        switch (i39) {
                            case 0:
                                return HomeFragment.m21806b2(this.f73420x, interfaceC28601c1M87260n, (String) obj25);
                            default:
                                return HomeFragment.m21818f2(this.f73420x, interfaceC28601c1M87260n, ((Boolean) obj25).booleanValue());
                        }
                    }
                };
                c28655q.m87172p0(function26);
                obj24 = function26;
            }
            Function1 function27 = (Function1) obj24;
            boolean zM87157i21 = c28655q.m87157i(homeFragment);
            Object objM87133R27 = c28655q.m87133R();
            Object obj25 = objM87133R27;
            if (zM87157i21 || objM87133R27 == c28676v0) {
                C18688p c18688p2 = new C18688p(homeFragment, 4);
                c28655q.m87172p0(c18688p2);
                obj25 = c18688p2;
            }
            InterfaceC4339a interfaceC4339a12 = (InterfaceC4339a) obj25;
            boolean zM87157i22 = c28655q.m87157i(homeFragment);
            Object objM87133R28 = c28655q.m87133R();
            Object obj26 = objM87133R28;
            if (zM87157i22 || objM87133R28 == c28676v0) {
                final int i44 = 6;
                Function1 function28 = new Function1(homeFragment) { // from class: im1.t

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ HomeFragment f73387x;

                    {
                        this.f73387x = homeFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj110) {
                        switch (i44) {
                            case 0:
                                return HomeFragment.m21791W1(this.f73387x, (AbstractC13341o) obj110);
                            case 1:
                                return HomeFragment.m21794X1(this.f73387x, (EnumC35066c) obj110);
                            case 2:
                                return HomeFragment.m21797Y1(this.f73387x, (EnumC35066c) obj110);
                            case 3:
                                return HomeFragment.m21800Z1(this.f73387x, (InterfaceC13346t) obj110);
                            case 4:
                                return HomeFragment.m21809c2(this.f73387x, (String) obj110);
                            case 5:
                                return HomeFragment.m21812d2(this.f73387x, obj110);
                            case 6:
                                return HomeFragment.m21824h2(this.f73387x, ((Boolean) obj110).booleanValue());
                            default:
                                return HomeFragment.m21827i2(this.f73387x, (C9598e) obj110);
                        }
                    }
                };
                c28655q.m87172p0(function28);
                obj26 = function28;
            }
            Function1 function29 = (Function1) obj26;
            boolean zM87157i23 = c28655q.m87157i(homeFragment);
            Object objM87133R29 = c28655q.m87133R();
            Object obj27 = objM87133R29;
            if (zM87157i23 || objM87133R29 == c28676v0) {
                final int i45 = 7;
                Function1 function30 = new Function1(homeFragment) { // from class: im1.t

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ HomeFragment f73387x;

                    {
                        this.f73387x = homeFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj110) {
                        switch (i45) {
                            case 0:
                                return HomeFragment.m21791W1(this.f73387x, (AbstractC13341o) obj110);
                            case 1:
                                return HomeFragment.m21794X1(this.f73387x, (EnumC35066c) obj110);
                            case 2:
                                return HomeFragment.m21797Y1(this.f73387x, (EnumC35066c) obj110);
                            case 3:
                                return HomeFragment.m21800Z1(this.f73387x, (InterfaceC13346t) obj110);
                            case 4:
                                return HomeFragment.m21809c2(this.f73387x, (String) obj110);
                            case 5:
                                return HomeFragment.m21812d2(this.f73387x, obj110);
                            case 6:
                                return HomeFragment.m21824h2(this.f73387x, ((Boolean) obj110).booleanValue());
                            default:
                                return HomeFragment.m21827i2(this.f73387x, (C9598e) obj110);
                        }
                    }
                };
                c28655q.m87172p0(function30);
                obj27 = function30;
            }
            AbstractC18697t0.m54381y0(c13348vM21770P1, c3815cM21773Q1, interfaceC4339a2, interfaceC4339a4, interfaceC4339a6, interfaceC4339a8, function2, function3, interfaceC4339a10, function5, function6, interfaceC28601c1, function8, interfaceC4339a11, function9, function11, function13, function15, function17, function19, function21, function23, function25, function27, interfaceC4339a12, function29, (Function1) obj27, c28655q, i14, 0, 0, 0);
            if (homeFragment.isTiltEntryEligible && m21860t2(interfaceC28601c1M87261o)) {
                c28655q.m87150e0(-2000764795);
                boolean zM87157i24 = c28655q.m87157i(homeFragment);
                Object objM87133R30 = c28655q.m87133R();
                if (zM87157i24 || objM87133R30 == c28676v0) {
                    obj6 = objM87133R30;
                    C18688p c18688p3 = new C18688p(homeFragment, 5);
                    c28655q.m87172p0(c18688p3);
                    obj6 = c18688p3;
                }
                Function0.m54147b((InterfaceC4339a) obj6, null, c28655q, 0, 2);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-2000478417);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P1 */
    public static final C13348v m21770P1(InterfaceC28670t2 interfaceC28670t2) {
        return (C13348v) interfaceC28670t2.getValue();
    }

    /* JADX INFO: renamed from: Q0 */
    private final void m21772Q0() {
        m21850q1().m37456v(new C18701v0(this, 2));
        m21850q1().m37451o(m21853r1());
        if (m21820g1().mo41843a()) {
            m21850q1().m37455u();
        }
    }

    /* JADX INFO: renamed from: Q1 */
    private static final C3815c m21773Q1(InterfaceC28670t2 interfaceC28670t2) {
        return (C3815c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public static final boolean m21775R0(HomeFragment homeFragment) {
        return homeFragment.m21723D1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R1 */
    public static final C23454a0 m21776R1(HomeFragment homeFragment, EnumC14603g enumC14603g) {
        homeFragment.m21736G2(new AbstractC12177a.t(enumC14603g));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final String m21778S0(HomeFragment homeFragment) {
        Bundle arguments = homeFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("destinationPillar");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S1 */
    public static final C23454a0 m21779S1(HomeFragment homeFragment, InterfaceC28670t2 interfaceC28670t2) {
        if (m21770P1(interfaceC28670t2).getToolbarViewState().getShowGiftIconNewIndicator()) {
            homeFragment.m21862u1().m37566p0(AbstractC13345s.a.f46242a);
        }
        C21173v0 c21173v0 = null;
        Object obj = null;
        boolean z4 = false;
        homeFragment.m21736G2(new AbstractC12177a.s(new C9598e(AppScreen.C9354l2.f27743w, new GiftHubScreenModel((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0)), c21173v0, 4, null), obj, z4, 6, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: T0 */
    private final void m21781T0() {
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(viewLifecycleOwner), null, null, new C8821c(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T1 */
    public static final C23454a0 m21782T1(HomeFragment homeFragment) {
        homeFragment.m21862u1().m37566p0(new AbstractC13340n.c(null, null, EnumC13344r.ERROR, 3, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final C34911a m21784U0(HomeFragment homeFragment) {
        return AbstractC15751g.m44431K(homeFragment.requireActivity().getActivityResultRegistry(), AbstractC37056f.m118958J("android.permission.ACCESS_COARSE_LOCATION"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U1 */
    public static final C23454a0 m21785U1(HomeFragment homeFragment, EnumC14603g enumC14603g, InterfaceC28670t2 interfaceC28670t2, InterfaceC2994c0 interfaceC2994c0, AbstractC18642s it) {
        AbstractC22676k.m65750j(it, "it");
        C18662c0 c18662c0M21811d1 = homeFragment.m21811d1();
        C13348v c13348vM21770P1 = m21770P1(interfaceC28670t2);
        if (enumC14603g == null) {
            enumC14603g = EnumC14603g.OVERVIEW;
        }
        InterfaceC13346t interfaceC13346tM54145b = c18662c0M21811d1.m54145b(it, c13348vM21770P1, enumC14603g, new C18708z(homeFragment, 1), homeFragment.m21814e1());
        if (interfaceC13346tM54145b != null && (interfaceC13346tM54145b instanceof AbstractC13333g.b)) {
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, homeFragment.new C8831h(interfaceC13346tM54145b, null), 3);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public final C38099e m21787V0() {
        return (C38099e) this.activeSessionNavigationResolver.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V1 */
    public static final C23454a0 m21788V1(HomeFragment homeFragment, InterfaceC13346t event) {
        AbstractC22676k.m65750j(event, "event");
        homeFragment.m21862u1().m37566p0(event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public final C15967b m21790W0() {
        return (C15967b) this.analyticsHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W1 */
    public static final C23454a0 m21791W1(HomeFragment homeFragment, AbstractC13341o it) {
        AbstractC22676k.m65750j(it, "it");
        homeFragment.m21790W0().m45093v(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: X0 */
    private final C15966a m21793X0() {
        return (C15966a) this.autoPopTracker.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X1 */
    public static final C23454a0 m21794X1(HomeFragment homeFragment, EnumC35066c it) {
        AbstractC22676k.m65750j(it, "it");
        homeFragment.m21802a1(it);
        homeFragment.m21862u1().m37566p0(it == EnumC35066c.LANGUAGE_MODAL ? AbstractC13337k.e.f46209a : AbstractC13337k.c.f46207a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Y0 */
    private final C21138e m21796Y0() {
        return (C21138e) this.bffBottomNavTabEventPublisher.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y1 */
    public static final C23454a0 m21797Y1(HomeFragment homeFragment, EnumC35066c it) {
        AbstractC22676k.m65750j(it, "it");
        if (it == EnumC35066c.PROCESS_FW) {
            homeFragment.m21862u1().m37566p0(AbstractC13333g.a.f46195a);
        } else {
            homeFragment.m21862u1().m37566p0(AbstractC13337k.c.f46207a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Z0 */
    private final String m21799Z0() {
        return (String) this.destinationPillar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1 */
    public static final C23454a0 m21800Z1(HomeFragment homeFragment, InterfaceC13346t it) {
        AbstractC22676k.m65750j(it, "it");
        homeFragment.m21862u1().m37566p0(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: a1 */
    private final void m21802a1(EnumC35066c type) {
        switch (C8817a.f26410a[type.ordinal()]) {
            case 1:
                m21862u1().m37566p0(new AbstractC13337k.b(this.callBack));
                return;
            case 2:
                m21736G2(AbstractC12177a.m.f40544a);
                return;
            case 3:
                m21736G2(AbstractC12177a.n.f40545a);
                return;
            case 4:
                m21736G2(AbstractC12177a.w.f40574a);
                return;
            case 5:
                m21862u1().m37566p0(AbstractC13337k.c.f46207a);
                return;
            case 6:
                m21862u1().m37566p0(AbstractC13333g.c.f46197a);
                return;
            case 7:
                m21862u1().m37566p0(AbstractC13337k.a.f46205a);
                return;
            default:
                throw new IllegalStateException("Cannot send dialog event for no dialog visible");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public static final C23454a0 m21803a2(HomeFragment homeFragment, float f13, LocaleList localeList, InterfaceC28670t2 interfaceC28670t2, EnumC14603g it) {
        EnumC14603g enumC14603gM41789c;
        HomeFragment homeFragment2;
        Boolean boolValueOf;
        List<String> listM41779j;
        C14600d c14600dM41768a;
        C14600d c14600dM41768a2;
        C14600d c14600dM41768a3;
        Boolean boolM41783n;
        C14600d c14600dM41768a4;
        List<C14602f> listM41769b;
        AbstractC22676k.m65750j(it, "it");
        homeFragment.m21862u1().m37566p0(new AbstractC13340n.b(it));
        C14599c c14599cM37585l = m21770P1(interfaceC28670t2).getHomeFeed();
        String strM41781l = null;
        C14602f c14602f = (c14599cM37585l == null || (listM41769b = c14599cM37585l.m41769b()) == null) ? null : (C14602f) AbstractC25265s.m74102I0(it.getIndex(), listM41769b);
        if (c14602f == null || (enumC14603gM41789c = c14602f.getPillarType()) == null) {
            enumC14603gM41789c = EnumC14603g.OVERVIEW;
        }
        EnumC14603g enumC14603g = enumC14603gM41789c;
        if (enumC14603g == EnumC14603g.OVERVIEW) {
            homeFragment2 = homeFragment;
            boolValueOf = Boolean.valueOf(homeFragment2.m21715B1(c14602f));
        } else {
            homeFragment2 = homeFragment;
            boolValueOf = null;
        }
        C15967b c15967bM21790W0 = homeFragment2.m21790W0();
        C14599c c14599cM37585l2 = m21770P1(interfaceC28670t2).getHomeFeed();
        boolean zM41777h = (c14599cM37585l2 == null || (c14600dM41768a4 = c14599cM37585l2.getHomeMetaData()) == null) ? false : c14600dM41768a4.getMultiDayCycle();
        C14599c c14599cM37585l3 = m21770P1(interfaceC28670t2).getHomeFeed();
        boolean zBooleanValue = (c14599cM37585l3 == null || (c14600dM41768a3 = c14599cM37585l3.getHomeMetaData()) == null || (boolM41783n = c14600dM41768a3.getIsGDCFlow()) == null) ? false : boolM41783n.booleanValue();
        C14599c c14599cM37585l4 = m21770P1(interfaceC28670t2).getHomeFeed();
        if (c14599cM37585l4 == null || (c14600dM41768a2 = c14599cM37585l4.getHomeMetaData()) == null || (listM41779j = c14600dM41768a2.m41779j()) == null) {
            listM41779j = C25271y.f99162w;
        }
        List<String> list = listM41779j;
        C14599c c14599cM37585l5 = m21770P1(interfaceC28670t2).getHomeFeed();
        if (c14599cM37585l5 != null && (c14600dM41768a = c14599cM37585l5.getHomeMetaData()) != null) {
            strM41781l = c14600dM41768a.getSleepState();
        }
        c15967bM21790W0.m45051B(enumC14603g, f13, localeList, zM41777h, zBooleanValue, list, strM41781l, m21770P1(interfaceC28670t2).getHideRecoveryViewState().getIsHideRecoveryEnabled(), m21770P1(interfaceC28670t2).getDisplayCycleState(), homeFragment2.m21805b1().isFeatureEnabled(FeatureFlagRepositoryKt.HOME_FUTURE_IA) || homeFragment2.m21805b1().isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA), m21770P1(interfaceC28670t2).getStreaksHomeViewState(), boolValueOf);
        C13347u c13347uM21862u1 = homeFragment2.m21862u1();
        C17027b<CalendarDateModel> c17027bM37575b = m21770P1(interfaceC28670t2).m37575b();
        c13347uM21862u1.m37566p0(new AbstractC13335i.a(c17027bM37575b != null ? c17027bM37575b.getMonthOffset() : 0, enumC14603g));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b1 */
    private final FeatureFlagChecker m21805b1() {
        return (FeatureFlagChecker) this.featureFlagChecker.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2 */
    public static final C23454a0 m21806b2(HomeFragment homeFragment, InterfaceC28670t2 interfaceC28670t2, String it) {
        AbstractC22676k.m65750j(it, "it");
        homeFragment.m21790W0().m45074Z(it, "Alert Tapped");
        homeFragment.m21814e1().m33776j(new AbstractC12177a.l(m21773Q1(interfaceC28670t2).getStatusUrl(), EnumC18633j.WHOOP_SERVER_OUTAGE));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c1 */
    private final InterfaceC25007c m21808c1() {
        return (InterfaceC25007c) this.fwUpdatePermissionHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public static final C23454a0 m21809c2(HomeFragment homeFragment, String it) {
        AbstractC22676k.m65750j(it, "it");
        homeFragment.m21790W0().m45091s(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d1 */
    private final C18662c0 m21811d1() {
        return (C18662c0) this.homeItemActionRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public static final C23454a0 m21812d2(HomeFragment homeFragment, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof C37382d) {
            C37382d c37382d = (C37382d) event;
            homeFragment.m21814e1().m33776j(new AbstractC12177a.j(c37382d.getDestination(), c37382d.getAnalyticSource()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public final C12178b m21814e1() {
        return (C12178b) this.homeScreenNavigationRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public static final C23454a0 m21815e2(HomeFragment homeFragment, InterfaceC28670t2 interfaceC28670t2) {
        homeFragment.m21862u1().m37566p0(homeFragment.m21859t1(m21770P1(interfaceC28670t2), EnumC14606j.PREVIOUS_CYCLE));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f1 */
    private final C28217y0 m21817f1() {
        return (C28217y0) this.locationServicesHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f2 */
    public static final C23454a0 m21818f2(HomeFragment homeFragment, InterfaceC28670t2 interfaceC28670t2, boolean z4) {
        if (z4) {
            homeFragment.m21862u1().m37566p0(new AbstractC13329c.b(false));
            homeFragment.m21790W0().m45096y();
            homeFragment.m21756L2(false);
        } else {
            C18613a c18613aM37578e = m21770P1(interfaceC28670t2).getDayOneTransitionOverlayViewState();
            homeFragment.m21740H2(c18613aM37578e != null ? c18613aM37578e.getFeatureId() : -1);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g1 */
    private final InterfaceC14643c m21820g1() {
        return (InterfaceC14643c) this.orientationLockChecker.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public static final C23454a0 m21821g2(HomeFragment homeFragment) {
        homeFragment.m21720C2();
        return C23454a0.f92919a;
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public final C25010f m21823h1() {
        return (C25010f) this.pushNotificationPermissionRequestValidator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public static final C23454a0 m21824h2(HomeFragment homeFragment, boolean z4) {
        if (z4) {
            homeFragment.m21790W0().m45097z();
        }
        homeFragment.m21862u1().m37566p0(new AbstractC13328b0.a(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public final InterfaceC25007c m21826i1() {
        return (InterfaceC25007c) this.pushNotificationsPermissionHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public static final C23454a0 m21827i2(HomeFragment homeFragment, C9598e it) {
        AbstractC22676k.m65750j(it, "it");
        homeFragment.m21847p1().m45109c();
        homeFragment.m21736G2(new AbstractC12177a.s(it, null, false, 6, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC35173b m21829j1() {
        return (InterfaceC35173b) this.reviewManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j2 */
    public static final C23454a0 m21830j2(HomeFragment homeFragment) {
        homeFragment.m21850q1().m37453q();
        homeFragment.m21743I1("Tilt Button");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public final InterfaceC14644d m21832k1() {
        return (InterfaceC14644d) this.rotationDetector.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public static final C23454a0 m21833k2(HomeFragment homeFragment, InterfaceC28670t2 interfaceC28670t2) {
        homeFragment.m21862u1().m37566p0(homeFragment.m21859t1(m21770P1(interfaceC28670t2), EnumC14606j.NEXT_CYCLE));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public final C34660d m21835l1() {
        return (C34660d) this.sharedPrefs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l2 */
    public static final C23454a0 m21836l2(HomeFragment homeFragment, EnumC14603g enumC14603g, C22325e it) {
        AbstractC22676k.m65750j(it, "it");
        C13347u c13347uM21862u1 = homeFragment.m21862u1();
        LocalDate date = it.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
        EnumC13344r enumC13344r = EnumC13344r.CALENDAR;
        if (enumC14603g == null) {
            enumC14603g = EnumC14603g.OVERVIEW;
        }
        c13347uM21862u1.m37566p0(new AbstractC13340n.c(date, enumC14603g, enumC13344r));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m1 */
    private final String m21838m1() {
        return (String) this.sourceId.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m2 */
    public static final C23454a0 m21839m2(HomeFragment homeFragment, EnumC14603g enumC14603g, InterfaceC28601c1 interfaceC28601c1, int i13) {
        m21863u2(interfaceC28601c1, i13);
        C13347u c13347uM21862u1 = homeFragment.m21862u1();
        if (enumC14603g == null) {
            enumC14603g = EnumC14603g.OVERVIEW;
        }
        c13347uM21862u1.m37566p0(new AbstractC13335i.a(i13, enumC14603g));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n1 */
    private final C2209f m21841n1() {
        return (C2209f) this.statusViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n2 */
    public static final C23454a0 m21842n2(HomeFragment homeFragment, EnumC14603g enumC14603g) {
        homeFragment.m21790W0().m45066R(enumC14603g);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o1 */
    private final C34660d m21844o1() {
        return (C34660d) this.strainCoachPrefs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o2 */
    public static final C23454a0 m21845o2(HomeFragment homeFragment, EnumC14603g enumC14603g, C2281h it) {
        AbstractC22676k.m65750j(it, "it");
        homeFragment.m21736G2(new AbstractC12177a.g(EnumC0124b.DEFAULT, enumC14603g, it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p1 */
    private final C15970e m21847p1() {
        return (C15970e) this.streaksAnalyticsHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p2 */
    public static final C23454a0 m21848p2(HomeFragment homeFragment, EnumC14603g enumC14603g, InterfaceC28601c1 interfaceC28601c1, InterfaceC28670t2 interfaceC28670t2, EnumC22400l fabItem) {
        AbstractC22676k.m65750j(fabItem, "fabItem");
        homeFragment.m21811d1().m54144a(fabItem, enumC14603g, m21770P1(interfaceC28670t2), new C18708z(homeFragment, 0), homeFragment.m21814e1());
        interfaceC28601c1.setValue(Boolean.FALSE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public final C13326a0 m21850q1() {
        return (C13326a0) this.tiltEntryButtonViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q2 */
    public static final C23454a0 m21851q2(HomeFragment homeFragment, InterfaceC13346t event) {
        AbstractC22676k.m65750j(event, "event");
        homeFragment.m21862u1().m37566p0(event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r1 */
    private final InterfaceC14652l m21853r1() {
        return (InterfaceC14652l) this.tiltEntryRotationMonitor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r2 */
    public static final C23454a0 m21854r2(HomeFragment homeFragment, EnumC14603g enumC14603g, InterfaceC28601c1 interfaceC28601c1, InterfaceC28670t2 interfaceC28670t2, boolean z4) {
        if (!z4 && !m21770P1(interfaceC28670t2).getOnboardingDomainState().getHasSeenFabOnboarding()) {
            homeFragment.m21862u1().m37566p0(AbstractC13342p.c.f46234a);
        }
        homeFragment.m21790W0().m45090r(z4, enumC14603g);
        homeFragment.m21790W0().m45088p(false);
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s1 */
    private final InterfaceC14654n m21856s1() {
        return (InterfaceC14654n) this.tiltOrientationPolicy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s2 */
    public static final InterfaceC28601c1 m21857s2() {
        return AbstractC28683x.m87272z(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: t1 */
    private final AbstractC13340n.c m21859t1(C13348v viewState, EnumC14606j type) {
        LocalDate localDateMinusDays;
        C14600d c14600dM41768a;
        LocalDate localDatePlusDays;
        C14600d c14600dM41768a2;
        LocalDate localDateM37576c = viewState.getCurrentCalendarDate();
        int i13 = C8817a.f26411b[type.ordinal()];
        if (i13 == 1) {
            m21790W0().m45086n(type);
            C14599c c14599cM37585l = viewState.getHomeFeed();
            if (c14599cM37585l == null || (c14600dM41768a = c14599cM37585l.getHomeMetaData()) == null || (localDateMinusDays = c14600dM41768a.getPreviousCycleStartDay()) == null) {
                localDateMinusDays = localDateM37576c.minusDays(1L);
            }
            return new AbstractC13340n.c(localDateMinusDays, null, null, 6, null);
        }
        if (i13 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        m21790W0().m45086n(type);
        C14599c c14599cM37585l2 = viewState.getHomeFeed();
        if (c14599cM37585l2 == null || (c14600dM41768a2 = c14599cM37585l2.getHomeMetaData()) == null || (localDatePlusDays = c14600dM41768a2.getNextCycleStartDay()) == null) {
            localDatePlusDays = localDateM37576c.plusDays(1L);
        }
        return new AbstractC13340n.c(localDatePlusDays, null, null, 6, null);
    }

    /* JADX INFO: renamed from: t2 */
    private static final boolean m21860t2(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u1 */
    public final C13347u m21862u1() {
        return (C13347u) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: u2 */
    private static final void m21863u2(InterfaceC28601c1 interfaceC28601c1, int i13) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v1 */
    public final InterfaceC39659g m21865v1() {
        return (InterfaceC39659g) this.whoopSplashState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v2 */
    public static final boolean m21866v2() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w1 */
    public final C21133b1 m21868w1() {
        return (C21133b1) this.yirCoordinator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w2 */
    public static final C34911a m21869w2(HomeFragment homeFragment) {
        return AbstractC15751g.m44431K(homeFragment.requireActivity().getActivityResultRegistry(), AbstractC37056f.m118958J("android.permission.POST_NOTIFICATIONS"), "homeFragment");
    }

    /* JADX INFO: renamed from: x2 */
    private final void m21871x2() {
        ContentResolver contentResolver;
        if (this.orientationLockObserver != null) {
            return;
        }
        C8835j c8835j = new C8835j(Handler.createAsync(Looper.getMainLooper()));
        Context context = getContext();
        if (context == null || (contentResolver = context.getContentResolver()) == null) {
            return;
        }
        contentResolver.registerContentObserver(Settings.System.getUriFor("accelerometer_rotation"), false, c8835j);
        this.orientationLockObserver = c8835j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y1 */
    public static final C23454a0 m21874y1(HomeFragment homeFragment, String str, AppScreen appScreen) {
        homeFragment.logger.mo85228t(AbstractC11266d.m30461o("handleAutoPop: Dialog dismissed callback fired for id=", str), new AbstractC30556a.a[0]);
        homeFragment.m21862u1().m37566p0(new AbstractC13325a.b(appScreen.getName(), str));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: y2 */
    public final Object m21875y2(InterfaceC13346t interfaceC13346t, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C8837k c8837k;
        if (interfaceC30057d instanceof C8837k) {
            c8837k = (C8837k) interfaceC30057d;
            int i13 = c8837k.f26528z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c8837k.f26528z = i13 - Integer.MIN_VALUE;
            } else {
                c8837k = new C8837k(interfaceC30057d);
            }
        } else {
            c8837k = new C8837k(interfaceC30057d);
        }
        Object objM73347s = c8837k.f26526x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c8837k.f26528z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM73347s);
            InterfaceC25007c interfaceC25007cM21808c1 = m21808c1();
            c8837k.f26525w = interfaceC13346t;
            c8837k.f26528z = 1;
            objM73347s = InterfaceC25007c.m73347s(interfaceC25007cM21808c1, false, c8837k, 1, null);
            if (objM73347s == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC13346t = (InterfaceC13346t) c8837k.f26525w;
            AbstractC34132o.m107864I(objM73347s);
        }
        if (!((EnumC25009e) objM73347s).werePermissionsGranted()) {
            this.logger.mo85216g("Location permission denied; cannot proceed with firmware update", new AbstractC30556a.a[0]);
        } else if (m21817f1().m85444e()) {
            this.logger.mo85216g("Location services are enabled; proceeding", new AbstractC30556a.a[0]);
            m21862u1().m37566p0(interfaceC13346t);
        } else {
            C28217y0 c28217y0M21817f1 = m21817f1();
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
            AbstractC21065d abstractC21065d = this.checkLocationSettings;
            if (abstractC21065d == null) {
                AbstractC22676k.m65757q("checkLocationSettings");
                throw null;
            }
            c28217y0M21817f1.m85445f(abstractActivityC1340r0RequireActivity, abstractC21065d, new C18518b(23), new C18518b(24), new C18518b(25));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z1 */
    public final void m21878z1() {
        if (this.isTiltEntryEligible) {
            if (m21820g1().mo41843a()) {
                m21853r1().mo41858b();
            } else {
                m21850q1().m37453q();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public static final C23454a0 m21879z2() {
        return C23454a0.f92919a;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        AbstractC22676k.m65750j(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if (this.isTiltEntryEligible) {
            m21850q1().m37454t(newConfig.orientation);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
        getLifecycle().mo4986a(new C17359r(this.logger));
        if (!m21805b1().isFeatureEnabled(FeatureFlagRepositoryKt.HOME_PILLAR_BEHAVIOR_FIX)) {
            m21862u1().m37566p0(new AbstractC13340n.b(EnumC14603g.OVERVIEW));
        }
        final int i13 = 0;
        AbstractC21065d abstractC21065dRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartIntentSenderForResult(), new InterfaceC21063b(this) { // from class: im1.q

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ HomeFragment f73349x;

            {
                this.f73349x = this;
            }

            @Override // p236j.InterfaceC21063b
            /* JADX INFO: renamed from: a */
            public final void mo364a(Object obj) {
                switch (i13) {
                    case 0:
                        HomeFragment.m21755L1(this.f73349x, (C21062a) obj);
                        break;
                    default:
                        HomeFragment.m21759M1(this.f73349x, (C21062a) obj);
                        break;
                }
            }
        });
        AbstractC22676k.m65749i(abstractC21065dRegisterForActivityResult, "registerForActivityResult(...)");
        this.activityLauncher = abstractC21065dRegisterForActivityResult;
        final int i14 = 1;
        AbstractC21065d abstractC21065dRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts$StartIntentSenderForResult(), new InterfaceC21063b(this) { // from class: im1.q

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ HomeFragment f73349x;

            {
                this.f73349x = this;
            }

            @Override // p236j.InterfaceC21063b
            /* JADX INFO: renamed from: a */
            public final void mo364a(Object obj) {
                switch (i14) {
                    case 0:
                        HomeFragment.m21755L1(this.f73349x, (C21062a) obj);
                        break;
                    default:
                        HomeFragment.m21759M1(this.f73349x, (C21062a) obj);
                        break;
                }
            }
        });
        AbstractC22676k.m65749i(abstractC21065dRegisterForActivityResult2, "registerForActivityResult(...)");
        this.checkLocationSettings = abstractC21065dRegisterForActivityResult2;
        getParentFragmentManager().m4170g0("completed_journal_fragment_result_key", this, new InterfaceC1357w1() { // from class: im1.r
            @Override // androidx.fragment.app.InterfaceC1357w1
            /* JADX INFO: renamed from: a */
            public final void mo4108a(Bundle bundle, String str) {
                HomeFragment.m21763N1(this.f73362a, str, bundle);
            }
        });
        m21790W0().m45055F();
        getLifecycle().mo4986a(m21826i1());
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        InterfaceC14654n interfaceC14654nM21856s1 = m21856s1();
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        boolean zMo41841e = interfaceC14654nM21856s1.mo41841e(contextRequireContext);
        this.isTiltEntryEligible = zMo41841e;
        if (zMo41841e) {
            m21772Q0();
        } else {
            m21781T0();
        }
        final float f13 = getResources().getConfiguration().fontScale;
        final LocaleList localeList = LocaleList.getDefault();
        AbstractC22676k.m65749i(localeList, "getDefault(...)");
        m21751K1();
        return AbstractC22387b0.m64387c(this, new C37816b(new InterfaceC4351m() { // from class: im1.o
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                int iIntValue = ((Integer) obj2).intValue();
                return HomeFragment.m21767O1(this.f73311w, f13, localeList, (Composer) obj, iIntValue);
            }
        }, true, -1866797235));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onDestroyView() {
        if (this.isTiltEntryEligible) {
            m21850q1().m37456v(new C15621b(25));
            if (!requireActivity().isChangingConfigurations()) {
                m21850q1().m37453q();
            }
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        if (this.isTiltEntryEligible) {
            m21772Q0();
            m21850q1().m37454t(getResources().getConfiguration().orientation);
        }
        if (m21805b1().isFeatureEnabled(FeatureFlagRepositoryKt.HOME_REDESIGN_REFRESH_FIX)) {
            m21862u1().m37566p0(new AbstractC13340n.c(null, null, EnumC13344r.AUTO_REFRESH, 3, null));
        }
        m21862u1().m37566p0(C13350x.f46663a);
        m21841n1().mo1216g(new InterfaceC2208e.b("Overview Screen"));
        m21862u1().m37567u0();
        m21756L2(true);
        m21862u1().m37566p0(AbstractC13334h.a.f46200a);
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C8833i(null), 3);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onStart() {
        EnumC14603g enumC14603g;
        super.onStart();
        m21871x2();
        if (m21805b1().isFeatureEnabled(FeatureFlagRepositoryKt.HOME_PILLAR_BEHAVIOR_FIX)) {
            String strM21799Z0 = m21799Z0();
            if (strM21799Z0 != null) {
                String upperCase = strM21799Z0.toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                EnumC14603g[] enumC14603gArrValues = EnumC14603g.values();
                int length = enumC14603gArrValues.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        enumC14603g = null;
                        break;
                    }
                    enumC14603g = enumC14603gArrValues[i13];
                    if (AbstractC22676k.m65745e(enumC14603g.name(), upperCase)) {
                        break;
                    } else {
                        i13++;
                    }
                }
                if (enumC14603g != null) {
                    m21862u1().m37566p0(new AbstractC13340n.b(enumC14603g));
                }
            }
        } else if (!m21805b1().isFeatureEnabled(FeatureFlagRepositoryKt.HOME_REDESIGN_REFRESH_FIX)) {
            m21862u1().m37566p0(new AbstractC13340n.c(null, null, null, 7, null));
        }
        m21862u1().m37566p0(new AbstractC13340n.c(null, null, null, 7, null));
        m21724D2();
        m21739H1();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onStop() {
        m21760M2();
        super.onStop();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m21862u1().m37565o0(m21838m1());
        getLifecycle().mo4986a(m21808c1());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21880x1(AbstractC12177a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC12177a.r) {
            String strValueOf = String.valueOf(((AbstractC12177a.r) event).getCycleId());
            m21862u1().m37566p0(new C13351y(strValueOf));
            C13347u c13347uM21862u1 = m21862u1();
            AppScreen.C9275b3 c9275b3 = AppScreen.C9275b3.f27499w;
            c13347uM21862u1.m37566p0(new AbstractC13325a.b(c9275b3.getName(), strValueOf));
            m21732F2(event, c9275b3, strValueOf);
            return;
        }
        if (!(event instanceof AbstractC12177a.e)) {
            m21736G2(event);
            return;
        }
        AbstractC12177a.e eVar = (AbstractC12177a.e) event;
        AppScreen screen = eVar.getNavigationAction().getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String();
        String strM61573a = AbstractC21772c.m61573a(eVar.getNavigationAction());
        boolean z4 = AbstractC22676k.m65745e(screen, AppScreen.C9271b.f27485w) || AbstractC22676k.m65745e(screen, AppScreen.C9421t5.f27948w);
        if (AbstractC22676k.m65745e(screen, AppScreen.C9441w1.f28009w)) {
            m21862u1().m37566p0(new AbstractC13325a.a(screen.getName(), strM61573a));
        } else if (z4) {
            m21862u1().m37566p0(new AbstractC13325a.a(screen.getName(), strM61573a));
            m21727E1(strM61573a, new C18656a0(this, strM61573a, screen, 0));
        } else {
            m21862u1().m37566p0(new AbstractC13325a.b(screen.getName(), strM61573a));
        }
        m21732F2(event, screen, strM61573a);
    }
}
