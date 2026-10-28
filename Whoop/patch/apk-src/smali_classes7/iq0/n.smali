.class public final synthetic Liq0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Liq0/n;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Liq0/n;->w:I

    check-cast p1, Ljava/lang/String;

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Liq0/m;->y(Ljava/lang/String;)Lio/getstream/chat/android/models/Attachment;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p1}, Liq0/m$n;->h(Ljava/lang/String;)Lio/getstream/chat/android/models/Attachment;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
