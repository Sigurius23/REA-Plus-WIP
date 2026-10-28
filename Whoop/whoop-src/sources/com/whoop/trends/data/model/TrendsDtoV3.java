package com.whoop.trends.data.model;

import androidx.profileinstaller.ProfileVerifier;
import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.InfoCalloutTileModel$$serializer;
import com.whoop.design.models.cards.TextWithIllustrationCardModel;
import com.whoop.design.models.cards.TextWithIllustrationCardModel$$serializer;
import com.whoop.design.models.items.AdditionalInfoTextModel;
import com.whoop.design.models.items.AdditionalInfoTextModel$$serializer;
import com.whoop.design.models.items.ArticleTileCarouselModel;
import com.whoop.design.models.items.ArticleTileCarouselModel$$serializer;
import com.whoop.design.models.items.MenuItemModel;
import com.whoop.design.models.items.MenuItemModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
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
import wl2.C37358a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bF\b\u0087\b\u0018\u0000 ®\u00012\u00020\u0001:\u0004¯\u0001®\u0001B¥\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000f\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u000f\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u000f\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u000f\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/BÃ\u0002\b\u0010\u0012\u0006\u00101\u001a\u000200\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u000f\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u000f\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u000f\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u000f\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b.\u00104J\u0010\u00105\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b;\u0010:J\u0010\u0010<\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b<\u0010:J\u0012\u0010=\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b=\u0010:J\u0010\u0010>\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b>\u00106J\u0010\u0010?\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b?\u00106J\u0012\u0010@\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0016\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bH\u00106J\u0012\u0010I\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\bK\u0010JJ\u0012\u0010L\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0012\u0010N\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0016\u0010P\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000fHÆ\u0003¢\u0006\u0004\bP\u0010CJ\u0012\u0010Q\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\bQ\u0010RJ\u0018\u0010S\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bS\u0010CJ\u0018\u0010T\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bT\u0010CJ\u0012\u0010U\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bU\u00106J\u0018\u0010V\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bV\u0010CJ\u0012\u0010W\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\bW\u0010XJ\u0018\u0010Y\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bY\u0010CJ\u0012\u0010Z\u001a\u0004\u0018\u00010,HÆ\u0003¢\u0006\u0004\bZ\u0010[JÜ\u0002\u0010\\\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u000f2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u000f2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u000f2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,HÆ\u0001¢\u0006\u0004\b\\\u0010]J\u0010\u0010^\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b^\u00106J\u0010\u0010_\u001a\u000200HÖ\u0001¢\u0006\u0004\b_\u0010`J\u001a\u0010c\u001a\u00020b2\b\u0010a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bc\u0010dJ'\u0010m\u001a\u00020j2\u0006\u0010e\u001a\u00020\u00002\u0006\u0010g\u001a\u00020f2\u0006\u0010i\u001a\u00020hH\u0001¢\u0006\u0004\bk\u0010lR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010n\u0012\u0004\bp\u0010q\u001a\u0004\bo\u00106R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010r\u0012\u0004\bt\u0010q\u001a\u0004\bs\u00108R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010u\u0012\u0004\bw\u0010q\u001a\u0004\bv\u0010:R \u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010u\u0012\u0004\by\u0010q\u001a\u0004\bx\u0010:R \u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010u\u0012\u0004\b{\u0010q\u001a\u0004\bz\u0010:R\"\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010u\u0012\u0004\b}\u0010q\u001a\u0004\b|\u0010:R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010n\u0012\u0004\b\u007f\u0010q\u001a\u0004\b~\u00106R\"\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\f\u0010n\u0012\u0005\b\u0081\u0001\u0010q\u001a\u0005\b\u0080\u0001\u00106R%\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u000e\u0010\u0082\u0001\u0012\u0005\b\u0084\u0001\u0010q\u001a\u0005\b\u0083\u0001\u0010AR)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0011\u0010\u0085\u0001\u0012\u0005\b\u0087\u0001\u0010q\u001a\u0005\b\u0086\u0001\u0010CR%\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0013\u0010\u0088\u0001\u0012\u0005\b\u008a\u0001\u0010q\u001a\u0005\b\u0089\u0001\u0010ER%\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0015\u0010\u008b\u0001\u0012\u0005\b\u008d\u0001\u0010q\u001a\u0005\b\u008c\u0001\u0010GR$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u0016\u0010n\u0012\u0005\b\u008f\u0001\u0010q\u001a\u0005\b\u008e\u0001\u00106R%\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0018\u0010\u0090\u0001\u0012\u0005\b\u0092\u0001\u0010q\u001a\u0005\b\u0091\u0001\u0010JR%\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0019\u0010\u0090\u0001\u0012\u0005\b\u0094\u0001\u0010q\u001a\u0005\b\u0093\u0001\u0010JR%\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u001b\u0010\u0095\u0001\u0012\u0005\b\u0097\u0001\u0010q\u001a\u0005\b\u0096\u0001\u0010MR%\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u001d\u0010\u0098\u0001\u0012\u0005\b\u009a\u0001\u0010q\u001a\u0005\b\u0099\u0001\u0010OR)\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000f8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u001f\u0010\u0085\u0001\u0012\u0005\b\u009c\u0001\u0010q\u001a\u0005\b\u009b\u0001\u0010CR%\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b!\u0010\u009d\u0001\u0012\u0005\b\u009f\u0001\u0010q\u001a\u0005\b\u009e\u0001\u0010RR+\u0010\"\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\"\u0010\u0085\u0001\u0012\u0005\b¡\u0001\u0010q\u001a\u0005\b \u0001\u0010CR+\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b$\u0010\u0085\u0001\u0012\u0005\b£\u0001\u0010q\u001a\u0005\b¢\u0001\u0010CR$\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b%\u0010n\u0012\u0005\b¥\u0001\u0010q\u001a\u0005\b¤\u0001\u00106R+\u0010'\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b'\u0010\u0085\u0001\u0012\u0005\b§\u0001\u0010q\u001a\u0005\b¦\u0001\u0010CR%\u0010)\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b)\u0010¨\u0001\u0012\u0005\bª\u0001\u0010q\u001a\u0005\b©\u0001\u0010XR!\u0010+\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u000f8\u0006¢\u0006\u000e\n\u0005\b+\u0010\u0085\u0001\u001a\u0005\b«\u0001\u0010CR\u001b\u0010-\u001a\u0004\u0018\u00010,8\u0006¢\u0006\u000e\n\u0005\b-\u0010¬\u0001\u001a\u0005\b\u00ad\u0001\u0010[¨\u0006°\u0001"}, m65681d2 = {"Lcom/whoop/trends/data/model/TrendsDtoV3;", "", "", "title", "Lcom/whoop/trends/data/model/SegmentControllerDtoV3;", "segmentController", "Lcom/whoop/trends/data/model/TimeSegmentDtoV3;", "weekTimeSegment", "monthTimeSegment", "sixMonthTimeSegment", "allTimeSegment", "noDataGraphText", "noDataGraphSubText", "Lcom/whoop/trends/data/model/MetricEducationV3;", "metricEducation", "", "Lcom/whoop/trends/data/model/NavigationSectionV3;", "navigationSections", "Lcom/whoop/design/models/items/ArticleTileCarouselModel;", "educationCarouselModel", "Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;", "integrationsUpsell", "infoCalloutDisplay", "Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;", "manualMeasurementItem", "seeAllDataItem", "Lcom/whoop/trends/data/model/ManualMeasurementSheet;", "manualMeasurementSheet", "Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;", "upsellCard", "Lcom/whoop/design/models/items/MenuItemModel;", "trendMenuList", "Lcom/whoop/trends/data/model/CardioFitnessLevelModel;", "cardioFitnessLevel", "metricEducationList", "Lcom/whoop/design/models/InfoCalloutTileModel;", "infoCalloutList", "manualMeasurementTextDisplay", "Lcom/whoop/trends/data/model/TrendMenuItemModel;", "trendMenus", "Lcom/whoop/design/models/items/AdditionalInfoTextModel;", "additionalInfoText", "Lcom/whoop/design/models/DesignSystemModel;", "designItems", "Lcom/whoop/trends/data/model/MetaData;", "metadata", "<init>", "(Ljava/lang/String;Lcom/whoop/trends/data/model/SegmentControllerDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/MetricEducationV3;Ljava/util/List;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;Ljava/util/List;Lcom/whoop/trends/data/model/CardioFitnessLevelModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Ljava/util/List;Lcom/whoop/trends/data/model/MetaData;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/trends/data/model/SegmentControllerDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/MetricEducationV3;Ljava/util/List;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;Ljava/util/List;Lcom/whoop/trends/data/model/CardioFitnessLevelModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Ljava/util/List;Lcom/whoop/trends/data/model/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/trends/data/model/SegmentControllerDtoV3;", "component3", "()Lcom/whoop/trends/data/model/TimeSegmentDtoV3;", "component4", "component5", "component6", "component7", "component8", "component9", "()Lcom/whoop/trends/data/model/MetricEducationV3;", "component10", "()Ljava/util/List;", "component11", "()Lcom/whoop/design/models/items/ArticleTileCarouselModel;", "component12", "()Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;", "component13", "component14", "()Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;", "component15", "component16", "()Lcom/whoop/trends/data/model/ManualMeasurementSheet;", "component17", "()Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;", "component18", "component19", "()Lcom/whoop/trends/data/model/CardioFitnessLevelModel;", "component20", "component21", "component22", "component23", "component24", "()Lcom/whoop/design/models/items/AdditionalInfoTextModel;", "component25", "component26", "()Lcom/whoop/trends/data/model/MetaData;", "copy", "(Ljava/lang/String;Lcom/whoop/trends/data/model/SegmentControllerDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/MetricEducationV3;Ljava/util/List;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;Ljava/util/List;Lcom/whoop/trends/data/model/CardioFitnessLevelModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Ljava/util/List;Lcom/whoop/trends/data/model/MetaData;)Lcom/whoop/trends/data/model/TrendsDtoV3;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$trends_release", "(Lcom/whoop/trends/data/model/TrendsDtoV3;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "Lcom/whoop/trends/data/model/SegmentControllerDtoV3;", "getSegmentController", "getSegmentController$annotations", "Lcom/whoop/trends/data/model/TimeSegmentDtoV3;", "getWeekTimeSegment", "getWeekTimeSegment$annotations", "getMonthTimeSegment", "getMonthTimeSegment$annotations", "getSixMonthTimeSegment", "getSixMonthTimeSegment$annotations", "getAllTimeSegment", "getAllTimeSegment$annotations", "getNoDataGraphText", "getNoDataGraphText$annotations", "getNoDataGraphSubText", "getNoDataGraphSubText$annotations", "Lcom/whoop/trends/data/model/MetricEducationV3;", "getMetricEducation", "getMetricEducation$annotations", "Ljava/util/List;", "getNavigationSections", "getNavigationSections$annotations", "Lcom/whoop/design/models/items/ArticleTileCarouselModel;", "getEducationCarouselModel", "getEducationCarouselModel$annotations", "Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;", "getIntegrationsUpsell", "getIntegrationsUpsell$annotations", "getInfoCalloutDisplay", "getInfoCalloutDisplay$annotations", "Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;", "getManualMeasurementItem", "getManualMeasurementItem$annotations", "getSeeAllDataItem", "getSeeAllDataItem$annotations", "Lcom/whoop/trends/data/model/ManualMeasurementSheet;", "getManualMeasurementSheet", "getManualMeasurementSheet$annotations", "Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;", "getUpsellCard", "getUpsellCard$annotations", "getTrendMenuList", "getTrendMenuList$annotations", "Lcom/whoop/trends/data/model/CardioFitnessLevelModel;", "getCardioFitnessLevel", "getCardioFitnessLevel$annotations", "getMetricEducationList", "getMetricEducationList$annotations", "getInfoCalloutList", "getInfoCalloutList$annotations", "getManualMeasurementTextDisplay", "getManualMeasurementTextDisplay$annotations", "getTrendMenus", "getTrendMenus$annotations", "Lcom/whoop/design/models/items/AdditionalInfoTextModel;", "getAdditionalInfoText", "getAdditionalInfoText$annotations", "getDesignItems", "Lcom/whoop/trends/data/model/MetaData;", "getMetadata", "Companion", "$serializer", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TrendsDtoV3 {
    private static final InterfaceC23462h[] $childSerializers;

    @SerializedName("additional_info_text")
    private final AdditionalInfoTextModel additionalInfoText;

    @SerializedName("all_time_segment")
    private final TimeSegmentDtoV3 allTimeSegment;

    @SerializedName("cardio_fitness_level")
    private final CardioFitnessLevelModel cardioFitnessLevel;
    private final List<DesignSystemModel> designItems;

    @SerializedName("education_carousel")
    private final ArticleTileCarouselModel educationCarouselModel;

    @SerializedName("info_callout_display")
    private final String infoCalloutDisplay;

    @SerializedName("info_callouts")
    private final List<InfoCalloutTileModel> infoCalloutList;

    @SerializedName("integrations_upsell")
    private final IntegrationsUpsellDtoV3 integrationsUpsell;

    @SerializedName("manual_measurement_item")
    private final TrendsMenuItemDtoV3 manualMeasurementItem;

    @SerializedName("manual_measurement_sheet")
    private final ManualMeasurementSheet manualMeasurementSheet;

    @SerializedName("manual_measurement_text_display")
    private final String manualMeasurementTextDisplay;
    private final MetaData metadata;

    @SerializedName("metric_education")
    private final MetricEducationV3 metricEducation;

    @SerializedName("metric_education_list")
    private final List<MetricEducationV3> metricEducationList;

    @SerializedName("month_time_segment")
    private final TimeSegmentDtoV3 monthTimeSegment;

    @SerializedName("navigation_sections")
    private final List<NavigationSectionV3> navigationSections;

    @SerializedName("no_data_subtext_name_display")
    private final String noDataGraphSubText;

    @SerializedName("no_data_name_display")
    private final String noDataGraphText;

    @SerializedName("see_all_data_item")
    private final TrendsMenuItemDtoV3 seeAllDataItem;

    @SerializedName("segment_controller")
    private final SegmentControllerDtoV3 segmentController;

    @SerializedName("six_month_time_segment")
    private final TimeSegmentDtoV3 sixMonthTimeSegment;

    @SerializedName("header_name_display")
    private final String title;

    @SerializedName("trend_menu_list")
    private final List<MenuItemModel> trendMenuList;

    @SerializedName("trend_menus")
    private final List<TrendMenuItemModel> trendMenus;

    @SerializedName("upsell_card")
    private final TextWithIllustrationCardModel upsellCard;

    @SerializedName("week_time_segment")
    private final TimeSegmentDtoV3 weekTimeSegment;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/trends/data/model/TrendsDtoV3$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/trends/data/model/TrendsDtoV3;", "serializer", "()Lwc3/c;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TrendsDtoV3$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C37358a(13)), null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C37358a(14)), null, AbstractC30060g.m92087G(enumC23463i, new C37358a(15)), AbstractC30060g.m92087G(enumC23463i, new C37358a(16)), null, AbstractC30060g.m92087G(enumC23463i, new C37358a(17)), null, AbstractC30060g.m92087G(enumC23463i, new C37358a(18)), null};
    }

    public /* synthetic */ TrendsDtoV3(int i13, String str, SegmentControllerDtoV3 segmentControllerDtoV3, TimeSegmentDtoV3 timeSegmentDtoV3, TimeSegmentDtoV3 timeSegmentDtoV4, TimeSegmentDtoV3 timeSegmentDtoV5, TimeSegmentDtoV3 timeSegmentDtoV6, String str2, String str3, MetricEducationV3 metricEducationV3, List list, ArticleTileCarouselModel articleTileCarouselModel, IntegrationsUpsellDtoV3 integrationsUpsellDtoV3, String str4, TrendsMenuItemDtoV3 trendsMenuItemDtoV3, TrendsMenuItemDtoV3 trendsMenuItemDtoV4, ManualMeasurementSheet manualMeasurementSheet, TextWithIllustrationCardModel textWithIllustrationCardModel, List list2, CardioFitnessLevelModel cardioFitnessLevelModel, List list3, List list4, String str5, List list5, AdditionalInfoTextModel additionalInfoTextModel, List list6, MetaData metaData, SerializationConstructorMarker serializationConstructorMarker) {
        if (16776959 != (i13 & 16776959)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 16776959, TrendsDtoV3$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.segmentController = segmentControllerDtoV3;
        this.weekTimeSegment = timeSegmentDtoV3;
        this.monthTimeSegment = timeSegmentDtoV4;
        this.sixMonthTimeSegment = timeSegmentDtoV5;
        this.allTimeSegment = timeSegmentDtoV6;
        this.noDataGraphText = str2;
        this.noDataGraphSubText = str3;
        if ((i13 & 256) == 0) {
            this.metricEducation = null;
        } else {
            this.metricEducation = metricEducationV3;
        }
        this.navigationSections = list;
        this.educationCarouselModel = articleTileCarouselModel;
        this.integrationsUpsell = integrationsUpsellDtoV3;
        this.infoCalloutDisplay = str4;
        this.manualMeasurementItem = trendsMenuItemDtoV3;
        this.seeAllDataItem = trendsMenuItemDtoV4;
        this.manualMeasurementSheet = manualMeasurementSheet;
        this.upsellCard = textWithIllustrationCardModel;
        this.trendMenuList = list2;
        this.cardioFitnessLevel = cardioFitnessLevelModel;
        this.metricEducationList = list3;
        this.infoCalloutList = list4;
        this.manualMeasurementTextDisplay = str5;
        this.trendMenus = list5;
        this.additionalInfoText = additionalInfoTextModel;
        if ((16777216 & i13) == 0) {
            this.designItems = null;
        } else {
            this.designItems = list6;
        }
        if ((i13 & AndroidSDKConstants.FLAG_MUTABLE) == 0) {
            this.metadata = null;
        } else {
            this.metadata = metaData;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(NavigationSectionV3$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(MenuItemModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(MetricEducationV3$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$2() {
        return new ArrayListSerializer(InfoCalloutTileModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$3() {
        return new ArrayListSerializer(TrendMenuItemModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$4() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrendsDtoV3 copy$default(TrendsDtoV3 trendsDtoV3, String str, SegmentControllerDtoV3 segmentControllerDtoV3, TimeSegmentDtoV3 timeSegmentDtoV3, TimeSegmentDtoV3 timeSegmentDtoV4, TimeSegmentDtoV3 timeSegmentDtoV5, TimeSegmentDtoV3 timeSegmentDtoV6, String str2, String str3, MetricEducationV3 metricEducationV3, List list, ArticleTileCarouselModel articleTileCarouselModel, IntegrationsUpsellDtoV3 integrationsUpsellDtoV3, String str4, TrendsMenuItemDtoV3 trendsMenuItemDtoV3, TrendsMenuItemDtoV3 trendsMenuItemDtoV4, ManualMeasurementSheet manualMeasurementSheet, TextWithIllustrationCardModel textWithIllustrationCardModel, List list2, CardioFitnessLevelModel cardioFitnessLevelModel, List list3, List list4, String str5, List list5, AdditionalInfoTextModel additionalInfoTextModel, List list6, MetaData metaData, int i13, Object obj) {
        MetaData metaData2;
        List list7;
        String str6 = (i13 & 1) != 0 ? trendsDtoV3.title : str;
        SegmentControllerDtoV3 segmentControllerDtoV4 = (i13 & 2) != 0 ? trendsDtoV3.segmentController : segmentControllerDtoV3;
        TimeSegmentDtoV3 timeSegmentDtoV7 = (i13 & 4) != 0 ? trendsDtoV3.weekTimeSegment : timeSegmentDtoV3;
        TimeSegmentDtoV3 timeSegmentDtoV8 = (i13 & 8) != 0 ? trendsDtoV3.monthTimeSegment : timeSegmentDtoV4;
        TimeSegmentDtoV3 timeSegmentDtoV9 = (i13 & 16) != 0 ? trendsDtoV3.sixMonthTimeSegment : timeSegmentDtoV5;
        TimeSegmentDtoV3 timeSegmentDtoV10 = (i13 & 32) != 0 ? trendsDtoV3.allTimeSegment : timeSegmentDtoV6;
        String str7 = (i13 & 64) != 0 ? trendsDtoV3.noDataGraphText : str2;
        String str8 = (i13 & 128) != 0 ? trendsDtoV3.noDataGraphSubText : str3;
        MetricEducationV3 metricEducationV4 = (i13 & 256) != 0 ? trendsDtoV3.metricEducation : metricEducationV3;
        List list8 = (i13 & 512) != 0 ? trendsDtoV3.navigationSections : list;
        ArticleTileCarouselModel articleTileCarouselModel2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? trendsDtoV3.educationCarouselModel : articleTileCarouselModel;
        IntegrationsUpsellDtoV3 integrationsUpsellDtoV4 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? trendsDtoV3.integrationsUpsell : integrationsUpsellDtoV3;
        String str9 = (i13 & 4096) != 0 ? trendsDtoV3.infoCalloutDisplay : str4;
        TrendsMenuItemDtoV3 trendsMenuItemDtoV5 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? trendsDtoV3.manualMeasurementItem : trendsMenuItemDtoV3;
        String str10 = str6;
        TrendsMenuItemDtoV3 trendsMenuItemDtoV6 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? trendsDtoV3.seeAllDataItem : trendsMenuItemDtoV4;
        ManualMeasurementSheet manualMeasurementSheet2 = (i13 & 32768) != 0 ? trendsDtoV3.manualMeasurementSheet : manualMeasurementSheet;
        TextWithIllustrationCardModel textWithIllustrationCardModel2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? trendsDtoV3.upsellCard : textWithIllustrationCardModel;
        List list9 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? trendsDtoV3.trendMenuList : list2;
        CardioFitnessLevelModel cardioFitnessLevelModel2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? trendsDtoV3.cardioFitnessLevel : cardioFitnessLevelModel;
        List list10 = (i13 & 524288) != 0 ? trendsDtoV3.metricEducationList : list3;
        List list11 = (i13 & 1048576) != 0 ? trendsDtoV3.infoCalloutList : list4;
        String str11 = (i13 & 2097152) != 0 ? trendsDtoV3.manualMeasurementTextDisplay : str5;
        List list12 = (i13 & 4194304) != 0 ? trendsDtoV3.trendMenus : list5;
        AdditionalInfoTextModel additionalInfoTextModel2 = (i13 & 8388608) != 0 ? trendsDtoV3.additionalInfoText : additionalInfoTextModel;
        List list13 = (i13 & 16777216) != 0 ? trendsDtoV3.designItems : list6;
        if ((i13 & AndroidSDKConstants.FLAG_MUTABLE) != 0) {
            list7 = list13;
            metaData2 = trendsDtoV3.metadata;
        } else {
            metaData2 = metaData;
            list7 = list13;
        }
        return trendsDtoV3.copy(str10, segmentControllerDtoV4, timeSegmentDtoV7, timeSegmentDtoV8, timeSegmentDtoV9, timeSegmentDtoV10, str7, str8, metricEducationV4, list8, articleTileCarouselModel2, integrationsUpsellDtoV4, str9, trendsMenuItemDtoV5, trendsMenuItemDtoV6, manualMeasurementSheet2, textWithIllustrationCardModel2, list9, cardioFitnessLevelModel2, list10, list11, str11, list12, additionalInfoTextModel2, list7, metaData2);
    }

    @InterfaceC37143h("additional_info_text")
    public static /* synthetic */ void getAdditionalInfoText$annotations() {
    }

    @InterfaceC37143h("all_time_segment")
    public static /* synthetic */ void getAllTimeSegment$annotations() {
    }

    @InterfaceC37143h("cardio_fitness_level")
    public static /* synthetic */ void getCardioFitnessLevel$annotations() {
    }

    @InterfaceC37143h("education_carousel")
    public static /* synthetic */ void getEducationCarouselModel$annotations() {
    }

    @InterfaceC23457c
    @InterfaceC37143h("info_callout_display")
    public static /* synthetic */ void getInfoCalloutDisplay$annotations() {
    }

    @InterfaceC37143h("info_callouts")
    public static /* synthetic */ void getInfoCalloutList$annotations() {
    }

    @InterfaceC37143h("integrations_upsell")
    public static /* synthetic */ void getIntegrationsUpsell$annotations() {
    }

    @InterfaceC37143h("manual_measurement_item")
    public static /* synthetic */ void getManualMeasurementItem$annotations() {
    }

    @InterfaceC37143h("manual_measurement_sheet")
    public static /* synthetic */ void getManualMeasurementSheet$annotations() {
    }

    @InterfaceC37143h("manual_measurement_text_display")
    public static /* synthetic */ void getManualMeasurementTextDisplay$annotations() {
    }

    @InterfaceC37143h("metric_education")
    public static /* synthetic */ void getMetricEducation$annotations() {
    }

    @InterfaceC37143h("metric_education_list")
    public static /* synthetic */ void getMetricEducationList$annotations() {
    }

    @InterfaceC37143h("month_time_segment")
    public static /* synthetic */ void getMonthTimeSegment$annotations() {
    }

    @InterfaceC37143h("navigation_sections")
    public static /* synthetic */ void getNavigationSections$annotations() {
    }

    @InterfaceC37143h("no_data_subtext_name_display")
    public static /* synthetic */ void getNoDataGraphSubText$annotations() {
    }

    @InterfaceC37143h("no_data_name_display")
    public static /* synthetic */ void getNoDataGraphText$annotations() {
    }

    @InterfaceC37143h("see_all_data_item")
    public static /* synthetic */ void getSeeAllDataItem$annotations() {
    }

    @InterfaceC37143h("segment_controller")
    public static /* synthetic */ void getSegmentController$annotations() {
    }

    @InterfaceC37143h("six_month_time_segment")
    public static /* synthetic */ void getSixMonthTimeSegment$annotations() {
    }

    @InterfaceC37143h("header_name_display")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @InterfaceC37143h("trend_menu_list")
    public static /* synthetic */ void getTrendMenuList$annotations() {
    }

    @InterfaceC37143h("trend_menus")
    public static /* synthetic */ void getTrendMenus$annotations() {
    }

    @InterfaceC37143h("upsell_card")
    public static /* synthetic */ void getUpsellCard$annotations() {
    }

    @InterfaceC37143h("week_time_segment")
    public static /* synthetic */ void getWeekTimeSegment$annotations() {
    }

    public static final /* synthetic */ void write$Self$trends_release(TrendsDtoV3 self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeSerializableElement(serialDesc, 1, SegmentControllerDtoV3$$serializer.INSTANCE, self.segmentController);
        TimeSegmentDtoV3$$serializer timeSegmentDtoV3$$serializer = TimeSegmentDtoV3$$serializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, timeSegmentDtoV3$$serializer, self.weekTimeSegment);
        output.encodeSerializableElement(serialDesc, 3, timeSegmentDtoV3$$serializer, self.monthTimeSegment);
        output.encodeSerializableElement(serialDesc, 4, timeSegmentDtoV3$$serializer, self.sixMonthTimeSegment);
        output.encodeNullableSerializableElement(serialDesc, 5, timeSegmentDtoV3$$serializer, self.allTimeSegment);
        output.encodeStringElement(serialDesc, 6, self.noDataGraphText);
        output.encodeStringElement(serialDesc, 7, self.noDataGraphSubText);
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.metricEducation != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, MetricEducationV3$$serializer.INSTANCE, self.metricEducation);
        }
        output.encodeSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.navigationSections);
        output.encodeNullableSerializableElement(serialDesc, 10, ArticleTileCarouselModel$$serializer.INSTANCE, self.educationCarouselModel);
        output.encodeNullableSerializableElement(serialDesc, 11, IntegrationsUpsellDtoV3$$serializer.INSTANCE, self.integrationsUpsell);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 12, stringSerializer, self.infoCalloutDisplay);
        TrendsMenuItemDtoV3$$serializer trendsMenuItemDtoV3$$serializer = TrendsMenuItemDtoV3$$serializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 13, trendsMenuItemDtoV3$$serializer, self.manualMeasurementItem);
        output.encodeNullableSerializableElement(serialDesc, 14, trendsMenuItemDtoV3$$serializer, self.seeAllDataItem);
        output.encodeNullableSerializableElement(serialDesc, 15, ManualMeasurementSheet$$serializer.INSTANCE, self.manualMeasurementSheet);
        output.encodeNullableSerializableElement(serialDesc, 16, TextWithIllustrationCardModel$$serializer.INSTANCE, self.upsellCard);
        output.encodeSerializableElement(serialDesc, 17, (InterfaceC37145j) interfaceC23462hArr[17].getValue(), self.trendMenuList);
        output.encodeNullableSerializableElement(serialDesc, 18, CardioFitnessLevelModel$$serializer.INSTANCE, self.cardioFitnessLevel);
        output.encodeNullableSerializableElement(serialDesc, 19, (InterfaceC37145j) interfaceC23462hArr[19].getValue(), self.metricEducationList);
        output.encodeNullableSerializableElement(serialDesc, 20, (InterfaceC37145j) interfaceC23462hArr[20].getValue(), self.infoCalloutList);
        output.encodeNullableSerializableElement(serialDesc, 21, stringSerializer, self.manualMeasurementTextDisplay);
        output.encodeNullableSerializableElement(serialDesc, 22, (InterfaceC37145j) interfaceC23462hArr[22].getValue(), self.trendMenus);
        output.encodeNullableSerializableElement(serialDesc, 23, AdditionalInfoTextModel$$serializer.INSTANCE, self.additionalInfoText);
        if (output.shouldEncodeElementDefault(serialDesc, 24) || self.designItems != null) {
            output.encodeNullableSerializableElement(serialDesc, 24, (InterfaceC37145j) interfaceC23462hArr[24].getValue(), self.designItems);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 25) && self.metadata == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 25, MetaData$$serializer.INSTANCE, self.metadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<NavigationSectionV3> component10() {
        return this.navigationSections;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final ArticleTileCarouselModel getEducationCarouselModel() {
        return this.educationCarouselModel;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final IntegrationsUpsellDtoV3 getIntegrationsUpsell() {
        return this.integrationsUpsell;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getInfoCalloutDisplay() {
        return this.infoCalloutDisplay;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final TrendsMenuItemDtoV3 getManualMeasurementItem() {
        return this.manualMeasurementItem;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final TrendsMenuItemDtoV3 getSeeAllDataItem() {
        return this.seeAllDataItem;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final ManualMeasurementSheet getManualMeasurementSheet() {
        return this.manualMeasurementSheet;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final TextWithIllustrationCardModel getUpsellCard() {
        return this.upsellCard;
    }

    public final List<MenuItemModel> component18() {
        return this.trendMenuList;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final CardioFitnessLevelModel getCardioFitnessLevel() {
        return this.cardioFitnessLevel;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SegmentControllerDtoV3 getSegmentController() {
        return this.segmentController;
    }

    public final List<MetricEducationV3> component20() {
        return this.metricEducationList;
    }

    public final List<InfoCalloutTileModel> component21() {
        return this.infoCalloutList;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getManualMeasurementTextDisplay() {
        return this.manualMeasurementTextDisplay;
    }

    public final List<TrendMenuItemModel> component23() {
        return this.trendMenus;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final AdditionalInfoTextModel getAdditionalInfoText() {
        return this.additionalInfoText;
    }

    public final List<DesignSystemModel> component25() {
        return this.designItems;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final MetaData getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TimeSegmentDtoV3 getWeekTimeSegment() {
        return this.weekTimeSegment;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TimeSegmentDtoV3 getMonthTimeSegment() {
        return this.monthTimeSegment;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TimeSegmentDtoV3 getSixMonthTimeSegment() {
        return this.sixMonthTimeSegment;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TimeSegmentDtoV3 getAllTimeSegment() {
        return this.allTimeSegment;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getNoDataGraphText() {
        return this.noDataGraphText;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getNoDataGraphSubText() {
        return this.noDataGraphSubText;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final MetricEducationV3 getMetricEducation() {
        return this.metricEducation;
    }

    public final TrendsDtoV3 copy(String title, SegmentControllerDtoV3 segmentController, TimeSegmentDtoV3 weekTimeSegment, TimeSegmentDtoV3 monthTimeSegment, TimeSegmentDtoV3 sixMonthTimeSegment, TimeSegmentDtoV3 allTimeSegment, String noDataGraphText, String noDataGraphSubText, MetricEducationV3 metricEducation, List<NavigationSectionV3> navigationSections, ArticleTileCarouselModel educationCarouselModel, IntegrationsUpsellDtoV3 integrationsUpsell, String infoCalloutDisplay, TrendsMenuItemDtoV3 manualMeasurementItem, TrendsMenuItemDtoV3 seeAllDataItem, ManualMeasurementSheet manualMeasurementSheet, TextWithIllustrationCardModel upsellCard, List<MenuItemModel> trendMenuList, CardioFitnessLevelModel cardioFitnessLevel, List<MetricEducationV3> metricEducationList, List<InfoCalloutTileModel> infoCalloutList, String manualMeasurementTextDisplay, List<TrendMenuItemModel> trendMenus, AdditionalInfoTextModel additionalInfoText, List<? extends DesignSystemModel> designItems, MetaData metadata) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(segmentController, "segmentController");
        AbstractC22676k.m65750j(monthTimeSegment, "monthTimeSegment");
        AbstractC22676k.m65750j(sixMonthTimeSegment, "sixMonthTimeSegment");
        AbstractC22676k.m65750j(noDataGraphText, "noDataGraphText");
        AbstractC22676k.m65750j(noDataGraphSubText, "noDataGraphSubText");
        AbstractC22676k.m65750j(navigationSections, "navigationSections");
        AbstractC22676k.m65750j(trendMenuList, "trendMenuList");
        return new TrendsDtoV3(title, segmentController, weekTimeSegment, monthTimeSegment, sixMonthTimeSegment, allTimeSegment, noDataGraphText, noDataGraphSubText, metricEducation, navigationSections, educationCarouselModel, integrationsUpsell, infoCalloutDisplay, manualMeasurementItem, seeAllDataItem, manualMeasurementSheet, upsellCard, trendMenuList, cardioFitnessLevel, metricEducationList, infoCalloutList, manualMeasurementTextDisplay, trendMenus, additionalInfoText, designItems, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrendsDtoV3)) {
            return false;
        }
        TrendsDtoV3 trendsDtoV3 = (TrendsDtoV3) other;
        return AbstractC22676k.m65745e(this.title, trendsDtoV3.title) && AbstractC22676k.m65745e(this.segmentController, trendsDtoV3.segmentController) && AbstractC22676k.m65745e(this.weekTimeSegment, trendsDtoV3.weekTimeSegment) && AbstractC22676k.m65745e(this.monthTimeSegment, trendsDtoV3.monthTimeSegment) && AbstractC22676k.m65745e(this.sixMonthTimeSegment, trendsDtoV3.sixMonthTimeSegment) && AbstractC22676k.m65745e(this.allTimeSegment, trendsDtoV3.allTimeSegment) && AbstractC22676k.m65745e(this.noDataGraphText, trendsDtoV3.noDataGraphText) && AbstractC22676k.m65745e(this.noDataGraphSubText, trendsDtoV3.noDataGraphSubText) && AbstractC22676k.m65745e(this.metricEducation, trendsDtoV3.metricEducation) && AbstractC22676k.m65745e(this.navigationSections, trendsDtoV3.navigationSections) && AbstractC22676k.m65745e(this.educationCarouselModel, trendsDtoV3.educationCarouselModel) && AbstractC22676k.m65745e(this.integrationsUpsell, trendsDtoV3.integrationsUpsell) && AbstractC22676k.m65745e(this.infoCalloutDisplay, trendsDtoV3.infoCalloutDisplay) && AbstractC22676k.m65745e(this.manualMeasurementItem, trendsDtoV3.manualMeasurementItem) && AbstractC22676k.m65745e(this.seeAllDataItem, trendsDtoV3.seeAllDataItem) && AbstractC22676k.m65745e(this.manualMeasurementSheet, trendsDtoV3.manualMeasurementSheet) && AbstractC22676k.m65745e(this.upsellCard, trendsDtoV3.upsellCard) && AbstractC22676k.m65745e(this.trendMenuList, trendsDtoV3.trendMenuList) && AbstractC22676k.m65745e(this.cardioFitnessLevel, trendsDtoV3.cardioFitnessLevel) && AbstractC22676k.m65745e(this.metricEducationList, trendsDtoV3.metricEducationList) && AbstractC22676k.m65745e(this.infoCalloutList, trendsDtoV3.infoCalloutList) && AbstractC22676k.m65745e(this.manualMeasurementTextDisplay, trendsDtoV3.manualMeasurementTextDisplay) && AbstractC22676k.m65745e(this.trendMenus, trendsDtoV3.trendMenus) && AbstractC22676k.m65745e(this.additionalInfoText, trendsDtoV3.additionalInfoText) && AbstractC22676k.m65745e(this.designItems, trendsDtoV3.designItems) && AbstractC22676k.m65745e(this.metadata, trendsDtoV3.metadata);
    }

    public final AdditionalInfoTextModel getAdditionalInfoText() {
        return this.additionalInfoText;
    }

    public final TimeSegmentDtoV3 getAllTimeSegment() {
        return this.allTimeSegment;
    }

    public final CardioFitnessLevelModel getCardioFitnessLevel() {
        return this.cardioFitnessLevel;
    }

    public final List<DesignSystemModel> getDesignItems() {
        return this.designItems;
    }

    public final ArticleTileCarouselModel getEducationCarouselModel() {
        return this.educationCarouselModel;
    }

    public final String getInfoCalloutDisplay() {
        return this.infoCalloutDisplay;
    }

    public final List<InfoCalloutTileModel> getInfoCalloutList() {
        return this.infoCalloutList;
    }

    public final IntegrationsUpsellDtoV3 getIntegrationsUpsell() {
        return this.integrationsUpsell;
    }

    public final TrendsMenuItemDtoV3 getManualMeasurementItem() {
        return this.manualMeasurementItem;
    }

    public final ManualMeasurementSheet getManualMeasurementSheet() {
        return this.manualMeasurementSheet;
    }

    public final String getManualMeasurementTextDisplay() {
        return this.manualMeasurementTextDisplay;
    }

    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final MetricEducationV3 getMetricEducation() {
        return this.metricEducation;
    }

    public final List<MetricEducationV3> getMetricEducationList() {
        return this.metricEducationList;
    }

    public final TimeSegmentDtoV3 getMonthTimeSegment() {
        return this.monthTimeSegment;
    }

    public final List<NavigationSectionV3> getNavigationSections() {
        return this.navigationSections;
    }

    public final String getNoDataGraphSubText() {
        return this.noDataGraphSubText;
    }

    public final String getNoDataGraphText() {
        return this.noDataGraphText;
    }

    public final TrendsMenuItemDtoV3 getSeeAllDataItem() {
        return this.seeAllDataItem;
    }

    public final SegmentControllerDtoV3 getSegmentController() {
        return this.segmentController;
    }

    public final TimeSegmentDtoV3 getSixMonthTimeSegment() {
        return this.sixMonthTimeSegment;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<MenuItemModel> getTrendMenuList() {
        return this.trendMenuList;
    }

    public final List<TrendMenuItemModel> getTrendMenus() {
        return this.trendMenus;
    }

    public final TextWithIllustrationCardModel getUpsellCard() {
        return this.upsellCard;
    }

    public final TimeSegmentDtoV3 getWeekTimeSegment() {
        return this.weekTimeSegment;
    }

    public int hashCode() {
        int iHashCode = (this.segmentController.hashCode() + (this.title.hashCode() * 31)) * 31;
        TimeSegmentDtoV3 timeSegmentDtoV3 = this.weekTimeSegment;
        int iHashCode2 = (this.sixMonthTimeSegment.hashCode() + ((this.monthTimeSegment.hashCode() + ((iHashCode + (timeSegmentDtoV3 == null ? 0 : timeSegmentDtoV3.hashCode())) * 31)) * 31)) * 31;
        TimeSegmentDtoV3 timeSegmentDtoV4 = this.allTimeSegment;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode2 + (timeSegmentDtoV4 == null ? 0 : timeSegmentDtoV4.hashCode())) * 31, 31, this.noDataGraphText), 31, this.noDataGraphSubText);
        MetricEducationV3 metricEducationV3 = this.metricEducation;
        int iM31983b = AbstractC11895b.m31983b((iM30450d + (metricEducationV3 == null ? 0 : metricEducationV3.hashCode())) * 31, 31, this.navigationSections);
        ArticleTileCarouselModel articleTileCarouselModel = this.educationCarouselModel;
        int iHashCode3 = (iM31983b + (articleTileCarouselModel == null ? 0 : articleTileCarouselModel.hashCode())) * 31;
        IntegrationsUpsellDtoV3 integrationsUpsellDtoV3 = this.integrationsUpsell;
        int iHashCode4 = (iHashCode3 + (integrationsUpsellDtoV3 == null ? 0 : integrationsUpsellDtoV3.hashCode())) * 31;
        String str = this.infoCalloutDisplay;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        TrendsMenuItemDtoV3 trendsMenuItemDtoV3 = this.manualMeasurementItem;
        int iHashCode6 = (iHashCode5 + (trendsMenuItemDtoV3 == null ? 0 : trendsMenuItemDtoV3.hashCode())) * 31;
        TrendsMenuItemDtoV3 trendsMenuItemDtoV4 = this.seeAllDataItem;
        int iHashCode7 = (iHashCode6 + (trendsMenuItemDtoV4 == null ? 0 : trendsMenuItemDtoV4.hashCode())) * 31;
        ManualMeasurementSheet manualMeasurementSheet = this.manualMeasurementSheet;
        int iHashCode8 = (iHashCode7 + (manualMeasurementSheet == null ? 0 : manualMeasurementSheet.hashCode())) * 31;
        TextWithIllustrationCardModel textWithIllustrationCardModel = this.upsellCard;
        int iM31983b2 = AbstractC11895b.m31983b((iHashCode8 + (textWithIllustrationCardModel == null ? 0 : textWithIllustrationCardModel.hashCode())) * 31, 31, this.trendMenuList);
        CardioFitnessLevelModel cardioFitnessLevelModel = this.cardioFitnessLevel;
        int iHashCode9 = (iM31983b2 + (cardioFitnessLevelModel == null ? 0 : cardioFitnessLevelModel.hashCode())) * 31;
        List<MetricEducationV3> list = this.metricEducationList;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List<InfoCalloutTileModel> list2 = this.infoCalloutList;
        int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.manualMeasurementTextDisplay;
        int iHashCode12 = (iHashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<TrendMenuItemModel> list3 = this.trendMenus;
        int iHashCode13 = (iHashCode12 + (list3 == null ? 0 : list3.hashCode())) * 31;
        AdditionalInfoTextModel additionalInfoTextModel = this.additionalInfoText;
        int iHashCode14 = (iHashCode13 + (additionalInfoTextModel == null ? 0 : additionalInfoTextModel.hashCode())) * 31;
        List<DesignSystemModel> list4 = this.designItems;
        int iHashCode15 = (iHashCode14 + (list4 == null ? 0 : list4.hashCode())) * 31;
        MetaData metaData = this.metadata;
        return iHashCode15 + (metaData != null ? metaData.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        SegmentControllerDtoV3 segmentControllerDtoV3 = this.segmentController;
        TimeSegmentDtoV3 timeSegmentDtoV3 = this.weekTimeSegment;
        TimeSegmentDtoV3 timeSegmentDtoV4 = this.monthTimeSegment;
        TimeSegmentDtoV3 timeSegmentDtoV5 = this.sixMonthTimeSegment;
        TimeSegmentDtoV3 timeSegmentDtoV6 = this.allTimeSegment;
        String str2 = this.noDataGraphText;
        String str3 = this.noDataGraphSubText;
        MetricEducationV3 metricEducationV3 = this.metricEducation;
        List<NavigationSectionV3> list = this.navigationSections;
        ArticleTileCarouselModel articleTileCarouselModel = this.educationCarouselModel;
        IntegrationsUpsellDtoV3 integrationsUpsellDtoV3 = this.integrationsUpsell;
        String str4 = this.infoCalloutDisplay;
        TrendsMenuItemDtoV3 trendsMenuItemDtoV3 = this.manualMeasurementItem;
        TrendsMenuItemDtoV3 trendsMenuItemDtoV4 = this.seeAllDataItem;
        ManualMeasurementSheet manualMeasurementSheet = this.manualMeasurementSheet;
        TextWithIllustrationCardModel textWithIllustrationCardModel = this.upsellCard;
        List<MenuItemModel> list2 = this.trendMenuList;
        CardioFitnessLevelModel cardioFitnessLevelModel = this.cardioFitnessLevel;
        List<MetricEducationV3> list3 = this.metricEducationList;
        List<InfoCalloutTileModel> list4 = this.infoCalloutList;
        String str5 = this.manualMeasurementTextDisplay;
        List<TrendMenuItemModel> list5 = this.trendMenus;
        AdditionalInfoTextModel additionalInfoTextModel = this.additionalInfoText;
        List<DesignSystemModel> list6 = this.designItems;
        MetaData metaData = this.metadata;
        StringBuilder sb4 = new StringBuilder("TrendsDtoV3(title=");
        sb4.append(str);
        sb4.append(", segmentController=");
        sb4.append(segmentControllerDtoV3);
        sb4.append(", weekTimeSegment=");
        sb4.append(timeSegmentDtoV3);
        sb4.append(", monthTimeSegment=");
        sb4.append(timeSegmentDtoV4);
        sb4.append(", sixMonthTimeSegment=");
        sb4.append(timeSegmentDtoV5);
        sb4.append(", allTimeSegment=");
        sb4.append(timeSegmentDtoV6);
        sb4.append(", noDataGraphText=");
        AbstractC11266d.m30444B(sb4, str2, ", noDataGraphSubText=", str3, ", metricEducation=");
        sb4.append(metricEducationV3);
        sb4.append(", navigationSections=");
        sb4.append(list);
        sb4.append(", educationCarouselModel=");
        sb4.append(articleTileCarouselModel);
        sb4.append(", integrationsUpsell=");
        sb4.append(integrationsUpsellDtoV3);
        sb4.append(", infoCalloutDisplay=");
        sb4.append(str4);
        sb4.append(", manualMeasurementItem=");
        sb4.append(trendsMenuItemDtoV3);
        sb4.append(", seeAllDataItem=");
        sb4.append(trendsMenuItemDtoV4);
        sb4.append(", manualMeasurementSheet=");
        sb4.append(manualMeasurementSheet);
        sb4.append(", upsellCard=");
        sb4.append(textWithIllustrationCardModel);
        sb4.append(", trendMenuList=");
        sb4.append(list2);
        sb4.append(", cardioFitnessLevel=");
        sb4.append(cardioFitnessLevelModel);
        sb4.append(", metricEducationList=");
        sb4.append(list3);
        sb4.append(", infoCalloutList=");
        AbstractC17176i.m48511m(", manualMeasurementTextDisplay=", str5, ", trendMenus=", sb4, list4);
        sb4.append(list5);
        sb4.append(", additionalInfoText=");
        sb4.append(additionalInfoTextModel);
        sb4.append(", designItems=");
        sb4.append(list6);
        sb4.append(", metadata=");
        sb4.append(metaData);
        sb4.append(")");
        return sb4.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TrendsDtoV3(String title, SegmentControllerDtoV3 segmentController, TimeSegmentDtoV3 timeSegmentDtoV3, TimeSegmentDtoV3 monthTimeSegment, TimeSegmentDtoV3 sixMonthTimeSegment, TimeSegmentDtoV3 timeSegmentDtoV4, String noDataGraphText, String noDataGraphSubText, MetricEducationV3 metricEducationV3, List<NavigationSectionV3> navigationSections, ArticleTileCarouselModel articleTileCarouselModel, IntegrationsUpsellDtoV3 integrationsUpsellDtoV3, String str, TrendsMenuItemDtoV3 trendsMenuItemDtoV3, TrendsMenuItemDtoV3 trendsMenuItemDtoV4, ManualMeasurementSheet manualMeasurementSheet, TextWithIllustrationCardModel textWithIllustrationCardModel, List<MenuItemModel> trendMenuList, CardioFitnessLevelModel cardioFitnessLevelModel, List<MetricEducationV3> list, List<InfoCalloutTileModel> list2, String str2, List<TrendMenuItemModel> list3, AdditionalInfoTextModel additionalInfoTextModel, List<? extends DesignSystemModel> list4, MetaData metaData) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(segmentController, "segmentController");
        AbstractC22676k.m65750j(monthTimeSegment, "monthTimeSegment");
        AbstractC22676k.m65750j(sixMonthTimeSegment, "sixMonthTimeSegment");
        AbstractC22676k.m65750j(noDataGraphText, "noDataGraphText");
        AbstractC22676k.m65750j(noDataGraphSubText, "noDataGraphSubText");
        AbstractC22676k.m65750j(navigationSections, "navigationSections");
        AbstractC22676k.m65750j(trendMenuList, "trendMenuList");
        this.title = title;
        this.segmentController = segmentController;
        this.weekTimeSegment = timeSegmentDtoV3;
        this.monthTimeSegment = monthTimeSegment;
        this.sixMonthTimeSegment = sixMonthTimeSegment;
        this.allTimeSegment = timeSegmentDtoV4;
        this.noDataGraphText = noDataGraphText;
        this.noDataGraphSubText = noDataGraphSubText;
        this.metricEducation = metricEducationV3;
        this.navigationSections = navigationSections;
        this.educationCarouselModel = articleTileCarouselModel;
        this.integrationsUpsell = integrationsUpsellDtoV3;
        this.infoCalloutDisplay = str;
        this.manualMeasurementItem = trendsMenuItemDtoV3;
        this.seeAllDataItem = trendsMenuItemDtoV4;
        this.manualMeasurementSheet = manualMeasurementSheet;
        this.upsellCard = textWithIllustrationCardModel;
        this.trendMenuList = trendMenuList;
        this.cardioFitnessLevel = cardioFitnessLevelModel;
        this.metricEducationList = list;
        this.infoCalloutList = list2;
        this.manualMeasurementTextDisplay = str2;
        this.trendMenus = list3;
        this.additionalInfoText = additionalInfoTextModel;
        this.designItems = list4;
        this.metadata = metaData;
    }

    public /* synthetic */ TrendsDtoV3(String str, SegmentControllerDtoV3 segmentControllerDtoV3, TimeSegmentDtoV3 timeSegmentDtoV3, TimeSegmentDtoV3 timeSegmentDtoV4, TimeSegmentDtoV3 timeSegmentDtoV5, TimeSegmentDtoV3 timeSegmentDtoV6, String str2, String str3, MetricEducationV3 metricEducationV3, List list, ArticleTileCarouselModel articleTileCarouselModel, IntegrationsUpsellDtoV3 integrationsUpsellDtoV3, String str4, TrendsMenuItemDtoV3 trendsMenuItemDtoV3, TrendsMenuItemDtoV3 trendsMenuItemDtoV4, ManualMeasurementSheet manualMeasurementSheet, TextWithIllustrationCardModel textWithIllustrationCardModel, List list2, CardioFitnessLevelModel cardioFitnessLevelModel, List list3, List list4, String str5, List list5, AdditionalInfoTextModel additionalInfoTextModel, List list6, MetaData metaData, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, segmentControllerDtoV3, timeSegmentDtoV3, timeSegmentDtoV4, timeSegmentDtoV5, timeSegmentDtoV6, str2, str3, (i13 & 256) != 0 ? null : metricEducationV3, list, articleTileCarouselModel, integrationsUpsellDtoV3, str4, trendsMenuItemDtoV3, trendsMenuItemDtoV4, manualMeasurementSheet, textWithIllustrationCardModel, list2, cardioFitnessLevelModel, list3, list4, str5, list5, additionalInfoTextModel, (16777216 & i13) != 0 ? null : list6, (i13 & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? null : metaData);
    }
}
