.class public final Lcom/whoop/coaching/sleepcoach/wizard/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008(\u0008\u0087\u0008\u0018\u00002\u00020\u0001By\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000f\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0082\u0001\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00062\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u001f\u001a\u0004\u0008 \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008$\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010%\u001a\u0004\u0008&\u0010\'R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010(\u001a\u0004\u0008)\u0010*R\u0017\u0010\n\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008+\u0010(\u001a\u0004\u0008,\u0010*R\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008-\u0010.\u001a\u0004\u0008/\u0010\u0019R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008/\u00100\u001a\u0004\u0008+\u00101R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008,\u00102\u001a\u0004\u0008-\u00103R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u00084\u00102\u001a\u0004\u00084\u00103R\u0017\u0010\u0012\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008)\u0010%\u001a\u0004\u00085\u0010\'R\u0017\u0010\u0013\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u00086\u0010\'\u00a8\u00067"
    }
    d2 = {
        "Lcom/whoop/coaching/sleepcoach/wizard/g;",
        "",
        "Lkp0/a;",
        "alarmType",
        "",
        "wakeWindowMinutes",
        "",
        "enabled",
        "Lorg/joda/time/LocalTime;",
        "wakeTime",
        "sleepTime",
        "",
        "recommendedTimeInBedString",
        "Lkp0/g;",
        "optimalSleepCalculation",
        "Llp0/l;",
        "optimalTimeInBedWindow",
        "tonightSleepWindow",
        "isWakeupTimeImpossible",
        "isSleepScheduleEnabled",
        "<init>",
        "(Lkp0/a;IZLorg/joda/time/LocalTime;Lorg/joda/time/LocalTime;Ljava/lang/String;Lkp0/g;Llp0/l;Llp0/l;ZZ)V",
        "a",
        "(Lkp0/a;IZLorg/joda/time/LocalTime;Lorg/joda/time/LocalTime;Ljava/lang/String;Lkp0/g;Llp0/l;Llp0/l;ZZ)Lcom/whoop/coaching/sleepcoach/wizard/g;",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lkp0/a;",
        "c",
        "()Lkp0/a;",
        "b",
        "I",
        "k",
        "Z",
        "d",
        "()Z",
        "Lorg/joda/time/LocalTime;",
        "j",
        "()Lorg/joda/time/LocalTime;",
        "e",
        "h",
        "f",
        "Ljava/lang/String;",
        "g",
        "Lkp0/g;",
        "()Lkp0/g;",
        "Llp0/l;",
        "()Llp0/l;",
        "i",
        "m",
        "l",
        "sleep-coach_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lkp0/a;

.field private final b:I

.field private final c:Z

.field private final d:Lorg/joda/time/LocalTime;

.field private final e:Lorg/joda/time/LocalTime;

.field private final f:Ljava/lang/String;

.field private final g:Lkp0/g;

.field private final h:Llp0/l;

.field private final i:Llp0/l;

.field private final j:Z

.field private final k:Z


# direct methods
.method public constructor <init>(Lkp0/a;IZLorg/joda/time/LocalTime;Lorg/joda/time/LocalTime;Ljava/lang/String;Lkp0/g;Llp0/l;Llp0/l;ZZ)V
    .locals 1

    const-string v0, "alarmType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wakeTime"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepTime"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recommendedTimeInBedString"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tonightSleepWindow"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->a:Lkp0/a;

    .line 3
    iput p2, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->b:I

    .line 4
    iput-boolean p3, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->c:Z

    .line 5
    iput-object p4, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->d:Lorg/joda/time/LocalTime;

    .line 6
    iput-object p5, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->e:Lorg/joda/time/LocalTime;

    .line 7
    iput-object p6, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->f:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->g:Lkp0/g;

    .line 9
    iput-object p8, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->h:Llp0/l;

    .line 10
    iput-object p9, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->i:Llp0/l;

    .line 11
    iput-boolean p10, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->j:Z

    .line 12
    iput-boolean p11, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->k:Z

    return-void
.end method

.method public synthetic constructor <init>(Lkp0/a;IZLorg/joda/time/LocalTime;Lorg/joda/time/LocalTime;Ljava/lang/String;Lkp0/g;Llp0/l;Llp0/l;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    .line 13
    sget-object p1, Lcom/whoop/coaching/sleepcoach/wizard/b;->q:Lcom/whoop/coaching/sleepcoach/wizard/b$a;

    invoke-virtual {p1}, Lcom/whoop/coaching/sleepcoach/wizard/b$a;->b()Lkp0/a;

    move-result-object p1

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    const/16 p2, 0x3c

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    const/4 p3, 0x1

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    .line 14
    invoke-virtual {p1}, Lkp0/a;->b()Lorg/joda/time/LocalTime;

    move-result-object p4

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    .line 15
    invoke-virtual {p1}, Lkp0/a;->b()Lorg/joda/time/LocalTime;

    move-result-object p5

    const/16 p13, 0x8

    invoke-virtual {p5, p13}, Lorg/joda/time/LocalTime;->minusHours(I)Lorg/joda/time/LocalTime;

    move-result-object p5

    const-string p13, "minusHours(...)"

    invoke-static {p5, p13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    .line 16
    const-string p6, "8:00"

    :cond_5
    and-int/lit8 p13, p12, 0x40

    const/4 v0, 0x0

    if-eqz p13, :cond_6

    move-object p7, v0

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    move-object p8, v0

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    .line 17
    sget-object p9, Llp0/l;->e:Llp0/l$a;

    invoke-virtual {p9}, Llp0/l$a;->a()Llp0/l;

    move-result-object p9

    :cond_8
    and-int/lit16 p13, p12, 0x200

    const/4 v0, 0x0

    if-eqz p13, :cond_9

    move p10, v0

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    move p13, v0

    move-object p11, p9

    move p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move p5, p3

    move-object p6, p4

    move-object p3, p1

    move p4, p2

    move-object p2, p0

    goto :goto_0

    :cond_a
    move p13, p11

    move p12, p10

    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 18
    :goto_0
    invoke-direct/range {p2 .. p13}, Lcom/whoop/coaching/sleepcoach/wizard/g;-><init>(Lkp0/a;IZLorg/joda/time/LocalTime;Lorg/joda/time/LocalTime;Ljava/lang/String;Lkp0/g;Llp0/l;Llp0/l;ZZ)V

    return-void
.end method

.method public static synthetic b(Lcom/whoop/coaching/sleepcoach/wizard/g;Lkp0/a;IZLorg/joda/time/LocalTime;Lorg/joda/time/LocalTime;Ljava/lang/String;Lkp0/g;Llp0/l;Llp0/l;ZZILjava/lang/Object;)Lcom/whoop/coaching/sleepcoach/wizard/g;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->a:Lkp0/a;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget p2, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->b:I

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-boolean p3, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->c:Z

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->d:Lorg/joda/time/LocalTime;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->e:Lorg/joda/time/LocalTime;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->f:Ljava/lang/String;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->g:Lkp0/g;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p8, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->h:Llp0/l;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->i:Llp0/l;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-boolean p10, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->j:Z

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-boolean p11, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->k:Z

    :cond_a
    move p12, p10

    move p13, p11

    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/whoop/coaching/sleepcoach/wizard/g;->a(Lkp0/a;IZLorg/joda/time/LocalTime;Lorg/joda/time/LocalTime;Ljava/lang/String;Lkp0/g;Llp0/l;Llp0/l;ZZ)Lcom/whoop/coaching/sleepcoach/wizard/g;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lkp0/a;IZLorg/joda/time/LocalTime;Lorg/joda/time/LocalTime;Ljava/lang/String;Lkp0/g;Llp0/l;Llp0/l;ZZ)Lcom/whoop/coaching/sleepcoach/wizard/g;
    .locals 13

    const-string v0, "alarmType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wakeTime"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepTime"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recommendedTimeInBedString"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tonightSleepWindow"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/coaching/sleepcoach/wizard/g;

    move-object v2, p1

    move v3, p2

    move/from16 v4, p3

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v11, p10

    move/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/whoop/coaching/sleepcoach/wizard/g;-><init>(Lkp0/a;IZLorg/joda/time/LocalTime;Lorg/joda/time/LocalTime;Ljava/lang/String;Lkp0/g;Llp0/l;Llp0/l;ZZ)V

    return-object v1
.end method

.method public final c()Lkp0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->a:Lkp0/a;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->c:Z

    return v0
.end method

.method public final e()Lkp0/g;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->g:Lkp0/g;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/coaching/sleepcoach/wizard/g;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/coaching/sleepcoach/wizard/g;

    iget-object v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->a:Lkp0/a;

    iget-object v3, p1, Lcom/whoop/coaching/sleepcoach/wizard/g;->a:Lkp0/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->b:I

    iget v3, p1, Lcom/whoop/coaching/sleepcoach/wizard/g;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->c:Z

    iget-boolean v3, p1, Lcom/whoop/coaching/sleepcoach/wizard/g;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->d:Lorg/joda/time/LocalTime;

    iget-object v3, p1, Lcom/whoop/coaching/sleepcoach/wizard/g;->d:Lorg/joda/time/LocalTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->e:Lorg/joda/time/LocalTime;

    iget-object v3, p1, Lcom/whoop/coaching/sleepcoach/wizard/g;->e:Lorg/joda/time/LocalTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->f:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/coaching/sleepcoach/wizard/g;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->g:Lkp0/g;

    iget-object v3, p1, Lcom/whoop/coaching/sleepcoach/wizard/g;->g:Lkp0/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->h:Llp0/l;

    iget-object v3, p1, Lcom/whoop/coaching/sleepcoach/wizard/g;->h:Llp0/l;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->i:Llp0/l;

    iget-object v3, p1, Lcom/whoop/coaching/sleepcoach/wizard/g;->i:Llp0/l;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->j:Z

    iget-boolean v3, p1, Lcom/whoop/coaching/sleepcoach/wizard/g;->j:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->k:Z

    iget-boolean p1, p1, Lcom/whoop/coaching/sleepcoach/wizard/g;->k:Z

    if-eq v1, p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final f()Llp0/l;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->h:Llp0/l;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final h()Lorg/joda/time/LocalTime;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->e:Lorg/joda/time/LocalTime;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->a:Lkp0/a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->b:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->c:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->d:Lorg/joda/time/LocalTime;

    invoke-virtual {v2}, Lorg/joda/time/LocalTime;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->e:Lorg/joda/time/LocalTime;

    invoke-virtual {v0}, Lorg/joda/time/LocalTime;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->f:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->g:Lkp0/g;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lkp0/g;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->h:Llp0/l;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Llp0/l;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->i:Llp0/l;

    invoke-virtual {v2}, Llp0/l;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->j:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->k:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final i()Llp0/l;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->i:Llp0/l;

    return-object v0
.end method

.method public final j()Lorg/joda/time/LocalTime;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->d:Lorg/joda/time/LocalTime;

    return-object v0
.end method

.method public final k()I
    .locals 1

    iget v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->b:I

    return v0
.end method

.method public final l()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->k:Z

    return v0
.end method

.method public final m()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->j:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->a:Lkp0/a;

    iget v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->b:I

    iget-boolean v2, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->c:Z

    iget-object v3, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->d:Lorg/joda/time/LocalTime;

    iget-object v4, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->e:Lorg/joda/time/LocalTime;

    iget-object v5, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->f:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->g:Lkp0/g;

    iget-object v7, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->h:Llp0/l;

    iget-object v8, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->i:Llp0/l;

    iget-boolean v9, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->j:Z

    iget-boolean v10, p0, Lcom/whoop/coaching/sleepcoach/wizard/g;->k:Z

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "SleepGraphViewState(alarmType="

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", wakeWindowMinutes="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", enabled="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", wakeTime="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sleepTime="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", recommendedTimeInBedString="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", optimalSleepCalculation="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", optimalTimeInBedWindow="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", tonightSleepWindow="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isWakeupTimeImpossible="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isSleepScheduleEnabled="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v11, v10, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
