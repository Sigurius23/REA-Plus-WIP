.class public final Le10/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/lifecycle/k1;

.field public final b:Le10/j;

.field public c:Ljava/lang/Object;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/k1;Le10/j;)V
    .locals 1

    const-string v0, "savedStateHandle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "definition"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le10/i0;->a:Landroidx/lifecycle/k1;

    iput-object p2, p0, Le10/i0;->b:Le10/j;

    invoke-interface {p2}, Le10/j;->getKey()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Parameters"

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Le10/i0;->d:Ljava/lang/String;

    invoke-interface {p2}, Le10/j;->getKey()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Le10/i0;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Le10/l;Le10/k;Ls83/c;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p3, Le10/h0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Le10/h0;

    iget v1, v0, Le10/h0;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le10/h0;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Le10/h0;

    invoke-direct {v0, p0, p3}, Le10/h0;-><init>(Le10/i0;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Le10/h0;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le10/h0;->F:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Le10/h0;->y:Le10/l;

    iget-object p2, v0, Le10/h0;->x:Le10/k;

    iget-object v0, v0, Le10/h0;->w:Le10/i0;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v5, p1

    move-object v4, v0

    :goto_1
    move-object v6, p2

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Le10/i0;->b:Le10/j;

    invoke-interface {p3, p1}, Le10/j;->b(Le10/l;)Le10/l;

    move-result-object v2

    if-nez v2, :cond_3

    new-instance p2, Le10/d0;

    new-instance p3, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-interface {p1}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    const-class v1, Le10/i0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\' cannot be used with "

    const-string v2, " to read a result"

    const-string v3, "Parameter type of \'"

    invoke-static {v3, p1, v1, v0, v2}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    const p1, 0x7f1410f2

    invoke-static {p1}, Ls4/i;->h(I)Lzy/b;

    move-result-object p1

    sget-object v0, Le10/r;->a:Le10/r;

    invoke-direct {p2, p3, p1, v0}, Le10/d0;-><init>(Ljava/lang/Throwable;Lzy/c;Le10/u;)V

    return-object p2

    :cond_3
    iput-object p0, v0, Le10/h0;->w:Le10/i0;

    iput-object p2, v0, Le10/h0;->x:Le10/k;

    iput-object v2, v0, Le10/h0;->y:Le10/l;

    iput v3, v0, Le10/h0;->F:I

    invoke-interface {p3, v2, p2, v0}, Le10/j;->e(Le10/l;Le10/k;Le10/h0;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    return-object v1

    :cond_4
    move-object v4, p0

    move-object v5, v2

    goto :goto_1

    :goto_2
    check-cast p3, Le10/d;

    instance-of p1, p3, Le10/c;

    if-eqz p1, :cond_6

    iget-object v8, v4, Le10/i0;->c:Ljava/lang/Object;

    if-eqz v8, :cond_5

    new-instance p1, Le10/e0;

    new-instance v3, La00/h;

    move-object v7, p3

    check-cast v7, Le10/c;

    const/4 v9, 0x7

    invoke-direct/range {v3 .. v9}, La00/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iget-boolean p2, v7, Le10/c;->b:Z

    invoke-direct {p1, v3, p2}, Le10/e0;-><init>(La00/h;Z)V

    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    iget-object p2, v4, Le10/i0;->b:Le10/j;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    sget-object p3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {p3, p2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p2

    invoke-interface {p2}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    const-string p3, "No launcher for "

    const-string v0, " was found, did you call register?"

    invoke-static {p3, p2, v0}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    new-instance p2, Le10/d0;

    invoke-static {p1}, Lx30/s0;->H(Ljava/lang/Throwable;)Lzy/c;

    move-result-object p3

    sget-object v0, Le10/p;->a:Le10/p;

    invoke-direct {p2, p1, p3, v0}, Le10/d0;-><init>(Ljava/lang/Throwable;Lzy/c;Le10/u;)V

    return-object p2

    :cond_6
    instance-of p1, p3, Le10/a;

    if-eqz p1, :cond_7

    new-instance p1, Le10/c0;

    check-cast p3, Le10/a;

    iget-object p2, p3, Le10/a;->a:Ly00/c8;

    iget-object v0, p3, Le10/a;->b:Ln10/c0;

    iget-boolean p3, p3, Le10/a;->c:Z

    invoke-direct {p1, p2, v0, p3}, Le10/c0;-><init>(Ly00/c8;Ln10/c0;Z)V

    return-object p1

    :cond_7
    instance-of p1, p3, Le10/b;

    if-eqz p1, :cond_8

    new-instance p1, Le10/d0;

    check-cast p3, Le10/b;

    iget-object p2, p3, Le10/b;->a:Ljava/lang/Throwable;

    iget-object v0, p3, Le10/b;->b:Lzy/c;

    iget-object p3, p3, Le10/b;->c:Le10/u;

    invoke-direct {p1, p2, v0, p3}, Le10/d0;-><init>(Ljava/lang/Throwable;Lzy/c;Le10/u;)V

    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
