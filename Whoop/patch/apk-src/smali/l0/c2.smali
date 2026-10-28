.class public final Ll0/c2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final v:Ljava/util/WeakHashMap;


# instance fields
.field public final a:Ll0/b;

.field public final b:Ll0/b;

.field public final c:Ll0/b;

.field public final d:Ll0/b;

.field public final e:Ll0/b;

.field public final f:Ll0/b;

.field public final g:Ll0/b;

.field public final h:Ll0/b;

.field public final i:Ll0/b;

.field public final j:Ll0/z1;

.field public final k:Ll0/w1;

.field public final l:Ll0/z1;

.field public final m:Ll0/z1;

.field public final n:Ll0/z1;

.field public final o:Ll0/z1;

.field public final p:Ll0/z1;

.field public final q:Ll0/z1;

.field public final r:Ll0/z1;

.field public final s:Z

.field public t:I

.field public final u:Ll0/v0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Ll0/c2;->v:Ljava/util/WeakHashMap;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 16

    move-object/from16 v0, p0

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v1, "captionBar"

    const/4 v2, 0x4

    invoke-static {v2, v1}, Ll0/e;->b(ILjava/lang/String;)Ll0/b;

    move-result-object v1

    iput-object v1, v0, Ll0/c2;->a:Ll0/b;

    const/16 v1, 0x80

    const-string v3, "displayCutout"

    invoke-static {v1, v3}, Ll0/e;->b(ILjava/lang/String;)Ll0/b;

    move-result-object v1

    iput-object v1, v0, Ll0/c2;->b:Ll0/b;

    const-string v3, "ime"

    const/16 v4, 0x8

    invoke-static {v4, v3}, Ll0/e;->b(ILjava/lang/String;)Ll0/b;

    move-result-object v3

    iput-object v3, v0, Ll0/c2;->c:Ll0/b;

    const/16 v5, 0x20

    const-string v6, "mandatorySystemGestures"

    invoke-static {v5, v6}, Ll0/e;->b(ILjava/lang/String;)Ll0/b;

    move-result-object v5

    iput-object v5, v0, Ll0/c2;->d:Ll0/b;

    const-string v6, "navigationBars"

    const/4 v7, 0x2

    invoke-static {v7, v6}, Ll0/e;->b(ILjava/lang/String;)Ll0/b;

    move-result-object v6

    iput-object v6, v0, Ll0/c2;->e:Ll0/b;

    const-string v6, "statusBars"

    const/4 v8, 0x1

    invoke-static {v8, v6}, Ll0/e;->b(ILjava/lang/String;)Ll0/b;

    move-result-object v6

    iput-object v6, v0, Ll0/c2;->f:Ll0/b;

    const-string v6, "systemBars"

    const/4 v9, 0x7

    invoke-static {v9, v6}, Ll0/e;->b(ILjava/lang/String;)Ll0/b;

    move-result-object v6

    iput-object v6, v0, Ll0/c2;->g:Ll0/b;

    const/16 v10, 0x10

    const-string v11, "systemGestures"

    invoke-static {v10, v11}, Ll0/e;->b(ILjava/lang/String;)Ll0/b;

    move-result-object v10

    iput-object v10, v0, Ll0/c2;->h:Ll0/b;

    const-string v11, "tappableElement"

    const/16 v12, 0x40

    invoke-static {v12, v11}, Ll0/e;->b(ILjava/lang/String;)Ll0/b;

    move-result-object v11

    iput-object v11, v0, Ll0/c2;->i:Ll0/b;

    new-instance v13, Ll0/z1;

    new-instance v14, Ll0/y0;

    const/4 v15, 0x0

    invoke-direct {v14, v15, v15, v15, v15}, Ll0/y0;-><init>(IIII)V

    const-string v15, "waterfall"

    invoke-direct {v13, v14, v15}, Ll0/z1;-><init>(Ll0/y0;Ljava/lang/String;)V

    iput-object v13, v0, Ll0/c2;->j:Ll0/z1;

    new-instance v14, Ll0/w1;

    invoke-direct {v14, v6, v3}, Ll0/w1;-><init>(Ll0/b2;Ll0/b2;)V

    new-instance v3, Ll0/w1;

    invoke-direct {v3, v14, v1}, Ll0/w1;-><init>(Ll0/b2;Ll0/b2;)V

    iput-object v3, v0, Ll0/c2;->k:Ll0/w1;

    new-instance v1, Ll0/w1;

    invoke-direct {v1, v11, v5}, Ll0/w1;-><init>(Ll0/b2;Ll0/b2;)V

    new-instance v3, Ll0/w1;

    invoke-direct {v3, v1, v10}, Ll0/w1;-><init>(Ll0/b2;Ll0/b2;)V

    new-instance v1, Ll0/w1;

    invoke-direct {v1, v3, v13}, Ll0/w1;-><init>(Ll0/b2;Ll0/b2;)V

    const-string v1, "captionBarIgnoringVisibility"

    invoke-static {v2, v1}, Ll0/e;->d(ILjava/lang/String;)Ll0/z1;

    move-result-object v1

    iput-object v1, v0, Ll0/c2;->l:Ll0/z1;

    const-string v1, "navigationBarsIgnoringVisibility"

    invoke-static {v7, v1}, Ll0/e;->d(ILjava/lang/String;)Ll0/z1;

    move-result-object v1

    iput-object v1, v0, Ll0/c2;->m:Ll0/z1;

    const-string v1, "statusBarsIgnoringVisibility"

    invoke-static {v8, v1}, Ll0/e;->d(ILjava/lang/String;)Ll0/z1;

    move-result-object v1

    iput-object v1, v0, Ll0/c2;->n:Ll0/z1;

    const-string v1, "systemBarsIgnoringVisibility"

    invoke-static {v9, v1}, Ll0/e;->d(ILjava/lang/String;)Ll0/z1;

    move-result-object v1

    iput-object v1, v0, Ll0/c2;->o:Ll0/z1;

    const-string v1, "tappableElementIgnoringVisibility"

    invoke-static {v12, v1}, Ll0/e;->d(ILjava/lang/String;)Ll0/z1;

    move-result-object v1

    iput-object v1, v0, Ll0/c2;->p:Ll0/z1;

    const-string v1, "imeAnimationTarget"

    invoke-static {v4, v1}, Ll0/e;->d(ILjava/lang/String;)Ll0/z1;

    move-result-object v1

    iput-object v1, v0, Ll0/c2;->q:Ll0/z1;

    const-string v1, "imeAnimationSource"

    invoke-static {v4, v1}, Ll0/e;->d(ILjava/lang/String;)Ll0/z1;

    move-result-object v1

    iput-object v1, v0, Ll0/c2;->r:Ll0/z1;

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v2, v1, Landroid/view/View;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v1, Landroid/view/View;

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    if-eqz v1, :cond_1

    const v2, 0x7f0a0342

    invoke-virtual {v1, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v3

    :goto_1
    instance-of v2, v1, Ljava/lang/Boolean;

    if-eqz v2, :cond_2

    move-object v3, v1

    check-cast v3, Ljava/lang/Boolean;

    :cond_2
    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v15

    goto :goto_2

    :cond_3
    const/4 v15, 0x0

    :goto_2
    iput-boolean v15, v0, Ll0/c2;->s:Z

    new-instance v1, Ll0/v0;

    invoke-direct {v1, v0}, Ll0/v0;-><init>(Ll0/c2;)V

    iput-object v1, v0, Ll0/c2;->u:Ll0/v0;

    return-void
.end method

.method public static a(Ll0/c2;Lh5/q1;)V
    .locals 5

    iget-object v0, p0, Ll0/c2;->a:Ll0/b;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ll0/b;->f(Lh5/q1;I)V

    iget-object v0, p0, Ll0/c2;->c:Ll0/b;

    invoke-virtual {v0, p1, v1}, Ll0/b;->f(Lh5/q1;I)V

    iget-object v0, p0, Ll0/c2;->b:Ll0/b;

    invoke-virtual {v0, p1, v1}, Ll0/b;->f(Lh5/q1;I)V

    iget-object v0, p0, Ll0/c2;->e:Ll0/b;

    invoke-virtual {v0, p1, v1}, Ll0/b;->f(Lh5/q1;I)V

    iget-object v0, p0, Ll0/c2;->f:Ll0/b;

    invoke-virtual {v0, p1, v1}, Ll0/b;->f(Lh5/q1;I)V

    iget-object v0, p0, Ll0/c2;->g:Ll0/b;

    invoke-virtual {v0, p1, v1}, Ll0/b;->f(Lh5/q1;I)V

    iget-object v0, p0, Ll0/c2;->h:Ll0/b;

    invoke-virtual {v0, p1, v1}, Ll0/b;->f(Lh5/q1;I)V

    iget-object v0, p0, Ll0/c2;->i:Ll0/b;

    invoke-virtual {v0, p1, v1}, Ll0/b;->f(Lh5/q1;I)V

    iget-object v0, p0, Ll0/c2;->d:Ll0/b;

    invoke-virtual {v0, p1, v1}, Ll0/b;->f(Lh5/q1;I)V

    iget-object v0, p0, Ll0/c2;->l:Ll0/z1;

    const/4 v2, 0x4

    iget-object v3, p1, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {v3, v2}, Lh5/o1;->h(I)Lv4/b;

    move-result-object v2

    invoke-static {v2}, Ll0/f;->o(Lv4/b;)Ll0/y0;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll0/z1;->f(Ll0/y0;)V

    iget-object v0, p0, Ll0/c2;->m:Ll0/z1;

    iget-object v2, p1, Lh5/q1;->a:Lh5/o1;

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, Lh5/o1;->h(I)Lv4/b;

    move-result-object v2

    invoke-static {v2}, Ll0/f;->o(Lv4/b;)Ll0/y0;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll0/z1;->f(Ll0/y0;)V

    iget-object v0, p0, Ll0/c2;->n:Ll0/z1;

    iget-object v2, p1, Lh5/q1;->a:Lh5/o1;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lh5/o1;->h(I)Lv4/b;

    move-result-object v2

    invoke-static {v2}, Ll0/f;->o(Lv4/b;)Ll0/y0;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll0/z1;->f(Ll0/y0;)V

    iget-object v0, p0, Ll0/c2;->o:Ll0/z1;

    const/4 v2, 0x7

    iget-object v4, p1, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {v4, v2}, Lh5/o1;->h(I)Lv4/b;

    move-result-object v2

    invoke-static {v2}, Ll0/f;->o(Lv4/b;)Ll0/y0;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll0/z1;->f(Ll0/y0;)V

    iget-object v0, p0, Ll0/c2;->p:Ll0/z1;

    const/16 v2, 0x40

    iget-object v4, p1, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {v4, v2}, Lh5/o1;->h(I)Lv4/b;

    move-result-object v2

    invoke-static {v2}, Ll0/f;->o(Lv4/b;)Ll0/y0;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll0/z1;->f(Ll0/y0;)V

    iget-object p1, p1, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {p1}, Lh5/o1;->f()Lh5/h;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lh5/h;->a()Lv4/b;

    move-result-object p1

    iget-object p0, p0, Ll0/c2;->j:Ll0/z1;

    invoke-static {p1}, Ll0/f;->o(Lv4/b;)Ll0/y0;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll0/z1;->f(Ll0/y0;)V

    :cond_0
    sget-object p0, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter p0

    :try_start_0
    sget-object p1, Lz1/l;->j:Lz1/a;

    iget-object p1, p1, Lz1/b;->h:La0/w0;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, La0/w0;->h()Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, v3, :cond_1

    move v1, v3

    :cond_1
    monitor-exit p0

    if-eqz v1, :cond_2

    invoke-static {}, Lz1/l;->a()V

    :cond_2
    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
