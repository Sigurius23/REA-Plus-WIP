.class public final synthetic Lep1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lz1/p;


# direct methods
.method public synthetic constructor <init>(Lz1/p;I)V
    .locals 0

    iput p2, p0, Lep1/f;->w:I

    iput-object p1, p0, Lep1/f;->x:Lz1/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lep1/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lep1/f;->x:Lz1/p;

    check-cast p1, Lcom/whoop/bot/models/feedback/FeedbackReason;

    invoke-static {v0, p1}, Lgh0/e;->e(Lz1/p;Lcom/whoop/bot/models/feedback/FeedbackReason;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lep1/f;->x:Lz1/p;

    invoke-static {v0, p1}, Lep1/h;->b(Lz1/p;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
