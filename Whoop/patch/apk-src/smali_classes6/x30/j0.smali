.class public final Lx30/j0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public synthetic w:Z

.field public final synthetic x:La40/a;

.field public final synthetic y:Lp1/c1;


# direct methods
.method public constructor <init>(La40/a;Lp1/c1;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lx30/j0;->x:La40/a;

    iput-object p2, p0, Lx30/j0;->y:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    new-instance v0, Lx30/j0;

    iget-object v1, p0, Lx30/j0;->x:La40/a;

    iget-object v2, p0, Lx30/j0;->y:Lp1/c1;

    invoke-direct {v0, v1, v2, p2}, Lx30/j0;-><init>(La40/a;Lp1/c1;Lq83/d;)V

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, v0, Lx30/j0;->w:Z

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lx30/j0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lx30/j0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lx30/j0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lx30/j0;->w:Z

    if-eqz p1, :cond_0

    sget-object p1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->x:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    iget-object p1, p0, Lx30/j0;->x:La40/a;

    invoke-interface {p1}, La40/a;->a()V

    iget-object p1, p0, Lx30/j0;->y:Lp1/c1;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
