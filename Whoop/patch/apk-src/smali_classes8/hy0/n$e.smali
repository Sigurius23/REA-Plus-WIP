.class public final Lhy0/n$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhy0/n;->Y(Landroidx/compose/runtime/Composer;I)V
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
    .locals 18

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
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v7, p1

    check-cast v7, Lp1/q;

    invoke-virtual {v7, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, -0x451ee893

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    new-instance v4, Lhy0/r;

    sget-object v11, Lhy0/i;->PDF:Lhy0/i;

    sget-object v12, Lhy0/o;->FIT:Lhy0/o;

    sget-object v13, Lhy0/s;->NONE:Lhy0/s;

    const/16 v16, 0x62

    const/16 v17, 0x0

    const-string v9, "https://example.com/sample.pdf"

    const/4 v10, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v8, v4

    invoke-direct/range {v8 .. v17}, Lhy0/r;-><init>(Ljava/lang/String;Lhy0/p;Lhy0/i;Lhy0/o;Lhy0/s;Lhy0/j;Lhy0/q;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v6, 0x0

    const/16 v8, 0xd86

    sget-object v3, Lb2/t;->w:Lb2/t;

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lhy0/n;->e0(Landroidx/compose/ui/Modifier;Lhy0/r;Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    return-void

    :cond_1
    invoke-virtual {v7}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lhy0/n$e;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
