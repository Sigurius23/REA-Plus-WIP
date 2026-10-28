.class public final Lo0/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lo0/g;

.field public final b:Ljava/util/ArrayList;

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public final g:Ljava/util/ArrayList;

.field public h:Ljava/lang/Object;

.field public i:I


# direct methods
.method public constructor <init>(Lo0/g;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo0/v;->a:Lo0/g;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Lo0/t;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lo0/t;-><init>(II)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-object p1, p0, Lo0/v;->b:Ljava/util/ArrayList;

    const/4 p1, -0x1

    iput p1, p0, Lo0/v;->f:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lo0/v;->g:Ljava/util/ArrayList;

    sget-object p1, Lm83/y;->w:Lm83/y;

    iput-object p1, p0, Lo0/v;->h:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 4

    invoke-virtual {p0}, Lo0/v;->d()I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    iget v2, p0, Lo0/v;->i:I

    int-to-double v2, v2

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-int v0, v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final b(I)Lfn/f;
    .locals 7

    iget v0, p0, Lo0/v;->i:I

    mul-int/2addr p1, v0

    new-instance v1, Lfn/f;

    invoke-virtual {p0}, Lo0/v;->d()I

    move-result v2

    sub-int/2addr v2, p1

    if-le v0, v2, :cond_0

    move v0, v2

    :cond_0
    const/4 v2, 0x0

    if-gez v0, :cond_1

    move v0, v2

    :cond_1
    iget-object v3, p0, Lo0/v;->h:Ljava/lang/Object;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ne v0, v3, :cond_2

    iget-object v0, p0, Lo0/v;->h:Ljava/lang/Object;

    goto :goto_1

    :cond_2
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    if-ge v2, v0, :cond_3

    const/4 v4, 0x1

    int-to-long v4, v4

    new-instance v6, Lo0/c;

    invoke-direct {v6, v4, v5}, Lo0/c;-><init>(J)V

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    iput-object v3, p0, Lo0/v;->h:Ljava/lang/Object;

    move-object v0, v3

    :goto_1
    invoke-direct {v1, p1, v0}, Lfn/f;-><init>(ILjava/util/List;)V

    return-object v1
.end method

.method public final c(I)I
    .locals 1

    invoke-virtual {p0}, Lo0/v;->d()I

    move-result v0

    if-gtz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0}, Lo0/v;->d()I

    move-result v0

    if-ge p1, v0, :cond_1

    goto :goto_0

    :cond_1
    const-string v0, "ItemIndex > total count"

    invoke-static {v0}, Lk0/a;->a(Ljava/lang/String;)V

    :goto_0
    iget v0, p0, Lo0/v;->i:I

    div-int/2addr p1, v0

    return p1
.end method

.method public final d()I
    .locals 1

    iget-object v0, p0, Lo0/v;->a:Lo0/g;

    iget-object v0, v0, Lo0/g;->d:Lab/h0;

    iget v0, v0, Lab/h0;->x:I

    return v0
.end method

.method public final e(I)I
    .locals 2

    iget-object v0, p0, Lo0/v;->a:Lo0/g;

    iget-object v0, v0, Lo0/g;->d:Lab/h0;

    invoke-virtual {v0, p1}, Lab/h0;->m(I)Lp0/h;

    move-result-object v0

    iget v1, v0, Lp0/h;->a:I

    sub-int/2addr p1, v1

    iget-object v0, v0, Lp0/h;->c:Lp0/q;

    check-cast v0, Lo0/f;

    iget-object v0, v0, Lo0/f;->a:Lc93/m;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    sget-object v1, Lo0/u;->a:Lo0/u;

    invoke-interface {v0, v1, p1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo0/c;

    iget-wide v0, p1, Lo0/c;->a:J

    long-to-int p1, v0

    return p1
.end method
