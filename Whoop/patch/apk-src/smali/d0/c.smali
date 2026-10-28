.class public final Ld0/c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Ld0/e;

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ld0/e;Ljava/lang/Object;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Ld0/c;->w:Ld0/e;

    iput-object p2, p0, Ld0/c;->x:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 3

    new-instance v0, Ld0/c;

    iget-object v1, p0, Ld0/c;->w:Ld0/e;

    iget-object v2, p0, Ld0/c;->x:Ljava/lang/Object;

    invoke-direct {v0, v1, v2, p1}, Ld0/c;-><init>(Ld0/e;Ljava/lang/Object;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Ld0/c;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld0/c;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Ld0/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ld0/c;->w:Ld0/e;

    invoke-static {p1}, Ld0/e;->b(Ld0/e;)V

    iget-object v0, p0, Ld0/c;->x:Ljava/lang/Object;

    invoke-static {p1, v0}, Ld0/e;->a(Ld0/e;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p1, Ld0/e;->c:Ld0/m;

    iget-object v1, v1, Ld0/m;->x:Lp1/k1;

    invoke-virtual {v1, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object p1, p1, Ld0/e;->e:Lp1/k1;

    invoke-virtual {p1, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
