.class public final Lc51/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u00002\u00020\u0001BC\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u0018\u001a\u0004\u0008\u0017\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u0018\u001a\u0004\u0008\u001e\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0018\u001a\u0004\u0008 \u0010\u001aR\u0017\u0010\n\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u0018\u001a\u0004\u0008\u001f\u0010\u001a\u00a8\u0006!"
    }
    d2 = {
        "Lc51/q;",
        "",
        "Lkotlin/time/Duration;",
        "easeInDuration",
        "",
        "percentTimeInColorPulse",
        "colorPulseAnimationDuration",
        "easeOutDuration",
        "Li2/x;",
        "positivePulseColor",
        "negativePulseColor",
        "<init>",
        "(JFJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "J",
        "b",
        "()J",
        "F",
        "e",
        "()F",
        "c",
        "d",
        "f",
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


# instance fields
.field private final a:J

.field private final b:F

.field private final c:J

.field private final d:J

.field private final e:J

.field private final f:J


# direct methods
.method private constructor <init>(JFJJJJ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lc51/q;->a:J

    .line 4
    iput p3, p0, Lc51/q;->b:F

    .line 5
    iput-wide p4, p0, Lc51/q;->c:J

    .line 6
    iput-wide p6, p0, Lc51/q;->d:J

    .line 7
    iput-wide p8, p0, Lc51/q;->e:J

    .line 8
    iput-wide p10, p0, Lc51/q;->f:J

    return-void
.end method

.method public synthetic constructor <init>(JFJJJJILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    and-int/lit8 v0, p12, 0x1

    if-eqz v0, :cond_0

    .line 9
    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const-wide v0, 0x3ffccccccccccccdL    # 1.8

    sget-object v2, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1, v2}, Lkotlin/time/DurationKt;->toDuration(DLkotlin/time/DurationUnit;)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    move-wide v0, p1

    :goto_0
    and-int/lit8 v2, p12, 0x2

    if-eqz v2, :cond_1

    const v2, 0x3f4ccccd    # 0.8f

    goto :goto_1

    :cond_1
    move v2, p3

    :goto_1
    and-int/lit8 v3, p12, 0x4

    if-eqz v3, :cond_2

    .line 10
    sget-object v3, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const-wide v3, 0x3ff4cccccccccccdL    # 1.3

    sget-object v5, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v3, v4, v5}, Lkotlin/time/DurationKt;->toDuration(DLkotlin/time/DurationUnit;)J

    move-result-wide v3

    goto :goto_2

    :cond_2
    move-wide/from16 v3, p4

    :goto_2
    and-int/lit8 v5, p12, 0x8

    if-eqz v5, :cond_3

    .line 11
    sget-object v5, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    sget-object v5, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    const/4 v6, 0x2

    invoke-static {v6, v5}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v5

    goto :goto_3

    :cond_3
    move-wide/from16 v5, p6

    :goto_3
    and-int/lit8 v7, p12, 0x10

    if-eqz v7, :cond_4

    const-wide v7, 0xff00f19fL

    .line 12
    invoke-static {v7, v8}, Li2/w0;->e(J)J

    move-result-wide v7

    goto :goto_4

    :cond_4
    move-wide/from16 v7, p8

    :goto_4
    and-int/lit8 v9, p12, 0x20

    if-eqz v9, :cond_5

    const-wide v9, 0xffffa722L

    .line 13
    invoke-static {v9, v10}, Li2/w0;->e(J)J

    move-result-wide v9

    goto :goto_5

    :cond_5
    move-wide/from16 v9, p10

    :goto_5
    const/4 v11, 0x0

    move-object p1, p0

    move-wide p2, v0

    move/from16 p4, v2

    move-wide/from16 p5, v3

    move-wide/from16 p7, v5

    move-wide/from16 p9, v7

    move-wide/from16 p11, v9

    move-object/from16 p13, v11

    .line 14
    invoke-direct/range {p1 .. p13}, Lc51/q;-><init>(JFJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(JFJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p11}, Lc51/q;-><init>(JFJJJJ)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-wide v0, p0, Lc51/q;->c:J

    return-wide v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Lc51/q;->a:J

    return-wide v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Lc51/q;->d:J

    return-wide v0
.end method

.method public final d()J
    .locals 2

    iget-wide v0, p0, Lc51/q;->f:J

    return-wide v0
.end method

.method public final e()F
    .locals 1

    iget v0, p0, Lc51/q;->b:F

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lc51/q;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lc51/q;

    iget-wide v3, p0, Lc51/q;->a:J

    iget-wide v5, p1, Lc51/q;->a:J

    invoke-static {v3, v4, v5, v6}, Lkotlin/time/Duration;->equals-impl0(JJ)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lc51/q;->b:F

    iget v3, p1, Lc51/q;->b:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lc51/q;->c:J

    iget-wide v5, p1, Lc51/q;->c:J

    invoke-static {v3, v4, v5, v6}, Lkotlin/time/Duration;->equals-impl0(JJ)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lc51/q;->d:J

    iget-wide v5, p1, Lc51/q;->d:J

    invoke-static {v3, v4, v5, v6}, Lkotlin/time/Duration;->equals-impl0(JJ)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lc51/q;->e:J

    iget-wide v5, p1, Lc51/q;->e:J

    invoke-static {v3, v4, v5, v6}, Li2/x;->d(JJ)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lc51/q;->f:J

    iget-wide v5, p1, Lc51/q;->f:J

    invoke-static {v3, v4, v5, v6}, Li2/x;->d(JJ)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()J
    .locals 2

    iget-wide v0, p0, Lc51/q;->e:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 5

    iget-wide v0, p0, Lc51/q;->a:J

    invoke-static {v0, v1}, Lkotlin/time/Duration;->hashCode-impl(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lc51/q;->b:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-wide v2, p0, Lc51/q;->c:J

    invoke-static {v2, v3}, Lkotlin/time/Duration;->hashCode-impl(J)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-wide v3, p0, Lc51/q;->d:J

    invoke-static {v3, v4}, Lkotlin/time/Duration;->hashCode-impl(J)I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lc51/q;->e:J

    sget v4, Li2/x;->o:I

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v1, p0, Lc51/q;->f:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-wide v0, p0, Lc51/q;->a:J

    invoke-static {v0, v1}, Lkotlin/time/Duration;->toString-impl(J)Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lc51/q;->b:F

    iget-wide v2, p0, Lc51/q;->c:J

    invoke-static {v2, v3}, Lkotlin/time/Duration;->toString-impl(J)Ljava/lang/String;

    move-result-object v2

    iget-wide v3, p0, Lc51/q;->d:J

    invoke-static {v3, v4}, Lkotlin/time/Duration;->toString-impl(J)Ljava/lang/String;

    move-result-object v3

    iget-wide v4, p0, Lc51/q;->e:J

    invoke-static {v4, v5}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v4

    iget-wide v5, p0, Lc51/q;->f:J

    invoke-static {v5, v6}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "AmoebaTransitionSettings(easeInDuration="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", percentTimeInColorPulse="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", colorPulseAnimationDuration="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", easeOutDuration="

    const-string v1, ", positivePulseColor="

    invoke-static {v6, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", negativePulseColor="

    const-string v1, ")"

    invoke-static {v6, v4, v0, v5, v1}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
