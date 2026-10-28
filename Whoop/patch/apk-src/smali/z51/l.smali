.class public final Lz51/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008*\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u00c9\u0001\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0008\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0016\u0012\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0016\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010\"\u001a\u00020!H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u001a\u0010%\u001a\u00020\u00022\u0008\u0010$\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003\u00a2\u0006\u0004\u0008%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008+\u0010(\u001a\u0004\u0008,\u0010*R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008-\u0010(\u001a\u0004\u0008-\u0010*R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008.\u0010/\u001a\u0004\u00080\u00101R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00088\u0006\u00a2\u0006\u000c\n\u0004\u00080\u00102\u001a\u0004\u00083\u00104R\u0017\u0010\n\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u00083\u0010/\u001a\u0004\u00085\u00101R\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u00085\u00106\u001a\u0004\u00087\u00108R\u0017\u0010\u000e\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u00087\u00109\u001a\u0004\u0008:\u0010;R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008:\u00106\u001a\u0004\u0008<\u00108R\u0017\u0010\u0010\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008=\u0010/\u001a\u0004\u0008>\u00101R\u0017\u0010\u0011\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008)\u00106\u001a\u0004\u0008?\u00108R\u0017\u0010\u0012\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008,\u00106\u001a\u0004\u0008\'\u00108R\u0017\u0010\u0013\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008<\u0010/\u001a\u0004\u0008@\u00101R\u0017\u0010\u0014\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008>\u00106\u001a\u0004\u0008A\u00108R\u0017\u0010\u0015\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008?\u0010(\u001a\u0004\u0008B\u0010*R\u0017\u0010\u0017\u001a\u00020\u00168\u0006\u00a2\u0006\u000c\n\u0004\u0008@\u0010C\u001a\u0004\u0008D\u0010ER\u0017\u0010\u0018\u001a\u00020\u00168\u0006\u00a2\u0006\u000c\n\u0004\u0008A\u0010C\u001a\u0004\u0008F\u0010ER\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006\u00a2\u0006\u000c\n\u0004\u0008G\u0010H\u001a\u0004\u0008+\u0010IR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0006\u00a2\u0006\u000c\n\u0004\u0008J\u0010H\u001a\u0004\u0008=\u0010I\u00a8\u0006K"
    }
    d2 = {
        "Lz51/l;",
        "Lm91/u;",
        "",
        "showOptimalStrain",
        "showStrainWeeklyPlanGoal",
        "hasSleepPerformance",
        "",
        "optimalStrainPercent",
        "Ll83/k;",
        "optimalStrainRange",
        "recoveryPercent",
        "Lcom/whoop/design/util/TextResource;",
        "recoveryPercentText",
        "Lz51/k;",
        "recoveryType",
        "sleepPercentText",
        "strainScorePercent",
        "strainScoreText",
        "bonusTrendText",
        "strainWeeklyPlanGoalPercent",
        "strainWeeklyPlanGoalText",
        "displayGaugeOnly",
        "",
        "sharedIconClickedEvent",
        "gaugeClickedEvent",
        "Lz51/a;",
        "firstCustomGaugeEntryViewState",
        "secondCustomGaugeEntryViewState",
        "<init>",
        "(ZZZFLl83/k;FLcom/whoop/design/util/TextResource;Lz51/k;Lcom/whoop/design/util/TextResource;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FLcom/whoop/design/util/TextResource;ZLjava/lang/Object;Ljava/lang/Object;Lz51/a;Lz51/a;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Z",
        "k",
        "()Z",
        "b",
        "l",
        "c",
        "d",
        "F",
        "e",
        "()F",
        "Ll83/k;",
        "f",
        "()Ll83/k;",
        "g",
        "Lcom/whoop/design/util/TextResource;",
        "h",
        "()Lcom/whoop/design/util/TextResource;",
        "Lz51/k;",
        "i",
        "()Lz51/k;",
        "m",
        "j",
        "n",
        "o",
        "p",
        "q",
        "getDisplayGaugeOnly",
        "Ljava/lang/Object;",
        "getSharedIconClickedEvent",
        "()Ljava/lang/Object;",
        "getGaugeClickedEvent",
        "r",
        "Lz51/a;",
        "()Lz51/a;",
        "s",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final t:I = 0x8


# instance fields
.field private final a:Z

.field private final b:Z

.field private final c:Z

.field private final d:F

.field private final e:Ll83/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/k;"
        }
    .end annotation
.end field

.field private final f:F

.field private final g:Lcom/whoop/design/util/TextResource;

.field private final h:Lz51/k;

.field private final i:Lcom/whoop/design/util/TextResource;

.field private final j:F

.field private final k:Lcom/whoop/design/util/TextResource;

.field private final l:Lcom/whoop/design/util/TextResource;

.field private final m:F

.field private final n:Lcom/whoop/design/util/TextResource;

.field private final o:Z

.field private final p:Ljava/lang/Object;

.field private final q:Ljava/lang/Object;

.field private final r:Lz51/a;

.field private final s:Lz51/a;


# direct methods
.method public constructor <init>(ZZZFLl83/k;FLcom/whoop/design/util/TextResource;Lz51/k;Lcom/whoop/design/util/TextResource;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FLcom/whoop/design/util/TextResource;ZLjava/lang/Object;Ljava/lang/Object;Lz51/a;Lz51/a;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZZF",
            "Ll83/k;",
            "F",
            "Lcom/whoop/design/util/TextResource;",
            "Lz51/k;",
            "Lcom/whoop/design/util/TextResource;",
            "F",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "F",
            "Lcom/whoop/design/util/TextResource;",
            "Z",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Lz51/a;",
            "Lz51/a;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p7

    move-object/from16 v1, p8

    move-object/from16 v2, p9

    move-object/from16 v3, p11

    move-object/from16 v4, p12

    move-object/from16 v5, p14

    move-object/from16 v6, p16

    move-object/from16 v7, p17

    const-string v8, "optimalStrainRange"

    invoke-static {p5, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "recoveryPercentText"

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "recoveryType"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "sleepPercentText"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "strainScoreText"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "bonusTrendText"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "strainWeeklyPlanGoalText"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "sharedIconClickedEvent"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "gaugeClickedEvent"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lz51/l;->a:Z

    .line 3
    iput-boolean p2, p0, Lz51/l;->b:Z

    .line 4
    iput-boolean p3, p0, Lz51/l;->c:Z

    .line 5
    iput p4, p0, Lz51/l;->d:F

    .line 6
    iput-object p5, p0, Lz51/l;->e:Ll83/k;

    .line 7
    iput p6, p0, Lz51/l;->f:F

    .line 8
    iput-object v0, p0, Lz51/l;->g:Lcom/whoop/design/util/TextResource;

    .line 9
    iput-object v1, p0, Lz51/l;->h:Lz51/k;

    .line 10
    iput-object v2, p0, Lz51/l;->i:Lcom/whoop/design/util/TextResource;

    move/from16 p1, p10

    .line 11
    iput p1, p0, Lz51/l;->j:F

    .line 12
    iput-object v3, p0, Lz51/l;->k:Lcom/whoop/design/util/TextResource;

    .line 13
    iput-object v4, p0, Lz51/l;->l:Lcom/whoop/design/util/TextResource;

    move/from16 p1, p13

    .line 14
    iput p1, p0, Lz51/l;->m:F

    .line 15
    iput-object v5, p0, Lz51/l;->n:Lcom/whoop/design/util/TextResource;

    move/from16 p1, p15

    .line 16
    iput-boolean p1, p0, Lz51/l;->o:Z

    .line 17
    iput-object v6, p0, Lz51/l;->p:Ljava/lang/Object;

    .line 18
    iput-object v7, p0, Lz51/l;->q:Ljava/lang/Object;

    move-object/from16 p1, p18

    .line 19
    iput-object p1, p0, Lz51/l;->r:Lz51/a;

    move-object/from16 p1, p19

    .line 20
    iput-object p1, p0, Lz51/l;->s:Lz51/a;

    return-void
.end method

.method public synthetic constructor <init>(ZZZFLl83/k;FLcom/whoop/design/util/TextResource;Lz51/k;Lcom/whoop/design/util/TextResource;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FLcom/whoop/design/util/TextResource;ZLjava/lang/Object;Ljava/lang/Object;Lz51/a;Lz51/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 25

    move/from16 v0, p20

    const/4 v1, 0x0

    .line 21
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    and-int/lit8 v3, v0, 0x1

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    move v6, v4

    goto :goto_0

    :cond_0
    move/from16 v6, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    move v7, v4

    goto :goto_1

    :cond_1
    move/from16 v7, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    const/4 v3, 0x1

    move v8, v3

    goto :goto_2

    :cond_2
    move/from16 v8, p3

    :goto_2
    and-int/lit8 v3, v0, 0x8

    if-eqz v3, :cond_3

    move v9, v1

    goto :goto_3

    :cond_3
    move/from16 v9, p4

    :goto_3
    and-int/lit8 v3, v0, 0x10

    if-eqz v3, :cond_4

    new-instance v3, Ll83/k;

    invoke-direct {v3, v2, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v10, v3

    goto :goto_4

    :cond_4
    move-object/from16 v10, p5

    :goto_4
    and-int/lit16 v2, v0, 0x800

    if-eqz v2, :cond_5

    .line 22
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    move-object/from16 v17, v2

    goto :goto_5

    :cond_5
    move-object/from16 v17, p12

    :goto_5
    and-int/lit16 v2, v0, 0x1000

    if-eqz v2, :cond_6

    move/from16 v18, v1

    goto :goto_6

    :cond_6
    move/from16 v18, p13

    :goto_6
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_7

    .line 23
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move-object/from16 v19, v1

    goto :goto_7

    :cond_7
    move-object/from16 v19, p14

    :goto_7
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_8

    move/from16 v20, v4

    goto :goto_8

    :cond_8
    move/from16 v20, p15

    :goto_8
    const v1, 0x8000

    and-int/2addr v1, v0

    .line 24
    sget-object v2, Ll83/a0;->a:Ll83/a0;

    if-eqz v1, :cond_9

    move-object/from16 v21, v2

    goto :goto_9

    :cond_9
    move-object/from16 v21, p16

    :goto_9
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_a

    move-object/from16 v22, v2

    goto :goto_a

    :cond_a
    move-object/from16 v22, p17

    :goto_a
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    const/4 v2, 0x0

    if-eqz v1, :cond_b

    move-object/from16 v23, v2

    goto :goto_b

    :cond_b
    move-object/from16 v23, p18

    :goto_b
    const/high16 v1, 0x40000

    and-int/2addr v0, v1

    if-eqz v0, :cond_c

    move-object/from16 v24, v2

    :goto_c
    move-object/from16 v5, p0

    move/from16 v11, p6

    move-object/from16 v12, p7

    move-object/from16 v13, p8

    move-object/from16 v14, p9

    move/from16 v15, p10

    move-object/from16 v16, p11

    goto :goto_d

    :cond_c
    move-object/from16 v24, p19

    goto :goto_c

    :goto_d
    invoke-direct/range {v5 .. v24}, Lz51/l;-><init>(ZZZFLl83/k;FLcom/whoop/design/util/TextResource;Lz51/k;Lcom/whoop/design/util/TextResource;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FLcom/whoop/design/util/TextResource;ZLjava/lang/Object;Ljava/lang/Object;Lz51/a;Lz51/a;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lz51/l;->l:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final b()Lz51/a;
    .locals 1

    iget-object v0, p0, Lz51/l;->r:Lz51/a;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lz51/l;->c:Z

    return v0
.end method

.method public final e()F
    .locals 1

    iget v0, p0, Lz51/l;->d:F

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lz51/l;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lz51/l;

    iget-boolean v1, p0, Lz51/l;->a:Z

    iget-boolean v3, p1, Lz51/l;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lz51/l;->b:Z

    iget-boolean v3, p1, Lz51/l;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lz51/l;->c:Z

    iget-boolean v3, p1, Lz51/l;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lz51/l;->d:F

    iget v3, p1, Lz51/l;->d:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lz51/l;->e:Ll83/k;

    iget-object v3, p1, Lz51/l;->e:Ll83/k;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lz51/l;->f:F

    iget v3, p1, Lz51/l;->f:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lz51/l;->g:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lz51/l;->g:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lz51/l;->h:Lz51/k;

    iget-object v3, p1, Lz51/l;->h:Lz51/k;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lz51/l;->i:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lz51/l;->i:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lz51/l;->j:F

    iget v3, p1, Lz51/l;->j:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lz51/l;->k:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lz51/l;->k:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lz51/l;->l:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lz51/l;->l:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lz51/l;->m:F

    iget v3, p1, Lz51/l;->m:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lz51/l;->n:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lz51/l;->n:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-boolean v1, p0, Lz51/l;->o:Z

    iget-boolean v3, p1, Lz51/l;->o:Z

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lz51/l;->p:Ljava/lang/Object;

    iget-object v3, p1, Lz51/l;->p:Ljava/lang/Object;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lz51/l;->q:Ljava/lang/Object;

    iget-object v3, p1, Lz51/l;->q:Ljava/lang/Object;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lz51/l;->r:Lz51/a;

    iget-object v3, p1, Lz51/l;->r:Lz51/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lz51/l;->s:Lz51/a;

    iget-object p1, p1, Lz51/l;->s:Lz51/a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_14

    return v2

    :cond_14
    return v0
.end method

.method public final f()Ll83/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ll83/k;"
        }
    .end annotation

    iget-object v0, p0, Lz51/l;->e:Ll83/k;

    return-object v0
.end method

.method public final g()F
    .locals 1

    iget v0, p0, Lz51/l;->f:F

    return v0
.end method

.method public final h()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lz51/l;->g:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Lz51/l;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lz51/l;->b:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lz51/l;->c:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget v2, p0, Lz51/l;->d:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Lz51/l;->e:Ll83/k;

    invoke-virtual {v2}, Ll83/k;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Lz51/l;->f:F

    invoke-static {v0, v2, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Lz51/l;->g:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lz51/l;->h:Lz51/k;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lz51/l;->i:Lcom/whoop/design/util/TextResource;

    invoke-static {v2, v0, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget v2, p0, Lz51/l;->j:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Lz51/l;->k:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lz51/l;->l:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget v2, p0, Lz51/l;->m:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Lz51/l;->n:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-boolean v2, p0, Lz51/l;->o:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lz51/l;->p:Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lte0/d;->c(IILjava/lang/Object;)I

    move-result v0

    iget-object v2, p0, Lz51/l;->q:Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lte0/d;->c(IILjava/lang/Object;)I

    move-result v0

    iget-object v2, p0, Lz51/l;->r:Lz51/a;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lz51/a;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lz51/l;->s:Lz51/a;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lz51/a;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public final i()Lz51/k;
    .locals 1

    iget-object v0, p0, Lz51/l;->h:Lz51/k;

    return-object v0
.end method

.method public final j()Lz51/a;
    .locals 1

    iget-object v0, p0, Lz51/l;->s:Lz51/a;

    return-object v0
.end method

.method public final k()Z
    .locals 1

    iget-boolean v0, p0, Lz51/l;->a:Z

    return v0
.end method

.method public final l()Z
    .locals 1

    iget-boolean v0, p0, Lz51/l;->b:Z

    return v0
.end method

.method public final m()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lz51/l;->i:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final n()F
    .locals 1

    iget v0, p0, Lz51/l;->j:F

    return v0
.end method

.method public final o()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lz51/l;->k:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final p()F
    .locals 1

    iget v0, p0, Lz51/l;->m:F

    return v0
.end method

.method public final q()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lz51/l;->n:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 22

    move-object/from16 v0, p0

    iget-boolean v1, v0, Lz51/l;->a:Z

    iget-boolean v2, v0, Lz51/l;->b:Z

    iget-boolean v3, v0, Lz51/l;->c:Z

    iget v4, v0, Lz51/l;->d:F

    iget-object v5, v0, Lz51/l;->e:Ll83/k;

    iget v6, v0, Lz51/l;->f:F

    iget-object v7, v0, Lz51/l;->g:Lcom/whoop/design/util/TextResource;

    iget-object v8, v0, Lz51/l;->h:Lz51/k;

    iget-object v9, v0, Lz51/l;->i:Lcom/whoop/design/util/TextResource;

    iget v10, v0, Lz51/l;->j:F

    iget-object v11, v0, Lz51/l;->k:Lcom/whoop/design/util/TextResource;

    iget-object v12, v0, Lz51/l;->l:Lcom/whoop/design/util/TextResource;

    iget v13, v0, Lz51/l;->m:F

    iget-object v14, v0, Lz51/l;->n:Lcom/whoop/design/util/TextResource;

    iget-boolean v15, v0, Lz51/l;->o:Z

    move/from16 v16, v15

    iget-object v15, v0, Lz51/l;->p:Ljava/lang/Object;

    move-object/from16 v17, v15

    iget-object v15, v0, Lz51/l;->q:Ljava/lang/Object;

    move-object/from16 v18, v15

    iget-object v15, v0, Lz51/l;->r:Lz51/a;

    move-object/from16 v19, v15

    iget-object v15, v0, Lz51/l;->s:Lz51/a;

    const-string v0, ", showStrainWeeklyPlanGoal="

    move-object/from16 v20, v15

    const-string v15, ", hasSleepPerformance="

    move-object/from16 v21, v14

    const-string v14, "OverviewGaugeState(showOptimalStrain="

    invoke-static {v14, v0, v15, v1, v2}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", optimalStrainPercent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", optimalStrainRange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", recoveryPercent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", recoveryPercentText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", recoveryType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sleepPercentText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", strainScorePercent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", strainScoreText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", bonusTrendText="

    const-string v2, ", strainWeeklyPlanGoalPercent="

    invoke-static {v0, v11, v1, v12, v2}, Lq63/c;->y(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", strainWeeklyPlanGoalText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", displayGaugeOnly="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", sharedIconClickedEvent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", gaugeClickedEvent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", firstCustomGaugeEntryViewState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", secondCustomGaugeEntryViewState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
