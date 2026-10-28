.class public final Lm40/q;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:I

.field public w:I

.field public final synthetic x:Lm40/w;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:I


# direct methods
.method public constructor <init>(Lm40/w;Ljava/lang/String;IILq83/d;)V
    .locals 0

    iput-object p1, p0, Lm40/q;->x:Lm40/w;

    iput-object p2, p0, Lm40/q;->y:Ljava/lang/String;

    iput p3, p0, Lm40/q;->z:I

    iput p4, p0, Lm40/q;->E:I

    const/4 p1, 0x1

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 6

    new-instance v0, Lm40/q;

    iget v3, p0, Lm40/q;->z:I

    iget v4, p0, Lm40/q;->E:I

    iget-object v1, p0, Lm40/q;->x:Lm40/w;

    iget-object v2, p0, Lm40/q;->y:Ljava/lang/String;

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lm40/q;-><init>(Lm40/w;Ljava/lang/String;IILq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lm40/q;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lm40/q;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lm40/q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lm40/q;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lm40/q;->x:Lm40/w;

    iget-object v1, p0, Lm40/q;->y:Ljava/lang/String;

    invoke-static {p1, v1}, Lm40/w;->b(Lm40/w;Ljava/lang/String;)Ll83/n;

    move-result-object v3

    if-eqz v3, :cond_2

    :goto_0
    iget-object p1, v3, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_2
    invoke-static {p1, v1}, Lm40/w;->a(Lm40/w;Ljava/lang/String;)Ll83/n;

    move-result-object v3

    if-eqz v3, :cond_3

    goto :goto_0

    :cond_3
    iput v2, p0, Lm40/q;->w:I

    iget v2, p0, Lm40/q;->z:I

    iget v3, p0, Lm40/q;->E:I

    invoke-static {p1, v1, v2, v3, p0}, Lm40/w;->c(Lm40/w;Ljava/lang/String;IILs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    new-instance v0, Ll83/n;

    invoke-direct {v0, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
