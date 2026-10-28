package com.whoop.weightlifting.data.dto;

import androidx.profileinstaller.ProfileVerifier;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.weightlifting.data.domain.ExerciseEquipment;
import com.whoop.weightlifting.data.domain.ExerciseLaterality;
import com.whoop.weightlifting.data.domain.VolumeInputFormat;
import com.whoop.weightlifting.data.domain.WeightliftingExercise;
import hc3.AbstractC17176i;
import java.util.List;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import ku2.C22837a;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b:\b\u0087\b\u0018\u0000 \u0088\u00012\u00020\u0001:\u0004\u0089\u0001\u0088\u0001B\u0087\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001eB\u0091\u0002\b\u0010\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001d\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010(J\u0010\u0010+\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010(J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010(J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010(J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010(J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010(J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010(J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010(J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010(J\u0018\u00105\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b5\u00106J\u0018\u00107\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b7\u00106J\u0018\u00108\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b8\u00106J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u0010(J\u0012\u0010:\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b<\u0010(J\u0010\u0010=\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b=\u0010(J\u0012\u0010>\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b>\u0010(J\u0012\u0010?\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bA\u0010(J\u0012\u0010B\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bB\u0010(J¢\u0002\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00102\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00102\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bE\u0010(J\u0010\u0010F\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\bF\u0010GJ\u001a\u0010I\u001a\u00020\u00062\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bI\u0010JJ'\u0010S\u001a\u00020P2\u0006\u0010K\u001a\u00020\u00002\u0006\u0010M\u001a\u00020L2\u0006\u0010O\u001a\u00020NH\u0001¢\u0006\u0004\bQ\u0010RR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010T\u0012\u0004\bV\u0010W\u001a\u0004\bU\u0010(R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010T\u0012\u0004\bY\u0010W\u001a\u0004\bX\u0010(R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010T\u0012\u0004\b[\u0010W\u001a\u0004\bZ\u0010(R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\\\u0012\u0004\b^\u0010W\u001a\u0004\b]\u0010,R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010T\u0012\u0004\b`\u0010W\u001a\u0004\b_\u0010(R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010T\u0012\u0004\bb\u0010W\u001a\u0004\ba\u0010(R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010T\u0012\u0004\bd\u0010W\u001a\u0004\bc\u0010(R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010T\u0012\u0004\bf\u0010W\u001a\u0004\be\u0010(R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010T\u0012\u0004\bh\u0010W\u001a\u0004\bg\u0010(R\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010T\u0012\u0004\bj\u0010W\u001a\u0004\bi\u0010(R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010T\u0012\u0004\bl\u0010W\u001a\u0004\bk\u0010(R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010T\u0012\u0004\bn\u0010W\u001a\u0004\bm\u0010(R(\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010o\u0012\u0004\bq\u0010W\u001a\u0004\bp\u00106R(\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010o\u0012\u0004\bs\u0010W\u001a\u0004\br\u00106R(\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010o\u0012\u0004\bu\u0010W\u001a\u0004\bt\u00106R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010T\u0012\u0004\bw\u0010W\u001a\u0004\bv\u0010(R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010x\u0012\u0004\bz\u0010W\u001a\u0004\by\u0010;R \u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010T\u0012\u0004\b|\u0010W\u001a\u0004\b{\u0010(R \u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010T\u0012\u0004\b~\u0010W\u001a\u0004\b}\u0010(R#\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0013\n\u0004\b\u0018\u0010T\u0012\u0005\b\u0080\u0001\u0010W\u001a\u0004\b\u007f\u0010(R%\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u001a\u0010\u0081\u0001\u0012\u0005\b\u0083\u0001\u0010W\u001a\u0005\b\u0082\u0001\u0010@R$\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001b\u0010T\u0012\u0005\b\u0085\u0001\u0010W\u001a\u0005\b\u0084\u0001\u0010(R$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001c\u0010T\u0012\u0005\b\u0087\u0001\u0010W\u001a\u0005\b\u0086\u0001\u0010(¨\u0006\u008a\u0001"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;", "", "", "exerciseId", "name", "pushCoreName", "", "trackable", "equipment", "translatedEquipment", "exerciseType", "laterality", "movementPattern", "translatedMovementPattern", "imageUrl", "videoUrl", "", "instructions", "trainingTypes", "muscleGroups", "translatedMuscleGroups", "deleted", "createdAt", "updatedAt", "volumeInputFormat", "Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;", "customExerciseInfo", "volumeInputUnit", "volumeInputValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "toWeightliftingExercise", "()Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "()Ljava/util/List;", "component14", "component15", "component16", "component17", "()Ljava/lang/Boolean;", "component18", "component19", "component20", "component21", "()Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;", "component22", "component23", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getExerciseId", "getExerciseId$annotations", "()V", "getName", "getName$annotations", "getPushCoreName", "getPushCoreName$annotations", "Z", "getTrackable", "getTrackable$annotations", "getEquipment", "getEquipment$annotations", "getTranslatedEquipment", "getTranslatedEquipment$annotations", "getExerciseType", "getExerciseType$annotations", "getLaterality", "getLaterality$annotations", "getMovementPattern", "getMovementPattern$annotations", "getTranslatedMovementPattern", "getTranslatedMovementPattern$annotations", "getImageUrl", "getImageUrl$annotations", "getVideoUrl", "getVideoUrl$annotations", "Ljava/util/List;", "getInstructions", "getInstructions$annotations", "getTrainingTypes", "getTrainingTypes$annotations", "getMuscleGroups", "getMuscleGroups$annotations", "getTranslatedMuscleGroups", "getTranslatedMuscleGroups$annotations", "Ljava/lang/Boolean;", "getDeleted", "getDeleted$annotations", "getCreatedAt", "getCreatedAt$annotations", "getUpdatedAt", "getUpdatedAt$annotations", "getVolumeInputFormat", "getVolumeInputFormat$annotations", "Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;", "getCustomExerciseInfo", "getCustomExerciseInfo$annotations", "getVolumeInputUnit", "getVolumeInputUnit$annotations", "getVolumeInputValue", "getVolumeInputValue$annotations", "Companion", "$serializer", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WeightliftingExerciseDto {
    private static final InterfaceC23462h[] $childSerializers;

    @SerializedName("created_at")
    private final String createdAt;

    @SerializedName("custom_exercise_info")
    private final CustomExerciseInfoDto customExerciseInfo;

    @SerializedName("deleted")
    private final Boolean deleted;

    @SerializedName("equipment")
    private final String equipment;

    @SerializedName("exercise_id")
    private final String exerciseId;

    @SerializedName("exercise_type")
    private final String exerciseType;

    @SerializedName("image_url")
    private final String imageUrl;

    @SerializedName("instructions")
    private final List<String> instructions;

    @SerializedName("laterality")
    private final String laterality;

    @SerializedName("movement_pattern")
    private final String movementPattern;

    @SerializedName("muscle_groups")
    private final List<String> muscleGroups;

    @SerializedName("name")
    private final String name;

    @SerializedName("push_core_name")
    private final String pushCoreName;

    @SerializedName("trackable")
    private final boolean trackable;

    @SerializedName("training_types")
    private final List<String> trainingTypes;

    @SerializedName("translated_equipment")
    private final String translatedEquipment;

    @SerializedName("translated_movement_pattern")
    private final String translatedMovementPattern;

    @SerializedName("translated_muscle_groups")
    private final String translatedMuscleGroups;

    @SerializedName("updated_at")
    private final String updatedAt;

    @SerializedName("video_url")
    private final String videoUrl;

    @SerializedName("volume_input_format")
    private final String volumeInputFormat;

    @SerializedName("volume_input_units")
    private final String volumeInputUnit;

    @SerializedName("volume_input_value")
    private final String volumeInputValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WeightliftingExerciseDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C22837a(0)), AbstractC30060g.m92087G(enumC23463i, new C22837a(1)), AbstractC30060g.m92087G(enumC23463i, new C22837a(2)), null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ WeightliftingExerciseDto(int i13, String str, String str2, String str3, boolean z4, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, List list2, List list3, String str12, Boolean bool, String str13, String str14, String str15, CustomExerciseInfoDto customExerciseInfoDto, String str16, String str17, SerializationConstructorMarker serializationConstructorMarker) {
        if (1049055 != (i13 & 1049055)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1049055, WeightliftingExerciseDto$$serializer.INSTANCE.getDescriptor());
        }
        this.exerciseId = str;
        this.name = str2;
        this.pushCoreName = str3;
        this.trackable = z4;
        this.equipment = str4;
        if ((i13 & 32) == 0) {
            this.translatedEquipment = null;
        } else {
            this.translatedEquipment = str5;
        }
        this.exerciseType = str6;
        this.laterality = str7;
        this.movementPattern = str8;
        if ((i13 & 512) == 0) {
            this.translatedMovementPattern = null;
        } else {
            this.translatedMovementPattern = str9;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = str10;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.videoUrl = null;
        } else {
            this.videoUrl = str11;
        }
        if ((i13 & 4096) == 0) {
            this.instructions = null;
        } else {
            this.instructions = list;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
            this.trainingTypes = null;
        } else {
            this.trainingTypes = list2;
        }
        if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 0) {
            this.muscleGroups = null;
        } else {
            this.muscleGroups = list3;
        }
        if ((32768 & i13) == 0) {
            this.translatedMuscleGroups = null;
        } else {
            this.translatedMuscleGroups = str12;
        }
        if ((65536 & i13) == 0) {
            this.deleted = null;
        } else {
            this.deleted = bool;
        }
        if ((131072 & i13) == 0) {
            this.createdAt = "";
        } else {
            this.createdAt = str13;
        }
        if ((262144 & i13) == 0) {
            this.updatedAt = "";
        } else {
            this.updatedAt = str14;
        }
        if ((524288 & i13) == 0) {
            this.volumeInputFormat = null;
        } else {
            this.volumeInputFormat = str15;
        }
        this.customExerciseInfo = customExerciseInfoDto;
        if ((2097152 & i13) == 0) {
            this.volumeInputUnit = null;
        } else {
            this.volumeInputUnit = str16;
        }
        if ((i13 & 4194304) == 0) {
            this.volumeInputValue = null;
        } else {
            this.volumeInputValue = str17;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WeightliftingExerciseDto copy$default(WeightliftingExerciseDto weightliftingExerciseDto, String str, String str2, String str3, boolean z4, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, List list2, List list3, String str12, Boolean bool, String str13, String str14, String str15, CustomExerciseInfoDto customExerciseInfoDto, String str16, String str17, int i13, Object obj) {
        String str18;
        String str19;
        String str20 = (i13 & 1) != 0 ? weightliftingExerciseDto.exerciseId : str;
        String str21 = (i13 & 2) != 0 ? weightliftingExerciseDto.name : str2;
        String str22 = (i13 & 4) != 0 ? weightliftingExerciseDto.pushCoreName : str3;
        boolean z13 = (i13 & 8) != 0 ? weightliftingExerciseDto.trackable : z4;
        String str23 = (i13 & 16) != 0 ? weightliftingExerciseDto.equipment : str4;
        String str24 = (i13 & 32) != 0 ? weightliftingExerciseDto.translatedEquipment : str5;
        String str25 = (i13 & 64) != 0 ? weightliftingExerciseDto.exerciseType : str6;
        String str26 = (i13 & 128) != 0 ? weightliftingExerciseDto.laterality : str7;
        String str27 = (i13 & 256) != 0 ? weightliftingExerciseDto.movementPattern : str8;
        String str28 = (i13 & 512) != 0 ? weightliftingExerciseDto.translatedMovementPattern : str9;
        String str29 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? weightliftingExerciseDto.imageUrl : str10;
        String str30 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? weightliftingExerciseDto.videoUrl : str11;
        List list4 = (i13 & 4096) != 0 ? weightliftingExerciseDto.instructions : list;
        List list5 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? weightliftingExerciseDto.trainingTypes : list2;
        String str31 = str20;
        List list6 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? weightliftingExerciseDto.muscleGroups : list3;
        String str32 = (i13 & 32768) != 0 ? weightliftingExerciseDto.translatedMuscleGroups : str12;
        Boolean bool2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? weightliftingExerciseDto.deleted : bool;
        String str33 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? weightliftingExerciseDto.createdAt : str13;
        String str34 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? weightliftingExerciseDto.updatedAt : str14;
        String str35 = (i13 & 524288) != 0 ? weightliftingExerciseDto.volumeInputFormat : str15;
        CustomExerciseInfoDto customExerciseInfoDto2 = (i13 & 1048576) != 0 ? weightliftingExerciseDto.customExerciseInfo : customExerciseInfoDto;
        String str36 = (i13 & 2097152) != 0 ? weightliftingExerciseDto.volumeInputUnit : str16;
        if ((i13 & 4194304) != 0) {
            str19 = str36;
            str18 = weightliftingExerciseDto.volumeInputValue;
        } else {
            str18 = str17;
            str19 = str36;
        }
        return weightliftingExerciseDto.copy(str31, str21, str22, z13, str23, str24, str25, str26, str27, str28, str29, str30, list4, list5, list6, str32, bool2, str33, str34, str35, customExerciseInfoDto2, str19, str18);
    }

    @InterfaceC37143h("created_at")
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    @InterfaceC37143h("custom_exercise_info")
    public static /* synthetic */ void getCustomExerciseInfo$annotations() {
    }

    @InterfaceC37143h("deleted")
    public static /* synthetic */ void getDeleted$annotations() {
    }

    @InterfaceC37143h("equipment")
    public static /* synthetic */ void getEquipment$annotations() {
    }

    @InterfaceC37143h("exercise_id")
    public static /* synthetic */ void getExerciseId$annotations() {
    }

    @InterfaceC37143h("exercise_type")
    public static /* synthetic */ void getExerciseType$annotations() {
    }

    @InterfaceC37143h("image_url")
    public static /* synthetic */ void getImageUrl$annotations() {
    }

    @InterfaceC37143h("instructions")
    public static /* synthetic */ void getInstructions$annotations() {
    }

    @InterfaceC37143h("laterality")
    public static /* synthetic */ void getLaterality$annotations() {
    }

    @InterfaceC37143h("movement_pattern")
    public static /* synthetic */ void getMovementPattern$annotations() {
    }

    @InterfaceC37143h("muscle_groups")
    public static /* synthetic */ void getMuscleGroups$annotations() {
    }

    @InterfaceC37143h("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @InterfaceC37143h("push_core_name")
    public static /* synthetic */ void getPushCoreName$annotations() {
    }

    @InterfaceC37143h("trackable")
    public static /* synthetic */ void getTrackable$annotations() {
    }

    @InterfaceC37143h("training_types")
    public static /* synthetic */ void getTrainingTypes$annotations() {
    }

    @InterfaceC37143h("translated_equipment")
    public static /* synthetic */ void getTranslatedEquipment$annotations() {
    }

    @InterfaceC37143h("translated_movement_pattern")
    public static /* synthetic */ void getTranslatedMovementPattern$annotations() {
    }

    @InterfaceC37143h("translated_muscle_groups")
    public static /* synthetic */ void getTranslatedMuscleGroups$annotations() {
    }

    @InterfaceC37143h("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    @InterfaceC37143h("video_url")
    public static /* synthetic */ void getVideoUrl$annotations() {
    }

    @InterfaceC37143h("volume_input_format")
    public static /* synthetic */ void getVolumeInputFormat$annotations() {
    }

    @InterfaceC37143h("volume_input_units")
    public static /* synthetic */ void getVolumeInputUnit$annotations() {
    }

    @InterfaceC37143h("volume_input_value")
    public static /* synthetic */ void getVolumeInputValue$annotations() {
    }

    public static final /* synthetic */ void write$Self$weightlifting_release(WeightliftingExerciseDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.exerciseId);
        output.encodeStringElement(serialDesc, 1, self.name);
        output.encodeStringElement(serialDesc, 2, self.pushCoreName);
        output.encodeBooleanElement(serialDesc, 3, self.trackable);
        output.encodeStringElement(serialDesc, 4, self.equipment);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.translatedEquipment != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.translatedEquipment);
        }
        output.encodeStringElement(serialDesc, 6, self.exerciseType);
        output.encodeStringElement(serialDesc, 7, self.laterality);
        output.encodeStringElement(serialDesc, 8, self.movementPattern);
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.translatedMovementPattern != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.translatedMovementPattern);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.imageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, self.imageUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.videoUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, self.videoUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.instructions != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, (InterfaceC37145j) interfaceC23462hArr[12].getValue(), self.instructions);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.trainingTypes != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, (InterfaceC37145j) interfaceC23462hArr[13].getValue(), self.trainingTypes);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.muscleGroups != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, (InterfaceC37145j) interfaceC23462hArr[14].getValue(), self.muscleGroups);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || self.translatedMuscleGroups != null) {
            output.encodeNullableSerializableElement(serialDesc, 15, StringSerializer.INSTANCE, self.translatedMuscleGroups);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 16) || self.deleted != null) {
            output.encodeNullableSerializableElement(serialDesc, 16, BooleanSerializer.INSTANCE, self.deleted);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 17) || !AbstractC22676k.m65745e(self.createdAt, "")) {
            output.encodeStringElement(serialDesc, 17, self.createdAt);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 18) || !AbstractC22676k.m65745e(self.updatedAt, "")) {
            output.encodeStringElement(serialDesc, 18, self.updatedAt);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 19) || self.volumeInputFormat != null) {
            output.encodeNullableSerializableElement(serialDesc, 19, StringSerializer.INSTANCE, self.volumeInputFormat);
        }
        output.encodeNullableSerializableElement(serialDesc, 20, CustomExerciseInfoDto$$serializer.INSTANCE, self.customExerciseInfo);
        if (output.shouldEncodeElementDefault(serialDesc, 21) || self.volumeInputUnit != null) {
            output.encodeNullableSerializableElement(serialDesc, 21, StringSerializer.INSTANCE, self.volumeInputUnit);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 22) && self.volumeInputValue == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 22, StringSerializer.INSTANCE, self.volumeInputValue);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getExerciseId() {
        return this.exerciseId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTranslatedMovementPattern() {
        return this.translatedMovementPattern;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public final List<String> component13() {
        return this.instructions;
    }

    public final List<String> component14() {
        return this.trainingTypes;
    }

    public final List<String> component15() {
        return this.muscleGroups;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getTranslatedMuscleGroups() {
        return this.translatedMuscleGroups;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Boolean getDeleted() {
        return this.deleted;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getVolumeInputFormat() {
        return this.volumeInputFormat;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final CustomExerciseInfoDto getCustomExerciseInfo() {
        return this.customExerciseInfo;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getVolumeInputUnit() {
        return this.volumeInputUnit;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getVolumeInputValue() {
        return this.volumeInputValue;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPushCoreName() {
        return this.pushCoreName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getTrackable() {
        return this.trackable;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEquipment() {
        return this.equipment;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTranslatedEquipment() {
        return this.translatedEquipment;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getExerciseType() {
        return this.exerciseType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLaterality() {
        return this.laterality;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMovementPattern() {
        return this.movementPattern;
    }

    public final WeightliftingExerciseDto copy(String exerciseId, String name, String pushCoreName, boolean trackable, String equipment, String translatedEquipment, String exerciseType, String laterality, String movementPattern, String translatedMovementPattern, String imageUrl, String videoUrl, List<String> instructions, List<String> trainingTypes, List<String> muscleGroups, String translatedMuscleGroups, Boolean deleted, String createdAt, String updatedAt, String volumeInputFormat, CustomExerciseInfoDto customExerciseInfo, String volumeInputUnit, String volumeInputValue) {
        AbstractC22676k.m65750j(exerciseId, "exerciseId");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(pushCoreName, "pushCoreName");
        AbstractC22676k.m65750j(equipment, "equipment");
        AbstractC22676k.m65750j(exerciseType, "exerciseType");
        AbstractC22676k.m65750j(laterality, "laterality");
        AbstractC22676k.m65750j(movementPattern, "movementPattern");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        return new WeightliftingExerciseDto(exerciseId, name, pushCoreName, trackable, equipment, translatedEquipment, exerciseType, laterality, movementPattern, translatedMovementPattern, imageUrl, videoUrl, instructions, trainingTypes, muscleGroups, translatedMuscleGroups, deleted, createdAt, updatedAt, volumeInputFormat, customExerciseInfo, volumeInputUnit, volumeInputValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeightliftingExerciseDto)) {
            return false;
        }
        WeightliftingExerciseDto weightliftingExerciseDto = (WeightliftingExerciseDto) other;
        return AbstractC22676k.m65745e(this.exerciseId, weightliftingExerciseDto.exerciseId) && AbstractC22676k.m65745e(this.name, weightliftingExerciseDto.name) && AbstractC22676k.m65745e(this.pushCoreName, weightliftingExerciseDto.pushCoreName) && this.trackable == weightliftingExerciseDto.trackable && AbstractC22676k.m65745e(this.equipment, weightliftingExerciseDto.equipment) && AbstractC22676k.m65745e(this.translatedEquipment, weightliftingExerciseDto.translatedEquipment) && AbstractC22676k.m65745e(this.exerciseType, weightliftingExerciseDto.exerciseType) && AbstractC22676k.m65745e(this.laterality, weightliftingExerciseDto.laterality) && AbstractC22676k.m65745e(this.movementPattern, weightliftingExerciseDto.movementPattern) && AbstractC22676k.m65745e(this.translatedMovementPattern, weightliftingExerciseDto.translatedMovementPattern) && AbstractC22676k.m65745e(this.imageUrl, weightliftingExerciseDto.imageUrl) && AbstractC22676k.m65745e(this.videoUrl, weightliftingExerciseDto.videoUrl) && AbstractC22676k.m65745e(this.instructions, weightliftingExerciseDto.instructions) && AbstractC22676k.m65745e(this.trainingTypes, weightliftingExerciseDto.trainingTypes) && AbstractC22676k.m65745e(this.muscleGroups, weightliftingExerciseDto.muscleGroups) && AbstractC22676k.m65745e(this.translatedMuscleGroups, weightliftingExerciseDto.translatedMuscleGroups) && AbstractC22676k.m65745e(this.deleted, weightliftingExerciseDto.deleted) && AbstractC22676k.m65745e(this.createdAt, weightliftingExerciseDto.createdAt) && AbstractC22676k.m65745e(this.updatedAt, weightliftingExerciseDto.updatedAt) && AbstractC22676k.m65745e(this.volumeInputFormat, weightliftingExerciseDto.volumeInputFormat) && AbstractC22676k.m65745e(this.customExerciseInfo, weightliftingExerciseDto.customExerciseInfo) && AbstractC22676k.m65745e(this.volumeInputUnit, weightliftingExerciseDto.volumeInputUnit) && AbstractC22676k.m65745e(this.volumeInputValue, weightliftingExerciseDto.volumeInputValue);
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final CustomExerciseInfoDto getCustomExerciseInfo() {
        return this.customExerciseInfo;
    }

    public final Boolean getDeleted() {
        return this.deleted;
    }

    public final String getEquipment() {
        return this.equipment;
    }

    public final String getExerciseId() {
        return this.exerciseId;
    }

    public final String getExerciseType() {
        return this.exerciseType;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final List<String> getInstructions() {
        return this.instructions;
    }

    public final String getLaterality() {
        return this.laterality;
    }

    public final String getMovementPattern() {
        return this.movementPattern;
    }

    public final List<String> getMuscleGroups() {
        return this.muscleGroups;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPushCoreName() {
        return this.pushCoreName;
    }

    public final boolean getTrackable() {
        return this.trackable;
    }

    public final List<String> getTrainingTypes() {
        return this.trainingTypes;
    }

    public final String getTranslatedEquipment() {
        return this.translatedEquipment;
    }

    public final String getTranslatedMovementPattern() {
        return this.translatedMovementPattern;
    }

    public final String getTranslatedMuscleGroups() {
        return this.translatedMuscleGroups;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public final String getVolumeInputFormat() {
        return this.volumeInputFormat;
    }

    public final String getVolumeInputUnit() {
        return this.volumeInputUnit;
    }

    public final String getVolumeInputValue() {
        return this.volumeInputValue;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.exerciseId.hashCode() * 31, 31, this.name), 31, this.pushCoreName), 31, this.trackable), 31, this.equipment);
        String str = this.translatedEquipment;
        int iM30450d2 = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.exerciseType), 31, this.laterality), 31, this.movementPattern);
        String str2 = this.translatedMovementPattern;
        int iHashCode = (iM30450d2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageUrl;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.videoUrl;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.instructions;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.trainingTypes;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.muscleGroups;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str5 = this.translatedMuscleGroups;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.deleted;
        int iM30450d3 = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.createdAt), 31, this.updatedAt);
        String str6 = this.volumeInputFormat;
        int iHashCode8 = (iM30450d3 + (str6 == null ? 0 : str6.hashCode())) * 31;
        CustomExerciseInfoDto customExerciseInfoDto = this.customExerciseInfo;
        int iHashCode9 = (iHashCode8 + (customExerciseInfoDto == null ? 0 : customExerciseInfoDto.hashCode())) * 31;
        String str7 = this.volumeInputUnit;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.volumeInputValue;
        return iHashCode10 + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        String str = this.exerciseId;
        String str2 = this.name;
        String str3 = this.pushCoreName;
        boolean z4 = this.trackable;
        String str4 = this.equipment;
        String str5 = this.translatedEquipment;
        String str6 = this.exerciseType;
        String str7 = this.laterality;
        String str8 = this.movementPattern;
        String str9 = this.translatedMovementPattern;
        String str10 = this.imageUrl;
        String str11 = this.videoUrl;
        List<String> list = this.instructions;
        List<String> list2 = this.trainingTypes;
        List<String> list3 = this.muscleGroups;
        String str12 = this.translatedMuscleGroups;
        Boolean bool = this.deleted;
        String str13 = this.createdAt;
        String str14 = this.updatedAt;
        String str15 = this.volumeInputFormat;
        CustomExerciseInfoDto customExerciseInfoDto = this.customExerciseInfo;
        String str16 = this.volumeInputUnit;
        String str17 = this.volumeInputValue;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("WeightliftingExerciseDto(exerciseId=", str, ", name=", str2, ", pushCoreName=");
        AbstractC38963t7.m124390t(sbM32001t, str3, ", trackable=", z4, ", equipment=");
        AbstractC11266d.m30444B(sbM32001t, str4, ", translatedEquipment=", str5, ", exerciseType=");
        AbstractC11266d.m30444B(sbM32001t, str6, ", laterality=", str7, ", movementPattern=");
        AbstractC11266d.m30444B(sbM32001t, str8, ", translatedMovementPattern=", str9, ", imageUrl=");
        AbstractC11266d.m30444B(sbM32001t, str10, ", videoUrl=", str11, ", instructions=");
        AbstractC21702c.m61148s(sbM32001t, list, ", trainingTypes=", list2, ", muscleGroups=");
        AbstractC17176i.m48511m(", translatedMuscleGroups=", str12, ", deleted=", sbM32001t, list3);
        AbstractC13673n.m38576w(bool, ", createdAt=", str13, ", updatedAt=", sbM32001t);
        AbstractC11266d.m30444B(sbM32001t, str14, ", volumeInputFormat=", str15, ", customExerciseInfo=");
        sbM32001t.append(customExerciseInfoDto);
        sbM32001t.append(", volumeInputUnit=");
        sbM32001t.append(str16);
        sbM32001t.append(", volumeInputValue=");
        return AbstractC25012a.m73376i(str17, ")", sbM32001t);
    }

    public final WeightliftingExercise toWeightliftingExercise() {
        ExerciseEquipment exerciseEquipment;
        ExerciseLaterality exerciseLaterality;
        VolumeInputFormat volumeInputFormat;
        String str = this.exerciseId;
        String str2 = this.name;
        String str3 = this.pushCoreName;
        boolean z4 = this.trackable;
        String str4 = this.equipment;
        ExerciseEquipment exerciseEquipment2 = ExerciseEquipment.Unknown;
        ExerciseEquipment[] exerciseEquipmentArrValues = ExerciseEquipment.values();
        int length = exerciseEquipmentArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                exerciseEquipment = null;
                break;
            }
            exerciseEquipment = exerciseEquipmentArrValues[i13];
            if (AbstractC22676k.m65745e(exerciseEquipment.getSerializedValue(), str4)) {
                break;
            }
            i13++;
        }
        if (exerciseEquipment != null) {
            exerciseEquipment2 = exerciseEquipment;
        }
        String str5 = this.translatedEquipment;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = this.exerciseType;
        String str7 = this.laterality;
        ExerciseLaterality exerciseLaterality2 = ExerciseLaterality.Unknown;
        ExerciseLaterality[] exerciseLateralityArrValues = ExerciseLaterality.values();
        int length2 = exerciseLateralityArrValues.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length2) {
                exerciseLaterality = null;
                break;
            }
            exerciseLaterality = exerciseLateralityArrValues[i14];
            if (AbstractC22676k.m65745e(exerciseLaterality.getSerializedValue(), str7)) {
                break;
            }
            i14++;
        }
        ExerciseLaterality exerciseLaterality3 = exerciseLaterality == null ? exerciseLaterality2 : exerciseLaterality;
        String str8 = this.movementPattern;
        String str9 = this.translatedMovementPattern;
        if (str9 == null) {
            str9 = "";
        }
        String str10 = this.imageUrl;
        String str11 = str9;
        String str12 = this.videoUrl;
        List<String> list = this.instructions;
        List<String> list2 = C25271y.f99162w;
        if (list == null) {
            list = list2;
        }
        List<String> list3 = this.trainingTypes;
        if (list3 == null) {
            list3 = list2;
        }
        String str13 = str5;
        List<String> list4 = this.muscleGroups;
        if (list4 != null) {
            list2 = list4;
        }
        String str14 = this.translatedMuscleGroups;
        String str15 = str14 != null ? str14 : "";
        Boolean bool = this.deleted;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        String str16 = this.createdAt;
        String str17 = this.updatedAt;
        String str18 = this.volumeInputFormat;
        VolumeInputFormat volumeInputFormat2 = VolumeInputFormat.Reps;
        VolumeInputFormat[] volumeInputFormatArrValues = VolumeInputFormat.values();
        int length3 = volumeInputFormatArrValues.length;
        int i15 = 0;
        while (true) {
            if (i15 >= length3) {
                volumeInputFormat = null;
                break;
            }
            volumeInputFormat = volumeInputFormatArrValues[i15];
            int i16 = i15;
            if (AbstractC22676k.m65745e(volumeInputFormat.getSerializedValue(), str18)) {
                break;
            }
            i15 = i16 + 1;
        }
        if (volumeInputFormat != null) {
            volumeInputFormat2 = volumeInputFormat;
        }
        CustomExerciseInfoDto customExerciseInfoDto = this.customExerciseInfo;
        return new WeightliftingExercise(str, str2, str3, z4, exerciseEquipment2, str13, str6, exerciseLaterality3, str8, str11, str10, str12, list, list3, list2, str15, zBooleanValue, str16, str17, volumeInputFormat2, customExerciseInfoDto != null ? CustomExerciseDtoKt.toDomain(customExerciseInfoDto) : null);
    }

    public WeightliftingExerciseDto(String exerciseId, String name, String pushCoreName, boolean z4, String equipment, String str, String exerciseType, String laterality, String movementPattern, String str2, String str3, String str4, List<String> list, List<String> list2, List<String> list3, String str5, Boolean bool, String createdAt, String updatedAt, String str6, CustomExerciseInfoDto customExerciseInfoDto, String str7, String str8) {
        AbstractC22676k.m65750j(exerciseId, "exerciseId");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(pushCoreName, "pushCoreName");
        AbstractC22676k.m65750j(equipment, "equipment");
        AbstractC22676k.m65750j(exerciseType, "exerciseType");
        AbstractC22676k.m65750j(laterality, "laterality");
        AbstractC22676k.m65750j(movementPattern, "movementPattern");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        this.exerciseId = exerciseId;
        this.name = name;
        this.pushCoreName = pushCoreName;
        this.trackable = z4;
        this.equipment = equipment;
        this.translatedEquipment = str;
        this.exerciseType = exerciseType;
        this.laterality = laterality;
        this.movementPattern = movementPattern;
        this.translatedMovementPattern = str2;
        this.imageUrl = str3;
        this.videoUrl = str4;
        this.instructions = list;
        this.trainingTypes = list2;
        this.muscleGroups = list3;
        this.translatedMuscleGroups = str5;
        this.deleted = bool;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.volumeInputFormat = str6;
        this.customExerciseInfo = customExerciseInfoDto;
        this.volumeInputUnit = str7;
        this.volumeInputValue = str8;
    }

    public /* synthetic */ WeightliftingExerciseDto(String str, String str2, String str3, boolean z4, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, List list2, List list3, String str12, Boolean bool, String str13, String str14, String str15, CustomExerciseInfoDto customExerciseInfoDto, String str16, String str17, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, z4, str4, (i13 & 32) != 0 ? null : str5, str6, str7, str8, (i13 & 512) != 0 ? null : str9, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str10, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str11, (i13 & 4096) != 0 ? null : list, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : list2, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : list3, (32768 & i13) != 0 ? null : str12, (65536 & i13) != 0 ? null : bool, (131072 & i13) != 0 ? "" : str13, (262144 & i13) != 0 ? "" : str14, (524288 & i13) != 0 ? null : str15, customExerciseInfoDto, (2097152 & i13) != 0 ? null : str16, (i13 & 4194304) != 0 ? null : str17);
    }
}
