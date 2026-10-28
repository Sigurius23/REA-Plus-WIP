.class public final Lx30/o0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/o;


# instance fields
.field public final synthetic E:Lx30/p0;

.field public synthetic w:Ljava/lang/String;

.field public synthetic x:Ljava/util/List;

.field public synthetic y:Ly00/i;

.field public synthetic z:Lzx/e;


# direct methods
.method public constructor <init>(Lx30/p0;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lx30/o0;->E:Lx30/p0;

    const/4 p1, 0x5

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/util/List;

    check-cast p3, Ly00/i;

    check-cast p4, Lzx/e;

    check-cast p5, Lq83/d;

    new-instance v0, Lx30/o0;

    iget-object v1, p0, Lx30/o0;->E:Lx30/p0;

    invoke-direct {v0, v1, p5}, Lx30/o0;-><init>(Lx30/p0;Lq83/d;)V

    iput-object p1, v0, Lx30/o0;->w:Ljava/lang/String;

    check-cast p2, Ljava/util/List;

    iput-object p2, v0, Lx30/o0;->x:Ljava/util/List;

    iput-object p3, v0, Lx30/o0;->y:Ly00/i;

    iput-object p4, v0, Lx30/o0;->z:Lzx/e;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lx30/o0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lx30/o0;->w:Ljava/lang/String;

    iget-object v0, p0, Lx30/o0;->x:Ljava/util/List;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lx30/o0;->y:Ly00/i;

    iget-object v2, p0, Lx30/o0;->z:Lzx/e;

    invoke-interface {v2}, Lzx/e;->a()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly00/b;

    iget-object v3, p0, Lx30/o0;->E:Lx30/p0;

    invoke-virtual {v3, p1, v0, v1, v2}, Lx30/p0;->u(Ljava/lang/String;Ljava/util/List;Ly00/i;Ly00/b;)Lg40/r3;

    move-result-object p1

    return-object p1
.end method
