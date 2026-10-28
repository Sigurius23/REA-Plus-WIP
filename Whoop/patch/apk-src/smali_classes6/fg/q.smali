.class public final Lfg/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final synthetic b:Lfg/u;


# direct methods
.method public constructor <init>(Lfg/u;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfg/q;->b:Lfg/u;

    iput p2, p0, Lfg/q;->a:I

    return-void
.end method


# virtual methods
.method public final a(Leg/n;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lfg/q;->b:Lfg/u;

    iget v1, p0, Lfg/q;->a:I

    invoke-static {v0, v1, p1}, Lfg/u;->a(Lfg/u;ILs83/c;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final b(Lgg/f;Ls83/c;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lfg/q;->b:Lfg/u;

    iget-object v1, v0, Lfg/u;->a:Lqt/e;

    instance-of v2, p2, Lfg/p;

    if-eqz v2, :cond_0

    move-object v2, p2

    check-cast v2, Lfg/p;

    iget v3, v2, Lfg/p;->z:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lfg/p;->z:I

    goto :goto_0

    :cond_0
    new-instance v2, Lfg/p;

    invoke-direct {v2, p0, p2}, Lfg/p;-><init>(Lfg/q;Ls83/c;)V

    :goto_0
    iget-object p2, v2, Lfg/p;->x:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lfg/p;->z:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget p1, v2, Lfg/p;->w:I

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const/4 p2, 0x2

    if-eq p1, p2, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_3

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x5

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 p1, 0xa

    :goto_1
    iput p1, v2, Lfg/p;->w:I

    iput v5, v2, Lfg/p;->z:I

    invoke-virtual {v0, p1, v2}, Lfg/u;->c(ILs83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v3, :cond_4

    return-object v3

    :cond_4
    :goto_2
    new-instance p2, Lfg/q;

    invoke-direct {p2, v0, p1}, Lfg/q;-><init>(Lfg/u;I)V

    return-object p2
.end method
