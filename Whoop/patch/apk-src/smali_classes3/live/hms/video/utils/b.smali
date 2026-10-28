.class public final synthetic Llive/hms/video/utils/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p2, p0, Llive/hms/video/utils/b;->w:I

    iput-object p1, p0, Llive/hms/video/utils/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget v0, p0, Llive/hms/video/utils/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llive/hms/video/utils/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Llive/hms/video/utils/HMSCoroutineScope;->c(Lkotlin/jvm/functions/Function1;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Llive/hms/video/utils/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Llive/hms/video/utils/HMSCoroutineScope;->b(Lkotlin/jvm/functions/Function1;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
