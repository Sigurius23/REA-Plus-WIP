.class public final La30/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lz20/g;


# direct methods
.method public constructor <init>(Lz20/g;)V
    .locals 1

    const-string v0, "customerRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La30/e0;->a:Lz20/g;

    return-void
.end method


# virtual methods
.method public final a(Lmy/a;Lz20/h;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p3, La30/d0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, La30/d0;

    iget v1, v0, La30/d0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, La30/d0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, La30/d0;

    invoke-direct {v0, p0, p3}, La30/d0;-><init>(La30/e0;Ls83/c;)V

    :goto_0
    iget-object p3, v0, La30/d0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La30/d0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p1, Lmy/a;->E:Lh20/i1;

    if-eqz p1, :cond_4

    iget-object p1, p1, Lh20/i1;->x:Ljava/lang/String;

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    return-object p1

    :cond_4
    :goto_1
    if-eqz p2, :cond_6

    iput v3, v0, La30/d0;->y:I

    iget-object p1, p0, La30/e0;->a:Lz20/g;

    invoke-virtual {p1, p2, v0}, Lz20/g;->d(Lz20/h;Ls83/c;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    check-cast p3, Ly00/q0;

    if-eqz p3, :cond_6

    iget-object p1, p3, Ly00/q0;->I:Ljava/lang/String;

    return-object p1

    :cond_6
    const/4 p1, 0x0

    return-object p1
.end method
