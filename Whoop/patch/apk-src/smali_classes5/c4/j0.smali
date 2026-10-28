.class public final Lc4/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Z

.field public final c:Z

.field public final d:Z

.field public final e:Z


# direct methods
.method public synthetic constructor <init>(ZI)V
    .locals 1

    const/4 v0, 0x1

    and-int/2addr p2, v0

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, v0, v0, v0}, Lc4/j0;-><init>(ZZZZ)V

    return-void
.end method

.method public constructor <init>(ZZZLc4/k0;Z)V
    .locals 1

    .line 4
    sget-object v0, Lc4/r;->a:Lp1/b0;

    if-nez p1, :cond_0

    const p1, 0x40008

    goto :goto_0

    :cond_0
    const/high16 p1, 0x40000

    .line 5
    :goto_0
    sget-object v0, Lc4/k0;->x:Lc4/k0;

    if-ne p4, v0, :cond_1

    or-int/lit16 p1, p1, 0x2000

    :cond_1
    if-nez p5, :cond_2

    or-int/lit16 p1, p1, 0x200

    .line 6
    :cond_2
    sget-object p5, Lc4/k0;->w:Lc4/k0;

    const/4 v0, 0x1

    if-ne p4, p5, :cond_3

    move p4, v0

    goto :goto_1

    :cond_3
    const/4 p4, 0x0

    .line 7
    :goto_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput p1, p0, Lc4/j0;->a:I

    .line 9
    iput-boolean p4, p0, Lc4/j0;->b:Z

    .line 10
    iput-boolean p2, p0, Lc4/j0;->c:Z

    .line 11
    iput-boolean p3, p0, Lc4/j0;->d:Z

    .line 12
    iput-boolean v0, p0, Lc4/j0;->e:Z

    return-void
.end method

.method public constructor <init>(ZZZZ)V
    .locals 6

    .line 2
    sget-object v4, Lc4/k0;->w:Lc4/k0;

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v5, p4

    .line 3
    invoke-direct/range {v0 .. v5}, Lc4/j0;-><init>(ZZZLc4/k0;Z)V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lc4/j0;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lc4/j0;

    iget v1, p1, Lc4/j0;->a:I

    iget v2, p0, Lc4/j0;->a:I

    if-eq v2, v1, :cond_2

    goto :goto_0

    :cond_2
    iget-boolean v1, p0, Lc4/j0;->b:Z

    iget-boolean v2, p1, Lc4/j0;->b:Z

    if-eq v1, v2, :cond_3

    goto :goto_0

    :cond_3
    iget-boolean v1, p0, Lc4/j0;->c:Z

    iget-boolean v2, p1, Lc4/j0;->c:Z

    if-eq v1, v2, :cond_4

    goto :goto_0

    :cond_4
    iget-boolean v1, p0, Lc4/j0;->d:Z

    iget-boolean v2, p1, Lc4/j0;->d:Z

    if-eq v1, v2, :cond_5

    goto :goto_0

    :cond_5
    iget-boolean v1, p0, Lc4/j0;->e:Z

    iget-boolean p1, p1, Lc4/j0;->e:Z

    if-eq v1, p1, :cond_6

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_6
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Lc4/j0;->a:I

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lc4/j0;->b:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lc4/j0;->c:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lc4/j0;->d:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lc4/j0;->e:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
