.class public abstract Ll1/q3;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/u2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ll1/f0;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Ll1/f0;-><init>(I)V

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Ll1/q3;->a:Lp1/u2;

    return-void
.end method

.method public static final a(Ll1/p3;Lo1/t;)Li2/a1;
    .locals 7

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    packed-switch p1, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    iget-object p0, p0, Ll1/p3;->b:Lt0/a;

    return-object p0

    :pswitch_1
    sget-object p0, Li2/w0;->a:Li2/v0;

    return-object p0

    :pswitch_2
    iget-object p0, p0, Ll1/p3;->c:Lt0/a;

    return-object p0

    :pswitch_3
    iget-object p0, p0, Ll1/p3;->d:Lt0/a;

    invoke-static {p0}, Ll1/q3;->c(Lt0/a;)Lt0/a;

    move-result-object p0

    return-object p0

    :pswitch_4
    iget-object v0, p0, Ll1/p3;->d:Lt0/a;

    sget-object v2, Ll1/o3;->i:Lt0/e;

    const/16 v5, 0x9

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v4, 0x0

    move-object v3, v2

    invoke-static/range {v0 .. v6}, Lt0/a;->d(Lt0/a;Lt0/b;Lt0/b;Lt0/b;Lt0/b;ILjava/lang/Object;)Lt0/a;

    move-result-object p0

    return-object p0

    :pswitch_5
    iget-object p0, p0, Ll1/p3;->f:Lt0/a;

    return-object p0

    :pswitch_6
    iget-object v0, p0, Ll1/p3;->d:Lt0/a;

    sget-object v1, Ll1/o3;->i:Lt0/e;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, v1

    invoke-static/range {v0 .. v6}, Lt0/a;->d(Lt0/a;Lt0/b;Lt0/b;Lt0/b;Lt0/b;ILjava/lang/Object;)Lt0/a;

    move-result-object p0

    return-object p0

    :pswitch_7
    iget-object p0, p0, Ll1/p3;->d:Lt0/a;

    return-object p0

    :pswitch_8
    sget-object p0, Lt0/j;->a:Lt0/i;

    return-object p0

    :pswitch_9
    iget-object p0, p0, Ll1/p3;->a:Lt0/a;

    invoke-static {p0}, Ll1/q3;->c(Lt0/a;)Lt0/a;

    move-result-object p0

    return-object p0

    :pswitch_a
    iget-object p0, p0, Ll1/p3;->a:Lt0/a;

    return-object p0

    :pswitch_b
    iget-object p0, p0, Ll1/p3;->e:Lt0/a;

    invoke-static {p0}, Ll1/q3;->c(Lt0/a;)Lt0/a;

    move-result-object p0

    return-object p0

    :pswitch_c
    iget-object p0, p0, Ll1/p3;->g:Lt0/a;

    return-object p0

    :pswitch_d
    iget-object p0, p0, Ll1/p3;->e:Lt0/a;

    return-object p0

    :pswitch_e
    iget-object p0, p0, Ll1/p3;->h:Lt0/a;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final b(Lo1/t;Landroidx/compose/runtime/Composer;)Li2/a1;
    .locals 1

    sget-object v0, Ll1/q3;->a:Lp1/u2;

    check-cast p1, Lp1/q;

    invoke-virtual {p1, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll1/p3;

    invoke-static {p1, p0}, Ll1/q3;->a(Ll1/p3;Lo1/t;)Li2/a1;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lt0/a;)Lt0/a;
    .locals 7

    sget-object v3, Ll1/o3;->i:Lt0/e;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v4, v3

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lt0/a;->d(Lt0/a;Lt0/b;Lt0/b;Lt0/b;Lt0/b;ILjava/lang/Object;)Lt0/a;

    move-result-object p0

    return-object p0
.end method
