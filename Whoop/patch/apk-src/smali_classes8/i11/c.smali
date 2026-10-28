.class public final synthetic Li11/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lcom/whoop/navigation/models/GenericInteraction;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;I)V
    .locals 0

    iput p4, p0, Li11/c;->w:I

    iput-object p1, p0, Li11/c;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Li11/c;->y:Lcom/whoop/navigation/models/GenericInteraction;

    iput-object p3, p0, Li11/c;->z:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Li11/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Li11/c;->y:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v1, p0, Li11/c;->z:Ljava/lang/String;

    iget-object v2, p0, Li11/c;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1}, Li11/e;->c(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Li11/c;->y:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v1, p0, Li11/c;->z:Ljava/lang/String;

    iget-object v2, p0, Li11/c;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1}, Li11/e;->g(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
