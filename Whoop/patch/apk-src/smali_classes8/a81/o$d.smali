.class final synthetic La81/o$d;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La81/o;->T(Lcom/whoop/design/models/modal/BottomSheet;Lkotlin/jvm/functions/Function1;Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic w:Lcom/whoop/design/models/modal/ModalAnalyticEventModel;

.field final synthetic x:Lfi0/a;

.field final synthetic y:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic z:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Lkotlin/jvm/functions/Function1;Lc93/a;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/modal/ModalAnalyticEventModel;",
            "Lfi0/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, La81/o$d;->w:Lcom/whoop/design/models/modal/ModalAnalyticEventModel;

    iput-object p2, p0, La81/o$d;->x:Lfi0/a;

    iput-object p3, p0, La81/o$d;->y:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, La81/o$d;->z:Lc93/a;

    const-string v4, "RenderBottomSheet$dismissByUser(Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lcom/whoop/analytics/BaseAnalytics;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V"

    const/4 v5, 0x0

    const/4 v1, 0x0

    const-class v2, Lkotlin/jvm/internal/j;

    const-string v3, "dismissByUser"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, La81/o$d;->invoke()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    iget-object v0, p0, La81/o$d;->w:Lcom/whoop/design/models/modal/ModalAnalyticEventModel;

    iget-object v1, p0, La81/o$d;->x:Lfi0/a;

    iget-object v2, p0, La81/o$d;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, La81/o$d;->z:Lc93/a;

    invoke-static {v0, v1, v2, v3}, La81/o;->c0(Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Lkotlin/jvm/functions/Function1;Lc93/a;)V

    return-void
.end method
