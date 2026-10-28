.class public final synthetic La81/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/design/models/modal/BottomSheet;

.field public final synthetic y:Lcom/whoop/design/models/modal/ModalAnalyticEventModel;

.field public final synthetic z:Lfi0/a;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/models/modal/BottomSheet;Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p5, p0, La81/m;->w:I

    iput-object p1, p0, La81/m;->x:Lcom/whoop/design/models/modal/BottomSheet;

    iput-object p2, p0, La81/m;->y:Lcom/whoop/design/models/modal/ModalAnalyticEventModel;

    iput-object p3, p0, La81/m;->z:Lfi0/a;

    iput-object p4, p0, La81/m;->E:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, La81/m;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La81/m;->z:Lfi0/a;

    iget-object v1, p0, La81/m;->E:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, La81/m;->x:Lcom/whoop/design/models/modal/BottomSheet;

    iget-object v3, p0, La81/m;->y:Lcom/whoop/design/models/modal/ModalAnalyticEventModel;

    invoke-static {v2, v3, v0, v1}, La81/o;->u(Lcom/whoop/design/models/modal/BottomSheet;Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, La81/m;->z:Lfi0/a;

    iget-object v1, p0, La81/m;->E:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, La81/m;->x:Lcom/whoop/design/models/modal/BottomSheet;

    iget-object v3, p0, La81/m;->y:Lcom/whoop/design/models/modal/ModalAnalyticEventModel;

    invoke-static {v2, v3, v0, v1}, La81/o;->t(Lcom/whoop/design/models/modal/BottomSheet;Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
