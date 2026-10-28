.class public final Lwd3/c;
.super Lv63/c;
.source "SourceFile"


# instance fields
.field public final a:Lj93/d;

.field public final b:Ljava/lang/Object;

.field public final c:Lv63/c;


# direct methods
.method public constructor <init>(Lj93/d;Ljava/lang/Object;Lv63/c;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "next"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwd3/c;->a:Lj93/d;

    iput-object p2, p0, Lwd3/c;->b:Ljava/lang/Object;

    iput-object p3, p0, Lwd3/c;->c:Lv63/c;

    return-void
.end method


# virtual methods
.method public final d(Lj93/d;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lwd3/c;->a:Lj93/d;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object p1

    iget-object v0, p0, Lwd3/c;->b:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lwd3/c;->c:Lv63/c;

    invoke-virtual {v0, p1}, Lv63/c;->d(Lj93/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final k(Lj93/d;Ljava/lang/Object;)Lv63/c;
    .locals 4

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwd3/c;->a:Lj93/d;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, p0, Lwd3/c;->c:Lv63/c;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v2, p1, v1}, Lv63/c;->k(Lj93/d;Ljava/lang/Object;)Lv63/c;

    move-result-object v1

    if-ne v1, v2, :cond_1

    move-object v2, p0

    goto :goto_0

    :cond_1
    new-instance v2, Lwd3/c;

    iget-object v3, p0, Lwd3/c;->b:Ljava/lang/Object;

    invoke-direct {v2, v0, v3, v1}, Lwd3/c;-><init>(Lj93/d;Ljava/lang/Object;Lv63/c;)V

    :goto_0
    if-eqz p2, :cond_2

    new-instance v0, Lwd3/c;

    invoke-direct {v0, p1, p2, v2}, Lwd3/c;-><init>(Lj93/d;Ljava/lang/Object;Lv63/c;)V

    return-object v0

    :cond_2
    return-object v2
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    new-instance v0, Lw01/e;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Lw01/e;-><init>(I)V

    invoke-static {p0, v0}, Lxb3/k;->x(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lxb3/i;

    move-result-object v0

    invoke-static {v0}, Lxb3/k;->E(Lxb3/i;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->n1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    new-instance v5, Lwd3/b;

    const/4 v0, 0x0

    invoke-direct {v5, v0}, Lwd3/b;-><init>(I)V

    const/16 v6, 0x19

    const/4 v2, 0x0

    const-string v3, "{"

    const-string v4, "}"

    invoke-static/range {v1 .. v6}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
