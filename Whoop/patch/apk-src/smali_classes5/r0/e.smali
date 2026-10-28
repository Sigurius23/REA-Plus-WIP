.class public final synthetic Lr0/e;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Lr0/f;

.field public final synthetic x:Landroidx/compose/ui/node/NodeCoordinator;

.field public final synthetic y:La3/z0;


# direct methods
.method public constructor <init>(Lr0/f;Landroidx/compose/ui/node/NodeCoordinator;La3/z0;)V
    .locals 6

    iput-object p1, p0, Lr0/e;->w:Lr0/f;

    iput-object p2, p0, Lr0/e;->x:Landroidx/compose/ui/node/NodeCoordinator;

    iput-object p3, p0, Lr0/e;->y:La3/z0;

    const-string v4, "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;"

    const/4 v5, 0x0

    const/4 v1, 0x0

    const-class v2, Lkotlin/jvm/internal/j;

    const-string v3, "localRect"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lr0/e;->x:Landroidx/compose/ui/node/NodeCoordinator;

    iget-object v1, p0, Lr0/e;->y:La3/z0;

    iget-object v2, p0, Lr0/e;->w:Lr0/f;

    invoke-static {v2, v0, v1}, Lr0/f;->X0(Lr0/f;Landroidx/compose/ui/node/NodeCoordinator;La3/z0;)Lh2/c;

    move-result-object v0

    return-object v0
.end method
