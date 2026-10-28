.class public final Landroidx/health/platform/client/proto/u;
.super Landroidx/health/platform/client/proto/u0;
.source "SourceFile"


# static fields
.field public static final AVG_FIELD_NUMBER:I = 0x12

.field public static final CLIENT_ID_FIELD_NUMBER:I = 0xb

.field public static final CLIENT_VERSION_FIELD_NUMBER:I = 0xc

.field public static final DATA_ORIGIN_FIELD_NUMBER:I = 0x5

.field public static final DATA_TYPE_FIELD_NUMBER:I = 0x1

.field private static final DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/u;

.field public static final DEVICE_FIELD_NUMBER:I = 0xd

.field public static final END_TIME_MILLIS_FIELD_NUMBER:I = 0xa

.field public static final END_ZONE_OFFSET_SECONDS_FIELD_NUMBER:I = 0x14

.field public static final INSTANT_TIME_MILLIS_FIELD_NUMBER:I = 0x8

.field public static final MAX_FIELD_NUMBER:I = 0x11

.field public static final MIN_FIELD_NUMBER:I = 0x10

.field public static final ORIGIN_SAMPLE_UID_FIELD_NUMBER:I = 0xe

.field public static final ORIGIN_SERIES_UID_FIELD_NUMBER:I = 0x4

.field private static volatile PARSER:Landroidx/health/platform/client/proto/s1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/health/platform/client/proto/s1;"
        }
    .end annotation
.end field

.field public static final RECORDING_METHOD_FIELD_NUMBER:I = 0x17

.field public static final SERIES_VALUES_FIELD_NUMBER:I = 0xf

.field public static final START_TIME_MILLIS_FIELD_NUMBER:I = 0x9

.field public static final START_ZONE_OFFSET_SECONDS_FIELD_NUMBER:I = 0x13

.field public static final SUB_TYPE_DATA_LISTS_FIELD_NUMBER:I = 0x16

.field public static final UID_FIELD_NUMBER:I = 0x3

.field public static final UPDATE_TIME_MILLIS_FIELD_NUMBER:I = 0x7

.field public static final VALUES_FIELD_NUMBER:I = 0x2

.field public static final ZONE_OFFSET_SECONDS_FIELD_NUMBER:I = 0x6


# instance fields
.field private avg_:Landroidx/health/platform/client/proto/m;

.field private bitField0_:I

.field private clientId_:Ljava/lang/String;

.field private clientVersion_:J

.field private dataOrigin_:Landroidx/health/platform/client/proto/o;

.field private dataType_:Landroidx/health/platform/client/proto/w;

.field private device_:Landroidx/health/platform/client/proto/y;

.field private endTimeMillis_:J

.field private endZoneOffsetSeconds_:I

.field private instantTimeMillis_:J

.field private max_:Landroidx/health/platform/client/proto/m;

.field private min_:Landroidx/health/platform/client/proto/m;

.field private originSampleUid_:Ljava/lang/String;

.field private originSeriesUid_:Ljava/lang/String;

.field private recordingMethod_:I

.field private seriesValues_:Landroidx/health/platform/client/proto/w0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/health/platform/client/proto/w0;"
        }
    .end annotation
.end field

.field private startTimeMillis_:J

.field private startZoneOffsetSeconds_:I

.field private subTypeDataLists_:Landroidx/health/platform/client/proto/j1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/health/platform/client/proto/j1;"
        }
    .end annotation
.end field

.field private uid_:Ljava/lang/String;

.field private updateTimeMillis_:J

.field private values_:Landroidx/health/platform/client/proto/j1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/health/platform/client/proto/j1;"
        }
    .end annotation
.end field

.field private zoneOffsetSeconds_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/health/platform/client/proto/u;

    invoke-direct {v0}, Landroidx/health/platform/client/proto/u;-><init>()V

    sput-object v0, Landroidx/health/platform/client/proto/u;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/u;

    const-class v1, Landroidx/health/platform/client/proto/u;

    invoke-static {v1, v0}, Landroidx/health/platform/client/proto/u0;->n(Ljava/lang/Class;Landroidx/health/platform/client/proto/u0;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/health/platform/client/proto/u0;-><init>()V

    sget-object v0, Landroidx/health/platform/client/proto/j1;->x:Landroidx/health/platform/client/proto/j1;

    iput-object v0, p0, Landroidx/health/platform/client/proto/u;->values_:Landroidx/health/platform/client/proto/j1;

    iput-object v0, p0, Landroidx/health/platform/client/proto/u;->subTypeDataLists_:Landroidx/health/platform/client/proto/j1;

    const-string v0, ""

    iput-object v0, p0, Landroidx/health/platform/client/proto/u;->uid_:Ljava/lang/String;

    iput-object v0, p0, Landroidx/health/platform/client/proto/u;->originSeriesUid_:Ljava/lang/String;

    iput-object v0, p0, Landroidx/health/platform/client/proto/u;->clientId_:Ljava/lang/String;

    iput-object v0, p0, Landroidx/health/platform/client/proto/u;->originSampleUid_:Ljava/lang/String;

    sget-object v0, Landroidx/health/platform/client/proto/z1;->z:Landroidx/health/platform/client/proto/z1;

    iput-object v0, p0, Landroidx/health/platform/client/proto/u;->seriesValues_:Landroidx/health/platform/client/proto/w0;

    return-void
.end method

.method public static A(Landroidx/health/platform/client/proto/u;J)V
    .locals 1

    iget v0, p0, Landroidx/health/platform/client/proto/u;->bitField0_:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, Landroidx/health/platform/client/proto/u;->bitField0_:I

    iput-wide p1, p0, Landroidx/health/platform/client/proto/u;->startTimeMillis_:J

    return-void
.end method

.method public static B(Landroidx/health/platform/client/proto/u;J)V
    .locals 1

    iget v0, p0, Landroidx/health/platform/client/proto/u;->bitField0_:I

    or-int/lit16 v0, v0, 0x100

    iput v0, p0, Landroidx/health/platform/client/proto/u;->bitField0_:I

    iput-wide p1, p0, Landroidx/health/platform/client/proto/u;->endTimeMillis_:J

    return-void
.end method

.method public static C(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Landroidx/health/platform/client/proto/u;->bitField0_:I

    or-int/lit16 v0, v0, 0x200

    iput v0, p0, Landroidx/health/platform/client/proto/u;->bitField0_:I

    iput-object p1, p0, Landroidx/health/platform/client/proto/u;->clientId_:Ljava/lang/String;

    return-void
.end method

.method public static D(Landroidx/health/platform/client/proto/u;J)V
    .locals 1

    iget v0, p0, Landroidx/health/platform/client/proto/u;->bitField0_:I

    or-int/lit16 v0, v0, 0x400

    iput v0, p0, Landroidx/health/platform/client/proto/u;->bitField0_:I

    iput-wide p1, p0, Landroidx/health/platform/client/proto/u;->clientVersion_:J

    return-void
.end method

.method public static E(Landroidx/health/platform/client/proto/u;Landroidx/health/platform/client/proto/y;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Landroidx/health/platform/client/proto/u;->device_:Landroidx/health/platform/client/proto/y;

    iget p1, p0, Landroidx/health/platform/client/proto/u;->bitField0_:I

    or-int/lit16 p1, p1, 0x800

    iput p1, p0, Landroidx/health/platform/client/proto/u;->bitField0_:I

    return-void
.end method

.method public static F(Landroidx/health/platform/client/proto/u;Landroidx/health/platform/client/proto/b0;)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Landroidx/health/platform/client/proto/u;->seriesValues_:Landroidx/health/platform/client/proto/w0;

    move-object v1, v0

    check-cast v1, Landroidx/health/platform/client/proto/b;

    iget-boolean v1, v1, Landroidx/health/platform/client/proto/b;->w:Z

    if-nez v1, :cond_0

    invoke-static {v0}, Landroidx/health/platform/client/proto/u0;->k(Landroidx/health/platform/client/proto/w0;)Landroidx/health/platform/client/proto/w0;

    move-result-object v0

    iput-object v0, p0, Landroidx/health/platform/client/proto/u;->seriesValues_:Landroidx/health/platform/client/proto/w0;

    :cond_0
    iget-object p0, p0, Landroidx/health/platform/client/proto/u;->seriesValues_:Landroidx/health/platform/client/proto/w0;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static K()Landroidx/health/platform/client/proto/u;
    .locals 1

    sget-object v0, Landroidx/health/platform/client/proto/u;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/u;

    return-object v0
.end method

.method public static e0()Landroidx/health/platform/client/proto/p;
    .locals 1

    sget-object v0, Landroidx/health/platform/client/proto/u;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/u;

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u0;->d()Landroidx/health/platform/client/proto/s0;

    move-result-object v0

    check-cast v0, Landroidx/health/platform/client/proto/p;

    return-object v0
.end method

.method public static p(Landroidx/health/platform/client/proto/u;I)V
    .locals 2

    iget v0, p0, Landroidx/health/platform/client/proto/u;->bitField0_:I

    const/high16 v1, 0x10000

    or-int/2addr v0, v1

    iput v0, p0, Landroidx/health/platform/client/proto/u;->bitField0_:I

    iput p1, p0, Landroidx/health/platform/client/proto/u;->startZoneOffsetSeconds_:I

    return-void
.end method

.method public static q(Landroidx/health/platform/client/proto/u;I)V
    .locals 2

    iget v0, p0, Landroidx/health/platform/client/proto/u;->bitField0_:I

    const/high16 v1, 0x20000

    or-int/2addr v0, v1

    iput v0, p0, Landroidx/health/platform/client/proto/u;->bitField0_:I

    iput p1, p0, Landroidx/health/platform/client/proto/u;->endZoneOffsetSeconds_:I

    return-void
.end method

.method public static r(Landroidx/health/platform/client/proto/u;)Landroidx/health/platform/client/proto/j1;
    .locals 2

    iget-object v0, p0, Landroidx/health/platform/client/proto/u;->subTypeDataLists_:Landroidx/health/platform/client/proto/j1;

    iget-boolean v1, v0, Landroidx/health/platform/client/proto/j1;->w:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/j1;->c()Landroidx/health/platform/client/proto/j1;

    move-result-object v0

    iput-object v0, p0, Landroidx/health/platform/client/proto/u;->subTypeDataLists_:Landroidx/health/platform/client/proto/j1;

    :cond_0
    iget-object p0, p0, Landroidx/health/platform/client/proto/u;->subTypeDataLists_:Landroidx/health/platform/client/proto/j1;

    return-object p0
.end method

.method public static s(Landroidx/health/platform/client/proto/u;I)V
    .locals 2

    iget v0, p0, Landroidx/health/platform/client/proto/u;->bitField0_:I

    const/high16 v1, 0x40000

    or-int/2addr v0, v1

    iput v0, p0, Landroidx/health/platform/client/proto/u;->bitField0_:I

    iput p1, p0, Landroidx/health/platform/client/proto/u;->recordingMethod_:I

    return-void
.end method

.method public static t(Landroidx/health/platform/client/proto/u;Landroidx/health/platform/client/proto/w;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Landroidx/health/platform/client/proto/u;->dataType_:Landroidx/health/platform/client/proto/w;

    iget p1, p0, Landroidx/health/platform/client/proto/u;->bitField0_:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Landroidx/health/platform/client/proto/u;->bitField0_:I

    return-void
.end method

.method public static u(Landroidx/health/platform/client/proto/u;)Landroidx/health/platform/client/proto/j1;
    .locals 2

    iget-object v0, p0, Landroidx/health/platform/client/proto/u;->values_:Landroidx/health/platform/client/proto/j1;

    iget-boolean v1, v0, Landroidx/health/platform/client/proto/j1;->w:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/j1;->c()Landroidx/health/platform/client/proto/j1;

    move-result-object v0

    iput-object v0, p0, Landroidx/health/platform/client/proto/u;->values_:Landroidx/health/platform/client/proto/j1;

    :cond_0
    iget-object p0, p0, Landroidx/health/platform/client/proto/u;->values_:Landroidx/health/platform/client/proto/j1;

    return-object p0
.end method

.method public static v(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Landroidx/health/platform/client/proto/u;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Landroidx/health/platform/client/proto/u;->bitField0_:I

    iput-object p1, p0, Landroidx/health/platform/client/proto/u;->uid_:Ljava/lang/String;

    return-void
.end method

.method public static w(Landroidx/health/platform/client/proto/u;Landroidx/health/platform/client/proto/o;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Landroidx/health/platform/client/proto/u;->dataOrigin_:Landroidx/health/platform/client/proto/o;

    iget p1, p0, Landroidx/health/platform/client/proto/u;->bitField0_:I

    or-int/lit8 p1, p1, 0x8

    iput p1, p0, Landroidx/health/platform/client/proto/u;->bitField0_:I

    return-void
.end method

.method public static x(Landroidx/health/platform/client/proto/u;I)V
    .locals 1

    iget v0, p0, Landroidx/health/platform/client/proto/u;->bitField0_:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Landroidx/health/platform/client/proto/u;->bitField0_:I

    iput p1, p0, Landroidx/health/platform/client/proto/u;->zoneOffsetSeconds_:I

    return-void
.end method

.method public static y(Landroidx/health/platform/client/proto/u;J)V
    .locals 1

    iget v0, p0, Landroidx/health/platform/client/proto/u;->bitField0_:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Landroidx/health/platform/client/proto/u;->bitField0_:I

    iput-wide p1, p0, Landroidx/health/platform/client/proto/u;->updateTimeMillis_:J

    return-void
.end method

.method public static z(Landroidx/health/platform/client/proto/u;J)V
    .locals 1

    iget v0, p0, Landroidx/health/platform/client/proto/u;->bitField0_:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Landroidx/health/platform/client/proto/u;->bitField0_:I

    iput-wide p1, p0, Landroidx/health/platform/client/proto/u;->instantTimeMillis_:J

    return-void
.end method


# virtual methods
.method public final G()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/health/platform/client/proto/u;->clientId_:Ljava/lang/String;

    return-object v0
.end method

.method public final H()J
    .locals 2

    iget-wide v0, p0, Landroidx/health/platform/client/proto/u;->clientVersion_:J

    return-wide v0
.end method

.method public final I()Landroidx/health/platform/client/proto/o;
    .locals 1

    iget-object v0, p0, Landroidx/health/platform/client/proto/u;->dataOrigin_:Landroidx/health/platform/client/proto/o;

    if-nez v0, :cond_0

    invoke-static {}, Landroidx/health/platform/client/proto/o;->r()Landroidx/health/platform/client/proto/o;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final J()Landroidx/health/platform/client/proto/w;
    .locals 1

    iget-object v0, p0, Landroidx/health/platform/client/proto/u;->dataType_:Landroidx/health/platform/client/proto/w;

    if-nez v0, :cond_0

    invoke-static {}, Landroidx/health/platform/client/proto/w;->q()Landroidx/health/platform/client/proto/w;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final L()Landroidx/health/platform/client/proto/y;
    .locals 1

    iget-object v0, p0, Landroidx/health/platform/client/proto/u;->device_:Landroidx/health/platform/client/proto/y;

    if-nez v0, :cond_0

    invoke-static {}, Landroidx/health/platform/client/proto/y;->s()Landroidx/health/platform/client/proto/y;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final M()J
    .locals 2

    iget-wide v0, p0, Landroidx/health/platform/client/proto/u;->endTimeMillis_:J

    return-wide v0
.end method

.method public final N()I
    .locals 1

    iget v0, p0, Landroidx/health/platform/client/proto/u;->endZoneOffsetSeconds_:I

    return v0
.end method

.method public final O()J
    .locals 2

    iget-wide v0, p0, Landroidx/health/platform/client/proto/u;->instantTimeMillis_:J

    return-wide v0
.end method

.method public final P()I
    .locals 1

    iget v0, p0, Landroidx/health/platform/client/proto/u;->recordingMethod_:I

    return v0
.end method

.method public final Q()Landroidx/health/platform/client/proto/w0;
    .locals 1

    iget-object v0, p0, Landroidx/health/platform/client/proto/u;->seriesValues_:Landroidx/health/platform/client/proto/w0;

    return-object v0
.end method

.method public final R()J
    .locals 2

    iget-wide v0, p0, Landroidx/health/platform/client/proto/u;->startTimeMillis_:J

    return-wide v0
.end method

.method public final S()I
    .locals 1

    iget v0, p0, Landroidx/health/platform/client/proto/u;->startZoneOffsetSeconds_:I

    return v0
.end method

.method public final T()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Landroidx/health/platform/client/proto/u;->subTypeDataLists_:Landroidx/health/platform/client/proto/j1;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final U()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/health/platform/client/proto/u;->uid_:Ljava/lang/String;

    return-object v0
.end method

.method public final V()J
    .locals 2

    iget-wide v0, p0, Landroidx/health/platform/client/proto/u;->updateTimeMillis_:J

    return-wide v0
.end method

.method public final W()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Landroidx/health/platform/client/proto/u;->values_:Landroidx/health/platform/client/proto/j1;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final X()I
    .locals 1

    iget v0, p0, Landroidx/health/platform/client/proto/u;->zoneOffsetSeconds_:I

    return v0
.end method

.method public final Y()Z
    .locals 1

    iget v0, p0, Landroidx/health/platform/client/proto/u;->bitField0_:I

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final Z()Z
    .locals 1

    iget v0, p0, Landroidx/health/platform/client/proto/u;->bitField0_:I

    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final a0()Z
    .locals 2

    iget v0, p0, Landroidx/health/platform/client/proto/u;->bitField0_:I

    const/high16 v1, 0x20000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final b0()Z
    .locals 2

    iget v0, p0, Landroidx/health/platform/client/proto/u;->bitField0_:I

    const/high16 v1, 0x10000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final c0()Z
    .locals 1

    iget v0, p0, Landroidx/health/platform/client/proto/u;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final d0()Z
    .locals 1

    iget v0, p0, Landroidx/health/platform/client/proto/u;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final e(I)Ljava/lang/Object;
    .locals 28

    invoke-static/range {p1 .. p1}, Le4/p;->e(I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    :pswitch_0
    sget-object v0, Landroidx/health/platform/client/proto/u;->PARSER:Landroidx/health/platform/client/proto/s1;

    if-nez v0, :cond_1

    const-class v1, Landroidx/health/platform/client/proto/u;

    monitor-enter v1

    :try_start_0
    sget-object v0, Landroidx/health/platform/client/proto/u;->PARSER:Landroidx/health/platform/client/proto/s1;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/health/platform/client/proto/t0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/health/platform/client/proto/u;->PARSER:Landroidx/health/platform/client/proto/s1;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v1

    return-object v0

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    return-object v0

    :pswitch_1
    sget-object v0, Landroidx/health/platform/client/proto/u;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/u;

    return-object v0

    :pswitch_2
    new-instance v0, Landroidx/health/platform/client/proto/p;

    sget-object v1, Landroidx/health/platform/client/proto/u;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/u;

    invoke-direct {v0, v1}, Landroidx/health/platform/client/proto/s0;-><init>(Landroidx/health/platform/client/proto/u0;)V

    return-object v0

    :pswitch_3
    new-instance v0, Landroidx/health/platform/client/proto/u;

    invoke-direct {v0}, Landroidx/health/platform/client/proto/u;-><init>()V

    return-object v0

    :pswitch_4
    const-string v2, "bitField0_"

    const-string v3, "dataType_"

    const-string v4, "values_"

    sget-object v5, Landroidx/health/platform/client/proto/t;->a:Landroidx/health/platform/client/proto/i1;

    const-string v6, "uid_"

    const-string v7, "originSeriesUid_"

    const-string v8, "dataOrigin_"

    const-string v9, "zoneOffsetSeconds_"

    const-string v10, "updateTimeMillis_"

    const-string v11, "instantTimeMillis_"

    const-string v12, "startTimeMillis_"

    const-string v13, "endTimeMillis_"

    const-string v14, "clientId_"

    const-string v15, "clientVersion_"

    const-string v16, "device_"

    const-string v17, "originSampleUid_"

    const-string v18, "seriesValues_"

    const-class v19, Landroidx/health/platform/client/proto/b0;

    const-string v20, "min_"

    const-string v21, "max_"

    const-string v22, "avg_"

    const-string v23, "startZoneOffsetSeconds_"

    const-string v24, "endZoneOffsetSeconds_"

    const-string v25, "subTypeDataLists_"

    sget-object v26, Landroidx/health/platform/client/proto/s;->a:Landroidx/health/platform/client/proto/i1;

    const-string v27, "recordingMethod_"

    filled-new-array/range {v2 .. v27}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "\u0001\u0016\u0000\u0001\u0001\u0017\u0016\u0002\u0001\u0000\u0001\u1009\u0000\u00022\u0003\u1008\u0001\u0004\u1008\u0002\u0005\u1009\u0003\u0006\u1004\u0004\u0007\u1002\u0005\u0008\u1002\u0006\t\u1002\u0007\n\u1002\u0008\u000b\u1008\t\u000c\u1002\n\r\u1009\u000b\u000e\u1008\u000c\u000f\u001b\u0010\u1009\r\u0011\u1009\u000e\u0012\u1009\u000f\u0013\u1004\u0010\u0014\u1004\u0011\u00162\u0017\u1004\u0012"

    sget-object v2, Landroidx/health/platform/client/proto/u;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/u;

    new-instance v3, Landroidx/health/platform/client/proto/a2;

    invoke-direct {v3, v2, v1, v0}, Landroidx/health/platform/client/proto/a2;-><init>(Landroidx/health/platform/client/proto/a;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v3

    :pswitch_5
    const/4 v0, 0x0

    return-object v0

    :pswitch_6
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
