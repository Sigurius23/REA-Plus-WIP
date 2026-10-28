.class public final Lb3/n2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb3/m3;


# instance fields
.field public a:Lc93/a;

.field public b:Lp1/k1;

.field public final c:Lp1/k1;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Lb3/n2;->c:Lp1/k1;

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 3

    iget-object v0, p0, Lb3/n2;->b:Lp1/k1;

    if-nez v0, :cond_1

    iget-object v0, p0, Lb3/n2;->a:Lc93/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/l;

    iget-wide v0, v0, Ly3/l;->a:J

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    new-instance v2, Ly3/l;

    invoke-direct {v2, v0, v1}, Ly3/l;-><init>(J)V

    invoke-static {v2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Lb3/n2;->b:Lp1/k1;

    const/4 v0, 0x0

    iput-object v0, p0, Lb3/n2;->a:Lc93/a;

    :cond_1
    iget-object v0, p0, Lb3/n2;->b:Lp1/k1;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/l;

    iget-wide v0, v0, Ly3/l;->a:J

    return-wide v0
.end method
