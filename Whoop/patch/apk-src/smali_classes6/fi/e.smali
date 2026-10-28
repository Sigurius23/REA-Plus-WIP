.class public final Lfi/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Lfi/f;

.field public c:Ljava/lang/Object;

.field public d:Lhi/a;

.field public e:Lfi/h;

.field public f:Z

.field public g:Ljava/util/Map;

.field public h:Lkotlin/jvm/functions/Function1;

.field public i:Lkotlin/jvm/functions/Function1;

.field public j:Lkotlin/jvm/functions/Function1;

.field public k:Lgi/j;

.field public l:Lgi/g;

.field public m:Lgi/d;

.field public n:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lfi/e;->a:Landroid/content/Context;

    .line 3
    sget-object p1, Lfi/f;->o:Lfi/f;

    iput-object p1, p0, Lfi/e;->b:Lfi/f;

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lfi/e;->c:Ljava/lang/Object;

    .line 5
    iput-object p1, p0, Lfi/e;->d:Lhi/a;

    .line 6
    iput-object p1, p0, Lfi/e;->e:Lfi/h;

    .line 7
    sget-object v0, Lm83/z;->w:Lm83/z;

    iput-object v0, p0, Lfi/e;->g:Ljava/util/Map;

    .line 8
    sget-object v0, Lki/j;->w:Lki/j;

    iput-object v0, p0, Lfi/e;->h:Lkotlin/jvm/functions/Function1;

    .line 9
    iput-object v0, p0, Lfi/e;->i:Lkotlin/jvm/functions/Function1;

    .line 10
    iput-object v0, p0, Lfi/e;->j:Lkotlin/jvm/functions/Function1;

    .line 11
    iput-object p1, p0, Lfi/e;->k:Lgi/j;

    .line 12
    iput-object p1, p0, Lfi/e;->l:Lgi/g;

    .line 13
    iput-object p1, p0, Lfi/e;->m:Lgi/d;

    .line 14
    sget-object p1, Lrh/i;->b:Lrh/i;

    iput-object p1, p0, Lfi/e;->n:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lfi/i;Landroid/content/Context;)V
    .locals 1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p2, p0, Lfi/e;->a:Landroid/content/Context;

    .line 17
    iget-object p2, p1, Lfi/i;->u:Lfi/f;

    .line 18
    iput-object p2, p0, Lfi/e;->b:Lfi/f;

    .line 19
    iget-object p2, p1, Lfi/i;->b:Ljava/lang/Object;

    .line 20
    iput-object p2, p0, Lfi/e;->c:Ljava/lang/Object;

    .line 21
    iget-object p2, p1, Lfi/i;->c:Lhi/a;

    .line 22
    iput-object p2, p0, Lfi/e;->d:Lhi/a;

    .line 23
    iget-object p2, p1, Lfi/i;->d:Lfi/h;

    .line 24
    iput-object p2, p0, Lfi/e;->e:Lfi/h;

    .line 25
    iget-object p2, p1, Lfi/i;->e:Ljava/util/Map;

    .line 26
    check-cast p2, Ljava/util/Map;

    iput-object p2, p0, Lfi/e;->g:Ljava/util/Map;

    .line 27
    iget-object p2, p1, Lfi/i;->t:Lfi/g;

    .line 28
    iget-object v0, p2, Lfi/g;->a:Lkotlin/jvm/functions/Function1;

    .line 29
    iput-object v0, p0, Lfi/e;->h:Lkotlin/jvm/functions/Function1;

    .line 30
    iget-object v0, p2, Lfi/g;->b:Lkotlin/jvm/functions/Function1;

    .line 31
    iput-object v0, p0, Lfi/e;->i:Lkotlin/jvm/functions/Function1;

    .line 32
    iget-object v0, p2, Lfi/g;->c:Lkotlin/jvm/functions/Function1;

    .line 33
    iput-object v0, p0, Lfi/e;->j:Lkotlin/jvm/functions/Function1;

    .line 34
    iget-object v0, p2, Lfi/g;->d:Lgi/j;

    .line 35
    iput-object v0, p0, Lfi/e;->k:Lgi/j;

    .line 36
    iget-object v0, p2, Lfi/g;->e:Lgi/g;

    .line 37
    iput-object v0, p0, Lfi/e;->l:Lgi/g;

    .line 38
    iget-object p2, p2, Lfi/g;->f:Lgi/d;

    .line 39
    iput-object p2, p0, Lfi/e;->m:Lgi/d;

    .line 40
    iget-object p1, p1, Lfi/i;->s:Lrh/i;

    .line 41
    iput-object p1, p0, Lfi/e;->n:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Lfi/i;
    .locals 29

    move-object/from16 v0, p0

    iget-object v1, v0, Lfi/e;->c:Ljava/lang/Object;

    if-nez v1, :cond_0

    sget-object v1, Lfi/n;->a:Lfi/n;

    :cond_0
    move-object v4, v1

    iget-object v5, v0, Lfi/e;->d:Lhi/a;

    iget-object v6, v0, Lfi/e;->e:Lfi/h;

    iget-object v1, v0, Lfi/e;->g:Ljava/util/Map;

    iget-boolean v2, v0, Lfi/e;->f:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "null cannot be cast to non-null type kotlin.collections.MutableMap<*, *>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lkotlin/jvm/internal/m0;->c(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v1}, Lx43/j;->W(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    :goto_0
    move-object v7, v1

    goto :goto_1

    :cond_1
    instance-of v2, v1, Ljava/util/Map;

    if-eqz v2, :cond_a

    check-cast v1, Ljava/util/Map;

    goto :goto_0

    :goto_1
    const-string v1, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lfi/e;->b:Lfi/f;

    iget-object v8, v1, Lfi/f;->a:Lne3/p;

    iget-object v12, v1, Lfi/f;->e:Lfi/b;

    iget-object v13, v1, Lfi/f;->f:Lfi/b;

    iget-object v14, v1, Lfi/f;->g:Lfi/b;

    iget-object v9, v1, Lfi/f;->b:Lq83/j;

    iget-object v10, v1, Lfi/f;->c:Lq83/j;

    iget-object v11, v1, Lfi/f;->d:Lq83/j;

    iget-object v2, v0, Lfi/e;->h:Lkotlin/jvm/functions/Function1;

    if-nez v2, :cond_2

    iget-object v2, v1, Lfi/f;->h:Lkotlin/jvm/functions/Function1;

    :cond_2
    move-object v15, v2

    iget-object v2, v0, Lfi/e;->i:Lkotlin/jvm/functions/Function1;

    if-nez v2, :cond_3

    iget-object v2, v1, Lfi/f;->i:Lkotlin/jvm/functions/Function1;

    :cond_3
    move-object/from16 v16, v2

    iget-object v2, v0, Lfi/e;->j:Lkotlin/jvm/functions/Function1;

    if-nez v2, :cond_4

    iget-object v2, v1, Lfi/f;->j:Lkotlin/jvm/functions/Function1;

    :cond_4
    move-object/from16 v17, v2

    iget-object v2, v0, Lfi/e;->k:Lgi/j;

    if-nez v2, :cond_5

    iget-object v2, v1, Lfi/f;->k:Lgi/j;

    :cond_5
    move-object/from16 v18, v2

    iget-object v2, v0, Lfi/e;->l:Lgi/g;

    if-nez v2, :cond_6

    iget-object v2, v1, Lfi/f;->l:Lgi/g;

    :cond_6
    move-object/from16 v19, v2

    iget-object v2, v0, Lfi/e;->m:Lgi/d;

    if-nez v2, :cond_7

    iget-object v2, v1, Lfi/f;->m:Lgi/d;

    :cond_7
    move-object/from16 v20, v2

    iget-object v1, v0, Lfi/e;->n:Ljava/lang/Object;

    instance-of v2, v1, Lrh/h;

    if-eqz v2, :cond_8

    check-cast v1, Lrh/h;

    new-instance v2, Lrh/i;

    iget-object v1, v1, Lrh/h;->a:Ljava/util/LinkedHashMap;

    invoke-static {v1}, Lx43/j;->W(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    invoke-direct {v2, v1}, Lrh/i;-><init>(Ljava/util/Map;)V

    :goto_2
    move-object/from16 v21, v2

    goto :goto_3

    :cond_8
    instance-of v2, v1, Lrh/i;

    if-eqz v2, :cond_9

    move-object v2, v1

    check-cast v2, Lrh/i;

    goto :goto_2

    :goto_3
    iget-object v1, v0, Lfi/e;->h:Lkotlin/jvm/functions/Function1;

    iget-object v2, v0, Lfi/e;->i:Lkotlin/jvm/functions/Function1;

    iget-object v3, v0, Lfi/e;->j:Lkotlin/jvm/functions/Function1;

    move-object/from16 v23, v1

    iget-object v1, v0, Lfi/e;->k:Lgi/j;

    move-object/from16 v26, v1

    iget-object v1, v0, Lfi/e;->l:Lgi/g;

    move-object/from16 v27, v1

    iget-object v1, v0, Lfi/e;->m:Lgi/d;

    new-instance v22, Lfi/g;

    move-object/from16 v28, v1

    move-object/from16 v24, v2

    move-object/from16 v25, v3

    invoke-direct/range {v22 .. v28}, Lfi/g;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lgi/j;Lgi/g;Lgi/d;)V

    iget-object v1, v0, Lfi/e;->b:Lfi/f;

    new-instance v2, Lfi/i;

    iget-object v3, v0, Lfi/e;->a:Landroid/content/Context;

    move-object/from16 v23, v1

    invoke-direct/range {v2 .. v23}, Lfi/i;-><init>(Landroid/content/Context;Ljava/lang/Object;Lhi/a;Lfi/h;Ljava/util/Map;Lne3/p;Lq83/j;Lq83/j;Lq83/j;Lfi/b;Lfi/b;Lfi/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lgi/j;Lgi/g;Lgi/d;Lrh/i;Lfi/g;Lfi/f;)V

    return-object v2

    :cond_9
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    :cond_a
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1
.end method

.method public final b()Lrh/h;
    .locals 2

    iget-object v0, p0, Lfi/e;->n:Ljava/lang/Object;

    instance-of v1, v0, Lrh/h;

    if-eqz v1, :cond_0

    check-cast v0, Lrh/h;

    return-object v0

    :cond_0
    instance-of v1, v0, Lrh/i;

    if-eqz v1, :cond_1

    check-cast v0, Lrh/i;

    new-instance v1, Lrh/h;

    invoke-direct {v1, v0}, Lrh/h;-><init>(Lrh/i;)V

    iput-object v1, p0, Lfi/e;->n:Ljava/lang/Object;

    return-object v1

    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public final c()Ljava/util/Map;
    .locals 2

    iget-object v0, p0, Lfi/e;->g:Ljava/util/Map;

    iget-boolean v1, p0, Lfi/e;->f:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v1, v0, Ljava/util/Map;

    if-eqz v1, :cond_1

    check-cast v0, Ljava/util/Map;

    invoke-static {v0}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    iput-object v0, p0, Lfi/e;->g:Ljava/util/Map;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lfi/e;->f:Z

    :goto_0
    const-string v1, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.String>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/jvm/internal/m0;->c(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method
