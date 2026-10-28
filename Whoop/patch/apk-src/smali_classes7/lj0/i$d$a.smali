.class final Llj0/i$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llj0/i$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field

.field final synthetic x:Llj0/i;

.field final synthetic y:Lbc3/k1;

.field final synthetic z:Lbc3/c0;


# direct methods
.method public constructor <init>(Lec3/t1;Llj0/i;Lbc3/k1;Lbc3/c0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/t1;",
            "Llj0/i;",
            "Lbc3/k1;",
            "Lbc3/c0;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Llj0/i$d$a;->w:Lec3/t1;

    iput-object p2, p0, Llj0/i$d$a;->x:Llj0/i;

    iput-object p3, p0, Llj0/i$d$a;->y:Lbc3/k1;

    iput-object p4, p0, Llj0/i$d$a;->z:Lbc3/c0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ZLq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p1, p0, Llj0/i$d$a;->w:Lec3/t1;

    invoke-interface {p1}, Lec3/t1;->getReplayCache()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llj0/f;

    const/4 p2, 0x0

    if-nez p1, :cond_0

    new-instance p1, Llj0/f;

    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-direct {p1, v1, v1, v0, p2}, Llj0/f;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    invoke-static {p1}, Llj0/g;->a(Llj0/f;)I

    move-result v0

    iget-object v1, p0, Llj0/i$d$a;->x:Llj0/i;

    invoke-static {v1}, Llj0/i;->b(Llj0/i;)Ljs0/c;

    move-result-object v1

    sget-object v2, Llj0/i$a$a;->a:Llj0/i$a$a;

    invoke-virtual {v1}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object v1

    invoke-virtual {v2}, Ljs0/a;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v2

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v5, Ljava/lang/Integer;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v4, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v1, v3}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-static {v1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    goto/16 :goto_0

    :cond_1
    move-object v1, p2

    goto/16 :goto_0

    :cond_2
    sget-object v6, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {v4, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-virtual {v1, v3}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-static {v1}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    goto :goto_0

    :cond_3
    sget-object v6, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {v4, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual {v1, v3}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-static {v1}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    goto :goto_0

    :cond_4
    sget-object v6, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {v4, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-virtual {v1, v3}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-static {v1}, Lyb3/x;->x(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v1

    goto :goto_0

    :cond_5
    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {v4, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-virtual {v1, v3}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-static {v1}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    goto :goto_0

    :cond_6
    const-class v6, Ljava/lang/String;

    invoke-virtual {v4, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-virtual {v1, v3}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :cond_7
    move-object v1, v2

    :goto_0
    if-nez v1, :cond_8

    goto :goto_1

    :cond_8
    move-object v2, v1

    :goto_1
    if-eqz v2, :cond_a

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v1

    if-le v0, v1, :cond_9

    iget-object v0, p0, Llj0/i$d$a;->x:Llj0/i;

    invoke-virtual {p1}, Llj0/f;->d()I

    move-result v1

    invoke-static {v0, v1}, Llj0/i;->g(Llj0/i;I)V

    iget-object v0, p0, Llj0/i$d$a;->x:Llj0/i;

    invoke-virtual {p1}, Llj0/f;->c()I

    move-result p1

    invoke-static {v0, p1}, Llj0/i;->f(Llj0/i;I)V

    iget-object p1, p0, Llj0/i$d$a;->x:Llj0/i;

    invoke-static {p1}, Llj0/i;->j(Llj0/i;)V

    iget-object p1, p0, Llj0/i$d$a;->y:Lbc3/k1;

    invoke-interface {p1, p2}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    iget-object p1, p0, Llj0/i$d$a;->z:Lbc3/c0;

    invoke-static {p1, p2}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    :cond_9
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_a
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type kotlin.Int"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1, p2}, Llj0/i$d$a;->b(ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
