.class public final Lc51/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u0018\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u001d\u001a\u0004\u0008 \u0010\u001eR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001d\u001a\u0004\u0008\u001f\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008\u001c\u0010#R\u0017\u0010\u000b\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010\u001d\u001a\u0004\u0008%\u0010\u001e\u00a8\u0006&"
    }
    d2 = {
        "Lc51/r;",
        "",
        "Lc51/p;",
        "type",
        "Lkotlin/time/Duration;",
        "easeInDuration",
        "easeOutDuration",
        "Li2/x;",
        "pulseColor",
        "",
        "percentTimeInColorPulse",
        "colorPulseAnimationDuration",
        "<init>",
        "(Lc51/p;JJJFJLkotlin/jvm/internal/DefaultConstructorMarker;)V",
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
        "Lc51/p;",
        "d",
        "()Lc51/p;",
        "b",
        "J",
        "()J",
        "c",
        "getEaseOutDuration-UwyO8pc",
        "e",
        "F",
        "()F",
        "f",
        "getColorPulseAnimationDuration-UwyO8pc",
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
.field private final a:Lc51/p;

.field private final b:J

.field private final c:J

.field private final d:J

.field private final e:F

.field private final f:J


# direct methods
.method private constructor <init>(Lc51/p;JJJFJ)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lc51/r;->a:Lc51/p;

    .line 4
    iput-wide p2, p0, Lc51/r;->b:J

    .line 5
    iput-wide p4, p0, Lc51/r;->c:J

    .line 6
    iput-wide p6, p0, Lc51/r;->d:J

    .line 7
    iput p8, p0, Lc51/r;->e:F

    .line 8
    iput-wide p9, p0, Lc51/r;->f:J

    return-void
.end method

.method public synthetic constructor <init>(Lc51/p;JJJFJLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p10}, Lc51/r;-><init>(Lc51/p;JJJFJ)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-wide v0, p0, Lc51/r;->b:J

    return-wide v0
.end method

.method public final b()F
    .locals 1

    iget v0, p0, Lc51/r;->e:F

    return v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Lc51/r;->d:J

    return-wide v0
.end method

.method public final d()Lc51/p;
    .locals 1

    iget-object v0, p0, Lc51/r;->a:Lc51/p;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lc51/r;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lc51/r;

    iget-object v1, p0, Lc51/r;->a:Lc51/p;

    iget-object v3, p1, Lc51/r;->a:Lc51/p;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lc51/r;->b:J

    iget-wide v5, p1, Lc51/r;->b:J

    invoke-static {v3, v4, v5, v6}, Lkotlin/time/Duration;->equals-impl0(JJ)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lc51/r;->c:J

    iget-wide v5, p1, Lc51/r;->c:J

    invoke-static {v3, v4, v5, v6}, Lkotlin/time/Duration;->equals-impl0(JJ)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lc51/r;->d:J

    iget-wide v5, p1, Lc51/r;->d:J

    invoke-static {v3, v4, v5, v6}, Li2/x;->d(JJ)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lc51/r;->e:F

    iget v3, p1, Lc51/r;->e:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lc51/r;->f:J

    iget-wide v5, p1, Lc51/r;->f:J

    invoke-static {v3, v4, v5, v6}, Lkotlin/time/Duration;->equals-impl0(JJ)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, Lc51/r;->a:Lc51/p;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lc51/r;->b:J

    invoke-static {v2, v3}, Lkotlin/time/Duration;->hashCode-impl(J)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-wide v3, p0, Lc51/r;->c:J

    invoke-static {v3, v4}, Lkotlin/time/Duration;->hashCode-impl(J)I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lc51/r;->d:J

    sget v4, Li2/x;->o:I

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget v2, p0, Lc51/r;->e:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-wide v1, p0, Lc51/r;->f:J

    invoke-static {v1, v2}, Lkotlin/time/Duration;->hashCode-impl(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lc51/r;->a:Lc51/p;

    iget-wide v1, p0, Lc51/r;->b:J

    invoke-static {v1, v2}, Lkotlin/time/Duration;->toString-impl(J)Ljava/lang/String;

    move-result-object v1

    iget-wide v2, p0, Lc51/r;->c:J

    invoke-static {v2, v3}, Lkotlin/time/Duration;->toString-impl(J)Ljava/lang/String;

    move-result-object v2

    iget-wide v3, p0, Lc51/r;->d:J

    invoke-static {v3, v4}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v3

    iget v4, p0, Lc51/r;->e:F

    iget-wide v5, p0, Lc51/r;->f:J

    invoke-static {v5, v6}, Lkotlin/time/Duration;->toString-impl(J)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "AmoebaTransitionViewState(type="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", easeInDuration="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", easeOutDuration="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", pulseColor="

    const-string v1, ", percentTimeInColorPulse="

    invoke-static {v6, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", colorPulseAnimationDuration="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
