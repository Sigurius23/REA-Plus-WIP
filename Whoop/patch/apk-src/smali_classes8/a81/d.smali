.class public final synthetic La81/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/design/models/modal/DialogModel;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lfi0/a;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/models/modal/DialogModel;Lkotlin/jvm/functions/Function1;Lfi0/a;I)V
    .locals 0

    iput p4, p0, La81/d;->w:I

    iput-object p1, p0, La81/d;->x:Lcom/whoop/design/models/modal/DialogModel;

    iput-object p2, p0, La81/d;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, La81/d;->z:Lfi0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, La81/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La81/d;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, La81/d;->z:Lfi0/a;

    iget-object v2, p0, La81/d;->x:Lcom/whoop/design/models/modal/DialogModel;

    invoke-static {v2, v0, v1}, La81/o;->m(Lcom/whoop/design/models/modal/DialogModel;Lkotlin/jvm/functions/Function1;Lfi0/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, La81/d;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, La81/d;->z:Lfi0/a;

    iget-object v2, p0, La81/d;->x:Lcom/whoop/design/models/modal/DialogModel;

    invoke-static {v2, v0, v1}, La81/o;->r(Lcom/whoop/design/models/modal/DialogModel;Lkotlin/jvm/functions/Function1;Lfi0/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
