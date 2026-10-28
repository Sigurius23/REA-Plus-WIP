.class public final Lxe3/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final r:Ljava/util/LinkedHashSet;

.field public static final s:Ljava/util/Map;


# instance fields
.field public a:Lbf3/d;

.field public b:I

.field public c:I

.field public d:I

.field public e:Z

.field public f:I

.field public g:I

.field public h:I

.field public i:Z

.field public final j:Ljava/util/List;

.field public final k:Lkr/e;

.field public final l:Ljava/util/List;

.field public final m:I

.field public final n:Lxe3/e;

.field public final o:Lbi/p;

.field public final p:Ljava/util/ArrayList;

.field public final q:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Ljava/util/LinkedHashSet;

    const-class v6, Laf3/r;

    const-class v7, Laf3/o;

    const-class v1, Laf3/b;

    const-class v2, Laf3/k;

    const-class v3, Laf3/i;

    const-class v4, Laf3/l;

    const-class v5, Laf3/b0;

    filled-new-array/range {v1 .. v7}, [Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lxe3/g;->r:Ljava/util/LinkedHashSet;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lwe3/a;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lwe3/a;-><init>(I)V

    const-class v2, Laf3/b;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lwe3/a;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Lwe3/a;-><init>(I)V

    const-class v2, Laf3/k;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lwe3/a;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lwe3/a;-><init>(I)V

    const-class v2, Laf3/i;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lwe3/a;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lwe3/a;-><init>(I)V

    const-class v2, Laf3/l;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lwe3/a;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Lwe3/a;-><init>(I)V

    const-class v2, Laf3/b0;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lwe3/a;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Lwe3/a;-><init>(I)V

    const-class v2, Laf3/r;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lwe3/a;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Lwe3/a;-><init>(I)V

    const-class v2, Laf3/o;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lxe3/g;->s:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Lkr/e;Ljava/util/ArrayList;I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lxe3/g;->b:I

    const/4 v0, 0x0

    iput v0, p0, Lxe3/g;->c:I

    iput v0, p0, Lxe3/g;->d:I

    iput v0, p0, Lxe3/g;->f:I

    iput v0, p0, Lxe3/g;->g:I

    iput v0, p0, Lxe3/g;->h:I

    new-instance v1, Lbi/p;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Lbi/p;-><init>(I)V

    iput-object v1, p0, Lxe3/g;->o:Lbi/p;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lxe3/g;->p:Ljava/util/ArrayList;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lxe3/g;->q:Ljava/util/ArrayList;

    iput-object p1, p0, Lxe3/g;->j:Ljava/util/List;

    iput-object p2, p0, Lxe3/g;->k:Lkr/e;

    iput-object p3, p0, Lxe3/g;->l:Ljava/util/List;

    iput p4, p0, Lxe3/g;->m:I

    new-instance p1, Lxe3/e;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lxe3/e;-><init>(I)V

    iput-object p1, p0, Lxe3/g;->n:Lxe3/e;

    new-instance p2, Lxe3/f;

    invoke-direct {p2, p1, v0}, Lxe3/f;-><init>(Lcf3/a;I)V

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final a(Lxe3/f;)V
    .locals 3

    iget-object v0, p1, Lxe3/f;->a:Lcf3/a;

    :goto_0
    invoke-virtual {p0}, Lxe3/g;->h()Lcf3/a;

    move-result-object v1

    invoke-virtual {v0}, Lcf3/a;->f()Laf3/a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcf3/a;->c(Laf3/a;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lxe3/g;->f(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lxe3/g;->h()Lcf3/a;

    move-result-object v1

    invoke-virtual {v1}, Lcf3/a;->f()Laf3/a;

    move-result-object v1

    invoke-virtual {v0}, Lcf3/a;->f()Laf3/a;

    move-result-object v0

    invoke-virtual {v1, v0}, Laf3/t;->c(Laf3/t;)V

    iget-object v0, p0, Lxe3/g;->p:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b(Lxe3/p;)V
    .locals 5

    iget-object v0, p1, Lxe3/p;->b:Lxe3/l;

    invoke-virtual {v0}, Lxe3/l;->a()V

    iget-object v0, v0, Lxe3/l;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Laf3/q;

    iget-object v2, p1, Lxe3/p;->a:Laf3/w;

    invoke-virtual {v1}, Laf3/t;->j()V

    iget-object v3, v2, Laf3/t;->d:Laf3/t;

    iput-object v3, v1, Laf3/t;->d:Laf3/t;

    if-eqz v3, :cond_1

    iput-object v1, v3, Laf3/t;->e:Laf3/t;

    :cond_1
    iput-object v2, v1, Laf3/t;->e:Laf3/t;

    iput-object v1, v2, Laf3/t;->d:Laf3/t;

    iget-object v2, v2, Laf3/t;->a:Laf3/t;

    iput-object v2, v1, Laf3/t;->a:Laf3/t;

    iget-object v3, v1, Laf3/t;->d:Laf3/t;

    if-nez v3, :cond_2

    iput-object v1, v2, Laf3/t;->b:Laf3/t;

    :cond_2
    iget-object v2, p0, Lxe3/g;->o:Lbi/p;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v1, Laf3/q;->g:Ljava/lang/String;

    invoke-static {v3}, Lze3/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v2, v2, Lbi/p;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final c()V
    .locals 5

    iget-boolean v0, p0, Lxe3/g;->e:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lxe3/g;->c:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lxe3/g;->a:Lbf3/d;

    iget-object v1, v1, Lbf3/d;->a:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-interface {v1, v0, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    iget v1, p0, Lxe3/g;->d:I

    rem-int/lit8 v1, v1, 0x4

    rsub-int/lit8 v1, v1, 0x4

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    add-int/2addr v3, v1

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    const/16 v4, 0x20

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    iget v0, p0, Lxe3/g;->c:I

    if-nez v0, :cond_2

    iget-object v0, p0, Lxe3/g;->a:Lbf3/d;

    iget-object v0, v0, Lbf3/d;->a:Ljava/lang/CharSequence;

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lxe3/g;->a:Lbf3/d;

    iget-object v1, v1, Lbf3/d;->a:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-interface {v1, v0, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    :goto_1
    iget v1, p0, Lxe3/g;->m:I

    const/4 v2, 0x3

    if-ne v1, v2, :cond_3

    iget v1, p0, Lxe3/g;->b:I

    iget v2, p0, Lxe3/g;->c:I

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    new-instance v4, Laf3/y;

    invoke-direct {v4, v1, v2, v3}, Laf3/y;-><init>(III)V

    goto :goto_2

    :cond_3
    const/4 v4, 0x0

    :goto_2
    invoke-virtual {p0}, Lxe3/g;->h()Lcf3/a;

    move-result-object v1

    new-instance v2, Lbf3/d;

    invoke-direct {v2, v0, v4}, Lbf3/d;-><init>(Ljava/lang/CharSequence;Laf3/y;)V

    invoke-virtual {v1, v2}, Lcf3/a;->a(Lbf3/d;)V

    invoke-virtual {p0}, Lxe3/g;->d()V

    return-void
.end method

.method public final d()V
    .locals 6

    iget v0, p0, Lxe3/g;->m:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    :goto_0
    iget-object v0, p0, Lxe3/g;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxe3/f;

    iget v2, v0, Lxe3/f;->b:I

    iget-object v3, p0, Lxe3/g;->a:Lbf3/d;

    iget-object v3, v3, Lbf3/d;->a:Ljava/lang/CharSequence;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    sub-int/2addr v3, v2

    if-eqz v3, :cond_0

    iget-object v0, v0, Lxe3/f;->a:Lcf3/a;

    iget v4, p0, Lxe3/g;->b:I

    new-instance v5, Laf3/y;

    invoke-direct {v5, v4, v2, v3}, Laf3/y;-><init>(III)V

    invoke-virtual {v0, v5}, Lcf3/a;->b(Laf3/y;)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, Lxe3/g;->a:Lbf3/d;

    iget-object v0, v0, Lbf3/d;->a:Ljava/lang/CharSequence;

    iget v1, p0, Lxe3/g;->c:I

    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    iget v1, p0, Lxe3/g;->c:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lxe3/g;->c:I

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    iget v0, p0, Lxe3/g;->d:I

    rem-int/lit8 v1, v0, 0x4

    rsub-int/lit8 v1, v1, 0x4

    add-int/2addr v1, v0

    iput v1, p0, Lxe3/g;->d:I

    return-void

    :cond_0
    iget v0, p0, Lxe3/g;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lxe3/g;->d:I

    return-void
.end method

.method public final f(I)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_1

    iget-object v1, p0, Lxe3/g;->p:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxe3/f;

    iget-object v1, v1, Lxe3/f;->a:Lcf3/a;

    instance-of v2, v1, Lxe3/p;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lxe3/p;

    invoke-virtual {p0, v2}, Lxe3/g;->b(Lxe3/p;)V

    :cond_0
    invoke-virtual {v1}, Lcf3/a;->e()V

    iget-object v2, p0, Lxe3/g;->q:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final g()V
    .locals 5

    iget v0, p0, Lxe3/g;->c:I

    iget v1, p0, Lxe3/g;->d:I

    const/4 v2, 0x1

    iput-boolean v2, p0, Lxe3/g;->i:Z

    iget-object v2, p0, Lxe3/g;->a:Lbf3/d;

    iget-object v2, v2, Lbf3/d;->a:Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    :goto_0
    if-ge v0, v2, :cond_2

    iget-object v3, p0, Lxe3/g;->a:Lbf3/d;

    iget-object v3, v3, Lbf3/d;->a:Ljava/lang/CharSequence;

    invoke-interface {v3, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    const/16 v4, 0x9

    if-eq v3, v4, :cond_1

    const/16 v4, 0x20

    if-eq v3, v4, :cond_0

    const/4 v2, 0x0

    iput-boolean v2, p0, Lxe3/g;->i:Z

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    rem-int/lit8 v3, v1, 0x4

    rsub-int/lit8 v3, v3, 0x4

    add-int/2addr v1, v3

    goto :goto_0

    :cond_2
    :goto_1
    iput v0, p0, Lxe3/g;->f:I

    iput v1, p0, Lxe3/g;->g:I

    iget v0, p0, Lxe3/g;->d:I

    sub-int/2addr v1, v0

    iput v1, p0, Lxe3/g;->h:I

    return-void
.end method

.method public final h()Lcf3/a;
    .locals 2

    iget-object v0, p0, Lxe3/g;->p:Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lm4/a;->d(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxe3/f;

    iget-object v0, v0, Lxe3/f;->a:Lcf3/a;

    return-object v0
.end method

.method public final i(Ljava/lang/String;)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lxe3/g;->b:I

    const/4 v3, 0x1

    add-int/2addr v2, v3

    iput v2, v0, Lxe3/g;->b:I

    const/4 v2, 0x0

    iput v2, v0, Lxe3/g;->c:I

    iput v2, v0, Lxe3/g;->d:I

    iput-boolean v2, v0, Lxe3/g;->e:Z

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    move v6, v2

    const/4 v7, 0x0

    :goto_0
    if-ge v6, v4, :cond_3

    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-nez v8, :cond_1

    if-nez v7, :cond_0

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v7, v1, v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    :cond_0
    const v8, 0xfffd

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    if-eqz v7, :cond_2

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_2
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    if-eqz v7, :cond_4

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_4
    iget v4, v0, Lxe3/g;->m:I

    if-eq v4, v3, :cond_5

    iget v4, v0, Lxe3/g;->b:I

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v6

    new-instance v7, Laf3/y;

    invoke-direct {v7, v4, v2, v6}, Laf3/y;-><init>(III)V

    goto :goto_2

    :cond_5
    const/4 v7, 0x0

    :goto_2
    new-instance v4, Lbf3/d;

    invoke-direct {v4, v1, v7}, Lbf3/d;-><init>(Ljava/lang/CharSequence;Laf3/y;)V

    iput-object v4, v0, Lxe3/g;->a:Lbf3/d;

    move v1, v3

    move v4, v1

    :goto_3
    iget-object v6, v0, Lxe3/g;->p:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v7

    const/4 v8, -0x1

    if-ge v1, v7, :cond_9

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lxe3/f;

    iget-object v9, v7, Lxe3/f;->a:Lcf3/a;

    invoke-virtual {v0}, Lxe3/g;->g()V

    invoke-virtual {v9, v0}, Lcf3/a;->i(Lxe3/g;)Lha/h;

    move-result-object v9

    if-eqz v9, :cond_9

    iget v10, v0, Lxe3/g;->c:I

    iput v10, v7, Lxe3/f;->b:I

    iget-boolean v7, v9, Lha/h;->b:Z

    if-eqz v7, :cond_6

    invoke-virtual {v0}, Lxe3/g;->d()V

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v1

    invoke-virtual {v0, v2}, Lxe3/g;->f(I)V

    return-void

    :cond_6
    iget v6, v9, Lha/h;->a:I

    if-eq v6, v8, :cond_7

    invoke-virtual {v0, v6}, Lxe3/g;->k(I)V

    goto :goto_4

    :cond_7
    iget v6, v9, Lha/h;->c:I

    if-eq v6, v8, :cond_8

    invoke-virtual {v0, v6}, Lxe3/g;->j(I)V

    :cond_8
    :goto_4
    add-int/lit8 v4, v4, 0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_9
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr v1, v4

    sub-int/2addr v4, v3

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lxe3/f;

    iget-object v4, v4, Lxe3/f;->a:Lcf3/a;

    iget v7, v0, Lxe3/g;->c:I

    invoke-virtual {v4}, Lcf3/a;->f()Laf3/a;

    move-result-object v9

    instance-of v9, v9, Laf3/w;

    if-nez v9, :cond_b

    invoke-virtual {v4}, Lcf3/a;->g()Z

    move-result v9

    if-eqz v9, :cond_a

    goto :goto_5

    :cond_a
    move v9, v2

    goto :goto_6

    :cond_b
    :goto_5
    move v9, v3

    :goto_6
    move v10, v2

    :goto_7
    if-eqz v9, :cond_6c

    iget v7, v0, Lxe3/g;->c:I

    invoke-virtual {v0}, Lxe3/g;->g()V

    iget-boolean v11, v0, Lxe3/g;->i:Z

    if-nez v11, :cond_c

    iget v11, v0, Lxe3/g;->h:I

    const/4 v12, 0x4

    if-ge v11, v12, :cond_d

    iget-object v11, v0, Lxe3/g;->a:Lbf3/d;

    iget-object v11, v11, Lbf3/d;->a:Ljava/lang/CharSequence;

    iget v13, v0, Lxe3/g;->f:I

    invoke-static {v11, v13}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v11

    invoke-static {v11}, Ljava/lang/Character;->isLetter(I)Z

    move-result v11

    if-eqz v11, :cond_d

    :cond_c
    move-object/from16 v22, v4

    move/from16 v23, v7

    goto/16 :goto_3d

    :cond_d
    new-instance v11, Lty/c;

    const/16 v13, 0x16

    invoke-direct {v11, v4, v13}, Lty/c;-><init>(Ljava/lang/Object;I)V

    iget-object v13, v0, Lxe3/g;->j:Ljava/util/List;

    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_8
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_63

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lwe3/a;

    iget v14, v14, Lwe3/a;->a:I

    const/16 v15, 0x2a

    move/from16 v16, v2

    const/16 v8, 0x20

    const/16 v3, 0x9

    iget-object v5, v11, Lty/c;->x:Ljava/lang/Object;

    packed-switch v14, :pswitch_data_0

    iget v5, v0, Lxe3/g;->h:I

    if-lt v5, v12, :cond_e

    goto/16 :goto_c

    :cond_e
    iget v5, v0, Lxe3/g;->f:I

    iget-object v14, v0, Lxe3/g;->a:Lbf3/d;

    iget-object v14, v14, Lbf3/d;->a:Ljava/lang/CharSequence;

    invoke-interface {v14}, Ljava/lang/CharSequence;->length()I

    move-result v12

    move/from16 v21, v16

    move/from16 v22, v21

    move/from16 v23, v22

    :goto_9
    if-ge v5, v12, :cond_13

    invoke-interface {v14, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    if-eq v2, v3, :cond_12

    if-eq v2, v8, :cond_12

    if-eq v2, v15, :cond_11

    const/16 v8, 0x2d

    if-eq v2, v8, :cond_10

    const/16 v8, 0x5f

    if-eq v2, v8, :cond_f

    goto :goto_c

    :cond_f
    move/from16 v2, v22

    add-int/lit8 v22, v2, 0x1

    :goto_a
    move/from16 v8, v21

    goto :goto_b

    :cond_10
    move/from16 v2, v22

    move/from16 v8, v21

    add-int/lit8 v21, v8, 0x1

    goto :goto_a

    :cond_11
    move/from16 v8, v21

    move/from16 v2, v22

    move/from16 v3, v23

    add-int/lit8 v23, v3, 0x1

    goto :goto_b

    :cond_12
    move/from16 v8, v21

    move/from16 v2, v22

    move/from16 v3, v23

    move/from16 v22, v2

    move/from16 v23, v3

    :goto_b
    add-int/lit8 v5, v5, 0x1

    move/from16 v21, v8

    const/16 v3, 0x9

    const/16 v8, 0x20

    goto :goto_9

    :cond_13
    move/from16 v8, v21

    move/from16 v2, v22

    move/from16 v3, v23

    const/4 v5, 0x3

    if-lt v8, v5, :cond_14

    if-nez v2, :cond_14

    if-eqz v3, :cond_16

    :cond_14
    if-lt v2, v5, :cond_15

    if-nez v8, :cond_15

    if-eqz v3, :cond_16

    :cond_15
    if-lt v3, v5, :cond_17

    if-nez v8, :cond_17

    if-nez v2, :cond_17

    :cond_16
    new-instance v2, Lxe3/e;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lxe3/e;-><init>(I)V

    new-array v5, v3, [Lcf3/a;

    aput-object v2, v5, v16

    new-instance v2, Lxe3/b;

    invoke-direct {v2, v5}, Lxe3/b;-><init>([Lcf3/a;)V

    invoke-interface {v14}, Ljava/lang/CharSequence;->length()I

    move-result v3

    iput v3, v2, Lxe3/b;->b:I

    goto :goto_d

    :cond_17
    :goto_c
    const/4 v2, 0x0

    :goto_d
    move-object/from16 v22, v4

    move/from16 v23, v7

    :goto_e
    move/from16 v3, v16

    goto/16 :goto_38

    :pswitch_0
    check-cast v5, Lcf3/a;

    iget v2, v0, Lxe3/g;->h:I

    const/4 v3, 0x4

    if-lt v2, v3, :cond_18

    move-object/from16 v22, v4

    move/from16 v23, v7

    goto/16 :goto_17

    :cond_18
    iget v3, v0, Lxe3/g;->f:I

    iget v8, v0, Lxe3/g;->d:I

    add-int/2addr v8, v2

    invoke-virtual {v11}, Lty/c;->p()Laa3/u0;

    move-result-object v2

    iget-object v2, v2, Laa3/u0;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    iget-object v12, v0, Lxe3/g;->a:Lbf3/d;

    iget-object v12, v12, Lbf3/d;->a:Ljava/lang/CharSequence;

    invoke-interface {v12, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v14

    if-eq v14, v15, :cond_1e

    const/16 v15, 0x2b

    if-eq v14, v15, :cond_1e

    const/16 v15, 0x2d

    if-eq v14, v15, :cond_1e

    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    move-result v14

    move/from16 v19, v2

    move v2, v3

    move/from16 v15, v16

    :goto_f
    move-object/from16 v22, v4

    if-ge v2, v14, :cond_1c

    invoke-interface {v12, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    move/from16 v23, v7

    const/16 v7, 0x29

    if-eq v4, v7, :cond_1a

    const/16 v7, 0x2e

    if-eq v4, v7, :cond_1a

    packed-switch v4, :pswitch_data_1

    goto :goto_10

    :pswitch_1
    add-int/lit8 v15, v15, 0x1

    const/16 v4, 0x9

    if-le v15, v4, :cond_19

    goto :goto_10

    :cond_19
    add-int/lit8 v2, v2, 0x1

    move-object/from16 v4, v22

    move/from16 v7, v23

    goto :goto_f

    :cond_1a
    const/4 v7, 0x1

    if-lt v15, v7, :cond_1d

    add-int/lit8 v7, v2, 0x1

    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    move-result v14

    if-ge v7, v14, :cond_1b

    invoke-interface {v12, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v14

    const/16 v15, 0x9

    if-eq v14, v15, :cond_1b

    const/16 v15, 0x20

    if-eq v14, v15, :cond_1b

    goto :goto_10

    :cond_1b
    invoke-interface {v12, v3, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v14, Laf3/v;

    invoke-direct {v14}, Laf3/t;-><init>()V

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    iput v2, v14, Laf3/v;->h:I

    iput-char v4, v14, Laf3/v;->i:C

    new-instance v2, Lxe3/m;

    invoke-direct {v2, v14, v7}, Lxe3/m;-><init>(Laf3/r;I)V

    goto :goto_11

    :cond_1c
    move/from16 v23, v7

    :cond_1d
    :goto_10
    const/4 v2, 0x0

    goto :goto_11

    :cond_1e
    move/from16 v19, v2

    move-object/from16 v22, v4

    move/from16 v23, v7

    add-int/lit8 v2, v3, 0x1

    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-ge v2, v4, :cond_1f

    invoke-interface {v12, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    const/16 v15, 0x9

    if-eq v4, v15, :cond_1f

    const/16 v15, 0x20

    if-eq v4, v15, :cond_1f

    goto :goto_10

    :cond_1f
    new-instance v4, Laf3/c;

    invoke-direct {v4}, Laf3/t;-><init>()V

    iput-char v14, v4, Laf3/c;->h:C

    new-instance v7, Lxe3/m;

    invoke-direct {v7, v4, v2}, Lxe3/m;-><init>(Laf3/r;I)V

    move-object v2, v7

    :goto_11
    if-nez v2, :cond_20

    goto :goto_15

    :cond_20
    iget-object v4, v2, Lxe3/m;->a:Laf3/r;

    iget v2, v2, Lxe3/m;->b:I

    sub-int v3, v2, v3

    add-int/2addr v3, v8

    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    move-result v7

    move v8, v3

    :goto_12
    if-ge v2, v7, :cond_23

    invoke-interface {v12, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v14

    const/16 v15, 0x9

    if-ne v14, v15, :cond_21

    rem-int/lit8 v14, v8, 0x4

    const/16 v20, 0x4

    rsub-int/lit8 v14, v14, 0x4

    add-int/2addr v14, v8

    move v8, v14

    goto :goto_13

    :cond_21
    const/16 v15, 0x20

    if-ne v14, v15, :cond_22

    add-int/lit8 v8, v8, 0x1

    :goto_13
    add-int/lit8 v2, v2, 0x1

    goto :goto_12

    :cond_22
    const/4 v2, 0x1

    goto :goto_14

    :cond_23
    move/from16 v2, v16

    :goto_14
    if-nez v19, :cond_25

    instance-of v7, v4, Laf3/v;

    if-eqz v7, :cond_24

    move-object v7, v4

    check-cast v7, Laf3/v;

    iget v7, v7, Laf3/v;->h:I

    const/4 v12, 0x1

    if-eq v7, v12, :cond_24

    goto :goto_15

    :cond_24
    if-nez v2, :cond_25

    :goto_15
    const/4 v2, 0x0

    goto :goto_16

    :cond_25
    if-eqz v2, :cond_26

    sub-int v2, v8, v3

    const/4 v7, 0x4

    if-le v2, v7, :cond_27

    :cond_26
    add-int/lit8 v8, v3, 0x1

    :cond_27
    new-instance v2, Lxe3/m;

    invoke-direct {v2, v4, v8}, Lxe3/m;-><init>(Laf3/r;I)V

    :goto_16
    if-nez v2, :cond_29

    :cond_28
    :goto_17
    const/4 v2, 0x0

    goto/16 :goto_e

    :cond_29
    iget-object v3, v2, Lxe3/m;->a:Laf3/r;

    iget v2, v2, Lxe3/m;->b:I

    new-instance v4, Lxe3/o;

    iget v7, v0, Lxe3/g;->d:I

    sub-int v7, v2, v7

    invoke-direct {v4, v7}, Lxe3/o;-><init>(I)V

    instance-of v7, v5, Lxe3/n;

    if-eqz v7, :cond_2c

    check-cast v5, Lxe3/n;

    iget-object v5, v5, Lxe3/n;->a:Laf3/r;

    instance-of v7, v5, Laf3/c;

    if-eqz v7, :cond_2a

    instance-of v7, v3, Laf3/c;

    if-eqz v7, :cond_2a

    check-cast v5, Laf3/c;

    iget-char v5, v5, Laf3/c;->h:C

    invoke-static {v5}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v5

    move-object v7, v3

    check-cast v7, Laf3/c;

    iget-char v7, v7, Laf3/c;->h:C

    invoke-static {v7}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_18

    :cond_2a
    instance-of v7, v5, Laf3/v;

    if-eqz v7, :cond_2b

    instance-of v7, v3, Laf3/v;

    if-eqz v7, :cond_2b

    check-cast v5, Laf3/v;

    iget-char v5, v5, Laf3/v;->i:C

    invoke-static {v5}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v5

    move-object v7, v3

    check-cast v7, Laf3/v;

    iget-char v7, v7, Laf3/v;->i:C

    invoke-static {v7}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_18

    :cond_2b
    move/from16 v5, v16

    :goto_18
    if-nez v5, :cond_2d

    :cond_2c
    const/4 v7, 0x1

    goto :goto_1a

    :cond_2d
    const/4 v7, 0x1

    new-array v3, v7, [Lcf3/a;

    aput-object v4, v3, v16

    new-instance v4, Lxe3/b;

    invoke-direct {v4, v3}, Lxe3/b;-><init>([Lcf3/a;)V

    iput v2, v4, Lxe3/b;->c:I

    :goto_19
    move-object v2, v4

    goto/16 :goto_e

    :goto_1a
    new-instance v5, Lxe3/n;

    invoke-direct {v5, v3}, Lxe3/n;-><init>(Laf3/r;)V

    iput-boolean v7, v3, Laf3/r;->g:Z

    const/4 v3, 0x2

    new-array v3, v3, [Lcf3/a;

    aput-object v5, v3, v16

    aput-object v4, v3, v7

    new-instance v4, Lxe3/b;

    invoke-direct {v4, v3}, Lxe3/b;-><init>([Lcf3/a;)V

    iput v2, v4, Lxe3/b;->c:I

    goto :goto_19

    :pswitch_2
    move-object/from16 v22, v4

    move/from16 v23, v7

    iget v2, v0, Lxe3/g;->h:I

    const/4 v3, 0x4

    if-lt v2, v3, :cond_28

    iget-boolean v2, v0, Lxe3/g;->i:Z

    if-nez v2, :cond_28

    invoke-virtual {v0}, Lxe3/g;->h()Lcf3/a;

    move-result-object v2

    invoke-virtual {v2}, Lcf3/a;->f()Laf3/a;

    move-result-object v2

    instance-of v2, v2, Laf3/w;

    if-nez v2, :cond_28

    new-instance v2, Lxe3/i;

    invoke-direct {v2}, Lxe3/i;-><init>()V

    const/4 v7, 0x1

    new-array v3, v7, [Lcf3/a;

    aput-object v2, v3, v16

    new-instance v2, Lxe3/b;

    invoke-direct {v2, v3}, Lxe3/b;-><init>([Lcf3/a;)V

    iget v3, v0, Lxe3/g;->d:I

    const/16 v20, 0x4

    add-int/lit8 v3, v3, 0x4

    iput v3, v2, Lxe3/b;->c:I

    goto/16 :goto_e

    :pswitch_3
    move-object/from16 v22, v4

    move/from16 v23, v7

    iget v2, v0, Lxe3/g;->f:I

    iget-object v3, v0, Lxe3/g;->a:Lbf3/d;

    iget-object v3, v3, Lbf3/d;->a:Ljava/lang/CharSequence;

    iget v4, v0, Lxe3/g;->h:I

    const/4 v7, 0x4

    if-ge v4, v7, :cond_28

    invoke-interface {v3, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    const/16 v7, 0x3c

    if-ne v4, v7, :cond_28

    const/4 v4, 0x1

    :goto_1b
    const/4 v7, 0x7

    if-gt v4, v7, :cond_28

    if-ne v4, v7, :cond_2e

    move-object v7, v5

    check-cast v7, Lcf3/a;

    invoke-virtual {v7}, Lcf3/a;->f()Laf3/a;

    move-result-object v7

    instance-of v7, v7, Laf3/w;

    if-nez v7, :cond_2f

    invoke-virtual {v0}, Lxe3/g;->h()Lcf3/a;

    move-result-object v7

    invoke-virtual {v7}, Lcf3/a;->d()Z

    move-result v7

    if-eqz v7, :cond_2e

    goto :goto_1c

    :cond_2e
    sget-object v7, Lxe3/j;->e:[[Ljava/util/regex/Pattern;

    aget-object v7, v7, v4

    aget-object v8, v7, v16

    const/4 v12, 0x1

    aget-object v7, v7, v12

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v14

    invoke-interface {v3, v2, v14}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v14

    invoke-virtual {v8, v14}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v8

    invoke-virtual {v8}, Ljava/util/regex/Matcher;->find()Z

    move-result v8

    if-eqz v8, :cond_2f

    new-instance v2, Lxe3/j;

    invoke-direct {v2, v7}, Lxe3/j;-><init>(Ljava/util/regex/Pattern;)V

    new-array v3, v12, [Lcf3/a;

    aput-object v2, v3, v16

    new-instance v2, Lxe3/b;

    invoke-direct {v2, v3}, Lxe3/b;-><init>([Lcf3/a;)V

    iget v3, v0, Lxe3/g;->c:I

    iput v3, v2, Lxe3/b;->b:I

    goto/16 :goto_e

    :cond_2f
    :goto_1c
    add-int/lit8 v4, v4, 0x1

    goto :goto_1b

    :pswitch_4
    move-object/from16 v22, v4

    move/from16 v23, v7

    iget v2, v0, Lxe3/g;->h:I

    const/4 v3, 0x4

    if-lt v2, v3, :cond_30

    goto/16 :goto_17

    :cond_30
    iget-object v2, v0, Lxe3/g;->a:Lbf3/d;

    iget v3, v0, Lxe3/g;->f:I

    iget-object v4, v2, Lbf3/d;->a:Ljava/lang/CharSequence;

    invoke-interface {v4, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    const/16 v7, 0x23

    if-ne v5, v7, :cond_3d

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v5

    invoke-virtual {v2, v3, v5}, Lbf3/d;->a(II)Lbf3/d;

    move-result-object v2

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Lab/l0;

    invoke-direct {v2, v5}, Lab/l0;-><init>(Ljava/util/List;)V

    invoke-virtual {v2, v7}, Lab/l0;->g(C)I

    move-result v5

    if-eqz v5, :cond_31

    const/4 v8, 0x6

    if-le v5, v8, :cond_32

    :cond_31
    :goto_1d
    const/4 v8, 0x2

    goto/16 :goto_21

    :cond_32
    invoke-virtual {v2}, Lab/l0;->e()Z

    move-result v8

    if-nez v8, :cond_33

    new-instance v2, Lxe3/i;

    new-instance v7, Laa3/u0;

    const/4 v8, 0x2

    invoke-direct {v7, v8}, Laa3/u0;-><init>(I)V

    invoke-direct {v2, v5, v7}, Lxe3/i;-><init>(ILaa3/u0;)V

    const/4 v8, 0x2

    goto/16 :goto_22

    :cond_33
    invoke-virtual {v2}, Lab/l0;->l()C

    move-result v8

    const/16 v15, 0x20

    if-eq v8, v15, :cond_34

    const/16 v15, 0x9

    if-eq v8, v15, :cond_35

    goto :goto_1d

    :cond_34
    const/16 v15, 0x9

    :cond_35
    invoke-virtual {v2}, Lab/l0;->o()I

    invoke-virtual {v2}, Lab/l0;->m()Lc9/k;

    move-result-object v8

    move-object v14, v8

    const/4 v12, 0x1

    :goto_1e
    invoke-virtual {v2}, Lab/l0;->e()Z

    move-result v19

    if-eqz v19, :cond_3b

    invoke-virtual {v2}, Lab/l0;->l()C

    move-result v7

    if-eq v7, v15, :cond_3a

    const/16 v15, 0x20

    if-eq v7, v15, :cond_3a

    const/16 v15, 0x23

    if-eq v7, v15, :cond_36

    invoke-virtual {v2}, Lab/l0;->i()V

    invoke-virtual {v2}, Lab/l0;->m()Lc9/k;

    move-result-object v14

    move/from16 v12, v16

    goto :goto_20

    :cond_36
    if-eqz v12, :cond_39

    invoke-virtual {v2, v15}, Lab/l0;->g(C)I

    invoke-virtual {v2}, Lab/l0;->o()I

    move-result v7

    invoke-virtual {v2}, Lab/l0;->e()Z

    move-result v12

    if-eqz v12, :cond_37

    invoke-virtual {v2}, Lab/l0;->m()Lc9/k;

    move-result-object v14

    :cond_37
    if-lez v7, :cond_38

    const/4 v7, 0x1

    goto :goto_1f

    :cond_38
    move/from16 v7, v16

    :goto_1f
    move v12, v7

    goto :goto_20

    :cond_39
    invoke-virtual {v2}, Lab/l0;->i()V

    invoke-virtual {v2}, Lab/l0;->m()Lc9/k;

    move-result-object v14

    goto :goto_20

    :cond_3a
    const/16 v15, 0x23

    invoke-virtual {v2}, Lab/l0;->i()V

    const/4 v12, 0x1

    :goto_20
    move v7, v15

    const/16 v15, 0x9

    goto :goto_1e

    :cond_3b
    invoke-virtual {v2, v8, v14}, Lab/l0;->d(Lc9/k;Lc9/k;)Laa3/u0;

    move-result-object v2

    invoke-virtual {v2}, Laa3/u0;->m()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_3c

    new-instance v2, Lxe3/i;

    new-instance v7, Laa3/u0;

    const/4 v8, 0x2

    invoke-direct {v7, v8}, Laa3/u0;-><init>(I)V

    invoke-direct {v2, v5, v7}, Lxe3/i;-><init>(ILaa3/u0;)V

    goto :goto_22

    :cond_3c
    const/4 v8, 0x2

    new-instance v7, Lxe3/i;

    invoke-direct {v7, v5, v2}, Lxe3/i;-><init>(ILaa3/u0;)V

    move-object v2, v7

    goto :goto_22

    :goto_21
    const/4 v2, 0x0

    :goto_22
    if-eqz v2, :cond_3e

    const/4 v7, 0x1

    new-array v3, v7, [Lcf3/a;

    aput-object v2, v3, v16

    new-instance v2, Lxe3/b;

    invoke-direct {v2, v3}, Lxe3/b;-><init>([Lcf3/a;)V

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v3

    iput v3, v2, Lxe3/b;->b:I

    goto/16 :goto_e

    :cond_3d
    const/4 v8, 0x2

    :cond_3e
    invoke-interface {v4, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    const/16 v15, 0x2d

    if-eq v2, v15, :cond_42

    const/16 v5, 0x3d

    if-eq v2, v5, :cond_3f

    goto :goto_27

    :cond_3f
    add-int/lit8 v2, v3, 0x1

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v7

    :goto_23
    if-ge v2, v7, :cond_41

    invoke-interface {v4, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v12

    if-eq v12, v5, :cond_40

    move v7, v2

    goto :goto_24

    :cond_40
    add-int/lit8 v2, v2, 0x1

    goto :goto_23

    :cond_41
    :goto_24
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-static {v4, v7, v2}, Ls3/d;->r(Ljava/lang/CharSequence;II)I

    move-result v2

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-lt v2, v5, :cond_42

    const/4 v8, 0x1

    goto :goto_28

    :cond_42
    add-int/lit8 v3, v3, 0x1

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v2

    :goto_25
    if-ge v3, v2, :cond_44

    invoke-interface {v4, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    const/16 v15, 0x2d

    if-eq v5, v15, :cond_43

    move v2, v3

    goto :goto_26

    :cond_43
    add-int/lit8 v3, v3, 0x1

    goto :goto_25

    :cond_44
    :goto_26
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v3

    invoke-static {v4, v2, v3}, Ls3/d;->r(Ljava/lang/CharSequence;II)I

    move-result v2

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-lt v2, v3, :cond_45

    goto :goto_28

    :cond_45
    :goto_27
    move/from16 v8, v16

    :goto_28
    if-lez v8, :cond_28

    invoke-virtual {v11}, Lty/c;->p()Laa3/u0;

    move-result-object v2

    iget-object v3, v2, Laa3/u0;->a:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_28

    new-instance v3, Lxe3/i;

    invoke-direct {v3, v8, v2}, Lxe3/i;-><init>(ILaa3/u0;)V

    const/4 v7, 0x1

    new-array v2, v7, [Lcf3/a;

    aput-object v3, v2, v16

    new-instance v3, Lxe3/b;

    invoke-direct {v3, v2}, Lxe3/b;-><init>([Lcf3/a;)V

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v2

    iput v2, v3, Lxe3/b;->b:I

    iput-boolean v7, v3, Lxe3/b;->d:Z

    :goto_29
    move-object v2, v3

    goto/16 :goto_e

    :pswitch_5
    move-object/from16 v22, v4

    move/from16 v23, v7

    iget v2, v0, Lxe3/g;->h:I

    const/4 v3, 0x4

    if-lt v2, v3, :cond_46

    goto/16 :goto_17

    :cond_46
    iget v4, v0, Lxe3/g;->f:I

    iget-object v5, v0, Lxe3/g;->a:Lbf3/d;

    iget-object v5, v5, Lbf3/d;->a:Ljava/lang/CharSequence;

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v7

    move v14, v4

    move/from16 v8, v16

    move v12, v8

    :goto_2a
    const/16 v15, 0x7e

    const/16 v3, 0x60

    move/from16 v17, v4

    if-ge v14, v7, :cond_47

    invoke-interface {v5, v14}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    if-eq v4, v3, :cond_49

    if-eq v4, v15, :cond_48

    :cond_47
    const/4 v4, 0x3

    goto :goto_2c

    :cond_48
    add-int/lit8 v12, v12, 0x1

    goto :goto_2b

    :cond_49
    add-int/lit8 v8, v8, 0x1

    :goto_2b
    add-int/lit8 v14, v14, 0x1

    move/from16 v4, v17

    const/4 v3, 0x4

    goto :goto_2a

    :goto_2c
    if-lt v8, v4, :cond_4b

    if-nez v12, :cond_4b

    add-int v4, v17, v8

    invoke-static {v3, v5, v4}, Ls3/d;->f(CLjava/lang/CharSequence;I)I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_4a

    goto :goto_2d

    :cond_4a
    new-instance v4, Lxe3/h;

    invoke-direct {v4, v8, v2, v3}, Lxe3/h;-><init>(IIC)V

    goto :goto_2e

    :cond_4b
    if-lt v12, v4, :cond_4c

    if-nez v8, :cond_4c

    new-instance v4, Lxe3/h;

    invoke-direct {v4, v12, v2, v15}, Lxe3/h;-><init>(IIC)V

    goto :goto_2e

    :cond_4c
    :goto_2d
    const/4 v4, 0x0

    :goto_2e
    if-eqz v4, :cond_28

    const/4 v7, 0x1

    new-array v2, v7, [Lcf3/a;

    aput-object v4, v2, v16

    new-instance v3, Lxe3/b;

    invoke-direct {v3, v2}, Lxe3/b;-><init>([Lcf3/a;)V

    iget-object v2, v4, Lxe3/h;->a:Laf3/i;

    iget v2, v2, Laf3/i;->h:I

    add-int v4, v17, v2

    iput v4, v3, Lxe3/b;->b:I

    goto :goto_29

    :pswitch_6
    move-object/from16 v22, v4

    move/from16 v23, v7

    iget v2, v0, Lxe3/g;->f:I

    invoke-static {v0, v2}, Lxe3/a;->j(Lxe3/g;I)Z

    move-result v3

    if-eqz v3, :cond_4f

    iget v3, v0, Lxe3/g;->d:I

    iget v4, v0, Lxe3/g;->h:I

    add-int/2addr v3, v4

    add-int/lit8 v4, v3, 0x1

    iget-object v5, v0, Lxe3/g;->a:Lbf3/d;

    iget-object v5, v5, Lbf3/d;->a:Ljava/lang/CharSequence;

    add-int/lit8 v2, v2, 0x1

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-ge v2, v7, :cond_4e

    invoke-interface {v5, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    const/16 v15, 0x9

    if-eq v2, v15, :cond_4d

    const/16 v15, 0x20

    if-eq v2, v15, :cond_4d

    goto :goto_2f

    :cond_4d
    add-int/lit8 v4, v3, 0x2

    :cond_4e
    :goto_2f
    new-instance v2, Lxe3/a;

    invoke-direct {v2}, Lxe3/a;-><init>()V

    const/4 v7, 0x1

    new-array v3, v7, [Lcf3/a;

    aput-object v2, v3, v16

    new-instance v2, Lxe3/b;

    invoke-direct {v2, v3}, Lxe3/b;-><init>([Lcf3/a;)V

    iput v4, v2, Lxe3/b;->c:I

    goto/16 :goto_e

    :cond_4f
    const/4 v7, 0x1

    goto/16 :goto_17

    :pswitch_7
    move-object/from16 v22, v4

    move/from16 v23, v7

    const/4 v7, 0x1

    invoke-virtual {v11}, Lty/c;->p()Laa3/u0;

    move-result-object v2

    iget-object v2, v2, Laa3/u0;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ne v3, v7, :cond_60

    move/from16 v3, v16

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lbf3/d;

    iget-object v4, v4, Lbf3/d;->a:Ljava/lang/CharSequence;

    const/16 v5, 0x7c

    invoke-static {v5, v4, v3}, Ls3/d;->f(CLjava/lang/CharSequence;I)I

    move-result v4

    const/4 v3, -0x1

    if-eq v4, v3, :cond_5f

    iget-object v3, v0, Lxe3/g;->a:Lbf3/d;

    iget v4, v0, Lxe3/g;->c:I

    iget-object v7, v3, Lbf3/d;->a:Ljava/lang/CharSequence;

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v7

    invoke-virtual {v3, v4, v7}, Lbf3/d;->a(II)Lbf3/d;

    move-result-object v3

    iget-object v3, v3, Lbf3/d;->a:Ljava/lang/CharSequence;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v12, 0x0

    :goto_30
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v14

    if-ge v7, v14, :cond_5d

    invoke-interface {v3, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v14

    const/16 v15, 0x9

    if-eq v14, v15, :cond_5c

    const/16 v15, 0x20

    if-eq v14, v15, :cond_5c

    const/16 v15, 0x3a

    const/16 v5, 0x2d

    if-eq v14, v5, :cond_52

    if-eq v14, v15, :cond_52

    const/16 v5, 0x7c

    if-eq v14, v5, :cond_50

    goto/16 :goto_36

    :cond_50
    add-int/lit8 v7, v7, 0x1

    add-int/lit8 v8, v8, 0x1

    const/4 v12, 0x1

    if-le v8, v12, :cond_51

    goto/16 :goto_36

    :cond_51
    const/4 v12, 0x1

    const/16 v15, 0x2d

    goto :goto_35

    :cond_52
    const/16 v5, 0x7c

    if-nez v8, :cond_53

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_53

    goto :goto_36

    :cond_53
    if-ne v14, v15, :cond_54

    add-int/lit8 v7, v7, 0x1

    const/4 v8, 0x1

    goto :goto_31

    :cond_54
    const/4 v8, 0x0

    :goto_31
    const/4 v14, 0x0

    :goto_32
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-ge v7, v5, :cond_55

    invoke-interface {v3, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    const/16 v15, 0x2d

    if-ne v5, v15, :cond_56

    add-int/lit8 v7, v7, 0x1

    const/4 v14, 0x1

    const/16 v15, 0x3a

    goto :goto_32

    :cond_55
    const/16 v15, 0x2d

    :cond_56
    if-nez v14, :cond_57

    goto :goto_36

    :cond_57
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-ge v7, v5, :cond_58

    invoke-interface {v3, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    const/16 v14, 0x3a

    if-ne v5, v14, :cond_58

    add-int/lit8 v7, v7, 0x1

    const/4 v5, 0x1

    goto :goto_33

    :cond_58
    const/4 v5, 0x0

    :goto_33
    if-eqz v8, :cond_59

    if-eqz v5, :cond_59

    sget-object v5, Lve3/c;->x:Lve3/c;

    goto :goto_34

    :cond_59
    if-eqz v8, :cond_5a

    sget-object v5, Lve3/c;->w:Lve3/c;

    goto :goto_34

    :cond_5a
    if-eqz v5, :cond_5b

    sget-object v5, Lve3/c;->y:Lve3/c;

    goto :goto_34

    :cond_5b
    const/4 v5, 0x0

    :goto_34
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v8, 0x0

    goto :goto_35

    :cond_5c
    const/16 v15, 0x2d

    add-int/lit8 v7, v7, 0x1

    :goto_35
    const/16 v5, 0x7c

    goto/16 :goto_30

    :cond_5d
    if-nez v12, :cond_5e

    :goto_36
    const/4 v4, 0x0

    :cond_5e
    if-eqz v4, :cond_5f

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_5f

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbf3/d;

    invoke-static {v2}, Lwe3/b;->k(Lbf3/d;)Ljava/util/ArrayList;

    move-result-object v5

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v7

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-lt v7, v5, :cond_61

    new-instance v5, Lwe3/b;

    invoke-direct {v5, v4, v2}, Lwe3/b;-><init>(Ljava/util/ArrayList;Lbf3/d;)V

    const/4 v7, 0x1

    new-array v2, v7, [Lcf3/a;

    aput-object v5, v2, v3

    new-instance v4, Lxe3/b;

    invoke-direct {v4, v2}, Lxe3/b;-><init>([Lcf3/a;)V

    iget v2, v0, Lxe3/g;->c:I

    iput v2, v4, Lxe3/b;->b:I

    iput-boolean v7, v4, Lxe3/b;->d:Z

    move-object v2, v4

    goto :goto_38

    :cond_5f
    const/4 v3, 0x0

    goto :goto_37

    :cond_60
    move/from16 v3, v16

    :cond_61
    :goto_37
    const/4 v2, 0x0

    :goto_38
    if-eqz v2, :cond_62

    goto :goto_39

    :cond_62
    move v2, v3

    move-object/from16 v4, v22

    move/from16 v7, v23

    const/4 v3, 0x1

    const/4 v8, -0x1

    const/4 v12, 0x4

    goto/16 :goto_8

    :cond_63
    move v3, v2

    move-object/from16 v22, v4

    move/from16 v23, v7

    const/4 v2, 0x0

    :goto_39
    if-nez v2, :cond_64

    iget v2, v0, Lxe3/g;->f:I

    invoke-virtual {v0, v2}, Lxe3/g;->k(I)V

    goto/16 :goto_3e

    :cond_64
    iget v4, v0, Lxe3/g;->c:I

    if-lez v1, :cond_65

    invoke-virtual {v0, v1}, Lxe3/g;->f(I)V

    move v1, v3

    :cond_65
    iget v5, v2, Lxe3/b;->b:I

    const/4 v7, -0x1

    if-eq v5, v7, :cond_66

    invoke-virtual {v0, v5}, Lxe3/g;->k(I)V

    goto :goto_3a

    :cond_66
    iget v5, v2, Lxe3/b;->c:I

    if-eq v5, v7, :cond_67

    invoke-virtual {v0, v5}, Lxe3/g;->j(I)V

    :cond_67
    :goto_3a
    iget-boolean v5, v2, Lxe3/b;->d:Z

    if-eqz v5, :cond_69

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/16 v18, 0x1

    add-int/lit8 v5, v5, -0x1

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lxe3/f;

    iget-object v5, v5, Lxe3/f;->a:Lcf3/a;

    instance-of v8, v5, Lxe3/p;

    if-eqz v8, :cond_68

    move-object v8, v5

    check-cast v8, Lxe3/p;

    invoke-virtual {v0, v8}, Lxe3/g;->b(Lxe3/p;)V

    :cond_68
    invoke-virtual {v5}, Lcf3/a;->e()V

    invoke-virtual {v5}, Lcf3/a;->f()Laf3/a;

    move-result-object v8

    invoke-virtual {v8}, Laf3/t;->j()V

    invoke-virtual {v5}, Lcf3/a;->f()Laf3/a;

    move-result-object v5

    invoke-virtual {v5}, Laf3/t;->e()Ljava/util/List;

    move-result-object v5

    goto :goto_3b

    :cond_69
    const/4 v5, 0x0

    :goto_3b
    iget-object v2, v2, Lxe3/b;->a:[Lcf3/a;

    array-length v8, v2

    move v10, v9

    move v9, v3

    :goto_3c
    if-ge v9, v8, :cond_6b

    aget-object v10, v2, v9

    new-instance v11, Lxe3/f;

    invoke-direct {v11, v10, v4}, Lxe3/f;-><init>(Lcf3/a;I)V

    invoke-virtual {v0, v11}, Lxe3/g;->a(Lxe3/f;)V

    if-eqz v5, :cond_6a

    invoke-virtual {v10}, Lcf3/a;->f()Laf3/a;

    move-result-object v11

    invoke-virtual {v11, v5}, Laf3/t;->h(Ljava/util/List;)V

    :cond_6a
    invoke-virtual {v10}, Lcf3/a;->g()Z

    move-result v11

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v22, v10

    move v10, v11

    goto :goto_3c

    :cond_6b
    move v2, v3

    move v8, v7

    move v9, v10

    move-object/from16 v4, v22

    move/from16 v7, v23

    const/4 v3, 0x1

    const/4 v10, 0x1

    goto/16 :goto_7

    :goto_3d
    iget v2, v0, Lxe3/g;->f:I

    invoke-virtual {v0, v2}, Lxe3/g;->k(I)V

    :goto_3e
    move/from16 v7, v23

    goto :goto_3f

    :cond_6c
    move-object/from16 v22, v4

    :goto_3f
    if-nez v10, :cond_6d

    iget-boolean v2, v0, Lxe3/g;->i:Z

    if-nez v2, :cond_6d

    invoke-virtual {v0}, Lxe3/g;->h()Lcf3/a;

    move-result-object v2

    invoke-virtual {v2}, Lcf3/a;->d()Z

    move-result v2

    if-eqz v2, :cond_6d

    const/4 v12, 0x1

    invoke-static {v6, v12}, Lm4/a;->d(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxe3/f;

    iput v7, v1, Lxe3/f;->b:I

    invoke-virtual {v0}, Lxe3/g;->c()V

    return-void

    :cond_6d
    if-lez v1, :cond_6e

    invoke-virtual {v0, v1}, Lxe3/g;->f(I)V

    :cond_6e
    invoke-virtual/range {v22 .. v22}, Lcf3/a;->g()Z

    move-result v1

    if-nez v1, :cond_6f

    invoke-virtual {v0}, Lxe3/g;->c()V

    return-void

    :cond_6f
    iget-boolean v1, v0, Lxe3/g;->i:Z

    if-nez v1, :cond_70

    new-instance v1, Lxe3/p;

    invoke-direct {v1}, Lxe3/p;-><init>()V

    new-instance v2, Lxe3/f;

    invoke-direct {v2, v1, v7}, Lxe3/f;-><init>(Lcf3/a;I)V

    invoke-virtual {v0, v2}, Lxe3/g;->a(Lxe3/f;)V

    invoke-virtual {v0}, Lxe3/g;->c()V

    return-void

    :cond_70
    invoke-virtual {v0}, Lxe3/g;->d()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x30
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public final j(I)V
    .locals 3

    iget v0, p0, Lxe3/g;->g:I

    if-lt p1, v0, :cond_0

    iget v1, p0, Lxe3/g;->f:I

    iput v1, p0, Lxe3/g;->c:I

    iput v0, p0, Lxe3/g;->d:I

    :cond_0
    iget-object v0, p0, Lxe3/g;->a:Lbf3/d;

    iget-object v0, v0, Lbf3/d;->a:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    :goto_0
    iget v1, p0, Lxe3/g;->d:I

    if-ge v1, p1, :cond_1

    iget v2, p0, Lxe3/g;->c:I

    if-eq v2, v0, :cond_1

    invoke-virtual {p0}, Lxe3/g;->e()V

    goto :goto_0

    :cond_1
    if-le v1, p1, :cond_2

    iget v0, p0, Lxe3/g;->c:I

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iput v0, p0, Lxe3/g;->c:I

    iput p1, p0, Lxe3/g;->d:I

    iput-boolean v1, p0, Lxe3/g;->e:Z

    return-void

    :cond_2
    const/4 p1, 0x0

    iput-boolean p1, p0, Lxe3/g;->e:Z

    return-void
.end method

.method public final k(I)V
    .locals 2

    iget v0, p0, Lxe3/g;->f:I

    if-lt p1, v0, :cond_0

    iput v0, p0, Lxe3/g;->c:I

    iget v0, p0, Lxe3/g;->g:I

    iput v0, p0, Lxe3/g;->d:I

    :cond_0
    iget-object v0, p0, Lxe3/g;->a:Lbf3/d;

    iget-object v0, v0, Lbf3/d;->a:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    :goto_0
    iget v1, p0, Lxe3/g;->c:I

    if-ge v1, p1, :cond_1

    if-eq v1, v0, :cond_1

    invoke-virtual {p0}, Lxe3/g;->e()V

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    iput-boolean p1, p0, Lxe3/g;->e:Z

    return-void
.end method
