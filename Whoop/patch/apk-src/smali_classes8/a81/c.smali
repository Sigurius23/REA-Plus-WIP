.class public final synthetic La81/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/design/models/modal/ModalAnalyticEventModel;

.field public final synthetic y:Lfi0/a;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p4, p0, La81/c;->w:I

    iput-object p1, p0, La81/c;->x:Lcom/whoop/design/models/modal/ModalAnalyticEventModel;

    iput-object p2, p0, La81/c;->y:Lfi0/a;

    iput-object p3, p0, La81/c;->z:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, La81/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La81/c;->y:Lfi0/a;

    iget-object v1, p0, La81/c;->z:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, La81/c;->x:Lcom/whoop/design/models/modal/ModalAnalyticEventModel;

    invoke-static {v2, v0, v1}, La81/o;->k(Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, La81/c;->y:Lfi0/a;

    iget-object v1, p0, La81/c;->z:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, La81/c;->x:Lcom/whoop/design/models/modal/ModalAnalyticEventModel;

    invoke-static {v2, v0, v1}, La81/o;->l(Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, La81/c;->y:Lfi0/a;

    iget-object v1, p0, La81/c;->z:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, La81/c;->x:Lcom/whoop/design/models/modal/ModalAnalyticEventModel;

    invoke-static {v2, v0, v1}, La81/o;->s(Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
