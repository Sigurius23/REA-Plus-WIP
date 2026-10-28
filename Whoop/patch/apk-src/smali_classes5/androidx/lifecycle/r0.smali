.class public final Landroidx/lifecycle/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/q0;


# instance fields
.field public final a:Landroidx/lifecycle/j;

.field public final b:Lq83/j;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/j;Lq83/j;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/r0;->a:Landroidx/lifecycle/j;

    sget-object p1, Lbc3/q0;->a:Lkc3/e;

    sget-object p1, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {p1}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object p1

    invoke-interface {p2, p1}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p1

    iput-object p1, p0, Landroidx/lifecycle/r0;->b:Lq83/j;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Le;

    const/4 v1, 0x0

    const/16 v2, 0xa

    invoke-direct {v0, p0, p1, v1, v2}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iget-object p1, p0, Landroidx/lifecycle/r0;->b:Lq83/j;

    invoke-static {p1, v0, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
