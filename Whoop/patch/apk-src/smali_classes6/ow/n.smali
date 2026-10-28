.class public final Low/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lqw/c;

.field public final b:I

.field public final c:Low/a;

.field public final d:Ljava/util/HashMap;

.field public final e:Ljava/util/ArrayList;

.field public final f:Ljava/util/ArrayList;

.field public g:Z

.field public final h:I

.field public final i:I

.field public j:Z

.field public final k:Low/i;

.field public l:I

.field public final m:Z

.field public n:Low/x;

.field public final o:Low/u;

.field public final p:Ljava/util/ArrayDeque;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lqw/c;->y:Lqw/c;

    iput-object v0, p0, Low/n;->a:Lqw/c;

    const/4 v0, 0x1

    iput v0, p0, Low/n;->b:I

    sget-object v1, Low/h;->w:Low/a;

    iput-object v1, p0, Low/n;->c:Low/a;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Low/n;->d:Ljava/util/HashMap;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Low/n;->e:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Low/n;->f:Ljava/util/ArrayList;

    const/4 v1, 0x0

    iput-boolean v1, p0, Low/n;->g:Z

    sget-object v2, Low/m;->j:Low/i;

    const/4 v2, 0x2

    iput v2, p0, Low/n;->h:I

    iput v2, p0, Low/n;->i:I

    iput-boolean v0, p0, Low/n;->j:Z

    sget-object v2, Low/m;->j:Low/i;

    iput-object v2, p0, Low/n;->k:Low/i;

    iput v1, p0, Low/n;->l:I

    iput-boolean v0, p0, Low/n;->m:Z

    sget-object v0, Low/m;->k:Low/t;

    iput-object v0, p0, Low/n;->n:Low/x;

    sget-object v0, Low/m;->l:Low/u;

    iput-object v0, p0, Low/n;->o:Low/u;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Low/n;->p:Ljava/util/ArrayDeque;

    return-void
.end method


# virtual methods
.method public final a()Low/m;
    .locals 14

    new-instance v10, Ljava/util/ArrayList;

    iget-object v0, p0, Low/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget-object v2, p0, Low/n;->f:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/2addr v3, v1

    add-int/lit8 v3, v3, 0x3

    invoke-direct {v10, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-static {v10}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    sget-boolean v1, Luw/c;->a:Z

    iget v3, p0, Low/n;->h:I

    iget v4, p0, Low/n;->i:I

    const/4 v5, 0x2

    if-ne v3, v5, :cond_0

    if-eq v4, v5, :cond_2

    :cond_0
    new-instance v5, Lrw/b;

    sget-object v6, Lrw/e;->b:Lrw/d;

    invoke-direct {v5, v6, v3, v4}, Lrw/b;-><init>(Lrw/e;II)V

    sget-object v6, Lrw/s;->a:Lrw/q;

    new-instance v6, Lrw/q;

    const-class v7, Ljava/util/Date;

    const/4 v8, 0x0

    invoke-direct {v6, v7, v5, v8}, Lrw/q;-><init>(Ljava/lang/Class;Low/z;I)V

    if-eqz v1, :cond_1

    sget-object v5, Luw/c;->c:Luw/b;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v7, Lrw/b;

    invoke-direct {v7, v5, v3, v4}, Lrw/b;-><init>(Lrw/e;II)V

    iget-object v5, v5, Lrw/e;->a:Ljava/lang/Class;

    new-instance v9, Lrw/q;

    invoke-direct {v9, v5, v7, v8}, Lrw/q;-><init>(Ljava/lang/Class;Low/z;I)V

    sget-object v5, Luw/c;->b:Luw/b;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v7, Lrw/b;

    invoke-direct {v7, v5, v3, v4}, Lrw/b;-><init>(Lrw/e;II)V

    iget-object v3, v5, Lrw/e;->a:Ljava/lang/Class;

    new-instance v4, Lrw/q;

    invoke-direct {v4, v3, v7, v8}, Lrw/q;-><init>(Ljava/lang/Class;Low/z;I)V

    goto :goto_0

    :cond_1
    const/4 v9, 0x0

    move-object v4, v9

    :goto_0
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v1, :cond_2

    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    move-object v1, v0

    new-instance v0, Low/m;

    new-instance v3, Ljava/util/HashMap;

    iget-object v4, p0, Low/n;->d:Ljava/util/HashMap;

    invoke-direct {v3, v4}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iget-boolean v4, p0, Low/n;->g:Z

    iget-boolean v5, p0, Low/n;->j:Z

    iget v7, p0, Low/n;->l:I

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v11, p0, Low/n;->n:Low/x;

    new-instance v13, Ljava/util/ArrayList;

    iget-object v1, p0, Low/n;->p:Ljava/util/ArrayDeque;

    invoke-direct {v13, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v1, p0, Low/n;->a:Lqw/c;

    iget-object v2, p0, Low/n;->c:Low/a;

    iget-object v6, p0, Low/n;->k:Low/i;

    iget-boolean v8, p0, Low/n;->m:Z

    iget v9, p0, Low/n;->b:I

    iget-object v12, p0, Low/n;->o:Low/u;

    invoke-direct/range {v0 .. v13}, Low/m;-><init>(Lqw/c;Low/a;Ljava/util/HashMap;ZZLow/i;IZILjava/util/ArrayList;Low/x;Low/x;Ljava/util/ArrayList;)V

    return-object v0
.end method
