package com.whoop.weightlifting.data.domain;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import cu2.AbstractC11128h;
import hc3.AbstractC17176i;
import java.util.ArrayList;
import java.util.List;
import jh3.AbstractC21702c;
import jp1.C21864p;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import or2.C28173j1;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yb3.AbstractC39414r;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(m65680d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u0087\u00012\u00020\u0001:\u0004\u0088\u0001\u0087\u0001BÕ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fBû\u0001\b\u0010\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001e\u0010$J\r\u0010%\u001a\u00020 ¢\u0006\u0004\b%\u0010&J\u001d\u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020 ¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010.J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010.J\u0010\u00101\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b5\u0010.J\u0010\u00106\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b6\u0010.J\u0010\u00107\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b9\u0010.J\u0010\u0010:\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b:\u0010.J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u0010.J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u0010.J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0016\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012HÆ\u0003¢\u0006\u0004\b?\u0010>J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012HÆ\u0003¢\u0006\u0004\b@\u0010>J\u0010\u0010A\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bA\u0010.J\u0010\u0010B\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bB\u00102J\u0010\u0010C\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bC\u0010.J\u0010\u0010D\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bD\u0010.J\u0010\u0010E\u001a\u00020\u001aHÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bG\u0010HJú\u0001\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÆ\u0001¢\u0006\u0004\bI\u0010JJ\u0010\u0010K\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bK\u0010.J\u0010\u0010L\u001a\u00020 HÖ\u0001¢\u0006\u0004\bL\u0010&J\u001a\u0010O\u001a\u00020\u00062\b\u0010N\u001a\u0004\u0018\u00010MHÖ\u0003¢\u0006\u0004\bO\u0010PJ'\u0010X\u001a\u00020*2\u0006\u0010Q\u001a\u00020\u00002\u0006\u0010S\u001a\u00020R2\u0006\u0010U\u001a\u00020TH\u0001¢\u0006\u0004\bV\u0010WR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010Y\u001a\u0004\bZ\u0010.R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010Y\u001a\u0004\b[\u0010.R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010Y\u001a\u0004\b\\\u0010.R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010]\u001a\u0004\b^\u00102R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010_\u0012\u0004\ba\u0010b\u001a\u0004\b`\u00104R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010Y\u001a\u0004\bc\u0010.R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010Y\u001a\u0004\bd\u0010.R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010e\u0012\u0004\bg\u0010b\u001a\u0004\bf\u00108R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010Y\u001a\u0004\bh\u0010.R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010Y\u001a\u0004\bi\u0010.R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010Y\u001a\u0004\bj\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010Y\u001a\u0004\bk\u0010.R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010l\u001a\u0004\bm\u0010>R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010l\u001a\u0004\bn\u0010>R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0015\u0010l\u001a\u0004\bo\u0010>R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010Y\u001a\u0004\bp\u0010.R\u0017\u0010\u0017\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010]\u001a\u0004\bq\u00102R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010Y\u001a\u0004\br\u0010.R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010Y\u001a\u0004\bs\u0010.R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010t\u001a\u0004\bu\u0010FR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010v\u001a\u0004\bw\u0010HR&\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bx\u0010l\u0012\u0004\bz\u0010b\u001a\u0004\by\u0010>R \u0010{\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b{\u0010]\u0012\u0004\b|\u0010b\u001a\u0004\b{\u00102R\"\u0010}\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b}\u0010Y\u0012\u0004\b\u007f\u0010b\u001a\u0004\b~\u0010.R*\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010l\u0012\u0005\b\u0082\u0001\u0010b\u001a\u0005\b\u0081\u0001\u0010>R\u0017\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0083\u00018F¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001¨\u0006\u0089\u0001"}, m65681d2 = {"Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "Landroid/os/Parcelable;", "", "exerciseId", "name", "pushCoreName", "", "trackable", "Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;", "equipment", "translatedEquipment", "exerciseType", "Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;", "laterality", "movementPattern", "translatedMovementPattern", "imageUrl", "videoUrl", "", "instructions", "trainingTypes", "muscleGroups", "translatedMuscleGroups", "deleted", "createdAt", "updatedAt", "Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;", "volumeInputFormat", "Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;", "customExerciseInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/weightlifting/data/domain/ExerciseEquipment;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/weightlifting/data/domain/ExerciseEquipment;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "()Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;", "component6", "component7", "component8", "()Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;", "component9", "component10", "component11", "component12", "component13", "()Ljava/util/List;", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "()Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;", "component21", "()Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/weightlifting/data/domain/ExerciseEquipment;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;)Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getExerciseId", "getName", "getPushCoreName", "Z", "getTrackable", "Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;", "getEquipment", "getEquipment$annotations", "()V", "getTranslatedEquipment", "getExerciseType", "Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;", "getLaterality", "getLaterality$annotations", "getMovementPattern", "getTranslatedMovementPattern", "getImageUrl", "getVideoUrl", "Ljava/util/List;", "getInstructions", "getTrainingTypes", "getMuscleGroups", "getTranslatedMuscleGroups", "getDeleted", "getCreatedAt", "getUpdatedAt", "Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;", "getVolumeInputFormat", "Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;", "getCustomExerciseInfo", "nameKeywords", "getNameKeywords", "getNameKeywords$annotations", "isCustomExercise", "isCustomExercise$annotations", "linkedExerciseId", "getLinkedExerciseId", "getLinkedExerciseId$annotations", "metadataKeywords", "getMetadataKeywords", "getMetadataKeywords$annotations", "Lcom/whoop/design/util/TextResource;", "getRepsWeightInfoText", "()Lcom/whoop/design/util/TextResource;", "repsWeightInfoText", "Companion", "$serializer", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WeightliftingExercise implements Parcelable {
    private static final InterfaceC23462h[] $childSerializers;
    private final String createdAt;
    private final CustomExerciseInfo customExerciseInfo;
    private final boolean deleted;
    private final ExerciseEquipment equipment;
    private final String exerciseId;
    private final String exerciseType;
    private final String imageUrl;
    private final List<String> instructions;
    private final boolean isCustomExercise;
    private final ExerciseLaterality laterality;
    private final String linkedExerciseId;
    private final List<String> metadataKeywords;
    private final String movementPattern;
    private final List<String> muscleGroups;
    private final String name;
    private final List<String> nameKeywords;
    private final String pushCoreName;
    private final boolean trackable;
    private final List<String> trainingTypes;
    private final String translatedEquipment;
    private final String translatedMovementPattern;
    private final String translatedMuscleGroups;
    private final String updatedAt;
    private final String videoUrl;
    private final VolumeInputFormat volumeInputFormat;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<WeightliftingExercise> CREATOR = new Creator();

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/data/domain/WeightliftingExercise$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WeightliftingExercise$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<WeightliftingExercise> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WeightliftingExercise createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z4 = false;
            if (parcel.readInt() != 0) {
                z4 = true;
            }
            ExerciseEquipment exerciseEquipmentValueOf = ExerciseEquipment.valueOf(parcel.readString());
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            ExerciseLaterality exerciseLateralityValueOf = ExerciseLaterality.valueOf(parcel.readString());
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
            boolean z13 = true;
            String string10 = parcel.readString();
            if (parcel.readInt() == 0) {
                z13 = false;
            }
            return new WeightliftingExercise(string, string2, string3, z4, exerciseEquipmentValueOf, string4, string5, exerciseLateralityValueOf, string6, string7, string8, string9, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, arrayListCreateStringArrayList3, string10, z13, parcel.readString(), parcel.readString(), VolumeInputFormat.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : CustomExerciseInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WeightliftingExercise[] newArray(int i13) {
            return new WeightliftingExercise[i13];
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C21864p(17)), null, null, AbstractC30060g.m92087G(enumC23463i, new C21864p(18)), null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C21864p(19)), AbstractC30060g.m92087G(enumC23463i, new C21864p(20)), AbstractC30060g.m92087G(enumC23463i, new C21864p(21)), null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C21864p(22)), null};
    }

    public /* synthetic */ WeightliftingExercise(int i13, String str, String str2, String str3, boolean z4, ExerciseEquipment exerciseEquipment, String str4, String str5, ExerciseLaterality exerciseLaterality, String str6, String str7, String str8, String str9, List list, List list2, List list3, String str10, boolean z13, String str11, String str12, VolumeInputFormat volumeInputFormat, CustomExerciseInfo customExerciseInfo, SerializationConstructorMarker serializationConstructorMarker) {
        LinkedExercise linkedExercise;
        if (62463 != (i13 & 62463)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 62463, WeightliftingExercise$$serializer.INSTANCE.getDescriptor());
        }
        this.exerciseId = str;
        this.name = str2;
        this.pushCoreName = str3;
        this.trackable = z4;
        this.equipment = exerciseEquipment;
        this.translatedEquipment = str4;
        this.exerciseType = str5;
        this.laterality = exerciseLaterality;
        this.movementPattern = str6;
        this.translatedMovementPattern = str7;
        String exerciseId = null;
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = str8;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.videoUrl = null;
        } else {
            this.videoUrl = str9;
        }
        this.instructions = list;
        this.trainingTypes = list2;
        this.muscleGroups = list3;
        this.translatedMuscleGroups = str10;
        if ((65536 & i13) == 0) {
            this.deleted = false;
        } else {
            this.deleted = z13;
        }
        if ((131072 & i13) == 0) {
            this.createdAt = "";
        } else {
            this.createdAt = str11;
        }
        if ((262144 & i13) == 0) {
            this.updatedAt = "";
        } else {
            this.updatedAt = str12;
        }
        this.volumeInputFormat = (524288 & i13) == 0 ? VolumeInputFormat.Reps : volumeInputFormat;
        if ((i13 & 1048576) == 0) {
            this.customExerciseInfo = null;
        } else {
            this.customExerciseInfo = customExerciseInfo;
        }
        this.nameKeywords = C28173j1.f113890a.m85285c().m125854h(str2);
        CustomExerciseInfo customExerciseInfo2 = this.customExerciseInfo;
        this.isCustomExercise = customExerciseInfo2 != null;
        if (customExerciseInfo2 != null && (linkedExercise = customExerciseInfo2.getLinkedExercise()) != null) {
            exerciseId = linkedExercise.getExerciseId();
        }
        this.linkedExerciseId = exerciseId;
        this.metadataKeywords = AbstractC25265s.m74129g1(AbstractC25265s.m74129g1(AbstractC25265s.m74129g1(AbstractC39414r.m125906y0(str4, new String[]{"_"}, 6), AbstractC39414r.m125906y0(str5, new String[]{"_"}, 6)), AbstractC39414r.m125906y0(exerciseLaterality.getSerializedValue(), new String[]{"_"}, 6)), AbstractC39414r.m125906y0(str7, new String[]{"_"}, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ExerciseEquipment.class), EnumsKt.createSimpleEnumSerializer("com.whoop.weightlifting.data.domain.ExerciseEquipment", ExerciseEquipment.values()), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ExerciseLaterality.class), EnumsKt.createSimpleEnumSerializer("com.whoop.weightlifting.data.domain.ExerciseLaterality", ExerciseLaterality.values()), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$2() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$3() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$4() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.weightlifting.data.domain.VolumeInputFormat", VolumeInputFormat.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WeightliftingExercise copy$default(WeightliftingExercise weightliftingExercise, String str, String str2, String str3, boolean z4, ExerciseEquipment exerciseEquipment, String str4, String str5, ExerciseLaterality exerciseLaterality, String str6, String str7, String str8, String str9, List list, List list2, List list3, String str10, boolean z13, String str11, String str12, VolumeInputFormat volumeInputFormat, CustomExerciseInfo customExerciseInfo, int i13, Object obj) {
        CustomExerciseInfo customExerciseInfo2;
        VolumeInputFormat volumeInputFormat2;
        String str13 = (i13 & 1) != 0 ? weightliftingExercise.exerciseId : str;
        String str14 = (i13 & 2) != 0 ? weightliftingExercise.name : str2;
        String str15 = (i13 & 4) != 0 ? weightliftingExercise.pushCoreName : str3;
        boolean z14 = (i13 & 8) != 0 ? weightliftingExercise.trackable : z4;
        ExerciseEquipment exerciseEquipment2 = (i13 & 16) != 0 ? weightliftingExercise.equipment : exerciseEquipment;
        String str16 = (i13 & 32) != 0 ? weightliftingExercise.translatedEquipment : str4;
        String str17 = (i13 & 64) != 0 ? weightliftingExercise.exerciseType : str5;
        ExerciseLaterality exerciseLaterality2 = (i13 & 128) != 0 ? weightliftingExercise.laterality : exerciseLaterality;
        String str18 = (i13 & 256) != 0 ? weightliftingExercise.movementPattern : str6;
        String str19 = (i13 & 512) != 0 ? weightliftingExercise.translatedMovementPattern : str7;
        String str20 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? weightliftingExercise.imageUrl : str8;
        String str21 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? weightliftingExercise.videoUrl : str9;
        List list4 = (i13 & 4096) != 0 ? weightliftingExercise.instructions : list;
        List list5 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? weightliftingExercise.trainingTypes : list2;
        String str22 = str13;
        List list6 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? weightliftingExercise.muscleGroups : list3;
        String str23 = (i13 & 32768) != 0 ? weightliftingExercise.translatedMuscleGroups : str10;
        boolean z15 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? weightliftingExercise.deleted : z13;
        String str24 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? weightliftingExercise.createdAt : str11;
        String str25 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? weightliftingExercise.updatedAt : str12;
        VolumeInputFormat volumeInputFormat3 = (i13 & 524288) != 0 ? weightliftingExercise.volumeInputFormat : volumeInputFormat;
        if ((i13 & 1048576) != 0) {
            volumeInputFormat2 = volumeInputFormat3;
            customExerciseInfo2 = weightliftingExercise.customExerciseInfo;
        } else {
            customExerciseInfo2 = customExerciseInfo;
            volumeInputFormat2 = volumeInputFormat3;
        }
        return weightliftingExercise.copy(str22, str14, str15, z14, exerciseEquipment2, str16, str17, exerciseLaterality2, str18, str19, str20, str21, list4, list5, list6, str23, z15, str24, str25, volumeInputFormat2, customExerciseInfo2);
    }

    public static /* synthetic */ void getEquipment$annotations() {
    }

    public static /* synthetic */ void getLaterality$annotations() {
    }

    public static /* synthetic */ void getLinkedExerciseId$annotations() {
    }

    public static /* synthetic */ void getMetadataKeywords$annotations() {
    }

    public static /* synthetic */ void getNameKeywords$annotations() {
    }

    public static /* synthetic */ void isCustomExercise$annotations() {
    }

    public static final /* synthetic */ void write$Self$weightlifting_release(WeightliftingExercise self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.exerciseId);
        output.encodeStringElement(serialDesc, 1, self.name);
        output.encodeStringElement(serialDesc, 2, self.pushCoreName);
        output.encodeBooleanElement(serialDesc, 3, self.trackable);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.equipment);
        output.encodeStringElement(serialDesc, 5, self.translatedEquipment);
        output.encodeStringElement(serialDesc, 6, self.exerciseType);
        output.encodeSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.laterality);
        output.encodeStringElement(serialDesc, 8, self.movementPattern);
        output.encodeStringElement(serialDesc, 9, self.translatedMovementPattern);
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.imageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, self.imageUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.videoUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, self.videoUrl);
        }
        output.encodeSerializableElement(serialDesc, 12, (InterfaceC37145j) interfaceC23462hArr[12].getValue(), self.instructions);
        output.encodeSerializableElement(serialDesc, 13, (InterfaceC37145j) interfaceC23462hArr[13].getValue(), self.trainingTypes);
        output.encodeSerializableElement(serialDesc, 14, (InterfaceC37145j) interfaceC23462hArr[14].getValue(), self.muscleGroups);
        output.encodeStringElement(serialDesc, 15, self.translatedMuscleGroups);
        if (output.shouldEncodeElementDefault(serialDesc, 16) || self.deleted) {
            output.encodeBooleanElement(serialDesc, 16, self.deleted);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 17) || !AbstractC22676k.m65745e(self.createdAt, "")) {
            output.encodeStringElement(serialDesc, 17, self.createdAt);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 18) || !AbstractC22676k.m65745e(self.updatedAt, "")) {
            output.encodeStringElement(serialDesc, 18, self.updatedAt);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 19) || self.volumeInputFormat != VolumeInputFormat.Reps) {
            output.encodeSerializableElement(serialDesc, 19, (InterfaceC37145j) interfaceC23462hArr[19].getValue(), self.volumeInputFormat);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 20) && self.customExerciseInfo == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 20, CustomExerciseInfo$$serializer.INSTANCE, self.customExerciseInfo);
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
    public final boolean getDeleted() {
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
    public final VolumeInputFormat getVolumeInputFormat() {
        return this.volumeInputFormat;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final CustomExerciseInfo getCustomExerciseInfo() {
        return this.customExerciseInfo;
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
    public final ExerciseEquipment getEquipment() {
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
    public final ExerciseLaterality getLaterality() {
        return this.laterality;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMovementPattern() {
        return this.movementPattern;
    }

    public final WeightliftingExercise copy(String exerciseId, String name, String pushCoreName, boolean trackable, ExerciseEquipment equipment, String translatedEquipment, String exerciseType, ExerciseLaterality laterality, String movementPattern, String translatedMovementPattern, String imageUrl, String videoUrl, List<String> instructions, List<String> trainingTypes, List<String> muscleGroups, String translatedMuscleGroups, boolean deleted, String createdAt, String updatedAt, VolumeInputFormat volumeInputFormat, CustomExerciseInfo customExerciseInfo) {
        AbstractC22676k.m65750j(exerciseId, "exerciseId");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(pushCoreName, "pushCoreName");
        AbstractC22676k.m65750j(equipment, "equipment");
        AbstractC22676k.m65750j(translatedEquipment, "translatedEquipment");
        AbstractC22676k.m65750j(exerciseType, "exerciseType");
        AbstractC22676k.m65750j(laterality, "laterality");
        AbstractC22676k.m65750j(movementPattern, "movementPattern");
        AbstractC22676k.m65750j(translatedMovementPattern, "translatedMovementPattern");
        AbstractC22676k.m65750j(instructions, "instructions");
        AbstractC22676k.m65750j(trainingTypes, "trainingTypes");
        AbstractC22676k.m65750j(muscleGroups, "muscleGroups");
        AbstractC22676k.m65750j(translatedMuscleGroups, "translatedMuscleGroups");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(volumeInputFormat, "volumeInputFormat");
        return new WeightliftingExercise(exerciseId, name, pushCoreName, trackable, equipment, translatedEquipment, exerciseType, laterality, movementPattern, translatedMovementPattern, imageUrl, videoUrl, instructions, trainingTypes, muscleGroups, translatedMuscleGroups, deleted, createdAt, updatedAt, volumeInputFormat, customExerciseInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeightliftingExercise)) {
            return false;
        }
        WeightliftingExercise weightliftingExercise = (WeightliftingExercise) other;
        return AbstractC22676k.m65745e(this.exerciseId, weightliftingExercise.exerciseId) && AbstractC22676k.m65745e(this.name, weightliftingExercise.name) && AbstractC22676k.m65745e(this.pushCoreName, weightliftingExercise.pushCoreName) && this.trackable == weightliftingExercise.trackable && this.equipment == weightliftingExercise.equipment && AbstractC22676k.m65745e(this.translatedEquipment, weightliftingExercise.translatedEquipment) && AbstractC22676k.m65745e(this.exerciseType, weightliftingExercise.exerciseType) && this.laterality == weightliftingExercise.laterality && AbstractC22676k.m65745e(this.movementPattern, weightliftingExercise.movementPattern) && AbstractC22676k.m65745e(this.translatedMovementPattern, weightliftingExercise.translatedMovementPattern) && AbstractC22676k.m65745e(this.imageUrl, weightliftingExercise.imageUrl) && AbstractC22676k.m65745e(this.videoUrl, weightliftingExercise.videoUrl) && AbstractC22676k.m65745e(this.instructions, weightliftingExercise.instructions) && AbstractC22676k.m65745e(this.trainingTypes, weightliftingExercise.trainingTypes) && AbstractC22676k.m65745e(this.muscleGroups, weightliftingExercise.muscleGroups) && AbstractC22676k.m65745e(this.translatedMuscleGroups, weightliftingExercise.translatedMuscleGroups) && this.deleted == weightliftingExercise.deleted && AbstractC22676k.m65745e(this.createdAt, weightliftingExercise.createdAt) && AbstractC22676k.m65745e(this.updatedAt, weightliftingExercise.updatedAt) && this.volumeInputFormat == weightliftingExercise.volumeInputFormat && AbstractC22676k.m65745e(this.customExerciseInfo, weightliftingExercise.customExerciseInfo);
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final CustomExerciseInfo getCustomExerciseInfo() {
        return this.customExerciseInfo;
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public final ExerciseEquipment getEquipment() {
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

    public final ExerciseLaterality getLaterality() {
        return this.laterality;
    }

    public final String getLinkedExerciseId() {
        return this.linkedExerciseId;
    }

    public final List<String> getMetadataKeywords() {
        return this.metadataKeywords;
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

    public final List<String> getNameKeywords() {
        return this.nameKeywords;
    }

    public final String getPushCoreName() {
        return this.pushCoreName;
    }

    public final TextResource getRepsWeightInfoText() {
        ExerciseEquipment exerciseEquipment = this.equipment;
        ExerciseEquipment exerciseEquipment2 = ExerciseEquipment.Dumbbell;
        if (exerciseEquipment == exerciseEquipment2 && this.laterality != ExerciseLaterality.Alternating) {
            return AbstractC8693b.m21277k(AbstractC11128h.f35389G0);
        }
        if (exerciseEquipment == exerciseEquipment2 && this.laterality == ExerciseLaterality.Alternating) {
            return AbstractC8693b.m21277k(AbstractC11128h.f35386F0);
        }
        ExerciseEquipment exerciseEquipment3 = ExerciseEquipment.BodyWeight;
        if (exerciseEquipment == exerciseEquipment3 && this.laterality == ExerciseLaterality.Alternating) {
            return AbstractC8693b.m21277k(AbstractC11128h.f35445Z);
        }
        if (exerciseEquipment == exerciseEquipment3 && this.laterality != ExerciseLaterality.Alternating) {
            return AbstractC8693b.m21277k(AbstractC11128h.f35449a0);
        }
        if (this.laterality == ExerciseLaterality.Alternating) {
            return AbstractC8693b.m21277k(AbstractC11128h.f35442Y);
        }
        return null;
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

    public final VolumeInputFormat getVolumeInputFormat() {
        return this.volumeInputFormat;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((this.laterality.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d((this.equipment.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.exerciseId.hashCode() * 31, 31, this.name), 31, this.pushCoreName), 31, this.trackable)) * 31, 31, this.translatedEquipment), 31, this.exerciseType)) * 31, 31, this.movementPattern), 31, this.translatedMovementPattern);
        String str = this.imageUrl;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.videoUrl;
        int iHashCode2 = (this.volumeInputFormat.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.instructions), 31, this.trainingTypes), 31, this.muscleGroups), 31, this.translatedMuscleGroups), 31, this.deleted), 31, this.createdAt), 31, this.updatedAt)) * 31;
        CustomExerciseInfo customExerciseInfo = this.customExerciseInfo;
        return iHashCode2 + (customExerciseInfo != null ? customExerciseInfo.hashCode() : 0);
    }

    /* JADX INFO: renamed from: isCustomExercise, reason: from getter */
    public final boolean getIsCustomExercise() {
        return this.isCustomExercise;
    }

    public String toString() {
        String str = this.exerciseId;
        String str2 = this.name;
        String str3 = this.pushCoreName;
        boolean z4 = this.trackable;
        ExerciseEquipment exerciseEquipment = this.equipment;
        String str4 = this.translatedEquipment;
        String str5 = this.exerciseType;
        ExerciseLaterality exerciseLaterality = this.laterality;
        String str6 = this.movementPattern;
        String str7 = this.translatedMovementPattern;
        String str8 = this.imageUrl;
        String str9 = this.videoUrl;
        List<String> list = this.instructions;
        List<String> list2 = this.trainingTypes;
        List<String> list3 = this.muscleGroups;
        String str10 = this.translatedMuscleGroups;
        boolean z13 = this.deleted;
        String str11 = this.createdAt;
        String str12 = this.updatedAt;
        VolumeInputFormat volumeInputFormat = this.volumeInputFormat;
        CustomExerciseInfo customExerciseInfo = this.customExerciseInfo;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("WeightliftingExercise(exerciseId=", str, ", name=", str2, ", pushCoreName=");
        AbstractC38963t7.m124390t(sbM32001t, str3, ", trackable=", z4, ", equipment=");
        sbM32001t.append(exerciseEquipment);
        sbM32001t.append(", translatedEquipment=");
        sbM32001t.append(str4);
        sbM32001t.append(", exerciseType=");
        sbM32001t.append(str5);
        sbM32001t.append(", laterality=");
        sbM32001t.append(exerciseLaterality);
        sbM32001t.append(", movementPattern=");
        AbstractC11266d.m30444B(sbM32001t, str6, ", translatedMovementPattern=", str7, ", imageUrl=");
        AbstractC11266d.m30444B(sbM32001t, str8, ", videoUrl=", str9, ", instructions=");
        AbstractC21702c.m61148s(sbM32001t, list, ", trainingTypes=", list2, ", muscleGroups=");
        AbstractC17176i.m48511m(", translatedMuscleGroups=", str10, ", deleted=", sbM32001t, list3);
        AbstractC38963t7.m124391u(sbM32001t, z13, ", createdAt=", str11, ", updatedAt=");
        sbM32001t.append(str12);
        sbM32001t.append(", volumeInputFormat=");
        sbM32001t.append(volumeInputFormat);
        sbM32001t.append(", customExerciseInfo=");
        sbM32001t.append(customExerciseInfo);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.exerciseId);
        dest.writeString(this.name);
        dest.writeString(this.pushCoreName);
        dest.writeInt(this.trackable ? 1 : 0);
        dest.writeString(this.equipment.name());
        dest.writeString(this.translatedEquipment);
        dest.writeString(this.exerciseType);
        dest.writeString(this.laterality.name());
        dest.writeString(this.movementPattern);
        dest.writeString(this.translatedMovementPattern);
        dest.writeString(this.imageUrl);
        dest.writeString(this.videoUrl);
        dest.writeStringList(this.instructions);
        dest.writeStringList(this.trainingTypes);
        dest.writeStringList(this.muscleGroups);
        dest.writeString(this.translatedMuscleGroups);
        dest.writeInt(this.deleted ? 1 : 0);
        dest.writeString(this.createdAt);
        dest.writeString(this.updatedAt);
        dest.writeString(this.volumeInputFormat.name());
        CustomExerciseInfo customExerciseInfo = this.customExerciseInfo;
        if (customExerciseInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            customExerciseInfo.writeToParcel(dest, flags);
        }
    }

    public WeightliftingExercise(String exerciseId, String name, String pushCoreName, boolean z4, ExerciseEquipment equipment, String translatedEquipment, String exerciseType, ExerciseLaterality laterality, String movementPattern, String translatedMovementPattern, String str, String str2, List<String> instructions, List<String> trainingTypes, List<String> muscleGroups, String translatedMuscleGroups, boolean z13, String createdAt, String updatedAt, VolumeInputFormat volumeInputFormat, CustomExerciseInfo customExerciseInfo) {
        LinkedExercise linkedExercise;
        AbstractC22676k.m65750j(exerciseId, "exerciseId");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(pushCoreName, "pushCoreName");
        AbstractC22676k.m65750j(equipment, "equipment");
        AbstractC22676k.m65750j(translatedEquipment, "translatedEquipment");
        AbstractC22676k.m65750j(exerciseType, "exerciseType");
        AbstractC22676k.m65750j(laterality, "laterality");
        AbstractC22676k.m65750j(movementPattern, "movementPattern");
        AbstractC22676k.m65750j(translatedMovementPattern, "translatedMovementPattern");
        AbstractC22676k.m65750j(instructions, "instructions");
        AbstractC22676k.m65750j(trainingTypes, "trainingTypes");
        AbstractC22676k.m65750j(muscleGroups, "muscleGroups");
        AbstractC22676k.m65750j(translatedMuscleGroups, "translatedMuscleGroups");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(volumeInputFormat, "volumeInputFormat");
        this.exerciseId = exerciseId;
        this.name = name;
        this.pushCoreName = pushCoreName;
        this.trackable = z4;
        this.equipment = equipment;
        this.translatedEquipment = translatedEquipment;
        this.exerciseType = exerciseType;
        this.laterality = laterality;
        this.movementPattern = movementPattern;
        this.translatedMovementPattern = translatedMovementPattern;
        this.imageUrl = str;
        this.videoUrl = str2;
        this.instructions = instructions;
        this.trainingTypes = trainingTypes;
        this.muscleGroups = muscleGroups;
        this.translatedMuscleGroups = translatedMuscleGroups;
        this.deleted = z13;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.volumeInputFormat = volumeInputFormat;
        this.customExerciseInfo = customExerciseInfo;
        this.nameKeywords = C28173j1.f113890a.m85285c().m125854h(name);
        this.isCustomExercise = customExerciseInfo != null;
        this.linkedExerciseId = (customExerciseInfo == null || (linkedExercise = customExerciseInfo.getLinkedExercise()) == null) ? null : linkedExercise.getExerciseId();
        this.metadataKeywords = AbstractC25265s.m74129g1(AbstractC25265s.m74129g1(AbstractC25265s.m74129g1(AbstractC39414r.m125906y0(translatedEquipment, new String[]{"_"}, 6), AbstractC39414r.m125906y0(exerciseType, new String[]{"_"}, 6)), AbstractC39414r.m125906y0(laterality.getSerializedValue(), new String[]{"_"}, 6)), AbstractC39414r.m125906y0(translatedMovementPattern, new String[]{"_"}, 6));
    }

    public /* synthetic */ WeightliftingExercise(String str, String str2, String str3, boolean z4, ExerciseEquipment exerciseEquipment, String str4, String str5, ExerciseLaterality exerciseLaterality, String str6, String str7, String str8, String str9, List list, List list2, List list3, String str10, boolean z13, String str11, String str12, VolumeInputFormat volumeInputFormat, CustomExerciseInfo customExerciseInfo, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, z4, exerciseEquipment, str4, str5, exerciseLaterality, str6, str7, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str8, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str9, list, list2, list3, str10, (65536 & i13) != 0 ? false : z13, (131072 & i13) != 0 ? "" : str11, (262144 & i13) != 0 ? "" : str12, (524288 & i13) != 0 ? VolumeInputFormat.Reps : volumeInputFormat, (i13 & 1048576) != 0 ? null : customExerciseInfo);
    }
}
