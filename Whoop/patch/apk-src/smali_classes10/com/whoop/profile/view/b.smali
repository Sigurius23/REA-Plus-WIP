.class public final synthetic Lcom/whoop/profile/view/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p3, p0, Lcom/whoop/profile/view/b;->w:I

    iput-object p1, p0, Lcom/whoop/profile/view/b;->x:Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;

    iput-object p2, p0, Lcom/whoop/profile/view/b;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/whoop/profile/view/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/whoop/profile/view/b;->x:Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;

    iget-object v1, p0, Lcom/whoop/profile/view/b;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lcom/whoop/profile/view/ProfileFullScreenModalKt;->g(Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/profile/view/b;->x:Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;

    iget-object v1, p0, Lcom/whoop/profile/view/b;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lcom/whoop/profile/view/ProfileFullScreenModalKt;->e(Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lcom/whoop/profile/view/b;->x:Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;

    iget-object v1, p0, Lcom/whoop/profile/view/b;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lcom/whoop/profile/view/ProfileFullScreenModalKt;->h(Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
