.class public final Lmh/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lnh/i;

.field public final b:Lnh/g;

.field public final c:Lph/e;

.field public final d:Lnh/d;

.field public final e:Ljava/lang/Boolean;

.field public final f:Lmh/b;


# direct methods
.method public constructor <init>(Lnh/i;Lnh/g;Lph/e;Lnh/d;Ljava/lang/Boolean;Lmh/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmh/d;->a:Lnh/i;

    iput-object p2, p0, Lmh/d;->b:Lnh/g;

    iput-object p3, p0, Lmh/d;->c:Lph/e;

    iput-object p4, p0, Lmh/d;->d:Lnh/d;

    iput-object p5, p0, Lmh/d;->e:Ljava/lang/Boolean;

    iput-object p6, p0, Lmh/d;->f:Lmh/b;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lmh/d;

    if-eqz v1, :cond_1

    check-cast p1, Lmh/d;

    iget-object v1, p0, Lmh/d;->a:Lnh/i;

    iget-object v2, p1, Lmh/d;->a:Lnh/i;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lmh/d;->b:Lnh/g;

    iget-object v2, p1, Lmh/d;->b:Lnh/g;

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lmh/d;->c:Lph/e;

    iget-object v2, p1, Lmh/d;->c:Lph/e;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lmh/d;->d:Lnh/d;

    iget-object v2, p1, Lmh/d;->d:Lnh/d;

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lmh/d;->e:Ljava/lang/Boolean;

    iget-object v2, p1, Lmh/d;->e:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lmh/d;->f:Lmh/b;

    iget-object p1, p1, Lmh/d;->f:Lmh/b;

    if-ne v1, p1, :cond_1

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lmh/d;->a:Lnh/i;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lmh/d;->b:Lnh/g;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v0

    :goto_1
    add-int/2addr v1, v2

    const v2, 0x1b4d89f

    mul-int/2addr v1, v2

    iget-object v2, p0, Lmh/d;->c:Lph/e;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_2

    :cond_2
    move v2, v0

    :goto_2
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lmh/d;->d:Lnh/d;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_3

    :cond_3
    move v2, v0

    :goto_3
    add-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x3c1

    iget-object v2, p0, Lmh/d;->e:Ljava/lang/Boolean;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_4

    :cond_4
    move v2, v0

    :goto_4
    add-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x3c1

    iget-object v2, p0, Lmh/d;->f:Lmh/b;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :cond_5
    add-int/2addr v1, v0

    mul-int/lit16 v1, v1, 0x3c1

    return v1
.end method
