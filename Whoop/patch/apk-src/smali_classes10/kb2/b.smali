.class public final synthetic Lkb2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/settings/gifthub/GiftHubFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/settings/gifthub/GiftHubFragment;I)V
    .locals 0

    iput p2, p0, Lkb2/b;->w:I

    iput-object p1, p0, Lkb2/b;->x:Lcom/whoop/settings/gifthub/GiftHubFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lkb2/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lkb2/b;->x:Lcom/whoop/settings/gifthub/GiftHubFragment;

    check-cast p1, Lpb2/a;

    invoke-static {v0, p1}, Lcom/whoop/settings/gifthub/GiftHubFragment;->y(Lcom/whoop/settings/gifthub/GiftHubFragment;Lpb2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lkb2/b;->x:Lcom/whoop/settings/gifthub/GiftHubFragment;

    check-cast p1, Lqb2/d;

    invoke-static {v0, p1}, Lcom/whoop/settings/gifthub/GiftHubFragment;->A(Lcom/whoop/settings/gifthub/GiftHubFragment;Lqb2/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
