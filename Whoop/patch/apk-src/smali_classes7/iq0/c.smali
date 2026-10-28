.class public final synthetic Liq0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Liq0/d;


# direct methods
.method public synthetic constructor <init>(Liq0/d;I)V
    .locals 0

    iput p2, p0, Liq0/c;->w:I

    iput-object p1, p0, Liq0/c;->x:Liq0/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Liq0/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Liq0/c;->x:Liq0/d;

    check-cast p1, Lio/getstream/chat/android/models/Command;

    invoke-static {v0, p1}, Liq0/d;->a(Liq0/d;Lio/getstream/chat/android/models/Command;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Liq0/c;->x:Liq0/d;

    check-cast p1, Lio/getstream/chat/android/models/User;

    invoke-static {v0, p1}, Liq0/d;->b(Liq0/d;Lio/getstream/chat/android/models/User;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
