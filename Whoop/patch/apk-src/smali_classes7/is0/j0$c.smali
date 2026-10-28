.class final synthetic Lis0/j0$c;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lis0/j0;->z(Landroidx/compose/ui/Modifier;Lis0/s0;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/i;",
        "Lc93/a;"
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
.field final synthetic E:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic F:Lis0/m0;

.field final synthetic w:Lb3/x2;

.field final synthetic x:Lg2/i;

.field final synthetic y:Lbc3/c0;

.field final synthetic z:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lb3/x2;Lg2/i;Lbc3/c0;Lp1/c1;Lp1/c1;Lis0/m0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb3/x2;",
            "Lg2/i;",
            "Lbc3/c0;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lis0/m0;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lis0/j0$c;->w:Lb3/x2;

    iput-object p2, p0, Lis0/j0$c;->x:Lg2/i;

    iput-object p3, p0, Lis0/j0$c;->y:Lbc3/c0;

    iput-object p4, p0, Lis0/j0$c;->z:Lp1/c1;

    iput-object p5, p0, Lis0/j0$c;->E:Lp1/c1;

    iput-object p6, p0, Lis0/j0$c;->F:Lis0/m0;

    const-string p5, "ReactionsPanel$collapse(Landroidx/compose/ui/platform/SoftwareKeyboardController;Landroidx/compose/ui/focus/FocusManager;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/whoop/communityreactions/view/ReactionsPanelState;)V"

    const/4 p6, 0x0

    const/4 p2, 0x0

    const-class p3, Lkotlin/jvm/internal/j;

    const-string p4, "collapse"

    move-object p1, p0

    invoke-direct/range {p1 .. p6}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lis0/j0$c;->invoke()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public final invoke()V
    .locals 6

    .line 2
    iget-object v0, p0, Lis0/j0$c;->w:Lb3/x2;

    iget-object v1, p0, Lis0/j0$c;->x:Lg2/i;

    iget-object v2, p0, Lis0/j0$c;->y:Lbc3/c0;

    iget-object v3, p0, Lis0/j0$c;->z:Lp1/c1;

    iget-object v4, p0, Lis0/j0$c;->E:Lp1/c1;

    iget-object v5, p0, Lis0/j0$c;->F:Lis0/m0;

    invoke-static/range {v0 .. v5}, Lis0/j0;->t0(Lb3/x2;Lg2/i;Lbc3/c0;Lp1/c1;Lp1/c1;Lis0/m0;)V

    return-void
.end method
