.class public final Lhy0/n$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhy0/n;->W(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/runtime/Composer;I)V
    .locals 13

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p2, v3

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_1

    const p2, 0xc965306

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    invoke-static {}, Lhy0/n;->h0()Lhy0/r;

    move-result-object v3

    sget-object v7, Lhy0/o;->FIT:Lhy0/o;

    sget-object v8, Lhy0/s;->PINCH:Lhy0/s;

    const/16 v11, 0x67

    const/4 v12, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v3 .. v12}, Lhy0/r;->b(Lhy0/r;Ljava/lang/String;Lhy0/p;Lhy0/i;Lhy0/o;Lhy0/s;Lhy0/j;Lhy0/q;ILjava/lang/Object;)Lhy0/r;

    move-result-object p2

    new-instance v0, Lkd1/o$a;

    sget v1, Lgy0/a;->O4:I

    invoke-direct {v0, v1}, Lkd1/o$a;-><init>(I)V

    const/4 v1, 0x6

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v3, p2, v0, p1, v1}, Lhy0/n;->u(Landroidx/compose/ui/Modifier;Lhy0/r;Lkd1/o;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, v2}, Lp1/q;->q(Z)V

    return-void

    :cond_1
    invoke-virtual {p1}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lhy0/n$d;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
