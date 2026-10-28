.class public final Lna3/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lna3/q;

.field public final b:Ljava/util/List;

.field public final c:Ljava/lang/String;

.field public final d:Lna3/m;


# direct methods
.method public constructor <init>(Lna3/q;Ljava/util/List;Ljava/lang/String;)V
    .locals 2

    const-string v0, "parametersInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lna3/m;->a:Lna3/q;

    iput-object p2, p0, Lna3/m;->b:Ljava/util/List;

    iput-object p3, p0, Lna3/m;->c:Ljava/lang/String;

    const/4 v0, 0x0

    if-eqz p3, :cond_3

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lna3/q;->a()Lna3/q;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    check-cast p2, Ljava/lang/Iterable;

    new-instance p3, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p2, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p3, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lna3/q;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lna3/q;->a()Lna3/q;

    move-result-object v1

    goto :goto_2

    :cond_1
    move-object v1, v0

    :goto_2
    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance p2, Lna3/m;

    invoke-direct {p2, p1, p3, v0}, Lna3/m;-><init>(Lna3/q;Ljava/util/List;Ljava/lang/String;)V

    move-object v0, p2

    :cond_3
    iput-object v0, p0, Lna3/m;->d:Lna3/m;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lna3/m;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lna3/m;->b:Ljava/util/List;

    return-object v0
.end method

.method public final c()Lna3/q;
    .locals 1

    iget-object v0, p0, Lna3/m;->a:Lna3/q;

    return-object v0
.end method

.method public final d()Lna3/m;
    .locals 1

    iget-object v0, p0, Lna3/m;->d:Lna3/m;

    return-object v0
.end method
