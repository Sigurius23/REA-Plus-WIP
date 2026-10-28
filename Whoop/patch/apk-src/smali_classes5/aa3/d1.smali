.class public final Laa3/d1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public final b:Ljava/lang/String;

.field public final c:I

.field public final d:Laa3/g1;

.field public final e:Ljava/util/ArrayList;

.field public final f:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(ILjava/lang/String;ILaa3/g1;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Laa3/d1;->a:I

    .line 3
    iput-object p2, p0, Laa3/d1;->b:Ljava/lang/String;

    .line 4
    iput p3, p0, Laa3/d1;->c:I

    .line 5
    iput-object p4, p0, Laa3/d1;->d:Laa3/g1;

    .line 6
    new-instance p1, Ljava/util/ArrayList;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Laa3/d1;->e:Ljava/util/ArrayList;

    .line 7
    sget-object p1, Lca3/l;->a:Lca3/k;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lca3/k;->a()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 8
    new-instance p2, Ljava/util/ArrayList;

    const/16 p3, 0xa

    invoke-static {p1, p3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p3

    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 9
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    .line 10
    check-cast p3, Lca3/l;

    .line 11
    check-cast p3, Lea3/d;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    new-instance p3, Lea3/h;

    invoke-direct {p3}, Lea3/h;-><init>()V

    .line 13
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 14
    :cond_0
    iput-object p2, p0, Laa3/d1;->f:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILaa3/g1;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 15
    invoke-direct {p0, v0, p1, p2, p3}, Laa3/d1;-><init>(ILjava/lang/String;ILaa3/g1;)V

    return-void
.end method
