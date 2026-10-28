.class public final Lud3/w0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lud3/o0;

.field public b:Lud3/m0;

.field public c:I

.field public d:Ljava/lang/String;

.field public e:Lud3/c0;

.field public f:Lkotlin/jvm/internal/k0;

.field public g:Lud3/a1;

.field public h:Lne3/o0;

.field public i:Lud3/x0;

.field public j:Lud3/x0;

.field public k:Lud3/x0;

.field public l:J

.field public m:J

.field public n:Lzd3/g;

.field public o:Lud3/d1;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lud3/w0;->c:I

    sget-object v0, Lud3/a1;->x:Lud3/z0;

    iput-object v0, p0, Lud3/w0;->g:Lud3/a1;

    sget-object v0, Lud3/d1;->A:Lud3/t;

    iput-object v0, p0, Lud3/w0;->o:Lud3/d1;

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lkotlin/jvm/internal/k0;-><init>(IZ)V

    iput-object v0, p0, Lud3/w0;->f:Lkotlin/jvm/internal/k0;

    return-void
.end method

.method public static b(Lud3/x0;Ljava/lang/String;)V
    .locals 1

    if-eqz p0, :cond_3

    iget-object v0, p0, Lud3/x0;->I:Lud3/x0;

    if-nez v0, :cond_2

    iget-object v0, p0, Lud3/x0;->J:Lud3/x0;

    if-nez v0, :cond_1

    iget-object p0, p0, Lud3/x0;->K:Lud3/x0;

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const-string p0, ".priorResponse != null"

    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const-string p0, ".cacheResponse != null"

    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    const-string p0, ".networkResponse != null"

    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_0
    return-void
.end method


# virtual methods
.method public final a()Lud3/x0;
    .locals 19

    move-object/from16 v0, p0

    iget v5, v0, Lud3/w0;->c:I

    if-ltz v5, :cond_3

    iget-object v2, v0, Lud3/w0;->a:Lud3/o0;

    if-eqz v2, :cond_2

    iget-object v3, v0, Lud3/w0;->b:Lud3/m0;

    if-eqz v3, :cond_1

    iget-object v4, v0, Lud3/w0;->d:Ljava/lang/String;

    if-eqz v4, :cond_0

    iget-object v6, v0, Lud3/w0;->e:Lud3/c0;

    iget-object v1, v0, Lud3/w0;->f:Lkotlin/jvm/internal/k0;

    invoke-virtual {v1}, Lkotlin/jvm/internal/k0;->g()Lud3/d0;

    move-result-object v7

    iget-object v8, v0, Lud3/w0;->g:Lud3/a1;

    iget-object v9, v0, Lud3/w0;->h:Lne3/o0;

    iget-object v10, v0, Lud3/w0;->i:Lud3/x0;

    iget-object v11, v0, Lud3/w0;->j:Lud3/x0;

    iget-object v12, v0, Lud3/w0;->k:Lud3/x0;

    iget-wide v13, v0, Lud3/w0;->l:J

    move-object v15, v2

    iget-wide v1, v0, Lud3/w0;->m:J

    move-wide/from16 v16, v1

    iget-object v1, v0, Lud3/w0;->n:Lzd3/g;

    iget-object v2, v0, Lud3/w0;->o:Lud3/d1;

    move-object/from16 v18, v2

    move-object v2, v15

    move-wide/from16 v15, v16

    move-object/from16 v17, v1

    new-instance v1, Lud3/x0;

    invoke-direct/range {v1 .. v18}, Lud3/x0;-><init>(Lud3/o0;Lud3/m0;Ljava/lang/String;ILud3/c0;Lud3/d0;Lud3/a1;Lne3/o0;Lud3/x0;Lud3/x0;Lud3/x0;JJLzd3/g;Lud3/d1;)V

    return-object v1

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "message == null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "protocol == null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "request == null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "code < 0: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, v0, Lud3/w0;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public final c(Lud3/d0;)V
    .locals 1

    const-string v0, "headers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lud3/d0;->d()Lkotlin/jvm/internal/k0;

    move-result-object p1

    iput-object p1, p0, Lud3/w0;->f:Lkotlin/jvm/internal/k0;

    return-void
.end method
