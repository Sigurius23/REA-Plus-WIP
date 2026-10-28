.class final Lf01/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0082\u0008\u0018\u00002\u00020\u0001BC\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0008\u0012\u0006\u0010\u000c\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u0019\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001c\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010&R\u0017\u0010\n\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\u001d\u001a\u0004\u0008\'\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\'\u0010$\u001a\u0004\u0008#\u0010&R\u0017\u0010\u000c\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008%\u0010\u001d\u001a\u0004\u0008\u001f\u0010\u001e\u00a8\u0006("
    }
    d2 = {
        "Lf01/i;",
        "",
        "Li2/t;",
        "backgroundBrush",
        "Li2/x;",
        "backgroundColor",
        "Lf0/t;",
        "border",
        "Lb91/a;",
        "titleStyle",
        "titleColor",
        "bodyStyle",
        "bodyColor",
        "<init>",
        "(Li2/t;JLf0/t;Lb91/a;JLb91/a;JLkotlin/jvm/internal/DefaultConstructorMarker;)V",
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
        "Li2/t;",
        "()Li2/t;",
        "b",
        "J",
        "()J",
        "c",
        "Lf0/t;",
        "e",
        "()Lf0/t;",
        "d",
        "Lb91/a;",
        "g",
        "()Lb91/a;",
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
.field private final a:Li2/t;

.field private final b:J

.field private final c:Lf0/t;

.field private final d:Lb91/a;

.field private final e:J

.field private final f:Lb91/a;

.field private final g:J


# direct methods
.method private constructor <init>(Li2/t;JLf0/t;Lb91/a;JLb91/a;J)V
    .locals 1

    const-string v0, "titleStyle"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bodyStyle"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lf01/i;->a:Li2/t;

    .line 4
    iput-wide p2, p0, Lf01/i;->b:J

    .line 5
    iput-object p4, p0, Lf01/i;->c:Lf0/t;

    .line 6
    iput-object p5, p0, Lf01/i;->d:Lb91/a;

    .line 7
    iput-wide p6, p0, Lf01/i;->e:J

    .line 8
    iput-object p8, p0, Lf01/i;->f:Lb91/a;

    .line 9
    iput-wide p9, p0, Lf01/i;->g:J

    return-void
.end method

.method public synthetic constructor <init>(Li2/t;JLf0/t;Lb91/a;JLb91/a;JLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p10}, Lf01/i;-><init>(Li2/t;JLf0/t;Lb91/a;JLb91/a;J)V

    return-void
.end method


# virtual methods
.method public final a()Li2/t;
    .locals 1

    iget-object v0, p0, Lf01/i;->a:Li2/t;

    return-object v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Lf01/i;->b:J

    return-wide v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Lf01/i;->g:J

    return-wide v0
.end method

.method public final d()Lb91/a;
    .locals 1

    iget-object v0, p0, Lf01/i;->f:Lb91/a;

    return-object v0
.end method

.method public final e()Lf0/t;
    .locals 1

    iget-object v0, p0, Lf01/i;->c:Lf0/t;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lf01/i;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lf01/i;

    iget-object v1, p0, Lf01/i;->a:Li2/t;

    iget-object v3, p1, Lf01/i;->a:Li2/t;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lf01/i;->b:J

    iget-wide v5, p1, Lf01/i;->b:J

    invoke-static {v3, v4, v5, v6}, Li2/x;->d(JJ)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lf01/i;->c:Lf0/t;

    iget-object v3, p1, Lf01/i;->c:Lf0/t;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lf01/i;->d:Lb91/a;

    iget-object v3, p1, Lf01/i;->d:Lb91/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lf01/i;->e:J

    iget-wide v5, p1, Lf01/i;->e:J

    invoke-static {v3, v4, v5, v6}, Li2/x;->d(JJ)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lf01/i;->f:Lb91/a;

    iget-object v3, p1, Lf01/i;->f:Lb91/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-wide v3, p0, Lf01/i;->g:J

    iget-wide v5, p1, Lf01/i;->g:J

    invoke-static {v3, v4, v5, v6}, Li2/x;->d(JJ)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final f()J
    .locals 2

    iget-wide v0, p0, Lf01/i;->e:J

    return-wide v0
.end method

.method public final g()Lb91/a;
    .locals 1

    iget-object v0, p0, Lf01/i;->d:Lb91/a;

    return-object v0
.end method

.method public hashCode()I
    .locals 6

    iget-object v0, p0, Lf01/i;->a:Li2/t;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-wide v3, p0, Lf01/i;->b:J

    sget v5, Li2/x;->o:I

    invoke-static {v0, v3, v4, v2}, Ld;->e(IJI)I

    move-result v0

    iget-object v3, p0, Lf01/i;->c:Lf0/t;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lf0/t;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-object v1, p0, Lf01/i;->d:Lb91/a;

    invoke-static {v1, v0, v2}, Ldc/b;->c(Lb91/a;II)I

    move-result v0

    iget-wide v3, p0, Lf01/i;->e:J

    invoke-static {v0, v3, v4, v2}, Ld;->e(IJI)I

    move-result v0

    iget-object v1, p0, Lf01/i;->f:Lb91/a;

    invoke-static {v1, v0, v2}, Ldc/b;->c(Lb91/a;II)I

    move-result v0

    iget-wide v1, p0, Lf01/i;->g:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lf01/i;->a:Li2/t;

    iget-wide v1, p0, Lf01/i;->b:J

    invoke-static {v1, v2}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lf01/i;->c:Lf0/t;

    iget-object v3, p0, Lf01/i;->d:Lb91/a;

    iget-wide v4, p0, Lf01/i;->e:J

    invoke-static {v4, v5}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lf01/i;->f:Lb91/a;

    iget-wide v6, p0, Lf01/i;->g:J

    invoke-static {v6, v7}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "ButtonCardAppearance(backgroundBrush="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", backgroundColor="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", border="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", titleStyle="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", titleColor="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", bodyStyle="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bodyColor="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v6, v0, v7}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
