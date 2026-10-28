.class public final Lc4/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Lc4/k0;

.field public final d:Z

.field public final e:Z

.field public final f:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 1

    and-int/lit8 p1, p1, 0x4

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    invoke-direct {p0, v0, v0, p1}, Lc4/a0;-><init>(ZZZ)V

    return-void
.end method

.method public constructor <init>(ZZZ)V
    .locals 7

    .line 10
    sget-object v0, Lc4/k0;->w:Lc4/k0;

    const/4 v5, 0x1

    const/16 v6, 0x20

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    .line 11
    invoke-direct/range {v1 .. v6}, Lc4/a0;-><init>(ZZZZI)V

    return-void
.end method

.method public constructor <init>(ZZZZI)V
    .locals 3

    .line 1
    sget-object v0, Lc4/k0;->w:Lc4/k0;

    and-int/lit8 v1, p5, 0x1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move p1, v2

    :cond_0
    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_1

    move p2, v2

    .line 2
    :cond_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lc4/a0;->a:Z

    .line 4
    iput-boolean p2, p0, Lc4/a0;->b:Z

    .line 5
    iput-object v0, p0, Lc4/a0;->c:Lc4/k0;

    .line 6
    iput-boolean p3, p0, Lc4/a0;->d:Z

    .line 7
    iput-boolean p4, p0, Lc4/a0;->e:Z

    .line 8
    const-string p1, ""

    iput-object p1, p0, Lc4/a0;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lc4/a0;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lc4/a0;

    iget-boolean v0, p1, Lc4/a0;->a:Z

    iget-boolean v1, p0, Lc4/a0;->a:Z

    if-eq v1, v0, :cond_2

    goto :goto_0

    :cond_2
    iget-boolean v0, p0, Lc4/a0;->b:Z

    iget-boolean v1, p1, Lc4/a0;->b:Z

    if-eq v0, v1, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lc4/a0;->c:Lc4/k0;

    iget-object v1, p1, Lc4/a0;->c:Lc4/k0;

    if-eq v0, v1, :cond_4

    goto :goto_0

    :cond_4
    iget-boolean v0, p0, Lc4/a0;->d:Z

    iget-boolean v1, p1, Lc4/a0;->d:Z

    if-eq v0, v1, :cond_5

    goto :goto_0

    :cond_5
    iget-boolean v0, p0, Lc4/a0;->e:Z

    iget-boolean p1, p1, Lc4/a0;->e:Z

    if-eq v0, p1, :cond_6

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_6
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 3

    iget-boolean v0, p0, Lc4/a0;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lc4/a0;->b:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lc4/a0;->c:Lc4/k0;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lc4/a0;->d:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lc4/a0;->e:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
