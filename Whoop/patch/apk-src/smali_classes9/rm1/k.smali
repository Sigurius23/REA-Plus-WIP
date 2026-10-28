.class public final Lrm1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0002\u0008\u0016\u0008\u0087\u0008\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\n2\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008!\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008\u001d\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010\'\u001a\u0004\u0008&\u0010(R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010)\u001a\u0004\u0008\u0019\u0010*\u00a8\u0006+"
    }
    d2 = {
        "Lrm1/k;",
        "Lm91/u;",
        "Lz51/l;",
        "overviewGaugeState",
        "Lmm1/k;",
        "welcomeCardItemState",
        "",
        "durationMillis",
        "",
        "delayMillis",
        "",
        "initialize",
        "Lrm1/c;",
        "animationState",
        "<init>",
        "(Lz51/l;Lmm1/k;IJZLrm1/c;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lz51/l;",
        "f",
        "()Lz51/l;",
        "b",
        "Lmm1/k;",
        "g",
        "()Lmm1/k;",
        "c",
        "I",
        "d",
        "J",
        "()J",
        "e",
        "Z",
        "()Z",
        "Lrm1/c;",
        "()Lrm1/c;",
        "home_release"
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
.field public static final g:I


# instance fields
.field private final a:Lz51/l;

.field private final b:Lmm1/k;

.field private final c:I

.field private final d:J

.field private final e:Z

.field private final f:Lrm1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lz51/l;->t:I

    sput v0, Lrm1/k;->g:I

    return-void
.end method

.method public constructor <init>(Lz51/l;Lmm1/k;IJZLrm1/c;)V
    .locals 1

    const-string v0, "overviewGaugeState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "welcomeCardItemState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "animationState"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lrm1/k;->a:Lz51/l;

    .line 3
    iput-object p2, p0, Lrm1/k;->b:Lmm1/k;

    .line 4
    iput p3, p0, Lrm1/k;->c:I

    .line 5
    iput-wide p4, p0, Lrm1/k;->d:J

    .line 6
    iput-boolean p6, p0, Lrm1/k;->e:Z

    .line 7
    iput-object p7, p0, Lrm1/k;->f:Lrm1/c;

    return-void
.end method

.method public synthetic constructor <init>(Lz51/l;Lmm1/k;IJZLrm1/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 v0, p8, 0x4

    if-eqz v0, :cond_0

    const/16 p3, 0x258

    :cond_0
    move v3, p3

    and-int/lit8 p3, p8, 0x8

    if-eqz p3, :cond_1

    const-wide/16 p4, 0x12c

    :cond_1
    move-wide v4, p4

    and-int/lit8 p3, p8, 0x10

    if-eqz p3, :cond_2

    const/4 p6, 0x0

    :cond_2
    move v6, p6

    and-int/lit8 p3, p8, 0x20

    if-eqz p3, :cond_3

    .line 8
    sget-object p3, Lrm1/c;->INITIAL:Lrm1/c;

    move-object v7, p3

    :goto_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    goto :goto_1

    :cond_3
    move-object v7, p7

    goto :goto_0

    .line 9
    :goto_1
    invoke-direct/range {v0 .. v7}, Lrm1/k;-><init>(Lz51/l;Lmm1/k;IJZLrm1/c;)V

    return-void
.end method


# virtual methods
.method public final a()Lrm1/c;
    .locals 1

    iget-object v0, p0, Lrm1/k;->f:Lrm1/c;

    return-object v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Lrm1/k;->d:J

    return-wide v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lrm1/k;->c:I

    return v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lrm1/k;->e:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lrm1/k;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lrm1/k;

    iget-object v1, p0, Lrm1/k;->a:Lz51/l;

    iget-object v3, p1, Lrm1/k;->a:Lz51/l;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lrm1/k;->b:Lmm1/k;

    iget-object v3, p1, Lrm1/k;->b:Lmm1/k;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lrm1/k;->c:I

    iget v3, p1, Lrm1/k;->c:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lrm1/k;->d:J

    iget-wide v5, p1, Lrm1/k;->d:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lrm1/k;->e:Z

    iget-boolean v3, p1, Lrm1/k;->e:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lrm1/k;->f:Lrm1/c;

    iget-object p1, p1, Lrm1/k;->f:Lrm1/c;

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()Lz51/l;
    .locals 1

    iget-object v0, p0, Lrm1/k;->a:Lz51/l;

    return-object v0
.end method

.method public final g()Lmm1/k;
    .locals 1

    iget-object v0, p0, Lrm1/k;->b:Lmm1/k;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lrm1/k;->a:Lz51/l;

    invoke-virtual {v0}, Lz51/l;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lrm1/k;->b:Lmm1/k;

    invoke-virtual {v2}, Lmm1/k;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Lrm1/k;->c:I

    invoke-static {v0, v2, v1}, Ld;->b(III)I

    move-result v0

    iget-wide v2, p0, Lrm1/k;->d:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-boolean v2, p0, Lrm1/k;->e:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lrm1/k;->f:Lrm1/c;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lrm1/k;->a:Lz51/l;

    iget-object v1, p0, Lrm1/k;->b:Lmm1/k;

    iget v2, p0, Lrm1/k;->c:I

    iget-wide v3, p0, Lrm1/k;->d:J

    iget-boolean v5, p0, Lrm1/k;->e:Z

    iget-object v6, p0, Lrm1/k;->f:Lrm1/c;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "DayOneWelcomeOverviewGaugeItemState(overviewGaugeState="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", welcomeCardItemState="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", durationMillis="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", delayMillis="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", initialize="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", animationState="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
