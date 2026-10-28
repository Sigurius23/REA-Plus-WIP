.class public abstract Ld41/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Li91/a;",
        "a",
        "(Landroidx/compose/runtime/Composer;I)Li91/a;",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Landroidx/compose/runtime/Composer;I)Li91/a;
    .locals 9

    sget-object p1, Li2/t;->b:Li2/s;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    sget-wide v2, Li2/x;->m:J

    new-instance v4, Li2/x;

    invoke-direct {v4, v2, v3}, Li2/x;-><init>(J)V

    new-instance v5, Ll83/k;

    invoke-direct {v5, v1, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v1, 0x3e800000    # 0.25f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    new-instance v4, Li2/x;

    invoke-direct {v4, v2, v3}, Li2/x;-><init>(J)V

    new-instance v2, Ll83/k;

    invoke-direct {v2, v1, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0x3f266666    # 0.65f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    sget-object v3, Lx81/d;->a:Lx81/d;

    const/4 v4, 0x6

    invoke-virtual {v3, p0, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->n()J

    move-result-wide v6

    new-instance v8, Li2/x;

    invoke-direct {v8, v6, v7}, Li2/x;-><init>(J)V

    new-instance v6, Ll83/k;

    invoke-direct {v6, v1, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v3, p0, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->n()J

    move-result-wide v3

    new-instance p0, Li2/x;

    invoke-direct {p0, v3, v4}, Li2/x;-><init>(J)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v5, v2, v6, v3}, [Ll83/k;

    move-result-object p0

    const/16 v1, 0xe

    invoke-static {p1, p0, v0, v0, v1}, Li2/s;->l(Li2/s;[Ll83/k;FFI)Li2/k0;

    move-result-object p0

    invoke-static {p0}, Li91/c;->h(Li2/t;)Li91/a;

    move-result-object p0

    return-object p0
.end method
