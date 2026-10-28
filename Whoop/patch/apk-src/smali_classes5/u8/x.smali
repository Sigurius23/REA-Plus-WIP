.class public final Lu8/x;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lu8/u;

.field public final c:Lu8/t;

.field public final d:Lu8/a0;

.field public final e:Lu8/s;

.field public final f:Lu8/v;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lt9/s;

    invoke-direct {v0}, Lt9/s;-><init>()V

    sget-object v1, Lzr/g0;->x:Lzr/e0;

    sget-object v1, Lzr/w0;->E:Lzr/w0;

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    sget-object v1, Lzr/w0;->E:Lzr/w0;

    new-instance v1, Lf9/t;

    invoke-direct {v1}, Lf9/t;-><init>()V

    sget-object v2, Lu8/v;->a:Lu8/v;

    invoke-virtual {v0}, Lt9/s;->a()Lu8/s;

    invoke-virtual {v1}, Lf9/t;->b()Lu8/t;

    sget-object v0, Lu8/a0;->B:Lu8/a0;

    const/4 v0, 0x3

    const/4 v1, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v2, v3, v4, v0, v1}, Lte0/d;->v(IIIII)V

    const/4 v0, 0x5

    invoke-static {v0}, Lx8/t;->F(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lu8/s;Lu8/u;Lu8/t;Lu8/a0;Lu8/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu8/x;->a:Ljava/lang/String;

    iput-object p3, p0, Lu8/x;->b:Lu8/u;

    iput-object p4, p0, Lu8/x;->c:Lu8/t;

    iput-object p5, p0, Lu8/x;->d:Lu8/a0;

    iput-object p2, p0, Lu8/x;->e:Lu8/s;

    iput-object p6, p0, Lu8/x;->f:Lu8/v;

    return-void
.end method

.method public static a(Landroid/net/Uri;)Lu8/x;
    .locals 15

    new-instance v0, Lt9/s;

    invoke-direct {v0}, Lt9/s;-><init>()V

    sget-object v1, Lzr/g0;->x:Lzr/e0;

    sget-object v1, Lzr/w0;->E:Lzr/w0;

    sget-object v6, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    sget-object v7, Lzr/w0;->E:Lzr/w0;

    new-instance v1, Lf9/t;

    invoke-direct {v1}, Lf9/t;-><init>()V

    sget-object v14, Lu8/v;->a:Lu8/v;

    const/4 v5, 0x0

    if-eqz p0, :cond_0

    new-instance v2, Lu8/u;

    const/4 v4, 0x0

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    move-object v3, p0

    invoke-direct/range {v2 .. v9}, Lu8/u;-><init>(Landroid/net/Uri;Ljava/lang/String;Ls7/a;Ljava/util/List;Lzr/g0;J)V

    move-object v11, v2

    goto :goto_0

    :cond_0
    move-object v11, v5

    :goto_0
    new-instance v8, Lu8/x;

    new-instance v10, Lu8/s;

    invoke-direct {v10, v0}, Lu8/r;-><init>(Lt9/s;)V

    new-instance v12, Lu8/t;

    invoke-direct {v12, v1}, Lu8/t;-><init>(Lf9/t;)V

    sget-object v13, Lu8/a0;->B:Lu8/a0;

    const-string v9, ""

    invoke-direct/range {v8 .. v14}, Lu8/x;-><init>(Ljava/lang/String;Lu8/s;Lu8/u;Lu8/t;Lu8/a0;Lu8/v;)V

    return-object v8
.end method

.method public static b(Ljava/lang/String;)Lu8/x;
    .locals 15

    new-instance v0, Lt9/s;

    invoke-direct {v0}, Lt9/s;-><init>()V

    sget-object v1, Lzr/g0;->x:Lzr/e0;

    sget-object v1, Lzr/w0;->E:Lzr/w0;

    sget-object v6, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    sget-object v7, Lzr/w0;->E:Lzr/w0;

    new-instance v1, Lf9/t;

    invoke-direct {v1}, Lf9/t;-><init>()V

    sget-object v14, Lu8/v;->a:Lu8/v;

    const/4 v5, 0x0

    if-nez p0, :cond_0

    move-object v3, v5

    goto :goto_0

    :cond_0
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    move-object v3, p0

    :goto_0
    if-eqz v3, :cond_1

    new-instance v2, Lu8/u;

    const/4 v4, 0x0

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct/range {v2 .. v9}, Lu8/u;-><init>(Landroid/net/Uri;Ljava/lang/String;Ls7/a;Ljava/util/List;Lzr/g0;J)V

    move-object v11, v2

    goto :goto_1

    :cond_1
    move-object v11, v5

    :goto_1
    new-instance v8, Lu8/x;

    new-instance v10, Lu8/s;

    invoke-direct {v10, v0}, Lu8/r;-><init>(Lt9/s;)V

    new-instance v12, Lu8/t;

    invoke-direct {v12, v1}, Lu8/t;-><init>(Lf9/t;)V

    sget-object v13, Lu8/a0;->B:Lu8/a0;

    const-string v9, ""

    invoke-direct/range {v8 .. v14}, Lu8/x;-><init>(Ljava/lang/String;Lu8/s;Lu8/u;Lu8/t;Lu8/a0;Lu8/v;)V

    return-object v8
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lu8/x;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lu8/x;

    iget-object v0, p0, Lu8/x;->a:Ljava/lang/String;

    iget-object v1, p1, Lu8/x;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lu8/x;->e:Lu8/s;

    iget-object v1, p1, Lu8/x;->e:Lu8/s;

    invoke-virtual {v0, v1}, Lu8/r;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lu8/x;->b:Lu8/u;

    iget-object v1, p1, Lu8/x;->b:Lu8/u;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lu8/x;->c:Lu8/t;

    iget-object v1, p1, Lu8/x;->c:Lu8/t;

    invoke-virtual {v0, v1}, Lu8/t;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lu8/x;->d:Lu8/a0;

    iget-object v1, p1, Lu8/x;->d:Lu8/a0;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lu8/x;->f:Lu8/v;

    iget-object p1, p1, Lu8/x;->f:Lu8/v;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lu8/x;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lu8/x;->b:Lu8/u;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lu8/u;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lu8/x;->c:Lu8/t;

    invoke-virtual {v1}, Lu8/t;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lu8/x;->e:Lu8/s;

    invoke-virtual {v0}, Lu8/r;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lu8/x;->d:Lu8/a0;

    invoke-virtual {v1}, Lu8/a0;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lu8/x;->f:Lu8/v;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v1
.end method
