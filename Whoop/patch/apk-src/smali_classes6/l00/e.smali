.class public final Ll00/e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Lh00/b0;

.field public final synthetic x:Lf0/r1;


# direct methods
.method public constructor <init>(Lh00/b0;Lf0/r1;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Ll00/e;->w:Lh00/b0;

    iput-object p2, p0, Ll00/e;->x:Lf0/r1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    new-instance p1, Ll00/e;

    iget-object v0, p0, Ll00/e;->w:Lh00/b0;

    iget-object v1, p0, Ll00/e;->x:Lf0/r1;

    invoke-direct {p1, v0, v1, p2}, Ll00/e;-><init>(Lh00/b0;Lf0/r1;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ll00/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ll00/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ll00/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ll00/e;->w:Lh00/b0;

    if-eqz p1, :cond_0

    iget-object v0, p0, Ll00/e;->x:Lf0/r1;

    invoke-virtual {v0}, Lf0/r1;->c()Z

    move-result v0

    iget-object p1, p1, Lh00/b0;->a:Lv20/g;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Lv20/g;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
