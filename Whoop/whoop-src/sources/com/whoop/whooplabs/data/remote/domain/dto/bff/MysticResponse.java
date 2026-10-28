package com.whoop.whooplabs.data.remote.domain.dto.bff;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b1\b\u0087\b\u0018\u0000 y2\u00020\u0001:\u0002zyBÇ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eBù\u0001\b\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u000b\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001d\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010$J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010$J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010$J\u0010\u0010,\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010$J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010$J\u0010\u00100\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b0\u0010'J\u0010\u00101\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b1\u0010'J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u0010$J\u0010\u00103\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b3\u0010$J\u0010\u00104\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b4\u0010$J\u0010\u00105\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b5\u0010-J\u0010\u00106\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b6\u0010$J\u0010\u00107\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b7\u0010$J\u0010\u00108\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b8\u0010'J\u0010\u00109\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b9\u0010'J\u0010\u0010:\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b:\u0010$J\u0010\u0010;\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b;\u0010$J\u0010\u0010<\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b<\u0010$J\u0010\u0010=\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b=\u0010-J\u0080\u0002\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b@\u0010$J\u0010\u0010A\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\bA\u0010'J\u001a\u0010C\u001a\u00020\u000b2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bC\u0010DJ'\u0010M\u001a\u00020J2\u0006\u0010E\u001a\u00020\u00002\u0006\u0010G\u001a\u00020F2\u0006\u0010I\u001a\u00020HH\u0001¢\u0006\u0004\bK\u0010LR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010N\u0012\u0004\bP\u0010Q\u001a\u0004\bO\u0010$R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010N\u0012\u0004\bS\u0010Q\u001a\u0004\bR\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010T\u001a\u0004\bU\u0010'R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010T\u001a\u0004\bV\u0010'R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010N\u0012\u0004\bX\u0010Q\u001a\u0004\bW\u0010$R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010N\u0012\u0004\bZ\u0010Q\u001a\u0004\bY\u0010$R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010N\u001a\u0004\b[\u0010$R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\\\u0012\u0004\b]\u0010Q\u001a\u0004\b\f\u0010-R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010N\u0012\u0004\b_\u0010Q\u001a\u0004\b^\u0010$R \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010N\u0012\u0004\ba\u0010Q\u001a\u0004\b`\u0010$R\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010T\u001a\u0004\bb\u0010'R\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010T\u001a\u0004\bc\u0010'R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010N\u0012\u0004\be\u0010Q\u001a\u0004\bd\u0010$R \u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010N\u0012\u0004\bg\u0010Q\u001a\u0004\bf\u0010$R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010N\u001a\u0004\bh\u0010$R \u0010\u0014\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\\\u0012\u0004\bi\u0010Q\u001a\u0004\b\u0014\u0010-R \u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010N\u0012\u0004\bk\u0010Q\u001a\u0004\bj\u0010$R \u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010N\u0012\u0004\bm\u0010Q\u001a\u0004\bl\u0010$R \u0010\u0017\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010T\u0012\u0004\bo\u0010Q\u001a\u0004\bn\u0010'R \u0010\u0018\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010T\u0012\u0004\bq\u0010Q\u001a\u0004\bp\u0010'R \u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010N\u0012\u0004\bs\u0010Q\u001a\u0004\br\u0010$R \u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010N\u0012\u0004\bu\u0010Q\u001a\u0004\bt\u0010$R \u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010N\u0012\u0004\bw\u0010Q\u001a\u0004\bv\u0010$R \u0010\u001c\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\\\u0012\u0004\bx\u0010Q\u001a\u0004\b\u001c\u0010-¨\u0006{"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;", "", "", "systolicLabel", "systolicSuffix", "", "systolicMax", "systolicMin", "systolicTooHighLabel", "systolicTooLowLabel", "systolicRequiredText", "", "isSystolicRequired", "diastolicLabel", "diastolicSuffix", "diastolicMax", "diastolicMin", "diastolicTooHighLabel", "diastolicTooLowLabel", "diastolicRequiredText", "isDiastolicRequired", "hrLabel", "hrSuffix", "hrMax", "hrMin", "hrTooHighLabel", "hrTooLowLabel", "hrRequiredText", "isHrRequired", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "component6", "component7", "component8", "()Z", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whooplabs_release", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getSystolicLabel", "getSystolicLabel$annotations", "()V", "getSystolicSuffix", "getSystolicSuffix$annotations", "I", "getSystolicMax", "getSystolicMin", "getSystolicTooHighLabel", "getSystolicTooHighLabel$annotations", "getSystolicTooLowLabel", "getSystolicTooLowLabel$annotations", "getSystolicRequiredText", "Z", "isSystolicRequired$annotations", "getDiastolicLabel", "getDiastolicLabel$annotations", "getDiastolicSuffix", "getDiastolicSuffix$annotations", "getDiastolicMax", "getDiastolicMin", "getDiastolicTooHighLabel", "getDiastolicTooHighLabel$annotations", "getDiastolicTooLowLabel", "getDiastolicTooLowLabel$annotations", "getDiastolicRequiredText", "isDiastolicRequired$annotations", "getHrLabel", "getHrLabel$annotations", "getHrSuffix", "getHrSuffix$annotations", "getHrMax", "getHrMax$annotations", "getHrMin", "getHrMin$annotations", "getHrTooHighLabel", "getHrTooHighLabel$annotations", "getHrTooLowLabel", "getHrTooLowLabel$annotations", "getHrRequiredText", "getHrRequiredText$annotations", "isHrRequired$annotations", "Companion", "$serializer", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MysticResponse {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String diastolicLabel;
    private final int diastolicMax;
    private final int diastolicMin;
    private final String diastolicRequiredText;
    private final String diastolicSuffix;
    private final String diastolicTooHighLabel;
    private final String diastolicTooLowLabel;
    private final String hrLabel;
    private final int hrMax;
    private final int hrMin;
    private final String hrRequiredText;
    private final String hrSuffix;
    private final String hrTooHighLabel;
    private final String hrTooLowLabel;
    private final boolean isDiastolicRequired;
    private final boolean isHrRequired;
    private final boolean isSystolicRequired;
    private final String systolicLabel;
    private final int systolicMax;
    private final int systolicMin;
    private final String systolicRequiredText;
    private final String systolicSuffix;
    private final String systolicTooHighLabel;
    private final String systolicTooLowLabel;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;", "serializer", "()Lwc3/c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MysticResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MysticResponse(int i13, String str, String str2, int i14, int i15, String str3, String str4, String str5, boolean z4, String str6, String str7, int i16, int i17, String str8, String str9, String str10, boolean z13, String str11, String str12, int i18, int i19, String str13, String str14, String str15, boolean z14, SerializationConstructorMarker serializationConstructorMarker) {
        if (16777215 != (i13 & 16777215)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 16777215, MysticResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.systolicLabel = str;
        this.systolicSuffix = str2;
        this.systolicMax = i14;
        this.systolicMin = i15;
        this.systolicTooHighLabel = str3;
        this.systolicTooLowLabel = str4;
        this.systolicRequiredText = str5;
        this.isSystolicRequired = z4;
        this.diastolicLabel = str6;
        this.diastolicSuffix = str7;
        this.diastolicMax = i16;
        this.diastolicMin = i17;
        this.diastolicTooHighLabel = str8;
        this.diastolicTooLowLabel = str9;
        this.diastolicRequiredText = str10;
        this.isDiastolicRequired = z13;
        this.hrLabel = str11;
        this.hrSuffix = str12;
        this.hrMax = i18;
        this.hrMin = i19;
        this.hrTooHighLabel = str13;
        this.hrTooLowLabel = str14;
        this.hrRequiredText = str15;
        this.isHrRequired = z14;
    }

    public static /* synthetic */ MysticResponse copy$default(MysticResponse mysticResponse, String str, String str2, int i13, int i14, String str3, String str4, String str5, boolean z4, String str6, String str7, int i15, int i16, String str8, String str9, String str10, boolean z13, String str11, String str12, int i17, int i18, String str13, String str14, String str15, boolean z14, int i19, Object obj) {
        boolean z15;
        String str16;
        String str17 = (i19 & 1) != 0 ? mysticResponse.systolicLabel : str;
        String str18 = (i19 & 2) != 0 ? mysticResponse.systolicSuffix : str2;
        int i24 = (i19 & 4) != 0 ? mysticResponse.systolicMax : i13;
        int i25 = (i19 & 8) != 0 ? mysticResponse.systolicMin : i14;
        String str19 = (i19 & 16) != 0 ? mysticResponse.systolicTooHighLabel : str3;
        String str20 = (i19 & 32) != 0 ? mysticResponse.systolicTooLowLabel : str4;
        String str21 = (i19 & 64) != 0 ? mysticResponse.systolicRequiredText : str5;
        boolean z16 = (i19 & 128) != 0 ? mysticResponse.isSystolicRequired : z4;
        String str22 = (i19 & 256) != 0 ? mysticResponse.diastolicLabel : str6;
        String str23 = (i19 & 512) != 0 ? mysticResponse.diastolicSuffix : str7;
        int i26 = (i19 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? mysticResponse.diastolicMax : i15;
        int i27 = (i19 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? mysticResponse.diastolicMin : i16;
        String str24 = (i19 & 4096) != 0 ? mysticResponse.diastolicTooHighLabel : str8;
        String str25 = (i19 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? mysticResponse.diastolicTooLowLabel : str9;
        String str26 = str17;
        String str27 = (i19 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? mysticResponse.diastolicRequiredText : str10;
        boolean z17 = (i19 & 32768) != 0 ? mysticResponse.isDiastolicRequired : z13;
        String str28 = (i19 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? mysticResponse.hrLabel : str11;
        String str29 = (i19 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? mysticResponse.hrSuffix : str12;
        int i28 = (i19 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? mysticResponse.hrMax : i17;
        int i29 = (i19 & 524288) != 0 ? mysticResponse.hrMin : i18;
        String str30 = (i19 & 1048576) != 0 ? mysticResponse.hrTooHighLabel : str13;
        String str31 = (i19 & 2097152) != 0 ? mysticResponse.hrTooLowLabel : str14;
        String str32 = (i19 & 4194304) != 0 ? mysticResponse.hrRequiredText : str15;
        if ((i19 & 8388608) != 0) {
            str16 = str32;
            z15 = mysticResponse.isHrRequired;
        } else {
            z15 = z14;
            str16 = str32;
        }
        return mysticResponse.copy(str26, str18, i24, i25, str19, str20, str21, z16, str22, str23, i26, i27, str24, str25, str27, z17, str28, str29, i28, i29, str30, str31, str16, z15);
    }

    @InterfaceC37143h("diastolic_label_text")
    public static /* synthetic */ void getDiastolicLabel$annotations() {
    }

    @InterfaceC37143h("diastolic_suffix_text")
    public static /* synthetic */ void getDiastolicSuffix$annotations() {
    }

    @InterfaceC37143h("diastolic_too_high_text")
    public static /* synthetic */ void getDiastolicTooHighLabel$annotations() {
    }

    @InterfaceC37143h("diastolic_too_low_text")
    public static /* synthetic */ void getDiastolicTooLowLabel$annotations() {
    }

    @InterfaceC37143h("heart_rate_label_text")
    public static /* synthetic */ void getHrLabel$annotations() {
    }

    @InterfaceC37143h("heart_rate_max")
    public static /* synthetic */ void getHrMax$annotations() {
    }

    @InterfaceC37143h("heart_rate_min")
    public static /* synthetic */ void getHrMin$annotations() {
    }

    @InterfaceC37143h("heart_rate_required_text")
    public static /* synthetic */ void getHrRequiredText$annotations() {
    }

    @InterfaceC37143h("heart_rate_suffix_text")
    public static /* synthetic */ void getHrSuffix$annotations() {
    }

    @InterfaceC37143h("heart_rate_too_high_text")
    public static /* synthetic */ void getHrTooHighLabel$annotations() {
    }

    @InterfaceC37143h("heart_rate_too_low_text")
    public static /* synthetic */ void getHrTooLowLabel$annotations() {
    }

    @InterfaceC37143h("systolic_label_text")
    public static /* synthetic */ void getSystolicLabel$annotations() {
    }

    @InterfaceC37143h("systolic_suffix_text")
    public static /* synthetic */ void getSystolicSuffix$annotations() {
    }

    @InterfaceC37143h("systolic_too_high_text")
    public static /* synthetic */ void getSystolicTooHighLabel$annotations() {
    }

    @InterfaceC37143h("systolic_too_low_text")
    public static /* synthetic */ void getSystolicTooLowLabel$annotations() {
    }

    @InterfaceC37143h("diastolic_required")
    public static /* synthetic */ void isDiastolicRequired$annotations() {
    }

    @InterfaceC37143h("heart_rate_required")
    public static /* synthetic */ void isHrRequired$annotations() {
    }

    @InterfaceC37143h("systolic_required")
    public static /* synthetic */ void isSystolicRequired$annotations() {
    }

    public static final /* synthetic */ void write$Self$whooplabs_release(MysticResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.systolicLabel);
        output.encodeStringElement(serialDesc, 1, self.systolicSuffix);
        output.encodeIntElement(serialDesc, 2, self.systolicMax);
        output.encodeIntElement(serialDesc, 3, self.systolicMin);
        output.encodeStringElement(serialDesc, 4, self.systolicTooHighLabel);
        output.encodeStringElement(serialDesc, 5, self.systolicTooLowLabel);
        output.encodeStringElement(serialDesc, 6, self.systolicRequiredText);
        output.encodeBooleanElement(serialDesc, 7, self.isSystolicRequired);
        output.encodeStringElement(serialDesc, 8, self.diastolicLabel);
        output.encodeStringElement(serialDesc, 9, self.diastolicSuffix);
        output.encodeIntElement(serialDesc, 10, self.diastolicMax);
        output.encodeIntElement(serialDesc, 11, self.diastolicMin);
        output.encodeStringElement(serialDesc, 12, self.diastolicTooHighLabel);
        output.encodeStringElement(serialDesc, 13, self.diastolicTooLowLabel);
        output.encodeStringElement(serialDesc, 14, self.diastolicRequiredText);
        output.encodeBooleanElement(serialDesc, 15, self.isDiastolicRequired);
        output.encodeStringElement(serialDesc, 16, self.hrLabel);
        output.encodeStringElement(serialDesc, 17, self.hrSuffix);
        output.encodeIntElement(serialDesc, 18, self.hrMax);
        output.encodeIntElement(serialDesc, 19, self.hrMin);
        output.encodeStringElement(serialDesc, 20, self.hrTooHighLabel);
        output.encodeStringElement(serialDesc, 21, self.hrTooLowLabel);
        output.encodeStringElement(serialDesc, 22, self.hrRequiredText);
        output.encodeBooleanElement(serialDesc, 23, self.isHrRequired);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSystolicLabel() {
        return this.systolicLabel;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDiastolicSuffix() {
        return this.diastolicSuffix;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getDiastolicMax() {
        return this.diastolicMax;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getDiastolicMin() {
        return this.diastolicMin;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getDiastolicTooHighLabel() {
        return this.diastolicTooHighLabel;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getDiastolicTooLowLabel() {
        return this.diastolicTooLowLabel;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getDiastolicRequiredText() {
        return this.diastolicRequiredText;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getIsDiastolicRequired() {
        return this.isDiastolicRequired;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getHrLabel() {
        return this.hrLabel;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getHrSuffix() {
        return this.hrSuffix;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getHrMax() {
        return this.hrMax;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSystolicSuffix() {
        return this.systolicSuffix;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final int getHrMin() {
        return this.hrMin;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getHrTooHighLabel() {
        return this.hrTooHighLabel;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getHrTooLowLabel() {
        return this.hrTooLowLabel;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getHrRequiredText() {
        return this.hrRequiredText;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final boolean getIsHrRequired() {
        return this.isHrRequired;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSystolicMax() {
        return this.systolicMax;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSystolicMin() {
        return this.systolicMin;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSystolicTooHighLabel() {
        return this.systolicTooHighLabel;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSystolicTooLowLabel() {
        return this.systolicTooLowLabel;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSystolicRequiredText() {
        return this.systolicRequiredText;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsSystolicRequired() {
        return this.isSystolicRequired;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDiastolicLabel() {
        return this.diastolicLabel;
    }

    public final MysticResponse copy(String systolicLabel, String systolicSuffix, int systolicMax, int systolicMin, String systolicTooHighLabel, String systolicTooLowLabel, String systolicRequiredText, boolean isSystolicRequired, String diastolicLabel, String diastolicSuffix, int diastolicMax, int diastolicMin, String diastolicTooHighLabel, String diastolicTooLowLabel, String diastolicRequiredText, boolean isDiastolicRequired, String hrLabel, String hrSuffix, int hrMax, int hrMin, String hrTooHighLabel, String hrTooLowLabel, String hrRequiredText, boolean isHrRequired) {
        AbstractC22676k.m65750j(systolicLabel, "systolicLabel");
        AbstractC22676k.m65750j(systolicSuffix, "systolicSuffix");
        AbstractC22676k.m65750j(systolicTooHighLabel, "systolicTooHighLabel");
        AbstractC22676k.m65750j(systolicTooLowLabel, "systolicTooLowLabel");
        AbstractC22676k.m65750j(systolicRequiredText, "systolicRequiredText");
        AbstractC22676k.m65750j(diastolicLabel, "diastolicLabel");
        AbstractC22676k.m65750j(diastolicSuffix, "diastolicSuffix");
        AbstractC22676k.m65750j(diastolicTooHighLabel, "diastolicTooHighLabel");
        AbstractC22676k.m65750j(diastolicTooLowLabel, "diastolicTooLowLabel");
        AbstractC22676k.m65750j(diastolicRequiredText, "diastolicRequiredText");
        AbstractC22676k.m65750j(hrLabel, "hrLabel");
        AbstractC22676k.m65750j(hrSuffix, "hrSuffix");
        AbstractC22676k.m65750j(hrTooHighLabel, "hrTooHighLabel");
        AbstractC22676k.m65750j(hrTooLowLabel, "hrTooLowLabel");
        AbstractC22676k.m65750j(hrRequiredText, "hrRequiredText");
        return new MysticResponse(systolicLabel, systolicSuffix, systolicMax, systolicMin, systolicTooHighLabel, systolicTooLowLabel, systolicRequiredText, isSystolicRequired, diastolicLabel, diastolicSuffix, diastolicMax, diastolicMin, diastolicTooHighLabel, diastolicTooLowLabel, diastolicRequiredText, isDiastolicRequired, hrLabel, hrSuffix, hrMax, hrMin, hrTooHighLabel, hrTooLowLabel, hrRequiredText, isHrRequired);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MysticResponse)) {
            return false;
        }
        MysticResponse mysticResponse = (MysticResponse) other;
        return AbstractC22676k.m65745e(this.systolicLabel, mysticResponse.systolicLabel) && AbstractC22676k.m65745e(this.systolicSuffix, mysticResponse.systolicSuffix) && this.systolicMax == mysticResponse.systolicMax && this.systolicMin == mysticResponse.systolicMin && AbstractC22676k.m65745e(this.systolicTooHighLabel, mysticResponse.systolicTooHighLabel) && AbstractC22676k.m65745e(this.systolicTooLowLabel, mysticResponse.systolicTooLowLabel) && AbstractC22676k.m65745e(this.systolicRequiredText, mysticResponse.systolicRequiredText) && this.isSystolicRequired == mysticResponse.isSystolicRequired && AbstractC22676k.m65745e(this.diastolicLabel, mysticResponse.diastolicLabel) && AbstractC22676k.m65745e(this.diastolicSuffix, mysticResponse.diastolicSuffix) && this.diastolicMax == mysticResponse.diastolicMax && this.diastolicMin == mysticResponse.diastolicMin && AbstractC22676k.m65745e(this.diastolicTooHighLabel, mysticResponse.diastolicTooHighLabel) && AbstractC22676k.m65745e(this.diastolicTooLowLabel, mysticResponse.diastolicTooLowLabel) && AbstractC22676k.m65745e(this.diastolicRequiredText, mysticResponse.diastolicRequiredText) && this.isDiastolicRequired == mysticResponse.isDiastolicRequired && AbstractC22676k.m65745e(this.hrLabel, mysticResponse.hrLabel) && AbstractC22676k.m65745e(this.hrSuffix, mysticResponse.hrSuffix) && this.hrMax == mysticResponse.hrMax && this.hrMin == mysticResponse.hrMin && AbstractC22676k.m65745e(this.hrTooHighLabel, mysticResponse.hrTooHighLabel) && AbstractC22676k.m65745e(this.hrTooLowLabel, mysticResponse.hrTooLowLabel) && AbstractC22676k.m65745e(this.hrRequiredText, mysticResponse.hrRequiredText) && this.isHrRequired == mysticResponse.isHrRequired;
    }

    public final String getDiastolicLabel() {
        return this.diastolicLabel;
    }

    public final int getDiastolicMax() {
        return this.diastolicMax;
    }

    public final int getDiastolicMin() {
        return this.diastolicMin;
    }

    public final String getDiastolicRequiredText() {
        return this.diastolicRequiredText;
    }

    public final String getDiastolicSuffix() {
        return this.diastolicSuffix;
    }

    public final String getDiastolicTooHighLabel() {
        return this.diastolicTooHighLabel;
    }

    public final String getDiastolicTooLowLabel() {
        return this.diastolicTooLowLabel;
    }

    public final String getHrLabel() {
        return this.hrLabel;
    }

    public final int getHrMax() {
        return this.hrMax;
    }

    public final int getHrMin() {
        return this.hrMin;
    }

    public final String getHrRequiredText() {
        return this.hrRequiredText;
    }

    public final String getHrSuffix() {
        return this.hrSuffix;
    }

    public final String getHrTooHighLabel() {
        return this.hrTooHighLabel;
    }

    public final String getHrTooLowLabel() {
        return this.hrTooLowLabel;
    }

    public final String getSystolicLabel() {
        return this.systolicLabel;
    }

    public final int getSystolicMax() {
        return this.systolicMax;
    }

    public final int getSystolicMin() {
        return this.systolicMin;
    }

    public final String getSystolicRequiredText() {
        return this.systolicRequiredText;
    }

    public final String getSystolicSuffix() {
        return this.systolicSuffix;
    }

    public final String getSystolicTooHighLabel() {
        return this.systolicTooHighLabel;
    }

    public final String getSystolicTooLowLabel() {
        return this.systolicTooLowLabel;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isHrRequired) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.hrMin, AbstractC11266d.m30448b(this.hrMax, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.diastolicMin, AbstractC11266d.m30448b(this.diastolicMax, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.systolicMin, AbstractC11266d.m30448b(this.systolicMax, AbstractC11266d.m30450d(this.systolicLabel.hashCode() * 31, 31, this.systolicSuffix), 31), 31), 31, this.systolicTooHighLabel), 31, this.systolicTooLowLabel), 31, this.systolicRequiredText), 31, this.isSystolicRequired), 31, this.diastolicLabel), 31, this.diastolicSuffix), 31), 31), 31, this.diastolicTooHighLabel), 31, this.diastolicTooLowLabel), 31, this.diastolicRequiredText), 31, this.isDiastolicRequired), 31, this.hrLabel), 31, this.hrSuffix), 31), 31), 31, this.hrTooHighLabel), 31, this.hrTooLowLabel), 31, this.hrRequiredText);
    }

    public final boolean isDiastolicRequired() {
        return this.isDiastolicRequired;
    }

    public final boolean isHrRequired() {
        return this.isHrRequired;
    }

    public final boolean isSystolicRequired() {
        return this.isSystolicRequired;
    }

    public String toString() {
        String str = this.systolicLabel;
        String str2 = this.systolicSuffix;
        int i13 = this.systolicMax;
        int i14 = this.systolicMin;
        String str3 = this.systolicTooHighLabel;
        String str4 = this.systolicTooLowLabel;
        String str5 = this.systolicRequiredText;
        boolean z4 = this.isSystolicRequired;
        String str6 = this.diastolicLabel;
        String str7 = this.diastolicSuffix;
        int i15 = this.diastolicMax;
        int i16 = this.diastolicMin;
        String str8 = this.diastolicTooHighLabel;
        String str9 = this.diastolicTooLowLabel;
        String str10 = this.diastolicRequiredText;
        boolean z13 = this.isDiastolicRequired;
        String str11 = this.hrLabel;
        String str12 = this.hrSuffix;
        int i17 = this.hrMax;
        int i18 = this.hrMin;
        String str13 = this.hrTooHighLabel;
        String str14 = this.hrTooLowLabel;
        String str15 = this.hrRequiredText;
        boolean z14 = this.isHrRequired;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MysticResponse(systolicLabel=", str, ", systolicSuffix=", str2, ", systolicMax=");
        AbstractC30802r.m94773v(sbM32001t, i13, ", systolicMin=", i14, ", systolicTooHighLabel=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", systolicTooLowLabel=", str4, ", systolicRequiredText=");
        AbstractC38963t7.m124390t(sbM32001t, str5, ", isSystolicRequired=", z4, ", diastolicLabel=");
        AbstractC11266d.m30444B(sbM32001t, str6, ", diastolicSuffix=", str7, ", diastolicMax=");
        AbstractC30802r.m94773v(sbM32001t, i15, ", diastolicMin=", i16, ", diastolicTooHighLabel=");
        AbstractC11266d.m30444B(sbM32001t, str8, ", diastolicTooLowLabel=", str9, ", diastolicRequiredText=");
        AbstractC38963t7.m124390t(sbM32001t, str10, ", isDiastolicRequired=", z13, ", hrLabel=");
        AbstractC11266d.m30444B(sbM32001t, str11, ", hrSuffix=", str12, ", hrMax=");
        AbstractC30802r.m94773v(sbM32001t, i17, ", hrMin=", i18, ", hrTooHighLabel=");
        AbstractC11266d.m30444B(sbM32001t, str13, ", hrTooLowLabel=", str14, ", hrRequiredText=");
        return AbstractC21702c.m61137h(sbM32001t, str15, ", isHrRequired=", z14, ")");
    }

    public MysticResponse(String systolicLabel, String systolicSuffix, int i13, int i14, String systolicTooHighLabel, String systolicTooLowLabel, String systolicRequiredText, boolean z4, String diastolicLabel, String diastolicSuffix, int i15, int i16, String diastolicTooHighLabel, String diastolicTooLowLabel, String diastolicRequiredText, boolean z13, String hrLabel, String hrSuffix, int i17, int i18, String hrTooHighLabel, String hrTooLowLabel, String hrRequiredText, boolean z14) {
        AbstractC22676k.m65750j(systolicLabel, "systolicLabel");
        AbstractC22676k.m65750j(systolicSuffix, "systolicSuffix");
        AbstractC22676k.m65750j(systolicTooHighLabel, "systolicTooHighLabel");
        AbstractC22676k.m65750j(systolicTooLowLabel, "systolicTooLowLabel");
        AbstractC22676k.m65750j(systolicRequiredText, "systolicRequiredText");
        AbstractC22676k.m65750j(diastolicLabel, "diastolicLabel");
        AbstractC22676k.m65750j(diastolicSuffix, "diastolicSuffix");
        AbstractC22676k.m65750j(diastolicTooHighLabel, "diastolicTooHighLabel");
        AbstractC22676k.m65750j(diastolicTooLowLabel, "diastolicTooLowLabel");
        AbstractC22676k.m65750j(diastolicRequiredText, "diastolicRequiredText");
        AbstractC22676k.m65750j(hrLabel, "hrLabel");
        AbstractC22676k.m65750j(hrSuffix, "hrSuffix");
        AbstractC22676k.m65750j(hrTooHighLabel, "hrTooHighLabel");
        AbstractC22676k.m65750j(hrTooLowLabel, "hrTooLowLabel");
        AbstractC22676k.m65750j(hrRequiredText, "hrRequiredText");
        this.systolicLabel = systolicLabel;
        this.systolicSuffix = systolicSuffix;
        this.systolicMax = i13;
        this.systolicMin = i14;
        this.systolicTooHighLabel = systolicTooHighLabel;
        this.systolicTooLowLabel = systolicTooLowLabel;
        this.systolicRequiredText = systolicRequiredText;
        this.isSystolicRequired = z4;
        this.diastolicLabel = diastolicLabel;
        this.diastolicSuffix = diastolicSuffix;
        this.diastolicMax = i15;
        this.diastolicMin = i16;
        this.diastolicTooHighLabel = diastolicTooHighLabel;
        this.diastolicTooLowLabel = diastolicTooLowLabel;
        this.diastolicRequiredText = diastolicRequiredText;
        this.isDiastolicRequired = z13;
        this.hrLabel = hrLabel;
        this.hrSuffix = hrSuffix;
        this.hrMax = i17;
        this.hrMin = i18;
        this.hrTooHighLabel = hrTooHighLabel;
        this.hrTooLowLabel = hrTooLowLabel;
        this.hrRequiredText = hrRequiredText;
        this.isHrRequired = z14;
    }
}
