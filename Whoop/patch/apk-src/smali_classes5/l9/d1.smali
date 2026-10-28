.class public final Ll9/d1;
.super Lu8/o0;
.source "SourceFile"


# static fields
.field public static final g:Ljava/lang/Object;


# instance fields
.field public final b:J

.field public final c:J

.field public final d:Z

.field public final e:Lu8/x;

.field public final f:Lu8/t;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll9/d1;->g:Ljava/lang/Object;

    new-instance v0, Lt9/s;

    invoke-direct {v0}, Lt9/s;-><init>()V

    sget-object v1, Lzr/g0;->x:Lzr/e0;

    sget-object v1, Lzr/w0;->E:Lzr/w0;

    sget-object v6, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    sget-object v7, Lzr/w0;->E:Lzr/w0;

    new-instance v1, Lf9/t;

    invoke-direct {v1}, Lf9/t;-><init>()V

    sget-object v2, Lu8/v;->a:Lu8/v;

    sget-object v3, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    if-eqz v3, :cond_0

    new-instance v2, Lu8/u;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct/range {v2 .. v9}, Lu8/u;-><init>(Landroid/net/Uri;Ljava/lang/String;Ls7/a;Ljava/util/List;Lzr/g0;J)V

    :cond_0
    new-instance v2, Lu8/x;

    invoke-virtual {v0}, Lt9/s;->a()Lu8/s;

    invoke-virtual {v1}, Lf9/t;->b()Lu8/t;

    sget-object v0, Lu8/a0;->B:Lu8/a0;

    return-void
.end method

.method public constructor <init>(JZZLu8/x;)V
    .locals 0

    if-eqz p4, :cond_0

    iget-object p4, p5, Lu8/x;->c:Lu8/t;

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ll9/d1;->b:J

    iput-wide p1, p0, Ll9/d1;->c:J

    iput-boolean p3, p0, Ll9/d1;->d:Z

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p5, p0, Ll9/d1;->e:Lu8/x;

    iput-object p4, p0, Ll9/d1;->f:Lu8/t;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)I
    .locals 1

    sget-object v0, Ll9/d1;->g:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final f(ILu8/m0;Z)Lu8/m0;
    .locals 10

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lva3/g;->f(II)V

    if-eqz p3, :cond_0

    sget-object p1, Ll9/d1;->g:Ljava/lang/Object;

    :goto_0
    move-object v2, p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, Lu8/b;->c:Lu8/b;

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    iget-wide v4, p0, Ll9/d1;->b:J

    const-wide/16 v6, 0x0

    move-object v0, p2

    invoke-virtual/range {v0 .. v9}, Lu8/m0;->h(Ljava/lang/Object;Ljava/lang/Object;IJJLu8/b;Z)V

    return-object v0
.end method

.method public final h()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final l(I)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lva3/g;->f(II)V

    sget-object p1, Ll9/d1;->g:Ljava/lang/Object;

    return-object p1
.end method

.method public final m(ILu8/n0;J)Lu8/n0;
    .locals 21

    move-object/from16 v0, p0

    const/4 v1, 0x1

    move/from16 v2, p1

    invoke-static {v2, v1}, Lva3/g;->f(II)V

    sget-object v1, Lu8/n0;->q:Ljava/lang/Object;

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    iget-object v3, v0, Ll9/d1;->e:Lu8/x;

    const/4 v4, 0x0

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    iget-boolean v11, v0, Ll9/d1;->d:Z

    const/4 v12, 0x0

    iget-object v13, v0, Ll9/d1;->f:Lu8/t;

    const-wide/16 v14, 0x0

    iget-wide v1, v0, Ll9/d1;->c:J

    move-wide/from16 v16, v1

    move-object/from16 v2, p2

    invoke-virtual/range {v2 .. v20}, Lu8/n0;->b(Lu8/x;Ljava/lang/Object;JJJZZLu8/t;JJIJ)V

    return-object p2
.end method

.method public final o()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
