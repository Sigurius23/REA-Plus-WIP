.class public final synthetic Lsl0/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/m;


# direct methods
.method public synthetic constructor <init>(ILc93/m;)V
    .locals 0

    iput p1, p0, Lsl0/c0;->w:I

    iput-object p2, p0, Lsl0/c0;->x:Lc93/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lsl0/c0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/String;

    check-cast p2, Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    iget-object v0, p0, Lsl0/c0;->x:Lc93/m;

    invoke-static {v0, p1, p2}, Lsl0/u0;->j(Lc93/m;Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiMessageFeedback;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lsl0/c0;->x:Lc93/m;

    invoke-static {v0, p1, p2}, Lsl0/e0;->d(Lc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
