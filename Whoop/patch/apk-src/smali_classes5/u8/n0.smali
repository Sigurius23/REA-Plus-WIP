.class public final Lu8/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final q:Ljava/lang/Object;

.field public static final r:Lu8/x;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Lu8/x;

.field public d:Ljava/lang/Object;

.field public e:J

.field public f:J

.field public g:J

.field public h:Z

.field public i:Z

.field public j:Lu8/t;

.field public k:Z

.field public l:J

.field public m:J

.field public n:I

.field public o:I

.field public p:J


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lu8/n0;->q:Ljava/lang/Object;

    new-instance v0, Lt9/s;

    invoke-direct {v0}, Lt9/s;-><init>()V

    sget-object v1, Lzr/g0;->x:Lzr/e0;

    sget-object v1, Lzr/w0;->E:Lzr/w0;

    sget-object v6, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    sget-object v7, Lzr/w0;->E:Lzr/w0;

    new-instance v1, Lf9/t;

    invoke-direct {v1}, Lf9/t;-><init>()V

    sget-object v14, Lu8/v;->a:Lu8/v;

    sget-object v3, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    new-instance v2, Lu8/u;

    const/4 v4, 0x0

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

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

    const-string v9, "androidx.media3.common.Timeline"

    invoke-direct/range {v8 .. v14}, Lu8/x;-><init>(Ljava/lang/String;Lu8/s;Lu8/u;Lu8/t;Lu8/a0;Lu8/v;)V

    sput-object v8, Lu8/n0;->r:Lu8/x;

    const/4 v0, 0x4

    const/4 v1, 0x5

    const/4 v2, 0x1

    const/4 v3, 0x2

    const/4 v4, 0x3

    invoke-static {v2, v3, v4, v0, v1}, Lte0/d;->v(IIIII)V

    const/16 v0, 0x9

    const/16 v1, 0xa

    const/4 v2, 0x6

    const/4 v3, 0x7

    const/16 v4, 0x8

    invoke-static {v2, v3, v4, v0, v1}, Lte0/d;->v(IIIII)V

    const/16 v0, 0xb

    invoke-static {v0}, Lx8/t;->F(I)V

    const/16 v0, 0xc

    invoke-static {v0}, Lx8/t;->F(I)V

    const/16 v0, 0xd

    invoke-static {v0}, Lx8/t;->F(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lu8/n0;->q:Ljava/lang/Object;

    iput-object v0, p0, Lu8/n0;->a:Ljava/lang/Object;

    sget-object v0, Lu8/n0;->r:Lu8/x;

    iput-object v0, p0, Lu8/n0;->c:Lu8/x;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Lu8/n0;->j:Lu8/t;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final b(Lu8/x;Ljava/lang/Object;JJJZZLu8/t;JJIJ)V
    .locals 1

    sget-object v0, Lu8/n0;->q:Ljava/lang/Object;

    iput-object v0, p0, Lu8/n0;->a:Ljava/lang/Object;

    if-eqz p1, :cond_0

    move-object v0, p1

    goto :goto_0

    :cond_0
    sget-object v0, Lu8/n0;->r:Lu8/x;

    :goto_0
    iput-object v0, p0, Lu8/n0;->c:Lu8/x;

    if-eqz p1, :cond_1

    iget-object p1, p1, Lu8/x;->b:Lu8/u;

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, Lu8/n0;->b:Ljava/lang/Object;

    iput-object p2, p0, Lu8/n0;->d:Ljava/lang/Object;

    iput-wide p3, p0, Lu8/n0;->e:J

    iput-wide p5, p0, Lu8/n0;->f:J

    iput-wide p7, p0, Lu8/n0;->g:J

    iput-boolean p9, p0, Lu8/n0;->h:Z

    iput-boolean p10, p0, Lu8/n0;->i:Z

    iput-object p11, p0, Lu8/n0;->j:Lu8/t;

    iput-wide p12, p0, Lu8/n0;->l:J

    move-wide p1, p14

    iput-wide p1, p0, Lu8/n0;->m:J

    const/4 p1, 0x0

    iput p1, p0, Lu8/n0;->n:I

    move/from16 p2, p16

    iput p2, p0, Lu8/n0;->o:I

    move-wide/from16 p2, p17

    iput-wide p2, p0, Lu8/n0;->p:J

    iput-boolean p1, p0, Lu8/n0;->k:Z

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p0, p1, :cond_0

    goto/16 :goto_0

    :cond_0
    if-eqz p1, :cond_2

    const-class v0, Lu8/n0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_1

    :cond_1
    check-cast p1, Lu8/n0;

    iget-object v0, p0, Lu8/n0;->a:Ljava/lang/Object;

    iget-object v1, p1, Lu8/n0;->a:Ljava/lang/Object;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lu8/n0;->c:Lu8/x;

    iget-object v1, p1, Lu8/n0;->c:Lu8/x;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lu8/n0;->d:Ljava/lang/Object;

    iget-object v1, p1, Lu8/n0;->d:Ljava/lang/Object;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lu8/n0;->j:Lu8/t;

    iget-object v1, p1, Lu8/n0;->j:Lu8/t;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-wide v0, p0, Lu8/n0;->e:J

    iget-wide v2, p1, Lu8/n0;->e:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    iget-wide v0, p0, Lu8/n0;->f:J

    iget-wide v2, p1, Lu8/n0;->f:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    iget-wide v0, p0, Lu8/n0;->g:J

    iget-wide v2, p1, Lu8/n0;->g:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lu8/n0;->h:Z

    iget-boolean v1, p1, Lu8/n0;->h:Z

    if-ne v0, v1, :cond_2

    iget-boolean v0, p0, Lu8/n0;->i:Z

    iget-boolean v1, p1, Lu8/n0;->i:Z

    if-ne v0, v1, :cond_2

    iget-boolean v0, p0, Lu8/n0;->k:Z

    iget-boolean v1, p1, Lu8/n0;->k:Z

    if-ne v0, v1, :cond_2

    iget-wide v0, p0, Lu8/n0;->l:J

    iget-wide v2, p1, Lu8/n0;->l:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    iget-wide v0, p0, Lu8/n0;->m:J

    iget-wide v2, p1, Lu8/n0;->m:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    iget v0, p0, Lu8/n0;->n:I

    iget v1, p1, Lu8/n0;->n:I

    if-ne v0, v1, :cond_2

    iget v0, p0, Lu8/n0;->o:I

    iget v1, p1, Lu8/n0;->o:I

    if-ne v0, v1, :cond_2

    iget-wide v0, p0, Lu8/n0;->p:J

    iget-wide v2, p1, Lu8/n0;->p:J

    cmp-long p1, v0, v2

    if-nez p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 7

    iget-object v0, p0, Lu8/n0;->a:Ljava/lang/Object;

    const/16 v1, 0xd9

    const/16 v2, 0x1f

    invoke-static {v1, v2, v0}, Lte0/d;->c(IILjava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Lu8/n0;->c:Lu8/x;

    invoke-virtual {v1}, Lu8/x;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/2addr v1, v2

    iget-object v0, p0, Lu8/n0;->d:Ljava/lang/Object;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    mul-int/2addr v1, v2

    iget-object v0, p0, Lu8/n0;->j:Lu8/t;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lu8/t;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-wide v3, p0, Lu8/n0;->e:J

    const/16 v0, 0x20

    ushr-long v5, v3, v0

    xor-long/2addr v3, v5

    long-to-int v3, v3

    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-wide v3, p0, Lu8/n0;->f:J

    ushr-long v5, v3, v0

    xor-long/2addr v3, v5

    long-to-int v3, v3

    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-wide v3, p0, Lu8/n0;->g:J

    ushr-long v5, v3, v0

    xor-long/2addr v3, v5

    long-to-int v3, v3

    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-boolean v3, p0, Lu8/n0;->h:Z

    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-boolean v3, p0, Lu8/n0;->i:Z

    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-boolean v3, p0, Lu8/n0;->k:Z

    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-wide v3, p0, Lu8/n0;->l:J

    ushr-long v5, v3, v0

    xor-long/2addr v3, v5

    long-to-int v3, v3

    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-wide v3, p0, Lu8/n0;->m:J

    ushr-long v5, v3, v0

    xor-long/2addr v3, v5

    long-to-int v3, v3

    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget v3, p0, Lu8/n0;->n:I

    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget v3, p0, Lu8/n0;->o:I

    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-wide v2, p0, Lu8/n0;->p:J

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v0, v2

    add-int/2addr v1, v0

    return v1
.end method
