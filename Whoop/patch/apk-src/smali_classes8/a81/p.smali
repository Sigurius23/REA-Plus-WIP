.class public final synthetic La81/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/design/models/modal/ModalAnalyticEventModel;

.field public final synthetic y:Lfi0/a;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p4, p0, La81/p;->w:I

    iput-object p1, p0, La81/p;->x:Lcom/whoop/design/models/modal/ModalAnalyticEventModel;

    iput-object p2, p0, La81/p;->y:Lfi0/a;

    iput-object p3, p0, La81/p;->z:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, La81/p;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La81/p;->z:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lri0/b;

    iget-object v1, p0, La81/p;->x:Lcom/whoop/design/models/modal/ModalAnalyticEventModel;

    iget-object v2, p0, La81/p;->y:Lfi0/a;

    invoke-static {v1, v2, v0, p1}, Lvi0/a;->c(Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Lkotlin/jvm/functions/Function1;Lri0/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, La81/p;->z:Lkotlin/jvm/functions/Function1;

    check-cast p1, La81/t;

    iget-object v1, p0, La81/p;->x:Lcom/whoop/design/models/modal/ModalAnalyticEventModel;

    iget-object v2, p0, La81/p;->y:Lfi0/a;

    invoke-static {v1, v2, v0, p1}, La81/r;->d(Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Lkotlin/jvm/functions/Function1;La81/t;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
