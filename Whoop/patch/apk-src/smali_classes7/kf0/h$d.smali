.class final Lkf0/h$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkf0/h;->m(Ljava/lang/String;Lkd0/c;ZLcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Lcom/whoop/design/models/modal/AnyModal;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.advancedlabs.view.AdvancedLabsScreenKt$AdvancedLabsScreen$8$1"
    f = "AdvancedLabsScreen.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lbc3/c0;

.field final synthetic y:Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;

.field final synthetic z:Ll1/w3;


# direct methods
.method public constructor <init>(Lbc3/c0;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Ll1/w3;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;",
            "Ll1/w3;",
            "Lq83/d<",
            "-",
            "Lkf0/h$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkf0/h$d;->x:Lbc3/c0;

    iput-object p2, p0, Lkf0/h$d;->y:Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;

    iput-object p3, p0, Lkf0/h$d;->z:Ll1/w3;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lkf0/h$d;

    iget-object v0, p0, Lkf0/h$d;->x:Lbc3/c0;

    iget-object v1, p0, Lkf0/h$d;->y:Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;

    iget-object v2, p0, Lkf0/h$d;->z:Ll1/w3;

    invoke-direct {p1, v0, v1, v2, p2}, Lkf0/h$d;-><init>(Lbc3/c0;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Ll1/w3;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lkf0/h$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkf0/h$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkf0/h$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkf0/h$d;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lkf0/h$d;->w:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lkf0/h$d;->x:Lbc3/c0;

    new-instance v0, Lkf0/h$d$a;

    iget-object v1, p0, Lkf0/h$d;->y:Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;

    iget-object v2, p0, Lkf0/h$d;->z:Ll1/w3;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lkf0/h$d$a;-><init>(Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Ll1/w3;Lq83/d;)V

    const/4 v1, 0x3

    invoke-static {p1, v3, v3, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
