.class public final Lq1/t;
.super Lq1/j0;
.source "SourceFile"


# static fields
.field public static final d:Lq1/t;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lq1/t;

    const/4 v1, 0x3

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lq1/j0;-><init>(III)V

    sput-object v0, Lq1/t;->d:Lq1/t;

    return-void
.end method


# virtual methods
.method public final d(Lb83/i;Lp1/c;Lp1/i2;Lx1/h;Lq1/k0;)V
    .locals 7

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lb83/i;->c(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp1/f2;

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Lb83/i;->c(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp1/a;

    const/4 v4, 0x2

    invoke-virtual {p1, v4}, Lb83/i;->c(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq1/c;

    invoke-virtual {v1}, Lp1/f2;->e()Lp1/i2;

    move-result-object v4

    if-eqz p5, :cond_0

    :try_start_0
    new-instance v5, Ld1/j;

    const/16 v6, 0x1a

    invoke-direct {v5, v6, p5, p3}, Ld1/j;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    :goto_0
    iget-object p5, p1, Lq1/c;->b:Lq1/l0;

    invoke-virtual {p5}, Lq1/l0;->e0()Z

    move-result p5

    if-nez p5, :cond_1

    const-string p5, "FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?"

    invoke-static {p5}, Lp1/r;->c(Ljava/lang/String;)V

    :cond_1
    iget-object p1, p1, Lq1/c;->a:Lq1/l0;

    invoke-virtual {p1, p2, v4, p4, v5}, Lq1/l0;->d0(Lp1/c;Lp1/i2;Lx1/h;Lq1/k0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v4, v0}, Lp1/i2;->e(Z)V

    invoke-virtual {p3}, Lp1/i2;->d()V

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v3}, Lp1/f2;->a(Lp1/a;)I

    move-result p1

    invoke-virtual {p3, v1, p1}, Lp1/i2;->z(Lp1/f2;I)V

    invoke-virtual {p3}, Lp1/i2;->k()V

    return-void

    :goto_1
    invoke-virtual {v4, v2}, Lp1/i2;->e(Z)V

    throw p1
.end method
