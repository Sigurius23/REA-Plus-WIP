.class public final Laa3/z0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic l:[Lj93/z;


# instance fields
.field public a:I

.field public final b:Laa3/a1;

.field public final c:Laa3/a1;

.field public final d:Ljava/util/ArrayList;

.field public final e:Ljava/util/ArrayList;

.field public final f:Ljava/util/ArrayList;

.field public final g:Ljava/util/ArrayList;

.field public final h:Ljava/util/ArrayList;

.field public final i:Ljava/util/ArrayList;

.field public final j:Ljava/util/ArrayList;

.field public final k:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/q;

    const-class v1, Laa3/z0;

    const-string v2, "_hasSetter"

    const-string v3, "get_hasSetter()Z"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/q;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v0}, Lkotlin/jvm/internal/i0;->mutableProperty1(Lkotlin/jvm/internal/p;)Lj93/l;

    move-result-object v0

    const-string v3, "_hasGetter"

    const-string v5, "get_hasGetter()Z"

    invoke-static {v1, v3, v5, v4, v2}, Ldc/b;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/l;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lj93/z;

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, Laa3/z0;->l:[Lj93/z;

    return-void
.end method

.method public constructor <init>(IIILjava/lang/String;)V
    .locals 8

    const-string v0, "name"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Laa3/z0;->a:I

    new-instance p1, Lba3/h;

    sget-object p4, Lsa3/d;->A:Lsa3/b;

    const-string v0, "HAS_SETTER"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, p4}, Lba3/h;-><init>(Lsa3/b;)V

    sget-object p4, Lba3/e;->w:Lba3/e;

    const-string v0, " was passed"

    const-string v1, "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but "

    iget v2, p1, Lba3/h;->b:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_4

    iget v4, p1, Lba3/h;->c:I

    if-ne v4, v3, :cond_4

    new-instance v5, Lba3/h;

    sget-object v6, Lsa3/d;->z:Lsa3/b;

    const-string v7, "HAS_GETTER"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v5, v6}, Lba3/h;-><init>(Lsa3/b;)V

    iget v6, v5, Lba3/h;->b:I

    if-ne v6, v3, :cond_3

    iget v6, v5, Lba3/h;->c:I

    if-ne v6, v3, :cond_3

    iget v0, v5, Lba3/h;->a:I

    shl-int v0, v3, v0

    new-instance v1, Laa3/a1;

    invoke-direct {v1, p2}, Laa3/a1;-><init>(I)V

    sget-object p2, Laa3/z0;->l:[Lj93/z;

    aget-object v5, p2, v3

    const-string v6, "property"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v5, p0, Laa3/z0;->a:I

    or-int/2addr v0, v5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p4, p0, v0}, Lba3/e;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v1, p0, Laa3/z0;->b:Laa3/a1;

    const/4 v0, 0x0

    aget-object p2, p2, v0

    invoke-static {p2, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p4, p0}, Lj93/w;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    iget p1, p1, Lba3/h;->a:I

    ushr-int p1, p2, p1

    shl-int p2, v3, v2

    sub-int/2addr p2, v3

    and-int/2addr p1, p2

    if-ne p1, v4, :cond_0

    goto :goto_0

    :cond_0
    move v3, v0

    :goto_0
    if-eqz v3, :cond_1

    new-instance p1, Laa3/a1;

    invoke-direct {p1, p3}, Laa3/a1;-><init>(I)V

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    iput-object p1, p0, Laa3/z0;->c:Laa3/a1;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Laa3/z0;->d:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Laa3/z0;->e:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Laa3/z0;->f:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Laa3/z0;->g:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Laa3/z0;->h:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Laa3/z0;->i:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Laa3/z0;->j:Ljava/util/ArrayList;

    sget-object p1, Lca3/l;->a:Lca3/k;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lca3/k;->a()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    const/16 p3, 0xa

    invoke-static {p1, p3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p3

    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lca3/l;

    check-cast p3, Lea3/d;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p3, Lea3/f;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    iput-object p2, p0, Laa3/z0;->k:Ljava/util/ArrayList;

    return-void

    :cond_3
    invoke-static {v1, v5, v0}, Ld;->n(Ljava/lang/String;Lba3/h;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    invoke-static {v1, p1, v0}, Ld;->n(Ljava/lang/String;Lba3/h;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
