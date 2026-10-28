.class public final Lwc/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lve/c;


# instance fields
.field public final w:Lvg/n;

.field public final x:Lpf/a;

.field public final y:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lpf/a;Lvg/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lwc/j1;->w:Lvg/n;

    iput-object p2, p0, Lwc/j1;->x:Lpf/a;

    iput-object p1, p0, Lwc/j1;->y:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final b(Lgf/b;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lwc/i1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lwc/i1;

    iget v1, v0, Lwc/i1;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwc/i1;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwc/i1;

    invoke-direct {v0, p0, p2}, Lwc/i1;-><init>(Lwc/j1;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lwc/i1;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwc/i1;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lwc/j1;->x:Lpf/a;

    iget-object v2, p0, Lwc/j1;->y:Ljava/lang/String;

    iget-object v4, p0, Lwc/j1;->w:Lvg/n;

    invoke-static {v2, p2, v4}, Lwc/f1;->a(Ljava/lang/String;Lpf/a;Lvg/n;)Lwc/h1;

    move-result-object p2

    iput v3, v0, Lwc/i1;->y:I

    invoke-virtual {p2, p1, v0}, Lwc/h1;->b(Lgf/b;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lve/e;

    sget-object p1, Lie/a;->E:Lie/a;

    invoke-static {p2, p1}, Ldc/a;->R(Lve/e;Lbf/a;)Lve/e;

    move-result-object p1

    return-object p1
.end method

.method public final close()V
    .locals 0

    return-void
.end method
