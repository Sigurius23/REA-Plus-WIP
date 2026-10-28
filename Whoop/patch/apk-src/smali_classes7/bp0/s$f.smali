.class final synthetic Lbp0/s$f;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbp0/s;->Q(Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic E:Ldp0/g;

.field final synthetic F:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic G:Lp1/a1;

.field final synthetic H:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic I:Lcp0/t;

.field final synthetic w:Lep0/j;

.field final synthetic x:Z

.field final synthetic y:Lch0/v0;

.field final synthetic z:Lbc3/c0;


# direct methods
.method public constructor <init>(Lep0/j;ZLch0/v0;Lbc3/c0;Ldp0/g;Lp1/c1;Lp1/a1;Lp1/c1;Lcp0/t;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lep0/j;",
            "Z",
            "Lch0/v0;",
            "Lbc3/c0;",
            "Ldp0/g;",
            "Lp1/c1;",
            "Lp1/a1;",
            "Lp1/c1;",
            "Lcp0/t;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lbp0/s$f;->w:Lep0/j;

    iput-boolean p2, p0, Lbp0/s$f;->x:Z

    iput-object p3, p0, Lbp0/s$f;->y:Lch0/v0;

    iput-object p4, p0, Lbp0/s$f;->z:Lbc3/c0;

    iput-object p5, p0, Lbp0/s$f;->E:Ldp0/g;

    iput-object p6, p0, Lbp0/s$f;->F:Lp1/c1;

    iput-object p7, p0, Lbp0/s$f;->G:Lp1/a1;

    iput-object p8, p0, Lbp0/s$f;->H:Lp1/c1;

    iput-object p9, p0, Lbp0/s$f;->I:Lcp0/t;

    const-string p5, "GlobalCoachOverlay$openQuickVoice(Lcom/whoop/coacheverywherecommon/models/ScreenContextMetadata;ZLcom/whoop/ai/chat/view/AiChatWrapperScreenCoordinator;Lkotlinx/coroutines/CoroutineScope;Lcom/whoop/coacheverywherecommon/GlobalCoachManager;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Lcom/whoop/coacheverywhere/view/composables/CoachDrawerState;)V"

    const/4 p6, 0x0

    const/4 p2, 0x0

    const-class p3, Lkotlin/jvm/internal/j;

    const-string p4, "openQuickVoice"

    move-object p1, p0

    invoke-direct/range {p1 .. p6}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbp0/s$f;->invoke()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public final invoke()V
    .locals 9

    .line 2
    iget-object v0, p0, Lbp0/s$f;->w:Lep0/j;

    iget-boolean v1, p0, Lbp0/s$f;->x:Z

    iget-object v2, p0, Lbp0/s$f;->y:Lch0/v0;

    iget-object v3, p0, Lbp0/s$f;->z:Lbc3/c0;

    iget-object v4, p0, Lbp0/s$f;->E:Ldp0/g;

    iget-object v5, p0, Lbp0/s$f;->F:Lp1/c1;

    iget-object v6, p0, Lbp0/s$f;->G:Lp1/a1;

    iget-object v7, p0, Lbp0/s$f;->H:Lp1/c1;

    iget-object v8, p0, Lbp0/s$f;->I:Lcp0/t;

    invoke-static/range {v0 .. v8}, Lbp0/s;->a1(Lep0/j;ZLch0/v0;Lbc3/c0;Ldp0/g;Lp1/c1;Lp1/a1;Lp1/c1;Lcp0/t;)V

    return-void
.end method
