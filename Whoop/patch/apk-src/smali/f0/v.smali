.class public final Lf0/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:Z

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Lc93/a;


# direct methods
.method public constructor <init>(Lc93/a;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p3, p0, Lf0/v;->w:Z

    iput-object p2, p0, Lf0/v;->x:Ljava/lang/String;

    iput-object p1, p0, Lf0/v;->y:Lc93/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    check-cast p1, Landroidx/compose/ui/Modifier;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    check-cast p2, Lp1/q;

    const p1, -0x2d10e1f7

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    sget-object p1, Landroidx/compose/foundation/d;->a:Lp1/b0;

    invoke-virtual {p2, p1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lf0/v0;

    instance-of p1, v2, Lf0/v0;

    const/4 p3, 0x0

    if-eqz p1, :cond_0

    const p1, -0x5fa58202

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    const/4 p1, 0x0

    :goto_0
    move-object v1, p1

    goto :goto_1

    :cond_0
    const p1, -0x5fa37bf8

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne p1, v0, :cond_1

    invoke-static {p2}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object p1

    :cond_1
    check-cast p1, Lj0/i;

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    goto :goto_0

    :goto_1
    const/4 v5, 0x0

    iget-object v6, p0, Lf0/v;->y:Lc93/a;

    sget-object v0, Lb2/t;->w:Lb2/t;

    iget-boolean v3, p0, Lf0/v;->w:Z

    iget-object v4, p0, Lf0/v;->x:Ljava/lang/String;

    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/a;->d(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLjava/lang/String;Li3/i;Lc93/a;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    return-object p1
.end method
