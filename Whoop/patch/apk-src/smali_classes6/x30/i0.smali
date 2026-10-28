.class public final Lx30/i0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public synthetic w:Lg40/s3;

.field public synthetic x:Ljava/lang/String;

.field public synthetic y:Z

.field public final synthetic z:Lp1/c1;


# direct methods
.method public constructor <init>(Lp1/c1;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lx30/i0;->z:Lp1/c1;

    const/4 p1, 0x4

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lg40/s3;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    check-cast p4, Lq83/d;

    new-instance v0, Lx30/i0;

    iget-object v1, p0, Lx30/i0;->z:Lp1/c1;

    invoke-direct {v0, v1, p4}, Lx30/i0;-><init>(Lp1/c1;Lq83/d;)V

    iput-object p1, v0, Lx30/i0;->w:Lg40/s3;

    iput-object p2, v0, Lx30/i0;->x:Ljava/lang/String;

    iput-boolean p3, v0, Lx30/i0;->y:Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lx30/i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lx30/i0;->w:Lg40/s3;

    iget-object v0, p0, Lx30/i0;->x:Ljava/lang/String;

    iget-boolean v1, p0, Lx30/i0;->y:Z

    instance-of p1, p1, Lg40/u3;

    if-eqz p1, :cond_0

    if-nez v1, :cond_0

    iget-object p1, p0, Lx30/i0;->z:Lp1/c1;

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p1

    const/16 v0, 0x10

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
