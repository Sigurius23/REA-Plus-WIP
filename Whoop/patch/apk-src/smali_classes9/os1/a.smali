.class public final synthetic Los1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj/b;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p2, p0, Los1/a;->w:I

    iput-object p1, p0, Los1/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Los1/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Los1/a;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/util/List;

    invoke-static {p1, v0}, Los1/b;->b(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Los1/a;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lj/a;

    invoke-static {v0, p1}, Los1/b;->a(Lkotlin/jvm/functions/Function1;Lj/a;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
