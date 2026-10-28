.class public abstract Lf0/g1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldc1/c;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Ldc1/c;-><init>(I)V

    new-instance v1, Lp1/b0;

    invoke-direct {v1, v0}, Lp1/b0;-><init>(Lkotlin/jvm/functions/Function1;)V

    sput-object v1, Lf0/g1;->a:Lp1/b0;

    return-void
.end method

.method public static final a(Landroidx/compose/runtime/Composer;)Lf0/k;
    .locals 10

    check-cast p0, Lp1/q;

    const v0, 0x10dd5ab0

    invoke-virtual {p0, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lf0/g1;->a:Lp1/b0;

    invoke-virtual {p0, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf0/l;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p0, v1}, Lp1/q;->q(Z)V

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_2

    :cond_1
    new-instance v4, Lf0/k;

    iget-object v5, v0, Lf0/l;->a:Landroid/content/Context;

    iget-object v6, v0, Lf0/l;->b:Ly3/c;

    iget-wide v7, v0, Lf0/l;->c:J

    iget-object v9, v0, Lf0/l;->d:Ll0/k1;

    invoke-direct/range {v4 .. v9}, Lf0/k;-><init>(Landroid/content/Context;Ly3/c;JLl0/k1;)V

    invoke-virtual {p0, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v3, v4

    :cond_2
    check-cast v3, Lf0/k;

    invoke-virtual {p0, v1}, Lp1/q;->q(Z)V

    return-object v3
.end method
