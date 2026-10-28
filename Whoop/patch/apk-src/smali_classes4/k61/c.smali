.class public final Lk61/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0016\u0008\u0087\u0008\u0018\u00002\u00020\u0001BC\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0001\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0001\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJL\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u00c6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\n2\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00018\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00018\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u001d\u001a\u0004\u0008 \u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010!\u001a\u0004\u0008\u001f\u0010\"R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010#\u001a\u0004\u0008$\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010&\u001a\u0004\u0008\'\u0010(\u00a8\u0006)"
    }
    d2 = {
        "Lk61/c;",
        "",
        "Ly3/f;",
        "width",
        "cap",
        "join",
        "Li91/a;",
        "background",
        "Li2/x;",
        "scrubbedBackground",
        "",
        "isDashed",
        "<init>",
        "(FIILi91/a;JZLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "a",
        "(FIILi91/a;JZ)Lk61/c;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "F",
        "g",
        "()F",
        "b",
        "I",
        "d",
        "c",
        "e",
        "Li91/a;",
        "()Li91/a;",
        "J",
        "f",
        "()J",
        "Z",
        "h",
        "()Z",
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
.field private final a:F

.field private final b:I

.field private final c:I

.field private final d:Li91/a;

.field private final e:J

.field private final f:Z


# direct methods
.method private constructor <init>(FIILi91/a;JZ)V
    .locals 1

    const-string v0, "background"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lk61/c;->a:F

    .line 4
    iput p2, p0, Lk61/c;->b:I

    .line 5
    iput p3, p0, Lk61/c;->c:I

    .line 6
    iput-object p4, p0, Lk61/c;->d:Li91/a;

    .line 7
    iput-wide p5, p0, Lk61/c;->e:J

    .line 8
    iput-boolean p7, p0, Lk61/c;->f:Z

    return-void
.end method

.method public constructor <init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 v0, p8, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    int-to-float v0, v0

    goto :goto_0

    :cond_0
    move v0, p1

    :goto_0
    and-int/lit8 v1, p8, 0x2

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 v3, p8, 0x4

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    move v2, p3

    :goto_2
    and-int/lit8 v3, p8, 0x8

    if-eqz v3, :cond_3

    .line 9
    sget v3, Li2/x;->o:I

    .line 10
    sget-wide v3, Li2/x;->f:J

    .line 11
    invoke-static {v3, v4}, Li91/c;->o(J)Li91/a;

    move-result-object v3

    goto :goto_3

    :cond_3
    move-object v3, p4

    :goto_3
    and-int/lit8 v4, p8, 0x10

    if-eqz v4, :cond_4

    .line 12
    sget v4, Li2/x;->o:I

    .line 13
    sget-wide v4, Li2/x;->f:J

    goto :goto_4

    :cond_4
    move-wide v4, p5

    :goto_4
    and-int/lit8 v6, p8, 0x20

    if-eqz v6, :cond_5

    const/4 v6, 0x0

    goto :goto_5

    :cond_5
    move v6, p7

    :goto_5
    const/4 v7, 0x0

    move-object p1, p0

    move p2, v0

    move p3, v1

    move p4, v2

    move-object p5, v3

    move-wide p6, v4

    move/from16 p8, v6

    move-object/from16 p9, v7

    .line 14
    invoke-direct/range {p1 .. p9}, Lk61/c;-><init>(FIILi91/a;JZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(FIILi91/a;JZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Lk61/c;-><init>(FIILi91/a;JZ)V

    return-void
.end method

.method public static synthetic b(Lk61/c;FIILi91/a;JZILjava/lang/Object;)Lk61/c;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget p1, p0, Lk61/c;->a:F

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget p2, p0, Lk61/c;->b:I

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget p3, p0, Lk61/c;->c:I

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lk61/c;->d:Li91/a;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-wide p5, p0, Lk61/c;->e:J

    :cond_4
    and-int/lit8 p8, p8, 0x20

    if-eqz p8, :cond_5

    iget-boolean p7, p0, Lk61/c;->f:Z

    :cond_5
    move p9, p7

    move-wide p7, p5

    move p5, p3

    move-object p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p9}, Lk61/c;->a(FIILi91/a;JZ)Lk61/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(FIILi91/a;JZ)Lk61/c;
    .locals 10

    const-string v0, "background"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lk61/c;

    const/4 v9, 0x0

    move v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move-wide v6, p5

    move/from16 v8, p7

    invoke-direct/range {v1 .. v9}, Lk61/c;-><init>(FIILi91/a;JZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final c()Li91/a;
    .locals 1

    iget-object v0, p0, Lk61/c;->d:Li91/a;

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lk61/c;->b:I

    return v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lk61/c;->c:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lk61/c;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lk61/c;

    iget v0, p0, Lk61/c;->a:F

    iget v1, p1, Lk61/c;->a:F

    invoke-static {v0, v1}, Ly3/f;->b(FF)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    iget v0, p0, Lk61/c;->b:I

    iget v1, p1, Lk61/c;->b:I

    if-ne v0, v1, :cond_6

    iget v0, p0, Lk61/c;->c:I

    iget v1, p1, Lk61/c;->c:I

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lk61/c;->d:Li91/a;

    iget-object v1, p1, Lk61/c;->d:Li91/a;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    iget-wide v0, p0, Lk61/c;->e:J

    iget-wide v2, p1, Lk61/c;->e:J

    invoke-static {v0, v1, v2, v3}, Li2/x;->d(JJ)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    iget-boolean v0, p0, Lk61/c;->f:Z

    iget-boolean p1, p1, Lk61/c;->f:Z

    if-eq v0, p1, :cond_5

    goto :goto_1

    :cond_5
    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_6
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final f()J
    .locals 2

    iget-wide v0, p0, Lk61/c;->e:J

    return-wide v0
.end method

.method public final g()F
    .locals 1

    iget v0, p0, Lk61/c;->a:F

    return v0
.end method

.method public final h()Z
    .locals 1

    iget-boolean v0, p0, Lk61/c;->f:Z

    return v0
.end method

.method public hashCode()I
    .locals 5

    iget v0, p0, Lk61/c;->a:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lk61/c;->b:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lk61/c;->c:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lk61/c;->d:Li91/a;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-wide v3, p0, Lk61/c;->e:J

    sget v0, Li2/x;->o:I

    invoke-static {v2, v3, v4, v1}, Ld;->e(IJI)I

    move-result v0

    iget-boolean v1, p0, Lk61/c;->f:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget v0, p0, Lk61/c;->a:F

    invoke-static {v0}, Ly3/f;->c(F)Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lk61/c;->b:I

    const-string v2, "Unknown"

    const/4 v3, 0x2

    const-string v4, "Round"

    const/4 v5, 0x1

    if-nez v1, :cond_0

    const-string v1, "Butt"

    goto :goto_0

    :cond_0
    if-ne v1, v5, :cond_1

    move-object v1, v4

    goto :goto_0

    :cond_1
    if-ne v1, v3, :cond_2

    const-string v1, "Square"

    goto :goto_0

    :cond_2
    move-object v1, v2

    :goto_0
    iget v6, p0, Lk61/c;->c:I

    if-nez v6, :cond_3

    const-string v2, "Miter"

    goto :goto_1

    :cond_3
    if-ne v6, v5, :cond_4

    move-object v2, v4

    goto :goto_1

    :cond_4
    if-ne v6, v3, :cond_5

    const-string v2, "Bevel"

    :cond_5
    :goto_1
    iget-object v3, p0, Lk61/c;->d:Li91/a;

    iget-wide v4, p0, Lk61/c;->e:J

    invoke-static {v4, v5}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v4

    iget-boolean v5, p0, Lk61/c;->f:Z

    const-string v6, ", cap="

    const-string v7, ", join="

    const-string v8, "StrokeState(width="

    invoke-static {v8, v0, v6, v1, v7}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", background="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", scrubbedBackground="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isDashed="

    const-string v2, ")"

    invoke-static {v0, v4, v1, v5, v2}, Ljh3/c;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
