package com.whoop.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.whoop.personalrecords.miniarch.domain.PersonalRecordsApiKt;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import live.hms.video.media.tracks.HMSTrackSource;
import m83.AbstractC25260n;
import m83.C25235a0;
import p000.AbstractC11266d;
import p098dt.AbstractC12350b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yb3.AbstractC39421y;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000×\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0003\bÕ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000e2\u00020\u0001:«\u0002\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001 \u0001¡\u0001¢\u0001£\u0001¤\u0001¥\u0001¦\u0001§\u0001¨\u0001©\u0001ª\u0001«\u0001¬\u0001\u00ad\u0001®\u0001¯\u0001°\u0001±\u0001²\u0001³\u0001´\u0001µ\u0001¶\u0001·\u0001¸\u0001¹\u0001º\u0001»\u0001¼\u0001½\u0001¾\u0001¿\u0001À\u0001Á\u0001Â\u0001Ã\u0001Ä\u0001Å\u0001Æ\u0001Ç\u0001È\u0001É\u0001Ê\u0001Ë\u0001Ì\u0001Í\u0001Î\u0001Ï\u0001Ð\u0001Ñ\u0001Ò\u0001Ó\u0001Ô\u0001Õ\u0001Ö\u0001×\u0001Ø\u0001Ù\u0001Ú\u0001Û\u0001Ü\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006\u0082\u0001\u009c\u0003Ý\u0001Þ\u0001ß\u0001à\u0001á\u0001â\u0001ã\u0001ä\u0001å\u0001æ\u0001ç\u0001è\u0001é\u0001ê\u0001ë\u0001ì\u0001í\u0001î\u0001ï\u0001ð\u0001ñ\u0001ò\u0001ó\u0001ô\u0001õ\u0001ö\u0001÷\u0001ø\u0001ù\u0001ú\u0001û\u0001ü\u0001ý\u0001þ\u0001ÿ\u0001\u0080\u0002\u0081\u0002\u0082\u0002\u0083\u0002\u0084\u0002\u0085\u0002\u0086\u0002\u0087\u0002\u0088\u0002\u0089\u0002\u008a\u0002\u008b\u0002\u008c\u0002\u008d\u0002\u008e\u0002\u008f\u0002\u0090\u0002\u0091\u0002\u0092\u0002\u0093\u0002\u0094\u0002\u0095\u0002\u0096\u0002\u0097\u0002\u0098\u0002\u0099\u0002\u009a\u0002\u009b\u0002\u009c\u0002\u009d\u0002\u009e\u0002\u009f\u0002 \u0002¡\u0002¢\u0002£\u0002¤\u0002¥\u0002¦\u0002§\u0002¨\u0002©\u0002ª\u0002«\u0002¬\u0002\u00ad\u0002®\u0002¯\u0002°\u0002±\u0002²\u0002³\u0002´\u0002µ\u0002¶\u0002·\u0002¸\u0002¹\u0002º\u0002»\u0002¼\u0002½\u0002¾\u0002¿\u0002À\u0002Á\u0002Â\u0002Ã\u0002Ä\u0002Å\u0002Æ\u0002Ç\u0002È\u0002É\u0002Ê\u0002Ë\u0002Ì\u0002Í\u0002Î\u0002Ï\u0002Ð\u0002Ñ\u0002Ò\u0002Ó\u0002Ô\u0002Õ\u0002Ö\u0002×\u0002Ø\u0002Ù\u0002Ú\u0002Û\u0002Ü\u0002Ý\u0002Þ\u0002ß\u0002à\u0002á\u0002â\u0002ã\u0002ä\u0002å\u0002æ\u0002ç\u0002è\u0002é\u0002ê\u0002ë\u0002ì\u0002í\u0002î\u0002ï\u0002ð\u0002ñ\u0002ò\u0002ó\u0002ô\u0002õ\u0002ö\u0002÷\u0002ø\u0002ù\u0002ú\u0002û\u0002ü\u0002ý\u0002þ\u0002ÿ\u0002\u0080\u0003\u0081\u0003\u0082\u0003\u0083\u0003\u0084\u0003\u0085\u0003\u0086\u0003\u0087\u0003\u0088\u0003\u0089\u0003\u008a\u0003\u008b\u0003\u008c\u0003\u008d\u0003\u008e\u0003\u008f\u0003\u0090\u0003\u0091\u0003\u0092\u0003\u0093\u0003\u0094\u0003\u0095\u0003\u0096\u0003\u0097\u0003\u0098\u0003\u0099\u0003\u009a\u0003\u009b\u0003\u009c\u0003\u009d\u0003\u009e\u0003\u009f\u0003 \u0003¡\u0003¢\u0003£\u0003¤\u0003¥\u0003¦\u0003§\u0003¨\u0003©\u0003ª\u0003¨\u0006«\u0003"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "otherNames", "Ljava/util/Set;", "getOtherNames", "()Ljava/util/Set;", "getName", "name", "Companion", "c", "a", "b", "d", "e", "f", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "x", "y", "z", "a0", "b0", "j0", "c0", "d0", "e0", "f0", "g0", "h0", "i0", "l0", "n0", "o0", "k0", "p0", "q0", "r0", "t0", "v0", "u0", "w0", "x0", "y0", "z0", "a1", "b1", "c1", "d1", "f1", "e1", "g1", "j1", "i1", "k1", "m1", "y1", "z1", "r1", "s1", "l1", "t1", "u1", "v1", "w1", "x1", "a2", "b2", "d2", "e2", "c2", "f2", "g2", "h2", "i2", "j2", "k2", "l2", "m2", "n2", "o2", "p2", "q2", "r2", "s2", "t2", "u2", "v2", "w2", "x2", "y2", "z2", "a3", "b3", "c3", "d3", "e3", "f3", "g3", "h3", "i3", "j3", "k3", "l3", "m3", "n3", "o3", "p3", "r3", "q3", "s3", "t3", "u3", PersonalRecordsApiKt.VERSION, "w3", "x3", "y3", "z3", "a4", "b4", "c4", "d4", "e4", "g4", "f4", "r4", "h4", "i4", "j4", "k4", "l4", "m4", "n4", "p4", "q4", "o4", "u4", "v4", "w4", "x4", "y4", "z4", "a5", "b5", "c5", "d5", "e5", "f5", "g5", "h5", "i5", "j5", "k5", "l5", "m5", "n5", "o5", "p5", "q5", "t5", "r5", "s5", "u5", "v5", "w5", "x5", "y5", "z5", "n1", "o1", "p1", "a6", "s0", "j6", "k6", "n6", "o6", "m6", "l6", "d6", "h1", "e6", "f6", "c6", "b6", "i6", "g6", "h6", "URLScreen", "s4", "m0", "t4", "p6", "q6", "r6", "t6", "s6", "u6", "v6", "w6", "q1", "Lcom/whoop/navigation/AppScreen$a;", "Lcom/whoop/navigation/AppScreen$b;", "Lcom/whoop/navigation/AppScreen$c;", "Lcom/whoop/navigation/AppScreen$d;", "Lcom/whoop/navigation/AppScreen$e;", "Lcom/whoop/navigation/AppScreen$f;", "Lcom/whoop/navigation/AppScreen$g;", "Lcom/whoop/navigation/AppScreen$h;", "Lcom/whoop/navigation/AppScreen$i;", "Lcom/whoop/navigation/AppScreen$j;", "Lcom/whoop/navigation/AppScreen$k;", "Lcom/whoop/navigation/AppScreen$l;", "Lcom/whoop/navigation/AppScreen$m;", "Lcom/whoop/navigation/AppScreen$n;", "Lcom/whoop/navigation/AppScreen$o;", "Lcom/whoop/navigation/AppScreen$p;", "Lcom/whoop/navigation/AppScreen$q;", "Lcom/whoop/navigation/AppScreen$r;", "Lcom/whoop/navigation/AppScreen$s;", "Lcom/whoop/navigation/AppScreen$t;", "Lcom/whoop/navigation/AppScreen$u;", "Lcom/whoop/navigation/AppScreen$v;", "Lcom/whoop/navigation/AppScreen$w;", "Lcom/whoop/navigation/AppScreen$x;", "Lcom/whoop/navigation/AppScreen$y;", "Lcom/whoop/navigation/AppScreen$z;", "Lcom/whoop/navigation/AppScreen$a0;", "Lcom/whoop/navigation/AppScreen$b0;", "Lcom/whoop/navigation/AppScreen$c0;", "Lcom/whoop/navigation/AppScreen$d0;", "Lcom/whoop/navigation/AppScreen$e0;", "Lcom/whoop/navigation/AppScreen$f0;", "Lcom/whoop/navigation/AppScreen$g0;", "Lcom/whoop/navigation/AppScreen$h0;", "Lcom/whoop/navigation/AppScreen$i0;", "Lcom/whoop/navigation/AppScreen$j0;", "Lcom/whoop/navigation/AppScreen$k0;", "Lcom/whoop/navigation/AppScreen$l0;", "Lcom/whoop/navigation/AppScreen$m0;", "Lcom/whoop/navigation/AppScreen$n0;", "Lcom/whoop/navigation/AppScreen$o0;", "Lcom/whoop/navigation/AppScreen$p0;", "Lcom/whoop/navigation/AppScreen$q0;", "Lcom/whoop/navigation/AppScreen$r0;", "Lcom/whoop/navigation/AppScreen$s0;", "Lcom/whoop/navigation/AppScreen$t0;", "Lcom/whoop/navigation/AppScreen$u0;", "Lcom/whoop/navigation/AppScreen$v0;", "Lcom/whoop/navigation/AppScreen$w0;", "Lcom/whoop/navigation/AppScreen$x0;", "Lcom/whoop/navigation/AppScreen$y0;", "Lcom/whoop/navigation/AppScreen$z0;", "Lcom/whoop/navigation/AppScreen$a1;", "Lcom/whoop/navigation/AppScreen$b1;", "Lcom/whoop/navigation/AppScreen$c1;", "Lcom/whoop/navigation/AppScreen$d1;", "Lcom/whoop/navigation/AppScreen$e1;", "Lcom/whoop/navigation/AppScreen$f1;", "Lcom/whoop/navigation/AppScreen$g1;", "Lcom/whoop/navigation/AppScreen$h1;", "Lcom/whoop/navigation/AppScreen$i1;", "Lcom/whoop/navigation/AppScreen$j1;", "Lcom/whoop/navigation/AppScreen$k1;", "Lcom/whoop/navigation/AppScreen$l1;", "Lcom/whoop/navigation/AppScreen$m1;", "Lcom/whoop/navigation/AppScreen$n1;", "Lcom/whoop/navigation/AppScreen$o1;", "Lcom/whoop/navigation/AppScreen$p1;", "Lcom/whoop/navigation/AppScreen$r1;", "Lcom/whoop/navigation/AppScreen$s1;", "Lcom/whoop/navigation/AppScreen$t1;", "Lcom/whoop/navigation/AppScreen$u1;", "Lcom/whoop/navigation/AppScreen$v1;", "Lcom/whoop/navigation/AppScreen$w1;", "Lcom/whoop/navigation/AppScreen$x1;", "Lcom/whoop/navigation/AppScreen$y1;", "Lcom/whoop/navigation/AppScreen$z1;", "Lcom/whoop/navigation/AppScreen$a2;", "Lcom/whoop/navigation/AppScreen$b2;", "Lcom/whoop/navigation/AppScreen$c2;", "Lcom/whoop/navigation/AppScreen$d2;", "Lcom/whoop/navigation/AppScreen$e2;", "Lcom/whoop/navigation/AppScreen$f2;", "Lcom/whoop/navigation/AppScreen$g2;", "Lcom/whoop/navigation/AppScreen$h2;", "Lcom/whoop/navigation/AppScreen$i2;", "Lcom/whoop/navigation/AppScreen$j2;", "Lcom/whoop/navigation/AppScreen$k2;", "Lcom/whoop/navigation/AppScreen$l2;", "Lcom/whoop/navigation/AppScreen$m2;", "Lcom/whoop/navigation/AppScreen$n2;", "Lcom/whoop/navigation/AppScreen$o2;", "Lcom/whoop/navigation/AppScreen$p2;", "Lcom/whoop/navigation/AppScreen$q2;", "Lcom/whoop/navigation/AppScreen$r2;", "Lcom/whoop/navigation/AppScreen$s2;", "Lcom/whoop/navigation/AppScreen$t2;", "Lcom/whoop/navigation/AppScreen$u2;", "Lcom/whoop/navigation/AppScreen$v2;", "Lcom/whoop/navigation/AppScreen$w2;", "Lcom/whoop/navigation/AppScreen$x2;", "Lcom/whoop/navigation/AppScreen$y2;", "Lcom/whoop/navigation/AppScreen$z2;", "Lcom/whoop/navigation/AppScreen$a3;", "Lcom/whoop/navigation/AppScreen$b3;", "Lcom/whoop/navigation/AppScreen$c3;", "Lcom/whoop/navigation/AppScreen$d3;", "Lcom/whoop/navigation/AppScreen$e3;", "Lcom/whoop/navigation/AppScreen$f3;", "Lcom/whoop/navigation/AppScreen$g3;", "Lcom/whoop/navigation/AppScreen$h3;", "Lcom/whoop/navigation/AppScreen$i3;", "Lcom/whoop/navigation/AppScreen$j3;", "Lcom/whoop/navigation/AppScreen$k3;", "Lcom/whoop/navigation/AppScreen$l3;", "Lcom/whoop/navigation/AppScreen$m3;", "Lcom/whoop/navigation/AppScreen$n3;", "Lcom/whoop/navigation/AppScreen$o3;", "Lcom/whoop/navigation/AppScreen$p3;", "Lcom/whoop/navigation/AppScreen$q3;", "Lcom/whoop/navigation/AppScreen$r3;", "Lcom/whoop/navigation/AppScreen$s3;", "Lcom/whoop/navigation/AppScreen$t3;", "Lcom/whoop/navigation/AppScreen$u3;", "Lcom/whoop/navigation/AppScreen$v3;", "Lcom/whoop/navigation/AppScreen$w3;", "Lcom/whoop/navigation/AppScreen$x3;", "Lcom/whoop/navigation/AppScreen$y3;", "Lcom/whoop/navigation/AppScreen$z3;", "Lcom/whoop/navigation/AppScreen$a4;", "Lcom/whoop/navigation/AppScreen$b4;", "Lcom/whoop/navigation/AppScreen$c4;", "Lcom/whoop/navigation/AppScreen$d4;", "Lcom/whoop/navigation/AppScreen$e4;", "Lcom/whoop/navigation/AppScreen$f4;", "Lcom/whoop/navigation/AppScreen$g4;", "Lcom/whoop/navigation/AppScreen$h4;", "Lcom/whoop/navigation/AppScreen$i4;", "Lcom/whoop/navigation/AppScreen$j4;", "Lcom/whoop/navigation/AppScreen$k4;", "Lcom/whoop/navigation/AppScreen$l4;", "Lcom/whoop/navigation/AppScreen$m4;", "Lcom/whoop/navigation/AppScreen$n4;", "Lcom/whoop/navigation/AppScreen$o4;", "Lcom/whoop/navigation/AppScreen$p4;", "Lcom/whoop/navigation/AppScreen$q4;", "Lcom/whoop/navigation/AppScreen$r4;", "Lcom/whoop/navigation/AppScreen$s4;", "Lcom/whoop/navigation/AppScreen$t4;", "Lcom/whoop/navigation/AppScreen$u4;", "Lcom/whoop/navigation/AppScreen$v4;", "Lcom/whoop/navigation/AppScreen$w4;", "Lcom/whoop/navigation/AppScreen$x4;", "Lcom/whoop/navigation/AppScreen$y4;", "Lcom/whoop/navigation/AppScreen$z4;", "Lcom/whoop/navigation/AppScreen$a5;", "Lcom/whoop/navigation/AppScreen$b5;", "Lcom/whoop/navigation/AppScreen$c5;", "Lcom/whoop/navigation/AppScreen$d5;", "Lcom/whoop/navigation/AppScreen$e5;", "Lcom/whoop/navigation/AppScreen$f5;", "Lcom/whoop/navigation/AppScreen$g5;", "Lcom/whoop/navigation/AppScreen$h5;", "Lcom/whoop/navigation/AppScreen$i5;", "Lcom/whoop/navigation/AppScreen$j5;", "Lcom/whoop/navigation/AppScreen$k5;", "Lcom/whoop/navigation/AppScreen$l5;", "Lcom/whoop/navigation/AppScreen$m5;", "Lcom/whoop/navigation/AppScreen$n5;", "Lcom/whoop/navigation/AppScreen$o5;", "Lcom/whoop/navigation/AppScreen$p5;", "Lcom/whoop/navigation/AppScreen$q5;", "Lcom/whoop/navigation/AppScreen$r5;", "Lcom/whoop/navigation/AppScreen$s5;", "Lcom/whoop/navigation/AppScreen$t5;", "Lcom/whoop/navigation/AppScreen$u5;", "Lcom/whoop/navigation/AppScreen$v5;", "Lcom/whoop/navigation/AppScreen$w5;", "Lcom/whoop/navigation/AppScreen$x5;", "Lcom/whoop/navigation/AppScreen$y5;", "Lcom/whoop/navigation/AppScreen$z5;", "Lcom/whoop/navigation/AppScreen$a6;", "Lcom/whoop/navigation/AppScreen$URLScreen;", "Lcom/whoop/navigation/AppScreen$b6;", "Lcom/whoop/navigation/AppScreen$c6;", "Lcom/whoop/navigation/AppScreen$d6;", "Lcom/whoop/navigation/AppScreen$e6;", "Lcom/whoop/navigation/AppScreen$f6;", "Lcom/whoop/navigation/AppScreen$g6;", "Lcom/whoop/navigation/AppScreen$h6;", "Lcom/whoop/navigation/AppScreen$i6;", "Lcom/whoop/navigation/AppScreen$j6;", "Lcom/whoop/navigation/AppScreen$k6;", "Lcom/whoop/navigation/AppScreen$l6;", "Lcom/whoop/navigation/AppScreen$m6;", "Lcom/whoop/navigation/AppScreen$n6;", "Lcom/whoop/navigation/AppScreen$o6;", "Lcom/whoop/navigation/AppScreen$p6;", "Lcom/whoop/navigation/AppScreen$q6;", "Lcom/whoop/navigation/AppScreen$r6;", "Lcom/whoop/navigation/AppScreen$s6;", "Lcom/whoop/navigation/AppScreen$t6;", "Lcom/whoop/navigation/AppScreen$u6;", "Lcom/whoop/navigation/AppScreen$v6;", "Lcom/whoop/navigation/AppScreen$w6;", "Lcom/whoop/navigation/FeatureSpecificAppScreen;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AppScreen {
    private final Set<String> otherNames;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Locale locale = Locale.US;

    @Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0002,-B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u001a\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010\u0019J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010\u0017R\u001a\u0010\t\u001a\u00020\u00038\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b*\u0010\u0017¨\u0006."}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$URLScreen;", "Lcom/whoop/navigation/AppScreen;", "Landroid/os/Parcelable;", "", QueryParams.URL, "<init>", "(Ljava/lang/String;)V", "", "seen0", "name", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/AppScreen$URLScreen;Lzc3/c;Lyc3/g;)V", "write$Self", "toString", "()Ljava/lang/String;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "copy", "(Ljava/lang/String;)Lcom/whoop/navigation/AppScreen$URLScreen;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "getName", "Companion", "a", "$serializer", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class URLScreen extends AppScreen implements Parcelable {
        public static final String NAME = "URL";
        private final String name;
        private final String url;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<URLScreen> CREATOR = new C9262b();

        /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$URLScreen$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$URLScreen$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/AppScreen$URLScreen;", "serializer", "()Lwc3/c;", "", "NAME", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return AppScreen$URLScreen$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$URLScreen$b */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C9262b implements Parcelable.Creator<URLScreen> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final URLScreen createFromParcel(Parcel parcel) {
                AbstractC22676k.m65750j(parcel, "parcel");
                return new URLScreen(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final URLScreen[] newArray(int i13) {
                return new URLScreen[i13];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public URLScreen() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ URLScreen copy$default(URLScreen uRLScreen, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = uRLScreen.url;
            }
            return uRLScreen.copy(str);
        }

        public static final /* synthetic */ void write$Self$navigation_release(URLScreen self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.url, "")) {
                output.encodeStringElement(serialDesc, 0, self.url);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 1) && AbstractC22676k.m65745e(self.getName(), NAME)) {
                return;
            }
            output.encodeStringElement(serialDesc, 1, self.getName());
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final URLScreen copy(String url) {
            AbstractC22676k.m65750j(url, "url");
            return new URLScreen(url);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof URLScreen) && AbstractC22676k.m65745e(this.url, ((URLScreen) other).url);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return this.name;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        @Override // com.whoop.navigation.AppScreen
        public String toString() {
            return AbstractC11266d.m30461o("AppScreen.", getName());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC22676k.m65750j(dest, "dest");
            dest.writeString(this.url);
        }

        public /* synthetic */ URLScreen(int i13, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            this.url = (i13 & 1) == 0 ? "" : str;
            if ((i13 & 2) == 0) {
                this.name = NAME;
            } else {
                this.name = str2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public URLScreen(String url) {
            super(null);
            AbstractC22676k.m65750j(url, "url");
            this.url = url;
            this.name = NAME;
        }

        public /* synthetic */ URLScreen(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "" : str);
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$a;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9263a extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9263a f27461w = new C9263a();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "RECONFIRM_BASELINES";

        /* JADX INFO: renamed from: y */
        public static final int f27463y = 8;

        private C9263a() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$a0 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$a0;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9264a0 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9264a0 f27464w = new C9264a0();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ADVANCED_LABS_HOME";

        /* JADX INFO: renamed from: y */
        public static final int f27466y = 8;

        private C9264a0() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$a1 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$a1;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9265a1 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9265a1 f27467w = new C9265a1();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "BEHAVIOR_IMPACTS";

        /* JADX INFO: renamed from: y */
        public static final int f27469y = 8;

        private C9265a1() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$a2 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$a2;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9266a2 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9266a2 f27470w = new C9266a2();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "EDIT_ACTIVITIES_DRAWER";

        /* JADX INFO: renamed from: y */
        public static final int f27472y = 8;

        private C9266a2() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$a3 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$a3;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9267a3 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9267a3 f27473w = new C9267a3();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "INTEGRATIONS_DISCLAIMER";

        /* JADX INFO: renamed from: y */
        public static final int f27475y = 8;

        private C9267a3() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$a4 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$a4;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9268a4 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9268a4 f27476w = new C9268a4();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "MEMBERSHIP_MANAGEMENT";

        /* JADX INFO: renamed from: y */
        public static final int f27478y = 8;

        private C9268a4() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$a5 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$a5;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9269a5 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9269a5 f27479w = new C9269a5();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "SAGE";

        /* JADX INFO: renamed from: y */
        public static final int f27481y = 8;

        private C9269a5() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$a6 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$a6;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9270a6 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9270a6 f27482w = new C9270a6();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "TRENDS";

        /* JADX INFO: renamed from: y */
        public static final int f27484y = 8;

        private C9270a6() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$b */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$b;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9271b extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9271b f27485w = new C9271b();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ACHIEVEMENT_MILESTONE_UNLOCK";

        /* JADX INFO: renamed from: y */
        public static final int f27487y = 8;

        private C9271b() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$b0 */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$b0;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "", "y", "Ljava/util/Set;", "getOtherNames", "()Ljava/util/Set;", "otherNames", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9272b0 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9272b0 f27488w = new C9272b0();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ADVANCED_LABS_ACTION_PLAN";

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private static final Set<String> otherNames = AbstractC12350b.m34570S("advanced_labs_actions");

        /* JADX INFO: renamed from: z */
        public static final int f27491z = 8;

        private C9272b0() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }

        @Override // com.whoop.navigation.AppScreen
        public Set<String> getOtherNames() {
            return otherNames;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$b1 */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$b1;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "", "y", "Ljava/util/Set;", "getOtherNames", "()Ljava/util/Set;", "otherNames", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9273b1 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9273b1 f27492w = new C9273b1();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "BIOMARKER_DETAILS";

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private static final Set<String> otherNames = AbstractC12350b.m34570S("advanced_labs_biomarker");

        /* JADX INFO: renamed from: z */
        public static final int f27495z = 8;

        private C9273b1() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }

        @Override // com.whoop.navigation.AppScreen
        public Set<String> getOtherNames() {
            return otherNames;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$b2 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$b2;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9274b2 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9274b2 f27496w = new C9274b2();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "EDIT_CUSTOM_EXERCISE";

        /* JADX INFO: renamed from: y */
        public static final int f27498y = 8;

        private C9274b2() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$b3 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$b3;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9275b3 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9275b3 f27499w = new C9275b3();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "JOURNAL";

        /* JADX INFO: renamed from: y */
        public static final int f27501y = 8;

        private C9275b3() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$b4 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$b4;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9276b4 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9276b4 f27502w = new C9276b4();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "MENU";

        /* JADX INFO: renamed from: y */
        public static final int f27504y = 8;

        private C9276b4() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$b5 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$b5;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9277b5 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9277b5 f27505w = new C9277b5();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "SAGE_MANUAL_ENTRY";

        /* JADX INFO: renamed from: y */
        public static final int f27507y = 8;

        private C9277b5() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$b6 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$b6;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9278b6 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9278b6 f27508w = new C9278b6();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "UNIVERSAL_BUY_NOW";

        /* JADX INFO: renamed from: y */
        public static final int f27510y = 8;

        private C9278b6() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$c */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$c;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9279c extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9279c f27511w = new C9279c();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ACHIEVEMENT_DETAILS";

        /* JADX INFO: renamed from: y */
        public static final int f27513y = 8;

        private C9279c() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$c0 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$c0;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9280c0 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9280c0 f27514w = new C9280c0();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ADVANCED_LABS_EDIT_BIOMARKERS";

        /* JADX INFO: renamed from: y */
        public static final int f27516y = 8;

        private C9280c0() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$c1 */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$c1;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "", "y", "Ljava/util/Set;", "getOtherNames", "()Ljava/util/Set;", "otherNames", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9281c1 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9281c1 f27517w = new C9281c1();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "BIOMARKER_SUMMARY";

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private static final Set<String> otherNames = AbstractC12350b.m34570S("advanced_labs_test_summary");

        /* JADX INFO: renamed from: z */
        public static final int f27520z = 8;

        private C9281c1() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }

        @Override // com.whoop.navigation.AppScreen
        public Set<String> getOtherNames() {
            return otherNames;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$c2 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$c2;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9282c2 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9282c2 f27521w = new C9282c2();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ENTERPRISE_PROGRAM_SETTINGS";

        /* JADX INFO: renamed from: y */
        public static final int f27523y = 8;

        private C9282c2() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$c3 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$c3;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9283c3 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9283c3 f27524w = new C9283c3();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "JOURNAL_NO_OP";

        /* JADX INFO: renamed from: y */
        public static final int f27526y = 8;

        private C9283c3() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$c4 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$c4;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9284c4 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9284c4 f27527w = new C9284c4();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "MFA_SETUP";

        /* JADX INFO: renamed from: y */
        public static final int f27529y = 8;

        private C9284c4() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$c5 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$c5;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9285c5 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9285c5 f27530w = new C9285c5();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "SAGE_ONBOARDING";

        /* JADX INFO: renamed from: y */
        public static final int f27532y = 8;

        private C9285c5() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$c6 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$c6;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9286c6 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9286c6 f27533w = new C9286c6();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "UNIVERSAL_CART";

        /* JADX INFO: renamed from: y */
        public static final int f27535y = 8;

        private C9286c6() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$d */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$d;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9287d extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9287d f27536w = new C9287d();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ACCOUNT_ACTIVATION";

        /* JADX INFO: renamed from: y */
        public static final int f27538y = 8;

        private C9287d() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$d0 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$d0;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9288d0 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9288d0 f27539w = new C9288d0();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ADVANCED_LABS_EDIT_TEST_DETAILS";

        /* JADX INFO: renamed from: y */
        public static final int f27541y = 8;

        private C9288d0() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$d1 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$d1;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9289d1 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9289d1 f27542w = new C9289d1();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "CARDIO_DETAILS";

        /* JADX INFO: renamed from: y */
        public static final int f27544y = 8;

        private C9289d1() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$d2 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$d2;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9290d2 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9290d2 f27545w = new C9290d2();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "EXERCISE_DETAILS_V2";

        /* JADX INFO: renamed from: y */
        public static final int f27547y = 8;

        private C9290d2() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$d3 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$d3;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9291d3 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9291d3 f27548w = new C9291d3();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "JOURNAL_V2";

        /* JADX INFO: renamed from: y */
        public static final int f27550y = 8;

        private C9291d3() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$d4 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$d4;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9292d4 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9292d4 f27551w = new C9292d4();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "MY_ACCOUNT";

        /* JADX INFO: renamed from: y */
        public static final int f27553y = 8;

        private C9292d4() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$d5 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$d5;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9293d5 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9293d5 f27554w = new C9293d5();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "SANGUINE_WAITLIST";

        /* JADX INFO: renamed from: y */
        public static final int f27556y = 8;

        private C9293d5() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$d6 */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$d6;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "", "y", "Ljava/util/Set;", "getOtherNames", "()Ljava/util/Set;", "otherNames", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9294d6 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9294d6 f27557w = new C9294d6();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "UNIVERSAL_CHECKOUT";

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private static final Set<String> otherNames = AbstractC25260n.m74059b1(new String[]{"CHECKOUT_WITH_PARAMS", "CHECKOUT_WITH_ITEMS"});

        /* JADX INFO: renamed from: z */
        public static final int f27560z = 8;

        private C9294d6() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }

        @Override // com.whoop.navigation.AppScreen
        public Set<String> getOtherNames() {
            return otherNames;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$e */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$e;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9295e extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9295e f27561w = new C9295e();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ACCOUNT_CREATION";

        /* JADX INFO: renamed from: y */
        public static final int f27563y = 8;

        private C9295e() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$e0 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$e0;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9296e0 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9296e0 f27564w = new C9296e0();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ADVANCED_LABS_HORMONAL_CONTEXT_INPUT";

        /* JADX INFO: renamed from: y */
        public static final int f27566y = 8;

        private C9296e0() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$e1 */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$e1;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "", "y", "Ljava/util/Set;", "getOtherNames", "()Ljava/util/Set;", "otherNames", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9297e1 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9297e1 f27567w = new C9297e1();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "WEEKLY_PLAN_CHALLENGE";

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private static final Set<String> otherNames = AbstractC25260n.m74059b1(new String[]{"weekly_plan_challenge", "CHALLENGE_LANDING"});

        /* JADX INFO: renamed from: z */
        public static final int f27570z = 8;

        private C9297e1() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }

        @Override // com.whoop.navigation.AppScreen
        public Set<String> getOtherNames() {
            return otherNames;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$e2 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$e2;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9298e2 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9298e2 f27571w = new C9298e2();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "EXTENSIONS";

        /* JADX INFO: renamed from: y */
        public static final int f27573y = 8;

        private C9298e2() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$e3 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$e3;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9299e3 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9299e3 f27574w = new C9299e3();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ABOUT_ECG";

        /* JADX INFO: renamed from: y */
        public static final int f27576y = 8;

        private C9299e3() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$e4 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$e4;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9300e4 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9300e4 f27577w = new C9300e4();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "NATIVE_PLAN_SWITCH";

        /* JADX INFO: renamed from: y */
        public static final int f27579y = 8;

        private C9300e4() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$e5 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$e5;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9301e5 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9301e5 f27580w = new C9301e5();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "SANGUINE_WAITLIST_BIOMARKERS";

        /* JADX INFO: renamed from: y */
        public static final int f27582y = 8;

        private C9301e5() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$e6 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$e6;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9302e6 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9302e6 f27583w = new C9302e6();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "UNIVERSAL_CHECKOUT_SHIPPING_ADDRESS";

        /* JADX INFO: renamed from: y */
        public static final int f27585y = 8;

        private C9302e6() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$f */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$f;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9303f extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9303f f27586w = new C9303f();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ACCOUNT_TRANSITION_LEGACY_AFTER_ACTIVATION";

        /* JADX INFO: renamed from: y */
        public static final int f27588y = 8;

        private C9303f() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$f0 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$f0;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9304f0 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9304f0 f27589w = new C9304f0();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ADVANCED_LABS_INSIGHTS";

        /* JADX INFO: renamed from: y */
        public static final int f27591y = 8;

        private C9304f0() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$f1 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$f1;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9305f1 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9305f1 f27592w = new C9305f1();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "CHALLENGES";

        /* JADX INFO: renamed from: y */
        public static final int f27594y = 8;

        private C9305f1() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$f2 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$f2;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9306f2 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9306f2 f27595w = new C9306f2();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "FAMILY";

        /* JADX INFO: renamed from: y */
        public static final int f27597y = 8;

        private C9306f2() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$f3 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$f3;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9307f3 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9307f3 f27598w = new C9307f3();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ECG_DETAILS";

        /* JADX INFO: renamed from: y */
        public static final int f27600y = 8;

        private C9307f3() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$f4 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$f4;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9308f4 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9308f4 f27601w = new C9308f4();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "PRODUCT_DESCRIPTION_PAGE";

        /* JADX INFO: renamed from: y */
        public static final int f27603y = 8;

        private C9308f4() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$f5 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$f5;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9309f5 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9309f5 f27604w = new C9309f5();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "SEE_ALL_RECORDINGS";

        /* JADX INFO: renamed from: y */
        public static final int f27606y = 8;

        private C9309f5() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$f6 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$f6;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9310f6 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9310f6 f27607w = new C9310f6();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "UNIVERSAL_CHECKOUT_SHIPPING_METHOD";

        /* JADX INFO: renamed from: y */
        public static final int f27609y = 8;

        private C9310f6() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$g */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$g;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9311g extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9311g f27610w = new C9311g();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "AFTER_ACTIVATION_FINAL_SCREENS";

        /* JADX INFO: renamed from: y */
        public static final int f27612y = 8;

        private C9311g() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$g0 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$g0;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9312g0 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9312g0 f27613w = new C9312g0();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ADVANCED_LABS_INSIGHTS_DEEP_DIVE";

        /* JADX INFO: renamed from: y */
        public static final int f27615y = 8;

        private C9312g0() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$g1 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$g1;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9313g1 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9313g1 f27616w = new C9313g1();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "CHECKOUT";

        /* JADX INFO: renamed from: y */
        public static final int f27618y = 8;

        private C9313g1() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$g2 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$g2;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9314g2 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9314g2 f27619w = new C9314g2();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "FAMILY_PLAN_HUB";

        /* JADX INFO: renamed from: y */
        public static final int f27621y = 8;

        private C9314g2() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$g3 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$g3;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9315g3 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9315g3 f27622w = new C9315g3();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ECG_DEVICE_LOCATION";

        /* JADX INFO: renamed from: y */
        public static final int f27624y = 8;

        private C9315g3() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$g4 */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$g4;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "", "y", "Ljava/util/Set;", "getOtherNames", "()Ljava/util/Set;", "otherNames", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9316g4 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9316g4 f27625w = new C9316g4();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "NATIVE_STORE";

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private static final Set<String> otherNames = AbstractC12350b.m34570S("shop");

        /* JADX INFO: renamed from: z */
        public static final int f27628z = 8;

        private C9316g4() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }

        @Override // com.whoop.navigation.AppScreen
        public Set<String> getOtherNames() {
            return otherNames;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$g5 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$g5;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9317g5 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9317g5 f27629w = new C9317g5();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ABOUT_ANF";

        /* JADX INFO: renamed from: y */
        public static final int f27631y = 8;

        private C9317g5() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$g6 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$g6;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9318g6 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9318g6 f27632w = new C9318g6();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "UNKNOWN";

        /* JADX INFO: renamed from: y */
        public static final int f27634y = 8;

        private C9318g6() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$h */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$h;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9319h extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9319h f27635w = new C9319h();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "AL_AFTER_ACTIVATION";

        /* JADX INFO: renamed from: y */
        public static final int f27637y = 8;

        private C9319h() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$h0 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$h0;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9320h0 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9320h0 f27638w = new C9320h0();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ADVANCED_LABS_JOIN";

        /* JADX INFO: renamed from: y */
        public static final int f27640y = 8;

        private C9320h0() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$h1 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$h1;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9321h1 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9321h1 f27641w = new C9321h1();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "CHECKOUT_WITH_CART";

        /* JADX INFO: renamed from: y */
        public static final int f27643y = 8;

        private C9321h1() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$h2 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$h2;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9322h2 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9322h2 f27644w = new C9322h2();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "FAMILY_PLAN_INVITE_MEMBER";

        /* JADX INFO: renamed from: y */
        public static final int f27646y = 8;

        private C9322h2() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$h3 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$h3;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9323h3 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9323h3 f27647w = new C9323h3();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ECG_ONBOARDING";

        /* JADX INFO: renamed from: y */
        public static final int f27649y = 8;

        private C9323h3() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$h4 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$h4;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9324h4 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9324h4 f27650w = new C9324h4();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ACCESS_OMRON_AUTH";

        /* JADX INFO: renamed from: y */
        public static final int f27652y = 8;

        private C9324h4() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$h5 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$h5;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9325h5 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9325h5 f27653w = new C9325h5();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ANF_DETAILS";

        /* JADX INFO: renamed from: y */
        public static final int f27655y = 8;

        private C9325h5() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$h6 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$h6;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9326h6 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9326h6 f27656w = new C9326h6();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "UPCYCLE_LANDING";

        /* JADX INFO: renamed from: y */
        public static final int f27658y = 8;

        private C9326h6() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$i */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$i;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9327i extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9327i f27659w = new C9327i();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "AL_PERMISSIONS";

        /* JADX INFO: renamed from: y */
        public static final int f27661y = 8;

        private C9327i() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$i0 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$i0;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9328i0 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9328i0 f27662w = new C9328i0();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ADVANCED_LABS_MANAGEMENT";

        /* JADX INFO: renamed from: y */
        public static final int f27664y = 8;

        private C9328i0() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$i1 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$i1;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9329i1 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9329i1 f27665w = new C9329i1();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "CLINICIAN_SCHEDULING_CONFIRMATION";

        /* JADX INFO: renamed from: y */
        public static final int f27667y = 8;

        private C9329i1() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$i2 */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$i2;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "", "y", "Ljava/util/Set;", "getOtherNames", "()Ljava/util/Set;", "otherNames", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9330i2 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9330i2 f27668w = new C9330i2();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "FEATURE_EDUCATION";

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private static final Set<String> otherNames = AbstractC12350b.m34570S("EDUCATION_PAGE");

        /* JADX INFO: renamed from: z */
        public static final int f27671z = 8;

        private C9330i2() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }

        @Override // com.whoop.navigation.AppScreen
        public Set<String> getOtherNames() {
            return otherNames;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$i3 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$i3;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9331i3 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9331i3 f27672w = new C9331i3();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ECG_NEW_RECORDING";

        /* JADX INFO: renamed from: y */
        public static final int f27674y = 8;

        private C9331i3() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$i4 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$i4;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9332i4 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9332i4 f27675w = new C9332i4();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ONBOARDING_STORY";

        /* JADX INFO: renamed from: y */
        public static final int f27677y = 8;

        private C9332i4() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$i5 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$i5;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9333i5 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9333i5 f27678w = new C9333i5();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ANF_HISTORY";

        /* JADX INFO: renamed from: y */
        public static final int f27680y = 8;

        private C9333i5() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$i6 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$i6;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9334i6 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9334i6 f27681w = new C9334i6();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "VIDEO_CALL";

        /* JADX INFO: renamed from: y */
        public static final int f27683y = 8;

        private C9334i6() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$j */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$j;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9335j extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9335j f27684w = new C9335j();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "AL_PROFILE";

        /* JADX INFO: renamed from: y */
        public static final int f27686y = 8;

        private C9335j() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$j0 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$j0;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9336j0 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9336j0 f27687w = new C9336j0();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ADVANCED_LABS_MULTI_CONSENT_SCREEN";

        /* JADX INFO: renamed from: y */
        public static final int f27689y = 8;

        private C9336j0() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$j1 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$j1;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9337j1 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9337j1 f27690w = new C9337j1();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "CITL_INTAKE";

        /* JADX INFO: renamed from: y */
        public static final int f27692y = 8;

        private C9337j1() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$j2 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$j2;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9338j2 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9338j2 f27693w = new C9338j2();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "FEEDBACK_SURVEY";

        /* JADX INFO: renamed from: y */
        public static final int f27695y = 8;

        private C9338j2() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$j3 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$j3;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9339j3 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9339j3 f27696w = new C9339j3();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ECG_REGULATORY_DETAILS";

        /* JADX INFO: renamed from: y */
        public static final int f27698y = 8;

        private C9339j3() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$j4 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$j4;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9340j4 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9340j4 f27699w = new C9340j4();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "TRIAL_ORDERED";

        /* JADX INFO: renamed from: y */
        public static final int f27701y = 8;

        private C9340j4() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$j5 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$j5;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9341j5 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9341j5 f27702w = new C9341j5();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ANF_ONBOARDING";

        /* JADX INFO: renamed from: y */
        public static final int f27704y = 8;

        private C9341j5() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$j6 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$j6;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9342j6 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9342j6 f27705w = new C9342j6();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "WEEK_IN_REVIEW";

        /* JADX INFO: renamed from: y */
        public static final int f27707y = 8;

        private C9342j6() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$k */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$k;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9343k extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9343k f27708w = new C9343k();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "DEVICE_EDUCATION";

        /* JADX INFO: renamed from: y */
        public static final int f27710y = 8;

        private C9343k() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$k0 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$k0;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9344k0 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9344k0 f27711w = new C9344k0();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ADVANCED_LABS_NATIVE_SCHEDULING";

        /* JADX INFO: renamed from: y */
        public static final int f27713y = 8;

        private C9344k0() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$k1 */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$k1;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "", "y", "Ljava/util/Set;", "getOtherNames", "()Ljava/util/Set;", "otherNames", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9345k1 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9345k1 f27714w = new C9345k1();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "WHOOP_COACH";

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private static final Set<String> otherNames = AbstractC12350b.m34570S("WHOOPCOACH");

        /* JADX INFO: renamed from: z */
        public static final int f27717z = 8;

        private C9345k1() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }

        @Override // com.whoop.navigation.AppScreen
        public Set<String> getOtherNames() {
            return otherNames;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$k2 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$k2;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9346k2 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9346k2 f27718w = new C9346k2();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "GENERIC_SCREEN";

        /* JADX INFO: renamed from: y */
        public static final int f27720y = 8;

        private C9346k2() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$k3 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$k3;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9347k3 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9347k3 f27721w = new C9347k3();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ECG_RESULTS";

        /* JADX INFO: renamed from: y */
        public static final int f27723y = 8;

        private C9347k3() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$k4 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$k4;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9348k4 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9348k4 f27724w = new C9348k4();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "PAIR_DEVICE";

        /* JADX INFO: renamed from: y */
        public static final int f27726y = 8;

        private C9348k4() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$k5 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$k5;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9349k5 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9349k5 f27727w = new C9349k5();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ANF_REGULATORY_DETAILS";

        /* JADX INFO: renamed from: y */
        public static final int f27729y = 8;

        private C9349k5() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$k6 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$k6;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9350k6 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9350k6 f27730w = new C9350k6();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "WEEKLY_PLAN_EDIT";

        /* JADX INFO: renamed from: y */
        public static final int f27732y = 8;

        private C9350k6() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$l */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$l;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9351l extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9351l f27733w = new C9351l();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ENTER_YOUR_EMAIL";

        /* JADX INFO: renamed from: y */
        public static final int f27735y = 8;

        private C9351l() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$l0 */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$l0;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "", "y", "Ljava/util/Set;", "getOtherNames", "()Ljava/util/Set;", "otherNames", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9352l0 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9352l0 f27736w = new C9352l0();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ADVANCED_LABS_PRIMER";

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private static final Set<String> otherNames = AbstractC12350b.m34570S("advanced_labs_start_test");

        /* JADX INFO: renamed from: z */
        public static final int f27739z = 8;

        private C9352l0() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }

        @Override // com.whoop.navigation.AppScreen
        public Set<String> getOtherNames() {
            return otherNames;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$l1 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$l1;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9353l1 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9353l1 f27740w = new C9353l1();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "COACH_SETTINGS";

        /* JADX INFO: renamed from: y */
        public static final int f27742y = 8;

        private C9353l1() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$l2 */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$l2;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "", "y", "Ljava/util/Set;", "getOtherNames", "()Ljava/util/Set;", "otherNames", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9354l2 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9354l2 f27743w = new C9354l2();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "GIFT_HUB";

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private static final Set<String> otherNames = AbstractC12350b.m34570S("gift");

        /* JADX INFO: renamed from: z */
        public static final int f27746z = 8;

        private C9354l2() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }

        @Override // com.whoop.navigation.AppScreen
        public Set<String> getOtherNames() {
            return otherNames;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$l3 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$l3;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9355l3 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9355l3 f27747w = new C9355l3();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "LANGUAGE_SETTINGS";

        /* JADX INFO: renamed from: y */
        public static final int f27749y = 8;

        private C9355l3() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$l4 */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$l4;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "", "y", "Ljava/util/Set;", "getOtherNames", "()Ljava/util/Set;", "otherNames", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9356l4 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9356l4 f27750w = new C9356l4();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "PASSWORD_RESET";

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private static final Set<String> otherNames = AbstractC12350b.m34570S("RESET-PASSWORD-V2");

        /* JADX INFO: renamed from: z */
        public static final int f27753z = 8;

        private C9356l4() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }

        @Override // com.whoop.navigation.AppScreen
        public Set<String> getOtherNames() {
            return otherNames;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$l5 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$l5;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9357l5 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9357l5 f27754w = new C9357l5();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ANF_SETTINGS";

        /* JADX INFO: renamed from: y */
        public static final int f27756y = 8;

        private C9357l5() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$l6 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$l6;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9358l6 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9358l6 f27757w = new C9358l6();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "WEEKLY_PLAN_OVERVIEW";

        /* JADX INFO: renamed from: y */
        public static final int f27759y = 8;

        private C9358l6() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$m */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$m;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9359m extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9359m f27760w = new C9359m();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ENTER_YOUR_PASSWORD";

        /* JADX INFO: renamed from: y */
        public static final int f27762y = 8;

        private C9359m() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$m0 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$m0;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9360m0 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9360m0 f27763w = new C9360m0();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ADVANCED_LABS_PURCHASE_ADD_ONS";

        /* JADX INFO: renamed from: y */
        public static final int f27765y = 8;

        private C9360m0() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$m1 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$m1;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9361m1 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9361m1 f27766w = new C9361m1();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "COMMUNITY";

        /* JADX INFO: renamed from: y */
        public static final int f27768y = 8;

        private C9361m1() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$m2 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$m2;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9362m2 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9362m2 f27769w = new C9362m2();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "GIFTED";

        /* JADX INFO: renamed from: y */
        public static final int f27771y = 8;

        private C9362m2() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$m3 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$m3;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9363m3 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9363m3 f27772w = new C9363m3();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "LEGACY_PRO_CHECKOUT";

        /* JADX INFO: renamed from: y */
        public static final int f27774y = 8;

        private C9363m3() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$m4 */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$m4;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "", "y", "Ljava/util/Set;", "getOtherNames", "()Ljava/util/Set;", "otherNames", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9364m4 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9364m4 f27775w = new C9364m4();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "PAYMENT_V2";

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private static final Set<String> otherNames = AbstractC12350b.m34570S("PAYMENT");

        /* JADX INFO: renamed from: z */
        public static final int f27778z = 8;

        private C9364m4() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }

        @Override // com.whoop.navigation.AppScreen
        public Set<String> getOtherNames() {
            return otherNames;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$m5 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$m5;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9365m5 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9365m5 f27779w = new C9365m5();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "SLEEP_DETAILS";

        /* JADX INFO: renamed from: y */
        public static final int f27781y = 8;

        private C9365m5() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$m6 */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$m6;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "", "y", "Ljava/util/Set;", "getOtherNames", "()Ljava/util/Set;", "otherNames", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9366m6 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9366m6 f27782w = new C9366m6();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "WEEKLY_PLAN_PRESET_LANDING";

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private static final Set<String> otherNames = AbstractC12350b.m34570S("weekly-plan-presets");

        /* JADX INFO: renamed from: z */
        public static final int f27785z = 8;

        private C9366m6() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }

        @Override // com.whoop.navigation.AppScreen
        public Set<String> getOtherNames() {
            return otherNames;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$n */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$n;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9367n extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9367n f27786w = new C9367n();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "HW_ONLY_AFTER_ACTIVATION";

        /* JADX INFO: renamed from: y */
        public static final int f27788y = 8;

        private C9367n() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$n0 */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$n0;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "", "y", "Ljava/util/Set;", "getOtherNames", "()Ljava/util/Set;", "otherNames", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9368n0 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9368n0 f27789w = new C9368n0();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ADVANCED_LABS_SCHEDULING_FORM";

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private static final Set<String> otherNames = AbstractC12350b.m34570S("advanced_labs_schedule_test");

        /* JADX INFO: renamed from: z */
        public static final int f27792z = 8;

        private C9368n0() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }

        @Override // com.whoop.navigation.AppScreen
        public Set<String> getOtherNames() {
            return otherNames;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$n1 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$n1;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9369n1 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9369n1 f27793w = new C9369n1();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "COMMUNITY_FOLLOWERS";

        /* JADX INFO: renamed from: y */
        public static final int f27795y = 8;

        private C9369n1() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$n2 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$n2;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9370n2 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9370n2 f27796w = new C9370n2();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "GIFTING";

        /* JADX INFO: renamed from: y */
        public static final int f27798y = 8;

        private C9370n2() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$n3 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$n3;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9371n3 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9371n3 f27799w = new C9371n3();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "LEVELS";

        /* JADX INFO: renamed from: y */
        public static final int f27801y = 8;

        private C9371n3() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$n4 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$n4;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9372n4 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9372n4 f27802w = new C9372n4();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "PREGNANCY_INSIGHTS";

        /* JADX INFO: renamed from: y */
        public static final int f27804y = 8;

        private C9372n4() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$n5 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$n5;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9373n5 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9373n5 f27805w = new C9373n5();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "SLEEP_PLANNER";

        /* JADX INFO: renamed from: y */
        public static final int f27807y = 8;

        private C9373n5() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$n6 */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$n6;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "", "y", "Ljava/util/Set;", "getOtherNames", "()Ljava/util/Set;", "otherNames", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9374n6 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9374n6 f27808w = new C9374n6();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "WEEKLY_PLAN_SET_UP";

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private static final Set<String> otherNames = AbstractC12350b.m34570S("weekly_plan_set_up");

        /* JADX INFO: renamed from: z */
        public static final int f27811z = 8;

        private C9374n6() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }

        @Override // com.whoop.navigation.AppScreen
        public Set<String> getOtherNames() {
            return otherNames;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$o */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$o;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9375o extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9375o f27812w = new C9375o();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "HW_ONLY_PERMISSIONS";

        /* JADX INFO: renamed from: y */
        public static final int f27814y = 8;

        private C9375o() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$o0 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$o0;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9376o0 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9376o0 f27815w = new C9376o0();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ADVANCED_LABS_SCHEDULING_STEP";

        /* JADX INFO: renamed from: y */
        public static final int f27817y = 8;

        private C9376o0() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$o1 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$o1;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9377o1 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9377o1 f27818w = new C9377o1();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "COMMUNITY_TEAM";

        /* JADX INFO: renamed from: y */
        public static final int f27820y = 8;

        private C9377o1() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$o2 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$o2;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9378o2 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9378o2 f27821w = new C9378o2();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "HEALTH_MONITOR";

        /* JADX INFO: renamed from: y */
        public static final int f27823y = 8;

        private C9378o2() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$o3 */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$o3;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "", "y", "Ljava/util/Set;", "getOtherNames", "()Ljava/util/Set;", "otherNames", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9379o3 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9379o3 f27824w = new C9379o3();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "OFFER_DETAILS";

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private static final Set<String> otherNames = AbstractC12350b.m34570S("LimitedTimeOffer");

        /* JADX INFO: renamed from: z */
        public static final int f27827z = 8;

        private C9379o3() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }

        @Override // com.whoop.navigation.AppScreen
        public Set<String> getOtherNames() {
            return otherNames;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$o4 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$o4;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9380o4 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9380o4 f27828w = new C9380o4();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "PREGNANCY_SETTINGS";

        /* JADX INFO: renamed from: y */
        public static final int f27830y = 8;

        private C9380o4() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$o5 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$o5;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9381o5 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9381o5 f27831w = new C9381o5();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "SMS_SETUP";

        /* JADX INFO: renamed from: y */
        public static final int f27833y = 8;

        private C9381o5() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$o6 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$o6;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9382o6 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9382o6 f27834w = new C9382o6();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "WEEKLY_PLAN_SUMMARY";

        /* JADX INFO: renamed from: y */
        public static final int f27836y = 8;

        private C9382o6() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$p */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$p;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9383p extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9383p f27837w = new C9383p();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "HW_ONLY_PROFILE";

        /* JADX INFO: renamed from: y */
        public static final int f27839y = 8;

        private C9383p() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$p0 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$p0;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9384p0 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9384p0 f27840w = new C9384p0();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ADVANCED_LABS_TEST_HISTORY";

        /* JADX INFO: renamed from: y */
        public static final int f27842y = 8;

        private C9384p0() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$p1 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$p1;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9385p1 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9385p1 f27843w = new C9385p1();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "COMMUNITY_TEAMS_HUB";

        /* JADX INFO: renamed from: y */
        public static final int f27845y = 8;

        private C9385p1() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$p2 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$p2;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9386p2 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9386p2 f27846w = new C9386p2();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "SHARE_HEALTH_REPORT";

        /* JADX INFO: renamed from: y */
        public static final int f27848y = 8;

        private C9386p2() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$p3 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$p3;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9387p3 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9387p3 f27849w = new C9387p3();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "LINK_WORKOUT";

        /* JADX INFO: renamed from: y */
        public static final int f27851y = 8;

        private C9387p3() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$p4 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$p4;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9388p4 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9388p4 f27852w = new C9388p4();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "PREVIOUS_PREGNANCY";

        /* JADX INFO: renamed from: y */
        public static final int f27854y = 8;

        private C9388p4() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$p5 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$p5;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9389p5 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9389p5 f27855w = new C9389p5();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "START_ACTIVITY";

        /* JADX INFO: renamed from: y */
        public static final int f27857y = 8;

        private C9389p5() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$p6 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$p6;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9390p6 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9390p6 f27858w = new C9390p6();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "WEIGHTLIFTING_DETAILS";

        /* JADX INFO: renamed from: y */
        public static final int f27860y = 8;

        private C9390p6() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$q */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$q;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9391q extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9391q f27861w = new C9391q();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "IN_APP_JOIN_FLOW";

        /* JADX INFO: renamed from: y */
        public static final int f27863y = 8;

        private C9391q() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$q0 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$q0;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9392q0 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9392q0 f27864w = new C9392q0();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ADVANCED_LABS_TEST_RESULTS";

        /* JADX INFO: renamed from: y */
        public static final int f27866y = 8;

        private C9392q0() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$q1, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ%\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$q1;", "", "<init>", "()V", "", HMSTrackSource.SCREEN, "Lcom/whoop/navigation/AppScreen;", "d", "(Ljava/lang/String;)Lcom/whoop/navigation/AppScreen;", "c", "", "featureScreens", "a", "(Ljava/lang/String;Ljava/util/Collection;)Lcom/whoop/navigation/AppScreen;", "Ljava/util/Locale;", "kotlin.jvm.PlatformType", "locale", "Ljava/util/Locale;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ AppScreen m23028b(Companion companion, String str, Collection collection, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                collection = C25235a0.f99113w;
            }
            return companion.m23031a(str, collection);
        }

        /* JADX WARN: Code duplicated, block: B:250:0x03b5  */
        /* JADX WARN: Code duplicated, block: B:252:0x03b8 A[RETURN] */
        /* JADX INFO: renamed from: c */
        private final AppScreen m23029c(String screen) {
            Object next;
            Object next2;
            Object next3;
            Object next4;
            Object next5;
            Object next6;
            Object next7;
            Object next8;
            Object next9;
            Object next10;
            Object next11;
            Object next12;
            Object next13;
            Object next14;
            Object next15;
            Object next16;
            Object next17;
            Object next18;
            Object next19;
            Object next20;
            Object next21;
            Object next22;
            Object next23;
            Object next24;
            Iterator<T> it = C9447x.f28029w.getOtherNames().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC39421y.m125921F(screen, (String) next, true));
            if (next != null) {
                return C9447x.f28029w;
            }
            Iterator<T> it3 = C9272b0.f27488w.getOtherNames().iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (!AbstractC39421y.m125921F(screen, (String) next2, true));
            if (next2 != null) {
                return C9272b0.f27488w;
            }
            Iterator<T> it4 = C9352l0.f27736w.getOtherNames().iterator();
            do {
                if (!it4.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it4.next();
            } while (!AbstractC39421y.m125921F(screen, (String) next3, true));
            if (next3 != null) {
                return C9352l0.f27736w;
            }
            Iterator<T> it5 = C9368n0.f27789w.getOtherNames().iterator();
            do {
                if (!it5.hasNext()) {
                    next4 = null;
                    break;
                }
                next4 = it5.next();
            } while (!AbstractC39421y.m125921F(screen, (String) next4, true));
            if (next4 != null) {
                return C9368n0.f27789w;
            }
            Iterator<T> it6 = C9416t0.f27932w.getOtherNames().iterator();
            do {
                if (!it6.hasNext()) {
                    next5 = null;
                    break;
                }
                next5 = it6.next();
            } while (!AbstractC39421y.m125921F(screen, (String) next5, true));
            if (next5 != null) {
                return C9416t0.f27932w;
            }
            Iterator<T> it7 = C9273b1.f27492w.getOtherNames().iterator();
            do {
                if (!it7.hasNext()) {
                    next6 = null;
                    break;
                }
                next6 = it7.next();
            } while (!AbstractC39421y.m125921F(screen, (String) next6, true));
            if (next6 != null) {
                return C9273b1.f27492w;
            }
            Iterator<T> it8 = C9281c1.f27517w.getOtherNames().iterator();
            do {
                if (!it8.hasNext()) {
                    next7 = null;
                    break;
                }
                next7 = it8.next();
            } while (!AbstractC39421y.m125921F(screen, (String) next7, true));
            if (next7 != null) {
                return C9281c1.f27517w;
            }
            Iterator<T> it9 = C9297e1.f27567w.getOtherNames().iterator();
            do {
                if (!it9.hasNext()) {
                    next8 = null;
                    break;
                }
                next8 = it9.next();
            } while (!AbstractC39421y.m125921F(screen, (String) next8, true));
            if (next8 != null) {
                return C9297e1.f27567w;
            }
            Iterator<T> it10 = C9345k1.f27714w.getOtherNames().iterator();
            do {
                if (!it10.hasNext()) {
                    next9 = null;
                    break;
                }
                next9 = it10.next();
            } while (!AbstractC39421y.m125921F(screen, (String) next9, true));
            if (next9 != null) {
                return C9345k1.f27714w;
            }
            Iterator<T> it11 = C9330i2.f27668w.getOtherNames().iterator();
            do {
                if (!it11.hasNext()) {
                    next10 = null;
                    break;
                }
                next10 = it11.next();
            } while (!AbstractC39421y.m125921F(screen, (String) next10, true));
            if (next10 != null) {
                return C9330i2.f27668w;
            }
            Iterator<T> it12 = C9354l2.f27743w.getOtherNames().iterator();
            do {
                if (!it12.hasNext()) {
                    next11 = null;
                    break;
                }
                next11 = it12.next();
            } while (!AbstractC39421y.m125921F(screen, (String) next11, true));
            if (next11 != null) {
                return C9354l2.f27743w;
            }
            Iterator<T> it13 = C9464z2.f28083w.getOtherNames().iterator();
            do {
                if (!it13.hasNext()) {
                    next12 = null;
                    break;
                }
                next12 = it13.next();
            } while (!AbstractC39421y.m125921F(screen, (String) next12, true));
            if (next12 != null) {
                return C9464z2.f28083w;
            }
            Iterator<T> it14 = C9316g4.f27625w.getOtherNames().iterator();
            do {
                if (!it14.hasNext()) {
                    next13 = null;
                    break;
                }
                next13 = it14.next();
            } while (!AbstractC39421y.m125921F(screen, (String) next13, true));
            if (next13 != null) {
                return C9316g4.f27625w;
            }
            Iterator<T> it15 = C9356l4.f27750w.getOtherNames().iterator();
            do {
                if (!it15.hasNext()) {
                    next14 = null;
                    break;
                }
                next14 = it15.next();
            } while (!AbstractC39421y.m125921F(screen, (String) next14, true));
            if (next14 != null) {
                return C9356l4.f27750w;
            }
            Iterator<T> it16 = C9364m4.f27775w.getOtherNames().iterator();
            do {
                if (!it16.hasNext()) {
                    next15 = null;
                    break;
                }
                next15 = it16.next();
            } while (!AbstractC39421y.m125921F(screen, (String) next15, true));
            if (next15 != null) {
                return C9364m4.f27775w;
            }
            Iterator<T> it17 = C9444w4.f28018w.getOtherNames().iterator();
            do {
                if (!it17.hasNext()) {
                    next16 = null;
                    break;
                }
                next16 = it17.next();
            } while (!AbstractC39421y.m125921F(screen, (String) next16, true));
            if (next16 != null) {
                return C9444w4.f28018w;
            }
            Iterator<T> it18 = C9452x4.f28045w.getOtherNames().iterator();
            do {
                if (!it18.hasNext()) {
                    next17 = null;
                    break;
                }
                next17 = it18.next();
            } while (!AbstractC39421y.m125921F(screen, (String) next17, true));
            if (next17 != null) {
                return C9452x4.f28045w;
            }
            Iterator<T> it19 = C9459y4.f28067w.getOtherNames().iterator();
            do {
                if (!it19.hasNext()) {
                    next18 = null;
                    break;
                }
                next18 = it19.next();
            } while (!AbstractC39421y.m125921F(screen, (String) next18, true));
            if (next18 != null) {
                return C9459y4.f28067w;
            }
            Iterator<T> it20 = C9437v5.f27996w.getOtherNames().iterator();
            do {
                if (!it20.hasNext()) {
                    next19 = null;
                    break;
                }
                next19 = it20.next();
            } while (!AbstractC39421y.m125921F(screen, (String) next19, true));
            if (next19 != null) {
                return C9437v5.f27996w;
            }
            Iterator<T> it21 = C9294d6.f27557w.getOtherNames().iterator();
            do {
                if (!it21.hasNext()) {
                    next20 = null;
                    break;
                }
                next20 = it21.next();
            } while (!AbstractC39421y.m125921F(screen, (String) next20, true));
            if (next20 != null) {
                return C9294d6.f27557w;
            }
            Iterator<T> it22 = C9366m6.f27782w.getOtherNames().iterator();
            do {
                if (!it22.hasNext()) {
                    next21 = null;
                    break;
                }
                next21 = it22.next();
            } while (!AbstractC39421y.m125921F(screen, (String) next21, true));
            if (next21 != null) {
                return C9366m6.f27782w;
            }
            Iterator<T> it23 = C9374n6.f27808w.getOtherNames().iterator();
            do {
                if (!it23.hasNext()) {
                    next22 = null;
                    break;
                }
                next22 = it23.next();
            } while (!AbstractC39421y.m125921F(screen, (String) next22, true));
            if (next22 != null) {
                return C9374n6.f27808w;
            }
            Iterator<T> it24 = C9406r6.f27902w.getOtherNames().iterator();
            do {
                if (!it24.hasNext()) {
                    next23 = null;
                    break;
                }
                next23 = it24.next();
            } while (!AbstractC39421y.m125921F(screen, (String) next23, true));
            if (next23 != null) {
                return C9406r6.f27902w;
            }
            Iterator<T> it25 = C9446w6.f28025w.getOtherNames().iterator();
            do {
                if (!it25.hasNext()) {
                    next24 = null;
                    break;
                }
                next24 = it25.next();
            } while (!AbstractC39421y.m125921F(screen, (String) next24, true));
            if (next24 != null) {
                return C9446w6.f28025w;
            }
            for (Object obj : C9379o3.f27824w.getOtherNames()) {
                if (AbstractC39421y.m125921F(screen, (String) obj, true)) {
                    if (obj != null) {
                        return C9379o3.f27824w;
                    }
                    return null;
                }
            }
            obj = null;
            if (obj != null) {
                return C9379o3.f27824w;
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: d */
        private final AppScreen m23030d(String screen) {
            C9279c c9279c = C9279c.f27511w;
            if (AbstractC22676k.m65745e(screen, c9279c.getName())) {
                return c9279c;
            }
            C9263a c9263a = C9263a.f27461w;
            if (AbstractC22676k.m65745e(screen, c9263a.getName())) {
                return c9263a;
            }
            C9271b c9271b = C9271b.f27485w;
            if (AbstractC22676k.m65745e(screen, c9271b.getName())) {
                return c9271b;
            }
            C9287d c9287d = C9287d.f27536w;
            if (AbstractC22676k.m65745e(screen, c9287d.getName())) {
                return c9287d;
            }
            C9295e c9295e = C9295e.f27561w;
            if (AbstractC22676k.m65745e(screen, c9295e.getName())) {
                return c9295e;
            }
            C9303f c9303f = C9303f.f27586w;
            if (AbstractC22676k.m65745e(screen, c9303f.getName())) {
                return c9303f;
            }
            C9311g c9311g = C9311g.f27610w;
            if (AbstractC22676k.m65745e(screen, c9311g.getName())) {
                return c9311g;
            }
            C9319h c9319h = C9319h.f27635w;
            if (AbstractC22676k.m65745e(screen, c9319h.getName())) {
                return c9319h;
            }
            C9327i c9327i = C9327i.f27659w;
            if (AbstractC22676k.m65745e(screen, c9327i.getName())) {
                return c9327i;
            }
            C9335j c9335j = C9335j.f27684w;
            if (AbstractC22676k.m65745e(screen, c9335j.getName())) {
                return c9335j;
            }
            C9343k c9343k = C9343k.f27708w;
            if (AbstractC22676k.m65745e(screen, c9343k.getName())) {
                return c9343k;
            }
            C9351l c9351l = C9351l.f27733w;
            if (AbstractC22676k.m65745e(screen, c9351l.getName())) {
                return c9351l;
            }
            C9359m c9359m = C9359m.f27760w;
            if (AbstractC22676k.m65745e(screen, c9359m.getName())) {
                return c9359m;
            }
            C9367n c9367n = C9367n.f27786w;
            if (AbstractC22676k.m65745e(screen, c9367n.getName())) {
                return c9367n;
            }
            C9375o c9375o = C9375o.f27812w;
            if (AbstractC22676k.m65745e(screen, c9375o.getName())) {
                return c9375o;
            }
            C9383p c9383p = C9383p.f27837w;
            if (AbstractC22676k.m65745e(screen, c9383p.getName())) {
                return c9383p;
            }
            C9391q c9391q = C9391q.f27861w;
            if (AbstractC22676k.m65745e(screen, c9391q.getName())) {
                return c9391q;
            }
            C9399r c9399r = C9399r.f27881w;
            if (AbstractC22676k.m65745e(screen, c9399r.getName())) {
                return c9399r;
            }
            C9407s c9407s = C9407s.f27905w;
            if (AbstractC22676k.m65745e(screen, c9407s.getName())) {
                return c9407s;
            }
            C9415t c9415t = C9415t.f27929w;
            if (AbstractC22676k.m65745e(screen, c9415t.getName())) {
                return c9415t;
            }
            C9423u c9423u = C9423u.f27954w;
            if (AbstractC22676k.m65745e(screen, c9423u.getName())) {
                return c9423u;
            }
            C9431v c9431v = C9431v.f27978w;
            if (AbstractC22676k.m65745e(screen, c9431v.getName())) {
                return c9431v;
            }
            C9439w c9439w = C9439w.f28003w;
            if (AbstractC22676k.m65745e(screen, c9439w.getName())) {
                return c9439w;
            }
            C9447x c9447x = C9447x.f28029w;
            if (AbstractC22676k.m65745e(screen, c9447x.getName())) {
                return c9447x;
            }
            C9454y c9454y = C9454y.f28052w;
            if (AbstractC22676k.m65745e(screen, c9454y.getName())) {
                return c9454y;
            }
            C9461z c9461z = C9461z.f28074w;
            if (AbstractC22676k.m65745e(screen, c9461z.getName())) {
                return c9461z;
            }
            C9264a0 c9264a0 = C9264a0.f27464w;
            if (AbstractC22676k.m65745e(screen, c9264a0.getName())) {
                return c9264a0;
            }
            C9272b0 c9272b0 = C9272b0.f27488w;
            if (AbstractC22676k.m65745e(screen, c9272b0.getName())) {
                return c9272b0;
            }
            C9280c0 c9280c0 = C9280c0.f27514w;
            if (AbstractC22676k.m65745e(screen, c9280c0.getName())) {
                return c9280c0;
            }
            C9288d0 c9288d0 = C9288d0.f27539w;
            if (AbstractC22676k.m65745e(screen, c9288d0.getName())) {
                return c9288d0;
            }
            C9296e0 c9296e0 = C9296e0.f27564w;
            if (AbstractC22676k.m65745e(screen, c9296e0.getName())) {
                return c9296e0;
            }
            C9304f0 c9304f0 = C9304f0.f27589w;
            if (AbstractC22676k.m65745e(screen, c9304f0.getName())) {
                return c9304f0;
            }
            C9312g0 c9312g0 = C9312g0.f27613w;
            if (AbstractC22676k.m65745e(screen, c9312g0.getName())) {
                return c9312g0;
            }
            C9320h0 c9320h0 = C9320h0.f27638w;
            if (AbstractC22676k.m65745e(screen, c9320h0.getName())) {
                return c9320h0;
            }
            C9328i0 c9328i0 = C9328i0.f27662w;
            if (AbstractC22676k.m65745e(screen, c9328i0.getName())) {
                return c9328i0;
            }
            C9336j0 c9336j0 = C9336j0.f27687w;
            if (AbstractC22676k.m65745e(screen, c9336j0.getName())) {
                return c9336j0;
            }
            C9344k0 c9344k0 = C9344k0.f27711w;
            if (AbstractC22676k.m65745e(screen, c9344k0.getName())) {
                return c9344k0;
            }
            C9352l0 c9352l0 = C9352l0.f27736w;
            if (AbstractC22676k.m65745e(screen, c9352l0.getName())) {
                return c9352l0;
            }
            C9360m0 c9360m0 = C9360m0.f27763w;
            if (AbstractC22676k.m65745e(screen, c9360m0.getName())) {
                return c9360m0;
            }
            C9368n0 c9368n0 = C9368n0.f27789w;
            if (AbstractC22676k.m65745e(screen, c9368n0.getName())) {
                return c9368n0;
            }
            C9376o0 c9376o0 = C9376o0.f27815w;
            if (AbstractC22676k.m65745e(screen, c9376o0.getName())) {
                return c9376o0;
            }
            C9384p0 c9384p0 = C9384p0.f27840w;
            if (AbstractC22676k.m65745e(screen, c9384p0.getName())) {
                return c9384p0;
            }
            C9392q0 c9392q0 = C9392q0.f27864w;
            if (AbstractC22676k.m65745e(screen, c9392q0.getName())) {
                return c9392q0;
            }
            C9400r0 c9400r0 = C9400r0.f27884w;
            if (AbstractC22676k.m65745e(screen, c9400r0.getName())) {
                return c9400r0;
            }
            C9408s0 c9408s0 = C9408s0.f27908w;
            if (AbstractC22676k.m65745e(screen, c9408s0.getName())) {
                return c9408s0;
            }
            C9416t0 c9416t0 = C9416t0.f27932w;
            if (AbstractC22676k.m65745e(screen, c9416t0.getName())) {
                return c9416t0;
            }
            C9424u0 c9424u0 = C9424u0.f27957w;
            if (AbstractC22676k.m65745e(screen, c9424u0.getName())) {
                return c9424u0;
            }
            C9432v0 c9432v0 = C9432v0.f27981w;
            if (AbstractC22676k.m65745e(screen, c9432v0.getName())) {
                return c9432v0;
            }
            C9440w0 c9440w0 = C9440w0.f28006w;
            if (AbstractC22676k.m65745e(screen, c9440w0.getName())) {
                return c9440w0;
            }
            C9448x0 c9448x0 = C9448x0.f28033w;
            if (AbstractC22676k.m65745e(screen, c9448x0.getName())) {
                return c9448x0;
            }
            C9455y0 c9455y0 = C9455y0.f28055w;
            if (AbstractC22676k.m65745e(screen, c9455y0.getName())) {
                return c9455y0;
            }
            C9462z0 c9462z0 = C9462z0.f28077w;
            if (AbstractC22676k.m65745e(screen, c9462z0.getName())) {
                return c9462z0;
            }
            C9265a1 c9265a1 = C9265a1.f27467w;
            if (AbstractC22676k.m65745e(screen, c9265a1.getName())) {
                return c9265a1;
            }
            C9273b1 c9273b1 = C9273b1.f27492w;
            if (AbstractC22676k.m65745e(screen, c9273b1.getName())) {
                return c9273b1;
            }
            C9281c1 c9281c1 = C9281c1.f27517w;
            if (AbstractC22676k.m65745e(screen, c9281c1.getName())) {
                return c9281c1;
            }
            C9289d1 c9289d1 = C9289d1.f27542w;
            if (AbstractC22676k.m65745e(screen, c9289d1.getName())) {
                return c9289d1;
            }
            C9305f1 c9305f1 = C9305f1.f27592w;
            if (AbstractC22676k.m65745e(screen, c9305f1.getName())) {
                return c9305f1;
            }
            C9297e1 c9297e1 = C9297e1.f27567w;
            if (AbstractC22676k.m65745e(screen, c9297e1.getName())) {
                return c9297e1;
            }
            C9313g1 c9313g1 = C9313g1.f27616w;
            if (AbstractC22676k.m65745e(screen, c9313g1.getName())) {
                return c9313g1;
            }
            C9337j1 c9337j1 = C9337j1.f27690w;
            if (AbstractC22676k.m65745e(screen, c9337j1.getName())) {
                return c9337j1;
            }
            C9329i1 c9329i1 = C9329i1.f27665w;
            if (AbstractC22676k.m65745e(screen, c9329i1.getName())) {
                return c9329i1;
            }
            C9345k1 c9345k1 = C9345k1.f27714w;
            if (AbstractC22676k.m65745e(screen, c9345k1.getName())) {
                return c9345k1;
            }
            C9353l1 c9353l1 = C9353l1.f27740w;
            if (AbstractC22676k.m65745e(screen, c9353l1.getName())) {
                return c9353l1;
            }
            C9361m1 c9361m1 = C9361m1.f27766w;
            if (AbstractC22676k.m65745e(screen, c9361m1.getName())) {
                return c9361m1;
            }
            C9401r1 c9401r1 = C9401r1.f27887w;
            if (AbstractC22676k.m65745e(screen, c9401r1.getName())) {
                return c9401r1;
            }
            C9409s1 c9409s1 = C9409s1.f27911w;
            if (AbstractC22676k.m65745e(screen, c9409s1.getName())) {
                return c9409s1;
            }
            C9417t1 c9417t1 = C9417t1.f27936w;
            if (AbstractC22676k.m65745e(screen, c9417t1.getName())) {
                return c9417t1;
            }
            C9425u1 c9425u1 = C9425u1.f27960w;
            if (AbstractC22676k.m65745e(screen, c9425u1.getName())) {
                return c9425u1;
            }
            C9433v1 c9433v1 = C9433v1.f27984w;
            if (AbstractC22676k.m65745e(screen, c9433v1.getName())) {
                return c9433v1;
            }
            C9441w1 c9441w1 = C9441w1.f28009w;
            if (AbstractC22676k.m65745e(screen, c9441w1.getName())) {
                return c9441w1;
            }
            C9449x1 c9449x1 = C9449x1.f28036w;
            if (AbstractC22676k.m65745e(screen, c9449x1.getName())) {
                return c9449x1;
            }
            C9266a2 c9266a2 = C9266a2.f27470w;
            if (AbstractC22676k.m65745e(screen, c9266a2.getName())) {
                return c9266a2;
            }
            C9274b2 c9274b2 = C9274b2.f27496w;
            if (AbstractC22676k.m65745e(screen, c9274b2.getName())) {
                return c9274b2;
            }
            C9290d2 c9290d2 = C9290d2.f27545w;
            if (AbstractC22676k.m65745e(screen, c9290d2.getName())) {
                return c9290d2;
            }
            C9456y1 c9456y1 = C9456y1.f28058w;
            if (AbstractC22676k.m65745e(screen, c9456y1.getName())) {
                return c9456y1;
            }
            C9463z1 c9463z1 = C9463z1.f28080w;
            if (AbstractC22676k.m65745e(screen, c9463z1.getName())) {
                return c9463z1;
            }
            C9298e2 c9298e2 = C9298e2.f27571w;
            if (AbstractC22676k.m65745e(screen, c9298e2.getName())) {
                return c9298e2;
            }
            C9306f2 c9306f2 = C9306f2.f27595w;
            if (AbstractC22676k.m65745e(screen, c9306f2.getName())) {
                return c9306f2;
            }
            C9314g2 c9314g2 = C9314g2.f27619w;
            if (AbstractC22676k.m65745e(screen, c9314g2.getName())) {
                return c9314g2;
            }
            C9322h2 c9322h2 = C9322h2.f27644w;
            if (AbstractC22676k.m65745e(screen, c9322h2.getName())) {
                return c9322h2;
            }
            C9330i2 c9330i2 = C9330i2.f27668w;
            if (AbstractC22676k.m65745e(screen, c9330i2.getName())) {
                return c9330i2;
            }
            C9338j2 c9338j2 = C9338j2.f27693w;
            if (AbstractC22676k.m65745e(screen, c9338j2.getName())) {
                return c9338j2;
            }
            C9346k2 c9346k2 = C9346k2.f27718w;
            if (AbstractC22676k.m65745e(screen, c9346k2.getName())) {
                return c9346k2;
            }
            C9354l2 c9354l2 = C9354l2.f27743w;
            if (AbstractC22676k.m65745e(screen, c9354l2.getName())) {
                return c9354l2;
            }
            C9362m2 c9362m2 = C9362m2.f27769w;
            if (AbstractC22676k.m65745e(screen, c9362m2.getName())) {
                return c9362m2;
            }
            C9370n2 c9370n2 = C9370n2.f27796w;
            if (AbstractC22676k.m65745e(screen, c9370n2.getName())) {
                return c9370n2;
            }
            C9378o2 c9378o2 = C9378o2.f27821w;
            if (AbstractC22676k.m65745e(screen, c9378o2.getName())) {
                return c9378o2;
            }
            C9386p2 c9386p2 = C9386p2.f27846w;
            if (AbstractC22676k.m65745e(screen, c9386p2.getName())) {
                return c9386p2;
            }
            C9394q2 c9394q2 = C9394q2.f27867w;
            if (AbstractC22676k.m65745e(screen, c9394q2.getName())) {
                return c9394q2;
            }
            C9402r2 c9402r2 = C9402r2.f27890w;
            if (AbstractC22676k.m65745e(screen, c9402r2.getName())) {
                return c9402r2;
            }
            C9410s2 c9410s2 = C9410s2.f27914w;
            if (AbstractC22676k.m65745e(screen, c9410s2.getName())) {
                return c9410s2;
            }
            C9418t2 c9418t2 = C9418t2.f27939w;
            if (AbstractC22676k.m65745e(screen, c9418t2.getName())) {
                return c9418t2;
            }
            C9426u2 c9426u2 = C9426u2.f27963w;
            if (AbstractC22676k.m65745e(screen, c9426u2.getName())) {
                return c9426u2;
            }
            C9434v2 c9434v2 = C9434v2.f27987w;
            if (AbstractC22676k.m65745e(screen, c9434v2.getName())) {
                return c9434v2;
            }
            C9442w2 c9442w2 = C9442w2.f28012w;
            if (AbstractC22676k.m65745e(screen, c9442w2.getName())) {
                return c9442w2;
            }
            C9450x2 c9450x2 = C9450x2.f28039w;
            if (AbstractC22676k.m65745e(screen, c9450x2.getName())) {
                return c9450x2;
            }
            C9457y2 c9457y2 = C9457y2.f28061w;
            if (AbstractC22676k.m65745e(screen, c9457y2.getName())) {
                return c9457y2;
            }
            C9464z2 c9464z2 = C9464z2.f28083w;
            if (AbstractC22676k.m65745e(screen, c9464z2.getName())) {
                return c9464z2;
            }
            C9267a3 c9267a3 = C9267a3.f27473w;
            if (AbstractC22676k.m65745e(screen, c9267a3.getName())) {
                return c9267a3;
            }
            C9275b3 c9275b3 = C9275b3.f27499w;
            if (AbstractC22676k.m65745e(screen, c9275b3.getName())) {
                return c9275b3;
            }
            C9283c3 c9283c3 = C9283c3.f27524w;
            if (AbstractC22676k.m65745e(screen, c9283c3.getName())) {
                return c9283c3;
            }
            C9291d3 c9291d3 = C9291d3.f27548w;
            if (AbstractC22676k.m65745e(screen, c9291d3.getName())) {
                return c9291d3;
            }
            C9299e3 c9299e3 = C9299e3.f27574w;
            if (AbstractC22676k.m65745e(screen, c9299e3.getName())) {
                return c9299e3;
            }
            C9307f3 c9307f3 = C9307f3.f27598w;
            if (AbstractC22676k.m65745e(screen, c9307f3.getName())) {
                return c9307f3;
            }
            C9315g3 c9315g3 = C9315g3.f27622w;
            if (AbstractC22676k.m65745e(screen, c9315g3.getName())) {
                return c9315g3;
            }
            C9323h3 c9323h3 = C9323h3.f27647w;
            if (AbstractC22676k.m65745e(screen, c9323h3.getName())) {
                return c9323h3;
            }
            C9331i3 c9331i3 = C9331i3.f27672w;
            if (AbstractC22676k.m65745e(screen, c9331i3.getName())) {
                return c9331i3;
            }
            C9339j3 c9339j3 = C9339j3.f27696w;
            if (AbstractC22676k.m65745e(screen, c9339j3.getName())) {
                return c9339j3;
            }
            C9347k3 c9347k3 = C9347k3.f27721w;
            if (AbstractC22676k.m65745e(screen, c9347k3.getName())) {
                return c9347k3;
            }
            C9355l3 c9355l3 = C9355l3.f27747w;
            if (AbstractC22676k.m65745e(screen, c9355l3.getName())) {
                return c9355l3;
            }
            C9363m3 c9363m3 = C9363m3.f27772w;
            if (AbstractC22676k.m65745e(screen, c9363m3.getName())) {
                return c9363m3;
            }
            C9371n3 c9371n3 = C9371n3.f27799w;
            if (AbstractC22676k.m65745e(screen, c9371n3.getName())) {
                return c9371n3;
            }
            C9379o3 c9379o3 = C9379o3.f27824w;
            if (AbstractC22676k.m65745e(screen, c9379o3.getName())) {
                return c9379o3;
            }
            C9387p3 c9387p3 = C9387p3.f27849w;
            if (AbstractC22676k.m65745e(screen, c9387p3.getName())) {
                return c9387p3;
            }
            C9403r3 c9403r3 = C9403r3.f27893w;
            if (AbstractC22676k.m65745e(screen, c9403r3.getName())) {
                return c9403r3;
            }
            C9395q3 c9395q3 = C9395q3.f27870w;
            if (AbstractC22676k.m65745e(screen, c9395q3.getName())) {
                return c9395q3;
            }
            C9411s3 c9411s3 = C9411s3.f27917w;
            if (AbstractC22676k.m65745e(screen, c9411s3.getName())) {
                return c9411s3;
            }
            C9419t3 c9419t3 = C9419t3.f27942w;
            if (AbstractC22676k.m65745e(screen, c9419t3.getName())) {
                return c9419t3;
            }
            C9427u3 c9427u3 = C9427u3.f27966w;
            if (AbstractC22676k.m65745e(screen, c9427u3.getName())) {
                return c9427u3;
            }
            C9435v3 c9435v3 = C9435v3.f27990w;
            if (AbstractC22676k.m65745e(screen, c9435v3.getName())) {
                return c9435v3;
            }
            C9443w3 c9443w3 = C9443w3.f28015w;
            if (AbstractC22676k.m65745e(screen, c9443w3.getName())) {
                return c9443w3;
            }
            C9451x3 c9451x3 = C9451x3.f28042w;
            if (AbstractC22676k.m65745e(screen, c9451x3.getName())) {
                return c9451x3;
            }
            C9458y3 c9458y3 = C9458y3.f28064w;
            if (AbstractC22676k.m65745e(screen, c9458y3.getName())) {
                return c9458y3;
            }
            C9465z3 c9465z3 = C9465z3.f28087w;
            if (AbstractC22676k.m65745e(screen, c9465z3.getName())) {
                return c9465z3;
            }
            C9268a4 c9268a4 = C9268a4.f27476w;
            if (AbstractC22676k.m65745e(screen, c9268a4.getName())) {
                return c9268a4;
            }
            C9276b4 c9276b4 = C9276b4.f27502w;
            if (AbstractC22676k.m65745e(screen, c9276b4.getName())) {
                return c9276b4;
            }
            C9284c4 c9284c4 = C9284c4.f27527w;
            if (AbstractC22676k.m65745e(screen, c9284c4.getName())) {
                return c9284c4;
            }
            C9292d4 c9292d4 = C9292d4.f27551w;
            if (AbstractC22676k.m65745e(screen, c9292d4.getName())) {
                return c9292d4;
            }
            C9300e4 c9300e4 = C9300e4.f27577w;
            if (AbstractC22676k.m65745e(screen, c9300e4.getName())) {
                return c9300e4;
            }
            C9316g4 c9316g4 = C9316g4.f27625w;
            if (AbstractC22676k.m65745e(screen, c9316g4.getName())) {
                return c9316g4;
            }
            C9308f4 c9308f4 = C9308f4.f27601w;
            if (AbstractC22676k.m65745e(screen, c9308f4.getName())) {
                return c9308f4;
            }
            C9404r4 c9404r4 = C9404r4.f27896w;
            if (AbstractC22676k.m65745e(screen, c9404r4.getName())) {
                return c9404r4;
            }
            C9324h4 c9324h4 = C9324h4.f27650w;
            if (AbstractC22676k.m65745e(screen, c9324h4.getName())) {
                return c9324h4;
            }
            C9332i4 c9332i4 = C9332i4.f27675w;
            if (AbstractC22676k.m65745e(screen, c9332i4.getName())) {
                return c9332i4;
            }
            C9340j4 c9340j4 = C9340j4.f27699w;
            if (AbstractC22676k.m65745e(screen, c9340j4.getName())) {
                return c9340j4;
            }
            C9348k4 c9348k4 = C9348k4.f27724w;
            if (AbstractC22676k.m65745e(screen, c9348k4.getName())) {
                return c9348k4;
            }
            C9356l4 c9356l4 = C9356l4.f27750w;
            if (AbstractC22676k.m65745e(screen, c9356l4.getName())) {
                return c9356l4;
            }
            C9364m4 c9364m4 = C9364m4.f27775w;
            if (AbstractC22676k.m65745e(screen, c9364m4.getName())) {
                return c9364m4;
            }
            C9372n4 c9372n4 = C9372n4.f27802w;
            if (AbstractC22676k.m65745e(screen, c9372n4.getName())) {
                return c9372n4;
            }
            C9380o4 c9380o4 = C9380o4.f27828w;
            if (AbstractC22676k.m65745e(screen, c9380o4.getName())) {
                return c9380o4;
            }
            C9388p4 c9388p4 = C9388p4.f27852w;
            if (AbstractC22676k.m65745e(screen, c9388p4.getName())) {
                return c9388p4;
            }
            C9396q4 c9396q4 = C9396q4.f27873w;
            if (AbstractC22676k.m65745e(screen, c9396q4.getName())) {
                return c9396q4;
            }
            C9282c2 c9282c2 = C9282c2.f27521w;
            if (AbstractC22676k.m65745e(screen, c9282c2.getName())) {
                return c9282c2;
            }
            C9412s4 c9412s4 = C9412s4.f27920w;
            if (AbstractC22676k.m65745e(screen, c9412s4.getName())) {
                return c9412s4;
            }
            C9420t4 c9420t4 = C9420t4.f27945w;
            if (AbstractC22676k.m65745e(screen, c9420t4.getName())) {
                return c9420t4;
            }
            C9428u4 c9428u4 = C9428u4.f27969w;
            if (AbstractC22676k.m65745e(screen, c9428u4.getName())) {
                return c9428u4;
            }
            C9436v4 c9436v4 = C9436v4.f27993w;
            if (AbstractC22676k.m65745e(screen, c9436v4.getName())) {
                return c9436v4;
            }
            C9444w4 c9444w4 = C9444w4.f28018w;
            if (AbstractC22676k.m65745e(screen, c9444w4.getName())) {
                return c9444w4;
            }
            C9452x4 c9452x4 = C9452x4.f28045w;
            if (AbstractC22676k.m65745e(screen, c9452x4.getName())) {
                return c9452x4;
            }
            C9459y4 c9459y4 = C9459y4.f28067w;
            if (AbstractC22676k.m65745e(screen, c9459y4.getName())) {
                return c9459y4;
            }
            C9466z4 c9466z4 = C9466z4.f28090w;
            if (AbstractC22676k.m65745e(screen, c9466z4.getName())) {
                return c9466z4;
            }
            C9269a5 c9269a5 = C9269a5.f27479w;
            if (AbstractC22676k.m65745e(screen, c9269a5.getName())) {
                return c9269a5;
            }
            C9277b5 c9277b5 = C9277b5.f27505w;
            if (AbstractC22676k.m65745e(screen, c9277b5.getName())) {
                return c9277b5;
            }
            C9285c5 c9285c5 = C9285c5.f27530w;
            if (AbstractC22676k.m65745e(screen, c9285c5.getName())) {
                return c9285c5;
            }
            C9293d5 c9293d5 = C9293d5.f27554w;
            if (AbstractC22676k.m65745e(screen, c9293d5.getName())) {
                return c9293d5;
            }
            C9301e5 c9301e5 = C9301e5.f27580w;
            if (AbstractC22676k.m65745e(screen, c9301e5.getName())) {
                return c9301e5;
            }
            C9309f5 c9309f5 = C9309f5.f27604w;
            if (AbstractC22676k.m65745e(screen, c9309f5.getName())) {
                return c9309f5;
            }
            C9317g5 c9317g5 = C9317g5.f27629w;
            if (AbstractC22676k.m65745e(screen, c9317g5.getName())) {
                return c9317g5;
            }
            C9325h5 c9325h5 = C9325h5.f27653w;
            if (AbstractC22676k.m65745e(screen, c9325h5.getName())) {
                return c9325h5;
            }
            C9333i5 c9333i5 = C9333i5.f27678w;
            if (AbstractC22676k.m65745e(screen, c9333i5.getName())) {
                return c9333i5;
            }
            C9341j5 c9341j5 = C9341j5.f27702w;
            if (AbstractC22676k.m65745e(screen, c9341j5.getName())) {
                return c9341j5;
            }
            C9349k5 c9349k5 = C9349k5.f27727w;
            if (AbstractC22676k.m65745e(screen, c9349k5.getName())) {
                return c9349k5;
            }
            C9357l5 c9357l5 = C9357l5.f27754w;
            if (AbstractC22676k.m65745e(screen, c9357l5.getName())) {
                return c9357l5;
            }
            C9365m5 c9365m5 = C9365m5.f27779w;
            if (AbstractC22676k.m65745e(screen, c9365m5.getName())) {
                return c9365m5;
            }
            C9373n5 c9373n5 = C9373n5.f27805w;
            if (AbstractC22676k.m65745e(screen, c9373n5.getName())) {
                return c9373n5;
            }
            C9381o5 c9381o5 = C9381o5.f27831w;
            if (AbstractC22676k.m65745e(screen, c9381o5.getName())) {
                return c9381o5;
            }
            C9389p5 c9389p5 = C9389p5.f27855w;
            if (AbstractC22676k.m65745e(screen, c9389p5.getName())) {
                return c9389p5;
            }
            C9421t5 c9421t5 = C9421t5.f27948w;
            if (AbstractC22676k.m65745e(screen, c9421t5.getName())) {
                return c9421t5;
            }
            C9405r5 c9405r5 = C9405r5.f27899w;
            if (AbstractC22676k.m65745e(screen, c9405r5.getName())) {
                return c9405r5;
            }
            C9413s5 c9413s5 = C9413s5.f27923w;
            if (AbstractC22676k.m65745e(screen, c9413s5.getName())) {
                return c9413s5;
            }
            C9429u5 c9429u5 = C9429u5.f27972w;
            if (AbstractC22676k.m65745e(screen, c9429u5.getName())) {
                return c9429u5;
            }
            C9437v5 c9437v5 = C9437v5.f27996w;
            if (AbstractC22676k.m65745e(screen, c9437v5.getName())) {
                return c9437v5;
            }
            C9445w5 c9445w5 = C9445w5.f28022w;
            if (AbstractC22676k.m65745e(screen, c9445w5.getName())) {
                return c9445w5;
            }
            C9453x5 c9453x5 = C9453x5.f28049w;
            if (AbstractC22676k.m65745e(screen, c9453x5.getName())) {
                return c9453x5;
            }
            C9460y5 c9460y5 = C9460y5.f28071w;
            if (AbstractC22676k.m65745e(screen, c9460y5.getName())) {
                return c9460y5;
            }
            C9467z5 c9467z5 = C9467z5.f28093w;
            if (AbstractC22676k.m65745e(screen, c9467z5.getName())) {
                return c9467z5;
            }
            C9369n1 c9369n1 = C9369n1.f27793w;
            if (AbstractC22676k.m65745e(screen, c9369n1.getName())) {
                return c9369n1;
            }
            C9377o1 c9377o1 = C9377o1.f27818w;
            if (AbstractC22676k.m65745e(screen, c9377o1.getName())) {
                return c9377o1;
            }
            C9385p1 c9385p1 = C9385p1.f27843w;
            if (AbstractC22676k.m65745e(screen, c9385p1.getName())) {
                return c9385p1;
            }
            C9270a6 c9270a6 = C9270a6.f27482w;
            if (AbstractC22676k.m65745e(screen, c9270a6.getName())) {
                return c9270a6;
            }
            C9294d6 c9294d6 = C9294d6.f27557w;
            if (AbstractC22676k.m65745e(screen, c9294d6.getName())) {
                return c9294d6;
            }
            C9321h1 c9321h1 = C9321h1.f27641w;
            if (AbstractC22676k.m65745e(screen, c9321h1.getName())) {
                return c9321h1;
            }
            C9302e6 c9302e6 = C9302e6.f27583w;
            if (AbstractC22676k.m65745e(screen, c9302e6.getName())) {
                return c9302e6;
            }
            C9310f6 c9310f6 = C9310f6.f27607w;
            if (AbstractC22676k.m65745e(screen, c9310f6.getName())) {
                return c9310f6;
            }
            C9286c6 c9286c6 = C9286c6.f27533w;
            if (AbstractC22676k.m65745e(screen, c9286c6.getName())) {
                return c9286c6;
            }
            C9278b6 c9278b6 = C9278b6.f27508w;
            if (AbstractC22676k.m65745e(screen, c9278b6.getName())) {
                return c9278b6;
            }
            C9334i6 c9334i6 = C9334i6.f27681w;
            if (AbstractC22676k.m65745e(screen, c9334i6.getName())) {
                return c9334i6;
            }
            C9326h6 c9326h6 = C9326h6.f27656w;
            if (AbstractC22676k.m65745e(screen, c9326h6.getName())) {
                return c9326h6;
            }
            String str = null;
            Object[] objArr = 0;
            if (AbstractC22676k.m65745e(screen, URLScreen.NAME)) {
                return new URLScreen(str, 1, objArr == true ? 1 : 0);
            }
            C9342j6 c9342j6 = C9342j6.f27705w;
            if (AbstractC22676k.m65745e(screen, c9342j6.getName())) {
                return c9342j6;
            }
            C9350k6 c9350k6 = C9350k6.f27730w;
            if (AbstractC22676k.m65745e(screen, c9350k6.getName())) {
                return c9350k6;
            }
            C9358l6 c9358l6 = C9358l6.f27757w;
            if (AbstractC22676k.m65745e(screen, c9358l6.getName())) {
                return c9358l6;
            }
            C9366m6 c9366m6 = C9366m6.f27782w;
            if (AbstractC22676k.m65745e(screen, c9366m6.getName())) {
                return c9366m6;
            }
            C9374n6 c9374n6 = C9374n6.f27808w;
            if (AbstractC22676k.m65745e(screen, c9374n6.getName())) {
                return c9374n6;
            }
            C9382o6 c9382o6 = C9382o6.f27834w;
            if (AbstractC22676k.m65745e(screen, c9382o6.getName())) {
                return c9382o6;
            }
            C9390p6 c9390p6 = C9390p6.f27858w;
            if (AbstractC22676k.m65745e(screen, c9390p6.getName())) {
                return c9390p6;
            }
            C9398q6 c9398q6 = C9398q6.f27879w;
            if (AbstractC22676k.m65745e(screen, c9398q6.getName())) {
                return c9398q6;
            }
            C9406r6 c9406r6 = C9406r6.f27902w;
            if (AbstractC22676k.m65745e(screen, c9406r6.getName())) {
                return c9406r6;
            }
            C9414s6 c9414s6 = C9414s6.f27926w;
            if (AbstractC22676k.m65745e(screen, c9414s6.getName())) {
                return c9414s6;
            }
            C9422t6 c9422t6 = C9422t6.f27951w;
            if (AbstractC22676k.m65745e(screen, c9422t6.getName())) {
                return c9422t6;
            }
            C9430u6 c9430u6 = C9430u6.f27975w;
            if (AbstractC22676k.m65745e(screen, c9430u6.getName())) {
                return c9430u6;
            }
            C9438v6 c9438v6 = C9438v6.f28000w;
            if (AbstractC22676k.m65745e(screen, c9438v6.getName())) {
                return c9438v6;
            }
            C9446w6 c9446w6 = C9446w6.f28025w;
            if (AbstractC22676k.m65745e(screen, c9446w6.getName())) {
                return c9446w6;
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public final AppScreen m23031a(String screen, Collection<String> featureScreens) {
            Set set;
            Object next;
            Object[] objArr;
            AbstractC22676k.m65750j(screen, "screen");
            AbstractC22676k.m65750j(featureScreens, "featureScreens");
            Locale locale = AppScreen.locale;
            AbstractC22676k.m65749i(locale, "access$getLocale$cp(...)");
            String upperCase = screen.toUpperCase(locale);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            AppScreen appScreenM23030d = m23030d(upperCase);
            if (appScreenM23030d != null) {
                return appScreenM23030d;
            }
            AppScreen appScreenM23029c = m23029c(upperCase);
            if (appScreenM23029c != null) {
                return appScreenM23029c;
            }
            Iterator<T> it = featureScreens.iterator();
            do {
                set = null;
                objArr = 0;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC39421y.m125921F((String) next, upperCase, true));
            String str = (String) next;
            return str != null ? new FeatureSpecificAppScreen(str, set, 2, (DefaultConstructorMarker) (objArr == true ? 1 : 0)) : C9318g6.f27632w;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$q2 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$q2;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9394q2 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9394q2 f27867w = new C9394q2();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "HEALTH_TAB";

        /* JADX INFO: renamed from: y */
        public static final int f27869y = 8;

        private C9394q2() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$q3 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$q3;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9395q3 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9395q3 f27870w = new C9395q3();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "LOG_SYMPTOMS";

        /* JADX INFO: renamed from: y */
        public static final int f27872y = 8;

        private C9395q3() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$q4 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$q4;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9396q4 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9396q4 f27873w = new C9396q4();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "PRIVACY";

        /* JADX INFO: renamed from: y */
        public static final int f27875y = 8;

        private C9396q4() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$q5 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$q5;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9397q5 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9397q5 f27876w = new C9397q5();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "START_ACTIVITY";

        /* JADX INFO: renamed from: y */
        public static final int f27878y = 8;

        private C9397q5() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$q6 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$q6;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9398q6 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9398q6 f27879w = new C9398q6();

        /* JADX INFO: renamed from: x */
        public static final int f27880x = 8;

        private C9398q6() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return "WHAT_TO_EXPECT";
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$r */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$r;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9399r extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9399r f27881w = new C9399r();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "MEDICARE_AFTER_ACTIVATION";

        /* JADX INFO: renamed from: y */
        public static final int f27883y = 8;

        private C9399r() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$r0 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$r0;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9400r0 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9400r0 f27884w = new C9400r0();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ADVANCED_LABS_TYPEFORM_WEBVIEW";

        /* JADX INFO: renamed from: y */
        public static final int f27886y = 8;

        private C9400r0() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$r1 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$r1;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9401r1 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9401r1 f27887w = new C9401r1();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "CUSTOMIZE_BOTTOM_SHEET";

        /* JADX INFO: renamed from: y */
        public static final int f27889y = 8;

        private C9401r1() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$r2 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$r2;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9402r2 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9402r2 f27890w = new C9402r2();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "HEALTHSPAN";

        /* JADX INFO: renamed from: y */
        public static final int f27892y = 8;

        private C9402r2() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$r3 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$r3;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9403r3 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9403r3 f27893w = new C9403r3();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "LOG_IN";

        /* JADX INFO: renamed from: y */
        public static final int f27895y = 8;

        private C9403r3() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$r4 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$r4;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9404r4 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9404r4 f27896w = new C9404r4();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "PRODUCT_SIZE_GUIDE";

        /* JADX INFO: renamed from: y */
        public static final int f27898y = 8;

        private C9404r4() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$r5 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$r5;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9405r5 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9405r5 f27899w = new C9405r5();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "STRAIN_COACH";

        /* JADX INFO: renamed from: y */
        public static final int f27901y = 8;

        private C9405r5() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$r6 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$r6;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9406r6 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9406r6 f27902w = new C9406r6();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "WHOOP_LABS";

        /* JADX INFO: renamed from: y */
        public static final int f27904y = 8;

        private C9406r6() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$s */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$s;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9407s extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9407s f27905w = new C9407s();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "MEDICARE_PERMISSIONS";

        /* JADX INFO: renamed from: y */
        public static final int f27907y = 8;

        private C9407s() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$s0 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$s0;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9408s0 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9408s0 f27908w = new C9408s0();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ADVANCED_LABS_UPDATE_TESTS";

        /* JADX INFO: renamed from: y */
        public static final int f27910y = 8;

        private C9408s0() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$s1 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$s1;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9409s1 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9409s1 f27911w = new C9409s1();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "CUSTOMIZE_JOURNAL";

        /* JADX INFO: renamed from: y */
        public static final int f27913y = 8;

        private C9409s1() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$s2 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$s2;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9410s2 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9410s2 f27914w = new C9410s2();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "HEART_SCREENER";

        /* JADX INFO: renamed from: y */
        public static final int f27916y = 8;

        private C9410s2() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$s3 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$s3;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9411s3 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9411s3 f27917w = new C9411s3();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "MARKETING_CONSENT_SCREEN";

        /* JADX INFO: renamed from: y */
        public static final int f27919y = 8;

        private C9411s3() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$s4 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$s4;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9412s4 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9412s4 f27920w = new C9412s4();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "PROFILE";

        /* JADX INFO: renamed from: y */
        public static final int f27922y = 8;

        private C9412s4() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$s5 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$s5;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9413s5 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9413s5 f27923w = new C9413s5();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "STRAIN_COACH_V2";

        /* JADX INFO: renamed from: y */
        public static final int f27925y = 8;

        private C9413s5() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$s6 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$s6;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9414s6 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9414s6 f27926w = new C9414s6();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "WHOOP_LABS_CAMPAIGN_DETAILS";

        /* JADX INFO: renamed from: y */
        public static final int f27928y = 8;

        private C9414s6() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$t */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$t;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9415t extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9415t f27929w = new C9415t();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "MEMBERSHIP_SERVICES";

        /* JADX INFO: renamed from: y */
        public static final int f27931y = 8;

        private C9415t() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$t0 */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$t0;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "", "y", "Ljava/util/Set;", "getOtherNames", "()Ljava/util/Set;", "otherNames", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9416t0 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9416t0 f27932w = new C9416t0();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ADVANCED_LABS_UPLOAD_TEST";

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private static final Set<String> otherNames = AbstractC12350b.m34570S("advanced_labs_upload");

        /* JADX INFO: renamed from: z */
        public static final int f27935z = 8;

        private C9416t0() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }

        @Override // com.whoop.navigation.AppScreen
        public Set<String> getOtherNames() {
            return otherNames;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$t1 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$t1;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9417t1 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9417t1 f27936w = new C9417t1();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "CUSTOMIZE_MY_DASHBOARD";

        /* JADX INFO: renamed from: y */
        public static final int f27938y = 8;

        private C9417t1() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$t2 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$t2;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9418t2 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9418t2 f27939w = new C9418t2();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "HIDE_METRICS";

        /* JADX INFO: renamed from: y */
        public static final int f27941y = 8;

        private C9418t2() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$t3 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$t3;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9419t3 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9419t3 f27942w = new C9419t3();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "MCI_LOG_CALENDAR";

        /* JADX INFO: renamed from: y */
        public static final int f27944y = 8;

        private C9419t3() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$t4 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$t4;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9420t4 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9420t4 f27945w = new C9420t4();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "REACTIVATION_UPSELL";

        /* JADX INFO: renamed from: y */
        public static final int f27947y = 8;

        private C9420t4() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$t5 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$t5;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9421t5 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9421t5 f27948w = new C9421t5();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "STREAK_CELEBRATION";

        /* JADX INFO: renamed from: y */
        public static final int f27950y = 8;

        private C9421t5() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$t6 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$t6;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9422t6 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9422t6 f27951w = new C9422t6();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "WHOOP_LABS_CAMPAIGN_LIST";

        /* JADX INFO: renamed from: y */
        public static final int f27953y = 8;

        private C9422t6() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$u */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$u;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9423u extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9423u f27954w = new C9423u();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "MFA_CHALLENGE";

        /* JADX INFO: renamed from: y */
        public static final int f27956y = 8;

        private C9423u() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$u0 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$u0;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9424u0 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9424u0 f27957w = new C9424u0();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "AI_CHAT";

        /* JADX INFO: renamed from: y */
        public static final int f27959y = 8;

        private C9424u0() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$u1 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$u1;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9425u1 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9425u1 f27960w = new C9425u1();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "CYCLE_PATTERN_HISTORY";

        /* JADX INFO: renamed from: y */
        public static final int f27962y = 8;

        private C9425u1() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$u2 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$u2;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9426u2 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9426u2 f27963w = new C9426u2();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "HOME";

        /* JADX INFO: renamed from: y */
        public static final int f27965y = 8;

        private C9426u2() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$u3 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$u3;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9427u3 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9427u3 f27966w = new C9427u3();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "MENSTRUAL_CYCLE_INSIGHTS";

        /* JADX INFO: renamed from: y */
        public static final int f27968y = 8;

        private C9427u3() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$u4 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$u4;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9428u4 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9428u4 f27969w = new C9428u4();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "RECOVERY_DETAILS";

        /* JADX INFO: renamed from: y */
        public static final int f27971y = 8;

        private C9428u4() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$u5 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$u5;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9429u5 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9429u5 f27972w = new C9429u5();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "DATA_STREAK_EXPLAINER";

        /* JADX INFO: renamed from: y */
        public static final int f27974y = 8;

        private C9429u5() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$u6 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$u6;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9430u6 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9430u6 f27975w = new C9430u6();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "WHOOP_LIVE";

        /* JADX INFO: renamed from: y */
        public static final int f27977y = 8;

        private C9430u6() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$v */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$v;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9431v extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9431v f27978w = new C9431v();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "PAIRING";

        /* JADX INFO: renamed from: y */
        public static final int f27980y = 8;

        private C9431v() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$v0 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$v0;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9432v0 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9432v0 f27981w = new C9432v0();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "AI_INSIGHTS";

        /* JADX INFO: renamed from: y */
        public static final int f27983y = 8;

        private C9432v0() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$v1 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$v1;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9433v1 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9433v1 f27984w = new C9433v1();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "DAY_ZERO_PERSONALIZATION";

        /* JADX INFO: renamed from: y */
        public static final int f27986y = 8;

        private C9433v1() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$v2 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$v2;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9434v2 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9434v2 f27987w = new C9434v2();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "HORMONAL_INSIGHTS_ONBOARDING";

        /* JADX INFO: renamed from: y */
        public static final int f27989y = 8;

        private C9434v2() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$v3 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$v3;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9435v3 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9435v3 f27990w = new C9435v3();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "MENSTRUAL_CYCLE_INSIGHTS_PHASE_EDUCATION";

        /* JADX INFO: renamed from: y */
        public static final int f27992y = 8;

        private C9435v3() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$v4 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$v4;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9436v4 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9436v4 f27993w = new C9436v4();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "RAF_SHARE";

        /* JADX INFO: renamed from: y */
        public static final int f27995y = 8;

        private C9436v4() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$v5 */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$v5;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "", "y", "Ljava/util/Set;", "getOtherNames", "()Ljava/util/Set;", "otherNames", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9437v5 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9437v5 f27996w = new C9437v5();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "WORKOUT_LIBRARY";

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private static final Set<String> otherNames = AbstractC12350b.m34570S("WORKOUT_BUILDER");

        /* JADX INFO: renamed from: z */
        public static final int f27999z = 8;

        private C9437v5() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }

        @Override // com.whoop.navigation.AppScreen
        public Set<String> getOtherNames() {
            return otherNames;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$v6 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$v6;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9438v6 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9438v6 f28000w = new C9438v6();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "SHARE";

        /* JADX INFO: renamed from: y */
        public static final int f28002y = 8;

        private C9438v6() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$w */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$w;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9439w extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9439w f28003w = new C9439w();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "POST_PAIRING";

        /* JADX INFO: renamed from: y */
        public static final int f28005y = 8;

        private C9439w() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$w0 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$w0;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9440w0 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9440w0 f28006w = new C9440w0();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ALL_BIOMARKER_RECORDINGS";

        /* JADX INFO: renamed from: y */
        public static final int f28008y = 8;

        private C9440w0() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$w1 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$w1;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9441w1 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9441w1 f28009w = new C9441w1();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "DAY_ZERO_SPLASH";

        /* JADX INFO: renamed from: y */
        public static final int f28011y = 8;

        private C9441w1() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$w2 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$w2;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9442w2 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9442w2 f28012w = new C9442w2();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "HORMONAL_INSIGHTS_SETTINGS";

        /* JADX INFO: renamed from: y */
        public static final int f28014y = 8;

        private C9442w2() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$w3 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$w3;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9443w3 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9443w3 f28015w = new C9443w3();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "MEDIA_FOCUS";

        /* JADX INFO: renamed from: y */
        public static final int f28017y = 8;

        private C9443w3() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$w4 */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$w4;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "", "y", "Ljava/util/Set;", "getOtherNames", "()Ljava/util/Set;", "otherNames", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9444w4 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9444w4 f28018w = new C9444w4();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "RAF_HUB";

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private static final Set<String> otherNames = AbstractC12350b.m34570S("ReferAFriend");

        /* JADX INFO: renamed from: z */
        public static final int f28021z = 8;

        private C9444w4() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }

        @Override // com.whoop.navigation.AppScreen
        public Set<String> getOtherNames() {
            return otherNames;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$w5 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$w5;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9445w5 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9445w5 f28022w = new C9445w5();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "STRESS_INTERVENTION";

        /* JADX INFO: renamed from: y */
        public static final int f28024y = 8;

        private C9445w5() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$w6 */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$w6;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "", "y", "Ljava/util/Set;", "getOtherNames", "()Ljava/util/Set;", "otherNames", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9446w6 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9446w6 f28025w = new C9446w6();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "YEARINREVIEW";

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private static final Set<String> otherNames = AbstractC12350b.m34570S("YEAR_IN_REVIEW");

        /* JADX INFO: renamed from: z */
        public static final int f28028z = 8;

        private C9446w6() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }

        @Override // com.whoop.navigation.AppScreen
        public Set<String> getOtherNames() {
            return otherNames;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$x */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$x;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "", "y", "Ljava/util/Set;", "getOtherNames", "()Ljava/util/Set;", "otherNames", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9447x extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9447x f28029w = new C9447x();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "START_SCREEN";

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private static final Set<String> otherNames = AbstractC12350b.m34570S("WHOOP_WELCOME");

        /* JADX INFO: renamed from: z */
        public static final int f28032z = 8;

        private C9447x() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }

        @Override // com.whoop.navigation.AppScreen
        public Set<String> getOtherNames() {
            return otherNames;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$x0 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$x0;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9448x0 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9448x0 f28033w = new C9448x0();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ANNUAL_UPSELL";

        /* JADX INFO: renamed from: y */
        public static final int f28035y = 8;

        private C9448x0() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$x1 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$x1;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9449x1 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9449x1 f28036w = new C9449x1();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "PILLAR_DEEP_DIVE";

        /* JADX INFO: renamed from: y */
        public static final int f28038y = 8;

        private C9449x1() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$x2 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$x2;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9450x2 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9450x2 f28039w = new C9450x2();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "HR_SETTINGS";

        /* JADX INFO: renamed from: y */
        public static final int f28041y = 8;

        private C9450x2() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$x3 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$x3;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9451x3 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9451x3 f28042w = new C9451x3();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "MEMBERSHIP_ADJUSTMENT";

        /* JADX INFO: renamed from: y */
        public static final int f28044y = 8;

        private C9451x3() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$x4 */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$x4;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "", "y", "Ljava/util/Set;", "getOtherNames", "()Ljava/util/Set;", "otherNames", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9452x4 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9452x4 f28045w = new C9452x4();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "RAF_RECEIVER";

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private static final Set<String> otherNames = AbstractC12350b.m34570S("advanced_labs_early_access");

        /* JADX INFO: renamed from: z */
        public static final int f28048z = 8;

        private C9452x4() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }

        @Override // com.whoop.navigation.AppScreen
        public Set<String> getOtherNames() {
            return otherNames;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$x5 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$x5;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9453x5 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9453x5 f28049w = new C9453x5();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "STRESS_MONITOR";

        /* JADX INFO: renamed from: y */
        public static final int f28051y = 8;

        private C9453x5() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$y */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$y;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9454y extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9454y f28052w = new C9454y();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ACTIVITY_EDIT";

        /* JADX INFO: renamed from: y */
        public static final int f28054y = 8;

        private C9454y() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$y0 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$y0;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9455y0 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9455y0 f28055w = new C9455y0();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "AUTHENTICATED_WEB_VIEW";

        /* JADX INFO: renamed from: y */
        public static final int f28057y = 8;

        private C9455y0() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$y1 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$y1;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9456y1 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9456y1 f28058w = new C9456y1();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "DEVICE_SETTINGS";

        /* JADX INFO: renamed from: y */
        public static final int f28060y = 8;

        private C9456y1() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$y2 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$y2;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9457y2 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9457y2 f28061w = new C9457y2();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "IN_APP_BROWSER";

        /* JADX INFO: renamed from: y */
        public static final int f28063y = 8;

        private C9457y2() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$y3 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$y3;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9458y3 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9458y3 f28064w = new C9458y3();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "MEMBERSHIP_ADJUSTMENT_CHECKOUT";

        /* JADX INFO: renamed from: y */
        public static final int f28066y = 8;

        private C9458y3() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$y4 */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$y4;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "", "y", "Ljava/util/Set;", "getOtherNames", "()Ljava/util/Set;", "otherNames", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9459y4 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9459y4 f28067w = new C9459y4();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "RESUME_FROM_LINK";

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private static final Set<String> otherNames = AbstractC12350b.m34570S("resume-from-link");

        /* JADX INFO: renamed from: z */
        public static final int f28070z = 8;

        private C9459y4() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }

        @Override // com.whoop.navigation.AppScreen
        public Set<String> getOtherNames() {
            return otherNames;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$y5 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$y5;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9460y5 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9460y5 f28071w = new C9460y5();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "SYMPTOM_PATTERNS";

        /* JADX INFO: renamed from: y */
        public static final int f28073y = 8;

        private C9460y5() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$z */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$z;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9461z extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9461z f28074w = new C9461z();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "ADD_ACTIVITY";

        /* JADX INFO: renamed from: y */
        public static final int f28076y = 8;

        private C9461z() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$z0 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$z0;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9462z0 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9462z0 f28077w = new C9462z0();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "BEHAVIOR_DETAILS";

        /* JADX INFO: renamed from: y */
        public static final int f28079y = 8;

        private C9462z0() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$z1 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$z1;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9463z1 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9463z1 f28080w = new C9463z1();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "DOWNLOADED_FILE_EXPORT";

        /* JADX INFO: renamed from: y */
        public static final int f28082y = 8;

        private C9463z1() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$z2 */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$z2;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "", "y", "Ljava/util/Set;", "getOtherNames", "()Ljava/util/Set;", "otherNames", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9464z2 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9464z2 f28083w = new C9464z2();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "INTEGRATIONS";

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private static final Set<String> otherNames = AbstractC25260n.m74059b1(new String[]{"INTEGRATION_DETAILS", "INTEGRATIONS_HUB"});

        /* JADX INFO: renamed from: z */
        public static final int f28086z = 8;

        private C9464z2() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }

        @Override // com.whoop.navigation.AppScreen
        public Set<String> getOtherNames() {
            return otherNames;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$z3 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$z3;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9465z3 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9465z3 f28087w = new C9465z3();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "MEMBERSHIP_AND_BILLING";

        /* JADX INFO: renamed from: y */
        public static final int f28089y = 8;

        private C9465z3() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$z4 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$z4;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9466z4 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9466z4 f28090w = new C9466z4();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "RETURNS";

        /* JADX INFO: renamed from: y */
        public static final int f28092y = 8;

        private C9466z4() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.AppScreen$z5 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/AppScreen$z5;", "Lcom/whoop/navigation/AppScreen;", "<init>", "()V", "", "x", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9467z5 extends AppScreen {

        /* JADX INFO: renamed from: w */
        public static final C9467z5 f28093w = new C9467z5();

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final String name = "TILT_MODE";

        /* JADX INFO: renamed from: y */
        public static final int f28095y = 8;

        private C9467z5() {
            super(null);
        }

        @Override // com.whoop.navigation.AppScreen
        public String getName() {
            return name;
        }
    }

    public /* synthetic */ AppScreen(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getName();

    public Set<String> getOtherNames() {
        return this.otherNames;
    }

    public String toString() {
        return AbstractC11266d.m30461o("AppScreen.", getName());
    }

    private AppScreen() {
        this.otherNames = C25235a0.f99113w;
    }
}
