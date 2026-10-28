.class public final Lh21/c$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh21/c;->z(Landroidx/compose/runtime/Composer;I)V
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
    .locals 16

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/lit8 v2, p2, 0x1

    move-object/from16 v7, p1

    check-cast v7, Lp1/q;

    invoke-virtual {v7, v2, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_2

    const v0, -0x2f1cdfcf

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    int-to-float v0, v3

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v0, v2

    const/4 v2, 0x0

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v0, v2, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    new-instance v5, Lh21/d;

    new-instance v8, Lh21/e;

    new-instance v10, Lkd1/o$a;

    sget v0, Lgy0/a;->c:I

    invoke-direct {v10, v0}, Lkd1/o$a;-><init>(I)V

    const/16 v14, 0x18

    const/4 v15, 0x0

    const-string v9, "1"

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v8 .. v15}, Lh21/e;-><init>(Ljava/lang/String;Lkd1/o;Ljava/lang/String;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v8}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const-string v2, "1"

    invoke-direct {v5, v0, v2}, Lh21/d;-><init>(Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v0, v2, :cond_1

    sget-object v0, Lh21/c$h;->w:Lh21/c$h;

    invoke-virtual {v7, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/16 v8, 0x186

    const/4 v9, 0x0

    invoke-static/range {v4 .. v9}, Lh21/c;->r(Landroidx/compose/ui/Modifier;Lh21/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    return-void

    :cond_2
    invoke-virtual {v7}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lh21/c$g;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
