.class public final Ln10/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lhm/d;


# direct methods
.method public constructor <init>(Lhm/d;Ln10/o0;Lqy/d;Ly00/n;)V
    .locals 1

    const-string v0, "intentFirstConfirmationInterceptorFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "logger"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "clientAttributionMetadata"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Ln10/o;->a:Lhm/d;

    return-void
.end method

.method public constructor <init>(Lhm/d;Lqy/d;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ln10/o;->a:Lhm/d;

    return-void
.end method


# virtual methods
.method public a(Ly00/g6;Ly00/o4;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p3, Ln10/p;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Ln10/p;

    iget v1, v0, Ln10/p;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ln10/p;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Ln10/p;

    invoke-direct {v0, p0, p3}, Ln10/p;-><init>(Ln10/o;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Ln10/p;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ln10/p;->F:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_5

    if-eq v2, v4, :cond_4

    if-eq v2, v3, :cond_2

    const/4 p1, 0x3

    if-ne v2, p1, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Le10/d;

    return-object p3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    if-nez p3, :cond_3

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :cond_4
    iget-object p2, v0, Ln10/p;->y:Ly00/o4;

    iget-object p1, v0, Ln10/p;->x:Ly00/g6;

    iget-object v1, v0, Ln10/p;->w:Ln10/o;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Ln10/p;->w:Ln10/o;

    iput-object p1, v0, Ln10/p;->x:Ly00/g6;

    iput-object p2, v0, Ln10/p;->y:Ly00/o4;

    iput v4, v0, Ln10/p;->F:I

    iget-object p3, p0, Ln10/o;->a:Lhm/d;

    invoke-virtual {p3, v0}, Lhm/d;->e(Ls83/c;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_6

    return-object v1

    :cond_6
    move-object v1, p0

    :goto_1
    if-nez p3, :cond_7

    iput-object v1, v0, Ln10/p;->w:Ln10/o;

    iput-object p1, v0, Ln10/p;->x:Ly00/g6;

    iput-object p2, v0, Ln10/p;->y:Ly00/o4;

    iput v3, v0, Ln10/p;->F:I

    const/4 p1, 0x0

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1
.end method

.method public b(Ly00/g6;Ly00/o4;Ls83/c;)V
    .locals 5

    instance-of v0, p3, Ln10/n;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Ln10/n;

    iget v1, v0, Ln10/n;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ln10/n;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Ln10/n;

    invoke-direct {v0, p0, p3}, Ln10/n;-><init>(Ln10/o;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Ln10/n;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ln10/n;->F:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v4, :cond_3

    if-ne v2, v3, :cond_2

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    if-nez p3, :cond_1

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    iget-object p2, v0, Ln10/n;->y:Ly00/o4;

    iget-object p1, v0, Ln10/n;->x:Ly00/g6;

    iget-object v1, v0, Ln10/n;->w:Ln10/o;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Ln10/n;->w:Ln10/o;

    iput-object p1, v0, Ln10/n;->x:Ly00/g6;

    iput-object p2, v0, Ln10/n;->y:Ly00/o4;

    iput v4, v0, Ln10/n;->F:I

    iget-object p3, p0, Ln10/o;->a:Lhm/d;

    invoke-virtual {p3, v0}, Lhm/d;->e(Ls83/c;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    return-void

    :cond_5
    move-object v1, p0

    :goto_1
    if-nez p3, :cond_6

    iget-object p3, p2, Ly00/o4;->w:Ljava/lang/String;

    iput-object v1, v0, Ln10/n;->w:Ln10/o;

    iput-object p1, v0, Ln10/n;->x:Ly00/g6;

    iput-object p2, v0, Ln10/n;->y:Ly00/o4;

    iput v3, v0, Ln10/n;->F:I

    const/4 p1, 0x0

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1
.end method
