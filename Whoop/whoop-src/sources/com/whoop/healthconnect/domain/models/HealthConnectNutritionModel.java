package com.whoop.healthconnect.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b+\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b<\b\u0087\b\u0018\u0000 ¼\u00012\u00020\u0001:\u0004½\u0001¼\u0001Bñ\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0007\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0007\u0012\b\u00100\u001a\u0004\u0018\u00010\u0007\u0012\b\u00101\u001a\u0004\u0018\u00010\u0007\u0012\b\u00102\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u00107\u001a\u00020\u0002¢\u0006\u0004\b8\u00109B\u0095\u0004\b\u0010\u0012\u0006\u0010:\u001a\u000203\u0012\u0006\u0010;\u001a\u000203\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0007\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0007\u0012\b\u00100\u001a\u0004\u0018\u00010\u0007\u0012\b\u00101\u001a\u0004\u0018\u00010\u0007\u0012\b\u00102\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u00104\u001a\u000203\u0012\b\u00106\u001a\u0004\u0018\u000105\u0012\b\u00107\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010=\u001a\u0004\u0018\u00010<¢\u0006\u0004\b8\u0010>J\u0010\u0010?\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bA\u0010@J\u0010\u0010B\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bB\u0010@J\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u0010@J\u0012\u0010D\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bF\u0010EJ\u0012\u0010G\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bG\u0010EJ\u0012\u0010H\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bH\u0010EJ\u0012\u0010I\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bI\u0010EJ\u0012\u0010J\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bJ\u0010EJ\u0012\u0010K\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bK\u0010EJ\u0012\u0010L\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bL\u0010EJ\u0012\u0010M\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bM\u0010EJ\u0012\u0010N\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bN\u0010EJ\u0012\u0010O\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bO\u0010EJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bP\u0010EJ\u0012\u0010Q\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bQ\u0010EJ\u0012\u0010R\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bR\u0010EJ\u0012\u0010S\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bS\u0010EJ\u0012\u0010T\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bT\u0010EJ\u0012\u0010U\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bU\u0010EJ\u0012\u0010V\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bV\u0010EJ\u0012\u0010W\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bW\u0010EJ\u0012\u0010X\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bX\u0010EJ\u0012\u0010Y\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bY\u0010EJ\u0012\u0010Z\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bZ\u0010EJ\u0012\u0010[\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b[\u0010EJ\u0012\u0010\\\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\\\u0010EJ\u0012\u0010]\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b]\u0010EJ\u0012\u0010^\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b^\u0010EJ\u0012\u0010_\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b_\u0010EJ\u0012\u0010`\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b`\u0010EJ\u0012\u0010a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\ba\u0010EJ\u0012\u0010b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bb\u0010EJ\u0012\u0010c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bc\u0010EJ\u0012\u0010d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bd\u0010EJ\u0012\u0010e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\be\u0010EJ\u0012\u0010f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bf\u0010EJ\u0012\u0010g\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bg\u0010EJ\u0012\u0010h\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bh\u0010EJ\u0012\u0010i\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bi\u0010EJ\u0012\u0010j\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bj\u0010EJ\u0012\u0010k\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bk\u0010EJ\u0012\u0010l\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bl\u0010EJ\u0012\u0010m\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bm\u0010EJ\u0012\u0010n\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bn\u0010EJ\u0012\u0010o\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bo\u0010@J\u0010\u0010p\u001a\u000203HÆ\u0003¢\u0006\u0004\bp\u0010qJ\u0010\u0010r\u001a\u000205HÆ\u0003¢\u0006\u0004\br\u0010sJ\u0010\u0010t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bt\u0010@JÞ\u0004\u0010u\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u00104\u001a\u0002032\b\b\u0002\u00106\u001a\u0002052\b\b\u0002\u00107\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\bu\u0010vJ\u0010\u0010w\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bw\u0010@J\u0010\u0010x\u001a\u000203HÖ\u0001¢\u0006\u0004\bx\u0010qJ\u001a\u0010{\u001a\u00020z2\b\u0010y\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b{\u0010|J-\u0010\u0085\u0001\u001a\u00030\u0082\u00012\u0006\u0010}\u001a\u00020\u00002\u0006\u0010\u007f\u001a\u00020~2\b\u0010\u0081\u0001\u001a\u00030\u0080\u0001H\u0001¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001c\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0003\u0010\u0086\u0001\u001a\u0005\b\u0087\u0001\u0010@R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0004\u0010\u0086\u0001\u001a\u0005\b\u0088\u0001\u0010@R\u001c\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0005\u0010\u0086\u0001\u001a\u0005\b\u0089\u0001\u0010@R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0006\u0010\u0086\u0001\u001a\u0005\b\u008a\u0001\u0010@R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\b\u0010\u008b\u0001\u001a\u0005\b\u008c\u0001\u0010ER\u001e\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\t\u0010\u008b\u0001\u001a\u0005\b\u008d\u0001\u0010ER\u001e\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\n\u0010\u008b\u0001\u001a\u0005\b\u008e\u0001\u0010ER\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u000b\u0010\u008b\u0001\u001a\u0005\b\u008f\u0001\u0010ER\u001e\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\f\u0010\u008b\u0001\u001a\u0005\b\u0090\u0001\u0010ER\u001e\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\r\u0010\u008b\u0001\u001a\u0005\b\u0091\u0001\u0010ER\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u000e\u0010\u008b\u0001\u001a\u0005\b\u0092\u0001\u0010ER\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u000f\u0010\u008b\u0001\u001a\u0005\b\u0093\u0001\u0010ER\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0010\u0010\u008b\u0001\u001a\u0005\b\u0094\u0001\u0010ER\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0011\u0010\u008b\u0001\u001a\u0005\b\u0095\u0001\u0010ER\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0012\u0010\u008b\u0001\u001a\u0005\b\u0096\u0001\u0010ER\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0013\u0010\u008b\u0001\u001a\u0005\b\u0097\u0001\u0010ER\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0014\u0010\u008b\u0001\u001a\u0005\b\u0098\u0001\u0010ER\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0015\u0010\u008b\u0001\u001a\u0005\b\u0099\u0001\u0010ER\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0016\u0010\u008b\u0001\u001a\u0005\b\u009a\u0001\u0010ER\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0017\u0010\u008b\u0001\u001a\u0005\b\u009b\u0001\u0010ER\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0018\u0010\u008b\u0001\u001a\u0005\b\u009c\u0001\u0010ER\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0019\u0010\u008b\u0001\u001a\u0005\b\u009d\u0001\u0010ER\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001a\u0010\u008b\u0001\u001a\u0005\b\u009e\u0001\u0010ER\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001b\u0010\u008b\u0001\u001a\u0005\b\u009f\u0001\u0010ER\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001c\u0010\u008b\u0001\u001a\u0005\b \u0001\u0010ER\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001d\u0010\u008b\u0001\u001a\u0005\b¡\u0001\u0010ER\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001e\u0010\u008b\u0001\u001a\u0005\b¢\u0001\u0010ER\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001f\u0010\u008b\u0001\u001a\u0005\b£\u0001\u0010ER\u001e\u0010 \u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b \u0010\u008b\u0001\u001a\u0005\b¤\u0001\u0010ER\u001e\u0010!\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b!\u0010\u008b\u0001\u001a\u0005\b¥\u0001\u0010ER\u001e\u0010\"\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\"\u0010\u008b\u0001\u001a\u0005\b¦\u0001\u0010ER\u001e\u0010#\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b#\u0010\u008b\u0001\u001a\u0005\b§\u0001\u0010ER\u001e\u0010$\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b$\u0010\u008b\u0001\u001a\u0005\b¨\u0001\u0010ER\u001e\u0010%\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b%\u0010\u008b\u0001\u001a\u0005\b©\u0001\u0010ER\u001e\u0010&\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b&\u0010\u008b\u0001\u001a\u0005\bª\u0001\u0010ER\u001e\u0010'\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b'\u0010\u008b\u0001\u001a\u0005\b«\u0001\u0010ER\u001e\u0010(\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b(\u0010\u008b\u0001\u001a\u0005\b¬\u0001\u0010ER\u001e\u0010)\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b)\u0010\u008b\u0001\u001a\u0005\b\u00ad\u0001\u0010ER\u001e\u0010*\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b*\u0010\u008b\u0001\u001a\u0005\b®\u0001\u0010ER\u001e\u0010+\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b+\u0010\u008b\u0001\u001a\u0005\b¯\u0001\u0010ER\u001e\u0010,\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b,\u0010\u008b\u0001\u001a\u0005\b°\u0001\u0010ER\u001e\u0010-\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b-\u0010\u008b\u0001\u001a\u0005\b±\u0001\u0010ER\u001e\u0010.\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b.\u0010\u008b\u0001\u001a\u0005\b²\u0001\u0010ER\u001e\u0010/\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b/\u0010\u008b\u0001\u001a\u0005\b³\u0001\u0010ER\u001e\u00100\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b0\u0010\u008b\u0001\u001a\u0005\b´\u0001\u0010ER\u001e\u00101\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b1\u0010\u008b\u0001\u001a\u0005\bµ\u0001\u0010ER\u001e\u00102\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b2\u0010\u0086\u0001\u001a\u0005\b¶\u0001\u0010@R\u001c\u00104\u001a\u0002038\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b4\u0010·\u0001\u001a\u0005\b¸\u0001\u0010qR\u001c\u00106\u001a\u0002058\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b6\u0010¹\u0001\u001a\u0005\bº\u0001\u0010sR\u001c\u00107\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b7\u0010\u0086\u0001\u001a\u0005\b»\u0001\u0010@¨\u0006¾\u0001"}, m65681d2 = {"Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;", "", "", "startTime", "startZoneOffset", "endTime", "endZoneOffset", "", "biotin", "caffeine", "calcium", "energy", "energyFromFat", "chloride", "cholesterol", "chromium", "copper", "dietaryFiber", "folate", "folicAcid", "iodine", "iron", "magnesium", "manganese", "molybdenum", "monounsaturatedFat", "niacin", "pantothenicAcid", "phosphorus", "polyunsaturatedFat", "potassium", "protein", "riboflavin", "saturatedFat", "selenium", "sodium", "sugar", "thiamin", "totalCarbohydrate", "totalFat", "transFat", "unsaturatedFat", "vitaminA", "vitaminB12", "vitaminB6", "vitaminC", "vitaminD", "vitaminE", "vitaminK", "zinc", "name", "", "mealType", "Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;", "metadata", "deviceZoneId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;ILcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;)V", "seen0", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;ILcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/lang/Double;", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "()I", "component49", "()Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;", "component50", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;ILcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;)Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$health_connect_release", "(Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getStartTime", "getStartZoneOffset", "getEndTime", "getEndZoneOffset", "Ljava/lang/Double;", "getBiotin", "getCaffeine", "getCalcium", "getEnergy", "getEnergyFromFat", "getChloride", "getCholesterol", "getChromium", "getCopper", "getDietaryFiber", "getFolate", "getFolicAcid", "getIodine", "getIron", "getMagnesium", "getManganese", "getMolybdenum", "getMonounsaturatedFat", "getNiacin", "getPantothenicAcid", "getPhosphorus", "getPolyunsaturatedFat", "getPotassium", "getProtein", "getRiboflavin", "getSaturatedFat", "getSelenium", "getSodium", "getSugar", "getThiamin", "getTotalCarbohydrate", "getTotalFat", "getTransFat", "getUnsaturatedFat", "getVitaminA", "getVitaminB12", "getVitaminB6", "getVitaminC", "getVitaminD", "getVitaminE", "getVitaminK", "getZinc", "getName", "I", "getMealType", "Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;", "getMetadata", "getDeviceZoneId", "Companion", "$serializer", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HealthConnectNutritionModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("biotin_milligrams")
    private final Double biotin;

    @SerializedName("caffeine_milligrams")
    private final Double caffeine;

    @SerializedName("calcium_milligrams")
    private final Double calcium;

    @SerializedName("chloride_milligrams")
    private final Double chloride;

    @SerializedName("cholesterol_milligrams")
    private final Double cholesterol;

    @SerializedName("chromium_milligrams")
    private final Double chromium;

    @SerializedName("copper_milligrams")
    private final Double copper;

    @SerializedName("device_zone_id")
    private final String deviceZoneId;

    @SerializedName("dietary_fiber_milligrams")
    private final Double dietaryFiber;

    @SerializedName("end_time")
    private final String endTime;

    @SerializedName("end_zone_offset")
    private final String endZoneOffset;

    @SerializedName("energy_kilojoules")
    private final Double energy;

    @SerializedName("energy_from_fat_kilojoules")
    private final Double energyFromFat;

    @SerializedName("folate_milligrams")
    private final Double folate;

    @SerializedName("folic_acid_milligrams")
    private final Double folicAcid;

    @SerializedName("iodine_milligrams")
    private final Double iodine;

    @SerializedName("iron_milligrams")
    private final Double iron;

    @SerializedName("magnesium_milligrams")
    private final Double magnesium;

    @SerializedName("manganese_milligrams")
    private final Double manganese;

    @SerializedName("meal_type")
    private final int mealType;

    @SerializedName("metadata")
    private final HealthConnectMetadataModel metadata;

    @SerializedName("molybdenum_milligrams")
    private final Double molybdenum;

    @SerializedName("monounsaturated_fat_milligrams")
    private final Double monounsaturatedFat;

    @SerializedName("name")
    private final String name;

    @SerializedName("niacin_milligrams")
    private final Double niacin;

    @SerializedName("pantothenic_acid_milligrams")
    private final Double pantothenicAcid;

    @SerializedName("phosphorus_milligrams")
    private final Double phosphorus;

    @SerializedName("polyunsaturated_fat_milligrams")
    private final Double polyunsaturatedFat;

    @SerializedName("potassium_milligrams")
    private final Double potassium;

    @SerializedName("protein_milligrams")
    private final Double protein;

    @SerializedName("riboflavin_milligrams")
    private final Double riboflavin;

    @SerializedName("saturated_fat_milligrams")
    private final Double saturatedFat;

    @SerializedName("selenium_milligrams")
    private final Double selenium;

    @SerializedName("sodium_milligrams")
    private final Double sodium;

    @SerializedName("start_time")
    private final String startTime;

    @SerializedName("start_zone_offset")
    private final String startZoneOffset;

    @SerializedName("sugar_milligrams")
    private final Double sugar;

    @SerializedName("thiamin_milligrams")
    private final Double thiamin;

    @SerializedName("total_carbohydrate_milligrams")
    private final Double totalCarbohydrate;

    @SerializedName("total_fat_milligrams")
    private final Double totalFat;

    @SerializedName("trans_fat_milligrams")
    private final Double transFat;

    @SerializedName("unsaturated_fat_milligrams")
    private final Double unsaturatedFat;

    @SerializedName("vitamin_a_milligrams")
    private final Double vitaminA;

    @SerializedName("vitamin_b12_milligrams")
    private final Double vitaminB12;

    @SerializedName("vitamin_b6_milligrams")
    private final Double vitaminB6;

    @SerializedName("vitamin_c_milligrams")
    private final Double vitaminC;

    @SerializedName("vitamin_d_milligrams")
    private final Double vitaminD;

    @SerializedName("vitamin_e_milligrams")
    private final Double vitaminE;

    @SerializedName("vitamin_k_milligrams")
    private final Double vitaminK;

    @SerializedName("zinc_milligrams")
    private final Double zinc;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;", "serializer", "()Lwc3/c;", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HealthConnectNutritionModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HealthConnectNutritionModel(int i13, int i14, String str, String str2, String str3, String str4, Double d3, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, Double d27, Double d28, Double d29, Double d32, Double d34, Double d35, Double d36, Double d37, Double d38, Double d39, Double d44, Double d45, Double d46, Double d47, Double d48, Double d49, Double d54, Double d55, Double d56, Double d57, Double d58, Double d59, Double d64, Double d65, Double d66, Double d67, Double d68, Double d69, Double d74, Double d75, Double d76, Double d77, String str5, int i15, HealthConnectMetadataModel healthConnectMetadataModel, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((262143 != (i14 & 262143)) | (-1 != i13)) {
            PluginExceptionsKt.throwArrayMissingFieldException(new int[]{i13, i14}, new int[]{-1, 262143}, HealthConnectNutritionModel$$serializer.INSTANCE.getDescriptor());
        }
        this.startTime = str;
        this.startZoneOffset = str2;
        this.endTime = str3;
        this.endZoneOffset = str4;
        this.biotin = d3;
        this.caffeine = d14;
        this.calcium = d15;
        this.energy = d16;
        this.energyFromFat = d17;
        this.chloride = d18;
        this.cholesterol = d19;
        this.chromium = d24;
        this.copper = d25;
        this.dietaryFiber = d26;
        this.folate = d27;
        this.folicAcid = d28;
        this.iodine = d29;
        this.iron = d32;
        this.magnesium = d34;
        this.manganese = d35;
        this.molybdenum = d36;
        this.monounsaturatedFat = d37;
        this.niacin = d38;
        this.pantothenicAcid = d39;
        this.phosphorus = d44;
        this.polyunsaturatedFat = d45;
        this.potassium = d46;
        this.protein = d47;
        this.riboflavin = d48;
        this.saturatedFat = d49;
        this.selenium = d54;
        this.sodium = d55;
        this.sugar = d56;
        this.thiamin = d57;
        this.totalCarbohydrate = d58;
        this.totalFat = d59;
        this.transFat = d64;
        this.unsaturatedFat = d65;
        this.vitaminA = d66;
        this.vitaminB12 = d67;
        this.vitaminB6 = d68;
        this.vitaminC = d69;
        this.vitaminD = d74;
        this.vitaminE = d75;
        this.vitaminK = d76;
        this.zinc = d77;
        this.name = str5;
        this.mealType = i15;
        this.metadata = healthConnectMetadataModel;
        this.deviceZoneId = str6;
    }

    public static final /* synthetic */ void write$Self$health_connect_release(HealthConnectNutritionModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.startTime);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.startZoneOffset);
        output.encodeStringElement(serialDesc, 2, self.endTime);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.endZoneOffset);
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 4, doubleSerializer, self.biotin);
        output.encodeNullableSerializableElement(serialDesc, 5, doubleSerializer, self.caffeine);
        output.encodeNullableSerializableElement(serialDesc, 6, doubleSerializer, self.calcium);
        output.encodeNullableSerializableElement(serialDesc, 7, doubleSerializer, self.energy);
        output.encodeNullableSerializableElement(serialDesc, 8, doubleSerializer, self.energyFromFat);
        output.encodeNullableSerializableElement(serialDesc, 9, doubleSerializer, self.chloride);
        output.encodeNullableSerializableElement(serialDesc, 10, doubleSerializer, self.cholesterol);
        output.encodeNullableSerializableElement(serialDesc, 11, doubleSerializer, self.chromium);
        output.encodeNullableSerializableElement(serialDesc, 12, doubleSerializer, self.copper);
        output.encodeNullableSerializableElement(serialDesc, 13, doubleSerializer, self.dietaryFiber);
        output.encodeNullableSerializableElement(serialDesc, 14, doubleSerializer, self.folate);
        output.encodeNullableSerializableElement(serialDesc, 15, doubleSerializer, self.folicAcid);
        output.encodeNullableSerializableElement(serialDesc, 16, doubleSerializer, self.iodine);
        output.encodeNullableSerializableElement(serialDesc, 17, doubleSerializer, self.iron);
        output.encodeNullableSerializableElement(serialDesc, 18, doubleSerializer, self.magnesium);
        output.encodeNullableSerializableElement(serialDesc, 19, doubleSerializer, self.manganese);
        output.encodeNullableSerializableElement(serialDesc, 20, doubleSerializer, self.molybdenum);
        output.encodeNullableSerializableElement(serialDesc, 21, doubleSerializer, self.monounsaturatedFat);
        output.encodeNullableSerializableElement(serialDesc, 22, doubleSerializer, self.niacin);
        output.encodeNullableSerializableElement(serialDesc, 23, doubleSerializer, self.pantothenicAcid);
        output.encodeNullableSerializableElement(serialDesc, 24, doubleSerializer, self.phosphorus);
        output.encodeNullableSerializableElement(serialDesc, 25, doubleSerializer, self.polyunsaturatedFat);
        output.encodeNullableSerializableElement(serialDesc, 26, doubleSerializer, self.potassium);
        output.encodeNullableSerializableElement(serialDesc, 27, doubleSerializer, self.protein);
        output.encodeNullableSerializableElement(serialDesc, 28, doubleSerializer, self.riboflavin);
        output.encodeNullableSerializableElement(serialDesc, 29, doubleSerializer, self.saturatedFat);
        output.encodeNullableSerializableElement(serialDesc, 30, doubleSerializer, self.selenium);
        output.encodeNullableSerializableElement(serialDesc, 31, doubleSerializer, self.sodium);
        output.encodeNullableSerializableElement(serialDesc, 32, doubleSerializer, self.sugar);
        output.encodeNullableSerializableElement(serialDesc, 33, doubleSerializer, self.thiamin);
        output.encodeNullableSerializableElement(serialDesc, 34, doubleSerializer, self.totalCarbohydrate);
        output.encodeNullableSerializableElement(serialDesc, 35, doubleSerializer, self.totalFat);
        output.encodeNullableSerializableElement(serialDesc, 36, doubleSerializer, self.transFat);
        output.encodeNullableSerializableElement(serialDesc, 37, doubleSerializer, self.unsaturatedFat);
        output.encodeNullableSerializableElement(serialDesc, 38, doubleSerializer, self.vitaminA);
        output.encodeNullableSerializableElement(serialDesc, 39, doubleSerializer, self.vitaminB12);
        output.encodeNullableSerializableElement(serialDesc, 40, doubleSerializer, self.vitaminB6);
        output.encodeNullableSerializableElement(serialDesc, 41, doubleSerializer, self.vitaminC);
        output.encodeNullableSerializableElement(serialDesc, 42, doubleSerializer, self.vitaminD);
        output.encodeNullableSerializableElement(serialDesc, 43, doubleSerializer, self.vitaminE);
        output.encodeNullableSerializableElement(serialDesc, 44, doubleSerializer, self.vitaminK);
        output.encodeNullableSerializableElement(serialDesc, 45, doubleSerializer, self.zinc);
        output.encodeNullableSerializableElement(serialDesc, 46, stringSerializer, self.name);
        output.encodeIntElement(serialDesc, 47, self.mealType);
        output.encodeSerializableElement(serialDesc, 48, HealthConnectMetadataModel$$serializer.INSTANCE, self.metadata);
        output.encodeStringElement(serialDesc, 49, self.deviceZoneId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Double getChloride() {
        return this.chloride;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Double getCholesterol() {
        return this.cholesterol;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Double getChromium() {
        return this.chromium;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Double getCopper() {
        return this.copper;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Double getDietaryFiber() {
        return this.dietaryFiber;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Double getFolate() {
        return this.folate;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Double getFolicAcid() {
        return this.folicAcid;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Double getIodine() {
        return this.iodine;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Double getIron() {
        return this.iron;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Double getMagnesium() {
        return this.magnesium;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStartZoneOffset() {
        return this.startZoneOffset;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Double getManganese() {
        return this.manganese;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Double getMolybdenum() {
        return this.molybdenum;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Double getMonounsaturatedFat() {
        return this.monounsaturatedFat;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Double getNiacin() {
        return this.niacin;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Double getPantothenicAcid() {
        return this.pantothenicAcid;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Double getPhosphorus() {
        return this.phosphorus;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Double getPolyunsaturatedFat() {
        return this.polyunsaturatedFat;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Double getPotassium() {
        return this.potassium;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Double getProtein() {
        return this.protein;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final Double getRiboflavin() {
        return this.riboflavin;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Double getSaturatedFat() {
        return this.saturatedFat;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final Double getSelenium() {
        return this.selenium;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final Double getSodium() {
        return this.sodium;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final Double getSugar() {
        return this.sugar;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final Double getThiamin() {
        return this.thiamin;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final Double getTotalCarbohydrate() {
        return this.totalCarbohydrate;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final Double getTotalFat() {
        return this.totalFat;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final Double getTransFat() {
        return this.transFat;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final Double getUnsaturatedFat() {
        return this.unsaturatedFat;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final Double getVitaminA() {
        return this.vitaminA;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEndZoneOffset() {
        return this.endZoneOffset;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final Double getVitaminB12() {
        return this.vitaminB12;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final Double getVitaminB6() {
        return this.vitaminB6;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final Double getVitaminC() {
        return this.vitaminC;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final Double getVitaminD() {
        return this.vitaminD;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final Double getVitaminE() {
        return this.vitaminE;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final Double getVitaminK() {
        return this.vitaminK;
    }

    /* JADX INFO: renamed from: component46, reason: from getter */
    public final Double getZinc() {
        return this.zinc;
    }

    /* JADX INFO: renamed from: component47, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component48, reason: from getter */
    public final int getMealType() {
        return this.mealType;
    }

    /* JADX INFO: renamed from: component49, reason: from getter */
    public final HealthConnectMetadataModel getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getBiotin() {
        return this.biotin;
    }

    /* JADX INFO: renamed from: component50, reason: from getter */
    public final String getDeviceZoneId() {
        return this.deviceZoneId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getCaffeine() {
        return this.caffeine;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getCalcium() {
        return this.calcium;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Double getEnergy() {
        return this.energy;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Double getEnergyFromFat() {
        return this.energyFromFat;
    }

    public final HealthConnectNutritionModel copy(String startTime, String startZoneOffset, String endTime, String endZoneOffset, Double biotin, Double caffeine, Double calcium, Double energy, Double energyFromFat, Double chloride, Double cholesterol, Double chromium, Double copper, Double dietaryFiber, Double folate, Double folicAcid, Double iodine, Double iron, Double magnesium, Double manganese, Double molybdenum, Double monounsaturatedFat, Double niacin, Double pantothenicAcid, Double phosphorus, Double polyunsaturatedFat, Double potassium, Double protein, Double riboflavin, Double saturatedFat, Double selenium, Double sodium, Double sugar, Double thiamin, Double totalCarbohydrate, Double totalFat, Double transFat, Double unsaturatedFat, Double vitaminA, Double vitaminB12, Double vitaminB6, Double vitaminC, Double vitaminD, Double vitaminE, Double vitaminK, Double zinc, String name, int mealType, HealthConnectMetadataModel metadata, String deviceZoneId) {
        AbstractC22676k.m65750j(startTime, "startTime");
        AbstractC22676k.m65750j(endTime, "endTime");
        AbstractC22676k.m65750j(metadata, "metadata");
        AbstractC22676k.m65750j(deviceZoneId, "deviceZoneId");
        return new HealthConnectNutritionModel(startTime, startZoneOffset, endTime, endZoneOffset, biotin, caffeine, calcium, energy, energyFromFat, chloride, cholesterol, chromium, copper, dietaryFiber, folate, folicAcid, iodine, iron, magnesium, manganese, molybdenum, monounsaturatedFat, niacin, pantothenicAcid, phosphorus, polyunsaturatedFat, potassium, protein, riboflavin, saturatedFat, selenium, sodium, sugar, thiamin, totalCarbohydrate, totalFat, transFat, unsaturatedFat, vitaminA, vitaminB12, vitaminB6, vitaminC, vitaminD, vitaminE, vitaminK, zinc, name, mealType, metadata, deviceZoneId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthConnectNutritionModel)) {
            return false;
        }
        HealthConnectNutritionModel healthConnectNutritionModel = (HealthConnectNutritionModel) other;
        return AbstractC22676k.m65745e(this.startTime, healthConnectNutritionModel.startTime) && AbstractC22676k.m65745e(this.startZoneOffset, healthConnectNutritionModel.startZoneOffset) && AbstractC22676k.m65745e(this.endTime, healthConnectNutritionModel.endTime) && AbstractC22676k.m65745e(this.endZoneOffset, healthConnectNutritionModel.endZoneOffset) && AbstractC22676k.m65745e(this.biotin, healthConnectNutritionModel.biotin) && AbstractC22676k.m65745e(this.caffeine, healthConnectNutritionModel.caffeine) && AbstractC22676k.m65745e(this.calcium, healthConnectNutritionModel.calcium) && AbstractC22676k.m65745e(this.energy, healthConnectNutritionModel.energy) && AbstractC22676k.m65745e(this.energyFromFat, healthConnectNutritionModel.energyFromFat) && AbstractC22676k.m65745e(this.chloride, healthConnectNutritionModel.chloride) && AbstractC22676k.m65745e(this.cholesterol, healthConnectNutritionModel.cholesterol) && AbstractC22676k.m65745e(this.chromium, healthConnectNutritionModel.chromium) && AbstractC22676k.m65745e(this.copper, healthConnectNutritionModel.copper) && AbstractC22676k.m65745e(this.dietaryFiber, healthConnectNutritionModel.dietaryFiber) && AbstractC22676k.m65745e(this.folate, healthConnectNutritionModel.folate) && AbstractC22676k.m65745e(this.folicAcid, healthConnectNutritionModel.folicAcid) && AbstractC22676k.m65745e(this.iodine, healthConnectNutritionModel.iodine) && AbstractC22676k.m65745e(this.iron, healthConnectNutritionModel.iron) && AbstractC22676k.m65745e(this.magnesium, healthConnectNutritionModel.magnesium) && AbstractC22676k.m65745e(this.manganese, healthConnectNutritionModel.manganese) && AbstractC22676k.m65745e(this.molybdenum, healthConnectNutritionModel.molybdenum) && AbstractC22676k.m65745e(this.monounsaturatedFat, healthConnectNutritionModel.monounsaturatedFat) && AbstractC22676k.m65745e(this.niacin, healthConnectNutritionModel.niacin) && AbstractC22676k.m65745e(this.pantothenicAcid, healthConnectNutritionModel.pantothenicAcid) && AbstractC22676k.m65745e(this.phosphorus, healthConnectNutritionModel.phosphorus) && AbstractC22676k.m65745e(this.polyunsaturatedFat, healthConnectNutritionModel.polyunsaturatedFat) && AbstractC22676k.m65745e(this.potassium, healthConnectNutritionModel.potassium) && AbstractC22676k.m65745e(this.protein, healthConnectNutritionModel.protein) && AbstractC22676k.m65745e(this.riboflavin, healthConnectNutritionModel.riboflavin) && AbstractC22676k.m65745e(this.saturatedFat, healthConnectNutritionModel.saturatedFat) && AbstractC22676k.m65745e(this.selenium, healthConnectNutritionModel.selenium) && AbstractC22676k.m65745e(this.sodium, healthConnectNutritionModel.sodium) && AbstractC22676k.m65745e(this.sugar, healthConnectNutritionModel.sugar) && AbstractC22676k.m65745e(this.thiamin, healthConnectNutritionModel.thiamin) && AbstractC22676k.m65745e(this.totalCarbohydrate, healthConnectNutritionModel.totalCarbohydrate) && AbstractC22676k.m65745e(this.totalFat, healthConnectNutritionModel.totalFat) && AbstractC22676k.m65745e(this.transFat, healthConnectNutritionModel.transFat) && AbstractC22676k.m65745e(this.unsaturatedFat, healthConnectNutritionModel.unsaturatedFat) && AbstractC22676k.m65745e(this.vitaminA, healthConnectNutritionModel.vitaminA) && AbstractC22676k.m65745e(this.vitaminB12, healthConnectNutritionModel.vitaminB12) && AbstractC22676k.m65745e(this.vitaminB6, healthConnectNutritionModel.vitaminB6) && AbstractC22676k.m65745e(this.vitaminC, healthConnectNutritionModel.vitaminC) && AbstractC22676k.m65745e(this.vitaminD, healthConnectNutritionModel.vitaminD) && AbstractC22676k.m65745e(this.vitaminE, healthConnectNutritionModel.vitaminE) && AbstractC22676k.m65745e(this.vitaminK, healthConnectNutritionModel.vitaminK) && AbstractC22676k.m65745e(this.zinc, healthConnectNutritionModel.zinc) && AbstractC22676k.m65745e(this.name, healthConnectNutritionModel.name) && this.mealType == healthConnectNutritionModel.mealType && AbstractC22676k.m65745e(this.metadata, healthConnectNutritionModel.metadata) && AbstractC22676k.m65745e(this.deviceZoneId, healthConnectNutritionModel.deviceZoneId);
    }

    public final Double getBiotin() {
        return this.biotin;
    }

    public final Double getCaffeine() {
        return this.caffeine;
    }

    public final Double getCalcium() {
        return this.calcium;
    }

    public final Double getChloride() {
        return this.chloride;
    }

    public final Double getCholesterol() {
        return this.cholesterol;
    }

    public final Double getChromium() {
        return this.chromium;
    }

    public final Double getCopper() {
        return this.copper;
    }

    public final String getDeviceZoneId() {
        return this.deviceZoneId;
    }

    public final Double getDietaryFiber() {
        return this.dietaryFiber;
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final String getEndZoneOffset() {
        return this.endZoneOffset;
    }

    public final Double getEnergy() {
        return this.energy;
    }

    public final Double getEnergyFromFat() {
        return this.energyFromFat;
    }

    public final Double getFolate() {
        return this.folate;
    }

    public final Double getFolicAcid() {
        return this.folicAcid;
    }

    public final Double getIodine() {
        return this.iodine;
    }

    public final Double getIron() {
        return this.iron;
    }

    public final Double getMagnesium() {
        return this.magnesium;
    }

    public final Double getManganese() {
        return this.manganese;
    }

    public final int getMealType() {
        return this.mealType;
    }

    public final HealthConnectMetadataModel getMetadata() {
        return this.metadata;
    }

    public final Double getMolybdenum() {
        return this.molybdenum;
    }

    public final Double getMonounsaturatedFat() {
        return this.monounsaturatedFat;
    }

    public final String getName() {
        return this.name;
    }

    public final Double getNiacin() {
        return this.niacin;
    }

    public final Double getPantothenicAcid() {
        return this.pantothenicAcid;
    }

    public final Double getPhosphorus() {
        return this.phosphorus;
    }

    public final Double getPolyunsaturatedFat() {
        return this.polyunsaturatedFat;
    }

    public final Double getPotassium() {
        return this.potassium;
    }

    public final Double getProtein() {
        return this.protein;
    }

    public final Double getRiboflavin() {
        return this.riboflavin;
    }

    public final Double getSaturatedFat() {
        return this.saturatedFat;
    }

    public final Double getSelenium() {
        return this.selenium;
    }

    public final Double getSodium() {
        return this.sodium;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final String getStartZoneOffset() {
        return this.startZoneOffset;
    }

    public final Double getSugar() {
        return this.sugar;
    }

    public final Double getThiamin() {
        return this.thiamin;
    }

    public final Double getTotalCarbohydrate() {
        return this.totalCarbohydrate;
    }

    public final Double getTotalFat() {
        return this.totalFat;
    }

    public final Double getTransFat() {
        return this.transFat;
    }

    public final Double getUnsaturatedFat() {
        return this.unsaturatedFat;
    }

    public final Double getVitaminA() {
        return this.vitaminA;
    }

    public final Double getVitaminB12() {
        return this.vitaminB12;
    }

    public final Double getVitaminB6() {
        return this.vitaminB6;
    }

    public final Double getVitaminC() {
        return this.vitaminC;
    }

    public final Double getVitaminD() {
        return this.vitaminD;
    }

    public final Double getVitaminE() {
        return this.vitaminE;
    }

    public final Double getVitaminK() {
        return this.vitaminK;
    }

    public final Double getZinc() {
        return this.zinc;
    }

    public int hashCode() {
        int iHashCode = this.startTime.hashCode() * 31;
        String str = this.startZoneOffset;
        int iM30450d = AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.endTime);
        String str2 = this.endZoneOffset;
        int iHashCode2 = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d3 = this.biotin;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d14 = this.caffeine;
        int iHashCode4 = (iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.calcium;
        int iHashCode5 = (iHashCode4 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.energy;
        int iHashCode6 = (iHashCode5 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.energyFromFat;
        int iHashCode7 = (iHashCode6 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.chloride;
        int iHashCode8 = (iHashCode7 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.cholesterol;
        int iHashCode9 = (iHashCode8 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Double d24 = this.chromium;
        int iHashCode10 = (iHashCode9 + (d24 == null ? 0 : d24.hashCode())) * 31;
        Double d25 = this.copper;
        int iHashCode11 = (iHashCode10 + (d25 == null ? 0 : d25.hashCode())) * 31;
        Double d26 = this.dietaryFiber;
        int iHashCode12 = (iHashCode11 + (d26 == null ? 0 : d26.hashCode())) * 31;
        Double d27 = this.folate;
        int iHashCode13 = (iHashCode12 + (d27 == null ? 0 : d27.hashCode())) * 31;
        Double d28 = this.folicAcid;
        int iHashCode14 = (iHashCode13 + (d28 == null ? 0 : d28.hashCode())) * 31;
        Double d29 = this.iodine;
        int iHashCode15 = (iHashCode14 + (d29 == null ? 0 : d29.hashCode())) * 31;
        Double d32 = this.iron;
        int iHashCode16 = (iHashCode15 + (d32 == null ? 0 : d32.hashCode())) * 31;
        Double d34 = this.magnesium;
        int iHashCode17 = (iHashCode16 + (d34 == null ? 0 : d34.hashCode())) * 31;
        Double d35 = this.manganese;
        int iHashCode18 = (iHashCode17 + (d35 == null ? 0 : d35.hashCode())) * 31;
        Double d36 = this.molybdenum;
        int iHashCode19 = (iHashCode18 + (d36 == null ? 0 : d36.hashCode())) * 31;
        Double d37 = this.monounsaturatedFat;
        int iHashCode20 = (iHashCode19 + (d37 == null ? 0 : d37.hashCode())) * 31;
        Double d38 = this.niacin;
        int iHashCode21 = (iHashCode20 + (d38 == null ? 0 : d38.hashCode())) * 31;
        Double d39 = this.pantothenicAcid;
        int iHashCode22 = (iHashCode21 + (d39 == null ? 0 : d39.hashCode())) * 31;
        Double d44 = this.phosphorus;
        int iHashCode23 = (iHashCode22 + (d44 == null ? 0 : d44.hashCode())) * 31;
        Double d45 = this.polyunsaturatedFat;
        int iHashCode24 = (iHashCode23 + (d45 == null ? 0 : d45.hashCode())) * 31;
        Double d46 = this.potassium;
        int iHashCode25 = (iHashCode24 + (d46 == null ? 0 : d46.hashCode())) * 31;
        Double d47 = this.protein;
        int iHashCode26 = (iHashCode25 + (d47 == null ? 0 : d47.hashCode())) * 31;
        Double d48 = this.riboflavin;
        int iHashCode27 = (iHashCode26 + (d48 == null ? 0 : d48.hashCode())) * 31;
        Double d49 = this.saturatedFat;
        int iHashCode28 = (iHashCode27 + (d49 == null ? 0 : d49.hashCode())) * 31;
        Double d54 = this.selenium;
        int iHashCode29 = (iHashCode28 + (d54 == null ? 0 : d54.hashCode())) * 31;
        Double d55 = this.sodium;
        int iHashCode30 = (iHashCode29 + (d55 == null ? 0 : d55.hashCode())) * 31;
        Double d56 = this.sugar;
        int iHashCode31 = (iHashCode30 + (d56 == null ? 0 : d56.hashCode())) * 31;
        Double d57 = this.thiamin;
        int iHashCode32 = (iHashCode31 + (d57 == null ? 0 : d57.hashCode())) * 31;
        Double d58 = this.totalCarbohydrate;
        int iHashCode33 = (iHashCode32 + (d58 == null ? 0 : d58.hashCode())) * 31;
        Double d59 = this.totalFat;
        int iHashCode34 = (iHashCode33 + (d59 == null ? 0 : d59.hashCode())) * 31;
        Double d64 = this.transFat;
        int iHashCode35 = (iHashCode34 + (d64 == null ? 0 : d64.hashCode())) * 31;
        Double d65 = this.unsaturatedFat;
        int iHashCode36 = (iHashCode35 + (d65 == null ? 0 : d65.hashCode())) * 31;
        Double d66 = this.vitaminA;
        int iHashCode37 = (iHashCode36 + (d66 == null ? 0 : d66.hashCode())) * 31;
        Double d67 = this.vitaminB12;
        int iHashCode38 = (iHashCode37 + (d67 == null ? 0 : d67.hashCode())) * 31;
        Double d68 = this.vitaminB6;
        int iHashCode39 = (iHashCode38 + (d68 == null ? 0 : d68.hashCode())) * 31;
        Double d69 = this.vitaminC;
        int iHashCode40 = (iHashCode39 + (d69 == null ? 0 : d69.hashCode())) * 31;
        Double d74 = this.vitaminD;
        int iHashCode41 = (iHashCode40 + (d74 == null ? 0 : d74.hashCode())) * 31;
        Double d75 = this.vitaminE;
        int iHashCode42 = (iHashCode41 + (d75 == null ? 0 : d75.hashCode())) * 31;
        Double d76 = this.vitaminK;
        int iHashCode43 = (iHashCode42 + (d76 == null ? 0 : d76.hashCode())) * 31;
        Double d77 = this.zinc;
        int iHashCode44 = (iHashCode43 + (d77 == null ? 0 : d77.hashCode())) * 31;
        String str3 = this.name;
        return this.deviceZoneId.hashCode() + ((this.metadata.hashCode() + AbstractC11266d.m30448b(this.mealType, (iHashCode44 + (str3 != null ? str3.hashCode() : 0)) * 31, 31)) * 31);
    }

    public String toString() {
        String str = this.startTime;
        String str2 = this.startZoneOffset;
        String str3 = this.endTime;
        String str4 = this.endZoneOffset;
        Double d3 = this.biotin;
        Double d14 = this.caffeine;
        Double d15 = this.calcium;
        Double d16 = this.energy;
        Double d17 = this.energyFromFat;
        Double d18 = this.chloride;
        Double d19 = this.cholesterol;
        Double d24 = this.chromium;
        Double d25 = this.copper;
        Double d26 = this.dietaryFiber;
        Double d27 = this.folate;
        Double d28 = this.folicAcid;
        Double d29 = this.iodine;
        Double d32 = this.iron;
        Double d34 = this.magnesium;
        Double d35 = this.manganese;
        Double d36 = this.molybdenum;
        Double d37 = this.monounsaturatedFat;
        Double d38 = this.niacin;
        Double d39 = this.pantothenicAcid;
        Double d44 = this.phosphorus;
        Double d45 = this.polyunsaturatedFat;
        Double d46 = this.potassium;
        Double d47 = this.protein;
        Double d48 = this.riboflavin;
        Double d49 = this.saturatedFat;
        Double d54 = this.selenium;
        Double d55 = this.sodium;
        Double d56 = this.sugar;
        Double d57 = this.thiamin;
        Double d58 = this.totalCarbohydrate;
        Double d59 = this.totalFat;
        Double d64 = this.transFat;
        Double d65 = this.unsaturatedFat;
        Double d66 = this.vitaminA;
        Double d67 = this.vitaminB12;
        Double d68 = this.vitaminB6;
        Double d69 = this.vitaminC;
        Double d74 = this.vitaminD;
        Double d75 = this.vitaminE;
        Double d76 = this.vitaminK;
        Double d77 = this.zinc;
        String str5 = this.name;
        int i13 = this.mealType;
        HealthConnectMetadataModel healthConnectMetadataModel = this.metadata;
        String str6 = this.deviceZoneId;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HealthConnectNutritionModel(startTime=", str, ", startZoneOffset=", str2, ", endTime=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", endZoneOffset=", str4, ", biotin=");
        AbstractC21702c.m61146q(sbM32001t, d3, ", caffeine=", d14, ", calcium=");
        AbstractC21702c.m61146q(sbM32001t, d15, ", energy=", d16, ", energyFromFat=");
        AbstractC21702c.m61146q(sbM32001t, d17, ", chloride=", d18, ", cholesterol=");
        AbstractC21702c.m61146q(sbM32001t, d19, ", chromium=", d24, ", copper=");
        AbstractC21702c.m61146q(sbM32001t, d25, ", dietaryFiber=", d26, ", folate=");
        AbstractC21702c.m61146q(sbM32001t, d27, ", folicAcid=", d28, ", iodine=");
        AbstractC21702c.m61146q(sbM32001t, d29, ", iron=", d32, ", magnesium=");
        AbstractC21702c.m61146q(sbM32001t, d34, ", manganese=", d35, ", molybdenum=");
        AbstractC21702c.m61146q(sbM32001t, d36, ", monounsaturatedFat=", d37, ", niacin=");
        AbstractC21702c.m61146q(sbM32001t, d38, ", pantothenicAcid=", d39, ", phosphorus=");
        AbstractC21702c.m61146q(sbM32001t, d44, ", polyunsaturatedFat=", d45, ", potassium=");
        AbstractC21702c.m61146q(sbM32001t, d46, ", protein=", d47, ", riboflavin=");
        AbstractC21702c.m61146q(sbM32001t, d48, ", saturatedFat=", d49, ", selenium=");
        AbstractC21702c.m61146q(sbM32001t, d54, ", sodium=", d55, ", sugar=");
        AbstractC21702c.m61146q(sbM32001t, d56, ", thiamin=", d57, ", totalCarbohydrate=");
        AbstractC21702c.m61146q(sbM32001t, d58, ", totalFat=", d59, ", transFat=");
        AbstractC21702c.m61146q(sbM32001t, d64, ", unsaturatedFat=", d65, ", vitaminA=");
        AbstractC21702c.m61146q(sbM32001t, d66, ", vitaminB12=", d67, ", vitaminB6=");
        AbstractC21702c.m61146q(sbM32001t, d68, ", vitaminC=", d69, ", vitaminD=");
        AbstractC21702c.m61146q(sbM32001t, d74, ", vitaminE=", d75, ", vitaminK=");
        AbstractC21702c.m61146q(sbM32001t, d76, ", zinc=", d77, ", name=");
        AbstractC11266d.m30470x(i13, str5, ", mealType=", ", metadata=", sbM32001t);
        sbM32001t.append(healthConnectMetadataModel);
        sbM32001t.append(", deviceZoneId=");
        sbM32001t.append(str6);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public HealthConnectNutritionModel(String startTime, String str, String endTime, String str2, Double d3, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, Double d27, Double d28, Double d29, Double d32, Double d34, Double d35, Double d36, Double d37, Double d38, Double d39, Double d44, Double d45, Double d46, Double d47, Double d48, Double d49, Double d54, Double d55, Double d56, Double d57, Double d58, Double d59, Double d64, Double d65, Double d66, Double d67, Double d68, Double d69, Double d74, Double d75, Double d76, Double d77, String str3, int i13, HealthConnectMetadataModel metadata, String deviceZoneId) {
        AbstractC22676k.m65750j(startTime, "startTime");
        AbstractC22676k.m65750j(endTime, "endTime");
        AbstractC22676k.m65750j(metadata, "metadata");
        AbstractC22676k.m65750j(deviceZoneId, "deviceZoneId");
        this.startTime = startTime;
        this.startZoneOffset = str;
        this.endTime = endTime;
        this.endZoneOffset = str2;
        this.biotin = d3;
        this.caffeine = d14;
        this.calcium = d15;
        this.energy = d16;
        this.energyFromFat = d17;
        this.chloride = d18;
        this.cholesterol = d19;
        this.chromium = d24;
        this.copper = d25;
        this.dietaryFiber = d26;
        this.folate = d27;
        this.folicAcid = d28;
        this.iodine = d29;
        this.iron = d32;
        this.magnesium = d34;
        this.manganese = d35;
        this.molybdenum = d36;
        this.monounsaturatedFat = d37;
        this.niacin = d38;
        this.pantothenicAcid = d39;
        this.phosphorus = d44;
        this.polyunsaturatedFat = d45;
        this.potassium = d46;
        this.protein = d47;
        this.riboflavin = d48;
        this.saturatedFat = d49;
        this.selenium = d54;
        this.sodium = d55;
        this.sugar = d56;
        this.thiamin = d57;
        this.totalCarbohydrate = d58;
        this.totalFat = d59;
        this.transFat = d64;
        this.unsaturatedFat = d65;
        this.vitaminA = d66;
        this.vitaminB12 = d67;
        this.vitaminB6 = d68;
        this.vitaminC = d69;
        this.vitaminD = d74;
        this.vitaminE = d75;
        this.vitaminK = d76;
        this.zinc = d77;
        this.name = str3;
        this.mealType = i13;
        this.metadata = metadata;
        this.deviceZoneId = deviceZoneId;
    }
}
