.class public final Lp00/n;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public w:I

.field public final synthetic x:Lp00/o;

.field public final synthetic y:Z


# direct methods
.method public constructor <init>(Lp00/o;ZLq83/d;)V
    .locals 0

    iput-object p1, p0, Lp00/n;->x:Lp00/o;

    iput-boolean p2, p0, Lp00/n;->y:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    new-instance p1, Lp00/n;

    iget-object v0, p0, Lp00/n;->x:Lp00/o;

    iget-boolean v1, p0, Lp00/n;->y:Z

    invoke-direct {p1, v0, v1, p2}, Lp00/n;-><init>(Lp00/o;ZLq83/d;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lp00/n;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lp00/n;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lp00/n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lp00/n;->w:I

    iget-object v2, p0, Lp00/n;->x:Lp00/o;

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v2, Lp00/o;->y:Lxz/x;

    iput v3, p0, Lp00/n;->w:I

    iget-boolean v1, p0, Lp00/n;->y:Z

    invoke-virtual {p1, v1, p0}, Lxz/x;->w(ZLs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    iget-object v0, v2, Lp00/o;->L:Lec3/h2;

    :cond_3
    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lp00/q;

    iget-boolean v2, v4, Lp00/q;->z:Z

    if-eqz v2, :cond_4

    if-nez p1, :cond_4

    move v8, v3

    goto :goto_1

    :cond_4
    const/4 v2, 0x0

    move v8, v2

    :goto_1
    if-eqz p1, :cond_5

    invoke-static {p1}, Lv8/b;->x(Ljava/lang/Throwable;)Lzy/c;

    move-result-object v2

    :goto_2
    move-object v6, v2

    goto :goto_3

    :cond_5
    const/4 v2, 0x0

    goto :goto_2

    :goto_3
    const/4 v7, 0x0

    const/16 v9, 0xfe3

    const/4 v5, 0x0

    invoke-static/range {v4 .. v9}, Lp00/q;->b(Lp00/q;ZLzy/c;ZZI)Lp00/q;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
