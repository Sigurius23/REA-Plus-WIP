.class public final Lh20/w1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Lh20/c2;

.field public c:Lh20/h2;

.field public d:Lh20/i1;

.field public e:Z

.field public f:Lh20/h1;

.field public g:Ljava/lang/String;

.field public final h:Lh20/l1;

.field public final i:Lm83/y;

.field public j:Z

.field public final k:Lm83/y;

.field public final l:Lm83/y;

.field public m:Lh20/x2;

.field public final n:Lh20/p1;

.field public final o:Lt83/b;

.field public final p:Lh20/w2;

.field public final q:Lh20/q3;

.field public final r:Lm83/z;

.field public final s:Lm83/y;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "merchantDisplayName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh20/w1;->a:Ljava/lang/String;

    sget-object p1, Liy/a;->a:Lh20/h1;

    const/4 p1, 0x0

    iput-object p1, p0, Lh20/w1;->b:Lh20/c2;

    iput-object p1, p0, Lh20/w1;->c:Lh20/h2;

    sget-object v0, Liy/a;->b:Lh20/i1;

    iput-object v0, p0, Lh20/w1;->d:Lh20/i1;

    sget-object v0, Liy/a;->a:Lh20/h1;

    iput-object v0, p0, Lh20/w1;->f:Lh20/h1;

    iput-object p1, p0, Lh20/w1;->g:Ljava/lang/String;

    sget-object p1, Liy/a;->c:Lh20/l1;

    iput-object p1, p0, Lh20/w1;->h:Lh20/l1;

    sget-object p1, Liy/a;->f:Lm83/y;

    iput-object p1, p0, Lh20/w1;->i:Lm83/y;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lh20/w1;->j:Z

    sget-object p1, Liy/a;->e:Lm83/y;

    iput-object p1, p0, Lh20/w1;->k:Lm83/y;

    sget-object p1, Liy/a;->g:Lm83/y;

    iput-object p1, p0, Lh20/w1;->l:Lm83/y;

    sget-object p1, Liy/a;->h:Lh20/x2;

    iput-object p1, p0, Lh20/w1;->m:Lh20/x2;

    sget-object p1, Liy/a;->i:Lh20/p1;

    iput-object p1, p0, Lh20/w1;->n:Lh20/p1;

    sget-object p1, Liy/a;->j:Lt83/b;

    iput-object p1, p0, Lh20/w1;->o:Lt83/b;

    sget-object p1, Liy/a;->d:Lh20/w2;

    iput-object p1, p0, Lh20/w1;->p:Lh20/w2;

    sget-object p1, Liy/a;->l:Lh20/q3;

    iput-object p1, p0, Lh20/w1;->q:Lh20/q3;

    sget-object p1, Lm83/z;->w:Lm83/z;

    iput-object p1, p0, Lh20/w1;->r:Lm83/z;

    sget-object p1, Liy/a;->k:Lm83/y;

    iput-object p1, p0, Lh20/w1;->s:Lm83/y;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lh20/w1;->e:Z

    return-void
.end method

.method public final b()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lh20/w1;->j:Z

    return-void
.end method

.method public final c(Lh20/h1;)V
    .locals 1

    const-string v0, "appearance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lh20/w1;->f:Lh20/h1;

    return-void
.end method

.method public final d()Lh20/x1;
    .locals 27

    move-object/from16 v0, p0

    new-instance v1, Lh20/x1;

    iget-object v3, v0, Lh20/w1;->b:Lh20/c2;

    iget-object v4, v0, Lh20/w1;->c:Lh20/h2;

    iget-object v5, v0, Lh20/w1;->d:Lh20/i1;

    iget-boolean v8, v0, Lh20/w1;->e:Z

    iget-object v9, v0, Lh20/w1;->f:Lh20/h1;

    iget-object v10, v0, Lh20/w1;->g:Ljava/lang/String;

    iget-boolean v13, v0, Lh20/w1;->j:Z

    iget-object v2, v0, Lh20/w1;->m:Lh20/x2;

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object/from16 v16, v2

    iget-object v2, v0, Lh20/w1;->a:Ljava/lang/String;

    iget-object v11, v0, Lh20/w1;->h:Lh20/l1;

    iget-object v12, v0, Lh20/w1;->i:Lm83/y;

    iget-object v14, v0, Lh20/w1;->k:Lm83/y;

    iget-object v15, v0, Lh20/w1;->l:Lm83/y;

    iget-object v6, v0, Lh20/w1;->n:Lh20/p1;

    iget-object v7, v0, Lh20/w1;->o:Lt83/b;

    move-object/from16 v19, v1

    iget-object v1, v0, Lh20/w1;->s:Lm83/y;

    move-object/from16 v20, v1

    iget-object v1, v0, Lh20/w1;->p:Lh20/w2;

    move-object/from16 v21, v1

    iget-object v1, v0, Lh20/w1;->q:Lh20/q3;

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v24, v1

    iget-object v1, v0, Lh20/w1;->r:Lm83/z;

    move-object/from16 v17, v24

    move-object/from16 v24, v1

    move-object/from16 v1, v19

    move-object/from16 v19, v20

    move-object/from16 v20, v21

    move-object/from16 v21, v17

    move-object/from16 v17, v6

    move-object/from16 v18, v7

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v26}, Lh20/x1;-><init>(Ljava/lang/String;Lh20/c2;Lh20/h2;Lh20/i1;Li20/b;ZZLh20/h1;Ljava/lang/String;Lh20/l1;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Lh20/x2;Lh20/t1;Ljava/util/List;Ljava/util/List;Lh20/w2;Lh20/q3;Lh20/g3;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/String;)V

    return-object v1
.end method

.method public final e(Lh20/c2;)V
    .locals 0

    iput-object p1, p0, Lh20/w1;->b:Lh20/c2;

    return-void
.end method

.method public final f(Lh20/i1;)V
    .locals 0

    iput-object p1, p0, Lh20/w1;->d:Lh20/i1;

    return-void
.end method

.method public final g(Lh20/h2;)V
    .locals 0

    iput-object p1, p0, Lh20/w1;->c:Lh20/h2;

    return-void
.end method

.method public final h()V
    .locals 1

    sget-object v0, Lh20/x2;->x:Lh20/x2;

    iput-object v0, p0, Lh20/w1;->m:Lh20/x2;

    return-void
.end method

.method public final i(Ljava/lang/String;)V
    .locals 1

    const-string v0, "primaryButtonLabel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lh20/w1;->g:Ljava/lang/String;

    return-void
.end method
