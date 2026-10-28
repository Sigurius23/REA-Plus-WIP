.class final Lbm2/q$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbm2/q$c;->a(Ll0/s1;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function3;"
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


# instance fields
.field final synthetic w:Lm91/u;


# direct methods
.method public constructor <init>(Lm91/u;)V
    .locals 0

    iput-object p1, p0, Lbm2/q$c$a;->w:Lm91/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 3

    const-string p3, "it"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const p1, 0x68f01486

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    iget-object p1, p0, Lbm2/q$c$a;->w:Lm91/u;

    instance-of p1, p1, Lhy0/e;

    sget-object p3, Lb2/t;->w:Lb2/t;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const p1, -0x459a8177

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    const/4 p1, 0x2

    int-to-float v1, p1

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v1, v2

    const/4 v2, 0x0

    invoke-static {p3, v1, v2, p1}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object p1

    iget-object p3, p0, Lbm2/q$c$a;->w:Lm91/u;

    check-cast p3, Lhy0/e;

    invoke-virtual {p3}, Lhy0/e;->c()Lcom/whoop/design/util/TextResource;

    move-result-object p3

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {p3, p2, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object p3

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "divider "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p1, p3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-virtual {p2, v0}, Lp1/q;->q(Z)V

    goto :goto_0

    :cond_0
    const p1, -0x45964819

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    iget-object p1, p0, Lbm2/q$c$a;->w:Lm91/u;

    const-string v1, "null cannot be cast to non-null type com.whoop.design.atomic.organism.menuitem.MenuItemState"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ly71/o;

    invoke-virtual {p1}, Ly71/o;->o()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {p1, p2, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "menu item "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p3, p1}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-virtual {p2, v0}, Lp1/q;->q(Z)V

    :goto_0
    invoke-virtual {p2, v0}, Lp1/q;->q(Z)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm91/u;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lbm2/q$c$a;->a(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1
.end method
