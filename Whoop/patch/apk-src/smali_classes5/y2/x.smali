.class public final Ly2/x;
.super Lb2/v;
.source "SourceFile"


# instance fields
.field public O:Ly2/w;

.field public P:Lj3/d;

.field public Q:Lj3/c;

.field public final R:Lj43/a;


# direct methods
.method public constructor <init>(Ly2/w;)V
    .locals 1

    invoke-direct {p0}, Lb2/v;-><init>()V

    iput-object p1, p0, Ly2/x;->O:Ly2/w;

    new-instance p1, Lj43/a;

    const/16 v0, 0x15

    invoke-direct {p1, p0, v0}, Lj43/a;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Ly2/x;->R:Lj43/a;

    return-void
.end method


# virtual methods
.method public final P0()V
    .locals 1

    iget-object v0, p0, Ly2/x;->P:Lj3/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lj3/d;->b()V

    :cond_0
    iget-object v0, p0, Ly2/x;->R:Lj43/a;

    invoke-static {p0, v0}, Ls4/d;->h(Lb2/v;Lkotlin/jvm/functions/Function1;)Lj3/d;

    move-result-object v0

    iput-object v0, p0, Ly2/x;->P:Lj3/d;

    return-void
.end method

.method public final Q0()V
    .locals 2

    iget-object v0, p0, Ly2/x;->P:Lj3/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lj3/d;->b()V

    :cond_0
    iget-object v0, p0, Ly2/x;->O:Ly2/w;

    const/4 v1, 0x0

    iget-object v0, v0, Ly2/w;->a:Lp1/k1;

    invoke-virtual {v0, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method
