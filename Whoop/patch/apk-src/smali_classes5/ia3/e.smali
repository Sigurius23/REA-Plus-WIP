.class public final Lia3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lia3/f;


# instance fields
.field public final a:Lzt/q;

.field public final b:Lr93/l;

.field public final c:I

.field public final d:Ljava/util/LinkedHashMap;

.field public final e:Landroidx/lifecycle/h2;


# direct methods
.method public constructor <init>(Lzt/q;Lr93/l;Lma3/f;I)V
    .locals 1

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeParameterOwner"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lia3/e;->a:Lzt/q;

    iput-object p2, p0, Lia3/e;->b:Lr93/l;

    iput p4, p0, Lia3/e;->c:I

    invoke-interface {p3}, Lma3/f;->getTypeParameters()Ljava/util/ArrayList;

    move-result-object p1

    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p3, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_0

    add-int/lit8 p4, p3, 0x1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, v0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move p3, p4

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lia3/e;->d:Ljava/util/LinkedHashMap;

    iget-object p1, p0, Lia3/e;->a:Lzt/q;

    iget-object p1, p1, Lzt/q;->x:Ljava/lang/Object;

    check-cast p1, Lia3/a;

    iget-object p1, p1, Lia3/a;->a:Lkb3/n;

    new-instance p2, Ldc3/s;

    const/4 p3, 0x6

    invoke-direct {p2, p0, p3}, Ldc3/s;-><init>(Ljava/lang/Object;I)V

    check-cast p1, Lkb3/k;

    invoke-virtual {p1, p2}, Lkb3/k;->c(Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/h2;

    move-result-object p1

    iput-object p1, p0, Lia3/e;->e:Landroidx/lifecycle/h2;

    return-void
.end method


# virtual methods
.method public final a(Lx93/b0;)Lr93/x0;
    .locals 1

    const-string v0, "javaTypeParameter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lia3/e;->e:Landroidx/lifecycle/h2;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/h2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lja3/f0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lia3/e;->a:Lzt/q;

    iget-object v0, v0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v0, Lia3/f;

    invoke-interface {v0, p1}, Lia3/f;->a(Lx93/b0;)Lr93/x0;

    move-result-object p1

    return-object p1
.end method
