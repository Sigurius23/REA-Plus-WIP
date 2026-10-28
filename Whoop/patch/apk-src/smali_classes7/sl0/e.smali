.class public final synthetic Lsl0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p2, p0, Lsl0/e;->w:I

    iput-object p1, p0, Lsl0/e;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lsl0/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsl0/e;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, p1}, Lsl0/o0;->h(Lkotlin/jvm/functions/Function1;Landroid/net/Uri;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lsl0/e;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, p1}, Lsl0/p;->g(Lkotlin/jvm/functions/Function1;Landroid/net/Uri;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lsl0/e;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lg2/v;

    invoke-static {v0, p1}, Lsl0/i;->n(Lkotlin/jvm/functions/Function1;Lg2/v;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
