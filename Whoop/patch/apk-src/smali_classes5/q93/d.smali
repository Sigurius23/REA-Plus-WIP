.class public final Lq93/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:Ljava/lang/String;

.field public static final c:Ljava/lang/String;

.field public static final d:Ljava/lang/String;

.field public static final e:Lva3/c;

.field public static final f:Lva3/e;

.field public static final g:Lva3/c;

.field public static final h:Ljava/util/HashMap;

.field public static final i:Ljava/util/HashMap;

.field public static final j:Ljava/util/HashMap;

.field public static final k:Ljava/util/HashMap;

.field public static final l:Ljava/util/HashMap;

.field public static final m:Ljava/util/HashMap;

.field public static final n:Ljava/util/LinkedHashSet;

.field public static final o:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lp93/g;->c:Lp93/g;

    iget-object v2, v1, Lp93/k;->a:Lva3/e;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v2, 0x2e

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, v1, Lp93/k;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lq93/d;->a:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lp93/h;->c:Lp93/h;

    iget-object v3, v1, Lp93/k;->a:Lva3/e;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, v1, Lp93/k;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lq93/d;->b:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lp93/j;->c:Lp93/j;

    iget-object v3, v1, Lp93/k;->a:Lva3/e;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, v1, Lp93/k;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lq93/d;->c:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lp93/i;->c:Lp93/i;

    iget-object v3, v1, Lp93/k;->a:Lva3/e;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, v1, Lp93/k;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lq93/d;->d:Ljava/lang/String;

    new-instance v0, Lva3/e;

    const-string v1, "kotlin.jvm.functions.FunctionN"

    invoke-direct {v0, v1}, Lva3/e;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lva3/b;->k(Lva3/e;)Lva3/c;

    move-result-object v0

    sput-object v0, Lq93/d;->e:Lva3/c;

    invoke-virtual {v0}, Lva3/c;->a()Lva3/e;

    move-result-object v0

    sput-object v0, Lq93/d;->f:Lva3/e;

    sget-object v0, Lva3/k;->u:Lva3/c;

    sput-object v0, Lq93/d;->g:Lva3/c;

    const-class v0, Ljava/lang/Class;

    invoke-static {v0}, Lq93/d;->e(Ljava/lang/Class;)Lva3/c;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lq93/d;->h:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lq93/d;->i:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lq93/d;->j:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lq93/d;->k:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lq93/d;->l:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lq93/d;->m:Ljava/util/HashMap;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    sput-object v0, Lq93/d;->n:Ljava/util/LinkedHashSet;

    sget-object v0, Lo93/m;->B:Lva3/e;

    invoke-static {v0}, Lva3/b;->k(Lva3/e;)Lva3/c;

    move-result-object v0

    sget-object v1, Lo93/m;->J:Lva3/e;

    new-instance v3, Lva3/c;

    iget-object v4, v0, Lva3/c;->a:Lva3/e;

    invoke-static {v1, v4}, Lva3/g;->m(Lva3/e;Lva3/e;)Lva3/e;

    move-result-object v1

    const/4 v5, 0x0

    invoke-direct {v3, v4, v1, v5}, Lva3/c;-><init>(Lva3/e;Lva3/e;Z)V

    new-instance v6, Lq93/c;

    const-class v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lq93/d;->e(Ljava/lang/Class;)Lva3/c;

    move-result-object v1

    invoke-direct {v6, v1, v0, v3}, Lq93/c;-><init>(Lva3/c;Lva3/c;Lva3/c;)V

    sget-object v0, Lo93/m;->A:Lva3/e;

    invoke-static {v0}, Lva3/b;->k(Lva3/e;)Lva3/c;

    move-result-object v0

    sget-object v1, Lo93/m;->I:Lva3/e;

    new-instance v3, Lva3/c;

    iget-object v4, v0, Lva3/c;->a:Lva3/e;

    invoke-static {v1, v4}, Lva3/g;->m(Lva3/e;Lva3/e;)Lva3/e;

    move-result-object v1

    invoke-direct {v3, v4, v1, v5}, Lva3/c;-><init>(Lva3/e;Lva3/e;Z)V

    new-instance v7, Lq93/c;

    const-class v1, Ljava/util/Iterator;

    invoke-static {v1}, Lq93/d;->e(Ljava/lang/Class;)Lva3/c;

    move-result-object v1

    invoke-direct {v7, v1, v0, v3}, Lq93/c;-><init>(Lva3/c;Lva3/c;Lva3/c;)V

    sget-object v0, Lo93/m;->C:Lva3/e;

    invoke-static {v0}, Lva3/b;->k(Lva3/e;)Lva3/c;

    move-result-object v0

    sget-object v1, Lo93/m;->K:Lva3/e;

    new-instance v3, Lva3/c;

    iget-object v4, v0, Lva3/c;->a:Lva3/e;

    invoke-static {v1, v4}, Lva3/g;->m(Lva3/e;Lva3/e;)Lva3/e;

    move-result-object v1

    invoke-direct {v3, v4, v1, v5}, Lva3/c;-><init>(Lva3/e;Lva3/e;Z)V

    new-instance v8, Lq93/c;

    const-class v1, Ljava/util/Collection;

    invoke-static {v1}, Lq93/d;->e(Ljava/lang/Class;)Lva3/c;

    move-result-object v1

    invoke-direct {v8, v1, v0, v3}, Lq93/c;-><init>(Lva3/c;Lva3/c;Lva3/c;)V

    sget-object v0, Lo93/m;->D:Lva3/e;

    invoke-static {v0}, Lva3/b;->k(Lva3/e;)Lva3/c;

    move-result-object v0

    sget-object v1, Lo93/m;->L:Lva3/e;

    new-instance v3, Lva3/c;

    iget-object v4, v0, Lva3/c;->a:Lva3/e;

    invoke-static {v1, v4}, Lva3/g;->m(Lva3/e;Lva3/e;)Lva3/e;

    move-result-object v1

    invoke-direct {v3, v4, v1, v5}, Lva3/c;-><init>(Lva3/e;Lva3/e;Z)V

    new-instance v9, Lq93/c;

    const-class v1, Ljava/util/List;

    invoke-static {v1}, Lq93/d;->e(Ljava/lang/Class;)Lva3/c;

    move-result-object v1

    invoke-direct {v9, v1, v0, v3}, Lq93/c;-><init>(Lva3/c;Lva3/c;Lva3/c;)V

    sget-object v0, Lo93/m;->F:Lva3/e;

    invoke-static {v0}, Lva3/b;->k(Lva3/e;)Lva3/c;

    move-result-object v0

    sget-object v1, Lo93/m;->N:Lva3/e;

    new-instance v3, Lva3/c;

    iget-object v4, v0, Lva3/c;->a:Lva3/e;

    invoke-static {v1, v4}, Lva3/g;->m(Lva3/e;Lva3/e;)Lva3/e;

    move-result-object v1

    invoke-direct {v3, v4, v1, v5}, Lva3/c;-><init>(Lva3/e;Lva3/e;Z)V

    new-instance v10, Lq93/c;

    const-class v1, Ljava/util/Set;

    invoke-static {v1}, Lq93/d;->e(Ljava/lang/Class;)Lva3/c;

    move-result-object v1

    invoke-direct {v10, v1, v0, v3}, Lq93/c;-><init>(Lva3/c;Lva3/c;Lva3/c;)V

    sget-object v0, Lo93/m;->E:Lva3/e;

    invoke-static {v0}, Lva3/b;->k(Lva3/e;)Lva3/c;

    move-result-object v0

    sget-object v1, Lo93/m;->M:Lva3/e;

    new-instance v3, Lva3/c;

    iget-object v4, v0, Lva3/c;->a:Lva3/e;

    invoke-static {v1, v4}, Lva3/g;->m(Lva3/e;Lva3/e;)Lva3/e;

    move-result-object v1

    invoke-direct {v3, v4, v1, v5}, Lva3/c;-><init>(Lva3/e;Lva3/e;Z)V

    new-instance v11, Lq93/c;

    const-class v1, Ljava/util/ListIterator;

    invoke-static {v1}, Lq93/d;->e(Ljava/lang/Class;)Lva3/c;

    move-result-object v1

    invoke-direct {v11, v1, v0, v3}, Lq93/c;-><init>(Lva3/c;Lva3/c;Lva3/c;)V

    sget-object v0, Lo93/m;->G:Lva3/e;

    invoke-static {v0}, Lva3/b;->k(Lva3/e;)Lva3/c;

    move-result-object v1

    sget-object v3, Lo93/m;->O:Lva3/e;

    new-instance v4, Lva3/c;

    iget-object v12, v1, Lva3/c;->a:Lva3/e;

    invoke-static {v3, v12}, Lva3/g;->m(Lva3/e;Lva3/e;)Lva3/e;

    move-result-object v3

    invoke-direct {v4, v12, v3, v5}, Lva3/c;-><init>(Lva3/e;Lva3/e;Z)V

    new-instance v12, Lq93/c;

    const-class v3, Ljava/util/Map;

    invoke-static {v3}, Lq93/d;->e(Ljava/lang/Class;)Lva3/c;

    move-result-object v3

    invoke-direct {v12, v3, v1, v4}, Lq93/c;-><init>(Lva3/c;Lva3/c;Lva3/c;)V

    invoke-static {v0}, Lva3/b;->k(Lva3/e;)Lva3/c;

    move-result-object v0

    sget-object v1, Lo93/m;->H:Lva3/e;

    iget-object v1, v1, Lva3/e;->a:Lva3/f;

    invoke-virtual {v1}, Lva3/f;->g()Lva3/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lva3/c;->d(Lva3/h;)Lva3/c;

    move-result-object v0

    sget-object v1, Lo93/m;->P:Lva3/e;

    new-instance v3, Lva3/c;

    iget-object v4, v0, Lva3/c;->a:Lva3/e;

    invoke-static {v1, v4}, Lva3/g;->m(Lva3/e;Lva3/e;)Lva3/e;

    move-result-object v1

    invoke-direct {v3, v4, v1, v5}, Lva3/c;-><init>(Lva3/e;Lva3/e;Z)V

    new-instance v13, Lq93/c;

    const-class v1, Ljava/util/Map$Entry;

    invoke-static {v1}, Lq93/d;->e(Ljava/lang/Class;)Lva3/c;

    move-result-object v1

    invoke-direct {v13, v1, v0, v3}, Lq93/c;-><init>(Lva3/c;Lva3/c;Lva3/c;)V

    filled-new-array/range {v6 .. v13}, [Lq93/c;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lq93/d;->o:Ljava/util/List;

    const-class v1, Ljava/lang/Object;

    sget-object v3, Lo93/m;->a:Lva3/f;

    invoke-static {v1, v3}, Lq93/d;->d(Ljava/lang/Class;Lva3/f;)V

    const-class v1, Ljava/lang/String;

    sget-object v3, Lo93/m;->f:Lva3/f;

    invoke-static {v1, v3}, Lq93/d;->d(Ljava/lang/Class;Lva3/f;)V

    const-class v1, Ljava/lang/CharSequence;

    sget-object v3, Lo93/m;->e:Lva3/f;

    invoke-static {v1, v3}, Lq93/d;->d(Ljava/lang/Class;Lva3/f;)V

    const-class v1, Ljava/lang/Throwable;

    sget-object v3, Lo93/m;->k:Lva3/e;

    invoke-static {v1, v3}, Lq93/d;->c(Ljava/lang/Class;Lva3/e;)V

    const-class v1, Ljava/lang/Cloneable;

    sget-object v3, Lo93/m;->c:Lva3/f;

    invoke-static {v1, v3}, Lq93/d;->d(Ljava/lang/Class;Lva3/f;)V

    const-class v1, Ljava/lang/Number;

    sget-object v3, Lo93/m;->i:Lva3/f;

    invoke-static {v1, v3}, Lq93/d;->d(Ljava/lang/Class;Lva3/f;)V

    const-class v1, Ljava/lang/Comparable;

    sget-object v3, Lo93/m;->l:Lva3/e;

    invoke-static {v1, v3}, Lq93/d;->c(Ljava/lang/Class;Lva3/e;)V

    const-class v1, Ljava/lang/Enum;

    sget-object v3, Lo93/m;->j:Lva3/f;

    invoke-static {v1, v3}, Lq93/d;->d(Ljava/lang/Class;Lva3/f;)V

    const-class v1, Ljava/lang/annotation/Annotation;

    sget-object v3, Lo93/m;->s:Lva3/e;

    invoke-static {v1, v3}, Lq93/d;->c(Ljava/lang/Class;Lva3/e;)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq93/c;

    iget-object v3, v1, Lq93/c;->a:Lva3/c;

    iget-object v4, v1, Lq93/c;->b:Lva3/c;

    iget-object v1, v1, Lq93/c;->c:Lva3/c;

    invoke-static {v3, v4}, Lq93/d;->a(Lva3/c;Lva3/c;)V

    invoke-virtual {v1}, Lva3/c;->a()Lva3/e;

    move-result-object v6

    invoke-static {v6, v3}, Lq93/d;->b(Lva3/e;Lva3/c;)V

    sget-object v3, Lq93/d;->l:Ljava/util/HashMap;

    invoke-virtual {v3, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lq93/d;->m:Ljava/util/HashMap;

    invoke-virtual {v3, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4}, Lva3/c;->a()Lva3/e;

    move-result-object v3

    invoke-virtual {v1}, Lva3/c;->a()Lva3/e;

    move-result-object v4

    sget-object v6, Lq93/d;->j:Ljava/util/HashMap;

    invoke-virtual {v1}, Lva3/c;->a()Lva3/e;

    move-result-object v1

    iget-object v1, v1, Lva3/e;->a:Lva3/f;

    invoke-virtual {v6, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lq93/d;->k:Ljava/util/HashMap;

    iget-object v3, v3, Lva3/e;->a:Lva3/f;

    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-static {}, Ldb3/c;->values()[Ldb3/c;

    move-result-object v0

    array-length v1, v0

    move v3, v5

    :goto_1
    if-ge v3, v1, :cond_2

    aget-object v4, v0, v3

    iget-object v6, v4, Ldb3/c;->z:Lva3/e;

    if-eqz v6, :cond_1

    new-instance v7, Lva3/c;

    invoke-virtual {v6}, Lva3/e;->b()Lva3/e;

    move-result-object v8

    iget-object v6, v6, Lva3/e;->a:Lva3/f;

    invoke-virtual {v6}, Lva3/f;->g()Lva3/h;

    move-result-object v6

    invoke-direct {v7, v8, v6}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    invoke-virtual {v4}, Ldb3/c;->d()Lo93/j;

    move-result-object v4

    const-string v6, "getPrimitiveType(...)"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lo93/n;->k:Lva3/e;

    iget-object v4, v4, Lo93/j;->w:Lva3/h;

    invoke-virtual {v6, v4}, Lva3/e;->a(Lva3/h;)Lva3/e;

    move-result-object v4

    new-instance v6, Lva3/c;

    invoke-virtual {v4}, Lva3/e;->b()Lva3/e;

    move-result-object v8

    iget-object v4, v4, Lva3/e;->a:Lva3/f;

    invoke-virtual {v4}, Lva3/f;->g()Lva3/h;

    move-result-object v4

    invoke-direct {v6, v8, v4}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    invoke-static {v7, v6}, Lq93/d;->a(Lva3/c;Lva3/c;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    const/16 v0, 0xf

    invoke-static {v0}, Ldb3/c;->a(I)V

    const/4 v0, 0x0

    throw v0

    :cond_2
    sget-object v0, Lo93/d;->a:Ljava/util/LinkedHashSet;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lva3/c;

    new-instance v3, Lva3/e;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v6, "kotlin.jvm.internal."

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lva3/c;->f()Lva3/h;

    move-result-object v6

    invoke-virtual {v6}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "CompanionObject"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v4, Lva3/c;

    invoke-virtual {v3}, Lva3/e;->b()Lva3/e;

    move-result-object v6

    iget-object v3, v3, Lva3/e;->a:Lva3/f;

    invoke-virtual {v3}, Lva3/f;->g()Lva3/h;

    move-result-object v3

    invoke-direct {v4, v6, v3}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    sget-object v3, Lva3/j;->b:Lva3/h;

    invoke-virtual {v1, v3}, Lva3/c;->d(Lva3/h;)Lva3/c;

    move-result-object v1

    invoke-static {v4, v1}, Lq93/d;->a(Lva3/c;Lva3/c;)V

    goto :goto_2

    :cond_3
    move v0, v5

    :goto_3
    const/16 v1, 0x17

    if-ge v0, v1, :cond_4

    new-instance v1, Lva3/e;

    const-string v3, "kotlin.jvm.functions.Function"

    invoke-static {v0, v3}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v3, Lva3/c;

    invoke-virtual {v1}, Lva3/e;->b()Lva3/e;

    move-result-object v4

    iget-object v1, v1, Lva3/e;->a:Lva3/f;

    invoke-virtual {v1}, Lva3/f;->g()Lva3/h;

    move-result-object v1

    invoke-direct {v3, v4, v1}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    new-instance v1, Lva3/c;

    sget-object v4, Lo93/n;->k:Lva3/e;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Function"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v6

    invoke-direct {v1, v4, v6}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    invoke-static {v3, v1}, Lq93/d;->a(Lva3/c;Lva3/c;)V

    new-instance v1, Lva3/e;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lq93/d;->b:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Lva3/e;-><init>(Ljava/lang/String;)V

    sget-object v3, Lq93/d;->g:Lva3/c;

    invoke-static {v1, v3}, Lq93/d;->b(Lva3/e;Lva3/c;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_4
    :goto_4
    const/16 v0, 0x16

    if-ge v5, v0, :cond_5

    sget-object v0, Lp93/i;->c:Lp93/i;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v0, Lp93/k;->a:Lva3/e;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v0, v0, Lp93/k;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lva3/e;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lva3/e;-><init>(Ljava/lang/String;)V

    sget-object v0, Lq93/d;->g:Lva3/c;

    invoke-static {v1, v0}, Lq93/d;->b(Lva3/e;Lva3/c;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_5
    new-instance v0, Lva3/e;

    const-string v1, "kotlin.concurrent.atomics.AtomicInt"

    invoke-direct {v0, v1}, Lva3/e;-><init>(Ljava/lang/String;)V

    const-class v1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-static {v1}, Lq93/d;->e(Ljava/lang/Class;)Lva3/c;

    move-result-object v1

    invoke-static {v0, v1}, Lq93/d;->b(Lva3/e;Lva3/c;)V

    new-instance v0, Lva3/e;

    const-string v1, "kotlin.concurrent.atomics.AtomicLong"

    invoke-direct {v0, v1}, Lva3/e;-><init>(Ljava/lang/String;)V

    const-class v1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v1}, Lq93/d;->e(Ljava/lang/Class;)Lva3/c;

    move-result-object v1

    invoke-static {v0, v1}, Lq93/d;->b(Lva3/e;Lva3/c;)V

    new-instance v0, Lva3/e;

    const-string v1, "kotlin.concurrent.atomics.AtomicBoolean"

    invoke-direct {v0, v1}, Lva3/e;-><init>(Ljava/lang/String;)V

    const-class v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-static {v1}, Lq93/d;->e(Ljava/lang/Class;)Lva3/c;

    move-result-object v1

    invoke-static {v0, v1}, Lq93/d;->b(Lva3/e;Lva3/c;)V

    new-instance v0, Lva3/e;

    const-string v1, "kotlin.concurrent.atomics.AtomicReference"

    invoke-direct {v0, v1}, Lva3/e;-><init>(Ljava/lang/String;)V

    const-class v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v1}, Lq93/d;->e(Ljava/lang/Class;)Lva3/c;

    move-result-object v1

    invoke-static {v0, v1}, Lq93/d;->b(Lva3/e;Lva3/c;)V

    new-instance v0, Lva3/e;

    const-string v1, "kotlin.concurrent.atomics.AtomicIntArray"

    invoke-direct {v0, v1}, Lva3/e;-><init>(Ljava/lang/String;)V

    const-class v1, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    invoke-static {v1}, Lq93/d;->e(Ljava/lang/Class;)Lva3/c;

    move-result-object v1

    invoke-static {v0, v1}, Lq93/d;->b(Lva3/e;Lva3/c;)V

    new-instance v0, Lva3/e;

    const-string v1, "kotlin.concurrent.atomics.AtomicLongArray"

    invoke-direct {v0, v1}, Lva3/e;-><init>(Ljava/lang/String;)V

    const-class v1, Ljava/util/concurrent/atomic/AtomicLongArray;

    invoke-static {v1}, Lq93/d;->e(Ljava/lang/Class;)Lva3/c;

    move-result-object v1

    invoke-static {v0, v1}, Lq93/d;->b(Lva3/e;Lva3/c;)V

    new-instance v0, Lva3/e;

    const-string v1, "kotlin.concurrent.atomics.AtomicArray"

    invoke-direct {v0, v1}, Lva3/e;-><init>(Ljava/lang/String;)V

    const-class v1, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-static {v1}, Lq93/d;->e(Ljava/lang/Class;)Lva3/c;

    move-result-object v1

    invoke-static {v0, v1}, Lq93/d;->b(Lva3/e;Lva3/c;)V

    sget-object v0, Lo93/m;->b:Lva3/f;

    invoke-virtual {v0}, Lva3/f;->i()Lva3/e;

    move-result-object v0

    const-class v1, Ljava/lang/Void;

    invoke-static {v1}, Lq93/d;->e(Ljava/lang/Class;)Lva3/c;

    move-result-object v1

    invoke-static {v0, v1}, Lq93/d;->b(Lva3/e;Lva3/c;)V

    return-void
.end method

.method public static a(Lva3/c;Lva3/c;)V
    .locals 2

    invoke-virtual {p0}, Lva3/c;->a()Lva3/e;

    move-result-object v0

    iget-object v0, v0, Lva3/e;->a:Lva3/f;

    sget-object v1, Lq93/d;->h:Ljava/util/HashMap;

    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lva3/c;->a()Lva3/e;

    move-result-object p1

    invoke-static {p1, p0}, Lq93/d;->b(Lva3/e;Lva3/c;)V

    return-void
.end method

.method public static b(Lva3/e;Lva3/c;)V
    .locals 1

    sget-object v0, Lq93/d;->n:Ljava/util/LinkedHashSet;

    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lq93/d;->i:Ljava/util/HashMap;

    iget-object p0, p0, Lva3/e;->a:Lva3/f;

    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static c(Ljava/lang/Class;Lva3/e;)V
    .locals 2

    invoke-static {p0}, Lq93/d;->e(Ljava/lang/Class;)Lva3/c;

    move-result-object p0

    const-string v0, "topLevelFqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lva3/c;

    invoke-virtual {p1}, Lva3/e;->b()Lva3/e;

    move-result-object v1

    iget-object p1, p1, Lva3/e;->a:Lva3/f;

    invoke-virtual {p1}, Lva3/f;->g()Lva3/h;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    invoke-static {p0, v0}, Lq93/d;->a(Lva3/c;Lva3/c;)V

    return-void
.end method

.method public static d(Ljava/lang/Class;Lva3/f;)V
    .locals 0

    invoke-virtual {p1}, Lva3/f;->i()Lva3/e;

    move-result-object p1

    invoke-static {p0, p1}, Lq93/d;->c(Ljava/lang/Class;Lva3/e;)V

    return-void
.end method

.method public static e(Ljava/lang/Class;)Lva3/c;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Lva3/e;

    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p0

    const-string v1, "getCanonicalName(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p0}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance p0, Lva3/c;

    invoke-virtual {v0}, Lva3/e;->b()Lva3/e;

    move-result-object v1

    iget-object v0, v0, Lva3/e;->a:Lva3/f;

    invoke-virtual {v0}, Lva3/f;->g()Lva3/h;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    return-object p0

    :cond_1
    invoke-static {v0}, Lq93/d;->e(Ljava/lang/Class;)Lva3/c;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object p0

    invoke-virtual {v0, p0}, Lva3/c;->d(Lva3/h;)Lva3/c;

    move-result-object p0

    return-object p0
.end method

.method public static f(Lva3/f;Ljava/lang/String;)Z
    .locals 2

    iget-object p0, p0, Lva3/f;->a:Ljava/lang/String;

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    const-string p1, "substring(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 p1, 0x30

    invoke-static {p0, p1}, Lyb3/r;->z0(Ljava/lang/String;C)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-static {p0}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    const/16 p1, 0x17

    if-lt p0, p1, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    :goto_0
    return v0
.end method

.method public static g(Lva3/f;)Lva3/c;
    .locals 1

    const-string v0, "kotlinFqName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lq93/d;->a:Ljava/lang/String;

    invoke-static {p0, v0}, Lq93/d;->f(Lva3/f;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lq93/d;->c:Ljava/lang/String;

    invoke-static {p0, v0}, Lq93/d;->f(Lva3/f;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    sget-object p0, Lq93/d;->e:Lva3/c;

    return-object p0

    :cond_1
    sget-object v0, Lq93/d;->b:Ljava/lang/String;

    invoke-static {p0, v0}, Lq93/d;->f(Lva3/f;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    sget-object v0, Lq93/d;->d:Ljava/lang/String;

    invoke-static {p0, v0}, Lq93/d;->f(Lva3/f;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    :goto_1
    sget-object p0, Lq93/d;->g:Lva3/c;

    return-object p0

    :cond_3
    sget-object v0, Lq93/d;->i:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lva3/c;

    return-object p0
.end method

.method public static h(Lva3/f;)Lva3/e;
    .locals 1

    sget-object v0, Lq93/d;->k:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lva3/e;

    return-object p0
.end method
