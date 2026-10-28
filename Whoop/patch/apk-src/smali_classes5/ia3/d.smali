.class public final Lia3/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr93/j0;


# instance fields
.field public final a:Lzt/q;

.field public final b:Lkb3/e;


# direct methods
.method public constructor <init>(Lia3/a;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lzt/q;

    sget-object v1, Lia3/b;->b:Lia3/b;

    new-instance v2, Ll83/f;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-direct {v0, p1, v1, v2}, Lzt/q;-><init>(Lia3/a;Lia3/f;Ll83/h;)V

    iput-object v0, p0, Lia3/d;->a:Lzt/q;

    iget-object p1, p1, Lia3/a;->a:Lkb3/n;

    check-cast p1, Lkb3/k;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lkb3/e;

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x2

    const/4 v4, 0x3

    invoke-direct {v1, v4, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    new-instance v2, Lkb3/f;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    const/4 v3, 0x0

    invoke-direct {v0, p1, v1, v2, v3}, Lkb3/e;-><init>(Lkb3/k;Ljava/util/concurrent/ConcurrentHashMap;Lkotlin/jvm/functions/Function1;I)V

    iput-object v0, p0, Lia3/d;->b:Lkb3/e;

    return-void
.end method


# virtual methods
.method public final a(Lva3/e;Ljava/util/ArrayList;)V
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lia3/d;->c(Lva3/e;)Lja3/q;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b(Lva3/e;)Z
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lia3/d;->a:Lzt/q;

    iget-object p1, p1, Lzt/q;->x:Ljava/lang/Object;

    check-cast p1, Lia3/a;

    iget-object p1, p1, Lia3/a;->b:Laj/c;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    return p1
.end method

.method public final c(Lva3/e;)Lja3/q;
    .locals 4

    iget-object v0, p0, Lia3/d;->a:Lzt/q;

    iget-object v0, v0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Lia3/a;

    iget-object v0, v0, Lia3/a;->b:Laj/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lx93/x;

    invoke-direct {v0, p1}, Lx93/x;-><init>(Lva3/e;)V

    new-instance v1, Lce3/p;

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-direct {v1, p0, v0, v3, v2}, Lce3/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    iget-object v0, p0, Lia3/d;->b:Lkb3/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lkb3/g;

    invoke-direct {v2, p1, v1}, Lkb3/g;-><init>(Ljava/lang/Object;Lc93/a;)V

    invoke-virtual {v0, v2}, Landroidx/lifecycle/h2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Lja3/q;

    return-object p1

    :cond_0
    const/4 p1, 0x3

    invoke-static {p1}, Lkb3/e;->a(I)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final f(Lva3/e;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 0

    const-string p2, "fqName"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lia3/d;->c(Lva3/e;)Lja3/q;

    move-result-object p1

    iget-object p1, p1, Lja3/q;->L:Lkb3/c;

    invoke-virtual {p1}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_0

    sget-object p1, Lm83/y;->w:Lm83/y;

    :cond_0
    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "LazyJavaPackageFragmentProvider of module "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lia3/d;->a:Lzt/q;

    iget-object v1, v1, Lzt/q;->x:Ljava/lang/Object;

    check-cast v1, Lia3/a;

    iget-object v1, v1, Lia3/a;->o:Lr93/b0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
